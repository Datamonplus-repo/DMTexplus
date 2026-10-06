package app.lectoroptico ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class lector___impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel1"+"_"+"LECPARNOM") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A1172LecParCod = (short)(GXutil.lval( httpContext.GetPar( "LecParCod"))) ;
         n1172LecParCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1172LecParCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1172LecParCod), 4, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx1asalecparnom1TV156( A396EmprCod, A1172LecParCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel2"+"_"+"LECFASDSC") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A1171LecFasCod = httpContext.GetPar( "LecFasCod") ;
         n1171LecFasCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1171LecFasCod", A1171LecFasCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx2asalecfasdsc1TV156( A396EmprCod, A1171LecFasCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel3"+"_"+"LECOPENOM") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A1170LecOpeCod = (int)(GXutil.lval( httpContext.GetPar( "LecOpeCod"))) ;
         n1170LecOpeCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1170LecOpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1170LecOpeCod), 6, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx3asalecopenom1TV156( A396EmprCod, A1170LecOpeCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel4"+"_"+"LECESTADO") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A1167LecBarCod = (int)(GXutil.lval( httpContext.GetPar( "LecBarCod"))) ;
         n1167LecBarCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1167LecBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1167LecBarCod), 8, 0));
         A1168LecBarReo = (byte)(GXutil.lval( httpContext.GetPar( "LecBarReo"))) ;
         n1168LecBarReo = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1168LecBarReo", GXutil.str( A1168LecBarReo, 1, 0));
         A1169LecBarPar = httpContext.GetPar( "LecBarPar") ;
         n1169LecBarPar = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1169LecBarPar", A1169LecBarPar);
         A1188LecFasOrd = (short)(GXutil.lval( httpContext.GetPar( "LecFasOrd"))) ;
         n1188LecFasOrd = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1188LecFasOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1188LecFasOrd), 4, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx4asalecestado1TV156( A396EmprCod, A1167LecBarCod, A1168LecBarReo, A1169LecBarPar, A1188LecFasOrd) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel9"+"_"+"") == 0 )
      {
         AV7EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxasa43451TV156( AV7EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel10"+"_"+"") == 0 )
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
            AV7EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
            AV8LecMaqCod = httpContext.GetPar( "LecMaqCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8LecMaqCod", AV8LecMaqCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vLECMAQCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV8LecMaqCod, ""))));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Mantenimiento Tabla LECTOR", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtLecMaqCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public lector___impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public lector___impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( lector___impl.class ));
   }

   public lector___impl( int remoteHandle ,
                         ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbLecTipEnt = new HTMLChoice();
      chkLecCnc = UIFactory.getCheckbox(this);
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
      if ( cmbLecTipEnt.getItemCount() > 0 )
      {
         A1796LecTipEnt = cmbLecTipEnt.getValidValue(A1796LecTipEnt) ;
         n1796LecTipEnt = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1796LecTipEnt", A1796LecTipEnt);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbLecTipEnt.setValue( GXutil.rtrim( A1796LecTipEnt) );
         httpContext.ajax_rsp_assign_prop("", false, cmbLecTipEnt.getInternalname(), "Values", cmbLecTipEnt.ToJavascriptSource(), true);
      }
      A6832LecCnc = (byte)(((GXutil.strcmp(GXutil.ltrim( localUtil.ntoc( A6832LecCnc, (byte)(1), (byte)(0), ".", "")), "1")==0) ? 1 : 0)) ;
      n6832LecCnc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6832LecCnc", GXutil.str( A6832LecCnc, 1, 0));
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-9 DataContentCell DscTop ExtendedComboCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTablesplittedlecmaqcod_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblocklecmaqcod_Internalname, httpContext.getMessage( "Maquina", ""), "", "", lblTextblocklecmaqcod_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_LectorOptico\\Lector__.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* User Defined Control */
      ucCombo_lecmaqcod.setProperty("Caption", Combo_lecmaqcod_Caption);
      ucCombo_lecmaqcod.setProperty("Cls", Combo_lecmaqcod_Cls);
      ucCombo_lecmaqcod.setProperty("EmptyItem", Combo_lecmaqcod_Emptyitem);
      ucCombo_lecmaqcod.setProperty("DropDownOptionsData", AV22LecMaqCod_Data);
      ucCombo_lecmaqcod.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_lecmaqcod_Internalname, "COMBO_LECMAQCODContainer");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 Invisible", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtLecMaqCod_Internalname, httpContext.getMessage( "Maquina", ""), "col-sm-3 AttributeLabel", 0, true, "");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLecMaqCod_Internalname, GXutil.rtrim( A1166LecMaqCod), GXutil.rtrim( localUtil.format( A1166LecMaqCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,31);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLecMaqCod_Jsonclick, 0, "Attribute", "", "", "", "", edtLecMaqCod_Visible, edtLecMaqCod_Enabled, 1, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_LectorOptico\\Lector__.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbLecTipEnt.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, cmbLecTipEnt.getInternalname(), httpContext.getMessage( "Tipo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 35,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbLecTipEnt, cmbLecTipEnt.getInternalname(), GXutil.rtrim( A1796LecTipEnt), 1, cmbLecTipEnt.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbLecTipEnt.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,35);\"", "", true, (byte)(0), "HLP_LectorOptico\\Lector__.htm");
      cmbLecTipEnt.setValue( GXutil.rtrim( A1796LecTipEnt) );
      httpContext.ajax_rsp_assign_prop("", false, cmbLecTipEnt.getInternalname(), "Values", cmbLecTipEnt.ToJavascriptSource(), true);
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtLecBarCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtLecBarCod_Internalname, httpContext.getMessage( "Hdr", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 43,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLecBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A1167LecBarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtLecBarCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1167LecBarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1167LecBarCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,43);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLecBarCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtLecBarCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LectorOptico\\Lector__.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtLecBarReo_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtLecBarReo_Internalname, httpContext.getMessage( "R", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 47,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLecBarReo_Internalname, GXutil.ltrim( localUtil.ntoc( A1168LecBarReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtLecBarReo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1168LecBarReo), "9") : localUtil.format( DecimalUtil.doubleToDec(A1168LecBarReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,47);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLecBarReo_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtLecBarReo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LectorOptico\\Lector__.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtLecBarPar_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtLecBarPar_Internalname, httpContext.getMessage( "P", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLecBarPar_Internalname, GXutil.rtrim( A1169LecBarPar), GXutil.rtrim( localUtil.format( A1169LecBarPar, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLecBarPar_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtLecBarPar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_LectorOptico\\Lector__.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 CellMarginTop30", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", imgavPrompthdr_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+imgavPrompthdr_Internalname+"\"", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Active Bitmap Variable */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 55,'',false,'',0)\"" ;
      ClassString = "ImagePrompt" + " " + ((GXutil.strcmp(imgavPrompthdr_gximage, "")==0) ? "" : "GX_Image_"+imgavPrompthdr_gximage+"_Class") ;
      StyleString = "" ;
      AV25PromptHDR_IsBlob = (boolean)(((GXutil.strcmp("", AV25PromptHDR)==0)&&(GXutil.strcmp("", AV29Prompthdr_GXI)==0))||!(GXutil.strcmp("", AV25PromptHDR)==0)) ;
      sImgUrl = ((GXutil.strcmp("", AV25PromptHDR)==0) ? AV29Prompthdr_GXI : httpContext.getResourceRelative(AV25PromptHDR)) ;
      app.GxWebStd.gx_bitmap( httpContext, imgavPrompthdr_Internalname, sImgUrl, "", "", "", context.getHttpContext().getTheme( ), imgavPrompthdr_Visible, imgavPrompthdr_Enabled, "", "", 0, -1, 0, "", 0, "", 0, 0, 7, imgavPrompthdr_Jsonclick, "'"+""+"'"+",false,"+"'"+"e111tv156_client"+"'", StyleString, ClassString, "", "", "", "", ""+TempTags, "", "", 1, AV25PromptHDR_IsBlob, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_LectorOptico\\Lector__.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtLecFasOrd_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtLecFasOrd_Internalname, httpContext.getMessage( "Orden", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 63,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLecFasOrd_Internalname, GXutil.ltrim( localUtil.ntoc( A1188LecFasOrd, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtLecFasOrd_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1188LecFasOrd), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1188LecFasOrd), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,63);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLecFasOrd_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtLecFasOrd_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LectorOptico\\Lector__.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 CellMarginTop30", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", imgavPromptorden_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+imgavPromptorden_Internalname+"\"", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Active Bitmap Variable */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 67,'',false,'',0)\"" ;
      ClassString = "ImagePrompt" + " " + ((GXutil.strcmp(imgavPromptorden_gximage, "")==0) ? "" : "GX_Image_"+imgavPromptorden_gximage+"_Class") ;
      StyleString = "" ;
      AV24PromptOrden_IsBlob = (boolean)(((GXutil.strcmp("", AV24PromptOrden)==0)&&(GXutil.strcmp("", AV28Promptorden_GXI)==0))||!(GXutil.strcmp("", AV24PromptOrden)==0)) ;
      sImgUrl = ((GXutil.strcmp("", AV24PromptOrden)==0) ? AV28Promptorden_GXI : httpContext.getResourceRelative(AV24PromptOrden)) ;
      app.GxWebStd.gx_bitmap( httpContext, imgavPromptorden_Internalname, sImgUrl, "", "", "", context.getHttpContext().getTheme( ), imgavPromptorden_Visible, imgavPromptorden_Enabled, "", "", 0, -1, 0, "", 0, "", 0, 0, 7, imgavPromptorden_Jsonclick, "'"+""+"'"+",false,"+"'"+"e121tv156_client"+"'", StyleString, ClassString, "", "", "", "", ""+TempTags, "", "", 1, AV24PromptOrden_IsBlob, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_LectorOptico\\Lector__.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell DscTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtLecFasCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtLecFasCod_Internalname, httpContext.getMessage( "Fase", ""), " AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLecFasCod_Internalname, GXutil.rtrim( A1171LecFasCod), GXutil.rtrim( localUtil.format( A1171LecFasCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,71);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLecFasCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtLecFasCod_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_LectorOptico\\Lector__.htm");
      /* Static images/pictures */
      ClassString = "gx-prompt Image" + " " + ((GXutil.strcmp(imgprompt_1171_gximage, "")==0) ? "" : "GX_Image_"+imgprompt_1171_gximage+"_Class") ;
      StyleString = "" ;
      sImgUrl = context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )) ;
      app.GxWebStd.gx_bitmap( httpContext, imgprompt_1171_Internalname, sImgUrl, imgprompt_1171_Link, "", "", context.getHttpContext().getTheme( ), imgprompt_1171_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "", "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_LectorOptico\\Lector__.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtLecFasDsc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtLecFasDsc_Internalname, httpContext.getMessage( "Descripcion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtLecFasDsc_Internalname, GXutil.rtrim( A14260LecFasDsc), GXutil.rtrim( localUtil.format( A14260LecFasDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLecFasDsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtLecFasDsc_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_LectorOptico\\Lector__.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable4_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell DscTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtLecNumLot_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtLecNumLot_Internalname, httpContext.getMessage( "Nº Lote", ""), " AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 83,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLecNumLot_Internalname, GXutil.ltrim( localUtil.ntoc( A4702LecNumLot, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtLecNumLot_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4702LecNumLot), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4702LecNumLot), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,83);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLecNumLot_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtLecNumLot_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LectorOptico\\Lector__.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell DscTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtLecRecLinM_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtLecRecLinM_Internalname, httpContext.getMessage( "Nº Receta (#)", ""), " AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 87,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLecRecLinM_Internalname, GXutil.ltrim( localUtil.ntoc( A4703LecRecLinM, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtLecRecLinM_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4703LecRecLinM), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4703LecRecLinM), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,87);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLecRecLinM_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtLecRecLinM_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LectorOptico\\Lector__.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable5_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell DscTop ExtendedComboCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTablesplittedlecopecod_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblocklecopecod_Internalname, httpContext.getMessage( "Operario", ""), "", "", lblTextblocklecopecod_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_LectorOptico\\Lector__.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* User Defined Control */
      ucCombo_lecopecod.setProperty("Caption", Combo_lecopecod_Caption);
      ucCombo_lecopecod.setProperty("Cls", Combo_lecopecod_Cls);
      ucCombo_lecopecod.setProperty("EmptyItem", Combo_lecopecod_Emptyitem);
      ucCombo_lecopecod.setProperty("DropDownOptionsData", AV15LecOpeCod_Data);
      ucCombo_lecopecod.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_lecopecod_Internalname, "COMBO_LECOPECODContainer");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 Invisible", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtLecOpeCod_Internalname, httpContext.getMessage( "Operario", ""), "col-sm-3 AttributeLabel", 0, true, "");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 101,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLecOpeCod_Internalname, GXutil.ltrim( localUtil.ntoc( A1170LecOpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtLecOpeCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1170LecOpeCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1170LecOpeCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,101);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLecOpeCod_Jsonclick, 0, "Attribute", "", "", "", "", edtLecOpeCod_Visible, edtLecOpeCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LectorOptico\\Lector__.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell DscTop ExtendedComboCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTablesplittedlecparcod_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblocklecparcod_Internalname, httpContext.getMessage( "Paro", ""), "", "", lblTextblocklecparcod_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_LectorOptico\\Lector__.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* User Defined Control */
      ucCombo_lecparcod.setProperty("Caption", Combo_lecparcod_Caption);
      ucCombo_lecparcod.setProperty("Cls", Combo_lecparcod_Cls);
      ucCombo_lecparcod.setProperty("EmptyItemText", Combo_lecparcod_Emptyitemtext);
      ucCombo_lecparcod.setProperty("DropDownOptionsData", AV18LecParCod_Data);
      ucCombo_lecparcod.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_lecparcod_Internalname, "COMBO_LECPARCODContainer");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 Invisible", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtLecParCod_Internalname, httpContext.getMessage( "Paro", ""), "col-sm-3 AttributeLabel", 0, true, "");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 111,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLecParCod_Internalname, GXutil.ltrim( localUtil.ntoc( A1172LecParCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtLecParCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1172LecParCod), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1172LecParCod), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,111);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLecParCod_Jsonclick, 0, "Attribute", "", "", "", "", edtLecParCod_Visible, edtLecParCod_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LectorOptico\\Lector__.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable6_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtLecFec_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtLecFec_Internalname, httpContext.getMessage( "Fecha", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 119,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtLecFec_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLecFec_Internalname, localUtil.format(A1174LecFec, "99/99/99"), localUtil.format( A1174LecFec, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,119);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLecFec_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtLecFec_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LectorOptico\\Lector__.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtLecFec_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtLecFec_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_LectorOptico\\Lector__.htm");
      httpContext.writeTextNL( "</div>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtLecHor_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtLecHor_Internalname, httpContext.getMessage( "Hora", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 123,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLecHor_Internalname, GXutil.rtrim( A1173LecHor), GXutil.rtrim( localUtil.format( A1173LecHor, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,123);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLecHor_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtLecHor_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_LectorOptico\\Lector__.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable7_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divLeccombin_cell_Internalname, 1, 0, "px", 0, "px", divLeccombin_cell_Class, "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", edtLecCombin_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtLecCombin_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtLecCombin_Internalname, httpContext.getMessage( "Nº Comb", ""), " AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 131,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLecCombin_Internalname, GXutil.rtrim( A4345LecCombin), GXutil.rtrim( localUtil.format( A4345LecCombin, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,131);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLecCombin_Jsonclick, 0, "AttributeFL", "", "", "", "", edtLecCombin_Visible, edtLecCombin_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_LectorOptico\\Lector__.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell DscTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkLecCnc.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, chkLecCnc.getInternalname(), httpContext.getMessage( "Cancelada", ""), " AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Check box */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 135,'',false,'',0)\"" ;
      ClassString = "AttributeFL" ;
      StyleString = "" ;
      app.GxWebStd.gx_checkbox_ctrl( httpContext, chkLecCnc.getInternalname(), GXutil.str( A6832LecCnc, 1, 0), "", httpContext.getMessage( "Cancelada", ""), 1, chkLecCnc.getEnabled(), "1", "", StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(135, this, 1, 0,"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,135);\"");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 140,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_LectorOptico\\Lector__.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 142,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_LectorOptico\\Lector__.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 144,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_LectorOptico\\Lector__.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV27Pgmname), GXutil.rtrim( localUtil.format( AV27Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_LectorOptico\\Lector__.htm");
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
      app.GxWebStd.gx_div_start( httpContext, divSectionattribute_lecmaqcod_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavCombolecmaqcod_Internalname, GXutil.rtrim( AV23ComboLecMaqCod), GXutil.rtrim( localUtil.format( AV23ComboLecMaqCod, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCombolecmaqcod_Jsonclick, 0, "Attribute", "", "", "", "", edtavCombolecmaqcod_Visible, edtavCombolecmaqcod_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_LectorOptico\\Lector__.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divSectionattribute_lecopecod_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavCombolecopecod_Internalname, GXutil.ltrim( localUtil.ntoc( AV17ComboLecOpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavCombolecopecod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV17ComboLecOpeCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV17ComboLecOpeCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCombolecopecod_Jsonclick, 0, "Attribute", "", "", "", "", edtavCombolecopecod_Visible, edtavCombolecopecod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LectorOptico\\Lector__.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divSectionattribute_lecparcod_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavCombolecparcod_Internalname, GXutil.ltrim( localUtil.ntoc( AV19ComboLecParCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavCombolecparcod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV19ComboLecParCod), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV19ComboLecParCod), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCombolecparcod_Jsonclick, 0, "Attribute", "", "", "", "", edtavCombolecparcod_Visible, edtavCombolecparcod_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LectorOptico\\Lector__.htm");
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
      e131TV2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vLECMAQCOD_DATA"), AV22LecMaqCod_Data);
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vLECOPECOD_DATA"), AV15LecOpeCod_Data);
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vLECPARCOD_DATA"), AV18LecParCod_Data);
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z1166LecMaqCod = httpContext.cgiGet( "Z1166LecMaqCod") ;
            Z1170LecOpeCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z1170LecOpeCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z1172LecParCod = (short)(localUtil.ctol( httpContext.cgiGet( "Z1172LecParCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z1167LecBarCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z1167LecBarCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z1168LecBarReo = (byte)(localUtil.ctol( httpContext.cgiGet( "Z1168LecBarReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z1169LecBarPar = httpContext.cgiGet( "Z1169LecBarPar") ;
            Z1171LecFasCod = httpContext.cgiGet( "Z1171LecFasCod") ;
            Z1188LecFasOrd = (short)(localUtil.ctol( httpContext.cgiGet( "Z1188LecFasOrd"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z1173LecHor = httpContext.cgiGet( "Z1173LecHor") ;
            Z1174LecFec = localUtil.ctod( httpContext.cgiGet( "Z1174LecFec"), 0) ;
            Z1796LecTipEnt = httpContext.cgiGet( "Z1796LecTipEnt") ;
            Z4702LecNumLot = (int)(localUtil.ctol( httpContext.cgiGet( "Z4702LecNumLot"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z4703LecRecLinM = (short)(localUtil.ctol( httpContext.cgiGet( "Z4703LecRecLinM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z4345LecCombin = httpContext.cgiGet( "Z4345LecCombin") ;
            Z6832LecCnc = (byte)(localUtil.ctol( httpContext.cgiGet( "Z6832LecCnc"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            A396EmprCod = httpContext.cgiGet( "EMPRCOD") ;
            A14261LecParNom = httpContext.cgiGet( "LECPARNOM") ;
            A14259lecOpeNom = httpContext.cgiGet( "LECOPENOM") ;
            A13722LecEstado = httpContext.cgiGet( "LECESTADO") ;
            A13721LecHdr = httpContext.cgiGet( "LECHDR") ;
            AV7EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            AV8LecMaqCod = httpContext.cgiGet( "vLECMAQCOD") ;
            A407EmprNom = httpContext.cgiGet( "EMPRNOM") ;
            n407EmprNom = false ;
            Combo_lecmaqcod_Objectcall = httpContext.cgiGet( "COMBO_LECMAQCOD_Objectcall") ;
            Combo_lecmaqcod_Class = httpContext.cgiGet( "COMBO_LECMAQCOD_Class") ;
            Combo_lecmaqcod_Icontype = httpContext.cgiGet( "COMBO_LECMAQCOD_Icontype") ;
            Combo_lecmaqcod_Icon = httpContext.cgiGet( "COMBO_LECMAQCOD_Icon") ;
            Combo_lecmaqcod_Caption = httpContext.cgiGet( "COMBO_LECMAQCOD_Caption") ;
            Combo_lecmaqcod_Tooltip = httpContext.cgiGet( "COMBO_LECMAQCOD_Tooltip") ;
            Combo_lecmaqcod_Cls = httpContext.cgiGet( "COMBO_LECMAQCOD_Cls") ;
            Combo_lecmaqcod_Selectedvalue_set = httpContext.cgiGet( "COMBO_LECMAQCOD_Selectedvalue_set") ;
            Combo_lecmaqcod_Selectedvalue_get = httpContext.cgiGet( "COMBO_LECMAQCOD_Selectedvalue_get") ;
            Combo_lecmaqcod_Selectedtext_set = httpContext.cgiGet( "COMBO_LECMAQCOD_Selectedtext_set") ;
            Combo_lecmaqcod_Selectedtext_get = httpContext.cgiGet( "COMBO_LECMAQCOD_Selectedtext_get") ;
            Combo_lecmaqcod_Gamoauthtoken = httpContext.cgiGet( "COMBO_LECMAQCOD_Gamoauthtoken") ;
            Combo_lecmaqcod_Ddointernalname = httpContext.cgiGet( "COMBO_LECMAQCOD_Ddointernalname") ;
            Combo_lecmaqcod_Titlecontrolalign = httpContext.cgiGet( "COMBO_LECMAQCOD_Titlecontrolalign") ;
            Combo_lecmaqcod_Dropdownoptionstype = httpContext.cgiGet( "COMBO_LECMAQCOD_Dropdownoptionstype") ;
            Combo_lecmaqcod_Enabled = GXutil.strtobool( httpContext.cgiGet( "COMBO_LECMAQCOD_Enabled")) ;
            Combo_lecmaqcod_Visible = GXutil.strtobool( httpContext.cgiGet( "COMBO_LECMAQCOD_Visible")) ;
            Combo_lecmaqcod_Titlecontrolidtoreplace = httpContext.cgiGet( "COMBO_LECMAQCOD_Titlecontrolidtoreplace") ;
            Combo_lecmaqcod_Datalisttype = httpContext.cgiGet( "COMBO_LECMAQCOD_Datalisttype") ;
            Combo_lecmaqcod_Allowmultipleselection = GXutil.strtobool( httpContext.cgiGet( "COMBO_LECMAQCOD_Allowmultipleselection")) ;
            Combo_lecmaqcod_Datalistfixedvalues = httpContext.cgiGet( "COMBO_LECMAQCOD_Datalistfixedvalues") ;
            Combo_lecmaqcod_Isgriditem = GXutil.strtobool( httpContext.cgiGet( "COMBO_LECMAQCOD_Isgriditem")) ;
            Combo_lecmaqcod_Hasdescription = GXutil.strtobool( httpContext.cgiGet( "COMBO_LECMAQCOD_Hasdescription")) ;
            Combo_lecmaqcod_Datalistproc = httpContext.cgiGet( "COMBO_LECMAQCOD_Datalistproc") ;
            Combo_lecmaqcod_Datalistprocparametersprefix = httpContext.cgiGet( "COMBO_LECMAQCOD_Datalistprocparametersprefix") ;
            Combo_lecmaqcod_Remoteservicesparameters = httpContext.cgiGet( "COMBO_LECMAQCOD_Remoteservicesparameters") ;
            Combo_lecmaqcod_Datalistupdateminimumcharacters = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_LECMAQCOD_Datalistupdateminimumcharacters"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_lecmaqcod_Includeonlyselectedoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_LECMAQCOD_Includeonlyselectedoption")) ;
            Combo_lecmaqcod_Includeselectalloption = GXutil.strtobool( httpContext.cgiGet( "COMBO_LECMAQCOD_Includeselectalloption")) ;
            Combo_lecmaqcod_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_LECMAQCOD_Emptyitem")) ;
            Combo_lecmaqcod_Includeaddnewoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_LECMAQCOD_Includeaddnewoption")) ;
            Combo_lecmaqcod_Htmltemplate = httpContext.cgiGet( "COMBO_LECMAQCOD_Htmltemplate") ;
            Combo_lecmaqcod_Multiplevaluestype = httpContext.cgiGet( "COMBO_LECMAQCOD_Multiplevaluestype") ;
            Combo_lecmaqcod_Loadingdata = httpContext.cgiGet( "COMBO_LECMAQCOD_Loadingdata") ;
            Combo_lecmaqcod_Noresultsfound = httpContext.cgiGet( "COMBO_LECMAQCOD_Noresultsfound") ;
            Combo_lecmaqcod_Emptyitemtext = httpContext.cgiGet( "COMBO_LECMAQCOD_Emptyitemtext") ;
            Combo_lecmaqcod_Onlyselectedvalues = httpContext.cgiGet( "COMBO_LECMAQCOD_Onlyselectedvalues") ;
            Combo_lecmaqcod_Selectalltext = httpContext.cgiGet( "COMBO_LECMAQCOD_Selectalltext") ;
            Combo_lecmaqcod_Multiplevaluesseparator = httpContext.cgiGet( "COMBO_LECMAQCOD_Multiplevaluesseparator") ;
            Combo_lecmaqcod_Addnewoptiontext = httpContext.cgiGet( "COMBO_LECMAQCOD_Addnewoptiontext") ;
            Combo_lecopecod_Objectcall = httpContext.cgiGet( "COMBO_LECOPECOD_Objectcall") ;
            Combo_lecopecod_Class = httpContext.cgiGet( "COMBO_LECOPECOD_Class") ;
            Combo_lecopecod_Icontype = httpContext.cgiGet( "COMBO_LECOPECOD_Icontype") ;
            Combo_lecopecod_Icon = httpContext.cgiGet( "COMBO_LECOPECOD_Icon") ;
            Combo_lecopecod_Caption = httpContext.cgiGet( "COMBO_LECOPECOD_Caption") ;
            Combo_lecopecod_Tooltip = httpContext.cgiGet( "COMBO_LECOPECOD_Tooltip") ;
            Combo_lecopecod_Cls = httpContext.cgiGet( "COMBO_LECOPECOD_Cls") ;
            Combo_lecopecod_Selectedvalue_set = httpContext.cgiGet( "COMBO_LECOPECOD_Selectedvalue_set") ;
            Combo_lecopecod_Selectedvalue_get = httpContext.cgiGet( "COMBO_LECOPECOD_Selectedvalue_get") ;
            Combo_lecopecod_Selectedtext_set = httpContext.cgiGet( "COMBO_LECOPECOD_Selectedtext_set") ;
            Combo_lecopecod_Selectedtext_get = httpContext.cgiGet( "COMBO_LECOPECOD_Selectedtext_get") ;
            Combo_lecopecod_Gamoauthtoken = httpContext.cgiGet( "COMBO_LECOPECOD_Gamoauthtoken") ;
            Combo_lecopecod_Ddointernalname = httpContext.cgiGet( "COMBO_LECOPECOD_Ddointernalname") ;
            Combo_lecopecod_Titlecontrolalign = httpContext.cgiGet( "COMBO_LECOPECOD_Titlecontrolalign") ;
            Combo_lecopecod_Dropdownoptionstype = httpContext.cgiGet( "COMBO_LECOPECOD_Dropdownoptionstype") ;
            Combo_lecopecod_Enabled = GXutil.strtobool( httpContext.cgiGet( "COMBO_LECOPECOD_Enabled")) ;
            Combo_lecopecod_Visible = GXutil.strtobool( httpContext.cgiGet( "COMBO_LECOPECOD_Visible")) ;
            Combo_lecopecod_Titlecontrolidtoreplace = httpContext.cgiGet( "COMBO_LECOPECOD_Titlecontrolidtoreplace") ;
            Combo_lecopecod_Datalisttype = httpContext.cgiGet( "COMBO_LECOPECOD_Datalisttype") ;
            Combo_lecopecod_Allowmultipleselection = GXutil.strtobool( httpContext.cgiGet( "COMBO_LECOPECOD_Allowmultipleselection")) ;
            Combo_lecopecod_Datalistfixedvalues = httpContext.cgiGet( "COMBO_LECOPECOD_Datalistfixedvalues") ;
            Combo_lecopecod_Isgriditem = GXutil.strtobool( httpContext.cgiGet( "COMBO_LECOPECOD_Isgriditem")) ;
            Combo_lecopecod_Hasdescription = GXutil.strtobool( httpContext.cgiGet( "COMBO_LECOPECOD_Hasdescription")) ;
            Combo_lecopecod_Datalistproc = httpContext.cgiGet( "COMBO_LECOPECOD_Datalistproc") ;
            Combo_lecopecod_Datalistprocparametersprefix = httpContext.cgiGet( "COMBO_LECOPECOD_Datalistprocparametersprefix") ;
            Combo_lecopecod_Remoteservicesparameters = httpContext.cgiGet( "COMBO_LECOPECOD_Remoteservicesparameters") ;
            Combo_lecopecod_Datalistupdateminimumcharacters = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_LECOPECOD_Datalistupdateminimumcharacters"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_lecopecod_Includeonlyselectedoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_LECOPECOD_Includeonlyselectedoption")) ;
            Combo_lecopecod_Includeselectalloption = GXutil.strtobool( httpContext.cgiGet( "COMBO_LECOPECOD_Includeselectalloption")) ;
            Combo_lecopecod_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_LECOPECOD_Emptyitem")) ;
            Combo_lecopecod_Includeaddnewoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_LECOPECOD_Includeaddnewoption")) ;
            Combo_lecopecod_Htmltemplate = httpContext.cgiGet( "COMBO_LECOPECOD_Htmltemplate") ;
            Combo_lecopecod_Multiplevaluestype = httpContext.cgiGet( "COMBO_LECOPECOD_Multiplevaluestype") ;
            Combo_lecopecod_Loadingdata = httpContext.cgiGet( "COMBO_LECOPECOD_Loadingdata") ;
            Combo_lecopecod_Noresultsfound = httpContext.cgiGet( "COMBO_LECOPECOD_Noresultsfound") ;
            Combo_lecopecod_Emptyitemtext = httpContext.cgiGet( "COMBO_LECOPECOD_Emptyitemtext") ;
            Combo_lecopecod_Onlyselectedvalues = httpContext.cgiGet( "COMBO_LECOPECOD_Onlyselectedvalues") ;
            Combo_lecopecod_Selectalltext = httpContext.cgiGet( "COMBO_LECOPECOD_Selectalltext") ;
            Combo_lecopecod_Multiplevaluesseparator = httpContext.cgiGet( "COMBO_LECOPECOD_Multiplevaluesseparator") ;
            Combo_lecopecod_Addnewoptiontext = httpContext.cgiGet( "COMBO_LECOPECOD_Addnewoptiontext") ;
            Combo_lecparcod_Objectcall = httpContext.cgiGet( "COMBO_LECPARCOD_Objectcall") ;
            Combo_lecparcod_Class = httpContext.cgiGet( "COMBO_LECPARCOD_Class") ;
            Combo_lecparcod_Icontype = httpContext.cgiGet( "COMBO_LECPARCOD_Icontype") ;
            Combo_lecparcod_Icon = httpContext.cgiGet( "COMBO_LECPARCOD_Icon") ;
            Combo_lecparcod_Caption = httpContext.cgiGet( "COMBO_LECPARCOD_Caption") ;
            Combo_lecparcod_Tooltip = httpContext.cgiGet( "COMBO_LECPARCOD_Tooltip") ;
            Combo_lecparcod_Cls = httpContext.cgiGet( "COMBO_LECPARCOD_Cls") ;
            Combo_lecparcod_Selectedvalue_set = httpContext.cgiGet( "COMBO_LECPARCOD_Selectedvalue_set") ;
            Combo_lecparcod_Selectedvalue_get = httpContext.cgiGet( "COMBO_LECPARCOD_Selectedvalue_get") ;
            Combo_lecparcod_Selectedtext_set = httpContext.cgiGet( "COMBO_LECPARCOD_Selectedtext_set") ;
            Combo_lecparcod_Selectedtext_get = httpContext.cgiGet( "COMBO_LECPARCOD_Selectedtext_get") ;
            Combo_lecparcod_Gamoauthtoken = httpContext.cgiGet( "COMBO_LECPARCOD_Gamoauthtoken") ;
            Combo_lecparcod_Ddointernalname = httpContext.cgiGet( "COMBO_LECPARCOD_Ddointernalname") ;
            Combo_lecparcod_Titlecontrolalign = httpContext.cgiGet( "COMBO_LECPARCOD_Titlecontrolalign") ;
            Combo_lecparcod_Dropdownoptionstype = httpContext.cgiGet( "COMBO_LECPARCOD_Dropdownoptionstype") ;
            Combo_lecparcod_Enabled = GXutil.strtobool( httpContext.cgiGet( "COMBO_LECPARCOD_Enabled")) ;
            Combo_lecparcod_Visible = GXutil.strtobool( httpContext.cgiGet( "COMBO_LECPARCOD_Visible")) ;
            Combo_lecparcod_Titlecontrolidtoreplace = httpContext.cgiGet( "COMBO_LECPARCOD_Titlecontrolidtoreplace") ;
            Combo_lecparcod_Datalisttype = httpContext.cgiGet( "COMBO_LECPARCOD_Datalisttype") ;
            Combo_lecparcod_Allowmultipleselection = GXutil.strtobool( httpContext.cgiGet( "COMBO_LECPARCOD_Allowmultipleselection")) ;
            Combo_lecparcod_Datalistfixedvalues = httpContext.cgiGet( "COMBO_LECPARCOD_Datalistfixedvalues") ;
            Combo_lecparcod_Isgriditem = GXutil.strtobool( httpContext.cgiGet( "COMBO_LECPARCOD_Isgriditem")) ;
            Combo_lecparcod_Hasdescription = GXutil.strtobool( httpContext.cgiGet( "COMBO_LECPARCOD_Hasdescription")) ;
            Combo_lecparcod_Datalistproc = httpContext.cgiGet( "COMBO_LECPARCOD_Datalistproc") ;
            Combo_lecparcod_Datalistprocparametersprefix = httpContext.cgiGet( "COMBO_LECPARCOD_Datalistprocparametersprefix") ;
            Combo_lecparcod_Remoteservicesparameters = httpContext.cgiGet( "COMBO_LECPARCOD_Remoteservicesparameters") ;
            Combo_lecparcod_Datalistupdateminimumcharacters = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_LECPARCOD_Datalistupdateminimumcharacters"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_lecparcod_Includeonlyselectedoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_LECPARCOD_Includeonlyselectedoption")) ;
            Combo_lecparcod_Includeselectalloption = GXutil.strtobool( httpContext.cgiGet( "COMBO_LECPARCOD_Includeselectalloption")) ;
            Combo_lecparcod_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_LECPARCOD_Emptyitem")) ;
            Combo_lecparcod_Includeaddnewoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_LECPARCOD_Includeaddnewoption")) ;
            Combo_lecparcod_Htmltemplate = httpContext.cgiGet( "COMBO_LECPARCOD_Htmltemplate") ;
            Combo_lecparcod_Multiplevaluestype = httpContext.cgiGet( "COMBO_LECPARCOD_Multiplevaluestype") ;
            Combo_lecparcod_Loadingdata = httpContext.cgiGet( "COMBO_LECPARCOD_Loadingdata") ;
            Combo_lecparcod_Noresultsfound = httpContext.cgiGet( "COMBO_LECPARCOD_Noresultsfound") ;
            Combo_lecparcod_Emptyitemtext = httpContext.cgiGet( "COMBO_LECPARCOD_Emptyitemtext") ;
            Combo_lecparcod_Onlyselectedvalues = httpContext.cgiGet( "COMBO_LECPARCOD_Onlyselectedvalues") ;
            Combo_lecparcod_Selectalltext = httpContext.cgiGet( "COMBO_LECPARCOD_Selectalltext") ;
            Combo_lecparcod_Multiplevaluesseparator = httpContext.cgiGet( "COMBO_LECPARCOD_Multiplevaluesseparator") ;
            Combo_lecparcod_Addnewoptiontext = httpContext.cgiGet( "COMBO_LECPARCOD_Addnewoptiontext") ;
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
            A1166LecMaqCod = httpContext.cgiGet( edtLecMaqCod_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1166LecMaqCod", A1166LecMaqCod);
            cmbLecTipEnt.setValue( httpContext.cgiGet( cmbLecTipEnt.getInternalname()) );
            A1796LecTipEnt = httpContext.cgiGet( cmbLecTipEnt.getInternalname()) ;
            n1796LecTipEnt = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1796LecTipEnt", A1796LecTipEnt);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtLecBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtLecBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "LECBARCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtLecBarCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A1167LecBarCod = 0 ;
               n1167LecBarCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A1167LecBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1167LecBarCod), 8, 0));
            }
            else
            {
               A1167LecBarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtLecBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n1167LecBarCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A1167LecBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1167LecBarCod), 8, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtLecBarReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtLecBarReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "LECBARREO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtLecBarReo_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A1168LecBarReo = (byte)(0) ;
               n1168LecBarReo = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A1168LecBarReo", GXutil.str( A1168LecBarReo, 1, 0));
            }
            else
            {
               A1168LecBarReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtLecBarReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n1168LecBarReo = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A1168LecBarReo", GXutil.str( A1168LecBarReo, 1, 0));
            }
            A1169LecBarPar = httpContext.cgiGet( edtLecBarPar_Internalname) ;
            n1169LecBarPar = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1169LecBarPar", A1169LecBarPar);
            AV25PromptHDR = httpContext.cgiGet( imgavPrompthdr_Internalname) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtLecFasOrd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtLecFasOrd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "LECFASORD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtLecFasOrd_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A1188LecFasOrd = (short)(0) ;
               n1188LecFasOrd = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A1188LecFasOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1188LecFasOrd), 4, 0));
            }
            else
            {
               A1188LecFasOrd = (short)(localUtil.ctol( httpContext.cgiGet( edtLecFasOrd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n1188LecFasOrd = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A1188LecFasOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1188LecFasOrd), 4, 0));
            }
            AV24PromptOrden = httpContext.cgiGet( imgavPromptorden_Internalname) ;
            A1171LecFasCod = httpContext.cgiGet( edtLecFasCod_Internalname) ;
            n1171LecFasCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1171LecFasCod", A1171LecFasCod);
            A14260LecFasDsc = httpContext.cgiGet( edtLecFasDsc_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14260LecFasDsc", A14260LecFasDsc);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtLecNumLot_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtLecNumLot_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "LECNUMLOT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtLecNumLot_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A4702LecNumLot = 0 ;
               n4702LecNumLot = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4702LecNumLot", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4702LecNumLot), 6, 0));
            }
            else
            {
               A4702LecNumLot = (int)(localUtil.ctol( httpContext.cgiGet( edtLecNumLot_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n4702LecNumLot = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4702LecNumLot", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4702LecNumLot), 6, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtLecRecLinM_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtLecRecLinM_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "LECRECLINM");
               AnyError = (short)(1) ;
               GX_FocusControl = edtLecRecLinM_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A4703LecRecLinM = (short)(0) ;
               n4703LecRecLinM = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4703LecRecLinM", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4703LecRecLinM), 4, 0));
            }
            else
            {
               A4703LecRecLinM = (short)(localUtil.ctol( httpContext.cgiGet( edtLecRecLinM_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n4703LecRecLinM = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4703LecRecLinM", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4703LecRecLinM), 4, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtLecOpeCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtLecOpeCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "LECOPECOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtLecOpeCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A1170LecOpeCod = 0 ;
               n1170LecOpeCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A1170LecOpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1170LecOpeCod), 6, 0));
            }
            else
            {
               A1170LecOpeCod = (int)(localUtil.ctol( httpContext.cgiGet( edtLecOpeCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n1170LecOpeCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A1170LecOpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1170LecOpeCod), 6, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtLecParCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtLecParCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "LECPARCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtLecParCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A1172LecParCod = (short)(0) ;
               n1172LecParCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A1172LecParCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1172LecParCod), 4, 0));
            }
            else
            {
               A1172LecParCod = (short)(localUtil.ctol( httpContext.cgiGet( edtLecParCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n1172LecParCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A1172LecParCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1172LecParCod), 4, 0));
            }
            if ( localUtil.vcdate( httpContext.cgiGet( edtLecFec_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "LECFEC");
               AnyError = (short)(1) ;
               GX_FocusControl = edtLecFec_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A1174LecFec = GXutil.nullDate() ;
               n1174LecFec = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A1174LecFec", localUtil.format(A1174LecFec, "99/99/99"));
            }
            else
            {
               A1174LecFec = localUtil.ctod( httpContext.cgiGet( edtLecFec_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               n1174LecFec = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A1174LecFec", localUtil.format(A1174LecFec, "99/99/99"));
            }
            A1173LecHor = httpContext.cgiGet( edtLecHor_Internalname) ;
            n1173LecHor = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1173LecHor", A1173LecHor);
            A4345LecCombin = httpContext.cgiGet( edtLecCombin_Internalname) ;
            n4345LecCombin = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4345LecCombin", A4345LecCombin);
            if ( ( ( ((GXutil.strcmp(httpContext.cgiGet( chkLecCnc.getInternalname()), "1")==0) ? 1 : 0) < 0 ) ) || ( ( ((GXutil.strcmp(httpContext.cgiGet( chkLecCnc.getInternalname()), "1")==0) ? 1 : 0) > 9 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "LECCNC");
               AnyError = (short)(1) ;
               GX_FocusControl = chkLecCnc.getInternalname() ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A6832LecCnc = (byte)(0) ;
               n6832LecCnc = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A6832LecCnc", GXutil.str( A6832LecCnc, 1, 0));
            }
            else
            {
               A6832LecCnc = (byte)(((GXutil.strcmp(httpContext.cgiGet( chkLecCnc.getInternalname()), "1")==0) ? 1 : 0)) ;
               n6832LecCnc = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A6832LecCnc", GXutil.str( A6832LecCnc, 1, 0));
            }
            AV27Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27Pgmname", AV27Pgmname);
            AV23ComboLecMaqCod = httpContext.cgiGet( edtavCombolecmaqcod_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV23ComboLecMaqCod", AV23ComboLecMaqCod);
            AV17ComboLecOpeCod = (int)(localUtil.ctol( httpContext.cgiGet( edtavCombolecopecod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17ComboLecOpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17ComboLecOpeCod), 6, 0));
            AV19ComboLecParCod = (short)(localUtil.ctol( httpContext.cgiGet( edtavCombolecparcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV19ComboLecParCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19ComboLecParCod), 4, 0));
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"Lector__");
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( GXutil.strcmp(A1166LecMaqCod, Z1166LecMaqCod) != 0 ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("lectoroptico\\lector__:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               A1166LecMaqCod = httpContext.GetPar( "LecMaqCod") ;
               httpContext.ajax_rsp_assign_attri("", false, "A1166LecMaqCod", A1166LecMaqCod);
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
                  sMode156 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  Gx_mode = sMode156 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound156 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_1TV0( ) ;
                        if ( AnyError == 0 )
                        {
                           GX_FocusControl = bttBtntrn_enter_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noinsert"), 1, "LECMAQCOD");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtLecMaqCod_Internalname ;
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
                        e131TV2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e141TV2 ();
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
         e141TV2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll1TV156( ) ;
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
         disableAttributes1TV156( ) ;
      }
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavCombolecmaqcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombolecmaqcod_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavCombolecopecod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombolecopecod_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavCombolecparcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombolecparcod_Enabled), 5, 0), true);
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

   public void confirm_1TV0( )
   {
      beforeValidate1TV156( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1TV156( ) ;
         }
         else
         {
            checkExtendedTable1TV156( ) ;
            closeExtendedTableCursors1TV156( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
   }

   public void resetCaption1TV0( )
   {
   }

   public void e131TV2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV12Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      lector___impl.this.GXt_char1 = GXv_char2[0] ;
      AV12Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = AV7EmprCod ;
      GXv_char3[0] = AV13EmprNom ;
      GXv_char4[0] = AV14UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      lector___impl.this.AV7EmprCod = GXv_char2[0] ;
      lector___impl.this.AV13EmprNom = GXv_char3[0] ;
      lector___impl.this.AV14UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV13EmprNom", AV13EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV14UsurCod", AV14UsurCod);
      GXt_char1 = AV12Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      lector___impl.this.GXt_char1 = GXv_char4[0] ;
      AV12Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char4[0] = AV7EmprCod ;
      GXv_char3[0] = AV13EmprNom ;
      GXv_char2[0] = AV14UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char4, GXv_char3, GXv_char2) ;
      lector___impl.this.AV7EmprCod = GXv_char4[0] ;
      lector___impl.this.AV13EmprNom = GXv_char3[0] ;
      lector___impl.this.AV14UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV13EmprNom", AV13EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV14UsurCod", AV14UsurCod);
      GXv_SdtWWPContext5[0] = AV9WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext5) ;
      AV9WWPContext = GXv_SdtWWPContext5[0] ;
      edtLecParCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLecParCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLecParCod_Visible), 5, 0), true);
      AV19ComboLecParCod = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19ComboLecParCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19ComboLecParCod), 4, 0));
      edtavCombolecparcod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCombolecparcod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombolecparcod_Visible), 5, 0), true);
      edtLecOpeCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLecOpeCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLecOpeCod_Visible), 5, 0), true);
      AV17ComboLecOpeCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17ComboLecOpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17ComboLecOpeCod), 6, 0));
      edtavCombolecopecod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCombolecopecod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombolecopecod_Visible), 5, 0), true);
      edtLecMaqCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLecMaqCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLecMaqCod_Visible), 5, 0), true);
      AV23ComboLecMaqCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23ComboLecMaqCod", AV23ComboLecMaqCod);
      edtavCombolecmaqcod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCombolecmaqcod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombolecmaqcod_Visible), 5, 0), true);
      /* Execute user subroutine: 'LOADCOMBOLECMAQCOD' */
      S112 ();
      if ( returnInSub )
      {
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      /* Execute user subroutine: 'LOADCOMBOLECOPECOD' */
      S122 ();
      if ( returnInSub )
      {
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      /* Execute user subroutine: 'LOADCOMBOLECPARCOD' */
      S132 ();
      if ( returnInSub )
      {
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      /* Execute user subroutine: 'ATTRIBUTESSECURITYCODE' */
      S142 ();
      if ( returnInSub )
      {
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      AV10TrnContext.fromxml(AV11WebSession.getValue("TrnContext"), null, null);
      imgavPromptorden_gximage = "prompt" ;
      httpContext.ajax_rsp_assign_prop("", false, imgavPromptorden_Internalname, "gximage", imgavPromptorden_gximage, true);
      AV24PromptOrden = context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )) ;
      httpContext.ajax_rsp_assign_prop("", false, imgavPromptorden_Internalname, "Bitmap", ((GXutil.strcmp("", AV24PromptOrden)==0) ? AV28Promptorden_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV24PromptOrden))), true);
      httpContext.ajax_rsp_assign_prop("", false, imgavPromptorden_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV24PromptOrden), true);
      AV28Promptorden_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
      httpContext.ajax_rsp_assign_prop("", false, imgavPromptorden_Internalname, "Bitmap", ((GXutil.strcmp("", AV24PromptOrden)==0) ? AV28Promptorden_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV24PromptOrden))), true);
      httpContext.ajax_rsp_assign_prop("", false, imgavPromptorden_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV24PromptOrden), true);
      imgavPrompthdr_gximage = "prompt" ;
      httpContext.ajax_rsp_assign_prop("", false, imgavPrompthdr_Internalname, "gximage", imgavPrompthdr_gximage, true);
      AV25PromptHDR = context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )) ;
      httpContext.ajax_rsp_assign_prop("", false, imgavPrompthdr_Internalname, "Bitmap", ((GXutil.strcmp("", AV25PromptHDR)==0) ? AV29Prompthdr_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV25PromptHDR))), true);
      httpContext.ajax_rsp_assign_prop("", false, imgavPrompthdr_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV25PromptHDR), true);
      AV29Prompthdr_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
      httpContext.ajax_rsp_assign_prop("", false, imgavPrompthdr_Internalname, "Bitmap", ((GXutil.strcmp("", AV25PromptHDR)==0) ? AV29Prompthdr_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV25PromptHDR))), true);
      httpContext.ajax_rsp_assign_prop("", false, imgavPrompthdr_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV25PromptHDR), true);
   }

   public void e141TV2( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      if ( ( ( GXutil.strcmp(Gx_mode, "UPD") == 0 ) && ( GXutil.strcmp(A1796LecTipEnt, httpContext.getMessage( "H", "")) == 0 ) ) || ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) ) )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A1166LecMaqCod ;
         new app.plecdelt(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
         lector___impl.this.A396EmprCod = GXv_char4[0] ;
         lector___impl.this.A1166LecMaqCod = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A1166LecMaqCod", A1166LecMaqCod);
      }
      if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV10TrnContext.getgxTv_SdtWWPTransactionContext_Callerondelete() )
      {
         callWebObject(formatLink("app.lectoroptico.lector__ww", new String[] {}, new String[] {}) );
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
      /*  Sending Event outputs  */
   }

   public void S142( )
   {
      /* 'ATTRIBUTESSECURITYCODE' Routine */
      returnInSub = false ;
      edtLecCombin_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLecCombin_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLecCombin_Visible), 5, 0), true);
      divLeccombin_cell_Class = "Invisible" ;
      httpContext.ajax_rsp_assign_prop("", false, divLeccombin_cell_Internalname, "Class", divLeccombin_cell_Class, true);
   }

   public void S132( )
   {
      /* 'LOADCOMBOLECPARCOD' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTComboData_Item6 = AV18LecParCod_Data ;
      GXv_char4[0] = AV16ComboSelectedValue ;
      GXv_objcol_SdtDVB_SDTComboData_Item7[0] = GXt_objcol_SdtDVB_SDTComboData_Item6 ;
      new app.lectoroptico.lector__loaddvcombo(remoteHandle, context).execute( "LecParCod", Gx_mode, AV7EmprCod, AV8LecMaqCod, GXv_char4, GXv_objcol_SdtDVB_SDTComboData_Item7) ;
      lector___impl.this.AV16ComboSelectedValue = GXv_char4[0] ;
      GXt_objcol_SdtDVB_SDTComboData_Item6 = GXv_objcol_SdtDVB_SDTComboData_Item7[0] ;
      AV18LecParCod_Data = GXt_objcol_SdtDVB_SDTComboData_Item6 ;
      Combo_lecparcod_Selectedvalue_set = AV16ComboSelectedValue ;
      ucCombo_lecparcod.sendProperty(context, "", false, Combo_lecparcod_Internalname, "SelectedValue_set", Combo_lecparcod_Selectedvalue_set);
      AV19ComboLecParCod = (short)(GXutil.lval( AV16ComboSelectedValue)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19ComboLecParCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19ComboLecParCod), 4, 0));
      if ( ( GXutil.strcmp(Gx_mode, "DSP") == 0 ) || ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) )
      {
         Combo_lecparcod_Enabled = false ;
         ucCombo_lecparcod.sendProperty(context, "", false, Combo_lecparcod_Internalname, "Enabled", GXutil.booltostr( Combo_lecparcod_Enabled));
      }
   }

   public void S122( )
   {
      /* 'LOADCOMBOLECOPECOD' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTComboData_Item6 = AV15LecOpeCod_Data ;
      GXv_char4[0] = AV16ComboSelectedValue ;
      GXv_objcol_SdtDVB_SDTComboData_Item7[0] = GXt_objcol_SdtDVB_SDTComboData_Item6 ;
      new app.lectoroptico.lector__loaddvcombo(remoteHandle, context).execute( "LecOpeCod", Gx_mode, AV7EmprCod, AV8LecMaqCod, GXv_char4, GXv_objcol_SdtDVB_SDTComboData_Item7) ;
      lector___impl.this.AV16ComboSelectedValue = GXv_char4[0] ;
      GXt_objcol_SdtDVB_SDTComboData_Item6 = GXv_objcol_SdtDVB_SDTComboData_Item7[0] ;
      AV15LecOpeCod_Data = GXt_objcol_SdtDVB_SDTComboData_Item6 ;
      Combo_lecopecod_Selectedvalue_set = AV16ComboSelectedValue ;
      ucCombo_lecopecod.sendProperty(context, "", false, Combo_lecopecod_Internalname, "SelectedValue_set", Combo_lecopecod_Selectedvalue_set);
      AV17ComboLecOpeCod = (int)(GXutil.lval( AV16ComboSelectedValue)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17ComboLecOpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17ComboLecOpeCod), 6, 0));
      if ( ( GXutil.strcmp(Gx_mode, "DSP") == 0 ) || ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) )
      {
         Combo_lecopecod_Enabled = false ;
         ucCombo_lecopecod.sendProperty(context, "", false, Combo_lecopecod_Internalname, "Enabled", GXutil.booltostr( Combo_lecopecod_Enabled));
      }
   }

   public void S112( )
   {
      /* 'LOADCOMBOLECMAQCOD' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTComboData_Item6 = AV22LecMaqCod_Data ;
      GXv_char4[0] = AV16ComboSelectedValue ;
      GXv_objcol_SdtDVB_SDTComboData_Item7[0] = GXt_objcol_SdtDVB_SDTComboData_Item6 ;
      new app.lectoroptico.lector__loaddvcombo(remoteHandle, context).execute( "LecMaqCod", Gx_mode, AV7EmprCod, AV8LecMaqCod, GXv_char4, GXv_objcol_SdtDVB_SDTComboData_Item7) ;
      lector___impl.this.AV16ComboSelectedValue = GXv_char4[0] ;
      GXt_objcol_SdtDVB_SDTComboData_Item6 = GXv_objcol_SdtDVB_SDTComboData_Item7[0] ;
      AV22LecMaqCod_Data = GXt_objcol_SdtDVB_SDTComboData_Item6 ;
      Combo_lecmaqcod_Selectedvalue_set = AV16ComboSelectedValue ;
      ucCombo_lecmaqcod.sendProperty(context, "", false, Combo_lecmaqcod_Internalname, "SelectedValue_set", Combo_lecmaqcod_Selectedvalue_set);
      AV23ComboLecMaqCod = AV16ComboSelectedValue ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23ComboLecMaqCod", AV23ComboLecMaqCod);
      if ( ( GXutil.strcmp(Gx_mode, "INS") != 0 ) || ! (GXutil.strcmp("", AV8LecMaqCod)==0) )
      {
         Combo_lecmaqcod_Enabled = false ;
         ucCombo_lecmaqcod.sendProperty(context, "", false, Combo_lecmaqcod_Internalname, "Enabled", GXutil.booltostr( Combo_lecmaqcod_Enabled));
      }
   }

   public void zm1TV156( int GX_JID )
   {
      if ( ( GX_JID == 15 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z1170LecOpeCod = T01TV3_A1170LecOpeCod[0] ;
            Z1172LecParCod = T01TV3_A1172LecParCod[0] ;
            Z1167LecBarCod = T01TV3_A1167LecBarCod[0] ;
            Z1168LecBarReo = T01TV3_A1168LecBarReo[0] ;
            Z1169LecBarPar = T01TV3_A1169LecBarPar[0] ;
            Z1171LecFasCod = T01TV3_A1171LecFasCod[0] ;
            Z1188LecFasOrd = T01TV3_A1188LecFasOrd[0] ;
            Z1173LecHor = T01TV3_A1173LecHor[0] ;
            Z1174LecFec = T01TV3_A1174LecFec[0] ;
            Z1796LecTipEnt = T01TV3_A1796LecTipEnt[0] ;
            Z4702LecNumLot = T01TV3_A4702LecNumLot[0] ;
            Z4703LecRecLinM = T01TV3_A4703LecRecLinM[0] ;
            Z4345LecCombin = T01TV3_A4345LecCombin[0] ;
            Z6832LecCnc = T01TV3_A6832LecCnc[0] ;
         }
         else
         {
            Z1170LecOpeCod = A1170LecOpeCod ;
            Z1172LecParCod = A1172LecParCod ;
            Z1167LecBarCod = A1167LecBarCod ;
            Z1168LecBarReo = A1168LecBarReo ;
            Z1169LecBarPar = A1169LecBarPar ;
            Z1171LecFasCod = A1171LecFasCod ;
            Z1188LecFasOrd = A1188LecFasOrd ;
            Z1173LecHor = A1173LecHor ;
            Z1174LecFec = A1174LecFec ;
            Z1796LecTipEnt = A1796LecTipEnt ;
            Z4702LecNumLot = A4702LecNumLot ;
            Z4703LecRecLinM = A4703LecRecLinM ;
            Z4345LecCombin = A4345LecCombin ;
            Z6832LecCnc = A6832LecCnc ;
         }
      }
      if ( GX_JID == -15 )
      {
         Z1166LecMaqCod = A1166LecMaqCod ;
         Z1170LecOpeCod = A1170LecOpeCod ;
         Z1172LecParCod = A1172LecParCod ;
         Z1167LecBarCod = A1167LecBarCod ;
         Z1168LecBarReo = A1168LecBarReo ;
         Z1169LecBarPar = A1169LecBarPar ;
         Z1171LecFasCod = A1171LecFasCod ;
         Z1188LecFasOrd = A1188LecFasOrd ;
         Z1173LecHor = A1173LecHor ;
         Z1174LecFec = A1174LecFec ;
         Z1796LecTipEnt = A1796LecTipEnt ;
         Z4702LecNumLot = A4702LecNumLot ;
         Z4703LecRecLinM = A4703LecRecLinM ;
         Z4345LecCombin = A4345LecCombin ;
         Z6832LecCnc = A6832LecCnc ;
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
      AV27Pgmname = "LectorOptico.Lector__" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27Pgmname", AV27Pgmname);
      imgprompt_1171_Link = ((GXutil.strcmp(Gx_mode, "DSP")==0) ? "" : "javascript:"+"gx.popup.openPrompt('"+"app.tfasproprompt"+"',["+"{Ctrl:gx.dom.el('"+"EMPRCOD"+"'), id:'"+"EMPRCOD"+"'"+",IOType:'inout'}"+","+"{Ctrl:gx.dom.el('"+"LECFASCOD"+"'), id:'"+"LECFASCOD"+"'"+",IOType:'inout'}"+","+"{Ctrl:gx.dom.el('"+"LECFASDSC"+"'), id:'"+"LECFASDSC"+"'"+",IOType:'inout'}"+"],"+"null"+","+"'', false"+","+"false"+");") ;
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV7EmprCod)==0) )
      {
         A396EmprCod = AV7EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      /* Using cursor T01TV4 */
      pr_default.execute(2, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01TV4_A407EmprNom[0] ;
      n407EmprNom = T01TV4_n407EmprNom[0] ;
      pr_default.close(2);
      GXt_int8 = (byte)(0) ;
      GXv_int9[0] = GXt_int8 ;
      new app.pexicon(remoteHandle, context).execute( AV7EmprCod, httpContext.getMessage( httpContext.getMessage( "TINEST", ""), ""), GXv_int9) ;
      lector___impl.this.GXt_int8 = GXv_int9[0] ;
      edtLecCombin_Visible = ((GXt_int8==1) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtLecCombin_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLecCombin_Visible), 5, 0), true);
      GXt_int8 = (byte)(0) ;
      GXv_int9[0] = GXt_int8 ;
      new app.pexicon(remoteHandle, context).execute( AV7EmprCod, httpContext.getMessage( httpContext.getMessage( "TINEST", ""), ""), GXv_int9) ;
      lector___impl.this.GXt_int8 = GXv_int9[0] ;
      if ( ! ( ( GXt_int8 == 1 ) ) )
      {
         divLeccombin_cell_Class = httpContext.getMessage( "Invisible", "") ;
         httpContext.ajax_rsp_assign_prop("", false, divLeccombin_cell_Internalname, "Class", divLeccombin_cell_Class, true);
      }
      else
      {
         GXt_int8 = (byte)(0) ;
         GXv_int9[0] = GXt_int8 ;
         new app.pexicon(remoteHandle, context).execute( AV7EmprCod, httpContext.getMessage( httpContext.getMessage( "TINEST", ""), ""), GXv_int9) ;
         lector___impl.this.GXt_int8 = GXv_int9[0] ;
         if ( GXt_int8 == 1 )
         {
            divLeccombin_cell_Class = httpContext.getMessage( "col-xs-12 col-sm-2 DataContentCell DscTop", "") ;
            httpContext.ajax_rsp_assign_prop("", false, divLeccombin_cell_Internalname, "Class", divLeccombin_cell_Class, true);
         }
      }
      if ( ! (GXutil.strcmp("", AV8LecMaqCod)==0) )
      {
         edtLecMaqCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLecMaqCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLecMaqCod_Enabled), 5, 0), true);
      }
      else
      {
         edtLecMaqCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLecMaqCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLecMaqCod_Enabled), 5, 0), true);
      }
      if ( ! (GXutil.strcmp("", AV8LecMaqCod)==0) )
      {
         edtLecMaqCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLecMaqCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLecMaqCod_Enabled), 5, 0), true);
      }
      if ( ! (GXutil.strcmp("", AV8LecMaqCod)==0) )
      {
         A1166LecMaqCod = AV8LecMaqCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A1166LecMaqCod", A1166LecMaqCod);
      }
      else
      {
         A1166LecMaqCod = AV23ComboLecMaqCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A1166LecMaqCod", A1166LecMaqCod);
      }
   }

   public void standaloneModal( )
   {
      A1170LecOpeCod = AV17ComboLecOpeCod ;
      n1170LecOpeCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1170LecOpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1170LecOpeCod), 6, 0));
      A1172LecParCod = AV19ComboLecParCod ;
      n1172LecParCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1172LecParCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1172LecParCod), 4, 0));
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
         GXt_char1 = A14259lecOpeNom ;
         GXv_char4[0] = GXt_char1 ;
         new app.popenom(remoteHandle, context).execute( A396EmprCod, A1170LecOpeCod, GXv_char4) ;
         lector___impl.this.GXt_char1 = GXv_char4[0] ;
         A14259lecOpeNom = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "A14259lecOpeNom", A14259lecOpeNom);
         GXt_char1 = A14261LecParNom ;
         GXv_char4[0] = GXt_char1 ;
         new app.pparcodnom(remoteHandle, context).execute( A396EmprCod, A1172LecParCod, GXv_char4) ;
         lector___impl.this.GXt_char1 = GXv_char4[0] ;
         A14261LecParNom = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "A14261LecParNom", A14261LecParNom);
      }
   }

   public void load1TV156( )
   {
      /* Using cursor T01TV5 */
      pr_default.execute(3, new Object[] {A396EmprCod, A1166LecMaqCod});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound156 = (short)(1) ;
         A1170LecOpeCod = T01TV5_A1170LecOpeCod[0] ;
         n1170LecOpeCod = T01TV5_n1170LecOpeCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1170LecOpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1170LecOpeCod), 6, 0));
         A1172LecParCod = T01TV5_A1172LecParCod[0] ;
         n1172LecParCod = T01TV5_n1172LecParCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1172LecParCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1172LecParCod), 4, 0));
         A1167LecBarCod = T01TV5_A1167LecBarCod[0] ;
         n1167LecBarCod = T01TV5_n1167LecBarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1167LecBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1167LecBarCod), 8, 0));
         A1168LecBarReo = T01TV5_A1168LecBarReo[0] ;
         n1168LecBarReo = T01TV5_n1168LecBarReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1168LecBarReo", GXutil.str( A1168LecBarReo, 1, 0));
         A1169LecBarPar = T01TV5_A1169LecBarPar[0] ;
         n1169LecBarPar = T01TV5_n1169LecBarPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1169LecBarPar", A1169LecBarPar);
         A1171LecFasCod = T01TV5_A1171LecFasCod[0] ;
         n1171LecFasCod = T01TV5_n1171LecFasCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1171LecFasCod", A1171LecFasCod);
         A1188LecFasOrd = T01TV5_A1188LecFasOrd[0] ;
         n1188LecFasOrd = T01TV5_n1188LecFasOrd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1188LecFasOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1188LecFasOrd), 4, 0));
         A1173LecHor = T01TV5_A1173LecHor[0] ;
         n1173LecHor = T01TV5_n1173LecHor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1173LecHor", A1173LecHor);
         A1174LecFec = T01TV5_A1174LecFec[0] ;
         n1174LecFec = T01TV5_n1174LecFec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1174LecFec", localUtil.format(A1174LecFec, "99/99/99"));
         A407EmprNom = T01TV5_A407EmprNom[0] ;
         n407EmprNom = T01TV5_n407EmprNom[0] ;
         A1796LecTipEnt = T01TV5_A1796LecTipEnt[0] ;
         n1796LecTipEnt = T01TV5_n1796LecTipEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1796LecTipEnt", A1796LecTipEnt);
         A4702LecNumLot = T01TV5_A4702LecNumLot[0] ;
         n4702LecNumLot = T01TV5_n4702LecNumLot[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4702LecNumLot", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4702LecNumLot), 6, 0));
         A4703LecRecLinM = T01TV5_A4703LecRecLinM[0] ;
         n4703LecRecLinM = T01TV5_n4703LecRecLinM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4703LecRecLinM", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4703LecRecLinM), 4, 0));
         A4345LecCombin = T01TV5_A4345LecCombin[0] ;
         n4345LecCombin = T01TV5_n4345LecCombin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4345LecCombin", A4345LecCombin);
         A6832LecCnc = T01TV5_A6832LecCnc[0] ;
         n6832LecCnc = T01TV5_n6832LecCnc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6832LecCnc", GXutil.str( A6832LecCnc, 1, 0));
         zm1TV156( -15) ;
      }
      pr_default.close(3);
      onLoadActions1TV156( ) ;
   }

   public void onLoadActions1TV156( )
   {
      A13721LecHdr = GXutil.str( A1167LecBarCod, 8, 0) + "-" + GXutil.str( A1168LecBarReo, 1, 0) + A1169LecBarPar ;
      httpContext.ajax_rsp_assign_attri("", false, "A13721LecHdr", A13721LecHdr);
      GXt_char1 = A14261LecParNom ;
      GXv_char4[0] = GXt_char1 ;
      new app.pparcodnom(remoteHandle, context).execute( A396EmprCod, A1172LecParCod, GXv_char4) ;
      lector___impl.this.GXt_char1 = GXv_char4[0] ;
      A14261LecParNom = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14261LecParNom", A14261LecParNom);
      GXt_char1 = A14260LecFasDsc ;
      GXv_char4[0] = GXt_char1 ;
      new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A1171LecFasCod, GXv_char4) ;
      lector___impl.this.GXt_char1 = GXv_char4[0] ;
      A14260LecFasDsc = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14260LecFasDsc", A14260LecFasDsc);
      GXt_char1 = A14259lecOpeNom ;
      GXv_char4[0] = GXt_char1 ;
      new app.popenom(remoteHandle, context).execute( A396EmprCod, A1170LecOpeCod, GXv_char4) ;
      lector___impl.this.GXt_char1 = GXv_char4[0] ;
      A14259lecOpeNom = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14259lecOpeNom", A14259lecOpeNom);
      GXt_char1 = A13722LecEstado ;
      GXv_char4[0] = GXt_char1 ;
      new app.procedure4(remoteHandle, context).execute( A396EmprCod, A1167LecBarCod, A1168LecBarReo, A1169LecBarPar, A1188LecFasOrd, GXv_char4) ;
      lector___impl.this.GXt_char1 = GXv_char4[0] ;
      A13722LecEstado = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A13722LecEstado", A13722LecEstado);
   }

   public void checkExtendedTable1TV156( )
   {
      nIsDirty_156 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      nIsDirty_156 = (short)(1) ;
      A13721LecHdr = GXutil.str( A1167LecBarCod, 8, 0) + "-" + GXutil.str( A1168LecBarReo, 1, 0) + A1169LecBarPar ;
      httpContext.ajax_rsp_assign_attri("", false, "A13721LecHdr", A13721LecHdr);
      nIsDirty_156 = (short)(1) ;
      GXt_char1 = A14261LecParNom ;
      GXv_char4[0] = GXt_char1 ;
      new app.pparcodnom(remoteHandle, context).execute( A396EmprCod, A1172LecParCod, GXv_char4) ;
      lector___impl.this.GXt_char1 = GXv_char4[0] ;
      A14261LecParNom = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14261LecParNom", A14261LecParNom);
      nIsDirty_156 = (short)(1) ;
      GXt_char1 = A14260LecFasDsc ;
      GXv_char4[0] = GXt_char1 ;
      new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A1171LecFasCod, GXv_char4) ;
      lector___impl.this.GXt_char1 = GXv_char4[0] ;
      A14260LecFasDsc = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14260LecFasDsc", A14260LecFasDsc);
      nIsDirty_156 = (short)(1) ;
      GXt_char1 = A14259lecOpeNom ;
      GXv_char4[0] = GXt_char1 ;
      new app.popenom(remoteHandle, context).execute( A396EmprCod, A1170LecOpeCod, GXv_char4) ;
      lector___impl.this.GXt_char1 = GXv_char4[0] ;
      A14259lecOpeNom = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14259lecOpeNom", A14259lecOpeNom);
      nIsDirty_156 = (short)(1) ;
      GXt_char1 = A13722LecEstado ;
      GXv_char4[0] = GXt_char1 ;
      new app.procedure4(remoteHandle, context).execute( A396EmprCod, A1167LecBarCod, A1168LecBarReo, A1169LecBarPar, A1188LecFasOrd, GXv_char4) ;
      lector___impl.this.GXt_char1 = GXv_char4[0] ;
      A13722LecEstado = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A13722LecEstado", A13722LecEstado);
   }

   public void closeExtendedTableCursors1TV156( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1TV156( )
   {
      /* Using cursor T01TV6 */
      pr_default.execute(4, new Object[] {A396EmprCod, A1166LecMaqCod});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound156 = (short)(1) ;
      }
      else
      {
         RcdFound156 = (short)(0) ;
      }
      pr_default.close(4);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01TV3 */
      pr_default.execute(1, new Object[] {A396EmprCod, A1166LecMaqCod});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1TV156( 15) ;
         RcdFound156 = (short)(1) ;
         A1166LecMaqCod = T01TV3_A1166LecMaqCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1166LecMaqCod", A1166LecMaqCod);
         A1170LecOpeCod = T01TV3_A1170LecOpeCod[0] ;
         n1170LecOpeCod = T01TV3_n1170LecOpeCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1170LecOpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1170LecOpeCod), 6, 0));
         A1172LecParCod = T01TV3_A1172LecParCod[0] ;
         n1172LecParCod = T01TV3_n1172LecParCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1172LecParCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1172LecParCod), 4, 0));
         A1167LecBarCod = T01TV3_A1167LecBarCod[0] ;
         n1167LecBarCod = T01TV3_n1167LecBarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1167LecBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1167LecBarCod), 8, 0));
         A1168LecBarReo = T01TV3_A1168LecBarReo[0] ;
         n1168LecBarReo = T01TV3_n1168LecBarReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1168LecBarReo", GXutil.str( A1168LecBarReo, 1, 0));
         A1169LecBarPar = T01TV3_A1169LecBarPar[0] ;
         n1169LecBarPar = T01TV3_n1169LecBarPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1169LecBarPar", A1169LecBarPar);
         A1171LecFasCod = T01TV3_A1171LecFasCod[0] ;
         n1171LecFasCod = T01TV3_n1171LecFasCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1171LecFasCod", A1171LecFasCod);
         A1188LecFasOrd = T01TV3_A1188LecFasOrd[0] ;
         n1188LecFasOrd = T01TV3_n1188LecFasOrd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1188LecFasOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1188LecFasOrd), 4, 0));
         A1173LecHor = T01TV3_A1173LecHor[0] ;
         n1173LecHor = T01TV3_n1173LecHor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1173LecHor", A1173LecHor);
         A1174LecFec = T01TV3_A1174LecFec[0] ;
         n1174LecFec = T01TV3_n1174LecFec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1174LecFec", localUtil.format(A1174LecFec, "99/99/99"));
         A1796LecTipEnt = T01TV3_A1796LecTipEnt[0] ;
         n1796LecTipEnt = T01TV3_n1796LecTipEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1796LecTipEnt", A1796LecTipEnt);
         A4702LecNumLot = T01TV3_A4702LecNumLot[0] ;
         n4702LecNumLot = T01TV3_n4702LecNumLot[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4702LecNumLot", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4702LecNumLot), 6, 0));
         A4703LecRecLinM = T01TV3_A4703LecRecLinM[0] ;
         n4703LecRecLinM = T01TV3_n4703LecRecLinM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4703LecRecLinM", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4703LecRecLinM), 4, 0));
         A4345LecCombin = T01TV3_A4345LecCombin[0] ;
         n4345LecCombin = T01TV3_n4345LecCombin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4345LecCombin", A4345LecCombin);
         A6832LecCnc = T01TV3_A6832LecCnc[0] ;
         n6832LecCnc = T01TV3_n6832LecCnc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6832LecCnc", GXutil.str( A6832LecCnc, 1, 0));
         A396EmprCod = T01TV3_A396EmprCod[0] ;
         Z396EmprCod = A396EmprCod ;
         Z1166LecMaqCod = A1166LecMaqCod ;
         sMode156 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1TV156( ) ;
         if ( AnyError == 1 )
         {
            RcdFound156 = (short)(0) ;
            initializeNonKey1TV156( ) ;
         }
         Gx_mode = sMode156 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound156 = (short)(0) ;
         initializeNonKey1TV156( ) ;
         sMode156 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode156 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1TV156( ) ;
      if ( RcdFound156 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound156 = (short)(0) ;
      /* Using cursor T01TV7 */
      pr_default.execute(5, new Object[] {A396EmprCod, A396EmprCod, A1166LecMaqCod});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( ( GXutil.strcmp(T01TV7_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01TV7_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01TV7_A1166LecMaqCod[0], A1166LecMaqCod) < 0 ) ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( ( GXutil.strcmp(T01TV7_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01TV7_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01TV7_A1166LecMaqCod[0], A1166LecMaqCod) > 0 ) ) )
         {
            A396EmprCod = T01TV7_A396EmprCod[0] ;
            A1166LecMaqCod = T01TV7_A1166LecMaqCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A1166LecMaqCod", A1166LecMaqCod);
            RcdFound156 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void move_previous( )
   {
      RcdFound156 = (short)(0) ;
      /* Using cursor T01TV8 */
      pr_default.execute(6, new Object[] {A396EmprCod, A396EmprCod, A1166LecMaqCod});
      if ( (pr_default.getStatus(6) != 101) )
      {
         while ( (pr_default.getStatus(6) != 101) && ( ( GXutil.strcmp(T01TV8_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01TV8_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01TV8_A1166LecMaqCod[0], A1166LecMaqCod) > 0 ) ) )
         {
            pr_default.readNext(6);
         }
         if ( (pr_default.getStatus(6) != 101) && ( ( GXutil.strcmp(T01TV8_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01TV8_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01TV8_A1166LecMaqCod[0], A1166LecMaqCod) < 0 ) ) )
         {
            A396EmprCod = T01TV8_A396EmprCod[0] ;
            A1166LecMaqCod = T01TV8_A1166LecMaqCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A1166LecMaqCod", A1166LecMaqCod);
            RcdFound156 = (short)(1) ;
         }
      }
      pr_default.close(6);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1TV156( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtLecMaqCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1TV156( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound156 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A1166LecMaqCod, Z1166LecMaqCod) != 0 ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A1166LecMaqCod = Z1166LecMaqCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A1166LecMaqCod", A1166LecMaqCod);
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "LECMAQCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtLecMaqCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtLecMaqCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               update1TV156( ) ;
               GX_FocusControl = edtLecMaqCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A1166LecMaqCod, Z1166LecMaqCod) != 0 ) )
            {
               /* Insert record */
               GX_FocusControl = edtLecMaqCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1TV156( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "LECMAQCOD");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtLecMaqCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  /* Insert record */
                  GX_FocusControl = edtLecMaqCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1TV156( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A1166LecMaqCod, Z1166LecMaqCod) != 0 ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A1166LecMaqCod = Z1166LecMaqCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A1166LecMaqCod", A1166LecMaqCod);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "LECMAQCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtLecMaqCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtLecMaqCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency1TV156( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01TV2 */
         pr_default.execute(0, new Object[] {A396EmprCod, A1166LecMaqCod});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLECTOR"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( Z1170LecOpeCod != T01TV2_A1170LecOpeCod[0] ) || ( Z1172LecParCod != T01TV2_A1172LecParCod[0] ) || ( Z1167LecBarCod != T01TV2_A1167LecBarCod[0] ) || ( Z1168LecBarReo != T01TV2_A1168LecBarReo[0] ) || ( GXutil.strcmp(Z1169LecBarPar, T01TV2_A1169LecBarPar[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z1171LecFasCod, T01TV2_A1171LecFasCod[0]) != 0 ) || ( Z1188LecFasOrd != T01TV2_A1188LecFasOrd[0] ) || ( GXutil.strcmp(Z1173LecHor, T01TV2_A1173LecHor[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z1174LecFec), GXutil.resetTime(T01TV2_A1174LecFec[0])) ) || ( GXutil.strcmp(Z1796LecTipEnt, T01TV2_A1796LecTipEnt[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z4702LecNumLot != T01TV2_A4702LecNumLot[0] ) || ( Z4703LecRecLinM != T01TV2_A4703LecRecLinM[0] ) || ( GXutil.strcmp(Z4345LecCombin, T01TV2_A4345LecCombin[0]) != 0 ) || ( Z6832LecCnc != T01TV2_A6832LecCnc[0] ) )
         {
            if ( Z1170LecOpeCod != T01TV2_A1170LecOpeCod[0] )
            {
               GXutil.writeLogln("lectoroptico.lector__:[seudo value changed for attri]"+"LecOpeCod");
               GXutil.writeLogRaw("Old: ",Z1170LecOpeCod);
               GXutil.writeLogRaw("Current: ",T01TV2_A1170LecOpeCod[0]);
            }
            if ( Z1172LecParCod != T01TV2_A1172LecParCod[0] )
            {
               GXutil.writeLogln("lectoroptico.lector__:[seudo value changed for attri]"+"LecParCod");
               GXutil.writeLogRaw("Old: ",Z1172LecParCod);
               GXutil.writeLogRaw("Current: ",T01TV2_A1172LecParCod[0]);
            }
            if ( Z1167LecBarCod != T01TV2_A1167LecBarCod[0] )
            {
               GXutil.writeLogln("lectoroptico.lector__:[seudo value changed for attri]"+"LecBarCod");
               GXutil.writeLogRaw("Old: ",Z1167LecBarCod);
               GXutil.writeLogRaw("Current: ",T01TV2_A1167LecBarCod[0]);
            }
            if ( Z1168LecBarReo != T01TV2_A1168LecBarReo[0] )
            {
               GXutil.writeLogln("lectoroptico.lector__:[seudo value changed for attri]"+"LecBarReo");
               GXutil.writeLogRaw("Old: ",Z1168LecBarReo);
               GXutil.writeLogRaw("Current: ",T01TV2_A1168LecBarReo[0]);
            }
            if ( GXutil.strcmp(Z1169LecBarPar, T01TV2_A1169LecBarPar[0]) != 0 )
            {
               GXutil.writeLogln("lectoroptico.lector__:[seudo value changed for attri]"+"LecBarPar");
               GXutil.writeLogRaw("Old: ",Z1169LecBarPar);
               GXutil.writeLogRaw("Current: ",T01TV2_A1169LecBarPar[0]);
            }
            if ( GXutil.strcmp(Z1171LecFasCod, T01TV2_A1171LecFasCod[0]) != 0 )
            {
               GXutil.writeLogln("lectoroptico.lector__:[seudo value changed for attri]"+"LecFasCod");
               GXutil.writeLogRaw("Old: ",Z1171LecFasCod);
               GXutil.writeLogRaw("Current: ",T01TV2_A1171LecFasCod[0]);
            }
            if ( Z1188LecFasOrd != T01TV2_A1188LecFasOrd[0] )
            {
               GXutil.writeLogln("lectoroptico.lector__:[seudo value changed for attri]"+"LecFasOrd");
               GXutil.writeLogRaw("Old: ",Z1188LecFasOrd);
               GXutil.writeLogRaw("Current: ",T01TV2_A1188LecFasOrd[0]);
            }
            if ( GXutil.strcmp(Z1173LecHor, T01TV2_A1173LecHor[0]) != 0 )
            {
               GXutil.writeLogln("lectoroptico.lector__:[seudo value changed for attri]"+"LecHor");
               GXutil.writeLogRaw("Old: ",Z1173LecHor);
               GXutil.writeLogRaw("Current: ",T01TV2_A1173LecHor[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z1174LecFec), GXutil.resetTime(T01TV2_A1174LecFec[0])) ) )
            {
               GXutil.writeLogln("lectoroptico.lector__:[seudo value changed for attri]"+"LecFec");
               GXutil.writeLogRaw("Old: ",Z1174LecFec);
               GXutil.writeLogRaw("Current: ",T01TV2_A1174LecFec[0]);
            }
            if ( GXutil.strcmp(Z1796LecTipEnt, T01TV2_A1796LecTipEnt[0]) != 0 )
            {
               GXutil.writeLogln("lectoroptico.lector__:[seudo value changed for attri]"+"LecTipEnt");
               GXutil.writeLogRaw("Old: ",Z1796LecTipEnt);
               GXutil.writeLogRaw("Current: ",T01TV2_A1796LecTipEnt[0]);
            }
            if ( Z4702LecNumLot != T01TV2_A4702LecNumLot[0] )
            {
               GXutil.writeLogln("lectoroptico.lector__:[seudo value changed for attri]"+"LecNumLot");
               GXutil.writeLogRaw("Old: ",Z4702LecNumLot);
               GXutil.writeLogRaw("Current: ",T01TV2_A4702LecNumLot[0]);
            }
            if ( Z4703LecRecLinM != T01TV2_A4703LecRecLinM[0] )
            {
               GXutil.writeLogln("lectoroptico.lector__:[seudo value changed for attri]"+"LecRecLinM");
               GXutil.writeLogRaw("Old: ",Z4703LecRecLinM);
               GXutil.writeLogRaw("Current: ",T01TV2_A4703LecRecLinM[0]);
            }
            if ( GXutil.strcmp(Z4345LecCombin, T01TV2_A4345LecCombin[0]) != 0 )
            {
               GXutil.writeLogln("lectoroptico.lector__:[seudo value changed for attri]"+"LecCombin");
               GXutil.writeLogRaw("Old: ",Z4345LecCombin);
               GXutil.writeLogRaw("Current: ",T01TV2_A4345LecCombin[0]);
            }
            if ( Z6832LecCnc != T01TV2_A6832LecCnc[0] )
            {
               GXutil.writeLogln("lectoroptico.lector__:[seudo value changed for attri]"+"LecCnc");
               GXutil.writeLogRaw("Old: ",Z6832LecCnc);
               GXutil.writeLogRaw("Current: ",T01TV2_A6832LecCnc[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPLECTOR"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1TV156( )
   {
      beforeValidate1TV156( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1TV156( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1TV156( 0) ;
         checkOptimisticConcurrency1TV156( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1TV156( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1TV156( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01TV9 */
                  pr_default.execute(7, new Object[] {A1166LecMaqCod, Boolean.valueOf(n1170LecOpeCod), Integer.valueOf(A1170LecOpeCod), Boolean.valueOf(n1172LecParCod), Short.valueOf(A1172LecParCod), Boolean.valueOf(n1167LecBarCod), Integer.valueOf(A1167LecBarCod), Boolean.valueOf(n1168LecBarReo), Byte.valueOf(A1168LecBarReo), Boolean.valueOf(n1169LecBarPar), A1169LecBarPar, Boolean.valueOf(n1171LecFasCod), A1171LecFasCod, Boolean.valueOf(n1188LecFasOrd), Short.valueOf(A1188LecFasOrd), Boolean.valueOf(n1173LecHor), A1173LecHor, Boolean.valueOf(n1174LecFec), A1174LecFec, Boolean.valueOf(n1796LecTipEnt), A1796LecTipEnt, Boolean.valueOf(n4702LecNumLot), Integer.valueOf(A4702LecNumLot), Boolean.valueOf(n4703LecRecLinM), Short.valueOf(A4703LecRecLinM), Boolean.valueOf(n4345LecCombin), A4345LecCombin, Boolean.valueOf(n6832LecCnc), Byte.valueOf(A6832LecCnc), A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLECTOR");
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
                        resetCaption1TV0( ) ;
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
            load1TV156( ) ;
         }
         endLevel1TV156( ) ;
      }
      closeExtendedTableCursors1TV156( ) ;
   }

   public void update1TV156( )
   {
      beforeValidate1TV156( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1TV156( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1TV156( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1TV156( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1TV156( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01TV10 */
                  pr_default.execute(8, new Object[] {Boolean.valueOf(n1170LecOpeCod), Integer.valueOf(A1170LecOpeCod), Boolean.valueOf(n1172LecParCod), Short.valueOf(A1172LecParCod), Boolean.valueOf(n1167LecBarCod), Integer.valueOf(A1167LecBarCod), Boolean.valueOf(n1168LecBarReo), Byte.valueOf(A1168LecBarReo), Boolean.valueOf(n1169LecBarPar), A1169LecBarPar, Boolean.valueOf(n1171LecFasCod), A1171LecFasCod, Boolean.valueOf(n1188LecFasOrd), Short.valueOf(A1188LecFasOrd), Boolean.valueOf(n1173LecHor), A1173LecHor, Boolean.valueOf(n1174LecFec), A1174LecFec, Boolean.valueOf(n1796LecTipEnt), A1796LecTipEnt, Boolean.valueOf(n4702LecNumLot), Integer.valueOf(A4702LecNumLot), Boolean.valueOf(n4703LecRecLinM), Short.valueOf(A4703LecRecLinM), Boolean.valueOf(n4345LecCombin), A4345LecCombin, Boolean.valueOf(n6832LecCnc), Byte.valueOf(A6832LecCnc), A396EmprCod, A1166LecMaqCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLECTOR");
                  if ( (pr_default.getStatus(8) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLECTOR"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1TV156( ) ;
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
         endLevel1TV156( ) ;
      }
      closeExtendedTableCursors1TV156( ) ;
   }

   public void deferredUpdate1TV156( )
   {
   }

   public void delete( )
   {
      beforeValidate1TV156( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1TV156( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1TV156( ) ;
         afterConfirm1TV156( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1TV156( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01TV11 */
               pr_default.execute(9, new Object[] {A396EmprCod, A1166LecMaqCod});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLECTOR");
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
      sMode156 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1TV156( ) ;
      Gx_mode = sMode156 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1TV156( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         A13721LecHdr = GXutil.str( A1167LecBarCod, 8, 0) + "-" + GXutil.str( A1168LecBarReo, 1, 0) + A1169LecBarPar ;
         httpContext.ajax_rsp_assign_attri("", false, "A13721LecHdr", A13721LecHdr);
         GXt_char1 = A14261LecParNom ;
         GXv_char4[0] = GXt_char1 ;
         new app.pparcodnom(remoteHandle, context).execute( A396EmprCod, A1172LecParCod, GXv_char4) ;
         lector___impl.this.GXt_char1 = GXv_char4[0] ;
         A14261LecParNom = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "A14261LecParNom", A14261LecParNom);
         GXt_char1 = A14260LecFasDsc ;
         GXv_char4[0] = GXt_char1 ;
         new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A1171LecFasCod, GXv_char4) ;
         lector___impl.this.GXt_char1 = GXv_char4[0] ;
         A14260LecFasDsc = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "A14260LecFasDsc", A14260LecFasDsc);
         GXt_char1 = A14259lecOpeNom ;
         GXv_char4[0] = GXt_char1 ;
         new app.popenom(remoteHandle, context).execute( A396EmprCod, A1170LecOpeCod, GXv_char4) ;
         lector___impl.this.GXt_char1 = GXv_char4[0] ;
         A14259lecOpeNom = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "A14259lecOpeNom", A14259lecOpeNom);
         GXt_char1 = A13722LecEstado ;
         GXv_char4[0] = GXt_char1 ;
         new app.procedure4(remoteHandle, context).execute( A396EmprCod, A1167LecBarCod, A1168LecBarReo, A1169LecBarPar, A1188LecFasOrd, GXv_char4) ;
         lector___impl.this.GXt_char1 = GXv_char4[0] ;
         A13722LecEstado = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "A13722LecEstado", A13722LecEstado);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T01TV12 */
         pr_default.execute(10, new Object[] {A396EmprCod, A1166LecMaqCod});
         if ( (pr_default.getStatus(10) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LECLAV", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(10);
      }
   }

   public void endLevel1TV156( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1TV156( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "lectoroptico.lector__");
         if ( AnyError == 0 )
         {
            confirmValues1TV0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "lectoroptico.lector__");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1TV156( )
   {
      /* Scan By routine */
      /* Using cursor T01TV13 */
      pr_default.execute(11);
      RcdFound156 = (short)(0) ;
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound156 = (short)(1) ;
         A396EmprCod = T01TV13_A396EmprCod[0] ;
         A1166LecMaqCod = T01TV13_A1166LecMaqCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1166LecMaqCod", A1166LecMaqCod);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1TV156( )
   {
      /* Scan next routine */
      pr_default.readNext(11);
      RcdFound156 = (short)(0) ;
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound156 = (short)(1) ;
         A396EmprCod = T01TV13_A396EmprCod[0] ;
         A1166LecMaqCod = T01TV13_A1166LecMaqCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1166LecMaqCod", A1166LecMaqCod);
      }
   }

   public void scanEnd1TV156( )
   {
      pr_default.close(11);
   }

   public void afterConfirm1TV156( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1TV156( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1TV156( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1TV156( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1TV156( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1TV156( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1TV156( )
   {
      edtLecMaqCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLecMaqCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLecMaqCod_Enabled), 5, 0), true);
      cmbLecTipEnt.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbLecTipEnt.getInternalname(), "Enabled", GXutil.ltrimstr( cmbLecTipEnt.getEnabled(), 5, 0), true);
      edtLecBarCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLecBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLecBarCod_Enabled), 5, 0), true);
      edtLecBarReo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLecBarReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLecBarReo_Enabled), 5, 0), true);
      edtLecBarPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLecBarPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLecBarPar_Enabled), 5, 0), true);
      edtLecFasOrd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLecFasOrd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLecFasOrd_Enabled), 5, 0), true);
      edtLecFasCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLecFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLecFasCod_Enabled), 5, 0), true);
      edtLecFasDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLecFasDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLecFasDsc_Enabled), 5, 0), true);
      edtLecNumLot_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLecNumLot_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLecNumLot_Enabled), 5, 0), true);
      edtLecRecLinM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLecRecLinM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLecRecLinM_Enabled), 5, 0), true);
      edtLecOpeCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLecOpeCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLecOpeCod_Enabled), 5, 0), true);
      edtLecParCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLecParCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLecParCod_Enabled), 5, 0), true);
      edtLecFec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLecFec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLecFec_Enabled), 5, 0), true);
      edtLecHor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLecHor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLecHor_Enabled), 5, 0), true);
      edtLecCombin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLecCombin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLecCombin_Enabled), 5, 0), true);
      chkLecCnc.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkLecCnc.getInternalname(), "Enabled", GXutil.ltrimstr( chkLecCnc.getEnabled(), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      edtavCombolecmaqcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCombolecmaqcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombolecmaqcod_Enabled), 5, 0), true);
      edtavCombolecopecod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCombolecopecod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombolecopecod_Enabled), 5, 0), true);
      edtavCombolecparcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCombolecparcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombolecparcod_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1TV156( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1TV0( )
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.lectoroptico.lector__", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV7EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV8LecMaqCod))}, new String[] {"Gx_mode","EmprCod","LecMaqCod"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"Lector__");
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("lectoroptico\\lector__:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1166LecMaqCod", GXutil.rtrim( Z1166LecMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1170LecOpeCod", GXutil.ltrim( localUtil.ntoc( Z1170LecOpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1172LecParCod", GXutil.ltrim( localUtil.ntoc( Z1172LecParCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1167LecBarCod", GXutil.ltrim( localUtil.ntoc( Z1167LecBarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1168LecBarReo", GXutil.ltrim( localUtil.ntoc( Z1168LecBarReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1169LecBarPar", GXutil.rtrim( Z1169LecBarPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1171LecFasCod", GXutil.rtrim( Z1171LecFasCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1188LecFasOrd", GXutil.ltrim( localUtil.ntoc( Z1188LecFasOrd, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1173LecHor", GXutil.rtrim( Z1173LecHor));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1174LecFec", localUtil.dtoc( Z1174LecFec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1796LecTipEnt", GXutil.rtrim( Z1796LecTipEnt));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4702LecNumLot", GXutil.ltrim( localUtil.ntoc( Z4702LecNumLot, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4703LecRecLinM", GXutil.ltrim( localUtil.ntoc( Z4703LecRecLinM, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4345LecCombin", GXutil.rtrim( Z4345LecCombin));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6832LecCnc", GXutil.ltrim( localUtil.ntoc( Z6832LecCnc, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vLECMAQCOD_DATA", AV22LecMaqCod_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vLECMAQCOD_DATA", AV22LecMaqCod_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vLECOPECOD_DATA", AV15LecOpeCod_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vLECOPECOD_DATA", AV15LecOpeCod_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vLECPARCOD_DATA", AV18LecParCod_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vLECPARCOD_DATA", AV18LecParCod_Data);
      }
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
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "LECPARNOM", GXutil.rtrim( A14261LecParNom));
      app.GxWebStd.gx_hidden_field( httpContext, "LECOPENOM", GXutil.rtrim( A14259lecOpeNom));
      app.GxWebStd.gx_hidden_field( httpContext, "LECESTADO", GXutil.rtrim( A13722LecEstado));
      app.GxWebStd.gx_hidden_field( httpContext, "LECHDR", GXutil.rtrim( A13721LecHdr));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV7EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vLECMAQCOD", GXutil.rtrim( AV8LecMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vLECMAQCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV8LecMaqCod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRNOM", GXutil.rtrim( A407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_LECMAQCOD_Objectcall", GXutil.rtrim( Combo_lecmaqcod_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_LECMAQCOD_Cls", GXutil.rtrim( Combo_lecmaqcod_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_LECMAQCOD_Selectedvalue_set", GXutil.rtrim( Combo_lecmaqcod_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_LECMAQCOD_Enabled", GXutil.booltostr( Combo_lecmaqcod_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_LECMAQCOD_Emptyitem", GXutil.booltostr( Combo_lecmaqcod_Emptyitem));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_LECOPECOD_Objectcall", GXutil.rtrim( Combo_lecopecod_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_LECOPECOD_Cls", GXutil.rtrim( Combo_lecopecod_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_LECOPECOD_Selectedvalue_set", GXutil.rtrim( Combo_lecopecod_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_LECOPECOD_Enabled", GXutil.booltostr( Combo_lecopecod_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_LECOPECOD_Emptyitem", GXutil.booltostr( Combo_lecopecod_Emptyitem));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_LECPARCOD_Objectcall", GXutil.rtrim( Combo_lecparcod_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_LECPARCOD_Cls", GXutil.rtrim( Combo_lecparcod_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_LECPARCOD_Selectedvalue_set", GXutil.rtrim( Combo_lecparcod_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_LECPARCOD_Enabled", GXutil.booltostr( Combo_lecparcod_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_LECPARCOD_Emptyitemtext", GXutil.rtrim( Combo_lecparcod_Emptyitemtext));
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
      return formatLink("app.lectoroptico.lector__", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV7EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV8LecMaqCod))}, new String[] {"Gx_mode","EmprCod","LecMaqCod"})  ;
   }

   public String getPgmname( )
   {
      return "LectorOptico.Lector__" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Mantenimiento Tabla LECTOR", "") ;
   }

   public void initializeNonKey1TV156( )
   {
      A1170LecOpeCod = 0 ;
      n1170LecOpeCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1170LecOpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1170LecOpeCod), 6, 0));
      A1172LecParCod = (short)(0) ;
      n1172LecParCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1172LecParCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1172LecParCod), 4, 0));
      A13721LecHdr = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13721LecHdr", A13721LecHdr);
      A13722LecEstado = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13722LecEstado", A13722LecEstado);
      A14259lecOpeNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14259lecOpeNom", A14259lecOpeNom);
      A14260LecFasDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14260LecFasDsc", A14260LecFasDsc);
      A14261LecParNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14261LecParNom", A14261LecParNom);
      A1167LecBarCod = 0 ;
      n1167LecBarCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1167LecBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1167LecBarCod), 8, 0));
      A1168LecBarReo = (byte)(0) ;
      n1168LecBarReo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1168LecBarReo", GXutil.str( A1168LecBarReo, 1, 0));
      A1169LecBarPar = "" ;
      n1169LecBarPar = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1169LecBarPar", A1169LecBarPar);
      A1171LecFasCod = "" ;
      n1171LecFasCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1171LecFasCod", A1171LecFasCod);
      A1188LecFasOrd = (short)(0) ;
      n1188LecFasOrd = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1188LecFasOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1188LecFasOrd), 4, 0));
      A1173LecHor = "" ;
      n1173LecHor = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1173LecHor", A1173LecHor);
      A1174LecFec = GXutil.nullDate() ;
      n1174LecFec = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1174LecFec", localUtil.format(A1174LecFec, "99/99/99"));
      A1796LecTipEnt = "" ;
      n1796LecTipEnt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1796LecTipEnt", A1796LecTipEnt);
      A4702LecNumLot = 0 ;
      n4702LecNumLot = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4702LecNumLot", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4702LecNumLot), 6, 0));
      A4703LecRecLinM = (short)(0) ;
      n4703LecRecLinM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4703LecRecLinM", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4703LecRecLinM), 4, 0));
      A4345LecCombin = "" ;
      n4345LecCombin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4345LecCombin", A4345LecCombin);
      A6832LecCnc = (byte)(0) ;
      n6832LecCnc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6832LecCnc", GXutil.str( A6832LecCnc, 1, 0));
      Z1170LecOpeCod = 0 ;
      Z1172LecParCod = (short)(0) ;
      Z1167LecBarCod = 0 ;
      Z1168LecBarReo = (byte)(0) ;
      Z1169LecBarPar = "" ;
      Z1171LecFasCod = "" ;
      Z1188LecFasOrd = (short)(0) ;
      Z1173LecHor = "" ;
      Z1174LecFec = GXutil.nullDate() ;
      Z1796LecTipEnt = "" ;
      Z4702LecNumLot = 0 ;
      Z4703LecRecLinM = (short)(0) ;
      Z4345LecCombin = "" ;
      Z6832LecCnc = (byte)(0) ;
   }

   public void initAll1TV156( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A1166LecMaqCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A1166LecMaqCod", A1166LecMaqCod);
      initializeNonKey1TV156( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116101651", true, true);
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
      httpContext.AddJavascriptSource("lectoroptico/lector__.js", "?202682116101651", false, true);
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
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      lblTextblocklecmaqcod_Internalname = "TEXTBLOCKLECMAQCOD" ;
      Combo_lecmaqcod_Internalname = "COMBO_LECMAQCOD" ;
      edtLecMaqCod_Internalname = "LECMAQCOD" ;
      divTablesplittedlecmaqcod_Internalname = "TABLESPLITTEDLECMAQCOD" ;
      cmbLecTipEnt.setInternalname( "LECTIPENT" );
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      edtLecBarCod_Internalname = "LECBARCOD" ;
      edtLecBarReo_Internalname = "LECBARREO" ;
      edtLecBarPar_Internalname = "LECBARPAR" ;
      imgavPrompthdr_Internalname = "vPROMPTHDR" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      edtLecFasOrd_Internalname = "LECFASORD" ;
      imgavPromptorden_Internalname = "vPROMPTORDEN" ;
      edtLecFasCod_Internalname = "LECFASCOD" ;
      edtLecFasDsc_Internalname = "LECFASDSC" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      edtLecNumLot_Internalname = "LECNUMLOT" ;
      edtLecRecLinM_Internalname = "LECRECLINM" ;
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      lblTextblocklecopecod_Internalname = "TEXTBLOCKLECOPECOD" ;
      Combo_lecopecod_Internalname = "COMBO_LECOPECOD" ;
      edtLecOpeCod_Internalname = "LECOPECOD" ;
      divTablesplittedlecopecod_Internalname = "TABLESPLITTEDLECOPECOD" ;
      lblTextblocklecparcod_Internalname = "TEXTBLOCKLECPARCOD" ;
      Combo_lecparcod_Internalname = "COMBO_LECPARCOD" ;
      edtLecParCod_Internalname = "LECPARCOD" ;
      divTablesplittedlecparcod_Internalname = "TABLESPLITTEDLECPARCOD" ;
      divUnnamedtable5_Internalname = "UNNAMEDTABLE5" ;
      edtLecFec_Internalname = "LECFEC" ;
      edtLecHor_Internalname = "LECHOR" ;
      divUnnamedtable6_Internalname = "UNNAMEDTABLE6" ;
      edtLecCombin_Internalname = "LECCOMBIN" ;
      divLeccombin_cell_Internalname = "LECCOMBIN_CELL" ;
      chkLecCnc.setInternalname( "LECCNC" );
      divUnnamedtable7_Internalname = "UNNAMEDTABLE7" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      bttBtntrn_delete_Internalname = "BTNTRN_DELETE" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtavCombolecmaqcod_Internalname = "vCOMBOLECMAQCOD" ;
      divSectionattribute_lecmaqcod_Internalname = "SECTIONATTRIBUTE_LECMAQCOD" ;
      edtavCombolecopecod_Internalname = "vCOMBOLECOPECOD" ;
      divSectionattribute_lecopecod_Internalname = "SECTIONATTRIBUTE_LECOPECOD" ;
      edtavCombolecparcod_Internalname = "vCOMBOLECPARCOD" ;
      divSectionattribute_lecparcod_Internalname = "SECTIONATTRIBUTE_LECPARCOD" ;
      divHtml_bottomauxiliarcontrols_Internalname = "HTML_BOTTOMAUXILIARCONTROLS" ;
      divLayoutmaintable_Internalname = "LAYOUTMAINTABLE" ;
      Form.setInternalname( "FORM" );
      imgprompt_1171_Internalname = "PROMPT_1171" ;
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
      Form.setCaption( httpContext.getMessage( "Mantenimiento Tabla LECTOR", "") );
      edtavCombolecparcod_Jsonclick = "" ;
      edtavCombolecparcod_Enabled = 0 ;
      edtavCombolecparcod_Visible = 1 ;
      edtavCombolecopecod_Jsonclick = "" ;
      edtavCombolecopecod_Enabled = 0 ;
      edtavCombolecopecod_Visible = 1 ;
      edtavCombolecmaqcod_Jsonclick = "" ;
      edtavCombolecmaqcod_Enabled = 0 ;
      edtavCombolecmaqcod_Visible = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      bttBtntrn_delete_Enabled = 0 ;
      bttBtntrn_delete_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      chkLecCnc.setEnabled( 1 );
      edtLecCombin_Jsonclick = "" ;
      edtLecCombin_Enabled = 1 ;
      edtLecCombin_Visible = 1 ;
      divLeccombin_cell_Class = "col-xs-12 col-sm-2" ;
      edtLecHor_Jsonclick = "" ;
      edtLecHor_Enabled = 1 ;
      edtLecFec_Jsonclick = "" ;
      edtLecFec_Enabled = 1 ;
      edtLecParCod_Jsonclick = "" ;
      edtLecParCod_Enabled = 1 ;
      edtLecParCod_Visible = 1 ;
      Combo_lecparcod_Emptyitemtext = "" ;
      Combo_lecparcod_Cls = "ExtendedCombo AttributeFL" ;
      Combo_lecparcod_Enabled = GXutil.toBoolean( -1) ;
      edtLecOpeCod_Jsonclick = "" ;
      edtLecOpeCod_Enabled = 1 ;
      edtLecOpeCod_Visible = 1 ;
      Combo_lecopecod_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_lecopecod_Cls = "ExtendedCombo AttributeFL" ;
      Combo_lecopecod_Enabled = GXutil.toBoolean( -1) ;
      edtLecRecLinM_Jsonclick = "" ;
      edtLecRecLinM_Enabled = 1 ;
      edtLecNumLot_Jsonclick = "" ;
      edtLecNumLot_Enabled = 1 ;
      edtLecFasDsc_Jsonclick = "" ;
      edtLecFasDsc_Enabled = 0 ;
      imgprompt_1171_Visible = 1 ;
      imgprompt_1171_Link = "" ;
      edtLecFasCod_Jsonclick = "" ;
      edtLecFasCod_Enabled = 1 ;
      imgavPromptorden_Jsonclick = "" ;
      imgavPromptorden_gximage = "" ;
      imgavPromptorden_Enabled = 1 ;
      imgavPromptorden_Visible = 1 ;
      edtLecFasOrd_Jsonclick = "" ;
      edtLecFasOrd_Enabled = 1 ;
      imgavPrompthdr_Jsonclick = "" ;
      imgavPrompthdr_gximage = "" ;
      imgavPrompthdr_Enabled = 1 ;
      imgavPrompthdr_Visible = 1 ;
      edtLecBarPar_Jsonclick = "" ;
      edtLecBarPar_Enabled = 1 ;
      edtLecBarReo_Jsonclick = "" ;
      edtLecBarReo_Enabled = 1 ;
      edtLecBarCod_Jsonclick = "" ;
      edtLecBarCod_Enabled = 1 ;
      cmbLecTipEnt.setJsonclick( "" );
      cmbLecTipEnt.setEnabled( 1 );
      edtLecMaqCod_Jsonclick = "" ;
      edtLecMaqCod_Enabled = 1 ;
      edtLecMaqCod_Visible = 1 ;
      Combo_lecmaqcod_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_lecmaqcod_Cls = "ExtendedCombo AttributeFL" ;
      Combo_lecmaqcod_Enabled = GXutil.toBoolean( -1) ;
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

   public void gx1asalecparnom1TV156( String A396EmprCod ,
                                      short A1172LecParCod )
   {
      GXt_char1 = A14261LecParNom ;
      GXv_char4[0] = GXt_char1 ;
      new app.pparcodnom(remoteHandle, context).execute( A396EmprCod, A1172LecParCod, GXv_char4) ;
      lector___impl.this.GXt_char1 = GXv_char4[0] ;
      A14261LecParNom = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14261LecParNom", A14261LecParNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A14261LecParNom))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gx2asalecfasdsc1TV156( String A396EmprCod ,
                                      String A1171LecFasCod )
   {
      GXt_char1 = A14260LecFasDsc ;
      GXv_char4[0] = GXt_char1 ;
      new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A1171LecFasCod, GXv_char4) ;
      lector___impl.this.GXt_char1 = GXv_char4[0] ;
      A14260LecFasDsc = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14260LecFasDsc", A14260LecFasDsc);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A14260LecFasDsc))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gx3asalecopenom1TV156( String A396EmprCod ,
                                      int A1170LecOpeCod )
   {
      GXt_char1 = A14259lecOpeNom ;
      GXv_char4[0] = GXt_char1 ;
      new app.popenom(remoteHandle, context).execute( A396EmprCod, A1170LecOpeCod, GXv_char4) ;
      lector___impl.this.GXt_char1 = GXv_char4[0] ;
      A14259lecOpeNom = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14259lecOpeNom", A14259lecOpeNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A14259lecOpeNom))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gx4asalecestado1TV156( String A396EmprCod ,
                                      int A1167LecBarCod ,
                                      byte A1168LecBarReo ,
                                      String A1169LecBarPar ,
                                      short A1188LecFasOrd )
   {
      GXt_char1 = A13722LecEstado ;
      GXv_char4[0] = GXt_char1 ;
      new app.procedure4(remoteHandle, context).execute( A396EmprCod, A1167LecBarCod, A1168LecBarReo, A1169LecBarPar, A1188LecFasOrd, GXv_char4) ;
      lector___impl.this.GXt_char1 = GXv_char4[0] ;
      A13722LecEstado = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A13722LecEstado", A13722LecEstado);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A13722LecEstado))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gxasa43451TV156( String AV7EmprCod )
   {
      GXt_int8 = (byte)(0) ;
      GXv_int9[0] = GXt_int8 ;
      new app.pexicon(remoteHandle, context).execute( AV7EmprCod, httpContext.getMessage( httpContext.getMessage( "TINEST", ""), ""), GXv_int9) ;
      lector___impl.this.GXt_int8 = GXv_int9[0] ;
      edtLecCombin_Visible = ((GXt_int8==1) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtLecCombin_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLecCombin_Visible), 5, 0), true);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
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
      cmbLecTipEnt.setName( "LECTIPENT" );
      cmbLecTipEnt.setWebtags( "" );
      cmbLecTipEnt.addItem("G", httpContext.getMessage( "Grupo", ""), (short)(0));
      cmbLecTipEnt.addItem("H", httpContext.getMessage( "Individual", ""), (short)(0));
      if ( cmbLecTipEnt.getItemCount() > 0 )
      {
         A1796LecTipEnt = cmbLecTipEnt.getValidValue(A1796LecTipEnt) ;
         n1796LecTipEnt = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1796LecTipEnt", A1796LecTipEnt);
      }
      chkLecCnc.setName( "LECCNC" );
      chkLecCnc.setWebtags( "" );
      chkLecCnc.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkLecCnc.getInternalname(), "TitleCaption", chkLecCnc.getCaption(), true);
      chkLecCnc.setCheckedValue( "0" );
      A6832LecCnc = (byte)(((GXutil.strcmp(GXutil.ltrim( localUtil.ntoc( A6832LecCnc, (byte)(1), (byte)(0), ".", "")), "1")==0) ? 1 : 0)) ;
      n6832LecCnc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6832LecCnc", GXutil.str( A6832LecCnc, 1, 0));
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

   public void valid_Lecfasord( )
   {
      n1167LecBarCod = false ;
      n1168LecBarReo = false ;
      n1169LecBarPar = false ;
      n1188LecFasOrd = false ;
      GXt_char1 = A13722LecEstado ;
      GXv_char4[0] = GXt_char1 ;
      new app.procedure4(remoteHandle, context).execute( A396EmprCod, A1167LecBarCod, A1168LecBarReo, A1169LecBarPar, A1188LecFasOrd, GXv_char4) ;
      lector___impl.this.GXt_char1 = GXv_char4[0] ;
      A13722LecEstado = GXt_char1 ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A13722LecEstado", GXutil.rtrim( A13722LecEstado));
   }

   public void valid_Lecfascod( )
   {
      n1171LecFasCod = false ;
      GXt_char1 = A14260LecFasDsc ;
      GXv_char4[0] = GXt_char1 ;
      new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A1171LecFasCod, GXv_char4) ;
      lector___impl.this.GXt_char1 = GXv_char4[0] ;
      A14260LecFasDsc = GXt_char1 ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A14260LecFasDsc", GXutil.rtrim( A14260LecFasDsc));
   }

   public void valid_Lecopecod( )
   {
      n1170LecOpeCod = false ;
      GXt_char1 = A14259lecOpeNom ;
      GXv_char4[0] = GXt_char1 ;
      new app.popenom(remoteHandle, context).execute( A396EmprCod, A1170LecOpeCod, GXv_char4) ;
      lector___impl.this.GXt_char1 = GXv_char4[0] ;
      A14259lecOpeNom = GXt_char1 ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A14259lecOpeNom", GXutil.rtrim( A14259lecOpeNom));
   }

   public void valid_Lecparcod( )
   {
      n1172LecParCod = false ;
      GXt_char1 = A14261LecParNom ;
      GXv_char4[0] = GXt_char1 ;
      new app.pparcodnom(remoteHandle, context).execute( A396EmprCod, A1172LecParCod, GXv_char4) ;
      lector___impl.this.GXt_char1 = GXv_char4[0] ;
      A14261LecParNom = GXt_char1 ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A14261LecParNom", GXutil.rtrim( A14261LecParNom));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV8LecMaqCod',fld:'vLECMAQCOD',pic:'',hsh:true},{av:'A6832LecCnc',fld:'LECCNC',pic:'9'}]");
      setEventMetadata("ENTER",",oparms:[{av:'A6832LecCnc',fld:'LECCNC',pic:'9'}]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV10TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV8LecMaqCod',fld:'vLECMAQCOD',pic:'',hsh:true},{av:'A6832LecCnc',fld:'LECCNC',pic:'9'}]");
      setEventMetadata("REFRESH",",oparms:[{av:'A6832LecCnc',fld:'LECCNC',pic:'9'}]}");
      setEventMetadata("AFTER TRN","{handler:'e141TV2',iparms:[{av:'cmbLecTipEnt'},{av:'A1796LecTipEnt',fld:'LECTIPENT',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A1166LecMaqCod',fld:'LECMAQCOD',pic:''},{av:'AV10TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true},{av:'A6832LecCnc',fld:'LECCNC',pic:'9'}]");
      setEventMetadata("AFTER TRN",",oparms:[{av:'A1166LecMaqCod',fld:'LECMAQCOD',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A6832LecCnc',fld:'LECCNC',pic:'9'}]}");
      setEventMetadata("VPROMPTORDEN.CLICK","{handler:'e121TV156',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A1167LecBarCod',fld:'LECBARCOD',pic:'ZZZZZZZ9'},{av:'A1168LecBarReo',fld:'LECBARREO',pic:'9'},{av:'A1169LecBarPar',fld:'LECBARPAR',pic:''},{av:'A1188LecFasOrd',fld:'LECFASORD',pic:'ZZZ9'},{av:'A6832LecCnc',fld:'LECCNC',pic:'9'}]");
      setEventMetadata("VPROMPTORDEN.CLICK",",oparms:[{av:'A1171LecFasCod',fld:'LECFASCOD',pic:''},{av:'A1188LecFasOrd',fld:'LECFASORD',pic:'ZZZ9'},{av:'A6832LecCnc',fld:'LECCNC',pic:'9'}]}");
      setEventMetadata("VPROMPTHDR.CLICK","{handler:'e111TV156',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A1167LecBarCod',fld:'LECBARCOD',pic:'ZZZZZZZ9'},{av:'A1168LecBarReo',fld:'LECBARREO',pic:'9'},{av:'A1169LecBarPar',fld:'LECBARPAR',pic:''},{av:'A6832LecCnc',fld:'LECCNC',pic:'9'}]");
      setEventMetadata("VPROMPTHDR.CLICK",",oparms:[{av:'A1169LecBarPar',fld:'LECBARPAR',pic:''},{av:'A1168LecBarReo',fld:'LECBARREO',pic:'9'},{av:'A1167LecBarCod',fld:'LECBARCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A6832LecCnc',fld:'LECCNC',pic:'9'}]}");
      setEventMetadata("VALID_LECMAQCOD","{handler:'valid_Lecmaqcod',iparms:[{av:'A6832LecCnc',fld:'LECCNC',pic:'9'}]");
      setEventMetadata("VALID_LECMAQCOD",",oparms:[{av:'A6832LecCnc',fld:'LECCNC',pic:'9'}]}");
      setEventMetadata("VALID_LECBARCOD","{handler:'valid_Lecbarcod',iparms:[{av:'A6832LecCnc',fld:'LECCNC',pic:'9'}]");
      setEventMetadata("VALID_LECBARCOD",",oparms:[{av:'A6832LecCnc',fld:'LECCNC',pic:'9'}]}");
      setEventMetadata("VALID_LECBARREO","{handler:'valid_Lecbarreo',iparms:[{av:'A6832LecCnc',fld:'LECCNC',pic:'9'}]");
      setEventMetadata("VALID_LECBARREO",",oparms:[{av:'A6832LecCnc',fld:'LECCNC',pic:'9'}]}");
      setEventMetadata("VALID_LECBARPAR","{handler:'valid_Lecbarpar',iparms:[{av:'A6832LecCnc',fld:'LECCNC',pic:'9'}]");
      setEventMetadata("VALID_LECBARPAR",",oparms:[{av:'A6832LecCnc',fld:'LECCNC',pic:'9'}]}");
      setEventMetadata("VALID_LECFASORD","{handler:'valid_Lecfasord',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A1167LecBarCod',fld:'LECBARCOD',pic:'ZZZZZZZ9'},{av:'A1168LecBarReo',fld:'LECBARREO',pic:'9'},{av:'A1169LecBarPar',fld:'LECBARPAR',pic:''},{av:'A1188LecFasOrd',fld:'LECFASORD',pic:'ZZZ9'},{av:'A13722LecEstado',fld:'LECESTADO',pic:''},{av:'A6832LecCnc',fld:'LECCNC',pic:'9'}]");
      setEventMetadata("VALID_LECFASORD",",oparms:[{av:'A13722LecEstado',fld:'LECESTADO',pic:''},{av:'A6832LecCnc',fld:'LECCNC',pic:'9'}]}");
      setEventMetadata("VALID_LECFASCOD","{handler:'valid_Lecfascod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A1171LecFasCod',fld:'LECFASCOD',pic:''},{av:'A14260LecFasDsc',fld:'LECFASDSC',pic:''},{av:'A6832LecCnc',fld:'LECCNC',pic:'9'}]");
      setEventMetadata("VALID_LECFASCOD",",oparms:[{av:'A14260LecFasDsc',fld:'LECFASDSC',pic:''},{av:'A6832LecCnc',fld:'LECCNC',pic:'9'}]}");
      setEventMetadata("VALID_LECOPECOD","{handler:'valid_Lecopecod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A1170LecOpeCod',fld:'LECOPECOD',pic:'ZZZZZ9'},{av:'A14259lecOpeNom',fld:'LECOPENOM',pic:''},{av:'A6832LecCnc',fld:'LECCNC',pic:'9'}]");
      setEventMetadata("VALID_LECOPECOD",",oparms:[{av:'A14259lecOpeNom',fld:'LECOPENOM',pic:''},{av:'A6832LecCnc',fld:'LECCNC',pic:'9'}]}");
      setEventMetadata("VALID_LECPARCOD","{handler:'valid_Lecparcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A1172LecParCod',fld:'LECPARCOD',pic:'ZZZ9'},{av:'A14261LecParNom',fld:'LECPARNOM',pic:''},{av:'A6832LecCnc',fld:'LECCNC',pic:'9'}]");
      setEventMetadata("VALID_LECPARCOD",",oparms:[{av:'A14261LecParNom',fld:'LECPARNOM',pic:''},{av:'A6832LecCnc',fld:'LECCNC',pic:'9'}]}");
      setEventMetadata("VALIDV_COMBOLECMAQCOD","{handler:'validv_Combolecmaqcod',iparms:[{av:'A6832LecCnc',fld:'LECCNC',pic:'9'}]");
      setEventMetadata("VALIDV_COMBOLECMAQCOD",",oparms:[{av:'A6832LecCnc',fld:'LECCNC',pic:'9'}]}");
      setEventMetadata("VALIDV_COMBOLECOPECOD","{handler:'validv_Combolecopecod',iparms:[{av:'A6832LecCnc',fld:'LECCNC',pic:'9'}]");
      setEventMetadata("VALIDV_COMBOLECOPECOD",",oparms:[{av:'A6832LecCnc',fld:'LECCNC',pic:'9'}]}");
      setEventMetadata("VALIDV_COMBOLECPARCOD","{handler:'validv_Combolecparcod',iparms:[{av:'A6832LecCnc',fld:'LECCNC',pic:'9'}]");
      setEventMetadata("VALIDV_COMBOLECPARCOD",",oparms:[{av:'A6832LecCnc',fld:'LECCNC',pic:'9'}]}");
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
      wcpOAV7EmprCod = "" ;
      wcpOAV8LecMaqCod = "" ;
      Z396EmprCod = "" ;
      Z1166LecMaqCod = "" ;
      Z1169LecBarPar = "" ;
      Z1171LecFasCod = "" ;
      Z1173LecHor = "" ;
      Z1174LecFec = GXutil.nullDate() ;
      Z1796LecTipEnt = "" ;
      Z4345LecCombin = "" ;
      Combo_lecparcod_Selectedvalue_get = "" ;
      Combo_lecopecod_Selectedvalue_get = "" ;
      Combo_lecmaqcod_Selectedvalue_get = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A1171LecFasCod = "" ;
      A1169LecBarPar = "" ;
      AV7EmprCod = "" ;
      Gx_mode = "" ;
      AV8LecMaqCod = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      A1796LecTipEnt = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      lblTextblocklecmaqcod_Jsonclick = "" ;
      ucCombo_lecmaqcod = new com.genexus.webpanels.GXUserControl();
      Combo_lecmaqcod_Caption = "" ;
      AV22LecMaqCod_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      TempTags = "" ;
      A1166LecMaqCod = "" ;
      AV25PromptHDR = "" ;
      AV29Prompthdr_GXI = "" ;
      sImgUrl = "" ;
      AV24PromptOrden = "" ;
      AV28Promptorden_GXI = "" ;
      imgprompt_1171_gximage = "" ;
      A14260LecFasDsc = "" ;
      lblTextblocklecopecod_Jsonclick = "" ;
      ucCombo_lecopecod = new com.genexus.webpanels.GXUserControl();
      Combo_lecopecod_Caption = "" ;
      AV15LecOpeCod_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      lblTextblocklecparcod_Jsonclick = "" ;
      ucCombo_lecparcod = new com.genexus.webpanels.GXUserControl();
      Combo_lecparcod_Caption = "" ;
      AV18LecParCod_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      A1174LecFec = GXutil.nullDate() ;
      A1173LecHor = "" ;
      A4345LecCombin = "" ;
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      AV27Pgmname = "" ;
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      AV23ComboLecMaqCod = "" ;
      A14261LecParNom = "" ;
      A14259lecOpeNom = "" ;
      A13722LecEstado = "" ;
      A13721LecHdr = "" ;
      A407EmprNom = "" ;
      Combo_lecmaqcod_Objectcall = "" ;
      Combo_lecmaqcod_Class = "" ;
      Combo_lecmaqcod_Icontype = "" ;
      Combo_lecmaqcod_Icon = "" ;
      Combo_lecmaqcod_Tooltip = "" ;
      Combo_lecmaqcod_Selectedvalue_set = "" ;
      Combo_lecmaqcod_Selectedtext_set = "" ;
      Combo_lecmaqcod_Selectedtext_get = "" ;
      Combo_lecmaqcod_Gamoauthtoken = "" ;
      Combo_lecmaqcod_Ddointernalname = "" ;
      Combo_lecmaqcod_Titlecontrolalign = "" ;
      Combo_lecmaqcod_Dropdownoptionstype = "" ;
      Combo_lecmaqcod_Titlecontrolidtoreplace = "" ;
      Combo_lecmaqcod_Datalisttype = "" ;
      Combo_lecmaqcod_Datalistfixedvalues = "" ;
      Combo_lecmaqcod_Datalistproc = "" ;
      Combo_lecmaqcod_Datalistprocparametersprefix = "" ;
      Combo_lecmaqcod_Remoteservicesparameters = "" ;
      Combo_lecmaqcod_Htmltemplate = "" ;
      Combo_lecmaqcod_Multiplevaluestype = "" ;
      Combo_lecmaqcod_Loadingdata = "" ;
      Combo_lecmaqcod_Noresultsfound = "" ;
      Combo_lecmaqcod_Emptyitemtext = "" ;
      Combo_lecmaqcod_Onlyselectedvalues = "" ;
      Combo_lecmaqcod_Selectalltext = "" ;
      Combo_lecmaqcod_Multiplevaluesseparator = "" ;
      Combo_lecmaqcod_Addnewoptiontext = "" ;
      Combo_lecopecod_Objectcall = "" ;
      Combo_lecopecod_Class = "" ;
      Combo_lecopecod_Icontype = "" ;
      Combo_lecopecod_Icon = "" ;
      Combo_lecopecod_Tooltip = "" ;
      Combo_lecopecod_Selectedvalue_set = "" ;
      Combo_lecopecod_Selectedtext_set = "" ;
      Combo_lecopecod_Selectedtext_get = "" ;
      Combo_lecopecod_Gamoauthtoken = "" ;
      Combo_lecopecod_Ddointernalname = "" ;
      Combo_lecopecod_Titlecontrolalign = "" ;
      Combo_lecopecod_Dropdownoptionstype = "" ;
      Combo_lecopecod_Titlecontrolidtoreplace = "" ;
      Combo_lecopecod_Datalisttype = "" ;
      Combo_lecopecod_Datalistfixedvalues = "" ;
      Combo_lecopecod_Datalistproc = "" ;
      Combo_lecopecod_Datalistprocparametersprefix = "" ;
      Combo_lecopecod_Remoteservicesparameters = "" ;
      Combo_lecopecod_Htmltemplate = "" ;
      Combo_lecopecod_Multiplevaluestype = "" ;
      Combo_lecopecod_Loadingdata = "" ;
      Combo_lecopecod_Noresultsfound = "" ;
      Combo_lecopecod_Emptyitemtext = "" ;
      Combo_lecopecod_Onlyselectedvalues = "" ;
      Combo_lecopecod_Selectalltext = "" ;
      Combo_lecopecod_Multiplevaluesseparator = "" ;
      Combo_lecopecod_Addnewoptiontext = "" ;
      Combo_lecparcod_Objectcall = "" ;
      Combo_lecparcod_Class = "" ;
      Combo_lecparcod_Icontype = "" ;
      Combo_lecparcod_Icon = "" ;
      Combo_lecparcod_Tooltip = "" ;
      Combo_lecparcod_Selectedvalue_set = "" ;
      Combo_lecparcod_Selectedtext_set = "" ;
      Combo_lecparcod_Selectedtext_get = "" ;
      Combo_lecparcod_Gamoauthtoken = "" ;
      Combo_lecparcod_Ddointernalname = "" ;
      Combo_lecparcod_Titlecontrolalign = "" ;
      Combo_lecparcod_Dropdownoptionstype = "" ;
      Combo_lecparcod_Titlecontrolidtoreplace = "" ;
      Combo_lecparcod_Datalisttype = "" ;
      Combo_lecparcod_Datalistfixedvalues = "" ;
      Combo_lecparcod_Datalistproc = "" ;
      Combo_lecparcod_Datalistprocparametersprefix = "" ;
      Combo_lecparcod_Remoteservicesparameters = "" ;
      Combo_lecparcod_Htmltemplate = "" ;
      Combo_lecparcod_Multiplevaluestype = "" ;
      Combo_lecparcod_Loadingdata = "" ;
      Combo_lecparcod_Noresultsfound = "" ;
      Combo_lecparcod_Onlyselectedvalues = "" ;
      Combo_lecparcod_Selectalltext = "" ;
      Combo_lecparcod_Multiplevaluesseparator = "" ;
      Combo_lecparcod_Addnewoptiontext = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      Datamonjs_Objectcall = "" ;
      Datamonjs_Class = "" ;
      Datamonjs_Paramstr = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode156 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      AV12Station = "" ;
      AV13EmprNom = "" ;
      AV14UsurCod = "" ;
      GXv_char2 = new String[1] ;
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext5 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV10TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV11WebSession = httpContext.getWebSession();
      GXv_char3 = new String[1] ;
      AV16ComboSelectedValue = "" ;
      GXt_objcol_SdtDVB_SDTComboData_Item6 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTComboData_Item7 = new GXBaseCollection[1] ;
      Z407EmprNom = "" ;
      T01TV4_A407EmprNom = new String[] {""} ;
      T01TV4_n407EmprNom = new boolean[] {false} ;
      T01TV5_A1166LecMaqCod = new String[] {""} ;
      T01TV5_A1170LecOpeCod = new int[1] ;
      T01TV5_n1170LecOpeCod = new boolean[] {false} ;
      T01TV5_A1172LecParCod = new short[1] ;
      T01TV5_n1172LecParCod = new boolean[] {false} ;
      T01TV5_A1167LecBarCod = new int[1] ;
      T01TV5_n1167LecBarCod = new boolean[] {false} ;
      T01TV5_A1168LecBarReo = new byte[1] ;
      T01TV5_n1168LecBarReo = new boolean[] {false} ;
      T01TV5_A1169LecBarPar = new String[] {""} ;
      T01TV5_n1169LecBarPar = new boolean[] {false} ;
      T01TV5_A1171LecFasCod = new String[] {""} ;
      T01TV5_n1171LecFasCod = new boolean[] {false} ;
      T01TV5_A1188LecFasOrd = new short[1] ;
      T01TV5_n1188LecFasOrd = new boolean[] {false} ;
      T01TV5_A1173LecHor = new String[] {""} ;
      T01TV5_n1173LecHor = new boolean[] {false} ;
      T01TV5_A1174LecFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01TV5_n1174LecFec = new boolean[] {false} ;
      T01TV5_A407EmprNom = new String[] {""} ;
      T01TV5_n407EmprNom = new boolean[] {false} ;
      T01TV5_A1796LecTipEnt = new String[] {""} ;
      T01TV5_n1796LecTipEnt = new boolean[] {false} ;
      T01TV5_A4702LecNumLot = new int[1] ;
      T01TV5_n4702LecNumLot = new boolean[] {false} ;
      T01TV5_A4703LecRecLinM = new short[1] ;
      T01TV5_n4703LecRecLinM = new boolean[] {false} ;
      T01TV5_A4345LecCombin = new String[] {""} ;
      T01TV5_n4345LecCombin = new boolean[] {false} ;
      T01TV5_A6832LecCnc = new byte[1] ;
      T01TV5_n6832LecCnc = new boolean[] {false} ;
      T01TV5_A396EmprCod = new String[] {""} ;
      T01TV6_A396EmprCod = new String[] {""} ;
      T01TV6_A1166LecMaqCod = new String[] {""} ;
      T01TV3_A1166LecMaqCod = new String[] {""} ;
      T01TV3_A1170LecOpeCod = new int[1] ;
      T01TV3_n1170LecOpeCod = new boolean[] {false} ;
      T01TV3_A1172LecParCod = new short[1] ;
      T01TV3_n1172LecParCod = new boolean[] {false} ;
      T01TV3_A1167LecBarCod = new int[1] ;
      T01TV3_n1167LecBarCod = new boolean[] {false} ;
      T01TV3_A1168LecBarReo = new byte[1] ;
      T01TV3_n1168LecBarReo = new boolean[] {false} ;
      T01TV3_A1169LecBarPar = new String[] {""} ;
      T01TV3_n1169LecBarPar = new boolean[] {false} ;
      T01TV3_A1171LecFasCod = new String[] {""} ;
      T01TV3_n1171LecFasCod = new boolean[] {false} ;
      T01TV3_A1188LecFasOrd = new short[1] ;
      T01TV3_n1188LecFasOrd = new boolean[] {false} ;
      T01TV3_A1173LecHor = new String[] {""} ;
      T01TV3_n1173LecHor = new boolean[] {false} ;
      T01TV3_A1174LecFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01TV3_n1174LecFec = new boolean[] {false} ;
      T01TV3_A1796LecTipEnt = new String[] {""} ;
      T01TV3_n1796LecTipEnt = new boolean[] {false} ;
      T01TV3_A4702LecNumLot = new int[1] ;
      T01TV3_n4702LecNumLot = new boolean[] {false} ;
      T01TV3_A4703LecRecLinM = new short[1] ;
      T01TV3_n4703LecRecLinM = new boolean[] {false} ;
      T01TV3_A4345LecCombin = new String[] {""} ;
      T01TV3_n4345LecCombin = new boolean[] {false} ;
      T01TV3_A6832LecCnc = new byte[1] ;
      T01TV3_n6832LecCnc = new boolean[] {false} ;
      T01TV3_A396EmprCod = new String[] {""} ;
      T01TV7_A396EmprCod = new String[] {""} ;
      T01TV7_A1166LecMaqCod = new String[] {""} ;
      T01TV8_A396EmprCod = new String[] {""} ;
      T01TV8_A1166LecMaqCod = new String[] {""} ;
      T01TV2_A1166LecMaqCod = new String[] {""} ;
      T01TV2_A1170LecOpeCod = new int[1] ;
      T01TV2_n1170LecOpeCod = new boolean[] {false} ;
      T01TV2_A1172LecParCod = new short[1] ;
      T01TV2_n1172LecParCod = new boolean[] {false} ;
      T01TV2_A1167LecBarCod = new int[1] ;
      T01TV2_n1167LecBarCod = new boolean[] {false} ;
      T01TV2_A1168LecBarReo = new byte[1] ;
      T01TV2_n1168LecBarReo = new boolean[] {false} ;
      T01TV2_A1169LecBarPar = new String[] {""} ;
      T01TV2_n1169LecBarPar = new boolean[] {false} ;
      T01TV2_A1171LecFasCod = new String[] {""} ;
      T01TV2_n1171LecFasCod = new boolean[] {false} ;
      T01TV2_A1188LecFasOrd = new short[1] ;
      T01TV2_n1188LecFasOrd = new boolean[] {false} ;
      T01TV2_A1173LecHor = new String[] {""} ;
      T01TV2_n1173LecHor = new boolean[] {false} ;
      T01TV2_A1174LecFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01TV2_n1174LecFec = new boolean[] {false} ;
      T01TV2_A1796LecTipEnt = new String[] {""} ;
      T01TV2_n1796LecTipEnt = new boolean[] {false} ;
      T01TV2_A4702LecNumLot = new int[1] ;
      T01TV2_n4702LecNumLot = new boolean[] {false} ;
      T01TV2_A4703LecRecLinM = new short[1] ;
      T01TV2_n4703LecRecLinM = new boolean[] {false} ;
      T01TV2_A4345LecCombin = new String[] {""} ;
      T01TV2_n4345LecCombin = new boolean[] {false} ;
      T01TV2_A6832LecCnc = new byte[1] ;
      T01TV2_n6832LecCnc = new boolean[] {false} ;
      T01TV2_A396EmprCod = new String[] {""} ;
      T01TV12_A396EmprCod = new String[] {""} ;
      T01TV12_A1166LecMaqCod = new String[] {""} ;
      T01TV12_A5961LecBarCodG = new int[1] ;
      T01TV12_A5962LecBarReoG = new byte[1] ;
      T01TV12_A5963LecBarParG = new String[] {""} ;
      T01TV12_A5964LecNumLotG = new int[1] ;
      T01TV12_A5965LecFasOrdG = new short[1] ;
      T01TV13_A396EmprCod = new String[] {""} ;
      T01TV13_A1166LecMaqCod = new String[] {""} ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXv_int9 = new byte[1] ;
      Z13722LecEstado = "" ;
      Z14260LecFasDsc = "" ;
      Z14259lecOpeNom = "" ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      Z14261LecParNom = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.lectoroptico.lector____moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.lectoroptico.lector____vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.lectoroptico.lector____colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.lectoroptico.lector____ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.lectoroptico.lector____default(),
         new Object[] {
             new Object[] {
            T01TV2_A1166LecMaqCod, T01TV2_A1170LecOpeCod, T01TV2_n1170LecOpeCod, T01TV2_A1172LecParCod, T01TV2_n1172LecParCod, T01TV2_A1167LecBarCod, T01TV2_n1167LecBarCod, T01TV2_A1168LecBarReo, T01TV2_n1168LecBarReo, T01TV2_A1169LecBarPar,
            T01TV2_n1169LecBarPar, T01TV2_A1171LecFasCod, T01TV2_n1171LecFasCod, T01TV2_A1188LecFasOrd, T01TV2_n1188LecFasOrd, T01TV2_A1173LecHor, T01TV2_n1173LecHor, T01TV2_A1174LecFec, T01TV2_n1174LecFec, T01TV2_A1796LecTipEnt,
            T01TV2_n1796LecTipEnt, T01TV2_A4702LecNumLot, T01TV2_n4702LecNumLot, T01TV2_A4703LecRecLinM, T01TV2_n4703LecRecLinM, T01TV2_A4345LecCombin, T01TV2_n4345LecCombin, T01TV2_A6832LecCnc, T01TV2_n6832LecCnc, T01TV2_A396EmprCod
            }
            , new Object[] {
            T01TV3_A1166LecMaqCod, T01TV3_A1170LecOpeCod, T01TV3_n1170LecOpeCod, T01TV3_A1172LecParCod, T01TV3_n1172LecParCod, T01TV3_A1167LecBarCod, T01TV3_n1167LecBarCod, T01TV3_A1168LecBarReo, T01TV3_n1168LecBarReo, T01TV3_A1169LecBarPar,
            T01TV3_n1169LecBarPar, T01TV3_A1171LecFasCod, T01TV3_n1171LecFasCod, T01TV3_A1188LecFasOrd, T01TV3_n1188LecFasOrd, T01TV3_A1173LecHor, T01TV3_n1173LecHor, T01TV3_A1174LecFec, T01TV3_n1174LecFec, T01TV3_A1796LecTipEnt,
            T01TV3_n1796LecTipEnt, T01TV3_A4702LecNumLot, T01TV3_n4702LecNumLot, T01TV3_A4703LecRecLinM, T01TV3_n4703LecRecLinM, T01TV3_A4345LecCombin, T01TV3_n4345LecCombin, T01TV3_A6832LecCnc, T01TV3_n6832LecCnc, T01TV3_A396EmprCod
            }
            , new Object[] {
            T01TV4_A407EmprNom, T01TV4_n407EmprNom
            }
            , new Object[] {
            T01TV5_A1166LecMaqCod, T01TV5_A1170LecOpeCod, T01TV5_n1170LecOpeCod, T01TV5_A1172LecParCod, T01TV5_n1172LecParCod, T01TV5_A1167LecBarCod, T01TV5_n1167LecBarCod, T01TV5_A1168LecBarReo, T01TV5_n1168LecBarReo, T01TV5_A1169LecBarPar,
            T01TV5_n1169LecBarPar, T01TV5_A1171LecFasCod, T01TV5_n1171LecFasCod, T01TV5_A1188LecFasOrd, T01TV5_n1188LecFasOrd, T01TV5_A1173LecHor, T01TV5_n1173LecHor, T01TV5_A1174LecFec, T01TV5_n1174LecFec, T01TV5_A407EmprNom,
            T01TV5_n407EmprNom, T01TV5_A1796LecTipEnt, T01TV5_n1796LecTipEnt, T01TV5_A4702LecNumLot, T01TV5_n4702LecNumLot, T01TV5_A4703LecRecLinM, T01TV5_n4703LecRecLinM, T01TV5_A4345LecCombin, T01TV5_n4345LecCombin, T01TV5_A6832LecCnc,
            T01TV5_n6832LecCnc, T01TV5_A396EmprCod
            }
            , new Object[] {
            T01TV6_A396EmprCod, T01TV6_A1166LecMaqCod
            }
            , new Object[] {
            T01TV7_A396EmprCod, T01TV7_A1166LecMaqCod
            }
            , new Object[] {
            T01TV8_A396EmprCod, T01TV8_A1166LecMaqCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01TV12_A396EmprCod, T01TV12_A1166LecMaqCod, T01TV12_A5961LecBarCodG, T01TV12_A5962LecBarReoG, T01TV12_A5963LecBarParG, T01TV12_A5964LecNumLotG, T01TV12_A5965LecFasOrdG
            }
            , new Object[] {
            T01TV13_A396EmprCod, T01TV13_A1166LecMaqCod
            }
         }
      );
      AV27Pgmname = "LectorOptico.Lector__" ;
   }

   private byte Z1168LecBarReo ;
   private byte Z6832LecCnc ;
   private byte GxWebError ;
   private byte A1168LecBarReo ;
   private byte nKeyPressed ;
   private byte A6832LecCnc ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private byte GXt_int8 ;
   private byte GXv_int9[] ;
   private short Z1172LecParCod ;
   private short Z1188LecFasOrd ;
   private short Z4703LecRecLinM ;
   private short A1172LecParCod ;
   private short A1188LecFasOrd ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A4703LecRecLinM ;
   private short AV19ComboLecParCod ;
   private short RcdFound156 ;
   private short nIsDirty_156 ;
   private int Z1170LecOpeCod ;
   private int Z1167LecBarCod ;
   private int Z4702LecNumLot ;
   private int A1170LecOpeCod ;
   private int A1167LecBarCod ;
   private int trnEnded ;
   private int edtLecMaqCod_Visible ;
   private int edtLecMaqCod_Enabled ;
   private int edtLecBarCod_Enabled ;
   private int edtLecBarReo_Enabled ;
   private int edtLecBarPar_Enabled ;
   private int imgavPrompthdr_Visible ;
   private int imgavPrompthdr_Enabled ;
   private int edtLecFasOrd_Enabled ;
   private int imgavPromptorden_Visible ;
   private int imgavPromptorden_Enabled ;
   private int edtLecFasCod_Enabled ;
   private int imgprompt_1171_Visible ;
   private int edtLecFasDsc_Enabled ;
   private int A4702LecNumLot ;
   private int edtLecNumLot_Enabled ;
   private int edtLecRecLinM_Enabled ;
   private int edtLecOpeCod_Enabled ;
   private int edtLecOpeCod_Visible ;
   private int edtLecParCod_Enabled ;
   private int edtLecParCod_Visible ;
   private int edtLecFec_Enabled ;
   private int edtLecHor_Enabled ;
   private int edtLecCombin_Visible ;
   private int edtLecCombin_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int edtavPgmname_Enabled ;
   private int edtavCombolecmaqcod_Visible ;
   private int edtavCombolecmaqcod_Enabled ;
   private int AV17ComboLecOpeCod ;
   private int edtavCombolecopecod_Enabled ;
   private int edtavCombolecopecod_Visible ;
   private int edtavCombolecparcod_Enabled ;
   private int edtavCombolecparcod_Visible ;
   private int Combo_lecmaqcod_Datalistupdateminimumcharacters ;
   private int Combo_lecopecod_Datalistupdateminimumcharacters ;
   private int Combo_lecparcod_Datalistupdateminimumcharacters ;
   private int Datamonjs_Gxcontroltype ;
   private int GX_JID ;
   private int idxLst ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV7EmprCod ;
   private String wcpOAV8LecMaqCod ;
   private String Z396EmprCod ;
   private String Z1166LecMaqCod ;
   private String Z1169LecBarPar ;
   private String Z1171LecFasCod ;
   private String Z1173LecHor ;
   private String Z1796LecTipEnt ;
   private String Z4345LecCombin ;
   private String Combo_lecparcod_Selectedvalue_get ;
   private String Combo_lecopecod_Selectedvalue_get ;
   private String Combo_lecmaqcod_Selectedvalue_get ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A1171LecFasCod ;
   private String A1169LecBarPar ;
   private String AV7EmprCod ;
   private String Gx_mode ;
   private String AV8LecMaqCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtLecMaqCod_Internalname ;
   private String A1796LecTipEnt ;
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
   private String divTablesplittedlecmaqcod_Internalname ;
   private String lblTextblocklecmaqcod_Internalname ;
   private String lblTextblocklecmaqcod_Jsonclick ;
   private String Combo_lecmaqcod_Caption ;
   private String Combo_lecmaqcod_Cls ;
   private String Combo_lecmaqcod_Internalname ;
   private String TempTags ;
   private String A1166LecMaqCod ;
   private String edtLecMaqCod_Jsonclick ;
   private String divUnnamedtable2_Internalname ;
   private String edtLecBarCod_Internalname ;
   private String edtLecBarCod_Jsonclick ;
   private String edtLecBarReo_Internalname ;
   private String edtLecBarReo_Jsonclick ;
   private String edtLecBarPar_Internalname ;
   private String edtLecBarPar_Jsonclick ;
   private String imgavPrompthdr_Internalname ;
   private String imgavPrompthdr_gximage ;
   private String sImgUrl ;
   private String imgavPrompthdr_Jsonclick ;
   private String divUnnamedtable3_Internalname ;
   private String edtLecFasOrd_Internalname ;
   private String edtLecFasOrd_Jsonclick ;
   private String imgavPromptorden_Internalname ;
   private String imgavPromptorden_gximage ;
   private String imgavPromptorden_Jsonclick ;
   private String edtLecFasCod_Internalname ;
   private String edtLecFasCod_Jsonclick ;
   private String imgprompt_1171_gximage ;
   private String imgprompt_1171_Internalname ;
   private String imgprompt_1171_Link ;
   private String edtLecFasDsc_Internalname ;
   private String A14260LecFasDsc ;
   private String edtLecFasDsc_Jsonclick ;
   private String divUnnamedtable4_Internalname ;
   private String edtLecNumLot_Internalname ;
   private String edtLecNumLot_Jsonclick ;
   private String edtLecRecLinM_Internalname ;
   private String edtLecRecLinM_Jsonclick ;
   private String divUnnamedtable5_Internalname ;
   private String divTablesplittedlecopecod_Internalname ;
   private String lblTextblocklecopecod_Internalname ;
   private String lblTextblocklecopecod_Jsonclick ;
   private String Combo_lecopecod_Caption ;
   private String Combo_lecopecod_Cls ;
   private String Combo_lecopecod_Internalname ;
   private String edtLecOpeCod_Internalname ;
   private String edtLecOpeCod_Jsonclick ;
   private String divTablesplittedlecparcod_Internalname ;
   private String lblTextblocklecparcod_Internalname ;
   private String lblTextblocklecparcod_Jsonclick ;
   private String Combo_lecparcod_Caption ;
   private String Combo_lecparcod_Cls ;
   private String Combo_lecparcod_Emptyitemtext ;
   private String Combo_lecparcod_Internalname ;
   private String edtLecParCod_Internalname ;
   private String edtLecParCod_Jsonclick ;
   private String divUnnamedtable6_Internalname ;
   private String edtLecFec_Internalname ;
   private String edtLecFec_Jsonclick ;
   private String edtLecHor_Internalname ;
   private String A1173LecHor ;
   private String edtLecHor_Jsonclick ;
   private String divUnnamedtable7_Internalname ;
   private String divLeccombin_cell_Internalname ;
   private String divLeccombin_cell_Class ;
   private String edtLecCombin_Internalname ;
   private String A4345LecCombin ;
   private String edtLecCombin_Jsonclick ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String edtavPgmname_Internalname ;
   private String AV27Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String divSectionattribute_lecmaqcod_Internalname ;
   private String edtavCombolecmaqcod_Internalname ;
   private String AV23ComboLecMaqCod ;
   private String edtavCombolecmaqcod_Jsonclick ;
   private String divSectionattribute_lecopecod_Internalname ;
   private String edtavCombolecopecod_Internalname ;
   private String edtavCombolecopecod_Jsonclick ;
   private String divSectionattribute_lecparcod_Internalname ;
   private String edtavCombolecparcod_Internalname ;
   private String edtavCombolecparcod_Jsonclick ;
   private String A14261LecParNom ;
   private String A14259lecOpeNom ;
   private String A13722LecEstado ;
   private String A13721LecHdr ;
   private String A407EmprNom ;
   private String Combo_lecmaqcod_Objectcall ;
   private String Combo_lecmaqcod_Class ;
   private String Combo_lecmaqcod_Icontype ;
   private String Combo_lecmaqcod_Icon ;
   private String Combo_lecmaqcod_Tooltip ;
   private String Combo_lecmaqcod_Selectedvalue_set ;
   private String Combo_lecmaqcod_Selectedtext_set ;
   private String Combo_lecmaqcod_Selectedtext_get ;
   private String Combo_lecmaqcod_Gamoauthtoken ;
   private String Combo_lecmaqcod_Ddointernalname ;
   private String Combo_lecmaqcod_Titlecontrolalign ;
   private String Combo_lecmaqcod_Dropdownoptionstype ;
   private String Combo_lecmaqcod_Titlecontrolidtoreplace ;
   private String Combo_lecmaqcod_Datalisttype ;
   private String Combo_lecmaqcod_Datalistfixedvalues ;
   private String Combo_lecmaqcod_Datalistproc ;
   private String Combo_lecmaqcod_Datalistprocparametersprefix ;
   private String Combo_lecmaqcod_Remoteservicesparameters ;
   private String Combo_lecmaqcod_Htmltemplate ;
   private String Combo_lecmaqcod_Multiplevaluestype ;
   private String Combo_lecmaqcod_Loadingdata ;
   private String Combo_lecmaqcod_Noresultsfound ;
   private String Combo_lecmaqcod_Emptyitemtext ;
   private String Combo_lecmaqcod_Onlyselectedvalues ;
   private String Combo_lecmaqcod_Selectalltext ;
   private String Combo_lecmaqcod_Multiplevaluesseparator ;
   private String Combo_lecmaqcod_Addnewoptiontext ;
   private String Combo_lecopecod_Objectcall ;
   private String Combo_lecopecod_Class ;
   private String Combo_lecopecod_Icontype ;
   private String Combo_lecopecod_Icon ;
   private String Combo_lecopecod_Tooltip ;
   private String Combo_lecopecod_Selectedvalue_set ;
   private String Combo_lecopecod_Selectedtext_set ;
   private String Combo_lecopecod_Selectedtext_get ;
   private String Combo_lecopecod_Gamoauthtoken ;
   private String Combo_lecopecod_Ddointernalname ;
   private String Combo_lecopecod_Titlecontrolalign ;
   private String Combo_lecopecod_Dropdownoptionstype ;
   private String Combo_lecopecod_Titlecontrolidtoreplace ;
   private String Combo_lecopecod_Datalisttype ;
   private String Combo_lecopecod_Datalistfixedvalues ;
   private String Combo_lecopecod_Datalistproc ;
   private String Combo_lecopecod_Datalistprocparametersprefix ;
   private String Combo_lecopecod_Remoteservicesparameters ;
   private String Combo_lecopecod_Htmltemplate ;
   private String Combo_lecopecod_Multiplevaluestype ;
   private String Combo_lecopecod_Loadingdata ;
   private String Combo_lecopecod_Noresultsfound ;
   private String Combo_lecopecod_Emptyitemtext ;
   private String Combo_lecopecod_Onlyselectedvalues ;
   private String Combo_lecopecod_Selectalltext ;
   private String Combo_lecopecod_Multiplevaluesseparator ;
   private String Combo_lecopecod_Addnewoptiontext ;
   private String Combo_lecparcod_Objectcall ;
   private String Combo_lecparcod_Class ;
   private String Combo_lecparcod_Icontype ;
   private String Combo_lecparcod_Icon ;
   private String Combo_lecparcod_Tooltip ;
   private String Combo_lecparcod_Selectedvalue_set ;
   private String Combo_lecparcod_Selectedtext_set ;
   private String Combo_lecparcod_Selectedtext_get ;
   private String Combo_lecparcod_Gamoauthtoken ;
   private String Combo_lecparcod_Ddointernalname ;
   private String Combo_lecparcod_Titlecontrolalign ;
   private String Combo_lecparcod_Dropdownoptionstype ;
   private String Combo_lecparcod_Titlecontrolidtoreplace ;
   private String Combo_lecparcod_Datalisttype ;
   private String Combo_lecparcod_Datalistfixedvalues ;
   private String Combo_lecparcod_Datalistproc ;
   private String Combo_lecparcod_Datalistprocparametersprefix ;
   private String Combo_lecparcod_Remoteservicesparameters ;
   private String Combo_lecparcod_Htmltemplate ;
   private String Combo_lecparcod_Multiplevaluestype ;
   private String Combo_lecparcod_Loadingdata ;
   private String Combo_lecparcod_Noresultsfound ;
   private String Combo_lecparcod_Onlyselectedvalues ;
   private String Combo_lecparcod_Selectalltext ;
   private String Combo_lecparcod_Multiplevaluesseparator ;
   private String Combo_lecparcod_Addnewoptiontext ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String Datamonjs_Objectcall ;
   private String Datamonjs_Class ;
   private String Datamonjs_Paramstr ;
   private String hsh ;
   private String sMode156 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String AV12Station ;
   private String AV13EmprNom ;
   private String AV14UsurCod ;
   private String GXv_char2[] ;
   private String GXv_char3[] ;
   private String Z407EmprNom ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String Z13722LecEstado ;
   private String Z14260LecFasDsc ;
   private String Z14259lecOpeNom ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String Z14261LecParNom ;
   private java.util.Date Z1174LecFec ;
   private java.util.Date A1174LecFec ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n1172LecParCod ;
   private boolean n1171LecFasCod ;
   private boolean n1170LecOpeCod ;
   private boolean n1167LecBarCod ;
   private boolean n1168LecBarReo ;
   private boolean n1169LecBarPar ;
   private boolean n1188LecFasOrd ;
   private boolean wbErr ;
   private boolean n1796LecTipEnt ;
   private boolean n6832LecCnc ;
   private boolean Dvpanel_tableattributes_Autowidth ;
   private boolean Dvpanel_tableattributes_Autoheight ;
   private boolean Dvpanel_tableattributes_Collapsible ;
   private boolean Dvpanel_tableattributes_Collapsed ;
   private boolean Dvpanel_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_tableattributes_Autoscroll ;
   private boolean Combo_lecmaqcod_Emptyitem ;
   private boolean AV25PromptHDR_IsBlob ;
   private boolean AV24PromptOrden_IsBlob ;
   private boolean Combo_lecopecod_Emptyitem ;
   private boolean n407EmprNom ;
   private boolean Combo_lecmaqcod_Enabled ;
   private boolean Combo_lecmaqcod_Visible ;
   private boolean Combo_lecmaqcod_Allowmultipleselection ;
   private boolean Combo_lecmaqcod_Isgriditem ;
   private boolean Combo_lecmaqcod_Hasdescription ;
   private boolean Combo_lecmaqcod_Includeonlyselectedoption ;
   private boolean Combo_lecmaqcod_Includeselectalloption ;
   private boolean Combo_lecmaqcod_Includeaddnewoption ;
   private boolean Combo_lecopecod_Enabled ;
   private boolean Combo_lecopecod_Visible ;
   private boolean Combo_lecopecod_Allowmultipleselection ;
   private boolean Combo_lecopecod_Isgriditem ;
   private boolean Combo_lecopecod_Hasdescription ;
   private boolean Combo_lecopecod_Includeonlyselectedoption ;
   private boolean Combo_lecopecod_Includeselectalloption ;
   private boolean Combo_lecopecod_Includeaddnewoption ;
   private boolean Combo_lecparcod_Enabled ;
   private boolean Combo_lecparcod_Visible ;
   private boolean Combo_lecparcod_Allowmultipleselection ;
   private boolean Combo_lecparcod_Isgriditem ;
   private boolean Combo_lecparcod_Hasdescription ;
   private boolean Combo_lecparcod_Includeonlyselectedoption ;
   private boolean Combo_lecparcod_Includeselectalloption ;
   private boolean Combo_lecparcod_Emptyitem ;
   private boolean Combo_lecparcod_Includeaddnewoption ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean Datamonjs_Enabled ;
   private boolean Datamonjs_Visible ;
   private boolean n4702LecNumLot ;
   private boolean n4703LecRecLinM ;
   private boolean n1174LecFec ;
   private boolean n1173LecHor ;
   private boolean n4345LecCombin ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private String AV29Prompthdr_GXI ;
   private String AV28Promptorden_GXI ;
   private String AV16ComboSelectedValue ;
   private String AV25PromptHDR ;
   private String AV24PromptOrden ;
   private com.genexus.webpanels.WebSession AV11WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.webpanels.GXUserControl ucCombo_lecmaqcod ;
   private com.genexus.webpanels.GXUserControl ucCombo_lecopecod ;
   private com.genexus.webpanels.GXUserControl ucCombo_lecparcod ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbLecTipEnt ;
   private ICheckbox chkLecCnc ;
   private IDataStoreProvider pr_default ;
   private String[] T01TV4_A407EmprNom ;
   private boolean[] T01TV4_n407EmprNom ;
   private String[] T01TV5_A1166LecMaqCod ;
   private int[] T01TV5_A1170LecOpeCod ;
   private boolean[] T01TV5_n1170LecOpeCod ;
   private short[] T01TV5_A1172LecParCod ;
   private boolean[] T01TV5_n1172LecParCod ;
   private int[] T01TV5_A1167LecBarCod ;
   private boolean[] T01TV5_n1167LecBarCod ;
   private byte[] T01TV5_A1168LecBarReo ;
   private boolean[] T01TV5_n1168LecBarReo ;
   private String[] T01TV5_A1169LecBarPar ;
   private boolean[] T01TV5_n1169LecBarPar ;
   private String[] T01TV5_A1171LecFasCod ;
   private boolean[] T01TV5_n1171LecFasCod ;
   private short[] T01TV5_A1188LecFasOrd ;
   private boolean[] T01TV5_n1188LecFasOrd ;
   private String[] T01TV5_A1173LecHor ;
   private boolean[] T01TV5_n1173LecHor ;
   private java.util.Date[] T01TV5_A1174LecFec ;
   private boolean[] T01TV5_n1174LecFec ;
   private String[] T01TV5_A407EmprNom ;
   private boolean[] T01TV5_n407EmprNom ;
   private String[] T01TV5_A1796LecTipEnt ;
   private boolean[] T01TV5_n1796LecTipEnt ;
   private int[] T01TV5_A4702LecNumLot ;
   private boolean[] T01TV5_n4702LecNumLot ;
   private short[] T01TV5_A4703LecRecLinM ;
   private boolean[] T01TV5_n4703LecRecLinM ;
   private String[] T01TV5_A4345LecCombin ;
   private boolean[] T01TV5_n4345LecCombin ;
   private byte[] T01TV5_A6832LecCnc ;
   private boolean[] T01TV5_n6832LecCnc ;
   private String[] T01TV5_A396EmprCod ;
   private String[] T01TV6_A396EmprCod ;
   private String[] T01TV6_A1166LecMaqCod ;
   private String[] T01TV3_A1166LecMaqCod ;
   private int[] T01TV3_A1170LecOpeCod ;
   private boolean[] T01TV3_n1170LecOpeCod ;
   private short[] T01TV3_A1172LecParCod ;
   private boolean[] T01TV3_n1172LecParCod ;
   private int[] T01TV3_A1167LecBarCod ;
   private boolean[] T01TV3_n1167LecBarCod ;
   private byte[] T01TV3_A1168LecBarReo ;
   private boolean[] T01TV3_n1168LecBarReo ;
   private String[] T01TV3_A1169LecBarPar ;
   private boolean[] T01TV3_n1169LecBarPar ;
   private String[] T01TV3_A1171LecFasCod ;
   private boolean[] T01TV3_n1171LecFasCod ;
   private short[] T01TV3_A1188LecFasOrd ;
   private boolean[] T01TV3_n1188LecFasOrd ;
   private String[] T01TV3_A1173LecHor ;
   private boolean[] T01TV3_n1173LecHor ;
   private java.util.Date[] T01TV3_A1174LecFec ;
   private boolean[] T01TV3_n1174LecFec ;
   private String[] T01TV3_A1796LecTipEnt ;
   private boolean[] T01TV3_n1796LecTipEnt ;
   private int[] T01TV3_A4702LecNumLot ;
   private boolean[] T01TV3_n4702LecNumLot ;
   private short[] T01TV3_A4703LecRecLinM ;
   private boolean[] T01TV3_n4703LecRecLinM ;
   private String[] T01TV3_A4345LecCombin ;
   private boolean[] T01TV3_n4345LecCombin ;
   private byte[] T01TV3_A6832LecCnc ;
   private boolean[] T01TV3_n6832LecCnc ;
   private String[] T01TV3_A396EmprCod ;
   private String[] T01TV7_A396EmprCod ;
   private String[] T01TV7_A1166LecMaqCod ;
   private String[] T01TV8_A396EmprCod ;
   private String[] T01TV8_A1166LecMaqCod ;
   private String[] T01TV2_A1166LecMaqCod ;
   private int[] T01TV2_A1170LecOpeCod ;
   private boolean[] T01TV2_n1170LecOpeCod ;
   private short[] T01TV2_A1172LecParCod ;
   private boolean[] T01TV2_n1172LecParCod ;
   private int[] T01TV2_A1167LecBarCod ;
   private boolean[] T01TV2_n1167LecBarCod ;
   private byte[] T01TV2_A1168LecBarReo ;
   private boolean[] T01TV2_n1168LecBarReo ;
   private String[] T01TV2_A1169LecBarPar ;
   private boolean[] T01TV2_n1169LecBarPar ;
   private String[] T01TV2_A1171LecFasCod ;
   private boolean[] T01TV2_n1171LecFasCod ;
   private short[] T01TV2_A1188LecFasOrd ;
   private boolean[] T01TV2_n1188LecFasOrd ;
   private String[] T01TV2_A1173LecHor ;
   private boolean[] T01TV2_n1173LecHor ;
   private java.util.Date[] T01TV2_A1174LecFec ;
   private boolean[] T01TV2_n1174LecFec ;
   private String[] T01TV2_A1796LecTipEnt ;
   private boolean[] T01TV2_n1796LecTipEnt ;
   private int[] T01TV2_A4702LecNumLot ;
   private boolean[] T01TV2_n4702LecNumLot ;
   private short[] T01TV2_A4703LecRecLinM ;
   private boolean[] T01TV2_n4703LecRecLinM ;
   private String[] T01TV2_A4345LecCombin ;
   private boolean[] T01TV2_n4345LecCombin ;
   private byte[] T01TV2_A6832LecCnc ;
   private boolean[] T01TV2_n6832LecCnc ;
   private String[] T01TV2_A396EmprCod ;
   private String[] T01TV12_A396EmprCod ;
   private String[] T01TV12_A1166LecMaqCod ;
   private int[] T01TV12_A5961LecBarCodG ;
   private byte[] T01TV12_A5962LecBarReoG ;
   private String[] T01TV12_A5963LecBarParG ;
   private int[] T01TV12_A5964LecNumLotG ;
   private short[] T01TV12_A5965LecFasOrdG ;
   private String[] T01TV13_A396EmprCod ;
   private String[] T01TV13_A1166LecMaqCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV22LecMaqCod_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV15LecOpeCod_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV18LecParCod_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXt_objcol_SdtDVB_SDTComboData_Item6 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXv_objcol_SdtDVB_SDTComboData_Item7[] ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext5[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV10TrnContext ;
}

