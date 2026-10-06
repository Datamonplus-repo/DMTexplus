package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tbcprod_impl extends GXDataArea
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
            AV37BCProducto = httpContext.GetPar( "BCProducto") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV37BCProducto", AV37BCProducto);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBCPRODUCTO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV37BCProducto, ""))));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Productos", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtBCProducto_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public tbcprod_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tbcprod_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tbcprod_impl.class ));
   }

   public tbcprod_impl( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbBCUndComp = new HTMLChoice();
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
      if ( cmbBCUndComp.getItemCount() > 0 )
      {
         A13481BCUndComp = (short)(GXutil.lval( cmbBCUndComp.getValidValue(GXutil.trim( GXutil.str( A13481BCUndComp, 4, 0))))) ;
         n13481BCUndComp = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13481BCUndComp", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13481BCUndComp), 4, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbBCUndComp.setValue( GXutil.trim( GXutil.str( A13481BCUndComp, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbBCUndComp.getInternalname(), "Values", cmbBCUndComp.ToJavascriptSource(), true);
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBCProducto_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBCProducto_Internalname, httpContext.getMessage( "Producto", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBCProducto_Internalname, GXutil.rtrim( A13478BCProducto), GXutil.rtrim( localUtil.format( A13478BCProducto, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,22);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBCProducto_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtBCProducto_Enabled, 1, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TBCPROD.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBCDescripc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBCDescripc_Internalname, httpContext.getMessage( "Descripcion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBCDescripc_Internalname, GXutil.rtrim( A13479BCDescripc), GXutil.rtrim( localUtil.format( A13479BCDescripc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,27);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBCDescripc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtBCDescripc_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TBCPROD.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBCPrecio_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBCPrecio_Internalname, httpContext.getMessage( "Precio", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 32,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBCPrecio_Internalname, GXutil.ltrim( localUtil.ntoc( A13480BCPrecio, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBCPrecio_Enabled!=0) ? localUtil.format( A13480BCPrecio, "ZZZZZZ9.99999") : localUtil.format( A13480BCPrecio, "ZZZZZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,32);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBCPrecio_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtBCPrecio_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TBCPROD.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbBCUndComp.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, cmbBCUndComp.getInternalname(), httpContext.getMessage( "Unidad Compra", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 37,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbBCUndComp, cmbBCUndComp.getInternalname(), GXutil.trim( GXutil.str( A13481BCUndComp, 4, 0)), 1, cmbBCUndComp.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", 1, cmbBCUndComp.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,37);\"", "", true, (byte)(0), "HLP_TBCPROD.htm");
      cmbBCUndComp.setValue( GXutil.trim( GXutil.str( A13481BCUndComp, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbBCUndComp.getInternalname(), "Values", cmbBCUndComp.ToJavascriptSource(), true);
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBCProveedo_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBCProveedo_Internalname, httpContext.getMessage( "Proveedor", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 42,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBCProveedo_Internalname, GXutil.rtrim( A13482BCProveedo), GXutil.rtrim( localUtil.format( A13482BCProveedo, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,42);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBCProveedo_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtBCProveedo_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TBCPROD.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBCProcesad_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBCProcesad_Internalname, httpContext.getMessage( "Procesado", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 47,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBCProcesad_Internalname, GXutil.ltrim( localUtil.ntoc( A13483BCProcesad, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBCProcesad_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13483BCProcesad), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A13483BCProcesad), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,47);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBCProcesad_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtBCProcesad_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TBCPROD.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBCError_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBCError_Internalname, httpContext.getMessage( "Error", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 52,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBCError_Internalname, GXutil.ltrim( localUtil.ntoc( A13484BCError, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBCError_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13484BCError), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A13484BCError), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,52);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBCError_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtBCError_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TBCPROD.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBCDescErro_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBCDescErro_Internalname, httpContext.getMessage( "Descripción error", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 57,'',false,'',0)\"" ;
      ClassString = "AttributeFL" ;
      StyleString = "" ;
      ClassString = "AttributeFL" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtBCDescErro_Internalname, A13485BCDescErro, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,57);\"", (short)(0), 1, edtBCDescErro_Enabled, 0, 80, "chr", 3, "row", (byte)(0), StyleString, ClassString, "", "", "200", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_TBCPROD.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBCFechErro_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBCFechErro_Internalname, httpContext.getMessage( "Fecha y hora error", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 62,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtBCFechErro_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBCFechErro_Internalname, localUtil.ttoc( A13486BCFechErro, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A13486BCFechErro, "99/99/99 99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,62);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBCFechErro_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtBCFechErro_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TBCPROD.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtBCFechErro_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtBCFechErro_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TBCPROD.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBCPilaErro_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBCPilaErro_Internalname, httpContext.getMessage( "Pila error", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 67,'',false,'',0)\"" ;
      ClassString = "AttributeFL" ;
      StyleString = "" ;
      ClassString = "AttributeFL" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtBCPilaErro_Internalname, A13487BCPilaErro, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,67);\"", (short)(0), 1, edtBCPilaErro_Enabled, 0, 80, "chr", 3, "row", (byte)(0), StyleString, ClassString, "", "", "200", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_TBCPROD.htm");
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBCPROD.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBCPROD.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBCPROD.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 80,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,80);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", edtEmprCod_Visible, edtEmprCod_Enabled, 1, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TBCPROD.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "Attribute", "", "", "", "", edtEmprNom_Visible, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TBCPROD.htm");
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
      e111OD2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z13478BCProducto = httpContext.cgiGet( "Z13478BCProducto") ;
            Z13479BCDescripc = httpContext.cgiGet( "Z13479BCDescripc") ;
            Z13480BCPrecio = localUtil.ctond( httpContext.cgiGet( "Z13480BCPrecio")) ;
            Z13481BCUndComp = (short)(localUtil.ctol( httpContext.cgiGet( "Z13481BCUndComp"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z13482BCProveedo = httpContext.cgiGet( "Z13482BCProveedo") ;
            Z13483BCProcesad = (short)(localUtil.ctol( httpContext.cgiGet( "Z13483BCProcesad"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z13484BCError = (short)(localUtil.ctol( httpContext.cgiGet( "Z13484BCError"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z13485BCDescErro = httpContext.cgiGet( "Z13485BCDescErro") ;
            Z13486BCFechErro = localUtil.ctot( httpContext.cgiGet( "Z13486BCFechErro"), 0) ;
            Z13487BCPilaErro = httpContext.cgiGet( "Z13487BCPilaErro") ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            AV32EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            AV37BCProducto = httpContext.cgiGet( "vBCPRODUCTO") ;
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
            A13478BCProducto = httpContext.cgiGet( edtBCProducto_Internalname) ;
            n13478BCProducto = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13478BCProducto", A13478BCProducto);
            A13479BCDescripc = httpContext.cgiGet( edtBCDescripc_Internalname) ;
            n13479BCDescripc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13479BCDescripc", A13479BCDescripc);
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtBCPrecio_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtBCPrecio_Internalname)), DecimalUtil.stringToDec("9999999.99999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BCPRECIO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtBCPrecio_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A13480BCPrecio = DecimalUtil.ZERO ;
               n13480BCPrecio = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13480BCPrecio", GXutil.ltrimstr( A13480BCPrecio, 13, 5));
            }
            else
            {
               A13480BCPrecio = localUtil.ctond( httpContext.cgiGet( edtBCPrecio_Internalname)) ;
               n13480BCPrecio = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13480BCPrecio", GXutil.ltrimstr( A13480BCPrecio, 13, 5));
            }
            cmbBCUndComp.setValue( httpContext.cgiGet( cmbBCUndComp.getInternalname()) );
            A13481BCUndComp = (short)(GXutil.lval( httpContext.cgiGet( cmbBCUndComp.getInternalname()))) ;
            n13481BCUndComp = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13481BCUndComp", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13481BCUndComp), 4, 0));
            A13482BCProveedo = httpContext.cgiGet( edtBCProveedo_Internalname) ;
            n13482BCProveedo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13482BCProveedo", A13482BCProveedo);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBCProcesad_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBCProcesad_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BCPROCESAD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtBCProcesad_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A13483BCProcesad = (short)(0) ;
               n13483BCProcesad = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13483BCProcesad", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13483BCProcesad), 4, 0));
            }
            else
            {
               A13483BCProcesad = (short)(localUtil.ctol( httpContext.cgiGet( edtBCProcesad_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n13483BCProcesad = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13483BCProcesad", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13483BCProcesad), 4, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBCError_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBCError_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BCERROR");
               AnyError = (short)(1) ;
               GX_FocusControl = edtBCError_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A13484BCError = (short)(0) ;
               n13484BCError = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13484BCError", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13484BCError), 4, 0));
            }
            else
            {
               A13484BCError = (short)(localUtil.ctol( httpContext.cgiGet( edtBCError_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n13484BCError = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13484BCError", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13484BCError), 4, 0));
            }
            A13485BCDescErro = httpContext.cgiGet( edtBCDescErro_Internalname) ;
            n13485BCDescErro = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13485BCDescErro", A13485BCDescErro);
            if ( localUtil.vcdtime( httpContext.cgiGet( edtBCFechErro_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "BCFECHERRO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtBCFechErro_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A13486BCFechErro = GXutil.resetTime( GXutil.nullDate() );
               n13486BCFechErro = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13486BCFechErro", localUtil.ttoc( A13486BCFechErro, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            }
            else
            {
               A13486BCFechErro = localUtil.ctot( httpContext.cgiGet( edtBCFechErro_Internalname)) ;
               n13486BCFechErro = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13486BCFechErro", localUtil.ttoc( A13486BCFechErro, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            }
            A13487BCPilaErro = httpContext.cgiGet( edtBCPilaErro_Internalname) ;
            n13487BCPilaErro = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13487BCPilaErro", A13487BCPilaErro);
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"TBCPROD");
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( GXutil.strcmp(A13478BCProducto, Z13478BCProducto) != 0 ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("tbcprod:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               A13478BCProducto = httpContext.GetPar( "BCProducto") ;
               n13478BCProducto = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13478BCProducto", A13478BCProducto);
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
                  sMode1844 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  Gx_mode = sMode1844 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound1844 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_1OD0( ) ;
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
                        e111OD2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e121OD2 ();
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
         e121OD2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll1OD1844( ) ;
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
         disableAttributes1OD1844( ) ;
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

   public void confirm_1OD0( )
   {
      beforeValidate1OD1844( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1OD1844( ) ;
         }
         else
         {
            checkExtendedTable1OD1844( ) ;
            closeExtendedTableCursors1OD1844( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
   }

   public void resetCaption1OD0( )
   {
   }

   public void e111OD2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXv_char1[0] = AV32EmprCod ;
      GXv_char2[0] = A396EmprCod ;
      new app.obtenerempresaprovisional(remoteHandle, context).execute( GXv_char1, GXv_char2) ;
      tbcprod_impl.this.AV32EmprCod = GXv_char1[0] ;
      tbcprod_impl.this.A396EmprCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32EmprCod", AV32EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV32EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      GXt_char3 = AV12Station ;
      GXv_char2[0] = GXt_char3 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      tbcprod_impl.this.GXt_char3 = GXv_char2[0] ;
      AV12Station = GXt_char3 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = AV32EmprCod ;
      GXv_char1[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char1, GXv_char4) ;
      tbcprod_impl.this.AV32EmprCod = GXv_char2[0] ;
      tbcprod_impl.this.AV11EmprNom = GXv_char1[0] ;
      tbcprod_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32EmprCod", AV32EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV32EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
      GXv_SdtWWPContext5[0] = AV34WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext5) ;
      AV34WWPContext = GXv_SdtWWPContext5[0] ;
      AV35TrnContext.fromxml(AV36WebSession.getValue("TrnContext"), null, null);
      edtEmprCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Visible), 5, 0), true);
      edtEmprNom_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Visible), 5, 0), true);
   }

   public void e121OD2( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV35TrnContext.getgxTv_SdtWWPTransactionContext_Callerondelete() )
      {
         callWebObject(formatLink("app.tbcprodww", new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      pr_default.close(0);
      pr_ekamat.close(1);
      returnInSub = true;
      if (true) return;
   }

   public void zm1OD1844( int GX_JID )
   {
      if ( ( GX_JID == 7 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z13479BCDescripc = T01OD3_A13479BCDescripc[0] ;
            Z13480BCPrecio = T01OD3_A13480BCPrecio[0] ;
            Z13481BCUndComp = T01OD3_A13481BCUndComp[0] ;
            Z13482BCProveedo = T01OD3_A13482BCProveedo[0] ;
            Z13483BCProcesad = T01OD3_A13483BCProcesad[0] ;
            Z13484BCError = T01OD3_A13484BCError[0] ;
            Z13485BCDescErro = T01OD3_A13485BCDescErro[0] ;
            Z13486BCFechErro = T01OD3_A13486BCFechErro[0] ;
            Z13487BCPilaErro = T01OD3_A13487BCPilaErro[0] ;
         }
         else
         {
            Z13479BCDescripc = A13479BCDescripc ;
            Z13480BCPrecio = A13480BCPrecio ;
            Z13481BCUndComp = A13481BCUndComp ;
            Z13482BCProveedo = A13482BCProveedo ;
            Z13483BCProcesad = A13483BCProcesad ;
            Z13484BCError = A13484BCError ;
            Z13485BCDescErro = A13485BCDescErro ;
            Z13486BCFechErro = A13486BCFechErro ;
            Z13487BCPilaErro = A13487BCPilaErro ;
         }
      }
      if ( GX_JID == -7 )
      {
         Z13478BCProducto = A13478BCProducto ;
         Z13479BCDescripc = A13479BCDescripc ;
         Z13480BCPrecio = A13480BCPrecio ;
         Z13481BCUndComp = A13481BCUndComp ;
         Z13482BCProveedo = A13482BCProveedo ;
         Z13483BCProcesad = A13483BCProcesad ;
         Z13484BCError = A13484BCError ;
         Z13485BCDescErro = A13485BCDescErro ;
         Z13486BCFechErro = A13486BCFechErro ;
         Z13487BCPilaErro = A13487BCPilaErro ;
         Z396EmprCod = A396EmprCod ;
      }
   }

   public void standaloneNotModal( )
   {
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV32EmprCod)==0) )
      {
         A396EmprCod = AV32EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      /* Using cursor T01OD4 */
      pr_default.execute(0, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(0) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01OD4_A407EmprNom[0] ;
      n407EmprNom = T01OD4_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(0);
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
      if ( ! (GXutil.strcmp("", AV37BCProducto)==0) )
      {
         A13478BCProducto = AV37BCProducto ;
         n13478BCProducto = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13478BCProducto", A13478BCProducto);
      }
      if ( ! (GXutil.strcmp("", AV37BCProducto)==0) )
      {
         edtBCProducto_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBCProducto_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBCProducto_Enabled), 5, 0), true);
      }
      else
      {
         edtBCProducto_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBCProducto_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBCProducto_Enabled), 5, 0), true);
      }
      if ( ! (GXutil.strcmp("", AV37BCProducto)==0) )
      {
         edtBCProducto_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBCProducto_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBCProducto_Enabled), 5, 0), true);
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

   public void load1OD1844( )
   {
      /* Using cursor T01OD5 */
      pr_ekamat.execute(2, new Object[] {A396EmprCod, Boolean.valueOf(n13478BCProducto), A13478BCProducto});
      if ( (pr_ekamat.getStatus(2) != 101) )
      {
         RcdFound1844 = (short)(1) ;
         A13479BCDescripc = T01OD5_A13479BCDescripc[0] ;
         n13479BCDescripc = T01OD5_n13479BCDescripc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13479BCDescripc", A13479BCDescripc);
         A13480BCPrecio = T01OD5_A13480BCPrecio[0] ;
         n13480BCPrecio = T01OD5_n13480BCPrecio[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13480BCPrecio", GXutil.ltrimstr( A13480BCPrecio, 13, 5));
         A13481BCUndComp = T01OD5_A13481BCUndComp[0] ;
         n13481BCUndComp = T01OD5_n13481BCUndComp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13481BCUndComp", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13481BCUndComp), 4, 0));
         A13482BCProveedo = T01OD5_A13482BCProveedo[0] ;
         n13482BCProveedo = T01OD5_n13482BCProveedo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13482BCProveedo", A13482BCProveedo);
         A13483BCProcesad = T01OD5_A13483BCProcesad[0] ;
         n13483BCProcesad = T01OD5_n13483BCProcesad[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13483BCProcesad", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13483BCProcesad), 4, 0));
         A13484BCError = T01OD5_A13484BCError[0] ;
         n13484BCError = T01OD5_n13484BCError[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13484BCError", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13484BCError), 4, 0));
         A13485BCDescErro = T01OD5_A13485BCDescErro[0] ;
         n13485BCDescErro = T01OD5_n13485BCDescErro[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13485BCDescErro", A13485BCDescErro);
         A13486BCFechErro = T01OD5_A13486BCFechErro[0] ;
         n13486BCFechErro = T01OD5_n13486BCFechErro[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13486BCFechErro", localUtil.ttoc( A13486BCFechErro, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A13487BCPilaErro = T01OD5_A13487BCPilaErro[0] ;
         n13487BCPilaErro = T01OD5_n13487BCPilaErro[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13487BCPilaErro", A13487BCPilaErro);
         zm1OD1844( -7) ;
      }
      pr_ekamat.close(2);
      onLoadActions1OD1844( ) ;
   }

   public void onLoadActions1OD1844( )
   {
   }

   public void checkExtendedTable1OD1844( )
   {
      nIsDirty_1844 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors1OD1844( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1OD1844( )
   {
      /* Using cursor T01OD6 */
      pr_ekamat.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n13478BCProducto), A13478BCProducto});
      if ( (pr_ekamat.getStatus(3) != 101) )
      {
         RcdFound1844 = (short)(1) ;
      }
      else
      {
         RcdFound1844 = (short)(0) ;
      }
      pr_ekamat.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01OD3 */
      pr_ekamat.execute(1, new Object[] {A396EmprCod, Boolean.valueOf(n13478BCProducto), A13478BCProducto});
      if ( (pr_ekamat.getStatus(1) != 101) && ( GXutil.strcmp(T01OD3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1OD1844( 7) ;
         RcdFound1844 = (short)(1) ;
         A13478BCProducto = T01OD3_A13478BCProducto[0] ;
         n13478BCProducto = T01OD3_n13478BCProducto[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13478BCProducto", A13478BCProducto);
         A13479BCDescripc = T01OD3_A13479BCDescripc[0] ;
         n13479BCDescripc = T01OD3_n13479BCDescripc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13479BCDescripc", A13479BCDescripc);
         A13480BCPrecio = T01OD3_A13480BCPrecio[0] ;
         n13480BCPrecio = T01OD3_n13480BCPrecio[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13480BCPrecio", GXutil.ltrimstr( A13480BCPrecio, 13, 5));
         A13481BCUndComp = T01OD3_A13481BCUndComp[0] ;
         n13481BCUndComp = T01OD3_n13481BCUndComp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13481BCUndComp", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13481BCUndComp), 4, 0));
         A13482BCProveedo = T01OD3_A13482BCProveedo[0] ;
         n13482BCProveedo = T01OD3_n13482BCProveedo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13482BCProveedo", A13482BCProveedo);
         A13483BCProcesad = T01OD3_A13483BCProcesad[0] ;
         n13483BCProcesad = T01OD3_n13483BCProcesad[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13483BCProcesad", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13483BCProcesad), 4, 0));
         A13484BCError = T01OD3_A13484BCError[0] ;
         n13484BCError = T01OD3_n13484BCError[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13484BCError", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13484BCError), 4, 0));
         A13485BCDescErro = T01OD3_A13485BCDescErro[0] ;
         n13485BCDescErro = T01OD3_n13485BCDescErro[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13485BCDescErro", A13485BCDescErro);
         A13486BCFechErro = T01OD3_A13486BCFechErro[0] ;
         n13486BCFechErro = T01OD3_n13486BCFechErro[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13486BCFechErro", localUtil.ttoc( A13486BCFechErro, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A13487BCPilaErro = T01OD3_A13487BCPilaErro[0] ;
         n13487BCPilaErro = T01OD3_n13487BCPilaErro[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13487BCPilaErro", A13487BCPilaErro);
         Z396EmprCod = A396EmprCod ;
         Z13478BCProducto = A13478BCProducto ;
         sMode1844 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1OD1844( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1844 = (short)(0) ;
            initializeNonKey1OD1844( ) ;
         }
         Gx_mode = sMode1844 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1844 = (short)(0) ;
         initializeNonKey1OD1844( ) ;
         sMode1844 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1844 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_ekamat.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1OD1844( ) ;
      if ( RcdFound1844 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound1844 = (short)(0) ;
      /* Using cursor T01OD7 */
      pr_ekamat.execute(4, new Object[] {Boolean.valueOf(n13478BCProducto), A13478BCProducto, A396EmprCod});
      if ( (pr_ekamat.getStatus(4) != 101) )
      {
         while ( (pr_ekamat.getStatus(4) != 101) && ( ( GXutil.strcmp(T01OD7_A13478BCProducto[0], A13478BCProducto) < 0 ) ) && ( GXutil.strcmp(T01OD7_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_ekamat.readNext(4);
         }
         if ( (pr_ekamat.getStatus(4) != 101) && ( ( GXutil.strcmp(T01OD7_A13478BCProducto[0], A13478BCProducto) > 0 ) ) && ( GXutil.strcmp(T01OD7_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A13478BCProducto = T01OD7_A13478BCProducto[0] ;
            n13478BCProducto = T01OD7_n13478BCProducto[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A13478BCProducto", A13478BCProducto);
            RcdFound1844 = (short)(1) ;
         }
      }
      pr_ekamat.close(4);
   }

   public void move_previous( )
   {
      RcdFound1844 = (short)(0) ;
      /* Using cursor T01OD8 */
      pr_ekamat.execute(5, new Object[] {Boolean.valueOf(n13478BCProducto), A13478BCProducto, A396EmprCod});
      if ( (pr_ekamat.getStatus(5) != 101) )
      {
         while ( (pr_ekamat.getStatus(5) != 101) && ( ( GXutil.strcmp(T01OD8_A13478BCProducto[0], A13478BCProducto) > 0 ) ) && ( GXutil.strcmp(T01OD8_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_ekamat.readNext(5);
         }
         if ( (pr_ekamat.getStatus(5) != 101) && ( ( GXutil.strcmp(T01OD8_A13478BCProducto[0], A13478BCProducto) < 0 ) ) && ( GXutil.strcmp(T01OD8_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A13478BCProducto = T01OD8_A13478BCProducto[0] ;
            n13478BCProducto = T01OD8_n13478BCProducto[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A13478BCProducto", A13478BCProducto);
            RcdFound1844 = (short)(1) ;
         }
      }
      pr_ekamat.close(5);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1OD1844( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtBCProducto_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1OD1844( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1844 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A13478BCProducto, Z13478BCProducto) != 0 ) )
            {
               A13478BCProducto = Z13478BCProducto ;
               n13478BCProducto = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13478BCProducto", A13478BCProducto);
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtBCProducto_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               update1OD1844( ) ;
               GX_FocusControl = edtBCProducto_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A13478BCProducto, Z13478BCProducto) != 0 ) )
            {
               /* Insert record */
               GX_FocusControl = edtBCProducto_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1OD1844( ) ;
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
                  GX_FocusControl = edtBCProducto_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1OD1844( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A13478BCProducto, Z13478BCProducto) != 0 ) )
      {
         A13478BCProducto = Z13478BCProducto ;
         n13478BCProducto = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13478BCProducto", A13478BCProducto);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtBCProducto_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency1OD1844( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01OD2 */
         pr_ekamat.execute(0, new Object[] {A396EmprCod, Boolean.valueOf(n13478BCProducto), A13478BCProducto});
         if ( (pr_ekamat.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"PRODUCTO"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_ekamat.getStatus(0) == 101) || ( GXutil.strcmp(Z13479BCDescripc, T01OD2_A13479BCDescripc[0]) != 0 ) || ( DecimalUtil.compareTo(Z13480BCPrecio, T01OD2_A13480BCPrecio[0]) != 0 ) || ( Z13481BCUndComp != T01OD2_A13481BCUndComp[0] ) || ( GXutil.strcmp(Z13482BCProveedo, T01OD2_A13482BCProveedo[0]) != 0 ) || ( Z13483BCProcesad != T01OD2_A13483BCProcesad[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z13484BCError != T01OD2_A13484BCError[0] ) || ( GXutil.strcmp(Z13485BCDescErro, T01OD2_A13485BCDescErro[0]) != 0 ) || !( GXutil.dateCompare(Z13486BCFechErro, T01OD2_A13486BCFechErro[0]) ) || ( GXutil.strcmp(Z13487BCPilaErro, T01OD2_A13487BCPilaErro[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z13479BCDescripc, T01OD2_A13479BCDescripc[0]) != 0 )
            {
               GXutil.writeLogln("tbcprod:[seudo value changed for attri]"+"BCDescripc");
               GXutil.writeLogRaw("Old: ",Z13479BCDescripc);
               GXutil.writeLogRaw("Current: ",T01OD2_A13479BCDescripc[0]);
            }
            if ( DecimalUtil.compareTo(Z13480BCPrecio, T01OD2_A13480BCPrecio[0]) != 0 )
            {
               GXutil.writeLogln("tbcprod:[seudo value changed for attri]"+"BCPrecio");
               GXutil.writeLogRaw("Old: ",Z13480BCPrecio);
               GXutil.writeLogRaw("Current: ",T01OD2_A13480BCPrecio[0]);
            }
            if ( Z13481BCUndComp != T01OD2_A13481BCUndComp[0] )
            {
               GXutil.writeLogln("tbcprod:[seudo value changed for attri]"+"BCUndComp");
               GXutil.writeLogRaw("Old: ",Z13481BCUndComp);
               GXutil.writeLogRaw("Current: ",T01OD2_A13481BCUndComp[0]);
            }
            if ( GXutil.strcmp(Z13482BCProveedo, T01OD2_A13482BCProveedo[0]) != 0 )
            {
               GXutil.writeLogln("tbcprod:[seudo value changed for attri]"+"BCProveedo");
               GXutil.writeLogRaw("Old: ",Z13482BCProveedo);
               GXutil.writeLogRaw("Current: ",T01OD2_A13482BCProveedo[0]);
            }
            if ( Z13483BCProcesad != T01OD2_A13483BCProcesad[0] )
            {
               GXutil.writeLogln("tbcprod:[seudo value changed for attri]"+"BCProcesad");
               GXutil.writeLogRaw("Old: ",Z13483BCProcesad);
               GXutil.writeLogRaw("Current: ",T01OD2_A13483BCProcesad[0]);
            }
            if ( Z13484BCError != T01OD2_A13484BCError[0] )
            {
               GXutil.writeLogln("tbcprod:[seudo value changed for attri]"+"BCError");
               GXutil.writeLogRaw("Old: ",Z13484BCError);
               GXutil.writeLogRaw("Current: ",T01OD2_A13484BCError[0]);
            }
            if ( GXutil.strcmp(Z13485BCDescErro, T01OD2_A13485BCDescErro[0]) != 0 )
            {
               GXutil.writeLogln("tbcprod:[seudo value changed for attri]"+"BCDescErro");
               GXutil.writeLogRaw("Old: ",Z13485BCDescErro);
               GXutil.writeLogRaw("Current: ",T01OD2_A13485BCDescErro[0]);
            }
            if ( !( GXutil.dateCompare(Z13486BCFechErro, T01OD2_A13486BCFechErro[0]) ) )
            {
               GXutil.writeLogln("tbcprod:[seudo value changed for attri]"+"BCFechErro");
               GXutil.writeLogRaw("Old: ",Z13486BCFechErro);
               GXutil.writeLogRaw("Current: ",T01OD2_A13486BCFechErro[0]);
            }
            if ( GXutil.strcmp(Z13487BCPilaErro, T01OD2_A13487BCPilaErro[0]) != 0 )
            {
               GXutil.writeLogln("tbcprod:[seudo value changed for attri]"+"BCPilaErro");
               GXutil.writeLogRaw("Old: ",Z13487BCPilaErro);
               GXutil.writeLogRaw("Current: ",T01OD2_A13487BCPilaErro[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"PRODUCTO"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1OD1844( )
   {
      beforeValidate1OD1844( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1OD1844( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1OD1844( 0) ;
         checkOptimisticConcurrency1OD1844( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1OD1844( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1OD1844( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01OD9 */
                  pr_ekamat.execute(6, new Object[] {Boolean.valueOf(n13478BCProducto), A13478BCProducto, Boolean.valueOf(n13479BCDescripc), A13479BCDescripc, Boolean.valueOf(n13480BCPrecio), A13480BCPrecio, Boolean.valueOf(n13481BCUndComp), Short.valueOf(A13481BCUndComp), Boolean.valueOf(n13482BCProveedo), A13482BCProveedo, Boolean.valueOf(n13483BCProcesad), Short.valueOf(A13483BCProcesad), Boolean.valueOf(n13484BCError), Short.valueOf(A13484BCError), Boolean.valueOf(n13485BCDescErro), A13485BCDescErro, Boolean.valueOf(n13486BCFechErro), A13486BCFechErro, Boolean.valueOf(n13487BCPilaErro), A13487BCPilaErro, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("Producto");
                  if ( (pr_ekamat.getStatus(6) == 1) )
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
                        resetCaption1OD0( ) ;
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
            load1OD1844( ) ;
         }
         endLevel1OD1844( ) ;
      }
      closeExtendedTableCursors1OD1844( ) ;
   }

   public void update1OD1844( )
   {
      beforeValidate1OD1844( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1OD1844( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1OD1844( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1OD1844( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1OD1844( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01OD10 */
                  pr_ekamat.execute(7, new Object[] {Boolean.valueOf(n13479BCDescripc), A13479BCDescripc, Boolean.valueOf(n13480BCPrecio), A13480BCPrecio, Boolean.valueOf(n13481BCUndComp), Short.valueOf(A13481BCUndComp), Boolean.valueOf(n13482BCProveedo), A13482BCProveedo, Boolean.valueOf(n13483BCProcesad), Short.valueOf(A13483BCProcesad), Boolean.valueOf(n13484BCError), Short.valueOf(A13484BCError), Boolean.valueOf(n13485BCDescErro), A13485BCDescErro, Boolean.valueOf(n13486BCFechErro), A13486BCFechErro, Boolean.valueOf(n13487BCPilaErro), A13487BCPilaErro, A396EmprCod, Boolean.valueOf(n13478BCProducto), A13478BCProducto});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("Producto");
                  if ( (pr_ekamat.getStatus(7) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"PRODUCTO"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1OD1844( ) ;
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
         endLevel1OD1844( ) ;
      }
      closeExtendedTableCursors1OD1844( ) ;
   }

   public void deferredUpdate1OD1844( )
   {
   }

   public void delete( )
   {
      beforeValidate1OD1844( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1OD1844( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1OD1844( ) ;
         afterConfirm1OD1844( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1OD1844( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01OD11 */
               pr_ekamat.execute(8, new Object[] {A396EmprCod, Boolean.valueOf(n13478BCProducto), A13478BCProducto});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("Producto");
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
      sMode1844 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1OD1844( ) ;
      Gx_mode = sMode1844 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1OD1844( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T01OD12 */
         pr_default.execute(1, new Object[] {A396EmprCod, Boolean.valueOf(n13478BCProducto), A13478BCProducto});
         if ( (pr_default.getStatus(1) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Detalle Productos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(1);
         /* Using cursor T01OD13 */
         pr_default.execute(2, new Object[] {A396EmprCod, Boolean.valueOf(n13478BCProducto), A13478BCProducto});
         if ( (pr_default.getStatus(2) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Compras Recepcion envio", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(2);
      }
   }

   public void endLevel1OD1844( )
   {
      if ( ! isIns( ) )
      {
         pr_ekamat.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1OD1844( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tbcprod");
         if ( AnyError == 0 )
         {
            confirmValues1OD0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tbcprod");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1OD1844( )
   {
      /* Scan By routine */
      /* Using cursor T01OD14 */
      pr_ekamat.execute(9, new Object[] {A396EmprCod});
      RcdFound1844 = (short)(0) ;
      if ( (pr_ekamat.getStatus(9) != 101) )
      {
         RcdFound1844 = (short)(1) ;
         A13478BCProducto = T01OD14_A13478BCProducto[0] ;
         n13478BCProducto = T01OD14_n13478BCProducto[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13478BCProducto", A13478BCProducto);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1OD1844( )
   {
      /* Scan next routine */
      pr_ekamat.readNext(9);
      RcdFound1844 = (short)(0) ;
      if ( (pr_ekamat.getStatus(9) != 101) )
      {
         RcdFound1844 = (short)(1) ;
         A13478BCProducto = T01OD14_A13478BCProducto[0] ;
         n13478BCProducto = T01OD14_n13478BCProducto[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13478BCProducto", A13478BCProducto);
      }
   }

   public void scanEnd1OD1844( )
   {
      pr_ekamat.close(9);
   }

   public void afterConfirm1OD1844( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1OD1844( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1OD1844( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1OD1844( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1OD1844( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1OD1844( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1OD1844( )
   {
      edtBCProducto_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBCProducto_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBCProducto_Enabled), 5, 0), true);
      edtBCDescripc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBCDescripc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBCDescripc_Enabled), 5, 0), true);
      edtBCPrecio_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBCPrecio_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBCPrecio_Enabled), 5, 0), true);
      cmbBCUndComp.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbBCUndComp.getInternalname(), "Enabled", GXutil.ltrimstr( cmbBCUndComp.getEnabled(), 5, 0), true);
      edtBCProveedo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBCProveedo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBCProveedo_Enabled), 5, 0), true);
      edtBCProcesad_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBCProcesad_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBCProcesad_Enabled), 5, 0), true);
      edtBCError_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBCError_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBCError_Enabled), 5, 0), true);
      edtBCDescErro_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBCDescErro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBCDescErro_Enabled), 5, 0), true);
      edtBCFechErro_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBCFechErro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBCFechErro_Enabled), 5, 0), true);
      edtBCPilaErro_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBCPilaErro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBCPilaErro_Enabled), 5, 0), true);
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1OD1844( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1OD0( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.tbcprod", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV32EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV37BCProducto))}, new String[] {"Gx_mode","EmprCod","BCProducto"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"TBCPROD");
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("tbcprod:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13478BCProducto", GXutil.rtrim( Z13478BCProducto));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13479BCDescripc", GXutil.rtrim( Z13479BCDescripc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13480BCPrecio", GXutil.ltrim( localUtil.ntoc( Z13480BCPrecio, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13481BCUndComp", GXutil.ltrim( localUtil.ntoc( Z13481BCUndComp, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13482BCProveedo", GXutil.rtrim( Z13482BCProveedo));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13483BCProcesad", GXutil.ltrim( localUtil.ntoc( Z13483BCProcesad, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13484BCError", GXutil.ltrim( localUtil.ntoc( Z13484BCError, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13485BCDescErro", Z13485BCDescErro);
      app.GxWebStd.gx_hidden_field( httpContext, "Z13486BCFechErro", localUtil.ttoc( Z13486BCFechErro, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13487BCPilaErro", Z13487BCPilaErro);
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTRNCONTEXT", AV35TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTRNCONTEXT", AV35TrnContext);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTRNCONTEXT", getSecureSignedToken( "", AV35TrnContext));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV32EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV32EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vBCPRODUCTO", GXutil.rtrim( AV37BCProducto));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBCPRODUCTO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV37BCProducto, ""))));
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
      return formatLink("app.tbcprod", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV32EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV37BCProducto))}, new String[] {"Gx_mode","EmprCod","BCProducto"})  ;
   }

   public String getPgmname( )
   {
      return "TBCPROD" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Productos", "") ;
   }

   public void initializeNonKey1OD1844( )
   {
      A13479BCDescripc = "" ;
      n13479BCDescripc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13479BCDescripc", A13479BCDescripc);
      A13480BCPrecio = DecimalUtil.ZERO ;
      n13480BCPrecio = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13480BCPrecio", GXutil.ltrimstr( A13480BCPrecio, 13, 5));
      A13481BCUndComp = (short)(0) ;
      n13481BCUndComp = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13481BCUndComp", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13481BCUndComp), 4, 0));
      A13482BCProveedo = "" ;
      n13482BCProveedo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13482BCProveedo", A13482BCProveedo);
      A13483BCProcesad = (short)(0) ;
      n13483BCProcesad = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13483BCProcesad", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13483BCProcesad), 4, 0));
      A13484BCError = (short)(0) ;
      n13484BCError = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13484BCError", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13484BCError), 4, 0));
      A13485BCDescErro = "" ;
      n13485BCDescErro = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13485BCDescErro", A13485BCDescErro);
      A13486BCFechErro = GXutil.resetTime( GXutil.nullDate() );
      n13486BCFechErro = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13486BCFechErro", localUtil.ttoc( A13486BCFechErro, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A13487BCPilaErro = "" ;
      n13487BCPilaErro = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13487BCPilaErro", A13487BCPilaErro);
      Z13479BCDescripc = "" ;
      Z13480BCPrecio = DecimalUtil.ZERO ;
      Z13481BCUndComp = (short)(0) ;
      Z13482BCProveedo = "" ;
      Z13483BCProcesad = (short)(0) ;
      Z13484BCError = (short)(0) ;
      Z13485BCDescErro = "" ;
      Z13486BCFechErro = GXutil.resetTime( GXutil.nullDate() );
      Z13487BCPilaErro = "" ;
   }

   public void initAll1OD1844( )
   {
      A13478BCProducto = "" ;
      n13478BCProducto = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13478BCProducto", A13478BCProducto);
      initializeNonKey1OD1844( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?2026821167693", true, true);
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
      httpContext.AddJavascriptSource("tbcprod.js", "?2026821167693", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      edtBCProducto_Internalname = "BCPRODUCTO" ;
      edtBCDescripc_Internalname = "BCDESCRIPC" ;
      edtBCPrecio_Internalname = "BCPRECIO" ;
      cmbBCUndComp.setInternalname( "BCUNDCOMP" );
      edtBCProveedo_Internalname = "BCPROVEEDO" ;
      edtBCProcesad_Internalname = "BCPROCESAD" ;
      edtBCError_Internalname = "BCERROR" ;
      edtBCDescErro_Internalname = "BCDESCERRO" ;
      edtBCFechErro_Internalname = "BCFECHERRO" ;
      edtBCPilaErro_Internalname = "BCPILAERRO" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      bttBtntrn_delete_Internalname = "BTNTRN_DELETE" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtEmprCod_Internalname = "EMPRCOD" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
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
      Form.setCaption( httpContext.getMessage( "Productos", "") );
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
      edtBCPilaErro_Enabled = 1 ;
      edtBCFechErro_Jsonclick = "" ;
      edtBCFechErro_Enabled = 1 ;
      edtBCDescErro_Enabled = 1 ;
      edtBCError_Jsonclick = "" ;
      edtBCError_Enabled = 1 ;
      edtBCProcesad_Jsonclick = "" ;
      edtBCProcesad_Enabled = 1 ;
      edtBCProveedo_Jsonclick = "" ;
      edtBCProveedo_Enabled = 1 ;
      cmbBCUndComp.setJsonclick( "" );
      cmbBCUndComp.setEnabled( 1 );
      edtBCPrecio_Jsonclick = "" ;
      edtBCPrecio_Enabled = 1 ;
      edtBCDescripc_Jsonclick = "" ;
      edtBCDescripc_Enabled = 1 ;
      edtBCProducto_Jsonclick = "" ;
      edtBCProducto_Enabled = 1 ;
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
      cmbBCUndComp.setName( "BCUNDCOMP" );
      cmbBCUndComp.setWebtags( "" );
      cmbBCUndComp.addItem("1", httpContext.getMessage( "Kilos", ""), (short)(0));
      cmbBCUndComp.addItem("2", httpContext.getMessage( "Litros", ""), (short)(0));
      if ( cmbBCUndComp.getItemCount() > 0 )
      {
         A13481BCUndComp = (short)(GXutil.lval( cmbBCUndComp.getValidValue(GXutil.trim( GXutil.str( A13481BCUndComp, 4, 0))))) ;
         n13481BCUndComp = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13481BCUndComp", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13481BCUndComp), 4, 0));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV32EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV37BCProducto',fld:'vBCPRODUCTO',pic:'',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV35TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true},{av:'AV32EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV37BCProducto',fld:'vBCPRODUCTO',pic:'',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e121OD2',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV35TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true}]");
      setEventMetadata("AFTER TRN",",oparms:[]}");
      setEventMetadata("VALID_BCPRODUCTO","{handler:'valid_Bcproducto',iparms:[]");
      setEventMetadata("VALID_BCPRODUCTO",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
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
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      wcpOAV32EmprCod = "" ;
      wcpOAV37BCProducto = "" ;
      Z396EmprCod = "" ;
      Z13478BCProducto = "" ;
      Z13479BCDescripc = "" ;
      Z13480BCPrecio = DecimalUtil.ZERO ;
      Z13482BCProveedo = "" ;
      Z13485BCDescErro = "" ;
      Z13486BCFechErro = GXutil.resetTime( GXutil.nullDate() );
      Z13487BCPilaErro = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      Gx_mode = "" ;
      AV32EmprCod = "" ;
      AV37BCProducto = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      A13478BCProducto = "" ;
      A13479BCDescripc = "" ;
      A13480BCPrecio = DecimalUtil.ZERO ;
      A13482BCProveedo = "" ;
      A13485BCDescErro = "" ;
      A13486BCFechErro = GXutil.resetTime( GXutil.nullDate() );
      A13487BCPilaErro = "" ;
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      A396EmprCod = "" ;
      A407EmprNom = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode1844 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      AV12Station = "" ;
      GXt_char3 = "" ;
      GXv_char2 = new String[1] ;
      AV11EmprNom = "" ;
      GXv_char1 = new String[1] ;
      AV8UsurCod = "" ;
      GXv_char4 = new String[1] ;
      AV34WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext5 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV35TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV36WebSession = httpContext.getWebSession();
      T01OD4_A407EmprNom = new String[] {""} ;
      T01OD4_n407EmprNom = new boolean[] {false} ;
      T01OD5_A13478BCProducto = new String[] {""} ;
      T01OD5_n13478BCProducto = new boolean[] {false} ;
      T01OD5_A13479BCDescripc = new String[] {""} ;
      T01OD5_n13479BCDescripc = new boolean[] {false} ;
      T01OD5_A13480BCPrecio = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OD5_n13480BCPrecio = new boolean[] {false} ;
      T01OD5_A13481BCUndComp = new short[1] ;
      T01OD5_n13481BCUndComp = new boolean[] {false} ;
      T01OD5_A13482BCProveedo = new String[] {""} ;
      T01OD5_n13482BCProveedo = new boolean[] {false} ;
      T01OD5_A13483BCProcesad = new short[1] ;
      T01OD5_n13483BCProcesad = new boolean[] {false} ;
      T01OD5_A13484BCError = new short[1] ;
      T01OD5_n13484BCError = new boolean[] {false} ;
      T01OD5_A13485BCDescErro = new String[] {""} ;
      T01OD5_n13485BCDescErro = new boolean[] {false} ;
      T01OD5_A13486BCFechErro = new java.util.Date[] {GXutil.nullDate()} ;
      T01OD5_n13486BCFechErro = new boolean[] {false} ;
      T01OD5_A13487BCPilaErro = new String[] {""} ;
      T01OD5_n13487BCPilaErro = new boolean[] {false} ;
      T01OD5_A396EmprCod = new String[] {""} ;
      T01OD6_A396EmprCod = new String[] {""} ;
      T01OD6_A13478BCProducto = new String[] {""} ;
      T01OD6_n13478BCProducto = new boolean[] {false} ;
      T01OD3_A13478BCProducto = new String[] {""} ;
      T01OD3_n13478BCProducto = new boolean[] {false} ;
      T01OD3_A13479BCDescripc = new String[] {""} ;
      T01OD3_n13479BCDescripc = new boolean[] {false} ;
      T01OD3_A13480BCPrecio = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OD3_n13480BCPrecio = new boolean[] {false} ;
      T01OD3_A13481BCUndComp = new short[1] ;
      T01OD3_n13481BCUndComp = new boolean[] {false} ;
      T01OD3_A13482BCProveedo = new String[] {""} ;
      T01OD3_n13482BCProveedo = new boolean[] {false} ;
      T01OD3_A13483BCProcesad = new short[1] ;
      T01OD3_n13483BCProcesad = new boolean[] {false} ;
      T01OD3_A13484BCError = new short[1] ;
      T01OD3_n13484BCError = new boolean[] {false} ;
      T01OD3_A13485BCDescErro = new String[] {""} ;
      T01OD3_n13485BCDescErro = new boolean[] {false} ;
      T01OD3_A13486BCFechErro = new java.util.Date[] {GXutil.nullDate()} ;
      T01OD3_n13486BCFechErro = new boolean[] {false} ;
      T01OD3_A13487BCPilaErro = new String[] {""} ;
      T01OD3_n13487BCPilaErro = new boolean[] {false} ;
      T01OD3_A396EmprCod = new String[] {""} ;
      T01OD7_A396EmprCod = new String[] {""} ;
      T01OD7_A13478BCProducto = new String[] {""} ;
      T01OD7_n13478BCProducto = new boolean[] {false} ;
      T01OD8_A396EmprCod = new String[] {""} ;
      T01OD8_A13478BCProducto = new String[] {""} ;
      T01OD8_n13478BCProducto = new boolean[] {false} ;
      T01OD2_A13478BCProducto = new String[] {""} ;
      T01OD2_n13478BCProducto = new boolean[] {false} ;
      T01OD2_A13479BCDescripc = new String[] {""} ;
      T01OD2_n13479BCDescripc = new boolean[] {false} ;
      T01OD2_A13480BCPrecio = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OD2_n13480BCPrecio = new boolean[] {false} ;
      T01OD2_A13481BCUndComp = new short[1] ;
      T01OD2_n13481BCUndComp = new boolean[] {false} ;
      T01OD2_A13482BCProveedo = new String[] {""} ;
      T01OD2_n13482BCProveedo = new boolean[] {false} ;
      T01OD2_A13483BCProcesad = new short[1] ;
      T01OD2_n13483BCProcesad = new boolean[] {false} ;
      T01OD2_A13484BCError = new short[1] ;
      T01OD2_n13484BCError = new boolean[] {false} ;
      T01OD2_A13485BCDescErro = new String[] {""} ;
      T01OD2_n13485BCDescErro = new boolean[] {false} ;
      T01OD2_A13486BCFechErro = new java.util.Date[] {GXutil.nullDate()} ;
      T01OD2_n13486BCFechErro = new boolean[] {false} ;
      T01OD2_A13487BCPilaErro = new String[] {""} ;
      T01OD2_n13487BCPilaErro = new boolean[] {false} ;
      T01OD2_A396EmprCod = new String[] {""} ;
      T01OD12_A396EmprCod = new String[] {""} ;
      T01OD12_A13465BCNumeroOP = new int[1] ;
      T01OD12_A13500BCFecCierr = new java.util.Date[] {GXutil.nullDate()} ;
      T01OD12_A13501BCNumero = new short[1] ;
      T01OD12_A13502BCLinea = new int[1] ;
      T01OD13_A396EmprCod = new String[] {""} ;
      T01OD13_A13488BCCPPedido = new int[1] ;
      T01OD13_A13478BCProducto = new String[] {""} ;
      T01OD13_n13478BCProducto = new boolean[] {false} ;
      T01OD14_A396EmprCod = new String[] {""} ;
      T01OD14_A13478BCProducto = new String[] {""} ;
      T01OD14_n13478BCProducto = new boolean[] {false} ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tbcprod__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tbcprod__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tbcprod__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tbcprod__ekamat(),
         new Object[] {
             new Object[] {
            T01OD2_A13478BCProducto, T01OD2_A13479BCDescripc, T01OD2_n13479BCDescripc, T01OD2_A13480BCPrecio, T01OD2_n13480BCPrecio, T01OD2_A13481BCUndComp, T01OD2_n13481BCUndComp, T01OD2_A13482BCProveedo, T01OD2_n13482BCProveedo, T01OD2_A13483BCProcesad,
            T01OD2_n13483BCProcesad, T01OD2_A13484BCError, T01OD2_n13484BCError, T01OD2_A13485BCDescErro, T01OD2_n13485BCDescErro, T01OD2_A13486BCFechErro, T01OD2_n13486BCFechErro, T01OD2_A13487BCPilaErro, T01OD2_n13487BCPilaErro, T01OD2_A396EmprCod
            }
            , new Object[] {
            T01OD3_A13478BCProducto, T01OD3_A13479BCDescripc, T01OD3_n13479BCDescripc, T01OD3_A13480BCPrecio, T01OD3_n13480BCPrecio, T01OD3_A13481BCUndComp, T01OD3_n13481BCUndComp, T01OD3_A13482BCProveedo, T01OD3_n13482BCProveedo, T01OD3_A13483BCProcesad,
            T01OD3_n13483BCProcesad, T01OD3_A13484BCError, T01OD3_n13484BCError, T01OD3_A13485BCDescErro, T01OD3_n13485BCDescErro, T01OD3_A13486BCFechErro, T01OD3_n13486BCFechErro, T01OD3_A13487BCPilaErro, T01OD3_n13487BCPilaErro, T01OD3_A396EmprCod
            }
            , new Object[] {
            T01OD5_A13478BCProducto, T01OD5_A13479BCDescripc, T01OD5_n13479BCDescripc, T01OD5_A13480BCPrecio, T01OD5_n13480BCPrecio, T01OD5_A13481BCUndComp, T01OD5_n13481BCUndComp, T01OD5_A13482BCProveedo, T01OD5_n13482BCProveedo, T01OD5_A13483BCProcesad,
            T01OD5_n13483BCProcesad, T01OD5_A13484BCError, T01OD5_n13484BCError, T01OD5_A13485BCDescErro, T01OD5_n13485BCDescErro, T01OD5_A13486BCFechErro, T01OD5_n13486BCFechErro, T01OD5_A13487BCPilaErro, T01OD5_n13487BCPilaErro, T01OD5_A396EmprCod
            }
            , new Object[] {
            T01OD6_A396EmprCod, T01OD6_A13478BCProducto
            }
            , new Object[] {
            T01OD7_A396EmprCod, T01OD7_A13478BCProducto
            }
            , new Object[] {
            T01OD8_A396EmprCod, T01OD8_A13478BCProducto
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01OD14_A396EmprCod, T01OD14_A13478BCProducto
            }
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tbcprod__default(),
         new Object[] {
             new Object[] {
            T01OD4_A407EmprNom, T01OD4_n407EmprNom
            }
            , new Object[] {
            T01OD12_A396EmprCod, T01OD12_A13465BCNumeroOP, T01OD12_A13500BCFecCierr, T01OD12_A13501BCNumero, T01OD12_A13502BCLinea
            }
            , new Object[] {
            T01OD13_A396EmprCod, T01OD13_A13488BCCPPedido, T01OD13_A13478BCProducto
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private short Z13481BCUndComp ;
   private short Z13483BCProcesad ;
   private short Z13484BCError ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A13481BCUndComp ;
   private short A13483BCProcesad ;
   private short A13484BCError ;
   private short RcdFound1844 ;
   private short nIsDirty_1844 ;
   private int trnEnded ;
   private int edtBCProducto_Enabled ;
   private int edtBCDescripc_Enabled ;
   private int edtBCPrecio_Enabled ;
   private int edtBCProveedo_Enabled ;
   private int edtBCProcesad_Enabled ;
   private int edtBCError_Enabled ;
   private int edtBCDescErro_Enabled ;
   private int edtBCFechErro_Enabled ;
   private int edtBCPilaErro_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int edtEmprCod_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Visible ;
   private int edtEmprNom_Enabled ;
   private int GX_JID ;
   private int idxLst ;
   private java.math.BigDecimal Z13480BCPrecio ;
   private java.math.BigDecimal A13480BCPrecio ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV32EmprCod ;
   private String wcpOAV37BCProducto ;
   private String Z396EmprCod ;
   private String Z13478BCProducto ;
   private String Z13479BCDescripc ;
   private String Z13482BCProveedo ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String Gx_mode ;
   private String AV32EmprCod ;
   private String AV37BCProducto ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtBCProducto_Internalname ;
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
   private String A13478BCProducto ;
   private String edtBCProducto_Jsonclick ;
   private String edtBCDescripc_Internalname ;
   private String A13479BCDescripc ;
   private String edtBCDescripc_Jsonclick ;
   private String edtBCPrecio_Internalname ;
   private String edtBCPrecio_Jsonclick ;
   private String edtBCProveedo_Internalname ;
   private String A13482BCProveedo ;
   private String edtBCProveedo_Jsonclick ;
   private String edtBCProcesad_Internalname ;
   private String edtBCProcesad_Jsonclick ;
   private String edtBCError_Internalname ;
   private String edtBCError_Jsonclick ;
   private String edtBCDescErro_Internalname ;
   private String edtBCFechErro_Internalname ;
   private String edtBCFechErro_Jsonclick ;
   private String edtBCPilaErro_Internalname ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String edtEmprCod_Internalname ;
   private String A396EmprCod ;
   private String edtEmprCod_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String hsh ;
   private String sMode1844 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String AV12Station ;
   private String GXt_char3 ;
   private String GXv_char2[] ;
   private String AV11EmprNom ;
   private String GXv_char1[] ;
   private String AV8UsurCod ;
   private String GXv_char4[] ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private java.util.Date Z13486BCFechErro ;
   private java.util.Date A13486BCFechErro ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n13481BCUndComp ;
   private boolean Dvpanel_tableattributes_Autowidth ;
   private boolean Dvpanel_tableattributes_Autoheight ;
   private boolean Dvpanel_tableattributes_Collapsible ;
   private boolean Dvpanel_tableattributes_Collapsed ;
   private boolean Dvpanel_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_tableattributes_Autoscroll ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean n13478BCProducto ;
   private boolean n13479BCDescripc ;
   private boolean n13480BCPrecio ;
   private boolean n13482BCProveedo ;
   private boolean n13483BCProcesad ;
   private boolean n13484BCError ;
   private boolean n13485BCDescErro ;
   private boolean n13486BCFechErro ;
   private boolean n13487BCPilaErro ;
   private boolean n407EmprNom ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private String Z13485BCDescErro ;
   private String Z13487BCPilaErro ;
   private String A13485BCDescErro ;
   private String A13487BCPilaErro ;
   private com.genexus.webpanels.WebSession AV36WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbBCUndComp ;
   private IDataStoreProvider pr_default ;
   private String[] T01OD4_A407EmprNom ;
   private boolean[] T01OD4_n407EmprNom ;
   private IDataStoreProvider pr_ekamat ;
   private String[] T01OD5_A13478BCProducto ;
   private boolean[] T01OD5_n13478BCProducto ;
   private String[] T01OD5_A13479BCDescripc ;
   private boolean[] T01OD5_n13479BCDescripc ;
   private java.math.BigDecimal[] T01OD5_A13480BCPrecio ;
   private boolean[] T01OD5_n13480BCPrecio ;
   private short[] T01OD5_A13481BCUndComp ;
   private boolean[] T01OD5_n13481BCUndComp ;
   private String[] T01OD5_A13482BCProveedo ;
   private boolean[] T01OD5_n13482BCProveedo ;
   private short[] T01OD5_A13483BCProcesad ;
   private boolean[] T01OD5_n13483BCProcesad ;
   private short[] T01OD5_A13484BCError ;
   private boolean[] T01OD5_n13484BCError ;
   private String[] T01OD5_A13485BCDescErro ;
   private boolean[] T01OD5_n13485BCDescErro ;
   private java.util.Date[] T01OD5_A13486BCFechErro ;
   private boolean[] T01OD5_n13486BCFechErro ;
   private String[] T01OD5_A13487BCPilaErro ;
   private boolean[] T01OD5_n13487BCPilaErro ;
   private String[] T01OD5_A396EmprCod ;
   private String[] T01OD6_A396EmprCod ;
   private String[] T01OD6_A13478BCProducto ;
   private boolean[] T01OD6_n13478BCProducto ;
   private String[] T01OD3_A13478BCProducto ;
   private boolean[] T01OD3_n13478BCProducto ;
   private String[] T01OD3_A13479BCDescripc ;
   private boolean[] T01OD3_n13479BCDescripc ;
   private java.math.BigDecimal[] T01OD3_A13480BCPrecio ;
   private boolean[] T01OD3_n13480BCPrecio ;
   private short[] T01OD3_A13481BCUndComp ;
   private boolean[] T01OD3_n13481BCUndComp ;
   private String[] T01OD3_A13482BCProveedo ;
   private boolean[] T01OD3_n13482BCProveedo ;
   private short[] T01OD3_A13483BCProcesad ;
   private boolean[] T01OD3_n13483BCProcesad ;
   private short[] T01OD3_A13484BCError ;
   private boolean[] T01OD3_n13484BCError ;
   private String[] T01OD3_A13485BCDescErro ;
   private boolean[] T01OD3_n13485BCDescErro ;
   private java.util.Date[] T01OD3_A13486BCFechErro ;
   private boolean[] T01OD3_n13486BCFechErro ;
   private String[] T01OD3_A13487BCPilaErro ;
   private boolean[] T01OD3_n13487BCPilaErro ;
   private String[] T01OD3_A396EmprCod ;
   private String[] T01OD7_A396EmprCod ;
   private String[] T01OD7_A13478BCProducto ;
   private boolean[] T01OD7_n13478BCProducto ;
   private String[] T01OD8_A396EmprCod ;
   private String[] T01OD8_A13478BCProducto ;
   private boolean[] T01OD8_n13478BCProducto ;
   private String[] T01OD2_A13478BCProducto ;
   private boolean[] T01OD2_n13478BCProducto ;
   private String[] T01OD2_A13479BCDescripc ;
   private boolean[] T01OD2_n13479BCDescripc ;
   private java.math.BigDecimal[] T01OD2_A13480BCPrecio ;
   private boolean[] T01OD2_n13480BCPrecio ;
   private short[] T01OD2_A13481BCUndComp ;
   private boolean[] T01OD2_n13481BCUndComp ;
   private String[] T01OD2_A13482BCProveedo ;
   private boolean[] T01OD2_n13482BCProveedo ;
   private short[] T01OD2_A13483BCProcesad ;
   private boolean[] T01OD2_n13483BCProcesad ;
   private short[] T01OD2_A13484BCError ;
   private boolean[] T01OD2_n13484BCError ;
   private String[] T01OD2_A13485BCDescErro ;
   private boolean[] T01OD2_n13485BCDescErro ;
   private java.util.Date[] T01OD2_A13486BCFechErro ;
   private boolean[] T01OD2_n13486BCFechErro ;
   private String[] T01OD2_A13487BCPilaErro ;
   private boolean[] T01OD2_n13487BCPilaErro ;
   private String[] T01OD2_A396EmprCod ;
   private String[] T01OD12_A396EmprCod ;
   private int[] T01OD12_A13465BCNumeroOP ;
   private java.util.Date[] T01OD12_A13500BCFecCierr ;
   private short[] T01OD12_A13501BCNumero ;
   private int[] T01OD12_A13502BCLinea ;
   private String[] T01OD13_A396EmprCod ;
   private int[] T01OD13_A13488BCCPPedido ;
   private String[] T01OD13_A13478BCProducto ;
   private boolean[] T01OD13_n13478BCProducto ;
   private String[] T01OD14_A396EmprCod ;
   private String[] T01OD14_A13478BCProducto ;
   private boolean[] T01OD14_n13478BCProducto ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private com.genexus.webpanels.GXWebForm Form ;
   private app.wwpbaseobjects.SdtWWPContext AV34WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext5[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV35TrnContext ;
}

final  class tbcprod__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tbcprod__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tbcprod__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tbcprod__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01OD2", "SELECT [Producto], [Descripción], [Precio], [Unidad Compra], [Proveedor], [Procesado], [Error], [Descripción error], [Fecha y hora error], [Pila error], [Emprcod] FROM [Producto] WITH (UPDLOCK) WHERE [Emprcod] = ? AND [Producto] = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OD3", "SELECT [Producto], [Descripción], [Precio], [Unidad Compra], [Proveedor], [Procesado], [Error], [Descripción error], [Fecha y hora error], [Pila error], [Emprcod] FROM [Producto] WITH (NOLOCK) WHERE [Emprcod] = ? AND [Producto] = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OD5", "SELECT TM1.[Producto], TM1.[Descripción], TM1.[Precio], TM1.[Unidad Compra], TM1.[Proveedor], TM1.[Procesado], TM1.[Error], TM1.[Descripción error], TM1.[Fecha y hora error], TM1.[Pila error], TM1.[Emprcod] FROM [Producto] TM1 WITH (NOLOCK) WHERE TM1.[Emprcod] = ? and TM1.[Producto] = ? ORDER BY TM1.[Emprcod], TM1.[Producto]  OPTION (FAST 100)",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OD6", "SELECT [Emprcod], [Producto] FROM [Producto] WITH (NOLOCK) WHERE [Emprcod] = ? AND [Producto] = ?  OPTION (FAST 1)",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OD7", "SELECT TOP 1 [Emprcod], [Producto] FROM [Producto] WITH (NOLOCK) WHERE ( [Producto] > ?) and [Emprcod] = ? ORDER BY [Emprcod], [Producto]  OPTION (FAST 1)",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01OD8", "SELECT TOP 1 [Emprcod], [Producto] FROM [Producto] WITH (NOLOCK) WHERE ( [Producto] < ?) and [Emprcod] = ? ORDER BY [Emprcod] DESC, [Producto] DESC  OPTION (FAST 1)",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01OD9", "INSERT INTO [Producto]([Producto], [Descripción], [Precio], [Unidad Compra], [Proveedor], [Procesado], [Error], [Descripción error], [Fecha y hora error], [Pila error], [Emprcod]) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("T01OD10", "UPDATE [Producto] SET [Descripción]=?, [Precio]=?, [Unidad Compra]=?, [Proveedor]=?, [Procesado]=?, [Error]=?, [Descripción error]=?, [Fecha y hora error]=?, [Pila error]=?  WHERE [Emprcod] = ? AND [Producto] = ?", GX_NOMASK)
         ,new UpdateCursor("T01OD11", "DELETE FROM [Producto]  WHERE [Emprcod] = ? AND [Producto] = ?", GX_NOMASK)
         ,new ForEachCursor("T01OD14", "SELECT [Emprcod], [Producto] FROM [Producto] WITH (NOLOCK) WHERE [Emprcod] = ? ORDER BY [Emprcod], [Producto]  OPTION (FAST 100)",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 26);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,5);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 20);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDateTime(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 26);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,5);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 20);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDateTime(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 26);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,5);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 20);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDateTime(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 3);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
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
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 4 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 6);
               }
               stmt.setString(2, (String)parms[2], 3);
               return;
            case 5 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 6);
               }
               stmt.setString(2, (String)parms[2], 3);
               return;
            case 6 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 6);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 26);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(3, (java.math.BigDecimal)parms[5], 5);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(4, ((Number) parms[7]).shortValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 20);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(6, ((Number) parms[11]).shortValue());
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(7, ((Number) parms[13]).shortValue());
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(8, (String)parms[15], 200);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(9, (java.util.Date)parms[17], false);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[19], 200);
               }
               stmt.setString(11, (String)parms[20], 3);
               return;
            case 7 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 26);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(2, (java.math.BigDecimal)parms[3], 5);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(3, ((Number) parms[5]).shortValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 20);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(5, ((Number) parms[9]).shortValue());
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(6, ((Number) parms[11]).shortValue());
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(7, (String)parms[13], 200);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(8, (java.util.Date)parms[15], false);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(9, (String)parms[17], 200);
               }
               stmt.setString(10, (String)parms[18], 3);
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[20], 6);
               }
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

   public String getDataStoreName( )
   {
      return "EKAMAT";
   }

}

final  class tbcprod__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01OD4", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OD12", "SELECT * FROM (SELECT EmprCod, BCNumeroOP, BCFecCierr, BCNumero, BCLinea FROM TXPOPBCCD WHERE EmprCod = ? AND BCProducto = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01OD13", "SELECT * FROM (SELECT EmprCod, BCCPPedido, BCProducto FROM TXPBCCOMP WHERE EmprCod = ? AND BCProducto = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
      }
   }

}

