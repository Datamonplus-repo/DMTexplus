package app.expedicionesautomatizadas ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class metpid_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_25") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A12996MetPieDfID = (short)(GXutil.lval( httpContext.GetPar( "MetPieDfID"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A12996MetPieDfID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12996MetPieDfID), 4, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_25( A396EmprCod, A12996MetPieDfID) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_24") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A2809MetTerCod = httpContext.GetPar( "MetTerCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A2809MetTerCod", A2809MetTerCod);
         A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A2813MetPieCod = httpContext.GetPar( "MetPieCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A2813MetPieCod", A2813MetPieCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_24( A396EmprCod, A2809MetTerCod, A129BarCod, A132BarCodReo, A130BarCodPar, A2813MetPieCod) ;
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
            AV32EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32EmprCod", AV32EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV32EmprCod, "@!"))));
            AV34MetTerCod = httpContext.GetPar( "MetTerCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34MetTerCod", AV34MetTerCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMETTERCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV34MetTerCod, ""))));
            AV35BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35BarCod), 8, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV35BarCod), "ZZZZZZZ9")));
            AV36BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36BarCodReo", GXutil.str( AV36BarCodReo, 1, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODREO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV36BarCodReo), "9")));
            AV37BarCodPar = httpContext.GetPar( "BarCodPar") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV37BarCodPar", AV37BarCodPar);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODPAR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV37BarCodPar, ""))));
            AV38MetPieCod = httpContext.GetPar( "MetPieCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV38MetPieCod", AV38MetPieCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMETPIECOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV38MetPieCod, ""))));
            AV39MetPieDfLin = (short)(GXutil.lval( httpContext.GetPar( "MetPieDfLin"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV39MetPieDfLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39MetPieDfLin), 4, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMETPIEDFLIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV39MetPieDfLin), "ZZZ9")));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "METPID", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtMetPieCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public metpid_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public metpid_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( metpid_impl.class ));
   }

   public metpid_impl( int remoteHandle ,
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMetTerCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMetTerCod_Internalname, httpContext.getMessage( "Terminal", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtMetTerCod_Internalname, GXutil.rtrim( A2809MetTerCod), GXutil.rtrim( localUtil.format( A2809MetTerCod, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMetTerCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMetTerCod_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ExpedicionesAutomatizadas\\METPID.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarCod_Internalname, httpContext.getMessage( "Codigo Barcada", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtBarCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ExpedicionesAutomatizadas\\METPID.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarCodReo_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarCodReo_Internalname, httpContext.getMessage( "Codigo Reoperado Barcada", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodReo_Internalname, GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCodReo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9") : localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodReo_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtBarCodReo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ExpedicionesAutomatizadas\\METPID.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarCodPar_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarCodPar_Internalname, httpContext.getMessage( "Codigo Particion Barcada", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodPar_Internalname, GXutil.rtrim( A130BarCodPar), GXutil.rtrim( localUtil.format( A130BarCodPar, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodPar_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtBarCodPar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ExpedicionesAutomatizadas\\METPID.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMetPieCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMetPieCod_Internalname, httpContext.getMessage( "Pieza", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 40,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMetPieCod_Internalname, GXutil.rtrim( A2813MetPieCod), GXutil.rtrim( localUtil.format( A2813MetPieCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,40);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMetPieCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMetPieCod_Enabled, 1, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ExpedicionesAutomatizadas\\METPID.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMetPieDfLi_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMetPieDfLi_Internalname, httpContext.getMessage( "Linea", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMetPieDfLi_Internalname, GXutil.ltrim( localUtil.ntoc( A12995MetPieDfLi, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A12995MetPieDfLi), "ZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,44);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMetPieDfLi_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMetPieDfLi_Enabled, 1, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ExpedicionesAutomatizadas\\METPID.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMetPieDfID_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMetPieDfID_Internalname, httpContext.getMessage( "Defecto", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMetPieDfID_Internalname, GXutil.ltrim( localUtil.ntoc( A12996MetPieDfID, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A12996MetPieDfID), "ZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMetPieDfID_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMetPieDfID_Enabled, 1, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ExpedicionesAutomatizadas\\METPID.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMetPieDfDc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMetPieDfDc_Internalname, httpContext.getMessage( "Descripcion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtMetPieDfDc_Internalname, GXutil.rtrim( A12997MetPieDfDc), GXutil.rtrim( localUtil.format( A12997MetPieDfDc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMetPieDfDc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMetPieDfDc_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ExpedicionesAutomatizadas\\METPID.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMetPieDfMi_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMetPieDfMi_Internalname, httpContext.getMessage( "Metros Iniciales", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 58,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMetPieDfMi_Internalname, GXutil.ltrim( localUtil.ntoc( A12998MetPieDfMi, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMetPieDfMi_Enabled!=0) ? localUtil.format( A12998MetPieDfMi, "ZZZZZ9.99") : localUtil.format( A12998MetPieDfMi, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,58);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMetPieDfMi_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMetPieDfMi_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ExpedicionesAutomatizadas\\METPID.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMetPieDfMa_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMetPieDfMa_Internalname, httpContext.getMessage( "Metros Finales", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 62,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMetPieDfMa_Internalname, GXutil.ltrim( localUtil.ntoc( A12999MetPieDfMa, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMetPieDfMa_Enabled!=0) ? localUtil.format( A12999MetPieDfMa, "ZZZZZ9.99") : localUtil.format( A12999MetPieDfMa, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,62);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMetPieDfMa_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMetPieDfMa_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ExpedicionesAutomatizadas\\METPID.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMetPieDfFa_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMetPieDfFa_Internalname, httpContext.getMessage( "Fase", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 67,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMetPieDfFa_Internalname, GXutil.rtrim( A13000MetPieDfFa), GXutil.rtrim( localUtil.format( A13000MetPieDfFa, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,67);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMetPieDfFa_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMetPieDfFa_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ExpedicionesAutomatizadas\\METPID.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 72,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ExpedicionesAutomatizadas\\METPID.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ExpedicionesAutomatizadas\\METPID.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ExpedicionesAutomatizadas\\METPID.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV45Pgmname), GXutil.rtrim( localUtil.format( AV45Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ExpedicionesAutomatizadas\\METPID.htm");
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
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 87,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,87);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", edtEmprCod_Visible, edtEmprCod_Enabled, 1, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ExpedicionesAutomatizadas\\METPID.htm");
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
      e111RD2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z2809MetTerCod = httpContext.cgiGet( "Z2809MetTerCod") ;
            Z129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z129BarCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( "Z132BarCodReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z130BarCodPar = httpContext.cgiGet( "Z130BarCodPar") ;
            Z2813MetPieCod = httpContext.cgiGet( "Z2813MetPieCod") ;
            Z12995MetPieDfLi = (short)(localUtil.ctol( httpContext.cgiGet( "Z12995MetPieDfLi"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z12998MetPieDfMi = localUtil.ctond( httpContext.cgiGet( "Z12998MetPieDfMi")) ;
            Z12999MetPieDfMa = localUtil.ctond( httpContext.cgiGet( "Z12999MetPieDfMa")) ;
            Z13000MetPieDfFa = httpContext.cgiGet( "Z13000MetPieDfFa") ;
            Z12996MetPieDfID = (short)(localUtil.ctol( httpContext.cgiGet( "Z12996MetPieDfID"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            N12996MetPieDfID = (short)(localUtil.ctol( httpContext.cgiGet( "N12996MetPieDfID"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV32EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            AV34MetTerCod = httpContext.cgiGet( "vMETTERCOD") ;
            AV35BarCod = (int)(localUtil.ctol( httpContext.cgiGet( "vBARCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV36BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( "vBARCODREO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV37BarCodPar = httpContext.cgiGet( "vBARCODPAR") ;
            AV38MetPieCod = httpContext.cgiGet( "vMETPIECOD") ;
            AV39MetPieDfLin = (short)(localUtil.ctol( httpContext.cgiGet( "vMETPIEDFLIN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV43Insert_MetPieDfID = (short)(localUtil.ctol( httpContext.cgiGet( "vINSERT_METPIEDFID"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
            A2809MetTerCod = httpContext.cgiGet( edtMetTerCod_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2809MetTerCod", A2809MetTerCod);
            A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            A2813MetPieCod = httpContext.cgiGet( edtMetPieCod_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2813MetPieCod", A2813MetPieCod);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMetPieDfLi_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMetPieDfLi_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "METPIEDFLI");
               AnyError = (short)(1) ;
               GX_FocusControl = edtMetPieDfLi_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A12995MetPieDfLi = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A12995MetPieDfLi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12995MetPieDfLi), 4, 0));
            }
            else
            {
               A12995MetPieDfLi = (short)(localUtil.ctol( httpContext.cgiGet( edtMetPieDfLi_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A12995MetPieDfLi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12995MetPieDfLi), 4, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMetPieDfID_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMetPieDfID_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "METPIEDFID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtMetPieDfID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A12996MetPieDfID = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A12996MetPieDfID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12996MetPieDfID), 4, 0));
            }
            else
            {
               A12996MetPieDfID = (short)(localUtil.ctol( httpContext.cgiGet( edtMetPieDfID_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A12996MetPieDfID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12996MetPieDfID), 4, 0));
            }
            A12997MetPieDfDc = httpContext.cgiGet( edtMetPieDfDc_Internalname) ;
            n12997MetPieDfDc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12997MetPieDfDc", A12997MetPieDfDc);
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtMetPieDfMi_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMetPieDfMi_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "METPIEDFMI");
               AnyError = (short)(1) ;
               GX_FocusControl = edtMetPieDfMi_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A12998MetPieDfMi = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, "A12998MetPieDfMi", GXutil.ltrimstr( A12998MetPieDfMi, 9, 2));
            }
            else
            {
               A12998MetPieDfMi = localUtil.ctond( httpContext.cgiGet( edtMetPieDfMi_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A12998MetPieDfMi", GXutil.ltrimstr( A12998MetPieDfMi, 9, 2));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtMetPieDfMa_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMetPieDfMa_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "METPIEDFMA");
               AnyError = (short)(1) ;
               GX_FocusControl = edtMetPieDfMa_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A12999MetPieDfMa = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, "A12999MetPieDfMa", GXutil.ltrimstr( A12999MetPieDfMa, 9, 2));
            }
            else
            {
               A12999MetPieDfMa = localUtil.ctond( httpContext.cgiGet( edtMetPieDfMa_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A12999MetPieDfMa", GXutil.ltrimstr( A12999MetPieDfMa, 9, 2));
            }
            A13000MetPieDfFa = httpContext.cgiGet( edtMetPieDfFa_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13000MetPieDfFa", A13000MetPieDfFa);
            AV45Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV45Pgmname", AV45Pgmname);
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"METPID");
            A2809MetTerCod = httpContext.cgiGet( edtMetTerCod_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2809MetTerCod", A2809MetTerCod);
            forbiddenHiddens.add("MetTerCod", GXutil.rtrim( localUtil.format( A2809MetTerCod, "")));
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            AV45Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV45Pgmname", AV45Pgmname);
            forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV45Pgmname, "")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A2809MetTerCod, Z2809MetTerCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( GXutil.strcmp(A2813MetPieCod, Z2813MetPieCod) != 0 ) || ( A12995MetPieDfLi != Z12995MetPieDfLi ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("expedicionesautomatizadas\\metpid:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               A2809MetTerCod = httpContext.GetPar( "MetTerCod") ;
               httpContext.ajax_rsp_assign_attri("", false, "A2809MetTerCod", A2809MetTerCod);
               A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
               A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
               A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
               httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
               A2813MetPieCod = httpContext.GetPar( "MetPieCod") ;
               httpContext.ajax_rsp_assign_attri("", false, "A2813MetPieCod", A2813MetPieCod);
               A12995MetPieDfLi = (short)(GXutil.lval( httpContext.GetPar( "MetPieDfLi"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A12995MetPieDfLi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12995MetPieDfLi), 4, 0));
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
                  sMode1781 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  Gx_mode = sMode1781 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound1781 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_1RD0( ) ;
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
                        e111RD2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e121RD2 ();
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
         e121RD2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll1RD1781( ) ;
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
         disableAttributes1RD1781( ) ;
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

   public void confirm_1RD0( )
   {
      beforeValidate1RD1781( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1RD1781( ) ;
         }
         else
         {
            checkExtendedTable1RD1781( ) ;
            closeExtendedTableCursors1RD1781( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
   }

   public void resetCaption1RD0( )
   {
   }

   public void e111RD2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV12Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      metpid_impl.this.GXt_char1 = GXv_char2[0] ;
      AV12Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = AV32EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      metpid_impl.this.AV32EmprCod = GXv_char2[0] ;
      metpid_impl.this.AV11EmprNom = GXv_char3[0] ;
      metpid_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32EmprCod", AV32EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV32EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
      GXv_SdtWWPContext5[0] = AV40WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext5) ;
      AV40WWPContext = GXv_SdtWWPContext5[0] ;
      AV41TrnContext.fromxml(AV42WebSession.getValue("TrnContext"), null, null);
      if ( ( GXutil.strcmp(AV41TrnContext.getgxTv_SdtWWPTransactionContext_Transactionname(), AV45Pgmname) == 0 ) && ( GXutil.strcmp(Gx_mode, "INS") == 0 ) )
      {
         AV46GXV1 = 1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV46GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV46GXV1), 8, 0));
         while ( AV46GXV1 <= AV41TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().size() )
         {
            AV44TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)((app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)AV41TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().elementAt(-1+AV46GXV1));
            if ( GXutil.strcmp(AV44TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "MetPieDfID") == 0 )
            {
               AV43Insert_MetPieDfID = (short)(GXutil.lval( AV44TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue())) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV43Insert_MetPieDfID", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43Insert_MetPieDfID), 4, 0));
            }
            AV46GXV1 = (int)(AV46GXV1+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV46GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV46GXV1), 8, 0));
         }
      }
      edtEmprCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Visible), 5, 0), true);
   }

   public void e121RD2( )
   {
      /* After Trn Routine */
      returnInSub = false ;
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

   public void zm1RD1781( int GX_JID )
   {
      if ( ( GX_JID == 23 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z12998MetPieDfMi = T01RD3_A12998MetPieDfMi[0] ;
            Z12999MetPieDfMa = T01RD3_A12999MetPieDfMa[0] ;
            Z13000MetPieDfFa = T01RD3_A13000MetPieDfFa[0] ;
            Z12996MetPieDfID = T01RD3_A12996MetPieDfID[0] ;
         }
         else
         {
            Z12998MetPieDfMi = A12998MetPieDfMi ;
            Z12999MetPieDfMa = A12999MetPieDfMa ;
            Z13000MetPieDfFa = A13000MetPieDfFa ;
            Z12996MetPieDfID = A12996MetPieDfID ;
         }
      }
      if ( GX_JID == -23 )
      {
         Z12995MetPieDfLi = A12995MetPieDfLi ;
         Z12998MetPieDfMi = A12998MetPieDfMi ;
         Z12999MetPieDfMa = A12999MetPieDfMa ;
         Z13000MetPieDfFa = A13000MetPieDfFa ;
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z2809MetTerCod = A2809MetTerCod ;
         Z2813MetPieCod = A2813MetPieCod ;
         Z12996MetPieDfID = A12996MetPieDfID ;
         Z12997MetPieDfDc = A12997MetPieDfDc ;
      }
   }

   public void standaloneNotModal( )
   {
      edtMetTerCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetTerCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetTerCod_Enabled), 5, 0), true);
      edtBarCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), true);
      edtBarCodReo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), true);
      edtBarCodPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), true);
      AV45Pgmname = "ExpedicionesAutomatizadas.METPID" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV45Pgmname", AV45Pgmname);
      edtMetTerCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetTerCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetTerCod_Enabled), 5, 0), true);
      edtBarCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), true);
      edtBarCodReo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), true);
      edtBarCodPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), true);
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV32EmprCod)==0) )
      {
         A396EmprCod = AV32EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      if ( ! (GXutil.strcmp("", AV32EmprCod)==0) )
      {
         edtEmprCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      }
      else
      {
         edtEmprCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      }
      if ( ! (GXutil.strcmp("", AV32EmprCod)==0) )
      {
         edtEmprCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      }
      if ( ! (GXutil.strcmp("", AV34MetTerCod)==0) )
      {
         A2809MetTerCod = AV34MetTerCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A2809MetTerCod", A2809MetTerCod);
      }
      if ( ! (0==AV35BarCod) )
      {
         A129BarCod = AV35BarCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
      }
      if ( ! (0==AV36BarCodReo) )
      {
         A132BarCodReo = AV36BarCodReo ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
      }
      if ( ! (GXutil.strcmp("", AV37BarCodPar)==0) )
      {
         A130BarCodPar = AV37BarCodPar ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      }
      if ( ! (GXutil.strcmp("", AV38MetPieCod)==0) )
      {
         A2813MetPieCod = AV38MetPieCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A2813MetPieCod", A2813MetPieCod);
      }
      if ( ! (GXutil.strcmp("", AV38MetPieCod)==0) )
      {
         edtMetPieCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMetPieCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieCod_Enabled), 5, 0), true);
      }
      else
      {
         edtMetPieCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMetPieCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieCod_Enabled), 5, 0), true);
      }
      if ( ! (GXutil.strcmp("", AV38MetPieCod)==0) )
      {
         edtMetPieCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMetPieCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieCod_Enabled), 5, 0), true);
      }
      if ( ! (0==AV39MetPieDfLin) )
      {
         A12995MetPieDfLi = AV39MetPieDfLin ;
         httpContext.ajax_rsp_assign_attri("", false, "A12995MetPieDfLi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12995MetPieDfLi), 4, 0));
      }
      if ( ! (0==AV39MetPieDfLin) )
      {
         edtMetPieDfLi_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMetPieDfLi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieDfLi_Enabled), 5, 0), true);
      }
      else
      {
         edtMetPieDfLi_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMetPieDfLi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieDfLi_Enabled), 5, 0), true);
      }
      if ( ! (0==AV39MetPieDfLin) )
      {
         edtMetPieDfLi_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMetPieDfLi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieDfLi_Enabled), 5, 0), true);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV43Insert_MetPieDfID) )
      {
         edtMetPieDfID_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMetPieDfID_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieDfID_Enabled), 5, 0), true);
      }
      else
      {
         edtMetPieDfID_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMetPieDfID_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieDfID_Enabled), 5, 0), true);
      }
   }

   public void standaloneModal( )
   {
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV43Insert_MetPieDfID) )
      {
         A12996MetPieDfID = AV43Insert_MetPieDfID ;
         httpContext.ajax_rsp_assign_attri("", false, "A12996MetPieDfID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12996MetPieDfID), 4, 0));
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
         /* Using cursor T01RD5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Short.valueOf(A12996MetPieDfID)});
         A12997MetPieDfDc = T01RD5_A12997MetPieDfDc[0] ;
         n12997MetPieDfDc = T01RD5_n12997MetPieDfDc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12997MetPieDfDc", A12997MetPieDfDc);
         pr_default.close(3);
      }
   }

   public void load1RD1781( )
   {
      /* Using cursor T01RD6 */
      pr_default.execute(4, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A2813MetPieCod, Short.valueOf(A12995MetPieDfLi)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound1781 = (short)(1) ;
         A12997MetPieDfDc = T01RD6_A12997MetPieDfDc[0] ;
         n12997MetPieDfDc = T01RD6_n12997MetPieDfDc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12997MetPieDfDc", A12997MetPieDfDc);
         A12998MetPieDfMi = T01RD6_A12998MetPieDfMi[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12998MetPieDfMi", GXutil.ltrimstr( A12998MetPieDfMi, 9, 2));
         A12999MetPieDfMa = T01RD6_A12999MetPieDfMa[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12999MetPieDfMa", GXutil.ltrimstr( A12999MetPieDfMa, 9, 2));
         A13000MetPieDfFa = T01RD6_A13000MetPieDfFa[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13000MetPieDfFa", A13000MetPieDfFa);
         A12996MetPieDfID = T01RD6_A12996MetPieDfID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12996MetPieDfID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12996MetPieDfID), 4, 0));
         zm1RD1781( -23) ;
      }
      pr_default.close(4);
      onLoadActions1RD1781( ) ;
   }

   public void onLoadActions1RD1781( )
   {
   }

   public void checkExtendedTable1RD1781( )
   {
      nIsDirty_1781 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01RD5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Short.valueOf(A12996MetPieDfID)});
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Defectos", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "METPIEDFID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A12997MetPieDfDc = T01RD5_A12997MetPieDfDc[0] ;
      n12997MetPieDfDc = T01RD5_n12997MetPieDfDc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A12997MetPieDfDc", A12997MetPieDfDc);
      pr_default.close(3);
      /* Using cursor T01RD4 */
      pr_default.execute(2, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A2813MetPieCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "LMETPI", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "METPIECOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(2);
   }

   public void closeExtendedTableCursors1RD1781( )
   {
      pr_default.close(3);
      pr_default.close(2);
   }

   public void enableDisable( )
   {
   }

   public void gxload_25( String A396EmprCod ,
                          short A12996MetPieDfID )
   {
      /* Using cursor T01RD7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Short.valueOf(A12996MetPieDfID)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Defectos", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "METPIEDFID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A12997MetPieDfDc = T01RD7_A12997MetPieDfDc[0] ;
      n12997MetPieDfDc = T01RD7_n12997MetPieDfDc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A12997MetPieDfDc", A12997MetPieDfDc);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A12997MetPieDfDc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(5) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(5);
   }

   public void gxload_24( String A396EmprCod ,
                          String A2809MetTerCod ,
                          int A129BarCod ,
                          byte A132BarCodReo ,
                          String A130BarCodPar ,
                          String A2813MetPieCod )
   {
      /* Using cursor T01RD8 */
      pr_default.execute(6, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A2813MetPieCod});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "LMETPI", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "METPIECOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_default.getStatus(6) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(6);
   }

   public void getKey1RD1781( )
   {
      /* Using cursor T01RD9 */
      pr_default.execute(7, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A2813MetPieCod, Short.valueOf(A12995MetPieDfLi)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound1781 = (short)(1) ;
      }
      else
      {
         RcdFound1781 = (short)(0) ;
      }
      pr_default.close(7);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01RD3 */
      pr_default.execute(1, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A2813MetPieCod, Short.valueOf(A12995MetPieDfLi)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1RD1781( 23) ;
         RcdFound1781 = (short)(1) ;
         A12995MetPieDfLi = T01RD3_A12995MetPieDfLi[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12995MetPieDfLi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12995MetPieDfLi), 4, 0));
         A12998MetPieDfMi = T01RD3_A12998MetPieDfMi[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12998MetPieDfMi", GXutil.ltrimstr( A12998MetPieDfMi, 9, 2));
         A12999MetPieDfMa = T01RD3_A12999MetPieDfMa[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12999MetPieDfMa", GXutil.ltrimstr( A12999MetPieDfMa, 9, 2));
         A13000MetPieDfFa = T01RD3_A13000MetPieDfFa[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13000MetPieDfFa", A13000MetPieDfFa);
         A396EmprCod = T01RD3_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = T01RD3_A129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T01RD3_A132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T01RD3_A130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A2809MetTerCod = T01RD3_A2809MetTerCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2809MetTerCod", A2809MetTerCod);
         A2813MetPieCod = T01RD3_A2813MetPieCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2813MetPieCod", A2813MetPieCod);
         A12996MetPieDfID = T01RD3_A12996MetPieDfID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12996MetPieDfID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12996MetPieDfID), 4, 0));
         Z396EmprCod = A396EmprCod ;
         Z2809MetTerCod = A2809MetTerCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z2813MetPieCod = A2813MetPieCod ;
         Z12995MetPieDfLi = A12995MetPieDfLi ;
         sMode1781 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1RD1781( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1781 = (short)(0) ;
            initializeNonKey1RD1781( ) ;
         }
         Gx_mode = sMode1781 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1781 = (short)(0) ;
         initializeNonKey1RD1781( ) ;
         sMode1781 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1781 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1RD1781( ) ;
      if ( RcdFound1781 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound1781 = (short)(0) ;
      /* Using cursor T01RD10 */
      pr_default.execute(8, new Object[] {A396EmprCod, A396EmprCod, A2809MetTerCod, A2809MetTerCod, A396EmprCod, Integer.valueOf(A129BarCod), Integer.valueOf(A129BarCod), A2809MetTerCod, A396EmprCod, Byte.valueOf(A132BarCodReo), Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A2809MetTerCod, A396EmprCod, A130BarCodPar, A130BarCodPar, Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A2809MetTerCod, A396EmprCod, A2813MetPieCod, A2813MetPieCod, A130BarCodPar, Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A2809MetTerCod, A396EmprCod, Short.valueOf(A12995MetPieDfLi)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( ( GXutil.strcmp(T01RD10_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01RD10_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01RD10_A2809MetTerCod[0], A2809MetTerCod) < 0 ) || ( GXutil.strcmp(T01RD10_A2809MetTerCod[0], A2809MetTerCod) == 0 ) && ( GXutil.strcmp(T01RD10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01RD10_A129BarCod[0] < A129BarCod ) || ( T01RD10_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01RD10_A2809MetTerCod[0], A2809MetTerCod) == 0 ) && ( GXutil.strcmp(T01RD10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01RD10_A132BarCodReo[0] < A132BarCodReo ) || ( T01RD10_A132BarCodReo[0] == A132BarCodReo ) && ( T01RD10_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01RD10_A2809MetTerCod[0], A2809MetTerCod) == 0 ) && ( GXutil.strcmp(T01RD10_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01RD10_A130BarCodPar[0], A130BarCodPar) < 0 ) || ( GXutil.strcmp(T01RD10_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01RD10_A132BarCodReo[0] == A132BarCodReo ) && ( T01RD10_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01RD10_A2809MetTerCod[0], A2809MetTerCod) == 0 ) && ( GXutil.strcmp(T01RD10_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01RD10_A2813MetPieCod[0], A2813MetPieCod) < 0 ) || ( GXutil.strcmp(T01RD10_A2813MetPieCod[0], A2813MetPieCod) == 0 ) && ( GXutil.strcmp(T01RD10_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01RD10_A132BarCodReo[0] == A132BarCodReo ) && ( T01RD10_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01RD10_A2809MetTerCod[0], A2809MetTerCod) == 0 ) && ( GXutil.strcmp(T01RD10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01RD10_A12995MetPieDfLi[0] < A12995MetPieDfLi ) ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( ( GXutil.strcmp(T01RD10_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01RD10_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01RD10_A2809MetTerCod[0], A2809MetTerCod) > 0 ) || ( GXutil.strcmp(T01RD10_A2809MetTerCod[0], A2809MetTerCod) == 0 ) && ( GXutil.strcmp(T01RD10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01RD10_A129BarCod[0] > A129BarCod ) || ( T01RD10_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01RD10_A2809MetTerCod[0], A2809MetTerCod) == 0 ) && ( GXutil.strcmp(T01RD10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01RD10_A132BarCodReo[0] > A132BarCodReo ) || ( T01RD10_A132BarCodReo[0] == A132BarCodReo ) && ( T01RD10_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01RD10_A2809MetTerCod[0], A2809MetTerCod) == 0 ) && ( GXutil.strcmp(T01RD10_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01RD10_A130BarCodPar[0], A130BarCodPar) > 0 ) || ( GXutil.strcmp(T01RD10_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01RD10_A132BarCodReo[0] == A132BarCodReo ) && ( T01RD10_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01RD10_A2809MetTerCod[0], A2809MetTerCod) == 0 ) && ( GXutil.strcmp(T01RD10_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01RD10_A2813MetPieCod[0], A2813MetPieCod) > 0 ) || ( GXutil.strcmp(T01RD10_A2813MetPieCod[0], A2813MetPieCod) == 0 ) && ( GXutil.strcmp(T01RD10_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01RD10_A132BarCodReo[0] == A132BarCodReo ) && ( T01RD10_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01RD10_A2809MetTerCod[0], A2809MetTerCod) == 0 ) && ( GXutil.strcmp(T01RD10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01RD10_A12995MetPieDfLi[0] > A12995MetPieDfLi ) ) )
         {
            A396EmprCod = T01RD10_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A2809MetTerCod = T01RD10_A2809MetTerCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A2809MetTerCod", A2809MetTerCod);
            A129BarCod = T01RD10_A129BarCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = T01RD10_A132BarCodReo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = T01RD10_A130BarCodPar[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            A2813MetPieCod = T01RD10_A2813MetPieCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A2813MetPieCod", A2813MetPieCod);
            A12995MetPieDfLi = T01RD10_A12995MetPieDfLi[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A12995MetPieDfLi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12995MetPieDfLi), 4, 0));
            RcdFound1781 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void move_previous( )
   {
      RcdFound1781 = (short)(0) ;
      /* Using cursor T01RD11 */
      pr_default.execute(9, new Object[] {A396EmprCod, A396EmprCod, A2809MetTerCod, A2809MetTerCod, A396EmprCod, Integer.valueOf(A129BarCod), Integer.valueOf(A129BarCod), A2809MetTerCod, A396EmprCod, Byte.valueOf(A132BarCodReo), Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A2809MetTerCod, A396EmprCod, A130BarCodPar, A130BarCodPar, Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A2809MetTerCod, A396EmprCod, A2813MetPieCod, A2813MetPieCod, A130BarCodPar, Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A2809MetTerCod, A396EmprCod, Short.valueOf(A12995MetPieDfLi)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T01RD11_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01RD11_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01RD11_A2809MetTerCod[0], A2809MetTerCod) > 0 ) || ( GXutil.strcmp(T01RD11_A2809MetTerCod[0], A2809MetTerCod) == 0 ) && ( GXutil.strcmp(T01RD11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01RD11_A129BarCod[0] > A129BarCod ) || ( T01RD11_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01RD11_A2809MetTerCod[0], A2809MetTerCod) == 0 ) && ( GXutil.strcmp(T01RD11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01RD11_A132BarCodReo[0] > A132BarCodReo ) || ( T01RD11_A132BarCodReo[0] == A132BarCodReo ) && ( T01RD11_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01RD11_A2809MetTerCod[0], A2809MetTerCod) == 0 ) && ( GXutil.strcmp(T01RD11_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01RD11_A130BarCodPar[0], A130BarCodPar) > 0 ) || ( GXutil.strcmp(T01RD11_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01RD11_A132BarCodReo[0] == A132BarCodReo ) && ( T01RD11_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01RD11_A2809MetTerCod[0], A2809MetTerCod) == 0 ) && ( GXutil.strcmp(T01RD11_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01RD11_A2813MetPieCod[0], A2813MetPieCod) > 0 ) || ( GXutil.strcmp(T01RD11_A2813MetPieCod[0], A2813MetPieCod) == 0 ) && ( GXutil.strcmp(T01RD11_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01RD11_A132BarCodReo[0] == A132BarCodReo ) && ( T01RD11_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01RD11_A2809MetTerCod[0], A2809MetTerCod) == 0 ) && ( GXutil.strcmp(T01RD11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01RD11_A12995MetPieDfLi[0] > A12995MetPieDfLi ) ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T01RD11_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01RD11_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01RD11_A2809MetTerCod[0], A2809MetTerCod) < 0 ) || ( GXutil.strcmp(T01RD11_A2809MetTerCod[0], A2809MetTerCod) == 0 ) && ( GXutil.strcmp(T01RD11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01RD11_A129BarCod[0] < A129BarCod ) || ( T01RD11_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01RD11_A2809MetTerCod[0], A2809MetTerCod) == 0 ) && ( GXutil.strcmp(T01RD11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01RD11_A132BarCodReo[0] < A132BarCodReo ) || ( T01RD11_A132BarCodReo[0] == A132BarCodReo ) && ( T01RD11_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01RD11_A2809MetTerCod[0], A2809MetTerCod) == 0 ) && ( GXutil.strcmp(T01RD11_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01RD11_A130BarCodPar[0], A130BarCodPar) < 0 ) || ( GXutil.strcmp(T01RD11_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01RD11_A132BarCodReo[0] == A132BarCodReo ) && ( T01RD11_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01RD11_A2809MetTerCod[0], A2809MetTerCod) == 0 ) && ( GXutil.strcmp(T01RD11_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01RD11_A2813MetPieCod[0], A2813MetPieCod) < 0 ) || ( GXutil.strcmp(T01RD11_A2813MetPieCod[0], A2813MetPieCod) == 0 ) && ( GXutil.strcmp(T01RD11_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01RD11_A132BarCodReo[0] == A132BarCodReo ) && ( T01RD11_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01RD11_A2809MetTerCod[0], A2809MetTerCod) == 0 ) && ( GXutil.strcmp(T01RD11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01RD11_A12995MetPieDfLi[0] < A12995MetPieDfLi ) ) )
         {
            A396EmprCod = T01RD11_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A2809MetTerCod = T01RD11_A2809MetTerCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A2809MetTerCod", A2809MetTerCod);
            A129BarCod = T01RD11_A129BarCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = T01RD11_A132BarCodReo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = T01RD11_A130BarCodPar[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            A2813MetPieCod = T01RD11_A2813MetPieCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A2813MetPieCod", A2813MetPieCod);
            A12995MetPieDfLi = T01RD11_A12995MetPieDfLi[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A12995MetPieDfLi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12995MetPieDfLi), 4, 0));
            RcdFound1781 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1RD1781( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtMetPieCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1RD1781( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1781 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A2809MetTerCod, Z2809MetTerCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( GXutil.strcmp(A2813MetPieCod, Z2813MetPieCod) != 0 ) || ( A12995MetPieDfLi != Z12995MetPieDfLi ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A2809MetTerCod = Z2809MetTerCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A2809MetTerCod", A2809MetTerCod);
               A129BarCod = Z129BarCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
               A132BarCodReo = Z132BarCodReo ;
               httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
               A130BarCodPar = Z130BarCodPar ;
               httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
               A2813MetPieCod = Z2813MetPieCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A2813MetPieCod", A2813MetPieCod);
               A12995MetPieDfLi = Z12995MetPieDfLi ;
               httpContext.ajax_rsp_assign_attri("", false, "A12995MetPieDfLi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12995MetPieDfLi), 4, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtMetPieCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               update1RD1781( ) ;
               GX_FocusControl = edtMetPieCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A2809MetTerCod, Z2809MetTerCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( GXutil.strcmp(A2813MetPieCod, Z2813MetPieCod) != 0 ) || ( A12995MetPieDfLi != Z12995MetPieDfLi ) )
            {
               /* Insert record */
               GX_FocusControl = edtMetPieCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1RD1781( ) ;
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
                  GX_FocusControl = edtMetPieCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1RD1781( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A2809MetTerCod, Z2809MetTerCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( GXutil.strcmp(A2813MetPieCod, Z2813MetPieCod) != 0 ) || ( A12995MetPieDfLi != Z12995MetPieDfLi ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A2809MetTerCod = Z2809MetTerCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A2809MetTerCod", A2809MetTerCod);
         A129BarCod = Z129BarCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = Z132BarCodReo ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = Z130BarCodPar ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A2813MetPieCod = Z2813MetPieCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A2813MetPieCod", A2813MetPieCod);
         A12995MetPieDfLi = Z12995MetPieDfLi ;
         httpContext.ajax_rsp_assign_attri("", false, "A12995MetPieDfLi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12995MetPieDfLi), 4, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtMetPieCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency1RD1781( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01RD2 */
         pr_default.execute(0, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A2813MetPieCod, Short.valueOf(A12995MetPieDfLi)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMETPID"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z12998MetPieDfMi, T01RD2_A12998MetPieDfMi[0]) != 0 ) || ( DecimalUtil.compareTo(Z12999MetPieDfMa, T01RD2_A12999MetPieDfMa[0]) != 0 ) || ( GXutil.strcmp(Z13000MetPieDfFa, T01RD2_A13000MetPieDfFa[0]) != 0 ) || ( Z12996MetPieDfID != T01RD2_A12996MetPieDfID[0] ) )
         {
            if ( DecimalUtil.compareTo(Z12998MetPieDfMi, T01RD2_A12998MetPieDfMi[0]) != 0 )
            {
               GXutil.writeLogln("expedicionesautomatizadas.metpid:[seudo value changed for attri]"+"MetPieDfMi");
               GXutil.writeLogRaw("Old: ",Z12998MetPieDfMi);
               GXutil.writeLogRaw("Current: ",T01RD2_A12998MetPieDfMi[0]);
            }
            if ( DecimalUtil.compareTo(Z12999MetPieDfMa, T01RD2_A12999MetPieDfMa[0]) != 0 )
            {
               GXutil.writeLogln("expedicionesautomatizadas.metpid:[seudo value changed for attri]"+"MetPieDfMa");
               GXutil.writeLogRaw("Old: ",Z12999MetPieDfMa);
               GXutil.writeLogRaw("Current: ",T01RD2_A12999MetPieDfMa[0]);
            }
            if ( GXutil.strcmp(Z13000MetPieDfFa, T01RD2_A13000MetPieDfFa[0]) != 0 )
            {
               GXutil.writeLogln("expedicionesautomatizadas.metpid:[seudo value changed for attri]"+"MetPieDfFa");
               GXutil.writeLogRaw("Old: ",Z13000MetPieDfFa);
               GXutil.writeLogRaw("Current: ",T01RD2_A13000MetPieDfFa[0]);
            }
            if ( Z12996MetPieDfID != T01RD2_A12996MetPieDfID[0] )
            {
               GXutil.writeLogln("expedicionesautomatizadas.metpid:[seudo value changed for attri]"+"MetPieDfID");
               GXutil.writeLogRaw("Old: ",Z12996MetPieDfID);
               GXutil.writeLogRaw("Current: ",T01RD2_A12996MetPieDfID[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPMETPID"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1RD1781( )
   {
      beforeValidate1RD1781( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1RD1781( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1RD1781( 0) ;
         checkOptimisticConcurrency1RD1781( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1RD1781( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1RD1781( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01RD12 */
                  pr_default.execute(10, new Object[] {Short.valueOf(A12995MetPieDfLi), A12998MetPieDfMi, A12999MetPieDfMa, A13000MetPieDfFa, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A2809MetTerCod, A2813MetPieCod, Short.valueOf(A12996MetPieDfID)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMETPID");
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
                        resetCaption1RD0( ) ;
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
            load1RD1781( ) ;
         }
         endLevel1RD1781( ) ;
      }
      closeExtendedTableCursors1RD1781( ) ;
   }

   public void update1RD1781( )
   {
      beforeValidate1RD1781( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1RD1781( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1RD1781( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1RD1781( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1RD1781( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01RD13 */
                  pr_default.execute(11, new Object[] {A12998MetPieDfMi, A12999MetPieDfMa, A13000MetPieDfFa, Short.valueOf(A12996MetPieDfID), A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A2813MetPieCod, Short.valueOf(A12995MetPieDfLi)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMETPID");
                  if ( (pr_default.getStatus(11) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMETPID"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1RD1781( ) ;
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
         endLevel1RD1781( ) ;
      }
      closeExtendedTableCursors1RD1781( ) ;
   }

   public void deferredUpdate1RD1781( )
   {
   }

   public void delete( )
   {
      beforeValidate1RD1781( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1RD1781( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1RD1781( ) ;
         afterConfirm1RD1781( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1RD1781( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01RD14 */
               pr_default.execute(12, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A2813MetPieCod, Short.valueOf(A12995MetPieDfLi)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMETPID");
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
      sMode1781 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1RD1781( ) ;
      Gx_mode = sMode1781 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1RD1781( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01RD15 */
         pr_default.execute(13, new Object[] {A396EmprCod, Short.valueOf(A12996MetPieDfID)});
         A12997MetPieDfDc = T01RD15_A12997MetPieDfDc[0] ;
         n12997MetPieDfDc = T01RD15_n12997MetPieDfDc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12997MetPieDfDc", A12997MetPieDfDc);
         pr_default.close(13);
      }
   }

   public void endLevel1RD1781( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1RD1781( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "expedicionesautomatizadas.metpid");
         if ( AnyError == 0 )
         {
            confirmValues1RD0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "expedicionesautomatizadas.metpid");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1RD1781( )
   {
      /* Scan By routine */
      /* Using cursor T01RD16 */
      pr_default.execute(14);
      RcdFound1781 = (short)(0) ;
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound1781 = (short)(1) ;
         A396EmprCod = T01RD16_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A2809MetTerCod = T01RD16_A2809MetTerCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2809MetTerCod", A2809MetTerCod);
         A129BarCod = T01RD16_A129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T01RD16_A132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T01RD16_A130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A2813MetPieCod = T01RD16_A2813MetPieCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2813MetPieCod", A2813MetPieCod);
         A12995MetPieDfLi = T01RD16_A12995MetPieDfLi[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12995MetPieDfLi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12995MetPieDfLi), 4, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1RD1781( )
   {
      /* Scan next routine */
      pr_default.readNext(14);
      RcdFound1781 = (short)(0) ;
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound1781 = (short)(1) ;
         A396EmprCod = T01RD16_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A2809MetTerCod = T01RD16_A2809MetTerCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2809MetTerCod", A2809MetTerCod);
         A129BarCod = T01RD16_A129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T01RD16_A132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T01RD16_A130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A2813MetPieCod = T01RD16_A2813MetPieCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2813MetPieCod", A2813MetPieCod);
         A12995MetPieDfLi = T01RD16_A12995MetPieDfLi[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12995MetPieDfLi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12995MetPieDfLi), 4, 0));
      }
   }

   public void scanEnd1RD1781( )
   {
      pr_default.close(14);
   }

   public void afterConfirm1RD1781( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1RD1781( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1RD1781( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1RD1781( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1RD1781( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1RD1781( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1RD1781( )
   {
      edtMetTerCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetTerCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetTerCod_Enabled), 5, 0), true);
      edtBarCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), true);
      edtBarCodReo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), true);
      edtBarCodPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), true);
      edtMetPieCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetPieCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieCod_Enabled), 5, 0), true);
      edtMetPieDfLi_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetPieDfLi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieDfLi_Enabled), 5, 0), true);
      edtMetPieDfID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetPieDfID_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieDfID_Enabled), 5, 0), true);
      edtMetPieDfDc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetPieDfDc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieDfDc_Enabled), 5, 0), true);
      edtMetPieDfMi_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetPieDfMi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieDfMi_Enabled), 5, 0), true);
      edtMetPieDfMa_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetPieDfMa_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieDfMa_Enabled), 5, 0), true);
      edtMetPieDfFa_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetPieDfFa_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieDfFa_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1RD1781( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1RD0( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.expedicionesautomatizadas.metpid", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV32EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV34MetTerCod)),GXutil.URLEncode(GXutil.ltrimstr(AV35BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV36BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV37BarCodPar)),GXutil.URLEncode(GXutil.rtrim(AV38MetPieCod)),GXutil.URLEncode(GXutil.ltrimstr(AV39MetPieDfLin,4,0))}, new String[] {"Gx_mode","EmprCod","MetTerCod","BarCod","BarCodReo","BarCodPar","MetPieCod","MetPieDfLin"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"METPID");
      forbiddenHiddens.add("MetTerCod", GXutil.rtrim( localUtil.format( A2809MetTerCod, "")));
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV45Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("expedicionesautomatizadas\\metpid:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2809MetTerCod", GXutil.rtrim( Z2809MetTerCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z129BarCod", GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z132BarCodReo", GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z130BarCodPar", GXutil.rtrim( Z130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2813MetPieCod", GXutil.rtrim( Z2813MetPieCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12995MetPieDfLi", GXutil.ltrim( localUtil.ntoc( Z12995MetPieDfLi, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12998MetPieDfMi", GXutil.ltrim( localUtil.ntoc( Z12998MetPieDfMi, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12999MetPieDfMa", GXutil.ltrim( localUtil.ntoc( Z12999MetPieDfMa, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13000MetPieDfFa", GXutil.rtrim( Z13000MetPieDfFa));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12996MetPieDfID", GXutil.ltrim( localUtil.ntoc( Z12996MetPieDfID, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "N12996MetPieDfID", GXutil.ltrim( localUtil.ntoc( A12996MetPieDfID, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV32EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV32EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMETTERCOD", GXutil.rtrim( AV34MetTerCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMETTERCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV34MetTerCod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCOD", GXutil.ltrim( localUtil.ntoc( AV35BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV35BarCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODREO", GXutil.ltrim( localUtil.ntoc( AV36BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODREO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV36BarCodReo), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODPAR", GXutil.rtrim( AV37BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODPAR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV37BarCodPar, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMETPIECOD", GXutil.rtrim( AV38MetPieCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMETPIECOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV38MetPieCod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMETPIEDFLIN", GXutil.ltrim( localUtil.ntoc( AV39MetPieDfLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMETPIEDFLIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV39MetPieDfLin), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_METPIEDFID", GXutil.ltrim( localUtil.ntoc( AV43Insert_MetPieDfID, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.expedicionesautomatizadas.metpid", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV32EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV34MetTerCod)),GXutil.URLEncode(GXutil.ltrimstr(AV35BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV36BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV37BarCodPar)),GXutil.URLEncode(GXutil.rtrim(AV38MetPieCod)),GXutil.URLEncode(GXutil.ltrimstr(AV39MetPieDfLin,4,0))}, new String[] {"Gx_mode","EmprCod","MetTerCod","BarCod","BarCodReo","BarCodPar","MetPieCod","MetPieDfLin"})  ;
   }

   public String getPgmname( )
   {
      return "ExpedicionesAutomatizadas.METPID" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "METPID", "") ;
   }

   public void initializeNonKey1RD1781( )
   {
      A12996MetPieDfID = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A12996MetPieDfID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12996MetPieDfID), 4, 0));
      A12997MetPieDfDc = "" ;
      n12997MetPieDfDc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12997MetPieDfDc", A12997MetPieDfDc);
      A12998MetPieDfMi = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A12998MetPieDfMi", GXutil.ltrimstr( A12998MetPieDfMi, 9, 2));
      A12999MetPieDfMa = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A12999MetPieDfMa", GXutil.ltrimstr( A12999MetPieDfMa, 9, 2));
      A13000MetPieDfFa = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13000MetPieDfFa", A13000MetPieDfFa);
      Z12998MetPieDfMi = DecimalUtil.ZERO ;
      Z12999MetPieDfMa = DecimalUtil.ZERO ;
      Z13000MetPieDfFa = "" ;
      Z12996MetPieDfID = (short)(0) ;
   }

   public void initAll1RD1781( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A2809MetTerCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A2809MetTerCod", A2809MetTerCod);
      A129BarCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
      A132BarCodReo = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
      A130BarCodPar = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      A2813MetPieCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A2813MetPieCod", A2813MetPieCod);
      A12995MetPieDfLi = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A12995MetPieDfLi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12995MetPieDfLi), 4, 0));
      initializeNonKey1RD1781( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211692138", true, true);
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
      httpContext.AddJavascriptSource("expedicionesautomatizadas/metpid.js", "?20268211692138", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      edtMetTerCod_Internalname = "METTERCOD" ;
      edtBarCod_Internalname = "BARCOD" ;
      edtBarCodReo_Internalname = "BARCODREO" ;
      edtBarCodPar_Internalname = "BARCODPAR" ;
      edtMetPieCod_Internalname = "METPIECOD" ;
      edtMetPieDfLi_Internalname = "METPIEDFLI" ;
      edtMetPieDfID_Internalname = "METPIEDFID" ;
      edtMetPieDfDc_Internalname = "METPIEDFDC" ;
      edtMetPieDfMi_Internalname = "METPIEDFMI" ;
      edtMetPieDfMa_Internalname = "METPIEDFMA" ;
      edtMetPieDfFa_Internalname = "METPIEDFFA" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      bttBtntrn_delete_Internalname = "BTNTRN_DELETE" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtEmprCod_Internalname = "EMPRCOD" ;
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
      Form.setCaption( httpContext.getMessage( "METPID", "") );
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
      edtMetPieDfFa_Jsonclick = "" ;
      edtMetPieDfFa_Enabled = 1 ;
      edtMetPieDfMa_Jsonclick = "" ;
      edtMetPieDfMa_Enabled = 1 ;
      edtMetPieDfMi_Jsonclick = "" ;
      edtMetPieDfMi_Enabled = 1 ;
      edtMetPieDfDc_Jsonclick = "" ;
      edtMetPieDfDc_Enabled = 0 ;
      edtMetPieDfID_Jsonclick = "" ;
      edtMetPieDfID_Enabled = 1 ;
      edtMetPieDfLi_Jsonclick = "" ;
      edtMetPieDfLi_Enabled = 1 ;
      edtMetPieCod_Jsonclick = "" ;
      edtMetPieCod_Enabled = 1 ;
      edtBarCodPar_Jsonclick = "" ;
      edtBarCodPar_Enabled = 0 ;
      edtBarCodReo_Jsonclick = "" ;
      edtBarCodReo_Enabled = 0 ;
      edtBarCod_Jsonclick = "" ;
      edtBarCod_Enabled = 0 ;
      edtMetTerCod_Jsonclick = "" ;
      edtMetTerCod_Enabled = 0 ;
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
      /* Using cursor T01RD17 */
      pr_default.execute(15, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A2813MetPieCod});
      if ( (pr_default.getStatus(15) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "LMETPI", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "METPIECOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      pr_default.close(15);
      dynload_actions( ) ;
      /*  Sending validation outputs */
   }

   public void valid_Metpiedfid( )
   {
      n12997MetPieDfDc = false ;
      /* Using cursor T01RD15 */
      pr_default.execute(13, new Object[] {A396EmprCod, Short.valueOf(A12996MetPieDfID)});
      if ( (pr_default.getStatus(13) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Defectos", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "METPIEDFID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A12997MetPieDfDc = T01RD15_A12997MetPieDfDc[0] ;
      n12997MetPieDfDc = T01RD15_n12997MetPieDfDc[0] ;
      pr_default.close(13);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A12997MetPieDfDc", GXutil.rtrim( A12997MetPieDfDc));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV32EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV34MetTerCod',fld:'vMETTERCOD',pic:'',hsh:true},{av:'AV35BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV36BarCodReo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV37BarCodPar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'AV38MetPieCod',fld:'vMETPIECOD',pic:'',hsh:true},{av:'AV39MetPieDfLin',fld:'vMETPIEDFLIN',pic:'ZZZ9',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV32EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV34MetTerCod',fld:'vMETTERCOD',pic:'',hsh:true},{av:'AV35BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV36BarCodReo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV37BarCodPar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'AV38MetPieCod',fld:'vMETPIECOD',pic:'',hsh:true},{av:'AV39MetPieDfLin',fld:'vMETPIEDFLIN',pic:'ZZZ9',hsh:true},{av:'A2809MetTerCod',fld:'METTERCOD',pic:''},{av:'AV45Pgmname',fld:'vPGMNAME',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e121RD2',iparms:[]");
      setEventMetadata("AFTER TRN",",oparms:[]}");
      setEventMetadata("VALID_METTERCOD","{handler:'valid_Mettercod',iparms:[]");
      setEventMetadata("VALID_METTERCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCOD","{handler:'valid_Barcod',iparms:[]");
      setEventMetadata("VALID_BARCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCODREO","{handler:'valid_Barcodreo',iparms:[]");
      setEventMetadata("VALID_BARCODREO",",oparms:[]}");
      setEventMetadata("VALID_BARCODPAR","{handler:'valid_Barcodpar',iparms:[]");
      setEventMetadata("VALID_BARCODPAR",",oparms:[]}");
      setEventMetadata("VALID_METPIECOD","{handler:'valid_Metpiecod',iparms:[]");
      setEventMetadata("VALID_METPIECOD",",oparms:[]}");
      setEventMetadata("VALID_METPIEDFLI","{handler:'valid_Metpiedfli',iparms:[]");
      setEventMetadata("VALID_METPIEDFLI",",oparms:[]}");
      setEventMetadata("VALID_METPIEDFID","{handler:'valid_Metpiedfid',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A12996MetPieDfID',fld:'METPIEDFID',pic:'ZZZ9'},{av:'A12997MetPieDfDc',fld:'METPIEDFDC',pic:''}]");
      setEventMetadata("VALID_METPIEDFID",",oparms:[{av:'A12997MetPieDfDc',fld:'METPIEDFDC',pic:''}]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A2809MetTerCod',fld:'METTERCOD',pic:''},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A2813MetPieCod',fld:'METPIECOD',pic:''}]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
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
      pr_default.close(15);
      pr_default.close(13);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      wcpOAV32EmprCod = "" ;
      wcpOAV34MetTerCod = "" ;
      wcpOAV37BarCodPar = "" ;
      wcpOAV38MetPieCod = "" ;
      Z396EmprCod = "" ;
      Z2809MetTerCod = "" ;
      Z130BarCodPar = "" ;
      Z2813MetPieCod = "" ;
      Z12998MetPieDfMi = DecimalUtil.ZERO ;
      Z12999MetPieDfMa = DecimalUtil.ZERO ;
      Z13000MetPieDfFa = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A2809MetTerCod = "" ;
      A130BarCodPar = "" ;
      A2813MetPieCod = "" ;
      Gx_mode = "" ;
      AV32EmprCod = "" ;
      AV34MetTerCod = "" ;
      AV37BarCodPar = "" ;
      AV38MetPieCod = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      A12997MetPieDfDc = "" ;
      A12998MetPieDfMi = DecimalUtil.ZERO ;
      A12999MetPieDfMa = DecimalUtil.ZERO ;
      A13000MetPieDfFa = "" ;
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      AV45Pgmname = "" ;
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      Datamonjs_Objectcall = "" ;
      Datamonjs_Class = "" ;
      Datamonjs_Paramstr = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode1781 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      AV12Station = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV11EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV8UsurCod = "" ;
      GXv_char4 = new String[1] ;
      AV40WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext5 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV41TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV42WebSession = httpContext.getWebSession();
      AV44TrnContextAtt = new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      Z12997MetPieDfDc = "" ;
      T01RD5_A12997MetPieDfDc = new String[] {""} ;
      T01RD5_n12997MetPieDfDc = new boolean[] {false} ;
      T01RD6_A12995MetPieDfLi = new short[1] ;
      T01RD6_A12997MetPieDfDc = new String[] {""} ;
      T01RD6_n12997MetPieDfDc = new boolean[] {false} ;
      T01RD6_A12998MetPieDfMi = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RD6_A12999MetPieDfMa = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RD6_A13000MetPieDfFa = new String[] {""} ;
      T01RD6_A396EmprCod = new String[] {""} ;
      T01RD6_A129BarCod = new int[1] ;
      T01RD6_A132BarCodReo = new byte[1] ;
      T01RD6_A130BarCodPar = new String[] {""} ;
      T01RD6_A2809MetTerCod = new String[] {""} ;
      T01RD6_A2813MetPieCod = new String[] {""} ;
      T01RD6_A12996MetPieDfID = new short[1] ;
      T01RD4_A396EmprCod = new String[] {""} ;
      T01RD7_A12997MetPieDfDc = new String[] {""} ;
      T01RD7_n12997MetPieDfDc = new boolean[] {false} ;
      T01RD8_A396EmprCod = new String[] {""} ;
      T01RD9_A396EmprCod = new String[] {""} ;
      T01RD9_A2809MetTerCod = new String[] {""} ;
      T01RD9_A129BarCod = new int[1] ;
      T01RD9_A132BarCodReo = new byte[1] ;
      T01RD9_A130BarCodPar = new String[] {""} ;
      T01RD9_A2813MetPieCod = new String[] {""} ;
      T01RD9_A12995MetPieDfLi = new short[1] ;
      T01RD3_A12995MetPieDfLi = new short[1] ;
      T01RD3_A12998MetPieDfMi = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RD3_A12999MetPieDfMa = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RD3_A13000MetPieDfFa = new String[] {""} ;
      T01RD3_A396EmprCod = new String[] {""} ;
      T01RD3_A129BarCod = new int[1] ;
      T01RD3_A132BarCodReo = new byte[1] ;
      T01RD3_A130BarCodPar = new String[] {""} ;
      T01RD3_A2809MetTerCod = new String[] {""} ;
      T01RD3_A2813MetPieCod = new String[] {""} ;
      T01RD3_A12996MetPieDfID = new short[1] ;
      T01RD10_A396EmprCod = new String[] {""} ;
      T01RD10_A2809MetTerCod = new String[] {""} ;
      T01RD10_A129BarCod = new int[1] ;
      T01RD10_A132BarCodReo = new byte[1] ;
      T01RD10_A130BarCodPar = new String[] {""} ;
      T01RD10_A2813MetPieCod = new String[] {""} ;
      T01RD10_A12995MetPieDfLi = new short[1] ;
      T01RD11_A396EmprCod = new String[] {""} ;
      T01RD11_A2809MetTerCod = new String[] {""} ;
      T01RD11_A129BarCod = new int[1] ;
      T01RD11_A132BarCodReo = new byte[1] ;
      T01RD11_A130BarCodPar = new String[] {""} ;
      T01RD11_A2813MetPieCod = new String[] {""} ;
      T01RD11_A12995MetPieDfLi = new short[1] ;
      T01RD2_A12995MetPieDfLi = new short[1] ;
      T01RD2_A12998MetPieDfMi = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RD2_A12999MetPieDfMa = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RD2_A13000MetPieDfFa = new String[] {""} ;
      T01RD2_A396EmprCod = new String[] {""} ;
      T01RD2_A129BarCod = new int[1] ;
      T01RD2_A132BarCodReo = new byte[1] ;
      T01RD2_A130BarCodPar = new String[] {""} ;
      T01RD2_A2809MetTerCod = new String[] {""} ;
      T01RD2_A2813MetPieCod = new String[] {""} ;
      T01RD2_A12996MetPieDfID = new short[1] ;
      T01RD15_A12997MetPieDfDc = new String[] {""} ;
      T01RD15_n12997MetPieDfDc = new boolean[] {false} ;
      T01RD16_A396EmprCod = new String[] {""} ;
      T01RD16_A2809MetTerCod = new String[] {""} ;
      T01RD16_A129BarCod = new int[1] ;
      T01RD16_A132BarCodReo = new byte[1] ;
      T01RD16_A130BarCodPar = new String[] {""} ;
      T01RD16_A2813MetPieCod = new String[] {""} ;
      T01RD16_A12995MetPieDfLi = new short[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      T01RD17_A396EmprCod = new String[] {""} ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.expedicionesautomatizadas.metpid__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.expedicionesautomatizadas.metpid__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.expedicionesautomatizadas.metpid__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.expedicionesautomatizadas.metpid__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.expedicionesautomatizadas.metpid__default(),
         new Object[] {
             new Object[] {
            T01RD2_A12995MetPieDfLi, T01RD2_A12998MetPieDfMi, T01RD2_A12999MetPieDfMa, T01RD2_A13000MetPieDfFa, T01RD2_A396EmprCod, T01RD2_A129BarCod, T01RD2_A132BarCodReo, T01RD2_A130BarCodPar, T01RD2_A2809MetTerCod, T01RD2_A2813MetPieCod,
            T01RD2_A12996MetPieDfID
            }
            , new Object[] {
            T01RD3_A12995MetPieDfLi, T01RD3_A12998MetPieDfMi, T01RD3_A12999MetPieDfMa, T01RD3_A13000MetPieDfFa, T01RD3_A396EmprCod, T01RD3_A129BarCod, T01RD3_A132BarCodReo, T01RD3_A130BarCodPar, T01RD3_A2809MetTerCod, T01RD3_A2813MetPieCod,
            T01RD3_A12996MetPieDfID
            }
            , new Object[] {
            T01RD4_A396EmprCod
            }
            , new Object[] {
            T01RD5_A12997MetPieDfDc, T01RD5_n12997MetPieDfDc
            }
            , new Object[] {
            T01RD6_A12995MetPieDfLi, T01RD6_A12997MetPieDfDc, T01RD6_n12997MetPieDfDc, T01RD6_A12998MetPieDfMi, T01RD6_A12999MetPieDfMa, T01RD6_A13000MetPieDfFa, T01RD6_A396EmprCod, T01RD6_A129BarCod, T01RD6_A132BarCodReo, T01RD6_A130BarCodPar,
            T01RD6_A2809MetTerCod, T01RD6_A2813MetPieCod, T01RD6_A12996MetPieDfID
            }
            , new Object[] {
            T01RD7_A12997MetPieDfDc, T01RD7_n12997MetPieDfDc
            }
            , new Object[] {
            T01RD8_A396EmprCod
            }
            , new Object[] {
            T01RD9_A396EmprCod, T01RD9_A2809MetTerCod, T01RD9_A129BarCod, T01RD9_A132BarCodReo, T01RD9_A130BarCodPar, T01RD9_A2813MetPieCod, T01RD9_A12995MetPieDfLi
            }
            , new Object[] {
            T01RD10_A396EmprCod, T01RD10_A2809MetTerCod, T01RD10_A129BarCod, T01RD10_A132BarCodReo, T01RD10_A130BarCodPar, T01RD10_A2813MetPieCod, T01RD10_A12995MetPieDfLi
            }
            , new Object[] {
            T01RD11_A396EmprCod, T01RD11_A2809MetTerCod, T01RD11_A129BarCod, T01RD11_A132BarCodReo, T01RD11_A130BarCodPar, T01RD11_A2813MetPieCod, T01RD11_A12995MetPieDfLi
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01RD15_A12997MetPieDfDc, T01RD15_n12997MetPieDfDc
            }
            , new Object[] {
            T01RD16_A396EmprCod, T01RD16_A2809MetTerCod, T01RD16_A129BarCod, T01RD16_A132BarCodReo, T01RD16_A130BarCodPar, T01RD16_A2813MetPieCod, T01RD16_A12995MetPieDfLi
            }
            , new Object[] {
            T01RD17_A396EmprCod
            }
         }
      );
      AV45Pgmname = "ExpedicionesAutomatizadas.METPID" ;
   }

   private byte wcpOAV36BarCodReo ;
   private byte Z132BarCodReo ;
   private byte GxWebError ;
   private byte A132BarCodReo ;
   private byte AV36BarCodReo ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private short wcpOAV39MetPieDfLin ;
   private short Z12995MetPieDfLi ;
   private short Z12996MetPieDfID ;
   private short N12996MetPieDfID ;
   private short A12996MetPieDfID ;
   private short AV39MetPieDfLin ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A12995MetPieDfLi ;
   private short AV43Insert_MetPieDfID ;
   private short RcdFound1781 ;
   private short nIsDirty_1781 ;
   private int wcpOAV35BarCod ;
   private int Z129BarCod ;
   private int A129BarCod ;
   private int AV35BarCod ;
   private int trnEnded ;
   private int edtMetTerCod_Enabled ;
   private int edtBarCod_Enabled ;
   private int edtBarCodReo_Enabled ;
   private int edtBarCodPar_Enabled ;
   private int edtMetPieCod_Enabled ;
   private int edtMetPieDfLi_Enabled ;
   private int edtMetPieDfID_Enabled ;
   private int edtMetPieDfDc_Enabled ;
   private int edtMetPieDfMi_Enabled ;
   private int edtMetPieDfMa_Enabled ;
   private int edtMetPieDfFa_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int edtavPgmname_Enabled ;
   private int edtEmprCod_Visible ;
   private int edtEmprCod_Enabled ;
   private int Datamonjs_Gxcontroltype ;
   private int AV46GXV1 ;
   private int GX_JID ;
   private int idxLst ;
   private java.math.BigDecimal Z12998MetPieDfMi ;
   private java.math.BigDecimal Z12999MetPieDfMa ;
   private java.math.BigDecimal A12998MetPieDfMi ;
   private java.math.BigDecimal A12999MetPieDfMa ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV32EmprCod ;
   private String wcpOAV34MetTerCod ;
   private String wcpOAV37BarCodPar ;
   private String wcpOAV38MetPieCod ;
   private String Z396EmprCod ;
   private String Z2809MetTerCod ;
   private String Z130BarCodPar ;
   private String Z2813MetPieCod ;
   private String Z13000MetPieDfFa ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A2809MetTerCod ;
   private String A130BarCodPar ;
   private String A2813MetPieCod ;
   private String Gx_mode ;
   private String AV32EmprCod ;
   private String AV34MetTerCod ;
   private String AV37BarCodPar ;
   private String AV38MetPieCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtMetPieCod_Internalname ;
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
   private String edtMetTerCod_Internalname ;
   private String edtMetTerCod_Jsonclick ;
   private String edtBarCod_Internalname ;
   private String edtBarCod_Jsonclick ;
   private String edtBarCodReo_Internalname ;
   private String edtBarCodReo_Jsonclick ;
   private String edtBarCodPar_Internalname ;
   private String edtBarCodPar_Jsonclick ;
   private String TempTags ;
   private String edtMetPieCod_Jsonclick ;
   private String edtMetPieDfLi_Internalname ;
   private String edtMetPieDfLi_Jsonclick ;
   private String edtMetPieDfID_Internalname ;
   private String edtMetPieDfID_Jsonclick ;
   private String edtMetPieDfDc_Internalname ;
   private String A12997MetPieDfDc ;
   private String edtMetPieDfDc_Jsonclick ;
   private String edtMetPieDfMi_Internalname ;
   private String edtMetPieDfMi_Jsonclick ;
   private String edtMetPieDfMa_Internalname ;
   private String edtMetPieDfMa_Jsonclick ;
   private String edtMetPieDfFa_Internalname ;
   private String A13000MetPieDfFa ;
   private String edtMetPieDfFa_Jsonclick ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String edtavPgmname_Internalname ;
   private String AV45Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String edtEmprCod_Internalname ;
   private String edtEmprCod_Jsonclick ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String Datamonjs_Objectcall ;
   private String Datamonjs_Class ;
   private String Datamonjs_Paramstr ;
   private String hsh ;
   private String sMode1781 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String AV12Station ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV11EmprNom ;
   private String GXv_char3[] ;
   private String AV8UsurCod ;
   private String GXv_char4[] ;
   private String Z12997MetPieDfDc ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
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
   private boolean Datamonjs_Enabled ;
   private boolean Datamonjs_Visible ;
   private boolean n12997MetPieDfDc ;
   private boolean returnInSub ;
   private com.genexus.webpanels.WebSession AV42WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private String[] T01RD5_A12997MetPieDfDc ;
   private boolean[] T01RD5_n12997MetPieDfDc ;
   private short[] T01RD6_A12995MetPieDfLi ;
   private String[] T01RD6_A12997MetPieDfDc ;
   private boolean[] T01RD6_n12997MetPieDfDc ;
   private java.math.BigDecimal[] T01RD6_A12998MetPieDfMi ;
   private java.math.BigDecimal[] T01RD6_A12999MetPieDfMa ;
   private String[] T01RD6_A13000MetPieDfFa ;
   private String[] T01RD6_A396EmprCod ;
   private int[] T01RD6_A129BarCod ;
   private byte[] T01RD6_A132BarCodReo ;
   private String[] T01RD6_A130BarCodPar ;
   private String[] T01RD6_A2809MetTerCod ;
   private String[] T01RD6_A2813MetPieCod ;
   private short[] T01RD6_A12996MetPieDfID ;
   private String[] T01RD4_A396EmprCod ;
   private String[] T01RD7_A12997MetPieDfDc ;
   private boolean[] T01RD7_n12997MetPieDfDc ;
   private String[] T01RD8_A396EmprCod ;
   private String[] T01RD9_A396EmprCod ;
   private String[] T01RD9_A2809MetTerCod ;
   private int[] T01RD9_A129BarCod ;
   private byte[] T01RD9_A132BarCodReo ;
   private String[] T01RD9_A130BarCodPar ;
   private String[] T01RD9_A2813MetPieCod ;
   private short[] T01RD9_A12995MetPieDfLi ;
   private short[] T01RD3_A12995MetPieDfLi ;
   private java.math.BigDecimal[] T01RD3_A12998MetPieDfMi ;
   private java.math.BigDecimal[] T01RD3_A12999MetPieDfMa ;
   private String[] T01RD3_A13000MetPieDfFa ;
   private String[] T01RD3_A396EmprCod ;
   private int[] T01RD3_A129BarCod ;
   private byte[] T01RD3_A132BarCodReo ;
   private String[] T01RD3_A130BarCodPar ;
   private String[] T01RD3_A2809MetTerCod ;
   private String[] T01RD3_A2813MetPieCod ;
   private short[] T01RD3_A12996MetPieDfID ;
   private String[] T01RD10_A396EmprCod ;
   private String[] T01RD10_A2809MetTerCod ;
   private int[] T01RD10_A129BarCod ;
   private byte[] T01RD10_A132BarCodReo ;
   private String[] T01RD10_A130BarCodPar ;
   private String[] T01RD10_A2813MetPieCod ;
   private short[] T01RD10_A12995MetPieDfLi ;
   private String[] T01RD11_A396EmprCod ;
   private String[] T01RD11_A2809MetTerCod ;
   private int[] T01RD11_A129BarCod ;
   private byte[] T01RD11_A132BarCodReo ;
   private String[] T01RD11_A130BarCodPar ;
   private String[] T01RD11_A2813MetPieCod ;
   private short[] T01RD11_A12995MetPieDfLi ;
   private short[] T01RD2_A12995MetPieDfLi ;
   private java.math.BigDecimal[] T01RD2_A12998MetPieDfMi ;
   private java.math.BigDecimal[] T01RD2_A12999MetPieDfMa ;
   private String[] T01RD2_A13000MetPieDfFa ;
   private String[] T01RD2_A396EmprCod ;
   private int[] T01RD2_A129BarCod ;
   private byte[] T01RD2_A132BarCodReo ;
   private String[] T01RD2_A130BarCodPar ;
   private String[] T01RD2_A2809MetTerCod ;
   private String[] T01RD2_A2813MetPieCod ;
   private short[] T01RD2_A12996MetPieDfID ;
   private String[] T01RD15_A12997MetPieDfDc ;
   private boolean[] T01RD15_n12997MetPieDfDc ;
   private String[] T01RD16_A396EmprCod ;
   private String[] T01RD16_A2809MetTerCod ;
   private int[] T01RD16_A129BarCod ;
   private byte[] T01RD16_A132BarCodReo ;
   private String[] T01RD16_A130BarCodPar ;
   private String[] T01RD16_A2813MetPieCod ;
   private short[] T01RD16_A12995MetPieDfLi ;
   private String[] T01RD17_A396EmprCod ;
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

final  class metpid__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class metpid__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class metpid__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class metpid__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class metpid__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01RD2", "SELECT MetPieDfLi, MetPieDfMi, MetPieDfMa, MetPieDfFa, EmprCod, BarCod, BarCodReo, BarCodPar, MetTerCod, MetPieCod, MetPieDfID FROM TXPMETPID WHERE EmprCod = ? AND MetTerCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND MetPieCod = ? AND MetPieDfLi = ?  FOR UPDATE OF MetPieDfMi, MetPieDfMa, MetPieDfFa, MetPieDfID NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RD3", "SELECT MetPieDfLi, MetPieDfMi, MetPieDfMa, MetPieDfFa, EmprCod, BarCod, BarCodReo, BarCodPar, MetTerCod, MetPieCod, MetPieDfID FROM TXPMETPID WHERE EmprCod = ? AND MetTerCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND MetPieCod = ? AND MetPieDfLi = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RD4", "SELECT EmprCod FROM TXPLMETPI WHERE EmprCod = ? AND MetTerCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND MetPieCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RD5", "SELECT TipDefDsc AS MetPieDfDc FROM TXPTIPDEF WHERE EmprCod = ? AND TipDefCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RD6", "SELECT /*+ FIRST_ROWS(100) */ TM1.MetPieDfLi, T2.TipDefDsc AS MetPieDfDc, TM1.MetPieDfMi, TM1.MetPieDfMa, TM1.MetPieDfFa, TM1.EmprCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar, TM1.MetTerCod, TM1.MetPieCod, TM1.MetPieDfID AS MetPieDfID FROM (TXPMETPID TM1 INNER JOIN TXPTIPDEF T2 ON T2.EmprCod = TM1.EmprCod AND T2.TipDefCod = TM1.MetPieDfID) WHERE TM1.EmprCod = ? and TM1.MetTerCod = ? and TM1.BarCod = ? and TM1.BarCodReo = ? and TM1.BarCodPar = ? and TM1.MetPieCod = ? and TM1.MetPieDfLi = ? ORDER BY TM1.EmprCod, TM1.MetTerCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar, TM1.MetPieCod, TM1.MetPieDfLi ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RD7", "SELECT TipDefDsc AS MetPieDfDc FROM TXPTIPDEF WHERE EmprCod = ? AND TipDefCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RD8", "SELECT EmprCod FROM TXPLMETPI WHERE EmprCod = ? AND MetTerCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND MetPieCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RD9", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar, MetPieCod, MetPieDfLi FROM TXPMETPID WHERE EmprCod = ? AND MetTerCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND MetPieCod = ? AND MetPieDfLi = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RD10", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar, MetPieCod, MetPieDfLi FROM TXPMETPID WHERE ( EmprCod > ? or EmprCod = ? and MetTerCod > ? or MetTerCod = ? and EmprCod = ? and BarCod > ? or BarCod = ? and MetTerCod = ? and EmprCod = ? and BarCodReo > ? or BarCodReo = ? and BarCod = ? and MetTerCod = ? and EmprCod = ? and BarCodPar > ? or BarCodPar = ? and BarCodReo = ? and BarCod = ? and MetTerCod = ? and EmprCod = ? and MetPieCod > ? or MetPieCod = ? and BarCodPar = ? and BarCodReo = ? and BarCod = ? and MetTerCod = ? and EmprCod = ? and MetPieDfLi > ?) ORDER BY EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar, MetPieCod, MetPieDfLi) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RD11", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar, MetPieCod, MetPieDfLi FROM TXPMETPID WHERE ( EmprCod < ? or EmprCod = ? and MetTerCod < ? or MetTerCod = ? and EmprCod = ? and BarCod < ? or BarCod = ? and MetTerCod = ? and EmprCod = ? and BarCodReo < ? or BarCodReo = ? and BarCod = ? and MetTerCod = ? and EmprCod = ? and BarCodPar < ? or BarCodPar = ? and BarCodReo = ? and BarCod = ? and MetTerCod = ? and EmprCod = ? and MetPieCod < ? or MetPieCod = ? and BarCodPar = ? and BarCodReo = ? and BarCod = ? and MetTerCod = ? and EmprCod = ? and MetPieDfLi < ?) ORDER BY EmprCod DESC, MetTerCod DESC, BarCod DESC, BarCodReo DESC, BarCodPar DESC, MetPieCod DESC, MetPieDfLi DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01RD12", "INSERT INTO TXPMETPID(MetPieDfLi, MetPieDfMi, MetPieDfMa, MetPieDfFa, EmprCod, BarCod, BarCodReo, BarCodPar, MetTerCod, MetPieCod, MetPieDfID) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPMETPID")
         ,new UpdateCursor("T01RD13", "UPDATE TXPMETPID SET MetPieDfMi=?, MetPieDfMa=?, MetPieDfFa=?, MetPieDfID=?  WHERE EmprCod = ? AND MetTerCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND MetPieCod = ? AND MetPieDfLi = ?", GX_NOMASK, "TXPMETPID")
         ,new UpdateCursor("T01RD14", "DELETE FROM TXPMETPID  WHERE EmprCod = ? AND MetTerCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND MetPieCod = ? AND MetPieDfLi = ?", GX_NOMASK, "TXPMETPID")
         ,new ForEachCursor("T01RD15", "SELECT TipDefDsc AS MetPieDfDc FROM TXPTIPDEF WHERE EmprCod = ? AND TipDefCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RD16", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar, MetPieCod, MetPieDfLi FROM TXPMETPID ORDER BY EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar, MetPieCod, MetPieDfLi ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RD17", "SELECT EmprCod FROM TXPLMETPI WHERE EmprCod = ? AND MetTerCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND MetPieCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((String[]) buf[8])[0] = rslt.getString(9, 10);
               ((String[]) buf[9])[0] = rslt.getString(10, 9);
               ((short[]) buf[10])[0] = rslt.getShort(11);
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((String[]) buf[8])[0] = rslt.getString(9, 10);
               ((String[]) buf[9])[0] = rslt.getString(10, 9);
               ((short[]) buf[10])[0] = rslt.getShort(11);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 4 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,2);
               ((String[]) buf[5])[0] = rslt.getString(5, 8);
               ((String[]) buf[6])[0] = rslt.getString(6, 3);
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((byte[]) buf[8])[0] = rslt.getByte(8);
               ((String[]) buf[9])[0] = rslt.getString(9, 1);
               ((String[]) buf[10])[0] = rslt.getString(10, 10);
               ((String[]) buf[11])[0] = rslt.getString(11, 9);
               ((short[]) buf[12])[0] = rslt.getShort(12);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 9);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 9);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 9);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 9);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 15 :
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
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 10);
               stmt.setString(4, (String)parms[3], 10);
               stmt.setString(5, (String)parms[4], 3);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setString(8, (String)parms[7], 10);
               stmt.setString(9, (String)parms[8], 3);
               stmt.setByte(10, ((Number) parms[9]).byteValue());
               stmt.setByte(11, ((Number) parms[10]).byteValue());
               stmt.setInt(12, ((Number) parms[11]).intValue());
               stmt.setString(13, (String)parms[12], 10);
               stmt.setString(14, (String)parms[13], 3);
               stmt.setString(15, (String)parms[14], 1);
               stmt.setString(16, (String)parms[15], 1);
               stmt.setByte(17, ((Number) parms[16]).byteValue());
               stmt.setInt(18, ((Number) parms[17]).intValue());
               stmt.setString(19, (String)parms[18], 10);
               stmt.setString(20, (String)parms[19], 3);
               stmt.setString(21, (String)parms[20], 9);
               stmt.setString(22, (String)parms[21], 9);
               stmt.setString(23, (String)parms[22], 1);
               stmt.setByte(24, ((Number) parms[23]).byteValue());
               stmt.setInt(25, ((Number) parms[24]).intValue());
               stmt.setString(26, (String)parms[25], 10);
               stmt.setString(27, (String)parms[26], 3);
               stmt.setShort(28, ((Number) parms[27]).shortValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 10);
               stmt.setString(4, (String)parms[3], 10);
               stmt.setString(5, (String)parms[4], 3);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setString(8, (String)parms[7], 10);
               stmt.setString(9, (String)parms[8], 3);
               stmt.setByte(10, ((Number) parms[9]).byteValue());
               stmt.setByte(11, ((Number) parms[10]).byteValue());
               stmt.setInt(12, ((Number) parms[11]).intValue());
               stmt.setString(13, (String)parms[12], 10);
               stmt.setString(14, (String)parms[13], 3);
               stmt.setString(15, (String)parms[14], 1);
               stmt.setString(16, (String)parms[15], 1);
               stmt.setByte(17, ((Number) parms[16]).byteValue());
               stmt.setInt(18, ((Number) parms[17]).intValue());
               stmt.setString(19, (String)parms[18], 10);
               stmt.setString(20, (String)parms[19], 3);
               stmt.setString(21, (String)parms[20], 9);
               stmt.setString(22, (String)parms[21], 9);
               stmt.setString(23, (String)parms[22], 1);
               stmt.setByte(24, ((Number) parms[23]).byteValue());
               stmt.setInt(25, ((Number) parms[24]).intValue());
               stmt.setString(26, (String)parms[25], 10);
               stmt.setString(27, (String)parms[26], 3);
               stmt.setShort(28, ((Number) parms[27]).shortValue());
               return;
            case 10 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 2);
               stmt.setString(4, (String)parms[3], 8);
               stmt.setString(5, (String)parms[4], 3);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setString(8, (String)parms[7], 1);
               stmt.setString(9, (String)parms[8], 10);
               stmt.setString(10, (String)parms[9], 9);
               stmt.setShort(11, ((Number) parms[10]).shortValue());
               return;
            case 11 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setString(5, (String)parms[4], 3);
               stmt.setString(6, (String)parms[5], 10);
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               stmt.setString(9, (String)parms[8], 1);
               stmt.setString(10, (String)parms[9], 9);
               stmt.setShort(11, ((Number) parms[10]).shortValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
               return;
      }
   }

}

