package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tempres_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action16") == 0 )
      {
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_16_0Y27( ) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_18") == 0 )
      {
         A953IvaCod = httpContext.GetPar( "IvaCod") ;
         n953IvaCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A953IvaCod", A953IvaCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_18( A953IvaCod) ;
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
            AV35EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35EmprCod", AV35EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV35EmprCod, "@!"))));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "EMPRESAS", ""), (short)(0)) ;
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

   public tempres_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tempres_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tempres_impl.class ));
   }

   public tempres_impl( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      chkColombia = UIFactory.getCheckbox(this);
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
      A7209Colombia = (byte)(((GXutil.strcmp(GXutil.ltrim( localUtil.ntoc( A7209Colombia, (byte)(1), (byte)(0), ".", "")), "1")==0) ? 1 : 0)) ;
      n7209Colombia = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7209Colombia", GXutil.str( A7209Colombia, 1, 0));
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
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable4_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "flex-wrap:wrap;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell", "left", "top", "", "flex-grow:1;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtEmprCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtEmprCod_Internalname, httpContext.getMessage( "Codigo", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 24,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,24);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtEmprCod_Enabled, 1, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TEMPRES.htm");
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
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable5_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "flex-wrap:wrap;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell", "left", "top", "", "flex-grow:1;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtEmprNom_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtEmprNom_Internalname, httpContext.getMessage( "Nombre", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,31);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TEMPRES.htm");
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
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable6_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "flex-wrap:wrap;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell", "left", "top", "", "flex-grow:1;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtEmprDir_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtEmprDir_Internalname, httpContext.getMessage( "Dirección", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 38,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprDir_Internalname, GXutil.rtrim( A404EmprDir), GXutil.rtrim( localUtil.format( A404EmprDir, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,38);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprDir_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtEmprDir_Enabled, 0, "text", "", 35, "chr", 1, "row", 35, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TEMPRES.htm");
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
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable7_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "flex-wrap:wrap;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell", "left", "top", "", "flex-grow:1;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtEmprCpo_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtEmprCpo_Internalname, httpContext.getMessage( "Código Postal", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 45,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCpo_Internalname, GXutil.rtrim( A403EmprCpo), GXutil.rtrim( localUtil.format( A403EmprCpo, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,45);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCpo_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtEmprCpo_Enabled, 0, "text", "", 7, "chr", 1, "row", 7, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TEMPRES.htm");
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
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable8_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "flex-wrap:wrap;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell", "left", "top", "", "flex-grow:1;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtEmprPob_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtEmprPob_Internalname, httpContext.getMessage( "Población", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 52,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprPob_Internalname, GXutil.rtrim( A408EmprPob), GXutil.rtrim( localUtil.format( A408EmprPob, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,52);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprPob_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtEmprPob_Enabled, 0, "text", "", 35, "chr", 1, "row", 35, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TEMPRES.htm");
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
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable9_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "flex-wrap:wrap;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell", "left", "top", "", "flex-grow:1;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtEmprCif_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtEmprCif_Internalname, httpContext.getMessage( "CIF", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCif_Internalname, GXutil.rtrim( A395EmprCif), GXutil.rtrim( localUtil.format( A395EmprCif, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,59);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCif_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtEmprCif_Enabled, 0, "text", "", 15, "chr", 1, "row", 15, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TEMPRES.htm");
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
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable10_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "flex-wrap:wrap;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell", "left", "top", "", "flex-grow:1;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtEmprTel_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtEmprTel_Internalname, httpContext.getMessage( "Teléfono", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprTel_Internalname, GXutil.rtrim( A409EmprTel), GXutil.rtrim( localUtil.format( A409EmprTel, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprTel_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtEmprTel_Enabled, 0, "text", "", 15, "chr", 1, "row", 15, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TEMPRES.htm");
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
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable11_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "flex-wrap:wrap;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell", "left", "top", "", "flex-grow:1;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtEmprFax_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtEmprFax_Internalname, httpContext.getMessage( "Fax", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 73,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprFax_Internalname, GXutil.rtrim( A405EmprFax), GXutil.rtrim( localUtil.format( A405EmprFax, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,73);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprFax_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtEmprFax_Enabled, 0, "text", "", 15, "chr", 1, "row", 15, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TEMPRES.htm");
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
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable12_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell", "left", "top", "", "flex-grow:1;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtEmpNumDec_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtEmpNumDec_Internalname, httpContext.getMessage( "Decimales", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 80,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmpNumDec_Internalname, GXutil.ltrim( localUtil.ntoc( A3915EmpNumDec, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEmpNumDec_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3915EmpNumDec), "9") : localUtil.format( DecimalUtil.doubleToDec(A3915EmpNumDec), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,80);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmpNumDec_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtEmpNumDec_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TEMPRES.htm");
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
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable13_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtIvaCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtIvaCod_Internalname, httpContext.getMessage( "Codigo IVA", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 88,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtIvaCod_Internalname, GXutil.rtrim( A953IvaCod), GXutil.rtrim( localUtil.format( A953IvaCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,88);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtIvaCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtIvaCod_Enabled, 1, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TEMPRES.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtIvaDsc_Internalname+"\"", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtIvaDsc_Internalname, GXutil.rtrim( A954IvaDsc), GXutil.rtrim( localUtil.format( A954IvaDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtIvaDsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtIvaDsc_Enabled, 0, "text", "", 25, "chr", 1, "row", 25, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TEMPRES.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtIvaPor_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtIvaPor_Internalname, httpContext.getMessage( "Porcent", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtIvaPor_Internalname, GXutil.ltrim( localUtil.ntoc( A588IvaPor, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtIvaPor_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A588IvaPor), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A588IvaPor), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtIvaPor_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtIvaPor_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TEMPRES.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtIvaRec_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtIvaRec_Internalname, httpContext.getMessage( "Recargo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtIvaRec_Internalname, GXutil.ltrim( localUtil.ntoc( A589IvaRec, (byte)(7), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtIvaRec_Enabled!=0) ? localUtil.format( A589IvaRec, "ZZ9.999") : localUtil.format( A589IvaRec, "ZZ9.999"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtIvaRec_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtIvaRec_Enabled, 0, "text", "", 7, "chr", 1, "row", 7, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TEMPRES.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtRefugio_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtRefugio_Internalname, httpContext.getMessage( "Refugio?", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtRefugio_Internalname, GXutil.ltrim( localUtil.ntoc( A5468Refugio, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRefugio_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5468Refugio), "9") : localUtil.format( DecimalUtil.doubleToDec(A5468Refugio), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRefugio_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtRefugio_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TEMPRES.htm");
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
      /* Table start */
      sStyleString = "" ;
      app.GxWebStd.gx_table_start( httpContext, tblUnnamedtable1_Internalname, tblUnnamedtable1_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* User Defined Control */
      ucGxuitabspanel_tabs.setProperty("PageCount", Gxuitabspanel_tabs_Pagecount);
      ucGxuitabspanel_tabs.setProperty("Class", Gxuitabspanel_tabs_Class);
      ucGxuitabspanel_tabs.setProperty("HistoryManagement", Gxuitabspanel_tabs_Historymanagement);
      ucGxuitabspanel_tabs.render(context, "tab", Gxuitabspanel_tabs_Internalname, "GXUITABSPANEL_TABSContainer");
      httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"GXUITABSPANEL_TABSContainer"+"title1"+"\" style=\"display:none;\">") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTabs1_title_Internalname, httpContext.getMessage( "Empresas Contabilidad", ""), "", "", lblTabs1_title_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TEMPRES.htm");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", "", "display:none;", "div");
      httpContext.writeText( "Tabs1") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      httpContext.writeText( "</div>") ;
      httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"GXUITABSPANEL_TABSContainer"+"panel1"+"\" style=\"display:none;\">") ;
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtEmp1_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtEmp1_Internalname, httpContext.getMessage( "Empresa A", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 123,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmp1_Internalname, GXutil.rtrim( A961Emp1), GXutil.rtrim( localUtil.format( A961Emp1, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,123);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmp1_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtEmp1_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TEMPRES.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtEmp0_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtEmp0_Internalname, httpContext.getMessage( "Empresa B", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 127,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmp0_Internalname, GXutil.rtrim( A962Emp0), GXutil.rtrim( localUtil.format( A962Emp0, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,127);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmp0_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtEmp0_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TEMPRES.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtSer1_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtSer1_Internalname, httpContext.getMessage( "Serie Factura Venta", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 132,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSer1_Internalname, GXutil.rtrim( A963Ser1), GXutil.rtrim( localUtil.format( A963Ser1, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,132);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSer1_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtSer1_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TEMPRES.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtSer0_Internalname+"\"", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 136,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSer0_Internalname, GXutil.rtrim( A964Ser0), GXutil.rtrim( localUtil.format( A964Ser0, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,136);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSer0_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtSer0_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TEMPRES.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtSer2_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtSer2_Internalname, httpContext.getMessage( "Serie Factura Rectif", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 141,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSer2_Internalname, GXutil.rtrim( A2387Ser2), GXutil.rtrim( localUtil.format( A2387Ser2, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,141);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSer2_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtSer2_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TEMPRES.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtSer20_Internalname+"\"", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 145,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSer20_Internalname, GXutil.rtrim( A2388Ser20), GXutil.rtrim( localUtil.format( A2388Ser20, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,145);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSer20_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtSer20_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TEMPRES.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtSer3_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtSer3_Internalname, httpContext.getMessage( "Serie Factura Auxil", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 150,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSer3_Internalname, GXutil.rtrim( A2389Ser3), GXutil.rtrim( localUtil.format( A2389Ser3, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,150);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSer3_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtSer3_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TEMPRES.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtSer30_Internalname+"\"", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 154,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSer30_Internalname, GXutil.rtrim( A2390Ser30), GXutil.rtrim( localUtil.format( A2390Ser30, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,154);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSer30_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtSer30_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TEMPRES.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      httpContext.writeText( "</div>") ;
      httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"GXUITABSPANEL_TABSContainer"+"title2"+"\" style=\"display:none;\">") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTabs2_title_Internalname, httpContext.getMessage( "Otros Parametros", ""), "", "", lblTabs2_title_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TEMPRES.htm");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", "", "display:none;", "div");
      httpContext.writeText( "Tabs2") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      httpContext.writeText( "</div>") ;
      httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"GXUITABSPANEL_TABSContainer"+"panel2"+"\" style=\"display:none;\">") ;
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtEmpItm1_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtEmpItm1_Internalname, httpContext.getMessage( "Item 1", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 164,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmpItm1_Internalname, GXutil.rtrim( A8334EmpItm1), GXutil.rtrim( localUtil.format( A8334EmpItm1, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,164);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmpItm1_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtEmpItm1_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TEMPRES.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtEmpItm2_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtEmpItm2_Internalname, httpContext.getMessage( "Item 2", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 169,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmpItm2_Internalname, GXutil.rtrim( A8335EmpItm2), GXutil.rtrim( localUtil.format( A8335EmpItm2, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,169);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmpItm2_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtEmpItm2_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TEMPRES.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtEmpItm3_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtEmpItm3_Internalname, httpContext.getMessage( "Item 3", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 174,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmpItm3_Internalname, GXutil.rtrim( A8336EmpItm3), GXutil.rtrim( localUtil.format( A8336EmpItm3, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,174);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmpItm3_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtEmpItm3_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TEMPRES.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtEmpItm4_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtEmpItm4_Internalname, httpContext.getMessage( "Item 4", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 179,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmpItm4_Internalname, GXutil.rtrim( A8337EmpItm4), GXutil.rtrim( localUtil.format( A8337EmpItm4, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,179);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmpItm4_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtEmpItm4_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TEMPRES.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtEmpItm5_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtEmpItm5_Internalname, httpContext.getMessage( "Item 5", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 184,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmpItm5_Internalname, GXutil.rtrim( A8338EmpItm5), GXutil.rtrim( localUtil.format( A8338EmpItm5, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,184);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmpItm5_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtEmpItm5_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TEMPRES.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtEmpItm6_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtEmpItm6_Internalname, httpContext.getMessage( "Item 6", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 189,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmpItm6_Internalname, GXutil.rtrim( A11516EmpItm6), GXutil.rtrim( localUtil.format( A11516EmpItm6, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,189);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmpItm6_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtEmpItm6_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TEMPRES.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtEmpItm7_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtEmpItm7_Internalname, httpContext.getMessage( "Item 7", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 194,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmpItm7_Internalname, GXutil.rtrim( A12702EmpItm7), GXutil.rtrim( localUtil.format( A12702EmpItm7, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,194);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmpItm7_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtEmpItm7_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TEMPRES.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkColombia.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, chkColombia.getInternalname(), httpContext.getMessage( "Colombia", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Check box */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 199,'',false,'',0)\"" ;
      ClassString = "AttributeFL" ;
      StyleString = "" ;
      app.GxWebStd.gx_checkbox_ctrl( httpContext, chkColombia.getInternalname(), GXutil.str( A7209Colombia, 1, 0), "", httpContext.getMessage( "Colombia", ""), 1, chkColombia.getEnabled(), "1", "", StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(199, this, 1, 0,"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,199);\"");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      httpContext.writeText( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      /* End of table */
      httpContext.writeText( "</table>") ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 204,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TEMPRES.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 206,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TEMPRES.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 208,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TEMPRES.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      drawcontrols1( ) ;
   }

   public void drawcontrols1( )
   {
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop10 CellMarginBottom10", "Right", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtavPgmname_Internalname, httpContext.getMessage( "pgmname", ""), "col-sm-3 AttributeLabel", 0, true, "");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV51Pgmname), GXutil.rtrim( localUtil.format( AV51Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TEMPRES.htm");
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
      e110Y2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z407EmprNom = httpContext.cgiGet( "Z407EmprNom") ;
            Z404EmprDir = httpContext.cgiGet( "Z404EmprDir") ;
            Z403EmprCpo = httpContext.cgiGet( "Z403EmprCpo") ;
            Z408EmprPob = httpContext.cgiGet( "Z408EmprPob") ;
            Z395EmprCif = httpContext.cgiGet( "Z395EmprCif") ;
            Z409EmprTel = httpContext.cgiGet( "Z409EmprTel") ;
            Z405EmprFax = httpContext.cgiGet( "Z405EmprFax") ;
            Z961Emp1 = httpContext.cgiGet( "Z961Emp1") ;
            Z962Emp0 = httpContext.cgiGet( "Z962Emp0") ;
            Z963Ser1 = httpContext.cgiGet( "Z963Ser1") ;
            Z964Ser0 = httpContext.cgiGet( "Z964Ser0") ;
            Z2387Ser2 = httpContext.cgiGet( "Z2387Ser2") ;
            Z2388Ser20 = httpContext.cgiGet( "Z2388Ser20") ;
            Z2389Ser3 = httpContext.cgiGet( "Z2389Ser3") ;
            Z2390Ser30 = httpContext.cgiGet( "Z2390Ser30") ;
            Z3915EmpNumDec = (byte)(localUtil.ctol( httpContext.cgiGet( "Z3915EmpNumDec"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z7209Colombia = (byte)(localUtil.ctol( httpContext.cgiGet( "Z7209Colombia"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z8334EmpItm1 = httpContext.cgiGet( "Z8334EmpItm1") ;
            Z8335EmpItm2 = httpContext.cgiGet( "Z8335EmpItm2") ;
            Z8336EmpItm3 = httpContext.cgiGet( "Z8336EmpItm3") ;
            Z8337EmpItm4 = httpContext.cgiGet( "Z8337EmpItm4") ;
            Z8338EmpItm5 = httpContext.cgiGet( "Z8338EmpItm5") ;
            Z11516EmpItm6 = httpContext.cgiGet( "Z11516EmpItm6") ;
            Z12702EmpItm7 = httpContext.cgiGet( "Z12702EmpItm7") ;
            Z14826EmpKey = httpContext.cgiGet( "Z14826EmpKey") ;
            Z14827EmpToken = httpContext.cgiGet( "Z14827EmpToken") ;
            Z14828EmpEnv = httpContext.cgiGet( "Z14828EmpEnv") ;
            Z14829EmpProd = httpContext.cgiGet( "Z14829EmpProd") ;
            Z953IvaCod = httpContext.cgiGet( "Z953IvaCod") ;
            A14826EmpKey = httpContext.cgiGet( "Z14826EmpKey") ;
            n14826EmpKey = false ;
            A14827EmpToken = httpContext.cgiGet( "Z14827EmpToken") ;
            n14827EmpToken = false ;
            A14828EmpEnv = httpContext.cgiGet( "Z14828EmpEnv") ;
            n14828EmpEnv = false ;
            A14829EmpProd = httpContext.cgiGet( "Z14829EmpProd") ;
            n14829EmpProd = false ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            N953IvaCod = httpContext.cgiGet( "N953IvaCod") ;
            AV35EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            AV43Insert_IvaCod = httpContext.cgiGet( "vINSERT_IVACOD") ;
            A14826EmpKey = httpContext.cgiGet( "EMPKEY") ;
            A14827EmpToken = httpContext.cgiGet( "EMPTOKEN") ;
            A14828EmpEnv = httpContext.cgiGet( "EMPENV") ;
            A14829EmpProd = httpContext.cgiGet( "EMPPROD") ;
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
            Dvpanel_tableattributes_Gxcontroltype = (int)(localUtil.ctol( httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Gxcontroltype"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gxuitabspanel_tabs_Objectcall = httpContext.cgiGet( "GXUITABSPANEL_TABS_Objectcall") ;
            Gxuitabspanel_tabs_Enabled = GXutil.strtobool( httpContext.cgiGet( "GXUITABSPANEL_TABS_Enabled")) ;
            Gxuitabspanel_tabs_Activepage = (int)(localUtil.ctol( httpContext.cgiGet( "GXUITABSPANEL_TABS_Activepage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gxuitabspanel_tabs_Activepagecontrolname = httpContext.cgiGet( "GXUITABSPANEL_TABS_Activepagecontrolname") ;
            Gxuitabspanel_tabs_Pagecount = (int)(localUtil.ctol( httpContext.cgiGet( "GXUITABSPANEL_TABS_Pagecount"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gxuitabspanel_tabs_Class = httpContext.cgiGet( "GXUITABSPANEL_TABS_Class") ;
            Gxuitabspanel_tabs_Historymanagement = GXutil.strtobool( httpContext.cgiGet( "GXUITABSPANEL_TABS_Historymanagement")) ;
            Gxuitabspanel_tabs_Visible = GXutil.strtobool( httpContext.cgiGet( "GXUITABSPANEL_TABS_Visible")) ;
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
            Dvpanel_unnamedtable1_Gxcontroltype = (int)(localUtil.ctol( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Gxcontroltype"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Datamonjs_Objectcall = httpContext.cgiGet( "DATAMONJS_Objectcall") ;
            Datamonjs_Class = httpContext.cgiGet( "DATAMONJS_Class") ;
            Datamonjs_Enabled = GXutil.strtobool( httpContext.cgiGet( "DATAMONJS_Enabled")) ;
            Datamonjs_Paramstr = httpContext.cgiGet( "DATAMONJS_Paramstr") ;
            Datamonjs_Visible = GXutil.strtobool( httpContext.cgiGet( "DATAMONJS_Visible")) ;
            Datamonjs_Gxcontroltype = (int)(localUtil.ctol( httpContext.cgiGet( "DATAMONJS_Gxcontroltype"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            A404EmprDir = httpContext.cgiGet( edtEmprDir_Internalname) ;
            n404EmprDir = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A404EmprDir", A404EmprDir);
            A403EmprCpo = httpContext.cgiGet( edtEmprCpo_Internalname) ;
            n403EmprCpo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A403EmprCpo", A403EmprCpo);
            A408EmprPob = httpContext.cgiGet( edtEmprPob_Internalname) ;
            n408EmprPob = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A408EmprPob", A408EmprPob);
            A395EmprCif = httpContext.cgiGet( edtEmprCif_Internalname) ;
            n395EmprCif = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A395EmprCif", A395EmprCif);
            A409EmprTel = httpContext.cgiGet( edtEmprTel_Internalname) ;
            n409EmprTel = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A409EmprTel", A409EmprTel);
            A405EmprFax = httpContext.cgiGet( edtEmprFax_Internalname) ;
            n405EmprFax = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A405EmprFax", A405EmprFax);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtEmpNumDec_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtEmpNumDec_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "EMPNUMDEC");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmpNumDec_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A3915EmpNumDec = (byte)(0) ;
               n3915EmpNumDec = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3915EmpNumDec", GXutil.str( A3915EmpNumDec, 1, 0));
            }
            else
            {
               A3915EmpNumDec = (byte)(localUtil.ctol( httpContext.cgiGet( edtEmpNumDec_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n3915EmpNumDec = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3915EmpNumDec", GXutil.str( A3915EmpNumDec, 1, 0));
            }
            A953IvaCod = GXutil.upper( httpContext.cgiGet( edtIvaCod_Internalname)) ;
            n953IvaCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A953IvaCod", A953IvaCod);
            A954IvaDsc = httpContext.cgiGet( edtIvaDsc_Internalname) ;
            n954IvaDsc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A954IvaDsc", A954IvaDsc);
            A588IvaPor = (byte)(localUtil.ctol( httpContext.cgiGet( edtIvaPor_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n588IvaPor = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A588IvaPor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A588IvaPor), 2, 0));
            A589IvaRec = localUtil.ctond( httpContext.cgiGet( edtIvaRec_Internalname)) ;
            n589IvaRec = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A589IvaRec", GXutil.ltrimstr( A589IvaRec, 7, 3));
            A5468Refugio = (byte)(localUtil.ctol( httpContext.cgiGet( edtRefugio_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5468Refugio", GXutil.str( A5468Refugio, 1, 0));
            A961Emp1 = httpContext.cgiGet( edtEmp1_Internalname) ;
            n961Emp1 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A961Emp1", A961Emp1);
            A962Emp0 = httpContext.cgiGet( edtEmp0_Internalname) ;
            n962Emp0 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A962Emp0", A962Emp0);
            A963Ser1 = httpContext.cgiGet( edtSer1_Internalname) ;
            n963Ser1 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A963Ser1", A963Ser1);
            A964Ser0 = httpContext.cgiGet( edtSer0_Internalname) ;
            n964Ser0 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A964Ser0", A964Ser0);
            A2387Ser2 = httpContext.cgiGet( edtSer2_Internalname) ;
            n2387Ser2 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A2387Ser2", A2387Ser2);
            A2388Ser20 = httpContext.cgiGet( edtSer20_Internalname) ;
            n2388Ser20 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A2388Ser20", A2388Ser20);
            A2389Ser3 = httpContext.cgiGet( edtSer3_Internalname) ;
            n2389Ser3 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A2389Ser3", A2389Ser3);
            A2390Ser30 = httpContext.cgiGet( edtSer30_Internalname) ;
            n2390Ser30 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A2390Ser30", A2390Ser30);
            A8334EmpItm1 = httpContext.cgiGet( edtEmpItm1_Internalname) ;
            n8334EmpItm1 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8334EmpItm1", A8334EmpItm1);
            A8335EmpItm2 = httpContext.cgiGet( edtEmpItm2_Internalname) ;
            n8335EmpItm2 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8335EmpItm2", A8335EmpItm2);
            A8336EmpItm3 = httpContext.cgiGet( edtEmpItm3_Internalname) ;
            n8336EmpItm3 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8336EmpItm3", A8336EmpItm3);
            A8337EmpItm4 = httpContext.cgiGet( edtEmpItm4_Internalname) ;
            n8337EmpItm4 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8337EmpItm4", A8337EmpItm4);
            A8338EmpItm5 = httpContext.cgiGet( edtEmpItm5_Internalname) ;
            n8338EmpItm5 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8338EmpItm5", A8338EmpItm5);
            A11516EmpItm6 = httpContext.cgiGet( edtEmpItm6_Internalname) ;
            n11516EmpItm6 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11516EmpItm6", A11516EmpItm6);
            A12702EmpItm7 = httpContext.cgiGet( edtEmpItm7_Internalname) ;
            n12702EmpItm7 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12702EmpItm7", A12702EmpItm7);
            if ( ( ( ((GXutil.strcmp(httpContext.cgiGet( chkColombia.getInternalname()), "1")==0) ? 1 : 0) < 0 ) ) || ( ( ((GXutil.strcmp(httpContext.cgiGet( chkColombia.getInternalname()), "1")==0) ? 1 : 0) > 9 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "COLOMBIA");
               AnyError = (short)(1) ;
               GX_FocusControl = chkColombia.getInternalname() ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A7209Colombia = (byte)(0) ;
               n7209Colombia = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A7209Colombia", GXutil.str( A7209Colombia, 1, 0));
            }
            else
            {
               A7209Colombia = (byte)(((GXutil.strcmp(httpContext.cgiGet( chkColombia.getInternalname()), "1")==0) ? 1 : 0)) ;
               n7209Colombia = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A7209Colombia", GXutil.str( A7209Colombia, 1, 0));
            }
            AV51Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV51Pgmname", AV51Pgmname);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"TEMPRES");
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            AV51Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV51Pgmname", AV51Pgmname);
            forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV51Pgmname, "")));
            forbiddenHiddens.add("EmpKey", GXutil.rtrim( localUtil.format( A14826EmpKey, "")));
            forbiddenHiddens.add("EmpToken", GXutil.rtrim( localUtil.format( A14827EmpToken, "")));
            forbiddenHiddens.add("EmpEnv", GXutil.rtrim( localUtil.format( A14828EmpEnv, "")));
            forbiddenHiddens.add("EmpProd", GXutil.rtrim( localUtil.format( A14829EmpProd, "")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("tempres:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
                  sMode27 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  Gx_mode = sMode27 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound27 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_0Y0( ) ;
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
                        e110Y2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e120Y2 ();
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
         e120Y2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll0Y27( ) ;
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
         disableAttributes0Y27( ) ;
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

   public void confirm_0Y0( )
   {
      beforeValidate0Y27( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls0Y27( ) ;
         }
         else
         {
            checkExtendedTable0Y27( ) ;
            closeExtendedTableCursors0Y27( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
   }

   public void resetCaption0Y0( )
   {
   }

   public void e110Y2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV37Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      tempres_impl.this.GXt_char1 = GXv_char2[0] ;
      AV37Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37Station", AV37Station);
      GXv_char2[0] = AV35EmprCod ;
      GXv_char3[0] = AV36EmprNom ;
      GXv_char4[0] = AV29UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV37Station, GXv_char2, GXv_char3, GXv_char4) ;
      tempres_impl.this.AV35EmprCod = GXv_char2[0] ;
      tempres_impl.this.AV36EmprNom = GXv_char3[0] ;
      tempres_impl.this.AV29UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35EmprCod", AV35EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV35EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV36EmprNom", AV36EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV29UsurCod", AV29UsurCod);
      GXt_char1 = AV37Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      tempres_impl.this.GXt_char1 = GXv_char4[0] ;
      AV37Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37Station", AV37Station);
      GXv_char4[0] = AV35EmprCod ;
      GXv_char3[0] = AV36EmprNom ;
      GXv_char2[0] = AV29UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV37Station, GXv_char4, GXv_char3, GXv_char2) ;
      tempres_impl.this.AV35EmprCod = GXv_char4[0] ;
      tempres_impl.this.AV36EmprNom = GXv_char3[0] ;
      tempres_impl.this.AV29UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35EmprCod", AV35EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV35EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV36EmprNom", AV36EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV29UsurCod", AV29UsurCod);
      GXv_SdtWWPContext5[0] = AV40WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext5) ;
      AV40WWPContext = GXv_SdtWWPContext5[0] ;
      AV41TrnContext.fromxml(AV42WebSession.getValue("TrnContext"), null, null);
      if ( ( GXutil.strcmp(AV41TrnContext.getgxTv_SdtWWPTransactionContext_Transactionname(), AV51Pgmname) == 0 ) && ( GXutil.strcmp(Gx_mode, "INS") == 0 ) )
      {
         AV52GXV1 = 1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV52GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52GXV1), 8, 0));
         while ( AV52GXV1 <= AV41TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().size() )
         {
            AV44TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)((app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)AV41TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().elementAt(-1+AV52GXV1));
            if ( GXutil.strcmp(AV44TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "IvaCod") == 0 )
            {
               AV43Insert_IvaCod = AV44TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue() ;
               httpContext.ajax_rsp_assign_attri("", false, "AV43Insert_IvaCod", AV43Insert_IvaCod);
            }
            AV52GXV1 = (int)(AV52GXV1+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV52GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52GXV1), 8, 0));
         }
      }
   }

   public void e120Y2( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV41TrnContext.getgxTv_SdtWWPTransactionContext_Callerondelete() )
      {
         callWebObject(formatLink("app.tempresww", new String[] {}, new String[] {}) );
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

   public void zm0Y27( int GX_JID )
   {
      if ( ( GX_JID == 17 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z407EmprNom = T000Y3_A407EmprNom[0] ;
            Z404EmprDir = T000Y3_A404EmprDir[0] ;
            Z403EmprCpo = T000Y3_A403EmprCpo[0] ;
            Z408EmprPob = T000Y3_A408EmprPob[0] ;
            Z395EmprCif = T000Y3_A395EmprCif[0] ;
            Z409EmprTel = T000Y3_A409EmprTel[0] ;
            Z405EmprFax = T000Y3_A405EmprFax[0] ;
            Z961Emp1 = T000Y3_A961Emp1[0] ;
            Z962Emp0 = T000Y3_A962Emp0[0] ;
            Z963Ser1 = T000Y3_A963Ser1[0] ;
            Z964Ser0 = T000Y3_A964Ser0[0] ;
            Z2387Ser2 = T000Y3_A2387Ser2[0] ;
            Z2388Ser20 = T000Y3_A2388Ser20[0] ;
            Z2389Ser3 = T000Y3_A2389Ser3[0] ;
            Z2390Ser30 = T000Y3_A2390Ser30[0] ;
            Z3915EmpNumDec = T000Y3_A3915EmpNumDec[0] ;
            Z7209Colombia = T000Y3_A7209Colombia[0] ;
            Z8334EmpItm1 = T000Y3_A8334EmpItm1[0] ;
            Z8335EmpItm2 = T000Y3_A8335EmpItm2[0] ;
            Z8336EmpItm3 = T000Y3_A8336EmpItm3[0] ;
            Z8337EmpItm4 = T000Y3_A8337EmpItm4[0] ;
            Z8338EmpItm5 = T000Y3_A8338EmpItm5[0] ;
            Z11516EmpItm6 = T000Y3_A11516EmpItm6[0] ;
            Z12702EmpItm7 = T000Y3_A12702EmpItm7[0] ;
            Z14826EmpKey = T000Y3_A14826EmpKey[0] ;
            Z14827EmpToken = T000Y3_A14827EmpToken[0] ;
            Z14828EmpEnv = T000Y3_A14828EmpEnv[0] ;
            Z14829EmpProd = T000Y3_A14829EmpProd[0] ;
            Z953IvaCod = T000Y3_A953IvaCod[0] ;
         }
         else
         {
            Z407EmprNom = A407EmprNom ;
            Z404EmprDir = A404EmprDir ;
            Z403EmprCpo = A403EmprCpo ;
            Z408EmprPob = A408EmprPob ;
            Z395EmprCif = A395EmprCif ;
            Z409EmprTel = A409EmprTel ;
            Z405EmprFax = A405EmprFax ;
            Z961Emp1 = A961Emp1 ;
            Z962Emp0 = A962Emp0 ;
            Z963Ser1 = A963Ser1 ;
            Z964Ser0 = A964Ser0 ;
            Z2387Ser2 = A2387Ser2 ;
            Z2388Ser20 = A2388Ser20 ;
            Z2389Ser3 = A2389Ser3 ;
            Z2390Ser30 = A2390Ser30 ;
            Z3915EmpNumDec = A3915EmpNumDec ;
            Z7209Colombia = A7209Colombia ;
            Z8334EmpItm1 = A8334EmpItm1 ;
            Z8335EmpItm2 = A8335EmpItm2 ;
            Z8336EmpItm3 = A8336EmpItm3 ;
            Z8337EmpItm4 = A8337EmpItm4 ;
            Z8338EmpItm5 = A8338EmpItm5 ;
            Z11516EmpItm6 = A11516EmpItm6 ;
            Z12702EmpItm7 = A12702EmpItm7 ;
            Z14826EmpKey = A14826EmpKey ;
            Z14827EmpToken = A14827EmpToken ;
            Z14828EmpEnv = A14828EmpEnv ;
            Z14829EmpProd = A14829EmpProd ;
            Z953IvaCod = A953IvaCod ;
         }
      }
      if ( GX_JID == -17 )
      {
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
         Z404EmprDir = A404EmprDir ;
         Z403EmprCpo = A403EmprCpo ;
         Z408EmprPob = A408EmprPob ;
         Z395EmprCif = A395EmprCif ;
         Z409EmprTel = A409EmprTel ;
         Z405EmprFax = A405EmprFax ;
         Z961Emp1 = A961Emp1 ;
         Z962Emp0 = A962Emp0 ;
         Z963Ser1 = A963Ser1 ;
         Z964Ser0 = A964Ser0 ;
         Z2387Ser2 = A2387Ser2 ;
         Z2388Ser20 = A2388Ser20 ;
         Z2389Ser3 = A2389Ser3 ;
         Z2390Ser30 = A2390Ser30 ;
         Z3915EmpNumDec = A3915EmpNumDec ;
         Z7209Colombia = A7209Colombia ;
         Z8334EmpItm1 = A8334EmpItm1 ;
         Z8335EmpItm2 = A8335EmpItm2 ;
         Z8336EmpItm3 = A8336EmpItm3 ;
         Z8337EmpItm4 = A8337EmpItm4 ;
         Z8338EmpItm5 = A8338EmpItm5 ;
         Z11516EmpItm6 = A11516EmpItm6 ;
         Z12702EmpItm7 = A12702EmpItm7 ;
         Z14826EmpKey = A14826EmpKey ;
         Z14827EmpToken = A14827EmpToken ;
         Z14828EmpEnv = A14828EmpEnv ;
         Z14829EmpProd = A14829EmpProd ;
         Z953IvaCod = A953IvaCod ;
         Z954IvaDsc = A954IvaDsc ;
         Z588IvaPor = A588IvaPor ;
         Z589IvaRec = A589IvaRec ;
      }
   }

   public void standaloneNotModal( )
   {
      AV51Pgmname = "TEMPRES" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV51Pgmname", AV51Pgmname);
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV35EmprCod)==0) )
      {
         A396EmprCod = AV35EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      if ( ! (GXutil.strcmp("", AV35EmprCod)==0) )
      {
         edtEmprCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      }
      else
      {
         edtEmprCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      }
      if ( ! (GXutil.strcmp("", AV35EmprCod)==0) )
      {
         edtEmprCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (GXutil.strcmp("", AV43Insert_IvaCod)==0) )
      {
         edtIvaCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtIvaCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtIvaCod_Enabled), 5, 0), true);
      }
      else
      {
         edtIvaCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtIvaCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtIvaCod_Enabled), 5, 0), true);
      }
   }

   public void standaloneModal( )
   {
      if ( isDlt( )  && true /* Level */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "nada", ""), 1, "");
         AnyError = (short)(1) ;
      }
      if ( isDlt( )  )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "No se permite eliminar", ""), 1, "");
         AnyError = (short)(1) ;
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (GXutil.strcmp("", AV43Insert_IvaCod)==0) )
      {
         A953IvaCod = AV43Insert_IvaCod ;
         n953IvaCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A953IvaCod", A953IvaCod);
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
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ( Gx_BScreen == 0 ) )
      {
         GXt_int6 = A5468Refugio ;
         GXv_int7[0] = GXt_int6 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "REFUGI", ""), GXv_int7) ;
         tempres_impl.this.GXt_int6 = GXv_int7[0] ;
         A5468Refugio = GXt_int6 ;
         httpContext.ajax_rsp_assign_attri("", false, "A5468Refugio", GXutil.str( A5468Refugio, 1, 0));
         /* Using cursor T000Y4 */
         pr_default.execute(2, new Object[] {Boolean.valueOf(n953IvaCod), A953IvaCod});
         A954IvaDsc = T000Y4_A954IvaDsc[0] ;
         n954IvaDsc = T000Y4_n954IvaDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A954IvaDsc", A954IvaDsc);
         A588IvaPor = T000Y4_A588IvaPor[0] ;
         n588IvaPor = T000Y4_n588IvaPor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A588IvaPor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A588IvaPor), 2, 0));
         A589IvaRec = T000Y4_A589IvaRec[0] ;
         n589IvaRec = T000Y4_n589IvaRec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A589IvaRec", GXutil.ltrimstr( A589IvaRec, 7, 3));
         pr_default.close(2);
      }
   }

   public void load0Y27( )
   {
      /* Using cursor T000Y5 */
      pr_default.execute(3, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound27 = (short)(1) ;
         A407EmprNom = T000Y5_A407EmprNom[0] ;
         n407EmprNom = T000Y5_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A404EmprDir = T000Y5_A404EmprDir[0] ;
         n404EmprDir = T000Y5_n404EmprDir[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A404EmprDir", A404EmprDir);
         A403EmprCpo = T000Y5_A403EmprCpo[0] ;
         n403EmprCpo = T000Y5_n403EmprCpo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A403EmprCpo", A403EmprCpo);
         A408EmprPob = T000Y5_A408EmprPob[0] ;
         n408EmprPob = T000Y5_n408EmprPob[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A408EmprPob", A408EmprPob);
         A395EmprCif = T000Y5_A395EmprCif[0] ;
         n395EmprCif = T000Y5_n395EmprCif[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A395EmprCif", A395EmprCif);
         A409EmprTel = T000Y5_A409EmprTel[0] ;
         n409EmprTel = T000Y5_n409EmprTel[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A409EmprTel", A409EmprTel);
         A405EmprFax = T000Y5_A405EmprFax[0] ;
         n405EmprFax = T000Y5_n405EmprFax[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A405EmprFax", A405EmprFax);
         A954IvaDsc = T000Y5_A954IvaDsc[0] ;
         n954IvaDsc = T000Y5_n954IvaDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A954IvaDsc", A954IvaDsc);
         A588IvaPor = T000Y5_A588IvaPor[0] ;
         n588IvaPor = T000Y5_n588IvaPor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A588IvaPor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A588IvaPor), 2, 0));
         A589IvaRec = T000Y5_A589IvaRec[0] ;
         n589IvaRec = T000Y5_n589IvaRec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A589IvaRec", GXutil.ltrimstr( A589IvaRec, 7, 3));
         A961Emp1 = T000Y5_A961Emp1[0] ;
         n961Emp1 = T000Y5_n961Emp1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A961Emp1", A961Emp1);
         A962Emp0 = T000Y5_A962Emp0[0] ;
         n962Emp0 = T000Y5_n962Emp0[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A962Emp0", A962Emp0);
         A963Ser1 = T000Y5_A963Ser1[0] ;
         n963Ser1 = T000Y5_n963Ser1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A963Ser1", A963Ser1);
         A964Ser0 = T000Y5_A964Ser0[0] ;
         n964Ser0 = T000Y5_n964Ser0[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A964Ser0", A964Ser0);
         A2387Ser2 = T000Y5_A2387Ser2[0] ;
         n2387Ser2 = T000Y5_n2387Ser2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2387Ser2", A2387Ser2);
         A2388Ser20 = T000Y5_A2388Ser20[0] ;
         n2388Ser20 = T000Y5_n2388Ser20[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2388Ser20", A2388Ser20);
         A2389Ser3 = T000Y5_A2389Ser3[0] ;
         n2389Ser3 = T000Y5_n2389Ser3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2389Ser3", A2389Ser3);
         A2390Ser30 = T000Y5_A2390Ser30[0] ;
         n2390Ser30 = T000Y5_n2390Ser30[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2390Ser30", A2390Ser30);
         A3915EmpNumDec = T000Y5_A3915EmpNumDec[0] ;
         n3915EmpNumDec = T000Y5_n3915EmpNumDec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3915EmpNumDec", GXutil.str( A3915EmpNumDec, 1, 0));
         A7209Colombia = T000Y5_A7209Colombia[0] ;
         n7209Colombia = T000Y5_n7209Colombia[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7209Colombia", GXutil.str( A7209Colombia, 1, 0));
         A8334EmpItm1 = T000Y5_A8334EmpItm1[0] ;
         n8334EmpItm1 = T000Y5_n8334EmpItm1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8334EmpItm1", A8334EmpItm1);
         A8335EmpItm2 = T000Y5_A8335EmpItm2[0] ;
         n8335EmpItm2 = T000Y5_n8335EmpItm2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8335EmpItm2", A8335EmpItm2);
         A8336EmpItm3 = T000Y5_A8336EmpItm3[0] ;
         n8336EmpItm3 = T000Y5_n8336EmpItm3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8336EmpItm3", A8336EmpItm3);
         A8337EmpItm4 = T000Y5_A8337EmpItm4[0] ;
         n8337EmpItm4 = T000Y5_n8337EmpItm4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8337EmpItm4", A8337EmpItm4);
         A8338EmpItm5 = T000Y5_A8338EmpItm5[0] ;
         n8338EmpItm5 = T000Y5_n8338EmpItm5[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8338EmpItm5", A8338EmpItm5);
         A11516EmpItm6 = T000Y5_A11516EmpItm6[0] ;
         n11516EmpItm6 = T000Y5_n11516EmpItm6[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11516EmpItm6", A11516EmpItm6);
         A12702EmpItm7 = T000Y5_A12702EmpItm7[0] ;
         n12702EmpItm7 = T000Y5_n12702EmpItm7[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12702EmpItm7", A12702EmpItm7);
         A14826EmpKey = T000Y5_A14826EmpKey[0] ;
         n14826EmpKey = T000Y5_n14826EmpKey[0] ;
         A14827EmpToken = T000Y5_A14827EmpToken[0] ;
         n14827EmpToken = T000Y5_n14827EmpToken[0] ;
         A14828EmpEnv = T000Y5_A14828EmpEnv[0] ;
         n14828EmpEnv = T000Y5_n14828EmpEnv[0] ;
         A14829EmpProd = T000Y5_A14829EmpProd[0] ;
         n14829EmpProd = T000Y5_n14829EmpProd[0] ;
         A953IvaCod = T000Y5_A953IvaCod[0] ;
         n953IvaCod = T000Y5_n953IvaCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A953IvaCod", A953IvaCod);
         zm0Y27( -17) ;
      }
      pr_default.close(3);
      onLoadActions0Y27( ) ;
   }

   public void onLoadActions0Y27( )
   {
      GXt_int6 = A5468Refugio ;
      GXv_int7[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "REFUGI", ""), GXv_int7) ;
      tempres_impl.this.GXt_int6 = GXv_int7[0] ;
      A5468Refugio = GXt_int6 ;
      httpContext.ajax_rsp_assign_attri("", false, "A5468Refugio", GXutil.str( A5468Refugio, 1, 0));
   }

   public void checkExtendedTable0Y27( )
   {
      nIsDirty_27 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      nIsDirty_27 = (short)(1) ;
      GXt_int6 = A5468Refugio ;
      GXv_int7[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "REFUGI", ""), GXv_int7) ;
      tempres_impl.this.GXt_int6 = GXv_int7[0] ;
      A5468Refugio = GXt_int6 ;
      httpContext.ajax_rsp_assign_attri("", false, "A5468Refugio", GXutil.str( A5468Refugio, 1, 0));
      if ( (GXutil.strcmp("", A396EmprCod)==0) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "ATENCION!! Debe introducir Código", ""), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( (GXutil.strcmp("", A407EmprNom)==0) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "ATENCION!! Debe introducir Nombre", ""), 1, "EMPRNOM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprNom_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( (GXutil.strcmp("", A395EmprCif)==0) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "El NIF debe ser obligatorio", ""), 1, "EMPRCIF");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCif_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      /* Using cursor T000Y4 */
      pr_default.execute(2, new Object[] {Boolean.valueOf(n953IvaCod), A953IvaCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TIPIVA", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "IVACOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtIvaCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A954IvaDsc = T000Y4_A954IvaDsc[0] ;
      n954IvaDsc = T000Y4_n954IvaDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A954IvaDsc", A954IvaDsc);
      A588IvaPor = T000Y4_A588IvaPor[0] ;
      n588IvaPor = T000Y4_n588IvaPor[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A588IvaPor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A588IvaPor), 2, 0));
      A589IvaRec = T000Y4_A589IvaRec[0] ;
      n589IvaRec = T000Y4_n589IvaRec[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A589IvaRec", GXutil.ltrimstr( A589IvaRec, 7, 3));
      pr_default.close(2);
      if ( ! ( ( A3915EmpNumDec == 0 ) || ( A3915EmpNumDec == 2 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "EmpNumDec", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "EMPNUMDEC");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmpNumDec_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors0Y27( )
   {
      pr_default.close(2);
   }

   public void enableDisable( )
   {
   }

   public void gxload_18( String A953IvaCod )
   {
      /* Using cursor T000Y6 */
      pr_default.execute(4, new Object[] {Boolean.valueOf(n953IvaCod), A953IvaCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TIPIVA", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "IVACOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtIvaCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A954IvaDsc = T000Y6_A954IvaDsc[0] ;
      n954IvaDsc = T000Y6_n954IvaDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A954IvaDsc", A954IvaDsc);
      A588IvaPor = T000Y6_A588IvaPor[0] ;
      n588IvaPor = T000Y6_n588IvaPor[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A588IvaPor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A588IvaPor), 2, 0));
      A589IvaRec = T000Y6_A589IvaRec[0] ;
      n589IvaRec = T000Y6_n589IvaRec[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A589IvaRec", GXutil.ltrimstr( A589IvaRec, 7, 3));
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A954IvaDsc))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A588IvaPor, (byte)(2), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A589IvaRec, (byte)(7), (byte)(3), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(4) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(4);
   }

   public void getKey0Y27( )
   {
      /* Using cursor T000Y7 */
      pr_default.execute(5, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound27 = (short)(1) ;
      }
      else
      {
         RcdFound27 = (short)(0) ;
      }
      pr_default.close(5);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T000Y3 */
      pr_default.execute(1, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm0Y27( 17) ;
         RcdFound27 = (short)(1) ;
         A396EmprCod = T000Y3_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A407EmprNom = T000Y3_A407EmprNom[0] ;
         n407EmprNom = T000Y3_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A404EmprDir = T000Y3_A404EmprDir[0] ;
         n404EmprDir = T000Y3_n404EmprDir[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A404EmprDir", A404EmprDir);
         A403EmprCpo = T000Y3_A403EmprCpo[0] ;
         n403EmprCpo = T000Y3_n403EmprCpo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A403EmprCpo", A403EmprCpo);
         A408EmprPob = T000Y3_A408EmprPob[0] ;
         n408EmprPob = T000Y3_n408EmprPob[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A408EmprPob", A408EmprPob);
         A395EmprCif = T000Y3_A395EmprCif[0] ;
         n395EmprCif = T000Y3_n395EmprCif[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A395EmprCif", A395EmprCif);
         A409EmprTel = T000Y3_A409EmprTel[0] ;
         n409EmprTel = T000Y3_n409EmprTel[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A409EmprTel", A409EmprTel);
         A405EmprFax = T000Y3_A405EmprFax[0] ;
         n405EmprFax = T000Y3_n405EmprFax[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A405EmprFax", A405EmprFax);
         A961Emp1 = T000Y3_A961Emp1[0] ;
         n961Emp1 = T000Y3_n961Emp1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A961Emp1", A961Emp1);
         A962Emp0 = T000Y3_A962Emp0[0] ;
         n962Emp0 = T000Y3_n962Emp0[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A962Emp0", A962Emp0);
         A963Ser1 = T000Y3_A963Ser1[0] ;
         n963Ser1 = T000Y3_n963Ser1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A963Ser1", A963Ser1);
         A964Ser0 = T000Y3_A964Ser0[0] ;
         n964Ser0 = T000Y3_n964Ser0[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A964Ser0", A964Ser0);
         A2387Ser2 = T000Y3_A2387Ser2[0] ;
         n2387Ser2 = T000Y3_n2387Ser2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2387Ser2", A2387Ser2);
         A2388Ser20 = T000Y3_A2388Ser20[0] ;
         n2388Ser20 = T000Y3_n2388Ser20[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2388Ser20", A2388Ser20);
         A2389Ser3 = T000Y3_A2389Ser3[0] ;
         n2389Ser3 = T000Y3_n2389Ser3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2389Ser3", A2389Ser3);
         A2390Ser30 = T000Y3_A2390Ser30[0] ;
         n2390Ser30 = T000Y3_n2390Ser30[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2390Ser30", A2390Ser30);
         A3915EmpNumDec = T000Y3_A3915EmpNumDec[0] ;
         n3915EmpNumDec = T000Y3_n3915EmpNumDec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3915EmpNumDec", GXutil.str( A3915EmpNumDec, 1, 0));
         A7209Colombia = T000Y3_A7209Colombia[0] ;
         n7209Colombia = T000Y3_n7209Colombia[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7209Colombia", GXutil.str( A7209Colombia, 1, 0));
         A8334EmpItm1 = T000Y3_A8334EmpItm1[0] ;
         n8334EmpItm1 = T000Y3_n8334EmpItm1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8334EmpItm1", A8334EmpItm1);
         A8335EmpItm2 = T000Y3_A8335EmpItm2[0] ;
         n8335EmpItm2 = T000Y3_n8335EmpItm2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8335EmpItm2", A8335EmpItm2);
         A8336EmpItm3 = T000Y3_A8336EmpItm3[0] ;
         n8336EmpItm3 = T000Y3_n8336EmpItm3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8336EmpItm3", A8336EmpItm3);
         A8337EmpItm4 = T000Y3_A8337EmpItm4[0] ;
         n8337EmpItm4 = T000Y3_n8337EmpItm4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8337EmpItm4", A8337EmpItm4);
         A8338EmpItm5 = T000Y3_A8338EmpItm5[0] ;
         n8338EmpItm5 = T000Y3_n8338EmpItm5[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8338EmpItm5", A8338EmpItm5);
         A11516EmpItm6 = T000Y3_A11516EmpItm6[0] ;
         n11516EmpItm6 = T000Y3_n11516EmpItm6[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11516EmpItm6", A11516EmpItm6);
         A12702EmpItm7 = T000Y3_A12702EmpItm7[0] ;
         n12702EmpItm7 = T000Y3_n12702EmpItm7[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12702EmpItm7", A12702EmpItm7);
         A14826EmpKey = T000Y3_A14826EmpKey[0] ;
         n14826EmpKey = T000Y3_n14826EmpKey[0] ;
         A14827EmpToken = T000Y3_A14827EmpToken[0] ;
         n14827EmpToken = T000Y3_n14827EmpToken[0] ;
         A14828EmpEnv = T000Y3_A14828EmpEnv[0] ;
         n14828EmpEnv = T000Y3_n14828EmpEnv[0] ;
         A14829EmpProd = T000Y3_A14829EmpProd[0] ;
         n14829EmpProd = T000Y3_n14829EmpProd[0] ;
         A953IvaCod = T000Y3_A953IvaCod[0] ;
         n953IvaCod = T000Y3_n953IvaCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A953IvaCod", A953IvaCod);
         Z396EmprCod = A396EmprCod ;
         sMode27 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load0Y27( ) ;
         if ( AnyError == 1 )
         {
            RcdFound27 = (short)(0) ;
            initializeNonKey0Y27( ) ;
         }
         Gx_mode = sMode27 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound27 = (short)(0) ;
         initializeNonKey0Y27( ) ;
         sMode27 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode27 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey0Y27( ) ;
      if ( RcdFound27 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound27 = (short)(0) ;
      /* Using cursor T000Y8 */
      pr_default.execute(6, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(6) != 101) )
      {
         while ( (pr_default.getStatus(6) != 101) && ( ( GXutil.strcmp(T000Y8_A396EmprCod[0], A396EmprCod) < 0 ) ) )
         {
            pr_default.readNext(6);
         }
         if ( (pr_default.getStatus(6) != 101) && ( ( GXutil.strcmp(T000Y8_A396EmprCod[0], A396EmprCod) > 0 ) ) )
         {
            A396EmprCod = T000Y8_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            RcdFound27 = (short)(1) ;
         }
      }
      pr_default.close(6);
   }

   public void move_previous( )
   {
      RcdFound27 = (short)(0) ;
      /* Using cursor T000Y9 */
      pr_default.execute(7, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(7) != 101) )
      {
         while ( (pr_default.getStatus(7) != 101) && ( ( GXutil.strcmp(T000Y9_A396EmprCod[0], A396EmprCod) > 0 ) ) )
         {
            pr_default.readNext(7);
         }
         if ( (pr_default.getStatus(7) != 101) && ( ( GXutil.strcmp(T000Y9_A396EmprCod[0], A396EmprCod) < 0 ) ) )
         {
            A396EmprCod = T000Y9_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            RcdFound27 = (short)(1) ;
         }
      }
      pr_default.close(7);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey0Y27( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert0Y27( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound27 == 1 )
         {
            if ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               update0Y27( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 )
            {
               /* Insert record */
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert0Y27( ) ;
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
                  GX_FocusControl = edtEmprCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert0Y27( ) ;
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
      if ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency0Y27( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T000Y2 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPEMPRES"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z407EmprNom, T000Y2_A407EmprNom[0]) != 0 ) || ( GXutil.strcmp(Z404EmprDir, T000Y2_A404EmprDir[0]) != 0 ) || ( GXutil.strcmp(Z403EmprCpo, T000Y2_A403EmprCpo[0]) != 0 ) || ( GXutil.strcmp(Z408EmprPob, T000Y2_A408EmprPob[0]) != 0 ) || ( GXutil.strcmp(Z395EmprCif, T000Y2_A395EmprCif[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z409EmprTel, T000Y2_A409EmprTel[0]) != 0 ) || ( GXutil.strcmp(Z405EmprFax, T000Y2_A405EmprFax[0]) != 0 ) || ( GXutil.strcmp(Z961Emp1, T000Y2_A961Emp1[0]) != 0 ) || ( GXutil.strcmp(Z962Emp0, T000Y2_A962Emp0[0]) != 0 ) || ( GXutil.strcmp(Z963Ser1, T000Y2_A963Ser1[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z964Ser0, T000Y2_A964Ser0[0]) != 0 ) || ( GXutil.strcmp(Z2387Ser2, T000Y2_A2387Ser2[0]) != 0 ) || ( GXutil.strcmp(Z2388Ser20, T000Y2_A2388Ser20[0]) != 0 ) || ( GXutil.strcmp(Z2389Ser3, T000Y2_A2389Ser3[0]) != 0 ) || ( GXutil.strcmp(Z2390Ser30, T000Y2_A2390Ser30[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z3915EmpNumDec != T000Y2_A3915EmpNumDec[0] ) || ( Z7209Colombia != T000Y2_A7209Colombia[0] ) || ( GXutil.strcmp(Z8334EmpItm1, T000Y2_A8334EmpItm1[0]) != 0 ) || ( GXutil.strcmp(Z8335EmpItm2, T000Y2_A8335EmpItm2[0]) != 0 ) || ( GXutil.strcmp(Z8336EmpItm3, T000Y2_A8336EmpItm3[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z8337EmpItm4, T000Y2_A8337EmpItm4[0]) != 0 ) || ( GXutil.strcmp(Z8338EmpItm5, T000Y2_A8338EmpItm5[0]) != 0 ) || ( GXutil.strcmp(Z11516EmpItm6, T000Y2_A11516EmpItm6[0]) != 0 ) || ( GXutil.strcmp(Z12702EmpItm7, T000Y2_A12702EmpItm7[0]) != 0 ) || ( GXutil.strcmp(Z14826EmpKey, T000Y2_A14826EmpKey[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z14827EmpToken, T000Y2_A14827EmpToken[0]) != 0 ) || ( GXutil.strcmp(Z14828EmpEnv, T000Y2_A14828EmpEnv[0]) != 0 ) || ( GXutil.strcmp(Z14829EmpProd, T000Y2_A14829EmpProd[0]) != 0 ) || ( GXutil.strcmp(Z953IvaCod, T000Y2_A953IvaCod[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z407EmprNom, T000Y2_A407EmprNom[0]) != 0 )
            {
               GXutil.writeLogln("tempres:[seudo value changed for attri]"+"EmprNom");
               GXutil.writeLogRaw("Old: ",Z407EmprNom);
               GXutil.writeLogRaw("Current: ",T000Y2_A407EmprNom[0]);
            }
            if ( GXutil.strcmp(Z404EmprDir, T000Y2_A404EmprDir[0]) != 0 )
            {
               GXutil.writeLogln("tempres:[seudo value changed for attri]"+"EmprDir");
               GXutil.writeLogRaw("Old: ",Z404EmprDir);
               GXutil.writeLogRaw("Current: ",T000Y2_A404EmprDir[0]);
            }
            if ( GXutil.strcmp(Z403EmprCpo, T000Y2_A403EmprCpo[0]) != 0 )
            {
               GXutil.writeLogln("tempres:[seudo value changed for attri]"+"EmprCpo");
               GXutil.writeLogRaw("Old: ",Z403EmprCpo);
               GXutil.writeLogRaw("Current: ",T000Y2_A403EmprCpo[0]);
            }
            if ( GXutil.strcmp(Z408EmprPob, T000Y2_A408EmprPob[0]) != 0 )
            {
               GXutil.writeLogln("tempres:[seudo value changed for attri]"+"EmprPob");
               GXutil.writeLogRaw("Old: ",Z408EmprPob);
               GXutil.writeLogRaw("Current: ",T000Y2_A408EmprPob[0]);
            }
            if ( GXutil.strcmp(Z395EmprCif, T000Y2_A395EmprCif[0]) != 0 )
            {
               GXutil.writeLogln("tempres:[seudo value changed for attri]"+"EmprCif");
               GXutil.writeLogRaw("Old: ",Z395EmprCif);
               GXutil.writeLogRaw("Current: ",T000Y2_A395EmprCif[0]);
            }
            if ( GXutil.strcmp(Z409EmprTel, T000Y2_A409EmprTel[0]) != 0 )
            {
               GXutil.writeLogln("tempres:[seudo value changed for attri]"+"EmprTel");
               GXutil.writeLogRaw("Old: ",Z409EmprTel);
               GXutil.writeLogRaw("Current: ",T000Y2_A409EmprTel[0]);
            }
            if ( GXutil.strcmp(Z405EmprFax, T000Y2_A405EmprFax[0]) != 0 )
            {
               GXutil.writeLogln("tempres:[seudo value changed for attri]"+"EmprFax");
               GXutil.writeLogRaw("Old: ",Z405EmprFax);
               GXutil.writeLogRaw("Current: ",T000Y2_A405EmprFax[0]);
            }
            if ( GXutil.strcmp(Z961Emp1, T000Y2_A961Emp1[0]) != 0 )
            {
               GXutil.writeLogln("tempres:[seudo value changed for attri]"+"Emp1");
               GXutil.writeLogRaw("Old: ",Z961Emp1);
               GXutil.writeLogRaw("Current: ",T000Y2_A961Emp1[0]);
            }
            if ( GXutil.strcmp(Z962Emp0, T000Y2_A962Emp0[0]) != 0 )
            {
               GXutil.writeLogln("tempres:[seudo value changed for attri]"+"Emp0");
               GXutil.writeLogRaw("Old: ",Z962Emp0);
               GXutil.writeLogRaw("Current: ",T000Y2_A962Emp0[0]);
            }
            if ( GXutil.strcmp(Z963Ser1, T000Y2_A963Ser1[0]) != 0 )
            {
               GXutil.writeLogln("tempres:[seudo value changed for attri]"+"Ser1");
               GXutil.writeLogRaw("Old: ",Z963Ser1);
               GXutil.writeLogRaw("Current: ",T000Y2_A963Ser1[0]);
            }
            if ( GXutil.strcmp(Z964Ser0, T000Y2_A964Ser0[0]) != 0 )
            {
               GXutil.writeLogln("tempres:[seudo value changed for attri]"+"Ser0");
               GXutil.writeLogRaw("Old: ",Z964Ser0);
               GXutil.writeLogRaw("Current: ",T000Y2_A964Ser0[0]);
            }
            if ( GXutil.strcmp(Z2387Ser2, T000Y2_A2387Ser2[0]) != 0 )
            {
               GXutil.writeLogln("tempres:[seudo value changed for attri]"+"Ser2");
               GXutil.writeLogRaw("Old: ",Z2387Ser2);
               GXutil.writeLogRaw("Current: ",T000Y2_A2387Ser2[0]);
            }
            if ( GXutil.strcmp(Z2388Ser20, T000Y2_A2388Ser20[0]) != 0 )
            {
               GXutil.writeLogln("tempres:[seudo value changed for attri]"+"Ser20");
               GXutil.writeLogRaw("Old: ",Z2388Ser20);
               GXutil.writeLogRaw("Current: ",T000Y2_A2388Ser20[0]);
            }
            if ( GXutil.strcmp(Z2389Ser3, T000Y2_A2389Ser3[0]) != 0 )
            {
               GXutil.writeLogln("tempres:[seudo value changed for attri]"+"Ser3");
               GXutil.writeLogRaw("Old: ",Z2389Ser3);
               GXutil.writeLogRaw("Current: ",T000Y2_A2389Ser3[0]);
            }
            if ( GXutil.strcmp(Z2390Ser30, T000Y2_A2390Ser30[0]) != 0 )
            {
               GXutil.writeLogln("tempres:[seudo value changed for attri]"+"Ser30");
               GXutil.writeLogRaw("Old: ",Z2390Ser30);
               GXutil.writeLogRaw("Current: ",T000Y2_A2390Ser30[0]);
            }
            if ( Z3915EmpNumDec != T000Y2_A3915EmpNumDec[0] )
            {
               GXutil.writeLogln("tempres:[seudo value changed for attri]"+"EmpNumDec");
               GXutil.writeLogRaw("Old: ",Z3915EmpNumDec);
               GXutil.writeLogRaw("Current: ",T000Y2_A3915EmpNumDec[0]);
            }
            if ( Z7209Colombia != T000Y2_A7209Colombia[0] )
            {
               GXutil.writeLogln("tempres:[seudo value changed for attri]"+"Colombia");
               GXutil.writeLogRaw("Old: ",Z7209Colombia);
               GXutil.writeLogRaw("Current: ",T000Y2_A7209Colombia[0]);
            }
            if ( GXutil.strcmp(Z8334EmpItm1, T000Y2_A8334EmpItm1[0]) != 0 )
            {
               GXutil.writeLogln("tempres:[seudo value changed for attri]"+"EmpItm1");
               GXutil.writeLogRaw("Old: ",Z8334EmpItm1);
               GXutil.writeLogRaw("Current: ",T000Y2_A8334EmpItm1[0]);
            }
            if ( GXutil.strcmp(Z8335EmpItm2, T000Y2_A8335EmpItm2[0]) != 0 )
            {
               GXutil.writeLogln("tempres:[seudo value changed for attri]"+"EmpItm2");
               GXutil.writeLogRaw("Old: ",Z8335EmpItm2);
               GXutil.writeLogRaw("Current: ",T000Y2_A8335EmpItm2[0]);
            }
            if ( GXutil.strcmp(Z8336EmpItm3, T000Y2_A8336EmpItm3[0]) != 0 )
            {
               GXutil.writeLogln("tempres:[seudo value changed for attri]"+"EmpItm3");
               GXutil.writeLogRaw("Old: ",Z8336EmpItm3);
               GXutil.writeLogRaw("Current: ",T000Y2_A8336EmpItm3[0]);
            }
            if ( GXutil.strcmp(Z8337EmpItm4, T000Y2_A8337EmpItm4[0]) != 0 )
            {
               GXutil.writeLogln("tempres:[seudo value changed for attri]"+"EmpItm4");
               GXutil.writeLogRaw("Old: ",Z8337EmpItm4);
               GXutil.writeLogRaw("Current: ",T000Y2_A8337EmpItm4[0]);
            }
            if ( GXutil.strcmp(Z8338EmpItm5, T000Y2_A8338EmpItm5[0]) != 0 )
            {
               GXutil.writeLogln("tempres:[seudo value changed for attri]"+"EmpItm5");
               GXutil.writeLogRaw("Old: ",Z8338EmpItm5);
               GXutil.writeLogRaw("Current: ",T000Y2_A8338EmpItm5[0]);
            }
            if ( GXutil.strcmp(Z11516EmpItm6, T000Y2_A11516EmpItm6[0]) != 0 )
            {
               GXutil.writeLogln("tempres:[seudo value changed for attri]"+"EmpItm6");
               GXutil.writeLogRaw("Old: ",Z11516EmpItm6);
               GXutil.writeLogRaw("Current: ",T000Y2_A11516EmpItm6[0]);
            }
            if ( GXutil.strcmp(Z12702EmpItm7, T000Y2_A12702EmpItm7[0]) != 0 )
            {
               GXutil.writeLogln("tempres:[seudo value changed for attri]"+"EmpItm7");
               GXutil.writeLogRaw("Old: ",Z12702EmpItm7);
               GXutil.writeLogRaw("Current: ",T000Y2_A12702EmpItm7[0]);
            }
            if ( GXutil.strcmp(Z14826EmpKey, T000Y2_A14826EmpKey[0]) != 0 )
            {
               GXutil.writeLogln("tempres:[seudo value changed for attri]"+"EmpKey");
               GXutil.writeLogRaw("Old: ",Z14826EmpKey);
               GXutil.writeLogRaw("Current: ",T000Y2_A14826EmpKey[0]);
            }
            if ( GXutil.strcmp(Z14827EmpToken, T000Y2_A14827EmpToken[0]) != 0 )
            {
               GXutil.writeLogln("tempres:[seudo value changed for attri]"+"EmpToken");
               GXutil.writeLogRaw("Old: ",Z14827EmpToken);
               GXutil.writeLogRaw("Current: ",T000Y2_A14827EmpToken[0]);
            }
            if ( GXutil.strcmp(Z14828EmpEnv, T000Y2_A14828EmpEnv[0]) != 0 )
            {
               GXutil.writeLogln("tempres:[seudo value changed for attri]"+"EmpEnv");
               GXutil.writeLogRaw("Old: ",Z14828EmpEnv);
               GXutil.writeLogRaw("Current: ",T000Y2_A14828EmpEnv[0]);
            }
            if ( GXutil.strcmp(Z14829EmpProd, T000Y2_A14829EmpProd[0]) != 0 )
            {
               GXutil.writeLogln("tempres:[seudo value changed for attri]"+"EmpProd");
               GXutil.writeLogRaw("Old: ",Z14829EmpProd);
               GXutil.writeLogRaw("Current: ",T000Y2_A14829EmpProd[0]);
            }
            if ( GXutil.strcmp(Z953IvaCod, T000Y2_A953IvaCod[0]) != 0 )
            {
               GXutil.writeLogln("tempres:[seudo value changed for attri]"+"IvaCod");
               GXutil.writeLogRaw("Old: ",Z953IvaCod);
               GXutil.writeLogRaw("Current: ",T000Y2_A953IvaCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPEMPRES"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert0Y27( )
   {
      beforeValidate0Y27( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0Y27( ) ;
      }
      if ( AnyError == 0 )
      {
         zm0Y27( 0) ;
         checkOptimisticConcurrency0Y27( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0Y27( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert0Y27( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000Y10 */
                  pr_default.execute(8, new Object[] {A396EmprCod, Boolean.valueOf(n407EmprNom), A407EmprNom, Boolean.valueOf(n404EmprDir), A404EmprDir, Boolean.valueOf(n403EmprCpo), A403EmprCpo, Boolean.valueOf(n408EmprPob), A408EmprPob, Boolean.valueOf(n395EmprCif), A395EmprCif, Boolean.valueOf(n409EmprTel), A409EmprTel, Boolean.valueOf(n405EmprFax), A405EmprFax, Boolean.valueOf(n961Emp1), A961Emp1, Boolean.valueOf(n962Emp0), A962Emp0, Boolean.valueOf(n963Ser1), A963Ser1, Boolean.valueOf(n964Ser0), A964Ser0, Boolean.valueOf(n2387Ser2), A2387Ser2, Boolean.valueOf(n2388Ser20), A2388Ser20, Boolean.valueOf(n2389Ser3), A2389Ser3, Boolean.valueOf(n2390Ser30), A2390Ser30, Boolean.valueOf(n3915EmpNumDec), Byte.valueOf(A3915EmpNumDec), Boolean.valueOf(n7209Colombia), Byte.valueOf(A7209Colombia), Boolean.valueOf(n8334EmpItm1), A8334EmpItm1, Boolean.valueOf(n8335EmpItm2), A8335EmpItm2, Boolean.valueOf(n8336EmpItm3), A8336EmpItm3, Boolean.valueOf(n8337EmpItm4), A8337EmpItm4, Boolean.valueOf(n8338EmpItm5), A8338EmpItm5, Boolean.valueOf(n11516EmpItm6), A11516EmpItm6, Boolean.valueOf(n12702EmpItm7), A12702EmpItm7, Boolean.valueOf(n14826EmpKey), A14826EmpKey, Boolean.valueOf(n14827EmpToken), A14827EmpToken, Boolean.valueOf(n14828EmpEnv), A14828EmpEnv, Boolean.valueOf(n14829EmpProd), A14829EmpProd, Boolean.valueOf(n953IvaCod), A953IvaCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPEMPRES");
                  if ( (pr_default.getStatus(8) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     /* Start of After( Insert) rules */
                     if ( true /* After */ || true /* After */ )
                     {
                        httpContext.wjLoc = formatLink("app.temppar", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A407EmprNom))}, new String[] {"Mode","EmprCod","EmprNom"})  ;
                     }
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        /* Save values for previous() function. */
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                        endTrnMsgCod = "SuccessfullyAdded" ;
                        resetCaption0Y0( ) ;
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
            load0Y27( ) ;
         }
         endLevel0Y27( ) ;
      }
      closeExtendedTableCursors0Y27( ) ;
   }

   public void update0Y27( )
   {
      beforeValidate0Y27( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0Y27( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0Y27( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0Y27( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate0Y27( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000Y11 */
                  pr_default.execute(9, new Object[] {Boolean.valueOf(n407EmprNom), A407EmprNom, Boolean.valueOf(n404EmprDir), A404EmprDir, Boolean.valueOf(n403EmprCpo), A403EmprCpo, Boolean.valueOf(n408EmprPob), A408EmprPob, Boolean.valueOf(n395EmprCif), A395EmprCif, Boolean.valueOf(n409EmprTel), A409EmprTel, Boolean.valueOf(n405EmprFax), A405EmprFax, Boolean.valueOf(n961Emp1), A961Emp1, Boolean.valueOf(n962Emp0), A962Emp0, Boolean.valueOf(n963Ser1), A963Ser1, Boolean.valueOf(n964Ser0), A964Ser0, Boolean.valueOf(n2387Ser2), A2387Ser2, Boolean.valueOf(n2388Ser20), A2388Ser20, Boolean.valueOf(n2389Ser3), A2389Ser3, Boolean.valueOf(n2390Ser30), A2390Ser30, Boolean.valueOf(n3915EmpNumDec), Byte.valueOf(A3915EmpNumDec), Boolean.valueOf(n7209Colombia), Byte.valueOf(A7209Colombia), Boolean.valueOf(n8334EmpItm1), A8334EmpItm1, Boolean.valueOf(n8335EmpItm2), A8335EmpItm2, Boolean.valueOf(n8336EmpItm3), A8336EmpItm3, Boolean.valueOf(n8337EmpItm4), A8337EmpItm4, Boolean.valueOf(n8338EmpItm5), A8338EmpItm5, Boolean.valueOf(n11516EmpItm6), A11516EmpItm6, Boolean.valueOf(n12702EmpItm7), A12702EmpItm7, Boolean.valueOf(n14826EmpKey), A14826EmpKey, Boolean.valueOf(n14827EmpToken), A14827EmpToken, Boolean.valueOf(n14828EmpEnv), A14828EmpEnv, Boolean.valueOf(n14829EmpProd), A14829EmpProd, Boolean.valueOf(n953IvaCod), A953IvaCod, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPEMPRES");
                  if ( (pr_default.getStatus(9) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPEMPRES"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate0Y27( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     if ( true /* After */ || true /* After */ )
                     {
                        httpContext.wjLoc = formatLink("app.temppar", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A407EmprNom))}, new String[] {"Mode","EmprCod","EmprNom"})  ;
                     }
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
         endLevel0Y27( ) ;
      }
      closeExtendedTableCursors0Y27( ) ;
   }

   public void deferredUpdate0Y27( )
   {
   }

   public void delete( )
   {
      beforeValidate0Y27( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0Y27( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls0Y27( ) ;
         afterConfirm0Y27( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete0Y27( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T000Y12 */
               pr_default.execute(10, new Object[] {A396EmprCod});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPEMPRES");
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
      sMode27 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel0Y27( ) ;
      Gx_mode = sMode27 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls0Y27( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         GXt_int6 = A5468Refugio ;
         GXv_int7[0] = GXt_int6 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "REFUGI", ""), GXv_int7) ;
         tempres_impl.this.GXt_int6 = GXv_int7[0] ;
         A5468Refugio = GXt_int6 ;
         httpContext.ajax_rsp_assign_attri("", false, "A5468Refugio", GXutil.str( A5468Refugio, 1, 0));
         /* Using cursor T000Y13 */
         pr_default.execute(11, new Object[] {Boolean.valueOf(n953IvaCod), A953IvaCod});
         A954IvaDsc = T000Y13_A954IvaDsc[0] ;
         n954IvaDsc = T000Y13_n954IvaDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A954IvaDsc", A954IvaDsc);
         A588IvaPor = T000Y13_A588IvaPor[0] ;
         n588IvaPor = T000Y13_n588IvaPor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A588IvaPor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A588IvaPor), 2, 0));
         A589IvaRec = T000Y13_A589IvaRec[0] ;
         n589IvaRec = T000Y13_n589IvaRec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A589IvaRec", GXutil.ltrimstr( A589IvaRec, 7, 3));
         pr_default.close(11);
      }
   }

   public void endLevel0Y27( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete0Y27( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tempres");
         if ( AnyError == 0 )
         {
            confirmValues0Y0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tempres");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart0Y27( )
   {
      /* Scan By routine */
      /* Using cursor T000Y14 */
      pr_default.execute(12);
      RcdFound27 = (short)(0) ;
      if ( (pr_default.getStatus(12) != 101) )
      {
         RcdFound27 = (short)(1) ;
         A396EmprCod = T000Y14_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext0Y27( )
   {
      /* Scan next routine */
      pr_default.readNext(12);
      RcdFound27 = (short)(0) ;
      if ( (pr_default.getStatus(12) != 101) )
      {
         RcdFound27 = (short)(1) ;
         A396EmprCod = T000Y14_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
   }

   public void scanEnd0Y27( )
   {
      pr_default.close(12);
   }

   public void afterConfirm0Y27( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert0Y27( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate0Y27( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete0Y27( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete0Y27( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate0Y27( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes0Y27( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtEmprDir_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprDir_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprDir_Enabled), 5, 0), true);
      edtEmprCpo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCpo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCpo_Enabled), 5, 0), true);
      edtEmprPob_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprPob_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprPob_Enabled), 5, 0), true);
      edtEmprCif_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCif_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCif_Enabled), 5, 0), true);
      edtEmprTel_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprTel_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprTel_Enabled), 5, 0), true);
      edtEmprFax_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprFax_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprFax_Enabled), 5, 0), true);
      edtEmpNumDec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmpNumDec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmpNumDec_Enabled), 5, 0), true);
      edtIvaCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtIvaCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtIvaCod_Enabled), 5, 0), true);
      edtIvaDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtIvaDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtIvaDsc_Enabled), 5, 0), true);
      edtIvaPor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtIvaPor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtIvaPor_Enabled), 5, 0), true);
      edtIvaRec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtIvaRec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtIvaRec_Enabled), 5, 0), true);
      edtRefugio_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRefugio_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRefugio_Enabled), 5, 0), true);
      edtEmp1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmp1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmp1_Enabled), 5, 0), true);
      edtEmp0_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmp0_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmp0_Enabled), 5, 0), true);
      edtSer1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSer1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSer1_Enabled), 5, 0), true);
      edtSer0_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSer0_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSer0_Enabled), 5, 0), true);
      edtSer2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSer2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSer2_Enabled), 5, 0), true);
      edtSer20_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSer20_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSer20_Enabled), 5, 0), true);
      edtSer3_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSer3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSer3_Enabled), 5, 0), true);
      edtSer30_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSer30_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSer30_Enabled), 5, 0), true);
      edtEmpItm1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmpItm1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmpItm1_Enabled), 5, 0), true);
      edtEmpItm2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmpItm2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmpItm2_Enabled), 5, 0), true);
      edtEmpItm3_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmpItm3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmpItm3_Enabled), 5, 0), true);
      edtEmpItm4_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmpItm4_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmpItm4_Enabled), 5, 0), true);
      edtEmpItm5_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmpItm5_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmpItm5_Enabled), 5, 0), true);
      edtEmpItm6_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmpItm6_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmpItm6_Enabled), 5, 0), true);
      edtEmpItm7_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmpItm7_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmpItm7_Enabled), 5, 0), true);
      chkColombia.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkColombia.getInternalname(), "Enabled", GXutil.ltrimstr( chkColombia.getEnabled(), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes0Y27( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues0Y0( )
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
      httpContext.AddJavascriptSource("Shared/HistoryManager/HistoryManager.js", "", false, true);
      httpContext.AddJavascriptSource("Shared/HistoryManager/rsh/json2005.js", "", false, true);
      httpContext.AddJavascriptSource("Shared/HistoryManager/rsh/rsh.js", "", false, true);
      httpContext.AddJavascriptSource("Shared/HistoryManager/HistoryManagerCreate.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("Tab/TabRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.tempres", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV35EmprCod))}, new String[] {"Gx_mode","EmprCod"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"TEMPRES");
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV51Pgmname, "")));
      forbiddenHiddens.add("EmpKey", GXutil.rtrim( localUtil.format( A14826EmpKey, "")));
      forbiddenHiddens.add("EmpToken", GXutil.rtrim( localUtil.format( A14827EmpToken, "")));
      forbiddenHiddens.add("EmpEnv", GXutil.rtrim( localUtil.format( A14828EmpEnv, "")));
      forbiddenHiddens.add("EmpProd", GXutil.rtrim( localUtil.format( A14829EmpProd, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("tempres:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z404EmprDir", GXutil.rtrim( Z404EmprDir));
      app.GxWebStd.gx_hidden_field( httpContext, "Z403EmprCpo", GXutil.rtrim( Z403EmprCpo));
      app.GxWebStd.gx_hidden_field( httpContext, "Z408EmprPob", GXutil.rtrim( Z408EmprPob));
      app.GxWebStd.gx_hidden_field( httpContext, "Z395EmprCif", GXutil.rtrim( Z395EmprCif));
      app.GxWebStd.gx_hidden_field( httpContext, "Z409EmprTel", GXutil.rtrim( Z409EmprTel));
      app.GxWebStd.gx_hidden_field( httpContext, "Z405EmprFax", GXutil.rtrim( Z405EmprFax));
      app.GxWebStd.gx_hidden_field( httpContext, "Z961Emp1", GXutil.rtrim( Z961Emp1));
      app.GxWebStd.gx_hidden_field( httpContext, "Z962Emp0", GXutil.rtrim( Z962Emp0));
      app.GxWebStd.gx_hidden_field( httpContext, "Z963Ser1", GXutil.rtrim( Z963Ser1));
      app.GxWebStd.gx_hidden_field( httpContext, "Z964Ser0", GXutil.rtrim( Z964Ser0));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2387Ser2", GXutil.rtrim( Z2387Ser2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2388Ser20", GXutil.rtrim( Z2388Ser20));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2389Ser3", GXutil.rtrim( Z2389Ser3));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2390Ser30", GXutil.rtrim( Z2390Ser30));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3915EmpNumDec", GXutil.ltrim( localUtil.ntoc( Z3915EmpNumDec, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7209Colombia", GXutil.ltrim( localUtil.ntoc( Z7209Colombia, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8334EmpItm1", GXutil.rtrim( Z8334EmpItm1));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8335EmpItm2", GXutil.rtrim( Z8335EmpItm2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8336EmpItm3", GXutil.rtrim( Z8336EmpItm3));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8337EmpItm4", GXutil.rtrim( Z8337EmpItm4));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8338EmpItm5", GXutil.rtrim( Z8338EmpItm5));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11516EmpItm6", GXutil.rtrim( Z11516EmpItm6));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12702EmpItm7", GXutil.rtrim( Z12702EmpItm7));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14826EmpKey", Z14826EmpKey);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14827EmpToken", Z14827EmpToken);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14828EmpEnv", Z14828EmpEnv);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14829EmpProd", Z14829EmpProd);
      app.GxWebStd.gx_hidden_field( httpContext, "Z953IvaCod", GXutil.rtrim( Z953IvaCod));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "N953IvaCod", GXutil.rtrim( A953IvaCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTRNCONTEXT", AV41TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTRNCONTEXT", AV41TrnContext);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTRNCONTEXT", getSecureSignedToken( "", AV41TrnContext));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV35EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV35EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_IVACOD", GXutil.rtrim( AV43Insert_IvaCod));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPKEY", A14826EmpKey);
      app.GxWebStd.gx_hidden_field( httpContext, "EMPTOKEN", A14827EmpToken);
      app.GxWebStd.gx_hidden_field( httpContext, "EMPENV", A14828EmpEnv);
      app.GxWebStd.gx_hidden_field( httpContext, "EMPPROD", A14829EmpProd);
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
      app.GxWebStd.gx_hidden_field( httpContext, "GXUITABSPANEL_TABS_Objectcall", GXutil.rtrim( Gxuitabspanel_tabs_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "GXUITABSPANEL_TABS_Enabled", GXutil.booltostr( Gxuitabspanel_tabs_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "GXUITABSPANEL_TABS_Pagecount", GXutil.ltrim( localUtil.ntoc( Gxuitabspanel_tabs_Pagecount, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXUITABSPANEL_TABS_Class", GXutil.rtrim( Gxuitabspanel_tabs_Class));
      app.GxWebStd.gx_hidden_field( httpContext, "GXUITABSPANEL_TABS_Historymanagement", GXutil.booltostr( Gxuitabspanel_tabs_Historymanagement));
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
      return formatLink("app.tempres", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV35EmprCod))}, new String[] {"Gx_mode","EmprCod"})  ;
   }

   public String getPgmname( )
   {
      return "TEMPRES" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "EMPRESAS", "") ;
   }

   public void initializeNonKey0Y27( )
   {
      A953IvaCod = "" ;
      n953IvaCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A953IvaCod", A953IvaCod);
      A5468Refugio = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A5468Refugio", GXutil.str( A5468Refugio, 1, 0));
      A407EmprNom = "" ;
      n407EmprNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      A404EmprDir = "" ;
      n404EmprDir = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A404EmprDir", A404EmprDir);
      A403EmprCpo = "" ;
      n403EmprCpo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A403EmprCpo", A403EmprCpo);
      A408EmprPob = "" ;
      n408EmprPob = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A408EmprPob", A408EmprPob);
      A395EmprCif = "" ;
      n395EmprCif = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A395EmprCif", A395EmprCif);
      A409EmprTel = "" ;
      n409EmprTel = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A409EmprTel", A409EmprTel);
      A405EmprFax = "" ;
      n405EmprFax = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A405EmprFax", A405EmprFax);
      A954IvaDsc = "" ;
      n954IvaDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A954IvaDsc", A954IvaDsc);
      A588IvaPor = (byte)(0) ;
      n588IvaPor = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A588IvaPor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A588IvaPor), 2, 0));
      A589IvaRec = DecimalUtil.ZERO ;
      n589IvaRec = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A589IvaRec", GXutil.ltrimstr( A589IvaRec, 7, 3));
      A961Emp1 = "" ;
      n961Emp1 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A961Emp1", A961Emp1);
      A962Emp0 = "" ;
      n962Emp0 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A962Emp0", A962Emp0);
      A963Ser1 = "" ;
      n963Ser1 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A963Ser1", A963Ser1);
      A964Ser0 = "" ;
      n964Ser0 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A964Ser0", A964Ser0);
      A2387Ser2 = "" ;
      n2387Ser2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A2387Ser2", A2387Ser2);
      A2388Ser20 = "" ;
      n2388Ser20 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A2388Ser20", A2388Ser20);
      A2389Ser3 = "" ;
      n2389Ser3 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A2389Ser3", A2389Ser3);
      A2390Ser30 = "" ;
      n2390Ser30 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A2390Ser30", A2390Ser30);
      A3915EmpNumDec = (byte)(0) ;
      n3915EmpNumDec = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3915EmpNumDec", GXutil.str( A3915EmpNumDec, 1, 0));
      A7209Colombia = (byte)(0) ;
      n7209Colombia = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7209Colombia", GXutil.str( A7209Colombia, 1, 0));
      A8334EmpItm1 = "" ;
      n8334EmpItm1 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8334EmpItm1", A8334EmpItm1);
      A8335EmpItm2 = "" ;
      n8335EmpItm2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8335EmpItm2", A8335EmpItm2);
      A8336EmpItm3 = "" ;
      n8336EmpItm3 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8336EmpItm3", A8336EmpItm3);
      A8337EmpItm4 = "" ;
      n8337EmpItm4 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8337EmpItm4", A8337EmpItm4);
      A8338EmpItm5 = "" ;
      n8338EmpItm5 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8338EmpItm5", A8338EmpItm5);
      A11516EmpItm6 = "" ;
      n11516EmpItm6 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11516EmpItm6", A11516EmpItm6);
      A12702EmpItm7 = "" ;
      n12702EmpItm7 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12702EmpItm7", A12702EmpItm7);
      A14826EmpKey = "" ;
      n14826EmpKey = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14826EmpKey", A14826EmpKey);
      A14827EmpToken = "" ;
      n14827EmpToken = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14827EmpToken", A14827EmpToken);
      A14828EmpEnv = "" ;
      n14828EmpEnv = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14828EmpEnv", A14828EmpEnv);
      A14829EmpProd = "" ;
      n14829EmpProd = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14829EmpProd", A14829EmpProd);
      Z407EmprNom = "" ;
      Z404EmprDir = "" ;
      Z403EmprCpo = "" ;
      Z408EmprPob = "" ;
      Z395EmprCif = "" ;
      Z409EmprTel = "" ;
      Z405EmprFax = "" ;
      Z961Emp1 = "" ;
      Z962Emp0 = "" ;
      Z963Ser1 = "" ;
      Z964Ser0 = "" ;
      Z2387Ser2 = "" ;
      Z2388Ser20 = "" ;
      Z2389Ser3 = "" ;
      Z2390Ser30 = "" ;
      Z3915EmpNumDec = (byte)(0) ;
      Z7209Colombia = (byte)(0) ;
      Z8334EmpItm1 = "" ;
      Z8335EmpItm2 = "" ;
      Z8336EmpItm3 = "" ;
      Z8337EmpItm4 = "" ;
      Z8338EmpItm5 = "" ;
      Z11516EmpItm6 = "" ;
      Z12702EmpItm7 = "" ;
      Z14826EmpKey = "" ;
      Z14827EmpToken = "" ;
      Z14828EmpEnv = "" ;
      Z14829EmpProd = "" ;
      Z953IvaCod = "" ;
   }

   public void initAll0Y27( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      initializeNonKey0Y27( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?2026824152516", true, true);
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
      httpContext.AddJavascriptSource("tempres.js", "?2026824152517", false, true);
      httpContext.AddJavascriptSource("Shared/HistoryManager/HistoryManager.js", "", false, true);
      httpContext.AddJavascriptSource("Shared/HistoryManager/rsh/json2005.js", "", false, true);
      httpContext.AddJavascriptSource("Shared/HistoryManager/rsh/rsh.js", "", false, true);
      httpContext.AddJavascriptSource("Shared/HistoryManager/HistoryManagerCreate.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("Tab/TabRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      edtEmprCod_Internalname = "EMPRCOD" ;
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      divUnnamedtable5_Internalname = "UNNAMEDTABLE5" ;
      edtEmprDir_Internalname = "EMPRDIR" ;
      divUnnamedtable6_Internalname = "UNNAMEDTABLE6" ;
      edtEmprCpo_Internalname = "EMPRCPO" ;
      divUnnamedtable7_Internalname = "UNNAMEDTABLE7" ;
      edtEmprPob_Internalname = "EMPRPOB" ;
      divUnnamedtable8_Internalname = "UNNAMEDTABLE8" ;
      edtEmprCif_Internalname = "EMPRCIF" ;
      divUnnamedtable9_Internalname = "UNNAMEDTABLE9" ;
      edtEmprTel_Internalname = "EMPRTEL" ;
      divUnnamedtable10_Internalname = "UNNAMEDTABLE10" ;
      edtEmprFax_Internalname = "EMPRFAX" ;
      divUnnamedtable11_Internalname = "UNNAMEDTABLE11" ;
      edtEmpNumDec_Internalname = "EMPNUMDEC" ;
      divUnnamedtable12_Internalname = "UNNAMEDTABLE12" ;
      edtIvaCod_Internalname = "IVACOD" ;
      edtIvaDsc_Internalname = "IVADSC" ;
      edtIvaPor_Internalname = "IVAPOR" ;
      edtIvaRec_Internalname = "IVAREC" ;
      divUnnamedtable13_Internalname = "UNNAMEDTABLE13" ;
      edtRefugio_Internalname = "REFUGIO" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      lblTabs1_title_Internalname = "TABS1_TITLE" ;
      edtEmp1_Internalname = "EMP1" ;
      edtEmp0_Internalname = "EMP0" ;
      edtSer1_Internalname = "SER1" ;
      edtSer0_Internalname = "SER0" ;
      edtSer2_Internalname = "SER2" ;
      edtSer20_Internalname = "SER20" ;
      edtSer3_Internalname = "SER3" ;
      edtSer30_Internalname = "SER30" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      lblTabs2_title_Internalname = "TABS2_TITLE" ;
      edtEmpItm1_Internalname = "EMPITM1" ;
      edtEmpItm2_Internalname = "EMPITM2" ;
      edtEmpItm3_Internalname = "EMPITM3" ;
      edtEmpItm4_Internalname = "EMPITM4" ;
      edtEmpItm5_Internalname = "EMPITM5" ;
      edtEmpItm6_Internalname = "EMPITM6" ;
      edtEmpItm7_Internalname = "EMPITM7" ;
      chkColombia.setInternalname( "COLOMBIA" );
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      Gxuitabspanel_tabs_Internalname = "GXUITABSPANEL_TABS" ;
      tblUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = "DVPANEL_UNNAMEDTABLE1" ;
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
      Form.setCaption( httpContext.getMessage( "EMPRESAS", "") );
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      bttBtntrn_delete_Enabled = 0 ;
      bttBtntrn_delete_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      chkColombia.setEnabled( 1 );
      edtEmpItm7_Jsonclick = "" ;
      edtEmpItm7_Enabled = 1 ;
      edtEmpItm6_Jsonclick = "" ;
      edtEmpItm6_Enabled = 1 ;
      edtEmpItm5_Jsonclick = "" ;
      edtEmpItm5_Enabled = 1 ;
      edtEmpItm4_Jsonclick = "" ;
      edtEmpItm4_Enabled = 1 ;
      edtEmpItm3_Jsonclick = "" ;
      edtEmpItm3_Enabled = 1 ;
      edtEmpItm2_Jsonclick = "" ;
      edtEmpItm2_Enabled = 1 ;
      edtEmpItm1_Jsonclick = "" ;
      edtEmpItm1_Enabled = 1 ;
      edtSer30_Jsonclick = "" ;
      edtSer30_Enabled = 1 ;
      edtSer3_Jsonclick = "" ;
      edtSer3_Enabled = 1 ;
      edtSer20_Jsonclick = "" ;
      edtSer20_Enabled = 1 ;
      edtSer2_Jsonclick = "" ;
      edtSer2_Enabled = 1 ;
      edtSer0_Jsonclick = "" ;
      edtSer0_Enabled = 1 ;
      edtSer1_Jsonclick = "" ;
      edtSer1_Enabled = 1 ;
      edtEmp0_Jsonclick = "" ;
      edtEmp0_Enabled = 1 ;
      edtEmp1_Jsonclick = "" ;
      edtEmp1_Enabled = 1 ;
      Gxuitabspanel_tabs_Historymanagement = GXutil.toBoolean( 0) ;
      Gxuitabspanel_tabs_Class = "" ;
      Gxuitabspanel_tabs_Pagecount = 2 ;
      Dvpanel_unnamedtable1_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Iconposition = "Right" ;
      Dvpanel_unnamedtable1_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Title = "" ;
      Dvpanel_unnamedtable1_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable1_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Width = "100%" ;
      edtRefugio_Jsonclick = "" ;
      edtRefugio_Enabled = 0 ;
      edtIvaRec_Jsonclick = "" ;
      edtIvaRec_Enabled = 0 ;
      edtIvaPor_Jsonclick = "" ;
      edtIvaPor_Enabled = 0 ;
      edtIvaDsc_Jsonclick = "" ;
      edtIvaDsc_Enabled = 0 ;
      edtIvaCod_Jsonclick = "" ;
      edtIvaCod_Enabled = 1 ;
      edtEmpNumDec_Jsonclick = "" ;
      edtEmpNumDec_Enabled = 1 ;
      edtEmprFax_Jsonclick = "" ;
      edtEmprFax_Enabled = 1 ;
      edtEmprTel_Jsonclick = "" ;
      edtEmprTel_Enabled = 1 ;
      edtEmprCif_Jsonclick = "" ;
      edtEmprCif_Enabled = 1 ;
      edtEmprPob_Jsonclick = "" ;
      edtEmprPob_Enabled = 1 ;
      edtEmprCpo_Jsonclick = "" ;
      edtEmprCpo_Enabled = 1 ;
      edtEmprDir_Jsonclick = "" ;
      edtEmprDir_Enabled = 1 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Enabled = 1 ;
      edtEmprCod_Jsonclick = "" ;
      edtEmprCod_Enabled = 1 ;
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

   public void xc_16_0Y27( )
   {
      if ( true /* After */ || true /* After */ )
      {
         httpContext.wjLoc = formatLink("app.temppar", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A407EmprNom))}, new String[] {"Mode","EmprCod","EmprNom"})  ;
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

   public void init_web_controls( )
   {
      chkColombia.setName( "COLOMBIA" );
      chkColombia.setWebtags( "" );
      chkColombia.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkColombia.getInternalname(), "TitleCaption", chkColombia.getCaption(), true);
      chkColombia.setCheckedValue( "0" );
      A7209Colombia = (byte)(((GXutil.strcmp(GXutil.ltrim( localUtil.ntoc( A7209Colombia, (byte)(1), (byte)(0), ".", "")), "1")==0) ? 1 : 0)) ;
      n7209Colombia = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7209Colombia", GXutil.str( A7209Colombia, 1, 0));
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
      GXt_int6 = A5468Refugio ;
      GXv_int7[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "REFUGI", ""), GXv_int7) ;
      tempres_impl.this.GXt_int6 = GXv_int7[0] ;
      A5468Refugio = GXt_int6 ;
      if ( (GXutil.strcmp("", A396EmprCod)==0) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "ATENCION!! Debe introducir Código", ""), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A5468Refugio", GXutil.ltrim( localUtil.ntoc( A5468Refugio, (byte)(1), (byte)(0), ".", "")));
   }

   public void valid_Ivacod( )
   {
      n953IvaCod = false ;
      n954IvaDsc = false ;
      n588IvaPor = false ;
      n589IvaRec = false ;
      /* Using cursor T000Y13 */
      pr_default.execute(11, new Object[] {Boolean.valueOf(n953IvaCod), A953IvaCod});
      if ( (pr_default.getStatus(11) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TIPIVA", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "IVACOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtIvaCod_Internalname ;
      }
      A954IvaDsc = T000Y13_A954IvaDsc[0] ;
      n954IvaDsc = T000Y13_n954IvaDsc[0] ;
      A588IvaPor = T000Y13_A588IvaPor[0] ;
      n588IvaPor = T000Y13_n588IvaPor[0] ;
      A589IvaRec = T000Y13_A589IvaRec[0] ;
      n589IvaRec = T000Y13_n589IvaRec[0] ;
      pr_default.close(11);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A954IvaDsc", GXutil.rtrim( A954IvaDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A588IvaPor", GXutil.ltrim( localUtil.ntoc( A588IvaPor, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A589IvaRec", GXutil.ltrim( localUtil.ntoc( A589IvaRec, (byte)(7), (byte)(3), ".", "")));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV35EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'A7209Colombia',fld:'COLOMBIA',pic:'9'}]");
      setEventMetadata("ENTER",",oparms:[{av:'A7209Colombia',fld:'COLOMBIA',pic:'9'}]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV41TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true},{av:'AV35EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV51Pgmname',fld:'vPGMNAME',pic:''},{av:'A14826EmpKey',fld:'EMPKEY',pic:''},{av:'A14827EmpToken',fld:'EMPTOKEN',pic:''},{av:'A14828EmpEnv',fld:'EMPENV',pic:''},{av:'A14829EmpProd',fld:'EMPPROD',pic:''},{av:'A7209Colombia',fld:'COLOMBIA',pic:'9'}]");
      setEventMetadata("REFRESH",",oparms:[{av:'A7209Colombia',fld:'COLOMBIA',pic:'9'}]}");
      setEventMetadata("AFTER TRN","{handler:'e120Y2',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV41TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true},{av:'A7209Colombia',fld:'COLOMBIA',pic:'9'}]");
      setEventMetadata("AFTER TRN",",oparms:[{av:'A7209Colombia',fld:'COLOMBIA',pic:'9'}]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A5468Refugio',fld:'REFUGIO',pic:'9'},{av:'A7209Colombia',fld:'COLOMBIA',pic:'9'}]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[{av:'A5468Refugio',fld:'REFUGIO',pic:'9'},{av:'A7209Colombia',fld:'COLOMBIA',pic:'9'}]}");
      setEventMetadata("VALID_EMPRNOM","{handler:'valid_Emprnom',iparms:[{av:'A7209Colombia',fld:'COLOMBIA',pic:'9'}]");
      setEventMetadata("VALID_EMPRNOM",",oparms:[{av:'A7209Colombia',fld:'COLOMBIA',pic:'9'}]}");
      setEventMetadata("VALID_EMPRCIF","{handler:'valid_Emprcif',iparms:[{av:'A7209Colombia',fld:'COLOMBIA',pic:'9'}]");
      setEventMetadata("VALID_EMPRCIF",",oparms:[{av:'A7209Colombia',fld:'COLOMBIA',pic:'9'}]}");
      setEventMetadata("VALID_EMPNUMDEC","{handler:'valid_Empnumdec',iparms:[{av:'A7209Colombia',fld:'COLOMBIA',pic:'9'}]");
      setEventMetadata("VALID_EMPNUMDEC",",oparms:[{av:'A7209Colombia',fld:'COLOMBIA',pic:'9'}]}");
      setEventMetadata("VALID_IVACOD","{handler:'valid_Ivacod',iparms:[{av:'A953IvaCod',fld:'IVACOD',pic:'@!'},{av:'A954IvaDsc',fld:'IVADSC',pic:''},{av:'A588IvaPor',fld:'IVAPOR',pic:'Z9'},{av:'A589IvaRec',fld:'IVAREC',pic:'ZZ9.999'},{av:'A7209Colombia',fld:'COLOMBIA',pic:'9'}]");
      setEventMetadata("VALID_IVACOD",",oparms:[{av:'A954IvaDsc',fld:'IVADSC',pic:''},{av:'A588IvaPor',fld:'IVAPOR',pic:'Z9'},{av:'A589IvaRec',fld:'IVAREC',pic:'ZZ9.999'},{av:'A7209Colombia',fld:'COLOMBIA',pic:'9'}]}");
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
      wcpOAV35EmprCod = "" ;
      Z396EmprCod = "" ;
      Z407EmprNom = "" ;
      Z404EmprDir = "" ;
      Z403EmprCpo = "" ;
      Z408EmprPob = "" ;
      Z395EmprCif = "" ;
      Z409EmprTel = "" ;
      Z405EmprFax = "" ;
      Z961Emp1 = "" ;
      Z962Emp0 = "" ;
      Z963Ser1 = "" ;
      Z964Ser0 = "" ;
      Z2387Ser2 = "" ;
      Z2388Ser20 = "" ;
      Z2389Ser3 = "" ;
      Z2390Ser30 = "" ;
      Z8334EmpItm1 = "" ;
      Z8335EmpItm2 = "" ;
      Z8336EmpItm3 = "" ;
      Z8337EmpItm4 = "" ;
      Z8338EmpItm5 = "" ;
      Z11516EmpItm6 = "" ;
      Z12702EmpItm7 = "" ;
      Z14826EmpKey = "" ;
      Z14827EmpToken = "" ;
      Z14828EmpEnv = "" ;
      Z14829EmpProd = "" ;
      Z953IvaCod = "" ;
      N953IvaCod = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A953IvaCod = "" ;
      Gx_mode = "" ;
      AV35EmprCod = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      A396EmprCod = "" ;
      A407EmprNom = "" ;
      A404EmprDir = "" ;
      A403EmprCpo = "" ;
      A408EmprPob = "" ;
      A395EmprCif = "" ;
      A409EmprTel = "" ;
      A405EmprFax = "" ;
      A954IvaDsc = "" ;
      A589IvaRec = DecimalUtil.ZERO ;
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      sStyleString = "" ;
      ucGxuitabspanel_tabs = new com.genexus.webpanels.GXUserControl();
      lblTabs1_title_Jsonclick = "" ;
      A961Emp1 = "" ;
      A962Emp0 = "" ;
      A963Ser1 = "" ;
      A964Ser0 = "" ;
      A2387Ser2 = "" ;
      A2388Ser20 = "" ;
      A2389Ser3 = "" ;
      A2390Ser30 = "" ;
      lblTabs2_title_Jsonclick = "" ;
      A8334EmpItm1 = "" ;
      A8335EmpItm2 = "" ;
      A8336EmpItm3 = "" ;
      A8337EmpItm4 = "" ;
      A8338EmpItm5 = "" ;
      A11516EmpItm6 = "" ;
      A12702EmpItm7 = "" ;
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      AV51Pgmname = "" ;
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      A14826EmpKey = "" ;
      A14827EmpToken = "" ;
      A14828EmpEnv = "" ;
      A14829EmpProd = "" ;
      AV43Insert_IvaCod = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      Gxuitabspanel_tabs_Objectcall = "" ;
      Gxuitabspanel_tabs_Activepagecontrolname = "" ;
      Dvpanel_unnamedtable1_Objectcall = "" ;
      Dvpanel_unnamedtable1_Class = "" ;
      Dvpanel_unnamedtable1_Height = "" ;
      Datamonjs_Objectcall = "" ;
      Datamonjs_Class = "" ;
      Datamonjs_Paramstr = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode27 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      AV37Station = "" ;
      AV36EmprNom = "" ;
      AV29UsurCod = "" ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      AV40WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext5 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV41TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV42WebSession = httpContext.getWebSession();
      AV44TrnContextAtt = new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      Z954IvaDsc = "" ;
      Z589IvaRec = DecimalUtil.ZERO ;
      T000Y4_A954IvaDsc = new String[] {""} ;
      T000Y4_n954IvaDsc = new boolean[] {false} ;
      T000Y4_A588IvaPor = new byte[1] ;
      T000Y4_n588IvaPor = new boolean[] {false} ;
      T000Y4_A589IvaRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T000Y4_n589IvaRec = new boolean[] {false} ;
      T000Y5_A396EmprCod = new String[] {""} ;
      T000Y5_A407EmprNom = new String[] {""} ;
      T000Y5_n407EmprNom = new boolean[] {false} ;
      T000Y5_A404EmprDir = new String[] {""} ;
      T000Y5_n404EmprDir = new boolean[] {false} ;
      T000Y5_A403EmprCpo = new String[] {""} ;
      T000Y5_n403EmprCpo = new boolean[] {false} ;
      T000Y5_A408EmprPob = new String[] {""} ;
      T000Y5_n408EmprPob = new boolean[] {false} ;
      T000Y5_A395EmprCif = new String[] {""} ;
      T000Y5_n395EmprCif = new boolean[] {false} ;
      T000Y5_A409EmprTel = new String[] {""} ;
      T000Y5_n409EmprTel = new boolean[] {false} ;
      T000Y5_A405EmprFax = new String[] {""} ;
      T000Y5_n405EmprFax = new boolean[] {false} ;
      T000Y5_A954IvaDsc = new String[] {""} ;
      T000Y5_n954IvaDsc = new boolean[] {false} ;
      T000Y5_A588IvaPor = new byte[1] ;
      T000Y5_n588IvaPor = new boolean[] {false} ;
      T000Y5_A589IvaRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T000Y5_n589IvaRec = new boolean[] {false} ;
      T000Y5_A961Emp1 = new String[] {""} ;
      T000Y5_n961Emp1 = new boolean[] {false} ;
      T000Y5_A962Emp0 = new String[] {""} ;
      T000Y5_n962Emp0 = new boolean[] {false} ;
      T000Y5_A963Ser1 = new String[] {""} ;
      T000Y5_n963Ser1 = new boolean[] {false} ;
      T000Y5_A964Ser0 = new String[] {""} ;
      T000Y5_n964Ser0 = new boolean[] {false} ;
      T000Y5_A2387Ser2 = new String[] {""} ;
      T000Y5_n2387Ser2 = new boolean[] {false} ;
      T000Y5_A2388Ser20 = new String[] {""} ;
      T000Y5_n2388Ser20 = new boolean[] {false} ;
      T000Y5_A2389Ser3 = new String[] {""} ;
      T000Y5_n2389Ser3 = new boolean[] {false} ;
      T000Y5_A2390Ser30 = new String[] {""} ;
      T000Y5_n2390Ser30 = new boolean[] {false} ;
      T000Y5_A3915EmpNumDec = new byte[1] ;
      T000Y5_n3915EmpNumDec = new boolean[] {false} ;
      T000Y5_A7209Colombia = new byte[1] ;
      T000Y5_n7209Colombia = new boolean[] {false} ;
      T000Y5_A8334EmpItm1 = new String[] {""} ;
      T000Y5_n8334EmpItm1 = new boolean[] {false} ;
      T000Y5_A8335EmpItm2 = new String[] {""} ;
      T000Y5_n8335EmpItm2 = new boolean[] {false} ;
      T000Y5_A8336EmpItm3 = new String[] {""} ;
      T000Y5_n8336EmpItm3 = new boolean[] {false} ;
      T000Y5_A8337EmpItm4 = new String[] {""} ;
      T000Y5_n8337EmpItm4 = new boolean[] {false} ;
      T000Y5_A8338EmpItm5 = new String[] {""} ;
      T000Y5_n8338EmpItm5 = new boolean[] {false} ;
      T000Y5_A11516EmpItm6 = new String[] {""} ;
      T000Y5_n11516EmpItm6 = new boolean[] {false} ;
      T000Y5_A12702EmpItm7 = new String[] {""} ;
      T000Y5_n12702EmpItm7 = new boolean[] {false} ;
      T000Y5_A14826EmpKey = new String[] {""} ;
      T000Y5_n14826EmpKey = new boolean[] {false} ;
      T000Y5_A14827EmpToken = new String[] {""} ;
      T000Y5_n14827EmpToken = new boolean[] {false} ;
      T000Y5_A14828EmpEnv = new String[] {""} ;
      T000Y5_n14828EmpEnv = new boolean[] {false} ;
      T000Y5_A14829EmpProd = new String[] {""} ;
      T000Y5_n14829EmpProd = new boolean[] {false} ;
      T000Y5_A953IvaCod = new String[] {""} ;
      T000Y5_n953IvaCod = new boolean[] {false} ;
      T000Y6_A954IvaDsc = new String[] {""} ;
      T000Y6_n954IvaDsc = new boolean[] {false} ;
      T000Y6_A588IvaPor = new byte[1] ;
      T000Y6_n588IvaPor = new boolean[] {false} ;
      T000Y6_A589IvaRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T000Y6_n589IvaRec = new boolean[] {false} ;
      T000Y7_A396EmprCod = new String[] {""} ;
      T000Y3_A396EmprCod = new String[] {""} ;
      T000Y3_A407EmprNom = new String[] {""} ;
      T000Y3_n407EmprNom = new boolean[] {false} ;
      T000Y3_A404EmprDir = new String[] {""} ;
      T000Y3_n404EmprDir = new boolean[] {false} ;
      T000Y3_A403EmprCpo = new String[] {""} ;
      T000Y3_n403EmprCpo = new boolean[] {false} ;
      T000Y3_A408EmprPob = new String[] {""} ;
      T000Y3_n408EmprPob = new boolean[] {false} ;
      T000Y3_A395EmprCif = new String[] {""} ;
      T000Y3_n395EmprCif = new boolean[] {false} ;
      T000Y3_A409EmprTel = new String[] {""} ;
      T000Y3_n409EmprTel = new boolean[] {false} ;
      T000Y3_A405EmprFax = new String[] {""} ;
      T000Y3_n405EmprFax = new boolean[] {false} ;
      T000Y3_A961Emp1 = new String[] {""} ;
      T000Y3_n961Emp1 = new boolean[] {false} ;
      T000Y3_A962Emp0 = new String[] {""} ;
      T000Y3_n962Emp0 = new boolean[] {false} ;
      T000Y3_A963Ser1 = new String[] {""} ;
      T000Y3_n963Ser1 = new boolean[] {false} ;
      T000Y3_A964Ser0 = new String[] {""} ;
      T000Y3_n964Ser0 = new boolean[] {false} ;
      T000Y3_A2387Ser2 = new String[] {""} ;
      T000Y3_n2387Ser2 = new boolean[] {false} ;
      T000Y3_A2388Ser20 = new String[] {""} ;
      T000Y3_n2388Ser20 = new boolean[] {false} ;
      T000Y3_A2389Ser3 = new String[] {""} ;
      T000Y3_n2389Ser3 = new boolean[] {false} ;
      T000Y3_A2390Ser30 = new String[] {""} ;
      T000Y3_n2390Ser30 = new boolean[] {false} ;
      T000Y3_A3915EmpNumDec = new byte[1] ;
      T000Y3_n3915EmpNumDec = new boolean[] {false} ;
      T000Y3_A7209Colombia = new byte[1] ;
      T000Y3_n7209Colombia = new boolean[] {false} ;
      T000Y3_A8334EmpItm1 = new String[] {""} ;
      T000Y3_n8334EmpItm1 = new boolean[] {false} ;
      T000Y3_A8335EmpItm2 = new String[] {""} ;
      T000Y3_n8335EmpItm2 = new boolean[] {false} ;
      T000Y3_A8336EmpItm3 = new String[] {""} ;
      T000Y3_n8336EmpItm3 = new boolean[] {false} ;
      T000Y3_A8337EmpItm4 = new String[] {""} ;
      T000Y3_n8337EmpItm4 = new boolean[] {false} ;
      T000Y3_A8338EmpItm5 = new String[] {""} ;
      T000Y3_n8338EmpItm5 = new boolean[] {false} ;
      T000Y3_A11516EmpItm6 = new String[] {""} ;
      T000Y3_n11516EmpItm6 = new boolean[] {false} ;
      T000Y3_A12702EmpItm7 = new String[] {""} ;
      T000Y3_n12702EmpItm7 = new boolean[] {false} ;
      T000Y3_A14826EmpKey = new String[] {""} ;
      T000Y3_n14826EmpKey = new boolean[] {false} ;
      T000Y3_A14827EmpToken = new String[] {""} ;
      T000Y3_n14827EmpToken = new boolean[] {false} ;
      T000Y3_A14828EmpEnv = new String[] {""} ;
      T000Y3_n14828EmpEnv = new boolean[] {false} ;
      T000Y3_A14829EmpProd = new String[] {""} ;
      T000Y3_n14829EmpProd = new boolean[] {false} ;
      T000Y3_A953IvaCod = new String[] {""} ;
      T000Y3_n953IvaCod = new boolean[] {false} ;
      T000Y8_A396EmprCod = new String[] {""} ;
      T000Y9_A396EmprCod = new String[] {""} ;
      T000Y2_A396EmprCod = new String[] {""} ;
      T000Y2_A407EmprNom = new String[] {""} ;
      T000Y2_n407EmprNom = new boolean[] {false} ;
      T000Y2_A404EmprDir = new String[] {""} ;
      T000Y2_n404EmprDir = new boolean[] {false} ;
      T000Y2_A403EmprCpo = new String[] {""} ;
      T000Y2_n403EmprCpo = new boolean[] {false} ;
      T000Y2_A408EmprPob = new String[] {""} ;
      T000Y2_n408EmprPob = new boolean[] {false} ;
      T000Y2_A395EmprCif = new String[] {""} ;
      T000Y2_n395EmprCif = new boolean[] {false} ;
      T000Y2_A409EmprTel = new String[] {""} ;
      T000Y2_n409EmprTel = new boolean[] {false} ;
      T000Y2_A405EmprFax = new String[] {""} ;
      T000Y2_n405EmprFax = new boolean[] {false} ;
      T000Y2_A961Emp1 = new String[] {""} ;
      T000Y2_n961Emp1 = new boolean[] {false} ;
      T000Y2_A962Emp0 = new String[] {""} ;
      T000Y2_n962Emp0 = new boolean[] {false} ;
      T000Y2_A963Ser1 = new String[] {""} ;
      T000Y2_n963Ser1 = new boolean[] {false} ;
      T000Y2_A964Ser0 = new String[] {""} ;
      T000Y2_n964Ser0 = new boolean[] {false} ;
      T000Y2_A2387Ser2 = new String[] {""} ;
      T000Y2_n2387Ser2 = new boolean[] {false} ;
      T000Y2_A2388Ser20 = new String[] {""} ;
      T000Y2_n2388Ser20 = new boolean[] {false} ;
      T000Y2_A2389Ser3 = new String[] {""} ;
      T000Y2_n2389Ser3 = new boolean[] {false} ;
      T000Y2_A2390Ser30 = new String[] {""} ;
      T000Y2_n2390Ser30 = new boolean[] {false} ;
      T000Y2_A3915EmpNumDec = new byte[1] ;
      T000Y2_n3915EmpNumDec = new boolean[] {false} ;
      T000Y2_A7209Colombia = new byte[1] ;
      T000Y2_n7209Colombia = new boolean[] {false} ;
      T000Y2_A8334EmpItm1 = new String[] {""} ;
      T000Y2_n8334EmpItm1 = new boolean[] {false} ;
      T000Y2_A8335EmpItm2 = new String[] {""} ;
      T000Y2_n8335EmpItm2 = new boolean[] {false} ;
      T000Y2_A8336EmpItm3 = new String[] {""} ;
      T000Y2_n8336EmpItm3 = new boolean[] {false} ;
      T000Y2_A8337EmpItm4 = new String[] {""} ;
      T000Y2_n8337EmpItm4 = new boolean[] {false} ;
      T000Y2_A8338EmpItm5 = new String[] {""} ;
      T000Y2_n8338EmpItm5 = new boolean[] {false} ;
      T000Y2_A11516EmpItm6 = new String[] {""} ;
      T000Y2_n11516EmpItm6 = new boolean[] {false} ;
      T000Y2_A12702EmpItm7 = new String[] {""} ;
      T000Y2_n12702EmpItm7 = new boolean[] {false} ;
      T000Y2_A14826EmpKey = new String[] {""} ;
      T000Y2_n14826EmpKey = new boolean[] {false} ;
      T000Y2_A14827EmpToken = new String[] {""} ;
      T000Y2_n14827EmpToken = new boolean[] {false} ;
      T000Y2_A14828EmpEnv = new String[] {""} ;
      T000Y2_n14828EmpEnv = new boolean[] {false} ;
      T000Y2_A14829EmpProd = new String[] {""} ;
      T000Y2_n14829EmpProd = new boolean[] {false} ;
      T000Y2_A953IvaCod = new String[] {""} ;
      T000Y2_n953IvaCod = new boolean[] {false} ;
      T000Y13_A954IvaDsc = new String[] {""} ;
      T000Y13_n954IvaDsc = new boolean[] {false} ;
      T000Y13_A588IvaPor = new byte[1] ;
      T000Y13_n588IvaPor = new boolean[] {false} ;
      T000Y13_A589IvaRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T000Y13_n589IvaRec = new boolean[] {false} ;
      T000Y14_A396EmprCod = new String[] {""} ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXv_int7 = new byte[1] ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tempres__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tempres__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tempres__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tempres__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tempres__default(),
         new Object[] {
             new Object[] {
            T000Y2_A396EmprCod, T000Y2_A407EmprNom, T000Y2_n407EmprNom, T000Y2_A404EmprDir, T000Y2_n404EmprDir, T000Y2_A403EmprCpo, T000Y2_n403EmprCpo, T000Y2_A408EmprPob, T000Y2_n408EmprPob, T000Y2_A395EmprCif,
            T000Y2_n395EmprCif, T000Y2_A409EmprTel, T000Y2_n409EmprTel, T000Y2_A405EmprFax, T000Y2_n405EmprFax, T000Y2_A961Emp1, T000Y2_n961Emp1, T000Y2_A962Emp0, T000Y2_n962Emp0, T000Y2_A963Ser1,
            T000Y2_n963Ser1, T000Y2_A964Ser0, T000Y2_n964Ser0, T000Y2_A2387Ser2, T000Y2_n2387Ser2, T000Y2_A2388Ser20, T000Y2_n2388Ser20, T000Y2_A2389Ser3, T000Y2_n2389Ser3, T000Y2_A2390Ser30,
            T000Y2_n2390Ser30, T000Y2_A3915EmpNumDec, T000Y2_n3915EmpNumDec, T000Y2_A7209Colombia, T000Y2_n7209Colombia, T000Y2_A8334EmpItm1, T000Y2_n8334EmpItm1, T000Y2_A8335EmpItm2, T000Y2_n8335EmpItm2, T000Y2_A8336EmpItm3,
            T000Y2_n8336EmpItm3, T000Y2_A8337EmpItm4, T000Y2_n8337EmpItm4, T000Y2_A8338EmpItm5, T000Y2_n8338EmpItm5, T000Y2_A11516EmpItm6, T000Y2_n11516EmpItm6, T000Y2_A12702EmpItm7, T000Y2_n12702EmpItm7, T000Y2_A14826EmpKey,
            T000Y2_n14826EmpKey, T000Y2_A14827EmpToken, T000Y2_n14827EmpToken, T000Y2_A14828EmpEnv, T000Y2_n14828EmpEnv, T000Y2_A14829EmpProd, T000Y2_n14829EmpProd, T000Y2_A953IvaCod, T000Y2_n953IvaCod
            }
            , new Object[] {
            T000Y3_A396EmprCod, T000Y3_A407EmprNom, T000Y3_n407EmprNom, T000Y3_A404EmprDir, T000Y3_n404EmprDir, T000Y3_A403EmprCpo, T000Y3_n403EmprCpo, T000Y3_A408EmprPob, T000Y3_n408EmprPob, T000Y3_A395EmprCif,
            T000Y3_n395EmprCif, T000Y3_A409EmprTel, T000Y3_n409EmprTel, T000Y3_A405EmprFax, T000Y3_n405EmprFax, T000Y3_A961Emp1, T000Y3_n961Emp1, T000Y3_A962Emp0, T000Y3_n962Emp0, T000Y3_A963Ser1,
            T000Y3_n963Ser1, T000Y3_A964Ser0, T000Y3_n964Ser0, T000Y3_A2387Ser2, T000Y3_n2387Ser2, T000Y3_A2388Ser20, T000Y3_n2388Ser20, T000Y3_A2389Ser3, T000Y3_n2389Ser3, T000Y3_A2390Ser30,
            T000Y3_n2390Ser30, T000Y3_A3915EmpNumDec, T000Y3_n3915EmpNumDec, T000Y3_A7209Colombia, T000Y3_n7209Colombia, T000Y3_A8334EmpItm1, T000Y3_n8334EmpItm1, T000Y3_A8335EmpItm2, T000Y3_n8335EmpItm2, T000Y3_A8336EmpItm3,
            T000Y3_n8336EmpItm3, T000Y3_A8337EmpItm4, T000Y3_n8337EmpItm4, T000Y3_A8338EmpItm5, T000Y3_n8338EmpItm5, T000Y3_A11516EmpItm6, T000Y3_n11516EmpItm6, T000Y3_A12702EmpItm7, T000Y3_n12702EmpItm7, T000Y3_A14826EmpKey,
            T000Y3_n14826EmpKey, T000Y3_A14827EmpToken, T000Y3_n14827EmpToken, T000Y3_A14828EmpEnv, T000Y3_n14828EmpEnv, T000Y3_A14829EmpProd, T000Y3_n14829EmpProd, T000Y3_A953IvaCod, T000Y3_n953IvaCod
            }
            , new Object[] {
            T000Y4_A954IvaDsc, T000Y4_n954IvaDsc, T000Y4_A588IvaPor, T000Y4_n588IvaPor, T000Y4_A589IvaRec, T000Y4_n589IvaRec
            }
            , new Object[] {
            T000Y5_A396EmprCod, T000Y5_A407EmprNom, T000Y5_n407EmprNom, T000Y5_A404EmprDir, T000Y5_n404EmprDir, T000Y5_A403EmprCpo, T000Y5_n403EmprCpo, T000Y5_A408EmprPob, T000Y5_n408EmprPob, T000Y5_A395EmprCif,
            T000Y5_n395EmprCif, T000Y5_A409EmprTel, T000Y5_n409EmprTel, T000Y5_A405EmprFax, T000Y5_n405EmprFax, T000Y5_A954IvaDsc, T000Y5_n954IvaDsc, T000Y5_A588IvaPor, T000Y5_n588IvaPor, T000Y5_A589IvaRec,
            T000Y5_n589IvaRec, T000Y5_A961Emp1, T000Y5_n961Emp1, T000Y5_A962Emp0, T000Y5_n962Emp0, T000Y5_A963Ser1, T000Y5_n963Ser1, T000Y5_A964Ser0, T000Y5_n964Ser0, T000Y5_A2387Ser2,
            T000Y5_n2387Ser2, T000Y5_A2388Ser20, T000Y5_n2388Ser20, T000Y5_A2389Ser3, T000Y5_n2389Ser3, T000Y5_A2390Ser30, T000Y5_n2390Ser30, T000Y5_A3915EmpNumDec, T000Y5_n3915EmpNumDec, T000Y5_A7209Colombia,
            T000Y5_n7209Colombia, T000Y5_A8334EmpItm1, T000Y5_n8334EmpItm1, T000Y5_A8335EmpItm2, T000Y5_n8335EmpItm2, T000Y5_A8336EmpItm3, T000Y5_n8336EmpItm3, T000Y5_A8337EmpItm4, T000Y5_n8337EmpItm4, T000Y5_A8338EmpItm5,
            T000Y5_n8338EmpItm5, T000Y5_A11516EmpItm6, T000Y5_n11516EmpItm6, T000Y5_A12702EmpItm7, T000Y5_n12702EmpItm7, T000Y5_A14826EmpKey, T000Y5_n14826EmpKey, T000Y5_A14827EmpToken, T000Y5_n14827EmpToken, T000Y5_A14828EmpEnv,
            T000Y5_n14828EmpEnv, T000Y5_A14829EmpProd, T000Y5_n14829EmpProd, T000Y5_A953IvaCod, T000Y5_n953IvaCod
            }
            , new Object[] {
            T000Y6_A954IvaDsc, T000Y6_n954IvaDsc, T000Y6_A588IvaPor, T000Y6_n588IvaPor, T000Y6_A589IvaRec, T000Y6_n589IvaRec
            }
            , new Object[] {
            T000Y7_A396EmprCod
            }
            , new Object[] {
            T000Y8_A396EmprCod
            }
            , new Object[] {
            T000Y9_A396EmprCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T000Y13_A954IvaDsc, T000Y13_n954IvaDsc, T000Y13_A588IvaPor, T000Y13_n588IvaPor, T000Y13_A589IvaRec, T000Y13_n589IvaRec
            }
            , new Object[] {
            T000Y14_A396EmprCod
            }
         }
      );
      AV51Pgmname = "TEMPRES" ;
   }

   private byte Z3915EmpNumDec ;
   private byte Z7209Colombia ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A7209Colombia ;
   private byte A3915EmpNumDec ;
   private byte A588IvaPor ;
   private byte A5468Refugio ;
   private byte Z588IvaPor ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private byte GXt_int6 ;
   private byte GXv_int7[] ;
   private byte Z5468Refugio ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound27 ;
   private short nIsDirty_27 ;
   private int trnEnded ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtEmprDir_Enabled ;
   private int edtEmprCpo_Enabled ;
   private int edtEmprPob_Enabled ;
   private int edtEmprCif_Enabled ;
   private int edtEmprTel_Enabled ;
   private int edtEmprFax_Enabled ;
   private int edtEmpNumDec_Enabled ;
   private int edtIvaCod_Enabled ;
   private int edtIvaDsc_Enabled ;
   private int edtIvaPor_Enabled ;
   private int edtIvaRec_Enabled ;
   private int edtRefugio_Enabled ;
   private int Gxuitabspanel_tabs_Pagecount ;
   private int edtEmp1_Enabled ;
   private int edtEmp0_Enabled ;
   private int edtSer1_Enabled ;
   private int edtSer0_Enabled ;
   private int edtSer2_Enabled ;
   private int edtSer20_Enabled ;
   private int edtSer3_Enabled ;
   private int edtSer30_Enabled ;
   private int edtEmpItm1_Enabled ;
   private int edtEmpItm2_Enabled ;
   private int edtEmpItm3_Enabled ;
   private int edtEmpItm4_Enabled ;
   private int edtEmpItm5_Enabled ;
   private int edtEmpItm6_Enabled ;
   private int edtEmpItm7_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int edtavPgmname_Enabled ;
   private int Dvpanel_tableattributes_Gxcontroltype ;
   private int Gxuitabspanel_tabs_Activepage ;
   private int Dvpanel_unnamedtable1_Gxcontroltype ;
   private int Datamonjs_Gxcontroltype ;
   private int AV52GXV1 ;
   private int GX_JID ;
   private int idxLst ;
   private java.math.BigDecimal A589IvaRec ;
   private java.math.BigDecimal Z589IvaRec ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV35EmprCod ;
   private String Z396EmprCod ;
   private String Z407EmprNom ;
   private String Z404EmprDir ;
   private String Z403EmprCpo ;
   private String Z408EmprPob ;
   private String Z395EmprCif ;
   private String Z409EmprTel ;
   private String Z405EmprFax ;
   private String Z961Emp1 ;
   private String Z962Emp0 ;
   private String Z963Ser1 ;
   private String Z964Ser0 ;
   private String Z2387Ser2 ;
   private String Z2388Ser20 ;
   private String Z2389Ser3 ;
   private String Z2390Ser30 ;
   private String Z8334EmpItm1 ;
   private String Z8335EmpItm2 ;
   private String Z8336EmpItm3 ;
   private String Z8337EmpItm4 ;
   private String Z8338EmpItm5 ;
   private String Z11516EmpItm6 ;
   private String Z12702EmpItm7 ;
   private String Z953IvaCod ;
   private String N953IvaCod ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A953IvaCod ;
   private String Gx_mode ;
   private String AV35EmprCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtEmprCod_Internalname ;
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
   private String divUnnamedtable4_Internalname ;
   private String TempTags ;
   private String A396EmprCod ;
   private String edtEmprCod_Jsonclick ;
   private String divUnnamedtable5_Internalname ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String divUnnamedtable6_Internalname ;
   private String edtEmprDir_Internalname ;
   private String A404EmprDir ;
   private String edtEmprDir_Jsonclick ;
   private String divUnnamedtable7_Internalname ;
   private String edtEmprCpo_Internalname ;
   private String A403EmprCpo ;
   private String edtEmprCpo_Jsonclick ;
   private String divUnnamedtable8_Internalname ;
   private String edtEmprPob_Internalname ;
   private String A408EmprPob ;
   private String edtEmprPob_Jsonclick ;
   private String divUnnamedtable9_Internalname ;
   private String edtEmprCif_Internalname ;
   private String A395EmprCif ;
   private String edtEmprCif_Jsonclick ;
   private String divUnnamedtable10_Internalname ;
   private String edtEmprTel_Internalname ;
   private String A409EmprTel ;
   private String edtEmprTel_Jsonclick ;
   private String divUnnamedtable11_Internalname ;
   private String edtEmprFax_Internalname ;
   private String A405EmprFax ;
   private String edtEmprFax_Jsonclick ;
   private String divUnnamedtable12_Internalname ;
   private String edtEmpNumDec_Internalname ;
   private String edtEmpNumDec_Jsonclick ;
   private String divUnnamedtable13_Internalname ;
   private String edtIvaCod_Internalname ;
   private String edtIvaCod_Jsonclick ;
   private String edtIvaDsc_Internalname ;
   private String A954IvaDsc ;
   private String edtIvaDsc_Jsonclick ;
   private String edtIvaPor_Internalname ;
   private String edtIvaPor_Jsonclick ;
   private String edtIvaRec_Internalname ;
   private String edtIvaRec_Jsonclick ;
   private String edtRefugio_Internalname ;
   private String edtRefugio_Jsonclick ;
   private String Dvpanel_unnamedtable1_Width ;
   private String Dvpanel_unnamedtable1_Cls ;
   private String Dvpanel_unnamedtable1_Title ;
   private String Dvpanel_unnamedtable1_Iconposition ;
   private String Dvpanel_unnamedtable1_Internalname ;
   private String sStyleString ;
   private String tblUnnamedtable1_Internalname ;
   private String Gxuitabspanel_tabs_Class ;
   private String Gxuitabspanel_tabs_Internalname ;
   private String lblTabs1_title_Internalname ;
   private String lblTabs1_title_Jsonclick ;
   private String divUnnamedtable3_Internalname ;
   private String edtEmp1_Internalname ;
   private String A961Emp1 ;
   private String edtEmp1_Jsonclick ;
   private String edtEmp0_Internalname ;
   private String A962Emp0 ;
   private String edtEmp0_Jsonclick ;
   private String edtSer1_Internalname ;
   private String A963Ser1 ;
   private String edtSer1_Jsonclick ;
   private String edtSer0_Internalname ;
   private String A964Ser0 ;
   private String edtSer0_Jsonclick ;
   private String edtSer2_Internalname ;
   private String A2387Ser2 ;
   private String edtSer2_Jsonclick ;
   private String edtSer20_Internalname ;
   private String A2388Ser20 ;
   private String edtSer20_Jsonclick ;
   private String edtSer3_Internalname ;
   private String A2389Ser3 ;
   private String edtSer3_Jsonclick ;
   private String edtSer30_Internalname ;
   private String A2390Ser30 ;
   private String edtSer30_Jsonclick ;
   private String lblTabs2_title_Internalname ;
   private String lblTabs2_title_Jsonclick ;
   private String divUnnamedtable2_Internalname ;
   private String edtEmpItm1_Internalname ;
   private String A8334EmpItm1 ;
   private String edtEmpItm1_Jsonclick ;
   private String edtEmpItm2_Internalname ;
   private String A8335EmpItm2 ;
   private String edtEmpItm2_Jsonclick ;
   private String edtEmpItm3_Internalname ;
   private String A8336EmpItm3 ;
   private String edtEmpItm3_Jsonclick ;
   private String edtEmpItm4_Internalname ;
   private String A8337EmpItm4 ;
   private String edtEmpItm4_Jsonclick ;
   private String edtEmpItm5_Internalname ;
   private String A8338EmpItm5 ;
   private String edtEmpItm5_Jsonclick ;
   private String edtEmpItm6_Internalname ;
   private String A11516EmpItm6 ;
   private String edtEmpItm6_Jsonclick ;
   private String edtEmpItm7_Internalname ;
   private String A12702EmpItm7 ;
   private String edtEmpItm7_Jsonclick ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String edtavPgmname_Internalname ;
   private String AV51Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String AV43Insert_IvaCod ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String Gxuitabspanel_tabs_Objectcall ;
   private String Gxuitabspanel_tabs_Activepagecontrolname ;
   private String Dvpanel_unnamedtable1_Objectcall ;
   private String Dvpanel_unnamedtable1_Class ;
   private String Dvpanel_unnamedtable1_Height ;
   private String Datamonjs_Objectcall ;
   private String Datamonjs_Class ;
   private String Datamonjs_Paramstr ;
   private String hsh ;
   private String sMode27 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String AV37Station ;
   private String AV36EmprNom ;
   private String AV29UsurCod ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String Z954IvaDsc ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n953IvaCod ;
   private boolean wbErr ;
   private boolean n7209Colombia ;
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
   private boolean Gxuitabspanel_tabs_Historymanagement ;
   private boolean n14826EmpKey ;
   private boolean n14827EmpToken ;
   private boolean n14828EmpEnv ;
   private boolean n14829EmpProd ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean Gxuitabspanel_tabs_Enabled ;
   private boolean Gxuitabspanel_tabs_Visible ;
   private boolean Dvpanel_unnamedtable1_Enabled ;
   private boolean Dvpanel_unnamedtable1_Showheader ;
   private boolean Dvpanel_unnamedtable1_Visible ;
   private boolean Datamonjs_Enabled ;
   private boolean Datamonjs_Visible ;
   private boolean n407EmprNom ;
   private boolean n404EmprDir ;
   private boolean n403EmprCpo ;
   private boolean n408EmprPob ;
   private boolean n395EmprCif ;
   private boolean n409EmprTel ;
   private boolean n405EmprFax ;
   private boolean n3915EmpNumDec ;
   private boolean n954IvaDsc ;
   private boolean n588IvaPor ;
   private boolean n589IvaRec ;
   private boolean n961Emp1 ;
   private boolean n962Emp0 ;
   private boolean n963Ser1 ;
   private boolean n964Ser0 ;
   private boolean n2387Ser2 ;
   private boolean n2388Ser20 ;
   private boolean n2389Ser3 ;
   private boolean n2390Ser30 ;
   private boolean n8334EmpItm1 ;
   private boolean n8335EmpItm2 ;
   private boolean n8336EmpItm3 ;
   private boolean n8337EmpItm4 ;
   private boolean n8338EmpItm5 ;
   private boolean n11516EmpItm6 ;
   private boolean n12702EmpItm7 ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private String Z14826EmpKey ;
   private String Z14827EmpToken ;
   private String Z14828EmpEnv ;
   private String Z14829EmpProd ;
   private String A14826EmpKey ;
   private String A14827EmpToken ;
   private String A14828EmpEnv ;
   private String A14829EmpProd ;
   private com.genexus.webpanels.WebSession AV42WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucGxuitabspanel_tabs ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private ICheckbox chkColombia ;
   private IDataStoreProvider pr_default ;
   private String[] T000Y4_A954IvaDsc ;
   private boolean[] T000Y4_n954IvaDsc ;
   private byte[] T000Y4_A588IvaPor ;
   private boolean[] T000Y4_n588IvaPor ;
   private java.math.BigDecimal[] T000Y4_A589IvaRec ;
   private boolean[] T000Y4_n589IvaRec ;
   private String[] T000Y5_A396EmprCod ;
   private String[] T000Y5_A407EmprNom ;
   private boolean[] T000Y5_n407EmprNom ;
   private String[] T000Y5_A404EmprDir ;
   private boolean[] T000Y5_n404EmprDir ;
   private String[] T000Y5_A403EmprCpo ;
   private boolean[] T000Y5_n403EmprCpo ;
   private String[] T000Y5_A408EmprPob ;
   private boolean[] T000Y5_n408EmprPob ;
   private String[] T000Y5_A395EmprCif ;
   private boolean[] T000Y5_n395EmprCif ;
   private String[] T000Y5_A409EmprTel ;
   private boolean[] T000Y5_n409EmprTel ;
   private String[] T000Y5_A405EmprFax ;
   private boolean[] T000Y5_n405EmprFax ;
   private String[] T000Y5_A954IvaDsc ;
   private boolean[] T000Y5_n954IvaDsc ;
   private byte[] T000Y5_A588IvaPor ;
   private boolean[] T000Y5_n588IvaPor ;
   private java.math.BigDecimal[] T000Y5_A589IvaRec ;
   private boolean[] T000Y5_n589IvaRec ;
   private String[] T000Y5_A961Emp1 ;
   private boolean[] T000Y5_n961Emp1 ;
   private String[] T000Y5_A962Emp0 ;
   private boolean[] T000Y5_n962Emp0 ;
   private String[] T000Y5_A963Ser1 ;
   private boolean[] T000Y5_n963Ser1 ;
   private String[] T000Y5_A964Ser0 ;
   private boolean[] T000Y5_n964Ser0 ;
   private String[] T000Y5_A2387Ser2 ;
   private boolean[] T000Y5_n2387Ser2 ;
   private String[] T000Y5_A2388Ser20 ;
   private boolean[] T000Y5_n2388Ser20 ;
   private String[] T000Y5_A2389Ser3 ;
   private boolean[] T000Y5_n2389Ser3 ;
   private String[] T000Y5_A2390Ser30 ;
   private boolean[] T000Y5_n2390Ser30 ;
   private byte[] T000Y5_A3915EmpNumDec ;
   private boolean[] T000Y5_n3915EmpNumDec ;
   private byte[] T000Y5_A7209Colombia ;
   private boolean[] T000Y5_n7209Colombia ;
   private String[] T000Y5_A8334EmpItm1 ;
   private boolean[] T000Y5_n8334EmpItm1 ;
   private String[] T000Y5_A8335EmpItm2 ;
   private boolean[] T000Y5_n8335EmpItm2 ;
   private String[] T000Y5_A8336EmpItm3 ;
   private boolean[] T000Y5_n8336EmpItm3 ;
   private String[] T000Y5_A8337EmpItm4 ;
   private boolean[] T000Y5_n8337EmpItm4 ;
   private String[] T000Y5_A8338EmpItm5 ;
   private boolean[] T000Y5_n8338EmpItm5 ;
   private String[] T000Y5_A11516EmpItm6 ;
   private boolean[] T000Y5_n11516EmpItm6 ;
   private String[] T000Y5_A12702EmpItm7 ;
   private boolean[] T000Y5_n12702EmpItm7 ;
   private String[] T000Y5_A14826EmpKey ;
   private boolean[] T000Y5_n14826EmpKey ;
   private String[] T000Y5_A14827EmpToken ;
   private boolean[] T000Y5_n14827EmpToken ;
   private String[] T000Y5_A14828EmpEnv ;
   private boolean[] T000Y5_n14828EmpEnv ;
   private String[] T000Y5_A14829EmpProd ;
   private boolean[] T000Y5_n14829EmpProd ;
   private String[] T000Y5_A953IvaCod ;
   private boolean[] T000Y5_n953IvaCod ;
   private String[] T000Y6_A954IvaDsc ;
   private boolean[] T000Y6_n954IvaDsc ;
   private byte[] T000Y6_A588IvaPor ;
   private boolean[] T000Y6_n588IvaPor ;
   private java.math.BigDecimal[] T000Y6_A589IvaRec ;
   private boolean[] T000Y6_n589IvaRec ;
   private String[] T000Y7_A396EmprCod ;
   private String[] T000Y3_A396EmprCod ;
   private String[] T000Y3_A407EmprNom ;
   private boolean[] T000Y3_n407EmprNom ;
   private String[] T000Y3_A404EmprDir ;
   private boolean[] T000Y3_n404EmprDir ;
   private String[] T000Y3_A403EmprCpo ;
   private boolean[] T000Y3_n403EmprCpo ;
   private String[] T000Y3_A408EmprPob ;
   private boolean[] T000Y3_n408EmprPob ;
   private String[] T000Y3_A395EmprCif ;
   private boolean[] T000Y3_n395EmprCif ;
   private String[] T000Y3_A409EmprTel ;
   private boolean[] T000Y3_n409EmprTel ;
   private String[] T000Y3_A405EmprFax ;
   private boolean[] T000Y3_n405EmprFax ;
   private String[] T000Y3_A961Emp1 ;
   private boolean[] T000Y3_n961Emp1 ;
   private String[] T000Y3_A962Emp0 ;
   private boolean[] T000Y3_n962Emp0 ;
   private String[] T000Y3_A963Ser1 ;
   private boolean[] T000Y3_n963Ser1 ;
   private String[] T000Y3_A964Ser0 ;
   private boolean[] T000Y3_n964Ser0 ;
   private String[] T000Y3_A2387Ser2 ;
   private boolean[] T000Y3_n2387Ser2 ;
   private String[] T000Y3_A2388Ser20 ;
   private boolean[] T000Y3_n2388Ser20 ;
   private String[] T000Y3_A2389Ser3 ;
   private boolean[] T000Y3_n2389Ser3 ;
   private String[] T000Y3_A2390Ser30 ;
   private boolean[] T000Y3_n2390Ser30 ;
   private byte[] T000Y3_A3915EmpNumDec ;
   private boolean[] T000Y3_n3915EmpNumDec ;
   private byte[] T000Y3_A7209Colombia ;
   private boolean[] T000Y3_n7209Colombia ;
   private String[] T000Y3_A8334EmpItm1 ;
   private boolean[] T000Y3_n8334EmpItm1 ;
   private String[] T000Y3_A8335EmpItm2 ;
   private boolean[] T000Y3_n8335EmpItm2 ;
   private String[] T000Y3_A8336EmpItm3 ;
   private boolean[] T000Y3_n8336EmpItm3 ;
   private String[] T000Y3_A8337EmpItm4 ;
   private boolean[] T000Y3_n8337EmpItm4 ;
   private String[] T000Y3_A8338EmpItm5 ;
   private boolean[] T000Y3_n8338EmpItm5 ;
   private String[] T000Y3_A11516EmpItm6 ;
   private boolean[] T000Y3_n11516EmpItm6 ;
   private String[] T000Y3_A12702EmpItm7 ;
   private boolean[] T000Y3_n12702EmpItm7 ;
   private String[] T000Y3_A14826EmpKey ;
   private boolean[] T000Y3_n14826EmpKey ;
   private String[] T000Y3_A14827EmpToken ;
   private boolean[] T000Y3_n14827EmpToken ;
   private String[] T000Y3_A14828EmpEnv ;
   private boolean[] T000Y3_n14828EmpEnv ;
   private String[] T000Y3_A14829EmpProd ;
   private boolean[] T000Y3_n14829EmpProd ;
   private String[] T000Y3_A953IvaCod ;
   private boolean[] T000Y3_n953IvaCod ;
   private String[] T000Y8_A396EmprCod ;
   private String[] T000Y9_A396EmprCod ;
   private String[] T000Y2_A396EmprCod ;
   private String[] T000Y2_A407EmprNom ;
   private boolean[] T000Y2_n407EmprNom ;
   private String[] T000Y2_A404EmprDir ;
   private boolean[] T000Y2_n404EmprDir ;
   private String[] T000Y2_A403EmprCpo ;
   private boolean[] T000Y2_n403EmprCpo ;
   private String[] T000Y2_A408EmprPob ;
   private boolean[] T000Y2_n408EmprPob ;
   private String[] T000Y2_A395EmprCif ;
   private boolean[] T000Y2_n395EmprCif ;
   private String[] T000Y2_A409EmprTel ;
   private boolean[] T000Y2_n409EmprTel ;
   private String[] T000Y2_A405EmprFax ;
   private boolean[] T000Y2_n405EmprFax ;
   private String[] T000Y2_A961Emp1 ;
   private boolean[] T000Y2_n961Emp1 ;
   private String[] T000Y2_A962Emp0 ;
   private boolean[] T000Y2_n962Emp0 ;
   private String[] T000Y2_A963Ser1 ;
   private boolean[] T000Y2_n963Ser1 ;
   private String[] T000Y2_A964Ser0 ;
   private boolean[] T000Y2_n964Ser0 ;
   private String[] T000Y2_A2387Ser2 ;
   private boolean[] T000Y2_n2387Ser2 ;
   private String[] T000Y2_A2388Ser20 ;
   private boolean[] T000Y2_n2388Ser20 ;
   private String[] T000Y2_A2389Ser3 ;
   private boolean[] T000Y2_n2389Ser3 ;
   private String[] T000Y2_A2390Ser30 ;
   private boolean[] T000Y2_n2390Ser30 ;
   private byte[] T000Y2_A3915EmpNumDec ;
   private boolean[] T000Y2_n3915EmpNumDec ;
   private byte[] T000Y2_A7209Colombia ;
   private boolean[] T000Y2_n7209Colombia ;
   private String[] T000Y2_A8334EmpItm1 ;
   private boolean[] T000Y2_n8334EmpItm1 ;
   private String[] T000Y2_A8335EmpItm2 ;
   private boolean[] T000Y2_n8335EmpItm2 ;
   private String[] T000Y2_A8336EmpItm3 ;
   private boolean[] T000Y2_n8336EmpItm3 ;
   private String[] T000Y2_A8337EmpItm4 ;
   private boolean[] T000Y2_n8337EmpItm4 ;
   private String[] T000Y2_A8338EmpItm5 ;
   private boolean[] T000Y2_n8338EmpItm5 ;
   private String[] T000Y2_A11516EmpItm6 ;
   private boolean[] T000Y2_n11516EmpItm6 ;
   private String[] T000Y2_A12702EmpItm7 ;
   private boolean[] T000Y2_n12702EmpItm7 ;
   private String[] T000Y2_A14826EmpKey ;
   private boolean[] T000Y2_n14826EmpKey ;
   private String[] T000Y2_A14827EmpToken ;
   private boolean[] T000Y2_n14827EmpToken ;
   private String[] T000Y2_A14828EmpEnv ;
   private boolean[] T000Y2_n14828EmpEnv ;
   private String[] T000Y2_A14829EmpProd ;
   private boolean[] T000Y2_n14829EmpProd ;
   private String[] T000Y2_A953IvaCod ;
   private boolean[] T000Y2_n953IvaCod ;
   private String[] T000Y13_A954IvaDsc ;
   private boolean[] T000Y13_n954IvaDsc ;
   private byte[] T000Y13_A588IvaPor ;
   private boolean[] T000Y13_n588IvaPor ;
   private java.math.BigDecimal[] T000Y13_A589IvaRec ;
   private boolean[] T000Y13_n589IvaRec ;
   private String[] T000Y14_A396EmprCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private app.wwpbaseobjects.SdtWWPContext AV40WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext5[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV41TrnContext ;
   private app.wwpbaseobjects.SdtWWPTransactionContext_Attribute AV44TrnContextAtt ;
}

final  class tempres__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tempres__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tempres__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tempres__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tempres__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T000Y2", "SELECT EmprCod, EmprNom, EmprDir, EmprCpo, EmprPob, EmprCif, EmprTel, EmprFax, Emp1, Emp0, Ser1, Ser0, Ser2, Ser20, Ser3, Ser30, EmpNumDec, Colombia, EmpItm1, EmpItm2, EmpItm3, EmpItm4, EmpItm5, EmpItm6, EmpItm7, EmpKey, EmpToken, EmpEnv, EmpProd, IvaCod FROM TXPEMPRES WHERE EmprCod = ?  FOR UPDATE OF EmprNom, EmprDir, EmprCpo, EmprPob, EmprCif, EmprTel, EmprFax, Emp1, Emp0, Ser1, Ser0, Ser2, Ser20, Ser3, Ser30, EmpNumDec, Colombia, EmpItm1, EmpItm2, EmpItm3, EmpItm4, EmpItm5, EmpItm6, EmpItm7, EmpKey, EmpToken, EmpEnv, EmpProd, IvaCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T000Y3", "SELECT EmprCod, EmprNom, EmprDir, EmprCpo, EmprPob, EmprCif, EmprTel, EmprFax, Emp1, Emp0, Ser1, Ser0, Ser2, Ser20, Ser3, Ser30, EmpNumDec, Colombia, EmpItm1, EmpItm2, EmpItm3, EmpItm4, EmpItm5, EmpItm6, EmpItm7, EmpKey, EmpToken, EmpEnv, EmpProd, IvaCod FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T000Y4", "SELECT IvaDsc, IvaPor, IvaRec FROM TXPTIPIVA WHERE IvaCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T000Y5", "SELECT /*+ FIRST_ROWS(100) */ TM1.EmprCod, TM1.EmprNom, TM1.EmprDir, TM1.EmprCpo, TM1.EmprPob, TM1.EmprCif, TM1.EmprTel, TM1.EmprFax, T2.IvaDsc, T2.IvaPor, T2.IvaRec, TM1.Emp1, TM1.Emp0, TM1.Ser1, TM1.Ser0, TM1.Ser2, TM1.Ser20, TM1.Ser3, TM1.Ser30, TM1.EmpNumDec, TM1.Colombia, TM1.EmpItm1, TM1.EmpItm2, TM1.EmpItm3, TM1.EmpItm4, TM1.EmpItm5, TM1.EmpItm6, TM1.EmpItm7, TM1.EmpKey, TM1.EmpToken, TM1.EmpEnv, TM1.EmpProd, TM1.IvaCod FROM (TXPEMPRES TM1 LEFT JOIN TXPTIPIVA T2 ON T2.IvaCod = TM1.IvaCod) WHERE TM1.EmprCod = ? ORDER BY TM1.EmprCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T000Y6", "SELECT IvaDsc, IvaPor, IvaRec FROM TXPTIPIVA WHERE IvaCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T000Y7", "SELECT /*+ FIRST_ROWS(1) */ EmprCod FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T000Y8", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod FROM TXPEMPRES WHERE ( EmprCod > ?) ORDER BY EmprCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000Y9", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod FROM TXPEMPRES WHERE ( EmprCod < ?) ORDER BY EmprCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T000Y10", "INSERT INTO TXPEMPRES(EmprCod, EmprNom, EmprDir, EmprCpo, EmprPob, EmprCif, EmprTel, EmprFax, Emp1, Emp0, Ser1, Ser0, Ser2, Ser20, Ser3, Ser30, EmpNumDec, Colombia, EmpItm1, EmpItm2, EmpItm3, EmpItm4, EmpItm5, EmpItm6, EmpItm7, EmpKey, EmpToken, EmpEnv, EmpProd, IvaCod, Ser4, Ser40, Ser5, Ser50, Ser6, Ser60, Ser7, Ser70, Hh_UltL, Coste_mca, Coste_msa, Factor_in, Auc_ULin, EmpQuePrd, EmpQueCol, EmpQueSod, EmpCosInd, EmpGasGen, EmpMarCom, EmpCosTin, EmpRelBan, PtosUltID) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)", GX_NOMASK, "TXPEMPRES")
         ,new UpdateCursor("T000Y11", "UPDATE TXPEMPRES SET EmprNom=?, EmprDir=?, EmprCpo=?, EmprPob=?, EmprCif=?, EmprTel=?, EmprFax=?, Emp1=?, Emp0=?, Ser1=?, Ser0=?, Ser2=?, Ser20=?, Ser3=?, Ser30=?, EmpNumDec=?, Colombia=?, EmpItm1=?, EmpItm2=?, EmpItm3=?, EmpItm4=?, EmpItm5=?, EmpItm6=?, EmpItm7=?, EmpKey=?, EmpToken=?, EmpEnv=?, EmpProd=?, IvaCod=?  WHERE EmprCod = ?", GX_NOMASK, "TXPEMPRES")
         ,new UpdateCursor("T000Y12", "DELETE FROM TXPEMPRES  WHERE EmprCod = ?", GX_NOMASK, "TXPEMPRES")
         ,new ForEachCursor("T000Y13", "SELECT IvaDsc, IvaPor, IvaRec FROM TXPTIPIVA WHERE IvaCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T000Y14", "SELECT /*+ FIRST_ROWS(100) */ EmprCod FROM TXPEMPRES ORDER BY EmprCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 35);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 7);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 35);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 15);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 15);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 15);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 3);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 3);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 3);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 3);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 3);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(14, 3);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(15, 3);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(16, 3);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((byte[]) buf[31])[0] = rslt.getByte(17);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((byte[]) buf[33])[0] = rslt.getByte(18);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getString(19, 100);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getString(20, 100);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getString(21, 100);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((String[]) buf[41])[0] = rslt.getString(22, 100);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((String[]) buf[43])[0] = rslt.getString(23, 100);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((String[]) buf[45])[0] = rslt.getString(24, 100);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((String[]) buf[47])[0] = rslt.getString(25, 100);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((String[]) buf[49])[0] = rslt.getVarchar(26);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((String[]) buf[51])[0] = rslt.getVarchar(27);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((String[]) buf[53])[0] = rslt.getVarchar(28);
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((String[]) buf[55])[0] = rslt.getVarchar(29);
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((String[]) buf[57])[0] = rslt.getString(30, 3);
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 35);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 7);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 35);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 15);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 15);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 15);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 3);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 3);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 3);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 3);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 3);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(14, 3);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(15, 3);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(16, 3);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((byte[]) buf[31])[0] = rslt.getByte(17);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((byte[]) buf[33])[0] = rslt.getByte(18);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getString(19, 100);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getString(20, 100);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getString(21, 100);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((String[]) buf[41])[0] = rslt.getString(22, 100);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((String[]) buf[43])[0] = rslt.getString(23, 100);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((String[]) buf[45])[0] = rslt.getString(24, 100);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((String[]) buf[47])[0] = rslt.getString(25, 100);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((String[]) buf[49])[0] = rslt.getVarchar(26);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((String[]) buf[51])[0] = rslt.getVarchar(27);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((String[]) buf[53])[0] = rslt.getVarchar(28);
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((String[]) buf[55])[0] = rslt.getVarchar(29);
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((String[]) buf[57])[0] = rslt.getString(30, 3);
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 25);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((byte[]) buf[2])[0] = rslt.getByte(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(3,3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 35);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 7);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 35);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 15);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 15);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 15);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 25);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((byte[]) buf[17])[0] = rslt.getByte(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(11,3);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 3);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 3);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(14, 3);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(15, 3);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(16, 3);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(17, 3);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getString(18, 3);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getString(19, 3);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((byte[]) buf[37])[0] = rslt.getByte(20);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((byte[]) buf[39])[0] = rslt.getByte(21);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((String[]) buf[41])[0] = rslt.getString(22, 100);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((String[]) buf[43])[0] = rslt.getString(23, 100);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((String[]) buf[45])[0] = rslt.getString(24, 100);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((String[]) buf[47])[0] = rslt.getString(25, 100);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((String[]) buf[49])[0] = rslt.getString(26, 100);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((String[]) buf[51])[0] = rslt.getString(27, 100);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((String[]) buf[53])[0] = rslt.getString(28, 100);
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((String[]) buf[55])[0] = rslt.getVarchar(29);
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((String[]) buf[57])[0] = rslt.getVarchar(30);
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((String[]) buf[59])[0] = rslt.getVarchar(31);
               ((boolean[]) buf[60])[0] = rslt.wasNull();
               ((String[]) buf[61])[0] = rslt.getVarchar(32);
               ((boolean[]) buf[62])[0] = rslt.wasNull();
               ((String[]) buf[63])[0] = rslt.getString(33, 3);
               ((boolean[]) buf[64])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 25);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((byte[]) buf[2])[0] = rslt.getByte(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(3,3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 25);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((byte[]) buf[2])[0] = rslt.getByte(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(3,3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 2 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 4 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 30);
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 35);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 7);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[8], 35);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[10], 15);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[12], 15);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[14], 15);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[16], 3);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[18], 3);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[20], 3);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[22], 3);
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(13, (String)parms[24], 3);
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(14, (String)parms[26], 3);
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(15, (String)parms[28], 3);
               }
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(16, (String)parms[30], 3);
               }
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(17, ((Number) parms[32]).byteValue());
               }
               if ( ((Boolean) parms[33]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(18, ((Number) parms[34]).byteValue());
               }
               if ( ((Boolean) parms[35]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(19, (String)parms[36], 100);
               }
               if ( ((Boolean) parms[37]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(20, (String)parms[38], 100);
               }
               if ( ((Boolean) parms[39]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(21, (String)parms[40], 100);
               }
               if ( ((Boolean) parms[41]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(22, (String)parms[42], 100);
               }
               if ( ((Boolean) parms[43]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(23, (String)parms[44], 100);
               }
               if ( ((Boolean) parms[45]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(24, (String)parms[46], 100);
               }
               if ( ((Boolean) parms[47]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(25, (String)parms[48], 100);
               }
               if ( ((Boolean) parms[49]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(26, (String)parms[50], 150);
               }
               if ( ((Boolean) parms[51]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(27, (String)parms[52], 150);
               }
               if ( ((Boolean) parms[53]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(28, (String)parms[54], 150);
               }
               if ( ((Boolean) parms[55]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(29, (String)parms[56], 150);
               }
               if ( ((Boolean) parms[57]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(30, (String)parms[58], 3);
               }
               return;
            case 9 :
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
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 35);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 7);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 35);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 15);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[11], 15);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[13], 15);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[15], 3);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[17], 3);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[19], 3);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[21], 3);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[23], 3);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(13, (String)parms[25], 3);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(14, (String)parms[27], 3);
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(15, (String)parms[29], 3);
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(16, ((Number) parms[31]).byteValue());
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(17, ((Number) parms[33]).byteValue());
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(18, (String)parms[35], 100);
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(19, (String)parms[37], 100);
               }
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(20, (String)parms[39], 100);
               }
               if ( ((Boolean) parms[40]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(21, (String)parms[41], 100);
               }
               if ( ((Boolean) parms[42]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(22, (String)parms[43], 100);
               }
               if ( ((Boolean) parms[44]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(23, (String)parms[45], 100);
               }
               if ( ((Boolean) parms[46]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(24, (String)parms[47], 100);
               }
               if ( ((Boolean) parms[48]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(25, (String)parms[49], 150);
               }
               if ( ((Boolean) parms[50]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(26, (String)parms[51], 150);
               }
               if ( ((Boolean) parms[52]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(27, (String)parms[53], 150);
               }
               if ( ((Boolean) parms[54]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(28, (String)parms[55], 150);
               }
               if ( ((Boolean) parms[56]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(29, (String)parms[57], 3);
               }
               stmt.setString(30, (String)parms[58], 3);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 11 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               return;
      }
   }

}

