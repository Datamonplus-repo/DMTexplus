package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tturnos_impl extends GXDataArea
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
            AV25EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV25EmprCod", AV25EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV25EmprCod, "@!"))));
            AV26TurnCod = (byte)(GXutil.lval( httpContext.GetPar( "TurnCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26TurnCod", GXutil.str( AV26TurnCod, 1, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTURNCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV26TurnCod), "9")));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "TURNOS", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtTurnCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public tturnos_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tturnos_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tturnos_impl.class ));
   }

   public tturnos_impl( int remoteHandle ,
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtTurnCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtTurnCod_Internalname, httpContext.getMessage( "Turno", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTurnCod_Internalname, GXutil.ltrim( localUtil.ntoc( A1161TurnCod, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1161TurnCod), "9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,22);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTurnCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtTurnCod_Enabled, 1, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTURNOS.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Control Group */
      app.GxWebStd.gx_group_start( httpContext, grpUnnamedgroup2_Internalname, httpContext.getMessage( "Inicio", ""), 1, 0, "px", 0, "px", "Group", "", "HLP_TTURNOS.htm");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtTurnHin_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtTurnHin_Internalname, httpContext.getMessage( "Hora", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTurnHin_Internalname, GXutil.ltrim( localUtil.ntoc( A1162TurnHin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTurnHin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1162TurnHin), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A1162TurnHin), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,31);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTurnHin_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtTurnHin_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTURNOS.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtTurnMin_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtTurnMin_Internalname, httpContext.getMessage( "Minutos", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 35,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTurnMin_Internalname, GXutil.ltrim( localUtil.ntoc( A1163TurnMin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTurnMin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1163TurnMin), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A1163TurnMin), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,35);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTurnMin_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtTurnMin_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTURNOS.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      httpContext.writeText( "</fieldset>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Control Group */
      app.GxWebStd.gx_group_start( httpContext, grpUnnamedgroup4_Internalname, httpContext.getMessage( "Fin", ""), 1, 0, "px", 0, "px", "Group", "", "HLP_TTURNOS.htm");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtTurnHfi_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtTurnHfi_Internalname, httpContext.getMessage( "Hora", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTurnHfi_Internalname, GXutil.ltrim( localUtil.ntoc( A1164TurnHfi, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTurnHfi_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1164TurnHfi), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A1164TurnHfi), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,44);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTurnHfi_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtTurnHfi_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTURNOS.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtTurnMfi_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtTurnMfi_Internalname, httpContext.getMessage( "MInutos", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 48,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTurnMfi_Internalname, GXutil.ltrim( localUtil.ntoc( A1165TurnMfi, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTurnMfi_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1165TurnMfi), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A1165TurnMfi), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,48);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTurnMfi_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtTurnMfi_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTURNOS.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      httpContext.writeText( "</fieldset>") ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTURNOS.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 55,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTURNOS.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 57,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTURNOS.htm");
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
      e11422 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z1161TurnCod = (byte)(localUtil.ctol( httpContext.cgiGet( "Z1161TurnCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z1162TurnHin = (byte)(localUtil.ctol( httpContext.cgiGet( "Z1162TurnHin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z1163TurnMin = (byte)(localUtil.ctol( httpContext.cgiGet( "Z1163TurnMin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z1164TurnHfi = (byte)(localUtil.ctol( httpContext.cgiGet( "Z1164TurnHfi"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z1165TurnMfi = (byte)(localUtil.ctol( httpContext.cgiGet( "Z1165TurnMfi"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            AV25EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            A396EmprCod = httpContext.cgiGet( "EMPRCOD") ;
            AV26TurnCod = (byte)(localUtil.ctol( httpContext.cgiGet( "vTURNCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
            /* Read variables values. */
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTurnCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTurnCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TURNCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTurnCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A1161TurnCod = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A1161TurnCod", GXutil.str( A1161TurnCod, 1, 0));
            }
            else
            {
               A1161TurnCod = (byte)(localUtil.ctol( httpContext.cgiGet( edtTurnCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A1161TurnCod", GXutil.str( A1161TurnCod, 1, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTurnHin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTurnHin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TURNHIN");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTurnHin_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A1162TurnHin = (byte)(0) ;
               n1162TurnHin = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A1162TurnHin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1162TurnHin), 2, 0));
            }
            else
            {
               A1162TurnHin = (byte)(localUtil.ctol( httpContext.cgiGet( edtTurnHin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n1162TurnHin = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A1162TurnHin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1162TurnHin), 2, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTurnMin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTurnMin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TURNMIN");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTurnMin_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A1163TurnMin = (byte)(0) ;
               n1163TurnMin = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A1163TurnMin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1163TurnMin), 2, 0));
            }
            else
            {
               A1163TurnMin = (byte)(localUtil.ctol( httpContext.cgiGet( edtTurnMin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n1163TurnMin = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A1163TurnMin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1163TurnMin), 2, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTurnHfi_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTurnHfi_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TURNHFI");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTurnHfi_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A1164TurnHfi = (byte)(0) ;
               n1164TurnHfi = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A1164TurnHfi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1164TurnHfi), 2, 0));
            }
            else
            {
               A1164TurnHfi = (byte)(localUtil.ctol( httpContext.cgiGet( edtTurnHfi_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n1164TurnHfi = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A1164TurnHfi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1164TurnHfi), 2, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTurnMfi_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTurnMfi_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TURNMFI");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTurnMfi_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A1165TurnMfi = (byte)(0) ;
               n1165TurnMfi = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A1165TurnMfi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1165TurnMfi), 2, 0));
            }
            else
            {
               A1165TurnMfi = (byte)(localUtil.ctol( httpContext.cgiGet( edtTurnMfi_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n1165TurnMfi = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A1165TurnMfi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1165TurnMfi), 2, 0));
            }
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"TTURNOS");
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( A1161TurnCod != Z1161TurnCod ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("tturnos:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               A1161TurnCod = (byte)(GXutil.lval( httpContext.GetPar( "TurnCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A1161TurnCod", GXutil.str( A1161TurnCod, 1, 0));
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
                  sMode155 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  Gx_mode = sMode155 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound155 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_420( ) ;
                        if ( AnyError == 0 )
                        {
                           GX_FocusControl = bttBtntrn_enter_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noinsert"), 1, "TURNCOD");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtTurnCod_Internalname ;
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
                        e11422 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e12422 ();
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
         e12422 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll42155( ) ;
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
         disableAttributes42155( ) ;
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

   public void confirm_420( )
   {
      beforeValidate42155( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls42155( ) ;
         }
         else
         {
            checkExtendedTable42155( ) ;
            closeExtendedTableCursors42155( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
   }

   public void resetCaption420( )
   {
   }

   public void e11422( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV18Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      tturnos_impl.this.GXt_char1 = GXv_char2[0] ;
      AV18Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18Station", AV18Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV17EmprNom ;
      GXv_char4[0] = AV16UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV18Station, GXv_char2, GXv_char3, GXv_char4) ;
      tturnos_impl.this.A396EmprCod = GXv_char2[0] ;
      tturnos_impl.this.AV17EmprNom = GXv_char3[0] ;
      tturnos_impl.this.AV16UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV17EmprNom", AV17EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV16UsurCod", AV16UsurCod);
      GXt_char1 = AV18Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      tturnos_impl.this.GXt_char1 = GXv_char4[0] ;
      AV18Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18Station", AV18Station);
      GXv_char4[0] = AV25EmprCod ;
      GXv_char3[0] = AV17EmprNom ;
      GXv_char2[0] = AV16UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV18Station, GXv_char4, GXv_char3, GXv_char2) ;
      tturnos_impl.this.AV25EmprCod = GXv_char4[0] ;
      tturnos_impl.this.AV17EmprNom = GXv_char3[0] ;
      tturnos_impl.this.AV16UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25EmprCod", AV25EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV25EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV17EmprNom", AV17EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV16UsurCod", AV16UsurCod);
      GXv_SdtWWPContext5[0] = AV27WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext5) ;
      AV27WWPContext = GXv_SdtWWPContext5[0] ;
      AV28TrnContext.fromxml(AV29WebSession.getValue("TrnContext"), null, null);
   }

   public void e12422( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV28TrnContext.getgxTv_SdtWWPTransactionContext_Callerondelete() )
      {
         callWebObject(formatLink("app.tturnosww", new String[] {}, new String[] {}) );
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

   public void zm42155( int GX_JID )
   {
      if ( ( GX_JID == 10 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z1162TurnHin = T00423_A1162TurnHin[0] ;
            Z1163TurnMin = T00423_A1163TurnMin[0] ;
            Z1164TurnHfi = T00423_A1164TurnHfi[0] ;
            Z1165TurnMfi = T00423_A1165TurnMfi[0] ;
         }
         else
         {
            Z1162TurnHin = A1162TurnHin ;
            Z1163TurnMin = A1163TurnMin ;
            Z1164TurnHfi = A1164TurnHfi ;
            Z1165TurnMfi = A1165TurnMfi ;
         }
      }
      if ( GX_JID == -10 )
      {
         Z1161TurnCod = A1161TurnCod ;
         Z1162TurnHin = A1162TurnHin ;
         Z1163TurnMin = A1163TurnMin ;
         Z1164TurnHfi = A1164TurnHfi ;
         Z1165TurnMfi = A1165TurnMfi ;
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV25EmprCod)==0) )
      {
         A396EmprCod = AV25EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      /* Using cursor T00424 */
      pr_default.execute(2, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T00424_A407EmprNom[0] ;
      n407EmprNom = T00424_n407EmprNom[0] ;
      pr_default.close(2);
      if ( ! (0==AV26TurnCod) )
      {
         A1161TurnCod = AV26TurnCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A1161TurnCod", GXutil.str( A1161TurnCod, 1, 0));
      }
      if ( ! (0==AV26TurnCod) )
      {
         edtTurnCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTurnCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTurnCod_Enabled), 5, 0), true);
      }
      else
      {
         edtTurnCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTurnCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTurnCod_Enabled), 5, 0), true);
      }
      if ( ! (0==AV26TurnCod) )
      {
         edtTurnCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTurnCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTurnCod_Enabled), 5, 0), true);
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

   public void load42155( )
   {
      /* Using cursor T00425 */
      pr_default.execute(3, new Object[] {A396EmprCod, Byte.valueOf(A1161TurnCod)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound155 = (short)(1) ;
         A1162TurnHin = T00425_A1162TurnHin[0] ;
         n1162TurnHin = T00425_n1162TurnHin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1162TurnHin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1162TurnHin), 2, 0));
         A1163TurnMin = T00425_A1163TurnMin[0] ;
         n1163TurnMin = T00425_n1163TurnMin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1163TurnMin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1163TurnMin), 2, 0));
         A1164TurnHfi = T00425_A1164TurnHfi[0] ;
         n1164TurnHfi = T00425_n1164TurnHfi[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1164TurnHfi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1164TurnHfi), 2, 0));
         A1165TurnMfi = T00425_A1165TurnMfi[0] ;
         n1165TurnMfi = T00425_n1165TurnMfi[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1165TurnMfi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1165TurnMfi), 2, 0));
         A407EmprNom = T00425_A407EmprNom[0] ;
         n407EmprNom = T00425_n407EmprNom[0] ;
         zm42155( -10) ;
      }
      pr_default.close(3);
      onLoadActions42155( ) ;
   }

   public void onLoadActions42155( )
   {
   }

   public void checkExtendedTable42155( )
   {
      nIsDirty_155 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      if ( ! ( ( ( A1162TurnHin >= 0 ) && ( A1162TurnHin <= 23 ) ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Inicio", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "TURNHIN");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTurnHin_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( ( ( A1163TurnMin >= 0 ) && ( A1163TurnMin <= 59 ) ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Minutos", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "TURNMIN");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTurnMin_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( ( ( A1164TurnHfi >= 0 ) && ( A1164TurnHfi <= 23 ) ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Fin", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "TURNHFI");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTurnHfi_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( ( ( A1165TurnMfi >= 0 ) && ( A1165TurnMfi <= 59 ) ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "MInutos", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "TURNMFI");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTurnMfi_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors42155( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey42155( )
   {
      /* Using cursor T00426 */
      pr_default.execute(4, new Object[] {A396EmprCod, Byte.valueOf(A1161TurnCod)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound155 = (short)(1) ;
      }
      else
      {
         RcdFound155 = (short)(0) ;
      }
      pr_default.close(4);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T00423 */
      pr_default.execute(1, new Object[] {A396EmprCod, Byte.valueOf(A1161TurnCod)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T00423_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm42155( 10) ;
         RcdFound155 = (short)(1) ;
         A1161TurnCod = T00423_A1161TurnCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1161TurnCod", GXutil.str( A1161TurnCod, 1, 0));
         A1162TurnHin = T00423_A1162TurnHin[0] ;
         n1162TurnHin = T00423_n1162TurnHin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1162TurnHin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1162TurnHin), 2, 0));
         A1163TurnMin = T00423_A1163TurnMin[0] ;
         n1163TurnMin = T00423_n1163TurnMin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1163TurnMin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1163TurnMin), 2, 0));
         A1164TurnHfi = T00423_A1164TurnHfi[0] ;
         n1164TurnHfi = T00423_n1164TurnHfi[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1164TurnHfi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1164TurnHfi), 2, 0));
         A1165TurnMfi = T00423_A1165TurnMfi[0] ;
         n1165TurnMfi = T00423_n1165TurnMfi[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1165TurnMfi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1165TurnMfi), 2, 0));
         Z396EmprCod = A396EmprCod ;
         Z1161TurnCod = A1161TurnCod ;
         sMode155 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load42155( ) ;
         if ( AnyError == 1 )
         {
            RcdFound155 = (short)(0) ;
            initializeNonKey42155( ) ;
         }
         Gx_mode = sMode155 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound155 = (short)(0) ;
         initializeNonKey42155( ) ;
         sMode155 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode155 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey42155( ) ;
      if ( RcdFound155 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound155 = (short)(0) ;
      /* Using cursor T00427 */
      pr_default.execute(5, new Object[] {Byte.valueOf(A1161TurnCod), A396EmprCod});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( ( T00427_A1161TurnCod[0] < A1161TurnCod ) ) && ( GXutil.strcmp(T00427_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( ( T00427_A1161TurnCod[0] > A1161TurnCod ) ) && ( GXutil.strcmp(T00427_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A1161TurnCod = T00427_A1161TurnCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A1161TurnCod", GXutil.str( A1161TurnCod, 1, 0));
            RcdFound155 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void move_previous( )
   {
      RcdFound155 = (short)(0) ;
      /* Using cursor T00428 */
      pr_default.execute(6, new Object[] {Byte.valueOf(A1161TurnCod), A396EmprCod});
      if ( (pr_default.getStatus(6) != 101) )
      {
         while ( (pr_default.getStatus(6) != 101) && ( ( T00428_A1161TurnCod[0] > A1161TurnCod ) ) && ( GXutil.strcmp(T00428_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(6);
         }
         if ( (pr_default.getStatus(6) != 101) && ( ( T00428_A1161TurnCod[0] < A1161TurnCod ) ) && ( GXutil.strcmp(T00428_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A1161TurnCod = T00428_A1161TurnCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A1161TurnCod", GXutil.str( A1161TurnCod, 1, 0));
            RcdFound155 = (short)(1) ;
         }
      }
      pr_default.close(6);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey42155( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtTurnCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert42155( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound155 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A1161TurnCod != Z1161TurnCod ) )
            {
               A1161TurnCod = Z1161TurnCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A1161TurnCod", GXutil.str( A1161TurnCod, 1, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "TURNCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTurnCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtTurnCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               update42155( ) ;
               GX_FocusControl = edtTurnCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A1161TurnCod != Z1161TurnCod ) )
            {
               /* Insert record */
               GX_FocusControl = edtTurnCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert42155( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "TURNCOD");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtTurnCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  /* Insert record */
                  GX_FocusControl = edtTurnCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert42155( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A1161TurnCod != Z1161TurnCod ) )
      {
         A1161TurnCod = Z1161TurnCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A1161TurnCod", GXutil.str( A1161TurnCod, 1, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "TURNCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTurnCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtTurnCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency42155( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00422 */
         pr_default.execute(0, new Object[] {A396EmprCod, Byte.valueOf(A1161TurnCod)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPTURNOS"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( Z1162TurnHin != T00422_A1162TurnHin[0] ) || ( Z1163TurnMin != T00422_A1163TurnMin[0] ) || ( Z1164TurnHfi != T00422_A1164TurnHfi[0] ) || ( Z1165TurnMfi != T00422_A1165TurnMfi[0] ) )
         {
            if ( Z1162TurnHin != T00422_A1162TurnHin[0] )
            {
               GXutil.writeLogln("tturnos:[seudo value changed for attri]"+"TurnHin");
               GXutil.writeLogRaw("Old: ",Z1162TurnHin);
               GXutil.writeLogRaw("Current: ",T00422_A1162TurnHin[0]);
            }
            if ( Z1163TurnMin != T00422_A1163TurnMin[0] )
            {
               GXutil.writeLogln("tturnos:[seudo value changed for attri]"+"TurnMin");
               GXutil.writeLogRaw("Old: ",Z1163TurnMin);
               GXutil.writeLogRaw("Current: ",T00422_A1163TurnMin[0]);
            }
            if ( Z1164TurnHfi != T00422_A1164TurnHfi[0] )
            {
               GXutil.writeLogln("tturnos:[seudo value changed for attri]"+"TurnHfi");
               GXutil.writeLogRaw("Old: ",Z1164TurnHfi);
               GXutil.writeLogRaw("Current: ",T00422_A1164TurnHfi[0]);
            }
            if ( Z1165TurnMfi != T00422_A1165TurnMfi[0] )
            {
               GXutil.writeLogln("tturnos:[seudo value changed for attri]"+"TurnMfi");
               GXutil.writeLogRaw("Old: ",Z1165TurnMfi);
               GXutil.writeLogRaw("Current: ",T00422_A1165TurnMfi[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPTURNOS"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert42155( )
   {
      beforeValidate42155( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable42155( ) ;
      }
      if ( AnyError == 0 )
      {
         zm42155( 0) ;
         checkOptimisticConcurrency42155( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm42155( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert42155( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00429 */
                  pr_default.execute(7, new Object[] {Byte.valueOf(A1161TurnCod), Boolean.valueOf(n1162TurnHin), Byte.valueOf(A1162TurnHin), Boolean.valueOf(n1163TurnMin), Byte.valueOf(A1163TurnMin), Boolean.valueOf(n1164TurnHfi), Byte.valueOf(A1164TurnHfi), Boolean.valueOf(n1165TurnMfi), Byte.valueOf(A1165TurnMfi), A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTURNOS");
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
                        resetCaption420( ) ;
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
            load42155( ) ;
         }
         endLevel42155( ) ;
      }
      closeExtendedTableCursors42155( ) ;
   }

   public void update42155( )
   {
      beforeValidate42155( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable42155( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency42155( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm42155( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate42155( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T004210 */
                  pr_default.execute(8, new Object[] {Boolean.valueOf(n1162TurnHin), Byte.valueOf(A1162TurnHin), Boolean.valueOf(n1163TurnMin), Byte.valueOf(A1163TurnMin), Boolean.valueOf(n1164TurnHfi), Byte.valueOf(A1164TurnHfi), Boolean.valueOf(n1165TurnMfi), Byte.valueOf(A1165TurnMfi), A396EmprCod, Byte.valueOf(A1161TurnCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTURNOS");
                  if ( (pr_default.getStatus(8) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPTURNOS"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate42155( ) ;
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
         endLevel42155( ) ;
      }
      closeExtendedTableCursors42155( ) ;
   }

   public void deferredUpdate42155( )
   {
   }

   public void delete( )
   {
      beforeValidate42155( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency42155( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls42155( ) ;
         afterConfirm42155( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete42155( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T004211 */
               pr_default.execute(9, new Object[] {A396EmprCod, Byte.valueOf(A1161TurnCod)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTURNOS");
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
      sMode155 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel42155( ) ;
      Gx_mode = sMode155 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls42155( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel42155( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete42155( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tturnos");
         if ( AnyError == 0 )
         {
            confirmValues420( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tturnos");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart42155( )
   {
      /* Scan By routine */
      /* Using cursor T004212 */
      pr_default.execute(10, new Object[] {A396EmprCod});
      RcdFound155 = (short)(0) ;
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound155 = (short)(1) ;
         A1161TurnCod = T004212_A1161TurnCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1161TurnCod", GXutil.str( A1161TurnCod, 1, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext42155( )
   {
      /* Scan next routine */
      pr_default.readNext(10);
      RcdFound155 = (short)(0) ;
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound155 = (short)(1) ;
         A1161TurnCod = T004212_A1161TurnCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1161TurnCod", GXutil.str( A1161TurnCod, 1, 0));
      }
   }

   public void scanEnd42155( )
   {
      pr_default.close(10);
   }

   public void afterConfirm42155( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert42155( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate42155( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete42155( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete42155( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate42155( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes42155( )
   {
      edtTurnCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTurnCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTurnCod_Enabled), 5, 0), true);
      edtTurnHin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTurnHin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTurnHin_Enabled), 5, 0), true);
      edtTurnMin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTurnMin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTurnMin_Enabled), 5, 0), true);
      edtTurnHfi_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTurnHfi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTurnHfi_Enabled), 5, 0), true);
      edtTurnMfi_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTurnMfi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTurnMfi_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes42155( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues420( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.tturnos", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV25EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV26TurnCod,1,0))}, new String[] {"Gx_mode","EmprCod","TurnCod"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"TTURNOS");
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("tturnos:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1161TurnCod", GXutil.ltrim( localUtil.ntoc( Z1161TurnCod, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1162TurnHin", GXutil.ltrim( localUtil.ntoc( Z1162TurnHin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1163TurnMin", GXutil.ltrim( localUtil.ntoc( Z1163TurnMin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1164TurnHfi", GXutil.ltrim( localUtil.ntoc( Z1164TurnHfi, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1165TurnMfi", GXutil.ltrim( localUtil.ntoc( Z1165TurnMfi, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTRNCONTEXT", AV28TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTRNCONTEXT", AV28TrnContext);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTRNCONTEXT", getSecureSignedToken( "", AV28TrnContext));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV25EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV25EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vTURNCOD", GXutil.ltrim( localUtil.ntoc( AV26TurnCod, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTURNCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV26TurnCod), "9")));
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
      return formatLink("app.tturnos", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV25EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV26TurnCod,1,0))}, new String[] {"Gx_mode","EmprCod","TurnCod"})  ;
   }

   public String getPgmname( )
   {
      return "TTURNOS" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "TURNOS", "") ;
   }

   public void initializeNonKey42155( )
   {
      A1162TurnHin = (byte)(0) ;
      n1162TurnHin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1162TurnHin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1162TurnHin), 2, 0));
      A1163TurnMin = (byte)(0) ;
      n1163TurnMin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1163TurnMin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1163TurnMin), 2, 0));
      A1164TurnHfi = (byte)(0) ;
      n1164TurnHfi = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1164TurnHfi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1164TurnHfi), 2, 0));
      A1165TurnMfi = (byte)(0) ;
      n1165TurnMfi = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1165TurnMfi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1165TurnMfi), 2, 0));
      Z1162TurnHin = (byte)(0) ;
      Z1163TurnMin = (byte)(0) ;
      Z1164TurnHfi = (byte)(0) ;
      Z1165TurnMfi = (byte)(0) ;
   }

   public void initAll42155( )
   {
      A1161TurnCod = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A1161TurnCod", GXutil.str( A1161TurnCod, 1, 0));
      initializeNonKey42155( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211653455", true, true);
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
      httpContext.AddJavascriptSource("tturnos.js", "?20268211653455", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      edtTurnCod_Internalname = "TURNCOD" ;
      edtTurnHin_Internalname = "TURNHIN" ;
      edtTurnMin_Internalname = "TURNMIN" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      grpUnnamedgroup2_Internalname = "UNNAMEDGROUP2" ;
      edtTurnHfi_Internalname = "TURNHFI" ;
      edtTurnMfi_Internalname = "TURNMFI" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      grpUnnamedgroup4_Internalname = "UNNAMEDGROUP4" ;
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
      Form.setCaption( httpContext.getMessage( "TURNOS", "") );
      bttBtntrn_delete_Enabled = 0 ;
      bttBtntrn_delete_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      edtTurnMfi_Jsonclick = "" ;
      edtTurnMfi_Enabled = 1 ;
      edtTurnHfi_Jsonclick = "" ;
      edtTurnHfi_Enabled = 1 ;
      edtTurnMin_Jsonclick = "" ;
      edtTurnMin_Enabled = 1 ;
      edtTurnHin_Jsonclick = "" ;
      edtTurnHin_Enabled = 1 ;
      edtTurnCod_Jsonclick = "" ;
      edtTurnCod_Enabled = 1 ;
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV25EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV26TurnCod',fld:'vTURNCOD',pic:'9',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV28TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true},{av:'AV25EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV26TurnCod',fld:'vTURNCOD',pic:'9',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e12422',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV28TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true}]");
      setEventMetadata("AFTER TRN",",oparms:[]}");
      setEventMetadata("VALID_TURNCOD","{handler:'valid_Turncod',iparms:[]");
      setEventMetadata("VALID_TURNCOD",",oparms:[]}");
      setEventMetadata("VALID_TURNHIN","{handler:'valid_Turnhin',iparms:[]");
      setEventMetadata("VALID_TURNHIN",",oparms:[]}");
      setEventMetadata("VALID_TURNMIN","{handler:'valid_Turnmin',iparms:[]");
      setEventMetadata("VALID_TURNMIN",",oparms:[]}");
      setEventMetadata("VALID_TURNHFI","{handler:'valid_Turnhfi',iparms:[]");
      setEventMetadata("VALID_TURNHFI",",oparms:[]}");
      setEventMetadata("VALID_TURNMFI","{handler:'valid_Turnmfi',iparms:[]");
      setEventMetadata("VALID_TURNMFI",",oparms:[]}");
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
      wcpOAV25EmprCod = "" ;
      Z396EmprCod = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      Gx_mode = "" ;
      AV25EmprCod = "" ;
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
      A396EmprCod = "" ;
      A407EmprNom = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode155 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      AV18Station = "" ;
      AV17EmprNom = "" ;
      AV16UsurCod = "" ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      AV27WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext5 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV28TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV29WebSession = httpContext.getWebSession();
      Z407EmprNom = "" ;
      T00424_A407EmprNom = new String[] {""} ;
      T00424_n407EmprNom = new boolean[] {false} ;
      T00425_A1161TurnCod = new byte[1] ;
      T00425_A1162TurnHin = new byte[1] ;
      T00425_n1162TurnHin = new boolean[] {false} ;
      T00425_A1163TurnMin = new byte[1] ;
      T00425_n1163TurnMin = new boolean[] {false} ;
      T00425_A1164TurnHfi = new byte[1] ;
      T00425_n1164TurnHfi = new boolean[] {false} ;
      T00425_A1165TurnMfi = new byte[1] ;
      T00425_n1165TurnMfi = new boolean[] {false} ;
      T00425_A407EmprNom = new String[] {""} ;
      T00425_n407EmprNom = new boolean[] {false} ;
      T00425_A396EmprCod = new String[] {""} ;
      T00426_A396EmprCod = new String[] {""} ;
      T00426_A1161TurnCod = new byte[1] ;
      T00423_A1161TurnCod = new byte[1] ;
      T00423_A1162TurnHin = new byte[1] ;
      T00423_n1162TurnHin = new boolean[] {false} ;
      T00423_A1163TurnMin = new byte[1] ;
      T00423_n1163TurnMin = new boolean[] {false} ;
      T00423_A1164TurnHfi = new byte[1] ;
      T00423_n1164TurnHfi = new boolean[] {false} ;
      T00423_A1165TurnMfi = new byte[1] ;
      T00423_n1165TurnMfi = new boolean[] {false} ;
      T00423_A396EmprCod = new String[] {""} ;
      T00427_A396EmprCod = new String[] {""} ;
      T00427_A1161TurnCod = new byte[1] ;
      T00428_A396EmprCod = new String[] {""} ;
      T00428_A1161TurnCod = new byte[1] ;
      T00422_A1161TurnCod = new byte[1] ;
      T00422_A1162TurnHin = new byte[1] ;
      T00422_n1162TurnHin = new boolean[] {false} ;
      T00422_A1163TurnMin = new byte[1] ;
      T00422_n1163TurnMin = new boolean[] {false} ;
      T00422_A1164TurnHfi = new byte[1] ;
      T00422_n1164TurnHfi = new boolean[] {false} ;
      T00422_A1165TurnMfi = new byte[1] ;
      T00422_n1165TurnMfi = new boolean[] {false} ;
      T00422_A396EmprCod = new String[] {""} ;
      T004212_A396EmprCod = new String[] {""} ;
      T004212_A1161TurnCod = new byte[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tturnos__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tturnos__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tturnos__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tturnos__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tturnos__default(),
         new Object[] {
             new Object[] {
            T00422_A1161TurnCod, T00422_A1162TurnHin, T00422_n1162TurnHin, T00422_A1163TurnMin, T00422_n1163TurnMin, T00422_A1164TurnHfi, T00422_n1164TurnHfi, T00422_A1165TurnMfi, T00422_n1165TurnMfi, T00422_A396EmprCod
            }
            , new Object[] {
            T00423_A1161TurnCod, T00423_A1162TurnHin, T00423_n1162TurnHin, T00423_A1163TurnMin, T00423_n1163TurnMin, T00423_A1164TurnHfi, T00423_n1164TurnHfi, T00423_A1165TurnMfi, T00423_n1165TurnMfi, T00423_A396EmprCod
            }
            , new Object[] {
            T00424_A407EmprNom, T00424_n407EmprNom
            }
            , new Object[] {
            T00425_A1161TurnCod, T00425_A1162TurnHin, T00425_n1162TurnHin, T00425_A1163TurnMin, T00425_n1163TurnMin, T00425_A1164TurnHfi, T00425_n1164TurnHfi, T00425_A1165TurnMfi, T00425_n1165TurnMfi, T00425_A407EmprNom,
            T00425_n407EmprNom, T00425_A396EmprCod
            }
            , new Object[] {
            T00426_A396EmprCod, T00426_A1161TurnCod
            }
            , new Object[] {
            T00427_A396EmprCod, T00427_A1161TurnCod
            }
            , new Object[] {
            T00428_A396EmprCod, T00428_A1161TurnCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T004212_A396EmprCod, T004212_A1161TurnCod
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
   }

   private byte wcpOAV26TurnCod ;
   private byte Z1161TurnCod ;
   private byte Z1162TurnHin ;
   private byte Z1163TurnMin ;
   private byte Z1164TurnHfi ;
   private byte Z1165TurnMfi ;
   private byte GxWebError ;
   private byte AV26TurnCod ;
   private byte nKeyPressed ;
   private byte A1161TurnCod ;
   private byte A1162TurnHin ;
   private byte A1163TurnMin ;
   private byte A1164TurnHfi ;
   private byte A1165TurnMfi ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound155 ;
   private short nIsDirty_155 ;
   private int trnEnded ;
   private int edtTurnCod_Enabled ;
   private int edtTurnHin_Enabled ;
   private int edtTurnMin_Enabled ;
   private int edtTurnHfi_Enabled ;
   private int edtTurnMfi_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int GX_JID ;
   private int idxLst ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV25EmprCod ;
   private String Z396EmprCod ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String Gx_mode ;
   private String AV25EmprCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtTurnCod_Internalname ;
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
   private String edtTurnCod_Jsonclick ;
   private String grpUnnamedgroup2_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String edtTurnHin_Internalname ;
   private String edtTurnHin_Jsonclick ;
   private String edtTurnMin_Internalname ;
   private String edtTurnMin_Jsonclick ;
   private String grpUnnamedgroup4_Internalname ;
   private String divUnnamedtable3_Internalname ;
   private String edtTurnHfi_Internalname ;
   private String edtTurnHfi_Jsonclick ;
   private String edtTurnMfi_Internalname ;
   private String edtTurnMfi_Jsonclick ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String A396EmprCod ;
   private String A407EmprNom ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String hsh ;
   private String sMode155 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String AV18Station ;
   private String AV17EmprNom ;
   private String AV16UsurCod ;
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
   private boolean n407EmprNom ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean n1162TurnHin ;
   private boolean n1163TurnMin ;
   private boolean n1164TurnHfi ;
   private boolean n1165TurnMfi ;
   private boolean returnInSub ;
   private com.genexus.webpanels.WebSession AV29WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private String[] T00424_A407EmprNom ;
   private boolean[] T00424_n407EmprNom ;
   private byte[] T00425_A1161TurnCod ;
   private byte[] T00425_A1162TurnHin ;
   private boolean[] T00425_n1162TurnHin ;
   private byte[] T00425_A1163TurnMin ;
   private boolean[] T00425_n1163TurnMin ;
   private byte[] T00425_A1164TurnHfi ;
   private boolean[] T00425_n1164TurnHfi ;
   private byte[] T00425_A1165TurnMfi ;
   private boolean[] T00425_n1165TurnMfi ;
   private String[] T00425_A407EmprNom ;
   private boolean[] T00425_n407EmprNom ;
   private String[] T00425_A396EmprCod ;
   private String[] T00426_A396EmprCod ;
   private byte[] T00426_A1161TurnCod ;
   private byte[] T00423_A1161TurnCod ;
   private byte[] T00423_A1162TurnHin ;
   private boolean[] T00423_n1162TurnHin ;
   private byte[] T00423_A1163TurnMin ;
   private boolean[] T00423_n1163TurnMin ;
   private byte[] T00423_A1164TurnHfi ;
   private boolean[] T00423_n1164TurnHfi ;
   private byte[] T00423_A1165TurnMfi ;
   private boolean[] T00423_n1165TurnMfi ;
   private String[] T00423_A396EmprCod ;
   private String[] T00427_A396EmprCod ;
   private byte[] T00427_A1161TurnCod ;
   private String[] T00428_A396EmprCod ;
   private byte[] T00428_A1161TurnCod ;
   private byte[] T00422_A1161TurnCod ;
   private byte[] T00422_A1162TurnHin ;
   private boolean[] T00422_n1162TurnHin ;
   private byte[] T00422_A1163TurnMin ;
   private boolean[] T00422_n1163TurnMin ;
   private byte[] T00422_A1164TurnHfi ;
   private boolean[] T00422_n1164TurnHfi ;
   private byte[] T00422_A1165TurnMfi ;
   private boolean[] T00422_n1165TurnMfi ;
   private String[] T00422_A396EmprCod ;
   private String[] T004212_A396EmprCod ;
   private byte[] T004212_A1161TurnCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private app.wwpbaseobjects.SdtWWPContext AV27WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext5[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV28TrnContext ;
}

final  class tturnos__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tturnos__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tturnos__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tturnos__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tturnos__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00422", "SELECT TurnCod, TurnHin, TurnMin, TurnHfi, TurnMfi, EmprCod FROM TXPTURNOS WHERE EmprCod = ? AND TurnCod = ?  FOR UPDATE OF TurnHin, TurnMin, TurnHfi, TurnMfi NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00423", "SELECT TurnCod, TurnHin, TurnMin, TurnHfi, TurnMfi, EmprCod FROM TXPTURNOS WHERE EmprCod = ? AND TurnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00424", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00425", "SELECT /*+ FIRST_ROWS(100) */ TM1.TurnCod, TM1.TurnHin, TM1.TurnMin, TM1.TurnHfi, TM1.TurnMfi, T2.EmprNom, TM1.EmprCod FROM (TXPTURNOS TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.TurnCod = ? ORDER BY TM1.EmprCod, TM1.TurnCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00426", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, TurnCod FROM TXPTURNOS WHERE EmprCod = ? AND TurnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00427", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, TurnCod FROM TXPTURNOS WHERE ( TurnCod > ?) and EmprCod = ? ORDER BY EmprCod, TurnCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00428", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, TurnCod FROM TXPTURNOS WHERE ( TurnCod < ?) and EmprCod = ? ORDER BY EmprCod DESC, TurnCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T00429", "INSERT INTO TXPTURNOS(TurnCod, TurnHin, TurnMin, TurnHfi, TurnMfi, EmprCod) VALUES(?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPTURNOS")
         ,new UpdateCursor("T004210", "UPDATE TXPTURNOS SET TurnHin=?, TurnMin=?, TurnHfi=?, TurnMfi=?  WHERE EmprCod = ? AND TurnCod = ?", GX_NOMASK, "TXPTURNOS")
         ,new UpdateCursor("T004211", "DELETE FROM TXPTURNOS  WHERE EmprCod = ? AND TurnCod = ?", GX_NOMASK, "TXPTURNOS")
         ,new ForEachCursor("T004212", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, TurnCod FROM TXPTURNOS WHERE EmprCod = ? ORDER BY EmprCod, TurnCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((byte[]) buf[5])[0] = rslt.getByte(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((byte[]) buf[7])[0] = rslt.getByte(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 3);
               return;
            case 1 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((byte[]) buf[5])[0] = rslt.getByte(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((byte[]) buf[7])[0] = rslt.getByte(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((byte[]) buf[5])[0] = rslt.getByte(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((byte[]) buf[7])[0] = rslt.getByte(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 30);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
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
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 5 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 6 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 7 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[4]).byteValue());
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(4, ((Number) parms[6]).byteValue());
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(5, ((Number) parms[8]).byteValue());
               }
               stmt.setString(6, (String)parms[9], 3);
               return;
            case 8 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(1, ((Number) parms[1]).byteValue());
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
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(4, ((Number) parms[7]).byteValue());
               }
               stmt.setString(5, (String)parms[8], 3);
               stmt.setByte(6, ((Number) parms[9]).byteValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

