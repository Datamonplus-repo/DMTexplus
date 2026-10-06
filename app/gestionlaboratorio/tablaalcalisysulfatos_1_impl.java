package app.gestionlaboratorio ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tablaalcalisysulfatos_1_impl extends GXDataArea
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
            AV10EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10EmprCod", AV10EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV10EmprCod, "@!"))));
            AV11Lb_TaAuxC = httpContext.GetPar( "Lb_TaAuxC") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV11Lb_TaAuxC", AV11Lb_TaAuxC);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vLB_TAAUXC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV11Lb_TaAuxC, ""))));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Tabla Alcalis y Sulfatos", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtLb_TaAuxC_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public tablaalcalisysulfatos_1_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tablaalcalisysulfatos_1_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tablaalcalisysulfatos_1_impl.class ));
   }

   public tablaalcalisysulfatos_1_impl( int remoteHandle ,
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtLb_TaAuxC_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtLb_TaAuxC_Internalname, httpContext.getMessage( "Codigo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLb_TaAuxC_Internalname, GXutil.rtrim( A6310Lb_TaAuxC), GXutil.rtrim( localUtil.format( A6310Lb_TaAuxC, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLb_TaAuxC_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtLb_TaAuxC_Enabled, 1, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_GestionLaboratorio\\TablaAlcalisySulfatos_1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-9 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtLb_TaAuxD_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtLb_TaAuxD_Internalname, httpContext.getMessage( "Descripcion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLb_TaAuxD_Internalname, GXutil.rtrim( A6311Lb_TaAuxD), GXutil.rtrim( localUtil.format( A6311Lb_TaAuxD, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,29);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLb_TaAuxD_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtLb_TaAuxD_Enabled, 0, "text", "", 60, "chr", 1, "row", 60, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_GestionLaboratorio\\TablaAlcalisySulfatos_1.htm");
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
      /* Control Group */
      app.GxWebStd.gx_group_start( httpContext, grpUnnamedgroup3_Internalname, httpContext.getMessage( "Familia Productos", ""), 1, 0, "px", 0, "px", "Group", "", "HLP_GestionLaboratorio\\TablaAlcalisySulfatos_1.htm");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell DscTop ExtendedComboCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTablesplittedlb_taauxf1_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblocklb_taauxf1_Internalname, httpContext.getMessage( "Familia (1)", ""), "", "", lblTextblocklb_taauxf1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_GestionLaboratorio\\TablaAlcalisySulfatos_1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* User Defined Control */
      ucCombo_lb_taauxf1.setProperty("Caption", Combo_lb_taauxf1_Caption);
      ucCombo_lb_taauxf1.setProperty("Cls", Combo_lb_taauxf1_Cls);
      ucCombo_lb_taauxf1.setProperty("EmptyItem", Combo_lb_taauxf1_Emptyitem);
      ucCombo_lb_taauxf1.setProperty("DropDownOptionsData", AV15Lb_TaAuxf1_Data);
      ucCombo_lb_taauxf1.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_lb_taauxf1_Internalname, "COMBO_LB_TAAUXF1Container");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 Invisible", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtLb_TaAuxf1_Internalname, httpContext.getMessage( "Familia 1", ""), "col-sm-3 AttributeLabel", 0, true, "");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLb_TaAuxf1_Internalname, GXutil.ltrim( localUtil.ntoc( A6596Lb_TaAuxf1, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtLb_TaAuxf1_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6596Lb_TaAuxf1), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A6596Lb_TaAuxf1), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,44);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLb_TaAuxf1_Jsonclick, 0, "Attribute", "", "", "", "", edtLb_TaAuxf1_Visible, edtLb_TaAuxf1_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_GestionLaboratorio\\TablaAlcalisySulfatos_1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell DscTop ExtendedComboCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTablesplittedlb_taauxf2_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblocklb_taauxf2_Internalname, httpContext.getMessage( "Familia (2)", ""), "", "", lblTextblocklb_taauxf2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_GestionLaboratorio\\TablaAlcalisySulfatos_1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* User Defined Control */
      ucCombo_lb_taauxf2.setProperty("Caption", Combo_lb_taauxf2_Caption);
      ucCombo_lb_taauxf2.setProperty("Cls", Combo_lb_taauxf2_Cls);
      ucCombo_lb_taauxf2.setProperty("EmptyItem", Combo_lb_taauxf2_Emptyitem);
      ucCombo_lb_taauxf2.setProperty("DropDownOptionsData", AV18Lb_TaAuxf2_Data);
      ucCombo_lb_taauxf2.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_lb_taauxf2_Internalname, "COMBO_LB_TAAUXF2Container");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 Invisible", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtLb_TaAuxf2_Internalname, httpContext.getMessage( "Familia 2", ""), "col-sm-3 AttributeLabel", 0, true, "");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLb_TaAuxf2_Internalname, GXutil.ltrim( localUtil.ntoc( A6597Lb_TaAuxf2, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtLb_TaAuxf2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6597Lb_TaAuxf2), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A6597Lb_TaAuxf2), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,54);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLb_TaAuxf2_Jsonclick, 0, "Attribute", "", "", "", "", edtLb_TaAuxf2_Visible, edtLb_TaAuxf2_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_GestionLaboratorio\\TablaAlcalisySulfatos_1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell DscTop ExtendedComboCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTablesplittedlb_taauxf3_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblocklb_taauxf3_Internalname, httpContext.getMessage( "Familia (3)", ""), "", "", lblTextblocklb_taauxf3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_GestionLaboratorio\\TablaAlcalisySulfatos_1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* User Defined Control */
      ucCombo_lb_taauxf3.setProperty("Caption", Combo_lb_taauxf3_Caption);
      ucCombo_lb_taauxf3.setProperty("Cls", Combo_lb_taauxf3_Cls);
      ucCombo_lb_taauxf3.setProperty("EmptyItem", Combo_lb_taauxf3_Emptyitem);
      ucCombo_lb_taauxf3.setProperty("DropDownOptionsData", AV20Lb_TaAuxf3_Data);
      ucCombo_lb_taauxf3.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_lb_taauxf3_Internalname, "COMBO_LB_TAAUXF3Container");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 Invisible", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtLb_TaAuxf3_Internalname, httpContext.getMessage( "Familia 3", ""), "col-sm-3 AttributeLabel", 0, true, "");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLb_TaAuxf3_Internalname, GXutil.ltrim( localUtil.ntoc( A6598Lb_TaAuxf3, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtLb_TaAuxf3_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6598Lb_TaAuxf3), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A6598Lb_TaAuxf3), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,64);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLb_TaAuxf3_Jsonclick, 0, "Attribute", "", "", "", "", edtLb_TaAuxf3_Visible, edtLb_TaAuxf3_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_GestionLaboratorio\\TablaAlcalisySulfatos_1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_GestionLaboratorio\\TablaAlcalisySulfatos_1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_GestionLaboratorio\\TablaAlcalisySulfatos_1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 73,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_GestionLaboratorio\\TablaAlcalisySulfatos_1.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV22Pgmname), GXutil.rtrim( localUtil.format( AV22Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_GestionLaboratorio\\TablaAlcalisySulfatos_1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "Right", "top", "div");
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
      app.GxWebStd.gx_div_start( httpContext, divSectionattribute_lb_taauxf1_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavCombolb_taauxf1_Internalname, GXutil.ltrim( localUtil.ntoc( AV17ComboLb_TaAuxf1, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavCombolb_taauxf1_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV17ComboLb_TaAuxf1), "Z9") : localUtil.format( DecimalUtil.doubleToDec(AV17ComboLb_TaAuxf1), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCombolb_taauxf1_Jsonclick, 0, "Attribute", "", "", "", "", edtavCombolb_taauxf1_Visible, edtavCombolb_taauxf1_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_GestionLaboratorio\\TablaAlcalisySulfatos_1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divSectionattribute_lb_taauxf2_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavCombolb_taauxf2_Internalname, GXutil.ltrim( localUtil.ntoc( AV19ComboLb_TaAuxf2, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavCombolb_taauxf2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV19ComboLb_TaAuxf2), "Z9") : localUtil.format( DecimalUtil.doubleToDec(AV19ComboLb_TaAuxf2), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCombolb_taauxf2_Jsonclick, 0, "Attribute", "", "", "", "", edtavCombolb_taauxf2_Visible, edtavCombolb_taauxf2_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_GestionLaboratorio\\TablaAlcalisySulfatos_1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divSectionattribute_lb_taauxf3_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavCombolb_taauxf3_Internalname, GXutil.ltrim( localUtil.ntoc( AV21ComboLb_TaAuxf3, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavCombolb_taauxf3_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV21ComboLb_TaAuxf3), "Z9") : localUtil.format( DecimalUtil.doubleToDec(AV21ComboLb_TaAuxf3), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCombolb_taauxf3_Jsonclick, 0, "Attribute", "", "", "", "", edtavCombolb_taauxf3_Visible, edtavCombolb_taauxf3_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_GestionLaboratorio\\TablaAlcalisySulfatos_1.htm");
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
      e111SO2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vLB_TAAUXF1_DATA"), AV15Lb_TaAuxf1_Data);
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vLB_TAAUXF2_DATA"), AV18Lb_TaAuxf2_Data);
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vLB_TAAUXF3_DATA"), AV20Lb_TaAuxf3_Data);
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z6310Lb_TaAuxC = httpContext.cgiGet( "Z6310Lb_TaAuxC") ;
            Z6596Lb_TaAuxf1 = (byte)(localUtil.ctol( httpContext.cgiGet( "Z6596Lb_TaAuxf1"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z6597Lb_TaAuxf2 = (byte)(localUtil.ctol( httpContext.cgiGet( "Z6597Lb_TaAuxf2"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z6598Lb_TaAuxf3 = (byte)(localUtil.ctol( httpContext.cgiGet( "Z6598Lb_TaAuxf3"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z6311Lb_TaAuxD = httpContext.cgiGet( "Z6311Lb_TaAuxD") ;
            Z6312lb_TaAuxUL = (short)(localUtil.ctol( httpContext.cgiGet( "Z6312lb_TaAuxUL"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A6312lb_TaAuxUL = (short)(localUtil.ctol( httpContext.cgiGet( "Z6312lb_TaAuxUL"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            A13756Lb_TaAuxCD = httpContext.cgiGet( "LB_TAAUXCD") ;
            AV10EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            A396EmprCod = httpContext.cgiGet( "EMPRCOD") ;
            AV11Lb_TaAuxC = httpContext.cgiGet( "vLB_TAAUXC") ;
            A6312lb_TaAuxUL = (short)(localUtil.ctol( httpContext.cgiGet( "LB_TAAUXUL"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A407EmprNom = httpContext.cgiGet( "EMPRNOM") ;
            n407EmprNom = false ;
            Combo_lb_taauxf1_Objectcall = httpContext.cgiGet( "COMBO_LB_TAAUXF1_Objectcall") ;
            Combo_lb_taauxf1_Class = httpContext.cgiGet( "COMBO_LB_TAAUXF1_Class") ;
            Combo_lb_taauxf1_Icontype = httpContext.cgiGet( "COMBO_LB_TAAUXF1_Icontype") ;
            Combo_lb_taauxf1_Icon = httpContext.cgiGet( "COMBO_LB_TAAUXF1_Icon") ;
            Combo_lb_taauxf1_Caption = httpContext.cgiGet( "COMBO_LB_TAAUXF1_Caption") ;
            Combo_lb_taauxf1_Tooltip = httpContext.cgiGet( "COMBO_LB_TAAUXF1_Tooltip") ;
            Combo_lb_taauxf1_Cls = httpContext.cgiGet( "COMBO_LB_TAAUXF1_Cls") ;
            Combo_lb_taauxf1_Selectedvalue_set = httpContext.cgiGet( "COMBO_LB_TAAUXF1_Selectedvalue_set") ;
            Combo_lb_taauxf1_Selectedvalue_get = httpContext.cgiGet( "COMBO_LB_TAAUXF1_Selectedvalue_get") ;
            Combo_lb_taauxf1_Selectedtext_set = httpContext.cgiGet( "COMBO_LB_TAAUXF1_Selectedtext_set") ;
            Combo_lb_taauxf1_Selectedtext_get = httpContext.cgiGet( "COMBO_LB_TAAUXF1_Selectedtext_get") ;
            Combo_lb_taauxf1_Gamoauthtoken = httpContext.cgiGet( "COMBO_LB_TAAUXF1_Gamoauthtoken") ;
            Combo_lb_taauxf1_Ddointernalname = httpContext.cgiGet( "COMBO_LB_TAAUXF1_Ddointernalname") ;
            Combo_lb_taauxf1_Titlecontrolalign = httpContext.cgiGet( "COMBO_LB_TAAUXF1_Titlecontrolalign") ;
            Combo_lb_taauxf1_Dropdownoptionstype = httpContext.cgiGet( "COMBO_LB_TAAUXF1_Dropdownoptionstype") ;
            Combo_lb_taauxf1_Enabled = GXutil.strtobool( httpContext.cgiGet( "COMBO_LB_TAAUXF1_Enabled")) ;
            Combo_lb_taauxf1_Visible = GXutil.strtobool( httpContext.cgiGet( "COMBO_LB_TAAUXF1_Visible")) ;
            Combo_lb_taauxf1_Titlecontrolidtoreplace = httpContext.cgiGet( "COMBO_LB_TAAUXF1_Titlecontrolidtoreplace") ;
            Combo_lb_taauxf1_Datalisttype = httpContext.cgiGet( "COMBO_LB_TAAUXF1_Datalisttype") ;
            Combo_lb_taauxf1_Allowmultipleselection = GXutil.strtobool( httpContext.cgiGet( "COMBO_LB_TAAUXF1_Allowmultipleselection")) ;
            Combo_lb_taauxf1_Datalistfixedvalues = httpContext.cgiGet( "COMBO_LB_TAAUXF1_Datalistfixedvalues") ;
            Combo_lb_taauxf1_Isgriditem = GXutil.strtobool( httpContext.cgiGet( "COMBO_LB_TAAUXF1_Isgriditem")) ;
            Combo_lb_taauxf1_Hasdescription = GXutil.strtobool( httpContext.cgiGet( "COMBO_LB_TAAUXF1_Hasdescription")) ;
            Combo_lb_taauxf1_Datalistproc = httpContext.cgiGet( "COMBO_LB_TAAUXF1_Datalistproc") ;
            Combo_lb_taauxf1_Datalistprocparametersprefix = httpContext.cgiGet( "COMBO_LB_TAAUXF1_Datalistprocparametersprefix") ;
            Combo_lb_taauxf1_Remoteservicesparameters = httpContext.cgiGet( "COMBO_LB_TAAUXF1_Remoteservicesparameters") ;
            Combo_lb_taauxf1_Datalistupdateminimumcharacters = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_LB_TAAUXF1_Datalistupdateminimumcharacters"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_lb_taauxf1_Includeonlyselectedoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_LB_TAAUXF1_Includeonlyselectedoption")) ;
            Combo_lb_taauxf1_Includeselectalloption = GXutil.strtobool( httpContext.cgiGet( "COMBO_LB_TAAUXF1_Includeselectalloption")) ;
            Combo_lb_taauxf1_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_LB_TAAUXF1_Emptyitem")) ;
            Combo_lb_taauxf1_Includeaddnewoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_LB_TAAUXF1_Includeaddnewoption")) ;
            Combo_lb_taauxf1_Htmltemplate = httpContext.cgiGet( "COMBO_LB_TAAUXF1_Htmltemplate") ;
            Combo_lb_taauxf1_Multiplevaluestype = httpContext.cgiGet( "COMBO_LB_TAAUXF1_Multiplevaluestype") ;
            Combo_lb_taauxf1_Loadingdata = httpContext.cgiGet( "COMBO_LB_TAAUXF1_Loadingdata") ;
            Combo_lb_taauxf1_Noresultsfound = httpContext.cgiGet( "COMBO_LB_TAAUXF1_Noresultsfound") ;
            Combo_lb_taauxf1_Emptyitemtext = httpContext.cgiGet( "COMBO_LB_TAAUXF1_Emptyitemtext") ;
            Combo_lb_taauxf1_Onlyselectedvalues = httpContext.cgiGet( "COMBO_LB_TAAUXF1_Onlyselectedvalues") ;
            Combo_lb_taauxf1_Selectalltext = httpContext.cgiGet( "COMBO_LB_TAAUXF1_Selectalltext") ;
            Combo_lb_taauxf1_Multiplevaluesseparator = httpContext.cgiGet( "COMBO_LB_TAAUXF1_Multiplevaluesseparator") ;
            Combo_lb_taauxf1_Addnewoptiontext = httpContext.cgiGet( "COMBO_LB_TAAUXF1_Addnewoptiontext") ;
            Combo_lb_taauxf2_Objectcall = httpContext.cgiGet( "COMBO_LB_TAAUXF2_Objectcall") ;
            Combo_lb_taauxf2_Class = httpContext.cgiGet( "COMBO_LB_TAAUXF2_Class") ;
            Combo_lb_taauxf2_Icontype = httpContext.cgiGet( "COMBO_LB_TAAUXF2_Icontype") ;
            Combo_lb_taauxf2_Icon = httpContext.cgiGet( "COMBO_LB_TAAUXF2_Icon") ;
            Combo_lb_taauxf2_Caption = httpContext.cgiGet( "COMBO_LB_TAAUXF2_Caption") ;
            Combo_lb_taauxf2_Tooltip = httpContext.cgiGet( "COMBO_LB_TAAUXF2_Tooltip") ;
            Combo_lb_taauxf2_Cls = httpContext.cgiGet( "COMBO_LB_TAAUXF2_Cls") ;
            Combo_lb_taauxf2_Selectedvalue_set = httpContext.cgiGet( "COMBO_LB_TAAUXF2_Selectedvalue_set") ;
            Combo_lb_taauxf2_Selectedvalue_get = httpContext.cgiGet( "COMBO_LB_TAAUXF2_Selectedvalue_get") ;
            Combo_lb_taauxf2_Selectedtext_set = httpContext.cgiGet( "COMBO_LB_TAAUXF2_Selectedtext_set") ;
            Combo_lb_taauxf2_Selectedtext_get = httpContext.cgiGet( "COMBO_LB_TAAUXF2_Selectedtext_get") ;
            Combo_lb_taauxf2_Gamoauthtoken = httpContext.cgiGet( "COMBO_LB_TAAUXF2_Gamoauthtoken") ;
            Combo_lb_taauxf2_Ddointernalname = httpContext.cgiGet( "COMBO_LB_TAAUXF2_Ddointernalname") ;
            Combo_lb_taauxf2_Titlecontrolalign = httpContext.cgiGet( "COMBO_LB_TAAUXF2_Titlecontrolalign") ;
            Combo_lb_taauxf2_Dropdownoptionstype = httpContext.cgiGet( "COMBO_LB_TAAUXF2_Dropdownoptionstype") ;
            Combo_lb_taauxf2_Enabled = GXutil.strtobool( httpContext.cgiGet( "COMBO_LB_TAAUXF2_Enabled")) ;
            Combo_lb_taauxf2_Visible = GXutil.strtobool( httpContext.cgiGet( "COMBO_LB_TAAUXF2_Visible")) ;
            Combo_lb_taauxf2_Titlecontrolidtoreplace = httpContext.cgiGet( "COMBO_LB_TAAUXF2_Titlecontrolidtoreplace") ;
            Combo_lb_taauxf2_Datalisttype = httpContext.cgiGet( "COMBO_LB_TAAUXF2_Datalisttype") ;
            Combo_lb_taauxf2_Allowmultipleselection = GXutil.strtobool( httpContext.cgiGet( "COMBO_LB_TAAUXF2_Allowmultipleselection")) ;
            Combo_lb_taauxf2_Datalistfixedvalues = httpContext.cgiGet( "COMBO_LB_TAAUXF2_Datalistfixedvalues") ;
            Combo_lb_taauxf2_Isgriditem = GXutil.strtobool( httpContext.cgiGet( "COMBO_LB_TAAUXF2_Isgriditem")) ;
            Combo_lb_taauxf2_Hasdescription = GXutil.strtobool( httpContext.cgiGet( "COMBO_LB_TAAUXF2_Hasdescription")) ;
            Combo_lb_taauxf2_Datalistproc = httpContext.cgiGet( "COMBO_LB_TAAUXF2_Datalistproc") ;
            Combo_lb_taauxf2_Datalistprocparametersprefix = httpContext.cgiGet( "COMBO_LB_TAAUXF2_Datalistprocparametersprefix") ;
            Combo_lb_taauxf2_Remoteservicesparameters = httpContext.cgiGet( "COMBO_LB_TAAUXF2_Remoteservicesparameters") ;
            Combo_lb_taauxf2_Datalistupdateminimumcharacters = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_LB_TAAUXF2_Datalistupdateminimumcharacters"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_lb_taauxf2_Includeonlyselectedoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_LB_TAAUXF2_Includeonlyselectedoption")) ;
            Combo_lb_taauxf2_Includeselectalloption = GXutil.strtobool( httpContext.cgiGet( "COMBO_LB_TAAUXF2_Includeselectalloption")) ;
            Combo_lb_taauxf2_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_LB_TAAUXF2_Emptyitem")) ;
            Combo_lb_taauxf2_Includeaddnewoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_LB_TAAUXF2_Includeaddnewoption")) ;
            Combo_lb_taauxf2_Htmltemplate = httpContext.cgiGet( "COMBO_LB_TAAUXF2_Htmltemplate") ;
            Combo_lb_taauxf2_Multiplevaluestype = httpContext.cgiGet( "COMBO_LB_TAAUXF2_Multiplevaluestype") ;
            Combo_lb_taauxf2_Loadingdata = httpContext.cgiGet( "COMBO_LB_TAAUXF2_Loadingdata") ;
            Combo_lb_taauxf2_Noresultsfound = httpContext.cgiGet( "COMBO_LB_TAAUXF2_Noresultsfound") ;
            Combo_lb_taauxf2_Emptyitemtext = httpContext.cgiGet( "COMBO_LB_TAAUXF2_Emptyitemtext") ;
            Combo_lb_taauxf2_Onlyselectedvalues = httpContext.cgiGet( "COMBO_LB_TAAUXF2_Onlyselectedvalues") ;
            Combo_lb_taauxf2_Selectalltext = httpContext.cgiGet( "COMBO_LB_TAAUXF2_Selectalltext") ;
            Combo_lb_taauxf2_Multiplevaluesseparator = httpContext.cgiGet( "COMBO_LB_TAAUXF2_Multiplevaluesseparator") ;
            Combo_lb_taauxf2_Addnewoptiontext = httpContext.cgiGet( "COMBO_LB_TAAUXF2_Addnewoptiontext") ;
            Combo_lb_taauxf3_Objectcall = httpContext.cgiGet( "COMBO_LB_TAAUXF3_Objectcall") ;
            Combo_lb_taauxf3_Class = httpContext.cgiGet( "COMBO_LB_TAAUXF3_Class") ;
            Combo_lb_taauxf3_Icontype = httpContext.cgiGet( "COMBO_LB_TAAUXF3_Icontype") ;
            Combo_lb_taauxf3_Icon = httpContext.cgiGet( "COMBO_LB_TAAUXF3_Icon") ;
            Combo_lb_taauxf3_Caption = httpContext.cgiGet( "COMBO_LB_TAAUXF3_Caption") ;
            Combo_lb_taauxf3_Tooltip = httpContext.cgiGet( "COMBO_LB_TAAUXF3_Tooltip") ;
            Combo_lb_taauxf3_Cls = httpContext.cgiGet( "COMBO_LB_TAAUXF3_Cls") ;
            Combo_lb_taauxf3_Selectedvalue_set = httpContext.cgiGet( "COMBO_LB_TAAUXF3_Selectedvalue_set") ;
            Combo_lb_taauxf3_Selectedvalue_get = httpContext.cgiGet( "COMBO_LB_TAAUXF3_Selectedvalue_get") ;
            Combo_lb_taauxf3_Selectedtext_set = httpContext.cgiGet( "COMBO_LB_TAAUXF3_Selectedtext_set") ;
            Combo_lb_taauxf3_Selectedtext_get = httpContext.cgiGet( "COMBO_LB_TAAUXF3_Selectedtext_get") ;
            Combo_lb_taauxf3_Gamoauthtoken = httpContext.cgiGet( "COMBO_LB_TAAUXF3_Gamoauthtoken") ;
            Combo_lb_taauxf3_Ddointernalname = httpContext.cgiGet( "COMBO_LB_TAAUXF3_Ddointernalname") ;
            Combo_lb_taauxf3_Titlecontrolalign = httpContext.cgiGet( "COMBO_LB_TAAUXF3_Titlecontrolalign") ;
            Combo_lb_taauxf3_Dropdownoptionstype = httpContext.cgiGet( "COMBO_LB_TAAUXF3_Dropdownoptionstype") ;
            Combo_lb_taauxf3_Enabled = GXutil.strtobool( httpContext.cgiGet( "COMBO_LB_TAAUXF3_Enabled")) ;
            Combo_lb_taauxf3_Visible = GXutil.strtobool( httpContext.cgiGet( "COMBO_LB_TAAUXF3_Visible")) ;
            Combo_lb_taauxf3_Titlecontrolidtoreplace = httpContext.cgiGet( "COMBO_LB_TAAUXF3_Titlecontrolidtoreplace") ;
            Combo_lb_taauxf3_Datalisttype = httpContext.cgiGet( "COMBO_LB_TAAUXF3_Datalisttype") ;
            Combo_lb_taauxf3_Allowmultipleselection = GXutil.strtobool( httpContext.cgiGet( "COMBO_LB_TAAUXF3_Allowmultipleselection")) ;
            Combo_lb_taauxf3_Datalistfixedvalues = httpContext.cgiGet( "COMBO_LB_TAAUXF3_Datalistfixedvalues") ;
            Combo_lb_taauxf3_Isgriditem = GXutil.strtobool( httpContext.cgiGet( "COMBO_LB_TAAUXF3_Isgriditem")) ;
            Combo_lb_taauxf3_Hasdescription = GXutil.strtobool( httpContext.cgiGet( "COMBO_LB_TAAUXF3_Hasdescription")) ;
            Combo_lb_taauxf3_Datalistproc = httpContext.cgiGet( "COMBO_LB_TAAUXF3_Datalistproc") ;
            Combo_lb_taauxf3_Datalistprocparametersprefix = httpContext.cgiGet( "COMBO_LB_TAAUXF3_Datalistprocparametersprefix") ;
            Combo_lb_taauxf3_Remoteservicesparameters = httpContext.cgiGet( "COMBO_LB_TAAUXF3_Remoteservicesparameters") ;
            Combo_lb_taauxf3_Datalistupdateminimumcharacters = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_LB_TAAUXF3_Datalistupdateminimumcharacters"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_lb_taauxf3_Includeonlyselectedoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_LB_TAAUXF3_Includeonlyselectedoption")) ;
            Combo_lb_taauxf3_Includeselectalloption = GXutil.strtobool( httpContext.cgiGet( "COMBO_LB_TAAUXF3_Includeselectalloption")) ;
            Combo_lb_taauxf3_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_LB_TAAUXF3_Emptyitem")) ;
            Combo_lb_taauxf3_Includeaddnewoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_LB_TAAUXF3_Includeaddnewoption")) ;
            Combo_lb_taauxf3_Htmltemplate = httpContext.cgiGet( "COMBO_LB_TAAUXF3_Htmltemplate") ;
            Combo_lb_taauxf3_Multiplevaluestype = httpContext.cgiGet( "COMBO_LB_TAAUXF3_Multiplevaluestype") ;
            Combo_lb_taauxf3_Loadingdata = httpContext.cgiGet( "COMBO_LB_TAAUXF3_Loadingdata") ;
            Combo_lb_taauxf3_Noresultsfound = httpContext.cgiGet( "COMBO_LB_TAAUXF3_Noresultsfound") ;
            Combo_lb_taauxf3_Emptyitemtext = httpContext.cgiGet( "COMBO_LB_TAAUXF3_Emptyitemtext") ;
            Combo_lb_taauxf3_Onlyselectedvalues = httpContext.cgiGet( "COMBO_LB_TAAUXF3_Onlyselectedvalues") ;
            Combo_lb_taauxf3_Selectalltext = httpContext.cgiGet( "COMBO_LB_TAAUXF3_Selectalltext") ;
            Combo_lb_taauxf3_Multiplevaluesseparator = httpContext.cgiGet( "COMBO_LB_TAAUXF3_Multiplevaluesseparator") ;
            Combo_lb_taauxf3_Addnewoptiontext = httpContext.cgiGet( "COMBO_LB_TAAUXF3_Addnewoptiontext") ;
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
            A6310Lb_TaAuxC = httpContext.cgiGet( edtLb_TaAuxC_Internalname) ;
            n6310Lb_TaAuxC = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6310Lb_TaAuxC", A6310Lb_TaAuxC);
            A6311Lb_TaAuxD = httpContext.cgiGet( edtLb_TaAuxD_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6311Lb_TaAuxD", A6311Lb_TaAuxD);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtLb_TaAuxf1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtLb_TaAuxf1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "LB_TAAUXF1");
               AnyError = (short)(1) ;
               GX_FocusControl = edtLb_TaAuxf1_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A6596Lb_TaAuxf1 = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A6596Lb_TaAuxf1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6596Lb_TaAuxf1), 2, 0));
            }
            else
            {
               A6596Lb_TaAuxf1 = (byte)(localUtil.ctol( httpContext.cgiGet( edtLb_TaAuxf1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A6596Lb_TaAuxf1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6596Lb_TaAuxf1), 2, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtLb_TaAuxf2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtLb_TaAuxf2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "LB_TAAUXF2");
               AnyError = (short)(1) ;
               GX_FocusControl = edtLb_TaAuxf2_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A6597Lb_TaAuxf2 = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A6597Lb_TaAuxf2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6597Lb_TaAuxf2), 2, 0));
            }
            else
            {
               A6597Lb_TaAuxf2 = (byte)(localUtil.ctol( httpContext.cgiGet( edtLb_TaAuxf2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A6597Lb_TaAuxf2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6597Lb_TaAuxf2), 2, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtLb_TaAuxf3_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtLb_TaAuxf3_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "LB_TAAUXF3");
               AnyError = (short)(1) ;
               GX_FocusControl = edtLb_TaAuxf3_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A6598Lb_TaAuxf3 = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A6598Lb_TaAuxf3", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6598Lb_TaAuxf3), 2, 0));
            }
            else
            {
               A6598Lb_TaAuxf3 = (byte)(localUtil.ctol( httpContext.cgiGet( edtLb_TaAuxf3_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A6598Lb_TaAuxf3", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6598Lb_TaAuxf3), 2, 0));
            }
            AV22Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV22Pgmname", AV22Pgmname);
            AV17ComboLb_TaAuxf1 = (byte)(localUtil.ctol( httpContext.cgiGet( edtavCombolb_taauxf1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17ComboLb_TaAuxf1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17ComboLb_TaAuxf1), 2, 0));
            AV19ComboLb_TaAuxf2 = (byte)(localUtil.ctol( httpContext.cgiGet( edtavCombolb_taauxf2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV19ComboLb_TaAuxf2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19ComboLb_TaAuxf2), 2, 0));
            AV21ComboLb_TaAuxf3 = (byte)(localUtil.ctol( httpContext.cgiGet( edtavCombolb_taauxf3_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV21ComboLb_TaAuxf3", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21ComboLb_TaAuxf3), 2, 0));
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"TablaAlcalisySulfatos_1");
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            forbiddenHiddens.add("lb_TaAuxUL", localUtil.format( DecimalUtil.doubleToDec(A6312lb_TaAuxUL), "ZZZ9"));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( GXutil.strcmp(A6310Lb_TaAuxC, Z6310Lb_TaAuxC) != 0 ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("gestionlaboratorio\\tablaalcalisysulfatos_1:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               A6310Lb_TaAuxC = httpContext.GetPar( "Lb_TaAuxC") ;
               n6310Lb_TaAuxC = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A6310Lb_TaAuxC", A6310Lb_TaAuxC);
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
                  sMode918 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  Gx_mode = sMode918 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound918 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_1SO0( ) ;
                        if ( AnyError == 0 )
                        {
                           GX_FocusControl = bttBtntrn_enter_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noinsert"), 1, "LB_TAAUXC");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtLb_TaAuxC_Internalname ;
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
                        e111SO2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e121SO2 ();
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
         e121SO2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll1SO918( ) ;
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
         disableAttributes1SO918( ) ;
      }
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavCombolb_taauxf1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombolb_taauxf1_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavCombolb_taauxf2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombolb_taauxf2_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavCombolb_taauxf3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombolb_taauxf3_Enabled), 5, 0), true);
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

   public void confirm_1SO0( )
   {
      beforeValidate1SO918( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1SO918( ) ;
         }
         else
         {
            checkExtendedTable1SO918( ) ;
            closeExtendedTableCursors1SO918( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
   }

   public void resetCaption1SO0( )
   {
   }

   public void e111SO2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      tablaalcalisysulfatos_1_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Station", AV7Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV8EmprNom ;
      GXv_char4[0] = AV9UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV7Station, GXv_char2, GXv_char3, GXv_char4) ;
      tablaalcalisysulfatos_1_impl.this.A396EmprCod = GXv_char2[0] ;
      tablaalcalisysulfatos_1_impl.this.AV8EmprNom = GXv_char3[0] ;
      tablaalcalisysulfatos_1_impl.this.AV9UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV8EmprNom", AV8EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV9UsurCod", AV9UsurCod);
      GXt_char1 = AV7Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      tablaalcalisysulfatos_1_impl.this.GXt_char1 = GXv_char4[0] ;
      AV7Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Station", AV7Station);
      GXv_char4[0] = AV10EmprCod ;
      GXv_char3[0] = AV8EmprNom ;
      GXv_char2[0] = AV9UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV7Station, GXv_char4, GXv_char3, GXv_char2) ;
      tablaalcalisysulfatos_1_impl.this.AV10EmprCod = GXv_char4[0] ;
      tablaalcalisysulfatos_1_impl.this.AV8EmprNom = GXv_char3[0] ;
      tablaalcalisysulfatos_1_impl.this.AV9UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10EmprCod", AV10EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV10EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV8EmprNom", AV8EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV9UsurCod", AV9UsurCod);
      GXv_SdtWWPContext5[0] = AV12WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext5) ;
      AV12WWPContext = GXv_SdtWWPContext5[0] ;
      edtLb_TaAuxf3_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_TaAuxf3_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_TaAuxf3_Visible), 5, 0), true);
      AV21ComboLb_TaAuxf3 = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21ComboLb_TaAuxf3", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21ComboLb_TaAuxf3), 2, 0));
      edtavCombolb_taauxf3_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCombolb_taauxf3_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombolb_taauxf3_Visible), 5, 0), true);
      edtLb_TaAuxf2_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_TaAuxf2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_TaAuxf2_Visible), 5, 0), true);
      AV19ComboLb_TaAuxf2 = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19ComboLb_TaAuxf2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19ComboLb_TaAuxf2), 2, 0));
      edtavCombolb_taauxf2_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCombolb_taauxf2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombolb_taauxf2_Visible), 5, 0), true);
      edtLb_TaAuxf1_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_TaAuxf1_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_TaAuxf1_Visible), 5, 0), true);
      AV17ComboLb_TaAuxf1 = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17ComboLb_TaAuxf1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17ComboLb_TaAuxf1), 2, 0));
      edtavCombolb_taauxf1_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCombolb_taauxf1_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombolb_taauxf1_Visible), 5, 0), true);
      /* Execute user subroutine: 'LOADCOMBOLB_TAAUXF1' */
      S112 ();
      if ( returnInSub )
      {
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      /* Execute user subroutine: 'LOADCOMBOLB_TAAUXF2' */
      S122 ();
      if ( returnInSub )
      {
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      /* Execute user subroutine: 'LOADCOMBOLB_TAAUXF3' */
      S132 ();
      if ( returnInSub )
      {
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      AV13TrnContext.fromxml(AV14WebSession.getValue("TrnContext"), null, null);
   }

   public void e121SO2( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) || ( GXutil.strcmp(Gx_mode, "UPD") == 0 ) )
      {
         httpContext.popup(formatLink("app.gestionlaboratorio.tablaalcalisysulfatos_3", new String[] {GXutil.URLEncode(GXutil.rtrim(AV10EmprCod)),GXutil.URLEncode(GXutil.rtrim(A6310Lb_TaAuxC)),GXutil.URLEncode(GXutil.rtrim(A6311Lb_TaAuxD))}, new String[] {"Emprcod","Lb_TaAuxC","Lb_TaAuxD"}) , new Object[] {});
      }
      if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV13TrnContext.getgxTv_SdtWWPTransactionContext_Callerondelete() )
      {
         callWebObject(formatLink("app.gestionlaboratorio.tablaalcalisysulfatos_1ww", new String[] {}, new String[] {}) );
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

   public void S132( )
   {
      /* 'LOADCOMBOLB_TAAUXF3' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTComboData_Item6 = AV20Lb_TaAuxf3_Data ;
      GXv_char4[0] = AV16ComboSelectedValue ;
      GXv_objcol_SdtDVB_SDTComboData_Item7[0] = GXt_objcol_SdtDVB_SDTComboData_Item6 ;
      new app.gestionlaboratorio.tablaalcalisysulfatos_1loaddvcombo(remoteHandle, context).execute( "Lb_TaAuxf3", Gx_mode, AV10EmprCod, AV11Lb_TaAuxC, GXv_char4, GXv_objcol_SdtDVB_SDTComboData_Item7) ;
      tablaalcalisysulfatos_1_impl.this.AV16ComboSelectedValue = GXv_char4[0] ;
      GXt_objcol_SdtDVB_SDTComboData_Item6 = GXv_objcol_SdtDVB_SDTComboData_Item7[0] ;
      AV20Lb_TaAuxf3_Data = GXt_objcol_SdtDVB_SDTComboData_Item6 ;
      Combo_lb_taauxf3_Selectedvalue_set = AV16ComboSelectedValue ;
      ucCombo_lb_taauxf3.sendProperty(context, "", false, Combo_lb_taauxf3_Internalname, "SelectedValue_set", Combo_lb_taauxf3_Selectedvalue_set);
      AV21ComboLb_TaAuxf3 = (byte)(GXutil.lval( AV16ComboSelectedValue)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21ComboLb_TaAuxf3", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21ComboLb_TaAuxf3), 2, 0));
      if ( ( GXutil.strcmp(Gx_mode, "DSP") == 0 ) || ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) )
      {
         Combo_lb_taauxf3_Enabled = false ;
         ucCombo_lb_taauxf3.sendProperty(context, "", false, Combo_lb_taauxf3_Internalname, "Enabled", GXutil.booltostr( Combo_lb_taauxf3_Enabled));
      }
   }

   public void S122( )
   {
      /* 'LOADCOMBOLB_TAAUXF2' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTComboData_Item6 = AV18Lb_TaAuxf2_Data ;
      GXv_char4[0] = AV16ComboSelectedValue ;
      GXv_objcol_SdtDVB_SDTComboData_Item7[0] = GXt_objcol_SdtDVB_SDTComboData_Item6 ;
      new app.gestionlaboratorio.tablaalcalisysulfatos_1loaddvcombo(remoteHandle, context).execute( "Lb_TaAuxf2", Gx_mode, AV10EmprCod, AV11Lb_TaAuxC, GXv_char4, GXv_objcol_SdtDVB_SDTComboData_Item7) ;
      tablaalcalisysulfatos_1_impl.this.AV16ComboSelectedValue = GXv_char4[0] ;
      GXt_objcol_SdtDVB_SDTComboData_Item6 = GXv_objcol_SdtDVB_SDTComboData_Item7[0] ;
      AV18Lb_TaAuxf2_Data = GXt_objcol_SdtDVB_SDTComboData_Item6 ;
      Combo_lb_taauxf2_Selectedvalue_set = AV16ComboSelectedValue ;
      ucCombo_lb_taauxf2.sendProperty(context, "", false, Combo_lb_taauxf2_Internalname, "SelectedValue_set", Combo_lb_taauxf2_Selectedvalue_set);
      AV19ComboLb_TaAuxf2 = (byte)(GXutil.lval( AV16ComboSelectedValue)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19ComboLb_TaAuxf2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19ComboLb_TaAuxf2), 2, 0));
      if ( ( GXutil.strcmp(Gx_mode, "DSP") == 0 ) || ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) )
      {
         Combo_lb_taauxf2_Enabled = false ;
         ucCombo_lb_taauxf2.sendProperty(context, "", false, Combo_lb_taauxf2_Internalname, "Enabled", GXutil.booltostr( Combo_lb_taauxf2_Enabled));
      }
   }

   public void S112( )
   {
      /* 'LOADCOMBOLB_TAAUXF1' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTComboData_Item6 = AV15Lb_TaAuxf1_Data ;
      GXv_char4[0] = AV16ComboSelectedValue ;
      GXv_objcol_SdtDVB_SDTComboData_Item7[0] = GXt_objcol_SdtDVB_SDTComboData_Item6 ;
      new app.gestionlaboratorio.tablaalcalisysulfatos_1loaddvcombo(remoteHandle, context).execute( "Lb_TaAuxf1", Gx_mode, AV10EmprCod, AV11Lb_TaAuxC, GXv_char4, GXv_objcol_SdtDVB_SDTComboData_Item7) ;
      tablaalcalisysulfatos_1_impl.this.AV16ComboSelectedValue = GXv_char4[0] ;
      GXt_objcol_SdtDVB_SDTComboData_Item6 = GXv_objcol_SdtDVB_SDTComboData_Item7[0] ;
      AV15Lb_TaAuxf1_Data = GXt_objcol_SdtDVB_SDTComboData_Item6 ;
      Combo_lb_taauxf1_Selectedvalue_set = AV16ComboSelectedValue ;
      ucCombo_lb_taauxf1.sendProperty(context, "", false, Combo_lb_taauxf1_Internalname, "SelectedValue_set", Combo_lb_taauxf1_Selectedvalue_set);
      AV17ComboLb_TaAuxf1 = (byte)(GXutil.lval( AV16ComboSelectedValue)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17ComboLb_TaAuxf1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17ComboLb_TaAuxf1), 2, 0));
      if ( ( GXutil.strcmp(Gx_mode, "DSP") == 0 ) || ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) )
      {
         Combo_lb_taauxf1_Enabled = false ;
         ucCombo_lb_taauxf1.sendProperty(context, "", false, Combo_lb_taauxf1_Internalname, "Enabled", GXutil.booltostr( Combo_lb_taauxf1_Enabled));
      }
   }

   public void zm1SO918( int GX_JID )
   {
      if ( ( GX_JID == 10 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z6596Lb_TaAuxf1 = T01SO3_A6596Lb_TaAuxf1[0] ;
            Z6597Lb_TaAuxf2 = T01SO3_A6597Lb_TaAuxf2[0] ;
            Z6598Lb_TaAuxf3 = T01SO3_A6598Lb_TaAuxf3[0] ;
            Z6311Lb_TaAuxD = T01SO3_A6311Lb_TaAuxD[0] ;
            Z6312lb_TaAuxUL = T01SO3_A6312lb_TaAuxUL[0] ;
         }
         else
         {
            Z6596Lb_TaAuxf1 = A6596Lb_TaAuxf1 ;
            Z6597Lb_TaAuxf2 = A6597Lb_TaAuxf2 ;
            Z6598Lb_TaAuxf3 = A6598Lb_TaAuxf3 ;
            Z6311Lb_TaAuxD = A6311Lb_TaAuxD ;
            Z6312lb_TaAuxUL = A6312lb_TaAuxUL ;
         }
      }
      if ( GX_JID == -10 )
      {
         Z6310Lb_TaAuxC = A6310Lb_TaAuxC ;
         Z6596Lb_TaAuxf1 = A6596Lb_TaAuxf1 ;
         Z6597Lb_TaAuxf2 = A6597Lb_TaAuxf2 ;
         Z6598Lb_TaAuxf3 = A6598Lb_TaAuxf3 ;
         Z6311Lb_TaAuxD = A6311Lb_TaAuxD ;
         Z6312lb_TaAuxUL = A6312lb_TaAuxUL ;
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
      AV22Pgmname = "GestionLaboratorio.TablaAlcalisySulfatos_1" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22Pgmname", AV22Pgmname);
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV10EmprCod)==0) )
      {
         A396EmprCod = AV10EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      /* Using cursor T01SO4 */
      pr_default.execute(2, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01SO4_A407EmprNom[0] ;
      n407EmprNom = T01SO4_n407EmprNom[0] ;
      pr_default.close(2);
      if ( ! (GXutil.strcmp("", AV11Lb_TaAuxC)==0) )
      {
         A6310Lb_TaAuxC = AV11Lb_TaAuxC ;
         n6310Lb_TaAuxC = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6310Lb_TaAuxC", A6310Lb_TaAuxC);
      }
      if ( ! (GXutil.strcmp("", AV11Lb_TaAuxC)==0) )
      {
         edtLb_TaAuxC_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLb_TaAuxC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_TaAuxC_Enabled), 5, 0), true);
      }
      else
      {
         edtLb_TaAuxC_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLb_TaAuxC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_TaAuxC_Enabled), 5, 0), true);
      }
      if ( ! (GXutil.strcmp("", AV11Lb_TaAuxC)==0) )
      {
         edtLb_TaAuxC_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLb_TaAuxC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_TaAuxC_Enabled), 5, 0), true);
      }
   }

   public void standaloneModal( )
   {
      A6596Lb_TaAuxf1 = AV17ComboLb_TaAuxf1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A6596Lb_TaAuxf1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6596Lb_TaAuxf1), 2, 0));
      A6597Lb_TaAuxf2 = AV19ComboLb_TaAuxf2 ;
      httpContext.ajax_rsp_assign_attri("", false, "A6597Lb_TaAuxf2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6597Lb_TaAuxf2), 2, 0));
      A6598Lb_TaAuxf3 = AV21ComboLb_TaAuxf3 ;
      httpContext.ajax_rsp_assign_attri("", false, "A6598Lb_TaAuxf3", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6598Lb_TaAuxf3), 2, 0));
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

   public void load1SO918( )
   {
      /* Using cursor T01SO5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n6310Lb_TaAuxC), A6310Lb_TaAuxC});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound918 = (short)(1) ;
         A6596Lb_TaAuxf1 = T01SO5_A6596Lb_TaAuxf1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6596Lb_TaAuxf1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6596Lb_TaAuxf1), 2, 0));
         A6597Lb_TaAuxf2 = T01SO5_A6597Lb_TaAuxf2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6597Lb_TaAuxf2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6597Lb_TaAuxf2), 2, 0));
         A6598Lb_TaAuxf3 = T01SO5_A6598Lb_TaAuxf3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6598Lb_TaAuxf3", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6598Lb_TaAuxf3), 2, 0));
         A407EmprNom = T01SO5_A407EmprNom[0] ;
         n407EmprNom = T01SO5_n407EmprNom[0] ;
         A6311Lb_TaAuxD = T01SO5_A6311Lb_TaAuxD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6311Lb_TaAuxD", A6311Lb_TaAuxD);
         A6312lb_TaAuxUL = T01SO5_A6312lb_TaAuxUL[0] ;
         zm1SO918( -10) ;
      }
      pr_default.close(3);
      onLoadActions1SO918( ) ;
   }

   public void onLoadActions1SO918( )
   {
      A13756Lb_TaAuxCD = GXutil.trim( A6310Lb_TaAuxC) + "-" + GXutil.trim( A6311Lb_TaAuxD) ;
      httpContext.ajax_rsp_assign_attri("", false, "A13756Lb_TaAuxCD", A13756Lb_TaAuxCD);
   }

   public void checkExtendedTable1SO918( )
   {
      nIsDirty_918 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      nIsDirty_918 = (short)(1) ;
      A13756Lb_TaAuxCD = GXutil.trim( A6310Lb_TaAuxC) + "-" + GXutil.trim( A6311Lb_TaAuxD) ;
      httpContext.ajax_rsp_assign_attri("", false, "A13756Lb_TaAuxCD", A13756Lb_TaAuxCD);
   }

   public void closeExtendedTableCursors1SO918( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1SO918( )
   {
      /* Using cursor T01SO6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Boolean.valueOf(n6310Lb_TaAuxC), A6310Lb_TaAuxC});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound918 = (short)(1) ;
      }
      else
      {
         RcdFound918 = (short)(0) ;
      }
      pr_default.close(4);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01SO3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Boolean.valueOf(n6310Lb_TaAuxC), A6310Lb_TaAuxC});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T01SO3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1SO918( 10) ;
         RcdFound918 = (short)(1) ;
         A6310Lb_TaAuxC = T01SO3_A6310Lb_TaAuxC[0] ;
         n6310Lb_TaAuxC = T01SO3_n6310Lb_TaAuxC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6310Lb_TaAuxC", A6310Lb_TaAuxC);
         A6596Lb_TaAuxf1 = T01SO3_A6596Lb_TaAuxf1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6596Lb_TaAuxf1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6596Lb_TaAuxf1), 2, 0));
         A6597Lb_TaAuxf2 = T01SO3_A6597Lb_TaAuxf2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6597Lb_TaAuxf2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6597Lb_TaAuxf2), 2, 0));
         A6598Lb_TaAuxf3 = T01SO3_A6598Lb_TaAuxf3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6598Lb_TaAuxf3", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6598Lb_TaAuxf3), 2, 0));
         A6311Lb_TaAuxD = T01SO3_A6311Lb_TaAuxD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6311Lb_TaAuxD", A6311Lb_TaAuxD);
         A6312lb_TaAuxUL = T01SO3_A6312lb_TaAuxUL[0] ;
         Z396EmprCod = A396EmprCod ;
         Z6310Lb_TaAuxC = A6310Lb_TaAuxC ;
         sMode918 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1SO918( ) ;
         if ( AnyError == 1 )
         {
            RcdFound918 = (short)(0) ;
            initializeNonKey1SO918( ) ;
         }
         Gx_mode = sMode918 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound918 = (short)(0) ;
         initializeNonKey1SO918( ) ;
         sMode918 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode918 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1SO918( ) ;
      if ( RcdFound918 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound918 = (short)(0) ;
      /* Using cursor T01SO7 */
      pr_default.execute(5, new Object[] {Boolean.valueOf(n6310Lb_TaAuxC), A6310Lb_TaAuxC, A396EmprCod});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( ( GXutil.strcmp(T01SO7_A6310Lb_TaAuxC[0], A6310Lb_TaAuxC) < 0 ) ) && ( GXutil.strcmp(T01SO7_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( ( GXutil.strcmp(T01SO7_A6310Lb_TaAuxC[0], A6310Lb_TaAuxC) > 0 ) ) && ( GXutil.strcmp(T01SO7_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A6310Lb_TaAuxC = T01SO7_A6310Lb_TaAuxC[0] ;
            n6310Lb_TaAuxC = T01SO7_n6310Lb_TaAuxC[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A6310Lb_TaAuxC", A6310Lb_TaAuxC);
            RcdFound918 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void move_previous( )
   {
      RcdFound918 = (short)(0) ;
      /* Using cursor T01SO8 */
      pr_default.execute(6, new Object[] {Boolean.valueOf(n6310Lb_TaAuxC), A6310Lb_TaAuxC, A396EmprCod});
      if ( (pr_default.getStatus(6) != 101) )
      {
         while ( (pr_default.getStatus(6) != 101) && ( ( GXutil.strcmp(T01SO8_A6310Lb_TaAuxC[0], A6310Lb_TaAuxC) > 0 ) ) && ( GXutil.strcmp(T01SO8_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(6);
         }
         if ( (pr_default.getStatus(6) != 101) && ( ( GXutil.strcmp(T01SO8_A6310Lb_TaAuxC[0], A6310Lb_TaAuxC) < 0 ) ) && ( GXutil.strcmp(T01SO8_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A6310Lb_TaAuxC = T01SO8_A6310Lb_TaAuxC[0] ;
            n6310Lb_TaAuxC = T01SO8_n6310Lb_TaAuxC[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A6310Lb_TaAuxC", A6310Lb_TaAuxC);
            RcdFound918 = (short)(1) ;
         }
      }
      pr_default.close(6);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1SO918( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtLb_TaAuxC_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1SO918( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound918 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A6310Lb_TaAuxC, Z6310Lb_TaAuxC) != 0 ) )
            {
               A6310Lb_TaAuxC = Z6310Lb_TaAuxC ;
               n6310Lb_TaAuxC = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A6310Lb_TaAuxC", A6310Lb_TaAuxC);
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "LB_TAAUXC");
               AnyError = (short)(1) ;
               GX_FocusControl = edtLb_TaAuxC_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtLb_TaAuxC_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               update1SO918( ) ;
               GX_FocusControl = edtLb_TaAuxC_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A6310Lb_TaAuxC, Z6310Lb_TaAuxC) != 0 ) )
            {
               /* Insert record */
               GX_FocusControl = edtLb_TaAuxC_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1SO918( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "LB_TAAUXC");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtLb_TaAuxC_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  /* Insert record */
                  GX_FocusControl = edtLb_TaAuxC_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1SO918( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A6310Lb_TaAuxC, Z6310Lb_TaAuxC) != 0 ) )
      {
         A6310Lb_TaAuxC = Z6310Lb_TaAuxC ;
         n6310Lb_TaAuxC = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6310Lb_TaAuxC", A6310Lb_TaAuxC);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "LB_TAAUXC");
         AnyError = (short)(1) ;
         GX_FocusControl = edtLb_TaAuxC_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtLb_TaAuxC_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency1SO918( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01SO2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Boolean.valueOf(n6310Lb_TaAuxC), A6310Lb_TaAuxC});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPENS005"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( Z6596Lb_TaAuxf1 != T01SO2_A6596Lb_TaAuxf1[0] ) || ( Z6597Lb_TaAuxf2 != T01SO2_A6597Lb_TaAuxf2[0] ) || ( Z6598Lb_TaAuxf3 != T01SO2_A6598Lb_TaAuxf3[0] ) || ( GXutil.strcmp(Z6311Lb_TaAuxD, T01SO2_A6311Lb_TaAuxD[0]) != 0 ) || ( Z6312lb_TaAuxUL != T01SO2_A6312lb_TaAuxUL[0] ) )
         {
            if ( Z6596Lb_TaAuxf1 != T01SO2_A6596Lb_TaAuxf1[0] )
            {
               GXutil.writeLogln("gestionlaboratorio.tablaalcalisysulfatos_1:[seudo value changed for attri]"+"Lb_TaAuxf1");
               GXutil.writeLogRaw("Old: ",Z6596Lb_TaAuxf1);
               GXutil.writeLogRaw("Current: ",T01SO2_A6596Lb_TaAuxf1[0]);
            }
            if ( Z6597Lb_TaAuxf2 != T01SO2_A6597Lb_TaAuxf2[0] )
            {
               GXutil.writeLogln("gestionlaboratorio.tablaalcalisysulfatos_1:[seudo value changed for attri]"+"Lb_TaAuxf2");
               GXutil.writeLogRaw("Old: ",Z6597Lb_TaAuxf2);
               GXutil.writeLogRaw("Current: ",T01SO2_A6597Lb_TaAuxf2[0]);
            }
            if ( Z6598Lb_TaAuxf3 != T01SO2_A6598Lb_TaAuxf3[0] )
            {
               GXutil.writeLogln("gestionlaboratorio.tablaalcalisysulfatos_1:[seudo value changed for attri]"+"Lb_TaAuxf3");
               GXutil.writeLogRaw("Old: ",Z6598Lb_TaAuxf3);
               GXutil.writeLogRaw("Current: ",T01SO2_A6598Lb_TaAuxf3[0]);
            }
            if ( GXutil.strcmp(Z6311Lb_TaAuxD, T01SO2_A6311Lb_TaAuxD[0]) != 0 )
            {
               GXutil.writeLogln("gestionlaboratorio.tablaalcalisysulfatos_1:[seudo value changed for attri]"+"Lb_TaAuxD");
               GXutil.writeLogRaw("Old: ",Z6311Lb_TaAuxD);
               GXutil.writeLogRaw("Current: ",T01SO2_A6311Lb_TaAuxD[0]);
            }
            if ( Z6312lb_TaAuxUL != T01SO2_A6312lb_TaAuxUL[0] )
            {
               GXutil.writeLogln("gestionlaboratorio.tablaalcalisysulfatos_1:[seudo value changed for attri]"+"lb_TaAuxUL");
               GXutil.writeLogRaw("Old: ",Z6312lb_TaAuxUL);
               GXutil.writeLogRaw("Current: ",T01SO2_A6312lb_TaAuxUL[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPENS005"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1SO918( )
   {
      beforeValidate1SO918( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1SO918( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1SO918( 0) ;
         checkOptimisticConcurrency1SO918( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1SO918( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1SO918( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01SO9 */
                  pr_default.execute(7, new Object[] {Boolean.valueOf(n6310Lb_TaAuxC), A6310Lb_TaAuxC, Byte.valueOf(A6596Lb_TaAuxf1), Byte.valueOf(A6597Lb_TaAuxf2), Byte.valueOf(A6598Lb_TaAuxf3), A6311Lb_TaAuxD, Short.valueOf(A6312lb_TaAuxUL), A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENS005");
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
                        resetCaption1SO0( ) ;
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
            load1SO918( ) ;
         }
         endLevel1SO918( ) ;
      }
      closeExtendedTableCursors1SO918( ) ;
   }

   public void update1SO918( )
   {
      beforeValidate1SO918( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1SO918( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1SO918( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1SO918( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1SO918( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01SO10 */
                  pr_default.execute(8, new Object[] {Byte.valueOf(A6596Lb_TaAuxf1), Byte.valueOf(A6597Lb_TaAuxf2), Byte.valueOf(A6598Lb_TaAuxf3), A6311Lb_TaAuxD, Short.valueOf(A6312lb_TaAuxUL), A396EmprCod, Boolean.valueOf(n6310Lb_TaAuxC), A6310Lb_TaAuxC});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENS005");
                  if ( (pr_default.getStatus(8) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPENS005"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1SO918( ) ;
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
         endLevel1SO918( ) ;
      }
      closeExtendedTableCursors1SO918( ) ;
   }

   public void deferredUpdate1SO918( )
   {
   }

   public void delete( )
   {
      beforeValidate1SO918( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1SO918( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1SO918( ) ;
         afterConfirm1SO918( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1SO918( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01SO11 */
               pr_default.execute(9, new Object[] {A396EmprCod, Boolean.valueOf(n6310Lb_TaAuxC), A6310Lb_TaAuxC});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENS005");
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
      sMode918 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1SO918( ) ;
      Gx_mode = sMode918 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1SO918( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         A13756Lb_TaAuxCD = GXutil.trim( A6310Lb_TaAuxC) + "-" + GXutil.trim( A6311Lb_TaAuxD) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13756Lb_TaAuxCD", A13756Lb_TaAuxCD);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T01SO12 */
         pr_default.execute(10, new Object[] {A396EmprCod, Boolean.valueOf(n6310Lb_TaAuxC), A6310Lb_TaAuxC});
         if ( (pr_default.getStatus(10) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ENS008", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(10);
         /* Using cursor T01SO13 */
         pr_default.execute(11, new Object[] {A396EmprCod, Boolean.valueOf(n6310Lb_TaAuxC), A6310Lb_TaAuxC});
         if ( (pr_default.getStatus(11) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {""}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(11);
         /* Using cursor T01SO14 */
         pr_default.execute(12, new Object[] {A396EmprCod, Boolean.valueOf(n6310Lb_TaAuxC), A6310Lb_TaAuxC});
         if ( (pr_default.getStatus(12) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CDFORM", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(12);
      }
   }

   public void endLevel1SO918( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1SO918( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "gestionlaboratorio.tablaalcalisysulfatos_1");
         if ( AnyError == 0 )
         {
            confirmValues1SO0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "gestionlaboratorio.tablaalcalisysulfatos_1");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1SO918( )
   {
      /* Scan By routine */
      /* Using cursor T01SO15 */
      pr_default.execute(13, new Object[] {A396EmprCod});
      RcdFound918 = (short)(0) ;
      if ( (pr_default.getStatus(13) != 101) )
      {
         RcdFound918 = (short)(1) ;
         A6310Lb_TaAuxC = T01SO15_A6310Lb_TaAuxC[0] ;
         n6310Lb_TaAuxC = T01SO15_n6310Lb_TaAuxC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6310Lb_TaAuxC", A6310Lb_TaAuxC);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1SO918( )
   {
      /* Scan next routine */
      pr_default.readNext(13);
      RcdFound918 = (short)(0) ;
      if ( (pr_default.getStatus(13) != 101) )
      {
         RcdFound918 = (short)(1) ;
         A6310Lb_TaAuxC = T01SO15_A6310Lb_TaAuxC[0] ;
         n6310Lb_TaAuxC = T01SO15_n6310Lb_TaAuxC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6310Lb_TaAuxC", A6310Lb_TaAuxC);
      }
   }

   public void scanEnd1SO918( )
   {
      pr_default.close(13);
   }

   public void afterConfirm1SO918( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1SO918( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1SO918( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1SO918( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1SO918( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1SO918( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1SO918( )
   {
      edtLb_TaAuxC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_TaAuxC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_TaAuxC_Enabled), 5, 0), true);
      edtLb_TaAuxD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_TaAuxD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_TaAuxD_Enabled), 5, 0), true);
      edtLb_TaAuxf1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_TaAuxf1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_TaAuxf1_Enabled), 5, 0), true);
      edtLb_TaAuxf2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_TaAuxf2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_TaAuxf2_Enabled), 5, 0), true);
      edtLb_TaAuxf3_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_TaAuxf3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_TaAuxf3_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      edtavCombolb_taauxf1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCombolb_taauxf1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombolb_taauxf1_Enabled), 5, 0), true);
      edtavCombolb_taauxf2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCombolb_taauxf2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombolb_taauxf2_Enabled), 5, 0), true);
      edtavCombolb_taauxf3_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCombolb_taauxf3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombolb_taauxf3_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1SO918( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1SO0( )
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.gestionlaboratorio.tablaalcalisysulfatos_1", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV10EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV11Lb_TaAuxC))}, new String[] {"Gx_mode","EmprCod","Lb_TaAuxC"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"TablaAlcalisySulfatos_1");
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      forbiddenHiddens.add("lb_TaAuxUL", localUtil.format( DecimalUtil.doubleToDec(A6312lb_TaAuxUL), "ZZZ9"));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("gestionlaboratorio\\tablaalcalisysulfatos_1:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6310Lb_TaAuxC", GXutil.rtrim( Z6310Lb_TaAuxC));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6596Lb_TaAuxf1", GXutil.ltrim( localUtil.ntoc( Z6596Lb_TaAuxf1, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6597Lb_TaAuxf2", GXutil.ltrim( localUtil.ntoc( Z6597Lb_TaAuxf2, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6598Lb_TaAuxf3", GXutil.ltrim( localUtil.ntoc( Z6598Lb_TaAuxf3, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6311Lb_TaAuxD", GXutil.rtrim( Z6311Lb_TaAuxD));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6312lb_TaAuxUL", GXutil.ltrim( localUtil.ntoc( Z6312lb_TaAuxUL, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vLB_TAAUXF1_DATA", AV15Lb_TaAuxf1_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vLB_TAAUXF1_DATA", AV15Lb_TaAuxf1_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vLB_TAAUXF2_DATA", AV18Lb_TaAuxf2_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vLB_TAAUXF2_DATA", AV18Lb_TaAuxf2_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vLB_TAAUXF3_DATA", AV20Lb_TaAuxf3_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vLB_TAAUXF3_DATA", AV20Lb_TaAuxf3_Data);
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
      app.GxWebStd.gx_hidden_field( httpContext, "LB_TAAUXCD", A13756Lb_TaAuxCD);
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV10EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV10EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vLB_TAAUXC", GXutil.rtrim( AV11Lb_TaAuxC));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vLB_TAAUXC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV11Lb_TaAuxC, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "LB_TAAUXUL", GXutil.ltrim( localUtil.ntoc( A6312lb_TaAuxUL, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRNOM", GXutil.rtrim( A407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_LB_TAAUXF1_Objectcall", GXutil.rtrim( Combo_lb_taauxf1_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_LB_TAAUXF1_Cls", GXutil.rtrim( Combo_lb_taauxf1_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_LB_TAAUXF1_Selectedvalue_set", GXutil.rtrim( Combo_lb_taauxf1_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_LB_TAAUXF1_Enabled", GXutil.booltostr( Combo_lb_taauxf1_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_LB_TAAUXF1_Emptyitem", GXutil.booltostr( Combo_lb_taauxf1_Emptyitem));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_LB_TAAUXF2_Objectcall", GXutil.rtrim( Combo_lb_taauxf2_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_LB_TAAUXF2_Cls", GXutil.rtrim( Combo_lb_taauxf2_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_LB_TAAUXF2_Selectedvalue_set", GXutil.rtrim( Combo_lb_taauxf2_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_LB_TAAUXF2_Enabled", GXutil.booltostr( Combo_lb_taauxf2_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_LB_TAAUXF2_Emptyitem", GXutil.booltostr( Combo_lb_taauxf2_Emptyitem));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_LB_TAAUXF3_Objectcall", GXutil.rtrim( Combo_lb_taauxf3_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_LB_TAAUXF3_Cls", GXutil.rtrim( Combo_lb_taauxf3_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_LB_TAAUXF3_Selectedvalue_set", GXutil.rtrim( Combo_lb_taauxf3_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_LB_TAAUXF3_Enabled", GXutil.booltostr( Combo_lb_taauxf3_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_LB_TAAUXF3_Emptyitem", GXutil.booltostr( Combo_lb_taauxf3_Emptyitem));
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
      return formatLink("app.gestionlaboratorio.tablaalcalisysulfatos_1", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV10EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV11Lb_TaAuxC))}, new String[] {"Gx_mode","EmprCod","Lb_TaAuxC"})  ;
   }

   public String getPgmname( )
   {
      return "GestionLaboratorio.TablaAlcalisySulfatos_1" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Tabla Alcalis y Sulfatos", "") ;
   }

   public void initializeNonKey1SO918( )
   {
      A6596Lb_TaAuxf1 = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A6596Lb_TaAuxf1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6596Lb_TaAuxf1), 2, 0));
      A6597Lb_TaAuxf2 = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A6597Lb_TaAuxf2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6597Lb_TaAuxf2), 2, 0));
      A6598Lb_TaAuxf3 = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A6598Lb_TaAuxf3", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6598Lb_TaAuxf3), 2, 0));
      A13756Lb_TaAuxCD = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13756Lb_TaAuxCD", A13756Lb_TaAuxCD);
      A6311Lb_TaAuxD = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A6311Lb_TaAuxD", A6311Lb_TaAuxD);
      A6312lb_TaAuxUL = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A6312lb_TaAuxUL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6312lb_TaAuxUL), 4, 0));
      Z6596Lb_TaAuxf1 = (byte)(0) ;
      Z6597Lb_TaAuxf2 = (byte)(0) ;
      Z6598Lb_TaAuxf3 = (byte)(0) ;
      Z6311Lb_TaAuxD = "" ;
      Z6312lb_TaAuxUL = (short)(0) ;
   }

   public void initAll1SO918( )
   {
      A6310Lb_TaAuxC = "" ;
      n6310Lb_TaAuxC = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6310Lb_TaAuxC", A6310Lb_TaAuxC);
      initializeNonKey1SO918( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211693753", true, true);
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
      httpContext.AddJavascriptSource("gestionlaboratorio/tablaalcalisysulfatos_1.js", "?20268211693753", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      edtLb_TaAuxC_Internalname = "LB_TAAUXC" ;
      edtLb_TaAuxD_Internalname = "LB_TAAUXD" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      lblTextblocklb_taauxf1_Internalname = "TEXTBLOCKLB_TAAUXF1" ;
      Combo_lb_taauxf1_Internalname = "COMBO_LB_TAAUXF1" ;
      edtLb_TaAuxf1_Internalname = "LB_TAAUXF1" ;
      divTablesplittedlb_taauxf1_Internalname = "TABLESPLITTEDLB_TAAUXF1" ;
      lblTextblocklb_taauxf2_Internalname = "TEXTBLOCKLB_TAAUXF2" ;
      Combo_lb_taauxf2_Internalname = "COMBO_LB_TAAUXF2" ;
      edtLb_TaAuxf2_Internalname = "LB_TAAUXF2" ;
      divTablesplittedlb_taauxf2_Internalname = "TABLESPLITTEDLB_TAAUXF2" ;
      lblTextblocklb_taauxf3_Internalname = "TEXTBLOCKLB_TAAUXF3" ;
      Combo_lb_taauxf3_Internalname = "COMBO_LB_TAAUXF3" ;
      edtLb_TaAuxf3_Internalname = "LB_TAAUXF3" ;
      divTablesplittedlb_taauxf3_Internalname = "TABLESPLITTEDLB_TAAUXF3" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      grpUnnamedgroup3_Internalname = "UNNAMEDGROUP3" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      bttBtntrn_delete_Internalname = "BTNTRN_DELETE" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtavCombolb_taauxf1_Internalname = "vCOMBOLB_TAAUXF1" ;
      divSectionattribute_lb_taauxf1_Internalname = "SECTIONATTRIBUTE_LB_TAAUXF1" ;
      edtavCombolb_taauxf2_Internalname = "vCOMBOLB_TAAUXF2" ;
      divSectionattribute_lb_taauxf2_Internalname = "SECTIONATTRIBUTE_LB_TAAUXF2" ;
      edtavCombolb_taauxf3_Internalname = "vCOMBOLB_TAAUXF3" ;
      divSectionattribute_lb_taauxf3_Internalname = "SECTIONATTRIBUTE_LB_TAAUXF3" ;
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
      Form.setCaption( httpContext.getMessage( "Tabla Alcalis y Sulfatos", "") );
      edtavCombolb_taauxf3_Jsonclick = "" ;
      edtavCombolb_taauxf3_Enabled = 0 ;
      edtavCombolb_taauxf3_Visible = 1 ;
      edtavCombolb_taauxf2_Jsonclick = "" ;
      edtavCombolb_taauxf2_Enabled = 0 ;
      edtavCombolb_taauxf2_Visible = 1 ;
      edtavCombolb_taauxf1_Jsonclick = "" ;
      edtavCombolb_taauxf1_Enabled = 0 ;
      edtavCombolb_taauxf1_Visible = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      bttBtntrn_delete_Enabled = 0 ;
      bttBtntrn_delete_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      edtLb_TaAuxf3_Jsonclick = "" ;
      edtLb_TaAuxf3_Enabled = 1 ;
      edtLb_TaAuxf3_Visible = 1 ;
      Combo_lb_taauxf3_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_lb_taauxf3_Cls = "ExtendedCombo AttributeFL" ;
      Combo_lb_taauxf3_Enabled = GXutil.toBoolean( -1) ;
      edtLb_TaAuxf2_Jsonclick = "" ;
      edtLb_TaAuxf2_Enabled = 1 ;
      edtLb_TaAuxf2_Visible = 1 ;
      Combo_lb_taauxf2_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_lb_taauxf2_Cls = "ExtendedCombo AttributeFL" ;
      Combo_lb_taauxf2_Enabled = GXutil.toBoolean( -1) ;
      edtLb_TaAuxf1_Jsonclick = "" ;
      edtLb_TaAuxf1_Enabled = 1 ;
      edtLb_TaAuxf1_Visible = 1 ;
      Combo_lb_taauxf1_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_lb_taauxf1_Cls = "ExtendedCombo AttributeFL" ;
      Combo_lb_taauxf1_Enabled = GXutil.toBoolean( -1) ;
      edtLb_TaAuxD_Jsonclick = "" ;
      edtLb_TaAuxD_Enabled = 1 ;
      edtLb_TaAuxC_Jsonclick = "" ;
      edtLb_TaAuxC_Enabled = 1 ;
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV10EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV11Lb_TaAuxC',fld:'vLB_TAAUXC',pic:'',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV13TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true},{av:'AV10EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV11Lb_TaAuxC',fld:'vLB_TAAUXC',pic:'',hsh:true},{av:'A6312lb_TaAuxUL',fld:'LB_TAAUXUL',pic:'ZZZ9'}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e121SO2',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV10EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'A6310Lb_TaAuxC',fld:'LB_TAAUXC',pic:''},{av:'A6311Lb_TaAuxD',fld:'LB_TAAUXD',pic:''},{av:'AV13TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true}]");
      setEventMetadata("AFTER TRN",",oparms:[]}");
      setEventMetadata("VALID_LB_TAAUXC","{handler:'valid_Lb_taauxc',iparms:[]");
      setEventMetadata("VALID_LB_TAAUXC",",oparms:[]}");
      setEventMetadata("VALID_LB_TAAUXD","{handler:'valid_Lb_taauxd',iparms:[]");
      setEventMetadata("VALID_LB_TAAUXD",",oparms:[]}");
      setEventMetadata("VALIDV_COMBOLB_TAAUXF1","{handler:'validv_Combolb_taauxf1',iparms:[]");
      setEventMetadata("VALIDV_COMBOLB_TAAUXF1",",oparms:[]}");
      setEventMetadata("VALIDV_COMBOLB_TAAUXF2","{handler:'validv_Combolb_taauxf2',iparms:[]");
      setEventMetadata("VALIDV_COMBOLB_TAAUXF2",",oparms:[]}");
      setEventMetadata("VALIDV_COMBOLB_TAAUXF3","{handler:'validv_Combolb_taauxf3',iparms:[]");
      setEventMetadata("VALIDV_COMBOLB_TAAUXF3",",oparms:[]}");
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
      wcpOAV10EmprCod = "" ;
      wcpOAV11Lb_TaAuxC = "" ;
      Z396EmprCod = "" ;
      Z6310Lb_TaAuxC = "" ;
      Z6311Lb_TaAuxD = "" ;
      Combo_lb_taauxf3_Selectedvalue_get = "" ;
      Combo_lb_taauxf2_Selectedvalue_get = "" ;
      Combo_lb_taauxf1_Selectedvalue_get = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      Gx_mode = "" ;
      AV10EmprCod = "" ;
      AV11Lb_TaAuxC = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      A6310Lb_TaAuxC = "" ;
      A6311Lb_TaAuxD = "" ;
      lblTextblocklb_taauxf1_Jsonclick = "" ;
      ucCombo_lb_taauxf1 = new com.genexus.webpanels.GXUserControl();
      Combo_lb_taauxf1_Caption = "" ;
      AV15Lb_TaAuxf1_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      lblTextblocklb_taauxf2_Jsonclick = "" ;
      ucCombo_lb_taauxf2 = new com.genexus.webpanels.GXUserControl();
      Combo_lb_taauxf2_Caption = "" ;
      AV18Lb_TaAuxf2_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      lblTextblocklb_taauxf3_Jsonclick = "" ;
      ucCombo_lb_taauxf3 = new com.genexus.webpanels.GXUserControl();
      Combo_lb_taauxf3_Caption = "" ;
      AV20Lb_TaAuxf3_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      AV22Pgmname = "" ;
      A13756Lb_TaAuxCD = "" ;
      A396EmprCod = "" ;
      A407EmprNom = "" ;
      Combo_lb_taauxf1_Objectcall = "" ;
      Combo_lb_taauxf1_Class = "" ;
      Combo_lb_taauxf1_Icontype = "" ;
      Combo_lb_taauxf1_Icon = "" ;
      Combo_lb_taauxf1_Tooltip = "" ;
      Combo_lb_taauxf1_Selectedvalue_set = "" ;
      Combo_lb_taauxf1_Selectedtext_set = "" ;
      Combo_lb_taauxf1_Selectedtext_get = "" ;
      Combo_lb_taauxf1_Gamoauthtoken = "" ;
      Combo_lb_taauxf1_Ddointernalname = "" ;
      Combo_lb_taauxf1_Titlecontrolalign = "" ;
      Combo_lb_taauxf1_Dropdownoptionstype = "" ;
      Combo_lb_taauxf1_Titlecontrolidtoreplace = "" ;
      Combo_lb_taauxf1_Datalisttype = "" ;
      Combo_lb_taauxf1_Datalistfixedvalues = "" ;
      Combo_lb_taauxf1_Datalistproc = "" ;
      Combo_lb_taauxf1_Datalistprocparametersprefix = "" ;
      Combo_lb_taauxf1_Remoteservicesparameters = "" ;
      Combo_lb_taauxf1_Htmltemplate = "" ;
      Combo_lb_taauxf1_Multiplevaluestype = "" ;
      Combo_lb_taauxf1_Loadingdata = "" ;
      Combo_lb_taauxf1_Noresultsfound = "" ;
      Combo_lb_taauxf1_Emptyitemtext = "" ;
      Combo_lb_taauxf1_Onlyselectedvalues = "" ;
      Combo_lb_taauxf1_Selectalltext = "" ;
      Combo_lb_taauxf1_Multiplevaluesseparator = "" ;
      Combo_lb_taauxf1_Addnewoptiontext = "" ;
      Combo_lb_taauxf2_Objectcall = "" ;
      Combo_lb_taauxf2_Class = "" ;
      Combo_lb_taauxf2_Icontype = "" ;
      Combo_lb_taauxf2_Icon = "" ;
      Combo_lb_taauxf2_Tooltip = "" ;
      Combo_lb_taauxf2_Selectedvalue_set = "" ;
      Combo_lb_taauxf2_Selectedtext_set = "" ;
      Combo_lb_taauxf2_Selectedtext_get = "" ;
      Combo_lb_taauxf2_Gamoauthtoken = "" ;
      Combo_lb_taauxf2_Ddointernalname = "" ;
      Combo_lb_taauxf2_Titlecontrolalign = "" ;
      Combo_lb_taauxf2_Dropdownoptionstype = "" ;
      Combo_lb_taauxf2_Titlecontrolidtoreplace = "" ;
      Combo_lb_taauxf2_Datalisttype = "" ;
      Combo_lb_taauxf2_Datalistfixedvalues = "" ;
      Combo_lb_taauxf2_Datalistproc = "" ;
      Combo_lb_taauxf2_Datalistprocparametersprefix = "" ;
      Combo_lb_taauxf2_Remoteservicesparameters = "" ;
      Combo_lb_taauxf2_Htmltemplate = "" ;
      Combo_lb_taauxf2_Multiplevaluestype = "" ;
      Combo_lb_taauxf2_Loadingdata = "" ;
      Combo_lb_taauxf2_Noresultsfound = "" ;
      Combo_lb_taauxf2_Emptyitemtext = "" ;
      Combo_lb_taauxf2_Onlyselectedvalues = "" ;
      Combo_lb_taauxf2_Selectalltext = "" ;
      Combo_lb_taauxf2_Multiplevaluesseparator = "" ;
      Combo_lb_taauxf2_Addnewoptiontext = "" ;
      Combo_lb_taauxf3_Objectcall = "" ;
      Combo_lb_taauxf3_Class = "" ;
      Combo_lb_taauxf3_Icontype = "" ;
      Combo_lb_taauxf3_Icon = "" ;
      Combo_lb_taauxf3_Tooltip = "" ;
      Combo_lb_taauxf3_Selectedvalue_set = "" ;
      Combo_lb_taauxf3_Selectedtext_set = "" ;
      Combo_lb_taauxf3_Selectedtext_get = "" ;
      Combo_lb_taauxf3_Gamoauthtoken = "" ;
      Combo_lb_taauxf3_Ddointernalname = "" ;
      Combo_lb_taauxf3_Titlecontrolalign = "" ;
      Combo_lb_taauxf3_Dropdownoptionstype = "" ;
      Combo_lb_taauxf3_Titlecontrolidtoreplace = "" ;
      Combo_lb_taauxf3_Datalisttype = "" ;
      Combo_lb_taauxf3_Datalistfixedvalues = "" ;
      Combo_lb_taauxf3_Datalistproc = "" ;
      Combo_lb_taauxf3_Datalistprocparametersprefix = "" ;
      Combo_lb_taauxf3_Remoteservicesparameters = "" ;
      Combo_lb_taauxf3_Htmltemplate = "" ;
      Combo_lb_taauxf3_Multiplevaluestype = "" ;
      Combo_lb_taauxf3_Loadingdata = "" ;
      Combo_lb_taauxf3_Noresultsfound = "" ;
      Combo_lb_taauxf3_Emptyitemtext = "" ;
      Combo_lb_taauxf3_Onlyselectedvalues = "" ;
      Combo_lb_taauxf3_Selectalltext = "" ;
      Combo_lb_taauxf3_Multiplevaluesseparator = "" ;
      Combo_lb_taauxf3_Addnewoptiontext = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode918 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      AV7Station = "" ;
      AV8EmprNom = "" ;
      AV9UsurCod = "" ;
      GXt_char1 = "" ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      AV12WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext5 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV13TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV14WebSession = httpContext.getWebSession();
      AV16ComboSelectedValue = "" ;
      GXt_objcol_SdtDVB_SDTComboData_Item6 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      GXv_char4 = new String[1] ;
      GXv_objcol_SdtDVB_SDTComboData_Item7 = new GXBaseCollection[1] ;
      Z407EmprNom = "" ;
      T01SO4_A407EmprNom = new String[] {""} ;
      T01SO4_n407EmprNom = new boolean[] {false} ;
      T01SO5_A6310Lb_TaAuxC = new String[] {""} ;
      T01SO5_n6310Lb_TaAuxC = new boolean[] {false} ;
      T01SO5_A6596Lb_TaAuxf1 = new byte[1] ;
      T01SO5_A6597Lb_TaAuxf2 = new byte[1] ;
      T01SO5_A6598Lb_TaAuxf3 = new byte[1] ;
      T01SO5_A407EmprNom = new String[] {""} ;
      T01SO5_n407EmprNom = new boolean[] {false} ;
      T01SO5_A6311Lb_TaAuxD = new String[] {""} ;
      T01SO5_A6312lb_TaAuxUL = new short[1] ;
      T01SO5_A396EmprCod = new String[] {""} ;
      T01SO6_A396EmprCod = new String[] {""} ;
      T01SO6_A6310Lb_TaAuxC = new String[] {""} ;
      T01SO6_n6310Lb_TaAuxC = new boolean[] {false} ;
      T01SO3_A6310Lb_TaAuxC = new String[] {""} ;
      T01SO3_n6310Lb_TaAuxC = new boolean[] {false} ;
      T01SO3_A6596Lb_TaAuxf1 = new byte[1] ;
      T01SO3_A6597Lb_TaAuxf2 = new byte[1] ;
      T01SO3_A6598Lb_TaAuxf3 = new byte[1] ;
      T01SO3_A6311Lb_TaAuxD = new String[] {""} ;
      T01SO3_A6312lb_TaAuxUL = new short[1] ;
      T01SO3_A396EmprCod = new String[] {""} ;
      T01SO7_A396EmprCod = new String[] {""} ;
      T01SO7_A6310Lb_TaAuxC = new String[] {""} ;
      T01SO7_n6310Lb_TaAuxC = new boolean[] {false} ;
      T01SO8_A396EmprCod = new String[] {""} ;
      T01SO8_A6310Lb_TaAuxC = new String[] {""} ;
      T01SO8_n6310Lb_TaAuxC = new boolean[] {false} ;
      T01SO2_A6310Lb_TaAuxC = new String[] {""} ;
      T01SO2_n6310Lb_TaAuxC = new boolean[] {false} ;
      T01SO2_A6596Lb_TaAuxf1 = new byte[1] ;
      T01SO2_A6597Lb_TaAuxf2 = new byte[1] ;
      T01SO2_A6598Lb_TaAuxf3 = new byte[1] ;
      T01SO2_A6311Lb_TaAuxD = new String[] {""} ;
      T01SO2_A6312lb_TaAuxUL = new short[1] ;
      T01SO2_A396EmprCod = new String[] {""} ;
      T01SO12_A396EmprCod = new String[] {""} ;
      T01SO12_A6310Lb_TaAuxC = new String[] {""} ;
      T01SO12_n6310Lb_TaAuxC = new boolean[] {false} ;
      T01SO12_A6313lb_TaAuxL = new short[1] ;
      T01SO13_A396EmprCod = new String[] {""} ;
      T01SO13_A5532Lb_numero = new int[1] ;
      T01SO13_A5555Lb_opcion = new String[] {""} ;
      T01SO14_A396EmprCod = new String[] {""} ;
      T01SO14_A486ForNumCol = new int[1] ;
      T01SO15_A396EmprCod = new String[] {""} ;
      T01SO15_A6310Lb_TaAuxC = new String[] {""} ;
      T01SO15_n6310Lb_TaAuxC = new boolean[] {false} ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.gestionlaboratorio.tablaalcalisysulfatos_1__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.gestionlaboratorio.tablaalcalisysulfatos_1__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.gestionlaboratorio.tablaalcalisysulfatos_1__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.gestionlaboratorio.tablaalcalisysulfatos_1__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.gestionlaboratorio.tablaalcalisysulfatos_1__default(),
         new Object[] {
             new Object[] {
            T01SO2_A6310Lb_TaAuxC, T01SO2_A6596Lb_TaAuxf1, T01SO2_A6597Lb_TaAuxf2, T01SO2_A6598Lb_TaAuxf3, T01SO2_A6311Lb_TaAuxD, T01SO2_A6312lb_TaAuxUL, T01SO2_A396EmprCod
            }
            , new Object[] {
            T01SO3_A6310Lb_TaAuxC, T01SO3_A6596Lb_TaAuxf1, T01SO3_A6597Lb_TaAuxf2, T01SO3_A6598Lb_TaAuxf3, T01SO3_A6311Lb_TaAuxD, T01SO3_A6312lb_TaAuxUL, T01SO3_A396EmprCod
            }
            , new Object[] {
            T01SO4_A407EmprNom, T01SO4_n407EmprNom
            }
            , new Object[] {
            T01SO5_A6310Lb_TaAuxC, T01SO5_A6596Lb_TaAuxf1, T01SO5_A6597Lb_TaAuxf2, T01SO5_A6598Lb_TaAuxf3, T01SO5_A407EmprNom, T01SO5_n407EmprNom, T01SO5_A6311Lb_TaAuxD, T01SO5_A6312lb_TaAuxUL, T01SO5_A396EmprCod
            }
            , new Object[] {
            T01SO6_A396EmprCod, T01SO6_A6310Lb_TaAuxC
            }
            , new Object[] {
            T01SO7_A396EmprCod, T01SO7_A6310Lb_TaAuxC
            }
            , new Object[] {
            T01SO8_A396EmprCod, T01SO8_A6310Lb_TaAuxC
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01SO12_A396EmprCod, T01SO12_A6310Lb_TaAuxC, T01SO12_A6313lb_TaAuxL
            }
            , new Object[] {
            T01SO13_A396EmprCod, T01SO13_A5532Lb_numero, T01SO13_A5555Lb_opcion
            }
            , new Object[] {
            T01SO14_A396EmprCod, T01SO14_A486ForNumCol
            }
            , new Object[] {
            T01SO15_A396EmprCod, T01SO15_A6310Lb_TaAuxC
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV22Pgmname = "GestionLaboratorio.TablaAlcalisySulfatos_1" ;
   }

   private byte Z6596Lb_TaAuxf1 ;
   private byte Z6597Lb_TaAuxf2 ;
   private byte Z6598Lb_TaAuxf3 ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A6596Lb_TaAuxf1 ;
   private byte A6597Lb_TaAuxf2 ;
   private byte A6598Lb_TaAuxf3 ;
   private byte AV17ComboLb_TaAuxf1 ;
   private byte AV19ComboLb_TaAuxf2 ;
   private byte AV21ComboLb_TaAuxf3 ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private short Z6312lb_TaAuxUL ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A6312lb_TaAuxUL ;
   private short RcdFound918 ;
   private short nIsDirty_918 ;
   private int trnEnded ;
   private int edtLb_TaAuxC_Enabled ;
   private int edtLb_TaAuxD_Enabled ;
   private int edtLb_TaAuxf1_Enabled ;
   private int edtLb_TaAuxf1_Visible ;
   private int edtLb_TaAuxf2_Enabled ;
   private int edtLb_TaAuxf2_Visible ;
   private int edtLb_TaAuxf3_Enabled ;
   private int edtLb_TaAuxf3_Visible ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int edtavPgmname_Enabled ;
   private int edtavCombolb_taauxf1_Enabled ;
   private int edtavCombolb_taauxf1_Visible ;
   private int edtavCombolb_taauxf2_Enabled ;
   private int edtavCombolb_taauxf2_Visible ;
   private int edtavCombolb_taauxf3_Enabled ;
   private int edtavCombolb_taauxf3_Visible ;
   private int Combo_lb_taauxf1_Datalistupdateminimumcharacters ;
   private int Combo_lb_taauxf2_Datalistupdateminimumcharacters ;
   private int Combo_lb_taauxf3_Datalistupdateminimumcharacters ;
   private int GX_JID ;
   private int idxLst ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV10EmprCod ;
   private String wcpOAV11Lb_TaAuxC ;
   private String Z396EmprCod ;
   private String Z6310Lb_TaAuxC ;
   private String Z6311Lb_TaAuxD ;
   private String Combo_lb_taauxf3_Selectedvalue_get ;
   private String Combo_lb_taauxf2_Selectedvalue_get ;
   private String Combo_lb_taauxf1_Selectedvalue_get ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String Gx_mode ;
   private String AV10EmprCod ;
   private String AV11Lb_TaAuxC ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtLb_TaAuxC_Internalname ;
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
   private String A6310Lb_TaAuxC ;
   private String edtLb_TaAuxC_Jsonclick ;
   private String edtLb_TaAuxD_Internalname ;
   private String A6311Lb_TaAuxD ;
   private String edtLb_TaAuxD_Jsonclick ;
   private String grpUnnamedgroup3_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String divTablesplittedlb_taauxf1_Internalname ;
   private String lblTextblocklb_taauxf1_Internalname ;
   private String lblTextblocklb_taauxf1_Jsonclick ;
   private String Combo_lb_taauxf1_Caption ;
   private String Combo_lb_taauxf1_Cls ;
   private String Combo_lb_taauxf1_Internalname ;
   private String edtLb_TaAuxf1_Internalname ;
   private String edtLb_TaAuxf1_Jsonclick ;
   private String divTablesplittedlb_taauxf2_Internalname ;
   private String lblTextblocklb_taauxf2_Internalname ;
   private String lblTextblocklb_taauxf2_Jsonclick ;
   private String Combo_lb_taauxf2_Caption ;
   private String Combo_lb_taauxf2_Cls ;
   private String Combo_lb_taauxf2_Internalname ;
   private String edtLb_TaAuxf2_Internalname ;
   private String edtLb_TaAuxf2_Jsonclick ;
   private String divTablesplittedlb_taauxf3_Internalname ;
   private String lblTextblocklb_taauxf3_Internalname ;
   private String lblTextblocklb_taauxf3_Jsonclick ;
   private String Combo_lb_taauxf3_Caption ;
   private String Combo_lb_taauxf3_Cls ;
   private String Combo_lb_taauxf3_Internalname ;
   private String edtLb_TaAuxf3_Internalname ;
   private String edtLb_TaAuxf3_Jsonclick ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String edtavPgmname_Internalname ;
   private String AV22Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String divSectionattribute_lb_taauxf1_Internalname ;
   private String edtavCombolb_taauxf1_Internalname ;
   private String edtavCombolb_taauxf1_Jsonclick ;
   private String divSectionattribute_lb_taauxf2_Internalname ;
   private String edtavCombolb_taauxf2_Internalname ;
   private String edtavCombolb_taauxf2_Jsonclick ;
   private String divSectionattribute_lb_taauxf3_Internalname ;
   private String edtavCombolb_taauxf3_Internalname ;
   private String edtavCombolb_taauxf3_Jsonclick ;
   private String A396EmprCod ;
   private String A407EmprNom ;
   private String Combo_lb_taauxf1_Objectcall ;
   private String Combo_lb_taauxf1_Class ;
   private String Combo_lb_taauxf1_Icontype ;
   private String Combo_lb_taauxf1_Icon ;
   private String Combo_lb_taauxf1_Tooltip ;
   private String Combo_lb_taauxf1_Selectedvalue_set ;
   private String Combo_lb_taauxf1_Selectedtext_set ;
   private String Combo_lb_taauxf1_Selectedtext_get ;
   private String Combo_lb_taauxf1_Gamoauthtoken ;
   private String Combo_lb_taauxf1_Ddointernalname ;
   private String Combo_lb_taauxf1_Titlecontrolalign ;
   private String Combo_lb_taauxf1_Dropdownoptionstype ;
   private String Combo_lb_taauxf1_Titlecontrolidtoreplace ;
   private String Combo_lb_taauxf1_Datalisttype ;
   private String Combo_lb_taauxf1_Datalistfixedvalues ;
   private String Combo_lb_taauxf1_Datalistproc ;
   private String Combo_lb_taauxf1_Datalistprocparametersprefix ;
   private String Combo_lb_taauxf1_Remoteservicesparameters ;
   private String Combo_lb_taauxf1_Htmltemplate ;
   private String Combo_lb_taauxf1_Multiplevaluestype ;
   private String Combo_lb_taauxf1_Loadingdata ;
   private String Combo_lb_taauxf1_Noresultsfound ;
   private String Combo_lb_taauxf1_Emptyitemtext ;
   private String Combo_lb_taauxf1_Onlyselectedvalues ;
   private String Combo_lb_taauxf1_Selectalltext ;
   private String Combo_lb_taauxf1_Multiplevaluesseparator ;
   private String Combo_lb_taauxf1_Addnewoptiontext ;
   private String Combo_lb_taauxf2_Objectcall ;
   private String Combo_lb_taauxf2_Class ;
   private String Combo_lb_taauxf2_Icontype ;
   private String Combo_lb_taauxf2_Icon ;
   private String Combo_lb_taauxf2_Tooltip ;
   private String Combo_lb_taauxf2_Selectedvalue_set ;
   private String Combo_lb_taauxf2_Selectedtext_set ;
   private String Combo_lb_taauxf2_Selectedtext_get ;
   private String Combo_lb_taauxf2_Gamoauthtoken ;
   private String Combo_lb_taauxf2_Ddointernalname ;
   private String Combo_lb_taauxf2_Titlecontrolalign ;
   private String Combo_lb_taauxf2_Dropdownoptionstype ;
   private String Combo_lb_taauxf2_Titlecontrolidtoreplace ;
   private String Combo_lb_taauxf2_Datalisttype ;
   private String Combo_lb_taauxf2_Datalistfixedvalues ;
   private String Combo_lb_taauxf2_Datalistproc ;
   private String Combo_lb_taauxf2_Datalistprocparametersprefix ;
   private String Combo_lb_taauxf2_Remoteservicesparameters ;
   private String Combo_lb_taauxf2_Htmltemplate ;
   private String Combo_lb_taauxf2_Multiplevaluestype ;
   private String Combo_lb_taauxf2_Loadingdata ;
   private String Combo_lb_taauxf2_Noresultsfound ;
   private String Combo_lb_taauxf2_Emptyitemtext ;
   private String Combo_lb_taauxf2_Onlyselectedvalues ;
   private String Combo_lb_taauxf2_Selectalltext ;
   private String Combo_lb_taauxf2_Multiplevaluesseparator ;
   private String Combo_lb_taauxf2_Addnewoptiontext ;
   private String Combo_lb_taauxf3_Objectcall ;
   private String Combo_lb_taauxf3_Class ;
   private String Combo_lb_taauxf3_Icontype ;
   private String Combo_lb_taauxf3_Icon ;
   private String Combo_lb_taauxf3_Tooltip ;
   private String Combo_lb_taauxf3_Selectedvalue_set ;
   private String Combo_lb_taauxf3_Selectedtext_set ;
   private String Combo_lb_taauxf3_Selectedtext_get ;
   private String Combo_lb_taauxf3_Gamoauthtoken ;
   private String Combo_lb_taauxf3_Ddointernalname ;
   private String Combo_lb_taauxf3_Titlecontrolalign ;
   private String Combo_lb_taauxf3_Dropdownoptionstype ;
   private String Combo_lb_taauxf3_Titlecontrolidtoreplace ;
   private String Combo_lb_taauxf3_Datalisttype ;
   private String Combo_lb_taauxf3_Datalistfixedvalues ;
   private String Combo_lb_taauxf3_Datalistproc ;
   private String Combo_lb_taauxf3_Datalistprocparametersprefix ;
   private String Combo_lb_taauxf3_Remoteservicesparameters ;
   private String Combo_lb_taauxf3_Htmltemplate ;
   private String Combo_lb_taauxf3_Multiplevaluestype ;
   private String Combo_lb_taauxf3_Loadingdata ;
   private String Combo_lb_taauxf3_Noresultsfound ;
   private String Combo_lb_taauxf3_Emptyitemtext ;
   private String Combo_lb_taauxf3_Onlyselectedvalues ;
   private String Combo_lb_taauxf3_Selectalltext ;
   private String Combo_lb_taauxf3_Multiplevaluesseparator ;
   private String Combo_lb_taauxf3_Addnewoptiontext ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String hsh ;
   private String sMode918 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String AV7Station ;
   private String AV8EmprNom ;
   private String AV9UsurCod ;
   private String GXt_char1 ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char4[] ;
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
   private boolean Combo_lb_taauxf1_Emptyitem ;
   private boolean Combo_lb_taauxf2_Emptyitem ;
   private boolean Combo_lb_taauxf3_Emptyitem ;
   private boolean n407EmprNom ;
   private boolean Combo_lb_taauxf1_Enabled ;
   private boolean Combo_lb_taauxf1_Visible ;
   private boolean Combo_lb_taauxf1_Allowmultipleselection ;
   private boolean Combo_lb_taauxf1_Isgriditem ;
   private boolean Combo_lb_taauxf1_Hasdescription ;
   private boolean Combo_lb_taauxf1_Includeonlyselectedoption ;
   private boolean Combo_lb_taauxf1_Includeselectalloption ;
   private boolean Combo_lb_taauxf1_Includeaddnewoption ;
   private boolean Combo_lb_taauxf2_Enabled ;
   private boolean Combo_lb_taauxf2_Visible ;
   private boolean Combo_lb_taauxf2_Allowmultipleselection ;
   private boolean Combo_lb_taauxf2_Isgriditem ;
   private boolean Combo_lb_taauxf2_Hasdescription ;
   private boolean Combo_lb_taauxf2_Includeonlyselectedoption ;
   private boolean Combo_lb_taauxf2_Includeselectalloption ;
   private boolean Combo_lb_taauxf2_Includeaddnewoption ;
   private boolean Combo_lb_taauxf3_Enabled ;
   private boolean Combo_lb_taauxf3_Visible ;
   private boolean Combo_lb_taauxf3_Allowmultipleselection ;
   private boolean Combo_lb_taauxf3_Isgriditem ;
   private boolean Combo_lb_taauxf3_Hasdescription ;
   private boolean Combo_lb_taauxf3_Includeonlyselectedoption ;
   private boolean Combo_lb_taauxf3_Includeselectalloption ;
   private boolean Combo_lb_taauxf3_Includeaddnewoption ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean n6310Lb_TaAuxC ;
   private boolean returnInSub ;
   private String A13756Lb_TaAuxCD ;
   private String AV16ComboSelectedValue ;
   private com.genexus.webpanels.WebSession AV14WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.webpanels.GXUserControl ucCombo_lb_taauxf1 ;
   private com.genexus.webpanels.GXUserControl ucCombo_lb_taauxf2 ;
   private com.genexus.webpanels.GXUserControl ucCombo_lb_taauxf3 ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private String[] T01SO4_A407EmprNom ;
   private boolean[] T01SO4_n407EmprNom ;
   private String[] T01SO5_A6310Lb_TaAuxC ;
   private boolean[] T01SO5_n6310Lb_TaAuxC ;
   private byte[] T01SO5_A6596Lb_TaAuxf1 ;
   private byte[] T01SO5_A6597Lb_TaAuxf2 ;
   private byte[] T01SO5_A6598Lb_TaAuxf3 ;
   private String[] T01SO5_A407EmprNom ;
   private boolean[] T01SO5_n407EmprNom ;
   private String[] T01SO5_A6311Lb_TaAuxD ;
   private short[] T01SO5_A6312lb_TaAuxUL ;
   private String[] T01SO5_A396EmprCod ;
   private String[] T01SO6_A396EmprCod ;
   private String[] T01SO6_A6310Lb_TaAuxC ;
   private boolean[] T01SO6_n6310Lb_TaAuxC ;
   private String[] T01SO3_A6310Lb_TaAuxC ;
   private boolean[] T01SO3_n6310Lb_TaAuxC ;
   private byte[] T01SO3_A6596Lb_TaAuxf1 ;
   private byte[] T01SO3_A6597Lb_TaAuxf2 ;
   private byte[] T01SO3_A6598Lb_TaAuxf3 ;
   private String[] T01SO3_A6311Lb_TaAuxD ;
   private short[] T01SO3_A6312lb_TaAuxUL ;
   private String[] T01SO3_A396EmprCod ;
   private String[] T01SO7_A396EmprCod ;
   private String[] T01SO7_A6310Lb_TaAuxC ;
   private boolean[] T01SO7_n6310Lb_TaAuxC ;
   private String[] T01SO8_A396EmprCod ;
   private String[] T01SO8_A6310Lb_TaAuxC ;
   private boolean[] T01SO8_n6310Lb_TaAuxC ;
   private String[] T01SO2_A6310Lb_TaAuxC ;
   private boolean[] T01SO2_n6310Lb_TaAuxC ;
   private byte[] T01SO2_A6596Lb_TaAuxf1 ;
   private byte[] T01SO2_A6597Lb_TaAuxf2 ;
   private byte[] T01SO2_A6598Lb_TaAuxf3 ;
   private String[] T01SO2_A6311Lb_TaAuxD ;
   private short[] T01SO2_A6312lb_TaAuxUL ;
   private String[] T01SO2_A396EmprCod ;
   private String[] T01SO12_A396EmprCod ;
   private String[] T01SO12_A6310Lb_TaAuxC ;
   private boolean[] T01SO12_n6310Lb_TaAuxC ;
   private short[] T01SO12_A6313lb_TaAuxL ;
   private String[] T01SO13_A396EmprCod ;
   private int[] T01SO13_A5532Lb_numero ;
   private String[] T01SO13_A5555Lb_opcion ;
   private String[] T01SO14_A396EmprCod ;
   private int[] T01SO14_A486ForNumCol ;
   private String[] T01SO15_A396EmprCod ;
   private String[] T01SO15_A6310Lb_TaAuxC ;
   private boolean[] T01SO15_n6310Lb_TaAuxC ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV15Lb_TaAuxf1_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV18Lb_TaAuxf2_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV20Lb_TaAuxf3_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXt_objcol_SdtDVB_SDTComboData_Item6 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXv_objcol_SdtDVB_SDTComboData_Item7[] ;
   private app.wwpbaseobjects.SdtWWPContext AV12WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext5[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV13TrnContext ;
}

final  class tablaalcalisysulfatos_1__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tablaalcalisysulfatos_1__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tablaalcalisysulfatos_1__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tablaalcalisysulfatos_1__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tablaalcalisysulfatos_1__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01SO2", "SELECT Lb_TaAuxC, Lb_TaAuxf1, Lb_TaAuxf2, Lb_TaAuxf3, Lb_TaAuxD, lb_TaAuxUL, EmprCod FROM TXPENS005 WHERE EmprCod = ? AND Lb_TaAuxC = ?  FOR UPDATE OF Lb_TaAuxf1, Lb_TaAuxf2, Lb_TaAuxf3, Lb_TaAuxD, lb_TaAuxUL NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SO3", "SELECT Lb_TaAuxC, Lb_TaAuxf1, Lb_TaAuxf2, Lb_TaAuxf3, Lb_TaAuxD, lb_TaAuxUL, EmprCod FROM TXPENS005 WHERE EmprCod = ? AND Lb_TaAuxC = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SO4", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SO5", "SELECT /*+ FIRST_ROWS(100) */ TM1.Lb_TaAuxC, TM1.Lb_TaAuxf1, TM1.Lb_TaAuxf2, TM1.Lb_TaAuxf3, T2.EmprNom, TM1.Lb_TaAuxD, TM1.lb_TaAuxUL, TM1.EmprCod FROM (TXPENS005 TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.Lb_TaAuxC = ? ORDER BY TM1.EmprCod, TM1.Lb_TaAuxC ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SO6", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, Lb_TaAuxC FROM TXPENS005 WHERE EmprCod = ? AND Lb_TaAuxC = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SO7", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, Lb_TaAuxC FROM TXPENS005 WHERE ( Lb_TaAuxC > ?) and EmprCod = ? ORDER BY EmprCod, Lb_TaAuxC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01SO8", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, Lb_TaAuxC FROM TXPENS005 WHERE ( Lb_TaAuxC < ?) and EmprCod = ? ORDER BY EmprCod DESC, Lb_TaAuxC DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01SO9", "INSERT INTO TXPENS005(Lb_TaAuxC, Lb_TaAuxf1, Lb_TaAuxf2, Lb_TaAuxf3, Lb_TaAuxD, lb_TaAuxUL, EmprCod) VALUES(?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPENS005")
         ,new UpdateCursor("T01SO10", "UPDATE TXPENS005 SET Lb_TaAuxf1=?, Lb_TaAuxf2=?, Lb_TaAuxf3=?, Lb_TaAuxD=?, lb_TaAuxUL=?  WHERE EmprCod = ? AND Lb_TaAuxC = ?", GX_NOMASK, "TXPENS005")
         ,new UpdateCursor("T01SO11", "DELETE FROM TXPENS005  WHERE EmprCod = ? AND Lb_TaAuxC = ?", GX_NOMASK, "TXPENS005")
         ,new ForEachCursor("T01SO12", "SELECT * FROM (SELECT EmprCod, Lb_TaAuxC, lb_TaAuxL FROM TXPENS008 WHERE EmprCod = ? AND Lb_TaAuxC = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01SO13", "SELECT * FROM (SELECT EmprCod, Lb_numero, Lb_opcion FROM TXPENS002 WHERE EmprCod = ? AND Lb_TaAuxC = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01SO14", "SELECT * FROM (SELECT EmprCod, ForNumCol FROM TXPCDFORM WHERE EmprCod = ? AND Lb_TaAuxC = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01SO15", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, Lb_TaAuxC FROM TXPENS005 WHERE EmprCod = ? ORDER BY EmprCod, Lb_TaAuxC ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 4);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 60);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 4);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 60);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 4);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 60);
               ((short[]) buf[7])[0] = rslt.getShort(7);
               ((String[]) buf[8])[0] = rslt.getString(8, 3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 4);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 4);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 4);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 4);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 4);
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
                  stmt.setString(2, (String)parms[2], 4);
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
                  stmt.setString(2, (String)parms[2], 4);
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
                  stmt.setString(2, (String)parms[2], 4);
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
                  stmt.setString(2, (String)parms[2], 4);
               }
               return;
            case 5 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 4);
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
                  stmt.setString(1, (String)parms[1], 4);
               }
               stmt.setString(2, (String)parms[2], 3);
               return;
            case 7 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 4);
               }
               stmt.setByte(2, ((Number) parms[2]).byteValue());
               stmt.setByte(3, ((Number) parms[3]).byteValue());
               stmt.setByte(4, ((Number) parms[4]).byteValue());
               stmt.setString(5, (String)parms[5], 60);
               stmt.setShort(6, ((Number) parms[6]).shortValue());
               stmt.setString(7, (String)parms[7], 3);
               return;
            case 8 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 60);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setString(6, (String)parms[5], 3);
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[7], 4);
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
                  stmt.setString(2, (String)parms[2], 4);
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
                  stmt.setString(2, (String)parms[2], 4);
               }
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 4);
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
                  stmt.setString(2, (String)parms[2], 4);
               }
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

