package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class clienv_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxCallCrl"+"_"+"CLIENVTP") == 0 )
      {
         AV7EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxdlaclienvtp1Q822( AV7EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel3"+"_"+"CLIENVNMT") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A723CliEnvTp = (short)(GXutil.lval( httpContext.GetPar( "CliEnvTp"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A723CliEnvTp", GXutil.ltrimstr( DecimalUtil.doubleToDec(A723CliEnvTp), 4, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx3asaclienvnmt1Q822( A396EmprCod, A723CliEnvTp) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_19") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
         n252CliCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_19( A396EmprCod, A252CliCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_20") == 0 )
      {
         A270CliEnvPrv = (short)(GXutil.lval( httpContext.GetPar( "CliEnvPrv"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A270CliEnvPrv", GXutil.ltrimstr( DecimalUtil.doubleToDec(A270CliEnvPrv), 3, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_20( A270CliEnvPrv) ;
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
            AV8CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8CliCod), 6, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV8CliCod), "ZZZZZ9")));
            AV9CliEnvLin = (byte)(GXutil.lval( httpContext.GetPar( "CliEnvLin"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9CliEnvLin", GXutil.str( AV9CliEnvLin, 1, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLIENVLIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV9CliEnvLin), "9")));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "CLIENTE: DOMICILIO DE ENVIOS", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtCliEnvNom_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public clienv_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public clienv_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( clienv_impl.class ));
   }

   public clienv_impl( int remoteHandle ,
                       ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      dynCliEnvPrv = new HTMLChoice();
      dynCliEnvTp = new HTMLChoice();
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
      if ( dynCliEnvPrv.getItemCount() > 0 )
      {
         A270CliEnvPrv = (short)(GXutil.lval( dynCliEnvPrv.getValidValue(GXutil.trim( GXutil.str( A270CliEnvPrv, 3, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A270CliEnvPrv", GXutil.ltrimstr( DecimalUtil.doubleToDec(A270CliEnvPrv), 3, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         dynCliEnvPrv.setValue( GXutil.trim( GXutil.str( A270CliEnvPrv, 3, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, dynCliEnvPrv.getInternalname(), "Values", dynCliEnvPrv.ToJavascriptSource(), true);
      }
      if ( dynCliEnvTp.getItemCount() > 0 )
      {
         A723CliEnvTp = (short)(GXutil.lval( dynCliEnvTp.getValidValue(GXutil.trim( GXutil.str( A723CliEnvTp, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A723CliEnvTp", GXutil.ltrimstr( DecimalUtil.doubleToDec(A723CliEnvTp), 4, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         dynCliEnvTp.setValue( GXutil.trim( GXutil.str( A723CliEnvTp, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, dynCliEnvTp.getInternalname(), "Values", dynCliEnvTp.ToJavascriptSource(), true);
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-md-9", "left", "top", "", "", "div");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCliEnvNom_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCliEnvNom_Internalname, httpContext.getMessage( "Nombre", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliEnvNom_Internalname, GXutil.rtrim( A267CliEnvNom), GXutil.rtrim( localUtil.format( A267CliEnvNom, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliEnvNom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCliEnvNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_CLIENV.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCliEnvNm2_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCliEnvNm2_Internalname, httpContext.getMessage( "Nombre (cont)", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliEnvNm2_Internalname, GXutil.rtrim( A5531CliEnvNm2), GXutil.rtrim( localUtil.format( A5531CliEnvNm2, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliEnvNm2_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCliEnvNm2_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_CLIENV.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCliEnvDom_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCliEnvDom_Internalname, httpContext.getMessage( "Direccion ", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 35,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliEnvDom_Internalname, GXutil.rtrim( A265CliEnvDom), GXutil.rtrim( localUtil.format( A265CliEnvDom, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,35);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliEnvDom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCliEnvDom_Enabled, 0, "text", "", 34, "chr", 1, "row", 34, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_CLIENV.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCliEnvDm2_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCliEnvDm2_Internalname, httpContext.getMessage( "Direccion (cont)", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 40,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliEnvDm2_Internalname, GXutil.rtrim( A5530CliEnvDm2), GXutil.rtrim( localUtil.format( A5530CliEnvDm2, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,40);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliEnvDm2_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCliEnvDm2_Enabled, 0, "text", "", 34, "chr", 1, "row", 34, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_CLIENV.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCliEnvPob_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCliEnvPob_Internalname, httpContext.getMessage( "Poblacion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 45,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliEnvPob_Internalname, GXutil.rtrim( A268CliEnvPob), GXutil.rtrim( localUtil.format( A268CliEnvPob, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,45);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliEnvPob_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCliEnvPob_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_CLIENV.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCliEnvCp_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCliEnvCp_Internalname, httpContext.getMessage( "Codigo Postal", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliEnvCp_Internalname, GXutil.rtrim( A264CliEnvCp), GXutil.rtrim( localUtil.format( A264CliEnvCp, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,53);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliEnvCp_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCliEnvCp_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_CLIENV.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCliEnvCp2_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCliEnvCp2_Internalname, httpContext.getMessage( "Codigo Postal (cont)", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 57,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliEnvCp2_Internalname, GXutil.rtrim( A10775CliEnvCp2), GXutil.rtrim( localUtil.format( A10775CliEnvCp2, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,57);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliEnvCp2_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCliEnvCp2_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_CLIENV.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+dynCliEnvPrv.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, dynCliEnvPrv.getInternalname(), httpContext.getMessage( "Provincia", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 65,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, dynCliEnvPrv, dynCliEnvPrv.getInternalname(), GXutil.trim( GXutil.str( A270CliEnvPrv, 3, 0)), 1, dynCliEnvPrv.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", 1, dynCliEnvPrv.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,65);\"", "", true, (byte)(0), "HLP_CLIENV.htm");
      dynCliEnvPrv.setValue( GXutil.trim( GXutil.str( A270CliEnvPrv, 3, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, dynCliEnvPrv.getInternalname(), "Values", dynCliEnvPrv.ToJavascriptSource(), true);
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCliEnvMail_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCliEnvMail_Internalname, httpContext.getMessage( "Mail", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 73,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliEnvMail_Internalname, GXutil.rtrim( A10051CliEnvMail), GXutil.rtrim( localUtil.format( A10051CliEnvMail, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,73);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliEnvMail_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCliEnvMail_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_CLIENV.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCliEnvFx_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCliEnvFx_Internalname, httpContext.getMessage( "Fax", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 78,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliEnvFx_Internalname, GXutil.rtrim( A10052CliEnvFx), GXutil.rtrim( localUtil.format( A10052CliEnvFx, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,78);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliEnvFx_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCliEnvFx_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_CLIENV.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCliEnvAg_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCliEnvAg_Internalname, httpContext.getMessage( "Agencia?", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliEnvAg_Internalname, GXutil.rtrim( A689CliEnvAg), GXutil.rtrim( localUtil.format( A689CliEnvAg, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,86);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliEnvAg_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCliEnvAg_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_CLIENV.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+dynCliEnvTp.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, dynCliEnvTp.getInternalname(), httpContext.getMessage( "Transportista", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 90,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, dynCliEnvTp, dynCliEnvTp.getInternalname(), GXutil.trim( GXutil.str( A723CliEnvTp, 4, 0)), 1, dynCliEnvTp.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", 1, dynCliEnvTp.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,90);\"", "", true, (byte)(0), "HLP_CLIENV.htm");
      dynCliEnvTp.setValue( GXutil.trim( GXutil.str( A723CliEnvTp, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, dynCliEnvTp.getInternalname(), "Values", dynCliEnvTp.ToJavascriptSource(), true);
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 95,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_CLIENV.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 97,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_CLIENV.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 99,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_CLIENV.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV20Pgmname), GXutil.rtrim( localUtil.format( AV20Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_CLIENV.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 107,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,107);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", edtEmprCod_Visible, edtEmprCod_Enabled, 1, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_CLIENV.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 108,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,108);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "Attribute", "", "", "", "", edtCliCod_Visible, edtCliCod_Enabled, 1, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_CLIENV.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 109,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliEnvLin_Internalname, GXutil.ltrim( localUtil.ntoc( A266CliEnvLin, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A266CliEnvLin), "9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,109);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliEnvLin_Jsonclick, 0, "Attribute", "", "", "", "", edtCliEnvLin_Visible, edtCliEnvLin_Enabled, 1, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_CLIENV.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliEnvNmt_Internalname, GXutil.rtrim( A693CliEnvNmt), GXutil.rtrim( localUtil.format( A693CliEnvNmt, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliEnvNmt_Jsonclick, 0, "Attribute", "", "", "", "", edtCliEnvNmt_Visible, edtCliEnvNmt_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_CLIENV.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliEnvPrn_Internalname, GXutil.rtrim( A269CliEnvPrn), GXutil.rtrim( localUtil.format( A269CliEnvPrn, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliEnvPrn_Jsonclick, 0, "Attribute", "", "", "", "", edtCliEnvPrn_Visible, edtCliEnvPrn_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_CLIENV.htm");
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
      e111Q82 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z252CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z266CliEnvLin = (byte)(localUtil.ctol( httpContext.cgiGet( "Z266CliEnvLin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z267CliEnvNom = httpContext.cgiGet( "Z267CliEnvNom") ;
            Z5531CliEnvNm2 = httpContext.cgiGet( "Z5531CliEnvNm2") ;
            Z265CliEnvDom = httpContext.cgiGet( "Z265CliEnvDom") ;
            Z5530CliEnvDm2 = httpContext.cgiGet( "Z5530CliEnvDm2") ;
            Z268CliEnvPob = httpContext.cgiGet( "Z268CliEnvPob") ;
            Z264CliEnvCp = httpContext.cgiGet( "Z264CliEnvCp") ;
            Z10775CliEnvCp2 = httpContext.cgiGet( "Z10775CliEnvCp2") ;
            Z689CliEnvAg = httpContext.cgiGet( "Z689CliEnvAg") ;
            Z723CliEnvTp = (short)(localUtil.ctol( httpContext.cgiGet( "Z723CliEnvTp"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z10051CliEnvMail = httpContext.cgiGet( "Z10051CliEnvMail") ;
            Z10052CliEnvFx = httpContext.cgiGet( "Z10052CliEnvFx") ;
            Z270CliEnvPrv = (short)(localUtil.ctol( httpContext.cgiGet( "Z270CliEnvPrv"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            N270CliEnvPrv = (short)(localUtil.ctol( httpContext.cgiGet( "N270CliEnvPrv"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV7EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            AV8CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "vCLICOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV9CliEnvLin = (byte)(localUtil.ctol( httpContext.cgiGet( "vCLIENVLIN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV13Insert_CliEnvPrv = (short)(localUtil.ctol( httpContext.cgiGet( "vINSERT_CLIENVPRV"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
            A267CliEnvNom = httpContext.cgiGet( edtCliEnvNom_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A267CliEnvNom", A267CliEnvNom);
            A5531CliEnvNm2 = httpContext.cgiGet( edtCliEnvNm2_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5531CliEnvNm2", A5531CliEnvNm2);
            A265CliEnvDom = httpContext.cgiGet( edtCliEnvDom_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A265CliEnvDom", A265CliEnvDom);
            A5530CliEnvDm2 = httpContext.cgiGet( edtCliEnvDm2_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5530CliEnvDm2", A5530CliEnvDm2);
            A268CliEnvPob = httpContext.cgiGet( edtCliEnvPob_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A268CliEnvPob", A268CliEnvPob);
            A264CliEnvCp = httpContext.cgiGet( edtCliEnvCp_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A264CliEnvCp", A264CliEnvCp);
            A10775CliEnvCp2 = httpContext.cgiGet( edtCliEnvCp2_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10775CliEnvCp2", A10775CliEnvCp2);
            dynCliEnvPrv.setValue( httpContext.cgiGet( dynCliEnvPrv.getInternalname()) );
            A270CliEnvPrv = (short)(GXutil.lval( httpContext.cgiGet( dynCliEnvPrv.getInternalname()))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A270CliEnvPrv", GXutil.ltrimstr( DecimalUtil.doubleToDec(A270CliEnvPrv), 3, 0));
            A10051CliEnvMail = httpContext.cgiGet( edtCliEnvMail_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10051CliEnvMail", A10051CliEnvMail);
            A10052CliEnvFx = httpContext.cgiGet( edtCliEnvFx_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10052CliEnvFx", A10052CliEnvFx);
            A689CliEnvAg = httpContext.cgiGet( edtCliEnvAg_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A689CliEnvAg", A689CliEnvAg);
            dynCliEnvTp.setValue( httpContext.cgiGet( dynCliEnvTp.getInternalname()) );
            A723CliEnvTp = (short)(GXutil.lval( httpContext.cgiGet( dynCliEnvTp.getInternalname()))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A723CliEnvTp", GXutil.ltrimstr( DecimalUtil.doubleToDec(A723CliEnvTp), 4, 0));
            AV20Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV20Pgmname", AV20Pgmname);
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CLICOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCliCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A252CliCod = 0 ;
               n252CliCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            }
            else
            {
               A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n252CliCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCliEnvLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCliEnvLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CLIENVLIN");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCliEnvLin_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A266CliEnvLin = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A266CliEnvLin", GXutil.str( A266CliEnvLin, 1, 0));
            }
            else
            {
               A266CliEnvLin = (byte)(localUtil.ctol( httpContext.cgiGet( edtCliEnvLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A266CliEnvLin", GXutil.str( A266CliEnvLin, 1, 0));
            }
            A693CliEnvNmt = httpContext.cgiGet( edtCliEnvNmt_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A693CliEnvNmt", A693CliEnvNmt);
            A269CliEnvPrn = GXutil.upper( httpContext.cgiGet( edtCliEnvPrn_Internalname)) ;
            n269CliEnvPrn = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A269CliEnvPrn", A269CliEnvPrn);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"CLIENV");
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            AV20Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV20Pgmname", AV20Pgmname);
            forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV20Pgmname, "")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( A266CliEnvLin != Z266CliEnvLin ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("clienv:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
               n252CliCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
               A266CliEnvLin = (byte)(GXutil.lval( httpContext.GetPar( "CliEnvLin"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A266CliEnvLin", GXutil.str( A266CliEnvLin, 1, 0));
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
                  sMode22 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  Gx_mode = sMode22 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound22 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_1Q80( ) ;
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
                        e111Q82 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e121Q82 ();
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
         e121Q82 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll1Q822( ) ;
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
         disableAttributes1Q822( ) ;
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

   public void confirm_1Q80( )
   {
      beforeValidate1Q822( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1Q822( ) ;
         }
         else
         {
            checkExtendedTable1Q822( ) ;
            closeExtendedTableCursors1Q822( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
   }

   public void resetCaption1Q80( )
   {
   }

   public void e111Q82( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV15Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      clienv_impl.this.GXt_char1 = GXv_char2[0] ;
      AV15Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15Station", AV15Station);
      GXv_char2[0] = AV7EmprCod ;
      GXv_char3[0] = AV16EmprNom ;
      GXv_char4[0] = AV17UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV15Station, GXv_char2, GXv_char3, GXv_char4) ;
      clienv_impl.this.AV7EmprCod = GXv_char2[0] ;
      clienv_impl.this.AV16EmprNom = GXv_char3[0] ;
      clienv_impl.this.AV17UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV16EmprNom", AV16EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
      GXt_char1 = AV15Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      clienv_impl.this.GXt_char1 = GXv_char4[0] ;
      AV15Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15Station", AV15Station);
      GXv_char4[0] = AV7EmprCod ;
      GXv_char3[0] = AV16EmprNom ;
      GXv_char2[0] = AV17UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV15Station, GXv_char4, GXv_char3, GXv_char2) ;
      clienv_impl.this.AV7EmprCod = GXv_char4[0] ;
      clienv_impl.this.AV16EmprNom = GXv_char3[0] ;
      clienv_impl.this.AV17UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV16EmprNom", AV16EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
      GXv_SdtWWPContext5[0] = AV10WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext5) ;
      AV10WWPContext = GXv_SdtWWPContext5[0] ;
      AV11TrnContext.fromxml(AV12WebSession.getValue("TrnContext"), null, null);
      if ( ( GXutil.strcmp(AV11TrnContext.getgxTv_SdtWWPTransactionContext_Transactionname(), AV20Pgmname) == 0 ) && ( GXutil.strcmp(Gx_mode, "INS") == 0 ) )
      {
         AV21GXV1 = 1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV21GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21GXV1), 8, 0));
         while ( AV21GXV1 <= AV11TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().size() )
         {
            AV14TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)((app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)AV11TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().elementAt(-1+AV21GXV1));
            if ( GXutil.strcmp(AV14TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "CliEnvPrv") == 0 )
            {
               AV13Insert_CliEnvPrv = (short)(GXutil.lval( AV14TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue())) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV13Insert_CliEnvPrv", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13Insert_CliEnvPrv), 3, 0));
            }
            AV21GXV1 = (int)(AV21GXV1+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV21GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21GXV1), 8, 0));
         }
      }
      edtEmprCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Visible), 5, 0), true);
      edtCliCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Visible), 5, 0), true);
      edtCliEnvLin_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliEnvLin_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliEnvLin_Visible), 5, 0), true);
      edtCliEnvNmt_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliEnvNmt_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliEnvNmt_Visible), 5, 0), true);
      edtCliEnvPrn_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliEnvPrn_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliEnvPrn_Visible), 5, 0), true);
   }

   public void e121Q82( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV11TrnContext.getgxTv_SdtWWPTransactionContext_Callerondelete() )
      {
         callWebObject(formatLink("app.clienvww", new String[] {}, new String[] {}) );
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

   public void zm1Q822( int GX_JID )
   {
      if ( ( GX_JID == 18 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z267CliEnvNom = T01Q83_A267CliEnvNom[0] ;
            Z5531CliEnvNm2 = T01Q83_A5531CliEnvNm2[0] ;
            Z265CliEnvDom = T01Q83_A265CliEnvDom[0] ;
            Z5530CliEnvDm2 = T01Q83_A5530CliEnvDm2[0] ;
            Z268CliEnvPob = T01Q83_A268CliEnvPob[0] ;
            Z264CliEnvCp = T01Q83_A264CliEnvCp[0] ;
            Z10775CliEnvCp2 = T01Q83_A10775CliEnvCp2[0] ;
            Z689CliEnvAg = T01Q83_A689CliEnvAg[0] ;
            Z723CliEnvTp = T01Q83_A723CliEnvTp[0] ;
            Z10051CliEnvMail = T01Q83_A10051CliEnvMail[0] ;
            Z10052CliEnvFx = T01Q83_A10052CliEnvFx[0] ;
            Z270CliEnvPrv = T01Q83_A270CliEnvPrv[0] ;
         }
         else
         {
            Z267CliEnvNom = A267CliEnvNom ;
            Z5531CliEnvNm2 = A5531CliEnvNm2 ;
            Z265CliEnvDom = A265CliEnvDom ;
            Z5530CliEnvDm2 = A5530CliEnvDm2 ;
            Z268CliEnvPob = A268CliEnvPob ;
            Z264CliEnvCp = A264CliEnvCp ;
            Z10775CliEnvCp2 = A10775CliEnvCp2 ;
            Z689CliEnvAg = A689CliEnvAg ;
            Z723CliEnvTp = A723CliEnvTp ;
            Z10051CliEnvMail = A10051CliEnvMail ;
            Z10052CliEnvFx = A10052CliEnvFx ;
            Z270CliEnvPrv = A270CliEnvPrv ;
         }
      }
      if ( GX_JID == -18 )
      {
         Z266CliEnvLin = A266CliEnvLin ;
         Z267CliEnvNom = A267CliEnvNom ;
         Z5531CliEnvNm2 = A5531CliEnvNm2 ;
         Z265CliEnvDom = A265CliEnvDom ;
         Z5530CliEnvDm2 = A5530CliEnvDm2 ;
         Z268CliEnvPob = A268CliEnvPob ;
         Z264CliEnvCp = A264CliEnvCp ;
         Z10775CliEnvCp2 = A10775CliEnvCp2 ;
         Z689CliEnvAg = A689CliEnvAg ;
         Z723CliEnvTp = A723CliEnvTp ;
         Z10051CliEnvMail = A10051CliEnvMail ;
         Z10052CliEnvFx = A10052CliEnvFx ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z270CliEnvPrv = A270CliEnvPrv ;
         Z269CliEnvPrn = A269CliEnvPrn ;
      }
   }

   public void standaloneNotModal( )
   {
      AV20Pgmname = "CLIENV" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20Pgmname", AV20Pgmname);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      gxaclienvtp_html1Q822( AV7EmprCod) ;
      if ( ! (GXutil.strcmp("", AV7EmprCod)==0) )
      {
         A396EmprCod = AV7EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      if ( ! (GXutil.strcmp("", AV7EmprCod)==0) )
      {
         edtEmprCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      }
      else
      {
         edtEmprCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      }
      if ( ! (GXutil.strcmp("", AV7EmprCod)==0) )
      {
         edtEmprCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      }
      if ( ! (0==AV8CliCod) )
      {
         A252CliCod = AV8CliCod ;
         n252CliCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      }
      if ( ! (0==AV8CliCod) )
      {
         edtCliCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      }
      else
      {
         edtCliCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      }
      if ( ! (0==AV8CliCod) )
      {
         edtCliCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      }
      if ( ! (0==AV9CliEnvLin) )
      {
         A266CliEnvLin = AV9CliEnvLin ;
         httpContext.ajax_rsp_assign_attri("", false, "A266CliEnvLin", GXutil.str( A266CliEnvLin, 1, 0));
      }
      if ( ! (0==AV9CliEnvLin) )
      {
         edtCliEnvLin_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCliEnvLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliEnvLin_Enabled), 5, 0), true);
      }
      else
      {
         edtCliEnvLin_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCliEnvLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliEnvLin_Enabled), 5, 0), true);
      }
      if ( ! (0==AV9CliEnvLin) )
      {
         edtCliEnvLin_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCliEnvLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliEnvLin_Enabled), 5, 0), true);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV13Insert_CliEnvPrv) )
      {
         dynCliEnvPrv.setEnabled( 0 );
         httpContext.ajax_rsp_assign_prop("", false, dynCliEnvPrv.getInternalname(), "Enabled", GXutil.ltrimstr( dynCliEnvPrv.getEnabled(), 5, 0), true);
      }
      else
      {
         dynCliEnvPrv.setEnabled( 1 );
         httpContext.ajax_rsp_assign_prop("", false, dynCliEnvPrv.getInternalname(), "Enabled", GXutil.ltrimstr( dynCliEnvPrv.getEnabled(), 5, 0), true);
      }
   }

   public void standaloneModal( )
   {
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV13Insert_CliEnvPrv) )
      {
         A270CliEnvPrv = AV13Insert_CliEnvPrv ;
         httpContext.ajax_rsp_assign_attri("", false, "A270CliEnvPrv", GXutil.ltrimstr( DecimalUtil.doubleToDec(A270CliEnvPrv), 3, 0));
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
      if ( isIns( )  && (GXutil.strcmp("", A689CliEnvAg)==0) && ( Gx_BScreen == 0 ) )
      {
         A689CliEnvAg = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
         httpContext.ajax_rsp_assign_attri("", false, "A689CliEnvAg", A689CliEnvAg);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ( Gx_BScreen == 0 ) )
      {
         GXt_char1 = A693CliEnvNmt ;
         GXv_char4[0] = A396EmprCod ;
         GXv_int6[0] = A723CliEnvTp ;
         GXv_char3[0] = GXt_char1 ;
         new app.ptrnnom(remoteHandle, context).execute( GXv_char4, GXv_int6, GXv_char3) ;
         clienv_impl.this.A396EmprCod = GXv_char4[0] ;
         clienv_impl.this.A723CliEnvTp = GXv_int6[0] ;
         clienv_impl.this.GXt_char1 = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A723CliEnvTp", GXutil.ltrimstr( DecimalUtil.doubleToDec(A723CliEnvTp), 4, 0));
         A693CliEnvNmt = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "A693CliEnvNmt", A693CliEnvNmt);
         /* Using cursor T01Q85 */
         pr_default.execute(3, new Object[] {Short.valueOf(A270CliEnvPrv)});
         A269CliEnvPrn = T01Q85_A269CliEnvPrn[0] ;
         n269CliEnvPrn = T01Q85_n269CliEnvPrn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A269CliEnvPrn", A269CliEnvPrn);
         pr_default.close(3);
      }
   }

   public void load1Q822( )
   {
      /* Using cursor T01Q86 */
      pr_default.execute(4, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Byte.valueOf(A266CliEnvLin)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound22 = (short)(1) ;
         A267CliEnvNom = T01Q86_A267CliEnvNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A267CliEnvNom", A267CliEnvNom);
         A5531CliEnvNm2 = T01Q86_A5531CliEnvNm2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5531CliEnvNm2", A5531CliEnvNm2);
         A265CliEnvDom = T01Q86_A265CliEnvDom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A265CliEnvDom", A265CliEnvDom);
         A5530CliEnvDm2 = T01Q86_A5530CliEnvDm2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5530CliEnvDm2", A5530CliEnvDm2);
         A268CliEnvPob = T01Q86_A268CliEnvPob[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A268CliEnvPob", A268CliEnvPob);
         A264CliEnvCp = T01Q86_A264CliEnvCp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A264CliEnvCp", A264CliEnvCp);
         A10775CliEnvCp2 = T01Q86_A10775CliEnvCp2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10775CliEnvCp2", A10775CliEnvCp2);
         A269CliEnvPrn = T01Q86_A269CliEnvPrn[0] ;
         n269CliEnvPrn = T01Q86_n269CliEnvPrn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A269CliEnvPrn", A269CliEnvPrn);
         A689CliEnvAg = T01Q86_A689CliEnvAg[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A689CliEnvAg", A689CliEnvAg);
         A723CliEnvTp = T01Q86_A723CliEnvTp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A723CliEnvTp", GXutil.ltrimstr( DecimalUtil.doubleToDec(A723CliEnvTp), 4, 0));
         A10051CliEnvMail = T01Q86_A10051CliEnvMail[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10051CliEnvMail", A10051CliEnvMail);
         A10052CliEnvFx = T01Q86_A10052CliEnvFx[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10052CliEnvFx", A10052CliEnvFx);
         A270CliEnvPrv = T01Q86_A270CliEnvPrv[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A270CliEnvPrv", GXutil.ltrimstr( DecimalUtil.doubleToDec(A270CliEnvPrv), 3, 0));
         zm1Q822( -18) ;
      }
      pr_default.close(4);
      onLoadActions1Q822( ) ;
   }

   public void onLoadActions1Q822( )
   {
      GXt_char1 = A693CliEnvNmt ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int6[0] = A723CliEnvTp ;
      GXv_char3[0] = GXt_char1 ;
      new app.ptrnnom(remoteHandle, context).execute( GXv_char4, GXv_int6, GXv_char3) ;
      clienv_impl.this.A396EmprCod = GXv_char4[0] ;
      clienv_impl.this.A723CliEnvTp = GXv_int6[0] ;
      clienv_impl.this.GXt_char1 = GXv_char3[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A723CliEnvTp", GXutil.ltrimstr( DecimalUtil.doubleToDec(A723CliEnvTp), 4, 0));
      A693CliEnvNmt = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A693CliEnvNmt", A693CliEnvNmt);
   }

   public void checkExtendedTable1Q822( )
   {
      nIsDirty_22 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      nIsDirty_22 = (short)(1) ;
      GXt_char1 = A693CliEnvNmt ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int6[0] = A723CliEnvTp ;
      GXv_char3[0] = GXt_char1 ;
      new app.ptrnnom(remoteHandle, context).execute( GXv_char4, GXv_int6, GXv_char3) ;
      clienv_impl.this.A396EmprCod = GXv_char4[0] ;
      clienv_impl.this.A723CliEnvTp = GXv_int6[0] ;
      clienv_impl.this.GXt_char1 = GXv_char3[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A723CliEnvTp", GXutil.ltrimstr( DecimalUtil.doubleToDec(A723CliEnvTp), 4, 0));
      A693CliEnvNmt = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A693CliEnvNmt", A693CliEnvNmt);
      /* Using cursor T01Q84 */
      pr_default.execute(2, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(2);
      /* Using cursor T01Q85 */
      pr_default.execute(3, new Object[] {Short.valueOf(A270CliEnvPrv)});
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CliEnv", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLIENVPRV");
         AnyError = (short)(1) ;
         GX_FocusControl = dynCliEnvPrv.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A269CliEnvPrn = T01Q85_A269CliEnvPrn[0] ;
      n269CliEnvPrn = T01Q85_n269CliEnvPrn[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A269CliEnvPrn", A269CliEnvPrn);
      pr_default.close(3);
   }

   public void closeExtendedTableCursors1Q822( )
   {
      pr_default.close(2);
      pr_default.close(3);
   }

   public void enableDisable( )
   {
   }

   public void gxload_19( String A396EmprCod ,
                          int A252CliCod )
   {
      /* Using cursor T01Q87 */
      pr_default.execute(5, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_default.getStatus(5) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(5);
   }

   public void gxload_20( short A270CliEnvPrv )
   {
      /* Using cursor T01Q88 */
      pr_default.execute(6, new Object[] {Short.valueOf(A270CliEnvPrv)});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CliEnv", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLIENVPRV");
         AnyError = (short)(1) ;
         GX_FocusControl = dynCliEnvPrv.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A269CliEnvPrn = T01Q88_A269CliEnvPrn[0] ;
      n269CliEnvPrn = T01Q88_n269CliEnvPrn[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A269CliEnvPrn", A269CliEnvPrn);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A269CliEnvPrn))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(6) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(6);
   }

   public void getKey1Q822( )
   {
      /* Using cursor T01Q89 */
      pr_default.execute(7, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Byte.valueOf(A266CliEnvLin)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound22 = (short)(1) ;
      }
      else
      {
         RcdFound22 = (short)(0) ;
      }
      pr_default.close(7);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01Q83 */
      pr_default.execute(1, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Byte.valueOf(A266CliEnvLin)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1Q822( 18) ;
         RcdFound22 = (short)(1) ;
         A266CliEnvLin = T01Q83_A266CliEnvLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A266CliEnvLin", GXutil.str( A266CliEnvLin, 1, 0));
         A267CliEnvNom = T01Q83_A267CliEnvNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A267CliEnvNom", A267CliEnvNom);
         A5531CliEnvNm2 = T01Q83_A5531CliEnvNm2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5531CliEnvNm2", A5531CliEnvNm2);
         A265CliEnvDom = T01Q83_A265CliEnvDom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A265CliEnvDom", A265CliEnvDom);
         A5530CliEnvDm2 = T01Q83_A5530CliEnvDm2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5530CliEnvDm2", A5530CliEnvDm2);
         A268CliEnvPob = T01Q83_A268CliEnvPob[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A268CliEnvPob", A268CliEnvPob);
         A264CliEnvCp = T01Q83_A264CliEnvCp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A264CliEnvCp", A264CliEnvCp);
         A10775CliEnvCp2 = T01Q83_A10775CliEnvCp2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10775CliEnvCp2", A10775CliEnvCp2);
         A689CliEnvAg = T01Q83_A689CliEnvAg[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A689CliEnvAg", A689CliEnvAg);
         A723CliEnvTp = T01Q83_A723CliEnvTp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A723CliEnvTp", GXutil.ltrimstr( DecimalUtil.doubleToDec(A723CliEnvTp), 4, 0));
         A10051CliEnvMail = T01Q83_A10051CliEnvMail[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10051CliEnvMail", A10051CliEnvMail);
         A10052CliEnvFx = T01Q83_A10052CliEnvFx[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10052CliEnvFx", A10052CliEnvFx);
         A396EmprCod = T01Q83_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = T01Q83_A252CliCod[0] ;
         n252CliCod = T01Q83_n252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A270CliEnvPrv = T01Q83_A270CliEnvPrv[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A270CliEnvPrv", GXutil.ltrimstr( DecimalUtil.doubleToDec(A270CliEnvPrv), 3, 0));
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z266CliEnvLin = A266CliEnvLin ;
         sMode22 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1Q822( ) ;
         if ( AnyError == 1 )
         {
            RcdFound22 = (short)(0) ;
            initializeNonKey1Q822( ) ;
         }
         Gx_mode = sMode22 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound22 = (short)(0) ;
         initializeNonKey1Q822( ) ;
         sMode22 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode22 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1Q822( ) ;
      if ( RcdFound22 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound22 = (short)(0) ;
      /* Using cursor T01Q810 */
      pr_default.execute(8, new Object[] {A396EmprCod, A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A396EmprCod, Byte.valueOf(A266CliEnvLin)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( ( GXutil.strcmp(T01Q810_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01Q810_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01Q810_A252CliCod[0] < A252CliCod ) || ( T01Q810_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01Q810_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01Q810_A266CliEnvLin[0] < A266CliEnvLin ) ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( ( GXutil.strcmp(T01Q810_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01Q810_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01Q810_A252CliCod[0] > A252CliCod ) || ( T01Q810_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01Q810_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01Q810_A266CliEnvLin[0] > A266CliEnvLin ) ) )
         {
            A396EmprCod = T01Q810_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A252CliCod = T01Q810_A252CliCod[0] ;
            n252CliCod = T01Q810_n252CliCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A266CliEnvLin = T01Q810_A266CliEnvLin[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A266CliEnvLin", GXutil.str( A266CliEnvLin, 1, 0));
            RcdFound22 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void move_previous( )
   {
      RcdFound22 = (short)(0) ;
      /* Using cursor T01Q811 */
      pr_default.execute(9, new Object[] {A396EmprCod, A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A396EmprCod, Byte.valueOf(A266CliEnvLin)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T01Q811_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01Q811_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01Q811_A252CliCod[0] > A252CliCod ) || ( T01Q811_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01Q811_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01Q811_A266CliEnvLin[0] > A266CliEnvLin ) ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T01Q811_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01Q811_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01Q811_A252CliCod[0] < A252CliCod ) || ( T01Q811_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01Q811_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01Q811_A266CliEnvLin[0] < A266CliEnvLin ) ) )
         {
            A396EmprCod = T01Q811_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A252CliCod = T01Q811_A252CliCod[0] ;
            n252CliCod = T01Q811_n252CliCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A266CliEnvLin = T01Q811_A266CliEnvLin[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A266CliEnvLin", GXutil.str( A266CliEnvLin, 1, 0));
            RcdFound22 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1Q822( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtCliEnvNom_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1Q822( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound22 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( A266CliEnvLin != Z266CliEnvLin ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A252CliCod = Z252CliCod ;
               n252CliCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
               A266CliEnvLin = Z266CliEnvLin ;
               httpContext.ajax_rsp_assign_attri("", false, "A266CliEnvLin", GXutil.str( A266CliEnvLin, 1, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtCliEnvNom_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               update1Q822( ) ;
               GX_FocusControl = edtCliEnvNom_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( A266CliEnvLin != Z266CliEnvLin ) )
            {
               /* Insert record */
               GX_FocusControl = edtCliEnvNom_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1Q822( ) ;
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
                  GX_FocusControl = edtCliEnvNom_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1Q822( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( A266CliEnvLin != Z266CliEnvLin ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = Z252CliCod ;
         n252CliCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A266CliEnvLin = Z266CliEnvLin ;
         httpContext.ajax_rsp_assign_attri("", false, "A266CliEnvLin", GXutil.str( A266CliEnvLin, 1, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtCliEnvNom_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency1Q822( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01Q82 */
         pr_default.execute(0, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Byte.valueOf(A266CliEnvLin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCLIENV"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z267CliEnvNom, T01Q82_A267CliEnvNom[0]) != 0 ) || ( GXutil.strcmp(Z5531CliEnvNm2, T01Q82_A5531CliEnvNm2[0]) != 0 ) || ( GXutil.strcmp(Z265CliEnvDom, T01Q82_A265CliEnvDom[0]) != 0 ) || ( GXutil.strcmp(Z5530CliEnvDm2, T01Q82_A5530CliEnvDm2[0]) != 0 ) || ( GXutil.strcmp(Z268CliEnvPob, T01Q82_A268CliEnvPob[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z264CliEnvCp, T01Q82_A264CliEnvCp[0]) != 0 ) || ( GXutil.strcmp(Z10775CliEnvCp2, T01Q82_A10775CliEnvCp2[0]) != 0 ) || ( GXutil.strcmp(Z689CliEnvAg, T01Q82_A689CliEnvAg[0]) != 0 ) || ( Z723CliEnvTp != T01Q82_A723CliEnvTp[0] ) || ( GXutil.strcmp(Z10051CliEnvMail, T01Q82_A10051CliEnvMail[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z10052CliEnvFx, T01Q82_A10052CliEnvFx[0]) != 0 ) || ( Z270CliEnvPrv != T01Q82_A270CliEnvPrv[0] ) )
         {
            if ( GXutil.strcmp(Z267CliEnvNom, T01Q82_A267CliEnvNom[0]) != 0 )
            {
               GXutil.writeLogln("clienv:[seudo value changed for attri]"+"CliEnvNom");
               GXutil.writeLogRaw("Old: ",Z267CliEnvNom);
               GXutil.writeLogRaw("Current: ",T01Q82_A267CliEnvNom[0]);
            }
            if ( GXutil.strcmp(Z5531CliEnvNm2, T01Q82_A5531CliEnvNm2[0]) != 0 )
            {
               GXutil.writeLogln("clienv:[seudo value changed for attri]"+"CliEnvNm2");
               GXutil.writeLogRaw("Old: ",Z5531CliEnvNm2);
               GXutil.writeLogRaw("Current: ",T01Q82_A5531CliEnvNm2[0]);
            }
            if ( GXutil.strcmp(Z265CliEnvDom, T01Q82_A265CliEnvDom[0]) != 0 )
            {
               GXutil.writeLogln("clienv:[seudo value changed for attri]"+"CliEnvDom");
               GXutil.writeLogRaw("Old: ",Z265CliEnvDom);
               GXutil.writeLogRaw("Current: ",T01Q82_A265CliEnvDom[0]);
            }
            if ( GXutil.strcmp(Z5530CliEnvDm2, T01Q82_A5530CliEnvDm2[0]) != 0 )
            {
               GXutil.writeLogln("clienv:[seudo value changed for attri]"+"CliEnvDm2");
               GXutil.writeLogRaw("Old: ",Z5530CliEnvDm2);
               GXutil.writeLogRaw("Current: ",T01Q82_A5530CliEnvDm2[0]);
            }
            if ( GXutil.strcmp(Z268CliEnvPob, T01Q82_A268CliEnvPob[0]) != 0 )
            {
               GXutil.writeLogln("clienv:[seudo value changed for attri]"+"CliEnvPob");
               GXutil.writeLogRaw("Old: ",Z268CliEnvPob);
               GXutil.writeLogRaw("Current: ",T01Q82_A268CliEnvPob[0]);
            }
            if ( GXutil.strcmp(Z264CliEnvCp, T01Q82_A264CliEnvCp[0]) != 0 )
            {
               GXutil.writeLogln("clienv:[seudo value changed for attri]"+"CliEnvCp");
               GXutil.writeLogRaw("Old: ",Z264CliEnvCp);
               GXutil.writeLogRaw("Current: ",T01Q82_A264CliEnvCp[0]);
            }
            if ( GXutil.strcmp(Z10775CliEnvCp2, T01Q82_A10775CliEnvCp2[0]) != 0 )
            {
               GXutil.writeLogln("clienv:[seudo value changed for attri]"+"CliEnvCp2");
               GXutil.writeLogRaw("Old: ",Z10775CliEnvCp2);
               GXutil.writeLogRaw("Current: ",T01Q82_A10775CliEnvCp2[0]);
            }
            if ( GXutil.strcmp(Z689CliEnvAg, T01Q82_A689CliEnvAg[0]) != 0 )
            {
               GXutil.writeLogln("clienv:[seudo value changed for attri]"+"CliEnvAg");
               GXutil.writeLogRaw("Old: ",Z689CliEnvAg);
               GXutil.writeLogRaw("Current: ",T01Q82_A689CliEnvAg[0]);
            }
            if ( Z723CliEnvTp != T01Q82_A723CliEnvTp[0] )
            {
               GXutil.writeLogln("clienv:[seudo value changed for attri]"+"CliEnvTp");
               GXutil.writeLogRaw("Old: ",Z723CliEnvTp);
               GXutil.writeLogRaw("Current: ",T01Q82_A723CliEnvTp[0]);
            }
            if ( GXutil.strcmp(Z10051CliEnvMail, T01Q82_A10051CliEnvMail[0]) != 0 )
            {
               GXutil.writeLogln("clienv:[seudo value changed for attri]"+"CliEnvMail");
               GXutil.writeLogRaw("Old: ",Z10051CliEnvMail);
               GXutil.writeLogRaw("Current: ",T01Q82_A10051CliEnvMail[0]);
            }
            if ( GXutil.strcmp(Z10052CliEnvFx, T01Q82_A10052CliEnvFx[0]) != 0 )
            {
               GXutil.writeLogln("clienv:[seudo value changed for attri]"+"CliEnvFx");
               GXutil.writeLogRaw("Old: ",Z10052CliEnvFx);
               GXutil.writeLogRaw("Current: ",T01Q82_A10052CliEnvFx[0]);
            }
            if ( Z270CliEnvPrv != T01Q82_A270CliEnvPrv[0] )
            {
               GXutil.writeLogln("clienv:[seudo value changed for attri]"+"CliEnvPrv");
               GXutil.writeLogRaw("Old: ",Z270CliEnvPrv);
               GXutil.writeLogRaw("Current: ",T01Q82_A270CliEnvPrv[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCLIENV"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1Q822( )
   {
      beforeValidate1Q822( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1Q822( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1Q822( 0) ;
         checkOptimisticConcurrency1Q822( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1Q822( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1Q822( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01Q812 */
                  pr_default.execute(10, new Object[] {Byte.valueOf(A266CliEnvLin), A267CliEnvNom, A5531CliEnvNm2, A265CliEnvDom, A5530CliEnvDm2, A268CliEnvPob, A264CliEnvCp, A10775CliEnvCp2, A689CliEnvAg, Short.valueOf(A723CliEnvTp), A10051CliEnvMail, A10052CliEnvFx, A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Short.valueOf(A270CliEnvPrv)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCLIENV");
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
                        resetCaption1Q80( ) ;
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
            load1Q822( ) ;
         }
         endLevel1Q822( ) ;
      }
      closeExtendedTableCursors1Q822( ) ;
   }

   public void update1Q822( )
   {
      beforeValidate1Q822( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1Q822( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1Q822( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1Q822( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1Q822( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01Q813 */
                  pr_default.execute(11, new Object[] {A267CliEnvNom, A5531CliEnvNm2, A265CliEnvDom, A5530CliEnvDm2, A268CliEnvPob, A264CliEnvCp, A10775CliEnvCp2, A689CliEnvAg, Short.valueOf(A723CliEnvTp), A10051CliEnvMail, A10052CliEnvFx, Short.valueOf(A270CliEnvPrv), A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Byte.valueOf(A266CliEnvLin)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCLIENV");
                  if ( (pr_default.getStatus(11) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCLIENV"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1Q822( ) ;
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
         endLevel1Q822( ) ;
      }
      closeExtendedTableCursors1Q822( ) ;
   }

   public void deferredUpdate1Q822( )
   {
   }

   public void delete( )
   {
      beforeValidate1Q822( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1Q822( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1Q822( ) ;
         afterConfirm1Q822( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1Q822( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01Q814 */
               pr_default.execute(12, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Byte.valueOf(A266CliEnvLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCLIENV");
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
      sMode22 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1Q822( ) ;
      Gx_mode = sMode22 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1Q822( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01Q815 */
         pr_default.execute(13, new Object[] {Short.valueOf(A270CliEnvPrv)});
         A269CliEnvPrn = T01Q815_A269CliEnvPrn[0] ;
         n269CliEnvPrn = T01Q815_n269CliEnvPrn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A269CliEnvPrn", A269CliEnvPrn);
         pr_default.close(13);
         GXt_char1 = A693CliEnvNmt ;
         GXv_char4[0] = A396EmprCod ;
         GXv_int6[0] = A723CliEnvTp ;
         GXv_char3[0] = GXt_char1 ;
         new app.ptrnnom(remoteHandle, context).execute( GXv_char4, GXv_int6, GXv_char3) ;
         clienv_impl.this.A396EmprCod = GXv_char4[0] ;
         clienv_impl.this.A723CliEnvTp = GXv_int6[0] ;
         clienv_impl.this.GXt_char1 = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A723CliEnvTp", GXutil.ltrimstr( DecimalUtil.doubleToDec(A723CliEnvTp), 4, 0));
         A693CliEnvNmt = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "A693CliEnvNmt", A693CliEnvNmt);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T01Q816 */
         pr_default.execute(14, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Byte.valueOf(A266CliEnvLin)});
         if ( (pr_default.getStatus(14) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBTRA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(14);
         /* Using cursor T01Q817 */
         pr_default.execute(15, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Byte.valueOf(A266CliEnvLin)});
         if ( (pr_default.getStatus(15) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DEVGEH", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(15);
      }
   }

   public void endLevel1Q822( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1Q822( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "clienv");
         if ( AnyError == 0 )
         {
            confirmValues1Q80( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "clienv");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1Q822( )
   {
      /* Scan By routine */
      /* Using cursor T01Q818 */
      pr_default.execute(16);
      RcdFound22 = (short)(0) ;
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound22 = (short)(1) ;
         A396EmprCod = T01Q818_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = T01Q818_A252CliCod[0] ;
         n252CliCod = T01Q818_n252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A266CliEnvLin = T01Q818_A266CliEnvLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A266CliEnvLin", GXutil.str( A266CliEnvLin, 1, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1Q822( )
   {
      /* Scan next routine */
      pr_default.readNext(16);
      RcdFound22 = (short)(0) ;
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound22 = (short)(1) ;
         A396EmprCod = T01Q818_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = T01Q818_A252CliCod[0] ;
         n252CliCod = T01Q818_n252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A266CliEnvLin = T01Q818_A266CliEnvLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A266CliEnvLin", GXutil.str( A266CliEnvLin, 1, 0));
      }
   }

   public void scanEnd1Q822( )
   {
      pr_default.close(16);
   }

   public void afterConfirm1Q822( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1Q822( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1Q822( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1Q822( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1Q822( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1Q822( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1Q822( )
   {
      edtCliEnvNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliEnvNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliEnvNom_Enabled), 5, 0), true);
      edtCliEnvNm2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliEnvNm2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliEnvNm2_Enabled), 5, 0), true);
      edtCliEnvDom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliEnvDom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliEnvDom_Enabled), 5, 0), true);
      edtCliEnvDm2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliEnvDm2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliEnvDm2_Enabled), 5, 0), true);
      edtCliEnvPob_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliEnvPob_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliEnvPob_Enabled), 5, 0), true);
      edtCliEnvCp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliEnvCp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliEnvCp_Enabled), 5, 0), true);
      edtCliEnvCp2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliEnvCp2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliEnvCp2_Enabled), 5, 0), true);
      dynCliEnvPrv.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, dynCliEnvPrv.getInternalname(), "Enabled", GXutil.ltrimstr( dynCliEnvPrv.getEnabled(), 5, 0), true);
      edtCliEnvMail_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliEnvMail_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliEnvMail_Enabled), 5, 0), true);
      edtCliEnvFx_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliEnvFx_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliEnvFx_Enabled), 5, 0), true);
      edtCliEnvAg_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliEnvAg_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliEnvAg_Enabled), 5, 0), true);
      dynCliEnvTp.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, dynCliEnvTp.getInternalname(), "Enabled", GXutil.ltrimstr( dynCliEnvTp.getEnabled(), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtCliEnvLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliEnvLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliEnvLin_Enabled), 5, 0), true);
      edtCliEnvNmt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliEnvNmt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliEnvNmt_Enabled), 5, 0), true);
      edtCliEnvPrn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliEnvPrn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliEnvPrn_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1Q822( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1Q80( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.clienv", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV7EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV8CliCod,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV9CliEnvLin,1,0))}, new String[] {"Gx_mode","EmprCod","CliCod","CliEnvLin"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"CLIENV");
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV20Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("clienv:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z266CliEnvLin", GXutil.ltrim( localUtil.ntoc( Z266CliEnvLin, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z267CliEnvNom", GXutil.rtrim( Z267CliEnvNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5531CliEnvNm2", GXutil.rtrim( Z5531CliEnvNm2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z265CliEnvDom", GXutil.rtrim( Z265CliEnvDom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5530CliEnvDm2", GXutil.rtrim( Z5530CliEnvDm2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z268CliEnvPob", GXutil.rtrim( Z268CliEnvPob));
      app.GxWebStd.gx_hidden_field( httpContext, "Z264CliEnvCp", GXutil.rtrim( Z264CliEnvCp));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10775CliEnvCp2", GXutil.rtrim( Z10775CliEnvCp2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z689CliEnvAg", GXutil.rtrim( Z689CliEnvAg));
      app.GxWebStd.gx_hidden_field( httpContext, "Z723CliEnvTp", GXutil.ltrim( localUtil.ntoc( Z723CliEnvTp, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10051CliEnvMail", GXutil.rtrim( Z10051CliEnvMail));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10052CliEnvFx", GXutil.rtrim( Z10052CliEnvFx));
      app.GxWebStd.gx_hidden_field( httpContext, "Z270CliEnvPrv", GXutil.ltrim( localUtil.ntoc( Z270CliEnvPrv, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "N270CliEnvPrv", GXutil.ltrim( localUtil.ntoc( A270CliEnvPrv, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTRNCONTEXT", AV11TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTRNCONTEXT", AV11TrnContext);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTRNCONTEXT", getSecureSignedToken( "", AV11TrnContext));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV7EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vCLICOD", GXutil.ltrim( localUtil.ntoc( AV8CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV8CliCod), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCLIENVLIN", GXutil.ltrim( localUtil.ntoc( AV9CliEnvLin, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLIENVLIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV9CliEnvLin), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_CLIENVPRV", GXutil.ltrim( localUtil.ntoc( AV13Insert_CliEnvPrv, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.clienv", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV7EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV8CliCod,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV9CliEnvLin,1,0))}, new String[] {"Gx_mode","EmprCod","CliCod","CliEnvLin"})  ;
   }

   public String getPgmname( )
   {
      return "CLIENV" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "CLIENTE: DOMICILIO DE ENVIOS", "") ;
   }

   public void initializeNonKey1Q822( )
   {
      A270CliEnvPrv = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A270CliEnvPrv", GXutil.ltrimstr( DecimalUtil.doubleToDec(A270CliEnvPrv), 3, 0));
      A693CliEnvNmt = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A693CliEnvNmt", A693CliEnvNmt);
      A267CliEnvNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A267CliEnvNom", A267CliEnvNom);
      A5531CliEnvNm2 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A5531CliEnvNm2", A5531CliEnvNm2);
      A265CliEnvDom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A265CliEnvDom", A265CliEnvDom);
      A5530CliEnvDm2 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A5530CliEnvDm2", A5530CliEnvDm2);
      A268CliEnvPob = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A268CliEnvPob", A268CliEnvPob);
      A264CliEnvCp = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A264CliEnvCp", A264CliEnvCp);
      A10775CliEnvCp2 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A10775CliEnvCp2", A10775CliEnvCp2);
      A269CliEnvPrn = "" ;
      n269CliEnvPrn = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A269CliEnvPrn", A269CliEnvPrn);
      A723CliEnvTp = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A723CliEnvTp", GXutil.ltrimstr( DecimalUtil.doubleToDec(A723CliEnvTp), 4, 0));
      A10051CliEnvMail = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A10051CliEnvMail", A10051CliEnvMail);
      A10052CliEnvFx = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A10052CliEnvFx", A10052CliEnvFx);
      A689CliEnvAg = httpContext.getMessage( "N", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "A689CliEnvAg", A689CliEnvAg);
      Z267CliEnvNom = "" ;
      Z5531CliEnvNm2 = "" ;
      Z265CliEnvDom = "" ;
      Z5530CliEnvDm2 = "" ;
      Z268CliEnvPob = "" ;
      Z264CliEnvCp = "" ;
      Z10775CliEnvCp2 = "" ;
      Z689CliEnvAg = "" ;
      Z723CliEnvTp = (short)(0) ;
      Z10051CliEnvMail = "" ;
      Z10052CliEnvFx = "" ;
      Z270CliEnvPrv = (short)(0) ;
   }

   public void initAll1Q822( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A252CliCod = 0 ;
      n252CliCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A266CliEnvLin = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A266CliEnvLin", GXutil.str( A266CliEnvLin, 1, 0));
      initializeNonKey1Q822( ) ;
   }

   public void standaloneModalInsert( )
   {
      A689CliEnvAg = i689CliEnvAg ;
      httpContext.ajax_rsp_assign_attri("", false, "A689CliEnvAg", A689CliEnvAg);
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211685741", true, true);
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
      httpContext.AddJavascriptSource("clienv.js", "?20268211685741", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      edtCliEnvNom_Internalname = "CLIENVNOM" ;
      edtCliEnvNm2_Internalname = "CLIENVNM2" ;
      edtCliEnvDom_Internalname = "CLIENVDOM" ;
      edtCliEnvDm2_Internalname = "CLIENVDM2" ;
      edtCliEnvPob_Internalname = "CLIENVPOB" ;
      edtCliEnvCp_Internalname = "CLIENVCP" ;
      edtCliEnvCp2_Internalname = "CLIENVCP2" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      dynCliEnvPrv.setInternalname( "CLIENVPRV" );
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      divUnnamedtable5_Internalname = "UNNAMEDTABLE5" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      edtCliEnvMail_Internalname = "CLIENVMAIL" ;
      edtCliEnvFx_Internalname = "CLIENVFX" ;
      edtCliEnvAg_Internalname = "CLIENVAG" ;
      dynCliEnvTp.setInternalname( "CLIENVTP" );
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      bttBtntrn_delete_Internalname = "BTNTRN_DELETE" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtEmprCod_Internalname = "EMPRCOD" ;
      edtCliCod_Internalname = "CLICOD" ;
      edtCliEnvLin_Internalname = "CLIENVLIN" ;
      edtCliEnvNmt_Internalname = "CLIENVNMT" ;
      edtCliEnvPrn_Internalname = "CLIENVPRN" ;
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
      Form.setCaption( httpContext.getMessage( "CLIENTE: DOMICILIO DE ENVIOS", "") );
      edtCliEnvPrn_Jsonclick = "" ;
      edtCliEnvPrn_Enabled = 0 ;
      edtCliEnvPrn_Visible = 1 ;
      edtCliEnvNmt_Jsonclick = "" ;
      edtCliEnvNmt_Enabled = 0 ;
      edtCliEnvNmt_Visible = 1 ;
      edtCliEnvLin_Jsonclick = "" ;
      edtCliEnvLin_Enabled = 1 ;
      edtCliEnvLin_Visible = 1 ;
      edtCliCod_Jsonclick = "" ;
      edtCliCod_Enabled = 1 ;
      edtCliCod_Visible = 1 ;
      edtEmprCod_Jsonclick = "" ;
      edtEmprCod_Enabled = 1 ;
      edtEmprCod_Visible = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      bttBtntrn_delete_Enabled = 0 ;
      bttBtntrn_delete_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      dynCliEnvTp.setJsonclick( "" );
      dynCliEnvTp.setEnabled( 1 );
      edtCliEnvAg_Jsonclick = "" ;
      edtCliEnvAg_Enabled = 1 ;
      edtCliEnvFx_Jsonclick = "" ;
      edtCliEnvFx_Enabled = 1 ;
      edtCliEnvMail_Jsonclick = "" ;
      edtCliEnvMail_Enabled = 1 ;
      dynCliEnvPrv.setJsonclick( "" );
      dynCliEnvPrv.setEnabled( 1 );
      edtCliEnvCp2_Jsonclick = "" ;
      edtCliEnvCp2_Enabled = 1 ;
      edtCliEnvCp_Jsonclick = "" ;
      edtCliEnvCp_Enabled = 1 ;
      edtCliEnvPob_Jsonclick = "" ;
      edtCliEnvPob_Enabled = 1 ;
      edtCliEnvDm2_Jsonclick = "" ;
      edtCliEnvDm2_Enabled = 1 ;
      edtCliEnvDom_Jsonclick = "" ;
      edtCliEnvDom_Enabled = 1 ;
      edtCliEnvNm2_Jsonclick = "" ;
      edtCliEnvNm2_Enabled = 1 ;
      edtCliEnvNom_Jsonclick = "" ;
      edtCliEnvNom_Enabled = 1 ;
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

   public void gxdlaclienvprv1Q81( )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxdlaclienvprv_data1Q81( ) ;
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

   public void gxaclienvprv_html1Q81( )
   {
      short gxdynajaxvalue;
      gxdlaclienvprv_data1Q81( ) ;
      gxdynajaxindex = 1 ;
      if ( ! ( gxdyncontrolsrefreshing && httpContext.isAjaxRequest( ) ) )
      {
         dynCliEnvPrv.removeAllItems();
      }
      while ( gxdynajaxindex <= gxdynajaxctrlcodr.getCount() )
      {
         gxdynajaxvalue = (short)(GXutil.lval( gxdynajaxctrlcodr.item(gxdynajaxindex))) ;
         dynCliEnvPrv.addItem(GXutil.trim( GXutil.str( gxdynajaxvalue, 3, 0)), gxdynajaxctrldescr.item(gxdynajaxindex), (short)(0));
         gxdynajaxindex = (int)(gxdynajaxindex+1) ;
      }
   }

   protected void gxdlaclienvprv_data1Q81( )
   {
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      /* Using cursor T01Q819 */
      pr_default.execute(17);
      while ( (pr_default.getStatus(17) != 101) )
      {
         gxdynajaxctrlcodr.add(GXutil.ltrim( localUtil.ntoc( T01Q819_A781PrvCod[0], (byte)(3), (byte)(0), ".", "")));
         gxdynajaxctrldescr.add(GXutil.rtrim( T01Q819_A787PrvDsc[0]));
         pr_default.readNext(17);
      }
      pr_default.close(17);
   }

   public void gxdlaclienvtp1Q822( String AV7EmprCod )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxdlaclienvtp_data1Q822( AV7EmprCod) ;
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

   public void gxaclienvtp_html1Q822( String AV7EmprCod )
   {
      short gxdynajaxvalue;
      gxdlaclienvtp_data1Q822( AV7EmprCod) ;
      gxdynajaxindex = 1 ;
      if ( ! ( gxdyncontrolsrefreshing && httpContext.isAjaxRequest( ) ) )
      {
         dynCliEnvTp.removeAllItems();
      }
      while ( gxdynajaxindex <= gxdynajaxctrlcodr.getCount() )
      {
         gxdynajaxvalue = (short)(GXutil.lval( gxdynajaxctrlcodr.item(gxdynajaxindex))) ;
         dynCliEnvTp.addItem(GXutil.trim( GXutil.str( gxdynajaxvalue, 4, 0)), gxdynajaxctrldescr.item(gxdynajaxindex), (short)(0));
         gxdynajaxindex = (int)(gxdynajaxindex+1) ;
      }
   }

   protected void gxdlaclienvtp_data1Q822( String AV7EmprCod )
   {
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      /* Using cursor T01Q820 */
      pr_default.execute(18, new Object[] {AV7EmprCod});
      while ( (pr_default.getStatus(18) != 101) )
      {
         gxdynajaxctrlcodr.add(GXutil.ltrim( localUtil.ntoc( T01Q820_A840TrnCod[0], (byte)(4), (byte)(0), ".", "")));
         gxdynajaxctrldescr.add(GXutil.rtrim( T01Q820_A841TrnNom[0]));
         pr_default.readNext(18);
      }
      pr_default.close(18);
   }

   public void gx3asaclienvnmt1Q822( String A396EmprCod ,
                                     short A723CliEnvTp )
   {
      GXt_char1 = A693CliEnvNmt ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int6[0] = A723CliEnvTp ;
      GXv_char3[0] = GXt_char1 ;
      new app.ptrnnom(remoteHandle, context).execute( GXv_char4, GXv_int6, GXv_char3) ;
      clienv_impl.this.A396EmprCod = GXv_char4[0] ;
      clienv_impl.this.A723CliEnvTp = GXv_int6[0] ;
      clienv_impl.this.GXt_char1 = GXv_char3[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A723CliEnvTp", GXutil.ltrimstr( DecimalUtil.doubleToDec(A723CliEnvTp), 4, 0));
      A693CliEnvNmt = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A693CliEnvNmt", A693CliEnvNmt);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A693CliEnvNmt))+"\"") ;
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
      dynCliEnvPrv.setName( "CLIENVPRV" );
      dynCliEnvPrv.setWebtags( "" );
      dynCliEnvPrv.removeAllItems();
      /* Using cursor T01Q821 */
      pr_default.execute(19);
      while ( (pr_default.getStatus(19) != 101) )
      {
         dynCliEnvPrv.addItem(GXutil.trim( GXutil.str( T01Q821_A781PrvCod[0], 3, 0)), T01Q821_A787PrvDsc[0], (short)(0));
         pr_default.readNext(19);
      }
      pr_default.close(19);
      if ( dynCliEnvPrv.getItemCount() > 0 )
      {
         A270CliEnvPrv = (short)(GXutil.lval( dynCliEnvPrv.getValidValue(GXutil.trim( GXutil.str( A270CliEnvPrv, 3, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A270CliEnvPrv", GXutil.ltrimstr( DecimalUtil.doubleToDec(A270CliEnvPrv), 3, 0));
      }
      dynCliEnvTp.setName( "CLIENVTP" );
      dynCliEnvTp.setWebtags( "" );
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

   public void valid_Clicod( )
   {
      n252CliCod = false ;
      A723CliEnvTp = (short)(GXutil.lval( dynCliEnvTp.getValue())) ;
      A270CliEnvPrv = (short)(GXutil.lval( dynCliEnvPrv.getValue())) ;
      /* Using cursor T01Q822 */
      pr_default.execute(20, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(20) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      pr_default.close(20);
      dynload_actions( ) ;
      /*  Sending validation outputs */
   }

   public void valid_Clienvprv( )
   {
      A723CliEnvTp = (short)(GXutil.lval( dynCliEnvTp.getValue())) ;
      A270CliEnvPrv = (short)(GXutil.lval( dynCliEnvPrv.getValue())) ;
      n269CliEnvPrn = false ;
      /* Using cursor T01Q815 */
      pr_default.execute(13, new Object[] {Short.valueOf(A270CliEnvPrv)});
      if ( (pr_default.getStatus(13) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CliEnv", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLIENVPRV");
         AnyError = (short)(1) ;
         GX_FocusControl = dynCliEnvPrv.getInternalname() ;
      }
      A269CliEnvPrn = T01Q815_A269CliEnvPrn[0] ;
      n269CliEnvPrn = T01Q815_n269CliEnvPrn[0] ;
      pr_default.close(13);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A269CliEnvPrn", GXutil.rtrim( A269CliEnvPrn));
   }

   public void valid_Clienvtp( )
   {
      A723CliEnvTp = (short)(GXutil.lval( dynCliEnvTp.getValue())) ;
      A270CliEnvPrv = (short)(GXutil.lval( dynCliEnvPrv.getValue())) ;
      GXt_char1 = A693CliEnvNmt ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int6[0] = A723CliEnvTp ;
      GXv_char3[0] = GXt_char1 ;
      new app.ptrnnom(remoteHandle, context).execute( GXv_char4, GXv_int6, GXv_char3) ;
      clienv_impl.this.A396EmprCod = GXv_char4[0] ;
      clienv_impl.this.A723CliEnvTp = GXv_int6[0] ;
      clienv_impl.this.GXt_char1 = GXv_char3[0] ;
      A693CliEnvNmt = GXt_char1 ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A693CliEnvNmt", GXutil.rtrim( A693CliEnvNmt));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV8CliCod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'AV9CliEnvLin',fld:'vCLIENVLIN',pic:'9',hsh:true},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'dynCliEnvTp'},{av:'A723CliEnvTp',fld:'CLIENVTP',pic:'ZZZ9'},{av:'dynCliEnvPrv'},{av:'A270CliEnvPrv',fld:'CLIENVPRV',pic:'ZZ9'}]");
      setEventMetadata("ENTER",",oparms:[{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'dynCliEnvTp'},{av:'A723CliEnvTp',fld:'CLIENVTP',pic:'ZZZ9'},{av:'dynCliEnvPrv'},{av:'A270CliEnvPrv',fld:'CLIENVPRV',pic:'ZZ9'}]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV11TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true},{av:'AV8CliCod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'AV9CliEnvLin',fld:'vCLIENVLIN',pic:'9',hsh:true},{av:'AV20Pgmname',fld:'vPGMNAME',pic:''},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'dynCliEnvTp'},{av:'A723CliEnvTp',fld:'CLIENVTP',pic:'ZZZ9'},{av:'dynCliEnvPrv'},{av:'A270CliEnvPrv',fld:'CLIENVPRV',pic:'ZZ9'}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'dynCliEnvTp'},{av:'A723CliEnvTp',fld:'CLIENVTP',pic:'ZZZ9'},{av:'dynCliEnvPrv'},{av:'A270CliEnvPrv',fld:'CLIENVPRV',pic:'ZZ9'}]}");
      setEventMetadata("AFTER TRN","{handler:'e121Q82',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV11TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'dynCliEnvTp'},{av:'A723CliEnvTp',fld:'CLIENVTP',pic:'ZZZ9'},{av:'dynCliEnvPrv'},{av:'A270CliEnvPrv',fld:'CLIENVPRV',pic:'ZZ9'}]");
      setEventMetadata("AFTER TRN",",oparms:[{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'dynCliEnvTp'},{av:'A723CliEnvTp',fld:'CLIENVTP',pic:'ZZZ9'},{av:'dynCliEnvPrv'},{av:'A270CliEnvPrv',fld:'CLIENVPRV',pic:'ZZ9'}]}");
      setEventMetadata("VALID_CLIENVPRV","{handler:'valid_Clienvprv',iparms:[{av:'A269CliEnvPrn',fld:'CLIENVPRN',pic:'@!'},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'dynCliEnvTp'},{av:'A723CliEnvTp',fld:'CLIENVTP',pic:'ZZZ9'},{av:'dynCliEnvPrv'},{av:'A270CliEnvPrv',fld:'CLIENVPRV',pic:'ZZ9'}]");
      setEventMetadata("VALID_CLIENVPRV",",oparms:[{av:'A269CliEnvPrn',fld:'CLIENVPRN',pic:'@!'},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'dynCliEnvTp'},{av:'A723CliEnvTp',fld:'CLIENVTP',pic:'ZZZ9'},{av:'dynCliEnvPrv'},{av:'A270CliEnvPrv',fld:'CLIENVPRV',pic:'ZZ9'}]}");
      setEventMetadata("VALID_CLIENVTP","{handler:'valid_Clienvtp',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A693CliEnvNmt',fld:'CLIENVNMT',pic:''},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'dynCliEnvTp'},{av:'A723CliEnvTp',fld:'CLIENVTP',pic:'ZZZ9'},{av:'dynCliEnvPrv'},{av:'A270CliEnvPrv',fld:'CLIENVPRV',pic:'ZZ9'}]");
      setEventMetadata("VALID_CLIENVTP",",oparms:[{av:'A693CliEnvNmt',fld:'CLIENVNMT',pic:''},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'dynCliEnvTp'},{av:'A723CliEnvTp',fld:'CLIENVTP',pic:'ZZZ9'},{av:'dynCliEnvPrv'},{av:'A270CliEnvPrv',fld:'CLIENVPRV',pic:'ZZ9'}]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'dynCliEnvTp'},{av:'A723CliEnvTp',fld:'CLIENVTP',pic:'ZZZ9'},{av:'dynCliEnvPrv'},{av:'A270CliEnvPrv',fld:'CLIENVPRV',pic:'ZZ9'}]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'dynCliEnvTp'},{av:'A723CliEnvTp',fld:'CLIENVTP',pic:'ZZZ9'},{av:'dynCliEnvPrv'},{av:'A270CliEnvPrv',fld:'CLIENVPRV',pic:'ZZ9'}]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'dynCliEnvTp'},{av:'A723CliEnvTp',fld:'CLIENVTP',pic:'ZZZ9'},{av:'dynCliEnvPrv'},{av:'A270CliEnvPrv',fld:'CLIENVPRV',pic:'ZZ9'}]");
      setEventMetadata("VALID_CLICOD",",oparms:[{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'dynCliEnvTp'},{av:'A723CliEnvTp',fld:'CLIENVTP',pic:'ZZZ9'},{av:'dynCliEnvPrv'},{av:'A270CliEnvPrv',fld:'CLIENVPRV',pic:'ZZ9'}]}");
      setEventMetadata("VALID_CLIENVLIN","{handler:'valid_Clienvlin',iparms:[{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'dynCliEnvTp'},{av:'A723CliEnvTp',fld:'CLIENVTP',pic:'ZZZ9'},{av:'dynCliEnvPrv'},{av:'A270CliEnvPrv',fld:'CLIENVPRV',pic:'ZZ9'}]");
      setEventMetadata("VALID_CLIENVLIN",",oparms:[{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'dynCliEnvTp'},{av:'A723CliEnvTp',fld:'CLIENVTP',pic:'ZZZ9'},{av:'dynCliEnvPrv'},{av:'A270CliEnvPrv',fld:'CLIENVPRV',pic:'ZZ9'}]}");
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
      pr_default.close(20);
      pr_default.close(13);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      wcpOAV7EmprCod = "" ;
      Z396EmprCod = "" ;
      Z267CliEnvNom = "" ;
      Z5531CliEnvNm2 = "" ;
      Z265CliEnvDom = "" ;
      Z5530CliEnvDm2 = "" ;
      Z268CliEnvPob = "" ;
      Z264CliEnvCp = "" ;
      Z10775CliEnvCp2 = "" ;
      Z689CliEnvAg = "" ;
      Z10051CliEnvMail = "" ;
      Z10052CliEnvFx = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV7EmprCod = "" ;
      A396EmprCod = "" ;
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
      A267CliEnvNom = "" ;
      A5531CliEnvNm2 = "" ;
      A265CliEnvDom = "" ;
      A5530CliEnvDm2 = "" ;
      A268CliEnvPob = "" ;
      A264CliEnvCp = "" ;
      A10775CliEnvCp2 = "" ;
      A10051CliEnvMail = "" ;
      A10052CliEnvFx = "" ;
      A689CliEnvAg = "" ;
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      AV20Pgmname = "" ;
      A693CliEnvNmt = "" ;
      A269CliEnvPrn = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode22 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      AV15Station = "" ;
      AV16EmprNom = "" ;
      AV17UsurCod = "" ;
      GXv_char2 = new String[1] ;
      AV10WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext5 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV11TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV12WebSession = httpContext.getWebSession();
      AV14TrnContextAtt = new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      Z269CliEnvPrn = "" ;
      T01Q85_A269CliEnvPrn = new String[] {""} ;
      T01Q85_n269CliEnvPrn = new boolean[] {false} ;
      T01Q86_A266CliEnvLin = new byte[1] ;
      T01Q86_A267CliEnvNom = new String[] {""} ;
      T01Q86_A5531CliEnvNm2 = new String[] {""} ;
      T01Q86_A265CliEnvDom = new String[] {""} ;
      T01Q86_A5530CliEnvDm2 = new String[] {""} ;
      T01Q86_A268CliEnvPob = new String[] {""} ;
      T01Q86_A264CliEnvCp = new String[] {""} ;
      T01Q86_A10775CliEnvCp2 = new String[] {""} ;
      T01Q86_A269CliEnvPrn = new String[] {""} ;
      T01Q86_n269CliEnvPrn = new boolean[] {false} ;
      T01Q86_A689CliEnvAg = new String[] {""} ;
      T01Q86_A723CliEnvTp = new short[1] ;
      T01Q86_A10051CliEnvMail = new String[] {""} ;
      T01Q86_A10052CliEnvFx = new String[] {""} ;
      T01Q86_A396EmprCod = new String[] {""} ;
      T01Q86_A252CliCod = new int[1] ;
      T01Q86_n252CliCod = new boolean[] {false} ;
      T01Q86_A270CliEnvPrv = new short[1] ;
      T01Q84_A396EmprCod = new String[] {""} ;
      T01Q87_A396EmprCod = new String[] {""} ;
      T01Q88_A269CliEnvPrn = new String[] {""} ;
      T01Q88_n269CliEnvPrn = new boolean[] {false} ;
      T01Q89_A396EmprCod = new String[] {""} ;
      T01Q89_A252CliCod = new int[1] ;
      T01Q89_n252CliCod = new boolean[] {false} ;
      T01Q89_A266CliEnvLin = new byte[1] ;
      T01Q83_A266CliEnvLin = new byte[1] ;
      T01Q83_A267CliEnvNom = new String[] {""} ;
      T01Q83_A5531CliEnvNm2 = new String[] {""} ;
      T01Q83_A265CliEnvDom = new String[] {""} ;
      T01Q83_A5530CliEnvDm2 = new String[] {""} ;
      T01Q83_A268CliEnvPob = new String[] {""} ;
      T01Q83_A264CliEnvCp = new String[] {""} ;
      T01Q83_A10775CliEnvCp2 = new String[] {""} ;
      T01Q83_A689CliEnvAg = new String[] {""} ;
      T01Q83_A723CliEnvTp = new short[1] ;
      T01Q83_A10051CliEnvMail = new String[] {""} ;
      T01Q83_A10052CliEnvFx = new String[] {""} ;
      T01Q83_A396EmprCod = new String[] {""} ;
      T01Q83_A252CliCod = new int[1] ;
      T01Q83_n252CliCod = new boolean[] {false} ;
      T01Q83_A270CliEnvPrv = new short[1] ;
      T01Q810_A396EmprCod = new String[] {""} ;
      T01Q810_A252CliCod = new int[1] ;
      T01Q810_n252CliCod = new boolean[] {false} ;
      T01Q810_A266CliEnvLin = new byte[1] ;
      T01Q811_A396EmprCod = new String[] {""} ;
      T01Q811_A252CliCod = new int[1] ;
      T01Q811_n252CliCod = new boolean[] {false} ;
      T01Q811_A266CliEnvLin = new byte[1] ;
      T01Q82_A266CliEnvLin = new byte[1] ;
      T01Q82_A267CliEnvNom = new String[] {""} ;
      T01Q82_A5531CliEnvNm2 = new String[] {""} ;
      T01Q82_A265CliEnvDom = new String[] {""} ;
      T01Q82_A5530CliEnvDm2 = new String[] {""} ;
      T01Q82_A268CliEnvPob = new String[] {""} ;
      T01Q82_A264CliEnvCp = new String[] {""} ;
      T01Q82_A10775CliEnvCp2 = new String[] {""} ;
      T01Q82_A689CliEnvAg = new String[] {""} ;
      T01Q82_A723CliEnvTp = new short[1] ;
      T01Q82_A10051CliEnvMail = new String[] {""} ;
      T01Q82_A10052CliEnvFx = new String[] {""} ;
      T01Q82_A396EmprCod = new String[] {""} ;
      T01Q82_A252CliCod = new int[1] ;
      T01Q82_n252CliCod = new boolean[] {false} ;
      T01Q82_A270CliEnvPrv = new short[1] ;
      T01Q815_A269CliEnvPrn = new String[] {""} ;
      T01Q815_n269CliEnvPrn = new boolean[] {false} ;
      T01Q816_A396EmprCod = new String[] {""} ;
      T01Q816_A3617AlbTrnCod = new long[1] ;
      T01Q817_A396EmprCod = new String[] {""} ;
      T01Q817_A1453DevGenHil = new int[1] ;
      T01Q818_A396EmprCod = new String[] {""} ;
      T01Q818_A252CliCod = new int[1] ;
      T01Q818_n252CliCod = new boolean[] {false} ;
      T01Q818_A266CliEnvLin = new byte[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      i689CliEnvAg = "" ;
      gxdynajaxctrlcodr = new com.genexus.internet.StringCollection();
      gxdynajaxctrldescr = new com.genexus.internet.StringCollection();
      gxwrpcisep = "" ;
      T01Q819_A781PrvCod = new short[1] ;
      T01Q819_n781PrvCod = new boolean[] {false} ;
      T01Q819_A787PrvDsc = new String[] {""} ;
      T01Q819_n787PrvDsc = new boolean[] {false} ;
      T01Q820_A396EmprCod = new String[] {""} ;
      T01Q820_A840TrnCod = new short[1] ;
      T01Q820_A841TrnNom = new String[] {""} ;
      T01Q820_n841TrnNom = new boolean[] {false} ;
      T01Q820_A781PrvCod = new short[1] ;
      T01Q820_n781PrvCod = new boolean[] {false} ;
      T01Q821_A781PrvCod = new short[1] ;
      T01Q821_n781PrvCod = new boolean[] {false} ;
      T01Q821_A787PrvDsc = new String[] {""} ;
      T01Q821_n787PrvDsc = new boolean[] {false} ;
      T01Q822_A396EmprCod = new String[] {""} ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      GXv_int6 = new short[1] ;
      GXv_char3 = new String[1] ;
      Z693CliEnvNmt = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.clienv__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.clienv__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.clienv__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.clienv__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.clienv__default(),
         new Object[] {
             new Object[] {
            T01Q82_A266CliEnvLin, T01Q82_A267CliEnvNom, T01Q82_A5531CliEnvNm2, T01Q82_A265CliEnvDom, T01Q82_A5530CliEnvDm2, T01Q82_A268CliEnvPob, T01Q82_A264CliEnvCp, T01Q82_A10775CliEnvCp2, T01Q82_A689CliEnvAg, T01Q82_A723CliEnvTp,
            T01Q82_A10051CliEnvMail, T01Q82_A10052CliEnvFx, T01Q82_A396EmprCod, T01Q82_A252CliCod, T01Q82_A270CliEnvPrv
            }
            , new Object[] {
            T01Q83_A266CliEnvLin, T01Q83_A267CliEnvNom, T01Q83_A5531CliEnvNm2, T01Q83_A265CliEnvDom, T01Q83_A5530CliEnvDm2, T01Q83_A268CliEnvPob, T01Q83_A264CliEnvCp, T01Q83_A10775CliEnvCp2, T01Q83_A689CliEnvAg, T01Q83_A723CliEnvTp,
            T01Q83_A10051CliEnvMail, T01Q83_A10052CliEnvFx, T01Q83_A396EmprCod, T01Q83_A252CliCod, T01Q83_A270CliEnvPrv
            }
            , new Object[] {
            T01Q84_A396EmprCod
            }
            , new Object[] {
            T01Q85_A269CliEnvPrn, T01Q85_n269CliEnvPrn
            }
            , new Object[] {
            T01Q86_A266CliEnvLin, T01Q86_A267CliEnvNom, T01Q86_A5531CliEnvNm2, T01Q86_A265CliEnvDom, T01Q86_A5530CliEnvDm2, T01Q86_A268CliEnvPob, T01Q86_A264CliEnvCp, T01Q86_A10775CliEnvCp2, T01Q86_A269CliEnvPrn, T01Q86_n269CliEnvPrn,
            T01Q86_A689CliEnvAg, T01Q86_A723CliEnvTp, T01Q86_A10051CliEnvMail, T01Q86_A10052CliEnvFx, T01Q86_A396EmprCod, T01Q86_A252CliCod, T01Q86_A270CliEnvPrv
            }
            , new Object[] {
            T01Q87_A396EmprCod
            }
            , new Object[] {
            T01Q88_A269CliEnvPrn, T01Q88_n269CliEnvPrn
            }
            , new Object[] {
            T01Q89_A396EmprCod, T01Q89_A252CliCod, T01Q89_A266CliEnvLin
            }
            , new Object[] {
            T01Q810_A396EmprCod, T01Q810_A252CliCod, T01Q810_A266CliEnvLin
            }
            , new Object[] {
            T01Q811_A396EmprCod, T01Q811_A252CliCod, T01Q811_A266CliEnvLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01Q815_A269CliEnvPrn, T01Q815_n269CliEnvPrn
            }
            , new Object[] {
            T01Q816_A396EmprCod, T01Q816_A3617AlbTrnCod
            }
            , new Object[] {
            T01Q817_A396EmprCod, T01Q817_A1453DevGenHil
            }
            , new Object[] {
            T01Q818_A396EmprCod, T01Q818_A252CliCod, T01Q818_A266CliEnvLin
            }
            , new Object[] {
            T01Q819_A781PrvCod, T01Q819_A787PrvDsc, T01Q819_n787PrvDsc
            }
            , new Object[] {
            T01Q820_A396EmprCod, T01Q820_A840TrnCod, T01Q820_A841TrnNom, T01Q820_n841TrnNom, T01Q820_A781PrvCod, T01Q820_n781PrvCod
            }
            , new Object[] {
            T01Q821_A781PrvCod, T01Q821_A787PrvDsc, T01Q821_n787PrvDsc
            }
            , new Object[] {
            T01Q822_A396EmprCod
            }
         }
      );
      AV20Pgmname = "CLIENV" ;
      Z689CliEnvAg = httpContext.getMessage( "N", "") ;
      A689CliEnvAg = httpContext.getMessage( "N", "") ;
      i689CliEnvAg = httpContext.getMessage( "N", "") ;
   }

   private byte wcpOAV9CliEnvLin ;
   private byte Z266CliEnvLin ;
   private byte GxWebError ;
   private byte AV9CliEnvLin ;
   private byte nKeyPressed ;
   private byte A266CliEnvLin ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private short Z723CliEnvTp ;
   private short Z270CliEnvPrv ;
   private short N270CliEnvPrv ;
   private short A723CliEnvTp ;
   private short A270CliEnvPrv ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short AV13Insert_CliEnvPrv ;
   private short RcdFound22 ;
   private short nIsDirty_22 ;
   private short GXv_int6[] ;
   private int wcpOAV8CliCod ;
   private int Z252CliCod ;
   private int A252CliCod ;
   private int AV8CliCod ;
   private int trnEnded ;
   private int edtCliEnvNom_Enabled ;
   private int edtCliEnvNm2_Enabled ;
   private int edtCliEnvDom_Enabled ;
   private int edtCliEnvDm2_Enabled ;
   private int edtCliEnvPob_Enabled ;
   private int edtCliEnvCp_Enabled ;
   private int edtCliEnvCp2_Enabled ;
   private int edtCliEnvMail_Enabled ;
   private int edtCliEnvFx_Enabled ;
   private int edtCliEnvAg_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int edtavPgmname_Enabled ;
   private int edtEmprCod_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtCliCod_Visible ;
   private int edtCliCod_Enabled ;
   private int edtCliEnvLin_Visible ;
   private int edtCliEnvLin_Enabled ;
   private int edtCliEnvNmt_Visible ;
   private int edtCliEnvNmt_Enabled ;
   private int edtCliEnvPrn_Visible ;
   private int edtCliEnvPrn_Enabled ;
   private int AV21GXV1 ;
   private int GX_JID ;
   private int idxLst ;
   private int gxdynajaxindex ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV7EmprCod ;
   private String Z396EmprCod ;
   private String Z267CliEnvNom ;
   private String Z5531CliEnvNm2 ;
   private String Z265CliEnvDom ;
   private String Z5530CliEnvDm2 ;
   private String Z268CliEnvPob ;
   private String Z264CliEnvCp ;
   private String Z10775CliEnvCp2 ;
   private String Z689CliEnvAg ;
   private String Z10051CliEnvMail ;
   private String Z10052CliEnvFx ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String AV7EmprCod ;
   private String A396EmprCod ;
   private String Gx_mode ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtCliEnvNom_Internalname ;
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
   private String A267CliEnvNom ;
   private String edtCliEnvNom_Jsonclick ;
   private String edtCliEnvNm2_Internalname ;
   private String A5531CliEnvNm2 ;
   private String edtCliEnvNm2_Jsonclick ;
   private String edtCliEnvDom_Internalname ;
   private String A265CliEnvDom ;
   private String edtCliEnvDom_Jsonclick ;
   private String edtCliEnvDm2_Internalname ;
   private String A5530CliEnvDm2 ;
   private String edtCliEnvDm2_Jsonclick ;
   private String edtCliEnvPob_Internalname ;
   private String A268CliEnvPob ;
   private String edtCliEnvPob_Jsonclick ;
   private String divUnnamedtable3_Internalname ;
   private String edtCliEnvCp_Internalname ;
   private String A264CliEnvCp ;
   private String edtCliEnvCp_Jsonclick ;
   private String edtCliEnvCp2_Internalname ;
   private String A10775CliEnvCp2 ;
   private String edtCliEnvCp2_Jsonclick ;
   private String divUnnamedtable4_Internalname ;
   private String divUnnamedtable5_Internalname ;
   private String edtCliEnvMail_Internalname ;
   private String A10051CliEnvMail ;
   private String edtCliEnvMail_Jsonclick ;
   private String edtCliEnvFx_Internalname ;
   private String A10052CliEnvFx ;
   private String edtCliEnvFx_Jsonclick ;
   private String divUnnamedtable2_Internalname ;
   private String edtCliEnvAg_Internalname ;
   private String A689CliEnvAg ;
   private String edtCliEnvAg_Jsonclick ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String edtavPgmname_Internalname ;
   private String AV20Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String edtEmprCod_Internalname ;
   private String edtEmprCod_Jsonclick ;
   private String edtCliCod_Internalname ;
   private String edtCliCod_Jsonclick ;
   private String edtCliEnvLin_Internalname ;
   private String edtCliEnvLin_Jsonclick ;
   private String edtCliEnvNmt_Internalname ;
   private String A693CliEnvNmt ;
   private String edtCliEnvNmt_Jsonclick ;
   private String edtCliEnvPrn_Internalname ;
   private String A269CliEnvPrn ;
   private String edtCliEnvPrn_Jsonclick ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String hsh ;
   private String sMode22 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String AV15Station ;
   private String AV16EmprNom ;
   private String AV17UsurCod ;
   private String GXv_char2[] ;
   private String Z269CliEnvPrn ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String i689CliEnvAg ;
   private String gxwrpcisep ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String Z693CliEnvNmt ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n252CliCod ;
   private boolean wbErr ;
   private boolean Dvpanel_tableattributes_Autowidth ;
   private boolean Dvpanel_tableattributes_Autoheight ;
   private boolean Dvpanel_tableattributes_Collapsible ;
   private boolean Dvpanel_tableattributes_Collapsed ;
   private boolean Dvpanel_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_tableattributes_Autoscroll ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean n269CliEnvPrn ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private boolean gxdyncontrolsrefreshing ;
   private com.genexus.internet.StringCollection gxdynajaxctrlcodr ;
   private com.genexus.internet.StringCollection gxdynajaxctrldescr ;
   private com.genexus.webpanels.WebSession AV12WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice dynCliEnvPrv ;
   private HTMLChoice dynCliEnvTp ;
   private IDataStoreProvider pr_default ;
   private String[] T01Q85_A269CliEnvPrn ;
   private boolean[] T01Q85_n269CliEnvPrn ;
   private byte[] T01Q86_A266CliEnvLin ;
   private String[] T01Q86_A267CliEnvNom ;
   private String[] T01Q86_A5531CliEnvNm2 ;
   private String[] T01Q86_A265CliEnvDom ;
   private String[] T01Q86_A5530CliEnvDm2 ;
   private String[] T01Q86_A268CliEnvPob ;
   private String[] T01Q86_A264CliEnvCp ;
   private String[] T01Q86_A10775CliEnvCp2 ;
   private String[] T01Q86_A269CliEnvPrn ;
   private boolean[] T01Q86_n269CliEnvPrn ;
   private String[] T01Q86_A689CliEnvAg ;
   private short[] T01Q86_A723CliEnvTp ;
   private String[] T01Q86_A10051CliEnvMail ;
   private String[] T01Q86_A10052CliEnvFx ;
   private String[] T01Q86_A396EmprCod ;
   private int[] T01Q86_A252CliCod ;
   private boolean[] T01Q86_n252CliCod ;
   private short[] T01Q86_A270CliEnvPrv ;
   private String[] T01Q84_A396EmprCod ;
   private String[] T01Q87_A396EmprCod ;
   private String[] T01Q88_A269CliEnvPrn ;
   private boolean[] T01Q88_n269CliEnvPrn ;
   private String[] T01Q89_A396EmprCod ;
   private int[] T01Q89_A252CliCod ;
   private boolean[] T01Q89_n252CliCod ;
   private byte[] T01Q89_A266CliEnvLin ;
   private byte[] T01Q83_A266CliEnvLin ;
   private String[] T01Q83_A267CliEnvNom ;
   private String[] T01Q83_A5531CliEnvNm2 ;
   private String[] T01Q83_A265CliEnvDom ;
   private String[] T01Q83_A5530CliEnvDm2 ;
   private String[] T01Q83_A268CliEnvPob ;
   private String[] T01Q83_A264CliEnvCp ;
   private String[] T01Q83_A10775CliEnvCp2 ;
   private String[] T01Q83_A689CliEnvAg ;
   private short[] T01Q83_A723CliEnvTp ;
   private String[] T01Q83_A10051CliEnvMail ;
   private String[] T01Q83_A10052CliEnvFx ;
   private String[] T01Q83_A396EmprCod ;
   private int[] T01Q83_A252CliCod ;
   private boolean[] T01Q83_n252CliCod ;
   private short[] T01Q83_A270CliEnvPrv ;
   private String[] T01Q810_A396EmprCod ;
   private int[] T01Q810_A252CliCod ;
   private boolean[] T01Q810_n252CliCod ;
   private byte[] T01Q810_A266CliEnvLin ;
   private String[] T01Q811_A396EmprCod ;
   private int[] T01Q811_A252CliCod ;
   private boolean[] T01Q811_n252CliCod ;
   private byte[] T01Q811_A266CliEnvLin ;
   private byte[] T01Q82_A266CliEnvLin ;
   private String[] T01Q82_A267CliEnvNom ;
   private String[] T01Q82_A5531CliEnvNm2 ;
   private String[] T01Q82_A265CliEnvDom ;
   private String[] T01Q82_A5530CliEnvDm2 ;
   private String[] T01Q82_A268CliEnvPob ;
   private String[] T01Q82_A264CliEnvCp ;
   private String[] T01Q82_A10775CliEnvCp2 ;
   private String[] T01Q82_A689CliEnvAg ;
   private short[] T01Q82_A723CliEnvTp ;
   private String[] T01Q82_A10051CliEnvMail ;
   private String[] T01Q82_A10052CliEnvFx ;
   private String[] T01Q82_A396EmprCod ;
   private int[] T01Q82_A252CliCod ;
   private boolean[] T01Q82_n252CliCod ;
   private short[] T01Q82_A270CliEnvPrv ;
   private String[] T01Q815_A269CliEnvPrn ;
   private boolean[] T01Q815_n269CliEnvPrn ;
   private String[] T01Q816_A396EmprCod ;
   private long[] T01Q816_A3617AlbTrnCod ;
   private String[] T01Q817_A396EmprCod ;
   private int[] T01Q817_A1453DevGenHil ;
   private String[] T01Q818_A396EmprCod ;
   private int[] T01Q818_A252CliCod ;
   private boolean[] T01Q818_n252CliCod ;
   private byte[] T01Q818_A266CliEnvLin ;
   private short[] T01Q819_A781PrvCod ;
   private boolean[] T01Q819_n781PrvCod ;
   private String[] T01Q819_A787PrvDsc ;
   private boolean[] T01Q819_n787PrvDsc ;
   private String[] T01Q820_A396EmprCod ;
   private short[] T01Q820_A840TrnCod ;
   private String[] T01Q820_A841TrnNom ;
   private boolean[] T01Q820_n841TrnNom ;
   private short[] T01Q820_A781PrvCod ;
   private boolean[] T01Q820_n781PrvCod ;
   private short[] T01Q821_A781PrvCod ;
   private boolean[] T01Q821_n781PrvCod ;
   private String[] T01Q821_A787PrvDsc ;
   private boolean[] T01Q821_n787PrvDsc ;
   private String[] T01Q822_A396EmprCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private app.wwpbaseobjects.SdtWWPContext AV10WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext5[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV11TrnContext ;
   private app.wwpbaseobjects.SdtWWPTransactionContext_Attribute AV14TrnContextAtt ;
}

final  class clienv__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class clienv__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class clienv__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class clienv__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class clienv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01Q82", "SELECT CliEnvLin, CliEnvNom, CliEnvNm2, CliEnvDom, CliEnvDm2, CliEnvPob, CliEnvCp, CliEnvCp2, CliEnvAg, CliEnvTp, CliEnvMail, CliEnvFx, EmprCod, CliCod, CliEnvPrv FROM TXPCLIENV WHERE EmprCod = ? AND CliCod = ? AND CliEnvLin = ?  FOR UPDATE OF CliEnvNom, CliEnvNm2, CliEnvDom, CliEnvDm2, CliEnvPob, CliEnvCp, CliEnvCp2, CliEnvAg, CliEnvTp, CliEnvMail, CliEnvFx, CliEnvPrv NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01Q83", "SELECT CliEnvLin, CliEnvNom, CliEnvNm2, CliEnvDom, CliEnvDm2, CliEnvPob, CliEnvCp, CliEnvCp2, CliEnvAg, CliEnvTp, CliEnvMail, CliEnvFx, EmprCod, CliCod, CliEnvPrv FROM TXPCLIENV WHERE EmprCod = ? AND CliCod = ? AND CliEnvLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01Q84", "SELECT EmprCod FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01Q85", "SELECT PrvDsc AS CliEnvPrn FROM TXPPROVIN WHERE PrvCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01Q86", "SELECT /*+ FIRST_ROWS(100) */ TM1.CliEnvLin, TM1.CliEnvNom, TM1.CliEnvNm2, TM1.CliEnvDom, TM1.CliEnvDm2, TM1.CliEnvPob, TM1.CliEnvCp, TM1.CliEnvCp2, T2.PrvDsc AS CliEnvPrn, TM1.CliEnvAg, TM1.CliEnvTp, TM1.CliEnvMail, TM1.CliEnvFx, TM1.EmprCod, TM1.CliCod, TM1.CliEnvPrv AS CliEnvPrv FROM (TXPCLIENV TM1 INNER JOIN TXPPROVIN T2 ON T2.PrvCod = TM1.CliEnvPrv) WHERE TM1.EmprCod = ? and TM1.CliCod = ? and TM1.CliEnvLin = ? ORDER BY TM1.EmprCod, TM1.CliCod, TM1.CliEnvLin ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01Q87", "SELECT EmprCod FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01Q88", "SELECT PrvDsc AS CliEnvPrn FROM TXPPROVIN WHERE PrvCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01Q89", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, CliEnvLin FROM TXPCLIENV WHERE EmprCod = ? AND CliCod = ? AND CliEnvLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01Q810", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, CliEnvLin FROM TXPCLIENV WHERE ( EmprCod > ? or EmprCod = ? and CliCod > ? or CliCod = ? and EmprCod = ? and CliEnvLin > ?) ORDER BY EmprCod, CliCod, CliEnvLin) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01Q811", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, CliEnvLin FROM TXPCLIENV WHERE ( EmprCod < ? or EmprCod = ? and CliCod < ? or CliCod = ? and EmprCod = ? and CliEnvLin < ?) ORDER BY EmprCod DESC, CliCod DESC, CliEnvLin DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01Q812", "INSERT INTO TXPCLIENV(CliEnvLin, CliEnvNom, CliEnvNm2, CliEnvDom, CliEnvDm2, CliEnvPob, CliEnvCp, CliEnvCp2, CliEnvAg, CliEnvTp, CliEnvMail, CliEnvFx, EmprCod, CliCod, CliEnvPrv) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPCLIENV")
         ,new UpdateCursor("T01Q813", "UPDATE TXPCLIENV SET CliEnvNom=?, CliEnvNm2=?, CliEnvDom=?, CliEnvDm2=?, CliEnvPob=?, CliEnvCp=?, CliEnvCp2=?, CliEnvAg=?, CliEnvTp=?, CliEnvMail=?, CliEnvFx=?, CliEnvPrv=?  WHERE EmprCod = ? AND CliCod = ? AND CliEnvLin = ?", GX_NOMASK, "TXPCLIENV")
         ,new UpdateCursor("T01Q814", "DELETE FROM TXPCLIENV  WHERE EmprCod = ? AND CliCod = ? AND CliEnvLin = ?", GX_NOMASK, "TXPCLIENV")
         ,new ForEachCursor("T01Q815", "SELECT PrvDsc AS CliEnvPrn FROM TXPPROVIN WHERE PrvCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01Q816", "SELECT * FROM (SELECT EmprCod, AlbTrnCod FROM TXPALBTRA WHERE EmprCod = ? AND CliCod = ? AND AlbTrnEnv = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01Q817", "SELECT * FROM (SELECT EmprCod, DevGenHil FROM TXPDEVGEH WHERE EmprCod = ? AND CliCod = ? AND DevDomEnv = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01Q818", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, CliCod, CliEnvLin FROM TXPCLIENV ORDER BY EmprCod, CliCod, CliEnvLin ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01Q819", "SELECT PrvCod, PrvDsc FROM TXPPROVIN ORDER BY PrvDsc ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01Q820", "SELECT EmprCod, TrnCod, TrnNom, PrvCod FROM TXPTRANSP WHERE EmprCod = ? ORDER BY TrnNom ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01Q821", "SELECT PrvCod, PrvDsc FROM TXPPROVIN ORDER BY PrvDsc ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01Q822", "SELECT EmprCod FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((String[]) buf[3])[0] = rslt.getString(4, 34);
               ((String[]) buf[4])[0] = rslt.getString(5, 34);
               ((String[]) buf[5])[0] = rslt.getString(6, 30);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               ((String[]) buf[7])[0] = rslt.getString(8, 6);
               ((String[]) buf[8])[0] = rslt.getString(9, 1);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 40);
               ((String[]) buf[11])[0] = rslt.getString(12, 20);
               ((String[]) buf[12])[0] = rslt.getString(13, 3);
               ((int[]) buf[13])[0] = rslt.getInt(14);
               ((short[]) buf[14])[0] = rslt.getShort(15);
               return;
            case 1 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((String[]) buf[3])[0] = rslt.getString(4, 34);
               ((String[]) buf[4])[0] = rslt.getString(5, 34);
               ((String[]) buf[5])[0] = rslt.getString(6, 30);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               ((String[]) buf[7])[0] = rslt.getString(8, 6);
               ((String[]) buf[8])[0] = rslt.getString(9, 1);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 40);
               ((String[]) buf[11])[0] = rslt.getString(12, 20);
               ((String[]) buf[12])[0] = rslt.getString(13, 3);
               ((int[]) buf[13])[0] = rslt.getInt(14);
               ((short[]) buf[14])[0] = rslt.getShort(15);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 4 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((String[]) buf[3])[0] = rslt.getString(4, 34);
               ((String[]) buf[4])[0] = rslt.getString(5, 34);
               ((String[]) buf[5])[0] = rslt.getString(6, 30);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               ((String[]) buf[7])[0] = rslt.getString(8, 6);
               ((String[]) buf[8])[0] = rslt.getString(9, 30);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(10, 1);
               ((short[]) buf[11])[0] = rslt.getShort(11);
               ((String[]) buf[12])[0] = rslt.getString(12, 40);
               ((String[]) buf[13])[0] = rslt.getString(13, 20);
               ((String[]) buf[14])[0] = rslt.getString(14, 3);
               ((int[]) buf[15])[0] = rslt.getInt(15);
               ((short[]) buf[16])[0] = rslt.getShort(16);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 17 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 19 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 20 :
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setByte(3, ((Number) parms[3]).byteValue());
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
               stmt.setByte(3, ((Number) parms[3]).byteValue());
               return;
            case 2 :
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
            case 3 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
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
               stmt.setByte(3, ((Number) parms[3]).byteValue());
               return;
            case 5 :
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
            case 6 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
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
               stmt.setByte(3, ((Number) parms[3]).byteValue());
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
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(4, ((Number) parms[5]).intValue());
               }
               stmt.setString(5, (String)parms[6], 3);
               stmt.setByte(6, ((Number) parms[7]).byteValue());
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
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(4, ((Number) parms[5]).intValue());
               }
               stmt.setString(5, (String)parms[6], 3);
               stmt.setByte(6, ((Number) parms[7]).byteValue());
               return;
            case 10 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 30);
               stmt.setString(3, (String)parms[2], 30);
               stmt.setString(4, (String)parms[3], 34);
               stmt.setString(5, (String)parms[4], 34);
               stmt.setString(6, (String)parms[5], 30);
               stmt.setString(7, (String)parms[6], 6);
               stmt.setString(8, (String)parms[7], 6);
               stmt.setString(9, (String)parms[8], 1);
               stmt.setShort(10, ((Number) parms[9]).shortValue());
               stmt.setString(11, (String)parms[10], 40);
               stmt.setString(12, (String)parms[11], 20);
               stmt.setString(13, (String)parms[12], 3);
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(14, ((Number) parms[14]).intValue());
               }
               stmt.setShort(15, ((Number) parms[15]).shortValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 30);
               stmt.setString(2, (String)parms[1], 30);
               stmt.setString(3, (String)parms[2], 34);
               stmt.setString(4, (String)parms[3], 34);
               stmt.setString(5, (String)parms[4], 30);
               stmt.setString(6, (String)parms[5], 6);
               stmt.setString(7, (String)parms[6], 6);
               stmt.setString(8, (String)parms[7], 1);
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               stmt.setString(10, (String)parms[9], 40);
               stmt.setString(11, (String)parms[10], 20);
               stmt.setShort(12, ((Number) parms[11]).shortValue());
               stmt.setString(13, (String)parms[12], 3);
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(14, ((Number) parms[14]).intValue());
               }
               stmt.setByte(15, ((Number) parms[15]).byteValue());
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
               stmt.setByte(3, ((Number) parms[3]).byteValue());
               return;
            case 13 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setByte(3, ((Number) parms[3]).byteValue());
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
               stmt.setByte(3, ((Number) parms[3]).byteValue());
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 20 :
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

