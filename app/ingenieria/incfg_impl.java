package app.ingenieria ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class incfg_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel1"+"_"+"INCFGID") == 0 )
      {
         AV11InCfgId = (short)(GXutil.lval( httpContext.GetPar( "InCfgId"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11InCfgId", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11InCfgId), 4, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vINCFGID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV11InCfgId), "ZZZ9")));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx1asaincfgid1SL1884( AV11InCfgId) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel2"+"_"+"INCFGID") == 0 )
      {
         Gx_mode = httpContext.GetPar( "Mode") ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx2asaincfgid1SL1884( Gx_mode) ;
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
            AV11InCfgId = (short)(GXutil.lval( httpContext.GetPar( "InCfgId"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV11InCfgId", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11InCfgId), 4, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vINCFGID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV11InCfgId), "ZZZ9")));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Configuración", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtInCfgNombr_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public incfg_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public incfg_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( incfg_impl.class ));
   }

   public incfg_impl( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      chkInCfgSMS = UIFactory.getCheckbox(this);
      chkInCfgWapp = UIFactory.getCheckbox(this);
      chkInCfgNotif = UIFactory.getCheckbox(this);
      chkInCfgDisc = UIFactory.getCheckbox(this);
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
      A14065InCfgSMS = GXutil.strtobool( GXutil.booltostr( A14065InCfgSMS)) ;
      httpContext.ajax_rsp_assign_attri("", false, "A14065InCfgSMS", A14065InCfgSMS);
      A14066InCfgWapp = GXutil.strtobool( GXutil.booltostr( A14066InCfgWapp)) ;
      httpContext.ajax_rsp_assign_attri("", false, "A14066InCfgWapp", A14066InCfgWapp);
      A14067InCfgNotif = GXutil.strtobool( GXutil.booltostr( A14067InCfgNotif)) ;
      httpContext.ajax_rsp_assign_attri("", false, "A14067InCfgNotif", A14067InCfgNotif);
      A14068InCfgDisc = GXutil.strtobool( GXutil.booltostr( A14068InCfgDisc)) ;
      httpContext.ajax_rsp_assign_attri("", false, "A14068InCfgDisc", A14068InCfgDisc);
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-lg-6", "left", "top", "", "", "div");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCellFL RequiredDataContentCellFL", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtInCfgNombr_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtInCfgNombr_Internalname, httpContext.getMessage( "Nombre de la configuración", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtInCfgNombr_Internalname, A14063InCfgNombr, GXutil.rtrim( localUtil.format( A14063InCfgNombr, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,22);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtInCfgNombr_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtInCfgNombr_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "Descripcion30", "left", true, "", "HLP_Ingenieria\\InCfg.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtInCfgEmail_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtInCfgEmail_Internalname, httpContext.getMessage( "Correos a notificar", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'',0)\"" ;
      ClassString = "AttributeFL" ;
      StyleString = "" ;
      ClassString = "AttributeFL" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtInCfgEmail_Internalname, A14064InCfgEmail, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,26);\"", (short)(0), 1, edtInCfgEmail_Enabled, 0, 80, "chr", 10, "row", (byte)(0), StyleString, ClassString, "", "", "1024", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_Ingenieria\\InCfg.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkInCfgSMS.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, chkInCfgSMS.getInternalname(), httpContext.getMessage( "Mensajería", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Check box */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
      ClassString = "AttributeFL" ;
      StyleString = "" ;
      app.GxWebStd.gx_checkbox_ctrl( httpContext, chkInCfgSMS.getInternalname(), GXutil.booltostr( A14065InCfgSMS), "", httpContext.getMessage( "Mensajería", ""), 1, chkInCfgSMS.getEnabled(), "true", "", StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(31, this, 'true', 'false',"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+""+";gx.evt.onblur(this,31);\"");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkInCfgWapp.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, chkInCfgWapp.getInternalname(), httpContext.getMessage( "WhatsApp", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Check box */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 35,'',false,'',0)\"" ;
      ClassString = "AttributeFL" ;
      StyleString = "" ;
      app.GxWebStd.gx_checkbox_ctrl( httpContext, chkInCfgWapp.getInternalname(), GXutil.booltostr( A14066InCfgWapp), "", httpContext.getMessage( "WhatsApp", ""), 1, chkInCfgWapp.getEnabled(), "true", "", StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(35, this, 'true', 'false',"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+""+";gx.evt.onblur(this,35);\"");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkInCfgNotif.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, chkInCfgNotif.getInternalname(), httpContext.getMessage( "Notificaciones", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Check box */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 45,'',false,'',0)\"" ;
      ClassString = "AttributeFL" ;
      StyleString = "" ;
      app.GxWebStd.gx_checkbox_ctrl( httpContext, chkInCfgNotif.getInternalname(), GXutil.booltostr( A14067InCfgNotif), "", httpContext.getMessage( "Notificaciones", ""), 1, chkInCfgNotif.getEnabled(), "true", "", StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(45, this, 'true', 'false',"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+""+";gx.evt.onblur(this,45);\"");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkInCfgDisc.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, chkInCfgDisc.getInternalname(), httpContext.getMessage( "Discusiones", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Check box */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
      ClassString = "AttributeFL" ;
      StyleString = "" ;
      app.GxWebStd.gx_checkbox_ctrl( httpContext, chkInCfgDisc.getInternalname(), GXutil.booltostr( A14068InCfgDisc), "", httpContext.getMessage( "Discusiones", ""), 1, chkInCfgDisc.getEnabled(), "true", "", StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(49, this, 'true', 'false',"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+""+";gx.evt.onblur(this,49);\"");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Ingenieria\\InCfg.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Ingenieria\\InCfg.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 58,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Ingenieria\\InCfg.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV16Pgmname), GXutil.rtrim( localUtil.format( AV16Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Ingenieria\\InCfg.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtInCfgId_Internalname, GXutil.ltrim( localUtil.ntoc( A14062InCfgId, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A14062InCfgId), "ZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtInCfgId_Jsonclick, 0, "Attribute", "", "", "", "", edtInCfgId_Visible, edtInCfgId_Enabled, 1, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Ingenieria\\InCfg.htm");
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
      e111SL2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z14062InCfgId = (short)(localUtil.ctol( httpContext.cgiGet( "Z14062InCfgId"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z14063InCfgNombr = httpContext.cgiGet( "Z14063InCfgNombr") ;
            Z14064InCfgEmail = httpContext.cgiGet( "Z14064InCfgEmail") ;
            Z14065InCfgSMS = GXutil.strtobool( httpContext.cgiGet( "Z14065InCfgSMS")) ;
            Z14066InCfgWapp = GXutil.strtobool( httpContext.cgiGet( "Z14066InCfgWapp")) ;
            Z14067InCfgNotif = GXutil.strtobool( httpContext.cgiGet( "Z14067InCfgNotif")) ;
            Z14068InCfgDisc = GXutil.strtobool( httpContext.cgiGet( "Z14068InCfgDisc")) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            AV11InCfgId = (short)(localUtil.ctol( httpContext.cgiGet( "vINCFGID"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
            A14063InCfgNombr = httpContext.cgiGet( edtInCfgNombr_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14063InCfgNombr", A14063InCfgNombr);
            A14064InCfgEmail = httpContext.cgiGet( edtInCfgEmail_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14064InCfgEmail", A14064InCfgEmail);
            A14065InCfgSMS = GXutil.strtobool( httpContext.cgiGet( chkInCfgSMS.getInternalname())) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14065InCfgSMS", A14065InCfgSMS);
            A14066InCfgWapp = GXutil.strtobool( httpContext.cgiGet( chkInCfgWapp.getInternalname())) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14066InCfgWapp", A14066InCfgWapp);
            A14067InCfgNotif = GXutil.strtobool( httpContext.cgiGet( chkInCfgNotif.getInternalname())) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14067InCfgNotif", A14067InCfgNotif);
            A14068InCfgDisc = GXutil.strtobool( httpContext.cgiGet( chkInCfgDisc.getInternalname())) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14068InCfgDisc", A14068InCfgDisc);
            AV16Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16Pgmname", AV16Pgmname);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtInCfgId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtInCfgId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "INCFGID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtInCfgId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A14062InCfgId = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A14062InCfgId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14062InCfgId), 4, 0));
            }
            else
            {
               A14062InCfgId = (short)(localUtil.ctol( httpContext.cgiGet( edtInCfgId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A14062InCfgId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14062InCfgId), 4, 0));
            }
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"InCfg");
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( A14062InCfgId != Z14062InCfgId ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("ingenieria\\incfg:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               A14062InCfgId = (short)(GXutil.lval( httpContext.GetPar( "InCfgId"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A14062InCfgId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14062InCfgId), 4, 0));
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
                  sMode1884 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  Gx_mode = sMode1884 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound1884 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_1SL0( ) ;
                        if ( AnyError == 0 )
                        {
                           GX_FocusControl = bttBtntrn_enter_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noinsert"), 1, "INCFGID");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtInCfgId_Internalname ;
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
                        e111SL2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e121SL2 ();
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
         e121SL2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll1SL1884( ) ;
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
         disableAttributes1SL1884( ) ;
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

   public void confirm_1SL0( )
   {
      beforeValidate1SL1884( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1SL1884( ) ;
         }
         else
         {
            checkExtendedTable1SL1884( ) ;
            closeExtendedTableCursors1SL1884( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
   }

   public void resetCaption1SL0( )
   {
   }

   public void e111SL2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV12Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      incfg_impl.this.GXt_char1 = GXv_char2[0] ;
      AV12Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = AV13EmprCod ;
      GXv_char3[0] = AV14EmprNom ;
      GXv_char4[0] = AV15UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      incfg_impl.this.AV13EmprCod = GXv_char2[0] ;
      incfg_impl.this.AV14EmprNom = GXv_char3[0] ;
      incfg_impl.this.AV15UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13EmprCod", AV13EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV14EmprNom", AV14EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV15UsurCod", AV15UsurCod);
      GXv_SdtWWPContext5[0] = AV8WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext5) ;
      AV8WWPContext = GXv_SdtWWPContext5[0] ;
      AV9TrnContext.fromxml(AV10WebSession.getValue("TrnContext"), null, null);
      edtInCfgId_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtInCfgId_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtInCfgId_Visible), 5, 0), true);
   }

   public void e121SL2( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV9TrnContext.getgxTv_SdtWWPTransactionContext_Callerondelete() )
      {
         callWebObject(formatLink("app.ingenieria.incfgww", new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      pr_default.close(1);
      returnInSub = true;
      if (true) return;
   }

   public void zm1SL1884( int GX_JID )
   {
      if ( ( GX_JID == 6 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z14063InCfgNombr = T01SL3_A14063InCfgNombr[0] ;
            Z14064InCfgEmail = T01SL3_A14064InCfgEmail[0] ;
            Z14065InCfgSMS = T01SL3_A14065InCfgSMS[0] ;
            Z14066InCfgWapp = T01SL3_A14066InCfgWapp[0] ;
            Z14067InCfgNotif = T01SL3_A14067InCfgNotif[0] ;
            Z14068InCfgDisc = T01SL3_A14068InCfgDisc[0] ;
         }
         else
         {
            Z14063InCfgNombr = A14063InCfgNombr ;
            Z14064InCfgEmail = A14064InCfgEmail ;
            Z14065InCfgSMS = A14065InCfgSMS ;
            Z14066InCfgWapp = A14066InCfgWapp ;
            Z14067InCfgNotif = A14067InCfgNotif ;
            Z14068InCfgDisc = A14068InCfgDisc ;
         }
      }
      if ( GX_JID == -6 )
      {
         Z14062InCfgId = A14062InCfgId ;
         Z14063InCfgNombr = A14063InCfgNombr ;
         Z14064InCfgEmail = A14064InCfgEmail ;
         Z14065InCfgSMS = A14065InCfgSMS ;
         Z14066InCfgWapp = A14066InCfgWapp ;
         Z14067InCfgNotif = A14067InCfgNotif ;
         Z14068InCfgDisc = A14068InCfgDisc ;
      }
   }

   public void standaloneNotModal( )
   {
      AV16Pgmname = "Ingenieria.InCfg" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16Pgmname", AV16Pgmname);
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      if ( ! (0==AV11InCfgId) )
      {
         A14062InCfgId = AV11InCfgId ;
         httpContext.ajax_rsp_assign_attri("", false, "A14062InCfgId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14062InCfgId), 4, 0));
      }
      if ( ! (0==AV11InCfgId) )
      {
         edtInCfgId_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtInCfgId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtInCfgId_Enabled), 5, 0), true);
      }
      else
      {
         edtInCfgId_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtInCfgId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtInCfgId_Enabled), 5, 0), true);
      }
      if ( ! (0==AV11InCfgId) )
      {
         edtInCfgId_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtInCfgId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtInCfgId_Enabled), 5, 0), true);
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
   }

   public void load1SL1884( )
   {
      /* Using cursor T01SL4 */
      pr_default.execute(2, new Object[] {Short.valueOf(A14062InCfgId)});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound1884 = (short)(1) ;
         A14063InCfgNombr = T01SL4_A14063InCfgNombr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14063InCfgNombr", A14063InCfgNombr);
         A14064InCfgEmail = T01SL4_A14064InCfgEmail[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14064InCfgEmail", A14064InCfgEmail);
         A14065InCfgSMS = T01SL4_A14065InCfgSMS[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14065InCfgSMS", A14065InCfgSMS);
         A14066InCfgWapp = T01SL4_A14066InCfgWapp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14066InCfgWapp", A14066InCfgWapp);
         A14067InCfgNotif = T01SL4_A14067InCfgNotif[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14067InCfgNotif", A14067InCfgNotif);
         A14068InCfgDisc = T01SL4_A14068InCfgDisc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14068InCfgDisc", A14068InCfgDisc);
         zm1SL1884( -6) ;
      }
      pr_default.close(2);
      onLoadActions1SL1884( ) ;
   }

   public void onLoadActions1SL1884( )
   {
   }

   public void checkExtendedTable1SL1884( )
   {
      nIsDirty_1884 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      if ( (GXutil.strcmp("", A14063InCfgNombr)==0) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Nombre de la configuración es requerido.", ""), 1, "INCFGNOMBR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtInCfgNombr_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors1SL1884( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1SL1884( )
   {
      /* Using cursor T01SL5 */
      pr_default.execute(3, new Object[] {Short.valueOf(A14062InCfgId)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound1884 = (short)(1) ;
      }
      else
      {
         RcdFound1884 = (short)(0) ;
      }
      pr_default.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01SL3 */
      pr_default.execute(1, new Object[] {Short.valueOf(A14062InCfgId)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1SL1884( 6) ;
         RcdFound1884 = (short)(1) ;
         A14062InCfgId = T01SL3_A14062InCfgId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14062InCfgId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14062InCfgId), 4, 0));
         A14063InCfgNombr = T01SL3_A14063InCfgNombr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14063InCfgNombr", A14063InCfgNombr);
         A14064InCfgEmail = T01SL3_A14064InCfgEmail[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14064InCfgEmail", A14064InCfgEmail);
         A14065InCfgSMS = T01SL3_A14065InCfgSMS[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14065InCfgSMS", A14065InCfgSMS);
         A14066InCfgWapp = T01SL3_A14066InCfgWapp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14066InCfgWapp", A14066InCfgWapp);
         A14067InCfgNotif = T01SL3_A14067InCfgNotif[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14067InCfgNotif", A14067InCfgNotif);
         A14068InCfgDisc = T01SL3_A14068InCfgDisc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14068InCfgDisc", A14068InCfgDisc);
         Z14062InCfgId = A14062InCfgId ;
         sMode1884 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1SL1884( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1884 = (short)(0) ;
            initializeNonKey1SL1884( ) ;
         }
         Gx_mode = sMode1884 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1884 = (short)(0) ;
         initializeNonKey1SL1884( ) ;
         sMode1884 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1884 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1SL1884( ) ;
      if ( RcdFound1884 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound1884 = (short)(0) ;
      /* Using cursor T01SL6 */
      pr_default.execute(4, new Object[] {Short.valueOf(A14062InCfgId)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         while ( (pr_default.getStatus(4) != 101) && ( ( T01SL6_A14062InCfgId[0] < A14062InCfgId ) ) )
         {
            pr_default.readNext(4);
         }
         if ( (pr_default.getStatus(4) != 101) && ( ( T01SL6_A14062InCfgId[0] > A14062InCfgId ) ) )
         {
            A14062InCfgId = T01SL6_A14062InCfgId[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A14062InCfgId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14062InCfgId), 4, 0));
            RcdFound1884 = (short)(1) ;
         }
      }
      pr_default.close(4);
   }

   public void move_previous( )
   {
      RcdFound1884 = (short)(0) ;
      /* Using cursor T01SL7 */
      pr_default.execute(5, new Object[] {Short.valueOf(A14062InCfgId)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( ( T01SL7_A14062InCfgId[0] > A14062InCfgId ) ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( ( T01SL7_A14062InCfgId[0] < A14062InCfgId ) ) )
         {
            A14062InCfgId = T01SL7_A14062InCfgId[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A14062InCfgId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14062InCfgId), 4, 0));
            RcdFound1884 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1SL1884( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtInCfgNombr_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1SL1884( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1884 == 1 )
         {
            if ( A14062InCfgId != Z14062InCfgId )
            {
               A14062InCfgId = Z14062InCfgId ;
               httpContext.ajax_rsp_assign_attri("", false, "A14062InCfgId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14062InCfgId), 4, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "INCFGID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtInCfgId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtInCfgNombr_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               update1SL1884( ) ;
               GX_FocusControl = edtInCfgNombr_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( A14062InCfgId != Z14062InCfgId )
            {
               /* Insert record */
               GX_FocusControl = edtInCfgNombr_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1SL1884( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "INCFGID");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtInCfgId_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  /* Insert record */
                  GX_FocusControl = edtInCfgNombr_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1SL1884( ) ;
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
      if ( A14062InCfgId != Z14062InCfgId )
      {
         A14062InCfgId = Z14062InCfgId ;
         httpContext.ajax_rsp_assign_attri("", false, "A14062InCfgId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14062InCfgId), 4, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "INCFGID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtInCfgId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtInCfgNombr_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency1SL1884( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01SL2 */
         pr_default.execute(0, new Object[] {Short.valueOf(A14062InCfgId)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPINCFG"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z14063InCfgNombr, T01SL2_A14063InCfgNombr[0]) != 0 ) || ( GXutil.strcmp(Z14064InCfgEmail, T01SL2_A14064InCfgEmail[0]) != 0 ) || ( Z14065InCfgSMS != T01SL2_A14065InCfgSMS[0] ) || ( Z14066InCfgWapp != T01SL2_A14066InCfgWapp[0] ) || ( Z14067InCfgNotif != T01SL2_A14067InCfgNotif[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z14068InCfgDisc != T01SL2_A14068InCfgDisc[0] ) )
         {
            if ( GXutil.strcmp(Z14063InCfgNombr, T01SL2_A14063InCfgNombr[0]) != 0 )
            {
               GXutil.writeLogln("ingenieria.incfg:[seudo value changed for attri]"+"InCfgNombr");
               GXutil.writeLogRaw("Old: ",Z14063InCfgNombr);
               GXutil.writeLogRaw("Current: ",T01SL2_A14063InCfgNombr[0]);
            }
            if ( GXutil.strcmp(Z14064InCfgEmail, T01SL2_A14064InCfgEmail[0]) != 0 )
            {
               GXutil.writeLogln("ingenieria.incfg:[seudo value changed for attri]"+"InCfgEmail");
               GXutil.writeLogRaw("Old: ",Z14064InCfgEmail);
               GXutil.writeLogRaw("Current: ",T01SL2_A14064InCfgEmail[0]);
            }
            if ( Z14065InCfgSMS != T01SL2_A14065InCfgSMS[0] )
            {
               GXutil.writeLogln("ingenieria.incfg:[seudo value changed for attri]"+"InCfgSMS");
               GXutil.writeLogRaw("Old: ",Z14065InCfgSMS);
               GXutil.writeLogRaw("Current: ",T01SL2_A14065InCfgSMS[0]);
            }
            if ( Z14066InCfgWapp != T01SL2_A14066InCfgWapp[0] )
            {
               GXutil.writeLogln("ingenieria.incfg:[seudo value changed for attri]"+"InCfgWapp");
               GXutil.writeLogRaw("Old: ",Z14066InCfgWapp);
               GXutil.writeLogRaw("Current: ",T01SL2_A14066InCfgWapp[0]);
            }
            if ( Z14067InCfgNotif != T01SL2_A14067InCfgNotif[0] )
            {
               GXutil.writeLogln("ingenieria.incfg:[seudo value changed for attri]"+"InCfgNotif");
               GXutil.writeLogRaw("Old: ",Z14067InCfgNotif);
               GXutil.writeLogRaw("Current: ",T01SL2_A14067InCfgNotif[0]);
            }
            if ( Z14068InCfgDisc != T01SL2_A14068InCfgDisc[0] )
            {
               GXutil.writeLogln("ingenieria.incfg:[seudo value changed for attri]"+"InCfgDisc");
               GXutil.writeLogRaw("Old: ",Z14068InCfgDisc);
               GXutil.writeLogRaw("Current: ",T01SL2_A14068InCfgDisc[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPINCFG"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1SL1884( )
   {
      beforeValidate1SL1884( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1SL1884( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1SL1884( 0) ;
         checkOptimisticConcurrency1SL1884( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1SL1884( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1SL1884( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01SL8 */
                  pr_default.execute(6, new Object[] {Short.valueOf(A14062InCfgId), A14063InCfgNombr, A14064InCfgEmail, Boolean.valueOf(A14065InCfgSMS), Boolean.valueOf(A14066InCfgWapp), Boolean.valueOf(A14067InCfgNotif), Boolean.valueOf(A14068InCfgDisc)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPINCFG");
                  if ( (pr_default.getStatus(6) == 1) )
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
                        resetCaption1SL0( ) ;
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
            load1SL1884( ) ;
         }
         endLevel1SL1884( ) ;
      }
      closeExtendedTableCursors1SL1884( ) ;
   }

   public void update1SL1884( )
   {
      beforeValidate1SL1884( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1SL1884( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1SL1884( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1SL1884( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1SL1884( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01SL9 */
                  pr_default.execute(7, new Object[] {A14063InCfgNombr, A14064InCfgEmail, Boolean.valueOf(A14065InCfgSMS), Boolean.valueOf(A14066InCfgWapp), Boolean.valueOf(A14067InCfgNotif), Boolean.valueOf(A14068InCfgDisc), Short.valueOf(A14062InCfgId)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPINCFG");
                  if ( (pr_default.getStatus(7) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPINCFG"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1SL1884( ) ;
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
         endLevel1SL1884( ) ;
      }
      closeExtendedTableCursors1SL1884( ) ;
   }

   public void deferredUpdate1SL1884( )
   {
   }

   public void delete( )
   {
      beforeValidate1SL1884( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1SL1884( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1SL1884( ) ;
         afterConfirm1SL1884( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1SL1884( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01SL10 */
               pr_default.execute(8, new Object[] {Short.valueOf(A14062InCfgId)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPINCFG");
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
      sMode1884 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1SL1884( ) ;
      Gx_mode = sMode1884 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1SL1884( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel1SL1884( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1SL1884( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "ingenieria.incfg");
         if ( AnyError == 0 )
         {
            confirmValues1SL0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "ingenieria.incfg");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1SL1884( )
   {
      /* Scan By routine */
      /* Using cursor T01SL11 */
      pr_default.execute(9);
      RcdFound1884 = (short)(0) ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound1884 = (short)(1) ;
         A14062InCfgId = T01SL11_A14062InCfgId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14062InCfgId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14062InCfgId), 4, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1SL1884( )
   {
      /* Scan next routine */
      pr_default.readNext(9);
      RcdFound1884 = (short)(0) ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound1884 = (short)(1) ;
         A14062InCfgId = T01SL11_A14062InCfgId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14062InCfgId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14062InCfgId), 4, 0));
      }
   }

   public void scanEnd1SL1884( )
   {
      pr_default.close(9);
   }

   public void afterConfirm1SL1884( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1SL1884( )
   {
      /* Before Insert Rules */
      GXt_int6 = A14062InCfgId ;
      GXv_int7[0] = GXt_int6 ;
      new app.ingenieria.incfg_proxid(remoteHandle, context).execute( GXv_int7) ;
      incfg_impl.this.GXt_int6 = GXv_int7[0] ;
      A14062InCfgId = GXt_int6 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14062InCfgId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14062InCfgId), 4, 0));
   }

   public void beforeUpdate1SL1884( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1SL1884( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1SL1884( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1SL1884( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1SL1884( )
   {
      edtInCfgNombr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtInCfgNombr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtInCfgNombr_Enabled), 5, 0), true);
      edtInCfgEmail_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtInCfgEmail_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtInCfgEmail_Enabled), 5, 0), true);
      chkInCfgSMS.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkInCfgSMS.getInternalname(), "Enabled", GXutil.ltrimstr( chkInCfgSMS.getEnabled(), 5, 0), true);
      chkInCfgWapp.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkInCfgWapp.getInternalname(), "Enabled", GXutil.ltrimstr( chkInCfgWapp.getEnabled(), 5, 0), true);
      chkInCfgNotif.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkInCfgNotif.getInternalname(), "Enabled", GXutil.ltrimstr( chkInCfgNotif.getEnabled(), 5, 0), true);
      chkInCfgDisc.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkInCfgDisc.getInternalname(), "Enabled", GXutil.ltrimstr( chkInCfgDisc.getEnabled(), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      edtInCfgId_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtInCfgId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtInCfgId_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1SL1884( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1SL0( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.ingenieria.incfg", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.ltrimstr(AV11InCfgId,4,0))}, new String[] {"Gx_mode","InCfgId"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"InCfg");
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("ingenieria\\incfg:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z14062InCfgId", GXutil.ltrim( localUtil.ntoc( Z14062InCfgId, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14063InCfgNombr", Z14063InCfgNombr);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14064InCfgEmail", Z14064InCfgEmail);
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "Z14065InCfgSMS", Z14065InCfgSMS);
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "Z14066InCfgWapp", Z14066InCfgWapp);
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "Z14067InCfgNotif", Z14067InCfgNotif);
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "Z14068InCfgDisc", Z14068InCfgDisc);
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTRNCONTEXT", AV9TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTRNCONTEXT", AV9TrnContext);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTRNCONTEXT", getSecureSignedToken( "", AV9TrnContext));
      app.GxWebStd.gx_hidden_field( httpContext, "vINCFGID", GXutil.ltrim( localUtil.ntoc( AV11InCfgId, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vINCFGID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV11InCfgId), "ZZZ9")));
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
      return formatLink("app.ingenieria.incfg", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.ltrimstr(AV11InCfgId,4,0))}, new String[] {"Gx_mode","InCfgId"})  ;
   }

   public String getPgmname( )
   {
      return "Ingenieria.InCfg" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Configuración", "") ;
   }

   public void initializeNonKey1SL1884( )
   {
      A14063InCfgNombr = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14063InCfgNombr", A14063InCfgNombr);
      A14064InCfgEmail = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14064InCfgEmail", A14064InCfgEmail);
      A14065InCfgSMS = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14065InCfgSMS", A14065InCfgSMS);
      A14066InCfgWapp = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14066InCfgWapp", A14066InCfgWapp);
      A14067InCfgNotif = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14067InCfgNotif", A14067InCfgNotif);
      A14068InCfgDisc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14068InCfgDisc", A14068InCfgDisc);
      Z14063InCfgNombr = "" ;
      Z14064InCfgEmail = "" ;
      Z14065InCfgSMS = false ;
      Z14066InCfgWapp = false ;
      Z14067InCfgNotif = false ;
      Z14068InCfgDisc = false ;
   }

   public void initAll1SL1884( )
   {
      A14062InCfgId = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A14062InCfgId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14062InCfgId), 4, 0));
      initializeNonKey1SL1884( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211693462", true, true);
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
      httpContext.AddJavascriptSource("ingenieria/incfg.js", "?20268211693462", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      edtInCfgNombr_Internalname = "INCFGNOMBR" ;
      edtInCfgEmail_Internalname = "INCFGEMAIL" ;
      chkInCfgSMS.setInternalname( "INCFGSMS" );
      chkInCfgWapp.setInternalname( "INCFGWAPP" );
      chkInCfgNotif.setInternalname( "INCFGNOTIF" );
      chkInCfgDisc.setInternalname( "INCFGDISC" );
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = "DVPANEL_UNNAMEDTABLE1" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      bttBtntrn_delete_Internalname = "BTNTRN_DELETE" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtInCfgId_Internalname = "INCFGID" ;
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
      Form.setCaption( httpContext.getMessage( "Configuración", "") );
      edtInCfgId_Jsonclick = "" ;
      edtInCfgId_Enabled = 1 ;
      edtInCfgId_Visible = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      bttBtntrn_delete_Enabled = 0 ;
      bttBtntrn_delete_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      chkInCfgDisc.setEnabled( 1 );
      chkInCfgNotif.setEnabled( 1 );
      Dvpanel_unnamedtable1_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Iconposition = "Right" ;
      Dvpanel_unnamedtable1_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsed = GXutil.toBoolean( 1) ;
      Dvpanel_unnamedtable1_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Title = httpContext.getMessage( "Suscripción a Notificaciones / Discusiones", "") ;
      Dvpanel_unnamedtable1_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable1_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Width = "100%" ;
      chkInCfgWapp.setEnabled( 1 );
      chkInCfgSMS.setEnabled( 1 );
      edtInCfgEmail_Enabled = 1 ;
      edtInCfgNombr_Jsonclick = "" ;
      edtInCfgNombr_Enabled = 1 ;
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

   public void gx1asaincfgid1SL1884( short AV11InCfgId )
   {
      if ( ! (0==AV11InCfgId) )
      {
         A14062InCfgId = AV11InCfgId ;
         httpContext.ajax_rsp_assign_attri("", false, "A14062InCfgId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14062InCfgId), 4, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A14062InCfgId, (byte)(4), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gx2asaincfgid1SL1884( String Gx_mode )
   {
      GXt_int6 = A14062InCfgId ;
      GXv_int7[0] = GXt_int6 ;
      new app.ingenieria.incfg_proxid(remoteHandle, context).execute( GXv_int7) ;
      incfg_impl.this.GXt_int6 = GXv_int7[0] ;
      A14062InCfgId = GXt_int6 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14062InCfgId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14062InCfgId), 4, 0));
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A14062InCfgId, (byte)(4), (byte)(0), ".", "")))+"\"") ;
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
      chkInCfgSMS.setName( "INCFGSMS" );
      chkInCfgSMS.setWebtags( "" );
      chkInCfgSMS.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkInCfgSMS.getInternalname(), "TitleCaption", chkInCfgSMS.getCaption(), true);
      chkInCfgSMS.setCheckedValue( "false" );
      A14065InCfgSMS = GXutil.strtobool( GXutil.booltostr( A14065InCfgSMS)) ;
      httpContext.ajax_rsp_assign_attri("", false, "A14065InCfgSMS", A14065InCfgSMS);
      chkInCfgWapp.setName( "INCFGWAPP" );
      chkInCfgWapp.setWebtags( "" );
      chkInCfgWapp.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkInCfgWapp.getInternalname(), "TitleCaption", chkInCfgWapp.getCaption(), true);
      chkInCfgWapp.setCheckedValue( "false" );
      A14066InCfgWapp = GXutil.strtobool( GXutil.booltostr( A14066InCfgWapp)) ;
      httpContext.ajax_rsp_assign_attri("", false, "A14066InCfgWapp", A14066InCfgWapp);
      chkInCfgNotif.setName( "INCFGNOTIF" );
      chkInCfgNotif.setWebtags( "" );
      chkInCfgNotif.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkInCfgNotif.getInternalname(), "TitleCaption", chkInCfgNotif.getCaption(), true);
      chkInCfgNotif.setCheckedValue( "false" );
      A14067InCfgNotif = GXutil.strtobool( GXutil.booltostr( A14067InCfgNotif)) ;
      httpContext.ajax_rsp_assign_attri("", false, "A14067InCfgNotif", A14067InCfgNotif);
      chkInCfgDisc.setName( "INCFGDISC" );
      chkInCfgDisc.setWebtags( "" );
      chkInCfgDisc.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkInCfgDisc.getInternalname(), "TitleCaption", chkInCfgDisc.getCaption(), true);
      chkInCfgDisc.setCheckedValue( "false" );
      A14068InCfgDisc = GXutil.strtobool( GXutil.booltostr( A14068InCfgDisc)) ;
      httpContext.ajax_rsp_assign_attri("", false, "A14068InCfgDisc", A14068InCfgDisc);
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV11InCfgId',fld:'vINCFGID',pic:'ZZZ9',hsh:true},{av:'A14065InCfgSMS',fld:'INCFGSMS',pic:''},{av:'A14066InCfgWapp',fld:'INCFGWAPP',pic:''},{av:'A14067InCfgNotif',fld:'INCFGNOTIF',pic:''},{av:'A14068InCfgDisc',fld:'INCFGDISC',pic:''}]");
      setEventMetadata("ENTER",",oparms:[{av:'A14065InCfgSMS',fld:'INCFGSMS',pic:''},{av:'A14066InCfgWapp',fld:'INCFGWAPP',pic:''},{av:'A14067InCfgNotif',fld:'INCFGNOTIF',pic:''},{av:'A14068InCfgDisc',fld:'INCFGDISC',pic:''}]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV9TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true},{av:'AV11InCfgId',fld:'vINCFGID',pic:'ZZZ9',hsh:true},{av:'A14065InCfgSMS',fld:'INCFGSMS',pic:''},{av:'A14066InCfgWapp',fld:'INCFGWAPP',pic:''},{av:'A14067InCfgNotif',fld:'INCFGNOTIF',pic:''},{av:'A14068InCfgDisc',fld:'INCFGDISC',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[{av:'A14065InCfgSMS',fld:'INCFGSMS',pic:''},{av:'A14066InCfgWapp',fld:'INCFGWAPP',pic:''},{av:'A14067InCfgNotif',fld:'INCFGNOTIF',pic:''},{av:'A14068InCfgDisc',fld:'INCFGDISC',pic:''}]}");
      setEventMetadata("AFTER TRN","{handler:'e121SL2',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV9TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true},{av:'A14065InCfgSMS',fld:'INCFGSMS',pic:''},{av:'A14066InCfgWapp',fld:'INCFGWAPP',pic:''},{av:'A14067InCfgNotif',fld:'INCFGNOTIF',pic:''},{av:'A14068InCfgDisc',fld:'INCFGDISC',pic:''}]");
      setEventMetadata("AFTER TRN",",oparms:[{av:'A14065InCfgSMS',fld:'INCFGSMS',pic:''},{av:'A14066InCfgWapp',fld:'INCFGWAPP',pic:''},{av:'A14067InCfgNotif',fld:'INCFGNOTIF',pic:''},{av:'A14068InCfgDisc',fld:'INCFGDISC',pic:''}]}");
      setEventMetadata("VALID_INCFGNOMBR","{handler:'valid_Incfgnombr',iparms:[{av:'A14065InCfgSMS',fld:'INCFGSMS',pic:''},{av:'A14066InCfgWapp',fld:'INCFGWAPP',pic:''},{av:'A14067InCfgNotif',fld:'INCFGNOTIF',pic:''},{av:'A14068InCfgDisc',fld:'INCFGDISC',pic:''}]");
      setEventMetadata("VALID_INCFGNOMBR",",oparms:[{av:'A14065InCfgSMS',fld:'INCFGSMS',pic:''},{av:'A14066InCfgWapp',fld:'INCFGWAPP',pic:''},{av:'A14067InCfgNotif',fld:'INCFGNOTIF',pic:''},{av:'A14068InCfgDisc',fld:'INCFGDISC',pic:''}]}");
      setEventMetadata("VALID_INCFGID","{handler:'valid_Incfgid',iparms:[{av:'A14065InCfgSMS',fld:'INCFGSMS',pic:''},{av:'A14066InCfgWapp',fld:'INCFGWAPP',pic:''},{av:'A14067InCfgNotif',fld:'INCFGNOTIF',pic:''},{av:'A14068InCfgDisc',fld:'INCFGDISC',pic:''}]");
      setEventMetadata("VALID_INCFGID",",oparms:[{av:'A14065InCfgSMS',fld:'INCFGSMS',pic:''},{av:'A14066InCfgWapp',fld:'INCFGWAPP',pic:''},{av:'A14067InCfgNotif',fld:'INCFGNOTIF',pic:''},{av:'A14068InCfgDisc',fld:'INCFGDISC',pic:''}]}");
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
      Z14063InCfgNombr = "" ;
      Z14064InCfgEmail = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      Gx_mode = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      A14063InCfgNombr = "" ;
      A14064InCfgEmail = "" ;
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      AV16Pgmname = "" ;
      Dvpanel_unnamedtable1_Objectcall = "" ;
      Dvpanel_unnamedtable1_Class = "" ;
      Dvpanel_unnamedtable1_Height = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode1884 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      AV12Station = "" ;
      GXt_char1 = "" ;
      AV13EmprCod = "" ;
      GXv_char2 = new String[1] ;
      AV14EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV15UsurCod = "" ;
      GXv_char4 = new String[1] ;
      AV8WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext5 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV9TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV10WebSession = httpContext.getWebSession();
      T01SL4_A14062InCfgId = new short[1] ;
      T01SL4_A14063InCfgNombr = new String[] {""} ;
      T01SL4_A14064InCfgEmail = new String[] {""} ;
      T01SL4_A14065InCfgSMS = new boolean[] {false} ;
      T01SL4_A14066InCfgWapp = new boolean[] {false} ;
      T01SL4_A14067InCfgNotif = new boolean[] {false} ;
      T01SL4_A14068InCfgDisc = new boolean[] {false} ;
      T01SL5_A14062InCfgId = new short[1] ;
      T01SL3_A14062InCfgId = new short[1] ;
      T01SL3_A14063InCfgNombr = new String[] {""} ;
      T01SL3_A14064InCfgEmail = new String[] {""} ;
      T01SL3_A14065InCfgSMS = new boolean[] {false} ;
      T01SL3_A14066InCfgWapp = new boolean[] {false} ;
      T01SL3_A14067InCfgNotif = new boolean[] {false} ;
      T01SL3_A14068InCfgDisc = new boolean[] {false} ;
      T01SL6_A14062InCfgId = new short[1] ;
      T01SL7_A14062InCfgId = new short[1] ;
      T01SL2_A14062InCfgId = new short[1] ;
      T01SL2_A14063InCfgNombr = new String[] {""} ;
      T01SL2_A14064InCfgEmail = new String[] {""} ;
      T01SL2_A14065InCfgSMS = new boolean[] {false} ;
      T01SL2_A14066InCfgWapp = new boolean[] {false} ;
      T01SL2_A14067InCfgNotif = new boolean[] {false} ;
      T01SL2_A14068InCfgDisc = new boolean[] {false} ;
      T01SL11_A14062InCfgId = new short[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXv_int7 = new short[1] ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.ingenieria.incfg__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.ingenieria.incfg__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.ingenieria.incfg__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.ingenieria.incfg__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ingenieria.incfg__default(),
         new Object[] {
             new Object[] {
            T01SL2_A14062InCfgId, T01SL2_A14063InCfgNombr, T01SL2_A14064InCfgEmail, T01SL2_A14065InCfgSMS, T01SL2_A14066InCfgWapp, T01SL2_A14067InCfgNotif, T01SL2_A14068InCfgDisc
            }
            , new Object[] {
            T01SL3_A14062InCfgId, T01SL3_A14063InCfgNombr, T01SL3_A14064InCfgEmail, T01SL3_A14065InCfgSMS, T01SL3_A14066InCfgWapp, T01SL3_A14067InCfgNotif, T01SL3_A14068InCfgDisc
            }
            , new Object[] {
            T01SL4_A14062InCfgId, T01SL4_A14063InCfgNombr, T01SL4_A14064InCfgEmail, T01SL4_A14065InCfgSMS, T01SL4_A14066InCfgWapp, T01SL4_A14067InCfgNotif, T01SL4_A14068InCfgDisc
            }
            , new Object[] {
            T01SL5_A14062InCfgId
            }
            , new Object[] {
            T01SL6_A14062InCfgId
            }
            , new Object[] {
            T01SL7_A14062InCfgId
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01SL11_A14062InCfgId
            }
         }
      );
      AV16Pgmname = "Ingenieria.InCfg" ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private short wcpOAV11InCfgId ;
   private short Z14062InCfgId ;
   private short AV11InCfgId ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A14062InCfgId ;
   private short RcdFound1884 ;
   private short nIsDirty_1884 ;
   private short GXt_int6 ;
   private short GXv_int7[] ;
   private int trnEnded ;
   private int edtInCfgNombr_Enabled ;
   private int edtInCfgEmail_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int edtavPgmname_Enabled ;
   private int edtInCfgId_Visible ;
   private int edtInCfgId_Enabled ;
   private int GX_JID ;
   private int idxLst ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String Gx_mode ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtInCfgNombr_Internalname ;
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
   private String TempTags ;
   private String edtInCfgNombr_Jsonclick ;
   private String edtInCfgEmail_Internalname ;
   private String Dvpanel_unnamedtable1_Width ;
   private String Dvpanel_unnamedtable1_Cls ;
   private String Dvpanel_unnamedtable1_Title ;
   private String Dvpanel_unnamedtable1_Iconposition ;
   private String Dvpanel_unnamedtable1_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String edtavPgmname_Internalname ;
   private String AV16Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String edtInCfgId_Internalname ;
   private String edtInCfgId_Jsonclick ;
   private String Dvpanel_unnamedtable1_Objectcall ;
   private String Dvpanel_unnamedtable1_Class ;
   private String Dvpanel_unnamedtable1_Height ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String hsh ;
   private String sMode1884 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String AV12Station ;
   private String GXt_char1 ;
   private String AV13EmprCod ;
   private String GXv_char2[] ;
   private String AV14EmprNom ;
   private String GXv_char3[] ;
   private String AV15UsurCod ;
   private String GXv_char4[] ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private boolean Z14065InCfgSMS ;
   private boolean Z14066InCfgWapp ;
   private boolean Z14067InCfgNotif ;
   private boolean Z14068InCfgDisc ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean A14065InCfgSMS ;
   private boolean A14066InCfgWapp ;
   private boolean A14067InCfgNotif ;
   private boolean A14068InCfgDisc ;
   private boolean Dvpanel_tableattributes_Autowidth ;
   private boolean Dvpanel_tableattributes_Autoheight ;
   private boolean Dvpanel_tableattributes_Collapsible ;
   private boolean Dvpanel_tableattributes_Collapsed ;
   private boolean Dvpanel_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_tableattributes_Autoscroll ;
   private boolean Dvpanel_unnamedtable1_Autowidth ;
   private boolean Dvpanel_unnamedtable1_Autoheight ;
   private boolean Dvpanel_unnamedtable1_Collapsible ;
   private boolean Dvpanel_unnamedtable1_Collapsed ;
   private boolean Dvpanel_unnamedtable1_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable1_Autoscroll ;
   private boolean Dvpanel_unnamedtable1_Enabled ;
   private boolean Dvpanel_unnamedtable1_Showheader ;
   private boolean Dvpanel_unnamedtable1_Visible ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private String Z14063InCfgNombr ;
   private String Z14064InCfgEmail ;
   private String A14063InCfgNombr ;
   private String A14064InCfgEmail ;
   private com.genexus.webpanels.WebSession AV10WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private ICheckbox chkInCfgSMS ;
   private ICheckbox chkInCfgWapp ;
   private ICheckbox chkInCfgNotif ;
   private ICheckbox chkInCfgDisc ;
   private IDataStoreProvider pr_default ;
   private short[] T01SL4_A14062InCfgId ;
   private String[] T01SL4_A14063InCfgNombr ;
   private String[] T01SL4_A14064InCfgEmail ;
   private boolean[] T01SL4_A14065InCfgSMS ;
   private boolean[] T01SL4_A14066InCfgWapp ;
   private boolean[] T01SL4_A14067InCfgNotif ;
   private boolean[] T01SL4_A14068InCfgDisc ;
   private short[] T01SL5_A14062InCfgId ;
   private short[] T01SL3_A14062InCfgId ;
   private String[] T01SL3_A14063InCfgNombr ;
   private String[] T01SL3_A14064InCfgEmail ;
   private boolean[] T01SL3_A14065InCfgSMS ;
   private boolean[] T01SL3_A14066InCfgWapp ;
   private boolean[] T01SL3_A14067InCfgNotif ;
   private boolean[] T01SL3_A14068InCfgDisc ;
   private short[] T01SL6_A14062InCfgId ;
   private short[] T01SL7_A14062InCfgId ;
   private short[] T01SL2_A14062InCfgId ;
   private String[] T01SL2_A14063InCfgNombr ;
   private String[] T01SL2_A14064InCfgEmail ;
   private boolean[] T01SL2_A14065InCfgSMS ;
   private boolean[] T01SL2_A14066InCfgWapp ;
   private boolean[] T01SL2_A14067InCfgNotif ;
   private boolean[] T01SL2_A14068InCfgDisc ;
   private short[] T01SL11_A14062InCfgId ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private app.wwpbaseobjects.SdtWWPContext AV8WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext5[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV9TrnContext ;
}

final  class incfg__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class incfg__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class incfg__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class incfg__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class incfg__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01SL2", "SELECT InCfgId, InCfgNombr, InCfgEmail, InCfgSMS, InCfgWapp, InCfgNotif, InCfgDisc FROM TXPINCFG WHERE InCfgId = ?  FOR UPDATE OF InCfgNombr, InCfgEmail, InCfgSMS, InCfgWapp, InCfgNotif, InCfgDisc NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SL3", "SELECT InCfgId, InCfgNombr, InCfgEmail, InCfgSMS, InCfgWapp, InCfgNotif, InCfgDisc FROM TXPINCFG WHERE InCfgId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SL4", "SELECT /*+ FIRST_ROWS(100) */ TM1.InCfgId, TM1.InCfgNombr, TM1.InCfgEmail, TM1.InCfgSMS, TM1.InCfgWapp, TM1.InCfgNotif, TM1.InCfgDisc FROM TXPINCFG TM1 WHERE TM1.InCfgId = ? ORDER BY TM1.InCfgId ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SL5", "SELECT /*+ FIRST_ROWS(1) */ InCfgId FROM TXPINCFG WHERE InCfgId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SL6", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ InCfgId FROM TXPINCFG WHERE ( InCfgId > ?) ORDER BY InCfgId) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01SL7", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ InCfgId FROM TXPINCFG WHERE ( InCfgId < ?) ORDER BY InCfgId DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01SL8", "INSERT INTO TXPINCFG(InCfgId, InCfgNombr, InCfgEmail, InCfgSMS, InCfgWapp, InCfgNotif, InCfgDisc) VALUES(?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPINCFG")
         ,new UpdateCursor("T01SL9", "UPDATE TXPINCFG SET InCfgNombr=?, InCfgEmail=?, InCfgSMS=?, InCfgWapp=?, InCfgNotif=?, InCfgDisc=?  WHERE InCfgId = ?", GX_NOMASK, "TXPINCFG")
         ,new UpdateCursor("T01SL10", "DELETE FROM TXPINCFG  WHERE InCfgId = ?", GX_NOMASK, "TXPINCFG")
         ,new ForEachCursor("T01SL11", "SELECT /*+ FIRST_ROWS(100) */ InCfgId FROM TXPINCFG ORDER BY InCfgId ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((boolean[]) buf[3])[0] = rslt.getBoolean(4);
               ((boolean[]) buf[4])[0] = rslt.getBoolean(5);
               ((boolean[]) buf[5])[0] = rslt.getBoolean(6);
               ((boolean[]) buf[6])[0] = rslt.getBoolean(7);
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((boolean[]) buf[3])[0] = rslt.getBoolean(4);
               ((boolean[]) buf[4])[0] = rslt.getBoolean(5);
               ((boolean[]) buf[5])[0] = rslt.getBoolean(6);
               ((boolean[]) buf[6])[0] = rslt.getBoolean(7);
               return;
            case 2 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((boolean[]) buf[3])[0] = rslt.getBoolean(4);
               ((boolean[]) buf[4])[0] = rslt.getBoolean(5);
               ((boolean[]) buf[5])[0] = rslt.getBoolean(6);
               ((boolean[]) buf[6])[0] = rslt.getBoolean(7);
               return;
            case 3 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               return;
            case 4 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               return;
            case 5 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               return;
            case 9 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
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
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
            case 1 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
            case 2 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
            case 3 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
            case 4 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
            case 5 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
            case 6 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setVarchar(2, (String)parms[1], 30, false);
               stmt.setVarchar(3, (String)parms[2], 1024, false);
               stmt.setBoolean(4, ((Boolean) parms[3]).booleanValue());
               stmt.setBoolean(5, ((Boolean) parms[4]).booleanValue());
               stmt.setBoolean(6, ((Boolean) parms[5]).booleanValue());
               stmt.setBoolean(7, ((Boolean) parms[6]).booleanValue());
               return;
            case 7 :
               stmt.setVarchar(1, (String)parms[0], 30, false);
               stmt.setVarchar(2, (String)parms[1], 1024, false);
               stmt.setBoolean(3, ((Boolean) parms[2]).booleanValue());
               stmt.setBoolean(4, ((Boolean) parms[3]).booleanValue());
               stmt.setBoolean(5, ((Boolean) parms[4]).booleanValue());
               stmt.setBoolean(6, ((Boolean) parms[5]).booleanValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 8 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
      }
   }

}

