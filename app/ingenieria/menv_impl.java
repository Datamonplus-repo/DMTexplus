package app.ingenieria ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class menv_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_29") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A457FasCod = httpContext.GetPar( "FasCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_29( A396EmprCod, A457FasCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_31") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A14154MEnvMaqCod = httpContext.GetPar( "MEnvMaqCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A14154MEnvMaqCod", A14154MEnvMaqCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_31( A396EmprCod, A14154MEnvMaqCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_30") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_30( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_33") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A1664ParFasCod = (short)(GXutil.lval( httpContext.GetPar( "ParFasCod"))) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_33( A396EmprCod, A1664ParFasCod) ;
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Grid") == 0 )
      {
         gxnrgrid_newrow_invoke( ) ;
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
            AV10EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10EmprCod", AV10EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV10EmprCod, "@!"))));
            AV7BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7BarCod), 8, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV7BarCod), "ZZZZZZZ9")));
            AV9BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9BarCodReo", GXutil.str( AV9BarCodReo, 1, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODREO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV9BarCodReo), "9")));
            AV8BarCodPar = httpContext.GetPar( "BarCodPar") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8BarCodPar", AV8BarCodPar);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODPAR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV8BarCodPar, ""))));
            AV13MEnvOrd = (short)(GXutil.lval( httpContext.GetPar( "MEnvOrd"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13MEnvOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13MEnvOrd), 4, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMENVORD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV13MEnvOrd), "ZZZ9")));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Envíos de parámetros de máquinas", ""), (short)(0)) ;
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

   public void gxnrgrid_newrow_invoke( )
   {
      nRC_GXsfl_65 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_65"))) ;
      nGXsfl_65_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_65_idx"))) ;
      sGXsfl_65_idx = httpContext.GetPar( "sGXsfl_65_idx") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgrid_newrow( ) ;
      /* End function gxnrGrid_newrow_invoke */
   }

   public menv_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public menv_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( menv_impl.class ));
   }

   public menv_impl( int remoteHandle ,
                     ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbMEnvEst = new HTMLChoice();
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
      if ( cmbMEnvEst.getItemCount() > 0 )
      {
         A14156MEnvEst = (byte)(GXutil.lval( cmbMEnvEst.getValidValue(GXutil.trim( GXutil.str( A14156MEnvEst, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14156MEnvEst", GXutil.str( A14156MEnvEst, 1, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbMEnvEst.setValue( GXutil.trim( GXutil.str( A14156MEnvEst, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbMEnvEst.getInternalname(), "Values", cmbMEnvEst.ToJavascriptSource(), true);
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-8 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarCod_Internalname, httpContext.getMessage( "HDR", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtBarCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Ingenieria\\MEnv.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarCodReo_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarCodReo_Internalname, httpContext.getMessage( "R", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodReo_Internalname, GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCodReo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9") : localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodReo_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtBarCodReo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Ingenieria\\MEnv.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarCodPar_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarCodPar_Internalname, httpContext.getMessage( "P", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodPar_Internalname, GXutil.rtrim( A130BarCodPar), GXutil.rtrim( localUtil.format( A130BarCodPar, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodPar_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtBarCodPar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Ingenieria\\MEnv.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DataContentCell CellMarginLeft", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMEnvOrd_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMEnvOrd_Internalname, httpContext.getMessage( "Orden", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtMEnvOrd_Internalname, GXutil.ltrim( localUtil.ntoc( A14152MEnvOrd, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMEnvOrd_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A14152MEnvOrd), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A14152MEnvOrd), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMEnvOrd_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMEnvOrd_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Ingenieria\\MEnv.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFasCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtFasCod_Internalname, httpContext.getMessage( "Codigo Fase", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtFasCod_Internalname, GXutil.rtrim( A457FasCod), GXutil.rtrim( localUtil.format( A457FasCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFasCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtFasCod_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Ingenieria\\MEnv.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMEnvMaqCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMEnvMaqCod_Internalname, httpContext.getMessage( "máquina", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtMEnvMaqCod_Internalname, GXutil.rtrim( A14154MEnvMaqCod), GXutil.rtrim( localUtil.format( A14154MEnvMaqCod, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMEnvMaqCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMEnvMaqCod_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Ingenieria\\MEnv.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMEnvIni_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMEnvIni_Internalname, httpContext.getMessage( "Inicio", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      httpContext.writeText( "<div id=\""+edtMEnvIni_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMEnvIni_Internalname, localUtil.ttoc( A14158MEnvIni, 10, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A14158MEnvIni, "99/99/99 99:99:99.999"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMEnvIni_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMEnvIni_Enabled, 0, "text", "", 21, "chr", 1, "row", 21, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Ingenieria\\MEnv.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtMEnvIni_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtMEnvIni_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Ingenieria\\MEnv.htm");
      httpContext.writeTextNL( "</div>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMEnvFin_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMEnvFin_Internalname, httpContext.getMessage( "Fin", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      httpContext.writeText( "<div id=\""+edtMEnvFin_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMEnvFin_Internalname, localUtil.ttoc( A14157MEnvFin, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A14157MEnvFin, "99/99/99 99:99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMEnvFin_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMEnvFin_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Ingenieria\\MEnv.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtMEnvFin_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtMEnvFin_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Ingenieria\\MEnv.htm");
      httpContext.writeTextNL( "</div>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbMEnvEst.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, cmbMEnvEst.getInternalname(), httpContext.getMessage( "Estado", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbMEnvEst, cmbMEnvEst.getInternalname(), GXutil.trim( GXutil.str( A14156MEnvEst, 1, 0)), 1, cmbMEnvEst.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", 1, cmbMEnvEst.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", "", "", true, (byte)(0), "HLP_Ingenieria\\MEnv.htm");
      cmbMEnvEst.setValue( GXutil.trim( GXutil.str( A14156MEnvEst, 1, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbMEnvEst.getInternalname(), "Values", cmbMEnvEst.ToJavascriptSource(), true);
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* User Defined Control */
      ucDvpanel_unnamedtable2.setProperty("Width", Dvpanel_unnamedtable2_Width);
      ucDvpanel_unnamedtable2.setProperty("AutoWidth", Dvpanel_unnamedtable2_Autowidth);
      ucDvpanel_unnamedtable2.setProperty("AutoHeight", Dvpanel_unnamedtable2_Autoheight);
      ucDvpanel_unnamedtable2.setProperty("Cls", Dvpanel_unnamedtable2_Cls);
      ucDvpanel_unnamedtable2.setProperty("Title", Dvpanel_unnamedtable2_Title);
      ucDvpanel_unnamedtable2.setProperty("Collapsible", Dvpanel_unnamedtable2_Collapsible);
      ucDvpanel_unnamedtable2.setProperty("Collapsed", Dvpanel_unnamedtable2_Collapsed);
      ucDvpanel_unnamedtable2.setProperty("ShowCollapseIcon", Dvpanel_unnamedtable2_Showcollapseicon);
      ucDvpanel_unnamedtable2.setProperty("IconPosition", Dvpanel_unnamedtable2_Iconposition);
      ucDvpanel_unnamedtable2.setProperty("AutoScroll", Dvpanel_unnamedtable2_Autoscroll);
      ucDvpanel_unnamedtable2.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable2_Internalname, "DVPANEL_UNNAMEDTABLE2Container");
      httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_UNNAMEDTABLE2Container"+"UnnamedTable2"+"\" style=\"display:none;\">") ;
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      gxdraw_grid( ) ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Ingenieria\\MEnv.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Ingenieria\\MEnv.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV21Pgmname), GXutil.rtrim( localUtil.format( AV21Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Ingenieria\\MEnv.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 84,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,84);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", edtEmprCod_Visible, edtEmprCod_Enabled, 1, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Ingenieria\\MEnv.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtMEnvInt_Internalname, GXutil.ltrim( localUtil.ntoc( A14162MEnvInt, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMEnvInt_Enabled!=0) ? localUtil.format( A14162MEnvInt, "ZZZZZZ9.99") : localUtil.format( A14162MEnvInt, "ZZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMEnvInt_Jsonclick, 0, "Attribute", "", "", "", "", edtMEnvInt_Visible, edtMEnvInt_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Ingenieria\\MEnv.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
   }

   public void gxdraw_grid( )
   {
      /*  Grid Control  */
      startgridcontrol65( ) ;
      nGXsfl_65_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1894 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1894 = (short)(1) ;
            scanStart1TD1894( ) ;
            while ( RcdFound1894 != 0 )
            {
               init_level_properties1894( ) ;
               getByPrimaryKey1TD1894( ) ;
               addRow1TD1894( ) ;
               scanNext1TD1894( ) ;
            }
            scanEnd1TD1894( ) ;
            nBlankRcdCount1894 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal1TD1894( ) ;
         standaloneModal1TD1894( ) ;
         sMode1894 = Gx_mode ;
         while ( nGXsfl_65_idx < nRC_GXsfl_65 )
         {
            bGXsfl_65_Refreshing = true ;
            readRow1TD1894( ) ;
            edtParFasCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PARFASCOD_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtParFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParFasCod_Enabled), 5, 0), !bGXsfl_65_Refreshing);
            edtParFasDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PARFASDSC_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtParFasDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParFasDsc_Enabled), 5, 0), !bGXsfl_65_Refreshing);
            edtMPEnvPLC_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MPENVPLC_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMPEnvPLC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMPEnvPLC_Enabled), 5, 0), !bGXsfl_65_Refreshing);
            edtMPEnvVal_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MPENVVAL_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMPEnvVal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMPEnvVal_Enabled), 5, 0), !bGXsfl_65_Refreshing);
            if ( ( nRcdExists_1894 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1TD1894( ) ;
            }
            sendRow1TD1894( ) ;
            bGXsfl_65_Refreshing = false ;
         }
         Gx_mode = sMode1894 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1894 = (short)(5) ;
         nRcdExists_1894 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1TD1894( ) ;
            while ( RcdFound1894 != 0 )
            {
               sGXsfl_65_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_65_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_651894( ) ;
               init_level_properties1894( ) ;
               standaloneNotModal1TD1894( ) ;
               getByPrimaryKey1TD1894( ) ;
               standaloneModal1TD1894( ) ;
               addRow1TD1894( ) ;
               scanNext1TD1894( ) ;
            }
            scanEnd1TD1894( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      if ( ! isDsp( ) && ! isDlt( ) )
      {
         sMode1894 = Gx_mode ;
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         sGXsfl_65_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_65_idx+1), 4, 0), (short)(4), "0") ;
         subsflControlProps_651894( ) ;
         initAll1TD1894( ) ;
         init_level_properties1894( ) ;
         nRcdExists_1894 = (short)(0) ;
         nIsMod_1894 = (short)(0) ;
         nRcdDeleted_1894 = (short)(0) ;
         nBlankRcdCount1894 = (short)(nBlankRcdUsr1894+nBlankRcdCount1894) ;
         fRowAdded = 0 ;
         while ( nBlankRcdCount1894 > 0 )
         {
            standaloneNotModal1TD1894( ) ;
            standaloneModal1TD1894( ) ;
            addRow1TD1894( ) ;
            if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
            {
               fRowAdded = 1 ;
            }
            nBlankRcdCount1894 = (short)(nBlankRcdCount1894-1) ;
         }
         Gx_mode = sMode1894 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      sStyleString = "" ;
      httpContext.writeText( "<div id=\""+"GridContainer"+"Div\" "+sStyleString+">"+"</div>") ;
      httpContext.ajax_rsp_assign_grid("_"+"Grid", GridContainer, subGrid_Internalname);
      if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "GridContainerData", GridContainer.ToJavascriptSource());
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "GridContainerData"+"V", GridContainer.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"GridContainerData"+"V"+"\" value='"+GridContainer.GridValuesHidden()+"'/>") ;
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
      e111TD2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z129BarCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( "Z132BarCodReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z130BarCodPar = httpContext.cgiGet( "Z130BarCodPar") ;
            Z14152MEnvOrd = (short)(localUtil.ctol( httpContext.cgiGet( "Z14152MEnvOrd"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z14158MEnvIni = localUtil.ctot( httpContext.cgiGet( "Z14158MEnvIni"), 0) ;
            Z14157MEnvFin = localUtil.ctot( httpContext.cgiGet( "Z14157MEnvFin"), 0) ;
            Z457FasCod = httpContext.cgiGet( "Z457FasCod") ;
            Z14154MEnvMaqCod = httpContext.cgiGet( "Z14154MEnvMaqCod") ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_65 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_65"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A14685MEnvHdr = httpContext.cgiGet( "MENVHDR") ;
            AV10EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            AV7BarCod = (int)(localUtil.ctol( httpContext.cgiGet( "vBARCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV9BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( "vBARCODREO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV8BarCodPar = httpContext.cgiGet( "vBARCODPAR") ;
            AV13MEnvOrd = (short)(localUtil.ctol( httpContext.cgiGet( "vMENVORD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV11Insert_FasCod = httpContext.cgiGet( "vINSERT_FASCOD") ;
            AV12Insert_MEnvMaqCod = httpContext.cgiGet( "vINSERT_MENVMAQCOD") ;
            A460FasDsc = httpContext.cgiGet( "FASDSC") ;
            A14164MEnvMaqDsc = httpContext.cgiGet( "MENVMAQDSC") ;
            n14164MEnvMaqDsc = false ;
            Dvpanel_unnamedtable2_Objectcall = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Objectcall") ;
            Dvpanel_unnamedtable2_Class = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Class") ;
            Dvpanel_unnamedtable2_Enabled = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Enabled")) ;
            Dvpanel_unnamedtable2_Width = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Width") ;
            Dvpanel_unnamedtable2_Height = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Height") ;
            Dvpanel_unnamedtable2_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Autowidth")) ;
            Dvpanel_unnamedtable2_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Autoheight")) ;
            Dvpanel_unnamedtable2_Cls = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Cls") ;
            Dvpanel_unnamedtable2_Showheader = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Showheader")) ;
            Dvpanel_unnamedtable2_Title = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Title") ;
            Dvpanel_unnamedtable2_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Collapsible")) ;
            Dvpanel_unnamedtable2_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Collapsed")) ;
            Dvpanel_unnamedtable2_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Showcollapseicon")) ;
            Dvpanel_unnamedtable2_Iconposition = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Iconposition") ;
            Dvpanel_unnamedtable2_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Autoscroll")) ;
            Dvpanel_unnamedtable2_Visible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Visible")) ;
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
            A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            A14152MEnvOrd = (short)(localUtil.ctol( httpContext.cgiGet( edtMEnvOrd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14152MEnvOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14152MEnvOrd), 4, 0));
            A457FasCod = GXutil.upper( httpContext.cgiGet( edtFasCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
            A14154MEnvMaqCod = httpContext.cgiGet( edtMEnvMaqCod_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14154MEnvMaqCod", A14154MEnvMaqCod);
            A14158MEnvIni = localUtil.ctot( httpContext.cgiGet( edtMEnvIni_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14158MEnvIni", localUtil.ttoc( A14158MEnvIni, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            A14157MEnvFin = localUtil.ctot( httpContext.cgiGet( edtMEnvFin_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14157MEnvFin", localUtil.ttoc( A14157MEnvFin, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            cmbMEnvEst.setName( cmbMEnvEst.getInternalname() );
            cmbMEnvEst.setValue( httpContext.cgiGet( cmbMEnvEst.getInternalname()) );
            A14156MEnvEst = (byte)(GXutil.lval( httpContext.cgiGet( cmbMEnvEst.getInternalname()))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14156MEnvEst", GXutil.str( A14156MEnvEst, 1, 0));
            AV21Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV21Pgmname", AV21Pgmname);
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A14162MEnvInt = localUtil.ctond( httpContext.cgiGet( edtMEnvInt_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14162MEnvInt", GXutil.ltrimstr( A14162MEnvInt, 10, 2));
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"MEnv");
            A14152MEnvOrd = (short)(localUtil.ctol( httpContext.cgiGet( edtMEnvOrd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14152MEnvOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14152MEnvOrd), 4, 0));
            forbiddenHiddens.add("MEnvOrd", localUtil.format( DecimalUtil.doubleToDec(A14152MEnvOrd), "ZZZ9"));
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            A457FasCod = httpContext.cgiGet( edtFasCod_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
            forbiddenHiddens.add("FasCod", GXutil.rtrim( localUtil.format( A457FasCod, "@!")));
            A14154MEnvMaqCod = httpContext.cgiGet( edtMEnvMaqCod_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14154MEnvMaqCod", A14154MEnvMaqCod);
            forbiddenHiddens.add("MEnvMaqCod", GXutil.rtrim( localUtil.format( A14154MEnvMaqCod, "")));
            AV21Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV21Pgmname", AV21Pgmname);
            forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV21Pgmname, "")));
            A14158MEnvIni = localUtil.ctot( httpContext.cgiGet( edtMEnvIni_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14158MEnvIni", localUtil.ttoc( A14158MEnvIni, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            forbiddenHiddens.add("MEnvIni", localUtil.format( A14158MEnvIni, "99/99/99 99:99:99.999"));
            A14157MEnvFin = localUtil.ctot( httpContext.cgiGet( edtMEnvFin_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14157MEnvFin", localUtil.ttoc( A14157MEnvFin, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            forbiddenHiddens.add("MEnvFin", localUtil.format( A14157MEnvFin, "99/99/99 99:99"));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( A14152MEnvOrd != Z14152MEnvOrd ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("ingenieria\\menv:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
               A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
               A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
               httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
               A14152MEnvOrd = (short)(GXutil.lval( httpContext.GetPar( "MEnvOrd"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A14152MEnvOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14152MEnvOrd), 4, 0));
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
                  sMode1893 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  Gx_mode = sMode1893 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound1893 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_1TD0( ) ;
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
                        e111TD2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e121TD2 ();
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
         e121TD2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll1TD1893( ) ;
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
      if ( isDsp( ) || isDlt( ) )
      {
         if ( isDsp( ) )
         {
            bttBtntrn_enter_Visible = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_enter_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_enter_Visible), 5, 0), true);
         }
         disableAttributes1TD1893( ) ;
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

   public void confirm_1TD0( )
   {
      beforeValidate1TD1893( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1TD1893( ) ;
         }
         else
         {
            checkExtendedTable1TD1893( ) ;
            closeExtendedTableCursors1TD1893( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode1893 = Gx_mode ;
         confirm_1TD1894( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode1893 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode1893 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
   }

   public void confirm_1TD1894( )
   {
      nGXsfl_65_idx = 0 ;
      while ( nGXsfl_65_idx < nRC_GXsfl_65 )
      {
         readRow1TD1894( ) ;
         if ( ( nRcdExists_1894 != 0 ) || ( nIsMod_1894 != 0 ) )
         {
            getKey1TD1894( ) ;
            if ( ( nRcdExists_1894 == 0 ) && ( nRcdDeleted_1894 == 0 ) )
            {
               if ( RcdFound1894 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1TD1894( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1TD1894( ) ;
                     closeExtendedTableCursors1TD1894( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtEmprCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1894 != 0 )
               {
                  if ( nRcdDeleted_1894 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1TD1894( ) ;
                     load1TD1894( ) ;
                     beforeValidate1TD1894( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1TD1894( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1894 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1TD1894( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1TD1894( ) ;
                           closeExtendedTableCursors1TD1894( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1894 == 0 )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "EMPRCOD");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtEmprCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtParFasCod_Internalname, GXutil.ltrim( localUtil.ntoc( A1664ParFasCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtParFasDsc_Internalname, GXutil.rtrim( A1665ParFasDsc)) ;
         httpContext.changePostValue( edtMPEnvPLC_Internalname, A14160MPEnvPLC) ;
         httpContext.changePostValue( edtMPEnvVal_Internalname, GXutil.rtrim( A14161MPEnvVal)) ;
         httpContext.changePostValue( "ZT_"+"Z1664ParFasCod_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( Z1664ParFasCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z14160MPEnvPLC_"+sGXsfl_65_idx, Z14160MPEnvPLC) ;
         httpContext.changePostValue( "ZT_"+"Z14161MPEnvVal_"+sGXsfl_65_idx, GXutil.rtrim( Z14161MPEnvVal)) ;
         httpContext.changePostValue( "nRcdDeleted_1894_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1894, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1894_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1894, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1894_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1894, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1894 != 0 )
         {
            httpContext.changePostValue( "PARFASCOD_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParFasCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PARFASDSC_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParFasDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MPENVPLC_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMPEnvPLC_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MPENVVAL_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMPEnvVal_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1TD0( )
   {
   }

   public void e111TD2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV18Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      menv_impl.this.GXt_char1 = GXv_char2[0] ;
      AV18Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18Station", AV18Station);
      GXv_char2[0] = AV10EmprCod ;
      GXv_char3[0] = AV19EmprNom ;
      GXv_char4[0] = AV20UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV18Station, GXv_char2, GXv_char3, GXv_char4) ;
      menv_impl.this.AV10EmprCod = GXv_char2[0] ;
      menv_impl.this.AV19EmprNom = GXv_char3[0] ;
      menv_impl.this.AV20UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10EmprCod", AV10EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV10EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV19EmprNom", AV19EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV20UsurCod", AV20UsurCod);
      GXv_SdtWWPContext5[0] = AV17WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext5) ;
      AV17WWPContext = GXv_SdtWWPContext5[0] ;
      AV14TrnContext.fromxml(AV16WebSession.getValue("TrnContext"), null, null);
      if ( ( GXutil.strcmp(AV14TrnContext.getgxTv_SdtWWPTransactionContext_Transactionname(), AV21Pgmname) == 0 ) && ( GXutil.strcmp(Gx_mode, "INS") == 0 ) )
      {
         AV22GXV1 = 1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV22GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22GXV1), 8, 0));
         while ( AV22GXV1 <= AV14TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().size() )
         {
            AV15TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)((app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)AV14TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().elementAt(-1+AV22GXV1));
            if ( GXutil.strcmp(AV15TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "FasCod") == 0 )
            {
               AV11Insert_FasCod = AV15TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue() ;
               httpContext.ajax_rsp_assign_attri("", false, "AV11Insert_FasCod", AV11Insert_FasCod);
            }
            else if ( GXutil.strcmp(AV15TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "MEnvMaqCod") == 0 )
            {
               AV12Insert_MEnvMaqCod = AV15TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue() ;
               httpContext.ajax_rsp_assign_attri("", false, "AV12Insert_MEnvMaqCod", AV12Insert_MEnvMaqCod);
            }
            AV22GXV1 = (int)(AV22GXV1+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV22GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22GXV1), 8, 0));
         }
      }
      edtEmprCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Visible), 5, 0), true);
      edtMEnvInt_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMEnvInt_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMEnvInt_Visible), 5, 0), true);
   }

   public void e121TD2( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV14TrnContext.getgxTv_SdtWWPTransactionContext_Callerondelete() )
      {
         callWebObject(formatLink("app.ingenieria.menvww", new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      pr_default.close(7);
      pr_default.close(6);
      pr_default.close(5);
      pr_default.close(4);
      pr_default.close(2);
      pr_default.close(1);
      returnInSub = true;
      if (true) return;
   }

   public void zm1TD1893( int GX_JID )
   {
      if ( ( GX_JID == 28 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z14158MEnvIni = T01TD6_A14158MEnvIni[0] ;
            Z14157MEnvFin = T01TD6_A14157MEnvFin[0] ;
            Z457FasCod = T01TD6_A457FasCod[0] ;
            Z14154MEnvMaqCod = T01TD6_A14154MEnvMaqCod[0] ;
         }
         else
         {
            Z14158MEnvIni = A14158MEnvIni ;
            Z14157MEnvFin = A14157MEnvFin ;
            Z457FasCod = A457FasCod ;
            Z14154MEnvMaqCod = A14154MEnvMaqCod ;
         }
      }
      if ( GX_JID == -28 )
      {
         Z14152MEnvOrd = A14152MEnvOrd ;
         Z14158MEnvIni = A14158MEnvIni ;
         Z14157MEnvFin = A14157MEnvFin ;
         Z396EmprCod = A396EmprCod ;
         Z457FasCod = A457FasCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z14154MEnvMaqCod = A14154MEnvMaqCod ;
         Z460FasDsc = A460FasDsc ;
         Z14164MEnvMaqDsc = A14164MEnvMaqDsc ;
      }
   }

   public void standaloneNotModal( )
   {
      edtMEnvOrd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMEnvOrd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMEnvOrd_Enabled), 5, 0), true);
      edtFasCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCod_Enabled), 5, 0), true);
      edtMEnvMaqCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMEnvMaqCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMEnvMaqCod_Enabled), 5, 0), true);
      edtMEnvIni_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMEnvIni_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMEnvIni_Enabled), 5, 0), true);
      edtMEnvFin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMEnvFin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMEnvFin_Enabled), 5, 0), true);
      cmbMEnvEst.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbMEnvEst.getInternalname(), "Enabled", GXutil.ltrimstr( cmbMEnvEst.getEnabled(), 5, 0), true);
      edtBarCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), true);
      edtBarCodReo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), true);
      edtBarCodPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), true);
      AV21Pgmname = "Ingenieria.MEnv" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21Pgmname", AV21Pgmname);
      edtMEnvOrd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMEnvOrd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMEnvOrd_Enabled), 5, 0), true);
      edtFasCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCod_Enabled), 5, 0), true);
      edtMEnvMaqCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMEnvMaqCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMEnvMaqCod_Enabled), 5, 0), true);
      edtMEnvIni_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMEnvIni_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMEnvIni_Enabled), 5, 0), true);
      edtMEnvFin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMEnvFin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMEnvFin_Enabled), 5, 0), true);
      cmbMEnvEst.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbMEnvEst.getInternalname(), "Enabled", GXutil.ltrimstr( cmbMEnvEst.getEnabled(), 5, 0), true);
      edtBarCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), true);
      edtBarCodReo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), true);
      edtBarCodPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV10EmprCod)==0) )
      {
         A396EmprCod = AV10EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      if ( ! (GXutil.strcmp("", AV10EmprCod)==0) )
      {
         edtEmprCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      }
      else
      {
         edtEmprCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      }
      if ( ! (GXutil.strcmp("", AV10EmprCod)==0) )
      {
         edtEmprCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      }
      if ( ! (0==AV7BarCod) )
      {
         A129BarCod = AV7BarCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
      }
      if ( ! (0==AV9BarCodReo) )
      {
         A132BarCodReo = AV9BarCodReo ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
      }
      if ( ! (GXutil.strcmp("", AV8BarCodPar)==0) )
      {
         A130BarCodPar = AV8BarCodPar ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      }
      if ( ! (0==AV13MEnvOrd) )
      {
         A14152MEnvOrd = AV13MEnvOrd ;
         httpContext.ajax_rsp_assign_attri("", false, "A14152MEnvOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14152MEnvOrd), 4, 0));
      }
   }

   public void standaloneModal( )
   {
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (GXutil.strcmp("", AV12Insert_MEnvMaqCod)==0) )
      {
         A14154MEnvMaqCod = AV12Insert_MEnvMaqCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A14154MEnvMaqCod", A14154MEnvMaqCod);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (GXutil.strcmp("", AV11Insert_FasCod)==0) )
      {
         A457FasCod = AV11Insert_FasCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
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
         A14685MEnvHdr = GXutil.format( "%1%2%3", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0), GXutil.str( A132BarCodReo, 1, 0), A130BarCodPar, "", "", "", "", "", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "A14685MEnvHdr", A14685MEnvHdr);
         /* Using cursor T01TD9 */
         pr_default.execute(7, new Object[] {A396EmprCod, A14154MEnvMaqCod});
         A14164MEnvMaqDsc = T01TD9_A14164MEnvMaqDsc[0] ;
         n14164MEnvMaqDsc = T01TD9_n14164MEnvMaqDsc[0] ;
         pr_default.close(7);
         /* Using cursor T01TD7 */
         pr_default.execute(5, new Object[] {A396EmprCod, A457FasCod});
         A460FasDsc = T01TD7_A460FasDsc[0] ;
         pr_default.close(5);
      }
   }

   public void load1TD1893( )
   {
      /* Using cursor T01TD10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A14152MEnvOrd)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound1893 = (short)(1) ;
         A460FasDsc = T01TD10_A460FasDsc[0] ;
         A14164MEnvMaqDsc = T01TD10_A14164MEnvMaqDsc[0] ;
         n14164MEnvMaqDsc = T01TD10_n14164MEnvMaqDsc[0] ;
         A14158MEnvIni = T01TD10_A14158MEnvIni[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14158MEnvIni", localUtil.ttoc( A14158MEnvIni, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A14157MEnvFin = T01TD10_A14157MEnvFin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14157MEnvFin", localUtil.ttoc( A14157MEnvFin, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A457FasCod = T01TD10_A457FasCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
         A14154MEnvMaqCod = T01TD10_A14154MEnvMaqCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14154MEnvMaqCod", A14154MEnvMaqCod);
         zm1TD1893( -28) ;
      }
      pr_default.close(8);
      onLoadActions1TD1893( ) ;
   }

   public void onLoadActions1TD1893( )
   {
      A14685MEnvHdr = GXutil.format( "%1%2%3", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0), GXutil.str( A132BarCodReo, 1, 0), A130BarCodPar, "", "", "", "", "", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "A14685MEnvHdr", A14685MEnvHdr);
      if ( ! GXutil.dateCompare(GXutil.nullDate(), A14157MEnvFin) )
      {
         A14162MEnvInt = DecimalUtil.doubleToDec(GXutil.dtdiffms( A14157MEnvFin, A14158MEnvIni)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14162MEnvInt", GXutil.ltrimstr( A14162MEnvInt, 10, 2));
      }
      else
      {
         A14162MEnvInt = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14162MEnvInt", GXutil.ltrimstr( A14162MEnvInt, 10, 2));
      }
      if ( GXutil.dateCompare(GXutil.nullDate(), A14157MEnvFin) )
      {
         A14156MEnvEst = (byte)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14156MEnvEst", GXutil.str( A14156MEnvEst, 1, 0));
      }
      else
      {
         A14156MEnvEst = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14156MEnvEst", GXutil.str( A14156MEnvEst, 1, 0));
      }
   }

   public void checkExtendedTable1TD1893( )
   {
      nIsDirty_1893 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01TD7 */
      pr_default.execute(5, new Object[] {A396EmprCod, A457FasCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FASPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FASCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A460FasDsc = T01TD7_A460FasDsc[0] ;
      pr_default.close(5);
      /* Using cursor T01TD9 */
      pr_default.execute(7, new Object[] {A396EmprCod, A14154MEnvMaqCod});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Máquina", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MENVMAQCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A14164MEnvMaqDsc = T01TD9_A14164MEnvMaqDsc[0] ;
      n14164MEnvMaqDsc = T01TD9_n14164MEnvMaqDsc[0] ;
      pr_default.close(7);
      /* Using cursor T01TD8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(6);
      nIsDirty_1893 = (short)(1) ;
      A14685MEnvHdr = GXutil.format( "%1%2%3", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0), GXutil.str( A132BarCodReo, 1, 0), A130BarCodPar, "", "", "", "", "", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "A14685MEnvHdr", A14685MEnvHdr);
      if ( ! GXutil.dateCompare(GXutil.nullDate(), A14157MEnvFin) )
      {
         nIsDirty_1893 = (short)(1) ;
         A14162MEnvInt = DecimalUtil.doubleToDec(GXutil.dtdiffms( A14157MEnvFin, A14158MEnvIni)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14162MEnvInt", GXutil.ltrimstr( A14162MEnvInt, 10, 2));
      }
      else
      {
         nIsDirty_1893 = (short)(1) ;
         A14162MEnvInt = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14162MEnvInt", GXutil.ltrimstr( A14162MEnvInt, 10, 2));
      }
      if ( GXutil.dateCompare(GXutil.nullDate(), A14157MEnvFin) )
      {
         nIsDirty_1893 = (short)(1) ;
         A14156MEnvEst = (byte)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14156MEnvEst", GXutil.str( A14156MEnvEst, 1, 0));
      }
      else
      {
         nIsDirty_1893 = (short)(1) ;
         A14156MEnvEst = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14156MEnvEst", GXutil.str( A14156MEnvEst, 1, 0));
      }
   }

   public void closeExtendedTableCursors1TD1893( )
   {
      pr_default.close(5);
      pr_default.close(7);
      pr_default.close(6);
   }

   public void enableDisable( )
   {
   }

   public void gxload_29( String A396EmprCod ,
                          String A457FasCod )
   {
      /* Using cursor T01TD11 */
      pr_default.execute(9, new Object[] {A396EmprCod, A457FasCod});
      if ( (pr_default.getStatus(9) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FASPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FASCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A460FasDsc = T01TD11_A460FasDsc[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A460FasDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(9) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(9);
   }

   public void gxload_31( String A396EmprCod ,
                          String A14154MEnvMaqCod )
   {
      /* Using cursor T01TD12 */
      pr_default.execute(10, new Object[] {A396EmprCod, A14154MEnvMaqCod});
      if ( (pr_default.getStatus(10) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Máquina", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MENVMAQCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A14164MEnvMaqDsc = T01TD12_A14164MEnvMaqDsc[0] ;
      n14164MEnvMaqDsc = T01TD12_n14164MEnvMaqDsc[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A14164MEnvMaqDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(10) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(10);
   }

   public void gxload_30( String A396EmprCod ,
                          int A129BarCod ,
                          byte A132BarCodReo ,
                          String A130BarCodPar )
   {
      /* Using cursor T01TD13 */
      pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(11) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_default.getStatus(11) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(11);
   }

   public void getKey1TD1893( )
   {
      /* Using cursor T01TD14 */
      pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A14152MEnvOrd)});
      if ( (pr_default.getStatus(12) != 101) )
      {
         RcdFound1893 = (short)(1) ;
      }
      else
      {
         RcdFound1893 = (short)(0) ;
      }
      pr_default.close(12);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01TD6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A14152MEnvOrd)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         zm1TD1893( 28) ;
         RcdFound1893 = (short)(1) ;
         A14152MEnvOrd = T01TD6_A14152MEnvOrd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14152MEnvOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14152MEnvOrd), 4, 0));
         A14158MEnvIni = T01TD6_A14158MEnvIni[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14158MEnvIni", localUtil.ttoc( A14158MEnvIni, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A14157MEnvFin = T01TD6_A14157MEnvFin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14157MEnvFin", localUtil.ttoc( A14157MEnvFin, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A396EmprCod = T01TD6_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A457FasCod = T01TD6_A457FasCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
         A129BarCod = T01TD6_A129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T01TD6_A132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T01TD6_A130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A14154MEnvMaqCod = T01TD6_A14154MEnvMaqCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14154MEnvMaqCod", A14154MEnvMaqCod);
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z14152MEnvOrd = A14152MEnvOrd ;
         sMode1893 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1TD1893( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1893 = (short)(0) ;
            initializeNonKey1TD1893( ) ;
         }
         Gx_mode = sMode1893 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1893 = (short)(0) ;
         initializeNonKey1TD1893( ) ;
         sMode1893 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1893 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(4);
   }

   public void getEqualNoModal( )
   {
      getKey1TD1893( ) ;
      if ( RcdFound1893 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound1893 = (short)(0) ;
      /* Using cursor T01TD15 */
      pr_default.execute(13, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A129BarCod), Integer.valueOf(A129BarCod), A396EmprCod, Byte.valueOf(A132BarCodReo), Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A396EmprCod, A130BarCodPar, A130BarCodPar, Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A396EmprCod, Short.valueOf(A14152MEnvOrd)});
      if ( (pr_default.getStatus(13) != 101) )
      {
         while ( (pr_default.getStatus(13) != 101) && ( ( GXutil.strcmp(T01TD15_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01TD15_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01TD15_A129BarCod[0] < A129BarCod ) || ( T01TD15_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01TD15_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01TD15_A132BarCodReo[0] < A132BarCodReo ) || ( T01TD15_A132BarCodReo[0] == A132BarCodReo ) && ( T01TD15_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01TD15_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01TD15_A130BarCodPar[0], A130BarCodPar) < 0 ) || ( GXutil.strcmp(T01TD15_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01TD15_A132BarCodReo[0] == A132BarCodReo ) && ( T01TD15_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01TD15_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01TD15_A14152MEnvOrd[0] < A14152MEnvOrd ) ) )
         {
            pr_default.readNext(13);
         }
         if ( (pr_default.getStatus(13) != 101) && ( ( GXutil.strcmp(T01TD15_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01TD15_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01TD15_A129BarCod[0] > A129BarCod ) || ( T01TD15_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01TD15_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01TD15_A132BarCodReo[0] > A132BarCodReo ) || ( T01TD15_A132BarCodReo[0] == A132BarCodReo ) && ( T01TD15_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01TD15_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01TD15_A130BarCodPar[0], A130BarCodPar) > 0 ) || ( GXutil.strcmp(T01TD15_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01TD15_A132BarCodReo[0] == A132BarCodReo ) && ( T01TD15_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01TD15_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01TD15_A14152MEnvOrd[0] > A14152MEnvOrd ) ) )
         {
            A396EmprCod = T01TD15_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A129BarCod = T01TD15_A129BarCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = T01TD15_A132BarCodReo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = T01TD15_A130BarCodPar[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            A14152MEnvOrd = T01TD15_A14152MEnvOrd[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A14152MEnvOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14152MEnvOrd), 4, 0));
            RcdFound1893 = (short)(1) ;
         }
      }
      pr_default.close(13);
   }

   public void move_previous( )
   {
      RcdFound1893 = (short)(0) ;
      /* Using cursor T01TD16 */
      pr_default.execute(14, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A129BarCod), Integer.valueOf(A129BarCod), A396EmprCod, Byte.valueOf(A132BarCodReo), Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A396EmprCod, A130BarCodPar, A130BarCodPar, Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A396EmprCod, Short.valueOf(A14152MEnvOrd)});
      if ( (pr_default.getStatus(14) != 101) )
      {
         while ( (pr_default.getStatus(14) != 101) && ( ( GXutil.strcmp(T01TD16_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01TD16_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01TD16_A129BarCod[0] > A129BarCod ) || ( T01TD16_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01TD16_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01TD16_A132BarCodReo[0] > A132BarCodReo ) || ( T01TD16_A132BarCodReo[0] == A132BarCodReo ) && ( T01TD16_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01TD16_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01TD16_A130BarCodPar[0], A130BarCodPar) > 0 ) || ( GXutil.strcmp(T01TD16_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01TD16_A132BarCodReo[0] == A132BarCodReo ) && ( T01TD16_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01TD16_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01TD16_A14152MEnvOrd[0] > A14152MEnvOrd ) ) )
         {
            pr_default.readNext(14);
         }
         if ( (pr_default.getStatus(14) != 101) && ( ( GXutil.strcmp(T01TD16_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01TD16_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01TD16_A129BarCod[0] < A129BarCod ) || ( T01TD16_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01TD16_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01TD16_A132BarCodReo[0] < A132BarCodReo ) || ( T01TD16_A132BarCodReo[0] == A132BarCodReo ) && ( T01TD16_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01TD16_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01TD16_A130BarCodPar[0], A130BarCodPar) < 0 ) || ( GXutil.strcmp(T01TD16_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01TD16_A132BarCodReo[0] == A132BarCodReo ) && ( T01TD16_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01TD16_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01TD16_A14152MEnvOrd[0] < A14152MEnvOrd ) ) )
         {
            A396EmprCod = T01TD16_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A129BarCod = T01TD16_A129BarCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = T01TD16_A132BarCodReo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = T01TD16_A130BarCodPar[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            A14152MEnvOrd = T01TD16_A14152MEnvOrd[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A14152MEnvOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14152MEnvOrd), 4, 0));
            RcdFound1893 = (short)(1) ;
         }
      }
      pr_default.close(14);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1TD1893( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1TD1893( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1893 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( A14152MEnvOrd != Z14152MEnvOrd ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A129BarCod = Z129BarCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
               A132BarCodReo = Z132BarCodReo ;
               httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
               A130BarCodPar = Z130BarCodPar ;
               httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
               A14152MEnvOrd = Z14152MEnvOrd ;
               httpContext.ajax_rsp_assign_attri("", false, "A14152MEnvOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14152MEnvOrd), 4, 0));
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
               update1TD1893( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( A14152MEnvOrd != Z14152MEnvOrd ) )
            {
               /* Insert record */
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1TD1893( ) ;
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
                  insert1TD1893( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( A14152MEnvOrd != Z14152MEnvOrd ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = Z129BarCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = Z132BarCodReo ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = Z130BarCodPar ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A14152MEnvOrd = Z14152MEnvOrd ;
         httpContext.ajax_rsp_assign_attri("", false, "A14152MEnvOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14152MEnvOrd), 4, 0));
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

   public void checkOptimisticConcurrency1TD1893( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01TD5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A14152MEnvOrd)});
         if ( (pr_default.getStatus(3) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMEnv"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(3) == 101) || !( GXutil.dateCompare(Z14158MEnvIni, T01TD5_A14158MEnvIni[0]) ) || !( GXutil.dateCompare(Z14157MEnvFin, T01TD5_A14157MEnvFin[0]) ) || ( GXutil.strcmp(Z457FasCod, T01TD5_A457FasCod[0]) != 0 ) || ( GXutil.strcmp(Z14154MEnvMaqCod, T01TD5_A14154MEnvMaqCod[0]) != 0 ) )
         {
            if ( !( GXutil.dateCompare(Z14158MEnvIni, T01TD5_A14158MEnvIni[0]) ) )
            {
               GXutil.writeLogln("ingenieria.menv:[seudo value changed for attri]"+"MEnvIni");
               GXutil.writeLogRaw("Old: ",Z14158MEnvIni);
               GXutil.writeLogRaw("Current: ",T01TD5_A14158MEnvIni[0]);
            }
            if ( !( GXutil.dateCompare(Z14157MEnvFin, T01TD5_A14157MEnvFin[0]) ) )
            {
               GXutil.writeLogln("ingenieria.menv:[seudo value changed for attri]"+"MEnvFin");
               GXutil.writeLogRaw("Old: ",Z14157MEnvFin);
               GXutil.writeLogRaw("Current: ",T01TD5_A14157MEnvFin[0]);
            }
            if ( GXutil.strcmp(Z457FasCod, T01TD5_A457FasCod[0]) != 0 )
            {
               GXutil.writeLogln("ingenieria.menv:[seudo value changed for attri]"+"FasCod");
               GXutil.writeLogRaw("Old: ",Z457FasCod);
               GXutil.writeLogRaw("Current: ",T01TD5_A457FasCod[0]);
            }
            if ( GXutil.strcmp(Z14154MEnvMaqCod, T01TD5_A14154MEnvMaqCod[0]) != 0 )
            {
               GXutil.writeLogln("ingenieria.menv:[seudo value changed for attri]"+"MEnvMaqCod");
               GXutil.writeLogRaw("Old: ",Z14154MEnvMaqCod);
               GXutil.writeLogRaw("Current: ",T01TD5_A14154MEnvMaqCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPMEnv"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1TD1893( )
   {
      beforeValidate1TD1893( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1TD1893( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1TD1893( 0) ;
         checkOptimisticConcurrency1TD1893( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1TD1893( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1TD1893( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01TD17 */
                  pr_default.execute(15, new Object[] {Short.valueOf(A14152MEnvOrd), A14158MEnvIni, A14157MEnvFin, A396EmprCod, A457FasCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A14154MEnvMaqCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMEnv");
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
                        processLevel1TD1893( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1TD0( ) ;
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
            load1TD1893( ) ;
         }
         endLevel1TD1893( ) ;
      }
      closeExtendedTableCursors1TD1893( ) ;
   }

   public void update1TD1893( )
   {
      beforeValidate1TD1893( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1TD1893( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1TD1893( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1TD1893( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1TD1893( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01TD18 */
                  pr_default.execute(16, new Object[] {A14158MEnvIni, A14157MEnvFin, A457FasCod, A14154MEnvMaqCod, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A14152MEnvOrd)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMEnv");
                  if ( (pr_default.getStatus(16) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMEnv"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1TD1893( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1TD1893( ) ;
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
         endLevel1TD1893( ) ;
      }
      closeExtendedTableCursors1TD1893( ) ;
   }

   public void deferredUpdate1TD1893( )
   {
   }

   public void delete( )
   {
      beforeValidate1TD1893( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1TD1893( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1TD1893( ) ;
         afterConfirm1TD1893( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1TD1893( ) ;
            if ( AnyError == 0 )
            {
               scanStart1TD1894( ) ;
               while ( RcdFound1894 != 0 )
               {
                  getByPrimaryKey1TD1894( ) ;
                  delete1TD1894( ) ;
                  scanNext1TD1894( ) ;
               }
               scanEnd1TD1894( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01TD19 */
                  pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A14152MEnvOrd)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMEnv");
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
      sMode1893 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1TD1893( ) ;
      Gx_mode = sMode1893 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1TD1893( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         A14685MEnvHdr = GXutil.format( "%1%2%3", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0), GXutil.str( A132BarCodReo, 1, 0), A130BarCodPar, "", "", "", "", "", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "A14685MEnvHdr", A14685MEnvHdr);
         if ( ! GXutil.dateCompare(GXutil.nullDate(), A14157MEnvFin) )
         {
            A14162MEnvInt = DecimalUtil.doubleToDec(GXutil.dtdiffms( A14157MEnvFin, A14158MEnvIni)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14162MEnvInt", GXutil.ltrimstr( A14162MEnvInt, 10, 2));
         }
         else
         {
            A14162MEnvInt = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14162MEnvInt", GXutil.ltrimstr( A14162MEnvInt, 10, 2));
         }
         if ( GXutil.dateCompare(GXutil.nullDate(), A14157MEnvFin) )
         {
            A14156MEnvEst = (byte)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14156MEnvEst", GXutil.str( A14156MEnvEst, 1, 0));
         }
         else
         {
            A14156MEnvEst = (byte)(2) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14156MEnvEst", GXutil.str( A14156MEnvEst, 1, 0));
         }
         /* Using cursor T01TD20 */
         pr_default.execute(18, new Object[] {A396EmprCod, A457FasCod});
         A460FasDsc = T01TD20_A460FasDsc[0] ;
         pr_default.close(18);
         /* Using cursor T01TD21 */
         pr_default.execute(19, new Object[] {A396EmprCod, A14154MEnvMaqCod});
         A14164MEnvMaqDsc = T01TD21_A14164MEnvMaqDsc[0] ;
         n14164MEnvMaqDsc = T01TD21_n14164MEnvMaqDsc[0] ;
         pr_default.close(19);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T01TD22 */
         pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A14152MEnvOrd)});
         if ( (pr_default.getStatus(20) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MEPr", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(20);
         /* Using cursor T01TD23 */
         pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A14152MEnvOrd)});
         if ( (pr_default.getStatus(21) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Valores recibidos de máquinas", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(21);
      }
   }

   public void processNestedLevel1TD1894( )
   {
      nGXsfl_65_idx = 0 ;
      while ( nGXsfl_65_idx < nRC_GXsfl_65 )
      {
         readRow1TD1894( ) ;
         if ( ( nRcdExists_1894 != 0 ) || ( nIsMod_1894 != 0 ) )
         {
            standaloneNotModal1TD1894( ) ;
            getKey1TD1894( ) ;
            if ( ( nRcdExists_1894 == 0 ) && ( nRcdDeleted_1894 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1TD1894( ) ;
            }
            else
            {
               if ( RcdFound1894 != 0 )
               {
                  if ( ( nRcdDeleted_1894 != 0 ) && ( nRcdExists_1894 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1TD1894( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1894 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1TD1894( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1894 == 0 )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "EMPRCOD");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtEmprCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtParFasCod_Internalname, GXutil.ltrim( localUtil.ntoc( A1664ParFasCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtParFasDsc_Internalname, GXutil.rtrim( A1665ParFasDsc)) ;
         httpContext.changePostValue( edtMPEnvPLC_Internalname, A14160MPEnvPLC) ;
         httpContext.changePostValue( edtMPEnvVal_Internalname, GXutil.rtrim( A14161MPEnvVal)) ;
         httpContext.changePostValue( "ZT_"+"Z1664ParFasCod_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( Z1664ParFasCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z14160MPEnvPLC_"+sGXsfl_65_idx, Z14160MPEnvPLC) ;
         httpContext.changePostValue( "ZT_"+"Z14161MPEnvVal_"+sGXsfl_65_idx, GXutil.rtrim( Z14161MPEnvVal)) ;
         httpContext.changePostValue( "nRcdDeleted_1894_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1894, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1894_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1894, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1894_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1894, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1894 != 0 )
         {
            httpContext.changePostValue( "PARFASCOD_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParFasCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PARFASDSC_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParFasDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MPENVPLC_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMPEnvPLC_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MPENVVAL_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMPEnvVal_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1TD1894( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1894 = (short)(0) ;
      nIsMod_1894 = (short)(0) ;
      nRcdDeleted_1894 = (short)(0) ;
   }

   public void processLevel1TD1893( )
   {
      /* Save parent mode. */
      sMode1893 = Gx_mode ;
      processNestedLevel1TD1894( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode1893 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1TD1893( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(3);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1TD1893( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "ingenieria.menv");
         if ( AnyError == 0 )
         {
            confirmValues1TD0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "ingenieria.menv");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1TD1893( )
   {
      /* Scan By routine */
      /* Using cursor T01TD24 */
      pr_default.execute(22);
      RcdFound1893 = (short)(0) ;
      if ( (pr_default.getStatus(22) != 101) )
      {
         RcdFound1893 = (short)(1) ;
         A396EmprCod = T01TD24_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = T01TD24_A129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T01TD24_A132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T01TD24_A130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A14152MEnvOrd = T01TD24_A14152MEnvOrd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14152MEnvOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14152MEnvOrd), 4, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1TD1893( )
   {
      /* Scan next routine */
      pr_default.readNext(22);
      RcdFound1893 = (short)(0) ;
      if ( (pr_default.getStatus(22) != 101) )
      {
         RcdFound1893 = (short)(1) ;
         A396EmprCod = T01TD24_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = T01TD24_A129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T01TD24_A132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T01TD24_A130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A14152MEnvOrd = T01TD24_A14152MEnvOrd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14152MEnvOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14152MEnvOrd), 4, 0));
      }
   }

   public void scanEnd1TD1893( )
   {
      pr_default.close(22);
   }

   public void afterConfirm1TD1893( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1TD1893( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1TD1893( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1TD1893( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1TD1893( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1TD1893( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1TD1893( )
   {
      edtBarCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), true);
      edtBarCodReo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), true);
      edtBarCodPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), true);
      edtMEnvOrd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMEnvOrd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMEnvOrd_Enabled), 5, 0), true);
      edtFasCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCod_Enabled), 5, 0), true);
      edtMEnvMaqCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMEnvMaqCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMEnvMaqCod_Enabled), 5, 0), true);
      edtMEnvIni_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMEnvIni_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMEnvIni_Enabled), 5, 0), true);
      edtMEnvFin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMEnvFin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMEnvFin_Enabled), 5, 0), true);
      cmbMEnvEst.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbMEnvEst.getInternalname(), "Enabled", GXutil.ltrimstr( cmbMEnvEst.getEnabled(), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtMEnvInt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMEnvInt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMEnvInt_Enabled), 5, 0), true);
   }

   public void zm1TD1894( int GX_JID )
   {
      if ( ( GX_JID == 32 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z14160MPEnvPLC = T01TD3_A14160MPEnvPLC[0] ;
            Z14161MPEnvVal = T01TD3_A14161MPEnvVal[0] ;
         }
         else
         {
            Z14160MPEnvPLC = A14160MPEnvPLC ;
            Z14161MPEnvVal = A14161MPEnvVal ;
         }
      }
      if ( GX_JID == -32 )
      {
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z14152MEnvOrd = A14152MEnvOrd ;
         Z14160MPEnvPLC = A14160MPEnvPLC ;
         Z14161MPEnvVal = A14161MPEnvVal ;
         Z396EmprCod = A396EmprCod ;
         Z1664ParFasCod = A1664ParFasCod ;
         Z1665ParFasDsc = A1665ParFasDsc ;
      }
   }

   public void standaloneNotModal1TD1894( )
   {
      edtParFasCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtParFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParFasCod_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtParFasDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtParFasDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParFasDsc_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtMPEnvPLC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMPEnvPLC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMPEnvPLC_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtMPEnvVal_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMPEnvVal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMPEnvVal_Enabled), 5, 0), !bGXsfl_65_Refreshing);
   }

   public void standaloneModal1TD1894( )
   {
   }

   public void load1TD1894( )
   {
      /* Using cursor T01TD25 */
      pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A14152MEnvOrd), Short.valueOf(A1664ParFasCod)});
      if ( (pr_default.getStatus(23) != 101) )
      {
         RcdFound1894 = (short)(1) ;
         A1665ParFasDsc = T01TD25_A1665ParFasDsc[0] ;
         n1665ParFasDsc = T01TD25_n1665ParFasDsc[0] ;
         A14160MPEnvPLC = T01TD25_A14160MPEnvPLC[0] ;
         A14161MPEnvVal = T01TD25_A14161MPEnvVal[0] ;
         zm1TD1894( -32) ;
      }
      pr_default.close(23);
      onLoadActions1TD1894( ) ;
   }

   public void onLoadActions1TD1894( )
   {
   }

   public void checkExtendedTable1TD1894( )
   {
      nIsDirty_1894 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1TD1894( ) ;
      /* Using cursor T01TD4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Short.valueOf(A1664ParFasCod)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "PARFASCOD_" + sGXsfl_65_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PARFAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtParFasCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A1665ParFasDsc = T01TD4_A1665ParFasDsc[0] ;
      n1665ParFasDsc = T01TD4_n1665ParFasDsc[0] ;
      pr_default.close(2);
   }

   public void closeExtendedTableCursors1TD1894( )
   {
      pr_default.close(2);
   }

   public void enableDisable1TD1894( )
   {
   }

   public void gxload_33( String A396EmprCod ,
                          short A1664ParFasCod )
   {
      /* Using cursor T01TD26 */
      pr_default.execute(24, new Object[] {A396EmprCod, Short.valueOf(A1664ParFasCod)});
      if ( (pr_default.getStatus(24) == 101) )
      {
         GXCCtl = "PARFASCOD_" + sGXsfl_65_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PARFAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtParFasCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A1665ParFasDsc = T01TD26_A1665ParFasDsc[0] ;
      n1665ParFasDsc = T01TD26_n1665ParFasDsc[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A1665ParFasDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(24) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(24);
   }

   public void getKey1TD1894( )
   {
      /* Using cursor T01TD27 */
      pr_default.execute(25, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A14152MEnvOrd), Short.valueOf(A1664ParFasCod)});
      if ( (pr_default.getStatus(25) != 101) )
      {
         RcdFound1894 = (short)(1) ;
      }
      else
      {
         RcdFound1894 = (short)(0) ;
      }
      pr_default.close(25);
   }

   public void getByPrimaryKey1TD1894( )
   {
      /* Using cursor T01TD3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A14152MEnvOrd), Short.valueOf(A1664ParFasCod)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1TD1894( 32) ;
         RcdFound1894 = (short)(1) ;
         initializeNonKey1TD1894( ) ;
         A14160MPEnvPLC = T01TD3_A14160MPEnvPLC[0] ;
         A14161MPEnvVal = T01TD3_A14161MPEnvVal[0] ;
         A1664ParFasCod = T01TD3_A1664ParFasCod[0] ;
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z14152MEnvOrd = A14152MEnvOrd ;
         Z1664ParFasCod = A1664ParFasCod ;
         sMode1894 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1TD1894( ) ;
         Gx_mode = sMode1894 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1894 = (short)(0) ;
         initializeNonKey1TD1894( ) ;
         sMode1894 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1TD1894( ) ;
         Gx_mode = sMode1894 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1TD1894( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1TD1894( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01TD2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A14152MEnvOrd), Short.valueOf(A1664ParFasCod)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMPEnv"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z14160MPEnvPLC, T01TD2_A14160MPEnvPLC[0]) != 0 ) || ( GXutil.strcmp(Z14161MPEnvVal, T01TD2_A14161MPEnvVal[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z14160MPEnvPLC, T01TD2_A14160MPEnvPLC[0]) != 0 )
            {
               GXutil.writeLogln("ingenieria.menv:[seudo value changed for attri]"+"MPEnvPLC");
               GXutil.writeLogRaw("Old: ",Z14160MPEnvPLC);
               GXutil.writeLogRaw("Current: ",T01TD2_A14160MPEnvPLC[0]);
            }
            if ( GXutil.strcmp(Z14161MPEnvVal, T01TD2_A14161MPEnvVal[0]) != 0 )
            {
               GXutil.writeLogln("ingenieria.menv:[seudo value changed for attri]"+"MPEnvVal");
               GXutil.writeLogRaw("Old: ",Z14161MPEnvVal);
               GXutil.writeLogRaw("Current: ",T01TD2_A14161MPEnvVal[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPMPEnv"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1TD1894( )
   {
      beforeValidate1TD1894( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1TD1894( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1TD1894( 0) ;
         checkOptimisticConcurrency1TD1894( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1TD1894( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1TD1894( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01TD28 */
                  pr_default.execute(26, new Object[] {Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A14152MEnvOrd), A14160MPEnvPLC, A14161MPEnvVal, A396EmprCod, Short.valueOf(A1664ParFasCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMPEnv");
                  if ( (pr_default.getStatus(26) == 1) )
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
            load1TD1894( ) ;
         }
         endLevel1TD1894( ) ;
      }
      closeExtendedTableCursors1TD1894( ) ;
   }

   public void update1TD1894( )
   {
      beforeValidate1TD1894( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1TD1894( ) ;
      }
      if ( ( nIsMod_1894 != 0 ) || ( nIsDirty_1894 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1TD1894( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1TD1894( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1TD1894( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01TD29 */
                     pr_default.execute(27, new Object[] {A14160MPEnvPLC, A14161MPEnvVal, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A14152MEnvOrd), Short.valueOf(A1664ParFasCod)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMPEnv");
                     if ( (pr_default.getStatus(27) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMPEnv"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1TD1894( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1TD1894( ) ;
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
            endLevel1TD1894( ) ;
         }
      }
      closeExtendedTableCursors1TD1894( ) ;
   }

   public void deferredUpdate1TD1894( )
   {
   }

   public void delete1TD1894( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1TD1894( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1TD1894( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1TD1894( ) ;
         afterConfirm1TD1894( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1TD1894( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01TD30 */
               pr_default.execute(28, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A14152MEnvOrd), Short.valueOf(A1664ParFasCod)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMPEnv");
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
      sMode1894 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1TD1894( ) ;
      Gx_mode = sMode1894 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1TD1894( )
   {
      standaloneModal1TD1894( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01TD31 */
         pr_default.execute(29, new Object[] {A396EmprCod, Short.valueOf(A1664ParFasCod)});
         A1665ParFasDsc = T01TD31_A1665ParFasDsc[0] ;
         n1665ParFasDsc = T01TD31_n1665ParFasDsc[0] ;
         pr_default.close(29);
      }
   }

   public void endLevel1TD1894( )
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

   public void scanStart1TD1894( )
   {
      /* Scan By routine */
      /* Using cursor T01TD32 */
      pr_default.execute(30, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A14152MEnvOrd)});
      RcdFound1894 = (short)(0) ;
      if ( (pr_default.getStatus(30) != 101) )
      {
         RcdFound1894 = (short)(1) ;
         A1664ParFasCod = T01TD32_A1664ParFasCod[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1TD1894( )
   {
      /* Scan next routine */
      pr_default.readNext(30);
      RcdFound1894 = (short)(0) ;
      if ( (pr_default.getStatus(30) != 101) )
      {
         RcdFound1894 = (short)(1) ;
         A1664ParFasCod = T01TD32_A1664ParFasCod[0] ;
      }
   }

   public void scanEnd1TD1894( )
   {
      pr_default.close(30);
   }

   public void afterConfirm1TD1894( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1TD1894( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1TD1894( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1TD1894( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1TD1894( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1TD1894( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1TD1894( )
   {
      edtParFasCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtParFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParFasCod_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtParFasDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtParFasDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParFasDsc_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtMPEnvPLC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMPEnvPLC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMPEnvPLC_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtMPEnvVal_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMPEnvVal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMPEnvVal_Enabled), 5, 0), !bGXsfl_65_Refreshing);
   }

   public void send_integrity_lvl_hashes1TD1894( )
   {
   }

   public void send_integrity_lvl_hashes1TD1893( )
   {
   }

   public void subsflControlProps_651894( )
   {
      edtParFasCod_Internalname = "PARFASCOD_"+sGXsfl_65_idx ;
      edtParFasDsc_Internalname = "PARFASDSC_"+sGXsfl_65_idx ;
      edtMPEnvPLC_Internalname = "MPENVPLC_"+sGXsfl_65_idx ;
      edtMPEnvVal_Internalname = "MPENVVAL_"+sGXsfl_65_idx ;
   }

   public void subsflControlProps_fel_651894( )
   {
      edtParFasCod_Internalname = "PARFASCOD_"+sGXsfl_65_fel_idx ;
      edtParFasDsc_Internalname = "PARFASDSC_"+sGXsfl_65_fel_idx ;
      edtMPEnvPLC_Internalname = "MPENVPLC_"+sGXsfl_65_fel_idx ;
      edtMPEnvVal_Internalname = "MPENVVAL_"+sGXsfl_65_fel_idx ;
   }

   public void addRow1TD1894( )
   {
      nGXsfl_65_idx = (int)(nGXsfl_65_idx+1) ;
      sGXsfl_65_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_65_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_651894( ) ;
      sendRow1TD1894( ) ;
   }

   public void sendRow1TD1894( )
   {
      GridRow = GXWebRow.GetNew(context) ;
      if ( subGrid_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGrid_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGrid_Class, "") != 0 )
         {
            subGrid_Linesclass = subGrid_Class+"Odd" ;
         }
      }
      else if ( subGrid_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGrid_Backstyle = (byte)(0) ;
         subGrid_Backcolor = subGrid_Allbackcolor ;
         if ( GXutil.strcmp(subGrid_Class, "") != 0 )
         {
            subGrid_Linesclass = subGrid_Class+"Uniform" ;
         }
      }
      else if ( subGrid_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGrid_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGrid_Class, "") != 0 )
         {
            subGrid_Linesclass = subGrid_Class+"Odd" ;
         }
         subGrid_Backcolor = (int)(0x0) ;
      }
      else if ( subGrid_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGrid_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_65_idx) % (2))) == 0 )
         {
            subGrid_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGrid_Class, "") != 0 )
            {
               subGrid_Linesclass = subGrid_Class+"Even" ;
            }
         }
         else
         {
            subGrid_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGrid_Class, "") != 0 )
            {
               subGrid_Linesclass = subGrid_Class+"Odd" ;
            }
         }
      }
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtParFasCod_Internalname,GXutil.ltrim( localUtil.ntoc( A1664ParFasCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtParFasCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1664ParFasCod), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1664ParFasCod), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtParFasCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtParFasCod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(65),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtParFasDsc_Internalname,GXutil.rtrim( A1665ParFasDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtParFasDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtParFasDsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(65),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMPEnvPLC_Internalname,A14160MPEnvPLC,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMPEnvPLC_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtMPEnvPLC_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(65),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMPEnvVal_Internalname,GXutil.rtrim( A14161MPEnvVal),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMPEnvVal_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtMPEnvVal_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(65),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(GridRow);
      send_integrity_lvl_hashes1TD1894( ) ;
      GXCCtl = "Z1664ParFasCod_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z1664ParFasCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z14160MPEnvPLC_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, Z14160MPEnvPLC);
      GXCCtl = "Z14161MPEnvVal_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z14161MPEnvVal));
      GXCCtl = "nRcdDeleted_1894_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1894, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1894_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1894, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1894_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1894, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vMODE_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Gx_mode));
      GXCCtl = "vTRNCONTEXT_" + sGXsfl_65_idx ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, GXCCtl, AV14TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(GXCCtl, AV14TrnContext);
      }
      GXCCtl = "vEMPRCOD_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV10EmprCod));
      GXCCtl = "vBARCOD_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV7BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vBARCODREO_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV9BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vBARCODPAR_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV8BarCodPar));
      GXCCtl = "vMENVORD_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV13MEnvOrd, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PARFASCOD_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParFasCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PARFASDSC_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParFasDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MPENVPLC_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMPEnvPLC_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MPENVVAL_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMPEnvVal_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      GridContainer.AddRow(GridRow);
   }

   public void readRow1TD1894( )
   {
      nGXsfl_65_idx = (int)(nGXsfl_65_idx+1) ;
      sGXsfl_65_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_65_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_651894( ) ;
      edtParFasCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PARFASCOD_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtParFasDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PARFASDSC_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMPEnvPLC_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MPENVPLC_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMPEnvVal_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MPENVVAL_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A1664ParFasCod = (short)(localUtil.ctol( httpContext.cgiGet( edtParFasCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A1665ParFasDsc = httpContext.cgiGet( edtParFasDsc_Internalname) ;
      n1665ParFasDsc = false ;
      A14160MPEnvPLC = httpContext.cgiGet( edtMPEnvPLC_Internalname) ;
      A14161MPEnvVal = httpContext.cgiGet( edtMPEnvVal_Internalname) ;
      GXCCtl = "Z1664ParFasCod_" + sGXsfl_65_idx ;
      Z1664ParFasCod = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z14160MPEnvPLC_" + sGXsfl_65_idx ;
      Z14160MPEnvPLC = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z14161MPEnvVal_" + sGXsfl_65_idx ;
      Z14161MPEnvVal = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "nRcdDeleted_1894_" + sGXsfl_65_idx ;
      nRcdDeleted_1894 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1894_" + sGXsfl_65_idx ;
      nRcdExists_1894 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1894_" + sGXsfl_65_idx ;
      nIsMod_1894 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtMPEnvVal_Enabled = edtMPEnvVal_Enabled ;
      defedtMPEnvPLC_Enabled = edtMPEnvPLC_Enabled ;
      defedtParFasDsc_Enabled = edtParFasDsc_Enabled ;
      defedtParFasCod_Enabled = edtParFasCod_Enabled ;
   }

   public void confirmValues1TD0( )
   {
      nGXsfl_65_idx = 0 ;
      sGXsfl_65_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_65_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_651894( ) ;
      while ( nGXsfl_65_idx < nRC_GXsfl_65 )
      {
         nGXsfl_65_idx = (int)(nGXsfl_65_idx+1) ;
         sGXsfl_65_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_65_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_651894( ) ;
         httpContext.changePostValue( "Z1664ParFasCod_"+sGXsfl_65_idx, httpContext.cgiGet( "ZT_"+"Z1664ParFasCod_"+sGXsfl_65_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1664ParFasCod_"+sGXsfl_65_idx) ;
         httpContext.changePostValue( "Z14160MPEnvPLC_"+sGXsfl_65_idx, httpContext.cgiGet( "ZT_"+"Z14160MPEnvPLC_"+sGXsfl_65_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z14160MPEnvPLC_"+sGXsfl_65_idx) ;
         httpContext.changePostValue( "Z14161MPEnvVal_"+sGXsfl_65_idx, httpContext.cgiGet( "ZT_"+"Z14161MPEnvVal_"+sGXsfl_65_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z14161MPEnvVal_"+sGXsfl_65_idx) ;
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
      httpContext.AddJavascriptSource("calendar.js", "?"+httpContext.getBuildNumber( 214800), false, true);
      httpContext.AddJavascriptSource("calendar-setup.js", "?"+httpContext.getBuildNumber( 214800), false, true);
      httpContext.AddJavascriptSource("calendar-"+GXutil.substring( httpContext.getLanguageProperty( "culture"), 1, 2)+".js", "?"+httpContext.getBuildNumber( 214800), false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.ingenieria.menv", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV10EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV7BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV9BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV8BarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(AV13MEnvOrd,4,0))}, new String[] {"Gx_mode","EmprCod","BarCod","BarCodReo","BarCodPar","MEnvOrd"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"MEnv");
      forbiddenHiddens.add("MEnvOrd", localUtil.format( DecimalUtil.doubleToDec(A14152MEnvOrd), "ZZZ9"));
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      forbiddenHiddens.add("FasCod", GXutil.rtrim( localUtil.format( A457FasCod, "@!")));
      forbiddenHiddens.add("MEnvMaqCod", GXutil.rtrim( localUtil.format( A14154MEnvMaqCod, "")));
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV21Pgmname, "")));
      forbiddenHiddens.add("MEnvIni", localUtil.format( A14158MEnvIni, "99/99/99 99:99:99.999"));
      forbiddenHiddens.add("MEnvFin", localUtil.format( A14157MEnvFin, "99/99/99 99:99"));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("ingenieria\\menv:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z129BarCod", GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z132BarCodReo", GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z130BarCodPar", GXutil.rtrim( Z130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14152MEnvOrd", GXutil.ltrim( localUtil.ntoc( Z14152MEnvOrd, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14158MEnvIni", localUtil.ttoc( Z14158MEnvIni, 10, 12, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14157MEnvFin", localUtil.ttoc( Z14157MEnvFin, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z457FasCod", GXutil.rtrim( Z457FasCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14154MEnvMaqCod", GXutil.rtrim( Z14154MEnvMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_65", GXutil.ltrim( localUtil.ntoc( nGXsfl_65_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTRNCONTEXT", AV14TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTRNCONTEXT", AV14TrnContext);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTRNCONTEXT", getSecureSignedToken( "", AV14TrnContext));
      app.GxWebStd.gx_hidden_field( httpContext, "MENVHDR", GXutil.rtrim( A14685MEnvHdr));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV10EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV10EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCOD", GXutil.ltrim( localUtil.ntoc( AV7BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV7BarCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODREO", GXutil.ltrim( localUtil.ntoc( AV9BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODREO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV9BarCodReo), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODPAR", GXutil.rtrim( AV8BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODPAR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV8BarCodPar, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMENVORD", GXutil.ltrim( localUtil.ntoc( AV13MEnvOrd, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMENVORD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV13MEnvOrd), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_FASCOD", GXutil.rtrim( AV11Insert_FasCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_MENVMAQCOD", GXutil.rtrim( AV12Insert_MEnvMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "FASDSC", GXutil.rtrim( A460FasDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "MENVMAQDSC", GXutil.rtrim( A14164MEnvMaqDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Objectcall", GXutil.rtrim( Dvpanel_unnamedtable2_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Enabled", GXutil.booltostr( Dvpanel_unnamedtable2_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Width", GXutil.rtrim( Dvpanel_unnamedtable2_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable2_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable2_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Cls", GXutil.rtrim( Dvpanel_unnamedtable2_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Title", GXutil.rtrim( Dvpanel_unnamedtable2_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable2_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable2_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable2_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable2_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable2_Autoscroll));
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
      return formatLink("app.ingenieria.menv", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV10EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV7BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV9BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV8BarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(AV13MEnvOrd,4,0))}, new String[] {"Gx_mode","EmprCod","BarCod","BarCodReo","BarCodPar","MEnvOrd"})  ;
   }

   public String getPgmname( )
   {
      return "Ingenieria.MEnv" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Envíos de parámetros de máquinas", "") ;
   }

   public void initializeNonKey1TD1893( )
   {
      A457FasCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
      A14154MEnvMaqCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14154MEnvMaqCod", A14154MEnvMaqCod);
      A14156MEnvEst = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A14156MEnvEst", GXutil.str( A14156MEnvEst, 1, 0));
      A14162MEnvInt = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A14162MEnvInt", GXutil.ltrimstr( A14162MEnvInt, 10, 2));
      A14685MEnvHdr = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14685MEnvHdr", A14685MEnvHdr);
      A460FasDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", A460FasDsc);
      A14164MEnvMaqDsc = "" ;
      n14164MEnvMaqDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14164MEnvMaqDsc", A14164MEnvMaqDsc);
      A14158MEnvIni = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "A14158MEnvIni", localUtil.ttoc( A14158MEnvIni, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A14157MEnvFin = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "A14157MEnvFin", localUtil.ttoc( A14157MEnvFin, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      Z14158MEnvIni = GXutil.resetTime( GXutil.nullDate() );
      Z14157MEnvFin = GXutil.resetTime( GXutil.nullDate() );
      Z457FasCod = "" ;
      Z14154MEnvMaqCod = "" ;
   }

   public void initAll1TD1893( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A129BarCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
      A132BarCodReo = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
      A130BarCodPar = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      A14152MEnvOrd = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A14152MEnvOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14152MEnvOrd), 4, 0));
      initializeNonKey1TD1893( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1TD1894( )
   {
      A1665ParFasDsc = "" ;
      n1665ParFasDsc = false ;
      A14160MPEnvPLC = "" ;
      A14161MPEnvVal = "" ;
      Z14160MPEnvPLC = "" ;
      Z14161MPEnvVal = "" ;
   }

   public void initAll1TD1894( )
   {
      A1664ParFasCod = (short)(0) ;
      initializeNonKey1TD1894( ) ;
   }

   public void standaloneModalInsert1TD1894( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116101544", true, true);
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
      httpContext.AddJavascriptSource("ingenieria/menv.js", "?202682116101545", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1894( )
   {
      edtMPEnvVal_Enabled = defedtMPEnvVal_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtMPEnvVal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMPEnvVal_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtMPEnvPLC_Enabled = defedtMPEnvPLC_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtMPEnvPLC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMPEnvPLC_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtParFasDsc_Enabled = defedtParFasDsc_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtParFasDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParFasDsc_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtParFasCod_Enabled = defedtParFasCod_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtParFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParFasCod_Enabled), 5, 0), !bGXsfl_65_Refreshing);
   }

   public void startgridcontrol65( )
   {
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("Header", subGrid_Header);
      GridContainer.AddObjectProperty("Class", "GridNoBorder WorkWith");
      GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("CmpContext", "");
      GridContainer.AddObjectProperty("InMasterPage", "false");
      GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1664ParFasCod, (byte)(4), (byte)(0), ".", "")));
      GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtParFasCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      GridContainer.AddColumnProperties(GridColumn);
      GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      GridColumn.AddObjectProperty("Value", GXutil.rtrim( A1665ParFasDsc));
      GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtParFasDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      GridContainer.AddColumnProperties(GridColumn);
      GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      GridColumn.AddObjectProperty("Value", A14160MPEnvPLC);
      GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMPEnvPLC_Enabled, (byte)(5), (byte)(0), ".", "")));
      GridContainer.AddColumnProperties(GridColumn);
      GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      GridColumn.AddObjectProperty("Value", GXutil.rtrim( A14161MPEnvVal));
      GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMPEnvVal_Enabled, (byte)(5), (byte)(0), ".", "")));
      GridContainer.AddColumnProperties(GridColumn);
      GridContainer.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGrid_Selectedindex, (byte)(4), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid_Allowselection, (byte)(1), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid_Collapsed, (byte)(1), (byte)(0), ".", "")));
   }

   public void init_default_properties( )
   {
      edtBarCod_Internalname = "BARCOD" ;
      edtBarCodReo_Internalname = "BARCODREO" ;
      edtBarCodPar_Internalname = "BARCODPAR" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      edtMEnvOrd_Internalname = "MENVORD" ;
      edtFasCod_Internalname = "FASCOD" ;
      edtMEnvMaqCod_Internalname = "MENVMAQCOD" ;
      edtMEnvIni_Internalname = "MENVINI" ;
      edtMEnvFin_Internalname = "MENVFIN" ;
      cmbMEnvEst.setInternalname( "MENVEST" );
      edtParFasCod_Internalname = "PARFASCOD" ;
      edtParFasDsc_Internalname = "PARFASDSC" ;
      edtMPEnvPLC_Internalname = "MPENVPLC" ;
      edtMPEnvVal_Internalname = "MPENVVAL" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      Dvpanel_unnamedtable2_Internalname = "DVPANEL_UNNAMEDTABLE2" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtEmprCod_Internalname = "EMPRCOD" ;
      edtMEnvInt_Internalname = "MENVINT" ;
      divHtml_bottomauxiliarcontrols_Internalname = "HTML_BOTTOMAUXILIARCONTROLS" ;
      divLayoutmaintable_Internalname = "LAYOUTMAINTABLE" ;
      Form.setInternalname( "FORM" );
      subGrid_Internalname = "GRID" ;
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
      subGrid_Allowcollapsing = (byte)(0) ;
      subGrid_Allowselection = (byte)(0) ;
      subGrid_Header = "" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Envíos de parámetros de máquinas", "") );
      edtMPEnvVal_Jsonclick = "" ;
      edtMPEnvPLC_Jsonclick = "" ;
      edtParFasDsc_Jsonclick = "" ;
      edtParFasCod_Jsonclick = "" ;
      subGrid_Class = "GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtMPEnvVal_Enabled = 0 ;
      edtMPEnvPLC_Enabled = 0 ;
      edtParFasDsc_Enabled = 0 ;
      edtParFasCod_Enabled = 0 ;
      edtMEnvInt_Jsonclick = "" ;
      edtMEnvInt_Enabled = 0 ;
      edtMEnvInt_Visible = 1 ;
      edtEmprCod_Jsonclick = "" ;
      edtEmprCod_Enabled = 1 ;
      edtEmprCod_Visible = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      Dvpanel_unnamedtable2_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Iconposition = "Right" ;
      Dvpanel_unnamedtable2_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable2_Title = httpContext.getMessage( "Parámetros", "") ;
      Dvpanel_unnamedtable2_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable2_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable2_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Width = "100%" ;
      cmbMEnvEst.setJsonclick( "" );
      cmbMEnvEst.setEnabled( 0 );
      edtMEnvFin_Jsonclick = "" ;
      edtMEnvFin_Enabled = 0 ;
      edtMEnvIni_Jsonclick = "" ;
      edtMEnvIni_Enabled = 0 ;
      edtMEnvMaqCod_Jsonclick = "" ;
      edtMEnvMaqCod_Enabled = 0 ;
      edtFasCod_Jsonclick = "" ;
      edtFasCod_Enabled = 0 ;
      edtMEnvOrd_Jsonclick = "" ;
      edtMEnvOrd_Enabled = 0 ;
      edtBarCodPar_Jsonclick = "" ;
      edtBarCodPar_Enabled = 0 ;
      edtBarCodReo_Jsonclick = "" ;
      edtBarCodReo_Enabled = 0 ;
      edtBarCod_Jsonclick = "" ;
      edtBarCod_Enabled = 0 ;
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

   public void gxnrgrid_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_651894( ) ;
      while ( nGXsfl_65_idx <= nRC_GXsfl_65 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1TD1894( ) ;
         standaloneModal1TD1894( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1TD1894( ) ;
         nGXsfl_65_idx = (int)(nGXsfl_65_idx+1) ;
         sGXsfl_65_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_65_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_651894( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void init_web_controls( )
   {
      cmbMEnvEst.setName( "MENVEST" );
      cmbMEnvEst.setWebtags( "" );
      cmbMEnvEst.addItem("1", httpContext.getMessage( "A procesar", ""), (short)(0));
      cmbMEnvEst.addItem("2", httpContext.getMessage( "Procesado", ""), (short)(0));
      if ( cmbMEnvEst.getItemCount() > 0 )
      {
         A14156MEnvEst = (byte)(GXutil.lval( cmbMEnvEst.getValidValue(GXutil.trim( GXutil.str( A14156MEnvEst, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14156MEnvEst", GXutil.str( A14156MEnvEst, 1, 0));
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

   public void valid_Emprcod( )
   {
      /* Using cursor T01TD33 */
      pr_default.execute(31, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(31) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      pr_default.close(31);
      dynload_actions( ) ;
      /*  Sending validation outputs */
   }

   public void valid_Fascod( )
   {
      /* Using cursor T01TD20 */
      pr_default.execute(18, new Object[] {A396EmprCod, A457FasCod});
      if ( (pr_default.getStatus(18) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FASPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FASCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A460FasDsc = T01TD20_A460FasDsc[0] ;
      pr_default.close(18);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", GXutil.rtrim( A460FasDsc));
   }

   public void valid_Menvmaqcod( )
   {
      n14164MEnvMaqDsc = false ;
      /* Using cursor T01TD21 */
      pr_default.execute(19, new Object[] {A396EmprCod, A14154MEnvMaqCod});
      if ( (pr_default.getStatus(19) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Máquina", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MENVMAQCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A14164MEnvMaqDsc = T01TD21_A14164MEnvMaqDsc[0] ;
      n14164MEnvMaqDsc = T01TD21_n14164MEnvMaqDsc[0] ;
      pr_default.close(19);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A14164MEnvMaqDsc", GXutil.rtrim( A14164MEnvMaqDsc));
   }

   public void valid_Parfascod( )
   {
      n1665ParFasDsc = false ;
      /* Using cursor T01TD31 */
      pr_default.execute(29, new Object[] {A396EmprCod, Short.valueOf(A1664ParFasCod)});
      if ( (pr_default.getStatus(29) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PARFAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PARFASCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtParFasCod_Internalname ;
      }
      A1665ParFasDsc = T01TD31_A1665ParFasDsc[0] ;
      n1665ParFasDsc = T01TD31_n1665ParFasDsc[0] ;
      pr_default.close(29);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A1665ParFasDsc", GXutil.rtrim( A1665ParFasDsc));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV10EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV7BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV9BarCodReo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV8BarCodPar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'AV13MEnvOrd',fld:'vMENVORD',pic:'ZZZ9',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV14TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true},{av:'AV10EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV7BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV9BarCodReo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV8BarCodPar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'AV13MEnvOrd',fld:'vMENVORD',pic:'ZZZ9',hsh:true},{av:'A14152MEnvOrd',fld:'MENVORD',pic:'ZZZ9'},{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'A14154MEnvMaqCod',fld:'MENVMAQCOD',pic:''},{av:'AV21Pgmname',fld:'vPGMNAME',pic:''},{av:'A14158MEnvIni',fld:'MENVINI',pic:'99/99/99 99:99:99.999'},{av:'A14157MEnvFin',fld:'MENVFIN',pic:'99/99/99 99:99'}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e121TD2',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV14TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true}]");
      setEventMetadata("AFTER TRN",",oparms:[]}");
      setEventMetadata("VALID_BARCOD","{handler:'valid_Barcod',iparms:[]");
      setEventMetadata("VALID_BARCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCODREO","{handler:'valid_Barcodreo',iparms:[]");
      setEventMetadata("VALID_BARCODREO",",oparms:[]}");
      setEventMetadata("VALID_BARCODPAR","{handler:'valid_Barcodpar',iparms:[]");
      setEventMetadata("VALID_BARCODPAR",",oparms:[]}");
      setEventMetadata("VALID_MENVORD","{handler:'valid_Menvord',iparms:[]");
      setEventMetadata("VALID_MENVORD",",oparms:[]}");
      setEventMetadata("VALID_FASCOD","{handler:'valid_Fascod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'A460FasDsc',fld:'FASDSC',pic:''}]");
      setEventMetadata("VALID_FASCOD",",oparms:[{av:'A460FasDsc',fld:'FASDSC',pic:''}]}");
      setEventMetadata("VALID_MENVMAQCOD","{handler:'valid_Menvmaqcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A14154MEnvMaqCod',fld:'MENVMAQCOD',pic:''},{av:'A14164MEnvMaqDsc',fld:'MENVMAQDSC',pic:''}]");
      setEventMetadata("VALID_MENVMAQCOD",",oparms:[{av:'A14164MEnvMaqDsc',fld:'MENVMAQDSC',pic:''}]}");
      setEventMetadata("VALID_MENVINI","{handler:'valid_Menvini',iparms:[]");
      setEventMetadata("VALID_MENVINI",",oparms:[]}");
      setEventMetadata("VALID_MENVFIN","{handler:'valid_Menvfin',iparms:[]");
      setEventMetadata("VALID_MENVFIN",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''}]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_PARFASCOD","{handler:'valid_Parfascod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A1664ParFasCod',fld:'PARFASCOD',pic:'ZZZ9'},{av:'A1665ParFasDsc',fld:'PARFASDSC',pic:''}]");
      setEventMetadata("VALID_PARFASCOD",",oparms:[{av:'A1665ParFasDsc',fld:'PARFASDSC',pic:''}]}");
      setEventMetadata("NULL","{handler:'valid_Mpenvval',iparms:[]");
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
      pr_default.close(29);
      pr_default.close(18);
      pr_default.close(31);
      pr_default.close(19);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      wcpOAV10EmprCod = "" ;
      wcpOAV8BarCodPar = "" ;
      Z396EmprCod = "" ;
      Z130BarCodPar = "" ;
      Z14158MEnvIni = GXutil.resetTime( GXutil.nullDate() );
      Z14157MEnvFin = GXutil.resetTime( GXutil.nullDate() );
      Z457FasCod = "" ;
      Z14154MEnvMaqCod = "" ;
      Z14160MPEnvPLC = "" ;
      Z14161MPEnvVal = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A457FasCod = "" ;
      A14154MEnvMaqCod = "" ;
      A130BarCodPar = "" ;
      Gx_mode = "" ;
      AV10EmprCod = "" ;
      AV8BarCodPar = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      A14158MEnvIni = GXutil.resetTime( GXutil.nullDate() );
      A14157MEnvFin = GXutil.resetTime( GXutil.nullDate() );
      ucDvpanel_unnamedtable2 = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      AV21Pgmname = "" ;
      A14162MEnvInt = DecimalUtil.ZERO ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sMode1894 = "" ;
      sStyleString = "" ;
      A14685MEnvHdr = "" ;
      AV11Insert_FasCod = "" ;
      AV12Insert_MEnvMaqCod = "" ;
      A460FasDsc = "" ;
      A14164MEnvMaqDsc = "" ;
      Dvpanel_unnamedtable2_Objectcall = "" ;
      Dvpanel_unnamedtable2_Class = "" ;
      Dvpanel_unnamedtable2_Height = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode1893 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      A1665ParFasDsc = "" ;
      A14160MPEnvPLC = "" ;
      A14161MPEnvVal = "" ;
      AV18Station = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV19EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV20UsurCod = "" ;
      GXv_char4 = new String[1] ;
      AV17WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext5 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV14TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV16WebSession = httpContext.getWebSession();
      AV15TrnContextAtt = new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      Z460FasDsc = "" ;
      Z14164MEnvMaqDsc = "" ;
      T01TD9_A14164MEnvMaqDsc = new String[] {""} ;
      T01TD9_n14164MEnvMaqDsc = new boolean[] {false} ;
      T01TD7_A460FasDsc = new String[] {""} ;
      T01TD10_A14152MEnvOrd = new short[1] ;
      T01TD10_A460FasDsc = new String[] {""} ;
      T01TD10_A14164MEnvMaqDsc = new String[] {""} ;
      T01TD10_n14164MEnvMaqDsc = new boolean[] {false} ;
      T01TD10_A14158MEnvIni = new java.util.Date[] {GXutil.nullDate()} ;
      T01TD10_A14157MEnvFin = new java.util.Date[] {GXutil.nullDate()} ;
      T01TD10_A396EmprCod = new String[] {""} ;
      T01TD10_A457FasCod = new String[] {""} ;
      T01TD10_A129BarCod = new int[1] ;
      T01TD10_A132BarCodReo = new byte[1] ;
      T01TD10_A130BarCodPar = new String[] {""} ;
      T01TD10_A14154MEnvMaqCod = new String[] {""} ;
      T01TD8_A396EmprCod = new String[] {""} ;
      T01TD11_A460FasDsc = new String[] {""} ;
      T01TD12_A14164MEnvMaqDsc = new String[] {""} ;
      T01TD12_n14164MEnvMaqDsc = new boolean[] {false} ;
      T01TD13_A396EmprCod = new String[] {""} ;
      T01TD14_A396EmprCod = new String[] {""} ;
      T01TD14_A129BarCod = new int[1] ;
      T01TD14_A132BarCodReo = new byte[1] ;
      T01TD14_A130BarCodPar = new String[] {""} ;
      T01TD14_A14152MEnvOrd = new short[1] ;
      T01TD6_A14152MEnvOrd = new short[1] ;
      T01TD6_A14158MEnvIni = new java.util.Date[] {GXutil.nullDate()} ;
      T01TD6_A14157MEnvFin = new java.util.Date[] {GXutil.nullDate()} ;
      T01TD6_A396EmprCod = new String[] {""} ;
      T01TD6_A457FasCod = new String[] {""} ;
      T01TD6_A129BarCod = new int[1] ;
      T01TD6_A132BarCodReo = new byte[1] ;
      T01TD6_A130BarCodPar = new String[] {""} ;
      T01TD6_A14154MEnvMaqCod = new String[] {""} ;
      T01TD15_A396EmprCod = new String[] {""} ;
      T01TD15_A129BarCod = new int[1] ;
      T01TD15_A132BarCodReo = new byte[1] ;
      T01TD15_A130BarCodPar = new String[] {""} ;
      T01TD15_A14152MEnvOrd = new short[1] ;
      T01TD16_A396EmprCod = new String[] {""} ;
      T01TD16_A129BarCod = new int[1] ;
      T01TD16_A132BarCodReo = new byte[1] ;
      T01TD16_A130BarCodPar = new String[] {""} ;
      T01TD16_A14152MEnvOrd = new short[1] ;
      T01TD5_A14152MEnvOrd = new short[1] ;
      T01TD5_A14158MEnvIni = new java.util.Date[] {GXutil.nullDate()} ;
      T01TD5_A14157MEnvFin = new java.util.Date[] {GXutil.nullDate()} ;
      T01TD5_A396EmprCod = new String[] {""} ;
      T01TD5_A457FasCod = new String[] {""} ;
      T01TD5_A129BarCod = new int[1] ;
      T01TD5_A132BarCodReo = new byte[1] ;
      T01TD5_A130BarCodPar = new String[] {""} ;
      T01TD5_A14154MEnvMaqCod = new String[] {""} ;
      T01TD20_A460FasDsc = new String[] {""} ;
      T01TD21_A14164MEnvMaqDsc = new String[] {""} ;
      T01TD21_n14164MEnvMaqDsc = new boolean[] {false} ;
      T01TD22_A14674MEPrId = new long[1] ;
      T01TD23_A396EmprCod = new String[] {""} ;
      T01TD23_A129BarCod = new int[1] ;
      T01TD23_A132BarCodReo = new byte[1] ;
      T01TD23_A130BarCodPar = new String[] {""} ;
      T01TD23_A14152MEnvOrd = new short[1] ;
      T01TD23_A14153MRecLin = new long[1] ;
      T01TD24_A396EmprCod = new String[] {""} ;
      T01TD24_A129BarCod = new int[1] ;
      T01TD24_A132BarCodReo = new byte[1] ;
      T01TD24_A130BarCodPar = new String[] {""} ;
      T01TD24_A14152MEnvOrd = new short[1] ;
      Z1665ParFasDsc = "" ;
      T01TD25_A129BarCod = new int[1] ;
      T01TD25_A132BarCodReo = new byte[1] ;
      T01TD25_A130BarCodPar = new String[] {""} ;
      T01TD25_A14152MEnvOrd = new short[1] ;
      T01TD25_A1665ParFasDsc = new String[] {""} ;
      T01TD25_n1665ParFasDsc = new boolean[] {false} ;
      T01TD25_A14160MPEnvPLC = new String[] {""} ;
      T01TD25_A14161MPEnvVal = new String[] {""} ;
      T01TD25_A396EmprCod = new String[] {""} ;
      T01TD25_A1664ParFasCod = new short[1] ;
      T01TD4_A1665ParFasDsc = new String[] {""} ;
      T01TD4_n1665ParFasDsc = new boolean[] {false} ;
      GXCCtl = "" ;
      T01TD26_A1665ParFasDsc = new String[] {""} ;
      T01TD26_n1665ParFasDsc = new boolean[] {false} ;
      T01TD27_A396EmprCod = new String[] {""} ;
      T01TD27_A129BarCod = new int[1] ;
      T01TD27_A132BarCodReo = new byte[1] ;
      T01TD27_A130BarCodPar = new String[] {""} ;
      T01TD27_A14152MEnvOrd = new short[1] ;
      T01TD27_A1664ParFasCod = new short[1] ;
      T01TD3_A129BarCod = new int[1] ;
      T01TD3_A132BarCodReo = new byte[1] ;
      T01TD3_A130BarCodPar = new String[] {""} ;
      T01TD3_A14152MEnvOrd = new short[1] ;
      T01TD3_A14160MPEnvPLC = new String[] {""} ;
      T01TD3_A14161MPEnvVal = new String[] {""} ;
      T01TD3_A396EmprCod = new String[] {""} ;
      T01TD3_A1664ParFasCod = new short[1] ;
      T01TD2_A129BarCod = new int[1] ;
      T01TD2_A132BarCodReo = new byte[1] ;
      T01TD2_A130BarCodPar = new String[] {""} ;
      T01TD2_A14152MEnvOrd = new short[1] ;
      T01TD2_A14160MPEnvPLC = new String[] {""} ;
      T01TD2_A14161MPEnvVal = new String[] {""} ;
      T01TD2_A396EmprCod = new String[] {""} ;
      T01TD2_A1664ParFasCod = new short[1] ;
      T01TD31_A1665ParFasDsc = new String[] {""} ;
      T01TD31_n1665ParFasDsc = new boolean[] {false} ;
      T01TD32_A396EmprCod = new String[] {""} ;
      T01TD32_A129BarCod = new int[1] ;
      T01TD32_A132BarCodReo = new byte[1] ;
      T01TD32_A130BarCodPar = new String[] {""} ;
      T01TD32_A14152MEnvOrd = new short[1] ;
      T01TD32_A1664ParFasCod = new short[1] ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      T01TD33_A396EmprCod = new String[] {""} ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.ingenieria.menv__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.ingenieria.menv__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.ingenieria.menv__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.ingenieria.menv__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ingenieria.menv__default(),
         new Object[] {
             new Object[] {
            T01TD2_A129BarCod, T01TD2_A132BarCodReo, T01TD2_A130BarCodPar, T01TD2_A14152MEnvOrd, T01TD2_A14160MPEnvPLC, T01TD2_A14161MPEnvVal, T01TD2_A396EmprCod, T01TD2_A1664ParFasCod
            }
            , new Object[] {
            T01TD3_A129BarCod, T01TD3_A132BarCodReo, T01TD3_A130BarCodPar, T01TD3_A14152MEnvOrd, T01TD3_A14160MPEnvPLC, T01TD3_A14161MPEnvVal, T01TD3_A396EmprCod, T01TD3_A1664ParFasCod
            }
            , new Object[] {
            T01TD4_A1665ParFasDsc, T01TD4_n1665ParFasDsc
            }
            , new Object[] {
            T01TD5_A14152MEnvOrd, T01TD5_A14158MEnvIni, T01TD5_A14157MEnvFin, T01TD5_A396EmprCod, T01TD5_A457FasCod, T01TD5_A129BarCod, T01TD5_A132BarCodReo, T01TD5_A130BarCodPar, T01TD5_A14154MEnvMaqCod
            }
            , new Object[] {
            T01TD6_A14152MEnvOrd, T01TD6_A14158MEnvIni, T01TD6_A14157MEnvFin, T01TD6_A396EmprCod, T01TD6_A457FasCod, T01TD6_A129BarCod, T01TD6_A132BarCodReo, T01TD6_A130BarCodPar, T01TD6_A14154MEnvMaqCod
            }
            , new Object[] {
            T01TD7_A460FasDsc
            }
            , new Object[] {
            T01TD8_A396EmprCod
            }
            , new Object[] {
            T01TD9_A14164MEnvMaqDsc, T01TD9_n14164MEnvMaqDsc
            }
            , new Object[] {
            T01TD10_A14152MEnvOrd, T01TD10_A460FasDsc, T01TD10_A14164MEnvMaqDsc, T01TD10_n14164MEnvMaqDsc, T01TD10_A14158MEnvIni, T01TD10_A14157MEnvFin, T01TD10_A396EmprCod, T01TD10_A457FasCod, T01TD10_A129BarCod, T01TD10_A132BarCodReo,
            T01TD10_A130BarCodPar, T01TD10_A14154MEnvMaqCod
            }
            , new Object[] {
            T01TD11_A460FasDsc
            }
            , new Object[] {
            T01TD12_A14164MEnvMaqDsc, T01TD12_n14164MEnvMaqDsc
            }
            , new Object[] {
            T01TD13_A396EmprCod
            }
            , new Object[] {
            T01TD14_A396EmprCod, T01TD14_A129BarCod, T01TD14_A132BarCodReo, T01TD14_A130BarCodPar, T01TD14_A14152MEnvOrd
            }
            , new Object[] {
            T01TD15_A396EmprCod, T01TD15_A129BarCod, T01TD15_A132BarCodReo, T01TD15_A130BarCodPar, T01TD15_A14152MEnvOrd
            }
            , new Object[] {
            T01TD16_A396EmprCod, T01TD16_A129BarCod, T01TD16_A132BarCodReo, T01TD16_A130BarCodPar, T01TD16_A14152MEnvOrd
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01TD20_A460FasDsc
            }
            , new Object[] {
            T01TD21_A14164MEnvMaqDsc, T01TD21_n14164MEnvMaqDsc
            }
            , new Object[] {
            T01TD22_A14674MEPrId
            }
            , new Object[] {
            T01TD23_A396EmprCod, T01TD23_A129BarCod, T01TD23_A132BarCodReo, T01TD23_A130BarCodPar, T01TD23_A14152MEnvOrd, T01TD23_A14153MRecLin
            }
            , new Object[] {
            T01TD24_A396EmprCod, T01TD24_A129BarCod, T01TD24_A132BarCodReo, T01TD24_A130BarCodPar, T01TD24_A14152MEnvOrd
            }
            , new Object[] {
            T01TD25_A129BarCod, T01TD25_A132BarCodReo, T01TD25_A130BarCodPar, T01TD25_A14152MEnvOrd, T01TD25_A1665ParFasDsc, T01TD25_n1665ParFasDsc, T01TD25_A14160MPEnvPLC, T01TD25_A14161MPEnvVal, T01TD25_A396EmprCod, T01TD25_A1664ParFasCod
            }
            , new Object[] {
            T01TD26_A1665ParFasDsc, T01TD26_n1665ParFasDsc
            }
            , new Object[] {
            T01TD27_A396EmprCod, T01TD27_A129BarCod, T01TD27_A132BarCodReo, T01TD27_A130BarCodPar, T01TD27_A14152MEnvOrd, T01TD27_A1664ParFasCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01TD31_A1665ParFasDsc, T01TD31_n1665ParFasDsc
            }
            , new Object[] {
            T01TD32_A396EmprCod, T01TD32_A129BarCod, T01TD32_A132BarCodReo, T01TD32_A130BarCodPar, T01TD32_A14152MEnvOrd, T01TD32_A1664ParFasCod
            }
            , new Object[] {
            T01TD33_A396EmprCod
            }
         }
      );
      AV21Pgmname = "Ingenieria.MEnv" ;
   }

   private byte wcpOAV9BarCodReo ;
   private byte Z132BarCodReo ;
   private byte GxWebError ;
   private byte A132BarCodReo ;
   private byte AV9BarCodReo ;
   private byte nKeyPressed ;
   private byte A14156MEnvEst ;
   private byte Gx_BScreen ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short wcpOAV13MEnvOrd ;
   private short Z14152MEnvOrd ;
   private short Z1664ParFasCod ;
   private short nRcdDeleted_1894 ;
   private short nRcdExists_1894 ;
   private short nIsMod_1894 ;
   private short A1664ParFasCod ;
   private short AV13MEnvOrd ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A14152MEnvOrd ;
   private short nBlankRcdCount1894 ;
   private short RcdFound1894 ;
   private short nBlankRcdUsr1894 ;
   private short RcdFound1893 ;
   private short nIsDirty_1893 ;
   private short nIsDirty_1894 ;
   private int wcpOAV7BarCod ;
   private int Z129BarCod ;
   private int nRC_GXsfl_65 ;
   private int nGXsfl_65_idx=1 ;
   private int A129BarCod ;
   private int AV7BarCod ;
   private int trnEnded ;
   private int edtBarCod_Enabled ;
   private int edtBarCodReo_Enabled ;
   private int edtBarCodPar_Enabled ;
   private int edtMEnvOrd_Enabled ;
   private int edtFasCod_Enabled ;
   private int edtMEnvMaqCod_Enabled ;
   private int edtMEnvIni_Enabled ;
   private int edtMEnvFin_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int edtavPgmname_Enabled ;
   private int edtEmprCod_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtMEnvInt_Enabled ;
   private int edtMEnvInt_Visible ;
   private int edtParFasCod_Enabled ;
   private int edtParFasDsc_Enabled ;
   private int edtMPEnvPLC_Enabled ;
   private int edtMPEnvVal_Enabled ;
   private int fRowAdded ;
   private int AV22GXV1 ;
   private int GX_JID ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int defedtMPEnvVal_Enabled ;
   private int defedtMPEnvPLC_Enabled ;
   private int defedtParFasDsc_Enabled ;
   private int defedtParFasCod_Enabled ;
   private int idxLst ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private java.math.BigDecimal A14162MEnvInt ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV10EmprCod ;
   private String wcpOAV8BarCodPar ;
   private String Z396EmprCod ;
   private String Z130BarCodPar ;
   private String Z457FasCod ;
   private String Z14154MEnvMaqCod ;
   private String Z14161MPEnvVal ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A457FasCod ;
   private String A14154MEnvMaqCod ;
   private String A130BarCodPar ;
   private String Gx_mode ;
   private String AV10EmprCod ;
   private String AV8BarCodPar ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtEmprCod_Internalname ;
   private String sGXsfl_65_idx="0001" ;
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
   private String edtBarCod_Internalname ;
   private String edtBarCod_Jsonclick ;
   private String edtBarCodReo_Internalname ;
   private String edtBarCodReo_Jsonclick ;
   private String edtBarCodPar_Internalname ;
   private String edtBarCodPar_Jsonclick ;
   private String edtMEnvOrd_Internalname ;
   private String edtMEnvOrd_Jsonclick ;
   private String edtFasCod_Internalname ;
   private String edtFasCod_Jsonclick ;
   private String edtMEnvMaqCod_Internalname ;
   private String edtMEnvMaqCod_Jsonclick ;
   private String edtMEnvIni_Internalname ;
   private String edtMEnvIni_Jsonclick ;
   private String edtMEnvFin_Internalname ;
   private String edtMEnvFin_Jsonclick ;
   private String Dvpanel_unnamedtable2_Width ;
   private String Dvpanel_unnamedtable2_Cls ;
   private String Dvpanel_unnamedtable2_Title ;
   private String Dvpanel_unnamedtable2_Iconposition ;
   private String Dvpanel_unnamedtable2_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String TempTags ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String edtavPgmname_Internalname ;
   private String AV21Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String edtEmprCod_Jsonclick ;
   private String edtMEnvInt_Internalname ;
   private String edtMEnvInt_Jsonclick ;
   private String sMode1894 ;
   private String edtParFasCod_Internalname ;
   private String edtParFasDsc_Internalname ;
   private String edtMPEnvPLC_Internalname ;
   private String edtMPEnvVal_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String A14685MEnvHdr ;
   private String AV11Insert_FasCod ;
   private String AV12Insert_MEnvMaqCod ;
   private String A460FasDsc ;
   private String A14164MEnvMaqDsc ;
   private String Dvpanel_unnamedtable2_Objectcall ;
   private String Dvpanel_unnamedtable2_Class ;
   private String Dvpanel_unnamedtable2_Height ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String hsh ;
   private String sMode1893 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String A1665ParFasDsc ;
   private String A14161MPEnvVal ;
   private String AV18Station ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV19EmprNom ;
   private String GXv_char3[] ;
   private String AV20UsurCod ;
   private String GXv_char4[] ;
   private String Z460FasDsc ;
   private String Z14164MEnvMaqDsc ;
   private String Z1665ParFasDsc ;
   private String GXCCtl ;
   private String sGXsfl_65_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ROClassString ;
   private String edtParFasCod_Jsonclick ;
   private String edtParFasDsc_Jsonclick ;
   private String edtMPEnvPLC_Jsonclick ;
   private String edtMPEnvVal_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid_Header ;
   private java.util.Date Z14158MEnvIni ;
   private java.util.Date Z14157MEnvFin ;
   private java.util.Date A14158MEnvIni ;
   private java.util.Date A14157MEnvFin ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean Dvpanel_tableattributes_Autowidth ;
   private boolean Dvpanel_tableattributes_Autoheight ;
   private boolean Dvpanel_tableattributes_Collapsible ;
   private boolean Dvpanel_tableattributes_Collapsed ;
   private boolean Dvpanel_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_tableattributes_Autoscroll ;
   private boolean Dvpanel_unnamedtable2_Autowidth ;
   private boolean Dvpanel_unnamedtable2_Autoheight ;
   private boolean Dvpanel_unnamedtable2_Collapsible ;
   private boolean Dvpanel_unnamedtable2_Collapsed ;
   private boolean Dvpanel_unnamedtable2_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable2_Autoscroll ;
   private boolean bGXsfl_65_Refreshing=false ;
   private boolean n14164MEnvMaqDsc ;
   private boolean Dvpanel_unnamedtable2_Enabled ;
   private boolean Dvpanel_unnamedtable2_Showheader ;
   private boolean Dvpanel_unnamedtable2_Visible ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean returnInSub ;
   private boolean n1665ParFasDsc ;
   private String Z14160MPEnvPLC ;
   private String A14160MPEnvPLC ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.WebSession AV16WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable2 ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbMEnvEst ;
   private IDataStoreProvider pr_default ;
   private String[] T01TD9_A14164MEnvMaqDsc ;
   private boolean[] T01TD9_n14164MEnvMaqDsc ;
   private String[] T01TD7_A460FasDsc ;
   private short[] T01TD10_A14152MEnvOrd ;
   private String[] T01TD10_A460FasDsc ;
   private String[] T01TD10_A14164MEnvMaqDsc ;
   private boolean[] T01TD10_n14164MEnvMaqDsc ;
   private java.util.Date[] T01TD10_A14158MEnvIni ;
   private java.util.Date[] T01TD10_A14157MEnvFin ;
   private String[] T01TD10_A396EmprCod ;
   private String[] T01TD10_A457FasCod ;
   private int[] T01TD10_A129BarCod ;
   private byte[] T01TD10_A132BarCodReo ;
   private String[] T01TD10_A130BarCodPar ;
   private String[] T01TD10_A14154MEnvMaqCod ;
   private String[] T01TD8_A396EmprCod ;
   private String[] T01TD11_A460FasDsc ;
   private String[] T01TD12_A14164MEnvMaqDsc ;
   private boolean[] T01TD12_n14164MEnvMaqDsc ;
   private String[] T01TD13_A396EmprCod ;
   private String[] T01TD14_A396EmprCod ;
   private int[] T01TD14_A129BarCod ;
   private byte[] T01TD14_A132BarCodReo ;
   private String[] T01TD14_A130BarCodPar ;
   private short[] T01TD14_A14152MEnvOrd ;
   private short[] T01TD6_A14152MEnvOrd ;
   private java.util.Date[] T01TD6_A14158MEnvIni ;
   private java.util.Date[] T01TD6_A14157MEnvFin ;
   private String[] T01TD6_A396EmprCod ;
   private String[] T01TD6_A457FasCod ;
   private int[] T01TD6_A129BarCod ;
   private byte[] T01TD6_A132BarCodReo ;
   private String[] T01TD6_A130BarCodPar ;
   private String[] T01TD6_A14154MEnvMaqCod ;
   private String[] T01TD15_A396EmprCod ;
   private int[] T01TD15_A129BarCod ;
   private byte[] T01TD15_A132BarCodReo ;
   private String[] T01TD15_A130BarCodPar ;
   private short[] T01TD15_A14152MEnvOrd ;
   private String[] T01TD16_A396EmprCod ;
   private int[] T01TD16_A129BarCod ;
   private byte[] T01TD16_A132BarCodReo ;
   private String[] T01TD16_A130BarCodPar ;
   private short[] T01TD16_A14152MEnvOrd ;
   private short[] T01TD5_A14152MEnvOrd ;
   private java.util.Date[] T01TD5_A14158MEnvIni ;
   private java.util.Date[] T01TD5_A14157MEnvFin ;
   private String[] T01TD5_A396EmprCod ;
   private String[] T01TD5_A457FasCod ;
   private int[] T01TD5_A129BarCod ;
   private byte[] T01TD5_A132BarCodReo ;
   private String[] T01TD5_A130BarCodPar ;
   private String[] T01TD5_A14154MEnvMaqCod ;
   private String[] T01TD20_A460FasDsc ;
   private String[] T01TD21_A14164MEnvMaqDsc ;
   private boolean[] T01TD21_n14164MEnvMaqDsc ;
   private long[] T01TD22_A14674MEPrId ;
   private String[] T01TD23_A396EmprCod ;
   private int[] T01TD23_A129BarCod ;
   private byte[] T01TD23_A132BarCodReo ;
   private String[] T01TD23_A130BarCodPar ;
   private short[] T01TD23_A14152MEnvOrd ;
   private long[] T01TD23_A14153MRecLin ;
   private String[] T01TD24_A396EmprCod ;
   private int[] T01TD24_A129BarCod ;
   private byte[] T01TD24_A132BarCodReo ;
   private String[] T01TD24_A130BarCodPar ;
   private short[] T01TD24_A14152MEnvOrd ;
   private int[] T01TD25_A129BarCod ;
   private byte[] T01TD25_A132BarCodReo ;
   private String[] T01TD25_A130BarCodPar ;
   private short[] T01TD25_A14152MEnvOrd ;
   private String[] T01TD25_A1665ParFasDsc ;
   private boolean[] T01TD25_n1665ParFasDsc ;
   private String[] T01TD25_A14160MPEnvPLC ;
   private String[] T01TD25_A14161MPEnvVal ;
   private String[] T01TD25_A396EmprCod ;
   private short[] T01TD25_A1664ParFasCod ;
   private String[] T01TD4_A1665ParFasDsc ;
   private boolean[] T01TD4_n1665ParFasDsc ;
   private String[] T01TD26_A1665ParFasDsc ;
   private boolean[] T01TD26_n1665ParFasDsc ;
   private String[] T01TD27_A396EmprCod ;
   private int[] T01TD27_A129BarCod ;
   private byte[] T01TD27_A132BarCodReo ;
   private String[] T01TD27_A130BarCodPar ;
   private short[] T01TD27_A14152MEnvOrd ;
   private short[] T01TD27_A1664ParFasCod ;
   private int[] T01TD3_A129BarCod ;
   private byte[] T01TD3_A132BarCodReo ;
   private String[] T01TD3_A130BarCodPar ;
   private short[] T01TD3_A14152MEnvOrd ;
   private String[] T01TD3_A14160MPEnvPLC ;
   private String[] T01TD3_A14161MPEnvVal ;
   private String[] T01TD3_A396EmprCod ;
   private short[] T01TD3_A1664ParFasCod ;
   private int[] T01TD2_A129BarCod ;
   private byte[] T01TD2_A132BarCodReo ;
   private String[] T01TD2_A130BarCodPar ;
   private short[] T01TD2_A14152MEnvOrd ;
   private String[] T01TD2_A14160MPEnvPLC ;
   private String[] T01TD2_A14161MPEnvVal ;
   private String[] T01TD2_A396EmprCod ;
   private short[] T01TD2_A1664ParFasCod ;
   private String[] T01TD31_A1665ParFasDsc ;
   private boolean[] T01TD31_n1665ParFasDsc ;
   private String[] T01TD32_A396EmprCod ;
   private int[] T01TD32_A129BarCod ;
   private byte[] T01TD32_A132BarCodReo ;
   private String[] T01TD32_A130BarCodPar ;
   private short[] T01TD32_A14152MEnvOrd ;
   private short[] T01TD32_A1664ParFasCod ;
   private String[] T01TD33_A396EmprCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV14TrnContext ;
   private app.wwpbaseobjects.SdtWWPTransactionContext_Attribute AV15TrnContextAtt ;
   private app.wwpbaseobjects.SdtWWPContext AV17WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext5[] ;
}

final  class menv__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class menv__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class menv__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class menv__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class menv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01TD2", "SELECT BarCod, BarCodReo, BarCodPar, MEnvOrd, MPEnvPLC, MPEnvVal, EmprCod, ParFasCod FROM TXPMPEnv WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND MEnvOrd = ? AND ParFasCod = ?  FOR UPDATE OF MPEnvPLC, MPEnvVal NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TD3", "SELECT BarCod, BarCodReo, BarCodPar, MEnvOrd, MPEnvPLC, MPEnvVal, EmprCod, ParFasCod FROM TXPMPEnv WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND MEnvOrd = ? AND ParFasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TD4", "SELECT ParFasDsc FROM TXPPARFAS WHERE EmprCod = ? AND ParFasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TD5", "SELECT MEnvOrd, MEnvIni, MEnvFin, EmprCod, FasCod, BarCod, BarCodReo, BarCodPar, MEnvMaqCod FROM TXPMEnv WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND MEnvOrd = ?  FOR UPDATE OF MEnvIni, MEnvFin, FasCod, MEnvMaqCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TD6", "SELECT MEnvOrd, MEnvIni, MEnvFin, EmprCod, FasCod, BarCod, BarCodReo, BarCodPar, MEnvMaqCod FROM TXPMEnv WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND MEnvOrd = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TD7", "SELECT FasDsc FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TD8", "SELECT EmprCod FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TD9", "SELECT MaqDsc AS MEnvMaqDsc FROM TXPMAQUIN WHERE EmprCod = ? AND MaqCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TD10", "SELECT /*+ FIRST_ROWS(100) */ TM1.MEnvOrd, T2.FasDsc, T3.MaqDsc AS MEnvMaqDsc, TM1.MEnvIni, TM1.MEnvFin, TM1.EmprCod, TM1.FasCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar, TM1.MEnvMaqCod AS MEnvMaqCod FROM ((TXPMEnv TM1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = TM1.EmprCod AND T2.FasCod = TM1.FasCod) INNER JOIN TXPMAQUIN T3 ON T3.EmprCod = TM1.EmprCod AND T3.MaqCod = TM1.MEnvMaqCod) WHERE TM1.EmprCod = ? and TM1.BarCod = ? and TM1.BarCodReo = ? and TM1.BarCodPar = ? and TM1.MEnvOrd = ? ORDER BY TM1.EmprCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar, TM1.MEnvOrd ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TD11", "SELECT FasDsc FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TD12", "SELECT MaqDsc AS MEnvMaqDsc FROM TXPMAQUIN WHERE EmprCod = ? AND MaqCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TD13", "SELECT EmprCod FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TD14", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar, MEnvOrd FROM TXPMEnv WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND MEnvOrd = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TD15", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar, MEnvOrd FROM TXPMEnv WHERE ( EmprCod > ? or EmprCod = ? and BarCod > ? or BarCod = ? and EmprCod = ? and BarCodReo > ? or BarCodReo = ? and BarCod = ? and EmprCod = ? and BarCodPar > ? or BarCodPar = ? and BarCodReo = ? and BarCod = ? and EmprCod = ? and MEnvOrd > ?) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, MEnvOrd) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01TD16", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar, MEnvOrd FROM TXPMEnv WHERE ( EmprCod < ? or EmprCod = ? and BarCod < ? or BarCod = ? and EmprCod = ? and BarCodReo < ? or BarCodReo = ? and BarCod = ? and EmprCod = ? and BarCodPar < ? or BarCodPar = ? and BarCodReo = ? and BarCod = ? and EmprCod = ? and MEnvOrd < ?) ORDER BY EmprCod DESC, BarCod DESC, BarCodReo DESC, BarCodPar DESC, MEnvOrd DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01TD17", "INSERT INTO TXPMEnv(MEnvOrd, MEnvIni, MEnvFin, EmprCod, FasCod, BarCod, BarCodReo, BarCodPar, MEnvMaqCod, MRecHdr) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ' ')", GX_NOMASK, "TXPMEnv")
         ,new UpdateCursor("T01TD18", "UPDATE TXPMEnv SET MEnvIni=?, MEnvFin=?, FasCod=?, MEnvMaqCod=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND MEnvOrd = ?", GX_NOMASK, "TXPMEnv")
         ,new UpdateCursor("T01TD19", "DELETE FROM TXPMEnv  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND MEnvOrd = ?", GX_NOMASK, "TXPMEnv")
         ,new ForEachCursor("T01TD20", "SELECT FasDsc FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TD21", "SELECT MaqDsc AS MEnvMaqDsc FROM TXPMAQUIN WHERE EmprCod = ? AND MaqCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TD22", "SELECT * FROM (SELECT MEPrId FROM MEPr WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND MEnvOrd = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01TD23", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, MEnvOrd, MRecLin FROM TXPMPRec WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND MEnvOrd = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01TD24", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, BarCod, BarCodReo, BarCodPar, MEnvOrd FROM TXPMEnv ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, MEnvOrd ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TD25", "SELECT T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.MEnvOrd, T2.ParFasDsc, T1.MPEnvPLC, T1.MPEnvVal, T1.EmprCod, T1.ParFasCod FROM (TXPMPEnv T1 INNER JOIN TXPPARFAS T2 ON T2.EmprCod = T1.EmprCod AND T2.ParFasCod = T1.ParFasCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.MEnvOrd = ? and T1.ParFasCod = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.MEnvOrd, T1.ParFasCod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TD26", "SELECT ParFasDsc FROM TXPPARFAS WHERE EmprCod = ? AND ParFasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TD27", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, MEnvOrd, ParFasCod FROM TXPMPEnv WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND MEnvOrd = ? AND ParFasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01TD28", "INSERT INTO TXPMPEnv(BarCod, BarCodReo, BarCodPar, MEnvOrd, MPEnvPLC, MPEnvVal, EmprCod, ParFasCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPMPEnv")
         ,new UpdateCursor("T01TD29", "UPDATE TXPMPEnv SET MPEnvPLC=?, MPEnvVal=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND MEnvOrd = ? AND ParFasCod = ?", GX_NOMASK, "TXPMPEnv")
         ,new UpdateCursor("T01TD30", "DELETE FROM TXPMPEnv  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND MEnvOrd = ? AND ParFasCod = ?", GX_NOMASK, "TXPMPEnv")
         ,new ForEachCursor("T01TD31", "SELECT ParFasDsc FROM TXPPARFAS WHERE EmprCod = ? AND ParFasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TD32", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, MEnvOrd, ParFasCod FROM TXPMPEnv WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and MEnvOrd = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, MEnvOrd, ParFasCod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TD33", "SELECT EmprCod FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 3);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 3);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2, true);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((String[]) buf[8])[0] = rslt.getString(9, 6);
               return;
            case 4 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2, true);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((String[]) buf[8])[0] = rslt.getString(9, 6);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 28);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 8 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 28);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(4, true);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 3);
               ((String[]) buf[7])[0] = rslt.getString(7, 8);
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((byte[]) buf[9])[0] = rslt.getByte(9);
               ((String[]) buf[10])[0] = rslt.getString(10, 1);
               ((String[]) buf[11])[0] = rslt.getString(11, 6);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 28);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 28);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 20 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((long[]) buf[5])[0] = rslt.getLong(6);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 23 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 12);
               ((String[]) buf[8])[0] = rslt.getString(8, 3);
               ((short[]) buf[9])[0] = rslt.getShort(9);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
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
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 31 :
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 3);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setString(9, (String)parms[8], 3);
               stmt.setString(10, (String)parms[9], 1);
               stmt.setString(11, (String)parms[10], 1);
               stmt.setByte(12, ((Number) parms[11]).byteValue());
               stmt.setInt(13, ((Number) parms[12]).intValue());
               stmt.setString(14, (String)parms[13], 3);
               stmt.setShort(15, ((Number) parms[14]).shortValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 3);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setString(9, (String)parms[8], 3);
               stmt.setString(10, (String)parms[9], 1);
               stmt.setString(11, (String)parms[10], 1);
               stmt.setByte(12, ((Number) parms[11]).byteValue());
               stmt.setInt(13, ((Number) parms[12]).intValue());
               stmt.setString(14, (String)parms[13], 3);
               stmt.setShort(15, ((Number) parms[14]).shortValue());
               return;
            case 15 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setDateTime(2, (java.util.Date)parms[1], false, true);
               stmt.setDateTime(3, (java.util.Date)parms[2], false);
               stmt.setString(4, (String)parms[3], 3);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setString(8, (String)parms[7], 1);
               stmt.setString(9, (String)parms[8], 6);
               return;
            case 16 :
               stmt.setDateTime(1, (java.util.Date)parms[0], false, true);
               stmt.setDateTime(2, (java.util.Date)parms[1], false);
               stmt.setString(3, (String)parms[2], 8);
               stmt.setString(4, (String)parms[3], 6);
               stmt.setString(5, (String)parms[4], 3);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setString(8, (String)parms[7], 1);
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 26 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 1);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setVarchar(5, (String)parms[4], 100, false);
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 3);
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               return;
            case 27 :
               stmt.setVarchar(1, (String)parms[0], 100, false);
               stmt.setString(2, (String)parms[1], 12);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 1);
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               return;
            case 28 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 29 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 31 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

