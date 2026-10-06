package app.anticipacionerrores ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class mant_impl extends GXDataArea
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
            AV7MAntId = GXutil.lval( httpContext.GetPar( "MAntId")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7MAntId", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7MAntId), 10, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMANTID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV7MAntId), "ZZZZZZZZZ9")));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "MAnt", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtMAntId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public mant_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public mant_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( mant_impl.class ));
   }

   public mant_impl( int remoteHandle ,
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMAntId_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMAntId_Internalname, httpContext.getMessage( "Id", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMAntId_Internalname, GXutil.ltrim( localUtil.ntoc( A14562MAntId, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A14562MAntId), "ZZZZZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,22);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMAntId_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMAntId_Enabled, 1, "text", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "AnticipacionErrores\\Id", "right", false, "", "HLP_AnticipacionErrores\\MAnt.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMAntEmprCo_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMAntEmprCo_Internalname, httpContext.getMessage( "Empresa", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMAntEmprCo_Internalname, GXutil.rtrim( A14566MAntEmprCo), GXutil.rtrim( localUtil.format( A14566MAntEmprCo, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,27);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMAntEmprCo_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMAntEmprCo_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AnticipacionErrores\\MAnt.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMAntCliCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMAntCliCod_Internalname, httpContext.getMessage( "Cliente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 32,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMAntCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A14565MAntCliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMAntCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A14565MAntCliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A14565MAntCliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,32);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMAntCliCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMAntCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AnticipacionErrores\\MAnt.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMAntCliNom_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMAntCliNom_Internalname, httpContext.getMessage( "Cliente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 37,'',false,'',0)\"" ;
      ClassString = "AttributeFL" ;
      StyleString = "" ;
      ClassString = "AttributeFL" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtMAntCliNom_Internalname, A14611MAntCliNom, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,37);\"", (short)(0), 1, edtMAntCliNom_Enabled, 0, 80, "chr", 4, "row", (byte)(0), StyleString, ClassString, "", "", "255", -1, 0, "", "", (byte)(-1), true, "Mensaje", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_AnticipacionErrores\\MAnt.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMAntArtCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMAntArtCod_Internalname, httpContext.getMessage( "Cód Artículo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 42,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMAntArtCod_Internalname, GXutil.rtrim( A14567MAntArtCod), GXutil.rtrim( localUtil.format( A14567MAntArtCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,42);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMAntArtCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMAntArtCod_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AnticipacionErrores\\MAnt.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMAntArtDsc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMAntArtDsc_Internalname, httpContext.getMessage( "Artículo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 47,'',false,'',0)\"" ;
      ClassString = "AttributeFL" ;
      StyleString = "" ;
      ClassString = "AttributeFL" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtMAntArtDsc_Internalname, A14613MAntArtDsc, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,47);\"", (short)(0), 1, edtMAntArtDsc_Enabled, 0, 80, "chr", 4, "row", (byte)(0), StyleString, ClassString, "", "", "255", -1, 0, "", "", (byte)(-1), true, "Mensaje", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_AnticipacionErrores\\MAnt.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMAntColNom_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMAntColNom_Internalname, httpContext.getMessage( "Color", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 52,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMAntColNom_Internalname, GXutil.rtrim( A14623MAntColNom), GXutil.rtrim( localUtil.format( A14623MAntColNom, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,52);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMAntColNom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMAntColNom_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AnticipacionErrores\\MAnt.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMAntColNum_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMAntColNum_Internalname, httpContext.getMessage( "Color", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 57,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMAntColNum_Internalname, GXutil.ltrim( localUtil.ntoc( A14568MAntColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMAntColNum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A14568MAntColNum), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A14568MAntColNum), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,57);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMAntColNum_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMAntColNum_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AnticipacionErrores\\MAnt.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMAntColCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMAntColCod_Internalname, httpContext.getMessage( "Tipo Colorante", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 62,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMAntColCod_Internalname, GXutil.ltrim( localUtil.ntoc( A14642MAntColCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMAntColCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A14642MAntColCod), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A14642MAntColCod), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,62);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMAntColCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMAntColCod_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AnticipacionErrores\\MAnt.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMAntMaqCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMAntMaqCod_Internalname, httpContext.getMessage( "máquina", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 67,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMAntMaqCod_Internalname, GXutil.rtrim( A14570MAntMaqCod), GXutil.rtrim( localUtil.format( A14570MAntMaqCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,67);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMAntMaqCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMAntMaqCod_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AnticipacionErrores\\MAnt.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMAntMaqDsc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMAntMaqDsc_Internalname, httpContext.getMessage( "Máquina", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 72,'',false,'',0)\"" ;
      ClassString = "AttributeFL" ;
      StyleString = "" ;
      ClassString = "AttributeFL" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtMAntMaqDsc_Internalname, A14610MAntMaqDsc, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,72);\"", (short)(0), 1, edtMAntMaqDsc_Enabled, 0, 80, "chr", 4, "row", (byte)(0), StyleString, ClassString, "", "", "255", -1, 0, "", "", (byte)(-1), true, "Mensaje", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_AnticipacionErrores\\MAnt.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMAntTipMCo_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMAntTipMCo_Internalname, httpContext.getMessage( "Cód.  Tipo Máquina", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 77,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMAntTipMCo_Internalname, GXutil.rtrim( A14569MAntTipMCo), GXutil.rtrim( localUtil.format( A14569MAntTipMCo, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,77);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMAntTipMCo_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMAntTipMCo_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AnticipacionErrores\\MAnt.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMAntTipMDs_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMAntTipMDs_Internalname, httpContext.getMessage( "Tipo Máquina", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 82,'',false,'',0)\"" ;
      ClassString = "AttributeFL" ;
      StyleString = "" ;
      ClassString = "AttributeFL" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtMAntTipMDs_Internalname, A14612MAntTipMDs, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,82);\"", (short)(0), 1, edtMAntTipMDs_Enabled, 0, 80, "chr", 4, "row", (byte)(0), StyleString, ClassString, "", "", "255", -1, 0, "", "", (byte)(-1), true, "Mensaje", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_AnticipacionErrores\\MAnt.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMAntKilPro_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMAntKilPro_Internalname, httpContext.getMessage( "Kilos Produccion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 87,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMAntKilPro_Internalname, GXutil.ltrim( localUtil.ntoc( A14643MAntKilPro, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMAntKilPro_Enabled!=0) ? localUtil.format( A14643MAntKilPro, "ZZZZZZZZ9.99") : localUtil.format( A14643MAntKilPro, "ZZZZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,87);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMAntKilPro_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMAntKilPro_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AnticipacionErrores\\MAnt.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMAntKilReo_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMAntKilReo_Internalname, httpContext.getMessage( "Kilos Reoperados", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 92,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMAntKilReo_Internalname, GXutil.ltrim( localUtil.ntoc( A14644MAntKilReo, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMAntKilReo_Enabled!=0) ? localUtil.format( A14644MAntKilReo, "ZZZZZZZZ9.99") : localUtil.format( A14644MAntKilReo, "ZZZZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,92);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMAntKilReo_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMAntKilReo_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AnticipacionErrores\\MAnt.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMAntPorc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMAntPorc_Internalname, httpContext.getMessage( "Porc", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtMAntPorc_Internalname, GXutil.ltrim( localUtil.ntoc( A14645MAntPorc, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMAntPorc_Enabled!=0) ? localUtil.format( A14645MAntPorc, "ZZZ9.99") : localUtil.format( A14645MAntPorc, "ZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMAntPorc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMAntPorc_Enabled, 0, "text", "", 7, "chr", 1, "row", 7, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AnticipacionErrores\\MAnt.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 102,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_AnticipacionErrores\\MAnt.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 104,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_AnticipacionErrores\\MAnt.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 106,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_AnticipacionErrores\\MAnt.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV11Pgmname), GXutil.rtrim( localUtil.format( AV11Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AnticipacionErrores\\MAnt.htm");
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
      e111W22 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z14562MAntId = localUtil.ctol( httpContext.cgiGet( "Z14562MAntId"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            Z14566MAntEmprCo = httpContext.cgiGet( "Z14566MAntEmprCo") ;
            Z14565MAntCliCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z14565MAntCliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z14611MAntCliNom = httpContext.cgiGet( "Z14611MAntCliNom") ;
            Z14567MAntArtCod = httpContext.cgiGet( "Z14567MAntArtCod") ;
            Z14613MAntArtDsc = httpContext.cgiGet( "Z14613MAntArtDsc") ;
            Z14623MAntColNom = httpContext.cgiGet( "Z14623MAntColNom") ;
            Z14568MAntColNum = (int)(localUtil.ctol( httpContext.cgiGet( "Z14568MAntColNum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z14642MAntColCod = (byte)(localUtil.ctol( httpContext.cgiGet( "Z14642MAntColCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z14570MAntMaqCod = httpContext.cgiGet( "Z14570MAntMaqCod") ;
            Z14610MAntMaqDsc = httpContext.cgiGet( "Z14610MAntMaqDsc") ;
            Z14569MAntTipMCo = httpContext.cgiGet( "Z14569MAntTipMCo") ;
            Z14612MAntTipMDs = httpContext.cgiGet( "Z14612MAntTipMDs") ;
            Z14646MAntKilTot = localUtil.ctond( httpContext.cgiGet( "Z14646MAntKilTot")) ;
            Z14643MAntKilPro = localUtil.ctond( httpContext.cgiGet( "Z14643MAntKilPro")) ;
            Z14644MAntKilReo = localUtil.ctond( httpContext.cgiGet( "Z14644MAntKilReo")) ;
            Z14563MAntTkn = httpContext.cgiGet( "Z14563MAntTkn") ;
            Z14564MAntUsu = httpContext.cgiGet( "Z14564MAntUsu") ;
            Z14647MAntMetTot = localUtil.ctond( httpContext.cgiGet( "Z14647MAntMetTot")) ;
            Z14648MAntMetPro = localUtil.ctond( httpContext.cgiGet( "Z14648MAntMetPro")) ;
            Z14649MAntMetReo = localUtil.ctond( httpContext.cgiGet( "Z14649MAntMetReo")) ;
            A14646MAntKilTot = localUtil.ctond( httpContext.cgiGet( "Z14646MAntKilTot")) ;
            A14563MAntTkn = httpContext.cgiGet( "Z14563MAntTkn") ;
            A14564MAntUsu = httpContext.cgiGet( "Z14564MAntUsu") ;
            A14647MAntMetTot = localUtil.ctond( httpContext.cgiGet( "Z14647MAntMetTot")) ;
            n14647MAntMetTot = false ;
            A14648MAntMetPro = localUtil.ctond( httpContext.cgiGet( "Z14648MAntMetPro")) ;
            n14648MAntMetPro = false ;
            A14649MAntMetReo = localUtil.ctond( httpContext.cgiGet( "Z14649MAntMetReo")) ;
            n14649MAntMetReo = false ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            A14646MAntKilTot = localUtil.ctond( httpContext.cgiGet( "MANTKILTOT")) ;
            A14647MAntMetTot = localUtil.ctond( httpContext.cgiGet( "MANTMETTOT")) ;
            A14649MAntMetReo = localUtil.ctond( httpContext.cgiGet( "MANTMETREO")) ;
            A14650MantMetPor = localUtil.ctond( httpContext.cgiGet( "MANTMETPOR")) ;
            AV7MAntId = localUtil.ctol( httpContext.cgiGet( "vMANTID"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            A14563MAntTkn = httpContext.cgiGet( "MANTTKN") ;
            A14564MAntUsu = httpContext.cgiGet( "MANTUSU") ;
            A14648MAntMetPro = localUtil.ctond( httpContext.cgiGet( "MANTMETPRO")) ;
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
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMAntId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMAntId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MANTID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtMAntId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A14562MAntId = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A14562MAntId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14562MAntId), 10, 0));
            }
            else
            {
               A14562MAntId = localUtil.ctol( httpContext.cgiGet( edtMAntId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A14562MAntId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14562MAntId), 10, 0));
            }
            A14566MAntEmprCo = httpContext.cgiGet( edtMAntEmprCo_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14566MAntEmprCo", A14566MAntEmprCo);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMAntCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMAntCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MANTCLICOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtMAntCliCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A14565MAntCliCod = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A14565MAntCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14565MAntCliCod), 6, 0));
            }
            else
            {
               A14565MAntCliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtMAntCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A14565MAntCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14565MAntCliCod), 6, 0));
            }
            A14611MAntCliNom = httpContext.cgiGet( edtMAntCliNom_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14611MAntCliNom", A14611MAntCliNom);
            A14567MAntArtCod = httpContext.cgiGet( edtMAntArtCod_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14567MAntArtCod", A14567MAntArtCod);
            A14613MAntArtDsc = httpContext.cgiGet( edtMAntArtDsc_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14613MAntArtDsc", A14613MAntArtDsc);
            A14623MAntColNom = httpContext.cgiGet( edtMAntColNom_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14623MAntColNom", A14623MAntColNom);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMAntColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMAntColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MANTCOLNUM");
               AnyError = (short)(1) ;
               GX_FocusControl = edtMAntColNum_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A14568MAntColNum = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A14568MAntColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14568MAntColNum), 6, 0));
            }
            else
            {
               A14568MAntColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtMAntColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A14568MAntColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14568MAntColNum), 6, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMAntColCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMAntColCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MANTCOLCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtMAntColCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A14642MAntColCod = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A14642MAntColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14642MAntColCod), 2, 0));
            }
            else
            {
               A14642MAntColCod = (byte)(localUtil.ctol( httpContext.cgiGet( edtMAntColCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A14642MAntColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14642MAntColCod), 2, 0));
            }
            A14570MAntMaqCod = httpContext.cgiGet( edtMAntMaqCod_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14570MAntMaqCod", A14570MAntMaqCod);
            A14610MAntMaqDsc = httpContext.cgiGet( edtMAntMaqDsc_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14610MAntMaqDsc", A14610MAntMaqDsc);
            A14569MAntTipMCo = httpContext.cgiGet( edtMAntTipMCo_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14569MAntTipMCo", A14569MAntTipMCo);
            A14612MAntTipMDs = httpContext.cgiGet( edtMAntTipMDs_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14612MAntTipMDs", A14612MAntTipMDs);
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtMAntKilPro_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMAntKilPro_Internalname)), DecimalUtil.stringToDec("999999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MANTKILPRO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtMAntKilPro_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A14643MAntKilPro = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, "A14643MAntKilPro", GXutil.ltrimstr( A14643MAntKilPro, 12, 2));
            }
            else
            {
               A14643MAntKilPro = localUtil.ctond( httpContext.cgiGet( edtMAntKilPro_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A14643MAntKilPro", GXutil.ltrimstr( A14643MAntKilPro, 12, 2));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtMAntKilReo_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMAntKilReo_Internalname)), DecimalUtil.stringToDec("999999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MANTKILREO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtMAntKilReo_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A14644MAntKilReo = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, "A14644MAntKilReo", GXutil.ltrimstr( A14644MAntKilReo, 12, 2));
            }
            else
            {
               A14644MAntKilReo = localUtil.ctond( httpContext.cgiGet( edtMAntKilReo_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A14644MAntKilReo", GXutil.ltrimstr( A14644MAntKilReo, 12, 2));
            }
            A14645MAntPorc = localUtil.ctond( httpContext.cgiGet( edtMAntPorc_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14645MAntPorc", GXutil.ltrimstr( A14645MAntPorc, 7, 2));
            AV11Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV11Pgmname", AV11Pgmname);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"MAnt");
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            forbiddenHiddens.add("MAntKilTot", localUtil.format( A14646MAntKilTot, "ZZZZZZZZ9.99"));
            forbiddenHiddens.add("MAntTkn", GXutil.rtrim( localUtil.format( A14563MAntTkn, "")));
            forbiddenHiddens.add("MAntUsu", GXutil.rtrim( localUtil.format( A14564MAntUsu, "")));
            forbiddenHiddens.add("MAntMetTot", localUtil.format( A14647MAntMetTot, "ZZZZZZZZ9.99"));
            forbiddenHiddens.add("MAntMetPro", localUtil.format( A14648MAntMetPro, "ZZZZZZZZ9.99"));
            forbiddenHiddens.add("MAntMetReo", localUtil.format( A14649MAntMetReo, "ZZZZZZZZ9.99"));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( A14562MAntId != Z14562MAntId ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("anticipacionerrores\\mant:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               A14562MAntId = GXutil.lval( httpContext.GetPar( "MAntId")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A14562MAntId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14562MAntId), 10, 0));
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
                  sMode1914 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  Gx_mode = sMode1914 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound1914 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_1W20( ) ;
                        if ( AnyError == 0 )
                        {
                           GX_FocusControl = bttBtntrn_enter_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noinsert"), 1, "MANTID");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtMAntId_Internalname ;
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
                        e111W22 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e121W22 ();
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
         e121W22 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll1W21914( ) ;
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
         disableAttributes1W21914( ) ;
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

   public void confirm_1W20( )
   {
      beforeValidate1W21914( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1W21914( ) ;
         }
         else
         {
            checkExtendedTable1W21914( ) ;
            closeExtendedTableCursors1W21914( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
   }

   public void resetCaption1W20( )
   {
   }

   public void e111W22( )
   {
      /* Start Routine */
      returnInSub = false ;
      if ( 0 == 2 )
      {
         new app.anticipacionerrores.mant_init(remoteHandle, context).execute( ) ;
      }
      GXt_char1 = AV12Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      mant_impl.this.GXt_char1 = GXv_char2[0] ;
      AV12Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = AV13Emprcod ;
      GXv_char3[0] = AV14Emprnom ;
      GXv_char4[0] = AV15Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      mant_impl.this.AV13Emprcod = GXv_char2[0] ;
      mant_impl.this.AV14Emprnom = GXv_char3[0] ;
      mant_impl.this.AV15Usurcod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13Emprcod", AV13Emprcod);
      httpContext.ajax_rsp_assign_attri("", false, "AV14Emprnom", AV14Emprnom);
      httpContext.ajax_rsp_assign_attri("", false, "AV15Usurcod", AV15Usurcod);
      GXv_SdtWWPContext5[0] = AV8WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext5) ;
      AV8WWPContext = GXv_SdtWWPContext5[0] ;
      AV9TrnContext.fromxml(AV10WebSession.getValue("TrnContext"), null, null);
   }

   public void e121W22( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV9TrnContext.getgxTv_SdtWWPTransactionContext_Callerondelete() )
      {
         callWebObject(formatLink("app.anticipacionerrores.mantww", new String[] {}, new String[] {}) );
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

   public void zm1W21914( int GX_JID )
   {
      if ( ( GX_JID == 6 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z14566MAntEmprCo = T01W23_A14566MAntEmprCo[0] ;
            Z14565MAntCliCod = T01W23_A14565MAntCliCod[0] ;
            Z14611MAntCliNom = T01W23_A14611MAntCliNom[0] ;
            Z14567MAntArtCod = T01W23_A14567MAntArtCod[0] ;
            Z14613MAntArtDsc = T01W23_A14613MAntArtDsc[0] ;
            Z14623MAntColNom = T01W23_A14623MAntColNom[0] ;
            Z14568MAntColNum = T01W23_A14568MAntColNum[0] ;
            Z14642MAntColCod = T01W23_A14642MAntColCod[0] ;
            Z14570MAntMaqCod = T01W23_A14570MAntMaqCod[0] ;
            Z14610MAntMaqDsc = T01W23_A14610MAntMaqDsc[0] ;
            Z14569MAntTipMCo = T01W23_A14569MAntTipMCo[0] ;
            Z14612MAntTipMDs = T01W23_A14612MAntTipMDs[0] ;
            Z14646MAntKilTot = T01W23_A14646MAntKilTot[0] ;
            Z14643MAntKilPro = T01W23_A14643MAntKilPro[0] ;
            Z14644MAntKilReo = T01W23_A14644MAntKilReo[0] ;
            Z14563MAntTkn = T01W23_A14563MAntTkn[0] ;
            Z14564MAntUsu = T01W23_A14564MAntUsu[0] ;
            Z14647MAntMetTot = T01W23_A14647MAntMetTot[0] ;
            Z14648MAntMetPro = T01W23_A14648MAntMetPro[0] ;
            Z14649MAntMetReo = T01W23_A14649MAntMetReo[0] ;
         }
         else
         {
            Z14566MAntEmprCo = A14566MAntEmprCo ;
            Z14565MAntCliCod = A14565MAntCliCod ;
            Z14611MAntCliNom = A14611MAntCliNom ;
            Z14567MAntArtCod = A14567MAntArtCod ;
            Z14613MAntArtDsc = A14613MAntArtDsc ;
            Z14623MAntColNom = A14623MAntColNom ;
            Z14568MAntColNum = A14568MAntColNum ;
            Z14642MAntColCod = A14642MAntColCod ;
            Z14570MAntMaqCod = A14570MAntMaqCod ;
            Z14610MAntMaqDsc = A14610MAntMaqDsc ;
            Z14569MAntTipMCo = A14569MAntTipMCo ;
            Z14612MAntTipMDs = A14612MAntTipMDs ;
            Z14646MAntKilTot = A14646MAntKilTot ;
            Z14643MAntKilPro = A14643MAntKilPro ;
            Z14644MAntKilReo = A14644MAntKilReo ;
            Z14563MAntTkn = A14563MAntTkn ;
            Z14564MAntUsu = A14564MAntUsu ;
            Z14647MAntMetTot = A14647MAntMetTot ;
            Z14648MAntMetPro = A14648MAntMetPro ;
            Z14649MAntMetReo = A14649MAntMetReo ;
         }
      }
      if ( GX_JID == -6 )
      {
         Z14562MAntId = A14562MAntId ;
         Z14566MAntEmprCo = A14566MAntEmprCo ;
         Z14565MAntCliCod = A14565MAntCliCod ;
         Z14611MAntCliNom = A14611MAntCliNom ;
         Z14567MAntArtCod = A14567MAntArtCod ;
         Z14613MAntArtDsc = A14613MAntArtDsc ;
         Z14623MAntColNom = A14623MAntColNom ;
         Z14568MAntColNum = A14568MAntColNum ;
         Z14642MAntColCod = A14642MAntColCod ;
         Z14570MAntMaqCod = A14570MAntMaqCod ;
         Z14610MAntMaqDsc = A14610MAntMaqDsc ;
         Z14569MAntTipMCo = A14569MAntTipMCo ;
         Z14612MAntTipMDs = A14612MAntTipMDs ;
         Z14646MAntKilTot = A14646MAntKilTot ;
         Z14643MAntKilPro = A14643MAntKilPro ;
         Z14644MAntKilReo = A14644MAntKilReo ;
         Z14563MAntTkn = A14563MAntTkn ;
         Z14564MAntUsu = A14564MAntUsu ;
         Z14647MAntMetTot = A14647MAntMetTot ;
         Z14648MAntMetPro = A14648MAntMetPro ;
         Z14649MAntMetReo = A14649MAntMetReo ;
      }
   }

   public void standaloneNotModal( )
   {
      AV11Pgmname = "AnticipacionErrores.MAnt" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11Pgmname", AV11Pgmname);
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      if ( ! (0==AV7MAntId) )
      {
         A14562MAntId = AV7MAntId ;
         httpContext.ajax_rsp_assign_attri("", false, "A14562MAntId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14562MAntId), 10, 0));
      }
      if ( ! (0==AV7MAntId) )
      {
         edtMAntId_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMAntId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMAntId_Enabled), 5, 0), true);
      }
      else
      {
         edtMAntId_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMAntId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMAntId_Enabled), 5, 0), true);
      }
      if ( ! (0==AV7MAntId) )
      {
         edtMAntId_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMAntId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMAntId_Enabled), 5, 0), true);
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

   public void load1W21914( )
   {
      /* Using cursor T01W24 */
      pr_default.execute(2, new Object[] {Long.valueOf(A14562MAntId)});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound1914 = (short)(1) ;
         A14566MAntEmprCo = T01W24_A14566MAntEmprCo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14566MAntEmprCo", A14566MAntEmprCo);
         A14565MAntCliCod = T01W24_A14565MAntCliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14565MAntCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14565MAntCliCod), 6, 0));
         A14611MAntCliNom = T01W24_A14611MAntCliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14611MAntCliNom", A14611MAntCliNom);
         A14567MAntArtCod = T01W24_A14567MAntArtCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14567MAntArtCod", A14567MAntArtCod);
         A14613MAntArtDsc = T01W24_A14613MAntArtDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14613MAntArtDsc", A14613MAntArtDsc);
         A14623MAntColNom = T01W24_A14623MAntColNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14623MAntColNom", A14623MAntColNom);
         A14568MAntColNum = T01W24_A14568MAntColNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14568MAntColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14568MAntColNum), 6, 0));
         A14642MAntColCod = T01W24_A14642MAntColCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14642MAntColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14642MAntColCod), 2, 0));
         A14570MAntMaqCod = T01W24_A14570MAntMaqCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14570MAntMaqCod", A14570MAntMaqCod);
         A14610MAntMaqDsc = T01W24_A14610MAntMaqDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14610MAntMaqDsc", A14610MAntMaqDsc);
         A14569MAntTipMCo = T01W24_A14569MAntTipMCo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14569MAntTipMCo", A14569MAntTipMCo);
         A14612MAntTipMDs = T01W24_A14612MAntTipMDs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14612MAntTipMDs", A14612MAntTipMDs);
         A14646MAntKilTot = T01W24_A14646MAntKilTot[0] ;
         A14643MAntKilPro = T01W24_A14643MAntKilPro[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14643MAntKilPro", GXutil.ltrimstr( A14643MAntKilPro, 12, 2));
         A14644MAntKilReo = T01W24_A14644MAntKilReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14644MAntKilReo", GXutil.ltrimstr( A14644MAntKilReo, 12, 2));
         A14563MAntTkn = T01W24_A14563MAntTkn[0] ;
         A14564MAntUsu = T01W24_A14564MAntUsu[0] ;
         A14647MAntMetTot = T01W24_A14647MAntMetTot[0] ;
         n14647MAntMetTot = T01W24_n14647MAntMetTot[0] ;
         A14648MAntMetPro = T01W24_A14648MAntMetPro[0] ;
         n14648MAntMetPro = T01W24_n14648MAntMetPro[0] ;
         A14649MAntMetReo = T01W24_A14649MAntMetReo[0] ;
         n14649MAntMetReo = T01W24_n14649MAntMetReo[0] ;
         zm1W21914( -6) ;
      }
      pr_default.close(2);
      onLoadActions1W21914( ) ;
   }

   public void onLoadActions1W21914( )
   {
      A14645MAntPorc = ((A14646MAntKilTot.doubleValue()>0) ? (A14644MAntKilReo.divide(A14646MAntKilTot, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100)) : DecimalUtil.doubleToDec(0)) ;
      httpContext.ajax_rsp_assign_attri("", false, "A14645MAntPorc", GXutil.ltrimstr( A14645MAntPorc, 7, 2));
      A14650MantMetPor = ((A14647MAntMetTot.doubleValue()>0) ? (A14649MAntMetReo.divide(A14647MAntMetTot, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100)) : DecimalUtil.doubleToDec(0)) ;
      httpContext.ajax_rsp_assign_attri("", false, "A14650MantMetPor", GXutil.ltrimstr( A14650MantMetPor, 7, 2));
   }

   public void checkExtendedTable1W21914( )
   {
      nIsDirty_1914 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      nIsDirty_1914 = (short)(1) ;
      A14645MAntPorc = ((A14646MAntKilTot.doubleValue()>0) ? (A14644MAntKilReo.divide(A14646MAntKilTot, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100)) : DecimalUtil.doubleToDec(0)) ;
      httpContext.ajax_rsp_assign_attri("", false, "A14645MAntPorc", GXutil.ltrimstr( A14645MAntPorc, 7, 2));
      nIsDirty_1914 = (short)(1) ;
      A14650MantMetPor = ((A14647MAntMetTot.doubleValue()>0) ? (A14649MAntMetReo.divide(A14647MAntMetTot, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100)) : DecimalUtil.doubleToDec(0)) ;
      httpContext.ajax_rsp_assign_attri("", false, "A14650MantMetPor", GXutil.ltrimstr( A14650MantMetPor, 7, 2));
   }

   public void closeExtendedTableCursors1W21914( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1W21914( )
   {
      /* Using cursor T01W25 */
      pr_default.execute(3, new Object[] {Long.valueOf(A14562MAntId)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound1914 = (short)(1) ;
      }
      else
      {
         RcdFound1914 = (short)(0) ;
      }
      pr_default.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01W23 */
      pr_default.execute(1, new Object[] {Long.valueOf(A14562MAntId)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1W21914( 6) ;
         RcdFound1914 = (short)(1) ;
         A14562MAntId = T01W23_A14562MAntId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14562MAntId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14562MAntId), 10, 0));
         A14566MAntEmprCo = T01W23_A14566MAntEmprCo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14566MAntEmprCo", A14566MAntEmprCo);
         A14565MAntCliCod = T01W23_A14565MAntCliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14565MAntCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14565MAntCliCod), 6, 0));
         A14611MAntCliNom = T01W23_A14611MAntCliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14611MAntCliNom", A14611MAntCliNom);
         A14567MAntArtCod = T01W23_A14567MAntArtCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14567MAntArtCod", A14567MAntArtCod);
         A14613MAntArtDsc = T01W23_A14613MAntArtDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14613MAntArtDsc", A14613MAntArtDsc);
         A14623MAntColNom = T01W23_A14623MAntColNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14623MAntColNom", A14623MAntColNom);
         A14568MAntColNum = T01W23_A14568MAntColNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14568MAntColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14568MAntColNum), 6, 0));
         A14642MAntColCod = T01W23_A14642MAntColCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14642MAntColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14642MAntColCod), 2, 0));
         A14570MAntMaqCod = T01W23_A14570MAntMaqCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14570MAntMaqCod", A14570MAntMaqCod);
         A14610MAntMaqDsc = T01W23_A14610MAntMaqDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14610MAntMaqDsc", A14610MAntMaqDsc);
         A14569MAntTipMCo = T01W23_A14569MAntTipMCo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14569MAntTipMCo", A14569MAntTipMCo);
         A14612MAntTipMDs = T01W23_A14612MAntTipMDs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14612MAntTipMDs", A14612MAntTipMDs);
         A14646MAntKilTot = T01W23_A14646MAntKilTot[0] ;
         A14643MAntKilPro = T01W23_A14643MAntKilPro[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14643MAntKilPro", GXutil.ltrimstr( A14643MAntKilPro, 12, 2));
         A14644MAntKilReo = T01W23_A14644MAntKilReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14644MAntKilReo", GXutil.ltrimstr( A14644MAntKilReo, 12, 2));
         A14563MAntTkn = T01W23_A14563MAntTkn[0] ;
         A14564MAntUsu = T01W23_A14564MAntUsu[0] ;
         A14647MAntMetTot = T01W23_A14647MAntMetTot[0] ;
         n14647MAntMetTot = T01W23_n14647MAntMetTot[0] ;
         A14648MAntMetPro = T01W23_A14648MAntMetPro[0] ;
         n14648MAntMetPro = T01W23_n14648MAntMetPro[0] ;
         A14649MAntMetReo = T01W23_A14649MAntMetReo[0] ;
         n14649MAntMetReo = T01W23_n14649MAntMetReo[0] ;
         Z14562MAntId = A14562MAntId ;
         sMode1914 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1W21914( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1914 = (short)(0) ;
            initializeNonKey1W21914( ) ;
         }
         Gx_mode = sMode1914 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1914 = (short)(0) ;
         initializeNonKey1W21914( ) ;
         sMode1914 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1914 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1W21914( ) ;
      if ( RcdFound1914 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound1914 = (short)(0) ;
      /* Using cursor T01W26 */
      pr_default.execute(4, new Object[] {Long.valueOf(A14562MAntId)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         while ( (pr_default.getStatus(4) != 101) && ( ( T01W26_A14562MAntId[0] < A14562MAntId ) ) )
         {
            pr_default.readNext(4);
         }
         if ( (pr_default.getStatus(4) != 101) && ( ( T01W26_A14562MAntId[0] > A14562MAntId ) ) )
         {
            A14562MAntId = T01W26_A14562MAntId[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A14562MAntId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14562MAntId), 10, 0));
            RcdFound1914 = (short)(1) ;
         }
      }
      pr_default.close(4);
   }

   public void move_previous( )
   {
      RcdFound1914 = (short)(0) ;
      /* Using cursor T01W27 */
      pr_default.execute(5, new Object[] {Long.valueOf(A14562MAntId)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( ( T01W27_A14562MAntId[0] > A14562MAntId ) ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( ( T01W27_A14562MAntId[0] < A14562MAntId ) ) )
         {
            A14562MAntId = T01W27_A14562MAntId[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A14562MAntId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14562MAntId), 10, 0));
            RcdFound1914 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1W21914( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtMAntId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1W21914( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1914 == 1 )
         {
            if ( A14562MAntId != Z14562MAntId )
            {
               A14562MAntId = Z14562MAntId ;
               httpContext.ajax_rsp_assign_attri("", false, "A14562MAntId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14562MAntId), 10, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "MANTID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtMAntId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtMAntId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               update1W21914( ) ;
               GX_FocusControl = edtMAntId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( A14562MAntId != Z14562MAntId )
            {
               /* Insert record */
               GX_FocusControl = edtMAntId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1W21914( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "MANTID");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtMAntId_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  /* Insert record */
                  GX_FocusControl = edtMAntId_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1W21914( ) ;
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
      if ( A14562MAntId != Z14562MAntId )
      {
         A14562MAntId = Z14562MAntId ;
         httpContext.ajax_rsp_assign_attri("", false, "A14562MAntId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14562MAntId), 10, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "MANTID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtMAntId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtMAntId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency1W21914( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01W22 */
         pr_default.execute(0, new Object[] {Long.valueOf(A14562MAntId)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"MAnt"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z14566MAntEmprCo, T01W22_A14566MAntEmprCo[0]) != 0 ) || ( Z14565MAntCliCod != T01W22_A14565MAntCliCod[0] ) || ( GXutil.strcmp(Z14611MAntCliNom, T01W22_A14611MAntCliNom[0]) != 0 ) || ( GXutil.strcmp(Z14567MAntArtCod, T01W22_A14567MAntArtCod[0]) != 0 ) || ( GXutil.strcmp(Z14613MAntArtDsc, T01W22_A14613MAntArtDsc[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z14623MAntColNom, T01W22_A14623MAntColNom[0]) != 0 ) || ( Z14568MAntColNum != T01W22_A14568MAntColNum[0] ) || ( Z14642MAntColCod != T01W22_A14642MAntColCod[0] ) || ( GXutil.strcmp(Z14570MAntMaqCod, T01W22_A14570MAntMaqCod[0]) != 0 ) || ( GXutil.strcmp(Z14610MAntMaqDsc, T01W22_A14610MAntMaqDsc[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z14569MAntTipMCo, T01W22_A14569MAntTipMCo[0]) != 0 ) || ( GXutil.strcmp(Z14612MAntTipMDs, T01W22_A14612MAntTipMDs[0]) != 0 ) || ( DecimalUtil.compareTo(Z14646MAntKilTot, T01W22_A14646MAntKilTot[0]) != 0 ) || ( DecimalUtil.compareTo(Z14643MAntKilPro, T01W22_A14643MAntKilPro[0]) != 0 ) || ( DecimalUtil.compareTo(Z14644MAntKilReo, T01W22_A14644MAntKilReo[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z14563MAntTkn, T01W22_A14563MAntTkn[0]) != 0 ) || ( GXutil.strcmp(Z14564MAntUsu, T01W22_A14564MAntUsu[0]) != 0 ) || ( DecimalUtil.compareTo(Z14647MAntMetTot, T01W22_A14647MAntMetTot[0]) != 0 ) || ( DecimalUtil.compareTo(Z14648MAntMetPro, T01W22_A14648MAntMetPro[0]) != 0 ) || ( DecimalUtil.compareTo(Z14649MAntMetReo, T01W22_A14649MAntMetReo[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z14566MAntEmprCo, T01W22_A14566MAntEmprCo[0]) != 0 )
            {
               GXutil.writeLogln("anticipacionerrores.mant:[seudo value changed for attri]"+"MAntEmprCo");
               GXutil.writeLogRaw("Old: ",Z14566MAntEmprCo);
               GXutil.writeLogRaw("Current: ",T01W22_A14566MAntEmprCo[0]);
            }
            if ( Z14565MAntCliCod != T01W22_A14565MAntCliCod[0] )
            {
               GXutil.writeLogln("anticipacionerrores.mant:[seudo value changed for attri]"+"MAntCliCod");
               GXutil.writeLogRaw("Old: ",Z14565MAntCliCod);
               GXutil.writeLogRaw("Current: ",T01W22_A14565MAntCliCod[0]);
            }
            if ( GXutil.strcmp(Z14611MAntCliNom, T01W22_A14611MAntCliNom[0]) != 0 )
            {
               GXutil.writeLogln("anticipacionerrores.mant:[seudo value changed for attri]"+"MAntCliNom");
               GXutil.writeLogRaw("Old: ",Z14611MAntCliNom);
               GXutil.writeLogRaw("Current: ",T01W22_A14611MAntCliNom[0]);
            }
            if ( GXutil.strcmp(Z14567MAntArtCod, T01W22_A14567MAntArtCod[0]) != 0 )
            {
               GXutil.writeLogln("anticipacionerrores.mant:[seudo value changed for attri]"+"MAntArtCod");
               GXutil.writeLogRaw("Old: ",Z14567MAntArtCod);
               GXutil.writeLogRaw("Current: ",T01W22_A14567MAntArtCod[0]);
            }
            if ( GXutil.strcmp(Z14613MAntArtDsc, T01W22_A14613MAntArtDsc[0]) != 0 )
            {
               GXutil.writeLogln("anticipacionerrores.mant:[seudo value changed for attri]"+"MAntArtDsc");
               GXutil.writeLogRaw("Old: ",Z14613MAntArtDsc);
               GXutil.writeLogRaw("Current: ",T01W22_A14613MAntArtDsc[0]);
            }
            if ( GXutil.strcmp(Z14623MAntColNom, T01W22_A14623MAntColNom[0]) != 0 )
            {
               GXutil.writeLogln("anticipacionerrores.mant:[seudo value changed for attri]"+"MAntColNom");
               GXutil.writeLogRaw("Old: ",Z14623MAntColNom);
               GXutil.writeLogRaw("Current: ",T01W22_A14623MAntColNom[0]);
            }
            if ( Z14568MAntColNum != T01W22_A14568MAntColNum[0] )
            {
               GXutil.writeLogln("anticipacionerrores.mant:[seudo value changed for attri]"+"MAntColNum");
               GXutil.writeLogRaw("Old: ",Z14568MAntColNum);
               GXutil.writeLogRaw("Current: ",T01W22_A14568MAntColNum[0]);
            }
            if ( Z14642MAntColCod != T01W22_A14642MAntColCod[0] )
            {
               GXutil.writeLogln("anticipacionerrores.mant:[seudo value changed for attri]"+"MAntColCod");
               GXutil.writeLogRaw("Old: ",Z14642MAntColCod);
               GXutil.writeLogRaw("Current: ",T01W22_A14642MAntColCod[0]);
            }
            if ( GXutil.strcmp(Z14570MAntMaqCod, T01W22_A14570MAntMaqCod[0]) != 0 )
            {
               GXutil.writeLogln("anticipacionerrores.mant:[seudo value changed for attri]"+"MAntMaqCod");
               GXutil.writeLogRaw("Old: ",Z14570MAntMaqCod);
               GXutil.writeLogRaw("Current: ",T01W22_A14570MAntMaqCod[0]);
            }
            if ( GXutil.strcmp(Z14610MAntMaqDsc, T01W22_A14610MAntMaqDsc[0]) != 0 )
            {
               GXutil.writeLogln("anticipacionerrores.mant:[seudo value changed for attri]"+"MAntMaqDsc");
               GXutil.writeLogRaw("Old: ",Z14610MAntMaqDsc);
               GXutil.writeLogRaw("Current: ",T01W22_A14610MAntMaqDsc[0]);
            }
            if ( GXutil.strcmp(Z14569MAntTipMCo, T01W22_A14569MAntTipMCo[0]) != 0 )
            {
               GXutil.writeLogln("anticipacionerrores.mant:[seudo value changed for attri]"+"MAntTipMCo");
               GXutil.writeLogRaw("Old: ",Z14569MAntTipMCo);
               GXutil.writeLogRaw("Current: ",T01W22_A14569MAntTipMCo[0]);
            }
            if ( GXutil.strcmp(Z14612MAntTipMDs, T01W22_A14612MAntTipMDs[0]) != 0 )
            {
               GXutil.writeLogln("anticipacionerrores.mant:[seudo value changed for attri]"+"MAntTipMDs");
               GXutil.writeLogRaw("Old: ",Z14612MAntTipMDs);
               GXutil.writeLogRaw("Current: ",T01W22_A14612MAntTipMDs[0]);
            }
            if ( DecimalUtil.compareTo(Z14646MAntKilTot, T01W22_A14646MAntKilTot[0]) != 0 )
            {
               GXutil.writeLogln("anticipacionerrores.mant:[seudo value changed for attri]"+"MAntKilTot");
               GXutil.writeLogRaw("Old: ",Z14646MAntKilTot);
               GXutil.writeLogRaw("Current: ",T01W22_A14646MAntKilTot[0]);
            }
            if ( DecimalUtil.compareTo(Z14643MAntKilPro, T01W22_A14643MAntKilPro[0]) != 0 )
            {
               GXutil.writeLogln("anticipacionerrores.mant:[seudo value changed for attri]"+"MAntKilPro");
               GXutil.writeLogRaw("Old: ",Z14643MAntKilPro);
               GXutil.writeLogRaw("Current: ",T01W22_A14643MAntKilPro[0]);
            }
            if ( DecimalUtil.compareTo(Z14644MAntKilReo, T01W22_A14644MAntKilReo[0]) != 0 )
            {
               GXutil.writeLogln("anticipacionerrores.mant:[seudo value changed for attri]"+"MAntKilReo");
               GXutil.writeLogRaw("Old: ",Z14644MAntKilReo);
               GXutil.writeLogRaw("Current: ",T01W22_A14644MAntKilReo[0]);
            }
            if ( GXutil.strcmp(Z14563MAntTkn, T01W22_A14563MAntTkn[0]) != 0 )
            {
               GXutil.writeLogln("anticipacionerrores.mant:[seudo value changed for attri]"+"MAntTkn");
               GXutil.writeLogRaw("Old: ",Z14563MAntTkn);
               GXutil.writeLogRaw("Current: ",T01W22_A14563MAntTkn[0]);
            }
            if ( GXutil.strcmp(Z14564MAntUsu, T01W22_A14564MAntUsu[0]) != 0 )
            {
               GXutil.writeLogln("anticipacionerrores.mant:[seudo value changed for attri]"+"MAntUsu");
               GXutil.writeLogRaw("Old: ",Z14564MAntUsu);
               GXutil.writeLogRaw("Current: ",T01W22_A14564MAntUsu[0]);
            }
            if ( DecimalUtil.compareTo(Z14647MAntMetTot, T01W22_A14647MAntMetTot[0]) != 0 )
            {
               GXutil.writeLogln("anticipacionerrores.mant:[seudo value changed for attri]"+"MAntMetTot");
               GXutil.writeLogRaw("Old: ",Z14647MAntMetTot);
               GXutil.writeLogRaw("Current: ",T01W22_A14647MAntMetTot[0]);
            }
            if ( DecimalUtil.compareTo(Z14648MAntMetPro, T01W22_A14648MAntMetPro[0]) != 0 )
            {
               GXutil.writeLogln("anticipacionerrores.mant:[seudo value changed for attri]"+"MAntMetPro");
               GXutil.writeLogRaw("Old: ",Z14648MAntMetPro);
               GXutil.writeLogRaw("Current: ",T01W22_A14648MAntMetPro[0]);
            }
            if ( DecimalUtil.compareTo(Z14649MAntMetReo, T01W22_A14649MAntMetReo[0]) != 0 )
            {
               GXutil.writeLogln("anticipacionerrores.mant:[seudo value changed for attri]"+"MAntMetReo");
               GXutil.writeLogRaw("Old: ",Z14649MAntMetReo);
               GXutil.writeLogRaw("Current: ",T01W22_A14649MAntMetReo[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"MAnt"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1W21914( )
   {
      beforeValidate1W21914( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1W21914( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1W21914( 0) ;
         checkOptimisticConcurrency1W21914( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1W21914( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1W21914( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01W28 */
                  pr_default.execute(6, new Object[] {Long.valueOf(A14562MAntId), A14566MAntEmprCo, Integer.valueOf(A14565MAntCliCod), A14611MAntCliNom, A14567MAntArtCod, A14613MAntArtDsc, A14623MAntColNom, Integer.valueOf(A14568MAntColNum), Byte.valueOf(A14642MAntColCod), A14570MAntMaqCod, A14610MAntMaqDsc, A14569MAntTipMCo, A14612MAntTipMDs, A14646MAntKilTot, A14643MAntKilPro, A14644MAntKilReo, A14563MAntTkn, A14564MAntUsu, Boolean.valueOf(n14647MAntMetTot), A14647MAntMetTot, Boolean.valueOf(n14648MAntMetPro), A14648MAntMetPro, Boolean.valueOf(n14649MAntMetReo), A14649MAntMetReo});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("MAnt");
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
                        resetCaption1W20( ) ;
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
            load1W21914( ) ;
         }
         endLevel1W21914( ) ;
      }
      closeExtendedTableCursors1W21914( ) ;
   }

   public void update1W21914( )
   {
      beforeValidate1W21914( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1W21914( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1W21914( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1W21914( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1W21914( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01W29 */
                  pr_default.execute(7, new Object[] {A14566MAntEmprCo, Integer.valueOf(A14565MAntCliCod), A14611MAntCliNom, A14567MAntArtCod, A14613MAntArtDsc, A14623MAntColNom, Integer.valueOf(A14568MAntColNum), Byte.valueOf(A14642MAntColCod), A14570MAntMaqCod, A14610MAntMaqDsc, A14569MAntTipMCo, A14612MAntTipMDs, A14646MAntKilTot, A14643MAntKilPro, A14644MAntKilReo, A14563MAntTkn, A14564MAntUsu, Boolean.valueOf(n14647MAntMetTot), A14647MAntMetTot, Boolean.valueOf(n14648MAntMetPro), A14648MAntMetPro, Boolean.valueOf(n14649MAntMetReo), A14649MAntMetReo, Long.valueOf(A14562MAntId)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("MAnt");
                  if ( (pr_default.getStatus(7) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"MAnt"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1W21914( ) ;
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
         endLevel1W21914( ) ;
      }
      closeExtendedTableCursors1W21914( ) ;
   }

   public void deferredUpdate1W21914( )
   {
   }

   public void delete( )
   {
      beforeValidate1W21914( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1W21914( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1W21914( ) ;
         afterConfirm1W21914( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1W21914( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01W210 */
               pr_default.execute(8, new Object[] {Long.valueOf(A14562MAntId)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("MAnt");
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
      sMode1914 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1W21914( ) ;
      Gx_mode = sMode1914 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1W21914( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         A14645MAntPorc = ((A14646MAntKilTot.doubleValue()>0) ? (A14644MAntKilReo.divide(A14646MAntKilTot, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100)) : DecimalUtil.doubleToDec(0)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14645MAntPorc", GXutil.ltrimstr( A14645MAntPorc, 7, 2));
         A14650MantMetPor = ((A14647MAntMetTot.doubleValue()>0) ? (A14649MAntMetReo.divide(A14647MAntMetTot, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100)) : DecimalUtil.doubleToDec(0)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14650MantMetPor", GXutil.ltrimstr( A14650MantMetPor, 7, 2));
      }
   }

   public void endLevel1W21914( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1W21914( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "anticipacionerrores.mant");
         if ( AnyError == 0 )
         {
            confirmValues1W20( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "anticipacionerrores.mant");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1W21914( )
   {
      /* Scan By routine */
      /* Using cursor T01W211 */
      pr_default.execute(9);
      RcdFound1914 = (short)(0) ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound1914 = (short)(1) ;
         A14562MAntId = T01W211_A14562MAntId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14562MAntId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14562MAntId), 10, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1W21914( )
   {
      /* Scan next routine */
      pr_default.readNext(9);
      RcdFound1914 = (short)(0) ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound1914 = (short)(1) ;
         A14562MAntId = T01W211_A14562MAntId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14562MAntId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14562MAntId), 10, 0));
      }
   }

   public void scanEnd1W21914( )
   {
      pr_default.close(9);
   }

   public void afterConfirm1W21914( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1W21914( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1W21914( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1W21914( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1W21914( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1W21914( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1W21914( )
   {
      edtMAntId_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMAntId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMAntId_Enabled), 5, 0), true);
      edtMAntEmprCo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMAntEmprCo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMAntEmprCo_Enabled), 5, 0), true);
      edtMAntCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMAntCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMAntCliCod_Enabled), 5, 0), true);
      edtMAntCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMAntCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMAntCliNom_Enabled), 5, 0), true);
      edtMAntArtCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMAntArtCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMAntArtCod_Enabled), 5, 0), true);
      edtMAntArtDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMAntArtDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMAntArtDsc_Enabled), 5, 0), true);
      edtMAntColNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMAntColNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMAntColNom_Enabled), 5, 0), true);
      edtMAntColNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMAntColNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMAntColNum_Enabled), 5, 0), true);
      edtMAntColCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMAntColCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMAntColCod_Enabled), 5, 0), true);
      edtMAntMaqCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMAntMaqCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMAntMaqCod_Enabled), 5, 0), true);
      edtMAntMaqDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMAntMaqDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMAntMaqDsc_Enabled), 5, 0), true);
      edtMAntTipMCo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMAntTipMCo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMAntTipMCo_Enabled), 5, 0), true);
      edtMAntTipMDs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMAntTipMDs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMAntTipMDs_Enabled), 5, 0), true);
      edtMAntKilPro_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMAntKilPro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMAntKilPro_Enabled), 5, 0), true);
      edtMAntKilReo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMAntKilReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMAntKilReo_Enabled), 5, 0), true);
      edtMAntPorc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMAntPorc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMAntPorc_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1W21914( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1W20( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.anticipacionerrores.mant", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.ltrimstr(AV7MAntId,10,0))}, new String[] {"Gx_mode","MAntId"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"MAnt");
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      forbiddenHiddens.add("MAntKilTot", localUtil.format( A14646MAntKilTot, "ZZZZZZZZ9.99"));
      forbiddenHiddens.add("MAntTkn", GXutil.rtrim( localUtil.format( A14563MAntTkn, "")));
      forbiddenHiddens.add("MAntUsu", GXutil.rtrim( localUtil.format( A14564MAntUsu, "")));
      forbiddenHiddens.add("MAntMetTot", localUtil.format( A14647MAntMetTot, "ZZZZZZZZ9.99"));
      forbiddenHiddens.add("MAntMetPro", localUtil.format( A14648MAntMetPro, "ZZZZZZZZ9.99"));
      forbiddenHiddens.add("MAntMetReo", localUtil.format( A14649MAntMetReo, "ZZZZZZZZ9.99"));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("anticipacionerrores\\mant:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z14562MAntId", GXutil.ltrim( localUtil.ntoc( Z14562MAntId, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14566MAntEmprCo", GXutil.rtrim( Z14566MAntEmprCo));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14565MAntCliCod", GXutil.ltrim( localUtil.ntoc( Z14565MAntCliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14611MAntCliNom", Z14611MAntCliNom);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14567MAntArtCod", GXutil.rtrim( Z14567MAntArtCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14613MAntArtDsc", Z14613MAntArtDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14623MAntColNom", GXutil.rtrim( Z14623MAntColNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14568MAntColNum", GXutil.ltrim( localUtil.ntoc( Z14568MAntColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14642MAntColCod", GXutil.ltrim( localUtil.ntoc( Z14642MAntColCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14570MAntMaqCod", GXutil.rtrim( Z14570MAntMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14610MAntMaqDsc", Z14610MAntMaqDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14569MAntTipMCo", GXutil.rtrim( Z14569MAntTipMCo));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14612MAntTipMDs", Z14612MAntTipMDs);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14646MAntKilTot", GXutil.ltrim( localUtil.ntoc( Z14646MAntKilTot, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14643MAntKilPro", GXutil.ltrim( localUtil.ntoc( Z14643MAntKilPro, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14644MAntKilReo", GXutil.ltrim( localUtil.ntoc( Z14644MAntKilReo, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14563MAntTkn", Z14563MAntTkn);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14564MAntUsu", GXutil.rtrim( Z14564MAntUsu));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14647MAntMetTot", GXutil.ltrim( localUtil.ntoc( Z14647MAntMetTot, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14648MAntMetPro", GXutil.ltrim( localUtil.ntoc( Z14648MAntMetPro, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14649MAntMetReo", GXutil.ltrim( localUtil.ntoc( Z14649MAntMetReo, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTRNCONTEXT", AV9TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTRNCONTEXT", AV9TrnContext);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTRNCONTEXT", getSecureSignedToken( "", AV9TrnContext));
      app.GxWebStd.gx_hidden_field( httpContext, "MANTKILTOT", GXutil.ltrim( localUtil.ntoc( A14646MAntKilTot, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MANTMETTOT", GXutil.ltrim( localUtil.ntoc( A14647MAntMetTot, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MANTMETREO", GXutil.ltrim( localUtil.ntoc( A14649MAntMetReo, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MANTMETPOR", GXutil.ltrim( localUtil.ntoc( A14650MantMetPor, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMANTID", GXutil.ltrim( localUtil.ntoc( AV7MAntId, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMANTID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV7MAntId), "ZZZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "MANTTKN", A14563MAntTkn);
      app.GxWebStd.gx_hidden_field( httpContext, "MANTUSU", GXutil.rtrim( A14564MAntUsu));
      app.GxWebStd.gx_hidden_field( httpContext, "MANTMETPRO", GXutil.ltrim( localUtil.ntoc( A14648MAntMetPro, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.anticipacionerrores.mant", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.ltrimstr(AV7MAntId,10,0))}, new String[] {"Gx_mode","MAntId"})  ;
   }

   public String getPgmname( )
   {
      return "AnticipacionErrores.MAnt" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "MAnt", "") ;
   }

   public void initializeNonKey1W21914( )
   {
      A14650MantMetPor = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A14650MantMetPor", GXutil.ltrimstr( A14650MantMetPor, 7, 2));
      A14645MAntPorc = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A14645MAntPorc", GXutil.ltrimstr( A14645MAntPorc, 7, 2));
      A14566MAntEmprCo = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14566MAntEmprCo", A14566MAntEmprCo);
      A14565MAntCliCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14565MAntCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14565MAntCliCod), 6, 0));
      A14611MAntCliNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14611MAntCliNom", A14611MAntCliNom);
      A14567MAntArtCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14567MAntArtCod", A14567MAntArtCod);
      A14613MAntArtDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14613MAntArtDsc", A14613MAntArtDsc);
      A14623MAntColNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14623MAntColNom", A14623MAntColNom);
      A14568MAntColNum = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14568MAntColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14568MAntColNum), 6, 0));
      A14642MAntColCod = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A14642MAntColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14642MAntColCod), 2, 0));
      A14570MAntMaqCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14570MAntMaqCod", A14570MAntMaqCod);
      A14610MAntMaqDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14610MAntMaqDsc", A14610MAntMaqDsc);
      A14569MAntTipMCo = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14569MAntTipMCo", A14569MAntTipMCo);
      A14612MAntTipMDs = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14612MAntTipMDs", A14612MAntTipMDs);
      A14646MAntKilTot = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A14646MAntKilTot", GXutil.ltrimstr( A14646MAntKilTot, 12, 2));
      A14643MAntKilPro = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A14643MAntKilPro", GXutil.ltrimstr( A14643MAntKilPro, 12, 2));
      A14644MAntKilReo = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A14644MAntKilReo", GXutil.ltrimstr( A14644MAntKilReo, 12, 2));
      A14563MAntTkn = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14563MAntTkn", A14563MAntTkn);
      A14564MAntUsu = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14564MAntUsu", A14564MAntUsu);
      A14647MAntMetTot = DecimalUtil.ZERO ;
      n14647MAntMetTot = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14647MAntMetTot", GXutil.ltrimstr( A14647MAntMetTot, 12, 2));
      A14648MAntMetPro = DecimalUtil.ZERO ;
      n14648MAntMetPro = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14648MAntMetPro", GXutil.ltrimstr( A14648MAntMetPro, 12, 2));
      A14649MAntMetReo = DecimalUtil.ZERO ;
      n14649MAntMetReo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14649MAntMetReo", GXutil.ltrimstr( A14649MAntMetReo, 12, 2));
      Z14566MAntEmprCo = "" ;
      Z14565MAntCliCod = 0 ;
      Z14611MAntCliNom = "" ;
      Z14567MAntArtCod = "" ;
      Z14613MAntArtDsc = "" ;
      Z14623MAntColNom = "" ;
      Z14568MAntColNum = 0 ;
      Z14642MAntColCod = (byte)(0) ;
      Z14570MAntMaqCod = "" ;
      Z14610MAntMaqDsc = "" ;
      Z14569MAntTipMCo = "" ;
      Z14612MAntTipMDs = "" ;
      Z14646MAntKilTot = DecimalUtil.ZERO ;
      Z14643MAntKilPro = DecimalUtil.ZERO ;
      Z14644MAntKilReo = DecimalUtil.ZERO ;
      Z14563MAntTkn = "" ;
      Z14564MAntUsu = "" ;
      Z14647MAntMetTot = DecimalUtil.ZERO ;
      Z14648MAntMetPro = DecimalUtil.ZERO ;
      Z14649MAntMetReo = DecimalUtil.ZERO ;
   }

   public void initAll1W21914( )
   {
      A14562MAntId = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14562MAntId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14562MAntId), 10, 0));
      initializeNonKey1W21914( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116105776", true, true);
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
      httpContext.AddJavascriptSource("anticipacionerrores/mant.js", "?202682116105776", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      edtMAntId_Internalname = "MANTID" ;
      edtMAntEmprCo_Internalname = "MANTEMPRCO" ;
      edtMAntCliCod_Internalname = "MANTCLICOD" ;
      edtMAntCliNom_Internalname = "MANTCLINOM" ;
      edtMAntArtCod_Internalname = "MANTARTCOD" ;
      edtMAntArtDsc_Internalname = "MANTARTDSC" ;
      edtMAntColNom_Internalname = "MANTCOLNOM" ;
      edtMAntColNum_Internalname = "MANTCOLNUM" ;
      edtMAntColCod_Internalname = "MANTCOLCOD" ;
      edtMAntMaqCod_Internalname = "MANTMAQCOD" ;
      edtMAntMaqDsc_Internalname = "MANTMAQDSC" ;
      edtMAntTipMCo_Internalname = "MANTTIPMCO" ;
      edtMAntTipMDs_Internalname = "MANTTIPMDS" ;
      edtMAntKilPro_Internalname = "MANTKILPRO" ;
      edtMAntKilReo_Internalname = "MANTKILREO" ;
      edtMAntPorc_Internalname = "MANTPORC" ;
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
      Form.setCaption( httpContext.getMessage( "MAnt", "") );
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      bttBtntrn_delete_Enabled = 0 ;
      bttBtntrn_delete_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      edtMAntPorc_Jsonclick = "" ;
      edtMAntPorc_Enabled = 0 ;
      edtMAntKilReo_Jsonclick = "" ;
      edtMAntKilReo_Enabled = 1 ;
      edtMAntKilPro_Jsonclick = "" ;
      edtMAntKilPro_Enabled = 1 ;
      edtMAntTipMDs_Enabled = 1 ;
      edtMAntTipMCo_Jsonclick = "" ;
      edtMAntTipMCo_Enabled = 1 ;
      edtMAntMaqDsc_Enabled = 1 ;
      edtMAntMaqCod_Jsonclick = "" ;
      edtMAntMaqCod_Enabled = 1 ;
      edtMAntColCod_Jsonclick = "" ;
      edtMAntColCod_Enabled = 1 ;
      edtMAntColNum_Jsonclick = "" ;
      edtMAntColNum_Enabled = 1 ;
      edtMAntColNom_Jsonclick = "" ;
      edtMAntColNom_Enabled = 1 ;
      edtMAntArtDsc_Enabled = 1 ;
      edtMAntArtCod_Jsonclick = "" ;
      edtMAntArtCod_Enabled = 1 ;
      edtMAntCliNom_Enabled = 1 ;
      edtMAntCliCod_Jsonclick = "" ;
      edtMAntCliCod_Enabled = 1 ;
      edtMAntEmprCo_Jsonclick = "" ;
      edtMAntEmprCo_Enabled = 1 ;
      edtMAntId_Jsonclick = "" ;
      edtMAntId_Enabled = 1 ;
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV7MAntId',fld:'vMANTID',pic:'ZZZZZZZZZ9',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV9TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true},{av:'AV7MAntId',fld:'vMANTID',pic:'ZZZZZZZZZ9',hsh:true},{av:'A14646MAntKilTot',fld:'MANTKILTOT',pic:'ZZZZZZZZ9.99'},{av:'A14563MAntTkn',fld:'MANTTKN',pic:''},{av:'A14564MAntUsu',fld:'MANTUSU',pic:''},{av:'A14647MAntMetTot',fld:'MANTMETTOT',pic:'ZZZZZZZZ9.99'},{av:'A14648MAntMetPro',fld:'MANTMETPRO',pic:'ZZZZZZZZ9.99'},{av:'A14649MAntMetReo',fld:'MANTMETREO',pic:'ZZZZZZZZ9.99'}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e121W22',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV9TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true}]");
      setEventMetadata("AFTER TRN",",oparms:[]}");
      setEventMetadata("VALID_MANTID","{handler:'valid_Mantid',iparms:[]");
      setEventMetadata("VALID_MANTID",",oparms:[]}");
      setEventMetadata("VALID_MANTKILREO","{handler:'valid_Mantkilreo',iparms:[]");
      setEventMetadata("VALID_MANTKILREO",",oparms:[]}");
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
      Z14566MAntEmprCo = "" ;
      Z14611MAntCliNom = "" ;
      Z14567MAntArtCod = "" ;
      Z14613MAntArtDsc = "" ;
      Z14623MAntColNom = "" ;
      Z14570MAntMaqCod = "" ;
      Z14610MAntMaqDsc = "" ;
      Z14569MAntTipMCo = "" ;
      Z14612MAntTipMDs = "" ;
      Z14646MAntKilTot = DecimalUtil.ZERO ;
      Z14643MAntKilPro = DecimalUtil.ZERO ;
      Z14644MAntKilReo = DecimalUtil.ZERO ;
      Z14563MAntTkn = "" ;
      Z14564MAntUsu = "" ;
      Z14647MAntMetTot = DecimalUtil.ZERO ;
      Z14648MAntMetPro = DecimalUtil.ZERO ;
      Z14649MAntMetReo = DecimalUtil.ZERO ;
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
      A14566MAntEmprCo = "" ;
      A14611MAntCliNom = "" ;
      A14567MAntArtCod = "" ;
      A14613MAntArtDsc = "" ;
      A14623MAntColNom = "" ;
      A14570MAntMaqCod = "" ;
      A14610MAntMaqDsc = "" ;
      A14569MAntTipMCo = "" ;
      A14612MAntTipMDs = "" ;
      A14643MAntKilPro = DecimalUtil.ZERO ;
      A14644MAntKilReo = DecimalUtil.ZERO ;
      A14645MAntPorc = DecimalUtil.ZERO ;
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      AV11Pgmname = "" ;
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      A14646MAntKilTot = DecimalUtil.ZERO ;
      A14563MAntTkn = "" ;
      A14564MAntUsu = "" ;
      A14647MAntMetTot = DecimalUtil.ZERO ;
      A14648MAntMetPro = DecimalUtil.ZERO ;
      A14649MAntMetReo = DecimalUtil.ZERO ;
      A14650MantMetPor = DecimalUtil.ZERO ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      Datamonjs_Objectcall = "" ;
      Datamonjs_Class = "" ;
      Datamonjs_Paramstr = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode1914 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      AV12Station = "" ;
      GXt_char1 = "" ;
      AV13Emprcod = "" ;
      GXv_char2 = new String[1] ;
      AV14Emprnom = "" ;
      GXv_char3 = new String[1] ;
      AV15Usurcod = "" ;
      GXv_char4 = new String[1] ;
      AV8WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext5 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV9TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV10WebSession = httpContext.getWebSession();
      T01W24_A14562MAntId = new long[1] ;
      T01W24_A14566MAntEmprCo = new String[] {""} ;
      T01W24_A14565MAntCliCod = new int[1] ;
      T01W24_A14611MAntCliNom = new String[] {""} ;
      T01W24_A14567MAntArtCod = new String[] {""} ;
      T01W24_A14613MAntArtDsc = new String[] {""} ;
      T01W24_A14623MAntColNom = new String[] {""} ;
      T01W24_A14568MAntColNum = new int[1] ;
      T01W24_A14642MAntColCod = new byte[1] ;
      T01W24_A14570MAntMaqCod = new String[] {""} ;
      T01W24_A14610MAntMaqDsc = new String[] {""} ;
      T01W24_A14569MAntTipMCo = new String[] {""} ;
      T01W24_A14612MAntTipMDs = new String[] {""} ;
      T01W24_A14646MAntKilTot = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01W24_A14643MAntKilPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01W24_A14644MAntKilReo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01W24_A14563MAntTkn = new String[] {""} ;
      T01W24_A14564MAntUsu = new String[] {""} ;
      T01W24_A14647MAntMetTot = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01W24_n14647MAntMetTot = new boolean[] {false} ;
      T01W24_A14648MAntMetPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01W24_n14648MAntMetPro = new boolean[] {false} ;
      T01W24_A14649MAntMetReo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01W24_n14649MAntMetReo = new boolean[] {false} ;
      T01W25_A14562MAntId = new long[1] ;
      T01W23_A14562MAntId = new long[1] ;
      T01W23_A14566MAntEmprCo = new String[] {""} ;
      T01W23_A14565MAntCliCod = new int[1] ;
      T01W23_A14611MAntCliNom = new String[] {""} ;
      T01W23_A14567MAntArtCod = new String[] {""} ;
      T01W23_A14613MAntArtDsc = new String[] {""} ;
      T01W23_A14623MAntColNom = new String[] {""} ;
      T01W23_A14568MAntColNum = new int[1] ;
      T01W23_A14642MAntColCod = new byte[1] ;
      T01W23_A14570MAntMaqCod = new String[] {""} ;
      T01W23_A14610MAntMaqDsc = new String[] {""} ;
      T01W23_A14569MAntTipMCo = new String[] {""} ;
      T01W23_A14612MAntTipMDs = new String[] {""} ;
      T01W23_A14646MAntKilTot = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01W23_A14643MAntKilPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01W23_A14644MAntKilReo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01W23_A14563MAntTkn = new String[] {""} ;
      T01W23_A14564MAntUsu = new String[] {""} ;
      T01W23_A14647MAntMetTot = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01W23_n14647MAntMetTot = new boolean[] {false} ;
      T01W23_A14648MAntMetPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01W23_n14648MAntMetPro = new boolean[] {false} ;
      T01W23_A14649MAntMetReo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01W23_n14649MAntMetReo = new boolean[] {false} ;
      T01W26_A14562MAntId = new long[1] ;
      T01W27_A14562MAntId = new long[1] ;
      T01W22_A14562MAntId = new long[1] ;
      T01W22_A14566MAntEmprCo = new String[] {""} ;
      T01W22_A14565MAntCliCod = new int[1] ;
      T01W22_A14611MAntCliNom = new String[] {""} ;
      T01W22_A14567MAntArtCod = new String[] {""} ;
      T01W22_A14613MAntArtDsc = new String[] {""} ;
      T01W22_A14623MAntColNom = new String[] {""} ;
      T01W22_A14568MAntColNum = new int[1] ;
      T01W22_A14642MAntColCod = new byte[1] ;
      T01W22_A14570MAntMaqCod = new String[] {""} ;
      T01W22_A14610MAntMaqDsc = new String[] {""} ;
      T01W22_A14569MAntTipMCo = new String[] {""} ;
      T01W22_A14612MAntTipMDs = new String[] {""} ;
      T01W22_A14646MAntKilTot = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01W22_A14643MAntKilPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01W22_A14644MAntKilReo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01W22_A14563MAntTkn = new String[] {""} ;
      T01W22_A14564MAntUsu = new String[] {""} ;
      T01W22_A14647MAntMetTot = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01W22_n14647MAntMetTot = new boolean[] {false} ;
      T01W22_A14648MAntMetPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01W22_n14648MAntMetPro = new boolean[] {false} ;
      T01W22_A14649MAntMetReo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01W22_n14649MAntMetReo = new boolean[] {false} ;
      T01W211_A14562MAntId = new long[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.anticipacionerrores.mant__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.anticipacionerrores.mant__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.anticipacionerrores.mant__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.anticipacionerrores.mant__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.anticipacionerrores.mant__default(),
         new Object[] {
             new Object[] {
            T01W22_A14562MAntId, T01W22_A14566MAntEmprCo, T01W22_A14565MAntCliCod, T01W22_A14611MAntCliNom, T01W22_A14567MAntArtCod, T01W22_A14613MAntArtDsc, T01W22_A14623MAntColNom, T01W22_A14568MAntColNum, T01W22_A14642MAntColCod, T01W22_A14570MAntMaqCod,
            T01W22_A14610MAntMaqDsc, T01W22_A14569MAntTipMCo, T01W22_A14612MAntTipMDs, T01W22_A14646MAntKilTot, T01W22_A14643MAntKilPro, T01W22_A14644MAntKilReo, T01W22_A14563MAntTkn, T01W22_A14564MAntUsu, T01W22_A14647MAntMetTot, T01W22_n14647MAntMetTot,
            T01W22_A14648MAntMetPro, T01W22_n14648MAntMetPro, T01W22_A14649MAntMetReo, T01W22_n14649MAntMetReo
            }
            , new Object[] {
            T01W23_A14562MAntId, T01W23_A14566MAntEmprCo, T01W23_A14565MAntCliCod, T01W23_A14611MAntCliNom, T01W23_A14567MAntArtCod, T01W23_A14613MAntArtDsc, T01W23_A14623MAntColNom, T01W23_A14568MAntColNum, T01W23_A14642MAntColCod, T01W23_A14570MAntMaqCod,
            T01W23_A14610MAntMaqDsc, T01W23_A14569MAntTipMCo, T01W23_A14612MAntTipMDs, T01W23_A14646MAntKilTot, T01W23_A14643MAntKilPro, T01W23_A14644MAntKilReo, T01W23_A14563MAntTkn, T01W23_A14564MAntUsu, T01W23_A14647MAntMetTot, T01W23_n14647MAntMetTot,
            T01W23_A14648MAntMetPro, T01W23_n14648MAntMetPro, T01W23_A14649MAntMetReo, T01W23_n14649MAntMetReo
            }
            , new Object[] {
            T01W24_A14562MAntId, T01W24_A14566MAntEmprCo, T01W24_A14565MAntCliCod, T01W24_A14611MAntCliNom, T01W24_A14567MAntArtCod, T01W24_A14613MAntArtDsc, T01W24_A14623MAntColNom, T01W24_A14568MAntColNum, T01W24_A14642MAntColCod, T01W24_A14570MAntMaqCod,
            T01W24_A14610MAntMaqDsc, T01W24_A14569MAntTipMCo, T01W24_A14612MAntTipMDs, T01W24_A14646MAntKilTot, T01W24_A14643MAntKilPro, T01W24_A14644MAntKilReo, T01W24_A14563MAntTkn, T01W24_A14564MAntUsu, T01W24_A14647MAntMetTot, T01W24_n14647MAntMetTot,
            T01W24_A14648MAntMetPro, T01W24_n14648MAntMetPro, T01W24_A14649MAntMetReo, T01W24_n14649MAntMetReo
            }
            , new Object[] {
            T01W25_A14562MAntId
            }
            , new Object[] {
            T01W26_A14562MAntId
            }
            , new Object[] {
            T01W27_A14562MAntId
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01W211_A14562MAntId
            }
         }
      );
      AV11Pgmname = "AnticipacionErrores.MAnt" ;
   }

   private byte Z14642MAntColCod ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A14642MAntColCod ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound1914 ;
   private short nIsDirty_1914 ;
   private int Z14565MAntCliCod ;
   private int Z14568MAntColNum ;
   private int trnEnded ;
   private int edtMAntId_Enabled ;
   private int edtMAntEmprCo_Enabled ;
   private int A14565MAntCliCod ;
   private int edtMAntCliCod_Enabled ;
   private int edtMAntCliNom_Enabled ;
   private int edtMAntArtCod_Enabled ;
   private int edtMAntArtDsc_Enabled ;
   private int edtMAntColNom_Enabled ;
   private int A14568MAntColNum ;
   private int edtMAntColNum_Enabled ;
   private int edtMAntColCod_Enabled ;
   private int edtMAntMaqCod_Enabled ;
   private int edtMAntMaqDsc_Enabled ;
   private int edtMAntTipMCo_Enabled ;
   private int edtMAntTipMDs_Enabled ;
   private int edtMAntKilPro_Enabled ;
   private int edtMAntKilReo_Enabled ;
   private int edtMAntPorc_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int edtavPgmname_Enabled ;
   private int Datamonjs_Gxcontroltype ;
   private int GX_JID ;
   private int idxLst ;
   private long wcpOAV7MAntId ;
   private long Z14562MAntId ;
   private long AV7MAntId ;
   private long A14562MAntId ;
   private java.math.BigDecimal Z14646MAntKilTot ;
   private java.math.BigDecimal Z14643MAntKilPro ;
   private java.math.BigDecimal Z14644MAntKilReo ;
   private java.math.BigDecimal Z14647MAntMetTot ;
   private java.math.BigDecimal Z14648MAntMetPro ;
   private java.math.BigDecimal Z14649MAntMetReo ;
   private java.math.BigDecimal A14643MAntKilPro ;
   private java.math.BigDecimal A14644MAntKilReo ;
   private java.math.BigDecimal A14645MAntPorc ;
   private java.math.BigDecimal A14646MAntKilTot ;
   private java.math.BigDecimal A14647MAntMetTot ;
   private java.math.BigDecimal A14648MAntMetPro ;
   private java.math.BigDecimal A14649MAntMetReo ;
   private java.math.BigDecimal A14650MantMetPor ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String Z14566MAntEmprCo ;
   private String Z14567MAntArtCod ;
   private String Z14623MAntColNom ;
   private String Z14570MAntMaqCod ;
   private String Z14569MAntTipMCo ;
   private String Z14564MAntUsu ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String Gx_mode ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtMAntId_Internalname ;
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
   private String edtMAntId_Jsonclick ;
   private String edtMAntEmprCo_Internalname ;
   private String A14566MAntEmprCo ;
   private String edtMAntEmprCo_Jsonclick ;
   private String edtMAntCliCod_Internalname ;
   private String edtMAntCliCod_Jsonclick ;
   private String edtMAntCliNom_Internalname ;
   private String edtMAntArtCod_Internalname ;
   private String A14567MAntArtCod ;
   private String edtMAntArtCod_Jsonclick ;
   private String edtMAntArtDsc_Internalname ;
   private String edtMAntColNom_Internalname ;
   private String A14623MAntColNom ;
   private String edtMAntColNom_Jsonclick ;
   private String edtMAntColNum_Internalname ;
   private String edtMAntColNum_Jsonclick ;
   private String edtMAntColCod_Internalname ;
   private String edtMAntColCod_Jsonclick ;
   private String edtMAntMaqCod_Internalname ;
   private String A14570MAntMaqCod ;
   private String edtMAntMaqCod_Jsonclick ;
   private String edtMAntMaqDsc_Internalname ;
   private String edtMAntTipMCo_Internalname ;
   private String A14569MAntTipMCo ;
   private String edtMAntTipMCo_Jsonclick ;
   private String edtMAntTipMDs_Internalname ;
   private String edtMAntKilPro_Internalname ;
   private String edtMAntKilPro_Jsonclick ;
   private String edtMAntKilReo_Internalname ;
   private String edtMAntKilReo_Jsonclick ;
   private String edtMAntPorc_Internalname ;
   private String edtMAntPorc_Jsonclick ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String edtavPgmname_Internalname ;
   private String AV11Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String A14564MAntUsu ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String Datamonjs_Objectcall ;
   private String Datamonjs_Class ;
   private String Datamonjs_Paramstr ;
   private String hsh ;
   private String sMode1914 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String AV12Station ;
   private String GXt_char1 ;
   private String AV13Emprcod ;
   private String GXv_char2[] ;
   private String AV14Emprnom ;
   private String GXv_char3[] ;
   private String AV15Usurcod ;
   private String GXv_char4[] ;
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
   private boolean n14647MAntMetTot ;
   private boolean n14648MAntMetPro ;
   private boolean n14649MAntMetReo ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean Datamonjs_Enabled ;
   private boolean Datamonjs_Visible ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private String Z14611MAntCliNom ;
   private String Z14613MAntArtDsc ;
   private String Z14610MAntMaqDsc ;
   private String Z14612MAntTipMDs ;
   private String Z14563MAntTkn ;
   private String A14611MAntCliNom ;
   private String A14613MAntArtDsc ;
   private String A14610MAntMaqDsc ;
   private String A14612MAntTipMDs ;
   private String A14563MAntTkn ;
   private com.genexus.webpanels.WebSession AV10WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private long[] T01W24_A14562MAntId ;
   private String[] T01W24_A14566MAntEmprCo ;
   private int[] T01W24_A14565MAntCliCod ;
   private String[] T01W24_A14611MAntCliNom ;
   private String[] T01W24_A14567MAntArtCod ;
   private String[] T01W24_A14613MAntArtDsc ;
   private String[] T01W24_A14623MAntColNom ;
   private int[] T01W24_A14568MAntColNum ;
   private byte[] T01W24_A14642MAntColCod ;
   private String[] T01W24_A14570MAntMaqCod ;
   private String[] T01W24_A14610MAntMaqDsc ;
   private String[] T01W24_A14569MAntTipMCo ;
   private String[] T01W24_A14612MAntTipMDs ;
   private java.math.BigDecimal[] T01W24_A14646MAntKilTot ;
   private java.math.BigDecimal[] T01W24_A14643MAntKilPro ;
   private java.math.BigDecimal[] T01W24_A14644MAntKilReo ;
   private String[] T01W24_A14563MAntTkn ;
   private String[] T01W24_A14564MAntUsu ;
   private java.math.BigDecimal[] T01W24_A14647MAntMetTot ;
   private boolean[] T01W24_n14647MAntMetTot ;
   private java.math.BigDecimal[] T01W24_A14648MAntMetPro ;
   private boolean[] T01W24_n14648MAntMetPro ;
   private java.math.BigDecimal[] T01W24_A14649MAntMetReo ;
   private boolean[] T01W24_n14649MAntMetReo ;
   private long[] T01W25_A14562MAntId ;
   private long[] T01W23_A14562MAntId ;
   private String[] T01W23_A14566MAntEmprCo ;
   private int[] T01W23_A14565MAntCliCod ;
   private String[] T01W23_A14611MAntCliNom ;
   private String[] T01W23_A14567MAntArtCod ;
   private String[] T01W23_A14613MAntArtDsc ;
   private String[] T01W23_A14623MAntColNom ;
   private int[] T01W23_A14568MAntColNum ;
   private byte[] T01W23_A14642MAntColCod ;
   private String[] T01W23_A14570MAntMaqCod ;
   private String[] T01W23_A14610MAntMaqDsc ;
   private String[] T01W23_A14569MAntTipMCo ;
   private String[] T01W23_A14612MAntTipMDs ;
   private java.math.BigDecimal[] T01W23_A14646MAntKilTot ;
   private java.math.BigDecimal[] T01W23_A14643MAntKilPro ;
   private java.math.BigDecimal[] T01W23_A14644MAntKilReo ;
   private String[] T01W23_A14563MAntTkn ;
   private String[] T01W23_A14564MAntUsu ;
   private java.math.BigDecimal[] T01W23_A14647MAntMetTot ;
   private boolean[] T01W23_n14647MAntMetTot ;
   private java.math.BigDecimal[] T01W23_A14648MAntMetPro ;
   private boolean[] T01W23_n14648MAntMetPro ;
   private java.math.BigDecimal[] T01W23_A14649MAntMetReo ;
   private boolean[] T01W23_n14649MAntMetReo ;
   private long[] T01W26_A14562MAntId ;
   private long[] T01W27_A14562MAntId ;
   private long[] T01W22_A14562MAntId ;
   private String[] T01W22_A14566MAntEmprCo ;
   private int[] T01W22_A14565MAntCliCod ;
   private String[] T01W22_A14611MAntCliNom ;
   private String[] T01W22_A14567MAntArtCod ;
   private String[] T01W22_A14613MAntArtDsc ;
   private String[] T01W22_A14623MAntColNom ;
   private int[] T01W22_A14568MAntColNum ;
   private byte[] T01W22_A14642MAntColCod ;
   private String[] T01W22_A14570MAntMaqCod ;
   private String[] T01W22_A14610MAntMaqDsc ;
   private String[] T01W22_A14569MAntTipMCo ;
   private String[] T01W22_A14612MAntTipMDs ;
   private java.math.BigDecimal[] T01W22_A14646MAntKilTot ;
   private java.math.BigDecimal[] T01W22_A14643MAntKilPro ;
   private java.math.BigDecimal[] T01W22_A14644MAntKilReo ;
   private String[] T01W22_A14563MAntTkn ;
   private String[] T01W22_A14564MAntUsu ;
   private java.math.BigDecimal[] T01W22_A14647MAntMetTot ;
   private boolean[] T01W22_n14647MAntMetTot ;
   private java.math.BigDecimal[] T01W22_A14648MAntMetPro ;
   private boolean[] T01W22_n14648MAntMetPro ;
   private java.math.BigDecimal[] T01W22_A14649MAntMetReo ;
   private boolean[] T01W22_n14649MAntMetReo ;
   private long[] T01W211_A14562MAntId ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private app.wwpbaseobjects.SdtWWPContext AV8WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext5[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV9TrnContext ;
}

final  class mant__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class mant__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class mant__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class mant__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class mant__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01W22", "SELECT MAntId, MAntEmprCo, MAntCliCod, MAntCliNom, MAntArtCod, MAntArtDsc, MAntColNom, MAntColNum, MAntColCod, MAntMaqCod, MAntMaqDsc, MAntTipMCo, MAntTipMDs, MAntKilTot, MAntKilPro, MAntKilReo, MAntTkn, MAntUsu, MAntMetTot, MAntMetPro, MAntMetReo FROM MAnt WHERE MAntId = ?  FOR UPDATE OF MAntEmprCo, MAntCliCod, MAntCliNom, MAntArtCod, MAntArtDsc, MAntColNom, MAntColNum, MAntColCod, MAntMaqCod, MAntMaqDsc, MAntTipMCo, MAntTipMDs, MAntKilTot, MAntKilPro, MAntKilReo, MAntTkn, MAntUsu, MAntMetTot, MAntMetPro, MAntMetReo NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01W23", "SELECT MAntId, MAntEmprCo, MAntCliCod, MAntCliNom, MAntArtCod, MAntArtDsc, MAntColNom, MAntColNum, MAntColCod, MAntMaqCod, MAntMaqDsc, MAntTipMCo, MAntTipMDs, MAntKilTot, MAntKilPro, MAntKilReo, MAntTkn, MAntUsu, MAntMetTot, MAntMetPro, MAntMetReo FROM MAnt WHERE MAntId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01W24", "SELECT /*+ FIRST_ROWS(100) */ TM1.MAntId, TM1.MAntEmprCo, TM1.MAntCliCod, TM1.MAntCliNom, TM1.MAntArtCod, TM1.MAntArtDsc, TM1.MAntColNom, TM1.MAntColNum, TM1.MAntColCod, TM1.MAntMaqCod, TM1.MAntMaqDsc, TM1.MAntTipMCo, TM1.MAntTipMDs, TM1.MAntKilTot, TM1.MAntKilPro, TM1.MAntKilReo, TM1.MAntTkn, TM1.MAntUsu, TM1.MAntMetTot, TM1.MAntMetPro, TM1.MAntMetReo FROM MAnt TM1 WHERE TM1.MAntId = ? ORDER BY TM1.MAntId ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01W25", "SELECT /*+ FIRST_ROWS(1) */ MAntId FROM MAnt WHERE MAntId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01W26", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ MAntId FROM MAnt WHERE ( MAntId > ?) ORDER BY MAntId) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01W27", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ MAntId FROM MAnt WHERE ( MAntId < ?) ORDER BY MAntId DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01W28", "INSERT INTO MAnt(MAntId, MAntEmprCo, MAntCliCod, MAntCliNom, MAntArtCod, MAntArtDsc, MAntColNom, MAntColNum, MAntColCod, MAntMaqCod, MAntMaqDsc, MAntTipMCo, MAntTipMDs, MAntKilTot, MAntKilPro, MAntKilReo, MAntTkn, MAntUsu, MAntMetTot, MAntMetPro, MAntMetReo) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "MAnt")
         ,new UpdateCursor("T01W29", "UPDATE MAnt SET MAntEmprCo=?, MAntCliCod=?, MAntCliNom=?, MAntArtCod=?, MAntArtDsc=?, MAntColNom=?, MAntColNum=?, MAntColCod=?, MAntMaqCod=?, MAntMaqDsc=?, MAntTipMCo=?, MAntTipMDs=?, MAntKilTot=?, MAntKilPro=?, MAntKilReo=?, MAntTkn=?, MAntUsu=?, MAntMetTot=?, MAntMetPro=?, MAntMetReo=?  WHERE MAntId = ?", GX_NOMASK, "MAnt")
         ,new UpdateCursor("T01W210", "DELETE FROM MAnt  WHERE MAntId = ?", GX_NOMASK, "MAnt")
         ,new ForEachCursor("T01W211", "SELECT /*+ FIRST_ROWS(100) */ MAntId FROM MAnt ORDER BY MAntId ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((String[]) buf[5])[0] = rslt.getVarchar(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 13);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 6);
               ((String[]) buf[10])[0] = rslt.getVarchar(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 4);
               ((String[]) buf[12])[0] = rslt.getVarchar(13);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(14,2);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(15,2);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(16,2);
               ((String[]) buf[16])[0] = rslt.getVarchar(17);
               ((String[]) buf[17])[0] = rslt.getString(18, 8);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(19,2);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(20,2);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(21,2);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((String[]) buf[5])[0] = rslt.getVarchar(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 13);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 6);
               ((String[]) buf[10])[0] = rslt.getVarchar(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 4);
               ((String[]) buf[12])[0] = rslt.getVarchar(13);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(14,2);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(15,2);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(16,2);
               ((String[]) buf[16])[0] = rslt.getVarchar(17);
               ((String[]) buf[17])[0] = rslt.getString(18, 8);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(19,2);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(20,2);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(21,2);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               return;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((String[]) buf[5])[0] = rslt.getVarchar(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 13);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 6);
               ((String[]) buf[10])[0] = rslt.getVarchar(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 4);
               ((String[]) buf[12])[0] = rslt.getVarchar(13);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(14,2);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(15,2);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(16,2);
               ((String[]) buf[16])[0] = rslt.getVarchar(17);
               ((String[]) buf[17])[0] = rslt.getString(18, 8);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(19,2);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(20,2);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(21,2);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
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
               stmt.setVarchar(4, (String)parms[3], 255, false);
               stmt.setString(5, (String)parms[4], 16);
               stmt.setVarchar(6, (String)parms[5], 255, false);
               stmt.setString(7, (String)parms[6], 13);
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setByte(9, ((Number) parms[8]).byteValue());
               stmt.setString(10, (String)parms[9], 6);
               stmt.setVarchar(11, (String)parms[10], 255, false);
               stmt.setString(12, (String)parms[11], 4);
               stmt.setVarchar(13, (String)parms[12], 255, false);
               stmt.setBigDecimal(14, (java.math.BigDecimal)parms[13], 2);
               stmt.setBigDecimal(15, (java.math.BigDecimal)parms[14], 2);
               stmt.setBigDecimal(16, (java.math.BigDecimal)parms[15], 2);
               stmt.setVarchar(17, (String)parms[16], 256, false);
               stmt.setString(18, (String)parms[17], 8);
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(19, (java.math.BigDecimal)parms[19], 2);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(20, (java.math.BigDecimal)parms[21], 2);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(21, (java.math.BigDecimal)parms[23], 2);
               }
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setVarchar(3, (String)parms[2], 255, false);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setVarchar(5, (String)parms[4], 255, false);
               stmt.setString(6, (String)parms[5], 13);
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               stmt.setString(9, (String)parms[8], 6);
               stmt.setVarchar(10, (String)parms[9], 255, false);
               stmt.setString(11, (String)parms[10], 4);
               stmt.setVarchar(12, (String)parms[11], 255, false);
               stmt.setBigDecimal(13, (java.math.BigDecimal)parms[12], 2);
               stmt.setBigDecimal(14, (java.math.BigDecimal)parms[13], 2);
               stmt.setBigDecimal(15, (java.math.BigDecimal)parms[14], 2);
               stmt.setVarchar(16, (String)parms[15], 256, false);
               stmt.setString(17, (String)parms[16], 8);
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(18, (java.math.BigDecimal)parms[18], 2);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(19, (java.math.BigDecimal)parms[20], 2);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(20, (java.math.BigDecimal)parms[22], 2);
               }
               stmt.setLong(21, ((Number) parms[23]).longValue());
               return;
            case 8 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
      }
   }

}

