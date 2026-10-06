package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tescand_impl extends GXDataArea
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
      gxfirstwebparm = httpContext.GetNextPar( ) ;
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_5") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_5( A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_6") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A910Workstat = httpContext.GetPar( "Workstat") ;
         httpContext.ajax_rsp_assign_attri("", false, "A910Workstat", A910Workstat);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_6( A396EmprCod, A910Workstat) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_8") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A719PrdNum = httpContext.GetPar( "PrdNum") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_8( A396EmprCod, A719PrdNum) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_9") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A764ProForCod = httpContext.GetPar( "ProForCod") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_9( A396EmprCod, A764ProForCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_10") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A490ForPrdUMe = (byte)(GXutil.lval( httpContext.GetPar( "ForPrdUMe"))) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_10( A396EmprCod, A490ForPrdUMe) ;
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
         gxfirstwebparm = httpContext.GetNextPar( ) ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
      {
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxfirstwebparm = httpContext.GetNextPar( ) ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Gridlevel_level1") == 0 )
      {
         gxnrgridlevel_level1_newrow_invoke( ) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "SIMULACION COSTE FORMULA II", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public void gxnrgridlevel_level1_newrow_invoke( )
   {
      nRC_GXsfl_89 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_89"))) ;
      nGXsfl_89_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_89_idx"))) ;
      sGXsfl_89_idx = httpContext.GetPar( "sGXsfl_89_idx") ;
      Gx_mode = httpContext.GetPar( "Mode") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgridlevel_level1_newrow( ) ;
      /* End function gxnrGridlevel_level1_newrow_invoke */
   }

   public tescand_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tescand_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tescand_impl.class ));
   }

   public tescand_impl( int remoteHandle ,
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-9 col-lg-6", "left", "top", "", "", "div");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell ExtendedComboCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTablesplittedemprcod_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockemprcod_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblockemprcod_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_FormulacionTinte\\TESCAND.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-9", "left", "top", "", "", "div");
      /* User Defined Control */
      ucCombo_emprcod.setProperty("Caption", Combo_emprcod_Caption);
      ucCombo_emprcod.setProperty("Cls", Combo_emprcod_Cls);
      ucCombo_emprcod.setProperty("DataListProc", Combo_emprcod_Datalistproc);
      ucCombo_emprcod.setProperty("DataListProcParametersPrefix", Combo_emprcod_Datalistprocparametersprefix);
      ucCombo_emprcod.setProperty("EmptyItem", Combo_emprcod_Emptyitem);
      ucCombo_emprcod.setProperty("DropDownOptionsTitleSettingsIcons", AV52DDO_TitleSettingsIcons);
      ucCombo_emprcod.setProperty("DropDownOptionsData", AV59EmprCod_Data);
      ucCombo_emprcod.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_emprcod_Internalname, "COMBO_EMPRCODContainer");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 Invisible", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtEmprCod_Internalname, httpContext.getMessage( "Empresa", ""), "col-sm-3 AttributeLabel", 0, true, "");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 28,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,28);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\TESCAND.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtWorkstat_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtWorkstat_Internalname, httpContext.getMessage( "Work station", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 33,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtWorkstat_Internalname, GXutil.rtrim( A910Workstat), GXutil.rtrim( localUtil.format( A910Workstat, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,33);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtWorkstat_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtWorkstat_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\TESCAND.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtEmprNom_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtEmprNom_Internalname, httpContext.getMessage( "Nombre", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\TESCAND.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtEscMTxt1_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtEscMTxt1_Internalname, httpContext.getMessage( "Linea texto 1", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 43,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEscMTxt1_Internalname, GXutil.rtrim( A881EscMTxt1), GXutil.rtrim( localUtil.format( A881EscMTxt1, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,43);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEscMTxt1_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtEscMTxt1_Enabled, 0, "text", "", 60, "chr", 1, "row", 60, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\TESCAND.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtEscMTxt2_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtEscMTxt2_Internalname, httpContext.getMessage( "Linea Texto 2", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 48,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEscMTxt2_Internalname, GXutil.rtrim( A882EscMTxt2), GXutil.rtrim( localUtil.format( A882EscMTxt2, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,48);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEscMTxt2_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtEscMTxt2_Enabled, 0, "text", "", 60, "chr", 1, "row", 60, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\TESCAND.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtEscMInc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtEscMInc_Internalname, httpContext.getMessage( "Incremento precio", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEscMInc_Internalname, GXutil.ltrim( localUtil.ntoc( A883EscMInc, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEscMInc_Enabled!=0) ? localUtil.format( A883EscMInc, "Z9.99") : localUtil.format( A883EscMInc, "Z9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,53);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEscMInc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtEscMInc_Enabled, 0, "text", "", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\TESCAND.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtEscMKgm_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtEscMKgm_Internalname, httpContext.getMessage( "Kgm formula", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 58,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEscMKgm_Internalname, GXutil.ltrim( localUtil.ntoc( A884EscMKgm, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEscMKgm_Enabled!=0) ? localUtil.format( A884EscMKgm, "ZZZZZZ9.99") : localUtil.format( A884EscMKgm, "ZZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,58);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEscMKgm_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtEscMKgm_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\TESCAND.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtEscMVol_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtEscMVol_Internalname, httpContext.getMessage( "Volumen formula", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 63,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEscMVol_Internalname, GXutil.ltrim( localUtil.ntoc( A885EscMVol, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEscMVol_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A885EscMVol), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A885EscMVol), "ZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,63);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEscMVol_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtEscMVol_Enabled, 0, "text", "1", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\TESCAND.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtEscMUltLin_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtEscMUltLin_Internalname, httpContext.getMessage( "Ultima linea", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 68,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEscMUltLin_Internalname, GXutil.ltrim( localUtil.ntoc( A886EscMUltLin, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEscMUltLin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A886EscMUltLin), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A886EscMUltLin), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,68);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEscMUltLin_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtEscMUltLin_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\TESCAND.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtEscMValCos_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtEscMValCos_Internalname, httpContext.getMessage( "EscMValCos", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 73,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEscMValCos_Internalname, GXutil.ltrim( localUtil.ntoc( A896EscMValCos, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEscMValCos_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A896EscMValCos), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A896EscMValCos), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,73);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEscMValCos_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtEscMValCos_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\TESCAND.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtEmpNumDec_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtEmpNumDec_Internalname, httpContext.getMessage( "EmpNumDec", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmpNumDec_Internalname, GXutil.ltrim( localUtil.ntoc( A3915EmpNumDec, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEmpNumDec_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3915EmpNumDec), "9") : localUtil.format( DecimalUtil.doubleToDec(A3915EmpNumDec), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmpNumDec_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtEmpNumDec_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\TESCAND.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtEscMCosT_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtEscMCosT_Internalname, httpContext.getMessage( "Coste total", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEscMCosT_Internalname, GXutil.ltrim( localUtil.ntoc( A893EscMCosT, (byte)(15), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEscMCosT_Enabled!=0) ? localUtil.format( A893EscMCosT, "ZZZZZZZZ9.99999") : localUtil.format( A893EscMCosT, "ZZZZZZZZ9.99999"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEscMCosT_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtEscMCosT_Enabled, 0, "text", "", 15, "chr", 1, "row", 15, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\TESCAND.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-9 col-lg-6 CellMarginTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTableleaflevel_level1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 SectionGrid EditableGridCell_LinedAtts", "left", "top", "", "", "div");
      gxdraw_gridlevel_level1( ) ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 118,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\TESCAND.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 120,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\TESCAND.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 122,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\TESCAND.htm");
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
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divSectionattribute_emprcod_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavComboemprcod_Internalname, GXutil.rtrim( AV60ComboEmprCod), GXutil.rtrim( localUtil.format( AV60ComboEmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavComboemprcod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavComboemprcod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\TESCAND.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* User Defined Control */
      ucCombo_prdnum.setProperty("Caption", Combo_prdnum_Caption);
      ucCombo_prdnum.setProperty("Cls", Combo_prdnum_Cls);
      ucCombo_prdnum.setProperty("IsGridItem", Combo_prdnum_Isgriditem);
      ucCombo_prdnum.setProperty("HasDescription", Combo_prdnum_Hasdescription);
      ucCombo_prdnum.setProperty("DataListProc", Combo_prdnum_Datalistproc);
      ucCombo_prdnum.setProperty("DropDownOptionsTitleSettingsIcons", AV52DDO_TitleSettingsIcons);
      ucCombo_prdnum.setProperty("DropDownOptionsData", AV51PrdNum_Data);
      ucCombo_prdnum.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_prdnum_Internalname, "COMBO_PRDNUMContainer");
      /* User Defined Control */
      ucCombo_proforcod.setProperty("Caption", Combo_proforcod_Caption);
      ucCombo_proforcod.setProperty("Cls", Combo_proforcod_Cls);
      ucCombo_proforcod.setProperty("IsGridItem", Combo_proforcod_Isgriditem);
      ucCombo_proforcod.setProperty("HasDescription", Combo_proforcod_Hasdescription);
      ucCombo_proforcod.setProperty("DataListProc", Combo_proforcod_Datalistproc);
      ucCombo_proforcod.setProperty("DropDownOptionsTitleSettingsIcons", AV52DDO_TitleSettingsIcons);
      ucCombo_proforcod.setProperty("DropDownOptionsData", AV57ProForCod_Data);
      ucCombo_proforcod.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_proforcod_Internalname, "COMBO_PROFORCODContainer");
      /* User Defined Control */
      ucCombo_forprdume.setProperty("Caption", Combo_forprdume_Caption);
      ucCombo_forprdume.setProperty("Cls", Combo_forprdume_Cls);
      ucCombo_forprdume.setProperty("IsGridItem", Combo_forprdume_Isgriditem);
      ucCombo_forprdume.setProperty("HasDescription", Combo_forprdume_Hasdescription);
      ucCombo_forprdume.setProperty("DataListProc", Combo_forprdume_Datalistproc);
      ucCombo_forprdume.setProperty("DropDownOptionsTitleSettingsIcons", AV52DDO_TitleSettingsIcons);
      ucCombo_forprdume.setProperty("DropDownOptionsData", AV58ForPrdUMe_Data);
      ucCombo_forprdume.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_forprdume_Internalname, "COMBO_FORPRDUMEContainer");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
   }

   public void gxdraw_gridlevel_level1( )
   {
      /*  Grid Control  */
      startgridcontrol89( ) ;
      nGXsfl_89_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount120 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_120 = (short)(1) ;
            scanStart2W120( ) ;
            while ( RcdFound120 != 0 )
            {
               init_level_properties120( ) ;
               getByPrimaryKey2W120( ) ;
               addRow2W120( ) ;
               scanNext2W120( ) ;
            }
            scanEnd2W120( ) ;
            nBlankRcdCount120 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B893EscMCosT = A893EscMCosT ;
         n893EscMCosT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A893EscMCosT", GXutil.ltrimstr( A893EscMCosT, 15, 5));
         standaloneNotModal2W120( ) ;
         standaloneModal2W120( ) ;
         sMode120 = Gx_mode ;
         while ( nGXsfl_89_idx < nRC_GXsfl_89 )
         {
            bGXsfl_89_Refreshing = true ;
            readRow2W120( ) ;
            edtEscMLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ESCMLIN_"+sGXsfl_89_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtEscMLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEscMLin_Enabled), 5, 0), !bGXsfl_89_Refreshing);
            edtPrdNum_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDNUM_"+sGXsfl_89_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Enabled), 5, 0), !bGXsfl_89_Refreshing);
            edtPrdNom_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDNOM_"+sGXsfl_89_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPrdNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNom_Enabled), 5, 0), !bGXsfl_89_Refreshing);
            edtPrdPreAct_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDPREACT_"+sGXsfl_89_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPrdPreAct_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdPreAct_Enabled), 5, 0), !bGXsfl_89_Refreshing);
            edtProForCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROFORCOD_"+sGXsfl_89_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtProForCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForCod_Enabled), 5, 0), !bGXsfl_89_Refreshing);
            edtProForDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROFORDSC_"+sGXsfl_89_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtProForDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForDsc_Enabled), 5, 0), !bGXsfl_89_Refreshing);
            edtEscMDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ESCMDSC_"+sGXsfl_89_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtEscMDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEscMDsc_Enabled), 5, 0), !bGXsfl_89_Refreshing);
            edtEscMPrdPre_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ESCMPRDPRE_"+sGXsfl_89_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtEscMPrdPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEscMPrdPre_Enabled), 5, 0), !bGXsfl_89_Refreshing);
            edtEscMCan_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ESCMCAN_"+sGXsfl_89_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtEscMCan_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEscMCan_Enabled), 5, 0), !bGXsfl_89_Refreshing);
            edtForPrdUMe_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FORPRDUME_"+sGXsfl_89_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtForPrdUMe_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForPrdUMe_Enabled), 5, 0), !bGXsfl_89_Refreshing);
            edtForPrdDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FORPRDDSC_"+sGXsfl_89_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtForPrdDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForPrdDsc_Enabled), 5, 0), !bGXsfl_89_Refreshing);
            edtEscMCos_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ESCMCOS_"+sGXsfl_89_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtEscMCos_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEscMCos_Enabled), 5, 0), !bGXsfl_89_Refreshing);
            edtEscMCosL_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ESCMCOSL_"+sGXsfl_89_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtEscMCosL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEscMCosL_Enabled), 5, 0), !bGXsfl_89_Refreshing);
            edtEscMCliCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ESCMCLICOD_"+sGXsfl_89_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtEscMCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEscMCliCod_Enabled), 5, 0), !bGXsfl_89_Refreshing);
            edtEscMArtCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ESCMARTCOD_"+sGXsfl_89_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtEscMArtCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEscMArtCod_Enabled), 5, 0), !bGXsfl_89_Refreshing);
            edtEscMMdlCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ESCMMDLCOD_"+sGXsfl_89_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtEscMMdlCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEscMMdlCod_Enabled), 5, 0), !bGXsfl_89_Refreshing);
            edtEscMProCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ESCMPROCOD_"+sGXsfl_89_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtEscMProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEscMProCod_Enabled), 5, 0), !bGXsfl_89_Refreshing);
            edtEscMFasCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ESCMFASCOD_"+sGXsfl_89_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtEscMFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEscMFasCod_Enabled), 5, 0), !bGXsfl_89_Refreshing);
            edtEscMFacCon_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ESCMFACCON_"+sGXsfl_89_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtEscMFacCon_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEscMFacCon_Enabled), 5, 0), !bGXsfl_89_Refreshing);
            edtEscMRb_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ESCMRB_"+sGXsfl_89_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtEscMRb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEscMRb_Enabled), 5, 0), !bGXsfl_89_Refreshing);
            edtEscSol_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ESCSOL_"+sGXsfl_89_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtEscSol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEscSol_Enabled), 5, 0), !bGXsfl_89_Refreshing);
            edtEscVolm_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ESCVOLM_"+sGXsfl_89_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtEscVolm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEscVolm_Enabled), 5, 0), !bGXsfl_89_Refreshing);
            edtEscOrdn_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ESCORDN_"+sGXsfl_89_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtEscOrdn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEscOrdn_Enabled), 5, 0), !bGXsfl_89_Refreshing);
            edtEscMCant_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ESCMCANT_"+sGXsfl_89_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtEscMCant_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEscMCant_Enabled), 5, 0), !bGXsfl_89_Refreshing);
            if ( ( nRcdExists_120 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal2W120( ) ;
            }
            sendRow2W120( ) ;
            bGXsfl_89_Refreshing = false ;
         }
         Gx_mode = sMode120 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A893EscMCosT = B893EscMCosT ;
         n893EscMCosT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A893EscMCosT", GXutil.ltrimstr( A893EscMCosT, 15, 5));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount120 = (short)(5) ;
         nRcdExists_120 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart2W120( ) ;
            while ( RcdFound120 != 0 )
            {
               sGXsfl_89_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_89_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_89120( ) ;
               init_level_properties120( ) ;
               standaloneNotModal2W120( ) ;
               getByPrimaryKey2W120( ) ;
               standaloneModal2W120( ) ;
               addRow2W120( ) ;
               scanNext2W120( ) ;
            }
            scanEnd2W120( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode120 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_89_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_89_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_89120( ) ;
      initAll2W120( ) ;
      init_level_properties120( ) ;
      B893EscMCosT = A893EscMCosT ;
      n893EscMCosT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A893EscMCosT", GXutil.ltrimstr( A893EscMCosT, 15, 5));
      nRcdExists_120 = (short)(0) ;
      nIsMod_120 = (short)(0) ;
      nRcdDeleted_120 = (short)(0) ;
      nBlankRcdCount120 = (short)(nBlankRcdUsr120+nBlankRcdCount120) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount120 > 0 )
      {
         standaloneNotModal2W120( ) ;
         standaloneModal2W120( ) ;
         addRow2W120( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtEscMLin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount120 = (short)(nBlankRcdCount120-1) ;
      }
      Gx_mode = sMode120 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      A893EscMCosT = B893EscMCosT ;
      n893EscMCosT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A893EscMCosT", GXutil.ltrimstr( A893EscMCosT, 15, 5));
      sStyleString = "" ;
      httpContext.writeText( "<div id=\""+"Gridlevel_level1Container"+"Div\" "+sStyleString+">"+"</div>") ;
      httpContext.ajax_rsp_assign_grid("_"+"Gridlevel_level1", Gridlevel_level1Container, subGridlevel_level1_Internalname);
      if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridlevel_level1ContainerData", Gridlevel_level1Container.ToJavascriptSource());
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridlevel_level1ContainerData"+"V", Gridlevel_level1Container.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Gridlevel_level1ContainerData"+"V"+"\" value='"+Gridlevel_level1Container.GridValuesHidden()+"'/>") ;
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
      e112W2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV52DDO_TitleSettingsIcons);
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vEMPRCOD_DATA"), AV59EmprCod_Data);
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vPRDNUM_DATA"), AV51PrdNum_Data);
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vPROFORCOD_DATA"), AV57ProForCod_Data);
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vFORPRDUME_DATA"), AV58ForPrdUMe_Data);
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z910Workstat = httpContext.cgiGet( "Z910Workstat") ;
            Z881EscMTxt1 = httpContext.cgiGet( "Z881EscMTxt1") ;
            Z882EscMTxt2 = httpContext.cgiGet( "Z882EscMTxt2") ;
            Z883EscMInc = localUtil.ctond( httpContext.cgiGet( "Z883EscMInc")) ;
            Z884EscMKgm = localUtil.ctond( httpContext.cgiGet( "Z884EscMKgm")) ;
            Z885EscMVol = (int)(localUtil.ctol( httpContext.cgiGet( "Z885EscMVol"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z886EscMUltLin = (int)(localUtil.ctol( httpContext.cgiGet( "Z886EscMUltLin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z896EscMValCos = (int)(localUtil.ctol( httpContext.cgiGet( "Z896EscMValCos"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            O893EscMCosT = localUtil.ctond( httpContext.cgiGet( "O893EscMCosT")) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_89 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_89"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_emprcod_Objectcall = httpContext.cgiGet( "COMBO_EMPRCOD_Objectcall") ;
            Combo_emprcod_Class = httpContext.cgiGet( "COMBO_EMPRCOD_Class") ;
            Combo_emprcod_Icontype = httpContext.cgiGet( "COMBO_EMPRCOD_Icontype") ;
            Combo_emprcod_Icon = httpContext.cgiGet( "COMBO_EMPRCOD_Icon") ;
            Combo_emprcod_Caption = httpContext.cgiGet( "COMBO_EMPRCOD_Caption") ;
            Combo_emprcod_Tooltip = httpContext.cgiGet( "COMBO_EMPRCOD_Tooltip") ;
            Combo_emprcod_Cls = httpContext.cgiGet( "COMBO_EMPRCOD_Cls") ;
            Combo_emprcod_Selectedvalue_set = httpContext.cgiGet( "COMBO_EMPRCOD_Selectedvalue_set") ;
            Combo_emprcod_Selectedvalue_get = httpContext.cgiGet( "COMBO_EMPRCOD_Selectedvalue_get") ;
            Combo_emprcod_Selectedtext_set = httpContext.cgiGet( "COMBO_EMPRCOD_Selectedtext_set") ;
            Combo_emprcod_Selectedtext_get = httpContext.cgiGet( "COMBO_EMPRCOD_Selectedtext_get") ;
            Combo_emprcod_Gamoauthtoken = httpContext.cgiGet( "COMBO_EMPRCOD_Gamoauthtoken") ;
            Combo_emprcod_Ddointernalname = httpContext.cgiGet( "COMBO_EMPRCOD_Ddointernalname") ;
            Combo_emprcod_Titlecontrolalign = httpContext.cgiGet( "COMBO_EMPRCOD_Titlecontrolalign") ;
            Combo_emprcod_Dropdownoptionstype = httpContext.cgiGet( "COMBO_EMPRCOD_Dropdownoptionstype") ;
            Combo_emprcod_Enabled = GXutil.strtobool( httpContext.cgiGet( "COMBO_EMPRCOD_Enabled")) ;
            Combo_emprcod_Visible = GXutil.strtobool( httpContext.cgiGet( "COMBO_EMPRCOD_Visible")) ;
            Combo_emprcod_Titlecontrolidtoreplace = httpContext.cgiGet( "COMBO_EMPRCOD_Titlecontrolidtoreplace") ;
            Combo_emprcod_Datalisttype = httpContext.cgiGet( "COMBO_EMPRCOD_Datalisttype") ;
            Combo_emprcod_Allowmultipleselection = GXutil.strtobool( httpContext.cgiGet( "COMBO_EMPRCOD_Allowmultipleselection")) ;
            Combo_emprcod_Datalistfixedvalues = httpContext.cgiGet( "COMBO_EMPRCOD_Datalistfixedvalues") ;
            Combo_emprcod_Isgriditem = GXutil.strtobool( httpContext.cgiGet( "COMBO_EMPRCOD_Isgriditem")) ;
            Combo_emprcod_Hasdescription = GXutil.strtobool( httpContext.cgiGet( "COMBO_EMPRCOD_Hasdescription")) ;
            Combo_emprcod_Datalistproc = httpContext.cgiGet( "COMBO_EMPRCOD_Datalistproc") ;
            Combo_emprcod_Datalistprocparametersprefix = httpContext.cgiGet( "COMBO_EMPRCOD_Datalistprocparametersprefix") ;
            Combo_emprcod_Remoteservicesparameters = httpContext.cgiGet( "COMBO_EMPRCOD_Remoteservicesparameters") ;
            Combo_emprcod_Datalistupdateminimumcharacters = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_EMPRCOD_Datalistupdateminimumcharacters"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_emprcod_Includeonlyselectedoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_EMPRCOD_Includeonlyselectedoption")) ;
            Combo_emprcod_Includeselectalloption = GXutil.strtobool( httpContext.cgiGet( "COMBO_EMPRCOD_Includeselectalloption")) ;
            Combo_emprcod_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_EMPRCOD_Emptyitem")) ;
            Combo_emprcod_Includeaddnewoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_EMPRCOD_Includeaddnewoption")) ;
            Combo_emprcod_Htmltemplate = httpContext.cgiGet( "COMBO_EMPRCOD_Htmltemplate") ;
            Combo_emprcod_Multiplevaluestype = httpContext.cgiGet( "COMBO_EMPRCOD_Multiplevaluestype") ;
            Combo_emprcod_Loadingdata = httpContext.cgiGet( "COMBO_EMPRCOD_Loadingdata") ;
            Combo_emprcod_Noresultsfound = httpContext.cgiGet( "COMBO_EMPRCOD_Noresultsfound") ;
            Combo_emprcod_Emptyitemtext = httpContext.cgiGet( "COMBO_EMPRCOD_Emptyitemtext") ;
            Combo_emprcod_Onlyselectedvalues = httpContext.cgiGet( "COMBO_EMPRCOD_Onlyselectedvalues") ;
            Combo_emprcod_Selectalltext = httpContext.cgiGet( "COMBO_EMPRCOD_Selectalltext") ;
            Combo_emprcod_Multiplevaluesseparator = httpContext.cgiGet( "COMBO_EMPRCOD_Multiplevaluesseparator") ;
            Combo_emprcod_Addnewoptiontext = httpContext.cgiGet( "COMBO_EMPRCOD_Addnewoptiontext") ;
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
            Combo_prdnum_Objectcall = httpContext.cgiGet( "COMBO_PRDNUM_Objectcall") ;
            Combo_prdnum_Class = httpContext.cgiGet( "COMBO_PRDNUM_Class") ;
            Combo_prdnum_Icontype = httpContext.cgiGet( "COMBO_PRDNUM_Icontype") ;
            Combo_prdnum_Icon = httpContext.cgiGet( "COMBO_PRDNUM_Icon") ;
            Combo_prdnum_Caption = httpContext.cgiGet( "COMBO_PRDNUM_Caption") ;
            Combo_prdnum_Tooltip = httpContext.cgiGet( "COMBO_PRDNUM_Tooltip") ;
            Combo_prdnum_Cls = httpContext.cgiGet( "COMBO_PRDNUM_Cls") ;
            Combo_prdnum_Selectedvalue_set = httpContext.cgiGet( "COMBO_PRDNUM_Selectedvalue_set") ;
            Combo_prdnum_Selectedvalue_get = httpContext.cgiGet( "COMBO_PRDNUM_Selectedvalue_get") ;
            Combo_prdnum_Selectedtext_set = httpContext.cgiGet( "COMBO_PRDNUM_Selectedtext_set") ;
            Combo_prdnum_Selectedtext_get = httpContext.cgiGet( "COMBO_PRDNUM_Selectedtext_get") ;
            Combo_prdnum_Gamoauthtoken = httpContext.cgiGet( "COMBO_PRDNUM_Gamoauthtoken") ;
            Combo_prdnum_Ddointernalname = httpContext.cgiGet( "COMBO_PRDNUM_Ddointernalname") ;
            Combo_prdnum_Titlecontrolalign = httpContext.cgiGet( "COMBO_PRDNUM_Titlecontrolalign") ;
            Combo_prdnum_Dropdownoptionstype = httpContext.cgiGet( "COMBO_PRDNUM_Dropdownoptionstype") ;
            Combo_prdnum_Enabled = GXutil.strtobool( httpContext.cgiGet( "COMBO_PRDNUM_Enabled")) ;
            Combo_prdnum_Visible = GXutil.strtobool( httpContext.cgiGet( "COMBO_PRDNUM_Visible")) ;
            Combo_prdnum_Titlecontrolidtoreplace = httpContext.cgiGet( "COMBO_PRDNUM_Titlecontrolidtoreplace") ;
            Combo_prdnum_Datalisttype = httpContext.cgiGet( "COMBO_PRDNUM_Datalisttype") ;
            Combo_prdnum_Allowmultipleselection = GXutil.strtobool( httpContext.cgiGet( "COMBO_PRDNUM_Allowmultipleselection")) ;
            Combo_prdnum_Datalistfixedvalues = httpContext.cgiGet( "COMBO_PRDNUM_Datalistfixedvalues") ;
            Combo_prdnum_Isgriditem = GXutil.strtobool( httpContext.cgiGet( "COMBO_PRDNUM_Isgriditem")) ;
            Combo_prdnum_Hasdescription = GXutil.strtobool( httpContext.cgiGet( "COMBO_PRDNUM_Hasdescription")) ;
            Combo_prdnum_Datalistproc = httpContext.cgiGet( "COMBO_PRDNUM_Datalistproc") ;
            Combo_prdnum_Datalistprocparametersprefix = httpContext.cgiGet( "COMBO_PRDNUM_Datalistprocparametersprefix") ;
            Combo_prdnum_Remoteservicesparameters = httpContext.cgiGet( "COMBO_PRDNUM_Remoteservicesparameters") ;
            Combo_prdnum_Datalistupdateminimumcharacters = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_PRDNUM_Datalistupdateminimumcharacters"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_prdnum_Includeonlyselectedoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_PRDNUM_Includeonlyselectedoption")) ;
            Combo_prdnum_Includeselectalloption = GXutil.strtobool( httpContext.cgiGet( "COMBO_PRDNUM_Includeselectalloption")) ;
            Combo_prdnum_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_PRDNUM_Emptyitem")) ;
            Combo_prdnum_Includeaddnewoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_PRDNUM_Includeaddnewoption")) ;
            Combo_prdnum_Htmltemplate = httpContext.cgiGet( "COMBO_PRDNUM_Htmltemplate") ;
            Combo_prdnum_Multiplevaluestype = httpContext.cgiGet( "COMBO_PRDNUM_Multiplevaluestype") ;
            Combo_prdnum_Loadingdata = httpContext.cgiGet( "COMBO_PRDNUM_Loadingdata") ;
            Combo_prdnum_Noresultsfound = httpContext.cgiGet( "COMBO_PRDNUM_Noresultsfound") ;
            Combo_prdnum_Emptyitemtext = httpContext.cgiGet( "COMBO_PRDNUM_Emptyitemtext") ;
            Combo_prdnum_Onlyselectedvalues = httpContext.cgiGet( "COMBO_PRDNUM_Onlyselectedvalues") ;
            Combo_prdnum_Selectalltext = httpContext.cgiGet( "COMBO_PRDNUM_Selectalltext") ;
            Combo_prdnum_Multiplevaluesseparator = httpContext.cgiGet( "COMBO_PRDNUM_Multiplevaluesseparator") ;
            Combo_prdnum_Addnewoptiontext = httpContext.cgiGet( "COMBO_PRDNUM_Addnewoptiontext") ;
            Combo_proforcod_Objectcall = httpContext.cgiGet( "COMBO_PROFORCOD_Objectcall") ;
            Combo_proforcod_Class = httpContext.cgiGet( "COMBO_PROFORCOD_Class") ;
            Combo_proforcod_Icontype = httpContext.cgiGet( "COMBO_PROFORCOD_Icontype") ;
            Combo_proforcod_Icon = httpContext.cgiGet( "COMBO_PROFORCOD_Icon") ;
            Combo_proforcod_Caption = httpContext.cgiGet( "COMBO_PROFORCOD_Caption") ;
            Combo_proforcod_Tooltip = httpContext.cgiGet( "COMBO_PROFORCOD_Tooltip") ;
            Combo_proforcod_Cls = httpContext.cgiGet( "COMBO_PROFORCOD_Cls") ;
            Combo_proforcod_Selectedvalue_set = httpContext.cgiGet( "COMBO_PROFORCOD_Selectedvalue_set") ;
            Combo_proforcod_Selectedvalue_get = httpContext.cgiGet( "COMBO_PROFORCOD_Selectedvalue_get") ;
            Combo_proforcod_Selectedtext_set = httpContext.cgiGet( "COMBO_PROFORCOD_Selectedtext_set") ;
            Combo_proforcod_Selectedtext_get = httpContext.cgiGet( "COMBO_PROFORCOD_Selectedtext_get") ;
            Combo_proforcod_Gamoauthtoken = httpContext.cgiGet( "COMBO_PROFORCOD_Gamoauthtoken") ;
            Combo_proforcod_Ddointernalname = httpContext.cgiGet( "COMBO_PROFORCOD_Ddointernalname") ;
            Combo_proforcod_Titlecontrolalign = httpContext.cgiGet( "COMBO_PROFORCOD_Titlecontrolalign") ;
            Combo_proforcod_Dropdownoptionstype = httpContext.cgiGet( "COMBO_PROFORCOD_Dropdownoptionstype") ;
            Combo_proforcod_Enabled = GXutil.strtobool( httpContext.cgiGet( "COMBO_PROFORCOD_Enabled")) ;
            Combo_proforcod_Visible = GXutil.strtobool( httpContext.cgiGet( "COMBO_PROFORCOD_Visible")) ;
            Combo_proforcod_Titlecontrolidtoreplace = httpContext.cgiGet( "COMBO_PROFORCOD_Titlecontrolidtoreplace") ;
            Combo_proforcod_Datalisttype = httpContext.cgiGet( "COMBO_PROFORCOD_Datalisttype") ;
            Combo_proforcod_Allowmultipleselection = GXutil.strtobool( httpContext.cgiGet( "COMBO_PROFORCOD_Allowmultipleselection")) ;
            Combo_proforcod_Datalistfixedvalues = httpContext.cgiGet( "COMBO_PROFORCOD_Datalistfixedvalues") ;
            Combo_proforcod_Isgriditem = GXutil.strtobool( httpContext.cgiGet( "COMBO_PROFORCOD_Isgriditem")) ;
            Combo_proforcod_Hasdescription = GXutil.strtobool( httpContext.cgiGet( "COMBO_PROFORCOD_Hasdescription")) ;
            Combo_proforcod_Datalistproc = httpContext.cgiGet( "COMBO_PROFORCOD_Datalistproc") ;
            Combo_proforcod_Datalistprocparametersprefix = httpContext.cgiGet( "COMBO_PROFORCOD_Datalistprocparametersprefix") ;
            Combo_proforcod_Remoteservicesparameters = httpContext.cgiGet( "COMBO_PROFORCOD_Remoteservicesparameters") ;
            Combo_proforcod_Datalistupdateminimumcharacters = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_PROFORCOD_Datalistupdateminimumcharacters"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_proforcod_Includeonlyselectedoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_PROFORCOD_Includeonlyselectedoption")) ;
            Combo_proforcod_Includeselectalloption = GXutil.strtobool( httpContext.cgiGet( "COMBO_PROFORCOD_Includeselectalloption")) ;
            Combo_proforcod_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_PROFORCOD_Emptyitem")) ;
            Combo_proforcod_Includeaddnewoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_PROFORCOD_Includeaddnewoption")) ;
            Combo_proforcod_Htmltemplate = httpContext.cgiGet( "COMBO_PROFORCOD_Htmltemplate") ;
            Combo_proforcod_Multiplevaluestype = httpContext.cgiGet( "COMBO_PROFORCOD_Multiplevaluestype") ;
            Combo_proforcod_Loadingdata = httpContext.cgiGet( "COMBO_PROFORCOD_Loadingdata") ;
            Combo_proforcod_Noresultsfound = httpContext.cgiGet( "COMBO_PROFORCOD_Noresultsfound") ;
            Combo_proforcod_Emptyitemtext = httpContext.cgiGet( "COMBO_PROFORCOD_Emptyitemtext") ;
            Combo_proforcod_Onlyselectedvalues = httpContext.cgiGet( "COMBO_PROFORCOD_Onlyselectedvalues") ;
            Combo_proforcod_Selectalltext = httpContext.cgiGet( "COMBO_PROFORCOD_Selectalltext") ;
            Combo_proforcod_Multiplevaluesseparator = httpContext.cgiGet( "COMBO_PROFORCOD_Multiplevaluesseparator") ;
            Combo_proforcod_Addnewoptiontext = httpContext.cgiGet( "COMBO_PROFORCOD_Addnewoptiontext") ;
            Combo_forprdume_Objectcall = httpContext.cgiGet( "COMBO_FORPRDUME_Objectcall") ;
            Combo_forprdume_Class = httpContext.cgiGet( "COMBO_FORPRDUME_Class") ;
            Combo_forprdume_Icontype = httpContext.cgiGet( "COMBO_FORPRDUME_Icontype") ;
            Combo_forprdume_Icon = httpContext.cgiGet( "COMBO_FORPRDUME_Icon") ;
            Combo_forprdume_Caption = httpContext.cgiGet( "COMBO_FORPRDUME_Caption") ;
            Combo_forprdume_Tooltip = httpContext.cgiGet( "COMBO_FORPRDUME_Tooltip") ;
            Combo_forprdume_Cls = httpContext.cgiGet( "COMBO_FORPRDUME_Cls") ;
            Combo_forprdume_Selectedvalue_set = httpContext.cgiGet( "COMBO_FORPRDUME_Selectedvalue_set") ;
            Combo_forprdume_Selectedvalue_get = httpContext.cgiGet( "COMBO_FORPRDUME_Selectedvalue_get") ;
            Combo_forprdume_Selectedtext_set = httpContext.cgiGet( "COMBO_FORPRDUME_Selectedtext_set") ;
            Combo_forprdume_Selectedtext_get = httpContext.cgiGet( "COMBO_FORPRDUME_Selectedtext_get") ;
            Combo_forprdume_Gamoauthtoken = httpContext.cgiGet( "COMBO_FORPRDUME_Gamoauthtoken") ;
            Combo_forprdume_Ddointernalname = httpContext.cgiGet( "COMBO_FORPRDUME_Ddointernalname") ;
            Combo_forprdume_Titlecontrolalign = httpContext.cgiGet( "COMBO_FORPRDUME_Titlecontrolalign") ;
            Combo_forprdume_Dropdownoptionstype = httpContext.cgiGet( "COMBO_FORPRDUME_Dropdownoptionstype") ;
            Combo_forprdume_Enabled = GXutil.strtobool( httpContext.cgiGet( "COMBO_FORPRDUME_Enabled")) ;
            Combo_forprdume_Visible = GXutil.strtobool( httpContext.cgiGet( "COMBO_FORPRDUME_Visible")) ;
            Combo_forprdume_Titlecontrolidtoreplace = httpContext.cgiGet( "COMBO_FORPRDUME_Titlecontrolidtoreplace") ;
            Combo_forprdume_Datalisttype = httpContext.cgiGet( "COMBO_FORPRDUME_Datalisttype") ;
            Combo_forprdume_Allowmultipleselection = GXutil.strtobool( httpContext.cgiGet( "COMBO_FORPRDUME_Allowmultipleselection")) ;
            Combo_forprdume_Datalistfixedvalues = httpContext.cgiGet( "COMBO_FORPRDUME_Datalistfixedvalues") ;
            Combo_forprdume_Isgriditem = GXutil.strtobool( httpContext.cgiGet( "COMBO_FORPRDUME_Isgriditem")) ;
            Combo_forprdume_Hasdescription = GXutil.strtobool( httpContext.cgiGet( "COMBO_FORPRDUME_Hasdescription")) ;
            Combo_forprdume_Datalistproc = httpContext.cgiGet( "COMBO_FORPRDUME_Datalistproc") ;
            Combo_forprdume_Datalistprocparametersprefix = httpContext.cgiGet( "COMBO_FORPRDUME_Datalistprocparametersprefix") ;
            Combo_forprdume_Remoteservicesparameters = httpContext.cgiGet( "COMBO_FORPRDUME_Remoteservicesparameters") ;
            Combo_forprdume_Datalistupdateminimumcharacters = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_FORPRDUME_Datalistupdateminimumcharacters"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_forprdume_Includeonlyselectedoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_FORPRDUME_Includeonlyselectedoption")) ;
            Combo_forprdume_Includeselectalloption = GXutil.strtobool( httpContext.cgiGet( "COMBO_FORPRDUME_Includeselectalloption")) ;
            Combo_forprdume_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_FORPRDUME_Emptyitem")) ;
            Combo_forprdume_Includeaddnewoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_FORPRDUME_Includeaddnewoption")) ;
            Combo_forprdume_Htmltemplate = httpContext.cgiGet( "COMBO_FORPRDUME_Htmltemplate") ;
            Combo_forprdume_Multiplevaluestype = httpContext.cgiGet( "COMBO_FORPRDUME_Multiplevaluestype") ;
            Combo_forprdume_Loadingdata = httpContext.cgiGet( "COMBO_FORPRDUME_Loadingdata") ;
            Combo_forprdume_Noresultsfound = httpContext.cgiGet( "COMBO_FORPRDUME_Noresultsfound") ;
            Combo_forprdume_Emptyitemtext = httpContext.cgiGet( "COMBO_FORPRDUME_Emptyitemtext") ;
            Combo_forprdume_Onlyselectedvalues = httpContext.cgiGet( "COMBO_FORPRDUME_Onlyselectedvalues") ;
            Combo_forprdume_Selectalltext = httpContext.cgiGet( "COMBO_FORPRDUME_Selectalltext") ;
            Combo_forprdume_Multiplevaluesseparator = httpContext.cgiGet( "COMBO_FORPRDUME_Multiplevaluesseparator") ;
            Combo_forprdume_Addnewoptiontext = httpContext.cgiGet( "COMBO_FORPRDUME_Addnewoptiontext") ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A910Workstat = httpContext.cgiGet( edtWorkstat_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A910Workstat", A910Workstat);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            A881EscMTxt1 = httpContext.cgiGet( edtEscMTxt1_Internalname) ;
            n881EscMTxt1 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A881EscMTxt1", A881EscMTxt1);
            A882EscMTxt2 = httpContext.cgiGet( edtEscMTxt2_Internalname) ;
            n882EscMTxt2 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A882EscMTxt2", A882EscMTxt2);
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtEscMInc_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtEscMInc_Internalname)), DecimalUtil.stringToDec("99.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ESCMINC");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEscMInc_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A883EscMInc = DecimalUtil.ZERO ;
               n883EscMInc = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A883EscMInc", GXutil.ltrimstr( A883EscMInc, 5, 2));
            }
            else
            {
               A883EscMInc = localUtil.ctond( httpContext.cgiGet( edtEscMInc_Internalname)) ;
               n883EscMInc = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A883EscMInc", GXutil.ltrimstr( A883EscMInc, 5, 2));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtEscMKgm_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtEscMKgm_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ESCMKGM");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEscMKgm_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A884EscMKgm = DecimalUtil.ZERO ;
               n884EscMKgm = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A884EscMKgm", GXutil.ltrimstr( A884EscMKgm, 10, 2));
            }
            else
            {
               A884EscMKgm = localUtil.ctond( httpContext.cgiGet( edtEscMKgm_Internalname)) ;
               n884EscMKgm = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A884EscMKgm", GXutil.ltrimstr( A884EscMKgm, 10, 2));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtEscMVol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtEscMVol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ESCMVOL");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEscMVol_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A885EscMVol = 0 ;
               n885EscMVol = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A885EscMVol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A885EscMVol), 5, 0));
            }
            else
            {
               A885EscMVol = (int)(localUtil.ctol( httpContext.cgiGet( edtEscMVol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n885EscMVol = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A885EscMVol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A885EscMVol), 5, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtEscMUltLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtEscMUltLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ESCMULTLIN");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEscMUltLin_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A886EscMUltLin = 0 ;
               n886EscMUltLin = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A886EscMUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A886EscMUltLin), 8, 0));
            }
            else
            {
               A886EscMUltLin = (int)(localUtil.ctol( httpContext.cgiGet( edtEscMUltLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n886EscMUltLin = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A886EscMUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A886EscMUltLin), 8, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtEscMValCos_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtEscMValCos_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ESCMVALCOS");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEscMValCos_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A896EscMValCos = 0 ;
               n896EscMValCos = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A896EscMValCos", GXutil.ltrimstr( DecimalUtil.doubleToDec(A896EscMValCos), 8, 0));
            }
            else
            {
               A896EscMValCos = (int)(localUtil.ctol( httpContext.cgiGet( edtEscMValCos_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n896EscMValCos = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A896EscMValCos", GXutil.ltrimstr( DecimalUtil.doubleToDec(A896EscMValCos), 8, 0));
            }
            A3915EmpNumDec = (byte)(localUtil.ctol( httpContext.cgiGet( edtEmpNumDec_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n3915EmpNumDec = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3915EmpNumDec", GXutil.str( A3915EmpNumDec, 1, 0));
            A893EscMCosT = localUtil.ctond( httpContext.cgiGet( edtEscMCosT_Internalname)) ;
            n893EscMCosT = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A893EscMCosT", GXutil.ltrimstr( A893EscMCosT, 15, 5));
            AV60ComboEmprCod = GXutil.upper( httpContext.cgiGet( edtavComboemprcod_Internalname)) ;
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
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
               A910Workstat = httpContext.GetPar( "Workstat") ;
               httpContext.ajax_rsp_assign_attri("", false, "A910Workstat", A910Workstat);
               getEqualNoModal( ) ;
               Gx_mode = "DSP" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               disable_std_buttons_dsp( ) ;
               standaloneModal( ) ;
            }
            else
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal( ) ;
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
                        e112W2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e122W2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        btn_enter( ) ;
                        /* No code required for Cancel button. It is implemented as the Reset button. */
                     }
                     else if ( GXutil.strcmp(sEvt, "DELETE") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        btn_delete( ) ;
                     }
                     else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        afterkeyloadscreen( ) ;
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
         e122W2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll2W118( ) ;
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
      if ( isIns( ) )
      {
         bttBtntrn_delete_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      }
      httpContext.ajax_rsp_assign_prop("", false, edtavComboemprcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavComboemprcod_Enabled), 5, 0), true);
   }

   public void disable_std_buttons_dsp( )
   {
      bttBtntrn_delete_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Visible), 5, 0), true);
      bttBtntrn_delete_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Visible), 5, 0), true);
      if ( isDsp( ) )
      {
         bttBtntrn_enter_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_enter_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_enter_Visible), 5, 0), true);
      }
      disableAttributes2W118( ) ;
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

   public void confirm_2W120( )
   {
      s893EscMCosT = O893EscMCosT ;
      n893EscMCosT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A893EscMCosT", GXutil.ltrimstr( A893EscMCosT, 15, 5));
      nGXsfl_89_idx = 0 ;
      while ( nGXsfl_89_idx < nRC_GXsfl_89 )
      {
         readRow2W120( ) ;
         if ( ( nRcdExists_120 != 0 ) || ( nIsMod_120 != 0 ) )
         {
            getKey2W120( ) ;
            if ( ( nRcdExists_120 == 0 ) && ( nRcdDeleted_120 == 0 ) )
            {
               if ( RcdFound120 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate2W120( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable2W120( ) ;
                     closeExtendedTableCursors2W120( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O893EscMCosT = A893EscMCosT ;
                     n893EscMCosT = false ;
                     httpContext.ajax_rsp_assign_attri("", false, "A893EscMCosT", GXutil.ltrimstr( A893EscMCosT, 15, 5));
                  }
               }
               else
               {
                  GXCCtl = "ESCMLIN_" + sGXsfl_89_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtEscMLin_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound120 != 0 )
               {
                  if ( nRcdDeleted_120 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey2W120( ) ;
                     load2W120( ) ;
                     beforeValidate2W120( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls2W120( ) ;
                        O893EscMCosT = A893EscMCosT ;
                        n893EscMCosT = false ;
                        httpContext.ajax_rsp_assign_attri("", false, "A893EscMCosT", GXutil.ltrimstr( A893EscMCosT, 15, 5));
                     }
                  }
                  else
                  {
                     if ( nIsMod_120 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate2W120( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable2W120( ) ;
                           closeExtendedTableCursors2W120( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O893EscMCosT = A893EscMCosT ;
                           n893EscMCosT = false ;
                           httpContext.ajax_rsp_assign_attri("", false, "A893EscMCosT", GXutil.ltrimstr( A893EscMCosT, 15, 5));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_120 == 0 )
                  {
                     GXCCtl = "ESCMLIN_" + sGXsfl_89_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtEscMLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtEscMLin_Internalname, GXutil.ltrim( localUtil.ntoc( A887EscMLin, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPrdNum_Internalname, GXutil.rtrim( A719PrdNum)) ;
         httpContext.changePostValue( edtPrdNom_Internalname, GXutil.rtrim( A718PrdNom)) ;
         httpContext.changePostValue( edtPrdPreAct_Internalname, GXutil.ltrim( localUtil.ntoc( A724PrdPreAct, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtProForCod_Internalname, GXutil.rtrim( A764ProForCod)) ;
         httpContext.changePostValue( edtProForDsc_Internalname, GXutil.rtrim( A766ProForDsc)) ;
         httpContext.changePostValue( edtEscMDsc_Internalname, GXutil.rtrim( A897EscMDsc)) ;
         httpContext.changePostValue( edtEscMPrdPre_Internalname, GXutil.ltrim( localUtil.ntoc( A889EscMPrdPre, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtEscMCan_Internalname, GXutil.ltrim( localUtil.ntoc( A890EscMCan, (byte)(11), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtForPrdUMe_Internalname, GXutil.ltrim( localUtil.ntoc( A490ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtForPrdDsc_Internalname, GXutil.rtrim( A488ForPrdDsc)) ;
         httpContext.changePostValue( edtEscMCos_Internalname, GXutil.ltrim( localUtil.ntoc( A891EscMCos, (byte)(15), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtEscMCosL_Internalname, GXutil.ltrim( localUtil.ntoc( A892EscMCosL, (byte)(15), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtEscMCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A4707EscMCliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtEscMArtCod_Internalname, GXutil.rtrim( A4708EscMArtCod)) ;
         httpContext.changePostValue( edtEscMMdlCod_Internalname, GXutil.rtrim( A4709EscMMdlCod)) ;
         httpContext.changePostValue( edtEscMProCod_Internalname, GXutil.rtrim( A4710EscMProCod)) ;
         httpContext.changePostValue( edtEscMFasCod_Internalname, GXutil.rtrim( A4711EscMFasCod)) ;
         httpContext.changePostValue( edtEscMFacCon_Internalname, GXutil.ltrim( localUtil.ntoc( A4712EscMFacCon, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtEscMRb_Internalname, GXutil.ltrim( localUtil.ntoc( A4713EscMRb, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtEscSol_Internalname, GXutil.ltrim( localUtil.ntoc( A6060EscSol, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtEscVolm_Internalname, GXutil.ltrim( localUtil.ntoc( A7584EscVolm, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtEscOrdn_Internalname, GXutil.ltrim( localUtil.ntoc( A7583EscOrdn, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtEscMCant_Internalname, GXutil.ltrim( localUtil.ntoc( A10363EscMCant, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z887EscMLin_"+sGXsfl_89_idx, GXutil.ltrim( localUtil.ntoc( Z887EscMLin, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z897EscMDsc_"+sGXsfl_89_idx, GXutil.rtrim( Z897EscMDsc)) ;
         httpContext.changePostValue( "ZT_"+"Z889EscMPrdPre_"+sGXsfl_89_idx, GXutil.ltrim( localUtil.ntoc( Z889EscMPrdPre, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z890EscMCan_"+sGXsfl_89_idx, GXutil.ltrim( localUtil.ntoc( Z890EscMCan, (byte)(11), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z891EscMCos_"+sGXsfl_89_idx, GXutil.ltrim( localUtil.ntoc( Z891EscMCos, (byte)(15), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4707EscMCliCod_"+sGXsfl_89_idx, GXutil.ltrim( localUtil.ntoc( Z4707EscMCliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4708EscMArtCod_"+sGXsfl_89_idx, GXutil.rtrim( Z4708EscMArtCod)) ;
         httpContext.changePostValue( "ZT_"+"Z4709EscMMdlCod_"+sGXsfl_89_idx, GXutil.rtrim( Z4709EscMMdlCod)) ;
         httpContext.changePostValue( "ZT_"+"Z4710EscMProCod_"+sGXsfl_89_idx, GXutil.rtrim( Z4710EscMProCod)) ;
         httpContext.changePostValue( "ZT_"+"Z4711EscMFasCod_"+sGXsfl_89_idx, GXutil.rtrim( Z4711EscMFasCod)) ;
         httpContext.changePostValue( "ZT_"+"Z4712EscMFacCon_"+sGXsfl_89_idx, GXutil.ltrim( localUtil.ntoc( Z4712EscMFacCon, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4713EscMRb_"+sGXsfl_89_idx, GXutil.ltrim( localUtil.ntoc( Z4713EscMRb, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6060EscSol_"+sGXsfl_89_idx, GXutil.ltrim( localUtil.ntoc( Z6060EscSol, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7584EscVolm_"+sGXsfl_89_idx, GXutil.ltrim( localUtil.ntoc( Z7584EscVolm, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7583EscOrdn_"+sGXsfl_89_idx, GXutil.ltrim( localUtil.ntoc( Z7583EscOrdn, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10363EscMCant_"+sGXsfl_89_idx, GXutil.ltrim( localUtil.ntoc( Z10363EscMCant, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z719PrdNum_"+sGXsfl_89_idx, GXutil.rtrim( Z719PrdNum)) ;
         httpContext.changePostValue( "ZT_"+"Z764ProForCod_"+sGXsfl_89_idx, GXutil.rtrim( Z764ProForCod)) ;
         httpContext.changePostValue( "ZT_"+"Z490ForPrdUMe_"+sGXsfl_89_idx, GXutil.ltrim( localUtil.ntoc( Z490ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T891EscMCos_"+sGXsfl_89_idx, GXutil.ltrim( localUtil.ntoc( O891EscMCos, (byte)(15), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_120_"+sGXsfl_89_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_120, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_120_"+sGXsfl_89_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_120, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_120_"+sGXsfl_89_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_120, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_120 != 0 )
         {
            httpContext.changePostValue( "ESCMLIN_"+sGXsfl_89_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEscMLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDNUM_"+sGXsfl_89_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNum_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDNOM_"+sGXsfl_89_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNom_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDPREACT_"+sGXsfl_89_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdPreAct_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROFORCOD_"+sGXsfl_89_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROFORDSC_"+sGXsfl_89_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ESCMDSC_"+sGXsfl_89_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEscMDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ESCMPRDPRE_"+sGXsfl_89_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEscMPrdPre_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ESCMCAN_"+sGXsfl_89_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEscMCan_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FORPRDUME_"+sGXsfl_89_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForPrdUMe_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FORPRDDSC_"+sGXsfl_89_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForPrdDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ESCMCOS_"+sGXsfl_89_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEscMCos_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ESCMCOSL_"+sGXsfl_89_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEscMCosL_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ESCMCLICOD_"+sGXsfl_89_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEscMCliCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ESCMARTCOD_"+sGXsfl_89_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEscMArtCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ESCMMDLCOD_"+sGXsfl_89_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEscMMdlCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ESCMPROCOD_"+sGXsfl_89_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEscMProCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ESCMFASCOD_"+sGXsfl_89_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEscMFasCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ESCMFACCON_"+sGXsfl_89_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEscMFacCon_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ESCMRB_"+sGXsfl_89_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEscMRb_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ESCSOL_"+sGXsfl_89_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEscSol_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ESCVOLM_"+sGXsfl_89_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEscVolm_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ESCORDN_"+sGXsfl_89_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEscOrdn_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ESCMCANT_"+sGXsfl_89_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEscMCant_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O893EscMCosT = s893EscMCosT ;
      n893EscMCosT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A893EscMCosT", GXutil.ltrimstr( A893EscMCosT, 15, 5));
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption2W0( )
   {
   }

   public void e112W2( )
   {
      /* Start Routine */
      returnInSub = false ;
   }

   public void e122W2( )
   {
      /* After Trn Routine */
      returnInSub = false ;
   }

   public void S112( )
   {
      /* 'LOADCOMBOFORPRDUME' Routine */
      returnInSub = false ;
   }

   public void S122( )
   {
      /* 'LOADCOMBOPROFORCOD' Routine */
      returnInSub = false ;
   }

   public void S132( )
   {
      /* 'LOADCOMBOPRDNUM' Routine */
      returnInSub = false ;
   }

   public void S142( )
   {
      /* 'LOADCOMBOEMPRCOD' Routine */
      returnInSub = false ;
   }

   public void zm2W118( int GX_JID )
   {
      if ( ( GX_JID == 4 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z881EscMTxt1 = T002W8_A881EscMTxt1[0] ;
            Z882EscMTxt2 = T002W8_A882EscMTxt2[0] ;
            Z883EscMInc = T002W8_A883EscMInc[0] ;
            Z884EscMKgm = T002W8_A884EscMKgm[0] ;
            Z885EscMVol = T002W8_A885EscMVol[0] ;
            Z886EscMUltLin = T002W8_A886EscMUltLin[0] ;
            Z896EscMValCos = T002W8_A896EscMValCos[0] ;
         }
         else
         {
            Z881EscMTxt1 = A881EscMTxt1 ;
            Z882EscMTxt2 = A882EscMTxt2 ;
            Z883EscMInc = A883EscMInc ;
            Z884EscMKgm = A884EscMKgm ;
            Z885EscMVol = A885EscMVol ;
            Z886EscMUltLin = A886EscMUltLin ;
            Z896EscMValCos = A896EscMValCos ;
         }
      }
      if ( GX_JID == -4 )
      {
         Z910Workstat = A910Workstat ;
         Z881EscMTxt1 = A881EscMTxt1 ;
         Z882EscMTxt2 = A882EscMTxt2 ;
         Z883EscMInc = A883EscMInc ;
         Z884EscMKgm = A884EscMKgm ;
         Z885EscMVol = A885EscMVol ;
         Z886EscMUltLin = A886EscMUltLin ;
         Z896EscMValCos = A896EscMValCos ;
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
         Z3915EmpNumDec = A3915EmpNumDec ;
         Z893EscMCosT = A893EscMCosT ;
      }
   }

   public void standaloneNotModal( )
   {
   }

   public void standaloneModal( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         bttBtntrn_delete_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      }
      else
      {
         bttBtntrn_delete_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
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

   public void load2W118( )
   {
      /* Using cursor T002W13 */
      pr_default.execute(9, new Object[] {A396EmprCod, A910Workstat});
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound118 = (short)(1) ;
         A407EmprNom = T002W13_A407EmprNom[0] ;
         n407EmprNom = T002W13_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A881EscMTxt1 = T002W13_A881EscMTxt1[0] ;
         n881EscMTxt1 = T002W13_n881EscMTxt1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A881EscMTxt1", A881EscMTxt1);
         A882EscMTxt2 = T002W13_A882EscMTxt2[0] ;
         n882EscMTxt2 = T002W13_n882EscMTxt2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A882EscMTxt2", A882EscMTxt2);
         A883EscMInc = T002W13_A883EscMInc[0] ;
         n883EscMInc = T002W13_n883EscMInc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A883EscMInc", GXutil.ltrimstr( A883EscMInc, 5, 2));
         A884EscMKgm = T002W13_A884EscMKgm[0] ;
         n884EscMKgm = T002W13_n884EscMKgm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A884EscMKgm", GXutil.ltrimstr( A884EscMKgm, 10, 2));
         A885EscMVol = T002W13_A885EscMVol[0] ;
         n885EscMVol = T002W13_n885EscMVol[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A885EscMVol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A885EscMVol), 5, 0));
         A886EscMUltLin = T002W13_A886EscMUltLin[0] ;
         n886EscMUltLin = T002W13_n886EscMUltLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A886EscMUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A886EscMUltLin), 8, 0));
         A896EscMValCos = T002W13_A896EscMValCos[0] ;
         n896EscMValCos = T002W13_n896EscMValCos[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A896EscMValCos", GXutil.ltrimstr( DecimalUtil.doubleToDec(A896EscMValCos), 8, 0));
         A3915EmpNumDec = T002W13_A3915EmpNumDec[0] ;
         n3915EmpNumDec = T002W13_n3915EmpNumDec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3915EmpNumDec", GXutil.str( A3915EmpNumDec, 1, 0));
         A893EscMCosT = T002W13_A893EscMCosT[0] ;
         n893EscMCosT = T002W13_n893EscMCosT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A893EscMCosT", GXutil.ltrimstr( A893EscMCosT, 15, 5));
         zm2W118( -4) ;
      }
      pr_default.close(9);
      onLoadActions2W118( ) ;
   }

   public void onLoadActions2W118( )
   {
      O893EscMCosT = A893EscMCosT ;
      n893EscMCosT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A893EscMCosT", GXutil.ltrimstr( A893EscMCosT, 15, 5));
   }

   public void checkExtendedTable2W118( )
   {
      nIsDirty_118 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T002W9 */
      pr_default.execute(7, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T002W9_A407EmprNom[0] ;
      n407EmprNom = T002W9_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      A3915EmpNumDec = T002W9_A3915EmpNumDec[0] ;
      n3915EmpNumDec = T002W9_n3915EmpNumDec[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A3915EmpNumDec", GXutil.str( A3915EmpNumDec, 1, 0));
      pr_default.close(7);
      /* Using cursor T002W11 */
      pr_default.execute(8, new Object[] {A396EmprCod, A910Workstat});
      if ( (pr_default.getStatus(8) != 101) )
      {
         A893EscMCosT = T002W11_A893EscMCosT[0] ;
         n893EscMCosT = T002W11_n893EscMCosT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A893EscMCosT", GXutil.ltrimstr( A893EscMCosT, 15, 5));
      }
      else
      {
         nIsDirty_118 = (short)(1) ;
         A893EscMCosT = DecimalUtil.doubleToDec(0) ;
         n893EscMCosT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A893EscMCosT", GXutil.ltrimstr( A893EscMCosT, 15, 5));
      }
      pr_default.close(8);
   }

   public void closeExtendedTableCursors2W118( )
   {
      pr_default.close(7);
      pr_default.close(8);
   }

   public void enableDisable( )
   {
   }

   public void gxload_5( String A396EmprCod )
   {
      /* Using cursor T002W14 */
      pr_default.execute(10, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(10) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T002W14_A407EmprNom[0] ;
      n407EmprNom = T002W14_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      A3915EmpNumDec = T002W14_A3915EmpNumDec[0] ;
      n3915EmpNumDec = T002W14_n3915EmpNumDec[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A3915EmpNumDec", GXutil.str( A3915EmpNumDec, 1, 0));
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A407EmprNom))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A3915EmpNumDec, (byte)(1), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(10) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(10);
   }

   public void gxload_6( String A396EmprCod ,
                         String A910Workstat )
   {
      /* Using cursor T002W16 */
      pr_default.execute(11, new Object[] {A396EmprCod, A910Workstat});
      if ( (pr_default.getStatus(11) != 101) )
      {
         A893EscMCosT = T002W16_A893EscMCosT[0] ;
         n893EscMCosT = T002W16_n893EscMCosT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A893EscMCosT", GXutil.ltrimstr( A893EscMCosT, 15, 5));
      }
      else
      {
         A893EscMCosT = DecimalUtil.doubleToDec(0) ;
         n893EscMCosT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A893EscMCosT", GXutil.ltrimstr( A893EscMCosT, 15, 5));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A893EscMCosT, (byte)(15), (byte)(5), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(11) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(11);
   }

   public void getKey2W118( )
   {
      /* Using cursor T002W17 */
      pr_default.execute(12, new Object[] {A396EmprCod, A910Workstat});
      if ( (pr_default.getStatus(12) != 101) )
      {
         RcdFound118 = (short)(1) ;
      }
      else
      {
         RcdFound118 = (short)(0) ;
      }
      pr_default.close(12);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T002W8 */
      pr_default.execute(6, new Object[] {A396EmprCod, A910Workstat});
      if ( (pr_default.getStatus(6) != 101) )
      {
         zm2W118( 4) ;
         RcdFound118 = (short)(1) ;
         A910Workstat = T002W8_A910Workstat[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A910Workstat", A910Workstat);
         A881EscMTxt1 = T002W8_A881EscMTxt1[0] ;
         n881EscMTxt1 = T002W8_n881EscMTxt1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A881EscMTxt1", A881EscMTxt1);
         A882EscMTxt2 = T002W8_A882EscMTxt2[0] ;
         n882EscMTxt2 = T002W8_n882EscMTxt2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A882EscMTxt2", A882EscMTxt2);
         A883EscMInc = T002W8_A883EscMInc[0] ;
         n883EscMInc = T002W8_n883EscMInc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A883EscMInc", GXutil.ltrimstr( A883EscMInc, 5, 2));
         A884EscMKgm = T002W8_A884EscMKgm[0] ;
         n884EscMKgm = T002W8_n884EscMKgm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A884EscMKgm", GXutil.ltrimstr( A884EscMKgm, 10, 2));
         A885EscMVol = T002W8_A885EscMVol[0] ;
         n885EscMVol = T002W8_n885EscMVol[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A885EscMVol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A885EscMVol), 5, 0));
         A886EscMUltLin = T002W8_A886EscMUltLin[0] ;
         n886EscMUltLin = T002W8_n886EscMUltLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A886EscMUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A886EscMUltLin), 8, 0));
         A896EscMValCos = T002W8_A896EscMValCos[0] ;
         n896EscMValCos = T002W8_n896EscMValCos[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A896EscMValCos", GXutil.ltrimstr( DecimalUtil.doubleToDec(A896EscMValCos), 8, 0));
         A396EmprCod = T002W8_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         Z396EmprCod = A396EmprCod ;
         Z910Workstat = A910Workstat ;
         sMode118 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load2W118( ) ;
         if ( AnyError == 1 )
         {
            RcdFound118 = (short)(0) ;
            initializeNonKey2W118( ) ;
         }
         Gx_mode = sMode118 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound118 = (short)(0) ;
         initializeNonKey2W118( ) ;
         sMode118 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode118 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(6);
   }

   public void getEqualNoModal( )
   {
      getKey2W118( ) ;
      if ( RcdFound118 == 0 )
      {
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound118 = (short)(0) ;
      /* Using cursor T002W18 */
      pr_default.execute(13, new Object[] {A396EmprCod, A396EmprCod, A910Workstat});
      if ( (pr_default.getStatus(13) != 101) )
      {
         while ( (pr_default.getStatus(13) != 101) && ( ( GXutil.strcmp(T002W18_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T002W18_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T002W18_A910Workstat[0], A910Workstat) < 0 ) ) )
         {
            pr_default.readNext(13);
         }
         if ( (pr_default.getStatus(13) != 101) && ( ( GXutil.strcmp(T002W18_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T002W18_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T002W18_A910Workstat[0], A910Workstat) > 0 ) ) )
         {
            A396EmprCod = T002W18_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A910Workstat = T002W18_A910Workstat[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A910Workstat", A910Workstat);
            RcdFound118 = (short)(1) ;
         }
      }
      pr_default.close(13);
   }

   public void move_previous( )
   {
      RcdFound118 = (short)(0) ;
      /* Using cursor T002W19 */
      pr_default.execute(14, new Object[] {A396EmprCod, A396EmprCod, A910Workstat});
      if ( (pr_default.getStatus(14) != 101) )
      {
         while ( (pr_default.getStatus(14) != 101) && ( ( GXutil.strcmp(T002W19_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T002W19_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T002W19_A910Workstat[0], A910Workstat) > 0 ) ) )
         {
            pr_default.readNext(14);
         }
         if ( (pr_default.getStatus(14) != 101) && ( ( GXutil.strcmp(T002W19_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T002W19_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T002W19_A910Workstat[0], A910Workstat) < 0 ) ) )
         {
            A396EmprCod = T002W19_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A910Workstat = T002W19_A910Workstat[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A910Workstat", A910Workstat);
            RcdFound118 = (short)(1) ;
         }
      }
      pr_default.close(14);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey2W118( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A893EscMCosT = O893EscMCosT ;
         n893EscMCosT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A893EscMCosT", GXutil.ltrimstr( A893EscMCosT, 15, 5));
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert2W118( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound118 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A910Workstat, Z910Workstat) != 0 ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A910Workstat = Z910Workstat ;
               httpContext.ajax_rsp_assign_attri("", false, "A910Workstat", A910Workstat);
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               A893EscMCosT = O893EscMCosT ;
               n893EscMCosT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A893EscMCosT", GXutil.ltrimstr( A893EscMCosT, 15, 5));
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               A893EscMCosT = O893EscMCosT ;
               n893EscMCosT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A893EscMCosT", GXutil.ltrimstr( A893EscMCosT, 15, 5));
               update2W118( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A910Workstat, Z910Workstat) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               A893EscMCosT = O893EscMCosT ;
               n893EscMCosT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A893EscMCosT", GXutil.ltrimstr( A893EscMCosT, 15, 5));
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert2W118( ) ;
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
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  /* Insert record */
                  A893EscMCosT = O893EscMCosT ;
                  n893EscMCosT = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A893EscMCosT", GXutil.ltrimstr( A893EscMCosT, 15, 5));
                  GX_FocusControl = edtEmprCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert2W118( ) ;
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
   }

   public void btn_delete( )
   {
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A910Workstat, Z910Workstat) != 0 ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A910Workstat = Z910Workstat ;
         httpContext.ajax_rsp_assign_attri("", false, "A910Workstat", A910Workstat);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         A893EscMCosT = O893EscMCosT ;
         n893EscMCosT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A893EscMCosT", GXutil.ltrimstr( A893EscMCosT, 15, 5));
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         getByPrimaryKey( ) ;
      }
      CloseOpenCursors();
   }

   public void btn_get( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      getEqualNoModal( ) ;
      if ( RcdFound118 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtEscMTxt1_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart2W118( ) ;
      if ( RcdFound118 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtEscMTxt1_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd2W118( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_previous( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      move_previous( ) ;
      if ( RcdFound118 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtEscMTxt1_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_next( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      move_next( ) ;
      if ( RcdFound118 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtEscMTxt1_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_last( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart2W118( ) ;
      if ( RcdFound118 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound118 != 0 )
         {
            scanNext2W118( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtEscMTxt1_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd2W118( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency2W118( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T002W7 */
         pr_default.execute(5, new Object[] {A396EmprCod, A910Workstat});
         if ( (pr_default.getStatus(5) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCESCAN"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(5) == 101) || ( GXutil.strcmp(Z881EscMTxt1, T002W7_A881EscMTxt1[0]) != 0 ) || ( GXutil.strcmp(Z882EscMTxt2, T002W7_A882EscMTxt2[0]) != 0 ) || ( DecimalUtil.compareTo(Z883EscMInc, T002W7_A883EscMInc[0]) != 0 ) || ( DecimalUtil.compareTo(Z884EscMKgm, T002W7_A884EscMKgm[0]) != 0 ) || ( Z885EscMVol != T002W7_A885EscMVol[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z886EscMUltLin != T002W7_A886EscMUltLin[0] ) || ( Z896EscMValCos != T002W7_A896EscMValCos[0] ) )
         {
            if ( GXutil.strcmp(Z881EscMTxt1, T002W7_A881EscMTxt1[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.tescand:[seudo value changed for attri]"+"EscMTxt1");
               GXutil.writeLogRaw("Old: ",Z881EscMTxt1);
               GXutil.writeLogRaw("Current: ",T002W7_A881EscMTxt1[0]);
            }
            if ( GXutil.strcmp(Z882EscMTxt2, T002W7_A882EscMTxt2[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.tescand:[seudo value changed for attri]"+"EscMTxt2");
               GXutil.writeLogRaw("Old: ",Z882EscMTxt2);
               GXutil.writeLogRaw("Current: ",T002W7_A882EscMTxt2[0]);
            }
            if ( DecimalUtil.compareTo(Z883EscMInc, T002W7_A883EscMInc[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.tescand:[seudo value changed for attri]"+"EscMInc");
               GXutil.writeLogRaw("Old: ",Z883EscMInc);
               GXutil.writeLogRaw("Current: ",T002W7_A883EscMInc[0]);
            }
            if ( DecimalUtil.compareTo(Z884EscMKgm, T002W7_A884EscMKgm[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.tescand:[seudo value changed for attri]"+"EscMKgm");
               GXutil.writeLogRaw("Old: ",Z884EscMKgm);
               GXutil.writeLogRaw("Current: ",T002W7_A884EscMKgm[0]);
            }
            if ( Z885EscMVol != T002W7_A885EscMVol[0] )
            {
               GXutil.writeLogln("formulaciontinte.tescand:[seudo value changed for attri]"+"EscMVol");
               GXutil.writeLogRaw("Old: ",Z885EscMVol);
               GXutil.writeLogRaw("Current: ",T002W7_A885EscMVol[0]);
            }
            if ( Z886EscMUltLin != T002W7_A886EscMUltLin[0] )
            {
               GXutil.writeLogln("formulaciontinte.tescand:[seudo value changed for attri]"+"EscMUltLin");
               GXutil.writeLogRaw("Old: ",Z886EscMUltLin);
               GXutil.writeLogRaw("Current: ",T002W7_A886EscMUltLin[0]);
            }
            if ( Z896EscMValCos != T002W7_A896EscMValCos[0] )
            {
               GXutil.writeLogln("formulaciontinte.tescand:[seudo value changed for attri]"+"EscMValCos");
               GXutil.writeLogRaw("Old: ",Z896EscMValCos);
               GXutil.writeLogRaw("Current: ",T002W7_A896EscMValCos[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCESCAN"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert2W118( )
   {
      beforeValidate2W118( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable2W118( ) ;
      }
      if ( AnyError == 0 )
      {
         zm2W118( 0) ;
         checkOptimisticConcurrency2W118( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm2W118( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert2W118( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T002W20 */
                  pr_default.execute(15, new Object[] {A910Workstat, Boolean.valueOf(n881EscMTxt1), A881EscMTxt1, Boolean.valueOf(n882EscMTxt2), A882EscMTxt2, Boolean.valueOf(n883EscMInc), A883EscMInc, Boolean.valueOf(n884EscMKgm), A884EscMKgm, Boolean.valueOf(n885EscMVol), Integer.valueOf(A885EscMVol), Boolean.valueOf(n886EscMUltLin), Integer.valueOf(A886EscMUltLin), Boolean.valueOf(n896EscMValCos), Integer.valueOf(A896EscMValCos), A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCESCAN");
                  if ( (pr_default.getStatus(15) == 1) )
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
                        processLevel2W118( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption2W0( ) ;
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
            load2W118( ) ;
         }
         endLevel2W118( ) ;
      }
      closeExtendedTableCursors2W118( ) ;
   }

   public void update2W118( )
   {
      beforeValidate2W118( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable2W118( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency2W118( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm2W118( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate2W118( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T002W21 */
                  pr_default.execute(16, new Object[] {Boolean.valueOf(n881EscMTxt1), A881EscMTxt1, Boolean.valueOf(n882EscMTxt2), A882EscMTxt2, Boolean.valueOf(n883EscMInc), A883EscMInc, Boolean.valueOf(n884EscMKgm), A884EscMKgm, Boolean.valueOf(n885EscMVol), Integer.valueOf(A885EscMVol), Boolean.valueOf(n886EscMUltLin), Integer.valueOf(A886EscMUltLin), Boolean.valueOf(n896EscMValCos), Integer.valueOf(A896EscMValCos), A396EmprCod, A910Workstat});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCESCAN");
                  if ( (pr_default.getStatus(16) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCESCAN"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate2W118( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel2W118( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption2W0( ) ;
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
         endLevel2W118( ) ;
      }
      closeExtendedTableCursors2W118( ) ;
   }

   public void deferredUpdate2W118( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate2W118( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency2W118( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls2W118( ) ;
         afterConfirm2W118( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete2W118( ) ;
            if ( AnyError == 0 )
            {
               A893EscMCosT = O893EscMCosT ;
               n893EscMCosT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A893EscMCosT", GXutil.ltrimstr( A893EscMCosT, 15, 5));
               scanStart2W120( ) ;
               while ( RcdFound120 != 0 )
               {
                  getByPrimaryKey2W120( ) ;
                  delete2W120( ) ;
                  scanNext2W120( ) ;
                  O893EscMCosT = A893EscMCosT ;
                  n893EscMCosT = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A893EscMCosT", GXutil.ltrimstr( A893EscMCosT, 15, 5));
               }
               scanEnd2W120( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T002W22 */
                  pr_default.execute(17, new Object[] {A396EmprCod, A910Workstat});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCESCAN");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound118 == 0 )
                        {
                           initAll2W118( ) ;
                           Gx_mode = "INS" ;
                           httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        }
                        else
                        {
                           getByPrimaryKey( ) ;
                           Gx_mode = "UPD" ;
                           httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        }
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucdeleted") ;
                        endTrnMsgCod = "SuccessfullyDeleted" ;
                        resetCaption2W0( ) ;
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
      sMode118 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel2W118( ) ;
      Gx_mode = sMode118 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls2W118( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T002W23 */
         pr_default.execute(18, new Object[] {A396EmprCod});
         A407EmprNom = T002W23_A407EmprNom[0] ;
         n407EmprNom = T002W23_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A3915EmpNumDec = T002W23_A3915EmpNumDec[0] ;
         n3915EmpNumDec = T002W23_n3915EmpNumDec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3915EmpNumDec", GXutil.str( A3915EmpNumDec, 1, 0));
         pr_default.close(18);
         /* Using cursor T002W25 */
         pr_default.execute(19, new Object[] {A396EmprCod, A910Workstat});
         if ( (pr_default.getStatus(19) != 101) )
         {
            A893EscMCosT = T002W25_A893EscMCosT[0] ;
            n893EscMCosT = T002W25_n893EscMCosT[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A893EscMCosT", GXutil.ltrimstr( A893EscMCosT, 15, 5));
         }
         else
         {
            A893EscMCosT = DecimalUtil.doubleToDec(0) ;
            n893EscMCosT = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A893EscMCosT", GXutil.ltrimstr( A893EscMCosT, 15, 5));
         }
         pr_default.close(19);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T002W26 */
         pr_default.execute(20, new Object[] {A396EmprCod, A910Workstat});
         if ( (pr_default.getStatus(20) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LESCAN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(20);
      }
   }

   public void processNestedLevel2W120( )
   {
      s893EscMCosT = O893EscMCosT ;
      n893EscMCosT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A893EscMCosT", GXutil.ltrimstr( A893EscMCosT, 15, 5));
      nGXsfl_89_idx = 0 ;
      while ( nGXsfl_89_idx < nRC_GXsfl_89 )
      {
         readRow2W120( ) ;
         if ( ( nRcdExists_120 != 0 ) || ( nIsMod_120 != 0 ) )
         {
            standaloneNotModal2W120( ) ;
            getKey2W120( ) ;
            if ( ( nRcdExists_120 == 0 ) && ( nRcdDeleted_120 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert2W120( ) ;
            }
            else
            {
               if ( RcdFound120 != 0 )
               {
                  if ( ( nRcdDeleted_120 != 0 ) && ( nRcdExists_120 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete2W120( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_120 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update2W120( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_120 == 0 )
                  {
                     GXCCtl = "ESCMLIN_" + sGXsfl_89_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtEscMLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O893EscMCosT = A893EscMCosT ;
            n893EscMCosT = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A893EscMCosT", GXutil.ltrimstr( A893EscMCosT, 15, 5));
         }
         httpContext.changePostValue( edtEscMLin_Internalname, GXutil.ltrim( localUtil.ntoc( A887EscMLin, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPrdNum_Internalname, GXutil.rtrim( A719PrdNum)) ;
         httpContext.changePostValue( edtPrdNom_Internalname, GXutil.rtrim( A718PrdNom)) ;
         httpContext.changePostValue( edtPrdPreAct_Internalname, GXutil.ltrim( localUtil.ntoc( A724PrdPreAct, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtProForCod_Internalname, GXutil.rtrim( A764ProForCod)) ;
         httpContext.changePostValue( edtProForDsc_Internalname, GXutil.rtrim( A766ProForDsc)) ;
         httpContext.changePostValue( edtEscMDsc_Internalname, GXutil.rtrim( A897EscMDsc)) ;
         httpContext.changePostValue( edtEscMPrdPre_Internalname, GXutil.ltrim( localUtil.ntoc( A889EscMPrdPre, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtEscMCan_Internalname, GXutil.ltrim( localUtil.ntoc( A890EscMCan, (byte)(11), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtForPrdUMe_Internalname, GXutil.ltrim( localUtil.ntoc( A490ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtForPrdDsc_Internalname, GXutil.rtrim( A488ForPrdDsc)) ;
         httpContext.changePostValue( edtEscMCos_Internalname, GXutil.ltrim( localUtil.ntoc( A891EscMCos, (byte)(15), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtEscMCosL_Internalname, GXutil.ltrim( localUtil.ntoc( A892EscMCosL, (byte)(15), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtEscMCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A4707EscMCliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtEscMArtCod_Internalname, GXutil.rtrim( A4708EscMArtCod)) ;
         httpContext.changePostValue( edtEscMMdlCod_Internalname, GXutil.rtrim( A4709EscMMdlCod)) ;
         httpContext.changePostValue( edtEscMProCod_Internalname, GXutil.rtrim( A4710EscMProCod)) ;
         httpContext.changePostValue( edtEscMFasCod_Internalname, GXutil.rtrim( A4711EscMFasCod)) ;
         httpContext.changePostValue( edtEscMFacCon_Internalname, GXutil.ltrim( localUtil.ntoc( A4712EscMFacCon, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtEscMRb_Internalname, GXutil.ltrim( localUtil.ntoc( A4713EscMRb, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtEscSol_Internalname, GXutil.ltrim( localUtil.ntoc( A6060EscSol, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtEscVolm_Internalname, GXutil.ltrim( localUtil.ntoc( A7584EscVolm, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtEscOrdn_Internalname, GXutil.ltrim( localUtil.ntoc( A7583EscOrdn, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtEscMCant_Internalname, GXutil.ltrim( localUtil.ntoc( A10363EscMCant, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z887EscMLin_"+sGXsfl_89_idx, GXutil.ltrim( localUtil.ntoc( Z887EscMLin, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z897EscMDsc_"+sGXsfl_89_idx, GXutil.rtrim( Z897EscMDsc)) ;
         httpContext.changePostValue( "ZT_"+"Z889EscMPrdPre_"+sGXsfl_89_idx, GXutil.ltrim( localUtil.ntoc( Z889EscMPrdPre, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z890EscMCan_"+sGXsfl_89_idx, GXutil.ltrim( localUtil.ntoc( Z890EscMCan, (byte)(11), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z891EscMCos_"+sGXsfl_89_idx, GXutil.ltrim( localUtil.ntoc( Z891EscMCos, (byte)(15), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4707EscMCliCod_"+sGXsfl_89_idx, GXutil.ltrim( localUtil.ntoc( Z4707EscMCliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4708EscMArtCod_"+sGXsfl_89_idx, GXutil.rtrim( Z4708EscMArtCod)) ;
         httpContext.changePostValue( "ZT_"+"Z4709EscMMdlCod_"+sGXsfl_89_idx, GXutil.rtrim( Z4709EscMMdlCod)) ;
         httpContext.changePostValue( "ZT_"+"Z4710EscMProCod_"+sGXsfl_89_idx, GXutil.rtrim( Z4710EscMProCod)) ;
         httpContext.changePostValue( "ZT_"+"Z4711EscMFasCod_"+sGXsfl_89_idx, GXutil.rtrim( Z4711EscMFasCod)) ;
         httpContext.changePostValue( "ZT_"+"Z4712EscMFacCon_"+sGXsfl_89_idx, GXutil.ltrim( localUtil.ntoc( Z4712EscMFacCon, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4713EscMRb_"+sGXsfl_89_idx, GXutil.ltrim( localUtil.ntoc( Z4713EscMRb, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6060EscSol_"+sGXsfl_89_idx, GXutil.ltrim( localUtil.ntoc( Z6060EscSol, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7584EscVolm_"+sGXsfl_89_idx, GXutil.ltrim( localUtil.ntoc( Z7584EscVolm, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7583EscOrdn_"+sGXsfl_89_idx, GXutil.ltrim( localUtil.ntoc( Z7583EscOrdn, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10363EscMCant_"+sGXsfl_89_idx, GXutil.ltrim( localUtil.ntoc( Z10363EscMCant, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z719PrdNum_"+sGXsfl_89_idx, GXutil.rtrim( Z719PrdNum)) ;
         httpContext.changePostValue( "ZT_"+"Z764ProForCod_"+sGXsfl_89_idx, GXutil.rtrim( Z764ProForCod)) ;
         httpContext.changePostValue( "ZT_"+"Z490ForPrdUMe_"+sGXsfl_89_idx, GXutil.ltrim( localUtil.ntoc( Z490ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T891EscMCos_"+sGXsfl_89_idx, GXutil.ltrim( localUtil.ntoc( O891EscMCos, (byte)(15), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_120_"+sGXsfl_89_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_120, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_120_"+sGXsfl_89_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_120, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_120_"+sGXsfl_89_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_120, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_120 != 0 )
         {
            httpContext.changePostValue( "ESCMLIN_"+sGXsfl_89_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEscMLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDNUM_"+sGXsfl_89_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNum_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDNOM_"+sGXsfl_89_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNom_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDPREACT_"+sGXsfl_89_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdPreAct_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROFORCOD_"+sGXsfl_89_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROFORDSC_"+sGXsfl_89_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ESCMDSC_"+sGXsfl_89_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEscMDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ESCMPRDPRE_"+sGXsfl_89_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEscMPrdPre_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ESCMCAN_"+sGXsfl_89_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEscMCan_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FORPRDUME_"+sGXsfl_89_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForPrdUMe_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FORPRDDSC_"+sGXsfl_89_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForPrdDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ESCMCOS_"+sGXsfl_89_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEscMCos_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ESCMCOSL_"+sGXsfl_89_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEscMCosL_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ESCMCLICOD_"+sGXsfl_89_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEscMCliCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ESCMARTCOD_"+sGXsfl_89_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEscMArtCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ESCMMDLCOD_"+sGXsfl_89_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEscMMdlCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ESCMPROCOD_"+sGXsfl_89_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEscMProCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ESCMFASCOD_"+sGXsfl_89_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEscMFasCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ESCMFACCON_"+sGXsfl_89_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEscMFacCon_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ESCMRB_"+sGXsfl_89_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEscMRb_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ESCSOL_"+sGXsfl_89_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEscSol_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ESCVOLM_"+sGXsfl_89_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEscVolm_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ESCORDN_"+sGXsfl_89_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEscOrdn_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ESCMCANT_"+sGXsfl_89_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEscMCant_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll2W120( ) ;
      if ( AnyError != 0 )
      {
         O893EscMCosT = s893EscMCosT ;
         n893EscMCosT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A893EscMCosT", GXutil.ltrimstr( A893EscMCosT, 15, 5));
      }
      nRcdExists_120 = (short)(0) ;
      nIsMod_120 = (short)(0) ;
      nRcdDeleted_120 = (short)(0) ;
   }

   public void processLevel2W118( )
   {
      /* Save parent mode. */
      sMode118 = Gx_mode ;
      processNestedLevel2W120( ) ;
      if ( AnyError != 0 )
      {
         O893EscMCosT = s893EscMCosT ;
         n893EscMCosT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A893EscMCosT", GXutil.ltrimstr( A893EscMCosT, 15, 5));
      }
      /* Restore parent mode. */
      Gx_mode = sMode118 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel2W118( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(5);
      }
      if ( AnyError == 0 )
      {
         beforeComplete2W118( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "formulaciontinte.tescand");
         if ( AnyError == 0 )
         {
            confirmValues2W0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "formulaciontinte.tescand");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart2W118( )
   {
      /* Scan By routine */
      /* Using cursor T002W27 */
      pr_default.execute(21);
      RcdFound118 = (short)(0) ;
      if ( (pr_default.getStatus(21) != 101) )
      {
         RcdFound118 = (short)(1) ;
         A396EmprCod = T002W27_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A910Workstat = T002W27_A910Workstat[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A910Workstat", A910Workstat);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext2W118( )
   {
      /* Scan next routine */
      pr_default.readNext(21);
      RcdFound118 = (short)(0) ;
      if ( (pr_default.getStatus(21) != 101) )
      {
         RcdFound118 = (short)(1) ;
         A396EmprCod = T002W27_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A910Workstat = T002W27_A910Workstat[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A910Workstat", A910Workstat);
      }
   }

   public void scanEnd2W118( )
   {
      pr_default.close(21);
   }

   public void afterConfirm2W118( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert2W118( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate2W118( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete2W118( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete2W118( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate2W118( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes2W118( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtWorkstat_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtWorkstat_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtWorkstat_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtEscMTxt1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEscMTxt1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEscMTxt1_Enabled), 5, 0), true);
      edtEscMTxt2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEscMTxt2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEscMTxt2_Enabled), 5, 0), true);
      edtEscMInc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEscMInc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEscMInc_Enabled), 5, 0), true);
      edtEscMKgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEscMKgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEscMKgm_Enabled), 5, 0), true);
      edtEscMVol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEscMVol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEscMVol_Enabled), 5, 0), true);
      edtEscMUltLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEscMUltLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEscMUltLin_Enabled), 5, 0), true);
      edtEscMValCos_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEscMValCos_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEscMValCos_Enabled), 5, 0), true);
      edtEmpNumDec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmpNumDec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmpNumDec_Enabled), 5, 0), true);
      edtEscMCosT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEscMCosT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEscMCosT_Enabled), 5, 0), true);
   }

   public void zm2W120( int GX_JID )
   {
      if ( ( GX_JID == 7 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z897EscMDsc = T002W3_A897EscMDsc[0] ;
            Z889EscMPrdPre = T002W3_A889EscMPrdPre[0] ;
            Z890EscMCan = T002W3_A890EscMCan[0] ;
            Z891EscMCos = T002W3_A891EscMCos[0] ;
            Z4707EscMCliCod = T002W3_A4707EscMCliCod[0] ;
            Z4708EscMArtCod = T002W3_A4708EscMArtCod[0] ;
            Z4709EscMMdlCod = T002W3_A4709EscMMdlCod[0] ;
            Z4710EscMProCod = T002W3_A4710EscMProCod[0] ;
            Z4711EscMFasCod = T002W3_A4711EscMFasCod[0] ;
            Z4712EscMFacCon = T002W3_A4712EscMFacCon[0] ;
            Z4713EscMRb = T002W3_A4713EscMRb[0] ;
            Z6060EscSol = T002W3_A6060EscSol[0] ;
            Z7584EscVolm = T002W3_A7584EscVolm[0] ;
            Z7583EscOrdn = T002W3_A7583EscOrdn[0] ;
            Z10363EscMCant = T002W3_A10363EscMCant[0] ;
            Z719PrdNum = T002W3_A719PrdNum[0] ;
            Z764ProForCod = T002W3_A764ProForCod[0] ;
            Z490ForPrdUMe = T002W3_A490ForPrdUMe[0] ;
         }
         else
         {
            Z897EscMDsc = A897EscMDsc ;
            Z889EscMPrdPre = A889EscMPrdPre ;
            Z890EscMCan = A890EscMCan ;
            Z891EscMCos = A891EscMCos ;
            Z4707EscMCliCod = A4707EscMCliCod ;
            Z4708EscMArtCod = A4708EscMArtCod ;
            Z4709EscMMdlCod = A4709EscMMdlCod ;
            Z4710EscMProCod = A4710EscMProCod ;
            Z4711EscMFasCod = A4711EscMFasCod ;
            Z4712EscMFacCon = A4712EscMFacCon ;
            Z4713EscMRb = A4713EscMRb ;
            Z6060EscSol = A6060EscSol ;
            Z7584EscVolm = A7584EscVolm ;
            Z7583EscOrdn = A7583EscOrdn ;
            Z10363EscMCant = A10363EscMCant ;
            Z719PrdNum = A719PrdNum ;
            Z764ProForCod = A764ProForCod ;
            Z490ForPrdUMe = A490ForPrdUMe ;
         }
      }
      if ( GX_JID == -7 )
      {
         Z910Workstat = A910Workstat ;
         Z887EscMLin = A887EscMLin ;
         Z897EscMDsc = A897EscMDsc ;
         Z889EscMPrdPre = A889EscMPrdPre ;
         Z890EscMCan = A890EscMCan ;
         Z891EscMCos = A891EscMCos ;
         Z4707EscMCliCod = A4707EscMCliCod ;
         Z4708EscMArtCod = A4708EscMArtCod ;
         Z4709EscMMdlCod = A4709EscMMdlCod ;
         Z4710EscMProCod = A4710EscMProCod ;
         Z4711EscMFasCod = A4711EscMFasCod ;
         Z4712EscMFacCon = A4712EscMFacCon ;
         Z4713EscMRb = A4713EscMRb ;
         Z6060EscSol = A6060EscSol ;
         Z7584EscVolm = A7584EscVolm ;
         Z7583EscOrdn = A7583EscOrdn ;
         Z10363EscMCant = A10363EscMCant ;
         Z396EmprCod = A396EmprCod ;
         Z719PrdNum = A719PrdNum ;
         Z764ProForCod = A764ProForCod ;
         Z490ForPrdUMe = A490ForPrdUMe ;
         Z718PrdNom = A718PrdNom ;
         Z724PrdPreAct = A724PrdPreAct ;
         Z766ProForDsc = A766ProForDsc ;
         Z488ForPrdDsc = A488ForPrdDsc ;
      }
   }

   public void standaloneNotModal2W120( )
   {
   }

   public void standaloneModal2W120( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtEscMLin_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEscMLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEscMLin_Enabled), 5, 0), !bGXsfl_89_Refreshing);
      }
      else
      {
         edtEscMLin_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEscMLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEscMLin_Enabled), 5, 0), !bGXsfl_89_Refreshing);
      }
   }

   public void load2W120( )
   {
      /* Using cursor T002W28 */
      pr_default.execute(22, new Object[] {A396EmprCod, A910Workstat, Integer.valueOf(A887EscMLin)});
      if ( (pr_default.getStatus(22) != 101) )
      {
         RcdFound120 = (short)(1) ;
         A718PrdNom = T002W28_A718PrdNom[0] ;
         A724PrdPreAct = T002W28_A724PrdPreAct[0] ;
         A766ProForDsc = T002W28_A766ProForDsc[0] ;
         A897EscMDsc = T002W28_A897EscMDsc[0] ;
         A889EscMPrdPre = T002W28_A889EscMPrdPre[0] ;
         A890EscMCan = T002W28_A890EscMCan[0] ;
         A488ForPrdDsc = T002W28_A488ForPrdDsc[0] ;
         n488ForPrdDsc = T002W28_n488ForPrdDsc[0] ;
         A891EscMCos = T002W28_A891EscMCos[0] ;
         A4707EscMCliCod = T002W28_A4707EscMCliCod[0] ;
         A4708EscMArtCod = T002W28_A4708EscMArtCod[0] ;
         A4709EscMMdlCod = T002W28_A4709EscMMdlCod[0] ;
         A4710EscMProCod = T002W28_A4710EscMProCod[0] ;
         A4711EscMFasCod = T002W28_A4711EscMFasCod[0] ;
         A4712EscMFacCon = T002W28_A4712EscMFacCon[0] ;
         A4713EscMRb = T002W28_A4713EscMRb[0] ;
         A6060EscSol = T002W28_A6060EscSol[0] ;
         A7584EscVolm = T002W28_A7584EscVolm[0] ;
         A7583EscOrdn = T002W28_A7583EscOrdn[0] ;
         A10363EscMCant = T002W28_A10363EscMCant[0] ;
         A719PrdNum = T002W28_A719PrdNum[0] ;
         A764ProForCod = T002W28_A764ProForCod[0] ;
         A490ForPrdUMe = T002W28_A490ForPrdUMe[0] ;
         zm2W120( -7) ;
      }
      pr_default.close(22);
      onLoadActions2W120( ) ;
   }

   public void onLoadActions2W120( )
   {
      if ( ( A490ForPrdUMe == 3 ) && ( A3915EmpNumDec == 0 ) )
      {
         A892EscMCosL = GXutil.roundDecimal( A889EscMPrdPre.multiply(A890EscMCan).multiply(A884EscMKgm).multiply(DecimalUtil.doubleToDec(A896EscMValCos)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN), 0) ;
      }
      else
      {
         if ( ( A490ForPrdUMe == 3 ) && ( A3915EmpNumDec == 2 ) )
         {
            A892EscMCosL = GXutil.roundDecimal( A889EscMPrdPre.multiply(A890EscMCan).multiply(A884EscMKgm).multiply(DecimalUtil.doubleToDec(A896EscMValCos)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN), 2) ;
         }
         else
         {
            if ( ( A490ForPrdUMe != 3 ) && ( A3915EmpNumDec == 0 ) )
            {
               A892EscMCosL = GXutil.roundDecimal( A889EscMPrdPre.multiply(A890EscMCan).multiply(DecimalUtil.doubleToDec(A885EscMVol)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN), 0) ;
            }
            else
            {
               if ( ( A490ForPrdUMe != 3 ) && ( A3915EmpNumDec == 2 ) )
               {
                  A892EscMCosL = GXutil.roundDecimal( A889EscMPrdPre.multiply(A890EscMCan).multiply(DecimalUtil.doubleToDec(A885EscMVol)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN), 2) ;
               }
               else
               {
                  A892EscMCosL = DecimalUtil.doubleToDec(0) ;
               }
            }
         }
      }
      if ( isIns( )  )
      {
         A893EscMCosT = O893EscMCosT.add(A891EscMCos) ;
         n893EscMCosT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A893EscMCosT", GXutil.ltrimstr( A893EscMCosT, 15, 5));
      }
      else
      {
         if ( isUpd( )  )
         {
            A893EscMCosT = O893EscMCosT.add(A891EscMCos).subtract(O891EscMCos) ;
            n893EscMCosT = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A893EscMCosT", GXutil.ltrimstr( A893EscMCosT, 15, 5));
         }
         else
         {
            if ( isDlt( )  )
            {
               A893EscMCosT = O893EscMCosT.subtract(O891EscMCos) ;
               n893EscMCosT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A893EscMCosT", GXutil.ltrimstr( A893EscMCosT, 15, 5));
            }
         }
      }
   }

   public void checkExtendedTable2W120( )
   {
      nIsDirty_120 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal2W120( ) ;
      /* Using cursor T002W4 */
      pr_default.execute(2, new Object[] {A396EmprCod, A719PrdNum});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "PRDNUM_" + sGXsfl_89_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A718PrdNom = T002W4_A718PrdNom[0] ;
      A724PrdPreAct = T002W4_A724PrdPreAct[0] ;
      pr_default.close(2);
      /* Using cursor T002W5 */
      pr_default.execute(3, new Object[] {A396EmprCod, A764ProForCod});
      if ( (pr_default.getStatus(3) == 101) )
      {
         GXCCtl = "PROFORCOD_" + sGXsfl_89_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CPROFO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtProForCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A766ProForDsc = T002W5_A766ProForDsc[0] ;
      pr_default.close(3);
      /* Using cursor T002W6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Byte.valueOf(A490ForPrdUMe)});
      if ( (pr_default.getStatus(4) == 101) )
      {
         GXCCtl = "FORPRDUME_" + sGXsfl_89_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "UNMEPR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtForPrdUMe_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A488ForPrdDsc = T002W6_A488ForPrdDsc[0] ;
      n488ForPrdDsc = T002W6_n488ForPrdDsc[0] ;
      pr_default.close(4);
      if ( ( A490ForPrdUMe == 3 ) && ( A3915EmpNumDec == 0 ) )
      {
         nIsDirty_120 = (short)(1) ;
         A892EscMCosL = GXutil.roundDecimal( A889EscMPrdPre.multiply(A890EscMCan).multiply(A884EscMKgm).multiply(DecimalUtil.doubleToDec(A896EscMValCos)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN), 0) ;
      }
      else
      {
         if ( ( A490ForPrdUMe == 3 ) && ( A3915EmpNumDec == 2 ) )
         {
            nIsDirty_120 = (short)(1) ;
            A892EscMCosL = GXutil.roundDecimal( A889EscMPrdPre.multiply(A890EscMCan).multiply(A884EscMKgm).multiply(DecimalUtil.doubleToDec(A896EscMValCos)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN), 2) ;
         }
         else
         {
            if ( ( A490ForPrdUMe != 3 ) && ( A3915EmpNumDec == 0 ) )
            {
               nIsDirty_120 = (short)(1) ;
               A892EscMCosL = GXutil.roundDecimal( A889EscMPrdPre.multiply(A890EscMCan).multiply(DecimalUtil.doubleToDec(A885EscMVol)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN), 0) ;
            }
            else
            {
               if ( ( A490ForPrdUMe != 3 ) && ( A3915EmpNumDec == 2 ) )
               {
                  nIsDirty_120 = (short)(1) ;
                  A892EscMCosL = GXutil.roundDecimal( A889EscMPrdPre.multiply(A890EscMCan).multiply(DecimalUtil.doubleToDec(A885EscMVol)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN), 2) ;
               }
               else
               {
                  nIsDirty_120 = (short)(1) ;
                  A892EscMCosL = DecimalUtil.doubleToDec(0) ;
               }
            }
         }
      }
      if ( ! ( ( A490ForPrdUMe == 0 ) || ( A490ForPrdUMe == 1 ) || ( A490ForPrdUMe == 2 ) || ( A490ForPrdUMe == 3 ) ) )
      {
         GXCCtl = "FORPRDUME_" + sGXsfl_89_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Unidad Medida", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtForPrdUMe_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( isIns( )  )
      {
         nIsDirty_120 = (short)(1) ;
         A893EscMCosT = O893EscMCosT.add(A891EscMCos) ;
         n893EscMCosT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A893EscMCosT", GXutil.ltrimstr( A893EscMCosT, 15, 5));
      }
      else
      {
         if ( isUpd( )  )
         {
            nIsDirty_120 = (short)(1) ;
            A893EscMCosT = O893EscMCosT.add(A891EscMCos).subtract(O891EscMCos) ;
            n893EscMCosT = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A893EscMCosT", GXutil.ltrimstr( A893EscMCosT, 15, 5));
         }
         else
         {
            if ( isDlt( )  )
            {
               nIsDirty_120 = (short)(1) ;
               A893EscMCosT = O893EscMCosT.subtract(O891EscMCos) ;
               n893EscMCosT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A893EscMCosT", GXutil.ltrimstr( A893EscMCosT, 15, 5));
            }
         }
      }
   }

   public void closeExtendedTableCursors2W120( )
   {
      pr_default.close(2);
      pr_default.close(3);
      pr_default.close(4);
   }

   public void enableDisable2W120( )
   {
   }

   public void gxload_8( String A396EmprCod ,
                         String A719PrdNum )
   {
      /* Using cursor T002W29 */
      pr_default.execute(23, new Object[] {A396EmprCod, A719PrdNum});
      if ( (pr_default.getStatus(23) == 101) )
      {
         GXCCtl = "PRDNUM_" + sGXsfl_89_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A718PrdNom = T002W29_A718PrdNom[0] ;
      A724PrdPreAct = T002W29_A724PrdPreAct[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A718PrdNom))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A724PrdPreAct, (byte)(14), (byte)(5), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(23) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(23);
   }

   public void gxload_9( String A396EmprCod ,
                         String A764ProForCod )
   {
      /* Using cursor T002W30 */
      pr_default.execute(24, new Object[] {A396EmprCod, A764ProForCod});
      if ( (pr_default.getStatus(24) == 101) )
      {
         GXCCtl = "PROFORCOD_" + sGXsfl_89_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CPROFO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtProForCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A766ProForDsc = T002W30_A766ProForDsc[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A766ProForDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(24) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(24);
   }

   public void gxload_10( String A396EmprCod ,
                          byte A490ForPrdUMe )
   {
      /* Using cursor T002W31 */
      pr_default.execute(25, new Object[] {A396EmprCod, Byte.valueOf(A490ForPrdUMe)});
      if ( (pr_default.getStatus(25) == 101) )
      {
         GXCCtl = "FORPRDUME_" + sGXsfl_89_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "UNMEPR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtForPrdUMe_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A488ForPrdDsc = T002W31_A488ForPrdDsc[0] ;
      n488ForPrdDsc = T002W31_n488ForPrdDsc[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A488ForPrdDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(25) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(25);
   }

   public void getKey2W120( )
   {
      /* Using cursor T002W32 */
      pr_default.execute(26, new Object[] {A396EmprCod, A910Workstat, Integer.valueOf(A887EscMLin)});
      if ( (pr_default.getStatus(26) != 101) )
      {
         RcdFound120 = (short)(1) ;
      }
      else
      {
         RcdFound120 = (short)(0) ;
      }
      pr_default.close(26);
   }

   public void getByPrimaryKey2W120( )
   {
      /* Using cursor T002W3 */
      pr_default.execute(1, new Object[] {A396EmprCod, A910Workstat, Integer.valueOf(A887EscMLin)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm2W120( 7) ;
         RcdFound120 = (short)(1) ;
         initializeNonKey2W120( ) ;
         A887EscMLin = T002W3_A887EscMLin[0] ;
         A897EscMDsc = T002W3_A897EscMDsc[0] ;
         A889EscMPrdPre = T002W3_A889EscMPrdPre[0] ;
         A890EscMCan = T002W3_A890EscMCan[0] ;
         A891EscMCos = T002W3_A891EscMCos[0] ;
         A4707EscMCliCod = T002W3_A4707EscMCliCod[0] ;
         A4708EscMArtCod = T002W3_A4708EscMArtCod[0] ;
         A4709EscMMdlCod = T002W3_A4709EscMMdlCod[0] ;
         A4710EscMProCod = T002W3_A4710EscMProCod[0] ;
         A4711EscMFasCod = T002W3_A4711EscMFasCod[0] ;
         A4712EscMFacCon = T002W3_A4712EscMFacCon[0] ;
         A4713EscMRb = T002W3_A4713EscMRb[0] ;
         A6060EscSol = T002W3_A6060EscSol[0] ;
         A7584EscVolm = T002W3_A7584EscVolm[0] ;
         A7583EscOrdn = T002W3_A7583EscOrdn[0] ;
         A10363EscMCant = T002W3_A10363EscMCant[0] ;
         A719PrdNum = T002W3_A719PrdNum[0] ;
         A764ProForCod = T002W3_A764ProForCod[0] ;
         A490ForPrdUMe = T002W3_A490ForPrdUMe[0] ;
         O891EscMCos = A891EscMCos ;
         Z396EmprCod = A396EmprCod ;
         Z910Workstat = A910Workstat ;
         Z887EscMLin = A887EscMLin ;
         sMode120 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal2W120( ) ;
         load2W120( ) ;
         Gx_mode = sMode120 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound120 = (short)(0) ;
         initializeNonKey2W120( ) ;
         sMode120 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal2W120( ) ;
         Gx_mode = sMode120 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes2W120( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency2W120( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T002W2 */
         pr_default.execute(0, new Object[] {A396EmprCod, A910Workstat, Integer.valueOf(A887EscMLin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPESCMAN"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z897EscMDsc, T002W2_A897EscMDsc[0]) != 0 ) || ( DecimalUtil.compareTo(Z889EscMPrdPre, T002W2_A889EscMPrdPre[0]) != 0 ) || ( DecimalUtil.compareTo(Z890EscMCan, T002W2_A890EscMCan[0]) != 0 ) || ( DecimalUtil.compareTo(Z891EscMCos, T002W2_A891EscMCos[0]) != 0 ) || ( Z4707EscMCliCod != T002W2_A4707EscMCliCod[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z4708EscMArtCod, T002W2_A4708EscMArtCod[0]) != 0 ) || ( GXutil.strcmp(Z4709EscMMdlCod, T002W2_A4709EscMMdlCod[0]) != 0 ) || ( GXutil.strcmp(Z4710EscMProCod, T002W2_A4710EscMProCod[0]) != 0 ) || ( GXutil.strcmp(Z4711EscMFasCod, T002W2_A4711EscMFasCod[0]) != 0 ) || ( DecimalUtil.compareTo(Z4712EscMFacCon, T002W2_A4712EscMFacCon[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z4713EscMRb != T002W2_A4713EscMRb[0] ) || ( Z6060EscSol != T002W2_A6060EscSol[0] ) || ( Z7584EscVolm != T002W2_A7584EscVolm[0] ) || ( Z7583EscOrdn != T002W2_A7583EscOrdn[0] ) || ( DecimalUtil.compareTo(Z10363EscMCant, T002W2_A10363EscMCant[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z719PrdNum, T002W2_A719PrdNum[0]) != 0 ) || ( GXutil.strcmp(Z764ProForCod, T002W2_A764ProForCod[0]) != 0 ) || ( Z490ForPrdUMe != T002W2_A490ForPrdUMe[0] ) )
         {
            if ( GXutil.strcmp(Z897EscMDsc, T002W2_A897EscMDsc[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.tescand:[seudo value changed for attri]"+"EscMDsc");
               GXutil.writeLogRaw("Old: ",Z897EscMDsc);
               GXutil.writeLogRaw("Current: ",T002W2_A897EscMDsc[0]);
            }
            if ( DecimalUtil.compareTo(Z889EscMPrdPre, T002W2_A889EscMPrdPre[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.tescand:[seudo value changed for attri]"+"EscMPrdPre");
               GXutil.writeLogRaw("Old: ",Z889EscMPrdPre);
               GXutil.writeLogRaw("Current: ",T002W2_A889EscMPrdPre[0]);
            }
            if ( DecimalUtil.compareTo(Z890EscMCan, T002W2_A890EscMCan[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.tescand:[seudo value changed for attri]"+"EscMCan");
               GXutil.writeLogRaw("Old: ",Z890EscMCan);
               GXutil.writeLogRaw("Current: ",T002W2_A890EscMCan[0]);
            }
            if ( DecimalUtil.compareTo(Z891EscMCos, T002W2_A891EscMCos[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.tescand:[seudo value changed for attri]"+"EscMCos");
               GXutil.writeLogRaw("Old: ",Z891EscMCos);
               GXutil.writeLogRaw("Current: ",T002W2_A891EscMCos[0]);
            }
            if ( Z4707EscMCliCod != T002W2_A4707EscMCliCod[0] )
            {
               GXutil.writeLogln("formulaciontinte.tescand:[seudo value changed for attri]"+"EscMCliCod");
               GXutil.writeLogRaw("Old: ",Z4707EscMCliCod);
               GXutil.writeLogRaw("Current: ",T002W2_A4707EscMCliCod[0]);
            }
            if ( GXutil.strcmp(Z4708EscMArtCod, T002W2_A4708EscMArtCod[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.tescand:[seudo value changed for attri]"+"EscMArtCod");
               GXutil.writeLogRaw("Old: ",Z4708EscMArtCod);
               GXutil.writeLogRaw("Current: ",T002W2_A4708EscMArtCod[0]);
            }
            if ( GXutil.strcmp(Z4709EscMMdlCod, T002W2_A4709EscMMdlCod[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.tescand:[seudo value changed for attri]"+"EscMMdlCod");
               GXutil.writeLogRaw("Old: ",Z4709EscMMdlCod);
               GXutil.writeLogRaw("Current: ",T002W2_A4709EscMMdlCod[0]);
            }
            if ( GXutil.strcmp(Z4710EscMProCod, T002W2_A4710EscMProCod[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.tescand:[seudo value changed for attri]"+"EscMProCod");
               GXutil.writeLogRaw("Old: ",Z4710EscMProCod);
               GXutil.writeLogRaw("Current: ",T002W2_A4710EscMProCod[0]);
            }
            if ( GXutil.strcmp(Z4711EscMFasCod, T002W2_A4711EscMFasCod[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.tescand:[seudo value changed for attri]"+"EscMFasCod");
               GXutil.writeLogRaw("Old: ",Z4711EscMFasCod);
               GXutil.writeLogRaw("Current: ",T002W2_A4711EscMFasCod[0]);
            }
            if ( DecimalUtil.compareTo(Z4712EscMFacCon, T002W2_A4712EscMFacCon[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.tescand:[seudo value changed for attri]"+"EscMFacCon");
               GXutil.writeLogRaw("Old: ",Z4712EscMFacCon);
               GXutil.writeLogRaw("Current: ",T002W2_A4712EscMFacCon[0]);
            }
            if ( Z4713EscMRb != T002W2_A4713EscMRb[0] )
            {
               GXutil.writeLogln("formulaciontinte.tescand:[seudo value changed for attri]"+"EscMRb");
               GXutil.writeLogRaw("Old: ",Z4713EscMRb);
               GXutil.writeLogRaw("Current: ",T002W2_A4713EscMRb[0]);
            }
            if ( Z6060EscSol != T002W2_A6060EscSol[0] )
            {
               GXutil.writeLogln("formulaciontinte.tescand:[seudo value changed for attri]"+"EscSol");
               GXutil.writeLogRaw("Old: ",Z6060EscSol);
               GXutil.writeLogRaw("Current: ",T002W2_A6060EscSol[0]);
            }
            if ( Z7584EscVolm != T002W2_A7584EscVolm[0] )
            {
               GXutil.writeLogln("formulaciontinte.tescand:[seudo value changed for attri]"+"EscVolm");
               GXutil.writeLogRaw("Old: ",Z7584EscVolm);
               GXutil.writeLogRaw("Current: ",T002W2_A7584EscVolm[0]);
            }
            if ( Z7583EscOrdn != T002W2_A7583EscOrdn[0] )
            {
               GXutil.writeLogln("formulaciontinte.tescand:[seudo value changed for attri]"+"EscOrdn");
               GXutil.writeLogRaw("Old: ",Z7583EscOrdn);
               GXutil.writeLogRaw("Current: ",T002W2_A7583EscOrdn[0]);
            }
            if ( DecimalUtil.compareTo(Z10363EscMCant, T002W2_A10363EscMCant[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.tescand:[seudo value changed for attri]"+"EscMCant");
               GXutil.writeLogRaw("Old: ",Z10363EscMCant);
               GXutil.writeLogRaw("Current: ",T002W2_A10363EscMCant[0]);
            }
            if ( GXutil.strcmp(Z719PrdNum, T002W2_A719PrdNum[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.tescand:[seudo value changed for attri]"+"PrdNum");
               GXutil.writeLogRaw("Old: ",Z719PrdNum);
               GXutil.writeLogRaw("Current: ",T002W2_A719PrdNum[0]);
            }
            if ( GXutil.strcmp(Z764ProForCod, T002W2_A764ProForCod[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.tescand:[seudo value changed for attri]"+"ProForCod");
               GXutil.writeLogRaw("Old: ",Z764ProForCod);
               GXutil.writeLogRaw("Current: ",T002W2_A764ProForCod[0]);
            }
            if ( Z490ForPrdUMe != T002W2_A490ForPrdUMe[0] )
            {
               GXutil.writeLogln("formulaciontinte.tescand:[seudo value changed for attri]"+"ForPrdUMe");
               GXutil.writeLogRaw("Old: ",Z490ForPrdUMe);
               GXutil.writeLogRaw("Current: ",T002W2_A490ForPrdUMe[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPESCMAN"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert2W120( )
   {
      beforeValidate2W120( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable2W120( ) ;
      }
      if ( AnyError == 0 )
      {
         zm2W120( 0) ;
         checkOptimisticConcurrency2W120( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm2W120( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert2W120( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T002W33 */
                  pr_default.execute(27, new Object[] {A910Workstat, Integer.valueOf(A887EscMLin), A897EscMDsc, A889EscMPrdPre, A890EscMCan, A891EscMCos, Integer.valueOf(A4707EscMCliCod), A4708EscMArtCod, A4709EscMMdlCod, A4710EscMProCod, A4711EscMFasCod, A4712EscMFacCon, Short.valueOf(A4713EscMRb), Integer.valueOf(A6060EscSol), Integer.valueOf(A7584EscVolm), Short.valueOf(A7583EscOrdn), A10363EscMCant, A396EmprCod, A719PrdNum, A764ProForCod, Byte.valueOf(A490ForPrdUMe)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPESCMAN");
                  if ( (pr_default.getStatus(27) == 1) )
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
            load2W120( ) ;
         }
         endLevel2W120( ) ;
      }
      closeExtendedTableCursors2W120( ) ;
   }

   public void update2W120( )
   {
      beforeValidate2W120( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable2W120( ) ;
      }
      if ( ( nIsMod_120 != 0 ) || ( nIsDirty_120 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency2W120( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm2W120( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate2W120( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T002W34 */
                     pr_default.execute(28, new Object[] {A897EscMDsc, A889EscMPrdPre, A890EscMCan, A891EscMCos, Integer.valueOf(A4707EscMCliCod), A4708EscMArtCod, A4709EscMMdlCod, A4710EscMProCod, A4711EscMFasCod, A4712EscMFacCon, Short.valueOf(A4713EscMRb), Integer.valueOf(A6060EscSol), Integer.valueOf(A7584EscVolm), Short.valueOf(A7583EscOrdn), A10363EscMCant, A719PrdNum, A764ProForCod, Byte.valueOf(A490ForPrdUMe), A396EmprCod, A910Workstat, Integer.valueOf(A887EscMLin)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPESCMAN");
                     if ( (pr_default.getStatus(28) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPESCMAN"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate2W120( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey2W120( ) ;
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
            endLevel2W120( ) ;
         }
      }
      closeExtendedTableCursors2W120( ) ;
   }

   public void deferredUpdate2W120( )
   {
   }

   public void delete2W120( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate2W120( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency2W120( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls2W120( ) ;
         afterConfirm2W120( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete2W120( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T002W35 */
               pr_default.execute(29, new Object[] {A396EmprCod, A910Workstat, Integer.valueOf(A887EscMLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPESCMAN");
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
      sMode120 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel2W120( ) ;
      Gx_mode = sMode120 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls2W120( )
   {
      standaloneModal2W120( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T002W36 */
         pr_default.execute(30, new Object[] {A396EmprCod, A719PrdNum});
         A718PrdNom = T002W36_A718PrdNom[0] ;
         A724PrdPreAct = T002W36_A724PrdPreAct[0] ;
         pr_default.close(30);
         /* Using cursor T002W37 */
         pr_default.execute(31, new Object[] {A396EmprCod, A764ProForCod});
         A766ProForDsc = T002W37_A766ProForDsc[0] ;
         pr_default.close(31);
         /* Using cursor T002W38 */
         pr_default.execute(32, new Object[] {A396EmprCod, Byte.valueOf(A490ForPrdUMe)});
         A488ForPrdDsc = T002W38_A488ForPrdDsc[0] ;
         n488ForPrdDsc = T002W38_n488ForPrdDsc[0] ;
         pr_default.close(32);
         if ( ( A490ForPrdUMe == 3 ) && ( A3915EmpNumDec == 0 ) )
         {
            A892EscMCosL = GXutil.roundDecimal( A889EscMPrdPre.multiply(A890EscMCan).multiply(A884EscMKgm).multiply(DecimalUtil.doubleToDec(A896EscMValCos)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN), 0) ;
         }
         else
         {
            if ( ( A490ForPrdUMe == 3 ) && ( A3915EmpNumDec == 2 ) )
            {
               A892EscMCosL = GXutil.roundDecimal( A889EscMPrdPre.multiply(A890EscMCan).multiply(A884EscMKgm).multiply(DecimalUtil.doubleToDec(A896EscMValCos)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN), 2) ;
            }
            else
            {
               if ( ( A490ForPrdUMe != 3 ) && ( A3915EmpNumDec == 0 ) )
               {
                  A892EscMCosL = GXutil.roundDecimal( A889EscMPrdPre.multiply(A890EscMCan).multiply(DecimalUtil.doubleToDec(A885EscMVol)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN), 0) ;
               }
               else
               {
                  if ( ( A490ForPrdUMe != 3 ) && ( A3915EmpNumDec == 2 ) )
                  {
                     A892EscMCosL = GXutil.roundDecimal( A889EscMPrdPre.multiply(A890EscMCan).multiply(DecimalUtil.doubleToDec(A885EscMVol)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN), 2) ;
                  }
                  else
                  {
                     A892EscMCosL = DecimalUtil.doubleToDec(0) ;
                  }
               }
            }
         }
         if ( isIns( )  )
         {
            A893EscMCosT = O893EscMCosT.add(A891EscMCos) ;
            n893EscMCosT = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A893EscMCosT", GXutil.ltrimstr( A893EscMCosT, 15, 5));
         }
         else
         {
            if ( isUpd( )  )
            {
               A893EscMCosT = O893EscMCosT.add(A891EscMCos).subtract(O891EscMCos) ;
               n893EscMCosT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A893EscMCosT", GXutil.ltrimstr( A893EscMCosT, 15, 5));
            }
            else
            {
               if ( isDlt( )  )
               {
                  A893EscMCosT = O893EscMCosT.subtract(O891EscMCos) ;
                  n893EscMCosT = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A893EscMCosT", GXutil.ltrimstr( A893EscMCosT, 15, 5));
               }
            }
         }
      }
   }

   public void endLevel2W120( )
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

   public void scanStart2W120( )
   {
      /* Scan By routine */
      /* Using cursor T002W39 */
      pr_default.execute(33, new Object[] {A396EmprCod, A910Workstat});
      RcdFound120 = (short)(0) ;
      if ( (pr_default.getStatus(33) != 101) )
      {
         RcdFound120 = (short)(1) ;
         A887EscMLin = T002W39_A887EscMLin[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext2W120( )
   {
      /* Scan next routine */
      pr_default.readNext(33);
      RcdFound120 = (short)(0) ;
      if ( (pr_default.getStatus(33) != 101) )
      {
         RcdFound120 = (short)(1) ;
         A887EscMLin = T002W39_A887EscMLin[0] ;
      }
   }

   public void scanEnd2W120( )
   {
      pr_default.close(33);
   }

   public void afterConfirm2W120( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert2W120( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate2W120( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete2W120( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete2W120( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate2W120( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes2W120( )
   {
      edtEscMLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEscMLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEscMLin_Enabled), 5, 0), !bGXsfl_89_Refreshing);
      edtPrdNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Enabled), 5, 0), !bGXsfl_89_Refreshing);
      edtPrdNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNom_Enabled), 5, 0), !bGXsfl_89_Refreshing);
      edtPrdPreAct_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdPreAct_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdPreAct_Enabled), 5, 0), !bGXsfl_89_Refreshing);
      edtProForCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForCod_Enabled), 5, 0), !bGXsfl_89_Refreshing);
      edtProForDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForDsc_Enabled), 5, 0), !bGXsfl_89_Refreshing);
      edtEscMDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEscMDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEscMDsc_Enabled), 5, 0), !bGXsfl_89_Refreshing);
      edtEscMPrdPre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEscMPrdPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEscMPrdPre_Enabled), 5, 0), !bGXsfl_89_Refreshing);
      edtEscMCan_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEscMCan_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEscMCan_Enabled), 5, 0), !bGXsfl_89_Refreshing);
      edtForPrdUMe_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForPrdUMe_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForPrdUMe_Enabled), 5, 0), !bGXsfl_89_Refreshing);
      edtForPrdDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForPrdDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForPrdDsc_Enabled), 5, 0), !bGXsfl_89_Refreshing);
      edtEscMCos_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEscMCos_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEscMCos_Enabled), 5, 0), !bGXsfl_89_Refreshing);
      edtEscMCosL_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEscMCosL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEscMCosL_Enabled), 5, 0), !bGXsfl_89_Refreshing);
      edtEscMCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEscMCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEscMCliCod_Enabled), 5, 0), !bGXsfl_89_Refreshing);
      edtEscMArtCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEscMArtCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEscMArtCod_Enabled), 5, 0), !bGXsfl_89_Refreshing);
      edtEscMMdlCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEscMMdlCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEscMMdlCod_Enabled), 5, 0), !bGXsfl_89_Refreshing);
      edtEscMProCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEscMProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEscMProCod_Enabled), 5, 0), !bGXsfl_89_Refreshing);
      edtEscMFasCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEscMFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEscMFasCod_Enabled), 5, 0), !bGXsfl_89_Refreshing);
      edtEscMFacCon_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEscMFacCon_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEscMFacCon_Enabled), 5, 0), !bGXsfl_89_Refreshing);
      edtEscMRb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEscMRb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEscMRb_Enabled), 5, 0), !bGXsfl_89_Refreshing);
      edtEscSol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEscSol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEscSol_Enabled), 5, 0), !bGXsfl_89_Refreshing);
      edtEscVolm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEscVolm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEscVolm_Enabled), 5, 0), !bGXsfl_89_Refreshing);
      edtEscOrdn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEscOrdn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEscOrdn_Enabled), 5, 0), !bGXsfl_89_Refreshing);
      edtEscMCant_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEscMCant_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEscMCant_Enabled), 5, 0), !bGXsfl_89_Refreshing);
   }

   public void send_integrity_lvl_hashes2W120( )
   {
   }

   public void send_integrity_lvl_hashes2W118( )
   {
   }

   public void subsflControlProps_89120( )
   {
      edtEscMLin_Internalname = "ESCMLIN_"+sGXsfl_89_idx ;
      edtPrdNum_Internalname = "PRDNUM_"+sGXsfl_89_idx ;
      edtPrdNom_Internalname = "PRDNOM_"+sGXsfl_89_idx ;
      edtPrdPreAct_Internalname = "PRDPREACT_"+sGXsfl_89_idx ;
      edtProForCod_Internalname = "PROFORCOD_"+sGXsfl_89_idx ;
      edtProForDsc_Internalname = "PROFORDSC_"+sGXsfl_89_idx ;
      edtEscMDsc_Internalname = "ESCMDSC_"+sGXsfl_89_idx ;
      edtEscMPrdPre_Internalname = "ESCMPRDPRE_"+sGXsfl_89_idx ;
      edtEscMCan_Internalname = "ESCMCAN_"+sGXsfl_89_idx ;
      edtForPrdUMe_Internalname = "FORPRDUME_"+sGXsfl_89_idx ;
      edtForPrdDsc_Internalname = "FORPRDDSC_"+sGXsfl_89_idx ;
      edtEscMCos_Internalname = "ESCMCOS_"+sGXsfl_89_idx ;
      edtEscMCosL_Internalname = "ESCMCOSL_"+sGXsfl_89_idx ;
      edtEscMCliCod_Internalname = "ESCMCLICOD_"+sGXsfl_89_idx ;
      edtEscMArtCod_Internalname = "ESCMARTCOD_"+sGXsfl_89_idx ;
      edtEscMMdlCod_Internalname = "ESCMMDLCOD_"+sGXsfl_89_idx ;
      edtEscMProCod_Internalname = "ESCMPROCOD_"+sGXsfl_89_idx ;
      edtEscMFasCod_Internalname = "ESCMFASCOD_"+sGXsfl_89_idx ;
      edtEscMFacCon_Internalname = "ESCMFACCON_"+sGXsfl_89_idx ;
      edtEscMRb_Internalname = "ESCMRB_"+sGXsfl_89_idx ;
      edtEscSol_Internalname = "ESCSOL_"+sGXsfl_89_idx ;
      edtEscVolm_Internalname = "ESCVOLM_"+sGXsfl_89_idx ;
      edtEscOrdn_Internalname = "ESCORDN_"+sGXsfl_89_idx ;
      edtEscMCant_Internalname = "ESCMCANT_"+sGXsfl_89_idx ;
   }

   public void subsflControlProps_fel_89120( )
   {
      edtEscMLin_Internalname = "ESCMLIN_"+sGXsfl_89_fel_idx ;
      edtPrdNum_Internalname = "PRDNUM_"+sGXsfl_89_fel_idx ;
      edtPrdNom_Internalname = "PRDNOM_"+sGXsfl_89_fel_idx ;
      edtPrdPreAct_Internalname = "PRDPREACT_"+sGXsfl_89_fel_idx ;
      edtProForCod_Internalname = "PROFORCOD_"+sGXsfl_89_fel_idx ;
      edtProForDsc_Internalname = "PROFORDSC_"+sGXsfl_89_fel_idx ;
      edtEscMDsc_Internalname = "ESCMDSC_"+sGXsfl_89_fel_idx ;
      edtEscMPrdPre_Internalname = "ESCMPRDPRE_"+sGXsfl_89_fel_idx ;
      edtEscMCan_Internalname = "ESCMCAN_"+sGXsfl_89_fel_idx ;
      edtForPrdUMe_Internalname = "FORPRDUME_"+sGXsfl_89_fel_idx ;
      edtForPrdDsc_Internalname = "FORPRDDSC_"+sGXsfl_89_fel_idx ;
      edtEscMCos_Internalname = "ESCMCOS_"+sGXsfl_89_fel_idx ;
      edtEscMCosL_Internalname = "ESCMCOSL_"+sGXsfl_89_fel_idx ;
      edtEscMCliCod_Internalname = "ESCMCLICOD_"+sGXsfl_89_fel_idx ;
      edtEscMArtCod_Internalname = "ESCMARTCOD_"+sGXsfl_89_fel_idx ;
      edtEscMMdlCod_Internalname = "ESCMMDLCOD_"+sGXsfl_89_fel_idx ;
      edtEscMProCod_Internalname = "ESCMPROCOD_"+sGXsfl_89_fel_idx ;
      edtEscMFasCod_Internalname = "ESCMFASCOD_"+sGXsfl_89_fel_idx ;
      edtEscMFacCon_Internalname = "ESCMFACCON_"+sGXsfl_89_fel_idx ;
      edtEscMRb_Internalname = "ESCMRB_"+sGXsfl_89_fel_idx ;
      edtEscSol_Internalname = "ESCSOL_"+sGXsfl_89_fel_idx ;
      edtEscVolm_Internalname = "ESCVOLM_"+sGXsfl_89_fel_idx ;
      edtEscOrdn_Internalname = "ESCORDN_"+sGXsfl_89_fel_idx ;
      edtEscMCant_Internalname = "ESCMCANT_"+sGXsfl_89_fel_idx ;
   }

   public void addRow2W120( )
   {
      nGXsfl_89_idx = (int)(nGXsfl_89_idx+1) ;
      sGXsfl_89_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_89_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_89120( ) ;
      sendRow2W120( ) ;
   }

   public void sendRow2W120( )
   {
      Gridlevel_level1Row = GXWebRow.GetNew(context) ;
      if ( subGridlevel_level1_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGridlevel_level1_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGridlevel_level1_Class, "") != 0 )
         {
            subGridlevel_level1_Linesclass = subGridlevel_level1_Class+"Odd" ;
         }
      }
      else if ( subGridlevel_level1_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGridlevel_level1_Backstyle = (byte)(0) ;
         subGridlevel_level1_Backcolor = subGridlevel_level1_Allbackcolor ;
         if ( GXutil.strcmp(subGridlevel_level1_Class, "") != 0 )
         {
            subGridlevel_level1_Linesclass = subGridlevel_level1_Class+"Uniform" ;
         }
      }
      else if ( subGridlevel_level1_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGridlevel_level1_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGridlevel_level1_Class, "") != 0 )
         {
            subGridlevel_level1_Linesclass = subGridlevel_level1_Class+"Odd" ;
         }
         subGridlevel_level1_Backcolor = (int)(0x0) ;
      }
      else if ( subGridlevel_level1_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGridlevel_level1_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_89_idx) % (2))) == 0 )
         {
            subGridlevel_level1_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridlevel_level1_Class, "") != 0 )
            {
               subGridlevel_level1_Linesclass = subGridlevel_level1_Class+"Even" ;
            }
         }
         else
         {
            subGridlevel_level1_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridlevel_level1_Class, "") != 0 )
            {
               subGridlevel_level1_Linesclass = subGridlevel_level1_Class+"Odd" ;
            }
         }
      }
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_120_" + sGXsfl_89_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 90,'',false,'" + sGXsfl_89_idx + "',89)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEscMLin_Internalname,GXutil.ltrim( localUtil.ntoc( A887EscMLin, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A887EscMLin), "ZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,90);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEscMLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtEscMLin_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(89),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_120_" + sGXsfl_89_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 91,'',false,'" + sGXsfl_89_idx + "',89)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdNum_Internalname,GXutil.rtrim( A719PrdNum),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,91);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtPrdNum_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(89),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdNom_Internalname,GXutil.rtrim( A718PrdNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtPrdNom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(89),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdPreAct_Internalname,GXutil.ltrim( localUtil.ntoc( A724PrdPreAct, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtPrdPreAct_Enabled!=0) ? localUtil.format( A724PrdPreAct, "ZZZZZZZ9.999") : localUtil.format( A724PrdPreAct, "ZZZZZZZ9.999"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdPreAct_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtPrdPreAct_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(89),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_120_" + sGXsfl_89_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 94,'',false,'" + sGXsfl_89_idx + "',89)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProForCod_Internalname,GXutil.rtrim( A764ProForCod),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,94);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProForCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtProForCod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(89),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProForDsc_Internalname,GXutil.rtrim( A766ProForDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProForDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtProForDsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(89),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_120_" + sGXsfl_89_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 96,'',false,'" + sGXsfl_89_idx + "',89)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEscMDsc_Internalname,GXutil.rtrim( A897EscMDsc),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,96);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEscMDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtEscMDsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(89),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_120_" + sGXsfl_89_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 97,'',false,'" + sGXsfl_89_idx + "',89)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEscMPrdPre_Internalname,GXutil.ltrim( localUtil.ntoc( A889EscMPrdPre, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtEscMPrdPre_Enabled!=0) ? localUtil.format( A889EscMPrdPre, "ZZZZZZZ9.999") : localUtil.format( A889EscMPrdPre, "ZZZZZZZ9.999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,97);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEscMPrdPre_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtEscMPrdPre_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(89),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_120_" + sGXsfl_89_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 98,'',false,'" + sGXsfl_89_idx + "',89)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEscMCan_Internalname,GXutil.ltrim( localUtil.ntoc( A890EscMCan, (byte)(11), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtEscMCan_Enabled!=0) ? localUtil.format( A890EscMCan, "ZZZZZ9.9999") : localUtil.format( A890EscMCan, "ZZZZZ9.9999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,98);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEscMCan_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtEscMCan_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(89),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_120_" + sGXsfl_89_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 99,'',false,'" + sGXsfl_89_idx + "',89)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForPrdUMe_Internalname,GXutil.ltrim( localUtil.ntoc( A490ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtForPrdUMe_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A490ForPrdUMe), "9") : localUtil.format( DecimalUtil.doubleToDec(A490ForPrdUMe), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,99);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtForPrdUMe_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtForPrdUMe_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(89),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForPrdDsc_Internalname,GXutil.rtrim( A488ForPrdDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtForPrdDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtForPrdDsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(89),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_120_" + sGXsfl_89_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 101,'',false,'" + sGXsfl_89_idx + "',89)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEscMCos_Internalname,GXutil.ltrim( localUtil.ntoc( A891EscMCos, (byte)(15), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtEscMCos_Enabled!=0) ? localUtil.format( A891EscMCos, "ZZZZZZZZ9.99999") : localUtil.format( A891EscMCos, "ZZZZZZZZ9.99999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,101);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEscMCos_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtEscMCos_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(15),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(89),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEscMCosL_Internalname,GXutil.ltrim( localUtil.ntoc( A892EscMCosL, (byte)(15), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtEscMCosL_Enabled!=0) ? localUtil.format( A892EscMCosL, "ZZZZZZZZ9.99999") : localUtil.format( A892EscMCosL, "ZZZZZZZZ9.99999"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEscMCosL_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtEscMCosL_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(15),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(89),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_120_" + sGXsfl_89_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 103,'',false,'" + sGXsfl_89_idx + "',89)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEscMCliCod_Internalname,GXutil.ltrim( localUtil.ntoc( A4707EscMCliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtEscMCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4707EscMCliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4707EscMCliCod), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,103);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEscMCliCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtEscMCliCod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(89),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_120_" + sGXsfl_89_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 104,'',false,'" + sGXsfl_89_idx + "',89)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEscMArtCod_Internalname,GXutil.rtrim( A4708EscMArtCod),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,104);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEscMArtCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtEscMArtCod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(89),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_120_" + sGXsfl_89_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 105,'',false,'" + sGXsfl_89_idx + "',89)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEscMMdlCod_Internalname,GXutil.rtrim( A4709EscMMdlCod),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,105);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEscMMdlCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtEscMMdlCod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(89),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_120_" + sGXsfl_89_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 106,'',false,'" + sGXsfl_89_idx + "',89)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEscMProCod_Internalname,GXutil.rtrim( A4710EscMProCod),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,106);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEscMProCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtEscMProCod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(89),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_120_" + sGXsfl_89_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 107,'',false,'" + sGXsfl_89_idx + "',89)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEscMFasCod_Internalname,GXutil.rtrim( A4711EscMFasCod),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,107);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEscMFasCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtEscMFasCod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(89),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_120_" + sGXsfl_89_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 108,'',false,'" + sGXsfl_89_idx + "',89)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEscMFacCon_Internalname,GXutil.ltrim( localUtil.ntoc( A4712EscMFacCon, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtEscMFacCon_Enabled!=0) ? localUtil.format( A4712EscMFacCon, "ZZZZZ9.99999") : localUtil.format( A4712EscMFacCon, "ZZZZZ9.99999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,108);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEscMFacCon_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtEscMFacCon_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(89),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_120_" + sGXsfl_89_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 109,'',false,'" + sGXsfl_89_idx + "',89)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEscMRb_Internalname,GXutil.ltrim( localUtil.ntoc( A4713EscMRb, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtEscMRb_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4713EscMRb), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4713EscMRb), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,109);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEscMRb_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtEscMRb_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(89),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_120_" + sGXsfl_89_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 110,'',false,'" + sGXsfl_89_idx + "',89)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEscSol_Internalname,GXutil.ltrim( localUtil.ntoc( A6060EscSol, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtEscSol_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6060EscSol), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6060EscSol), "ZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,110);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEscSol_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtEscSol_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(89),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_120_" + sGXsfl_89_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 111,'',false,'" + sGXsfl_89_idx + "',89)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEscVolm_Internalname,GXutil.ltrim( localUtil.ntoc( A7584EscVolm, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtEscVolm_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A7584EscVolm), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A7584EscVolm), "ZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,111);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEscVolm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtEscVolm_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(89),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_120_" + sGXsfl_89_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 112,'',false,'" + sGXsfl_89_idx + "',89)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEscOrdn_Internalname,GXutil.ltrim( localUtil.ntoc( A7583EscOrdn, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtEscOrdn_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A7583EscOrdn), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A7583EscOrdn), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,112);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEscOrdn_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtEscOrdn_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(89),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_120_" + sGXsfl_89_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 113,'',false,'" + sGXsfl_89_idx + "',89)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEscMCant_Internalname,GXutil.ltrim( localUtil.ntoc( A10363EscMCant, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtEscMCant_Enabled!=0) ? localUtil.format( A10363EscMCant, "ZZZZZZ9.999") : localUtil.format( A10363EscMCant, "ZZZZZZ9.999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onblur(this,113);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEscMCant_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtEscMCant_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(89),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Gridlevel_level1Row);
      send_integrity_lvl_hashes2W120( ) ;
      GXCCtl = "Z887EscMLin_" + sGXsfl_89_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z887EscMLin, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z897EscMDsc_" + sGXsfl_89_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z897EscMDsc));
      GXCCtl = "Z889EscMPrdPre_" + sGXsfl_89_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z889EscMPrdPre, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z890EscMCan_" + sGXsfl_89_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z890EscMCan, (byte)(11), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z891EscMCos_" + sGXsfl_89_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z891EscMCos, (byte)(15), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z4707EscMCliCod_" + sGXsfl_89_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z4707EscMCliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z4708EscMArtCod_" + sGXsfl_89_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z4708EscMArtCod));
      GXCCtl = "Z4709EscMMdlCod_" + sGXsfl_89_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z4709EscMMdlCod));
      GXCCtl = "Z4710EscMProCod_" + sGXsfl_89_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z4710EscMProCod));
      GXCCtl = "Z4711EscMFasCod_" + sGXsfl_89_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z4711EscMFasCod));
      GXCCtl = "Z4712EscMFacCon_" + sGXsfl_89_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z4712EscMFacCon, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z4713EscMRb_" + sGXsfl_89_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z4713EscMRb, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z6060EscSol_" + sGXsfl_89_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z6060EscSol, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z7584EscVolm_" + sGXsfl_89_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z7584EscVolm, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z7583EscOrdn_" + sGXsfl_89_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z7583EscOrdn, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z10363EscMCant_" + sGXsfl_89_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z10363EscMCant, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z719PrdNum_" + sGXsfl_89_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z719PrdNum));
      GXCCtl = "Z764ProForCod_" + sGXsfl_89_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z764ProForCod));
      GXCCtl = "Z490ForPrdUMe_" + sGXsfl_89_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z490ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O891EscMCos_" + sGXsfl_89_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O891EscMCos, (byte)(15), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_120_" + sGXsfl_89_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_120, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_120_" + sGXsfl_89_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_120, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_120_" + sGXsfl_89_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_120, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ESCMLIN_"+sGXsfl_89_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEscMLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDNUM_"+sGXsfl_89_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNum_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDNOM_"+sGXsfl_89_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNom_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDPREACT_"+sGXsfl_89_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdPreAct_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PROFORCOD_"+sGXsfl_89_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PROFORDSC_"+sGXsfl_89_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ESCMDSC_"+sGXsfl_89_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEscMDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ESCMPRDPRE_"+sGXsfl_89_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEscMPrdPre_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ESCMCAN_"+sGXsfl_89_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEscMCan_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FORPRDUME_"+sGXsfl_89_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForPrdUMe_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FORPRDDSC_"+sGXsfl_89_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForPrdDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ESCMCOS_"+sGXsfl_89_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEscMCos_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ESCMCOSL_"+sGXsfl_89_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEscMCosL_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ESCMCLICOD_"+sGXsfl_89_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEscMCliCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ESCMARTCOD_"+sGXsfl_89_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEscMArtCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ESCMMDLCOD_"+sGXsfl_89_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEscMMdlCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ESCMPROCOD_"+sGXsfl_89_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEscMProCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ESCMFASCOD_"+sGXsfl_89_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEscMFasCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ESCMFACCON_"+sGXsfl_89_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEscMFacCon_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ESCMRB_"+sGXsfl_89_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEscMRb_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ESCSOL_"+sGXsfl_89_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEscSol_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ESCVOLM_"+sGXsfl_89_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEscVolm_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ESCORDN_"+sGXsfl_89_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEscOrdn_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ESCMCANT_"+sGXsfl_89_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEscMCant_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Gridlevel_level1Container.AddRow(Gridlevel_level1Row);
   }

   public void readRow2W120( )
   {
      nGXsfl_89_idx = (int)(nGXsfl_89_idx+1) ;
      sGXsfl_89_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_89_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_89120( ) ;
      edtEscMLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ESCMLIN_"+sGXsfl_89_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPrdNum_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDNUM_"+sGXsfl_89_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPrdNom_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDNOM_"+sGXsfl_89_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPrdPreAct_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDPREACT_"+sGXsfl_89_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtProForCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROFORCOD_"+sGXsfl_89_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtProForDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROFORDSC_"+sGXsfl_89_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtEscMDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ESCMDSC_"+sGXsfl_89_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtEscMPrdPre_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ESCMPRDPRE_"+sGXsfl_89_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtEscMCan_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ESCMCAN_"+sGXsfl_89_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtForPrdUMe_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FORPRDUME_"+sGXsfl_89_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtForPrdDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FORPRDDSC_"+sGXsfl_89_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtEscMCos_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ESCMCOS_"+sGXsfl_89_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtEscMCosL_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ESCMCOSL_"+sGXsfl_89_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtEscMCliCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ESCMCLICOD_"+sGXsfl_89_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtEscMArtCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ESCMARTCOD_"+sGXsfl_89_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtEscMMdlCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ESCMMDLCOD_"+sGXsfl_89_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtEscMProCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ESCMPROCOD_"+sGXsfl_89_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtEscMFasCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ESCMFASCOD_"+sGXsfl_89_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtEscMFacCon_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ESCMFACCON_"+sGXsfl_89_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtEscMRb_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ESCMRB_"+sGXsfl_89_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtEscSol_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ESCSOL_"+sGXsfl_89_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtEscVolm_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ESCVOLM_"+sGXsfl_89_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtEscOrdn_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ESCORDN_"+sGXsfl_89_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtEscMCant_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ESCMCANT_"+sGXsfl_89_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtEscMLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtEscMLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
      {
         GXCCtl = "ESCMLIN_" + sGXsfl_89_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtEscMLin_Internalname ;
         wbErr = true ;
         A887EscMLin = 0 ;
      }
      else
      {
         A887EscMLin = (int)(localUtil.ctol( httpContext.cgiGet( edtEscMLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A719PrdNum = httpContext.cgiGet( edtPrdNum_Internalname) ;
      A718PrdNom = httpContext.cgiGet( edtPrdNom_Internalname) ;
      A724PrdPreAct = localUtil.ctond( httpContext.cgiGet( edtPrdPreAct_Internalname)) ;
      A764ProForCod = httpContext.cgiGet( edtProForCod_Internalname) ;
      A766ProForDsc = httpContext.cgiGet( edtProForDsc_Internalname) ;
      A897EscMDsc = httpContext.cgiGet( edtEscMDsc_Internalname) ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtEscMPrdPre_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtEscMPrdPre_Internalname)), DecimalUtil.stringToDec("99999999.99999")) > 0 ) ) )
      {
         GXCCtl = "ESCMPRDPRE_" + sGXsfl_89_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtEscMPrdPre_Internalname ;
         wbErr = true ;
         A889EscMPrdPre = DecimalUtil.ZERO ;
      }
      else
      {
         A889EscMPrdPre = localUtil.ctond( httpContext.cgiGet( edtEscMPrdPre_Internalname)) ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtEscMCan_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtEscMCan_Internalname)), DecimalUtil.stringToDec("999999.9999")) > 0 ) ) )
      {
         GXCCtl = "ESCMCAN_" + sGXsfl_89_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtEscMCan_Internalname ;
         wbErr = true ;
         A890EscMCan = DecimalUtil.ZERO ;
      }
      else
      {
         A890EscMCan = localUtil.ctond( httpContext.cgiGet( edtEscMCan_Internalname)) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtForPrdUMe_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtForPrdUMe_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
      {
         GXCCtl = "FORPRDUME_" + sGXsfl_89_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtForPrdUMe_Internalname ;
         wbErr = true ;
         A490ForPrdUMe = (byte)(0) ;
      }
      else
      {
         A490ForPrdUMe = (byte)(localUtil.ctol( httpContext.cgiGet( edtForPrdUMe_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A488ForPrdDsc = httpContext.cgiGet( edtForPrdDsc_Internalname) ;
      n488ForPrdDsc = false ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtEscMCos_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtEscMCos_Internalname)), DecimalUtil.stringToDec("999999999.99999")) > 0 ) ) )
      {
         GXCCtl = "ESCMCOS_" + sGXsfl_89_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtEscMCos_Internalname ;
         wbErr = true ;
         A891EscMCos = DecimalUtil.ZERO ;
      }
      else
      {
         A891EscMCos = localUtil.ctond( httpContext.cgiGet( edtEscMCos_Internalname)) ;
      }
      A892EscMCosL = localUtil.ctond( httpContext.cgiGet( edtEscMCosL_Internalname)) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtEscMCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtEscMCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
      {
         GXCCtl = "ESCMCLICOD_" + sGXsfl_89_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtEscMCliCod_Internalname ;
         wbErr = true ;
         A4707EscMCliCod = 0 ;
      }
      else
      {
         A4707EscMCliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtEscMCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A4708EscMArtCod = httpContext.cgiGet( edtEscMArtCod_Internalname) ;
      A4709EscMMdlCod = httpContext.cgiGet( edtEscMMdlCod_Internalname) ;
      A4710EscMProCod = httpContext.cgiGet( edtEscMProCod_Internalname) ;
      A4711EscMFasCod = httpContext.cgiGet( edtEscMFasCod_Internalname) ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtEscMFacCon_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtEscMFacCon_Internalname)), DecimalUtil.stringToDec("999999.99999")) > 0 ) ) )
      {
         GXCCtl = "ESCMFACCON_" + sGXsfl_89_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtEscMFacCon_Internalname ;
         wbErr = true ;
         A4712EscMFacCon = DecimalUtil.ZERO ;
      }
      else
      {
         A4712EscMFacCon = localUtil.ctond( httpContext.cgiGet( edtEscMFacCon_Internalname)) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtEscMRb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtEscMRb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "ESCMRB_" + sGXsfl_89_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtEscMRb_Internalname ;
         wbErr = true ;
         A4713EscMRb = (short)(0) ;
      }
      else
      {
         A4713EscMRb = (short)(localUtil.ctol( httpContext.cgiGet( edtEscMRb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtEscSol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtEscSol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999 ) ) )
      {
         GXCCtl = "ESCSOL_" + sGXsfl_89_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtEscSol_Internalname ;
         wbErr = true ;
         A6060EscSol = 0 ;
      }
      else
      {
         A6060EscSol = (int)(localUtil.ctol( httpContext.cgiGet( edtEscSol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtEscVolm_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtEscVolm_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999 ) ) )
      {
         GXCCtl = "ESCVOLM_" + sGXsfl_89_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtEscVolm_Internalname ;
         wbErr = true ;
         A7584EscVolm = 0 ;
      }
      else
      {
         A7584EscVolm = (int)(localUtil.ctol( httpContext.cgiGet( edtEscVolm_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtEscOrdn_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtEscOrdn_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "ESCORDN_" + sGXsfl_89_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtEscOrdn_Internalname ;
         wbErr = true ;
         A7583EscOrdn = (short)(0) ;
      }
      else
      {
         A7583EscOrdn = (short)(localUtil.ctol( httpContext.cgiGet( edtEscOrdn_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtEscMCant_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtEscMCant_Internalname)), DecimalUtil.stringToDec("9999999.999")) > 0 ) ) )
      {
         GXCCtl = "ESCMCANT_" + sGXsfl_89_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtEscMCant_Internalname ;
         wbErr = true ;
         A10363EscMCant = DecimalUtil.ZERO ;
      }
      else
      {
         A10363EscMCant = localUtil.ctond( httpContext.cgiGet( edtEscMCant_Internalname)) ;
      }
      GXCCtl = "Z887EscMLin_" + sGXsfl_89_idx ;
      Z887EscMLin = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z897EscMDsc_" + sGXsfl_89_idx ;
      Z897EscMDsc = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z889EscMPrdPre_" + sGXsfl_89_idx ;
      Z889EscMPrdPre = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z890EscMCan_" + sGXsfl_89_idx ;
      Z890EscMCan = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z891EscMCos_" + sGXsfl_89_idx ;
      Z891EscMCos = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z4707EscMCliCod_" + sGXsfl_89_idx ;
      Z4707EscMCliCod = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z4708EscMArtCod_" + sGXsfl_89_idx ;
      Z4708EscMArtCod = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z4709EscMMdlCod_" + sGXsfl_89_idx ;
      Z4709EscMMdlCod = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z4710EscMProCod_" + sGXsfl_89_idx ;
      Z4710EscMProCod = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z4711EscMFasCod_" + sGXsfl_89_idx ;
      Z4711EscMFasCod = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z4712EscMFacCon_" + sGXsfl_89_idx ;
      Z4712EscMFacCon = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z4713EscMRb_" + sGXsfl_89_idx ;
      Z4713EscMRb = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z6060EscSol_" + sGXsfl_89_idx ;
      Z6060EscSol = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z7584EscVolm_" + sGXsfl_89_idx ;
      Z7584EscVolm = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z7583EscOrdn_" + sGXsfl_89_idx ;
      Z7583EscOrdn = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z10363EscMCant_" + sGXsfl_89_idx ;
      Z10363EscMCant = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z719PrdNum_" + sGXsfl_89_idx ;
      Z719PrdNum = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z764ProForCod_" + sGXsfl_89_idx ;
      Z764ProForCod = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z490ForPrdUMe_" + sGXsfl_89_idx ;
      Z490ForPrdUMe = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "O891EscMCos_" + sGXsfl_89_idx ;
      O891EscMCos = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "nRcdDeleted_120_" + sGXsfl_89_idx ;
      nRcdDeleted_120 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_120_" + sGXsfl_89_idx ;
      nRcdExists_120 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_120_" + sGXsfl_89_idx ;
      nIsMod_120 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtEscMLin_Enabled = edtEscMLin_Enabled ;
   }

   public void confirmValues2W0( )
   {
      nGXsfl_89_idx = 0 ;
      sGXsfl_89_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_89_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_89120( ) ;
      while ( nGXsfl_89_idx < nRC_GXsfl_89 )
      {
         nGXsfl_89_idx = (int)(nGXsfl_89_idx+1) ;
         sGXsfl_89_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_89_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_89120( ) ;
         httpContext.changePostValue( "Z887EscMLin_"+sGXsfl_89_idx, httpContext.cgiGet( "ZT_"+"Z887EscMLin_"+sGXsfl_89_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z887EscMLin_"+sGXsfl_89_idx) ;
         httpContext.changePostValue( "Z897EscMDsc_"+sGXsfl_89_idx, httpContext.cgiGet( "ZT_"+"Z897EscMDsc_"+sGXsfl_89_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z897EscMDsc_"+sGXsfl_89_idx) ;
         httpContext.changePostValue( "Z889EscMPrdPre_"+sGXsfl_89_idx, httpContext.cgiGet( "ZT_"+"Z889EscMPrdPre_"+sGXsfl_89_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z889EscMPrdPre_"+sGXsfl_89_idx) ;
         httpContext.changePostValue( "Z890EscMCan_"+sGXsfl_89_idx, httpContext.cgiGet( "ZT_"+"Z890EscMCan_"+sGXsfl_89_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z890EscMCan_"+sGXsfl_89_idx) ;
         httpContext.changePostValue( "Z891EscMCos_"+sGXsfl_89_idx, httpContext.cgiGet( "ZT_"+"Z891EscMCos_"+sGXsfl_89_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z891EscMCos_"+sGXsfl_89_idx) ;
         httpContext.changePostValue( "Z4707EscMCliCod_"+sGXsfl_89_idx, httpContext.cgiGet( "ZT_"+"Z4707EscMCliCod_"+sGXsfl_89_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4707EscMCliCod_"+sGXsfl_89_idx) ;
         httpContext.changePostValue( "Z4708EscMArtCod_"+sGXsfl_89_idx, httpContext.cgiGet( "ZT_"+"Z4708EscMArtCod_"+sGXsfl_89_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4708EscMArtCod_"+sGXsfl_89_idx) ;
         httpContext.changePostValue( "Z4709EscMMdlCod_"+sGXsfl_89_idx, httpContext.cgiGet( "ZT_"+"Z4709EscMMdlCod_"+sGXsfl_89_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4709EscMMdlCod_"+sGXsfl_89_idx) ;
         httpContext.changePostValue( "Z4710EscMProCod_"+sGXsfl_89_idx, httpContext.cgiGet( "ZT_"+"Z4710EscMProCod_"+sGXsfl_89_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4710EscMProCod_"+sGXsfl_89_idx) ;
         httpContext.changePostValue( "Z4711EscMFasCod_"+sGXsfl_89_idx, httpContext.cgiGet( "ZT_"+"Z4711EscMFasCod_"+sGXsfl_89_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4711EscMFasCod_"+sGXsfl_89_idx) ;
         httpContext.changePostValue( "Z4712EscMFacCon_"+sGXsfl_89_idx, httpContext.cgiGet( "ZT_"+"Z4712EscMFacCon_"+sGXsfl_89_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4712EscMFacCon_"+sGXsfl_89_idx) ;
         httpContext.changePostValue( "Z4713EscMRb_"+sGXsfl_89_idx, httpContext.cgiGet( "ZT_"+"Z4713EscMRb_"+sGXsfl_89_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4713EscMRb_"+sGXsfl_89_idx) ;
         httpContext.changePostValue( "Z6060EscSol_"+sGXsfl_89_idx, httpContext.cgiGet( "ZT_"+"Z6060EscSol_"+sGXsfl_89_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6060EscSol_"+sGXsfl_89_idx) ;
         httpContext.changePostValue( "Z7584EscVolm_"+sGXsfl_89_idx, httpContext.cgiGet( "ZT_"+"Z7584EscVolm_"+sGXsfl_89_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7584EscVolm_"+sGXsfl_89_idx) ;
         httpContext.changePostValue( "Z7583EscOrdn_"+sGXsfl_89_idx, httpContext.cgiGet( "ZT_"+"Z7583EscOrdn_"+sGXsfl_89_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7583EscOrdn_"+sGXsfl_89_idx) ;
         httpContext.changePostValue( "Z10363EscMCant_"+sGXsfl_89_idx, httpContext.cgiGet( "ZT_"+"Z10363EscMCant_"+sGXsfl_89_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10363EscMCant_"+sGXsfl_89_idx) ;
         httpContext.changePostValue( "Z719PrdNum_"+sGXsfl_89_idx, httpContext.cgiGet( "ZT_"+"Z719PrdNum_"+sGXsfl_89_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z719PrdNum_"+sGXsfl_89_idx) ;
         httpContext.changePostValue( "Z764ProForCod_"+sGXsfl_89_idx, httpContext.cgiGet( "ZT_"+"Z764ProForCod_"+sGXsfl_89_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z764ProForCod_"+sGXsfl_89_idx) ;
         httpContext.changePostValue( "Z490ForPrdUMe_"+sGXsfl_89_idx, httpContext.cgiGet( "ZT_"+"Z490ForPrdUMe_"+sGXsfl_89_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z490ForPrdUMe_"+sGXsfl_89_idx) ;
      }
      httpContext.changePostValue( "O891EscMCos", httpContext.cgiGet( "T891EscMCos")) ;
      httpContext.deletePostValue( "T891EscMCos") ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.formulaciontinte.tescand", new String[] {}, new String[] {}) +"\">") ;
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
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z910Workstat", GXutil.rtrim( Z910Workstat));
      app.GxWebStd.gx_hidden_field( httpContext, "Z881EscMTxt1", GXutil.rtrim( Z881EscMTxt1));
      app.GxWebStd.gx_hidden_field( httpContext, "Z882EscMTxt2", GXutil.rtrim( Z882EscMTxt2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z883EscMInc", GXutil.ltrim( localUtil.ntoc( Z883EscMInc, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z884EscMKgm", GXutil.ltrim( localUtil.ntoc( Z884EscMKgm, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z885EscMVol", GXutil.ltrim( localUtil.ntoc( Z885EscMVol, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z886EscMUltLin", GXutil.ltrim( localUtil.ntoc( Z886EscMUltLin, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z896EscMValCos", GXutil.ltrim( localUtil.ntoc( Z896EscMValCos, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O893EscMCosT", GXutil.ltrim( localUtil.ntoc( O893EscMCosT, (byte)(15), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_89", GXutil.ltrim( localUtil.ntoc( nGXsfl_89_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV52DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV52DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vEMPRCOD_DATA", AV59EmprCod_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vEMPRCOD_DATA", AV59EmprCod_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vPRDNUM_DATA", AV51PrdNum_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vPRDNUM_DATA", AV51PrdNum_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vPROFORCOD_DATA", AV57ProForCod_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vPROFORCOD_DATA", AV57ProForCod_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vFORPRDUME_DATA", AV58ForPrdUMe_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vFORPRDUME_DATA", AV58ForPrdUMe_Data);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_EMPRCOD_Objectcall", GXutil.rtrim( Combo_emprcod_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_EMPRCOD_Cls", GXutil.rtrim( Combo_emprcod_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_EMPRCOD_Enabled", GXutil.booltostr( Combo_emprcod_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_EMPRCOD_Datalistproc", GXutil.rtrim( Combo_emprcod_Datalistproc));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_EMPRCOD_Datalistprocparametersprefix", GXutil.rtrim( Combo_emprcod_Datalistprocparametersprefix));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_EMPRCOD_Emptyitem", GXutil.booltostr( Combo_emprcod_Emptyitem));
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
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PRDNUM_Objectcall", GXutil.rtrim( Combo_prdnum_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PRDNUM_Cls", GXutil.rtrim( Combo_prdnum_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PRDNUM_Enabled", GXutil.booltostr( Combo_prdnum_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PRDNUM_Isgriditem", GXutil.booltostr( Combo_prdnum_Isgriditem));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PRDNUM_Hasdescription", GXutil.booltostr( Combo_prdnum_Hasdescription));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PRDNUM_Datalistproc", GXutil.rtrim( Combo_prdnum_Datalistproc));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PROFORCOD_Objectcall", GXutil.rtrim( Combo_proforcod_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PROFORCOD_Cls", GXutil.rtrim( Combo_proforcod_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PROFORCOD_Enabled", GXutil.booltostr( Combo_proforcod_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PROFORCOD_Isgriditem", GXutil.booltostr( Combo_proforcod_Isgriditem));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PROFORCOD_Hasdescription", GXutil.booltostr( Combo_proforcod_Hasdescription));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PROFORCOD_Datalistproc", GXutil.rtrim( Combo_proforcod_Datalistproc));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_FORPRDUME_Objectcall", GXutil.rtrim( Combo_forprdume_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_FORPRDUME_Cls", GXutil.rtrim( Combo_forprdume_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_FORPRDUME_Enabled", GXutil.booltostr( Combo_forprdume_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_FORPRDUME_Isgriditem", GXutil.booltostr( Combo_forprdume_Isgriditem));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_FORPRDUME_Hasdescription", GXutil.booltostr( Combo_forprdume_Hasdescription));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_FORPRDUME_Datalistproc", GXutil.rtrim( Combo_forprdume_Datalistproc));
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
      return formatLink("app.formulaciontinte.tescand", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "FormulacionTinte.TESCAND" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "SIMULACION COSTE FORMULA II", "") ;
   }

   public void initializeNonKey2W118( )
   {
      A407EmprNom = "" ;
      n407EmprNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      A881EscMTxt1 = "" ;
      n881EscMTxt1 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A881EscMTxt1", A881EscMTxt1);
      A882EscMTxt2 = "" ;
      n882EscMTxt2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A882EscMTxt2", A882EscMTxt2);
      A883EscMInc = DecimalUtil.ZERO ;
      n883EscMInc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A883EscMInc", GXutil.ltrimstr( A883EscMInc, 5, 2));
      A884EscMKgm = DecimalUtil.ZERO ;
      n884EscMKgm = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A884EscMKgm", GXutil.ltrimstr( A884EscMKgm, 10, 2));
      A885EscMVol = 0 ;
      n885EscMVol = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A885EscMVol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A885EscMVol), 5, 0));
      A886EscMUltLin = 0 ;
      n886EscMUltLin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A886EscMUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A886EscMUltLin), 8, 0));
      A896EscMValCos = 0 ;
      n896EscMValCos = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A896EscMValCos", GXutil.ltrimstr( DecimalUtil.doubleToDec(A896EscMValCos), 8, 0));
      A3915EmpNumDec = (byte)(0) ;
      n3915EmpNumDec = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3915EmpNumDec", GXutil.str( A3915EmpNumDec, 1, 0));
      A893EscMCosT = DecimalUtil.ZERO ;
      n893EscMCosT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A893EscMCosT", GXutil.ltrimstr( A893EscMCosT, 15, 5));
      O893EscMCosT = A893EscMCosT ;
      n893EscMCosT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A893EscMCosT", GXutil.ltrimstr( A893EscMCosT, 15, 5));
      Z881EscMTxt1 = "" ;
      Z882EscMTxt2 = "" ;
      Z883EscMInc = DecimalUtil.ZERO ;
      Z884EscMKgm = DecimalUtil.ZERO ;
      Z885EscMVol = 0 ;
      Z886EscMUltLin = 0 ;
      Z896EscMValCos = 0 ;
   }

   public void initAll2W118( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A910Workstat = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A910Workstat", A910Workstat);
      initializeNonKey2W118( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey2W120( )
   {
      A892EscMCosL = DecimalUtil.ZERO ;
      A719PrdNum = "" ;
      A718PrdNom = "" ;
      A724PrdPreAct = DecimalUtil.ZERO ;
      A764ProForCod = "" ;
      A766ProForDsc = "" ;
      A897EscMDsc = "" ;
      A889EscMPrdPre = DecimalUtil.ZERO ;
      A890EscMCan = DecimalUtil.ZERO ;
      A490ForPrdUMe = (byte)(0) ;
      A488ForPrdDsc = "" ;
      n488ForPrdDsc = false ;
      A891EscMCos = DecimalUtil.ZERO ;
      A4707EscMCliCod = 0 ;
      A4708EscMArtCod = "" ;
      A4709EscMMdlCod = "" ;
      A4710EscMProCod = "" ;
      A4711EscMFasCod = "" ;
      A4712EscMFacCon = DecimalUtil.ZERO ;
      A4713EscMRb = (short)(0) ;
      A6060EscSol = 0 ;
      A7584EscVolm = 0 ;
      A7583EscOrdn = (short)(0) ;
      A10363EscMCant = DecimalUtil.ZERO ;
      O891EscMCos = A891EscMCos ;
      Z897EscMDsc = "" ;
      Z889EscMPrdPre = DecimalUtil.ZERO ;
      Z890EscMCan = DecimalUtil.ZERO ;
      Z891EscMCos = DecimalUtil.ZERO ;
      Z4707EscMCliCod = 0 ;
      Z4708EscMArtCod = "" ;
      Z4709EscMMdlCod = "" ;
      Z4710EscMProCod = "" ;
      Z4711EscMFasCod = "" ;
      Z4712EscMFacCon = DecimalUtil.ZERO ;
      Z4713EscMRb = (short)(0) ;
      Z6060EscSol = 0 ;
      Z7584EscVolm = 0 ;
      Z7583EscOrdn = (short)(0) ;
      Z10363EscMCant = DecimalUtil.ZERO ;
      Z719PrdNum = "" ;
      Z764ProForCod = "" ;
      Z490ForPrdUMe = (byte)(0) ;
   }

   public void initAll2W120( )
   {
      A887EscMLin = 0 ;
      initializeNonKey2W120( ) ;
   }

   public void standaloneModalInsert2W120( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211654157", true, true);
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
      httpContext.AddJavascriptSource("formulaciontinte/tescand.js", "?20268211654158", false, true);
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties120( )
   {
      edtEscMLin_Enabled = defedtEscMLin_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtEscMLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEscMLin_Enabled), 5, 0), !bGXsfl_89_Refreshing);
   }

   public void startgridcontrol89( )
   {
      Gridlevel_level1Container.AddObjectProperty("GridName", "Gridlevel_level1");
      Gridlevel_level1Container.AddObjectProperty("Header", subGridlevel_level1_Header);
      Gridlevel_level1Container.AddObjectProperty("Class", "GridNoBorder WorkWith");
      Gridlevel_level1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridlevel_level1_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddObjectProperty("CmpContext", "");
      Gridlevel_level1Container.AddObjectProperty("InMasterPage", "false");
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A887EscMLin, (byte)(8), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtEscMLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A719PrdNum));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNum_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A718PrdNom));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNom_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A724PrdPreAct, (byte)(14), (byte)(5), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdPreAct_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A764ProForCod));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtProForCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A766ProForDsc));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtProForDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A897EscMDsc));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtEscMDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A889EscMPrdPre, (byte)(14), (byte)(5), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtEscMPrdPre_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A890EscMCan, (byte)(11), (byte)(4), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtEscMCan_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A490ForPrdUMe, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtForPrdUMe_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A488ForPrdDsc));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtForPrdDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A891EscMCos, (byte)(15), (byte)(5), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtEscMCos_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A892EscMCosL, (byte)(15), (byte)(5), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtEscMCosL_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4707EscMCliCod, (byte)(6), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtEscMCliCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A4708EscMArtCod));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtEscMArtCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A4709EscMMdlCod));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtEscMMdlCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A4710EscMProCod));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtEscMProCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A4711EscMFasCod));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtEscMFasCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4712EscMFacCon, (byte)(12), (byte)(5), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtEscMFacCon_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4713EscMRb, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtEscMRb_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6060EscSol, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtEscSol_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A7584EscVolm, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtEscVolm_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A7583EscOrdn, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtEscOrdn_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10363EscMCant, (byte)(11), (byte)(3), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtEscMCant_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Container.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGridlevel_level1_Selectedindex, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGridlevel_level1_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGridlevel_level1_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGridlevel_level1_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGridlevel_level1_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGridlevel_level1_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGridlevel_level1_Collapsed, (byte)(1), (byte)(0), ".", "")));
   }

   public void init_default_properties( )
   {
      lblTextblockemprcod_Internalname = "TEXTBLOCKEMPRCOD" ;
      Combo_emprcod_Internalname = "COMBO_EMPRCOD" ;
      edtEmprCod_Internalname = "EMPRCOD" ;
      divTablesplittedemprcod_Internalname = "TABLESPLITTEDEMPRCOD" ;
      edtWorkstat_Internalname = "WORKSTAT" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      edtEscMTxt1_Internalname = "ESCMTXT1" ;
      edtEscMTxt2_Internalname = "ESCMTXT2" ;
      edtEscMInc_Internalname = "ESCMINC" ;
      edtEscMKgm_Internalname = "ESCMKGM" ;
      edtEscMVol_Internalname = "ESCMVOL" ;
      edtEscMUltLin_Internalname = "ESCMULTLIN" ;
      edtEscMValCos_Internalname = "ESCMVALCOS" ;
      edtEmpNumDec_Internalname = "EMPNUMDEC" ;
      edtEscMCosT_Internalname = "ESCMCOST" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      edtEscMLin_Internalname = "ESCMLIN" ;
      edtPrdNum_Internalname = "PRDNUM" ;
      edtPrdNom_Internalname = "PRDNOM" ;
      edtPrdPreAct_Internalname = "PRDPREACT" ;
      edtProForCod_Internalname = "PROFORCOD" ;
      edtProForDsc_Internalname = "PROFORDSC" ;
      edtEscMDsc_Internalname = "ESCMDSC" ;
      edtEscMPrdPre_Internalname = "ESCMPRDPRE" ;
      edtEscMCan_Internalname = "ESCMCAN" ;
      edtForPrdUMe_Internalname = "FORPRDUME" ;
      edtForPrdDsc_Internalname = "FORPRDDSC" ;
      edtEscMCos_Internalname = "ESCMCOS" ;
      edtEscMCosL_Internalname = "ESCMCOSL" ;
      edtEscMCliCod_Internalname = "ESCMCLICOD" ;
      edtEscMArtCod_Internalname = "ESCMARTCOD" ;
      edtEscMMdlCod_Internalname = "ESCMMDLCOD" ;
      edtEscMProCod_Internalname = "ESCMPROCOD" ;
      edtEscMFasCod_Internalname = "ESCMFASCOD" ;
      edtEscMFacCon_Internalname = "ESCMFACCON" ;
      edtEscMRb_Internalname = "ESCMRB" ;
      edtEscSol_Internalname = "ESCSOL" ;
      edtEscVolm_Internalname = "ESCVOLM" ;
      edtEscOrdn_Internalname = "ESCORDN" ;
      edtEscMCant_Internalname = "ESCMCANT" ;
      divTableleaflevel_level1_Internalname = "TABLELEAFLEVEL_LEVEL1" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      bttBtntrn_delete_Internalname = "BTNTRN_DELETE" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtavComboemprcod_Internalname = "vCOMBOEMPRCOD" ;
      divSectionattribute_emprcod_Internalname = "SECTIONATTRIBUTE_EMPRCOD" ;
      Combo_prdnum_Internalname = "COMBO_PRDNUM" ;
      Combo_proforcod_Internalname = "COMBO_PROFORCOD" ;
      Combo_forprdume_Internalname = "COMBO_FORPRDUME" ;
      divHtml_bottomauxiliarcontrols_Internalname = "HTML_BOTTOMAUXILIARCONTROLS" ;
      divLayoutmaintable_Internalname = "LAYOUTMAINTABLE" ;
      Form.setInternalname( "FORM" );
      subGridlevel_level1_Internalname = "GRIDLEVEL_LEVEL1" ;
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
      subGridlevel_level1_Allowcollapsing = (byte)(0) ;
      subGridlevel_level1_Allowselection = (byte)(0) ;
      subGridlevel_level1_Header = "" ;
      Combo_forprdume_Enabled = GXutil.toBoolean( -1) ;
      Combo_proforcod_Enabled = GXutil.toBoolean( -1) ;
      Combo_prdnum_Enabled = GXutil.toBoolean( -1) ;
      Combo_emprcod_Enabled = GXutil.toBoolean( -1) ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "SIMULACION COSTE FORMULA II", "") );
      edtEscMCant_Jsonclick = "" ;
      edtEscOrdn_Jsonclick = "" ;
      edtEscVolm_Jsonclick = "" ;
      edtEscSol_Jsonclick = "" ;
      edtEscMRb_Jsonclick = "" ;
      edtEscMFacCon_Jsonclick = "" ;
      edtEscMFasCod_Jsonclick = "" ;
      edtEscMProCod_Jsonclick = "" ;
      edtEscMMdlCod_Jsonclick = "" ;
      edtEscMArtCod_Jsonclick = "" ;
      edtEscMCliCod_Jsonclick = "" ;
      edtEscMCosL_Jsonclick = "" ;
      edtEscMCos_Jsonclick = "" ;
      edtForPrdDsc_Jsonclick = "" ;
      edtForPrdUMe_Jsonclick = "" ;
      edtEscMCan_Jsonclick = "" ;
      edtEscMPrdPre_Jsonclick = "" ;
      edtEscMDsc_Jsonclick = "" ;
      edtProForDsc_Jsonclick = "" ;
      edtProForCod_Jsonclick = "" ;
      edtPrdPreAct_Jsonclick = "" ;
      edtPrdNom_Jsonclick = "" ;
      edtPrdNum_Jsonclick = "" ;
      edtEscMLin_Jsonclick = "" ;
      subGridlevel_level1_Class = "GridNoBorder WorkWith" ;
      subGridlevel_level1_Backcolorstyle = (byte)(0) ;
      edtEscMCant_Enabled = 1 ;
      edtEscOrdn_Enabled = 1 ;
      edtEscVolm_Enabled = 1 ;
      edtEscSol_Enabled = 1 ;
      edtEscMRb_Enabled = 1 ;
      edtEscMFacCon_Enabled = 1 ;
      edtEscMFasCod_Enabled = 1 ;
      edtEscMProCod_Enabled = 1 ;
      edtEscMMdlCod_Enabled = 1 ;
      edtEscMArtCod_Enabled = 1 ;
      edtEscMCliCod_Enabled = 1 ;
      edtEscMCosL_Enabled = 0 ;
      edtEscMCos_Enabled = 1 ;
      edtForPrdDsc_Enabled = 0 ;
      edtForPrdUMe_Enabled = 1 ;
      edtEscMCan_Enabled = 1 ;
      edtEscMPrdPre_Enabled = 1 ;
      edtEscMDsc_Enabled = 1 ;
      edtProForDsc_Enabled = 0 ;
      edtProForCod_Enabled = 1 ;
      edtPrdPreAct_Enabled = 0 ;
      edtPrdNom_Enabled = 0 ;
      edtPrdNum_Enabled = 1 ;
      edtEscMLin_Enabled = 1 ;
      Combo_forprdume_Datalistproc = "TESCANDLoadDVCombo" ;
      Combo_forprdume_Hasdescription = GXutil.toBoolean( -1) ;
      Combo_forprdume_Isgriditem = GXutil.toBoolean( -1) ;
      Combo_forprdume_Cls = "ExtendedCombo" ;
      Combo_forprdume_Caption = "" ;
      Combo_proforcod_Datalistproc = "TESCANDLoadDVCombo" ;
      Combo_proforcod_Hasdescription = GXutil.toBoolean( -1) ;
      Combo_proforcod_Isgriditem = GXutil.toBoolean( -1) ;
      Combo_proforcod_Cls = "ExtendedCombo" ;
      Combo_proforcod_Caption = "" ;
      Combo_prdnum_Datalistproc = "TESCANDLoadDVCombo" ;
      Combo_prdnum_Hasdescription = GXutil.toBoolean( -1) ;
      Combo_prdnum_Isgriditem = GXutil.toBoolean( -1) ;
      Combo_prdnum_Cls = "ExtendedCombo" ;
      Combo_prdnum_Caption = "" ;
      edtavComboemprcod_Jsonclick = "" ;
      edtavComboemprcod_Enabled = 0 ;
      bttBtntrn_delete_Enabled = 1 ;
      bttBtntrn_delete_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      edtEscMCosT_Jsonclick = "" ;
      edtEscMCosT_Enabled = 0 ;
      edtEmpNumDec_Jsonclick = "" ;
      edtEmpNumDec_Enabled = 0 ;
      edtEscMValCos_Jsonclick = "" ;
      edtEscMValCos_Enabled = 1 ;
      edtEscMUltLin_Jsonclick = "" ;
      edtEscMUltLin_Enabled = 1 ;
      edtEscMVol_Jsonclick = "" ;
      edtEscMVol_Enabled = 1 ;
      edtEscMKgm_Jsonclick = "" ;
      edtEscMKgm_Enabled = 1 ;
      edtEscMInc_Jsonclick = "" ;
      edtEscMInc_Enabled = 1 ;
      edtEscMTxt2_Jsonclick = "" ;
      edtEscMTxt2_Enabled = 1 ;
      edtEscMTxt1_Jsonclick = "" ;
      edtEscMTxt1_Enabled = 1 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Enabled = 0 ;
      edtWorkstat_Jsonclick = "" ;
      edtWorkstat_Enabled = 1 ;
      edtEmprCod_Jsonclick = "" ;
      edtEmprCod_Enabled = 1 ;
      Combo_emprcod_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_emprcod_Datalistprocparametersprefix = " \"ComboName\": \"EmprCod\", \"TrnMode\": \"INS\", \"IsDynamicCall\": true, \"EmprCod\": \"\", \"Workstat\": \"\"" ;
      Combo_emprcod_Datalistproc = "TESCANDLoadDVCombo" ;
      Combo_emprcod_Cls = "ExtendedCombo AttributeFL" ;
      Combo_emprcod_Caption = "" ;
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

   public void gxnrgridlevel_level1_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_89120( ) ;
      while ( nGXsfl_89_idx <= nRC_GXsfl_89 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal2W120( ) ;
         standaloneModal2W120( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow2W120( ) ;
         nGXsfl_89_idx = (int)(nGXsfl_89_idx+1) ;
         sGXsfl_89_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_89_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_89120( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Gridlevel_level1Container)) ;
      /* End function gxnrGridlevel_level1_newrow */
   }

   public void init_web_controls( )
   {
      /* End function init_web_controls */
   }

   public void afterkeyloadscreen( )
   {
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      getEqualNoModal( ) ;
      /* Using cursor T002W23 */
      pr_default.execute(18, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(18) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T002W23_A407EmprNom[0] ;
      n407EmprNom = T002W23_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      A3915EmpNumDec = T002W23_A3915EmpNumDec[0] ;
      n3915EmpNumDec = T002W23_n3915EmpNumDec[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A3915EmpNumDec", GXutil.str( A3915EmpNumDec, 1, 0));
      pr_default.close(18);
      /* Using cursor T002W25 */
      pr_default.execute(19, new Object[] {A396EmprCod, A910Workstat});
      if ( (pr_default.getStatus(19) != 101) )
      {
         A893EscMCosT = T002W25_A893EscMCosT[0] ;
         n893EscMCosT = T002W25_n893EscMCosT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A893EscMCosT", GXutil.ltrimstr( A893EscMCosT, 15, 5));
      }
      else
      {
         A893EscMCosT = DecimalUtil.doubleToDec(0) ;
         n893EscMCosT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A893EscMCosT", GXutil.ltrimstr( A893EscMCosT, 15, 5));
      }
      pr_default.close(19);
      GX_FocusControl = edtEscMTxt1_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
      /* End function AfterKeyLoadScreen */
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
      n3915EmpNumDec = false ;
      /* Using cursor T002W23 */
      pr_default.execute(18, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(18) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A407EmprNom = T002W23_A407EmprNom[0] ;
      n407EmprNom = T002W23_n407EmprNom[0] ;
      A3915EmpNumDec = T002W23_A3915EmpNumDec[0] ;
      n3915EmpNumDec = T002W23_n3915EmpNumDec[0] ;
      pr_default.close(18);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A3915EmpNumDec", GXutil.ltrim( localUtil.ntoc( A3915EmpNumDec, (byte)(1), (byte)(0), ".", "")));
   }

   public void valid_Workstat( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      /* Using cursor T002W25 */
      pr_default.execute(19, new Object[] {A396EmprCod, A910Workstat});
      if ( (pr_default.getStatus(19) != 101) )
      {
         A893EscMCosT = T002W25_A893EscMCosT[0] ;
         n893EscMCosT = T002W25_n893EscMCosT[0] ;
      }
      else
      {
         A893EscMCosT = DecimalUtil.doubleToDec(0) ;
         n893EscMCosT = false ;
      }
      pr_default.close(19);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A881EscMTxt1", GXutil.rtrim( A881EscMTxt1));
      httpContext.ajax_rsp_assign_attri("", false, "A882EscMTxt2", GXutil.rtrim( A882EscMTxt2));
      httpContext.ajax_rsp_assign_attri("", false, "A883EscMInc", GXutil.ltrim( localUtil.ntoc( A883EscMInc, (byte)(5), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A884EscMKgm", GXutil.ltrim( localUtil.ntoc( A884EscMKgm, (byte)(10), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A885EscMVol", GXutil.ltrim( localUtil.ntoc( A885EscMVol, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A886EscMUltLin", GXutil.ltrim( localUtil.ntoc( A886EscMUltLin, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A896EscMValCos", GXutil.ltrim( localUtil.ntoc( A896EscMValCos, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A3915EmpNumDec", GXutil.ltrim( localUtil.ntoc( A3915EmpNumDec, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A893EscMCosT", GXutil.ltrim( localUtil.ntoc( A893EscMCosT, (byte)(15), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z910Workstat", GXutil.rtrim( Z910Workstat));
      app.GxWebStd.gx_hidden_field( httpContext, "Z881EscMTxt1", GXutil.rtrim( Z881EscMTxt1));
      app.GxWebStd.gx_hidden_field( httpContext, "Z882EscMTxt2", GXutil.rtrim( Z882EscMTxt2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z883EscMInc", GXutil.ltrim( localUtil.ntoc( Z883EscMInc, (byte)(5), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z884EscMKgm", GXutil.ltrim( localUtil.ntoc( Z884EscMKgm, (byte)(10), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z885EscMVol", GXutil.ltrim( localUtil.ntoc( Z885EscMVol, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z886EscMUltLin", GXutil.ltrim( localUtil.ntoc( Z886EscMUltLin, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z896EscMValCos", GXutil.ltrim( localUtil.ntoc( Z896EscMValCos, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3915EmpNumDec", GXutil.ltrim( localUtil.ntoc( Z3915EmpNumDec, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z893EscMCosT", GXutil.ltrim( localUtil.ntoc( Z893EscMCosT, (byte)(15), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "O893EscMCosT", GXutil.ltrim( localUtil.ntoc( O893EscMCosT, (byte)(15), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_enter_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Prdnum( )
   {
      /* Using cursor T002W36 */
      pr_default.execute(30, new Object[] {A396EmprCod, A719PrdNum});
      if ( (pr_default.getStatus(30) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
      }
      A718PrdNom = T002W36_A718PrdNom[0] ;
      A724PrdPreAct = T002W36_A724PrdPreAct[0] ;
      pr_default.close(30);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", GXutil.rtrim( A718PrdNom));
      httpContext.ajax_rsp_assign_attri("", false, "A724PrdPreAct", GXutil.ltrim( localUtil.ntoc( A724PrdPreAct, (byte)(14), (byte)(5), ".", "")));
   }

   public void valid_Proforcod( )
   {
      /* Using cursor T002W37 */
      pr_default.execute(31, new Object[] {A396EmprCod, A764ProForCod});
      if ( (pr_default.getStatus(31) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CPROFO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROFORCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtProForCod_Internalname ;
      }
      A766ProForDsc = T002W37_A766ProForDsc[0] ;
      pr_default.close(31);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A766ProForDsc", GXutil.rtrim( A766ProForDsc));
   }

   public void valid_Forprdume( )
   {
      n884EscMKgm = false ;
      n896EscMValCos = false ;
      n3915EmpNumDec = false ;
      n885EscMVol = false ;
      n488ForPrdDsc = false ;
      /* Using cursor T002W38 */
      pr_default.execute(32, new Object[] {A396EmprCod, Byte.valueOf(A490ForPrdUMe)});
      if ( (pr_default.getStatus(32) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "UNMEPR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FORPRDUME");
         AnyError = (short)(1) ;
         GX_FocusControl = edtForPrdUMe_Internalname ;
      }
      A488ForPrdDsc = T002W38_A488ForPrdDsc[0] ;
      n488ForPrdDsc = T002W38_n488ForPrdDsc[0] ;
      pr_default.close(32);
      if ( ! ( ( A490ForPrdUMe == 0 ) || ( A490ForPrdUMe == 1 ) || ( A490ForPrdUMe == 2 ) || ( A490ForPrdUMe == 3 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Unidad Medida", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "FORPRDUME");
         AnyError = (short)(1) ;
         GX_FocusControl = edtForPrdUMe_Internalname ;
      }
      if ( ( A490ForPrdUMe == 3 ) && ( A3915EmpNumDec == 0 ) )
      {
         A892EscMCosL = GXutil.roundDecimal( A889EscMPrdPre.multiply(A890EscMCan).multiply(A884EscMKgm).multiply(DecimalUtil.doubleToDec(A896EscMValCos)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN), 0) ;
      }
      else
      {
         if ( ( A490ForPrdUMe == 3 ) && ( A3915EmpNumDec == 2 ) )
         {
            A892EscMCosL = GXutil.roundDecimal( A889EscMPrdPre.multiply(A890EscMCan).multiply(A884EscMKgm).multiply(DecimalUtil.doubleToDec(A896EscMValCos)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN), 2) ;
         }
         else
         {
            if ( ( A490ForPrdUMe != 3 ) && ( A3915EmpNumDec == 0 ) )
            {
               A892EscMCosL = GXutil.roundDecimal( A889EscMPrdPre.multiply(A890EscMCan).multiply(DecimalUtil.doubleToDec(A885EscMVol)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN), 0) ;
            }
            else
            {
               if ( ( A490ForPrdUMe != 3 ) && ( A3915EmpNumDec == 2 ) )
               {
                  A892EscMCosL = GXutil.roundDecimal( A889EscMPrdPre.multiply(A890EscMCan).multiply(DecimalUtil.doubleToDec(A885EscMVol)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN), 2) ;
               }
               else
               {
                  A892EscMCosL = DecimalUtil.doubleToDec(0) ;
               }
            }
         }
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A488ForPrdDsc", GXutil.rtrim( A488ForPrdDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A892EscMCosL", GXutil.ltrim( localUtil.ntoc( A892EscMCosL, (byte)(15), (byte)(5), ".", "")));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e122W2',iparms:[]");
      setEventMetadata("AFTER TRN",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A3915EmpNumDec',fld:'EMPNUMDEC',pic:'9'}]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A3915EmpNumDec',fld:'EMPNUMDEC',pic:'9'}]}");
      setEventMetadata("VALID_WORKSTAT","{handler:'valid_Workstat',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A910Workstat',fld:'WORKSTAT',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_WORKSTAT",",oparms:[{av:'A881EscMTxt1',fld:'ESCMTXT1',pic:''},{av:'A882EscMTxt2',fld:'ESCMTXT2',pic:''},{av:'A883EscMInc',fld:'ESCMINC',pic:'Z9.99'},{av:'A884EscMKgm',fld:'ESCMKGM',pic:'ZZZZZZ9.99'},{av:'A885EscMVol',fld:'ESCMVOL',pic:'ZZZZ9'},{av:'A886EscMUltLin',fld:'ESCMULTLIN',pic:'ZZ9'},{av:'A896EscMValCos',fld:'ESCMVALCOS',pic:'ZZZZZZZ9'},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A3915EmpNumDec',fld:'EMPNUMDEC',pic:'9'},{av:'A893EscMCosT',fld:'ESCMCOST',pic:'ZZZZZZZZ9.99999'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z910Workstat'},{av:'Z881EscMTxt1'},{av:'Z882EscMTxt2'},{av:'Z883EscMInc'},{av:'Z884EscMKgm'},{av:'Z885EscMVol'},{av:'Z886EscMUltLin'},{av:'Z896EscMValCos'},{av:'Z407EmprNom'},{av:'Z3915EmpNumDec'},{av:'Z893EscMCosT'},{av:'O893EscMCosT'},{ctrl:'BTNTRN_DELETE',prop:'Enabled'},{ctrl:'BTNTRN_ENTER',prop:'Enabled'}]}");
      setEventMetadata("VALID_ESCMKGM","{handler:'valid_Escmkgm',iparms:[]");
      setEventMetadata("VALID_ESCMKGM",",oparms:[]}");
      setEventMetadata("VALID_ESCMVOL","{handler:'valid_Escmvol',iparms:[]");
      setEventMetadata("VALID_ESCMVOL",",oparms:[]}");
      setEventMetadata("VALID_ESCMVALCOS","{handler:'valid_Escmvalcos',iparms:[]");
      setEventMetadata("VALID_ESCMVALCOS",",oparms:[]}");
      setEventMetadata("VALID_EMPNUMDEC","{handler:'valid_Empnumdec',iparms:[]");
      setEventMetadata("VALID_EMPNUMDEC",",oparms:[]}");
      setEventMetadata("VALID_ESCMLIN","{handler:'valid_Escmlin',iparms:[]");
      setEventMetadata("VALID_ESCMLIN",",oparms:[]}");
      setEventMetadata("VALID_PRDNUM","{handler:'valid_Prdnum',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A718PrdNom',fld:'PRDNOM',pic:''},{av:'A724PrdPreAct',fld:'PRDPREACT',pic:'ZZZZZZZ9.999'}]");
      setEventMetadata("VALID_PRDNUM",",oparms:[{av:'A718PrdNom',fld:'PRDNOM',pic:''},{av:'A724PrdPreAct',fld:'PRDPREACT',pic:'ZZZZZZZ9.999'}]}");
      setEventMetadata("VALID_PROFORCOD","{handler:'valid_Proforcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A764ProForCod',fld:'PROFORCOD',pic:''},{av:'A766ProForDsc',fld:'PROFORDSC',pic:''}]");
      setEventMetadata("VALID_PROFORCOD",",oparms:[{av:'A766ProForDsc',fld:'PROFORDSC',pic:''}]}");
      setEventMetadata("VALID_ESCMPRDPRE","{handler:'valid_Escmprdpre',iparms:[]");
      setEventMetadata("VALID_ESCMPRDPRE",",oparms:[]}");
      setEventMetadata("VALID_ESCMCAN","{handler:'valid_Escmcan',iparms:[]");
      setEventMetadata("VALID_ESCMCAN",",oparms:[]}");
      setEventMetadata("VALID_FORPRDUME","{handler:'valid_Forprdume',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A490ForPrdUMe',fld:'FORPRDUME',pic:'9'},{av:'A889EscMPrdPre',fld:'ESCMPRDPRE',pic:'ZZZZZZZ9.999'},{av:'A890EscMCan',fld:'ESCMCAN',pic:'ZZZZZ9.9999'},{av:'A884EscMKgm',fld:'ESCMKGM',pic:'ZZZZZZ9.99'},{av:'A896EscMValCos',fld:'ESCMVALCOS',pic:'ZZZZZZZ9'},{av:'A3915EmpNumDec',fld:'EMPNUMDEC',pic:'9'},{av:'A885EscMVol',fld:'ESCMVOL',pic:'ZZZZ9'},{av:'A488ForPrdDsc',fld:'FORPRDDSC',pic:''},{av:'A892EscMCosL',fld:'ESCMCOSL',pic:'ZZZZZZZZ9.99999'}]");
      setEventMetadata("VALID_FORPRDUME",",oparms:[{av:'A488ForPrdDsc',fld:'FORPRDDSC',pic:''},{av:'A892EscMCosL',fld:'ESCMCOSL',pic:'ZZZZZZZZ9.99999'}]}");
      setEventMetadata("VALID_ESCMCOS","{handler:'valid_Escmcos',iparms:[]");
      setEventMetadata("VALID_ESCMCOS",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Escmcant',iparms:[]");
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
      pr_default.close(30);
      pr_default.close(31);
      pr_default.close(32);
      pr_default.close(18);
      pr_default.close(19);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z910Workstat = "" ;
      Z881EscMTxt1 = "" ;
      Z882EscMTxt2 = "" ;
      Z883EscMInc = DecimalUtil.ZERO ;
      Z884EscMKgm = DecimalUtil.ZERO ;
      O893EscMCosT = DecimalUtil.ZERO ;
      Z897EscMDsc = "" ;
      Z889EscMPrdPre = DecimalUtil.ZERO ;
      Z890EscMCan = DecimalUtil.ZERO ;
      Z891EscMCos = DecimalUtil.ZERO ;
      Z4708EscMArtCod = "" ;
      Z4709EscMMdlCod = "" ;
      Z4710EscMProCod = "" ;
      Z4711EscMFasCod = "" ;
      Z4712EscMFacCon = DecimalUtil.ZERO ;
      Z10363EscMCant = DecimalUtil.ZERO ;
      Z719PrdNum = "" ;
      Z764ProForCod = "" ;
      O891EscMCos = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A910Workstat = "" ;
      A719PrdNum = "" ;
      A764ProForCod = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      Gx_mode = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      lblTextblockemprcod_Jsonclick = "" ;
      ucCombo_emprcod = new com.genexus.webpanels.GXUserControl();
      AV52DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV59EmprCod_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      TempTags = "" ;
      A407EmprNom = "" ;
      A881EscMTxt1 = "" ;
      A882EscMTxt2 = "" ;
      A883EscMInc = DecimalUtil.ZERO ;
      A884EscMKgm = DecimalUtil.ZERO ;
      A893EscMCosT = DecimalUtil.ZERO ;
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      AV60ComboEmprCod = "" ;
      ucCombo_prdnum = new com.genexus.webpanels.GXUserControl();
      AV51PrdNum_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      ucCombo_proforcod = new com.genexus.webpanels.GXUserControl();
      AV57ProForCod_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      ucCombo_forprdume = new com.genexus.webpanels.GXUserControl();
      AV58ForPrdUMe_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      Gridlevel_level1Container = new com.genexus.webpanels.GXWebGrid(context);
      B893EscMCosT = DecimalUtil.ZERO ;
      sMode120 = "" ;
      sStyleString = "" ;
      Combo_emprcod_Objectcall = "" ;
      Combo_emprcod_Class = "" ;
      Combo_emprcod_Icontype = "" ;
      Combo_emprcod_Icon = "" ;
      Combo_emprcod_Tooltip = "" ;
      Combo_emprcod_Selectedvalue_set = "" ;
      Combo_emprcod_Selectedvalue_get = "" ;
      Combo_emprcod_Selectedtext_set = "" ;
      Combo_emprcod_Selectedtext_get = "" ;
      Combo_emprcod_Gamoauthtoken = "" ;
      Combo_emprcod_Ddointernalname = "" ;
      Combo_emprcod_Titlecontrolalign = "" ;
      Combo_emprcod_Dropdownoptionstype = "" ;
      Combo_emprcod_Titlecontrolidtoreplace = "" ;
      Combo_emprcod_Datalisttype = "" ;
      Combo_emprcod_Datalistfixedvalues = "" ;
      Combo_emprcod_Remoteservicesparameters = "" ;
      Combo_emprcod_Htmltemplate = "" ;
      Combo_emprcod_Multiplevaluestype = "" ;
      Combo_emprcod_Loadingdata = "" ;
      Combo_emprcod_Noresultsfound = "" ;
      Combo_emprcod_Emptyitemtext = "" ;
      Combo_emprcod_Onlyselectedvalues = "" ;
      Combo_emprcod_Selectalltext = "" ;
      Combo_emprcod_Multiplevaluesseparator = "" ;
      Combo_emprcod_Addnewoptiontext = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      Combo_prdnum_Objectcall = "" ;
      Combo_prdnum_Class = "" ;
      Combo_prdnum_Icontype = "" ;
      Combo_prdnum_Icon = "" ;
      Combo_prdnum_Tooltip = "" ;
      Combo_prdnum_Selectedvalue_set = "" ;
      Combo_prdnum_Selectedvalue_get = "" ;
      Combo_prdnum_Selectedtext_set = "" ;
      Combo_prdnum_Selectedtext_get = "" ;
      Combo_prdnum_Gamoauthtoken = "" ;
      Combo_prdnum_Ddointernalname = "" ;
      Combo_prdnum_Titlecontrolalign = "" ;
      Combo_prdnum_Dropdownoptionstype = "" ;
      Combo_prdnum_Titlecontrolidtoreplace = "" ;
      Combo_prdnum_Datalisttype = "" ;
      Combo_prdnum_Datalistfixedvalues = "" ;
      Combo_prdnum_Datalistprocparametersprefix = "" ;
      Combo_prdnum_Remoteservicesparameters = "" ;
      Combo_prdnum_Htmltemplate = "" ;
      Combo_prdnum_Multiplevaluestype = "" ;
      Combo_prdnum_Loadingdata = "" ;
      Combo_prdnum_Noresultsfound = "" ;
      Combo_prdnum_Emptyitemtext = "" ;
      Combo_prdnum_Onlyselectedvalues = "" ;
      Combo_prdnum_Selectalltext = "" ;
      Combo_prdnum_Multiplevaluesseparator = "" ;
      Combo_prdnum_Addnewoptiontext = "" ;
      Combo_proforcod_Objectcall = "" ;
      Combo_proforcod_Class = "" ;
      Combo_proforcod_Icontype = "" ;
      Combo_proforcod_Icon = "" ;
      Combo_proforcod_Tooltip = "" ;
      Combo_proforcod_Selectedvalue_set = "" ;
      Combo_proforcod_Selectedvalue_get = "" ;
      Combo_proforcod_Selectedtext_set = "" ;
      Combo_proforcod_Selectedtext_get = "" ;
      Combo_proforcod_Gamoauthtoken = "" ;
      Combo_proforcod_Ddointernalname = "" ;
      Combo_proforcod_Titlecontrolalign = "" ;
      Combo_proforcod_Dropdownoptionstype = "" ;
      Combo_proforcod_Titlecontrolidtoreplace = "" ;
      Combo_proforcod_Datalisttype = "" ;
      Combo_proforcod_Datalistfixedvalues = "" ;
      Combo_proforcod_Datalistprocparametersprefix = "" ;
      Combo_proforcod_Remoteservicesparameters = "" ;
      Combo_proforcod_Htmltemplate = "" ;
      Combo_proforcod_Multiplevaluestype = "" ;
      Combo_proforcod_Loadingdata = "" ;
      Combo_proforcod_Noresultsfound = "" ;
      Combo_proforcod_Emptyitemtext = "" ;
      Combo_proforcod_Onlyselectedvalues = "" ;
      Combo_proforcod_Selectalltext = "" ;
      Combo_proforcod_Multiplevaluesseparator = "" ;
      Combo_proforcod_Addnewoptiontext = "" ;
      Combo_forprdume_Objectcall = "" ;
      Combo_forprdume_Class = "" ;
      Combo_forprdume_Icontype = "" ;
      Combo_forprdume_Icon = "" ;
      Combo_forprdume_Tooltip = "" ;
      Combo_forprdume_Selectedvalue_set = "" ;
      Combo_forprdume_Selectedvalue_get = "" ;
      Combo_forprdume_Selectedtext_set = "" ;
      Combo_forprdume_Selectedtext_get = "" ;
      Combo_forprdume_Gamoauthtoken = "" ;
      Combo_forprdume_Ddointernalname = "" ;
      Combo_forprdume_Titlecontrolalign = "" ;
      Combo_forprdume_Dropdownoptionstype = "" ;
      Combo_forprdume_Titlecontrolidtoreplace = "" ;
      Combo_forprdume_Datalisttype = "" ;
      Combo_forprdume_Datalistfixedvalues = "" ;
      Combo_forprdume_Datalistprocparametersprefix = "" ;
      Combo_forprdume_Remoteservicesparameters = "" ;
      Combo_forprdume_Htmltemplate = "" ;
      Combo_forprdume_Multiplevaluestype = "" ;
      Combo_forprdume_Loadingdata = "" ;
      Combo_forprdume_Noresultsfound = "" ;
      Combo_forprdume_Emptyitemtext = "" ;
      Combo_forprdume_Onlyselectedvalues = "" ;
      Combo_forprdume_Selectalltext = "" ;
      Combo_forprdume_Multiplevaluesseparator = "" ;
      Combo_forprdume_Addnewoptiontext = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      s893EscMCosT = DecimalUtil.ZERO ;
      GXCCtl = "" ;
      A718PrdNom = "" ;
      A724PrdPreAct = DecimalUtil.ZERO ;
      A766ProForDsc = "" ;
      A897EscMDsc = "" ;
      A889EscMPrdPre = DecimalUtil.ZERO ;
      A890EscMCan = DecimalUtil.ZERO ;
      A488ForPrdDsc = "" ;
      A891EscMCos = DecimalUtil.ZERO ;
      A892EscMCosL = DecimalUtil.ZERO ;
      A4708EscMArtCod = "" ;
      A4709EscMMdlCod = "" ;
      A4710EscMProCod = "" ;
      A4711EscMFasCod = "" ;
      A4712EscMFacCon = DecimalUtil.ZERO ;
      A10363EscMCant = DecimalUtil.ZERO ;
      T891EscMCos = DecimalUtil.ZERO ;
      Z407EmprNom = "" ;
      Z893EscMCosT = DecimalUtil.ZERO ;
      T002W13_A910Workstat = new String[] {""} ;
      T002W13_A407EmprNom = new String[] {""} ;
      T002W13_n407EmprNom = new boolean[] {false} ;
      T002W13_A881EscMTxt1 = new String[] {""} ;
      T002W13_n881EscMTxt1 = new boolean[] {false} ;
      T002W13_A882EscMTxt2 = new String[] {""} ;
      T002W13_n882EscMTxt2 = new boolean[] {false} ;
      T002W13_A883EscMInc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T002W13_n883EscMInc = new boolean[] {false} ;
      T002W13_A884EscMKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T002W13_n884EscMKgm = new boolean[] {false} ;
      T002W13_A885EscMVol = new int[1] ;
      T002W13_n885EscMVol = new boolean[] {false} ;
      T002W13_A886EscMUltLin = new int[1] ;
      T002W13_n886EscMUltLin = new boolean[] {false} ;
      T002W13_A896EscMValCos = new int[1] ;
      T002W13_n896EscMValCos = new boolean[] {false} ;
      T002W13_A3915EmpNumDec = new byte[1] ;
      T002W13_n3915EmpNumDec = new boolean[] {false} ;
      T002W13_A396EmprCod = new String[] {""} ;
      T002W13_A893EscMCosT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T002W13_n893EscMCosT = new boolean[] {false} ;
      T002W9_A407EmprNom = new String[] {""} ;
      T002W9_n407EmprNom = new boolean[] {false} ;
      T002W9_A3915EmpNumDec = new byte[1] ;
      T002W9_n3915EmpNumDec = new boolean[] {false} ;
      T002W11_A893EscMCosT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T002W11_n893EscMCosT = new boolean[] {false} ;
      T002W14_A407EmprNom = new String[] {""} ;
      T002W14_n407EmprNom = new boolean[] {false} ;
      T002W14_A3915EmpNumDec = new byte[1] ;
      T002W14_n3915EmpNumDec = new boolean[] {false} ;
      T002W16_A893EscMCosT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T002W16_n893EscMCosT = new boolean[] {false} ;
      T002W17_A396EmprCod = new String[] {""} ;
      T002W17_A910Workstat = new String[] {""} ;
      T002W8_A910Workstat = new String[] {""} ;
      T002W8_A881EscMTxt1 = new String[] {""} ;
      T002W8_n881EscMTxt1 = new boolean[] {false} ;
      T002W8_A882EscMTxt2 = new String[] {""} ;
      T002W8_n882EscMTxt2 = new boolean[] {false} ;
      T002W8_A883EscMInc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T002W8_n883EscMInc = new boolean[] {false} ;
      T002W8_A884EscMKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T002W8_n884EscMKgm = new boolean[] {false} ;
      T002W8_A885EscMVol = new int[1] ;
      T002W8_n885EscMVol = new boolean[] {false} ;
      T002W8_A886EscMUltLin = new int[1] ;
      T002W8_n886EscMUltLin = new boolean[] {false} ;
      T002W8_A896EscMValCos = new int[1] ;
      T002W8_n896EscMValCos = new boolean[] {false} ;
      T002W8_A396EmprCod = new String[] {""} ;
      sMode118 = "" ;
      T002W18_A396EmprCod = new String[] {""} ;
      T002W18_A910Workstat = new String[] {""} ;
      T002W19_A396EmprCod = new String[] {""} ;
      T002W19_A910Workstat = new String[] {""} ;
      T002W7_A910Workstat = new String[] {""} ;
      T002W7_A881EscMTxt1 = new String[] {""} ;
      T002W7_n881EscMTxt1 = new boolean[] {false} ;
      T002W7_A882EscMTxt2 = new String[] {""} ;
      T002W7_n882EscMTxt2 = new boolean[] {false} ;
      T002W7_A883EscMInc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T002W7_n883EscMInc = new boolean[] {false} ;
      T002W7_A884EscMKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T002W7_n884EscMKgm = new boolean[] {false} ;
      T002W7_A885EscMVol = new int[1] ;
      T002W7_n885EscMVol = new boolean[] {false} ;
      T002W7_A886EscMUltLin = new int[1] ;
      T002W7_n886EscMUltLin = new boolean[] {false} ;
      T002W7_A896EscMValCos = new int[1] ;
      T002W7_n896EscMValCos = new boolean[] {false} ;
      T002W7_A396EmprCod = new String[] {""} ;
      T002W23_A407EmprNom = new String[] {""} ;
      T002W23_n407EmprNom = new boolean[] {false} ;
      T002W23_A3915EmpNumDec = new byte[1] ;
      T002W23_n3915EmpNumDec = new boolean[] {false} ;
      T002W25_A893EscMCosT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T002W25_n893EscMCosT = new boolean[] {false} ;
      T002W26_A396EmprCod = new String[] {""} ;
      T002W26_A910Workstat = new String[] {""} ;
      T002W26_A880EscLin = new short[1] ;
      T002W27_A396EmprCod = new String[] {""} ;
      T002W27_A910Workstat = new String[] {""} ;
      Z718PrdNom = "" ;
      Z724PrdPreAct = DecimalUtil.ZERO ;
      Z766ProForDsc = "" ;
      Z488ForPrdDsc = "" ;
      T002W28_A910Workstat = new String[] {""} ;
      T002W28_A887EscMLin = new int[1] ;
      T002W28_A718PrdNom = new String[] {""} ;
      T002W28_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T002W28_A766ProForDsc = new String[] {""} ;
      T002W28_A897EscMDsc = new String[] {""} ;
      T002W28_A889EscMPrdPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T002W28_A890EscMCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T002W28_A488ForPrdDsc = new String[] {""} ;
      T002W28_n488ForPrdDsc = new boolean[] {false} ;
      T002W28_A891EscMCos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T002W28_A4707EscMCliCod = new int[1] ;
      T002W28_A4708EscMArtCod = new String[] {""} ;
      T002W28_A4709EscMMdlCod = new String[] {""} ;
      T002W28_A4710EscMProCod = new String[] {""} ;
      T002W28_A4711EscMFasCod = new String[] {""} ;
      T002W28_A4712EscMFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T002W28_A4713EscMRb = new short[1] ;
      T002W28_A6060EscSol = new int[1] ;
      T002W28_A7584EscVolm = new int[1] ;
      T002W28_A7583EscOrdn = new short[1] ;
      T002W28_A10363EscMCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T002W28_A396EmprCod = new String[] {""} ;
      T002W28_A719PrdNum = new String[] {""} ;
      T002W28_A764ProForCod = new String[] {""} ;
      T002W28_A490ForPrdUMe = new byte[1] ;
      T002W4_A718PrdNom = new String[] {""} ;
      T002W4_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T002W5_A766ProForDsc = new String[] {""} ;
      T002W6_A488ForPrdDsc = new String[] {""} ;
      T002W6_n488ForPrdDsc = new boolean[] {false} ;
      T002W29_A718PrdNom = new String[] {""} ;
      T002W29_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T002W30_A766ProForDsc = new String[] {""} ;
      T002W31_A488ForPrdDsc = new String[] {""} ;
      T002W31_n488ForPrdDsc = new boolean[] {false} ;
      T002W32_A396EmprCod = new String[] {""} ;
      T002W32_A910Workstat = new String[] {""} ;
      T002W32_A887EscMLin = new int[1] ;
      T002W3_A910Workstat = new String[] {""} ;
      T002W3_A887EscMLin = new int[1] ;
      T002W3_A897EscMDsc = new String[] {""} ;
      T002W3_A889EscMPrdPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T002W3_A890EscMCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T002W3_A891EscMCos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T002W3_A4707EscMCliCod = new int[1] ;
      T002W3_A4708EscMArtCod = new String[] {""} ;
      T002W3_A4709EscMMdlCod = new String[] {""} ;
      T002W3_A4710EscMProCod = new String[] {""} ;
      T002W3_A4711EscMFasCod = new String[] {""} ;
      T002W3_A4712EscMFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T002W3_A4713EscMRb = new short[1] ;
      T002W3_A6060EscSol = new int[1] ;
      T002W3_A7584EscVolm = new int[1] ;
      T002W3_A7583EscOrdn = new short[1] ;
      T002W3_A10363EscMCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T002W3_A396EmprCod = new String[] {""} ;
      T002W3_A719PrdNum = new String[] {""} ;
      T002W3_A764ProForCod = new String[] {""} ;
      T002W3_A490ForPrdUMe = new byte[1] ;
      T002W2_A910Workstat = new String[] {""} ;
      T002W2_A887EscMLin = new int[1] ;
      T002W2_A897EscMDsc = new String[] {""} ;
      T002W2_A889EscMPrdPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T002W2_A890EscMCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T002W2_A891EscMCos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T002W2_A4707EscMCliCod = new int[1] ;
      T002W2_A4708EscMArtCod = new String[] {""} ;
      T002W2_A4709EscMMdlCod = new String[] {""} ;
      T002W2_A4710EscMProCod = new String[] {""} ;
      T002W2_A4711EscMFasCod = new String[] {""} ;
      T002W2_A4712EscMFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T002W2_A4713EscMRb = new short[1] ;
      T002W2_A6060EscSol = new int[1] ;
      T002W2_A7584EscVolm = new int[1] ;
      T002W2_A7583EscOrdn = new short[1] ;
      T002W2_A10363EscMCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T002W2_A396EmprCod = new String[] {""} ;
      T002W2_A719PrdNum = new String[] {""} ;
      T002W2_A764ProForCod = new String[] {""} ;
      T002W2_A490ForPrdUMe = new byte[1] ;
      T002W36_A718PrdNom = new String[] {""} ;
      T002W36_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T002W37_A766ProForDsc = new String[] {""} ;
      T002W38_A488ForPrdDsc = new String[] {""} ;
      T002W38_n488ForPrdDsc = new boolean[] {false} ;
      T002W39_A396EmprCod = new String[] {""} ;
      T002W39_A910Workstat = new String[] {""} ;
      T002W39_A887EscMLin = new int[1] ;
      Gridlevel_level1Row = new com.genexus.webpanels.GXWebRow();
      subGridlevel_level1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Gridlevel_level1Column = new com.genexus.webpanels.GXWebColumn();
      ZZ396EmprCod = "" ;
      ZZ910Workstat = "" ;
      ZZ881EscMTxt1 = "" ;
      ZZ882EscMTxt2 = "" ;
      ZZ883EscMInc = DecimalUtil.ZERO ;
      ZZ884EscMKgm = DecimalUtil.ZERO ;
      ZZ407EmprNom = "" ;
      ZZ893EscMCosT = DecimalUtil.ZERO ;
      ZO893EscMCosT = DecimalUtil.ZERO ;
      Z892EscMCosL = DecimalUtil.ZERO ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.tescand__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.tescand__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.tescand__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.tescand__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.tescand__default(),
         new Object[] {
             new Object[] {
            T002W2_A910Workstat, T002W2_A887EscMLin, T002W2_A897EscMDsc, T002W2_A889EscMPrdPre, T002W2_A890EscMCan, T002W2_A891EscMCos, T002W2_A4707EscMCliCod, T002W2_A4708EscMArtCod, T002W2_A4709EscMMdlCod, T002W2_A4710EscMProCod,
            T002W2_A4711EscMFasCod, T002W2_A4712EscMFacCon, T002W2_A4713EscMRb, T002W2_A6060EscSol, T002W2_A7584EscVolm, T002W2_A7583EscOrdn, T002W2_A10363EscMCant, T002W2_A396EmprCod, T002W2_A719PrdNum, T002W2_A764ProForCod,
            T002W2_A490ForPrdUMe
            }
            , new Object[] {
            T002W3_A910Workstat, T002W3_A887EscMLin, T002W3_A897EscMDsc, T002W3_A889EscMPrdPre, T002W3_A890EscMCan, T002W3_A891EscMCos, T002W3_A4707EscMCliCod, T002W3_A4708EscMArtCod, T002W3_A4709EscMMdlCod, T002W3_A4710EscMProCod,
            T002W3_A4711EscMFasCod, T002W3_A4712EscMFacCon, T002W3_A4713EscMRb, T002W3_A6060EscSol, T002W3_A7584EscVolm, T002W3_A7583EscOrdn, T002W3_A10363EscMCant, T002W3_A396EmprCod, T002W3_A719PrdNum, T002W3_A764ProForCod,
            T002W3_A490ForPrdUMe
            }
            , new Object[] {
            T002W4_A718PrdNom, T002W4_A724PrdPreAct
            }
            , new Object[] {
            T002W5_A766ProForDsc
            }
            , new Object[] {
            T002W6_A488ForPrdDsc, T002W6_n488ForPrdDsc
            }
            , new Object[] {
            T002W7_A910Workstat, T002W7_A881EscMTxt1, T002W7_n881EscMTxt1, T002W7_A882EscMTxt2, T002W7_n882EscMTxt2, T002W7_A883EscMInc, T002W7_n883EscMInc, T002W7_A884EscMKgm, T002W7_n884EscMKgm, T002W7_A885EscMVol,
            T002W7_n885EscMVol, T002W7_A886EscMUltLin, T002W7_n886EscMUltLin, T002W7_A896EscMValCos, T002W7_n896EscMValCos, T002W7_A396EmprCod
            }
            , new Object[] {
            T002W8_A910Workstat, T002W8_A881EscMTxt1, T002W8_n881EscMTxt1, T002W8_A882EscMTxt2, T002W8_n882EscMTxt2, T002W8_A883EscMInc, T002W8_n883EscMInc, T002W8_A884EscMKgm, T002W8_n884EscMKgm, T002W8_A885EscMVol,
            T002W8_n885EscMVol, T002W8_A886EscMUltLin, T002W8_n886EscMUltLin, T002W8_A896EscMValCos, T002W8_n896EscMValCos, T002W8_A396EmprCod
            }
            , new Object[] {
            T002W9_A407EmprNom, T002W9_n407EmprNom, T002W9_A3915EmpNumDec, T002W9_n3915EmpNumDec
            }
            , new Object[] {
            T002W11_A893EscMCosT, T002W11_n893EscMCosT
            }
            , new Object[] {
            T002W13_A910Workstat, T002W13_A407EmprNom, T002W13_n407EmprNom, T002W13_A881EscMTxt1, T002W13_n881EscMTxt1, T002W13_A882EscMTxt2, T002W13_n882EscMTxt2, T002W13_A883EscMInc, T002W13_n883EscMInc, T002W13_A884EscMKgm,
            T002W13_n884EscMKgm, T002W13_A885EscMVol, T002W13_n885EscMVol, T002W13_A886EscMUltLin, T002W13_n886EscMUltLin, T002W13_A896EscMValCos, T002W13_n896EscMValCos, T002W13_A3915EmpNumDec, T002W13_n3915EmpNumDec, T002W13_A396EmprCod,
            T002W13_A893EscMCosT, T002W13_n893EscMCosT
            }
            , new Object[] {
            T002W14_A407EmprNom, T002W14_n407EmprNom, T002W14_A3915EmpNumDec, T002W14_n3915EmpNumDec
            }
            , new Object[] {
            T002W16_A893EscMCosT, T002W16_n893EscMCosT
            }
            , new Object[] {
            T002W17_A396EmprCod, T002W17_A910Workstat
            }
            , new Object[] {
            T002W18_A396EmprCod, T002W18_A910Workstat
            }
            , new Object[] {
            T002W19_A396EmprCod, T002W19_A910Workstat
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T002W23_A407EmprNom, T002W23_n407EmprNom, T002W23_A3915EmpNumDec, T002W23_n3915EmpNumDec
            }
            , new Object[] {
            T002W25_A893EscMCosT, T002W25_n893EscMCosT
            }
            , new Object[] {
            T002W26_A396EmprCod, T002W26_A910Workstat, T002W26_A880EscLin
            }
            , new Object[] {
            T002W27_A396EmprCod, T002W27_A910Workstat
            }
            , new Object[] {
            T002W28_A910Workstat, T002W28_A887EscMLin, T002W28_A718PrdNom, T002W28_A724PrdPreAct, T002W28_A766ProForDsc, T002W28_A897EscMDsc, T002W28_A889EscMPrdPre, T002W28_A890EscMCan, T002W28_A488ForPrdDsc, T002W28_n488ForPrdDsc,
            T002W28_A891EscMCos, T002W28_A4707EscMCliCod, T002W28_A4708EscMArtCod, T002W28_A4709EscMMdlCod, T002W28_A4710EscMProCod, T002W28_A4711EscMFasCod, T002W28_A4712EscMFacCon, T002W28_A4713EscMRb, T002W28_A6060EscSol, T002W28_A7584EscVolm,
            T002W28_A7583EscOrdn, T002W28_A10363EscMCant, T002W28_A396EmprCod, T002W28_A719PrdNum, T002W28_A764ProForCod, T002W28_A490ForPrdUMe
            }
            , new Object[] {
            T002W29_A718PrdNom, T002W29_A724PrdPreAct
            }
            , new Object[] {
            T002W30_A766ProForDsc
            }
            , new Object[] {
            T002W31_A488ForPrdDsc, T002W31_n488ForPrdDsc
            }
            , new Object[] {
            T002W32_A396EmprCod, T002W32_A910Workstat, T002W32_A887EscMLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T002W36_A718PrdNom, T002W36_A724PrdPreAct
            }
            , new Object[] {
            T002W37_A766ProForDsc
            }
            , new Object[] {
            T002W38_A488ForPrdDsc, T002W38_n488ForPrdDsc
            }
            , new Object[] {
            T002W39_A396EmprCod, T002W39_A910Workstat, T002W39_A887EscMLin
            }
         }
      );
   }

   private byte Z490ForPrdUMe ;
   private byte GxWebError ;
   private byte A490ForPrdUMe ;
   private byte nKeyPressed ;
   private byte A3915EmpNumDec ;
   private byte Z3915EmpNumDec ;
   private byte Gx_BScreen ;
   private byte subGridlevel_level1_Backcolorstyle ;
   private byte subGridlevel_level1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGridlevel_level1_Allowselection ;
   private byte subGridlevel_level1_Allowhovering ;
   private byte subGridlevel_level1_Allowcollapsing ;
   private byte subGridlevel_level1_Collapsed ;
   private byte ZZ3915EmpNumDec ;
   private short Z4713EscMRb ;
   private short Z7583EscOrdn ;
   private short nRcdDeleted_120 ;
   private short nRcdExists_120 ;
   private short nIsMod_120 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount120 ;
   private short RcdFound120 ;
   private short nBlankRcdUsr120 ;
   private short A4713EscMRb ;
   private short A7583EscOrdn ;
   private short RcdFound118 ;
   private short nIsDirty_118 ;
   private short nIsDirty_120 ;
   private int Z885EscMVol ;
   private int Z886EscMUltLin ;
   private int Z896EscMValCos ;
   private int nRC_GXsfl_89 ;
   private int nGXsfl_89_idx=1 ;
   private int Z887EscMLin ;
   private int Z4707EscMCliCod ;
   private int Z6060EscSol ;
   private int Z7584EscVolm ;
   private int trnEnded ;
   private int edtEmprCod_Enabled ;
   private int edtWorkstat_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtEscMTxt1_Enabled ;
   private int edtEscMTxt2_Enabled ;
   private int edtEscMInc_Enabled ;
   private int edtEscMKgm_Enabled ;
   private int A885EscMVol ;
   private int edtEscMVol_Enabled ;
   private int A886EscMUltLin ;
   private int edtEscMUltLin_Enabled ;
   private int A896EscMValCos ;
   private int edtEscMValCos_Enabled ;
   private int edtEmpNumDec_Enabled ;
   private int edtEscMCosT_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int edtavComboemprcod_Enabled ;
   private int edtEscMLin_Enabled ;
   private int edtPrdNum_Enabled ;
   private int edtPrdNom_Enabled ;
   private int edtPrdPreAct_Enabled ;
   private int edtProForCod_Enabled ;
   private int edtProForDsc_Enabled ;
   private int edtEscMDsc_Enabled ;
   private int edtEscMPrdPre_Enabled ;
   private int edtEscMCan_Enabled ;
   private int edtForPrdUMe_Enabled ;
   private int edtForPrdDsc_Enabled ;
   private int edtEscMCos_Enabled ;
   private int edtEscMCosL_Enabled ;
   private int edtEscMCliCod_Enabled ;
   private int edtEscMArtCod_Enabled ;
   private int edtEscMMdlCod_Enabled ;
   private int edtEscMProCod_Enabled ;
   private int edtEscMFasCod_Enabled ;
   private int edtEscMFacCon_Enabled ;
   private int edtEscMRb_Enabled ;
   private int edtEscSol_Enabled ;
   private int edtEscVolm_Enabled ;
   private int edtEscOrdn_Enabled ;
   private int edtEscMCant_Enabled ;
   private int fRowAdded ;
   private int Combo_emprcod_Datalistupdateminimumcharacters ;
   private int Combo_prdnum_Datalistupdateminimumcharacters ;
   private int Combo_proforcod_Datalistupdateminimumcharacters ;
   private int Combo_forprdume_Datalistupdateminimumcharacters ;
   private int A887EscMLin ;
   private int A4707EscMCliCod ;
   private int A6060EscSol ;
   private int A7584EscVolm ;
   private int GX_JID ;
   private int subGridlevel_level1_Backcolor ;
   private int subGridlevel_level1_Allbackcolor ;
   private int defedtEscMLin_Enabled ;
   private int idxLst ;
   private int subGridlevel_level1_Selectedindex ;
   private int subGridlevel_level1_Selectioncolor ;
   private int subGridlevel_level1_Hoveringcolor ;
   private int ZZ885EscMVol ;
   private int ZZ886EscMUltLin ;
   private int ZZ896EscMValCos ;
   private long GRIDLEVEL_LEVEL1_nFirstRecordOnPage ;
   private java.math.BigDecimal Z883EscMInc ;
   private java.math.BigDecimal Z884EscMKgm ;
   private java.math.BigDecimal O893EscMCosT ;
   private java.math.BigDecimal Z889EscMPrdPre ;
   private java.math.BigDecimal Z890EscMCan ;
   private java.math.BigDecimal Z891EscMCos ;
   private java.math.BigDecimal Z4712EscMFacCon ;
   private java.math.BigDecimal Z10363EscMCant ;
   private java.math.BigDecimal O891EscMCos ;
   private java.math.BigDecimal A883EscMInc ;
   private java.math.BigDecimal A884EscMKgm ;
   private java.math.BigDecimal A893EscMCosT ;
   private java.math.BigDecimal B893EscMCosT ;
   private java.math.BigDecimal s893EscMCosT ;
   private java.math.BigDecimal A724PrdPreAct ;
   private java.math.BigDecimal A889EscMPrdPre ;
   private java.math.BigDecimal A890EscMCan ;
   private java.math.BigDecimal A891EscMCos ;
   private java.math.BigDecimal A892EscMCosL ;
   private java.math.BigDecimal A4712EscMFacCon ;
   private java.math.BigDecimal A10363EscMCant ;
   private java.math.BigDecimal T891EscMCos ;
   private java.math.BigDecimal Z893EscMCosT ;
   private java.math.BigDecimal Z724PrdPreAct ;
   private java.math.BigDecimal ZZ883EscMInc ;
   private java.math.BigDecimal ZZ884EscMKgm ;
   private java.math.BigDecimal ZZ893EscMCosT ;
   private java.math.BigDecimal ZO893EscMCosT ;
   private java.math.BigDecimal Z892EscMCosL ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z910Workstat ;
   private String Z881EscMTxt1 ;
   private String Z882EscMTxt2 ;
   private String Z897EscMDsc ;
   private String Z4708EscMArtCod ;
   private String Z4709EscMMdlCod ;
   private String Z4710EscMProCod ;
   private String Z4711EscMFasCod ;
   private String Z719PrdNum ;
   private String Z764ProForCod ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A910Workstat ;
   private String A719PrdNum ;
   private String A764ProForCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtEmprCod_Internalname ;
   private String sGXsfl_89_idx="0001" ;
   private String Gx_mode ;
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
   private String divTablesplittedemprcod_Internalname ;
   private String lblTextblockemprcod_Internalname ;
   private String lblTextblockemprcod_Jsonclick ;
   private String Combo_emprcod_Caption ;
   private String Combo_emprcod_Cls ;
   private String Combo_emprcod_Datalistproc ;
   private String Combo_emprcod_Datalistprocparametersprefix ;
   private String Combo_emprcod_Internalname ;
   private String TempTags ;
   private String edtEmprCod_Jsonclick ;
   private String edtWorkstat_Internalname ;
   private String edtWorkstat_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String edtEscMTxt1_Internalname ;
   private String A881EscMTxt1 ;
   private String edtEscMTxt1_Jsonclick ;
   private String edtEscMTxt2_Internalname ;
   private String A882EscMTxt2 ;
   private String edtEscMTxt2_Jsonclick ;
   private String edtEscMInc_Internalname ;
   private String edtEscMInc_Jsonclick ;
   private String edtEscMKgm_Internalname ;
   private String edtEscMKgm_Jsonclick ;
   private String edtEscMVol_Internalname ;
   private String edtEscMVol_Jsonclick ;
   private String edtEscMUltLin_Internalname ;
   private String edtEscMUltLin_Jsonclick ;
   private String edtEscMValCos_Internalname ;
   private String edtEscMValCos_Jsonclick ;
   private String edtEmpNumDec_Internalname ;
   private String edtEmpNumDec_Jsonclick ;
   private String edtEscMCosT_Internalname ;
   private String edtEscMCosT_Jsonclick ;
   private String divTableleaflevel_level1_Internalname ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String divSectionattribute_emprcod_Internalname ;
   private String edtavComboemprcod_Internalname ;
   private String AV60ComboEmprCod ;
   private String edtavComboemprcod_Jsonclick ;
   private String Combo_prdnum_Caption ;
   private String Combo_prdnum_Cls ;
   private String Combo_prdnum_Datalistproc ;
   private String Combo_prdnum_Internalname ;
   private String Combo_proforcod_Caption ;
   private String Combo_proforcod_Cls ;
   private String Combo_proforcod_Datalistproc ;
   private String Combo_proforcod_Internalname ;
   private String Combo_forprdume_Caption ;
   private String Combo_forprdume_Cls ;
   private String Combo_forprdume_Datalistproc ;
   private String Combo_forprdume_Internalname ;
   private String sMode120 ;
   private String edtEscMLin_Internalname ;
   private String edtPrdNum_Internalname ;
   private String edtPrdNom_Internalname ;
   private String edtPrdPreAct_Internalname ;
   private String edtProForCod_Internalname ;
   private String edtProForDsc_Internalname ;
   private String edtEscMDsc_Internalname ;
   private String edtEscMPrdPre_Internalname ;
   private String edtEscMCan_Internalname ;
   private String edtForPrdUMe_Internalname ;
   private String edtForPrdDsc_Internalname ;
   private String edtEscMCos_Internalname ;
   private String edtEscMCosL_Internalname ;
   private String edtEscMCliCod_Internalname ;
   private String edtEscMArtCod_Internalname ;
   private String edtEscMMdlCod_Internalname ;
   private String edtEscMProCod_Internalname ;
   private String edtEscMFasCod_Internalname ;
   private String edtEscMFacCon_Internalname ;
   private String edtEscMRb_Internalname ;
   private String edtEscSol_Internalname ;
   private String edtEscVolm_Internalname ;
   private String edtEscOrdn_Internalname ;
   private String edtEscMCant_Internalname ;
   private String sStyleString ;
   private String subGridlevel_level1_Internalname ;
   private String Combo_emprcod_Objectcall ;
   private String Combo_emprcod_Class ;
   private String Combo_emprcod_Icontype ;
   private String Combo_emprcod_Icon ;
   private String Combo_emprcod_Tooltip ;
   private String Combo_emprcod_Selectedvalue_set ;
   private String Combo_emprcod_Selectedvalue_get ;
   private String Combo_emprcod_Selectedtext_set ;
   private String Combo_emprcod_Selectedtext_get ;
   private String Combo_emprcod_Gamoauthtoken ;
   private String Combo_emprcod_Ddointernalname ;
   private String Combo_emprcod_Titlecontrolalign ;
   private String Combo_emprcod_Dropdownoptionstype ;
   private String Combo_emprcod_Titlecontrolidtoreplace ;
   private String Combo_emprcod_Datalisttype ;
   private String Combo_emprcod_Datalistfixedvalues ;
   private String Combo_emprcod_Remoteservicesparameters ;
   private String Combo_emprcod_Htmltemplate ;
   private String Combo_emprcod_Multiplevaluestype ;
   private String Combo_emprcod_Loadingdata ;
   private String Combo_emprcod_Noresultsfound ;
   private String Combo_emprcod_Emptyitemtext ;
   private String Combo_emprcod_Onlyselectedvalues ;
   private String Combo_emprcod_Selectalltext ;
   private String Combo_emprcod_Multiplevaluesseparator ;
   private String Combo_emprcod_Addnewoptiontext ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String Combo_prdnum_Objectcall ;
   private String Combo_prdnum_Class ;
   private String Combo_prdnum_Icontype ;
   private String Combo_prdnum_Icon ;
   private String Combo_prdnum_Tooltip ;
   private String Combo_prdnum_Selectedvalue_set ;
   private String Combo_prdnum_Selectedvalue_get ;
   private String Combo_prdnum_Selectedtext_set ;
   private String Combo_prdnum_Selectedtext_get ;
   private String Combo_prdnum_Gamoauthtoken ;
   private String Combo_prdnum_Ddointernalname ;
   private String Combo_prdnum_Titlecontrolalign ;
   private String Combo_prdnum_Dropdownoptionstype ;
   private String Combo_prdnum_Titlecontrolidtoreplace ;
   private String Combo_prdnum_Datalisttype ;
   private String Combo_prdnum_Datalistfixedvalues ;
   private String Combo_prdnum_Datalistprocparametersprefix ;
   private String Combo_prdnum_Remoteservicesparameters ;
   private String Combo_prdnum_Htmltemplate ;
   private String Combo_prdnum_Multiplevaluestype ;
   private String Combo_prdnum_Loadingdata ;
   private String Combo_prdnum_Noresultsfound ;
   private String Combo_prdnum_Emptyitemtext ;
   private String Combo_prdnum_Onlyselectedvalues ;
   private String Combo_prdnum_Selectalltext ;
   private String Combo_prdnum_Multiplevaluesseparator ;
   private String Combo_prdnum_Addnewoptiontext ;
   private String Combo_proforcod_Objectcall ;
   private String Combo_proforcod_Class ;
   private String Combo_proforcod_Icontype ;
   private String Combo_proforcod_Icon ;
   private String Combo_proforcod_Tooltip ;
   private String Combo_proforcod_Selectedvalue_set ;
   private String Combo_proforcod_Selectedvalue_get ;
   private String Combo_proforcod_Selectedtext_set ;
   private String Combo_proforcod_Selectedtext_get ;
   private String Combo_proforcod_Gamoauthtoken ;
   private String Combo_proforcod_Ddointernalname ;
   private String Combo_proforcod_Titlecontrolalign ;
   private String Combo_proforcod_Dropdownoptionstype ;
   private String Combo_proforcod_Titlecontrolidtoreplace ;
   private String Combo_proforcod_Datalisttype ;
   private String Combo_proforcod_Datalistfixedvalues ;
   private String Combo_proforcod_Datalistprocparametersprefix ;
   private String Combo_proforcod_Remoteservicesparameters ;
   private String Combo_proforcod_Htmltemplate ;
   private String Combo_proforcod_Multiplevaluestype ;
   private String Combo_proforcod_Loadingdata ;
   private String Combo_proforcod_Noresultsfound ;
   private String Combo_proforcod_Emptyitemtext ;
   private String Combo_proforcod_Onlyselectedvalues ;
   private String Combo_proforcod_Selectalltext ;
   private String Combo_proforcod_Multiplevaluesseparator ;
   private String Combo_proforcod_Addnewoptiontext ;
   private String Combo_forprdume_Objectcall ;
   private String Combo_forprdume_Class ;
   private String Combo_forprdume_Icontype ;
   private String Combo_forprdume_Icon ;
   private String Combo_forprdume_Tooltip ;
   private String Combo_forprdume_Selectedvalue_set ;
   private String Combo_forprdume_Selectedvalue_get ;
   private String Combo_forprdume_Selectedtext_set ;
   private String Combo_forprdume_Selectedtext_get ;
   private String Combo_forprdume_Gamoauthtoken ;
   private String Combo_forprdume_Ddointernalname ;
   private String Combo_forprdume_Titlecontrolalign ;
   private String Combo_forprdume_Dropdownoptionstype ;
   private String Combo_forprdume_Titlecontrolidtoreplace ;
   private String Combo_forprdume_Datalisttype ;
   private String Combo_forprdume_Datalistfixedvalues ;
   private String Combo_forprdume_Datalistprocparametersprefix ;
   private String Combo_forprdume_Remoteservicesparameters ;
   private String Combo_forprdume_Htmltemplate ;
   private String Combo_forprdume_Multiplevaluestype ;
   private String Combo_forprdume_Loadingdata ;
   private String Combo_forprdume_Noresultsfound ;
   private String Combo_forprdume_Emptyitemtext ;
   private String Combo_forprdume_Onlyselectedvalues ;
   private String Combo_forprdume_Selectalltext ;
   private String Combo_forprdume_Multiplevaluesseparator ;
   private String Combo_forprdume_Addnewoptiontext ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String GXCCtl ;
   private String A718PrdNom ;
   private String A766ProForDsc ;
   private String A897EscMDsc ;
   private String A488ForPrdDsc ;
   private String A4708EscMArtCod ;
   private String A4709EscMMdlCod ;
   private String A4710EscMProCod ;
   private String A4711EscMFasCod ;
   private String Z407EmprNom ;
   private String sMode118 ;
   private String Z718PrdNom ;
   private String Z766ProForDsc ;
   private String Z488ForPrdDsc ;
   private String sGXsfl_89_fel_idx="0001" ;
   private String subGridlevel_level1_Class ;
   private String subGridlevel_level1_Linesclass ;
   private String ROClassString ;
   private String edtEscMLin_Jsonclick ;
   private String edtPrdNum_Jsonclick ;
   private String edtPrdNom_Jsonclick ;
   private String edtPrdPreAct_Jsonclick ;
   private String edtProForCod_Jsonclick ;
   private String edtProForDsc_Jsonclick ;
   private String edtEscMDsc_Jsonclick ;
   private String edtEscMPrdPre_Jsonclick ;
   private String edtEscMCan_Jsonclick ;
   private String edtForPrdUMe_Jsonclick ;
   private String edtForPrdDsc_Jsonclick ;
   private String edtEscMCos_Jsonclick ;
   private String edtEscMCosL_Jsonclick ;
   private String edtEscMCliCod_Jsonclick ;
   private String edtEscMArtCod_Jsonclick ;
   private String edtEscMMdlCod_Jsonclick ;
   private String edtEscMProCod_Jsonclick ;
   private String edtEscMFasCod_Jsonclick ;
   private String edtEscMFacCon_Jsonclick ;
   private String edtEscMRb_Jsonclick ;
   private String edtEscSol_Jsonclick ;
   private String edtEscVolm_Jsonclick ;
   private String edtEscOrdn_Jsonclick ;
   private String edtEscMCant_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGridlevel_level1_Header ;
   private String ZZ396EmprCod ;
   private String ZZ910Workstat ;
   private String ZZ881EscMTxt1 ;
   private String ZZ882EscMTxt2 ;
   private String ZZ407EmprNom ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean Dvpanel_tableattributes_Autowidth ;
   private boolean Dvpanel_tableattributes_Autoheight ;
   private boolean Dvpanel_tableattributes_Collapsible ;
   private boolean Dvpanel_tableattributes_Collapsed ;
   private boolean Dvpanel_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_tableattributes_Autoscroll ;
   private boolean Combo_emprcod_Emptyitem ;
   private boolean Combo_prdnum_Isgriditem ;
   private boolean Combo_prdnum_Hasdescription ;
   private boolean Combo_proforcod_Isgriditem ;
   private boolean Combo_proforcod_Hasdescription ;
   private boolean Combo_forprdume_Isgriditem ;
   private boolean Combo_forprdume_Hasdescription ;
   private boolean n893EscMCosT ;
   private boolean bGXsfl_89_Refreshing=false ;
   private boolean Combo_emprcod_Enabled ;
   private boolean Combo_emprcod_Visible ;
   private boolean Combo_emprcod_Allowmultipleselection ;
   private boolean Combo_emprcod_Isgriditem ;
   private boolean Combo_emprcod_Hasdescription ;
   private boolean Combo_emprcod_Includeonlyselectedoption ;
   private boolean Combo_emprcod_Includeselectalloption ;
   private boolean Combo_emprcod_Includeaddnewoption ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean Combo_prdnum_Enabled ;
   private boolean Combo_prdnum_Visible ;
   private boolean Combo_prdnum_Allowmultipleselection ;
   private boolean Combo_prdnum_Includeonlyselectedoption ;
   private boolean Combo_prdnum_Includeselectalloption ;
   private boolean Combo_prdnum_Emptyitem ;
   private boolean Combo_prdnum_Includeaddnewoption ;
   private boolean Combo_proforcod_Enabled ;
   private boolean Combo_proforcod_Visible ;
   private boolean Combo_proforcod_Allowmultipleselection ;
   private boolean Combo_proforcod_Includeonlyselectedoption ;
   private boolean Combo_proforcod_Includeselectalloption ;
   private boolean Combo_proforcod_Emptyitem ;
   private boolean Combo_proforcod_Includeaddnewoption ;
   private boolean Combo_forprdume_Enabled ;
   private boolean Combo_forprdume_Visible ;
   private boolean Combo_forprdume_Allowmultipleselection ;
   private boolean Combo_forprdume_Includeonlyselectedoption ;
   private boolean Combo_forprdume_Includeselectalloption ;
   private boolean Combo_forprdume_Emptyitem ;
   private boolean Combo_forprdume_Includeaddnewoption ;
   private boolean n407EmprNom ;
   private boolean n881EscMTxt1 ;
   private boolean n882EscMTxt2 ;
   private boolean n883EscMInc ;
   private boolean n884EscMKgm ;
   private boolean n885EscMVol ;
   private boolean n886EscMUltLin ;
   private boolean n896EscMValCos ;
   private boolean n3915EmpNumDec ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private boolean n488ForPrdDsc ;
   private com.genexus.webpanels.GXWebGrid Gridlevel_level1Container ;
   private com.genexus.webpanels.GXWebRow Gridlevel_level1Row ;
   private com.genexus.webpanels.GXWebColumn Gridlevel_level1Column ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.webpanels.GXUserControl ucCombo_emprcod ;
   private com.genexus.webpanels.GXUserControl ucCombo_prdnum ;
   private com.genexus.webpanels.GXUserControl ucCombo_proforcod ;
   private com.genexus.webpanels.GXUserControl ucCombo_forprdume ;
   private IDataStoreProvider pr_default ;
   private String[] T002W13_A910Workstat ;
   private String[] T002W13_A407EmprNom ;
   private boolean[] T002W13_n407EmprNom ;
   private String[] T002W13_A881EscMTxt1 ;
   private boolean[] T002W13_n881EscMTxt1 ;
   private String[] T002W13_A882EscMTxt2 ;
   private boolean[] T002W13_n882EscMTxt2 ;
   private java.math.BigDecimal[] T002W13_A883EscMInc ;
   private boolean[] T002W13_n883EscMInc ;
   private java.math.BigDecimal[] T002W13_A884EscMKgm ;
   private boolean[] T002W13_n884EscMKgm ;
   private int[] T002W13_A885EscMVol ;
   private boolean[] T002W13_n885EscMVol ;
   private int[] T002W13_A886EscMUltLin ;
   private boolean[] T002W13_n886EscMUltLin ;
   private int[] T002W13_A896EscMValCos ;
   private boolean[] T002W13_n896EscMValCos ;
   private byte[] T002W13_A3915EmpNumDec ;
   private boolean[] T002W13_n3915EmpNumDec ;
   private String[] T002W13_A396EmprCod ;
   private java.math.BigDecimal[] T002W13_A893EscMCosT ;
   private boolean[] T002W13_n893EscMCosT ;
   private String[] T002W9_A407EmprNom ;
   private boolean[] T002W9_n407EmprNom ;
   private byte[] T002W9_A3915EmpNumDec ;
   private boolean[] T002W9_n3915EmpNumDec ;
   private java.math.BigDecimal[] T002W11_A893EscMCosT ;
   private boolean[] T002W11_n893EscMCosT ;
   private String[] T002W14_A407EmprNom ;
   private boolean[] T002W14_n407EmprNom ;
   private byte[] T002W14_A3915EmpNumDec ;
   private boolean[] T002W14_n3915EmpNumDec ;
   private java.math.BigDecimal[] T002W16_A893EscMCosT ;
   private boolean[] T002W16_n893EscMCosT ;
   private String[] T002W17_A396EmprCod ;
   private String[] T002W17_A910Workstat ;
   private String[] T002W8_A910Workstat ;
   private String[] T002W8_A881EscMTxt1 ;
   private boolean[] T002W8_n881EscMTxt1 ;
   private String[] T002W8_A882EscMTxt2 ;
   private boolean[] T002W8_n882EscMTxt2 ;
   private java.math.BigDecimal[] T002W8_A883EscMInc ;
   private boolean[] T002W8_n883EscMInc ;
   private java.math.BigDecimal[] T002W8_A884EscMKgm ;
   private boolean[] T002W8_n884EscMKgm ;
   private int[] T002W8_A885EscMVol ;
   private boolean[] T002W8_n885EscMVol ;
   private int[] T002W8_A886EscMUltLin ;
   private boolean[] T002W8_n886EscMUltLin ;
   private int[] T002W8_A896EscMValCos ;
   private boolean[] T002W8_n896EscMValCos ;
   private String[] T002W8_A396EmprCod ;
   private String[] T002W18_A396EmprCod ;
   private String[] T002W18_A910Workstat ;
   private String[] T002W19_A396EmprCod ;
   private String[] T002W19_A910Workstat ;
   private String[] T002W7_A910Workstat ;
   private String[] T002W7_A881EscMTxt1 ;
   private boolean[] T002W7_n881EscMTxt1 ;
   private String[] T002W7_A882EscMTxt2 ;
   private boolean[] T002W7_n882EscMTxt2 ;
   private java.math.BigDecimal[] T002W7_A883EscMInc ;
   private boolean[] T002W7_n883EscMInc ;
   private java.math.BigDecimal[] T002W7_A884EscMKgm ;
   private boolean[] T002W7_n884EscMKgm ;
   private int[] T002W7_A885EscMVol ;
   private boolean[] T002W7_n885EscMVol ;
   private int[] T002W7_A886EscMUltLin ;
   private boolean[] T002W7_n886EscMUltLin ;
   private int[] T002W7_A896EscMValCos ;
   private boolean[] T002W7_n896EscMValCos ;
   private String[] T002W7_A396EmprCod ;
   private String[] T002W23_A407EmprNom ;
   private boolean[] T002W23_n407EmprNom ;
   private byte[] T002W23_A3915EmpNumDec ;
   private boolean[] T002W23_n3915EmpNumDec ;
   private java.math.BigDecimal[] T002W25_A893EscMCosT ;
   private boolean[] T002W25_n893EscMCosT ;
   private String[] T002W26_A396EmprCod ;
   private String[] T002W26_A910Workstat ;
   private short[] T002W26_A880EscLin ;
   private String[] T002W27_A396EmprCod ;
   private String[] T002W27_A910Workstat ;
   private String[] T002W28_A910Workstat ;
   private int[] T002W28_A887EscMLin ;
   private String[] T002W28_A718PrdNom ;
   private java.math.BigDecimal[] T002W28_A724PrdPreAct ;
   private String[] T002W28_A766ProForDsc ;
   private String[] T002W28_A897EscMDsc ;
   private java.math.BigDecimal[] T002W28_A889EscMPrdPre ;
   private java.math.BigDecimal[] T002W28_A890EscMCan ;
   private String[] T002W28_A488ForPrdDsc ;
   private boolean[] T002W28_n488ForPrdDsc ;
   private java.math.BigDecimal[] T002W28_A891EscMCos ;
   private int[] T002W28_A4707EscMCliCod ;
   private String[] T002W28_A4708EscMArtCod ;
   private String[] T002W28_A4709EscMMdlCod ;
   private String[] T002W28_A4710EscMProCod ;
   private String[] T002W28_A4711EscMFasCod ;
   private java.math.BigDecimal[] T002W28_A4712EscMFacCon ;
   private short[] T002W28_A4713EscMRb ;
   private int[] T002W28_A6060EscSol ;
   private int[] T002W28_A7584EscVolm ;
   private short[] T002W28_A7583EscOrdn ;
   private java.math.BigDecimal[] T002W28_A10363EscMCant ;
   private String[] T002W28_A396EmprCod ;
   private String[] T002W28_A719PrdNum ;
   private String[] T002W28_A764ProForCod ;
   private byte[] T002W28_A490ForPrdUMe ;
   private String[] T002W4_A718PrdNom ;
   private java.math.BigDecimal[] T002W4_A724PrdPreAct ;
   private String[] T002W5_A766ProForDsc ;
   private String[] T002W6_A488ForPrdDsc ;
   private boolean[] T002W6_n488ForPrdDsc ;
   private String[] T002W29_A718PrdNom ;
   private java.math.BigDecimal[] T002W29_A724PrdPreAct ;
   private String[] T002W30_A766ProForDsc ;
   private String[] T002W31_A488ForPrdDsc ;
   private boolean[] T002W31_n488ForPrdDsc ;
   private String[] T002W32_A396EmprCod ;
   private String[] T002W32_A910Workstat ;
   private int[] T002W32_A887EscMLin ;
   private String[] T002W3_A910Workstat ;
   private int[] T002W3_A887EscMLin ;
   private String[] T002W3_A897EscMDsc ;
   private java.math.BigDecimal[] T002W3_A889EscMPrdPre ;
   private java.math.BigDecimal[] T002W3_A890EscMCan ;
   private java.math.BigDecimal[] T002W3_A891EscMCos ;
   private int[] T002W3_A4707EscMCliCod ;
   private String[] T002W3_A4708EscMArtCod ;
   private String[] T002W3_A4709EscMMdlCod ;
   private String[] T002W3_A4710EscMProCod ;
   private String[] T002W3_A4711EscMFasCod ;
   private java.math.BigDecimal[] T002W3_A4712EscMFacCon ;
   private short[] T002W3_A4713EscMRb ;
   private int[] T002W3_A6060EscSol ;
   private int[] T002W3_A7584EscVolm ;
   private short[] T002W3_A7583EscOrdn ;
   private java.math.BigDecimal[] T002W3_A10363EscMCant ;
   private String[] T002W3_A396EmprCod ;
   private String[] T002W3_A719PrdNum ;
   private String[] T002W3_A764ProForCod ;
   private byte[] T002W3_A490ForPrdUMe ;
   private String[] T002W2_A910Workstat ;
   private int[] T002W2_A887EscMLin ;
   private String[] T002W2_A897EscMDsc ;
   private java.math.BigDecimal[] T002W2_A889EscMPrdPre ;
   private java.math.BigDecimal[] T002W2_A890EscMCan ;
   private java.math.BigDecimal[] T002W2_A891EscMCos ;
   private int[] T002W2_A4707EscMCliCod ;
   private String[] T002W2_A4708EscMArtCod ;
   private String[] T002W2_A4709EscMMdlCod ;
   private String[] T002W2_A4710EscMProCod ;
   private String[] T002W2_A4711EscMFasCod ;
   private java.math.BigDecimal[] T002W2_A4712EscMFacCon ;
   private short[] T002W2_A4713EscMRb ;
   private int[] T002W2_A6060EscSol ;
   private int[] T002W2_A7584EscVolm ;
   private short[] T002W2_A7583EscOrdn ;
   private java.math.BigDecimal[] T002W2_A10363EscMCant ;
   private String[] T002W2_A396EmprCod ;
   private String[] T002W2_A719PrdNum ;
   private String[] T002W2_A764ProForCod ;
   private byte[] T002W2_A490ForPrdUMe ;
   private String[] T002W36_A718PrdNom ;
   private java.math.BigDecimal[] T002W36_A724PrdPreAct ;
   private String[] T002W37_A766ProForDsc ;
   private String[] T002W38_A488ForPrdDsc ;
   private boolean[] T002W38_n488ForPrdDsc ;
   private String[] T002W39_A396EmprCod ;
   private String[] T002W39_A910Workstat ;
   private int[] T002W39_A887EscMLin ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV59EmprCod_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV51PrdNum_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV57ProForCod_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV58ForPrdUMe_Data ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV52DDO_TitleSettingsIcons ;
}

final  class tescand__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tescand__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tescand__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tescand__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tescand__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T002W2", "SELECT Workstat, EscMLin, EscMDsc, EscMPrdPre, EscMCan, EscMCos, EscMCliCod, EscMArtCod, EscMMdlCod, EscMProCod, EscMFasCod, EscMFacCon, EscMRb, EscSol, EscVolm, EscOrdn, EscMCant, EmprCod, PrdNum, ProForCod, ForPrdUMe FROM TXPESCMAN WHERE EmprCod = ? AND Workstat = ? AND EscMLin = ?  FOR UPDATE OF EscMDsc, EscMPrdPre, EscMCan, EscMCos, EscMCliCod, EscMArtCod, EscMMdlCod, EscMProCod, EscMFasCod, EscMFacCon, EscMRb, EscSol, EscVolm, EscOrdn, EscMCant, PrdNum, ProForCod, ForPrdUMe NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002W3", "SELECT Workstat, EscMLin, EscMDsc, EscMPrdPre, EscMCan, EscMCos, EscMCliCod, EscMArtCod, EscMMdlCod, EscMProCod, EscMFasCod, EscMFacCon, EscMRb, EscSol, EscVolm, EscOrdn, EscMCant, EmprCod, PrdNum, ProForCod, ForPrdUMe FROM TXPESCMAN WHERE EmprCod = ? AND Workstat = ? AND EscMLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002W4", "SELECT PrdNom, PrdPreAct FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002W5", "SELECT ProForDsc FROM TXPCPROFO WHERE EmprCod = ? AND ProForCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002W6", "SELECT ForPrdDsc FROM TXPUNMEPR WHERE EmprCod = ? AND ForPrdUMe = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002W7", "SELECT Workstat, EscMTxt1, EscMTxt2, EscMInc, EscMKgm, EscMVol, EscMUltLin, EscMValCos, EmprCod FROM TXPCESCAN WHERE EmprCod = ? AND Workstat = ?  FOR UPDATE OF EscMTxt1, EscMTxt2, EscMInc, EscMKgm, EscMVol, EscMUltLin, EscMValCos NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002W8", "SELECT Workstat, EscMTxt1, EscMTxt2, EscMInc, EscMKgm, EscMVol, EscMUltLin, EscMValCos, EmprCod FROM TXPCESCAN WHERE EmprCod = ? AND Workstat = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002W9", "SELECT EmprNom, EmpNumDec FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002W11", "SELECT COALESCE( T1.EscMCosT, 0) AS EscMCosT FROM (SELECT SUM(EscMCos) AS EscMCosT, EmprCod, Workstat FROM TXPESCMAN GROUP BY EmprCod, Workstat ) T1 WHERE T1.EmprCod = ? AND T1.Workstat = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002W13", "SELECT /*+ FIRST_ROWS(100) */ TM1.Workstat, T2.EmprNom, TM1.EscMTxt1, TM1.EscMTxt2, TM1.EscMInc, TM1.EscMKgm, TM1.EscMVol, TM1.EscMUltLin, TM1.EscMValCos, T2.EmpNumDec, TM1.EmprCod, COALESCE( T3.EscMCosT, 0) AS EscMCosT FROM ((TXPCESCAN TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) LEFT JOIN (SELECT SUM(EscMCos) AS EscMCosT, EmprCod, Workstat FROM TXPESCMAN GROUP BY EmprCod, Workstat ) T3 ON T3.EmprCod = TM1.EmprCod AND T3.Workstat = TM1.Workstat) WHERE TM1.EmprCod = ? and TM1.Workstat = ? ORDER BY TM1.EmprCod, TM1.Workstat ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002W14", "SELECT EmprNom, EmpNumDec FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002W16", "SELECT COALESCE( T1.EscMCosT, 0) AS EscMCosT FROM (SELECT SUM(EscMCos) AS EscMCosT, EmprCod, Workstat FROM TXPESCMAN GROUP BY EmprCod, Workstat ) T1 WHERE T1.EmprCod = ? AND T1.Workstat = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002W17", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, Workstat FROM TXPCESCAN WHERE EmprCod = ? AND Workstat = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002W18", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, Workstat FROM TXPCESCAN WHERE ( EmprCod > ? or EmprCod = ? and Workstat > ?) ORDER BY EmprCod, Workstat) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002W19", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, Workstat FROM TXPCESCAN WHERE ( EmprCod < ? or EmprCod = ? and Workstat < ?) ORDER BY EmprCod DESC, Workstat DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T002W20", "INSERT INTO TXPCESCAN(Workstat, EscMTxt1, EscMTxt2, EscMInc, EscMKgm, EscMVol, EscMUltLin, EscMValCos, EmprCod, EscInc, EscKgm, EscVol, EscUltLin) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, 0, 0)", GX_NOMASK, "TXPCESCAN")
         ,new UpdateCursor("T002W21", "UPDATE TXPCESCAN SET EscMTxt1=?, EscMTxt2=?, EscMInc=?, EscMKgm=?, EscMVol=?, EscMUltLin=?, EscMValCos=?  WHERE EmprCod = ? AND Workstat = ?", GX_NOMASK, "TXPCESCAN")
         ,new UpdateCursor("T002W22", "DELETE FROM TXPCESCAN  WHERE EmprCod = ? AND Workstat = ?", GX_NOMASK, "TXPCESCAN")
         ,new ForEachCursor("T002W23", "SELECT EmprNom, EmpNumDec FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002W25", "SELECT COALESCE( T1.EscMCosT, 0) AS EscMCosT FROM (SELECT SUM(EscMCos) AS EscMCosT, EmprCod, Workstat FROM TXPESCMAN GROUP BY EmprCod, Workstat ) T1 WHERE T1.EmprCod = ? AND T1.Workstat = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002W26", "SELECT * FROM (SELECT EmprCod, Workstat, EscLin FROM TXPLESCAN WHERE EmprCod = ? AND Workstat = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002W27", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, Workstat FROM TXPCESCAN ORDER BY EmprCod, Workstat ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002W28", "SELECT T1.Workstat, T1.EscMLin, T2.PrdNom, T2.PrdPreAct, T3.ProForDsc, T1.EscMDsc, T1.EscMPrdPre, T1.EscMCan, T4.ForPrdDsc, T1.EscMCos, T1.EscMCliCod, T1.EscMArtCod, T1.EscMMdlCod, T1.EscMProCod, T1.EscMFasCod, T1.EscMFacCon, T1.EscMRb, T1.EscSol, T1.EscVolm, T1.EscOrdn, T1.EscMCant, T1.EmprCod, T1.PrdNum, T1.ProForCod, T1.ForPrdUMe FROM (((TXPESCMAN T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) INNER JOIN TXPCPROFO T3 ON T3.EmprCod = T1.EmprCod AND T3.ProForCod = T1.ProForCod) INNER JOIN TXPUNMEPR T4 ON T4.EmprCod = T1.EmprCod AND T4.ForPrdUMe = T1.ForPrdUMe) WHERE T1.EmprCod = ? and T1.Workstat = ? and T1.EscMLin = ? ORDER BY T1.EmprCod, T1.Workstat, T1.EscMLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002W29", "SELECT PrdNom, PrdPreAct FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002W30", "SELECT ProForDsc FROM TXPCPROFO WHERE EmprCod = ? AND ProForCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002W31", "SELECT ForPrdDsc FROM TXPUNMEPR WHERE EmprCod = ? AND ForPrdUMe = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002W32", "SELECT EmprCod, Workstat, EscMLin FROM TXPESCMAN WHERE EmprCod = ? AND Workstat = ? AND EscMLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T002W33", "INSERT INTO TXPESCMAN(Workstat, EscMLin, EscMDsc, EscMPrdPre, EscMCan, EscMCos, EscMCliCod, EscMArtCod, EscMMdlCod, EscMProCod, EscMFasCod, EscMFacCon, EscMRb, EscSol, EscVolm, EscOrdn, EscMCant, EmprCod, PrdNum, ProForCod, ForPrdUMe) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPESCMAN")
         ,new UpdateCursor("T002W34", "UPDATE TXPESCMAN SET EscMDsc=?, EscMPrdPre=?, EscMCan=?, EscMCos=?, EscMCliCod=?, EscMArtCod=?, EscMMdlCod=?, EscMProCod=?, EscMFasCod=?, EscMFacCon=?, EscMRb=?, EscSol=?, EscVolm=?, EscOrdn=?, EscMCant=?, PrdNum=?, ProForCod=?, ForPrdUMe=?  WHERE EmprCod = ? AND Workstat = ? AND EscMLin = ?", GX_NOMASK, "TXPESCMAN")
         ,new UpdateCursor("T002W35", "DELETE FROM TXPESCMAN  WHERE EmprCod = ? AND Workstat = ? AND EscMLin = ?", GX_NOMASK, "TXPESCMAN")
         ,new ForEachCursor("T002W36", "SELECT PrdNom, PrdPreAct FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002W37", "SELECT ProForDsc FROM TXPCPROFO WHERE EmprCod = ? AND ProForCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002W38", "SELECT ForPrdDsc FROM TXPUNMEPR WHERE EmprCod = ? AND ForPrdUMe = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002W39", "SELECT EmprCod, Workstat, EscMLin FROM TXPESCMAN WHERE EmprCod = ? and Workstat = ? ORDER BY EmprCod, Workstat, EscMLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,4);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 16);
               ((String[]) buf[8])[0] = rslt.getString(9, 13);
               ((String[]) buf[9])[0] = rslt.getString(10, 8);
               ((String[]) buf[10])[0] = rslt.getString(11, 8);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(12,5);
               ((short[]) buf[12])[0] = rslt.getShort(13);
               ((int[]) buf[13])[0] = rslt.getInt(14);
               ((int[]) buf[14])[0] = rslt.getInt(15);
               ((short[]) buf[15])[0] = rslt.getShort(16);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(17,3);
               ((String[]) buf[17])[0] = rslt.getString(18, 3);
               ((String[]) buf[18])[0] = rslt.getString(19, 6);
               ((String[]) buf[19])[0] = rslt.getString(20, 6);
               ((byte[]) buf[20])[0] = rslt.getByte(21);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,4);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 16);
               ((String[]) buf[8])[0] = rslt.getString(9, 13);
               ((String[]) buf[9])[0] = rslt.getString(10, 8);
               ((String[]) buf[10])[0] = rslt.getString(11, 8);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(12,5);
               ((short[]) buf[12])[0] = rslt.getShort(13);
               ((int[]) buf[13])[0] = rslt.getInt(14);
               ((int[]) buf[14])[0] = rslt.getInt(15);
               ((short[]) buf[15])[0] = rslt.getShort(16);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(17,3);
               ((String[]) buf[17])[0] = rslt.getString(18, 3);
               ((String[]) buf[18])[0] = rslt.getString(19, 6);
               ((String[]) buf[19])[0] = rslt.getString(20, 6);
               ((byte[]) buf[20])[0] = rslt.getByte(21);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,5);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 5);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
               ((String[]) buf[1])[0] = rslt.getString(2, 60);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 60);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((int[]) buf[13])[0] = rslt.getInt(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 3);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
               ((String[]) buf[1])[0] = rslt.getString(2, 60);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 60);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((int[]) buf[13])[0] = rslt.getInt(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 3);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((byte[]) buf[2])[0] = rslt.getByte(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 8 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,5);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 60);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 60);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((int[]) buf[13])[0] = rslt.getInt(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((int[]) buf[15])[0] = rslt.getInt(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((byte[]) buf[17])[0] = rslt.getByte(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 3);
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(12,5);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((byte[]) buf[2])[0] = rslt.getByte(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 11 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,5);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((byte[]) buf[2])[0] = rslt.getByte(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 19 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,5);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((String[]) buf[5])[0] = rslt.getString(6, 26);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,4);
               ((String[]) buf[8])[0] = rslt.getString(9, 5);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(10,5);
               ((int[]) buf[11])[0] = rslt.getInt(11);
               ((String[]) buf[12])[0] = rslt.getString(12, 16);
               ((String[]) buf[13])[0] = rslt.getString(13, 13);
               ((String[]) buf[14])[0] = rslt.getString(14, 8);
               ((String[]) buf[15])[0] = rslt.getString(15, 8);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(16,5);
               ((short[]) buf[17])[0] = rslt.getShort(17);
               ((int[]) buf[18])[0] = rslt.getInt(18);
               ((int[]) buf[19])[0] = rslt.getInt(19);
               ((short[]) buf[20])[0] = rslt.getShort(20);
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(21,3);
               ((String[]) buf[22])[0] = rslt.getString(22, 3);
               ((String[]) buf[23])[0] = rslt.getString(23, 6);
               ((String[]) buf[24])[0] = rslt.getString(24, 6);
               ((byte[]) buf[25])[0] = rslt.getByte(25);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,5);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 5);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
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
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,5);
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 5);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 33 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
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
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 10);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 10);
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 10);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 60);
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 60);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[6], 2);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[8], 2);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(6, ((Number) parms[10]).intValue());
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(7, ((Number) parms[12]).intValue());
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(8, ((Number) parms[14]).intValue());
               }
               stmt.setString(9, (String)parms[15], 3);
               return;
            case 16 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 60);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 60);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(3, (java.math.BigDecimal)parms[5], 2);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[7], 2);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[9]).intValue());
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(6, ((Number) parms[11]).intValue());
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(7, ((Number) parms[13]).intValue());
               }
               stmt.setString(8, (String)parms[14], 3);
               stmt.setString(9, (String)parms[15], 10);
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 10);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 26);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 5);
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 4);
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[5], 5);
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setString(8, (String)parms[7], 16);
               stmt.setString(9, (String)parms[8], 13);
               stmt.setString(10, (String)parms[9], 8);
               stmt.setString(11, (String)parms[10], 8);
               stmt.setBigDecimal(12, (java.math.BigDecimal)parms[11], 5);
               stmt.setShort(13, ((Number) parms[12]).shortValue());
               stmt.setInt(14, ((Number) parms[13]).intValue());
               stmt.setInt(15, ((Number) parms[14]).intValue());
               stmt.setShort(16, ((Number) parms[15]).shortValue());
               stmt.setBigDecimal(17, (java.math.BigDecimal)parms[16], 3);
               stmt.setString(18, (String)parms[17], 3);
               stmt.setString(19, (String)parms[18], 6);
               stmt.setString(20, (String)parms[19], 6);
               stmt.setByte(21, ((Number) parms[20]).byteValue());
               return;
            case 28 :
               stmt.setString(1, (String)parms[0], 26);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 5);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 4);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 5);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 16);
               stmt.setString(7, (String)parms[6], 13);
               stmt.setString(8, (String)parms[7], 8);
               stmt.setString(9, (String)parms[8], 8);
               stmt.setBigDecimal(10, (java.math.BigDecimal)parms[9], 5);
               stmt.setShort(11, ((Number) parms[10]).shortValue());
               stmt.setInt(12, ((Number) parms[11]).intValue());
               stmt.setInt(13, ((Number) parms[12]).intValue());
               stmt.setShort(14, ((Number) parms[13]).shortValue());
               stmt.setBigDecimal(15, (java.math.BigDecimal)parms[14], 3);
               stmt.setString(16, (String)parms[15], 6);
               stmt.setString(17, (String)parms[16], 6);
               stmt.setByte(18, ((Number) parms[17]).byteValue());
               stmt.setString(19, (String)parms[18], 3);
               stmt.setString(20, (String)parms[19], 10);
               stmt.setInt(21, ((Number) parms[20]).intValue());
               return;
            case 29 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
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
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 31 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 32 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 33 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               return;
      }
   }

}

