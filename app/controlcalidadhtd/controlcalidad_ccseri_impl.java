package app.controlcalidadhtd ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class controlcalidad_ccseri_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel10"+"_"+"vOKCOL") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A65ArtCod = httpContext.GetPar( "ArtCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
         A4058CCFColNom = httpContext.GetPar( "CCFColNom") ;
         httpContext.ajax_rsp_assign_attri("", false, "A4058CCFColNom", A4058CCFColNom);
         A4059CCFColNum = (int)(GXutil.lval( httpContext.GetPar( "CCFColNum"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4059CCFColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4059CCFColNum), 6, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx10asaokcol1VM627( A396EmprCod, A252CliCod, A65ArtCod, A4058CCFColNom, A4059CCFColNum) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_19") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
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
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A65ArtCod = httpContext.GetPar( "ArtCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_20( A396EmprCod, A252CliCod, A65ArtCod) ;
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
            AV9ArtCod = httpContext.GetPar( "ArtCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9ArtCod", AV9ArtCod);
            AV10CCFColNom = httpContext.GetPar( "CCFColNom") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10CCFColNom", AV10CCFColNom);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCCFCOLNOM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV10CCFColNom, ""))));
            AV11CCFColNum = (int)(GXutil.lval( httpContext.GetPar( "CCFColNum"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV11CCFColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11CCFColNum), 6, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCCFCOLNUM", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV11CCFColNum), "ZZZZZ9")));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Control de Calidad Cliente-Articulo-Color", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public controlcalidad_ccseri_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public controlcalidad_ccseri_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( controlcalidad_ccseri_impl.class ));
   }

   public controlcalidad_ccseri_impl( int remoteHandle ,
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell DscTop ExtendedComboCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTablesplittedclicod_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockclicod_Internalname, httpContext.getMessage( "Cliente", ""), "", "", lblTextblockclicod_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_ControlCalidadHTD\\ControlCalidad_CCSeri.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* User Defined Control */
      ucCombo_clicod.setProperty("Caption", Combo_clicod_Caption);
      ucCombo_clicod.setProperty("Cls", Combo_clicod_Cls);
      ucCombo_clicod.setProperty("EmptyItem", Combo_clicod_Emptyitem);
      ucCombo_clicod.setProperty("DropDownOptionsTitleSettingsIcons", AV20DDO_TitleSettingsIcons);
      ucCombo_clicod.setProperty("DropDownOptionsData", AV15CliCod_Data);
      ucCombo_clicod.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_clicod_Internalname, "COMBO_CLICODContainer");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 Invisible", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCliCod_Internalname, httpContext.getMessage( "Cliente", ""), "col-sm-3 AttributeLabel", 0, true, "");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,31);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "Attribute", "", "", "", "", edtCliCod_Visible, edtCliCod_Enabled, 1, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\ControlCalidad_CCSeri.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell DscTop ExtendedComboCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTablesplittedartcod_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockartcod_Internalname, httpContext.getMessage( "Articulo", ""), "", "", lblTextblockartcod_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_ControlCalidadHTD\\ControlCalidad_CCSeri.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* User Defined Control */
      ucCombo_artcod.setProperty("Caption", Combo_artcod_Caption);
      ucCombo_artcod.setProperty("Cls", Combo_artcod_Cls);
      ucCombo_artcod.setProperty("EmptyItemText", Combo_artcod_Emptyitemtext);
      ucCombo_artcod.setProperty("DropDownOptionsTitleSettingsIcons", AV20DDO_TitleSettingsIcons);
      ucCombo_artcod.setProperty("DropDownOptionsData", AV23ArtCod_Data);
      ucCombo_artcod.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_artcod_Internalname, "COMBO_ARTCODContainer");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 Invisible", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtArtCod_Internalname, httpContext.getMessage( "Código Artículo", ""), "col-sm-3 AttributeLabel", 0, true, "");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 42,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtCod_Internalname, GXutil.rtrim( A65ArtCod), GXutil.rtrim( localUtil.format( A65ArtCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,42);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtCod_Jsonclick, 0, "Attribute", "", "", "", "", edtArtCod_Visible, edtArtCod_Enabled, 1, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\ControlCalidad_CCSeri.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell DscTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCCFColNom_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCCFColNom_Internalname, httpContext.getMessage( "Color", ""), " AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 50,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCCFColNom_Internalname, GXutil.rtrim( A4058CCFColNom), GXutil.rtrim( localUtil.format( A4058CCFColNom, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,50);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCCFColNom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCCFColNom_Enabled, 1, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\ControlCalidad_CCSeri.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 CellMarginTop25", "Center", "top", "", "", "div");
      /* Active images/pictures */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 52,'',false,'',0)\"" ;
      ClassString = "CellMarginTop35" + " " + ((GXutil.strcmp(imgImgbsc_promptcolor_gximage, "")==0) ? "GX_Image_prompt_Class" : "GX_Image_"+imgImgbsc_promptcolor_gximage+"_Class") ;
      StyleString = "" ;
      sImgUrl = context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )) ;
      app.GxWebStd.gx_bitmap( httpContext, imgImgbsc_promptcolor_Internalname, sImgUrl, "", "", "", context.getHttpContext().getTheme( ), imgImgbsc_promptcolor_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 7, imgImgbsc_promptcolor_Jsonclick, "'"+""+"'"+",false,"+"'"+"e111vm627_client"+"'", StyleString, ClassString, "", "", "", "", " "+"data-gx-image"+" "+TempTags, "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_ControlCalidadHTD\\ControlCalidad_CCSeri.htm");
      app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell DscTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCCFColNum_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCCFColNum_Internalname, httpContext.getMessage( "Numero", ""), " AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCCFColNum_Internalname, GXutil.ltrim( localUtil.ntoc( A4059CCFColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4059CCFColNum), "ZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCCFColNum_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCCFColNum_Enabled, 1, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\ControlCalidad_CCSeri.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ControlCalidadHTD\\ControlCalidad_CCSeri.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 63,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ControlCalidadHTD\\ControlCalidad_CCSeri.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 65,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ControlCalidadHTD\\ControlCalidad_CCSeri.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV29Pgmname), GXutil.rtrim( localUtil.format( AV29Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\ControlCalidad_CCSeri.htm");
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
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divSectionattribute_clicod_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavComboclicod_Internalname, GXutil.ltrim( localUtil.ntoc( AV17ComboCliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavComboclicod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV17ComboCliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV17ComboCliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavComboclicod_Jsonclick, 0, "Attribute", "", "", "", "", edtavComboclicod_Visible, edtavComboclicod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\ControlCalidad_CCSeri.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divSectionattribute_artcod_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavComboartcod_Internalname, GXutil.rtrim( AV24ComboArtCod), GXutil.rtrim( localUtil.format( AV24ComboArtCod, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavComboartcod_Jsonclick, 0, "Attribute", "", "", "", "", edtavComboartcod_Visible, edtavComboartcod_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\ControlCalidad_CCSeri.htm");
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
      e121VM2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV20DDO_TitleSettingsIcons);
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCLICOD_DATA"), AV15CliCod_Data);
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vARTCOD_DATA"), AV23ArtCod_Data);
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z252CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z65ArtCod = httpContext.cgiGet( "Z65ArtCod") ;
            Z4058CCFColNom = httpContext.cgiGet( "Z4058CCFColNom") ;
            Z4059CCFColNum = (int)(localUtil.ctol( httpContext.cgiGet( "Z4059CCFColNum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            AV26Forblo = httpContext.cgiGet( "vFORBLO") ;
            AV25DisArtCod = httpContext.cgiGet( "vDISARTCOD") ;
            AV7EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            A396EmprCod = httpContext.cgiGet( "EMPRCOD") ;
            AV8CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "vCLICOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV9ArtCod = httpContext.cgiGet( "vARTCOD") ;
            AV10CCFColNom = httpContext.cgiGet( "vCCFCOLNOM") ;
            AV11CCFColNum = (int)(localUtil.ctol( httpContext.cgiGet( "vCCFCOLNUM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV27OkCol = (short)(localUtil.ctol( httpContext.cgiGet( "vOKCOL"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A407EmprNom = httpContext.cgiGet( "EMPRNOM") ;
            n407EmprNom = false ;
            A279CliNom = httpContext.cgiGet( "CLINOM") ;
            A69ArtDsc = httpContext.cgiGet( "ARTDSC") ;
            n69ArtDsc = false ;
            Combo_clicod_Objectcall = httpContext.cgiGet( "COMBO_CLICOD_Objectcall") ;
            Combo_clicod_Class = httpContext.cgiGet( "COMBO_CLICOD_Class") ;
            Combo_clicod_Icontype = httpContext.cgiGet( "COMBO_CLICOD_Icontype") ;
            Combo_clicod_Icon = httpContext.cgiGet( "COMBO_CLICOD_Icon") ;
            Combo_clicod_Caption = httpContext.cgiGet( "COMBO_CLICOD_Caption") ;
            Combo_clicod_Tooltip = httpContext.cgiGet( "COMBO_CLICOD_Tooltip") ;
            Combo_clicod_Cls = httpContext.cgiGet( "COMBO_CLICOD_Cls") ;
            Combo_clicod_Selectedvalue_set = httpContext.cgiGet( "COMBO_CLICOD_Selectedvalue_set") ;
            Combo_clicod_Selectedvalue_get = httpContext.cgiGet( "COMBO_CLICOD_Selectedvalue_get") ;
            Combo_clicod_Selectedtext_set = httpContext.cgiGet( "COMBO_CLICOD_Selectedtext_set") ;
            Combo_clicod_Selectedtext_get = httpContext.cgiGet( "COMBO_CLICOD_Selectedtext_get") ;
            Combo_clicod_Gamoauthtoken = httpContext.cgiGet( "COMBO_CLICOD_Gamoauthtoken") ;
            Combo_clicod_Ddointernalname = httpContext.cgiGet( "COMBO_CLICOD_Ddointernalname") ;
            Combo_clicod_Titlecontrolalign = httpContext.cgiGet( "COMBO_CLICOD_Titlecontrolalign") ;
            Combo_clicod_Dropdownoptionstype = httpContext.cgiGet( "COMBO_CLICOD_Dropdownoptionstype") ;
            Combo_clicod_Enabled = GXutil.strtobool( httpContext.cgiGet( "COMBO_CLICOD_Enabled")) ;
            Combo_clicod_Visible = GXutil.strtobool( httpContext.cgiGet( "COMBO_CLICOD_Visible")) ;
            Combo_clicod_Titlecontrolidtoreplace = httpContext.cgiGet( "COMBO_CLICOD_Titlecontrolidtoreplace") ;
            Combo_clicod_Datalisttype = httpContext.cgiGet( "COMBO_CLICOD_Datalisttype") ;
            Combo_clicod_Allowmultipleselection = GXutil.strtobool( httpContext.cgiGet( "COMBO_CLICOD_Allowmultipleselection")) ;
            Combo_clicod_Datalistfixedvalues = httpContext.cgiGet( "COMBO_CLICOD_Datalistfixedvalues") ;
            Combo_clicod_Isgriditem = GXutil.strtobool( httpContext.cgiGet( "COMBO_CLICOD_Isgriditem")) ;
            Combo_clicod_Hasdescription = GXutil.strtobool( httpContext.cgiGet( "COMBO_CLICOD_Hasdescription")) ;
            Combo_clicod_Datalistproc = httpContext.cgiGet( "COMBO_CLICOD_Datalistproc") ;
            Combo_clicod_Datalistprocparametersprefix = httpContext.cgiGet( "COMBO_CLICOD_Datalistprocparametersprefix") ;
            Combo_clicod_Remoteservicesparameters = httpContext.cgiGet( "COMBO_CLICOD_Remoteservicesparameters") ;
            Combo_clicod_Datalistupdateminimumcharacters = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_CLICOD_Datalistupdateminimumcharacters"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_clicod_Includeonlyselectedoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_CLICOD_Includeonlyselectedoption")) ;
            Combo_clicod_Includeselectalloption = GXutil.strtobool( httpContext.cgiGet( "COMBO_CLICOD_Includeselectalloption")) ;
            Combo_clicod_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_CLICOD_Emptyitem")) ;
            Combo_clicod_Includeaddnewoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_CLICOD_Includeaddnewoption")) ;
            Combo_clicod_Htmltemplate = httpContext.cgiGet( "COMBO_CLICOD_Htmltemplate") ;
            Combo_clicod_Multiplevaluestype = httpContext.cgiGet( "COMBO_CLICOD_Multiplevaluestype") ;
            Combo_clicod_Loadingdata = httpContext.cgiGet( "COMBO_CLICOD_Loadingdata") ;
            Combo_clicod_Noresultsfound = httpContext.cgiGet( "COMBO_CLICOD_Noresultsfound") ;
            Combo_clicod_Emptyitemtext = httpContext.cgiGet( "COMBO_CLICOD_Emptyitemtext") ;
            Combo_clicod_Onlyselectedvalues = httpContext.cgiGet( "COMBO_CLICOD_Onlyselectedvalues") ;
            Combo_clicod_Selectalltext = httpContext.cgiGet( "COMBO_CLICOD_Selectalltext") ;
            Combo_clicod_Multiplevaluesseparator = httpContext.cgiGet( "COMBO_CLICOD_Multiplevaluesseparator") ;
            Combo_clicod_Addnewoptiontext = httpContext.cgiGet( "COMBO_CLICOD_Addnewoptiontext") ;
            Combo_artcod_Objectcall = httpContext.cgiGet( "COMBO_ARTCOD_Objectcall") ;
            Combo_artcod_Class = httpContext.cgiGet( "COMBO_ARTCOD_Class") ;
            Combo_artcod_Icontype = httpContext.cgiGet( "COMBO_ARTCOD_Icontype") ;
            Combo_artcod_Icon = httpContext.cgiGet( "COMBO_ARTCOD_Icon") ;
            Combo_artcod_Caption = httpContext.cgiGet( "COMBO_ARTCOD_Caption") ;
            Combo_artcod_Tooltip = httpContext.cgiGet( "COMBO_ARTCOD_Tooltip") ;
            Combo_artcod_Cls = httpContext.cgiGet( "COMBO_ARTCOD_Cls") ;
            Combo_artcod_Selectedvalue_set = httpContext.cgiGet( "COMBO_ARTCOD_Selectedvalue_set") ;
            Combo_artcod_Selectedvalue_get = httpContext.cgiGet( "COMBO_ARTCOD_Selectedvalue_get") ;
            Combo_artcod_Selectedtext_set = httpContext.cgiGet( "COMBO_ARTCOD_Selectedtext_set") ;
            Combo_artcod_Selectedtext_get = httpContext.cgiGet( "COMBO_ARTCOD_Selectedtext_get") ;
            Combo_artcod_Gamoauthtoken = httpContext.cgiGet( "COMBO_ARTCOD_Gamoauthtoken") ;
            Combo_artcod_Ddointernalname = httpContext.cgiGet( "COMBO_ARTCOD_Ddointernalname") ;
            Combo_artcod_Titlecontrolalign = httpContext.cgiGet( "COMBO_ARTCOD_Titlecontrolalign") ;
            Combo_artcod_Dropdownoptionstype = httpContext.cgiGet( "COMBO_ARTCOD_Dropdownoptionstype") ;
            Combo_artcod_Enabled = GXutil.strtobool( httpContext.cgiGet( "COMBO_ARTCOD_Enabled")) ;
            Combo_artcod_Visible = GXutil.strtobool( httpContext.cgiGet( "COMBO_ARTCOD_Visible")) ;
            Combo_artcod_Titlecontrolidtoreplace = httpContext.cgiGet( "COMBO_ARTCOD_Titlecontrolidtoreplace") ;
            Combo_artcod_Datalisttype = httpContext.cgiGet( "COMBO_ARTCOD_Datalisttype") ;
            Combo_artcod_Allowmultipleselection = GXutil.strtobool( httpContext.cgiGet( "COMBO_ARTCOD_Allowmultipleselection")) ;
            Combo_artcod_Datalistfixedvalues = httpContext.cgiGet( "COMBO_ARTCOD_Datalistfixedvalues") ;
            Combo_artcod_Isgriditem = GXutil.strtobool( httpContext.cgiGet( "COMBO_ARTCOD_Isgriditem")) ;
            Combo_artcod_Hasdescription = GXutil.strtobool( httpContext.cgiGet( "COMBO_ARTCOD_Hasdescription")) ;
            Combo_artcod_Datalistproc = httpContext.cgiGet( "COMBO_ARTCOD_Datalistproc") ;
            Combo_artcod_Datalistprocparametersprefix = httpContext.cgiGet( "COMBO_ARTCOD_Datalistprocparametersprefix") ;
            Combo_artcod_Remoteservicesparameters = httpContext.cgiGet( "COMBO_ARTCOD_Remoteservicesparameters") ;
            Combo_artcod_Datalistupdateminimumcharacters = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_ARTCOD_Datalistupdateminimumcharacters"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_artcod_Includeonlyselectedoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_ARTCOD_Includeonlyselectedoption")) ;
            Combo_artcod_Includeselectalloption = GXutil.strtobool( httpContext.cgiGet( "COMBO_ARTCOD_Includeselectalloption")) ;
            Combo_artcod_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_ARTCOD_Emptyitem")) ;
            Combo_artcod_Includeaddnewoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_ARTCOD_Includeaddnewoption")) ;
            Combo_artcod_Htmltemplate = httpContext.cgiGet( "COMBO_ARTCOD_Htmltemplate") ;
            Combo_artcod_Multiplevaluestype = httpContext.cgiGet( "COMBO_ARTCOD_Multiplevaluestype") ;
            Combo_artcod_Loadingdata = httpContext.cgiGet( "COMBO_ARTCOD_Loadingdata") ;
            Combo_artcod_Noresultsfound = httpContext.cgiGet( "COMBO_ARTCOD_Noresultsfound") ;
            Combo_artcod_Emptyitemtext = httpContext.cgiGet( "COMBO_ARTCOD_Emptyitemtext") ;
            Combo_artcod_Onlyselectedvalues = httpContext.cgiGet( "COMBO_ARTCOD_Onlyselectedvalues") ;
            Combo_artcod_Selectalltext = httpContext.cgiGet( "COMBO_ARTCOD_Selectalltext") ;
            Combo_artcod_Multiplevaluesseparator = httpContext.cgiGet( "COMBO_ARTCOD_Multiplevaluesseparator") ;
            Combo_artcod_Addnewoptiontext = httpContext.cgiGet( "COMBO_ARTCOD_Addnewoptiontext") ;
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
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CLICOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCliCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A252CliCod = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            }
            else
            {
               A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            }
            A65ArtCod = httpContext.cgiGet( edtArtCod_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
            A4058CCFColNom = httpContext.cgiGet( edtCCFColNom_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4058CCFColNom", A4058CCFColNom);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCCFColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCCFColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CCFCOLNUM");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCCFColNum_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A4059CCFColNum = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A4059CCFColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4059CCFColNum), 6, 0));
            }
            else
            {
               A4059CCFColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtCCFColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4059CCFColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4059CCFColNum), 6, 0));
            }
            AV29Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29Pgmname", AV29Pgmname);
            AV17ComboCliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtavComboclicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17ComboCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17ComboCliCod), 6, 0));
            AV24ComboArtCod = httpContext.cgiGet( edtavComboartcod_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24ComboArtCod", AV24ComboArtCod);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"ControlCalidad_CCSeri");
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) || ( GXutil.strcmp(A4058CCFColNom, Z4058CCFColNom) != 0 ) || ( A4059CCFColNum != Z4059CCFColNum ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("controlcalidadhtd\\controlcalidad_ccseri:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
               A65ArtCod = httpContext.GetPar( "ArtCod") ;
               httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
               A4058CCFColNom = httpContext.GetPar( "CCFColNom") ;
               httpContext.ajax_rsp_assign_attri("", false, "A4058CCFColNom", A4058CCFColNom);
               A4059CCFColNum = (int)(GXutil.lval( httpContext.GetPar( "CCFColNum"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4059CCFColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4059CCFColNum), 6, 0));
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
                  sMode627 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  Gx_mode = sMode627 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound627 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_1VM0( ) ;
                        if ( AnyError == 0 )
                        {
                           GX_FocusControl = bttBtntrn_enter_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noinsert"), 1, "CLICOD");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtCliCod_Internalname ;
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
                        e121VM2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e131VM2 ();
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
         e131VM2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll1VM627( ) ;
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
         disableAttributes1VM627( ) ;
      }
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavComboclicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavComboclicod_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavComboartcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavComboartcod_Enabled), 5, 0), true);
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

   public void confirm_1VM0( )
   {
      beforeValidate1VM627( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1VM627( ) ;
         }
         else
         {
            checkExtendedTable1VM627( ) ;
            closeExtendedTableCursors1VM627( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
   }

   public void resetCaption1VM0( )
   {
   }

   public void e121VM2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV22Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      controlcalidad_ccseri_impl.this.GXt_char1 = GXv_char2[0] ;
      AV22Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22Station", AV22Station);
      GXv_char2[0] = AV7EmprCod ;
      GXv_char3[0] = AV18EmprNom ;
      GXv_char4[0] = AV19UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV22Station, GXv_char2, GXv_char3, GXv_char4) ;
      controlcalidad_ccseri_impl.this.AV7EmprCod = GXv_char2[0] ;
      controlcalidad_ccseri_impl.this.AV18EmprNom = GXv_char3[0] ;
      controlcalidad_ccseri_impl.this.AV19UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV18EmprNom", AV18EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV19UsurCod", AV19UsurCod);
      GXv_SdtWWPContext5[0] = AV12WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext5) ;
      AV12WWPContext = GXv_SdtWWPContext5[0] ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = AV20DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7[0] ;
      AV20DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6;
      edtArtCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtCod_Visible), 5, 0), true);
      AV24ComboArtCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24ComboArtCod", AV24ComboArtCod);
      edtavComboartcod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavComboartcod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavComboartcod_Visible), 5, 0), true);
      edtCliCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Visible), 5, 0), true);
      AV17ComboCliCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17ComboCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17ComboCliCod), 6, 0));
      edtavComboclicod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavComboclicod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavComboclicod_Visible), 5, 0), true);
      /* Execute user subroutine: 'LOADCOMBOCLICOD' */
      S112 ();
      if ( returnInSub )
      {
         pr_default.close(4);
         pr_default.close(3);
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      /* Execute user subroutine: 'LOADCOMBOARTCOD' */
      S122 ();
      if ( returnInSub )
      {
         pr_default.close(4);
         pr_default.close(3);
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      AV13TrnContext.fromxml(AV14WebSession.getValue("TrnContext"), null, null);
      this.executeUsercontrolMethod("", false, "DATAMONJSContainer", "DisableFocus", "", new Object[] {imgImgbsc_promptcolor_Internalname});
   }

   public void e131VM2( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      GXt_char1 = AV28CliNom ;
      GXv_char4[0] = GXt_char1 ;
      new app.pclinom(remoteHandle, context).execute( AV7EmprCod, A252CliCod, GXv_char4) ;
      controlcalidad_ccseri_impl.this.GXt_char1 = GXv_char4[0] ;
      AV28CliNom = GXt_char1 ;
      httpContext.popup(formatLink("app.controlcalidadhtd.controlcalidad_ccser1_wp", new String[] {GXutil.URLEncode(GXutil.rtrim(AV7EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV28CliNom)),GXutil.URLEncode(GXutil.rtrim(A65ArtCod)),GXutil.URLEncode(GXutil.rtrim(A4058CCFColNom)),GXutil.URLEncode(GXutil.ltrimstr(A4059CCFColNum,6,0))}, new String[] {"EmprCod","CliCod","CliNom","ArtCod","CCFColNom","CCFColNum"}) , new Object[] {});
      if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV13TrnContext.getgxTv_SdtWWPTransactionContext_Callerondelete() )
      {
         callWebObject(formatLink("app.controlcalidadhtd.controlcalidad_ccseriww", new String[] {}, new String[] {}) );
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

   public void S122( )
   {
      /* 'LOADCOMBOARTCOD' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTComboData_Item8 = AV23ArtCod_Data ;
      GXv_char4[0] = AV16ComboSelectedValue ;
      GXv_objcol_SdtDVB_SDTComboData_Item9[0] = GXt_objcol_SdtDVB_SDTComboData_Item8 ;
      new app.controlcalidadhtd.controlcalidad_ccseriloaddvcombo(remoteHandle, context).execute( "ArtCod", Gx_mode, AV7EmprCod, AV8CliCod, AV9ArtCod, AV10CCFColNom, AV11CCFColNum, GXv_char4, GXv_objcol_SdtDVB_SDTComboData_Item9) ;
      controlcalidad_ccseri_impl.this.AV16ComboSelectedValue = GXv_char4[0] ;
      GXt_objcol_SdtDVB_SDTComboData_Item8 = GXv_objcol_SdtDVB_SDTComboData_Item9[0] ;
      AV23ArtCod_Data = GXt_objcol_SdtDVB_SDTComboData_Item8 ;
      Combo_artcod_Selectedvalue_set = AV16ComboSelectedValue ;
      ucCombo_artcod.sendProperty(context, "", false, Combo_artcod_Internalname, "SelectedValue_set", Combo_artcod_Selectedvalue_set);
      AV24ComboArtCod = AV16ComboSelectedValue ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24ComboArtCod", AV24ComboArtCod);
      if ( ( GXutil.strcmp(Gx_mode, "INS") != 0 ) || ! (GXutil.strcmp("", AV9ArtCod)==0) )
      {
         Combo_artcod_Enabled = false ;
         ucCombo_artcod.sendProperty(context, "", false, Combo_artcod_Internalname, "Enabled", GXutil.booltostr( Combo_artcod_Enabled));
      }
   }

   public void S112( )
   {
      /* 'LOADCOMBOCLICOD' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTComboData_Item8 = AV15CliCod_Data ;
      GXv_char4[0] = AV16ComboSelectedValue ;
      GXv_objcol_SdtDVB_SDTComboData_Item9[0] = GXt_objcol_SdtDVB_SDTComboData_Item8 ;
      new app.controlcalidadhtd.controlcalidad_ccseriloaddvcombo(remoteHandle, context).execute( "CliCod", Gx_mode, AV7EmprCod, AV8CliCod, AV9ArtCod, AV10CCFColNom, AV11CCFColNum, GXv_char4, GXv_objcol_SdtDVB_SDTComboData_Item9) ;
      controlcalidad_ccseri_impl.this.AV16ComboSelectedValue = GXv_char4[0] ;
      GXt_objcol_SdtDVB_SDTComboData_Item8 = GXv_objcol_SdtDVB_SDTComboData_Item9[0] ;
      AV15CliCod_Data = GXt_objcol_SdtDVB_SDTComboData_Item8 ;
      Combo_clicod_Selectedvalue_set = AV16ComboSelectedValue ;
      ucCombo_clicod.sendProperty(context, "", false, Combo_clicod_Internalname, "SelectedValue_set", Combo_clicod_Selectedvalue_set);
      AV17ComboCliCod = (int)(GXutil.lval( AV16ComboSelectedValue)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17ComboCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17ComboCliCod), 6, 0));
      if ( ( GXutil.strcmp(Gx_mode, "INS") != 0 ) || ! (0==AV8CliCod) )
      {
         Combo_clicod_Enabled = false ;
         ucCombo_clicod.sendProperty(context, "", false, Combo_clicod_Internalname, "Enabled", GXutil.booltostr( Combo_clicod_Enabled));
      }
   }

   public void zm1VM627( int GX_JID )
   {
      if ( ( GX_JID == 17 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
         }
         else
         {
         }
      }
      if ( GX_JID == -17 )
      {
         Z4058CCFColNom = A4058CCFColNom ;
         Z4059CCFColNum = A4059CCFColNum ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z65ArtCod = A65ArtCod ;
         Z407EmprNom = A407EmprNom ;
         Z279CliNom = A279CliNom ;
         Z69ArtDsc = A69ArtDsc ;
      }
   }

   public void standaloneNotModal( )
   {
      AV29Pgmname = "ControlCalidadHTD.ControlCalidad_CCSeri" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29Pgmname", AV29Pgmname);
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV7EmprCod)==0) )
      {
         A396EmprCod = AV7EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      /* Using cursor T01VM4 */
      pr_default.execute(2, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01VM4_A407EmprNom[0] ;
      n407EmprNom = T01VM4_n407EmprNom[0] ;
      pr_default.close(2);
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
      if ( ! (GXutil.strcmp("", AV9ArtCod)==0) )
      {
         edtArtCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtArtCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtCod_Enabled), 5, 0), true);
      }
      else
      {
         edtArtCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtArtCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtCod_Enabled), 5, 0), true);
      }
      if ( ! (GXutil.strcmp("", AV9ArtCod)==0) )
      {
         edtArtCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtArtCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtCod_Enabled), 5, 0), true);
      }
      if ( ! (GXutil.strcmp("", AV10CCFColNom)==0) )
      {
         A4058CCFColNom = AV10CCFColNom ;
         httpContext.ajax_rsp_assign_attri("", false, "A4058CCFColNom", A4058CCFColNom);
      }
      if ( ! (GXutil.strcmp("", AV10CCFColNom)==0) )
      {
         edtCCFColNom_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCCFColNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCFColNom_Enabled), 5, 0), true);
      }
      else
      {
         edtCCFColNom_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCCFColNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCFColNom_Enabled), 5, 0), true);
      }
      if ( ! (GXutil.strcmp("", AV10CCFColNom)==0) )
      {
         edtCCFColNom_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCCFColNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCFColNom_Enabled), 5, 0), true);
      }
      if ( ! (0==AV11CCFColNum) )
      {
         A4059CCFColNum = AV11CCFColNum ;
         httpContext.ajax_rsp_assign_attri("", false, "A4059CCFColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4059CCFColNum), 6, 0));
      }
      if ( ! (0==AV11CCFColNum) )
      {
         edtCCFColNum_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCCFColNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCFColNum_Enabled), 5, 0), true);
      }
      else
      {
         edtCCFColNum_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCCFColNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCFColNum_Enabled), 5, 0), true);
      }
      if ( ! (0==AV11CCFColNum) )
      {
         edtCCFColNum_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCCFColNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCFColNum_Enabled), 5, 0), true);
      }
      if ( ! (GXutil.strcmp("", AV9ArtCod)==0) )
      {
         A65ArtCod = AV9ArtCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
      }
      else
      {
         A65ArtCod = AV24ComboArtCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
      }
      if ( ! (0==AV8CliCod) )
      {
         A252CliCod = AV8CliCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      }
      else
      {
         A252CliCod = AV17ComboCliCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
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
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ( Gx_BScreen == 0 ) )
      {
         /* Using cursor T01VM5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
         A279CliNom = T01VM5_A279CliNom[0] ;
         pr_default.close(3);
         /* Using cursor T01VM6 */
         pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
         A69ArtDsc = T01VM6_A69ArtDsc[0] ;
         n69ArtDsc = T01VM6_n69ArtDsc[0] ;
         pr_default.close(4);
         GXt_int10 = (byte)(AV27OkCol) ;
         GXv_char4[0] = A396EmprCod ;
         GXv_int11[0] = A252CliCod ;
         GXv_char3[0] = A65ArtCod ;
         GXv_char2[0] = A4058CCFColNom ;
         GXv_int12[0] = A4059CCFColNum ;
         GXv_int13[0] = GXt_int10 ;
         new app.controlcalidadhtd.pccchkcol(remoteHandle, context).execute( GXv_char4, GXv_int11, GXv_char3, GXv_char2, GXv_int12, GXv_int13) ;
         controlcalidad_ccseri_impl.this.A396EmprCod = GXv_char4[0] ;
         controlcalidad_ccseri_impl.this.A252CliCod = GXv_int11[0] ;
         controlcalidad_ccseri_impl.this.A65ArtCod = GXv_char3[0] ;
         controlcalidad_ccseri_impl.this.A4058CCFColNom = GXv_char2[0] ;
         controlcalidad_ccseri_impl.this.A4059CCFColNum = GXv_int12[0] ;
         controlcalidad_ccseri_impl.this.GXt_int10 = GXv_int13[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
         httpContext.ajax_rsp_assign_attri("", false, "A4058CCFColNom", A4058CCFColNom);
         httpContext.ajax_rsp_assign_attri("", false, "A4059CCFColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4059CCFColNum), 6, 0));
         AV27OkCol = GXt_int10 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV27OkCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27OkCol), 4, 0));
      }
   }

   public void load1VM627( )
   {
      /* Using cursor T01VM7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A4058CCFColNom, Integer.valueOf(A4059CCFColNum)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound627 = (short)(1) ;
         A407EmprNom = T01VM7_A407EmprNom[0] ;
         n407EmprNom = T01VM7_n407EmprNom[0] ;
         A279CliNom = T01VM7_A279CliNom[0] ;
         A69ArtDsc = T01VM7_A69ArtDsc[0] ;
         n69ArtDsc = T01VM7_n69ArtDsc[0] ;
         zm1VM627( -17) ;
      }
      pr_default.close(5);
      onLoadActions1VM627( ) ;
   }

   public void onLoadActions1VM627( )
   {
      GXt_int10 = (byte)(AV27OkCol) ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int12[0] = A252CliCod ;
      GXv_char3[0] = A65ArtCod ;
      GXv_char2[0] = A4058CCFColNom ;
      GXv_int11[0] = A4059CCFColNum ;
      GXv_int13[0] = GXt_int10 ;
      new app.controlcalidadhtd.pccchkcol(remoteHandle, context).execute( GXv_char4, GXv_int12, GXv_char3, GXv_char2, GXv_int11, GXv_int13) ;
      controlcalidad_ccseri_impl.this.A396EmprCod = GXv_char4[0] ;
      controlcalidad_ccseri_impl.this.A252CliCod = GXv_int12[0] ;
      controlcalidad_ccseri_impl.this.A65ArtCod = GXv_char3[0] ;
      controlcalidad_ccseri_impl.this.A4058CCFColNom = GXv_char2[0] ;
      controlcalidad_ccseri_impl.this.A4059CCFColNum = GXv_int11[0] ;
      controlcalidad_ccseri_impl.this.GXt_int10 = GXv_int13[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
      httpContext.ajax_rsp_assign_attri("", false, "A4058CCFColNom", A4058CCFColNom);
      httpContext.ajax_rsp_assign_attri("", false, "A4059CCFColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4059CCFColNum), 6, 0));
      AV27OkCol = GXt_int10 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27OkCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27OkCol), 4, 0));
   }

   public void checkExtendedTable1VM627( )
   {
      nIsDirty_627 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01VM5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T01VM5_A279CliNom[0] ;
      pr_default.close(3);
      /* Using cursor T01VM6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ARTICU", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ARTCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A69ArtDsc = T01VM6_A69ArtDsc[0] ;
      n69ArtDsc = T01VM6_n69ArtDsc[0] ;
      pr_default.close(4);
      GXt_int10 = (byte)(AV27OkCol) ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int12[0] = A252CliCod ;
      GXv_char3[0] = A65ArtCod ;
      GXv_char2[0] = A4058CCFColNom ;
      GXv_int11[0] = A4059CCFColNum ;
      GXv_int13[0] = GXt_int10 ;
      new app.controlcalidadhtd.pccchkcol(remoteHandle, context).execute( GXv_char4, GXv_int12, GXv_char3, GXv_char2, GXv_int11, GXv_int13) ;
      controlcalidad_ccseri_impl.this.A396EmprCod = GXv_char4[0] ;
      controlcalidad_ccseri_impl.this.A252CliCod = GXv_int12[0] ;
      controlcalidad_ccseri_impl.this.A65ArtCod = GXv_char3[0] ;
      controlcalidad_ccseri_impl.this.A4058CCFColNom = GXv_char2[0] ;
      controlcalidad_ccseri_impl.this.A4059CCFColNum = GXv_int11[0] ;
      controlcalidad_ccseri_impl.this.GXt_int10 = GXv_int13[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
      httpContext.ajax_rsp_assign_attri("", false, "A4058CCFColNom", A4058CCFColNom);
      httpContext.ajax_rsp_assign_attri("", false, "A4059CCFColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4059CCFColNum), 6, 0));
      AV27OkCol = GXt_int10 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27OkCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27OkCol), 4, 0));
   }

   public void closeExtendedTableCursors1VM627( )
   {
      pr_default.close(3);
      pr_default.close(4);
   }

   public void enableDisable( )
   {
   }

   public void gxload_19( String A396EmprCod ,
                          int A252CliCod )
   {
      /* Using cursor T01VM8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T01VM8_A279CliNom[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A279CliNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(6) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(6);
   }

   public void gxload_20( String A396EmprCod ,
                          int A252CliCod ,
                          String A65ArtCod )
   {
      /* Using cursor T01VM9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ARTICU", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ARTCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A69ArtDsc = T01VM9_A69ArtDsc[0] ;
      n69ArtDsc = T01VM9_n69ArtDsc[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A69ArtDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(7) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(7);
   }

   public void getKey1VM627( )
   {
      /* Using cursor T01VM10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A4058CCFColNom, Integer.valueOf(A4059CCFColNum)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound627 = (short)(1) ;
      }
      else
      {
         RcdFound627 = (short)(0) ;
      }
      pr_default.close(8);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01VM3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A4058CCFColNom, Integer.valueOf(A4059CCFColNum)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1VM627( 17) ;
         RcdFound627 = (short)(1) ;
         A4058CCFColNom = T01VM3_A4058CCFColNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4058CCFColNom", A4058CCFColNom);
         A4059CCFColNum = T01VM3_A4059CCFColNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4059CCFColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4059CCFColNum), 6, 0));
         A396EmprCod = T01VM3_A396EmprCod[0] ;
         A252CliCod = T01VM3_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A65ArtCod = T01VM3_A65ArtCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z65ArtCod = A65ArtCod ;
         Z4058CCFColNom = A4058CCFColNom ;
         Z4059CCFColNum = A4059CCFColNum ;
         sMode627 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1VM627( ) ;
         if ( AnyError == 1 )
         {
            RcdFound627 = (short)(0) ;
            initializeNonKey1VM627( ) ;
         }
         Gx_mode = sMode627 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound627 = (short)(0) ;
         initializeNonKey1VM627( ) ;
         sMode627 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode627 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1VM627( ) ;
      if ( RcdFound627 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound627 = (short)(0) ;
      /* Using cursor T01VM11 */
      pr_default.execute(9, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A252CliCod), Integer.valueOf(A252CliCod), A396EmprCod, A65ArtCod, A65ArtCod, Integer.valueOf(A252CliCod), A396EmprCod, A4058CCFColNom, A4058CCFColNom, A65ArtCod, Integer.valueOf(A252CliCod), A396EmprCod, Integer.valueOf(A4059CCFColNum)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T01VM11_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01VM11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01VM11_A252CliCod[0] < A252CliCod ) || ( T01VM11_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01VM11_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01VM11_A65ArtCod[0], A65ArtCod) < 0 ) || ( GXutil.strcmp(T01VM11_A65ArtCod[0], A65ArtCod) == 0 ) && ( T01VM11_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01VM11_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01VM11_A4058CCFColNom[0], A4058CCFColNom) < 0 ) || ( GXutil.strcmp(T01VM11_A4058CCFColNom[0], A4058CCFColNom) == 0 ) && ( GXutil.strcmp(T01VM11_A65ArtCod[0], A65ArtCod) == 0 ) && ( T01VM11_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01VM11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01VM11_A4059CCFColNum[0] < A4059CCFColNum ) ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T01VM11_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01VM11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01VM11_A252CliCod[0] > A252CliCod ) || ( T01VM11_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01VM11_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01VM11_A65ArtCod[0], A65ArtCod) > 0 ) || ( GXutil.strcmp(T01VM11_A65ArtCod[0], A65ArtCod) == 0 ) && ( T01VM11_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01VM11_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01VM11_A4058CCFColNom[0], A4058CCFColNom) > 0 ) || ( GXutil.strcmp(T01VM11_A4058CCFColNom[0], A4058CCFColNom) == 0 ) && ( GXutil.strcmp(T01VM11_A65ArtCod[0], A65ArtCod) == 0 ) && ( T01VM11_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01VM11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01VM11_A4059CCFColNum[0] > A4059CCFColNum ) ) )
         {
            A396EmprCod = T01VM11_A396EmprCod[0] ;
            A252CliCod = T01VM11_A252CliCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A65ArtCod = T01VM11_A65ArtCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
            A4058CCFColNom = T01VM11_A4058CCFColNom[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4058CCFColNom", A4058CCFColNom);
            A4059CCFColNum = T01VM11_A4059CCFColNum[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4059CCFColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4059CCFColNum), 6, 0));
            RcdFound627 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void move_previous( )
   {
      RcdFound627 = (short)(0) ;
      /* Using cursor T01VM12 */
      pr_default.execute(10, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A252CliCod), Integer.valueOf(A252CliCod), A396EmprCod, A65ArtCod, A65ArtCod, Integer.valueOf(A252CliCod), A396EmprCod, A4058CCFColNom, A4058CCFColNom, A65ArtCod, Integer.valueOf(A252CliCod), A396EmprCod, Integer.valueOf(A4059CCFColNum)});
      if ( (pr_default.getStatus(10) != 101) )
      {
         while ( (pr_default.getStatus(10) != 101) && ( ( GXutil.strcmp(T01VM12_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01VM12_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01VM12_A252CliCod[0] > A252CliCod ) || ( T01VM12_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01VM12_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01VM12_A65ArtCod[0], A65ArtCod) > 0 ) || ( GXutil.strcmp(T01VM12_A65ArtCod[0], A65ArtCod) == 0 ) && ( T01VM12_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01VM12_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01VM12_A4058CCFColNom[0], A4058CCFColNom) > 0 ) || ( GXutil.strcmp(T01VM12_A4058CCFColNom[0], A4058CCFColNom) == 0 ) && ( GXutil.strcmp(T01VM12_A65ArtCod[0], A65ArtCod) == 0 ) && ( T01VM12_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01VM12_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01VM12_A4059CCFColNum[0] > A4059CCFColNum ) ) )
         {
            pr_default.readNext(10);
         }
         if ( (pr_default.getStatus(10) != 101) && ( ( GXutil.strcmp(T01VM12_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01VM12_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01VM12_A252CliCod[0] < A252CliCod ) || ( T01VM12_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01VM12_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01VM12_A65ArtCod[0], A65ArtCod) < 0 ) || ( GXutil.strcmp(T01VM12_A65ArtCod[0], A65ArtCod) == 0 ) && ( T01VM12_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01VM12_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01VM12_A4058CCFColNom[0], A4058CCFColNom) < 0 ) || ( GXutil.strcmp(T01VM12_A4058CCFColNom[0], A4058CCFColNom) == 0 ) && ( GXutil.strcmp(T01VM12_A65ArtCod[0], A65ArtCod) == 0 ) && ( T01VM12_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01VM12_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01VM12_A4059CCFColNum[0] < A4059CCFColNum ) ) )
         {
            A396EmprCod = T01VM12_A396EmprCod[0] ;
            A252CliCod = T01VM12_A252CliCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A65ArtCod = T01VM12_A65ArtCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
            A4058CCFColNom = T01VM12_A4058CCFColNom[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4058CCFColNom", A4058CCFColNom);
            A4059CCFColNum = T01VM12_A4059CCFColNum[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4059CCFColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4059CCFColNum), 6, 0));
            RcdFound627 = (short)(1) ;
         }
      }
      pr_default.close(10);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1VM627( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1VM627( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound627 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) || ( GXutil.strcmp(A4058CCFColNom, Z4058CCFColNom) != 0 ) || ( A4059CCFColNum != Z4059CCFColNum ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A252CliCod = Z252CliCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
               A65ArtCod = Z65ArtCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
               A4058CCFColNom = Z4058CCFColNom ;
               httpContext.ajax_rsp_assign_attri("", false, "A4058CCFColNom", A4058CCFColNom);
               A4059CCFColNum = Z4059CCFColNum ;
               httpContext.ajax_rsp_assign_attri("", false, "A4059CCFColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4059CCFColNum), 6, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "CLICOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCliCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtCliCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               update1VM627( ) ;
               GX_FocusControl = edtCliCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) || ( GXutil.strcmp(A4058CCFColNom, Z4058CCFColNom) != 0 ) || ( A4059CCFColNum != Z4059CCFColNum ) )
            {
               /* Insert record */
               GX_FocusControl = edtCliCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1VM627( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "CLICOD");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtCliCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  /* Insert record */
                  GX_FocusControl = edtCliCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1VM627( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) || ( GXutil.strcmp(A4058CCFColNom, Z4058CCFColNom) != 0 ) || ( A4059CCFColNum != Z4059CCFColNum ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = Z252CliCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A65ArtCod = Z65ArtCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
         A4058CCFColNom = Z4058CCFColNom ;
         httpContext.ajax_rsp_assign_attri("", false, "A4058CCFColNom", A4058CCFColNom);
         A4059CCFColNum = Z4059CCFColNum ;
         httpContext.ajax_rsp_assign_attri("", false, "A4059CCFColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4059CCFColNum), 6, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency1VM627( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01VM2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A4058CCFColNom, Integer.valueOf(A4059CCFColNum)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCCSeri"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCCSeri"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1VM627( )
   {
      beforeValidate1VM627( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1VM627( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1VM627( 0) ;
         checkOptimisticConcurrency1VM627( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1VM627( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1VM627( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01VM13 */
                  pr_default.execute(11, new Object[] {A4058CCFColNom, Integer.valueOf(A4059CCFColNum), A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCSeri");
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
                        resetCaption1VM0( ) ;
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
            load1VM627( ) ;
         }
         endLevel1VM627( ) ;
      }
      closeExtendedTableCursors1VM627( ) ;
   }

   public void update1VM627( )
   {
      beforeValidate1VM627( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1VM627( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1VM627( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1VM627( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1VM627( ) ;
               if ( AnyError == 0 )
               {
                  /* No attributes to update on table TXPCCSeri */
                  deferredUpdate1VM627( ) ;
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
         endLevel1VM627( ) ;
      }
      closeExtendedTableCursors1VM627( ) ;
   }

   public void deferredUpdate1VM627( )
   {
   }

   public void delete( )
   {
      beforeValidate1VM627( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1VM627( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1VM627( ) ;
         afterConfirm1VM627( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1VM627( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01VM14 */
               pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A4058CCFColNom, Integer.valueOf(A4059CCFColNum)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCSeri");
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
      sMode627 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1VM627( ) ;
      Gx_mode = sMode627 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1VM627( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01VM15 */
         pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
         A279CliNom = T01VM15_A279CliNom[0] ;
         pr_default.close(13);
         /* Using cursor T01VM16 */
         pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
         A69ArtDsc = T01VM16_A69ArtDsc[0] ;
         n69ArtDsc = T01VM16_n69ArtDsc[0] ;
         pr_default.close(14);
         GXt_int10 = (byte)(AV27OkCol) ;
         GXv_char4[0] = A396EmprCod ;
         GXv_int12[0] = A252CliCod ;
         GXv_char3[0] = A65ArtCod ;
         GXv_char2[0] = A4058CCFColNom ;
         GXv_int11[0] = A4059CCFColNum ;
         GXv_int13[0] = GXt_int10 ;
         new app.controlcalidadhtd.pccchkcol(remoteHandle, context).execute( GXv_char4, GXv_int12, GXv_char3, GXv_char2, GXv_int11, GXv_int13) ;
         controlcalidad_ccseri_impl.this.A396EmprCod = GXv_char4[0] ;
         controlcalidad_ccseri_impl.this.A252CliCod = GXv_int12[0] ;
         controlcalidad_ccseri_impl.this.A65ArtCod = GXv_char3[0] ;
         controlcalidad_ccseri_impl.this.A4058CCFColNom = GXv_char2[0] ;
         controlcalidad_ccseri_impl.this.A4059CCFColNum = GXv_int11[0] ;
         controlcalidad_ccseri_impl.this.GXt_int10 = GXv_int13[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
         httpContext.ajax_rsp_assign_attri("", false, "A4058CCFColNom", A4058CCFColNom);
         httpContext.ajax_rsp_assign_attri("", false, "A4059CCFColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4059CCFColNum), 6, 0));
         AV27OkCol = GXt_int10 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV27OkCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27OkCol), 4, 0));
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T01VM17 */
         pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A4058CCFColNom, Integer.valueOf(A4059CCFColNum)});
         if ( (pr_default.getStatus(15) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CCSer1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(15);
      }
   }

   public void endLevel1VM627( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1VM627( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "controlcalidadhtd.controlcalidad_ccseri");
         if ( AnyError == 0 )
         {
            confirmValues1VM0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "controlcalidadhtd.controlcalidad_ccseri");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1VM627( )
   {
      /* Scan By routine */
      /* Using cursor T01VM18 */
      pr_default.execute(16);
      RcdFound627 = (short)(0) ;
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound627 = (short)(1) ;
         A396EmprCod = T01VM18_A396EmprCod[0] ;
         A252CliCod = T01VM18_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A65ArtCod = T01VM18_A65ArtCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
         A4058CCFColNom = T01VM18_A4058CCFColNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4058CCFColNom", A4058CCFColNom);
         A4059CCFColNum = T01VM18_A4059CCFColNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4059CCFColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4059CCFColNum), 6, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1VM627( )
   {
      /* Scan next routine */
      pr_default.readNext(16);
      RcdFound627 = (short)(0) ;
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound627 = (short)(1) ;
         A396EmprCod = T01VM18_A396EmprCod[0] ;
         A252CliCod = T01VM18_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A65ArtCod = T01VM18_A65ArtCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
         A4058CCFColNom = T01VM18_A4058CCFColNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4058CCFColNom", A4058CCFColNom);
         A4059CCFColNum = T01VM18_A4059CCFColNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4059CCFColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4059CCFColNum), 6, 0));
      }
   }

   public void scanEnd1VM627( )
   {
      pr_default.close(16);
   }

   public void afterConfirm1VM627( )
   {
      /* After Confirm Rules */
      if ( ( AV27OkCol == 0 ) && true /* After */ && ( ( GXutil.strcmp(A4058CCFColNom, " ") != 0 ) || ( A4059CCFColNum > 0 ) ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Atencion. El color NO existe ¡¡¡", ""), 1, "CCFCOLNOM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCCFColNom_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         return  ;
      }
   }

   public void beforeInsert1VM627( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1VM627( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1VM627( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1VM627( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1VM627( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1VM627( )
   {
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtArtCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtCod_Enabled), 5, 0), true);
      edtCCFColNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCFColNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCFColNom_Enabled), 5, 0), true);
      edtCCFColNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCFColNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCFColNum_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      edtavComboclicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavComboclicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavComboclicod_Enabled), 5, 0), true);
      edtavComboartcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavComboartcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavComboartcod_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1VM627( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1VM0( )
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.controlcalidadhtd.controlcalidad_ccseri", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV7EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV8CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV9ArtCod)),GXutil.URLEncode(GXutil.rtrim(AV10CCFColNom)),GXutil.URLEncode(GXutil.ltrimstr(AV11CCFColNum,6,0))}, new String[] {"Gx_mode","EmprCod","CliCod","ArtCod","CCFColNom","CCFColNum"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"ControlCalidad_CCSeri");
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("controlcalidadhtd\\controlcalidad_ccseri:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z65ArtCod", GXutil.rtrim( Z65ArtCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4058CCFColNom", GXutil.rtrim( Z4058CCFColNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4059CCFColNum", GXutil.ltrim( localUtil.ntoc( Z4059CCFColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV20DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV20DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCLICOD_DATA", AV15CliCod_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCLICOD_DATA", AV15CliCod_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vARTCOD_DATA", AV23ArtCod_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vARTCOD_DATA", AV23ArtCod_Data);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTRNCONTEXT", AV13TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTRNCONTEXT", AV13TrnContext);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTRNCONTEXT", getSecureSignedToken( "", AV13TrnContext));
      app.GxWebStd.gx_hidden_field( httpContext, "vDISARTCOD", GXutil.rtrim( AV25DisArtCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDISARTCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV25DisArtCod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vFORBLO", GXutil.rtrim( AV26Forblo));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV7EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vCLICOD", GXutil.ltrim( localUtil.ntoc( AV8CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vARTCOD", GXutil.rtrim( AV9ArtCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vCCFCOLNOM", GXutil.rtrim( AV10CCFColNom));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCCFCOLNOM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV10CCFColNom, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vCCFCOLNUM", GXutil.ltrim( localUtil.ntoc( AV11CCFColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCCFCOLNUM", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV11CCFColNum), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vOKCOL", GXutil.ltrim( localUtil.ntoc( AV27OkCol, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRNOM", GXutil.rtrim( A407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "CLINOM", GXutil.rtrim( A279CliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "ARTDSC", GXutil.rtrim( A69ArtDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICOD_Objectcall", GXutil.rtrim( Combo_clicod_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICOD_Cls", GXutil.rtrim( Combo_clicod_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICOD_Selectedvalue_set", GXutil.rtrim( Combo_clicod_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICOD_Enabled", GXutil.booltostr( Combo_clicod_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICOD_Emptyitem", GXutil.booltostr( Combo_clicod_Emptyitem));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_ARTCOD_Objectcall", GXutil.rtrim( Combo_artcod_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_ARTCOD_Cls", GXutil.rtrim( Combo_artcod_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_ARTCOD_Selectedvalue_set", GXutil.rtrim( Combo_artcod_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_ARTCOD_Enabled", GXutil.booltostr( Combo_artcod_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_ARTCOD_Emptyitemtext", GXutil.rtrim( Combo_artcod_Emptyitemtext));
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
      return formatLink("app.controlcalidadhtd.controlcalidad_ccseri", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV7EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV8CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV9ArtCod)),GXutil.URLEncode(GXutil.rtrim(AV10CCFColNom)),GXutil.URLEncode(GXutil.ltrimstr(AV11CCFColNum,6,0))}, new String[] {"Gx_mode","EmprCod","CliCod","ArtCod","CCFColNom","CCFColNum"})  ;
   }

   public String getPgmname( )
   {
      return "ControlCalidadHTD.ControlCalidad_CCSeri" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Control de Calidad Cliente-Articulo-Color", "") ;
   }

   public void initializeNonKey1VM627( )
   {
      AV27OkCol = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27OkCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27OkCol), 4, 0));
      A279CliNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      A69ArtDsc = "" ;
      n69ArtDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", A69ArtDsc);
   }

   public void initAll1VM627( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A252CliCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A65ArtCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
      A4058CCFColNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4058CCFColNom", A4058CCFColNom);
      A4059CCFColNum = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A4059CCFColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4059CCFColNum), 6, 0));
      initializeNonKey1VM627( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116105818", true, true);
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
      httpContext.AddJavascriptSource("controlcalidadhtd/controlcalidad_ccseri.js", "?202682116105819", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      lblTextblockclicod_Internalname = "TEXTBLOCKCLICOD" ;
      Combo_clicod_Internalname = "COMBO_CLICOD" ;
      edtCliCod_Internalname = "CLICOD" ;
      divTablesplittedclicod_Internalname = "TABLESPLITTEDCLICOD" ;
      lblTextblockartcod_Internalname = "TEXTBLOCKARTCOD" ;
      Combo_artcod_Internalname = "COMBO_ARTCOD" ;
      edtArtCod_Internalname = "ARTCOD" ;
      divTablesplittedartcod_Internalname = "TABLESPLITTEDARTCOD" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      edtCCFColNom_Internalname = "CCFCOLNOM" ;
      imgImgbsc_promptcolor_Internalname = "IMGBSC_PROMPTCOLOR" ;
      edtCCFColNum_Internalname = "CCFCOLNUM" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      bttBtntrn_delete_Internalname = "BTNTRN_DELETE" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtavComboclicod_Internalname = "vCOMBOCLICOD" ;
      divSectionattribute_clicod_Internalname = "SECTIONATTRIBUTE_CLICOD" ;
      edtavComboartcod_Internalname = "vCOMBOARTCOD" ;
      divSectionattribute_artcod_Internalname = "SECTIONATTRIBUTE_ARTCOD" ;
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
      Form.setCaption( httpContext.getMessage( "Control de Calidad Cliente-Articulo-Color", "") );
      edtavComboartcod_Jsonclick = "" ;
      edtavComboartcod_Enabled = 0 ;
      edtavComboartcod_Visible = 1 ;
      edtavComboclicod_Jsonclick = "" ;
      edtavComboclicod_Enabled = 0 ;
      edtavComboclicod_Visible = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      bttBtntrn_delete_Enabled = 0 ;
      bttBtntrn_delete_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      edtCCFColNum_Jsonclick = "" ;
      edtCCFColNum_Enabled = 1 ;
      imgImgbsc_promptcolor_Visible = 1 ;
      edtCCFColNom_Jsonclick = "" ;
      edtCCFColNom_Enabled = 1 ;
      edtArtCod_Jsonclick = "" ;
      edtArtCod_Enabled = 1 ;
      edtArtCod_Visible = 1 ;
      Combo_artcod_Emptyitemtext = "Todos" ;
      Combo_artcod_Cls = "ExtendedCombo AttributeFL" ;
      Combo_artcod_Caption = "" ;
      Combo_artcod_Enabled = GXutil.toBoolean( -1) ;
      edtCliCod_Jsonclick = "" ;
      edtCliCod_Enabled = 1 ;
      edtCliCod_Visible = 1 ;
      Combo_clicod_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_clicod_Cls = "ExtendedCombo AttributeFL" ;
      Combo_clicod_Caption = "" ;
      Combo_clicod_Enabled = GXutil.toBoolean( -1) ;
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

   public void gx10asaokcol1VM627( String A396EmprCod ,
                                   int A252CliCod ,
                                   String A65ArtCod ,
                                   String A4058CCFColNom ,
                                   int A4059CCFColNum )
   {
      GXt_int10 = (byte)(AV27OkCol) ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int12[0] = A252CliCod ;
      GXv_char3[0] = A65ArtCod ;
      GXv_char2[0] = A4058CCFColNom ;
      GXv_int11[0] = A4059CCFColNum ;
      GXv_int13[0] = GXt_int10 ;
      new app.controlcalidadhtd.pccchkcol(remoteHandle, context).execute( GXv_char4, GXv_int12, GXv_char3, GXv_char2, GXv_int11, GXv_int13) ;
      controlcalidad_ccseri_impl.this.A396EmprCod = GXv_char4[0] ;
      controlcalidad_ccseri_impl.this.A252CliCod = GXv_int12[0] ;
      controlcalidad_ccseri_impl.this.A65ArtCod = GXv_char3[0] ;
      controlcalidad_ccseri_impl.this.A4058CCFColNom = GXv_char2[0] ;
      controlcalidad_ccseri_impl.this.A4059CCFColNum = GXv_int11[0] ;
      controlcalidad_ccseri_impl.this.GXt_int10 = GXv_int13[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
      httpContext.ajax_rsp_assign_attri("", false, "A4058CCFColNom", A4058CCFColNom);
      httpContext.ajax_rsp_assign_attri("", false, "A4059CCFColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4059CCFColNum), 6, 0));
      AV27OkCol = GXt_int10 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27OkCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27OkCol), 4, 0));
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV27OkCol, (byte)(4), (byte)(0), ".", "")))+"\"") ;
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

   public void valid_Clicod( )
   {
      /* Using cursor T01VM15 */
      pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(13) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
      }
      A279CliNom = T01VM15_A279CliNom[0] ;
      pr_default.close(13);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
   }

   public void valid_Artcod( )
   {
      n69ArtDsc = false ;
      /* Using cursor T01VM16 */
      pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
      if ( (pr_default.getStatus(14) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ARTICU", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ARTCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
      }
      A69ArtDsc = T01VM16_A69ArtDsc[0] ;
      n69ArtDsc = T01VM16_n69ArtDsc[0] ;
      pr_default.close(14);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", GXutil.rtrim( A69ArtDsc));
   }

   public void valid_Ccfcolnum( )
   {
      GXt_int10 = (byte)(AV27OkCol) ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int12[0] = A252CliCod ;
      GXv_char3[0] = A65ArtCod ;
      GXv_char2[0] = A4058CCFColNom ;
      GXv_int11[0] = A4059CCFColNum ;
      GXv_int13[0] = GXt_int10 ;
      new app.controlcalidadhtd.pccchkcol(remoteHandle, context).execute( GXv_char4, GXv_int12, GXv_char3, GXv_char2, GXv_int11, GXv_int13) ;
      controlcalidad_ccseri_impl.this.A396EmprCod = GXv_char4[0] ;
      controlcalidad_ccseri_impl.this.A252CliCod = GXv_int12[0] ;
      controlcalidad_ccseri_impl.this.A65ArtCod = GXv_char3[0] ;
      controlcalidad_ccseri_impl.this.A4058CCFColNom = GXv_char2[0] ;
      controlcalidad_ccseri_impl.this.A4059CCFColNum = GXv_int11[0] ;
      controlcalidad_ccseri_impl.this.GXt_int10 = GXv_int13[0] ;
      AV27OkCol = GXt_int10 ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV27OkCol", GXutil.ltrim( localUtil.ntoc( AV27OkCol, (byte)(4), (byte)(0), ".", "")));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV8CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV9ArtCod',fld:'vARTCOD',pic:''},{av:'AV10CCFColNom',fld:'vCCFCOLNOM',pic:'',hsh:true},{av:'AV11CCFColNum',fld:'vCCFCOLNUM',pic:'ZZZZZ9',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV13TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true},{av:'AV25DisArtCod',fld:'vDISARTCOD',pic:'',hsh:true},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV10CCFColNom',fld:'vCCFCOLNOM',pic:'',hsh:true},{av:'AV11CCFColNum',fld:'vCCFCOLNUM',pic:'ZZZZZ9',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e131VM2',iparms:[{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A65ArtCod',fld:'ARTCOD',pic:''},{av:'A4058CCFColNom',fld:'CCFCOLNOM',pic:''},{av:'A4059CCFColNum',fld:'CCFCOLNUM',pic:'ZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV13TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true}]");
      setEventMetadata("AFTER TRN",",oparms:[]}");
      setEventMetadata("'DOIMGBSC_PROMPTCOLOR'","{handler:'e111VM627',iparms:[{av:'Combo_clicod_Selectedvalue_get',ctrl:'COMBO_CLICOD',prop:'SelectedValue_get'},{av:'Combo_artcod_Selectedvalue_get',ctrl:'COMBO_ARTCOD',prop:'SelectedValue_get'},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV25DisArtCod',fld:'vDISARTCOD',pic:'',hsh:true}]");
      setEventMetadata("'DOIMGBSC_PROMPTCOLOR'",",oparms:[{av:'AV8CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV9ArtCod',fld:'vARTCOD',pic:''},{av:'A4059CCFColNum',fld:'CCFCOLNUM',pic:'ZZZZZ9'},{av:'A4058CCFColNom',fld:'CCFCOLNOM',pic:''}]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A279CliNom',fld:'CLINOM',pic:''}]");
      setEventMetadata("VALID_CLICOD",",oparms:[{av:'A279CliNom',fld:'CLINOM',pic:''}]}");
      setEventMetadata("VALID_ARTCOD","{handler:'valid_Artcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A65ArtCod',fld:'ARTCOD',pic:''},{av:'A69ArtDsc',fld:'ARTDSC',pic:''}]");
      setEventMetadata("VALID_ARTCOD",",oparms:[{av:'A69ArtDsc',fld:'ARTDSC',pic:''}]}");
      setEventMetadata("VALID_CCFCOLNOM","{handler:'valid_Ccfcolnom',iparms:[]");
      setEventMetadata("VALID_CCFCOLNOM",",oparms:[]}");
      setEventMetadata("VALID_CCFCOLNUM","{handler:'valid_Ccfcolnum',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A65ArtCod',fld:'ARTCOD',pic:''},{av:'A4058CCFColNom',fld:'CCFCOLNOM',pic:''},{av:'A4059CCFColNum',fld:'CCFCOLNUM',pic:'ZZZZZ9'},{av:'AV27OkCol',fld:'vOKCOL',pic:'ZZZ9'}]");
      setEventMetadata("VALID_CCFCOLNUM",",oparms:[{av:'AV27OkCol',fld:'vOKCOL',pic:'ZZZ9'}]}");
      setEventMetadata("VALIDV_COMBOCLICOD","{handler:'validv_Comboclicod',iparms:[]");
      setEventMetadata("VALIDV_COMBOCLICOD",",oparms:[]}");
      setEventMetadata("VALIDV_COMBOARTCOD","{handler:'validv_Comboartcod',iparms:[]");
      setEventMetadata("VALIDV_COMBOARTCOD",",oparms:[]}");
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
      pr_default.close(14);
      pr_default.close(13);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      wcpOAV7EmprCod = "" ;
      wcpOAV9ArtCod = "" ;
      wcpOAV10CCFColNom = "" ;
      Z396EmprCod = "" ;
      Z65ArtCod = "" ;
      Z4058CCFColNom = "" ;
      Combo_clicod_Selectedvalue_get = "" ;
      Combo_artcod_Selectedvalue_get = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A65ArtCod = "" ;
      A4058CCFColNom = "" ;
      Gx_mode = "" ;
      AV7EmprCod = "" ;
      AV9ArtCod = "" ;
      AV10CCFColNom = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      lblTextblockclicod_Jsonclick = "" ;
      ucCombo_clicod = new com.genexus.webpanels.GXUserControl();
      AV20DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV15CliCod_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      TempTags = "" ;
      lblTextblockartcod_Jsonclick = "" ;
      ucCombo_artcod = new com.genexus.webpanels.GXUserControl();
      AV23ArtCod_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      imgImgbsc_promptcolor_gximage = "" ;
      sImgUrl = "" ;
      imgImgbsc_promptcolor_Jsonclick = "" ;
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      AV29Pgmname = "" ;
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      AV24ComboArtCod = "" ;
      AV26Forblo = "" ;
      AV25DisArtCod = "" ;
      A407EmprNom = "" ;
      A279CliNom = "" ;
      A69ArtDsc = "" ;
      Combo_clicod_Objectcall = "" ;
      Combo_clicod_Class = "" ;
      Combo_clicod_Icontype = "" ;
      Combo_clicod_Icon = "" ;
      Combo_clicod_Tooltip = "" ;
      Combo_clicod_Selectedvalue_set = "" ;
      Combo_clicod_Selectedtext_set = "" ;
      Combo_clicod_Selectedtext_get = "" ;
      Combo_clicod_Gamoauthtoken = "" ;
      Combo_clicod_Ddointernalname = "" ;
      Combo_clicod_Titlecontrolalign = "" ;
      Combo_clicod_Dropdownoptionstype = "" ;
      Combo_clicod_Titlecontrolidtoreplace = "" ;
      Combo_clicod_Datalisttype = "" ;
      Combo_clicod_Datalistfixedvalues = "" ;
      Combo_clicod_Datalistproc = "" ;
      Combo_clicod_Datalistprocparametersprefix = "" ;
      Combo_clicod_Remoteservicesparameters = "" ;
      Combo_clicod_Htmltemplate = "" ;
      Combo_clicod_Multiplevaluestype = "" ;
      Combo_clicod_Loadingdata = "" ;
      Combo_clicod_Noresultsfound = "" ;
      Combo_clicod_Emptyitemtext = "" ;
      Combo_clicod_Onlyselectedvalues = "" ;
      Combo_clicod_Selectalltext = "" ;
      Combo_clicod_Multiplevaluesseparator = "" ;
      Combo_clicod_Addnewoptiontext = "" ;
      Combo_artcod_Objectcall = "" ;
      Combo_artcod_Class = "" ;
      Combo_artcod_Icontype = "" ;
      Combo_artcod_Icon = "" ;
      Combo_artcod_Tooltip = "" ;
      Combo_artcod_Selectedvalue_set = "" ;
      Combo_artcod_Selectedtext_set = "" ;
      Combo_artcod_Selectedtext_get = "" ;
      Combo_artcod_Gamoauthtoken = "" ;
      Combo_artcod_Ddointernalname = "" ;
      Combo_artcod_Titlecontrolalign = "" ;
      Combo_artcod_Dropdownoptionstype = "" ;
      Combo_artcod_Titlecontrolidtoreplace = "" ;
      Combo_artcod_Datalisttype = "" ;
      Combo_artcod_Datalistfixedvalues = "" ;
      Combo_artcod_Datalistproc = "" ;
      Combo_artcod_Datalistprocparametersprefix = "" ;
      Combo_artcod_Remoteservicesparameters = "" ;
      Combo_artcod_Htmltemplate = "" ;
      Combo_artcod_Multiplevaluestype = "" ;
      Combo_artcod_Loadingdata = "" ;
      Combo_artcod_Noresultsfound = "" ;
      Combo_artcod_Onlyselectedvalues = "" ;
      Combo_artcod_Selectalltext = "" ;
      Combo_artcod_Multiplevaluesseparator = "" ;
      Combo_artcod_Addnewoptiontext = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      Datamonjs_Objectcall = "" ;
      Datamonjs_Class = "" ;
      Datamonjs_Paramstr = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode627 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      AV22Station = "" ;
      AV18EmprNom = "" ;
      AV19UsurCod = "" ;
      AV12WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext5 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV13TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV14WebSession = httpContext.getWebSession();
      AV28CliNom = "" ;
      GXt_char1 = "" ;
      AV16ComboSelectedValue = "" ;
      GXt_objcol_SdtDVB_SDTComboData_Item8 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTComboData_Item9 = new GXBaseCollection[1] ;
      Z407EmprNom = "" ;
      Z279CliNom = "" ;
      Z69ArtDsc = "" ;
      T01VM4_A407EmprNom = new String[] {""} ;
      T01VM4_n407EmprNom = new boolean[] {false} ;
      T01VM5_A279CliNom = new String[] {""} ;
      T01VM6_A69ArtDsc = new String[] {""} ;
      T01VM6_n69ArtDsc = new boolean[] {false} ;
      T01VM7_A4058CCFColNom = new String[] {""} ;
      T01VM7_A4059CCFColNum = new int[1] ;
      T01VM7_A407EmprNom = new String[] {""} ;
      T01VM7_n407EmprNom = new boolean[] {false} ;
      T01VM7_A279CliNom = new String[] {""} ;
      T01VM7_A69ArtDsc = new String[] {""} ;
      T01VM7_n69ArtDsc = new boolean[] {false} ;
      T01VM7_A396EmprCod = new String[] {""} ;
      T01VM7_A252CliCod = new int[1] ;
      T01VM7_A65ArtCod = new String[] {""} ;
      T01VM8_A279CliNom = new String[] {""} ;
      T01VM9_A69ArtDsc = new String[] {""} ;
      T01VM9_n69ArtDsc = new boolean[] {false} ;
      T01VM10_A396EmprCod = new String[] {""} ;
      T01VM10_A252CliCod = new int[1] ;
      T01VM10_A65ArtCod = new String[] {""} ;
      T01VM10_A4058CCFColNom = new String[] {""} ;
      T01VM10_A4059CCFColNum = new int[1] ;
      T01VM3_A4058CCFColNom = new String[] {""} ;
      T01VM3_A4059CCFColNum = new int[1] ;
      T01VM3_A396EmprCod = new String[] {""} ;
      T01VM3_A252CliCod = new int[1] ;
      T01VM3_A65ArtCod = new String[] {""} ;
      T01VM11_A396EmprCod = new String[] {""} ;
      T01VM11_A252CliCod = new int[1] ;
      T01VM11_A65ArtCod = new String[] {""} ;
      T01VM11_A4058CCFColNom = new String[] {""} ;
      T01VM11_A4059CCFColNum = new int[1] ;
      T01VM12_A396EmprCod = new String[] {""} ;
      T01VM12_A252CliCod = new int[1] ;
      T01VM12_A65ArtCod = new String[] {""} ;
      T01VM12_A4058CCFColNom = new String[] {""} ;
      T01VM12_A4059CCFColNum = new int[1] ;
      T01VM2_A4058CCFColNom = new String[] {""} ;
      T01VM2_A4059CCFColNum = new int[1] ;
      T01VM2_A396EmprCod = new String[] {""} ;
      T01VM2_A252CliCod = new int[1] ;
      T01VM2_A65ArtCod = new String[] {""} ;
      T01VM15_A279CliNom = new String[] {""} ;
      T01VM16_A69ArtDsc = new String[] {""} ;
      T01VM16_n69ArtDsc = new boolean[] {false} ;
      T01VM17_A396EmprCod = new String[] {""} ;
      T01VM17_A252CliCod = new int[1] ;
      T01VM17_A65ArtCod = new String[] {""} ;
      T01VM17_A4058CCFColNom = new String[] {""} ;
      T01VM17_A4059CCFColNum = new int[1] ;
      T01VM17_A4031CCTCod = new int[1] ;
      T01VM18_A396EmprCod = new String[] {""} ;
      T01VM18_A252CliCod = new int[1] ;
      T01VM18_A65ArtCod = new String[] {""} ;
      T01VM18_A4058CCFColNom = new String[] {""} ;
      T01VM18_A4059CCFColNum = new int[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXv_char4 = new String[1] ;
      GXv_int12 = new int[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_int11 = new int[1] ;
      GXv_int13 = new byte[1] ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.controlcalidad_ccseri__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.controlcalidad_ccseri__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.controlcalidad_ccseri__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.controlcalidad_ccseri__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.controlcalidad_ccseri__default(),
         new Object[] {
             new Object[] {
            T01VM2_A4058CCFColNom, T01VM2_A4059CCFColNum, T01VM2_A396EmprCod, T01VM2_A252CliCod, T01VM2_A65ArtCod
            }
            , new Object[] {
            T01VM3_A4058CCFColNom, T01VM3_A4059CCFColNum, T01VM3_A396EmprCod, T01VM3_A252CliCod, T01VM3_A65ArtCod
            }
            , new Object[] {
            T01VM4_A407EmprNom, T01VM4_n407EmprNom
            }
            , new Object[] {
            T01VM5_A279CliNom
            }
            , new Object[] {
            T01VM6_A69ArtDsc, T01VM6_n69ArtDsc
            }
            , new Object[] {
            T01VM7_A4058CCFColNom, T01VM7_A4059CCFColNum, T01VM7_A407EmprNom, T01VM7_n407EmprNom, T01VM7_A279CliNom, T01VM7_A69ArtDsc, T01VM7_n69ArtDsc, T01VM7_A396EmprCod, T01VM7_A252CliCod, T01VM7_A65ArtCod
            }
            , new Object[] {
            T01VM8_A279CliNom
            }
            , new Object[] {
            T01VM9_A69ArtDsc, T01VM9_n69ArtDsc
            }
            , new Object[] {
            T01VM10_A396EmprCod, T01VM10_A252CliCod, T01VM10_A65ArtCod, T01VM10_A4058CCFColNom, T01VM10_A4059CCFColNum
            }
            , new Object[] {
            T01VM11_A396EmprCod, T01VM11_A252CliCod, T01VM11_A65ArtCod, T01VM11_A4058CCFColNom, T01VM11_A4059CCFColNum
            }
            , new Object[] {
            T01VM12_A396EmprCod, T01VM12_A252CliCod, T01VM12_A65ArtCod, T01VM12_A4058CCFColNom, T01VM12_A4059CCFColNum
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01VM15_A279CliNom
            }
            , new Object[] {
            T01VM16_A69ArtDsc, T01VM16_n69ArtDsc
            }
            , new Object[] {
            T01VM17_A396EmprCod, T01VM17_A252CliCod, T01VM17_A65ArtCod, T01VM17_A4058CCFColNom, T01VM17_A4059CCFColNum, T01VM17_A4031CCTCod
            }
            , new Object[] {
            T01VM18_A396EmprCod, T01VM18_A252CliCod, T01VM18_A65ArtCod, T01VM18_A4058CCFColNom, T01VM18_A4059CCFColNum
            }
         }
      );
      AV29Pgmname = "ControlCalidadHTD.ControlCalidad_CCSeri" ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private byte GXt_int10 ;
   private byte GXv_int13[] ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short AV27OkCol ;
   private short RcdFound627 ;
   private short nIsDirty_627 ;
   private short ZV27OkCol ;
   private int wcpOAV8CliCod ;
   private int wcpOAV11CCFColNum ;
   private int Z252CliCod ;
   private int Z4059CCFColNum ;
   private int A252CliCod ;
   private int A4059CCFColNum ;
   private int AV8CliCod ;
   private int AV11CCFColNum ;
   private int trnEnded ;
   private int edtCliCod_Visible ;
   private int edtCliCod_Enabled ;
   private int edtArtCod_Visible ;
   private int edtArtCod_Enabled ;
   private int edtCCFColNom_Enabled ;
   private int imgImgbsc_promptcolor_Visible ;
   private int edtCCFColNum_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int edtavPgmname_Enabled ;
   private int AV17ComboCliCod ;
   private int edtavComboclicod_Enabled ;
   private int edtavComboclicod_Visible ;
   private int edtavComboartcod_Visible ;
   private int edtavComboartcod_Enabled ;
   private int Combo_clicod_Datalistupdateminimumcharacters ;
   private int Combo_artcod_Datalistupdateminimumcharacters ;
   private int Datamonjs_Gxcontroltype ;
   private int GX_JID ;
   private int idxLst ;
   private int GXv_int12[] ;
   private int GXv_int11[] ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV7EmprCod ;
   private String wcpOAV9ArtCod ;
   private String wcpOAV10CCFColNom ;
   private String Z396EmprCod ;
   private String Z65ArtCod ;
   private String Z4058CCFColNom ;
   private String Combo_clicod_Selectedvalue_get ;
   private String Combo_artcod_Selectedvalue_get ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A65ArtCod ;
   private String A4058CCFColNom ;
   private String Gx_mode ;
   private String AV7EmprCod ;
   private String AV9ArtCod ;
   private String AV10CCFColNom ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtCliCod_Internalname ;
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
   private String divTablesplittedclicod_Internalname ;
   private String lblTextblockclicod_Internalname ;
   private String lblTextblockclicod_Jsonclick ;
   private String Combo_clicod_Caption ;
   private String Combo_clicod_Cls ;
   private String Combo_clicod_Internalname ;
   private String TempTags ;
   private String edtCliCod_Jsonclick ;
   private String divTablesplittedartcod_Internalname ;
   private String lblTextblockartcod_Internalname ;
   private String lblTextblockartcod_Jsonclick ;
   private String Combo_artcod_Caption ;
   private String Combo_artcod_Cls ;
   private String Combo_artcod_Emptyitemtext ;
   private String Combo_artcod_Internalname ;
   private String edtArtCod_Internalname ;
   private String edtArtCod_Jsonclick ;
   private String divUnnamedtable2_Internalname ;
   private String edtCCFColNom_Internalname ;
   private String edtCCFColNom_Jsonclick ;
   private String imgImgbsc_promptcolor_gximage ;
   private String sImgUrl ;
   private String imgImgbsc_promptcolor_Internalname ;
   private String imgImgbsc_promptcolor_Jsonclick ;
   private String edtCCFColNum_Internalname ;
   private String edtCCFColNum_Jsonclick ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String edtavPgmname_Internalname ;
   private String AV29Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String divSectionattribute_clicod_Internalname ;
   private String edtavComboclicod_Internalname ;
   private String edtavComboclicod_Jsonclick ;
   private String divSectionattribute_artcod_Internalname ;
   private String edtavComboartcod_Internalname ;
   private String AV24ComboArtCod ;
   private String edtavComboartcod_Jsonclick ;
   private String AV26Forblo ;
   private String AV25DisArtCod ;
   private String A407EmprNom ;
   private String A279CliNom ;
   private String A69ArtDsc ;
   private String Combo_clicod_Objectcall ;
   private String Combo_clicod_Class ;
   private String Combo_clicod_Icontype ;
   private String Combo_clicod_Icon ;
   private String Combo_clicod_Tooltip ;
   private String Combo_clicod_Selectedvalue_set ;
   private String Combo_clicod_Selectedtext_set ;
   private String Combo_clicod_Selectedtext_get ;
   private String Combo_clicod_Gamoauthtoken ;
   private String Combo_clicod_Ddointernalname ;
   private String Combo_clicod_Titlecontrolalign ;
   private String Combo_clicod_Dropdownoptionstype ;
   private String Combo_clicod_Titlecontrolidtoreplace ;
   private String Combo_clicod_Datalisttype ;
   private String Combo_clicod_Datalistfixedvalues ;
   private String Combo_clicod_Datalistproc ;
   private String Combo_clicod_Datalistprocparametersprefix ;
   private String Combo_clicod_Remoteservicesparameters ;
   private String Combo_clicod_Htmltemplate ;
   private String Combo_clicod_Multiplevaluestype ;
   private String Combo_clicod_Loadingdata ;
   private String Combo_clicod_Noresultsfound ;
   private String Combo_clicod_Emptyitemtext ;
   private String Combo_clicod_Onlyselectedvalues ;
   private String Combo_clicod_Selectalltext ;
   private String Combo_clicod_Multiplevaluesseparator ;
   private String Combo_clicod_Addnewoptiontext ;
   private String Combo_artcod_Objectcall ;
   private String Combo_artcod_Class ;
   private String Combo_artcod_Icontype ;
   private String Combo_artcod_Icon ;
   private String Combo_artcod_Tooltip ;
   private String Combo_artcod_Selectedvalue_set ;
   private String Combo_artcod_Selectedtext_set ;
   private String Combo_artcod_Selectedtext_get ;
   private String Combo_artcod_Gamoauthtoken ;
   private String Combo_artcod_Ddointernalname ;
   private String Combo_artcod_Titlecontrolalign ;
   private String Combo_artcod_Dropdownoptionstype ;
   private String Combo_artcod_Titlecontrolidtoreplace ;
   private String Combo_artcod_Datalisttype ;
   private String Combo_artcod_Datalistfixedvalues ;
   private String Combo_artcod_Datalistproc ;
   private String Combo_artcod_Datalistprocparametersprefix ;
   private String Combo_artcod_Remoteservicesparameters ;
   private String Combo_artcod_Htmltemplate ;
   private String Combo_artcod_Multiplevaluestype ;
   private String Combo_artcod_Loadingdata ;
   private String Combo_artcod_Noresultsfound ;
   private String Combo_artcod_Onlyselectedvalues ;
   private String Combo_artcod_Selectalltext ;
   private String Combo_artcod_Multiplevaluesseparator ;
   private String Combo_artcod_Addnewoptiontext ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String Datamonjs_Objectcall ;
   private String Datamonjs_Class ;
   private String Datamonjs_Paramstr ;
   private String hsh ;
   private String sMode627 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String AV22Station ;
   private String AV18EmprNom ;
   private String AV19UsurCod ;
   private String AV28CliNom ;
   private String GXt_char1 ;
   private String Z407EmprNom ;
   private String Z279CliNom ;
   private String Z69ArtDsc ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean Dvpanel_tableattributes_Autowidth ;
   private boolean Dvpanel_tableattributes_Autoheight ;
   private boolean Dvpanel_tableattributes_Collapsible ;
   private boolean Dvpanel_tableattributes_Collapsed ;
   private boolean Dvpanel_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_tableattributes_Autoscroll ;
   private boolean Combo_clicod_Emptyitem ;
   private boolean n407EmprNom ;
   private boolean n69ArtDsc ;
   private boolean Combo_clicod_Enabled ;
   private boolean Combo_clicod_Visible ;
   private boolean Combo_clicod_Allowmultipleselection ;
   private boolean Combo_clicod_Isgriditem ;
   private boolean Combo_clicod_Hasdescription ;
   private boolean Combo_clicod_Includeonlyselectedoption ;
   private boolean Combo_clicod_Includeselectalloption ;
   private boolean Combo_clicod_Includeaddnewoption ;
   private boolean Combo_artcod_Enabled ;
   private boolean Combo_artcod_Visible ;
   private boolean Combo_artcod_Allowmultipleselection ;
   private boolean Combo_artcod_Isgriditem ;
   private boolean Combo_artcod_Hasdescription ;
   private boolean Combo_artcod_Includeonlyselectedoption ;
   private boolean Combo_artcod_Includeselectalloption ;
   private boolean Combo_artcod_Emptyitem ;
   private boolean Combo_artcod_Includeaddnewoption ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean Datamonjs_Enabled ;
   private boolean Datamonjs_Visible ;
   private boolean returnInSub ;
   private String AV16ComboSelectedValue ;
   private com.genexus.webpanels.WebSession AV14WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.webpanels.GXUserControl ucCombo_clicod ;
   private com.genexus.webpanels.GXUserControl ucCombo_artcod ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private String[] T01VM4_A407EmprNom ;
   private boolean[] T01VM4_n407EmprNom ;
   private String[] T01VM5_A279CliNom ;
   private String[] T01VM6_A69ArtDsc ;
   private boolean[] T01VM6_n69ArtDsc ;
   private String[] T01VM7_A4058CCFColNom ;
   private int[] T01VM7_A4059CCFColNum ;
   private String[] T01VM7_A407EmprNom ;
   private boolean[] T01VM7_n407EmprNom ;
   private String[] T01VM7_A279CliNom ;
   private String[] T01VM7_A69ArtDsc ;
   private boolean[] T01VM7_n69ArtDsc ;
   private String[] T01VM7_A396EmprCod ;
   private int[] T01VM7_A252CliCod ;
   private String[] T01VM7_A65ArtCod ;
   private String[] T01VM8_A279CliNom ;
   private String[] T01VM9_A69ArtDsc ;
   private boolean[] T01VM9_n69ArtDsc ;
   private String[] T01VM10_A396EmprCod ;
   private int[] T01VM10_A252CliCod ;
   private String[] T01VM10_A65ArtCod ;
   private String[] T01VM10_A4058CCFColNom ;
   private int[] T01VM10_A4059CCFColNum ;
   private String[] T01VM3_A4058CCFColNom ;
   private int[] T01VM3_A4059CCFColNum ;
   private String[] T01VM3_A396EmprCod ;
   private int[] T01VM3_A252CliCod ;
   private String[] T01VM3_A65ArtCod ;
   private String[] T01VM11_A396EmprCod ;
   private int[] T01VM11_A252CliCod ;
   private String[] T01VM11_A65ArtCod ;
   private String[] T01VM11_A4058CCFColNom ;
   private int[] T01VM11_A4059CCFColNum ;
   private String[] T01VM12_A396EmprCod ;
   private int[] T01VM12_A252CliCod ;
   private String[] T01VM12_A65ArtCod ;
   private String[] T01VM12_A4058CCFColNom ;
   private int[] T01VM12_A4059CCFColNum ;
   private String[] T01VM2_A4058CCFColNom ;
   private int[] T01VM2_A4059CCFColNum ;
   private String[] T01VM2_A396EmprCod ;
   private int[] T01VM2_A252CliCod ;
   private String[] T01VM2_A65ArtCod ;
   private String[] T01VM15_A279CliNom ;
   private String[] T01VM16_A69ArtDsc ;
   private boolean[] T01VM16_n69ArtDsc ;
   private String[] T01VM17_A396EmprCod ;
   private int[] T01VM17_A252CliCod ;
   private String[] T01VM17_A65ArtCod ;
   private String[] T01VM17_A4058CCFColNom ;
   private int[] T01VM17_A4059CCFColNum ;
   private int[] T01VM17_A4031CCTCod ;
   private String[] T01VM18_A396EmprCod ;
   private int[] T01VM18_A252CliCod ;
   private String[] T01VM18_A65ArtCod ;
   private String[] T01VM18_A4058CCFColNom ;
   private int[] T01VM18_A4059CCFColNum ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV15CliCod_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV23ArtCod_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXt_objcol_SdtDVB_SDTComboData_Item8 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXv_objcol_SdtDVB_SDTComboData_Item9[] ;
   private app.wwpbaseobjects.SdtWWPContext AV12WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext5[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV13TrnContext ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV20DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7[] ;
}

final  class controlcalidad_ccseri__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class controlcalidad_ccseri__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class controlcalidad_ccseri__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class controlcalidad_ccseri__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class controlcalidad_ccseri__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01VM2", "SELECT CCFColNom, CCFColNum, EmprCod, CliCod, ArtCod FROM TXPCCSeri WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND CCFColNom = ? AND CCFColNum = ?  FOR UPDATE OF CCFColNom NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01VM3", "SELECT CCFColNom, CCFColNum, EmprCod, CliCod, ArtCod FROM TXPCCSeri WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND CCFColNom = ? AND CCFColNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01VM4", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01VM5", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01VM6", "SELECT ArtDsc FROM TXPARTICU WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01VM7", "SELECT /*+ FIRST_ROWS(100) */ TM1.CCFColNom, TM1.CCFColNum, T2.EmprNom, T3.CliNom, T4.ArtDsc, TM1.EmprCod, TM1.CliCod, TM1.ArtCod FROM (((TXPCCSeri TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = TM1.EmprCod AND T3.CliCod = TM1.CliCod) INNER JOIN TXPARTICU T4 ON T4.EmprCod = TM1.EmprCod AND T4.CliCod = TM1.CliCod AND T4.ArtCod = TM1.ArtCod) WHERE TM1.EmprCod = ? and TM1.CliCod = ? and TM1.ArtCod = ? and TM1.CCFColNom = ? and TM1.CCFColNum = ? ORDER BY TM1.EmprCod, TM1.CliCod, TM1.ArtCod, TM1.CCFColNom, TM1.CCFColNum ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01VM8", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01VM9", "SELECT ArtDsc FROM TXPARTICU WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01VM10", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, ArtCod, CCFColNom, CCFColNum FROM TXPCCSeri WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND CCFColNom = ? AND CCFColNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01VM11", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, ArtCod, CCFColNom, CCFColNum FROM TXPCCSeri WHERE ( EmprCod > ? or EmprCod = ? and CliCod > ? or CliCod = ? and EmprCod = ? and ArtCod > ? or ArtCod = ? and CliCod = ? and EmprCod = ? and CCFColNom > ? or CCFColNom = ? and ArtCod = ? and CliCod = ? and EmprCod = ? and CCFColNum > ?) ORDER BY EmprCod, CliCod, ArtCod, CCFColNom, CCFColNum) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01VM12", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, ArtCod, CCFColNom, CCFColNum FROM TXPCCSeri WHERE ( EmprCod < ? or EmprCod = ? and CliCod < ? or CliCod = ? and EmprCod = ? and ArtCod < ? or ArtCod = ? and CliCod = ? and EmprCod = ? and CCFColNom < ? or CCFColNom = ? and ArtCod = ? and CliCod = ? and EmprCod = ? and CCFColNum < ?) ORDER BY EmprCod DESC, CliCod DESC, ArtCod DESC, CCFColNom DESC, CCFColNum DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01VM13", "INSERT INTO TXPCCSeri(CCFColNom, CCFColNum, EmprCod, CliCod, ArtCod) VALUES(?, ?, ?, ?, ?)", GX_NOMASK, "TXPCCSeri")
         ,new UpdateCursor("T01VM14", "DELETE FROM TXPCCSeri  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND CCFColNom = ? AND CCFColNum = ?", GX_NOMASK, "TXPCCSeri")
         ,new ForEachCursor("T01VM15", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01VM16", "SELECT ArtDsc FROM TXPARTICU WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01VM17", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, CCFColNom, CCFColNum, CCTCod FROM TXPCCSer1 WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND CCFColNom = ? AND CCFColNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01VM18", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, CliCod, ArtCod, CCFColNom, CCFColNum FROM TXPCCSeri ORDER BY EmprCod, CliCod, ArtCod, CCFColNom, CCFColNum ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 13);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 13);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 13);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 30);
               ((String[]) buf[5])[0] = rslt.getString(5, 26);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 3);
               ((int[]) buf[8])[0] = rslt.getInt(7);
               ((String[]) buf[9])[0] = rslt.getString(8, 16);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
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
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 3);
               stmt.setString(6, (String)parms[5], 16);
               stmt.setString(7, (String)parms[6], 16);
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setString(9, (String)parms[8], 3);
               stmt.setString(10, (String)parms[9], 13);
               stmt.setString(11, (String)parms[10], 13);
               stmt.setString(12, (String)parms[11], 16);
               stmt.setInt(13, ((Number) parms[12]).intValue());
               stmt.setString(14, (String)parms[13], 3);
               stmt.setInt(15, ((Number) parms[14]).intValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 3);
               stmt.setString(6, (String)parms[5], 16);
               stmt.setString(7, (String)parms[6], 16);
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setString(9, (String)parms[8], 3);
               stmt.setString(10, (String)parms[9], 13);
               stmt.setString(11, (String)parms[10], 13);
               stmt.setString(12, (String)parms[11], 16);
               stmt.setInt(13, ((Number) parms[12]).intValue());
               stmt.setString(14, (String)parms[13], 3);
               stmt.setInt(15, ((Number) parms[14]).intValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 13);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 16);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               return;
      }
   }

}

