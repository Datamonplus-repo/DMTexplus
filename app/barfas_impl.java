package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class barfas_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_27") == 0 )
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
         gxload_27( A396EmprCod, A457FasCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_28") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A603MaqCodBis = httpContext.GetPar( "MaqCodBis") ;
         httpContext.ajax_rsp_assign_attri("", false, "A603MaqCodBis", A603MaqCodBis);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_28( A396EmprCod, A603MaqCodBis) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_26") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A758ProCod = httpContext.GetPar( "ProCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_26( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, A758ProCod) ;
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
            AV8BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8BarCod), 8, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV8BarCod), "ZZZZZZZ9")));
            AV9BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9BarCodReo", GXutil.str( AV9BarCodReo, 1, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODREO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV9BarCodReo), "9")));
            AV10BarCodPar = httpContext.GetPar( "BarCodPar") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10BarCodPar", AV10BarCodPar);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODPAR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV10BarCodPar, ""))));
            AV11ProCod = httpContext.GetPar( "ProCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV11ProCod", AV11ProCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPROCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV11ProCod, ""))));
            AV12BarOrdLin = (short)(GXutil.lval( httpContext.GetPar( "BarOrdLin"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12BarOrdLin), 4, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARORDLIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV12BarOrdLin), "ZZZ9")));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Tabla BARFAS", ""), (short)(0)) ;
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

   public barfas_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public barfas_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( barfas_impl.class ));
   }

   public barfas_impl( int remoteHandle ,
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtEmprCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtEmprCod_Internalname, httpContext.getMessage( "Código Empresa", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,22);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtEmprCod_Enabled, 1, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_BARFAS.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarCod_Internalname, httpContext.getMessage( "Codigo Barcada", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,27);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtBarCod_Enabled, 1, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_BARFAS.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarCodReo_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarCodReo_Internalname, httpContext.getMessage( "Codigo Reoperado Barcada", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 32,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodReo_Internalname, GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,32);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodReo_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtBarCodReo_Enabled, 1, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_BARFAS.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarCodPar_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarCodPar_Internalname, httpContext.getMessage( "Codigo Particion Barcada", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 37,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodPar_Internalname, GXutil.rtrim( A130BarCodPar), GXutil.rtrim( localUtil.format( A130BarCodPar, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,37);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodPar_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtBarCodPar_Enabled, 1, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_BARFAS.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtProCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtProCod_Internalname, httpContext.getMessage( "Codigo Proceso", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 42,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtProCod_Internalname, GXutil.rtrim( A758ProCod), GXutil.rtrim( localUtil.format( A758ProCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,42);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtProCod_Enabled, 1, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_BARFAS.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarOrdLin_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarOrdLin_Internalname, httpContext.getMessage( "Orden", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 47,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarOrdLin_Internalname, GXutil.ltrim( localUtil.ntoc( A194BarOrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A194BarOrdLin), "ZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,47);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarOrdLin_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtBarOrdLin_Enabled, 1, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_BARFAS.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 52,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_BARFAS.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_BARFAS.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_BARFAS.htm");
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
      e111PU2 ();
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
            Z758ProCod = httpContext.cgiGet( "Z758ProCod") ;
            Z194BarOrdLin = (short)(localUtil.ctol( httpContext.cgiGet( "Z194BarOrdLin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z152BarFasCon = httpContext.cgiGet( "Z152BarFasCon") ;
            Z153BarFasEst = (byte)(localUtil.ctol( httpContext.cgiGet( "Z153BarFasEst"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z150BarFacTin = httpContext.cgiGet( "Z150BarFacTin") ;
            Z162BarFecTeo = localUtil.ctod( httpContext.cgiGet( "Z162BarFecTeo"), 0) ;
            Z160BarFecRea = localUtil.ctod( httpContext.cgiGet( "Z160BarFecRea"), 0) ;
            Z216BarTieTeo = localUtil.ctond( httpContext.cgiGet( "Z216BarTieTeo")) ;
            Z227BarUni = localUtil.ctond( httpContext.cgiGet( "Z227BarUni")) ;
            Z179BarLoc = httpContext.cgiGet( "Z179BarLoc") ;
            Z165BarHorIni = (short)(localUtil.ctol( httpContext.cgiGet( "Z165BarHorIni"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z164BarHorFin = (short)(localUtil.ctol( httpContext.cgiGet( "Z164BarHorFin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z215BarTieRea = localUtil.ctond( httpContext.cgiGet( "Z215BarTieRea")) ;
            Z3298BarFecRIni = localUtil.ctod( httpContext.cgiGet( "Z3298BarFecRIni"), 0) ;
            Z4021BarFasBot = httpContext.cgiGet( "Z4021BarFasBot") ;
            Z4022BarNumBot = (int)(localUtil.ctol( httpContext.cgiGet( "Z4022BarNumBot"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z4287BarFasFor = httpContext.cgiGet( "Z4287BarFasFor") ;
            Z4288BarNPzas = (int)(localUtil.ctol( httpContext.cgiGet( "Z4288BarNPzas"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z4301BarFasCoP = httpContext.cgiGet( "Z4301BarFasCoP") ;
            Z4637BarFasCara = httpContext.cgiGet( "Z4637BarFasCara") ;
            Z4905BarFasAcab = httpContext.cgiGet( "Z4905BarFasAcab") ;
            Z5999BarFasCR = localUtil.ctond( httpContext.cgiGet( "Z5999BarFasCR")) ;
            Z6430BarTieAut = (short)(localUtil.ctol( httpContext.cgiGet( "Z6430BarTieAut"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z6555BarFasNPl = (byte)(localUtil.ctol( httpContext.cgiGet( "Z6555BarFasNPl"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z3836BarFasPri = (byte)(localUtil.ctol( httpContext.cgiGet( "Z3836BarFasPri"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z457FasCod = httpContext.cgiGet( "Z457FasCod") ;
            Z603MaqCodBis = httpContext.cgiGet( "Z603MaqCodBis") ;
            A152BarFasCon = httpContext.cgiGet( "Z152BarFasCon") ;
            A153BarFasEst = (byte)(localUtil.ctol( httpContext.cgiGet( "Z153BarFasEst"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A150BarFacTin = httpContext.cgiGet( "Z150BarFacTin") ;
            A162BarFecTeo = localUtil.ctod( httpContext.cgiGet( "Z162BarFecTeo"), 0) ;
            A160BarFecRea = localUtil.ctod( httpContext.cgiGet( "Z160BarFecRea"), 0) ;
            A216BarTieTeo = localUtil.ctond( httpContext.cgiGet( "Z216BarTieTeo")) ;
            A227BarUni = localUtil.ctond( httpContext.cgiGet( "Z227BarUni")) ;
            A179BarLoc = httpContext.cgiGet( "Z179BarLoc") ;
            A165BarHorIni = (short)(localUtil.ctol( httpContext.cgiGet( "Z165BarHorIni"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A164BarHorFin = (short)(localUtil.ctol( httpContext.cgiGet( "Z164BarHorFin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A215BarTieRea = localUtil.ctond( httpContext.cgiGet( "Z215BarTieRea")) ;
            A3298BarFecRIni = localUtil.ctod( httpContext.cgiGet( "Z3298BarFecRIni"), 0) ;
            A4021BarFasBot = httpContext.cgiGet( "Z4021BarFasBot") ;
            A4022BarNumBot = (int)(localUtil.ctol( httpContext.cgiGet( "Z4022BarNumBot"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A4287BarFasFor = httpContext.cgiGet( "Z4287BarFasFor") ;
            A4288BarNPzas = (int)(localUtil.ctol( httpContext.cgiGet( "Z4288BarNPzas"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A4301BarFasCoP = httpContext.cgiGet( "Z4301BarFasCoP") ;
            A4637BarFasCara = httpContext.cgiGet( "Z4637BarFasCara") ;
            A4905BarFasAcab = httpContext.cgiGet( "Z4905BarFasAcab") ;
            A5999BarFasCR = localUtil.ctond( httpContext.cgiGet( "Z5999BarFasCR")) ;
            A6430BarTieAut = (short)(localUtil.ctol( httpContext.cgiGet( "Z6430BarTieAut"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A6555BarFasNPl = (byte)(localUtil.ctol( httpContext.cgiGet( "Z6555BarFasNPl"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A3836BarFasPri = (byte)(localUtil.ctol( httpContext.cgiGet( "Z3836BarFasPri"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A457FasCod = httpContext.cgiGet( "Z457FasCod") ;
            A603MaqCodBis = httpContext.cgiGet( "Z603MaqCodBis") ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            N457FasCod = httpContext.cgiGet( "N457FasCod") ;
            N603MaqCodBis = httpContext.cgiGet( "N603MaqCodBis") ;
            AV7EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            AV8BarCod = (int)(localUtil.ctol( httpContext.cgiGet( "vBARCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV9BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( "vBARCODREO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV10BarCodPar = httpContext.cgiGet( "vBARCODPAR") ;
            AV11ProCod = httpContext.cgiGet( "vPROCOD") ;
            AV12BarOrdLin = (short)(localUtil.ctol( httpContext.cgiGet( "vBARORDLIN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV16Insert_FasCod = httpContext.cgiGet( "vINSERT_FASCOD") ;
            A457FasCod = httpContext.cgiGet( "FASCOD") ;
            AV17Insert_MaqCodBis = httpContext.cgiGet( "vINSERT_MAQCODBIS") ;
            A603MaqCodBis = httpContext.cgiGet( "MAQCODBIS") ;
            A152BarFasCon = httpContext.cgiGet( "BARFASCON") ;
            A153BarFasEst = (byte)(localUtil.ctol( httpContext.cgiGet( "BARFASEST"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A150BarFacTin = httpContext.cgiGet( "BARFACTIN") ;
            A162BarFecTeo = localUtil.ctod( httpContext.cgiGet( "BARFECTEO"), 0) ;
            A160BarFecRea = localUtil.ctod( httpContext.cgiGet( "BARFECREA"), 0) ;
            A216BarTieTeo = localUtil.ctond( httpContext.cgiGet( "BARTIETEO")) ;
            A227BarUni = localUtil.ctond( httpContext.cgiGet( "BARUNI")) ;
            A179BarLoc = httpContext.cgiGet( "BARLOC") ;
            A165BarHorIni = (short)(localUtil.ctol( httpContext.cgiGet( "BARHORINI"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A164BarHorFin = (short)(localUtil.ctol( httpContext.cgiGet( "BARHORFIN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A215BarTieRea = localUtil.ctond( httpContext.cgiGet( "BARTIEREA")) ;
            A3298BarFecRIni = localUtil.ctod( httpContext.cgiGet( "BARFECRINI"), 0) ;
            A4021BarFasBot = httpContext.cgiGet( "BARFASBOT") ;
            A4022BarNumBot = (int)(localUtil.ctol( httpContext.cgiGet( "BARNUMBOT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A4287BarFasFor = httpContext.cgiGet( "BARFASFOR") ;
            A4288BarNPzas = (int)(localUtil.ctol( httpContext.cgiGet( "BARNPZAS"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A4301BarFasCoP = httpContext.cgiGet( "BARFASCOP") ;
            A4637BarFasCara = httpContext.cgiGet( "BARFASCARA") ;
            A4905BarFasAcab = httpContext.cgiGet( "BARFASACAB") ;
            A5999BarFasCR = localUtil.ctond( httpContext.cgiGet( "BARFASCR")) ;
            A6430BarTieAut = (short)(localUtil.ctol( httpContext.cgiGet( "BARTIEAUT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A6555BarFasNPl = (byte)(localUtil.ctol( httpContext.cgiGet( "BARFASNPL"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A3836BarFasPri = (byte)(localUtil.ctol( httpContext.cgiGet( "BARFASPRI"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A458FasCon = httpContext.cgiGet( "FASCON") ;
            n458FasCon = false ;
            A459FasDec = localUtil.ctond( httpContext.cgiGet( "FASDEC")) ;
            n459FasDec = false ;
            A602MaqCod = httpContext.cgiGet( "MAQCOD") ;
            n602MaqCod = false ;
            A456FasActTin = httpContext.cgiGet( "FASACTTIN") ;
            n456FasActTin = false ;
            A4903FasAcab = httpContext.cgiGet( "FASACAB") ;
            n4903FasAcab = false ;
            AV22Pgmname = httpContext.cgiGet( "vPGMNAME") ;
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
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtBarCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A129BarCod = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            }
            else
            {
               A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARCODREO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtBarCodReo_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A132BarCodReo = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            }
            else
            {
               A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            }
            A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            A758ProCod = httpContext.cgiGet( edtProCod_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarOrdLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarOrdLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARORDLIN");
               AnyError = (short)(1) ;
               GX_FocusControl = edtBarOrdLin_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A194BarOrdLin = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A194BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A194BarOrdLin), 4, 0));
            }
            else
            {
               A194BarOrdLin = (short)(localUtil.ctol( httpContext.cgiGet( edtBarOrdLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A194BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A194BarOrdLin), 4, 0));
            }
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"BARFAS");
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            forbiddenHiddens.add("BarFasCon", GXutil.rtrim( localUtil.format( A152BarFasCon, "@!")));
            forbiddenHiddens.add("BarFasEst", localUtil.format( DecimalUtil.doubleToDec(A153BarFasEst), "9"));
            forbiddenHiddens.add("BarFacTin", GXutil.rtrim( localUtil.format( A150BarFacTin, "@!")));
            forbiddenHiddens.add("BarFecTeo", localUtil.format(A162BarFecTeo, "99/99/99"));
            forbiddenHiddens.add("BarFecRea", localUtil.format(A160BarFecRea, "99/99/99"));
            forbiddenHiddens.add("BarTieTeo", localUtil.format( A216BarTieTeo, "Z9.99"));
            forbiddenHiddens.add("BarUni", localUtil.format( A227BarUni, "ZZZZZ9.99"));
            forbiddenHiddens.add("BarLoc", GXutil.rtrim( localUtil.format( A179BarLoc, "")));
            forbiddenHiddens.add("BarHorIni", localUtil.format( DecimalUtil.doubleToDec(A165BarHorIni), "ZZZ9"));
            forbiddenHiddens.add("BarHorFin", localUtil.format( DecimalUtil.doubleToDec(A164BarHorFin), "ZZZ9"));
            forbiddenHiddens.add("BarTieRea", localUtil.format( A215BarTieRea, "Z9.99"));
            forbiddenHiddens.add("BarFecRIni", localUtil.format(A3298BarFecRIni, "99/99/99"));
            forbiddenHiddens.add("BarFasBot", GXutil.rtrim( localUtil.format( A4021BarFasBot, "")));
            forbiddenHiddens.add("BarNumBot", localUtil.format( DecimalUtil.doubleToDec(A4022BarNumBot), "ZZZZZ9"));
            forbiddenHiddens.add("BarFasFor", GXutil.rtrim( localUtil.format( A4287BarFasFor, "@!")));
            forbiddenHiddens.add("BarNPzas", localUtil.format( DecimalUtil.doubleToDec(A4288BarNPzas), "ZZZZZZZ9"));
            forbiddenHiddens.add("BarFasCoP", GXutil.rtrim( localUtil.format( A4301BarFasCoP, "@!")));
            forbiddenHiddens.add("BarFasCara", GXutil.rtrim( localUtil.format( A4637BarFasCara, "")));
            forbiddenHiddens.add("BarFasAcab", GXutil.rtrim( localUtil.format( A4905BarFasAcab, "@!")));
            forbiddenHiddens.add("BarFasCR", localUtil.format( A5999BarFasCR, "ZZZZ9.99999"));
            forbiddenHiddens.add("BarTieAut", localUtil.format( DecimalUtil.doubleToDec(A6430BarTieAut), "ZZZ9"));
            forbiddenHiddens.add("BarFasNPl", localUtil.format( DecimalUtil.doubleToDec(A6555BarFasNPl), "9"));
            forbiddenHiddens.add("BarFasPri", localUtil.format( DecimalUtil.doubleToDec(A3836BarFasPri), "Z9"));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) || ( A194BarOrdLin != Z194BarOrdLin ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("barfas:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
               A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
               A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
               httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
               A758ProCod = httpContext.GetPar( "ProCod") ;
               httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
               A194BarOrdLin = (short)(GXutil.lval( httpContext.GetPar( "BarOrdLin"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A194BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A194BarOrdLin), 4, 0));
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
                  sMode15 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  Gx_mode = sMode15 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound15 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_1PU0( ) ;
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
                        e111PU2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e121PU2 ();
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
         e121PU2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll1PU15( ) ;
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
         disableAttributes1PU15( ) ;
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

   public void confirm_1PU0( )
   {
      beforeValidate1PU15( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1PU15( ) ;
         }
         else
         {
            checkExtendedTable1PU15( ) ;
            closeExtendedTableCursors1PU15( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
   }

   public void resetCaption1PU0( )
   {
   }

   public void e111PU2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV19Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      barfas_impl.this.GXt_char1 = GXv_char2[0] ;
      AV19Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19Station", AV19Station);
      GXv_char2[0] = AV7EmprCod ;
      GXv_char3[0] = AV20Emprnom ;
      GXv_char4[0] = AV21Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV19Station, GXv_char2, GXv_char3, GXv_char4) ;
      barfas_impl.this.AV7EmprCod = GXv_char2[0] ;
      barfas_impl.this.AV20Emprnom = GXv_char3[0] ;
      barfas_impl.this.AV21Usurcod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV20Emprnom", AV20Emprnom);
      httpContext.ajax_rsp_assign_attri("", false, "AV21Usurcod", AV21Usurcod);
      GXv_SdtWWPContext5[0] = AV13WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext5) ;
      AV13WWPContext = GXv_SdtWWPContext5[0] ;
      AV14TrnContext.fromxml(AV15WebSession.getValue("TrnContext"), null, null);
      if ( ( GXutil.strcmp(AV14TrnContext.getgxTv_SdtWWPTransactionContext_Transactionname(), AV22Pgmname) == 0 ) && ( GXutil.strcmp(Gx_mode, "INS") == 0 ) )
      {
         AV23GXV1 = 1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV23GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23GXV1), 8, 0));
         while ( AV23GXV1 <= AV14TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().size() )
         {
            AV18TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)((app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)AV14TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().elementAt(-1+AV23GXV1));
            if ( GXutil.strcmp(AV18TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "FasCod") == 0 )
            {
               AV16Insert_FasCod = AV18TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue() ;
               httpContext.ajax_rsp_assign_attri("", false, "AV16Insert_FasCod", AV16Insert_FasCod);
            }
            else if ( GXutil.strcmp(AV18TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "MaqCodBis") == 0 )
            {
               AV17Insert_MaqCodBis = AV18TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue() ;
               httpContext.ajax_rsp_assign_attri("", false, "AV17Insert_MaqCodBis", AV17Insert_MaqCodBis);
            }
            AV23GXV1 = (int)(AV23GXV1+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV23GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23GXV1), 8, 0));
         }
      }
   }

   public void e121PU2( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      pr_default.close(4);
      pr_default.close(3);
      pr_default.close(2);
      pr_default.close(1);
      returnInSub = true;
      if (true) return;
   }

   public void zm1PU15( int GX_JID )
   {
      if ( ( GX_JID == 25 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z152BarFasCon = T01PU3_A152BarFasCon[0] ;
            Z153BarFasEst = T01PU3_A153BarFasEst[0] ;
            Z150BarFacTin = T01PU3_A150BarFacTin[0] ;
            Z162BarFecTeo = T01PU3_A162BarFecTeo[0] ;
            Z160BarFecRea = T01PU3_A160BarFecRea[0] ;
            Z216BarTieTeo = T01PU3_A216BarTieTeo[0] ;
            Z227BarUni = T01PU3_A227BarUni[0] ;
            Z179BarLoc = T01PU3_A179BarLoc[0] ;
            Z165BarHorIni = T01PU3_A165BarHorIni[0] ;
            Z164BarHorFin = T01PU3_A164BarHorFin[0] ;
            Z215BarTieRea = T01PU3_A215BarTieRea[0] ;
            Z3298BarFecRIni = T01PU3_A3298BarFecRIni[0] ;
            Z4021BarFasBot = T01PU3_A4021BarFasBot[0] ;
            Z4022BarNumBot = T01PU3_A4022BarNumBot[0] ;
            Z4287BarFasFor = T01PU3_A4287BarFasFor[0] ;
            Z4288BarNPzas = T01PU3_A4288BarNPzas[0] ;
            Z4301BarFasCoP = T01PU3_A4301BarFasCoP[0] ;
            Z4637BarFasCara = T01PU3_A4637BarFasCara[0] ;
            Z4905BarFasAcab = T01PU3_A4905BarFasAcab[0] ;
            Z5999BarFasCR = T01PU3_A5999BarFasCR[0] ;
            Z6430BarTieAut = T01PU3_A6430BarTieAut[0] ;
            Z6555BarFasNPl = T01PU3_A6555BarFasNPl[0] ;
            Z3836BarFasPri = T01PU3_A3836BarFasPri[0] ;
            Z457FasCod = T01PU3_A457FasCod[0] ;
            Z603MaqCodBis = T01PU3_A603MaqCodBis[0] ;
         }
         else
         {
            Z152BarFasCon = A152BarFasCon ;
            Z153BarFasEst = A153BarFasEst ;
            Z150BarFacTin = A150BarFacTin ;
            Z162BarFecTeo = A162BarFecTeo ;
            Z160BarFecRea = A160BarFecRea ;
            Z216BarTieTeo = A216BarTieTeo ;
            Z227BarUni = A227BarUni ;
            Z179BarLoc = A179BarLoc ;
            Z165BarHorIni = A165BarHorIni ;
            Z164BarHorFin = A164BarHorFin ;
            Z215BarTieRea = A215BarTieRea ;
            Z3298BarFecRIni = A3298BarFecRIni ;
            Z4021BarFasBot = A4021BarFasBot ;
            Z4022BarNumBot = A4022BarNumBot ;
            Z4287BarFasFor = A4287BarFasFor ;
            Z4288BarNPzas = A4288BarNPzas ;
            Z4301BarFasCoP = A4301BarFasCoP ;
            Z4637BarFasCara = A4637BarFasCara ;
            Z4905BarFasAcab = A4905BarFasAcab ;
            Z5999BarFasCR = A5999BarFasCR ;
            Z6430BarTieAut = A6430BarTieAut ;
            Z6555BarFasNPl = A6555BarFasNPl ;
            Z3836BarFasPri = A3836BarFasPri ;
            Z457FasCod = A457FasCod ;
            Z603MaqCodBis = A603MaqCodBis ;
         }
      }
      if ( GX_JID == -25 )
      {
         Z194BarOrdLin = A194BarOrdLin ;
         Z152BarFasCon = A152BarFasCon ;
         Z153BarFasEst = A153BarFasEst ;
         Z150BarFacTin = A150BarFacTin ;
         Z162BarFecTeo = A162BarFecTeo ;
         Z160BarFecRea = A160BarFecRea ;
         Z216BarTieTeo = A216BarTieTeo ;
         Z227BarUni = A227BarUni ;
         Z179BarLoc = A179BarLoc ;
         Z165BarHorIni = A165BarHorIni ;
         Z164BarHorFin = A164BarHorFin ;
         Z215BarTieRea = A215BarTieRea ;
         Z3298BarFecRIni = A3298BarFecRIni ;
         Z4021BarFasBot = A4021BarFasBot ;
         Z4022BarNumBot = A4022BarNumBot ;
         Z4287BarFasFor = A4287BarFasFor ;
         Z4288BarNPzas = A4288BarNPzas ;
         Z4301BarFasCoP = A4301BarFasCoP ;
         Z4637BarFasCara = A4637BarFasCara ;
         Z4905BarFasAcab = A4905BarFasAcab ;
         Z5999BarFasCR = A5999BarFasCR ;
         Z6430BarTieAut = A6430BarTieAut ;
         Z6555BarFasNPl = A6555BarFasNPl ;
         Z3836BarFasPri = A3836BarFasPri ;
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z758ProCod = A758ProCod ;
         Z457FasCod = A457FasCod ;
         Z603MaqCodBis = A603MaqCodBis ;
         Z458FasCon = A458FasCon ;
         Z459FasDec = A459FasDec ;
         Z602MaqCod = A602MaqCod ;
         Z456FasActTin = A456FasActTin ;
         Z4903FasAcab = A4903FasAcab ;
      }
   }

   public void standaloneNotModal( )
   {
      AV22Pgmname = "BARFAS" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22Pgmname", AV22Pgmname);
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
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
      if ( ! (0==AV8BarCod) )
      {
         A129BarCod = AV8BarCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
      }
      if ( ! (0==AV8BarCod) )
      {
         edtBarCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), true);
      }
      else
      {
         edtBarCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), true);
      }
      if ( ! (0==AV8BarCod) )
      {
         edtBarCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), true);
      }
      if ( ! (0==AV9BarCodReo) )
      {
         A132BarCodReo = AV9BarCodReo ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
      }
      if ( ! (0==AV9BarCodReo) )
      {
         edtBarCodReo_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), true);
      }
      else
      {
         edtBarCodReo_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), true);
      }
      if ( ! (0==AV9BarCodReo) )
      {
         edtBarCodReo_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), true);
      }
      if ( ! (GXutil.strcmp("", AV10BarCodPar)==0) )
      {
         A130BarCodPar = AV10BarCodPar ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      }
      if ( ! (GXutil.strcmp("", AV10BarCodPar)==0) )
      {
         edtBarCodPar_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), true);
      }
      else
      {
         edtBarCodPar_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), true);
      }
      if ( ! (GXutil.strcmp("", AV10BarCodPar)==0) )
      {
         edtBarCodPar_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), true);
      }
      if ( ! (GXutil.strcmp("", AV11ProCod)==0) )
      {
         A758ProCod = AV11ProCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
      }
      if ( ! (GXutil.strcmp("", AV11ProCod)==0) )
      {
         edtProCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProCod_Enabled), 5, 0), true);
      }
      else
      {
         edtProCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProCod_Enabled), 5, 0), true);
      }
      if ( ! (GXutil.strcmp("", AV11ProCod)==0) )
      {
         edtProCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProCod_Enabled), 5, 0), true);
      }
      if ( ! (0==AV12BarOrdLin) )
      {
         A194BarOrdLin = AV12BarOrdLin ;
         httpContext.ajax_rsp_assign_attri("", false, "A194BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A194BarOrdLin), 4, 0));
      }
      if ( ! (0==AV12BarOrdLin) )
      {
         edtBarOrdLin_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarOrdLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarOrdLin_Enabled), 5, 0), true);
      }
      else
      {
         edtBarOrdLin_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarOrdLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarOrdLin_Enabled), 5, 0), true);
      }
      if ( ! (0==AV12BarOrdLin) )
      {
         edtBarOrdLin_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarOrdLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarOrdLin_Enabled), 5, 0), true);
      }
   }

   public void standaloneModal( )
   {
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (GXutil.strcmp("", AV17Insert_MaqCodBis)==0) )
      {
         A603MaqCodBis = AV17Insert_MaqCodBis ;
         httpContext.ajax_rsp_assign_attri("", false, "A603MaqCodBis", A603MaqCodBis);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (GXutil.strcmp("", AV16Insert_FasCod)==0) )
      {
         A457FasCod = AV16Insert_FasCod ;
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
         /* Using cursor T01PU5 */
         pr_default.execute(3, new Object[] {A396EmprCod, A457FasCod});
         A458FasCon = T01PU5_A458FasCon[0] ;
         n458FasCon = T01PU5_n458FasCon[0] ;
         A459FasDec = T01PU5_A459FasDec[0] ;
         n459FasDec = T01PU5_n459FasDec[0] ;
         A602MaqCod = T01PU5_A602MaqCod[0] ;
         n602MaqCod = T01PU5_n602MaqCod[0] ;
         A456FasActTin = T01PU5_A456FasActTin[0] ;
         n456FasActTin = T01PU5_n456FasActTin[0] ;
         A4903FasAcab = T01PU5_A4903FasAcab[0] ;
         n4903FasAcab = T01PU5_n4903FasAcab[0] ;
         pr_default.close(3);
      }
   }

   public void load1PU15( )
   {
      /* Using cursor T01PU7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound15 = (short)(1) ;
         A458FasCon = T01PU7_A458FasCon[0] ;
         n458FasCon = T01PU7_n458FasCon[0] ;
         A152BarFasCon = T01PU7_A152BarFasCon[0] ;
         A153BarFasEst = T01PU7_A153BarFasEst[0] ;
         A459FasDec = T01PU7_A459FasDec[0] ;
         n459FasDec = T01PU7_n459FasDec[0] ;
         A602MaqCod = T01PU7_A602MaqCod[0] ;
         n602MaqCod = T01PU7_n602MaqCod[0] ;
         A456FasActTin = T01PU7_A456FasActTin[0] ;
         n456FasActTin = T01PU7_n456FasActTin[0] ;
         A150BarFacTin = T01PU7_A150BarFacTin[0] ;
         A162BarFecTeo = T01PU7_A162BarFecTeo[0] ;
         A160BarFecRea = T01PU7_A160BarFecRea[0] ;
         A216BarTieTeo = T01PU7_A216BarTieTeo[0] ;
         A227BarUni = T01PU7_A227BarUni[0] ;
         A179BarLoc = T01PU7_A179BarLoc[0] ;
         A165BarHorIni = T01PU7_A165BarHorIni[0] ;
         A164BarHorFin = T01PU7_A164BarHorFin[0] ;
         A215BarTieRea = T01PU7_A215BarTieRea[0] ;
         A3298BarFecRIni = T01PU7_A3298BarFecRIni[0] ;
         A4021BarFasBot = T01PU7_A4021BarFasBot[0] ;
         A4022BarNumBot = T01PU7_A4022BarNumBot[0] ;
         A4287BarFasFor = T01PU7_A4287BarFasFor[0] ;
         A4288BarNPzas = T01PU7_A4288BarNPzas[0] ;
         A4301BarFasCoP = T01PU7_A4301BarFasCoP[0] ;
         A4637BarFasCara = T01PU7_A4637BarFasCara[0] ;
         A4905BarFasAcab = T01PU7_A4905BarFasAcab[0] ;
         A4903FasAcab = T01PU7_A4903FasAcab[0] ;
         n4903FasAcab = T01PU7_n4903FasAcab[0] ;
         A5999BarFasCR = T01PU7_A5999BarFasCR[0] ;
         A6430BarTieAut = T01PU7_A6430BarTieAut[0] ;
         A6555BarFasNPl = T01PU7_A6555BarFasNPl[0] ;
         A3836BarFasPri = T01PU7_A3836BarFasPri[0] ;
         A457FasCod = T01PU7_A457FasCod[0] ;
         A603MaqCodBis = T01PU7_A603MaqCodBis[0] ;
         zm1PU15( -25) ;
      }
      pr_default.close(5);
      onLoadActions1PU15( ) ;
   }

   public void onLoadActions1PU15( )
   {
   }

   public void checkExtendedTable1PU15( )
   {
      nIsDirty_15 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01PU5 */
      pr_default.execute(3, new Object[] {A396EmprCod, A457FasCod});
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FASPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FASCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A458FasCon = T01PU5_A458FasCon[0] ;
      n458FasCon = T01PU5_n458FasCon[0] ;
      A459FasDec = T01PU5_A459FasDec[0] ;
      n459FasDec = T01PU5_n459FasDec[0] ;
      A602MaqCod = T01PU5_A602MaqCod[0] ;
      n602MaqCod = T01PU5_n602MaqCod[0] ;
      A456FasActTin = T01PU5_A456FasActTin[0] ;
      n456FasActTin = T01PU5_n456FasActTin[0] ;
      A4903FasAcab = T01PU5_A4903FasAcab[0] ;
      n4903FasAcab = T01PU5_n4903FasAcab[0] ;
      pr_default.close(3);
      /* Using cursor T01PU6 */
      pr_default.execute(4, new Object[] {A396EmprCod, A603MaqCodBis});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MAQUIN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MAQCODBIS");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(4);
      /* Using cursor T01PU4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "BARPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(2);
   }

   public void closeExtendedTableCursors1PU15( )
   {
      pr_default.close(3);
      pr_default.close(4);
      pr_default.close(2);
   }

   public void enableDisable( )
   {
   }

   public void gxload_27( String A396EmprCod ,
                          String A457FasCod )
   {
      /* Using cursor T01PU8 */
      pr_default.execute(6, new Object[] {A396EmprCod, A457FasCod});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FASPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FASCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A458FasCon = T01PU8_A458FasCon[0] ;
      n458FasCon = T01PU8_n458FasCon[0] ;
      A459FasDec = T01PU8_A459FasDec[0] ;
      n459FasDec = T01PU8_n459FasDec[0] ;
      A602MaqCod = T01PU8_A602MaqCod[0] ;
      n602MaqCod = T01PU8_n602MaqCod[0] ;
      A456FasActTin = T01PU8_A456FasActTin[0] ;
      n456FasActTin = T01PU8_n456FasActTin[0] ;
      A4903FasAcab = T01PU8_A4903FasAcab[0] ;
      n4903FasAcab = T01PU8_n4903FasAcab[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A458FasCon))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A459FasDec, (byte)(5), (byte)(1), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A602MaqCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A456FasActTin))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A4903FasAcab))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(6) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(6);
   }

   public void gxload_28( String A396EmprCod ,
                          String A603MaqCodBis )
   {
      /* Using cursor T01PU9 */
      pr_default.execute(7, new Object[] {A396EmprCod, A603MaqCodBis});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MAQUIN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MAQCODBIS");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_default.getStatus(7) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(7);
   }

   public void gxload_26( String A396EmprCod ,
                          int A129BarCod ,
                          byte A132BarCodReo ,
                          String A130BarCodPar ,
                          String A758ProCod )
   {
      /* Using cursor T01PU10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "BARPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_default.getStatus(8) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(8);
   }

   public void getKey1PU15( )
   {
      /* Using cursor T01PU11 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound15 = (short)(1) ;
      }
      else
      {
         RcdFound15 = (short)(0) ;
      }
      pr_default.close(9);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01PU3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1PU15( 25) ;
         RcdFound15 = (short)(1) ;
         A194BarOrdLin = T01PU3_A194BarOrdLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A194BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A194BarOrdLin), 4, 0));
         A152BarFasCon = T01PU3_A152BarFasCon[0] ;
         A153BarFasEst = T01PU3_A153BarFasEst[0] ;
         A150BarFacTin = T01PU3_A150BarFacTin[0] ;
         A162BarFecTeo = T01PU3_A162BarFecTeo[0] ;
         A160BarFecRea = T01PU3_A160BarFecRea[0] ;
         A216BarTieTeo = T01PU3_A216BarTieTeo[0] ;
         A227BarUni = T01PU3_A227BarUni[0] ;
         A179BarLoc = T01PU3_A179BarLoc[0] ;
         A165BarHorIni = T01PU3_A165BarHorIni[0] ;
         A164BarHorFin = T01PU3_A164BarHorFin[0] ;
         A215BarTieRea = T01PU3_A215BarTieRea[0] ;
         A3298BarFecRIni = T01PU3_A3298BarFecRIni[0] ;
         A4021BarFasBot = T01PU3_A4021BarFasBot[0] ;
         A4022BarNumBot = T01PU3_A4022BarNumBot[0] ;
         A4287BarFasFor = T01PU3_A4287BarFasFor[0] ;
         A4288BarNPzas = T01PU3_A4288BarNPzas[0] ;
         A4301BarFasCoP = T01PU3_A4301BarFasCoP[0] ;
         A4637BarFasCara = T01PU3_A4637BarFasCara[0] ;
         A4905BarFasAcab = T01PU3_A4905BarFasAcab[0] ;
         A5999BarFasCR = T01PU3_A5999BarFasCR[0] ;
         A6430BarTieAut = T01PU3_A6430BarTieAut[0] ;
         A6555BarFasNPl = T01PU3_A6555BarFasNPl[0] ;
         A3836BarFasPri = T01PU3_A3836BarFasPri[0] ;
         A396EmprCod = T01PU3_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = T01PU3_A129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T01PU3_A132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T01PU3_A130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A758ProCod = T01PU3_A758ProCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
         A457FasCod = T01PU3_A457FasCod[0] ;
         A603MaqCodBis = T01PU3_A603MaqCodBis[0] ;
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z758ProCod = A758ProCod ;
         Z194BarOrdLin = A194BarOrdLin ;
         sMode15 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1PU15( ) ;
         if ( AnyError == 1 )
         {
            RcdFound15 = (short)(0) ;
            initializeNonKey1PU15( ) ;
         }
         Gx_mode = sMode15 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound15 = (short)(0) ;
         initializeNonKey1PU15( ) ;
         sMode15 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode15 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1PU15( ) ;
      if ( RcdFound15 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound15 = (short)(0) ;
      /* Using cursor T01PU12 */
      pr_default.execute(10, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A129BarCod), Integer.valueOf(A129BarCod), A396EmprCod, Byte.valueOf(A132BarCodReo), Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A396EmprCod, A130BarCodPar, A130BarCodPar, Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A396EmprCod, A758ProCod, A758ProCod, A130BarCodPar, Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A396EmprCod, Short.valueOf(A194BarOrdLin)});
      if ( (pr_default.getStatus(10) != 101) )
      {
         while ( (pr_default.getStatus(10) != 101) && ( ( GXutil.strcmp(T01PU12_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01PU12_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01PU12_A129BarCod[0] < A129BarCod ) || ( T01PU12_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01PU12_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01PU12_A132BarCodReo[0] < A132BarCodReo ) || ( T01PU12_A132BarCodReo[0] == A132BarCodReo ) && ( T01PU12_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01PU12_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01PU12_A130BarCodPar[0], A130BarCodPar) < 0 ) || ( GXutil.strcmp(T01PU12_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01PU12_A132BarCodReo[0] == A132BarCodReo ) && ( T01PU12_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01PU12_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01PU12_A758ProCod[0], A758ProCod) < 0 ) || ( GXutil.strcmp(T01PU12_A758ProCod[0], A758ProCod) == 0 ) && ( GXutil.strcmp(T01PU12_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01PU12_A132BarCodReo[0] == A132BarCodReo ) && ( T01PU12_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01PU12_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01PU12_A194BarOrdLin[0] < A194BarOrdLin ) ) )
         {
            pr_default.readNext(10);
         }
         if ( (pr_default.getStatus(10) != 101) && ( ( GXutil.strcmp(T01PU12_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01PU12_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01PU12_A129BarCod[0] > A129BarCod ) || ( T01PU12_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01PU12_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01PU12_A132BarCodReo[0] > A132BarCodReo ) || ( T01PU12_A132BarCodReo[0] == A132BarCodReo ) && ( T01PU12_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01PU12_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01PU12_A130BarCodPar[0], A130BarCodPar) > 0 ) || ( GXutil.strcmp(T01PU12_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01PU12_A132BarCodReo[0] == A132BarCodReo ) && ( T01PU12_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01PU12_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01PU12_A758ProCod[0], A758ProCod) > 0 ) || ( GXutil.strcmp(T01PU12_A758ProCod[0], A758ProCod) == 0 ) && ( GXutil.strcmp(T01PU12_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01PU12_A132BarCodReo[0] == A132BarCodReo ) && ( T01PU12_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01PU12_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01PU12_A194BarOrdLin[0] > A194BarOrdLin ) ) )
         {
            A396EmprCod = T01PU12_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A129BarCod = T01PU12_A129BarCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = T01PU12_A132BarCodReo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = T01PU12_A130BarCodPar[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            A758ProCod = T01PU12_A758ProCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
            A194BarOrdLin = T01PU12_A194BarOrdLin[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A194BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A194BarOrdLin), 4, 0));
            RcdFound15 = (short)(1) ;
         }
      }
      pr_default.close(10);
   }

   public void move_previous( )
   {
      RcdFound15 = (short)(0) ;
      /* Using cursor T01PU13 */
      pr_default.execute(11, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A129BarCod), Integer.valueOf(A129BarCod), A396EmprCod, Byte.valueOf(A132BarCodReo), Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A396EmprCod, A130BarCodPar, A130BarCodPar, Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A396EmprCod, A758ProCod, A758ProCod, A130BarCodPar, Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A396EmprCod, Short.valueOf(A194BarOrdLin)});
      if ( (pr_default.getStatus(11) != 101) )
      {
         while ( (pr_default.getStatus(11) != 101) && ( ( GXutil.strcmp(T01PU13_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01PU13_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01PU13_A129BarCod[0] > A129BarCod ) || ( T01PU13_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01PU13_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01PU13_A132BarCodReo[0] > A132BarCodReo ) || ( T01PU13_A132BarCodReo[0] == A132BarCodReo ) && ( T01PU13_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01PU13_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01PU13_A130BarCodPar[0], A130BarCodPar) > 0 ) || ( GXutil.strcmp(T01PU13_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01PU13_A132BarCodReo[0] == A132BarCodReo ) && ( T01PU13_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01PU13_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01PU13_A758ProCod[0], A758ProCod) > 0 ) || ( GXutil.strcmp(T01PU13_A758ProCod[0], A758ProCod) == 0 ) && ( GXutil.strcmp(T01PU13_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01PU13_A132BarCodReo[0] == A132BarCodReo ) && ( T01PU13_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01PU13_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01PU13_A194BarOrdLin[0] > A194BarOrdLin ) ) )
         {
            pr_default.readNext(11);
         }
         if ( (pr_default.getStatus(11) != 101) && ( ( GXutil.strcmp(T01PU13_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01PU13_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01PU13_A129BarCod[0] < A129BarCod ) || ( T01PU13_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01PU13_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01PU13_A132BarCodReo[0] < A132BarCodReo ) || ( T01PU13_A132BarCodReo[0] == A132BarCodReo ) && ( T01PU13_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01PU13_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01PU13_A130BarCodPar[0], A130BarCodPar) < 0 ) || ( GXutil.strcmp(T01PU13_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01PU13_A132BarCodReo[0] == A132BarCodReo ) && ( T01PU13_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01PU13_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01PU13_A758ProCod[0], A758ProCod) < 0 ) || ( GXutil.strcmp(T01PU13_A758ProCod[0], A758ProCod) == 0 ) && ( GXutil.strcmp(T01PU13_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01PU13_A132BarCodReo[0] == A132BarCodReo ) && ( T01PU13_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01PU13_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01PU13_A194BarOrdLin[0] < A194BarOrdLin ) ) )
         {
            A396EmprCod = T01PU13_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A129BarCod = T01PU13_A129BarCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = T01PU13_A132BarCodReo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = T01PU13_A130BarCodPar[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            A758ProCod = T01PU13_A758ProCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
            A194BarOrdLin = T01PU13_A194BarOrdLin[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A194BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A194BarOrdLin), 4, 0));
            RcdFound15 = (short)(1) ;
         }
      }
      pr_default.close(11);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1PU15( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1PU15( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound15 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) || ( A194BarOrdLin != Z194BarOrdLin ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A129BarCod = Z129BarCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
               A132BarCodReo = Z132BarCodReo ;
               httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
               A130BarCodPar = Z130BarCodPar ;
               httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
               A758ProCod = Z758ProCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
               A194BarOrdLin = Z194BarOrdLin ;
               httpContext.ajax_rsp_assign_attri("", false, "A194BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A194BarOrdLin), 4, 0));
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
               update1PU15( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) || ( A194BarOrdLin != Z194BarOrdLin ) )
            {
               /* Insert record */
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1PU15( ) ;
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
                  insert1PU15( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) || ( A194BarOrdLin != Z194BarOrdLin ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = Z129BarCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = Z132BarCodReo ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = Z130BarCodPar ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A758ProCod = Z758ProCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
         A194BarOrdLin = Z194BarOrdLin ;
         httpContext.ajax_rsp_assign_attri("", false, "A194BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A194BarOrdLin), 4, 0));
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

   public void checkOptimisticConcurrency1PU15( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01PU2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPBARFAS"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z152BarFasCon, T01PU2_A152BarFasCon[0]) != 0 ) || ( Z153BarFasEst != T01PU2_A153BarFasEst[0] ) || ( GXutil.strcmp(Z150BarFacTin, T01PU2_A150BarFacTin[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z162BarFecTeo), GXutil.resetTime(T01PU2_A162BarFecTeo[0])) ) || !( GXutil.dateCompare(GXutil.resetTime(Z160BarFecRea), GXutil.resetTime(T01PU2_A160BarFecRea[0])) ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z216BarTieTeo, T01PU2_A216BarTieTeo[0]) != 0 ) || ( DecimalUtil.compareTo(Z227BarUni, T01PU2_A227BarUni[0]) != 0 ) || ( GXutil.strcmp(Z179BarLoc, T01PU2_A179BarLoc[0]) != 0 ) || ( Z165BarHorIni != T01PU2_A165BarHorIni[0] ) || ( Z164BarHorFin != T01PU2_A164BarHorFin[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z215BarTieRea, T01PU2_A215BarTieRea[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z3298BarFecRIni), GXutil.resetTime(T01PU2_A3298BarFecRIni[0])) ) || ( GXutil.strcmp(Z4021BarFasBot, T01PU2_A4021BarFasBot[0]) != 0 ) || ( Z4022BarNumBot != T01PU2_A4022BarNumBot[0] ) || ( GXutil.strcmp(Z4287BarFasFor, T01PU2_A4287BarFasFor[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z4288BarNPzas != T01PU2_A4288BarNPzas[0] ) || ( GXutil.strcmp(Z4301BarFasCoP, T01PU2_A4301BarFasCoP[0]) != 0 ) || ( GXutil.strcmp(Z4637BarFasCara, T01PU2_A4637BarFasCara[0]) != 0 ) || ( GXutil.strcmp(Z4905BarFasAcab, T01PU2_A4905BarFasAcab[0]) != 0 ) || ( DecimalUtil.compareTo(Z5999BarFasCR, T01PU2_A5999BarFasCR[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z6430BarTieAut != T01PU2_A6430BarTieAut[0] ) || ( Z6555BarFasNPl != T01PU2_A6555BarFasNPl[0] ) || ( Z3836BarFasPri != T01PU2_A3836BarFasPri[0] ) || ( GXutil.strcmp(Z457FasCod, T01PU2_A457FasCod[0]) != 0 ) || ( GXutil.strcmp(Z603MaqCodBis, T01PU2_A603MaqCodBis[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z152BarFasCon, T01PU2_A152BarFasCon[0]) != 0 )
            {
               GXutil.writeLogln("barfas:[seudo value changed for attri]"+"BarFasCon");
               GXutil.writeLogRaw("Old: ",Z152BarFasCon);
               GXutil.writeLogRaw("Current: ",T01PU2_A152BarFasCon[0]);
            }
            if ( Z153BarFasEst != T01PU2_A153BarFasEst[0] )
            {
               GXutil.writeLogln("barfas:[seudo value changed for attri]"+"BarFasEst");
               GXutil.writeLogRaw("Old: ",Z153BarFasEst);
               GXutil.writeLogRaw("Current: ",T01PU2_A153BarFasEst[0]);
            }
            if ( GXutil.strcmp(Z150BarFacTin, T01PU2_A150BarFacTin[0]) != 0 )
            {
               GXutil.writeLogln("barfas:[seudo value changed for attri]"+"BarFacTin");
               GXutil.writeLogRaw("Old: ",Z150BarFacTin);
               GXutil.writeLogRaw("Current: ",T01PU2_A150BarFacTin[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z162BarFecTeo), GXutil.resetTime(T01PU2_A162BarFecTeo[0])) ) )
            {
               GXutil.writeLogln("barfas:[seudo value changed for attri]"+"BarFecTeo");
               GXutil.writeLogRaw("Old: ",Z162BarFecTeo);
               GXutil.writeLogRaw("Current: ",T01PU2_A162BarFecTeo[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z160BarFecRea), GXutil.resetTime(T01PU2_A160BarFecRea[0])) ) )
            {
               GXutil.writeLogln("barfas:[seudo value changed for attri]"+"BarFecRea");
               GXutil.writeLogRaw("Old: ",Z160BarFecRea);
               GXutil.writeLogRaw("Current: ",T01PU2_A160BarFecRea[0]);
            }
            if ( DecimalUtil.compareTo(Z216BarTieTeo, T01PU2_A216BarTieTeo[0]) != 0 )
            {
               GXutil.writeLogln("barfas:[seudo value changed for attri]"+"BarTieTeo");
               GXutil.writeLogRaw("Old: ",Z216BarTieTeo);
               GXutil.writeLogRaw("Current: ",T01PU2_A216BarTieTeo[0]);
            }
            if ( DecimalUtil.compareTo(Z227BarUni, T01PU2_A227BarUni[0]) != 0 )
            {
               GXutil.writeLogln("barfas:[seudo value changed for attri]"+"BarUni");
               GXutil.writeLogRaw("Old: ",Z227BarUni);
               GXutil.writeLogRaw("Current: ",T01PU2_A227BarUni[0]);
            }
            if ( GXutil.strcmp(Z179BarLoc, T01PU2_A179BarLoc[0]) != 0 )
            {
               GXutil.writeLogln("barfas:[seudo value changed for attri]"+"BarLoc");
               GXutil.writeLogRaw("Old: ",Z179BarLoc);
               GXutil.writeLogRaw("Current: ",T01PU2_A179BarLoc[0]);
            }
            if ( Z165BarHorIni != T01PU2_A165BarHorIni[0] )
            {
               GXutil.writeLogln("barfas:[seudo value changed for attri]"+"BarHorIni");
               GXutil.writeLogRaw("Old: ",Z165BarHorIni);
               GXutil.writeLogRaw("Current: ",T01PU2_A165BarHorIni[0]);
            }
            if ( Z164BarHorFin != T01PU2_A164BarHorFin[0] )
            {
               GXutil.writeLogln("barfas:[seudo value changed for attri]"+"BarHorFin");
               GXutil.writeLogRaw("Old: ",Z164BarHorFin);
               GXutil.writeLogRaw("Current: ",T01PU2_A164BarHorFin[0]);
            }
            if ( DecimalUtil.compareTo(Z215BarTieRea, T01PU2_A215BarTieRea[0]) != 0 )
            {
               GXutil.writeLogln("barfas:[seudo value changed for attri]"+"BarTieRea");
               GXutil.writeLogRaw("Old: ",Z215BarTieRea);
               GXutil.writeLogRaw("Current: ",T01PU2_A215BarTieRea[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z3298BarFecRIni), GXutil.resetTime(T01PU2_A3298BarFecRIni[0])) ) )
            {
               GXutil.writeLogln("barfas:[seudo value changed for attri]"+"BarFecRIni");
               GXutil.writeLogRaw("Old: ",Z3298BarFecRIni);
               GXutil.writeLogRaw("Current: ",T01PU2_A3298BarFecRIni[0]);
            }
            if ( GXutil.strcmp(Z4021BarFasBot, T01PU2_A4021BarFasBot[0]) != 0 )
            {
               GXutil.writeLogln("barfas:[seudo value changed for attri]"+"BarFasBot");
               GXutil.writeLogRaw("Old: ",Z4021BarFasBot);
               GXutil.writeLogRaw("Current: ",T01PU2_A4021BarFasBot[0]);
            }
            if ( Z4022BarNumBot != T01PU2_A4022BarNumBot[0] )
            {
               GXutil.writeLogln("barfas:[seudo value changed for attri]"+"BarNumBot");
               GXutil.writeLogRaw("Old: ",Z4022BarNumBot);
               GXutil.writeLogRaw("Current: ",T01PU2_A4022BarNumBot[0]);
            }
            if ( GXutil.strcmp(Z4287BarFasFor, T01PU2_A4287BarFasFor[0]) != 0 )
            {
               GXutil.writeLogln("barfas:[seudo value changed for attri]"+"BarFasFor");
               GXutil.writeLogRaw("Old: ",Z4287BarFasFor);
               GXutil.writeLogRaw("Current: ",T01PU2_A4287BarFasFor[0]);
            }
            if ( Z4288BarNPzas != T01PU2_A4288BarNPzas[0] )
            {
               GXutil.writeLogln("barfas:[seudo value changed for attri]"+"BarNPzas");
               GXutil.writeLogRaw("Old: ",Z4288BarNPzas);
               GXutil.writeLogRaw("Current: ",T01PU2_A4288BarNPzas[0]);
            }
            if ( GXutil.strcmp(Z4301BarFasCoP, T01PU2_A4301BarFasCoP[0]) != 0 )
            {
               GXutil.writeLogln("barfas:[seudo value changed for attri]"+"BarFasCoP");
               GXutil.writeLogRaw("Old: ",Z4301BarFasCoP);
               GXutil.writeLogRaw("Current: ",T01PU2_A4301BarFasCoP[0]);
            }
            if ( GXutil.strcmp(Z4637BarFasCara, T01PU2_A4637BarFasCara[0]) != 0 )
            {
               GXutil.writeLogln("barfas:[seudo value changed for attri]"+"BarFasCara");
               GXutil.writeLogRaw("Old: ",Z4637BarFasCara);
               GXutil.writeLogRaw("Current: ",T01PU2_A4637BarFasCara[0]);
            }
            if ( GXutil.strcmp(Z4905BarFasAcab, T01PU2_A4905BarFasAcab[0]) != 0 )
            {
               GXutil.writeLogln("barfas:[seudo value changed for attri]"+"BarFasAcab");
               GXutil.writeLogRaw("Old: ",Z4905BarFasAcab);
               GXutil.writeLogRaw("Current: ",T01PU2_A4905BarFasAcab[0]);
            }
            if ( DecimalUtil.compareTo(Z5999BarFasCR, T01PU2_A5999BarFasCR[0]) != 0 )
            {
               GXutil.writeLogln("barfas:[seudo value changed for attri]"+"BarFasCR");
               GXutil.writeLogRaw("Old: ",Z5999BarFasCR);
               GXutil.writeLogRaw("Current: ",T01PU2_A5999BarFasCR[0]);
            }
            if ( Z6430BarTieAut != T01PU2_A6430BarTieAut[0] )
            {
               GXutil.writeLogln("barfas:[seudo value changed for attri]"+"BarTieAut");
               GXutil.writeLogRaw("Old: ",Z6430BarTieAut);
               GXutil.writeLogRaw("Current: ",T01PU2_A6430BarTieAut[0]);
            }
            if ( Z6555BarFasNPl != T01PU2_A6555BarFasNPl[0] )
            {
               GXutil.writeLogln("barfas:[seudo value changed for attri]"+"BarFasNPl");
               GXutil.writeLogRaw("Old: ",Z6555BarFasNPl);
               GXutil.writeLogRaw("Current: ",T01PU2_A6555BarFasNPl[0]);
            }
            if ( Z3836BarFasPri != T01PU2_A3836BarFasPri[0] )
            {
               GXutil.writeLogln("barfas:[seudo value changed for attri]"+"BarFasPri");
               GXutil.writeLogRaw("Old: ",Z3836BarFasPri);
               GXutil.writeLogRaw("Current: ",T01PU2_A3836BarFasPri[0]);
            }
            if ( GXutil.strcmp(Z457FasCod, T01PU2_A457FasCod[0]) != 0 )
            {
               GXutil.writeLogln("barfas:[seudo value changed for attri]"+"FasCod");
               GXutil.writeLogRaw("Old: ",Z457FasCod);
               GXutil.writeLogRaw("Current: ",T01PU2_A457FasCod[0]);
            }
            if ( GXutil.strcmp(Z603MaqCodBis, T01PU2_A603MaqCodBis[0]) != 0 )
            {
               GXutil.writeLogln("barfas:[seudo value changed for attri]"+"MaqCodBis");
               GXutil.writeLogRaw("Old: ",Z603MaqCodBis);
               GXutil.writeLogRaw("Current: ",T01PU2_A603MaqCodBis[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPBARFAS"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1PU15( )
   {
      beforeValidate1PU15( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1PU15( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1PU15( 0) ;
         checkOptimisticConcurrency1PU15( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1PU15( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1PU15( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01PU14 */
                  pr_default.execute(12, new Object[] {Short.valueOf(A194BarOrdLin), A152BarFasCon, Byte.valueOf(A153BarFasEst), A150BarFacTin, A162BarFecTeo, A160BarFecRea, A216BarTieTeo, A227BarUni, A179BarLoc, Short.valueOf(A165BarHorIni), Short.valueOf(A164BarHorFin), A215BarTieRea, A3298BarFecRIni, A4021BarFasBot, Integer.valueOf(A4022BarNumBot), A4287BarFasFor, Integer.valueOf(A4288BarNPzas), A4301BarFasCoP, A4637BarFasCara, A4905BarFasAcab, A5999BarFasCR, Short.valueOf(A6430BarTieAut), Byte.valueOf(A6555BarFasNPl), Byte.valueOf(A3836BarFasPri), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, A457FasCod, A603MaqCodBis});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARFAS");
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
                        /* Save values for previous() function. */
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                        endTrnMsgCod = "SuccessfullyAdded" ;
                        resetCaption1PU0( ) ;
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
            load1PU15( ) ;
         }
         endLevel1PU15( ) ;
      }
      closeExtendedTableCursors1PU15( ) ;
   }

   public void update1PU15( )
   {
      beforeValidate1PU15( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1PU15( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1PU15( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1PU15( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1PU15( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01PU15 */
                  pr_default.execute(13, new Object[] {A152BarFasCon, Byte.valueOf(A153BarFasEst), A150BarFacTin, A162BarFecTeo, A160BarFecRea, A216BarTieTeo, A227BarUni, A179BarLoc, Short.valueOf(A165BarHorIni), Short.valueOf(A164BarHorFin), A215BarTieRea, A3298BarFecRIni, A4021BarFasBot, Integer.valueOf(A4022BarNumBot), A4287BarFasFor, Integer.valueOf(A4288BarNPzas), A4301BarFasCoP, A4637BarFasCara, A4905BarFasAcab, A5999BarFasCR, Short.valueOf(A6430BarTieAut), Byte.valueOf(A6555BarFasNPl), Byte.valueOf(A3836BarFasPri), A457FasCod, A603MaqCodBis, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARFAS");
                  if ( (pr_default.getStatus(13) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPBARFAS"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1PU15( ) ;
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
         endLevel1PU15( ) ;
      }
      closeExtendedTableCursors1PU15( ) ;
   }

   public void deferredUpdate1PU15( )
   {
   }

   public void delete( )
   {
      beforeValidate1PU15( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1PU15( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1PU15( ) ;
         afterConfirm1PU15( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1PU15( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01PU16 */
               pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARFAS");
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
      sMode15 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1PU15( ) ;
      Gx_mode = sMode15 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1PU15( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01PU17 */
         pr_default.execute(15, new Object[] {A396EmprCod, A457FasCod});
         A458FasCon = T01PU17_A458FasCon[0] ;
         n458FasCon = T01PU17_n458FasCon[0] ;
         A459FasDec = T01PU17_A459FasDec[0] ;
         n459FasDec = T01PU17_n459FasDec[0] ;
         A602MaqCod = T01PU17_A602MaqCod[0] ;
         n602MaqCod = T01PU17_n602MaqCod[0] ;
         A456FasActTin = T01PU17_A456FasActTin[0] ;
         n456FasActTin = T01PU17_n456FasActTin[0] ;
         A4903FasAcab = T01PU17_A4903FasAcab[0] ;
         n4903FasAcab = T01PU17_n4903FasAcab[0] ;
         pr_default.close(15);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T01PU18 */
         pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(16) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level8", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(16);
         /* Using cursor T01PU19 */
         pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(17) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level7", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(17);
         /* Using cursor T01PU20 */
         pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(18) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level6", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(18);
         /* Using cursor T01PU21 */
         pr_default.execute(19, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(19) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level5", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(19);
         /* Using cursor T01PU22 */
         pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(20) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level4", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(20);
         /* Using cursor T01PU23 */
         pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(21) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level3", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(21);
         /* Using cursor T01PU24 */
         pr_default.execute(22, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(22) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level2", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(22);
         /* Using cursor T01PU25 */
         pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(23) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(23);
         /* Using cursor T01PU26 */
         pr_default.execute(24, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(24) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(24);
         /* Using cursor T01PU27 */
         pr_default.execute(25, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(25) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ZEPHYR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(25);
         /* Using cursor T01PU28 */
         pr_default.execute(26, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(26) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CACEMp", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(26);
         /* Using cursor T01PU29 */
         pr_default.execute(27, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(27) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CACABp", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(27);
         /* Using cursor T01PU30 */
         pr_default.execute(28, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(28) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CACCAp", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(28);
         /* Using cursor T01PU31 */
         pr_default.execute(29, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(29) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CACPEp", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(29);
         /* Using cursor T01PU32 */
         pr_default.execute(30, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(30) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CACRAp", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(30);
         /* Using cursor T01PU33 */
         pr_default.execute(31, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(31) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DT005", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(31);
         /* Using cursor T01PU34 */
         pr_default.execute(32, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(32) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "FASQUI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(32);
         /* Using cursor T01PU35 */
         pr_default.execute(33, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(33) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "AGRHDF", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(33);
         /* Using cursor T01PU36 */
         pr_default.execute(34, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(34) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "FASMAQ", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(34);
         /* Using cursor T01PU37 */
         pr_default.execute(35, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(35) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(35);
         /* Using cursor T01PU38 */
         pr_default.execute(36, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(36) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Parametros por fase de la HR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(36);
      }
   }

   public void endLevel1PU15( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1PU15( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "barfas");
         if ( AnyError == 0 )
         {
            confirmValues1PU0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "barfas");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1PU15( )
   {
      /* Scan By routine */
      /* Using cursor T01PU39 */
      pr_default.execute(37);
      RcdFound15 = (short)(0) ;
      if ( (pr_default.getStatus(37) != 101) )
      {
         RcdFound15 = (short)(1) ;
         A396EmprCod = T01PU39_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = T01PU39_A129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T01PU39_A132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T01PU39_A130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A758ProCod = T01PU39_A758ProCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
         A194BarOrdLin = T01PU39_A194BarOrdLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A194BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A194BarOrdLin), 4, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1PU15( )
   {
      /* Scan next routine */
      pr_default.readNext(37);
      RcdFound15 = (short)(0) ;
      if ( (pr_default.getStatus(37) != 101) )
      {
         RcdFound15 = (short)(1) ;
         A396EmprCod = T01PU39_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = T01PU39_A129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T01PU39_A132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T01PU39_A130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A758ProCod = T01PU39_A758ProCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
         A194BarOrdLin = T01PU39_A194BarOrdLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A194BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A194BarOrdLin), 4, 0));
      }
   }

   public void scanEnd1PU15( )
   {
      pr_default.close(37);
   }

   public void afterConfirm1PU15( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1PU15( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1PU15( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1PU15( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1PU15( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1PU15( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1PU15( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtBarCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), true);
      edtBarCodReo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), true);
      edtBarCodPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), true);
      edtProCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProCod_Enabled), 5, 0), true);
      edtBarOrdLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarOrdLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarOrdLin_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1PU15( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1PU0( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.barfas", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV7EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV8BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV9BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV10BarCodPar)),GXutil.URLEncode(GXutil.rtrim(AV11ProCod)),GXutil.URLEncode(GXutil.ltrimstr(AV12BarOrdLin,4,0))}, new String[] {"Gx_mode","EmprCod","BarCod","BarCodReo","BarCodPar","ProCod","BarOrdLin"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"BARFAS");
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      forbiddenHiddens.add("BarFasCon", GXutil.rtrim( localUtil.format( A152BarFasCon, "@!")));
      forbiddenHiddens.add("BarFasEst", localUtil.format( DecimalUtil.doubleToDec(A153BarFasEst), "9"));
      forbiddenHiddens.add("BarFacTin", GXutil.rtrim( localUtil.format( A150BarFacTin, "@!")));
      forbiddenHiddens.add("BarFecTeo", localUtil.format(A162BarFecTeo, "99/99/99"));
      forbiddenHiddens.add("BarFecRea", localUtil.format(A160BarFecRea, "99/99/99"));
      forbiddenHiddens.add("BarTieTeo", localUtil.format( A216BarTieTeo, "Z9.99"));
      forbiddenHiddens.add("BarUni", localUtil.format( A227BarUni, "ZZZZZ9.99"));
      forbiddenHiddens.add("BarLoc", GXutil.rtrim( localUtil.format( A179BarLoc, "")));
      forbiddenHiddens.add("BarHorIni", localUtil.format( DecimalUtil.doubleToDec(A165BarHorIni), "ZZZ9"));
      forbiddenHiddens.add("BarHorFin", localUtil.format( DecimalUtil.doubleToDec(A164BarHorFin), "ZZZ9"));
      forbiddenHiddens.add("BarTieRea", localUtil.format( A215BarTieRea, "Z9.99"));
      forbiddenHiddens.add("BarFecRIni", localUtil.format(A3298BarFecRIni, "99/99/99"));
      forbiddenHiddens.add("BarFasBot", GXutil.rtrim( localUtil.format( A4021BarFasBot, "")));
      forbiddenHiddens.add("BarNumBot", localUtil.format( DecimalUtil.doubleToDec(A4022BarNumBot), "ZZZZZ9"));
      forbiddenHiddens.add("BarFasFor", GXutil.rtrim( localUtil.format( A4287BarFasFor, "@!")));
      forbiddenHiddens.add("BarNPzas", localUtil.format( DecimalUtil.doubleToDec(A4288BarNPzas), "ZZZZZZZ9"));
      forbiddenHiddens.add("BarFasCoP", GXutil.rtrim( localUtil.format( A4301BarFasCoP, "@!")));
      forbiddenHiddens.add("BarFasCara", GXutil.rtrim( localUtil.format( A4637BarFasCara, "")));
      forbiddenHiddens.add("BarFasAcab", GXutil.rtrim( localUtil.format( A4905BarFasAcab, "@!")));
      forbiddenHiddens.add("BarFasCR", localUtil.format( A5999BarFasCR, "ZZZZ9.99999"));
      forbiddenHiddens.add("BarTieAut", localUtil.format( DecimalUtil.doubleToDec(A6430BarTieAut), "ZZZ9"));
      forbiddenHiddens.add("BarFasNPl", localUtil.format( DecimalUtil.doubleToDec(A6555BarFasNPl), "9"));
      forbiddenHiddens.add("BarFasPri", localUtil.format( DecimalUtil.doubleToDec(A3836BarFasPri), "Z9"));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("barfas:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z758ProCod", GXutil.rtrim( Z758ProCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z194BarOrdLin", GXutil.ltrim( localUtil.ntoc( Z194BarOrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z152BarFasCon", GXutil.rtrim( Z152BarFasCon));
      app.GxWebStd.gx_hidden_field( httpContext, "Z153BarFasEst", GXutil.ltrim( localUtil.ntoc( Z153BarFasEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z150BarFacTin", GXutil.rtrim( Z150BarFacTin));
      app.GxWebStd.gx_hidden_field( httpContext, "Z162BarFecTeo", localUtil.dtoc( Z162BarFecTeo, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z160BarFecRea", localUtil.dtoc( Z160BarFecRea, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z216BarTieTeo", GXutil.ltrim( localUtil.ntoc( Z216BarTieTeo, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z227BarUni", GXutil.ltrim( localUtil.ntoc( Z227BarUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z179BarLoc", GXutil.rtrim( Z179BarLoc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z165BarHorIni", GXutil.ltrim( localUtil.ntoc( Z165BarHorIni, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z164BarHorFin", GXutil.ltrim( localUtil.ntoc( Z164BarHorFin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z215BarTieRea", GXutil.ltrim( localUtil.ntoc( Z215BarTieRea, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3298BarFecRIni", localUtil.dtoc( Z3298BarFecRIni, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4021BarFasBot", GXutil.rtrim( Z4021BarFasBot));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4022BarNumBot", GXutil.ltrim( localUtil.ntoc( Z4022BarNumBot, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4287BarFasFor", GXutil.rtrim( Z4287BarFasFor));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4288BarNPzas", GXutil.ltrim( localUtil.ntoc( Z4288BarNPzas, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4301BarFasCoP", GXutil.rtrim( Z4301BarFasCoP));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4637BarFasCara", GXutil.rtrim( Z4637BarFasCara));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4905BarFasAcab", GXutil.rtrim( Z4905BarFasAcab));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5999BarFasCR", GXutil.ltrim( localUtil.ntoc( Z5999BarFasCR, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6430BarTieAut", GXutil.ltrim( localUtil.ntoc( Z6430BarTieAut, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6555BarFasNPl", GXutil.ltrim( localUtil.ntoc( Z6555BarFasNPl, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3836BarFasPri", GXutil.ltrim( localUtil.ntoc( Z3836BarFasPri, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z457FasCod", GXutil.rtrim( Z457FasCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z603MaqCodBis", GXutil.rtrim( Z603MaqCodBis));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "N457FasCod", GXutil.rtrim( A457FasCod));
      app.GxWebStd.gx_hidden_field( httpContext, "N603MaqCodBis", GXutil.rtrim( A603MaqCodBis));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV7EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCOD", GXutil.ltrim( localUtil.ntoc( AV8BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV8BarCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODREO", GXutil.ltrim( localUtil.ntoc( AV9BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODREO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV9BarCodReo), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODPAR", GXutil.rtrim( AV10BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODPAR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV10BarCodPar, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vPROCOD", GXutil.rtrim( AV11ProCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPROCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV11ProCod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARORDLIN", GXutil.ltrim( localUtil.ntoc( AV12BarOrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARORDLIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV12BarOrdLin), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_FASCOD", GXutil.rtrim( AV16Insert_FasCod));
      app.GxWebStd.gx_hidden_field( httpContext, "FASCOD", GXutil.rtrim( A457FasCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_MAQCODBIS", GXutil.rtrim( AV17Insert_MaqCodBis));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQCODBIS", GXutil.rtrim( A603MaqCodBis));
      app.GxWebStd.gx_hidden_field( httpContext, "BARFASCON", GXutil.rtrim( A152BarFasCon));
      app.GxWebStd.gx_hidden_field( httpContext, "BARFASEST", GXutil.ltrim( localUtil.ntoc( A153BarFasEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARFACTIN", GXutil.rtrim( A150BarFacTin));
      app.GxWebStd.gx_hidden_field( httpContext, "BARFECTEO", localUtil.dtoc( A162BarFecTeo, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "BARFECREA", localUtil.dtoc( A160BarFecRea, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "BARTIETEO", GXutil.ltrim( localUtil.ntoc( A216BarTieTeo, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARUNI", GXutil.ltrim( localUtil.ntoc( A227BarUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARLOC", GXutil.rtrim( A179BarLoc));
      app.GxWebStd.gx_hidden_field( httpContext, "BARHORINI", GXutil.ltrim( localUtil.ntoc( A165BarHorIni, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARHORFIN", GXutil.ltrim( localUtil.ntoc( A164BarHorFin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARTIEREA", GXutil.ltrim( localUtil.ntoc( A215BarTieRea, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARFECRINI", localUtil.dtoc( A3298BarFecRIni, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "BARFASBOT", GXutil.rtrim( A4021BarFasBot));
      app.GxWebStd.gx_hidden_field( httpContext, "BARNUMBOT", GXutil.ltrim( localUtil.ntoc( A4022BarNumBot, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARFASFOR", GXutil.rtrim( A4287BarFasFor));
      app.GxWebStd.gx_hidden_field( httpContext, "BARNPZAS", GXutil.ltrim( localUtil.ntoc( A4288BarNPzas, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARFASCOP", GXutil.rtrim( A4301BarFasCoP));
      app.GxWebStd.gx_hidden_field( httpContext, "BARFASCARA", GXutil.rtrim( A4637BarFasCara));
      app.GxWebStd.gx_hidden_field( httpContext, "BARFASACAB", GXutil.rtrim( A4905BarFasAcab));
      app.GxWebStd.gx_hidden_field( httpContext, "BARFASCR", GXutil.ltrim( localUtil.ntoc( A5999BarFasCR, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARTIEAUT", GXutil.ltrim( localUtil.ntoc( A6430BarTieAut, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARFASNPL", GXutil.ltrim( localUtil.ntoc( A6555BarFasNPl, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARFASPRI", GXutil.ltrim( localUtil.ntoc( A3836BarFasPri, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASCON", GXutil.rtrim( A458FasCon));
      app.GxWebStd.gx_hidden_field( httpContext, "FASDEC", GXutil.ltrim( localUtil.ntoc( A459FasDec, (byte)(5), (byte)(1), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQCOD", GXutil.rtrim( A602MaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "FASACTTIN", GXutil.rtrim( A456FasActTin));
      app.GxWebStd.gx_hidden_field( httpContext, "FASACAB", GXutil.rtrim( A4903FasAcab));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV22Pgmname));
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
      return formatLink("app.barfas", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV7EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV8BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV9BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV10BarCodPar)),GXutil.URLEncode(GXutil.rtrim(AV11ProCod)),GXutil.URLEncode(GXutil.ltrimstr(AV12BarOrdLin,4,0))}, new String[] {"Gx_mode","EmprCod","BarCod","BarCodReo","BarCodPar","ProCod","BarOrdLin"})  ;
   }

   public String getPgmname( )
   {
      return "BARFAS" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Tabla BARFAS", "") ;
   }

   public void initializeNonKey1PU15( )
   {
      A457FasCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
      A603MaqCodBis = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A603MaqCodBis", A603MaqCodBis);
      A458FasCon = "" ;
      n458FasCon = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A458FasCon", A458FasCon);
      A152BarFasCon = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A152BarFasCon", A152BarFasCon);
      A153BarFasEst = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A153BarFasEst", GXutil.str( A153BarFasEst, 1, 0));
      A459FasDec = DecimalUtil.ZERO ;
      n459FasDec = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A459FasDec", GXutil.ltrimstr( A459FasDec, 5, 1));
      A602MaqCod = "" ;
      n602MaqCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
      A456FasActTin = "" ;
      n456FasActTin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A456FasActTin", A456FasActTin);
      A150BarFacTin = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A150BarFacTin", A150BarFacTin);
      A162BarFecTeo = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A162BarFecTeo", localUtil.format(A162BarFecTeo, "99/99/99"));
      A160BarFecRea = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A160BarFecRea", localUtil.format(A160BarFecRea, "99/99/99"));
      A216BarTieTeo = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A216BarTieTeo", GXutil.ltrimstr( A216BarTieTeo, 5, 2));
      A227BarUni = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A227BarUni", GXutil.ltrimstr( A227BarUni, 9, 2));
      A179BarLoc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A179BarLoc", A179BarLoc);
      A165BarHorIni = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A165BarHorIni", GXutil.ltrimstr( DecimalUtil.doubleToDec(A165BarHorIni), 4, 0));
      A164BarHorFin = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A164BarHorFin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A164BarHorFin), 4, 0));
      A215BarTieRea = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A215BarTieRea", GXutil.ltrimstr( A215BarTieRea, 5, 2));
      A3298BarFecRIni = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A3298BarFecRIni", localUtil.format(A3298BarFecRIni, "99/99/99"));
      A4021BarFasBot = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4021BarFasBot", A4021BarFasBot);
      A4022BarNumBot = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A4022BarNumBot", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4022BarNumBot), 6, 0));
      A4287BarFasFor = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4287BarFasFor", A4287BarFasFor);
      A4288BarNPzas = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A4288BarNPzas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4288BarNPzas), 8, 0));
      A4301BarFasCoP = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4301BarFasCoP", A4301BarFasCoP);
      A4637BarFasCara = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4637BarFasCara", A4637BarFasCara);
      A4905BarFasAcab = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4905BarFasAcab", A4905BarFasAcab);
      A4903FasAcab = "" ;
      n4903FasAcab = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4903FasAcab", A4903FasAcab);
      A5999BarFasCR = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A5999BarFasCR", GXutil.ltrimstr( A5999BarFasCR, 11, 5));
      A6430BarTieAut = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A6430BarTieAut", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6430BarTieAut), 4, 0));
      A6555BarFasNPl = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A6555BarFasNPl", GXutil.str( A6555BarFasNPl, 1, 0));
      A3836BarFasPri = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A3836BarFasPri", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3836BarFasPri), 2, 0));
      Z152BarFasCon = "" ;
      Z153BarFasEst = (byte)(0) ;
      Z150BarFacTin = "" ;
      Z162BarFecTeo = GXutil.nullDate() ;
      Z160BarFecRea = GXutil.nullDate() ;
      Z216BarTieTeo = DecimalUtil.ZERO ;
      Z227BarUni = DecimalUtil.ZERO ;
      Z179BarLoc = "" ;
      Z165BarHorIni = (short)(0) ;
      Z164BarHorFin = (short)(0) ;
      Z215BarTieRea = DecimalUtil.ZERO ;
      Z3298BarFecRIni = GXutil.nullDate() ;
      Z4021BarFasBot = "" ;
      Z4022BarNumBot = 0 ;
      Z4287BarFasFor = "" ;
      Z4288BarNPzas = 0 ;
      Z4301BarFasCoP = "" ;
      Z4637BarFasCara = "" ;
      Z4905BarFasAcab = "" ;
      Z5999BarFasCR = DecimalUtil.ZERO ;
      Z6430BarTieAut = (short)(0) ;
      Z6555BarFasNPl = (byte)(0) ;
      Z3836BarFasPri = (byte)(0) ;
      Z457FasCod = "" ;
      Z603MaqCodBis = "" ;
   }

   public void initAll1PU15( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A129BarCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
      A132BarCodReo = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
      A130BarCodPar = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      A758ProCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
      A194BarOrdLin = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A194BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A194BarOrdLin), 4, 0));
      initializeNonKey1PU15( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211682839", true, true);
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
      httpContext.AddJavascriptSource("barfas.js", "?20268211682839", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      edtEmprCod_Internalname = "EMPRCOD" ;
      edtBarCod_Internalname = "BARCOD" ;
      edtBarCodReo_Internalname = "BARCODREO" ;
      edtBarCodPar_Internalname = "BARCODPAR" ;
      edtProCod_Internalname = "PROCOD" ;
      edtBarOrdLin_Internalname = "BARORDLIN" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      bttBtntrn_delete_Internalname = "BTNTRN_DELETE" ;
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
      Form.setCaption( httpContext.getMessage( "Tabla BARFAS", "") );
      bttBtntrn_delete_Enabled = 0 ;
      bttBtntrn_delete_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      edtBarOrdLin_Jsonclick = "" ;
      edtBarOrdLin_Enabled = 1 ;
      edtProCod_Jsonclick = "" ;
      edtProCod_Enabled = 1 ;
      edtBarCodPar_Jsonclick = "" ;
      edtBarCodPar_Enabled = 1 ;
      edtBarCodReo_Jsonclick = "" ;
      edtBarCodReo_Enabled = 1 ;
      edtBarCod_Jsonclick = "" ;
      edtBarCod_Enabled = 1 ;
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

   public void valid_Procod( )
   {
      /* Using cursor T01PU40 */
      pr_default.execute(38, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod});
      if ( (pr_default.getStatus(38) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "BARPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      pr_default.close(38);
      dynload_actions( ) ;
      /*  Sending validation outputs */
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV8BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV9BarCodReo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV10BarCodPar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'AV11ProCod',fld:'vPROCOD',pic:'',hsh:true},{av:'AV12BarOrdLin',fld:'vBARORDLIN',pic:'ZZZ9',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV8BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV9BarCodReo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV10BarCodPar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'AV11ProCod',fld:'vPROCOD',pic:'',hsh:true},{av:'AV12BarOrdLin',fld:'vBARORDLIN',pic:'ZZZ9',hsh:true},{av:'A152BarFasCon',fld:'BARFASCON',pic:'@!'},{av:'A153BarFasEst',fld:'BARFASEST',pic:'9'},{av:'A150BarFacTin',fld:'BARFACTIN',pic:'@!'},{av:'A162BarFecTeo',fld:'BARFECTEO',pic:''},{av:'A160BarFecRea',fld:'BARFECREA',pic:''},{av:'A216BarTieTeo',fld:'BARTIETEO',pic:'Z9.99'},{av:'A227BarUni',fld:'BARUNI',pic:'ZZZZZ9.99'},{av:'A179BarLoc',fld:'BARLOC',pic:''},{av:'A165BarHorIni',fld:'BARHORINI',pic:'ZZZ9'},{av:'A164BarHorFin',fld:'BARHORFIN',pic:'ZZZ9'},{av:'A215BarTieRea',fld:'BARTIEREA',pic:'Z9.99'},{av:'A3298BarFecRIni',fld:'BARFECRINI',pic:''},{av:'A4021BarFasBot',fld:'BARFASBOT',pic:''},{av:'A4022BarNumBot',fld:'BARNUMBOT',pic:'ZZZZZ9'},{av:'A4287BarFasFor',fld:'BARFASFOR',pic:'@!'},{av:'A4288BarNPzas',fld:'BARNPZAS',pic:'ZZZZZZZ9'},{av:'A4301BarFasCoP',fld:'BARFASCOP',pic:'@!'},{av:'A4637BarFasCara',fld:'BARFASCARA',pic:''},{av:'A4905BarFasAcab',fld:'BARFASACAB',pic:'@!'},{av:'A5999BarFasCR',fld:'BARFASCR',pic:'ZZZZ9.99999'},{av:'A6430BarTieAut',fld:'BARTIEAUT',pic:'ZZZ9'},{av:'A6555BarFasNPl',fld:'BARFASNPL',pic:'9'},{av:'A3836BarFasPri',fld:'BARFASPRI',pic:'Z9'}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e121PU2',iparms:[]");
      setEventMetadata("AFTER TRN",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCOD","{handler:'valid_Barcod',iparms:[]");
      setEventMetadata("VALID_BARCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCODREO","{handler:'valid_Barcodreo',iparms:[]");
      setEventMetadata("VALID_BARCODREO",",oparms:[]}");
      setEventMetadata("VALID_BARCODPAR","{handler:'valid_Barcodpar',iparms:[]");
      setEventMetadata("VALID_BARCODPAR",",oparms:[]}");
      setEventMetadata("VALID_PROCOD","{handler:'valid_Procod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A758ProCod',fld:'PROCOD',pic:''}]");
      setEventMetadata("VALID_PROCOD",",oparms:[]}");
      setEventMetadata("VALID_BARORDLIN","{handler:'valid_Barordlin',iparms:[]");
      setEventMetadata("VALID_BARORDLIN",",oparms:[]}");
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
      pr_default.close(38);
      pr_default.close(15);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      wcpOAV7EmprCod = "" ;
      wcpOAV10BarCodPar = "" ;
      wcpOAV11ProCod = "" ;
      Z396EmprCod = "" ;
      Z130BarCodPar = "" ;
      Z758ProCod = "" ;
      Z152BarFasCon = "" ;
      Z150BarFacTin = "" ;
      Z162BarFecTeo = GXutil.nullDate() ;
      Z160BarFecRea = GXutil.nullDate() ;
      Z216BarTieTeo = DecimalUtil.ZERO ;
      Z227BarUni = DecimalUtil.ZERO ;
      Z179BarLoc = "" ;
      Z215BarTieRea = DecimalUtil.ZERO ;
      Z3298BarFecRIni = GXutil.nullDate() ;
      Z4021BarFasBot = "" ;
      Z4287BarFasFor = "" ;
      Z4301BarFasCoP = "" ;
      Z4637BarFasCara = "" ;
      Z4905BarFasAcab = "" ;
      Z5999BarFasCR = DecimalUtil.ZERO ;
      Z457FasCod = "" ;
      Z603MaqCodBis = "" ;
      N457FasCod = "" ;
      N603MaqCodBis = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A457FasCod = "" ;
      A603MaqCodBis = "" ;
      A130BarCodPar = "" ;
      A758ProCod = "" ;
      Gx_mode = "" ;
      AV7EmprCod = "" ;
      AV10BarCodPar = "" ;
      AV11ProCod = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      A152BarFasCon = "" ;
      A150BarFacTin = "" ;
      A162BarFecTeo = GXutil.nullDate() ;
      A160BarFecRea = GXutil.nullDate() ;
      A216BarTieTeo = DecimalUtil.ZERO ;
      A227BarUni = DecimalUtil.ZERO ;
      A179BarLoc = "" ;
      A215BarTieRea = DecimalUtil.ZERO ;
      A3298BarFecRIni = GXutil.nullDate() ;
      A4021BarFasBot = "" ;
      A4287BarFasFor = "" ;
      A4301BarFasCoP = "" ;
      A4637BarFasCara = "" ;
      A4905BarFasAcab = "" ;
      A5999BarFasCR = DecimalUtil.ZERO ;
      AV16Insert_FasCod = "" ;
      AV17Insert_MaqCodBis = "" ;
      A458FasCon = "" ;
      A459FasDec = DecimalUtil.ZERO ;
      A602MaqCod = "" ;
      A456FasActTin = "" ;
      A4903FasAcab = "" ;
      AV22Pgmname = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode15 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      AV19Station = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV20Emprnom = "" ;
      GXv_char3 = new String[1] ;
      AV21Usurcod = "" ;
      GXv_char4 = new String[1] ;
      AV13WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext5 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV14TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV15WebSession = httpContext.getWebSession();
      AV18TrnContextAtt = new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      Z458FasCon = "" ;
      Z459FasDec = DecimalUtil.ZERO ;
      Z602MaqCod = "" ;
      Z456FasActTin = "" ;
      Z4903FasAcab = "" ;
      T01PU5_A458FasCon = new String[] {""} ;
      T01PU5_n458FasCon = new boolean[] {false} ;
      T01PU5_A459FasDec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PU5_n459FasDec = new boolean[] {false} ;
      T01PU5_A602MaqCod = new String[] {""} ;
      T01PU5_n602MaqCod = new boolean[] {false} ;
      T01PU5_A456FasActTin = new String[] {""} ;
      T01PU5_n456FasActTin = new boolean[] {false} ;
      T01PU5_A4903FasAcab = new String[] {""} ;
      T01PU5_n4903FasAcab = new boolean[] {false} ;
      T01PU7_A194BarOrdLin = new short[1] ;
      T01PU7_A458FasCon = new String[] {""} ;
      T01PU7_n458FasCon = new boolean[] {false} ;
      T01PU7_A152BarFasCon = new String[] {""} ;
      T01PU7_A153BarFasEst = new byte[1] ;
      T01PU7_A459FasDec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PU7_n459FasDec = new boolean[] {false} ;
      T01PU7_A602MaqCod = new String[] {""} ;
      T01PU7_n602MaqCod = new boolean[] {false} ;
      T01PU7_A456FasActTin = new String[] {""} ;
      T01PU7_n456FasActTin = new boolean[] {false} ;
      T01PU7_A150BarFacTin = new String[] {""} ;
      T01PU7_A162BarFecTeo = new java.util.Date[] {GXutil.nullDate()} ;
      T01PU7_A160BarFecRea = new java.util.Date[] {GXutil.nullDate()} ;
      T01PU7_A216BarTieTeo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PU7_A227BarUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PU7_A179BarLoc = new String[] {""} ;
      T01PU7_A165BarHorIni = new short[1] ;
      T01PU7_A164BarHorFin = new short[1] ;
      T01PU7_A215BarTieRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PU7_A3298BarFecRIni = new java.util.Date[] {GXutil.nullDate()} ;
      T01PU7_A4021BarFasBot = new String[] {""} ;
      T01PU7_A4022BarNumBot = new int[1] ;
      T01PU7_A4287BarFasFor = new String[] {""} ;
      T01PU7_A4288BarNPzas = new int[1] ;
      T01PU7_A4301BarFasCoP = new String[] {""} ;
      T01PU7_A4637BarFasCara = new String[] {""} ;
      T01PU7_A4905BarFasAcab = new String[] {""} ;
      T01PU7_A4903FasAcab = new String[] {""} ;
      T01PU7_n4903FasAcab = new boolean[] {false} ;
      T01PU7_A5999BarFasCR = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PU7_A6430BarTieAut = new short[1] ;
      T01PU7_A6555BarFasNPl = new byte[1] ;
      T01PU7_A3836BarFasPri = new byte[1] ;
      T01PU7_A396EmprCod = new String[] {""} ;
      T01PU7_A129BarCod = new int[1] ;
      T01PU7_A132BarCodReo = new byte[1] ;
      T01PU7_A130BarCodPar = new String[] {""} ;
      T01PU7_A758ProCod = new String[] {""} ;
      T01PU7_A457FasCod = new String[] {""} ;
      T01PU7_A603MaqCodBis = new String[] {""} ;
      T01PU6_A396EmprCod = new String[] {""} ;
      T01PU4_A396EmprCod = new String[] {""} ;
      T01PU8_A458FasCon = new String[] {""} ;
      T01PU8_n458FasCon = new boolean[] {false} ;
      T01PU8_A459FasDec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PU8_n459FasDec = new boolean[] {false} ;
      T01PU8_A602MaqCod = new String[] {""} ;
      T01PU8_n602MaqCod = new boolean[] {false} ;
      T01PU8_A456FasActTin = new String[] {""} ;
      T01PU8_n456FasActTin = new boolean[] {false} ;
      T01PU8_A4903FasAcab = new String[] {""} ;
      T01PU8_n4903FasAcab = new boolean[] {false} ;
      T01PU9_A396EmprCod = new String[] {""} ;
      T01PU10_A396EmprCod = new String[] {""} ;
      T01PU11_A396EmprCod = new String[] {""} ;
      T01PU11_A129BarCod = new int[1] ;
      T01PU11_A132BarCodReo = new byte[1] ;
      T01PU11_A130BarCodPar = new String[] {""} ;
      T01PU11_A758ProCod = new String[] {""} ;
      T01PU11_A194BarOrdLin = new short[1] ;
      T01PU3_A194BarOrdLin = new short[1] ;
      T01PU3_A152BarFasCon = new String[] {""} ;
      T01PU3_A153BarFasEst = new byte[1] ;
      T01PU3_A150BarFacTin = new String[] {""} ;
      T01PU3_A162BarFecTeo = new java.util.Date[] {GXutil.nullDate()} ;
      T01PU3_A160BarFecRea = new java.util.Date[] {GXutil.nullDate()} ;
      T01PU3_A216BarTieTeo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PU3_A227BarUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PU3_A179BarLoc = new String[] {""} ;
      T01PU3_A165BarHorIni = new short[1] ;
      T01PU3_A164BarHorFin = new short[1] ;
      T01PU3_A215BarTieRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PU3_A3298BarFecRIni = new java.util.Date[] {GXutil.nullDate()} ;
      T01PU3_A4021BarFasBot = new String[] {""} ;
      T01PU3_A4022BarNumBot = new int[1] ;
      T01PU3_A4287BarFasFor = new String[] {""} ;
      T01PU3_A4288BarNPzas = new int[1] ;
      T01PU3_A4301BarFasCoP = new String[] {""} ;
      T01PU3_A4637BarFasCara = new String[] {""} ;
      T01PU3_A4905BarFasAcab = new String[] {""} ;
      T01PU3_A5999BarFasCR = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PU3_A6430BarTieAut = new short[1] ;
      T01PU3_A6555BarFasNPl = new byte[1] ;
      T01PU3_A3836BarFasPri = new byte[1] ;
      T01PU3_A396EmprCod = new String[] {""} ;
      T01PU3_A129BarCod = new int[1] ;
      T01PU3_A132BarCodReo = new byte[1] ;
      T01PU3_A130BarCodPar = new String[] {""} ;
      T01PU3_A758ProCod = new String[] {""} ;
      T01PU3_A457FasCod = new String[] {""} ;
      T01PU3_A603MaqCodBis = new String[] {""} ;
      T01PU12_A396EmprCod = new String[] {""} ;
      T01PU12_A129BarCod = new int[1] ;
      T01PU12_A132BarCodReo = new byte[1] ;
      T01PU12_A130BarCodPar = new String[] {""} ;
      T01PU12_A758ProCod = new String[] {""} ;
      T01PU12_A194BarOrdLin = new short[1] ;
      T01PU13_A396EmprCod = new String[] {""} ;
      T01PU13_A129BarCod = new int[1] ;
      T01PU13_A132BarCodReo = new byte[1] ;
      T01PU13_A130BarCodPar = new String[] {""} ;
      T01PU13_A758ProCod = new String[] {""} ;
      T01PU13_A194BarOrdLin = new short[1] ;
      T01PU2_A194BarOrdLin = new short[1] ;
      T01PU2_A152BarFasCon = new String[] {""} ;
      T01PU2_A153BarFasEst = new byte[1] ;
      T01PU2_A150BarFacTin = new String[] {""} ;
      T01PU2_A162BarFecTeo = new java.util.Date[] {GXutil.nullDate()} ;
      T01PU2_A160BarFecRea = new java.util.Date[] {GXutil.nullDate()} ;
      T01PU2_A216BarTieTeo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PU2_A227BarUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PU2_A179BarLoc = new String[] {""} ;
      T01PU2_A165BarHorIni = new short[1] ;
      T01PU2_A164BarHorFin = new short[1] ;
      T01PU2_A215BarTieRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PU2_A3298BarFecRIni = new java.util.Date[] {GXutil.nullDate()} ;
      T01PU2_A4021BarFasBot = new String[] {""} ;
      T01PU2_A4022BarNumBot = new int[1] ;
      T01PU2_A4287BarFasFor = new String[] {""} ;
      T01PU2_A4288BarNPzas = new int[1] ;
      T01PU2_A4301BarFasCoP = new String[] {""} ;
      T01PU2_A4637BarFasCara = new String[] {""} ;
      T01PU2_A4905BarFasAcab = new String[] {""} ;
      T01PU2_A5999BarFasCR = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PU2_A6430BarTieAut = new short[1] ;
      T01PU2_A6555BarFasNPl = new byte[1] ;
      T01PU2_A3836BarFasPri = new byte[1] ;
      T01PU2_A396EmprCod = new String[] {""} ;
      T01PU2_A129BarCod = new int[1] ;
      T01PU2_A132BarCodReo = new byte[1] ;
      T01PU2_A130BarCodPar = new String[] {""} ;
      T01PU2_A758ProCod = new String[] {""} ;
      T01PU2_A457FasCod = new String[] {""} ;
      T01PU2_A603MaqCodBis = new String[] {""} ;
      T01PU17_A458FasCon = new String[] {""} ;
      T01PU17_n458FasCon = new boolean[] {false} ;
      T01PU17_A459FasDec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PU17_n459FasDec = new boolean[] {false} ;
      T01PU17_A602MaqCod = new String[] {""} ;
      T01PU17_n602MaqCod = new boolean[] {false} ;
      T01PU17_A456FasActTin = new String[] {""} ;
      T01PU17_n456FasActTin = new boolean[] {false} ;
      T01PU17_A4903FasAcab = new String[] {""} ;
      T01PU17_n4903FasAcab = new boolean[] {false} ;
      T01PU18_A396EmprCod = new String[] {""} ;
      T01PU18_A129BarCod = new int[1] ;
      T01PU18_A132BarCodReo = new byte[1] ;
      T01PU18_A130BarCodPar = new String[] {""} ;
      T01PU18_A758ProCod = new String[] {""} ;
      T01PU18_A194BarOrdLin = new short[1] ;
      T01PU18_A12517SolAfLn = new short[1] ;
      T01PU19_A396EmprCod = new String[] {""} ;
      T01PU19_A129BarCod = new int[1] ;
      T01PU19_A132BarCodReo = new byte[1] ;
      T01PU19_A130BarCodPar = new String[] {""} ;
      T01PU19_A758ProCod = new String[] {""} ;
      T01PU19_A194BarOrdLin = new short[1] ;
      T01PU19_A12516SolLzLn = new short[1] ;
      T01PU20_A396EmprCod = new String[] {""} ;
      T01PU20_A129BarCod = new int[1] ;
      T01PU20_A132BarCodReo = new byte[1] ;
      T01PU20_A130BarCodPar = new String[] {""} ;
      T01PU20_A758ProCod = new String[] {""} ;
      T01PU20_A194BarOrdLin = new short[1] ;
      T01PU20_A12515SolPlLn = new short[1] ;
      T01PU21_A396EmprCod = new String[] {""} ;
      T01PU21_A129BarCod = new int[1] ;
      T01PU21_A132BarCodReo = new byte[1] ;
      T01PU21_A130BarCodPar = new String[] {""} ;
      T01PU21_A758ProCod = new String[] {""} ;
      T01PU21_A194BarOrdLin = new short[1] ;
      T01PU21_A12514SolSAlLn = new short[1] ;
      T01PU22_A396EmprCod = new String[] {""} ;
      T01PU22_A129BarCod = new int[1] ;
      T01PU22_A132BarCodReo = new byte[1] ;
      T01PU22_A130BarCodPar = new String[] {""} ;
      T01PU22_A758ProCod = new String[] {""} ;
      T01PU22_A194BarOrdLin = new short[1] ;
      T01PU22_A12513SolSAcLn = new short[1] ;
      T01PU23_A396EmprCod = new String[] {""} ;
      T01PU23_A129BarCod = new int[1] ;
      T01PU23_A132BarCodReo = new byte[1] ;
      T01PU23_A130BarCodPar = new String[] {""} ;
      T01PU23_A758ProCod = new String[] {""} ;
      T01PU23_A194BarOrdLin = new short[1] ;
      T01PU23_A12512SolFrLn = new short[1] ;
      T01PU24_A396EmprCod = new String[] {""} ;
      T01PU24_A129BarCod = new int[1] ;
      T01PU24_A132BarCodReo = new byte[1] ;
      T01PU24_A130BarCodPar = new String[] {""} ;
      T01PU24_A758ProCod = new String[] {""} ;
      T01PU24_A194BarOrdLin = new short[1] ;
      T01PU24_A12511SolAgLn = new short[1] ;
      T01PU25_A396EmprCod = new String[] {""} ;
      T01PU25_A129BarCod = new int[1] ;
      T01PU25_A132BarCodReo = new byte[1] ;
      T01PU25_A130BarCodPar = new String[] {""} ;
      T01PU25_A758ProCod = new String[] {""} ;
      T01PU25_A194BarOrdLin = new short[1] ;
      T01PU25_A12510SolLvLn = new short[1] ;
      T01PU26_A396EmprCod = new String[] {""} ;
      T01PU26_A129BarCod = new int[1] ;
      T01PU26_A132BarCodReo = new byte[1] ;
      T01PU26_A130BarCodPar = new String[] {""} ;
      T01PU26_A758ProCod = new String[] {""} ;
      T01PU26_A194BarOrdLin = new short[1] ;
      T01PU26_A10781BarFasNb = new int[1] ;
      T01PU27_A396EmprCod = new String[] {""} ;
      T01PU27_A129BarCod = new int[1] ;
      T01PU27_A132BarCodReo = new byte[1] ;
      T01PU27_A130BarCodPar = new String[] {""} ;
      T01PU27_A758ProCod = new String[] {""} ;
      T01PU27_A194BarOrdLin = new short[1] ;
      T01PU27_A719PrdNum = new String[] {""} ;
      T01PU28_A396EmprCod = new String[] {""} ;
      T01PU28_A129BarCod = new int[1] ;
      T01PU28_A132BarCodReo = new byte[1] ;
      T01PU28_A130BarCodPar = new String[] {""} ;
      T01PU28_A758ProCod = new String[] {""} ;
      T01PU28_A194BarOrdLin = new short[1] ;
      T01PU28_A9966Em_cod = new String[] {""} ;
      T01PU29_A396EmprCod = new String[] {""} ;
      T01PU29_A129BarCod = new int[1] ;
      T01PU29_A132BarCodReo = new byte[1] ;
      T01PU29_A130BarCodPar = new String[] {""} ;
      T01PU29_A758ProCod = new String[] {""} ;
      T01PU29_A194BarOrdLin = new short[1] ;
      T01PU29_A9940Ab_cod = new String[] {""} ;
      T01PU30_A396EmprCod = new String[] {""} ;
      T01PU30_A129BarCod = new int[1] ;
      T01PU30_A132BarCodReo = new byte[1] ;
      T01PU30_A130BarCodPar = new String[] {""} ;
      T01PU30_A758ProCod = new String[] {""} ;
      T01PU30_A194BarOrdLin = new short[1] ;
      T01PU30_A9911Ca_cod = new String[] {""} ;
      T01PU31_A396EmprCod = new String[] {""} ;
      T01PU31_A129BarCod = new int[1] ;
      T01PU31_A132BarCodReo = new byte[1] ;
      T01PU31_A130BarCodPar = new String[] {""} ;
      T01PU31_A758ProCod = new String[] {""} ;
      T01PU31_A194BarOrdLin = new short[1] ;
      T01PU31_A9878Pe_cod = new String[] {""} ;
      T01PU32_A396EmprCod = new String[] {""} ;
      T01PU32_A129BarCod = new int[1] ;
      T01PU32_A132BarCodReo = new byte[1] ;
      T01PU32_A130BarCodPar = new String[] {""} ;
      T01PU32_A758ProCod = new String[] {""} ;
      T01PU32_A194BarOrdLin = new short[1] ;
      T01PU32_A9870Rm_cod = new String[] {""} ;
      T01PU33_A396EmprCod = new String[] {""} ;
      T01PU33_A129BarCod = new int[1] ;
      T01PU33_A132BarCodReo = new byte[1] ;
      T01PU33_A130BarCodPar = new String[] {""} ;
      T01PU33_A758ProCod = new String[] {""} ;
      T01PU33_A194BarOrdLin = new short[1] ;
      T01PU33_A7934Dtb_Ordl = new short[1] ;
      T01PU34_A396EmprCod = new String[] {""} ;
      T01PU34_A129BarCod = new int[1] ;
      T01PU34_A132BarCodReo = new byte[1] ;
      T01PU34_A130BarCodPar = new String[] {""} ;
      T01PU34_A758ProCod = new String[] {""} ;
      T01PU34_A194BarOrdLin = new short[1] ;
      T01PU34_A5371FasQuiLin = new short[1] ;
      T01PU35_A396EmprCod = new String[] {""} ;
      T01PU35_A129BarCod = new int[1] ;
      T01PU35_A132BarCodReo = new byte[1] ;
      T01PU35_A130BarCodPar = new String[] {""} ;
      T01PU35_A758ProCod = new String[] {""} ;
      T01PU35_A194BarOrdLin = new short[1] ;
      T01PU35_A4940A_Barcod = new int[1] ;
      T01PU35_A4941A_BarReo = new byte[1] ;
      T01PU35_A4942A_BarPar = new String[] {""} ;
      T01PU35_A4943A_ProCod = new String[] {""} ;
      T01PU35_A4944A_BarOrd = new short[1] ;
      T01PU36_A396EmprCod = new String[] {""} ;
      T01PU36_A129BarCod = new int[1] ;
      T01PU36_A132BarCodReo = new byte[1] ;
      T01PU36_A130BarCodPar = new String[] {""} ;
      T01PU36_A758ProCod = new String[] {""} ;
      T01PU36_A194BarOrdLin = new short[1] ;
      T01PU36_A4643BarFasLot = new int[1] ;
      T01PU37_A396EmprCod = new String[] {""} ;
      T01PU37_A129BarCod = new int[1] ;
      T01PU37_A132BarCodReo = new byte[1] ;
      T01PU37_A130BarCodPar = new String[] {""} ;
      T01PU37_A758ProCod = new String[] {""} ;
      T01PU37_A194BarOrdLin = new short[1] ;
      T01PU37_A4031CCTCod = new int[1] ;
      T01PU38_A396EmprCod = new String[] {""} ;
      T01PU38_A129BarCod = new int[1] ;
      T01PU38_A132BarCodReo = new byte[1] ;
      T01PU38_A130BarCodPar = new String[] {""} ;
      T01PU38_A758ProCod = new String[] {""} ;
      T01PU38_A194BarOrdLin = new short[1] ;
      T01PU38_A1664ParFasCod = new short[1] ;
      T01PU39_A396EmprCod = new String[] {""} ;
      T01PU39_A129BarCod = new int[1] ;
      T01PU39_A132BarCodReo = new byte[1] ;
      T01PU39_A130BarCodPar = new String[] {""} ;
      T01PU39_A758ProCod = new String[] {""} ;
      T01PU39_A194BarOrdLin = new short[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      T01PU40_A396EmprCod = new String[] {""} ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.barfas__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.barfas__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.barfas__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.barfas__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.barfas__default(),
         new Object[] {
             new Object[] {
            T01PU2_A194BarOrdLin, T01PU2_A152BarFasCon, T01PU2_A153BarFasEst, T01PU2_A150BarFacTin, T01PU2_A162BarFecTeo, T01PU2_A160BarFecRea, T01PU2_A216BarTieTeo, T01PU2_A227BarUni, T01PU2_A179BarLoc, T01PU2_A165BarHorIni,
            T01PU2_A164BarHorFin, T01PU2_A215BarTieRea, T01PU2_A3298BarFecRIni, T01PU2_A4021BarFasBot, T01PU2_A4022BarNumBot, T01PU2_A4287BarFasFor, T01PU2_A4288BarNPzas, T01PU2_A4301BarFasCoP, T01PU2_A4637BarFasCara, T01PU2_A4905BarFasAcab,
            T01PU2_A5999BarFasCR, T01PU2_A6430BarTieAut, T01PU2_A6555BarFasNPl, T01PU2_A3836BarFasPri, T01PU2_A396EmprCod, T01PU2_A129BarCod, T01PU2_A132BarCodReo, T01PU2_A130BarCodPar, T01PU2_A758ProCod, T01PU2_A457FasCod,
            T01PU2_A603MaqCodBis
            }
            , new Object[] {
            T01PU3_A194BarOrdLin, T01PU3_A152BarFasCon, T01PU3_A153BarFasEst, T01PU3_A150BarFacTin, T01PU3_A162BarFecTeo, T01PU3_A160BarFecRea, T01PU3_A216BarTieTeo, T01PU3_A227BarUni, T01PU3_A179BarLoc, T01PU3_A165BarHorIni,
            T01PU3_A164BarHorFin, T01PU3_A215BarTieRea, T01PU3_A3298BarFecRIni, T01PU3_A4021BarFasBot, T01PU3_A4022BarNumBot, T01PU3_A4287BarFasFor, T01PU3_A4288BarNPzas, T01PU3_A4301BarFasCoP, T01PU3_A4637BarFasCara, T01PU3_A4905BarFasAcab,
            T01PU3_A5999BarFasCR, T01PU3_A6430BarTieAut, T01PU3_A6555BarFasNPl, T01PU3_A3836BarFasPri, T01PU3_A396EmprCod, T01PU3_A129BarCod, T01PU3_A132BarCodReo, T01PU3_A130BarCodPar, T01PU3_A758ProCod, T01PU3_A457FasCod,
            T01PU3_A603MaqCodBis
            }
            , new Object[] {
            T01PU4_A396EmprCod
            }
            , new Object[] {
            T01PU5_A458FasCon, T01PU5_n458FasCon, T01PU5_A459FasDec, T01PU5_n459FasDec, T01PU5_A602MaqCod, T01PU5_n602MaqCod, T01PU5_A456FasActTin, T01PU5_n456FasActTin, T01PU5_A4903FasAcab, T01PU5_n4903FasAcab
            }
            , new Object[] {
            T01PU6_A396EmprCod
            }
            , new Object[] {
            T01PU7_A194BarOrdLin, T01PU7_A458FasCon, T01PU7_n458FasCon, T01PU7_A152BarFasCon, T01PU7_A153BarFasEst, T01PU7_A459FasDec, T01PU7_n459FasDec, T01PU7_A602MaqCod, T01PU7_n602MaqCod, T01PU7_A456FasActTin,
            T01PU7_n456FasActTin, T01PU7_A150BarFacTin, T01PU7_A162BarFecTeo, T01PU7_A160BarFecRea, T01PU7_A216BarTieTeo, T01PU7_A227BarUni, T01PU7_A179BarLoc, T01PU7_A165BarHorIni, T01PU7_A164BarHorFin, T01PU7_A215BarTieRea,
            T01PU7_A3298BarFecRIni, T01PU7_A4021BarFasBot, T01PU7_A4022BarNumBot, T01PU7_A4287BarFasFor, T01PU7_A4288BarNPzas, T01PU7_A4301BarFasCoP, T01PU7_A4637BarFasCara, T01PU7_A4905BarFasAcab, T01PU7_A4903FasAcab, T01PU7_n4903FasAcab,
            T01PU7_A5999BarFasCR, T01PU7_A6430BarTieAut, T01PU7_A6555BarFasNPl, T01PU7_A3836BarFasPri, T01PU7_A396EmprCod, T01PU7_A129BarCod, T01PU7_A132BarCodReo, T01PU7_A130BarCodPar, T01PU7_A758ProCod, T01PU7_A457FasCod,
            T01PU7_A603MaqCodBis
            }
            , new Object[] {
            T01PU8_A458FasCon, T01PU8_n458FasCon, T01PU8_A459FasDec, T01PU8_n459FasDec, T01PU8_A602MaqCod, T01PU8_n602MaqCod, T01PU8_A456FasActTin, T01PU8_n456FasActTin, T01PU8_A4903FasAcab, T01PU8_n4903FasAcab
            }
            , new Object[] {
            T01PU9_A396EmprCod
            }
            , new Object[] {
            T01PU10_A396EmprCod
            }
            , new Object[] {
            T01PU11_A396EmprCod, T01PU11_A129BarCod, T01PU11_A132BarCodReo, T01PU11_A130BarCodPar, T01PU11_A758ProCod, T01PU11_A194BarOrdLin
            }
            , new Object[] {
            T01PU12_A396EmprCod, T01PU12_A129BarCod, T01PU12_A132BarCodReo, T01PU12_A130BarCodPar, T01PU12_A758ProCod, T01PU12_A194BarOrdLin
            }
            , new Object[] {
            T01PU13_A396EmprCod, T01PU13_A129BarCod, T01PU13_A132BarCodReo, T01PU13_A130BarCodPar, T01PU13_A758ProCod, T01PU13_A194BarOrdLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01PU17_A458FasCon, T01PU17_n458FasCon, T01PU17_A459FasDec, T01PU17_n459FasDec, T01PU17_A602MaqCod, T01PU17_n602MaqCod, T01PU17_A456FasActTin, T01PU17_n456FasActTin, T01PU17_A4903FasAcab, T01PU17_n4903FasAcab
            }
            , new Object[] {
            T01PU18_A396EmprCod, T01PU18_A129BarCod, T01PU18_A132BarCodReo, T01PU18_A130BarCodPar, T01PU18_A758ProCod, T01PU18_A194BarOrdLin, T01PU18_A12517SolAfLn
            }
            , new Object[] {
            T01PU19_A396EmprCod, T01PU19_A129BarCod, T01PU19_A132BarCodReo, T01PU19_A130BarCodPar, T01PU19_A758ProCod, T01PU19_A194BarOrdLin, T01PU19_A12516SolLzLn
            }
            , new Object[] {
            T01PU20_A396EmprCod, T01PU20_A129BarCod, T01PU20_A132BarCodReo, T01PU20_A130BarCodPar, T01PU20_A758ProCod, T01PU20_A194BarOrdLin, T01PU20_A12515SolPlLn
            }
            , new Object[] {
            T01PU21_A396EmprCod, T01PU21_A129BarCod, T01PU21_A132BarCodReo, T01PU21_A130BarCodPar, T01PU21_A758ProCod, T01PU21_A194BarOrdLin, T01PU21_A12514SolSAlLn
            }
            , new Object[] {
            T01PU22_A396EmprCod, T01PU22_A129BarCod, T01PU22_A132BarCodReo, T01PU22_A130BarCodPar, T01PU22_A758ProCod, T01PU22_A194BarOrdLin, T01PU22_A12513SolSAcLn
            }
            , new Object[] {
            T01PU23_A396EmprCod, T01PU23_A129BarCod, T01PU23_A132BarCodReo, T01PU23_A130BarCodPar, T01PU23_A758ProCod, T01PU23_A194BarOrdLin, T01PU23_A12512SolFrLn
            }
            , new Object[] {
            T01PU24_A396EmprCod, T01PU24_A129BarCod, T01PU24_A132BarCodReo, T01PU24_A130BarCodPar, T01PU24_A758ProCod, T01PU24_A194BarOrdLin, T01PU24_A12511SolAgLn
            }
            , new Object[] {
            T01PU25_A396EmprCod, T01PU25_A129BarCod, T01PU25_A132BarCodReo, T01PU25_A130BarCodPar, T01PU25_A758ProCod, T01PU25_A194BarOrdLin, T01PU25_A12510SolLvLn
            }
            , new Object[] {
            T01PU26_A396EmprCod, T01PU26_A129BarCod, T01PU26_A132BarCodReo, T01PU26_A130BarCodPar, T01PU26_A758ProCod, T01PU26_A194BarOrdLin, T01PU26_A10781BarFasNb
            }
            , new Object[] {
            T01PU27_A396EmprCod, T01PU27_A129BarCod, T01PU27_A132BarCodReo, T01PU27_A130BarCodPar, T01PU27_A758ProCod, T01PU27_A194BarOrdLin, T01PU27_A719PrdNum
            }
            , new Object[] {
            T01PU28_A396EmprCod, T01PU28_A129BarCod, T01PU28_A132BarCodReo, T01PU28_A130BarCodPar, T01PU28_A758ProCod, T01PU28_A194BarOrdLin, T01PU28_A9966Em_cod
            }
            , new Object[] {
            T01PU29_A396EmprCod, T01PU29_A129BarCod, T01PU29_A132BarCodReo, T01PU29_A130BarCodPar, T01PU29_A758ProCod, T01PU29_A194BarOrdLin, T01PU29_A9940Ab_cod
            }
            , new Object[] {
            T01PU30_A396EmprCod, T01PU30_A129BarCod, T01PU30_A132BarCodReo, T01PU30_A130BarCodPar, T01PU30_A758ProCod, T01PU30_A194BarOrdLin, T01PU30_A9911Ca_cod
            }
            , new Object[] {
            T01PU31_A396EmprCod, T01PU31_A129BarCod, T01PU31_A132BarCodReo, T01PU31_A130BarCodPar, T01PU31_A758ProCod, T01PU31_A194BarOrdLin, T01PU31_A9878Pe_cod
            }
            , new Object[] {
            T01PU32_A396EmprCod, T01PU32_A129BarCod, T01PU32_A132BarCodReo, T01PU32_A130BarCodPar, T01PU32_A758ProCod, T01PU32_A194BarOrdLin, T01PU32_A9870Rm_cod
            }
            , new Object[] {
            T01PU33_A396EmprCod, T01PU33_A129BarCod, T01PU33_A132BarCodReo, T01PU33_A130BarCodPar, T01PU33_A758ProCod, T01PU33_A194BarOrdLin, T01PU33_A7934Dtb_Ordl
            }
            , new Object[] {
            T01PU34_A396EmprCod, T01PU34_A129BarCod, T01PU34_A132BarCodReo, T01PU34_A130BarCodPar, T01PU34_A758ProCod, T01PU34_A194BarOrdLin, T01PU34_A5371FasQuiLin
            }
            , new Object[] {
            T01PU35_A396EmprCod, T01PU35_A129BarCod, T01PU35_A132BarCodReo, T01PU35_A130BarCodPar, T01PU35_A758ProCod, T01PU35_A194BarOrdLin, T01PU35_A4940A_Barcod, T01PU35_A4941A_BarReo, T01PU35_A4942A_BarPar, T01PU35_A4943A_ProCod,
            T01PU35_A4944A_BarOrd
            }
            , new Object[] {
            T01PU36_A396EmprCod, T01PU36_A129BarCod, T01PU36_A132BarCodReo, T01PU36_A130BarCodPar, T01PU36_A758ProCod, T01PU36_A194BarOrdLin, T01PU36_A4643BarFasLot
            }
            , new Object[] {
            T01PU37_A396EmprCod, T01PU37_A129BarCod, T01PU37_A132BarCodReo, T01PU37_A130BarCodPar, T01PU37_A758ProCod, T01PU37_A194BarOrdLin, T01PU37_A4031CCTCod
            }
            , new Object[] {
            T01PU38_A396EmprCod, T01PU38_A129BarCod, T01PU38_A132BarCodReo, T01PU38_A130BarCodPar, T01PU38_A758ProCod, T01PU38_A194BarOrdLin, T01PU38_A1664ParFasCod
            }
            , new Object[] {
            T01PU39_A396EmprCod, T01PU39_A129BarCod, T01PU39_A132BarCodReo, T01PU39_A130BarCodPar, T01PU39_A758ProCod, T01PU39_A194BarOrdLin
            }
            , new Object[] {
            T01PU40_A396EmprCod
            }
         }
      );
      AV22Pgmname = "BARFAS" ;
   }

   private byte wcpOAV9BarCodReo ;
   private byte Z132BarCodReo ;
   private byte Z153BarFasEst ;
   private byte Z6555BarFasNPl ;
   private byte Z3836BarFasPri ;
   private byte GxWebError ;
   private byte A132BarCodReo ;
   private byte AV9BarCodReo ;
   private byte nKeyPressed ;
   private byte A153BarFasEst ;
   private byte A6555BarFasNPl ;
   private byte A3836BarFasPri ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private short wcpOAV12BarOrdLin ;
   private short Z194BarOrdLin ;
   private short Z165BarHorIni ;
   private short Z164BarHorFin ;
   private short Z6430BarTieAut ;
   private short AV12BarOrdLin ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A194BarOrdLin ;
   private short A165BarHorIni ;
   private short A164BarHorFin ;
   private short A6430BarTieAut ;
   private short RcdFound15 ;
   private short nIsDirty_15 ;
   private int wcpOAV8BarCod ;
   private int Z129BarCod ;
   private int Z4022BarNumBot ;
   private int Z4288BarNPzas ;
   private int A129BarCod ;
   private int AV8BarCod ;
   private int trnEnded ;
   private int edtEmprCod_Enabled ;
   private int edtBarCod_Enabled ;
   private int edtBarCodReo_Enabled ;
   private int edtBarCodPar_Enabled ;
   private int edtProCod_Enabled ;
   private int edtBarOrdLin_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int A4022BarNumBot ;
   private int A4288BarNPzas ;
   private int AV23GXV1 ;
   private int GX_JID ;
   private int idxLst ;
   private java.math.BigDecimal Z216BarTieTeo ;
   private java.math.BigDecimal Z227BarUni ;
   private java.math.BigDecimal Z215BarTieRea ;
   private java.math.BigDecimal Z5999BarFasCR ;
   private java.math.BigDecimal A216BarTieTeo ;
   private java.math.BigDecimal A227BarUni ;
   private java.math.BigDecimal A215BarTieRea ;
   private java.math.BigDecimal A5999BarFasCR ;
   private java.math.BigDecimal A459FasDec ;
   private java.math.BigDecimal Z459FasDec ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV7EmprCod ;
   private String wcpOAV10BarCodPar ;
   private String wcpOAV11ProCod ;
   private String Z396EmprCod ;
   private String Z130BarCodPar ;
   private String Z758ProCod ;
   private String Z152BarFasCon ;
   private String Z150BarFacTin ;
   private String Z179BarLoc ;
   private String Z4021BarFasBot ;
   private String Z4287BarFasFor ;
   private String Z4301BarFasCoP ;
   private String Z4637BarFasCara ;
   private String Z4905BarFasAcab ;
   private String Z457FasCod ;
   private String Z603MaqCodBis ;
   private String N457FasCod ;
   private String N603MaqCodBis ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A457FasCod ;
   private String A603MaqCodBis ;
   private String A130BarCodPar ;
   private String A758ProCod ;
   private String Gx_mode ;
   private String AV7EmprCod ;
   private String AV10BarCodPar ;
   private String AV11ProCod ;
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
   private String TempTags ;
   private String edtEmprCod_Jsonclick ;
   private String edtBarCod_Internalname ;
   private String edtBarCod_Jsonclick ;
   private String edtBarCodReo_Internalname ;
   private String edtBarCodReo_Jsonclick ;
   private String edtBarCodPar_Internalname ;
   private String edtBarCodPar_Jsonclick ;
   private String edtProCod_Internalname ;
   private String edtProCod_Jsonclick ;
   private String edtBarOrdLin_Internalname ;
   private String edtBarOrdLin_Jsonclick ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String A152BarFasCon ;
   private String A150BarFacTin ;
   private String A179BarLoc ;
   private String A4021BarFasBot ;
   private String A4287BarFasFor ;
   private String A4301BarFasCoP ;
   private String A4637BarFasCara ;
   private String A4905BarFasAcab ;
   private String AV16Insert_FasCod ;
   private String AV17Insert_MaqCodBis ;
   private String A458FasCon ;
   private String A602MaqCod ;
   private String A456FasActTin ;
   private String A4903FasAcab ;
   private String AV22Pgmname ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String hsh ;
   private String sMode15 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String AV19Station ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV20Emprnom ;
   private String GXv_char3[] ;
   private String AV21Usurcod ;
   private String GXv_char4[] ;
   private String Z458FasCon ;
   private String Z602MaqCod ;
   private String Z456FasActTin ;
   private String Z4903FasAcab ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private java.util.Date Z162BarFecTeo ;
   private java.util.Date Z160BarFecRea ;
   private java.util.Date Z3298BarFecRIni ;
   private java.util.Date A162BarFecTeo ;
   private java.util.Date A160BarFecRea ;
   private java.util.Date A3298BarFecRIni ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean Dvpanel_tableattributes_Autowidth ;
   private boolean Dvpanel_tableattributes_Autoheight ;
   private boolean Dvpanel_tableattributes_Collapsible ;
   private boolean Dvpanel_tableattributes_Collapsed ;
   private boolean Dvpanel_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_tableattributes_Autoscroll ;
   private boolean n458FasCon ;
   private boolean n459FasDec ;
   private boolean n602MaqCod ;
   private boolean n456FasActTin ;
   private boolean n4903FasAcab ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private com.genexus.webpanels.WebSession AV15WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private String[] T01PU5_A458FasCon ;
   private boolean[] T01PU5_n458FasCon ;
   private java.math.BigDecimal[] T01PU5_A459FasDec ;
   private boolean[] T01PU5_n459FasDec ;
   private String[] T01PU5_A602MaqCod ;
   private boolean[] T01PU5_n602MaqCod ;
   private String[] T01PU5_A456FasActTin ;
   private boolean[] T01PU5_n456FasActTin ;
   private String[] T01PU5_A4903FasAcab ;
   private boolean[] T01PU5_n4903FasAcab ;
   private short[] T01PU7_A194BarOrdLin ;
   private String[] T01PU7_A458FasCon ;
   private boolean[] T01PU7_n458FasCon ;
   private String[] T01PU7_A152BarFasCon ;
   private byte[] T01PU7_A153BarFasEst ;
   private java.math.BigDecimal[] T01PU7_A459FasDec ;
   private boolean[] T01PU7_n459FasDec ;
   private String[] T01PU7_A602MaqCod ;
   private boolean[] T01PU7_n602MaqCod ;
   private String[] T01PU7_A456FasActTin ;
   private boolean[] T01PU7_n456FasActTin ;
   private String[] T01PU7_A150BarFacTin ;
   private java.util.Date[] T01PU7_A162BarFecTeo ;
   private java.util.Date[] T01PU7_A160BarFecRea ;
   private java.math.BigDecimal[] T01PU7_A216BarTieTeo ;
   private java.math.BigDecimal[] T01PU7_A227BarUni ;
   private String[] T01PU7_A179BarLoc ;
   private short[] T01PU7_A165BarHorIni ;
   private short[] T01PU7_A164BarHorFin ;
   private java.math.BigDecimal[] T01PU7_A215BarTieRea ;
   private java.util.Date[] T01PU7_A3298BarFecRIni ;
   private String[] T01PU7_A4021BarFasBot ;
   private int[] T01PU7_A4022BarNumBot ;
   private String[] T01PU7_A4287BarFasFor ;
   private int[] T01PU7_A4288BarNPzas ;
   private String[] T01PU7_A4301BarFasCoP ;
   private String[] T01PU7_A4637BarFasCara ;
   private String[] T01PU7_A4905BarFasAcab ;
   private String[] T01PU7_A4903FasAcab ;
   private boolean[] T01PU7_n4903FasAcab ;
   private java.math.BigDecimal[] T01PU7_A5999BarFasCR ;
   private short[] T01PU7_A6430BarTieAut ;
   private byte[] T01PU7_A6555BarFasNPl ;
   private byte[] T01PU7_A3836BarFasPri ;
   private String[] T01PU7_A396EmprCod ;
   private int[] T01PU7_A129BarCod ;
   private byte[] T01PU7_A132BarCodReo ;
   private String[] T01PU7_A130BarCodPar ;
   private String[] T01PU7_A758ProCod ;
   private String[] T01PU7_A457FasCod ;
   private String[] T01PU7_A603MaqCodBis ;
   private String[] T01PU6_A396EmprCod ;
   private String[] T01PU4_A396EmprCod ;
   private String[] T01PU8_A458FasCon ;
   private boolean[] T01PU8_n458FasCon ;
   private java.math.BigDecimal[] T01PU8_A459FasDec ;
   private boolean[] T01PU8_n459FasDec ;
   private String[] T01PU8_A602MaqCod ;
   private boolean[] T01PU8_n602MaqCod ;
   private String[] T01PU8_A456FasActTin ;
   private boolean[] T01PU8_n456FasActTin ;
   private String[] T01PU8_A4903FasAcab ;
   private boolean[] T01PU8_n4903FasAcab ;
   private String[] T01PU9_A396EmprCod ;
   private String[] T01PU10_A396EmprCod ;
   private String[] T01PU11_A396EmprCod ;
   private int[] T01PU11_A129BarCod ;
   private byte[] T01PU11_A132BarCodReo ;
   private String[] T01PU11_A130BarCodPar ;
   private String[] T01PU11_A758ProCod ;
   private short[] T01PU11_A194BarOrdLin ;
   private short[] T01PU3_A194BarOrdLin ;
   private String[] T01PU3_A152BarFasCon ;
   private byte[] T01PU3_A153BarFasEst ;
   private String[] T01PU3_A150BarFacTin ;
   private java.util.Date[] T01PU3_A162BarFecTeo ;
   private java.util.Date[] T01PU3_A160BarFecRea ;
   private java.math.BigDecimal[] T01PU3_A216BarTieTeo ;
   private java.math.BigDecimal[] T01PU3_A227BarUni ;
   private String[] T01PU3_A179BarLoc ;
   private short[] T01PU3_A165BarHorIni ;
   private short[] T01PU3_A164BarHorFin ;
   private java.math.BigDecimal[] T01PU3_A215BarTieRea ;
   private java.util.Date[] T01PU3_A3298BarFecRIni ;
   private String[] T01PU3_A4021BarFasBot ;
   private int[] T01PU3_A4022BarNumBot ;
   private String[] T01PU3_A4287BarFasFor ;
   private int[] T01PU3_A4288BarNPzas ;
   private String[] T01PU3_A4301BarFasCoP ;
   private String[] T01PU3_A4637BarFasCara ;
   private String[] T01PU3_A4905BarFasAcab ;
   private java.math.BigDecimal[] T01PU3_A5999BarFasCR ;
   private short[] T01PU3_A6430BarTieAut ;
   private byte[] T01PU3_A6555BarFasNPl ;
   private byte[] T01PU3_A3836BarFasPri ;
   private String[] T01PU3_A396EmprCod ;
   private int[] T01PU3_A129BarCod ;
   private byte[] T01PU3_A132BarCodReo ;
   private String[] T01PU3_A130BarCodPar ;
   private String[] T01PU3_A758ProCod ;
   private String[] T01PU3_A457FasCod ;
   private String[] T01PU3_A603MaqCodBis ;
   private String[] T01PU12_A396EmprCod ;
   private int[] T01PU12_A129BarCod ;
   private byte[] T01PU12_A132BarCodReo ;
   private String[] T01PU12_A130BarCodPar ;
   private String[] T01PU12_A758ProCod ;
   private short[] T01PU12_A194BarOrdLin ;
   private String[] T01PU13_A396EmprCod ;
   private int[] T01PU13_A129BarCod ;
   private byte[] T01PU13_A132BarCodReo ;
   private String[] T01PU13_A130BarCodPar ;
   private String[] T01PU13_A758ProCod ;
   private short[] T01PU13_A194BarOrdLin ;
   private short[] T01PU2_A194BarOrdLin ;
   private String[] T01PU2_A152BarFasCon ;
   private byte[] T01PU2_A153BarFasEst ;
   private String[] T01PU2_A150BarFacTin ;
   private java.util.Date[] T01PU2_A162BarFecTeo ;
   private java.util.Date[] T01PU2_A160BarFecRea ;
   private java.math.BigDecimal[] T01PU2_A216BarTieTeo ;
   private java.math.BigDecimal[] T01PU2_A227BarUni ;
   private String[] T01PU2_A179BarLoc ;
   private short[] T01PU2_A165BarHorIni ;
   private short[] T01PU2_A164BarHorFin ;
   private java.math.BigDecimal[] T01PU2_A215BarTieRea ;
   private java.util.Date[] T01PU2_A3298BarFecRIni ;
   private String[] T01PU2_A4021BarFasBot ;
   private int[] T01PU2_A4022BarNumBot ;
   private String[] T01PU2_A4287BarFasFor ;
   private int[] T01PU2_A4288BarNPzas ;
   private String[] T01PU2_A4301BarFasCoP ;
   private String[] T01PU2_A4637BarFasCara ;
   private String[] T01PU2_A4905BarFasAcab ;
   private java.math.BigDecimal[] T01PU2_A5999BarFasCR ;
   private short[] T01PU2_A6430BarTieAut ;
   private byte[] T01PU2_A6555BarFasNPl ;
   private byte[] T01PU2_A3836BarFasPri ;
   private String[] T01PU2_A396EmprCod ;
   private int[] T01PU2_A129BarCod ;
   private byte[] T01PU2_A132BarCodReo ;
   private String[] T01PU2_A130BarCodPar ;
   private String[] T01PU2_A758ProCod ;
   private String[] T01PU2_A457FasCod ;
   private String[] T01PU2_A603MaqCodBis ;
   private String[] T01PU17_A458FasCon ;
   private boolean[] T01PU17_n458FasCon ;
   private java.math.BigDecimal[] T01PU17_A459FasDec ;
   private boolean[] T01PU17_n459FasDec ;
   private String[] T01PU17_A602MaqCod ;
   private boolean[] T01PU17_n602MaqCod ;
   private String[] T01PU17_A456FasActTin ;
   private boolean[] T01PU17_n456FasActTin ;
   private String[] T01PU17_A4903FasAcab ;
   private boolean[] T01PU17_n4903FasAcab ;
   private String[] T01PU18_A396EmprCod ;
   private int[] T01PU18_A129BarCod ;
   private byte[] T01PU18_A132BarCodReo ;
   private String[] T01PU18_A130BarCodPar ;
   private String[] T01PU18_A758ProCod ;
   private short[] T01PU18_A194BarOrdLin ;
   private short[] T01PU18_A12517SolAfLn ;
   private String[] T01PU19_A396EmprCod ;
   private int[] T01PU19_A129BarCod ;
   private byte[] T01PU19_A132BarCodReo ;
   private String[] T01PU19_A130BarCodPar ;
   private String[] T01PU19_A758ProCod ;
   private short[] T01PU19_A194BarOrdLin ;
   private short[] T01PU19_A12516SolLzLn ;
   private String[] T01PU20_A396EmprCod ;
   private int[] T01PU20_A129BarCod ;
   private byte[] T01PU20_A132BarCodReo ;
   private String[] T01PU20_A130BarCodPar ;
   private String[] T01PU20_A758ProCod ;
   private short[] T01PU20_A194BarOrdLin ;
   private short[] T01PU20_A12515SolPlLn ;
   private String[] T01PU21_A396EmprCod ;
   private int[] T01PU21_A129BarCod ;
   private byte[] T01PU21_A132BarCodReo ;
   private String[] T01PU21_A130BarCodPar ;
   private String[] T01PU21_A758ProCod ;
   private short[] T01PU21_A194BarOrdLin ;
   private short[] T01PU21_A12514SolSAlLn ;
   private String[] T01PU22_A396EmprCod ;
   private int[] T01PU22_A129BarCod ;
   private byte[] T01PU22_A132BarCodReo ;
   private String[] T01PU22_A130BarCodPar ;
   private String[] T01PU22_A758ProCod ;
   private short[] T01PU22_A194BarOrdLin ;
   private short[] T01PU22_A12513SolSAcLn ;
   private String[] T01PU23_A396EmprCod ;
   private int[] T01PU23_A129BarCod ;
   private byte[] T01PU23_A132BarCodReo ;
   private String[] T01PU23_A130BarCodPar ;
   private String[] T01PU23_A758ProCod ;
   private short[] T01PU23_A194BarOrdLin ;
   private short[] T01PU23_A12512SolFrLn ;
   private String[] T01PU24_A396EmprCod ;
   private int[] T01PU24_A129BarCod ;
   private byte[] T01PU24_A132BarCodReo ;
   private String[] T01PU24_A130BarCodPar ;
   private String[] T01PU24_A758ProCod ;
   private short[] T01PU24_A194BarOrdLin ;
   private short[] T01PU24_A12511SolAgLn ;
   private String[] T01PU25_A396EmprCod ;
   private int[] T01PU25_A129BarCod ;
   private byte[] T01PU25_A132BarCodReo ;
   private String[] T01PU25_A130BarCodPar ;
   private String[] T01PU25_A758ProCod ;
   private short[] T01PU25_A194BarOrdLin ;
   private short[] T01PU25_A12510SolLvLn ;
   private String[] T01PU26_A396EmprCod ;
   private int[] T01PU26_A129BarCod ;
   private byte[] T01PU26_A132BarCodReo ;
   private String[] T01PU26_A130BarCodPar ;
   private String[] T01PU26_A758ProCod ;
   private short[] T01PU26_A194BarOrdLin ;
   private int[] T01PU26_A10781BarFasNb ;
   private String[] T01PU27_A396EmprCod ;
   private int[] T01PU27_A129BarCod ;
   private byte[] T01PU27_A132BarCodReo ;
   private String[] T01PU27_A130BarCodPar ;
   private String[] T01PU27_A758ProCod ;
   private short[] T01PU27_A194BarOrdLin ;
   private String[] T01PU27_A719PrdNum ;
   private String[] T01PU28_A396EmprCod ;
   private int[] T01PU28_A129BarCod ;
   private byte[] T01PU28_A132BarCodReo ;
   private String[] T01PU28_A130BarCodPar ;
   private String[] T01PU28_A758ProCod ;
   private short[] T01PU28_A194BarOrdLin ;
   private String[] T01PU28_A9966Em_cod ;
   private String[] T01PU29_A396EmprCod ;
   private int[] T01PU29_A129BarCod ;
   private byte[] T01PU29_A132BarCodReo ;
   private String[] T01PU29_A130BarCodPar ;
   private String[] T01PU29_A758ProCod ;
   private short[] T01PU29_A194BarOrdLin ;
   private String[] T01PU29_A9940Ab_cod ;
   private String[] T01PU30_A396EmprCod ;
   private int[] T01PU30_A129BarCod ;
   private byte[] T01PU30_A132BarCodReo ;
   private String[] T01PU30_A130BarCodPar ;
   private String[] T01PU30_A758ProCod ;
   private short[] T01PU30_A194BarOrdLin ;
   private String[] T01PU30_A9911Ca_cod ;
   private String[] T01PU31_A396EmprCod ;
   private int[] T01PU31_A129BarCod ;
   private byte[] T01PU31_A132BarCodReo ;
   private String[] T01PU31_A130BarCodPar ;
   private String[] T01PU31_A758ProCod ;
   private short[] T01PU31_A194BarOrdLin ;
   private String[] T01PU31_A9878Pe_cod ;
   private String[] T01PU32_A396EmprCod ;
   private int[] T01PU32_A129BarCod ;
   private byte[] T01PU32_A132BarCodReo ;
   private String[] T01PU32_A130BarCodPar ;
   private String[] T01PU32_A758ProCod ;
   private short[] T01PU32_A194BarOrdLin ;
   private String[] T01PU32_A9870Rm_cod ;
   private String[] T01PU33_A396EmprCod ;
   private int[] T01PU33_A129BarCod ;
   private byte[] T01PU33_A132BarCodReo ;
   private String[] T01PU33_A130BarCodPar ;
   private String[] T01PU33_A758ProCod ;
   private short[] T01PU33_A194BarOrdLin ;
   private short[] T01PU33_A7934Dtb_Ordl ;
   private String[] T01PU34_A396EmprCod ;
   private int[] T01PU34_A129BarCod ;
   private byte[] T01PU34_A132BarCodReo ;
   private String[] T01PU34_A130BarCodPar ;
   private String[] T01PU34_A758ProCod ;
   private short[] T01PU34_A194BarOrdLin ;
   private short[] T01PU34_A5371FasQuiLin ;
   private String[] T01PU35_A396EmprCod ;
   private int[] T01PU35_A129BarCod ;
   private byte[] T01PU35_A132BarCodReo ;
   private String[] T01PU35_A130BarCodPar ;
   private String[] T01PU35_A758ProCod ;
   private short[] T01PU35_A194BarOrdLin ;
   private int[] T01PU35_A4940A_Barcod ;
   private byte[] T01PU35_A4941A_BarReo ;
   private String[] T01PU35_A4942A_BarPar ;
   private String[] T01PU35_A4943A_ProCod ;
   private short[] T01PU35_A4944A_BarOrd ;
   private String[] T01PU36_A396EmprCod ;
   private int[] T01PU36_A129BarCod ;
   private byte[] T01PU36_A132BarCodReo ;
   private String[] T01PU36_A130BarCodPar ;
   private String[] T01PU36_A758ProCod ;
   private short[] T01PU36_A194BarOrdLin ;
   private int[] T01PU36_A4643BarFasLot ;
   private String[] T01PU37_A396EmprCod ;
   private int[] T01PU37_A129BarCod ;
   private byte[] T01PU37_A132BarCodReo ;
   private String[] T01PU37_A130BarCodPar ;
   private String[] T01PU37_A758ProCod ;
   private short[] T01PU37_A194BarOrdLin ;
   private int[] T01PU37_A4031CCTCod ;
   private String[] T01PU38_A396EmprCod ;
   private int[] T01PU38_A129BarCod ;
   private byte[] T01PU38_A132BarCodReo ;
   private String[] T01PU38_A130BarCodPar ;
   private String[] T01PU38_A758ProCod ;
   private short[] T01PU38_A194BarOrdLin ;
   private short[] T01PU38_A1664ParFasCod ;
   private String[] T01PU39_A396EmprCod ;
   private int[] T01PU39_A129BarCod ;
   private byte[] T01PU39_A132BarCodReo ;
   private String[] T01PU39_A130BarCodPar ;
   private String[] T01PU39_A758ProCod ;
   private short[] T01PU39_A194BarOrdLin ;
   private String[] T01PU40_A396EmprCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private app.wwpbaseobjects.SdtWWPContext AV13WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext5[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV14TrnContext ;
   private app.wwpbaseobjects.SdtWWPTransactionContext_Attribute AV18TrnContextAtt ;
}

final  class barfas__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class barfas__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class barfas__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class barfas__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class barfas__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01PU2", "SELECT BarOrdLin, BarFasCon, BarFasEst, BarFacTin, BarFecTeo, BarFecRea, BarTieTeo, BarUni, BarLoc, BarHorIni, BarHorFin, BarTieRea, BarFecRIni, BarFasBot, BarNumBot, BarFasFor, BarNPzas, BarFasCoP, BarFasCara, BarFasAcab, BarFasCR, BarTieAut, BarFasNPl, BarFasPri, EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, FasCod, MaqCodBis FROM TXPBARFAS WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?  FOR UPDATE OF BarFasCon, BarFasEst, BarFacTin, BarFecTeo, BarFecRea, BarTieTeo, BarUni, BarLoc, BarHorIni, BarHorFin, BarTieRea, BarFecRIni, BarFasBot, BarNumBot, BarFasFor, BarNPzas, BarFasCoP, BarFasCara, BarFasAcab, BarFasCR, BarTieAut, BarFasNPl, BarFasPri, FasCod, MaqCodBis NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PU3", "SELECT BarOrdLin, BarFasCon, BarFasEst, BarFacTin, BarFecTeo, BarFecRea, BarTieTeo, BarUni, BarLoc, BarHorIni, BarHorFin, BarTieRea, BarFecRIni, BarFasBot, BarNumBot, BarFasFor, BarNPzas, BarFasCoP, BarFasCara, BarFasAcab, BarFasCR, BarTieAut, BarFasNPl, BarFasPri, EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, FasCod, MaqCodBis FROM TXPBARFAS WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PU4", "SELECT EmprCod FROM TXPBARPRO WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PU5", "SELECT FasCon, FasDec, MaqCod, FasActTin, FasAcab FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PU6", "SELECT EmprCod FROM TXPMAQUIN WHERE EmprCod = ? AND MaqCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PU7", "SELECT /*+ FIRST_ROWS(100) */ TM1.BarOrdLin, T2.FasCon, TM1.BarFasCon, TM1.BarFasEst, T2.FasDec, T2.MaqCod, T2.FasActTin, TM1.BarFacTin, TM1.BarFecTeo, TM1.BarFecRea, TM1.BarTieTeo, TM1.BarUni, TM1.BarLoc, TM1.BarHorIni, TM1.BarHorFin, TM1.BarTieRea, TM1.BarFecRIni, TM1.BarFasBot, TM1.BarNumBot, TM1.BarFasFor, TM1.BarNPzas, TM1.BarFasCoP, TM1.BarFasCara, TM1.BarFasAcab, T2.FasAcab, TM1.BarFasCR, TM1.BarTieAut, TM1.BarFasNPl, TM1.BarFasPri, TM1.EmprCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar, TM1.ProCod, TM1.FasCod, TM1.MaqCodBis FROM (TXPBARFAS TM1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = TM1.EmprCod AND T2.FasCod = TM1.FasCod) WHERE TM1.EmprCod = ? and TM1.BarCod = ? and TM1.BarCodReo = ? and TM1.BarCodPar = ? and TM1.ProCod = ? and TM1.BarOrdLin = ? ORDER BY TM1.EmprCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar, TM1.ProCod, TM1.BarOrdLin ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PU8", "SELECT FasCon, FasDec, MaqCod, FasActTin, FasAcab FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PU9", "SELECT EmprCod FROM TXPMAQUIN WHERE EmprCod = ? AND MaqCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PU10", "SELECT EmprCod FROM TXPBARPRO WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PU11", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin FROM TXPBARFAS WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PU12", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin FROM TXPBARFAS WHERE ( EmprCod > ? or EmprCod = ? and BarCod > ? or BarCod = ? and EmprCod = ? and BarCodReo > ? or BarCodReo = ? and BarCod = ? and EmprCod = ? and BarCodPar > ? or BarCodPar = ? and BarCodReo = ? and BarCod = ? and EmprCod = ? and ProCod > ? or ProCod = ? and BarCodPar = ? and BarCodReo = ? and BarCod = ? and EmprCod = ? and BarOrdLin > ?) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01PU13", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin FROM TXPBARFAS WHERE ( EmprCod < ? or EmprCod = ? and BarCod < ? or BarCod = ? and EmprCod = ? and BarCodReo < ? or BarCodReo = ? and BarCod = ? and EmprCod = ? and BarCodPar < ? or BarCodPar = ? and BarCodReo = ? and BarCod = ? and EmprCod = ? and ProCod < ? or ProCod = ? and BarCodPar = ? and BarCodReo = ? and BarCod = ? and EmprCod = ? and BarOrdLin < ?) ORDER BY EmprCod DESC, BarCod DESC, BarCodReo DESC, BarCodPar DESC, ProCod DESC, BarOrdLin DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01PU14", "INSERT INTO TXPBARFAS(BarOrdLin, BarFasCon, BarFasEst, BarFacTin, BarFecTeo, BarFecRea, BarTieTeo, BarUni, BarLoc, BarHorIni, BarHorFin, BarTieRea, BarFecRIni, BarFasBot, BarNumBot, BarFasFor, BarNPzas, BarFasCoP, BarFasCara, BarFasAcab, BarFasCR, BarTieAut, BarFasNPl, BarFasPri, EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, FasCod, MaqCodBis, BarFasKgm, BarFasMtr, BarFasPzas, BarUltNlot, BarFasInc, BarFasDTI, BarFasDTF, BarFasKPr, BarFasPPr, BarFasAgr, BarFasPrp, BarFasFPl, BarFasUsu, BarFasGral, FasQuiUl, BarFasKgT, BarFasMtT, BarMaqPlan, BarFasTip, BarFasSec, BarfasMn, BarfasOP, BarHdMn, Barfastpp, BarfasUnpL, BarfasRb, Dtb_UOrd, BarHdrO, BarfasPri2, BarObsF, BarObsB, BarFasSer, BarFasObs, BarFasTOb, BarFasBlq, TsSolTLcq, TsSolTFec, TsSolRLcq, TsSolRFec, TsSolObs, SolLvLnUl, SolAgLnUl, SolFrLnUl, SolSAcLnUl, SolSAlLnUl, SolPlLnUl, SolLzLnUl, SolAfLnUl) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', ' ', 0, 0, 0, ' ', ' ', ' ', ' ', 0, ' ', 0, 0, 0, 0, ' ', 0, ' ', ' ', ' ', ' ', ' ', 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, 0, 0, 0, 0, 0, 0, 0)", GX_NOMASK, "TXPBARFAS")
         ,new UpdateCursor("T01PU15", "UPDATE TXPBARFAS SET BarFasCon=?, BarFasEst=?, BarFacTin=?, BarFecTeo=?, BarFecRea=?, BarTieTeo=?, BarUni=?, BarLoc=?, BarHorIni=?, BarHorFin=?, BarTieRea=?, BarFecRIni=?, BarFasBot=?, BarNumBot=?, BarFasFor=?, BarNPzas=?, BarFasCoP=?, BarFasCara=?, BarFasAcab=?, BarFasCR=?, BarTieAut=?, BarFasNPl=?, BarFasPri=?, FasCod=?, MaqCodBis=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?", GX_NOMASK, "TXPBARFAS")
         ,new UpdateCursor("T01PU16", "DELETE FROM TXPBARFAS  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?", GX_NOMASK, "TXPBARFAS")
         ,new ForEachCursor("T01PU17", "SELECT FasCon, FasDec, MaqCod, FasActTin, FasAcab FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PU18", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, SolAfLn FROM TXPTsSol7 WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01PU19", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, SolLzLn FROM TXPTsSol6 WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01PU20", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, SolPlLn FROM TXPTsSol5 WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01PU21", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, SolSAlLn FROM TXPTsSol4 WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01PU22", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, SolSAcLn FROM TXPTsSol3 WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01PU23", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, SolFrLn FROM TXPTsSol2 WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01PU24", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, SolAgLn FROM TXPTsSolL WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01PU25", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, SolLvLn FROM TXPTsSol1 WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01PU26", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, BarFasNb FROM TXPFASBOT WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01PU27", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, PrdNum FROM TXPZEPHYR WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01PU28", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, Em_cod FROM TXPCACEMp WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01PU29", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, Ab_cod FROM TXPCACABp WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01PU30", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, Ca_cod FROM TXPCACCAp WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01PU31", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, Pe_cod FROM TXPCACPEp WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01PU32", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, Rm_cod FROM TXPCACRAp WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01PU33", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, Dtb_Ordl FROM TXPDT005 WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01PU34", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, FasQuiLin FROM TXPFASQUI WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01PU35", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, A_Barcod, A_BarReo, A_BarPar, A_ProCod, A_BarOrd FROM TXPAGRHDF WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01PU36", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, BarFasLot FROM TXPFASMAQ WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01PU37", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, CCTCod FROM TXPCC WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01PU38", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, ParFasCod FROM TXPBarPar WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01PU39", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin FROM TXPBARFAS ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PU40", "SELECT EmprCod FROM TXPBARPRO WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((String[]) buf[8])[0] = rslt.getString(9, 10);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               ((short[]) buf[10])[0] = rslt.getShort(11);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(12,2);
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDate(13);
               ((String[]) buf[13])[0] = rslt.getString(14, 1);
               ((int[]) buf[14])[0] = rslt.getInt(15);
               ((String[]) buf[15])[0] = rslt.getString(16, 1);
               ((int[]) buf[16])[0] = rslt.getInt(17);
               ((String[]) buf[17])[0] = rslt.getString(18, 1);
               ((String[]) buf[18])[0] = rslt.getString(19, 1);
               ((String[]) buf[19])[0] = rslt.getString(20, 1);
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(21,5);
               ((short[]) buf[21])[0] = rslt.getShort(22);
               ((byte[]) buf[22])[0] = rslt.getByte(23);
               ((byte[]) buf[23])[0] = rslt.getByte(24);
               ((String[]) buf[24])[0] = rslt.getString(25, 3);
               ((int[]) buf[25])[0] = rslt.getInt(26);
               ((byte[]) buf[26])[0] = rslt.getByte(27);
               ((String[]) buf[27])[0] = rslt.getString(28, 1);
               ((String[]) buf[28])[0] = rslt.getString(29, 8);
               ((String[]) buf[29])[0] = rslt.getString(30, 8);
               ((String[]) buf[30])[0] = rslt.getString(31, 6);
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((String[]) buf[8])[0] = rslt.getString(9, 10);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               ((short[]) buf[10])[0] = rslt.getShort(11);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(12,2);
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDate(13);
               ((String[]) buf[13])[0] = rslt.getString(14, 1);
               ((int[]) buf[14])[0] = rslt.getInt(15);
               ((String[]) buf[15])[0] = rslt.getString(16, 1);
               ((int[]) buf[16])[0] = rslt.getInt(17);
               ((String[]) buf[17])[0] = rslt.getString(18, 1);
               ((String[]) buf[18])[0] = rslt.getString(19, 1);
               ((String[]) buf[19])[0] = rslt.getString(20, 1);
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(21,5);
               ((short[]) buf[21])[0] = rslt.getShort(22);
               ((byte[]) buf[22])[0] = rslt.getByte(23);
               ((byte[]) buf[23])[0] = rslt.getByte(24);
               ((String[]) buf[24])[0] = rslt.getString(25, 3);
               ((int[]) buf[25])[0] = rslt.getInt(26);
               ((byte[]) buf[26])[0] = rslt.getByte(27);
               ((String[]) buf[27])[0] = rslt.getString(28, 1);
               ((String[]) buf[28])[0] = rslt.getString(29, 8);
               ((String[]) buf[29])[0] = rslt.getString(30, 8);
               ((String[]) buf[30])[0] = rslt.getString(31, 6);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(2,1);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 6);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 5 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(8, 1);
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDate(9);
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDate(10);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(11,2);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(12,2);
               ((String[]) buf[16])[0] = rslt.getString(13, 10);
               ((short[]) buf[17])[0] = rslt.getShort(14);
               ((short[]) buf[18])[0] = rslt.getShort(15);
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(16,2);
               ((java.util.Date[]) buf[20])[0] = rslt.getGXDate(17);
               ((String[]) buf[21])[0] = rslt.getString(18, 1);
               ((int[]) buf[22])[0] = rslt.getInt(19);
               ((String[]) buf[23])[0] = rslt.getString(20, 1);
               ((int[]) buf[24])[0] = rslt.getInt(21);
               ((String[]) buf[25])[0] = rslt.getString(22, 1);
               ((String[]) buf[26])[0] = rslt.getString(23, 1);
               ((String[]) buf[27])[0] = rslt.getString(24, 1);
               ((String[]) buf[28])[0] = rslt.getString(25, 1);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[30])[0] = rslt.getBigDecimal(26,5);
               ((short[]) buf[31])[0] = rslt.getShort(27);
               ((byte[]) buf[32])[0] = rslt.getByte(28);
               ((byte[]) buf[33])[0] = rslt.getByte(29);
               ((String[]) buf[34])[0] = rslt.getString(30, 3);
               ((int[]) buf[35])[0] = rslt.getInt(31);
               ((byte[]) buf[36])[0] = rslt.getByte(32);
               ((String[]) buf[37])[0] = rslt.getString(33, 1);
               ((String[]) buf[38])[0] = rslt.getString(34, 8);
               ((String[]) buf[39])[0] = rslt.getString(35, 8);
               ((String[]) buf[40])[0] = rslt.getString(36, 6);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(2,1);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 6);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(2,1);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 6);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
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
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 33 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 1);
               ((String[]) buf[9])[0] = rslt.getString(10, 8);
               ((short[]) buf[10])[0] = rslt.getShort(11);
               return;
            case 34 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               return;
            case 35 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               return;
            case 36 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 37 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 38 :
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
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
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
               stmt.setString(5, (String)parms[4], 8);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 10 :
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
               stmt.setString(15, (String)parms[14], 8);
               stmt.setString(16, (String)parms[15], 8);
               stmt.setString(17, (String)parms[16], 1);
               stmt.setByte(18, ((Number) parms[17]).byteValue());
               stmt.setInt(19, ((Number) parms[18]).intValue());
               stmt.setString(20, (String)parms[19], 3);
               stmt.setShort(21, ((Number) parms[20]).shortValue());
               return;
            case 11 :
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
               stmt.setString(15, (String)parms[14], 8);
               stmt.setString(16, (String)parms[15], 8);
               stmt.setString(17, (String)parms[16], 1);
               stmt.setByte(18, ((Number) parms[17]).byteValue());
               stmt.setInt(19, ((Number) parms[18]).intValue());
               stmt.setString(20, (String)parms[19], 3);
               stmt.setShort(21, ((Number) parms[20]).shortValue());
               return;
            case 12 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 1);
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setDate(5, (java.util.Date)parms[4]);
               stmt.setDate(6, (java.util.Date)parms[5]);
               stmt.setBigDecimal(7, (java.math.BigDecimal)parms[6], 2);
               stmt.setBigDecimal(8, (java.math.BigDecimal)parms[7], 2);
               stmt.setString(9, (String)parms[8], 10);
               stmt.setShort(10, ((Number) parms[9]).shortValue());
               stmt.setShort(11, ((Number) parms[10]).shortValue());
               stmt.setBigDecimal(12, (java.math.BigDecimal)parms[11], 2);
               stmt.setDate(13, (java.util.Date)parms[12]);
               stmt.setString(14, (String)parms[13], 1);
               stmt.setInt(15, ((Number) parms[14]).intValue());
               stmt.setString(16, (String)parms[15], 1);
               stmt.setInt(17, ((Number) parms[16]).intValue());
               stmt.setString(18, (String)parms[17], 1);
               stmt.setString(19, (String)parms[18], 1);
               stmt.setString(20, (String)parms[19], 1);
               stmt.setBigDecimal(21, (java.math.BigDecimal)parms[20], 5);
               stmt.setShort(22, ((Number) parms[21]).shortValue());
               stmt.setByte(23, ((Number) parms[22]).byteValue());
               stmt.setByte(24, ((Number) parms[23]).byteValue());
               stmt.setString(25, (String)parms[24], 3);
               stmt.setInt(26, ((Number) parms[25]).intValue());
               stmt.setByte(27, ((Number) parms[26]).byteValue());
               stmt.setString(28, (String)parms[27], 1);
               stmt.setString(29, (String)parms[28], 8);
               stmt.setString(30, (String)parms[29], 8);
               stmt.setString(31, (String)parms[30], 6);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 1);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 1);
               stmt.setDate(4, (java.util.Date)parms[3]);
               stmt.setDate(5, (java.util.Date)parms[4]);
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[5], 2);
               stmt.setBigDecimal(7, (java.math.BigDecimal)parms[6], 2);
               stmt.setString(8, (String)parms[7], 10);
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               stmt.setShort(10, ((Number) parms[9]).shortValue());
               stmt.setBigDecimal(11, (java.math.BigDecimal)parms[10], 2);
               stmt.setDate(12, (java.util.Date)parms[11]);
               stmt.setString(13, (String)parms[12], 1);
               stmt.setInt(14, ((Number) parms[13]).intValue());
               stmt.setString(15, (String)parms[14], 1);
               stmt.setInt(16, ((Number) parms[15]).intValue());
               stmt.setString(17, (String)parms[16], 1);
               stmt.setString(18, (String)parms[17], 1);
               stmt.setString(19, (String)parms[18], 1);
               stmt.setBigDecimal(20, (java.math.BigDecimal)parms[19], 5);
               stmt.setShort(21, ((Number) parms[20]).shortValue());
               stmt.setByte(22, ((Number) parms[21]).byteValue());
               stmt.setByte(23, ((Number) parms[22]).byteValue());
               stmt.setString(24, (String)parms[23], 8);
               stmt.setString(25, (String)parms[24], 6);
               stmt.setString(26, (String)parms[25], 3);
               stmt.setInt(27, ((Number) parms[26]).intValue());
               stmt.setByte(28, ((Number) parms[27]).byteValue());
               stmt.setString(29, (String)parms[28], 1);
               stmt.setString(30, (String)parms[29], 8);
               stmt.setShort(31, ((Number) parms[30]).shortValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 28 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 29 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
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
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 31 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 32 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 33 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 34 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 35 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 36 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 38 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               return;
      }
   }

}

