package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tlector_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action14") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A1166LecMaqCod = httpContext.GetPar( "LecMaqCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A1166LecMaqCod", A1166LecMaqCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_14_43156( A396EmprCod, A1166LecMaqCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action15") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A1166LecMaqCod = httpContext.GetPar( "LecMaqCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A1166LecMaqCod", A1166LecMaqCod);
         A1796LecTipEnt = httpContext.GetPar( "LecTipEnt") ;
         n1796LecTipEnt = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1796LecTipEnt", A1796LecTipEnt);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_15_43156( A396EmprCod, A1166LecMaqCod, A1796LecTipEnt) ;
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
         gx1asalecparnom43156( A396EmprCod, A1172LecParCod) ;
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
         gx2asalecfasdsc43156( A396EmprCod, A1171LecFasCod) ;
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
         gx3asalecopenom43156( A396EmprCod, A1170LecOpeCod) ;
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
         gx4asalecestado43156( A396EmprCod, A1167LecBarCod, A1168LecBarReo, A1169LecBarPar, A1188LecFasOrd) ;
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
            AV22EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV22EmprCod", AV22EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV22EmprCod, "@!"))));
            AV36LecMaqCod = httpContext.GetPar( "LecMaqCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36LecMaqCod", AV36LecMaqCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vLECMAQCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV36LecMaqCod, ""))));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Mantenimiento tabla LECTOR", ""), (short)(0)) ;
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

   public tlector_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tlector_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tlector_impl.class ));
   }

   public tlector_impl( int remoteHandle ,
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
      app.GxWebStd.gx_div_start( httpContext, divTablecontent_Internalname, 1, 0, "px", 0, "px", "TableContent15", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
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
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable8_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblocklecmaqcod_Internalname, httpContext.getMessage( "Maquina", ""), "", "", lblTextblocklecmaqcod_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_TLECTOR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* User Defined Control */
      ucCombo_lecmaqcod.setProperty("Caption", Combo_lecmaqcod_Caption);
      ucCombo_lecmaqcod.setProperty("Cls", Combo_lecmaqcod_Cls);
      ucCombo_lecmaqcod.setProperty("EmptyItem", Combo_lecmaqcod_Emptyitem);
      ucCombo_lecmaqcod.setProperty("DropDownOptionsData", AV48LecMaqCod_Data);
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtLecMaqCod_Internalname, GXutil.rtrim( A1166LecMaqCod), GXutil.rtrim( localUtil.format( A1166LecMaqCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,31);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLecMaqCod_Jsonclick, 0, "Attribute", "", "", "", "", edtLecMaqCod_Visible, edtLecMaqCod_Enabled, 1, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TLECTOR.htm");
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
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbLecTipEnt, cmbLecTipEnt.getInternalname(), GXutil.rtrim( A1796LecTipEnt), 1, cmbLecTipEnt.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbLecTipEnt.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,35);\"", "", true, (byte)(0), "HLP_TLECTOR.htm");
      cmbLecTipEnt.setValue( GXutil.rtrim( A1796LecTipEnt) );
      httpContext.ajax_rsp_assign_prop("", false, cmbLecTipEnt.getInternalname(), "Values", cmbLecTipEnt.ToJavascriptSource(), true);
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
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 48,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLecBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A1167LecBarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtLecBarCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1167LecBarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1167LecBarCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,48);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLecBarCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtLecBarCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TLECTOR.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 52,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLecBarReo_Internalname, GXutil.ltrim( localUtil.ntoc( A1168LecBarReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtLecBarReo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1168LecBarReo), "9") : localUtil.format( DecimalUtil.doubleToDec(A1168LecBarReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,52);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLecBarReo_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtLecBarReo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TLECTOR.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLecBarPar_Internalname, GXutil.rtrim( A1169LecBarPar), GXutil.rtrim( localUtil.format( A1169LecBarPar, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLecBarPar_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtLecBarPar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TLECTOR.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLecFasOrd_Internalname, GXutil.ltrim( localUtil.ntoc( A1188LecFasOrd, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtLecFasOrd_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1188LecFasOrd), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1188LecFasOrd), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,64);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLecFasOrd_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtLecFasOrd_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TLECTOR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-10 DataContentCell DscTop ExtendedComboCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTablesplittedlecfascod_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblocklecfascod_Internalname, httpContext.getMessage( "Fase", ""), "", "", lblTextblocklecfascod_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_TLECTOR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* User Defined Control */
      ucCombo_lecfascod.setProperty("Caption", Combo_lecfascod_Caption);
      ucCombo_lecfascod.setProperty("Cls", Combo_lecfascod_Cls);
      ucCombo_lecfascod.setProperty("EmptyItem", Combo_lecfascod_Emptyitem);
      ucCombo_lecfascod.setProperty("DropDownOptionsData", AV46LecFasCod_Data);
      ucCombo_lecfascod.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_lecfascod_Internalname, "COMBO_LECFASCODContainer");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 Invisible", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtLecFasCod_Internalname, httpContext.getMessage( "Fase", ""), "col-sm-3 AttributeLabel", 0, true, "");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLecFasCod_Internalname, GXutil.rtrim( A1171LecFasCod), GXutil.rtrim( localUtil.format( A1171LecFasCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,74);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLecFasCod_Jsonclick, 0, "Attribute", "", "", "", "", edtLecFasCod_Visible, edtLecFasCod_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TLECTOR.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 82,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLecNumLot_Internalname, GXutil.ltrim( localUtil.ntoc( A4702LecNumLot, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtLecNumLot_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4702LecNumLot), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4702LecNumLot), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,82);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLecNumLot_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtLecNumLot_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TLECTOR.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLecRecLinM_Internalname, GXutil.ltrim( localUtil.ntoc( A4703LecRecLinM, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtLecRecLinM_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4703LecRecLinM), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4703LecRecLinM), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,86);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLecRecLinM_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtLecRecLinM_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TLECTOR.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblocklecopecod_Internalname, httpContext.getMessage( "Operario", ""), "", "", lblTextblocklecopecod_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_TLECTOR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* User Defined Control */
      ucCombo_lecopecod.setProperty("Caption", Combo_lecopecod_Caption);
      ucCombo_lecopecod.setProperty("Cls", Combo_lecopecod_Cls);
      ucCombo_lecopecod.setProperty("EmptyItem", Combo_lecopecod_Emptyitem);
      ucCombo_lecopecod.setProperty("DropDownOptionsData", AV44LecOpeCod_Data);
      ucCombo_lecopecod.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_lecopecod_Internalname, "COMBO_LECOPECODContainer");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 Invisible", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtLecOpeCod_Internalname, httpContext.getMessage( "Operario", ""), "col-sm-3 AttributeLabel", 0, true, "");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 100,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLecOpeCod_Internalname, GXutil.ltrim( localUtil.ntoc( A1170LecOpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtLecOpeCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1170LecOpeCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1170LecOpeCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,100);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLecOpeCod_Jsonclick, 0, "Attribute", "", "", "", "", edtLecOpeCod_Visible, edtLecOpeCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TLECTOR.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblocklecparcod_Internalname, httpContext.getMessage( "Paro", ""), "", "", lblTextblocklecparcod_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_TLECTOR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* User Defined Control */
      ucCombo_lecparcod.setProperty("Caption", Combo_lecparcod_Caption);
      ucCombo_lecparcod.setProperty("Cls", Combo_lecparcod_Cls);
      ucCombo_lecparcod.setProperty("EmptyItemText", Combo_lecparcod_Emptyitemtext);
      ucCombo_lecparcod.setProperty("DropDownOptionsData", AV41LecParCod_Data);
      ucCombo_lecparcod.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_lecparcod_Internalname, "COMBO_LECPARCODContainer");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 Invisible", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtLecParCod_Internalname, httpContext.getMessage( "Paro", ""), "col-sm-3 AttributeLabel", 0, true, "");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 110,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLecParCod_Internalname, GXutil.ltrim( localUtil.ntoc( A1172LecParCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtLecParCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1172LecParCod), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1172LecParCod), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,110);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLecParCod_Jsonclick, 0, "Attribute", "", "", "", "", edtLecParCod_Visible, edtLecParCod_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TLECTOR.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 118,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtLecFec_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLecFec_Internalname, localUtil.format(A1174LecFec, "99/99/99"), localUtil.format( A1174LecFec, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,118);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLecFec_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtLecFec_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TLECTOR.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtLecFec_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtLecFec_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TLECTOR.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 122,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLecHor_Internalname, GXutil.rtrim( A1173LecHor), GXutil.rtrim( localUtil.format( A1173LecHor, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,122);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLecHor_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtLecHor_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TLECTOR.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell DscTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtLecCombin_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtLecCombin_Internalname, httpContext.getMessage( "Nº Comb", ""), " AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 130,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLecCombin_Internalname, GXutil.rtrim( A4345LecCombin), GXutil.rtrim( localUtil.format( A4345LecCombin, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,130);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLecCombin_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtLecCombin_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TLECTOR.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 134,'',false,'',0)\"" ;
      ClassString = "AttributeFL" ;
      StyleString = "" ;
      app.GxWebStd.gx_checkbox_ctrl( httpContext, chkLecCnc.getInternalname(), GXutil.str( A6832LecCnc, 1, 0), "", httpContext.getMessage( "Cancelada", ""), 1, chkLecCnc.getEnabled(), "1", "", StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(134, this, 1, 0,"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,134);\"");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 139,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TLECTOR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 141,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TLECTOR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 143,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TLECTOR.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV50Pgmname), GXutil.rtrim( localUtil.format( AV50Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TLECTOR.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtavCombolecmaqcod_Internalname, GXutil.rtrim( AV49ComboLecMaqCod), GXutil.rtrim( localUtil.format( AV49ComboLecMaqCod, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCombolecmaqcod_Jsonclick, 0, "Attribute", "", "", "", "", edtavCombolecmaqcod_Visible, edtavCombolecmaqcod_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TLECTOR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divSectionattribute_lecfascod_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavCombolecfascod_Internalname, GXutil.rtrim( AV47ComboLecFasCod), GXutil.rtrim( localUtil.format( AV47ComboLecFasCod, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCombolecfascod_Jsonclick, 0, "Attribute", "", "", "", "", edtavCombolecfascod_Visible, edtavCombolecfascod_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TLECTOR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divSectionattribute_lecopecod_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavCombolecopecod_Internalname, GXutil.ltrim( localUtil.ntoc( AV45ComboLecOpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavCombolecopecod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV45ComboLecOpeCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV45ComboLecOpeCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCombolecopecod_Jsonclick, 0, "Attribute", "", "", "", "", edtavCombolecopecod_Visible, edtavCombolecopecod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TLECTOR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divSectionattribute_lecparcod_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavCombolecparcod_Internalname, GXutil.ltrim( localUtil.ntoc( AV43ComboLecParCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavCombolecparcod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV43ComboLecParCod), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV43ComboLecParCod), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCombolecparcod_Jsonclick, 0, "Attribute", "", "", "", "", edtavCombolecparcod_Visible, edtavCombolecparcod_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TLECTOR.htm");
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
      e11432 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vLECMAQCOD_DATA"), AV48LecMaqCod_Data);
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vLECFASCOD_DATA"), AV46LecFasCod_Data);
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vLECOPECOD_DATA"), AV44LecOpeCod_Data);
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vLECPARCOD_DATA"), AV41LecParCod_Data);
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z1166LecMaqCod = httpContext.cgiGet( "Z1166LecMaqCod") ;
            Z1170LecOpeCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z1170LecOpeCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z1172LecParCod = (short)(localUtil.ctol( httpContext.cgiGet( "Z1172LecParCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z1171LecFasCod = httpContext.cgiGet( "Z1171LecFasCod") ;
            Z1167LecBarCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z1167LecBarCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z1168LecBarReo = (byte)(localUtil.ctol( httpContext.cgiGet( "Z1168LecBarReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z1169LecBarPar = httpContext.cgiGet( "Z1169LecBarPar") ;
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
            A14260LecFasDsc = httpContext.cgiGet( "LECFASDSC") ;
            A14259lecOpeNom = httpContext.cgiGet( "LECOPENOM") ;
            A13722LecEstado = httpContext.cgiGet( "LECESTADO") ;
            A13721LecHdr = httpContext.cgiGet( "LECHDR") ;
            AV22EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            AV36LecMaqCod = httpContext.cgiGet( "vLECMAQCOD") ;
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
            Combo_lecfascod_Objectcall = httpContext.cgiGet( "COMBO_LECFASCOD_Objectcall") ;
            Combo_lecfascod_Class = httpContext.cgiGet( "COMBO_LECFASCOD_Class") ;
            Combo_lecfascod_Icontype = httpContext.cgiGet( "COMBO_LECFASCOD_Icontype") ;
            Combo_lecfascod_Icon = httpContext.cgiGet( "COMBO_LECFASCOD_Icon") ;
            Combo_lecfascod_Caption = httpContext.cgiGet( "COMBO_LECFASCOD_Caption") ;
            Combo_lecfascod_Tooltip = httpContext.cgiGet( "COMBO_LECFASCOD_Tooltip") ;
            Combo_lecfascod_Cls = httpContext.cgiGet( "COMBO_LECFASCOD_Cls") ;
            Combo_lecfascod_Selectedvalue_set = httpContext.cgiGet( "COMBO_LECFASCOD_Selectedvalue_set") ;
            Combo_lecfascod_Selectedvalue_get = httpContext.cgiGet( "COMBO_LECFASCOD_Selectedvalue_get") ;
            Combo_lecfascod_Selectedtext_set = httpContext.cgiGet( "COMBO_LECFASCOD_Selectedtext_set") ;
            Combo_lecfascod_Selectedtext_get = httpContext.cgiGet( "COMBO_LECFASCOD_Selectedtext_get") ;
            Combo_lecfascod_Gamoauthtoken = httpContext.cgiGet( "COMBO_LECFASCOD_Gamoauthtoken") ;
            Combo_lecfascod_Ddointernalname = httpContext.cgiGet( "COMBO_LECFASCOD_Ddointernalname") ;
            Combo_lecfascod_Titlecontrolalign = httpContext.cgiGet( "COMBO_LECFASCOD_Titlecontrolalign") ;
            Combo_lecfascod_Dropdownoptionstype = httpContext.cgiGet( "COMBO_LECFASCOD_Dropdownoptionstype") ;
            Combo_lecfascod_Enabled = GXutil.strtobool( httpContext.cgiGet( "COMBO_LECFASCOD_Enabled")) ;
            Combo_lecfascod_Visible = GXutil.strtobool( httpContext.cgiGet( "COMBO_LECFASCOD_Visible")) ;
            Combo_lecfascod_Titlecontrolidtoreplace = httpContext.cgiGet( "COMBO_LECFASCOD_Titlecontrolidtoreplace") ;
            Combo_lecfascod_Datalisttype = httpContext.cgiGet( "COMBO_LECFASCOD_Datalisttype") ;
            Combo_lecfascod_Allowmultipleselection = GXutil.strtobool( httpContext.cgiGet( "COMBO_LECFASCOD_Allowmultipleselection")) ;
            Combo_lecfascod_Datalistfixedvalues = httpContext.cgiGet( "COMBO_LECFASCOD_Datalistfixedvalues") ;
            Combo_lecfascod_Isgriditem = GXutil.strtobool( httpContext.cgiGet( "COMBO_LECFASCOD_Isgriditem")) ;
            Combo_lecfascod_Hasdescription = GXutil.strtobool( httpContext.cgiGet( "COMBO_LECFASCOD_Hasdescription")) ;
            Combo_lecfascod_Datalistproc = httpContext.cgiGet( "COMBO_LECFASCOD_Datalistproc") ;
            Combo_lecfascod_Datalistprocparametersprefix = httpContext.cgiGet( "COMBO_LECFASCOD_Datalistprocparametersprefix") ;
            Combo_lecfascod_Remoteservicesparameters = httpContext.cgiGet( "COMBO_LECFASCOD_Remoteservicesparameters") ;
            Combo_lecfascod_Datalistupdateminimumcharacters = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_LECFASCOD_Datalistupdateminimumcharacters"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_lecfascod_Includeonlyselectedoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_LECFASCOD_Includeonlyselectedoption")) ;
            Combo_lecfascod_Includeselectalloption = GXutil.strtobool( httpContext.cgiGet( "COMBO_LECFASCOD_Includeselectalloption")) ;
            Combo_lecfascod_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_LECFASCOD_Emptyitem")) ;
            Combo_lecfascod_Includeaddnewoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_LECFASCOD_Includeaddnewoption")) ;
            Combo_lecfascod_Htmltemplate = httpContext.cgiGet( "COMBO_LECFASCOD_Htmltemplate") ;
            Combo_lecfascod_Multiplevaluestype = httpContext.cgiGet( "COMBO_LECFASCOD_Multiplevaluestype") ;
            Combo_lecfascod_Loadingdata = httpContext.cgiGet( "COMBO_LECFASCOD_Loadingdata") ;
            Combo_lecfascod_Noresultsfound = httpContext.cgiGet( "COMBO_LECFASCOD_Noresultsfound") ;
            Combo_lecfascod_Emptyitemtext = httpContext.cgiGet( "COMBO_LECFASCOD_Emptyitemtext") ;
            Combo_lecfascod_Onlyselectedvalues = httpContext.cgiGet( "COMBO_LECFASCOD_Onlyselectedvalues") ;
            Combo_lecfascod_Selectalltext = httpContext.cgiGet( "COMBO_LECFASCOD_Selectalltext") ;
            Combo_lecfascod_Multiplevaluesseparator = httpContext.cgiGet( "COMBO_LECFASCOD_Multiplevaluesseparator") ;
            Combo_lecfascod_Addnewoptiontext = httpContext.cgiGet( "COMBO_LECFASCOD_Addnewoptiontext") ;
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
            A1171LecFasCod = httpContext.cgiGet( edtLecFasCod_Internalname) ;
            n1171LecFasCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1171LecFasCod", A1171LecFasCod);
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
            AV50Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV50Pgmname", AV50Pgmname);
            AV49ComboLecMaqCod = httpContext.cgiGet( edtavCombolecmaqcod_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV49ComboLecMaqCod", AV49ComboLecMaqCod);
            AV47ComboLecFasCod = httpContext.cgiGet( edtavCombolecfascod_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV47ComboLecFasCod", AV47ComboLecFasCod);
            AV45ComboLecOpeCod = (int)(localUtil.ctol( httpContext.cgiGet( edtavCombolecopecod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV45ComboLecOpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45ComboLecOpeCod), 6, 0));
            AV43ComboLecParCod = (short)(localUtil.ctol( httpContext.cgiGet( edtavCombolecparcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV43ComboLecParCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43ComboLecParCod), 4, 0));
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"TLECTOR");
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( GXutil.strcmp(A1166LecMaqCod, Z1166LecMaqCod) != 0 ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("tlector:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
                        confirm_430( ) ;
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
                        e11432 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e12432 ();
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
         e12432 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll43156( ) ;
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
         disableAttributes43156( ) ;
      }
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavCombolecmaqcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombolecmaqcod_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavCombolecfascod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombolecfascod_Enabled), 5, 0), true);
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

   public void confirm_430( )
   {
      beforeValidate43156( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls43156( ) ;
         }
         else
         {
            checkExtendedTable43156( ) ;
            closeExtendedTableCursors43156( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
   }

   public void resetCaption430( )
   {
   }

   public void e11432( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV19Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      tlector_impl.this.GXt_char1 = GXv_char2[0] ;
      AV19Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19Station", AV19Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV16EmprNom ;
      GXv_char4[0] = AV17UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV19Station, GXv_char2, GXv_char3, GXv_char4) ;
      tlector_impl.this.A396EmprCod = GXv_char2[0] ;
      tlector_impl.this.AV16EmprNom = GXv_char3[0] ;
      tlector_impl.this.AV17UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV16EmprNom", AV16EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
      GXt_int5 = AV35FlagLav ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "LAVAND", ""), GXv_int6) ;
      tlector_impl.this.GXt_int5 = GXv_int6[0] ;
      AV35FlagLav = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35FlagLav", GXutil.str( AV35FlagLav, 1, 0));
      GXt_char1 = AV19Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      tlector_impl.this.GXt_char1 = GXv_char4[0] ;
      AV19Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19Station", AV19Station);
      GXv_char4[0] = AV22EmprCod ;
      GXv_char3[0] = AV16EmprNom ;
      GXv_char2[0] = AV17UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV19Station, GXv_char4, GXv_char3, GXv_char2) ;
      tlector_impl.this.AV22EmprCod = GXv_char4[0] ;
      tlector_impl.this.AV16EmprNom = GXv_char3[0] ;
      tlector_impl.this.AV17UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22EmprCod", AV22EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV22EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV16EmprNom", AV16EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
      GXv_SdtWWPContext7[0] = AV38WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext7) ;
      AV38WWPContext = GXv_SdtWWPContext7[0] ;
      edtLecParCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLecParCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLecParCod_Visible), 5, 0), true);
      AV43ComboLecParCod = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV43ComboLecParCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43ComboLecParCod), 4, 0));
      edtavCombolecparcod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCombolecparcod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombolecparcod_Visible), 5, 0), true);
      edtLecOpeCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLecOpeCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLecOpeCod_Visible), 5, 0), true);
      AV45ComboLecOpeCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV45ComboLecOpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45ComboLecOpeCod), 6, 0));
      edtavCombolecopecod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCombolecopecod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombolecopecod_Visible), 5, 0), true);
      edtLecFasCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLecFasCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLecFasCod_Visible), 5, 0), true);
      AV47ComboLecFasCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV47ComboLecFasCod", AV47ComboLecFasCod);
      edtavCombolecfascod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCombolecfascod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombolecfascod_Visible), 5, 0), true);
      edtLecMaqCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLecMaqCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLecMaqCod_Visible), 5, 0), true);
      AV49ComboLecMaqCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV49ComboLecMaqCod", AV49ComboLecMaqCod);
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
      /* Execute user subroutine: 'LOADCOMBOLECFASCOD' */
      S122 ();
      if ( returnInSub )
      {
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      /* Execute user subroutine: 'LOADCOMBOLECOPECOD' */
      S132 ();
      if ( returnInSub )
      {
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      /* Execute user subroutine: 'LOADCOMBOLECPARCOD' */
      S142 ();
      if ( returnInSub )
      {
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      AV39TrnContext.fromxml(AV40WebSession.getValue("TrnContext"), null, null);
   }

   public void e12432( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV39TrnContext.getgxTv_SdtWWPTransactionContext_Callerondelete() )
      {
         callWebObject(formatLink("app.tlectorww", new String[] {}, new String[] {}) );
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

   public void S142( )
   {
      /* 'LOADCOMBOLECPARCOD' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTComboData_Item8 = AV41LecParCod_Data ;
      GXv_char4[0] = AV42ComboSelectedValue ;
      GXv_objcol_SdtDVB_SDTComboData_Item9[0] = GXt_objcol_SdtDVB_SDTComboData_Item8 ;
      new app.tlectorloaddvcombo(remoteHandle, context).execute( "LecParCod", Gx_mode, AV22EmprCod, AV36LecMaqCod, GXv_char4, GXv_objcol_SdtDVB_SDTComboData_Item9) ;
      tlector_impl.this.AV42ComboSelectedValue = GXv_char4[0] ;
      GXt_objcol_SdtDVB_SDTComboData_Item8 = GXv_objcol_SdtDVB_SDTComboData_Item9[0] ;
      AV41LecParCod_Data = GXt_objcol_SdtDVB_SDTComboData_Item8 ;
      Combo_lecparcod_Selectedvalue_set = AV42ComboSelectedValue ;
      ucCombo_lecparcod.sendProperty(context, "", false, Combo_lecparcod_Internalname, "SelectedValue_set", Combo_lecparcod_Selectedvalue_set);
      AV43ComboLecParCod = (short)(GXutil.lval( AV42ComboSelectedValue)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV43ComboLecParCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43ComboLecParCod), 4, 0));
      if ( ( GXutil.strcmp(Gx_mode, "DSP") == 0 ) || ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) )
      {
         Combo_lecparcod_Enabled = false ;
         ucCombo_lecparcod.sendProperty(context, "", false, Combo_lecparcod_Internalname, "Enabled", GXutil.booltostr( Combo_lecparcod_Enabled));
      }
   }

   public void S132( )
   {
      /* 'LOADCOMBOLECOPECOD' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTComboData_Item8 = AV44LecOpeCod_Data ;
      GXv_char4[0] = AV42ComboSelectedValue ;
      GXv_objcol_SdtDVB_SDTComboData_Item9[0] = GXt_objcol_SdtDVB_SDTComboData_Item8 ;
      new app.tlectorloaddvcombo(remoteHandle, context).execute( "LecOpeCod", Gx_mode, AV22EmprCod, AV36LecMaqCod, GXv_char4, GXv_objcol_SdtDVB_SDTComboData_Item9) ;
      tlector_impl.this.AV42ComboSelectedValue = GXv_char4[0] ;
      GXt_objcol_SdtDVB_SDTComboData_Item8 = GXv_objcol_SdtDVB_SDTComboData_Item9[0] ;
      AV44LecOpeCod_Data = GXt_objcol_SdtDVB_SDTComboData_Item8 ;
      Combo_lecopecod_Selectedvalue_set = AV42ComboSelectedValue ;
      ucCombo_lecopecod.sendProperty(context, "", false, Combo_lecopecod_Internalname, "SelectedValue_set", Combo_lecopecod_Selectedvalue_set);
      AV45ComboLecOpeCod = (int)(GXutil.lval( AV42ComboSelectedValue)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV45ComboLecOpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45ComboLecOpeCod), 6, 0));
      if ( ( GXutil.strcmp(Gx_mode, "DSP") == 0 ) || ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) )
      {
         Combo_lecopecod_Enabled = false ;
         ucCombo_lecopecod.sendProperty(context, "", false, Combo_lecopecod_Internalname, "Enabled", GXutil.booltostr( Combo_lecopecod_Enabled));
      }
   }

   public void S122( )
   {
      /* 'LOADCOMBOLECFASCOD' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTComboData_Item8 = AV46LecFasCod_Data ;
      GXv_char4[0] = AV42ComboSelectedValue ;
      GXv_objcol_SdtDVB_SDTComboData_Item9[0] = GXt_objcol_SdtDVB_SDTComboData_Item8 ;
      new app.tlectorloaddvcombo(remoteHandle, context).execute( "LecFasCod", Gx_mode, AV22EmprCod, AV36LecMaqCod, GXv_char4, GXv_objcol_SdtDVB_SDTComboData_Item9) ;
      tlector_impl.this.AV42ComboSelectedValue = GXv_char4[0] ;
      GXt_objcol_SdtDVB_SDTComboData_Item8 = GXv_objcol_SdtDVB_SDTComboData_Item9[0] ;
      AV46LecFasCod_Data = GXt_objcol_SdtDVB_SDTComboData_Item8 ;
      Combo_lecfascod_Selectedvalue_set = AV42ComboSelectedValue ;
      ucCombo_lecfascod.sendProperty(context, "", false, Combo_lecfascod_Internalname, "SelectedValue_set", Combo_lecfascod_Selectedvalue_set);
      AV47ComboLecFasCod = AV42ComboSelectedValue ;
      httpContext.ajax_rsp_assign_attri("", false, "AV47ComboLecFasCod", AV47ComboLecFasCod);
      if ( ( GXutil.strcmp(Gx_mode, "DSP") == 0 ) || ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) )
      {
         Combo_lecfascod_Enabled = false ;
         ucCombo_lecfascod.sendProperty(context, "", false, Combo_lecfascod_Internalname, "Enabled", GXutil.booltostr( Combo_lecfascod_Enabled));
      }
   }

   public void S112( )
   {
      /* 'LOADCOMBOLECMAQCOD' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTComboData_Item8 = AV48LecMaqCod_Data ;
      GXv_char4[0] = AV42ComboSelectedValue ;
      GXv_objcol_SdtDVB_SDTComboData_Item9[0] = GXt_objcol_SdtDVB_SDTComboData_Item8 ;
      new app.tlectorloaddvcombo(remoteHandle, context).execute( "LecMaqCod", Gx_mode, AV22EmprCod, AV36LecMaqCod, GXv_char4, GXv_objcol_SdtDVB_SDTComboData_Item9) ;
      tlector_impl.this.AV42ComboSelectedValue = GXv_char4[0] ;
      GXt_objcol_SdtDVB_SDTComboData_Item8 = GXv_objcol_SdtDVB_SDTComboData_Item9[0] ;
      AV48LecMaqCod_Data = GXt_objcol_SdtDVB_SDTComboData_Item8 ;
      Combo_lecmaqcod_Selectedvalue_set = AV42ComboSelectedValue ;
      ucCombo_lecmaqcod.sendProperty(context, "", false, Combo_lecmaqcod_Internalname, "SelectedValue_set", Combo_lecmaqcod_Selectedvalue_set);
      AV49ComboLecMaqCod = AV42ComboSelectedValue ;
      httpContext.ajax_rsp_assign_attri("", false, "AV49ComboLecMaqCod", AV49ComboLecMaqCod);
      if ( ( GXutil.strcmp(Gx_mode, "INS") != 0 ) || ! (GXutil.strcmp("", AV36LecMaqCod)==0) )
      {
         Combo_lecmaqcod_Enabled = false ;
         ucCombo_lecmaqcod.sendProperty(context, "", false, Combo_lecmaqcod_Internalname, "Enabled", GXutil.booltostr( Combo_lecmaqcod_Enabled));
      }
   }

   public void zm43156( int GX_JID )
   {
      if ( ( GX_JID == 16 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z1170LecOpeCod = T00433_A1170LecOpeCod[0] ;
            Z1172LecParCod = T00433_A1172LecParCod[0] ;
            Z1171LecFasCod = T00433_A1171LecFasCod[0] ;
            Z1167LecBarCod = T00433_A1167LecBarCod[0] ;
            Z1168LecBarReo = T00433_A1168LecBarReo[0] ;
            Z1169LecBarPar = T00433_A1169LecBarPar[0] ;
            Z1188LecFasOrd = T00433_A1188LecFasOrd[0] ;
            Z1173LecHor = T00433_A1173LecHor[0] ;
            Z1174LecFec = T00433_A1174LecFec[0] ;
            Z1796LecTipEnt = T00433_A1796LecTipEnt[0] ;
            Z4702LecNumLot = T00433_A4702LecNumLot[0] ;
            Z4703LecRecLinM = T00433_A4703LecRecLinM[0] ;
            Z4345LecCombin = T00433_A4345LecCombin[0] ;
            Z6832LecCnc = T00433_A6832LecCnc[0] ;
         }
         else
         {
            Z1170LecOpeCod = A1170LecOpeCod ;
            Z1172LecParCod = A1172LecParCod ;
            Z1171LecFasCod = A1171LecFasCod ;
            Z1167LecBarCod = A1167LecBarCod ;
            Z1168LecBarReo = A1168LecBarReo ;
            Z1169LecBarPar = A1169LecBarPar ;
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
      if ( GX_JID == -16 )
      {
         Z1166LecMaqCod = A1166LecMaqCod ;
         Z1170LecOpeCod = A1170LecOpeCod ;
         Z1172LecParCod = A1172LecParCod ;
         Z1171LecFasCod = A1171LecFasCod ;
         Z1167LecBarCod = A1167LecBarCod ;
         Z1168LecBarReo = A1168LecBarReo ;
         Z1169LecBarPar = A1169LecBarPar ;
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
      AV50Pgmname = "TLECTOR" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV50Pgmname", AV50Pgmname);
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV22EmprCod)==0) )
      {
         A396EmprCod = AV22EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      /* Using cursor T00434 */
      pr_default.execute(2, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T00434_A407EmprNom[0] ;
      n407EmprNom = T00434_n407EmprNom[0] ;
      pr_default.close(2);
      if ( ! (GXutil.strcmp("", AV36LecMaqCod)==0) )
      {
         edtLecMaqCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLecMaqCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLecMaqCod_Enabled), 5, 0), true);
      }
      else
      {
         edtLecMaqCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLecMaqCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLecMaqCod_Enabled), 5, 0), true);
      }
      if ( ! (GXutil.strcmp("", AV36LecMaqCod)==0) )
      {
         edtLecMaqCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLecMaqCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLecMaqCod_Enabled), 5, 0), true);
      }
      if ( ! (GXutil.strcmp("", AV36LecMaqCod)==0) )
      {
         A1166LecMaqCod = AV36LecMaqCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A1166LecMaqCod", A1166LecMaqCod);
      }
      else
      {
         A1166LecMaqCod = AV49ComboLecMaqCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A1166LecMaqCod", A1166LecMaqCod);
      }
   }

   public void standaloneModal( )
   {
      A1171LecFasCod = AV47ComboLecFasCod ;
      n1171LecFasCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1171LecFasCod", A1171LecFasCod);
      A1170LecOpeCod = AV45ComboLecOpeCod ;
      n1170LecOpeCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1170LecOpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1170LecOpeCod), 6, 0));
      A1172LecParCod = AV43ComboLecParCod ;
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
         GXt_char1 = A14260LecFasDsc ;
         GXv_char4[0] = GXt_char1 ;
         new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A1171LecFasCod, GXv_char4) ;
         tlector_impl.this.GXt_char1 = GXv_char4[0] ;
         A14260LecFasDsc = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "A14260LecFasDsc", A14260LecFasDsc);
         GXt_char1 = A14259lecOpeNom ;
         GXv_char4[0] = GXt_char1 ;
         new app.popenom(remoteHandle, context).execute( A396EmprCod, A1170LecOpeCod, GXv_char4) ;
         tlector_impl.this.GXt_char1 = GXv_char4[0] ;
         A14259lecOpeNom = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "A14259lecOpeNom", A14259lecOpeNom);
         GXt_char1 = A14261LecParNom ;
         GXv_char4[0] = GXt_char1 ;
         new app.pparcodnom(remoteHandle, context).execute( A396EmprCod, A1172LecParCod, GXv_char4) ;
         tlector_impl.this.GXt_char1 = GXv_char4[0] ;
         A14261LecParNom = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "A14261LecParNom", A14261LecParNom);
      }
   }

   public void load43156( )
   {
      /* Using cursor T00435 */
      pr_default.execute(3, new Object[] {A396EmprCod, A1166LecMaqCod});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound156 = (short)(1) ;
         A1170LecOpeCod = T00435_A1170LecOpeCod[0] ;
         n1170LecOpeCod = T00435_n1170LecOpeCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1170LecOpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1170LecOpeCod), 6, 0));
         A1172LecParCod = T00435_A1172LecParCod[0] ;
         n1172LecParCod = T00435_n1172LecParCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1172LecParCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1172LecParCod), 4, 0));
         A1171LecFasCod = T00435_A1171LecFasCod[0] ;
         n1171LecFasCod = T00435_n1171LecFasCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1171LecFasCod", A1171LecFasCod);
         A1167LecBarCod = T00435_A1167LecBarCod[0] ;
         n1167LecBarCod = T00435_n1167LecBarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1167LecBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1167LecBarCod), 8, 0));
         A1168LecBarReo = T00435_A1168LecBarReo[0] ;
         n1168LecBarReo = T00435_n1168LecBarReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1168LecBarReo", GXutil.str( A1168LecBarReo, 1, 0));
         A1169LecBarPar = T00435_A1169LecBarPar[0] ;
         n1169LecBarPar = T00435_n1169LecBarPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1169LecBarPar", A1169LecBarPar);
         A1188LecFasOrd = T00435_A1188LecFasOrd[0] ;
         n1188LecFasOrd = T00435_n1188LecFasOrd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1188LecFasOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1188LecFasOrd), 4, 0));
         A1173LecHor = T00435_A1173LecHor[0] ;
         n1173LecHor = T00435_n1173LecHor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1173LecHor", A1173LecHor);
         A1174LecFec = T00435_A1174LecFec[0] ;
         n1174LecFec = T00435_n1174LecFec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1174LecFec", localUtil.format(A1174LecFec, "99/99/99"));
         A407EmprNom = T00435_A407EmprNom[0] ;
         n407EmprNom = T00435_n407EmprNom[0] ;
         A1796LecTipEnt = T00435_A1796LecTipEnt[0] ;
         n1796LecTipEnt = T00435_n1796LecTipEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1796LecTipEnt", A1796LecTipEnt);
         A4702LecNumLot = T00435_A4702LecNumLot[0] ;
         n4702LecNumLot = T00435_n4702LecNumLot[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4702LecNumLot", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4702LecNumLot), 6, 0));
         A4703LecRecLinM = T00435_A4703LecRecLinM[0] ;
         n4703LecRecLinM = T00435_n4703LecRecLinM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4703LecRecLinM", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4703LecRecLinM), 4, 0));
         A4345LecCombin = T00435_A4345LecCombin[0] ;
         n4345LecCombin = T00435_n4345LecCombin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4345LecCombin", A4345LecCombin);
         A6832LecCnc = T00435_A6832LecCnc[0] ;
         n6832LecCnc = T00435_n6832LecCnc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6832LecCnc", GXutil.str( A6832LecCnc, 1, 0));
         zm43156( -16) ;
      }
      pr_default.close(3);
      onLoadActions43156( ) ;
   }

   public void onLoadActions43156( )
   {
      A13721LecHdr = GXutil.str( A1167LecBarCod, 8, 0) + "-" + GXutil.str( A1168LecBarReo, 1, 0) + A1169LecBarPar ;
      httpContext.ajax_rsp_assign_attri("", false, "A13721LecHdr", A13721LecHdr);
      GXt_char1 = A14261LecParNom ;
      GXv_char4[0] = GXt_char1 ;
      new app.pparcodnom(remoteHandle, context).execute( A396EmprCod, A1172LecParCod, GXv_char4) ;
      tlector_impl.this.GXt_char1 = GXv_char4[0] ;
      A14261LecParNom = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14261LecParNom", A14261LecParNom);
      GXt_char1 = A14260LecFasDsc ;
      GXv_char4[0] = GXt_char1 ;
      new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A1171LecFasCod, GXv_char4) ;
      tlector_impl.this.GXt_char1 = GXv_char4[0] ;
      A14260LecFasDsc = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14260LecFasDsc", A14260LecFasDsc);
      GXt_char1 = A14259lecOpeNom ;
      GXv_char4[0] = GXt_char1 ;
      new app.popenom(remoteHandle, context).execute( A396EmprCod, A1170LecOpeCod, GXv_char4) ;
      tlector_impl.this.GXt_char1 = GXv_char4[0] ;
      A14259lecOpeNom = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14259lecOpeNom", A14259lecOpeNom);
      GXt_char1 = A13722LecEstado ;
      GXv_char4[0] = GXt_char1 ;
      new app.procedure4(remoteHandle, context).execute( A396EmprCod, A1167LecBarCod, A1168LecBarReo, A1169LecBarPar, A1188LecFasOrd, GXv_char4) ;
      tlector_impl.this.GXt_char1 = GXv_char4[0] ;
      A13722LecEstado = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A13722LecEstado", A13722LecEstado);
   }

   public void checkExtendedTable43156( )
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
      tlector_impl.this.GXt_char1 = GXv_char4[0] ;
      A14261LecParNom = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14261LecParNom", A14261LecParNom);
      nIsDirty_156 = (short)(1) ;
      GXt_char1 = A14260LecFasDsc ;
      GXv_char4[0] = GXt_char1 ;
      new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A1171LecFasCod, GXv_char4) ;
      tlector_impl.this.GXt_char1 = GXv_char4[0] ;
      A14260LecFasDsc = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14260LecFasDsc", A14260LecFasDsc);
      nIsDirty_156 = (short)(1) ;
      GXt_char1 = A14259lecOpeNom ;
      GXv_char4[0] = GXt_char1 ;
      new app.popenom(remoteHandle, context).execute( A396EmprCod, A1170LecOpeCod, GXv_char4) ;
      tlector_impl.this.GXt_char1 = GXv_char4[0] ;
      A14259lecOpeNom = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14259lecOpeNom", A14259lecOpeNom);
      nIsDirty_156 = (short)(1) ;
      GXt_char1 = A13722LecEstado ;
      GXv_char4[0] = GXt_char1 ;
      new app.procedure4(remoteHandle, context).execute( A396EmprCod, A1167LecBarCod, A1168LecBarReo, A1169LecBarPar, A1188LecFasOrd, GXv_char4) ;
      tlector_impl.this.GXt_char1 = GXv_char4[0] ;
      A13722LecEstado = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A13722LecEstado", A13722LecEstado);
   }

   public void closeExtendedTableCursors43156( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey43156( )
   {
      /* Using cursor T00436 */
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
      /* Using cursor T00433 */
      pr_default.execute(1, new Object[] {A396EmprCod, A1166LecMaqCod});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T00433_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm43156( 16) ;
         RcdFound156 = (short)(1) ;
         A1166LecMaqCod = T00433_A1166LecMaqCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1166LecMaqCod", A1166LecMaqCod);
         A1170LecOpeCod = T00433_A1170LecOpeCod[0] ;
         n1170LecOpeCod = T00433_n1170LecOpeCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1170LecOpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1170LecOpeCod), 6, 0));
         A1172LecParCod = T00433_A1172LecParCod[0] ;
         n1172LecParCod = T00433_n1172LecParCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1172LecParCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1172LecParCod), 4, 0));
         A1171LecFasCod = T00433_A1171LecFasCod[0] ;
         n1171LecFasCod = T00433_n1171LecFasCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1171LecFasCod", A1171LecFasCod);
         A1167LecBarCod = T00433_A1167LecBarCod[0] ;
         n1167LecBarCod = T00433_n1167LecBarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1167LecBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1167LecBarCod), 8, 0));
         A1168LecBarReo = T00433_A1168LecBarReo[0] ;
         n1168LecBarReo = T00433_n1168LecBarReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1168LecBarReo", GXutil.str( A1168LecBarReo, 1, 0));
         A1169LecBarPar = T00433_A1169LecBarPar[0] ;
         n1169LecBarPar = T00433_n1169LecBarPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1169LecBarPar", A1169LecBarPar);
         A1188LecFasOrd = T00433_A1188LecFasOrd[0] ;
         n1188LecFasOrd = T00433_n1188LecFasOrd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1188LecFasOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1188LecFasOrd), 4, 0));
         A1173LecHor = T00433_A1173LecHor[0] ;
         n1173LecHor = T00433_n1173LecHor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1173LecHor", A1173LecHor);
         A1174LecFec = T00433_A1174LecFec[0] ;
         n1174LecFec = T00433_n1174LecFec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1174LecFec", localUtil.format(A1174LecFec, "99/99/99"));
         A1796LecTipEnt = T00433_A1796LecTipEnt[0] ;
         n1796LecTipEnt = T00433_n1796LecTipEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1796LecTipEnt", A1796LecTipEnt);
         A4702LecNumLot = T00433_A4702LecNumLot[0] ;
         n4702LecNumLot = T00433_n4702LecNumLot[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4702LecNumLot", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4702LecNumLot), 6, 0));
         A4703LecRecLinM = T00433_A4703LecRecLinM[0] ;
         n4703LecRecLinM = T00433_n4703LecRecLinM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4703LecRecLinM", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4703LecRecLinM), 4, 0));
         A4345LecCombin = T00433_A4345LecCombin[0] ;
         n4345LecCombin = T00433_n4345LecCombin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4345LecCombin", A4345LecCombin);
         A6832LecCnc = T00433_A6832LecCnc[0] ;
         n6832LecCnc = T00433_n6832LecCnc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6832LecCnc", GXutil.str( A6832LecCnc, 1, 0));
         Z396EmprCod = A396EmprCod ;
         Z1166LecMaqCod = A1166LecMaqCod ;
         sMode156 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load43156( ) ;
         if ( AnyError == 1 )
         {
            RcdFound156 = (short)(0) ;
            initializeNonKey43156( ) ;
         }
         Gx_mode = sMode156 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound156 = (short)(0) ;
         initializeNonKey43156( ) ;
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
      getKey43156( ) ;
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
      /* Using cursor T00437 */
      pr_default.execute(5, new Object[] {A1166LecMaqCod, A396EmprCod});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( ( GXutil.strcmp(T00437_A1166LecMaqCod[0], A1166LecMaqCod) < 0 ) ) && ( GXutil.strcmp(T00437_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( ( GXutil.strcmp(T00437_A1166LecMaqCod[0], A1166LecMaqCod) > 0 ) ) && ( GXutil.strcmp(T00437_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A1166LecMaqCod = T00437_A1166LecMaqCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A1166LecMaqCod", A1166LecMaqCod);
            RcdFound156 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void move_previous( )
   {
      RcdFound156 = (short)(0) ;
      /* Using cursor T00438 */
      pr_default.execute(6, new Object[] {A1166LecMaqCod, A396EmprCod});
      if ( (pr_default.getStatus(6) != 101) )
      {
         while ( (pr_default.getStatus(6) != 101) && ( ( GXutil.strcmp(T00438_A1166LecMaqCod[0], A1166LecMaqCod) > 0 ) ) && ( GXutil.strcmp(T00438_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(6);
         }
         if ( (pr_default.getStatus(6) != 101) && ( ( GXutil.strcmp(T00438_A1166LecMaqCod[0], A1166LecMaqCod) < 0 ) ) && ( GXutil.strcmp(T00438_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A1166LecMaqCod = T00438_A1166LecMaqCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A1166LecMaqCod", A1166LecMaqCod);
            RcdFound156 = (short)(1) ;
         }
      }
      pr_default.close(6);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey43156( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtLecMaqCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert43156( ) ;
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
               update43156( ) ;
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
               insert43156( ) ;
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
                  insert43156( ) ;
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

   public void checkOptimisticConcurrency43156( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00432 */
         pr_default.execute(0, new Object[] {A396EmprCod, A1166LecMaqCod});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLECTOR"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( Z1170LecOpeCod != T00432_A1170LecOpeCod[0] ) || ( Z1172LecParCod != T00432_A1172LecParCod[0] ) || ( GXutil.strcmp(Z1171LecFasCod, T00432_A1171LecFasCod[0]) != 0 ) || ( Z1167LecBarCod != T00432_A1167LecBarCod[0] ) || ( Z1168LecBarReo != T00432_A1168LecBarReo[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z1169LecBarPar, T00432_A1169LecBarPar[0]) != 0 ) || ( Z1188LecFasOrd != T00432_A1188LecFasOrd[0] ) || ( GXutil.strcmp(Z1173LecHor, T00432_A1173LecHor[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z1174LecFec), GXutil.resetTime(T00432_A1174LecFec[0])) ) || ( GXutil.strcmp(Z1796LecTipEnt, T00432_A1796LecTipEnt[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z4702LecNumLot != T00432_A4702LecNumLot[0] ) || ( Z4703LecRecLinM != T00432_A4703LecRecLinM[0] ) || ( GXutil.strcmp(Z4345LecCombin, T00432_A4345LecCombin[0]) != 0 ) || ( Z6832LecCnc != T00432_A6832LecCnc[0] ) )
         {
            if ( Z1170LecOpeCod != T00432_A1170LecOpeCod[0] )
            {
               GXutil.writeLogln("tlector:[seudo value changed for attri]"+"LecOpeCod");
               GXutil.writeLogRaw("Old: ",Z1170LecOpeCod);
               GXutil.writeLogRaw("Current: ",T00432_A1170LecOpeCod[0]);
            }
            if ( Z1172LecParCod != T00432_A1172LecParCod[0] )
            {
               GXutil.writeLogln("tlector:[seudo value changed for attri]"+"LecParCod");
               GXutil.writeLogRaw("Old: ",Z1172LecParCod);
               GXutil.writeLogRaw("Current: ",T00432_A1172LecParCod[0]);
            }
            if ( GXutil.strcmp(Z1171LecFasCod, T00432_A1171LecFasCod[0]) != 0 )
            {
               GXutil.writeLogln("tlector:[seudo value changed for attri]"+"LecFasCod");
               GXutil.writeLogRaw("Old: ",Z1171LecFasCod);
               GXutil.writeLogRaw("Current: ",T00432_A1171LecFasCod[0]);
            }
            if ( Z1167LecBarCod != T00432_A1167LecBarCod[0] )
            {
               GXutil.writeLogln("tlector:[seudo value changed for attri]"+"LecBarCod");
               GXutil.writeLogRaw("Old: ",Z1167LecBarCod);
               GXutil.writeLogRaw("Current: ",T00432_A1167LecBarCod[0]);
            }
            if ( Z1168LecBarReo != T00432_A1168LecBarReo[0] )
            {
               GXutil.writeLogln("tlector:[seudo value changed for attri]"+"LecBarReo");
               GXutil.writeLogRaw("Old: ",Z1168LecBarReo);
               GXutil.writeLogRaw("Current: ",T00432_A1168LecBarReo[0]);
            }
            if ( GXutil.strcmp(Z1169LecBarPar, T00432_A1169LecBarPar[0]) != 0 )
            {
               GXutil.writeLogln("tlector:[seudo value changed for attri]"+"LecBarPar");
               GXutil.writeLogRaw("Old: ",Z1169LecBarPar);
               GXutil.writeLogRaw("Current: ",T00432_A1169LecBarPar[0]);
            }
            if ( Z1188LecFasOrd != T00432_A1188LecFasOrd[0] )
            {
               GXutil.writeLogln("tlector:[seudo value changed for attri]"+"LecFasOrd");
               GXutil.writeLogRaw("Old: ",Z1188LecFasOrd);
               GXutil.writeLogRaw("Current: ",T00432_A1188LecFasOrd[0]);
            }
            if ( GXutil.strcmp(Z1173LecHor, T00432_A1173LecHor[0]) != 0 )
            {
               GXutil.writeLogln("tlector:[seudo value changed for attri]"+"LecHor");
               GXutil.writeLogRaw("Old: ",Z1173LecHor);
               GXutil.writeLogRaw("Current: ",T00432_A1173LecHor[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z1174LecFec), GXutil.resetTime(T00432_A1174LecFec[0])) ) )
            {
               GXutil.writeLogln("tlector:[seudo value changed for attri]"+"LecFec");
               GXutil.writeLogRaw("Old: ",Z1174LecFec);
               GXutil.writeLogRaw("Current: ",T00432_A1174LecFec[0]);
            }
            if ( GXutil.strcmp(Z1796LecTipEnt, T00432_A1796LecTipEnt[0]) != 0 )
            {
               GXutil.writeLogln("tlector:[seudo value changed for attri]"+"LecTipEnt");
               GXutil.writeLogRaw("Old: ",Z1796LecTipEnt);
               GXutil.writeLogRaw("Current: ",T00432_A1796LecTipEnt[0]);
            }
            if ( Z4702LecNumLot != T00432_A4702LecNumLot[0] )
            {
               GXutil.writeLogln("tlector:[seudo value changed for attri]"+"LecNumLot");
               GXutil.writeLogRaw("Old: ",Z4702LecNumLot);
               GXutil.writeLogRaw("Current: ",T00432_A4702LecNumLot[0]);
            }
            if ( Z4703LecRecLinM != T00432_A4703LecRecLinM[0] )
            {
               GXutil.writeLogln("tlector:[seudo value changed for attri]"+"LecRecLinM");
               GXutil.writeLogRaw("Old: ",Z4703LecRecLinM);
               GXutil.writeLogRaw("Current: ",T00432_A4703LecRecLinM[0]);
            }
            if ( GXutil.strcmp(Z4345LecCombin, T00432_A4345LecCombin[0]) != 0 )
            {
               GXutil.writeLogln("tlector:[seudo value changed for attri]"+"LecCombin");
               GXutil.writeLogRaw("Old: ",Z4345LecCombin);
               GXutil.writeLogRaw("Current: ",T00432_A4345LecCombin[0]);
            }
            if ( Z6832LecCnc != T00432_A6832LecCnc[0] )
            {
               GXutil.writeLogln("tlector:[seudo value changed for attri]"+"LecCnc");
               GXutil.writeLogRaw("Old: ",Z6832LecCnc);
               GXutil.writeLogRaw("Current: ",T00432_A6832LecCnc[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPLECTOR"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert43156( )
   {
      beforeValidate43156( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable43156( ) ;
      }
      if ( AnyError == 0 )
      {
         zm43156( 0) ;
         checkOptimisticConcurrency43156( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm43156( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert43156( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00439 */
                  pr_default.execute(7, new Object[] {A1166LecMaqCod, Boolean.valueOf(n1170LecOpeCod), Integer.valueOf(A1170LecOpeCod), Boolean.valueOf(n1172LecParCod), Short.valueOf(A1172LecParCod), Boolean.valueOf(n1171LecFasCod), A1171LecFasCod, Boolean.valueOf(n1167LecBarCod), Integer.valueOf(A1167LecBarCod), Boolean.valueOf(n1168LecBarReo), Byte.valueOf(A1168LecBarReo), Boolean.valueOf(n1169LecBarPar), A1169LecBarPar, Boolean.valueOf(n1188LecFasOrd), Short.valueOf(A1188LecFasOrd), Boolean.valueOf(n1173LecHor), A1173LecHor, Boolean.valueOf(n1174LecFec), A1174LecFec, Boolean.valueOf(n1796LecTipEnt), A1796LecTipEnt, Boolean.valueOf(n4702LecNumLot), Integer.valueOf(A4702LecNumLot), Boolean.valueOf(n4703LecRecLinM), Short.valueOf(A4703LecRecLinM), Boolean.valueOf(n4345LecCombin), A4345LecCombin, Boolean.valueOf(n6832LecCnc), Byte.valueOf(A6832LecCnc), A396EmprCod});
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
                        resetCaption430( ) ;
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
            load43156( ) ;
         }
         endLevel43156( ) ;
      }
      closeExtendedTableCursors43156( ) ;
   }

   public void update43156( )
   {
      beforeValidate43156( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable43156( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency43156( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm43156( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate43156( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T004310 */
                  pr_default.execute(8, new Object[] {Boolean.valueOf(n1170LecOpeCod), Integer.valueOf(A1170LecOpeCod), Boolean.valueOf(n1172LecParCod), Short.valueOf(A1172LecParCod), Boolean.valueOf(n1171LecFasCod), A1171LecFasCod, Boolean.valueOf(n1167LecBarCod), Integer.valueOf(A1167LecBarCod), Boolean.valueOf(n1168LecBarReo), Byte.valueOf(A1168LecBarReo), Boolean.valueOf(n1169LecBarPar), A1169LecBarPar, Boolean.valueOf(n1188LecFasOrd), Short.valueOf(A1188LecFasOrd), Boolean.valueOf(n1173LecHor), A1173LecHor, Boolean.valueOf(n1174LecFec), A1174LecFec, Boolean.valueOf(n1796LecTipEnt), A1796LecTipEnt, Boolean.valueOf(n4702LecNumLot), Integer.valueOf(A4702LecNumLot), Boolean.valueOf(n4703LecRecLinM), Short.valueOf(A4703LecRecLinM), Boolean.valueOf(n4345LecCombin), A4345LecCombin, Boolean.valueOf(n6832LecCnc), Byte.valueOf(A6832LecCnc), A396EmprCod, A1166LecMaqCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLECTOR");
                  if ( (pr_default.getStatus(8) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLECTOR"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate43156( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     if ( ( GXutil.strcmp(A1796LecTipEnt, httpContext.getMessage( "H", "")) == 0 ) && true /* After */ )
                     {
                        GXv_char4[0] = A396EmprCod ;
                        GXv_char3[0] = A1166LecMaqCod ;
                        new app.plecdelt(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
                        tlector_impl.this.A396EmprCod = GXv_char4[0] ;
                        tlector_impl.this.A1166LecMaqCod = GXv_char3[0] ;
                        httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
                        httpContext.ajax_rsp_assign_attri("", false, "A1166LecMaqCod", A1166LecMaqCod);
                     }
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
         endLevel43156( ) ;
      }
      closeExtendedTableCursors43156( ) ;
   }

   public void deferredUpdate43156( )
   {
   }

   public void delete( )
   {
      beforeValidate43156( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency43156( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls43156( ) ;
         afterConfirm43156( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete43156( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T004311 */
               pr_default.execute(9, new Object[] {A396EmprCod, A1166LecMaqCod});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLECTOR");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  if ( true /* After */ )
                  {
                     GXv_char4[0] = A396EmprCod ;
                     GXv_char3[0] = A1166LecMaqCod ;
                     new app.plecdelt(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
                     tlector_impl.this.A396EmprCod = GXv_char4[0] ;
                     tlector_impl.this.A1166LecMaqCod = GXv_char3[0] ;
                     httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
                     httpContext.ajax_rsp_assign_attri("", false, "A1166LecMaqCod", A1166LecMaqCod);
                  }
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
      endLevel43156( ) ;
      Gx_mode = sMode156 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls43156( )
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
         tlector_impl.this.GXt_char1 = GXv_char4[0] ;
         A14261LecParNom = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "A14261LecParNom", A14261LecParNom);
         GXt_char1 = A14260LecFasDsc ;
         GXv_char4[0] = GXt_char1 ;
         new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A1171LecFasCod, GXv_char4) ;
         tlector_impl.this.GXt_char1 = GXv_char4[0] ;
         A14260LecFasDsc = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "A14260LecFasDsc", A14260LecFasDsc);
         GXt_char1 = A14259lecOpeNom ;
         GXv_char4[0] = GXt_char1 ;
         new app.popenom(remoteHandle, context).execute( A396EmprCod, A1170LecOpeCod, GXv_char4) ;
         tlector_impl.this.GXt_char1 = GXv_char4[0] ;
         A14259lecOpeNom = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "A14259lecOpeNom", A14259lecOpeNom);
         GXt_char1 = A13722LecEstado ;
         GXv_char4[0] = GXt_char1 ;
         new app.procedure4(remoteHandle, context).execute( A396EmprCod, A1167LecBarCod, A1168LecBarReo, A1169LecBarPar, A1188LecFasOrd, GXv_char4) ;
         tlector_impl.this.GXt_char1 = GXv_char4[0] ;
         A13722LecEstado = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "A13722LecEstado", A13722LecEstado);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T004312 */
         pr_default.execute(10, new Object[] {A396EmprCod, A1166LecMaqCod});
         if ( (pr_default.getStatus(10) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LECLAV", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(10);
      }
   }

   public void endLevel43156( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete43156( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tlector");
         if ( AnyError == 0 )
         {
            confirmValues430( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tlector");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart43156( )
   {
      /* Scan By routine */
      /* Using cursor T004313 */
      pr_default.execute(11, new Object[] {A396EmprCod});
      RcdFound156 = (short)(0) ;
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound156 = (short)(1) ;
         A1166LecMaqCod = T004313_A1166LecMaqCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1166LecMaqCod", A1166LecMaqCod);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext43156( )
   {
      /* Scan next routine */
      pr_default.readNext(11);
      RcdFound156 = (short)(0) ;
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound156 = (short)(1) ;
         A1166LecMaqCod = T004313_A1166LecMaqCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1166LecMaqCod", A1166LecMaqCod);
      }
   }

   public void scanEnd43156( )
   {
      pr_default.close(11);
   }

   public void afterConfirm43156( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert43156( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate43156( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete43156( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete43156( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate43156( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes43156( )
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
      edtavCombolecfascod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCombolecfascod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombolecfascod_Enabled), 5, 0), true);
      edtavCombolecopecod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCombolecopecod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombolecopecod_Enabled), 5, 0), true);
      edtavCombolecparcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCombolecparcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombolecparcod_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes43156( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues430( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.tlector", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV22EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV36LecMaqCod))}, new String[] {"Gx_mode","EmprCod","LecMaqCod"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"TLECTOR");
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("tlector:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z1171LecFasCod", GXutil.rtrim( Z1171LecFasCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1167LecBarCod", GXutil.ltrim( localUtil.ntoc( Z1167LecBarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1168LecBarReo", GXutil.ltrim( localUtil.ntoc( Z1168LecBarReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1169LecBarPar", GXutil.rtrim( Z1169LecBarPar));
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
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vLECMAQCOD_DATA", AV48LecMaqCod_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vLECMAQCOD_DATA", AV48LecMaqCod_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vLECFASCOD_DATA", AV46LecFasCod_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vLECFASCOD_DATA", AV46LecFasCod_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vLECOPECOD_DATA", AV44LecOpeCod_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vLECOPECOD_DATA", AV44LecOpeCod_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vLECPARCOD_DATA", AV41LecParCod_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vLECPARCOD_DATA", AV41LecParCod_Data);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTRNCONTEXT", AV39TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTRNCONTEXT", AV39TrnContext);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTRNCONTEXT", getSecureSignedToken( "", AV39TrnContext));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "LECPARNOM", GXutil.rtrim( A14261LecParNom));
      app.GxWebStd.gx_hidden_field( httpContext, "LECFASDSC", GXutil.rtrim( A14260LecFasDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "LECOPENOM", GXutil.rtrim( A14259lecOpeNom));
      app.GxWebStd.gx_hidden_field( httpContext, "LECESTADO", GXutil.rtrim( A13722LecEstado));
      app.GxWebStd.gx_hidden_field( httpContext, "LECHDR", GXutil.rtrim( A13721LecHdr));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV22EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV22EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vLECMAQCOD", GXutil.rtrim( AV36LecMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vLECMAQCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV36LecMaqCod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRNOM", GXutil.rtrim( A407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_LECMAQCOD_Objectcall", GXutil.rtrim( Combo_lecmaqcod_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_LECMAQCOD_Cls", GXutil.rtrim( Combo_lecmaqcod_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_LECMAQCOD_Selectedvalue_set", GXutil.rtrim( Combo_lecmaqcod_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_LECMAQCOD_Enabled", GXutil.booltostr( Combo_lecmaqcod_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_LECMAQCOD_Emptyitem", GXutil.booltostr( Combo_lecmaqcod_Emptyitem));
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
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_LECFASCOD_Objectcall", GXutil.rtrim( Combo_lecfascod_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_LECFASCOD_Cls", GXutil.rtrim( Combo_lecfascod_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_LECFASCOD_Selectedvalue_set", GXutil.rtrim( Combo_lecfascod_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_LECFASCOD_Enabled", GXutil.booltostr( Combo_lecfascod_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_LECFASCOD_Emptyitem", GXutil.booltostr( Combo_lecfascod_Emptyitem));
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
      return formatLink("app.tlector", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV22EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV36LecMaqCod))}, new String[] {"Gx_mode","EmprCod","LecMaqCod"})  ;
   }

   public String getPgmname( )
   {
      return "TLECTOR" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Mantenimiento tabla LECTOR", "") ;
   }

   public void initializeNonKey43156( )
   {
      A1170LecOpeCod = 0 ;
      n1170LecOpeCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1170LecOpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1170LecOpeCod), 6, 0));
      A1172LecParCod = (short)(0) ;
      n1172LecParCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1172LecParCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1172LecParCod), 4, 0));
      A1171LecFasCod = "" ;
      n1171LecFasCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1171LecFasCod", A1171LecFasCod);
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
      Z1171LecFasCod = "" ;
      Z1167LecBarCod = 0 ;
      Z1168LecBarReo = (byte)(0) ;
      Z1169LecBarPar = "" ;
      Z1188LecFasOrd = (short)(0) ;
      Z1173LecHor = "" ;
      Z1174LecFec = GXutil.nullDate() ;
      Z1796LecTipEnt = "" ;
      Z4702LecNumLot = 0 ;
      Z4703LecRecLinM = (short)(0) ;
      Z4345LecCombin = "" ;
      Z6832LecCnc = (byte)(0) ;
   }

   public void initAll43156( )
   {
      A1166LecMaqCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A1166LecMaqCod", A1166LecMaqCod);
      initializeNonKey43156( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211653879", true, true);
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
      httpContext.AddJavascriptSource("tlector.js", "?20268211653880", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
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
      divUnnamedtable8_Internalname = "UNNAMEDTABLE8" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      edtLecBarCod_Internalname = "LECBARCOD" ;
      edtLecBarReo_Internalname = "LECBARREO" ;
      edtLecBarPar_Internalname = "LECBARPAR" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      edtLecFasOrd_Internalname = "LECFASORD" ;
      lblTextblocklecfascod_Internalname = "TEXTBLOCKLECFASCOD" ;
      Combo_lecfascod_Internalname = "COMBO_LECFASCOD" ;
      edtLecFasCod_Internalname = "LECFASCOD" ;
      divTablesplittedlecfascod_Internalname = "TABLESPLITTEDLECFASCOD" ;
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
      chkLecCnc.setInternalname( "LECCNC" );
      divUnnamedtable7_Internalname = "UNNAMEDTABLE7" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = "DVPANEL_UNNAMEDTABLE1" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      bttBtntrn_delete_Internalname = "BTNTRN_DELETE" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtavCombolecmaqcod_Internalname = "vCOMBOLECMAQCOD" ;
      divSectionattribute_lecmaqcod_Internalname = "SECTIONATTRIBUTE_LECMAQCOD" ;
      edtavCombolecfascod_Internalname = "vCOMBOLECFASCOD" ;
      divSectionattribute_lecfascod_Internalname = "SECTIONATTRIBUTE_LECFASCOD" ;
      edtavCombolecopecod_Internalname = "vCOMBOLECOPECOD" ;
      divSectionattribute_lecopecod_Internalname = "SECTIONATTRIBUTE_LECOPECOD" ;
      edtavCombolecparcod_Internalname = "vCOMBOLECPARCOD" ;
      divSectionattribute_lecparcod_Internalname = "SECTIONATTRIBUTE_LECPARCOD" ;
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
      Form.setCaption( httpContext.getMessage( "Mantenimiento tabla LECTOR", "") );
      edtavCombolecparcod_Jsonclick = "" ;
      edtavCombolecparcod_Enabled = 0 ;
      edtavCombolecparcod_Visible = 1 ;
      edtavCombolecopecod_Jsonclick = "" ;
      edtavCombolecopecod_Enabled = 0 ;
      edtavCombolecopecod_Visible = 1 ;
      edtavCombolecfascod_Jsonclick = "" ;
      edtavCombolecfascod_Enabled = 0 ;
      edtavCombolecfascod_Visible = 1 ;
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
      edtLecFasCod_Jsonclick = "" ;
      edtLecFasCod_Enabled = 1 ;
      edtLecFasCod_Visible = 1 ;
      Combo_lecfascod_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_lecfascod_Cls = "ExtendedCombo AttributeFL" ;
      Combo_lecfascod_Enabled = GXutil.toBoolean( -1) ;
      edtLecFasOrd_Jsonclick = "" ;
      edtLecFasOrd_Enabled = 1 ;
      edtLecBarPar_Jsonclick = "" ;
      edtLecBarPar_Enabled = 1 ;
      edtLecBarReo_Jsonclick = "" ;
      edtLecBarReo_Enabled = 1 ;
      edtLecBarCod_Jsonclick = "" ;
      edtLecBarCod_Enabled = 1 ;
      Dvpanel_unnamedtable1_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Iconposition = "Right" ;
      Dvpanel_unnamedtable1_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Title = "" ;
      Dvpanel_unnamedtable1_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable1_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Width = "100%" ;
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

   public void gx1asalecparnom43156( String A396EmprCod ,
                                     short A1172LecParCod )
   {
      GXt_char1 = A14261LecParNom ;
      GXv_char4[0] = GXt_char1 ;
      new app.pparcodnom(remoteHandle, context).execute( A396EmprCod, A1172LecParCod, GXv_char4) ;
      tlector_impl.this.GXt_char1 = GXv_char4[0] ;
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

   public void gx2asalecfasdsc43156( String A396EmprCod ,
                                     String A1171LecFasCod )
   {
      GXt_char1 = A14260LecFasDsc ;
      GXv_char4[0] = GXt_char1 ;
      new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A1171LecFasCod, GXv_char4) ;
      tlector_impl.this.GXt_char1 = GXv_char4[0] ;
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

   public void gx3asalecopenom43156( String A396EmprCod ,
                                     int A1170LecOpeCod )
   {
      GXt_char1 = A14259lecOpeNom ;
      GXv_char4[0] = GXt_char1 ;
      new app.popenom(remoteHandle, context).execute( A396EmprCod, A1170LecOpeCod, GXv_char4) ;
      tlector_impl.this.GXt_char1 = GXv_char4[0] ;
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

   public void gx4asalecestado43156( String A396EmprCod ,
                                     int A1167LecBarCod ,
                                     byte A1168LecBarReo ,
                                     String A1169LecBarPar ,
                                     short A1188LecFasOrd )
   {
      GXt_char1 = A13722LecEstado ;
      GXv_char4[0] = GXt_char1 ;
      new app.procedure4(remoteHandle, context).execute( A396EmprCod, A1167LecBarCod, A1168LecBarReo, A1169LecBarPar, A1188LecFasOrd, GXv_char4) ;
      tlector_impl.this.GXt_char1 = GXv_char4[0] ;
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

   public void xc_14_43156( String A396EmprCod ,
                            String A1166LecMaqCod )
   {
      if ( true /* After */ )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A1166LecMaqCod ;
         new app.plecdelt(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
         A396EmprCod = GXv_char4[0] ;
         A1166LecMaqCod = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A1166LecMaqCod", A1166LecMaqCod);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A1166LecMaqCod))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_15_43156( String A396EmprCod ,
                            String A1166LecMaqCod ,
                            String A1796LecTipEnt )
   {
      if ( ( GXutil.strcmp(A1796LecTipEnt, httpContext.getMessage( "H", "")) == 0 ) && true /* After */ )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A1166LecMaqCod ;
         new app.plecdelt(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
         A396EmprCod = GXv_char4[0] ;
         A1166LecMaqCod = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A1166LecMaqCod", A1166LecMaqCod);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A1166LecMaqCod))+"\"") ;
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
      tlector_impl.this.GXt_char1 = GXv_char4[0] ;
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
      tlector_impl.this.GXt_char1 = GXv_char4[0] ;
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
      tlector_impl.this.GXt_char1 = GXv_char4[0] ;
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
      tlector_impl.this.GXt_char1 = GXv_char4[0] ;
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV22EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV36LecMaqCod',fld:'vLECMAQCOD',pic:'',hsh:true},{av:'A6832LecCnc',fld:'LECCNC',pic:'9'}]");
      setEventMetadata("ENTER",",oparms:[{av:'A6832LecCnc',fld:'LECCNC',pic:'9'}]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV39TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true},{av:'AV22EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV36LecMaqCod',fld:'vLECMAQCOD',pic:'',hsh:true},{av:'A6832LecCnc',fld:'LECCNC',pic:'9'}]");
      setEventMetadata("REFRESH",",oparms:[{av:'A6832LecCnc',fld:'LECCNC',pic:'9'}]}");
      setEventMetadata("AFTER TRN","{handler:'e12432',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV39TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true},{av:'A6832LecCnc',fld:'LECCNC',pic:'9'}]");
      setEventMetadata("AFTER TRN",",oparms:[{av:'A6832LecCnc',fld:'LECCNC',pic:'9'}]}");
      setEventMetadata("VALID_LECMAQCOD","{handler:'valid_Lecmaqcod',iparms:[{av:'A6832LecCnc',fld:'LECCNC',pic:'9'}]");
      setEventMetadata("VALID_LECMAQCOD",",oparms:[{av:'A6832LecCnc',fld:'LECCNC',pic:'9'}]}");
      setEventMetadata("VALID_LECTIPENT","{handler:'valid_Lectipent',iparms:[{av:'A6832LecCnc',fld:'LECCNC',pic:'9'}]");
      setEventMetadata("VALID_LECTIPENT",",oparms:[{av:'A6832LecCnc',fld:'LECCNC',pic:'9'}]}");
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
      setEventMetadata("VALIDV_COMBOLECFASCOD","{handler:'validv_Combolecfascod',iparms:[{av:'A6832LecCnc',fld:'LECCNC',pic:'9'}]");
      setEventMetadata("VALIDV_COMBOLECFASCOD",",oparms:[{av:'A6832LecCnc',fld:'LECCNC',pic:'9'}]}");
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
      wcpOAV22EmprCod = "" ;
      wcpOAV36LecMaqCod = "" ;
      Z396EmprCod = "" ;
      Z1166LecMaqCod = "" ;
      Z1171LecFasCod = "" ;
      Z1169LecBarPar = "" ;
      Z1173LecHor = "" ;
      Z1174LecFec = GXutil.nullDate() ;
      Z1796LecTipEnt = "" ;
      Z4345LecCombin = "" ;
      Combo_lecparcod_Selectedvalue_get = "" ;
      Combo_lecopecod_Selectedvalue_get = "" ;
      Combo_lecfascod_Selectedvalue_get = "" ;
      Combo_lecmaqcod_Selectedvalue_get = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A1166LecMaqCod = "" ;
      A1796LecTipEnt = "" ;
      A1171LecFasCod = "" ;
      A1169LecBarPar = "" ;
      Gx_mode = "" ;
      AV22EmprCod = "" ;
      AV36LecMaqCod = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      lblTextblocklecmaqcod_Jsonclick = "" ;
      ucCombo_lecmaqcod = new com.genexus.webpanels.GXUserControl();
      Combo_lecmaqcod_Caption = "" ;
      AV48LecMaqCod_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      TempTags = "" ;
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      lblTextblocklecfascod_Jsonclick = "" ;
      ucCombo_lecfascod = new com.genexus.webpanels.GXUserControl();
      Combo_lecfascod_Caption = "" ;
      AV46LecFasCod_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      lblTextblocklecopecod_Jsonclick = "" ;
      ucCombo_lecopecod = new com.genexus.webpanels.GXUserControl();
      Combo_lecopecod_Caption = "" ;
      AV44LecOpeCod_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      lblTextblocklecparcod_Jsonclick = "" ;
      ucCombo_lecparcod = new com.genexus.webpanels.GXUserControl();
      Combo_lecparcod_Caption = "" ;
      AV41LecParCod_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      A1174LecFec = GXutil.nullDate() ;
      A1173LecHor = "" ;
      A4345LecCombin = "" ;
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      AV50Pgmname = "" ;
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      AV49ComboLecMaqCod = "" ;
      AV47ComboLecFasCod = "" ;
      A14261LecParNom = "" ;
      A14260LecFasDsc = "" ;
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
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      Combo_lecfascod_Objectcall = "" ;
      Combo_lecfascod_Class = "" ;
      Combo_lecfascod_Icontype = "" ;
      Combo_lecfascod_Icon = "" ;
      Combo_lecfascod_Tooltip = "" ;
      Combo_lecfascod_Selectedvalue_set = "" ;
      Combo_lecfascod_Selectedtext_set = "" ;
      Combo_lecfascod_Selectedtext_get = "" ;
      Combo_lecfascod_Gamoauthtoken = "" ;
      Combo_lecfascod_Ddointernalname = "" ;
      Combo_lecfascod_Titlecontrolalign = "" ;
      Combo_lecfascod_Dropdownoptionstype = "" ;
      Combo_lecfascod_Titlecontrolidtoreplace = "" ;
      Combo_lecfascod_Datalisttype = "" ;
      Combo_lecfascod_Datalistfixedvalues = "" ;
      Combo_lecfascod_Datalistproc = "" ;
      Combo_lecfascod_Datalistprocparametersprefix = "" ;
      Combo_lecfascod_Remoteservicesparameters = "" ;
      Combo_lecfascod_Htmltemplate = "" ;
      Combo_lecfascod_Multiplevaluestype = "" ;
      Combo_lecfascod_Loadingdata = "" ;
      Combo_lecfascod_Noresultsfound = "" ;
      Combo_lecfascod_Emptyitemtext = "" ;
      Combo_lecfascod_Onlyselectedvalues = "" ;
      Combo_lecfascod_Selectalltext = "" ;
      Combo_lecfascod_Multiplevaluesseparator = "" ;
      Combo_lecfascod_Addnewoptiontext = "" ;
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
      Dvpanel_unnamedtable1_Objectcall = "" ;
      Dvpanel_unnamedtable1_Class = "" ;
      Dvpanel_unnamedtable1_Height = "" ;
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
      AV19Station = "" ;
      AV16EmprNom = "" ;
      AV17UsurCod = "" ;
      GXv_int6 = new byte[1] ;
      GXv_char2 = new String[1] ;
      AV38WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV39TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV40WebSession = httpContext.getWebSession();
      AV42ComboSelectedValue = "" ;
      GXt_objcol_SdtDVB_SDTComboData_Item8 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTComboData_Item9 = new GXBaseCollection[1] ;
      Z407EmprNom = "" ;
      T00434_A407EmprNom = new String[] {""} ;
      T00434_n407EmprNom = new boolean[] {false} ;
      T00435_A1166LecMaqCod = new String[] {""} ;
      T00435_A1170LecOpeCod = new int[1] ;
      T00435_n1170LecOpeCod = new boolean[] {false} ;
      T00435_A1172LecParCod = new short[1] ;
      T00435_n1172LecParCod = new boolean[] {false} ;
      T00435_A1171LecFasCod = new String[] {""} ;
      T00435_n1171LecFasCod = new boolean[] {false} ;
      T00435_A1167LecBarCod = new int[1] ;
      T00435_n1167LecBarCod = new boolean[] {false} ;
      T00435_A1168LecBarReo = new byte[1] ;
      T00435_n1168LecBarReo = new boolean[] {false} ;
      T00435_A1169LecBarPar = new String[] {""} ;
      T00435_n1169LecBarPar = new boolean[] {false} ;
      T00435_A1188LecFasOrd = new short[1] ;
      T00435_n1188LecFasOrd = new boolean[] {false} ;
      T00435_A1173LecHor = new String[] {""} ;
      T00435_n1173LecHor = new boolean[] {false} ;
      T00435_A1174LecFec = new java.util.Date[] {GXutil.nullDate()} ;
      T00435_n1174LecFec = new boolean[] {false} ;
      T00435_A407EmprNom = new String[] {""} ;
      T00435_n407EmprNom = new boolean[] {false} ;
      T00435_A1796LecTipEnt = new String[] {""} ;
      T00435_n1796LecTipEnt = new boolean[] {false} ;
      T00435_A4702LecNumLot = new int[1] ;
      T00435_n4702LecNumLot = new boolean[] {false} ;
      T00435_A4703LecRecLinM = new short[1] ;
      T00435_n4703LecRecLinM = new boolean[] {false} ;
      T00435_A4345LecCombin = new String[] {""} ;
      T00435_n4345LecCombin = new boolean[] {false} ;
      T00435_A6832LecCnc = new byte[1] ;
      T00435_n6832LecCnc = new boolean[] {false} ;
      T00435_A396EmprCod = new String[] {""} ;
      T00436_A396EmprCod = new String[] {""} ;
      T00436_A1166LecMaqCod = new String[] {""} ;
      T00433_A1166LecMaqCod = new String[] {""} ;
      T00433_A1170LecOpeCod = new int[1] ;
      T00433_n1170LecOpeCod = new boolean[] {false} ;
      T00433_A1172LecParCod = new short[1] ;
      T00433_n1172LecParCod = new boolean[] {false} ;
      T00433_A1171LecFasCod = new String[] {""} ;
      T00433_n1171LecFasCod = new boolean[] {false} ;
      T00433_A1167LecBarCod = new int[1] ;
      T00433_n1167LecBarCod = new boolean[] {false} ;
      T00433_A1168LecBarReo = new byte[1] ;
      T00433_n1168LecBarReo = new boolean[] {false} ;
      T00433_A1169LecBarPar = new String[] {""} ;
      T00433_n1169LecBarPar = new boolean[] {false} ;
      T00433_A1188LecFasOrd = new short[1] ;
      T00433_n1188LecFasOrd = new boolean[] {false} ;
      T00433_A1173LecHor = new String[] {""} ;
      T00433_n1173LecHor = new boolean[] {false} ;
      T00433_A1174LecFec = new java.util.Date[] {GXutil.nullDate()} ;
      T00433_n1174LecFec = new boolean[] {false} ;
      T00433_A1796LecTipEnt = new String[] {""} ;
      T00433_n1796LecTipEnt = new boolean[] {false} ;
      T00433_A4702LecNumLot = new int[1] ;
      T00433_n4702LecNumLot = new boolean[] {false} ;
      T00433_A4703LecRecLinM = new short[1] ;
      T00433_n4703LecRecLinM = new boolean[] {false} ;
      T00433_A4345LecCombin = new String[] {""} ;
      T00433_n4345LecCombin = new boolean[] {false} ;
      T00433_A6832LecCnc = new byte[1] ;
      T00433_n6832LecCnc = new boolean[] {false} ;
      T00433_A396EmprCod = new String[] {""} ;
      T00437_A396EmprCod = new String[] {""} ;
      T00437_A1166LecMaqCod = new String[] {""} ;
      T00438_A396EmprCod = new String[] {""} ;
      T00438_A1166LecMaqCod = new String[] {""} ;
      T00432_A1166LecMaqCod = new String[] {""} ;
      T00432_A1170LecOpeCod = new int[1] ;
      T00432_n1170LecOpeCod = new boolean[] {false} ;
      T00432_A1172LecParCod = new short[1] ;
      T00432_n1172LecParCod = new boolean[] {false} ;
      T00432_A1171LecFasCod = new String[] {""} ;
      T00432_n1171LecFasCod = new boolean[] {false} ;
      T00432_A1167LecBarCod = new int[1] ;
      T00432_n1167LecBarCod = new boolean[] {false} ;
      T00432_A1168LecBarReo = new byte[1] ;
      T00432_n1168LecBarReo = new boolean[] {false} ;
      T00432_A1169LecBarPar = new String[] {""} ;
      T00432_n1169LecBarPar = new boolean[] {false} ;
      T00432_A1188LecFasOrd = new short[1] ;
      T00432_n1188LecFasOrd = new boolean[] {false} ;
      T00432_A1173LecHor = new String[] {""} ;
      T00432_n1173LecHor = new boolean[] {false} ;
      T00432_A1174LecFec = new java.util.Date[] {GXutil.nullDate()} ;
      T00432_n1174LecFec = new boolean[] {false} ;
      T00432_A1796LecTipEnt = new String[] {""} ;
      T00432_n1796LecTipEnt = new boolean[] {false} ;
      T00432_A4702LecNumLot = new int[1] ;
      T00432_n4702LecNumLot = new boolean[] {false} ;
      T00432_A4703LecRecLinM = new short[1] ;
      T00432_n4703LecRecLinM = new boolean[] {false} ;
      T00432_A4345LecCombin = new String[] {""} ;
      T00432_n4345LecCombin = new boolean[] {false} ;
      T00432_A6832LecCnc = new byte[1] ;
      T00432_n6832LecCnc = new boolean[] {false} ;
      T00432_A396EmprCod = new String[] {""} ;
      T004312_A396EmprCod = new String[] {""} ;
      T004312_A1166LecMaqCod = new String[] {""} ;
      T004312_A5961LecBarCodG = new int[1] ;
      T004312_A5962LecBarReoG = new byte[1] ;
      T004312_A5963LecBarParG = new String[] {""} ;
      T004312_A5964LecNumLotG = new int[1] ;
      T004312_A5965LecFasOrdG = new short[1] ;
      T004313_A396EmprCod = new String[] {""} ;
      T004313_A1166LecMaqCod = new String[] {""} ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXv_char3 = new String[1] ;
      Z13722LecEstado = "" ;
      Z14260LecFasDsc = "" ;
      Z14259lecOpeNom = "" ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      Z14261LecParNom = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tlector__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tlector__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tlector__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tlector__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tlector__default(),
         new Object[] {
             new Object[] {
            T00432_A1166LecMaqCod, T00432_A1170LecOpeCod, T00432_n1170LecOpeCod, T00432_A1172LecParCod, T00432_n1172LecParCod, T00432_A1171LecFasCod, T00432_n1171LecFasCod, T00432_A1167LecBarCod, T00432_n1167LecBarCod, T00432_A1168LecBarReo,
            T00432_n1168LecBarReo, T00432_A1169LecBarPar, T00432_n1169LecBarPar, T00432_A1188LecFasOrd, T00432_n1188LecFasOrd, T00432_A1173LecHor, T00432_n1173LecHor, T00432_A1174LecFec, T00432_n1174LecFec, T00432_A1796LecTipEnt,
            T00432_n1796LecTipEnt, T00432_A4702LecNumLot, T00432_n4702LecNumLot, T00432_A4703LecRecLinM, T00432_n4703LecRecLinM, T00432_A4345LecCombin, T00432_n4345LecCombin, T00432_A6832LecCnc, T00432_n6832LecCnc, T00432_A396EmprCod
            }
            , new Object[] {
            T00433_A1166LecMaqCod, T00433_A1170LecOpeCod, T00433_n1170LecOpeCod, T00433_A1172LecParCod, T00433_n1172LecParCod, T00433_A1171LecFasCod, T00433_n1171LecFasCod, T00433_A1167LecBarCod, T00433_n1167LecBarCod, T00433_A1168LecBarReo,
            T00433_n1168LecBarReo, T00433_A1169LecBarPar, T00433_n1169LecBarPar, T00433_A1188LecFasOrd, T00433_n1188LecFasOrd, T00433_A1173LecHor, T00433_n1173LecHor, T00433_A1174LecFec, T00433_n1174LecFec, T00433_A1796LecTipEnt,
            T00433_n1796LecTipEnt, T00433_A4702LecNumLot, T00433_n4702LecNumLot, T00433_A4703LecRecLinM, T00433_n4703LecRecLinM, T00433_A4345LecCombin, T00433_n4345LecCombin, T00433_A6832LecCnc, T00433_n6832LecCnc, T00433_A396EmprCod
            }
            , new Object[] {
            T00434_A407EmprNom, T00434_n407EmprNom
            }
            , new Object[] {
            T00435_A1166LecMaqCod, T00435_A1170LecOpeCod, T00435_n1170LecOpeCod, T00435_A1172LecParCod, T00435_n1172LecParCod, T00435_A1171LecFasCod, T00435_n1171LecFasCod, T00435_A1167LecBarCod, T00435_n1167LecBarCod, T00435_A1168LecBarReo,
            T00435_n1168LecBarReo, T00435_A1169LecBarPar, T00435_n1169LecBarPar, T00435_A1188LecFasOrd, T00435_n1188LecFasOrd, T00435_A1173LecHor, T00435_n1173LecHor, T00435_A1174LecFec, T00435_n1174LecFec, T00435_A407EmprNom,
            T00435_n407EmprNom, T00435_A1796LecTipEnt, T00435_n1796LecTipEnt, T00435_A4702LecNumLot, T00435_n4702LecNumLot, T00435_A4703LecRecLinM, T00435_n4703LecRecLinM, T00435_A4345LecCombin, T00435_n4345LecCombin, T00435_A6832LecCnc,
            T00435_n6832LecCnc, T00435_A396EmprCod
            }
            , new Object[] {
            T00436_A396EmprCod, T00436_A1166LecMaqCod
            }
            , new Object[] {
            T00437_A396EmprCod, T00437_A1166LecMaqCod
            }
            , new Object[] {
            T00438_A396EmprCod, T00438_A1166LecMaqCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T004312_A396EmprCod, T004312_A1166LecMaqCod, T004312_A5961LecBarCodG, T004312_A5962LecBarReoG, T004312_A5963LecBarParG, T004312_A5964LecNumLotG, T004312_A5965LecFasOrdG
            }
            , new Object[] {
            T004313_A396EmprCod, T004313_A1166LecMaqCod
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV50Pgmname = "TLECTOR" ;
   }

   private byte Z1168LecBarReo ;
   private byte Z6832LecCnc ;
   private byte GxWebError ;
   private byte A1168LecBarReo ;
   private byte nKeyPressed ;
   private byte A6832LecCnc ;
   private byte AV35FlagLav ;
   private byte GXt_int5 ;
   private byte GXv_int6[] ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
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
   private short AV43ComboLecParCod ;
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
   private int edtLecFasOrd_Enabled ;
   private int edtLecFasCod_Visible ;
   private int edtLecFasCod_Enabled ;
   private int A4702LecNumLot ;
   private int edtLecNumLot_Enabled ;
   private int edtLecRecLinM_Enabled ;
   private int edtLecOpeCod_Enabled ;
   private int edtLecOpeCod_Visible ;
   private int edtLecParCod_Enabled ;
   private int edtLecParCod_Visible ;
   private int edtLecFec_Enabled ;
   private int edtLecHor_Enabled ;
   private int edtLecCombin_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int edtavPgmname_Enabled ;
   private int edtavCombolecmaqcod_Visible ;
   private int edtavCombolecmaqcod_Enabled ;
   private int edtavCombolecfascod_Visible ;
   private int edtavCombolecfascod_Enabled ;
   private int AV45ComboLecOpeCod ;
   private int edtavCombolecopecod_Enabled ;
   private int edtavCombolecopecod_Visible ;
   private int edtavCombolecparcod_Enabled ;
   private int edtavCombolecparcod_Visible ;
   private int Combo_lecmaqcod_Datalistupdateminimumcharacters ;
   private int Combo_lecfascod_Datalistupdateminimumcharacters ;
   private int Combo_lecopecod_Datalistupdateminimumcharacters ;
   private int Combo_lecparcod_Datalistupdateminimumcharacters ;
   private int Datamonjs_Gxcontroltype ;
   private int GX_JID ;
   private int idxLst ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV22EmprCod ;
   private String wcpOAV36LecMaqCod ;
   private String Z396EmprCod ;
   private String Z1166LecMaqCod ;
   private String Z1171LecFasCod ;
   private String Z1169LecBarPar ;
   private String Z1173LecHor ;
   private String Z1796LecTipEnt ;
   private String Z4345LecCombin ;
   private String Combo_lecparcod_Selectedvalue_get ;
   private String Combo_lecopecod_Selectedvalue_get ;
   private String Combo_lecfascod_Selectedvalue_get ;
   private String Combo_lecmaqcod_Selectedvalue_get ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A1166LecMaqCod ;
   private String A1796LecTipEnt ;
   private String A1171LecFasCod ;
   private String A1169LecBarPar ;
   private String Gx_mode ;
   private String AV22EmprCod ;
   private String AV36LecMaqCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtLecMaqCod_Internalname ;
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
   private String divUnnamedtable8_Internalname ;
   private String divTablesplittedlecmaqcod_Internalname ;
   private String lblTextblocklecmaqcod_Internalname ;
   private String lblTextblocklecmaqcod_Jsonclick ;
   private String Combo_lecmaqcod_Caption ;
   private String Combo_lecmaqcod_Cls ;
   private String Combo_lecmaqcod_Internalname ;
   private String TempTags ;
   private String edtLecMaqCod_Jsonclick ;
   private String Dvpanel_unnamedtable1_Width ;
   private String Dvpanel_unnamedtable1_Cls ;
   private String Dvpanel_unnamedtable1_Title ;
   private String Dvpanel_unnamedtable1_Iconposition ;
   private String Dvpanel_unnamedtable1_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String edtLecBarCod_Internalname ;
   private String edtLecBarCod_Jsonclick ;
   private String edtLecBarReo_Internalname ;
   private String edtLecBarReo_Jsonclick ;
   private String edtLecBarPar_Internalname ;
   private String edtLecBarPar_Jsonclick ;
   private String divUnnamedtable3_Internalname ;
   private String edtLecFasOrd_Internalname ;
   private String edtLecFasOrd_Jsonclick ;
   private String divTablesplittedlecfascod_Internalname ;
   private String lblTextblocklecfascod_Internalname ;
   private String lblTextblocklecfascod_Jsonclick ;
   private String Combo_lecfascod_Caption ;
   private String Combo_lecfascod_Cls ;
   private String Combo_lecfascod_Internalname ;
   private String edtLecFasCod_Internalname ;
   private String edtLecFasCod_Jsonclick ;
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
   private String AV50Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String divSectionattribute_lecmaqcod_Internalname ;
   private String edtavCombolecmaqcod_Internalname ;
   private String AV49ComboLecMaqCod ;
   private String edtavCombolecmaqcod_Jsonclick ;
   private String divSectionattribute_lecfascod_Internalname ;
   private String edtavCombolecfascod_Internalname ;
   private String AV47ComboLecFasCod ;
   private String edtavCombolecfascod_Jsonclick ;
   private String divSectionattribute_lecopecod_Internalname ;
   private String edtavCombolecopecod_Internalname ;
   private String edtavCombolecopecod_Jsonclick ;
   private String divSectionattribute_lecparcod_Internalname ;
   private String edtavCombolecparcod_Internalname ;
   private String edtavCombolecparcod_Jsonclick ;
   private String A14261LecParNom ;
   private String A14260LecFasDsc ;
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
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String Combo_lecfascod_Objectcall ;
   private String Combo_lecfascod_Class ;
   private String Combo_lecfascod_Icontype ;
   private String Combo_lecfascod_Icon ;
   private String Combo_lecfascod_Tooltip ;
   private String Combo_lecfascod_Selectedvalue_set ;
   private String Combo_lecfascod_Selectedtext_set ;
   private String Combo_lecfascod_Selectedtext_get ;
   private String Combo_lecfascod_Gamoauthtoken ;
   private String Combo_lecfascod_Ddointernalname ;
   private String Combo_lecfascod_Titlecontrolalign ;
   private String Combo_lecfascod_Dropdownoptionstype ;
   private String Combo_lecfascod_Titlecontrolidtoreplace ;
   private String Combo_lecfascod_Datalisttype ;
   private String Combo_lecfascod_Datalistfixedvalues ;
   private String Combo_lecfascod_Datalistproc ;
   private String Combo_lecfascod_Datalistprocparametersprefix ;
   private String Combo_lecfascod_Remoteservicesparameters ;
   private String Combo_lecfascod_Htmltemplate ;
   private String Combo_lecfascod_Multiplevaluestype ;
   private String Combo_lecfascod_Loadingdata ;
   private String Combo_lecfascod_Noresultsfound ;
   private String Combo_lecfascod_Emptyitemtext ;
   private String Combo_lecfascod_Onlyselectedvalues ;
   private String Combo_lecfascod_Selectalltext ;
   private String Combo_lecfascod_Multiplevaluesseparator ;
   private String Combo_lecfascod_Addnewoptiontext ;
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
   private String Dvpanel_unnamedtable1_Objectcall ;
   private String Dvpanel_unnamedtable1_Class ;
   private String Dvpanel_unnamedtable1_Height ;
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
   private String AV19Station ;
   private String AV16EmprNom ;
   private String AV17UsurCod ;
   private String GXv_char2[] ;
   private String Z407EmprNom ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXv_char3[] ;
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
   private boolean n1796LecTipEnt ;
   private boolean n1172LecParCod ;
   private boolean n1171LecFasCod ;
   private boolean n1170LecOpeCod ;
   private boolean n1167LecBarCod ;
   private boolean n1168LecBarReo ;
   private boolean n1169LecBarPar ;
   private boolean n1188LecFasOrd ;
   private boolean wbErr ;
   private boolean n6832LecCnc ;
   private boolean Dvpanel_tableattributes_Autowidth ;
   private boolean Dvpanel_tableattributes_Autoheight ;
   private boolean Dvpanel_tableattributes_Collapsible ;
   private boolean Dvpanel_tableattributes_Collapsed ;
   private boolean Dvpanel_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_tableattributes_Autoscroll ;
   private boolean Combo_lecmaqcod_Emptyitem ;
   private boolean Dvpanel_unnamedtable1_Autowidth ;
   private boolean Dvpanel_unnamedtable1_Autoheight ;
   private boolean Dvpanel_unnamedtable1_Collapsible ;
   private boolean Dvpanel_unnamedtable1_Collapsed ;
   private boolean Dvpanel_unnamedtable1_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable1_Autoscroll ;
   private boolean Combo_lecfascod_Emptyitem ;
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
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean Combo_lecfascod_Enabled ;
   private boolean Combo_lecfascod_Visible ;
   private boolean Combo_lecfascod_Allowmultipleselection ;
   private boolean Combo_lecfascod_Isgriditem ;
   private boolean Combo_lecfascod_Hasdescription ;
   private boolean Combo_lecfascod_Includeonlyselectedoption ;
   private boolean Combo_lecfascod_Includeselectalloption ;
   private boolean Combo_lecfascod_Includeaddnewoption ;
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
   private boolean Dvpanel_unnamedtable1_Enabled ;
   private boolean Dvpanel_unnamedtable1_Showheader ;
   private boolean Dvpanel_unnamedtable1_Visible ;
   private boolean Datamonjs_Enabled ;
   private boolean Datamonjs_Visible ;
   private boolean n4702LecNumLot ;
   private boolean n4703LecRecLinM ;
   private boolean n1174LecFec ;
   private boolean n1173LecHor ;
   private boolean n4345LecCombin ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private String AV42ComboSelectedValue ;
   private com.genexus.webpanels.WebSession AV40WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.webpanels.GXUserControl ucCombo_lecmaqcod ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucCombo_lecfascod ;
   private com.genexus.webpanels.GXUserControl ucCombo_lecopecod ;
   private com.genexus.webpanels.GXUserControl ucCombo_lecparcod ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbLecTipEnt ;
   private ICheckbox chkLecCnc ;
   private IDataStoreProvider pr_default ;
   private String[] T00434_A407EmprNom ;
   private boolean[] T00434_n407EmprNom ;
   private String[] T00435_A1166LecMaqCod ;
   private int[] T00435_A1170LecOpeCod ;
   private boolean[] T00435_n1170LecOpeCod ;
   private short[] T00435_A1172LecParCod ;
   private boolean[] T00435_n1172LecParCod ;
   private String[] T00435_A1171LecFasCod ;
   private boolean[] T00435_n1171LecFasCod ;
   private int[] T00435_A1167LecBarCod ;
   private boolean[] T00435_n1167LecBarCod ;
   private byte[] T00435_A1168LecBarReo ;
   private boolean[] T00435_n1168LecBarReo ;
   private String[] T00435_A1169LecBarPar ;
   private boolean[] T00435_n1169LecBarPar ;
   private short[] T00435_A1188LecFasOrd ;
   private boolean[] T00435_n1188LecFasOrd ;
   private String[] T00435_A1173LecHor ;
   private boolean[] T00435_n1173LecHor ;
   private java.util.Date[] T00435_A1174LecFec ;
   private boolean[] T00435_n1174LecFec ;
   private String[] T00435_A407EmprNom ;
   private boolean[] T00435_n407EmprNom ;
   private String[] T00435_A1796LecTipEnt ;
   private boolean[] T00435_n1796LecTipEnt ;
   private int[] T00435_A4702LecNumLot ;
   private boolean[] T00435_n4702LecNumLot ;
   private short[] T00435_A4703LecRecLinM ;
   private boolean[] T00435_n4703LecRecLinM ;
   private String[] T00435_A4345LecCombin ;
   private boolean[] T00435_n4345LecCombin ;
   private byte[] T00435_A6832LecCnc ;
   private boolean[] T00435_n6832LecCnc ;
   private String[] T00435_A396EmprCod ;
   private String[] T00436_A396EmprCod ;
   private String[] T00436_A1166LecMaqCod ;
   private String[] T00433_A1166LecMaqCod ;
   private int[] T00433_A1170LecOpeCod ;
   private boolean[] T00433_n1170LecOpeCod ;
   private short[] T00433_A1172LecParCod ;
   private boolean[] T00433_n1172LecParCod ;
   private String[] T00433_A1171LecFasCod ;
   private boolean[] T00433_n1171LecFasCod ;
   private int[] T00433_A1167LecBarCod ;
   private boolean[] T00433_n1167LecBarCod ;
   private byte[] T00433_A1168LecBarReo ;
   private boolean[] T00433_n1168LecBarReo ;
   private String[] T00433_A1169LecBarPar ;
   private boolean[] T00433_n1169LecBarPar ;
   private short[] T00433_A1188LecFasOrd ;
   private boolean[] T00433_n1188LecFasOrd ;
   private String[] T00433_A1173LecHor ;
   private boolean[] T00433_n1173LecHor ;
   private java.util.Date[] T00433_A1174LecFec ;
   private boolean[] T00433_n1174LecFec ;
   private String[] T00433_A1796LecTipEnt ;
   private boolean[] T00433_n1796LecTipEnt ;
   private int[] T00433_A4702LecNumLot ;
   private boolean[] T00433_n4702LecNumLot ;
   private short[] T00433_A4703LecRecLinM ;
   private boolean[] T00433_n4703LecRecLinM ;
   private String[] T00433_A4345LecCombin ;
   private boolean[] T00433_n4345LecCombin ;
   private byte[] T00433_A6832LecCnc ;
   private boolean[] T00433_n6832LecCnc ;
   private String[] T00433_A396EmprCod ;
   private String[] T00437_A396EmprCod ;
   private String[] T00437_A1166LecMaqCod ;
   private String[] T00438_A396EmprCod ;
   private String[] T00438_A1166LecMaqCod ;
   private String[] T00432_A1166LecMaqCod ;
   private int[] T00432_A1170LecOpeCod ;
   private boolean[] T00432_n1170LecOpeCod ;
   private short[] T00432_A1172LecParCod ;
   private boolean[] T00432_n1172LecParCod ;
   private String[] T00432_A1171LecFasCod ;
   private boolean[] T00432_n1171LecFasCod ;
   private int[] T00432_A1167LecBarCod ;
   private boolean[] T00432_n1167LecBarCod ;
   private byte[] T00432_A1168LecBarReo ;
   private boolean[] T00432_n1168LecBarReo ;
   private String[] T00432_A1169LecBarPar ;
   private boolean[] T00432_n1169LecBarPar ;
   private short[] T00432_A1188LecFasOrd ;
   private boolean[] T00432_n1188LecFasOrd ;
   private String[] T00432_A1173LecHor ;
   private boolean[] T00432_n1173LecHor ;
   private java.util.Date[] T00432_A1174LecFec ;
   private boolean[] T00432_n1174LecFec ;
   private String[] T00432_A1796LecTipEnt ;
   private boolean[] T00432_n1796LecTipEnt ;
   private int[] T00432_A4702LecNumLot ;
   private boolean[] T00432_n4702LecNumLot ;
   private short[] T00432_A4703LecRecLinM ;
   private boolean[] T00432_n4703LecRecLinM ;
   private String[] T00432_A4345LecCombin ;
   private boolean[] T00432_n4345LecCombin ;
   private byte[] T00432_A6832LecCnc ;
   private boolean[] T00432_n6832LecCnc ;
   private String[] T00432_A396EmprCod ;
   private String[] T004312_A396EmprCod ;
   private String[] T004312_A1166LecMaqCod ;
   private int[] T004312_A5961LecBarCodG ;
   private byte[] T004312_A5962LecBarReoG ;
   private String[] T004312_A5963LecBarParG ;
   private int[] T004312_A5964LecNumLotG ;
   private short[] T004312_A5965LecFasOrdG ;
   private String[] T004313_A396EmprCod ;
   private String[] T004313_A1166LecMaqCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV48LecMaqCod_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV46LecFasCod_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV44LecOpeCod_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV41LecParCod_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXt_objcol_SdtDVB_SDTComboData_Item8 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXv_objcol_SdtDVB_SDTComboData_Item9[] ;
   private app.wwpbaseobjects.SdtWWPContext AV38WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV39TrnContext ;
}

final  class tlector__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tlector__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tlector__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tlector__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tlector__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00432", "SELECT LecMaqCod, LecOpeCod, LecParCod, LecFasCod, LecBarCod, LecBarReo, LecBarPar, LecFasOrd, LecHor, LecFec, LecTipEnt, LecNumLot, LecRecLinM, LecCombin, LecCnc, EmprCod FROM TXPLECTOR WHERE EmprCod = ? AND LecMaqCod = ?  FOR UPDATE OF LecOpeCod, LecParCod, LecFasCod, LecBarCod, LecBarReo, LecBarPar, LecFasOrd, LecHor, LecFec, LecTipEnt, LecNumLot, LecRecLinM, LecCombin, LecCnc NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00433", "SELECT LecMaqCod, LecOpeCod, LecParCod, LecFasCod, LecBarCod, LecBarReo, LecBarPar, LecFasOrd, LecHor, LecFec, LecTipEnt, LecNumLot, LecRecLinM, LecCombin, LecCnc, EmprCod FROM TXPLECTOR WHERE EmprCod = ? AND LecMaqCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00434", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00435", "SELECT /*+ FIRST_ROWS(100) */ TM1.LecMaqCod, TM1.LecOpeCod, TM1.LecParCod, TM1.LecFasCod, TM1.LecBarCod, TM1.LecBarReo, TM1.LecBarPar, TM1.LecFasOrd, TM1.LecHor, TM1.LecFec, T2.EmprNom, TM1.LecTipEnt, TM1.LecNumLot, TM1.LecRecLinM, TM1.LecCombin, TM1.LecCnc, TM1.EmprCod FROM (TXPLECTOR TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.LecMaqCod = ? ORDER BY TM1.EmprCod, TM1.LecMaqCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00436", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, LecMaqCod FROM TXPLECTOR WHERE EmprCod = ? AND LecMaqCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00437", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, LecMaqCod FROM TXPLECTOR WHERE ( LecMaqCod > ?) and EmprCod = ? ORDER BY EmprCod, LecMaqCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00438", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, LecMaqCod FROM TXPLECTOR WHERE ( LecMaqCod < ?) and EmprCod = ? ORDER BY EmprCod DESC, LecMaqCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T00439", "INSERT INTO TXPLECTOR(LecMaqCod, LecOpeCod, LecParCod, LecFasCod, LecBarCod, LecBarReo, LecBarPar, LecFasOrd, LecHor, LecFec, LecTipEnt, LecNumLot, LecRecLinM, LecCombin, LecCnc, EmprCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPLECTOR")
         ,new UpdateCursor("T004310", "UPDATE TXPLECTOR SET LecOpeCod=?, LecParCod=?, LecFasCod=?, LecBarCod=?, LecBarReo=?, LecBarPar=?, LecFasOrd=?, LecHor=?, LecFec=?, LecTipEnt=?, LecNumLot=?, LecRecLinM=?, LecCombin=?, LecCnc=?  WHERE EmprCod = ? AND LecMaqCod = ?", GX_NOMASK, "TXPLECTOR")
         ,new UpdateCursor("T004311", "DELETE FROM TXPLECTOR  WHERE EmprCod = ? AND LecMaqCod = ?", GX_NOMASK, "TXPLECTOR")
         ,new ForEachCursor("T004312", "SELECT * FROM (SELECT EmprCod, LecMaqCod, LecBarCodG, LecBarReoG, LecBarParG, LecNumLotG, LecFasOrdG FROM TXPLECLAV WHERE EmprCod = ? AND LecMaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T004313", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, LecMaqCod FROM TXPLECTOR WHERE EmprCod = ? ORDER BY EmprCod, LecMaqCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[5])[0] = rslt.getString(4, 8);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((byte[]) buf[9])[0] = rslt.getByte(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 1);
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
               ((String[]) buf[5])[0] = rslt.getString(4, 8);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((byte[]) buf[9])[0] = rslt.getByte(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 1);
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
               ((String[]) buf[5])[0] = rslt.getString(4, 8);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((byte[]) buf[9])[0] = rslt.getByte(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 1);
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
               stmt.setString(1, (String)parms[0], 6);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 6);
               stmt.setString(2, (String)parms[1], 3);
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 8);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[8]).intValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[10]).byteValue());
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[12], 1);
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
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 8);
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
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(5, ((Number) parms[9]).byteValue());
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[11], 1);
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
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

