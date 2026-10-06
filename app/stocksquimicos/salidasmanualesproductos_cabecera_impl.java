package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class salidasmanualesproductos_cabecera_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action24") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A859CumCodCont = (int)(GXutil.lval( httpContext.GetPar( "CumCodCont"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A859CumCodCont", GXutil.ltrimstr( DecimalUtil.doubleToDec(A859CumCodCont), 8, 0));
         Gx_mode = httpContext.GetPar( "Mode") ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_24_1QY111( A396EmprCod, A859CumCodCont, Gx_mode) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel3"+"_"+"CC_ALMDC") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A8925CC_AlmCd = (byte)(GXutil.lval( httpContext.GetPar( "CC_AlmCd"))) ;
         n8925CC_AlmCd = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A8925CC_AlmCd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8925CC_AlmCd), 2, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx3asacc_almdc1QY111( A396EmprCod, A8925CC_AlmCd) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel4"+"_"+"CUMCCOSD") == 0 )
      {
         A10777CumCCos = (short)(GXutil.lval( httpContext.GetPar( "CumCCos"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A10777CumCCos", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10777CumCCos), 3, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx4asacumccosd1QY111( A10777CumCCos) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_28") == 0 )
      {
         A3839CcoCod = (short)(GXutil.lval( httpContext.GetPar( "CcoCod"))) ;
         n3839CcoCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3839CcoCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3839CcoCod), 3, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_28( A3839CcoCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_29") == 0 )
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
         gxload_29( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar) ;
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
            AV8CumCodCont = (int)(GXutil.lval( httpContext.GetPar( "CumCodCont"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8CumCodCont", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8CumCodCont), 8, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCUMCODCONT", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV8CumCodCont), "ZZZZZZZ9")));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Salidas Manuales Productos_Cabecera", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtCumCodCont_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public salidasmanualesproductos_cabecera_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public salidasmanualesproductos_cabecera_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( salidasmanualesproductos_cabecera_impl.class ));
   }

   public salidasmanualesproductos_cabecera_impl( int remoteHandle ,
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-9 col-lg-12", "left", "top", "", "", "div");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCumCodCont_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCumCodCont_Internalname, httpContext.getMessage( "Codigo Contador", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCumCodCont_Internalname, GXutil.ltrim( localUtil.ntoc( A859CumCodCont, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A859CumCodCont), "ZZZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,22);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCumCodCont_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCumCodCont_Enabled, 1, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\SalidasManualesProductos_Cabecera.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCumConFec_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCumConFec_Internalname, httpContext.getMessage( "Fecha cumplimentación", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtCumConFec_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCumConFec_Internalname, localUtil.format(A862CumConFec, "99/99/99"), localUtil.format( A862CumConFec, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,27);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCumConFec_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCumConFec_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\SalidasManualesProductos_Cabecera.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtCumConFec_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtCumConFec_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_StocksQuimicos\\SalidasManualesProductos_Cabecera.htm");
      httpContext.writeTextNL( "</div>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCumCCos_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCumCCos_Internalname, httpContext.getMessage( "Centro Coste", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 32,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCumCCos_Internalname, GXutil.ltrim( localUtil.ntoc( A10777CumCCos, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCumCCos_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10777CumCCos), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A10777CumCCos), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,32);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCumCCos_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCumCCos_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\SalidasManualesProductos_Cabecera.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCumCCosD_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCumCCosD_Internalname, httpContext.getMessage( "Descripcion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCumCCosD_Internalname, GXutil.rtrim( A10778CumCCosD), GXutil.rtrim( localUtil.format( A10778CumCCosD, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCumCCosD_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCumCCosD_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_StocksQuimicos\\SalidasManualesProductos_Cabecera.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCumConTipo_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCumConTipo_Internalname, httpContext.getMessage( "Tipo Salida:0=Alm General,1=Alm CC", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 42,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCumConTipo_Internalname, GXutil.ltrim( localUtil.ntoc( A11368CumConTipo, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCumConTipo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11368CumConTipo), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A11368CumConTipo), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,42);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCumConTipo_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCumConTipo_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\SalidasManualesProductos_Cabecera.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCC_AlmCd_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCC_AlmCd_Internalname, httpContext.getMessage( "Almacen", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 47,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCC_AlmCd_Internalname, GXutil.ltrim( localUtil.ntoc( A8925CC_AlmCd, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCC_AlmCd_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A8925CC_AlmCd), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A8925CC_AlmCd), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,47);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCC_AlmCd_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCC_AlmCd_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\SalidasManualesProductos_Cabecera.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCC_AlmDc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCC_AlmDc_Internalname, httpContext.getMessage( "Descripcion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCC_AlmDc_Internalname, GXutil.rtrim( A8926CC_AlmDc), GXutil.rtrim( localUtil.format( A8926CC_AlmDc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCC_AlmDc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCC_AlmDc_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_StocksQuimicos\\SalidasManualesProductos_Cabecera.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 57,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_StocksQuimicos\\SalidasManualesProductos_Cabecera.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_StocksQuimicos\\SalidasManualesProductos_Cabecera.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_StocksQuimicos\\SalidasManualesProductos_Cabecera.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 65,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,65);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", edtEmprCod_Visible, edtEmprCod_Enabled, 1, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_StocksQuimicos\\SalidasManualesProductos_Cabecera.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "Attribute", "", "", "", "", edtEmprNom_Visible, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_StocksQuimicos\\SalidasManualesProductos_Cabecera.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 67,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCcoCod_Internalname, GXutil.ltrim( localUtil.ntoc( A3839CcoCod, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A3839CcoCod), "ZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,67);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCcoCod_Jsonclick, 0, "Attribute", "", "", "", "", edtCcoCod_Visible, edtCcoCod_Enabled, 1, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\SalidasManualesProductos_Cabecera.htm");
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
      e111QY2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z859CumCodCont = (int)(localUtil.ctol( httpContext.cgiGet( "Z859CumCodCont"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z862CumConFec = localUtil.ctod( httpContext.cgiGet( "Z862CumConFec"), 0) ;
            Z10777CumCCos = (short)(localUtil.ctol( httpContext.cgiGet( "Z10777CumCCos"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z11368CumConTipo = (byte)(localUtil.ctol( httpContext.cgiGet( "Z11368CumConTipo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z8925CC_AlmCd = (byte)(localUtil.ctol( httpContext.cgiGet( "Z8925CC_AlmCd"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z3839CcoCod = (short)(localUtil.ctol( httpContext.cgiGet( "Z3839CcoCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z129BarCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( "Z132BarCodReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z130BarCodPar = httpContext.cgiGet( "Z130BarCodPar") ;
            A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z129BarCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( "Z132BarCodReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A130BarCodPar = httpContext.cgiGet( "Z130BarCodPar") ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            N3839CcoCod = (short)(localUtil.ctol( httpContext.cgiGet( "N3839CcoCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            N129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( "N129BarCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            N132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( "N132BarCodReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            N130BarCodPar = httpContext.cgiGet( "N130BarCodPar") ;
            AV7EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            AV8CumCodCont = (int)(localUtil.ctol( httpContext.cgiGet( "vCUMCODCONT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV12Insert_CcoCod = (short)(localUtil.ctol( httpContext.cgiGet( "vINSERT_CCOCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV17Insert_BarCod = (int)(localUtil.ctol( httpContext.cgiGet( "vINSERT_BARCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( "BARCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV18Insert_BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( "vINSERT_BARCODREO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( "BARCODREO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV19Insert_BarCodPar = httpContext.cgiGet( "vINSERT_BARCODPAR") ;
            A130BarCodPar = httpContext.cgiGet( "BARCODPAR") ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV21Pgmname = httpContext.cgiGet( "vPGMNAME") ;
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
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCumCodCont_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCumCodCont_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CUMCODCONT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCumCodCont_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A859CumCodCont = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A859CumCodCont", GXutil.ltrimstr( DecimalUtil.doubleToDec(A859CumCodCont), 8, 0));
            }
            else
            {
               A859CumCodCont = (int)(localUtil.ctol( httpContext.cgiGet( edtCumCodCont_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A859CumCodCont", GXutil.ltrimstr( DecimalUtil.doubleToDec(A859CumCodCont), 8, 0));
            }
            if ( localUtil.vcdate( httpContext.cgiGet( edtCumConFec_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "CUMCONFEC");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCumConFec_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A862CumConFec = GXutil.nullDate() ;
               httpContext.ajax_rsp_assign_attri("", false, "A862CumConFec", localUtil.format(A862CumConFec, "99/99/99"));
            }
            else
            {
               A862CumConFec = localUtil.ctod( httpContext.cgiGet( edtCumConFec_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A862CumConFec", localUtil.format(A862CumConFec, "99/99/99"));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCumCCos_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCumCCos_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CUMCCOS");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCumCCos_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10777CumCCos = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A10777CumCCos", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10777CumCCos), 3, 0));
            }
            else
            {
               A10777CumCCos = (short)(localUtil.ctol( httpContext.cgiGet( edtCumCCos_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A10777CumCCos", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10777CumCCos), 3, 0));
            }
            A10778CumCCosD = httpContext.cgiGet( edtCumCCosD_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10778CumCCosD", A10778CumCCosD);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCumConTipo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCumConTipo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CUMCONTIPO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCumConTipo_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A11368CumConTipo = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A11368CumConTipo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11368CumConTipo), 2, 0));
            }
            else
            {
               A11368CumConTipo = (byte)(localUtil.ctol( httpContext.cgiGet( edtCumConTipo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A11368CumConTipo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11368CumConTipo), 2, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCC_AlmCd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCC_AlmCd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CC_ALMCD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCC_AlmCd_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A8925CC_AlmCd = (byte)(0) ;
               n8925CC_AlmCd = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A8925CC_AlmCd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8925CC_AlmCd), 2, 0));
            }
            else
            {
               A8925CC_AlmCd = (byte)(localUtil.ctol( httpContext.cgiGet( edtCC_AlmCd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n8925CC_AlmCd = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A8925CC_AlmCd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8925CC_AlmCd), 2, 0));
            }
            A8926CC_AlmDc = httpContext.cgiGet( edtCC_AlmDc_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8926CC_AlmDc", A8926CC_AlmDc);
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCcoCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCcoCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CCOCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCcoCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A3839CcoCod = (short)(0) ;
               n3839CcoCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3839CcoCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3839CcoCod), 3, 0));
            }
            else
            {
               A3839CcoCod = (short)(localUtil.ctol( httpContext.cgiGet( edtCcoCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n3839CcoCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3839CcoCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3839CcoCod), 3, 0));
            }
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"SalidasManualesProductos_Cabecera");
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( A859CumCodCont != Z859CumCodCont ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("stocksquimicos\\salidasmanualesproductos_cabecera:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               A859CumCodCont = (int)(GXutil.lval( httpContext.GetPar( "CumCodCont"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A859CumCodCont", GXutil.ltrimstr( DecimalUtil.doubleToDec(A859CumCodCont), 8, 0));
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
                  sMode111 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  Gx_mode = sMode111 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound111 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_1QY0( ) ;
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
                        e111QY2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e121QY2 ();
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
         e121QY2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll1QY111( ) ;
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
         disableAttributes1QY111( ) ;
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

   public void confirm_1QY0( )
   {
      beforeValidate1QY111( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1QY111( ) ;
         }
         else
         {
            checkExtendedTable1QY111( ) ;
            closeExtendedTableCursors1QY111( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
   }

   public void resetCaption1QY0( )
   {
   }

   public void e111QY2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV14Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      salidasmanualesproductos_cabecera_impl.this.GXt_char1 = GXv_char2[0] ;
      AV14Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14Station", AV14Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV15EmprNom ;
      GXv_char4[0] = AV16UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV14Station, GXv_char2, GXv_char3, GXv_char4) ;
      salidasmanualesproductos_cabecera_impl.this.A396EmprCod = GXv_char2[0] ;
      salidasmanualesproductos_cabecera_impl.this.AV15EmprNom = GXv_char3[0] ;
      salidasmanualesproductos_cabecera_impl.this.AV16UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV15EmprNom", AV15EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV16UsurCod", AV16UsurCod);
      GXt_char1 = AV14Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      salidasmanualesproductos_cabecera_impl.this.GXt_char1 = GXv_char4[0] ;
      AV14Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14Station", AV14Station);
      GXv_char4[0] = AV7EmprCod ;
      GXv_char3[0] = AV15EmprNom ;
      GXv_char2[0] = AV16UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV14Station, GXv_char4, GXv_char3, GXv_char2) ;
      salidasmanualesproductos_cabecera_impl.this.AV7EmprCod = GXv_char4[0] ;
      salidasmanualesproductos_cabecera_impl.this.AV15EmprNom = GXv_char3[0] ;
      salidasmanualesproductos_cabecera_impl.this.AV16UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV15EmprNom", AV15EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV16UsurCod", AV16UsurCod);
      GXv_SdtWWPContext5[0] = AV9WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext5) ;
      AV9WWPContext = GXv_SdtWWPContext5[0] ;
      AV10TrnContext.fromxml(AV11WebSession.getValue("TrnContext"), null, null);
      if ( ( GXutil.strcmp(AV10TrnContext.getgxTv_SdtWWPTransactionContext_Transactionname(), AV21Pgmname) == 0 ) && ( GXutil.strcmp(Gx_mode, "INS") == 0 ) )
      {
         AV22GXV1 = 1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV22GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22GXV1), 8, 0));
         while ( AV22GXV1 <= AV10TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().size() )
         {
            AV13TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)((app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)AV10TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().elementAt(-1+AV22GXV1));
            if ( GXutil.strcmp(AV13TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "CcoCod") == 0 )
            {
               AV12Insert_CcoCod = (short)(GXutil.lval( AV13TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue())) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV12Insert_CcoCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12Insert_CcoCod), 3, 0));
            }
            else if ( GXutil.strcmp(AV13TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "BarCod") == 0 )
            {
               AV17Insert_BarCod = (int)(GXutil.lval( AV13TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue())) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV17Insert_BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17Insert_BarCod), 8, 0));
            }
            else if ( GXutil.strcmp(AV13TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "BarCodReo") == 0 )
            {
               AV18Insert_BarCodReo = (byte)(GXutil.lval( AV13TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue())) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV18Insert_BarCodReo", GXutil.str( AV18Insert_BarCodReo, 1, 0));
            }
            else if ( GXutil.strcmp(AV13TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "BarCodPar") == 0 )
            {
               AV19Insert_BarCodPar = AV13TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue() ;
               httpContext.ajax_rsp_assign_attri("", false, "AV19Insert_BarCodPar", AV19Insert_BarCodPar);
            }
            AV22GXV1 = (int)(AV22GXV1+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV22GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22GXV1), 8, 0));
         }
      }
      edtEmprCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Visible), 5, 0), true);
      edtEmprNom_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Visible), 5, 0), true);
      edtCcoCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCcoCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCcoCod_Visible), 5, 0), true);
   }

   public void e121QY2( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV10TrnContext.getgxTv_SdtWWPTransactionContext_Callerondelete() )
      {
         callWebObject(formatLink("app.stocksquimicos.salidasmanualesproductos_cabeceraww", new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
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

   public void zm1QY111( int GX_JID )
   {
      if ( ( GX_JID == 26 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z862CumConFec = T01QY3_A862CumConFec[0] ;
            Z10777CumCCos = T01QY3_A10777CumCCos[0] ;
            Z11368CumConTipo = T01QY3_A11368CumConTipo[0] ;
            Z8925CC_AlmCd = T01QY3_A8925CC_AlmCd[0] ;
            Z3839CcoCod = T01QY3_A3839CcoCod[0] ;
            Z129BarCod = T01QY3_A129BarCod[0] ;
            Z132BarCodReo = T01QY3_A132BarCodReo[0] ;
            Z130BarCodPar = T01QY3_A130BarCodPar[0] ;
         }
         else
         {
            Z862CumConFec = A862CumConFec ;
            Z10777CumCCos = A10777CumCCos ;
            Z11368CumConTipo = A11368CumConTipo ;
            Z8925CC_AlmCd = A8925CC_AlmCd ;
            Z3839CcoCod = A3839CcoCod ;
            Z129BarCod = A129BarCod ;
            Z132BarCodReo = A132BarCodReo ;
            Z130BarCodPar = A130BarCodPar ;
         }
      }
      if ( GX_JID == -26 )
      {
         Z859CumCodCont = A859CumCodCont ;
         Z862CumConFec = A862CumConFec ;
         Z10777CumCCos = A10777CumCCos ;
         Z11368CumConTipo = A11368CumConTipo ;
         Z8925CC_AlmCd = A8925CC_AlmCd ;
         Z396EmprCod = A396EmprCod ;
         Z3839CcoCod = A3839CcoCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
      AV21Pgmname = "StocksQuimicos.SalidasManualesProductos_Cabecera" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21Pgmname", AV21Pgmname);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV7EmprCod)==0) )
      {
         A396EmprCod = AV7EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      /* Using cursor T01QY4 */
      pr_default.execute(2, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01QY4_A407EmprNom[0] ;
      n407EmprNom = T01QY4_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(2);
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
      if ( ! (0==AV8CumCodCont) )
      {
         A859CumCodCont = AV8CumCodCont ;
         httpContext.ajax_rsp_assign_attri("", false, "A859CumCodCont", GXutil.ltrimstr( DecimalUtil.doubleToDec(A859CumCodCont), 8, 0));
      }
      if ( ! (0==AV8CumCodCont) )
      {
         edtCumCodCont_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCumCodCont_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCumCodCont_Enabled), 5, 0), true);
      }
      else
      {
         edtCumCodCont_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCumCodCont_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCumCodCont_Enabled), 5, 0), true);
      }
      if ( ! (0==AV8CumCodCont) )
      {
         edtCumCodCont_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCumCodCont_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCumCodCont_Enabled), 5, 0), true);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV12Insert_CcoCod) )
      {
         edtCcoCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCcoCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCcoCod_Enabled), 5, 0), true);
      }
      else
      {
         edtCcoCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCcoCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCcoCod_Enabled), 5, 0), true);
      }
   }

   public void standaloneModal( )
   {
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (GXutil.strcmp("", AV19Insert_BarCodPar)==0) )
      {
         A130BarCodPar = AV19Insert_BarCodPar ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV18Insert_BarCodReo) )
      {
         A132BarCodReo = AV18Insert_BarCodReo ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV17Insert_BarCod) )
      {
         A129BarCod = AV17Insert_BarCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
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
      if ( isIns( )  && GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A862CumConFec)) && ( Gx_BScreen == 0 ) )
      {
         A862CumConFec = GXutil.serverDate( context, remoteHandle, pr_default) ;
         httpContext.ajax_rsp_assign_attri("", false, "A862CumConFec", localUtil.format(A862CumConFec, "99/99/99"));
      }
      if ( isIns( )  && (0==A11368CumConTipo) && ( Gx_BScreen == 0 ) )
      {
         A11368CumConTipo = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A11368CumConTipo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11368CumConTipo), 2, 0));
      }
   }

   public void load1QY111( )
   {
      /* Using cursor T01QY7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A859CumCodCont)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound111 = (short)(1) ;
         A407EmprNom = T01QY7_A407EmprNom[0] ;
         n407EmprNom = T01QY7_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A862CumConFec = T01QY7_A862CumConFec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A862CumConFec", localUtil.format(A862CumConFec, "99/99/99"));
         A10777CumCCos = T01QY7_A10777CumCCos[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10777CumCCos", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10777CumCCos), 3, 0));
         A11368CumConTipo = T01QY7_A11368CumConTipo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11368CumConTipo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11368CumConTipo), 2, 0));
         A8925CC_AlmCd = T01QY7_A8925CC_AlmCd[0] ;
         n8925CC_AlmCd = T01QY7_n8925CC_AlmCd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8925CC_AlmCd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8925CC_AlmCd), 2, 0));
         A3839CcoCod = T01QY7_A3839CcoCod[0] ;
         n3839CcoCod = T01QY7_n3839CcoCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3839CcoCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3839CcoCod), 3, 0));
         A129BarCod = T01QY7_A129BarCod[0] ;
         A132BarCodReo = T01QY7_A132BarCodReo[0] ;
         A130BarCodPar = T01QY7_A130BarCodPar[0] ;
         zm1QY111( -26) ;
      }
      pr_default.close(5);
      onLoadActions1QY111( ) ;
   }

   public void onLoadActions1QY111( )
   {
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV12Insert_CcoCod) )
      {
         A3839CcoCod = AV12Insert_CcoCod ;
         n3839CcoCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3839CcoCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3839CcoCod), 3, 0));
      }
      else
      {
         A3839CcoCod = A10777CumCCos ;
         n3839CcoCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3839CcoCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3839CcoCod), 3, 0));
      }
      GXt_char1 = A10778CumCCosD ;
      GXv_int6[0] = A10777CumCCos ;
      GXv_char4[0] = GXt_char1 ;
      new app.pccdsc(remoteHandle, context).execute( GXv_int6, GXv_char4) ;
      salidasmanualesproductos_cabecera_impl.this.A10777CumCCos = GXv_int6[0] ;
      salidasmanualesproductos_cabecera_impl.this.GXt_char1 = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A10777CumCCos", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10777CumCCos), 3, 0));
      A10778CumCCosD = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A10778CumCCosD", A10778CumCCosD);
      GXt_char1 = A8926CC_AlmDc ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int7[0] = A8925CC_AlmCd ;
      GXv_char3[0] = GXt_char1 ;
      new app.pexialmc(remoteHandle, context).execute( GXv_char4, GXv_int7, GXv_char3) ;
      salidasmanualesproductos_cabecera_impl.this.A396EmprCod = GXv_char4[0] ;
      salidasmanualesproductos_cabecera_impl.this.A8925CC_AlmCd = GXv_int7[0] ;
      salidasmanualesproductos_cabecera_impl.this.GXt_char1 = GXv_char3[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A8925CC_AlmCd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8925CC_AlmCd), 2, 0));
      A8926CC_AlmDc = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A8926CC_AlmDc", A8926CC_AlmDc);
   }

   public void checkExtendedTable1QY111( )
   {
      nIsDirty_111 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV12Insert_CcoCod) )
      {
         nIsDirty_111 = (short)(1) ;
         A3839CcoCod = AV12Insert_CcoCod ;
         n3839CcoCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3839CcoCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3839CcoCod), 3, 0));
      }
      else
      {
         nIsDirty_111 = (short)(1) ;
         A3839CcoCod = A10777CumCCos ;
         n3839CcoCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3839CcoCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3839CcoCod), 3, 0));
      }
      /* Using cursor T01QY5 */
      pr_default.execute(3, new Object[] {Boolean.valueOf(n3839CcoCod), Short.valueOf(A3839CcoCod)});
      if ( (pr_default.getStatus(3) == 101) )
      {
         if ( ! ( (0==A3839CcoCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CENTCO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CCOCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtCcoCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      pr_default.close(3);
      nIsDirty_111 = (short)(1) ;
      GXt_char1 = A10778CumCCosD ;
      GXv_int6[0] = A10777CumCCos ;
      GXv_char4[0] = GXt_char1 ;
      new app.pccdsc(remoteHandle, context).execute( GXv_int6, GXv_char4) ;
      salidasmanualesproductos_cabecera_impl.this.A10777CumCCos = GXv_int6[0] ;
      salidasmanualesproductos_cabecera_impl.this.GXt_char1 = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A10777CumCCos", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10777CumCCos), 3, 0));
      A10778CumCCosD = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A10778CumCCosD", A10778CumCCosD);
      if ( ( A10777CumCCos > 0 ) && ( GXutil.strcmp(A10778CumCCosD, httpContext.getMessage( "Error", "")) == 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "No Existe Centro Coste", ""), 1, "CUMCCOS");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCumCCos_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      /* Using cursor T01QY6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
      }
      pr_default.close(4);
      nIsDirty_111 = (short)(1) ;
      GXt_char1 = A8926CC_AlmDc ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int7[0] = A8925CC_AlmCd ;
      GXv_char3[0] = GXt_char1 ;
      new app.pexialmc(remoteHandle, context).execute( GXv_char4, GXv_int7, GXv_char3) ;
      salidasmanualesproductos_cabecera_impl.this.A396EmprCod = GXv_char4[0] ;
      salidasmanualesproductos_cabecera_impl.this.A8925CC_AlmCd = GXv_int7[0] ;
      salidasmanualesproductos_cabecera_impl.this.GXt_char1 = GXv_char3[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A8925CC_AlmCd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8925CC_AlmCd), 2, 0));
      A8926CC_AlmDc = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A8926CC_AlmDc", A8926CC_AlmDc);
   }

   public void closeExtendedTableCursors1QY111( )
   {
      pr_default.close(3);
      pr_default.close(4);
   }

   public void enableDisable( )
   {
   }

   public void gxload_28( short A3839CcoCod )
   {
      /* Using cursor T01QY8 */
      pr_default.execute(6, new Object[] {Boolean.valueOf(n3839CcoCod), Short.valueOf(A3839CcoCod)});
      if ( (pr_default.getStatus(6) == 101) )
      {
         if ( ! ( (0==A3839CcoCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CENTCO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CCOCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtCcoCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
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

   public void gxload_29( String A396EmprCod ,
                          int A129BarCod ,
                          byte A132BarCodReo ,
                          String A130BarCodPar )
   {
      /* Using cursor T01QY9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
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

   public void getKey1QY111( )
   {
      /* Using cursor T01QY10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A859CumCodCont)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound111 = (short)(1) ;
      }
      else
      {
         RcdFound111 = (short)(0) ;
      }
      pr_default.close(8);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01QY3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A859CumCodCont)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T01QY3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1QY111( 26) ;
         RcdFound111 = (short)(1) ;
         A859CumCodCont = T01QY3_A859CumCodCont[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A859CumCodCont", GXutil.ltrimstr( DecimalUtil.doubleToDec(A859CumCodCont), 8, 0));
         A862CumConFec = T01QY3_A862CumConFec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A862CumConFec", localUtil.format(A862CumConFec, "99/99/99"));
         A10777CumCCos = T01QY3_A10777CumCCos[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10777CumCCos", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10777CumCCos), 3, 0));
         A11368CumConTipo = T01QY3_A11368CumConTipo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11368CumConTipo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11368CumConTipo), 2, 0));
         A8925CC_AlmCd = T01QY3_A8925CC_AlmCd[0] ;
         n8925CC_AlmCd = T01QY3_n8925CC_AlmCd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8925CC_AlmCd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8925CC_AlmCd), 2, 0));
         A3839CcoCod = T01QY3_A3839CcoCod[0] ;
         n3839CcoCod = T01QY3_n3839CcoCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3839CcoCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3839CcoCod), 3, 0));
         A129BarCod = T01QY3_A129BarCod[0] ;
         A132BarCodReo = T01QY3_A132BarCodReo[0] ;
         A130BarCodPar = T01QY3_A130BarCodPar[0] ;
         Z396EmprCod = A396EmprCod ;
         Z859CumCodCont = A859CumCodCont ;
         sMode111 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1QY111( ) ;
         if ( AnyError == 1 )
         {
            RcdFound111 = (short)(0) ;
            initializeNonKey1QY111( ) ;
         }
         Gx_mode = sMode111 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound111 = (short)(0) ;
         initializeNonKey1QY111( ) ;
         sMode111 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode111 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1QY111( ) ;
      if ( RcdFound111 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound111 = (short)(0) ;
      /* Using cursor T01QY11 */
      pr_default.execute(9, new Object[] {Integer.valueOf(A859CumCodCont), A396EmprCod});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( ( T01QY11_A859CumCodCont[0] < A859CumCodCont ) ) && ( GXutil.strcmp(T01QY11_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( ( T01QY11_A859CumCodCont[0] > A859CumCodCont ) ) && ( GXutil.strcmp(T01QY11_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A859CumCodCont = T01QY11_A859CumCodCont[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A859CumCodCont", GXutil.ltrimstr( DecimalUtil.doubleToDec(A859CumCodCont), 8, 0));
            RcdFound111 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void move_previous( )
   {
      RcdFound111 = (short)(0) ;
      /* Using cursor T01QY12 */
      pr_default.execute(10, new Object[] {Integer.valueOf(A859CumCodCont), A396EmprCod});
      if ( (pr_default.getStatus(10) != 101) )
      {
         while ( (pr_default.getStatus(10) != 101) && ( ( T01QY12_A859CumCodCont[0] > A859CumCodCont ) ) && ( GXutil.strcmp(T01QY12_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(10);
         }
         if ( (pr_default.getStatus(10) != 101) && ( ( T01QY12_A859CumCodCont[0] < A859CumCodCont ) ) && ( GXutil.strcmp(T01QY12_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A859CumCodCont = T01QY12_A859CumCodCont[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A859CumCodCont", GXutil.ltrimstr( DecimalUtil.doubleToDec(A859CumCodCont), 8, 0));
            RcdFound111 = (short)(1) ;
         }
      }
      pr_default.close(10);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1QY111( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtCumCodCont_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1QY111( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound111 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A859CumCodCont != Z859CumCodCont ) )
            {
               A859CumCodCont = Z859CumCodCont ;
               httpContext.ajax_rsp_assign_attri("", false, "A859CumCodCont", GXutil.ltrimstr( DecimalUtil.doubleToDec(A859CumCodCont), 8, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtCumCodCont_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               update1QY111( ) ;
               GX_FocusControl = edtCumCodCont_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A859CumCodCont != Z859CumCodCont ) )
            {
               /* Insert record */
               GX_FocusControl = edtCumCodCont_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1QY111( ) ;
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
                  GX_FocusControl = edtCumCodCont_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1QY111( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A859CumCodCont != Z859CumCodCont ) )
      {
         A859CumCodCont = Z859CumCodCont ;
         httpContext.ajax_rsp_assign_attri("", false, "A859CumCodCont", GXutil.ltrimstr( DecimalUtil.doubleToDec(A859CumCodCont), 8, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtCumCodCont_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency1QY111( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01QY2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A859CumCodCont)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCCUMCO"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || !( GXutil.dateCompare(GXutil.resetTime(Z862CumConFec), GXutil.resetTime(T01QY2_A862CumConFec[0])) ) || ( Z10777CumCCos != T01QY2_A10777CumCCos[0] ) || ( Z11368CumConTipo != T01QY2_A11368CumConTipo[0] ) || ( Z8925CC_AlmCd != T01QY2_A8925CC_AlmCd[0] ) || ( Z3839CcoCod != T01QY2_A3839CcoCod[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z129BarCod != T01QY2_A129BarCod[0] ) || ( Z132BarCodReo != T01QY2_A132BarCodReo[0] ) || ( GXutil.strcmp(Z130BarCodPar, T01QY2_A130BarCodPar[0]) != 0 ) )
         {
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z862CumConFec), GXutil.resetTime(T01QY2_A862CumConFec[0])) ) )
            {
               GXutil.writeLogln("stocksquimicos.salidasmanualesproductos_cabecera:[seudo value changed for attri]"+"CumConFec");
               GXutil.writeLogRaw("Old: ",Z862CumConFec);
               GXutil.writeLogRaw("Current: ",T01QY2_A862CumConFec[0]);
            }
            if ( Z10777CumCCos != T01QY2_A10777CumCCos[0] )
            {
               GXutil.writeLogln("stocksquimicos.salidasmanualesproductos_cabecera:[seudo value changed for attri]"+"CumCCos");
               GXutil.writeLogRaw("Old: ",Z10777CumCCos);
               GXutil.writeLogRaw("Current: ",T01QY2_A10777CumCCos[0]);
            }
            if ( Z11368CumConTipo != T01QY2_A11368CumConTipo[0] )
            {
               GXutil.writeLogln("stocksquimicos.salidasmanualesproductos_cabecera:[seudo value changed for attri]"+"CumConTipo");
               GXutil.writeLogRaw("Old: ",Z11368CumConTipo);
               GXutil.writeLogRaw("Current: ",T01QY2_A11368CumConTipo[0]);
            }
            if ( Z8925CC_AlmCd != T01QY2_A8925CC_AlmCd[0] )
            {
               GXutil.writeLogln("stocksquimicos.salidasmanualesproductos_cabecera:[seudo value changed for attri]"+"CC_AlmCd");
               GXutil.writeLogRaw("Old: ",Z8925CC_AlmCd);
               GXutil.writeLogRaw("Current: ",T01QY2_A8925CC_AlmCd[0]);
            }
            if ( Z3839CcoCod != T01QY2_A3839CcoCod[0] )
            {
               GXutil.writeLogln("stocksquimicos.salidasmanualesproductos_cabecera:[seudo value changed for attri]"+"CcoCod");
               GXutil.writeLogRaw("Old: ",Z3839CcoCod);
               GXutil.writeLogRaw("Current: ",T01QY2_A3839CcoCod[0]);
            }
            if ( Z129BarCod != T01QY2_A129BarCod[0] )
            {
               GXutil.writeLogln("stocksquimicos.salidasmanualesproductos_cabecera:[seudo value changed for attri]"+"BarCod");
               GXutil.writeLogRaw("Old: ",Z129BarCod);
               GXutil.writeLogRaw("Current: ",T01QY2_A129BarCod[0]);
            }
            if ( Z132BarCodReo != T01QY2_A132BarCodReo[0] )
            {
               GXutil.writeLogln("stocksquimicos.salidasmanualesproductos_cabecera:[seudo value changed for attri]"+"BarCodReo");
               GXutil.writeLogRaw("Old: ",Z132BarCodReo);
               GXutil.writeLogRaw("Current: ",T01QY2_A132BarCodReo[0]);
            }
            if ( GXutil.strcmp(Z130BarCodPar, T01QY2_A130BarCodPar[0]) != 0 )
            {
               GXutil.writeLogln("stocksquimicos.salidasmanualesproductos_cabecera:[seudo value changed for attri]"+"BarCodPar");
               GXutil.writeLogRaw("Old: ",Z130BarCodPar);
               GXutil.writeLogRaw("Current: ",T01QY2_A130BarCodPar[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCCUMCO"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1QY111( )
   {
      beforeValidate1QY111( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1QY111( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1QY111( 0) ;
         checkOptimisticConcurrency1QY111( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1QY111( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1QY111( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01QY13 */
                  pr_default.execute(11, new Object[] {Integer.valueOf(A859CumCodCont), A862CumConFec, Short.valueOf(A10777CumCCos), Byte.valueOf(A11368CumConTipo), Boolean.valueOf(n8925CC_AlmCd), Byte.valueOf(A8925CC_AlmCd), A396EmprCod, Boolean.valueOf(n3839CcoCod), Short.valueOf(A3839CcoCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCUMCO");
                  if ( (pr_default.getStatus(11) == 1) )
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
                        resetCaption1QY0( ) ;
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
            load1QY111( ) ;
         }
         endLevel1QY111( ) ;
      }
      closeExtendedTableCursors1QY111( ) ;
   }

   public void update1QY111( )
   {
      beforeValidate1QY111( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1QY111( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1QY111( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1QY111( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1QY111( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01QY14 */
                  pr_default.execute(12, new Object[] {A862CumConFec, Short.valueOf(A10777CumCCos), Byte.valueOf(A11368CumConTipo), Boolean.valueOf(n8925CC_AlmCd), Byte.valueOf(A8925CC_AlmCd), Boolean.valueOf(n3839CcoCod), Short.valueOf(A3839CcoCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A396EmprCod, Integer.valueOf(A859CumCodCont)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCUMCO");
                  if ( (pr_default.getStatus(12) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCCUMCO"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1QY111( ) ;
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
         endLevel1QY111( ) ;
      }
      closeExtendedTableCursors1QY111( ) ;
   }

   public void deferredUpdate1QY111( )
   {
   }

   public void delete( )
   {
      beforeValidate1QY111( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1QY111( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1QY111( ) ;
         afterConfirm1QY111( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1QY111( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01QY15 */
               pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A859CumCodCont)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCUMCO");
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
      sMode111 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1QY111( ) ;
      Gx_mode = sMode111 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1QY111( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         GXt_char1 = A10778CumCCosD ;
         GXv_int6[0] = A10777CumCCos ;
         GXv_char4[0] = GXt_char1 ;
         new app.pccdsc(remoteHandle, context).execute( GXv_int6, GXv_char4) ;
         salidasmanualesproductos_cabecera_impl.this.A10777CumCCos = GXv_int6[0] ;
         salidasmanualesproductos_cabecera_impl.this.GXt_char1 = GXv_char4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10777CumCCos", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10777CumCCos), 3, 0));
         A10778CumCCosD = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "A10778CumCCosD", A10778CumCCosD);
         GXt_char1 = A8926CC_AlmDc ;
         GXv_char4[0] = A396EmprCod ;
         GXv_int7[0] = A8925CC_AlmCd ;
         GXv_char3[0] = GXt_char1 ;
         new app.pexialmc(remoteHandle, context).execute( GXv_char4, GXv_int7, GXv_char3) ;
         salidasmanualesproductos_cabecera_impl.this.A396EmprCod = GXv_char4[0] ;
         salidasmanualesproductos_cabecera_impl.this.A8925CC_AlmCd = GXv_int7[0] ;
         salidasmanualesproductos_cabecera_impl.this.GXt_char1 = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A8925CC_AlmCd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8925CC_AlmCd), 2, 0));
         A8926CC_AlmDc = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "A8926CC_AlmDc", A8926CC_AlmDc);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T01QY16 */
         pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A859CumCodCont)});
         if ( (pr_default.getStatus(14) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TXPLCUMCO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(14);
      }
   }

   public void endLevel1QY111( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1QY111( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "stocksquimicos.salidasmanualesproductos_cabecera");
         if ( AnyError == 0 )
         {
            confirmValues1QY0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "stocksquimicos.salidasmanualesproductos_cabecera");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1QY111( )
   {
      /* Scan By routine */
      /* Using cursor T01QY17 */
      pr_default.execute(15, new Object[] {A396EmprCod});
      RcdFound111 = (short)(0) ;
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound111 = (short)(1) ;
         A859CumCodCont = T01QY17_A859CumCodCont[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A859CumCodCont", GXutil.ltrimstr( DecimalUtil.doubleToDec(A859CumCodCont), 8, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1QY111( )
   {
      /* Scan next routine */
      pr_default.readNext(15);
      RcdFound111 = (short)(0) ;
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound111 = (short)(1) ;
         A859CumCodCont = T01QY17_A859CumCodCont[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A859CumCodCont", GXutil.ltrimstr( DecimalUtil.doubleToDec(A859CumCodCont), 8, 0));
      }
   }

   public void scanEnd1QY111( )
   {
      pr_default.close(15);
   }

   public void afterConfirm1QY111( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1QY111( )
   {
      /* Before Insert Rules */
      if ( (0==A10777CumCCos) )
      {
         A10777CumCCos = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A10777CumCCos", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10777CumCCos), 3, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A10777CumCCos", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10777CumCCos), 3, 0));
      }
      if ( (0==A8925CC_AlmCd) )
      {
         A8925CC_AlmCd = (byte)(0) ;
         n8925CC_AlmCd = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A8925CC_AlmCd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8925CC_AlmCd), 2, 0));
         n8925CC_AlmCd = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A8925CC_AlmCd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8925CC_AlmCd), 2, 0));
      }
      if ( (0==A859CumCodCont) && ( GXutil.strcmp(Gx_mode, "INS") == 0 ) )
      {
         GXv_int8[0] = A859CumCodCont ;
         new app.pnumdoc(remoteHandle, context).execute( A396EmprCod, "111111", GXv_int8) ;
         salidasmanualesproductos_cabecera_impl.this.A859CumCodCont = GXv_int8[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A859CumCodCont", GXutil.ltrimstr( DecimalUtil.doubleToDec(A859CumCodCont), 8, 0));
      }
   }

   public void beforeUpdate1QY111( )
   {
      /* Before Update Rules */
      if ( (0==A10777CumCCos) )
      {
         A10777CumCCos = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A10777CumCCos", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10777CumCCos), 3, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A10777CumCCos", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10777CumCCos), 3, 0));
      }
      if ( (0==A8925CC_AlmCd) )
      {
         A8925CC_AlmCd = (byte)(0) ;
         n8925CC_AlmCd = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A8925CC_AlmCd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8925CC_AlmCd), 2, 0));
         n8925CC_AlmCd = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A8925CC_AlmCd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8925CC_AlmCd), 2, 0));
      }
   }

   public void beforeDelete1QY111( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1QY111( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1QY111( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1QY111( )
   {
      edtCumCodCont_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCumCodCont_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCumCodCont_Enabled), 5, 0), true);
      edtCumConFec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCumConFec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCumConFec_Enabled), 5, 0), true);
      edtCumCCos_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCumCCos_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCumCCos_Enabled), 5, 0), true);
      edtCumCCosD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCumCCosD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCumCCosD_Enabled), 5, 0), true);
      edtCumConTipo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCumConTipo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCumConTipo_Enabled), 5, 0), true);
      edtCC_AlmCd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCC_AlmCd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCC_AlmCd_Enabled), 5, 0), true);
      edtCC_AlmDc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCC_AlmDc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCC_AlmDc_Enabled), 5, 0), true);
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtCcoCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCcoCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCcoCod_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1QY111( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1QY0( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.stocksquimicos.salidasmanualesproductos_cabecera", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV7EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV8CumCodCont,8,0))}, new String[] {"Gx_mode","EmprCod","CumCodCont"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"SalidasManualesProductos_Cabecera");
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("stocksquimicos\\salidasmanualesproductos_cabecera:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z859CumCodCont", GXutil.ltrim( localUtil.ntoc( Z859CumCodCont, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z862CumConFec", localUtil.dtoc( Z862CumConFec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10777CumCCos", GXutil.ltrim( localUtil.ntoc( Z10777CumCCos, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11368CumConTipo", GXutil.ltrim( localUtil.ntoc( Z11368CumConTipo, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8925CC_AlmCd", GXutil.ltrim( localUtil.ntoc( Z8925CC_AlmCd, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3839CcoCod", GXutil.ltrim( localUtil.ntoc( Z3839CcoCod, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z129BarCod", GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z132BarCodReo", GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z130BarCodPar", GXutil.rtrim( Z130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "N3839CcoCod", GXutil.ltrim( localUtil.ntoc( A3839CcoCod, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "N129BarCod", GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "N132BarCodReo", GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "N130BarCodPar", GXutil.rtrim( A130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTRNCONTEXT", AV10TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTRNCONTEXT", AV10TrnContext);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTRNCONTEXT", getSecureSignedToken( "", AV10TrnContext));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV7EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vCUMCODCONT", GXutil.ltrim( localUtil.ntoc( AV8CumCodCont, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCUMCODCONT", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV8CumCodCont), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_CCOCOD", GXutil.ltrim( localUtil.ntoc( AV12Insert_CcoCod, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_BARCOD", GXutil.ltrim( localUtil.ntoc( AV17Insert_BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCOD", GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_BARCODREO", GXutil.ltrim( localUtil.ntoc( AV18Insert_BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCODREO", GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_BARCODPAR", GXutil.rtrim( AV19Insert_BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCODPAR", GXutil.rtrim( A130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV21Pgmname));
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
      return formatLink("app.stocksquimicos.salidasmanualesproductos_cabecera", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV7EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV8CumCodCont,8,0))}, new String[] {"Gx_mode","EmprCod","CumCodCont"})  ;
   }

   public String getPgmname( )
   {
      return "StocksQuimicos.SalidasManualesProductos_Cabecera" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Salidas Manuales Productos_Cabecera", "") ;
   }

   public void initializeNonKey1QY111( )
   {
      A3839CcoCod = (short)(0) ;
      n3839CcoCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3839CcoCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3839CcoCod), 3, 0));
      A129BarCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
      A132BarCodReo = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
      A130BarCodPar = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      A10778CumCCosD = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A10778CumCCosD", A10778CumCCosD);
      A8926CC_AlmDc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A8926CC_AlmDc", A8926CC_AlmDc);
      A10777CumCCos = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A10777CumCCos", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10777CumCCos), 3, 0));
      A8925CC_AlmCd = (byte)(0) ;
      n8925CC_AlmCd = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8925CC_AlmCd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8925CC_AlmCd), 2, 0));
      A862CumConFec = GXutil.serverDate( context, remoteHandle, pr_default) ;
      httpContext.ajax_rsp_assign_attri("", false, "A862CumConFec", localUtil.format(A862CumConFec, "99/99/99"));
      A11368CumConTipo = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A11368CumConTipo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11368CumConTipo), 2, 0));
      Z862CumConFec = GXutil.nullDate() ;
      Z10777CumCCos = (short)(0) ;
      Z11368CumConTipo = (byte)(0) ;
      Z8925CC_AlmCd = (byte)(0) ;
      Z3839CcoCod = (short)(0) ;
      Z129BarCod = 0 ;
      Z132BarCodReo = (byte)(0) ;
      Z130BarCodPar = "" ;
   }

   public void initAll1QY111( )
   {
      A859CumCodCont = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A859CumCodCont", GXutil.ltrimstr( DecimalUtil.doubleToDec(A859CumCodCont), 8, 0));
      initializeNonKey1QY111( ) ;
   }

   public void standaloneModalInsert( )
   {
      A862CumConFec = i862CumConFec ;
      httpContext.ajax_rsp_assign_attri("", false, "A862CumConFec", localUtil.format(A862CumConFec, "99/99/99"));
      A11368CumConTipo = i11368CumConTipo ;
      httpContext.ajax_rsp_assign_attri("", false, "A11368CumConTipo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11368CumConTipo), 2, 0));
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211691075", true, true);
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
      httpContext.AddJavascriptSource("stocksquimicos/salidasmanualesproductos_cabecera.js", "?20268211691076", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      edtCumCodCont_Internalname = "CUMCODCONT" ;
      edtCumConFec_Internalname = "CUMCONFEC" ;
      edtCumCCos_Internalname = "CUMCCOS" ;
      edtCumCCosD_Internalname = "CUMCCOSD" ;
      edtCumConTipo_Internalname = "CUMCONTIPO" ;
      edtCC_AlmCd_Internalname = "CC_ALMCD" ;
      edtCC_AlmDc_Internalname = "CC_ALMDC" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      bttBtntrn_delete_Internalname = "BTNTRN_DELETE" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtEmprCod_Internalname = "EMPRCOD" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      edtCcoCod_Internalname = "CCOCOD" ;
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
      Form.setCaption( httpContext.getMessage( "Salidas Manuales Productos_Cabecera", "") );
      edtCcoCod_Jsonclick = "" ;
      edtCcoCod_Enabled = 1 ;
      edtCcoCod_Visible = 1 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Enabled = 0 ;
      edtEmprNom_Visible = 1 ;
      edtEmprCod_Jsonclick = "" ;
      edtEmprCod_Enabled = 0 ;
      edtEmprCod_Visible = 1 ;
      bttBtntrn_delete_Enabled = 0 ;
      bttBtntrn_delete_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      edtCC_AlmDc_Jsonclick = "" ;
      edtCC_AlmDc_Enabled = 0 ;
      edtCC_AlmCd_Jsonclick = "" ;
      edtCC_AlmCd_Enabled = 1 ;
      edtCumConTipo_Jsonclick = "" ;
      edtCumConTipo_Enabled = 1 ;
      edtCumCCosD_Jsonclick = "" ;
      edtCumCCosD_Enabled = 0 ;
      edtCumCCos_Jsonclick = "" ;
      edtCumCCos_Enabled = 1 ;
      edtCumConFec_Jsonclick = "" ;
      edtCumConFec_Enabled = 1 ;
      edtCumCodCont_Jsonclick = "" ;
      edtCumCodCont_Enabled = 1 ;
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

   public void gx3asacc_almdc1QY111( String A396EmprCod ,
                                     byte A8925CC_AlmCd )
   {
      GXt_char1 = A8926CC_AlmDc ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int7[0] = A8925CC_AlmCd ;
      GXv_char3[0] = GXt_char1 ;
      new app.pexialmc(remoteHandle, context).execute( GXv_char4, GXv_int7, GXv_char3) ;
      salidasmanualesproductos_cabecera_impl.this.A396EmprCod = GXv_char4[0] ;
      salidasmanualesproductos_cabecera_impl.this.A8925CC_AlmCd = GXv_int7[0] ;
      salidasmanualesproductos_cabecera_impl.this.GXt_char1 = GXv_char3[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A8925CC_AlmCd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8925CC_AlmCd), 2, 0));
      A8926CC_AlmDc = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A8926CC_AlmDc", A8926CC_AlmDc);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A8926CC_AlmDc))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gx4asacumccosd1QY111( short A10777CumCCos )
   {
      GXt_char1 = A10778CumCCosD ;
      GXv_int6[0] = A10777CumCCos ;
      GXv_char4[0] = GXt_char1 ;
      new app.pccdsc(remoteHandle, context).execute( GXv_int6, GXv_char4) ;
      salidasmanualesproductos_cabecera_impl.this.A10777CumCCos = GXv_int6[0] ;
      salidasmanualesproductos_cabecera_impl.this.GXt_char1 = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A10777CumCCos", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10777CumCCos), 3, 0));
      A10778CumCCosD = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A10778CumCCosD", A10778CumCCosD);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A10778CumCCosD))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_24_1QY111( String A396EmprCod ,
                             int A859CumCodCont ,
                             String Gx_mode )
   {
      if ( (0==A859CumCodCont) && ( GXutil.strcmp(Gx_mode, "INS") == 0 ) )
      {
         GXv_int8[0] = A859CumCodCont ;
         new app.pnumdoc(remoteHandle, context).execute( A396EmprCod, "111111", GXv_int8) ;
         A859CumCodCont = GXv_int8[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A859CumCodCont", GXutil.ltrimstr( DecimalUtil.doubleToDec(A859CumCodCont), 8, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A859CumCodCont, (byte)(8), (byte)(0), ".", "")))+"\"") ;
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

   public void valid_Cumccos( )
   {
      n3839CcoCod = false ;
      GXt_char1 = A10778CumCCosD ;
      GXv_int6[0] = A10777CumCCos ;
      GXv_char4[0] = GXt_char1 ;
      new app.pccdsc(remoteHandle, context).execute( GXv_int6, GXv_char4) ;
      salidasmanualesproductos_cabecera_impl.this.A10777CumCCos = GXv_int6[0] ;
      salidasmanualesproductos_cabecera_impl.this.GXt_char1 = GXv_char4[0] ;
      A10778CumCCosD = GXt_char1 ;
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV12Insert_CcoCod) )
      {
         A3839CcoCod = AV12Insert_CcoCod ;
         n3839CcoCod = false ;
      }
      else
      {
         A3839CcoCod = A10777CumCCos ;
         n3839CcoCod = false ;
      }
      if ( ( A10777CumCCos > 0 ) && ( GXutil.strcmp(A10778CumCCosD, httpContext.getMessage( "Error", "")) == 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "No Existe Centro Coste", ""), 1, "CUMCCOS");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCumCCos_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A10778CumCCosD", GXutil.rtrim( A10778CumCCosD));
      httpContext.ajax_rsp_assign_attri("", false, "A3839CcoCod", GXutil.ltrim( localUtil.ntoc( A3839CcoCod, (byte)(3), (byte)(0), ".", "")));
   }

   public void valid_Cc_almcd( )
   {
      n8925CC_AlmCd = false ;
      GXt_char1 = A8926CC_AlmDc ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int7[0] = A8925CC_AlmCd ;
      GXv_char3[0] = GXt_char1 ;
      new app.pexialmc(remoteHandle, context).execute( GXv_char4, GXv_int7, GXv_char3) ;
      salidasmanualesproductos_cabecera_impl.this.A396EmprCod = GXv_char4[0] ;
      salidasmanualesproductos_cabecera_impl.this.A8925CC_AlmCd = GXv_int7[0] ;
      salidasmanualesproductos_cabecera_impl.this.GXt_char1 = GXv_char3[0] ;
      A8926CC_AlmDc = GXt_char1 ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A8926CC_AlmDc", GXutil.rtrim( A8926CC_AlmDc));
   }

   public void valid_Ccocod( )
   {
      n3839CcoCod = false ;
      /* Using cursor T01QY18 */
      pr_default.execute(16, new Object[] {Boolean.valueOf(n3839CcoCod), Short.valueOf(A3839CcoCod)});
      if ( (pr_default.getStatus(16) == 101) )
      {
         if ( ! ( (0==A3839CcoCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CENTCO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CCOCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtCcoCod_Internalname ;
         }
      }
      pr_default.close(16);
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV8CumCodCont',fld:'vCUMCODCONT',pic:'ZZZZZZZ9',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV10TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV8CumCodCont',fld:'vCUMCODCONT',pic:'ZZZZZZZ9',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e121QY2',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV10TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true}]");
      setEventMetadata("AFTER TRN",",oparms:[]}");
      setEventMetadata("VALID_CUMCODCONT","{handler:'valid_Cumcodcont',iparms:[]");
      setEventMetadata("VALID_CUMCODCONT",",oparms:[]}");
      setEventMetadata("VALID_CUMCCOS","{handler:'valid_Cumccos',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'A10777CumCCos',fld:'CUMCCOS',pic:'ZZ9'},{av:'AV12Insert_CcoCod',fld:'vINSERT_CCOCOD',pic:'ZZ9'},{av:'A10778CumCCosD',fld:'CUMCCOSD',pic:''},{av:'A3839CcoCod',fld:'CCOCOD',pic:'ZZ9'}]");
      setEventMetadata("VALID_CUMCCOS",",oparms:[{av:'A10778CumCCosD',fld:'CUMCCOSD',pic:''},{av:'A3839CcoCod',fld:'CCOCOD',pic:'ZZ9'}]}");
      setEventMetadata("VALID_CC_ALMCD","{handler:'valid_Cc_almcd',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A8925CC_AlmCd',fld:'CC_ALMCD',pic:'Z9'},{av:'A8926CC_AlmDc',fld:'CC_ALMDC',pic:''}]");
      setEventMetadata("VALID_CC_ALMCD",",oparms:[{av:'A8926CC_AlmDc',fld:'CC_ALMDC',pic:''}]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_CCOCOD","{handler:'valid_Ccocod',iparms:[{av:'A3839CcoCod',fld:'CCOCOD',pic:'ZZ9'}]");
      setEventMetadata("VALID_CCOCOD",",oparms:[]}");
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
      pr_default.close(16);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      wcpOAV7EmprCod = "" ;
      Z396EmprCod = "" ;
      Z862CumConFec = GXutil.nullDate() ;
      Z130BarCodPar = "" ;
      N130BarCodPar = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      Gx_mode = "" ;
      A130BarCodPar = "" ;
      AV7EmprCod = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      A862CumConFec = GXutil.nullDate() ;
      A10778CumCCosD = "" ;
      A8926CC_AlmDc = "" ;
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      A407EmprNom = "" ;
      AV19Insert_BarCodPar = "" ;
      AV21Pgmname = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode111 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      AV14Station = "" ;
      AV15EmprNom = "" ;
      AV16UsurCod = "" ;
      GXv_char2 = new String[1] ;
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext5 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV10TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV11WebSession = httpContext.getWebSession();
      AV13TrnContextAtt = new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      Z407EmprNom = "" ;
      T01QY4_A407EmprNom = new String[] {""} ;
      T01QY4_n407EmprNom = new boolean[] {false} ;
      T01QY7_A859CumCodCont = new int[1] ;
      T01QY7_A407EmprNom = new String[] {""} ;
      T01QY7_n407EmprNom = new boolean[] {false} ;
      T01QY7_A862CumConFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01QY7_A10777CumCCos = new short[1] ;
      T01QY7_A11368CumConTipo = new byte[1] ;
      T01QY7_A8925CC_AlmCd = new byte[1] ;
      T01QY7_n8925CC_AlmCd = new boolean[] {false} ;
      T01QY7_A396EmprCod = new String[] {""} ;
      T01QY7_A3839CcoCod = new short[1] ;
      T01QY7_n3839CcoCod = new boolean[] {false} ;
      T01QY7_A129BarCod = new int[1] ;
      T01QY7_A132BarCodReo = new byte[1] ;
      T01QY7_A130BarCodPar = new String[] {""} ;
      T01QY5_A3839CcoCod = new short[1] ;
      T01QY5_n3839CcoCod = new boolean[] {false} ;
      T01QY6_A396EmprCod = new String[] {""} ;
      T01QY8_A3839CcoCod = new short[1] ;
      T01QY8_n3839CcoCod = new boolean[] {false} ;
      T01QY9_A396EmprCod = new String[] {""} ;
      T01QY10_A396EmprCod = new String[] {""} ;
      T01QY10_A859CumCodCont = new int[1] ;
      T01QY3_A859CumCodCont = new int[1] ;
      T01QY3_A862CumConFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01QY3_A10777CumCCos = new short[1] ;
      T01QY3_A11368CumConTipo = new byte[1] ;
      T01QY3_A8925CC_AlmCd = new byte[1] ;
      T01QY3_n8925CC_AlmCd = new boolean[] {false} ;
      T01QY3_A396EmprCod = new String[] {""} ;
      T01QY3_A3839CcoCod = new short[1] ;
      T01QY3_n3839CcoCod = new boolean[] {false} ;
      T01QY3_A129BarCod = new int[1] ;
      T01QY3_A132BarCodReo = new byte[1] ;
      T01QY3_A130BarCodPar = new String[] {""} ;
      T01QY11_A396EmprCod = new String[] {""} ;
      T01QY11_A859CumCodCont = new int[1] ;
      T01QY12_A396EmprCod = new String[] {""} ;
      T01QY12_A859CumCodCont = new int[1] ;
      T01QY2_A859CumCodCont = new int[1] ;
      T01QY2_A862CumConFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01QY2_A10777CumCCos = new short[1] ;
      T01QY2_A11368CumConTipo = new byte[1] ;
      T01QY2_A8925CC_AlmCd = new byte[1] ;
      T01QY2_n8925CC_AlmCd = new boolean[] {false} ;
      T01QY2_A396EmprCod = new String[] {""} ;
      T01QY2_A3839CcoCod = new short[1] ;
      T01QY2_n3839CcoCod = new boolean[] {false} ;
      T01QY2_A129BarCod = new int[1] ;
      T01QY2_A132BarCodReo = new byte[1] ;
      T01QY2_A130BarCodPar = new String[] {""} ;
      T01QY16_A396EmprCod = new String[] {""} ;
      T01QY16_A859CumCodCont = new int[1] ;
      T01QY16_A719PrdNum = new String[] {""} ;
      T01QY17_A396EmprCod = new String[] {""} ;
      T01QY17_A859CumCodCont = new int[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      i862CumConFec = GXutil.nullDate() ;
      GXv_int8 = new int[1] ;
      GXv_int6 = new short[1] ;
      Z10778CumCCosD = "" ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      GXv_int7 = new byte[1] ;
      GXv_char3 = new String[1] ;
      Z8926CC_AlmDc = "" ;
      T01QY18_A3839CcoCod = new short[1] ;
      T01QY18_n3839CcoCod = new boolean[] {false} ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.salidasmanualesproductos_cabecera__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.salidasmanualesproductos_cabecera__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.salidasmanualesproductos_cabecera__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.salidasmanualesproductos_cabecera__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.salidasmanualesproductos_cabecera__default(),
         new Object[] {
             new Object[] {
            T01QY2_A859CumCodCont, T01QY2_A862CumConFec, T01QY2_A10777CumCCos, T01QY2_A11368CumConTipo, T01QY2_A8925CC_AlmCd, T01QY2_n8925CC_AlmCd, T01QY2_A396EmprCod, T01QY2_A3839CcoCod, T01QY2_n3839CcoCod, T01QY2_A129BarCod,
            T01QY2_A132BarCodReo, T01QY2_A130BarCodPar
            }
            , new Object[] {
            T01QY3_A859CumCodCont, T01QY3_A862CumConFec, T01QY3_A10777CumCCos, T01QY3_A11368CumConTipo, T01QY3_A8925CC_AlmCd, T01QY3_n8925CC_AlmCd, T01QY3_A396EmprCod, T01QY3_A3839CcoCod, T01QY3_n3839CcoCod, T01QY3_A129BarCod,
            T01QY3_A132BarCodReo, T01QY3_A130BarCodPar
            }
            , new Object[] {
            T01QY4_A407EmprNom, T01QY4_n407EmprNom
            }
            , new Object[] {
            T01QY5_A3839CcoCod
            }
            , new Object[] {
            T01QY6_A396EmprCod
            }
            , new Object[] {
            T01QY7_A859CumCodCont, T01QY7_A407EmprNom, T01QY7_n407EmprNom, T01QY7_A862CumConFec, T01QY7_A10777CumCCos, T01QY7_A11368CumConTipo, T01QY7_A8925CC_AlmCd, T01QY7_n8925CC_AlmCd, T01QY7_A396EmprCod, T01QY7_A3839CcoCod,
            T01QY7_n3839CcoCod, T01QY7_A129BarCod, T01QY7_A132BarCodReo, T01QY7_A130BarCodPar
            }
            , new Object[] {
            T01QY8_A3839CcoCod
            }
            , new Object[] {
            T01QY9_A396EmprCod
            }
            , new Object[] {
            T01QY10_A396EmprCod, T01QY10_A859CumCodCont
            }
            , new Object[] {
            T01QY11_A396EmprCod, T01QY11_A859CumCodCont
            }
            , new Object[] {
            T01QY12_A396EmprCod, T01QY12_A859CumCodCont
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01QY16_A396EmprCod, T01QY16_A859CumCodCont, T01QY16_A719PrdNum
            }
            , new Object[] {
            T01QY17_A396EmprCod, T01QY17_A859CumCodCont
            }
            , new Object[] {
            T01QY18_A3839CcoCod
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV21Pgmname = "StocksQuimicos.SalidasManualesProductos_Cabecera" ;
      Z11368CumConTipo = (byte)(0) ;
      A11368CumConTipo = (byte)(0) ;
      i11368CumConTipo = (byte)(0) ;
      Z862CumConFec = GXutil.serverDate( context, remoteHandle, pr_default) ;
      A862CumConFec = GXutil.serverDate( context, remoteHandle, pr_default) ;
      i862CumConFec = GXutil.serverDate( context, remoteHandle, pr_default) ;
   }

   private byte Z11368CumConTipo ;
   private byte Z8925CC_AlmCd ;
   private byte Z132BarCodReo ;
   private byte N132BarCodReo ;
   private byte GxWebError ;
   private byte A8925CC_AlmCd ;
   private byte A132BarCodReo ;
   private byte nKeyPressed ;
   private byte A11368CumConTipo ;
   private byte AV18Insert_BarCodReo ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private byte i11368CumConTipo ;
   private byte GXv_int7[] ;
   private short Z10777CumCCos ;
   private short Z3839CcoCod ;
   private short N3839CcoCod ;
   private short A10777CumCCos ;
   private short A3839CcoCod ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short AV12Insert_CcoCod ;
   private short RcdFound111 ;
   private short nIsDirty_111 ;
   private short GXv_int6[] ;
   private int wcpOAV8CumCodCont ;
   private int Z859CumCodCont ;
   private int Z129BarCod ;
   private int N129BarCod ;
   private int A859CumCodCont ;
   private int A129BarCod ;
   private int AV8CumCodCont ;
   private int trnEnded ;
   private int edtCumCodCont_Enabled ;
   private int edtCumConFec_Enabled ;
   private int edtCumCCos_Enabled ;
   private int edtCumCCosD_Enabled ;
   private int edtCumConTipo_Enabled ;
   private int edtCC_AlmCd_Enabled ;
   private int edtCC_AlmDc_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int edtEmprCod_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Visible ;
   private int edtEmprNom_Enabled ;
   private int edtCcoCod_Visible ;
   private int edtCcoCod_Enabled ;
   private int AV17Insert_BarCod ;
   private int AV22GXV1 ;
   private int GX_JID ;
   private int idxLst ;
   private int GXv_int8[] ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV7EmprCod ;
   private String Z396EmprCod ;
   private String Z130BarCodPar ;
   private String N130BarCodPar ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String Gx_mode ;
   private String A130BarCodPar ;
   private String AV7EmprCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtCumCodCont_Internalname ;
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
   private String edtCumCodCont_Jsonclick ;
   private String edtCumConFec_Internalname ;
   private String edtCumConFec_Jsonclick ;
   private String edtCumCCos_Internalname ;
   private String edtCumCCos_Jsonclick ;
   private String edtCumCCosD_Internalname ;
   private String A10778CumCCosD ;
   private String edtCumCCosD_Jsonclick ;
   private String edtCumConTipo_Internalname ;
   private String edtCumConTipo_Jsonclick ;
   private String edtCC_AlmCd_Internalname ;
   private String edtCC_AlmCd_Jsonclick ;
   private String edtCC_AlmDc_Internalname ;
   private String A8926CC_AlmDc ;
   private String edtCC_AlmDc_Jsonclick ;
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
   private String edtCcoCod_Internalname ;
   private String edtCcoCod_Jsonclick ;
   private String AV19Insert_BarCodPar ;
   private String AV21Pgmname ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String hsh ;
   private String sMode111 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String AV14Station ;
   private String AV15EmprNom ;
   private String AV16UsurCod ;
   private String GXv_char2[] ;
   private String Z407EmprNom ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String Z10778CumCCosD ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String Z8926CC_AlmDc ;
   private java.util.Date Z862CumConFec ;
   private java.util.Date A862CumConFec ;
   private java.util.Date i862CumConFec ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n8925CC_AlmCd ;
   private boolean n3839CcoCod ;
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
   private boolean n407EmprNom ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private com.genexus.webpanels.WebSession AV11WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private String[] T01QY4_A407EmprNom ;
   private boolean[] T01QY4_n407EmprNom ;
   private int[] T01QY7_A859CumCodCont ;
   private String[] T01QY7_A407EmprNom ;
   private boolean[] T01QY7_n407EmprNom ;
   private java.util.Date[] T01QY7_A862CumConFec ;
   private short[] T01QY7_A10777CumCCos ;
   private byte[] T01QY7_A11368CumConTipo ;
   private byte[] T01QY7_A8925CC_AlmCd ;
   private boolean[] T01QY7_n8925CC_AlmCd ;
   private String[] T01QY7_A396EmprCod ;
   private short[] T01QY7_A3839CcoCod ;
   private boolean[] T01QY7_n3839CcoCod ;
   private int[] T01QY7_A129BarCod ;
   private byte[] T01QY7_A132BarCodReo ;
   private String[] T01QY7_A130BarCodPar ;
   private short[] T01QY5_A3839CcoCod ;
   private boolean[] T01QY5_n3839CcoCod ;
   private String[] T01QY6_A396EmprCod ;
   private short[] T01QY8_A3839CcoCod ;
   private boolean[] T01QY8_n3839CcoCod ;
   private String[] T01QY9_A396EmprCod ;
   private String[] T01QY10_A396EmprCod ;
   private int[] T01QY10_A859CumCodCont ;
   private int[] T01QY3_A859CumCodCont ;
   private java.util.Date[] T01QY3_A862CumConFec ;
   private short[] T01QY3_A10777CumCCos ;
   private byte[] T01QY3_A11368CumConTipo ;
   private byte[] T01QY3_A8925CC_AlmCd ;
   private boolean[] T01QY3_n8925CC_AlmCd ;
   private String[] T01QY3_A396EmprCod ;
   private short[] T01QY3_A3839CcoCod ;
   private boolean[] T01QY3_n3839CcoCod ;
   private int[] T01QY3_A129BarCod ;
   private byte[] T01QY3_A132BarCodReo ;
   private String[] T01QY3_A130BarCodPar ;
   private String[] T01QY11_A396EmprCod ;
   private int[] T01QY11_A859CumCodCont ;
   private String[] T01QY12_A396EmprCod ;
   private int[] T01QY12_A859CumCodCont ;
   private int[] T01QY2_A859CumCodCont ;
   private java.util.Date[] T01QY2_A862CumConFec ;
   private short[] T01QY2_A10777CumCCos ;
   private byte[] T01QY2_A11368CumConTipo ;
   private byte[] T01QY2_A8925CC_AlmCd ;
   private boolean[] T01QY2_n8925CC_AlmCd ;
   private String[] T01QY2_A396EmprCod ;
   private short[] T01QY2_A3839CcoCod ;
   private boolean[] T01QY2_n3839CcoCod ;
   private int[] T01QY2_A129BarCod ;
   private byte[] T01QY2_A132BarCodReo ;
   private String[] T01QY2_A130BarCodPar ;
   private String[] T01QY16_A396EmprCod ;
   private int[] T01QY16_A859CumCodCont ;
   private String[] T01QY16_A719PrdNum ;
   private String[] T01QY17_A396EmprCod ;
   private int[] T01QY17_A859CumCodCont ;
   private short[] T01QY18_A3839CcoCod ;
   private boolean[] T01QY18_n3839CcoCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext5[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV10TrnContext ;
   private app.wwpbaseobjects.SdtWWPTransactionContext_Attribute AV13TrnContextAtt ;
}

final  class salidasmanualesproductos_cabecera__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class salidasmanualesproductos_cabecera__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class salidasmanualesproductos_cabecera__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class salidasmanualesproductos_cabecera__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class salidasmanualesproductos_cabecera__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01QY2", "SELECT CumCodCont, CumConFec, CumCCos, CumConTipo, CC_AlmCd, EmprCod, CcoCod, BarCod, BarCodReo, BarCodPar FROM TXPCCUMCO WHERE EmprCod = ? AND CumCodCont = ?  FOR UPDATE OF CumConFec, CumCCos, CumConTipo, CC_AlmCd, CcoCod, BarCod, BarCodReo, BarCodPar NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QY3", "SELECT CumCodCont, CumConFec, CumCCos, CumConTipo, CC_AlmCd, EmprCod, CcoCod, BarCod, BarCodReo, BarCodPar FROM TXPCCUMCO WHERE EmprCod = ? AND CumCodCont = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QY4", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QY5", "SELECT CcoCod FROM TXPCENTCO WHERE CcoCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QY6", "SELECT EmprCod FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QY7", "SELECT /*+ FIRST_ROWS(100) */ TM1.CumCodCont, T2.EmprNom, TM1.CumConFec, TM1.CumCCos, TM1.CumConTipo, TM1.CC_AlmCd, TM1.EmprCod, TM1.CcoCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar FROM (TXPCCUMCO TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.CumCodCont = ? ORDER BY TM1.EmprCod, TM1.CumCodCont ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QY8", "SELECT CcoCod FROM TXPCENTCO WHERE CcoCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QY9", "SELECT EmprCod FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QY10", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, CumCodCont FROM TXPCCUMCO WHERE EmprCod = ? AND CumCodCont = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QY11", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CumCodCont FROM TXPCCUMCO WHERE ( CumCodCont > ?) and EmprCod = ? ORDER BY EmprCod, CumCodCont) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01QY12", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CumCodCont FROM TXPCCUMCO WHERE ( CumCodCont < ?) and EmprCod = ? ORDER BY EmprCod DESC, CumCodCont DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01QY13", "INSERT INTO TXPCCUMCO(CumCodCont, CumConFec, CumCCos, CumConTipo, CC_AlmCd, EmprCod, CcoCod, BarCod, BarCodReo, BarCodPar) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPCCUMCO")
         ,new UpdateCursor("T01QY14", "UPDATE TXPCCUMCO SET CumConFec=?, CumCCos=?, CumConTipo=?, CC_AlmCd=?, CcoCod=?, BarCod=?, BarCodReo=?, BarCodPar=?  WHERE EmprCod = ? AND CumCodCont = ?", GX_NOMASK, "TXPCCUMCO")
         ,new UpdateCursor("T01QY15", "DELETE FROM TXPCCUMCO  WHERE EmprCod = ? AND CumCodCont = ?", GX_NOMASK, "TXPCCUMCO")
         ,new ForEachCursor("T01QY16", "SELECT * FROM (SELECT EmprCod, CumCodCont, PrdNum FROM TXPLCUMCO WHERE EmprCod = ? AND CumCodCont = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01QY17", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, CumCodCont FROM TXPCCUMCO WHERE EmprCod = ? ORDER BY EmprCod, CumCodCont ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QY18", "SELECT CcoCod FROM TXPCENTCO WHERE CcoCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 3);
               ((short[]) buf[7])[0] = rslt.getShort(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(8);
               ((byte[]) buf[10])[0] = rslt.getByte(9);
               ((String[]) buf[11])[0] = rslt.getString(10, 1);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 3);
               ((short[]) buf[7])[0] = rslt.getShort(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(8);
               ((byte[]) buf[10])[0] = rslt.getByte(9);
               ((String[]) buf[11])[0] = rslt.getString(10, 1);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 5 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(3);
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((byte[]) buf[5])[0] = rslt.getByte(5);
               ((byte[]) buf[6])[0] = rslt.getByte(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(7, 3);
               ((short[]) buf[9])[0] = rslt.getShort(8);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(9);
               ((byte[]) buf[12])[0] = rslt.getByte(10);
               ((String[]) buf[13])[0] = rslt.getString(11, 1);
               return;
            case 6 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 16 :
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 3 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 6 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 9 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 10 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 11 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(5, ((Number) parms[5]).byteValue());
               }
               stmt.setString(6, (String)parms[6], 3);
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(7, ((Number) parms[8]).shortValue());
               }
               stmt.setInt(8, ((Number) parms[9]).intValue());
               stmt.setByte(9, ((Number) parms[10]).byteValue());
               stmt.setString(10, (String)parms[11], 1);
               return;
            case 12 :
               stmt.setDate(1, (java.util.Date)parms[0]);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(4, ((Number) parms[4]).byteValue());
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(5, ((Number) parms[6]).shortValue());
               }
               stmt.setInt(6, ((Number) parms[7]).intValue());
               stmt.setByte(7, ((Number) parms[8]).byteValue());
               stmt.setString(8, (String)parms[9], 1);
               stmt.setString(9, (String)parms[10], 3);
               stmt.setInt(10, ((Number) parms[11]).intValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 16 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               return;
      }
   }

}

