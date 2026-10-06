package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ttermin_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"IMPCOD") == 0 )
      {
         A13879ImpCDsc = httpContext.GetPar( "ImpCDsc") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxsgaimpcod2Y0( A13879ImpCDsc) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"IMPCOD") == 0 )
      {
         A13879ImpCDsc = httpContext.GetPar( "ImpCDsc") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxsgaimpcod2Y0( A13879ImpCDsc) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxHideCode"+"_"+"IMPCOD") == 0 )
      {
         h574ImpCod = httpContext.GetPar( "h574ImpCod") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxhcaimpcod2Y122( h574ImpCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel10"+"_"+"vSEDAMIL") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         n396EmprCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx10asasedamil2Y122( A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel11"+"_"+"vCLADD") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         n396EmprCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx11asacladd2Y122( A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel12"+"_"+"vARTEXTIL") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         n396EmprCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx12asaartextil2Y122( A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_28") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         n396EmprCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_28( A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_27") == 0 )
      {
         A574ImpCod = httpContext.GetPar( "ImpCod") ;
         n574ImpCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A574ImpCod", A574ImpCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_27( A574ImpCod) ;
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
            AV34TermCod = httpContext.GetPar( "TermCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34TermCod", AV34TermCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTERMCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV34TermCod, ""))));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "TERMINALES", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtTermCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public ttermin_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public ttermin_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ttermin_impl.class ));
   }

   public ttermin_impl( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      chkTermPes = UIFactory.getCheckbox(this);
      chkTermNoTr = UIFactory.getCheckbox(this);
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
      A8899TermPes = (byte)(((GXutil.strcmp(GXutil.ltrim( localUtil.ntoc( A8899TermPes, (byte)(1), (byte)(0), ".", "")), "1")==0) ? 1 : 0)) ;
      n8899TermPes = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8899TermPes", GXutil.str( A8899TermPes, 1, 0));
      A8678TermNoTr = (byte)(((GXutil.strcmp(GXutil.ltrim( localUtil.ntoc( A8678TermNoTr, (byte)(1), (byte)(0), ".", "")), "1")==0) ? 1 : 0)) ;
      n8678TermNoTr = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8678TermNoTr", GXutil.str( A8678TermNoTr, 1, 0));
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtTermCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtTermCod_Internalname, httpContext.getMessage( "Código del Terminal", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTermCod_Internalname, GXutil.rtrim( A942TermCod), GXutil.rtrim( localUtil.format( A942TermCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,22);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTermCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtTermCod_Enabled, 1, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTERMIN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtTermDsc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtTermDsc_Internalname, httpContext.getMessage( "Descripción", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTermDsc_Internalname, GXutil.rtrim( A8898TermDsc), GXutil.rtrim( localUtil.format( A8898TermDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,26);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTermDsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtTermDsc_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTERMIN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtImpCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtImpCod_Internalname, httpContext.getMessage( "Codigo Impresora", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtImpCod_Internalname, GXutil.rtrim( h574ImpCod), GXutil.rtrim( localUtil.format( h574ImpCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,31);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtImpCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtImpCod_Enabled, 1, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(0), (byte)(0), (byte)(0), true, "", "left", true, "", "HLP_TTERMIN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtTermUsu_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtTermUsu_Internalname, httpContext.getMessage( "Usuario del Terminal", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtTermUsu_Internalname, GXutil.rtrim( A1189TermUsu), GXutil.rtrim( localUtil.format( A1189TermUsu, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTermUsu_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtTermUsu_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTERMIN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtTermFec_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtTermFec_Internalname, httpContext.getMessage( "FechaHora", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 40,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtTermFec_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTermFec_Internalname, localUtil.ttoc( A11758TermFec, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A11758TermFec, "99/99/99 99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,40);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTermFec_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtTermFec_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTERMIN.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtTermFec_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtTermFec_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TTERMIN.htm");
      httpContext.writeTextNL( "</div>") ;
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
      /* User Defined Control */
      ucDvpanel_formatosimpresora.setProperty("Width", Dvpanel_formatosimpresora_Width);
      ucDvpanel_formatosimpresora.setProperty("AutoWidth", Dvpanel_formatosimpresora_Autowidth);
      ucDvpanel_formatosimpresora.setProperty("AutoHeight", Dvpanel_formatosimpresora_Autoheight);
      ucDvpanel_formatosimpresora.setProperty("Cls", Dvpanel_formatosimpresora_Cls);
      ucDvpanel_formatosimpresora.setProperty("Title", Dvpanel_formatosimpresora_Title);
      ucDvpanel_formatosimpresora.setProperty("Collapsible", Dvpanel_formatosimpresora_Collapsible);
      ucDvpanel_formatosimpresora.setProperty("Collapsed", Dvpanel_formatosimpresora_Collapsed);
      ucDvpanel_formatosimpresora.setProperty("ShowCollapseIcon", Dvpanel_formatosimpresora_Showcollapseicon);
      ucDvpanel_formatosimpresora.setProperty("IconPosition", Dvpanel_formatosimpresora_Iconposition);
      ucDvpanel_formatosimpresora.setProperty("AutoScroll", Dvpanel_formatosimpresora_Autoscroll);
      ucDvpanel_formatosimpresora.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_formatosimpresora_Internalname, "DVPANEL_FORMATOSIMPRESORAContainer");
      httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_FORMATOSIMPRESORAContainer"+"FormatosImpresora"+"\" style=\"display:none;\">") ;
      /* Table start */
      sStyleString = "" ;
      app.GxWebStd.gx_table_start( httpContext, tblFormatosimpresora_Internalname, tblFormatosimpresora_Internalname, "", "", 0, "", "", 1, 1, sStyleString, "", "", 0);
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td class='DataContentCell'>") ;
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtImpCod1_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtImpCod1_Internalname, httpContext.getMessage( "Impresora Formatos 1", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 50,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtImpCod1_Internalname, GXutil.rtrim( A1441ImpCod1), GXutil.rtrim( localUtil.format( A1441ImpCod1, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,50);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtImpCod1_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtImpCod1_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTERMIN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td class='DataContentCell'>") ;
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtImpLpt1_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtImpLpt1_Internalname, httpContext.getMessage( "Puerto Impresora Formatos 1", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtImpLpt1_Internalname, GXutil.rtrim( A1446ImpLpt1), GXutil.rtrim( localUtil.format( A1446ImpLpt1, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,54);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtImpLpt1_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtImpLpt1_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTERMIN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td class='DataContentCell'>") ;
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtImpCod2_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtImpCod2_Internalname, httpContext.getMessage( "Impresora Formatos 2", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtImpCod2_Internalname, GXutil.rtrim( A1442ImpCod2), GXutil.rtrim( localUtil.format( A1442ImpCod2, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,59);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtImpCod2_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtImpCod2_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTERMIN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td class='DataContentCell'>") ;
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtImpLpt2_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtImpLpt2_Internalname, httpContext.getMessage( "Puerto Impresora Formatos 2", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 63,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtImpLpt2_Internalname, GXutil.rtrim( A1447ImpLpt2), GXutil.rtrim( localUtil.format( A1447ImpLpt2, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,63);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtImpLpt2_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtImpLpt2_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTERMIN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td class='DataContentCell'>") ;
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtImpCod3_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtImpCod3_Internalname, httpContext.getMessage( "Impresora Formatos 3", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 68,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtImpCod3_Internalname, GXutil.rtrim( A1443ImpCod3), GXutil.rtrim( localUtil.format( A1443ImpCod3, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,68);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtImpCod3_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtImpCod3_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTERMIN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td class='DataContentCell'>") ;
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtImpLpt3_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtImpLpt3_Internalname, httpContext.getMessage( "Puerto Impresora Formatos 3", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 72,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtImpLpt3_Internalname, GXutil.rtrim( A1448ImpLpt3), GXutil.rtrim( localUtil.format( A1448ImpLpt3, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,72);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtImpLpt3_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtImpLpt3_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTERMIN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td class='DataContentCell'>") ;
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtImpCod4_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtImpCod4_Internalname, httpContext.getMessage( "Impresora Formatos 4", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 77,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtImpCod4_Internalname, GXutil.rtrim( A1444ImpCod4), GXutil.rtrim( localUtil.format( A1444ImpCod4, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,77);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtImpCod4_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtImpCod4_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTERMIN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td class='DataContentCell'>") ;
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtImpLpt4_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtImpLpt4_Internalname, httpContext.getMessage( "Puerto Impresora Formatos 4", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtImpLpt4_Internalname, GXutil.rtrim( A1449ImpLpt4), GXutil.rtrim( localUtil.format( A1449ImpLpt4, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,81);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtImpLpt4_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtImpLpt4_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTERMIN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td class='DataContentCell'>") ;
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtImpCod5_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtImpCod5_Internalname, httpContext.getMessage( "Impresora Formatos 5", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtImpCod5_Internalname, GXutil.rtrim( A1445ImpCod5), GXutil.rtrim( localUtil.format( A1445ImpCod5, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,86);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtImpCod5_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtImpCod5_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTERMIN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td class='DataContentCell'>") ;
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtImpLpt5_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtImpLpt5_Internalname, httpContext.getMessage( "Puerto Impresora Formatos 5", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 90,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtImpLpt5_Internalname, GXutil.rtrim( A1450ImpLpt5), GXutil.rtrim( localUtil.format( A1450ImpLpt5, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,90);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtImpLpt5_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtImpLpt5_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTERMIN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      /* End of table */
      httpContext.writeText( "</table>") ;
      httpContext.writeText( "</div>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* User Defined Control */
      ucDvpanel_otrosdatos.setProperty("Width", Dvpanel_otrosdatos_Width);
      ucDvpanel_otrosdatos.setProperty("AutoWidth", Dvpanel_otrosdatos_Autowidth);
      ucDvpanel_otrosdatos.setProperty("AutoHeight", Dvpanel_otrosdatos_Autoheight);
      ucDvpanel_otrosdatos.setProperty("Cls", Dvpanel_otrosdatos_Cls);
      ucDvpanel_otrosdatos.setProperty("Title", Dvpanel_otrosdatos_Title);
      ucDvpanel_otrosdatos.setProperty("Collapsible", Dvpanel_otrosdatos_Collapsible);
      ucDvpanel_otrosdatos.setProperty("Collapsed", Dvpanel_otrosdatos_Collapsed);
      ucDvpanel_otrosdatos.setProperty("ShowCollapseIcon", Dvpanel_otrosdatos_Showcollapseicon);
      ucDvpanel_otrosdatos.setProperty("IconPosition", Dvpanel_otrosdatos_Iconposition);
      ucDvpanel_otrosdatos.setProperty("AutoScroll", Dvpanel_otrosdatos_Autoscroll);
      ucDvpanel_otrosdatos.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_otrosdatos_Internalname, "DVPANEL_OTROSDATOSContainer");
      httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_OTROSDATOSContainer"+"OtrosDatos"+"\" style=\"display:none;\">") ;
      /* Table start */
      sStyleString = "" ;
      app.GxWebStd.gx_table_start( httpContext, tblOtrosdatos_Internalname, tblOtrosdatos_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td class='DataContentCell'>") ;
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", edtTermBol_Visible, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtTermBol_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtTermBol_Internalname, edtTermBol_Caption, "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 100,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTermBol_Internalname, GXutil.ltrim( localUtil.ntoc( A6112TermBol, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTermBol_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6112TermBol), "9") : localUtil.format( DecimalUtil.doubleToDec(A6112TermBol), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,100);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTermBol_Jsonclick, 0, "AttributeFL", "", "", "", "", edtTermBol_Visible, edtTermBol_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTERMIN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td class='DataContentCell'>") ;
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", edtTermBal_Visible, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtTermBal_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtTermBal_Internalname, httpContext.getMessage( "Balanza", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 104,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTermBal_Internalname, GXutil.ltrim( localUtil.ntoc( A6113TermBal, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTermBal_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6113TermBal), "9") : localUtil.format( DecimalUtil.doubleToDec(A6113TermBal), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,104);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTermBal_Jsonclick, 0, "AttributeFL", "", "", "", "", edtTermBal_Visible, edtTermBal_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTERMIN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td class='DataContentCell'>") ;
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", chkTermPes.getVisible(), 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+chkTermPes.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, chkTermPes.getInternalname(), httpContext.getMessage( "Pesaje Colorantes?", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
      /* Check box */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 109,'',false,'',0)\"" ;
      ClassString = "AttributeFL" ;
      StyleString = "" ;
      app.GxWebStd.gx_checkbox_ctrl( httpContext, chkTermPes.getInternalname(), GXutil.str( A8899TermPes, 1, 0), "", httpContext.getMessage( "Pesaje Colorantes?", ""), chkTermPes.getVisible(), chkTermPes.getEnabled(), "1", httpContext.getMessage( "Terminal de Pesaje", ""), StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(109, this, 1, 0,"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,109);\"");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td class='DataContentCell'>") ;
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", chkTermNoTr.getVisible(), 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+chkTermNoTr.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, chkTermNoTr.getInternalname(), httpContext.getMessage( "TermNoTr", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
      /* Check box */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 113,'',false,'',0)\"" ;
      ClassString = "AttributeFL" ;
      StyleString = "" ;
      app.GxWebStd.gx_checkbox_ctrl( httpContext, chkTermNoTr.getInternalname(), GXutil.str( A8678TermNoTr, 1, 0), "", httpContext.getMessage( "TermNoTr", ""), chkTermNoTr.getVisible(), chkTermNoTr.getEnabled(), "1", httpContext.getMessage( "No utiliza tara", ""), StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(113, this, 1, 0,"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,113);\"");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td class='DataContentCell'>") ;
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", edtTermLog1_Visible, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtTermLog1_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtTermLog1_Internalname, httpContext.getMessage( "Logo de Cabecera de Etiqueta", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 118,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTermLog1_Internalname, A6721TermLog1, GXutil.rtrim( localUtil.format( A6721TermLog1, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,118);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTermLog1_Jsonclick, 0, "AttributeFL", "", "", "", "", edtTermLog1_Visible, edtTermLog1_Enabled, 0, "text", "", 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTERMIN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td class='DataContentCell'>") ;
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", edtTermLog2_Visible, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtTermLog2_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtTermLog2_Internalname, httpContext.getMessage( "Logo de Pie de Etiqueta", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 122,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTermLog2_Internalname, A6722TermLog2, GXutil.rtrim( localUtil.format( A6722TermLog2, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,122);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTermLog2_Jsonclick, 0, "AttributeFL", "", "", "", "", edtTermLog2_Visible, edtTermLog2_Enabled, 0, "text", "", 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTERMIN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td class='DataContentCell'>") ;
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtTermEst_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtTermEst_Internalname, httpContext.getMessage( "Estado", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 127,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTermEst_Internalname, GXutil.ltrim( localUtil.ntoc( A11757TermEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTermEst_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11757TermEst), "9") : localUtil.format( DecimalUtil.doubleToDec(A11757TermEst), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,127);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTermEst_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtTermEst_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTERMIN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 132,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTERMIN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 134,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTERMIN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 136,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTERMIN.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 140,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,140);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", edtEmprCod_Visible, edtEmprCod_Enabled, 1, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTERMIN.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "Attribute", "", "", "", "", edtEmprNom_Visible, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTERMIN.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtImpDsc_Internalname, GXutil.rtrim( A576ImpDsc), GXutil.rtrim( localUtil.format( A576ImpDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtImpDsc_Jsonclick, 0, "Attribute", "", "", "", "", edtImpDsc_Visible, edtImpDsc_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTERMIN.htm");
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
      e112Y2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z942TermCod = httpContext.cgiGet( "Z942TermCod") ;
            Z8899TermPes = (byte)(localUtil.ctol( httpContext.cgiGet( "Z8899TermPes"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z8898TermDsc = httpContext.cgiGet( "Z8898TermDsc") ;
            Z1189TermUsu = httpContext.cgiGet( "Z1189TermUsu") ;
            Z1441ImpCod1 = httpContext.cgiGet( "Z1441ImpCod1") ;
            Z1442ImpCod2 = httpContext.cgiGet( "Z1442ImpCod2") ;
            Z1443ImpCod3 = httpContext.cgiGet( "Z1443ImpCod3") ;
            Z1444ImpCod4 = httpContext.cgiGet( "Z1444ImpCod4") ;
            Z1445ImpCod5 = httpContext.cgiGet( "Z1445ImpCod5") ;
            Z1446ImpLpt1 = httpContext.cgiGet( "Z1446ImpLpt1") ;
            Z1447ImpLpt2 = httpContext.cgiGet( "Z1447ImpLpt2") ;
            Z1448ImpLpt3 = httpContext.cgiGet( "Z1448ImpLpt3") ;
            Z1449ImpLpt4 = httpContext.cgiGet( "Z1449ImpLpt4") ;
            Z1450ImpLpt5 = httpContext.cgiGet( "Z1450ImpLpt5") ;
            Z6112TermBol = (byte)(localUtil.ctol( httpContext.cgiGet( "Z6112TermBol"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z6113TermBal = (byte)(localUtil.ctol( httpContext.cgiGet( "Z6113TermBal"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z8678TermNoTr = (byte)(localUtil.ctol( httpContext.cgiGet( "Z8678TermNoTr"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z6721TermLog1 = httpContext.cgiGet( "Z6721TermLog1") ;
            Z6722TermLog2 = httpContext.cgiGet( "Z6722TermLog2") ;
            Z11757TermEst = (byte)(localUtil.ctol( httpContext.cgiGet( "Z11757TermEst"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z11758TermFec = localUtil.ctot( httpContext.cgiGet( "Z11758TermFec"), 0) ;
            Z574ImpCod = httpContext.cgiGet( "Z574ImpCod") ;
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            N396EmprCod = httpContext.cgiGet( "N396EmprCod") ;
            N574ImpCod = httpContext.cgiGet( "N574ImpCod") ;
            N8899TermPes = (byte)(localUtil.ctol( httpContext.cgiGet( "N8899TermPes"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "vMODE") ;
            AV33Bros = (byte)(localUtil.ctol( httpContext.cgiGet( "vBROS"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV34TermCod = httpContext.cgiGet( "vTERMCOD") ;
            AV38Insert_EmprCod = httpContext.cgiGet( "vINSERT_EMPRCOD") ;
            AV39Insert_ImpCod = httpContext.cgiGet( "vINSERT_IMPCOD") ;
            A574ImpCod = httpContext.cgiGet( "GXHCIMPCOD") ;
            AV30Sedamil = localUtil.ctond( httpContext.cgiGet( "vSEDAMIL")) ;
            AV29Cladd = (byte)(localUtil.ctol( httpContext.cgiGet( "vCLADD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV31Artextil = localUtil.ctond( httpContext.cgiGet( "vARTEXTIL")) ;
            AV32PesColGX = (byte)(localUtil.ctol( httpContext.cgiGet( "vPESCOLGX"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV44Pgmname = httpContext.cgiGet( "vPGMNAME") ;
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
            Dvpanel_formatosimpresora_Objectcall = httpContext.cgiGet( "DVPANEL_FORMATOSIMPRESORA_Objectcall") ;
            Dvpanel_formatosimpresora_Class = httpContext.cgiGet( "DVPANEL_FORMATOSIMPRESORA_Class") ;
            Dvpanel_formatosimpresora_Enabled = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_FORMATOSIMPRESORA_Enabled")) ;
            Dvpanel_formatosimpresora_Width = httpContext.cgiGet( "DVPANEL_FORMATOSIMPRESORA_Width") ;
            Dvpanel_formatosimpresora_Height = httpContext.cgiGet( "DVPANEL_FORMATOSIMPRESORA_Height") ;
            Dvpanel_formatosimpresora_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_FORMATOSIMPRESORA_Autowidth")) ;
            Dvpanel_formatosimpresora_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_FORMATOSIMPRESORA_Autoheight")) ;
            Dvpanel_formatosimpresora_Cls = httpContext.cgiGet( "DVPANEL_FORMATOSIMPRESORA_Cls") ;
            Dvpanel_formatosimpresora_Showheader = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_FORMATOSIMPRESORA_Showheader")) ;
            Dvpanel_formatosimpresora_Title = httpContext.cgiGet( "DVPANEL_FORMATOSIMPRESORA_Title") ;
            Dvpanel_formatosimpresora_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_FORMATOSIMPRESORA_Collapsible")) ;
            Dvpanel_formatosimpresora_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_FORMATOSIMPRESORA_Collapsed")) ;
            Dvpanel_formatosimpresora_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_FORMATOSIMPRESORA_Showcollapseicon")) ;
            Dvpanel_formatosimpresora_Iconposition = httpContext.cgiGet( "DVPANEL_FORMATOSIMPRESORA_Iconposition") ;
            Dvpanel_formatosimpresora_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_FORMATOSIMPRESORA_Autoscroll")) ;
            Dvpanel_formatosimpresora_Visible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_FORMATOSIMPRESORA_Visible")) ;
            Dvpanel_otrosdatos_Objectcall = httpContext.cgiGet( "DVPANEL_OTROSDATOS_Objectcall") ;
            Dvpanel_otrosdatos_Class = httpContext.cgiGet( "DVPANEL_OTROSDATOS_Class") ;
            Dvpanel_otrosdatos_Enabled = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_OTROSDATOS_Enabled")) ;
            Dvpanel_otrosdatos_Width = httpContext.cgiGet( "DVPANEL_OTROSDATOS_Width") ;
            Dvpanel_otrosdatos_Height = httpContext.cgiGet( "DVPANEL_OTROSDATOS_Height") ;
            Dvpanel_otrosdatos_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_OTROSDATOS_Autowidth")) ;
            Dvpanel_otrosdatos_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_OTROSDATOS_Autoheight")) ;
            Dvpanel_otrosdatos_Cls = httpContext.cgiGet( "DVPANEL_OTROSDATOS_Cls") ;
            Dvpanel_otrosdatos_Showheader = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_OTROSDATOS_Showheader")) ;
            Dvpanel_otrosdatos_Title = httpContext.cgiGet( "DVPANEL_OTROSDATOS_Title") ;
            Dvpanel_otrosdatos_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_OTROSDATOS_Collapsible")) ;
            Dvpanel_otrosdatos_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_OTROSDATOS_Collapsed")) ;
            Dvpanel_otrosdatos_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_OTROSDATOS_Showcollapseicon")) ;
            Dvpanel_otrosdatos_Iconposition = httpContext.cgiGet( "DVPANEL_OTROSDATOS_Iconposition") ;
            Dvpanel_otrosdatos_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_OTROSDATOS_Autoscroll")) ;
            Dvpanel_otrosdatos_Visible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_OTROSDATOS_Visible")) ;
            /* Read variables values. */
            A942TermCod = httpContext.cgiGet( edtTermCod_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A942TermCod", A942TermCod);
            A8898TermDsc = httpContext.cgiGet( edtTermDsc_Internalname) ;
            n8898TermDsc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8898TermDsc", A8898TermDsc);
            h574ImpCod = httpContext.cgiGet( edtImpCod_Internalname) ;
            A1189TermUsu = GXutil.upper( httpContext.cgiGet( edtTermUsu_Internalname)) ;
            n1189TermUsu = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1189TermUsu", A1189TermUsu);
            if ( localUtil.vcdtime( httpContext.cgiGet( edtTermFec_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "TERMFEC");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTermFec_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A11758TermFec = GXutil.resetTime( GXutil.nullDate() );
               n11758TermFec = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11758TermFec", localUtil.ttoc( A11758TermFec, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            }
            else
            {
               A11758TermFec = localUtil.ctot( httpContext.cgiGet( edtTermFec_Internalname)) ;
               n11758TermFec = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11758TermFec", localUtil.ttoc( A11758TermFec, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            }
            A1441ImpCod1 = httpContext.cgiGet( edtImpCod1_Internalname) ;
            n1441ImpCod1 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1441ImpCod1", A1441ImpCod1);
            A1446ImpLpt1 = httpContext.cgiGet( edtImpLpt1_Internalname) ;
            n1446ImpLpt1 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1446ImpLpt1", A1446ImpLpt1);
            A1442ImpCod2 = httpContext.cgiGet( edtImpCod2_Internalname) ;
            n1442ImpCod2 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1442ImpCod2", A1442ImpCod2);
            A1447ImpLpt2 = httpContext.cgiGet( edtImpLpt2_Internalname) ;
            n1447ImpLpt2 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1447ImpLpt2", A1447ImpLpt2);
            A1443ImpCod3 = httpContext.cgiGet( edtImpCod3_Internalname) ;
            n1443ImpCod3 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1443ImpCod3", A1443ImpCod3);
            A1448ImpLpt3 = httpContext.cgiGet( edtImpLpt3_Internalname) ;
            n1448ImpLpt3 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1448ImpLpt3", A1448ImpLpt3);
            A1444ImpCod4 = httpContext.cgiGet( edtImpCod4_Internalname) ;
            n1444ImpCod4 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1444ImpCod4", A1444ImpCod4);
            A1449ImpLpt4 = httpContext.cgiGet( edtImpLpt4_Internalname) ;
            n1449ImpLpt4 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1449ImpLpt4", A1449ImpLpt4);
            A1445ImpCod5 = httpContext.cgiGet( edtImpCod5_Internalname) ;
            n1445ImpCod5 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1445ImpCod5", A1445ImpCod5);
            A1450ImpLpt5 = httpContext.cgiGet( edtImpLpt5_Internalname) ;
            n1450ImpLpt5 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1450ImpLpt5", A1450ImpLpt5);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTermBol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTermBol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TERMBOL");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTermBol_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A6112TermBol = (byte)(0) ;
               n6112TermBol = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A6112TermBol", GXutil.str( A6112TermBol, 1, 0));
            }
            else
            {
               A6112TermBol = (byte)(localUtil.ctol( httpContext.cgiGet( edtTermBol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n6112TermBol = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A6112TermBol", GXutil.str( A6112TermBol, 1, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTermBal_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTermBal_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TERMBAL");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTermBal_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A6113TermBal = (byte)(0) ;
               n6113TermBal = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A6113TermBal", GXutil.str( A6113TermBal, 1, 0));
            }
            else
            {
               A6113TermBal = (byte)(localUtil.ctol( httpContext.cgiGet( edtTermBal_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n6113TermBal = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A6113TermBal", GXutil.str( A6113TermBal, 1, 0));
            }
            if ( ( ( ((GXutil.strcmp(httpContext.cgiGet( chkTermPes.getInternalname()), "1")==0) ? 1 : 0) < 0 ) ) || ( ( ((GXutil.strcmp(httpContext.cgiGet( chkTermPes.getInternalname()), "1")==0) ? 1 : 0) > 9 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TERMPES");
               AnyError = (short)(1) ;
               GX_FocusControl = chkTermPes.getInternalname() ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A8899TermPes = (byte)(0) ;
               n8899TermPes = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A8899TermPes", GXutil.str( A8899TermPes, 1, 0));
            }
            else
            {
               A8899TermPes = (byte)(((GXutil.strcmp(httpContext.cgiGet( chkTermPes.getInternalname()), "1")==0) ? 1 : 0)) ;
               n8899TermPes = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A8899TermPes", GXutil.str( A8899TermPes, 1, 0));
            }
            if ( ( ( ((GXutil.strcmp(httpContext.cgiGet( chkTermNoTr.getInternalname()), "1")==0) ? 1 : 0) < 0 ) ) || ( ( ((GXutil.strcmp(httpContext.cgiGet( chkTermNoTr.getInternalname()), "1")==0) ? 1 : 0) > 9 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TERMNOTR");
               AnyError = (short)(1) ;
               GX_FocusControl = chkTermNoTr.getInternalname() ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A8678TermNoTr = (byte)(0) ;
               n8678TermNoTr = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A8678TermNoTr", GXutil.str( A8678TermNoTr, 1, 0));
            }
            else
            {
               A8678TermNoTr = (byte)(((GXutil.strcmp(httpContext.cgiGet( chkTermNoTr.getInternalname()), "1")==0) ? 1 : 0)) ;
               n8678TermNoTr = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A8678TermNoTr", GXutil.str( A8678TermNoTr, 1, 0));
            }
            A6721TermLog1 = httpContext.cgiGet( edtTermLog1_Internalname) ;
            n6721TermLog1 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6721TermLog1", A6721TermLog1);
            A6722TermLog2 = httpContext.cgiGet( edtTermLog2_Internalname) ;
            n6722TermLog2 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6722TermLog2", A6722TermLog2);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTermEst_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTermEst_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TERMEST");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTermEst_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A11757TermEst = (byte)(0) ;
               n11757TermEst = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11757TermEst", GXutil.str( A11757TermEst, 1, 0));
            }
            else
            {
               A11757TermEst = (byte)(localUtil.ctol( httpContext.cgiGet( edtTermEst_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n11757TermEst = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11757TermEst", GXutil.str( A11757TermEst, 1, 0));
            }
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            n396EmprCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            A576ImpDsc = httpContext.cgiGet( edtImpDsc_Internalname) ;
            n576ImpDsc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A576ImpDsc", A576ImpDsc);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"TTERMIN");
            A1189TermUsu = httpContext.cgiGet( edtTermUsu_Internalname) ;
            n1189TermUsu = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1189TermUsu", A1189TermUsu);
            forbiddenHiddens.add("TermUsu", GXutil.rtrim( localUtil.format( A1189TermUsu, "@!")));
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( GXutil.strcmp(A942TermCod, Z942TermCod) != 0 ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("ttermin:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               A942TermCod = httpContext.GetPar( "TermCod") ;
               httpContext.ajax_rsp_assign_attri("", false, "A942TermCod", A942TermCod);
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
                  sMode122 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  Gx_mode = sMode122 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound122 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_2Y0( ) ;
                        if ( AnyError == 0 )
                        {
                           GX_FocusControl = bttBtntrn_enter_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noinsert"), 1, "TERMCOD");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtTermCod_Internalname ;
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
                        e112Y2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e122Y2 ();
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
         e122Y2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll2Y122( ) ;
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
         disableAttributes2Y122( ) ;
      }
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

   public void confirm_2Y0( )
   {
      beforeValidate2Y122( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls2Y122( ) ;
         }
         else
         {
            checkExtendedTable2Y122( ) ;
            closeExtendedTableCursors2Y122( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
   }

   public void resetCaption2Y0( )
   {
   }

   public void e112Y2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV16Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN001_", ""), (byte)(99), GXv_char2) ;
      ttermin_impl.this.GXt_char1 = GXv_char2[0] ;
      AV16Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16Lit0", AV16Lit0);
      GXt_char1 = AV17Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN522_", ""), (byte)(99), GXv_char2) ;
      ttermin_impl.this.GXt_char1 = GXv_char2[0] ;
      AV17Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17Lit1", AV17Lit1);
      GXt_char1 = AV18Lit2 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1107_", ""), (byte)(99), GXv_char2) ;
      ttermin_impl.this.GXt_char1 = GXv_char2[0] ;
      AV18Lit2 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18Lit2", AV18Lit2);
      GXt_char1 = AV19Lit3 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN002_", ""), (byte)(99), GXv_char2) ;
      ttermin_impl.this.GXt_char1 = GXv_char2[0] ;
      AV19Lit3 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19Lit3", AV19Lit3);
      AV22Lit4 = AV19Lit3 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22Lit4", AV22Lit4);
      GXt_char1 = AV23Lit5 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN001_", ""), (byte)(99), GXv_char2) ;
      ttermin_impl.this.GXt_char1 = GXv_char2[0] ;
      AV23Lit5 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23Lit5", AV23Lit5);
      GXt_char1 = AV24Lit6 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT79_", ""), (byte)(99), GXv_char2) ;
      ttermin_impl.this.GXt_char1 = GXv_char2[0] ;
      AV24Lit6 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24Lit6", AV24Lit6);
      GXt_char1 = AV28Lit7 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1238_", ""), (byte)(99), GXv_char2) ;
      ttermin_impl.this.GXt_char1 = GXv_char2[0] ;
      AV28Lit7 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28Lit7", AV28Lit7);
      GXt_char1 = AV21LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char2) ;
      ttermin_impl.this.GXt_char1 = GXv_char2[0] ;
      AV21LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21LitFe", AV21LitFe);
      GXt_char1 = AV27Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      ttermin_impl.this.GXt_char1 = GXv_char2[0] ;
      AV27Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27Station", AV27Station);
      GXv_char2[0] = AV25EmprCod ;
      GXv_char3[0] = AV26EmprNom ;
      GXv_char4[0] = AV20UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV27Station, GXv_char2, GXv_char3, GXv_char4) ;
      ttermin_impl.this.AV25EmprCod = GXv_char2[0] ;
      ttermin_impl.this.AV26EmprNom = GXv_char3[0] ;
      ttermin_impl.this.AV20UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25EmprCod", AV25EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV26EmprNom", AV26EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV20UsurCod", AV20UsurCod);
      AV38Insert_EmprCod = AV25EmprCod ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38Insert_EmprCod", AV38Insert_EmprCod);
      GXt_int5 = AV32PesColGX ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV25EmprCod, httpContext.getMessage( "PECOGX", ""), GXv_int6) ;
      ttermin_impl.this.GXt_int5 = GXv_int6[0] ;
      AV32PesColGX = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32PesColGX", GXutil.str( AV32PesColGX, 1, 0));
      chkTermPes.setVisible( AV32PesColGX );
      httpContext.ajax_rsp_assign_prop("", false, chkTermPes.getInternalname(), "Visible", GXutil.ltrimstr( chkTermPes.getVisible(), 5, 0), true);
      GXt_int5 = AV33Bros ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV25EmprCod, httpContext.getMessage( "BROS", ""), GXv_int6) ;
      ttermin_impl.this.GXt_int5 = GXv_int6[0] ;
      AV33Bros = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33Bros", GXutil.str( AV33Bros, 1, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBROS", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV33Bros), "9")));
      GXt_char1 = AV27Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      ttermin_impl.this.GXt_char1 = GXv_char4[0] ;
      AV27Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27Station", AV27Station);
      GXv_char4[0] = AV25EmprCod ;
      GXv_char3[0] = AV26EmprNom ;
      GXv_char2[0] = AV20UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV27Station, GXv_char4, GXv_char3, GXv_char2) ;
      ttermin_impl.this.AV25EmprCod = GXv_char4[0] ;
      ttermin_impl.this.AV26EmprNom = GXv_char3[0] ;
      ttermin_impl.this.AV20UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25EmprCod", AV25EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV26EmprNom", AV26EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV20UsurCod", AV20UsurCod);
      GXv_SdtWWPContext7[0] = AV35WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext7) ;
      AV35WWPContext = GXv_SdtWWPContext7[0] ;
      AV36TrnContext.fromxml(AV37WebSession.getValue("TrnContext"), null, null);
      if ( ( GXutil.strcmp(AV36TrnContext.getgxTv_SdtWWPTransactionContext_Transactionname(), AV44Pgmname) == 0 ) && ( GXutil.strcmp(Gx_mode, "INS") == 0 ) )
      {
         AV45GXV1 = 1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV45GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45GXV1), 8, 0));
         while ( AV45GXV1 <= AV36TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().size() )
         {
            AV40TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)((app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)AV36TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().elementAt(-1+AV45GXV1));
            if ( GXutil.strcmp(AV40TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "EmprCod") == 0 )
            {
               AV38Insert_EmprCod = AV40TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue() ;
               httpContext.ajax_rsp_assign_attri("", false, "AV38Insert_EmprCod", AV38Insert_EmprCod);
            }
            else if ( GXutil.strcmp(AV40TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "ImpCod") == 0 )
            {
               AV39Insert_ImpCod = AV40TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue() ;
               httpContext.ajax_rsp_assign_attri("", false, "AV39Insert_ImpCod", AV39Insert_ImpCod);
            }
            AV45GXV1 = (int)(AV45GXV1+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV45GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45GXV1), 8, 0));
         }
      }
      edtEmprCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Visible), 5, 0), true);
      edtEmprNom_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Visible), 5, 0), true);
      edtImpDsc_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtImpDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtImpDsc_Visible), 5, 0), true);
   }

   public void e122Y2( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV36TrnContext.getgxTv_SdtWWPTransactionContext_Callerondelete() )
      {
         callWebObject(formatLink("app.tterminww", new String[] {}, new String[] {}) );
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

   public void zm2Y122( int GX_JID )
   {
      if ( ( GX_JID == 26 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z8899TermPes = T002Y3_A8899TermPes[0] ;
            Z8898TermDsc = T002Y3_A8898TermDsc[0] ;
            Z1189TermUsu = T002Y3_A1189TermUsu[0] ;
            Z1441ImpCod1 = T002Y3_A1441ImpCod1[0] ;
            Z1442ImpCod2 = T002Y3_A1442ImpCod2[0] ;
            Z1443ImpCod3 = T002Y3_A1443ImpCod3[0] ;
            Z1444ImpCod4 = T002Y3_A1444ImpCod4[0] ;
            Z1445ImpCod5 = T002Y3_A1445ImpCod5[0] ;
            Z1446ImpLpt1 = T002Y3_A1446ImpLpt1[0] ;
            Z1447ImpLpt2 = T002Y3_A1447ImpLpt2[0] ;
            Z1448ImpLpt3 = T002Y3_A1448ImpLpt3[0] ;
            Z1449ImpLpt4 = T002Y3_A1449ImpLpt4[0] ;
            Z1450ImpLpt5 = T002Y3_A1450ImpLpt5[0] ;
            Z6112TermBol = T002Y3_A6112TermBol[0] ;
            Z6113TermBal = T002Y3_A6113TermBal[0] ;
            Z8678TermNoTr = T002Y3_A8678TermNoTr[0] ;
            Z6721TermLog1 = T002Y3_A6721TermLog1[0] ;
            Z6722TermLog2 = T002Y3_A6722TermLog2[0] ;
            Z11757TermEst = T002Y3_A11757TermEst[0] ;
            Z11758TermFec = T002Y3_A11758TermFec[0] ;
            Z574ImpCod = T002Y3_A574ImpCod[0] ;
            Z396EmprCod = T002Y3_A396EmprCod[0] ;
         }
         else
         {
            Z8899TermPes = A8899TermPes ;
            Z8898TermDsc = A8898TermDsc ;
            Z1189TermUsu = A1189TermUsu ;
            Z1441ImpCod1 = A1441ImpCod1 ;
            Z1442ImpCod2 = A1442ImpCod2 ;
            Z1443ImpCod3 = A1443ImpCod3 ;
            Z1444ImpCod4 = A1444ImpCod4 ;
            Z1445ImpCod5 = A1445ImpCod5 ;
            Z1446ImpLpt1 = A1446ImpLpt1 ;
            Z1447ImpLpt2 = A1447ImpLpt2 ;
            Z1448ImpLpt3 = A1448ImpLpt3 ;
            Z1449ImpLpt4 = A1449ImpLpt4 ;
            Z1450ImpLpt5 = A1450ImpLpt5 ;
            Z6112TermBol = A6112TermBol ;
            Z6113TermBal = A6113TermBal ;
            Z8678TermNoTr = A8678TermNoTr ;
            Z6721TermLog1 = A6721TermLog1 ;
            Z6722TermLog2 = A6722TermLog2 ;
            Z11757TermEst = A11757TermEst ;
            Z11758TermFec = A11758TermFec ;
            Z574ImpCod = A574ImpCod ;
            Z396EmprCod = A396EmprCod ;
         }
      }
      if ( GX_JID == -26 )
      {
         Z942TermCod = A942TermCod ;
         Z8899TermPes = A8899TermPes ;
         Z8898TermDsc = A8898TermDsc ;
         Z1189TermUsu = A1189TermUsu ;
         Z1441ImpCod1 = A1441ImpCod1 ;
         Z1442ImpCod2 = A1442ImpCod2 ;
         Z1443ImpCod3 = A1443ImpCod3 ;
         Z1444ImpCod4 = A1444ImpCod4 ;
         Z1445ImpCod5 = A1445ImpCod5 ;
         Z1446ImpLpt1 = A1446ImpLpt1 ;
         Z1447ImpLpt2 = A1447ImpLpt2 ;
         Z1448ImpLpt3 = A1448ImpLpt3 ;
         Z1449ImpLpt4 = A1449ImpLpt4 ;
         Z1450ImpLpt5 = A1450ImpLpt5 ;
         Z6112TermBol = A6112TermBol ;
         Z6113TermBal = A6113TermBal ;
         Z8678TermNoTr = A8678TermNoTr ;
         Z6721TermLog1 = A6721TermLog1 ;
         Z6722TermLog2 = A6722TermLog2 ;
         Z11757TermEst = A11757TermEst ;
         Z11758TermFec = A11758TermFec ;
         Z574ImpCod = A574ImpCod ;
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
         Z576ImpDsc = A576ImpDsc ;
      }
   }

   public void standaloneNotModal( )
   {
      edtTermUsu_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTermUsu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTermUsu_Enabled), 5, 0), true);
      AV44Pgmname = "TTERMIN" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV44Pgmname", AV44Pgmname);
      edtTermUsu_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTermUsu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTermUsu_Enabled), 5, 0), true);
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV34TermCod)==0) )
      {
         A942TermCod = AV34TermCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A942TermCod", A942TermCod);
      }
      if ( ! (GXutil.strcmp("", AV34TermCod)==0) )
      {
         edtTermCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTermCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTermCod_Enabled), 5, 0), true);
      }
      else
      {
         edtTermCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTermCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTermCod_Enabled), 5, 0), true);
      }
      if ( ! (GXutil.strcmp("", AV34TermCod)==0) )
      {
         edtTermCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTermCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTermCod_Enabled), 5, 0), true);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (GXutil.strcmp("", AV38Insert_EmprCod)==0) )
      {
         edtEmprCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      }
      else
      {
         edtEmprCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      }
      if ( AV32PesColGX == 0 )
      {
         chkTermPes.setEnabled( 0 );
         httpContext.ajax_rsp_assign_prop("", false, chkTermPes.getInternalname(), "Enabled", GXutil.ltrimstr( chkTermPes.getEnabled(), 5, 0), true);
      }
      else
      {
         chkTermPes.setEnabled( 1 );
         httpContext.ajax_rsp_assign_prop("", false, chkTermPes.getInternalname(), "Enabled", GXutil.ltrimstr( chkTermPes.getEnabled(), 5, 0), true);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (GXutil.strcmp("", AV39Insert_ImpCod)==0) )
      {
         edtImpCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtImpCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtImpCod_Enabled), 5, 0), true);
      }
      else
      {
         edtImpCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtImpCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtImpCod_Enabled), 5, 0), true);
      }
   }

   public void standaloneModal( )
   {
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (GXutil.strcmp("", AV39Insert_ImpCod)==0) )
      {
         A574ImpCod = AV39Insert_ImpCod ;
         n574ImpCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A574ImpCod", A574ImpCod);
         /* Using cursor T002Y6 */
         pr_default.execute(4, new Object[] {Boolean.valueOf(n574ImpCod), A574ImpCod});
         h574ImpCod = "" ;
         while ( (pr_default.getStatus(4) != 101) )
         {
            h574ImpCod = T002Y6_A13879ImpCDsc[0] ;
            if (true) break;
         }
         pr_default.close(4);
         httpContext.ajax_rsp_assign_attri("", false, "h574ImpCod", h574ImpCod);
      }
      if ( AV32PesColGX == 0 )
      {
         A8899TermPes = (byte)(0) ;
         n8899TermPes = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A8899TermPes", GXutil.str( A8899TermPes, 1, 0));
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (GXutil.strcmp("", AV38Insert_EmprCod)==0) )
      {
         A396EmprCod = AV38Insert_EmprCod ;
         n396EmprCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
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
         /* Using cursor T002Y4 */
         pr_default.execute(2, new Object[] {Boolean.valueOf(n574ImpCod), A574ImpCod});
         A576ImpDsc = T002Y4_A576ImpDsc[0] ;
         n576ImpDsc = T002Y4_n576ImpDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A576ImpDsc", A576ImpDsc);
         pr_default.close(2);
         /* Using cursor T002Y5 */
         pr_default.execute(3, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod});
         A407EmprNom = T002Y5_A407EmprNom[0] ;
         n407EmprNom = T002Y5_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         pr_default.close(3);
         GXt_int5 = (byte)(DecimalUtil.decToDouble(AV30Sedamil)) ;
         GXv_int6[0] = GXt_int5 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "SEDAMI", ""), ""), GXv_int6) ;
         ttermin_impl.this.GXt_int5 = GXv_int6[0] ;
         AV30Sedamil = DecimalUtil.doubleToDec(GXt_int5) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV30Sedamil", GXutil.ltrimstr( AV30Sedamil, 10, 2));
         if ( AV30Sedamil.doubleValue() == 1 )
         {
            edtTermBol_Caption = httpContext.getMessage( httpContext.getMessage( "Intermec", ""), "") ;
            httpContext.ajax_rsp_assign_prop("", false, edtTermBol_Internalname, "Caption", edtTermBol_Caption, true);
         }
         GXt_int5 = AV29Cladd ;
         GXv_int6[0] = GXt_int5 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "CLADD", ""), ""), GXv_int6) ;
         ttermin_impl.this.GXt_int5 = GXv_int6[0] ;
         AV29Cladd = GXt_int5 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV29Cladd", GXutil.str( AV29Cladd, 1, 0));
         if ( ! ( ( AV29Cladd == 1 ) ) )
         {
            chkTermNoTr.setVisible( 0 );
            httpContext.ajax_rsp_assign_prop("", false, chkTermNoTr.getInternalname(), "Visible", GXutil.ltrimstr( chkTermNoTr.getVisible(), 5, 0), true);
         }
         else
         {
            if ( AV29Cladd == 1 )
            {
               chkTermNoTr.setVisible( 1 );
               httpContext.ajax_rsp_assign_prop("", false, chkTermNoTr.getInternalname(), "Visible", GXutil.ltrimstr( chkTermNoTr.getVisible(), 5, 0), true);
            }
         }
         if ( ( AV29Cladd == 1 ) || ( AV30Sedamil.doubleValue() == 1 ) )
         {
            edtTermBol_Visible = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtTermBol_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTermBol_Visible), 5, 0), true);
         }
         else
         {
            if ( ! ( ( AV29Cladd == 1 ) || ( AV30Sedamil.doubleValue() == 1 ) ) )
            {
               edtTermBol_Visible = 0 ;
               httpContext.ajax_rsp_assign_prop("", false, edtTermBol_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTermBol_Visible), 5, 0), true);
            }
         }
         if ( ( AV29Cladd == 1 ) || ( AV30Sedamil.doubleValue() == 1 ) )
         {
            edtTermLog1_Visible = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtTermLog1_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTermLog1_Visible), 5, 0), true);
         }
         else
         {
            if ( ! ( ( AV29Cladd == 1 ) || ( AV30Sedamil.doubleValue() == 1 ) ) )
            {
               edtTermLog1_Visible = 0 ;
               httpContext.ajax_rsp_assign_prop("", false, edtTermLog1_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTermLog1_Visible), 5, 0), true);
            }
            else
            {
               edtTermLog1_Visible = AV29Cladd ;
               httpContext.ajax_rsp_assign_prop("", false, edtTermLog1_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTermLog1_Visible), 5, 0), true);
            }
         }
         edtTermLog2_Visible = AV29Cladd ;
         httpContext.ajax_rsp_assign_prop("", false, edtTermLog2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTermLog2_Visible), 5, 0), true);
         GXt_int5 = (byte)(DecimalUtil.decToDouble(AV31Artextil)) ;
         GXv_int6[0] = GXt_int5 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "ARTEXT", ""), ""), GXv_int6) ;
         ttermin_impl.this.GXt_int5 = GXv_int6[0] ;
         AV31Artextil = DecimalUtil.doubleToDec(GXt_int5) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV31Artextil", GXutil.ltrimstr( AV31Artextil, 10, 2));
         if ( ( AV29Cladd == 1 ) || ( AV30Sedamil.doubleValue() == 1 ) || ( AV31Artextil.doubleValue() == 1 ) )
         {
            edtTermBal_Visible = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtTermBal_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTermBal_Visible), 5, 0), true);
         }
         else
         {
            if ( ! ( ( AV29Cladd == 1 ) || ( AV30Sedamil.doubleValue() == 1 ) || ( AV31Artextil.doubleValue() == 1 ) ) )
            {
               edtTermBal_Visible = 0 ;
               httpContext.ajax_rsp_assign_prop("", false, edtTermBal_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTermBal_Visible), 5, 0), true);
            }
         }
      }
   }

   public void load2Y122( )
   {
      /* Using cursor T002Y7 */
      pr_default.execute(5, new Object[] {A942TermCod});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound122 = (short)(1) ;
         A8899TermPes = T002Y7_A8899TermPes[0] ;
         n8899TermPes = T002Y7_n8899TermPes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8899TermPes", GXutil.str( A8899TermPes, 1, 0));
         A407EmprNom = T002Y7_A407EmprNom[0] ;
         n407EmprNom = T002Y7_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A8898TermDsc = T002Y7_A8898TermDsc[0] ;
         n8898TermDsc = T002Y7_n8898TermDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8898TermDsc", A8898TermDsc);
         A576ImpDsc = T002Y7_A576ImpDsc[0] ;
         n576ImpDsc = T002Y7_n576ImpDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A576ImpDsc", A576ImpDsc);
         A1189TermUsu = T002Y7_A1189TermUsu[0] ;
         n1189TermUsu = T002Y7_n1189TermUsu[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1189TermUsu", A1189TermUsu);
         A1441ImpCod1 = T002Y7_A1441ImpCod1[0] ;
         n1441ImpCod1 = T002Y7_n1441ImpCod1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1441ImpCod1", A1441ImpCod1);
         A1442ImpCod2 = T002Y7_A1442ImpCod2[0] ;
         n1442ImpCod2 = T002Y7_n1442ImpCod2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1442ImpCod2", A1442ImpCod2);
         A1443ImpCod3 = T002Y7_A1443ImpCod3[0] ;
         n1443ImpCod3 = T002Y7_n1443ImpCod3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1443ImpCod3", A1443ImpCod3);
         A1444ImpCod4 = T002Y7_A1444ImpCod4[0] ;
         n1444ImpCod4 = T002Y7_n1444ImpCod4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1444ImpCod4", A1444ImpCod4);
         A1445ImpCod5 = T002Y7_A1445ImpCod5[0] ;
         n1445ImpCod5 = T002Y7_n1445ImpCod5[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1445ImpCod5", A1445ImpCod5);
         A1446ImpLpt1 = T002Y7_A1446ImpLpt1[0] ;
         n1446ImpLpt1 = T002Y7_n1446ImpLpt1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1446ImpLpt1", A1446ImpLpt1);
         A1447ImpLpt2 = T002Y7_A1447ImpLpt2[0] ;
         n1447ImpLpt2 = T002Y7_n1447ImpLpt2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1447ImpLpt2", A1447ImpLpt2);
         A1448ImpLpt3 = T002Y7_A1448ImpLpt3[0] ;
         n1448ImpLpt3 = T002Y7_n1448ImpLpt3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1448ImpLpt3", A1448ImpLpt3);
         A1449ImpLpt4 = T002Y7_A1449ImpLpt4[0] ;
         n1449ImpLpt4 = T002Y7_n1449ImpLpt4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1449ImpLpt4", A1449ImpLpt4);
         A1450ImpLpt5 = T002Y7_A1450ImpLpt5[0] ;
         n1450ImpLpt5 = T002Y7_n1450ImpLpt5[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1450ImpLpt5", A1450ImpLpt5);
         A6112TermBol = T002Y7_A6112TermBol[0] ;
         n6112TermBol = T002Y7_n6112TermBol[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6112TermBol", GXutil.str( A6112TermBol, 1, 0));
         A6113TermBal = T002Y7_A6113TermBal[0] ;
         n6113TermBal = T002Y7_n6113TermBal[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6113TermBal", GXutil.str( A6113TermBal, 1, 0));
         A8678TermNoTr = T002Y7_A8678TermNoTr[0] ;
         n8678TermNoTr = T002Y7_n8678TermNoTr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8678TermNoTr", GXutil.str( A8678TermNoTr, 1, 0));
         A6721TermLog1 = T002Y7_A6721TermLog1[0] ;
         n6721TermLog1 = T002Y7_n6721TermLog1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6721TermLog1", A6721TermLog1);
         A6722TermLog2 = T002Y7_A6722TermLog2[0] ;
         n6722TermLog2 = T002Y7_n6722TermLog2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6722TermLog2", A6722TermLog2);
         A11757TermEst = T002Y7_A11757TermEst[0] ;
         n11757TermEst = T002Y7_n11757TermEst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11757TermEst", GXutil.str( A11757TermEst, 1, 0));
         A11758TermFec = T002Y7_A11758TermFec[0] ;
         n11758TermFec = T002Y7_n11758TermFec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11758TermFec", localUtil.ttoc( A11758TermFec, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A574ImpCod = T002Y7_A574ImpCod[0] ;
         n574ImpCod = T002Y7_n574ImpCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A574ImpCod", A574ImpCod);
         A396EmprCod = T002Y7_A396EmprCod[0] ;
         n396EmprCod = T002Y7_n396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         zm2Y122( -26) ;
      }
      pr_default.close(5);
      onLoadActions2Y122( ) ;
   }

   public void onLoadActions2Y122( )
   {
      GXt_int5 = (byte)(DecimalUtil.decToDouble(AV30Sedamil)) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "SEDAMI", ""), ""), GXv_int6) ;
      ttermin_impl.this.GXt_int5 = GXv_int6[0] ;
      AV30Sedamil = DecimalUtil.doubleToDec(GXt_int5) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30Sedamil", GXutil.ltrimstr( AV30Sedamil, 10, 2));
      if ( AV30Sedamil.doubleValue() == 1 )
      {
         edtTermBol_Caption = httpContext.getMessage( httpContext.getMessage( "Intermec", ""), "") ;
         httpContext.ajax_rsp_assign_prop("", false, edtTermBol_Internalname, "Caption", edtTermBol_Caption, true);
      }
      GXt_int5 = AV29Cladd ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "CLADD", ""), ""), GXv_int6) ;
      ttermin_impl.this.GXt_int5 = GXv_int6[0] ;
      AV29Cladd = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29Cladd", GXutil.str( AV29Cladd, 1, 0));
      if ( ! ( ( AV29Cladd == 1 ) ) )
      {
         chkTermNoTr.setVisible( 0 );
         httpContext.ajax_rsp_assign_prop("", false, chkTermNoTr.getInternalname(), "Visible", GXutil.ltrimstr( chkTermNoTr.getVisible(), 5, 0), true);
      }
      else
      {
         if ( AV29Cladd == 1 )
         {
            chkTermNoTr.setVisible( 1 );
            httpContext.ajax_rsp_assign_prop("", false, chkTermNoTr.getInternalname(), "Visible", GXutil.ltrimstr( chkTermNoTr.getVisible(), 5, 0), true);
         }
      }
      if ( ( AV29Cladd == 1 ) || ( AV30Sedamil.doubleValue() == 1 ) )
      {
         edtTermBol_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTermBol_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTermBol_Visible), 5, 0), true);
      }
      else
      {
         if ( ! ( ( AV29Cladd == 1 ) || ( AV30Sedamil.doubleValue() == 1 ) ) )
         {
            edtTermBol_Visible = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtTermBol_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTermBol_Visible), 5, 0), true);
         }
      }
      if ( ( AV29Cladd == 1 ) || ( AV30Sedamil.doubleValue() == 1 ) )
      {
         edtTermLog1_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTermLog1_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTermLog1_Visible), 5, 0), true);
      }
      else
      {
         if ( ! ( ( AV29Cladd == 1 ) || ( AV30Sedamil.doubleValue() == 1 ) ) )
         {
            edtTermLog1_Visible = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtTermLog1_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTermLog1_Visible), 5, 0), true);
         }
         else
         {
            edtTermLog1_Visible = AV29Cladd ;
            httpContext.ajax_rsp_assign_prop("", false, edtTermLog1_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTermLog1_Visible), 5, 0), true);
         }
      }
      edtTermLog2_Visible = AV29Cladd ;
      httpContext.ajax_rsp_assign_prop("", false, edtTermLog2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTermLog2_Visible), 5, 0), true);
      GXt_int5 = (byte)(DecimalUtil.decToDouble(AV31Artextil)) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "ARTEXT", ""), ""), GXv_int6) ;
      ttermin_impl.this.GXt_int5 = GXv_int6[0] ;
      AV31Artextil = DecimalUtil.doubleToDec(GXt_int5) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31Artextil", GXutil.ltrimstr( AV31Artextil, 10, 2));
      if ( ( AV29Cladd == 1 ) || ( AV30Sedamil.doubleValue() == 1 ) || ( AV31Artextil.doubleValue() == 1 ) )
      {
         edtTermBal_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTermBal_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTermBal_Visible), 5, 0), true);
      }
      else
      {
         if ( ! ( ( AV29Cladd == 1 ) || ( AV30Sedamil.doubleValue() == 1 ) || ( AV31Artextil.doubleValue() == 1 ) ) )
         {
            edtTermBal_Visible = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtTermBal_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTermBal_Visible), 5, 0), true);
         }
      }
      /* Using cursor T002Y8 */
      pr_default.execute(6, new Object[] {Boolean.valueOf(n574ImpCod), A574ImpCod});
      h574ImpCod = "" ;
      while ( (pr_default.getStatus(6) != 101) )
      {
         h574ImpCod = T002Y8_A13879ImpCDsc[0] ;
         if (true) break;
      }
      pr_default.close(6);
      httpContext.ajax_rsp_assign_attri("", false, "h574ImpCod", h574ImpCod);
   }

   public void checkExtendedTable2Y122( )
   {
      nIsDirty_122 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      if ( (GXutil.strcmp("", h574ImpCod)==0) )
      {
         nIsDirty_122 = (short)(1) ;
         A574ImpCod = "" ;
         n574ImpCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A574ImpCod", A574ImpCod);
      }
      else
      {
         A13879ImpCDsc = h574ImpCod ;
         /* Using cursor T002Y9 */
         pr_default.execute(7, new Object[] {A13879ImpCDsc});
         A574ImpCod = T002Y9_A574ImpCod[0] ;
         n574ImpCod = T002Y9_n574ImpCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A574ImpCod", A574ImpCod);
         A574ImpCod = T002Y9_A574ImpCod[0] ;
         n574ImpCod = T002Y9_n574ImpCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A574ImpCod", A574ImpCod);
         if ( ! ( (pr_default.getStatus(7) == 101) ) )
         {
            pr_default.readNext(7);
            if ( ! ( (pr_default.getStatus(7) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo Descripcion", "")}), 1, "IMPCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtImpCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
         }
         pr_default.close(7);
      }
      httpContext.ajax_rsp_assign_attri("", false, "h574ImpCod", h574ImpCod);
      /* Using cursor T002Y5 */
      pr_default.execute(3, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod});
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T002Y5_A407EmprNom[0] ;
      n407EmprNom = T002Y5_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(3);
      GXt_int5 = (byte)(DecimalUtil.decToDouble(AV30Sedamil)) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "SEDAMI", ""), ""), GXv_int6) ;
      ttermin_impl.this.GXt_int5 = GXv_int6[0] ;
      AV30Sedamil = DecimalUtil.doubleToDec(GXt_int5) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30Sedamil", GXutil.ltrimstr( AV30Sedamil, 10, 2));
      if ( AV30Sedamil.doubleValue() == 1 )
      {
         edtTermBol_Caption = httpContext.getMessage( httpContext.getMessage( "Intermec", ""), "") ;
         httpContext.ajax_rsp_assign_prop("", false, edtTermBol_Internalname, "Caption", edtTermBol_Caption, true);
      }
      GXt_int5 = AV29Cladd ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "CLADD", ""), ""), GXv_int6) ;
      ttermin_impl.this.GXt_int5 = GXv_int6[0] ;
      AV29Cladd = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29Cladd", GXutil.str( AV29Cladd, 1, 0));
      if ( ! ( ( AV29Cladd == 1 ) ) )
      {
         chkTermNoTr.setVisible( 0 );
         httpContext.ajax_rsp_assign_prop("", false, chkTermNoTr.getInternalname(), "Visible", GXutil.ltrimstr( chkTermNoTr.getVisible(), 5, 0), true);
      }
      else
      {
         if ( AV29Cladd == 1 )
         {
            chkTermNoTr.setVisible( 1 );
            httpContext.ajax_rsp_assign_prop("", false, chkTermNoTr.getInternalname(), "Visible", GXutil.ltrimstr( chkTermNoTr.getVisible(), 5, 0), true);
         }
      }
      if ( ( AV29Cladd == 1 ) || ( AV30Sedamil.doubleValue() == 1 ) )
      {
         edtTermBol_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTermBol_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTermBol_Visible), 5, 0), true);
      }
      else
      {
         if ( ! ( ( AV29Cladd == 1 ) || ( AV30Sedamil.doubleValue() == 1 ) ) )
         {
            edtTermBol_Visible = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtTermBol_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTermBol_Visible), 5, 0), true);
         }
      }
      if ( ( AV29Cladd == 1 ) || ( AV30Sedamil.doubleValue() == 1 ) )
      {
         edtTermLog1_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTermLog1_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTermLog1_Visible), 5, 0), true);
      }
      else
      {
         if ( ! ( ( AV29Cladd == 1 ) || ( AV30Sedamil.doubleValue() == 1 ) ) )
         {
            edtTermLog1_Visible = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtTermLog1_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTermLog1_Visible), 5, 0), true);
         }
         else
         {
            edtTermLog1_Visible = AV29Cladd ;
            httpContext.ajax_rsp_assign_prop("", false, edtTermLog1_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTermLog1_Visible), 5, 0), true);
         }
      }
      edtTermLog2_Visible = AV29Cladd ;
      httpContext.ajax_rsp_assign_prop("", false, edtTermLog2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTermLog2_Visible), 5, 0), true);
      GXt_int5 = (byte)(DecimalUtil.decToDouble(AV31Artextil)) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "ARTEXT", ""), ""), GXv_int6) ;
      ttermin_impl.this.GXt_int5 = GXv_int6[0] ;
      AV31Artextil = DecimalUtil.doubleToDec(GXt_int5) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31Artextil", GXutil.ltrimstr( AV31Artextil, 10, 2));
      if ( ( AV29Cladd == 1 ) || ( AV30Sedamil.doubleValue() == 1 ) || ( AV31Artextil.doubleValue() == 1 ) )
      {
         edtTermBal_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTermBal_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTermBal_Visible), 5, 0), true);
      }
      else
      {
         if ( ! ( ( AV29Cladd == 1 ) || ( AV30Sedamil.doubleValue() == 1 ) || ( AV31Artextil.doubleValue() == 1 ) ) )
         {
            edtTermBal_Visible = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtTermBal_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTermBal_Visible), 5, 0), true);
         }
      }
      if ( (GXutil.strcmp("", h574ImpCod)==0) )
      {
         nIsDirty_122 = (short)(1) ;
         A574ImpCod = "" ;
         n574ImpCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A574ImpCod", A574ImpCod);
      }
      else
      {
         A13879ImpCDsc = h574ImpCod ;
         /* Using cursor T002Y10 */
         pr_default.execute(8, new Object[] {A13879ImpCDsc});
         A574ImpCod = T002Y10_A574ImpCod[0] ;
         n574ImpCod = T002Y10_n574ImpCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A574ImpCod", A574ImpCod);
         A574ImpCod = T002Y10_A574ImpCod[0] ;
         n574ImpCod = T002Y10_n574ImpCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A574ImpCod", A574ImpCod);
         if ( ! ( (pr_default.getStatus(8) == 101) ) )
         {
            pr_default.readNext(8);
            if ( ! ( (pr_default.getStatus(8) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo Descripcion", "")}), 1, "IMPCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtImpCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
         }
         pr_default.close(8);
      }
      httpContext.ajax_rsp_assign_attri("", false, "h574ImpCod", h574ImpCod);
      /* Using cursor T002Y4 */
      pr_default.execute(2, new Object[] {Boolean.valueOf(n574ImpCod), A574ImpCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "IMPRES", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "IMPCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtImpCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A576ImpDsc = T002Y4_A576ImpDsc[0] ;
      n576ImpDsc = T002Y4_n576ImpDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A576ImpDsc", A576ImpDsc);
      pr_default.close(2);
   }

   public void closeExtendedTableCursors2Y122( )
   {
      pr_default.close(3);
      pr_default.close(2);
   }

   public void enableDisable( )
   {
   }

   public void gxload_28( String A396EmprCod )
   {
      /* Using cursor T002Y11 */
      pr_default.execute(9, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod});
      if ( (pr_default.getStatus(9) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T002Y11_A407EmprNom[0] ;
      n407EmprNom = T002Y11_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A407EmprNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(9) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(9);
   }

   public void gxload_27( String A574ImpCod )
   {
      /* Using cursor T002Y12 */
      pr_default.execute(10, new Object[] {Boolean.valueOf(n574ImpCod), A574ImpCod});
      if ( (pr_default.getStatus(10) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "IMPRES", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "IMPCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtImpCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A576ImpDsc = T002Y12_A576ImpDsc[0] ;
      n576ImpDsc = T002Y12_n576ImpDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A576ImpDsc", A576ImpDsc);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A576ImpDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(10) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(10);
   }

   public void getKey2Y122( )
   {
      /* Using cursor T002Y13 */
      pr_default.execute(11, new Object[] {A942TermCod});
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound122 = (short)(1) ;
      }
      else
      {
         RcdFound122 = (short)(0) ;
      }
      pr_default.close(11);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T002Y3 */
      pr_default.execute(1, new Object[] {A942TermCod});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm2Y122( 26) ;
         RcdFound122 = (short)(1) ;
         A942TermCod = T002Y3_A942TermCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A942TermCod", A942TermCod);
         A8899TermPes = T002Y3_A8899TermPes[0] ;
         n8899TermPes = T002Y3_n8899TermPes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8899TermPes", GXutil.str( A8899TermPes, 1, 0));
         A8898TermDsc = T002Y3_A8898TermDsc[0] ;
         n8898TermDsc = T002Y3_n8898TermDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8898TermDsc", A8898TermDsc);
         A1189TermUsu = T002Y3_A1189TermUsu[0] ;
         n1189TermUsu = T002Y3_n1189TermUsu[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1189TermUsu", A1189TermUsu);
         A1441ImpCod1 = T002Y3_A1441ImpCod1[0] ;
         n1441ImpCod1 = T002Y3_n1441ImpCod1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1441ImpCod1", A1441ImpCod1);
         A1442ImpCod2 = T002Y3_A1442ImpCod2[0] ;
         n1442ImpCod2 = T002Y3_n1442ImpCod2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1442ImpCod2", A1442ImpCod2);
         A1443ImpCod3 = T002Y3_A1443ImpCod3[0] ;
         n1443ImpCod3 = T002Y3_n1443ImpCod3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1443ImpCod3", A1443ImpCod3);
         A1444ImpCod4 = T002Y3_A1444ImpCod4[0] ;
         n1444ImpCod4 = T002Y3_n1444ImpCod4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1444ImpCod4", A1444ImpCod4);
         A1445ImpCod5 = T002Y3_A1445ImpCod5[0] ;
         n1445ImpCod5 = T002Y3_n1445ImpCod5[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1445ImpCod5", A1445ImpCod5);
         A1446ImpLpt1 = T002Y3_A1446ImpLpt1[0] ;
         n1446ImpLpt1 = T002Y3_n1446ImpLpt1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1446ImpLpt1", A1446ImpLpt1);
         A1447ImpLpt2 = T002Y3_A1447ImpLpt2[0] ;
         n1447ImpLpt2 = T002Y3_n1447ImpLpt2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1447ImpLpt2", A1447ImpLpt2);
         A1448ImpLpt3 = T002Y3_A1448ImpLpt3[0] ;
         n1448ImpLpt3 = T002Y3_n1448ImpLpt3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1448ImpLpt3", A1448ImpLpt3);
         A1449ImpLpt4 = T002Y3_A1449ImpLpt4[0] ;
         n1449ImpLpt4 = T002Y3_n1449ImpLpt4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1449ImpLpt4", A1449ImpLpt4);
         A1450ImpLpt5 = T002Y3_A1450ImpLpt5[0] ;
         n1450ImpLpt5 = T002Y3_n1450ImpLpt5[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1450ImpLpt5", A1450ImpLpt5);
         A6112TermBol = T002Y3_A6112TermBol[0] ;
         n6112TermBol = T002Y3_n6112TermBol[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6112TermBol", GXutil.str( A6112TermBol, 1, 0));
         A6113TermBal = T002Y3_A6113TermBal[0] ;
         n6113TermBal = T002Y3_n6113TermBal[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6113TermBal", GXutil.str( A6113TermBal, 1, 0));
         A8678TermNoTr = T002Y3_A8678TermNoTr[0] ;
         n8678TermNoTr = T002Y3_n8678TermNoTr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8678TermNoTr", GXutil.str( A8678TermNoTr, 1, 0));
         A6721TermLog1 = T002Y3_A6721TermLog1[0] ;
         n6721TermLog1 = T002Y3_n6721TermLog1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6721TermLog1", A6721TermLog1);
         A6722TermLog2 = T002Y3_A6722TermLog2[0] ;
         n6722TermLog2 = T002Y3_n6722TermLog2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6722TermLog2", A6722TermLog2);
         A11757TermEst = T002Y3_A11757TermEst[0] ;
         n11757TermEst = T002Y3_n11757TermEst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11757TermEst", GXutil.str( A11757TermEst, 1, 0));
         A11758TermFec = T002Y3_A11758TermFec[0] ;
         n11758TermFec = T002Y3_n11758TermFec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11758TermFec", localUtil.ttoc( A11758TermFec, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A574ImpCod = T002Y3_A574ImpCod[0] ;
         n574ImpCod = T002Y3_n574ImpCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A574ImpCod", A574ImpCod);
         A396EmprCod = T002Y3_A396EmprCod[0] ;
         n396EmprCod = T002Y3_n396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         Z942TermCod = A942TermCod ;
         sMode122 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load2Y122( ) ;
         if ( AnyError == 1 )
         {
            RcdFound122 = (short)(0) ;
            initializeNonKey2Y122( ) ;
         }
         Gx_mode = sMode122 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound122 = (short)(0) ;
         initializeNonKey2Y122( ) ;
         sMode122 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode122 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey2Y122( ) ;
      if ( RcdFound122 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound122 = (short)(0) ;
      /* Using cursor T002Y14 */
      pr_default.execute(12, new Object[] {A942TermCod});
      if ( (pr_default.getStatus(12) != 101) )
      {
         while ( (pr_default.getStatus(12) != 101) && ( ( GXutil.strcmp(T002Y14_A942TermCod[0], A942TermCod) < 0 ) ) )
         {
            pr_default.readNext(12);
         }
         if ( (pr_default.getStatus(12) != 101) && ( ( GXutil.strcmp(T002Y14_A942TermCod[0], A942TermCod) > 0 ) ) )
         {
            A942TermCod = T002Y14_A942TermCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A942TermCod", A942TermCod);
            RcdFound122 = (short)(1) ;
         }
      }
      pr_default.close(12);
   }

   public void move_previous( )
   {
      RcdFound122 = (short)(0) ;
      /* Using cursor T002Y15 */
      pr_default.execute(13, new Object[] {A942TermCod});
      if ( (pr_default.getStatus(13) != 101) )
      {
         while ( (pr_default.getStatus(13) != 101) && ( ( GXutil.strcmp(T002Y15_A942TermCod[0], A942TermCod) > 0 ) ) )
         {
            pr_default.readNext(13);
         }
         if ( (pr_default.getStatus(13) != 101) && ( ( GXutil.strcmp(T002Y15_A942TermCod[0], A942TermCod) < 0 ) ) )
         {
            A942TermCod = T002Y15_A942TermCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A942TermCod", A942TermCod);
            RcdFound122 = (short)(1) ;
         }
      }
      pr_default.close(13);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey2Y122( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtTermCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert2Y122( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound122 == 1 )
         {
            if ( GXutil.strcmp(A942TermCod, Z942TermCod) != 0 )
            {
               A942TermCod = Z942TermCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A942TermCod", A942TermCod);
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "TERMCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTermCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtTermCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               update2Y122( ) ;
               GX_FocusControl = edtTermCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( GXutil.strcmp(A942TermCod, Z942TermCod) != 0 )
            {
               /* Insert record */
               GX_FocusControl = edtTermCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert2Y122( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "TERMCOD");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtTermCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  /* Insert record */
                  GX_FocusControl = edtTermCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert2Y122( ) ;
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
      if ( GXutil.strcmp(A942TermCod, Z942TermCod) != 0 )
      {
         A942TermCod = Z942TermCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A942TermCod", A942TermCod);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "TERMCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTermCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtTermCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency2Y122( )
   {
      if ( isDlt( ) )
      {
         if ( (GXutil.strcmp("", h574ImpCod)==0) )
         {
            A574ImpCod = "" ;
            n574ImpCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A574ImpCod", A574ImpCod);
         }
         else
         {
            A13879ImpCDsc = h574ImpCod ;
            /* Using cursor T002Y16 */
            pr_default.execute(14, new Object[] {A13879ImpCDsc});
            A574ImpCod = T002Y16_A574ImpCod[0] ;
            n574ImpCod = T002Y16_n574ImpCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A574ImpCod", A574ImpCod);
            A574ImpCod = T002Y16_A574ImpCod[0] ;
            n574ImpCod = T002Y16_n574ImpCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A574ImpCod", A574ImpCod);
            if ( ! ( (pr_default.getStatus(14) == 101) ) )
            {
               pr_default.readNext(14);
               if ( ! ( (pr_default.getStatus(14) == 101) ) )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo Descripcion", "")}), 1, "IMPCOD");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtImpCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
            }
            pr_default.close(14);
         }
         httpContext.ajax_rsp_assign_attri("", false, "h574ImpCod", h574ImpCod);
      }
      if ( ! isIns( ) )
      {
         /* Using cursor T002Y2 */
         pr_default.execute(0, new Object[] {A942TermCod});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPTERMIN"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( Z8899TermPes != T002Y2_A8899TermPes[0] ) || ( GXutil.strcmp(Z8898TermDsc, T002Y2_A8898TermDsc[0]) != 0 ) || ( GXutil.strcmp(Z1189TermUsu, T002Y2_A1189TermUsu[0]) != 0 ) || ( GXutil.strcmp(Z1441ImpCod1, T002Y2_A1441ImpCod1[0]) != 0 ) || ( GXutil.strcmp(Z1442ImpCod2, T002Y2_A1442ImpCod2[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z1443ImpCod3, T002Y2_A1443ImpCod3[0]) != 0 ) || ( GXutil.strcmp(Z1444ImpCod4, T002Y2_A1444ImpCod4[0]) != 0 ) || ( GXutil.strcmp(Z1445ImpCod5, T002Y2_A1445ImpCod5[0]) != 0 ) || ( GXutil.strcmp(Z1446ImpLpt1, T002Y2_A1446ImpLpt1[0]) != 0 ) || ( GXutil.strcmp(Z1447ImpLpt2, T002Y2_A1447ImpLpt2[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z1448ImpLpt3, T002Y2_A1448ImpLpt3[0]) != 0 ) || ( GXutil.strcmp(Z1449ImpLpt4, T002Y2_A1449ImpLpt4[0]) != 0 ) || ( GXutil.strcmp(Z1450ImpLpt5, T002Y2_A1450ImpLpt5[0]) != 0 ) || ( Z6112TermBol != T002Y2_A6112TermBol[0] ) || ( Z6113TermBal != T002Y2_A6113TermBal[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z8678TermNoTr != T002Y2_A8678TermNoTr[0] ) || ( GXutil.strcmp(Z6721TermLog1, T002Y2_A6721TermLog1[0]) != 0 ) || ( GXutil.strcmp(Z6722TermLog2, T002Y2_A6722TermLog2[0]) != 0 ) || ( Z11757TermEst != T002Y2_A11757TermEst[0] ) || !( GXutil.dateCompare(Z11758TermFec, T002Y2_A11758TermFec[0]) ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z574ImpCod, T002Y2_A574ImpCod[0]) != 0 ) || ( GXutil.strcmp(Z396EmprCod, T002Y2_A396EmprCod[0]) != 0 ) )
         {
            if ( Z8899TermPes != T002Y2_A8899TermPes[0] )
            {
               GXutil.writeLogln("ttermin:[seudo value changed for attri]"+"TermPes");
               GXutil.writeLogRaw("Old: ",Z8899TermPes);
               GXutil.writeLogRaw("Current: ",T002Y2_A8899TermPes[0]);
            }
            if ( GXutil.strcmp(Z8898TermDsc, T002Y2_A8898TermDsc[0]) != 0 )
            {
               GXutil.writeLogln("ttermin:[seudo value changed for attri]"+"TermDsc");
               GXutil.writeLogRaw("Old: ",Z8898TermDsc);
               GXutil.writeLogRaw("Current: ",T002Y2_A8898TermDsc[0]);
            }
            if ( GXutil.strcmp(Z1189TermUsu, T002Y2_A1189TermUsu[0]) != 0 )
            {
               GXutil.writeLogln("ttermin:[seudo value changed for attri]"+"TermUsu");
               GXutil.writeLogRaw("Old: ",Z1189TermUsu);
               GXutil.writeLogRaw("Current: ",T002Y2_A1189TermUsu[0]);
            }
            if ( GXutil.strcmp(Z1441ImpCod1, T002Y2_A1441ImpCod1[0]) != 0 )
            {
               GXutil.writeLogln("ttermin:[seudo value changed for attri]"+"ImpCod1");
               GXutil.writeLogRaw("Old: ",Z1441ImpCod1);
               GXutil.writeLogRaw("Current: ",T002Y2_A1441ImpCod1[0]);
            }
            if ( GXutil.strcmp(Z1442ImpCod2, T002Y2_A1442ImpCod2[0]) != 0 )
            {
               GXutil.writeLogln("ttermin:[seudo value changed for attri]"+"ImpCod2");
               GXutil.writeLogRaw("Old: ",Z1442ImpCod2);
               GXutil.writeLogRaw("Current: ",T002Y2_A1442ImpCod2[0]);
            }
            if ( GXutil.strcmp(Z1443ImpCod3, T002Y2_A1443ImpCod3[0]) != 0 )
            {
               GXutil.writeLogln("ttermin:[seudo value changed for attri]"+"ImpCod3");
               GXutil.writeLogRaw("Old: ",Z1443ImpCod3);
               GXutil.writeLogRaw("Current: ",T002Y2_A1443ImpCod3[0]);
            }
            if ( GXutil.strcmp(Z1444ImpCod4, T002Y2_A1444ImpCod4[0]) != 0 )
            {
               GXutil.writeLogln("ttermin:[seudo value changed for attri]"+"ImpCod4");
               GXutil.writeLogRaw("Old: ",Z1444ImpCod4);
               GXutil.writeLogRaw("Current: ",T002Y2_A1444ImpCod4[0]);
            }
            if ( GXutil.strcmp(Z1445ImpCod5, T002Y2_A1445ImpCod5[0]) != 0 )
            {
               GXutil.writeLogln("ttermin:[seudo value changed for attri]"+"ImpCod5");
               GXutil.writeLogRaw("Old: ",Z1445ImpCod5);
               GXutil.writeLogRaw("Current: ",T002Y2_A1445ImpCod5[0]);
            }
            if ( GXutil.strcmp(Z1446ImpLpt1, T002Y2_A1446ImpLpt1[0]) != 0 )
            {
               GXutil.writeLogln("ttermin:[seudo value changed for attri]"+"ImpLpt1");
               GXutil.writeLogRaw("Old: ",Z1446ImpLpt1);
               GXutil.writeLogRaw("Current: ",T002Y2_A1446ImpLpt1[0]);
            }
            if ( GXutil.strcmp(Z1447ImpLpt2, T002Y2_A1447ImpLpt2[0]) != 0 )
            {
               GXutil.writeLogln("ttermin:[seudo value changed for attri]"+"ImpLpt2");
               GXutil.writeLogRaw("Old: ",Z1447ImpLpt2);
               GXutil.writeLogRaw("Current: ",T002Y2_A1447ImpLpt2[0]);
            }
            if ( GXutil.strcmp(Z1448ImpLpt3, T002Y2_A1448ImpLpt3[0]) != 0 )
            {
               GXutil.writeLogln("ttermin:[seudo value changed for attri]"+"ImpLpt3");
               GXutil.writeLogRaw("Old: ",Z1448ImpLpt3);
               GXutil.writeLogRaw("Current: ",T002Y2_A1448ImpLpt3[0]);
            }
            if ( GXutil.strcmp(Z1449ImpLpt4, T002Y2_A1449ImpLpt4[0]) != 0 )
            {
               GXutil.writeLogln("ttermin:[seudo value changed for attri]"+"ImpLpt4");
               GXutil.writeLogRaw("Old: ",Z1449ImpLpt4);
               GXutil.writeLogRaw("Current: ",T002Y2_A1449ImpLpt4[0]);
            }
            if ( GXutil.strcmp(Z1450ImpLpt5, T002Y2_A1450ImpLpt5[0]) != 0 )
            {
               GXutil.writeLogln("ttermin:[seudo value changed for attri]"+"ImpLpt5");
               GXutil.writeLogRaw("Old: ",Z1450ImpLpt5);
               GXutil.writeLogRaw("Current: ",T002Y2_A1450ImpLpt5[0]);
            }
            if ( Z6112TermBol != T002Y2_A6112TermBol[0] )
            {
               GXutil.writeLogln("ttermin:[seudo value changed for attri]"+"TermBol");
               GXutil.writeLogRaw("Old: ",Z6112TermBol);
               GXutil.writeLogRaw("Current: ",T002Y2_A6112TermBol[0]);
            }
            if ( Z6113TermBal != T002Y2_A6113TermBal[0] )
            {
               GXutil.writeLogln("ttermin:[seudo value changed for attri]"+"TermBal");
               GXutil.writeLogRaw("Old: ",Z6113TermBal);
               GXutil.writeLogRaw("Current: ",T002Y2_A6113TermBal[0]);
            }
            if ( Z8678TermNoTr != T002Y2_A8678TermNoTr[0] )
            {
               GXutil.writeLogln("ttermin:[seudo value changed for attri]"+"TermNoTr");
               GXutil.writeLogRaw("Old: ",Z8678TermNoTr);
               GXutil.writeLogRaw("Current: ",T002Y2_A8678TermNoTr[0]);
            }
            if ( GXutil.strcmp(Z6721TermLog1, T002Y2_A6721TermLog1[0]) != 0 )
            {
               GXutil.writeLogln("ttermin:[seudo value changed for attri]"+"TermLog1");
               GXutil.writeLogRaw("Old: ",Z6721TermLog1);
               GXutil.writeLogRaw("Current: ",T002Y2_A6721TermLog1[0]);
            }
            if ( GXutil.strcmp(Z6722TermLog2, T002Y2_A6722TermLog2[0]) != 0 )
            {
               GXutil.writeLogln("ttermin:[seudo value changed for attri]"+"TermLog2");
               GXutil.writeLogRaw("Old: ",Z6722TermLog2);
               GXutil.writeLogRaw("Current: ",T002Y2_A6722TermLog2[0]);
            }
            if ( Z11757TermEst != T002Y2_A11757TermEst[0] )
            {
               GXutil.writeLogln("ttermin:[seudo value changed for attri]"+"TermEst");
               GXutil.writeLogRaw("Old: ",Z11757TermEst);
               GXutil.writeLogRaw("Current: ",T002Y2_A11757TermEst[0]);
            }
            if ( !( GXutil.dateCompare(Z11758TermFec, T002Y2_A11758TermFec[0]) ) )
            {
               GXutil.writeLogln("ttermin:[seudo value changed for attri]"+"TermFec");
               GXutil.writeLogRaw("Old: ",Z11758TermFec);
               GXutil.writeLogRaw("Current: ",T002Y2_A11758TermFec[0]);
            }
            if ( GXutil.strcmp(Z574ImpCod, T002Y2_A574ImpCod[0]) != 0 )
            {
               GXutil.writeLogln("ttermin:[seudo value changed for attri]"+"ImpCod");
               GXutil.writeLogRaw("Old: ",Z574ImpCod);
               GXutil.writeLogRaw("Current: ",T002Y2_A574ImpCod[0]);
            }
            if ( GXutil.strcmp(Z396EmprCod, T002Y2_A396EmprCod[0]) != 0 )
            {
               GXutil.writeLogln("ttermin:[seudo value changed for attri]"+"EmprCod");
               GXutil.writeLogRaw("Old: ",Z396EmprCod);
               GXutil.writeLogRaw("Current: ",T002Y2_A396EmprCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPTERMIN"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert2Y122( )
   {
      beforeValidate2Y122( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable2Y122( ) ;
      }
      if ( AnyError == 0 )
      {
         zm2Y122( 0) ;
         checkOptimisticConcurrency2Y122( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm2Y122( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert2Y122( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T002Y17 */
                  pr_default.execute(15, new Object[] {A942TermCod, Boolean.valueOf(n8899TermPes), Byte.valueOf(A8899TermPes), Boolean.valueOf(n8898TermDsc), A8898TermDsc, Boolean.valueOf(n1189TermUsu), A1189TermUsu, Boolean.valueOf(n1441ImpCod1), A1441ImpCod1, Boolean.valueOf(n1442ImpCod2), A1442ImpCod2, Boolean.valueOf(n1443ImpCod3), A1443ImpCod3, Boolean.valueOf(n1444ImpCod4), A1444ImpCod4, Boolean.valueOf(n1445ImpCod5), A1445ImpCod5, Boolean.valueOf(n1446ImpLpt1), A1446ImpLpt1, Boolean.valueOf(n1447ImpLpt2), A1447ImpLpt2, Boolean.valueOf(n1448ImpLpt3), A1448ImpLpt3, Boolean.valueOf(n1449ImpLpt4), A1449ImpLpt4, Boolean.valueOf(n1450ImpLpt5), A1450ImpLpt5, Boolean.valueOf(n6112TermBol), Byte.valueOf(A6112TermBol), Boolean.valueOf(n6113TermBal), Byte.valueOf(A6113TermBal), Boolean.valueOf(n8678TermNoTr), Byte.valueOf(A8678TermNoTr), Boolean.valueOf(n6721TermLog1), A6721TermLog1, Boolean.valueOf(n6722TermLog2), A6722TermLog2, Boolean.valueOf(n11757TermEst), Byte.valueOf(A11757TermEst), Boolean.valueOf(n11758TermFec), A11758TermFec, Boolean.valueOf(n574ImpCod), A574ImpCod, Boolean.valueOf(n396EmprCod), A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTERMIN");
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
                        /* Save values for previous() function. */
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                        endTrnMsgCod = "SuccessfullyAdded" ;
                        resetCaption2Y0( ) ;
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
            load2Y122( ) ;
         }
         endLevel2Y122( ) ;
      }
      closeExtendedTableCursors2Y122( ) ;
   }

   public void update2Y122( )
   {
      beforeValidate2Y122( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable2Y122( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency2Y122( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm2Y122( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate2Y122( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T002Y18 */
                  pr_default.execute(16, new Object[] {Boolean.valueOf(n8899TermPes), Byte.valueOf(A8899TermPes), Boolean.valueOf(n8898TermDsc), A8898TermDsc, Boolean.valueOf(n1189TermUsu), A1189TermUsu, Boolean.valueOf(n1441ImpCod1), A1441ImpCod1, Boolean.valueOf(n1442ImpCod2), A1442ImpCod2, Boolean.valueOf(n1443ImpCod3), A1443ImpCod3, Boolean.valueOf(n1444ImpCod4), A1444ImpCod4, Boolean.valueOf(n1445ImpCod5), A1445ImpCod5, Boolean.valueOf(n1446ImpLpt1), A1446ImpLpt1, Boolean.valueOf(n1447ImpLpt2), A1447ImpLpt2, Boolean.valueOf(n1448ImpLpt3), A1448ImpLpt3, Boolean.valueOf(n1449ImpLpt4), A1449ImpLpt4, Boolean.valueOf(n1450ImpLpt5), A1450ImpLpt5, Boolean.valueOf(n6112TermBol), Byte.valueOf(A6112TermBol), Boolean.valueOf(n6113TermBal), Byte.valueOf(A6113TermBal), Boolean.valueOf(n8678TermNoTr), Byte.valueOf(A8678TermNoTr), Boolean.valueOf(n6721TermLog1), A6721TermLog1, Boolean.valueOf(n6722TermLog2), A6722TermLog2, Boolean.valueOf(n11757TermEst), Byte.valueOf(A11757TermEst), Boolean.valueOf(n11758TermFec), A11758TermFec, Boolean.valueOf(n574ImpCod), A574ImpCod, Boolean.valueOf(n396EmprCod), A396EmprCod, A942TermCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTERMIN");
                  if ( (pr_default.getStatus(16) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPTERMIN"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate2Y122( ) ;
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
         endLevel2Y122( ) ;
      }
      closeExtendedTableCursors2Y122( ) ;
   }

   public void deferredUpdate2Y122( )
   {
   }

   public void delete( )
   {
      beforeValidate2Y122( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency2Y122( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls2Y122( ) ;
         afterConfirm2Y122( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete2Y122( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T002Y19 */
               pr_default.execute(17, new Object[] {A942TermCod});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTERMIN");
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
      sMode122 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel2Y122( ) ;
      Gx_mode = sMode122 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls2Y122( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T002Y20 */
         pr_default.execute(18, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod});
         A407EmprNom = T002Y20_A407EmprNom[0] ;
         n407EmprNom = T002Y20_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         pr_default.close(18);
         GXt_int5 = (byte)(DecimalUtil.decToDouble(AV30Sedamil)) ;
         GXv_int6[0] = GXt_int5 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "SEDAMI", ""), ""), GXv_int6) ;
         ttermin_impl.this.GXt_int5 = GXv_int6[0] ;
         AV30Sedamil = DecimalUtil.doubleToDec(GXt_int5) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV30Sedamil", GXutil.ltrimstr( AV30Sedamil, 10, 2));
         if ( AV30Sedamil.doubleValue() == 1 )
         {
            edtTermBol_Caption = httpContext.getMessage( httpContext.getMessage( "Intermec", ""), "") ;
            httpContext.ajax_rsp_assign_prop("", false, edtTermBol_Internalname, "Caption", edtTermBol_Caption, true);
         }
         GXt_int5 = AV29Cladd ;
         GXv_int6[0] = GXt_int5 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "CLADD", ""), ""), GXv_int6) ;
         ttermin_impl.this.GXt_int5 = GXv_int6[0] ;
         AV29Cladd = GXt_int5 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV29Cladd", GXutil.str( AV29Cladd, 1, 0));
         if ( ! ( ( AV29Cladd == 1 ) ) )
         {
            chkTermNoTr.setVisible( 0 );
            httpContext.ajax_rsp_assign_prop("", false, chkTermNoTr.getInternalname(), "Visible", GXutil.ltrimstr( chkTermNoTr.getVisible(), 5, 0), true);
         }
         else
         {
            if ( AV29Cladd == 1 )
            {
               chkTermNoTr.setVisible( 1 );
               httpContext.ajax_rsp_assign_prop("", false, chkTermNoTr.getInternalname(), "Visible", GXutil.ltrimstr( chkTermNoTr.getVisible(), 5, 0), true);
            }
         }
         if ( ( AV29Cladd == 1 ) || ( AV30Sedamil.doubleValue() == 1 ) )
         {
            edtTermBol_Visible = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtTermBol_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTermBol_Visible), 5, 0), true);
         }
         else
         {
            if ( ! ( ( AV29Cladd == 1 ) || ( AV30Sedamil.doubleValue() == 1 ) ) )
            {
               edtTermBol_Visible = 0 ;
               httpContext.ajax_rsp_assign_prop("", false, edtTermBol_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTermBol_Visible), 5, 0), true);
            }
         }
         if ( ( AV29Cladd == 1 ) || ( AV30Sedamil.doubleValue() == 1 ) )
         {
            edtTermLog1_Visible = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtTermLog1_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTermLog1_Visible), 5, 0), true);
         }
         else
         {
            if ( ! ( ( AV29Cladd == 1 ) || ( AV30Sedamil.doubleValue() == 1 ) ) )
            {
               edtTermLog1_Visible = 0 ;
               httpContext.ajax_rsp_assign_prop("", false, edtTermLog1_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTermLog1_Visible), 5, 0), true);
            }
            else
            {
               edtTermLog1_Visible = AV29Cladd ;
               httpContext.ajax_rsp_assign_prop("", false, edtTermLog1_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTermLog1_Visible), 5, 0), true);
            }
         }
         edtTermLog2_Visible = AV29Cladd ;
         httpContext.ajax_rsp_assign_prop("", false, edtTermLog2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTermLog2_Visible), 5, 0), true);
         GXt_int5 = (byte)(DecimalUtil.decToDouble(AV31Artextil)) ;
         GXv_int6[0] = GXt_int5 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "ARTEXT", ""), ""), GXv_int6) ;
         ttermin_impl.this.GXt_int5 = GXv_int6[0] ;
         AV31Artextil = DecimalUtil.doubleToDec(GXt_int5) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV31Artextil", GXutil.ltrimstr( AV31Artextil, 10, 2));
         if ( ( AV29Cladd == 1 ) || ( AV30Sedamil.doubleValue() == 1 ) || ( AV31Artextil.doubleValue() == 1 ) )
         {
            edtTermBal_Visible = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtTermBal_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTermBal_Visible), 5, 0), true);
         }
         else
         {
            if ( ! ( ( AV29Cladd == 1 ) || ( AV30Sedamil.doubleValue() == 1 ) || ( AV31Artextil.doubleValue() == 1 ) ) )
            {
               edtTermBal_Visible = 0 ;
               httpContext.ajax_rsp_assign_prop("", false, edtTermBal_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTermBal_Visible), 5, 0), true);
            }
         }
         /* Using cursor T002Y21 */
         pr_default.execute(19, new Object[] {Boolean.valueOf(n574ImpCod), A574ImpCod});
         A576ImpDsc = T002Y21_A576ImpDsc[0] ;
         n576ImpDsc = T002Y21_n576ImpDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A576ImpDsc", A576ImpDsc);
         pr_default.close(19);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T002Y22 */
         pr_default.execute(20, new Object[] {A942TermCod});
         if ( (pr_default.getStatus(20) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TERMCL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(20);
         /* Using cursor T002Y23 */
         pr_default.execute(21, new Object[] {A942TermCod});
         if ( (pr_default.getStatus(21) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TERMI1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(21);
         /* Using cursor T002Y24 */
         pr_default.execute(22, new Object[] {A942TermCod});
         if ( (pr_default.getStatus(22) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LANREP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(22);
      }
   }

   public void endLevel2Y122( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete2Y122( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "ttermin");
         if ( AnyError == 0 )
         {
            confirmValues2Y0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "ttermin");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart2Y122( )
   {
      /* Scan By routine */
      /* Using cursor T002Y25 */
      pr_default.execute(23);
      RcdFound122 = (short)(0) ;
      if ( (pr_default.getStatus(23) != 101) )
      {
         RcdFound122 = (short)(1) ;
         A942TermCod = T002Y25_A942TermCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A942TermCod", A942TermCod);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext2Y122( )
   {
      /* Scan next routine */
      pr_default.readNext(23);
      RcdFound122 = (short)(0) ;
      if ( (pr_default.getStatus(23) != 101) )
      {
         RcdFound122 = (short)(1) ;
         A942TermCod = T002Y25_A942TermCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A942TermCod", A942TermCod);
      }
   }

   public void scanEnd2Y122( )
   {
      pr_default.close(23);
   }

   public void afterConfirm2Y122( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert2Y122( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate2Y122( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete2Y122( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete2Y122( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate2Y122( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes2Y122( )
   {
      edtTermCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTermCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTermCod_Enabled), 5, 0), true);
      edtTermDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTermDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTermDsc_Enabled), 5, 0), true);
      edtImpCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtImpCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtImpCod_Enabled), 5, 0), true);
      edtTermUsu_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTermUsu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTermUsu_Enabled), 5, 0), true);
      edtTermFec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTermFec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTermFec_Enabled), 5, 0), true);
      edtImpCod1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtImpCod1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtImpCod1_Enabled), 5, 0), true);
      edtImpLpt1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtImpLpt1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtImpLpt1_Enabled), 5, 0), true);
      edtImpCod2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtImpCod2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtImpCod2_Enabled), 5, 0), true);
      edtImpLpt2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtImpLpt2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtImpLpt2_Enabled), 5, 0), true);
      edtImpCod3_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtImpCod3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtImpCod3_Enabled), 5, 0), true);
      edtImpLpt3_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtImpLpt3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtImpLpt3_Enabled), 5, 0), true);
      edtImpCod4_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtImpCod4_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtImpCod4_Enabled), 5, 0), true);
      edtImpLpt4_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtImpLpt4_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtImpLpt4_Enabled), 5, 0), true);
      edtImpCod5_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtImpCod5_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtImpCod5_Enabled), 5, 0), true);
      edtImpLpt5_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtImpLpt5_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtImpLpt5_Enabled), 5, 0), true);
      edtTermBol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTermBol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTermBol_Enabled), 5, 0), true);
      edtTermBal_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTermBal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTermBal_Enabled), 5, 0), true);
      chkTermPes.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkTermPes.getInternalname(), "Enabled", GXutil.ltrimstr( chkTermPes.getEnabled(), 5, 0), true);
      chkTermNoTr.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkTermNoTr.getInternalname(), "Enabled", GXutil.ltrimstr( chkTermNoTr.getEnabled(), 5, 0), true);
      edtTermLog1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTermLog1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTermLog1_Enabled), 5, 0), true);
      edtTermLog2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTermLog2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTermLog2_Enabled), 5, 0), true);
      edtTermEst_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTermEst_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTermEst_Enabled), 5, 0), true);
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtImpDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtImpDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtImpDsc_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes2Y122( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues2Y0( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.ttermin", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV34TermCod))}, new String[] {"Gx_mode","TermCod"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"TTERMIN");
      forbiddenHiddens.add("TermUsu", GXutil.rtrim( localUtil.format( A1189TermUsu, "@!")));
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("ttermin:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z942TermCod", GXutil.rtrim( Z942TermCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8899TermPes", GXutil.ltrim( localUtil.ntoc( Z8899TermPes, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8898TermDsc", GXutil.rtrim( Z8898TermDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1189TermUsu", GXutil.rtrim( Z1189TermUsu));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1441ImpCod1", GXutil.rtrim( Z1441ImpCod1));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1442ImpCod2", GXutil.rtrim( Z1442ImpCod2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1443ImpCod3", GXutil.rtrim( Z1443ImpCod3));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1444ImpCod4", GXutil.rtrim( Z1444ImpCod4));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1445ImpCod5", GXutil.rtrim( Z1445ImpCod5));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1446ImpLpt1", GXutil.rtrim( Z1446ImpLpt1));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1447ImpLpt2", GXutil.rtrim( Z1447ImpLpt2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1448ImpLpt3", GXutil.rtrim( Z1448ImpLpt3));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1449ImpLpt4", GXutil.rtrim( Z1449ImpLpt4));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1450ImpLpt5", GXutil.rtrim( Z1450ImpLpt5));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6112TermBol", GXutil.ltrim( localUtil.ntoc( Z6112TermBol, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6113TermBal", GXutil.ltrim( localUtil.ntoc( Z6113TermBal, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8678TermNoTr", GXutil.ltrim( localUtil.ntoc( Z8678TermNoTr, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6721TermLog1", Z6721TermLog1);
      app.GxWebStd.gx_hidden_field( httpContext, "Z6722TermLog2", Z6722TermLog2);
      app.GxWebStd.gx_hidden_field( httpContext, "Z11757TermEst", GXutil.ltrim( localUtil.ntoc( Z11757TermEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11758TermFec", localUtil.ttoc( Z11758TermFec, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z574ImpCod", GXutil.rtrim( Z574ImpCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "N396EmprCod", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "N574ImpCod", GXutil.rtrim( A574ImpCod));
      app.GxWebStd.gx_hidden_field( httpContext, "N8899TermPes", GXutil.ltrim( localUtil.ntoc( A8899TermPes, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTRNCONTEXT", AV36TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTRNCONTEXT", AV36TrnContext);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTRNCONTEXT", getSecureSignedToken( "", AV36TrnContext));
      app.GxWebStd.gx_hidden_field( httpContext, "vBROS", GXutil.ltrim( localUtil.ntoc( AV33Bros, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBROS", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV33Bros), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTERMCOD", GXutil.rtrim( AV34TermCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTERMCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV34TermCod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_EMPRCOD", GXutil.rtrim( AV38Insert_EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_IMPCOD", GXutil.rtrim( AV39Insert_ImpCod));
      app.GxWebStd.gx_hidden_field( httpContext, "GXHCIMPCOD", GXutil.rtrim( A574ImpCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vSEDAMIL", GXutil.ltrim( localUtil.ntoc( AV30Sedamil, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCLADD", GXutil.ltrim( localUtil.ntoc( AV29Cladd, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vARTEXTIL", GXutil.ltrim( localUtil.ntoc( AV31Artextil, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPESCOLGX", GXutil.ltrim( localUtil.ntoc( AV32PesColGX, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV44Pgmname));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_FORMATOSIMPRESORA_Objectcall", GXutil.rtrim( Dvpanel_formatosimpresora_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_FORMATOSIMPRESORA_Enabled", GXutil.booltostr( Dvpanel_formatosimpresora_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_FORMATOSIMPRESORA_Width", GXutil.rtrim( Dvpanel_formatosimpresora_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_FORMATOSIMPRESORA_Autowidth", GXutil.booltostr( Dvpanel_formatosimpresora_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_FORMATOSIMPRESORA_Autoheight", GXutil.booltostr( Dvpanel_formatosimpresora_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_FORMATOSIMPRESORA_Cls", GXutil.rtrim( Dvpanel_formatosimpresora_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_FORMATOSIMPRESORA_Title", GXutil.rtrim( Dvpanel_formatosimpresora_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_FORMATOSIMPRESORA_Collapsible", GXutil.booltostr( Dvpanel_formatosimpresora_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_FORMATOSIMPRESORA_Collapsed", GXutil.booltostr( Dvpanel_formatosimpresora_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_FORMATOSIMPRESORA_Showcollapseicon", GXutil.booltostr( Dvpanel_formatosimpresora_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_FORMATOSIMPRESORA_Iconposition", GXutil.rtrim( Dvpanel_formatosimpresora_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_FORMATOSIMPRESORA_Autoscroll", GXutil.booltostr( Dvpanel_formatosimpresora_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_OTROSDATOS_Objectcall", GXutil.rtrim( Dvpanel_otrosdatos_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_OTROSDATOS_Enabled", GXutil.booltostr( Dvpanel_otrosdatos_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_OTROSDATOS_Width", GXutil.rtrim( Dvpanel_otrosdatos_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_OTROSDATOS_Autowidth", GXutil.booltostr( Dvpanel_otrosdatos_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_OTROSDATOS_Autoheight", GXutil.booltostr( Dvpanel_otrosdatos_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_OTROSDATOS_Cls", GXutil.rtrim( Dvpanel_otrosdatos_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_OTROSDATOS_Title", GXutil.rtrim( Dvpanel_otrosdatos_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_OTROSDATOS_Collapsible", GXutil.booltostr( Dvpanel_otrosdatos_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_OTROSDATOS_Collapsed", GXutil.booltostr( Dvpanel_otrosdatos_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_OTROSDATOS_Showcollapseicon", GXutil.booltostr( Dvpanel_otrosdatos_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_OTROSDATOS_Iconposition", GXutil.rtrim( Dvpanel_otrosdatos_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_OTROSDATOS_Autoscroll", GXutil.booltostr( Dvpanel_otrosdatos_Autoscroll));
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
      return formatLink("app.ttermin", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV34TermCod))}, new String[] {"Gx_mode","TermCod"})  ;
   }

   public String getPgmname( )
   {
      return "TTERMIN" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "TERMINALES", "") ;
   }

   public void initializeNonKey2Y122( )
   {
      A396EmprCod = "" ;
      n396EmprCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      h574ImpCod = "" ;
      AV30Sedamil = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30Sedamil", GXutil.ltrimstr( AV30Sedamil, 10, 2));
      AV29Cladd = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29Cladd", GXutil.str( AV29Cladd, 1, 0));
      AV31Artextil = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31Artextil", GXutil.ltrimstr( AV31Artextil, 10, 2));
      A8899TermPes = (byte)(0) ;
      n8899TermPes = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8899TermPes", GXutil.str( A8899TermPes, 1, 0));
      A407EmprNom = "" ;
      n407EmprNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      A8898TermDsc = "" ;
      n8898TermDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8898TermDsc", A8898TermDsc);
      A576ImpDsc = "" ;
      n576ImpDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A576ImpDsc", A576ImpDsc);
      A1189TermUsu = "" ;
      n1189TermUsu = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1189TermUsu", A1189TermUsu);
      A1441ImpCod1 = "" ;
      n1441ImpCod1 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1441ImpCod1", A1441ImpCod1);
      A1442ImpCod2 = "" ;
      n1442ImpCod2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1442ImpCod2", A1442ImpCod2);
      A1443ImpCod3 = "" ;
      n1443ImpCod3 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1443ImpCod3", A1443ImpCod3);
      A1444ImpCod4 = "" ;
      n1444ImpCod4 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1444ImpCod4", A1444ImpCod4);
      A1445ImpCod5 = "" ;
      n1445ImpCod5 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1445ImpCod5", A1445ImpCod5);
      A1446ImpLpt1 = "" ;
      n1446ImpLpt1 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1446ImpLpt1", A1446ImpLpt1);
      A1447ImpLpt2 = "" ;
      n1447ImpLpt2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1447ImpLpt2", A1447ImpLpt2);
      A1448ImpLpt3 = "" ;
      n1448ImpLpt3 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1448ImpLpt3", A1448ImpLpt3);
      A1449ImpLpt4 = "" ;
      n1449ImpLpt4 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1449ImpLpt4", A1449ImpLpt4);
      A1450ImpLpt5 = "" ;
      n1450ImpLpt5 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1450ImpLpt5", A1450ImpLpt5);
      A6112TermBol = (byte)(0) ;
      n6112TermBol = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6112TermBol", GXutil.str( A6112TermBol, 1, 0));
      A6113TermBal = (byte)(0) ;
      n6113TermBal = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6113TermBal", GXutil.str( A6113TermBal, 1, 0));
      A8678TermNoTr = (byte)(0) ;
      n8678TermNoTr = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8678TermNoTr", GXutil.str( A8678TermNoTr, 1, 0));
      A6721TermLog1 = "" ;
      n6721TermLog1 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6721TermLog1", A6721TermLog1);
      A6722TermLog2 = "" ;
      n6722TermLog2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6722TermLog2", A6722TermLog2);
      A11757TermEst = (byte)(0) ;
      n11757TermEst = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11757TermEst", GXutil.str( A11757TermEst, 1, 0));
      A11758TermFec = GXutil.resetTime( GXutil.nullDate() );
      n11758TermFec = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11758TermFec", localUtil.ttoc( A11758TermFec, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      Z8899TermPes = (byte)(0) ;
      Z8898TermDsc = "" ;
      Z1189TermUsu = "" ;
      Z1441ImpCod1 = "" ;
      Z1442ImpCod2 = "" ;
      Z1443ImpCod3 = "" ;
      Z1444ImpCod4 = "" ;
      Z1445ImpCod5 = "" ;
      Z1446ImpLpt1 = "" ;
      Z1447ImpLpt2 = "" ;
      Z1448ImpLpt3 = "" ;
      Z1449ImpLpt4 = "" ;
      Z1450ImpLpt5 = "" ;
      Z6112TermBol = (byte)(0) ;
      Z6113TermBal = (byte)(0) ;
      Z8678TermNoTr = (byte)(0) ;
      Z6721TermLog1 = "" ;
      Z6722TermLog2 = "" ;
      Z11757TermEst = (byte)(0) ;
      Z11758TermFec = GXutil.resetTime( GXutil.nullDate() );
      Z574ImpCod = "" ;
      Z396EmprCod = "" ;
   }

   public void initAll2Y122( )
   {
      A942TermCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A942TermCod", A942TermCod);
      initializeNonKey2Y122( ) ;
   }

   public void standaloneModalInsert( )
   {
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?2026821165331", true, true);
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
      httpContext.AddJavascriptSource("ttermin.js", "?2026821165331", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
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
      edtTermCod_Internalname = "TERMCOD" ;
      edtTermDsc_Internalname = "TERMDSC" ;
      edtImpCod_Internalname = "IMPCOD" ;
      edtTermUsu_Internalname = "TERMUSU" ;
      edtTermFec_Internalname = "TERMFEC" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      edtImpCod1_Internalname = "IMPCOD1" ;
      edtImpLpt1_Internalname = "IMPLPT1" ;
      edtImpCod2_Internalname = "IMPCOD2" ;
      edtImpLpt2_Internalname = "IMPLPT2" ;
      edtImpCod3_Internalname = "IMPCOD3" ;
      edtImpLpt3_Internalname = "IMPLPT3" ;
      edtImpCod4_Internalname = "IMPCOD4" ;
      edtImpLpt4_Internalname = "IMPLPT4" ;
      edtImpCod5_Internalname = "IMPCOD5" ;
      edtImpLpt5_Internalname = "IMPLPT5" ;
      tblFormatosimpresora_Internalname = "FORMATOSIMPRESORA" ;
      Dvpanel_formatosimpresora_Internalname = "DVPANEL_FORMATOSIMPRESORA" ;
      edtTermBol_Internalname = "TERMBOL" ;
      edtTermBal_Internalname = "TERMBAL" ;
      chkTermPes.setInternalname( "TERMPES" );
      chkTermNoTr.setInternalname( "TERMNOTR" );
      edtTermLog1_Internalname = "TERMLOG1" ;
      edtTermLog2_Internalname = "TERMLOG2" ;
      edtTermEst_Internalname = "TERMEST" ;
      tblOtrosdatos_Internalname = "OTROSDATOS" ;
      Dvpanel_otrosdatos_Internalname = "DVPANEL_OTROSDATOS" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      bttBtntrn_delete_Internalname = "BTNTRN_DELETE" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtEmprCod_Internalname = "EMPRCOD" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      edtImpDsc_Internalname = "IMPDSC" ;
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
      Form.setCaption( httpContext.getMessage( "TERMINALES", "") );
      edtImpDsc_Jsonclick = "" ;
      edtImpDsc_Enabled = 0 ;
      edtImpDsc_Visible = 1 ;
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
      edtTermEst_Jsonclick = "" ;
      edtTermEst_Enabled = 1 ;
      edtTermLog2_Jsonclick = "" ;
      edtTermLog2_Enabled = 1 ;
      edtTermLog2_Visible = 1 ;
      edtTermLog1_Jsonclick = "" ;
      edtTermLog1_Enabled = 1 ;
      edtTermLog1_Visible = 1 ;
      chkTermNoTr.setEnabled( 1 );
      chkTermNoTr.setVisible( 1 );
      chkTermPes.setEnabled( 1 );
      chkTermPes.setVisible( 1 );
      edtTermBal_Jsonclick = "" ;
      edtTermBal_Enabled = 1 ;
      edtTermBal_Visible = 1 ;
      edtTermBol_Jsonclick = "" ;
      edtTermBol_Enabled = 1 ;
      edtTermBol_Caption = httpContext.getMessage( "Bolsa", "") ;
      edtTermBol_Visible = 1 ;
      Dvpanel_otrosdatos_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_otrosdatos_Iconposition = "Right" ;
      Dvpanel_otrosdatos_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_otrosdatos_Collapsed = GXutil.toBoolean( 1) ;
      Dvpanel_otrosdatos_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_otrosdatos_Title = httpContext.getMessage( "Otros Datos", "") ;
      Dvpanel_otrosdatos_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_otrosdatos_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_otrosdatos_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_otrosdatos_Width = "100%" ;
      edtImpLpt5_Jsonclick = "" ;
      edtImpLpt5_Enabled = 1 ;
      edtImpCod5_Jsonclick = "" ;
      edtImpCod5_Enabled = 1 ;
      edtImpLpt4_Jsonclick = "" ;
      edtImpLpt4_Enabled = 1 ;
      edtImpCod4_Jsonclick = "" ;
      edtImpCod4_Enabled = 1 ;
      edtImpLpt3_Jsonclick = "" ;
      edtImpLpt3_Enabled = 1 ;
      edtImpCod3_Jsonclick = "" ;
      edtImpCod3_Enabled = 1 ;
      edtImpLpt2_Jsonclick = "" ;
      edtImpLpt2_Enabled = 1 ;
      edtImpCod2_Jsonclick = "" ;
      edtImpCod2_Enabled = 1 ;
      edtImpLpt1_Jsonclick = "" ;
      edtImpLpt1_Enabled = 1 ;
      edtImpCod1_Jsonclick = "" ;
      edtImpCod1_Enabled = 1 ;
      Dvpanel_formatosimpresora_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_formatosimpresora_Iconposition = "Right" ;
      Dvpanel_formatosimpresora_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_formatosimpresora_Collapsed = GXutil.toBoolean( 1) ;
      Dvpanel_formatosimpresora_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_formatosimpresora_Title = httpContext.getMessage( "Formatos de Impresora", "") ;
      Dvpanel_formatosimpresora_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_formatosimpresora_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_formatosimpresora_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_formatosimpresora_Width = "100%" ;
      edtTermFec_Jsonclick = "" ;
      edtTermFec_Enabled = 1 ;
      edtTermUsu_Jsonclick = "" ;
      edtTermUsu_Enabled = 0 ;
      edtImpCod_Jsonclick = "" ;
      edtImpCod_Enabled = 1 ;
      edtTermDsc_Jsonclick = "" ;
      edtTermDsc_Enabled = 1 ;
      edtTermCod_Jsonclick = "" ;
      edtTermCod_Enabled = 1 ;
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

   public void gxsgaimpcod2Y0( String A13879ImpCDsc )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgaimpcod_data2Y0( A13879ImpCDsc) ;
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

   protected void gxsgaimpcod_data2Y0( String A13879ImpCDsc )
   {
      l13879ImpCDsc = GXutil.padr( GXutil.rtrim( A13879ImpCDsc), 50, "%") ;
      /* Using cursor T002Y26 */
      pr_default.execute(24, new Object[] {l13879ImpCDsc});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(24) != 101) )
      {
         if ( GXutil.like( GXutil.upper( T002Y26_A13879ImpCDsc[0]) , GXutil.padr( "%" + GXutil.upper( A13879ImpCDsc) , 255 , "%"),  ' ' ) )
         {
            gxdynajaxctrlcodr.add(GXutil.rtrim( T002Y26_A13879ImpCDsc[0]));
            gxdynajaxctrldescr.add(GXutil.rtrim( T002Y26_A13879ImpCDsc[0]));
         }
         pr_default.readNext(24);
      }
      pr_default.close(24);
   }

   public void gxhcaimpcod2Y122( String A13879ImpCDsc )
   {
      /* Using cursor T002Y27 */
      pr_default.execute(25, new Object[] {A13879ImpCDsc});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(25) != 101) )
      {
         if ( GXutil.strcmp(T002Y27_A13879ImpCDsc[0], A13879ImpCDsc) == 0 )
         {
            gxhchits = (short)(gxhchits+1) ;
            if ( gxhchits > 1 )
            {
               if (true) break;
            }
            A13879ImpCDsc = T002Y27_A13879ImpCDsc[0] ;
            A574ImpCod = T002Y27_A574ImpCod[0] ;
            n574ImpCod = T002Y27_n574ImpCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A574ImpCod", A574ImpCod);
         }
         pr_default.readNext(25);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A574ImpCod))+"\"") ;
      addString( "]") ;
      if ( gxhchits > 1 )
      {
         addString( ",") ;
         addString( "\"ambiguousck\"") ;
      }
      if ( gxhchits == 0 )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(25);
   }

   public void gx10asasedamil2Y122( String A396EmprCod )
   {
      GXt_int5 = (byte)(DecimalUtil.decToDouble(AV30Sedamil)) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "SEDAMI", ""), ""), GXv_int6) ;
      ttermin_impl.this.GXt_int5 = GXv_int6[0] ;
      AV30Sedamil = DecimalUtil.doubleToDec(GXt_int5) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30Sedamil", GXutil.ltrimstr( AV30Sedamil, 10, 2));
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV30Sedamil, (byte)(10), (byte)(2), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gx11asacladd2Y122( String A396EmprCod )
   {
      GXt_int5 = AV29Cladd ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "CLADD", ""), ""), GXv_int6) ;
      ttermin_impl.this.GXt_int5 = GXv_int6[0] ;
      AV29Cladd = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29Cladd", GXutil.str( AV29Cladd, 1, 0));
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV29Cladd, (byte)(1), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gx12asaartextil2Y122( String A396EmprCod )
   {
      GXt_int5 = (byte)(DecimalUtil.decToDouble(AV31Artextil)) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "ARTEXT", ""), ""), GXv_int6) ;
      ttermin_impl.this.GXt_int5 = GXv_int6[0] ;
      AV31Artextil = DecimalUtil.doubleToDec(GXt_int5) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31Artextil", GXutil.ltrimstr( AV31Artextil, 10, 2));
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV31Artextil, (byte)(10), (byte)(2), ".", "")))+"\"") ;
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
      chkTermPes.setName( "TERMPES" );
      chkTermPes.setWebtags( "" );
      chkTermPes.setCaption( httpContext.getMessage( "Terminal de Pesaje", "") );
      httpContext.ajax_rsp_assign_prop("", false, chkTermPes.getInternalname(), "TitleCaption", chkTermPes.getCaption(), true);
      chkTermPes.setCheckedValue( "0" );
      A8899TermPes = (byte)(((GXutil.strcmp(GXutil.ltrim( localUtil.ntoc( A8899TermPes, (byte)(1), (byte)(0), ".", "")), "1")==0) ? 1 : 0)) ;
      n8899TermPes = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8899TermPes", GXutil.str( A8899TermPes, 1, 0));
      chkTermNoTr.setName( "TERMNOTR" );
      chkTermNoTr.setWebtags( "" );
      chkTermNoTr.setCaption( httpContext.getMessage( "No utiliza tara", "") );
      httpContext.ajax_rsp_assign_prop("", false, chkTermNoTr.getInternalname(), "TitleCaption", chkTermNoTr.getCaption(), true);
      chkTermNoTr.setCheckedValue( "0" );
      A8678TermNoTr = (byte)(((GXutil.strcmp(GXutil.ltrim( localUtil.ntoc( A8678TermNoTr, (byte)(1), (byte)(0), ".", "")), "1")==0) ? 1 : 0)) ;
      n8678TermNoTr = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8678TermNoTr", GXutil.str( A8678TermNoTr, 1, 0));
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

   public void valid_Impcod( )
   {
      n574ImpCod = false ;
      n576ImpDsc = false ;
      if ( (GXutil.strcmp("", h574ImpCod)==0) )
      {
         A574ImpCod = "" ;
         n574ImpCod = false ;
      }
      else
      {
         A13879ImpCDsc = h574ImpCod ;
         /* Using cursor T002Y28 */
         pr_default.execute(26, new Object[] {A13879ImpCDsc});
         A574ImpCod = T002Y28_A574ImpCod[0] ;
         n574ImpCod = T002Y28_n574ImpCod[0] ;
         A574ImpCod = T002Y28_A574ImpCod[0] ;
         n574ImpCod = T002Y28_n574ImpCod[0] ;
         if ( ! ( (pr_default.getStatus(26) == 101) ) )
         {
            pr_default.readNext(26);
            if ( ! ( (pr_default.getStatus(26) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo Descripcion", "")}), 1, "IMPCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtImpCod_Internalname ;
            }
         }
         else
         {
         }
         pr_default.close(26);
      }
      httpContext.ajax_rsp_assign_attri("", false, "h574ImpCod", h574ImpCod);
      /* Using cursor T002Y29 */
      pr_default.execute(27, new Object[] {Boolean.valueOf(n574ImpCod), A574ImpCod});
      if ( (pr_default.getStatus(27) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "IMPRES", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "IMPCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtImpCod_Internalname ;
      }
      A576ImpDsc = T002Y29_A576ImpDsc[0] ;
      n576ImpDsc = T002Y29_n576ImpDsc[0] ;
      pr_default.close(27);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A574ImpCod", GXutil.rtrim( A574ImpCod));
      httpContext.ajax_rsp_assign_attri("", false, "A576ImpDsc", GXutil.rtrim( A576ImpDsc));
      httpContext.ajax_rsp_assign_attri("", false, "h574ImpCod", GXutil.rtrim( h574ImpCod));
   }

   public void valid_Emprcod( )
   {
      n396EmprCod = false ;
      n407EmprNom = false ;
      /* Using cursor T002Y30 */
      pr_default.execute(28, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod});
      if ( (pr_default.getStatus(28) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A407EmprNom = T002Y30_A407EmprNom[0] ;
      n407EmprNom = T002Y30_n407EmprNom[0] ;
      pr_default.close(28);
      GXt_int5 = (byte)(DecimalUtil.decToDouble(AV30Sedamil)) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "SEDAMI", ""), ""), GXv_int6) ;
      ttermin_impl.this.GXt_int5 = GXv_int6[0] ;
      AV30Sedamil = DecimalUtil.doubleToDec(GXt_int5) ;
      if ( AV30Sedamil.doubleValue() == 1 )
      {
         edtTermBol_Caption = httpContext.getMessage( httpContext.getMessage( "Intermec", ""), "") ;
      }
      GXt_int5 = AV29Cladd ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "CLADD", ""), ""), GXv_int6) ;
      ttermin_impl.this.GXt_int5 = GXv_int6[0] ;
      AV29Cladd = GXt_int5 ;
      if ( ! ( ( AV29Cladd == 1 ) ) )
      {
         chkTermNoTr.setVisible( 0 );
      }
      else
      {
         if ( AV29Cladd == 1 )
         {
            chkTermNoTr.setVisible( 1 );
         }
      }
      if ( ( AV29Cladd == 1 ) || ( AV30Sedamil.doubleValue() == 1 ) )
      {
         edtTermBol_Visible = 1 ;
      }
      else
      {
         if ( ! ( ( AV29Cladd == 1 ) || ( AV30Sedamil.doubleValue() == 1 ) ) )
         {
            edtTermBol_Visible = 0 ;
         }
      }
      if ( ( AV29Cladd == 1 ) || ( AV30Sedamil.doubleValue() == 1 ) )
      {
         edtTermLog1_Visible = 1 ;
      }
      else
      {
         if ( ! ( ( AV29Cladd == 1 ) || ( AV30Sedamil.doubleValue() == 1 ) ) )
         {
            edtTermLog1_Visible = 0 ;
         }
         else
         {
            edtTermLog1_Visible = AV29Cladd ;
         }
      }
      edtTermLog2_Visible = AV29Cladd ;
      GXt_int5 = (byte)(DecimalUtil.decToDouble(AV31Artextil)) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "ARTEXT", ""), ""), GXv_int6) ;
      ttermin_impl.this.GXt_int5 = GXv_int6[0] ;
      AV31Artextil = DecimalUtil.doubleToDec(GXt_int5) ;
      if ( ( AV29Cladd == 1 ) || ( AV30Sedamil.doubleValue() == 1 ) || ( AV31Artextil.doubleValue() == 1 ) )
      {
         edtTermBal_Visible = 1 ;
      }
      else
      {
         if ( ! ( ( AV29Cladd == 1 ) || ( AV30Sedamil.doubleValue() == 1 ) || ( AV31Artextil.doubleValue() == 1 ) ) )
         {
            edtTermBal_Visible = 0 ;
         }
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "AV30Sedamil", GXutil.ltrim( localUtil.ntoc( AV30Sedamil, (byte)(10), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_prop("", false, edtTermBol_Internalname, "Caption", edtTermBol_Caption, true);
      httpContext.ajax_rsp_assign_attri("", false, "AV29Cladd", GXutil.ltrim( localUtil.ntoc( AV29Cladd, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_prop("", false, chkTermNoTr.getInternalname(), "Visible", GXutil.ltrimstr( chkTermNoTr.getVisible(), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtTermBol_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTermBol_Visible), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtTermLog1_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTermLog1_Visible), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtTermLog2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTermLog2_Visible), 5, 0), true);
      httpContext.ajax_rsp_assign_attri("", false, "AV31Artextil", GXutil.ltrim( localUtil.ntoc( AV31Artextil, (byte)(10), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_prop("", false, edtTermBal_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTermBal_Visible), 5, 0), true);
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV34TermCod',fld:'vTERMCOD',pic:'',hsh:true},{av:'A8899TermPes',fld:'TERMPES',pic:'9'},{av:'A8678TermNoTr',fld:'TERMNOTR',pic:'9'}]");
      setEventMetadata("ENTER",",oparms:[{av:'A8899TermPes',fld:'TERMPES',pic:'9'},{av:'A8678TermNoTr',fld:'TERMNOTR',pic:'9'}]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV36TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true},{av:'AV33Bros',fld:'vBROS',pic:'9',hsh:true},{av:'AV34TermCod',fld:'vTERMCOD',pic:'',hsh:true},{av:'A1189TermUsu',fld:'TERMUSU',pic:'@!'},{av:'A8899TermPes',fld:'TERMPES',pic:'9'},{av:'A8678TermNoTr',fld:'TERMNOTR',pic:'9'}]");
      setEventMetadata("REFRESH",",oparms:[{av:'A8899TermPes',fld:'TERMPES',pic:'9'},{av:'A8678TermNoTr',fld:'TERMNOTR',pic:'9'}]}");
      setEventMetadata("AFTER TRN","{handler:'e122Y2',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV36TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true},{av:'A8899TermPes',fld:'TERMPES',pic:'9'},{av:'A8678TermNoTr',fld:'TERMNOTR',pic:'9'}]");
      setEventMetadata("AFTER TRN",",oparms:[{av:'A8899TermPes',fld:'TERMPES',pic:'9'},{av:'A8678TermNoTr',fld:'TERMNOTR',pic:'9'}]}");
      setEventMetadata("VALID_TERMCOD","{handler:'valid_Termcod',iparms:[{av:'A8899TermPes',fld:'TERMPES',pic:'9'},{av:'A8678TermNoTr',fld:'TERMNOTR',pic:'9'}]");
      setEventMetadata("VALID_TERMCOD",",oparms:[{av:'A8899TermPes',fld:'TERMPES',pic:'9'},{av:'A8678TermNoTr',fld:'TERMNOTR',pic:'9'}]}");
      setEventMetadata("VALID_IMPCOD","{handler:'valid_Impcod',iparms:[{av:'h574ImpCod'},{av:'A574ImpCod',fld:'IMPCOD',pic:''},{av:'A576ImpDsc',fld:'IMPDSC',pic:''},{av:'A8899TermPes',fld:'TERMPES',pic:'9'},{av:'A8678TermNoTr',fld:'TERMNOTR',pic:'9'}]");
      setEventMetadata("VALID_IMPCOD",",oparms:[{av:'A574ImpCod',fld:'IMPCOD',pic:''},{av:'A576ImpDsc',fld:'IMPDSC',pic:''},{av:'h574ImpCod'},{av:'A8899TermPes',fld:'TERMPES',pic:'9'},{av:'A8678TermNoTr',fld:'TERMNOTR',pic:'9'}]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV30Sedamil',fld:'vSEDAMIL',pic:'ZZZZZZ9.99'},{av:'AV29Cladd',fld:'vCLADD',pic:'9'},{av:'AV31Artextil',fld:'vARTEXTIL',pic:'ZZZZZZ9.99'},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A8899TermPes',fld:'TERMPES',pic:'9'},{av:'A8678TermNoTr',fld:'TERMNOTR',pic:'9'}]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'AV30Sedamil',fld:'vSEDAMIL',pic:'ZZZZZZ9.99'},{av:'edtTermBol_Caption',ctrl:'TERMBOL',prop:'Caption'},{av:'AV29Cladd',fld:'vCLADD',pic:'9'},{av:'chkTermNoTr.getVisible()',ctrl:'TERMNOTR',prop:'Visible'},{av:'edtTermBol_Visible',ctrl:'TERMBOL',prop:'Visible'},{av:'edtTermLog1_Visible',ctrl:'TERMLOG1',prop:'Visible'},{av:'edtTermLog2_Visible',ctrl:'TERMLOG2',prop:'Visible'},{av:'AV31Artextil',fld:'vARTEXTIL',pic:'ZZZZZZ9.99'},{av:'edtTermBal_Visible',ctrl:'TERMBAL',prop:'Visible'},{av:'A8899TermPes',fld:'TERMPES',pic:'9'},{av:'A8678TermNoTr',fld:'TERMNOTR',pic:'9'}]}");
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
      pr_default.close(27);
      pr_default.close(19);
      pr_default.close(28);
      pr_default.close(18);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      wcpOAV34TermCod = "" ;
      Z942TermCod = "" ;
      Z8898TermDsc = "" ;
      Z1189TermUsu = "" ;
      Z1441ImpCod1 = "" ;
      Z1442ImpCod2 = "" ;
      Z1443ImpCod3 = "" ;
      Z1444ImpCod4 = "" ;
      Z1445ImpCod5 = "" ;
      Z1446ImpLpt1 = "" ;
      Z1447ImpLpt2 = "" ;
      Z1448ImpLpt3 = "" ;
      Z1449ImpLpt4 = "" ;
      Z1450ImpLpt5 = "" ;
      Z6721TermLog1 = "" ;
      Z6722TermLog2 = "" ;
      Z11758TermFec = GXutil.resetTime( GXutil.nullDate() );
      Z574ImpCod = "" ;
      Z396EmprCod = "" ;
      N396EmprCod = "" ;
      N574ImpCod = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A13879ImpCDsc = "" ;
      h574ImpCod = "" ;
      A396EmprCod = "" ;
      A574ImpCod = "" ;
      Gx_mode = "" ;
      AV34TermCod = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      A942TermCod = "" ;
      A8898TermDsc = "" ;
      A1189TermUsu = "" ;
      A11758TermFec = GXutil.resetTime( GXutil.nullDate() );
      ucDvpanel_formatosimpresora = new com.genexus.webpanels.GXUserControl();
      sStyleString = "" ;
      A1441ImpCod1 = "" ;
      A1446ImpLpt1 = "" ;
      A1442ImpCod2 = "" ;
      A1447ImpLpt2 = "" ;
      A1443ImpCod3 = "" ;
      A1448ImpLpt3 = "" ;
      A1444ImpCod4 = "" ;
      A1449ImpLpt4 = "" ;
      A1445ImpCod5 = "" ;
      A1450ImpLpt5 = "" ;
      ucDvpanel_otrosdatos = new com.genexus.webpanels.GXUserControl();
      A6721TermLog1 = "" ;
      A6722TermLog2 = "" ;
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      A407EmprNom = "" ;
      A576ImpDsc = "" ;
      AV38Insert_EmprCod = "" ;
      AV39Insert_ImpCod = "" ;
      AV30Sedamil = DecimalUtil.ZERO ;
      AV31Artextil = DecimalUtil.ZERO ;
      AV44Pgmname = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      Dvpanel_formatosimpresora_Objectcall = "" ;
      Dvpanel_formatosimpresora_Class = "" ;
      Dvpanel_formatosimpresora_Height = "" ;
      Dvpanel_otrosdatos_Objectcall = "" ;
      Dvpanel_otrosdatos_Class = "" ;
      Dvpanel_otrosdatos_Height = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode122 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      AV16Lit0 = "" ;
      AV17Lit1 = "" ;
      AV18Lit2 = "" ;
      AV19Lit3 = "" ;
      AV22Lit4 = "" ;
      AV23Lit5 = "" ;
      AV24Lit6 = "" ;
      AV28Lit7 = "" ;
      AV21LitFe = "" ;
      AV27Station = "" ;
      AV25EmprCod = "" ;
      AV26EmprNom = "" ;
      AV20UsurCod = "" ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      AV35WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV36TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV37WebSession = httpContext.getWebSession();
      AV40TrnContextAtt = new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      Z407EmprNom = "" ;
      Z576ImpDsc = "" ;
      T002Y6_A13879ImpCDsc = new String[] {""} ;
      T002Y6_A574ImpCod = new String[] {""} ;
      T002Y6_n574ImpCod = new boolean[] {false} ;
      T002Y4_A576ImpDsc = new String[] {""} ;
      T002Y4_n576ImpDsc = new boolean[] {false} ;
      T002Y5_A407EmprNom = new String[] {""} ;
      T002Y5_n407EmprNom = new boolean[] {false} ;
      T002Y7_A942TermCod = new String[] {""} ;
      T002Y7_A8899TermPes = new byte[1] ;
      T002Y7_n8899TermPes = new boolean[] {false} ;
      T002Y7_A407EmprNom = new String[] {""} ;
      T002Y7_n407EmprNom = new boolean[] {false} ;
      T002Y7_A8898TermDsc = new String[] {""} ;
      T002Y7_n8898TermDsc = new boolean[] {false} ;
      T002Y7_A576ImpDsc = new String[] {""} ;
      T002Y7_n576ImpDsc = new boolean[] {false} ;
      T002Y7_A1189TermUsu = new String[] {""} ;
      T002Y7_n1189TermUsu = new boolean[] {false} ;
      T002Y7_A1441ImpCod1 = new String[] {""} ;
      T002Y7_n1441ImpCod1 = new boolean[] {false} ;
      T002Y7_A1442ImpCod2 = new String[] {""} ;
      T002Y7_n1442ImpCod2 = new boolean[] {false} ;
      T002Y7_A1443ImpCod3 = new String[] {""} ;
      T002Y7_n1443ImpCod3 = new boolean[] {false} ;
      T002Y7_A1444ImpCod4 = new String[] {""} ;
      T002Y7_n1444ImpCod4 = new boolean[] {false} ;
      T002Y7_A1445ImpCod5 = new String[] {""} ;
      T002Y7_n1445ImpCod5 = new boolean[] {false} ;
      T002Y7_A1446ImpLpt1 = new String[] {""} ;
      T002Y7_n1446ImpLpt1 = new boolean[] {false} ;
      T002Y7_A1447ImpLpt2 = new String[] {""} ;
      T002Y7_n1447ImpLpt2 = new boolean[] {false} ;
      T002Y7_A1448ImpLpt3 = new String[] {""} ;
      T002Y7_n1448ImpLpt3 = new boolean[] {false} ;
      T002Y7_A1449ImpLpt4 = new String[] {""} ;
      T002Y7_n1449ImpLpt4 = new boolean[] {false} ;
      T002Y7_A1450ImpLpt5 = new String[] {""} ;
      T002Y7_n1450ImpLpt5 = new boolean[] {false} ;
      T002Y7_A6112TermBol = new byte[1] ;
      T002Y7_n6112TermBol = new boolean[] {false} ;
      T002Y7_A6113TermBal = new byte[1] ;
      T002Y7_n6113TermBal = new boolean[] {false} ;
      T002Y7_A8678TermNoTr = new byte[1] ;
      T002Y7_n8678TermNoTr = new boolean[] {false} ;
      T002Y7_A6721TermLog1 = new String[] {""} ;
      T002Y7_n6721TermLog1 = new boolean[] {false} ;
      T002Y7_A6722TermLog2 = new String[] {""} ;
      T002Y7_n6722TermLog2 = new boolean[] {false} ;
      T002Y7_A11757TermEst = new byte[1] ;
      T002Y7_n11757TermEst = new boolean[] {false} ;
      T002Y7_A11758TermFec = new java.util.Date[] {GXutil.nullDate()} ;
      T002Y7_n11758TermFec = new boolean[] {false} ;
      T002Y7_A574ImpCod = new String[] {""} ;
      T002Y7_n574ImpCod = new boolean[] {false} ;
      T002Y7_A396EmprCod = new String[] {""} ;
      T002Y7_n396EmprCod = new boolean[] {false} ;
      T002Y8_A13879ImpCDsc = new String[] {""} ;
      T002Y8_A574ImpCod = new String[] {""} ;
      T002Y8_n574ImpCod = new boolean[] {false} ;
      T002Y9_A13879ImpCDsc = new String[] {""} ;
      T002Y9_A574ImpCod = new String[] {""} ;
      T002Y9_n574ImpCod = new boolean[] {false} ;
      T002Y10_A13879ImpCDsc = new String[] {""} ;
      T002Y10_A574ImpCod = new String[] {""} ;
      T002Y10_n574ImpCod = new boolean[] {false} ;
      T002Y11_A407EmprNom = new String[] {""} ;
      T002Y11_n407EmprNom = new boolean[] {false} ;
      T002Y12_A576ImpDsc = new String[] {""} ;
      T002Y12_n576ImpDsc = new boolean[] {false} ;
      T002Y13_A942TermCod = new String[] {""} ;
      T002Y3_A942TermCod = new String[] {""} ;
      T002Y3_A8899TermPes = new byte[1] ;
      T002Y3_n8899TermPes = new boolean[] {false} ;
      T002Y3_A8898TermDsc = new String[] {""} ;
      T002Y3_n8898TermDsc = new boolean[] {false} ;
      T002Y3_A1189TermUsu = new String[] {""} ;
      T002Y3_n1189TermUsu = new boolean[] {false} ;
      T002Y3_A1441ImpCod1 = new String[] {""} ;
      T002Y3_n1441ImpCod1 = new boolean[] {false} ;
      T002Y3_A1442ImpCod2 = new String[] {""} ;
      T002Y3_n1442ImpCod2 = new boolean[] {false} ;
      T002Y3_A1443ImpCod3 = new String[] {""} ;
      T002Y3_n1443ImpCod3 = new boolean[] {false} ;
      T002Y3_A1444ImpCod4 = new String[] {""} ;
      T002Y3_n1444ImpCod4 = new boolean[] {false} ;
      T002Y3_A1445ImpCod5 = new String[] {""} ;
      T002Y3_n1445ImpCod5 = new boolean[] {false} ;
      T002Y3_A1446ImpLpt1 = new String[] {""} ;
      T002Y3_n1446ImpLpt1 = new boolean[] {false} ;
      T002Y3_A1447ImpLpt2 = new String[] {""} ;
      T002Y3_n1447ImpLpt2 = new boolean[] {false} ;
      T002Y3_A1448ImpLpt3 = new String[] {""} ;
      T002Y3_n1448ImpLpt3 = new boolean[] {false} ;
      T002Y3_A1449ImpLpt4 = new String[] {""} ;
      T002Y3_n1449ImpLpt4 = new boolean[] {false} ;
      T002Y3_A1450ImpLpt5 = new String[] {""} ;
      T002Y3_n1450ImpLpt5 = new boolean[] {false} ;
      T002Y3_A6112TermBol = new byte[1] ;
      T002Y3_n6112TermBol = new boolean[] {false} ;
      T002Y3_A6113TermBal = new byte[1] ;
      T002Y3_n6113TermBal = new boolean[] {false} ;
      T002Y3_A8678TermNoTr = new byte[1] ;
      T002Y3_n8678TermNoTr = new boolean[] {false} ;
      T002Y3_A6721TermLog1 = new String[] {""} ;
      T002Y3_n6721TermLog1 = new boolean[] {false} ;
      T002Y3_A6722TermLog2 = new String[] {""} ;
      T002Y3_n6722TermLog2 = new boolean[] {false} ;
      T002Y3_A11757TermEst = new byte[1] ;
      T002Y3_n11757TermEst = new boolean[] {false} ;
      T002Y3_A11758TermFec = new java.util.Date[] {GXutil.nullDate()} ;
      T002Y3_n11758TermFec = new boolean[] {false} ;
      T002Y3_A574ImpCod = new String[] {""} ;
      T002Y3_n574ImpCod = new boolean[] {false} ;
      T002Y3_A396EmprCod = new String[] {""} ;
      T002Y3_n396EmprCod = new boolean[] {false} ;
      T002Y14_A942TermCod = new String[] {""} ;
      T002Y15_A942TermCod = new String[] {""} ;
      T002Y16_A13879ImpCDsc = new String[] {""} ;
      T002Y16_A574ImpCod = new String[] {""} ;
      T002Y16_n574ImpCod = new boolean[] {false} ;
      T002Y2_A942TermCod = new String[] {""} ;
      T002Y2_A8899TermPes = new byte[1] ;
      T002Y2_n8899TermPes = new boolean[] {false} ;
      T002Y2_A8898TermDsc = new String[] {""} ;
      T002Y2_n8898TermDsc = new boolean[] {false} ;
      T002Y2_A1189TermUsu = new String[] {""} ;
      T002Y2_n1189TermUsu = new boolean[] {false} ;
      T002Y2_A1441ImpCod1 = new String[] {""} ;
      T002Y2_n1441ImpCod1 = new boolean[] {false} ;
      T002Y2_A1442ImpCod2 = new String[] {""} ;
      T002Y2_n1442ImpCod2 = new boolean[] {false} ;
      T002Y2_A1443ImpCod3 = new String[] {""} ;
      T002Y2_n1443ImpCod3 = new boolean[] {false} ;
      T002Y2_A1444ImpCod4 = new String[] {""} ;
      T002Y2_n1444ImpCod4 = new boolean[] {false} ;
      T002Y2_A1445ImpCod5 = new String[] {""} ;
      T002Y2_n1445ImpCod5 = new boolean[] {false} ;
      T002Y2_A1446ImpLpt1 = new String[] {""} ;
      T002Y2_n1446ImpLpt1 = new boolean[] {false} ;
      T002Y2_A1447ImpLpt2 = new String[] {""} ;
      T002Y2_n1447ImpLpt2 = new boolean[] {false} ;
      T002Y2_A1448ImpLpt3 = new String[] {""} ;
      T002Y2_n1448ImpLpt3 = new boolean[] {false} ;
      T002Y2_A1449ImpLpt4 = new String[] {""} ;
      T002Y2_n1449ImpLpt4 = new boolean[] {false} ;
      T002Y2_A1450ImpLpt5 = new String[] {""} ;
      T002Y2_n1450ImpLpt5 = new boolean[] {false} ;
      T002Y2_A6112TermBol = new byte[1] ;
      T002Y2_n6112TermBol = new boolean[] {false} ;
      T002Y2_A6113TermBal = new byte[1] ;
      T002Y2_n6113TermBal = new boolean[] {false} ;
      T002Y2_A8678TermNoTr = new byte[1] ;
      T002Y2_n8678TermNoTr = new boolean[] {false} ;
      T002Y2_A6721TermLog1 = new String[] {""} ;
      T002Y2_n6721TermLog1 = new boolean[] {false} ;
      T002Y2_A6722TermLog2 = new String[] {""} ;
      T002Y2_n6722TermLog2 = new boolean[] {false} ;
      T002Y2_A11757TermEst = new byte[1] ;
      T002Y2_n11757TermEst = new boolean[] {false} ;
      T002Y2_A11758TermFec = new java.util.Date[] {GXutil.nullDate()} ;
      T002Y2_n11758TermFec = new boolean[] {false} ;
      T002Y2_A574ImpCod = new String[] {""} ;
      T002Y2_n574ImpCod = new boolean[] {false} ;
      T002Y2_A396EmprCod = new String[] {""} ;
      T002Y2_n396EmprCod = new boolean[] {false} ;
      T002Y20_A407EmprNom = new String[] {""} ;
      T002Y20_n407EmprNom = new boolean[] {false} ;
      T002Y21_A576ImpDsc = new String[] {""} ;
      T002Y21_n576ImpDsc = new boolean[] {false} ;
      T002Y22_A942TermCod = new String[] {""} ;
      T002Y22_A10133TermCliCod = new int[1] ;
      T002Y23_A942TermCod = new String[] {""} ;
      T002Y23_A8900TermPesPro = new String[] {""} ;
      T002Y24_A942TermCod = new String[] {""} ;
      T002Y24_A2135RepBarCod = new int[1] ;
      T002Y24_A2137RepBarReo = new byte[1] ;
      T002Y24_A2136RepBarPar = new String[] {""} ;
      T002Y24_A2681RepComLin = new byte[1] ;
      T002Y24_A2138RepComCod = new String[] {""} ;
      T002Y24_A2140RepFonCod = new String[] {""} ;
      T002Y25_A942TermCod = new String[] {""} ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      gxdynajaxctrlcodr = new com.genexus.internet.StringCollection();
      gxdynajaxctrldescr = new com.genexus.internet.StringCollection();
      gxwrpcisep = "" ;
      l13879ImpCDsc = "" ;
      T002Y26_A574ImpCod = new String[] {""} ;
      T002Y26_n574ImpCod = new boolean[] {false} ;
      T002Y26_A13879ImpCDsc = new String[] {""} ;
      T002Y27_A13879ImpCDsc = new String[] {""} ;
      T002Y27_A574ImpCod = new String[] {""} ;
      T002Y27_n574ImpCod = new boolean[] {false} ;
      T002Y28_A13879ImpCDsc = new String[] {""} ;
      T002Y28_A574ImpCod = new String[] {""} ;
      T002Y28_n574ImpCod = new boolean[] {false} ;
      T002Y29_A576ImpDsc = new String[] {""} ;
      T002Y29_n576ImpDsc = new boolean[] {false} ;
      Zh574ImpCod = "" ;
      T002Y30_A407EmprNom = new String[] {""} ;
      T002Y30_n407EmprNom = new boolean[] {false} ;
      GXv_int6 = new byte[1] ;
      ZV30Sedamil = DecimalUtil.ZERO ;
      ZV31Artextil = DecimalUtil.ZERO ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.ttermin__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.ttermin__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.ttermin__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.ttermin__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ttermin__default(),
         new Object[] {
             new Object[] {
            T002Y2_A942TermCod, T002Y2_A8899TermPes, T002Y2_n8899TermPes, T002Y2_A8898TermDsc, T002Y2_n8898TermDsc, T002Y2_A1189TermUsu, T002Y2_n1189TermUsu, T002Y2_A1441ImpCod1, T002Y2_n1441ImpCod1, T002Y2_A1442ImpCod2,
            T002Y2_n1442ImpCod2, T002Y2_A1443ImpCod3, T002Y2_n1443ImpCod3, T002Y2_A1444ImpCod4, T002Y2_n1444ImpCod4, T002Y2_A1445ImpCod5, T002Y2_n1445ImpCod5, T002Y2_A1446ImpLpt1, T002Y2_n1446ImpLpt1, T002Y2_A1447ImpLpt2,
            T002Y2_n1447ImpLpt2, T002Y2_A1448ImpLpt3, T002Y2_n1448ImpLpt3, T002Y2_A1449ImpLpt4, T002Y2_n1449ImpLpt4, T002Y2_A1450ImpLpt5, T002Y2_n1450ImpLpt5, T002Y2_A6112TermBol, T002Y2_n6112TermBol, T002Y2_A6113TermBal,
            T002Y2_n6113TermBal, T002Y2_A8678TermNoTr, T002Y2_n8678TermNoTr, T002Y2_A6721TermLog1, T002Y2_n6721TermLog1, T002Y2_A6722TermLog2, T002Y2_n6722TermLog2, T002Y2_A11757TermEst, T002Y2_n11757TermEst, T002Y2_A11758TermFec,
            T002Y2_n11758TermFec, T002Y2_A574ImpCod, T002Y2_n574ImpCod, T002Y2_A396EmprCod, T002Y2_n396EmprCod
            }
            , new Object[] {
            T002Y3_A942TermCod, T002Y3_A8899TermPes, T002Y3_n8899TermPes, T002Y3_A8898TermDsc, T002Y3_n8898TermDsc, T002Y3_A1189TermUsu, T002Y3_n1189TermUsu, T002Y3_A1441ImpCod1, T002Y3_n1441ImpCod1, T002Y3_A1442ImpCod2,
            T002Y3_n1442ImpCod2, T002Y3_A1443ImpCod3, T002Y3_n1443ImpCod3, T002Y3_A1444ImpCod4, T002Y3_n1444ImpCod4, T002Y3_A1445ImpCod5, T002Y3_n1445ImpCod5, T002Y3_A1446ImpLpt1, T002Y3_n1446ImpLpt1, T002Y3_A1447ImpLpt2,
            T002Y3_n1447ImpLpt2, T002Y3_A1448ImpLpt3, T002Y3_n1448ImpLpt3, T002Y3_A1449ImpLpt4, T002Y3_n1449ImpLpt4, T002Y3_A1450ImpLpt5, T002Y3_n1450ImpLpt5, T002Y3_A6112TermBol, T002Y3_n6112TermBol, T002Y3_A6113TermBal,
            T002Y3_n6113TermBal, T002Y3_A8678TermNoTr, T002Y3_n8678TermNoTr, T002Y3_A6721TermLog1, T002Y3_n6721TermLog1, T002Y3_A6722TermLog2, T002Y3_n6722TermLog2, T002Y3_A11757TermEst, T002Y3_n11757TermEst, T002Y3_A11758TermFec,
            T002Y3_n11758TermFec, T002Y3_A574ImpCod, T002Y3_n574ImpCod, T002Y3_A396EmprCod, T002Y3_n396EmprCod
            }
            , new Object[] {
            T002Y4_A576ImpDsc, T002Y4_n576ImpDsc
            }
            , new Object[] {
            T002Y5_A407EmprNom, T002Y5_n407EmprNom
            }
            , new Object[] {
            T002Y6_A13879ImpCDsc, T002Y6_A574ImpCod
            }
            , new Object[] {
            T002Y7_A942TermCod, T002Y7_A8899TermPes, T002Y7_n8899TermPes, T002Y7_A407EmprNom, T002Y7_n407EmprNom, T002Y7_A8898TermDsc, T002Y7_n8898TermDsc, T002Y7_A576ImpDsc, T002Y7_n576ImpDsc, T002Y7_A1189TermUsu,
            T002Y7_n1189TermUsu, T002Y7_A1441ImpCod1, T002Y7_n1441ImpCod1, T002Y7_A1442ImpCod2, T002Y7_n1442ImpCod2, T002Y7_A1443ImpCod3, T002Y7_n1443ImpCod3, T002Y7_A1444ImpCod4, T002Y7_n1444ImpCod4, T002Y7_A1445ImpCod5,
            T002Y7_n1445ImpCod5, T002Y7_A1446ImpLpt1, T002Y7_n1446ImpLpt1, T002Y7_A1447ImpLpt2, T002Y7_n1447ImpLpt2, T002Y7_A1448ImpLpt3, T002Y7_n1448ImpLpt3, T002Y7_A1449ImpLpt4, T002Y7_n1449ImpLpt4, T002Y7_A1450ImpLpt5,
            T002Y7_n1450ImpLpt5, T002Y7_A6112TermBol, T002Y7_n6112TermBol, T002Y7_A6113TermBal, T002Y7_n6113TermBal, T002Y7_A8678TermNoTr, T002Y7_n8678TermNoTr, T002Y7_A6721TermLog1, T002Y7_n6721TermLog1, T002Y7_A6722TermLog2,
            T002Y7_n6722TermLog2, T002Y7_A11757TermEst, T002Y7_n11757TermEst, T002Y7_A11758TermFec, T002Y7_n11758TermFec, T002Y7_A574ImpCod, T002Y7_n574ImpCod, T002Y7_A396EmprCod, T002Y7_n396EmprCod
            }
            , new Object[] {
            T002Y8_A13879ImpCDsc, T002Y8_A574ImpCod
            }
            , new Object[] {
            T002Y9_A13879ImpCDsc, T002Y9_A574ImpCod
            }
            , new Object[] {
            T002Y10_A13879ImpCDsc, T002Y10_A574ImpCod
            }
            , new Object[] {
            T002Y11_A407EmprNom, T002Y11_n407EmprNom
            }
            , new Object[] {
            T002Y12_A576ImpDsc, T002Y12_n576ImpDsc
            }
            , new Object[] {
            T002Y13_A942TermCod
            }
            , new Object[] {
            T002Y14_A942TermCod
            }
            , new Object[] {
            T002Y15_A942TermCod
            }
            , new Object[] {
            T002Y16_A13879ImpCDsc, T002Y16_A574ImpCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T002Y20_A407EmprNom, T002Y20_n407EmprNom
            }
            , new Object[] {
            T002Y21_A576ImpDsc, T002Y21_n576ImpDsc
            }
            , new Object[] {
            T002Y22_A942TermCod, T002Y22_A10133TermCliCod
            }
            , new Object[] {
            T002Y23_A942TermCod, T002Y23_A8900TermPesPro
            }
            , new Object[] {
            T002Y24_A942TermCod, T002Y24_A2135RepBarCod, T002Y24_A2137RepBarReo, T002Y24_A2136RepBarPar, T002Y24_A2681RepComLin, T002Y24_A2138RepComCod, T002Y24_A2140RepFonCod
            }
            , new Object[] {
            T002Y25_A942TermCod
            }
            , new Object[] {
            T002Y26_A574ImpCod, T002Y26_A13879ImpCDsc
            }
            , new Object[] {
            T002Y27_A13879ImpCDsc, T002Y27_A574ImpCod
            }
            , new Object[] {
            T002Y28_A13879ImpCDsc, T002Y28_A574ImpCod
            }
            , new Object[] {
            T002Y29_A576ImpDsc, T002Y29_n576ImpDsc
            }
            , new Object[] {
            T002Y30_A407EmprNom, T002Y30_n407EmprNom
            }
         }
      );
      AV44Pgmname = "TTERMIN" ;
   }

   private byte Z8899TermPes ;
   private byte Z6112TermBol ;
   private byte Z6113TermBal ;
   private byte Z8678TermNoTr ;
   private byte Z11757TermEst ;
   private byte N8899TermPes ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A8899TermPes ;
   private byte A8678TermNoTr ;
   private byte A6112TermBol ;
   private byte A6113TermBal ;
   private byte A11757TermEst ;
   private byte AV33Bros ;
   private byte AV29Cladd ;
   private byte AV32PesColGX ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private byte GXt_int5 ;
   private byte GXv_int6[] ;
   private byte ZV29Cladd ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound122 ;
   private short nIsDirty_122 ;
   private short gxhchits ;
   private int trnEnded ;
   private int edtTermCod_Enabled ;
   private int edtTermDsc_Enabled ;
   private int edtImpCod_Enabled ;
   private int edtTermUsu_Enabled ;
   private int edtTermFec_Enabled ;
   private int edtImpCod1_Enabled ;
   private int edtImpLpt1_Enabled ;
   private int edtImpCod2_Enabled ;
   private int edtImpLpt2_Enabled ;
   private int edtImpCod3_Enabled ;
   private int edtImpLpt3_Enabled ;
   private int edtImpCod4_Enabled ;
   private int edtImpLpt4_Enabled ;
   private int edtImpCod5_Enabled ;
   private int edtImpLpt5_Enabled ;
   private int edtTermBol_Visible ;
   private int edtTermBol_Enabled ;
   private int edtTermBal_Visible ;
   private int edtTermBal_Enabled ;
   private int edtTermLog1_Visible ;
   private int edtTermLog1_Enabled ;
   private int edtTermLog2_Visible ;
   private int edtTermLog2_Enabled ;
   private int edtTermEst_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int edtEmprCod_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Visible ;
   private int edtEmprNom_Enabled ;
   private int edtImpDsc_Visible ;
   private int edtImpDsc_Enabled ;
   private int AV45GXV1 ;
   private int GX_JID ;
   private int idxLst ;
   private int gxdynajaxindex ;
   private java.math.BigDecimal AV30Sedamil ;
   private java.math.BigDecimal AV31Artextil ;
   private java.math.BigDecimal ZV30Sedamil ;
   private java.math.BigDecimal ZV31Artextil ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV34TermCod ;
   private String Z942TermCod ;
   private String Z8898TermDsc ;
   private String Z1189TermUsu ;
   private String Z1441ImpCod1 ;
   private String Z1442ImpCod2 ;
   private String Z1443ImpCod3 ;
   private String Z1444ImpCod4 ;
   private String Z1445ImpCod5 ;
   private String Z1446ImpLpt1 ;
   private String Z1447ImpLpt2 ;
   private String Z1448ImpLpt3 ;
   private String Z1449ImpLpt4 ;
   private String Z1450ImpLpt5 ;
   private String Z574ImpCod ;
   private String Z396EmprCod ;
   private String N396EmprCod ;
   private String N574ImpCod ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A13879ImpCDsc ;
   private String h574ImpCod ;
   private String A396EmprCod ;
   private String A574ImpCod ;
   private String Gx_mode ;
   private String AV34TermCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtTermCod_Internalname ;
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
   private String A942TermCod ;
   private String edtTermCod_Jsonclick ;
   private String edtTermDsc_Internalname ;
   private String A8898TermDsc ;
   private String edtTermDsc_Jsonclick ;
   private String edtImpCod_Internalname ;
   private String edtImpCod_Jsonclick ;
   private String edtTermUsu_Internalname ;
   private String A1189TermUsu ;
   private String edtTermUsu_Jsonclick ;
   private String edtTermFec_Internalname ;
   private String edtTermFec_Jsonclick ;
   private String Dvpanel_formatosimpresora_Width ;
   private String Dvpanel_formatosimpresora_Cls ;
   private String Dvpanel_formatosimpresora_Title ;
   private String Dvpanel_formatosimpresora_Iconposition ;
   private String Dvpanel_formatosimpresora_Internalname ;
   private String sStyleString ;
   private String tblFormatosimpresora_Internalname ;
   private String edtImpCod1_Internalname ;
   private String A1441ImpCod1 ;
   private String edtImpCod1_Jsonclick ;
   private String edtImpLpt1_Internalname ;
   private String A1446ImpLpt1 ;
   private String edtImpLpt1_Jsonclick ;
   private String edtImpCod2_Internalname ;
   private String A1442ImpCod2 ;
   private String edtImpCod2_Jsonclick ;
   private String edtImpLpt2_Internalname ;
   private String A1447ImpLpt2 ;
   private String edtImpLpt2_Jsonclick ;
   private String edtImpCod3_Internalname ;
   private String A1443ImpCod3 ;
   private String edtImpCod3_Jsonclick ;
   private String edtImpLpt3_Internalname ;
   private String A1448ImpLpt3 ;
   private String edtImpLpt3_Jsonclick ;
   private String edtImpCod4_Internalname ;
   private String A1444ImpCod4 ;
   private String edtImpCod4_Jsonclick ;
   private String edtImpLpt4_Internalname ;
   private String A1449ImpLpt4 ;
   private String edtImpLpt4_Jsonclick ;
   private String edtImpCod5_Internalname ;
   private String A1445ImpCod5 ;
   private String edtImpCod5_Jsonclick ;
   private String edtImpLpt5_Internalname ;
   private String A1450ImpLpt5 ;
   private String edtImpLpt5_Jsonclick ;
   private String Dvpanel_otrosdatos_Width ;
   private String Dvpanel_otrosdatos_Cls ;
   private String Dvpanel_otrosdatos_Title ;
   private String Dvpanel_otrosdatos_Iconposition ;
   private String Dvpanel_otrosdatos_Internalname ;
   private String tblOtrosdatos_Internalname ;
   private String edtTermBol_Internalname ;
   private String edtTermBol_Caption ;
   private String edtTermBol_Jsonclick ;
   private String edtTermBal_Internalname ;
   private String edtTermBal_Jsonclick ;
   private String edtTermLog1_Internalname ;
   private String edtTermLog1_Jsonclick ;
   private String edtTermLog2_Internalname ;
   private String edtTermLog2_Jsonclick ;
   private String edtTermEst_Internalname ;
   private String edtTermEst_Jsonclick ;
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
   private String edtImpDsc_Internalname ;
   private String A576ImpDsc ;
   private String edtImpDsc_Jsonclick ;
   private String AV38Insert_EmprCod ;
   private String AV39Insert_ImpCod ;
   private String AV44Pgmname ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String Dvpanel_formatosimpresora_Objectcall ;
   private String Dvpanel_formatosimpresora_Class ;
   private String Dvpanel_formatosimpresora_Height ;
   private String Dvpanel_otrosdatos_Objectcall ;
   private String Dvpanel_otrosdatos_Class ;
   private String Dvpanel_otrosdatos_Height ;
   private String hsh ;
   private String sMode122 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String AV16Lit0 ;
   private String AV17Lit1 ;
   private String AV18Lit2 ;
   private String AV19Lit3 ;
   private String AV22Lit4 ;
   private String AV23Lit5 ;
   private String AV24Lit6 ;
   private String AV28Lit7 ;
   private String AV21LitFe ;
   private String AV27Station ;
   private String AV25EmprCod ;
   private String AV26EmprNom ;
   private String AV20UsurCod ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String Z407EmprNom ;
   private String Z576ImpDsc ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String gxwrpcisep ;
   private String l13879ImpCDsc ;
   private String Zh574ImpCod ;
   private java.util.Date Z11758TermFec ;
   private java.util.Date A11758TermFec ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n396EmprCod ;
   private boolean n574ImpCod ;
   private boolean wbErr ;
   private boolean n8899TermPes ;
   private boolean n8678TermNoTr ;
   private boolean Dvpanel_tableattributes_Autowidth ;
   private boolean Dvpanel_tableattributes_Autoheight ;
   private boolean Dvpanel_tableattributes_Collapsible ;
   private boolean Dvpanel_tableattributes_Collapsed ;
   private boolean Dvpanel_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_tableattributes_Autoscroll ;
   private boolean Dvpanel_formatosimpresora_Autowidth ;
   private boolean Dvpanel_formatosimpresora_Autoheight ;
   private boolean Dvpanel_formatosimpresora_Collapsible ;
   private boolean Dvpanel_formatosimpresora_Collapsed ;
   private boolean Dvpanel_formatosimpresora_Showcollapseicon ;
   private boolean Dvpanel_formatosimpresora_Autoscroll ;
   private boolean Dvpanel_otrosdatos_Autowidth ;
   private boolean Dvpanel_otrosdatos_Autoheight ;
   private boolean Dvpanel_otrosdatos_Collapsible ;
   private boolean Dvpanel_otrosdatos_Collapsed ;
   private boolean Dvpanel_otrosdatos_Showcollapseicon ;
   private boolean Dvpanel_otrosdatos_Autoscroll ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean Dvpanel_formatosimpresora_Enabled ;
   private boolean Dvpanel_formatosimpresora_Showheader ;
   private boolean Dvpanel_formatosimpresora_Visible ;
   private boolean Dvpanel_otrosdatos_Enabled ;
   private boolean Dvpanel_otrosdatos_Showheader ;
   private boolean Dvpanel_otrosdatos_Visible ;
   private boolean n8898TermDsc ;
   private boolean n1189TermUsu ;
   private boolean n11758TermFec ;
   private boolean n1441ImpCod1 ;
   private boolean n1446ImpLpt1 ;
   private boolean n1442ImpCod2 ;
   private boolean n1447ImpLpt2 ;
   private boolean n1443ImpCod3 ;
   private boolean n1448ImpLpt3 ;
   private boolean n1444ImpCod4 ;
   private boolean n1449ImpLpt4 ;
   private boolean n1445ImpCod5 ;
   private boolean n1450ImpLpt5 ;
   private boolean n6112TermBol ;
   private boolean n6113TermBal ;
   private boolean n6721TermLog1 ;
   private boolean n6722TermLog2 ;
   private boolean n11757TermEst ;
   private boolean n407EmprNom ;
   private boolean n576ImpDsc ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private String Z6721TermLog1 ;
   private String Z6722TermLog2 ;
   private String A6721TermLog1 ;
   private String A6722TermLog2 ;
   private com.genexus.internet.StringCollection gxdynajaxctrlcodr ;
   private com.genexus.internet.StringCollection gxdynajaxctrldescr ;
   private com.genexus.webpanels.WebSession AV37WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_formatosimpresora ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_otrosdatos ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private ICheckbox chkTermPes ;
   private ICheckbox chkTermNoTr ;
   private IDataStoreProvider pr_default ;
   private String[] T002Y6_A13879ImpCDsc ;
   private String[] T002Y6_A574ImpCod ;
   private boolean[] T002Y6_n574ImpCod ;
   private String[] T002Y4_A576ImpDsc ;
   private boolean[] T002Y4_n576ImpDsc ;
   private String[] T002Y5_A407EmprNom ;
   private boolean[] T002Y5_n407EmprNom ;
   private String[] T002Y7_A942TermCod ;
   private byte[] T002Y7_A8899TermPes ;
   private boolean[] T002Y7_n8899TermPes ;
   private String[] T002Y7_A407EmprNom ;
   private boolean[] T002Y7_n407EmprNom ;
   private String[] T002Y7_A8898TermDsc ;
   private boolean[] T002Y7_n8898TermDsc ;
   private String[] T002Y7_A576ImpDsc ;
   private boolean[] T002Y7_n576ImpDsc ;
   private String[] T002Y7_A1189TermUsu ;
   private boolean[] T002Y7_n1189TermUsu ;
   private String[] T002Y7_A1441ImpCod1 ;
   private boolean[] T002Y7_n1441ImpCod1 ;
   private String[] T002Y7_A1442ImpCod2 ;
   private boolean[] T002Y7_n1442ImpCod2 ;
   private String[] T002Y7_A1443ImpCod3 ;
   private boolean[] T002Y7_n1443ImpCod3 ;
   private String[] T002Y7_A1444ImpCod4 ;
   private boolean[] T002Y7_n1444ImpCod4 ;
   private String[] T002Y7_A1445ImpCod5 ;
   private boolean[] T002Y7_n1445ImpCod5 ;
   private String[] T002Y7_A1446ImpLpt1 ;
   private boolean[] T002Y7_n1446ImpLpt1 ;
   private String[] T002Y7_A1447ImpLpt2 ;
   private boolean[] T002Y7_n1447ImpLpt2 ;
   private String[] T002Y7_A1448ImpLpt3 ;
   private boolean[] T002Y7_n1448ImpLpt3 ;
   private String[] T002Y7_A1449ImpLpt4 ;
   private boolean[] T002Y7_n1449ImpLpt4 ;
   private String[] T002Y7_A1450ImpLpt5 ;
   private boolean[] T002Y7_n1450ImpLpt5 ;
   private byte[] T002Y7_A6112TermBol ;
   private boolean[] T002Y7_n6112TermBol ;
   private byte[] T002Y7_A6113TermBal ;
   private boolean[] T002Y7_n6113TermBal ;
   private byte[] T002Y7_A8678TermNoTr ;
   private boolean[] T002Y7_n8678TermNoTr ;
   private String[] T002Y7_A6721TermLog1 ;
   private boolean[] T002Y7_n6721TermLog1 ;
   private String[] T002Y7_A6722TermLog2 ;
   private boolean[] T002Y7_n6722TermLog2 ;
   private byte[] T002Y7_A11757TermEst ;
   private boolean[] T002Y7_n11757TermEst ;
   private java.util.Date[] T002Y7_A11758TermFec ;
   private boolean[] T002Y7_n11758TermFec ;
   private String[] T002Y7_A574ImpCod ;
   private boolean[] T002Y7_n574ImpCod ;
   private String[] T002Y7_A396EmprCod ;
   private boolean[] T002Y7_n396EmprCod ;
   private String[] T002Y8_A13879ImpCDsc ;
   private String[] T002Y8_A574ImpCod ;
   private boolean[] T002Y8_n574ImpCod ;
   private String[] T002Y9_A13879ImpCDsc ;
   private String[] T002Y9_A574ImpCod ;
   private boolean[] T002Y9_n574ImpCod ;
   private String[] T002Y10_A13879ImpCDsc ;
   private String[] T002Y10_A574ImpCod ;
   private boolean[] T002Y10_n574ImpCod ;
   private String[] T002Y11_A407EmprNom ;
   private boolean[] T002Y11_n407EmprNom ;
   private String[] T002Y12_A576ImpDsc ;
   private boolean[] T002Y12_n576ImpDsc ;
   private String[] T002Y13_A942TermCod ;
   private String[] T002Y3_A942TermCod ;
   private byte[] T002Y3_A8899TermPes ;
   private boolean[] T002Y3_n8899TermPes ;
   private String[] T002Y3_A8898TermDsc ;
   private boolean[] T002Y3_n8898TermDsc ;
   private String[] T002Y3_A1189TermUsu ;
   private boolean[] T002Y3_n1189TermUsu ;
   private String[] T002Y3_A1441ImpCod1 ;
   private boolean[] T002Y3_n1441ImpCod1 ;
   private String[] T002Y3_A1442ImpCod2 ;
   private boolean[] T002Y3_n1442ImpCod2 ;
   private String[] T002Y3_A1443ImpCod3 ;
   private boolean[] T002Y3_n1443ImpCod3 ;
   private String[] T002Y3_A1444ImpCod4 ;
   private boolean[] T002Y3_n1444ImpCod4 ;
   private String[] T002Y3_A1445ImpCod5 ;
   private boolean[] T002Y3_n1445ImpCod5 ;
   private String[] T002Y3_A1446ImpLpt1 ;
   private boolean[] T002Y3_n1446ImpLpt1 ;
   private String[] T002Y3_A1447ImpLpt2 ;
   private boolean[] T002Y3_n1447ImpLpt2 ;
   private String[] T002Y3_A1448ImpLpt3 ;
   private boolean[] T002Y3_n1448ImpLpt3 ;
   private String[] T002Y3_A1449ImpLpt4 ;
   private boolean[] T002Y3_n1449ImpLpt4 ;
   private String[] T002Y3_A1450ImpLpt5 ;
   private boolean[] T002Y3_n1450ImpLpt5 ;
   private byte[] T002Y3_A6112TermBol ;
   private boolean[] T002Y3_n6112TermBol ;
   private byte[] T002Y3_A6113TermBal ;
   private boolean[] T002Y3_n6113TermBal ;
   private byte[] T002Y3_A8678TermNoTr ;
   private boolean[] T002Y3_n8678TermNoTr ;
   private String[] T002Y3_A6721TermLog1 ;
   private boolean[] T002Y3_n6721TermLog1 ;
   private String[] T002Y3_A6722TermLog2 ;
   private boolean[] T002Y3_n6722TermLog2 ;
   private byte[] T002Y3_A11757TermEst ;
   private boolean[] T002Y3_n11757TermEst ;
   private java.util.Date[] T002Y3_A11758TermFec ;
   private boolean[] T002Y3_n11758TermFec ;
   private String[] T002Y3_A574ImpCod ;
   private boolean[] T002Y3_n574ImpCod ;
   private String[] T002Y3_A396EmprCod ;
   private boolean[] T002Y3_n396EmprCod ;
   private String[] T002Y14_A942TermCod ;
   private String[] T002Y15_A942TermCod ;
   private String[] T002Y16_A13879ImpCDsc ;
   private String[] T002Y16_A574ImpCod ;
   private boolean[] T002Y16_n574ImpCod ;
   private String[] T002Y2_A942TermCod ;
   private byte[] T002Y2_A8899TermPes ;
   private boolean[] T002Y2_n8899TermPes ;
   private String[] T002Y2_A8898TermDsc ;
   private boolean[] T002Y2_n8898TermDsc ;
   private String[] T002Y2_A1189TermUsu ;
   private boolean[] T002Y2_n1189TermUsu ;
   private String[] T002Y2_A1441ImpCod1 ;
   private boolean[] T002Y2_n1441ImpCod1 ;
   private String[] T002Y2_A1442ImpCod2 ;
   private boolean[] T002Y2_n1442ImpCod2 ;
   private String[] T002Y2_A1443ImpCod3 ;
   private boolean[] T002Y2_n1443ImpCod3 ;
   private String[] T002Y2_A1444ImpCod4 ;
   private boolean[] T002Y2_n1444ImpCod4 ;
   private String[] T002Y2_A1445ImpCod5 ;
   private boolean[] T002Y2_n1445ImpCod5 ;
   private String[] T002Y2_A1446ImpLpt1 ;
   private boolean[] T002Y2_n1446ImpLpt1 ;
   private String[] T002Y2_A1447ImpLpt2 ;
   private boolean[] T002Y2_n1447ImpLpt2 ;
   private String[] T002Y2_A1448ImpLpt3 ;
   private boolean[] T002Y2_n1448ImpLpt3 ;
   private String[] T002Y2_A1449ImpLpt4 ;
   private boolean[] T002Y2_n1449ImpLpt4 ;
   private String[] T002Y2_A1450ImpLpt5 ;
   private boolean[] T002Y2_n1450ImpLpt5 ;
   private byte[] T002Y2_A6112TermBol ;
   private boolean[] T002Y2_n6112TermBol ;
   private byte[] T002Y2_A6113TermBal ;
   private boolean[] T002Y2_n6113TermBal ;
   private byte[] T002Y2_A8678TermNoTr ;
   private boolean[] T002Y2_n8678TermNoTr ;
   private String[] T002Y2_A6721TermLog1 ;
   private boolean[] T002Y2_n6721TermLog1 ;
   private String[] T002Y2_A6722TermLog2 ;
   private boolean[] T002Y2_n6722TermLog2 ;
   private byte[] T002Y2_A11757TermEst ;
   private boolean[] T002Y2_n11757TermEst ;
   private java.util.Date[] T002Y2_A11758TermFec ;
   private boolean[] T002Y2_n11758TermFec ;
   private String[] T002Y2_A574ImpCod ;
   private boolean[] T002Y2_n574ImpCod ;
   private String[] T002Y2_A396EmprCod ;
   private boolean[] T002Y2_n396EmprCod ;
   private String[] T002Y20_A407EmprNom ;
   private boolean[] T002Y20_n407EmprNom ;
   private String[] T002Y21_A576ImpDsc ;
   private boolean[] T002Y21_n576ImpDsc ;
   private String[] T002Y22_A942TermCod ;
   private int[] T002Y22_A10133TermCliCod ;
   private String[] T002Y23_A942TermCod ;
   private String[] T002Y23_A8900TermPesPro ;
   private String[] T002Y24_A942TermCod ;
   private int[] T002Y24_A2135RepBarCod ;
   private byte[] T002Y24_A2137RepBarReo ;
   private String[] T002Y24_A2136RepBarPar ;
   private byte[] T002Y24_A2681RepComLin ;
   private String[] T002Y24_A2138RepComCod ;
   private String[] T002Y24_A2140RepFonCod ;
   private String[] T002Y25_A942TermCod ;
   private String[] T002Y26_A574ImpCod ;
   private boolean[] T002Y26_n574ImpCod ;
   private String[] T002Y26_A13879ImpCDsc ;
   private String[] T002Y27_A13879ImpCDsc ;
   private String[] T002Y27_A574ImpCod ;
   private boolean[] T002Y27_n574ImpCod ;
   private String[] T002Y28_A13879ImpCDsc ;
   private String[] T002Y28_A574ImpCod ;
   private boolean[] T002Y28_n574ImpCod ;
   private String[] T002Y29_A576ImpDsc ;
   private boolean[] T002Y29_n576ImpDsc ;
   private String[] T002Y30_A407EmprNom ;
   private boolean[] T002Y30_n407EmprNom ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private app.wwpbaseobjects.SdtWWPContext AV35WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV36TrnContext ;
   private app.wwpbaseobjects.SdtWWPTransactionContext_Attribute AV40TrnContextAtt ;
}

final  class ttermin__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttermin__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttermin__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttermin__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttermin__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T002Y2", "SELECT TermCod, TermPes, TermDsc, TermUsu, ImpCod1, ImpCod2, ImpCod3, ImpCod4, ImpCod5, ImpLpt1, ImpLpt2, ImpLpt3, ImpLpt4, ImpLpt5, TermBol, TermBal, TermNoTr, TermLog1, TermLog2, TermEst, TermFec, ImpCod, EmprCod FROM TXPTERMIN WHERE TermCod = ?  FOR UPDATE OF TermPes, TermDsc, TermUsu, ImpCod1, ImpCod2, ImpCod3, ImpCod4, ImpCod5, ImpLpt1, ImpLpt2, ImpLpt3, ImpLpt4, ImpLpt5, TermBol, TermBal, TermNoTr, TermLog1, TermLog2, TermEst, TermFec, ImpCod, EmprCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002Y3", "SELECT TermCod, TermPes, TermDsc, TermUsu, ImpCod1, ImpCod2, ImpCod3, ImpCod4, ImpCod5, ImpLpt1, ImpLpt2, ImpLpt3, ImpLpt4, ImpLpt5, TermBol, TermBal, TermNoTr, TermLog1, TermLog2, TermEst, TermFec, ImpCod, EmprCod FROM TXPTERMIN WHERE TermCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002Y4", "SELECT ImpDsc FROM TXPIMPRES WHERE ImpCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002Y5", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002Y6", "SELECT RTRIM(LTRIM(ImpCod)) || '-' || RTRIM(LTRIM(COALESCE( ImpDsc, ''))) AS ImpCDsc, ImpCod FROM TXPIMPRES WHERE ImpCod = ? ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002Y7", "SELECT /*+ FIRST_ROWS(100) */ TM1.TermCod, TM1.TermPes, T2.EmprNom, TM1.TermDsc, T3.ImpDsc, TM1.TermUsu, TM1.ImpCod1, TM1.ImpCod2, TM1.ImpCod3, TM1.ImpCod4, TM1.ImpCod5, TM1.ImpLpt1, TM1.ImpLpt2, TM1.ImpLpt3, TM1.ImpLpt4, TM1.ImpLpt5, TM1.TermBol, TM1.TermBal, TM1.TermNoTr, TM1.TermLog1, TM1.TermLog2, TM1.TermEst, TM1.TermFec, TM1.ImpCod, TM1.EmprCod FROM ((TXPTERMIN TM1 LEFT JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) LEFT JOIN TXPIMPRES T3 ON T3.ImpCod = TM1.ImpCod) WHERE TM1.TermCod = ? ORDER BY TM1.TermCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002Y8", "SELECT RTRIM(LTRIM(ImpCod)) || '-' || RTRIM(LTRIM(COALESCE( ImpDsc, ''))) AS ImpCDsc, ImpCod FROM TXPIMPRES WHERE ImpCod = ? ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002Y9", "SELECT /*+ FIRST_ROWS */ RTRIM(LTRIM(ImpCod)) || '-' || RTRIM(LTRIM(COALESCE( ImpDsc, ''))) AS ImpCDsc, ImpCod FROM TXPIMPRES WHERE RTRIM(LTRIM(ImpCod)) || '-' || RTRIM(LTRIM(COALESCE( ImpDsc, ''))) = ? ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002Y10", "SELECT /*+ FIRST_ROWS */ RTRIM(LTRIM(ImpCod)) || '-' || RTRIM(LTRIM(COALESCE( ImpDsc, ''))) AS ImpCDsc, ImpCod FROM TXPIMPRES WHERE RTRIM(LTRIM(ImpCod)) || '-' || RTRIM(LTRIM(COALESCE( ImpDsc, ''))) = ? ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002Y11", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002Y12", "SELECT ImpDsc FROM TXPIMPRES WHERE ImpCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002Y13", "SELECT /*+ FIRST_ROWS(1) */ TermCod FROM TXPTERMIN WHERE TermCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002Y14", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ TermCod FROM TXPTERMIN WHERE ( TermCod > ?) ORDER BY TermCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002Y15", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ TermCod FROM TXPTERMIN WHERE ( TermCod < ?) ORDER BY TermCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002Y16", "SELECT /*+ FIRST_ROWS */ RTRIM(LTRIM(ImpCod)) || '-' || RTRIM(LTRIM(COALESCE( ImpDsc, ''))) AS ImpCDsc, ImpCod FROM TXPIMPRES WHERE RTRIM(LTRIM(ImpCod)) || '-' || RTRIM(LTRIM(COALESCE( ImpDsc, ''))) = ? ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T002Y17", "INSERT INTO TXPTERMIN(TermCod, TermPes, TermDsc, TermUsu, ImpCod1, ImpCod2, ImpCod3, ImpCod4, ImpCod5, ImpLpt1, ImpLpt2, ImpLpt3, ImpLpt4, ImpLpt5, TermBol, TermBal, TermNoTr, TermLog1, TermLog2, TermEst, TermFec, ImpCod, EmprCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPTERMIN")
         ,new UpdateCursor("T002Y18", "UPDATE TXPTERMIN SET TermPes=?, TermDsc=?, TermUsu=?, ImpCod1=?, ImpCod2=?, ImpCod3=?, ImpCod4=?, ImpCod5=?, ImpLpt1=?, ImpLpt2=?, ImpLpt3=?, ImpLpt4=?, ImpLpt5=?, TermBol=?, TermBal=?, TermNoTr=?, TermLog1=?, TermLog2=?, TermEst=?, TermFec=?, ImpCod=?, EmprCod=?  WHERE TermCod = ?", GX_NOMASK, "TXPTERMIN")
         ,new UpdateCursor("T002Y19", "DELETE FROM TXPTERMIN  WHERE TermCod = ?", GX_NOMASK, "TXPTERMIN")
         ,new ForEachCursor("T002Y20", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002Y21", "SELECT ImpDsc FROM TXPIMPRES WHERE ImpCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002Y22", "SELECT * FROM (SELECT TermCod, TermCliCod FROM TXPTERMCL WHERE TermCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002Y23", "SELECT * FROM (SELECT TermCod, TermPesPro FROM TXPTERMI1 WHERE TermCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002Y24", "SELECT * FROM (SELECT TermCod, RepBarCod, RepBarReo, RepBarPar, RepComLin, RepComCod, RepFonCod FROM TXPLANREP WHERE TermCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002Y25", "SELECT /*+ FIRST_ROWS(100) */ TermCod FROM TXPTERMIN ORDER BY TermCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002Y26", "SELECT * FROM (SELECT ImpCod, RTRIM(LTRIM(ImpCod)) || '-' || RTRIM(LTRIM(COALESCE( ImpDsc, ''))) AS ImpCDsc FROM TXPIMPRES WHERE UPPER(RTRIM(LTRIM(ImpCod)) || '-' || RTRIM(LTRIM(COALESCE( ImpDsc, '')))) like '%' || UPPER(?)) WHERE rownum <= 5 ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002Y27", "SELECT RTRIM(LTRIM(ImpCod)) || '-' || RTRIM(LTRIM(COALESCE( ImpDsc, ''))) AS ImpCDsc, ImpCod FROM TXPIMPRES WHERE RTRIM(LTRIM(ImpCod)) || '-' || RTRIM(LTRIM(COALESCE( ImpDsc, ''))) = ? ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002Y28", "SELECT /*+ FIRST_ROWS */ RTRIM(LTRIM(ImpCod)) || '-' || RTRIM(LTRIM(COALESCE( ImpDsc, ''))) AS ImpCDsc, ImpCod FROM TXPIMPRES WHERE RTRIM(LTRIM(ImpCod)) || '-' || RTRIM(LTRIM(COALESCE( ImpDsc, ''))) = ? ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002Y29", "SELECT ImpDsc FROM TXPIMPRES WHERE ImpCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002Y30", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 8);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 10);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 10);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 10);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 10);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 10);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 10);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 10);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 10);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(14, 10);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((byte[]) buf[27])[0] = rslt.getByte(15);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((byte[]) buf[29])[0] = rslt.getByte(16);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((byte[]) buf[31])[0] = rslt.getByte(17);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getVarchar(18);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getVarchar(19);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((byte[]) buf[37])[0] = rslt.getByte(20);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[39])[0] = rslt.getGXDateTime(21);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((String[]) buf[41])[0] = rslt.getString(22, 10);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((String[]) buf[43])[0] = rslt.getString(23, 3);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 8);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 10);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 10);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 10);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 10);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 10);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 10);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 10);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 10);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(14, 10);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((byte[]) buf[27])[0] = rslt.getByte(15);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((byte[]) buf[29])[0] = rslt.getByte(16);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((byte[]) buf[31])[0] = rslt.getByte(17);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getVarchar(18);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getVarchar(19);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((byte[]) buf[37])[0] = rslt.getByte(20);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[39])[0] = rslt.getGXDateTime(21);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((String[]) buf[41])[0] = rslt.getString(22, 10);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((String[]) buf[43])[0] = rslt.getString(23, 3);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 20);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 50);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 20);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 8);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 10);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 10);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 10);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 10);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 10);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 10);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(14, 10);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(15, 10);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(16, 10);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((byte[]) buf[31])[0] = rslt.getByte(17);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((byte[]) buf[33])[0] = rslt.getByte(18);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((byte[]) buf[35])[0] = rslt.getByte(19);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getVarchar(20);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getVarchar(21);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((byte[]) buf[41])[0] = rslt.getByte(22);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[43])[0] = rslt.getGXDateTime(23);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((String[]) buf[45])[0] = rslt.getString(24, 10);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((String[]) buf[47])[0] = rslt.getString(25, 3);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 50);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 50);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 50);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 20);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 50);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 20);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
               ((String[]) buf[1])[0] = rslt.getString(2, 50);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 50);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 50);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 20);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
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
               stmt.setString(1, (String)parms[0], 10);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 10);
               return;
            case 2 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 10);
               }
               return;
            case 3 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               return;
            case 4 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 10);
               }
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 10);
               return;
            case 6 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 10);
               }
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 50);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 50);
               return;
            case 9 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               return;
            case 10 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 10);
               }
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 10);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 10);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 10);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 50);
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 10);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 30);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 8);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[8], 10);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[10], 10);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[12], 10);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[14], 10);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[16], 10);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[18], 10);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[20], 10);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[22], 10);
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(13, (String)parms[24], 10);
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(14, (String)parms[26], 10);
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(15, ((Number) parms[28]).byteValue());
               }
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(16, ((Number) parms[30]).byteValue());
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
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(18, (String)parms[34], 128);
               }
               if ( ((Boolean) parms[35]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(19, (String)parms[36], 128);
               }
               if ( ((Boolean) parms[37]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(20, ((Number) parms[38]).byteValue());
               }
               if ( ((Boolean) parms[39]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(21, (java.util.Date)parms[40], false);
               }
               if ( ((Boolean) parms[41]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(22, (String)parms[42], 10);
               }
               if ( ((Boolean) parms[43]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(23, (String)parms[44], 3);
               }
               return;
            case 16 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(1, ((Number) parms[1]).byteValue());
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
                  stmt.setString(4, (String)parms[7], 10);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 10);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[11], 10);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[13], 10);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[15], 10);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[17], 10);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[19], 10);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[21], 10);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[23], 10);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(13, (String)parms[25], 10);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(14, ((Number) parms[27]).byteValue());
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(15, ((Number) parms[29]).byteValue());
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
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(17, (String)parms[33], 128);
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(18, (String)parms[35], 128);
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(19, ((Number) parms[37]).byteValue());
               }
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(20, (java.util.Date)parms[39], false);
               }
               if ( ((Boolean) parms[40]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(21, (String)parms[41], 10);
               }
               if ( ((Boolean) parms[42]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(22, (String)parms[43], 3);
               }
               stmt.setString(23, (String)parms[44], 10);
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 10);
               return;
            case 18 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               return;
            case 19 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 10);
               }
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 10);
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 10);
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 10);
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 50);
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 50);
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 50);
               return;
            case 27 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 10);
               }
               return;
            case 28 :
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