final  class lector____moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class lector____vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class lector____colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class lector____ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class lector____default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01TV2", "SELECT LecMaqCod, LecOpeCod, LecParCod, LecBarCod, LecBarReo, LecBarPar, LecFasCod, LecFasOrd, LecHor, LecFec, LecTipEnt, LecNumLot, LecRecLinM, LecCombin, LecCnc, EmprCod FROM TXPLECTOR WHERE EmprCod = ? AND LecMaqCod = ?  FOR UPDATE OF LecOpeCod, LecParCod, LecBarCod, LecBarReo, LecBarPar, LecFasCod, LecFasOrd, LecHor, LecFec, LecTipEnt, LecNumLot, LecRecLinM, LecCombin, LecCnc NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TV3", "SELECT LecMaqCod, LecOpeCod, LecParCod, LecBarCod, LecBarReo, LecBarPar, LecFasCod, LecFasOrd, LecHor, LecFec, LecTipEnt, LecNumLot, LecRecLinM, LecCombin, LecCnc, EmprCod FROM TXPLECTOR WHERE EmprCod = ? AND LecMaqCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TV4", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TV5", "SELECT /*+ FIRST_ROWS(100) */ TM1.LecMaqCod, TM1.LecOpeCod, TM1.LecParCod, TM1.LecBarCod, TM1.LecBarReo, TM1.LecBarPar, TM1.LecFasCod, TM1.LecFasOrd, TM1.LecHor, TM1.LecFec, T2.EmprNom, TM1.LecTipEnt, TM1.LecNumLot, TM1.LecRecLinM, TM1.LecCombin, TM1.LecCnc, TM1.EmprCod FROM (TXPLECTOR TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.LecMaqCod = ? ORDER BY TM1.EmprCod, TM1.LecMaqCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TV6", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, LecMaqCod FROM TXPLECTOR WHERE EmprCod = ? AND LecMaqCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TV7", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, LecMaqCod FROM TXPLECTOR WHERE ( EmprCod > ? or EmprCod = ? and LecMaqCod > ?) ORDER BY EmprCod, LecMaqCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01TV8", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, LecMaqCod FROM TXPLECTOR WHERE ( EmprCod < ? or EmprCod = ? and LecMaqCod < ?) ORDER BY EmprCod DESC, LecMaqCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01TV9", "INSERT INTO TXPLECTOR(LecMaqCod, LecOpeCod, LecParCod, LecBarCod, LecBarReo, LecBarPar, LecFasCod, LecFasOrd, LecHor, LecFec, LecTipEnt, LecNumLot, LecRecLinM, LecCombin, LecCnc, EmprCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPLECTOR")
         ,new UpdateCursor("T01TV10", "UPDATE TXPLECTOR SET LecOpeCod=?, LecParCod=?, LecBarCod=?, LecBarReo=?, LecBarPar=?, LecFasCod=?, LecFasOrd=?, LecHor=?, LecFec=?, LecTipEnt=?, LecNumLot=?, LecRecLinM=?, LecCombin=?, LecCnc=?  WHERE EmprCod = ? AND LecMaqCod = ?", GX_NOMASK, "TXPLECTOR")
         ,new UpdateCursor("T01TV11", "DELETE FROM TXPLECTOR  WHERE EmprCod = ? AND LecMaqCod = ?", GX_NOMASK, "TXPLECTOR")
         ,new ForEachCursor("T01TV12", "SELECT * FROM (SELECT EmprCod, LecMaqCod, LecBarCodG, LecBarReoG, LecBarParG, LecNumLotG, LecFasOrdG FROM TXPLECLAV WHERE EmprCod = ? AND LecMaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01TV13", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, LecMaqCod FROM TXPLECTOR ORDER BY EmprCod, LecMaqCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((byte[]) buf[7])[0] = rslt.getByte(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 8);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDate(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 1);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((int[]) buf[21])[0] = rslt.getInt(12);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((short[]) buf[23])[0] = rslt.getShort(13);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(14, 2);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((byte[]) buf[27])[0] = rslt.getByte(15);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(16, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((byte[]) buf[7])[0] = rslt.getByte(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 8);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDate(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 1);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((int[]) buf[21])[0] = rslt.getInt(12);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((short[]) buf[23])[0] = rslt.getShort(13);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(14, 2);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((byte[]) buf[27])[0] = rslt.getByte(15);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(16, 3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((byte[]) buf[7])[0] = rslt.getByte(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 8);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDate(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 30);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 1);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((int[]) buf[23])[0] = rslt.getInt(13);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((short[]) buf[25])[0] = rslt.getShort(14);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(15, 2);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((byte[]) buf[29])[0] = rslt.getByte(16);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(17, 3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 11 :
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
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 6);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(3, ((Number) parms[4]).shortValue());
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(4, ((Number) parms[6]).intValue());
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(5, ((Number) parms[8]).byteValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[10], 1);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[12], 8);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(8, ((Number) parms[14]).shortValue());
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[16], 8);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.DATE );
               }
               else
               {
                  stmt.setDate(10, (java.util.Date)parms[18]);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[20], 1);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(12, ((Number) parms[22]).intValue());
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(13, ((Number) parms[24]).shortValue());
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(14, (String)parms[26], 2);
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(15, ((Number) parms[28]).byteValue());
               }
               stmt.setString(16, (String)parms[29], 3);
               return;
            case 8 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[3]).shortValue());
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
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(4, ((Number) parms[7]).byteValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 1);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[11], 8);
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
                  stmt.setString(8, (String)parms[15], 8);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DATE );
               }
               else
               {
                  stmt.setDate(9, (java.util.Date)parms[17]);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[19], 1);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(11, ((Number) parms[21]).intValue());
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(12, ((Number) parms[23]).shortValue());
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(13, (String)parms[25], 2);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(14, ((Number) parms[27]).byteValue());
               }
               stmt.setString(15, (String)parms[28], 3);
               stmt.setString(16, (String)parms[29], 6);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
      }
   }

}

