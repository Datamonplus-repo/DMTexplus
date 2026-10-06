package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ttipcol_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel1"+"_"+"TIPDSCFAM") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A5723TipArtFam = (short)(GXutil.lval( httpContext.GetPar( "TipArtFam"))) ;
         n5723TipArtFam = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5723TipArtFam", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5723TipArtFam), 4, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx1asatipdscfam2D101( A396EmprCod, A5723TipArtFam) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel4"+"_"+"TIPCOLCOD") == 0 )
      {
         AV31TipColCod = (byte)(GXutil.lval( httpContext.GetPar( "TipColCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV31TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31TipColCod), 2, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTIPCOLCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV31TipColCod), "Z9")));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx4asatipcolcod2D101( AV31TipColCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel5"+"_"+"TIPCOLCOD") == 0 )
      {
         A831TipColCod = (byte)(GXutil.lval( httpContext.GetPar( "TipColCod"))) ;
         n831TipColCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
         AV35autonumber = (short)(GXutil.lval( httpContext.GetPar( "autonumber"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV35autonumber", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35autonumber), 4, 0));
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx5asatipcolcod2D101( A831TipColCod, AV35autonumber, A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel7"+"_"+"") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxasa52512D101( A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel8"+"_"+"") == 0 )
      {
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel9"+"_"+"") == 0 )
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
            AV30EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30EmprCod", AV30EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV30EmprCod, "@!"))));
            AV31TipColCod = (byte)(GXutil.lval( httpContext.GetPar( "TipColCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31TipColCod), 2, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTIPCOLCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV31TipColCod), "Z9")));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Tipo de Colorante", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtTipColCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public ttipcol_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public ttipcol_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ttipcol_impl.class ));
   }

   public ttipcol_impl( int remoteHandle ,
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtTipColCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtTipColCod_Internalname, httpContext.getMessage( "Codigo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTipColCod_Internalname, GXutil.ltrim( localUtil.ntoc( A831TipColCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A831TipColCod), "Z9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTipColCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtTipColCod_Enabled, 1, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\TTIPCOL.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-7 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtTipColDsc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtTipColDsc_Internalname, httpContext.getMessage( "Tipo Colorante", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTipColDsc_Internalname, GXutil.rtrim( A832TipColDsc), GXutil.rtrim( localUtil.format( A832TipColDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,29);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTipColDsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtTipColDsc_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\TTIPCOL.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtTipColTie_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtTipColTie_Internalname, httpContext.getMessage( "Tiempo Teorico (m)", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 33,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTipColTie_Internalname, GXutil.ltrim( localUtil.ntoc( A4999TipColTie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTipColTie_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4999TipColTie), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4999TipColTie), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,33);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTipColTie_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtTipColTie_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\TTIPCOL.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell DscTop ExtendedComboCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTablesplittedtipartfam_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblocktipartfam_Internalname, httpContext.getMessage( "Clase", ""), "", "", lblTextblocktipartfam_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_FormulacionTinte\\TTIPCOL.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* User Defined Control */
      ucCombo_tipartfam.setProperty("Caption", Combo_tipartfam_Caption);
      ucCombo_tipartfam.setProperty("Cls", Combo_tipartfam_Cls);
      ucCombo_tipartfam.setProperty("EmptyItemText", Combo_tipartfam_Emptyitemtext);
      ucCombo_tipartfam.setProperty("DropDownOptionsData", AV36TipArtFam_Data);
      ucCombo_tipartfam.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_tipartfam_Internalname, "COMBO_TIPARTFAMContainer");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 Invisible", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtTipArtFam_Internalname, httpContext.getMessage( "Codigo", ""), "col-sm-3 AttributeLabel", 0, true, "");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 47,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTipArtFam_Internalname, GXutil.ltrim( localUtil.ntoc( A5723TipArtFam, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTipArtFam_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5723TipArtFam), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A5723TipArtFam), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,47);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTipArtFam_Jsonclick, 0, "Attribute", "", "", "", "", edtTipArtFam_Visible, edtTipArtFam_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\TTIPCOL.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTipcolctb_cell_Internalname, 1, 0, "px", 0, "px", divTipcolctb_cell_Class, "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", edtTipColCtb_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtTipColCtb_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtTipColCtb_Internalname, httpContext.getMessage( "Tipo Ctb", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTipColCtb_Internalname, GXutil.ltrim( localUtil.ntoc( A5251TipColCtb, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTipColCtb_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5251TipColCtb), "9") : localUtil.format( DecimalUtil.doubleToDec(A5251TipColCtb), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTipColCtb_Jsonclick, 0, "AttributeFL", "", "", "", "", edtTipColCtb_Visible, edtTipColCtb_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\TTIPCOL.htm");
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
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\TTIPCOL.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\TTIPCOL.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 63,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\TTIPCOL.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV39Pgmname), GXutil.rtrim( localUtil.format( AV39Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\TTIPCOL.htm");
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
      app.GxWebStd.gx_div_start( httpContext, divSectionattribute_tipartfam_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavCombotipartfam_Internalname, GXutil.ltrim( localUtil.ntoc( AV38ComboTipArtFam, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavCombotipartfam_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV38ComboTipArtFam), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV38ComboTipArtFam), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCombotipartfam_Jsonclick, 0, "Attribute", "", "", "", "", edtavCombotipartfam_Visible, edtavCombotipartfam_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\TTIPCOL.htm");
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
      e112D2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vTIPARTFAM_DATA"), AV36TipArtFam_Data);
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z831TipColCod = (byte)(localUtil.ctol( httpContext.cgiGet( "Z831TipColCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z5723TipArtFam = (short)(localUtil.ctol( httpContext.cgiGet( "Z5723TipArtFam"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z832TipColDsc = httpContext.cgiGet( "Z832TipColDsc") ;
            Z4999TipColTie = (int)(localUtil.ctol( httpContext.cgiGet( "Z4999TipColTie"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z5251TipColCtb = (byte)(localUtil.ctol( httpContext.cgiGet( "Z5251TipColCtb"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            A396EmprCod = httpContext.cgiGet( "EMPRCOD") ;
            A5724TipDscFam = httpContext.cgiGet( "TIPDSCFAM") ;
            A13731TipColCDsc = httpContext.cgiGet( "TIPCOLCDSC") ;
            AV30EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            AV31TipColCod = (byte)(localUtil.ctol( httpContext.cgiGet( "vTIPCOLCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV35autonumber = (short)(localUtil.ctol( httpContext.cgiGet( "vAUTONUMBER"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A407EmprNom = httpContext.cgiGet( "EMPRNOM") ;
            n407EmprNom = false ;
            Combo_tipartfam_Objectcall = httpContext.cgiGet( "COMBO_TIPARTFAM_Objectcall") ;
            Combo_tipartfam_Class = httpContext.cgiGet( "COMBO_TIPARTFAM_Class") ;
            Combo_tipartfam_Icontype = httpContext.cgiGet( "COMBO_TIPARTFAM_Icontype") ;
            Combo_tipartfam_Icon = httpContext.cgiGet( "COMBO_TIPARTFAM_Icon") ;
            Combo_tipartfam_Caption = httpContext.cgiGet( "COMBO_TIPARTFAM_Caption") ;
            Combo_tipartfam_Tooltip = httpContext.cgiGet( "COMBO_TIPARTFAM_Tooltip") ;
            Combo_tipartfam_Cls = httpContext.cgiGet( "COMBO_TIPARTFAM_Cls") ;
            Combo_tipartfam_Selectedvalue_set = httpContext.cgiGet( "COMBO_TIPARTFAM_Selectedvalue_set") ;
            Combo_tipartfam_Selectedvalue_get = httpContext.cgiGet( "COMBO_TIPARTFAM_Selectedvalue_get") ;
            Combo_tipartfam_Selectedtext_set = httpContext.cgiGet( "COMBO_TIPARTFAM_Selectedtext_set") ;
            Combo_tipartfam_Selectedtext_get = httpContext.cgiGet( "COMBO_TIPARTFAM_Selectedtext_get") ;
            Combo_tipartfam_Gamoauthtoken = httpContext.cgiGet( "COMBO_TIPARTFAM_Gamoauthtoken") ;
            Combo_tipartfam_Ddointernalname = httpContext.cgiGet( "COMBO_TIPARTFAM_Ddointernalname") ;
            Combo_tipartfam_Titlecontrolalign = httpContext.cgiGet( "COMBO_TIPARTFAM_Titlecontrolalign") ;
            Combo_tipartfam_Dropdownoptionstype = httpContext.cgiGet( "COMBO_TIPARTFAM_Dropdownoptionstype") ;
            Combo_tipartfam_Enabled = GXutil.strtobool( httpContext.cgiGet( "COMBO_TIPARTFAM_Enabled")) ;
            Combo_tipartfam_Visible = GXutil.strtobool( httpContext.cgiGet( "COMBO_TIPARTFAM_Visible")) ;
            Combo_tipartfam_Titlecontrolidtoreplace = httpContext.cgiGet( "COMBO_TIPARTFAM_Titlecontrolidtoreplace") ;
            Combo_tipartfam_Datalisttype = httpContext.cgiGet( "COMBO_TIPARTFAM_Datalisttype") ;
            Combo_tipartfam_Allowmultipleselection = GXutil.strtobool( httpContext.cgiGet( "COMBO_TIPARTFAM_Allowmultipleselection")) ;
            Combo_tipartfam_Datalistfixedvalues = httpContext.cgiGet( "COMBO_TIPARTFAM_Datalistfixedvalues") ;
            Combo_tipartfam_Isgriditem = GXutil.strtobool( httpContext.cgiGet( "COMBO_TIPARTFAM_Isgriditem")) ;
            Combo_tipartfam_Hasdescription = GXutil.strtobool( httpContext.cgiGet( "COMBO_TIPARTFAM_Hasdescription")) ;
            Combo_tipartfam_Datalistproc = httpContext.cgiGet( "COMBO_TIPARTFAM_Datalistproc") ;
            Combo_tipartfam_Datalistprocparametersprefix = httpContext.cgiGet( "COMBO_TIPARTFAM_Datalistprocparametersprefix") ;
            Combo_tipartfam_Remoteservicesparameters = httpContext.cgiGet( "COMBO_TIPARTFAM_Remoteservicesparameters") ;
            Combo_tipartfam_Datalistupdateminimumcharacters = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_TIPARTFAM_Datalistupdateminimumcharacters"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_tipartfam_Includeonlyselectedoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_TIPARTFAM_Includeonlyselectedoption")) ;
            Combo_tipartfam_Includeselectalloption = GXutil.strtobool( httpContext.cgiGet( "COMBO_TIPARTFAM_Includeselectalloption")) ;
            Combo_tipartfam_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_TIPARTFAM_Emptyitem")) ;
            Combo_tipartfam_Includeaddnewoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_TIPARTFAM_Includeaddnewoption")) ;
            Combo_tipartfam_Htmltemplate = httpContext.cgiGet( "COMBO_TIPARTFAM_Htmltemplate") ;
            Combo_tipartfam_Multiplevaluestype = httpContext.cgiGet( "COMBO_TIPARTFAM_Multiplevaluestype") ;
            Combo_tipartfam_Loadingdata = httpContext.cgiGet( "COMBO_TIPARTFAM_Loadingdata") ;
            Combo_tipartfam_Noresultsfound = httpContext.cgiGet( "COMBO_TIPARTFAM_Noresultsfound") ;
            Combo_tipartfam_Emptyitemtext = httpContext.cgiGet( "COMBO_TIPARTFAM_Emptyitemtext") ;
            Combo_tipartfam_Onlyselectedvalues = httpContext.cgiGet( "COMBO_TIPARTFAM_Onlyselectedvalues") ;
            Combo_tipartfam_Selectalltext = httpContext.cgiGet( "COMBO_TIPARTFAM_Selectalltext") ;
            Combo_tipartfam_Multiplevaluesseparator = httpContext.cgiGet( "COMBO_TIPARTFAM_Multiplevaluesseparator") ;
            Combo_tipartfam_Addnewoptiontext = httpContext.cgiGet( "COMBO_TIPARTFAM_Addnewoptiontext") ;
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
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTipColCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTipColCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TIPCOLCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTipColCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A831TipColCod = (byte)(0) ;
               n831TipColCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
            }
            else
            {
               A831TipColCod = (byte)(localUtil.ctol( httpContext.cgiGet( edtTipColCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n831TipColCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
            }
            A832TipColDsc = httpContext.cgiGet( edtTipColDsc_Internalname) ;
            n832TipColDsc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A832TipColDsc", A832TipColDsc);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTipColTie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTipColTie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TIPCOLTIE");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTipColTie_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A4999TipColTie = 0 ;
               n4999TipColTie = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4999TipColTie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4999TipColTie), 6, 0));
            }
            else
            {
               A4999TipColTie = (int)(localUtil.ctol( httpContext.cgiGet( edtTipColTie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n4999TipColTie = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4999TipColTie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4999TipColTie), 6, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTipArtFam_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTipArtFam_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TIPARTFAM");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTipArtFam_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A5723TipArtFam = (short)(0) ;
               n5723TipArtFam = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A5723TipArtFam", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5723TipArtFam), 4, 0));
            }
            else
            {
               A5723TipArtFam = (short)(localUtil.ctol( httpContext.cgiGet( edtTipArtFam_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n5723TipArtFam = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A5723TipArtFam", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5723TipArtFam), 4, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTipColCtb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTipColCtb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TIPCOLCTB");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTipColCtb_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A5251TipColCtb = (byte)(0) ;
               n5251TipColCtb = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A5251TipColCtb", GXutil.str( A5251TipColCtb, 1, 0));
            }
            else
            {
               A5251TipColCtb = (byte)(localUtil.ctol( httpContext.cgiGet( edtTipColCtb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n5251TipColCtb = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A5251TipColCtb", GXutil.str( A5251TipColCtb, 1, 0));
            }
            AV39Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV39Pgmname", AV39Pgmname);
            AV38ComboTipArtFam = (short)(localUtil.ctol( httpContext.cgiGet( edtavCombotipartfam_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV38ComboTipArtFam", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38ComboTipArtFam), 4, 0));
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"TTIPCOL");
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( A831TipColCod != Z831TipColCod ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("formulaciontinte\\ttipcol:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               A831TipColCod = (byte)(GXutil.lval( httpContext.GetPar( "TipColCod"))) ;
               n831TipColCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
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
                  sMode101 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  Gx_mode = sMode101 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound101 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_2D0( ) ;
                        if ( AnyError == 0 )
                        {
                           GX_FocusControl = bttBtntrn_enter_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noinsert"), 1, "TIPCOLCOD");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtTipColCod_Internalname ;
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
                        e112D2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e122D2 ();
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
         e122D2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll2D101( ) ;
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
         disableAttributes2D101( ) ;
      }
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavCombotipartfam_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombotipartfam_Enabled), 5, 0), true);
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

   public void confirm_2D0( )
   {
      beforeValidate2D101( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls2D101( ) ;
         }
         else
         {
            checkExtendedTable2D101( ) ;
            closeExtendedTableCursors2D101( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
   }

   public void resetCaption2D0( )
   {
   }

   public void e112D2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV22Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      ttipcol_impl.this.GXt_char1 = GXv_char2[0] ;
      AV22Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22Station", AV22Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV16EmprNom ;
      GXv_char4[0] = AV17UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV22Station, GXv_char2, GXv_char3, GXv_char4) ;
      ttipcol_impl.this.A396EmprCod = GXv_char2[0] ;
      ttipcol_impl.this.AV16EmprNom = GXv_char3[0] ;
      ttipcol_impl.this.AV17UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV16EmprNom", AV16EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
      GXt_int5 = (byte)(AV35autonumber) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "AUTNUM", ""), GXv_int6) ;
      ttipcol_impl.this.GXt_int5 = GXv_int6[0] ;
      AV35autonumber = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35autonumber", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35autonumber), 4, 0));
      GXt_int5 = AV26F_tipcop ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TIPCOP", ""), GXv_int6) ;
      ttipcol_impl.this.GXt_int5 = GXv_int6[0] ;
      AV26F_tipcop = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26F_tipcop", GXutil.str( AV26F_tipcop, 1, 0));
      GXt_int5 = AV29F_moda21 ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "MODA21", ""), GXv_int6) ;
      ttipcol_impl.this.GXt_int5 = GXv_int6[0] ;
      AV29F_moda21 = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29F_moda21", GXutil.str( AV29F_moda21, 1, 0));
      GXt_int5 = AV27Flag2sp ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CTB2SP", ""), GXv_int6) ;
      ttipcol_impl.this.GXt_int5 = GXv_int6[0] ;
      AV27Flag2sp = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27Flag2sp", GXutil.str( AV27Flag2sp, 1, 0));
      GXt_char1 = AV22Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      ttipcol_impl.this.GXt_char1 = GXv_char4[0] ;
      AV22Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22Station", AV22Station);
      GXv_char4[0] = AV30EmprCod ;
      GXv_char3[0] = AV16EmprNom ;
      GXv_char2[0] = AV17UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV22Station, GXv_char4, GXv_char3, GXv_char2) ;
      ttipcol_impl.this.AV30EmprCod = GXv_char4[0] ;
      ttipcol_impl.this.AV16EmprNom = GXv_char3[0] ;
      ttipcol_impl.this.AV17UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30EmprCod", AV30EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV30EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV16EmprNom", AV16EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
      GXv_SdtWWPContext7[0] = AV32WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext7) ;
      AV32WWPContext = GXv_SdtWWPContext7[0] ;
      edtTipArtFam_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipArtFam_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipArtFam_Visible), 5, 0), true);
      AV38ComboTipArtFam = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38ComboTipArtFam", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38ComboTipArtFam), 4, 0));
      edtavCombotipartfam_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCombotipartfam_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombotipartfam_Visible), 5, 0), true);
      /* Execute user subroutine: 'LOADCOMBOTIPARTFAM' */
      S112 ();
      if ( returnInSub )
      {
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      /* Execute user subroutine: 'ATTRIBUTESSECURITYCODE' */
      S122 ();
      if ( returnInSub )
      {
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      AV33TrnContext.fromxml(AV34WebSession.getValue("TrnContext"), null, null);
   }

   public void e122D2( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV33TrnContext.getgxTv_SdtWWPTransactionContext_Callerondelete() )
      {
         callWebObject(formatLink("app.formulaciontinte.ttipcolww", new String[] {}, new String[] {}) );
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

   public void S122( )
   {
      /* 'ATTRIBUTESSECURITYCODE' Routine */
      returnInSub = false ;
      edtTipColCtb_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipColCtb_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipColCtb_Visible), 5, 0), true);
      divTipcolctb_cell_Class = "Invisible" ;
      httpContext.ajax_rsp_assign_prop("", false, divTipcolctb_cell_Internalname, "Class", divTipcolctb_cell_Class, true);
   }

   public void S112( )
   {
      /* 'LOADCOMBOTIPARTFAM' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTComboData_Item8 = AV36TipArtFam_Data ;
      GXv_char4[0] = AV37ComboSelectedValue ;
      GXv_objcol_SdtDVB_SDTComboData_Item9[0] = GXt_objcol_SdtDVB_SDTComboData_Item8 ;
      new app.formulaciontinte.ttipcolloaddvcombo(remoteHandle, context).execute( "TipArtFam", Gx_mode, AV30EmprCod, AV31TipColCod, GXv_char4, GXv_objcol_SdtDVB_SDTComboData_Item9) ;
      ttipcol_impl.this.AV37ComboSelectedValue = GXv_char4[0] ;
      GXt_objcol_SdtDVB_SDTComboData_Item8 = GXv_objcol_SdtDVB_SDTComboData_Item9[0] ;
      AV36TipArtFam_Data = GXt_objcol_SdtDVB_SDTComboData_Item8 ;
      Combo_tipartfam_Selectedvalue_set = AV37ComboSelectedValue ;
      ucCombo_tipartfam.sendProperty(context, "", false, Combo_tipartfam_Internalname, "SelectedValue_set", Combo_tipartfam_Selectedvalue_set);
      AV38ComboTipArtFam = (short)(GXutil.lval( AV37ComboSelectedValue)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38ComboTipArtFam", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38ComboTipArtFam), 4, 0));
      if ( ( GXutil.strcmp(Gx_mode, "DSP") == 0 ) || ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) )
      {
         Combo_tipartfam_Enabled = false ;
         ucCombo_tipartfam.sendProperty(context, "", false, Combo_tipartfam_Internalname, "Enabled", GXutil.booltostr( Combo_tipartfam_Enabled));
      }
   }

   public void zm2D101( int GX_JID )
   {
      if ( ( GX_JID == 13 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z5723TipArtFam = T002D3_A5723TipArtFam[0] ;
            Z832TipColDsc = T002D3_A832TipColDsc[0] ;
            Z4999TipColTie = T002D3_A4999TipColTie[0] ;
            Z5251TipColCtb = T002D3_A5251TipColCtb[0] ;
         }
         else
         {
            Z5723TipArtFam = A5723TipArtFam ;
            Z832TipColDsc = A832TipColDsc ;
            Z4999TipColTie = A4999TipColTie ;
            Z5251TipColCtb = A5251TipColCtb ;
         }
      }
      if ( GX_JID == -13 )
      {
         Z831TipColCod = A831TipColCod ;
         Z5723TipArtFam = A5723TipArtFam ;
         Z832TipColDsc = A832TipColDsc ;
         Z4999TipColTie = A4999TipColTie ;
         Z5251TipColCtb = A5251TipColCtb ;
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
      AV39Pgmname = "FormulacionTinte.TTIPCOL" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV39Pgmname", AV39Pgmname);
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV30EmprCod)==0) )
      {
         A396EmprCod = AV30EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      /* Using cursor T002D4 */
      pr_default.execute(2, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T002D4_A407EmprNom[0] ;
      n407EmprNom = T002D4_n407EmprNom[0] ;
      pr_default.close(2);
      GXt_int5 = (byte)(0) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "CTB2SP", ""), ""), GXv_int6) ;
      ttipcol_impl.this.GXt_int5 = GXv_int6[0] ;
      edtTipColCtb_Visible = ((GXt_int5==1) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipColCtb_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipColCtb_Visible), 5, 0), true);
      GXt_int5 = (byte)(0) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "CTB2SP", ""), ""), GXv_int6) ;
      ttipcol_impl.this.GXt_int5 = GXv_int6[0] ;
      if ( ! ( ( GXt_int5 == 1 ) ) )
      {
         divTipcolctb_cell_Class = httpContext.getMessage( "Invisible", "") ;
         httpContext.ajax_rsp_assign_prop("", false, divTipcolctb_cell_Internalname, "Class", divTipcolctb_cell_Class, true);
      }
      else
      {
         GXt_int5 = (byte)(0) ;
         GXv_int6[0] = GXt_int5 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "CTB2SP", ""), ""), GXv_int6) ;
         ttipcol_impl.this.GXt_int5 = GXv_int6[0] ;
         if ( GXt_int5 == 1 )
         {
            divTipcolctb_cell_Class = httpContext.getMessage( "col-xs-12 col-sm-3 DataContentCell", "") ;
            httpContext.ajax_rsp_assign_prop("", false, divTipcolctb_cell_Internalname, "Class", divTipcolctb_cell_Class, true);
         }
      }
      GXt_int5 = (byte)(0) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "MODA21", ""), ""), GXv_int6) ;
      ttipcol_impl.this.GXt_int5 = GXv_int6[0] ;
      divUnnamedtable2_Visible = (((GXt_int5==1)) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, divUnnamedtable2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(divUnnamedtable2_Visible), 5, 0), true);
      if ( ! (0==AV31TipColCod) )
      {
         A831TipColCod = AV31TipColCod ;
         n831TipColCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
      }
      if ( ! (0==AV31TipColCod) )
      {
         edtTipColCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTipColCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipColCod_Enabled), 5, 0), true);
      }
      else
      {
         edtTipColCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTipColCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipColCod_Enabled), 5, 0), true);
      }
      if ( ! (0==AV31TipColCod) )
      {
         edtTipColCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTipColCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipColCod_Enabled), 5, 0), true);
      }
   }

   public void standaloneModal( )
   {
      A5723TipArtFam = AV38ComboTipArtFam ;
      n5723TipArtFam = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5723TipArtFam", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5723TipArtFam), 4, 0));
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
         GXt_char1 = A5724TipDscFam ;
         GXv_char4[0] = A396EmprCod ;
         GXv_int10[0] = A5723TipArtFam ;
         GXv_char3[0] = GXt_char1 ;
         new app.pfamdsc(remoteHandle, context).execute( GXv_char4, GXv_int10, GXv_char3) ;
         ttipcol_impl.this.A396EmprCod = GXv_char4[0] ;
         ttipcol_impl.this.A5723TipArtFam = GXv_int10[0] ;
         ttipcol_impl.this.GXt_char1 = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A5723TipArtFam", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5723TipArtFam), 4, 0));
         A5724TipDscFam = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "A5724TipDscFam", A5724TipDscFam);
      }
   }

   public void load2D101( )
   {
      /* Using cursor T002D5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound101 = (short)(1) ;
         A5723TipArtFam = T002D5_A5723TipArtFam[0] ;
         n5723TipArtFam = T002D5_n5723TipArtFam[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5723TipArtFam", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5723TipArtFam), 4, 0));
         A832TipColDsc = T002D5_A832TipColDsc[0] ;
         n832TipColDsc = T002D5_n832TipColDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A832TipColDsc", A832TipColDsc);
         A407EmprNom = T002D5_A407EmprNom[0] ;
         n407EmprNom = T002D5_n407EmprNom[0] ;
         A4999TipColTie = T002D5_A4999TipColTie[0] ;
         n4999TipColTie = T002D5_n4999TipColTie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4999TipColTie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4999TipColTie), 6, 0));
         A5251TipColCtb = T002D5_A5251TipColCtb[0] ;
         n5251TipColCtb = T002D5_n5251TipColCtb[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5251TipColCtb", GXutil.str( A5251TipColCtb, 1, 0));
         zm2D101( -13) ;
      }
      pr_default.close(3);
      onLoadActions2D101( ) ;
   }

   public void onLoadActions2D101( )
   {
      A13731TipColCDsc = GXutil.trim( GXutil.str( A831TipColCod, 2, 0)) + " - " + GXutil.trim( A832TipColDsc) ;
      httpContext.ajax_rsp_assign_attri("", false, "A13731TipColCDsc", A13731TipColCDsc);
      GXt_char1 = A5724TipDscFam ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int10[0] = A5723TipArtFam ;
      GXv_char3[0] = GXt_char1 ;
      new app.pfamdsc(remoteHandle, context).execute( GXv_char4, GXv_int10, GXv_char3) ;
      ttipcol_impl.this.A396EmprCod = GXv_char4[0] ;
      ttipcol_impl.this.A5723TipArtFam = GXv_int10[0] ;
      ttipcol_impl.this.GXt_char1 = GXv_char3[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A5723TipArtFam", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5723TipArtFam), 4, 0));
      A5724TipDscFam = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A5724TipDscFam", A5724TipDscFam);
   }

   public void checkExtendedTable2D101( )
   {
      nIsDirty_101 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      nIsDirty_101 = (short)(1) ;
      A13731TipColCDsc = GXutil.trim( GXutil.str( A831TipColCod, 2, 0)) + " - " + GXutil.trim( A832TipColDsc) ;
      httpContext.ajax_rsp_assign_attri("", false, "A13731TipColCDsc", A13731TipColCDsc);
      nIsDirty_101 = (short)(1) ;
      GXt_char1 = A5724TipDscFam ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int10[0] = A5723TipArtFam ;
      GXv_char3[0] = GXt_char1 ;
      new app.pfamdsc(remoteHandle, context).execute( GXv_char4, GXv_int10, GXv_char3) ;
      ttipcol_impl.this.A396EmprCod = GXv_char4[0] ;
      ttipcol_impl.this.A5723TipArtFam = GXv_int10[0] ;
      ttipcol_impl.this.GXt_char1 = GXv_char3[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A5723TipArtFam", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5723TipArtFam), 4, 0));
      A5724TipDscFam = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A5724TipDscFam", A5724TipDscFam);
   }

   public void closeExtendedTableCursors2D101( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey2D101( )
   {
      /* Using cursor T002D6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound101 = (short)(1) ;
      }
      else
      {
         RcdFound101 = (short)(0) ;
      }
      pr_default.close(4);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T002D3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T002D3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm2D101( 13) ;
         RcdFound101 = (short)(1) ;
         A831TipColCod = T002D3_A831TipColCod[0] ;
         n831TipColCod = T002D3_n831TipColCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
         A5723TipArtFam = T002D3_A5723TipArtFam[0] ;
         n5723TipArtFam = T002D3_n5723TipArtFam[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5723TipArtFam", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5723TipArtFam), 4, 0));
         A832TipColDsc = T002D3_A832TipColDsc[0] ;
         n832TipColDsc = T002D3_n832TipColDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A832TipColDsc", A832TipColDsc);
         A4999TipColTie = T002D3_A4999TipColTie[0] ;
         n4999TipColTie = T002D3_n4999TipColTie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4999TipColTie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4999TipColTie), 6, 0));
         A5251TipColCtb = T002D3_A5251TipColCtb[0] ;
         n5251TipColCtb = T002D3_n5251TipColCtb[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5251TipColCtb", GXutil.str( A5251TipColCtb, 1, 0));
         Z396EmprCod = A396EmprCod ;
         Z831TipColCod = A831TipColCod ;
         sMode101 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load2D101( ) ;
         if ( AnyError == 1 )
         {
            RcdFound101 = (short)(0) ;
            initializeNonKey2D101( ) ;
         }
         Gx_mode = sMode101 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound101 = (short)(0) ;
         initializeNonKey2D101( ) ;
         sMode101 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode101 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey2D101( ) ;
      if ( RcdFound101 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound101 = (short)(0) ;
      /* Using cursor T002D7 */
      pr_default.execute(5, new Object[] {Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod), A396EmprCod});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( ( T002D7_A831TipColCod[0] < A831TipColCod ) ) && ( GXutil.strcmp(T002D7_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( ( T002D7_A831TipColCod[0] > A831TipColCod ) ) && ( GXutil.strcmp(T002D7_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A831TipColCod = T002D7_A831TipColCod[0] ;
            n831TipColCod = T002D7_n831TipColCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
            RcdFound101 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void move_previous( )
   {
      RcdFound101 = (short)(0) ;
      /* Using cursor T002D8 */
      pr_default.execute(6, new Object[] {Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod), A396EmprCod});
      if ( (pr_default.getStatus(6) != 101) )
      {
         while ( (pr_default.getStatus(6) != 101) && ( ( T002D8_A831TipColCod[0] > A831TipColCod ) ) && ( GXutil.strcmp(T002D8_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(6);
         }
         if ( (pr_default.getStatus(6) != 101) && ( ( T002D8_A831TipColCod[0] < A831TipColCod ) ) && ( GXutil.strcmp(T002D8_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A831TipColCod = T002D8_A831TipColCod[0] ;
            n831TipColCod = T002D8_n831TipColCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
            RcdFound101 = (short)(1) ;
         }
      }
      pr_default.close(6);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey2D101( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtTipColCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert2D101( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound101 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A831TipColCod != Z831TipColCod ) )
            {
               A831TipColCod = Z831TipColCod ;
               n831TipColCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "TIPCOLCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTipColCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtTipColCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               update2D101( ) ;
               GX_FocusControl = edtTipColCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A831TipColCod != Z831TipColCod ) )
            {
               /* Insert record */
               GX_FocusControl = edtTipColCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert2D101( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "TIPCOLCOD");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtTipColCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  /* Insert record */
                  GX_FocusControl = edtTipColCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert2D101( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A831TipColCod != Z831TipColCod ) )
      {
         A831TipColCod = Z831TipColCod ;
         n831TipColCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "TIPCOLCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTipColCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtTipColCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency2D101( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T002D2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPTIPCOL"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( Z5723TipArtFam != T002D2_A5723TipArtFam[0] ) || ( GXutil.strcmp(Z832TipColDsc, T002D2_A832TipColDsc[0]) != 0 ) || ( Z4999TipColTie != T002D2_A4999TipColTie[0] ) || ( Z5251TipColCtb != T002D2_A5251TipColCtb[0] ) )
         {
            if ( Z5723TipArtFam != T002D2_A5723TipArtFam[0] )
            {
               GXutil.writeLogln("formulaciontinte.ttipcol:[seudo value changed for attri]"+"TipArtFam");
               GXutil.writeLogRaw("Old: ",Z5723TipArtFam);
               GXutil.writeLogRaw("Current: ",T002D2_A5723TipArtFam[0]);
            }
            if ( GXutil.strcmp(Z832TipColDsc, T002D2_A832TipColDsc[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.ttipcol:[seudo value changed for attri]"+"TipColDsc");
               GXutil.writeLogRaw("Old: ",Z832TipColDsc);
               GXutil.writeLogRaw("Current: ",T002D2_A832TipColDsc[0]);
            }
            if ( Z4999TipColTie != T002D2_A4999TipColTie[0] )
            {
               GXutil.writeLogln("formulaciontinte.ttipcol:[seudo value changed for attri]"+"TipColTie");
               GXutil.writeLogRaw("Old: ",Z4999TipColTie);
               GXutil.writeLogRaw("Current: ",T002D2_A4999TipColTie[0]);
            }
            if ( Z5251TipColCtb != T002D2_A5251TipColCtb[0] )
            {
               GXutil.writeLogln("formulaciontinte.ttipcol:[seudo value changed for attri]"+"TipColCtb");
               GXutil.writeLogRaw("Old: ",Z5251TipColCtb);
               GXutil.writeLogRaw("Current: ",T002D2_A5251TipColCtb[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPTIPCOL"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert2D101( )
   {
      beforeValidate2D101( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable2D101( ) ;
      }
      if ( AnyError == 0 )
      {
         zm2D101( 0) ;
         checkOptimisticConcurrency2D101( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm2D101( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert2D101( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T002D9 */
                  pr_default.execute(7, new Object[] {Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod), Boolean.valueOf(n5723TipArtFam), Short.valueOf(A5723TipArtFam), Boolean.valueOf(n832TipColDsc), A832TipColDsc, Boolean.valueOf(n4999TipColTie), Integer.valueOf(A4999TipColTie), Boolean.valueOf(n5251TipColCtb), Byte.valueOf(A5251TipColCtb), A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTIPCOL");
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
                        resetCaption2D0( ) ;
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
            load2D101( ) ;
         }
         endLevel2D101( ) ;
      }
      closeExtendedTableCursors2D101( ) ;
   }

   public void update2D101( )
   {
      beforeValidate2D101( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable2D101( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency2D101( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm2D101( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate2D101( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T002D10 */
                  pr_default.execute(8, new Object[] {Boolean.valueOf(n5723TipArtFam), Short.valueOf(A5723TipArtFam), Boolean.valueOf(n832TipColDsc), A832TipColDsc, Boolean.valueOf(n4999TipColTie), Integer.valueOf(A4999TipColTie), Boolean.valueOf(n5251TipColCtb), Byte.valueOf(A5251TipColCtb), A396EmprCod, Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTIPCOL");
                  if ( (pr_default.getStatus(8) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPTIPCOL"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate2D101( ) ;
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
         endLevel2D101( ) ;
      }
      closeExtendedTableCursors2D101( ) ;
   }

   public void deferredUpdate2D101( )
   {
   }

   public void delete( )
   {
      beforeValidate2D101( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency2D101( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls2D101( ) ;
         afterConfirm2D101( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete2D101( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T002D11 */
               pr_default.execute(9, new Object[] {A396EmprCod, Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTIPCOL");
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
      sMode101 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel2D101( ) ;
      Gx_mode = sMode101 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls2D101( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         A13731TipColCDsc = GXutil.trim( GXutil.str( A831TipColCod, 2, 0)) + " - " + GXutil.trim( A832TipColDsc) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13731TipColCDsc", A13731TipColCDsc);
         GXt_char1 = A5724TipDscFam ;
         GXv_char4[0] = A396EmprCod ;
         GXv_int10[0] = A5723TipArtFam ;
         GXv_char3[0] = GXt_char1 ;
         new app.pfamdsc(remoteHandle, context).execute( GXv_char4, GXv_int10, GXv_char3) ;
         ttipcol_impl.this.A396EmprCod = GXv_char4[0] ;
         ttipcol_impl.this.A5723TipArtFam = GXv_int10[0] ;
         ttipcol_impl.this.GXt_char1 = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A5723TipArtFam", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5723TipArtFam), 4, 0));
         A5724TipDscFam = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "A5724TipDscFam", A5724TipDscFam);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T002D12 */
         pr_default.execute(10, new Object[] {A396EmprCod, Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
         if ( (pr_default.getStatus(10) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "GFMTC1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(10);
         /* Using cursor T002D13 */
         pr_default.execute(11, new Object[] {A396EmprCod, Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
         if ( (pr_default.getStatus(11) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CLTATCIN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(11);
         /* Using cursor T002D14 */
         pr_default.execute(12, new Object[] {A396EmprCod, Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
         if ( (pr_default.getStatus(12) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ENS001", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(12);
         /* Using cursor T002D15 */
         pr_default.execute(13, new Object[] {A396EmprCod, Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
         if ( (pr_default.getStatus(13) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TIPCOP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(13);
         /* Using cursor T002D16 */
         pr_default.execute(14, new Object[] {A396EmprCod, Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
         if ( (pr_default.getStatus(14) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CTARCO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(14);
         /* Using cursor T002D17 */
         pr_default.execute(15, new Object[] {A396EmprCod, Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
         if ( (pr_default.getStatus(15) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRETCO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(15);
         /* Using cursor T002D18 */
         pr_default.execute(16, new Object[] {A396EmprCod, Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
         if ( (pr_default.getStatus(16) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISREO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(16);
         /* Using cursor T002D19 */
         pr_default.execute(17, new Object[] {A396EmprCod, Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
         if ( (pr_default.getStatus(17) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CFORMU", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(17);
         /* Using cursor T002D20 */
         pr_default.execute(18, new Object[] {A396EmprCod, Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
         if ( (pr_default.getStatus(18) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISPOS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(18);
      }
   }

   public void endLevel2D101( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete2D101( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "formulaciontinte.ttipcol");
         if ( AnyError == 0 )
         {
            confirmValues2D0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "formulaciontinte.ttipcol");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart2D101( )
   {
      /* Scan By routine */
      /* Using cursor T002D21 */
      pr_default.execute(19, new Object[] {A396EmprCod});
      RcdFound101 = (short)(0) ;
      if ( (pr_default.getStatus(19) != 101) )
      {
         RcdFound101 = (short)(1) ;
         A831TipColCod = T002D21_A831TipColCod[0] ;
         n831TipColCod = T002D21_n831TipColCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext2D101( )
   {
      /* Scan next routine */
      pr_default.readNext(19);
      RcdFound101 = (short)(0) ;
      if ( (pr_default.getStatus(19) != 101) )
      {
         RcdFound101 = (short)(1) ;
         A831TipColCod = T002D21_A831TipColCod[0] ;
         n831TipColCod = T002D21_n831TipColCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
      }
   }

   public void scanEnd2D101( )
   {
      pr_default.close(19);
   }

   public void afterConfirm2D101( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert2D101( )
   {
      /* Before Insert Rules */
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && (0==A831TipColCod) && ( AV35autonumber == 1 ) )
      {
         GXt_int5 = A831TipColCod ;
         GXv_int6[0] = GXt_int5 ;
         new app.formulaciontinte.ttipcol_prxid(remoteHandle, context).execute( A396EmprCod, GXv_int6) ;
         ttipcol_impl.this.GXt_int5 = GXv_int6[0] ;
         A831TipColCod = GXt_int5 ;
         n831TipColCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
      }
   }

   public void beforeUpdate2D101( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete2D101( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete2D101( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate2D101( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes2D101( )
   {
      edtTipColCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipColCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipColCod_Enabled), 5, 0), true);
      edtTipColDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipColDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipColDsc_Enabled), 5, 0), true);
      edtTipColTie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipColTie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipColTie_Enabled), 5, 0), true);
      edtTipArtFam_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipArtFam_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipArtFam_Enabled), 5, 0), true);
      edtTipColCtb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipColCtb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipColCtb_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      edtavCombotipartfam_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCombotipartfam_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombotipartfam_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes2D101( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues2D0( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.formulaciontinte.ttipcol", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV30EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV31TipColCod,2,0))}, new String[] {"Gx_mode","EmprCod","TipColCod"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"TTIPCOL");
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("formulaciontinte\\ttipcol:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z831TipColCod", GXutil.ltrim( localUtil.ntoc( Z831TipColCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5723TipArtFam", GXutil.ltrim( localUtil.ntoc( Z5723TipArtFam, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z832TipColDsc", GXutil.rtrim( Z832TipColDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4999TipColTie", GXutil.ltrim( localUtil.ntoc( Z4999TipColTie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5251TipColCtb", GXutil.ltrim( localUtil.ntoc( Z5251TipColCtb, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTIPARTFAM_DATA", AV36TipArtFam_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTIPARTFAM_DATA", AV36TipArtFam_Data);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTRNCONTEXT", AV33TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTRNCONTEXT", AV33TrnContext);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTRNCONTEXT", getSecureSignedToken( "", AV33TrnContext));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "TIPDSCFAM", GXutil.rtrim( A5724TipDscFam));
      app.GxWebStd.gx_hidden_field( httpContext, "TIPCOLCDSC", A13731TipColCDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV30EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV30EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vTIPCOLCOD", GXutil.ltrim( localUtil.ntoc( AV31TipColCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTIPCOLCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV31TipColCod), "Z9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vAUTONUMBER", GXutil.ltrim( localUtil.ntoc( AV35autonumber, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRNOM", GXutil.rtrim( A407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TIPARTFAM_Objectcall", GXutil.rtrim( Combo_tipartfam_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TIPARTFAM_Cls", GXutil.rtrim( Combo_tipartfam_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TIPARTFAM_Selectedvalue_set", GXutil.rtrim( Combo_tipartfam_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TIPARTFAM_Enabled", GXutil.booltostr( Combo_tipartfam_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TIPARTFAM_Emptyitemtext", GXutil.rtrim( Combo_tipartfam_Emptyitemtext));
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
      return formatLink("app.formulaciontinte.ttipcol", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV30EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV31TipColCod,2,0))}, new String[] {"Gx_mode","EmprCod","TipColCod"})  ;
   }

   public String getPgmname( )
   {
      return "FormulacionTinte.TTIPCOL" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Tipo de Colorante", "") ;
   }

   public void initializeNonKey2D101( )
   {
      A5723TipArtFam = (short)(0) ;
      n5723TipArtFam = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5723TipArtFam", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5723TipArtFam), 4, 0));
      A13731TipColCDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13731TipColCDsc", A13731TipColCDsc);
      A5724TipDscFam = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A5724TipDscFam", A5724TipDscFam);
      A832TipColDsc = "" ;
      n832TipColDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A832TipColDsc", A832TipColDsc);
      A4999TipColTie = 0 ;
      n4999TipColTie = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4999TipColTie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4999TipColTie), 6, 0));
      A5251TipColCtb = (byte)(0) ;
      n5251TipColCtb = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5251TipColCtb", GXutil.str( A5251TipColCtb, 1, 0));
      Z5723TipArtFam = (short)(0) ;
      Z832TipColDsc = "" ;
      Z4999TipColTie = 0 ;
      Z5251TipColCtb = (byte)(0) ;
   }

   public void initAll2D101( )
   {
      A831TipColCod = (byte)(0) ;
      n831TipColCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
      initializeNonKey2D101( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211652888", true, true);
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
      httpContext.AddJavascriptSource("formulaciontinte/ttipcol.js", "?20268211652889", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      edtTipColCod_Internalname = "TIPCOLCOD" ;
      edtTipColDsc_Internalname = "TIPCOLDSC" ;
      edtTipColTie_Internalname = "TIPCOLTIE" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      lblTextblocktipartfam_Internalname = "TEXTBLOCKTIPARTFAM" ;
      Combo_tipartfam_Internalname = "COMBO_TIPARTFAM" ;
      edtTipArtFam_Internalname = "TIPARTFAM" ;
      divTablesplittedtipartfam_Internalname = "TABLESPLITTEDTIPARTFAM" ;
      edtTipColCtb_Internalname = "TIPCOLCTB" ;
      divTipcolctb_cell_Internalname = "TIPCOLCTB_CELL" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      bttBtntrn_delete_Internalname = "BTNTRN_DELETE" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtavCombotipartfam_Internalname = "vCOMBOTIPARTFAM" ;
      divSectionattribute_tipartfam_Internalname = "SECTIONATTRIBUTE_TIPARTFAM" ;
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
      Form.setCaption( httpContext.getMessage( "Tipo de Colorante", "") );
      edtavCombotipartfam_Jsonclick = "" ;
      edtavCombotipartfam_Enabled = 0 ;
      edtavCombotipartfam_Visible = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      bttBtntrn_delete_Enabled = 0 ;
      bttBtntrn_delete_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      edtTipColCtb_Jsonclick = "" ;
      edtTipColCtb_Enabled = 1 ;
      edtTipColCtb_Visible = 1 ;
      divTipcolctb_cell_Class = "col-xs-12 col-sm-3" ;
      edtTipArtFam_Jsonclick = "" ;
      edtTipArtFam_Enabled = 1 ;
      edtTipArtFam_Visible = 1 ;
      Combo_tipartfam_Emptyitemtext = "" ;
      Combo_tipartfam_Cls = "ExtendedCombo AttributeFL" ;
      Combo_tipartfam_Enabled = GXutil.toBoolean( -1) ;
      divUnnamedtable2_Visible = 1 ;
      edtTipColTie_Jsonclick = "" ;
      edtTipColTie_Enabled = 1 ;
      edtTipColDsc_Jsonclick = "" ;
      edtTipColDsc_Enabled = 1 ;
      edtTipColCod_Jsonclick = "" ;
      edtTipColCod_Enabled = 1 ;
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

   public void gx1asatipdscfam2D101( String A396EmprCod ,
                                     short A5723TipArtFam )
   {
      GXt_char1 = A5724TipDscFam ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int10[0] = A5723TipArtFam ;
      GXv_char3[0] = GXt_char1 ;
      new app.pfamdsc(remoteHandle, context).execute( GXv_char4, GXv_int10, GXv_char3) ;
      ttipcol_impl.this.A396EmprCod = GXv_char4[0] ;
      ttipcol_impl.this.A5723TipArtFam = GXv_int10[0] ;
      ttipcol_impl.this.GXt_char1 = GXv_char3[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A5723TipArtFam", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5723TipArtFam), 4, 0));
      A5724TipDscFam = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A5724TipDscFam", A5724TipDscFam);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A5724TipDscFam))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gx4asatipcolcod2D101( byte AV31TipColCod )
   {
      if ( ! (0==AV31TipColCod) )
      {
         A831TipColCod = AV31TipColCod ;
         n831TipColCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A831TipColCod, (byte)(2), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gx5asatipcolcod2D101( byte A831TipColCod ,
                                     short AV35autonumber ,
                                     String A396EmprCod )
   {
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && (0==A831TipColCod) && ( AV35autonumber == 1 ) )
      {
         GXt_int5 = A831TipColCod ;
         GXv_int6[0] = GXt_int5 ;
         new app.formulaciontinte.ttipcol_prxid(remoteHandle, context).execute( A396EmprCod, GXv_int6) ;
         ttipcol_impl.this.GXt_int5 = GXv_int6[0] ;
         A831TipColCod = GXt_int5 ;
         n831TipColCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A831TipColCod, (byte)(2), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gxasa52512D101( String A396EmprCod )
   {
      GXt_int5 = (byte)(0) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "CTB2SP", ""), ""), GXv_int6) ;
      ttipcol_impl.this.GXt_int5 = GXv_int6[0] ;
      edtTipColCtb_Visible = ((GXt_int5==1) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipColCtb_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipColCtb_Visible), 5, 0), true);
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

   public void valid_Tipartfam( )
   {
      n5723TipArtFam = false ;
      GXt_char1 = A5724TipDscFam ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int10[0] = A5723TipArtFam ;
      GXv_char3[0] = GXt_char1 ;
      new app.pfamdsc(remoteHandle, context).execute( GXv_char4, GXv_int10, GXv_char3) ;
      ttipcol_impl.this.A396EmprCod = GXv_char4[0] ;
      ttipcol_impl.this.A5723TipArtFam = GXv_int10[0] ;
      ttipcol_impl.this.GXt_char1 = GXv_char3[0] ;
      A5724TipDscFam = GXt_char1 ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A5724TipDscFam", GXutil.rtrim( A5724TipDscFam));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV30EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV31TipColCod',fld:'vTIPCOLCOD',pic:'Z9',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV33TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true},{av:'AV30EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV31TipColCod',fld:'vTIPCOLCOD',pic:'Z9',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e122D2',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV33TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true}]");
      setEventMetadata("AFTER TRN",",oparms:[]}");
      setEventMetadata("VALID_TIPCOLCOD","{handler:'valid_Tipcolcod',iparms:[]");
      setEventMetadata("VALID_TIPCOLCOD",",oparms:[]}");
      setEventMetadata("VALID_TIPCOLDSC","{handler:'valid_Tipcoldsc',iparms:[]");
      setEventMetadata("VALID_TIPCOLDSC",",oparms:[]}");
      setEventMetadata("VALID_TIPARTFAM","{handler:'valid_Tipartfam',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A5723TipArtFam',fld:'TIPARTFAM',pic:'ZZZ9'},{av:'A5724TipDscFam',fld:'TIPDSCFAM',pic:''}]");
      setEventMetadata("VALID_TIPARTFAM",",oparms:[{av:'A5724TipDscFam',fld:'TIPDSCFAM',pic:''}]}");
      setEventMetadata("VALIDV_COMBOTIPARTFAM","{handler:'validv_Combotipartfam',iparms:[]");
      setEventMetadata("VALIDV_COMBOTIPARTFAM",",oparms:[]}");
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
      wcpOAV30EmprCod = "" ;
      Z396EmprCod = "" ;
      Z832TipColDsc = "" ;
      Combo_tipartfam_Selectedvalue_get = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      Gx_mode = "" ;
      AV30EmprCod = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      A832TipColDsc = "" ;
      lblTextblocktipartfam_Jsonclick = "" ;
      ucCombo_tipartfam = new com.genexus.webpanels.GXUserControl();
      Combo_tipartfam_Caption = "" ;
      AV36TipArtFam_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      AV39Pgmname = "" ;
      A5724TipDscFam = "" ;
      A13731TipColCDsc = "" ;
      A407EmprNom = "" ;
      Combo_tipartfam_Objectcall = "" ;
      Combo_tipartfam_Class = "" ;
      Combo_tipartfam_Icontype = "" ;
      Combo_tipartfam_Icon = "" ;
      Combo_tipartfam_Tooltip = "" ;
      Combo_tipartfam_Selectedvalue_set = "" ;
      Combo_tipartfam_Selectedtext_set = "" ;
      Combo_tipartfam_Selectedtext_get = "" ;
      Combo_tipartfam_Gamoauthtoken = "" ;
      Combo_tipartfam_Ddointernalname = "" ;
      Combo_tipartfam_Titlecontrolalign = "" ;
      Combo_tipartfam_Dropdownoptionstype = "" ;
      Combo_tipartfam_Titlecontrolidtoreplace = "" ;
      Combo_tipartfam_Datalisttype = "" ;
      Combo_tipartfam_Datalistfixedvalues = "" ;
      Combo_tipartfam_Datalistproc = "" ;
      Combo_tipartfam_Datalistprocparametersprefix = "" ;
      Combo_tipartfam_Remoteservicesparameters = "" ;
      Combo_tipartfam_Htmltemplate = "" ;
      Combo_tipartfam_Multiplevaluestype = "" ;
      Combo_tipartfam_Loadingdata = "" ;
      Combo_tipartfam_Noresultsfound = "" ;
      Combo_tipartfam_Onlyselectedvalues = "" ;
      Combo_tipartfam_Selectalltext = "" ;
      Combo_tipartfam_Multiplevaluesseparator = "" ;
      Combo_tipartfam_Addnewoptiontext = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode101 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      AV22Station = "" ;
      AV16EmprNom = "" ;
      AV17UsurCod = "" ;
      GXv_char2 = new String[1] ;
      AV32WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV33TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV34WebSession = httpContext.getWebSession();
      GXt_objcol_SdtDVB_SDTComboData_Item8 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV37ComboSelectedValue = "" ;
      GXv_objcol_SdtDVB_SDTComboData_Item9 = new GXBaseCollection[1] ;
      Z407EmprNom = "" ;
      T002D4_A407EmprNom = new String[] {""} ;
      T002D4_n407EmprNom = new boolean[] {false} ;
      T002D5_A831TipColCod = new byte[1] ;
      T002D5_n831TipColCod = new boolean[] {false} ;
      T002D5_A5723TipArtFam = new short[1] ;
      T002D5_n5723TipArtFam = new boolean[] {false} ;
      T002D5_A832TipColDsc = new String[] {""} ;
      T002D5_n832TipColDsc = new boolean[] {false} ;
      T002D5_A407EmprNom = new String[] {""} ;
      T002D5_n407EmprNom = new boolean[] {false} ;
      T002D5_A4999TipColTie = new int[1] ;
      T002D5_n4999TipColTie = new boolean[] {false} ;
      T002D5_A5251TipColCtb = new byte[1] ;
      T002D5_n5251TipColCtb = new boolean[] {false} ;
      T002D5_A396EmprCod = new String[] {""} ;
      T002D6_A396EmprCod = new String[] {""} ;
      T002D6_A831TipColCod = new byte[1] ;
      T002D6_n831TipColCod = new boolean[] {false} ;
      T002D3_A831TipColCod = new byte[1] ;
      T002D3_n831TipColCod = new boolean[] {false} ;
      T002D3_A5723TipArtFam = new short[1] ;
      T002D3_n5723TipArtFam = new boolean[] {false} ;
      T002D3_A832TipColDsc = new String[] {""} ;
      T002D3_n832TipColDsc = new boolean[] {false} ;
      T002D3_A4999TipColTie = new int[1] ;
      T002D3_n4999TipColTie = new boolean[] {false} ;
      T002D3_A5251TipColCtb = new byte[1] ;
      T002D3_n5251TipColCtb = new boolean[] {false} ;
      T002D3_A396EmprCod = new String[] {""} ;
      T002D7_A396EmprCod = new String[] {""} ;
      T002D7_A831TipColCod = new byte[1] ;
      T002D7_n831TipColCod = new boolean[] {false} ;
      T002D8_A396EmprCod = new String[] {""} ;
      T002D8_A831TipColCod = new byte[1] ;
      T002D8_n831TipColCod = new boolean[] {false} ;
      T002D2_A831TipColCod = new byte[1] ;
      T002D2_n831TipColCod = new boolean[] {false} ;
      T002D2_A5723TipArtFam = new short[1] ;
      T002D2_n5723TipArtFam = new boolean[] {false} ;
      T002D2_A832TipColDsc = new String[] {""} ;
      T002D2_n832TipColDsc = new boolean[] {false} ;
      T002D2_A4999TipColTie = new int[1] ;
      T002D2_n4999TipColTie = new boolean[] {false} ;
      T002D2_A5251TipColCtb = new byte[1] ;
      T002D2_n5251TipColCtb = new boolean[] {false} ;
      T002D2_A396EmprCod = new String[] {""} ;
      T002D12_A396EmprCod = new String[] {""} ;
      T002D12_A8564Gf_Cod = new short[1] ;
      T002D12_A831TipColCod = new byte[1] ;
      T002D12_n831TipColCod = new boolean[] {false} ;
      T002D13_A396EmprCod = new String[] {""} ;
      T002D13_A252CliCod = new int[1] ;
      T002D13_A829TipArtCod = new short[1] ;
      T002D13_A831TipColCod = new byte[1] ;
      T002D13_n831TipColCod = new boolean[] {false} ;
      T002D13_A583IntCod = new byte[1] ;
      T002D13_A5098TipDisCod = new String[] {""} ;
      T002D13_A6603Est1_anyo = new short[1] ;
      T002D13_A6604Est1_mes = new byte[1] ;
      T002D13_A6605Est1_dia = new byte[1] ;
      T002D14_A396EmprCod = new String[] {""} ;
      T002D14_A5532Lb_numero = new int[1] ;
      T002D15_A396EmprCod = new String[] {""} ;
      T002D15_A831TipColCod = new byte[1] ;
      T002D15_n831TipColCod = new boolean[] {false} ;
      T002D15_A5162TipColLin = new short[1] ;
      T002D16_A396EmprCod = new String[] {""} ;
      T002D16_A2720TarSec = new String[] {""} ;
      T002D16_A252CliCod = new int[1] ;
      T002D16_A829TipArtCod = new short[1] ;
      T002D16_A831TipColCod = new byte[1] ;
      T002D16_n831TipColCod = new boolean[] {false} ;
      T002D17_A396EmprCod = new String[] {""} ;
      T002D17_A252CliCod = new int[1] ;
      T002D17_A65ArtCod = new String[] {""} ;
      T002D17_A831TipColCod = new byte[1] ;
      T002D17_n831TipColCod = new boolean[] {false} ;
      T002D18_A396EmprCod = new String[] {""} ;
      T002D18_A539HisBarCod = new int[1] ;
      T002D18_A545HisCodReo = new byte[1] ;
      T002D18_A544HisCodPar = new String[] {""} ;
      T002D18_A833TipDefCod = new short[1] ;
      T002D19_A396EmprCod = new String[] {""} ;
      T002D19_A252CliCod = new int[1] ;
      T002D19_A494ForSer = new String[] {""} ;
      T002D19_A482ForColNom = new String[] {""} ;
      T002D19_A483ForColNum = new int[1] ;
      T002D19_A831TipColCod = new byte[1] ;
      T002D19_n831TipColCod = new boolean[] {false} ;
      T002D20_A396EmprCod = new String[] {""} ;
      T002D20_A361DisCod = new int[1] ;
      T002D21_A396EmprCod = new String[] {""} ;
      T002D21_A831TipColCod = new byte[1] ;
      T002D21_n831TipColCod = new boolean[] {false} ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXv_int6 = new byte[1] ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      GXv_int10 = new short[1] ;
      GXv_char3 = new String[1] ;
      Z5724TipDscFam = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.ttipcol__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.ttipcol__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.ttipcol__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.ttipcol__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.ttipcol__default(),
         new Object[] {
             new Object[] {
            T002D2_A831TipColCod, T002D2_A5723TipArtFam, T002D2_n5723TipArtFam, T002D2_A832TipColDsc, T002D2_n832TipColDsc, T002D2_A4999TipColTie, T002D2_n4999TipColTie, T002D2_A5251TipColCtb, T002D2_n5251TipColCtb, T002D2_A396EmprCod
            }
            , new Object[] {
            T002D3_A831TipColCod, T002D3_A5723TipArtFam, T002D3_n5723TipArtFam, T002D3_A832TipColDsc, T002D3_n832TipColDsc, T002D3_A4999TipColTie, T002D3_n4999TipColTie, T002D3_A5251TipColCtb, T002D3_n5251TipColCtb, T002D3_A396EmprCod
            }
            , new Object[] {
            T002D4_A407EmprNom, T002D4_n407EmprNom
            }
            , new Object[] {
            T002D5_A831TipColCod, T002D5_A5723TipArtFam, T002D5_n5723TipArtFam, T002D5_A832TipColDsc, T002D5_n832TipColDsc, T002D5_A407EmprNom, T002D5_n407EmprNom, T002D5_A4999TipColTie, T002D5_n4999TipColTie, T002D5_A5251TipColCtb,
            T002D5_n5251TipColCtb, T002D5_A396EmprCod
            }
            , new Object[] {
            T002D6_A396EmprCod, T002D6_A831TipColCod
            }
            , new Object[] {
            T002D7_A396EmprCod, T002D7_A831TipColCod
            }
            , new Object[] {
            T002D8_A396EmprCod, T002D8_A831TipColCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T002D12_A396EmprCod, T002D12_A8564Gf_Cod, T002D12_A831TipColCod
            }
            , new Object[] {
            T002D13_A396EmprCod, T002D13_A252CliCod, T002D13_A829TipArtCod, T002D13_A831TipColCod, T002D13_A583IntCod, T002D13_A5098TipDisCod, T002D13_A6603Est1_anyo, T002D13_A6604Est1_mes, T002D13_A6605Est1_dia
            }
            , new Object[] {
            T002D14_A396EmprCod, T002D14_A5532Lb_numero
            }
            , new Object[] {
            T002D15_A396EmprCod, T002D15_A831TipColCod, T002D15_A5162TipColLin
            }
            , new Object[] {
            T002D16_A396EmprCod, T002D16_A2720TarSec, T002D16_A252CliCod, T002D16_A829TipArtCod, T002D16_A831TipColCod
            }
            , new Object[] {
            T002D17_A396EmprCod, T002D17_A252CliCod, T002D17_A65ArtCod, T002D17_A831TipColCod
            }
            , new Object[] {
            T002D18_A396EmprCod, T002D18_A539HisBarCod, T002D18_A545HisCodReo, T002D18_A544HisCodPar, T002D18_A833TipDefCod
            }
            , new Object[] {
            T002D19_A396EmprCod, T002D19_A252CliCod, T002D19_A494ForSer, T002D19_A482ForColNom, T002D19_A483ForColNum, T002D19_A831TipColCod
            }
            , new Object[] {
            T002D20_A396EmprCod, T002D20_A361DisCod
            }
            , new Object[] {
            T002D21_A396EmprCod, T002D21_A831TipColCod
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV39Pgmname = "FormulacionTinte.TTIPCOL" ;
   }

   private byte wcpOAV31TipColCod ;
   private byte Z831TipColCod ;
   private byte Z5251TipColCtb ;
   private byte GxWebError ;
   private byte AV31TipColCod ;
   private byte A831TipColCod ;
   private byte nKeyPressed ;
   private byte A5251TipColCtb ;
   private byte AV26F_tipcop ;
   private byte AV29F_moda21 ;
   private byte AV27Flag2sp ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private byte GXt_int5 ;
   private byte GXv_int6[] ;
   private short Z5723TipArtFam ;
   private short A5723TipArtFam ;
   private short AV35autonumber ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short AV38ComboTipArtFam ;
   private short RcdFound101 ;
   private short nIsDirty_101 ;
   private short GXv_int10[] ;
   private int Z4999TipColTie ;
   private int trnEnded ;
   private int edtTipColCod_Enabled ;
   private int edtTipColDsc_Enabled ;
   private int A4999TipColTie ;
   private int edtTipColTie_Enabled ;
   private int divUnnamedtable2_Visible ;
   private int edtTipArtFam_Enabled ;
   private int edtTipArtFam_Visible ;
   private int edtTipColCtb_Visible ;
   private int edtTipColCtb_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int edtavPgmname_Enabled ;
   private int edtavCombotipartfam_Enabled ;
   private int edtavCombotipartfam_Visible ;
   private int Combo_tipartfam_Datalistupdateminimumcharacters ;
   private int GX_JID ;
   private int idxLst ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV30EmprCod ;
   private String Z396EmprCod ;
   private String Z832TipColDsc ;
   private String Combo_tipartfam_Selectedvalue_get ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String Gx_mode ;
   private String AV30EmprCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtTipColCod_Internalname ;
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
   private String edtTipColCod_Jsonclick ;
   private String edtTipColDsc_Internalname ;
   private String A832TipColDsc ;
   private String edtTipColDsc_Jsonclick ;
   private String edtTipColTie_Internalname ;
   private String edtTipColTie_Jsonclick ;
   private String divUnnamedtable2_Internalname ;
   private String divTablesplittedtipartfam_Internalname ;
   private String lblTextblocktipartfam_Internalname ;
   private String lblTextblocktipartfam_Jsonclick ;
   private String Combo_tipartfam_Caption ;
   private String Combo_tipartfam_Cls ;
   private String Combo_tipartfam_Emptyitemtext ;
   private String Combo_tipartfam_Internalname ;
   private String edtTipArtFam_Internalname ;
   private String edtTipArtFam_Jsonclick ;
   private String divTipcolctb_cell_Internalname ;
   private String divTipcolctb_cell_Class ;
   private String edtTipColCtb_Internalname ;
   private String edtTipColCtb_Jsonclick ;
   private String divUnnamedtable3_Internalname ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String edtavPgmname_Internalname ;
   private String AV39Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String divSectionattribute_tipartfam_Internalname ;
   private String edtavCombotipartfam_Internalname ;
   private String edtavCombotipartfam_Jsonclick ;
   private String A5724TipDscFam ;
   private String A407EmprNom ;
   private String Combo_tipartfam_Objectcall ;
   private String Combo_tipartfam_Class ;
   private String Combo_tipartfam_Icontype ;
   private String Combo_tipartfam_Icon ;
   private String Combo_tipartfam_Tooltip ;
   private String Combo_tipartfam_Selectedvalue_set ;
   private String Combo_tipartfam_Selectedtext_set ;
   private String Combo_tipartfam_Selectedtext_get ;
   private String Combo_tipartfam_Gamoauthtoken ;
   private String Combo_tipartfam_Ddointernalname ;
   private String Combo_tipartfam_Titlecontrolalign ;
   private String Combo_tipartfam_Dropdownoptionstype ;
   private String Combo_tipartfam_Titlecontrolidtoreplace ;
   private String Combo_tipartfam_Datalisttype ;
   private String Combo_tipartfam_Datalistfixedvalues ;
   private String Combo_tipartfam_Datalistproc ;
   private String Combo_tipartfam_Datalistprocparametersprefix ;
   private String Combo_tipartfam_Remoteservicesparameters ;
   private String Combo_tipartfam_Htmltemplate ;
   private String Combo_tipartfam_Multiplevaluestype ;
   private String Combo_tipartfam_Loadingdata ;
   private String Combo_tipartfam_Noresultsfound ;
   private String Combo_tipartfam_Onlyselectedvalues ;
   private String Combo_tipartfam_Selectalltext ;
   private String Combo_tipartfam_Multiplevaluesseparator ;
   private String Combo_tipartfam_Addnewoptiontext ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String hsh ;
   private String sMode101 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String AV22Station ;
   private String AV16EmprNom ;
   private String AV17UsurCod ;
   private String GXv_char2[] ;
   private String Z407EmprNom ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String Z5724TipDscFam ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n5723TipArtFam ;
   private boolean n831TipColCod ;
   private boolean wbErr ;
   private boolean Dvpanel_tableattributes_Autowidth ;
   private boolean Dvpanel_tableattributes_Autoheight ;
   private boolean Dvpanel_tableattributes_Collapsible ;
   private boolean Dvpanel_tableattributes_Collapsed ;
   private boolean Dvpanel_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_tableattributes_Autoscroll ;
   private boolean n407EmprNom ;
   private boolean Combo_tipartfam_Enabled ;
   private boolean Combo_tipartfam_Visible ;
   private boolean Combo_tipartfam_Allowmultipleselection ;
   private boolean Combo_tipartfam_Isgriditem ;
   private boolean Combo_tipartfam_Hasdescription ;
   private boolean Combo_tipartfam_Includeonlyselectedoption ;
   private boolean Combo_tipartfam_Includeselectalloption ;
   private boolean Combo_tipartfam_Emptyitem ;
   private boolean Combo_tipartfam_Includeaddnewoption ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean n832TipColDsc ;
   private boolean n4999TipColTie ;
   private boolean n5251TipColCtb ;
   private boolean returnInSub ;
   private String A13731TipColCDsc ;
   private String AV37ComboSelectedValue ;
   private com.genexus.webpanels.WebSession AV34WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.webpanels.GXUserControl ucCombo_tipartfam ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private String[] T002D4_A407EmprNom ;
   private boolean[] T002D4_n407EmprNom ;
   private byte[] T002D5_A831TipColCod ;
   private boolean[] T002D5_n831TipColCod ;
   private short[] T002D5_A5723TipArtFam ;
   private boolean[] T002D5_n5723TipArtFam ;
   private String[] T002D5_A832TipColDsc ;
   private boolean[] T002D5_n832TipColDsc ;
   private String[] T002D5_A407EmprNom ;
   private boolean[] T002D5_n407EmprNom ;
   private int[] T002D5_A4999TipColTie ;
   private boolean[] T002D5_n4999TipColTie ;
   private byte[] T002D5_A5251TipColCtb ;
   private boolean[] T002D5_n5251TipColCtb ;
   private String[] T002D5_A396EmprCod ;
   private String[] T002D6_A396EmprCod ;
   private byte[] T002D6_A831TipColCod ;
   private boolean[] T002D6_n831TipColCod ;
   private byte[] T002D3_A831TipColCod ;
   private boolean[] T002D3_n831TipColCod ;
   private short[] T002D3_A5723TipArtFam ;
   private boolean[] T002D3_n5723TipArtFam ;
   private String[] T002D3_A832TipColDsc ;
   private boolean[] T002D3_n832TipColDsc ;
   private int[] T002D3_A4999TipColTie ;
   private boolean[] T002D3_n4999TipColTie ;
   private byte[] T002D3_A5251TipColCtb ;
   private boolean[] T002D3_n5251TipColCtb ;
   private String[] T002D3_A396EmprCod ;
   private String[] T002D7_A396EmprCod ;
   private byte[] T002D7_A831TipColCod ;
   private boolean[] T002D7_n831TipColCod ;
   private String[] T002D8_A396EmprCod ;
   private byte[] T002D8_A831TipColCod ;
   private boolean[] T002D8_n831TipColCod ;
   private byte[] T002D2_A831TipColCod ;
   private boolean[] T002D2_n831TipColCod ;
   private short[] T002D2_A5723TipArtFam ;
   private boolean[] T002D2_n5723TipArtFam ;
   private String[] T002D2_A832TipColDsc ;
   private boolean[] T002D2_n832TipColDsc ;
   private int[] T002D2_A4999TipColTie ;
   private boolean[] T002D2_n4999TipColTie ;
   private byte[] T002D2_A5251TipColCtb ;
   private boolean[] T002D2_n5251TipColCtb ;
   private String[] T002D2_A396EmprCod ;
   private String[] T002D12_A396EmprCod ;
   private short[] T002D12_A8564Gf_Cod ;
   private byte[] T002D12_A831TipColCod ;
   private boolean[] T002D12_n831TipColCod ;
   private String[] T002D13_A396EmprCod ;
   private int[] T002D13_A252CliCod ;
   private short[] T002D13_A829TipArtCod ;
   private byte[] T002D13_A831TipColCod ;
   private boolean[] T002D13_n831TipColCod ;
   private byte[] T002D13_A583IntCod ;
   private String[] T002D13_A5098TipDisCod ;
   private short[] T002D13_A6603Est1_anyo ;
   private byte[] T002D13_A6604Est1_mes ;
   private byte[] T002D13_A6605Est1_dia ;
   private String[] T002D14_A396EmprCod ;
   private int[] T002D14_A5532Lb_numero ;
   private String[] T002D15_A396EmprCod ;
   private byte[] T002D15_A831TipColCod ;
   private boolean[] T002D15_n831TipColCod ;
   private short[] T002D15_A5162TipColLin ;
   private String[] T002D16_A396EmprCod ;
   private String[] T002D16_A2720TarSec ;
   private int[] T002D16_A252CliCod ;
   private short[] T002D16_A829TipArtCod ;
   private byte[] T002D16_A831TipColCod ;
   private boolean[] T002D16_n831TipColCod ;
   private String[] T002D17_A396EmprCod ;
   private int[] T002D17_A252CliCod ;
   private String[] T002D17_A65ArtCod ;
   private byte[] T002D17_A831TipColCod ;
   private boolean[] T002D17_n831TipColCod ;
   private String[] T002D18_A396EmprCod ;
   private int[] T002D18_A539HisBarCod ;
   private byte[] T002D18_A545HisCodReo ;
   private String[] T002D18_A544HisCodPar ;
   private short[] T002D18_A833TipDefCod ;
   private String[] T002D19_A396EmprCod ;
   private int[] T002D19_A252CliCod ;
   private String[] T002D19_A494ForSer ;
   private String[] T002D19_A482ForColNom ;
   private int[] T002D19_A483ForColNum ;
   private byte[] T002D19_A831TipColCod ;
   private boolean[] T002D19_n831TipColCod ;
   private String[] T002D20_A396EmprCod ;
   private int[] T002D20_A361DisCod ;
   private String[] T002D21_A396EmprCod ;
   private byte[] T002D21_A831TipColCod ;
   private boolean[] T002D21_n831TipColCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV36TipArtFam_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXt_objcol_SdtDVB_SDTComboData_Item8 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXv_objcol_SdtDVB_SDTComboData_Item9[] ;
   private app.wwpbaseobjects.SdtWWPContext AV32WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV33TrnContext ;
}

final  class ttipcol__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttipcol__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttipcol__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttipcol__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttipcol__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T002D2", "SELECT TipColCod, TipArtFam, TipColDsc, TipColTie, TipColCtb, EmprCod FROM TXPTIPCOL WHERE EmprCod = ? AND TipColCod = ?  FOR UPDATE OF TipArtFam, TipColDsc, TipColTie, TipColCtb NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002D3", "SELECT TipColCod, TipArtFam, TipColDsc, TipColTie, TipColCtb, EmprCod FROM TXPTIPCOL WHERE EmprCod = ? AND TipColCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002D4", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002D5", "SELECT /*+ FIRST_ROWS(100) */ TM1.TipColCod, TM1.TipArtFam, TM1.TipColDsc, T2.EmprNom, TM1.TipColTie, TM1.TipColCtb, TM1.EmprCod FROM (TXPTIPCOL TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.TipColCod = ? ORDER BY TM1.EmprCod, TM1.TipColCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002D6", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, TipColCod FROM TXPTIPCOL WHERE EmprCod = ? AND TipColCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002D7", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, TipColCod FROM TXPTIPCOL WHERE ( TipColCod > ?) and EmprCod = ? ORDER BY EmprCod, TipColCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002D8", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, TipColCod FROM TXPTIPCOL WHERE ( TipColCod < ?) and EmprCod = ? ORDER BY EmprCod DESC, TipColCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T002D9", "INSERT INTO TXPTIPCOL(TipColCod, TipArtFam, TipColDsc, TipColTie, TipColCtb, EmprCod, TipColUl, TipOpcCli, TipPreMin, TipPreMax, TipMarCom, TipMer, TipMer1, TipMer2, TipMer3, TipMer4) VALUES(?, ?, ?, ?, ?, ?, 0, ' ', 0, 0, 0, 0, 0, 0, 0, 0)", GX_NOMASK, "TXPTIPCOL")
         ,new UpdateCursor("T002D10", "UPDATE TXPTIPCOL SET TipArtFam=?, TipColDsc=?, TipColTie=?, TipColCtb=?  WHERE EmprCod = ? AND TipColCod = ?", GX_NOMASK, "TXPTIPCOL")
         ,new UpdateCursor("T002D11", "DELETE FROM TXPTIPCOL  WHERE EmprCod = ? AND TipColCod = ?", GX_NOMASK, "TXPTIPCOL")
         ,new ForEachCursor("T002D12", "SELECT * FROM (SELECT EmprCod, Gf_Cod, TipColCod FROM TXPGFMTC1 WHERE EmprCod = ? AND TipColCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002D13", "SELECT * FROM (SELECT EmprCod, CliCod, TipArtCod, TipColCod, IntCod, TipDisCod, Est1_anyo, Est1_mes, Est1_dia FROM TXPCLTATC WHERE EmprCod = ? AND TipColCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002D14", "SELECT * FROM (SELECT EmprCod, Lb_numero FROM TXPENS001 WHERE EmprCod = ? AND TipColCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002D15", "SELECT * FROM (SELECT EmprCod, TipColCod, TipColLin FROM TXPTIPCOP WHERE EmprCod = ? AND TipColCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002D16", "SELECT * FROM (SELECT EmprCod, TarSec, CliCod, TipArtCod, TipColCod FROM TXPCTARCO WHERE EmprCod = ? AND TipColCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002D17", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, TipColCod FROM TXPPRETCO WHERE EmprCod = ? AND TipColCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002D18", "SELECT * FROM (SELECT EmprCod, HisBarCod, HisCodReo, HisCodPar, TipDefCod FROM TXPHISREO WHERE EmprCod = ? AND HisTipCol = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002D19", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod FROM TXPCFORMU WHERE EmprCod = ? AND TipColCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002D20", "SELECT * FROM (SELECT EmprCod, DisCod FROM TXPDISPOS WHERE EmprCod = ? AND DisTipCol = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002D21", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, TipColCod FROM TXPTIPCOL WHERE EmprCod = ? ORDER BY EmprCod, TipColCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((byte[]) buf[7])[0] = rslt.getByte(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 3);
               return;
            case 1 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(4);
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((byte[]) buf[9])[0] = rslt.getByte(6);
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 19 :
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
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
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
            case 6 :
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
            case 7 :
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
                  stmt.setShort(2, ((Number) parms[3]).shortValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 30);
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
               stmt.setString(6, (String)parms[10], 3);
               return;
            case 8 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
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
               stmt.setString(5, (String)parms[8], 3);
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[10]).byteValue());
               }
               return;
            case 9 :
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
            case 10 :
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
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
               }
               return;
            case 17 :
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
            case 18 :
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
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

