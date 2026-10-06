package app.produccion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class conproduc_impl extends GXDataArea
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
            AV10CP_ID = GXutil.lval( httpContext.GetPar( "CP_ID")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10CP_ID", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10CP_ID), 10, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCP_ID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV10CP_ID), "ZZZZZZZZZ9")));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Consulta de Produccion", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtCP_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public conproduc_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public conproduc_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( conproduc_impl.class ));
   }

   public conproduc_impl( int remoteHandle ,
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCP_ID_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCP_ID_Internalname, httpContext.getMessage( "CP_ID", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCP_ID_Internalname, GXutil.ltrim( localUtil.ntoc( A14297CP_ID, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A14297CP_ID), "ZZZZZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,22);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCP_ID_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCP_ID_Enabled, 1, "text", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\CONPRODUC.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCP_EMPRCOD_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCP_EMPRCOD_Internalname, httpContext.getMessage( "Empresa", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCP_EMPRCOD_Internalname, GXutil.rtrim( A14328CP_EMPRCOD), GXutil.rtrim( localUtil.format( A14328CP_EMPRCOD, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,27);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCP_EMPRCOD_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCP_EMPRCOD_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\CONPRODUC.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCP_CLICOD_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCP_CLICOD_Internalname, httpContext.getMessage( "Cliente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 32,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCP_CLICOD_Internalname, GXutil.ltrim( localUtil.ntoc( A14326CP_CLICOD, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCP_CLICOD_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A14326CP_CLICOD), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A14326CP_CLICOD), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,32);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCP_CLICOD_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCP_CLICOD_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\CONPRODUC.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCP_CLINOM_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCP_CLINOM_Internalname, httpContext.getMessage( "Nombre", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 37,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCP_CLINOM_Internalname, A14327CP_CLINOM, GXutil.rtrim( localUtil.format( A14327CP_CLINOM, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,37);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCP_CLINOM_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCP_CLINOM_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\CONPRODUC.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCP_BARCOD_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCP_BARCOD_Internalname, httpContext.getMessage( "BARCOD", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 42,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCP_BARCOD_Internalname, GXutil.ltrim( localUtil.ntoc( A14301CP_BARCOD, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCP_BARCOD_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A14301CP_BARCOD), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A14301CP_BARCOD), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,42);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCP_BARCOD_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCP_BARCOD_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\CONPRODUC.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCP_BARCODR_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCP_BARCODR_Internalname, httpContext.getMessage( "REO", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 47,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCP_BARCODR_Internalname, GXutil.ltrim( localUtil.ntoc( A14302CP_BARCODR, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCP_BARCODR_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A14302CP_BARCODR), "9") : localUtil.format( DecimalUtil.doubleToDec(A14302CP_BARCODR), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,47);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCP_BARCODR_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCP_BARCODR_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\CONPRODUC.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCP_BARCODP_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCP_BARCODP_Internalname, httpContext.getMessage( "PAR", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 52,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCP_BARCODP_Internalname, GXutil.rtrim( A14303CP_BARCODP), GXutil.rtrim( localUtil.format( A14303CP_BARCODP, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,52);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCP_BARCODP_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCP_BARCODP_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\CONPRODUC.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCP_BARFECF_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCP_BARFECF_Internalname, httpContext.getMessage( "Prev", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 57,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtCP_BARFECF_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCP_BARFECF_Internalname, localUtil.format(A14304CP_BARFECF, "99/99/99"), localUtil.format( A14304CP_BARFECF, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,57);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCP_BARFECF_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCP_BARFECF_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\CONPRODUC.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtCP_BARFECF_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtCP_BARFECF_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Produccion\\CONPRODUC.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCP_BARNUMC_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCP_BARNUMC_Internalname, httpContext.getMessage( "Cliente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 62,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCP_BARNUMC_Internalname, GXutil.ltrim( localUtil.ntoc( A14305CP_BARNUMC, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCP_BARNUMC_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A14305CP_BARNUMC), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A14305CP_BARNUMC), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,62);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCP_BARNUMC_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCP_BARNUMC_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\CONPRODUC.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCP_BARPLF_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCP_BARPLF_Internalname, httpContext.getMessage( "Tipo, Valor S o N", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 67,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCP_BARPLF_Internalname, GXutil.rtrim( A14306CP_BARPLF), GXutil.rtrim( localUtil.format( A14306CP_BARPLF, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,67);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCP_BARPLF_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCP_BARPLF_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\CONPRODUC.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCP_BARSIT_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCP_BARSIT_Internalname, httpContext.getMessage( "Situacion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 72,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCP_BARSIT_Internalname, GXutil.ltrim( localUtil.ntoc( A14307CP_BARSIT, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCP_BARSIT_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A14307CP_BARSIT), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A14307CP_BARSIT), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,72);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCP_BARSIT_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCP_BARSIT_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\CONPRODUC.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCP_BARFECG_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCP_BARFECG_Internalname, httpContext.getMessage( "Fecha HDR", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 77,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtCP_BARFECG_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCP_BARFECG_Internalname, localUtil.format(A14308CP_BARFECG, "99/99/99"), localUtil.format( A14308CP_BARFECG, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,77);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCP_BARFECG_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCP_BARFECG_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\CONPRODUC.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtCP_BARFECG_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtCP_BARFECG_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Produccion\\CONPRODUC.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCP_BARFECC_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCP_BARFECC_Internalname, httpContext.getMessage( "Cli", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 82,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtCP_BARFECC_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCP_BARFECC_Internalname, localUtil.format(A14309CP_BARFECC, "99/99/99"), localUtil.format( A14309CP_BARFECC, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,82);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCP_BARFECC_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCP_BARFECC_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\CONPRODUC.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtCP_BARFECC_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtCP_BARFECC_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Produccion\\CONPRODUC.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCP_BARFECS_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCP_BARFECS_Internalname, httpContext.getMessage( "Salida", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 87,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtCP_BARFECS_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCP_BARFECS_Internalname, localUtil.format(A14310CP_BARFECS, "99/99/99"), localUtil.format( A14310CP_BARFECS, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,87);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCP_BARFECS_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCP_BARFECS_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\CONPRODUC.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtCP_BARFECS_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtCP_BARFECS_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Produccion\\CONPRODUC.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCP_BARSER_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCP_BARSER_Internalname, httpContext.getMessage( "Articulo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 92,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCP_BARSER_Internalname, GXutil.rtrim( A14311CP_BARSER), GXutil.rtrim( localUtil.format( A14311CP_BARSER, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,92);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCP_BARSER_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCP_BARSER_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\CONPRODUC.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCP_BARSERD_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCP_BARSERD_Internalname, httpContext.getMessage( "Descripcion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 97,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCP_BARSERD_Internalname, A14312CP_BARSERD, GXutil.rtrim( localUtil.format( A14312CP_BARSERD, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,97);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCP_BARSERD_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCP_BARSERD_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\CONPRODUC.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCP_BARNOMC_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCP_BARNOMC_Internalname, httpContext.getMessage( "Color Cliente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 102,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCP_BARNOMC_Internalname, A14315CP_BARNOMC, GXutil.rtrim( localUtil.format( A14315CP_BARNOMC, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,102);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCP_BARNOMC_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCP_BARNOMC_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\CONPRODUC.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCP_BARTIPA_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCP_BARTIPA_Internalname, httpContext.getMessage( "Art.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 107,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCP_BARTIPA_Internalname, GXutil.ltrim( localUtil.ntoc( A14316CP_BARTIPA, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCP_BARTIPA_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A14316CP_BARTIPA), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A14316CP_BARTIPA), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,107);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCP_BARTIPA_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCP_BARTIPA_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\CONPRODUC.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCP_TARTDSC_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCP_TARTDSC_Internalname, httpContext.getMessage( "CP_TARTDSC", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 112,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCP_TARTDSC_Internalname, A14343CP_TARTDSC, GXutil.rtrim( localUtil.format( A14343CP_TARTDSC, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,112);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCP_TARTDSC_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCP_TARTDSC_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\CONPRODUC.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCP_BARGIRA_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCP_BARGIRA_Internalname, httpContext.getMessage( "Coleccion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 117,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCP_BARGIRA_Internalname, A14317CP_BARGIRA, GXutil.rtrim( localUtil.format( A14317CP_BARGIRA, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,117);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCP_BARGIRA_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCP_BARGIRA_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\CONPRODUC.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCP_BARACAA_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCP_BARACAA_Internalname, httpContext.getMessage( "Cuardeno", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 122,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCP_BARACAA_Internalname, GXutil.ltrim( localUtil.ntoc( A14318CP_BARACAA, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCP_BARACAA_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A14318CP_BARACAA), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A14318CP_BARACAA), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,122);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCP_BARACAA_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCP_BARACAA_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\CONPRODUC.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCP_BARAGRE_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCP_BARAGRE_Internalname, httpContext.getMessage( "A?", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 127,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCP_BARAGRE_Internalname, GXutil.rtrim( A14319CP_BARAGRE), GXutil.rtrim( localUtil.format( A14319CP_BARAGRE, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,127);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCP_BARAGRE_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCP_BARAGRE_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\CONPRODUC.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCP_BAREXT_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCP_BAREXT_Internalname, httpContext.getMessage( "Exterior", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 132,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCP_BAREXT_Internalname, GXutil.ltrim( localUtil.ntoc( A14320CP_BAREXT, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCP_BAREXT_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A14320CP_BAREXT), "9") : localUtil.format( DecimalUtil.doubleToDec(A14320CP_BAREXT), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,132);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCP_BAREXT_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCP_BAREXT_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\CONPRODUC.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCP_DISDES_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCP_DISDES_Internalname, httpContext.getMessage( "Desglose", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 137,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCP_DISDES_Internalname, GXutil.rtrim( A14321CP_DISDES), GXutil.rtrim( localUtil.format( A14321CP_DISDES, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,137);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCP_DISDES_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCP_DISDES_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\CONPRODUC.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCP_DISCOD_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCP_DISCOD_Internalname, httpContext.getMessage( "Codigo Disposicion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 142,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCP_DISCOD_Internalname, GXutil.ltrim( localUtil.ntoc( A14322CP_DISCOD, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCP_DISCOD_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A14322CP_DISCOD), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A14322CP_DISCOD), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,142);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCP_DISCOD_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCP_DISCOD_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\CONPRODUC.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCP_BARPROP_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCP_BARPROP_Internalname, httpContext.getMessage( "CTW", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 147,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCP_BARPROP_Internalname, GXutil.rtrim( A14323CP_BARPROP), GXutil.rtrim( localUtil.format( A14323CP_BARPROP, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,147);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCP_BARPROP_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCP_BARPROP_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\CONPRODUC.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCP_BARDISN_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCP_BARDISN_Internalname, httpContext.getMessage( " Cli.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 152,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCP_BARDISN_Internalname, GXutil.rtrim( A14324CP_BARDISN), GXutil.rtrim( localUtil.format( A14324CP_BARDISN, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,152);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCP_BARDISN_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCP_BARDISN_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\CONPRODUC.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCP_BARENCC_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCP_BARENCC_Internalname, httpContext.getMessage( "Disposicion Cliente Nueva", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 157,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCP_BARENCC_Internalname, GXutil.rtrim( A14325CP_BARENCC), GXutil.rtrim( localUtil.format( A14325CP_BARENCC, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,157);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCP_BARENCC_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCP_BARENCC_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\CONPRODUC.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCP_BARCOLO_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCP_BARCOLO_Internalname, httpContext.getMessage( "Color", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 162,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCP_BARCOLO_Internalname, GXutil.rtrim( A14331CP_BARCOLO), GXutil.rtrim( localUtil.format( A14331CP_BARCOLO, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,162);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCP_BARCOLO_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCP_BARCOLO_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\CONPRODUC.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCP_BARCOLU_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCP_BARCOLU_Internalname, httpContext.getMessage( "Numero", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 167,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCP_BARCOLU_Internalname, GXutil.ltrim( localUtil.ntoc( A14332CP_BARCOLU, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCP_BARCOLU_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A14332CP_BARCOLU), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A14332CP_BARCOLU), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,167);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCP_BARCOLU_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCP_BARCOLU_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\CONPRODUC.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCP_DSC_BAR_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCP_DSC_BAR_Internalname, httpContext.getMessage( "Ctw", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 172,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCP_DSC_BAR_Internalname, A14334CP_DSC_BAR, GXutil.rtrim( localUtil.format( A14334CP_DSC_BAR, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,172);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCP_DSC_BAR_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCP_DSC_BAR_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\CONPRODUC.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCP_BARKGM_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCP_BARKGM_Internalname, httpContext.getMessage( "Kilogramos", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 177,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCP_BARKGM_Internalname, GXutil.ltrim( localUtil.ntoc( A14336CP_BARKGM, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCP_BARKGM_Enabled!=0) ? localUtil.format( A14336CP_BARKGM, "ZZZZZ9.99") : localUtil.format( A14336CP_BARKGM, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,177);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCP_BARKGM_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCP_BARKGM_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\CONPRODUC.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCP_BARMTR_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCP_BARMTR_Internalname, httpContext.getMessage( "Metros", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 182,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCP_BARMTR_Internalname, GXutil.ltrim( localUtil.ntoc( A14337CP_BARMTR, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCP_BARMTR_Enabled!=0) ? localUtil.format( A14337CP_BARMTR, "ZZZZZ9.99") : localUtil.format( A14337CP_BARMTR, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,182);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCP_BARMTR_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCP_BARMTR_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\CONPRODUC.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCP_BARPIE_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCP_BARPIE_Internalname, httpContext.getMessage( "Piezas", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 187,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCP_BARPIE_Internalname, GXutil.ltrim( localUtil.ntoc( A14338CP_BARPIE, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCP_BARPIE_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A14338CP_BARPIE), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A14338CP_BARPIE), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,187);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCP_BARPIE_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCP_BARPIE_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\CONPRODUC.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCP_BARALBK_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCP_BARALBK_Internalname, httpContext.getMessage( "Salidos", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 192,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCP_BARALBK_Internalname, GXutil.ltrim( localUtil.ntoc( A14339CP_BARALBK, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCP_BARALBK_Enabled!=0) ? localUtil.format( A14339CP_BARALBK, "ZZZZZ9.99") : localUtil.format( A14339CP_BARALBK, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,192);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCP_BARALBK_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCP_BARALBK_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\CONPRODUC.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCP_BARALBM_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCP_BARALBM_Internalname, httpContext.getMessage( "Metros", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 197,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCP_BARALBM_Internalname, GXutil.ltrim( localUtil.ntoc( A14340CP_BARALBM, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCP_BARALBM_Enabled!=0) ? localUtil.format( A14340CP_BARALBM, "ZZZZZ9.99") : localUtil.format( A14340CP_BARALBM, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,197);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCP_BARALBM_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCP_BARALBM_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\CONPRODUC.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCP_DISUSRC_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCP_DISUSRC_Internalname, httpContext.getMessage( "Usario que creó Dispo.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 202,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCP_DISUSRC_Internalname, GXutil.rtrim( A14341CP_DISUSRC), GXutil.rtrim( localUtil.format( A14341CP_DISUSRC, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,202);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCP_DISUSRC_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCP_DISUSRC_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\CONPRODUC.htm");
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
      drawcontrols1( ) ;
   }

   public void drawcontrols1( )
   {
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group TrnActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 207,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Produccion\\CONPRODUC.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 209,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Produccion\\CONPRODUC.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 211,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Produccion\\CONPRODUC.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV15Pgmname), GXutil.rtrim( localUtil.format( AV15Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\CONPRODUC.htm");
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
      e111UO2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z14297CP_ID = localUtil.ctol( httpContext.cgiGet( "Z14297CP_ID"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            Z14328CP_EMPRCOD = httpContext.cgiGet( "Z14328CP_EMPRCOD") ;
            Z14326CP_CLICOD = (int)(localUtil.ctol( httpContext.cgiGet( "Z14326CP_CLICOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z14327CP_CLINOM = httpContext.cgiGet( "Z14327CP_CLINOM") ;
            Z14301CP_BARCOD = (int)(localUtil.ctol( httpContext.cgiGet( "Z14301CP_BARCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z14302CP_BARCODR = (byte)(localUtil.ctol( httpContext.cgiGet( "Z14302CP_BARCODR"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z14303CP_BARCODP = httpContext.cgiGet( "Z14303CP_BARCODP") ;
            Z14304CP_BARFECF = localUtil.ctod( httpContext.cgiGet( "Z14304CP_BARFECF"), 0) ;
            Z14305CP_BARNUMC = (int)(localUtil.ctol( httpContext.cgiGet( "Z14305CP_BARNUMC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z14306CP_BARPLF = httpContext.cgiGet( "Z14306CP_BARPLF") ;
            Z14307CP_BARSIT = (byte)(localUtil.ctol( httpContext.cgiGet( "Z14307CP_BARSIT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z14309CP_BARFECC = localUtil.ctod( httpContext.cgiGet( "Z14309CP_BARFECC"), 0) ;
            Z14310CP_BARFECS = localUtil.ctod( httpContext.cgiGet( "Z14310CP_BARFECS"), 0) ;
            Z14308CP_BARFECG = localUtil.ctod( httpContext.cgiGet( "Z14308CP_BARFECG"), 0) ;
            Z14311CP_BARSER = httpContext.cgiGet( "Z14311CP_BARSER") ;
            Z14312CP_BARSERD = httpContext.cgiGet( "Z14312CP_BARSERD") ;
            Z14331CP_BARCOLO = httpContext.cgiGet( "Z14331CP_BARCOLO") ;
            Z14332CP_BARCOLU = (int)(localUtil.ctol( httpContext.cgiGet( "Z14332CP_BARCOLU"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z14315CP_BARNOMC = httpContext.cgiGet( "Z14315CP_BARNOMC") ;
            Z14316CP_BARTIPA = (short)(localUtil.ctol( httpContext.cgiGet( "Z14316CP_BARTIPA"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z14343CP_TARTDSC = httpContext.cgiGet( "Z14343CP_TARTDSC") ;
            Z14317CP_BARGIRA = httpContext.cgiGet( "Z14317CP_BARGIRA") ;
            Z14318CP_BARACAA = (short)(localUtil.ctol( httpContext.cgiGet( "Z14318CP_BARACAA"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z14319CP_BARAGRE = httpContext.cgiGet( "Z14319CP_BARAGRE") ;
            Z14320CP_BAREXT = (byte)(localUtil.ctol( httpContext.cgiGet( "Z14320CP_BAREXT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z14321CP_DISDES = httpContext.cgiGet( "Z14321CP_DISDES") ;
            Z14322CP_DISCOD = (int)(localUtil.ctol( httpContext.cgiGet( "Z14322CP_DISCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z14323CP_BARPROP = httpContext.cgiGet( "Z14323CP_BARPROP") ;
            Z14334CP_DSC_BAR = httpContext.cgiGet( "Z14334CP_DSC_BAR") ;
            Z14324CP_BARDISN = httpContext.cgiGet( "Z14324CP_BARDISN") ;
            Z14336CP_BARKGM = localUtil.ctond( httpContext.cgiGet( "Z14336CP_BARKGM")) ;
            Z14337CP_BARMTR = localUtil.ctond( httpContext.cgiGet( "Z14337CP_BARMTR")) ;
            Z14338CP_BARPIE = (int)(localUtil.ctol( httpContext.cgiGet( "Z14338CP_BARPIE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z14339CP_BARALBK = localUtil.ctond( httpContext.cgiGet( "Z14339CP_BARALBK")) ;
            Z14340CP_BARALBM = localUtil.ctond( httpContext.cgiGet( "Z14340CP_BARALBM")) ;
            Z14325CP_BARENCC = httpContext.cgiGet( "Z14325CP_BARENCC") ;
            Z14341CP_DISUSRC = httpContext.cgiGet( "Z14341CP_DISUSRC") ;
            Z14351CP_BARMAQC = httpContext.cgiGet( "Z14351CP_BARMAQC") ;
            Z14352CP_BARESTR = (byte)(localUtil.ctol( httpContext.cgiGet( "Z14352CP_BARESTR"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A14351CP_BARMAQC = httpContext.cgiGet( "Z14351CP_BARMAQC") ;
            A14352CP_BARESTR = (byte)(localUtil.ctol( httpContext.cgiGet( "Z14352CP_BARESTR"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            AV10CP_ID = localUtil.ctol( httpContext.cgiGet( "vCP_ID"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            A14351CP_BARMAQC = httpContext.cgiGet( "CP_BARMAQC") ;
            A14352CP_BARESTR = (byte)(localUtil.ctol( httpContext.cgiGet( "CP_BARESTR"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCP_ID_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCP_ID_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CP_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCP_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A14297CP_ID = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A14297CP_ID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14297CP_ID), 10, 0));
            }
            else
            {
               A14297CP_ID = localUtil.ctol( httpContext.cgiGet( edtCP_ID_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A14297CP_ID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14297CP_ID), 10, 0));
            }
            A14328CP_EMPRCOD = httpContext.cgiGet( edtCP_EMPRCOD_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14328CP_EMPRCOD", A14328CP_EMPRCOD);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCP_CLICOD_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCP_CLICOD_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CP_CLICOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCP_CLICOD_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A14326CP_CLICOD = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A14326CP_CLICOD", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14326CP_CLICOD), 6, 0));
            }
            else
            {
               A14326CP_CLICOD = (int)(localUtil.ctol( httpContext.cgiGet( edtCP_CLICOD_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A14326CP_CLICOD", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14326CP_CLICOD), 6, 0));
            }
            A14327CP_CLINOM = httpContext.cgiGet( edtCP_CLINOM_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14327CP_CLINOM", A14327CP_CLINOM);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCP_BARCOD_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCP_BARCOD_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CP_BARCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCP_BARCOD_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A14301CP_BARCOD = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A14301CP_BARCOD", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14301CP_BARCOD), 8, 0));
            }
            else
            {
               A14301CP_BARCOD = (int)(localUtil.ctol( httpContext.cgiGet( edtCP_BARCOD_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A14301CP_BARCOD", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14301CP_BARCOD), 8, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCP_BARCODR_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCP_BARCODR_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CP_BARCODR");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCP_BARCODR_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A14302CP_BARCODR = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A14302CP_BARCODR", GXutil.str( A14302CP_BARCODR, 1, 0));
            }
            else
            {
               A14302CP_BARCODR = (byte)(localUtil.ctol( httpContext.cgiGet( edtCP_BARCODR_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A14302CP_BARCODR", GXutil.str( A14302CP_BARCODR, 1, 0));
            }
            A14303CP_BARCODP = httpContext.cgiGet( edtCP_BARCODP_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14303CP_BARCODP", A14303CP_BARCODP);
            if ( localUtil.vcdate( httpContext.cgiGet( edtCP_BARFECF_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "CP_BARFECF");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCP_BARFECF_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A14304CP_BARFECF = GXutil.nullDate() ;
               httpContext.ajax_rsp_assign_attri("", false, "A14304CP_BARFECF", localUtil.format(A14304CP_BARFECF, "99/99/99"));
            }
            else
            {
               A14304CP_BARFECF = localUtil.ctod( httpContext.cgiGet( edtCP_BARFECF_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A14304CP_BARFECF", localUtil.format(A14304CP_BARFECF, "99/99/99"));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCP_BARNUMC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCP_BARNUMC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CP_BARNUMC");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCP_BARNUMC_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A14305CP_BARNUMC = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A14305CP_BARNUMC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14305CP_BARNUMC), 6, 0));
            }
            else
            {
               A14305CP_BARNUMC = (int)(localUtil.ctol( httpContext.cgiGet( edtCP_BARNUMC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A14305CP_BARNUMC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14305CP_BARNUMC), 6, 0));
            }
            A14306CP_BARPLF = httpContext.cgiGet( edtCP_BARPLF_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14306CP_BARPLF", A14306CP_BARPLF);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCP_BARSIT_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCP_BARSIT_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CP_BARSIT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCP_BARSIT_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A14307CP_BARSIT = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A14307CP_BARSIT", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14307CP_BARSIT), 2, 0));
            }
            else
            {
               A14307CP_BARSIT = (byte)(localUtil.ctol( httpContext.cgiGet( edtCP_BARSIT_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A14307CP_BARSIT", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14307CP_BARSIT), 2, 0));
            }
            if ( localUtil.vcdate( httpContext.cgiGet( edtCP_BARFECG_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "CP_BARFECG");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCP_BARFECG_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A14308CP_BARFECG = GXutil.nullDate() ;
               httpContext.ajax_rsp_assign_attri("", false, "A14308CP_BARFECG", localUtil.format(A14308CP_BARFECG, "99/99/99"));
            }
            else
            {
               A14308CP_BARFECG = localUtil.ctod( httpContext.cgiGet( edtCP_BARFECG_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A14308CP_BARFECG", localUtil.format(A14308CP_BARFECG, "99/99/99"));
            }
            if ( localUtil.vcdate( httpContext.cgiGet( edtCP_BARFECC_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "CP_BARFECC");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCP_BARFECC_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A14309CP_BARFECC = GXutil.nullDate() ;
               httpContext.ajax_rsp_assign_attri("", false, "A14309CP_BARFECC", localUtil.format(A14309CP_BARFECC, "99/99/99"));
            }
            else
            {
               A14309CP_BARFECC = localUtil.ctod( httpContext.cgiGet( edtCP_BARFECC_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A14309CP_BARFECC", localUtil.format(A14309CP_BARFECC, "99/99/99"));
            }
            if ( localUtil.vcdate( httpContext.cgiGet( edtCP_BARFECS_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "CP_BARFECS");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCP_BARFECS_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A14310CP_BARFECS = GXutil.nullDate() ;
               httpContext.ajax_rsp_assign_attri("", false, "A14310CP_BARFECS", localUtil.format(A14310CP_BARFECS, "99/99/99"));
            }
            else
            {
               A14310CP_BARFECS = localUtil.ctod( httpContext.cgiGet( edtCP_BARFECS_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A14310CP_BARFECS", localUtil.format(A14310CP_BARFECS, "99/99/99"));
            }
            A14311CP_BARSER = httpContext.cgiGet( edtCP_BARSER_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14311CP_BARSER", A14311CP_BARSER);
            A14312CP_BARSERD = httpContext.cgiGet( edtCP_BARSERD_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14312CP_BARSERD", A14312CP_BARSERD);
            A14315CP_BARNOMC = httpContext.cgiGet( edtCP_BARNOMC_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14315CP_BARNOMC", A14315CP_BARNOMC);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCP_BARTIPA_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCP_BARTIPA_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CP_BARTIPA");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCP_BARTIPA_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A14316CP_BARTIPA = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A14316CP_BARTIPA", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14316CP_BARTIPA), 4, 0));
            }
            else
            {
               A14316CP_BARTIPA = (short)(localUtil.ctol( httpContext.cgiGet( edtCP_BARTIPA_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A14316CP_BARTIPA", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14316CP_BARTIPA), 4, 0));
            }
            A14343CP_TARTDSC = httpContext.cgiGet( edtCP_TARTDSC_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14343CP_TARTDSC", A14343CP_TARTDSC);
            A14317CP_BARGIRA = httpContext.cgiGet( edtCP_BARGIRA_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14317CP_BARGIRA", A14317CP_BARGIRA);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCP_BARACAA_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCP_BARACAA_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CP_BARACAA");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCP_BARACAA_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A14318CP_BARACAA = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A14318CP_BARACAA", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14318CP_BARACAA), 4, 0));
            }
            else
            {
               A14318CP_BARACAA = (short)(localUtil.ctol( httpContext.cgiGet( edtCP_BARACAA_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A14318CP_BARACAA", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14318CP_BARACAA), 4, 0));
            }
            A14319CP_BARAGRE = httpContext.cgiGet( edtCP_BARAGRE_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14319CP_BARAGRE", A14319CP_BARAGRE);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCP_BAREXT_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCP_BAREXT_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CP_BAREXT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCP_BAREXT_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A14320CP_BAREXT = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A14320CP_BAREXT", GXutil.str( A14320CP_BAREXT, 1, 0));
            }
            else
            {
               A14320CP_BAREXT = (byte)(localUtil.ctol( httpContext.cgiGet( edtCP_BAREXT_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A14320CP_BAREXT", GXutil.str( A14320CP_BAREXT, 1, 0));
            }
            A14321CP_DISDES = httpContext.cgiGet( edtCP_DISDES_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14321CP_DISDES", A14321CP_DISDES);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCP_DISCOD_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCP_DISCOD_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CP_DISCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCP_DISCOD_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A14322CP_DISCOD = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A14322CP_DISCOD", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14322CP_DISCOD), 8, 0));
            }
            else
            {
               A14322CP_DISCOD = (int)(localUtil.ctol( httpContext.cgiGet( edtCP_DISCOD_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A14322CP_DISCOD", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14322CP_DISCOD), 8, 0));
            }
            A14323CP_BARPROP = httpContext.cgiGet( edtCP_BARPROP_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14323CP_BARPROP", A14323CP_BARPROP);
            A14324CP_BARDISN = httpContext.cgiGet( edtCP_BARDISN_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14324CP_BARDISN", A14324CP_BARDISN);
            A14325CP_BARENCC = httpContext.cgiGet( edtCP_BARENCC_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14325CP_BARENCC", A14325CP_BARENCC);
            A14331CP_BARCOLO = httpContext.cgiGet( edtCP_BARCOLO_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14331CP_BARCOLO", A14331CP_BARCOLO);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCP_BARCOLU_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCP_BARCOLU_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CP_BARCOLU");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCP_BARCOLU_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A14332CP_BARCOLU = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A14332CP_BARCOLU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14332CP_BARCOLU), 6, 0));
            }
            else
            {
               A14332CP_BARCOLU = (int)(localUtil.ctol( httpContext.cgiGet( edtCP_BARCOLU_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A14332CP_BARCOLU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14332CP_BARCOLU), 6, 0));
            }
            A14334CP_DSC_BAR = httpContext.cgiGet( edtCP_DSC_BAR_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14334CP_DSC_BAR", A14334CP_DSC_BAR);
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtCP_BARKGM_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtCP_BARKGM_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CP_BARKGM");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCP_BARKGM_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A14336CP_BARKGM = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, "A14336CP_BARKGM", GXutil.ltrimstr( A14336CP_BARKGM, 9, 2));
            }
            else
            {
               A14336CP_BARKGM = localUtil.ctond( httpContext.cgiGet( edtCP_BARKGM_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A14336CP_BARKGM", GXutil.ltrimstr( A14336CP_BARKGM, 9, 2));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtCP_BARMTR_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtCP_BARMTR_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CP_BARMTR");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCP_BARMTR_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A14337CP_BARMTR = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, "A14337CP_BARMTR", GXutil.ltrimstr( A14337CP_BARMTR, 9, 2));
            }
            else
            {
               A14337CP_BARMTR = localUtil.ctond( httpContext.cgiGet( edtCP_BARMTR_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A14337CP_BARMTR", GXutil.ltrimstr( A14337CP_BARMTR, 9, 2));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCP_BARPIE_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCP_BARPIE_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CP_BARPIE");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCP_BARPIE_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A14338CP_BARPIE = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A14338CP_BARPIE", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14338CP_BARPIE), 6, 0));
            }
            else
            {
               A14338CP_BARPIE = (int)(localUtil.ctol( httpContext.cgiGet( edtCP_BARPIE_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A14338CP_BARPIE", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14338CP_BARPIE), 6, 0));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtCP_BARALBK_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtCP_BARALBK_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CP_BARALBK");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCP_BARALBK_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A14339CP_BARALBK = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, "A14339CP_BARALBK", GXutil.ltrimstr( A14339CP_BARALBK, 9, 2));
            }
            else
            {
               A14339CP_BARALBK = localUtil.ctond( httpContext.cgiGet( edtCP_BARALBK_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A14339CP_BARALBK", GXutil.ltrimstr( A14339CP_BARALBK, 9, 2));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtCP_BARALBM_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtCP_BARALBM_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CP_BARALBM");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCP_BARALBM_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A14340CP_BARALBM = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, "A14340CP_BARALBM", GXutil.ltrimstr( A14340CP_BARALBM, 9, 2));
            }
            else
            {
               A14340CP_BARALBM = localUtil.ctond( httpContext.cgiGet( edtCP_BARALBM_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A14340CP_BARALBM", GXutil.ltrimstr( A14340CP_BARALBM, 9, 2));
            }
            A14341CP_DISUSRC = httpContext.cgiGet( edtCP_DISUSRC_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14341CP_DISUSRC", A14341CP_DISUSRC);
            AV15Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15Pgmname", AV15Pgmname);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"CONPRODUC");
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            forbiddenHiddens.add("CP_BARMAQC", GXutil.rtrim( localUtil.format( A14351CP_BARMAQC, "")));
            forbiddenHiddens.add("CP_BARESTR", localUtil.format( DecimalUtil.doubleToDec(A14352CP_BARESTR), "9"));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( A14297CP_ID != Z14297CP_ID ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("produccion\\conproduc:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               A14297CP_ID = GXutil.lval( httpContext.GetPar( "CP_ID")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A14297CP_ID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14297CP_ID), 10, 0));
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
                  sMode1902 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  Gx_mode = sMode1902 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound1902 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_1UO0( ) ;
                        if ( AnyError == 0 )
                        {
                           GX_FocusControl = bttBtntrn_enter_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noinsert"), 1, "CP_ID");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtCP_ID_Internalname ;
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
                        e111UO2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e121UO2 ();
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
         e121UO2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll1UO1902( ) ;
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
         disableAttributes1UO1902( ) ;
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

   public void confirm_1UO0( )
   {
      beforeValidate1UO1902( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1UO1902( ) ;
         }
         else
         {
            checkExtendedTable1UO1902( ) ;
            closeExtendedTableCursors1UO1902( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
   }

   public void resetCaption1UO0( )
   {
   }

   public void e111UO2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV11Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      conproduc_impl.this.GXt_char1 = GXv_char2[0] ;
      AV11Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11Station", AV11Station);
      GXv_char2[0] = AV12EmprCod ;
      GXv_char3[0] = AV13EmprNom ;
      GXv_char4[0] = AV14UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV11Station, GXv_char2, GXv_char3, GXv_char4) ;
      conproduc_impl.this.AV12EmprCod = GXv_char2[0] ;
      conproduc_impl.this.AV13EmprNom = GXv_char3[0] ;
      conproduc_impl.this.AV14UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12EmprCod", AV12EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV13EmprNom", AV13EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV14UsurCod", AV14UsurCod);
      GXv_SdtWWPContext5[0] = AV7WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext5) ;
      AV7WWPContext = GXv_SdtWWPContext5[0] ;
      AV8TrnContext.fromxml(AV9WebSession.getValue("TrnContext"), null, null);
   }

   public void e121UO2( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV8TrnContext.getgxTv_SdtWWPTransactionContext_Callerondelete() )
      {
         callWebObject(formatLink("app.produccion.conproducww", new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      pr_default.close(1);
      returnInSub = true;
      if (true) return;
   }

   public void zm1UO1902( int GX_JID )
   {
      if ( ( GX_JID == 4 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z14328CP_EMPRCOD = T01UO3_A14328CP_EMPRCOD[0] ;
            Z14326CP_CLICOD = T01UO3_A14326CP_CLICOD[0] ;
            Z14327CP_CLINOM = T01UO3_A14327CP_CLINOM[0] ;
            Z14301CP_BARCOD = T01UO3_A14301CP_BARCOD[0] ;
            Z14302CP_BARCODR = T01UO3_A14302CP_BARCODR[0] ;
            Z14303CP_BARCODP = T01UO3_A14303CP_BARCODP[0] ;
            Z14304CP_BARFECF = T01UO3_A14304CP_BARFECF[0] ;
            Z14305CP_BARNUMC = T01UO3_A14305CP_BARNUMC[0] ;
            Z14306CP_BARPLF = T01UO3_A14306CP_BARPLF[0] ;
            Z14307CP_BARSIT = T01UO3_A14307CP_BARSIT[0] ;
            Z14309CP_BARFECC = T01UO3_A14309CP_BARFECC[0] ;
            Z14310CP_BARFECS = T01UO3_A14310CP_BARFECS[0] ;
            Z14308CP_BARFECG = T01UO3_A14308CP_BARFECG[0] ;
            Z14311CP_BARSER = T01UO3_A14311CP_BARSER[0] ;
            Z14312CP_BARSERD = T01UO3_A14312CP_BARSERD[0] ;
            Z14331CP_BARCOLO = T01UO3_A14331CP_BARCOLO[0] ;
            Z14332CP_BARCOLU = T01UO3_A14332CP_BARCOLU[0] ;
            Z14315CP_BARNOMC = T01UO3_A14315CP_BARNOMC[0] ;
            Z14316CP_BARTIPA = T01UO3_A14316CP_BARTIPA[0] ;
            Z14343CP_TARTDSC = T01UO3_A14343CP_TARTDSC[0] ;
            Z14317CP_BARGIRA = T01UO3_A14317CP_BARGIRA[0] ;
            Z14318CP_BARACAA = T01UO3_A14318CP_BARACAA[0] ;
            Z14319CP_BARAGRE = T01UO3_A14319CP_BARAGRE[0] ;
            Z14320CP_BAREXT = T01UO3_A14320CP_BAREXT[0] ;
            Z14321CP_DISDES = T01UO3_A14321CP_DISDES[0] ;
            Z14322CP_DISCOD = T01UO3_A14322CP_DISCOD[0] ;
            Z14323CP_BARPROP = T01UO3_A14323CP_BARPROP[0] ;
            Z14334CP_DSC_BAR = T01UO3_A14334CP_DSC_BAR[0] ;
            Z14324CP_BARDISN = T01UO3_A14324CP_BARDISN[0] ;
            Z14336CP_BARKGM = T01UO3_A14336CP_BARKGM[0] ;
            Z14337CP_BARMTR = T01UO3_A14337CP_BARMTR[0] ;
            Z14338CP_BARPIE = T01UO3_A14338CP_BARPIE[0] ;
            Z14339CP_BARALBK = T01UO3_A14339CP_BARALBK[0] ;
            Z14340CP_BARALBM = T01UO3_A14340CP_BARALBM[0] ;
            Z14325CP_BARENCC = T01UO3_A14325CP_BARENCC[0] ;
            Z14341CP_DISUSRC = T01UO3_A14341CP_DISUSRC[0] ;
            Z14351CP_BARMAQC = T01UO3_A14351CP_BARMAQC[0] ;
            Z14352CP_BARESTR = T01UO3_A14352CP_BARESTR[0] ;
         }
         else
         {
            Z14328CP_EMPRCOD = A14328CP_EMPRCOD ;
            Z14326CP_CLICOD = A14326CP_CLICOD ;
            Z14327CP_CLINOM = A14327CP_CLINOM ;
            Z14301CP_BARCOD = A14301CP_BARCOD ;
            Z14302CP_BARCODR = A14302CP_BARCODR ;
            Z14303CP_BARCODP = A14303CP_BARCODP ;
            Z14304CP_BARFECF = A14304CP_BARFECF ;
            Z14305CP_BARNUMC = A14305CP_BARNUMC ;
            Z14306CP_BARPLF = A14306CP_BARPLF ;
            Z14307CP_BARSIT = A14307CP_BARSIT ;
            Z14309CP_BARFECC = A14309CP_BARFECC ;
            Z14310CP_BARFECS = A14310CP_BARFECS ;
            Z14308CP_BARFECG = A14308CP_BARFECG ;
            Z14311CP_BARSER = A14311CP_BARSER ;
            Z14312CP_BARSERD = A14312CP_BARSERD ;
            Z14331CP_BARCOLO = A14331CP_BARCOLO ;
            Z14332CP_BARCOLU = A14332CP_BARCOLU ;
            Z14315CP_BARNOMC = A14315CP_BARNOMC ;
            Z14316CP_BARTIPA = A14316CP_BARTIPA ;
            Z14343CP_TARTDSC = A14343CP_TARTDSC ;
            Z14317CP_BARGIRA = A14317CP_BARGIRA ;
            Z14318CP_BARACAA = A14318CP_BARACAA ;
            Z14319CP_BARAGRE = A14319CP_BARAGRE ;
            Z14320CP_BAREXT = A14320CP_BAREXT ;
            Z14321CP_DISDES = A14321CP_DISDES ;
            Z14322CP_DISCOD = A14322CP_DISCOD ;
            Z14323CP_BARPROP = A14323CP_BARPROP ;
            Z14334CP_DSC_BAR = A14334CP_DSC_BAR ;
            Z14324CP_BARDISN = A14324CP_BARDISN ;
            Z14336CP_BARKGM = A14336CP_BARKGM ;
            Z14337CP_BARMTR = A14337CP_BARMTR ;
            Z14338CP_BARPIE = A14338CP_BARPIE ;
            Z14339CP_BARALBK = A14339CP_BARALBK ;
            Z14340CP_BARALBM = A14340CP_BARALBM ;
            Z14325CP_BARENCC = A14325CP_BARENCC ;
            Z14341CP_DISUSRC = A14341CP_DISUSRC ;
            Z14351CP_BARMAQC = A14351CP_BARMAQC ;
            Z14352CP_BARESTR = A14352CP_BARESTR ;
         }
      }
      if ( GX_JID == -4 )
      {
         Z14297CP_ID = A14297CP_ID ;
         Z14328CP_EMPRCOD = A14328CP_EMPRCOD ;
         Z14326CP_CLICOD = A14326CP_CLICOD ;
         Z14327CP_CLINOM = A14327CP_CLINOM ;
         Z14301CP_BARCOD = A14301CP_BARCOD ;
         Z14302CP_BARCODR = A14302CP_BARCODR ;
         Z14303CP_BARCODP = A14303CP_BARCODP ;
         Z14304CP_BARFECF = A14304CP_BARFECF ;
         Z14305CP_BARNUMC = A14305CP_BARNUMC ;
         Z14306CP_BARPLF = A14306CP_BARPLF ;
         Z14307CP_BARSIT = A14307CP_BARSIT ;
         Z14309CP_BARFECC = A14309CP_BARFECC ;
         Z14310CP_BARFECS = A14310CP_BARFECS ;
         Z14308CP_BARFECG = A14308CP_BARFECG ;
         Z14311CP_BARSER = A14311CP_BARSER ;
         Z14312CP_BARSERD = A14312CP_BARSERD ;
         Z14331CP_BARCOLO = A14331CP_BARCOLO ;
         Z14332CP_BARCOLU = A14332CP_BARCOLU ;
         Z14315CP_BARNOMC = A14315CP_BARNOMC ;
         Z14316CP_BARTIPA = A14316CP_BARTIPA ;
         Z14343CP_TARTDSC = A14343CP_TARTDSC ;
         Z14317CP_BARGIRA = A14317CP_BARGIRA ;
         Z14318CP_BARACAA = A14318CP_BARACAA ;
         Z14319CP_BARAGRE = A14319CP_BARAGRE ;
         Z14320CP_BAREXT = A14320CP_BAREXT ;
         Z14321CP_DISDES = A14321CP_DISDES ;
         Z14322CP_DISCOD = A14322CP_DISCOD ;
         Z14323CP_BARPROP = A14323CP_BARPROP ;
         Z14334CP_DSC_BAR = A14334CP_DSC_BAR ;
         Z14324CP_BARDISN = A14324CP_BARDISN ;
         Z14336CP_BARKGM = A14336CP_BARKGM ;
         Z14337CP_BARMTR = A14337CP_BARMTR ;
         Z14338CP_BARPIE = A14338CP_BARPIE ;
         Z14339CP_BARALBK = A14339CP_BARALBK ;
         Z14340CP_BARALBM = A14340CP_BARALBM ;
         Z14325CP_BARENCC = A14325CP_BARENCC ;
         Z14341CP_DISUSRC = A14341CP_DISUSRC ;
         Z14351CP_BARMAQC = A14351CP_BARMAQC ;
         Z14352CP_BARESTR = A14352CP_BARESTR ;
      }
   }

   public void standaloneNotModal( )
   {
      AV15Pgmname = "Produccion.CONPRODUC" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15Pgmname", AV15Pgmname);
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      if ( ! (0==AV10CP_ID) )
      {
         A14297CP_ID = AV10CP_ID ;
         httpContext.ajax_rsp_assign_attri("", false, "A14297CP_ID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14297CP_ID), 10, 0));
      }
      if ( ! (0==AV10CP_ID) )
      {
         edtCP_ID_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCP_ID_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCP_ID_Enabled), 5, 0), true);
      }
      else
      {
         edtCP_ID_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCP_ID_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCP_ID_Enabled), 5, 0), true);
      }
      if ( ! (0==AV10CP_ID) )
      {
         edtCP_ID_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCP_ID_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCP_ID_Enabled), 5, 0), true);
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

   public void load1UO1902( )
   {
      /* Using cursor T01UO4 */
      pr_default.execute(2, new Object[] {Long.valueOf(A14297CP_ID)});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound1902 = (short)(1) ;
         A14328CP_EMPRCOD = T01UO4_A14328CP_EMPRCOD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14328CP_EMPRCOD", A14328CP_EMPRCOD);
         A14326CP_CLICOD = T01UO4_A14326CP_CLICOD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14326CP_CLICOD", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14326CP_CLICOD), 6, 0));
         A14327CP_CLINOM = T01UO4_A14327CP_CLINOM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14327CP_CLINOM", A14327CP_CLINOM);
         A14301CP_BARCOD = T01UO4_A14301CP_BARCOD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14301CP_BARCOD", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14301CP_BARCOD), 8, 0));
         A14302CP_BARCODR = T01UO4_A14302CP_BARCODR[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14302CP_BARCODR", GXutil.str( A14302CP_BARCODR, 1, 0));
         A14303CP_BARCODP = T01UO4_A14303CP_BARCODP[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14303CP_BARCODP", A14303CP_BARCODP);
         A14304CP_BARFECF = T01UO4_A14304CP_BARFECF[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14304CP_BARFECF", localUtil.format(A14304CP_BARFECF, "99/99/99"));
         A14305CP_BARNUMC = T01UO4_A14305CP_BARNUMC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14305CP_BARNUMC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14305CP_BARNUMC), 6, 0));
         A14306CP_BARPLF = T01UO4_A14306CP_BARPLF[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14306CP_BARPLF", A14306CP_BARPLF);
         A14307CP_BARSIT = T01UO4_A14307CP_BARSIT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14307CP_BARSIT", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14307CP_BARSIT), 2, 0));
         A14309CP_BARFECC = T01UO4_A14309CP_BARFECC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14309CP_BARFECC", localUtil.format(A14309CP_BARFECC, "99/99/99"));
         A14310CP_BARFECS = T01UO4_A14310CP_BARFECS[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14310CP_BARFECS", localUtil.format(A14310CP_BARFECS, "99/99/99"));
         A14308CP_BARFECG = T01UO4_A14308CP_BARFECG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14308CP_BARFECG", localUtil.format(A14308CP_BARFECG, "99/99/99"));
         A14311CP_BARSER = T01UO4_A14311CP_BARSER[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14311CP_BARSER", A14311CP_BARSER);
         A14312CP_BARSERD = T01UO4_A14312CP_BARSERD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14312CP_BARSERD", A14312CP_BARSERD);
         A14331CP_BARCOLO = T01UO4_A14331CP_BARCOLO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14331CP_BARCOLO", A14331CP_BARCOLO);
         A14332CP_BARCOLU = T01UO4_A14332CP_BARCOLU[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14332CP_BARCOLU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14332CP_BARCOLU), 6, 0));
         A14315CP_BARNOMC = T01UO4_A14315CP_BARNOMC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14315CP_BARNOMC", A14315CP_BARNOMC);
         A14316CP_BARTIPA = T01UO4_A14316CP_BARTIPA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14316CP_BARTIPA", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14316CP_BARTIPA), 4, 0));
         A14343CP_TARTDSC = T01UO4_A14343CP_TARTDSC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14343CP_TARTDSC", A14343CP_TARTDSC);
         A14317CP_BARGIRA = T01UO4_A14317CP_BARGIRA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14317CP_BARGIRA", A14317CP_BARGIRA);
         A14318CP_BARACAA = T01UO4_A14318CP_BARACAA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14318CP_BARACAA", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14318CP_BARACAA), 4, 0));
         A14319CP_BARAGRE = T01UO4_A14319CP_BARAGRE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14319CP_BARAGRE", A14319CP_BARAGRE);
         A14320CP_BAREXT = T01UO4_A14320CP_BAREXT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14320CP_BAREXT", GXutil.str( A14320CP_BAREXT, 1, 0));
         A14321CP_DISDES = T01UO4_A14321CP_DISDES[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14321CP_DISDES", A14321CP_DISDES);
         A14322CP_DISCOD = T01UO4_A14322CP_DISCOD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14322CP_DISCOD", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14322CP_DISCOD), 8, 0));
         A14323CP_BARPROP = T01UO4_A14323CP_BARPROP[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14323CP_BARPROP", A14323CP_BARPROP);
         A14334CP_DSC_BAR = T01UO4_A14334CP_DSC_BAR[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14334CP_DSC_BAR", A14334CP_DSC_BAR);
         A14324CP_BARDISN = T01UO4_A14324CP_BARDISN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14324CP_BARDISN", A14324CP_BARDISN);
         A14336CP_BARKGM = T01UO4_A14336CP_BARKGM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14336CP_BARKGM", GXutil.ltrimstr( A14336CP_BARKGM, 9, 2));
         A14337CP_BARMTR = T01UO4_A14337CP_BARMTR[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14337CP_BARMTR", GXutil.ltrimstr( A14337CP_BARMTR, 9, 2));
         A14338CP_BARPIE = T01UO4_A14338CP_BARPIE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14338CP_BARPIE", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14338CP_BARPIE), 6, 0));
         A14339CP_BARALBK = T01UO4_A14339CP_BARALBK[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14339CP_BARALBK", GXutil.ltrimstr( A14339CP_BARALBK, 9, 2));
         A14340CP_BARALBM = T01UO4_A14340CP_BARALBM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14340CP_BARALBM", GXutil.ltrimstr( A14340CP_BARALBM, 9, 2));
         A14325CP_BARENCC = T01UO4_A14325CP_BARENCC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14325CP_BARENCC", A14325CP_BARENCC);
         A14341CP_DISUSRC = T01UO4_A14341CP_DISUSRC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14341CP_DISUSRC", A14341CP_DISUSRC);
         A14351CP_BARMAQC = T01UO4_A14351CP_BARMAQC[0] ;
         A14352CP_BARESTR = T01UO4_A14352CP_BARESTR[0] ;
         zm1UO1902( -4) ;
      }
      pr_default.close(2);
      onLoadActions1UO1902( ) ;
   }

   public void onLoadActions1UO1902( )
   {
   }

   public void checkExtendedTable1UO1902( )
   {
      nIsDirty_1902 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors1UO1902( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1UO1902( )
   {
      /* Using cursor T01UO5 */
      pr_default.execute(3, new Object[] {Long.valueOf(A14297CP_ID)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound1902 = (short)(1) ;
      }
      else
      {
         RcdFound1902 = (short)(0) ;
      }
      pr_default.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01UO3 */
      pr_default.execute(1, new Object[] {Long.valueOf(A14297CP_ID)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1UO1902( 4) ;
         RcdFound1902 = (short)(1) ;
         A14297CP_ID = T01UO3_A14297CP_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14297CP_ID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14297CP_ID), 10, 0));
         A14328CP_EMPRCOD = T01UO3_A14328CP_EMPRCOD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14328CP_EMPRCOD", A14328CP_EMPRCOD);
         A14326CP_CLICOD = T01UO3_A14326CP_CLICOD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14326CP_CLICOD", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14326CP_CLICOD), 6, 0));
         A14327CP_CLINOM = T01UO3_A14327CP_CLINOM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14327CP_CLINOM", A14327CP_CLINOM);
         A14301CP_BARCOD = T01UO3_A14301CP_BARCOD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14301CP_BARCOD", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14301CP_BARCOD), 8, 0));
         A14302CP_BARCODR = T01UO3_A14302CP_BARCODR[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14302CP_BARCODR", GXutil.str( A14302CP_BARCODR, 1, 0));
         A14303CP_BARCODP = T01UO3_A14303CP_BARCODP[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14303CP_BARCODP", A14303CP_BARCODP);
         A14304CP_BARFECF = T01UO3_A14304CP_BARFECF[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14304CP_BARFECF", localUtil.format(A14304CP_BARFECF, "99/99/99"));
         A14305CP_BARNUMC = T01UO3_A14305CP_BARNUMC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14305CP_BARNUMC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14305CP_BARNUMC), 6, 0));
         A14306CP_BARPLF = T01UO3_A14306CP_BARPLF[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14306CP_BARPLF", A14306CP_BARPLF);
         A14307CP_BARSIT = T01UO3_A14307CP_BARSIT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14307CP_BARSIT", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14307CP_BARSIT), 2, 0));
         A14309CP_BARFECC = T01UO3_A14309CP_BARFECC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14309CP_BARFECC", localUtil.format(A14309CP_BARFECC, "99/99/99"));
         A14310CP_BARFECS = T01UO3_A14310CP_BARFECS[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14310CP_BARFECS", localUtil.format(A14310CP_BARFECS, "99/99/99"));
         A14308CP_BARFECG = T01UO3_A14308CP_BARFECG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14308CP_BARFECG", localUtil.format(A14308CP_BARFECG, "99/99/99"));
         A14311CP_BARSER = T01UO3_A14311CP_BARSER[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14311CP_BARSER", A14311CP_BARSER);
         A14312CP_BARSERD = T01UO3_A14312CP_BARSERD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14312CP_BARSERD", A14312CP_BARSERD);
         A14331CP_BARCOLO = T01UO3_A14331CP_BARCOLO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14331CP_BARCOLO", A14331CP_BARCOLO);
         A14332CP_BARCOLU = T01UO3_A14332CP_BARCOLU[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14332CP_BARCOLU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14332CP_BARCOLU), 6, 0));
         A14315CP_BARNOMC = T01UO3_A14315CP_BARNOMC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14315CP_BARNOMC", A14315CP_BARNOMC);
         A14316CP_BARTIPA = T01UO3_A14316CP_BARTIPA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14316CP_BARTIPA", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14316CP_BARTIPA), 4, 0));
         A14343CP_TARTDSC = T01UO3_A14343CP_TARTDSC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14343CP_TARTDSC", A14343CP_TARTDSC);
         A14317CP_BARGIRA = T01UO3_A14317CP_BARGIRA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14317CP_BARGIRA", A14317CP_BARGIRA);
         A14318CP_BARACAA = T01UO3_A14318CP_BARACAA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14318CP_BARACAA", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14318CP_BARACAA), 4, 0));
         A14319CP_BARAGRE = T01UO3_A14319CP_BARAGRE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14319CP_BARAGRE", A14319CP_BARAGRE);
         A14320CP_BAREXT = T01UO3_A14320CP_BAREXT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14320CP_BAREXT", GXutil.str( A14320CP_BAREXT, 1, 0));
         A14321CP_DISDES = T01UO3_A14321CP_DISDES[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14321CP_DISDES", A14321CP_DISDES);
         A14322CP_DISCOD = T01UO3_A14322CP_DISCOD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14322CP_DISCOD", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14322CP_DISCOD), 8, 0));
         A14323CP_BARPROP = T01UO3_A14323CP_BARPROP[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14323CP_BARPROP", A14323CP_BARPROP);
         A14334CP_DSC_BAR = T01UO3_A14334CP_DSC_BAR[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14334CP_DSC_BAR", A14334CP_DSC_BAR);
         A14324CP_BARDISN = T01UO3_A14324CP_BARDISN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14324CP_BARDISN", A14324CP_BARDISN);
         A14336CP_BARKGM = T01UO3_A14336CP_BARKGM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14336CP_BARKGM", GXutil.ltrimstr( A14336CP_BARKGM, 9, 2));
         A14337CP_BARMTR = T01UO3_A14337CP_BARMTR[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14337CP_BARMTR", GXutil.ltrimstr( A14337CP_BARMTR, 9, 2));
         A14338CP_BARPIE = T01UO3_A14338CP_BARPIE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14338CP_BARPIE", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14338CP_BARPIE), 6, 0));
         A14339CP_BARALBK = T01UO3_A14339CP_BARALBK[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14339CP_BARALBK", GXutil.ltrimstr( A14339CP_BARALBK, 9, 2));
         A14340CP_BARALBM = T01UO3_A14340CP_BARALBM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14340CP_BARALBM", GXutil.ltrimstr( A14340CP_BARALBM, 9, 2));
         A14325CP_BARENCC = T01UO3_A14325CP_BARENCC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14325CP_BARENCC", A14325CP_BARENCC);
         A14341CP_DISUSRC = T01UO3_A14341CP_DISUSRC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14341CP_DISUSRC", A14341CP_DISUSRC);
         A14351CP_BARMAQC = T01UO3_A14351CP_BARMAQC[0] ;
         A14352CP_BARESTR = T01UO3_A14352CP_BARESTR[0] ;
         Z14297CP_ID = A14297CP_ID ;
         sMode1902 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1UO1902( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1902 = (short)(0) ;
            initializeNonKey1UO1902( ) ;
         }
         Gx_mode = sMode1902 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1902 = (short)(0) ;
         initializeNonKey1UO1902( ) ;
         sMode1902 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1902 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1UO1902( ) ;
      if ( RcdFound1902 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound1902 = (short)(0) ;
      /* Using cursor T01UO6 */
      pr_default.execute(4, new Object[] {Long.valueOf(A14297CP_ID)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         while ( (pr_default.getStatus(4) != 101) && ( ( T01UO6_A14297CP_ID[0] < A14297CP_ID ) ) )
         {
            pr_default.readNext(4);
         }
         if ( (pr_default.getStatus(4) != 101) && ( ( T01UO6_A14297CP_ID[0] > A14297CP_ID ) ) )
         {
            A14297CP_ID = T01UO6_A14297CP_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A14297CP_ID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14297CP_ID), 10, 0));
            RcdFound1902 = (short)(1) ;
         }
      }
      pr_default.close(4);
   }

   public void move_previous( )
   {
      RcdFound1902 = (short)(0) ;
      /* Using cursor T01UO7 */
      pr_default.execute(5, new Object[] {Long.valueOf(A14297CP_ID)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( ( T01UO7_A14297CP_ID[0] > A14297CP_ID ) ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( ( T01UO7_A14297CP_ID[0] < A14297CP_ID ) ) )
         {
            A14297CP_ID = T01UO7_A14297CP_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A14297CP_ID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14297CP_ID), 10, 0));
            RcdFound1902 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1UO1902( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtCP_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1UO1902( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1902 == 1 )
         {
            if ( A14297CP_ID != Z14297CP_ID )
            {
               A14297CP_ID = Z14297CP_ID ;
               httpContext.ajax_rsp_assign_attri("", false, "A14297CP_ID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14297CP_ID), 10, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "CP_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCP_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtCP_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               update1UO1902( ) ;
               GX_FocusControl = edtCP_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( A14297CP_ID != Z14297CP_ID )
            {
               /* Insert record */
               GX_FocusControl = edtCP_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1UO1902( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "CP_ID");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtCP_ID_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  /* Insert record */
                  GX_FocusControl = edtCP_ID_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1UO1902( ) ;
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
      if ( A14297CP_ID != Z14297CP_ID )
      {
         A14297CP_ID = Z14297CP_ID ;
         httpContext.ajax_rsp_assign_attri("", false, "A14297CP_ID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14297CP_ID), 10, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "CP_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCP_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtCP_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency1UO1902( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01UO2 */
         pr_default.execute(0, new Object[] {Long.valueOf(A14297CP_ID)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCONPRO"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z14328CP_EMPRCOD, T01UO2_A14328CP_EMPRCOD[0]) != 0 ) || ( Z14326CP_CLICOD != T01UO2_A14326CP_CLICOD[0] ) || ( GXutil.strcmp(Z14327CP_CLINOM, T01UO2_A14327CP_CLINOM[0]) != 0 ) || ( Z14301CP_BARCOD != T01UO2_A14301CP_BARCOD[0] ) || ( Z14302CP_BARCODR != T01UO2_A14302CP_BARCODR[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z14303CP_BARCODP, T01UO2_A14303CP_BARCODP[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z14304CP_BARFECF), GXutil.resetTime(T01UO2_A14304CP_BARFECF[0])) ) || ( Z14305CP_BARNUMC != T01UO2_A14305CP_BARNUMC[0] ) || ( GXutil.strcmp(Z14306CP_BARPLF, T01UO2_A14306CP_BARPLF[0]) != 0 ) || ( Z14307CP_BARSIT != T01UO2_A14307CP_BARSIT[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || !( GXutil.dateCompare(GXutil.resetTime(Z14309CP_BARFECC), GXutil.resetTime(T01UO2_A14309CP_BARFECC[0])) ) || !( GXutil.dateCompare(GXutil.resetTime(Z14310CP_BARFECS), GXutil.resetTime(T01UO2_A14310CP_BARFECS[0])) ) || !( GXutil.dateCompare(GXutil.resetTime(Z14308CP_BARFECG), GXutil.resetTime(T01UO2_A14308CP_BARFECG[0])) ) || ( GXutil.strcmp(Z14311CP_BARSER, T01UO2_A14311CP_BARSER[0]) != 0 ) || ( GXutil.strcmp(Z14312CP_BARSERD, T01UO2_A14312CP_BARSERD[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z14331CP_BARCOLO, T01UO2_A14331CP_BARCOLO[0]) != 0 ) || ( Z14332CP_BARCOLU != T01UO2_A14332CP_BARCOLU[0] ) || ( GXutil.strcmp(Z14315CP_BARNOMC, T01UO2_A14315CP_BARNOMC[0]) != 0 ) || ( Z14316CP_BARTIPA != T01UO2_A14316CP_BARTIPA[0] ) || ( GXutil.strcmp(Z14343CP_TARTDSC, T01UO2_A14343CP_TARTDSC[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z14317CP_BARGIRA, T01UO2_A14317CP_BARGIRA[0]) != 0 ) || ( Z14318CP_BARACAA != T01UO2_A14318CP_BARACAA[0] ) || ( GXutil.strcmp(Z14319CP_BARAGRE, T01UO2_A14319CP_BARAGRE[0]) != 0 ) || ( Z14320CP_BAREXT != T01UO2_A14320CP_BAREXT[0] ) || ( GXutil.strcmp(Z14321CP_DISDES, T01UO2_A14321CP_DISDES[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z14322CP_DISCOD != T01UO2_A14322CP_DISCOD[0] ) || ( GXutil.strcmp(Z14323CP_BARPROP, T01UO2_A14323CP_BARPROP[0]) != 0 ) || ( GXutil.strcmp(Z14334CP_DSC_BAR, T01UO2_A14334CP_DSC_BAR[0]) != 0 ) || ( GXutil.strcmp(Z14324CP_BARDISN, T01UO2_A14324CP_BARDISN[0]) != 0 ) || ( DecimalUtil.compareTo(Z14336CP_BARKGM, T01UO2_A14336CP_BARKGM[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z14337CP_BARMTR, T01UO2_A14337CP_BARMTR[0]) != 0 ) || ( Z14338CP_BARPIE != T01UO2_A14338CP_BARPIE[0] ) || ( DecimalUtil.compareTo(Z14339CP_BARALBK, T01UO2_A14339CP_BARALBK[0]) != 0 ) || ( DecimalUtil.compareTo(Z14340CP_BARALBM, T01UO2_A14340CP_BARALBM[0]) != 0 ) || ( GXutil.strcmp(Z14325CP_BARENCC, T01UO2_A14325CP_BARENCC[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z14341CP_DISUSRC, T01UO2_A14341CP_DISUSRC[0]) != 0 ) || ( GXutil.strcmp(Z14351CP_BARMAQC, T01UO2_A14351CP_BARMAQC[0]) != 0 ) || ( Z14352CP_BARESTR != T01UO2_A14352CP_BARESTR[0] ) )
         {
            if ( GXutil.strcmp(Z14328CP_EMPRCOD, T01UO2_A14328CP_EMPRCOD[0]) != 0 )
            {
               GXutil.writeLogln("produccion.conproduc:[seudo value changed for attri]"+"CP_EMPRCOD");
               GXutil.writeLogRaw("Old: ",Z14328CP_EMPRCOD);
               GXutil.writeLogRaw("Current: ",T01UO2_A14328CP_EMPRCOD[0]);
            }
            if ( Z14326CP_CLICOD != T01UO2_A14326CP_CLICOD[0] )
            {
               GXutil.writeLogln("produccion.conproduc:[seudo value changed for attri]"+"CP_CLICOD");
               GXutil.writeLogRaw("Old: ",Z14326CP_CLICOD);
               GXutil.writeLogRaw("Current: ",T01UO2_A14326CP_CLICOD[0]);
            }
            if ( GXutil.strcmp(Z14327CP_CLINOM, T01UO2_A14327CP_CLINOM[0]) != 0 )
            {
               GXutil.writeLogln("produccion.conproduc:[seudo value changed for attri]"+"CP_CLINOM");
               GXutil.writeLogRaw("Old: ",Z14327CP_CLINOM);
               GXutil.writeLogRaw("Current: ",T01UO2_A14327CP_CLINOM[0]);
            }
            if ( Z14301CP_BARCOD != T01UO2_A14301CP_BARCOD[0] )
            {
               GXutil.writeLogln("produccion.conproduc:[seudo value changed for attri]"+"CP_BARCOD");
               GXutil.writeLogRaw("Old: ",Z14301CP_BARCOD);
               GXutil.writeLogRaw("Current: ",T01UO2_A14301CP_BARCOD[0]);
            }
            if ( Z14302CP_BARCODR != T01UO2_A14302CP_BARCODR[0] )
            {
               GXutil.writeLogln("produccion.conproduc:[seudo value changed for attri]"+"CP_BARCODR");
               GXutil.writeLogRaw("Old: ",Z14302CP_BARCODR);
               GXutil.writeLogRaw("Current: ",T01UO2_A14302CP_BARCODR[0]);
            }
            if ( GXutil.strcmp(Z14303CP_BARCODP, T01UO2_A14303CP_BARCODP[0]) != 0 )
            {
               GXutil.writeLogln("produccion.conproduc:[seudo value changed for attri]"+"CP_BARCODP");
               GXutil.writeLogRaw("Old: ",Z14303CP_BARCODP);
               GXutil.writeLogRaw("Current: ",T01UO2_A14303CP_BARCODP[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z14304CP_BARFECF), GXutil.resetTime(T01UO2_A14304CP_BARFECF[0])) ) )
            {
               GXutil.writeLogln("produccion.conproduc:[seudo value changed for attri]"+"CP_BARFECF");
               GXutil.writeLogRaw("Old: ",Z14304CP_BARFECF);
               GXutil.writeLogRaw("Current: ",T01UO2_A14304CP_BARFECF[0]);
            }
            if ( Z14305CP_BARNUMC != T01UO2_A14305CP_BARNUMC[0] )
            {
               GXutil.writeLogln("produccion.conproduc:[seudo value changed for attri]"+"CP_BARNUMC");
               GXutil.writeLogRaw("Old: ",Z14305CP_BARNUMC);
               GXutil.writeLogRaw("Current: ",T01UO2_A14305CP_BARNUMC[0]);
            }
            if ( GXutil.strcmp(Z14306CP_BARPLF, T01UO2_A14306CP_BARPLF[0]) != 0 )
            {
               GXutil.writeLogln("produccion.conproduc:[seudo value changed for attri]"+"CP_BARPLF");
               GXutil.writeLogRaw("Old: ",Z14306CP_BARPLF);
               GXutil.writeLogRaw("Current: ",T01UO2_A14306CP_BARPLF[0]);
            }
            if ( Z14307CP_BARSIT != T01UO2_A14307CP_BARSIT[0] )
            {
               GXutil.writeLogln("produccion.conproduc:[seudo value changed for attri]"+"CP_BARSIT");
               GXutil.writeLogRaw("Old: ",Z14307CP_BARSIT);
               GXutil.writeLogRaw("Current: ",T01UO2_A14307CP_BARSIT[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z14309CP_BARFECC), GXutil.resetTime(T01UO2_A14309CP_BARFECC[0])) ) )
            {
               GXutil.writeLogln("produccion.conproduc:[seudo value changed for attri]"+"CP_BARFECC");
               GXutil.writeLogRaw("Old: ",Z14309CP_BARFECC);
               GXutil.writeLogRaw("Current: ",T01UO2_A14309CP_BARFECC[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z14310CP_BARFECS), GXutil.resetTime(T01UO2_A14310CP_BARFECS[0])) ) )
            {
               GXutil.writeLogln("produccion.conproduc:[seudo value changed for attri]"+"CP_BARFECS");
               GXutil.writeLogRaw("Old: ",Z14310CP_BARFECS);
               GXutil.writeLogRaw("Current: ",T01UO2_A14310CP_BARFECS[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z14308CP_BARFECG), GXutil.resetTime(T01UO2_A14308CP_BARFECG[0])) ) )
            {
               GXutil.writeLogln("produccion.conproduc:[seudo value changed for attri]"+"CP_BARFECG");
               GXutil.writeLogRaw("Old: ",Z14308CP_BARFECG);
               GXutil.writeLogRaw("Current: ",T01UO2_A14308CP_BARFECG[0]);
            }
            if ( GXutil.strcmp(Z14311CP_BARSER, T01UO2_A14311CP_BARSER[0]) != 0 )
            {
               GXutil.writeLogln("produccion.conproduc:[seudo value changed for attri]"+"CP_BARSER");
               GXutil.writeLogRaw("Old: ",Z14311CP_BARSER);
               GXutil.writeLogRaw("Current: ",T01UO2_A14311CP_BARSER[0]);
            }
            if ( GXutil.strcmp(Z14312CP_BARSERD, T01UO2_A14312CP_BARSERD[0]) != 0 )
            {
               GXutil.writeLogln("produccion.conproduc:[seudo value changed for attri]"+"CP_BARSERD");
               GXutil.writeLogRaw("Old: ",Z14312CP_BARSERD);
               GXutil.writeLogRaw("Current: ",T01UO2_A14312CP_BARSERD[0]);
            }
            if ( GXutil.strcmp(Z14331CP_BARCOLO, T01UO2_A14331CP_BARCOLO[0]) != 0 )
            {
               GXutil.writeLogln("produccion.conproduc:[seudo value changed for attri]"+"CP_BARCOLO");
               GXutil.writeLogRaw("Old: ",Z14331CP_BARCOLO);
               GXutil.writeLogRaw("Current: ",T01UO2_A14331CP_BARCOLO[0]);
            }
            if ( Z14332CP_BARCOLU != T01UO2_A14332CP_BARCOLU[0] )
            {
               GXutil.writeLogln("produccion.conproduc:[seudo value changed for attri]"+"CP_BARCOLU");
               GXutil.writeLogRaw("Old: ",Z14332CP_BARCOLU);
               GXutil.writeLogRaw("Current: ",T01UO2_A14332CP_BARCOLU[0]);
            }
            if ( GXutil.strcmp(Z14315CP_BARNOMC, T01UO2_A14315CP_BARNOMC[0]) != 0 )
            {
               GXutil.writeLogln("produccion.conproduc:[seudo value changed for attri]"+"CP_BARNOMC");
               GXutil.writeLogRaw("Old: ",Z14315CP_BARNOMC);
               GXutil.writeLogRaw("Current: ",T01UO2_A14315CP_BARNOMC[0]);
            }
            if ( Z14316CP_BARTIPA != T01UO2_A14316CP_BARTIPA[0] )
            {
               GXutil.writeLogln("produccion.conproduc:[seudo value changed for attri]"+"CP_BARTIPA");
               GXutil.writeLogRaw("Old: ",Z14316CP_BARTIPA);
               GXutil.writeLogRaw("Current: ",T01UO2_A14316CP_BARTIPA[0]);
            }
            if ( GXutil.strcmp(Z14343CP_TARTDSC, T01UO2_A14343CP_TARTDSC[0]) != 0 )
            {
               GXutil.writeLogln("produccion.conproduc:[seudo value changed for attri]"+"CP_TARTDSC");
               GXutil.writeLogRaw("Old: ",Z14343CP_TARTDSC);
               GXutil.writeLogRaw("Current: ",T01UO2_A14343CP_TARTDSC[0]);
            }
            if ( GXutil.strcmp(Z14317CP_BARGIRA, T01UO2_A14317CP_BARGIRA[0]) != 0 )
            {
               GXutil.writeLogln("produccion.conproduc:[seudo value changed for attri]"+"CP_BARGIRA");
               GXutil.writeLogRaw("Old: ",Z14317CP_BARGIRA);
               GXutil.writeLogRaw("Current: ",T01UO2_A14317CP_BARGIRA[0]);
            }
            if ( Z14318CP_BARACAA != T01UO2_A14318CP_BARACAA[0] )
            {
               GXutil.writeLogln("produccion.conproduc:[seudo value changed for attri]"+"CP_BARACAA");
               GXutil.writeLogRaw("Old: ",Z14318CP_BARACAA);
               GXutil.writeLogRaw("Current: ",T01UO2_A14318CP_BARACAA[0]);
            }
            if ( GXutil.strcmp(Z14319CP_BARAGRE, T01UO2_A14319CP_BARAGRE[0]) != 0 )
            {
               GXutil.writeLogln("produccion.conproduc:[seudo value changed for attri]"+"CP_BARAGRE");
               GXutil.writeLogRaw("Old: ",Z14319CP_BARAGRE);
               GXutil.writeLogRaw("Current: ",T01UO2_A14319CP_BARAGRE[0]);
            }
            if ( Z14320CP_BAREXT != T01UO2_A14320CP_BAREXT[0] )
            {
               GXutil.writeLogln("produccion.conproduc:[seudo value changed for attri]"+"CP_BAREXT");
               GXutil.writeLogRaw("Old: ",Z14320CP_BAREXT);
               GXutil.writeLogRaw("Current: ",T01UO2_A14320CP_BAREXT[0]);
            }
            if ( GXutil.strcmp(Z14321CP_DISDES, T01UO2_A14321CP_DISDES[0]) != 0 )
            {
               GXutil.writeLogln("produccion.conproduc:[seudo value changed for attri]"+"CP_DISDES");
               GXutil.writeLogRaw("Old: ",Z14321CP_DISDES);
               GXutil.writeLogRaw("Current: ",T01UO2_A14321CP_DISDES[0]);
            }
            if ( Z14322CP_DISCOD != T01UO2_A14322CP_DISCOD[0] )
            {
               GXutil.writeLogln("produccion.conproduc:[seudo value changed for attri]"+"CP_DISCOD");
               GXutil.writeLogRaw("Old: ",Z14322CP_DISCOD);
               GXutil.writeLogRaw("Current: ",T01UO2_A14322CP_DISCOD[0]);
            }
            if ( GXutil.strcmp(Z14323CP_BARPROP, T01UO2_A14323CP_BARPROP[0]) != 0 )
            {
               GXutil.writeLogln("produccion.conproduc:[seudo value changed for attri]"+"CP_BARPROP");
               GXutil.writeLogRaw("Old: ",Z14323CP_BARPROP);
               GXutil.writeLogRaw("Current: ",T01UO2_A14323CP_BARPROP[0]);
            }
            if ( GXutil.strcmp(Z14334CP_DSC_BAR, T01UO2_A14334CP_DSC_BAR[0]) != 0 )
            {
               GXutil.writeLogln("produccion.conproduc:[seudo value changed for attri]"+"CP_DSC_BAR");
               GXutil.writeLogRaw("Old: ",Z14334CP_DSC_BAR);
               GXutil.writeLogRaw("Current: ",T01UO2_A14334CP_DSC_BAR[0]);
            }
            if ( GXutil.strcmp(Z14324CP_BARDISN, T01UO2_A14324CP_BARDISN[0]) != 0 )
            {
               GXutil.writeLogln("produccion.conproduc:[seudo value changed for attri]"+"CP_BARDISN");
               GXutil.writeLogRaw("Old: ",Z14324CP_BARDISN);
               GXutil.writeLogRaw("Current: ",T01UO2_A14324CP_BARDISN[0]);
            }
            if ( DecimalUtil.compareTo(Z14336CP_BARKGM, T01UO2_A14336CP_BARKGM[0]) != 0 )
            {
               GXutil.writeLogln("produccion.conproduc:[seudo value changed for attri]"+"CP_BARKGM");
               GXutil.writeLogRaw("Old: ",Z14336CP_BARKGM);
               GXutil.writeLogRaw("Current: ",T01UO2_A14336CP_BARKGM[0]);
            }
            if ( DecimalUtil.compareTo(Z14337CP_BARMTR, T01UO2_A14337CP_BARMTR[0]) != 0 )
            {
               GXutil.writeLogln("produccion.conproduc:[seudo value changed for attri]"+"CP_BARMTR");
               GXutil.writeLogRaw("Old: ",Z14337CP_BARMTR);
               GXutil.writeLogRaw("Current: ",T01UO2_A14337CP_BARMTR[0]);
            }
            if ( Z14338CP_BARPIE != T01UO2_A14338CP_BARPIE[0] )
            {
               GXutil.writeLogln("produccion.conproduc:[seudo value changed for attri]"+"CP_BARPIE");
               GXutil.writeLogRaw("Old: ",Z14338CP_BARPIE);
               GXutil.writeLogRaw("Current: ",T01UO2_A14338CP_BARPIE[0]);
            }
            if ( DecimalUtil.compareTo(Z14339CP_BARALBK, T01UO2_A14339CP_BARALBK[0]) != 0 )
            {
               GXutil.writeLogln("produccion.conproduc:[seudo value changed for attri]"+"CP_BARALBK");
               GXutil.writeLogRaw("Old: ",Z14339CP_BARALBK);
               GXutil.writeLogRaw("Current: ",T01UO2_A14339CP_BARALBK[0]);
            }
            if ( DecimalUtil.compareTo(Z14340CP_BARALBM, T01UO2_A14340CP_BARALBM[0]) != 0 )
            {
               GXutil.writeLogln("produccion.conproduc:[seudo value changed for attri]"+"CP_BARALBM");
               GXutil.writeLogRaw("Old: ",Z14340CP_BARALBM);
               GXutil.writeLogRaw("Current: ",T01UO2_A14340CP_BARALBM[0]);
            }
            if ( GXutil.strcmp(Z14325CP_BARENCC, T01UO2_A14325CP_BARENCC[0]) != 0 )
            {
               GXutil.writeLogln("produccion.conproduc:[seudo value changed for attri]"+"CP_BARENCC");
               GXutil.writeLogRaw("Old: ",Z14325CP_BARENCC);
               GXutil.writeLogRaw("Current: ",T01UO2_A14325CP_BARENCC[0]);
            }
            if ( GXutil.strcmp(Z14341CP_DISUSRC, T01UO2_A14341CP_DISUSRC[0]) != 0 )
            {
               GXutil.writeLogln("produccion.conproduc:[seudo value changed for attri]"+"CP_DISUSRC");
               GXutil.writeLogRaw("Old: ",Z14341CP_DISUSRC);
               GXutil.writeLogRaw("Current: ",T01UO2_A14341CP_DISUSRC[0]);
            }
            if ( GXutil.strcmp(Z14351CP_BARMAQC, T01UO2_A14351CP_BARMAQC[0]) != 0 )
            {
               GXutil.writeLogln("produccion.conproduc:[seudo value changed for attri]"+"CP_BARMAQC");
               GXutil.writeLogRaw("Old: ",Z14351CP_BARMAQC);
               GXutil.writeLogRaw("Current: ",T01UO2_A14351CP_BARMAQC[0]);
            }
            if ( Z14352CP_BARESTR != T01UO2_A14352CP_BARESTR[0] )
            {
               GXutil.writeLogln("produccion.conproduc:[seudo value changed for attri]"+"CP_BARESTR");
               GXutil.writeLogRaw("Old: ",Z14352CP_BARESTR);
               GXutil.writeLogRaw("Current: ",T01UO2_A14352CP_BARESTR[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCONPRO"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1UO1902( )
   {
      beforeValidate1UO1902( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1UO1902( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1UO1902( 0) ;
         checkOptimisticConcurrency1UO1902( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1UO1902( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1UO1902( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01UO8 */
                  pr_default.execute(6, new Object[] {Long.valueOf(A14297CP_ID), A14328CP_EMPRCOD, Integer.valueOf(A14326CP_CLICOD), A14327CP_CLINOM, Integer.valueOf(A14301CP_BARCOD), Byte.valueOf(A14302CP_BARCODR), A14303CP_BARCODP, A14304CP_BARFECF, Integer.valueOf(A14305CP_BARNUMC), A14306CP_BARPLF, Byte.valueOf(A14307CP_BARSIT), A14309CP_BARFECC, A14310CP_BARFECS, A14308CP_BARFECG, A14311CP_BARSER, A14312CP_BARSERD, A14331CP_BARCOLO, Integer.valueOf(A14332CP_BARCOLU), A14315CP_BARNOMC, Short.valueOf(A14316CP_BARTIPA), A14343CP_TARTDSC, A14317CP_BARGIRA, Short.valueOf(A14318CP_BARACAA), A14319CP_BARAGRE, Byte.valueOf(A14320CP_BAREXT), A14321CP_DISDES, Integer.valueOf(A14322CP_DISCOD), A14323CP_BARPROP, A14334CP_DSC_BAR, A14324CP_BARDISN, A14336CP_BARKGM, A14337CP_BARMTR, Integer.valueOf(A14338CP_BARPIE), A14339CP_BARALBK, A14340CP_BARALBM, A14325CP_BARENCC, A14341CP_DISUSRC, A14351CP_BARMAQC, Byte.valueOf(A14352CP_BARESTR)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCONPRO");
                  if ( (pr_default.getStatus(6) == 1) )
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
                        resetCaption1UO0( ) ;
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
            load1UO1902( ) ;
         }
         endLevel1UO1902( ) ;
      }
      closeExtendedTableCursors1UO1902( ) ;
   }

   public void update1UO1902( )
   {
      beforeValidate1UO1902( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1UO1902( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1UO1902( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1UO1902( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1UO1902( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01UO9 */
                  pr_default.execute(7, new Object[] {A14328CP_EMPRCOD, Integer.valueOf(A14326CP_CLICOD), A14327CP_CLINOM, Integer.valueOf(A14301CP_BARCOD), Byte.valueOf(A14302CP_BARCODR), A14303CP_BARCODP, A14304CP_BARFECF, Integer.valueOf(A14305CP_BARNUMC), A14306CP_BARPLF, Byte.valueOf(A14307CP_BARSIT), A14309CP_BARFECC, A14310CP_BARFECS, A14308CP_BARFECG, A14311CP_BARSER, A14312CP_BARSERD, A14331CP_BARCOLO, Integer.valueOf(A14332CP_BARCOLU), A14315CP_BARNOMC, Short.valueOf(A14316CP_BARTIPA), A14343CP_TARTDSC, A14317CP_BARGIRA, Short.valueOf(A14318CP_BARACAA), A14319CP_BARAGRE, Byte.valueOf(A14320CP_BAREXT), A14321CP_DISDES, Integer.valueOf(A14322CP_DISCOD), A14323CP_BARPROP, A14334CP_DSC_BAR, A14324CP_BARDISN, A14336CP_BARKGM, A14337CP_BARMTR, Integer.valueOf(A14338CP_BARPIE), A14339CP_BARALBK, A14340CP_BARALBM, A14325CP_BARENCC, A14341CP_DISUSRC, A14351CP_BARMAQC, Byte.valueOf(A14352CP_BARESTR), Long.valueOf(A14297CP_ID)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCONPRO");
                  if ( (pr_default.getStatus(7) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCONPRO"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1UO1902( ) ;
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
         endLevel1UO1902( ) ;
      }
      closeExtendedTableCursors1UO1902( ) ;
   }

   public void deferredUpdate1UO1902( )
   {
   }

   public void delete( )
   {
      beforeValidate1UO1902( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1UO1902( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1UO1902( ) ;
         afterConfirm1UO1902( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1UO1902( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01UO10 */
               pr_default.execute(8, new Object[] {Long.valueOf(A14297CP_ID)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCONPRO");
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
      sMode1902 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1UO1902( ) ;
      Gx_mode = sMode1902 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1UO1902( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel1UO1902( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1UO1902( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "produccion.conproduc");
         if ( AnyError == 0 )
         {
            confirmValues1UO0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "produccion.conproduc");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1UO1902( )
   {
      /* Scan By routine */
      /* Using cursor T01UO11 */
      pr_default.execute(9);
      RcdFound1902 = (short)(0) ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound1902 = (short)(1) ;
         A14297CP_ID = T01UO11_A14297CP_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14297CP_ID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14297CP_ID), 10, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1UO1902( )
   {
      /* Scan next routine */
      pr_default.readNext(9);
      RcdFound1902 = (short)(0) ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound1902 = (short)(1) ;
         A14297CP_ID = T01UO11_A14297CP_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14297CP_ID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14297CP_ID), 10, 0));
      }
   }

   public void scanEnd1UO1902( )
   {
      pr_default.close(9);
   }

   public void afterConfirm1UO1902( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1UO1902( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1UO1902( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1UO1902( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1UO1902( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1UO1902( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1UO1902( )
   {
      edtCP_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCP_ID_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCP_ID_Enabled), 5, 0), true);
      edtCP_EMPRCOD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCP_EMPRCOD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCP_EMPRCOD_Enabled), 5, 0), true);
      edtCP_CLICOD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCP_CLICOD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCP_CLICOD_Enabled), 5, 0), true);
      edtCP_CLINOM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCP_CLINOM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCP_CLINOM_Enabled), 5, 0), true);
      edtCP_BARCOD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCP_BARCOD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCP_BARCOD_Enabled), 5, 0), true);
      edtCP_BARCODR_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCP_BARCODR_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCP_BARCODR_Enabled), 5, 0), true);
      edtCP_BARCODP_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCP_BARCODP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCP_BARCODP_Enabled), 5, 0), true);
      edtCP_BARFECF_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCP_BARFECF_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCP_BARFECF_Enabled), 5, 0), true);
      edtCP_BARNUMC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCP_BARNUMC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCP_BARNUMC_Enabled), 5, 0), true);
      edtCP_BARPLF_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCP_BARPLF_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCP_BARPLF_Enabled), 5, 0), true);
      edtCP_BARSIT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCP_BARSIT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCP_BARSIT_Enabled), 5, 0), true);
      edtCP_BARFECG_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCP_BARFECG_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCP_BARFECG_Enabled), 5, 0), true);
      edtCP_BARFECC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCP_BARFECC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCP_BARFECC_Enabled), 5, 0), true);
      edtCP_BARFECS_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCP_BARFECS_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCP_BARFECS_Enabled), 5, 0), true);
      edtCP_BARSER_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCP_BARSER_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCP_BARSER_Enabled), 5, 0), true);
      edtCP_BARSERD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCP_BARSERD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCP_BARSERD_Enabled), 5, 0), true);
      edtCP_BARNOMC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCP_BARNOMC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCP_BARNOMC_Enabled), 5, 0), true);
      edtCP_BARTIPA_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCP_BARTIPA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCP_BARTIPA_Enabled), 5, 0), true);
      edtCP_TARTDSC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCP_TARTDSC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCP_TARTDSC_Enabled), 5, 0), true);
      edtCP_BARGIRA_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCP_BARGIRA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCP_BARGIRA_Enabled), 5, 0), true);
      edtCP_BARACAA_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCP_BARACAA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCP_BARACAA_Enabled), 5, 0), true);
      edtCP_BARAGRE_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCP_BARAGRE_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCP_BARAGRE_Enabled), 5, 0), true);
      edtCP_BAREXT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCP_BAREXT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCP_BAREXT_Enabled), 5, 0), true);
      edtCP_DISDES_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCP_DISDES_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCP_DISDES_Enabled), 5, 0), true);
      edtCP_DISCOD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCP_DISCOD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCP_DISCOD_Enabled), 5, 0), true);
      edtCP_BARPROP_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCP_BARPROP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCP_BARPROP_Enabled), 5, 0), true);
      edtCP_BARDISN_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCP_BARDISN_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCP_BARDISN_Enabled), 5, 0), true);
      edtCP_BARENCC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCP_BARENCC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCP_BARENCC_Enabled), 5, 0), true);
      edtCP_BARCOLO_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCP_BARCOLO_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCP_BARCOLO_Enabled), 5, 0), true);
      edtCP_BARCOLU_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCP_BARCOLU_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCP_BARCOLU_Enabled), 5, 0), true);
      edtCP_DSC_BAR_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCP_DSC_BAR_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCP_DSC_BAR_Enabled), 5, 0), true);
      edtCP_BARKGM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCP_BARKGM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCP_BARKGM_Enabled), 5, 0), true);
      edtCP_BARMTR_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCP_BARMTR_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCP_BARMTR_Enabled), 5, 0), true);
      edtCP_BARPIE_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCP_BARPIE_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCP_BARPIE_Enabled), 5, 0), true);
      edtCP_BARALBK_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCP_BARALBK_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCP_BARALBK_Enabled), 5, 0), true);
      edtCP_BARALBM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCP_BARALBM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCP_BARALBM_Enabled), 5, 0), true);
      edtCP_DISUSRC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCP_DISUSRC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCP_DISUSRC_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1UO1902( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1UO0( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.produccion.conproduc", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.ltrimstr(AV10CP_ID,10,0))}, new String[] {"Gx_mode","CP_ID"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"CONPRODUC");
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      forbiddenHiddens.add("CP_BARMAQC", GXutil.rtrim( localUtil.format( A14351CP_BARMAQC, "")));
      forbiddenHiddens.add("CP_BARESTR", localUtil.format( DecimalUtil.doubleToDec(A14352CP_BARESTR), "9"));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("produccion\\conproduc:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z14297CP_ID", GXutil.ltrim( localUtil.ntoc( Z14297CP_ID, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14328CP_EMPRCOD", GXutil.rtrim( Z14328CP_EMPRCOD));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14326CP_CLICOD", GXutil.ltrim( localUtil.ntoc( Z14326CP_CLICOD, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14327CP_CLINOM", Z14327CP_CLINOM);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14301CP_BARCOD", GXutil.ltrim( localUtil.ntoc( Z14301CP_BARCOD, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14302CP_BARCODR", GXutil.ltrim( localUtil.ntoc( Z14302CP_BARCODR, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14303CP_BARCODP", GXutil.rtrim( Z14303CP_BARCODP));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14304CP_BARFECF", localUtil.dtoc( Z14304CP_BARFECF, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14305CP_BARNUMC", GXutil.ltrim( localUtil.ntoc( Z14305CP_BARNUMC, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14306CP_BARPLF", GXutil.rtrim( Z14306CP_BARPLF));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14307CP_BARSIT", GXutil.ltrim( localUtil.ntoc( Z14307CP_BARSIT, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14309CP_BARFECC", localUtil.dtoc( Z14309CP_BARFECC, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14310CP_BARFECS", localUtil.dtoc( Z14310CP_BARFECS, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14308CP_BARFECG", localUtil.dtoc( Z14308CP_BARFECG, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14311CP_BARSER", GXutil.rtrim( Z14311CP_BARSER));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14312CP_BARSERD", Z14312CP_BARSERD);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14331CP_BARCOLO", GXutil.rtrim( Z14331CP_BARCOLO));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14332CP_BARCOLU", GXutil.ltrim( localUtil.ntoc( Z14332CP_BARCOLU, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14315CP_BARNOMC", Z14315CP_BARNOMC);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14316CP_BARTIPA", GXutil.ltrim( localUtil.ntoc( Z14316CP_BARTIPA, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14343CP_TARTDSC", Z14343CP_TARTDSC);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14317CP_BARGIRA", Z14317CP_BARGIRA);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14318CP_BARACAA", GXutil.ltrim( localUtil.ntoc( Z14318CP_BARACAA, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14319CP_BARAGRE", GXutil.rtrim( Z14319CP_BARAGRE));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14320CP_BAREXT", GXutil.ltrim( localUtil.ntoc( Z14320CP_BAREXT, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14321CP_DISDES", GXutil.rtrim( Z14321CP_DISDES));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14322CP_DISCOD", GXutil.ltrim( localUtil.ntoc( Z14322CP_DISCOD, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14323CP_BARPROP", GXutil.rtrim( Z14323CP_BARPROP));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14334CP_DSC_BAR", Z14334CP_DSC_BAR);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14324CP_BARDISN", GXutil.rtrim( Z14324CP_BARDISN));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14336CP_BARKGM", GXutil.ltrim( localUtil.ntoc( Z14336CP_BARKGM, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14337CP_BARMTR", GXutil.ltrim( localUtil.ntoc( Z14337CP_BARMTR, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14338CP_BARPIE", GXutil.ltrim( localUtil.ntoc( Z14338CP_BARPIE, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14339CP_BARALBK", GXutil.ltrim( localUtil.ntoc( Z14339CP_BARALBK, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14340CP_BARALBM", GXutil.ltrim( localUtil.ntoc( Z14340CP_BARALBM, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14325CP_BARENCC", GXutil.rtrim( Z14325CP_BARENCC));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14341CP_DISUSRC", GXutil.rtrim( Z14341CP_DISUSRC));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14351CP_BARMAQC", GXutil.rtrim( Z14351CP_BARMAQC));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14352CP_BARESTR", GXutil.ltrim( localUtil.ntoc( Z14352CP_BARESTR, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTRNCONTEXT", AV8TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTRNCONTEXT", AV8TrnContext);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTRNCONTEXT", getSecureSignedToken( "", AV8TrnContext));
      app.GxWebStd.gx_hidden_field( httpContext, "vCP_ID", GXutil.ltrim( localUtil.ntoc( AV10CP_ID, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCP_ID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV10CP_ID), "ZZZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "CP_BARMAQC", GXutil.rtrim( A14351CP_BARMAQC));
      app.GxWebStd.gx_hidden_field( httpContext, "CP_BARESTR", GXutil.ltrim( localUtil.ntoc( A14352CP_BARESTR, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.produccion.conproduc", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.ltrimstr(AV10CP_ID,10,0))}, new String[] {"Gx_mode","CP_ID"})  ;
   }

   public String getPgmname( )
   {
      return "Produccion.CONPRODUC" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Consulta de Produccion", "") ;
   }

   public void initializeNonKey1UO1902( )
   {
      A14328CP_EMPRCOD = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14328CP_EMPRCOD", A14328CP_EMPRCOD);
      A14326CP_CLICOD = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14326CP_CLICOD", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14326CP_CLICOD), 6, 0));
      A14327CP_CLINOM = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14327CP_CLINOM", A14327CP_CLINOM);
      A14301CP_BARCOD = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14301CP_BARCOD", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14301CP_BARCOD), 8, 0));
      A14302CP_BARCODR = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A14302CP_BARCODR", GXutil.str( A14302CP_BARCODR, 1, 0));
      A14303CP_BARCODP = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14303CP_BARCODP", A14303CP_BARCODP);
      A14304CP_BARFECF = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A14304CP_BARFECF", localUtil.format(A14304CP_BARFECF, "99/99/99"));
      A14305CP_BARNUMC = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14305CP_BARNUMC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14305CP_BARNUMC), 6, 0));
      A14306CP_BARPLF = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14306CP_BARPLF", A14306CP_BARPLF);
      A14307CP_BARSIT = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A14307CP_BARSIT", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14307CP_BARSIT), 2, 0));
      A14309CP_BARFECC = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A14309CP_BARFECC", localUtil.format(A14309CP_BARFECC, "99/99/99"));
      A14310CP_BARFECS = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A14310CP_BARFECS", localUtil.format(A14310CP_BARFECS, "99/99/99"));
      A14308CP_BARFECG = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A14308CP_BARFECG", localUtil.format(A14308CP_BARFECG, "99/99/99"));
      A14311CP_BARSER = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14311CP_BARSER", A14311CP_BARSER);
      A14312CP_BARSERD = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14312CP_BARSERD", A14312CP_BARSERD);
      A14331CP_BARCOLO = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14331CP_BARCOLO", A14331CP_BARCOLO);
      A14332CP_BARCOLU = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14332CP_BARCOLU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14332CP_BARCOLU), 6, 0));
      A14315CP_BARNOMC = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14315CP_BARNOMC", A14315CP_BARNOMC);
      A14316CP_BARTIPA = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A14316CP_BARTIPA", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14316CP_BARTIPA), 4, 0));
      A14343CP_TARTDSC = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14343CP_TARTDSC", A14343CP_TARTDSC);
      A14317CP_BARGIRA = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14317CP_BARGIRA", A14317CP_BARGIRA);
      A14318CP_BARACAA = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A14318CP_BARACAA", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14318CP_BARACAA), 4, 0));
      A14319CP_BARAGRE = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14319CP_BARAGRE", A14319CP_BARAGRE);
      A14320CP_BAREXT = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A14320CP_BAREXT", GXutil.str( A14320CP_BAREXT, 1, 0));
      A14321CP_DISDES = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14321CP_DISDES", A14321CP_DISDES);
      A14322CP_DISCOD = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14322CP_DISCOD", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14322CP_DISCOD), 8, 0));
      A14323CP_BARPROP = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14323CP_BARPROP", A14323CP_BARPROP);
      A14334CP_DSC_BAR = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14334CP_DSC_BAR", A14334CP_DSC_BAR);
      A14324CP_BARDISN = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14324CP_BARDISN", A14324CP_BARDISN);
      A14336CP_BARKGM = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A14336CP_BARKGM", GXutil.ltrimstr( A14336CP_BARKGM, 9, 2));
      A14337CP_BARMTR = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A14337CP_BARMTR", GXutil.ltrimstr( A14337CP_BARMTR, 9, 2));
      A14338CP_BARPIE = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14338CP_BARPIE", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14338CP_BARPIE), 6, 0));
      A14339CP_BARALBK = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A14339CP_BARALBK", GXutil.ltrimstr( A14339CP_BARALBK, 9, 2));
      A14340CP_BARALBM = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A14340CP_BARALBM", GXutil.ltrimstr( A14340CP_BARALBM, 9, 2));
      A14325CP_BARENCC = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14325CP_BARENCC", A14325CP_BARENCC);
      A14341CP_DISUSRC = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14341CP_DISUSRC", A14341CP_DISUSRC);
      A14351CP_BARMAQC = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14351CP_BARMAQC", A14351CP_BARMAQC);
      A14352CP_BARESTR = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A14352CP_BARESTR", GXutil.str( A14352CP_BARESTR, 1, 0));
      Z14328CP_EMPRCOD = "" ;
      Z14326CP_CLICOD = 0 ;
      Z14327CP_CLINOM = "" ;
      Z14301CP_BARCOD = 0 ;
      Z14302CP_BARCODR = (byte)(0) ;
      Z14303CP_BARCODP = "" ;
      Z14304CP_BARFECF = GXutil.nullDate() ;
      Z14305CP_BARNUMC = 0 ;
      Z14306CP_BARPLF = "" ;
      Z14307CP_BARSIT = (byte)(0) ;
      Z14309CP_BARFECC = GXutil.nullDate() ;
      Z14310CP_BARFECS = GXutil.nullDate() ;
      Z14308CP_BARFECG = GXutil.nullDate() ;
      Z14311CP_BARSER = "" ;
      Z14312CP_BARSERD = "" ;
      Z14331CP_BARCOLO = "" ;
      Z14332CP_BARCOLU = 0 ;
      Z14315CP_BARNOMC = "" ;
      Z14316CP_BARTIPA = (short)(0) ;
      Z14343CP_TARTDSC = "" ;
      Z14317CP_BARGIRA = "" ;
      Z14318CP_BARACAA = (short)(0) ;
      Z14319CP_BARAGRE = "" ;
      Z14320CP_BAREXT = (byte)(0) ;
      Z14321CP_DISDES = "" ;
      Z14322CP_DISCOD = 0 ;
      Z14323CP_BARPROP = "" ;
      Z14334CP_DSC_BAR = "" ;
      Z14324CP_BARDISN = "" ;
      Z14336CP_BARKGM = DecimalUtil.ZERO ;
      Z14337CP_BARMTR = DecimalUtil.ZERO ;
      Z14338CP_BARPIE = 0 ;
      Z14339CP_BARALBK = DecimalUtil.ZERO ;
      Z14340CP_BARALBM = DecimalUtil.ZERO ;
      Z14325CP_BARENCC = "" ;
      Z14341CP_DISUSRC = "" ;
      Z14351CP_BARMAQC = "" ;
      Z14352CP_BARESTR = (byte)(0) ;
   }

   public void initAll1UO1902( )
   {
      A14297CP_ID = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14297CP_ID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14297CP_ID), 10, 0));
      initializeNonKey1UO1902( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116103361", true, true);
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
      httpContext.AddJavascriptSource("produccion/conproduc.js", "?202682116103361", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      edtCP_ID_Internalname = "CP_ID" ;
      edtCP_EMPRCOD_Internalname = "CP_EMPRCOD" ;
      edtCP_CLICOD_Internalname = "CP_CLICOD" ;
      edtCP_CLINOM_Internalname = "CP_CLINOM" ;
      edtCP_BARCOD_Internalname = "CP_BARCOD" ;
      edtCP_BARCODR_Internalname = "CP_BARCODR" ;
      edtCP_BARCODP_Internalname = "CP_BARCODP" ;
      edtCP_BARFECF_Internalname = "CP_BARFECF" ;
      edtCP_BARNUMC_Internalname = "CP_BARNUMC" ;
      edtCP_BARPLF_Internalname = "CP_BARPLF" ;
      edtCP_BARSIT_Internalname = "CP_BARSIT" ;
      edtCP_BARFECG_Internalname = "CP_BARFECG" ;
      edtCP_BARFECC_Internalname = "CP_BARFECC" ;
      edtCP_BARFECS_Internalname = "CP_BARFECS" ;
      edtCP_BARSER_Internalname = "CP_BARSER" ;
      edtCP_BARSERD_Internalname = "CP_BARSERD" ;
      edtCP_BARNOMC_Internalname = "CP_BARNOMC" ;
      edtCP_BARTIPA_Internalname = "CP_BARTIPA" ;
      edtCP_TARTDSC_Internalname = "CP_TARTDSC" ;
      edtCP_BARGIRA_Internalname = "CP_BARGIRA" ;
      edtCP_BARACAA_Internalname = "CP_BARACAA" ;
      edtCP_BARAGRE_Internalname = "CP_BARAGRE" ;
      edtCP_BAREXT_Internalname = "CP_BAREXT" ;
      edtCP_DISDES_Internalname = "CP_DISDES" ;
      edtCP_DISCOD_Internalname = "CP_DISCOD" ;
      edtCP_BARPROP_Internalname = "CP_BARPROP" ;
      edtCP_BARDISN_Internalname = "CP_BARDISN" ;
      edtCP_BARENCC_Internalname = "CP_BARENCC" ;
      edtCP_BARCOLO_Internalname = "CP_BARCOLO" ;
      edtCP_BARCOLU_Internalname = "CP_BARCOLU" ;
      edtCP_DSC_BAR_Internalname = "CP_DSC_BAR" ;
      edtCP_BARKGM_Internalname = "CP_BARKGM" ;
      edtCP_BARMTR_Internalname = "CP_BARMTR" ;
      edtCP_BARPIE_Internalname = "CP_BARPIE" ;
      edtCP_BARALBK_Internalname = "CP_BARALBK" ;
      edtCP_BARALBM_Internalname = "CP_BARALBM" ;
      edtCP_DISUSRC_Internalname = "CP_DISUSRC" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
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
      Form.setCaption( httpContext.getMessage( "Consulta de Produccion", "") );
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      bttBtntrn_delete_Enabled = 0 ;
      bttBtntrn_delete_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      edtCP_DISUSRC_Jsonclick = "" ;
      edtCP_DISUSRC_Enabled = 1 ;
      edtCP_BARALBM_Jsonclick = "" ;
      edtCP_BARALBM_Enabled = 1 ;
      edtCP_BARALBK_Jsonclick = "" ;
      edtCP_BARALBK_Enabled = 1 ;
      edtCP_BARPIE_Jsonclick = "" ;
      edtCP_BARPIE_Enabled = 1 ;
      edtCP_BARMTR_Jsonclick = "" ;
      edtCP_BARMTR_Enabled = 1 ;
      edtCP_BARKGM_Jsonclick = "" ;
      edtCP_BARKGM_Enabled = 1 ;
      edtCP_DSC_BAR_Jsonclick = "" ;
      edtCP_DSC_BAR_Enabled = 1 ;
      edtCP_BARCOLU_Jsonclick = "" ;
      edtCP_BARCOLU_Enabled = 1 ;
      edtCP_BARCOLO_Jsonclick = "" ;
      edtCP_BARCOLO_Enabled = 1 ;
      edtCP_BARENCC_Jsonclick = "" ;
      edtCP_BARENCC_Enabled = 1 ;
      edtCP_BARDISN_Jsonclick = "" ;
      edtCP_BARDISN_Enabled = 1 ;
      edtCP_BARPROP_Jsonclick = "" ;
      edtCP_BARPROP_Enabled = 1 ;
      edtCP_DISCOD_Jsonclick = "" ;
      edtCP_DISCOD_Enabled = 1 ;
      edtCP_DISDES_Jsonclick = "" ;
      edtCP_DISDES_Enabled = 1 ;
      edtCP_BAREXT_Jsonclick = "" ;
      edtCP_BAREXT_Enabled = 1 ;
      edtCP_BARAGRE_Jsonclick = "" ;
      edtCP_BARAGRE_Enabled = 1 ;
      edtCP_BARACAA_Jsonclick = "" ;
      edtCP_BARACAA_Enabled = 1 ;
      edtCP_BARGIRA_Jsonclick = "" ;
      edtCP_BARGIRA_Enabled = 1 ;
      edtCP_TARTDSC_Jsonclick = "" ;
      edtCP_TARTDSC_Enabled = 1 ;
      edtCP_BARTIPA_Jsonclick = "" ;
      edtCP_BARTIPA_Enabled = 1 ;
      edtCP_BARNOMC_Jsonclick = "" ;
      edtCP_BARNOMC_Enabled = 1 ;
      edtCP_BARSERD_Jsonclick = "" ;
      edtCP_BARSERD_Enabled = 1 ;
      edtCP_BARSER_Jsonclick = "" ;
      edtCP_BARSER_Enabled = 1 ;
      edtCP_BARFECS_Jsonclick = "" ;
      edtCP_BARFECS_Enabled = 1 ;
      edtCP_BARFECC_Jsonclick = "" ;
      edtCP_BARFECC_Enabled = 1 ;
      edtCP_BARFECG_Jsonclick = "" ;
      edtCP_BARFECG_Enabled = 1 ;
      edtCP_BARSIT_Jsonclick = "" ;
      edtCP_BARSIT_Enabled = 1 ;
      edtCP_BARPLF_Jsonclick = "" ;
      edtCP_BARPLF_Enabled = 1 ;
      edtCP_BARNUMC_Jsonclick = "" ;
      edtCP_BARNUMC_Enabled = 1 ;
      edtCP_BARFECF_Jsonclick = "" ;
      edtCP_BARFECF_Enabled = 1 ;
      edtCP_BARCODP_Jsonclick = "" ;
      edtCP_BARCODP_Enabled = 1 ;
      edtCP_BARCODR_Jsonclick = "" ;
      edtCP_BARCODR_Enabled = 1 ;
      edtCP_BARCOD_Jsonclick = "" ;
      edtCP_BARCOD_Enabled = 1 ;
      edtCP_CLINOM_Jsonclick = "" ;
      edtCP_CLINOM_Enabled = 1 ;
      edtCP_CLICOD_Jsonclick = "" ;
      edtCP_CLICOD_Enabled = 1 ;
      edtCP_EMPRCOD_Jsonclick = "" ;
      edtCP_EMPRCOD_Enabled = 1 ;
      edtCP_ID_Jsonclick = "" ;
      edtCP_ID_Enabled = 1 ;
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV10CP_ID',fld:'vCP_ID',pic:'ZZZZZZZZZ9',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV8TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true},{av:'AV10CP_ID',fld:'vCP_ID',pic:'ZZZZZZZZZ9',hsh:true},{av:'A14351CP_BARMAQC',fld:'CP_BARMAQC',pic:''},{av:'A14352CP_BARESTR',fld:'CP_BARESTR',pic:'9'}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e121UO2',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV8TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true}]");
      setEventMetadata("AFTER TRN",",oparms:[]}");
      setEventMetadata("VALID_CP_ID","{handler:'valid_Cp_id',iparms:[]");
      setEventMetadata("VALID_CP_ID",",oparms:[]}");
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
      Z14328CP_EMPRCOD = "" ;
      Z14327CP_CLINOM = "" ;
      Z14303CP_BARCODP = "" ;
      Z14304CP_BARFECF = GXutil.nullDate() ;
      Z14306CP_BARPLF = "" ;
      Z14309CP_BARFECC = GXutil.nullDate() ;
      Z14310CP_BARFECS = GXutil.nullDate() ;
      Z14308CP_BARFECG = GXutil.nullDate() ;
      Z14311CP_BARSER = "" ;
      Z14312CP_BARSERD = "" ;
      Z14331CP_BARCOLO = "" ;
      Z14315CP_BARNOMC = "" ;
      Z14343CP_TARTDSC = "" ;
      Z14317CP_BARGIRA = "" ;
      Z14319CP_BARAGRE = "" ;
      Z14321CP_DISDES = "" ;
      Z14323CP_BARPROP = "" ;
      Z14334CP_DSC_BAR = "" ;
      Z14324CP_BARDISN = "" ;
      Z14336CP_BARKGM = DecimalUtil.ZERO ;
      Z14337CP_BARMTR = DecimalUtil.ZERO ;
      Z14339CP_BARALBK = DecimalUtil.ZERO ;
      Z14340CP_BARALBM = DecimalUtil.ZERO ;
      Z14325CP_BARENCC = "" ;
      Z14341CP_DISUSRC = "" ;
      Z14351CP_BARMAQC = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
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
      A14328CP_EMPRCOD = "" ;
      A14327CP_CLINOM = "" ;
      A14303CP_BARCODP = "" ;
      A14304CP_BARFECF = GXutil.nullDate() ;
      A14306CP_BARPLF = "" ;
      A14308CP_BARFECG = GXutil.nullDate() ;
      A14309CP_BARFECC = GXutil.nullDate() ;
      A14310CP_BARFECS = GXutil.nullDate() ;
      A14311CP_BARSER = "" ;
      A14312CP_BARSERD = "" ;
      A14315CP_BARNOMC = "" ;
      A14343CP_TARTDSC = "" ;
      A14317CP_BARGIRA = "" ;
      A14319CP_BARAGRE = "" ;
      A14321CP_DISDES = "" ;
      A14323CP_BARPROP = "" ;
      A14324CP_BARDISN = "" ;
      A14325CP_BARENCC = "" ;
      A14331CP_BARCOLO = "" ;
      A14334CP_DSC_BAR = "" ;
      A14336CP_BARKGM = DecimalUtil.ZERO ;
      A14337CP_BARMTR = DecimalUtil.ZERO ;
      A14339CP_BARALBK = DecimalUtil.ZERO ;
      A14340CP_BARALBM = DecimalUtil.ZERO ;
      A14341CP_DISUSRC = "" ;
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      AV15Pgmname = "" ;
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      A14351CP_BARMAQC = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      Datamonjs_Objectcall = "" ;
      Datamonjs_Class = "" ;
      Datamonjs_Paramstr = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode1902 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      AV11Station = "" ;
      GXt_char1 = "" ;
      AV12EmprCod = "" ;
      GXv_char2 = new String[1] ;
      AV13EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV14UsurCod = "" ;
      GXv_char4 = new String[1] ;
      AV7WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext5 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV8TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV9WebSession = httpContext.getWebSession();
      T01UO4_A14297CP_ID = new long[1] ;
      T01UO4_A14328CP_EMPRCOD = new String[] {""} ;
      T01UO4_A14326CP_CLICOD = new int[1] ;
      T01UO4_A14327CP_CLINOM = new String[] {""} ;
      T01UO4_A14301CP_BARCOD = new int[1] ;
      T01UO4_A14302CP_BARCODR = new byte[1] ;
      T01UO4_A14303CP_BARCODP = new String[] {""} ;
      T01UO4_A14304CP_BARFECF = new java.util.Date[] {GXutil.nullDate()} ;
      T01UO4_A14305CP_BARNUMC = new int[1] ;
      T01UO4_A14306CP_BARPLF = new String[] {""} ;
      T01UO4_A14307CP_BARSIT = new byte[1] ;
      T01UO4_A14309CP_BARFECC = new java.util.Date[] {GXutil.nullDate()} ;
      T01UO4_A14310CP_BARFECS = new java.util.Date[] {GXutil.nullDate()} ;
      T01UO4_A14308CP_BARFECG = new java.util.Date[] {GXutil.nullDate()} ;
      T01UO4_A14311CP_BARSER = new String[] {""} ;
      T01UO4_A14312CP_BARSERD = new String[] {""} ;
      T01UO4_A14331CP_BARCOLO = new String[] {""} ;
      T01UO4_A14332CP_BARCOLU = new int[1] ;
      T01UO4_A14315CP_BARNOMC = new String[] {""} ;
      T01UO4_A14316CP_BARTIPA = new short[1] ;
      T01UO4_A14343CP_TARTDSC = new String[] {""} ;
      T01UO4_A14317CP_BARGIRA = new String[] {""} ;
      T01UO4_A14318CP_BARACAA = new short[1] ;
      T01UO4_A14319CP_BARAGRE = new String[] {""} ;
      T01UO4_A14320CP_BAREXT = new byte[1] ;
      T01UO4_A14321CP_DISDES = new String[] {""} ;
      T01UO4_A14322CP_DISCOD = new int[1] ;
      T01UO4_A14323CP_BARPROP = new String[] {""} ;
      T01UO4_A14334CP_DSC_BAR = new String[] {""} ;
      T01UO4_A14324CP_BARDISN = new String[] {""} ;
      T01UO4_A14336CP_BARKGM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01UO4_A14337CP_BARMTR = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01UO4_A14338CP_BARPIE = new int[1] ;
      T01UO4_A14339CP_BARALBK = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01UO4_A14340CP_BARALBM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01UO4_A14325CP_BARENCC = new String[] {""} ;
      T01UO4_A14341CP_DISUSRC = new String[] {""} ;
      T01UO4_A14351CP_BARMAQC = new String[] {""} ;
      T01UO4_A14352CP_BARESTR = new byte[1] ;
      T01UO5_A14297CP_ID = new long[1] ;
      T01UO3_A14297CP_ID = new long[1] ;
      T01UO3_A14328CP_EMPRCOD = new String[] {""} ;
      T01UO3_A14326CP_CLICOD = new int[1] ;
      T01UO3_A14327CP_CLINOM = new String[] {""} ;
      T01UO3_A14301CP_BARCOD = new int[1] ;
      T01UO3_A14302CP_BARCODR = new byte[1] ;
      T01UO3_A14303CP_BARCODP = new String[] {""} ;
      T01UO3_A14304CP_BARFECF = new java.util.Date[] {GXutil.nullDate()} ;
      T01UO3_A14305CP_BARNUMC = new int[1] ;
      T01UO3_A14306CP_BARPLF = new String[] {""} ;
      T01UO3_A14307CP_BARSIT = new byte[1] ;
      T01UO3_A14309CP_BARFECC = new java.util.Date[] {GXutil.nullDate()} ;
      T01UO3_A14310CP_BARFECS = new java.util.Date[] {GXutil.nullDate()} ;
      T01UO3_A14308CP_BARFECG = new java.util.Date[] {GXutil.nullDate()} ;
      T01UO3_A14311CP_BARSER = new String[] {""} ;
      T01UO3_A14312CP_BARSERD = new String[] {""} ;
      T01UO3_A14331CP_BARCOLO = new String[] {""} ;
      T01UO3_A14332CP_BARCOLU = new int[1] ;
      T01UO3_A14315CP_BARNOMC = new String[] {""} ;
      T01UO3_A14316CP_BARTIPA = new short[1] ;
      T01UO3_A14343CP_TARTDSC = new String[] {""} ;
      T01UO3_A14317CP_BARGIRA = new String[] {""} ;
      T01UO3_A14318CP_BARACAA = new short[1] ;
      T01UO3_A14319CP_BARAGRE = new String[] {""} ;
      T01UO3_A14320CP_BAREXT = new byte[1] ;
      T01UO3_A14321CP_DISDES = new String[] {""} ;
      T01UO3_A14322CP_DISCOD = new int[1] ;
      T01UO3_A14323CP_BARPROP = new String[] {""} ;
      T01UO3_A14334CP_DSC_BAR = new String[] {""} ;
      T01UO3_A14324CP_BARDISN = new String[] {""} ;
      T01UO3_A14336CP_BARKGM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01UO3_A14337CP_BARMTR = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01UO3_A14338CP_BARPIE = new int[1] ;
      T01UO3_A14339CP_BARALBK = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01UO3_A14340CP_BARALBM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01UO3_A14325CP_BARENCC = new String[] {""} ;
      T01UO3_A14341CP_DISUSRC = new String[] {""} ;
      T01UO3_A14351CP_BARMAQC = new String[] {""} ;
      T01UO3_A14352CP_BARESTR = new byte[1] ;
      T01UO6_A14297CP_ID = new long[1] ;
      T01UO7_A14297CP_ID = new long[1] ;
      T01UO2_A14297CP_ID = new long[1] ;
      T01UO2_A14328CP_EMPRCOD = new String[] {""} ;
      T01UO2_A14326CP_CLICOD = new int[1] ;
      T01UO2_A14327CP_CLINOM = new String[] {""} ;
      T01UO2_A14301CP_BARCOD = new int[1] ;
      T01UO2_A14302CP_BARCODR = new byte[1] ;
      T01UO2_A14303CP_BARCODP = new String[] {""} ;
      T01UO2_A14304CP_BARFECF = new java.util.Date[] {GXutil.nullDate()} ;
      T01UO2_A14305CP_BARNUMC = new int[1] ;
      T01UO2_A14306CP_BARPLF = new String[] {""} ;
      T01UO2_A14307CP_BARSIT = new byte[1] ;
      T01UO2_A14309CP_BARFECC = new java.util.Date[] {GXutil.nullDate()} ;
      T01UO2_A14310CP_BARFECS = new java.util.Date[] {GXutil.nullDate()} ;
      T01UO2_A14308CP_BARFECG = new java.util.Date[] {GXutil.nullDate()} ;
      T01UO2_A14311CP_BARSER = new String[] {""} ;
      T01UO2_A14312CP_BARSERD = new String[] {""} ;
      T01UO2_A14331CP_BARCOLO = new String[] {""} ;
      T01UO2_A14332CP_BARCOLU = new int[1] ;
      T01UO2_A14315CP_BARNOMC = new String[] {""} ;
      T01UO2_A14316CP_BARTIPA = new short[1] ;
      T01UO2_A14343CP_TARTDSC = new String[] {""} ;
      T01UO2_A14317CP_BARGIRA = new String[] {""} ;
      T01UO2_A14318CP_BARACAA = new short[1] ;
      T01UO2_A14319CP_BARAGRE = new String[] {""} ;
      T01UO2_A14320CP_BAREXT = new byte[1] ;
      T01UO2_A14321CP_DISDES = new String[] {""} ;
      T01UO2_A14322CP_DISCOD = new int[1] ;
      T01UO2_A14323CP_BARPROP = new String[] {""} ;
      T01UO2_A14334CP_DSC_BAR = new String[] {""} ;
      T01UO2_A14324CP_BARDISN = new String[] {""} ;
      T01UO2_A14336CP_BARKGM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01UO2_A14337CP_BARMTR = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01UO2_A14338CP_BARPIE = new int[1] ;
      T01UO2_A14339CP_BARALBK = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01UO2_A14340CP_BARALBM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01UO2_A14325CP_BARENCC = new String[] {""} ;
      T01UO2_A14341CP_DISUSRC = new String[] {""} ;
      T01UO2_A14351CP_BARMAQC = new String[] {""} ;
      T01UO2_A14352CP_BARESTR = new byte[1] ;
      T01UO11_A14297CP_ID = new long[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.produccion.conproduc__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.produccion.conproduc__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.produccion.conproduc__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.produccion.conproduc__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.produccion.conproduc__default(),
         new Object[] {
             new Object[] {
            T01UO2_A14297CP_ID, T01UO2_A14328CP_EMPRCOD, T01UO2_A14326CP_CLICOD, T01UO2_A14327CP_CLINOM, T01UO2_A14301CP_BARCOD, T01UO2_A14302CP_BARCODR, T01UO2_A14303CP_BARCODP, T01UO2_A14304CP_BARFECF, T01UO2_A14305CP_BARNUMC, T01UO2_A14306CP_BARPLF,
            T01UO2_A14307CP_BARSIT, T01UO2_A14309CP_BARFECC, T01UO2_A14310CP_BARFECS, T01UO2_A14308CP_BARFECG, T01UO2_A14311CP_BARSER, T01UO2_A14312CP_BARSERD, T01UO2_A14331CP_BARCOLO, T01UO2_A14332CP_BARCOLU, T01UO2_A14315CP_BARNOMC, T01UO2_A14316CP_BARTIPA,
            T01UO2_A14343CP_TARTDSC, T01UO2_A14317CP_BARGIRA, T01UO2_A14318CP_BARACAA, T01UO2_A14319CP_BARAGRE, T01UO2_A14320CP_BAREXT, T01UO2_A14321CP_DISDES, T01UO2_A14322CP_DISCOD, T01UO2_A14323CP_BARPROP, T01UO2_A14334CP_DSC_BAR, T01UO2_A14324CP_BARDISN,
            T01UO2_A14336CP_BARKGM, T01UO2_A14337CP_BARMTR, T01UO2_A14338CP_BARPIE, T01UO2_A14339CP_BARALBK, T01UO2_A14340CP_BARALBM, T01UO2_A14325CP_BARENCC, T01UO2_A14341CP_DISUSRC, T01UO2_A14351CP_BARMAQC, T01UO2_A14352CP_BARESTR
            }
            , new Object[] {
            T01UO3_A14297CP_ID, T01UO3_A14328CP_EMPRCOD, T01UO3_A14326CP_CLICOD, T01UO3_A14327CP_CLINOM, T01UO3_A14301CP_BARCOD, T01UO3_A14302CP_BARCODR, T01UO3_A14303CP_BARCODP, T01UO3_A14304CP_BARFECF, T01UO3_A14305CP_BARNUMC, T01UO3_A14306CP_BARPLF,
            T01UO3_A14307CP_BARSIT, T01UO3_A14309CP_BARFECC, T01UO3_A14310CP_BARFECS, T01UO3_A14308CP_BARFECG, T01UO3_A14311CP_BARSER, T01UO3_A14312CP_BARSERD, T01UO3_A14331CP_BARCOLO, T01UO3_A14332CP_BARCOLU, T01UO3_A14315CP_BARNOMC, T01UO3_A14316CP_BARTIPA,
            T01UO3_A14343CP_TARTDSC, T01UO3_A14317CP_BARGIRA, T01UO3_A14318CP_BARACAA, T01UO3_A14319CP_BARAGRE, T01UO3_A14320CP_BAREXT, T01UO3_A14321CP_DISDES, T01UO3_A14322CP_DISCOD, T01UO3_A14323CP_BARPROP, T01UO3_A14334CP_DSC_BAR, T01UO3_A14324CP_BARDISN,
            T01UO3_A14336CP_BARKGM, T01UO3_A14337CP_BARMTR, T01UO3_A14338CP_BARPIE, T01UO3_A14339CP_BARALBK, T01UO3_A14340CP_BARALBM, T01UO3_A14325CP_BARENCC, T01UO3_A14341CP_DISUSRC, T01UO3_A14351CP_BARMAQC, T01UO3_A14352CP_BARESTR
            }
            , new Object[] {
            T01UO4_A14297CP_ID, T01UO4_A14328CP_EMPRCOD, T01UO4_A14326CP_CLICOD, T01UO4_A14327CP_CLINOM, T01UO4_A14301CP_BARCOD, T01UO4_A14302CP_BARCODR, T01UO4_A14303CP_BARCODP, T01UO4_A14304CP_BARFECF, T01UO4_A14305CP_BARNUMC, T01UO4_A14306CP_BARPLF,
            T01UO4_A14307CP_BARSIT, T01UO4_A14309CP_BARFECC, T01UO4_A14310CP_BARFECS, T01UO4_A14308CP_BARFECG, T01UO4_A14311CP_BARSER, T01UO4_A14312CP_BARSERD, T01UO4_A14331CP_BARCOLO, T01UO4_A14332CP_BARCOLU, T01UO4_A14315CP_BARNOMC, T01UO4_A14316CP_BARTIPA,
            T01UO4_A14343CP_TARTDSC, T01UO4_A14317CP_BARGIRA, T01UO4_A14318CP_BARACAA, T01UO4_A14319CP_BARAGRE, T01UO4_A14320CP_BAREXT, T01UO4_A14321CP_DISDES, T01UO4_A14322CP_DISCOD, T01UO4_A14323CP_BARPROP, T01UO4_A14334CP_DSC_BAR, T01UO4_A14324CP_BARDISN,
            T01UO4_A14336CP_BARKGM, T01UO4_A14337CP_BARMTR, T01UO4_A14338CP_BARPIE, T01UO4_A14339CP_BARALBK, T01UO4_A14340CP_BARALBM, T01UO4_A14325CP_BARENCC, T01UO4_A14341CP_DISUSRC, T01UO4_A14351CP_BARMAQC, T01UO4_A14352CP_BARESTR
            }
            , new Object[] {
            T01UO5_A14297CP_ID
            }
            , new Object[] {
            T01UO6_A14297CP_ID
            }
            , new Object[] {
            T01UO7_A14297CP_ID
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01UO11_A14297CP_ID
            }
         }
      );
      AV15Pgmname = "Produccion.CONPRODUC" ;
   }

   private byte Z14302CP_BARCODR ;
   private byte Z14307CP_BARSIT ;
   private byte Z14320CP_BAREXT ;
   private byte Z14352CP_BARESTR ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A14302CP_BARCODR ;
   private byte A14307CP_BARSIT ;
   private byte A14320CP_BAREXT ;
   private byte A14352CP_BARESTR ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private short Z14316CP_BARTIPA ;
   private short Z14318CP_BARACAA ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A14316CP_BARTIPA ;
   private short A14318CP_BARACAA ;
   private short RcdFound1902 ;
   private short nIsDirty_1902 ;
   private int Z14326CP_CLICOD ;
   private int Z14301CP_BARCOD ;
   private int Z14305CP_BARNUMC ;
   private int Z14332CP_BARCOLU ;
   private int Z14322CP_DISCOD ;
   private int Z14338CP_BARPIE ;
   private int trnEnded ;
   private int edtCP_ID_Enabled ;
   private int edtCP_EMPRCOD_Enabled ;
   private int A14326CP_CLICOD ;
   private int edtCP_CLICOD_Enabled ;
   private int edtCP_CLINOM_Enabled ;
   private int A14301CP_BARCOD ;
   private int edtCP_BARCOD_Enabled ;
   private int edtCP_BARCODR_Enabled ;
   private int edtCP_BARCODP_Enabled ;
   private int edtCP_BARFECF_Enabled ;
   private int A14305CP_BARNUMC ;
   private int edtCP_BARNUMC_Enabled ;
   private int edtCP_BARPLF_Enabled ;
   private int edtCP_BARSIT_Enabled ;
   private int edtCP_BARFECG_Enabled ;
   private int edtCP_BARFECC_Enabled ;
   private int edtCP_BARFECS_Enabled ;
   private int edtCP_BARSER_Enabled ;
   private int edtCP_BARSERD_Enabled ;
   private int edtCP_BARNOMC_Enabled ;
   private int edtCP_BARTIPA_Enabled ;
   private int edtCP_TARTDSC_Enabled ;
   private int edtCP_BARGIRA_Enabled ;
   private int edtCP_BARACAA_Enabled ;
   private int edtCP_BARAGRE_Enabled ;
   private int edtCP_BAREXT_Enabled ;
   private int edtCP_DISDES_Enabled ;
   private int A14322CP_DISCOD ;
   private int edtCP_DISCOD_Enabled ;
   private int edtCP_BARPROP_Enabled ;
   private int edtCP_BARDISN_Enabled ;
   private int edtCP_BARENCC_Enabled ;
   private int edtCP_BARCOLO_Enabled ;
   private int A14332CP_BARCOLU ;
   private int edtCP_BARCOLU_Enabled ;
   private int edtCP_DSC_BAR_Enabled ;
   private int edtCP_BARKGM_Enabled ;
   private int edtCP_BARMTR_Enabled ;
   private int A14338CP_BARPIE ;
   private int edtCP_BARPIE_Enabled ;
   private int edtCP_BARALBK_Enabled ;
   private int edtCP_BARALBM_Enabled ;
   private int edtCP_DISUSRC_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int edtavPgmname_Enabled ;
   private int Datamonjs_Gxcontroltype ;
   private int GX_JID ;
   private int idxLst ;
   private long wcpOAV10CP_ID ;
   private long Z14297CP_ID ;
   private long AV10CP_ID ;
   private long A14297CP_ID ;
   private java.math.BigDecimal Z14336CP_BARKGM ;
   private java.math.BigDecimal Z14337CP_BARMTR ;
   private java.math.BigDecimal Z14339CP_BARALBK ;
   private java.math.BigDecimal Z14340CP_BARALBM ;
   private java.math.BigDecimal A14336CP_BARKGM ;
   private java.math.BigDecimal A14337CP_BARMTR ;
   private java.math.BigDecimal A14339CP_BARALBK ;
   private java.math.BigDecimal A14340CP_BARALBM ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String Z14328CP_EMPRCOD ;
   private String Z14303CP_BARCODP ;
   private String Z14306CP_BARPLF ;
   private String Z14311CP_BARSER ;
   private String Z14331CP_BARCOLO ;
   private String Z14319CP_BARAGRE ;
   private String Z14321CP_DISDES ;
   private String Z14323CP_BARPROP ;
   private String Z14324CP_BARDISN ;
   private String Z14325CP_BARENCC ;
   private String Z14341CP_DISUSRC ;
   private String Z14351CP_BARMAQC ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String Gx_mode ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtCP_ID_Internalname ;
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
   private String edtCP_ID_Jsonclick ;
   private String edtCP_EMPRCOD_Internalname ;
   private String A14328CP_EMPRCOD ;
   private String edtCP_EMPRCOD_Jsonclick ;
   private String edtCP_CLICOD_Internalname ;
   private String edtCP_CLICOD_Jsonclick ;
   private String edtCP_CLINOM_Internalname ;
   private String edtCP_CLINOM_Jsonclick ;
   private String edtCP_BARCOD_Internalname ;
   private String edtCP_BARCOD_Jsonclick ;
   private String edtCP_BARCODR_Internalname ;
   private String edtCP_BARCODR_Jsonclick ;
   private String edtCP_BARCODP_Internalname ;
   private String A14303CP_BARCODP ;
   private String edtCP_BARCODP_Jsonclick ;
   private String edtCP_BARFECF_Internalname ;
   private String edtCP_BARFECF_Jsonclick ;
   private String edtCP_BARNUMC_Internalname ;
   private String edtCP_BARNUMC_Jsonclick ;
   private String edtCP_BARPLF_Internalname ;
   private String A14306CP_BARPLF ;
   private String edtCP_BARPLF_Jsonclick ;
   private String edtCP_BARSIT_Internalname ;
   private String edtCP_BARSIT_Jsonclick ;
   private String edtCP_BARFECG_Internalname ;
   private String edtCP_BARFECG_Jsonclick ;
   private String edtCP_BARFECC_Internalname ;
   private String edtCP_BARFECC_Jsonclick ;
   private String edtCP_BARFECS_Internalname ;
   private String edtCP_BARFECS_Jsonclick ;
   private String edtCP_BARSER_Internalname ;
   private String A14311CP_BARSER ;
   private String edtCP_BARSER_Jsonclick ;
   private String edtCP_BARSERD_Internalname ;
   private String edtCP_BARSERD_Jsonclick ;
   private String edtCP_BARNOMC_Internalname ;
   private String edtCP_BARNOMC_Jsonclick ;
   private String edtCP_BARTIPA_Internalname ;
   private String edtCP_BARTIPA_Jsonclick ;
   private String edtCP_TARTDSC_Internalname ;
   private String edtCP_TARTDSC_Jsonclick ;
   private String edtCP_BARGIRA_Internalname ;
   private String edtCP_BARGIRA_Jsonclick ;
   private String edtCP_BARACAA_Internalname ;
   private String edtCP_BARACAA_Jsonclick ;
   private String edtCP_BARAGRE_Internalname ;
   private String A14319CP_BARAGRE ;
   private String edtCP_BARAGRE_Jsonclick ;
   private String edtCP_BAREXT_Internalname ;
   private String edtCP_BAREXT_Jsonclick ;
   private String edtCP_DISDES_Internalname ;
   private String A14321CP_DISDES ;
   private String edtCP_DISDES_Jsonclick ;
   private String edtCP_DISCOD_Internalname ;
   private String edtCP_DISCOD_Jsonclick ;
   private String edtCP_BARPROP_Internalname ;
   private String A14323CP_BARPROP ;
   private String edtCP_BARPROP_Jsonclick ;
   private String edtCP_BARDISN_Internalname ;
   private String A14324CP_BARDISN ;
   private String edtCP_BARDISN_Jsonclick ;
   private String edtCP_BARENCC_Internalname ;
   private String A14325CP_BARENCC ;
   private String edtCP_BARENCC_Jsonclick ;
   private String edtCP_BARCOLO_Internalname ;
   private String A14331CP_BARCOLO ;
   private String edtCP_BARCOLO_Jsonclick ;
   private String edtCP_BARCOLU_Internalname ;
   private String edtCP_BARCOLU_Jsonclick ;
   private String edtCP_DSC_BAR_Internalname ;
   private String edtCP_DSC_BAR_Jsonclick ;
   private String edtCP_BARKGM_Internalname ;
   private String edtCP_BARKGM_Jsonclick ;
   private String edtCP_BARMTR_Internalname ;
   private String edtCP_BARMTR_Jsonclick ;
   private String edtCP_BARPIE_Internalname ;
   private String edtCP_BARPIE_Jsonclick ;
   private String edtCP_BARALBK_Internalname ;
   private String edtCP_BARALBK_Jsonclick ;
   private String edtCP_BARALBM_Internalname ;
   private String edtCP_BARALBM_Jsonclick ;
   private String edtCP_DISUSRC_Internalname ;
   private String A14341CP_DISUSRC ;
   private String edtCP_DISUSRC_Jsonclick ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String edtavPgmname_Internalname ;
   private String AV15Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String A14351CP_BARMAQC ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String Datamonjs_Objectcall ;
   private String Datamonjs_Class ;
   private String Datamonjs_Paramstr ;
   private String hsh ;
   private String sMode1902 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String AV11Station ;
   private String GXt_char1 ;
   private String AV12EmprCod ;
   private String GXv_char2[] ;
   private String AV13EmprNom ;
   private String GXv_char3[] ;
   private String AV14UsurCod ;
   private String GXv_char4[] ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private java.util.Date Z14304CP_BARFECF ;
   private java.util.Date Z14309CP_BARFECC ;
   private java.util.Date Z14310CP_BARFECS ;
   private java.util.Date Z14308CP_BARFECG ;
   private java.util.Date A14304CP_BARFECF ;
   private java.util.Date A14308CP_BARFECG ;
   private java.util.Date A14309CP_BARFECC ;
   private java.util.Date A14310CP_BARFECS ;
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
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private String Z14327CP_CLINOM ;
   private String Z14312CP_BARSERD ;
   private String Z14315CP_BARNOMC ;
   private String Z14343CP_TARTDSC ;
   private String Z14317CP_BARGIRA ;
   private String Z14334CP_DSC_BAR ;
   private String A14327CP_CLINOM ;
   private String A14312CP_BARSERD ;
   private String A14315CP_BARNOMC ;
   private String A14343CP_TARTDSC ;
   private String A14317CP_BARGIRA ;
   private String A14334CP_DSC_BAR ;
   private com.genexus.webpanels.WebSession AV9WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private long[] T01UO4_A14297CP_ID ;
   private String[] T01UO4_A14328CP_EMPRCOD ;
   private int[] T01UO4_A14326CP_CLICOD ;
   private String[] T01UO4_A14327CP_CLINOM ;
   private int[] T01UO4_A14301CP_BARCOD ;
   private byte[] T01UO4_A14302CP_BARCODR ;
   private String[] T01UO4_A14303CP_BARCODP ;
   private java.util.Date[] T01UO4_A14304CP_BARFECF ;
   private int[] T01UO4_A14305CP_BARNUMC ;
   private String[] T01UO4_A14306CP_BARPLF ;
   private byte[] T01UO4_A14307CP_BARSIT ;
   private java.util.Date[] T01UO4_A14309CP_BARFECC ;
   private java.util.Date[] T01UO4_A14310CP_BARFECS ;
   private java.util.Date[] T01UO4_A14308CP_BARFECG ;
   private String[] T01UO4_A14311CP_BARSER ;
   private String[] T01UO4_A14312CP_BARSERD ;
   private String[] T01UO4_A14331CP_BARCOLO ;
   private int[] T01UO4_A14332CP_BARCOLU ;
   private String[] T01UO4_A14315CP_BARNOMC ;
   private short[] T01UO4_A14316CP_BARTIPA ;
   private String[] T01UO4_A14343CP_TARTDSC ;
   private String[] T01UO4_A14317CP_BARGIRA ;
   private short[] T01UO4_A14318CP_BARACAA ;
   private String[] T01UO4_A14319CP_BARAGRE ;
   private byte[] T01UO4_A14320CP_BAREXT ;
   private String[] T01UO4_A14321CP_DISDES ;
   private int[] T01UO4_A14322CP_DISCOD ;
   private String[] T01UO4_A14323CP_BARPROP ;
   private String[] T01UO4_A14334CP_DSC_BAR ;
   private String[] T01UO4_A14324CP_BARDISN ;
   private java.math.BigDecimal[] T01UO4_A14336CP_BARKGM ;
   private java.math.BigDecimal[] T01UO4_A14337CP_BARMTR ;
   private int[] T01UO4_A14338CP_BARPIE ;
   private java.math.BigDecimal[] T01UO4_A14339CP_BARALBK ;
   private java.math.BigDecimal[] T01UO4_A14340CP_BARALBM ;
   private String[] T01UO4_A14325CP_BARENCC ;
   private String[] T01UO4_A14341CP_DISUSRC ;
   private String[] T01UO4_A14351CP_BARMAQC ;
   private byte[] T01UO4_A14352CP_BARESTR ;
   private long[] T01UO5_A14297CP_ID ;
   private long[] T01UO3_A14297CP_ID ;
   private String[] T01UO3_A14328CP_EMPRCOD ;
   private int[] T01UO3_A14326CP_CLICOD ;
   private String[] T01UO3_A14327CP_CLINOM ;
   private int[] T01UO3_A14301CP_BARCOD ;
   private byte[] T01UO3_A14302CP_BARCODR ;
   private String[] T01UO3_A14303CP_BARCODP ;
   private java.util.Date[] T01UO3_A14304CP_BARFECF ;
   private int[] T01UO3_A14305CP_BARNUMC ;
   private String[] T01UO3_A14306CP_BARPLF ;
   private byte[] T01UO3_A14307CP_BARSIT ;
   private java.util.Date[] T01UO3_A14309CP_BARFECC ;
   private java.util.Date[] T01UO3_A14310CP_BARFECS ;
   private java.util.Date[] T01UO3_A14308CP_BARFECG ;
   private String[] T01UO3_A14311CP_BARSER ;
   private String[] T01UO3_A14312CP_BARSERD ;
   private String[] T01UO3_A14331CP_BARCOLO ;
   private int[] T01UO3_A14332CP_BARCOLU ;
   private String[] T01UO3_A14315CP_BARNOMC ;
   private short[] T01UO3_A14316CP_BARTIPA ;
   private String[] T01UO3_A14343CP_TARTDSC ;
   private String[] T01UO3_A14317CP_BARGIRA ;
   private short[] T01UO3_A14318CP_BARACAA ;
   private String[] T01UO3_A14319CP_BARAGRE ;
   private byte[] T01UO3_A14320CP_BAREXT ;
   private String[] T01UO3_A14321CP_DISDES ;
   private int[] T01UO3_A14322CP_DISCOD ;
   private String[] T01UO3_A14323CP_BARPROP ;
   private String[] T01UO3_A14334CP_DSC_BAR ;
   private String[] T01UO3_A14324CP_BARDISN ;
   private java.math.BigDecimal[] T01UO3_A14336CP_BARKGM ;
   private java.math.BigDecimal[] T01UO3_A14337CP_BARMTR ;
   private int[] T01UO3_A14338CP_BARPIE ;
   private java.math.BigDecimal[] T01UO3_A14339CP_BARALBK ;
   private java.math.BigDecimal[] T01UO3_A14340CP_BARALBM ;
   private String[] T01UO3_A14325CP_BARENCC ;
   private String[] T01UO3_A14341CP_DISUSRC ;
   private String[] T01UO3_A14351CP_BARMAQC ;
   private byte[] T01UO3_A14352CP_BARESTR ;
   private long[] T01UO6_A14297CP_ID ;
   private long[] T01UO7_A14297CP_ID ;
   private long[] T01UO2_A14297CP_ID ;
   private String[] T01UO2_A14328CP_EMPRCOD ;
   private int[] T01UO2_A14326CP_CLICOD ;
   private String[] T01UO2_A14327CP_CLINOM ;
   private int[] T01UO2_A14301CP_BARCOD ;
   private byte[] T01UO2_A14302CP_BARCODR ;
   private String[] T01UO2_A14303CP_BARCODP ;
   private java.util.Date[] T01UO2_A14304CP_BARFECF ;
   private int[] T01UO2_A14305CP_BARNUMC ;
   private String[] T01UO2_A14306CP_BARPLF ;
   private byte[] T01UO2_A14307CP_BARSIT ;
   private java.util.Date[] T01UO2_A14309CP_BARFECC ;
   private java.util.Date[] T01UO2_A14310CP_BARFECS ;
   private java.util.Date[] T01UO2_A14308CP_BARFECG ;
   private String[] T01UO2_A14311CP_BARSER ;
   private String[] T01UO2_A14312CP_BARSERD ;
   private String[] T01UO2_A14331CP_BARCOLO ;
   private int[] T01UO2_A14332CP_BARCOLU ;
   private String[] T01UO2_A14315CP_BARNOMC ;
   private short[] T01UO2_A14316CP_BARTIPA ;
   private String[] T01UO2_A14343CP_TARTDSC ;
   private String[] T01UO2_A14317CP_BARGIRA ;
   private short[] T01UO2_A14318CP_BARACAA ;
   private String[] T01UO2_A14319CP_BARAGRE ;
   private byte[] T01UO2_A14320CP_BAREXT ;
   private String[] T01UO2_A14321CP_DISDES ;
   private int[] T01UO2_A14322CP_DISCOD ;
   private String[] T01UO2_A14323CP_BARPROP ;
   private String[] T01UO2_A14334CP_DSC_BAR ;
   private String[] T01UO2_A14324CP_BARDISN ;
   private java.math.BigDecimal[] T01UO2_A14336CP_BARKGM ;
   private java.math.BigDecimal[] T01UO2_A14337CP_BARMTR ;
   private int[] T01UO2_A14338CP_BARPIE ;
   private java.math.BigDecimal[] T01UO2_A14339CP_BARALBK ;
   private java.math.BigDecimal[] T01UO2_A14340CP_BARALBM ;
   private String[] T01UO2_A14325CP_BARENCC ;
   private String[] T01UO2_A14341CP_DISUSRC ;
   private String[] T01UO2_A14351CP_BARMAQC ;
   private byte[] T01UO2_A14352CP_BARESTR ;
   private long[] T01UO11_A14297CP_ID ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private app.wwpbaseobjects.SdtWWPContext AV7WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext5[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV8TrnContext ;
}

final  class conproduc__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class conproduc__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class conproduc__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class conproduc__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class conproduc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01UO2", "SELECT CP_ID, CP_EMPRCOD, CP_CLICOD, CP_CLINOM, CP_BARCOD, CP_BARCODR, CP_BARCODP, CP_BARFECF, CP_BARNUMC, CP_BARPLF, CP_BARSIT, CP_BARFECC, CP_BARFECS, CP_BARFECG, CP_BARSER, CP_BARSERD, CP_BARCOLO, CP_BARCOLU, CP_BARNOMC, CP_BARTIPA, CP_TARTDSC, CP_BARGIRA, CP_BARACAA, CP_BARAGRE, CP_BAREXT, CP_DISDES, CP_DISCOD, CP_BARPROP, CP_DSC_BAR, CP_BARDISN, CP_BARKGM, CP_BARMTR, CP_BARPIE, CP_BARALBK, CP_BARALBM, CP_BARENCC, CP_DISUSRC, CP_BARMAQC, CP_BARESTR FROM TXPCONPRO WHERE CP_ID = ?  FOR UPDATE OF CP_EMPRCOD, CP_CLICOD, CP_CLINOM, CP_BARCOD, CP_BARCODR, CP_BARCODP, CP_BARFECF, CP_BARNUMC, CP_BARPLF, CP_BARSIT, CP_BARFECC, CP_BARFECS, CP_BARFECG, CP_BARSER, CP_BARSERD, CP_BARCOLO, CP_BARCOLU, CP_BARNOMC, CP_BARTIPA, CP_TARTDSC, CP_BARGIRA, CP_BARACAA, CP_BARAGRE, CP_BAREXT, CP_DISDES, CP_DISCOD, CP_BARPROP, CP_DSC_BAR, CP_BARDISN, CP_BARKGM, CP_BARMTR, CP_BARPIE, CP_BARALBK, CP_BARALBM, CP_BARENCC, CP_DISUSRC, CP_BARMAQC, CP_BARESTR NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UO3", "SELECT CP_ID, CP_EMPRCOD, CP_CLICOD, CP_CLINOM, CP_BARCOD, CP_BARCODR, CP_BARCODP, CP_BARFECF, CP_BARNUMC, CP_BARPLF, CP_BARSIT, CP_BARFECC, CP_BARFECS, CP_BARFECG, CP_BARSER, CP_BARSERD, CP_BARCOLO, CP_BARCOLU, CP_BARNOMC, CP_BARTIPA, CP_TARTDSC, CP_BARGIRA, CP_BARACAA, CP_BARAGRE, CP_BAREXT, CP_DISDES, CP_DISCOD, CP_BARPROP, CP_DSC_BAR, CP_BARDISN, CP_BARKGM, CP_BARMTR, CP_BARPIE, CP_BARALBK, CP_BARALBM, CP_BARENCC, CP_DISUSRC, CP_BARMAQC, CP_BARESTR FROM TXPCONPRO WHERE CP_ID = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UO4", "SELECT /*+ FIRST_ROWS(100) */ TM1.CP_ID, TM1.CP_EMPRCOD, TM1.CP_CLICOD, TM1.CP_CLINOM, TM1.CP_BARCOD, TM1.CP_BARCODR, TM1.CP_BARCODP, TM1.CP_BARFECF, TM1.CP_BARNUMC, TM1.CP_BARPLF, TM1.CP_BARSIT, TM1.CP_BARFECC, TM1.CP_BARFECS, TM1.CP_BARFECG, TM1.CP_BARSER, TM1.CP_BARSERD, TM1.CP_BARCOLO, TM1.CP_BARCOLU, TM1.CP_BARNOMC, TM1.CP_BARTIPA, TM1.CP_TARTDSC, TM1.CP_BARGIRA, TM1.CP_BARACAA, TM1.CP_BARAGRE, TM1.CP_BAREXT, TM1.CP_DISDES, TM1.CP_DISCOD, TM1.CP_BARPROP, TM1.CP_DSC_BAR, TM1.CP_BARDISN, TM1.CP_BARKGM, TM1.CP_BARMTR, TM1.CP_BARPIE, TM1.CP_BARALBK, TM1.CP_BARALBM, TM1.CP_BARENCC, TM1.CP_DISUSRC, TM1.CP_BARMAQC, TM1.CP_BARESTR FROM TXPCONPRO TM1 WHERE TM1.CP_ID = ? ORDER BY TM1.CP_ID ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UO5", "SELECT /*+ FIRST_ROWS(1) */ CP_ID FROM TXPCONPRO WHERE CP_ID = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UO6", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ CP_ID FROM TXPCONPRO WHERE ( CP_ID > ?) ORDER BY CP_ID) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01UO7", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ CP_ID FROM TXPCONPRO WHERE ( CP_ID < ?) ORDER BY CP_ID DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01UO8", "INSERT INTO TXPCONPRO(CP_ID, CP_EMPRCOD, CP_CLICOD, CP_CLINOM, CP_BARCOD, CP_BARCODR, CP_BARCODP, CP_BARFECF, CP_BARNUMC, CP_BARPLF, CP_BARSIT, CP_BARFECC, CP_BARFECS, CP_BARFECG, CP_BARSER, CP_BARSERD, CP_BARCOLO, CP_BARCOLU, CP_BARNOMC, CP_BARTIPA, CP_TARTDSC, CP_BARGIRA, CP_BARACAA, CP_BARAGRE, CP_BAREXT, CP_DISDES, CP_DISCOD, CP_BARPROP, CP_DSC_BAR, CP_BARDISN, CP_BARKGM, CP_BARMTR, CP_BARPIE, CP_BARALBK, CP_BARALBM, CP_BARENCC, CP_DISUSRC, CP_BARMAQC, CP_BARESTR) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPCONPRO")
         ,new UpdateCursor("T01UO9", "UPDATE TXPCONPRO SET CP_EMPRCOD=?, CP_CLICOD=?, CP_CLINOM=?, CP_BARCOD=?, CP_BARCODR=?, CP_BARCODP=?, CP_BARFECF=?, CP_BARNUMC=?, CP_BARPLF=?, CP_BARSIT=?, CP_BARFECC=?, CP_BARFECS=?, CP_BARFECG=?, CP_BARSER=?, CP_BARSERD=?, CP_BARCOLO=?, CP_BARCOLU=?, CP_BARNOMC=?, CP_BARTIPA=?, CP_TARTDSC=?, CP_BARGIRA=?, CP_BARACAA=?, CP_BARAGRE=?, CP_BAREXT=?, CP_DISDES=?, CP_DISCOD=?, CP_BARPROP=?, CP_DSC_BAR=?, CP_BARDISN=?, CP_BARKGM=?, CP_BARMTR=?, CP_BARPIE=?, CP_BARALBK=?, CP_BARALBM=?, CP_BARENCC=?, CP_DISUSRC=?, CP_BARMAQC=?, CP_BARESTR=?  WHERE CP_ID = ?", GX_NOMASK, "TXPCONPRO")
         ,new UpdateCursor("T01UO10", "DELETE FROM TXPCONPRO  WHERE CP_ID = ?", GX_NOMASK, "TXPCONPRO")
         ,new ForEachCursor("T01UO11", "SELECT /*+ FIRST_ROWS(100) */ CP_ID FROM TXPCONPRO ORDER BY CP_ID ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(8);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 1);
               ((byte[]) buf[10])[0] = rslt.getByte(11);
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDate(12);
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDate(13);
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDate(14);
               ((String[]) buf[14])[0] = rslt.getString(15, 16);
               ((String[]) buf[15])[0] = rslt.getVarchar(16);
               ((String[]) buf[16])[0] = rslt.getString(17, 13);
               ((int[]) buf[17])[0] = rslt.getInt(18);
               ((String[]) buf[18])[0] = rslt.getVarchar(19);
               ((short[]) buf[19])[0] = rslt.getShort(20);
               ((String[]) buf[20])[0] = rslt.getVarchar(21);
               ((String[]) buf[21])[0] = rslt.getVarchar(22);
               ((short[]) buf[22])[0] = rslt.getShort(23);
               ((String[]) buf[23])[0] = rslt.getString(24, 1);
               ((byte[]) buf[24])[0] = rslt.getByte(25);
               ((String[]) buf[25])[0] = rslt.getString(26, 1);
               ((int[]) buf[26])[0] = rslt.getInt(27);
               ((String[]) buf[27])[0] = rslt.getString(28, 8);
               ((String[]) buf[28])[0] = rslt.getVarchar(29);
               ((String[]) buf[29])[0] = rslt.getString(30, 8);
               ((java.math.BigDecimal[]) buf[30])[0] = rslt.getBigDecimal(31,2);
               ((java.math.BigDecimal[]) buf[31])[0] = rslt.getBigDecimal(32,2);
               ((int[]) buf[32])[0] = rslt.getInt(33);
               ((java.math.BigDecimal[]) buf[33])[0] = rslt.getBigDecimal(34,2);
               ((java.math.BigDecimal[]) buf[34])[0] = rslt.getBigDecimal(35,2);
               ((String[]) buf[35])[0] = rslt.getString(36, 20);
               ((String[]) buf[36])[0] = rslt.getString(37, 8);
               ((String[]) buf[37])[0] = rslt.getString(38, 6);
               ((byte[]) buf[38])[0] = rslt.getByte(39);
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(8);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 1);
               ((byte[]) buf[10])[0] = rslt.getByte(11);
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDate(12);
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDate(13);
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDate(14);
               ((String[]) buf[14])[0] = rslt.getString(15, 16);
               ((String[]) buf[15])[0] = rslt.getVarchar(16);
               ((String[]) buf[16])[0] = rslt.getString(17, 13);
               ((int[]) buf[17])[0] = rslt.getInt(18);
               ((String[]) buf[18])[0] = rslt.getVarchar(19);
               ((short[]) buf[19])[0] = rslt.getShort(20);
               ((String[]) buf[20])[0] = rslt.getVarchar(21);
               ((String[]) buf[21])[0] = rslt.getVarchar(22);
               ((short[]) buf[22])[0] = rslt.getShort(23);
               ((String[]) buf[23])[0] = rslt.getString(24, 1);
               ((byte[]) buf[24])[0] = rslt.getByte(25);
               ((String[]) buf[25])[0] = rslt.getString(26, 1);
               ((int[]) buf[26])[0] = rslt.getInt(27);
               ((String[]) buf[27])[0] = rslt.getString(28, 8);
               ((String[]) buf[28])[0] = rslt.getVarchar(29);
               ((String[]) buf[29])[0] = rslt.getString(30, 8);
               ((java.math.BigDecimal[]) buf[30])[0] = rslt.getBigDecimal(31,2);
               ((java.math.BigDecimal[]) buf[31])[0] = rslt.getBigDecimal(32,2);
               ((int[]) buf[32])[0] = rslt.getInt(33);
               ((java.math.BigDecimal[]) buf[33])[0] = rslt.getBigDecimal(34,2);
               ((java.math.BigDecimal[]) buf[34])[0] = rslt.getBigDecimal(35,2);
               ((String[]) buf[35])[0] = rslt.getString(36, 20);
               ((String[]) buf[36])[0] = rslt.getString(37, 8);
               ((String[]) buf[37])[0] = rslt.getString(38, 6);
               ((byte[]) buf[38])[0] = rslt.getByte(39);
               return;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(8);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 1);
               ((byte[]) buf[10])[0] = rslt.getByte(11);
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDate(12);
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDate(13);
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDate(14);
               ((String[]) buf[14])[0] = rslt.getString(15, 16);
               ((String[]) buf[15])[0] = rslt.getVarchar(16);
               ((String[]) buf[16])[0] = rslt.getString(17, 13);
               ((int[]) buf[17])[0] = rslt.getInt(18);
               ((String[]) buf[18])[0] = rslt.getVarchar(19);
               ((short[]) buf[19])[0] = rslt.getShort(20);
               ((String[]) buf[20])[0] = rslt.getVarchar(21);
               ((String[]) buf[21])[0] = rslt.getVarchar(22);
               ((short[]) buf[22])[0] = rslt.getShort(23);
               ((String[]) buf[23])[0] = rslt.getString(24, 1);
               ((byte[]) buf[24])[0] = rslt.getByte(25);
               ((String[]) buf[25])[0] = rslt.getString(26, 1);
               ((int[]) buf[26])[0] = rslt.getInt(27);
               ((String[]) buf[27])[0] = rslt.getString(28, 8);
               ((String[]) buf[28])[0] = rslt.getVarchar(29);
               ((String[]) buf[29])[0] = rslt.getString(30, 8);
               ((java.math.BigDecimal[]) buf[30])[0] = rslt.getBigDecimal(31,2);
               ((java.math.BigDecimal[]) buf[31])[0] = rslt.getBigDecimal(32,2);
               ((int[]) buf[32])[0] = rslt.getInt(33);
               ((java.math.BigDecimal[]) buf[33])[0] = rslt.getBigDecimal(34,2);
               ((java.math.BigDecimal[]) buf[34])[0] = rslt.getBigDecimal(35,2);
               ((String[]) buf[35])[0] = rslt.getString(36, 20);
               ((String[]) buf[36])[0] = rslt.getString(37, 8);
               ((String[]) buf[37])[0] = rslt.getString(38, 6);
               ((byte[]) buf[38])[0] = rslt.getByte(39);
               return;
            case 3 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
            case 4 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
            case 5 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
            case 9 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
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
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 3 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 4 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 5 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 6 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setVarchar(4, (String)parms[3], 100, false);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 1);
               stmt.setDate(8, (java.util.Date)parms[7]);
               stmt.setInt(9, ((Number) parms[8]).intValue());
               stmt.setString(10, (String)parms[9], 1);
               stmt.setByte(11, ((Number) parms[10]).byteValue());
               stmt.setDate(12, (java.util.Date)parms[11]);
               stmt.setDate(13, (java.util.Date)parms[12]);
               stmt.setDate(14, (java.util.Date)parms[13]);
               stmt.setString(15, (String)parms[14], 16);
               stmt.setVarchar(16, (String)parms[15], 100, false);
               stmt.setString(17, (String)parms[16], 13);
               stmt.setInt(18, ((Number) parms[17]).intValue());
               stmt.setVarchar(19, (String)parms[18], 100, false);
               stmt.setShort(20, ((Number) parms[19]).shortValue());
               stmt.setVarchar(21, (String)parms[20], 40, false);
               stmt.setVarchar(22, (String)parms[21], 100, false);
               stmt.setShort(23, ((Number) parms[22]).shortValue());
               stmt.setString(24, (String)parms[23], 1);
               stmt.setByte(25, ((Number) parms[24]).byteValue());
               stmt.setString(26, (String)parms[25], 1);
               stmt.setInt(27, ((Number) parms[26]).intValue());
               stmt.setString(28, (String)parms[27], 8);
               stmt.setVarchar(29, (String)parms[28], 100, false);
               stmt.setString(30, (String)parms[29], 8);
               stmt.setBigDecimal(31, (java.math.BigDecimal)parms[30], 2);
               stmt.setBigDecimal(32, (java.math.BigDecimal)parms[31], 2);
               stmt.setInt(33, ((Number) parms[32]).intValue());
               stmt.setBigDecimal(34, (java.math.BigDecimal)parms[33], 2);
               stmt.setBigDecimal(35, (java.math.BigDecimal)parms[34], 2);
               stmt.setString(36, (String)parms[35], 20);
               stmt.setString(37, (String)parms[36], 8);
               stmt.setString(38, (String)parms[37], 6);
               stmt.setByte(39, ((Number) parms[38]).byteValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setVarchar(3, (String)parms[2], 100, false);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 1);
               stmt.setDate(7, (java.util.Date)parms[6]);
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setString(9, (String)parms[8], 1);
               stmt.setByte(10, ((Number) parms[9]).byteValue());
               stmt.setDate(11, (java.util.Date)parms[10]);
               stmt.setDate(12, (java.util.Date)parms[11]);
               stmt.setDate(13, (java.util.Date)parms[12]);
               stmt.setString(14, (String)parms[13], 16);
               stmt.setVarchar(15, (String)parms[14], 100, false);
               stmt.setString(16, (String)parms[15], 13);
               stmt.setInt(17, ((Number) parms[16]).intValue());
               stmt.setVarchar(18, (String)parms[17], 100, false);
               stmt.setShort(19, ((Number) parms[18]).shortValue());
               stmt.setVarchar(20, (String)parms[19], 40, false);
               stmt.setVarchar(21, (String)parms[20], 100, false);
               stmt.setShort(22, ((Number) parms[21]).shortValue());
               stmt.setString(23, (String)parms[22], 1);
               stmt.setByte(24, ((Number) parms[23]).byteValue());
               stmt.setString(25, (String)parms[24], 1);
               stmt.setInt(26, ((Number) parms[25]).intValue());
               stmt.setString(27, (String)parms[26], 8);
               stmt.setVarchar(28, (String)parms[27], 100, false);
               stmt.setString(29, (String)parms[28], 8);
               stmt.setBigDecimal(30, (java.math.BigDecimal)parms[29], 2);
               stmt.setBigDecimal(31, (java.math.BigDecimal)parms[30], 2);
               stmt.setInt(32, ((Number) parms[31]).intValue());
               stmt.setBigDecimal(33, (java.math.BigDecimal)parms[32], 2);
               stmt.setBigDecimal(34, (java.math.BigDecimal)parms[33], 2);
               stmt.setString(35, (String)parms[34], 20);
               stmt.setString(36, (String)parms[35], 8);
               stmt.setString(37, (String)parms[36], 6);
               stmt.setByte(38, ((Number) parms[37]).byteValue());
               stmt.setLong(39, ((Number) parms[38]).longValue());
               return;
            case 8 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
      }
   }

}

