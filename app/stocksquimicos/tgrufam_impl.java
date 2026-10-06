package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tgrufam_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel9"+"_"+"") == 0 )
      {
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_15") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A11634TaesId = httpContext.GetPar( "TaesId") ;
         n11634TaesId = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11634TaesId", A11634TaesId);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_15( A396EmprCod, A11634TaesId) ;
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
            AV28EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28EmprCod", AV28EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV28EmprCod, "@!"))));
            AV29GrpFamCod = (byte)(GXutil.lval( httpContext.GetPar( "GrpFamCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29GrpFamCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29GrpFamCod), 2, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGRPFAMCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV29GrpFamCod), "Z9")));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Familias Productos", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtGrpFamCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public tgrufam_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tgrufam_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tgrufam_impl.class ));
   }

   public tgrufam_impl( int remoteHandle ,
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtGrpFamCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtGrpFamCod_Internalname, httpContext.getMessage( "Familia", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtGrpFamCod_Internalname, GXutil.ltrim( localUtil.ntoc( A499GrpFamCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A499GrpFamCod), "Z9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtGrpFamCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtGrpFamCod_Enabled, 1, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\TGRUFAM.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtGrpFamDsc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtGrpFamDsc_Internalname, httpContext.getMessage( "Descripcion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtGrpFamDsc_Internalname, GXutil.rtrim( A500GrpFamDsc), GXutil.rtrim( localUtil.format( A500GrpFamDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,29);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtGrpFamDsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtGrpFamDsc_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_StocksQuimicos\\TGRUFAM.htm");
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
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, divUnnamedtable2_Visible, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtTaesId_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtTaesId_Internalname, httpContext.getMessage( "Codigo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 37,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTaesId_Internalname, GXutil.rtrim( A11634TaesId), GXutil.rtrim( localUtil.format( A11634TaesId, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,37);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTaesId_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtTaesId_Enabled, 1, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_StocksQuimicos\\TGRUFAM.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtTaesDc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtTaesDc_Internalname, httpContext.getMessage( "Descripcion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtTaesDc_Internalname, GXutil.rtrim( A11635TaesDc), GXutil.rtrim( localUtil.format( A11635TaesDc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTaesDc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtTaesDc_Enabled, 0, "text", "", 80, "chr", 1, "row", 80, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_StocksQuimicos\\TGRUFAM.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_StocksQuimicos\\TGRUFAM.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 48,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_StocksQuimicos\\TGRUFAM.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 50,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_StocksQuimicos\\TGRUFAM.htm");
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
      e11142 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z499GrpFamCod = (byte)(localUtil.ctol( httpContext.cgiGet( "Z499GrpFamCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z500GrpFamDsc = httpContext.cgiGet( "Z500GrpFamDsc") ;
            Z11634TaesId = httpContext.cgiGet( "Z11634TaesId") ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            N11634TaesId = httpContext.cgiGet( "N11634TaesId") ;
            A13745GrpCDsc = httpContext.cgiGet( "GRPCDSC") ;
            AV28EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            A396EmprCod = httpContext.cgiGet( "EMPRCOD") ;
            AV29GrpFamCod = (byte)(localUtil.ctol( httpContext.cgiGet( "vGRPFAMCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV33Insert_TaesId = httpContext.cgiGet( "vINSERT_TAESID") ;
            A407EmprNom = httpContext.cgiGet( "EMPRNOM") ;
            n407EmprNom = false ;
            AV35Pgmname = httpContext.cgiGet( "vPGMNAME") ;
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
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtGrpFamCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtGrpFamCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "GRPFAMCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtGrpFamCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A499GrpFamCod = (byte)(0) ;
               n499GrpFamCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A499GrpFamCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A499GrpFamCod), 2, 0));
            }
            else
            {
               A499GrpFamCod = (byte)(localUtil.ctol( httpContext.cgiGet( edtGrpFamCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n499GrpFamCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A499GrpFamCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A499GrpFamCod), 2, 0));
            }
            A500GrpFamDsc = httpContext.cgiGet( edtGrpFamDsc_Internalname) ;
            n500GrpFamDsc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A500GrpFamDsc", A500GrpFamDsc);
            A11634TaesId = httpContext.cgiGet( edtTaesId_Internalname) ;
            n11634TaesId = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11634TaesId", A11634TaesId);
            A11635TaesDc = httpContext.cgiGet( edtTaesDc_Internalname) ;
            n11635TaesDc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11635TaesDc", A11635TaesDc);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"TGRUFAM");
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( A499GrpFamCod != Z499GrpFamCod ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("stocksquimicos\\tgrufam:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               A499GrpFamCod = (byte)(GXutil.lval( httpContext.GetPar( "GrpFamCod"))) ;
               n499GrpFamCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A499GrpFamCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A499GrpFamCod), 2, 0));
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
                  sMode50 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  Gx_mode = sMode50 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound50 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_140( ) ;
                        if ( AnyError == 0 )
                        {
                           GX_FocusControl = bttBtntrn_enter_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noinsert"), 1, "GRPFAMCOD");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtGrpFamCod_Internalname ;
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
                        e11142 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e12142 ();
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
         e12142 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll1450( ) ;
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
         disableAttributes1450( ) ;
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

   public void confirm_140( )
   {
      beforeValidate1450( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1450( ) ;
         }
         else
         {
            checkExtendedTable1450( ) ;
            closeExtendedTableCursors1450( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
   }

   public void resetCaption140( )
   {
   }

   public void e11142( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV22Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      tgrufam_impl.this.GXt_char1 = GXv_char2[0] ;
      AV22Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22Station", AV22Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV16EmprNom ;
      GXv_char4[0] = AV17UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV22Station, GXv_char2, GXv_char3, GXv_char4) ;
      tgrufam_impl.this.A396EmprCod = GXv_char2[0] ;
      tgrufam_impl.this.AV16EmprNom = GXv_char3[0] ;
      tgrufam_impl.this.AV17UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV16EmprNom", AV16EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
      GXt_int5 = AV27Eliot ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ELIOT", ""), GXv_int6) ;
      tgrufam_impl.this.GXt_int5 = GXv_int6[0] ;
      AV27Eliot = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27Eliot", GXutil.str( AV27Eliot, 1, 0));
      GXt_char1 = AV22Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      tgrufam_impl.this.GXt_char1 = GXv_char4[0] ;
      AV22Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22Station", AV22Station);
      GXv_char4[0] = AV28EmprCod ;
      GXv_char3[0] = AV16EmprNom ;
      GXv_char2[0] = AV17UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV22Station, GXv_char4, GXv_char3, GXv_char2) ;
      tgrufam_impl.this.AV28EmprCod = GXv_char4[0] ;
      tgrufam_impl.this.AV16EmprNom = GXv_char3[0] ;
      tgrufam_impl.this.AV17UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28EmprCod", AV28EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV28EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV16EmprNom", AV16EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
      GXv_SdtWWPContext7[0] = AV30WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext7) ;
      AV30WWPContext = GXv_SdtWWPContext7[0] ;
      /* Execute user subroutine: 'ATTRIBUTESSECURITYCODE' */
      S112 ();
      if ( returnInSub )
      {
         pr_default.close(3);
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      AV31TrnContext.fromxml(AV32WebSession.getValue("TrnContext"), null, null);
      if ( ( GXutil.strcmp(AV31TrnContext.getgxTv_SdtWWPTransactionContext_Transactionname(), AV35Pgmname) == 0 ) && ( GXutil.strcmp(Gx_mode, "INS") == 0 ) )
      {
         AV36GXV1 = 1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV36GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36GXV1), 8, 0));
         while ( AV36GXV1 <= AV31TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().size() )
         {
            AV34TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)((app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)AV31TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().elementAt(-1+AV36GXV1));
            if ( GXutil.strcmp(AV34TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "TaesId") == 0 )
            {
               AV33Insert_TaesId = AV34TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue() ;
               httpContext.ajax_rsp_assign_attri("", false, "AV33Insert_TaesId", AV33Insert_TaesId);
            }
            AV36GXV1 = (int)(AV36GXV1+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36GXV1), 8, 0));
         }
      }
   }

   public void e12142( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV31TrnContext.getgxTv_SdtWWPTransactionContext_Callerondelete() )
      {
         callWebObject(formatLink("app.stocksquimicos.tgrufamww", new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
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

   public void S112( )
   {
      /* 'ATTRIBUTESSECURITYCODE' Routine */
      returnInSub = false ;
   }

   public void zm1450( int GX_JID )
   {
      if ( ( GX_JID == 13 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z500GrpFamDsc = T00143_A500GrpFamDsc[0] ;
            Z11634TaesId = T00143_A11634TaesId[0] ;
         }
         else
         {
            Z500GrpFamDsc = A500GrpFamDsc ;
            Z11634TaesId = A11634TaesId ;
         }
      }
      if ( GX_JID == -13 )
      {
         Z499GrpFamCod = A499GrpFamCod ;
         Z500GrpFamDsc = A500GrpFamDsc ;
         Z396EmprCod = A396EmprCod ;
         Z11634TaesId = A11634TaesId ;
         Z407EmprNom = A407EmprNom ;
         Z11635TaesDc = A11635TaesDc ;
      }
   }

   public void standaloneNotModal( )
   {
      AV35Pgmname = "StocksQuimicos.TGRUFAM" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35Pgmname", AV35Pgmname);
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV28EmprCod)==0) )
      {
         A396EmprCod = AV28EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      /* Using cursor T00144 */
      pr_default.execute(2, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T00144_A407EmprNom[0] ;
      n407EmprNom = T00144_n407EmprNom[0] ;
      pr_default.close(2);
      GXt_int5 = (byte)(0) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "ELIOT", ""), ""), GXv_int6) ;
      tgrufam_impl.this.GXt_int5 = GXv_int6[0] ;
      divUnnamedtable2_Visible = (((GXt_int5==1)) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, divUnnamedtable2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(divUnnamedtable2_Visible), 5, 0), true);
      if ( ! (0==AV29GrpFamCod) )
      {
         A499GrpFamCod = AV29GrpFamCod ;
         n499GrpFamCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A499GrpFamCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A499GrpFamCod), 2, 0));
      }
      if ( ! (0==AV29GrpFamCod) )
      {
         edtGrpFamCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtGrpFamCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGrpFamCod_Enabled), 5, 0), true);
      }
      else
      {
         edtGrpFamCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtGrpFamCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGrpFamCod_Enabled), 5, 0), true);
      }
      if ( ! (0==AV29GrpFamCod) )
      {
         edtGrpFamCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtGrpFamCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGrpFamCod_Enabled), 5, 0), true);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (GXutil.strcmp("", AV33Insert_TaesId)==0) )
      {
         edtTaesId_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTaesId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTaesId_Enabled), 5, 0), true);
      }
      else
      {
         edtTaesId_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTaesId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTaesId_Enabled), 5, 0), true);
      }
   }

   public void standaloneModal( )
   {
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (GXutil.strcmp("", AV33Insert_TaesId)==0) )
      {
         A11634TaesId = AV33Insert_TaesId ;
         n11634TaesId = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11634TaesId", A11634TaesId);
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
         /* Using cursor T00145 */
         pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n11634TaesId), A11634TaesId});
         A11635TaesDc = T00145_A11635TaesDc[0] ;
         n11635TaesDc = T00145_n11635TaesDc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11635TaesDc", A11635TaesDc);
         pr_default.close(3);
      }
   }

   public void load1450( )
   {
      /* Using cursor T00146 */
      pr_default.execute(4, new Object[] {A396EmprCod, Boolean.valueOf(n499GrpFamCod), Byte.valueOf(A499GrpFamCod)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound50 = (short)(1) ;
         A500GrpFamDsc = T00146_A500GrpFamDsc[0] ;
         n500GrpFamDsc = T00146_n500GrpFamDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A500GrpFamDsc", A500GrpFamDsc);
         A407EmprNom = T00146_A407EmprNom[0] ;
         n407EmprNom = T00146_n407EmprNom[0] ;
         A11635TaesDc = T00146_A11635TaesDc[0] ;
         n11635TaesDc = T00146_n11635TaesDc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11635TaesDc", A11635TaesDc);
         A11634TaesId = T00146_A11634TaesId[0] ;
         n11634TaesId = T00146_n11634TaesId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11634TaesId", A11634TaesId);
         zm1450( -13) ;
      }
      pr_default.close(4);
      onLoadActions1450( ) ;
   }

   public void onLoadActions1450( )
   {
      A13745GrpCDsc = GXutil.trim( GXutil.str( A499GrpFamCod, 2, 0)) + "-" + GXutil.trim( A500GrpFamDsc) ;
      httpContext.ajax_rsp_assign_attri("", false, "A13745GrpCDsc", A13745GrpCDsc);
   }

   public void checkExtendedTable1450( )
   {
      nIsDirty_50 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      nIsDirty_50 = (short)(1) ;
      A13745GrpCDsc = GXutil.trim( GXutil.str( A499GrpFamCod, 2, 0)) + "-" + GXutil.trim( A500GrpFamDsc) ;
      httpContext.ajax_rsp_assign_attri("", false, "A13745GrpCDsc", A13745GrpCDsc);
      /* Using cursor T00145 */
      pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n11634TaesId), A11634TaesId});
      if ( (pr_default.getStatus(3) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (GXutil.strcmp("", A11634TaesId)==0) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TABLAS DE DOSIFICACION", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TAESID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTaesId_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A11635TaesDc = T00145_A11635TaesDc[0] ;
      n11635TaesDc = T00145_n11635TaesDc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A11635TaesDc", A11635TaesDc);
      pr_default.close(3);
   }

   public void closeExtendedTableCursors1450( )
   {
      pr_default.close(3);
   }

   public void enableDisable( )
   {
   }

   public void gxload_15( String A396EmprCod ,
                          String A11634TaesId )
   {
      /* Using cursor T00147 */
      pr_default.execute(5, new Object[] {A396EmprCod, Boolean.valueOf(n11634TaesId), A11634TaesId});
      if ( (pr_default.getStatus(5) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (GXutil.strcmp("", A11634TaesId)==0) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TABLAS DE DOSIFICACION", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TAESID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTaesId_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A11635TaesDc = T00147_A11635TaesDc[0] ;
      n11635TaesDc = T00147_n11635TaesDc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A11635TaesDc", A11635TaesDc);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A11635TaesDc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(5) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(5);
   }

   public void getKey1450( )
   {
      /* Using cursor T00148 */
      pr_default.execute(6, new Object[] {A396EmprCod, Boolean.valueOf(n499GrpFamCod), Byte.valueOf(A499GrpFamCod)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound50 = (short)(1) ;
      }
      else
      {
         RcdFound50 = (short)(0) ;
      }
      pr_default.close(6);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T00143 */
      pr_default.execute(1, new Object[] {A396EmprCod, Boolean.valueOf(n499GrpFamCod), Byte.valueOf(A499GrpFamCod)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T00143_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1450( 13) ;
         RcdFound50 = (short)(1) ;
         A499GrpFamCod = T00143_A499GrpFamCod[0] ;
         n499GrpFamCod = T00143_n499GrpFamCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A499GrpFamCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A499GrpFamCod), 2, 0));
         A500GrpFamDsc = T00143_A500GrpFamDsc[0] ;
         n500GrpFamDsc = T00143_n500GrpFamDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A500GrpFamDsc", A500GrpFamDsc);
         A11634TaesId = T00143_A11634TaesId[0] ;
         n11634TaesId = T00143_n11634TaesId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11634TaesId", A11634TaesId);
         Z396EmprCod = A396EmprCod ;
         Z499GrpFamCod = A499GrpFamCod ;
         sMode50 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1450( ) ;
         if ( AnyError == 1 )
         {
            RcdFound50 = (short)(0) ;
            initializeNonKey1450( ) ;
         }
         Gx_mode = sMode50 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound50 = (short)(0) ;
         initializeNonKey1450( ) ;
         sMode50 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode50 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1450( ) ;
      if ( RcdFound50 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound50 = (short)(0) ;
      /* Using cursor T00149 */
      pr_default.execute(7, new Object[] {Boolean.valueOf(n499GrpFamCod), Byte.valueOf(A499GrpFamCod), A396EmprCod});
      if ( (pr_default.getStatus(7) != 101) )
      {
         while ( (pr_default.getStatus(7) != 101) && ( ( T00149_A499GrpFamCod[0] < A499GrpFamCod ) ) && ( GXutil.strcmp(T00149_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(7);
         }
         if ( (pr_default.getStatus(7) != 101) && ( ( T00149_A499GrpFamCod[0] > A499GrpFamCod ) ) && ( GXutil.strcmp(T00149_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A499GrpFamCod = T00149_A499GrpFamCod[0] ;
            n499GrpFamCod = T00149_n499GrpFamCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A499GrpFamCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A499GrpFamCod), 2, 0));
            RcdFound50 = (short)(1) ;
         }
      }
      pr_default.close(7);
   }

   public void move_previous( )
   {
      RcdFound50 = (short)(0) ;
      /* Using cursor T001410 */
      pr_default.execute(8, new Object[] {Boolean.valueOf(n499GrpFamCod), Byte.valueOf(A499GrpFamCod), A396EmprCod});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( ( T001410_A499GrpFamCod[0] > A499GrpFamCod ) ) && ( GXutil.strcmp(T001410_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( ( T001410_A499GrpFamCod[0] < A499GrpFamCod ) ) && ( GXutil.strcmp(T001410_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A499GrpFamCod = T001410_A499GrpFamCod[0] ;
            n499GrpFamCod = T001410_n499GrpFamCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A499GrpFamCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A499GrpFamCod), 2, 0));
            RcdFound50 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1450( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtGrpFamCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1450( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound50 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A499GrpFamCod != Z499GrpFamCod ) )
            {
               A499GrpFamCod = Z499GrpFamCod ;
               n499GrpFamCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A499GrpFamCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A499GrpFamCod), 2, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "GRPFAMCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtGrpFamCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtGrpFamCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               update1450( ) ;
               GX_FocusControl = edtGrpFamCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A499GrpFamCod != Z499GrpFamCod ) )
            {
               /* Insert record */
               GX_FocusControl = edtGrpFamCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1450( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "GRPFAMCOD");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtGrpFamCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  /* Insert record */
                  GX_FocusControl = edtGrpFamCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1450( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A499GrpFamCod != Z499GrpFamCod ) )
      {
         A499GrpFamCod = Z499GrpFamCod ;
         n499GrpFamCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A499GrpFamCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A499GrpFamCod), 2, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "GRPFAMCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtGrpFamCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtGrpFamCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency1450( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00142 */
         pr_default.execute(0, new Object[] {A396EmprCod, Boolean.valueOf(n499GrpFamCod), Byte.valueOf(A499GrpFamCod)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPGRUFAM"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z500GrpFamDsc, T00142_A500GrpFamDsc[0]) != 0 ) || ( GXutil.strcmp(Z11634TaesId, T00142_A11634TaesId[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z500GrpFamDsc, T00142_A500GrpFamDsc[0]) != 0 )
            {
               GXutil.writeLogln("stocksquimicos.tgrufam:[seudo value changed for attri]"+"GrpFamDsc");
               GXutil.writeLogRaw("Old: ",Z500GrpFamDsc);
               GXutil.writeLogRaw("Current: ",T00142_A500GrpFamDsc[0]);
            }
            if ( GXutil.strcmp(Z11634TaesId, T00142_A11634TaesId[0]) != 0 )
            {
               GXutil.writeLogln("stocksquimicos.tgrufam:[seudo value changed for attri]"+"TaesId");
               GXutil.writeLogRaw("Old: ",Z11634TaesId);
               GXutil.writeLogRaw("Current: ",T00142_A11634TaesId[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPGRUFAM"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1450( )
   {
      beforeValidate1450( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1450( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1450( 0) ;
         checkOptimisticConcurrency1450( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1450( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1450( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T001411 */
                  pr_default.execute(9, new Object[] {Boolean.valueOf(n499GrpFamCod), Byte.valueOf(A499GrpFamCod), Boolean.valueOf(n500GrpFamDsc), A500GrpFamDsc, A396EmprCod, Boolean.valueOf(n11634TaesId), A11634TaesId});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPGRUFAM");
                  if ( (pr_default.getStatus(9) == 1) )
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
                        resetCaption140( ) ;
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
            load1450( ) ;
         }
         endLevel1450( ) ;
      }
      closeExtendedTableCursors1450( ) ;
   }

   public void update1450( )
   {
      beforeValidate1450( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1450( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1450( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1450( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1450( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T001412 */
                  pr_default.execute(10, new Object[] {Boolean.valueOf(n500GrpFamDsc), A500GrpFamDsc, Boolean.valueOf(n11634TaesId), A11634TaesId, A396EmprCod, Boolean.valueOf(n499GrpFamCod), Byte.valueOf(A499GrpFamCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPGRUFAM");
                  if ( (pr_default.getStatus(10) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPGRUFAM"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1450( ) ;
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
         endLevel1450( ) ;
      }
      closeExtendedTableCursors1450( ) ;
   }

   public void deferredUpdate1450( )
   {
   }

   public void delete( )
   {
      beforeValidate1450( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1450( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1450( ) ;
         afterConfirm1450( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1450( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T001413 */
               pr_default.execute(11, new Object[] {A396EmprCod, Boolean.valueOf(n499GrpFamCod), Byte.valueOf(A499GrpFamCod)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPGRUFAM");
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
      sMode50 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1450( ) ;
      Gx_mode = sMode50 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1450( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         A13745GrpCDsc = GXutil.trim( GXutil.str( A499GrpFamCod, 2, 0)) + "-" + GXutil.trim( A500GrpFamDsc) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13745GrpCDsc", A13745GrpCDsc);
         /* Using cursor T001414 */
         pr_default.execute(12, new Object[] {A396EmprCod, Boolean.valueOf(n11634TaesId), A11634TaesId});
         A11635TaesDc = T001414_A11635TaesDc[0] ;
         n11635TaesDc = T001414_n11635TaesDc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11635TaesDc", A11635TaesDc);
         pr_default.close(12);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T001415 */
         pr_default.execute(13, new Object[] {A396EmprCod, Boolean.valueOf(n499GrpFamCod), Byte.valueOf(A499GrpFamCod)});
         if ( (pr_default.getStatus(13) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Familia Productos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(13);
         /* Using cursor T001416 */
         pr_default.execute(14, new Object[] {A396EmprCod, Boolean.valueOf(n499GrpFamCod), Byte.valueOf(A499GrpFamCod)});
         if ( (pr_default.getStatus(14) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CFORES", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(14);
         /* Using cursor T001417 */
         pr_default.execute(15, new Object[] {A396EmprCod, Boolean.valueOf(n499GrpFamCod), Byte.valueOf(A499GrpFamCod)});
         if ( (pr_default.getStatus(15) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRODUC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(15);
      }
   }

   public void endLevel1450( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1450( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "stocksquimicos.tgrufam");
         if ( AnyError == 0 )
         {
            confirmValues140( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "stocksquimicos.tgrufam");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1450( )
   {
      /* Scan By routine */
      /* Using cursor T001418 */
      pr_default.execute(16, new Object[] {A396EmprCod});
      RcdFound50 = (short)(0) ;
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound50 = (short)(1) ;
         A499GrpFamCod = T001418_A499GrpFamCod[0] ;
         n499GrpFamCod = T001418_n499GrpFamCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A499GrpFamCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A499GrpFamCod), 2, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1450( )
   {
      /* Scan next routine */
      pr_default.readNext(16);
      RcdFound50 = (short)(0) ;
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound50 = (short)(1) ;
         A499GrpFamCod = T001418_A499GrpFamCod[0] ;
         n499GrpFamCod = T001418_n499GrpFamCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A499GrpFamCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A499GrpFamCod), 2, 0));
      }
   }

   public void scanEnd1450( )
   {
      pr_default.close(16);
   }

   public void afterConfirm1450( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1450( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1450( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1450( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1450( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1450( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1450( )
   {
      edtGrpFamCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtGrpFamCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGrpFamCod_Enabled), 5, 0), true);
      edtGrpFamDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtGrpFamDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGrpFamDsc_Enabled), 5, 0), true);
      edtTaesId_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTaesId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTaesId_Enabled), 5, 0), true);
      edtTaesDc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTaesDc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTaesDc_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1450( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues140( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.stocksquimicos.tgrufam", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV28EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV29GrpFamCod,2,0))}, new String[] {"Gx_mode","EmprCod","GrpFamCod"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"TGRUFAM");
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("stocksquimicos\\tgrufam:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z499GrpFamCod", GXutil.ltrim( localUtil.ntoc( Z499GrpFamCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z500GrpFamDsc", GXutil.rtrim( Z500GrpFamDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11634TaesId", GXutil.rtrim( Z11634TaesId));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "N11634TaesId", GXutil.rtrim( A11634TaesId));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTRNCONTEXT", AV31TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTRNCONTEXT", AV31TrnContext);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTRNCONTEXT", getSecureSignedToken( "", AV31TrnContext));
      app.GxWebStd.gx_hidden_field( httpContext, "GRPCDSC", A13745GrpCDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV28EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV28EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRPFAMCOD", GXutil.ltrim( localUtil.ntoc( AV29GrpFamCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGRPFAMCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV29GrpFamCod), "Z9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_TAESID", GXutil.rtrim( AV33Insert_TaesId));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRNOM", GXutil.rtrim( A407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV35Pgmname));
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
      return formatLink("app.stocksquimicos.tgrufam", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV28EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV29GrpFamCod,2,0))}, new String[] {"Gx_mode","EmprCod","GrpFamCod"})  ;
   }

   public String getPgmname( )
   {
      return "StocksQuimicos.TGRUFAM" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Familias Productos", "") ;
   }

   public void initializeNonKey1450( )
   {
      A11634TaesId = "" ;
      n11634TaesId = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11634TaesId", A11634TaesId);
      A13745GrpCDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13745GrpCDsc", A13745GrpCDsc);
      A500GrpFamDsc = "" ;
      n500GrpFamDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A500GrpFamDsc", A500GrpFamDsc);
      A11635TaesDc = "" ;
      n11635TaesDc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11635TaesDc", A11635TaesDc);
      Z500GrpFamDsc = "" ;
      Z11634TaesId = "" ;
   }

   public void initAll1450( )
   {
      A499GrpFamCod = (byte)(0) ;
      n499GrpFamCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A499GrpFamCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A499GrpFamCod), 2, 0));
      initializeNonKey1450( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?2026821165897", true, true);
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
      httpContext.AddJavascriptSource("stocksquimicos/tgrufam.js", "?2026821165897", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      edtGrpFamCod_Internalname = "GRPFAMCOD" ;
      edtGrpFamDsc_Internalname = "GRPFAMDSC" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      edtTaesId_Internalname = "TAESID" ;
      edtTaesDc_Internalname = "TAESDC" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
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
      Form.setCaption( httpContext.getMessage( "Familias Productos", "") );
      bttBtntrn_delete_Enabled = 0 ;
      bttBtntrn_delete_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      edtTaesDc_Jsonclick = "" ;
      edtTaesDc_Enabled = 0 ;
      edtTaesId_Jsonclick = "" ;
      edtTaesId_Enabled = 1 ;
      divUnnamedtable2_Visible = 1 ;
      edtGrpFamDsc_Jsonclick = "" ;
      edtGrpFamDsc_Enabled = 1 ;
      edtGrpFamCod_Jsonclick = "" ;
      edtGrpFamCod_Enabled = 1 ;
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

   public void valid_Taesid( )
   {
      n11634TaesId = false ;
      n11635TaesDc = false ;
      /* Using cursor T001414 */
      pr_default.execute(12, new Object[] {A396EmprCod, Boolean.valueOf(n11634TaesId), A11634TaesId});
      if ( (pr_default.getStatus(12) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (GXutil.strcmp("", A11634TaesId)==0) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TABLAS DE DOSIFICACION", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TAESID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTaesId_Internalname ;
         }
      }
      A11635TaesDc = T001414_A11635TaesDc[0] ;
      n11635TaesDc = T001414_n11635TaesDc[0] ;
      pr_default.close(12);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A11635TaesDc", GXutil.rtrim( A11635TaesDc));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV28EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV29GrpFamCod',fld:'vGRPFAMCOD',pic:'Z9',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV31TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true},{av:'AV28EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV29GrpFamCod',fld:'vGRPFAMCOD',pic:'Z9',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e12142',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV31TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true}]");
      setEventMetadata("AFTER TRN",",oparms:[]}");
      setEventMetadata("VALID_GRPFAMCOD","{handler:'valid_Grpfamcod',iparms:[]");
      setEventMetadata("VALID_GRPFAMCOD",",oparms:[]}");
      setEventMetadata("VALID_GRPFAMDSC","{handler:'valid_Grpfamdsc',iparms:[]");
      setEventMetadata("VALID_GRPFAMDSC",",oparms:[]}");
      setEventMetadata("VALID_TAESID","{handler:'valid_Taesid',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A11634TaesId',fld:'TAESID',pic:''},{av:'A11635TaesDc',fld:'TAESDC',pic:''}]");
      setEventMetadata("VALID_TAESID",",oparms:[{av:'A11635TaesDc',fld:'TAESDC',pic:''}]}");
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
      pr_default.close(12);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      wcpOAV28EmprCod = "" ;
      Z396EmprCod = "" ;
      Z500GrpFamDsc = "" ;
      Z11634TaesId = "" ;
      N11634TaesId = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A11634TaesId = "" ;
      Gx_mode = "" ;
      AV28EmprCod = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      A500GrpFamDsc = "" ;
      A11635TaesDc = "" ;
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      A13745GrpCDsc = "" ;
      AV33Insert_TaesId = "" ;
      A407EmprNom = "" ;
      AV35Pgmname = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode50 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      AV22Station = "" ;
      AV16EmprNom = "" ;
      AV17UsurCod = "" ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      AV30WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV31TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV32WebSession = httpContext.getWebSession();
      AV34TrnContextAtt = new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      Z407EmprNom = "" ;
      Z11635TaesDc = "" ;
      T00144_A407EmprNom = new String[] {""} ;
      T00144_n407EmprNom = new boolean[] {false} ;
      GXv_int6 = new byte[1] ;
      T00145_A11635TaesDc = new String[] {""} ;
      T00145_n11635TaesDc = new boolean[] {false} ;
      T00146_A499GrpFamCod = new byte[1] ;
      T00146_n499GrpFamCod = new boolean[] {false} ;
      T00146_A500GrpFamDsc = new String[] {""} ;
      T00146_n500GrpFamDsc = new boolean[] {false} ;
      T00146_A407EmprNom = new String[] {""} ;
      T00146_n407EmprNom = new boolean[] {false} ;
      T00146_A11635TaesDc = new String[] {""} ;
      T00146_n11635TaesDc = new boolean[] {false} ;
      T00146_A396EmprCod = new String[] {""} ;
      T00146_A11634TaesId = new String[] {""} ;
      T00146_n11634TaesId = new boolean[] {false} ;
      T00147_A11635TaesDc = new String[] {""} ;
      T00147_n11635TaesDc = new boolean[] {false} ;
      T00148_A396EmprCod = new String[] {""} ;
      T00148_A499GrpFamCod = new byte[1] ;
      T00148_n499GrpFamCod = new boolean[] {false} ;
      T00143_A499GrpFamCod = new byte[1] ;
      T00143_n499GrpFamCod = new boolean[] {false} ;
      T00143_A500GrpFamDsc = new String[] {""} ;
      T00143_n500GrpFamDsc = new boolean[] {false} ;
      T00143_A396EmprCod = new String[] {""} ;
      T00143_A11634TaesId = new String[] {""} ;
      T00143_n11634TaesId = new boolean[] {false} ;
      T00149_A396EmprCod = new String[] {""} ;
      T00149_A499GrpFamCod = new byte[1] ;
      T00149_n499GrpFamCod = new boolean[] {false} ;
      T001410_A396EmprCod = new String[] {""} ;
      T001410_A499GrpFamCod = new byte[1] ;
      T001410_n499GrpFamCod = new boolean[] {false} ;
      T00142_A499GrpFamCod = new byte[1] ;
      T00142_n499GrpFamCod = new boolean[] {false} ;
      T00142_A500GrpFamDsc = new String[] {""} ;
      T00142_n500GrpFamDsc = new boolean[] {false} ;
      T00142_A396EmprCod = new String[] {""} ;
      T00142_A11634TaesId = new String[] {""} ;
      T00142_n11634TaesId = new boolean[] {false} ;
      T001414_A11635TaesDc = new String[] {""} ;
      T001414_n11635TaesDc = new boolean[] {false} ;
      T001415_A396EmprCod = new String[] {""} ;
      T001415_A252CliCod = new int[1] ;
      T001415_A65ArtCod = new String[] {""} ;
      T001415_A499GrpFamCod = new byte[1] ;
      T001415_n499GrpFamCod = new boolean[] {false} ;
      T001416_A396EmprCod = new String[] {""} ;
      T001416_A252CliCod = new int[1] ;
      T001416_A2141SerEst = new String[] {""} ;
      T001416_A1013DibCli = new String[] {""} ;
      T001416_A1014DibInt = new int[1] ;
      T001416_A2074ColCom = new String[] {""} ;
      T001416_A2078ColFon = new String[] {""} ;
      T001417_A396EmprCod = new String[] {""} ;
      T001417_A719PrdNum = new String[] {""} ;
      T001418_A396EmprCod = new String[] {""} ;
      T001418_A499GrpFamCod = new byte[1] ;
      T001418_n499GrpFamCod = new boolean[] {false} ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.tgrufam__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.tgrufam__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.tgrufam__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.tgrufam__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.tgrufam__default(),
         new Object[] {
             new Object[] {
            T00142_A499GrpFamCod, T00142_A500GrpFamDsc, T00142_n500GrpFamDsc, T00142_A396EmprCod, T00142_A11634TaesId, T00142_n11634TaesId
            }
            , new Object[] {
            T00143_A499GrpFamCod, T00143_A500GrpFamDsc, T00143_n500GrpFamDsc, T00143_A396EmprCod, T00143_A11634TaesId, T00143_n11634TaesId
            }
            , new Object[] {
            T00144_A407EmprNom, T00144_n407EmprNom
            }
            , new Object[] {
            T00145_A11635TaesDc, T00145_n11635TaesDc
            }
            , new Object[] {
            T00146_A499GrpFamCod, T00146_A500GrpFamDsc, T00146_n500GrpFamDsc, T00146_A407EmprNom, T00146_n407EmprNom, T00146_A11635TaesDc, T00146_n11635TaesDc, T00146_A396EmprCod, T00146_A11634TaesId, T00146_n11634TaesId
            }
            , new Object[] {
            T00147_A11635TaesDc, T00147_n11635TaesDc
            }
            , new Object[] {
            T00148_A396EmprCod, T00148_A499GrpFamCod
            }
            , new Object[] {
            T00149_A396EmprCod, T00149_A499GrpFamCod
            }
            , new Object[] {
            T001410_A396EmprCod, T001410_A499GrpFamCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T001414_A11635TaesDc, T001414_n11635TaesDc
            }
            , new Object[] {
            T001415_A396EmprCod, T001415_A252CliCod, T001415_A65ArtCod, T001415_A499GrpFamCod
            }
            , new Object[] {
            T001416_A396EmprCod, T001416_A252CliCod, T001416_A2141SerEst, T001416_A1013DibCli, T001416_A1014DibInt, T001416_A2074ColCom, T001416_A2078ColFon
            }
            , new Object[] {
            T001417_A396EmprCod, T001417_A719PrdNum
            }
            , new Object[] {
            T001418_A396EmprCod, T001418_A499GrpFamCod
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV35Pgmname = "StocksQuimicos.TGRUFAM" ;
   }

   private byte wcpOAV29GrpFamCod ;
   private byte Z499GrpFamCod ;
   private byte GxWebError ;
   private byte AV29GrpFamCod ;
   private byte nKeyPressed ;
   private byte A499GrpFamCod ;
   private byte AV27Eliot ;
   private byte GXt_int5 ;
   private byte GXv_int6[] ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound50 ;
   private short nIsDirty_50 ;
   private int trnEnded ;
   private int edtGrpFamCod_Enabled ;
   private int edtGrpFamDsc_Enabled ;
   private int divUnnamedtable2_Visible ;
   private int edtTaesId_Enabled ;
   private int edtTaesDc_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int AV36GXV1 ;
   private int GX_JID ;
   private int idxLst ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV28EmprCod ;
   private String Z396EmprCod ;
   private String Z500GrpFamDsc ;
   private String Z11634TaesId ;
   private String N11634TaesId ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A11634TaesId ;
   private String Gx_mode ;
   private String AV28EmprCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtGrpFamCod_Internalname ;
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
   private String TempTags ;
   private String edtGrpFamCod_Jsonclick ;
   private String edtGrpFamDsc_Internalname ;
   private String A500GrpFamDsc ;
   private String edtGrpFamDsc_Jsonclick ;
   private String divUnnamedtable2_Internalname ;
   private String edtTaesId_Internalname ;
   private String edtTaesId_Jsonclick ;
   private String edtTaesDc_Internalname ;
   private String A11635TaesDc ;
   private String edtTaesDc_Jsonclick ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String AV33Insert_TaesId ;
   private String A407EmprNom ;
   private String AV35Pgmname ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String hsh ;
   private String sMode50 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String AV22Station ;
   private String AV16EmprNom ;
   private String AV17UsurCod ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String Z407EmprNom ;
   private String Z11635TaesDc ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n11634TaesId ;
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
   private boolean n499GrpFamCod ;
   private boolean n500GrpFamDsc ;
   private boolean n11635TaesDc ;
   private boolean returnInSub ;
   private String A13745GrpCDsc ;
   private com.genexus.webpanels.WebSession AV32WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private String[] T00144_A407EmprNom ;
   private boolean[] T00144_n407EmprNom ;
   private String[] T00145_A11635TaesDc ;
   private boolean[] T00145_n11635TaesDc ;
   private byte[] T00146_A499GrpFamCod ;
   private boolean[] T00146_n499GrpFamCod ;
   private String[] T00146_A500GrpFamDsc ;
   private boolean[] T00146_n500GrpFamDsc ;
   private String[] T00146_A407EmprNom ;
   private boolean[] T00146_n407EmprNom ;
   private String[] T00146_A11635TaesDc ;
   private boolean[] T00146_n11635TaesDc ;
   private String[] T00146_A396EmprCod ;
   private String[] T00146_A11634TaesId ;
   private boolean[] T00146_n11634TaesId ;
   private String[] T00147_A11635TaesDc ;
   private boolean[] T00147_n11635TaesDc ;
   private String[] T00148_A396EmprCod ;
   private byte[] T00148_A499GrpFamCod ;
   private boolean[] T00148_n499GrpFamCod ;
   private byte[] T00143_A499GrpFamCod ;
   private boolean[] T00143_n499GrpFamCod ;
   private String[] T00143_A500GrpFamDsc ;
   private boolean[] T00143_n500GrpFamDsc ;
   private String[] T00143_A396EmprCod ;
   private String[] T00143_A11634TaesId ;
   private boolean[] T00143_n11634TaesId ;
   private String[] T00149_A396EmprCod ;
   private byte[] T00149_A499GrpFamCod ;
   private boolean[] T00149_n499GrpFamCod ;
   private String[] T001410_A396EmprCod ;
   private byte[] T001410_A499GrpFamCod ;
   private boolean[] T001410_n499GrpFamCod ;
   private byte[] T00142_A499GrpFamCod ;
   private boolean[] T00142_n499GrpFamCod ;
   private String[] T00142_A500GrpFamDsc ;
   private boolean[] T00142_n500GrpFamDsc ;
   private String[] T00142_A396EmprCod ;
   private String[] T00142_A11634TaesId ;
   private boolean[] T00142_n11634TaesId ;
   private String[] T001414_A11635TaesDc ;
   private boolean[] T001414_n11635TaesDc ;
   private String[] T001415_A396EmprCod ;
   private int[] T001415_A252CliCod ;
   private String[] T001415_A65ArtCod ;
   private byte[] T001415_A499GrpFamCod ;
   private boolean[] T001415_n499GrpFamCod ;
   private String[] T001416_A396EmprCod ;
   private int[] T001416_A252CliCod ;
   private String[] T001416_A2141SerEst ;
   private String[] T001416_A1013DibCli ;
   private int[] T001416_A1014DibInt ;
   private String[] T001416_A2074ColCom ;
   private String[] T001416_A2078ColFon ;
   private String[] T001417_A396EmprCod ;
   private String[] T001417_A719PrdNum ;
   private String[] T001418_A396EmprCod ;
   private byte[] T001418_A499GrpFamCod ;
   private boolean[] T001418_n499GrpFamCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private app.wwpbaseobjects.SdtWWPContext AV30WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV31TrnContext ;
   private app.wwpbaseobjects.SdtWWPTransactionContext_Attribute AV34TrnContextAtt ;
}

final  class tgrufam__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tgrufam__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tgrufam__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tgrufam__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tgrufam__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00142", "SELECT GrpFamCod, GrpFamDsc, EmprCod, TaesId FROM TXPGRUFAM WHERE EmprCod = ? AND GrpFamCod = ?  FOR UPDATE OF GrpFamDsc, TaesId NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00143", "SELECT GrpFamCod, GrpFamDsc, EmprCod, TaesId FROM TXPGRUFAM WHERE EmprCod = ? AND GrpFamCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00144", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00145", "SELECT TaesDc FROM TXPTAES00 WHERE EmprCod = ? AND TaesId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00146", "SELECT /*+ FIRST_ROWS(100) */ TM1.GrpFamCod, TM1.GrpFamDsc, T2.EmprNom, T3.TaesDc, TM1.EmprCod, TM1.TaesId FROM ((TXPGRUFAM TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) LEFT JOIN TXPTAES00 T3 ON T3.EmprCod = TM1.EmprCod AND T3.TaesId = TM1.TaesId) WHERE TM1.EmprCod = ? and TM1.GrpFamCod = ? ORDER BY TM1.EmprCod, TM1.GrpFamCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00147", "SELECT TaesDc FROM TXPTAES00 WHERE EmprCod = ? AND TaesId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00148", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, GrpFamCod FROM TXPGRUFAM WHERE EmprCod = ? AND GrpFamCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00149", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, GrpFamCod FROM TXPGRUFAM WHERE ( GrpFamCod > ?) and EmprCod = ? ORDER BY EmprCod, GrpFamCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001410", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, GrpFamCod FROM TXPGRUFAM WHERE ( GrpFamCod < ?) and EmprCod = ? ORDER BY EmprCod DESC, GrpFamCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T001411", "INSERT INTO TXPGRUFAM(GrpFamCod, GrpFamDsc, EmprCod, TaesId) VALUES(?, ?, ?, ?)", GX_NOMASK, "TXPGRUFAM")
         ,new UpdateCursor("T001412", "UPDATE TXPGRUFAM SET GrpFamDsc=?, TaesId=?  WHERE EmprCod = ? AND GrpFamCod = ?", GX_NOMASK, "TXPGRUFAM")
         ,new UpdateCursor("T001413", "DELETE FROM TXPGRUFAM  WHERE EmprCod = ? AND GrpFamCod = ?", GX_NOMASK, "TXPGRUFAM")
         ,new ForEachCursor("T001414", "SELECT TaesDc FROM TXPTAES00 WHERE EmprCod = ? AND TaesId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001415", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, GrpFamCod FROM TXPEstTa0 WHERE EmprCod = ? AND GrpFamCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001416", "SELECT * FROM (SELECT EmprCod, CliCod, SerEst, DibCli, DibInt, ColCom, ColFon FROM TXPCFORES WHERE EmprCod = ? AND GrpFamCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001417", "SELECT * FROM (SELECT EmprCod, PrdNum FROM TXPPRODUC WHERE EmprCod = ? AND PrdGruFamI = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001418", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, GrpFamCod FROM TXPGRUFAM WHERE EmprCod = ? ORDER BY EmprCod, GrpFamCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((String[]) buf[4])[0] = rslt.getString(4, 6);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 1 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((String[]) buf[4])[0] = rslt.getString(4, 6);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 80);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 4 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 80);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 3);
               ((String[]) buf[8])[0] = rslt.getString(6, 6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 80);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 80);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 16 :
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
               }
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
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
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
               }
               return;
            case 5 :
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
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
               }
               return;
            case 7 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(1, ((Number) parms[1]).byteValue());
               }
               stmt.setString(2, (String)parms[2], 3);
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
               stmt.setString(2, (String)parms[2], 3);
               return;
            case 9 :
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
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 30);
               }
               stmt.setString(3, (String)parms[4], 3);
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 6);
               }
               return;
            case 10 :
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
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 6);
               }
               stmt.setString(3, (String)parms[4], 3);
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(4, ((Number) parms[6]).byteValue());
               }
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
               }
               return;
            case 12 :
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
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
               }
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
               }
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
               }
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

