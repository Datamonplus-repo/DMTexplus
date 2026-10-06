package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ttsecci_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel5"+"_"+"") == 0 )
      {
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
            AV27EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27EmprCod", AV27EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV27EmprCod, "@!"))));
            AV34SecCodF = httpContext.GetPar( "SecCodF") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34SecCodF", AV34SecCodF);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSECCODF", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV34SecCodF, ""))));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "MANTENIMIENTO SECCIONES, FASES", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtSecCodF_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public ttsecci_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public ttsecci_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ttsecci_impl.class ));
   }

   public ttsecci_impl( int remoteHandle ,
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtSecCodF_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtSecCodF_Internalname, httpContext.getMessage( "Seccion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSecCodF_Internalname, GXutil.rtrim( A6162SecCodF), GXutil.rtrim( localUtil.format( A6162SecCodF, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,22);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSecCodF_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtSecCodF_Enabled, 1, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTSECCI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtSecNomF_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtSecNomF_Internalname, httpContext.getMessage( "Nombre", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSecNomF_Internalname, GXutil.rtrim( A6163SecNomF), GXutil.rtrim( localUtil.format( A6163SecNomF, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,26);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSecNomF_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtSecNomF_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTSECCI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtSecord_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtSecord_Internalname, httpContext.getMessage( "Ordenacion Seccion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSecord_Internalname, GXutil.ltrim( localUtil.ntoc( A6175Secord, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtSecord_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6175Secord), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A6175Secord), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,31);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSecord_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtSecord_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTSECCI.htm");
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
      app.GxWebStd.gx_div_start( httpContext, divDvpanel_unnamedtable1_cell_Internalname, 1, 0, "px", 0, "px", divDvpanel_unnamedtable1_cell_Class, "left", "top", "", "", "div");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtSecMod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtSecMod_Internalname, httpContext.getMessage( "% MOD", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSecMod_Internalname, GXutil.ltrim( localUtil.ntoc( A7601SecMod, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtSecMod_Enabled!=0) ? localUtil.format( A7601SecMod, "ZZ9.99") : localUtil.format( A7601SecMod, "ZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSecMod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtSecMod_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTSECCI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtSecMoi_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtSecMoi_Internalname, httpContext.getMessage( "% MOI", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 45,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSecMoi_Internalname, GXutil.ltrim( localUtil.ntoc( A7602SecMoi, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtSecMoi_Enabled!=0) ? localUtil.format( A7602SecMoi, "ZZ9.99") : localUtil.format( A7602SecMoi, "ZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,45);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSecMoi_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtSecMoi_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTSECCI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtSecCif_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtSecCif_Internalname, httpContext.getMessage( "%  CIF", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 50,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSecCif_Internalname, GXutil.ltrim( localUtil.ntoc( A7603SecCif, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtSecCif_Enabled!=0) ? localUtil.format( A7603SecCif, "ZZ9.99") : localUtil.format( A7603SecCif, "ZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,50);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSecCif_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtSecCif_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTSECCI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtSecProd_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtSecProd_Internalname, httpContext.getMessage( "% Productividad", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSecProd_Internalname, GXutil.ltrim( localUtil.ntoc( A7604SecProd, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtSecProd_Enabled!=0) ? localUtil.format( A7604SecProd, "ZZ9.99") : localUtil.format( A7604SecProd, "ZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,54);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSecProd_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtSecProd_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTSECCI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtSecUndmx_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtSecUndmx_Internalname, httpContext.getMessage( "Unidades Maximas", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSecUndmx_Internalname, GXutil.ltrim( localUtil.ntoc( A7237SecUndmx, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtSecUndmx_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A7237SecUndmx), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A7237SecUndmx), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,59);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSecUndmx_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtSecUndmx_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTSECCI.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTSECCI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTSECCI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 68,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTSECCI.htm");
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
      e11TX2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z6162SecCodF = httpContext.cgiGet( "Z6162SecCodF") ;
            Z6163SecNomF = httpContext.cgiGet( "Z6163SecNomF") ;
            Z6175Secord = (byte)(localUtil.ctol( httpContext.cgiGet( "Z6175Secord"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z7237SecUndmx = (int)(localUtil.ctol( httpContext.cgiGet( "Z7237SecUndmx"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z7601SecMod = localUtil.ctond( httpContext.cgiGet( "Z7601SecMod")) ;
            Z7602SecMoi = localUtil.ctond( httpContext.cgiGet( "Z7602SecMoi")) ;
            Z7603SecCif = localUtil.ctond( httpContext.cgiGet( "Z7603SecCif")) ;
            Z7604SecProd = localUtil.ctond( httpContext.cgiGet( "Z7604SecProd")) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            A13807SecNomFID = httpContext.cgiGet( "SECNOMFID") ;
            AV27EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            A396EmprCod = httpContext.cgiGet( "EMPRCOD") ;
            AV34SecCodF = httpContext.cgiGet( "vSECCODF") ;
            Gx_mode = httpContext.cgiGet( "vMODE") ;
            AV28Msg1 = httpContext.cgiGet( "vMSG1") ;
            A407EmprNom = httpContext.cgiGet( "EMPRNOM") ;
            n407EmprNom = false ;
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
            /* Read variables values. */
            A6162SecCodF = httpContext.cgiGet( edtSecCodF_Internalname) ;
            n6162SecCodF = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6162SecCodF", A6162SecCodF);
            A6163SecNomF = httpContext.cgiGet( edtSecNomF_Internalname) ;
            n6163SecNomF = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6163SecNomF", A6163SecNomF);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtSecord_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtSecord_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "SECORD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtSecord_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A6175Secord = (byte)(0) ;
               n6175Secord = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A6175Secord", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6175Secord), 2, 0));
            }
            else
            {
               A6175Secord = (byte)(localUtil.ctol( httpContext.cgiGet( edtSecord_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n6175Secord = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A6175Secord", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6175Secord), 2, 0));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtSecMod_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtSecMod_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "SECMOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtSecMod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A7601SecMod = DecimalUtil.ZERO ;
               n7601SecMod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A7601SecMod", GXutil.ltrimstr( A7601SecMod, 6, 2));
            }
            else
            {
               A7601SecMod = localUtil.ctond( httpContext.cgiGet( edtSecMod_Internalname)) ;
               n7601SecMod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A7601SecMod", GXutil.ltrimstr( A7601SecMod, 6, 2));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtSecMoi_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtSecMoi_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "SECMOI");
               AnyError = (short)(1) ;
               GX_FocusControl = edtSecMoi_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A7602SecMoi = DecimalUtil.ZERO ;
               n7602SecMoi = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A7602SecMoi", GXutil.ltrimstr( A7602SecMoi, 6, 2));
            }
            else
            {
               A7602SecMoi = localUtil.ctond( httpContext.cgiGet( edtSecMoi_Internalname)) ;
               n7602SecMoi = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A7602SecMoi", GXutil.ltrimstr( A7602SecMoi, 6, 2));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtSecCif_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtSecCif_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "SECCIF");
               AnyError = (short)(1) ;
               GX_FocusControl = edtSecCif_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A7603SecCif = DecimalUtil.ZERO ;
               n7603SecCif = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A7603SecCif", GXutil.ltrimstr( A7603SecCif, 6, 2));
            }
            else
            {
               A7603SecCif = localUtil.ctond( httpContext.cgiGet( edtSecCif_Internalname)) ;
               n7603SecCif = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A7603SecCif", GXutil.ltrimstr( A7603SecCif, 6, 2));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtSecProd_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtSecProd_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "SECPROD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtSecProd_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A7604SecProd = DecimalUtil.ZERO ;
               n7604SecProd = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A7604SecProd", GXutil.ltrimstr( A7604SecProd, 6, 2));
            }
            else
            {
               A7604SecProd = localUtil.ctond( httpContext.cgiGet( edtSecProd_Internalname)) ;
               n7604SecProd = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A7604SecProd", GXutil.ltrimstr( A7604SecProd, 6, 2));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtSecUndmx_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtSecUndmx_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "SECUNDMX");
               AnyError = (short)(1) ;
               GX_FocusControl = edtSecUndmx_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A7237SecUndmx = 0 ;
               n7237SecUndmx = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A7237SecUndmx", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7237SecUndmx), 6, 0));
            }
            else
            {
               A7237SecUndmx = (int)(localUtil.ctol( httpContext.cgiGet( edtSecUndmx_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n7237SecUndmx = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A7237SecUndmx", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7237SecUndmx), 6, 0));
            }
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"TTSECCI");
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( GXutil.strcmp(A6162SecCodF, Z6162SecCodF) != 0 ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("ttsecci:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               A6162SecCodF = httpContext.GetPar( "SecCodF") ;
               n6162SecCodF = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A6162SecCodF", A6162SecCodF);
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
                  sMode899 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  Gx_mode = sMode899 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound899 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_TX0( ) ;
                        if ( AnyError == 0 )
                        {
                           GX_FocusControl = bttBtntrn_enter_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noinsert"), 1, "SECCODF");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtSecCodF_Internalname ;
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
                        e11TX2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e12TX2 ();
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
         e12TX2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAllTX899( ) ;
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
         disableAttributesTX899( ) ;
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

   public void confirm_TX0( )
   {
      beforeValidateTX899( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControlsTX899( ) ;
         }
         else
         {
            checkExtendedTableTX899( ) ;
            closeExtendedTableCursorsTX899( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
   }

   public void resetCaptionTX0( )
   {
   }

   public void e11TX2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV28Msg1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGLR011_", ""), (byte)(99), GXv_char2) ;
      ttsecci_impl.this.GXt_char1 = GXv_char2[0] ;
      AV28Msg1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28Msg1", AV28Msg1);
      GXt_char1 = AV24LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char2) ;
      ttsecci_impl.this.GXt_char1 = GXv_char2[0] ;
      AV24LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24LitFe", AV24LitFe);
      GXt_char1 = AV22Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      ttsecci_impl.this.GXt_char1 = GXv_char2[0] ;
      AV22Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22Station", AV22Station);
      GXv_char2[0] = AV27EmprCod ;
      GXv_char3[0] = AV16EmprNom ;
      GXv_char4[0] = AV17UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV22Station, GXv_char2, GXv_char3, GXv_char4) ;
      ttsecci_impl.this.AV27EmprCod = GXv_char2[0] ;
      ttsecci_impl.this.AV16EmprNom = GXv_char3[0] ;
      ttsecci_impl.this.AV17UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27EmprCod", AV27EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV27EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV16EmprNom", AV16EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
      GXt_int5 = AV29Suprema ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV27EmprCod, httpContext.getMessage( "SUPREM", ""), GXv_int6) ;
      ttsecci_impl.this.GXt_int5 = GXv_int6[0] ;
      AV29Suprema = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29Suprema", GXutil.str( AV29Suprema, 1, 0));
      GXt_char1 = AV22Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      ttsecci_impl.this.GXt_char1 = GXv_char4[0] ;
      AV22Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22Station", AV22Station);
      GXv_char4[0] = AV27EmprCod ;
      GXv_char3[0] = AV16EmprNom ;
      GXv_char2[0] = AV17UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV22Station, GXv_char4, GXv_char3, GXv_char2) ;
      ttsecci_impl.this.AV27EmprCod = GXv_char4[0] ;
      ttsecci_impl.this.AV16EmprNom = GXv_char3[0] ;
      ttsecci_impl.this.AV17UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27EmprCod", AV27EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV27EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV16EmprNom", AV16EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
      GXv_SdtWWPContext7[0] = AV35WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext7) ;
      AV35WWPContext = GXv_SdtWWPContext7[0] ;
      /* Execute user subroutine: 'ATTRIBUTESSECURITYCODE' */
      S112 ();
      if ( returnInSub )
      {
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      AV36TrnContext.fromxml(AV37WebSession.getValue("TrnContext"), null, null);
   }

   public void e12TX2( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV36TrnContext.getgxTv_SdtWWPTransactionContext_Callerondelete() )
      {
         callWebObject(formatLink("app.ttsecciww", new String[] {}, new String[] {}) );
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

   public void S112( )
   {
      /* 'ATTRIBUTESSECURITYCODE' Routine */
      returnInSub = false ;
      divDvpanel_unnamedtable1_cell_Class = "col-xs-12" ;
      httpContext.ajax_rsp_assign_prop("", false, divDvpanel_unnamedtable1_cell_Internalname, "Class", divDvpanel_unnamedtable1_cell_Class, true);
   }

   public void zmTX899( int GX_JID )
   {
      if ( ( GX_JID == 9 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z6163SecNomF = T00TX3_A6163SecNomF[0] ;
            Z6175Secord = T00TX3_A6175Secord[0] ;
            Z7237SecUndmx = T00TX3_A7237SecUndmx[0] ;
            Z7601SecMod = T00TX3_A7601SecMod[0] ;
            Z7602SecMoi = T00TX3_A7602SecMoi[0] ;
            Z7603SecCif = T00TX3_A7603SecCif[0] ;
            Z7604SecProd = T00TX3_A7604SecProd[0] ;
         }
         else
         {
            Z6163SecNomF = A6163SecNomF ;
            Z6175Secord = A6175Secord ;
            Z7237SecUndmx = A7237SecUndmx ;
            Z7601SecMod = A7601SecMod ;
            Z7602SecMoi = A7602SecMoi ;
            Z7603SecCif = A7603SecCif ;
            Z7604SecProd = A7604SecProd ;
         }
      }
      if ( GX_JID == -9 )
      {
         Z6162SecCodF = A6162SecCodF ;
         Z6163SecNomF = A6163SecNomF ;
         Z6175Secord = A6175Secord ;
         Z7237SecUndmx = A7237SecUndmx ;
         Z7601SecMod = A7601SecMod ;
         Z7602SecMoi = A7602SecMoi ;
         Z7603SecCif = A7603SecCif ;
         Z7604SecProd = A7604SecProd ;
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV27EmprCod)==0) )
      {
         A396EmprCod = AV27EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      /* Using cursor T00TX4 */
      pr_default.execute(2, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T00TX4_A407EmprNom[0] ;
      n407EmprNom = T00TX4_n407EmprNom[0] ;
      pr_default.close(2);
      GXt_int5 = (byte)(0) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV27EmprCod, httpContext.getMessage( httpContext.getMessage( "SUPREM", ""), ""), GXv_int6) ;
      ttsecci_impl.this.GXt_int5 = GXv_int6[0] ;
      if ( ! ( ( GXt_int5 == 1 ) ) )
      {
         divDvpanel_unnamedtable1_cell_Class = httpContext.getMessage( "Invisible", "") ;
         httpContext.ajax_rsp_assign_prop("", false, divDvpanel_unnamedtable1_cell_Internalname, "Class", divDvpanel_unnamedtable1_cell_Class, true);
      }
      else
      {
         GXt_int5 = (byte)(0) ;
         GXv_int6[0] = GXt_int5 ;
         new app.pexicon(remoteHandle, context).execute( AV27EmprCod, httpContext.getMessage( httpContext.getMessage( "SUPREM", ""), ""), GXv_int6) ;
         ttsecci_impl.this.GXt_int5 = GXv_int6[0] ;
         if ( GXt_int5 == 1 )
         {
            divDvpanel_unnamedtable1_cell_Class = httpContext.getMessage( "col-xs-12", "") ;
            httpContext.ajax_rsp_assign_prop("", false, divDvpanel_unnamedtable1_cell_Internalname, "Class", divDvpanel_unnamedtable1_cell_Class, true);
         }
      }
      if ( ! (GXutil.strcmp("", AV34SecCodF)==0) )
      {
         A6162SecCodF = AV34SecCodF ;
         n6162SecCodF = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6162SecCodF", A6162SecCodF);
      }
      if ( ! (GXutil.strcmp("", AV34SecCodF)==0) )
      {
         edtSecCodF_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtSecCodF_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSecCodF_Enabled), 5, 0), true);
      }
      else
      {
         edtSecCodF_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtSecCodF_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSecCodF_Enabled), 5, 0), true);
      }
      if ( ! (GXutil.strcmp("", AV34SecCodF)==0) )
      {
         edtSecCodF_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtSecCodF_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSecCodF_Enabled), 5, 0), true);
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

   public void loadTX899( )
   {
      /* Using cursor T00TX5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n6162SecCodF), A6162SecCodF});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound899 = (short)(1) ;
         A407EmprNom = T00TX5_A407EmprNom[0] ;
         n407EmprNom = T00TX5_n407EmprNom[0] ;
         A6163SecNomF = T00TX5_A6163SecNomF[0] ;
         n6163SecNomF = T00TX5_n6163SecNomF[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6163SecNomF", A6163SecNomF);
         A6175Secord = T00TX5_A6175Secord[0] ;
         n6175Secord = T00TX5_n6175Secord[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6175Secord", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6175Secord), 2, 0));
         A7237SecUndmx = T00TX5_A7237SecUndmx[0] ;
         n7237SecUndmx = T00TX5_n7237SecUndmx[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7237SecUndmx", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7237SecUndmx), 6, 0));
         A7601SecMod = T00TX5_A7601SecMod[0] ;
         n7601SecMod = T00TX5_n7601SecMod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7601SecMod", GXutil.ltrimstr( A7601SecMod, 6, 2));
         A7602SecMoi = T00TX5_A7602SecMoi[0] ;
         n7602SecMoi = T00TX5_n7602SecMoi[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7602SecMoi", GXutil.ltrimstr( A7602SecMoi, 6, 2));
         A7603SecCif = T00TX5_A7603SecCif[0] ;
         n7603SecCif = T00TX5_n7603SecCif[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7603SecCif", GXutil.ltrimstr( A7603SecCif, 6, 2));
         A7604SecProd = T00TX5_A7604SecProd[0] ;
         n7604SecProd = T00TX5_n7604SecProd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7604SecProd", GXutil.ltrimstr( A7604SecProd, 6, 2));
         zmTX899( -9) ;
      }
      pr_default.close(3);
      onLoadActionsTX899( ) ;
   }

   public void onLoadActionsTX899( )
   {
      A13807SecNomFID = GXutil.trim( A6163SecNomF) + "(" + GXutil.trim( A6162SecCodF) + ")" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13807SecNomFID", A13807SecNomFID);
   }

   public void checkExtendedTableTX899( )
   {
      nIsDirty_899 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      nIsDirty_899 = (short)(1) ;
      A13807SecNomFID = GXutil.trim( A6163SecNomF) + "(" + GXutil.trim( A6162SecCodF) + ")" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13807SecNomFID", A13807SecNomFID);
   }

   public void closeExtendedTableCursorsTX899( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKeyTX899( )
   {
      /* Using cursor T00TX6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Boolean.valueOf(n6162SecCodF), A6162SecCodF});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound899 = (short)(1) ;
      }
      else
      {
         RcdFound899 = (short)(0) ;
      }
      pr_default.close(4);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T00TX3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Boolean.valueOf(n6162SecCodF), A6162SecCodF});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zmTX899( 9) ;
         RcdFound899 = (short)(1) ;
         A6162SecCodF = T00TX3_A6162SecCodF[0] ;
         n6162SecCodF = T00TX3_n6162SecCodF[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6162SecCodF", A6162SecCodF);
         A6163SecNomF = T00TX3_A6163SecNomF[0] ;
         n6163SecNomF = T00TX3_n6163SecNomF[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6163SecNomF", A6163SecNomF);
         A6175Secord = T00TX3_A6175Secord[0] ;
         n6175Secord = T00TX3_n6175Secord[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6175Secord", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6175Secord), 2, 0));
         A7237SecUndmx = T00TX3_A7237SecUndmx[0] ;
         n7237SecUndmx = T00TX3_n7237SecUndmx[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7237SecUndmx", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7237SecUndmx), 6, 0));
         A7601SecMod = T00TX3_A7601SecMod[0] ;
         n7601SecMod = T00TX3_n7601SecMod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7601SecMod", GXutil.ltrimstr( A7601SecMod, 6, 2));
         A7602SecMoi = T00TX3_A7602SecMoi[0] ;
         n7602SecMoi = T00TX3_n7602SecMoi[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7602SecMoi", GXutil.ltrimstr( A7602SecMoi, 6, 2));
         A7603SecCif = T00TX3_A7603SecCif[0] ;
         n7603SecCif = T00TX3_n7603SecCif[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7603SecCif", GXutil.ltrimstr( A7603SecCif, 6, 2));
         A7604SecProd = T00TX3_A7604SecProd[0] ;
         n7604SecProd = T00TX3_n7604SecProd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7604SecProd", GXutil.ltrimstr( A7604SecProd, 6, 2));
         A396EmprCod = T00TX3_A396EmprCod[0] ;
         Z396EmprCod = A396EmprCod ;
         Z6162SecCodF = A6162SecCodF ;
         sMode899 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         loadTX899( ) ;
         if ( AnyError == 1 )
         {
            RcdFound899 = (short)(0) ;
            initializeNonKeyTX899( ) ;
         }
         Gx_mode = sMode899 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound899 = (short)(0) ;
         initializeNonKeyTX899( ) ;
         sMode899 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode899 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKeyTX899( ) ;
      if ( RcdFound899 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound899 = (short)(0) ;
      /* Using cursor T00TX7 */
      pr_default.execute(5, new Object[] {A396EmprCod, A396EmprCod, Boolean.valueOf(n6162SecCodF), A6162SecCodF});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( ( GXutil.strcmp(T00TX7_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T00TX7_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T00TX7_A6162SecCodF[0], A6162SecCodF) < 0 ) ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( ( GXutil.strcmp(T00TX7_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T00TX7_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T00TX7_A6162SecCodF[0], A6162SecCodF) > 0 ) ) )
         {
            A396EmprCod = T00TX7_A396EmprCod[0] ;
            A6162SecCodF = T00TX7_A6162SecCodF[0] ;
            n6162SecCodF = T00TX7_n6162SecCodF[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A6162SecCodF", A6162SecCodF);
            RcdFound899 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void move_previous( )
   {
      RcdFound899 = (short)(0) ;
      /* Using cursor T00TX8 */
      pr_default.execute(6, new Object[] {A396EmprCod, A396EmprCod, Boolean.valueOf(n6162SecCodF), A6162SecCodF});
      if ( (pr_default.getStatus(6) != 101) )
      {
         while ( (pr_default.getStatus(6) != 101) && ( ( GXutil.strcmp(T00TX8_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T00TX8_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T00TX8_A6162SecCodF[0], A6162SecCodF) > 0 ) ) )
         {
            pr_default.readNext(6);
         }
         if ( (pr_default.getStatus(6) != 101) && ( ( GXutil.strcmp(T00TX8_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T00TX8_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T00TX8_A6162SecCodF[0], A6162SecCodF) < 0 ) ) )
         {
            A396EmprCod = T00TX8_A396EmprCod[0] ;
            A6162SecCodF = T00TX8_A6162SecCodF[0] ;
            n6162SecCodF = T00TX8_n6162SecCodF[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A6162SecCodF", A6162SecCodF);
            RcdFound899 = (short)(1) ;
         }
      }
      pr_default.close(6);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKeyTX899( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtSecCodF_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insertTX899( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound899 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A6162SecCodF, Z6162SecCodF) != 0 ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A6162SecCodF = Z6162SecCodF ;
               n6162SecCodF = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A6162SecCodF", A6162SecCodF);
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "SECCODF");
               AnyError = (short)(1) ;
               GX_FocusControl = edtSecCodF_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtSecCodF_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               updateTX899( ) ;
               GX_FocusControl = edtSecCodF_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A6162SecCodF, Z6162SecCodF) != 0 ) )
            {
               /* Insert record */
               GX_FocusControl = edtSecCodF_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insertTX899( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "SECCODF");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtSecCodF_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  /* Insert record */
                  GX_FocusControl = edtSecCodF_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insertTX899( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A6162SecCodF, Z6162SecCodF) != 0 ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A6162SecCodF = Z6162SecCodF ;
         n6162SecCodF = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6162SecCodF", A6162SecCodF);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "SECCODF");
         AnyError = (short)(1) ;
         GX_FocusControl = edtSecCodF_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtSecCodF_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrencyTX899( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00TX2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Boolean.valueOf(n6162SecCodF), A6162SecCodF});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPTSECCI"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z6163SecNomF, T00TX2_A6163SecNomF[0]) != 0 ) || ( Z6175Secord != T00TX2_A6175Secord[0] ) || ( Z7237SecUndmx != T00TX2_A7237SecUndmx[0] ) || ( DecimalUtil.compareTo(Z7601SecMod, T00TX2_A7601SecMod[0]) != 0 ) || ( DecimalUtil.compareTo(Z7602SecMoi, T00TX2_A7602SecMoi[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z7603SecCif, T00TX2_A7603SecCif[0]) != 0 ) || ( DecimalUtil.compareTo(Z7604SecProd, T00TX2_A7604SecProd[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z6163SecNomF, T00TX2_A6163SecNomF[0]) != 0 )
            {
               GXutil.writeLogln("ttsecci:[seudo value changed for attri]"+"SecNomF");
               GXutil.writeLogRaw("Old: ",Z6163SecNomF);
               GXutil.writeLogRaw("Current: ",T00TX2_A6163SecNomF[0]);
            }
            if ( Z6175Secord != T00TX2_A6175Secord[0] )
            {
               GXutil.writeLogln("ttsecci:[seudo value changed for attri]"+"Secord");
               GXutil.writeLogRaw("Old: ",Z6175Secord);
               GXutil.writeLogRaw("Current: ",T00TX2_A6175Secord[0]);
            }
            if ( Z7237SecUndmx != T00TX2_A7237SecUndmx[0] )
            {
               GXutil.writeLogln("ttsecci:[seudo value changed for attri]"+"SecUndmx");
               GXutil.writeLogRaw("Old: ",Z7237SecUndmx);
               GXutil.writeLogRaw("Current: ",T00TX2_A7237SecUndmx[0]);
            }
            if ( DecimalUtil.compareTo(Z7601SecMod, T00TX2_A7601SecMod[0]) != 0 )
            {
               GXutil.writeLogln("ttsecci:[seudo value changed for attri]"+"SecMod");
               GXutil.writeLogRaw("Old: ",Z7601SecMod);
               GXutil.writeLogRaw("Current: ",T00TX2_A7601SecMod[0]);
            }
            if ( DecimalUtil.compareTo(Z7602SecMoi, T00TX2_A7602SecMoi[0]) != 0 )
            {
               GXutil.writeLogln("ttsecci:[seudo value changed for attri]"+"SecMoi");
               GXutil.writeLogRaw("Old: ",Z7602SecMoi);
               GXutil.writeLogRaw("Current: ",T00TX2_A7602SecMoi[0]);
            }
            if ( DecimalUtil.compareTo(Z7603SecCif, T00TX2_A7603SecCif[0]) != 0 )
            {
               GXutil.writeLogln("ttsecci:[seudo value changed for attri]"+"SecCif");
               GXutil.writeLogRaw("Old: ",Z7603SecCif);
               GXutil.writeLogRaw("Current: ",T00TX2_A7603SecCif[0]);
            }
            if ( DecimalUtil.compareTo(Z7604SecProd, T00TX2_A7604SecProd[0]) != 0 )
            {
               GXutil.writeLogln("ttsecci:[seudo value changed for attri]"+"SecProd");
               GXutil.writeLogRaw("Old: ",Z7604SecProd);
               GXutil.writeLogRaw("Current: ",T00TX2_A7604SecProd[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPTSECCI"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertTX899( )
   {
      beforeValidateTX899( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableTX899( ) ;
      }
      if ( AnyError == 0 )
      {
         zmTX899( 0) ;
         checkOptimisticConcurrencyTX899( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmTX899( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertTX899( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00TX9 */
                  pr_default.execute(7, new Object[] {Boolean.valueOf(n6162SecCodF), A6162SecCodF, Boolean.valueOf(n6163SecNomF), A6163SecNomF, Boolean.valueOf(n6175Secord), Byte.valueOf(A6175Secord), Boolean.valueOf(n7237SecUndmx), Integer.valueOf(A7237SecUndmx), Boolean.valueOf(n7601SecMod), A7601SecMod, Boolean.valueOf(n7602SecMoi), A7602SecMoi, Boolean.valueOf(n7603SecCif), A7603SecCif, Boolean.valueOf(n7604SecProd), A7604SecProd, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTSECCI");
                  if ( (pr_default.getStatus(7) == 1) )
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
                        resetCaptionTX0( ) ;
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
            loadTX899( ) ;
         }
         endLevelTX899( ) ;
      }
      closeExtendedTableCursorsTX899( ) ;
   }

   public void updateTX899( )
   {
      beforeValidateTX899( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableTX899( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyTX899( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmTX899( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdateTX899( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00TX10 */
                  pr_default.execute(8, new Object[] {Boolean.valueOf(n6163SecNomF), A6163SecNomF, Boolean.valueOf(n6175Secord), Byte.valueOf(A6175Secord), Boolean.valueOf(n7237SecUndmx), Integer.valueOf(A7237SecUndmx), Boolean.valueOf(n7601SecMod), A7601SecMod, Boolean.valueOf(n7602SecMoi), A7602SecMoi, Boolean.valueOf(n7603SecCif), A7603SecCif, Boolean.valueOf(n7604SecProd), A7604SecProd, A396EmprCod, Boolean.valueOf(n6162SecCodF), A6162SecCodF});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTSECCI");
                  if ( (pr_default.getStatus(8) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPTSECCI"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdateTX899( ) ;
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
         endLevelTX899( ) ;
      }
      closeExtendedTableCursorsTX899( ) ;
   }

   public void deferredUpdateTX899( )
   {
   }

   public void delete( )
   {
      beforeValidateTX899( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyTX899( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsTX899( ) ;
         afterConfirmTX899( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteTX899( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T00TX11 */
               pr_default.execute(9, new Object[] {A396EmprCod, Boolean.valueOf(n6162SecCodF), A6162SecCodF});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTSECCI");
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
      sMode899 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelTX899( ) ;
      Gx_mode = sMode899 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsTX899( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         A13807SecNomFID = GXutil.trim( A6163SecNomF) + "(" + GXutil.trim( A6162SecCodF) + ")" ;
         httpContext.ajax_rsp_assign_attri("", false, "A13807SecNomFID", A13807SecNomFID);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T00TX12 */
         pr_default.execute(10, new Object[] {A396EmprCod, Boolean.valueOf(n6162SecCodF), A6162SecCodF});
         if ( (pr_default.getStatus(10) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "FASPRO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(10);
      }
   }

   public void endLevelTX899( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeCompleteTX899( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "ttsecci");
         if ( AnyError == 0 )
         {
            confirmValuesTX0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "ttsecci");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStartTX899( )
   {
      /* Scan By routine */
      /* Using cursor T00TX13 */
      pr_default.execute(11);
      RcdFound899 = (short)(0) ;
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound899 = (short)(1) ;
         A396EmprCod = T00TX13_A396EmprCod[0] ;
         A6162SecCodF = T00TX13_A6162SecCodF[0] ;
         n6162SecCodF = T00TX13_n6162SecCodF[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6162SecCodF", A6162SecCodF);
      }
      /* Load Subordinate Levels */
   }

   public void scanNextTX899( )
   {
      /* Scan next routine */
      pr_default.readNext(11);
      RcdFound899 = (short)(0) ;
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound899 = (short)(1) ;
         A396EmprCod = T00TX13_A396EmprCod[0] ;
         A6162SecCodF = T00TX13_A6162SecCodF[0] ;
         n6162SecCodF = T00TX13_n6162SecCodF[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6162SecCodF", A6162SecCodF);
      }
   }

   public void scanEndTX899( )
   {
      pr_default.close(11);
   }

   public void afterConfirmTX899( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsertTX899( )
   {
      /* Before Insert Rules */
      if ( (GXutil.strcmp("", A6162SecCodF)==0) && ( GXutil.strcmp(Gx_mode, "INS") == 0 ) )
      {
         httpContext.GX_msglist.addItem(AV28Msg1, 1, "SECCODF");
         AnyError = (short)(1) ;
         GX_FocusControl = edtSecCodF_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void beforeUpdateTX899( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteTX899( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteTX899( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateTX899( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesTX899( )
   {
      edtSecCodF_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSecCodF_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSecCodF_Enabled), 5, 0), true);
      edtSecNomF_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSecNomF_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSecNomF_Enabled), 5, 0), true);
      edtSecord_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSecord_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSecord_Enabled), 5, 0), true);
      edtSecMod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSecMod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSecMod_Enabled), 5, 0), true);
      edtSecMoi_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSecMoi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSecMoi_Enabled), 5, 0), true);
      edtSecCif_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSecCif_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSecCif_Enabled), 5, 0), true);
      edtSecProd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSecProd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSecProd_Enabled), 5, 0), true);
      edtSecUndmx_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSecUndmx_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSecUndmx_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashesTX899( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValuesTX0( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.ttsecci", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV27EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV34SecCodF))}, new String[] {"Gx_mode","EmprCod","SecCodF"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"TTSECCI");
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("ttsecci:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6162SecCodF", GXutil.rtrim( Z6162SecCodF));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6163SecNomF", GXutil.rtrim( Z6163SecNomF));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6175Secord", GXutil.ltrim( localUtil.ntoc( Z6175Secord, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7237SecUndmx", GXutil.ltrim( localUtil.ntoc( Z7237SecUndmx, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7601SecMod", GXutil.ltrim( localUtil.ntoc( Z7601SecMod, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7602SecMoi", GXutil.ltrim( localUtil.ntoc( Z7602SecMoi, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7603SecCif", GXutil.ltrim( localUtil.ntoc( Z7603SecCif, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7604SecProd", GXutil.ltrim( localUtil.ntoc( Z7604SecProd, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTRNCONTEXT", AV36TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTRNCONTEXT", AV36TrnContext);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTRNCONTEXT", getSecureSignedToken( "", AV36TrnContext));
      app.GxWebStd.gx_hidden_field( httpContext, "SECNOMFID", A13807SecNomFID);
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV27EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV27EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vSECCODF", GXutil.rtrim( AV34SecCodF));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSECCODF", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV34SecCodF, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMSG1", GXutil.rtrim( AV28Msg1));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRNOM", GXutil.rtrim( A407EmprNom));
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
      return formatLink("app.ttsecci", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV27EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV34SecCodF))}, new String[] {"Gx_mode","EmprCod","SecCodF"})  ;
   }

   public String getPgmname( )
   {
      return "TTSECCI" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "MANTENIMIENTO SECCIONES, FASES", "") ;
   }

   public void initializeNonKeyTX899( )
   {
      A13807SecNomFID = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13807SecNomFID", A13807SecNomFID);
      A6163SecNomF = "" ;
      n6163SecNomF = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6163SecNomF", A6163SecNomF);
      A6175Secord = (byte)(0) ;
      n6175Secord = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6175Secord", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6175Secord), 2, 0));
      A7237SecUndmx = 0 ;
      n7237SecUndmx = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7237SecUndmx", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7237SecUndmx), 6, 0));
      A7601SecMod = DecimalUtil.ZERO ;
      n7601SecMod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7601SecMod", GXutil.ltrimstr( A7601SecMod, 6, 2));
      A7602SecMoi = DecimalUtil.ZERO ;
      n7602SecMoi = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7602SecMoi", GXutil.ltrimstr( A7602SecMoi, 6, 2));
      A7603SecCif = DecimalUtil.ZERO ;
      n7603SecCif = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7603SecCif", GXutil.ltrimstr( A7603SecCif, 6, 2));
      A7604SecProd = DecimalUtil.ZERO ;
      n7604SecProd = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7604SecProd", GXutil.ltrimstr( A7604SecProd, 6, 2));
      Z6163SecNomF = "" ;
      Z6175Secord = (byte)(0) ;
      Z7237SecUndmx = 0 ;
      Z7601SecMod = DecimalUtil.ZERO ;
      Z7602SecMoi = DecimalUtil.ZERO ;
      Z7603SecCif = DecimalUtil.ZERO ;
      Z7604SecProd = DecimalUtil.ZERO ;
   }

   public void initAllTX899( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A6162SecCodF = "" ;
      n6162SecCodF = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6162SecCodF", A6162SecCodF);
      initializeNonKeyTX899( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?2026821165581", true, true);
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
      httpContext.AddJavascriptSource("ttsecci.js", "?2026821165581", false, true);
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
      edtSecCodF_Internalname = "SECCODF" ;
      edtSecNomF_Internalname = "SECNOMF" ;
      edtSecord_Internalname = "SECORD" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      edtSecMod_Internalname = "SECMOD" ;
      edtSecMoi_Internalname = "SECMOI" ;
      edtSecCif_Internalname = "SECCIF" ;
      edtSecProd_Internalname = "SECPROD" ;
      edtSecUndmx_Internalname = "SECUNDMX" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = "DVPANEL_UNNAMEDTABLE1" ;
      divDvpanel_unnamedtable1_cell_Internalname = "DVPANEL_UNNAMEDTABLE1_CELL" ;
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
      Form.setCaption( httpContext.getMessage( "MANTENIMIENTO SECCIONES, FASES", "") );
      bttBtntrn_delete_Enabled = 0 ;
      bttBtntrn_delete_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      edtSecUndmx_Jsonclick = "" ;
      edtSecUndmx_Enabled = 1 ;
      edtSecProd_Jsonclick = "" ;
      edtSecProd_Enabled = 1 ;
      edtSecCif_Jsonclick = "" ;
      edtSecCif_Enabled = 1 ;
      edtSecMoi_Jsonclick = "" ;
      edtSecMoi_Enabled = 1 ;
      edtSecMod_Jsonclick = "" ;
      edtSecMod_Enabled = 1 ;
      Dvpanel_unnamedtable1_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Iconposition = "Right" ;
      Dvpanel_unnamedtable1_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsed = GXutil.toBoolean( 1) ;
      Dvpanel_unnamedtable1_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Title = httpContext.getMessage( "Lavanderia", "") ;
      Dvpanel_unnamedtable1_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable1_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Width = "100%" ;
      divDvpanel_unnamedtable1_cell_Class = "col-xs-12" ;
      edtSecord_Jsonclick = "" ;
      edtSecord_Enabled = 1 ;
      edtSecNomF_Jsonclick = "" ;
      edtSecNomF_Enabled = 1 ;
      edtSecCodF_Jsonclick = "" ;
      edtSecCodF_Enabled = 1 ;
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV27EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV34SecCodF',fld:'vSECCODF',pic:'',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV36TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true},{av:'AV27EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV34SecCodF',fld:'vSECCODF',pic:'',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e12TX2',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV36TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true}]");
      setEventMetadata("AFTER TRN",",oparms:[]}");
      setEventMetadata("VALID_SECCODF","{handler:'valid_Seccodf',iparms:[]");
      setEventMetadata("VALID_SECCODF",",oparms:[]}");
      setEventMetadata("VALID_SECNOMF","{handler:'valid_Secnomf',iparms:[]");
      setEventMetadata("VALID_SECNOMF",",oparms:[]}");
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
      wcpOAV27EmprCod = "" ;
      wcpOAV34SecCodF = "" ;
      Z396EmprCod = "" ;
      Z6162SecCodF = "" ;
      Z6163SecNomF = "" ;
      Z7601SecMod = DecimalUtil.ZERO ;
      Z7602SecMoi = DecimalUtil.ZERO ;
      Z7603SecCif = DecimalUtil.ZERO ;
      Z7604SecProd = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      Gx_mode = "" ;
      AV27EmprCod = "" ;
      AV34SecCodF = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      A6162SecCodF = "" ;
      A6163SecNomF = "" ;
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      A7601SecMod = DecimalUtil.ZERO ;
      A7602SecMoi = DecimalUtil.ZERO ;
      A7603SecCif = DecimalUtil.ZERO ;
      A7604SecProd = DecimalUtil.ZERO ;
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      A13807SecNomFID = "" ;
      A396EmprCod = "" ;
      AV28Msg1 = "" ;
      A407EmprNom = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      Dvpanel_unnamedtable1_Objectcall = "" ;
      Dvpanel_unnamedtable1_Class = "" ;
      Dvpanel_unnamedtable1_Height = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode899 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      AV24LitFe = "" ;
      AV22Station = "" ;
      AV16EmprNom = "" ;
      AV17UsurCod = "" ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      AV35WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV36TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV37WebSession = httpContext.getWebSession();
      Z407EmprNom = "" ;
      T00TX4_A407EmprNom = new String[] {""} ;
      T00TX4_n407EmprNom = new boolean[] {false} ;
      GXv_int6 = new byte[1] ;
      T00TX5_A6162SecCodF = new String[] {""} ;
      T00TX5_n6162SecCodF = new boolean[] {false} ;
      T00TX5_A407EmprNom = new String[] {""} ;
      T00TX5_n407EmprNom = new boolean[] {false} ;
      T00TX5_A6163SecNomF = new String[] {""} ;
      T00TX5_n6163SecNomF = new boolean[] {false} ;
      T00TX5_A6175Secord = new byte[1] ;
      T00TX5_n6175Secord = new boolean[] {false} ;
      T00TX5_A7237SecUndmx = new int[1] ;
      T00TX5_n7237SecUndmx = new boolean[] {false} ;
      T00TX5_A7601SecMod = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00TX5_n7601SecMod = new boolean[] {false} ;
      T00TX5_A7602SecMoi = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00TX5_n7602SecMoi = new boolean[] {false} ;
      T00TX5_A7603SecCif = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00TX5_n7603SecCif = new boolean[] {false} ;
      T00TX5_A7604SecProd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00TX5_n7604SecProd = new boolean[] {false} ;
      T00TX5_A396EmprCod = new String[] {""} ;
      T00TX6_A396EmprCod = new String[] {""} ;
      T00TX6_A6162SecCodF = new String[] {""} ;
      T00TX6_n6162SecCodF = new boolean[] {false} ;
      T00TX3_A6162SecCodF = new String[] {""} ;
      T00TX3_n6162SecCodF = new boolean[] {false} ;
      T00TX3_A6163SecNomF = new String[] {""} ;
      T00TX3_n6163SecNomF = new boolean[] {false} ;
      T00TX3_A6175Secord = new byte[1] ;
      T00TX3_n6175Secord = new boolean[] {false} ;
      T00TX3_A7237SecUndmx = new int[1] ;
      T00TX3_n7237SecUndmx = new boolean[] {false} ;
      T00TX3_A7601SecMod = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00TX3_n7601SecMod = new boolean[] {false} ;
      T00TX3_A7602SecMoi = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00TX3_n7602SecMoi = new boolean[] {false} ;
      T00TX3_A7603SecCif = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00TX3_n7603SecCif = new boolean[] {false} ;
      T00TX3_A7604SecProd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00TX3_n7604SecProd = new boolean[] {false} ;
      T00TX3_A396EmprCod = new String[] {""} ;
      T00TX7_A396EmprCod = new String[] {""} ;
      T00TX7_A6162SecCodF = new String[] {""} ;
      T00TX7_n6162SecCodF = new boolean[] {false} ;
      T00TX8_A396EmprCod = new String[] {""} ;
      T00TX8_A6162SecCodF = new String[] {""} ;
      T00TX8_n6162SecCodF = new boolean[] {false} ;
      T00TX2_A6162SecCodF = new String[] {""} ;
      T00TX2_n6162SecCodF = new boolean[] {false} ;
      T00TX2_A6163SecNomF = new String[] {""} ;
      T00TX2_n6163SecNomF = new boolean[] {false} ;
      T00TX2_A6175Secord = new byte[1] ;
      T00TX2_n6175Secord = new boolean[] {false} ;
      T00TX2_A7237SecUndmx = new int[1] ;
      T00TX2_n7237SecUndmx = new boolean[] {false} ;
      T00TX2_A7601SecMod = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00TX2_n7601SecMod = new boolean[] {false} ;
      T00TX2_A7602SecMoi = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00TX2_n7602SecMoi = new boolean[] {false} ;
      T00TX2_A7603SecCif = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00TX2_n7603SecCif = new boolean[] {false} ;
      T00TX2_A7604SecProd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00TX2_n7604SecProd = new boolean[] {false} ;
      T00TX2_A396EmprCod = new String[] {""} ;
      T00TX12_A396EmprCod = new String[] {""} ;
      T00TX12_A457FasCod = new String[] {""} ;
      T00TX13_A396EmprCod = new String[] {""} ;
      T00TX13_A6162SecCodF = new String[] {""} ;
      T00TX13_n6162SecCodF = new boolean[] {false} ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.ttsecci__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.ttsecci__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.ttsecci__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.ttsecci__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ttsecci__default(),
         new Object[] {
             new Object[] {
            T00TX2_A6162SecCodF, T00TX2_A6163SecNomF, T00TX2_n6163SecNomF, T00TX2_A6175Secord, T00TX2_n6175Secord, T00TX2_A7237SecUndmx, T00TX2_n7237SecUndmx, T00TX2_A7601SecMod, T00TX2_n7601SecMod, T00TX2_A7602SecMoi,
            T00TX2_n7602SecMoi, T00TX2_A7603SecCif, T00TX2_n7603SecCif, T00TX2_A7604SecProd, T00TX2_n7604SecProd, T00TX2_A396EmprCod
            }
            , new Object[] {
            T00TX3_A6162SecCodF, T00TX3_A6163SecNomF, T00TX3_n6163SecNomF, T00TX3_A6175Secord, T00TX3_n6175Secord, T00TX3_A7237SecUndmx, T00TX3_n7237SecUndmx, T00TX3_A7601SecMod, T00TX3_n7601SecMod, T00TX3_A7602SecMoi,
            T00TX3_n7602SecMoi, T00TX3_A7603SecCif, T00TX3_n7603SecCif, T00TX3_A7604SecProd, T00TX3_n7604SecProd, T00TX3_A396EmprCod
            }
            , new Object[] {
            T00TX4_A407EmprNom, T00TX4_n407EmprNom
            }
            , new Object[] {
            T00TX5_A6162SecCodF, T00TX5_A407EmprNom, T00TX5_n407EmprNom, T00TX5_A6163SecNomF, T00TX5_n6163SecNomF, T00TX5_A6175Secord, T00TX5_n6175Secord, T00TX5_A7237SecUndmx, T00TX5_n7237SecUndmx, T00TX5_A7601SecMod,
            T00TX5_n7601SecMod, T00TX5_A7602SecMoi, T00TX5_n7602SecMoi, T00TX5_A7603SecCif, T00TX5_n7603SecCif, T00TX5_A7604SecProd, T00TX5_n7604SecProd, T00TX5_A396EmprCod
            }
            , new Object[] {
            T00TX6_A396EmprCod, T00TX6_A6162SecCodF
            }
            , new Object[] {
            T00TX7_A396EmprCod, T00TX7_A6162SecCodF
            }
            , new Object[] {
            T00TX8_A396EmprCod, T00TX8_A6162SecCodF
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00TX12_A396EmprCod, T00TX12_A457FasCod
            }
            , new Object[] {
            T00TX13_A396EmprCod, T00TX13_A6162SecCodF
            }
         }
      );
   }

   private byte Z6175Secord ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A6175Secord ;
   private byte AV29Suprema ;
   private byte GXt_int5 ;
   private byte GXv_int6[] ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound899 ;
   private short nIsDirty_899 ;
   private int Z7237SecUndmx ;
   private int trnEnded ;
   private int edtSecCodF_Enabled ;
   private int edtSecNomF_Enabled ;
   private int edtSecord_Enabled ;
   private int edtSecMod_Enabled ;
   private int edtSecMoi_Enabled ;
   private int edtSecCif_Enabled ;
   private int edtSecProd_Enabled ;
   private int A7237SecUndmx ;
   private int edtSecUndmx_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int GX_JID ;
   private int idxLst ;
   private java.math.BigDecimal Z7601SecMod ;
   private java.math.BigDecimal Z7602SecMoi ;
   private java.math.BigDecimal Z7603SecCif ;
   private java.math.BigDecimal Z7604SecProd ;
   private java.math.BigDecimal A7601SecMod ;
   private java.math.BigDecimal A7602SecMoi ;
   private java.math.BigDecimal A7603SecCif ;
   private java.math.BigDecimal A7604SecProd ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV27EmprCod ;
   private String wcpOAV34SecCodF ;
   private String Z396EmprCod ;
   private String Z6162SecCodF ;
   private String Z6163SecNomF ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String Gx_mode ;
   private String AV27EmprCod ;
   private String AV34SecCodF ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtSecCodF_Internalname ;
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
   private String A6162SecCodF ;
   private String edtSecCodF_Jsonclick ;
   private String edtSecNomF_Internalname ;
   private String A6163SecNomF ;
   private String edtSecNomF_Jsonclick ;
   private String edtSecord_Internalname ;
   private String edtSecord_Jsonclick ;
   private String divDvpanel_unnamedtable1_cell_Internalname ;
   private String divDvpanel_unnamedtable1_cell_Class ;
   private String Dvpanel_unnamedtable1_Width ;
   private String Dvpanel_unnamedtable1_Cls ;
   private String Dvpanel_unnamedtable1_Title ;
   private String Dvpanel_unnamedtable1_Iconposition ;
   private String Dvpanel_unnamedtable1_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String edtSecMod_Internalname ;
   private String edtSecMod_Jsonclick ;
   private String edtSecMoi_Internalname ;
   private String edtSecMoi_Jsonclick ;
   private String edtSecCif_Internalname ;
   private String edtSecCif_Jsonclick ;
   private String edtSecProd_Internalname ;
   private String edtSecProd_Jsonclick ;
   private String edtSecUndmx_Internalname ;
   private String edtSecUndmx_Jsonclick ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String A396EmprCod ;
   private String AV28Msg1 ;
   private String A407EmprNom ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String Dvpanel_unnamedtable1_Objectcall ;
   private String Dvpanel_unnamedtable1_Class ;
   private String Dvpanel_unnamedtable1_Height ;
   private String hsh ;
   private String sMode899 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String AV24LitFe ;
   private String AV22Station ;
   private String AV16EmprNom ;
   private String AV17UsurCod ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String Z407EmprNom ;
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
   private boolean Dvpanel_unnamedtable1_Autowidth ;
   private boolean Dvpanel_unnamedtable1_Autoheight ;
   private boolean Dvpanel_unnamedtable1_Collapsible ;
   private boolean Dvpanel_unnamedtable1_Collapsed ;
   private boolean Dvpanel_unnamedtable1_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable1_Autoscroll ;
   private boolean n407EmprNom ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean Dvpanel_unnamedtable1_Enabled ;
   private boolean Dvpanel_unnamedtable1_Showheader ;
   private boolean Dvpanel_unnamedtable1_Visible ;
   private boolean n6162SecCodF ;
   private boolean n6163SecNomF ;
   private boolean n6175Secord ;
   private boolean n7601SecMod ;
   private boolean n7602SecMoi ;
   private boolean n7603SecCif ;
   private boolean n7604SecProd ;
   private boolean n7237SecUndmx ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private String A13807SecNomFID ;
   private com.genexus.webpanels.WebSession AV37WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private String[] T00TX4_A407EmprNom ;
   private boolean[] T00TX4_n407EmprNom ;
   private String[] T00TX5_A6162SecCodF ;
   private boolean[] T00TX5_n6162SecCodF ;
   private String[] T00TX5_A407EmprNom ;
   private boolean[] T00TX5_n407EmprNom ;
   private String[] T00TX5_A6163SecNomF ;
   private boolean[] T00TX5_n6163SecNomF ;
   private byte[] T00TX5_A6175Secord ;
   private boolean[] T00TX5_n6175Secord ;
   private int[] T00TX5_A7237SecUndmx ;
   private boolean[] T00TX5_n7237SecUndmx ;
   private java.math.BigDecimal[] T00TX5_A7601SecMod ;
   private boolean[] T00TX5_n7601SecMod ;
   private java.math.BigDecimal[] T00TX5_A7602SecMoi ;
   private boolean[] T00TX5_n7602SecMoi ;
   private java.math.BigDecimal[] T00TX5_A7603SecCif ;
   private boolean[] T00TX5_n7603SecCif ;
   private java.math.BigDecimal[] T00TX5_A7604SecProd ;
   private boolean[] T00TX5_n7604SecProd ;
   private String[] T00TX5_A396EmprCod ;
   private String[] T00TX6_A396EmprCod ;
   private String[] T00TX6_A6162SecCodF ;
   private boolean[] T00TX6_n6162SecCodF ;
   private String[] T00TX3_A6162SecCodF ;
   private boolean[] T00TX3_n6162SecCodF ;
   private String[] T00TX3_A6163SecNomF ;
   private boolean[] T00TX3_n6163SecNomF ;
   private byte[] T00TX3_A6175Secord ;
   private boolean[] T00TX3_n6175Secord ;
   private int[] T00TX3_A7237SecUndmx ;
   private boolean[] T00TX3_n7237SecUndmx ;
   private java.math.BigDecimal[] T00TX3_A7601SecMod ;
   private boolean[] T00TX3_n7601SecMod ;
   private java.math.BigDecimal[] T00TX3_A7602SecMoi ;
   private boolean[] T00TX3_n7602SecMoi ;
   private java.math.BigDecimal[] T00TX3_A7603SecCif ;
   private boolean[] T00TX3_n7603SecCif ;
   private java.math.BigDecimal[] T00TX3_A7604SecProd ;
   private boolean[] T00TX3_n7604SecProd ;
   private String[] T00TX3_A396EmprCod ;
   private String[] T00TX7_A396EmprCod ;
   private String[] T00TX7_A6162SecCodF ;
   private boolean[] T00TX7_n6162SecCodF ;
   private String[] T00TX8_A396EmprCod ;
   private String[] T00TX8_A6162SecCodF ;
   private boolean[] T00TX8_n6162SecCodF ;
   private String[] T00TX2_A6162SecCodF ;
   private boolean[] T00TX2_n6162SecCodF ;
   private String[] T00TX2_A6163SecNomF ;
   private boolean[] T00TX2_n6163SecNomF ;
   private byte[] T00TX2_A6175Secord ;
   private boolean[] T00TX2_n6175Secord ;
   private int[] T00TX2_A7237SecUndmx ;
   private boolean[] T00TX2_n7237SecUndmx ;
   private java.math.BigDecimal[] T00TX2_A7601SecMod ;
   private boolean[] T00TX2_n7601SecMod ;
   private java.math.BigDecimal[] T00TX2_A7602SecMoi ;
   private boolean[] T00TX2_n7602SecMoi ;
   private java.math.BigDecimal[] T00TX2_A7603SecCif ;
   private boolean[] T00TX2_n7603SecCif ;
   private java.math.BigDecimal[] T00TX2_A7604SecProd ;
   private boolean[] T00TX2_n7604SecProd ;
   private String[] T00TX2_A396EmprCod ;
   private String[] T00TX12_A396EmprCod ;
   private String[] T00TX12_A457FasCod ;
   private String[] T00TX13_A396EmprCod ;
   private String[] T00TX13_A6162SecCodF ;
   private boolean[] T00TX13_n6162SecCodF ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private app.wwpbaseobjects.SdtWWPContext AV35WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV36TrnContext ;
}

final  class ttsecci__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttsecci__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttsecci__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttsecci__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttsecci__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00TX2", "SELECT SecCodF, SecNomF, Secord, SecUndmx, SecMod, SecMoi, SecCif, SecProd, EmprCod FROM TXPTSECCI WHERE EmprCod = ? AND SecCodF = ?  FOR UPDATE OF SecNomF, Secord, SecUndmx, SecMod, SecMoi, SecCif, SecProd NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00TX3", "SELECT SecCodF, SecNomF, Secord, SecUndmx, SecMod, SecMoi, SecCif, SecProd, EmprCod FROM TXPTSECCI WHERE EmprCod = ? AND SecCodF = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00TX4", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00TX5", "SELECT /*+ FIRST_ROWS(100) */ TM1.SecCodF, T2.EmprNom, TM1.SecNomF, TM1.Secord, TM1.SecUndmx, TM1.SecMod, TM1.SecMoi, TM1.SecCif, TM1.SecProd, TM1.EmprCod FROM (TXPTSECCI TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.SecCodF = ? ORDER BY TM1.EmprCod, TM1.SecCodF ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00TX6", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, SecCodF FROM TXPTSECCI WHERE EmprCod = ? AND SecCodF = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00TX7", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, SecCodF FROM TXPTSECCI WHERE ( EmprCod > ? or EmprCod = ? and SecCodF > ?) ORDER BY EmprCod, SecCodF) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00TX8", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, SecCodF FROM TXPTSECCI WHERE ( EmprCod < ? or EmprCod = ? and SecCodF < ?) ORDER BY EmprCod DESC, SecCodF DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T00TX9", "INSERT INTO TXPTSECCI(SecCodF, SecNomF, Secord, SecUndmx, SecMod, SecMoi, SecCif, SecProd, EmprCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPTSECCI")
         ,new UpdateCursor("T00TX10", "UPDATE TXPTSECCI SET SecNomF=?, Secord=?, SecUndmx=?, SecMod=?, SecMoi=?, SecCif=?, SecProd=?  WHERE EmprCod = ? AND SecCodF = ?", GX_NOMASK, "TXPTSECCI")
         ,new UpdateCursor("T00TX11", "DELETE FROM TXPTSECCI  WHERE EmprCod = ? AND SecCodF = ?", GX_NOMASK, "TXPTSECCI")
         ,new ForEachCursor("T00TX12", "SELECT * FROM (SELECT EmprCod, FasCod FROM TXPFASPRO WHERE EmprCod = ? AND SecCodF = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00TX13", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, SecCodF FROM TXPTSECCI ORDER BY EmprCod, SecCodF ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 2);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 2);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 2);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((byte[]) buf[5])[0] = rslt.getByte(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 2);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 2);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 2);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 2);
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
                  stmt.setString(2, (String)parms[2], 2);
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
                  stmt.setString(2, (String)parms[2], 2);
               }
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 2);
               }
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 2);
               }
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[3], 2);
               }
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[3], 2);
               }
               return;
            case 7 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 2);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(4, ((Number) parms[7]).intValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[9], 2);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[11], 2);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[13], 2);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[15], 2);
               }
               stmt.setString(9, (String)parms[16], 3);
               return;
            case 8 :
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
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[3]).byteValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[5]).intValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[7], 2);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[9], 2);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[11], 2);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[13], 2);
               }
               stmt.setString(8, (String)parms[14], 3);
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[16], 2);
               }
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 2);
               }
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 2);
               }
               return;
      }
   }

}

