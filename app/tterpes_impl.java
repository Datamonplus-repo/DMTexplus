package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tterpes_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_10") == 0 )
      {
         A942TermCod = httpContext.GetPar( "TermCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A942TermCod", A942TermCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_10( A942TermCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_11") == 0 )
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
         gxload_11( A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_12") == 0 )
      {
         A942TermCod = httpContext.GetPar( "TermCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A942TermCod", A942TermCod);
         A8900TermPesPro = httpContext.GetPar( "TermPesPro") ;
         httpContext.ajax_rsp_assign_attri("", false, "A8900TermPesPro", A8900TermPesPro);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_12( A942TermCod, A8900TermPesPro) ;
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
      if ( ! entryPointCalled && ! ( isAjaxCallMode( ) || isFullAjaxMode( ) ) )
      {
         Gx_mode = gxfirstwebparm ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
         {
            AV33TermCod = httpContext.GetPar( "TermCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33TermCod", AV33TermCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTERMCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV33TermCod, ""))));
            AV34TermPesPro = httpContext.GetPar( "TermPesPro") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34TermPesPro", AV34TermPesPro);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTERMPESPRO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV34TermPesPro, ""))));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "TERMINALES DE PESAJE", ""), (short)(0)) ;
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

   public void gxnrgridlevel_level1_newrow_invoke( )
   {
      nRC_GXsfl_59 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_59"))) ;
      nGXsfl_59_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_59_idx"))) ;
      sGXsfl_59_idx = httpContext.GetPar( "sGXsfl_59_idx") ;
      cmbTermPesOpP.setVisible( (int)(GXutil.lval( httpContext.GetNextPar( ))) );
      httpContext.ajax_rsp_assign_prop("", false, cmbTermPesOpP.getInternalname(), "Visible", GXutil.ltrimstr( cmbTermPesOpP.getVisible(), 5, 0), !bGXsfl_59_Refreshing);
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

   public tterpes_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tterpes_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tterpes_impl.class ));
   }

   public tterpes_impl( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      chkTermPes = UIFactory.getCheckbox(this);
      cmbTermPesTpo = new HTMLChoice();
      cmbTermPesOpe = new HTMLChoice();
      cmbTermPesOpP = new HTMLChoice();
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
      if ( cmbTermPesTpo.getItemCount() > 0 )
      {
         A10177TermPesTpo = cmbTermPesTpo.getValidValue(A10177TermPesTpo) ;
         n10177TermPesTpo = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10177TermPesTpo", A10177TermPesTpo);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbTermPesTpo.setValue( GXutil.rtrim( A10177TermPesTpo) );
         httpContext.ajax_rsp_assign_prop("", false, cmbTermPesTpo.getInternalname(), "Values", cmbTermPesTpo.ToJavascriptSource(), true);
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtTermCod_Internalname, GXutil.rtrim( A942TermCod), GXutil.rtrim( localUtil.format( A942TermCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,22);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTermCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtTermCod_Enabled, 1, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTERPES.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtTermDsc_Internalname, GXutil.rtrim( A8898TermDsc), GXutil.rtrim( localUtil.format( A8898TermDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTermDsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtTermDsc_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTERPES.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtEmprCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtEmprCod_Internalname, httpContext.getMessage( "Código Empresa", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTERPES.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtEmprNom_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtEmprNom_Internalname, httpContext.getMessage( "Nombre", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTERPES.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkTermPes.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, chkTermPes.getInternalname(), httpContext.getMessage( "Pesaje Colorantes?", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Check box */
      ClassString = "AttributeFL" ;
      StyleString = "" ;
      app.GxWebStd.gx_checkbox_ctrl( httpContext, chkTermPes.getInternalname(), GXutil.str( A8899TermPes, 1, 0), "", httpContext.getMessage( "Pesaje Colorantes?", ""), 1, chkTermPes.getEnabled(), "1", httpContext.getMessage( "Terminal de Pesaje", ""), StyleString, ClassString, "", "", "");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtTermPesPro_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtTermPesPro_Internalname, httpContext.getMessage( "Protocolo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTermPesPro_Internalname, GXutil.rtrim( A8900TermPesPro), GXutil.rtrim( localUtil.format( A8900TermPesPro, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,44);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTermPesPro_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtTermPesPro_Enabled, 1, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTERPES.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtTermPesUlt_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtTermPesUlt_Internalname, httpContext.getMessage( "Ultimo Rango", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTermPesUlt_Internalname, GXutil.ltrim( localUtil.ntoc( A8901TermPesUlt, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTermPesUlt_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A8901TermPesUlt), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A8901TermPesUlt), "ZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTermPesUlt_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtTermPesUlt_Enabled, 0, "text", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTERPES.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbTermPesTpo.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, cmbTermPesTpo.getInternalname(), httpContext.getMessage( "Tipo de Bascula", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbTermPesTpo, cmbTermPesTpo.getInternalname(), GXutil.rtrim( A10177TermPesTpo), 1, cmbTermPesTpo.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbTermPesTpo.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,53);\"", "", true, (byte)(0), "HLP_TTERPES.htm");
      cmbTermPesTpo.setValue( GXutil.rtrim( A10177TermPesTpo) );
      httpContext.ajax_rsp_assign_prop("", false, cmbTermPesTpo.getInternalname(), "Values", cmbTermPesTpo.ToJavascriptSource(), true);
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 70,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTERPES.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 72,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTERPES.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTERPES.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
   }

   public void gxdraw_gridlevel_level1( )
   {
      /*  Grid Control  */
      startgridcontrol59( ) ;
      nGXsfl_59_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1209 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1209 = (short)(1) ;
            scanStart1341209( ) ;
            while ( RcdFound1209 != 0 )
            {
               init_level_properties1209( ) ;
               getByPrimaryKey1341209( ) ;
               addRow1341209( ) ;
               scanNext1341209( ) ;
            }
            scanEnd1341209( ) ;
            nBlankRcdCount1209 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B13880TermPesQty = A13880TermPesQty ;
         n13880TermPesQty = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13880TermPesQty", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13880TermPesQty), 4, 0));
         standaloneNotModal1341209( ) ;
         standaloneModal1341209( ) ;
         sMode1209 = Gx_mode ;
         while ( nGXsfl_59_idx < nRC_GXsfl_59 )
         {
            bGXsfl_59_Refreshing = true ;
            readRow1341209( ) ;
            edtTermPesRng_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TERMPESRNG_"+sGXsfl_59_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtTermPesRng_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTermPesRng_Enabled), 5, 0), !bGXsfl_59_Refreshing);
            edtTermPesMin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TERMPESMIN_"+sGXsfl_59_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtTermPesMin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTermPesMin_Enabled), 5, 0), !bGXsfl_59_Refreshing);
            edtTermPesMax_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TERMPESMAX_"+sGXsfl_59_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtTermPesMax_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTermPesMax_Enabled), 5, 0), !bGXsfl_59_Refreshing);
            cmbTermPesOpe.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "TERMPESOPE_"+sGXsfl_59_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
            httpContext.ajax_rsp_assign_prop("", false, cmbTermPesOpe.getInternalname(), "Enabled", GXutil.ltrimstr( cmbTermPesOpe.getEnabled(), 5, 0), !bGXsfl_59_Refreshing);
            edtTermPesTol_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TERMPESTOL_"+sGXsfl_59_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtTermPesTol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTermPesTol_Enabled), 5, 0), !bGXsfl_59_Refreshing);
            cmbTermPesOpP.setVisible( (int)(localUtil.ctol( httpContext.cgiGet( "TERMPESOPP_"+sGXsfl_59_idx+"Visible"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
            httpContext.ajax_rsp_assign_prop("", false, cmbTermPesOpP.getInternalname(), "Visible", GXutil.ltrimstr( cmbTermPesOpP.getVisible(), 5, 0), !bGXsfl_59_Refreshing);
            cmbTermPesOpP.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "TERMPESOPP_"+sGXsfl_59_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
            httpContext.ajax_rsp_assign_prop("", false, cmbTermPesOpP.getInternalname(), "Enabled", GXutil.ltrimstr( cmbTermPesOpP.getEnabled(), 5, 0), !bGXsfl_59_Refreshing);
            if ( ( nRcdExists_1209 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1341209( ) ;
            }
            sendRow1341209( ) ;
            bGXsfl_59_Refreshing = false ;
         }
         Gx_mode = sMode1209 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A13880TermPesQty = B13880TermPesQty ;
         n13880TermPesQty = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13880TermPesQty", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13880TermPesQty), 4, 0));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1209 = (short)(5) ;
         nRcdExists_1209 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1341209( ) ;
            while ( RcdFound1209 != 0 )
            {
               sGXsfl_59_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_59_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_591209( ) ;
               init_level_properties1209( ) ;
               standaloneNotModal1341209( ) ;
               getByPrimaryKey1341209( ) ;
               standaloneModal1341209( ) ;
               addRow1341209( ) ;
               scanNext1341209( ) ;
            }
            scanEnd1341209( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      if ( ! isDsp( ) && ! isDlt( ) )
      {
         sMode1209 = Gx_mode ;
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         sGXsfl_59_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_59_idx+1), 4, 0), (short)(4), "0") ;
         subsflControlProps_591209( ) ;
         initAll1341209( ) ;
         init_level_properties1209( ) ;
         B13880TermPesQty = A13880TermPesQty ;
         n13880TermPesQty = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13880TermPesQty", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13880TermPesQty), 4, 0));
         nRcdExists_1209 = (short)(0) ;
         nIsMod_1209 = (short)(0) ;
         nRcdDeleted_1209 = (short)(0) ;
         nBlankRcdCount1209 = (short)(nBlankRcdUsr1209+nBlankRcdCount1209) ;
         fRowAdded = 0 ;
         while ( nBlankRcdCount1209 > 0 )
         {
            standaloneNotModal1341209( ) ;
            standaloneModal1341209( ) ;
            addRow1341209( ) ;
            if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
            {
               fRowAdded = 1 ;
               GX_FocusControl = edtTermPesRng_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            nBlankRcdCount1209 = (short)(nBlankRcdCount1209-1) ;
         }
         Gx_mode = sMode1209 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A13880TermPesQty = B13880TermPesQty ;
         n13880TermPesQty = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13880TermPesQty", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13880TermPesQty), 4, 0));
      }
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
      e111342 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z942TermCod = httpContext.cgiGet( "Z942TermCod") ;
            Z8900TermPesPro = httpContext.cgiGet( "Z8900TermPesPro") ;
            Z8901TermPesUlt = localUtil.ctol( httpContext.cgiGet( "Z8901TermPesUlt"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            Z10177TermPesTpo = httpContext.cgiGet( "Z10177TermPesTpo") ;
            O13880TermPesQty = (short)(localUtil.ctol( httpContext.cgiGet( "O13880TermPesQty"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_59 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_59"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV33TermCod = httpContext.cgiGet( "vTERMCOD") ;
            AV34TermPesPro = httpContext.cgiGet( "vTERMPESPRO") ;
            A13880TermPesQty = (short)(localUtil.ctol( httpContext.cgiGet( "TERMPESQTY"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
            A942TermCod = httpContext.cgiGet( edtTermCod_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A942TermCod", A942TermCod);
            A8898TermDsc = httpContext.cgiGet( edtTermDsc_Internalname) ;
            n8898TermDsc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8898TermDsc", A8898TermDsc);
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            n396EmprCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            A8899TermPes = (byte)(((GXutil.strcmp(httpContext.cgiGet( chkTermPes.getInternalname()), "1")==0) ? 1 : 0)) ;
            n8899TermPes = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8899TermPes", GXutil.str( A8899TermPes, 1, 0));
            A8900TermPesPro = httpContext.cgiGet( edtTermPesPro_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8900TermPesPro", A8900TermPesPro);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTermPesUlt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTermPesUlt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TERMPESULT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTermPesUlt_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A8901TermPesUlt = 0 ;
               n8901TermPesUlt = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A8901TermPesUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8901TermPesUlt), 10, 0));
            }
            else
            {
               A8901TermPesUlt = localUtil.ctol( httpContext.cgiGet( edtTermPesUlt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
               n8901TermPesUlt = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A8901TermPesUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8901TermPesUlt), 10, 0));
            }
            cmbTermPesTpo.setName( cmbTermPesTpo.getInternalname() );
            cmbTermPesTpo.setValue( httpContext.cgiGet( cmbTermPesTpo.getInternalname()) );
            A10177TermPesTpo = httpContext.cgiGet( cmbTermPesTpo.getInternalname()) ;
            n10177TermPesTpo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10177TermPesTpo", A10177TermPesTpo);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"TTERPES");
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( GXutil.strcmp(A942TermCod, Z942TermCod) != 0 ) || ( GXutil.strcmp(A8900TermPesPro, Z8900TermPesPro) != 0 ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("tterpes:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               A942TermCod = httpContext.GetPar( "TermCod") ;
               httpContext.ajax_rsp_assign_attri("", false, "A942TermCod", A942TermCod);
               A8900TermPesPro = httpContext.GetPar( "TermPesPro") ;
               httpContext.ajax_rsp_assign_attri("", false, "A8900TermPesPro", A8900TermPesPro);
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
                  sMode1208 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  Gx_mode = sMode1208 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound1208 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_1340( ) ;
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
                        e111342 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e121342 ();
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
         e121342 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll1341208( ) ;
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
         disableAttributes1341208( ) ;
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

   public void confirm_1340( )
   {
      beforeValidate1341208( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1341208( ) ;
         }
         else
         {
            checkExtendedTable1341208( ) ;
            closeExtendedTableCursors1341208( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode1208 = Gx_mode ;
         confirm_1341209( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode1208 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode1208 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
   }

   public void confirm_1341209( )
   {
      s13880TermPesQty = O13880TermPesQty ;
      n13880TermPesQty = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13880TermPesQty", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13880TermPesQty), 4, 0));
      nGXsfl_59_idx = 0 ;
      while ( nGXsfl_59_idx < nRC_GXsfl_59 )
      {
         readRow1341209( ) ;
         if ( ( nRcdExists_1209 != 0 ) || ( nIsMod_1209 != 0 ) )
         {
            getKey1341209( ) ;
            if ( ( nRcdExists_1209 == 0 ) && ( nRcdDeleted_1209 == 0 ) )
            {
               if ( RcdFound1209 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1341209( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1341209( ) ;
                     closeExtendedTableCursors1341209( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O13880TermPesQty = A13880TermPesQty ;
                     n13880TermPesQty = false ;
                     httpContext.ajax_rsp_assign_attri("", false, "A13880TermPesQty", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13880TermPesQty), 4, 0));
                  }
               }
               else
               {
                  GXCCtl = "TERMPESRNG_" + sGXsfl_59_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtTermPesRng_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1209 != 0 )
               {
                  if ( nRcdDeleted_1209 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1341209( ) ;
                     load1341209( ) ;
                     beforeValidate1341209( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1341209( ) ;
                        O13880TermPesQty = A13880TermPesQty ;
                        n13880TermPesQty = false ;
                        httpContext.ajax_rsp_assign_attri("", false, "A13880TermPesQty", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13880TermPesQty), 4, 0));
                     }
                  }
                  else
                  {
                     if ( nIsMod_1209 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1341209( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1341209( ) ;
                           closeExtendedTableCursors1341209( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O13880TermPesQty = A13880TermPesQty ;
                           n13880TermPesQty = false ;
                           httpContext.ajax_rsp_assign_attri("", false, "A13880TermPesQty", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13880TermPesQty), 4, 0));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1209 == 0 )
                  {
                     GXCCtl = "TERMPESRNG_" + sGXsfl_59_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtTermPesRng_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtTermPesRng_Internalname, GXutil.ltrim( localUtil.ntoc( A8902TermPesRng, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtTermPesMin_Internalname, GXutil.ltrim( localUtil.ntoc( A8903TermPesMin, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtTermPesMax_Internalname, GXutil.ltrim( localUtil.ntoc( A8904TermPesMax, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( cmbTermPesOpe.getInternalname(), GXutil.rtrim( A8905TermPesOpe)) ;
         httpContext.changePostValue( edtTermPesTol_Internalname, GXutil.ltrim( localUtil.ntoc( A8906TermPesTol, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( cmbTermPesOpP.getInternalname(), GXutil.rtrim( A12701TermPesOpP)) ;
         httpContext.changePostValue( "ZT_"+"Z8902TermPesRng_"+sGXsfl_59_idx, GXutil.ltrim( localUtil.ntoc( Z8902TermPesRng, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8903TermPesMin_"+sGXsfl_59_idx, GXutil.ltrim( localUtil.ntoc( Z8903TermPesMin, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8904TermPesMax_"+sGXsfl_59_idx, GXutil.ltrim( localUtil.ntoc( Z8904TermPesMax, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8905TermPesOpe_"+sGXsfl_59_idx, GXutil.rtrim( Z8905TermPesOpe)) ;
         httpContext.changePostValue( "ZT_"+"Z8906TermPesTol_"+sGXsfl_59_idx, GXutil.ltrim( localUtil.ntoc( Z8906TermPesTol, (byte)(10), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12701TermPesOpP_"+sGXsfl_59_idx, GXutil.rtrim( Z12701TermPesOpP)) ;
         httpContext.changePostValue( "nRcdDeleted_1209_"+sGXsfl_59_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1209, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1209_"+sGXsfl_59_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1209, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1209_"+sGXsfl_59_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1209, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1209 != 0 )
         {
            httpContext.changePostValue( "TERMPESRNG_"+sGXsfl_59_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTermPesRng_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TERMPESMIN_"+sGXsfl_59_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTermPesMin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TERMPESMAX_"+sGXsfl_59_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTermPesMax_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TERMPESOPE_"+sGXsfl_59_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbTermPesOpe.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TERMPESTOL_"+sGXsfl_59_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTermPesTol_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TERMPESOPP_"+sGXsfl_59_idx+"Visible", GXutil.ltrim( localUtil.ntoc( cmbTermPesOpP.getVisible(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TERMPESOPP_"+sGXsfl_59_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbTermPesOpP.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O13880TermPesQty = s13880TermPesQty ;
      n13880TermPesQty = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13880TermPesQty", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13880TermPesQty), 4, 0));
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1340( )
   {
   }

   public void e111342( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV27Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      tterpes_impl.this.GXt_char1 = GXv_char2[0] ;
      AV27Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27Station", AV27Station);
      GXv_char2[0] = AV25EmprCod ;
      GXv_char3[0] = AV26EmprNom ;
      GXv_char4[0] = AV20UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV27Station, GXv_char2, GXv_char3, GXv_char4) ;
      tterpes_impl.this.AV25EmprCod = GXv_char2[0] ;
      tterpes_impl.this.AV26EmprNom = GXv_char3[0] ;
      tterpes_impl.this.AV20UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25EmprCod", AV25EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV26EmprNom", AV26EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV20UsurCod", AV20UsurCod);
      GXt_int5 = AV32tinteoriente ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV25EmprCod, httpContext.getMessage( "ORIENT", ""), GXv_int6) ;
      tterpes_impl.this.GXt_int5 = GXv_int6[0] ;
      AV32tinteoriente = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32tinteoriente", GXutil.str( AV32tinteoriente, 1, 0));
      cmbTermPesOpP.setVisible( AV32tinteoriente );
      httpContext.ajax_rsp_assign_prop("", false, cmbTermPesOpP.getInternalname(), "Visible", GXutil.ltrimstr( cmbTermPesOpP.getVisible(), 5, 0), !bGXsfl_59_Refreshing);
      GXt_char1 = AV27Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      tterpes_impl.this.GXt_char1 = GXv_char4[0] ;
      AV27Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27Station", AV27Station);
      GXv_char4[0] = AV25EmprCod ;
      GXv_char3[0] = AV26EmprNom ;
      GXv_char2[0] = AV20UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV27Station, GXv_char4, GXv_char3, GXv_char2) ;
      tterpes_impl.this.AV25EmprCod = GXv_char4[0] ;
      tterpes_impl.this.AV26EmprNom = GXv_char3[0] ;
      tterpes_impl.this.AV20UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25EmprCod", AV25EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV26EmprNom", AV26EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV20UsurCod", AV20UsurCod);
      GXv_SdtWWPContext7[0] = AV35WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext7) ;
      AV35WWPContext = GXv_SdtWWPContext7[0] ;
      AV36TrnContext.fromxml(AV37WebSession.getValue("TrnContext"), null, null);
   }

   public void e121342( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV36TrnContext.getgxTv_SdtWWPTransactionContext_Callerondelete() )
      {
         callWebObject(formatLink("app.tterpesww", new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      pr_default.close(6);
      pr_default.close(5);
      pr_default.close(4);
      pr_default.close(3);
      pr_default.close(1);
      returnInSub = true;
      if (true) return;
   }

   public void zm1341208( int GX_JID )
   {
      if ( ( GX_JID == 9 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z8901TermPesUlt = T01345_A8901TermPesUlt[0] ;
            Z10177TermPesTpo = T01345_A10177TermPesTpo[0] ;
         }
         else
         {
            Z8901TermPesUlt = A8901TermPesUlt ;
            Z10177TermPesTpo = A10177TermPesTpo ;
         }
      }
      if ( GX_JID == -9 )
      {
         Z8900TermPesPro = A8900TermPesPro ;
         Z8901TermPesUlt = A8901TermPesUlt ;
         Z10177TermPesTpo = A10177TermPesTpo ;
         Z942TermCod = A942TermCod ;
         Z8898TermDsc = A8898TermDsc ;
         Z8899TermPes = A8899TermPes ;
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
         Z13880TermPesQty = A13880TermPesQty ;
      }
   }

   public void standaloneNotModal( )
   {
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV33TermCod)==0) )
      {
         A942TermCod = AV33TermCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A942TermCod", A942TermCod);
      }
      if ( ! (GXutil.strcmp("", AV33TermCod)==0) )
      {
         edtTermCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTermCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTermCod_Enabled), 5, 0), true);
      }
      else
      {
         edtTermCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTermCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTermCod_Enabled), 5, 0), true);
      }
      if ( ! (GXutil.strcmp("", AV33TermCod)==0) )
      {
         edtTermCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTermCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTermCod_Enabled), 5, 0), true);
      }
      if ( ! (GXutil.strcmp("", AV34TermPesPro)==0) )
      {
         A8900TermPesPro = AV34TermPesPro ;
         httpContext.ajax_rsp_assign_attri("", false, "A8900TermPesPro", A8900TermPesPro);
      }
      if ( ! (GXutil.strcmp("", AV34TermPesPro)==0) )
      {
         edtTermPesPro_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTermPesPro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTermPesPro_Enabled), 5, 0), true);
      }
      else
      {
         edtTermPesPro_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTermPesPro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTermPesPro_Enabled), 5, 0), true);
      }
      if ( ! (GXutil.strcmp("", AV34TermPesPro)==0) )
      {
         edtTermPesPro_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTermPesPro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTermPesPro_Enabled), 5, 0), true);
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
         /* Using cursor T01346 */
         pr_default.execute(4, new Object[] {A942TermCod});
         A8898TermDsc = T01346_A8898TermDsc[0] ;
         n8898TermDsc = T01346_n8898TermDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8898TermDsc", A8898TermDsc);
         A8899TermPes = T01346_A8899TermPes[0] ;
         n8899TermPes = T01346_n8899TermPes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8899TermPes", GXutil.str( A8899TermPes, 1, 0));
         A396EmprCod = T01346_A396EmprCod[0] ;
         n396EmprCod = T01346_n396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         pr_default.close(4);
         /* Using cursor T01347 */
         pr_default.execute(5, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod});
         A407EmprNom = T01347_A407EmprNom[0] ;
         n407EmprNom = T01347_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         pr_default.close(5);
         /* Using cursor T01349 */
         pr_default.execute(6, new Object[] {A942TermCod, A8900TermPesPro});
         if ( (pr_default.getStatus(6) != 101) )
         {
            A13880TermPesQty = T01349_A13880TermPesQty[0] ;
            n13880TermPesQty = T01349_n13880TermPesQty[0] ;
         }
         else
         {
            A13880TermPesQty = (short)(0) ;
            n13880TermPesQty = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13880TermPesQty", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13880TermPesQty), 4, 0));
         }
         O13880TermPesQty = A13880TermPesQty ;
         n13880TermPesQty = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13880TermPesQty", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13880TermPesQty), 4, 0));
         pr_default.close(6);
      }
   }

   public void load1341208( )
   {
      /* Using cursor T013411 */
      pr_default.execute(7, new Object[] {A942TermCod, A8900TermPesPro});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound1208 = (short)(1) ;
         A8898TermDsc = T013411_A8898TermDsc[0] ;
         n8898TermDsc = T013411_n8898TermDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8898TermDsc", A8898TermDsc);
         A407EmprNom = T013411_A407EmprNom[0] ;
         n407EmprNom = T013411_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A8899TermPes = T013411_A8899TermPes[0] ;
         n8899TermPes = T013411_n8899TermPes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8899TermPes", GXutil.str( A8899TermPes, 1, 0));
         A8901TermPesUlt = T013411_A8901TermPesUlt[0] ;
         n8901TermPesUlt = T013411_n8901TermPesUlt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8901TermPesUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8901TermPesUlt), 10, 0));
         A10177TermPesTpo = T013411_A10177TermPesTpo[0] ;
         n10177TermPesTpo = T013411_n10177TermPesTpo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10177TermPesTpo", A10177TermPesTpo);
         A396EmprCod = T013411_A396EmprCod[0] ;
         n396EmprCod = T013411_n396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A13880TermPesQty = T013411_A13880TermPesQty[0] ;
         n13880TermPesQty = T013411_n13880TermPesQty[0] ;
         zm1341208( -9) ;
      }
      pr_default.close(7);
      onLoadActions1341208( ) ;
   }

   public void onLoadActions1341208( )
   {
      O13880TermPesQty = A13880TermPesQty ;
      n13880TermPesQty = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13880TermPesQty", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13880TermPesQty), 4, 0));
   }

   public void checkExtendedTable1341208( )
   {
      nIsDirty_1208 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01346 */
      pr_default.execute(4, new Object[] {A942TermCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TERMIN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TERMCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTermCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A8898TermDsc = T01346_A8898TermDsc[0] ;
      n8898TermDsc = T01346_n8898TermDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A8898TermDsc", A8898TermDsc);
      A8899TermPes = T01346_A8899TermPes[0] ;
      n8899TermPes = T01346_n8899TermPes[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A8899TermPes", GXutil.str( A8899TermPes, 1, 0));
      A396EmprCod = T01346_A396EmprCod[0] ;
      n396EmprCod = T01346_n396EmprCod[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      pr_default.close(4);
      /* Using cursor T01347 */
      pr_default.execute(5, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01347_A407EmprNom[0] ;
      n407EmprNom = T01347_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(5);
      /* Using cursor T01349 */
      pr_default.execute(6, new Object[] {A942TermCod, A8900TermPesPro});
      if ( (pr_default.getStatus(6) != 101) )
      {
         A13880TermPesQty = T01349_A13880TermPesQty[0] ;
         n13880TermPesQty = T01349_n13880TermPesQty[0] ;
      }
      else
      {
         nIsDirty_1208 = (short)(1) ;
         A13880TermPesQty = (short)(0) ;
         n13880TermPesQty = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13880TermPesQty", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13880TermPesQty), 4, 0));
      }
      pr_default.close(6);
      if ( ! ( ( GXutil.strcmp(A10177TermPesTpo, "A") == 0 ) || ( GXutil.strcmp(A10177TermPesTpo, "C") == 0 ) || ( GXutil.strcmp(A10177TermPesTpo, "T") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Tipo de Bascula", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "TERMPESTPO");
         AnyError = (short)(1) ;
         GX_FocusControl = cmbTermPesTpo.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors1341208( )
   {
      pr_default.close(4);
      pr_default.close(5);
      pr_default.close(6);
   }

   public void enableDisable( )
   {
   }

   public void gxload_10( String A942TermCod )
   {
      /* Using cursor T013412 */
      pr_default.execute(8, new Object[] {A942TermCod});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TERMIN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TERMCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTermCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A8898TermDsc = T013412_A8898TermDsc[0] ;
      n8898TermDsc = T013412_n8898TermDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A8898TermDsc", A8898TermDsc);
      A8899TermPes = T013412_A8899TermPes[0] ;
      n8899TermPes = T013412_n8899TermPes[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A8899TermPes", GXutil.str( A8899TermPes, 1, 0));
      A396EmprCod = T013412_A396EmprCod[0] ;
      n396EmprCod = T013412_n396EmprCod[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A8898TermDsc))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A8899TermPes, (byte)(1), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(8) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(8);
   }

   public void gxload_11( String A396EmprCod )
   {
      /* Using cursor T013413 */
      pr_default.execute(9, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod});
      if ( (pr_default.getStatus(9) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T013413_A407EmprNom[0] ;
      n407EmprNom = T013413_n407EmprNom[0] ;
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

   public void gxload_12( String A942TermCod ,
                          String A8900TermPesPro )
   {
      /* Using cursor T013415 */
      pr_default.execute(10, new Object[] {A942TermCod, A8900TermPesPro});
      if ( (pr_default.getStatus(10) != 101) )
      {
         A13880TermPesQty = T013415_A13880TermPesQty[0] ;
         n13880TermPesQty = T013415_n13880TermPesQty[0] ;
      }
      else
      {
         A13880TermPesQty = (short)(0) ;
         n13880TermPesQty = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13880TermPesQty", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13880TermPesQty), 4, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A13880TermPesQty, (byte)(4), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(10) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(10);
   }

   public void getKey1341208( )
   {
      /* Using cursor T013416 */
      pr_default.execute(11, new Object[] {A942TermCod, A8900TermPesPro});
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound1208 = (short)(1) ;
      }
      else
      {
         RcdFound1208 = (short)(0) ;
      }
      pr_default.close(11);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01345 */
      pr_default.execute(3, new Object[] {A942TermCod, A8900TermPesPro});
      if ( (pr_default.getStatus(3) != 101) )
      {
         zm1341208( 9) ;
         RcdFound1208 = (short)(1) ;
         A8900TermPesPro = T01345_A8900TermPesPro[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8900TermPesPro", A8900TermPesPro);
         A8901TermPesUlt = T01345_A8901TermPesUlt[0] ;
         n8901TermPesUlt = T01345_n8901TermPesUlt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8901TermPesUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8901TermPesUlt), 10, 0));
         A10177TermPesTpo = T01345_A10177TermPesTpo[0] ;
         n10177TermPesTpo = T01345_n10177TermPesTpo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10177TermPesTpo", A10177TermPesTpo);
         A942TermCod = T01345_A942TermCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A942TermCod", A942TermCod);
         Z942TermCod = A942TermCod ;
         Z8900TermPesPro = A8900TermPesPro ;
         sMode1208 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1341208( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1208 = (short)(0) ;
            initializeNonKey1341208( ) ;
         }
         Gx_mode = sMode1208 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1208 = (short)(0) ;
         initializeNonKey1341208( ) ;
         sMode1208 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1208 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKey1341208( ) ;
      if ( RcdFound1208 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound1208 = (short)(0) ;
      /* Using cursor T013417 */
      pr_default.execute(12, new Object[] {A942TermCod, A942TermCod, A8900TermPesPro});
      if ( (pr_default.getStatus(12) != 101) )
      {
         while ( (pr_default.getStatus(12) != 101) && ( ( GXutil.strcmp(T013417_A942TermCod[0], A942TermCod) < 0 ) || ( GXutil.strcmp(T013417_A942TermCod[0], A942TermCod) == 0 ) && ( GXutil.strcmp(T013417_A8900TermPesPro[0], A8900TermPesPro) < 0 ) ) )
         {
            pr_default.readNext(12);
         }
         if ( (pr_default.getStatus(12) != 101) && ( ( GXutil.strcmp(T013417_A942TermCod[0], A942TermCod) > 0 ) || ( GXutil.strcmp(T013417_A942TermCod[0], A942TermCod) == 0 ) && ( GXutil.strcmp(T013417_A8900TermPesPro[0], A8900TermPesPro) > 0 ) ) )
         {
            A942TermCod = T013417_A942TermCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A942TermCod", A942TermCod);
            A8900TermPesPro = T013417_A8900TermPesPro[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A8900TermPesPro", A8900TermPesPro);
            RcdFound1208 = (short)(1) ;
         }
      }
      pr_default.close(12);
   }

   public void move_previous( )
   {
      RcdFound1208 = (short)(0) ;
      /* Using cursor T013418 */
      pr_default.execute(13, new Object[] {A942TermCod, A942TermCod, A8900TermPesPro});
      if ( (pr_default.getStatus(13) != 101) )
      {
         while ( (pr_default.getStatus(13) != 101) && ( ( GXutil.strcmp(T013418_A942TermCod[0], A942TermCod) > 0 ) || ( GXutil.strcmp(T013418_A942TermCod[0], A942TermCod) == 0 ) && ( GXutil.strcmp(T013418_A8900TermPesPro[0], A8900TermPesPro) > 0 ) ) )
         {
            pr_default.readNext(13);
         }
         if ( (pr_default.getStatus(13) != 101) && ( ( GXutil.strcmp(T013418_A942TermCod[0], A942TermCod) < 0 ) || ( GXutil.strcmp(T013418_A942TermCod[0], A942TermCod) == 0 ) && ( GXutil.strcmp(T013418_A8900TermPesPro[0], A8900TermPesPro) < 0 ) ) )
         {
            A942TermCod = T013418_A942TermCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A942TermCod", A942TermCod);
            A8900TermPesPro = T013418_A8900TermPesPro[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A8900TermPesPro", A8900TermPesPro);
            RcdFound1208 = (short)(1) ;
         }
      }
      pr_default.close(13);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1341208( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A13880TermPesQty = O13880TermPesQty ;
         n13880TermPesQty = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13880TermPesQty", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13880TermPesQty), 4, 0));
         GX_FocusControl = edtTermCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1341208( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1208 == 1 )
         {
            if ( ( GXutil.strcmp(A942TermCod, Z942TermCod) != 0 ) || ( GXutil.strcmp(A8900TermPesPro, Z8900TermPesPro) != 0 ) )
            {
               A942TermCod = Z942TermCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A942TermCod", A942TermCod);
               A8900TermPesPro = Z8900TermPesPro ;
               httpContext.ajax_rsp_assign_attri("", false, "A8900TermPesPro", A8900TermPesPro);
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "TERMCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTermCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               A13880TermPesQty = O13880TermPesQty ;
               n13880TermPesQty = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13880TermPesQty", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13880TermPesQty), 4, 0));
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtTermCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               A13880TermPesQty = O13880TermPesQty ;
               n13880TermPesQty = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13880TermPesQty", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13880TermPesQty), 4, 0));
               update1341208( ) ;
               GX_FocusControl = edtTermCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A942TermCod, Z942TermCod) != 0 ) || ( GXutil.strcmp(A8900TermPesPro, Z8900TermPesPro) != 0 ) )
            {
               /* Insert record */
               A13880TermPesQty = O13880TermPesQty ;
               n13880TermPesQty = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13880TermPesQty", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13880TermPesQty), 4, 0));
               GX_FocusControl = edtTermCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1341208( ) ;
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
                  A13880TermPesQty = O13880TermPesQty ;
                  n13880TermPesQty = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A13880TermPesQty", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13880TermPesQty), 4, 0));
                  GX_FocusControl = edtTermCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1341208( ) ;
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
      if ( ( GXutil.strcmp(A942TermCod, Z942TermCod) != 0 ) || ( GXutil.strcmp(A8900TermPesPro, Z8900TermPesPro) != 0 ) )
      {
         A942TermCod = Z942TermCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A942TermCod", A942TermCod);
         A8900TermPesPro = Z8900TermPesPro ;
         httpContext.ajax_rsp_assign_attri("", false, "A8900TermPesPro", A8900TermPesPro);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "TERMCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTermCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         A13880TermPesQty = O13880TermPesQty ;
         n13880TermPesQty = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13880TermPesQty", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13880TermPesQty), 4, 0));
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtTermCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency1341208( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01344 */
         pr_default.execute(2, new Object[] {A942TermCod, A8900TermPesPro});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPTERMI1"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(2) == 101) || ( Z8901TermPesUlt != T01344_A8901TermPesUlt[0] ) || ( GXutil.strcmp(Z10177TermPesTpo, T01344_A10177TermPesTpo[0]) != 0 ) )
         {
            if ( Z8901TermPesUlt != T01344_A8901TermPesUlt[0] )
            {
               GXutil.writeLogln("tterpes:[seudo value changed for attri]"+"TermPesUlt");
               GXutil.writeLogRaw("Old: ",Z8901TermPesUlt);
               GXutil.writeLogRaw("Current: ",T01344_A8901TermPesUlt[0]);
            }
            if ( GXutil.strcmp(Z10177TermPesTpo, T01344_A10177TermPesTpo[0]) != 0 )
            {
               GXutil.writeLogln("tterpes:[seudo value changed for attri]"+"TermPesTpo");
               GXutil.writeLogRaw("Old: ",Z10177TermPesTpo);
               GXutil.writeLogRaw("Current: ",T01344_A10177TermPesTpo[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPTERMI1"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1341208( )
   {
      beforeValidate1341208( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1341208( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1341208( 0) ;
         checkOptimisticConcurrency1341208( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1341208( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1341208( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T013419 */
                  pr_default.execute(14, new Object[] {A8900TermPesPro, Boolean.valueOf(n8901TermPesUlt), Long.valueOf(A8901TermPesUlt), Boolean.valueOf(n10177TermPesTpo), A10177TermPesTpo, A942TermCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTERMI1");
                  if ( (pr_default.getStatus(14) == 1) )
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
                        processLevel1341208( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1340( ) ;
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
            load1341208( ) ;
         }
         endLevel1341208( ) ;
      }
      closeExtendedTableCursors1341208( ) ;
   }

   public void update1341208( )
   {
      beforeValidate1341208( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1341208( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1341208( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1341208( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1341208( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T013420 */
                  pr_default.execute(15, new Object[] {Boolean.valueOf(n8901TermPesUlt), Long.valueOf(A8901TermPesUlt), Boolean.valueOf(n10177TermPesTpo), A10177TermPesTpo, A942TermCod, A8900TermPesPro});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTERMI1");
                  if ( (pr_default.getStatus(15) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPTERMI1"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1341208( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1341208( ) ;
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
         endLevel1341208( ) ;
      }
      closeExtendedTableCursors1341208( ) ;
   }

   public void deferredUpdate1341208( )
   {
   }

   public void delete( )
   {
      beforeValidate1341208( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1341208( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1341208( ) ;
         afterConfirm1341208( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1341208( ) ;
            if ( AnyError == 0 )
            {
               A13880TermPesQty = O13880TermPesQty ;
               n13880TermPesQty = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13880TermPesQty", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13880TermPesQty), 4, 0));
               scanStart1341209( ) ;
               while ( RcdFound1209 != 0 )
               {
                  getByPrimaryKey1341209( ) ;
                  delete1341209( ) ;
                  scanNext1341209( ) ;
                  O13880TermPesQty = A13880TermPesQty ;
                  n13880TermPesQty = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A13880TermPesQty", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13880TermPesQty), 4, 0));
               }
               scanEnd1341209( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T013421 */
                  pr_default.execute(16, new Object[] {A942TermCod, A8900TermPesPro});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTERMI1");
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
      sMode1208 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1341208( ) ;
      Gx_mode = sMode1208 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1341208( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T013422 */
         pr_default.execute(17, new Object[] {A942TermCod});
         A8898TermDsc = T013422_A8898TermDsc[0] ;
         n8898TermDsc = T013422_n8898TermDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8898TermDsc", A8898TermDsc);
         A8899TermPes = T013422_A8899TermPes[0] ;
         n8899TermPes = T013422_n8899TermPes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8899TermPes", GXutil.str( A8899TermPes, 1, 0));
         A396EmprCod = T013422_A396EmprCod[0] ;
         n396EmprCod = T013422_n396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         pr_default.close(17);
         /* Using cursor T013423 */
         pr_default.execute(18, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod});
         A407EmprNom = T013423_A407EmprNom[0] ;
         n407EmprNom = T013423_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         pr_default.close(18);
         /* Using cursor T013425 */
         pr_default.execute(19, new Object[] {A942TermCod, A8900TermPesPro});
         if ( (pr_default.getStatus(19) != 101) )
         {
            A13880TermPesQty = T013425_A13880TermPesQty[0] ;
            n13880TermPesQty = T013425_n13880TermPesQty[0] ;
         }
         else
         {
            A13880TermPesQty = (short)(0) ;
            n13880TermPesQty = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13880TermPesQty", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13880TermPesQty), 4, 0));
         }
         pr_default.close(19);
      }
   }

   public void processNestedLevel1341209( )
   {
      s13880TermPesQty = O13880TermPesQty ;
      n13880TermPesQty = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13880TermPesQty", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13880TermPesQty), 4, 0));
      nGXsfl_59_idx = 0 ;
      while ( nGXsfl_59_idx < nRC_GXsfl_59 )
      {
         readRow1341209( ) ;
         if ( ( nRcdExists_1209 != 0 ) || ( nIsMod_1209 != 0 ) )
         {
            standaloneNotModal1341209( ) ;
            getKey1341209( ) ;
            if ( ( nRcdExists_1209 == 0 ) && ( nRcdDeleted_1209 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1341209( ) ;
            }
            else
            {
               if ( RcdFound1209 != 0 )
               {
                  if ( ( nRcdDeleted_1209 != 0 ) && ( nRcdExists_1209 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1341209( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1209 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1341209( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1209 == 0 )
                  {
                     GXCCtl = "TERMPESRNG_" + sGXsfl_59_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtTermPesRng_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O13880TermPesQty = A13880TermPesQty ;
            n13880TermPesQty = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13880TermPesQty", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13880TermPesQty), 4, 0));
         }
         httpContext.changePostValue( edtTermPesRng_Internalname, GXutil.ltrim( localUtil.ntoc( A8902TermPesRng, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtTermPesMin_Internalname, GXutil.ltrim( localUtil.ntoc( A8903TermPesMin, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtTermPesMax_Internalname, GXutil.ltrim( localUtil.ntoc( A8904TermPesMax, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( cmbTermPesOpe.getInternalname(), GXutil.rtrim( A8905TermPesOpe)) ;
         httpContext.changePostValue( edtTermPesTol_Internalname, GXutil.ltrim( localUtil.ntoc( A8906TermPesTol, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( cmbTermPesOpP.getInternalname(), GXutil.rtrim( A12701TermPesOpP)) ;
         httpContext.changePostValue( "ZT_"+"Z8902TermPesRng_"+sGXsfl_59_idx, GXutil.ltrim( localUtil.ntoc( Z8902TermPesRng, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8903TermPesMin_"+sGXsfl_59_idx, GXutil.ltrim( localUtil.ntoc( Z8903TermPesMin, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8904TermPesMax_"+sGXsfl_59_idx, GXutil.ltrim( localUtil.ntoc( Z8904TermPesMax, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8905TermPesOpe_"+sGXsfl_59_idx, GXutil.rtrim( Z8905TermPesOpe)) ;
         httpContext.changePostValue( "ZT_"+"Z8906TermPesTol_"+sGXsfl_59_idx, GXutil.ltrim( localUtil.ntoc( Z8906TermPesTol, (byte)(10), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12701TermPesOpP_"+sGXsfl_59_idx, GXutil.rtrim( Z12701TermPesOpP)) ;
         httpContext.changePostValue( "nRcdDeleted_1209_"+sGXsfl_59_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1209, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1209_"+sGXsfl_59_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1209, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1209_"+sGXsfl_59_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1209, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1209 != 0 )
         {
            httpContext.changePostValue( "TERMPESRNG_"+sGXsfl_59_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTermPesRng_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TERMPESMIN_"+sGXsfl_59_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTermPesMin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TERMPESMAX_"+sGXsfl_59_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTermPesMax_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TERMPESOPE_"+sGXsfl_59_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbTermPesOpe.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TERMPESTOL_"+sGXsfl_59_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTermPesTol_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TERMPESOPP_"+sGXsfl_59_idx+"Visible", GXutil.ltrim( localUtil.ntoc( cmbTermPesOpP.getVisible(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TERMPESOPP_"+sGXsfl_59_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbTermPesOpP.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1341209( ) ;
      if ( AnyError != 0 )
      {
         O13880TermPesQty = s13880TermPesQty ;
         n13880TermPesQty = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13880TermPesQty", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13880TermPesQty), 4, 0));
      }
      nRcdExists_1209 = (short)(0) ;
      nIsMod_1209 = (short)(0) ;
      nRcdDeleted_1209 = (short)(0) ;
   }

   public void processLevel1341208( )
   {
      /* Save parent mode. */
      sMode1208 = Gx_mode ;
      processNestedLevel1341209( ) ;
      if ( AnyError != 0 )
      {
         O13880TermPesQty = s13880TermPesQty ;
         n13880TermPesQty = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13880TermPesQty", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13880TermPesQty), 4, 0));
      }
      /* Restore parent mode. */
      Gx_mode = sMode1208 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1341208( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(2);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1341208( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tterpes");
         if ( AnyError == 0 )
         {
            confirmValues1340( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tterpes");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1341208( )
   {
      /* Scan By routine */
      /* Using cursor T013426 */
      pr_default.execute(20);
      RcdFound1208 = (short)(0) ;
      if ( (pr_default.getStatus(20) != 101) )
      {
         RcdFound1208 = (short)(1) ;
         A942TermCod = T013426_A942TermCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A942TermCod", A942TermCod);
         A8900TermPesPro = T013426_A8900TermPesPro[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8900TermPesPro", A8900TermPesPro);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1341208( )
   {
      /* Scan next routine */
      pr_default.readNext(20);
      RcdFound1208 = (short)(0) ;
      if ( (pr_default.getStatus(20) != 101) )
      {
         RcdFound1208 = (short)(1) ;
         A942TermCod = T013426_A942TermCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A942TermCod", A942TermCod);
         A8900TermPesPro = T013426_A8900TermPesPro[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8900TermPesPro", A8900TermPesPro);
      }
   }

   public void scanEnd1341208( )
   {
      pr_default.close(20);
   }

   public void afterConfirm1341208( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1341208( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1341208( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1341208( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1341208( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1341208( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1341208( )
   {
      edtTermCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTermCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTermCod_Enabled), 5, 0), true);
      edtTermDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTermDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTermDsc_Enabled), 5, 0), true);
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      chkTermPes.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkTermPes.getInternalname(), "Enabled", GXutil.ltrimstr( chkTermPes.getEnabled(), 5, 0), true);
      edtTermPesPro_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTermPesPro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTermPesPro_Enabled), 5, 0), true);
      edtTermPesUlt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTermPesUlt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTermPesUlt_Enabled), 5, 0), true);
      cmbTermPesTpo.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbTermPesTpo.getInternalname(), "Enabled", GXutil.ltrimstr( cmbTermPesTpo.getEnabled(), 5, 0), true);
   }

   public void zm1341209( int GX_JID )
   {
      if ( ( GX_JID == 13 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z8903TermPesMin = T01343_A8903TermPesMin[0] ;
            Z8904TermPesMax = T01343_A8904TermPesMax[0] ;
            Z8905TermPesOpe = T01343_A8905TermPesOpe[0] ;
            Z8906TermPesTol = T01343_A8906TermPesTol[0] ;
            Z12701TermPesOpP = T01343_A12701TermPesOpP[0] ;
         }
         else
         {
            Z8903TermPesMin = A8903TermPesMin ;
            Z8904TermPesMax = A8904TermPesMax ;
            Z8905TermPesOpe = A8905TermPesOpe ;
            Z8906TermPesTol = A8906TermPesTol ;
            Z12701TermPesOpP = A12701TermPesOpP ;
         }
      }
      if ( GX_JID == -13 )
      {
         Z942TermCod = A942TermCod ;
         Z8900TermPesPro = A8900TermPesPro ;
         Z8902TermPesRng = A8902TermPesRng ;
         Z8903TermPesMin = A8903TermPesMin ;
         Z8904TermPesMax = A8904TermPesMax ;
         Z8905TermPesOpe = A8905TermPesOpe ;
         Z8906TermPesTol = A8906TermPesTol ;
         Z12701TermPesOpP = A12701TermPesOpP ;
      }
   }

   public void standaloneNotModal1341209( )
   {
   }

   public void standaloneModal1341209( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtTermPesRng_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTermPesRng_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTermPesRng_Enabled), 5, 0), !bGXsfl_59_Refreshing);
      }
      else
      {
         edtTermPesRng_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTermPesRng_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTermPesRng_Enabled), 5, 0), !bGXsfl_59_Refreshing);
      }
   }

   public void load1341209( )
   {
      /* Using cursor T013427 */
      pr_default.execute(21, new Object[] {A942TermCod, A8900TermPesPro, Long.valueOf(A8902TermPesRng)});
      if ( (pr_default.getStatus(21) != 101) )
      {
         RcdFound1209 = (short)(1) ;
         A8903TermPesMin = T013427_A8903TermPesMin[0] ;
         A8904TermPesMax = T013427_A8904TermPesMax[0] ;
         A8905TermPesOpe = T013427_A8905TermPesOpe[0] ;
         A8906TermPesTol = T013427_A8906TermPesTol[0] ;
         A12701TermPesOpP = T013427_A12701TermPesOpP[0] ;
         zm1341209( -13) ;
      }
      pr_default.close(21);
      onLoadActions1341209( ) ;
   }

   public void onLoadActions1341209( )
   {
      if ( isIns( )  )
      {
         A13880TermPesQty = (short)(O13880TermPesQty+1) ;
         n13880TermPesQty = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13880TermPesQty", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13880TermPesQty), 4, 0));
      }
      else
      {
         if ( isUpd( )  )
         {
            A13880TermPesQty = O13880TermPesQty ;
            n13880TermPesQty = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13880TermPesQty", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13880TermPesQty), 4, 0));
         }
         else
         {
            if ( isDlt( )  )
            {
               A13880TermPesQty = (short)(O13880TermPesQty-1) ;
               n13880TermPesQty = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13880TermPesQty", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13880TermPesQty), 4, 0));
            }
         }
      }
   }

   public void checkExtendedTable1341209( )
   {
      nIsDirty_1209 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1341209( ) ;
      if ( isIns( )  )
      {
         nIsDirty_1209 = (short)(1) ;
         A13880TermPesQty = (short)(O13880TermPesQty+1) ;
         n13880TermPesQty = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13880TermPesQty", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13880TermPesQty), 4, 0));
      }
      else
      {
         if ( isUpd( )  )
         {
            nIsDirty_1209 = (short)(1) ;
            A13880TermPesQty = O13880TermPesQty ;
            n13880TermPesQty = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13880TermPesQty", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13880TermPesQty), 4, 0));
         }
         else
         {
            if ( isDlt( )  )
            {
               nIsDirty_1209 = (short)(1) ;
               A13880TermPesQty = (short)(O13880TermPesQty-1) ;
               n13880TermPesQty = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13880TermPesQty", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13880TermPesQty), 4, 0));
            }
         }
      }
   }

   public void closeExtendedTableCursors1341209( )
   {
   }

   public void enableDisable1341209( )
   {
   }

   public void getKey1341209( )
   {
      /* Using cursor T013428 */
      pr_default.execute(22, new Object[] {A942TermCod, A8900TermPesPro, Long.valueOf(A8902TermPesRng)});
      if ( (pr_default.getStatus(22) != 101) )
      {
         RcdFound1209 = (short)(1) ;
      }
      else
      {
         RcdFound1209 = (short)(0) ;
      }
      pr_default.close(22);
   }

   public void getByPrimaryKey1341209( )
   {
      /* Using cursor T01343 */
      pr_default.execute(1, new Object[] {A942TermCod, A8900TermPesPro, Long.valueOf(A8902TermPesRng)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1341209( 13) ;
         RcdFound1209 = (short)(1) ;
         initializeNonKey1341209( ) ;
         A8902TermPesRng = T01343_A8902TermPesRng[0] ;
         A8903TermPesMin = T01343_A8903TermPesMin[0] ;
         A8904TermPesMax = T01343_A8904TermPesMax[0] ;
         A8905TermPesOpe = T01343_A8905TermPesOpe[0] ;
         A8906TermPesTol = T01343_A8906TermPesTol[0] ;
         A12701TermPesOpP = T01343_A12701TermPesOpP[0] ;
         Z942TermCod = A942TermCod ;
         Z8900TermPesPro = A8900TermPesPro ;
         Z8902TermPesRng = A8902TermPesRng ;
         sMode1209 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1341209( ) ;
         Gx_mode = sMode1209 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1209 = (short)(0) ;
         initializeNonKey1341209( ) ;
         sMode1209 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1341209( ) ;
         Gx_mode = sMode1209 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1341209( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1341209( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01342 */
         pr_default.execute(0, new Object[] {A942TermCod, A8900TermPesPro, Long.valueOf(A8902TermPesRng)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPTERMI2"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z8903TermPesMin, T01342_A8903TermPesMin[0]) != 0 ) || ( DecimalUtil.compareTo(Z8904TermPesMax, T01342_A8904TermPesMax[0]) != 0 ) || ( GXutil.strcmp(Z8905TermPesOpe, T01342_A8905TermPesOpe[0]) != 0 ) || ( DecimalUtil.compareTo(Z8906TermPesTol, T01342_A8906TermPesTol[0]) != 0 ) || ( GXutil.strcmp(Z12701TermPesOpP, T01342_A12701TermPesOpP[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z8903TermPesMin, T01342_A8903TermPesMin[0]) != 0 )
            {
               GXutil.writeLogln("tterpes:[seudo value changed for attri]"+"TermPesMin");
               GXutil.writeLogRaw("Old: ",Z8903TermPesMin);
               GXutil.writeLogRaw("Current: ",T01342_A8903TermPesMin[0]);
            }
            if ( DecimalUtil.compareTo(Z8904TermPesMax, T01342_A8904TermPesMax[0]) != 0 )
            {
               GXutil.writeLogln("tterpes:[seudo value changed for attri]"+"TermPesMax");
               GXutil.writeLogRaw("Old: ",Z8904TermPesMax);
               GXutil.writeLogRaw("Current: ",T01342_A8904TermPesMax[0]);
            }
            if ( GXutil.strcmp(Z8905TermPesOpe, T01342_A8905TermPesOpe[0]) != 0 )
            {
               GXutil.writeLogln("tterpes:[seudo value changed for attri]"+"TermPesOpe");
               GXutil.writeLogRaw("Old: ",Z8905TermPesOpe);
               GXutil.writeLogRaw("Current: ",T01342_A8905TermPesOpe[0]);
            }
            if ( DecimalUtil.compareTo(Z8906TermPesTol, T01342_A8906TermPesTol[0]) != 0 )
            {
               GXutil.writeLogln("tterpes:[seudo value changed for attri]"+"TermPesTol");
               GXutil.writeLogRaw("Old: ",Z8906TermPesTol);
               GXutil.writeLogRaw("Current: ",T01342_A8906TermPesTol[0]);
            }
            if ( GXutil.strcmp(Z12701TermPesOpP, T01342_A12701TermPesOpP[0]) != 0 )
            {
               GXutil.writeLogln("tterpes:[seudo value changed for attri]"+"TermPesOpP");
               GXutil.writeLogRaw("Old: ",Z12701TermPesOpP);
               GXutil.writeLogRaw("Current: ",T01342_A12701TermPesOpP[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPTERMI2"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1341209( )
   {
      beforeValidate1341209( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1341209( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1341209( 0) ;
         checkOptimisticConcurrency1341209( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1341209( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1341209( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T013429 */
                  pr_default.execute(23, new Object[] {A942TermCod, A8900TermPesPro, Long.valueOf(A8902TermPesRng), A8903TermPesMin, A8904TermPesMax, A8905TermPesOpe, A8906TermPesTol, A12701TermPesOpP});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTERMI2");
                  if ( (pr_default.getStatus(23) == 1) )
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
            load1341209( ) ;
         }
         endLevel1341209( ) ;
      }
      closeExtendedTableCursors1341209( ) ;
   }

   public void update1341209( )
   {
      beforeValidate1341209( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1341209( ) ;
      }
      if ( ( nIsMod_1209 != 0 ) || ( nIsDirty_1209 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1341209( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1341209( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1341209( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T013430 */
                     pr_default.execute(24, new Object[] {A8903TermPesMin, A8904TermPesMax, A8905TermPesOpe, A8906TermPesTol, A12701TermPesOpP, A942TermCod, A8900TermPesPro, Long.valueOf(A8902TermPesRng)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTERMI2");
                     if ( (pr_default.getStatus(24) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPTERMI2"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1341209( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1341209( ) ;
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
            endLevel1341209( ) ;
         }
      }
      closeExtendedTableCursors1341209( ) ;
   }

   public void deferredUpdate1341209( )
   {
   }

   public void delete1341209( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1341209( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1341209( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1341209( ) ;
         afterConfirm1341209( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1341209( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T013431 */
               pr_default.execute(25, new Object[] {A942TermCod, A8900TermPesPro, Long.valueOf(A8902TermPesRng)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTERMI2");
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
      sMode1209 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1341209( ) ;
      Gx_mode = sMode1209 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1341209( )
   {
      standaloneModal1341209( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         if ( isIns( )  )
         {
            A13880TermPesQty = (short)(O13880TermPesQty+1) ;
            n13880TermPesQty = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13880TermPesQty", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13880TermPesQty), 4, 0));
         }
         else
         {
            if ( isUpd( )  )
            {
               A13880TermPesQty = O13880TermPesQty ;
               n13880TermPesQty = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13880TermPesQty", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13880TermPesQty), 4, 0));
            }
            else
            {
               if ( isDlt( )  )
               {
                  A13880TermPesQty = (short)(O13880TermPesQty-1) ;
                  n13880TermPesQty = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A13880TermPesQty", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13880TermPesQty), 4, 0));
               }
            }
         }
      }
   }

   public void endLevel1341209( )
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

   public void scanStart1341209( )
   {
      /* Scan By routine */
      /* Using cursor T013432 */
      pr_default.execute(26, new Object[] {A942TermCod, A8900TermPesPro});
      RcdFound1209 = (short)(0) ;
      if ( (pr_default.getStatus(26) != 101) )
      {
         RcdFound1209 = (short)(1) ;
         A8902TermPesRng = T013432_A8902TermPesRng[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1341209( )
   {
      /* Scan next routine */
      pr_default.readNext(26);
      RcdFound1209 = (short)(0) ;
      if ( (pr_default.getStatus(26) != 101) )
      {
         RcdFound1209 = (short)(1) ;
         A8902TermPesRng = T013432_A8902TermPesRng[0] ;
      }
   }

   public void scanEnd1341209( )
   {
      pr_default.close(26);
   }

   public void afterConfirm1341209( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1341209( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1341209( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1341209( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1341209( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1341209( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1341209( )
   {
      edtTermPesRng_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTermPesRng_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTermPesRng_Enabled), 5, 0), !bGXsfl_59_Refreshing);
      edtTermPesMin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTermPesMin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTermPesMin_Enabled), 5, 0), !bGXsfl_59_Refreshing);
      edtTermPesMax_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTermPesMax_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTermPesMax_Enabled), 5, 0), !bGXsfl_59_Refreshing);
      cmbTermPesOpe.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbTermPesOpe.getInternalname(), "Enabled", GXutil.ltrimstr( cmbTermPesOpe.getEnabled(), 5, 0), !bGXsfl_59_Refreshing);
      edtTermPesTol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTermPesTol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTermPesTol_Enabled), 5, 0), !bGXsfl_59_Refreshing);
      cmbTermPesOpP.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbTermPesOpP.getInternalname(), "Enabled", GXutil.ltrimstr( cmbTermPesOpP.getEnabled(), 5, 0), !bGXsfl_59_Refreshing);
   }

   public void send_integrity_lvl_hashes1341209( )
   {
   }

   public void send_integrity_lvl_hashes1341208( )
   {
   }

   public void subsflControlProps_591209( )
   {
      edtTermPesRng_Internalname = "TERMPESRNG_"+sGXsfl_59_idx ;
      edtTermPesMin_Internalname = "TERMPESMIN_"+sGXsfl_59_idx ;
      edtTermPesMax_Internalname = "TERMPESMAX_"+sGXsfl_59_idx ;
      cmbTermPesOpe.setInternalname( "TERMPESOPE_"+sGXsfl_59_idx );
      edtTermPesTol_Internalname = "TERMPESTOL_"+sGXsfl_59_idx ;
      cmbTermPesOpP.setInternalname( "TERMPESOPP_"+sGXsfl_59_idx );
   }

   public void subsflControlProps_fel_591209( )
   {
      edtTermPesRng_Internalname = "TERMPESRNG_"+sGXsfl_59_fel_idx ;
      edtTermPesMin_Internalname = "TERMPESMIN_"+sGXsfl_59_fel_idx ;
      edtTermPesMax_Internalname = "TERMPESMAX_"+sGXsfl_59_fel_idx ;
      cmbTermPesOpe.setInternalname( "TERMPESOPE_"+sGXsfl_59_fel_idx );
      edtTermPesTol_Internalname = "TERMPESTOL_"+sGXsfl_59_fel_idx ;
      cmbTermPesOpP.setInternalname( "TERMPESOPP_"+sGXsfl_59_fel_idx );
   }

   public void addRow1341209( )
   {
      nGXsfl_59_idx = (int)(nGXsfl_59_idx+1) ;
      sGXsfl_59_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_59_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_591209( ) ;
      sendRow1341209( ) ;
   }

   public void sendRow1341209( )
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
         if ( ((int)((nGXsfl_59_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1209_" + sGXsfl_59_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 60,'',false,'" + sGXsfl_59_idx + "',59)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTermPesRng_Internalname,GXutil.ltrim( localUtil.ntoc( A8902TermPesRng, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A8902TermPesRng), "ZZZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,60);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTermPesRng_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtTermPesRng_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(59),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1209_" + sGXsfl_59_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 61,'',false,'" + sGXsfl_59_idx + "',59)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTermPesMin_Internalname,GXutil.ltrim( localUtil.ntoc( A8903TermPesMin, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtTermPesMin_Enabled!=0) ? localUtil.format( A8903TermPesMin, "ZZZ,ZZ9.99999") : localUtil.format( A8903TermPesMin, "ZZZ,ZZ9.99999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,61);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTermPesMin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtTermPesMin_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(59),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1209_" + sGXsfl_59_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 62,'',false,'" + sGXsfl_59_idx + "',59)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTermPesMax_Internalname,GXutil.ltrim( localUtil.ntoc( A8904TermPesMax, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtTermPesMax_Enabled!=0) ? localUtil.format( A8904TermPesMax, "ZZZ,ZZ9.99999") : localUtil.format( A8904TermPesMax, "ZZZ,ZZ9.99999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,62);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTermPesMax_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtTermPesMax_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(59),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1209_" + sGXsfl_59_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 63,'',false,'" + sGXsfl_59_idx + "',59)\"" ;
      if ( ( cmbTermPesOpe.getItemCount() == 0 ) && isAjaxCallMode( ) )
      {
         GXCCtl = "TERMPESOPE_" + sGXsfl_59_idx ;
         cmbTermPesOpe.setName( GXCCtl );
         cmbTermPesOpe.setWebtags( "" );
         cmbTermPesOpe.addItem("+", "+/-", (short)(0));
         cmbTermPesOpe.addItem("%", "%", (short)(0));
         if ( cmbTermPesOpe.getItemCount() > 0 )
         {
            A8905TermPesOpe = cmbTermPesOpe.getValidValue(A8905TermPesOpe) ;
         }
      }
      /* ComboBox */
      Gridlevel_level1Row.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbTermPesOpe,cmbTermPesOpe.getInternalname(),GXutil.rtrim( A8905TermPesOpe),Integer.valueOf(1),cmbTermPesOpe.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",Integer.valueOf(-1),Integer.valueOf(cmbTermPesOpe.getEnabled()),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","TrnColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,63);\"","",Boolean.valueOf(true),Integer.valueOf(0)});
      cmbTermPesOpe.setValue( GXutil.rtrim( A8905TermPesOpe) );
      httpContext.ajax_rsp_assign_prop("", false, cmbTermPesOpe.getInternalname(), "Values", cmbTermPesOpe.ToJavascriptSource(), !bGXsfl_59_Refreshing);
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1209_" + sGXsfl_59_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 64,'',false,'" + sGXsfl_59_idx + "',59)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTermPesTol_Internalname,GXutil.ltrim( localUtil.ntoc( A8906TermPesTol, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtTermPesTol_Enabled!=0) ? localUtil.format( A8906TermPesTol, "Z,ZZ9.99999") : localUtil.format( A8906TermPesTol, "Z,ZZ9.99999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,64);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTermPesTol_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtTermPesTol_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(59),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1209_" + sGXsfl_59_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 65,'',false,'" + sGXsfl_59_idx + "',59)\"" ;
      if ( ( cmbTermPesOpP.getItemCount() == 0 ) && isAjaxCallMode( ) )
      {
         GXCCtl = "TERMPESOPP_" + sGXsfl_59_idx ;
         cmbTermPesOpP.setName( GXCCtl );
         cmbTermPesOpP.setWebtags( "" );
         cmbTermPesOpP.addItem("", "*", (short)(0));
         cmbTermPesOpP.addItem("-", "-", (short)(0));
         if ( cmbTermPesOpP.getItemCount() > 0 )
         {
            A12701TermPesOpP = cmbTermPesOpP.getValidValue(A12701TermPesOpP) ;
         }
      }
      /* ComboBox */
      Gridlevel_level1Row.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbTermPesOpP,cmbTermPesOpP.getInternalname(),GXutil.rtrim( A12701TermPesOpP),Integer.valueOf(1),cmbTermPesOpP.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",Integer.valueOf(cmbTermPesOpP.getVisible()),Integer.valueOf(cmbTermPesOpP.getEnabled()),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","TrnColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,65);\"","",Boolean.valueOf(true),Integer.valueOf(0)});
      cmbTermPesOpP.setValue( GXutil.rtrim( A12701TermPesOpP) );
      httpContext.ajax_rsp_assign_prop("", false, cmbTermPesOpP.getInternalname(), "Values", cmbTermPesOpP.ToJavascriptSource(), !bGXsfl_59_Refreshing);
      httpContext.ajax_sending_grid_row(Gridlevel_level1Row);
      send_integrity_lvl_hashes1341209( ) ;
      GXCCtl = "Z8902TermPesRng_" + sGXsfl_59_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z8902TermPesRng, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z8903TermPesMin_" + sGXsfl_59_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z8903TermPesMin, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z8904TermPesMax_" + sGXsfl_59_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z8904TermPesMax, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z8905TermPesOpe_" + sGXsfl_59_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z8905TermPesOpe));
      GXCCtl = "Z8906TermPesTol_" + sGXsfl_59_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z8906TermPesTol, (byte)(10), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z12701TermPesOpP_" + sGXsfl_59_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z12701TermPesOpP));
      GXCCtl = "nRcdDeleted_1209_" + sGXsfl_59_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1209, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1209_" + sGXsfl_59_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1209, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1209_" + sGXsfl_59_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1209, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vMODE_" + sGXsfl_59_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Gx_mode));
      GXCCtl = "vTRNCONTEXT_" + sGXsfl_59_idx ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, GXCCtl, AV36TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(GXCCtl, AV36TrnContext);
      }
      GXCCtl = "vTERMCOD_" + sGXsfl_59_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV33TermCod));
      GXCCtl = "vTERMPESPRO_" + sGXsfl_59_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV34TermPesPro));
      app.GxWebStd.gx_hidden_field( httpContext, "TERMPESRNG_"+sGXsfl_59_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTermPesRng_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "TERMPESMIN_"+sGXsfl_59_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTermPesMin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "TERMPESMAX_"+sGXsfl_59_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTermPesMax_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "TERMPESOPE_"+sGXsfl_59_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbTermPesOpe.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "TERMPESTOL_"+sGXsfl_59_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTermPesTol_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "TERMPESOPP_"+sGXsfl_59_idx+"Visible", GXutil.ltrim( localUtil.ntoc( cmbTermPesOpP.getVisible(), (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "TERMPESOPP_"+sGXsfl_59_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbTermPesOpP.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Gridlevel_level1Container.AddRow(Gridlevel_level1Row);
   }

   public void readRow1341209( )
   {
      nGXsfl_59_idx = (int)(nGXsfl_59_idx+1) ;
      sGXsfl_59_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_59_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_591209( ) ;
      edtTermPesRng_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TERMPESRNG_"+sGXsfl_59_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtTermPesMin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TERMPESMIN_"+sGXsfl_59_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtTermPesMax_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TERMPESMAX_"+sGXsfl_59_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      cmbTermPesOpe.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "TERMPESOPE_"+sGXsfl_59_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
      edtTermPesTol_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TERMPESTOL_"+sGXsfl_59_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      cmbTermPesOpP.setVisible( (int)(localUtil.ctol( httpContext.cgiGet( "TERMPESOPP_"+sGXsfl_59_idx+"Visible"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
      cmbTermPesOpP.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "TERMPESOPP_"+sGXsfl_59_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTermPesRng_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTermPesRng_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999999999L ) ) )
      {
         GXCCtl = "TERMPESRNG_" + sGXsfl_59_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtTermPesRng_Internalname ;
         wbErr = true ;
         A8902TermPesRng = 0 ;
      }
      else
      {
         A8902TermPesRng = localUtil.ctol( httpContext.cgiGet( edtTermPesRng_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtTermPesMin_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtTermPesMin_Internalname)), DecimalUtil.stringToDec("999999.99999")) > 0 ) ) )
      {
         GXCCtl = "TERMPESMIN_" + sGXsfl_59_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtTermPesMin_Internalname ;
         wbErr = true ;
         A8903TermPesMin = DecimalUtil.ZERO ;
      }
      else
      {
         A8903TermPesMin = localUtil.ctond( httpContext.cgiGet( edtTermPesMin_Internalname)) ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtTermPesMax_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtTermPesMax_Internalname)), DecimalUtil.stringToDec("999999.99999")) > 0 ) ) )
      {
         GXCCtl = "TERMPESMAX_" + sGXsfl_59_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtTermPesMax_Internalname ;
         wbErr = true ;
         A8904TermPesMax = DecimalUtil.ZERO ;
      }
      else
      {
         A8904TermPesMax = localUtil.ctond( httpContext.cgiGet( edtTermPesMax_Internalname)) ;
      }
      cmbTermPesOpe.setName( cmbTermPesOpe.getInternalname() );
      cmbTermPesOpe.setValue( httpContext.cgiGet( cmbTermPesOpe.getInternalname()) );
      A8905TermPesOpe = httpContext.cgiGet( cmbTermPesOpe.getInternalname()) ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtTermPesTol_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtTermPesTol_Internalname)), DecimalUtil.stringToDec("9999.99999")) > 0 ) ) )
      {
         GXCCtl = "TERMPESTOL_" + sGXsfl_59_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtTermPesTol_Internalname ;
         wbErr = true ;
         A8906TermPesTol = DecimalUtil.ZERO ;
      }
      else
      {
         A8906TermPesTol = localUtil.ctond( httpContext.cgiGet( edtTermPesTol_Internalname)) ;
      }
      cmbTermPesOpP.setName( cmbTermPesOpP.getInternalname() );
      cmbTermPesOpP.setValue( httpContext.cgiGet( cmbTermPesOpP.getInternalname()) );
      A12701TermPesOpP = httpContext.cgiGet( cmbTermPesOpP.getInternalname()) ;
      GXCCtl = "Z8902TermPesRng_" + sGXsfl_59_idx ;
      Z8902TermPesRng = localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
      GXCCtl = "Z8903TermPesMin_" + sGXsfl_59_idx ;
      Z8903TermPesMin = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z8904TermPesMax_" + sGXsfl_59_idx ;
      Z8904TermPesMax = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z8905TermPesOpe_" + sGXsfl_59_idx ;
      Z8905TermPesOpe = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z8906TermPesTol_" + sGXsfl_59_idx ;
      Z8906TermPesTol = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z12701TermPesOpP_" + sGXsfl_59_idx ;
      Z12701TermPesOpP = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "nRcdDeleted_1209_" + sGXsfl_59_idx ;
      nRcdDeleted_1209 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1209_" + sGXsfl_59_idx ;
      nRcdExists_1209 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1209_" + sGXsfl_59_idx ;
      nIsMod_1209 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtTermPesRng_Enabled = edtTermPesRng_Enabled ;
   }

   public void confirmValues1340( )
   {
      nGXsfl_59_idx = 0 ;
      sGXsfl_59_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_59_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_591209( ) ;
      while ( nGXsfl_59_idx < nRC_GXsfl_59 )
      {
         nGXsfl_59_idx = (int)(nGXsfl_59_idx+1) ;
         sGXsfl_59_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_59_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_591209( ) ;
         httpContext.changePostValue( "Z8902TermPesRng_"+sGXsfl_59_idx, httpContext.cgiGet( "ZT_"+"Z8902TermPesRng_"+sGXsfl_59_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8902TermPesRng_"+sGXsfl_59_idx) ;
         httpContext.changePostValue( "Z8903TermPesMin_"+sGXsfl_59_idx, httpContext.cgiGet( "ZT_"+"Z8903TermPesMin_"+sGXsfl_59_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8903TermPesMin_"+sGXsfl_59_idx) ;
         httpContext.changePostValue( "Z8904TermPesMax_"+sGXsfl_59_idx, httpContext.cgiGet( "ZT_"+"Z8904TermPesMax_"+sGXsfl_59_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8904TermPesMax_"+sGXsfl_59_idx) ;
         httpContext.changePostValue( "Z8905TermPesOpe_"+sGXsfl_59_idx, httpContext.cgiGet( "ZT_"+"Z8905TermPesOpe_"+sGXsfl_59_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8905TermPesOpe_"+sGXsfl_59_idx) ;
         httpContext.changePostValue( "Z8906TermPesTol_"+sGXsfl_59_idx, httpContext.cgiGet( "ZT_"+"Z8906TermPesTol_"+sGXsfl_59_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8906TermPesTol_"+sGXsfl_59_idx) ;
         httpContext.changePostValue( "Z12701TermPesOpP_"+sGXsfl_59_idx, httpContext.cgiGet( "ZT_"+"Z12701TermPesOpP_"+sGXsfl_59_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12701TermPesOpP_"+sGXsfl_59_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.tterpes", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV33TermCod)),GXutil.URLEncode(GXutil.rtrim(AV34TermPesPro))}, new String[] {"Gx_mode","TermCod","TermPesPro"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"TTERPES");
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("tterpes:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z942TermCod", GXutil.rtrim( Z942TermCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8900TermPesPro", GXutil.rtrim( Z8900TermPesPro));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8901TermPesUlt", GXutil.ltrim( localUtil.ntoc( Z8901TermPesUlt, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10177TermPesTpo", GXutil.rtrim( Z10177TermPesTpo));
      app.GxWebStd.gx_hidden_field( httpContext, "O13880TermPesQty", GXutil.ltrim( localUtil.ntoc( O13880TermPesQty, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_59", GXutil.ltrim( localUtil.ntoc( nGXsfl_59_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, "vTERMCOD", GXutil.rtrim( AV33TermCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTERMCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV33TermCod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vTERMPESPRO", GXutil.rtrim( AV34TermPesPro));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTERMPESPRO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV34TermPesPro, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "TERMPESQTY", GXutil.ltrim( localUtil.ntoc( A13880TermPesQty, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.tterpes", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV33TermCod)),GXutil.URLEncode(GXutil.rtrim(AV34TermPesPro))}, new String[] {"Gx_mode","TermCod","TermPesPro"})  ;
   }

   public String getPgmname( )
   {
      return "TTERPES" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "TERMINALES DE PESAJE", "") ;
   }

   public void initializeNonKey1341208( )
   {
      A8898TermDsc = "" ;
      n8898TermDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8898TermDsc", A8898TermDsc);
      A396EmprCod = "" ;
      n396EmprCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A407EmprNom = "" ;
      n407EmprNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      A8899TermPes = (byte)(0) ;
      n8899TermPes = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8899TermPes", GXutil.str( A8899TermPes, 1, 0));
      A8901TermPesUlt = 0 ;
      n8901TermPesUlt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8901TermPesUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8901TermPesUlt), 10, 0));
      A10177TermPesTpo = "" ;
      n10177TermPesTpo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10177TermPesTpo", A10177TermPesTpo);
      A13880TermPesQty = (short)(0) ;
      n13880TermPesQty = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13880TermPesQty", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13880TermPesQty), 4, 0));
      O13880TermPesQty = A13880TermPesQty ;
      n13880TermPesQty = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13880TermPesQty", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13880TermPesQty), 4, 0));
      Z8901TermPesUlt = 0 ;
      Z10177TermPesTpo = "" ;
   }

   public void initAll1341208( )
   {
      A942TermCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A942TermCod", A942TermCod);
      A8900TermPesPro = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A8900TermPesPro", A8900TermPesPro);
      initializeNonKey1341208( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1341209( )
   {
      A8903TermPesMin = DecimalUtil.ZERO ;
      A8904TermPesMax = DecimalUtil.ZERO ;
      A8905TermPesOpe = "" ;
      A8906TermPesTol = DecimalUtil.ZERO ;
      A12701TermPesOpP = "" ;
      Z8903TermPesMin = DecimalUtil.ZERO ;
      Z8904TermPesMax = DecimalUtil.ZERO ;
      Z8905TermPesOpe = "" ;
      Z8906TermPesTol = DecimalUtil.ZERO ;
      Z12701TermPesOpP = "" ;
   }

   public void initAll1341209( )
   {
      A8902TermPesRng = 0 ;
      initializeNonKey1341209( ) ;
   }

   public void standaloneModalInsert1341209( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?2026821166648", true, true);
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
      httpContext.AddJavascriptSource("tterpes.js", "?2026821166648", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1209( )
   {
      edtTermPesRng_Enabled = defedtTermPesRng_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtTermPesRng_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTermPesRng_Enabled), 5, 0), !bGXsfl_59_Refreshing);
   }

   public void startgridcontrol59( )
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
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A8902TermPesRng, (byte)(10), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtTermPesRng_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A8903TermPesMin, (byte)(13), (byte)(5), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtTermPesMin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A8904TermPesMax, (byte)(13), (byte)(5), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtTermPesMax_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A8905TermPesOpe));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( cmbTermPesOpe.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A8906TermPesTol, (byte)(11), (byte)(5), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtTermPesTol_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A12701TermPesOpP));
      Gridlevel_level1Column.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( cmbTermPesOpP.getVisible(), (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( cmbTermPesOpP.getEnabled(), (byte)(5), (byte)(0), ".", "")));
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
      edtTermCod_Internalname = "TERMCOD" ;
      edtTermDsc_Internalname = "TERMDSC" ;
      edtEmprCod_Internalname = "EMPRCOD" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      chkTermPes.setInternalname( "TERMPES" );
      edtTermPesPro_Internalname = "TERMPESPRO" ;
      edtTermPesUlt_Internalname = "TERMPESULT" ;
      cmbTermPesTpo.setInternalname( "TERMPESTPO" );
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      edtTermPesRng_Internalname = "TERMPESRNG" ;
      edtTermPesMin_Internalname = "TERMPESMIN" ;
      edtTermPesMax_Internalname = "TERMPESMAX" ;
      cmbTermPesOpe.setInternalname( "TERMPESOPE" );
      edtTermPesTol_Internalname = "TERMPESTOL" ;
      cmbTermPesOpP.setInternalname( "TERMPESOPP" );
      divTableleaflevel_level1_Internalname = "TABLELEAFLEVEL_LEVEL1" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      bttBtntrn_delete_Internalname = "BTNTRN_DELETE" ;
      divTablemain_Internalname = "TABLEMAIN" ;
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
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "TERMINALES DE PESAJE", "") );
      cmbTermPesOpP.setJsonclick( "" );
      edtTermPesTol_Jsonclick = "" ;
      cmbTermPesOpe.setJsonclick( "" );
      edtTermPesMax_Jsonclick = "" ;
      edtTermPesMin_Jsonclick = "" ;
      edtTermPesRng_Jsonclick = "" ;
      subGridlevel_level1_Class = "GridNoBorder WorkWith" ;
      subGridlevel_level1_Backcolorstyle = (byte)(0) ;
      cmbTermPesOpP.setEnabled( 1 );
      edtTermPesTol_Enabled = 1 ;
      cmbTermPesOpe.setEnabled( 1 );
      edtTermPesMax_Enabled = 1 ;
      edtTermPesMin_Enabled = 1 ;
      edtTermPesRng_Enabled = 1 ;
      bttBtntrn_delete_Enabled = 0 ;
      bttBtntrn_delete_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      cmbTermPesTpo.setJsonclick( "" );
      cmbTermPesTpo.setEnabled( 1 );
      edtTermPesUlt_Jsonclick = "" ;
      edtTermPesUlt_Enabled = 1 ;
      edtTermPesPro_Jsonclick = "" ;
      edtTermPesPro_Enabled = 1 ;
      chkTermPes.setEnabled( 0 );
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Enabled = 0 ;
      edtEmprCod_Jsonclick = "" ;
      edtEmprCod_Enabled = 0 ;
      edtTermDsc_Jsonclick = "" ;
      edtTermDsc_Enabled = 0 ;
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
      cmbTermPesOpP.setVisible( -1 );
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
      subsflControlProps_591209( ) ;
      while ( nGXsfl_59_idx <= nRC_GXsfl_59 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1341209( ) ;
         standaloneModal1341209( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1341209( ) ;
         nGXsfl_59_idx = (int)(nGXsfl_59_idx+1) ;
         sGXsfl_59_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_59_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_591209( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Gridlevel_level1Container)) ;
      /* End function gxnrGridlevel_level1_newrow */
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
      cmbTermPesTpo.setName( "TERMPESTPO" );
      cmbTermPesTpo.setWebtags( "" );
      cmbTermPesTpo.addItem("C", httpContext.getMessage( "Colorantes", ""), (short)(0));
      cmbTermPesTpo.addItem("A", httpContext.getMessage( "Auxiliares", ""), (short)(0));
      cmbTermPesTpo.addItem("T", httpContext.getMessage( "Todos", ""), (short)(0));
      if ( cmbTermPesTpo.getItemCount() > 0 )
      {
         A10177TermPesTpo = cmbTermPesTpo.getValidValue(A10177TermPesTpo) ;
         n10177TermPesTpo = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10177TermPesTpo", A10177TermPesTpo);
      }
      GXCCtl = "TERMPESOPE_" + sGXsfl_59_idx ;
      cmbTermPesOpe.setName( GXCCtl );
      cmbTermPesOpe.setWebtags( "" );
      cmbTermPesOpe.addItem("+", "+/-", (short)(0));
      cmbTermPesOpe.addItem("%", "%", (short)(0));
      if ( cmbTermPesOpe.getItemCount() > 0 )
      {
         A8905TermPesOpe = cmbTermPesOpe.getValidValue(A8905TermPesOpe) ;
      }
      GXCCtl = "TERMPESOPP_" + sGXsfl_59_idx ;
      cmbTermPesOpP.setName( GXCCtl );
      cmbTermPesOpP.setWebtags( "" );
      cmbTermPesOpP.addItem("", "*", (short)(0));
      cmbTermPesOpP.addItem("-", "-", (short)(0));
      if ( cmbTermPesOpP.getItemCount() > 0 )
      {
         A12701TermPesOpP = cmbTermPesOpP.getValidValue(A12701TermPesOpP) ;
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

   public void valid_Termcod( )
   {
      n396EmprCod = false ;
      n8898TermDsc = false ;
      n8899TermPes = false ;
      n407EmprNom = false ;
      /* Using cursor T013422 */
      pr_default.execute(17, new Object[] {A942TermCod});
      if ( (pr_default.getStatus(17) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TERMIN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TERMCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTermCod_Internalname ;
      }
      A8898TermDsc = T013422_A8898TermDsc[0] ;
      n8898TermDsc = T013422_n8898TermDsc[0] ;
      A8899TermPes = T013422_A8899TermPes[0] ;
      n8899TermPes = T013422_n8899TermPes[0] ;
      A396EmprCod = T013422_A396EmprCod[0] ;
      n396EmprCod = T013422_n396EmprCod[0] ;
      pr_default.close(17);
      /* Using cursor T013423 */
      pr_default.execute(18, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod});
      if ( (pr_default.getStatus(18) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T013423_A407EmprNom[0] ;
      n407EmprNom = T013423_n407EmprNom[0] ;
      pr_default.close(18);
      dynload_actions( ) ;
      A8899TermPes = (byte)(((GXutil.strcmp(GXutil.ltrim( localUtil.ntoc( A8899TermPes, (byte)(1), (byte)(0), ".", "")), "1")==0) ? 1 : 0)) ;
      n8899TermPes = false ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A8898TermDsc", GXutil.rtrim( A8898TermDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A8899TermPes", GXutil.ltrim( localUtil.ntoc( A8899TermPes, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", GXutil.rtrim( A396EmprCod));
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
   }

   public void valid_Termpespro( )
   {
      n13880TermPesQty = false ;
      /* Using cursor T013425 */
      pr_default.execute(19, new Object[] {A942TermCod, A8900TermPesPro});
      if ( (pr_default.getStatus(19) != 101) )
      {
         A13880TermPesQty = T013425_A13880TermPesQty[0] ;
         n13880TermPesQty = T013425_n13880TermPesQty[0] ;
      }
      else
      {
         A13880TermPesQty = (short)(0) ;
         n13880TermPesQty = false ;
      }
      pr_default.close(19);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A13880TermPesQty", GXutil.ltrim( localUtil.ntoc( A13880TermPesQty, (byte)(4), (byte)(0), ".", "")));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV33TermCod',fld:'vTERMCOD',pic:'',hsh:true},{av:'AV34TermPesPro',fld:'vTERMPESPRO',pic:'',hsh:true},{av:'A8899TermPes',fld:'TERMPES',pic:'9'}]");
      setEventMetadata("ENTER",",oparms:[{av:'A8899TermPes',fld:'TERMPES',pic:'9'}]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV36TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true},{av:'AV33TermCod',fld:'vTERMCOD',pic:'',hsh:true},{av:'AV34TermPesPro',fld:'vTERMPESPRO',pic:'',hsh:true},{av:'A8899TermPes',fld:'TERMPES',pic:'9'}]");
      setEventMetadata("REFRESH",",oparms:[{av:'A8899TermPes',fld:'TERMPES',pic:'9'}]}");
      setEventMetadata("AFTER TRN","{handler:'e121342',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV36TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true},{av:'A8899TermPes',fld:'TERMPES',pic:'9'}]");
      setEventMetadata("AFTER TRN",",oparms:[{av:'A8899TermPes',fld:'TERMPES',pic:'9'}]}");
      setEventMetadata("VALID_TERMCOD","{handler:'valid_Termcod',iparms:[{av:'A942TermCod',fld:'TERMCOD',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A8898TermDsc',fld:'TERMDSC',pic:''},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A8899TermPes',fld:'TERMPES',pic:'9'}]");
      setEventMetadata("VALID_TERMCOD",",oparms:[{av:'A8898TermDsc',fld:'TERMDSC',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A8899TermPes',fld:'TERMPES',pic:'9'}]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[{av:'A8899TermPes',fld:'TERMPES',pic:'9'}]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[{av:'A8899TermPes',fld:'TERMPES',pic:'9'}]}");
      setEventMetadata("VALID_TERMPESPRO","{handler:'valid_Termpespro',iparms:[{av:'A942TermCod',fld:'TERMCOD',pic:''},{av:'A8900TermPesPro',fld:'TERMPESPRO',pic:''},{av:'A13880TermPesQty',fld:'TERMPESQTY',pic:'ZZZ9'},{av:'A8899TermPes',fld:'TERMPES',pic:'9'}]");
      setEventMetadata("VALID_TERMPESPRO",",oparms:[{av:'A13880TermPesQty',fld:'TERMPESQTY',pic:'ZZZ9'},{av:'A8899TermPes',fld:'TERMPES',pic:'9'}]}");
      setEventMetadata("VALID_TERMPESTPO","{handler:'valid_Termpestpo',iparms:[{av:'A8899TermPes',fld:'TERMPES',pic:'9'}]");
      setEventMetadata("VALID_TERMPESTPO",",oparms:[{av:'A8899TermPes',fld:'TERMPES',pic:'9'}]}");
      setEventMetadata("VALID_TERMPESRNG","{handler:'valid_Termpesrng',iparms:[{av:'A8899TermPes',fld:'TERMPES',pic:'9'}]");
      setEventMetadata("VALID_TERMPESRNG",",oparms:[{av:'A8899TermPes',fld:'TERMPES',pic:'9'}]}");
      setEventMetadata("NULL","{handler:'valid_Termpesopp',iparms:[{av:'A8899TermPes',fld:'TERMPES',pic:'9'}]");
      setEventMetadata("NULL",",oparms:[{av:'A8899TermPes',fld:'TERMPES',pic:'9'}]}");
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
      pr_default.close(17);
      pr_default.close(18);
      pr_default.close(19);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      wcpOAV33TermCod = "" ;
      wcpOAV34TermPesPro = "" ;
      Z942TermCod = "" ;
      Z8900TermPesPro = "" ;
      Z10177TermPesTpo = "" ;
      Z8903TermPesMin = DecimalUtil.ZERO ;
      Z8904TermPesMax = DecimalUtil.ZERO ;
      Z8905TermPesOpe = "" ;
      Z8906TermPesTol = DecimalUtil.ZERO ;
      Z12701TermPesOpP = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A942TermCod = "" ;
      A396EmprCod = "" ;
      A8900TermPesPro = "" ;
      Gx_mode = "" ;
      AV33TermCod = "" ;
      AV34TermPesPro = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      A10177TermPesTpo = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      A8898TermDsc = "" ;
      A407EmprNom = "" ;
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      Gridlevel_level1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1209 = "" ;
      sStyleString = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode1208 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      GXCCtl = "" ;
      A8903TermPesMin = DecimalUtil.ZERO ;
      A8904TermPesMax = DecimalUtil.ZERO ;
      A8905TermPesOpe = "" ;
      A8906TermPesTol = DecimalUtil.ZERO ;
      A12701TermPesOpP = "" ;
      AV27Station = "" ;
      AV25EmprCod = "" ;
      AV26EmprNom = "" ;
      AV20UsurCod = "" ;
      GXv_int6 = new byte[1] ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      AV35WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV36TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV37WebSession = httpContext.getWebSession();
      Z8898TermDsc = "" ;
      Z396EmprCod = "" ;
      Z407EmprNom = "" ;
      T01346_A8898TermDsc = new String[] {""} ;
      T01346_n8898TermDsc = new boolean[] {false} ;
      T01346_A8899TermPes = new byte[1] ;
      T01346_n8899TermPes = new boolean[] {false} ;
      T01346_A396EmprCod = new String[] {""} ;
      T01346_n396EmprCod = new boolean[] {false} ;
      T01347_A407EmprNom = new String[] {""} ;
      T01347_n407EmprNom = new boolean[] {false} ;
      T01349_A13880TermPesQty = new short[1] ;
      T01349_n13880TermPesQty = new boolean[] {false} ;
      T013411_A8900TermPesPro = new String[] {""} ;
      T013411_A8898TermDsc = new String[] {""} ;
      T013411_n8898TermDsc = new boolean[] {false} ;
      T013411_A407EmprNom = new String[] {""} ;
      T013411_n407EmprNom = new boolean[] {false} ;
      T013411_A8899TermPes = new byte[1] ;
      T013411_n8899TermPes = new boolean[] {false} ;
      T013411_A8901TermPesUlt = new long[1] ;
      T013411_n8901TermPesUlt = new boolean[] {false} ;
      T013411_A10177TermPesTpo = new String[] {""} ;
      T013411_n10177TermPesTpo = new boolean[] {false} ;
      T013411_A942TermCod = new String[] {""} ;
      T013411_A396EmprCod = new String[] {""} ;
      T013411_n396EmprCod = new boolean[] {false} ;
      T013411_A13880TermPesQty = new short[1] ;
      T013411_n13880TermPesQty = new boolean[] {false} ;
      T013412_A8898TermDsc = new String[] {""} ;
      T013412_n8898TermDsc = new boolean[] {false} ;
      T013412_A8899TermPes = new byte[1] ;
      T013412_n8899TermPes = new boolean[] {false} ;
      T013412_A396EmprCod = new String[] {""} ;
      T013412_n396EmprCod = new boolean[] {false} ;
      T013413_A407EmprNom = new String[] {""} ;
      T013413_n407EmprNom = new boolean[] {false} ;
      T013415_A13880TermPesQty = new short[1] ;
      T013415_n13880TermPesQty = new boolean[] {false} ;
      T013416_A942TermCod = new String[] {""} ;
      T013416_A8900TermPesPro = new String[] {""} ;
      T01345_A8900TermPesPro = new String[] {""} ;
      T01345_A8901TermPesUlt = new long[1] ;
      T01345_n8901TermPesUlt = new boolean[] {false} ;
      T01345_A10177TermPesTpo = new String[] {""} ;
      T01345_n10177TermPesTpo = new boolean[] {false} ;
      T01345_A942TermCod = new String[] {""} ;
      T013417_A942TermCod = new String[] {""} ;
      T013417_A8900TermPesPro = new String[] {""} ;
      T013418_A942TermCod = new String[] {""} ;
      T013418_A8900TermPesPro = new String[] {""} ;
      T01344_A8900TermPesPro = new String[] {""} ;
      T01344_A8901TermPesUlt = new long[1] ;
      T01344_n8901TermPesUlt = new boolean[] {false} ;
      T01344_A10177TermPesTpo = new String[] {""} ;
      T01344_n10177TermPesTpo = new boolean[] {false} ;
      T01344_A942TermCod = new String[] {""} ;
      T013422_A8898TermDsc = new String[] {""} ;
      T013422_n8898TermDsc = new boolean[] {false} ;
      T013422_A8899TermPes = new byte[1] ;
      T013422_n8899TermPes = new boolean[] {false} ;
      T013422_A396EmprCod = new String[] {""} ;
      T013422_n396EmprCod = new boolean[] {false} ;
      T013423_A407EmprNom = new String[] {""} ;
      T013423_n407EmprNom = new boolean[] {false} ;
      T013425_A13880TermPesQty = new short[1] ;
      T013425_n13880TermPesQty = new boolean[] {false} ;
      T013426_A942TermCod = new String[] {""} ;
      T013426_A8900TermPesPro = new String[] {""} ;
      T013427_A942TermCod = new String[] {""} ;
      T013427_A8900TermPesPro = new String[] {""} ;
      T013427_A8902TermPesRng = new long[1] ;
      T013427_A8903TermPesMin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013427_A8904TermPesMax = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013427_A8905TermPesOpe = new String[] {""} ;
      T013427_A8906TermPesTol = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013427_A12701TermPesOpP = new String[] {""} ;
      T013428_A942TermCod = new String[] {""} ;
      T013428_A8900TermPesPro = new String[] {""} ;
      T013428_A8902TermPesRng = new long[1] ;
      T01343_A942TermCod = new String[] {""} ;
      T01343_A8900TermPesPro = new String[] {""} ;
      T01343_A8902TermPesRng = new long[1] ;
      T01343_A8903TermPesMin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01343_A8904TermPesMax = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01343_A8905TermPesOpe = new String[] {""} ;
      T01343_A8906TermPesTol = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01343_A12701TermPesOpP = new String[] {""} ;
      T01342_A942TermCod = new String[] {""} ;
      T01342_A8900TermPesPro = new String[] {""} ;
      T01342_A8902TermPesRng = new long[1] ;
      T01342_A8903TermPesMin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01342_A8904TermPesMax = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01342_A8905TermPesOpe = new String[] {""} ;
      T01342_A8906TermPesTol = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01342_A12701TermPesOpP = new String[] {""} ;
      T013432_A942TermCod = new String[] {""} ;
      T013432_A8900TermPesPro = new String[] {""} ;
      T013432_A8902TermPesRng = new long[1] ;
      Gridlevel_level1Row = new com.genexus.webpanels.GXWebRow();
      subGridlevel_level1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Gridlevel_level1Column = new com.genexus.webpanels.GXWebColumn();
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tterpes__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tterpes__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tterpes__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tterpes__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tterpes__default(),
         new Object[] {
             new Object[] {
            T01342_A942TermCod, T01342_A8900TermPesPro, T01342_A8902TermPesRng, T01342_A8903TermPesMin, T01342_A8904TermPesMax, T01342_A8905TermPesOpe, T01342_A8906TermPesTol, T01342_A12701TermPesOpP
            }
            , new Object[] {
            T01343_A942TermCod, T01343_A8900TermPesPro, T01343_A8902TermPesRng, T01343_A8903TermPesMin, T01343_A8904TermPesMax, T01343_A8905TermPesOpe, T01343_A8906TermPesTol, T01343_A12701TermPesOpP
            }
            , new Object[] {
            T01344_A8900TermPesPro, T01344_A8901TermPesUlt, T01344_n8901TermPesUlt, T01344_A10177TermPesTpo, T01344_n10177TermPesTpo, T01344_A942TermCod
            }
            , new Object[] {
            T01345_A8900TermPesPro, T01345_A8901TermPesUlt, T01345_n8901TermPesUlt, T01345_A10177TermPesTpo, T01345_n10177TermPesTpo, T01345_A942TermCod
            }
            , new Object[] {
            T01346_A8898TermDsc, T01346_n8898TermDsc, T01346_A8899TermPes, T01346_n8899TermPes, T01346_A396EmprCod, T01346_n396EmprCod
            }
            , new Object[] {
            T01347_A407EmprNom, T01347_n407EmprNom
            }
            , new Object[] {
            T01349_A13880TermPesQty, T01349_n13880TermPesQty
            }
            , new Object[] {
            T013411_A8900TermPesPro, T013411_A8898TermDsc, T013411_n8898TermDsc, T013411_A407EmprNom, T013411_n407EmprNom, T013411_A8899TermPes, T013411_n8899TermPes, T013411_A8901TermPesUlt, T013411_n8901TermPesUlt, T013411_A10177TermPesTpo,
            T013411_n10177TermPesTpo, T013411_A942TermCod, T013411_A396EmprCod, T013411_n396EmprCod, T013411_A13880TermPesQty, T013411_n13880TermPesQty
            }
            , new Object[] {
            T013412_A8898TermDsc, T013412_n8898TermDsc, T013412_A8899TermPes, T013412_n8899TermPes, T013412_A396EmprCod, T013412_n396EmprCod
            }
            , new Object[] {
            T013413_A407EmprNom, T013413_n407EmprNom
            }
            , new Object[] {
            T013415_A13880TermPesQty, T013415_n13880TermPesQty
            }
            , new Object[] {
            T013416_A942TermCod, T013416_A8900TermPesPro
            }
            , new Object[] {
            T013417_A942TermCod, T013417_A8900TermPesPro
            }
            , new Object[] {
            T013418_A942TermCod, T013418_A8900TermPesPro
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T013422_A8898TermDsc, T013422_n8898TermDsc, T013422_A8899TermPes, T013422_n8899TermPes, T013422_A396EmprCod, T013422_n396EmprCod
            }
            , new Object[] {
            T013423_A407EmprNom, T013423_n407EmprNom
            }
            , new Object[] {
            T013425_A13880TermPesQty, T013425_n13880TermPesQty
            }
            , new Object[] {
            T013426_A942TermCod, T013426_A8900TermPesPro
            }
            , new Object[] {
            T013427_A942TermCod, T013427_A8900TermPesPro, T013427_A8902TermPesRng, T013427_A8903TermPesMin, T013427_A8904TermPesMax, T013427_A8905TermPesOpe, T013427_A8906TermPesTol, T013427_A12701TermPesOpP
            }
            , new Object[] {
            T013428_A942TermCod, T013428_A8900TermPesPro, T013428_A8902TermPesRng
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T013432_A942TermCod, T013432_A8900TermPesPro, T013432_A8902TermPesRng
            }
         }
      );
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A8899TermPes ;
   private byte AV32tinteoriente ;
   private byte GXt_int5 ;
   private byte GXv_int6[] ;
   private byte Z8899TermPes ;
   private byte Gx_BScreen ;
   private byte subGridlevel_level1_Backcolorstyle ;
   private byte subGridlevel_level1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGridlevel_level1_Allowselection ;
   private byte subGridlevel_level1_Allowhovering ;
   private byte subGridlevel_level1_Allowcollapsing ;
   private byte subGridlevel_level1_Collapsed ;
   private short O13880TermPesQty ;
   private short nRcdDeleted_1209 ;
   private short nRcdExists_1209 ;
   private short nIsMod_1209 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount1209 ;
   private short RcdFound1209 ;
   private short B13880TermPesQty ;
   private short A13880TermPesQty ;
   private short nBlankRcdUsr1209 ;
   private short RcdFound1208 ;
   private short s13880TermPesQty ;
   private short Z13880TermPesQty ;
   private short nIsDirty_1208 ;
   private short nIsDirty_1209 ;
   private int nRC_GXsfl_59 ;
   private int nGXsfl_59_idx=1 ;
   private int trnEnded ;
   private int edtTermCod_Enabled ;
   private int edtTermDsc_Enabled ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtTermPesPro_Enabled ;
   private int edtTermPesUlt_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int edtTermPesRng_Enabled ;
   private int edtTermPesMin_Enabled ;
   private int edtTermPesMax_Enabled ;
   private int edtTermPesTol_Enabled ;
   private int fRowAdded ;
   private int GX_JID ;
   private int subGridlevel_level1_Backcolor ;
   private int subGridlevel_level1_Allbackcolor ;
   private int defedtTermPesRng_Enabled ;
   private int idxLst ;
   private int subGridlevel_level1_Selectedindex ;
   private int subGridlevel_level1_Selectioncolor ;
   private int subGridlevel_level1_Hoveringcolor ;
   private long Z8901TermPesUlt ;
   private long Z8902TermPesRng ;
   private long A8901TermPesUlt ;
   private long GRIDLEVEL_LEVEL1_nFirstRecordOnPage ;
   private long A8902TermPesRng ;
   private java.math.BigDecimal Z8903TermPesMin ;
   private java.math.BigDecimal Z8904TermPesMax ;
   private java.math.BigDecimal Z8906TermPesTol ;
   private java.math.BigDecimal A8903TermPesMin ;
   private java.math.BigDecimal A8904TermPesMax ;
   private java.math.BigDecimal A8906TermPesTol ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV33TermCod ;
   private String wcpOAV34TermPesPro ;
   private String Z942TermCod ;
   private String Z8900TermPesPro ;
   private String Z10177TermPesTpo ;
   private String Z8905TermPesOpe ;
   private String Z12701TermPesOpP ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A942TermCod ;
   private String A396EmprCod ;
   private String A8900TermPesPro ;
   private String Gx_mode ;
   private String AV33TermCod ;
   private String AV34TermPesPro ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtTermCod_Internalname ;
   private String sGXsfl_59_idx="0001" ;
   private String A10177TermPesTpo ;
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
   private String edtTermCod_Jsonclick ;
   private String edtTermDsc_Internalname ;
   private String A8898TermDsc ;
   private String edtTermDsc_Jsonclick ;
   private String edtEmprCod_Internalname ;
   private String edtEmprCod_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String edtTermPesPro_Internalname ;
   private String edtTermPesPro_Jsonclick ;
   private String edtTermPesUlt_Internalname ;
   private String edtTermPesUlt_Jsonclick ;
   private String divTableleaflevel_level1_Internalname ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String sMode1209 ;
   private String edtTermPesRng_Internalname ;
   private String edtTermPesMin_Internalname ;
   private String edtTermPesMax_Internalname ;
   private String edtTermPesTol_Internalname ;
   private String sStyleString ;
   private String subGridlevel_level1_Internalname ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String hsh ;
   private String sMode1208 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String GXCCtl ;
   private String A8905TermPesOpe ;
   private String A12701TermPesOpP ;
   private String AV27Station ;
   private String AV25EmprCod ;
   private String AV26EmprNom ;
   private String AV20UsurCod ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String Z8898TermDsc ;
   private String Z396EmprCod ;
   private String Z407EmprNom ;
   private String sGXsfl_59_fel_idx="0001" ;
   private String subGridlevel_level1_Class ;
   private String subGridlevel_level1_Linesclass ;
   private String ROClassString ;
   private String edtTermPesRng_Jsonclick ;
   private String edtTermPesMin_Jsonclick ;
   private String edtTermPesMax_Jsonclick ;
   private String edtTermPesTol_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGridlevel_level1_Header ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n396EmprCod ;
   private boolean wbErr ;
   private boolean bGXsfl_59_Refreshing=false ;
   private boolean n8899TermPes ;
   private boolean n10177TermPesTpo ;
   private boolean Dvpanel_tableattributes_Autowidth ;
   private boolean Dvpanel_tableattributes_Autoheight ;
   private boolean Dvpanel_tableattributes_Collapsible ;
   private boolean Dvpanel_tableattributes_Collapsed ;
   private boolean Dvpanel_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_tableattributes_Autoscroll ;
   private boolean n13880TermPesQty ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean n8898TermDsc ;
   private boolean n407EmprNom ;
   private boolean n8901TermPesUlt ;
   private boolean returnInSub ;
   private com.genexus.webpanels.GXWebGrid Gridlevel_level1Container ;
   private com.genexus.webpanels.GXWebRow Gridlevel_level1Row ;
   private com.genexus.webpanels.GXWebColumn Gridlevel_level1Column ;
   private com.genexus.webpanels.WebSession AV37WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private ICheckbox chkTermPes ;
   private HTMLChoice cmbTermPesTpo ;
   private HTMLChoice cmbTermPesOpe ;
   private HTMLChoice cmbTermPesOpP ;
   private IDataStoreProvider pr_default ;
   private String[] T01346_A8898TermDsc ;
   private boolean[] T01346_n8898TermDsc ;
   private byte[] T01346_A8899TermPes ;
   private boolean[] T01346_n8899TermPes ;
   private String[] T01346_A396EmprCod ;
   private boolean[] T01346_n396EmprCod ;
   private String[] T01347_A407EmprNom ;
   private boolean[] T01347_n407EmprNom ;
   private short[] T01349_A13880TermPesQty ;
   private boolean[] T01349_n13880TermPesQty ;
   private String[] T013411_A8900TermPesPro ;
   private String[] T013411_A8898TermDsc ;
   private boolean[] T013411_n8898TermDsc ;
   private String[] T013411_A407EmprNom ;
   private boolean[] T013411_n407EmprNom ;
   private byte[] T013411_A8899TermPes ;
   private boolean[] T013411_n8899TermPes ;
   private long[] T013411_A8901TermPesUlt ;
   private boolean[] T013411_n8901TermPesUlt ;
   private String[] T013411_A10177TermPesTpo ;
   private boolean[] T013411_n10177TermPesTpo ;
   private String[] T013411_A942TermCod ;
   private String[] T013411_A396EmprCod ;
   private boolean[] T013411_n396EmprCod ;
   private short[] T013411_A13880TermPesQty ;
   private boolean[] T013411_n13880TermPesQty ;
   private String[] T013412_A8898TermDsc ;
   private boolean[] T013412_n8898TermDsc ;
   private byte[] T013412_A8899TermPes ;
   private boolean[] T013412_n8899TermPes ;
   private String[] T013412_A396EmprCod ;
   private boolean[] T013412_n396EmprCod ;
   private String[] T013413_A407EmprNom ;
   private boolean[] T013413_n407EmprNom ;
   private short[] T013415_A13880TermPesQty ;
   private boolean[] T013415_n13880TermPesQty ;
   private String[] T013416_A942TermCod ;
   private String[] T013416_A8900TermPesPro ;
   private String[] T01345_A8900TermPesPro ;
   private long[] T01345_A8901TermPesUlt ;
   private boolean[] T01345_n8901TermPesUlt ;
   private String[] T01345_A10177TermPesTpo ;
   private boolean[] T01345_n10177TermPesTpo ;
   private String[] T01345_A942TermCod ;
   private String[] T013417_A942TermCod ;
   private String[] T013417_A8900TermPesPro ;
   private String[] T013418_A942TermCod ;
   private String[] T013418_A8900TermPesPro ;
   private String[] T01344_A8900TermPesPro ;
   private long[] T01344_A8901TermPesUlt ;
   private boolean[] T01344_n8901TermPesUlt ;
   private String[] T01344_A10177TermPesTpo ;
   private boolean[] T01344_n10177TermPesTpo ;
   private String[] T01344_A942TermCod ;
   private String[] T013422_A8898TermDsc ;
   private boolean[] T013422_n8898TermDsc ;
   private byte[] T013422_A8899TermPes ;
   private boolean[] T013422_n8899TermPes ;
   private String[] T013422_A396EmprCod ;
   private boolean[] T013422_n396EmprCod ;
   private String[] T013423_A407EmprNom ;
   private boolean[] T013423_n407EmprNom ;
   private short[] T013425_A13880TermPesQty ;
   private boolean[] T013425_n13880TermPesQty ;
   private String[] T013426_A942TermCod ;
   private String[] T013426_A8900TermPesPro ;
   private String[] T013427_A942TermCod ;
   private String[] T013427_A8900TermPesPro ;
   private long[] T013427_A8902TermPesRng ;
   private java.math.BigDecimal[] T013427_A8903TermPesMin ;
   private java.math.BigDecimal[] T013427_A8904TermPesMax ;
   private String[] T013427_A8905TermPesOpe ;
   private java.math.BigDecimal[] T013427_A8906TermPesTol ;
   private String[] T013427_A12701TermPesOpP ;
   private String[] T013428_A942TermCod ;
   private String[] T013428_A8900TermPesPro ;
   private long[] T013428_A8902TermPesRng ;
   private String[] T01343_A942TermCod ;
   private String[] T01343_A8900TermPesPro ;
   private long[] T01343_A8902TermPesRng ;
   private java.math.BigDecimal[] T01343_A8903TermPesMin ;
   private java.math.BigDecimal[] T01343_A8904TermPesMax ;
   private String[] T01343_A8905TermPesOpe ;
   private java.math.BigDecimal[] T01343_A8906TermPesTol ;
   private String[] T01343_A12701TermPesOpP ;
   private String[] T01342_A942TermCod ;
   private String[] T01342_A8900TermPesPro ;
   private long[] T01342_A8902TermPesRng ;
   private java.math.BigDecimal[] T01342_A8903TermPesMin ;
   private java.math.BigDecimal[] T01342_A8904TermPesMax ;
   private String[] T01342_A8905TermPesOpe ;
   private java.math.BigDecimal[] T01342_A8906TermPesTol ;
   private String[] T01342_A12701TermPesOpP ;
   private String[] T013432_A942TermCod ;
   private String[] T013432_A8900TermPesPro ;
   private long[] T013432_A8902TermPesRng ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private app.wwpbaseobjects.SdtWWPContext AV35WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV36TrnContext ;
}

final  class tterpes__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tterpes__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tterpes__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tterpes__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tterpes__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01342", "SELECT TermCod, TermPesPro, TermPesRng, TermPesMin, TermPesMax, TermPesOpe, TermPesTol, TermPesOpP FROM TXPTERMI2 WHERE TermCod = ? AND TermPesPro = ? AND TermPesRng = ?  FOR UPDATE OF TermPesMin, TermPesMax, TermPesOpe, TermPesTol, TermPesOpP NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01343", "SELECT TermCod, TermPesPro, TermPesRng, TermPesMin, TermPesMax, TermPesOpe, TermPesTol, TermPesOpP FROM TXPTERMI2 WHERE TermCod = ? AND TermPesPro = ? AND TermPesRng = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01344", "SELECT TermPesPro, TermPesUlt, TermPesTpo, TermCod FROM TXPTERMI1 WHERE TermCod = ? AND TermPesPro = ?  FOR UPDATE OF TermPesUlt, TermPesTpo NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01345", "SELECT TermPesPro, TermPesUlt, TermPesTpo, TermCod FROM TXPTERMI1 WHERE TermCod = ? AND TermPesPro = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01346", "SELECT TermDsc, TermPes, EmprCod FROM TXPTERMIN WHERE TermCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01347", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01349", "SELECT COALESCE( T1.TermPesQty, 0) AS TermPesQty FROM (SELECT COUNT(*) AS TermPesQty, TermCod, TermPesPro FROM TXPTERMI2 GROUP BY TermCod, TermPesPro ) T1 WHERE T1.TermCod = ? AND T1.TermPesPro = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013411", "SELECT /*+ FIRST_ROWS(100) */ TM1.TermPesPro, T2.TermDsc, T3.EmprNom, T2.TermPes, TM1.TermPesUlt, TM1.TermPesTpo, TM1.TermCod, T2.EmprCod, COALESCE( T4.TermPesQty, 0) AS TermPesQty FROM (((TXPTERMI1 TM1 INNER JOIN TXPTERMIN T2 ON T2.TermCod = TM1.TermCod) LEFT JOIN TXPEMPRES T3 ON T3.EmprCod = T2.EmprCod) LEFT JOIN (SELECT COUNT(*) AS TermPesQty, TermCod, TermPesPro FROM TXPTERMI2 GROUP BY TermCod, TermPesPro ) T4 ON T4.TermCod = TM1.TermCod AND T4.TermPesPro = TM1.TermPesPro) WHERE TM1.TermCod = ? and TM1.TermPesPro = ? ORDER BY TM1.TermCod, TM1.TermPesPro ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013412", "SELECT TermDsc, TermPes, EmprCod FROM TXPTERMIN WHERE TermCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013413", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013415", "SELECT COALESCE( T1.TermPesQty, 0) AS TermPesQty FROM (SELECT COUNT(*) AS TermPesQty, TermCod, TermPesPro FROM TXPTERMI2 GROUP BY TermCod, TermPesPro ) T1 WHERE T1.TermCod = ? AND T1.TermPesPro = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013416", "SELECT /*+ FIRST_ROWS(1) */ TermCod, TermPesPro FROM TXPTERMI1 WHERE TermCod = ? AND TermPesPro = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013417", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ TermCod, TermPesPro FROM TXPTERMI1 WHERE ( TermCod > ? or TermCod = ? and TermPesPro > ?) ORDER BY TermCod, TermPesPro) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013418", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ TermCod, TermPesPro FROM TXPTERMI1 WHERE ( TermCod < ? or TermCod = ? and TermPesPro < ?) ORDER BY TermCod DESC, TermPesPro DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T013419", "INSERT INTO TXPTERMI1(TermPesPro, TermPesUlt, TermPesTpo, TermCod) VALUES(?, ?, ?, ?)", GX_NOMASK, "TXPTERMI1")
         ,new UpdateCursor("T013420", "UPDATE TXPTERMI1 SET TermPesUlt=?, TermPesTpo=?  WHERE TermCod = ? AND TermPesPro = ?", GX_NOMASK, "TXPTERMI1")
         ,new UpdateCursor("T013421", "DELETE FROM TXPTERMI1  WHERE TermCod = ? AND TermPesPro = ?", GX_NOMASK, "TXPTERMI1")
         ,new ForEachCursor("T013422", "SELECT TermDsc, TermPes, EmprCod FROM TXPTERMIN WHERE TermCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013423", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013425", "SELECT COALESCE( T1.TermPesQty, 0) AS TermPesQty FROM (SELECT COUNT(*) AS TermPesQty, TermCod, TermPesPro FROM TXPTERMI2 GROUP BY TermCod, TermPesPro ) T1 WHERE T1.TermCod = ? AND T1.TermPesPro = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013426", "SELECT /*+ FIRST_ROWS(100) */ TermCod, TermPesPro FROM TXPTERMI1 ORDER BY TermCod, TermPesPro ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013427", "SELECT TermCod, TermPesPro, TermPesRng, TermPesMin, TermPesMax, TermPesOpe, TermPesTol, TermPesOpP FROM TXPTERMI2 WHERE TermCod = ? and TermPesPro = ? and TermPesRng = ? ORDER BY TermCod, TermPesPro, TermPesRng ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013428", "SELECT TermCod, TermPesPro, TermPesRng FROM TXPTERMI2 WHERE TermCod = ? AND TermPesPro = ? AND TermPesRng = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T013429", "INSERT INTO TXPTERMI2(TermCod, TermPesPro, TermPesRng, TermPesMin, TermPesMax, TermPesOpe, TermPesTol, TermPesOpP) VALUES(?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPTERMI2")
         ,new UpdateCursor("T013430", "UPDATE TXPTERMI2 SET TermPesMin=?, TermPesMax=?, TermPesOpe=?, TermPesTol=?, TermPesOpP=?  WHERE TermCod = ? AND TermPesPro = ? AND TermPesRng = ?", GX_NOMASK, "TXPTERMI2")
         ,new UpdateCursor("T013431", "DELETE FROM TXPTERMI2  WHERE TermCod = ? AND TermPesPro = ? AND TermPesRng = ?", GX_NOMASK, "TXPTERMI2")
         ,new ForEachCursor("T013432", "SELECT TermCod, TermPesPro, TermPesRng FROM TXPTERMI2 WHERE TermCod = ? and TermPesPro = ? ORDER BY TermCod, TermPesPro, TermPesRng ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 20);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 10);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 20);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 10);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((byte[]) buf[2])[0] = rslt.getByte(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 20);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((byte[]) buf[5])[0] = rslt.getByte(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((long[]) buf[7])[0] = rslt.getLong(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 10);
               ((String[]) buf[12])[0] = rslt.getString(8, 3);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((short[]) buf[14])[0] = rslt.getShort(9);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((byte[]) buf[2])[0] = rslt.getByte(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 10 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((byte[]) buf[2])[0] = rslt.getByte(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 19 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((long[]) buf[2])[0] = rslt.getLong(3);
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
               stmt.setString(2, (String)parms[1], 20);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 10);
               stmt.setString(2, (String)parms[1], 20);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 10);
               stmt.setString(2, (String)parms[1], 20);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 10);
               stmt.setString(2, (String)parms[1], 20);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 10);
               return;
            case 5 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 10);
               stmt.setString(2, (String)parms[1], 20);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 10);
               stmt.setString(2, (String)parms[1], 20);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 10);
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
               stmt.setString(1, (String)parms[0], 10);
               stmt.setString(2, (String)parms[1], 20);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 10);
               stmt.setString(2, (String)parms[1], 20);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 10);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setString(3, (String)parms[2], 20);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 10);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setString(3, (String)parms[2], 20);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 20);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(2, ((Number) parms[2]).longValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 1);
               }
               stmt.setString(4, (String)parms[5], 10);
               return;
            case 15 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(1, ((Number) parms[1]).longValue());
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 1);
               }
               stmt.setString(3, (String)parms[4], 10);
               stmt.setString(4, (String)parms[5], 20);
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 10);
               stmt.setString(2, (String)parms[1], 20);
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
               stmt.setString(1, (String)parms[0], 10);
               stmt.setString(2, (String)parms[1], 20);
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 10);
               stmt.setString(2, (String)parms[1], 20);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 10);
               stmt.setString(2, (String)parms[1], 20);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 10);
               stmt.setString(2, (String)parms[1], 20);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 5);
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 5);
               stmt.setString(6, (String)parms[5], 1);
               stmt.setBigDecimal(7, (java.math.BigDecimal)parms[6], 5);
               stmt.setString(8, (String)parms[7], 1);
               return;
            case 24 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 5);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 5);
               stmt.setString(3, (String)parms[2], 1);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 5);
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 10);
               stmt.setString(7, (String)parms[6], 20);
               stmt.setLong(8, ((Number) parms[7]).longValue());
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 10);
               stmt.setString(2, (String)parms[1], 20);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 10);
               stmt.setString(2, (String)parms[1], 20);
               return;
      }
   }

}

