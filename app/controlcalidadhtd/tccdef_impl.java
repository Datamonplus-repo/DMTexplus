package app.controlcalidadhtd ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tccdef_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action49") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A4031CCTCod = (int)(GXutil.lval( httpContext.GetPar( "CCTCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
         A4034CCTLin = (short)(GXutil.lval( httpContext.GetPar( "CCTLin"))) ;
         A4037CCTTpoCtr = httpContext.GetPar( "CCTTpoCtr") ;
         httpContext.ajax_rsp_assign_attri("", false, "A4037CCTTpoCtr", A4037CCTTpoCtr);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_49_IA622( A396EmprCod, A4031CCTCod, A4034CCTLin, A4037CCTTpoCtr) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxCallCrl"+"_"+"CCVCOD") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxdlaccvcodIA622( A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_81") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_81( A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_83") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A11522CCVCod = httpContext.GetPar( "CCVCod") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_83( A396EmprCod, A11522CCVCod) ;
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Gridlevel_level2") == 0 )
      {
         gxnrgridlevel_level2_newrow_invoke( ) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Freestylelevel_level1") == 0 )
      {
         gxnrfreestylelevel_level1_newrow_invoke( ) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Gridlevel_notificaciones") == 0 )
      {
         gxnrgridlevel_notificaciones_newrow_invoke( ) ;
         return  ;
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
            AV29CCTCod = (int)(GXutil.lval( httpContext.GetPar( "CCTCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29CCTCod), 6, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCCTCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV29CCTCod), "ZZZZZ9")));
            AV37isVariable = GXutil.strtobool( httpContext.GetPar( "isVariable")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV37isVariable", AV37isVariable);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vISVARIABLE", getSecureSignedToken( "", AV37isVariable));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Definición de Cont. de Calidad", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtCCTCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public void gxnrgridlevel_level2_newrow_invoke( )
   {
      nRC_GXsfl_154 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_154"))) ;
      nGXsfl_154_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_154_idx"))) ;
      sGXsfl_154_idx = httpContext.GetPar( "sGXsfl_154_idx") ;
      Gx_mode = httpContext.GetPar( "Mode") ;
      A4034CCTLin = (short)(GXutil.lval( httpContext.GetPar( "CCTLin"))) ;
      A4037CCTTpoCtr = httpContext.GetPar( "CCTTpoCtr") ;
      A4048CCTLinTpoI = httpContext.GetPar( "CCTLinTpoI") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgridlevel_level2_newrow( ) ;
      /* End function gxnrGridlevel_level2_newrow_invoke */
   }

   public void gxnrfreestylelevel_level1_newrow_invoke( )
   {
      nRC_GXsfl_79 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_79"))) ;
      nGXsfl_79_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_79_idx"))) ;
      sGXsfl_79_idx = httpContext.GetPar( "sGXsfl_79_idx") ;
      edtCCVPict_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCVPict_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCVPict_Visible), 5, 0), !bGXsfl_79_Refreshing);
      edtCCVTpoDat_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCVTpoDat_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCVTpoDat_Visible), 5, 0), !bGXsfl_79_Refreshing);
      edtCCVDsc_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCVDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCVDsc_Visible), 5, 0), !bGXsfl_79_Refreshing);
      Gx_mode = httpContext.GetPar( "Mode") ;
      A4037CCTTpoCtr = httpContext.GetPar( "CCTTpoCtr") ;
      AV28EmprCod = httpContext.GetPar( "EmprCod") ;
      A396EmprCod = httpContext.GetPar( "EmprCod") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrfreestylelevel_level1_newrow( ) ;
      /* End function gxnrFreestylelevel_level1_newrow_invoke */
   }

   public void gxnrgridlevel_notificaciones_newrow_invoke( )
   {
      nRC_GXsfl_181 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_181"))) ;
      nGXsfl_181_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_181_idx"))) ;
      sGXsfl_181_idx = httpContext.GetPar( "sGXsfl_181_idx") ;
      A11475CCTNotUlt = (short)(GXutil.lval( httpContext.GetPar( "CCTNotUlt"))) ;
      Gx_BScreen = (byte)(GXutil.lval( httpContext.GetPar( "Gx_BScreen"))) ;
      Gx_mode = httpContext.GetPar( "Mode") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgridlevel_notificaciones_newrow( ) ;
      /* End function gxnrGridlevel_notificaciones_newrow_invoke */
   }

   public tccdef_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tccdef_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tccdef_impl.class ));
   }

   public tccdef_impl( int remoteHandle ,
                       ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbCCTTpoCtr = new HTMLChoice();
      chkCCTFinFas = UIFactory.getCheckbox(this);
      chkCCTIniFas = UIFactory.getCheckbox(this);
      chkCCTSto = UIFactory.getCheckbox(this);
      chkCCTObs = UIFactory.getCheckbox(this);
      cmbCCTLinTpoI = new HTMLChoice();
      dynCCVCod = new HTMLChoice();
      cmbCCTLinTpoD = new HTMLChoice();
      cmbCCTNotEvt = new HTMLChoice();
      cmbCCTNotDst = new HTMLChoice();
      dynCCTNotUsr = new HTMLChoice();
      cmbCCTNotAdj = new HTMLChoice();
      cmbCCTNotStp = new HTMLChoice();
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
      if ( cmbCCTTpoCtr.getItemCount() > 0 )
      {
         A4037CCTTpoCtr = cmbCCTTpoCtr.getValidValue(A4037CCTTpoCtr) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4037CCTTpoCtr", A4037CCTTpoCtr);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbCCTTpoCtr.setValue( GXutil.rtrim( A4037CCTTpoCtr) );
         httpContext.ajax_rsp_assign_prop("", false, cmbCCTTpoCtr.getInternalname(), "Values", cmbCCTTpoCtr.ToJavascriptSource(), true);
      }
      A4406CCTFinFas = ((GXutil.strcmp(GXutil.rtrim( A4406CCTFinFas), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "A4406CCTFinFas", A4406CCTFinFas);
      A4407CCTIniFas = ((GXutil.strcmp(GXutil.rtrim( A4407CCTIniFas), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "A4407CCTIniFas", A4407CCTIniFas);
      A4040CCTSto = ((GXutil.strcmp(GXutil.rtrim( A4040CCTSto), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "A4040CCTSto", A4040CCTSto);
      A4042CCTObs = ((GXutil.strcmp(GXutil.rtrim( A4042CCTObs), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "A4042CCTObs", A4042CCTObs);
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCellFL RequiredDataContentCellFL", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCCTCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCCTCod_Internalname, httpContext.getMessage( "Código", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCCTCod_Internalname, GXutil.ltrim( localUtil.ntoc( A4031CCTCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4031CCTCod), "ZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCCTCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCCTCod_Enabled, 1, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\TCCDef.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCellFL RequiredDataContentCellFL", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCCTDsc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCCTDsc_Internalname, httpContext.getMessage( "Descripción del Test", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCCTDsc_Internalname, GXutil.rtrim( A4036CCTDsc), GXutil.rtrim( localUtil.format( A4036CCTDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,29);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCCTDsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCCTDsc_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\TCCDef.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTablefases_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbCCTTpoCtr.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, cmbCCTTpoCtr.getInternalname(), httpContext.getMessage( "Tipo de Control", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbCCTTpoCtr, cmbCCTTpoCtr.getInternalname(), GXutil.rtrim( A4037CCTTpoCtr), 1, cmbCCTTpoCtr.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbCCTTpoCtr.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,36);\"", "", true, (byte)(0), "HLP_ControlCalidadHTD\\TCCDef.htm");
      cmbCCTTpoCtr.setValue( GXutil.rtrim( A4037CCTTpoCtr) );
      httpContext.ajax_rsp_assign_prop("", false, cmbCCTTpoCtr.getInternalname(), "Values", cmbCCTTpoCtr.ToJavascriptSource(), true);
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkCCTFinFas.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, chkCCTFinFas.getInternalname(), httpContext.getMessage( "Final de la Fase?", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Check box */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 40,'',false,'',0)\"" ;
      ClassString = "AttributeFL" ;
      StyleString = "" ;
      app.GxWebStd.gx_checkbox_ctrl( httpContext, chkCCTFinFas.getInternalname(), A4406CCTFinFas, "", httpContext.getMessage( "Final de la Fase?", ""), 1, chkCCTFinFas.getEnabled(), "S", httpContext.getMessage( "Final de Fase", ""), StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(40, this, 'S', 'N',"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,40);\"");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkCCTIniFas.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, chkCCTIniFas.getInternalname(), httpContext.getMessage( "Inicio de la Fase?", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Check box */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'',0)\"" ;
      ClassString = "AttributeFL" ;
      StyleString = "" ;
      app.GxWebStd.gx_checkbox_ctrl( httpContext, chkCCTIniFas.getInternalname(), A4407CCTIniFas, "", httpContext.getMessage( "Inicio de la Fase?", ""), 1, chkCCTIniFas.getEnabled(), "S", httpContext.getMessage( "Inicio de Fase", ""), StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(44, this, 'S', 'N',"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,44);\"");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkCCTSto.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, chkCCTSto.getInternalname(), httpContext.getMessage( "Paro de Produccion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Check box */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 48,'',false,'',0)\"" ;
      ClassString = "AttributeFL" ;
      StyleString = "" ;
      app.GxWebStd.gx_checkbox_ctrl( httpContext, chkCCTSto.getInternalname(), A4040CCTSto, "", httpContext.getMessage( "Paro de Produccion", ""), 1, chkCCTSto.getEnabled(), "S", httpContext.getMessage( "Paro de Producción", ""), StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(48, this, 'S', 'N',"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,48);\"");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", chkCCTObs.getVisible(), 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkCCTObs.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, chkCCTObs.getInternalname(), httpContext.getMessage( "Observaciones", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Check box */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 52,'',false,'',0)\"" ;
      ClassString = "AttributeFL" ;
      StyleString = "" ;
      app.GxWebStd.gx_checkbox_ctrl( httpContext, chkCCTObs.getInternalname(), A4042CCTObs, "", httpContext.getMessage( "Observaciones", ""), chkCCTObs.getVisible(), chkCCTObs.getEnabled(), "S", httpContext.getMessage( "Observaciones", ""), StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(52, this, 'S', 'N',"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,52);\"");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTablaupload_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavCctarc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtavCctarc_Internalname, httpContext.getMessage( "Archivo de Plantilla", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavCctarc_Internalname, GXutil.rtrim( AV14CCTArc), GXutil.rtrim( localUtil.format( AV14CCTArc, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCctarc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavCctarc_Enabled, 0, "text", "", 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\TCCDef.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* User Defined Control */
      ucUpload.setProperty("AutoUpload", Upload_Autoupload);
      ucUpload.setProperty("HideAdditionalButtons", Upload_Hideadditionalbuttons);
      ucUpload.setProperty("TooltipText", Upload_Tooltiptext);
      ucUpload.setProperty("MaxNumberOfFiles", Upload_Maxnumberoffiles);
      ucUpload.setProperty("AutoDisableAddingFiles", Upload_Autodisableaddingfiles);
      ucUpload.setProperty("UploadedFiles", AV33UploadedFiles);
      ucUpload.setProperty("FailedFiles", AV34FailedFiles);
      ucUpload.render(context, "fileupload", Upload_Internalname, "UPLOADContainer");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 hidden-xs hidden-sm hidden-md", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTablepanelgeneral_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* User Defined Control */
      ucGxuitabspanel_tabs1.setProperty("PageCount", Gxuitabspanel_tabs1_Pagecount);
      ucGxuitabspanel_tabs1.setProperty("Class", Gxuitabspanel_tabs1_Class);
      ucGxuitabspanel_tabs1.setProperty("HistoryManagement", Gxuitabspanel_tabs1_Historymanagement);
      ucGxuitabspanel_tabs1.render(context, "tab", Gxuitabspanel_tabs1_Internalname, "GXUITABSPANEL_TABS1Container");
      httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"GXUITABSPANEL_TABS1Container"+"title1"+"\" style=\"display:none;\">") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTab1_title_Internalname, httpContext.getMessage( "Varaibles", ""), "", "", lblTab1_title_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_ControlCalidadHTD\\TCCDef.htm");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", "", "display:none;", "div");
      httpContext.writeText( "Tab1") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      httpContext.writeText( "</div>") ;
      httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"GXUITABSPANEL_TABS1Container"+"panel1"+"\" style=\"display:none;\">") ;
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTableintermediatelevel_level1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      gxdraw_freestylelevel_level1( ) ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      httpContext.writeText( "</div>") ;
      httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"GXUITABSPANEL_TABS1Container"+"title2"+"\" style=\"display:none;\">") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTab2_title_Internalname, httpContext.getMessage( "Notificaciones", ""), "", "", lblTab2_title_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_ControlCalidadHTD\\TCCDef.htm");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", "", "display:none;", "div");
      httpContext.writeText( "Tab2") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      httpContext.writeText( "</div>") ;
      httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"GXUITABSPANEL_TABS1Container"+"panel2"+"\" style=\"display:none;\">") ;
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTableleaflevel_notificaciones_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 SectionGrid EditableGridCell_LinedAtts", "left", "top", "", "", "div");
      gxdraw_gridlevel_notificaciones( ) ;
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
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      httpContext.writeText( "</div>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblCctarc_txt_Internalname, httpContext.getMessage( "Cctarc_txt", ""), "", "", lblCctarc_txt_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_ControlCalidadHTD\\TCCDef.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 198,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ControlCalidadHTD\\TCCDef.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 200,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ControlCalidadHTD\\TCCDef.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 202,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ControlCalidadHTD\\TCCDef.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV44Pgmname), GXutil.rtrim( localUtil.format( AV44Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\TCCDef.htm");
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
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 210,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,210);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", edtEmprCod_Visible, edtEmprCod_Enabled, 1, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\TCCDef.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "Attribute", "", "", "", "", edtEmprNom_Visible, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\TCCDef.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 212,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCCTObl_Internalname, GXutil.rtrim( A4039CCTObl), GXutil.rtrim( localUtil.format( A4039CCTObl, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,212);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCCTObl_Jsonclick, 0, "Attribute", "", "", "", "", edtCCTObl_Visible, edtCCTObl_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "Booleano", "left", true, "", "HLP_ControlCalidadHTD\\TCCDef.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCCTNotUlt_Internalname, GXutil.ltrim( localUtil.ntoc( A11475CCTNotUlt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCCTNotUlt_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11475CCTNotUlt), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A11475CCTNotUlt), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCCTNotUlt_Jsonclick, 0, "Attribute", "", "", "", "", edtCCTNotUlt_Visible, edtCCTNotUlt_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\TCCDef.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCCTArc_Internalname, GXutil.rtrim( A4041CCTArc), GXutil.rtrim( localUtil.format( A4041CCTArc, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCCTArc_Jsonclick, 0, "Attribute", "", "", "", "", edtCCTArc_Visible, edtCCTArc_Enabled, 0, "text", "", 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\TCCDef.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
   }

   public void gxdraw_freestylelevel_level1( )
   {
      /*  Grid Control  */
      startgridcontrol79( ) ;
      /* Save parent mode. */
      sMode622 = Gx_mode ;
      nGXsfl_79_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount622 = (short)(subFreestylelevel_level1_Rows) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_622 = (short)(1) ;
            scanStartIA622( ) ;
            while ( RcdFound622 != 0 )
            {
               init_level_properties622( ) ;
               getByPrimaryKeyIA622( ) ;
               addRowIA622( ) ;
               scanNextIA622( ) ;
            }
            scanEndIA622( ) ;
            nBlankRcdCount622 = (short)(subFreestylelevel_level1_Rows) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B11475CCTNotUlt = A11475CCTNotUlt ;
         httpContext.ajax_rsp_assign_attri("", false, "A11475CCTNotUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11475CCTNotUlt), 4, 0));
         standaloneNotModalIA622( ) ;
         standaloneModalIA622( ) ;
         sMode622 = Gx_mode ;
         while ( nGXsfl_79_idx < nRC_GXsfl_79 )
         {
            bGXsfl_79_Refreshing = true ;
            readRowIA622( ) ;
            edtCCTLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CCTLIN_"+sGXsfl_79_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCTLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLin_Enabled), 5, 0), !bGXsfl_79_Refreshing);
            edtCCTLin_Visible = (int)(localUtil.ctol( httpContext.cgiGet( "CCTLIN_"+sGXsfl_79_idx+"Visible"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCTLin_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLin_Visible), 5, 0), !bGXsfl_79_Refreshing);
            cmbCCTLinTpoI.setVisible( (int)(localUtil.ctol( httpContext.cgiGet( "CCTLINTPOI_"+sGXsfl_79_idx+"Visible"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
            httpContext.ajax_rsp_assign_prop("", false, cmbCCTLinTpoI.getInternalname(), "Visible", GXutil.ltrimstr( cmbCCTLinTpoI.getVisible(), 5, 0), !bGXsfl_79_Refreshing);
            cmbCCTLinTpoI.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "CCTLINTPOI_"+sGXsfl_79_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
            httpContext.ajax_rsp_assign_prop("", false, cmbCCTLinTpoI.getInternalname(), "Enabled", GXutil.ltrimstr( cmbCCTLinTpoI.getEnabled(), 5, 0), !bGXsfl_79_Refreshing);
            dynCCVCod.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "CCVCOD_"+sGXsfl_79_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
            httpContext.ajax_rsp_assign_prop("", false, dynCCVCod.getInternalname(), "Enabled", GXutil.ltrimstr( dynCCVCod.getEnabled(), 5, 0), !bGXsfl_79_Refreshing);
            cmbCCTLinTpoD.setVisible( (int)(localUtil.ctol( httpContext.cgiGet( "CCTLINTPOD_"+sGXsfl_79_idx+"Visible"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
            httpContext.ajax_rsp_assign_prop("", false, cmbCCTLinTpoD.getInternalname(), "Visible", GXutil.ltrimstr( cmbCCTLinTpoD.getVisible(), 5, 0), !bGXsfl_79_Refreshing);
            cmbCCTLinTpoD.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "CCTLINTPOD_"+sGXsfl_79_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
            httpContext.ajax_rsp_assign_prop("", false, cmbCCTLinTpoD.getInternalname(), "Enabled", GXutil.ltrimstr( cmbCCTLinTpoD.getEnabled(), 5, 0), !bGXsfl_79_Refreshing);
            edtCCTLinDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CCTLINDSC_"+sGXsfl_79_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCTLinDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLinDsc_Enabled), 5, 0), !bGXsfl_79_Refreshing);
            edtCCTLinDsc_Visible = (int)(localUtil.ctol( httpContext.cgiGet( "CCTLINDSC_"+sGXsfl_79_idx+"Visible"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCTLinDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLinDsc_Visible), 5, 0), !bGXsfl_79_Refreshing);
            edtCCTLinVarW_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CCTLINVARW_"+sGXsfl_79_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCTLinVarW_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLinVarW_Enabled), 5, 0), !bGXsfl_79_Refreshing);
            edtCCTLinLgoD_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CCTLINLGOD_"+sGXsfl_79_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCTLinLgoD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLinLgoD_Enabled), 5, 0), !bGXsfl_79_Refreshing);
            edtCCTLinLgoD_Invitemessage = httpContext.cgiGet( "CCTLINLGOD_"+sGXsfl_79_idx+"Invitemessage") ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCTLinLgoD_Internalname, "Invitemessage", edtCCTLinLgoD_Invitemessage, !bGXsfl_79_Refreshing);
            edtCCTLinLgoD_Visible = (int)(localUtil.ctol( httpContext.cgiGet( "CCTLINLGOD_"+sGXsfl_79_idx+"Visible"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCTLinLgoD_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLinLgoD_Visible), 5, 0), !bGXsfl_79_Refreshing);
            edtCCTLinPict_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CCTLINPICT_"+sGXsfl_79_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCTLinPict_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLinPict_Enabled), 5, 0), !bGXsfl_79_Refreshing);
            edtCCTLinPict_Visible = (int)(localUtil.ctol( httpContext.cgiGet( "CCTLINPICT_"+sGXsfl_79_idx+"Visible"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCTLinPict_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLinPict_Visible), 5, 0), !bGXsfl_79_Refreshing);
            edtCCTSta_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CCTSTA_"+sGXsfl_79_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCTSta_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTSta_Enabled), 5, 0), !bGXsfl_79_Refreshing);
            edtCCTSta_Visible = (int)(localUtil.ctol( httpContext.cgiGet( "CCTSTA_"+sGXsfl_79_idx+"Visible"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCTSta_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTSta_Visible), 5, 0), !bGXsfl_79_Refreshing);
            edtCCVNorma_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CCVNORMA_"+sGXsfl_79_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCVNorma_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCVNorma_Enabled), 5, 0), !bGXsfl_79_Refreshing);
            edtCCVEspecif_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CCVESPECIF_"+sGXsfl_79_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCVEspecif_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCVEspecif_Enabled), 5, 0), !bGXsfl_79_Refreshing);
            edtCCTLinDscL_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CCTLINDSCL_"+sGXsfl_79_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCTLinDscL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLinDscL_Enabled), 5, 0), !bGXsfl_79_Refreshing);
            edtCCVPict_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CCVPICT_"+sGXsfl_79_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCVPict_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCVPict_Enabled), 5, 0), !bGXsfl_79_Refreshing);
            edtCCVPict_Visible = (int)(localUtil.ctol( httpContext.cgiGet( "CCVPICT_"+sGXsfl_79_idx+"Visible"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCVPict_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCVPict_Visible), 5, 0), !bGXsfl_79_Refreshing);
            edtCCVTpoDat_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CCVTPODAT_"+sGXsfl_79_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCVTpoDat_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCVTpoDat_Enabled), 5, 0), !bGXsfl_79_Refreshing);
            edtCCVTpoDat_Visible = (int)(localUtil.ctol( httpContext.cgiGet( "CCVTPODAT_"+sGXsfl_79_idx+"Visible"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCVTpoDat_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCVTpoDat_Visible), 5, 0), !bGXsfl_79_Refreshing);
            edtCCVDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CCVDSC_"+sGXsfl_79_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCVDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCVDsc_Enabled), 5, 0), !bGXsfl_79_Refreshing);
            edtCCVDsc_Visible = (int)(localUtil.ctol( httpContext.cgiGet( "CCVDSC_"+sGXsfl_79_idx+"Visible"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCVDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCVDsc_Visible), 5, 0), !bGXsfl_79_Refreshing);
            if ( ( nRcdExists_622 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModalIA622( ) ;
            }
            sendRowIA622( ) ;
            bGXsfl_79_Refreshing = false ;
         }
         Gx_mode = sMode622 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A11475CCTNotUlt = B11475CCTNotUlt ;
         httpContext.ajax_rsp_assign_attri("", false, "A11475CCTNotUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11475CCTNotUlt), 4, 0));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount622 = (short)(subFreestylelevel_level1_Rows) ;
         nRcdExists_622 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStartIA622( ) ;
            while ( RcdFound622 != 0 )
            {
               sGXsfl_79_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_79_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_79622( ) ;
               init_level_properties622( ) ;
               standaloneNotModalIA622( ) ;
               getByPrimaryKeyIA622( ) ;
               standaloneModalIA622( ) ;
               addRowIA622( ) ;
               scanNextIA622( ) ;
            }
            scanEndIA622( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      if ( ! isDsp( ) && ! isDlt( ) )
      {
         sMode622 = Gx_mode ;
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         sGXsfl_79_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_79_idx+1), 4, 0), (short)(4), "0") ;
         subsflControlProps_79622( ) ;
         initAllIA622( ) ;
         init_level_properties622( ) ;
         B11475CCTNotUlt = A11475CCTNotUlt ;
         httpContext.ajax_rsp_assign_attri("", false, "A11475CCTNotUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11475CCTNotUlt), 4, 0));
         nRcdExists_622 = (short)(0) ;
         nIsMod_622 = (short)(0) ;
         nRcdDeleted_622 = (short)(0) ;
         nBlankRcdCount622 = (short)(nBlankRcdUsr622+nBlankRcdCount622) ;
         fRowAdded = 0 ;
         while ( nBlankRcdCount622 > 0 )
         {
            standaloneNotModalIA622( ) ;
            standaloneModalIA622( ) ;
            addRowIA622( ) ;
            if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
            {
               fRowAdded = 1 ;
               GX_FocusControl = edtCCTLin_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            nBlankRcdCount622 = (short)(nBlankRcdCount622-1) ;
         }
         Gx_mode = sMode622 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A11475CCTNotUlt = B11475CCTNotUlt ;
         httpContext.ajax_rsp_assign_attri("", false, "A11475CCTNotUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11475CCTNotUlt), 4, 0));
      }
      /* Restore parent mode. */
      Gx_mode = sMode622 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sStyleString = "" ;
      httpContext.writeText( "<div id=\""+"Freestylelevel_level1Container"+"Div\" "+sStyleString+">"+"</div>") ;
      httpContext.ajax_rsp_assign_grid("_"+"Freestylelevel_level1", Freestylelevel_level1Container, subFreestylelevel_level1_Internalname);
      if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Freestylelevel_level1ContainerData", Freestylelevel_level1Container.ToJavascriptSource());
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Freestylelevel_level1ContainerData"+"V", Freestylelevel_level1Container.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Freestylelevel_level1ContainerData"+"V"+"\" value='"+Freestylelevel_level1Container.GridValuesHidden()+"'/>") ;
      }
   }

   public void gxdraw_gridlevel_notificaciones( )
   {
      /*  Grid Control  */
      startgridcontrol181( ) ;
      nGXsfl_181_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1529 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1529 = (short)(1) ;
            scanStartIA1529( ) ;
            while ( RcdFound1529 != 0 )
            {
               init_level_properties1529( ) ;
               getByPrimaryKeyIA1529( ) ;
               addRowIA1529( ) ;
               scanNextIA1529( ) ;
            }
            scanEndIA1529( ) ;
            nBlankRcdCount1529 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B11475CCTNotUlt = A11475CCTNotUlt ;
         httpContext.ajax_rsp_assign_attri("", false, "A11475CCTNotUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11475CCTNotUlt), 4, 0));
         standaloneNotModalIA1529( ) ;
         standaloneModalIA1529( ) ;
         sMode1529 = Gx_mode ;
         while ( nGXsfl_181_idx < nRC_GXsfl_181 )
         {
            bGXsfl_181_Refreshing = true ;
            readRowIA1529( ) ;
            edtCCTNotId_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CCTNOTID_"+sGXsfl_181_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCTNotId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTNotId_Enabled), 5, 0), !bGXsfl_181_Refreshing);
            cmbCCTNotEvt.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "CCTNOTEVT_"+sGXsfl_181_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
            httpContext.ajax_rsp_assign_prop("", false, cmbCCTNotEvt.getInternalname(), "Enabled", GXutil.ltrimstr( cmbCCTNotEvt.getEnabled(), 5, 0), !bGXsfl_181_Refreshing);
            cmbCCTNotDst.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "CCTNOTDST_"+sGXsfl_181_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
            httpContext.ajax_rsp_assign_prop("", false, cmbCCTNotDst.getInternalname(), "Enabled", GXutil.ltrimstr( cmbCCTNotDst.getEnabled(), 5, 0), !bGXsfl_181_Refreshing);
            dynCCTNotUsr.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "CCTNOTUSR_"+sGXsfl_181_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
            httpContext.ajax_rsp_assign_prop("", false, dynCCTNotUsr.getInternalname(), "Enabled", GXutil.ltrimstr( dynCCTNotUsr.getEnabled(), 5, 0), !bGXsfl_181_Refreshing);
            edtCCTNotEml_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CCTNOTEML_"+sGXsfl_181_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCTNotEml_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTNotEml_Enabled), 5, 0), !bGXsfl_181_Refreshing);
            edtCCTNotAsu_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CCTNOTASU_"+sGXsfl_181_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCTNotAsu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTNotAsu_Enabled), 5, 0), !bGXsfl_181_Refreshing);
            edtCCTNotTxt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CCTNOTTXT_"+sGXsfl_181_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCTNotTxt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTNotTxt_Enabled), 5, 0), !bGXsfl_181_Refreshing);
            cmbCCTNotAdj.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "CCTNOTADJ_"+sGXsfl_181_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
            httpContext.ajax_rsp_assign_prop("", false, cmbCCTNotAdj.getInternalname(), "Enabled", GXutil.ltrimstr( cmbCCTNotAdj.getEnabled(), 5, 0), !bGXsfl_181_Refreshing);
            cmbCCTNotStp.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "CCTNOTSTP_"+sGXsfl_181_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
            httpContext.ajax_rsp_assign_prop("", false, cmbCCTNotStp.getInternalname(), "Enabled", GXutil.ltrimstr( cmbCCTNotStp.getEnabled(), 5, 0), !bGXsfl_181_Refreshing);
            if ( ( nRcdExists_1529 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModalIA1529( ) ;
            }
            sendRowIA1529( ) ;
            bGXsfl_181_Refreshing = false ;
         }
         Gx_mode = sMode1529 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A11475CCTNotUlt = B11475CCTNotUlt ;
         httpContext.ajax_rsp_assign_attri("", false, "A11475CCTNotUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11475CCTNotUlt), 4, 0));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1529 = (short)(5) ;
         nRcdExists_1529 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStartIA1529( ) ;
            while ( RcdFound1529 != 0 )
            {
               sGXsfl_181_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_181_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_1811529( ) ;
               init_level_properties1529( ) ;
               standaloneNotModalIA1529( ) ;
               getByPrimaryKeyIA1529( ) ;
               standaloneModalIA1529( ) ;
               addRowIA1529( ) ;
               scanNextIA1529( ) ;
            }
            scanEndIA1529( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      if ( ! isDsp( ) && ! isDlt( ) )
      {
         sMode1529 = Gx_mode ;
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         sGXsfl_181_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_181_idx+1), 4, 0), (short)(4), "0") ;
         subsflControlProps_1811529( ) ;
         initAllIA1529( ) ;
         init_level_properties1529( ) ;
         B11475CCTNotUlt = A11475CCTNotUlt ;
         httpContext.ajax_rsp_assign_attri("", false, "A11475CCTNotUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11475CCTNotUlt), 4, 0));
         nRcdExists_1529 = (short)(0) ;
         nIsMod_1529 = (short)(0) ;
         nRcdDeleted_1529 = (short)(0) ;
         nBlankRcdCount1529 = (short)(nBlankRcdUsr1529+nBlankRcdCount1529) ;
         fRowAdded = 0 ;
         while ( nBlankRcdCount1529 > 0 )
         {
            standaloneNotModalIA1529( ) ;
            standaloneModalIA1529( ) ;
            addRowIA1529( ) ;
            if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
            {
               fRowAdded = 1 ;
               GX_FocusControl = edtCCTNotId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            nBlankRcdCount1529 = (short)(nBlankRcdCount1529-1) ;
         }
         Gx_mode = sMode1529 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A11475CCTNotUlt = B11475CCTNotUlt ;
         httpContext.ajax_rsp_assign_attri("", false, "A11475CCTNotUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11475CCTNotUlt), 4, 0));
      }
      sStyleString = "" ;
      httpContext.writeText( "<div id=\""+"Gridlevel_notificacionesContainer"+"Div\" "+sStyleString+">"+"</div>") ;
      httpContext.ajax_rsp_assign_grid("_"+"Gridlevel_notificaciones", Gridlevel_notificacionesContainer, subGridlevel_notificaciones_Internalname);
      if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridlevel_notificacionesContainerData", Gridlevel_notificacionesContainer.ToJavascriptSource());
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridlevel_notificacionesContainerData"+"V", Gridlevel_notificacionesContainer.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Gridlevel_notificacionesContainerData"+"V"+"\" value='"+Gridlevel_notificacionesContainer.GridValuesHidden()+"'/>") ;
      }
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
      e11IA2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vUPLOADEDFILES"), AV33UploadedFiles);
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vFAILEDFILES"), AV34FailedFiles);
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z4031CCTCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z4031CCTCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z4041CCTArc = httpContext.cgiGet( "Z4041CCTArc") ;
            Z4036CCTDsc = httpContext.cgiGet( "Z4036CCTDsc") ;
            Z4037CCTTpoCtr = httpContext.cgiGet( "Z4037CCTTpoCtr") ;
            Z4406CCTFinFas = httpContext.cgiGet( "Z4406CCTFinFas") ;
            Z4407CCTIniFas = httpContext.cgiGet( "Z4407CCTIniFas") ;
            Z4039CCTObl = httpContext.cgiGet( "Z4039CCTObl") ;
            Z4040CCTSto = httpContext.cgiGet( "Z4040CCTSto") ;
            Z4042CCTObs = httpContext.cgiGet( "Z4042CCTObs") ;
            Z11475CCTNotUlt = (short)(localUtil.ctol( httpContext.cgiGet( "Z11475CCTNotUlt"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            O11475CCTNotUlt = (short)(localUtil.ctol( httpContext.cgiGet( "O11475CCTNotUlt"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_79 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_79"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            nRC_GXsfl_181 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_181"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            N4042CCTObs = httpContext.cgiGet( "N4042CCTObs") ;
            AV28EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            AV38AuxEmprCod = httpContext.cgiGet( "vAUXEMPRCOD") ;
            AV29CCTCod = (int)(localUtil.ctol( httpContext.cgiGet( "vCCTCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV27TestCC = (byte)(localUtil.ctol( httpContext.cgiGet( "vTESTCC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A11527CCVLgoDat = (short)(localUtil.ctol( httpContext.cgiGet( "CCVLGODAT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n11527CCVLgoDat = false ;
            Upload_Objectcall = httpContext.cgiGet( "UPLOAD_Objectcall") ;
            Upload_Enabled = GXutil.strtobool( httpContext.cgiGet( "UPLOAD_Enabled")) ;
            Upload_Class = httpContext.cgiGet( "UPLOAD_Class") ;
            Upload_Autoupload = GXutil.strtobool( httpContext.cgiGet( "UPLOAD_Autoupload")) ;
            Upload_Hideadditionalbuttons = GXutil.strtobool( httpContext.cgiGet( "UPLOAD_Hideadditionalbuttons")) ;
            Upload_Tooltiptext = httpContext.cgiGet( "UPLOAD_Tooltiptext") ;
            Upload_Enableuploadedfilecanceling = GXutil.strtobool( httpContext.cgiGet( "UPLOAD_Enableuploadedfilecanceling")) ;
            Upload_Disableimageresize = GXutil.strtobool( httpContext.cgiGet( "UPLOAD_Disableimageresize")) ;
            Upload_Maxfilesize = (int)(localUtil.ctol( httpContext.cgiGet( "UPLOAD_Maxfilesize"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Upload_Maxnumberoffiles = (int)(localUtil.ctol( httpContext.cgiGet( "UPLOAD_Maxnumberoffiles"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Upload_Autodisableaddingfiles = GXutil.strtobool( httpContext.cgiGet( "UPLOAD_Autodisableaddingfiles")) ;
            Upload_Acceptedfiletypes = httpContext.cgiGet( "UPLOAD_Acceptedfiletypes") ;
            Upload_Customfiletypes = httpContext.cgiGet( "UPLOAD_Customfiletypes") ;
            Upload_Visible = GXutil.strtobool( httpContext.cgiGet( "UPLOAD_Visible")) ;
            Gxuitabspanel_tabs1_Objectcall = httpContext.cgiGet( "GXUITABSPANEL_TABS1_Objectcall") ;
            Gxuitabspanel_tabs1_Enabled = GXutil.strtobool( httpContext.cgiGet( "GXUITABSPANEL_TABS1_Enabled")) ;
            Gxuitabspanel_tabs1_Activepage = (int)(localUtil.ctol( httpContext.cgiGet( "GXUITABSPANEL_TABS1_Activepage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gxuitabspanel_tabs1_Activepagecontrolname = httpContext.cgiGet( "GXUITABSPANEL_TABS1_Activepagecontrolname") ;
            Gxuitabspanel_tabs1_Pagecount = (int)(localUtil.ctol( httpContext.cgiGet( "GXUITABSPANEL_TABS1_Pagecount"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gxuitabspanel_tabs1_Class = httpContext.cgiGet( "GXUITABSPANEL_TABS1_Class") ;
            Gxuitabspanel_tabs1_Historymanagement = GXutil.strtobool( httpContext.cgiGet( "GXUITABSPANEL_TABS1_Historymanagement")) ;
            Gxuitabspanel_tabs1_Visible = GXutil.strtobool( httpContext.cgiGet( "GXUITABSPANEL_TABS1_Visible")) ;
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
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCCTCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCCTCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CCTCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCCTCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A4031CCTCod = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
            }
            else
            {
               A4031CCTCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCCTCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
            }
            A4036CCTDsc = httpContext.cgiGet( edtCCTDsc_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4036CCTDsc", A4036CCTDsc);
            cmbCCTTpoCtr.setName( cmbCCTTpoCtr.getInternalname() );
            cmbCCTTpoCtr.setValue( httpContext.cgiGet( cmbCCTTpoCtr.getInternalname()) );
            A4037CCTTpoCtr = httpContext.cgiGet( cmbCCTTpoCtr.getInternalname()) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4037CCTTpoCtr", A4037CCTTpoCtr);
            A4406CCTFinFas = ((GXutil.strcmp(httpContext.cgiGet( chkCCTFinFas.getInternalname()), "S")==0) ? "S" : "N") ;
            httpContext.ajax_rsp_assign_attri("", false, "A4406CCTFinFas", A4406CCTFinFas);
            A4407CCTIniFas = ((GXutil.strcmp(httpContext.cgiGet( chkCCTIniFas.getInternalname()), "S")==0) ? "S" : "N") ;
            httpContext.ajax_rsp_assign_attri("", false, "A4407CCTIniFas", A4407CCTIniFas);
            A4040CCTSto = ((GXutil.strcmp(httpContext.cgiGet( chkCCTSto.getInternalname()), "S")==0) ? "S" : "N") ;
            httpContext.ajax_rsp_assign_attri("", false, "A4040CCTSto", A4040CCTSto);
            A4042CCTObs = ((GXutil.strcmp(httpContext.cgiGet( chkCCTObs.getInternalname()), "S")==0) ? "S" : "N") ;
            httpContext.ajax_rsp_assign_attri("", false, "A4042CCTObs", A4042CCTObs);
            AV14CCTArc = GXutil.upper( httpContext.cgiGet( edtavCctarc_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14CCTArc", AV14CCTArc);
            AV44Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV44Pgmname", AV44Pgmname);
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            A4039CCTObl = GXutil.upper( httpContext.cgiGet( edtCCTObl_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4039CCTObl", A4039CCTObl);
            A11475CCTNotUlt = (short)(localUtil.ctol( httpContext.cgiGet( edtCCTNotUlt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11475CCTNotUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11475CCTNotUlt), 4, 0));
            A4041CCTArc = GXutil.upper( httpContext.cgiGet( edtCCTArc_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4041CCTArc", A4041CCTArc);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"TCCDef");
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A4031CCTCod != Z4031CCTCod ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("controlcalidadhtd\\tccdef:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
               GxWebError = (byte)(1) ;
               httpContext.sendError( 403 );
               GXutil.writeLog("send_http_error_code 403");
               AnyError = (short)(1) ;
               return  ;
            }
            /* Check if conditions changed and reset current page numbers */
            /* Check if conditions changed and reset current page numbers */
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
               A4031CCTCod = (int)(GXutil.lval( httpContext.GetPar( "CCTCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
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
                  sMode621 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  Gx_mode = sMode621 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound621 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_IA0( ) ;
                        if ( AnyError == 0 )
                        {
                           GX_FocusControl = bttBtntrn_enter_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noinsert"), 1, "EMPRCOD");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtEmprCod_Internalname ;
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
                     if ( GXutil.strcmp(sEvt, "UPLOAD.UPLOADCOMPLETE") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        e12IA2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "START") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: Start */
                        e11IA2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e13IA2 ();
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
                     sEvtType = GXutil.right( sEvt, 4) ;
                     sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-4) ;
                     if ( GXutil.strcmp(GXutil.left( sEvt, 18), "CCTLINPICT.ISVALID") == 0 )
                     {
                        nGXsfl_79_idx = (int)(GXutil.lval( sEvtType)) ;
                        sGXsfl_79_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_79_idx), 4, 0), (short)(4), "0") ;
                        subsflControlProps_79622( ) ;
                        if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCCTLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCCTLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
                        {
                           GXCCtl = "CCTLIN_" + sGXsfl_79_idx ;
                           httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
                           AnyError = (short)(1) ;
                           GX_FocusControl = edtCCTLin_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                           wbErr = true ;
                           A4034CCTLin = (short)(0) ;
                        }
                        else
                        {
                           A4034CCTLin = (short)(localUtil.ctol( httpContext.cgiGet( edtCCTLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                        }
                        cmbCCTLinTpoI.setName( cmbCCTLinTpoI.getInternalname() );
                        cmbCCTLinTpoI.setValue( httpContext.cgiGet( cmbCCTLinTpoI.getInternalname()) );
                        A4048CCTLinTpoI = httpContext.cgiGet( cmbCCTLinTpoI.getInternalname()) ;
                        dynCCVCod.setName( dynCCVCod.getInternalname() );
                        dynCCVCod.setValue( httpContext.cgiGet( dynCCVCod.getInternalname()) );
                        A11522CCVCod = httpContext.cgiGet( dynCCVCod.getInternalname()) ;
                        cmbCCTLinTpoD.setName( cmbCCTLinTpoD.getInternalname() );
                        cmbCCTLinTpoD.setValue( httpContext.cgiGet( cmbCCTLinTpoD.getInternalname()) );
                        A4044CCTLinTpoD = httpContext.cgiGet( cmbCCTLinTpoD.getInternalname()) ;
                        A4043CCTLinDsc = httpContext.cgiGet( edtCCTLinDsc_Internalname) ;
                        A4047CCTLinVarW = GXutil.upper( httpContext.cgiGet( edtCCTLinVarW_Internalname)) ;
                        if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCCTLinLgoD_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCCTLinLgoD_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
                        {
                           GXCCtl = "CCTLINLGOD_" + sGXsfl_79_idx ;
                           httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
                           AnyError = (short)(1) ;
                           GX_FocusControl = edtCCTLinLgoD_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                           wbErr = true ;
                           A4045CCTLinLgoD = (short)(0) ;
                        }
                        else
                        {
                           A4045CCTLinLgoD = (short)(localUtil.ctol( httpContext.cgiGet( edtCCTLinLgoD_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                        }
                        A4046CCTLinPict = httpContext.cgiGet( edtCCTLinPict_Internalname) ;
                        A4408CCTSta = httpContext.cgiGet( edtCCTSta_Internalname) ;
                        A13249CCVNorma = httpContext.cgiGet( edtCCVNorma_Internalname) ;
                        A13250CCVEspecif = httpContext.cgiGet( edtCCVEspecif_Internalname) ;
                        A11476CCTLinDscL = httpContext.cgiGet( edtCCTLinDscL_Internalname) ;
                        A11526CCVPict = httpContext.cgiGet( edtCCVPict_Internalname) ;
                        n11526CCVPict = false ;
                        A11528CCVTpoDat = httpContext.cgiGet( edtCCVTpoDat_Internalname) ;
                        n11528CCVTpoDat = false ;
                        A11529CCVDsc = httpContext.cgiGet( edtCCVDsc_Internalname) ;
                        n11529CCVDsc = false ;
                        GXCCtl = "Z4034CCTLin_" + sGXsfl_79_idx ;
                        Z4034CCTLin = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                        GXCCtl = "Z4045CCTLinLgoD_" + sGXsfl_79_idx ;
                        Z4045CCTLinLgoD = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                        GXCCtl = "Z4046CCTLinPict_" + sGXsfl_79_idx ;
                        Z4046CCTLinPict = httpContext.cgiGet( GXCCtl) ;
                        GXCCtl = "Z4048CCTLinTpoI_" + sGXsfl_79_idx ;
                        Z4048CCTLinTpoI = httpContext.cgiGet( GXCCtl) ;
                        GXCCtl = "Z4044CCTLinTpoD_" + sGXsfl_79_idx ;
                        Z4044CCTLinTpoD = httpContext.cgiGet( GXCCtl) ;
                        GXCCtl = "Z4043CCTLinDsc_" + sGXsfl_79_idx ;
                        Z4043CCTLinDsc = httpContext.cgiGet( GXCCtl) ;
                        GXCCtl = "Z4047CCTLinVarW_" + sGXsfl_79_idx ;
                        Z4047CCTLinVarW = httpContext.cgiGet( GXCCtl) ;
                        GXCCtl = "Z4408CCTSta_" + sGXsfl_79_idx ;
                        Z4408CCTSta = httpContext.cgiGet( GXCCtl) ;
                        GXCCtl = "Z13249CCVNorma_" + sGXsfl_79_idx ;
                        Z13249CCVNorma = httpContext.cgiGet( GXCCtl) ;
                        GXCCtl = "Z13250CCVEspecif_" + sGXsfl_79_idx ;
                        Z13250CCVEspecif = httpContext.cgiGet( GXCCtl) ;
                        GXCCtl = "Z11476CCTLinDscL_" + sGXsfl_79_idx ;
                        Z11476CCTLinDscL = httpContext.cgiGet( GXCCtl) ;
                        GXCCtl = "Z11522CCVCod_" + sGXsfl_79_idx ;
                        Z11522CCVCod = httpContext.cgiGet( GXCCtl) ;
                        GXCCtl = "nRC_GXsfl_154_" + sGXsfl_79_idx ;
                        nRC_GXsfl_154 = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                        GXCCtl = "nRcdDeleted_622_" + sGXsfl_79_idx ;
                        nRcdDeleted_622 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                        GXCCtl = "nRcdExists_622_" + sGXsfl_79_idx ;
                        nRcdExists_622 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                        GXCCtl = "nIsMod_622_" + sGXsfl_79_idx ;
                        nIsMod_622 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                        GXCCtl = "N4034CCTLin_" + sGXsfl_79_idx ;
                        N4034CCTLin = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                        GXCCtl = "N11522CCVCod_" + sGXsfl_79_idx ;
                        N11522CCVCod = httpContext.cgiGet( GXCCtl) ;
                        GXCCtl = "N4044CCTLinTpoD_" + sGXsfl_79_idx ;
                        N4044CCTLinTpoD = httpContext.cgiGet( GXCCtl) ;
                        GXCCtl = "N4043CCTLinDsc_" + sGXsfl_79_idx ;
                        N4043CCTLinDsc = httpContext.cgiGet( GXCCtl) ;
                        GXCCtl = "N4045CCTLinLgoD_" + sGXsfl_79_idx ;
                        N4045CCTLinLgoD = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                        GXCCtl = "N4046CCTLinPict_" + sGXsfl_79_idx ;
                        N4046CCTLinPict = httpContext.cgiGet( GXCCtl) ;
                        GXCCtl = "N4408CCTSta_" + sGXsfl_79_idx ;
                        N4408CCTSta = httpContext.cgiGet( GXCCtl) ;
                        sEvtType = GXutil.right( sEvt, 1) ;
                        if ( GXutil.strcmp(sEvtType, ".") == 0 )
                        {
                           sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                           if ( GXutil.strcmp(sEvt, "CCTLINPICT.ISVALID") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              e14IA2 ();
                           }
                        }
                        else
                        {
                           sEvtType = GXutil.right( sEvt, 4) ;
                           sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-4) ;
                        }
                     }
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
         e13IA2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAllIA621( ) ;
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
         disableAttributesIA621( ) ;
      }
      httpContext.ajax_rsp_assign_prop("", false, edtavCctarc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCctarc_Enabled), 5, 0), true);
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

   public void confirm_IA0( )
   {
      beforeValidateIA621( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControlsIA621( ) ;
         }
         else
         {
            checkExtendedTableIA621( ) ;
            closeExtendedTableCursorsIA621( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode621 = Gx_mode ;
         confirm_IA622( ) ;
         if ( AnyError == 0 )
         {
            confirm_IA1529( ) ;
            if ( AnyError == 0 )
            {
               /* Restore parent mode. */
               Gx_mode = sMode621 ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               IsConfirmed = (short)(1) ;
               httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
            }
         }
         /* Restore parent mode. */
         Gx_mode = sMode621 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
   }

   public void confirm_IA1529( )
   {
      s11475CCTNotUlt = O11475CCTNotUlt ;
      httpContext.ajax_rsp_assign_attri("", false, "A11475CCTNotUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11475CCTNotUlt), 4, 0));
      nGXsfl_181_idx = 0 ;
      while ( nGXsfl_181_idx < nRC_GXsfl_181 )
      {
         readRowIA1529( ) ;
         if ( ( nRcdExists_1529 != 0 ) || ( nIsMod_1529 != 0 ) )
         {
            getKeyIA1529( ) ;
            if ( ( nRcdExists_1529 == 0 ) && ( nRcdDeleted_1529 == 0 ) )
            {
               if ( RcdFound1529 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidateIA1529( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTableIA1529( ) ;
                     closeExtendedTableCursorsIA1529( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O11475CCTNotUlt = A11475CCTNotUlt ;
                     httpContext.ajax_rsp_assign_attri("", false, "A11475CCTNotUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11475CCTNotUlt), 4, 0));
                  }
               }
               else
               {
                  GXCCtl = "CCTNOTID_" + sGXsfl_181_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtCCTNotId_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1529 != 0 )
               {
                  if ( nRcdDeleted_1529 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKeyIA1529( ) ;
                     loadIA1529( ) ;
                     beforeValidateIA1529( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControlsIA1529( ) ;
                        O11475CCTNotUlt = A11475CCTNotUlt ;
                        httpContext.ajax_rsp_assign_attri("", false, "A11475CCTNotUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11475CCTNotUlt), 4, 0));
                     }
                  }
                  else
                  {
                     if ( nIsMod_1529 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidateIA1529( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTableIA1529( ) ;
                           closeExtendedTableCursorsIA1529( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O11475CCTNotUlt = A11475CCTNotUlt ;
                           httpContext.ajax_rsp_assign_attri("", false, "A11475CCTNotUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11475CCTNotUlt), 4, 0));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1529 == 0 )
                  {
                     GXCCtl = "CCTNOTID_" + sGXsfl_181_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtCCTNotId_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtCCTNotId_Internalname, GXutil.ltrim( localUtil.ntoc( A11481CCTNotId, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( cmbCCTNotEvt.getInternalname(), GXutil.rtrim( A11477CCTNotEvt)) ;
         httpContext.changePostValue( cmbCCTNotDst.getInternalname(), GXutil.rtrim( A11478CCTNotDst)) ;
         httpContext.changePostValue( dynCCTNotUsr.getInternalname(), GXutil.rtrim( A11479CCTNotUsr)) ;
         httpContext.changePostValue( edtCCTNotEml_Internalname, GXutil.rtrim( A11480CCTNotEml)) ;
         httpContext.changePostValue( edtCCTNotAsu_Internalname, A11523CCTNotAsu) ;
         httpContext.changePostValue( edtCCTNotTxt_Internalname, A11524CCTNotTxt) ;
         httpContext.changePostValue( cmbCCTNotAdj.getInternalname(), GXutil.ltrim( localUtil.ntoc( A11525CCTNotAdj, (byte)(1), (byte)(0), ".", ""))) ;
         httpContext.changePostValue( cmbCCTNotStp.getInternalname(), GXutil.ltrim( localUtil.ntoc( A12733CCTNotStp, (byte)(1), (byte)(0), ".", ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11481CCTNotId_"+sGXsfl_181_idx, GXutil.ltrim( localUtil.ntoc( Z11481CCTNotId, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12733CCTNotStp_"+sGXsfl_181_idx, GXutil.ltrim( localUtil.ntoc( Z12733CCTNotStp, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11477CCTNotEvt_"+sGXsfl_181_idx, GXutil.rtrim( Z11477CCTNotEvt)) ;
         httpContext.changePostValue( "ZT_"+"Z11478CCTNotDst_"+sGXsfl_181_idx, GXutil.rtrim( Z11478CCTNotDst)) ;
         httpContext.changePostValue( "ZT_"+"Z11479CCTNotUsr_"+sGXsfl_181_idx, GXutil.rtrim( Z11479CCTNotUsr)) ;
         httpContext.changePostValue( "ZT_"+"Z11480CCTNotEml_"+sGXsfl_181_idx, GXutil.rtrim( Z11480CCTNotEml)) ;
         httpContext.changePostValue( "ZT_"+"Z11523CCTNotAsu_"+sGXsfl_181_idx, Z11523CCTNotAsu) ;
         httpContext.changePostValue( "ZT_"+"Z11524CCTNotTxt_"+sGXsfl_181_idx, Z11524CCTNotTxt) ;
         httpContext.changePostValue( "ZT_"+"Z11525CCTNotAdj_"+sGXsfl_181_idx, GXutil.ltrim( localUtil.ntoc( Z11525CCTNotAdj, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1529_"+sGXsfl_181_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1529, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1529_"+sGXsfl_181_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1529, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1529_"+sGXsfl_181_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1529, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "N11479CCTNotUsr_"+sGXsfl_181_idx, GXutil.rtrim( A11479CCTNotUsr)) ;
         httpContext.changePostValue( "N11480CCTNotEml_"+sGXsfl_181_idx, GXutil.rtrim( A11480CCTNotEml)) ;
         if ( nIsMod_1529 != 0 )
         {
            httpContext.changePostValue( "CCTNOTID_"+sGXsfl_181_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCTNotId_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CCTNOTEVT_"+sGXsfl_181_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbCCTNotEvt.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CCTNOTDST_"+sGXsfl_181_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbCCTNotDst.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CCTNOTUSR_"+sGXsfl_181_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( dynCCTNotUsr.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CCTNOTEML_"+sGXsfl_181_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCTNotEml_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CCTNOTASU_"+sGXsfl_181_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCTNotAsu_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CCTNOTTXT_"+sGXsfl_181_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCTNotTxt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CCTNOTADJ_"+sGXsfl_181_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbCCTNotAdj.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CCTNOTSTP_"+sGXsfl_181_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbCCTNotStp.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O11475CCTNotUlt = s11475CCTNotUlt ;
      httpContext.ajax_rsp_assign_attri("", false, "A11475CCTNotUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11475CCTNotUlt), 4, 0));
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void confirm_IA623( )
   {
      nGXsfl_154_idx = 0 ;
      while ( nGXsfl_154_idx < nRC_GXsfl_154 )
      {
         readRowIA623( ) ;
         if ( ( nRcdExists_623 != 0 ) || ( nIsMod_623 != 0 ) )
         {
            getKeyIA623( ) ;
            if ( ( nRcdExists_623 == 0 ) && ( nRcdDeleted_623 == 0 ) )
            {
               if ( RcdFound623 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidateIA623( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTableIA623( ) ;
                     closeExtendedTableCursorsIA623( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "CCTLIN_" + sGXsfl_79_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtCCTLin_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound623 != 0 )
               {
                  if ( nRcdDeleted_623 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKeyIA623( ) ;
                     loadIA623( ) ;
                     beforeValidateIA623( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControlsIA623( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_623 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidateIA623( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTableIA623( ) ;
                           closeExtendedTableCursorsIA623( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_623 == 0 )
                  {
                     GXCCtl = "CCTLIN_" + sGXsfl_79_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtCCTLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtCCTValLin_Internalname, GXutil.ltrim( localUtil.ntoc( A4049CCTValLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCCTValDsc_Internalname, GXutil.rtrim( A4050CCTValDsc)) ;
         httpContext.changePostValue( edtCCTVal_Internalname, GXutil.rtrim( A4051CCTVal)) ;
         httpContext.changePostValue( "ZT_"+"Z4049CCTValLin_"+sGXsfl_154_idx, GXutil.ltrim( localUtil.ntoc( Z4049CCTValLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4050CCTValDsc_"+sGXsfl_154_idx, GXutil.rtrim( Z4050CCTValDsc)) ;
         httpContext.changePostValue( "ZT_"+"Z4051CCTVal_"+sGXsfl_154_idx, GXutil.rtrim( Z4051CCTVal)) ;
         httpContext.changePostValue( "nRcdDeleted_623_"+sGXsfl_154_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_623, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_623_"+sGXsfl_154_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_623, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_623_"+sGXsfl_154_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_623, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "N4049CCTValLin_"+sGXsfl_154_idx, GXutil.ltrim( localUtil.ntoc( A4049CCTValLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "N4050CCTValDsc_"+sGXsfl_154_idx, GXutil.rtrim( A4050CCTValDsc)) ;
         httpContext.changePostValue( "N4051CCTVal_"+sGXsfl_154_idx, GXutil.rtrim( A4051CCTVal)) ;
         if ( nIsMod_623 != 0 )
         {
            httpContext.changePostValue( "CCTVALLIN_"+sGXsfl_154_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCTValLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CCTVALDSC_"+sGXsfl_154_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCTValDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CCTVAL_"+sGXsfl_154_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCTVal_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void confirm_IA622( )
   {
      nGXsfl_79_idx = 0 ;
      while ( nGXsfl_79_idx < nRC_GXsfl_79 )
      {
         readRowIA622( ) ;
         if ( ( nRcdExists_622 != 0 ) || ( nIsMod_622 != 0 ) )
         {
            getKeyIA622( ) ;
            if ( ( nRcdExists_622 == 0 ) && ( nRcdDeleted_622 == 0 ) )
            {
               if ( RcdFound622 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidateIA622( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTableIA622( ) ;
                     closeExtendedTableCursorsIA622( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Save parent mode. */
                        sMode622 = Gx_mode ;
                        confirm_IA623( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Restore parent mode. */
                           Gx_mode = sMode622 ;
                           httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                           IsConfirmed = (short)(1) ;
                           httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                        }
                        /* Restore parent mode. */
                        Gx_mode = sMode622 ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     }
                  }
               }
               else
               {
                  GXCCtl = "CCTLIN_" + sGXsfl_79_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtCCTLin_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound622 != 0 )
               {
                  if ( nRcdDeleted_622 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKeyIA622( ) ;
                     loadIA622( ) ;
                     beforeValidateIA622( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControlsIA622( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_622 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidateIA622( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTableIA622( ) ;
                           closeExtendedTableCursorsIA622( ) ;
                           if ( AnyError == 0 )
                           {
                              /* Save parent mode. */
                              sMode622 = Gx_mode ;
                              confirm_IA623( ) ;
                              if ( AnyError == 0 )
                              {
                                 /* Restore parent mode. */
                                 Gx_mode = sMode622 ;
                                 httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                                 IsConfirmed = (short)(1) ;
                                 httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                              }
                              /* Restore parent mode. */
                              Gx_mode = sMode622 ;
                              httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                           }
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_622 == 0 )
                  {
                     GXCCtl = "CCTLIN_" + sGXsfl_79_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtCCTLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtCCTLin_Internalname, GXutil.ltrim( localUtil.ntoc( A4034CCTLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( cmbCCTLinTpoI.getInternalname(), GXutil.rtrim( A4048CCTLinTpoI)) ;
         httpContext.changePostValue( dynCCVCod.getInternalname(), GXutil.rtrim( A11522CCVCod)) ;
         httpContext.changePostValue( cmbCCTLinTpoD.getInternalname(), GXutil.rtrim( A4044CCTLinTpoD)) ;
         httpContext.changePostValue( edtCCTLinDsc_Internalname, GXutil.rtrim( A4043CCTLinDsc)) ;
         httpContext.changePostValue( edtCCTLinVarW_Internalname, GXutil.rtrim( A4047CCTLinVarW)) ;
         httpContext.changePostValue( edtCCTLinLgoD_Internalname, GXutil.ltrim( localUtil.ntoc( A4045CCTLinLgoD, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCCTLinPict_Internalname, GXutil.rtrim( A4046CCTLinPict)) ;
         httpContext.changePostValue( edtCCTSta_Internalname, GXutil.rtrim( A4408CCTSta)) ;
         httpContext.changePostValue( edtCCVNorma_Internalname, GXutil.rtrim( A13249CCVNorma)) ;
         httpContext.changePostValue( edtCCVEspecif_Internalname, GXutil.rtrim( A13250CCVEspecif)) ;
         httpContext.changePostValue( edtCCTLinDscL_Internalname, A11476CCTLinDscL) ;
         httpContext.changePostValue( edtCCVPict_Internalname, GXutil.rtrim( A11526CCVPict)) ;
         httpContext.changePostValue( edtCCVTpoDat_Internalname, GXutil.rtrim( A11528CCVTpoDat)) ;
         httpContext.changePostValue( edtCCVDsc_Internalname, GXutil.rtrim( A11529CCVDsc)) ;
         httpContext.changePostValue( "ZT_"+"Z4034CCTLin_"+sGXsfl_79_idx, GXutil.ltrim( localUtil.ntoc( Z4034CCTLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4045CCTLinLgoD_"+sGXsfl_79_idx, GXutil.ltrim( localUtil.ntoc( Z4045CCTLinLgoD, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4046CCTLinPict_"+sGXsfl_79_idx, GXutil.rtrim( Z4046CCTLinPict)) ;
         httpContext.changePostValue( "ZT_"+"Z4048CCTLinTpoI_"+sGXsfl_79_idx, GXutil.rtrim( Z4048CCTLinTpoI)) ;
         httpContext.changePostValue( "ZT_"+"Z4044CCTLinTpoD_"+sGXsfl_79_idx, GXutil.rtrim( Z4044CCTLinTpoD)) ;
         httpContext.changePostValue( "ZT_"+"Z4043CCTLinDsc_"+sGXsfl_79_idx, GXutil.rtrim( Z4043CCTLinDsc)) ;
         httpContext.changePostValue( "ZT_"+"Z4047CCTLinVarW_"+sGXsfl_79_idx, GXutil.rtrim( Z4047CCTLinVarW)) ;
         httpContext.changePostValue( "ZT_"+"Z4408CCTSta_"+sGXsfl_79_idx, GXutil.rtrim( Z4408CCTSta)) ;
         httpContext.changePostValue( "ZT_"+"Z13249CCVNorma_"+sGXsfl_79_idx, GXutil.rtrim( Z13249CCVNorma)) ;
         httpContext.changePostValue( "ZT_"+"Z13250CCVEspecif_"+sGXsfl_79_idx, GXutil.rtrim( Z13250CCVEspecif)) ;
         httpContext.changePostValue( "ZT_"+"Z11476CCTLinDscL_"+sGXsfl_79_idx, Z11476CCTLinDscL) ;
         httpContext.changePostValue( "ZT_"+"Z11522CCVCod_"+sGXsfl_79_idx, GXutil.rtrim( Z11522CCVCod)) ;
         httpContext.changePostValue( "nRC_GXsfl_154_"+sGXsfl_79_idx, GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_154, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_622_"+sGXsfl_79_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_622, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_622_"+sGXsfl_79_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_622, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_622_"+sGXsfl_79_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_622, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "N4034CCTLin_"+sGXsfl_79_idx, GXutil.ltrim( localUtil.ntoc( A4034CCTLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "N11522CCVCod_"+sGXsfl_79_idx, GXutil.rtrim( A11522CCVCod)) ;
         httpContext.changePostValue( "N4044CCTLinTpoD_"+sGXsfl_79_idx, GXutil.rtrim( A4044CCTLinTpoD)) ;
         httpContext.changePostValue( "N4043CCTLinDsc_"+sGXsfl_79_idx, GXutil.rtrim( A4043CCTLinDsc)) ;
         httpContext.changePostValue( "N4045CCTLinLgoD_"+sGXsfl_79_idx, GXutil.ltrim( localUtil.ntoc( A4045CCTLinLgoD, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "N4046CCTLinPict_"+sGXsfl_79_idx, GXutil.rtrim( A4046CCTLinPict)) ;
         httpContext.changePostValue( "N4408CCTSta_"+sGXsfl_79_idx, GXutil.rtrim( A4408CCTSta)) ;
         if ( nIsMod_622 != 0 )
         {
            httpContext.changePostValue( "CCTLIN_"+sGXsfl_79_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCTLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CCTLIN_"+sGXsfl_79_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtCCTLin_Visible, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CCTLINTPOI_"+sGXsfl_79_idx+"Visible", GXutil.ltrim( localUtil.ntoc( cmbCCTLinTpoI.getVisible(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CCTLINTPOI_"+sGXsfl_79_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbCCTLinTpoI.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CCVCOD_"+sGXsfl_79_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( dynCCVCod.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CCTLINTPOD_"+sGXsfl_79_idx+"Visible", GXutil.ltrim( localUtil.ntoc( cmbCCTLinTpoD.getVisible(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CCTLINTPOD_"+sGXsfl_79_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbCCTLinTpoD.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CCTLINDSC_"+sGXsfl_79_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCTLinDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CCTLINDSC_"+sGXsfl_79_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtCCTLinDsc_Visible, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CCTLINVARW_"+sGXsfl_79_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCTLinVarW_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CCTLINLGOD_"+sGXsfl_79_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCTLinLgoD_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CCTLINLGOD_"+sGXsfl_79_idx+"Invitemessage", GXutil.rtrim( edtCCTLinLgoD_Invitemessage)) ;
            httpContext.changePostValue( "CCTLINLGOD_"+sGXsfl_79_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtCCTLinLgoD_Visible, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CCTLINPICT_"+sGXsfl_79_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCTLinPict_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CCTLINPICT_"+sGXsfl_79_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtCCTLinPict_Visible, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CCTSTA_"+sGXsfl_79_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCTSta_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CCTSTA_"+sGXsfl_79_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtCCTSta_Visible, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CCVNORMA_"+sGXsfl_79_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCVNorma_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CCVESPECIF_"+sGXsfl_79_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCVEspecif_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CCTLINDSCL_"+sGXsfl_79_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCTLinDscL_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CCVPICT_"+sGXsfl_79_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCVPict_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CCVPICT_"+sGXsfl_79_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtCCVPict_Visible, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CCVTPODAT_"+sGXsfl_79_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCVTpoDat_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CCVTPODAT_"+sGXsfl_79_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtCCVTpoDat_Visible, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CCVDSC_"+sGXsfl_79_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCVDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CCVDSC_"+sGXsfl_79_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtCCVDsc_Visible, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaptionIA0( )
   {
   }

   public void e11IA2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV12Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      tccdef_impl.this.GXt_char1 = GXv_char2[0] ;
      AV12Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = AV28EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      tccdef_impl.this.AV28EmprCod = GXv_char2[0] ;
      tccdef_impl.this.AV11EmprNom = GXv_char3[0] ;
      tccdef_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28EmprCod", AV28EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV28EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
      GXv_SdtWWPContext5[0] = AV30WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext5) ;
      AV30WWPContext = GXv_SdtWWPContext5[0] ;
      AV31TrnContext.fromxml(AV32WebSession.getValue("TrnContext"), null, null);
      edtEmprCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Visible), 5, 0), true);
      edtEmprNom_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Visible), 5, 0), true);
      edtCCTObl_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCTObl_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTObl_Visible), 5, 0), true);
      edtCCTNotUlt_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCTNotUlt_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTNotUlt_Visible), 5, 0), true);
      edtCCTArc_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCTArc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTArc_Visible), 5, 0), true);
      edtCCVPict_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCVPict_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCVPict_Visible), 5, 0), !bGXsfl_79_Refreshing);
      edtCCVTpoDat_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCVTpoDat_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCVTpoDat_Visible), 5, 0), !bGXsfl_79_Refreshing);
      edtCCVDsc_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCVDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCVDsc_Visible), 5, 0), !bGXsfl_79_Refreshing);
      subFreestylelevel_level1_Rows = 1 ;
      GXt_char1 = AV12Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      tccdef_impl.this.GXt_char1 = GXv_char4[0] ;
      AV12Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char4[0] = AV38AuxEmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char2[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char4, GXv_char3, GXv_char2) ;
      tccdef_impl.this.AV38AuxEmprCod = GXv_char4[0] ;
      tccdef_impl.this.AV11EmprNom = GXv_char3[0] ;
      tccdef_impl.this.AV8UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38AuxEmprCod", AV38AuxEmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
      GXt_char1 = AV7Lit0 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char4) ;
      tccdef_impl.this.GXt_char1 = GXv_char4[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$NOMBRE1", ""), (byte)(99), GXv_char4) ;
      tccdef_impl.this.GXt_char1 = GXv_char4[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char4) ;
      tccdef_impl.this.GXt_char1 = GXv_char4[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV15CCLPicInf = httpContext.getMessage( "Se debe ingresar un balor para MASCARA", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15CCLPicInf", AV15CCLPicInf);
      GXt_char1 = AV16CCLPicSup ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "CCDPICSUP", ""), (byte)(99), GXv_char4) ;
      tccdef_impl.this.GXt_char1 = GXv_char4[0] ;
      AV16CCLPicSup = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16CCLPicSup", AV16CCLPicSup);
      AV18CCLArrInf = httpContext.getMessage( "Se debe ingresar un balor para MASCARA", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18CCLArrInf", AV18CCLArrInf);
      GXt_char1 = AV17CCLArrSup ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "CCDPICSUP", ""), (byte)(99), GXv_char4) ;
      tccdef_impl.this.GXt_char1 = GXv_char4[0] ;
      AV17CCLArrSup = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17CCLArrSup", AV17CCLArrSup);
      new app.controlcalidadhtd.pccvarnew(remoteHandle, context).execute( ) ;
      dynCCTNotUsr.addItem("", httpContext.getMessage( "Seleccionar", ""), (short)(0));
      GXt_int6 = AV27TestCC ;
      GXv_int7[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( AV38AuxEmprCod, httpContext.getMessage( "TSTCCH", ""), GXv_int7) ;
      tccdef_impl.this.GXt_int6 = GXv_int7[0] ;
      AV27TestCC = GXt_int6 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27TestCC", GXutil.str( AV27TestCC, 1, 0));
   }

   public void e13IA2( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV31TrnContext.getgxTv_SdtWWPTransactionContext_Callerondelete() )
      {
         callWebObject(formatLink("app.controlcalidadhtd.tccdefww", new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      pr_default.close(9);
      pr_default.close(8);
      pr_default.close(6);
      pr_default.close(5);
      pr_default.close(3);
      pr_default.close(1);
      returnInSub = true;
      if (true) return;
   }

   public void e14IA2( )
   {
      /* CCTLinPict_Isvalid Routine */
      returnInSub = false ;
      GXt_char1 = AV13Mask ;
      GXv_char4[0] = A4046CCTLinPict ;
      GXv_int8[0] = A4045CCTLinLgoD ;
      GXv_char3[0] = GXt_char1 ;
      new app.controlcalidadhtd.pccmask(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_char3) ;
      tccdef_impl.this.A4046CCTLinPict = GXv_char4[0] ;
      tccdef_impl.this.A4045CCTLinLgoD = (short)((short)(GXv_int8[0])) ;
      tccdef_impl.this.GXt_char1 = GXv_char3[0] ;
      httpContext.ajax_rsp_assign_attri("", false, edtCCTLinPict_Internalname, A4046CCTLinPict);
      httpContext.ajax_rsp_assign_attri("", false, edtCCTLinLgoD_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(A4045CCTLinLgoD), 3, 0));
      AV13Mask = GXt_char1 ;
      edtCCTLinLgoD_Invitemessage = AV13Mask ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCTLinLgoD_Internalname, "Invitemessage", edtCCTLinLgoD_Invitemessage, !bGXsfl_79_Refreshing);
      /*  Sending Event outputs  */
   }

   public void e12IA2( )
   {
      /* Upload_Uploadcomplete Routine */
      returnInSub = false ;
      AV45GXV1 = 1 ;
      while ( AV45GXV1 <= AV33UploadedFiles.size() )
      {
         AV40FileUploadfile = (app.SdtFileUploadData)((app.SdtFileUploadData)AV33UploadedFiles.elementAt(-1+AV45GXV1));
         AV42Archivo = AV40FileUploadfile.getgxTv_SdtFileUploadData_File() ;
         AV46Archivo_GXI = com.genexus.GXDbFile.getUriFromFile( "", "", AV40FileUploadfile.getgxTv_SdtFileUploadData_File()) ;
         AV45GXV1 = (int)(AV45GXV1+1) ;
      }
      AV14CCTArc = AV46Archivo_GXI ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14CCTArc", AV14CCTArc);
      /*  Sending Event outputs  */
   }

   public void zmIA621( int GX_JID )
   {
      if ( ( GX_JID == 80 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z4041CCTArc = T00IA10_A4041CCTArc[0] ;
            Z4036CCTDsc = T00IA10_A4036CCTDsc[0] ;
            Z4037CCTTpoCtr = T00IA10_A4037CCTTpoCtr[0] ;
            Z4406CCTFinFas = T00IA10_A4406CCTFinFas[0] ;
            Z4407CCTIniFas = T00IA10_A4407CCTIniFas[0] ;
            Z4039CCTObl = T00IA10_A4039CCTObl[0] ;
            Z4040CCTSto = T00IA10_A4040CCTSto[0] ;
            Z4042CCTObs = T00IA10_A4042CCTObs[0] ;
            Z11475CCTNotUlt = T00IA10_A11475CCTNotUlt[0] ;
         }
         else
         {
            Z4041CCTArc = A4041CCTArc ;
            Z4036CCTDsc = A4036CCTDsc ;
            Z4037CCTTpoCtr = A4037CCTTpoCtr ;
            Z4406CCTFinFas = A4406CCTFinFas ;
            Z4407CCTIniFas = A4407CCTIniFas ;
            Z4039CCTObl = A4039CCTObl ;
            Z4040CCTSto = A4040CCTSto ;
            Z4042CCTObs = A4042CCTObs ;
            Z11475CCTNotUlt = A11475CCTNotUlt ;
         }
      }
      if ( GX_JID == -80 )
      {
         Z4031CCTCod = A4031CCTCod ;
         Z4041CCTArc = A4041CCTArc ;
         Z4036CCTDsc = A4036CCTDsc ;
         Z4037CCTTpoCtr = A4037CCTTpoCtr ;
         Z4406CCTFinFas = A4406CCTFinFas ;
         Z4407CCTIniFas = A4407CCTIniFas ;
         Z4039CCTObl = A4039CCTObl ;
         Z4040CCTSto = A4040CCTSto ;
         Z4042CCTObs = A4042CCTObs ;
         Z11475CCTNotUlt = A11475CCTNotUlt ;
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
      edtCCTArc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCTArc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTArc_Enabled), 5, 0), true);
      edtCCTNotUlt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCTNotUlt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTNotUlt_Enabled), 5, 0), true);
      AV44Pgmname = "ControlCalidadHTD.TCCDef" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV44Pgmname", AV44Pgmname);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      edtCCTArc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCTArc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTArc_Enabled), 5, 0), true);
      edtCCTNotUlt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCTNotUlt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTNotUlt_Enabled), 5, 0), true);
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV28EmprCod)==0) )
      {
         edtEmprCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      }
      else
      {
         edtEmprCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      }
      if ( ! (GXutil.strcmp("", AV28EmprCod)==0) )
      {
         edtEmprCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      }
      if ( ! (0==AV29CCTCod) )
      {
         A4031CCTCod = AV29CCTCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
      }
      if ( ! (0==AV29CCTCod) )
      {
         edtCCTCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCCTCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTCod_Enabled), 5, 0), true);
      }
      else
      {
         edtCCTCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCCTCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTCod_Enabled), 5, 0), true);
      }
      if ( ! (0==AV29CCTCod) )
      {
         edtCCTCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCCTCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTCod_Enabled), 5, 0), true);
      }
      if ( ! (GXutil.strcmp("", AV28EmprCod)==0) )
      {
         A396EmprCod = AV28EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV38AuxEmprCod)==0) )
         {
            A396EmprCod = AV38AuxEmprCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         }
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
         /* Using cursor T00IA11 */
         pr_default.execute(9, new Object[] {A396EmprCod});
         A407EmprNom = T00IA11_A407EmprNom[0] ;
         n407EmprNom = T00IA11_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         pr_default.close(9);
      }
   }

   public void loadIA621( )
   {
      /* Using cursor T00IA12 */
      pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod)});
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound621 = (short)(1) ;
         A4041CCTArc = T00IA12_A4041CCTArc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4041CCTArc", A4041CCTArc);
         A407EmprNom = T00IA12_A407EmprNom[0] ;
         n407EmprNom = T00IA12_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A4036CCTDsc = T00IA12_A4036CCTDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4036CCTDsc", A4036CCTDsc);
         A4037CCTTpoCtr = T00IA12_A4037CCTTpoCtr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4037CCTTpoCtr", A4037CCTTpoCtr);
         A4406CCTFinFas = T00IA12_A4406CCTFinFas[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4406CCTFinFas", A4406CCTFinFas);
         A4407CCTIniFas = T00IA12_A4407CCTIniFas[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4407CCTIniFas", A4407CCTIniFas);
         A4039CCTObl = T00IA12_A4039CCTObl[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4039CCTObl", A4039CCTObl);
         A4040CCTSto = T00IA12_A4040CCTSto[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4040CCTSto", A4040CCTSto);
         A4042CCTObs = T00IA12_A4042CCTObs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4042CCTObs", A4042CCTObs);
         A11475CCTNotUlt = T00IA12_A11475CCTNotUlt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11475CCTNotUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11475CCTNotUlt), 4, 0));
         zmIA621( -80) ;
      }
      pr_default.close(10);
      onLoadActionsIA621( ) ;
   }

   public void onLoadActionsIA621( )
   {
      if ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( httpContext.getMessage( "D", ""), "")) == 0 )
      {
         chkCCTObs.setEnabled( 0 );
         httpContext.ajax_rsp_assign_prop("", false, chkCCTObs.getInternalname(), "Enabled", GXutil.ltrimstr( chkCCTObs.getEnabled(), 5, 0), true);
      }
      else
      {
         chkCCTObs.setEnabled( 1 );
         httpContext.ajax_rsp_assign_prop("", false, chkCCTObs.getInternalname(), "Enabled", GXutil.ltrimstr( chkCCTObs.getEnabled(), 5, 0), true);
      }
      if ( ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "I", "")) == 0 ) || ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "D", "")) == 0 ) )
      {
         A4041CCTArc = "" ;
         httpContext.ajax_rsp_assign_attri("", false, "A4041CCTArc", A4041CCTArc);
      }
      if ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "D", "")) == 0 )
      {
         chkCCTObs.setVisible( 0 );
         httpContext.ajax_rsp_assign_prop("", false, chkCCTObs.getInternalname(), "Visible", GXutil.ltrimstr( chkCCTObs.getVisible(), 5, 0), true);
      }
      else
      {
         if ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "D", "")) != 0 )
         {
            chkCCTObs.setVisible( 1 );
            httpContext.ajax_rsp_assign_prop("", false, chkCCTObs.getInternalname(), "Visible", GXutil.ltrimstr( chkCCTObs.getVisible(), 5, 0), true);
         }
      }
      if ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "D", "")) == 0 )
      {
         edtCCTLin_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCCTLin_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLin_Visible), 5, 0), !bGXsfl_79_Refreshing);
      }
      else
      {
         if ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "D", "")) != 0 )
         {
            edtCCTLin_Visible = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCTLin_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLin_Visible), 5, 0), !bGXsfl_79_Refreshing);
         }
      }
      if ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "D", "")) == 0 )
      {
         edtCCTLinDsc_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCCTLinDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLinDsc_Visible), 5, 0), !bGXsfl_79_Refreshing);
      }
      else
      {
         if ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "D", "")) != 0 )
         {
            edtCCTLinDsc_Visible = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCTLinDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLinDsc_Visible), 5, 0), !bGXsfl_79_Refreshing);
         }
      }
      if ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "D", "")) == 0 )
      {
         edtCCTSta_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCCTSta_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTSta_Visible), 5, 0), !bGXsfl_79_Refreshing);
      }
      else
      {
         if ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "D", "")) != 0 )
         {
            edtCCTSta_Visible = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCTSta_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTSta_Visible), 5, 0), !bGXsfl_79_Refreshing);
         }
      }
      if ( ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "I", "")) == 0 ) || ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "D", "")) == 0 ) )
      {
         cmbCCTLinTpoI.setVisible( 0 );
         httpContext.ajax_rsp_assign_prop("", false, cmbCCTLinTpoI.getInternalname(), "Visible", GXutil.ltrimstr( cmbCCTLinTpoI.getVisible(), 5, 0), !bGXsfl_79_Refreshing);
      }
      else
      {
         if ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "E", "")) == 0 )
         {
            cmbCCTLinTpoI.setVisible( 1 );
            httpContext.ajax_rsp_assign_prop("", false, cmbCCTLinTpoI.getInternalname(), "Visible", GXutil.ltrimstr( cmbCCTLinTpoI.getVisible(), 5, 0), !bGXsfl_79_Refreshing);
         }
      }
      if ( ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "I", "")) == 0 ) || ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "D", "")) == 0 ) )
      {
         cmbCCTLinTpoD.setVisible( 0 );
         httpContext.ajax_rsp_assign_prop("", false, cmbCCTLinTpoD.getInternalname(), "Visible", GXutil.ltrimstr( cmbCCTLinTpoD.getVisible(), 5, 0), !bGXsfl_79_Refreshing);
      }
      else
      {
         if ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "E", "")) == 0 )
         {
            cmbCCTLinTpoD.setVisible( 1 );
            httpContext.ajax_rsp_assign_prop("", false, cmbCCTLinTpoD.getInternalname(), "Visible", GXutil.ltrimstr( cmbCCTLinTpoD.getVisible(), 5, 0), !bGXsfl_79_Refreshing);
         }
      }
      if ( ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "I", "")) == 0 ) || ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "D", "")) == 0 ) )
      {
         edtCCTLinLgoD_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCCTLinLgoD_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLinLgoD_Visible), 5, 0), !bGXsfl_79_Refreshing);
      }
      else
      {
         if ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "E", "")) == 0 )
         {
            edtCCTLinLgoD_Visible = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCTLinLgoD_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLinLgoD_Visible), 5, 0), !bGXsfl_79_Refreshing);
         }
      }
      if ( ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "I", "")) == 0 ) || ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "D", "")) == 0 ) )
      {
         edtCCTLinPict_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCCTLinPict_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLinPict_Visible), 5, 0), !bGXsfl_79_Refreshing);
      }
      else
      {
         if ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "E", "")) == 0 )
         {
            edtCCTLinPict_Visible = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCTLinPict_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLinPict_Visible), 5, 0), !bGXsfl_79_Refreshing);
         }
      }
   }

   public void checkExtendedTableIA621( )
   {
      nIsDirty_621 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      /* Using cursor T00IA11 */
      pr_default.execute(9, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(9) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T00IA11_A407EmprNom[0] ;
      n407EmprNom = T00IA11_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(9);
      if ( (0==A4031CCTCod) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Código es requerido.", ""), 1, "CCTCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCCTCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( (0==A4031CCTCod) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Es necessario ingresar un código", ""), 1, "CCTCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCCTCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( (GXutil.strcmp("", A4036CCTDsc)==0) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Descripción es requerido.", ""), 1, "CCTDSC");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCCTDsc_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( (GXutil.strcmp("", A4036CCTDsc)==0) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Ingresar Numero de Línea = 1 a 2", ""), 1, "CCTDSC");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCCTDsc_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( httpContext.getMessage( "D", ""), "")) == 0 )
      {
         chkCCTObs.setEnabled( 0 );
         httpContext.ajax_rsp_assign_prop("", false, chkCCTObs.getInternalname(), "Enabled", GXutil.ltrimstr( chkCCTObs.getEnabled(), 5, 0), true);
      }
      else
      {
         chkCCTObs.setEnabled( 1 );
         httpContext.ajax_rsp_assign_prop("", false, chkCCTObs.getInternalname(), "Enabled", GXutil.ltrimstr( chkCCTObs.getEnabled(), 5, 0), true);
      }
      if ( ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "I", "")) == 0 ) || ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "D", "")) == 0 ) )
      {
         nIsDirty_621 = (short)(1) ;
         A4041CCTArc = "" ;
         httpContext.ajax_rsp_assign_attri("", false, "A4041CCTArc", A4041CCTArc);
      }
      if ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "D", "")) == 0 )
      {
         chkCCTObs.setVisible( 0 );
         httpContext.ajax_rsp_assign_prop("", false, chkCCTObs.getInternalname(), "Visible", GXutil.ltrimstr( chkCCTObs.getVisible(), 5, 0), true);
      }
      else
      {
         if ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "D", "")) != 0 )
         {
            chkCCTObs.setVisible( 1 );
            httpContext.ajax_rsp_assign_prop("", false, chkCCTObs.getInternalname(), "Visible", GXutil.ltrimstr( chkCCTObs.getVisible(), 5, 0), true);
         }
      }
      if ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "D", "")) == 0 )
      {
         edtCCTLin_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCCTLin_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLin_Visible), 5, 0), !bGXsfl_79_Refreshing);
      }
      else
      {
         if ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "D", "")) != 0 )
         {
            edtCCTLin_Visible = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCTLin_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLin_Visible), 5, 0), !bGXsfl_79_Refreshing);
         }
      }
      if ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "D", "")) == 0 )
      {
         edtCCTLinDsc_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCCTLinDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLinDsc_Visible), 5, 0), !bGXsfl_79_Refreshing);
      }
      else
      {
         if ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "D", "")) != 0 )
         {
            edtCCTLinDsc_Visible = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCTLinDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLinDsc_Visible), 5, 0), !bGXsfl_79_Refreshing);
         }
      }
      if ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "D", "")) == 0 )
      {
         edtCCTSta_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCCTSta_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTSta_Visible), 5, 0), !bGXsfl_79_Refreshing);
      }
      else
      {
         if ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "D", "")) != 0 )
         {
            edtCCTSta_Visible = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCTSta_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTSta_Visible), 5, 0), !bGXsfl_79_Refreshing);
         }
      }
      if ( ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "I", "")) == 0 ) || ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "D", "")) == 0 ) )
      {
         cmbCCTLinTpoI.setVisible( 0 );
         httpContext.ajax_rsp_assign_prop("", false, cmbCCTLinTpoI.getInternalname(), "Visible", GXutil.ltrimstr( cmbCCTLinTpoI.getVisible(), 5, 0), !bGXsfl_79_Refreshing);
      }
      else
      {
         if ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "E", "")) == 0 )
         {
            cmbCCTLinTpoI.setVisible( 1 );
            httpContext.ajax_rsp_assign_prop("", false, cmbCCTLinTpoI.getInternalname(), "Visible", GXutil.ltrimstr( cmbCCTLinTpoI.getVisible(), 5, 0), !bGXsfl_79_Refreshing);
         }
      }
      if ( ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "I", "")) == 0 ) || ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "D", "")) == 0 ) )
      {
         cmbCCTLinTpoD.setVisible( 0 );
         httpContext.ajax_rsp_assign_prop("", false, cmbCCTLinTpoD.getInternalname(), "Visible", GXutil.ltrimstr( cmbCCTLinTpoD.getVisible(), 5, 0), !bGXsfl_79_Refreshing);
      }
      else
      {
         if ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "E", "")) == 0 )
         {
            cmbCCTLinTpoD.setVisible( 1 );
            httpContext.ajax_rsp_assign_prop("", false, cmbCCTLinTpoD.getInternalname(), "Visible", GXutil.ltrimstr( cmbCCTLinTpoD.getVisible(), 5, 0), !bGXsfl_79_Refreshing);
         }
      }
      if ( ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "I", "")) == 0 ) || ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "D", "")) == 0 ) )
      {
         edtCCTLinLgoD_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCCTLinLgoD_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLinLgoD_Visible), 5, 0), !bGXsfl_79_Refreshing);
      }
      else
      {
         if ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "E", "")) == 0 )
         {
            edtCCTLinLgoD_Visible = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCTLinLgoD_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLinLgoD_Visible), 5, 0), !bGXsfl_79_Refreshing);
         }
      }
      if ( ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "I", "")) == 0 ) || ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "D", "")) == 0 ) )
      {
         edtCCTLinPict_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCCTLinPict_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLinPict_Visible), 5, 0), !bGXsfl_79_Refreshing);
      }
      else
      {
         if ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "E", "")) == 0 )
         {
            edtCCTLinPict_Visible = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCTLinPict_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLinPict_Visible), 5, 0), !bGXsfl_79_Refreshing);
         }
      }
   }

   public void closeExtendedTableCursorsIA621( )
   {
      pr_default.close(9);
   }

   public void enableDisable( )
   {
   }

   public void gxload_81( String A396EmprCod )
   {
      /* Using cursor T00IA13 */
      pr_default.execute(11, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(11) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T00IA13_A407EmprNom[0] ;
      n407EmprNom = T00IA13_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A407EmprNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(11) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(11);
   }

   public void getKeyIA621( )
   {
      /* Using cursor T00IA14 */
      pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod)});
      if ( (pr_default.getStatus(12) != 101) )
      {
         RcdFound621 = (short)(1) ;
      }
      else
      {
         RcdFound621 = (short)(0) ;
      }
      pr_default.close(12);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T00IA10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         zmIA621( 80) ;
         RcdFound621 = (short)(1) ;
         A4031CCTCod = T00IA10_A4031CCTCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
         A4041CCTArc = T00IA10_A4041CCTArc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4041CCTArc", A4041CCTArc);
         A4036CCTDsc = T00IA10_A4036CCTDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4036CCTDsc", A4036CCTDsc);
         A4037CCTTpoCtr = T00IA10_A4037CCTTpoCtr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4037CCTTpoCtr", A4037CCTTpoCtr);
         A4406CCTFinFas = T00IA10_A4406CCTFinFas[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4406CCTFinFas", A4406CCTFinFas);
         A4407CCTIniFas = T00IA10_A4407CCTIniFas[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4407CCTIniFas", A4407CCTIniFas);
         A4039CCTObl = T00IA10_A4039CCTObl[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4039CCTObl", A4039CCTObl);
         A4040CCTSto = T00IA10_A4040CCTSto[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4040CCTSto", A4040CCTSto);
         A4042CCTObs = T00IA10_A4042CCTObs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4042CCTObs", A4042CCTObs);
         A11475CCTNotUlt = T00IA10_A11475CCTNotUlt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11475CCTNotUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11475CCTNotUlt), 4, 0));
         A396EmprCod = T00IA10_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         O11475CCTNotUlt = A11475CCTNotUlt ;
         httpContext.ajax_rsp_assign_attri("", false, "A11475CCTNotUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11475CCTNotUlt), 4, 0));
         Z396EmprCod = A396EmprCod ;
         Z4031CCTCod = A4031CCTCod ;
         sMode621 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         loadIA621( ) ;
         if ( AnyError == 1 )
         {
            RcdFound621 = (short)(0) ;
            initializeNonKeyIA621( ) ;
         }
         Gx_mode = sMode621 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound621 = (short)(0) ;
         initializeNonKeyIA621( ) ;
         sMode621 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode621 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(8);
   }

   public void getEqualNoModal( )
   {
      getKeyIA621( ) ;
      if ( RcdFound621 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound621 = (short)(0) ;
      /* Using cursor T00IA15 */
      pr_default.execute(13, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A4031CCTCod)});
      if ( (pr_default.getStatus(13) != 101) )
      {
         while ( (pr_default.getStatus(13) != 101) && ( ( GXutil.strcmp(T00IA15_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T00IA15_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00IA15_A4031CCTCod[0] < A4031CCTCod ) ) )
         {
            pr_default.readNext(13);
         }
         if ( (pr_default.getStatus(13) != 101) && ( ( GXutil.strcmp(T00IA15_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T00IA15_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00IA15_A4031CCTCod[0] > A4031CCTCod ) ) )
         {
            A396EmprCod = T00IA15_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A4031CCTCod = T00IA15_A4031CCTCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
            RcdFound621 = (short)(1) ;
         }
      }
      pr_default.close(13);
   }

   public void move_previous( )
   {
      RcdFound621 = (short)(0) ;
      /* Using cursor T00IA16 */
      pr_default.execute(14, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A4031CCTCod)});
      if ( (pr_default.getStatus(14) != 101) )
      {
         while ( (pr_default.getStatus(14) != 101) && ( ( GXutil.strcmp(T00IA16_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T00IA16_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00IA16_A4031CCTCod[0] > A4031CCTCod ) ) )
         {
            pr_default.readNext(14);
         }
         if ( (pr_default.getStatus(14) != 101) && ( ( GXutil.strcmp(T00IA16_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T00IA16_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00IA16_A4031CCTCod[0] < A4031CCTCod ) ) )
         {
            A396EmprCod = T00IA16_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A4031CCTCod = T00IA16_A4031CCTCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
            RcdFound621 = (short)(1) ;
         }
      }
      pr_default.close(14);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKeyIA621( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A11475CCTNotUlt = O11475CCTNotUlt ;
         httpContext.ajax_rsp_assign_attri("", false, "A11475CCTNotUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11475CCTNotUlt), 4, 0));
         GX_FocusControl = edtCCTCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insertIA621( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound621 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A4031CCTCod != Z4031CCTCod ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A4031CCTCod = Z4031CCTCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               A11475CCTNotUlt = O11475CCTNotUlt ;
               httpContext.ajax_rsp_assign_attri("", false, "A11475CCTNotUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11475CCTNotUlt), 4, 0));
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtCCTCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               A11475CCTNotUlt = O11475CCTNotUlt ;
               httpContext.ajax_rsp_assign_attri("", false, "A11475CCTNotUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11475CCTNotUlt), 4, 0));
               updateIA621( ) ;
               GX_FocusControl = edtCCTCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A4031CCTCod != Z4031CCTCod ) )
            {
               /* Insert record */
               A11475CCTNotUlt = O11475CCTNotUlt ;
               httpContext.ajax_rsp_assign_attri("", false, "A11475CCTNotUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11475CCTNotUlt), 4, 0));
               GX_FocusControl = edtCCTCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insertIA621( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "EMPRCOD");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtEmprCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  /* Insert record */
                  A11475CCTNotUlt = O11475CCTNotUlt ;
                  httpContext.ajax_rsp_assign_attri("", false, "A11475CCTNotUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11475CCTNotUlt), 4, 0));
                  GX_FocusControl = edtCCTCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insertIA621( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A4031CCTCod != Z4031CCTCod ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A4031CCTCod = Z4031CCTCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         A11475CCTNotUlt = O11475CCTNotUlt ;
         httpContext.ajax_rsp_assign_attri("", false, "A11475CCTNotUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11475CCTNotUlt), 4, 0));
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtCCTCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrencyIA621( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00IA9 */
         pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod)});
         if ( (pr_default.getStatus(7) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCCDef"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(7) == 101) || ( GXutil.strcmp(Z4041CCTArc, T00IA9_A4041CCTArc[0]) != 0 ) || ( GXutil.strcmp(Z4036CCTDsc, T00IA9_A4036CCTDsc[0]) != 0 ) || ( GXutil.strcmp(Z4037CCTTpoCtr, T00IA9_A4037CCTTpoCtr[0]) != 0 ) || ( GXutil.strcmp(Z4406CCTFinFas, T00IA9_A4406CCTFinFas[0]) != 0 ) || ( GXutil.strcmp(Z4407CCTIniFas, T00IA9_A4407CCTIniFas[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z4039CCTObl, T00IA9_A4039CCTObl[0]) != 0 ) || ( GXutil.strcmp(Z4040CCTSto, T00IA9_A4040CCTSto[0]) != 0 ) || ( GXutil.strcmp(Z4042CCTObs, T00IA9_A4042CCTObs[0]) != 0 ) || ( Z11475CCTNotUlt != T00IA9_A11475CCTNotUlt[0] ) )
         {
            if ( GXutil.strcmp(Z4041CCTArc, T00IA9_A4041CCTArc[0]) != 0 )
            {
               GXutil.writeLogln("controlcalidadhtd.tccdef:[seudo value changed for attri]"+"CCTArc");
               GXutil.writeLogRaw("Old: ",Z4041CCTArc);
               GXutil.writeLogRaw("Current: ",T00IA9_A4041CCTArc[0]);
            }
            if ( GXutil.strcmp(Z4036CCTDsc, T00IA9_A4036CCTDsc[0]) != 0 )
            {
               GXutil.writeLogln("controlcalidadhtd.tccdef:[seudo value changed for attri]"+"CCTDsc");
               GXutil.writeLogRaw("Old: ",Z4036CCTDsc);
               GXutil.writeLogRaw("Current: ",T00IA9_A4036CCTDsc[0]);
            }
            if ( GXutil.strcmp(Z4037CCTTpoCtr, T00IA9_A4037CCTTpoCtr[0]) != 0 )
            {
               GXutil.writeLogln("controlcalidadhtd.tccdef:[seudo value changed for attri]"+"CCTTpoCtr");
               GXutil.writeLogRaw("Old: ",Z4037CCTTpoCtr);
               GXutil.writeLogRaw("Current: ",T00IA9_A4037CCTTpoCtr[0]);
            }
            if ( GXutil.strcmp(Z4406CCTFinFas, T00IA9_A4406CCTFinFas[0]) != 0 )
            {
               GXutil.writeLogln("controlcalidadhtd.tccdef:[seudo value changed for attri]"+"CCTFinFas");
               GXutil.writeLogRaw("Old: ",Z4406CCTFinFas);
               GXutil.writeLogRaw("Current: ",T00IA9_A4406CCTFinFas[0]);
            }
            if ( GXutil.strcmp(Z4407CCTIniFas, T00IA9_A4407CCTIniFas[0]) != 0 )
            {
               GXutil.writeLogln("controlcalidadhtd.tccdef:[seudo value changed for attri]"+"CCTIniFas");
               GXutil.writeLogRaw("Old: ",Z4407CCTIniFas);
               GXutil.writeLogRaw("Current: ",T00IA9_A4407CCTIniFas[0]);
            }
            if ( GXutil.strcmp(Z4039CCTObl, T00IA9_A4039CCTObl[0]) != 0 )
            {
               GXutil.writeLogln("controlcalidadhtd.tccdef:[seudo value changed for attri]"+"CCTObl");
               GXutil.writeLogRaw("Old: ",Z4039CCTObl);
               GXutil.writeLogRaw("Current: ",T00IA9_A4039CCTObl[0]);
            }
            if ( GXutil.strcmp(Z4040CCTSto, T00IA9_A4040CCTSto[0]) != 0 )
            {
               GXutil.writeLogln("controlcalidadhtd.tccdef:[seudo value changed for attri]"+"CCTSto");
               GXutil.writeLogRaw("Old: ",Z4040CCTSto);
               GXutil.writeLogRaw("Current: ",T00IA9_A4040CCTSto[0]);
            }
            if ( GXutil.strcmp(Z4042CCTObs, T00IA9_A4042CCTObs[0]) != 0 )
            {
               GXutil.writeLogln("controlcalidadhtd.tccdef:[seudo value changed for attri]"+"CCTObs");
               GXutil.writeLogRaw("Old: ",Z4042CCTObs);
               GXutil.writeLogRaw("Current: ",T00IA9_A4042CCTObs[0]);
            }
            if ( Z11475CCTNotUlt != T00IA9_A11475CCTNotUlt[0] )
            {
               GXutil.writeLogln("controlcalidadhtd.tccdef:[seudo value changed for attri]"+"CCTNotUlt");
               GXutil.writeLogRaw("Old: ",Z11475CCTNotUlt);
               GXutil.writeLogRaw("Current: ",T00IA9_A11475CCTNotUlt[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCCDef"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertIA621( )
   {
      beforeValidateIA621( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableIA621( ) ;
      }
      if ( AnyError == 0 )
      {
         zmIA621( 0) ;
         checkOptimisticConcurrencyIA621( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmIA621( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertIA621( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00IA17 */
                  pr_default.execute(15, new Object[] {Integer.valueOf(A4031CCTCod), A4041CCTArc, A4036CCTDsc, A4037CCTTpoCtr, A4406CCTFinFas, A4407CCTIniFas, A4039CCTObl, A4040CCTSto, A4042CCTObs, Short.valueOf(A11475CCTNotUlt), A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCDef");
                  if ( (pr_default.getStatus(15) == 1) )
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
                        processLevelIA621( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaptionIA0( ) ;
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
         else
         {
            loadIA621( ) ;
         }
         endLevelIA621( ) ;
      }
      closeExtendedTableCursorsIA621( ) ;
   }

   public void updateIA621( )
   {
      beforeValidateIA621( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableIA621( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyIA621( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmIA621( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdateIA621( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00IA18 */
                  pr_default.execute(16, new Object[] {A4041CCTArc, A4036CCTDsc, A4037CCTTpoCtr, A4406CCTFinFas, A4407CCTIniFas, A4039CCTObl, A4040CCTSto, A4042CCTObs, Short.valueOf(A11475CCTNotUlt), A396EmprCod, Integer.valueOf(A4031CCTCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCDef");
                  if ( (pr_default.getStatus(16) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCCDef"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdateIA621( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevelIA621( ) ;
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
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_unexp"), 1, "");
                     AnyError = (short)(1) ;
                  }
               }
            }
         }
         endLevelIA621( ) ;
      }
      closeExtendedTableCursorsIA621( ) ;
   }

   public void deferredUpdateIA621( )
   {
   }

   public void delete( )
   {
      beforeValidateIA621( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyIA621( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsIA621( ) ;
         afterConfirmIA621( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteIA621( ) ;
            if ( AnyError == 0 )
            {
               A11475CCTNotUlt = O11475CCTNotUlt ;
               httpContext.ajax_rsp_assign_attri("", false, "A11475CCTNotUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11475CCTNotUlt), 4, 0));
               scanStartIA1529( ) ;
               while ( RcdFound1529 != 0 )
               {
                  getByPrimaryKeyIA1529( ) ;
                  deleteIA1529( ) ;
                  scanNextIA1529( ) ;
                  O11475CCTNotUlt = A11475CCTNotUlt ;
                  httpContext.ajax_rsp_assign_attri("", false, "A11475CCTNotUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11475CCTNotUlt), 4, 0));
               }
               scanEndIA1529( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00IA19 */
                  pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCDef");
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
      }
      sMode621 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelIA621( ) ;
      Gx_mode = sMode621 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsIA621( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T00IA20 */
         pr_default.execute(18, new Object[] {A396EmprCod});
         A407EmprNom = T00IA20_A407EmprNom[0] ;
         n407EmprNom = T00IA20_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         pr_default.close(18);
         if ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( httpContext.getMessage( "D", ""), "")) == 0 )
         {
            chkCCTObs.setEnabled( 0 );
            httpContext.ajax_rsp_assign_prop("", false, chkCCTObs.getInternalname(), "Enabled", GXutil.ltrimstr( chkCCTObs.getEnabled(), 5, 0), true);
         }
         else
         {
            chkCCTObs.setEnabled( 1 );
            httpContext.ajax_rsp_assign_prop("", false, chkCCTObs.getInternalname(), "Enabled", GXutil.ltrimstr( chkCCTObs.getEnabled(), 5, 0), true);
         }
         if ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "D", "")) == 0 )
         {
            chkCCTObs.setVisible( 0 );
            httpContext.ajax_rsp_assign_prop("", false, chkCCTObs.getInternalname(), "Visible", GXutil.ltrimstr( chkCCTObs.getVisible(), 5, 0), true);
         }
         else
         {
            if ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "D", "")) != 0 )
            {
               chkCCTObs.setVisible( 1 );
               httpContext.ajax_rsp_assign_prop("", false, chkCCTObs.getInternalname(), "Visible", GXutil.ltrimstr( chkCCTObs.getVisible(), 5, 0), true);
            }
         }
         if ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "D", "")) == 0 )
         {
            edtCCTLin_Visible = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCTLin_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLin_Visible), 5, 0), !bGXsfl_79_Refreshing);
         }
         else
         {
            if ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "D", "")) != 0 )
            {
               edtCCTLin_Visible = 1 ;
               httpContext.ajax_rsp_assign_prop("", false, edtCCTLin_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLin_Visible), 5, 0), !bGXsfl_79_Refreshing);
            }
         }
         if ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "D", "")) == 0 )
         {
            edtCCTLinDsc_Visible = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCTLinDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLinDsc_Visible), 5, 0), !bGXsfl_79_Refreshing);
         }
         else
         {
            if ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "D", "")) != 0 )
            {
               edtCCTLinDsc_Visible = 1 ;
               httpContext.ajax_rsp_assign_prop("", false, edtCCTLinDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLinDsc_Visible), 5, 0), !bGXsfl_79_Refreshing);
            }
         }
         if ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "D", "")) == 0 )
         {
            edtCCTSta_Visible = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCTSta_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTSta_Visible), 5, 0), !bGXsfl_79_Refreshing);
         }
         else
         {
            if ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "D", "")) != 0 )
            {
               edtCCTSta_Visible = 1 ;
               httpContext.ajax_rsp_assign_prop("", false, edtCCTSta_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTSta_Visible), 5, 0), !bGXsfl_79_Refreshing);
            }
         }
         if ( ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "I", "")) == 0 ) || ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "D", "")) == 0 ) )
         {
            cmbCCTLinTpoI.setVisible( 0 );
            httpContext.ajax_rsp_assign_prop("", false, cmbCCTLinTpoI.getInternalname(), "Visible", GXutil.ltrimstr( cmbCCTLinTpoI.getVisible(), 5, 0), !bGXsfl_79_Refreshing);
         }
         else
         {
            if ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "E", "")) == 0 )
            {
               cmbCCTLinTpoI.setVisible( 1 );
               httpContext.ajax_rsp_assign_prop("", false, cmbCCTLinTpoI.getInternalname(), "Visible", GXutil.ltrimstr( cmbCCTLinTpoI.getVisible(), 5, 0), !bGXsfl_79_Refreshing);
            }
         }
         if ( ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "I", "")) == 0 ) || ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "D", "")) == 0 ) )
         {
            cmbCCTLinTpoD.setVisible( 0 );
            httpContext.ajax_rsp_assign_prop("", false, cmbCCTLinTpoD.getInternalname(), "Visible", GXutil.ltrimstr( cmbCCTLinTpoD.getVisible(), 5, 0), !bGXsfl_79_Refreshing);
         }
         else
         {
            if ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "E", "")) == 0 )
            {
               cmbCCTLinTpoD.setVisible( 1 );
               httpContext.ajax_rsp_assign_prop("", false, cmbCCTLinTpoD.getInternalname(), "Visible", GXutil.ltrimstr( cmbCCTLinTpoD.getVisible(), 5, 0), !bGXsfl_79_Refreshing);
            }
         }
         if ( ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "I", "")) == 0 ) || ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "D", "")) == 0 ) )
         {
            edtCCTLinLgoD_Visible = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCTLinLgoD_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLinLgoD_Visible), 5, 0), !bGXsfl_79_Refreshing);
         }
         else
         {
            if ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "E", "")) == 0 )
            {
               edtCCTLinLgoD_Visible = 1 ;
               httpContext.ajax_rsp_assign_prop("", false, edtCCTLinLgoD_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLinLgoD_Visible), 5, 0), !bGXsfl_79_Refreshing);
            }
         }
         if ( ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "I", "")) == 0 ) || ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "D", "")) == 0 ) )
         {
            edtCCTLinPict_Visible = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCTLinPict_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLinPict_Visible), 5, 0), !bGXsfl_79_Refreshing);
         }
         else
         {
            if ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "E", "")) == 0 )
            {
               edtCCTLinPict_Visible = 1 ;
               httpContext.ajax_rsp_assign_prop("", false, edtCCTLinPict_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLinPict_Visible), 5, 0), !bGXsfl_79_Refreshing);
            }
         }
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T00IA21 */
         pr_default.execute(19, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod)});
         if ( (pr_default.getStatus(19) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(19);
         /* Using cursor T00IA22 */
         pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod)});
         if ( (pr_default.getStatus(20) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Controles", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(20);
         /* Using cursor T00IA23 */
         pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod)});
         if ( (pr_default.getStatus(21) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CCSer1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(21);
         /* Using cursor T00IA24 */
         pr_default.execute(22, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod)});
         if ( (pr_default.getStatus(22) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CCFas", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(22);
         /* Using cursor T00IA25 */
         pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod)});
         if ( (pr_default.getStatus(23) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CCDef1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(23);
         /* Using cursor T00IA26 */
         pr_default.execute(24, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod)});
         if ( (pr_default.getStatus(24) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(24);
      }
   }

   public void processNestedLevelIA622( )
   {
      nGXsfl_79_idx = 0 ;
      while ( nGXsfl_79_idx < nRC_GXsfl_79 )
      {
         readRowIA622( ) ;
         if ( ( nRcdExists_622 != 0 ) || ( nIsMod_622 != 0 ) )
         {
            standaloneNotModalIA622( ) ;
            getKeyIA622( ) ;
            if ( ( nRcdExists_622 == 0 ) && ( nRcdDeleted_622 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insertIA622( ) ;
            }
            else
            {
               if ( RcdFound622 != 0 )
               {
                  if ( ( nRcdDeleted_622 != 0 ) && ( nRcdExists_622 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     deleteIA622( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_622 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        updateIA622( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_622 == 0 )
                  {
                     GXCCtl = "CCTLIN_" + sGXsfl_79_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtCCTLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtCCTLin_Internalname, GXutil.ltrim( localUtil.ntoc( A4034CCTLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( cmbCCTLinTpoI.getInternalname(), GXutil.rtrim( A4048CCTLinTpoI)) ;
         httpContext.changePostValue( dynCCVCod.getInternalname(), GXutil.rtrim( A11522CCVCod)) ;
         httpContext.changePostValue( cmbCCTLinTpoD.getInternalname(), GXutil.rtrim( A4044CCTLinTpoD)) ;
         httpContext.changePostValue( edtCCTLinDsc_Internalname, GXutil.rtrim( A4043CCTLinDsc)) ;
         httpContext.changePostValue( edtCCTLinVarW_Internalname, GXutil.rtrim( A4047CCTLinVarW)) ;
         httpContext.changePostValue( edtCCTLinLgoD_Internalname, GXutil.ltrim( localUtil.ntoc( A4045CCTLinLgoD, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCCTLinPict_Internalname, GXutil.rtrim( A4046CCTLinPict)) ;
         httpContext.changePostValue( edtCCTSta_Internalname, GXutil.rtrim( A4408CCTSta)) ;
         httpContext.changePostValue( edtCCVNorma_Internalname, GXutil.rtrim( A13249CCVNorma)) ;
         httpContext.changePostValue( edtCCVEspecif_Internalname, GXutil.rtrim( A13250CCVEspecif)) ;
         httpContext.changePostValue( edtCCTLinDscL_Internalname, A11476CCTLinDscL) ;
         httpContext.changePostValue( edtCCVPict_Internalname, GXutil.rtrim( A11526CCVPict)) ;
         httpContext.changePostValue( edtCCVTpoDat_Internalname, GXutil.rtrim( A11528CCVTpoDat)) ;
         httpContext.changePostValue( edtCCVDsc_Internalname, GXutil.rtrim( A11529CCVDsc)) ;
         httpContext.changePostValue( "ZT_"+"Z4034CCTLin_"+sGXsfl_79_idx, GXutil.ltrim( localUtil.ntoc( Z4034CCTLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4045CCTLinLgoD_"+sGXsfl_79_idx, GXutil.ltrim( localUtil.ntoc( Z4045CCTLinLgoD, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4046CCTLinPict_"+sGXsfl_79_idx, GXutil.rtrim( Z4046CCTLinPict)) ;
         httpContext.changePostValue( "ZT_"+"Z4048CCTLinTpoI_"+sGXsfl_79_idx, GXutil.rtrim( Z4048CCTLinTpoI)) ;
         httpContext.changePostValue( "ZT_"+"Z4044CCTLinTpoD_"+sGXsfl_79_idx, GXutil.rtrim( Z4044CCTLinTpoD)) ;
         httpContext.changePostValue( "ZT_"+"Z4043CCTLinDsc_"+sGXsfl_79_idx, GXutil.rtrim( Z4043CCTLinDsc)) ;
         httpContext.changePostValue( "ZT_"+"Z4047CCTLinVarW_"+sGXsfl_79_idx, GXutil.rtrim( Z4047CCTLinVarW)) ;
         httpContext.changePostValue( "ZT_"+"Z4408CCTSta_"+sGXsfl_79_idx, GXutil.rtrim( Z4408CCTSta)) ;
         httpContext.changePostValue( "ZT_"+"Z13249CCVNorma_"+sGXsfl_79_idx, GXutil.rtrim( Z13249CCVNorma)) ;
         httpContext.changePostValue( "ZT_"+"Z13250CCVEspecif_"+sGXsfl_79_idx, GXutil.rtrim( Z13250CCVEspecif)) ;
         httpContext.changePostValue( "ZT_"+"Z11476CCTLinDscL_"+sGXsfl_79_idx, Z11476CCTLinDscL) ;
         httpContext.changePostValue( "ZT_"+"Z11522CCVCod_"+sGXsfl_79_idx, GXutil.rtrim( Z11522CCVCod)) ;
         httpContext.changePostValue( "nRC_GXsfl_154_"+sGXsfl_79_idx, GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_154, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_622_"+sGXsfl_79_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_622, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_622_"+sGXsfl_79_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_622, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_622_"+sGXsfl_79_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_622, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "N4034CCTLin_"+sGXsfl_79_idx, GXutil.ltrim( localUtil.ntoc( A4034CCTLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "N11522CCVCod_"+sGXsfl_79_idx, GXutil.rtrim( A11522CCVCod)) ;
         httpContext.changePostValue( "N4044CCTLinTpoD_"+sGXsfl_79_idx, GXutil.rtrim( A4044CCTLinTpoD)) ;
         httpContext.changePostValue( "N4043CCTLinDsc_"+sGXsfl_79_idx, GXutil.rtrim( A4043CCTLinDsc)) ;
         httpContext.changePostValue( "N4045CCTLinLgoD_"+sGXsfl_79_idx, GXutil.ltrim( localUtil.ntoc( A4045CCTLinLgoD, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "N4046CCTLinPict_"+sGXsfl_79_idx, GXutil.rtrim( A4046CCTLinPict)) ;
         httpContext.changePostValue( "N4408CCTSta_"+sGXsfl_79_idx, GXutil.rtrim( A4408CCTSta)) ;
         if ( nIsMod_622 != 0 )
         {
            httpContext.changePostValue( "CCTLIN_"+sGXsfl_79_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCTLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CCTLIN_"+sGXsfl_79_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtCCTLin_Visible, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CCTLINTPOI_"+sGXsfl_79_idx+"Visible", GXutil.ltrim( localUtil.ntoc( cmbCCTLinTpoI.getVisible(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CCTLINTPOI_"+sGXsfl_79_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbCCTLinTpoI.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CCVCOD_"+sGXsfl_79_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( dynCCVCod.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CCTLINTPOD_"+sGXsfl_79_idx+"Visible", GXutil.ltrim( localUtil.ntoc( cmbCCTLinTpoD.getVisible(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CCTLINTPOD_"+sGXsfl_79_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbCCTLinTpoD.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CCTLINDSC_"+sGXsfl_79_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCTLinDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CCTLINDSC_"+sGXsfl_79_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtCCTLinDsc_Visible, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CCTLINVARW_"+sGXsfl_79_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCTLinVarW_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CCTLINLGOD_"+sGXsfl_79_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCTLinLgoD_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CCTLINLGOD_"+sGXsfl_79_idx+"Invitemessage", GXutil.rtrim( edtCCTLinLgoD_Invitemessage)) ;
            httpContext.changePostValue( "CCTLINLGOD_"+sGXsfl_79_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtCCTLinLgoD_Visible, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CCTLINPICT_"+sGXsfl_79_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCTLinPict_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CCTLINPICT_"+sGXsfl_79_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtCCTLinPict_Visible, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CCTSTA_"+sGXsfl_79_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCTSta_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CCTSTA_"+sGXsfl_79_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtCCTSta_Visible, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CCVNORMA_"+sGXsfl_79_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCVNorma_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CCVESPECIF_"+sGXsfl_79_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCVEspecif_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CCTLINDSCL_"+sGXsfl_79_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCTLinDscL_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CCVPICT_"+sGXsfl_79_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCVPict_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CCVPICT_"+sGXsfl_79_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtCCVPict_Visible, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CCVTPODAT_"+sGXsfl_79_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCVTpoDat_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CCVTPODAT_"+sGXsfl_79_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtCCVTpoDat_Visible, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CCVDSC_"+sGXsfl_79_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCVDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CCVDSC_"+sGXsfl_79_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtCCVDsc_Visible, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAllIA622( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_622 = (short)(0) ;
      nIsMod_622 = (short)(0) ;
      nRcdDeleted_622 = (short)(0) ;
   }

   public void processNestedLevelIA1529( )
   {
      s11475CCTNotUlt = O11475CCTNotUlt ;
      httpContext.ajax_rsp_assign_attri("", false, "A11475CCTNotUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11475CCTNotUlt), 4, 0));
      nGXsfl_181_idx = 0 ;
      while ( nGXsfl_181_idx < nRC_GXsfl_181 )
      {
         readRowIA1529( ) ;
         if ( ( nRcdExists_1529 != 0 ) || ( nIsMod_1529 != 0 ) )
         {
            standaloneNotModalIA1529( ) ;
            getKeyIA1529( ) ;
            if ( ( nRcdExists_1529 == 0 ) && ( nRcdDeleted_1529 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insertIA1529( ) ;
            }
            else
            {
               if ( RcdFound1529 != 0 )
               {
                  if ( ( nRcdDeleted_1529 != 0 ) && ( nRcdExists_1529 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     deleteIA1529( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1529 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        updateIA1529( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1529 == 0 )
                  {
                     GXCCtl = "CCTNOTID_" + sGXsfl_181_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtCCTNotId_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O11475CCTNotUlt = A11475CCTNotUlt ;
            httpContext.ajax_rsp_assign_attri("", false, "A11475CCTNotUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11475CCTNotUlt), 4, 0));
         }
         httpContext.changePostValue( edtCCTNotId_Internalname, GXutil.ltrim( localUtil.ntoc( A11481CCTNotId, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( cmbCCTNotEvt.getInternalname(), GXutil.rtrim( A11477CCTNotEvt)) ;
         httpContext.changePostValue( cmbCCTNotDst.getInternalname(), GXutil.rtrim( A11478CCTNotDst)) ;
         httpContext.changePostValue( dynCCTNotUsr.getInternalname(), GXutil.rtrim( A11479CCTNotUsr)) ;
         httpContext.changePostValue( edtCCTNotEml_Internalname, GXutil.rtrim( A11480CCTNotEml)) ;
         httpContext.changePostValue( edtCCTNotAsu_Internalname, A11523CCTNotAsu) ;
         httpContext.changePostValue( edtCCTNotTxt_Internalname, A11524CCTNotTxt) ;
         httpContext.changePostValue( cmbCCTNotAdj.getInternalname(), GXutil.ltrim( localUtil.ntoc( A11525CCTNotAdj, (byte)(1), (byte)(0), ".", ""))) ;
         httpContext.changePostValue( cmbCCTNotStp.getInternalname(), GXutil.ltrim( localUtil.ntoc( A12733CCTNotStp, (byte)(1), (byte)(0), ".", ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11481CCTNotId_"+sGXsfl_181_idx, GXutil.ltrim( localUtil.ntoc( Z11481CCTNotId, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12733CCTNotStp_"+sGXsfl_181_idx, GXutil.ltrim( localUtil.ntoc( Z12733CCTNotStp, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11477CCTNotEvt_"+sGXsfl_181_idx, GXutil.rtrim( Z11477CCTNotEvt)) ;
         httpContext.changePostValue( "ZT_"+"Z11478CCTNotDst_"+sGXsfl_181_idx, GXutil.rtrim( Z11478CCTNotDst)) ;
         httpContext.changePostValue( "ZT_"+"Z11479CCTNotUsr_"+sGXsfl_181_idx, GXutil.rtrim( Z11479CCTNotUsr)) ;
         httpContext.changePostValue( "ZT_"+"Z11480CCTNotEml_"+sGXsfl_181_idx, GXutil.rtrim( Z11480CCTNotEml)) ;
         httpContext.changePostValue( "ZT_"+"Z11523CCTNotAsu_"+sGXsfl_181_idx, Z11523CCTNotAsu) ;
         httpContext.changePostValue( "ZT_"+"Z11524CCTNotTxt_"+sGXsfl_181_idx, Z11524CCTNotTxt) ;
         httpContext.changePostValue( "ZT_"+"Z11525CCTNotAdj_"+sGXsfl_181_idx, GXutil.ltrim( localUtil.ntoc( Z11525CCTNotAdj, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1529_"+sGXsfl_181_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1529, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1529_"+sGXsfl_181_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1529, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1529_"+sGXsfl_181_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1529, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "N11479CCTNotUsr_"+sGXsfl_181_idx, GXutil.rtrim( A11479CCTNotUsr)) ;
         httpContext.changePostValue( "N11480CCTNotEml_"+sGXsfl_181_idx, GXutil.rtrim( A11480CCTNotEml)) ;
         if ( nIsMod_1529 != 0 )
         {
            httpContext.changePostValue( "CCTNOTID_"+sGXsfl_181_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCTNotId_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CCTNOTEVT_"+sGXsfl_181_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbCCTNotEvt.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CCTNOTDST_"+sGXsfl_181_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbCCTNotDst.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CCTNOTUSR_"+sGXsfl_181_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( dynCCTNotUsr.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CCTNOTEML_"+sGXsfl_181_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCTNotEml_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CCTNOTASU_"+sGXsfl_181_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCTNotAsu_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CCTNOTTXT_"+sGXsfl_181_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCTNotTxt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CCTNOTADJ_"+sGXsfl_181_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbCCTNotAdj.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CCTNOTSTP_"+sGXsfl_181_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbCCTNotStp.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAllIA1529( ) ;
      if ( AnyError != 0 )
      {
         O11475CCTNotUlt = s11475CCTNotUlt ;
         httpContext.ajax_rsp_assign_attri("", false, "A11475CCTNotUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11475CCTNotUlt), 4, 0));
      }
      nRcdExists_1529 = (short)(0) ;
      nIsMod_1529 = (short)(0) ;
      nRcdDeleted_1529 = (short)(0) ;
   }

   public void processLevelIA621( )
   {
      /* Save parent mode. */
      sMode621 = Gx_mode ;
      processNestedLevelIA622( ) ;
      processNestedLevelIA1529( ) ;
      if ( AnyError != 0 )
      {
         O11475CCTNotUlt = s11475CCTNotUlt ;
         httpContext.ajax_rsp_assign_attri("", false, "A11475CCTNotUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11475CCTNotUlt), 4, 0));
      }
      /* Restore parent mode. */
      Gx_mode = sMode621 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
      /* Using cursor T00IA27 */
      pr_default.execute(25, new Object[] {Short.valueOf(A11475CCTNotUlt), A396EmprCod, Integer.valueOf(A4031CCTCod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCDef");
   }

   public void endLevelIA621( )
   {
      pr_default.close(7);
      if ( AnyError == 0 )
      {
         beforeCompleteIA621( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "controlcalidadhtd.tccdef");
         if ( AnyError == 0 )
         {
            confirmValuesIA0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "controlcalidadhtd.tccdef");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStartIA621( )
   {
      /* Scan By routine */
      /* Using cursor T00IA28 */
      pr_default.execute(26);
      RcdFound621 = (short)(0) ;
      if ( (pr_default.getStatus(26) != 101) )
      {
         RcdFound621 = (short)(1) ;
         A396EmprCod = T00IA28_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A4031CCTCod = T00IA28_A4031CCTCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNextIA621( )
   {
      /* Scan next routine */
      pr_default.readNext(26);
      RcdFound621 = (short)(0) ;
      if ( (pr_default.getStatus(26) != 101) )
      {
         RcdFound621 = (short)(1) ;
         A396EmprCod = T00IA28_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A4031CCTCod = T00IA28_A4031CCTCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
      }
   }

   public void scanEndIA621( )
   {
      pr_default.close(26);
   }

   public void afterConfirmIA621( )
   {
      /* After Confirm Rules */
      if ( ! (GXutil.strcmp("", AV14CCTArc)==0) && true /* After */ && true /* Level */ )
      {
         A4041CCTArc = AV14CCTArc ;
         httpContext.ajax_rsp_assign_attri("", false, "A4041CCTArc", A4041CCTArc);
      }
   }

   public void beforeInsertIA621( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateIA621( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteIA621( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteIA621( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateIA621( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesIA621( )
   {
      edtCCTCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCTCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTCod_Enabled), 5, 0), true);
      edtCCTDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCTDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTDsc_Enabled), 5, 0), true);
      cmbCCTTpoCtr.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbCCTTpoCtr.getInternalname(), "Enabled", GXutil.ltrimstr( cmbCCTTpoCtr.getEnabled(), 5, 0), true);
      chkCCTFinFas.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkCCTFinFas.getInternalname(), "Enabled", GXutil.ltrimstr( chkCCTFinFas.getEnabled(), 5, 0), true);
      chkCCTIniFas.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkCCTIniFas.getInternalname(), "Enabled", GXutil.ltrimstr( chkCCTIniFas.getEnabled(), 5, 0), true);
      chkCCTSto.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkCCTSto.getInternalname(), "Enabled", GXutil.ltrimstr( chkCCTSto.getEnabled(), 5, 0), true);
      chkCCTObs.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkCCTObs.getInternalname(), "Enabled", GXutil.ltrimstr( chkCCTObs.getEnabled(), 5, 0), true);
      edtavCctarc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCctarc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCctarc_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtCCTObl_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCTObl_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTObl_Enabled), 5, 0), true);
      edtCCTNotUlt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCTNotUlt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTNotUlt_Enabled), 5, 0), true);
      edtCCTArc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCTArc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTArc_Enabled), 5, 0), true);
   }

   public void zmIA622( int GX_JID )
   {
      if ( ( GX_JID == 82 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z4045CCTLinLgoD = T00IA7_A4045CCTLinLgoD[0] ;
            Z4046CCTLinPict = T00IA7_A4046CCTLinPict[0] ;
            Z4048CCTLinTpoI = T00IA7_A4048CCTLinTpoI[0] ;
            Z4044CCTLinTpoD = T00IA7_A4044CCTLinTpoD[0] ;
            Z4043CCTLinDsc = T00IA7_A4043CCTLinDsc[0] ;
            Z4047CCTLinVarW = T00IA7_A4047CCTLinVarW[0] ;
            Z4408CCTSta = T00IA7_A4408CCTSta[0] ;
            Z13249CCVNorma = T00IA7_A13249CCVNorma[0] ;
            Z13250CCVEspecif = T00IA7_A13250CCVEspecif[0] ;
            Z11476CCTLinDscL = T00IA7_A11476CCTLinDscL[0] ;
            Z11522CCVCod = T00IA7_A11522CCVCod[0] ;
         }
         else
         {
            Z4045CCTLinLgoD = A4045CCTLinLgoD ;
            Z4046CCTLinPict = A4046CCTLinPict ;
            Z4048CCTLinTpoI = A4048CCTLinTpoI ;
            Z4044CCTLinTpoD = A4044CCTLinTpoD ;
            Z4043CCTLinDsc = A4043CCTLinDsc ;
            Z4047CCTLinVarW = A4047CCTLinVarW ;
            Z4408CCTSta = A4408CCTSta ;
            Z13249CCVNorma = A13249CCVNorma ;
            Z13250CCVEspecif = A13250CCVEspecif ;
            Z11476CCTLinDscL = A11476CCTLinDscL ;
            Z11522CCVCod = A11522CCVCod ;
         }
      }
      if ( GX_JID == -82 )
      {
         Z4031CCTCod = A4031CCTCod ;
         Z4034CCTLin = A4034CCTLin ;
         Z4045CCTLinLgoD = A4045CCTLinLgoD ;
         Z4046CCTLinPict = A4046CCTLinPict ;
         Z4048CCTLinTpoI = A4048CCTLinTpoI ;
         Z4044CCTLinTpoD = A4044CCTLinTpoD ;
         Z4043CCTLinDsc = A4043CCTLinDsc ;
         Z4047CCTLinVarW = A4047CCTLinVarW ;
         Z4408CCTSta = A4408CCTSta ;
         Z13249CCVNorma = A13249CCVNorma ;
         Z13250CCVEspecif = A13250CCVEspecif ;
         Z11476CCTLinDscL = A11476CCTLinDscL ;
         Z396EmprCod = A396EmprCod ;
         Z11522CCVCod = A11522CCVCod ;
         Z11526CCVPict = A11526CCVPict ;
         Z11527CCVLgoDat = A11527CCVLgoDat ;
         Z11528CCVTpoDat = A11528CCVTpoDat ;
         Z11529CCVDsc = A11529CCVDsc ;
      }
   }

   public void standaloneNotModalIA622( )
   {
      gxaccvcod_htmlIA622( A396EmprCod) ;
      if ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "D", "")) == 0 )
      {
         A4034CCTLin = (short)(1) ;
      }
      if ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( httpContext.getMessage( "D", ""), "")) == 0 )
      {
         edtCCTLin_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCCTLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLin_Enabled), 5, 0), !bGXsfl_79_Refreshing);
      }
      else
      {
         edtCCTLin_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCCTLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLin_Enabled), 5, 0), !bGXsfl_79_Refreshing);
      }
      if ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( httpContext.getMessage( "D", ""), "")) == 0 )
      {
         edtCCTSta_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCCTSta_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTSta_Enabled), 5, 0), !bGXsfl_79_Refreshing);
      }
      else
      {
         edtCCTSta_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCCTSta_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTSta_Enabled), 5, 0), !bGXsfl_79_Refreshing);
      }
   }

   public void standaloneModalIA622( )
   {
      if ( ( ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "I", "")) == 0 ) ) && ( isIns( )  || isUpd( )  ) )
      {
         A4048CCTLinTpoI = httpContext.getMessage( "L", "") ;
      }
      else
      {
         if ( ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "I", "")) == 0 ) || ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "D", "")) == 0 ) )
         {
            A4048CCTLinTpoI = httpContext.getMessage( "L", "") ;
         }
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtCCTLin_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCCTLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLin_Enabled), 5, 0), !bGXsfl_79_Refreshing);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ( Gx_BScreen == 0 ) )
      {
         if ( ! ( GXutil.strcmp(A4048CCTLinTpoI, httpContext.getMessage( "A", "")) == 0 ) && ( AV27TestCC == 0 ) )
         {
            A11522CCVCod = httpContext.getMessage( "NoAplica", "") ;
         }
         /* Using cursor T00IA8 */
         pr_default.execute(6, new Object[] {A396EmprCod, A11522CCVCod});
         A11526CCVPict = T00IA8_A11526CCVPict[0] ;
         n11526CCVPict = T00IA8_n11526CCVPict[0] ;
         A11527CCVLgoDat = T00IA8_A11527CCVLgoDat[0] ;
         n11527CCVLgoDat = T00IA8_n11527CCVLgoDat[0] ;
         A11528CCVTpoDat = T00IA8_A11528CCVTpoDat[0] ;
         n11528CCVTpoDat = T00IA8_n11528CCVTpoDat[0] ;
         A11529CCVDsc = T00IA8_A11529CCVDsc[0] ;
         n11529CCVDsc = T00IA8_n11529CCVDsc[0] ;
         pr_default.close(6);
         if ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( httpContext.getMessage( "D", ""), "")) == 0 )
         {
            edtCCTLinDsc_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCTLinDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLinDsc_Enabled), 5, 0), !bGXsfl_79_Refreshing);
         }
         else
         {
            if ( ( GXutil.strcmp(A4048CCTLinTpoI, httpContext.getMessage( httpContext.getMessage( "A", ""), "")) == 0 ) && true /* After */ )
            {
               edtCCTLinDsc_Enabled = 0 ;
               httpContext.ajax_rsp_assign_prop("", false, edtCCTLinDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLinDsc_Enabled), 5, 0), !bGXsfl_79_Refreshing);
            }
            else
            {
               edtCCTLinDsc_Enabled = 1 ;
               httpContext.ajax_rsp_assign_prop("", false, edtCCTLinDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLinDsc_Enabled), 5, 0), !bGXsfl_79_Refreshing);
            }
         }
         if ( ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( httpContext.getMessage( "I", ""), "")) == 0 ) || ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( httpContext.getMessage( "D", ""), "")) == 0 ) )
         {
            cmbCCTLinTpoD.setEnabled( 0 );
            httpContext.ajax_rsp_assign_prop("", false, cmbCCTLinTpoD.getInternalname(), "Enabled", GXutil.ltrimstr( cmbCCTLinTpoD.getEnabled(), 5, 0), !bGXsfl_79_Refreshing);
         }
         else
         {
            if ( ( GXutil.strcmp(A4048CCTLinTpoI, httpContext.getMessage( httpContext.getMessage( "A", ""), "")) == 0 ) && true /* After */ )
            {
               cmbCCTLinTpoD.setEnabled( 0 );
               httpContext.ajax_rsp_assign_prop("", false, cmbCCTLinTpoD.getInternalname(), "Enabled", GXutil.ltrimstr( cmbCCTLinTpoD.getEnabled(), 5, 0), !bGXsfl_79_Refreshing);
            }
            else
            {
               cmbCCTLinTpoD.setEnabled( 1 );
               httpContext.ajax_rsp_assign_prop("", false, cmbCCTLinTpoD.getInternalname(), "Enabled", GXutil.ltrimstr( cmbCCTLinTpoD.getEnabled(), 5, 0), !bGXsfl_79_Refreshing);
            }
         }
         if ( ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( httpContext.getMessage( "I", ""), "")) == 0 ) || ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( httpContext.getMessage( "D", ""), "")) == 0 ) )
         {
            edtCCTLinLgoD_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCTLinLgoD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLinLgoD_Enabled), 5, 0), !bGXsfl_79_Refreshing);
         }
         else
         {
            if ( ( GXutil.strcmp(A4048CCTLinTpoI, httpContext.getMessage( httpContext.getMessage( "A", ""), "")) == 0 ) && true /* After */ )
            {
               edtCCTLinLgoD_Enabled = 0 ;
               httpContext.ajax_rsp_assign_prop("", false, edtCCTLinLgoD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLinLgoD_Enabled), 5, 0), !bGXsfl_79_Refreshing);
            }
            else
            {
               edtCCTLinLgoD_Enabled = 1 ;
               httpContext.ajax_rsp_assign_prop("", false, edtCCTLinLgoD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLinLgoD_Enabled), 5, 0), !bGXsfl_79_Refreshing);
            }
         }
         if ( ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( httpContext.getMessage( "I", ""), "")) == 0 ) || ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( httpContext.getMessage( "D", ""), "")) == 0 ) )
         {
            edtCCTLinPict_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCTLinPict_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLinPict_Enabled), 5, 0), !bGXsfl_79_Refreshing);
         }
         else
         {
            if ( ( GXutil.strcmp(A4048CCTLinTpoI, httpContext.getMessage( httpContext.getMessage( "A", ""), "")) == 0 ) && true /* After */ )
            {
               edtCCTLinPict_Enabled = 0 ;
               httpContext.ajax_rsp_assign_prop("", false, edtCCTLinPict_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLinPict_Enabled), 5, 0), !bGXsfl_79_Refreshing);
            }
            else
            {
               edtCCTLinPict_Enabled = 1 ;
               httpContext.ajax_rsp_assign_prop("", false, edtCCTLinPict_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLinPict_Enabled), 5, 0), !bGXsfl_79_Refreshing);
            }
         }
         if ( ( GXutil.strcmp(A4048CCTLinTpoI, httpContext.getMessage( "A", "")) == 0 ) && true /* After */ )
         {
            A4043CCTLinDsc = A11529CCVDsc ;
         }
         if ( ! ( GXutil.strcmp(A4048CCTLinTpoI, httpContext.getMessage( httpContext.getMessage( "A", ""), "")) == 0 ) && ( AV27TestCC == 0 ) )
         {
            dynCCVCod.setEnabled( 0 );
            httpContext.ajax_rsp_assign_prop("", false, dynCCVCod.getInternalname(), "Enabled", GXutil.ltrimstr( dynCCVCod.getEnabled(), 5, 0), !bGXsfl_79_Refreshing);
         }
         else
         {
            dynCCVCod.setEnabled( 1 );
            httpContext.ajax_rsp_assign_prop("", false, dynCCVCod.getInternalname(), "Enabled", GXutil.ltrimstr( dynCCVCod.getEnabled(), 5, 0), !bGXsfl_79_Refreshing);
         }
      }
   }

   public void loadIA622( )
   {
      /* Using cursor T00IA29 */
      pr_default.execute(27, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin)});
      if ( (pr_default.getStatus(27) != 101) )
      {
         RcdFound622 = (short)(1) ;
         A4045CCTLinLgoD = T00IA29_A4045CCTLinLgoD[0] ;
         A4046CCTLinPict = T00IA29_A4046CCTLinPict[0] ;
         A4048CCTLinTpoI = T00IA29_A4048CCTLinTpoI[0] ;
         A4044CCTLinTpoD = T00IA29_A4044CCTLinTpoD[0] ;
         A4043CCTLinDsc = T00IA29_A4043CCTLinDsc[0] ;
         A4047CCTLinVarW = T00IA29_A4047CCTLinVarW[0] ;
         A4408CCTSta = T00IA29_A4408CCTSta[0] ;
         A11526CCVPict = T00IA29_A11526CCVPict[0] ;
         n11526CCVPict = T00IA29_n11526CCVPict[0] ;
         A11527CCVLgoDat = T00IA29_A11527CCVLgoDat[0] ;
         n11527CCVLgoDat = T00IA29_n11527CCVLgoDat[0] ;
         A11528CCVTpoDat = T00IA29_A11528CCVTpoDat[0] ;
         n11528CCVTpoDat = T00IA29_n11528CCVTpoDat[0] ;
         A11529CCVDsc = T00IA29_A11529CCVDsc[0] ;
         n11529CCVDsc = T00IA29_n11529CCVDsc[0] ;
         A13249CCVNorma = T00IA29_A13249CCVNorma[0] ;
         A13250CCVEspecif = T00IA29_A13250CCVEspecif[0] ;
         A11476CCTLinDscL = T00IA29_A11476CCTLinDscL[0] ;
         A11522CCVCod = T00IA29_A11522CCVCod[0] ;
         zmIA622( -82) ;
      }
      pr_default.close(27);
      onLoadActionsIA622( ) ;
   }

   public void onLoadActionsIA622( )
   {
      if ( ! ( GXutil.strcmp(A4048CCTLinTpoI, httpContext.getMessage( "A", "")) == 0 ) && ( AV27TestCC == 0 ) )
      {
         A11522CCVCod = httpContext.getMessage( "NoAplica", "") ;
      }
      if ( ! ( GXutil.strcmp(A4048CCTLinTpoI, httpContext.getMessage( httpContext.getMessage( "A", ""), "")) == 0 ) && ( AV27TestCC == 0 ) )
      {
         dynCCVCod.setEnabled( 0 );
         httpContext.ajax_rsp_assign_prop("", false, dynCCVCod.getInternalname(), "Enabled", GXutil.ltrimstr( dynCCVCod.getEnabled(), 5, 0), !bGXsfl_79_Refreshing);
      }
      else
      {
         dynCCVCod.setEnabled( 1 );
         httpContext.ajax_rsp_assign_prop("", false, dynCCVCod.getInternalname(), "Enabled", GXutil.ltrimstr( dynCCVCod.getEnabled(), 5, 0), !bGXsfl_79_Refreshing);
      }
      if ( ( ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "I", "")) == 0 ) ) && ( isIns( )  || isUpd( )  ) )
      {
         A4045CCTLinLgoD = (short)(1) ;
      }
      else
      {
         if ( ( GXutil.strcmp(A4048CCTLinTpoI, httpContext.getMessage( "A", "")) == 0 ) && true /* After */ )
         {
            A4045CCTLinLgoD = A11527CCVLgoDat ;
         }
      }
      if ( ( ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "I", "")) == 0 ) ) && ( isIns( )  || isUpd( )  ) )
      {
         A4046CCTLinPict = "9" ;
      }
      else
      {
         if ( ( GXutil.strcmp(A4048CCTLinTpoI, httpContext.getMessage( "A", "")) == 0 ) && true /* After */ )
         {
            A4046CCTLinPict = A11526CCVPict ;
         }
      }
      if ( ( ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "I", "")) == 0 ) ) && ( isIns( )  || isUpd( )  ) )
      {
         A4044CCTLinTpoD = httpContext.getMessage( "N", "") ;
      }
      else
      {
         if ( ( GXutil.strcmp(A4048CCTLinTpoI, httpContext.getMessage( "A", "")) == 0 ) && true /* After */ )
         {
            A4044CCTLinTpoD = A11528CCVTpoDat ;
         }
      }
      if ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( httpContext.getMessage( "D", ""), "")) == 0 )
      {
         edtCCTLinDsc_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCCTLinDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLinDsc_Enabled), 5, 0), !bGXsfl_79_Refreshing);
      }
      else
      {
         if ( ( GXutil.strcmp(A4048CCTLinTpoI, httpContext.getMessage( httpContext.getMessage( "A", ""), "")) == 0 ) && true /* After */ )
         {
            edtCCTLinDsc_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCTLinDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLinDsc_Enabled), 5, 0), !bGXsfl_79_Refreshing);
         }
         else
         {
            edtCCTLinDsc_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCTLinDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLinDsc_Enabled), 5, 0), !bGXsfl_79_Refreshing);
         }
      }
      if ( ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( httpContext.getMessage( "I", ""), "")) == 0 ) || ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( httpContext.getMessage( "D", ""), "")) == 0 ) )
      {
         cmbCCTLinTpoD.setEnabled( 0 );
         httpContext.ajax_rsp_assign_prop("", false, cmbCCTLinTpoD.getInternalname(), "Enabled", GXutil.ltrimstr( cmbCCTLinTpoD.getEnabled(), 5, 0), !bGXsfl_79_Refreshing);
      }
      else
      {
         if ( ( GXutil.strcmp(A4048CCTLinTpoI, httpContext.getMessage( httpContext.getMessage( "A", ""), "")) == 0 ) && true /* After */ )
         {
            cmbCCTLinTpoD.setEnabled( 0 );
            httpContext.ajax_rsp_assign_prop("", false, cmbCCTLinTpoD.getInternalname(), "Enabled", GXutil.ltrimstr( cmbCCTLinTpoD.getEnabled(), 5, 0), !bGXsfl_79_Refreshing);
         }
         else
         {
            cmbCCTLinTpoD.setEnabled( 1 );
            httpContext.ajax_rsp_assign_prop("", false, cmbCCTLinTpoD.getInternalname(), "Enabled", GXutil.ltrimstr( cmbCCTLinTpoD.getEnabled(), 5, 0), !bGXsfl_79_Refreshing);
         }
      }
      if ( ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( httpContext.getMessage( "I", ""), "")) == 0 ) || ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( httpContext.getMessage( "D", ""), "")) == 0 ) )
      {
         edtCCTLinLgoD_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCCTLinLgoD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLinLgoD_Enabled), 5, 0), !bGXsfl_79_Refreshing);
      }
      else
      {
         if ( ( GXutil.strcmp(A4048CCTLinTpoI, httpContext.getMessage( httpContext.getMessage( "A", ""), "")) == 0 ) && true /* After */ )
         {
            edtCCTLinLgoD_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCTLinLgoD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLinLgoD_Enabled), 5, 0), !bGXsfl_79_Refreshing);
         }
         else
         {
            edtCCTLinLgoD_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCTLinLgoD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLinLgoD_Enabled), 5, 0), !bGXsfl_79_Refreshing);
         }
      }
      if ( ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( httpContext.getMessage( "I", ""), "")) == 0 ) || ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( httpContext.getMessage( "D", ""), "")) == 0 ) )
      {
         edtCCTLinPict_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCCTLinPict_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLinPict_Enabled), 5, 0), !bGXsfl_79_Refreshing);
      }
      else
      {
         if ( ( GXutil.strcmp(A4048CCTLinTpoI, httpContext.getMessage( httpContext.getMessage( "A", ""), "")) == 0 ) && true /* After */ )
         {
            edtCCTLinPict_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCTLinPict_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLinPict_Enabled), 5, 0), !bGXsfl_79_Refreshing);
         }
         else
         {
            edtCCTLinPict_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCTLinPict_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLinPict_Enabled), 5, 0), !bGXsfl_79_Refreshing);
         }
      }
      if ( ( GXutil.strcmp(A4048CCTLinTpoI, httpContext.getMessage( "A", "")) == 0 ) && true /* After */ )
      {
         A4043CCTLinDsc = A11529CCVDsc ;
      }
   }

   public void checkExtendedTableIA622( )
   {
      nIsDirty_622 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModalIA622( ) ;
      if ( ! ( GXutil.strcmp(A4048CCTLinTpoI, httpContext.getMessage( "A", "")) == 0 ) && ( AV27TestCC == 0 ) )
      {
         nIsDirty_622 = (short)(1) ;
         A11522CCVCod = httpContext.getMessage( "NoAplica", "") ;
      }
      if ( ! ( GXutil.strcmp(A4048CCTLinTpoI, httpContext.getMessage( httpContext.getMessage( "A", ""), "")) == 0 ) && ( AV27TestCC == 0 ) )
      {
         dynCCVCod.setEnabled( 0 );
         httpContext.ajax_rsp_assign_prop("", false, dynCCVCod.getInternalname(), "Enabled", GXutil.ltrimstr( dynCCVCod.getEnabled(), 5, 0), !bGXsfl_79_Refreshing);
      }
      else
      {
         dynCCVCod.setEnabled( 1 );
         httpContext.ajax_rsp_assign_prop("", false, dynCCVCod.getInternalname(), "Enabled", GXutil.ltrimstr( dynCCVCod.getEnabled(), 5, 0), !bGXsfl_79_Refreshing);
      }
      if ( A4034CCTLin <= 0 )
      {
         GXCCtl = "CCTLIN_" + sGXsfl_79_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Se debe introducir un código", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtCCTLin_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "I", "")) == 0 )
      {
         new app.controlcalidadhtd.pccintval(remoteHandle, context).execute( A396EmprCod, A4031CCTCod, A4034CCTLin) ;
      }
      if ( ( GXutil.strcmp(A4048CCTLinTpoI, "A") == 0 ) && ( GXutil.strcmp(A11522CCVCod, "NoAplica") == 0 ) )
      {
         GXCCtl = "CCTLINTPOI_" + sGXsfl_79_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Debe Seleccionar una variable", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = cmbCCTLinTpoI.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      /* Using cursor T00IA8 */
      pr_default.execute(6, new Object[] {A396EmprCod, A11522CCVCod});
      if ( (pr_default.getStatus(6) == 101) )
      {
         GXCCtl = "CCVCOD_" + sGXsfl_79_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Variables Automáticas", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = dynCCVCod.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A11526CCVPict = T00IA8_A11526CCVPict[0] ;
      n11526CCVPict = T00IA8_n11526CCVPict[0] ;
      A11527CCVLgoDat = T00IA8_A11527CCVLgoDat[0] ;
      n11527CCVLgoDat = T00IA8_n11527CCVLgoDat[0] ;
      A11528CCVTpoDat = T00IA8_A11528CCVTpoDat[0] ;
      n11528CCVTpoDat = T00IA8_n11528CCVTpoDat[0] ;
      A11529CCVDsc = T00IA8_A11529CCVDsc[0] ;
      n11529CCVDsc = T00IA8_n11529CCVDsc[0] ;
      pr_default.close(6);
      if ( ( ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "I", "")) == 0 ) ) && ( isIns( )  || isUpd( )  ) )
      {
         nIsDirty_622 = (short)(1) ;
         A4045CCTLinLgoD = (short)(1) ;
      }
      else
      {
         if ( ( GXutil.strcmp(A4048CCTLinTpoI, httpContext.getMessage( "A", "")) == 0 ) && true /* After */ )
         {
            nIsDirty_622 = (short)(1) ;
            A4045CCTLinLgoD = A11527CCVLgoDat ;
         }
      }
      if ( ( ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "I", "")) == 0 ) ) && ( isIns( )  || isUpd( )  ) )
      {
         nIsDirty_622 = (short)(1) ;
         A4046CCTLinPict = "9" ;
      }
      else
      {
         if ( ( GXutil.strcmp(A4048CCTLinTpoI, httpContext.getMessage( "A", "")) == 0 ) && true /* After */ )
         {
            nIsDirty_622 = (short)(1) ;
            A4046CCTLinPict = A11526CCVPict ;
         }
      }
      if ( ( ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "I", "")) == 0 ) ) && ( isIns( )  || isUpd( )  ) )
      {
         nIsDirty_622 = (short)(1) ;
         A4044CCTLinTpoD = httpContext.getMessage( "N", "") ;
      }
      else
      {
         if ( ( GXutil.strcmp(A4048CCTLinTpoI, httpContext.getMessage( "A", "")) == 0 ) && true /* After */ )
         {
            nIsDirty_622 = (short)(1) ;
            A4044CCTLinTpoD = A11528CCVTpoDat ;
         }
      }
      if ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( httpContext.getMessage( "D", ""), "")) == 0 )
      {
         edtCCTLinDsc_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCCTLinDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLinDsc_Enabled), 5, 0), !bGXsfl_79_Refreshing);
      }
      else
      {
         if ( ( GXutil.strcmp(A4048CCTLinTpoI, httpContext.getMessage( httpContext.getMessage( "A", ""), "")) == 0 ) && true /* After */ )
         {
            edtCCTLinDsc_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCTLinDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLinDsc_Enabled), 5, 0), !bGXsfl_79_Refreshing);
         }
         else
         {
            edtCCTLinDsc_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCTLinDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLinDsc_Enabled), 5, 0), !bGXsfl_79_Refreshing);
         }
      }
      if ( ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( httpContext.getMessage( "I", ""), "")) == 0 ) || ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( httpContext.getMessage( "D", ""), "")) == 0 ) )
      {
         cmbCCTLinTpoD.setEnabled( 0 );
         httpContext.ajax_rsp_assign_prop("", false, cmbCCTLinTpoD.getInternalname(), "Enabled", GXutil.ltrimstr( cmbCCTLinTpoD.getEnabled(), 5, 0), !bGXsfl_79_Refreshing);
      }
      else
      {
         if ( ( GXutil.strcmp(A4048CCTLinTpoI, httpContext.getMessage( httpContext.getMessage( "A", ""), "")) == 0 ) && true /* After */ )
         {
            cmbCCTLinTpoD.setEnabled( 0 );
            httpContext.ajax_rsp_assign_prop("", false, cmbCCTLinTpoD.getInternalname(), "Enabled", GXutil.ltrimstr( cmbCCTLinTpoD.getEnabled(), 5, 0), !bGXsfl_79_Refreshing);
         }
         else
         {
            cmbCCTLinTpoD.setEnabled( 1 );
            httpContext.ajax_rsp_assign_prop("", false, cmbCCTLinTpoD.getInternalname(), "Enabled", GXutil.ltrimstr( cmbCCTLinTpoD.getEnabled(), 5, 0), !bGXsfl_79_Refreshing);
         }
      }
      if ( ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( httpContext.getMessage( "I", ""), "")) == 0 ) || ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( httpContext.getMessage( "D", ""), "")) == 0 ) )
      {
         edtCCTLinLgoD_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCCTLinLgoD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLinLgoD_Enabled), 5, 0), !bGXsfl_79_Refreshing);
      }
      else
      {
         if ( ( GXutil.strcmp(A4048CCTLinTpoI, httpContext.getMessage( httpContext.getMessage( "A", ""), "")) == 0 ) && true /* After */ )
         {
            edtCCTLinLgoD_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCTLinLgoD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLinLgoD_Enabled), 5, 0), !bGXsfl_79_Refreshing);
         }
         else
         {
            edtCCTLinLgoD_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCTLinLgoD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLinLgoD_Enabled), 5, 0), !bGXsfl_79_Refreshing);
         }
      }
      if ( ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( httpContext.getMessage( "I", ""), "")) == 0 ) || ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( httpContext.getMessage( "D", ""), "")) == 0 ) )
      {
         edtCCTLinPict_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCCTLinPict_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLinPict_Enabled), 5, 0), !bGXsfl_79_Refreshing);
      }
      else
      {
         if ( ( GXutil.strcmp(A4048CCTLinTpoI, httpContext.getMessage( httpContext.getMessage( "A", ""), "")) == 0 ) && true /* After */ )
         {
            edtCCTLinPict_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCTLinPict_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLinPict_Enabled), 5, 0), !bGXsfl_79_Refreshing);
         }
         else
         {
            edtCCTLinPict_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCTLinPict_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLinPict_Enabled), 5, 0), !bGXsfl_79_Refreshing);
         }
      }
      if ( ( GXutil.strcmp(A4048CCTLinTpoI, httpContext.getMessage( "A", "")) == 0 ) && true /* After */ )
      {
         nIsDirty_622 = (short)(1) ;
         A4043CCTLinDsc = A11529CCVDsc ;
      }
      if ( (GXutil.strcmp("", A4043CCTLinDsc)==0) && ( GXutil.strcmp(A4037CCTTpoCtr, "D") != 0 ) )
      {
         GXCCtl = "CCTLINDSC_" + sGXsfl_79_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Ingresar Numero de Línea = 1 a 2", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtCCTLinDsc_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursorsIA622( )
   {
      pr_default.close(6);
   }

   public void enableDisableIA622( )
   {
   }

   public void gxload_83( String A396EmprCod ,
                          String A11522CCVCod )
   {
      /* Using cursor T00IA30 */
      pr_default.execute(28, new Object[] {A396EmprCod, A11522CCVCod});
      if ( (pr_default.getStatus(28) == 101) )
      {
         GXCCtl = "CCVCOD_" + sGXsfl_79_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Variables Automáticas", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = dynCCVCod.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A11526CCVPict = T00IA30_A11526CCVPict[0] ;
      n11526CCVPict = T00IA30_n11526CCVPict[0] ;
      A11527CCVLgoDat = T00IA30_A11527CCVLgoDat[0] ;
      n11527CCVLgoDat = T00IA30_n11527CCVLgoDat[0] ;
      A11528CCVTpoDat = T00IA30_A11528CCVTpoDat[0] ;
      n11528CCVTpoDat = T00IA30_n11528CCVTpoDat[0] ;
      A11529CCVDsc = T00IA30_A11529CCVDsc[0] ;
      n11529CCVDsc = T00IA30_n11529CCVDsc[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A11526CCVPict))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A11527CCVLgoDat, (byte)(3), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A11528CCVTpoDat))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A11529CCVDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(28) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(28);
   }

   public void getKeyIA622( )
   {
      /* Using cursor T00IA31 */
      pr_default.execute(29, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin)});
      if ( (pr_default.getStatus(29) != 101) )
      {
         RcdFound622 = (short)(1) ;
      }
      else
      {
         RcdFound622 = (short)(0) ;
      }
      pr_default.close(29);
   }

   public void getByPrimaryKeyIA622( )
   {
      /* Using cursor T00IA7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         zmIA622( 82) ;
         RcdFound622 = (short)(1) ;
         initializeNonKeyIA622( ) ;
         A4034CCTLin = T00IA7_A4034CCTLin[0] ;
         A4045CCTLinLgoD = T00IA7_A4045CCTLinLgoD[0] ;
         A4046CCTLinPict = T00IA7_A4046CCTLinPict[0] ;
         A4048CCTLinTpoI = T00IA7_A4048CCTLinTpoI[0] ;
         A4044CCTLinTpoD = T00IA7_A4044CCTLinTpoD[0] ;
         A4043CCTLinDsc = T00IA7_A4043CCTLinDsc[0] ;
         A4047CCTLinVarW = T00IA7_A4047CCTLinVarW[0] ;
         A4408CCTSta = T00IA7_A4408CCTSta[0] ;
         A13249CCVNorma = T00IA7_A13249CCVNorma[0] ;
         A13250CCVEspecif = T00IA7_A13250CCVEspecif[0] ;
         A11476CCTLinDscL = T00IA7_A11476CCTLinDscL[0] ;
         A11522CCVCod = T00IA7_A11522CCVCod[0] ;
         Z396EmprCod = A396EmprCod ;
         Z4031CCTCod = A4031CCTCod ;
         Z4034CCTLin = A4034CCTLin ;
         sMode622 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         loadIA622( ) ;
         Gx_mode = sMode622 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound622 = (short)(0) ;
         initializeNonKeyIA622( ) ;
         sMode622 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModalIA622( ) ;
         Gx_mode = sMode622 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributesIA622( ) ;
      }
      pr_default.close(5);
   }

   public void checkOptimisticConcurrencyIA622( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00IA6 */
         pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin)});
         if ( (pr_default.getStatus(4) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCCDef1"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(4) == 101) || ( Z4045CCTLinLgoD != T00IA6_A4045CCTLinLgoD[0] ) || ( GXutil.strcmp(Z4046CCTLinPict, T00IA6_A4046CCTLinPict[0]) != 0 ) || ( GXutil.strcmp(Z4048CCTLinTpoI, T00IA6_A4048CCTLinTpoI[0]) != 0 ) || ( GXutil.strcmp(Z4044CCTLinTpoD, T00IA6_A4044CCTLinTpoD[0]) != 0 ) || ( GXutil.strcmp(Z4043CCTLinDsc, T00IA6_A4043CCTLinDsc[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z4047CCTLinVarW, T00IA6_A4047CCTLinVarW[0]) != 0 ) || ( GXutil.strcmp(Z4408CCTSta, T00IA6_A4408CCTSta[0]) != 0 ) || ( GXutil.strcmp(Z13249CCVNorma, T00IA6_A13249CCVNorma[0]) != 0 ) || ( GXutil.strcmp(Z13250CCVEspecif, T00IA6_A13250CCVEspecif[0]) != 0 ) || ( GXutil.strcmp(Z11476CCTLinDscL, T00IA6_A11476CCTLinDscL[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z11522CCVCod, T00IA6_A11522CCVCod[0]) != 0 ) )
         {
            if ( Z4045CCTLinLgoD != T00IA6_A4045CCTLinLgoD[0] )
            {
               GXutil.writeLogln("controlcalidadhtd.tccdef:[seudo value changed for attri]"+"CCTLinLgoD");
               GXutil.writeLogRaw("Old: ",Z4045CCTLinLgoD);
               GXutil.writeLogRaw("Current: ",T00IA6_A4045CCTLinLgoD[0]);
            }
            if ( GXutil.strcmp(Z4046CCTLinPict, T00IA6_A4046CCTLinPict[0]) != 0 )
            {
               GXutil.writeLogln("controlcalidadhtd.tccdef:[seudo value changed for attri]"+"CCTLinPict");
               GXutil.writeLogRaw("Old: ",Z4046CCTLinPict);
               GXutil.writeLogRaw("Current: ",T00IA6_A4046CCTLinPict[0]);
            }
            if ( GXutil.strcmp(Z4048CCTLinTpoI, T00IA6_A4048CCTLinTpoI[0]) != 0 )
            {
               GXutil.writeLogln("controlcalidadhtd.tccdef:[seudo value changed for attri]"+"CCTLinTpoI");
               GXutil.writeLogRaw("Old: ",Z4048CCTLinTpoI);
               GXutil.writeLogRaw("Current: ",T00IA6_A4048CCTLinTpoI[0]);
            }
            if ( GXutil.strcmp(Z4044CCTLinTpoD, T00IA6_A4044CCTLinTpoD[0]) != 0 )
            {
               GXutil.writeLogln("controlcalidadhtd.tccdef:[seudo value changed for attri]"+"CCTLinTpoD");
               GXutil.writeLogRaw("Old: ",Z4044CCTLinTpoD);
               GXutil.writeLogRaw("Current: ",T00IA6_A4044CCTLinTpoD[0]);
            }
            if ( GXutil.strcmp(Z4043CCTLinDsc, T00IA6_A4043CCTLinDsc[0]) != 0 )
            {
               GXutil.writeLogln("controlcalidadhtd.tccdef:[seudo value changed for attri]"+"CCTLinDsc");
               GXutil.writeLogRaw("Old: ",Z4043CCTLinDsc);
               GXutil.writeLogRaw("Current: ",T00IA6_A4043CCTLinDsc[0]);
            }
            if ( GXutil.strcmp(Z4047CCTLinVarW, T00IA6_A4047CCTLinVarW[0]) != 0 )
            {
               GXutil.writeLogln("controlcalidadhtd.tccdef:[seudo value changed for attri]"+"CCTLinVarW");
               GXutil.writeLogRaw("Old: ",Z4047CCTLinVarW);
               GXutil.writeLogRaw("Current: ",T00IA6_A4047CCTLinVarW[0]);
            }
            if ( GXutil.strcmp(Z4408CCTSta, T00IA6_A4408CCTSta[0]) != 0 )
            {
               GXutil.writeLogln("controlcalidadhtd.tccdef:[seudo value changed for attri]"+"CCTSta");
               GXutil.writeLogRaw("Old: ",Z4408CCTSta);
               GXutil.writeLogRaw("Current: ",T00IA6_A4408CCTSta[0]);
            }
            if ( GXutil.strcmp(Z13249CCVNorma, T00IA6_A13249CCVNorma[0]) != 0 )
            {
               GXutil.writeLogln("controlcalidadhtd.tccdef:[seudo value changed for attri]"+"CCVNorma");
               GXutil.writeLogRaw("Old: ",Z13249CCVNorma);
               GXutil.writeLogRaw("Current: ",T00IA6_A13249CCVNorma[0]);
            }
            if ( GXutil.strcmp(Z13250CCVEspecif, T00IA6_A13250CCVEspecif[0]) != 0 )
            {
               GXutil.writeLogln("controlcalidadhtd.tccdef:[seudo value changed for attri]"+"CCVEspecif");
               GXutil.writeLogRaw("Old: ",Z13250CCVEspecif);
               GXutil.writeLogRaw("Current: ",T00IA6_A13250CCVEspecif[0]);
            }
            if ( GXutil.strcmp(Z11476CCTLinDscL, T00IA6_A11476CCTLinDscL[0]) != 0 )
            {
               GXutil.writeLogln("controlcalidadhtd.tccdef:[seudo value changed for attri]"+"CCTLinDscL");
               GXutil.writeLogRaw("Old: ",Z11476CCTLinDscL);
               GXutil.writeLogRaw("Current: ",T00IA6_A11476CCTLinDscL[0]);
            }
            if ( GXutil.strcmp(Z11522CCVCod, T00IA6_A11522CCVCod[0]) != 0 )
            {
               GXutil.writeLogln("controlcalidadhtd.tccdef:[seudo value changed for attri]"+"CCVCod");
               GXutil.writeLogRaw("Old: ",Z11522CCVCod);
               GXutil.writeLogRaw("Current: ",T00IA6_A11522CCVCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCCDef1"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertIA622( )
   {
      beforeValidateIA622( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableIA622( ) ;
      }
      if ( AnyError == 0 )
      {
         zmIA622( 0) ;
         checkOptimisticConcurrencyIA622( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmIA622( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertIA622( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00IA32 */
                  pr_default.execute(30, new Object[] {Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin), Short.valueOf(A4045CCTLinLgoD), A4046CCTLinPict, A4048CCTLinTpoI, A4044CCTLinTpoD, A4043CCTLinDsc, A4047CCTLinVarW, A4408CCTSta, A13249CCVNorma, A13250CCVEspecif, A11476CCTLinDscL, A396EmprCod, A11522CCVCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCDef1");
                  if ( (pr_default.getStatus(30) == 1) )
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
                        processLevelIA622( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
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
         else
         {
            loadIA622( ) ;
         }
         endLevelIA622( ) ;
      }
      closeExtendedTableCursorsIA622( ) ;
   }

   public void updateIA622( )
   {
      beforeValidateIA622( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableIA622( ) ;
      }
      if ( ( nIsMod_622 != 0 ) || ( nIsDirty_622 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrencyIA622( ) ;
            if ( AnyError == 0 )
            {
               afterConfirmIA622( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdateIA622( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T00IA33 */
                     pr_default.execute(31, new Object[] {Short.valueOf(A4045CCTLinLgoD), A4046CCTLinPict, A4048CCTLinTpoI, A4044CCTLinTpoD, A4043CCTLinDsc, A4047CCTLinVarW, A4408CCTSta, A13249CCVNorma, A13250CCVEspecif, A11476CCTLinDscL, A11522CCVCod, A396EmprCod, Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCDef1");
                     if ( (pr_default.getStatus(31) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCCDef1"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdateIA622( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           processLevelIA622( ) ;
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
                     }
                     else
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_unexp"), 1, "");
                        AnyError = (short)(1) ;
                     }
                  }
               }
            }
            endLevelIA622( ) ;
         }
      }
      closeExtendedTableCursorsIA622( ) ;
   }

   public void deferredUpdateIA622( )
   {
   }

   public void deleteIA622( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidateIA622( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyIA622( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsIA622( ) ;
         afterConfirmIA622( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteIA622( ) ;
            if ( AnyError == 0 )
            {
               scanStartIA623( ) ;
               while ( RcdFound623 != 0 )
               {
                  getByPrimaryKeyIA623( ) ;
                  deleteIA623( ) ;
                  scanNextIA623( ) ;
               }
               scanEndIA623( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00IA34 */
                  pr_default.execute(32, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCDef1");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_unexp"), 1, "");
                     AnyError = (short)(1) ;
                  }
               }
            }
         }
      }
      sMode622 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelIA622( ) ;
      Gx_mode = sMode622 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsIA622( )
   {
      standaloneModalIA622( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         if ( ! ( GXutil.strcmp(A4048CCTLinTpoI, httpContext.getMessage( httpContext.getMessage( "A", ""), "")) == 0 ) && ( AV27TestCC == 0 ) )
         {
            dynCCVCod.setEnabled( 0 );
            httpContext.ajax_rsp_assign_prop("", false, dynCCVCod.getInternalname(), "Enabled", GXutil.ltrimstr( dynCCVCod.getEnabled(), 5, 0), !bGXsfl_79_Refreshing);
         }
         else
         {
            dynCCVCod.setEnabled( 1 );
            httpContext.ajax_rsp_assign_prop("", false, dynCCVCod.getInternalname(), "Enabled", GXutil.ltrimstr( dynCCVCod.getEnabled(), 5, 0), !bGXsfl_79_Refreshing);
         }
         /* Using cursor T00IA35 */
         pr_default.execute(33, new Object[] {A396EmprCod, A11522CCVCod});
         A11526CCVPict = T00IA35_A11526CCVPict[0] ;
         n11526CCVPict = T00IA35_n11526CCVPict[0] ;
         A11527CCVLgoDat = T00IA35_A11527CCVLgoDat[0] ;
         n11527CCVLgoDat = T00IA35_n11527CCVLgoDat[0] ;
         A11528CCVTpoDat = T00IA35_A11528CCVTpoDat[0] ;
         n11528CCVTpoDat = T00IA35_n11528CCVTpoDat[0] ;
         A11529CCVDsc = T00IA35_A11529CCVDsc[0] ;
         n11529CCVDsc = T00IA35_n11529CCVDsc[0] ;
         pr_default.close(33);
         if ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( httpContext.getMessage( "D", ""), "")) == 0 )
         {
            edtCCTLinDsc_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCTLinDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLinDsc_Enabled), 5, 0), !bGXsfl_79_Refreshing);
         }
         else
         {
            if ( ( GXutil.strcmp(A4048CCTLinTpoI, httpContext.getMessage( httpContext.getMessage( "A", ""), "")) == 0 ) && true /* After */ )
            {
               edtCCTLinDsc_Enabled = 0 ;
               httpContext.ajax_rsp_assign_prop("", false, edtCCTLinDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLinDsc_Enabled), 5, 0), !bGXsfl_79_Refreshing);
            }
            else
            {
               edtCCTLinDsc_Enabled = 1 ;
               httpContext.ajax_rsp_assign_prop("", false, edtCCTLinDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLinDsc_Enabled), 5, 0), !bGXsfl_79_Refreshing);
            }
         }
         if ( ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( httpContext.getMessage( "I", ""), "")) == 0 ) || ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( httpContext.getMessage( "D", ""), "")) == 0 ) )
         {
            cmbCCTLinTpoD.setEnabled( 0 );
            httpContext.ajax_rsp_assign_prop("", false, cmbCCTLinTpoD.getInternalname(), "Enabled", GXutil.ltrimstr( cmbCCTLinTpoD.getEnabled(), 5, 0), !bGXsfl_79_Refreshing);
         }
         else
         {
            if ( ( GXutil.strcmp(A4048CCTLinTpoI, httpContext.getMessage( httpContext.getMessage( "A", ""), "")) == 0 ) && true /* After */ )
            {
               cmbCCTLinTpoD.setEnabled( 0 );
               httpContext.ajax_rsp_assign_prop("", false, cmbCCTLinTpoD.getInternalname(), "Enabled", GXutil.ltrimstr( cmbCCTLinTpoD.getEnabled(), 5, 0), !bGXsfl_79_Refreshing);
            }
            else
            {
               cmbCCTLinTpoD.setEnabled( 1 );
               httpContext.ajax_rsp_assign_prop("", false, cmbCCTLinTpoD.getInternalname(), "Enabled", GXutil.ltrimstr( cmbCCTLinTpoD.getEnabled(), 5, 0), !bGXsfl_79_Refreshing);
            }
         }
         if ( ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( httpContext.getMessage( "I", ""), "")) == 0 ) || ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( httpContext.getMessage( "D", ""), "")) == 0 ) )
         {
            edtCCTLinLgoD_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCTLinLgoD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLinLgoD_Enabled), 5, 0), !bGXsfl_79_Refreshing);
         }
         else
         {
            if ( ( GXutil.strcmp(A4048CCTLinTpoI, httpContext.getMessage( httpContext.getMessage( "A", ""), "")) == 0 ) && true /* After */ )
            {
               edtCCTLinLgoD_Enabled = 0 ;
               httpContext.ajax_rsp_assign_prop("", false, edtCCTLinLgoD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLinLgoD_Enabled), 5, 0), !bGXsfl_79_Refreshing);
            }
            else
            {
               edtCCTLinLgoD_Enabled = 1 ;
               httpContext.ajax_rsp_assign_prop("", false, edtCCTLinLgoD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLinLgoD_Enabled), 5, 0), !bGXsfl_79_Refreshing);
            }
         }
         if ( ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( httpContext.getMessage( "I", ""), "")) == 0 ) || ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( httpContext.getMessage( "D", ""), "")) == 0 ) )
         {
            edtCCTLinPict_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCTLinPict_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLinPict_Enabled), 5, 0), !bGXsfl_79_Refreshing);
         }
         else
         {
            if ( ( GXutil.strcmp(A4048CCTLinTpoI, httpContext.getMessage( httpContext.getMessage( "A", ""), "")) == 0 ) && true /* After */ )
            {
               edtCCTLinPict_Enabled = 0 ;
               httpContext.ajax_rsp_assign_prop("", false, edtCCTLinPict_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLinPict_Enabled), 5, 0), !bGXsfl_79_Refreshing);
            }
            else
            {
               edtCCTLinPict_Enabled = 1 ;
               httpContext.ajax_rsp_assign_prop("", false, edtCCTLinPict_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLinPict_Enabled), 5, 0), !bGXsfl_79_Refreshing);
            }
         }
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T00IA36 */
         pr_default.execute(34, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin)});
         if ( (pr_default.getStatus(34) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Valores Estandars", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(34);
         /* Using cursor T00IA37 */
         pr_default.execute(35, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin)});
         if ( (pr_default.getStatus(35) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CCSta", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(35);
         /* Using cursor T00IA38 */
         pr_default.execute(36, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin)});
         if ( (pr_default.getStatus(36) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CC1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(36);
      }
   }

   public void processNestedLevelIA623( )
   {
      nGXsfl_154_idx = 0 ;
      while ( nGXsfl_154_idx < nRC_GXsfl_154 )
      {
         readRowIA623( ) ;
         if ( ( nRcdExists_623 != 0 ) || ( nIsMod_623 != 0 ) )
         {
            standaloneNotModalIA623( ) ;
            getKeyIA623( ) ;
            if ( ( nRcdExists_623 == 0 ) && ( nRcdDeleted_623 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insertIA623( ) ;
            }
            else
            {
               if ( RcdFound623 != 0 )
               {
                  if ( ( nRcdDeleted_623 != 0 ) && ( nRcdExists_623 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     deleteIA623( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_623 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        updateIA623( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_623 == 0 )
                  {
                     GXCCtl = "CCTLIN_" + sGXsfl_79_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtCCTLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtCCTValLin_Internalname, GXutil.ltrim( localUtil.ntoc( A4049CCTValLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCCTValDsc_Internalname, GXutil.rtrim( A4050CCTValDsc)) ;
         httpContext.changePostValue( edtCCTVal_Internalname, GXutil.rtrim( A4051CCTVal)) ;
         httpContext.changePostValue( "ZT_"+"Z4049CCTValLin_"+sGXsfl_154_idx, GXutil.ltrim( localUtil.ntoc( Z4049CCTValLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4050CCTValDsc_"+sGXsfl_154_idx, GXutil.rtrim( Z4050CCTValDsc)) ;
         httpContext.changePostValue( "ZT_"+"Z4051CCTVal_"+sGXsfl_154_idx, GXutil.rtrim( Z4051CCTVal)) ;
         httpContext.changePostValue( "nRcdDeleted_623_"+sGXsfl_154_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_623, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_623_"+sGXsfl_154_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_623, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_623_"+sGXsfl_154_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_623, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "N4049CCTValLin_"+sGXsfl_154_idx, GXutil.ltrim( localUtil.ntoc( A4049CCTValLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "N4050CCTValDsc_"+sGXsfl_154_idx, GXutil.rtrim( A4050CCTValDsc)) ;
         httpContext.changePostValue( "N4051CCTVal_"+sGXsfl_154_idx, GXutil.rtrim( A4051CCTVal)) ;
         if ( nIsMod_623 != 0 )
         {
            httpContext.changePostValue( "CCTVALLIN_"+sGXsfl_154_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCTValLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CCTVALDSC_"+sGXsfl_154_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCTValDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CCTVAL_"+sGXsfl_154_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCTVal_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAllIA623( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_623 = (short)(0) ;
      nIsMod_623 = (short)(0) ;
      nRcdDeleted_623 = (short)(0) ;
   }

   public void processLevelIA622( )
   {
      /* Save parent mode. */
      sMode622 = Gx_mode ;
      processNestedLevelIA623( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode622 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevelIA622( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(4);
      }
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStartIA622( )
   {
      /* Scan By routine */
      /* Using cursor T00IA39 */
      pr_default.execute(37, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod)});
      RcdFound622 = (short)(0) ;
      if ( (pr_default.getStatus(37) != 101) )
      {
         RcdFound622 = (short)(1) ;
         A4034CCTLin = T00IA39_A4034CCTLin[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNextIA622( )
   {
      /* Scan next routine */
      pr_default.readNext(37);
      RcdFound622 = (short)(0) ;
      if ( (pr_default.getStatus(37) != 101) )
      {
         RcdFound622 = (short)(1) ;
         A4034CCTLin = T00IA39_A4034CCTLin[0] ;
      }
   }

   public void scanEndIA622( )
   {
      pr_default.close(37);
   }

   public void afterConfirmIA622( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsertIA622( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateIA622( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteIA622( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteIA622( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateIA622( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesIA622( )
   {
      edtCCTLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCTLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLin_Enabled), 5, 0), !bGXsfl_79_Refreshing);
      cmbCCTLinTpoI.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbCCTLinTpoI.getInternalname(), "Enabled", GXutil.ltrimstr( cmbCCTLinTpoI.getEnabled(), 5, 0), !bGXsfl_79_Refreshing);
      dynCCVCod.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, dynCCVCod.getInternalname(), "Enabled", GXutil.ltrimstr( dynCCVCod.getEnabled(), 5, 0), !bGXsfl_79_Refreshing);
      cmbCCTLinTpoD.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbCCTLinTpoD.getInternalname(), "Enabled", GXutil.ltrimstr( cmbCCTLinTpoD.getEnabled(), 5, 0), !bGXsfl_79_Refreshing);
      edtCCTLinDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCTLinDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLinDsc_Enabled), 5, 0), !bGXsfl_79_Refreshing);
      edtCCTLinVarW_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCTLinVarW_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLinVarW_Enabled), 5, 0), !bGXsfl_79_Refreshing);
      edtCCTLinLgoD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCTLinLgoD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLinLgoD_Enabled), 5, 0), !bGXsfl_79_Refreshing);
      edtCCTLinPict_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCTLinPict_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLinPict_Enabled), 5, 0), !bGXsfl_79_Refreshing);
      edtCCTSta_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCTSta_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTSta_Enabled), 5, 0), !bGXsfl_79_Refreshing);
      edtCCVNorma_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCVNorma_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCVNorma_Enabled), 5, 0), !bGXsfl_79_Refreshing);
      edtCCVEspecif_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCVEspecif_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCVEspecif_Enabled), 5, 0), !bGXsfl_79_Refreshing);
      edtCCTLinDscL_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCTLinDscL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLinDscL_Enabled), 5, 0), !bGXsfl_79_Refreshing);
      edtCCVPict_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCVPict_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCVPict_Enabled), 5, 0), !bGXsfl_79_Refreshing);
      edtCCVTpoDat_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCVTpoDat_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCVTpoDat_Enabled), 5, 0), !bGXsfl_79_Refreshing);
      edtCCVDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCVDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCVDsc_Enabled), 5, 0), !bGXsfl_79_Refreshing);
   }

   public void zmIA623( int GX_JID )
   {
      if ( ( GX_JID == 84 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z4050CCTValDsc = T00IA5_A4050CCTValDsc[0] ;
            Z4051CCTVal = T00IA5_A4051CCTVal[0] ;
         }
         else
         {
            Z4050CCTValDsc = A4050CCTValDsc ;
            Z4051CCTVal = A4051CCTVal ;
         }
      }
      if ( GX_JID == -84 )
      {
         Z396EmprCod = A396EmprCod ;
         Z4031CCTCod = A4031CCTCod ;
         Z4034CCTLin = A4034CCTLin ;
         Z4049CCTValLin = A4049CCTValLin ;
         Z4050CCTValDsc = A4050CCTValDsc ;
         Z4051CCTVal = A4051CCTVal ;
      }
   }

   public void standaloneNotModalIA623( )
   {
      if ( (0==A4049CCTValLin) && true /* After */ && ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "E", "")) == 0 ) )
      {
         GXCCtl = "CCTLIN_" + sGXsfl_79_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Se deve introducir numero de linea", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtCCTLin_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "D", "")) == 0 )
      {
         A4049CCTValLin = (byte)(1) ;
      }
      if ( ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( httpContext.getMessage( "I", ""), "")) == 0 ) || ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( httpContext.getMessage( "D", ""), "")) == 0 ) )
      {
         edtCCTValLin_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCCTValLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTValLin_Enabled), 5, 0), !bGXsfl_154_Refreshing);
      }
      else
      {
         edtCCTValLin_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCCTValLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTValLin_Enabled), 5, 0), !bGXsfl_154_Refreshing);
      }
      if ( ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( httpContext.getMessage( "I", ""), "")) == 0 ) || ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( httpContext.getMessage( "D", ""), "")) == 0 ) )
      {
         edtCCTVal_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCCTVal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTVal_Enabled), 5, 0), !bGXsfl_154_Refreshing);
      }
      else
      {
         edtCCTVal_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCCTVal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTVal_Enabled), 5, 0), !bGXsfl_154_Refreshing);
      }
      if ( ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( httpContext.getMessage( "I", ""), "")) == 0 ) || ( GXutil.strcmp(A4048CCTLinTpoI, httpContext.getMessage( httpContext.getMessage( "R", ""), "")) == 0 ) || ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( httpContext.getMessage( "D", ""), "")) == 0 ) )
      {
         edtCCTValDsc_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCCTValDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTValDsc_Enabled), 5, 0), !bGXsfl_154_Refreshing);
      }
      else
      {
         edtCCTValDsc_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCCTValDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTValDsc_Enabled), 5, 0), !bGXsfl_154_Refreshing);
      }
   }

   public void standaloneModalIA623( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtCCTValLin_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCCTValLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTValLin_Enabled), 5, 0), !bGXsfl_154_Refreshing);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ( Gx_BScreen == 0 ) )
      {
         if ( ( GXutil.strcmp(A4048CCTLinTpoI, httpContext.getMessage( "R", "")) == 0 ) && ( A4049CCTValLin == 1 ) )
         {
            A4050CCTValDsc = httpContext.getMessage( httpContext.getMessage( "Minimo", ""), "") ;
         }
         else
         {
            if ( ( GXutil.strcmp(A4048CCTLinTpoI, httpContext.getMessage( "R", "")) == 0 ) && ( A4049CCTValLin == 2 ) )
            {
               A4050CCTValDsc = httpContext.getMessage( httpContext.getMessage( "Maximo", ""), "") ;
            }
         }
      }
   }

   public void loadIA623( )
   {
      /* Using cursor T00IA40 */
      pr_default.execute(38, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin), Byte.valueOf(A4049CCTValLin)});
      if ( (pr_default.getStatus(38) != 101) )
      {
         RcdFound623 = (short)(1) ;
         A4050CCTValDsc = T00IA40_A4050CCTValDsc[0] ;
         A4051CCTVal = T00IA40_A4051CCTVal[0] ;
         zmIA623( -84) ;
      }
      pr_default.close(38);
      onLoadActionsIA623( ) ;
   }

   public void onLoadActionsIA623( )
   {
      if ( ( GXutil.strcmp(A4048CCTLinTpoI, httpContext.getMessage( "R", "")) == 0 ) && ( A4049CCTValLin == 1 ) )
      {
         A4050CCTValDsc = httpContext.getMessage( httpContext.getMessage( "Minimo", ""), "") ;
      }
      else
      {
         if ( ( GXutil.strcmp(A4048CCTLinTpoI, httpContext.getMessage( "R", "")) == 0 ) && ( A4049CCTValLin == 2 ) )
         {
            A4050CCTValDsc = httpContext.getMessage( httpContext.getMessage( "Maximo", ""), "") ;
         }
      }
   }

   public void checkExtendedTableIA623( )
   {
      nIsDirty_623 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModalIA623( ) ;
      if ( ( GXutil.strcmp(A4048CCTLinTpoI, httpContext.getMessage( "R", "")) == 0 ) && ( A4049CCTValLin == 1 ) )
      {
         nIsDirty_623 = (short)(1) ;
         A4050CCTValDsc = httpContext.getMessage( httpContext.getMessage( "Minimo", ""), "") ;
      }
      else
      {
         if ( ( GXutil.strcmp(A4048CCTLinTpoI, httpContext.getMessage( "R", "")) == 0 ) && ( A4049CCTValLin == 2 ) )
         {
            nIsDirty_623 = (short)(1) ;
            A4050CCTValDsc = httpContext.getMessage( httpContext.getMessage( "Maximo", ""), "") ;
         }
      }
      if ( ( GXutil.strcmp(A4048CCTLinTpoI, "R") == 0 ) && ( ( A4049CCTValLin < 1 ) || ( A4049CCTValLin > 2 ) ) )
      {
         GXCCtl = "CCTLINTPOI_" + sGXsfl_79_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Valor Rango 1. Minimo/2.Maximo", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = cmbCCTLinTpoI.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( (GXutil.strcmp("", A4050CCTValDsc)==0) && ( GXutil.strcmp(A4037CCTTpoCtr, "E") == 0 ) && ( GXutil.strcmp(A4048CCTLinTpoI, "L") == 0 ) && ( A4049CCTValLin > 0 ) )
      {
         GXCCtl = "CCTLINTPOI_" + sGXsfl_79_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Ingresar Numero de Línea = 1 a 2", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = cmbCCTLinTpoI.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( (GXutil.strcmp("", A4050CCTValDsc)==0) && ( GXutil.strcmp(A4037CCTTpoCtr, "E") == 0 ) && ( GXutil.strcmp(A4048CCTLinTpoI, "R") == 0 ) && true /* After */ )
      {
         GXCCtl = "CCTVALLIN_" + sGXsfl_154_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Ingresar Numero de Línea = 1 a 2", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtCCTValLin_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursorsIA623( )
   {
   }

   public void enableDisableIA623( )
   {
   }

   public void getKeyIA623( )
   {
      /* Using cursor T00IA41 */
      pr_default.execute(39, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin), Byte.valueOf(A4049CCTValLin)});
      if ( (pr_default.getStatus(39) != 101) )
      {
         RcdFound623 = (short)(1) ;
      }
      else
      {
         RcdFound623 = (short)(0) ;
      }
      pr_default.close(39);
   }

   public void getByPrimaryKeyIA623( )
   {
      /* Using cursor T00IA5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin), Byte.valueOf(A4049CCTValLin)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         zmIA623( 84) ;
         RcdFound623 = (short)(1) ;
         initializeNonKeyIA623( ) ;
         A4049CCTValLin = T00IA5_A4049CCTValLin[0] ;
         A4050CCTValDsc = T00IA5_A4050CCTValDsc[0] ;
         A4051CCTVal = T00IA5_A4051CCTVal[0] ;
         Z396EmprCod = A396EmprCod ;
         Z4031CCTCod = A4031CCTCod ;
         Z4034CCTLin = A4034CCTLin ;
         Z4049CCTValLin = A4049CCTValLin ;
         sMode623 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         loadIA623( ) ;
         Gx_mode = sMode623 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound623 = (short)(0) ;
         initializeNonKeyIA623( ) ;
         sMode623 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModalIA623( ) ;
         Gx_mode = sMode623 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributesIA623( ) ;
      }
      pr_default.close(3);
   }

   public void checkOptimisticConcurrencyIA623( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00IA4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin), Byte.valueOf(A4049CCTValLin)});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCCDef2"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(2) == 101) || ( GXutil.strcmp(Z4050CCTValDsc, T00IA4_A4050CCTValDsc[0]) != 0 ) || ( GXutil.strcmp(Z4051CCTVal, T00IA4_A4051CCTVal[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z4050CCTValDsc, T00IA4_A4050CCTValDsc[0]) != 0 )
            {
               GXutil.writeLogln("controlcalidadhtd.tccdef:[seudo value changed for attri]"+"CCTValDsc");
               GXutil.writeLogRaw("Old: ",Z4050CCTValDsc);
               GXutil.writeLogRaw("Current: ",T00IA4_A4050CCTValDsc[0]);
            }
            if ( GXutil.strcmp(Z4051CCTVal, T00IA4_A4051CCTVal[0]) != 0 )
            {
               GXutil.writeLogln("controlcalidadhtd.tccdef:[seudo value changed for attri]"+"CCTVal");
               GXutil.writeLogRaw("Old: ",Z4051CCTVal);
               GXutil.writeLogRaw("Current: ",T00IA4_A4051CCTVal[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCCDef2"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertIA623( )
   {
      beforeValidateIA623( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableIA623( ) ;
      }
      if ( AnyError == 0 )
      {
         zmIA623( 0) ;
         checkOptimisticConcurrencyIA623( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmIA623( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertIA623( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00IA42 */
                  pr_default.execute(40, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin), Byte.valueOf(A4049CCTValLin), A4050CCTValDsc, A4051CCTVal});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCDef2");
                  if ( (pr_default.getStatus(40) == 1) )
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
            loadIA623( ) ;
         }
         endLevelIA623( ) ;
      }
      closeExtendedTableCursorsIA623( ) ;
   }

   public void updateIA623( )
   {
      beforeValidateIA623( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableIA623( ) ;
      }
      if ( ( nIsMod_623 != 0 ) || ( nIsDirty_623 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrencyIA623( ) ;
            if ( AnyError == 0 )
            {
               afterConfirmIA623( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdateIA623( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T00IA43 */
                     pr_default.execute(41, new Object[] {A4050CCTValDsc, A4051CCTVal, A396EmprCod, Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin), Byte.valueOf(A4049CCTValLin)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCDef2");
                     if ( (pr_default.getStatus(41) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCCDef2"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdateIA623( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKeyIA623( ) ;
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
            endLevelIA623( ) ;
         }
      }
      closeExtendedTableCursorsIA623( ) ;
   }

   public void deferredUpdateIA623( )
   {
   }

   public void deleteIA623( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidateIA623( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyIA623( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsIA623( ) ;
         afterConfirmIA623( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteIA623( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T00IA44 */
               pr_default.execute(42, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin), Byte.valueOf(A4049CCTValLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCDef2");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
               }
               else
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_unexp"), 1, "");
                  AnyError = (short)(1) ;
               }
            }
         }
      }
      sMode623 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelIA623( ) ;
      Gx_mode = sMode623 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsIA623( )
   {
      standaloneModalIA623( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevelIA623( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(2);
      }
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStartIA623( )
   {
      /* Scan By routine */
      /* Using cursor T00IA45 */
      pr_default.execute(43, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin)});
      RcdFound623 = (short)(0) ;
      if ( (pr_default.getStatus(43) != 101) )
      {
         RcdFound623 = (short)(1) ;
         A4049CCTValLin = T00IA45_A4049CCTValLin[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNextIA623( )
   {
      /* Scan next routine */
      pr_default.readNext(43);
      RcdFound623 = (short)(0) ;
      if ( (pr_default.getStatus(43) != 101) )
      {
         RcdFound623 = (short)(1) ;
         A4049CCTValLin = T00IA45_A4049CCTValLin[0] ;
      }
   }

   public void scanEndIA623( )
   {
      pr_default.close(43);
   }

   public void afterConfirmIA623( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsertIA623( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateIA623( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteIA623( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteIA623( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateIA623( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesIA623( )
   {
      edtCCTValLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCTValLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTValLin_Enabled), 5, 0), !bGXsfl_154_Refreshing);
      edtCCTValDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCTValDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTValDsc_Enabled), 5, 0), !bGXsfl_154_Refreshing);
      edtCCTVal_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCTVal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTVal_Enabled), 5, 0), !bGXsfl_154_Refreshing);
   }

   public void send_integrity_lvl_hashesIA623( )
   {
   }

   public void send_integrity_lvl_hashesIA622( )
   {
   }

   public void zmIA1529( int GX_JID )
   {
      if ( ( GX_JID == 85 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z12733CCTNotStp = T00IA3_A12733CCTNotStp[0] ;
            Z11477CCTNotEvt = T00IA3_A11477CCTNotEvt[0] ;
            Z11478CCTNotDst = T00IA3_A11478CCTNotDst[0] ;
            Z11479CCTNotUsr = T00IA3_A11479CCTNotUsr[0] ;
            Z11480CCTNotEml = T00IA3_A11480CCTNotEml[0] ;
            Z11523CCTNotAsu = T00IA3_A11523CCTNotAsu[0] ;
            Z11524CCTNotTxt = T00IA3_A11524CCTNotTxt[0] ;
            Z11525CCTNotAdj = T00IA3_A11525CCTNotAdj[0] ;
         }
         else
         {
            Z12733CCTNotStp = A12733CCTNotStp ;
            Z11477CCTNotEvt = A11477CCTNotEvt ;
            Z11478CCTNotDst = A11478CCTNotDst ;
            Z11479CCTNotUsr = A11479CCTNotUsr ;
            Z11480CCTNotEml = A11480CCTNotEml ;
            Z11523CCTNotAsu = A11523CCTNotAsu ;
            Z11524CCTNotTxt = A11524CCTNotTxt ;
            Z11525CCTNotAdj = A11525CCTNotAdj ;
         }
      }
      if ( GX_JID == -85 )
      {
         Z396EmprCod = A396EmprCod ;
         Z4031CCTCod = A4031CCTCod ;
         Z11481CCTNotId = A11481CCTNotId ;
         Z12733CCTNotStp = A12733CCTNotStp ;
         Z11477CCTNotEvt = A11477CCTNotEvt ;
         Z11478CCTNotDst = A11478CCTNotDst ;
         Z11479CCTNotUsr = A11479CCTNotUsr ;
         Z11480CCTNotEml = A11480CCTNotEml ;
         Z11523CCTNotAsu = A11523CCTNotAsu ;
         Z11524CCTNotTxt = A11524CCTNotTxt ;
         Z11525CCTNotAdj = A11525CCTNotAdj ;
      }
   }

   public void standaloneNotModalIA1529( )
   {
      edtCCTNotUlt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCTNotUlt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTNotUlt_Enabled), 5, 0), true);
      edtCCTNotUlt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCTNotUlt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTNotUlt_Enabled), 5, 0), true);
   }

   public void standaloneModalIA1529( )
   {
      if ( isIns( )  )
      {
         A11475CCTNotUlt = (short)(O11475CCTNotUlt+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "A11475CCTNotUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11475CCTNotUlt), 4, 0));
      }
      if ( isIns( )  && ( Gx_BScreen == 1 ) )
      {
         A11481CCTNotId = A11475CCTNotUlt ;
      }
      if ( isIns( )  && (0==A12733CCTNotStp) && ( Gx_BScreen == 0 ) )
      {
         A12733CCTNotStp = (byte)(0) ;
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtCCTNotId_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCCTNotId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTNotId_Enabled), 5, 0), !bGXsfl_181_Refreshing);
      }
      else
      {
         edtCCTNotId_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCCTNotId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTNotId_Enabled), 5, 0), !bGXsfl_181_Refreshing);
      }
   }

   public void loadIA1529( )
   {
      /* Using cursor T00IA46 */
      pr_default.execute(44, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod), Short.valueOf(A11481CCTNotId)});
      if ( (pr_default.getStatus(44) != 101) )
      {
         RcdFound1529 = (short)(1) ;
         A12733CCTNotStp = T00IA46_A12733CCTNotStp[0] ;
         A11477CCTNotEvt = T00IA46_A11477CCTNotEvt[0] ;
         A11478CCTNotDst = T00IA46_A11478CCTNotDst[0] ;
         A11479CCTNotUsr = T00IA46_A11479CCTNotUsr[0] ;
         A11480CCTNotEml = T00IA46_A11480CCTNotEml[0] ;
         A11523CCTNotAsu = T00IA46_A11523CCTNotAsu[0] ;
         A11524CCTNotTxt = T00IA46_A11524CCTNotTxt[0] ;
         A11525CCTNotAdj = T00IA46_A11525CCTNotAdj[0] ;
         zmIA1529( -85) ;
      }
      pr_default.close(44);
      onLoadActionsIA1529( ) ;
   }

   public void onLoadActionsIA1529( )
   {
      if ( GXutil.strcmp(A11478CCTNotDst, httpContext.getMessage( httpContext.getMessage( "U", ""), "")) != 0 )
      {
         dynCCTNotUsr.setEnabled( 0 );
         httpContext.ajax_rsp_assign_prop("", false, dynCCTNotUsr.getInternalname(), "Enabled", GXutil.ltrimstr( dynCCTNotUsr.getEnabled(), 5, 0), !bGXsfl_181_Refreshing);
      }
      else
      {
         dynCCTNotUsr.setEnabled( 1 );
         httpContext.ajax_rsp_assign_prop("", false, dynCCTNotUsr.getInternalname(), "Enabled", GXutil.ltrimstr( dynCCTNotUsr.getEnabled(), 5, 0), !bGXsfl_181_Refreshing);
      }
      if ( GXutil.strcmp(A11478CCTNotDst, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) != 0 )
      {
         edtCCTNotEml_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCCTNotEml_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTNotEml_Enabled), 5, 0), !bGXsfl_181_Refreshing);
      }
      else
      {
         edtCCTNotEml_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCCTNotEml_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTNotEml_Enabled), 5, 0), !bGXsfl_181_Refreshing);
      }
   }

   public void checkExtendedTableIA1529( )
   {
      nIsDirty_1529 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModalIA1529( ) ;
      if ( (GXutil.strcmp("", A11477CCTNotEvt)==0) )
      {
         GXCCtl = "CCTNOTEVT_" + sGXsfl_181_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Debe definir el Evento.", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = cmbCCTNotEvt.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( GXutil.strcmp(A11478CCTNotDst, httpContext.getMessage( httpContext.getMessage( "U", ""), "")) != 0 )
      {
         dynCCTNotUsr.setEnabled( 0 );
         httpContext.ajax_rsp_assign_prop("", false, dynCCTNotUsr.getInternalname(), "Enabled", GXutil.ltrimstr( dynCCTNotUsr.getEnabled(), 5, 0), !bGXsfl_181_Refreshing);
      }
      else
      {
         dynCCTNotUsr.setEnabled( 1 );
         httpContext.ajax_rsp_assign_prop("", false, dynCCTNotUsr.getInternalname(), "Enabled", GXutil.ltrimstr( dynCCTNotUsr.getEnabled(), 5, 0), !bGXsfl_181_Refreshing);
      }
      if ( GXutil.strcmp(A11478CCTNotDst, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) != 0 )
      {
         edtCCTNotEml_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCCTNotEml_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTNotEml_Enabled), 5, 0), !bGXsfl_181_Refreshing);
      }
      else
      {
         edtCCTNotEml_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCCTNotEml_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTNotEml_Enabled), 5, 0), !bGXsfl_181_Refreshing);
      }
      if ( (GXutil.strcmp("", A11478CCTNotDst)==0) )
      {
         GXCCtl = "CCTNOTDST_" + sGXsfl_181_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Debe definir el Destinatario.", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = cmbCCTNotDst.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( (GXutil.strcmp("", A11479CCTNotUsr)==0) && ( GXutil.strcmp(A11478CCTNotDst, httpContext.getMessage( "U", "")) == 0 ) )
      {
         GXCCtl = "CCTNOTDST_" + sGXsfl_181_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Debe definir el Usuario.", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = cmbCCTNotDst.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursorsIA1529( )
   {
   }

   public void enableDisableIA1529( )
   {
   }

   public void getKeyIA1529( )
   {
      /* Using cursor T00IA47 */
      pr_default.execute(45, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod), Short.valueOf(A11481CCTNotId)});
      if ( (pr_default.getStatus(45) != 101) )
      {
         RcdFound1529 = (short)(1) ;
      }
      else
      {
         RcdFound1529 = (short)(0) ;
      }
      pr_default.close(45);
   }

   public void getByPrimaryKeyIA1529( )
   {
      /* Using cursor T00IA3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod), Short.valueOf(A11481CCTNotId)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zmIA1529( 85) ;
         RcdFound1529 = (short)(1) ;
         initializeNonKeyIA1529( ) ;
         A11481CCTNotId = T00IA3_A11481CCTNotId[0] ;
         A12733CCTNotStp = T00IA3_A12733CCTNotStp[0] ;
         A11477CCTNotEvt = T00IA3_A11477CCTNotEvt[0] ;
         A11478CCTNotDst = T00IA3_A11478CCTNotDst[0] ;
         A11479CCTNotUsr = T00IA3_A11479CCTNotUsr[0] ;
         A11480CCTNotEml = T00IA3_A11480CCTNotEml[0] ;
         A11523CCTNotAsu = T00IA3_A11523CCTNotAsu[0] ;
         A11524CCTNotTxt = T00IA3_A11524CCTNotTxt[0] ;
         A11525CCTNotAdj = T00IA3_A11525CCTNotAdj[0] ;
         Z396EmprCod = A396EmprCod ;
         Z4031CCTCod = A4031CCTCod ;
         Z11481CCTNotId = A11481CCTNotId ;
         sMode1529 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         loadIA1529( ) ;
         Gx_mode = sMode1529 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1529 = (short)(0) ;
         initializeNonKeyIA1529( ) ;
         sMode1529 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModalIA1529( ) ;
         Gx_mode = sMode1529 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributesIA1529( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrencyIA1529( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00IA2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod), Short.valueOf(A11481CCTNotId)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCCDefN"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( Z12733CCTNotStp != T00IA2_A12733CCTNotStp[0] ) || ( GXutil.strcmp(Z11477CCTNotEvt, T00IA2_A11477CCTNotEvt[0]) != 0 ) || ( GXutil.strcmp(Z11478CCTNotDst, T00IA2_A11478CCTNotDst[0]) != 0 ) || ( GXutil.strcmp(Z11479CCTNotUsr, T00IA2_A11479CCTNotUsr[0]) != 0 ) || ( GXutil.strcmp(Z11480CCTNotEml, T00IA2_A11480CCTNotEml[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z11523CCTNotAsu, T00IA2_A11523CCTNotAsu[0]) != 0 ) || ( GXutil.strcmp(Z11524CCTNotTxt, T00IA2_A11524CCTNotTxt[0]) != 0 ) || ( Z11525CCTNotAdj != T00IA2_A11525CCTNotAdj[0] ) )
         {
            if ( Z12733CCTNotStp != T00IA2_A12733CCTNotStp[0] )
            {
               GXutil.writeLogln("controlcalidadhtd.tccdef:[seudo value changed for attri]"+"CCTNotStp");
               GXutil.writeLogRaw("Old: ",Z12733CCTNotStp);
               GXutil.writeLogRaw("Current: ",T00IA2_A12733CCTNotStp[0]);
            }
            if ( GXutil.strcmp(Z11477CCTNotEvt, T00IA2_A11477CCTNotEvt[0]) != 0 )
            {
               GXutil.writeLogln("controlcalidadhtd.tccdef:[seudo value changed for attri]"+"CCTNotEvt");
               GXutil.writeLogRaw("Old: ",Z11477CCTNotEvt);
               GXutil.writeLogRaw("Current: ",T00IA2_A11477CCTNotEvt[0]);
            }
            if ( GXutil.strcmp(Z11478CCTNotDst, T00IA2_A11478CCTNotDst[0]) != 0 )
            {
               GXutil.writeLogln("controlcalidadhtd.tccdef:[seudo value changed for attri]"+"CCTNotDst");
               GXutil.writeLogRaw("Old: ",Z11478CCTNotDst);
               GXutil.writeLogRaw("Current: ",T00IA2_A11478CCTNotDst[0]);
            }
            if ( GXutil.strcmp(Z11479CCTNotUsr, T00IA2_A11479CCTNotUsr[0]) != 0 )
            {
               GXutil.writeLogln("controlcalidadhtd.tccdef:[seudo value changed for attri]"+"CCTNotUsr");
               GXutil.writeLogRaw("Old: ",Z11479CCTNotUsr);
               GXutil.writeLogRaw("Current: ",T00IA2_A11479CCTNotUsr[0]);
            }
            if ( GXutil.strcmp(Z11480CCTNotEml, T00IA2_A11480CCTNotEml[0]) != 0 )
            {
               GXutil.writeLogln("controlcalidadhtd.tccdef:[seudo value changed for attri]"+"CCTNotEml");
               GXutil.writeLogRaw("Old: ",Z11480CCTNotEml);
               GXutil.writeLogRaw("Current: ",T00IA2_A11480CCTNotEml[0]);
            }
            if ( GXutil.strcmp(Z11523CCTNotAsu, T00IA2_A11523CCTNotAsu[0]) != 0 )
            {
               GXutil.writeLogln("controlcalidadhtd.tccdef:[seudo value changed for attri]"+"CCTNotAsu");
               GXutil.writeLogRaw("Old: ",Z11523CCTNotAsu);
               GXutil.writeLogRaw("Current: ",T00IA2_A11523CCTNotAsu[0]);
            }
            if ( GXutil.strcmp(Z11524CCTNotTxt, T00IA2_A11524CCTNotTxt[0]) != 0 )
            {
               GXutil.writeLogln("controlcalidadhtd.tccdef:[seudo value changed for attri]"+"CCTNotTxt");
               GXutil.writeLogRaw("Old: ",Z11524CCTNotTxt);
               GXutil.writeLogRaw("Current: ",T00IA2_A11524CCTNotTxt[0]);
            }
            if ( Z11525CCTNotAdj != T00IA2_A11525CCTNotAdj[0] )
            {
               GXutil.writeLogln("controlcalidadhtd.tccdef:[seudo value changed for attri]"+"CCTNotAdj");
               GXutil.writeLogRaw("Old: ",Z11525CCTNotAdj);
               GXutil.writeLogRaw("Current: ",T00IA2_A11525CCTNotAdj[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCCDefN"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertIA1529( )
   {
      beforeValidateIA1529( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableIA1529( ) ;
      }
      if ( AnyError == 0 )
      {
         zmIA1529( 0) ;
         checkOptimisticConcurrencyIA1529( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmIA1529( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertIA1529( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00IA48 */
                  pr_default.execute(46, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod), Short.valueOf(A11481CCTNotId), Byte.valueOf(A12733CCTNotStp), A11477CCTNotEvt, A11478CCTNotDst, A11479CCTNotUsr, A11480CCTNotEml, A11523CCTNotAsu, A11524CCTNotTxt, Byte.valueOf(A11525CCTNotAdj)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCDefN");
                  if ( (pr_default.getStatus(46) == 1) )
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
            loadIA1529( ) ;
         }
         endLevelIA1529( ) ;
      }
      closeExtendedTableCursorsIA1529( ) ;
   }

   public void updateIA1529( )
   {
      beforeValidateIA1529( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableIA1529( ) ;
      }
      if ( ( nIsMod_1529 != 0 ) || ( nIsDirty_1529 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrencyIA1529( ) ;
            if ( AnyError == 0 )
            {
               afterConfirmIA1529( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdateIA1529( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T00IA49 */
                     pr_default.execute(47, new Object[] {Byte.valueOf(A12733CCTNotStp), A11477CCTNotEvt, A11478CCTNotDst, A11479CCTNotUsr, A11480CCTNotEml, A11523CCTNotAsu, A11524CCTNotTxt, Byte.valueOf(A11525CCTNotAdj), A396EmprCod, Integer.valueOf(A4031CCTCod), Short.valueOf(A11481CCTNotId)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCDefN");
                     if ( (pr_default.getStatus(47) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCCDefN"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdateIA1529( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKeyIA1529( ) ;
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
            endLevelIA1529( ) ;
         }
      }
      closeExtendedTableCursorsIA1529( ) ;
   }

   public void deferredUpdateIA1529( )
   {
   }

   public void deleteIA1529( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidateIA1529( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyIA1529( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsIA1529( ) ;
         afterConfirmIA1529( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteIA1529( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T00IA50 */
               pr_default.execute(48, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod), Short.valueOf(A11481CCTNotId)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCDefN");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
               }
               else
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_unexp"), 1, "");
                  AnyError = (short)(1) ;
               }
            }
         }
      }
      sMode1529 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelIA1529( ) ;
      Gx_mode = sMode1529 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsIA1529( )
   {
      standaloneModalIA1529( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         if ( GXutil.strcmp(A11478CCTNotDst, httpContext.getMessage( httpContext.getMessage( "U", ""), "")) != 0 )
         {
            dynCCTNotUsr.setEnabled( 0 );
            httpContext.ajax_rsp_assign_prop("", false, dynCCTNotUsr.getInternalname(), "Enabled", GXutil.ltrimstr( dynCCTNotUsr.getEnabled(), 5, 0), !bGXsfl_181_Refreshing);
         }
         else
         {
            dynCCTNotUsr.setEnabled( 1 );
            httpContext.ajax_rsp_assign_prop("", false, dynCCTNotUsr.getInternalname(), "Enabled", GXutil.ltrimstr( dynCCTNotUsr.getEnabled(), 5, 0), !bGXsfl_181_Refreshing);
         }
         if ( GXutil.strcmp(A11478CCTNotDst, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) != 0 )
         {
            edtCCTNotEml_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCTNotEml_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTNotEml_Enabled), 5, 0), !bGXsfl_181_Refreshing);
         }
         else
         {
            edtCCTNotEml_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCTNotEml_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTNotEml_Enabled), 5, 0), !bGXsfl_181_Refreshing);
         }
      }
   }

   public void endLevelIA1529( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStartIA1529( )
   {
      /* Scan By routine */
      /* Using cursor T00IA51 */
      pr_default.execute(49, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod)});
      RcdFound1529 = (short)(0) ;
      if ( (pr_default.getStatus(49) != 101) )
      {
         RcdFound1529 = (short)(1) ;
         A11481CCTNotId = T00IA51_A11481CCTNotId[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNextIA1529( )
   {
      /* Scan next routine */
      pr_default.readNext(49);
      RcdFound1529 = (short)(0) ;
      if ( (pr_default.getStatus(49) != 101) )
      {
         RcdFound1529 = (short)(1) ;
         A11481CCTNotId = T00IA51_A11481CCTNotId[0] ;
      }
   }

   public void scanEndIA1529( )
   {
      pr_default.close(49);
   }

   public void afterConfirmIA1529( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsertIA1529( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateIA1529( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteIA1529( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteIA1529( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateIA1529( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesIA1529( )
   {
      edtCCTNotId_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCTNotId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTNotId_Enabled), 5, 0), !bGXsfl_181_Refreshing);
      cmbCCTNotEvt.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbCCTNotEvt.getInternalname(), "Enabled", GXutil.ltrimstr( cmbCCTNotEvt.getEnabled(), 5, 0), !bGXsfl_181_Refreshing);
      cmbCCTNotDst.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbCCTNotDst.getInternalname(), "Enabled", GXutil.ltrimstr( cmbCCTNotDst.getEnabled(), 5, 0), !bGXsfl_181_Refreshing);
      dynCCTNotUsr.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, dynCCTNotUsr.getInternalname(), "Enabled", GXutil.ltrimstr( dynCCTNotUsr.getEnabled(), 5, 0), !bGXsfl_181_Refreshing);
      edtCCTNotEml_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCTNotEml_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTNotEml_Enabled), 5, 0), !bGXsfl_181_Refreshing);
      edtCCTNotAsu_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCTNotAsu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTNotAsu_Enabled), 5, 0), !bGXsfl_181_Refreshing);
      edtCCTNotTxt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCTNotTxt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTNotTxt_Enabled), 5, 0), !bGXsfl_181_Refreshing);
      cmbCCTNotAdj.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbCCTNotAdj.getInternalname(), "Enabled", GXutil.ltrimstr( cmbCCTNotAdj.getEnabled(), 5, 0), !bGXsfl_181_Refreshing);
      cmbCCTNotStp.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbCCTNotStp.getInternalname(), "Enabled", GXutil.ltrimstr( cmbCCTNotStp.getEnabled(), 5, 0), !bGXsfl_181_Refreshing);
   }

   public void send_integrity_lvl_hashesIA1529( )
   {
   }

   public void send_integrity_lvl_hashesIA621( )
   {
   }

   public void subsflControlProps_79622( )
   {
      edtCCTLin_Internalname = "CCTLIN_"+sGXsfl_79_idx ;
      cmbCCTLinTpoI.setInternalname( "CCTLINTPOI_"+sGXsfl_79_idx );
      dynCCVCod.setInternalname( "CCVCOD_"+sGXsfl_79_idx );
      cmbCCTLinTpoD.setInternalname( "CCTLINTPOD_"+sGXsfl_79_idx );
      edtCCTLinDsc_Internalname = "CCTLINDSC_"+sGXsfl_79_idx ;
      edtCCTLinVarW_Internalname = "CCTLINVARW_"+sGXsfl_79_idx ;
      edtCCTLinLgoD_Internalname = "CCTLINLGOD_"+sGXsfl_79_idx ;
      edtCCTLinPict_Internalname = "CCTLINPICT_"+sGXsfl_79_idx ;
      edtCCTSta_Internalname = "CCTSTA_"+sGXsfl_79_idx ;
      edtCCVNorma_Internalname = "CCVNORMA_"+sGXsfl_79_idx ;
      edtCCVEspecif_Internalname = "CCVESPECIF_"+sGXsfl_79_idx ;
      edtCCTLinDscL_Internalname = "CCTLINDSCL_"+sGXsfl_79_idx ;
      edtCCVPict_Internalname = "CCVPICT_"+sGXsfl_79_idx ;
      edtCCVTpoDat_Internalname = "CCVTPODAT_"+sGXsfl_79_idx ;
      edtCCVDsc_Internalname = "CCVDSC_"+sGXsfl_79_idx ;
      subGridlevel_level2_Internalname = "GRIDLEVEL_LEVEL2_"+sGXsfl_79_idx ;
   }

   public void subsflControlProps_fel_79622( )
   {
      edtCCTLin_Internalname = "CCTLIN_"+sGXsfl_79_fel_idx ;
      cmbCCTLinTpoI.setInternalname( "CCTLINTPOI_"+sGXsfl_79_fel_idx );
      dynCCVCod.setInternalname( "CCVCOD_"+sGXsfl_79_fel_idx );
      cmbCCTLinTpoD.setInternalname( "CCTLINTPOD_"+sGXsfl_79_fel_idx );
      edtCCTLinDsc_Internalname = "CCTLINDSC_"+sGXsfl_79_fel_idx ;
      edtCCTLinVarW_Internalname = "CCTLINVARW_"+sGXsfl_79_fel_idx ;
      edtCCTLinLgoD_Internalname = "CCTLINLGOD_"+sGXsfl_79_fel_idx ;
      edtCCTLinPict_Internalname = "CCTLINPICT_"+sGXsfl_79_fel_idx ;
      edtCCTSta_Internalname = "CCTSTA_"+sGXsfl_79_fel_idx ;
      edtCCVNorma_Internalname = "CCVNORMA_"+sGXsfl_79_fel_idx ;
      edtCCVEspecif_Internalname = "CCVESPECIF_"+sGXsfl_79_fel_idx ;
      edtCCTLinDscL_Internalname = "CCTLINDSCL_"+sGXsfl_79_fel_idx ;
      edtCCVPict_Internalname = "CCVPICT_"+sGXsfl_79_fel_idx ;
      edtCCVTpoDat_Internalname = "CCVTPODAT_"+sGXsfl_79_fel_idx ;
      edtCCVDsc_Internalname = "CCVDSC_"+sGXsfl_79_fel_idx ;
      subGridlevel_level2_Internalname = "GRIDLEVEL_LEVEL2_"+sGXsfl_79_fel_idx ;
   }

   public void addRowIA622( )
   {
      nRC_GXsfl_154 = 0 ;
      nGXsfl_79_idx = (int)(nGXsfl_79_idx+1) ;
      sGXsfl_79_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_79_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_79622( ) ;
      sendRowIA622( ) ;
   }

   public void sendRowIA622( )
   {
      Freestylelevel_level1Row = GXWebRow.GetNew(context) ;
      if ( subFreestylelevel_level1_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subFreestylelevel_level1_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subFreestylelevel_level1_Class, "") != 0 )
         {
            subFreestylelevel_level1_Linesclass = subFreestylelevel_level1_Class+"Odd" ;
         }
      }
      else if ( subFreestylelevel_level1_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subFreestylelevel_level1_Backstyle = (byte)(0) ;
         subFreestylelevel_level1_Backcolor = subFreestylelevel_level1_Allbackcolor ;
         if ( GXutil.strcmp(subFreestylelevel_level1_Class, "") != 0 )
         {
            subFreestylelevel_level1_Linesclass = subFreestylelevel_level1_Class+"Uniform" ;
         }
      }
      else if ( subFreestylelevel_level1_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subFreestylelevel_level1_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subFreestylelevel_level1_Class, "") != 0 )
         {
            subFreestylelevel_level1_Linesclass = subFreestylelevel_level1_Class+"Odd" ;
         }
         subFreestylelevel_level1_Backcolor = (int)(0xFFFFFF) ;
      }
      else if ( subFreestylelevel_level1_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subFreestylelevel_level1_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_79_idx) % (2))) == 0 )
         {
            subFreestylelevel_level1_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subFreestylelevel_level1_Class, "") != 0 )
            {
               subFreestylelevel_level1_Linesclass = subFreestylelevel_level1_Class+"Even" ;
            }
         }
         else
         {
            subFreestylelevel_level1_Backcolor = (int)(0xFFFFFF) ;
            if ( GXutil.strcmp(subFreestylelevel_level1_Class, "") != 0 )
            {
               subFreestylelevel_level1_Linesclass = subFreestylelevel_level1_Class+"Odd" ;
            }
         }
      }
      /* Start of Columns property logic. */
      if ( Freestylelevel_level1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<tr"+" class=\""+subFreestylelevel_level1_Linesclass+"\" style=\""+""+"\""+" data-gxrow=\""+sGXsfl_79_idx+"\">") ;
      }
      gxaccvcod_htmlIA622( A396EmprCod) ;
      /* Div Control */
      Freestylelevel_level1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {divUnnamedtablefsfreestylelevel_level1_Internalname+"_"+sGXsfl_79_idx,Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","Table","left","top","","","div"});
      /* Div Control */
      Freestylelevel_level1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","row","left","top","","","div"});
      /* Div Control */
      Freestylelevel_level1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-xs-12","left","top","","","div"});
      /* Div Control */
      Freestylelevel_level1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {divTableintermediateinslevel_level1_Internalname+"_"+sGXsfl_79_idx,Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","left","top","","","div"});
      /* Div Control */
      Freestylelevel_level1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","row","left","top","","","div"});
      /* Div Control */
      Freestylelevel_level1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-xs-12","left","top","","","div"});
      /* Div Control */
      Freestylelevel_level1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {divUnnamedtable4_Internalname+"_"+sGXsfl_79_idx,Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","left","top","","","div"});
      /* Div Control */
      Freestylelevel_level1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","row","left","top","","","div"});
      /* Div Control */
      Freestylelevel_level1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-xs-12 col-sm-2 DataContentCell","left","top","","","div"});
      /* Div Control */
      Freestylelevel_level1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(edtCCTLin_Visible),Integer.valueOf(0),"px",Integer.valueOf(0),"px","form-group gx-form-group","left","top",""+" data-gx-for=\""+edtCCTLin_Internalname+"\"","","div"});
      /* Attribute/Variable Label */
      Freestylelevel_level1Row.AddColumnProperties("html_label", -1, isAjaxCallMode( ), new Object[] {edtCCTLin_Internalname,httpContext.getMessage( "# Lín", ""),"col-sm-3 AttributeFLLabel",Integer.valueOf(1),Boolean.valueOf(true),""});
      /* Div Control */
      Freestylelevel_level1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-sm-9 gx-attribute","left","top","","","div"});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_622_" + sGXsfl_79_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 91,'',false,'" + sGXsfl_79_idx + "',79)\"" ;
      ROClassString = "AttributeFL" ;
      Freestylelevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCCTLin_Internalname,GXutil.ltrim( localUtil.ntoc( A4034CCTLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4034CCTLin), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,91);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCCTLin_Jsonclick,Integer.valueOf(0),"AttributeFL","",ROClassString,"","",Integer.valueOf(edtCCTLin_Visible),Integer.valueOf(edtCCTLin_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(4),"chr",Integer.valueOf(1),"row",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(79),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Freestylelevel_level1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Freestylelevel_level1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Freestylelevel_level1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      /* Div Control */
      Freestylelevel_level1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-xs-12 col-sm-4 DataContentCell","left","top","","","div"});
      /* Div Control */
      Freestylelevel_level1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(cmbCCTLinTpoI.getVisible()),Integer.valueOf(0),"px",Integer.valueOf(0),"px","form-group gx-form-group","left","top",""+" data-gx-for=\""+cmbCCTLinTpoI.getInternalname()+"\"","","div"});
      /* Attribute/Variable Label */
      Freestylelevel_level1Row.AddColumnProperties("html_label", -1, isAjaxCallMode( ), new Object[] {cmbCCTLinTpoI.getInternalname(),httpContext.getMessage( "Tipo de Ingreso", ""),"col-sm-3 AttributeFLLabel",Integer.valueOf(1),Boolean.valueOf(true),""});
      /* Div Control */
      Freestylelevel_level1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-sm-9 gx-attribute","left","top","","","div"});
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_622_" + sGXsfl_79_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 95,'',false,'" + sGXsfl_79_idx + "',79)\"" ;
      GXCCtl = "CCTLINTPOI_" + sGXsfl_79_idx ;
      cmbCCTLinTpoI.setName( GXCCtl );
      cmbCCTLinTpoI.setWebtags( "" );
      cmbCCTLinTpoI.addItem("L", httpContext.getMessage( "Lista", ""), (short)(0));
      cmbCCTLinTpoI.addItem("R", httpContext.getMessage( "Rango", ""), (short)(0));
      if ( cmbCCTLinTpoI.getItemCount() > 0 )
      {
         A4048CCTLinTpoI = cmbCCTLinTpoI.getValidValue(A4048CCTLinTpoI) ;
      }
      /* ComboBox */
      Freestylelevel_level1Row.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbCCTLinTpoI,cmbCCTLinTpoI.getInternalname(),GXutil.rtrim( A4048CCTLinTpoI),Integer.valueOf(1),cmbCCTLinTpoI.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",Integer.valueOf(cmbCCTLinTpoI.getVisible()),Integer.valueOf(cmbCCTLinTpoI.getEnabled()),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),"em",Integer.valueOf(0),"","","AttributeFL","","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,95);\"","",Boolean.valueOf(true),Integer.valueOf(0)});
      cmbCCTLinTpoI.setValue( GXutil.rtrim( A4048CCTLinTpoI) );
      httpContext.ajax_rsp_assign_prop("", false, cmbCCTLinTpoI.getInternalname(), "Values", cmbCCTLinTpoI.ToJavascriptSource(), !bGXsfl_79_Refreshing);
      Freestylelevel_level1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Freestylelevel_level1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Freestylelevel_level1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      /* Div Control */
      Freestylelevel_level1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-xs-12 col-sm-3 DataContentCell","left","top","","","div"});
      /* Div Control */
      Freestylelevel_level1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","form-group gx-form-group","left","top",""+" data-gx-for=\""+dynCCVCod.getInternalname()+"\"","","div"});
      /* Attribute/Variable Label */
      Freestylelevel_level1Row.AddColumnProperties("html_label", -1, isAjaxCallMode( ), new Object[] {dynCCVCod.getInternalname(),httpContext.getMessage( "Variable Automática", ""),"col-sm-3 AttributeFLLabel",Integer.valueOf(1),Boolean.valueOf(true),""});
      /* Div Control */
      Freestylelevel_level1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-sm-9 gx-attribute","left","top","","","div"});
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_622_" + sGXsfl_79_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 99,'',false,'" + sGXsfl_79_idx + "',79)\"" ;
      GXCCtl = "CCVCOD_" + sGXsfl_79_idx ;
      dynCCVCod.setName( GXCCtl );
      dynCCVCod.setWebtags( "" );
      /* ComboBox */
      Freestylelevel_level1Row.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {dynCCVCod,dynCCVCod.getInternalname(),GXutil.rtrim( A11522CCVCod),Integer.valueOf(1),dynCCVCod.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",Integer.valueOf(1),Integer.valueOf(dynCCVCod.getEnabled()),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),"em",Integer.valueOf(0),"","","AttributeFL","","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,99);\"","",Boolean.valueOf(true),Integer.valueOf(0)});
      dynCCVCod.setValue( GXutil.rtrim( A11522CCVCod) );
      httpContext.ajax_rsp_assign_prop("", false, dynCCVCod.getInternalname(), "Values", dynCCVCod.ToJavascriptSource(), !bGXsfl_79_Refreshing);
      Freestylelevel_level1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Freestylelevel_level1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Freestylelevel_level1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      /* Div Control */
      Freestylelevel_level1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-xs-12 col-sm-3 DataContentCell","left","top","","","div"});
      /* Div Control */
      Freestylelevel_level1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(cmbCCTLinTpoD.getVisible()),Integer.valueOf(0),"px",Integer.valueOf(0),"px","form-group gx-form-group","left","top",""+" data-gx-for=\""+cmbCCTLinTpoD.getInternalname()+"\"","","div"});
      /* Attribute/Variable Label */
      Freestylelevel_level1Row.AddColumnProperties("html_label", -1, isAjaxCallMode( ), new Object[] {cmbCCTLinTpoD.getInternalname(),httpContext.getMessage( "Tipo de Datos", ""),"col-sm-3 AttributeFLLabel",Integer.valueOf(1),Boolean.valueOf(true),""});
      /* Div Control */
      Freestylelevel_level1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-sm-9 gx-attribute","left","top","","","div"});
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_622_" + sGXsfl_79_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 103,'',false,'" + sGXsfl_79_idx + "',79)\"" ;
      GXCCtl = "CCTLINTPOD_" + sGXsfl_79_idx ;
      cmbCCTLinTpoD.setName( GXCCtl );
      cmbCCTLinTpoD.setWebtags( "" );
      cmbCCTLinTpoD.addItem("F", httpContext.getMessage( "Fecha", ""), (short)(0));
      cmbCCTLinTpoD.addItem("N", httpContext.getMessage( "Numérico", ""), (short)(0));
      cmbCCTLinTpoD.addItem("H", httpContext.getMessage( "Hora", ""), (short)(0));
      cmbCCTLinTpoD.addItem("C", httpContext.getMessage( "Caracteres", ""), (short)(0));
      cmbCCTLinTpoD.addItem("T", httpContext.getMessage( "Título", ""), (short)(0));
      if ( cmbCCTLinTpoD.getItemCount() > 0 )
      {
         A4044CCTLinTpoD = cmbCCTLinTpoD.getValidValue(A4044CCTLinTpoD) ;
      }
      /* ComboBox */
      Freestylelevel_level1Row.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbCCTLinTpoD,cmbCCTLinTpoD.getInternalname(),GXutil.rtrim( A4044CCTLinTpoD),Integer.valueOf(1),cmbCCTLinTpoD.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",Integer.valueOf(cmbCCTLinTpoD.getVisible()),Integer.valueOf(cmbCCTLinTpoD.getEnabled()),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),"em",Integer.valueOf(0),"","","AttributeFL","","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,103);\"","",Boolean.valueOf(true),Integer.valueOf(0)});
      cmbCCTLinTpoD.setValue( GXutil.rtrim( A4044CCTLinTpoD) );
      httpContext.ajax_rsp_assign_prop("", false, cmbCCTLinTpoD.getInternalname(), "Values", cmbCCTLinTpoD.ToJavascriptSource(), !bGXsfl_79_Refreshing);
      Freestylelevel_level1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Freestylelevel_level1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Freestylelevel_level1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Freestylelevel_level1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Freestylelevel_level1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Freestylelevel_level1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      /* Div Control */
      Freestylelevel_level1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-xs-12","left","top","","","div"});
      /* Div Control */
      Freestylelevel_level1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {divUnnamedtable5_Internalname+"_"+sGXsfl_79_idx,Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","left","top","","","div"});
      /* Div Control */
      Freestylelevel_level1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","row","left","top","","","div"});
      /* Div Control */
      Freestylelevel_level1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-xs-12 col-sm-6 DataContentCell","left","top","","","div"});
      /* Div Control */
      Freestylelevel_level1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(edtCCTLinDsc_Visible),Integer.valueOf(0),"px",Integer.valueOf(0),"px","form-group gx-form-group","left","top",""+" data-gx-for=\""+edtCCTLinDsc_Internalname+"\"","","div"});
      /* Attribute/Variable Label */
      Freestylelevel_level1Row.AddColumnProperties("html_label", -1, isAjaxCallMode( ), new Object[] {edtCCTLinDsc_Internalname,httpContext.getMessage( "Descripción", ""),"col-sm-3 AttributeFLLabel",Integer.valueOf(1),Boolean.valueOf(true),""});
      /* Div Control */
      Freestylelevel_level1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-sm-9 gx-attribute","left","top","","","div"});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_622_" + sGXsfl_79_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 110,'',false,'" + sGXsfl_79_idx + "',79)\"" ;
      ROClassString = "AttributeFL" ;
      Freestylelevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCCTLinDsc_Internalname,GXutil.rtrim( A4043CCTLinDsc),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,110);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCCTLinDsc_Jsonclick,Integer.valueOf(0),"AttributeFL","",ROClassString,"","",Integer.valueOf(edtCCTLinDsc_Visible),Integer.valueOf(edtCCTLinDsc_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(30),"chr",Integer.valueOf(1),"row",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(79),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      Freestylelevel_level1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Freestylelevel_level1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Freestylelevel_level1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      /* Div Control */
      Freestylelevel_level1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-xs-12 col-sm-6 DataContentCell","left","top","","","div"});
      /* Div Control */
      Freestylelevel_level1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","form-group gx-form-group","left","top",""+" data-gx-for=\""+edtCCTLinVarW_Internalname+"\"","","div"});
      /* Attribute/Variable Label */
      Freestylelevel_level1Row.AddColumnProperties("html_label", -1, isAjaxCallMode( ), new Object[] {edtCCTLinVarW_Internalname,httpContext.getMessage( "Variable", ""),"col-sm-3 AttributeFLLabel",Integer.valueOf(1),Boolean.valueOf(true),""});
      /* Div Control */
      Freestylelevel_level1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-sm-9 gx-attribute","left","top","","","div"});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_622_" + sGXsfl_79_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 114,'',false,'" + sGXsfl_79_idx + "',79)\"" ;
      ROClassString = "AttributeFL" ;
      Freestylelevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCCTLinVarW_Internalname,GXutil.rtrim( A4047CCTLinVarW),GXutil.rtrim( localUtil.format( A4047CCTLinVarW, "@!")),TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,114);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCCTLinVarW_Jsonclick,Integer.valueOf(0),"AttributeFL","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtCCTLinVarW_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(32),"chr",Integer.valueOf(1),"row",Integer.valueOf(32),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(79),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      Freestylelevel_level1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Freestylelevel_level1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Freestylelevel_level1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Freestylelevel_level1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Freestylelevel_level1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Freestylelevel_level1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Freestylelevel_level1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      /* Div Control */
      Freestylelevel_level1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","row","left","top","","","div"});
      /* Div Control */
      Freestylelevel_level1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-xs-12","left","top","","","div"});
      /* Div Control */
      Freestylelevel_level1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {divTableab_Internalname+"_"+sGXsfl_79_idx,Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","left","top","","","div"});
      /* Div Control */
      Freestylelevel_level1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","row","left","top","","","div"});
      /* Div Control */
      Freestylelevel_level1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-xs-12 col-sm-4 DataContentCell","left","top","","","div"});
      /* Div Control */
      Freestylelevel_level1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(edtCCTLinLgoD_Visible),Integer.valueOf(0),"px",Integer.valueOf(0),"px","form-group gx-form-group","left","top",""+" data-gx-for=\""+edtCCTLinLgoD_Internalname+"\"","","div"});
      /* Attribute/Variable Label */
      Freestylelevel_level1Row.AddColumnProperties("html_label", -1, isAjaxCallMode( ), new Object[] {edtCCTLinLgoD_Internalname,httpContext.getMessage( "Largo", ""),"col-sm-3 AttributeFLLabel",Integer.valueOf(1),Boolean.valueOf(true),""});
      /* Div Control */
      Freestylelevel_level1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-sm-9 gx-attribute","left","top","","","div"});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_622_" + sGXsfl_79_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 122,'',false,'" + sGXsfl_79_idx + "',79)\"" ;
      ROClassString = "AttributeFL" ;
      Freestylelevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCCTLinLgoD_Internalname,GXutil.ltrim( localUtil.ntoc( A4045CCTLinLgoD, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4045CCTLinLgoD), "ZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,122);\"","'"+""+"'"+",false,"+"'"+""+"'","","","",edtCCTLinLgoD_Invitemessage,edtCCTLinLgoD_Jsonclick,Integer.valueOf(0),"AttributeFL","",ROClassString,"","",Integer.valueOf(edtCCTLinLgoD_Visible),Integer.valueOf(edtCCTLinLgoD_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(3),"chr",Integer.valueOf(1),"row",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(79),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Freestylelevel_level1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Freestylelevel_level1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Freestylelevel_level1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      /* Div Control */
      Freestylelevel_level1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-xs-12 col-sm-4 DataContentCell","left","top","","","div"});
      /* Div Control */
      Freestylelevel_level1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(edtCCTLinPict_Visible),Integer.valueOf(0),"px",Integer.valueOf(0),"px","form-group gx-form-group","left","top",""+" data-gx-for=\""+edtCCTLinPict_Internalname+"\"","","div"});
      /* Attribute/Variable Label */
      Freestylelevel_level1Row.AddColumnProperties("html_label", -1, isAjaxCallMode( ), new Object[] {edtCCTLinPict_Internalname,httpContext.getMessage( "Máscara", ""),"col-sm-3 AttributeFLLabel",Integer.valueOf(1),Boolean.valueOf(true),""});
      /* Div Control */
      Freestylelevel_level1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-sm-9 gx-attribute","left","top","","","div"});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_622_" + sGXsfl_79_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 126,'',false,'" + sGXsfl_79_idx + "',79)\"" ;
      ROClassString = "AttributeFL" ;
      Freestylelevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCCTLinPict_Internalname,GXutil.rtrim( A4046CCTLinPict),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,126);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCCTLinPict_Jsonclick,Integer.valueOf(0),"AttributeFL","",ROClassString,"","",Integer.valueOf(edtCCTLinPict_Visible),Integer.valueOf(edtCCTLinPict_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(40),"chr",Integer.valueOf(1),"row",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(79),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      Freestylelevel_level1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Freestylelevel_level1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Freestylelevel_level1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      /* Div Control */
      Freestylelevel_level1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-xs-12 col-sm-4 DataContentCell","left","top","","","div"});
      /* Div Control */
      Freestylelevel_level1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(edtCCTSta_Visible),Integer.valueOf(0),"px",Integer.valueOf(0),"px","form-group gx-form-group","left","top",""+" data-gx-for=\""+edtCCTSta_Internalname+"\"","","div"});
      /* Attribute/Variable Label */
      Freestylelevel_level1Row.AddColumnProperties("html_label", -1, isAjaxCallMode( ), new Object[] {edtCCTSta_Internalname,httpContext.getMessage( "Standar", ""),"col-sm-3 AttributeFLLabel",Integer.valueOf(1),Boolean.valueOf(true),""});
      /* Div Control */
      Freestylelevel_level1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-sm-9 gx-attribute","left","top","","","div"});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_622_" + sGXsfl_79_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 130,'',false,'" + sGXsfl_79_idx + "',79)\"" ;
      ROClassString = "AttributeFL" ;
      Freestylelevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCCTSta_Internalname,GXutil.rtrim( A4408CCTSta),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,130);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCCTSta_Jsonclick,Integer.valueOf(0),"AttributeFL","",ROClassString,"","",Integer.valueOf(edtCCTSta_Visible),Integer.valueOf(edtCCTSta_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(40),"chr",Integer.valueOf(1),"row",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(79),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      Freestylelevel_level1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Freestylelevel_level1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Freestylelevel_level1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Freestylelevel_level1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Freestylelevel_level1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Freestylelevel_level1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      /* Div Control */
      Freestylelevel_level1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-xs-12","left","top","","","div"});
      /* Div Control */
      Freestylelevel_level1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {divTablelast_Internalname+"_"+sGXsfl_79_idx,Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","left","top","","","div"});
      /* Div Control */
      Freestylelevel_level1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","row","left","top","","","div"});
      /* Div Control */
      Freestylelevel_level1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-xs-12 col-sm-6 DataContentCell DscTop","left","top","","","div"});
      /* Div Control */
      Freestylelevel_level1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","form-group gx-form-group","left","top",""+" data-gx-for=\""+edtCCVNorma_Internalname+"\"","","div"});
      /* Attribute/Variable Label */
      Freestylelevel_level1Row.AddColumnProperties("html_label", -1, isAjaxCallMode( ), new Object[] {edtCCVNorma_Internalname,httpContext.getMessage( "Metodo", "")," AttributeFLLabel",Integer.valueOf(1),Boolean.valueOf(true),""});
      /* Div Control */
      Freestylelevel_level1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px"," gx-attribute","left","top","","","div"});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_622_" + sGXsfl_79_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 137,'',false,'" + sGXsfl_79_idx + "',79)\"" ;
      ROClassString = "AttributeFL" ;
      Freestylelevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCCVNorma_Internalname,GXutil.rtrim( A13249CCVNorma),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,137);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCCVNorma_Jsonclick,Integer.valueOf(0),"AttributeFL","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtCCVNorma_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(30),"chr",Integer.valueOf(1),"row",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(79),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      Freestylelevel_level1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Freestylelevel_level1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Freestylelevel_level1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      /* Div Control */
      Freestylelevel_level1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-xs-12 col-sm-6 DataContentCell","left","top","","","div"});
      /* Div Control */
      Freestylelevel_level1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","form-group gx-form-group","left","top",""+" data-gx-for=\""+edtCCVEspecif_Internalname+"\"","","div"});
      /* Attribute/Variable Label */
      Freestylelevel_level1Row.AddColumnProperties("html_label", -1, isAjaxCallMode( ), new Object[] {edtCCVEspecif_Internalname,httpContext.getMessage( "Especificacion", ""),"col-sm-3 AttributeFLLabel",Integer.valueOf(1),Boolean.valueOf(true),""});
      /* Div Control */
      Freestylelevel_level1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-sm-9 gx-attribute","left","top","","","div"});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_622_" + sGXsfl_79_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 141,'',false,'" + sGXsfl_79_idx + "',79)\"" ;
      ROClassString = "AttributeFL" ;
      Freestylelevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCCVEspecif_Internalname,GXutil.rtrim( A13250CCVEspecif),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,141);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCCVEspecif_Jsonclick,Integer.valueOf(0),"AttributeFL","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtCCVEspecif_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(30),"chr",Integer.valueOf(1),"row",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(79),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      Freestylelevel_level1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Freestylelevel_level1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Freestylelevel_level1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Freestylelevel_level1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Freestylelevel_level1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Freestylelevel_level1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Freestylelevel_level1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      /* Div Control */
      Freestylelevel_level1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","row","left","top","","","div"});
      /* Div Control */
      Freestylelevel_level1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-xs-12","left","top","","","div"});
      /* Div Control */
      Freestylelevel_level1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {divTableempty_Internalname+"_"+sGXsfl_79_idx,Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","left","top","","","div"});
      /* Div Control */
      Freestylelevel_level1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","row","left","top","","","div"});
      /* Div Control */
      Freestylelevel_level1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-xs-12 DataContentCell","left","top","","","div"});
      /* Div Control */
      Freestylelevel_level1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","form-group gx-form-group","left","top",""+" data-gx-for=\""+edtCCTLinDscL_Internalname+"\"","","div"});
      /* Attribute/Variable Label */
      Freestylelevel_level1Row.AddColumnProperties("html_label", -1, isAjaxCallMode( ), new Object[] {edtCCTLinDscL_Internalname,httpContext.getMessage( "Desc. Larga", ""),"col-sm-3 AttributeFLLabel",Integer.valueOf(1),Boolean.valueOf(true),""});
      /* Div Control */
      Freestylelevel_level1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-sm-9 gx-attribute","left","top","","","div"});
      /* Multiple line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_622_" + sGXsfl_79_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 149,'',false,'" + sGXsfl_79_idx + "',79)\"" ;
      ClassString = "AttributeFL" ;
      StyleString = "" ;
      ClassString = "AttributeFL" ;
      StyleString = "" ;
      Freestylelevel_level1Row.AddColumnProperties("html_textarea", 1, isAjaxCallMode( ), new Object[] {edtCCTLinDscL_Internalname,A11476CCTLinDscL,"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,149);\"",Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(edtCCTLinDscL_Enabled),Integer.valueOf(0),Integer.valueOf(80),"chr",Integer.valueOf(10),"row",Integer.valueOf(0),StyleString,ClassString,"","","2048",Integer.valueOf(-1),Integer.valueOf(2),"","",Integer.valueOf(-1),Boolean.valueOf(true),"","'"+""+"'"+",false,"+"'"+""+"'",Integer.valueOf(0)});
      Freestylelevel_level1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Freestylelevel_level1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Freestylelevel_level1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Freestylelevel_level1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Freestylelevel_level1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Freestylelevel_level1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      /* Div Control */
      Freestylelevel_level1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-xs-12 CellMarginTop","left","top","","","div"});
      /* Div Control */
      Freestylelevel_level1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {divTableleaflevel_level2_Internalname+"_"+sGXsfl_79_idx,Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","left","top","","","div"});
      /* Div Control */
      Freestylelevel_level1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","row","left","top","","","div"});
      /* Div Control */
      Freestylelevel_level1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-xs-12 SectionGrid EditableGridCell_LinedAtts","left","top","","","div"});
      /*  Child Grid Control  */
      Freestylelevel_level1Row.AddColumnProperties("subfile", -1, isAjaxCallMode( ), new Object[] {"Gridlevel_level2Container"});
      if ( isAjaxCallMode( ) )
      {
         Gridlevel_level2Container = new com.genexus.webpanels.GXWebGrid(context);
      }
      else
      {
         Gridlevel_level2Container.Clear();
      }
      startgridcontrol154( ) ;
      nGXsfl_154_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount623 = (short)(0) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_623 = (short)(1) ;
            scanStartIA623( ) ;
            while ( RcdFound623 != 0 )
            {
               init_level_properties623( ) ;
               getByPrimaryKeyIA623( ) ;
               addRowIA623( ) ;
               scanNextIA623( ) ;
            }
            scanEndIA623( ) ;
            nBlankRcdCount623 = (short)(0) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModalIA623( ) ;
         standaloneModalIA623( ) ;
         sMode623 = Gx_mode ;
         while ( nGXsfl_154_idx < nRC_GXsfl_154 )
         {
            bGXsfl_154_Refreshing = true ;
            readRowIA623( ) ;
            edtCCTValLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CCTVALLIN_"+sGXsfl_154_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCTValLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTValLin_Enabled), 5, 0), !bGXsfl_154_Refreshing);
            edtCCTValDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CCTVALDSC_"+sGXsfl_154_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCTValDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTValDsc_Enabled), 5, 0), !bGXsfl_154_Refreshing);
            edtCCTVal_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CCTVAL_"+sGXsfl_154_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCTVal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTVal_Enabled), 5, 0), !bGXsfl_154_Refreshing);
            if ( ( nRcdExists_623 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModalIA623( ) ;
            }
            sendRowIA623( ) ;
            bGXsfl_154_Refreshing = false ;
         }
         Gx_mode = sMode623 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount623 = (short)(0) ;
         nRcdExists_623 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStartIA623( ) ;
            while ( RcdFound623 != 0 )
            {
               sGXsfl_154_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_154_idx+1), 4, 0), (short)(4), "0") + sGXsfl_79_idx ;
               subsflControlProps_154623( ) ;
               init_level_properties623( ) ;
               standaloneNotModalIA623( ) ;
               getByPrimaryKeyIA623( ) ;
               standaloneModalIA623( ) ;
               addRowIA623( ) ;
               scanNextIA623( ) ;
            }
            scanEndIA623( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      if ( ! isDsp( ) && ! isDlt( ) )
      {
         sMode623 = Gx_mode ;
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         sGXsfl_154_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_154_idx+1), 4, 0), (short)(4), "0") + sGXsfl_79_idx ;
         subsflControlProps_154623( ) ;
         initAllIA623( ) ;
         init_level_properties623( ) ;
         nRcdExists_623 = (short)(0) ;
         nIsMod_623 = (short)(0) ;
         nRcdDeleted_623 = (short)(0) ;
         if ( ( CommonUtil.decimalVal( EvtGridId, ".").add(CommonUtil.decimalVal( EvtRowId, ".")).doubleValue() == 0 ) || ( 79 == CommonUtil.decimalVal( EvtGridId, ".").doubleValue() ) && ( DecimalUtil.compareTo(CommonUtil.decimalVal( EvtRowId, "."), CommonUtil.decimalVal( sGXsfl_79_idx, ".")) == 0 ) )
         {
            nBlankRcdCount623 = (short)(nBlankRcdUsr623+nBlankRcdCount623) ;
         }
         fRowAdded = 0 ;
         while ( nBlankRcdCount623 > 0 )
         {
            standaloneNotModalIA623( ) ;
            standaloneModalIA623( ) ;
            addRowIA623( ) ;
            if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
            {
               fRowAdded = 1 ;
               GX_FocusControl = edtCCTValLin_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            nBlankRcdCount623 = (short)(nBlankRcdCount623-1) ;
         }
         Gx_mode = sMode623 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( ! isAjaxCallMode( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridlevel_level2ContainerData"+"_"+sGXsfl_79_idx, Gridlevel_level2Container.ToJavascriptSource());
      }
      if ( isAjaxCallMode( ) )
      {
         Freestylelevel_level1Row.AddGrid("Gridlevel_level2", Gridlevel_level2Container);
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridlevel_level2ContainerData"+"V_"+sGXsfl_79_idx, Gridlevel_level2Container.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Gridlevel_level2ContainerData"+"V_"+sGXsfl_79_idx+"\" value='"+Gridlevel_level2Container.GridValuesHidden()+"'/>") ;
      }
      Freestylelevel_level1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Freestylelevel_level1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Freestylelevel_level1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Freestylelevel_level1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Freestylelevel_level1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Freestylelevel_level1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Freestylelevel_level1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Freestylelevel_level1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      /* Div Control */
      Freestylelevel_level1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","row","left","top","","","div"});
      /* Div Control */
      Freestylelevel_level1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-xs-12 Invisible","left","top","","","div"});
      /* Table start */
      Freestylelevel_level1Row.AddColumnProperties("table", -1, isAjaxCallMode( ), new Object[] {tblUnnamedtablecontentfsfreestylelevel_level1_Internalname+"_"+sGXsfl_79_idx,Integer.valueOf(1),"Table","","","","","","",Integer.valueOf(1),Integer.valueOf(2),"","","","px","px",""});
      Freestylelevel_level1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Freestylelevel_level1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Div Control */
      Freestylelevel_level1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px"," gx-attribute","left","top","","","div"});
      /* Attribute/Variable Label */
      Freestylelevel_level1Row.AddColumnProperties("html_label", -1, isAjaxCallMode( ), new Object[] {edtCCVPict_Internalname,httpContext.getMessage( "Mascara", ""),"gx-form-item AttributeLabel",Integer.valueOf(0),Boolean.valueOf(true),"width: 25%;"});
      /* Single line edit */
      ROClassString = "Attribute" ;
      Freestylelevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCCVPict_Internalname,GXutil.rtrim( A11526CCVPict),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCCVPict_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(edtCCVPict_Visible),Integer.valueOf(edtCCVPict_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(40),"chr",Integer.valueOf(1),"row",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(79),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      Freestylelevel_level1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Freestylelevel_level1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Div Control */
      Freestylelevel_level1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px"," gx-attribute","left","top","","","div"});
      /* Attribute/Variable Label */
      Freestylelevel_level1Row.AddColumnProperties("html_label", -1, isAjaxCallMode( ), new Object[] {edtCCVTpoDat_Internalname,httpContext.getMessage( "Tipo de Datos", ""),"gx-form-item AttributeLabel",Integer.valueOf(0),Boolean.valueOf(true),"width: 25%;"});
      /* Single line edit */
      ROClassString = "Attribute" ;
      Freestylelevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCCVTpoDat_Internalname,GXutil.rtrim( A11528CCVTpoDat),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCCVTpoDat_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(edtCCVTpoDat_Visible),Integer.valueOf(edtCCVTpoDat_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(1),"chr",Integer.valueOf(1),"row",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(79),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      Freestylelevel_level1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Freestylelevel_level1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Div Control */
      Freestylelevel_level1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px"," gx-attribute","left","top","","","div"});
      /* Attribute/Variable Label */
      Freestylelevel_level1Row.AddColumnProperties("html_label", -1, isAjaxCallMode( ), new Object[] {edtCCVDsc_Internalname,httpContext.getMessage( "Descripción", ""),"gx-form-item AttributeLabel",Integer.valueOf(0),Boolean.valueOf(true),"width: 25%;"});
      /* Single line edit */
      ROClassString = "Attribute" ;
      Freestylelevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCCVDsc_Internalname,GXutil.rtrim( A11529CCVDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCCVDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(edtCCVDsc_Visible),Integer.valueOf(edtCCVDsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(30),"chr",Integer.valueOf(1),"row",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(79),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      Freestylelevel_level1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      /* End of table */
      Freestylelevel_level1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Freestylelevel_level1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Freestylelevel_level1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      httpContext.ajax_sending_grid_row(Freestylelevel_level1Row);
      send_integrity_lvl_hashesIA622( ) ;
      GXCCtl = "Z4034CCTLin_" + sGXsfl_79_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z4034CCTLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z4045CCTLinLgoD_" + sGXsfl_79_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z4045CCTLinLgoD, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z4046CCTLinPict_" + sGXsfl_79_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z4046CCTLinPict));
      GXCCtl = "Z4048CCTLinTpoI_" + sGXsfl_79_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z4048CCTLinTpoI));
      GXCCtl = "Z4044CCTLinTpoD_" + sGXsfl_79_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z4044CCTLinTpoD));
      GXCCtl = "Z4043CCTLinDsc_" + sGXsfl_79_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z4043CCTLinDsc));
      GXCCtl = "Z4047CCTLinVarW_" + sGXsfl_79_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z4047CCTLinVarW));
      GXCCtl = "Z4408CCTSta_" + sGXsfl_79_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z4408CCTSta));
      GXCCtl = "Z13249CCVNorma_" + sGXsfl_79_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z13249CCVNorma));
      GXCCtl = "Z13250CCVEspecif_" + sGXsfl_79_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z13250CCVEspecif));
      GXCCtl = "Z11476CCTLinDscL_" + sGXsfl_79_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, Z11476CCTLinDscL);
      GXCCtl = "Z11522CCVCod_" + sGXsfl_79_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z11522CCVCod));
      GXCCtl = "nRC_GXsfl_154_" + sGXsfl_79_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nGXsfl_154_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_622_" + sGXsfl_79_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_622, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_622_" + sGXsfl_79_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_622, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_622_" + sGXsfl_79_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_622, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "N4034CCTLin_" + sGXsfl_79_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( A4034CCTLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "N11522CCVCod_" + sGXsfl_79_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( A11522CCVCod));
      GXCCtl = "N4044CCTLinTpoD_" + sGXsfl_79_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( A4044CCTLinTpoD));
      GXCCtl = "N4043CCTLinDsc_" + sGXsfl_79_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( A4043CCTLinDsc));
      GXCCtl = "N4045CCTLinLgoD_" + sGXsfl_79_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( A4045CCTLinLgoD, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "N4046CCTLinPict_" + sGXsfl_79_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( A4046CCTLinPict));
      GXCCtl = "N4408CCTSta_" + sGXsfl_79_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( A4408CCTSta));
      GXCCtl = "vMODE_" + sGXsfl_79_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Gx_mode));
      GXCCtl = "vTRNCONTEXT_" + sGXsfl_79_idx ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, GXCCtl, AV31TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(GXCCtl, AV31TrnContext);
      }
      GXCCtl = "vUPLOADEDFILES_" + sGXsfl_79_idx ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, GXCCtl, AV33UploadedFiles);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(GXCCtl, AV33UploadedFiles);
      }
      GXCCtl = "vARCHIVO_GXI_" + sGXsfl_79_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, AV46Archivo_GXI);
      GXCCtl = "vEMPRCOD_" + sGXsfl_79_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV28EmprCod));
      GXCCtl = "vCCTCOD_" + sGXsfl_79_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV29CCTCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vISVARIABLE_" + sGXsfl_79_idx ;
      app.GxWebStd.gx_boolean_hidden_field( httpContext, GXCCtl, AV37isVariable);
      app.GxWebStd.gx_hidden_field( httpContext, "CCTLIN_"+sGXsfl_79_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCTLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CCTLIN_"+sGXsfl_79_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtCCTLin_Visible, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CCTLINTPOI_"+sGXsfl_79_idx+"Visible", GXutil.ltrim( localUtil.ntoc( cmbCCTLinTpoI.getVisible(), (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CCTLINTPOI_"+sGXsfl_79_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbCCTLinTpoI.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CCVCOD_"+sGXsfl_79_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( dynCCVCod.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CCTLINTPOD_"+sGXsfl_79_idx+"Visible", GXutil.ltrim( localUtil.ntoc( cmbCCTLinTpoD.getVisible(), (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CCTLINTPOD_"+sGXsfl_79_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbCCTLinTpoD.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CCTLINDSC_"+sGXsfl_79_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCTLinDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CCTLINDSC_"+sGXsfl_79_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtCCTLinDsc_Visible, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CCTLINVARW_"+sGXsfl_79_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCTLinVarW_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CCTLINLGOD_"+sGXsfl_79_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCTLinLgoD_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CCTLINLGOD_"+sGXsfl_79_idx+"Invitemessage", GXutil.rtrim( edtCCTLinLgoD_Invitemessage));
      app.GxWebStd.gx_hidden_field( httpContext, "CCTLINLGOD_"+sGXsfl_79_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtCCTLinLgoD_Visible, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CCTLINPICT_"+sGXsfl_79_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCTLinPict_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CCTLINPICT_"+sGXsfl_79_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtCCTLinPict_Visible, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CCTSTA_"+sGXsfl_79_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCTSta_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CCTSTA_"+sGXsfl_79_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtCCTSta_Visible, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CCVNORMA_"+sGXsfl_79_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCVNorma_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CCVESPECIF_"+sGXsfl_79_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCVEspecif_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CCTLINDSCL_"+sGXsfl_79_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCTLinDscL_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CCVPICT_"+sGXsfl_79_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCVPict_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CCVPICT_"+sGXsfl_79_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtCCVPict_Visible, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CCVTPODAT_"+sGXsfl_79_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCVTpoDat_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CCVTPODAT_"+sGXsfl_79_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtCCVTpoDat_Visible, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CCVDSC_"+sGXsfl_79_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCVDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CCVDSC_"+sGXsfl_79_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtCCVDsc_Visible, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      /* End of Columns property logic. */
      Freestylelevel_level1Container.AddRow(Freestylelevel_level1Row);
   }

   public void readRowIA622( )
   {
      nGXsfl_79_idx = (int)(nGXsfl_79_idx+1) ;
      sGXsfl_79_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_79_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_79622( ) ;
      edtCCTLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CCTLIN_"+sGXsfl_79_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCCTLin_Visible = (int)(localUtil.ctol( httpContext.cgiGet( "CCTLIN_"+sGXsfl_79_idx+"Visible"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      cmbCCTLinTpoI.setVisible( (int)(localUtil.ctol( httpContext.cgiGet( "CCTLINTPOI_"+sGXsfl_79_idx+"Visible"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
      cmbCCTLinTpoI.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "CCTLINTPOI_"+sGXsfl_79_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
      dynCCVCod.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "CCVCOD_"+sGXsfl_79_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
      cmbCCTLinTpoD.setVisible( (int)(localUtil.ctol( httpContext.cgiGet( "CCTLINTPOD_"+sGXsfl_79_idx+"Visible"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
      cmbCCTLinTpoD.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "CCTLINTPOD_"+sGXsfl_79_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
      edtCCTLinDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CCTLINDSC_"+sGXsfl_79_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCCTLinDsc_Visible = (int)(localUtil.ctol( httpContext.cgiGet( "CCTLINDSC_"+sGXsfl_79_idx+"Visible"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCCTLinVarW_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CCTLINVARW_"+sGXsfl_79_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCCTLinLgoD_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CCTLINLGOD_"+sGXsfl_79_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCCTLinLgoD_Invitemessage = httpContext.cgiGet( "CCTLINLGOD_"+sGXsfl_79_idx+"Invitemessage") ;
      edtCCTLinLgoD_Visible = (int)(localUtil.ctol( httpContext.cgiGet( "CCTLINLGOD_"+sGXsfl_79_idx+"Visible"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCCTLinPict_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CCTLINPICT_"+sGXsfl_79_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCCTLinPict_Visible = (int)(localUtil.ctol( httpContext.cgiGet( "CCTLINPICT_"+sGXsfl_79_idx+"Visible"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCCTSta_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CCTSTA_"+sGXsfl_79_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCCTSta_Visible = (int)(localUtil.ctol( httpContext.cgiGet( "CCTSTA_"+sGXsfl_79_idx+"Visible"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCCVNorma_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CCVNORMA_"+sGXsfl_79_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCCVEspecif_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CCVESPECIF_"+sGXsfl_79_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCCTLinDscL_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CCTLINDSCL_"+sGXsfl_79_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCCVPict_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CCVPICT_"+sGXsfl_79_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCCVPict_Visible = (int)(localUtil.ctol( httpContext.cgiGet( "CCVPICT_"+sGXsfl_79_idx+"Visible"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCCVTpoDat_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CCVTPODAT_"+sGXsfl_79_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCCVTpoDat_Visible = (int)(localUtil.ctol( httpContext.cgiGet( "CCVTPODAT_"+sGXsfl_79_idx+"Visible"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCCVDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CCVDSC_"+sGXsfl_79_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCCVDsc_Visible = (int)(localUtil.ctol( httpContext.cgiGet( "CCVDSC_"+sGXsfl_79_idx+"Visible"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCCTLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCCTLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "CCTLIN_" + sGXsfl_79_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtCCTLin_Internalname ;
         wbErr = true ;
         A4034CCTLin = (short)(0) ;
      }
      else
      {
         A4034CCTLin = (short)(localUtil.ctol( httpContext.cgiGet( edtCCTLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      cmbCCTLinTpoI.setName( cmbCCTLinTpoI.getInternalname() );
      cmbCCTLinTpoI.setValue( httpContext.cgiGet( cmbCCTLinTpoI.getInternalname()) );
      A4048CCTLinTpoI = httpContext.cgiGet( cmbCCTLinTpoI.getInternalname()) ;
      dynCCVCod.setName( dynCCVCod.getInternalname() );
      dynCCVCod.setValue( httpContext.cgiGet( dynCCVCod.getInternalname()) );
      A11522CCVCod = httpContext.cgiGet( dynCCVCod.getInternalname()) ;
      cmbCCTLinTpoD.setName( cmbCCTLinTpoD.getInternalname() );
      cmbCCTLinTpoD.setValue( httpContext.cgiGet( cmbCCTLinTpoD.getInternalname()) );
      A4044CCTLinTpoD = httpContext.cgiGet( cmbCCTLinTpoD.getInternalname()) ;
      A4043CCTLinDsc = httpContext.cgiGet( edtCCTLinDsc_Internalname) ;
      A4047CCTLinVarW = GXutil.upper( httpContext.cgiGet( edtCCTLinVarW_Internalname)) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCCTLinLgoD_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCCTLinLgoD_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
      {
         GXCCtl = "CCTLINLGOD_" + sGXsfl_79_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtCCTLinLgoD_Internalname ;
         wbErr = true ;
         A4045CCTLinLgoD = (short)(0) ;
      }
      else
      {
         A4045CCTLinLgoD = (short)(localUtil.ctol( httpContext.cgiGet( edtCCTLinLgoD_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A4046CCTLinPict = httpContext.cgiGet( edtCCTLinPict_Internalname) ;
      A4408CCTSta = httpContext.cgiGet( edtCCTSta_Internalname) ;
      A13249CCVNorma = httpContext.cgiGet( edtCCVNorma_Internalname) ;
      A13250CCVEspecif = httpContext.cgiGet( edtCCVEspecif_Internalname) ;
      A11476CCTLinDscL = httpContext.cgiGet( edtCCTLinDscL_Internalname) ;
      A11526CCVPict = httpContext.cgiGet( edtCCVPict_Internalname) ;
      n11526CCVPict = false ;
      A11528CCVTpoDat = httpContext.cgiGet( edtCCVTpoDat_Internalname) ;
      n11528CCVTpoDat = false ;
      A11529CCVDsc = httpContext.cgiGet( edtCCVDsc_Internalname) ;
      n11529CCVDsc = false ;
      GXCCtl = "Z4034CCTLin_" + sGXsfl_79_idx ;
      Z4034CCTLin = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z4045CCTLinLgoD_" + sGXsfl_79_idx ;
      Z4045CCTLinLgoD = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z4046CCTLinPict_" + sGXsfl_79_idx ;
      Z4046CCTLinPict = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z4048CCTLinTpoI_" + sGXsfl_79_idx ;
      Z4048CCTLinTpoI = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z4044CCTLinTpoD_" + sGXsfl_79_idx ;
      Z4044CCTLinTpoD = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z4043CCTLinDsc_" + sGXsfl_79_idx ;
      Z4043CCTLinDsc = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z4047CCTLinVarW_" + sGXsfl_79_idx ;
      Z4047CCTLinVarW = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z4408CCTSta_" + sGXsfl_79_idx ;
      Z4408CCTSta = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z13249CCVNorma_" + sGXsfl_79_idx ;
      Z13249CCVNorma = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z13250CCVEspecif_" + sGXsfl_79_idx ;
      Z13250CCVEspecif = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z11476CCTLinDscL_" + sGXsfl_79_idx ;
      Z11476CCTLinDscL = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z11522CCVCod_" + sGXsfl_79_idx ;
      Z11522CCVCod = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "nRC_GXsfl_154_" + sGXsfl_79_idx ;
      nRC_GXsfl_154 = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdDeleted_622_" + sGXsfl_79_idx ;
      nRcdDeleted_622 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_622_" + sGXsfl_79_idx ;
      nRcdExists_622 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_622_" + sGXsfl_79_idx ;
      nIsMod_622 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "N4034CCTLin_" + sGXsfl_79_idx ;
      N4034CCTLin = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "N11522CCVCod_" + sGXsfl_79_idx ;
      N11522CCVCod = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "N4044CCTLinTpoD_" + sGXsfl_79_idx ;
      N4044CCTLinTpoD = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "N4043CCTLinDsc_" + sGXsfl_79_idx ;
      N4043CCTLinDsc = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "N4045CCTLinLgoD_" + sGXsfl_79_idx ;
      N4045CCTLinLgoD = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "N4046CCTLinPict_" + sGXsfl_79_idx ;
      N4046CCTLinPict = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "N4408CCTSta_" + sGXsfl_79_idx ;
      N4408CCTSta = httpContext.cgiGet( GXCCtl) ;
   }

   public void subsflControlProps_154623( )
   {
      edtCCTValLin_Internalname = "CCTVALLIN_"+sGXsfl_154_idx ;
      edtCCTValDsc_Internalname = "CCTVALDSC_"+sGXsfl_154_idx ;
      edtCCTVal_Internalname = "CCTVAL_"+sGXsfl_154_idx ;
   }

   public void subsflControlProps_fel_154623( )
   {
      edtCCTValLin_Internalname = "CCTVALLIN_"+sGXsfl_154_fel_idx ;
      edtCCTValDsc_Internalname = "CCTVALDSC_"+sGXsfl_154_fel_idx ;
      edtCCTVal_Internalname = "CCTVAL_"+sGXsfl_154_fel_idx ;
   }

   public void addRowIA623( )
   {
      nGXsfl_154_idx = (int)(nGXsfl_154_idx+1) ;
      sGXsfl_154_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_154_idx), 4, 0), (short)(4), "0") + sGXsfl_79_idx ;
      subsflControlProps_154623( ) ;
      sendRowIA623( ) ;
   }

   public void sendRowIA623( )
   {
      Gridlevel_level2Row = GXWebRow.GetNew(context) ;
      if ( subGridlevel_level2_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGridlevel_level2_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGridlevel_level2_Class, "") != 0 )
         {
            subGridlevel_level2_Linesclass = subGridlevel_level2_Class+"Odd" ;
         }
      }
      else if ( subGridlevel_level2_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGridlevel_level2_Backstyle = (byte)(0) ;
         subGridlevel_level2_Backcolor = subGridlevel_level2_Allbackcolor ;
         if ( GXutil.strcmp(subGridlevel_level2_Class, "") != 0 )
         {
            subGridlevel_level2_Linesclass = subGridlevel_level2_Class+"Uniform" ;
         }
      }
      else if ( subGridlevel_level2_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGridlevel_level2_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGridlevel_level2_Class, "") != 0 )
         {
            subGridlevel_level2_Linesclass = subGridlevel_level2_Class+"Odd" ;
         }
         subGridlevel_level2_Backcolor = (int)(0x0) ;
      }
      else if ( subGridlevel_level2_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGridlevel_level2_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_154_idx) % (2))) == 0 )
         {
            subGridlevel_level2_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridlevel_level2_Class, "") != 0 )
            {
               subGridlevel_level2_Linesclass = subGridlevel_level2_Class+"Even" ;
            }
         }
         else
         {
            subGridlevel_level2_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridlevel_level2_Class, "") != 0 )
            {
               subGridlevel_level2_Linesclass = subGridlevel_level2_Class+"Odd" ;
            }
         }
      }
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_623_" + sGXsfl_154_idx + "',1);gx.fn.setControlValue('nIsMod_622_" + sGXsfl_79_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 155,'',false,'" + sGXsfl_154_idx + "',154)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCCTValLin_Internalname,GXutil.ltrim( localUtil.ntoc( A4049CCTValLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4049CCTValLin), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,155);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCCTValLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtCCTValLin_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(154),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_623_" + sGXsfl_154_idx + "',1);gx.fn.setControlValue('nIsMod_622_" + sGXsfl_79_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 156,'',false,'" + sGXsfl_154_idx + "',154)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCCTValDsc_Internalname,GXutil.rtrim( A4050CCTValDsc),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,156);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCCTValDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtCCTValDsc_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(154),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_623_" + sGXsfl_154_idx + "',1);gx.fn.setControlValue('nIsMod_622_" + sGXsfl_79_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 157,'',false,'" + sGXsfl_154_idx + "',154)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCCTVal_Internalname,GXutil.rtrim( A4051CCTVal),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,157);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCCTVal_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtCCTVal_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(154),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Gridlevel_level2Row);
      send_integrity_lvl_hashesIA623( ) ;
      GXCCtl = "Z4049CCTValLin_" + sGXsfl_154_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z4049CCTValLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z4050CCTValDsc_" + sGXsfl_154_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z4050CCTValDsc));
      GXCCtl = "Z4051CCTVal_" + sGXsfl_154_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z4051CCTVal));
      GXCCtl = "nRcdDeleted_623_" + sGXsfl_154_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_623, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_623_" + sGXsfl_154_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_623, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_623_" + sGXsfl_154_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_623, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "N4049CCTValLin_" + sGXsfl_154_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( A4049CCTValLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "N4050CCTValDsc_" + sGXsfl_154_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( A4050CCTValDsc));
      GXCCtl = "N4051CCTVal_" + sGXsfl_154_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( A4051CCTVal));
      GXCCtl = "vMODE_" + sGXsfl_154_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Gx_mode));
      GXCCtl = "vTRNCONTEXT_" + sGXsfl_154_idx ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, GXCCtl, AV31TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(GXCCtl, AV31TrnContext);
      }
      GXCCtl = "vUPLOADEDFILES_" + sGXsfl_154_idx ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, GXCCtl, AV33UploadedFiles);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(GXCCtl, AV33UploadedFiles);
      }
      GXCCtl = "vARCHIVO_GXI_" + sGXsfl_154_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, AV46Archivo_GXI);
      GXCCtl = "vEMPRCOD_" + sGXsfl_154_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV28EmprCod));
      GXCCtl = "vCCTCOD_" + sGXsfl_154_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV29CCTCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vISVARIABLE_" + sGXsfl_154_idx ;
      app.GxWebStd.gx_boolean_hidden_field( httpContext, GXCCtl, AV37isVariable);
      app.GxWebStd.gx_hidden_field( httpContext, "CCTVALLIN_"+sGXsfl_154_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCTValLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CCTVALDSC_"+sGXsfl_154_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCTValDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CCTVAL_"+sGXsfl_154_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCTVal_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Gridlevel_level2Container.AddRow(Gridlevel_level2Row);
   }

   public void readRowIA623( )
   {
      nGXsfl_154_idx = (int)(nGXsfl_154_idx+1) ;
      sGXsfl_154_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_154_idx), 4, 0), (short)(4), "0") + sGXsfl_79_idx ;
      subsflControlProps_154623( ) ;
      edtCCTValLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CCTVALLIN_"+sGXsfl_154_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCCTValDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CCTVALDSC_"+sGXsfl_154_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCCTVal_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CCTVAL_"+sGXsfl_154_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCCTValLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCCTValLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
      {
         GXCCtl = "CCTVALLIN_" + sGXsfl_154_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtCCTValLin_Internalname ;
         wbErr = true ;
         A4049CCTValLin = (byte)(0) ;
      }
      else
      {
         A4049CCTValLin = (byte)(localUtil.ctol( httpContext.cgiGet( edtCCTValLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A4050CCTValDsc = httpContext.cgiGet( edtCCTValDsc_Internalname) ;
      A4051CCTVal = httpContext.cgiGet( edtCCTVal_Internalname) ;
      GXCCtl = "Z4049CCTValLin_" + sGXsfl_154_idx ;
      Z4049CCTValLin = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z4050CCTValDsc_" + sGXsfl_154_idx ;
      Z4050CCTValDsc = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z4051CCTVal_" + sGXsfl_154_idx ;
      Z4051CCTVal = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "nRcdDeleted_623_" + sGXsfl_154_idx ;
      nRcdDeleted_623 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_623_" + sGXsfl_154_idx ;
      nRcdExists_623 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_623_" + sGXsfl_154_idx ;
      nIsMod_623 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "N4049CCTValLin_" + sGXsfl_154_idx ;
      N4049CCTValLin = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "N4050CCTValDsc_" + sGXsfl_154_idx ;
      N4050CCTValDsc = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "N4051CCTVal_" + sGXsfl_154_idx ;
      N4051CCTVal = httpContext.cgiGet( GXCCtl) ;
   }

   public void subsflControlProps_1811529( )
   {
      edtCCTNotId_Internalname = "CCTNOTID_"+sGXsfl_181_idx ;
      cmbCCTNotEvt.setInternalname( "CCTNOTEVT_"+sGXsfl_181_idx );
      cmbCCTNotDst.setInternalname( "CCTNOTDST_"+sGXsfl_181_idx );
      dynCCTNotUsr.setInternalname( "CCTNOTUSR_"+sGXsfl_181_idx );
      edtCCTNotEml_Internalname = "CCTNOTEML_"+sGXsfl_181_idx ;
      edtCCTNotAsu_Internalname = "CCTNOTASU_"+sGXsfl_181_idx ;
      edtCCTNotTxt_Internalname = "CCTNOTTXT_"+sGXsfl_181_idx ;
      cmbCCTNotAdj.setInternalname( "CCTNOTADJ_"+sGXsfl_181_idx );
      cmbCCTNotStp.setInternalname( "CCTNOTSTP_"+sGXsfl_181_idx );
   }

   public void subsflControlProps_fel_1811529( )
   {
      edtCCTNotId_Internalname = "CCTNOTID_"+sGXsfl_181_fel_idx ;
      cmbCCTNotEvt.setInternalname( "CCTNOTEVT_"+sGXsfl_181_fel_idx );
      cmbCCTNotDst.setInternalname( "CCTNOTDST_"+sGXsfl_181_fel_idx );
      dynCCTNotUsr.setInternalname( "CCTNOTUSR_"+sGXsfl_181_fel_idx );
      edtCCTNotEml_Internalname = "CCTNOTEML_"+sGXsfl_181_fel_idx ;
      edtCCTNotAsu_Internalname = "CCTNOTASU_"+sGXsfl_181_fel_idx ;
      edtCCTNotTxt_Internalname = "CCTNOTTXT_"+sGXsfl_181_fel_idx ;
      cmbCCTNotAdj.setInternalname( "CCTNOTADJ_"+sGXsfl_181_fel_idx );
      cmbCCTNotStp.setInternalname( "CCTNOTSTP_"+sGXsfl_181_fel_idx );
   }

   public void addRowIA1529( )
   {
      nGXsfl_181_idx = (int)(nGXsfl_181_idx+1) ;
      sGXsfl_181_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_181_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1811529( ) ;
      sendRowIA1529( ) ;
   }

   public void sendRowIA1529( )
   {
      Gridlevel_notificacionesRow = GXWebRow.GetNew(context) ;
      if ( subGridlevel_notificaciones_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGridlevel_notificaciones_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGridlevel_notificaciones_Class, "") != 0 )
         {
            subGridlevel_notificaciones_Linesclass = subGridlevel_notificaciones_Class+"Odd" ;
         }
      }
      else if ( subGridlevel_notificaciones_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGridlevel_notificaciones_Backstyle = (byte)(0) ;
         subGridlevel_notificaciones_Backcolor = subGridlevel_notificaciones_Allbackcolor ;
         if ( GXutil.strcmp(subGridlevel_notificaciones_Class, "") != 0 )
         {
            subGridlevel_notificaciones_Linesclass = subGridlevel_notificaciones_Class+"Uniform" ;
         }
      }
      else if ( subGridlevel_notificaciones_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGridlevel_notificaciones_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGridlevel_notificaciones_Class, "") != 0 )
         {
            subGridlevel_notificaciones_Linesclass = subGridlevel_notificaciones_Class+"Odd" ;
         }
         subGridlevel_notificaciones_Backcolor = (int)(0x0) ;
      }
      else if ( subGridlevel_notificaciones_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGridlevel_notificaciones_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_181_idx) % (2))) == 0 )
         {
            subGridlevel_notificaciones_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridlevel_notificaciones_Class, "") != 0 )
            {
               subGridlevel_notificaciones_Linesclass = subGridlevel_notificaciones_Class+"Even" ;
            }
         }
         else
         {
            subGridlevel_notificaciones_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridlevel_notificaciones_Class, "") != 0 )
            {
               subGridlevel_notificaciones_Linesclass = subGridlevel_notificaciones_Class+"Odd" ;
            }
         }
      }
      /* * Property Link not supported in */
      /* * Property Link not supported in */
      /* * Property Link not supported in */
      /* * Property Link not supported in */
      /*
         Assignment error:
         ================
         Expression: [ t('iif(',1),t('Gx_mode',23),t(=,10),t('''DSP''',3),t('OR',9),t('Gx_mode',23),t(=,10),t('''UPD''',3),t(',',7),t('""',3),t(',',7),t('"javascript:"',3),t(+,5),t('"gx.popup.openPrompt(''"',3),t(+,5),t('"app.controlcalidadhtd.tccdeftccdefpromptnotifprompt"',3),t(+,5),t('"'',["',3),t(+,5),t('"{Ctrl:gx.dom.el(''"',3),t(+,5),t('"EMPRCOD"',3),t(+,5),t('"''), id:''"',3),t(+,5),t('"EMPRCOD"',3),t(+,5),t('"''"',3),t(+,5),t('",IOType:''inout''}"',3),t(+,5),t('","',3),t(+,5),t('"{Ctrl:gx.dom.el(''"',3),t(+,5),t('"CCTCOD"',3),t(+,5),t('"''), id:''"',3),t(+,5),t('"CCTCOD"',3),t(+,5),t('"''"',3),t(+,5),t('",IOType:''inout'',isKey:true,isLastKey:true}"',3),t(+,5),t('","',3),t(+,5),t('"{Ctrl:gx.dom.el(''"',3),t(+,5),t('"CCTNOTID_"',3),t(+,5),t(sGXsfl_181_idx,23),t(+,5),t('"''), id:''"',3),t(+,5),t('"CCTNOTID_"',3),t(+,5),t(sGXsfl_181_idx,23),t(+,5),t('"''"',3),t(+,5),t('",IOType:''inout''}"',3),t(+,5),t('"],"',3),t(+,5),t('"gx.dom.form()."',3),t(+,5),t('"nIsMod_1529_"',3),t(+,5),t(sGXsfl_181_idx,23),t(+,5),t('","',3),t(+,5),t('"'''', false"',3),t(+,5),t('","',3),t(+,5),t('"false"',3),t(+,5),t('");"',3),t(')',4) ]
         Target    : [ t(prompt_,3),t('Link',3) ]
         ForType   : 29
         Type      : []
      */
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1529_" + sGXsfl_181_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 182,'',false,'" + sGXsfl_181_idx + "',181)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_notificacionesRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCCTNotId_Internalname,GXutil.ltrim( localUtil.ntoc( A11481CCTNotId, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A11481CCTNotId), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,182);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCCTNotId_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtCCTNotId_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(181),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1529_" + sGXsfl_181_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 183,'',false,'" + sGXsfl_181_idx + "',181)\"" ;
      if ( ( cmbCCTNotEvt.getItemCount() == 0 ) && isAjaxCallMode( ) )
      {
         GXCCtl = "CCTNOTEVT_" + sGXsfl_181_idx ;
         cmbCCTNotEvt.setName( GXCCtl );
         cmbCCTNotEvt.setWebtags( "" );
         cmbCCTNotEvt.addItem("E", httpContext.getMessage( "Si falla validación", ""), (short)(0));
         cmbCCTNotEvt.addItem("O", httpContext.getMessage( "Si esta todo Ok", ""), (short)(0));
         cmbCCTNotEvt.addItem("S", httpContext.getMessage( "Siempre", ""), (short)(0));
         if ( cmbCCTNotEvt.getItemCount() > 0 )
         {
            A11477CCTNotEvt = cmbCCTNotEvt.getValidValue(A11477CCTNotEvt) ;
         }
      }
      /* ComboBox */
      Gridlevel_notificacionesRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbCCTNotEvt,cmbCCTNotEvt.getInternalname(),GXutil.rtrim( A11477CCTNotEvt),Integer.valueOf(1),cmbCCTNotEvt.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",Integer.valueOf(-1),Integer.valueOf(cmbCCTNotEvt.getEnabled()),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","TrnColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,183);\"","",Boolean.valueOf(true),Integer.valueOf(0)});
      cmbCCTNotEvt.setValue( GXutil.rtrim( A11477CCTNotEvt) );
      httpContext.ajax_rsp_assign_prop("", false, cmbCCTNotEvt.getInternalname(), "Values", cmbCCTNotEvt.ToJavascriptSource(), !bGXsfl_181_Refreshing);
      /* Subfile cell */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1529_" + sGXsfl_181_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 184,'',false,'" + sGXsfl_181_idx + "',181)\"" ;
      if ( ( cmbCCTNotDst.getItemCount() == 0 ) && isAjaxCallMode( ) )
      {
         GXCCtl = "CCTNOTDST_" + sGXsfl_181_idx ;
         cmbCCTNotDst.setName( GXCCtl );
         cmbCCTNotDst.setWebtags( "" );
         cmbCCTNotDst.addItem("C", httpContext.getMessage( "Cliente", ""), (short)(0));
         cmbCCTNotDst.addItem("V", httpContext.getMessage( "Vendedor", ""), (short)(0));
         cmbCCTNotDst.addItem("U", httpContext.getMessage( "Usuario", ""), (short)(0));
         cmbCCTNotDst.addItem("M", httpContext.getMessage( "email específico", ""), (short)(0));
         if ( cmbCCTNotDst.getItemCount() > 0 )
         {
            A11478CCTNotDst = cmbCCTNotDst.getValidValue(A11478CCTNotDst) ;
         }
      }
      /* ComboBox */
      Gridlevel_notificacionesRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbCCTNotDst,cmbCCTNotDst.getInternalname(),GXutil.rtrim( A11478CCTNotDst),Integer.valueOf(1),cmbCCTNotDst.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",Integer.valueOf(-1),Integer.valueOf(cmbCCTNotDst.getEnabled()),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","TrnColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,184);\"","",Boolean.valueOf(true),Integer.valueOf(0)});
      cmbCCTNotDst.setValue( GXutil.rtrim( A11478CCTNotDst) );
      httpContext.ajax_rsp_assign_prop("", false, cmbCCTNotDst.getInternalname(), "Values", cmbCCTNotDst.ToJavascriptSource(), !bGXsfl_181_Refreshing);
      /* Subfile cell */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1529_" + sGXsfl_181_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 185,'',false,'" + sGXsfl_181_idx + "',181)\"" ;
      GXCCtl = "CCTNOTUSR_" + sGXsfl_181_idx ;
      dynCCTNotUsr.setName( GXCCtl );
      dynCCTNotUsr.setWebtags( "" );
      dynCCTNotUsr.removeAllItems();
      /* Using cursor T00IA52 */
      pr_default.execute(50);
      while ( (pr_default.getStatus(50) != 101) )
      {
         dynCCTNotUsr.addItem(T00IA52_A850UsurCod[0], T00IA52_A854UsurNom[0], (short)(0));
         pr_default.readNext(50);
      }
      pr_default.close(50);
      if ( dynCCTNotUsr.getItemCount() > 0 )
      {
         A11479CCTNotUsr = dynCCTNotUsr.getValidValue(A11479CCTNotUsr) ;
      }
      /* ComboBox */
      Gridlevel_notificacionesRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {dynCCTNotUsr,dynCCTNotUsr.getInternalname(),GXutil.rtrim( A11479CCTNotUsr),Integer.valueOf(1),dynCCTNotUsr.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",Integer.valueOf(-1),Integer.valueOf(dynCCTNotUsr.getEnabled()),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","TrnColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,185);\"","",Boolean.valueOf(true),Integer.valueOf(0)});
      dynCCTNotUsr.setValue( GXutil.rtrim( A11479CCTNotUsr) );
      httpContext.ajax_rsp_assign_prop("", false, dynCCTNotUsr.getInternalname(), "Values", dynCCTNotUsr.ToJavascriptSource(), !bGXsfl_181_Refreshing);
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1529_" + sGXsfl_181_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 186,'',false,'" + sGXsfl_181_idx + "',181)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_notificacionesRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCCTNotEml_Internalname,GXutil.rtrim( A11480CCTNotEml),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,186);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCCTNotEml_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtCCTNotEml_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(120),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(181),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1529_" + sGXsfl_181_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 187,'',false,'" + sGXsfl_181_idx + "',181)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_notificacionesRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCCTNotAsu_Internalname,A11523CCTNotAsu,"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,187);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCCTNotAsu_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtCCTNotAsu_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(200),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(181),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1529_" + sGXsfl_181_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 188,'',false,'" + sGXsfl_181_idx + "',181)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_notificacionesRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCCTNotTxt_Internalname,A11524CCTNotTxt,"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,188);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCCTNotTxt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtCCTNotTxt_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2000),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(181),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1529_" + sGXsfl_181_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 189,'',false,'" + sGXsfl_181_idx + "',181)\"" ;
      if ( ( cmbCCTNotAdj.getItemCount() == 0 ) && isAjaxCallMode( ) )
      {
         GXCCtl = "CCTNOTADJ_" + sGXsfl_181_idx ;
         cmbCCTNotAdj.setName( GXCCtl );
         cmbCCTNotAdj.setWebtags( "" );
         cmbCCTNotAdj.addItem("0", httpContext.getMessage( "Datos en Mensaje", ""), (short)(0));
         cmbCCTNotAdj.addItem("1", httpContext.getMessage( "Datos en Adjunto", ""), (short)(0));
         if ( cmbCCTNotAdj.getItemCount() > 0 )
         {
            A11525CCTNotAdj = (byte)(GXutil.lval( cmbCCTNotAdj.getValidValue(GXutil.trim( GXutil.str( A11525CCTNotAdj, 1, 0))))) ;
         }
      }
      /* ComboBox */
      Gridlevel_notificacionesRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbCCTNotAdj,cmbCCTNotAdj.getInternalname(),GXutil.trim( GXutil.str( A11525CCTNotAdj, 1, 0)),Integer.valueOf(1),cmbCCTNotAdj.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","int","",Integer.valueOf(-1),Integer.valueOf(cmbCCTNotAdj.getEnabled()),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","TrnColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,189);\"","",Boolean.valueOf(true),Integer.valueOf(0)});
      cmbCCTNotAdj.setValue( GXutil.trim( GXutil.str( A11525CCTNotAdj, 1, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbCCTNotAdj.getInternalname(), "Values", cmbCCTNotAdj.ToJavascriptSource(), !bGXsfl_181_Refreshing);
      /* Subfile cell */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1529_" + sGXsfl_181_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 190,'',false,'" + sGXsfl_181_idx + "',181)\"" ;
      GXCCtl = "CCTNOTSTP_" + sGXsfl_181_idx ;
      cmbCCTNotStp.setName( GXCCtl );
      cmbCCTNotStp.setWebtags( "" );
      cmbCCTNotStp.addItem("0", httpContext.getMessage( "N", ""), (short)(0));
      cmbCCTNotStp.addItem("1", httpContext.getMessage( "S", ""), (short)(0));
      if ( cmbCCTNotStp.getItemCount() > 0 )
      {
         if ( isIns( ) && (0==A12733CCTNotStp) )
         {
            A12733CCTNotStp = (byte)(0) ;
         }
      }
      /* ComboBox */
      Gridlevel_notificacionesRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbCCTNotStp,cmbCCTNotStp.getInternalname(),GXutil.trim( GXutil.str( A12733CCTNotStp, 1, 0)),Integer.valueOf(1),cmbCCTNotStp.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","int","",Integer.valueOf(-1),Integer.valueOf(cmbCCTNotStp.getEnabled()),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","TrnColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,190);\"","",Boolean.valueOf(true),Integer.valueOf(0)});
      cmbCCTNotStp.setValue( GXutil.trim( GXutil.str( A12733CCTNotStp, 1, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbCCTNotStp.getInternalname(), "Values", cmbCCTNotStp.ToJavascriptSource(), !bGXsfl_181_Refreshing);
      httpContext.ajax_sending_grid_row(Gridlevel_notificacionesRow);
      send_integrity_lvl_hashesIA1529( ) ;
      GXCCtl = "Z11481CCTNotId_" + sGXsfl_181_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z11481CCTNotId, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z12733CCTNotStp_" + sGXsfl_181_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z12733CCTNotStp, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z11477CCTNotEvt_" + sGXsfl_181_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z11477CCTNotEvt));
      GXCCtl = "Z11478CCTNotDst_" + sGXsfl_181_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z11478CCTNotDst));
      GXCCtl = "Z11479CCTNotUsr_" + sGXsfl_181_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z11479CCTNotUsr));
      GXCCtl = "Z11480CCTNotEml_" + sGXsfl_181_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z11480CCTNotEml));
      GXCCtl = "Z11523CCTNotAsu_" + sGXsfl_181_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, Z11523CCTNotAsu);
      GXCCtl = "Z11524CCTNotTxt_" + sGXsfl_181_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, Z11524CCTNotTxt);
      GXCCtl = "Z11525CCTNotAdj_" + sGXsfl_181_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z11525CCTNotAdj, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1529_" + sGXsfl_181_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1529, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1529_" + sGXsfl_181_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1529, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1529_" + sGXsfl_181_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1529, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "N11479CCTNotUsr_" + sGXsfl_181_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( A11479CCTNotUsr));
      GXCCtl = "N11480CCTNotEml_" + sGXsfl_181_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( A11480CCTNotEml));
      GXCCtl = "vMODE_" + sGXsfl_181_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Gx_mode));
      GXCCtl = "vTRNCONTEXT_" + sGXsfl_181_idx ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, GXCCtl, AV31TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(GXCCtl, AV31TrnContext);
      }
      GXCCtl = "vUPLOADEDFILES_" + sGXsfl_181_idx ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, GXCCtl, AV33UploadedFiles);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(GXCCtl, AV33UploadedFiles);
      }
      GXCCtl = "vARCHIVO_GXI_" + sGXsfl_181_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, AV46Archivo_GXI);
      GXCCtl = "vEMPRCOD_" + sGXsfl_181_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV28EmprCod));
      GXCCtl = "vCCTCOD_" + sGXsfl_181_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV29CCTCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vISVARIABLE_" + sGXsfl_181_idx ;
      app.GxWebStd.gx_boolean_hidden_field( httpContext, GXCCtl, AV37isVariable);
      app.GxWebStd.gx_hidden_field( httpContext, "CCTNOTID_"+sGXsfl_181_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCTNotId_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CCTNOTEVT_"+sGXsfl_181_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbCCTNotEvt.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CCTNOTDST_"+sGXsfl_181_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbCCTNotDst.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CCTNOTUSR_"+sGXsfl_181_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( dynCCTNotUsr.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CCTNOTEML_"+sGXsfl_181_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCTNotEml_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CCTNOTASU_"+sGXsfl_181_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCTNotAsu_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CCTNOTTXT_"+sGXsfl_181_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCTNotTxt_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CCTNOTADJ_"+sGXsfl_181_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbCCTNotAdj.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CCTNOTSTP_"+sGXsfl_181_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbCCTNotStp.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Gridlevel_notificacionesContainer.AddRow(Gridlevel_notificacionesRow);
   }

   public void readRowIA1529( )
   {
      nGXsfl_181_idx = (int)(nGXsfl_181_idx+1) ;
      sGXsfl_181_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_181_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1811529( ) ;
      edtCCTNotId_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CCTNOTID_"+sGXsfl_181_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      cmbCCTNotEvt.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "CCTNOTEVT_"+sGXsfl_181_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
      cmbCCTNotDst.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "CCTNOTDST_"+sGXsfl_181_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
      dynCCTNotUsr.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "CCTNOTUSR_"+sGXsfl_181_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
      edtCCTNotEml_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CCTNOTEML_"+sGXsfl_181_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCCTNotAsu_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CCTNOTASU_"+sGXsfl_181_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCCTNotTxt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CCTNOTTXT_"+sGXsfl_181_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      cmbCCTNotAdj.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "CCTNOTADJ_"+sGXsfl_181_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
      cmbCCTNotStp.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "CCTNOTSTP_"+sGXsfl_181_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCCTNotId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCCTNotId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "CCTNOTID_" + sGXsfl_181_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtCCTNotId_Internalname ;
         wbErr = true ;
         A11481CCTNotId = (short)(0) ;
      }
      else
      {
         A11481CCTNotId = (short)(localUtil.ctol( httpContext.cgiGet( edtCCTNotId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      cmbCCTNotEvt.setName( cmbCCTNotEvt.getInternalname() );
      cmbCCTNotEvt.setValue( httpContext.cgiGet( cmbCCTNotEvt.getInternalname()) );
      A11477CCTNotEvt = httpContext.cgiGet( cmbCCTNotEvt.getInternalname()) ;
      cmbCCTNotDst.setName( cmbCCTNotDst.getInternalname() );
      cmbCCTNotDst.setValue( httpContext.cgiGet( cmbCCTNotDst.getInternalname()) );
      A11478CCTNotDst = httpContext.cgiGet( cmbCCTNotDst.getInternalname()) ;
      dynCCTNotUsr.setName( dynCCTNotUsr.getInternalname() );
      dynCCTNotUsr.setValue( httpContext.cgiGet( dynCCTNotUsr.getInternalname()) );
      A11479CCTNotUsr = httpContext.cgiGet( dynCCTNotUsr.getInternalname()) ;
      A11480CCTNotEml = httpContext.cgiGet( edtCCTNotEml_Internalname) ;
      A11523CCTNotAsu = httpContext.cgiGet( edtCCTNotAsu_Internalname) ;
      A11524CCTNotTxt = httpContext.cgiGet( edtCCTNotTxt_Internalname) ;
      cmbCCTNotAdj.setName( cmbCCTNotAdj.getInternalname() );
      cmbCCTNotAdj.setValue( httpContext.cgiGet( cmbCCTNotAdj.getInternalname()) );
      A11525CCTNotAdj = (byte)(GXutil.lval( httpContext.cgiGet( cmbCCTNotAdj.getInternalname()))) ;
      cmbCCTNotStp.setName( cmbCCTNotStp.getInternalname() );
      cmbCCTNotStp.setValue( httpContext.cgiGet( cmbCCTNotStp.getInternalname()) );
      A12733CCTNotStp = (byte)(GXutil.lval( httpContext.cgiGet( cmbCCTNotStp.getInternalname()))) ;
      GXCCtl = "Z11481CCTNotId_" + sGXsfl_181_idx ;
      Z11481CCTNotId = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z12733CCTNotStp_" + sGXsfl_181_idx ;
      Z12733CCTNotStp = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z11477CCTNotEvt_" + sGXsfl_181_idx ;
      Z11477CCTNotEvt = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z11478CCTNotDst_" + sGXsfl_181_idx ;
      Z11478CCTNotDst = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z11479CCTNotUsr_" + sGXsfl_181_idx ;
      Z11479CCTNotUsr = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z11480CCTNotEml_" + sGXsfl_181_idx ;
      Z11480CCTNotEml = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z11523CCTNotAsu_" + sGXsfl_181_idx ;
      Z11523CCTNotAsu = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z11524CCTNotTxt_" + sGXsfl_181_idx ;
      Z11524CCTNotTxt = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z11525CCTNotAdj_" + sGXsfl_181_idx ;
      Z11525CCTNotAdj = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdDeleted_1529_" + sGXsfl_181_idx ;
      nRcdDeleted_1529 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1529_" + sGXsfl_181_idx ;
      nRcdExists_1529 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1529_" + sGXsfl_181_idx ;
      nIsMod_1529 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "N11479CCTNotUsr_" + sGXsfl_181_idx ;
      N11479CCTNotUsr = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "N11480CCTNotEml_" + sGXsfl_181_idx ;
      N11480CCTNotEml = httpContext.cgiGet( GXCCtl) ;
   }

   public void assign_properties_default( )
   {
      defedtCCTVal_Enabled = edtCCTVal_Enabled ;
      defedtCCTValDsc_Enabled = edtCCTValDsc_Enabled ;
      defedtCCTValLin_Enabled = edtCCTValLin_Enabled ;
      defedtCCTValLin_Enabled = edtCCTValLin_Enabled ;
      defedtCCTNotEml_Enabled = edtCCTNotEml_Enabled ;
      defdynCCTNotUsr_Enabled = dynCCTNotUsr.getEnabled() ;
      defedtCCTNotId_Enabled = edtCCTNotId_Enabled ;
      defedtCCTSta_Enabled = edtCCTSta_Enabled ;
      defedtCCTLinPict_Enabled = edtCCTLinPict_Enabled ;
      defedtCCTLinLgoD_Enabled = edtCCTLinLgoD_Enabled ;
      defedtCCTLinDsc_Enabled = edtCCTLinDsc_Enabled ;
      defcmbCCTLinTpoD_Enabled = cmbCCTLinTpoD.getEnabled() ;
      defdynCCVCod_Enabled = dynCCVCod.getEnabled() ;
      defedtCCTLin_Enabled = edtCCTLin_Enabled ;
      defedtCCTLin_Enabled = edtCCTLin_Enabled ;
   }

   public void confirmValuesIA0( )
   {
      nGXsfl_154_idx = 0 ;
      sGXsfl_154_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_154_idx), 4, 0), (short)(4), "0") + sGXsfl_79_idx ;
      subsflControlProps_154623( ) ;
      while ( nGXsfl_154_idx < nRC_GXsfl_154 )
      {
         nGXsfl_154_idx = (int)(nGXsfl_154_idx+1) ;
         sGXsfl_154_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_154_idx), 4, 0), (short)(4), "0") + sGXsfl_79_idx ;
         subsflControlProps_154623( ) ;
         httpContext.changePostValue( "Z4049CCTValLin_"+sGXsfl_154_idx, httpContext.cgiGet( "ZT_"+"Z4049CCTValLin_"+sGXsfl_154_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4049CCTValLin_"+sGXsfl_154_idx) ;
         httpContext.changePostValue( "Z4050CCTValDsc_"+sGXsfl_154_idx, httpContext.cgiGet( "ZT_"+"Z4050CCTValDsc_"+sGXsfl_154_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4050CCTValDsc_"+sGXsfl_154_idx) ;
         httpContext.changePostValue( "Z4051CCTVal_"+sGXsfl_154_idx, httpContext.cgiGet( "ZT_"+"Z4051CCTVal_"+sGXsfl_154_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4051CCTVal_"+sGXsfl_154_idx) ;
      }
      nGXsfl_79_idx = 0 ;
      sGXsfl_79_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_79_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_79622( ) ;
      while ( nGXsfl_79_idx < nRC_GXsfl_79 )
      {
         nGXsfl_79_idx = (int)(nGXsfl_79_idx+1) ;
         sGXsfl_79_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_79_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_79622( ) ;
         httpContext.changePostValue( "Z4034CCTLin_"+sGXsfl_79_idx, httpContext.cgiGet( "ZT_"+"Z4034CCTLin_"+sGXsfl_79_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4034CCTLin_"+sGXsfl_79_idx) ;
         httpContext.changePostValue( "Z4045CCTLinLgoD_"+sGXsfl_79_idx, httpContext.cgiGet( "ZT_"+"Z4045CCTLinLgoD_"+sGXsfl_79_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4045CCTLinLgoD_"+sGXsfl_79_idx) ;
         httpContext.changePostValue( "Z4046CCTLinPict_"+sGXsfl_79_idx, httpContext.cgiGet( "ZT_"+"Z4046CCTLinPict_"+sGXsfl_79_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4046CCTLinPict_"+sGXsfl_79_idx) ;
         httpContext.changePostValue( "Z4048CCTLinTpoI_"+sGXsfl_79_idx, httpContext.cgiGet( "ZT_"+"Z4048CCTLinTpoI_"+sGXsfl_79_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4048CCTLinTpoI_"+sGXsfl_79_idx) ;
         httpContext.changePostValue( "Z4044CCTLinTpoD_"+sGXsfl_79_idx, httpContext.cgiGet( "ZT_"+"Z4044CCTLinTpoD_"+sGXsfl_79_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4044CCTLinTpoD_"+sGXsfl_79_idx) ;
         httpContext.changePostValue( "Z4043CCTLinDsc_"+sGXsfl_79_idx, httpContext.cgiGet( "ZT_"+"Z4043CCTLinDsc_"+sGXsfl_79_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4043CCTLinDsc_"+sGXsfl_79_idx) ;
         httpContext.changePostValue( "Z4047CCTLinVarW_"+sGXsfl_79_idx, httpContext.cgiGet( "ZT_"+"Z4047CCTLinVarW_"+sGXsfl_79_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4047CCTLinVarW_"+sGXsfl_79_idx) ;
         httpContext.changePostValue( "Z4408CCTSta_"+sGXsfl_79_idx, httpContext.cgiGet( "ZT_"+"Z4408CCTSta_"+sGXsfl_79_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4408CCTSta_"+sGXsfl_79_idx) ;
         httpContext.changePostValue( "Z13249CCVNorma_"+sGXsfl_79_idx, httpContext.cgiGet( "ZT_"+"Z13249CCVNorma_"+sGXsfl_79_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13249CCVNorma_"+sGXsfl_79_idx) ;
         httpContext.changePostValue( "Z13250CCVEspecif_"+sGXsfl_79_idx, httpContext.cgiGet( "ZT_"+"Z13250CCVEspecif_"+sGXsfl_79_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13250CCVEspecif_"+sGXsfl_79_idx) ;
         httpContext.changePostValue( "Z11476CCTLinDscL_"+sGXsfl_79_idx, httpContext.cgiGet( "ZT_"+"Z11476CCTLinDscL_"+sGXsfl_79_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11476CCTLinDscL_"+sGXsfl_79_idx) ;
         httpContext.changePostValue( "Z11522CCVCod_"+sGXsfl_79_idx, httpContext.cgiGet( "ZT_"+"Z11522CCVCod_"+sGXsfl_79_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11522CCVCod_"+sGXsfl_79_idx) ;
      }
      nGXsfl_181_idx = 0 ;
      sGXsfl_181_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_181_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1811529( ) ;
      while ( nGXsfl_181_idx < nRC_GXsfl_181 )
      {
         nGXsfl_181_idx = (int)(nGXsfl_181_idx+1) ;
         sGXsfl_181_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_181_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1811529( ) ;
         httpContext.changePostValue( "Z11481CCTNotId_"+sGXsfl_181_idx, httpContext.cgiGet( "ZT_"+"Z11481CCTNotId_"+sGXsfl_181_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11481CCTNotId_"+sGXsfl_181_idx) ;
         httpContext.changePostValue( "Z12733CCTNotStp_"+sGXsfl_181_idx, httpContext.cgiGet( "ZT_"+"Z12733CCTNotStp_"+sGXsfl_181_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12733CCTNotStp_"+sGXsfl_181_idx) ;
         httpContext.changePostValue( "Z11477CCTNotEvt_"+sGXsfl_181_idx, httpContext.cgiGet( "ZT_"+"Z11477CCTNotEvt_"+sGXsfl_181_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11477CCTNotEvt_"+sGXsfl_181_idx) ;
         httpContext.changePostValue( "Z11478CCTNotDst_"+sGXsfl_181_idx, httpContext.cgiGet( "ZT_"+"Z11478CCTNotDst_"+sGXsfl_181_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11478CCTNotDst_"+sGXsfl_181_idx) ;
         httpContext.changePostValue( "Z11479CCTNotUsr_"+sGXsfl_181_idx, httpContext.cgiGet( "ZT_"+"Z11479CCTNotUsr_"+sGXsfl_181_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11479CCTNotUsr_"+sGXsfl_181_idx) ;
         httpContext.changePostValue( "Z11480CCTNotEml_"+sGXsfl_181_idx, httpContext.cgiGet( "ZT_"+"Z11480CCTNotEml_"+sGXsfl_181_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11480CCTNotEml_"+sGXsfl_181_idx) ;
         httpContext.changePostValue( "Z11523CCTNotAsu_"+sGXsfl_181_idx, httpContext.cgiGet( "ZT_"+"Z11523CCTNotAsu_"+sGXsfl_181_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11523CCTNotAsu_"+sGXsfl_181_idx) ;
         httpContext.changePostValue( "Z11524CCTNotTxt_"+sGXsfl_181_idx, httpContext.cgiGet( "ZT_"+"Z11524CCTNotTxt_"+sGXsfl_181_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11524CCTNotTxt_"+sGXsfl_181_idx) ;
         httpContext.changePostValue( "Z11525CCTNotAdj_"+sGXsfl_181_idx, httpContext.cgiGet( "ZT_"+"Z11525CCTNotAdj_"+sGXsfl_181_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11525CCTNotAdj_"+sGXsfl_181_idx) ;
      }
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
      httpContext.AddJavascriptSource("Shared/HistoryManager/HistoryManager.js", "", false, true);
      httpContext.AddJavascriptSource("Shared/HistoryManager/rsh/json2005.js", "", false, true);
      httpContext.AddJavascriptSource("Shared/HistoryManager/rsh/rsh.js", "", false, true);
      httpContext.AddJavascriptSource("Shared/HistoryManager/HistoryManagerCreate.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("FileUpload/fileupload.min.js", "", false, true);
      httpContext.AddJavascriptSource("Tab/TabRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.controlcalidadhtd.tccdef", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV28EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV29CCTCod,6,0)),GXutil.URLEncode(GXutil.booltostr(AV37isVariable))}, new String[] {"Gx_mode","EmprCod","CCTCod","isVariable"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"TCCDef");
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("controlcalidadhtd\\tccdef:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4031CCTCod", GXutil.ltrim( localUtil.ntoc( Z4031CCTCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4041CCTArc", GXutil.rtrim( Z4041CCTArc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4036CCTDsc", GXutil.rtrim( Z4036CCTDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4037CCTTpoCtr", GXutil.rtrim( Z4037CCTTpoCtr));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4406CCTFinFas", GXutil.rtrim( Z4406CCTFinFas));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4407CCTIniFas", GXutil.rtrim( Z4407CCTIniFas));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4039CCTObl", GXutil.rtrim( Z4039CCTObl));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4040CCTSto", GXutil.rtrim( Z4040CCTSto));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4042CCTObs", GXutil.rtrim( Z4042CCTObs));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11475CCTNotUlt", GXutil.ltrim( localUtil.ntoc( Z11475CCTNotUlt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O11475CCTNotUlt", GXutil.ltrim( localUtil.ntoc( O11475CCTNotUlt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_79", GXutil.ltrim( localUtil.ntoc( nGXsfl_79_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_181", GXutil.ltrim( localUtil.ntoc( nGXsfl_181_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "N4042CCTObs", GXutil.rtrim( A4042CCTObs));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vUPLOADEDFILES", AV33UploadedFiles);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vUPLOADEDFILES", AV33UploadedFiles);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vFAILEDFILES", AV34FailedFiles);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vFAILEDFILES", AV34FailedFiles);
      }
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
      app.GxWebStd.gx_hidden_field( httpContext, "vARCHIVO_GXI", AV46Archivo_GXI);
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vISVARIABLE", AV37isVariable);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vISVARIABLE", getSecureSignedToken( "", AV37isVariable));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV28EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV28EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vAUXEMPRCOD", GXutil.rtrim( AV38AuxEmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vCCTCOD", GXutil.ltrim( localUtil.ntoc( AV29CCTCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCCTCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV29CCTCod), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTESTCC", GXutil.ltrim( localUtil.ntoc( AV27TestCC, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CCVLGODAT", GXutil.ltrim( localUtil.ntoc( A11527CCVLgoDat, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "UPLOAD_Objectcall", GXutil.rtrim( Upload_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "UPLOAD_Enabled", GXutil.booltostr( Upload_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "UPLOAD_Autoupload", GXutil.booltostr( Upload_Autoupload));
      app.GxWebStd.gx_hidden_field( httpContext, "UPLOAD_Hideadditionalbuttons", GXutil.booltostr( Upload_Hideadditionalbuttons));
      app.GxWebStd.gx_hidden_field( httpContext, "UPLOAD_Tooltiptext", GXutil.rtrim( Upload_Tooltiptext));
      app.GxWebStd.gx_hidden_field( httpContext, "UPLOAD_Maxnumberoffiles", GXutil.ltrim( localUtil.ntoc( Upload_Maxnumberoffiles, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "UPLOAD_Autodisableaddingfiles", GXutil.booltostr( Upload_Autodisableaddingfiles));
      app.GxWebStd.gx_hidden_field( httpContext, "GXUITABSPANEL_TABS1_Objectcall", GXutil.rtrim( Gxuitabspanel_tabs1_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "GXUITABSPANEL_TABS1_Enabled", GXutil.booltostr( Gxuitabspanel_tabs1_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "GXUITABSPANEL_TABS1_Pagecount", GXutil.ltrim( localUtil.ntoc( Gxuitabspanel_tabs1_Pagecount, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXUITABSPANEL_TABS1_Class", GXutil.rtrim( Gxuitabspanel_tabs1_Class));
      app.GxWebStd.gx_hidden_field( httpContext, "GXUITABSPANEL_TABS1_Historymanagement", GXutil.booltostr( Gxuitabspanel_tabs1_Historymanagement));
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
      return formatLink("app.controlcalidadhtd.tccdef", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV28EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV29CCTCod,6,0)),GXutil.URLEncode(GXutil.booltostr(AV37isVariable))}, new String[] {"Gx_mode","EmprCod","CCTCod","isVariable"})  ;
   }

   public String getPgmname( )
   {
      return "ControlCalidadHTD.TCCDef" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Definición de Cont. de Calidad", "") ;
   }

   public void initializeNonKeyIA621( )
   {
      A4041CCTArc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4041CCTArc", A4041CCTArc);
      AV14CCTArc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14CCTArc", AV14CCTArc);
      A407EmprNom = "" ;
      n407EmprNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      A4036CCTDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4036CCTDsc", A4036CCTDsc);
      A4037CCTTpoCtr = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4037CCTTpoCtr", A4037CCTTpoCtr);
      A4406CCTFinFas = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4406CCTFinFas", A4406CCTFinFas);
      A4407CCTIniFas = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4407CCTIniFas", A4407CCTIniFas);
      A4039CCTObl = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4039CCTObl", A4039CCTObl);
      A4040CCTSto = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4040CCTSto", A4040CCTSto);
      A4042CCTObs = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4042CCTObs", A4042CCTObs);
      A11475CCTNotUlt = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A11475CCTNotUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11475CCTNotUlt), 4, 0));
      O11475CCTNotUlt = A11475CCTNotUlt ;
      httpContext.ajax_rsp_assign_attri("", false, "A11475CCTNotUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11475CCTNotUlt), 4, 0));
      Z4041CCTArc = "" ;
      Z4036CCTDsc = "" ;
      Z4037CCTTpoCtr = "" ;
      Z4406CCTFinFas = "" ;
      Z4407CCTIniFas = "" ;
      Z4039CCTObl = "" ;
      Z4040CCTSto = "" ;
      Z4042CCTObs = "" ;
      Z11475CCTNotUlt = (short)(0) ;
   }

   public void initAllIA621( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A4031CCTCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
      initializeNonKeyIA621( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKeyIA622( )
   {
      A4045CCTLinLgoD = (short)(0) ;
      A4046CCTLinPict = "" ;
      A4048CCTLinTpoI = "" ;
      A4044CCTLinTpoD = "" ;
      A11522CCVCod = "" ;
      A4043CCTLinDsc = "" ;
      A4047CCTLinVarW = "" ;
      A4408CCTSta = "" ;
      A11526CCVPict = "" ;
      n11526CCVPict = false ;
      A11527CCVLgoDat = (short)(0) ;
      n11527CCVLgoDat = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11527CCVLgoDat", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11527CCVLgoDat), 3, 0));
      A11528CCVTpoDat = "" ;
      n11528CCVTpoDat = false ;
      A11529CCVDsc = "" ;
      n11529CCVDsc = false ;
      A13249CCVNorma = "" ;
      A13250CCVEspecif = "" ;
      A11476CCTLinDscL = "" ;
      Z4045CCTLinLgoD = (short)(0) ;
      Z4046CCTLinPict = "" ;
      Z4048CCTLinTpoI = "" ;
      Z4044CCTLinTpoD = "" ;
      Z4043CCTLinDsc = "" ;
      Z4047CCTLinVarW = "" ;
      Z4408CCTSta = "" ;
      Z13249CCVNorma = "" ;
      Z13250CCVEspecif = "" ;
      Z11476CCTLinDscL = "" ;
      Z11522CCVCod = "" ;
   }

   public void initAllIA622( )
   {
      A4034CCTLin = (short)(0) ;
      initializeNonKeyIA622( ) ;
   }

   public void standaloneModalInsertIA622( )
   {
      A4048CCTLinTpoI = i4048CCTLinTpoI ;
   }

   public void initializeNonKeyIA623( )
   {
      A4050CCTValDsc = "" ;
      A4051CCTVal = "" ;
      Z4050CCTValDsc = "" ;
      Z4051CCTVal = "" ;
   }

   public void initAllIA623( )
   {
      A4049CCTValLin = (byte)(0) ;
      initializeNonKeyIA623( ) ;
   }

   public void standaloneModalInsertIA623( )
   {
   }

   public void initializeNonKeyIA1529( )
   {
      A11477CCTNotEvt = "" ;
      A11478CCTNotDst = "" ;
      A11479CCTNotUsr = "" ;
      A11480CCTNotEml = "" ;
      A11523CCTNotAsu = "" ;
      A11524CCTNotTxt = "" ;
      A11525CCTNotAdj = (byte)(0) ;
      A12733CCTNotStp = (byte)(0) ;
      Z12733CCTNotStp = (byte)(0) ;
      Z11477CCTNotEvt = "" ;
      Z11478CCTNotDst = "" ;
      Z11479CCTNotUsr = "" ;
      Z11480CCTNotEml = "" ;
      Z11523CCTNotAsu = "" ;
      Z11524CCTNotTxt = "" ;
      Z11525CCTNotAdj = (byte)(0) ;
   }

   public void initAllIA1529( )
   {
      A11481CCTNotId = (short)(0) ;
      initializeNonKeyIA1529( ) ;
   }

   public void standaloneModalInsertIA1529( )
   {
      A11475CCTNotUlt = i11475CCTNotUlt ;
      httpContext.ajax_rsp_assign_attri("", false, "A11475CCTNotUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11475CCTNotUlt), 4, 0));
      A12733CCTNotStp = i12733CCTNotStp ;
   }

   public void define_styles( )
   {
      httpContext.AddStyleSheetFile("FileUpload/fileupload.min.css", "");
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211655876", true, true);
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
      httpContext.AddJavascriptSource("controlcalidadhtd/tccdef.js", "?20268211655876", false, true);
      httpContext.AddJavascriptSource("Shared/HistoryManager/HistoryManager.js", "", false, true);
      httpContext.AddJavascriptSource("Shared/HistoryManager/rsh/json2005.js", "", false, true);
      httpContext.AddJavascriptSource("Shared/HistoryManager/rsh/rsh.js", "", false, true);
      httpContext.AddJavascriptSource("Shared/HistoryManager/HistoryManagerCreate.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("FileUpload/fileupload.min.js", "", false, true);
      httpContext.AddJavascriptSource("Tab/TabRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties622( )
   {
      edtCCTSta_Enabled = defedtCCTSta_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCTSta_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTSta_Enabled), 5, 0), !bGXsfl_79_Refreshing);
      edtCCTLinPict_Enabled = defedtCCTLinPict_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCTLinPict_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLinPict_Enabled), 5, 0), !bGXsfl_79_Refreshing);
      edtCCTLinLgoD_Enabled = defedtCCTLinLgoD_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCTLinLgoD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLinLgoD_Enabled), 5, 0), !bGXsfl_79_Refreshing);
      edtCCTLinDsc_Enabled = defedtCCTLinDsc_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCTLinDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLinDsc_Enabled), 5, 0), !bGXsfl_79_Refreshing);
      cmbCCTLinTpoD.setEnabled( defcmbCCTLinTpoD_Enabled );
      httpContext.ajax_rsp_assign_prop("", false, cmbCCTLinTpoD.getInternalname(), "Enabled", GXutil.ltrimstr( cmbCCTLinTpoD.getEnabled(), 5, 0), !bGXsfl_79_Refreshing);
      dynCCVCod.setEnabled( defdynCCVCod_Enabled );
      httpContext.ajax_rsp_assign_prop("", false, dynCCVCod.getInternalname(), "Enabled", GXutil.ltrimstr( dynCCVCod.getEnabled(), 5, 0), !bGXsfl_79_Refreshing);
      edtCCTLin_Enabled = defedtCCTLin_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCTLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLin_Enabled), 5, 0), !bGXsfl_79_Refreshing);
      edtCCTLin_Enabled = defedtCCTLin_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCTLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLin_Enabled), 5, 0), !bGXsfl_79_Refreshing);
   }

   public void init_level_properties623( )
   {
      edtCCTVal_Enabled = defedtCCTVal_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCTVal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTVal_Enabled), 5, 0), !bGXsfl_154_Refreshing);
      edtCCTValDsc_Enabled = defedtCCTValDsc_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCTValDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTValDsc_Enabled), 5, 0), !bGXsfl_154_Refreshing);
      edtCCTValLin_Enabled = defedtCCTValLin_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCTValLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTValLin_Enabled), 5, 0), !bGXsfl_154_Refreshing);
      edtCCTValLin_Enabled = defedtCCTValLin_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCTValLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTValLin_Enabled), 5, 0), !bGXsfl_154_Refreshing);
   }

   public void init_level_properties1529( )
   {
      edtCCTNotEml_Enabled = defedtCCTNotEml_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCTNotEml_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTNotEml_Enabled), 5, 0), !bGXsfl_181_Refreshing);
      dynCCTNotUsr.setEnabled( defdynCCTNotUsr_Enabled );
      httpContext.ajax_rsp_assign_prop("", false, dynCCTNotUsr.getInternalname(), "Enabled", GXutil.ltrimstr( dynCCTNotUsr.getEnabled(), 5, 0), !bGXsfl_181_Refreshing);
      edtCCTNotId_Enabled = defedtCCTNotId_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCTNotId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTNotId_Enabled), 5, 0), !bGXsfl_181_Refreshing);
   }

   public void startgridcontrol79( )
   {
      Freestylelevel_level1Container.AddObjectProperty("GridName", "Freestylelevel_level1");
      Freestylelevel_level1Container.AddObjectProperty("Header", subFreestylelevel_level1_Header);
      Freestylelevel_level1Container.AddObjectProperty("Class", GXutil.rtrim( "FreeStyleGrid"));
      Freestylelevel_level1Container.AddObjectProperty("Class", "FreeStyleGrid");
      Freestylelevel_level1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Freestylelevel_level1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Freestylelevel_level1Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subFreestylelevel_level1_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Freestylelevel_level1Container.AddObjectProperty("CmpContext", "");
      Freestylelevel_level1Container.AddObjectProperty("InMasterPage", "false");
      Freestylelevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Freestylelevel_level1Container.AddColumnProperties(Freestylelevel_level1Column);
      Freestylelevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Freestylelevel_level1Container.AddColumnProperties(Freestylelevel_level1Column);
      Freestylelevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Freestylelevel_level1Container.AddColumnProperties(Freestylelevel_level1Column);
      Freestylelevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Freestylelevel_level1Container.AddColumnProperties(Freestylelevel_level1Column);
      Freestylelevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Freestylelevel_level1Container.AddColumnProperties(Freestylelevel_level1Column);
      Freestylelevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Freestylelevel_level1Container.AddColumnProperties(Freestylelevel_level1Column);
      Freestylelevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Freestylelevel_level1Container.AddColumnProperties(Freestylelevel_level1Column);
      Freestylelevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Freestylelevel_level1Container.AddColumnProperties(Freestylelevel_level1Column);
      Freestylelevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Freestylelevel_level1Container.AddColumnProperties(Freestylelevel_level1Column);
      Freestylelevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Freestylelevel_level1Container.AddColumnProperties(Freestylelevel_level1Column);
      Freestylelevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Freestylelevel_level1Container.AddColumnProperties(Freestylelevel_level1Column);
      Freestylelevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Freestylelevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4034CCTLin, (byte)(4), (byte)(0), ".", "")));
      Freestylelevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCCTLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Freestylelevel_level1Column.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtCCTLin_Visible, (byte)(5), (byte)(0), ".", "")));
      Freestylelevel_level1Container.AddColumnProperties(Freestylelevel_level1Column);
      Freestylelevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Freestylelevel_level1Container.AddColumnProperties(Freestylelevel_level1Column);
      Freestylelevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Freestylelevel_level1Container.AddColumnProperties(Freestylelevel_level1Column);
      Freestylelevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Freestylelevel_level1Container.AddColumnProperties(Freestylelevel_level1Column);
      Freestylelevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Freestylelevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A4048CCTLinTpoI));
      Freestylelevel_level1Column.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( cmbCCTLinTpoI.getVisible(), (byte)(5), (byte)(0), ".", "")));
      Freestylelevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( cmbCCTLinTpoI.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      Freestylelevel_level1Container.AddColumnProperties(Freestylelevel_level1Column);
      Freestylelevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Freestylelevel_level1Container.AddColumnProperties(Freestylelevel_level1Column);
      Freestylelevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Freestylelevel_level1Container.AddColumnProperties(Freestylelevel_level1Column);
      Freestylelevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Freestylelevel_level1Container.AddColumnProperties(Freestylelevel_level1Column);
      Freestylelevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Freestylelevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A11522CCVCod));
      Freestylelevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( dynCCVCod.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      Freestylelevel_level1Container.AddColumnProperties(Freestylelevel_level1Column);
      Freestylelevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Freestylelevel_level1Container.AddColumnProperties(Freestylelevel_level1Column);
      Freestylelevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Freestylelevel_level1Container.AddColumnProperties(Freestylelevel_level1Column);
      Freestylelevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Freestylelevel_level1Container.AddColumnProperties(Freestylelevel_level1Column);
      Freestylelevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Freestylelevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A4044CCTLinTpoD));
      Freestylelevel_level1Column.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( cmbCCTLinTpoD.getVisible(), (byte)(5), (byte)(0), ".", "")));
      Freestylelevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( cmbCCTLinTpoD.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      Freestylelevel_level1Container.AddColumnProperties(Freestylelevel_level1Column);
      Freestylelevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Freestylelevel_level1Container.AddColumnProperties(Freestylelevel_level1Column);
      Freestylelevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Freestylelevel_level1Container.AddColumnProperties(Freestylelevel_level1Column);
      Freestylelevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Freestylelevel_level1Container.AddColumnProperties(Freestylelevel_level1Column);
      Freestylelevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Freestylelevel_level1Container.AddColumnProperties(Freestylelevel_level1Column);
      Freestylelevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Freestylelevel_level1Container.AddColumnProperties(Freestylelevel_level1Column);
      Freestylelevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Freestylelevel_level1Container.AddColumnProperties(Freestylelevel_level1Column);
      Freestylelevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Freestylelevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A4043CCTLinDsc));
      Freestylelevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCCTLinDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Freestylelevel_level1Column.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtCCTLinDsc_Visible, (byte)(5), (byte)(0), ".", "")));
      Freestylelevel_level1Container.AddColumnProperties(Freestylelevel_level1Column);
      Freestylelevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Freestylelevel_level1Container.AddColumnProperties(Freestylelevel_level1Column);
      Freestylelevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Freestylelevel_level1Container.AddColumnProperties(Freestylelevel_level1Column);
      Freestylelevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Freestylelevel_level1Container.AddColumnProperties(Freestylelevel_level1Column);
      Freestylelevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Freestylelevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A4047CCTLinVarW));
      Freestylelevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCCTLinVarW_Enabled, (byte)(5), (byte)(0), ".", "")));
      Freestylelevel_level1Container.AddColumnProperties(Freestylelevel_level1Column);
      Freestylelevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Freestylelevel_level1Container.AddColumnProperties(Freestylelevel_level1Column);
      Freestylelevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Freestylelevel_level1Container.AddColumnProperties(Freestylelevel_level1Column);
      Freestylelevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Freestylelevel_level1Container.AddColumnProperties(Freestylelevel_level1Column);
      Freestylelevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Freestylelevel_level1Container.AddColumnProperties(Freestylelevel_level1Column);
      Freestylelevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Freestylelevel_level1Container.AddColumnProperties(Freestylelevel_level1Column);
      Freestylelevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Freestylelevel_level1Container.AddColumnProperties(Freestylelevel_level1Column);
      Freestylelevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Freestylelevel_level1Container.AddColumnProperties(Freestylelevel_level1Column);
      Freestylelevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Freestylelevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4045CCTLinLgoD, (byte)(3), (byte)(0), ".", "")));
      Freestylelevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCCTLinLgoD_Enabled, (byte)(5), (byte)(0), ".", "")));
      Freestylelevel_level1Column.AddObjectProperty("Invitemessage", GXutil.rtrim( edtCCTLinLgoD_Invitemessage));
      Freestylelevel_level1Column.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtCCTLinLgoD_Visible, (byte)(5), (byte)(0), ".", "")));
      Freestylelevel_level1Container.AddColumnProperties(Freestylelevel_level1Column);
      Freestylelevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Freestylelevel_level1Container.AddColumnProperties(Freestylelevel_level1Column);
      Freestylelevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Freestylelevel_level1Container.AddColumnProperties(Freestylelevel_level1Column);
      Freestylelevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Freestylelevel_level1Container.AddColumnProperties(Freestylelevel_level1Column);
      Freestylelevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Freestylelevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A4046CCTLinPict));
      Freestylelevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCCTLinPict_Enabled, (byte)(5), (byte)(0), ".", "")));
      Freestylelevel_level1Column.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtCCTLinPict_Visible, (byte)(5), (byte)(0), ".", "")));
      Freestylelevel_level1Container.AddColumnProperties(Freestylelevel_level1Column);
      Freestylelevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Freestylelevel_level1Container.AddColumnProperties(Freestylelevel_level1Column);
      Freestylelevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Freestylelevel_level1Container.AddColumnProperties(Freestylelevel_level1Column);
      Freestylelevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Freestylelevel_level1Container.AddColumnProperties(Freestylelevel_level1Column);
      Freestylelevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Freestylelevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A4408CCTSta));
      Freestylelevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCCTSta_Enabled, (byte)(5), (byte)(0), ".", "")));
      Freestylelevel_level1Column.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtCCTSta_Visible, (byte)(5), (byte)(0), ".", "")));
      Freestylelevel_level1Container.AddColumnProperties(Freestylelevel_level1Column);
      Freestylelevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Freestylelevel_level1Container.AddColumnProperties(Freestylelevel_level1Column);
      Freestylelevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Freestylelevel_level1Container.AddColumnProperties(Freestylelevel_level1Column);
      Freestylelevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Freestylelevel_level1Container.AddColumnProperties(Freestylelevel_level1Column);
      Freestylelevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Freestylelevel_level1Container.AddColumnProperties(Freestylelevel_level1Column);
      Freestylelevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Freestylelevel_level1Container.AddColumnProperties(Freestylelevel_level1Column);
      Freestylelevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Freestylelevel_level1Container.AddColumnProperties(Freestylelevel_level1Column);
      Freestylelevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Freestylelevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A13249CCVNorma));
      Freestylelevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCCVNorma_Enabled, (byte)(5), (byte)(0), ".", "")));
      Freestylelevel_level1Container.AddColumnProperties(Freestylelevel_level1Column);
      Freestylelevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Freestylelevel_level1Container.AddColumnProperties(Freestylelevel_level1Column);
      Freestylelevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Freestylelevel_level1Container.AddColumnProperties(Freestylelevel_level1Column);
      Freestylelevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Freestylelevel_level1Container.AddColumnProperties(Freestylelevel_level1Column);
      Freestylelevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Freestylelevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A13250CCVEspecif));
      Freestylelevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCCVEspecif_Enabled, (byte)(5), (byte)(0), ".", "")));
      Freestylelevel_level1Container.AddColumnProperties(Freestylelevel_level1Column);
      Freestylelevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Freestylelevel_level1Container.AddColumnProperties(Freestylelevel_level1Column);
      Freestylelevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Freestylelevel_level1Container.AddColumnProperties(Freestylelevel_level1Column);
      Freestylelevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Freestylelevel_level1Container.AddColumnProperties(Freestylelevel_level1Column);
      Freestylelevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Freestylelevel_level1Container.AddColumnProperties(Freestylelevel_level1Column);
      Freestylelevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Freestylelevel_level1Container.AddColumnProperties(Freestylelevel_level1Column);
      Freestylelevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Freestylelevel_level1Container.AddColumnProperties(Freestylelevel_level1Column);
      Freestylelevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Freestylelevel_level1Container.AddColumnProperties(Freestylelevel_level1Column);
      Freestylelevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Freestylelevel_level1Column.AddObjectProperty("Value", A11476CCTLinDscL);
      Freestylelevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCCTLinDscL_Enabled, (byte)(5), (byte)(0), ".", "")));
      Freestylelevel_level1Container.AddColumnProperties(Freestylelevel_level1Column);
      Freestylelevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Freestylelevel_level1Container.AddColumnProperties(Freestylelevel_level1Column);
      Freestylelevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Freestylelevel_level1Container.AddColumnProperties(Freestylelevel_level1Column);
      Freestylelevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Freestylelevel_level1Container.AddColumnProperties(Freestylelevel_level1Column);
      Freestylelevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Freestylelevel_level1Container.AddColumnProperties(Freestylelevel_level1Column);
      Freestylelevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Freestylelevel_level1Container.AddColumnProperties(Freestylelevel_level1Column);
      Freestylelevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Freestylelevel_level1Container.AddColumnProperties(Freestylelevel_level1Column);
      Freestylelevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Freestylelevel_level1Container.AddColumnProperties(Freestylelevel_level1Column);
      Freestylelevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Freestylelevel_level1Container.AddColumnProperties(Freestylelevel_level1Column);
      Freestylelevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Freestylelevel_level1Container.AddColumnProperties(Freestylelevel_level1Column);
      Freestylelevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Freestylelevel_level1Container.AddColumnProperties(Freestylelevel_level1Column);
      Freestylelevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Freestylelevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A11526CCVPict));
      Freestylelevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCCVPict_Enabled, (byte)(5), (byte)(0), ".", "")));
      Freestylelevel_level1Column.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtCCVPict_Visible, (byte)(5), (byte)(0), ".", "")));
      Freestylelevel_level1Container.AddColumnProperties(Freestylelevel_level1Column);
      Freestylelevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Freestylelevel_level1Container.AddColumnProperties(Freestylelevel_level1Column);
      Freestylelevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Freestylelevel_level1Container.AddColumnProperties(Freestylelevel_level1Column);
      Freestylelevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Freestylelevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A11528CCVTpoDat));
      Freestylelevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCCVTpoDat_Enabled, (byte)(5), (byte)(0), ".", "")));
      Freestylelevel_level1Column.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtCCVTpoDat_Visible, (byte)(5), (byte)(0), ".", "")));
      Freestylelevel_level1Container.AddColumnProperties(Freestylelevel_level1Column);
      Freestylelevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Freestylelevel_level1Container.AddColumnProperties(Freestylelevel_level1Column);
      Freestylelevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Freestylelevel_level1Container.AddColumnProperties(Freestylelevel_level1Column);
      Freestylelevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Freestylelevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A11529CCVDsc));
      Freestylelevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCCVDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Freestylelevel_level1Column.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtCCVDsc_Visible, (byte)(5), (byte)(0), ".", "")));
      Freestylelevel_level1Container.AddColumnProperties(Freestylelevel_level1Column);
      Freestylelevel_level1Container.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subFreestylelevel_level1_Selectedindex, (byte)(4), (byte)(0), ".", "")));
      Freestylelevel_level1Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subFreestylelevel_level1_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Freestylelevel_level1Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subFreestylelevel_level1_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Freestylelevel_level1Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subFreestylelevel_level1_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Freestylelevel_level1Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subFreestylelevel_level1_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Freestylelevel_level1Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subFreestylelevel_level1_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Freestylelevel_level1Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subFreestylelevel_level1_Collapsed, (byte)(1), (byte)(0), ".", "")));
   }

   public void startgridcontrol181( )
   {
      Gridlevel_notificacionesContainer.AddObjectProperty("GridName", "Gridlevel_notificaciones");
      Gridlevel_notificacionesContainer.AddObjectProperty("Header", subGridlevel_notificaciones_Header);
      Gridlevel_notificacionesContainer.AddObjectProperty("Class", "GridNoBorder WorkWith");
      Gridlevel_notificacionesContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_notificacionesContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_notificacionesContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridlevel_notificaciones_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_notificacionesContainer.AddObjectProperty("CmpContext", "");
      Gridlevel_notificacionesContainer.AddObjectProperty("InMasterPage", "false");
      Gridlevel_notificacionesColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_notificacionesColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A11481CCTNotId, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_notificacionesColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCCTNotId_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_notificacionesContainer.AddColumnProperties(Gridlevel_notificacionesColumn);
      Gridlevel_notificacionesColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_notificacionesColumn.AddObjectProperty("Value", GXutil.rtrim( A11477CCTNotEvt));
      Gridlevel_notificacionesColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( cmbCCTNotEvt.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      Gridlevel_notificacionesContainer.AddColumnProperties(Gridlevel_notificacionesColumn);
      Gridlevel_notificacionesColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_notificacionesColumn.AddObjectProperty("Value", GXutil.rtrim( A11478CCTNotDst));
      Gridlevel_notificacionesColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( cmbCCTNotDst.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      Gridlevel_notificacionesContainer.AddColumnProperties(Gridlevel_notificacionesColumn);
      Gridlevel_notificacionesColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_notificacionesColumn.AddObjectProperty("Value", GXutil.rtrim( A11479CCTNotUsr));
      Gridlevel_notificacionesColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( dynCCTNotUsr.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      Gridlevel_notificacionesContainer.AddColumnProperties(Gridlevel_notificacionesColumn);
      Gridlevel_notificacionesColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_notificacionesColumn.AddObjectProperty("Value", GXutil.rtrim( A11480CCTNotEml));
      Gridlevel_notificacionesColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCCTNotEml_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_notificacionesContainer.AddColumnProperties(Gridlevel_notificacionesColumn);
      Gridlevel_notificacionesColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_notificacionesColumn.AddObjectProperty("Value", A11523CCTNotAsu);
      Gridlevel_notificacionesColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCCTNotAsu_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_notificacionesContainer.AddColumnProperties(Gridlevel_notificacionesColumn);
      Gridlevel_notificacionesColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_notificacionesColumn.AddObjectProperty("Value", A11524CCTNotTxt);
      Gridlevel_notificacionesColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCCTNotTxt_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_notificacionesContainer.AddColumnProperties(Gridlevel_notificacionesColumn);
      Gridlevel_notificacionesColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_notificacionesColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A11525CCTNotAdj, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_notificacionesColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( cmbCCTNotAdj.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      Gridlevel_notificacionesContainer.AddColumnProperties(Gridlevel_notificacionesColumn);
      Gridlevel_notificacionesColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_notificacionesColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A12733CCTNotStp, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_notificacionesColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( cmbCCTNotStp.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      Gridlevel_notificacionesContainer.AddColumnProperties(Gridlevel_notificacionesColumn);
      Gridlevel_notificacionesContainer.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGridlevel_notificaciones_Selectedindex, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_notificacionesContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGridlevel_notificaciones_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_notificacionesContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGridlevel_notificaciones_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Gridlevel_notificacionesContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGridlevel_notificaciones_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_notificacionesContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGridlevel_notificaciones_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Gridlevel_notificacionesContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGridlevel_notificaciones_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_notificacionesContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGridlevel_notificaciones_Collapsed, (byte)(1), (byte)(0), ".", "")));
   }

   public void startgridcontrol154( )
   {
      Gridlevel_level2Container.AddObjectProperty("GridName", "Gridlevel_level2");
      Gridlevel_level2Container.AddObjectProperty("Header", subGridlevel_level2_Header);
      Gridlevel_level2Container.AddObjectProperty("Class", "GridNoBorder WorkWith");
      Gridlevel_level2Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_level2Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_level2Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridlevel_level2_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_level2Container.AddObjectProperty("CmpContext", "");
      Gridlevel_level2Container.AddObjectProperty("InMasterPage", "false");
      Gridlevel_level2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4049CCTValLin, (byte)(2), (byte)(0), ".", "")));
      Gridlevel_level2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCCTValLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level2Container.AddColumnProperties(Gridlevel_level2Column);
      Gridlevel_level2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level2Column.AddObjectProperty("Value", GXutil.rtrim( A4050CCTValDsc));
      Gridlevel_level2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCCTValDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level2Container.AddColumnProperties(Gridlevel_level2Column);
      Gridlevel_level2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level2Column.AddObjectProperty("Value", GXutil.rtrim( A4051CCTVal));
      Gridlevel_level2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCCTVal_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level2Container.AddColumnProperties(Gridlevel_level2Column);
      Gridlevel_level2Container.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGridlevel_level2_Selectedindex, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_level2Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGridlevel_level2_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_level2Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGridlevel_level2_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Gridlevel_level2Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGridlevel_level2_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_level2Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGridlevel_level2_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Gridlevel_level2Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGridlevel_level2_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_level2Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGridlevel_level2_Collapsed, (byte)(1), (byte)(0), ".", "")));
   }

   public void init_default_properties( )
   {
      edtCCTCod_Internalname = "CCTCOD" ;
      edtCCTDsc_Internalname = "CCTDSC" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      cmbCCTTpoCtr.setInternalname( "CCTTPOCTR" );
      chkCCTFinFas.setInternalname( "CCTFINFAS" );
      chkCCTIniFas.setInternalname( "CCTINIFAS" );
      chkCCTSto.setInternalname( "CCTSTO" );
      chkCCTObs.setInternalname( "CCTOBS" );
      divTablefases_Internalname = "TABLEFASES" ;
      edtavCctarc_Internalname = "vCCTARC" ;
      Upload_Internalname = "UPLOAD" ;
      divTablaupload_Internalname = "TABLAUPLOAD" ;
      lblTab1_title_Internalname = "TAB1_TITLE" ;
      edtCCTLin_Internalname = "CCTLIN" ;
      cmbCCTLinTpoI.setInternalname( "CCTLINTPOI" );
      dynCCVCod.setInternalname( "CCVCOD" );
      cmbCCTLinTpoD.setInternalname( "CCTLINTPOD" );
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      edtCCTLinDsc_Internalname = "CCTLINDSC" ;
      edtCCTLinVarW_Internalname = "CCTLINVARW" ;
      divUnnamedtable5_Internalname = "UNNAMEDTABLE5" ;
      edtCCTLinLgoD_Internalname = "CCTLINLGOD" ;
      edtCCTLinPict_Internalname = "CCTLINPICT" ;
      edtCCTSta_Internalname = "CCTSTA" ;
      divTableab_Internalname = "TABLEAB" ;
      edtCCVNorma_Internalname = "CCVNORMA" ;
      edtCCVEspecif_Internalname = "CCVESPECIF" ;
      divTablelast_Internalname = "TABLELAST" ;
      edtCCTLinDscL_Internalname = "CCTLINDSCL" ;
      divTableempty_Internalname = "TABLEEMPTY" ;
      edtCCTValLin_Internalname = "CCTVALLIN" ;
      edtCCTValDsc_Internalname = "CCTVALDSC" ;
      edtCCTVal_Internalname = "CCTVAL" ;
      divTableleaflevel_level2_Internalname = "TABLELEAFLEVEL_LEVEL2" ;
      divTableintermediateinslevel_level1_Internalname = "TABLEINTERMEDIATEINSLEVEL_LEVEL1" ;
      edtCCVPict_Internalname = "CCVPICT" ;
      edtCCVTpoDat_Internalname = "CCVTPODAT" ;
      edtCCVDsc_Internalname = "CCVDSC" ;
      tblUnnamedtablecontentfsfreestylelevel_level1_Internalname = "UNNAMEDTABLECONTENTFSFREESTYLELEVEL_LEVEL1" ;
      divUnnamedtablefsfreestylelevel_level1_Internalname = "UNNAMEDTABLEFSFREESTYLELEVEL_LEVEL1" ;
      divTableintermediatelevel_level1_Internalname = "TABLEINTERMEDIATELEVEL_LEVEL1" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      lblTab2_title_Internalname = "TAB2_TITLE" ;
      edtCCTNotId_Internalname = "CCTNOTID" ;
      cmbCCTNotEvt.setInternalname( "CCTNOTEVT" );
      cmbCCTNotDst.setInternalname( "CCTNOTDST" );
      dynCCTNotUsr.setInternalname( "CCTNOTUSR" );
      edtCCTNotEml_Internalname = "CCTNOTEML" ;
      edtCCTNotAsu_Internalname = "CCTNOTASU" ;
      edtCCTNotTxt_Internalname = "CCTNOTTXT" ;
      cmbCCTNotAdj.setInternalname( "CCTNOTADJ" );
      cmbCCTNotStp.setInternalname( "CCTNOTSTP" );
      divTableleaflevel_notificaciones_Internalname = "TABLELEAFLEVEL_NOTIFICACIONES" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      Gxuitabspanel_tabs1_Internalname = "GXUITABSPANEL_TABS1" ;
      divTablepanelgeneral_Internalname = "TABLEPANELGENERAL" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      lblCctarc_txt_Internalname = "CCTARC_TXT" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      bttBtntrn_delete_Internalname = "BTNTRN_DELETE" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtEmprCod_Internalname = "EMPRCOD" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      edtCCTObl_Internalname = "CCTOBL" ;
      edtCCTNotUlt_Internalname = "CCTNOTULT" ;
      edtCCTArc_Internalname = "CCTARC" ;
      divHtml_bottomauxiliarcontrols_Internalname = "HTML_BOTTOMAUXILIARCONTROLS" ;
      divLayoutmaintable_Internalname = "LAYOUTMAINTABLE" ;
      Form.setInternalname( "FORM" );
      subGridlevel_level2_Internalname = "GRIDLEVEL_LEVEL2" ;
      subFreestylelevel_level1_Internalname = "FREESTYLELEVEL_LEVEL1" ;
      subGridlevel_notificaciones_Internalname = "GRIDLEVEL_NOTIFICACIONES" ;
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
      subGridlevel_level2_Allowcollapsing = (byte)(0) ;
      subGridlevel_level2_Allowselection = (byte)(0) ;
      subGridlevel_level2_Header = "" ;
      subGridlevel_notificaciones_Allowcollapsing = (byte)(0) ;
      subGridlevel_notificaciones_Allowselection = (byte)(0) ;
      subGridlevel_notificaciones_Header = "" ;
      subFreestylelevel_level1_Allowcollapsing = (byte)(0) ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Definición de Cont. de Calidad", "") );
      cmbCCTNotStp.setJsonclick( "" );
      cmbCCTNotAdj.setJsonclick( "" );
      edtCCTNotTxt_Jsonclick = "" ;
      edtCCTNotAsu_Jsonclick = "" ;
      edtCCTNotEml_Jsonclick = "" ;
      dynCCTNotUsr.setJsonclick( "" );
      cmbCCTNotDst.setJsonclick( "" );
      cmbCCTNotEvt.setJsonclick( "" );
      edtCCTNotId_Jsonclick = "" ;
      subGridlevel_notificaciones_Class = "GridNoBorder WorkWith" ;
      subGridlevel_notificaciones_Backcolorstyle = (byte)(0) ;
      edtCCTVal_Jsonclick = "" ;
      edtCCTValDsc_Jsonclick = "" ;
      edtCCTValLin_Jsonclick = "" ;
      subGridlevel_level2_Class = "GridNoBorder WorkWith" ;
      subGridlevel_level2_Backcolorstyle = (byte)(0) ;
      edtCCVDsc_Jsonclick = "" ;
      edtCCVTpoDat_Jsonclick = "" ;
      edtCCVPict_Jsonclick = "" ;
      edtCCVEspecif_Jsonclick = "" ;
      edtCCVNorma_Jsonclick = "" ;
      edtCCTSta_Jsonclick = "" ;
      edtCCTLinPict_Jsonclick = "" ;
      edtCCTLinLgoD_Jsonclick = "" ;
      edtCCTLinVarW_Jsonclick = "" ;
      edtCCTLinDsc_Jsonclick = "" ;
      cmbCCTLinTpoD.setJsonclick( "" );
      dynCCVCod.setJsonclick( "" );
      cmbCCTLinTpoI.setJsonclick( "" );
      edtCCTLin_Jsonclick = "" ;
      subFreestylelevel_level1_Class = "FreeStyleGrid" ;
      subFreestylelevel_level1_Backcolorstyle = (byte)(0) ;
      edtCCTVal_Enabled = 1 ;
      edtCCTValDsc_Enabled = 1 ;
      edtCCTValLin_Enabled = 1 ;
      cmbCCTNotStp.setEnabled( 1 );
      cmbCCTNotAdj.setEnabled( 1 );
      edtCCTNotTxt_Enabled = 1 ;
      edtCCTNotAsu_Enabled = 1 ;
      edtCCTNotEml_Enabled = 1 ;
      dynCCTNotUsr.setEnabled( 1 );
      cmbCCTNotDst.setEnabled( 1 );
      cmbCCTNotEvt.setEnabled( 1 );
      edtCCTNotId_Enabled = 1 ;
      edtCCVDsc_Enabled = 0 ;
      edtCCVTpoDat_Enabled = 0 ;
      edtCCVPict_Enabled = 0 ;
      edtCCTLinDscL_Enabled = 1 ;
      edtCCVEspecif_Enabled = 1 ;
      edtCCVNorma_Enabled = 1 ;
      edtCCTSta_Visible = 1 ;
      edtCCTSta_Enabled = 1 ;
      edtCCTLinPict_Visible = 1 ;
      edtCCTLinPict_Enabled = 1 ;
      edtCCTLinLgoD_Visible = 1 ;
      edtCCTLinLgoD_Invitemessage = "" ;
      edtCCTLinLgoD_Enabled = 1 ;
      edtCCTLinVarW_Enabled = 1 ;
      edtCCTLinDsc_Visible = 1 ;
      edtCCTLinDsc_Enabled = 1 ;
      cmbCCTLinTpoD.setEnabled( 1 );
      cmbCCTLinTpoD.setVisible( 1 );
      dynCCVCod.setEnabled( 1 );
      cmbCCTLinTpoI.setEnabled( 1 );
      cmbCCTLinTpoI.setVisible( 1 );
      edtCCTLin_Visible = 1 ;
      edtCCTLin_Enabled = 1 ;
      subFreestylelevel_level1_Rows = 5 ;
      edtCCTArc_Jsonclick = "" ;
      edtCCTArc_Enabled = 0 ;
      edtCCTArc_Visible = 1 ;
      edtCCTNotUlt_Jsonclick = "" ;
      edtCCTNotUlt_Enabled = 0 ;
      edtCCTNotUlt_Visible = 1 ;
      edtCCTObl_Jsonclick = "" ;
      edtCCTObl_Enabled = 1 ;
      edtCCTObl_Visible = 1 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Enabled = 0 ;
      edtEmprNom_Visible = 1 ;
      edtEmprCod_Jsonclick = "" ;
      edtEmprCod_Enabled = 1 ;
      edtEmprCod_Visible = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      bttBtntrn_delete_Enabled = 0 ;
      bttBtntrn_delete_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      Gxuitabspanel_tabs1_Historymanagement = GXutil.toBoolean( 0) ;
      Gxuitabspanel_tabs1_Class = "" ;
      Gxuitabspanel_tabs1_Pagecount = 2 ;
      Upload_Autodisableaddingfiles = GXutil.toBoolean( 0) ;
      Upload_Maxnumberoffiles = 1 ;
      Upload_Tooltiptext = "Enviar el modelo" ;
      Upload_Hideadditionalbuttons = GXutil.toBoolean( -1) ;
      Upload_Autoupload = GXutil.toBoolean( -1) ;
      edtavCctarc_Jsonclick = "" ;
      edtavCctarc_Enabled = 0 ;
      chkCCTObs.setEnabled( 1 );
      chkCCTObs.setVisible( 1 );
      chkCCTSto.setEnabled( 1 );
      chkCCTIniFas.setEnabled( 1 );
      chkCCTFinFas.setEnabled( 1 );
      cmbCCTTpoCtr.setJsonclick( "" );
      cmbCCTTpoCtr.setEnabled( 1 );
      edtCCTDsc_Jsonclick = "" ;
      edtCCTDsc_Enabled = 1 ;
      edtCCTCod_Jsonclick = "" ;
      edtCCTCod_Enabled = 1 ;
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
      edtCCVDsc_Visible = 1 ;
      edtCCVTpoDat_Visible = 1 ;
      edtCCVPict_Visible = 1 ;
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

   public void gxdlaccvcodIA622( String A396EmprCod )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxdlaccvcod_dataIA622( A396EmprCod) ;
      gxdynajaxindex = 1 ;
      while ( gxdynajaxindex <= gxdynajaxctrlcodr.getCount() )
      {
         addString( gxwrpcisep+"{\"c\":\""+PrivateUtilities.encodeJSConstant( gxdynajaxctrlcodr.item(gxdynajaxindex))+"\",\"d\":\""+PrivateUtilities.encodeJSConstant( gxdynajaxctrldescr.item(gxdynajaxindex))+"\"}") ;
         gxdynajaxindex = (int)(gxdynajaxindex+1) ;
         gxwrpcisep = "," ;
      }
      addString( "]") ;
      if ( gxdynajaxctrlcodr.getCount() == 0 )
      {
         addString( ",101") ;
      }
      addString( "]") ;
   }

   public void gxaccvcod_htmlIA622( String A396EmprCod )
   {
      String gxdynajaxvalue;
      gxdlaccvcod_dataIA622( A396EmprCod) ;
      gxdynajaxindex = 1 ;
      if ( ! ( gxdyncontrolsrefreshing && httpContext.isAjaxRequest( ) ) )
      {
         dynCCVCod.removeAllItems();
      }
      while ( gxdynajaxindex <= gxdynajaxctrlcodr.getCount() )
      {
         gxdynajaxvalue = gxdynajaxctrlcodr.item(gxdynajaxindex) ;
         dynCCVCod.addItem(gxdynajaxvalue, gxdynajaxctrldescr.item(gxdynajaxindex), (short)(0));
         gxdynajaxindex = (int)(gxdynajaxindex+1) ;
      }
   }

   protected void gxdlaccvcod_dataIA622( String A396EmprCod )
   {
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      /* Using cursor T00IA53 */
      pr_default.execute(51, new Object[] {A396EmprCod});
      while ( (pr_default.getStatus(51) != 101) )
      {
         gxdynajaxctrlcodr.add(GXutil.rtrim( T00IA53_A11522CCVCod[0]));
         gxdynajaxctrldescr.add(GXutil.rtrim( T00IA53_A11529CCVDsc[0]));
         pr_default.readNext(51);
      }
      pr_default.close(51);
   }

   public void xc_49_IA622( String A396EmprCod ,
                            int A4031CCTCod ,
                            short A4034CCTLin ,
                            String A4037CCTTpoCtr )
   {
      if ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "I", "")) == 0 )
      {
         new app.controlcalidadhtd.pccintval(remoteHandle, context).execute( A396EmprCod, A4031CCTCod, A4034CCTLin) ;
      }
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

   public void gxnrfreestylelevel_level1_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_79622( ) ;
      while ( nGXsfl_79_idx <= nRC_GXsfl_79 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModalIA622( ) ;
         standaloneModalIA622( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRowIA622( ) ;
         Freestylelevel_level1Row.AddGrid("Gridlevel_level2", Gridlevel_level2Container);
         nGXsfl_79_idx = (int)(nGXsfl_79_idx+1) ;
         sGXsfl_79_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_79_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_79622( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Freestylelevel_level1Container)) ;
      /* End function gxnrFreestylelevel_level1_newrow */
   }

   public void gxnrgridlevel_level2_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_154623( ) ;
      while ( nGXsfl_154_idx <= nRC_GXsfl_154 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModalIA622( ) ;
         standaloneModalIA622( ) ;
         standaloneNotModalIA623( ) ;
         standaloneModalIA623( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRowIA623( ) ;
         nGXsfl_154_idx = (int)(nGXsfl_154_idx+1) ;
         sGXsfl_154_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_154_idx), 4, 0), (short)(4), "0") + sGXsfl_79_idx ;
         subsflControlProps_154623( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Gridlevel_level2Container)) ;
      /* End function gxnrGridlevel_level2_newrow */
   }

   public void gxnrgridlevel_notificaciones_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_1811529( ) ;
      while ( nGXsfl_181_idx <= nRC_GXsfl_181 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModalIA1529( ) ;
         standaloneModalIA1529( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRowIA1529( ) ;
         nGXsfl_181_idx = (int)(nGXsfl_181_idx+1) ;
         sGXsfl_181_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_181_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1811529( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Gridlevel_notificacionesContainer)) ;
      /* End function gxnrGridlevel_notificaciones_newrow */
   }

   public void init_web_controls( )
   {
      cmbCCTTpoCtr.setName( "CCTTPOCTR" );
      cmbCCTTpoCtr.setWebtags( "" );
      cmbCCTTpoCtr.addItem("E", httpContext.getMessage( "ISO (Externo)", ""), (short)(0));
      cmbCCTTpoCtr.addItem("I", httpContext.getMessage( "Interno", ""), (short)(0));
      cmbCCTTpoCtr.addItem("D", httpContext.getMessage( "Defectos", ""), (short)(0));
      if ( cmbCCTTpoCtr.getItemCount() > 0 )
      {
         A4037CCTTpoCtr = cmbCCTTpoCtr.getValidValue(A4037CCTTpoCtr) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4037CCTTpoCtr", A4037CCTTpoCtr);
      }
      chkCCTFinFas.setName( "CCTFINFAS" );
      chkCCTFinFas.setWebtags( "" );
      chkCCTFinFas.setCaption( httpContext.getMessage( "Final de Fase", "") );
      httpContext.ajax_rsp_assign_prop("", false, chkCCTFinFas.getInternalname(), "TitleCaption", chkCCTFinFas.getCaption(), true);
      chkCCTFinFas.setCheckedValue( "N" );
      A4406CCTFinFas = ((GXutil.strcmp(GXutil.rtrim( A4406CCTFinFas), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "A4406CCTFinFas", A4406CCTFinFas);
      chkCCTIniFas.setName( "CCTINIFAS" );
      chkCCTIniFas.setWebtags( "" );
      chkCCTIniFas.setCaption( httpContext.getMessage( "Inicio de Fase", "") );
      httpContext.ajax_rsp_assign_prop("", false, chkCCTIniFas.getInternalname(), "TitleCaption", chkCCTIniFas.getCaption(), true);
      chkCCTIniFas.setCheckedValue( "N" );
      A4407CCTIniFas = ((GXutil.strcmp(GXutil.rtrim( A4407CCTIniFas), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "A4407CCTIniFas", A4407CCTIniFas);
      chkCCTSto.setName( "CCTSTO" );
      chkCCTSto.setWebtags( "" );
      chkCCTSto.setCaption( httpContext.getMessage( "Paro de Producción", "") );
      httpContext.ajax_rsp_assign_prop("", false, chkCCTSto.getInternalname(), "TitleCaption", chkCCTSto.getCaption(), true);
      chkCCTSto.setCheckedValue( "N" );
      A4040CCTSto = ((GXutil.strcmp(GXutil.rtrim( A4040CCTSto), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "A4040CCTSto", A4040CCTSto);
      chkCCTObs.setName( "CCTOBS" );
      chkCCTObs.setWebtags( "" );
      chkCCTObs.setCaption( httpContext.getMessage( "Observaciones", "") );
      httpContext.ajax_rsp_assign_prop("", false, chkCCTObs.getInternalname(), "TitleCaption", chkCCTObs.getCaption(), true);
      chkCCTObs.setCheckedValue( "N" );
      A4042CCTObs = ((GXutil.strcmp(GXutil.rtrim( A4042CCTObs), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "A4042CCTObs", A4042CCTObs);
      GXCCtl = "CCTLINTPOI_" + sGXsfl_79_idx ;
      cmbCCTLinTpoI.setName( GXCCtl );
      cmbCCTLinTpoI.setWebtags( "" );
      cmbCCTLinTpoI.addItem("L", httpContext.getMessage( "Lista", ""), (short)(0));
      cmbCCTLinTpoI.addItem("R", httpContext.getMessage( "Rango", ""), (short)(0));
      if ( cmbCCTLinTpoI.getItemCount() > 0 )
      {
         A4048CCTLinTpoI = cmbCCTLinTpoI.getValidValue(A4048CCTLinTpoI) ;
      }
      GXCCtl = "CCVCOD_" + sGXsfl_79_idx ;
      dynCCVCod.setName( GXCCtl );
      dynCCVCod.setWebtags( "" );
      GXCCtl = "CCTLINTPOD_" + sGXsfl_79_idx ;
      cmbCCTLinTpoD.setName( GXCCtl );
      cmbCCTLinTpoD.setWebtags( "" );
      cmbCCTLinTpoD.addItem("F", httpContext.getMessage( "Fecha", ""), (short)(0));
      cmbCCTLinTpoD.addItem("N", httpContext.getMessage( "Numérico", ""), (short)(0));
      cmbCCTLinTpoD.addItem("H", httpContext.getMessage( "Hora", ""), (short)(0));
      cmbCCTLinTpoD.addItem("C", httpContext.getMessage( "Caracteres", ""), (short)(0));
      cmbCCTLinTpoD.addItem("T", httpContext.getMessage( "Título", ""), (short)(0));
      if ( cmbCCTLinTpoD.getItemCount() > 0 )
      {
         A4044CCTLinTpoD = cmbCCTLinTpoD.getValidValue(A4044CCTLinTpoD) ;
      }
      GXCCtl = "CCTNOTEVT_" + sGXsfl_181_idx ;
      cmbCCTNotEvt.setName( GXCCtl );
      cmbCCTNotEvt.setWebtags( "" );
      cmbCCTNotEvt.addItem("E", httpContext.getMessage( "Si falla validación", ""), (short)(0));
      cmbCCTNotEvt.addItem("O", httpContext.getMessage( "Si esta todo Ok", ""), (short)(0));
      cmbCCTNotEvt.addItem("S", httpContext.getMessage( "Siempre", ""), (short)(0));
      if ( cmbCCTNotEvt.getItemCount() > 0 )
      {
         A11477CCTNotEvt = cmbCCTNotEvt.getValidValue(A11477CCTNotEvt) ;
      }
      GXCCtl = "CCTNOTDST_" + sGXsfl_181_idx ;
      cmbCCTNotDst.setName( GXCCtl );
      cmbCCTNotDst.setWebtags( "" );
      cmbCCTNotDst.addItem("C", httpContext.getMessage( "Cliente", ""), (short)(0));
      cmbCCTNotDst.addItem("V", httpContext.getMessage( "Vendedor", ""), (short)(0));
      cmbCCTNotDst.addItem("U", httpContext.getMessage( "Usuario", ""), (short)(0));
      cmbCCTNotDst.addItem("M", httpContext.getMessage( "email específico", ""), (short)(0));
      if ( cmbCCTNotDst.getItemCount() > 0 )
      {
         A11478CCTNotDst = cmbCCTNotDst.getValidValue(A11478CCTNotDst) ;
      }
      GXCCtl = "CCTNOTUSR_" + sGXsfl_181_idx ;
      dynCCTNotUsr.setName( GXCCtl );
      dynCCTNotUsr.setWebtags( "" );
      dynCCTNotUsr.removeAllItems();
      /* Using cursor T00IA54 */
      pr_default.execute(52);
      while ( (pr_default.getStatus(52) != 101) )
      {
         dynCCTNotUsr.addItem(T00IA54_A850UsurCod[0], T00IA54_A854UsurNom[0], (short)(0));
         pr_default.readNext(52);
      }
      pr_default.close(52);
      if ( dynCCTNotUsr.getItemCount() > 0 )
      {
         A11479CCTNotUsr = dynCCTNotUsr.getValidValue(A11479CCTNotUsr) ;
      }
      GXCCtl = "CCTNOTADJ_" + sGXsfl_181_idx ;
      cmbCCTNotAdj.setName( GXCCtl );
      cmbCCTNotAdj.setWebtags( "" );
      cmbCCTNotAdj.addItem("0", httpContext.getMessage( "Datos en Mensaje", ""), (short)(0));
      cmbCCTNotAdj.addItem("1", httpContext.getMessage( "Datos en Adjunto", ""), (short)(0));
      if ( cmbCCTNotAdj.getItemCount() > 0 )
      {
         A11525CCTNotAdj = (byte)(GXutil.lval( cmbCCTNotAdj.getValidValue(GXutil.trim( GXutil.str( A11525CCTNotAdj, 1, 0))))) ;
      }
      GXCCtl = "CCTNOTSTP_" + sGXsfl_181_idx ;
      cmbCCTNotStp.setName( GXCCtl );
      cmbCCTNotStp.setWebtags( "" );
      cmbCCTNotStp.addItem("0", httpContext.getMessage( "N", ""), (short)(0));
      cmbCCTNotStp.addItem("1", httpContext.getMessage( "S", ""), (short)(0));
      if ( cmbCCTNotStp.getItemCount() > 0 )
      {
         if ( isIns( ) && (0==A12733CCTNotStp) )
         {
            A12733CCTNotStp = (byte)(0) ;
         }
      }
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

   public void valid_Emprcod( )
   {
      A11522CCVCod = dynCCVCod.getValue() ;
      n407EmprNom = false ;
      /* Using cursor T00IA20 */
      pr_default.execute(18, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(18) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A407EmprNom = T00IA20_A407EmprNom[0] ;
      n407EmprNom = T00IA20_n407EmprNom[0] ;
      pr_default.close(18);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
   }

   public void valid_Ccttpoctr( )
   {
      A4037CCTTpoCtr = cmbCCTTpoCtr.getValue() ;
      A11522CCVCod = dynCCVCod.getValue() ;
      if ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( httpContext.getMessage( "D", ""), "")) == 0 )
      {
         chkCCTObs.setEnabled( 0 );
      }
      else
      {
         chkCCTObs.setEnabled( 1 );
      }
      if ( ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "I", "")) == 0 ) || ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "D", "")) == 0 ) )
      {
         A4041CCTArc = "" ;
      }
      if ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "D", "")) == 0 )
      {
         chkCCTObs.setVisible( 0 );
      }
      else
      {
         if ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "D", "")) != 0 )
         {
            chkCCTObs.setVisible( 1 );
         }
      }
      if ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "D", "")) == 0 )
      {
         edtCCTLin_Visible = 0 ;
      }
      else
      {
         if ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "D", "")) != 0 )
         {
            edtCCTLin_Visible = 1 ;
         }
      }
      if ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "D", "")) == 0 )
      {
         edtCCTLinDsc_Visible = 0 ;
      }
      else
      {
         if ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "D", "")) != 0 )
         {
            edtCCTLinDsc_Visible = 1 ;
         }
      }
      if ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "D", "")) == 0 )
      {
         edtCCTSta_Visible = 0 ;
      }
      else
      {
         if ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "D", "")) != 0 )
         {
            edtCCTSta_Visible = 1 ;
         }
      }
      if ( ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "I", "")) == 0 ) || ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "D", "")) == 0 ) )
      {
         cmbCCTLinTpoI.setVisible( 0 );
      }
      else
      {
         if ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "E", "")) == 0 )
         {
            cmbCCTLinTpoI.setVisible( 1 );
         }
      }
      if ( ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "I", "")) == 0 ) || ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "D", "")) == 0 ) )
      {
         cmbCCTLinTpoD.setVisible( 0 );
      }
      else
      {
         if ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "E", "")) == 0 )
         {
            cmbCCTLinTpoD.setVisible( 1 );
         }
      }
      if ( ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "I", "")) == 0 ) || ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "D", "")) == 0 ) )
      {
         edtCCTLinLgoD_Visible = 0 ;
      }
      else
      {
         if ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "E", "")) == 0 )
         {
            edtCCTLinLgoD_Visible = 1 ;
         }
      }
      if ( ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "I", "")) == 0 ) || ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "D", "")) == 0 ) )
      {
         edtCCTLinPict_Visible = 0 ;
      }
      else
      {
         if ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "E", "")) == 0 )
         {
            edtCCTLinPict_Visible = 1 ;
         }
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_prop("", false, chkCCTObs.getInternalname(), "Enabled", GXutil.ltrimstr( chkCCTObs.getEnabled(), 5, 0), true);
      httpContext.ajax_rsp_assign_attri("", false, "A4041CCTArc", GXutil.rtrim( A4041CCTArc));
      httpContext.ajax_rsp_assign_prop("", false, chkCCTObs.getInternalname(), "Visible", GXutil.ltrimstr( chkCCTObs.getVisible(), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtCCTLin_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLin_Visible), 5, 0), !bGXsfl_79_Refreshing);
      httpContext.ajax_rsp_assign_prop("", false, edtCCTLinDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLinDsc_Visible), 5, 0), !bGXsfl_79_Refreshing);
      httpContext.ajax_rsp_assign_prop("", false, edtCCTSta_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTSta_Visible), 5, 0), !bGXsfl_79_Refreshing);
      httpContext.ajax_rsp_assign_prop("", false, cmbCCTLinTpoI.getInternalname(), "Visible", GXutil.ltrimstr( cmbCCTLinTpoI.getVisible(), 5, 0), !bGXsfl_79_Refreshing);
      httpContext.ajax_rsp_assign_prop("", false, cmbCCTLinTpoD.getInternalname(), "Visible", GXutil.ltrimstr( cmbCCTLinTpoD.getVisible(), 5, 0), !bGXsfl_79_Refreshing);
      httpContext.ajax_rsp_assign_prop("", false, edtCCTLinLgoD_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLinLgoD_Visible), 5, 0), !bGXsfl_79_Refreshing);
      httpContext.ajax_rsp_assign_prop("", false, edtCCTLinPict_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLinPict_Visible), 5, 0), !bGXsfl_79_Refreshing);
   }

   public void valid_Cctlin( )
   {
      A4037CCTTpoCtr = cmbCCTTpoCtr.getValue() ;
      A11522CCVCod = dynCCVCod.getValue() ;
      if ( A4034CCTLin <= 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Se debe introducir un código", ""), 1, "CCTLIN");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCCTLin_Internalname ;
      }
      if ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "I", "")) == 0 )
      {
         new app.controlcalidadhtd.pccintval(remoteHandle, context).execute( A396EmprCod, A4031CCTCod, A4034CCTLin) ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
   }

   public void valid_Ccvcod( )
   {
      A4048CCTLinTpoI = cmbCCTLinTpoI.getValue() ;
      A11522CCVCod = dynCCVCod.getValue() ;
      n11526CCVPict = false ;
      n11527CCVLgoDat = false ;
      n11528CCVTpoDat = false ;
      n11529CCVDsc = false ;
      A4044CCTLinTpoD = cmbCCTLinTpoD.getValue() ;
      cmbCCTLinTpoD.setValue( A4044CCTLinTpoD );
      /* Using cursor T00IA35 */
      pr_default.execute(33, new Object[] {A396EmprCod, A11522CCVCod});
      if ( (pr_default.getStatus(33) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Variables Automáticas", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CCVCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = dynCCVCod.getInternalname() ;
      }
      A11526CCVPict = T00IA35_A11526CCVPict[0] ;
      n11526CCVPict = T00IA35_n11526CCVPict[0] ;
      A11527CCVLgoDat = T00IA35_A11527CCVLgoDat[0] ;
      n11527CCVLgoDat = T00IA35_n11527CCVLgoDat[0] ;
      A11528CCVTpoDat = T00IA35_A11528CCVTpoDat[0] ;
      n11528CCVTpoDat = T00IA35_n11528CCVTpoDat[0] ;
      A11529CCVDsc = T00IA35_A11529CCVDsc[0] ;
      n11529CCVDsc = T00IA35_n11529CCVDsc[0] ;
      pr_default.close(33);
      if ( ( ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "I", "")) == 0 ) ) && ( isIns( )  || isUpd( )  ) )
      {
         A4045CCTLinLgoD = (short)(1) ;
      }
      else
      {
         if ( ( GXutil.strcmp(A4048CCTLinTpoI, httpContext.getMessage( "A", "")) == 0 ) && true /* After */ )
         {
            A4045CCTLinLgoD = A11527CCVLgoDat ;
         }
      }
      if ( ( ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "I", "")) == 0 ) ) && ( isIns( )  || isUpd( )  ) )
      {
         A4046CCTLinPict = "9" ;
      }
      else
      {
         if ( ( GXutil.strcmp(A4048CCTLinTpoI, httpContext.getMessage( "A", "")) == 0 ) && true /* After */ )
         {
            A4046CCTLinPict = A11526CCVPict ;
         }
      }
      if ( ( ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "I", "")) == 0 ) ) && ( isIns( )  || isUpd( )  ) )
      {
         A4044CCTLinTpoD = httpContext.getMessage( "N", "") ;
         cmbCCTLinTpoD.setValue( A4044CCTLinTpoD );
      }
      else
      {
         if ( ( GXutil.strcmp(A4048CCTLinTpoI, httpContext.getMessage( "A", "")) == 0 ) && true /* After */ )
         {
            A4044CCTLinTpoD = A11528CCVTpoDat ;
            cmbCCTLinTpoD.setValue( A4044CCTLinTpoD );
         }
      }
      if ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( httpContext.getMessage( "D", ""), "")) == 0 )
      {
         edtCCTLinDsc_Enabled = 0 ;
      }
      else
      {
         if ( ( GXutil.strcmp(A4048CCTLinTpoI, httpContext.getMessage( httpContext.getMessage( "A", ""), "")) == 0 ) && true /* After */ )
         {
            edtCCTLinDsc_Enabled = 0 ;
         }
         else
         {
            edtCCTLinDsc_Enabled = 1 ;
         }
      }
      if ( ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( httpContext.getMessage( "I", ""), "")) == 0 ) || ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( httpContext.getMessage( "D", ""), "")) == 0 ) )
      {
         cmbCCTLinTpoD.setEnabled( 0 );
      }
      else
      {
         if ( ( GXutil.strcmp(A4048CCTLinTpoI, httpContext.getMessage( httpContext.getMessage( "A", ""), "")) == 0 ) && true /* After */ )
         {
            cmbCCTLinTpoD.setEnabled( 0 );
         }
         else
         {
            cmbCCTLinTpoD.setEnabled( 1 );
         }
      }
      if ( ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( httpContext.getMessage( "I", ""), "")) == 0 ) || ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( httpContext.getMessage( "D", ""), "")) == 0 ) )
      {
         edtCCTLinLgoD_Enabled = 0 ;
      }
      else
      {
         if ( ( GXutil.strcmp(A4048CCTLinTpoI, httpContext.getMessage( httpContext.getMessage( "A", ""), "")) == 0 ) && true /* After */ )
         {
            edtCCTLinLgoD_Enabled = 0 ;
         }
         else
         {
            edtCCTLinLgoD_Enabled = 1 ;
         }
      }
      if ( ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( httpContext.getMessage( "I", ""), "")) == 0 ) || ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( httpContext.getMessage( "D", ""), "")) == 0 ) )
      {
         edtCCTLinPict_Enabled = 0 ;
      }
      else
      {
         if ( ( GXutil.strcmp(A4048CCTLinTpoI, httpContext.getMessage( httpContext.getMessage( "A", ""), "")) == 0 ) && true /* After */ )
         {
            edtCCTLinPict_Enabled = 0 ;
         }
         else
         {
            edtCCTLinPict_Enabled = 1 ;
         }
      }
      if ( ( GXutil.strcmp(A4048CCTLinTpoI, httpContext.getMessage( "A", "")) == 0 ) && true /* After */ )
      {
         A4043CCTLinDsc = A11529CCVDsc ;
      }
      if ( ( GXutil.strcmp(A4048CCTLinTpoI, "A") == 0 ) && ( GXutil.strcmp(A11522CCVCod, "NoAplica") == 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Debe Seleccionar una variable", ""), 1, "CCVCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = dynCCVCod.getInternalname() ;
      }
      dynload_actions( ) ;
      if ( cmbCCTLinTpoD.getItemCount() > 0 )
      {
         A4044CCTLinTpoD = cmbCCTLinTpoD.getValidValue(A4044CCTLinTpoD) ;
         cmbCCTLinTpoD.setValue( A4044CCTLinTpoD );
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbCCTLinTpoD.setValue( GXutil.rtrim( A4044CCTLinTpoD) );
      }
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A11526CCVPict", GXutil.rtrim( A11526CCVPict));
      httpContext.ajax_rsp_assign_attri("", false, "A11527CCVLgoDat", GXutil.ltrim( localUtil.ntoc( A11527CCVLgoDat, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11528CCVTpoDat", GXutil.rtrim( A11528CCVTpoDat));
      httpContext.ajax_rsp_assign_attri("", false, "A11529CCVDsc", GXutil.rtrim( A11529CCVDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A4045CCTLinLgoD", GXutil.ltrim( localUtil.ntoc( A4045CCTLinLgoD, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4046CCTLinPict", GXutil.rtrim( A4046CCTLinPict));
      httpContext.ajax_rsp_assign_attri("", false, "A4044CCTLinTpoD", GXutil.rtrim( A4044CCTLinTpoD));
      cmbCCTLinTpoD.setValue( GXutil.rtrim( A4044CCTLinTpoD) );
      httpContext.ajax_rsp_assign_prop("", false, cmbCCTLinTpoD.getInternalname(), "Values", cmbCCTLinTpoD.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_prop("", false, edtCCTLinDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLinDsc_Enabled), 5, 0), !bGXsfl_79_Refreshing);
      httpContext.ajax_rsp_assign_prop("", false, cmbCCTLinTpoD.getInternalname(), "Enabled", GXutil.ltrimstr( cmbCCTLinTpoD.getEnabled(), 5, 0), !bGXsfl_79_Refreshing);
      httpContext.ajax_rsp_assign_prop("", false, edtCCTLinLgoD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLinLgoD_Enabled), 5, 0), !bGXsfl_79_Refreshing);
      httpContext.ajax_rsp_assign_prop("", false, edtCCTLinPict_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLinPict_Enabled), 5, 0), !bGXsfl_79_Refreshing);
      httpContext.ajax_rsp_assign_attri("", false, "A4043CCTLinDsc", GXutil.rtrim( A4043CCTLinDsc));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV28EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV29CCTCod',fld:'vCCTCOD',pic:'ZZZZZ9',hsh:true},{av:'AV37isVariable',fld:'vISVARIABLE',pic:'',hsh:true},{av:'A4406CCTFinFas',fld:'CCTFINFAS',pic:'@!'},{av:'A4407CCTIniFas',fld:'CCTINIFAS',pic:'@!'},{av:'A4040CCTSto',fld:'CCTSTO',pic:'@!'},{av:'A4042CCTObs',fld:'CCTOBS',pic:'@!'}]");
      setEventMetadata("ENTER",",oparms:[{av:'A4406CCTFinFas',fld:'CCTFINFAS',pic:'@!'},{av:'A4407CCTIniFas',fld:'CCTINIFAS',pic:'@!'},{av:'A4040CCTSto',fld:'CCTSTO',pic:'@!'},{av:'A4042CCTObs',fld:'CCTOBS',pic:'@!'}]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV31TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true},{av:'AV37isVariable',fld:'vISVARIABLE',pic:'',hsh:true},{av:'AV28EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV29CCTCod',fld:'vCCTCOD',pic:'ZZZZZ9',hsh:true},{av:'A4406CCTFinFas',fld:'CCTFINFAS',pic:'@!'},{av:'A4407CCTIniFas',fld:'CCTINIFAS',pic:'@!'},{av:'A4040CCTSto',fld:'CCTSTO',pic:'@!'},{av:'A4042CCTObs',fld:'CCTOBS',pic:'@!'}]");
      setEventMetadata("REFRESH",",oparms:[{av:'A4406CCTFinFas',fld:'CCTFINFAS',pic:'@!'},{av:'A4407CCTIniFas',fld:'CCTINIFAS',pic:'@!'},{av:'A4040CCTSto',fld:'CCTSTO',pic:'@!'},{av:'A4042CCTObs',fld:'CCTOBS',pic:'@!'}]}");
      setEventMetadata("AFTER TRN","{handler:'e13IA2',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV31TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true},{av:'A4406CCTFinFas',fld:'CCTFINFAS',pic:'@!'},{av:'A4407CCTIniFas',fld:'CCTINIFAS',pic:'@!'},{av:'A4040CCTSto',fld:'CCTSTO',pic:'@!'},{av:'A4042CCTObs',fld:'CCTOBS',pic:'@!'}]");
      setEventMetadata("AFTER TRN",",oparms:[{av:'A4406CCTFinFas',fld:'CCTFINFAS',pic:'@!'},{av:'A4407CCTIniFas',fld:'CCTINIFAS',pic:'@!'},{av:'A4040CCTSto',fld:'CCTSTO',pic:'@!'},{av:'A4042CCTObs',fld:'CCTOBS',pic:'@!'}]}");
      setEventMetadata("CCTLINPICT.ISVALID","{handler:'e14IA2',iparms:[{av:'A4046CCTLinPict',fld:'CCTLINPICT',pic:''},{av:'A4045CCTLinLgoD',fld:'CCTLINLGOD',pic:'ZZ9'},{av:'A4406CCTFinFas',fld:'CCTFINFAS',pic:'@!'},{av:'A4407CCTIniFas',fld:'CCTINIFAS',pic:'@!'},{av:'A4040CCTSto',fld:'CCTSTO',pic:'@!'},{av:'A4042CCTObs',fld:'CCTOBS',pic:'@!'}]");
      setEventMetadata("CCTLINPICT.ISVALID",",oparms:[{av:'A4045CCTLinLgoD',fld:'CCTLINLGOD',pic:'ZZ9'},{av:'A4046CCTLinPict',fld:'CCTLINPICT',pic:''},{av:'edtCCTLinLgoD_Invitemessage',ctrl:'CCTLINLGOD',prop:'Invitemessage'},{av:'A4406CCTFinFas',fld:'CCTFINFAS',pic:'@!'},{av:'A4407CCTIniFas',fld:'CCTINIFAS',pic:'@!'},{av:'A4040CCTSto',fld:'CCTSTO',pic:'@!'},{av:'A4042CCTObs',fld:'CCTOBS',pic:'@!'}]}");
      setEventMetadata("UPLOAD.UPLOADCOMPLETE","{handler:'e12IA2',iparms:[{av:'AV33UploadedFiles',fld:'vUPLOADEDFILES',pic:''},{av:'AV46Archivo_GXI',fld:'vARCHIVO_GXI',pic:''},{av:'A4406CCTFinFas',fld:'CCTFINFAS',pic:'@!'},{av:'A4407CCTIniFas',fld:'CCTINIFAS',pic:'@!'},{av:'A4040CCTSto',fld:'CCTSTO',pic:'@!'},{av:'A4042CCTObs',fld:'CCTOBS',pic:'@!'}]");
      setEventMetadata("UPLOAD.UPLOADCOMPLETE",",oparms:[{av:'AV14CCTArc',fld:'vCCTARC',pic:'@!'},{av:'A4406CCTFinFas',fld:'CCTFINFAS',pic:'@!'},{av:'A4407CCTIniFas',fld:'CCTINIFAS',pic:'@!'},{av:'A4040CCTSto',fld:'CCTSTO',pic:'@!'},{av:'A4042CCTObs',fld:'CCTOBS',pic:'@!'}]}");
      setEventMetadata("VALID_CCTCOD","{handler:'valid_Cctcod',iparms:[{av:'A4406CCTFinFas',fld:'CCTFINFAS',pic:'@!'},{av:'A4407CCTIniFas',fld:'CCTINIFAS',pic:'@!'},{av:'A4040CCTSto',fld:'CCTSTO',pic:'@!'},{av:'A4042CCTObs',fld:'CCTOBS',pic:'@!'}]");
      setEventMetadata("VALID_CCTCOD",",oparms:[{av:'A4406CCTFinFas',fld:'CCTFINFAS',pic:'@!'},{av:'A4407CCTIniFas',fld:'CCTINIFAS',pic:'@!'},{av:'A4040CCTSto',fld:'CCTSTO',pic:'@!'},{av:'A4042CCTObs',fld:'CCTOBS',pic:'@!'}]}");
      setEventMetadata("VALID_CCTDSC","{handler:'valid_Cctdsc',iparms:[{av:'A4406CCTFinFas',fld:'CCTFINFAS',pic:'@!'},{av:'A4407CCTIniFas',fld:'CCTINIFAS',pic:'@!'},{av:'A4040CCTSto',fld:'CCTSTO',pic:'@!'},{av:'A4042CCTObs',fld:'CCTOBS',pic:'@!'}]");
      setEventMetadata("VALID_CCTDSC",",oparms:[{av:'A4406CCTFinFas',fld:'CCTFINFAS',pic:'@!'},{av:'A4407CCTIniFas',fld:'CCTINIFAS',pic:'@!'},{av:'A4040CCTSto',fld:'CCTSTO',pic:'@!'},{av:'A4042CCTObs',fld:'CCTOBS',pic:'@!'}]}");
      setEventMetadata("VALID_CCTTPOCTR","{handler:'valid_Ccttpoctr',iparms:[{av:'cmbCCTTpoCtr'},{av:'A4037CCTTpoCtr',fld:'CCTTPOCTR',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynCCVCod'},{av:'A11522CCVCod',fld:'CCVCOD',pic:''},{av:'A4041CCTArc',fld:'CCTARC',pic:'@!'},{av:'A4406CCTFinFas',fld:'CCTFINFAS',pic:'@!'},{av:'A4407CCTIniFas',fld:'CCTINIFAS',pic:'@!'},{av:'A4040CCTSto',fld:'CCTSTO',pic:'@!'},{av:'A4042CCTObs',fld:'CCTOBS',pic:'@!'}]");
      setEventMetadata("VALID_CCTTPOCTR",",oparms:[{av:'chkCCTObs.getEnabled()',ctrl:'CCTOBS',prop:'Enabled'},{av:'A4041CCTArc',fld:'CCTARC',pic:'@!'},{av:'chkCCTObs.getVisible()',ctrl:'CCTOBS',prop:'Visible'},{av:'edtCCTLin_Visible',ctrl:'CCTLIN',prop:'Visible'},{av:'edtCCTLinDsc_Visible',ctrl:'CCTLINDSC',prop:'Visible'},{av:'edtCCTSta_Visible',ctrl:'CCTSTA',prop:'Visible'},{av:'cmbCCTLinTpoI'},{av:'cmbCCTLinTpoD'},{av:'edtCCTLinLgoD_Visible',ctrl:'CCTLINLGOD',prop:'Visible'},{av:'edtCCTLinPict_Visible',ctrl:'CCTLINPICT',prop:'Visible'},{av:'A4406CCTFinFas',fld:'CCTFINFAS',pic:'@!'},{av:'A4407CCTIniFas',fld:'CCTINIFAS',pic:'@!'},{av:'A4040CCTSto',fld:'CCTSTO',pic:'@!'},{av:'A4042CCTObs',fld:'CCTOBS',pic:'@!'}]}");
      setEventMetadata("VALIDV_CCTARC","{handler:'validv_Cctarc',iparms:[{av:'A4406CCTFinFas',fld:'CCTFINFAS',pic:'@!'},{av:'A4407CCTIniFas',fld:'CCTINIFAS',pic:'@!'},{av:'A4040CCTSto',fld:'CCTSTO',pic:'@!'},{av:'A4042CCTObs',fld:'CCTOBS',pic:'@!'}]");
      setEventMetadata("VALIDV_CCTARC",",oparms:[{av:'A4406CCTFinFas',fld:'CCTFINFAS',pic:'@!'},{av:'A4407CCTIniFas',fld:'CCTINIFAS',pic:'@!'},{av:'A4040CCTSto',fld:'CCTSTO',pic:'@!'},{av:'A4042CCTObs',fld:'CCTOBS',pic:'@!'}]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynCCVCod'},{av:'A11522CCVCod',fld:'CCVCOD',pic:''},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A4406CCTFinFas',fld:'CCTFINFAS',pic:'@!'},{av:'A4407CCTIniFas',fld:'CCTINIFAS',pic:'@!'},{av:'A4040CCTSto',fld:'CCTSTO',pic:'@!'},{av:'A4042CCTObs',fld:'CCTOBS',pic:'@!'}]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A4406CCTFinFas',fld:'CCTFINFAS',pic:'@!'},{av:'A4407CCTIniFas',fld:'CCTINIFAS',pic:'@!'},{av:'A4040CCTSto',fld:'CCTSTO',pic:'@!'},{av:'A4042CCTObs',fld:'CCTOBS',pic:'@!'}]}");
      setEventMetadata("VALID_CCTNOTULT","{handler:'valid_Cctnotult',iparms:[{av:'A4406CCTFinFas',fld:'CCTFINFAS',pic:'@!'},{av:'A4407CCTIniFas',fld:'CCTINIFAS',pic:'@!'},{av:'A4040CCTSto',fld:'CCTSTO',pic:'@!'},{av:'A4042CCTObs',fld:'CCTOBS',pic:'@!'}]");
      setEventMetadata("VALID_CCTNOTULT",",oparms:[{av:'A4406CCTFinFas',fld:'CCTFINFAS',pic:'@!'},{av:'A4407CCTIniFas',fld:'CCTINIFAS',pic:'@!'},{av:'A4040CCTSto',fld:'CCTSTO',pic:'@!'},{av:'A4042CCTObs',fld:'CCTOBS',pic:'@!'}]}");
      setEventMetadata("VALID_CCTLIN","{handler:'valid_Cctlin',iparms:[{av:'A4034CCTLin',fld:'CCTLIN',pic:'ZZZ9'},{av:'A4031CCTCod',fld:'CCTCOD',pic:'ZZZZZ9'},{av:'cmbCCTTpoCtr'},{av:'A4037CCTTpoCtr',fld:'CCTTPOCTR',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynCCVCod'},{av:'A11522CCVCod',fld:'CCVCOD',pic:''},{av:'A4406CCTFinFas',fld:'CCTFINFAS',pic:'@!'},{av:'A4407CCTIniFas',fld:'CCTINIFAS',pic:'@!'},{av:'A4040CCTSto',fld:'CCTSTO',pic:'@!'},{av:'A4042CCTObs',fld:'CCTOBS',pic:'@!'}]");
      setEventMetadata("VALID_CCTLIN",",oparms:[{av:'A4406CCTFinFas',fld:'CCTFINFAS',pic:'@!'},{av:'A4407CCTIniFas',fld:'CCTINIFAS',pic:'@!'},{av:'A4040CCTSto',fld:'CCTSTO',pic:'@!'},{av:'A4042CCTObs',fld:'CCTOBS',pic:'@!'}]}");
      setEventMetadata("VALID_CCTLINTPOI","{handler:'valid_Cctlintpoi',iparms:[{av:'A4406CCTFinFas',fld:'CCTFINFAS',pic:'@!'},{av:'A4407CCTIniFas',fld:'CCTINIFAS',pic:'@!'},{av:'A4040CCTSto',fld:'CCTSTO',pic:'@!'},{av:'A4042CCTObs',fld:'CCTOBS',pic:'@!'}]");
      setEventMetadata("VALID_CCTLINTPOI",",oparms:[{av:'A4406CCTFinFas',fld:'CCTFINFAS',pic:'@!'},{av:'A4407CCTIniFas',fld:'CCTINIFAS',pic:'@!'},{av:'A4040CCTSto',fld:'CCTSTO',pic:'@!'},{av:'A4042CCTObs',fld:'CCTOBS',pic:'@!'}]}");
      setEventMetadata("VALID_CCVCOD","{handler:'valid_Ccvcod',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'cmbCCTLinTpoI'},{av:'A4048CCTLinTpoI',fld:'CCTLINTPOI',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynCCVCod'},{av:'A11522CCVCod',fld:'CCVCOD',pic:''},{av:'A11526CCVPict',fld:'CCVPICT',pic:''},{av:'A11527CCVLgoDat',fld:'CCVLGODAT',pic:'ZZ9'},{av:'A11528CCVTpoDat',fld:'CCVTPODAT',pic:''},{av:'A11529CCVDsc',fld:'CCVDSC',pic:''},{av:'A4045CCTLinLgoD',fld:'CCTLINLGOD',pic:'ZZ9'},{av:'A4046CCTLinPict',fld:'CCTLINPICT',pic:''},{av:'cmbCCTLinTpoD'},{av:'A4044CCTLinTpoD',fld:'CCTLINTPOD',pic:''},{av:'A4043CCTLinDsc',fld:'CCTLINDSC',pic:''},{av:'A4406CCTFinFas',fld:'CCTFINFAS',pic:'@!'},{av:'A4407CCTIniFas',fld:'CCTINIFAS',pic:'@!'},{av:'A4040CCTSto',fld:'CCTSTO',pic:'@!'},{av:'A4042CCTObs',fld:'CCTOBS',pic:'@!'}]");
      setEventMetadata("VALID_CCVCOD",",oparms:[{av:'A11526CCVPict',fld:'CCVPICT',pic:''},{av:'A11527CCVLgoDat',fld:'CCVLGODAT',pic:'ZZ9'},{av:'A11528CCVTpoDat',fld:'CCVTPODAT',pic:''},{av:'A11529CCVDsc',fld:'CCVDSC',pic:''},{av:'A4045CCTLinLgoD',fld:'CCTLINLGOD',pic:'ZZ9'},{av:'A4046CCTLinPict',fld:'CCTLINPICT',pic:''},{av:'cmbCCTLinTpoD'},{av:'A4044CCTLinTpoD',fld:'CCTLINTPOD',pic:''},{av:'edtCCTLinDsc_Enabled',ctrl:'CCTLINDSC',prop:'Enabled'},{av:'edtCCTLinLgoD_Enabled',ctrl:'CCTLINLGOD',prop:'Enabled'},{av:'edtCCTLinPict_Enabled',ctrl:'CCTLINPICT',prop:'Enabled'},{av:'A4043CCTLinDsc',fld:'CCTLINDSC',pic:''},{av:'A4406CCTFinFas',fld:'CCTFINFAS',pic:'@!'},{av:'A4407CCTIniFas',fld:'CCTINIFAS',pic:'@!'},{av:'A4040CCTSto',fld:'CCTSTO',pic:'@!'},{av:'A4042CCTObs',fld:'CCTOBS',pic:'@!'}]}");
      setEventMetadata("VALID_CCTLINDSC","{handler:'valid_Cctlindsc',iparms:[{av:'A4406CCTFinFas',fld:'CCTFINFAS',pic:'@!'},{av:'A4407CCTIniFas',fld:'CCTINIFAS',pic:'@!'},{av:'A4040CCTSto',fld:'CCTSTO',pic:'@!'},{av:'A4042CCTObs',fld:'CCTOBS',pic:'@!'}]");
      setEventMetadata("VALID_CCTLINDSC",",oparms:[{av:'A4406CCTFinFas',fld:'CCTFINFAS',pic:'@!'},{av:'A4407CCTIniFas',fld:'CCTINIFAS',pic:'@!'},{av:'A4040CCTSto',fld:'CCTSTO',pic:'@!'},{av:'A4042CCTObs',fld:'CCTOBS',pic:'@!'}]}");
      setEventMetadata("VALID_CCTVALLIN","{handler:'valid_Cctvallin',iparms:[{av:'A4406CCTFinFas',fld:'CCTFINFAS',pic:'@!'},{av:'A4407CCTIniFas',fld:'CCTINIFAS',pic:'@!'},{av:'A4040CCTSto',fld:'CCTSTO',pic:'@!'},{av:'A4042CCTObs',fld:'CCTOBS',pic:'@!'}]");
      setEventMetadata("VALID_CCTVALLIN",",oparms:[{av:'A4406CCTFinFas',fld:'CCTFINFAS',pic:'@!'},{av:'A4407CCTIniFas',fld:'CCTINIFAS',pic:'@!'},{av:'A4040CCTSto',fld:'CCTSTO',pic:'@!'},{av:'A4042CCTObs',fld:'CCTOBS',pic:'@!'}]}");
      setEventMetadata("VALID_CCTVALDSC","{handler:'valid_Cctvaldsc',iparms:[{av:'A4406CCTFinFas',fld:'CCTFINFAS',pic:'@!'},{av:'A4407CCTIniFas',fld:'CCTINIFAS',pic:'@!'},{av:'A4040CCTSto',fld:'CCTSTO',pic:'@!'},{av:'A4042CCTObs',fld:'CCTOBS',pic:'@!'}]");
      setEventMetadata("VALID_CCTVALDSC",",oparms:[{av:'A4406CCTFinFas',fld:'CCTFINFAS',pic:'@!'},{av:'A4407CCTIniFas',fld:'CCTINIFAS',pic:'@!'},{av:'A4040CCTSto',fld:'CCTSTO',pic:'@!'},{av:'A4042CCTObs',fld:'CCTOBS',pic:'@!'}]}");
      setEventMetadata("NULL","{handler:'valid_Cctval',iparms:[{av:'A4406CCTFinFas',fld:'CCTFINFAS',pic:'@!'},{av:'A4407CCTIniFas',fld:'CCTINIFAS',pic:'@!'},{av:'A4040CCTSto',fld:'CCTSTO',pic:'@!'},{av:'A4042CCTObs',fld:'CCTOBS',pic:'@!'}]");
      setEventMetadata("NULL",",oparms:[{av:'A4406CCTFinFas',fld:'CCTFINFAS',pic:'@!'},{av:'A4407CCTIniFas',fld:'CCTINIFAS',pic:'@!'},{av:'A4040CCTSto',fld:'CCTSTO',pic:'@!'},{av:'A4042CCTObs',fld:'CCTOBS',pic:'@!'}]}");
      setEventMetadata("NULL","{handler:'valid_Ccvdsc',iparms:[{av:'A4406CCTFinFas',fld:'CCTFINFAS',pic:'@!'},{av:'A4407CCTIniFas',fld:'CCTINIFAS',pic:'@!'},{av:'A4040CCTSto',fld:'CCTSTO',pic:'@!'},{av:'A4042CCTObs',fld:'CCTOBS',pic:'@!'}]");
      setEventMetadata("NULL",",oparms:[{av:'A4406CCTFinFas',fld:'CCTFINFAS',pic:'@!'},{av:'A4407CCTIniFas',fld:'CCTINIFAS',pic:'@!'},{av:'A4040CCTSto',fld:'CCTSTO',pic:'@!'},{av:'A4042CCTObs',fld:'CCTOBS',pic:'@!'}]}");
      setEventMetadata("VALID_CCTNOTID","{handler:'valid_Cctnotid',iparms:[{av:'A4406CCTFinFas',fld:'CCTFINFAS',pic:'@!'},{av:'A4407CCTIniFas',fld:'CCTINIFAS',pic:'@!'},{av:'A4040CCTSto',fld:'CCTSTO',pic:'@!'},{av:'A4042CCTObs',fld:'CCTOBS',pic:'@!'}]");
      setEventMetadata("VALID_CCTNOTID",",oparms:[{av:'A4406CCTFinFas',fld:'CCTFINFAS',pic:'@!'},{av:'A4407CCTIniFas',fld:'CCTINIFAS',pic:'@!'},{av:'A4040CCTSto',fld:'CCTSTO',pic:'@!'},{av:'A4042CCTObs',fld:'CCTOBS',pic:'@!'}]}");
      setEventMetadata("VALID_CCTNOTEVT","{handler:'valid_Cctnotevt',iparms:[{av:'A4406CCTFinFas',fld:'CCTFINFAS',pic:'@!'},{av:'A4407CCTIniFas',fld:'CCTINIFAS',pic:'@!'},{av:'A4040CCTSto',fld:'CCTSTO',pic:'@!'},{av:'A4042CCTObs',fld:'CCTOBS',pic:'@!'}]");
      setEventMetadata("VALID_CCTNOTEVT",",oparms:[{av:'A4406CCTFinFas',fld:'CCTFINFAS',pic:'@!'},{av:'A4407CCTIniFas',fld:'CCTINIFAS',pic:'@!'},{av:'A4040CCTSto',fld:'CCTSTO',pic:'@!'},{av:'A4042CCTObs',fld:'CCTOBS',pic:'@!'}]}");
      setEventMetadata("VALID_CCTNOTDST","{handler:'valid_Cctnotdst',iparms:[{av:'A4406CCTFinFas',fld:'CCTFINFAS',pic:'@!'},{av:'A4407CCTIniFas',fld:'CCTINIFAS',pic:'@!'},{av:'A4040CCTSto',fld:'CCTSTO',pic:'@!'},{av:'A4042CCTObs',fld:'CCTOBS',pic:'@!'}]");
      setEventMetadata("VALID_CCTNOTDST",",oparms:[{av:'A4406CCTFinFas',fld:'CCTFINFAS',pic:'@!'},{av:'A4407CCTIniFas',fld:'CCTINIFAS',pic:'@!'},{av:'A4040CCTSto',fld:'CCTSTO',pic:'@!'},{av:'A4042CCTObs',fld:'CCTOBS',pic:'@!'}]}");
      setEventMetadata("VALID_CCTNOTUSR","{handler:'valid_Cctnotusr',iparms:[{av:'A4406CCTFinFas',fld:'CCTFINFAS',pic:'@!'},{av:'A4407CCTIniFas',fld:'CCTINIFAS',pic:'@!'},{av:'A4040CCTSto',fld:'CCTSTO',pic:'@!'},{av:'A4042CCTObs',fld:'CCTOBS',pic:'@!'}]");
      setEventMetadata("VALID_CCTNOTUSR",",oparms:[{av:'A4406CCTFinFas',fld:'CCTFINFAS',pic:'@!'},{av:'A4407CCTIniFas',fld:'CCTINIFAS',pic:'@!'},{av:'A4040CCTSto',fld:'CCTSTO',pic:'@!'},{av:'A4042CCTObs',fld:'CCTOBS',pic:'@!'}]}");
      setEventMetadata("NULL","{handler:'valid_Cctnotstp',iparms:[{av:'A4406CCTFinFas',fld:'CCTFINFAS',pic:'@!'},{av:'A4407CCTIniFas',fld:'CCTINIFAS',pic:'@!'},{av:'A4040CCTSto',fld:'CCTSTO',pic:'@!'},{av:'A4042CCTObs',fld:'CCTOBS',pic:'@!'}]");
      setEventMetadata("NULL",",oparms:[{av:'A4406CCTFinFas',fld:'CCTFINFAS',pic:'@!'},{av:'A4407CCTIniFas',fld:'CCTINIFAS',pic:'@!'},{av:'A4040CCTSto',fld:'CCTSTO',pic:'@!'},{av:'A4042CCTObs',fld:'CCTOBS',pic:'@!'}]}");
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
      pr_default.close(33);
      pr_default.close(18);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      wcpOAV28EmprCod = "" ;
      Z396EmprCod = "" ;
      Z4041CCTArc = "" ;
      Z4036CCTDsc = "" ;
      Z4037CCTTpoCtr = "" ;
      Z4406CCTFinFas = "" ;
      Z4407CCTIniFas = "" ;
      Z4039CCTObl = "" ;
      Z4040CCTSto = "" ;
      Z4042CCTObs = "" ;
      N4042CCTObs = "" ;
      Z4046CCTLinPict = "" ;
      Z4048CCTLinTpoI = "" ;
      Z4044CCTLinTpoD = "" ;
      Z4043CCTLinDsc = "" ;
      Z4047CCTLinVarW = "" ;
      Z4408CCTSta = "" ;
      Z13249CCVNorma = "" ;
      Z13250CCVEspecif = "" ;
      Z11476CCTLinDscL = "" ;
      Z11522CCVCod = "" ;
      N11522CCVCod = "" ;
      N4044CCTLinTpoD = "" ;
      N4043CCTLinDsc = "" ;
      N4046CCTLinPict = "" ;
      N4408CCTSta = "" ;
      Z4050CCTValDsc = "" ;
      Z4051CCTVal = "" ;
      N4050CCTValDsc = "" ;
      N4051CCTVal = "" ;
      Z11477CCTNotEvt = "" ;
      Z11478CCTNotDst = "" ;
      Z11479CCTNotUsr = "" ;
      Z11480CCTNotEml = "" ;
      Z11523CCTNotAsu = "" ;
      Z11524CCTNotTxt = "" ;
      N11479CCTNotUsr = "" ;
      N11480CCTNotEml = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A4037CCTTpoCtr = "" ;
      A11522CCVCod = "" ;
      Gx_mode = "" ;
      AV28EmprCod = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      A4048CCTLinTpoI = "" ;
      A4406CCTFinFas = "" ;
      A4407CCTIniFas = "" ;
      A4040CCTSto = "" ;
      A4042CCTObs = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      A4036CCTDsc = "" ;
      AV14CCTArc = "" ;
      ucUpload = new com.genexus.webpanels.GXUserControl();
      AV33UploadedFiles = new GXBaseCollection<app.SdtFileUploadData>(app.SdtFileUploadData.class, "FileUploadData", "TexplusNET", remoteHandle);
      AV34FailedFiles = new GXBaseCollection<app.SdtFileUploadData>(app.SdtFileUploadData.class, "FileUploadData", "TexplusNET", remoteHandle);
      ucGxuitabspanel_tabs1 = new com.genexus.webpanels.GXUserControl();
      lblTab1_title_Jsonclick = "" ;
      lblTab2_title_Jsonclick = "" ;
      lblCctarc_txt_Jsonclick = "" ;
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      AV44Pgmname = "" ;
      A407EmprNom = "" ;
      A4039CCTObl = "" ;
      A4041CCTArc = "" ;
      Freestylelevel_level1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode622 = "" ;
      sStyleString = "" ;
      Gridlevel_notificacionesContainer = new com.genexus.webpanels.GXWebGrid(context);
      sMode1529 = "" ;
      AV38AuxEmprCod = "" ;
      Upload_Objectcall = "" ;
      Upload_Class = "" ;
      Upload_Acceptedfiletypes = "" ;
      Upload_Customfiletypes = "" ;
      Gxuitabspanel_tabs1_Objectcall = "" ;
      Gxuitabspanel_tabs1_Activepagecontrolname = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode621 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      GXCCtl = "" ;
      A4044CCTLinTpoD = "" ;
      A4043CCTLinDsc = "" ;
      A4047CCTLinVarW = "" ;
      A4046CCTLinPict = "" ;
      A4408CCTSta = "" ;
      A13249CCVNorma = "" ;
      A13250CCVEspecif = "" ;
      A11476CCTLinDscL = "" ;
      A11526CCVPict = "" ;
      A11528CCVTpoDat = "" ;
      A11529CCVDsc = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      A11477CCTNotEvt = "" ;
      A11478CCTNotDst = "" ;
      A11479CCTNotUsr = "" ;
      A11480CCTNotEml = "" ;
      A11523CCTNotAsu = "" ;
      A11524CCTNotTxt = "" ;
      A4050CCTValDsc = "" ;
      A4051CCTVal = "" ;
      AV12Station = "" ;
      AV11EmprNom = "" ;
      AV8UsurCod = "" ;
      AV30WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext5 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV31TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV32WebSession = httpContext.getWebSession();
      GXv_char2 = new String[1] ;
      AV7Lit0 = "" ;
      AV10Lit1 = "" ;
      AV9LitFe = "" ;
      AV15CCLPicInf = "" ;
      AV16CCLPicSup = "" ;
      AV18CCLArrInf = "" ;
      AV17CCLArrSup = "" ;
      GXv_int7 = new byte[1] ;
      AV13Mask = "" ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      GXv_int8 = new long[1] ;
      GXv_char3 = new String[1] ;
      AV40FileUploadfile = new app.SdtFileUploadData(remoteHandle, context);
      AV42Archivo = "" ;
      AV46Archivo_GXI = "" ;
      Z407EmprNom = "" ;
      T00IA11_A407EmprNom = new String[] {""} ;
      T00IA11_n407EmprNom = new boolean[] {false} ;
      T00IA12_A4031CCTCod = new int[1] ;
      T00IA12_A4041CCTArc = new String[] {""} ;
      T00IA12_A407EmprNom = new String[] {""} ;
      T00IA12_n407EmprNom = new boolean[] {false} ;
      T00IA12_A4036CCTDsc = new String[] {""} ;
      T00IA12_A4037CCTTpoCtr = new String[] {""} ;
      T00IA12_A4406CCTFinFas = new String[] {""} ;
      T00IA12_A4407CCTIniFas = new String[] {""} ;
      T00IA12_A4039CCTObl = new String[] {""} ;
      T00IA12_A4040CCTSto = new String[] {""} ;
      T00IA12_A4042CCTObs = new String[] {""} ;
      T00IA12_A11475CCTNotUlt = new short[1] ;
      T00IA12_A396EmprCod = new String[] {""} ;
      T00IA13_A407EmprNom = new String[] {""} ;
      T00IA13_n407EmprNom = new boolean[] {false} ;
      T00IA14_A396EmprCod = new String[] {""} ;
      T00IA14_A4031CCTCod = new int[1] ;
      T00IA10_A4031CCTCod = new int[1] ;
      T00IA10_A4041CCTArc = new String[] {""} ;
      T00IA10_A4036CCTDsc = new String[] {""} ;
      T00IA10_A4037CCTTpoCtr = new String[] {""} ;
      T00IA10_A4406CCTFinFas = new String[] {""} ;
      T00IA10_A4407CCTIniFas = new String[] {""} ;
      T00IA10_A4039CCTObl = new String[] {""} ;
      T00IA10_A4040CCTSto = new String[] {""} ;
      T00IA10_A4042CCTObs = new String[] {""} ;
      T00IA10_A11475CCTNotUlt = new short[1] ;
      T00IA10_A396EmprCod = new String[] {""} ;
      T00IA15_A396EmprCod = new String[] {""} ;
      T00IA15_A4031CCTCod = new int[1] ;
      T00IA16_A396EmprCod = new String[] {""} ;
      T00IA16_A4031CCTCod = new int[1] ;
      T00IA9_A4031CCTCod = new int[1] ;
      T00IA9_A4041CCTArc = new String[] {""} ;
      T00IA9_A4036CCTDsc = new String[] {""} ;
      T00IA9_A4037CCTTpoCtr = new String[] {""} ;
      T00IA9_A4406CCTFinFas = new String[] {""} ;
      T00IA9_A4407CCTIniFas = new String[] {""} ;
      T00IA9_A4039CCTObl = new String[] {""} ;
      T00IA9_A4040CCTSto = new String[] {""} ;
      T00IA9_A4042CCTObs = new String[] {""} ;
      T00IA9_A11475CCTNotUlt = new short[1] ;
      T00IA9_A396EmprCod = new String[] {""} ;
      T00IA20_A407EmprNom = new String[] {""} ;
      T00IA20_n407EmprNom = new boolean[] {false} ;
      T00IA21_A396EmprCod = new String[] {""} ;
      T00IA21_A583IntCod = new byte[1] ;
      T00IA21_A4031CCTCod = new int[1] ;
      T00IA22_A396EmprCod = new String[] {""} ;
      T00IA22_A252CliCod = new int[1] ;
      T00IA22_A9713Tb1_Cod = new short[1] ;
      T00IA22_A11736CCArtCod = new String[] {""} ;
      T00IA22_A11748TipArtiId = new short[1] ;
      T00IA22_A11737CCColNom = new String[] {""} ;
      T00IA22_A11738CCColNum = new int[1] ;
      T00IA22_A11749CCCTc = new byte[1] ;
      T00IA22_A11750IntId = new short[1] ;
      T00IA22_A4031CCTCod = new int[1] ;
      T00IA23_A396EmprCod = new String[] {""} ;
      T00IA23_A252CliCod = new int[1] ;
      T00IA23_A65ArtCod = new String[] {""} ;
      T00IA23_A4058CCFColNom = new String[] {""} ;
      T00IA23_A4059CCFColNum = new int[1] ;
      T00IA23_A4031CCTCod = new int[1] ;
      T00IA24_A396EmprCod = new String[] {""} ;
      T00IA24_A457FasCod = new String[] {""} ;
      T00IA24_A4031CCTCod = new int[1] ;
      T00IA25_A396EmprCod = new String[] {""} ;
      T00IA25_A4031CCTCod = new int[1] ;
      T00IA25_A4034CCTLin = new short[1] ;
      T00IA26_A396EmprCod = new String[] {""} ;
      T00IA26_A129BarCod = new int[1] ;
      T00IA26_A132BarCodReo = new byte[1] ;
      T00IA26_A130BarCodPar = new String[] {""} ;
      T00IA26_A758ProCod = new String[] {""} ;
      T00IA26_A194BarOrdLin = new short[1] ;
      T00IA26_A4031CCTCod = new int[1] ;
      T00IA28_A396EmprCod = new String[] {""} ;
      T00IA28_A4031CCTCod = new int[1] ;
      Z11526CCVPict = "" ;
      Z11528CCVTpoDat = "" ;
      Z11529CCVDsc = "" ;
      T00IA8_A11526CCVPict = new String[] {""} ;
      T00IA8_n11526CCVPict = new boolean[] {false} ;
      T00IA8_A11527CCVLgoDat = new short[1] ;
      T00IA8_n11527CCVLgoDat = new boolean[] {false} ;
      T00IA8_A11528CCVTpoDat = new String[] {""} ;
      T00IA8_n11528CCVTpoDat = new boolean[] {false} ;
      T00IA8_A11529CCVDsc = new String[] {""} ;
      T00IA8_n11529CCVDsc = new boolean[] {false} ;
      T00IA29_A4031CCTCod = new int[1] ;
      T00IA29_A4034CCTLin = new short[1] ;
      T00IA29_A4045CCTLinLgoD = new short[1] ;
      T00IA29_A4046CCTLinPict = new String[] {""} ;
      T00IA29_A4048CCTLinTpoI = new String[] {""} ;
      T00IA29_A4044CCTLinTpoD = new String[] {""} ;
      T00IA29_A4043CCTLinDsc = new String[] {""} ;
      T00IA29_A4047CCTLinVarW = new String[] {""} ;
      T00IA29_A4408CCTSta = new String[] {""} ;
      T00IA29_A11526CCVPict = new String[] {""} ;
      T00IA29_n11526CCVPict = new boolean[] {false} ;
      T00IA29_A11527CCVLgoDat = new short[1] ;
      T00IA29_n11527CCVLgoDat = new boolean[] {false} ;
      T00IA29_A11528CCVTpoDat = new String[] {""} ;
      T00IA29_n11528CCVTpoDat = new boolean[] {false} ;
      T00IA29_A11529CCVDsc = new String[] {""} ;
      T00IA29_n11529CCVDsc = new boolean[] {false} ;
      T00IA29_A13249CCVNorma = new String[] {""} ;
      T00IA29_A13250CCVEspecif = new String[] {""} ;
      T00IA29_A11476CCTLinDscL = new String[] {""} ;
      T00IA29_A396EmprCod = new String[] {""} ;
      T00IA29_A11522CCVCod = new String[] {""} ;
      T00IA30_A11526CCVPict = new String[] {""} ;
      T00IA30_n11526CCVPict = new boolean[] {false} ;
      T00IA30_A11527CCVLgoDat = new short[1] ;
      T00IA30_n11527CCVLgoDat = new boolean[] {false} ;
      T00IA30_A11528CCVTpoDat = new String[] {""} ;
      T00IA30_n11528CCVTpoDat = new boolean[] {false} ;
      T00IA30_A11529CCVDsc = new String[] {""} ;
      T00IA30_n11529CCVDsc = new boolean[] {false} ;
      T00IA31_A396EmprCod = new String[] {""} ;
      T00IA31_A4031CCTCod = new int[1] ;
      T00IA31_A4034CCTLin = new short[1] ;
      T00IA7_A4031CCTCod = new int[1] ;
      T00IA7_A4034CCTLin = new short[1] ;
      T00IA7_A4045CCTLinLgoD = new short[1] ;
      T00IA7_A4046CCTLinPict = new String[] {""} ;
      T00IA7_A4048CCTLinTpoI = new String[] {""} ;
      T00IA7_A4044CCTLinTpoD = new String[] {""} ;
      T00IA7_A4043CCTLinDsc = new String[] {""} ;
      T00IA7_A4047CCTLinVarW = new String[] {""} ;
      T00IA7_A4408CCTSta = new String[] {""} ;
      T00IA7_A13249CCVNorma = new String[] {""} ;
      T00IA7_A13250CCVEspecif = new String[] {""} ;
      T00IA7_A11476CCTLinDscL = new String[] {""} ;
      T00IA7_A396EmprCod = new String[] {""} ;
      T00IA7_A11522CCVCod = new String[] {""} ;
      T00IA6_A4031CCTCod = new int[1] ;
      T00IA6_A4034CCTLin = new short[1] ;
      T00IA6_A4045CCTLinLgoD = new short[1] ;
      T00IA6_A4046CCTLinPict = new String[] {""} ;
      T00IA6_A4048CCTLinTpoI = new String[] {""} ;
      T00IA6_A4044CCTLinTpoD = new String[] {""} ;
      T00IA6_A4043CCTLinDsc = new String[] {""} ;
      T00IA6_A4047CCTLinVarW = new String[] {""} ;
      T00IA6_A4408CCTSta = new String[] {""} ;
      T00IA6_A13249CCVNorma = new String[] {""} ;
      T00IA6_A13250CCVEspecif = new String[] {""} ;
      T00IA6_A11476CCTLinDscL = new String[] {""} ;
      T00IA6_A396EmprCod = new String[] {""} ;
      T00IA6_A11522CCVCod = new String[] {""} ;
      T00IA35_A11526CCVPict = new String[] {""} ;
      T00IA35_n11526CCVPict = new boolean[] {false} ;
      T00IA35_A11527CCVLgoDat = new short[1] ;
      T00IA35_n11527CCVLgoDat = new boolean[] {false} ;
      T00IA35_A11528CCVTpoDat = new String[] {""} ;
      T00IA35_n11528CCVTpoDat = new boolean[] {false} ;
      T00IA35_A11529CCVDsc = new String[] {""} ;
      T00IA35_n11529CCVDsc = new boolean[] {false} ;
      T00IA36_A396EmprCod = new String[] {""} ;
      T00IA36_A252CliCod = new int[1] ;
      T00IA36_A9713Tb1_Cod = new short[1] ;
      T00IA36_A11736CCArtCod = new String[] {""} ;
      T00IA36_A11748TipArtiId = new short[1] ;
      T00IA36_A11737CCColNom = new String[] {""} ;
      T00IA36_A11738CCColNum = new int[1] ;
      T00IA36_A11749CCCTc = new byte[1] ;
      T00IA36_A11750IntId = new short[1] ;
      T00IA36_A4031CCTCod = new int[1] ;
      T00IA36_A4034CCTLin = new short[1] ;
      T00IA37_A396EmprCod = new String[] {""} ;
      T00IA37_A252CliCod = new int[1] ;
      T00IA37_A65ArtCod = new String[] {""} ;
      T00IA37_A4058CCFColNom = new String[] {""} ;
      T00IA37_A4059CCFColNum = new int[1] ;
      T00IA37_A4031CCTCod = new int[1] ;
      T00IA37_A4034CCTLin = new short[1] ;
      T00IA38_A396EmprCod = new String[] {""} ;
      T00IA38_A129BarCod = new int[1] ;
      T00IA38_A132BarCodReo = new byte[1] ;
      T00IA38_A130BarCodPar = new String[] {""} ;
      T00IA38_A758ProCod = new String[] {""} ;
      T00IA38_A194BarOrdLin = new short[1] ;
      T00IA38_A4031CCTCod = new int[1] ;
      T00IA38_A4034CCTLin = new short[1] ;
      T00IA39_A396EmprCod = new String[] {""} ;
      T00IA39_A4031CCTCod = new int[1] ;
      T00IA39_A4034CCTLin = new short[1] ;
      T00IA40_A396EmprCod = new String[] {""} ;
      T00IA40_A4031CCTCod = new int[1] ;
      T00IA40_A4034CCTLin = new short[1] ;
      T00IA40_A4049CCTValLin = new byte[1] ;
      T00IA40_A4050CCTValDsc = new String[] {""} ;
      T00IA40_A4051CCTVal = new String[] {""} ;
      T00IA41_A396EmprCod = new String[] {""} ;
      T00IA41_A4031CCTCod = new int[1] ;
      T00IA41_A4034CCTLin = new short[1] ;
      T00IA41_A4049CCTValLin = new byte[1] ;
      T00IA5_A396EmprCod = new String[] {""} ;
      T00IA5_A4031CCTCod = new int[1] ;
      T00IA5_A4034CCTLin = new short[1] ;
      T00IA5_A4049CCTValLin = new byte[1] ;
      T00IA5_A4050CCTValDsc = new String[] {""} ;
      T00IA5_A4051CCTVal = new String[] {""} ;
      sMode623 = "" ;
      T00IA4_A396EmprCod = new String[] {""} ;
      T00IA4_A4031CCTCod = new int[1] ;
      T00IA4_A4034CCTLin = new short[1] ;
      T00IA4_A4049CCTValLin = new byte[1] ;
      T00IA4_A4050CCTValDsc = new String[] {""} ;
      T00IA4_A4051CCTVal = new String[] {""} ;
      T00IA45_A396EmprCod = new String[] {""} ;
      T00IA45_A4031CCTCod = new int[1] ;
      T00IA45_A4034CCTLin = new short[1] ;
      T00IA45_A4049CCTValLin = new byte[1] ;
      T00IA46_A396EmprCod = new String[] {""} ;
      T00IA46_A4031CCTCod = new int[1] ;
      T00IA46_A11481CCTNotId = new short[1] ;
      T00IA46_A12733CCTNotStp = new byte[1] ;
      T00IA46_A11477CCTNotEvt = new String[] {""} ;
      T00IA46_A11478CCTNotDst = new String[] {""} ;
      T00IA46_A11479CCTNotUsr = new String[] {""} ;
      T00IA46_A11480CCTNotEml = new String[] {""} ;
      T00IA46_A11523CCTNotAsu = new String[] {""} ;
      T00IA46_A11524CCTNotTxt = new String[] {""} ;
      T00IA46_A11525CCTNotAdj = new byte[1] ;
      T00IA47_A396EmprCod = new String[] {""} ;
      T00IA47_A4031CCTCod = new int[1] ;
      T00IA47_A11481CCTNotId = new short[1] ;
      T00IA3_A396EmprCod = new String[] {""} ;
      T00IA3_A4031CCTCod = new int[1] ;
      T00IA3_A11481CCTNotId = new short[1] ;
      T00IA3_A12733CCTNotStp = new byte[1] ;
      T00IA3_A11477CCTNotEvt = new String[] {""} ;
      T00IA3_A11478CCTNotDst = new String[] {""} ;
      T00IA3_A11479CCTNotUsr = new String[] {""} ;
      T00IA3_A11480CCTNotEml = new String[] {""} ;
      T00IA3_A11523CCTNotAsu = new String[] {""} ;
      T00IA3_A11524CCTNotTxt = new String[] {""} ;
      T00IA3_A11525CCTNotAdj = new byte[1] ;
      T00IA2_A396EmprCod = new String[] {""} ;
      T00IA2_A4031CCTCod = new int[1] ;
      T00IA2_A11481CCTNotId = new short[1] ;
      T00IA2_A12733CCTNotStp = new byte[1] ;
      T00IA2_A11477CCTNotEvt = new String[] {""} ;
      T00IA2_A11478CCTNotDst = new String[] {""} ;
      T00IA2_A11479CCTNotUsr = new String[] {""} ;
      T00IA2_A11480CCTNotEml = new String[] {""} ;
      T00IA2_A11523CCTNotAsu = new String[] {""} ;
      T00IA2_A11524CCTNotTxt = new String[] {""} ;
      T00IA2_A11525CCTNotAdj = new byte[1] ;
      T00IA51_A396EmprCod = new String[] {""} ;
      T00IA51_A4031CCTCod = new int[1] ;
      T00IA51_A11481CCTNotId = new short[1] ;
      Freestylelevel_level1Row = new com.genexus.webpanels.GXWebRow();
      subFreestylelevel_level1_Linesclass = "" ;
      ROClassString = "" ;
      Gridlevel_level2Container = new com.genexus.webpanels.GXWebGrid(context);
      Gridlevel_level2Row = new com.genexus.webpanels.GXWebRow();
      subGridlevel_level2_Linesclass = "" ;
      Gridlevel_notificacionesRow = new com.genexus.webpanels.GXWebRow();
      subGridlevel_notificaciones_Linesclass = "" ;
      T00IA52_A850UsurCod = new String[] {""} ;
      T00IA52_A854UsurNom = new String[] {""} ;
      T00IA52_n854UsurNom = new boolean[] {false} ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      i4048CCTLinTpoI = "" ;
      subFreestylelevel_level1_Header = "" ;
      Freestylelevel_level1Column = new com.genexus.webpanels.GXWebColumn();
      Gridlevel_notificacionesColumn = new com.genexus.webpanels.GXWebColumn();
      Gridlevel_level2Column = new com.genexus.webpanels.GXWebColumn();
      gxdynajaxctrlcodr = new com.genexus.internet.StringCollection();
      gxdynajaxctrldescr = new com.genexus.internet.StringCollection();
      gxwrpcisep = "" ;
      T00IA53_A396EmprCod = new String[] {""} ;
      T00IA53_A11522CCVCod = new String[] {""} ;
      T00IA53_A11529CCVDsc = new String[] {""} ;
      T00IA53_n11529CCVDsc = new boolean[] {false} ;
      T00IA54_A850UsurCod = new String[] {""} ;
      T00IA54_A854UsurNom = new String[] {""} ;
      T00IA54_n854UsurNom = new boolean[] {false} ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.tccdef__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.tccdef__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.tccdef__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.tccdef__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.tccdef__default(),
         new Object[] {
             new Object[] {
            T00IA2_A396EmprCod, T00IA2_A4031CCTCod, T00IA2_A11481CCTNotId, T00IA2_A12733CCTNotStp, T00IA2_A11477CCTNotEvt, T00IA2_A11478CCTNotDst, T00IA2_A11479CCTNotUsr, T00IA2_A11480CCTNotEml, T00IA2_A11523CCTNotAsu, T00IA2_A11524CCTNotTxt,
            T00IA2_A11525CCTNotAdj
            }
            , new Object[] {
            T00IA3_A396EmprCod, T00IA3_A4031CCTCod, T00IA3_A11481CCTNotId, T00IA3_A12733CCTNotStp, T00IA3_A11477CCTNotEvt, T00IA3_A11478CCTNotDst, T00IA3_A11479CCTNotUsr, T00IA3_A11480CCTNotEml, T00IA3_A11523CCTNotAsu, T00IA3_A11524CCTNotTxt,
            T00IA3_A11525CCTNotAdj
            }
            , new Object[] {
            T00IA4_A396EmprCod, T00IA4_A4031CCTCod, T00IA4_A4034CCTLin, T00IA4_A4049CCTValLin, T00IA4_A4050CCTValDsc, T00IA4_A4051CCTVal
            }
            , new Object[] {
            T00IA5_A396EmprCod, T00IA5_A4031CCTCod, T00IA5_A4034CCTLin, T00IA5_A4049CCTValLin, T00IA5_A4050CCTValDsc, T00IA5_A4051CCTVal
            }
            , new Object[] {
            T00IA6_A4031CCTCod, T00IA6_A4034CCTLin, T00IA6_A4045CCTLinLgoD, T00IA6_A4046CCTLinPict, T00IA6_A4048CCTLinTpoI, T00IA6_A4044CCTLinTpoD, T00IA6_A4043CCTLinDsc, T00IA6_A4047CCTLinVarW, T00IA6_A4408CCTSta, T00IA6_A13249CCVNorma,
            T00IA6_A13250CCVEspecif, T00IA6_A11476CCTLinDscL, T00IA6_A396EmprCod, T00IA6_A11522CCVCod
            }
            , new Object[] {
            T00IA7_A4031CCTCod, T00IA7_A4034CCTLin, T00IA7_A4045CCTLinLgoD, T00IA7_A4046CCTLinPict, T00IA7_A4048CCTLinTpoI, T00IA7_A4044CCTLinTpoD, T00IA7_A4043CCTLinDsc, T00IA7_A4047CCTLinVarW, T00IA7_A4408CCTSta, T00IA7_A13249CCVNorma,
            T00IA7_A13250CCVEspecif, T00IA7_A11476CCTLinDscL, T00IA7_A396EmprCod, T00IA7_A11522CCVCod
            }
            , new Object[] {
            T00IA8_A11526CCVPict, T00IA8_n11526CCVPict, T00IA8_A11527CCVLgoDat, T00IA8_n11527CCVLgoDat, T00IA8_A11528CCVTpoDat, T00IA8_n11528CCVTpoDat, T00IA8_A11529CCVDsc, T00IA8_n11529CCVDsc
            }
            , new Object[] {
            T00IA9_A4031CCTCod, T00IA9_A4041CCTArc, T00IA9_A4036CCTDsc, T00IA9_A4037CCTTpoCtr, T00IA9_A4406CCTFinFas, T00IA9_A4407CCTIniFas, T00IA9_A4039CCTObl, T00IA9_A4040CCTSto, T00IA9_A4042CCTObs, T00IA9_A11475CCTNotUlt,
            T00IA9_A396EmprCod
            }
            , new Object[] {
            T00IA10_A4031CCTCod, T00IA10_A4041CCTArc, T00IA10_A4036CCTDsc, T00IA10_A4037CCTTpoCtr, T00IA10_A4406CCTFinFas, T00IA10_A4407CCTIniFas, T00IA10_A4039CCTObl, T00IA10_A4040CCTSto, T00IA10_A4042CCTObs, T00IA10_A11475CCTNotUlt,
            T00IA10_A396EmprCod
            }
            , new Object[] {
            T00IA11_A407EmprNom, T00IA11_n407EmprNom
            }
            , new Object[] {
            T00IA12_A4031CCTCod, T00IA12_A4041CCTArc, T00IA12_A407EmprNom, T00IA12_n407EmprNom, T00IA12_A4036CCTDsc, T00IA12_A4037CCTTpoCtr, T00IA12_A4406CCTFinFas, T00IA12_A4407CCTIniFas, T00IA12_A4039CCTObl, T00IA12_A4040CCTSto,
            T00IA12_A4042CCTObs, T00IA12_A11475CCTNotUlt, T00IA12_A396EmprCod
            }
            , new Object[] {
            T00IA13_A407EmprNom, T00IA13_n407EmprNom
            }
            , new Object[] {
            T00IA14_A396EmprCod, T00IA14_A4031CCTCod
            }
            , new Object[] {
            T00IA15_A396EmprCod, T00IA15_A4031CCTCod
            }
            , new Object[] {
            T00IA16_A396EmprCod, T00IA16_A4031CCTCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00IA20_A407EmprNom, T00IA20_n407EmprNom
            }
            , new Object[] {
            T00IA21_A396EmprCod, T00IA21_A583IntCod, T00IA21_A4031CCTCod
            }
            , new Object[] {
            T00IA22_A396EmprCod, T00IA22_A252CliCod, T00IA22_A9713Tb1_Cod, T00IA22_A11736CCArtCod, T00IA22_A11748TipArtiId, T00IA22_A11737CCColNom, T00IA22_A11738CCColNum, T00IA22_A11749CCCTc, T00IA22_A11750IntId, T00IA22_A4031CCTCod
            }
            , new Object[] {
            T00IA23_A396EmprCod, T00IA23_A252CliCod, T00IA23_A65ArtCod, T00IA23_A4058CCFColNom, T00IA23_A4059CCFColNum, T00IA23_A4031CCTCod
            }
            , new Object[] {
            T00IA24_A396EmprCod, T00IA24_A457FasCod, T00IA24_A4031CCTCod
            }
            , new Object[] {
            T00IA25_A396EmprCod, T00IA25_A4031CCTCod, T00IA25_A4034CCTLin
            }
            , new Object[] {
            T00IA26_A396EmprCod, T00IA26_A129BarCod, T00IA26_A132BarCodReo, T00IA26_A130BarCodPar, T00IA26_A758ProCod, T00IA26_A194BarOrdLin, T00IA26_A4031CCTCod
            }
            , new Object[] {
            }
            , new Object[] {
            T00IA28_A396EmprCod, T00IA28_A4031CCTCod
            }
            , new Object[] {
            T00IA29_A4031CCTCod, T00IA29_A4034CCTLin, T00IA29_A4045CCTLinLgoD, T00IA29_A4046CCTLinPict, T00IA29_A4048CCTLinTpoI, T00IA29_A4044CCTLinTpoD, T00IA29_A4043CCTLinDsc, T00IA29_A4047CCTLinVarW, T00IA29_A4408CCTSta, T00IA29_A11526CCVPict,
            T00IA29_n11526CCVPict, T00IA29_A11527CCVLgoDat, T00IA29_n11527CCVLgoDat, T00IA29_A11528CCVTpoDat, T00IA29_n11528CCVTpoDat, T00IA29_A11529CCVDsc, T00IA29_n11529CCVDsc, T00IA29_A13249CCVNorma, T00IA29_A13250CCVEspecif, T00IA29_A11476CCTLinDscL,
            T00IA29_A396EmprCod, T00IA29_A11522CCVCod
            }
            , new Object[] {
            T00IA30_A11526CCVPict, T00IA30_n11526CCVPict, T00IA30_A11527CCVLgoDat, T00IA30_n11527CCVLgoDat, T00IA30_A11528CCVTpoDat, T00IA30_n11528CCVTpoDat, T00IA30_A11529CCVDsc, T00IA30_n11529CCVDsc
            }
            , new Object[] {
            T00IA31_A396EmprCod, T00IA31_A4031CCTCod, T00IA31_A4034CCTLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00IA35_A11526CCVPict, T00IA35_n11526CCVPict, T00IA35_A11527CCVLgoDat, T00IA35_n11527CCVLgoDat, T00IA35_A11528CCVTpoDat, T00IA35_n11528CCVTpoDat, T00IA35_A11529CCVDsc, T00IA35_n11529CCVDsc
            }
            , new Object[] {
            T00IA36_A396EmprCod, T00IA36_A252CliCod, T00IA36_A9713Tb1_Cod, T00IA36_A11736CCArtCod, T00IA36_A11748TipArtiId, T00IA36_A11737CCColNom, T00IA36_A11738CCColNum, T00IA36_A11749CCCTc, T00IA36_A11750IntId, T00IA36_A4031CCTCod,
            T00IA36_A4034CCTLin
            }
            , new Object[] {
            T00IA37_A396EmprCod, T00IA37_A252CliCod, T00IA37_A65ArtCod, T00IA37_A4058CCFColNom, T00IA37_A4059CCFColNum, T00IA37_A4031CCTCod, T00IA37_A4034CCTLin
            }
            , new Object[] {
            T00IA38_A396EmprCod, T00IA38_A129BarCod, T00IA38_A132BarCodReo, T00IA38_A130BarCodPar, T00IA38_A758ProCod, T00IA38_A194BarOrdLin, T00IA38_A4031CCTCod, T00IA38_A4034CCTLin
            }
            , new Object[] {
            T00IA39_A396EmprCod, T00IA39_A4031CCTCod, T00IA39_A4034CCTLin
            }
            , new Object[] {
            T00IA40_A396EmprCod, T00IA40_A4031CCTCod, T00IA40_A4034CCTLin, T00IA40_A4049CCTValLin, T00IA40_A4050CCTValDsc, T00IA40_A4051CCTVal
            }
            , new Object[] {
            T00IA41_A396EmprCod, T00IA41_A4031CCTCod, T00IA41_A4034CCTLin, T00IA41_A4049CCTValLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00IA45_A396EmprCod, T00IA45_A4031CCTCod, T00IA45_A4034CCTLin, T00IA45_A4049CCTValLin
            }
            , new Object[] {
            T00IA46_A396EmprCod, T00IA46_A4031CCTCod, T00IA46_A11481CCTNotId, T00IA46_A12733CCTNotStp, T00IA46_A11477CCTNotEvt, T00IA46_A11478CCTNotDst, T00IA46_A11479CCTNotUsr, T00IA46_A11480CCTNotEml, T00IA46_A11523CCTNotAsu, T00IA46_A11524CCTNotTxt,
            T00IA46_A11525CCTNotAdj
            }
            , new Object[] {
            T00IA47_A396EmprCod, T00IA47_A4031CCTCod, T00IA47_A11481CCTNotId
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00IA51_A396EmprCod, T00IA51_A4031CCTCod, T00IA51_A11481CCTNotId
            }
            , new Object[] {
            T00IA52_A850UsurCod, T00IA52_A854UsurNom, T00IA52_n854UsurNom
            }
            , new Object[] {
            T00IA53_A396EmprCod, T00IA53_A11522CCVCod, T00IA53_A11529CCVDsc, T00IA53_n11529CCVDsc
            }
            , new Object[] {
            T00IA54_A850UsurCod, T00IA54_A854UsurNom, T00IA54_n854UsurNom
            }
         }
      );
      AV44Pgmname = "ControlCalidadHTD.TCCDef" ;
      Z12733CCTNotStp = (byte)(0) ;
      A12733CCTNotStp = (byte)(0) ;
      i12733CCTNotStp = (byte)(0) ;
   }

   private byte Z4049CCTValLin ;
   private byte N4049CCTValLin ;
   private byte Z12733CCTNotStp ;
   private byte Z11525CCTNotAdj ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte AV27TestCC ;
   private byte A11525CCTNotAdj ;
   private byte A12733CCTNotStp ;
   private byte A4049CCTValLin ;
   private byte GXt_int6 ;
   private byte GXv_int7[] ;
   private byte subFreestylelevel_level1_Backcolorstyle ;
   private byte subFreestylelevel_level1_Backstyle ;
   private byte subGridlevel_level2_Backcolorstyle ;
   private byte subGridlevel_level2_Backstyle ;
   private byte subGridlevel_notificaciones_Backcolorstyle ;
   private byte subGridlevel_notificaciones_Backstyle ;
   private byte gxajaxcallmode ;
   private byte i12733CCTNotStp ;
   private byte subFreestylelevel_level1_Allowselection ;
   private byte subFreestylelevel_level1_Allowhovering ;
   private byte subFreestylelevel_level1_Allowcollapsing ;
   private byte subFreestylelevel_level1_Collapsed ;
   private byte subGridlevel_notificaciones_Allowselection ;
   private byte subGridlevel_notificaciones_Allowhovering ;
   private byte subGridlevel_notificaciones_Allowcollapsing ;
   private byte subGridlevel_notificaciones_Collapsed ;
   private byte subGridlevel_level2_Allowselection ;
   private byte subGridlevel_level2_Allowhovering ;
   private byte subGridlevel_level2_Allowcollapsing ;
   private byte subGridlevel_level2_Collapsed ;
   private short Z11475CCTNotUlt ;
   private short O11475CCTNotUlt ;
   private short Z4034CCTLin ;
   private short Z4045CCTLinLgoD ;
   private short nRcdDeleted_622 ;
   private short nRcdExists_622 ;
   private short nIsMod_622 ;
   private short N4034CCTLin ;
   private short N4045CCTLinLgoD ;
   private short nRcdDeleted_623 ;
   private short nRcdExists_623 ;
   private short nIsMod_623 ;
   private short Z11481CCTNotId ;
   private short nRcdDeleted_1529 ;
   private short nRcdExists_1529 ;
   private short nIsMod_1529 ;
   private short A4034CCTLin ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A11475CCTNotUlt ;
   private short nBlankRcdCount622 ;
   private short RcdFound622 ;
   private short B11475CCTNotUlt ;
   private short nBlankRcdUsr622 ;
   private short nBlankRcdCount1529 ;
   private short RcdFound1529 ;
   private short nBlankRcdUsr1529 ;
   private short A11527CCVLgoDat ;
   private short RcdFound621 ;
   private short A4045CCTLinLgoD ;
   private short s11475CCTNotUlt ;
   private short A11481CCTNotId ;
   private short RcdFound623 ;
   private short nIsDirty_621 ;
   private short Z11527CCVLgoDat ;
   private short nIsDirty_622 ;
   private short nIsDirty_623 ;
   private short nIsDirty_1529 ;
   private short nBlankRcdCount623 ;
   private short nBlankRcdUsr623 ;
   private short i11475CCTNotUlt ;
   private int wcpOAV29CCTCod ;
   private int Z4031CCTCod ;
   private int nRC_GXsfl_79 ;
   private int nGXsfl_79_idx=1 ;
   private int nRC_GXsfl_181 ;
   private int nGXsfl_181_idx=1 ;
   private int nRC_GXsfl_154 ;
   private int nGXsfl_154_idx=1 ;
   private int A4031CCTCod ;
   private int AV29CCTCod ;
   private int trnEnded ;
   private int edtCCVPict_Visible ;
   private int edtCCVTpoDat_Visible ;
   private int edtCCVDsc_Visible ;
   private int edtCCTCod_Enabled ;
   private int edtCCTDsc_Enabled ;
   private int edtavCctarc_Enabled ;
   private int Upload_Maxnumberoffiles ;
   private int Gxuitabspanel_tabs1_Pagecount ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int edtavPgmname_Enabled ;
   private int edtEmprCod_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Visible ;
   private int edtEmprNom_Enabled ;
   private int edtCCTObl_Visible ;
   private int edtCCTObl_Enabled ;
   private int edtCCTNotUlt_Enabled ;
   private int edtCCTNotUlt_Visible ;
   private int edtCCTArc_Visible ;
   private int edtCCTArc_Enabled ;
   private int subFreestylelevel_level1_Rows ;
   private int edtCCTLin_Enabled ;
   private int edtCCTLin_Visible ;
   private int edtCCTLinDsc_Enabled ;
   private int edtCCTLinDsc_Visible ;
   private int edtCCTLinVarW_Enabled ;
   private int edtCCTLinLgoD_Enabled ;
   private int edtCCTLinLgoD_Visible ;
   private int edtCCTLinPict_Enabled ;
   private int edtCCTLinPict_Visible ;
   private int edtCCTSta_Enabled ;
   private int edtCCTSta_Visible ;
   private int edtCCVNorma_Enabled ;
   private int edtCCVEspecif_Enabled ;
   private int edtCCTLinDscL_Enabled ;
   private int edtCCVPict_Enabled ;
   private int edtCCVTpoDat_Enabled ;
   private int edtCCVDsc_Enabled ;
   private int fRowAdded ;
   private int edtCCTNotId_Enabled ;
   private int edtCCTNotEml_Enabled ;
   private int edtCCTNotAsu_Enabled ;
   private int edtCCTNotTxt_Enabled ;
   private int Upload_Maxfilesize ;
   private int Gxuitabspanel_tabs1_Activepage ;
   private int edtCCTValLin_Enabled ;
   private int edtCCTValDsc_Enabled ;
   private int edtCCTVal_Enabled ;
   private int AV45GXV1 ;
   private int GX_JID ;
   private int subFreestylelevel_level1_Backcolor ;
   private int subFreestylelevel_level1_Allbackcolor ;
   private int subGridlevel_level2_Backcolor ;
   private int subGridlevel_level2_Allbackcolor ;
   private int subGridlevel_notificaciones_Backcolor ;
   private int subGridlevel_notificaciones_Allbackcolor ;
   private int defedtCCTVal_Enabled ;
   private int defedtCCTValDsc_Enabled ;
   private int defedtCCTValLin_Enabled ;
   private int defedtCCTNotEml_Enabled ;
   private int defdynCCTNotUsr_Enabled ;
   private int defedtCCTNotId_Enabled ;
   private int defedtCCTSta_Enabled ;
   private int defedtCCTLinPict_Enabled ;
   private int defedtCCTLinLgoD_Enabled ;
   private int defedtCCTLinDsc_Enabled ;
   private int defcmbCCTLinTpoD_Enabled ;
   private int defdynCCVCod_Enabled ;
   private int defedtCCTLin_Enabled ;
   private int idxLst ;
   private int subFreestylelevel_level1_Selectedindex ;
   private int subFreestylelevel_level1_Selectioncolor ;
   private int subFreestylelevel_level1_Hoveringcolor ;
   private int subGridlevel_notificaciones_Selectedindex ;
   private int subGridlevel_notificaciones_Selectioncolor ;
   private int subGridlevel_notificaciones_Hoveringcolor ;
   private int subGridlevel_level2_Selectedindex ;
   private int subGridlevel_level2_Selectioncolor ;
   private int subGridlevel_level2_Hoveringcolor ;
   private int gxdynajaxindex ;
   private long FREESTYLELEVEL_LEVEL1_nFirstRecordOnPage ;
   private long GRIDLEVEL_NOTIFICACIONES_nFirstRecordOnPage ;
   private long GXv_int8[] ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV28EmprCod ;
   private String Z396EmprCod ;
   private String Z4041CCTArc ;
   private String Z4036CCTDsc ;
   private String Z4037CCTTpoCtr ;
   private String Z4406CCTFinFas ;
   private String Z4407CCTIniFas ;
   private String Z4039CCTObl ;
   private String Z4040CCTSto ;
   private String Z4042CCTObs ;
   private String N4042CCTObs ;
   private String Z4046CCTLinPict ;
   private String Z4048CCTLinTpoI ;
   private String Z4044CCTLinTpoD ;
   private String Z4043CCTLinDsc ;
   private String Z4047CCTLinVarW ;
   private String Z4408CCTSta ;
   private String Z13249CCVNorma ;
   private String Z13250CCVEspecif ;
   private String Z11522CCVCod ;
   private String N11522CCVCod ;
   private String N4044CCTLinTpoD ;
   private String N4043CCTLinDsc ;
   private String N4046CCTLinPict ;
   private String N4408CCTSta ;
   private String Z4050CCTValDsc ;
   private String Z4051CCTVal ;
   private String N4050CCTValDsc ;
   private String N4051CCTVal ;
   private String Z11477CCTNotEvt ;
   private String Z11478CCTNotDst ;
   private String Z11479CCTNotUsr ;
   private String Z11480CCTNotEml ;
   private String N11479CCTNotUsr ;
   private String N11480CCTNotEml ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A4037CCTTpoCtr ;
   private String A11522CCVCod ;
   private String Gx_mode ;
   private String AV28EmprCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtCCTCod_Internalname ;
   private String sGXsfl_154_idx="0001" ;
   private String A4048CCTLinTpoI ;
   private String sGXsfl_79_idx="0001" ;
   private String edtCCVPict_Internalname ;
   private String edtCCVTpoDat_Internalname ;
   private String edtCCVDsc_Internalname ;
   private String sGXsfl_181_idx="0001" ;
   private String A4406CCTFinFas ;
   private String A4407CCTIniFas ;
   private String A4040CCTSto ;
   private String A4042CCTObs ;
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
   private String edtCCTCod_Jsonclick ;
   private String edtCCTDsc_Internalname ;
   private String A4036CCTDsc ;
   private String edtCCTDsc_Jsonclick ;
   private String divTablefases_Internalname ;
   private String divTablaupload_Internalname ;
   private String edtavCctarc_Internalname ;
   private String AV14CCTArc ;
   private String edtavCctarc_Jsonclick ;
   private String Upload_Tooltiptext ;
   private String Upload_Internalname ;
   private String divTablepanelgeneral_Internalname ;
   private String Gxuitabspanel_tabs1_Class ;
   private String Gxuitabspanel_tabs1_Internalname ;
   private String lblTab1_title_Internalname ;
   private String lblTab1_title_Jsonclick ;
   private String divUnnamedtable3_Internalname ;
   private String divTableintermediatelevel_level1_Internalname ;
   private String lblTab2_title_Internalname ;
   private String lblTab2_title_Jsonclick ;
   private String divUnnamedtable2_Internalname ;
   private String divTableleaflevel_notificaciones_Internalname ;
   private String lblCctarc_txt_Internalname ;
   private String lblCctarc_txt_Jsonclick ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String edtavPgmname_Internalname ;
   private String AV44Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String edtEmprCod_Internalname ;
   private String edtEmprCod_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String edtCCTObl_Internalname ;
   private String A4039CCTObl ;
   private String edtCCTObl_Jsonclick ;
   private String edtCCTNotUlt_Internalname ;
   private String edtCCTNotUlt_Jsonclick ;
   private String edtCCTArc_Internalname ;
   private String A4041CCTArc ;
   private String edtCCTArc_Jsonclick ;
   private String sMode622 ;
   private String edtCCTLin_Internalname ;
   private String edtCCTLinDsc_Internalname ;
   private String edtCCTLinVarW_Internalname ;
   private String edtCCTLinLgoD_Internalname ;
   private String edtCCTLinLgoD_Invitemessage ;
   private String edtCCTLinPict_Internalname ;
   private String edtCCTSta_Internalname ;
   private String edtCCVNorma_Internalname ;
   private String edtCCVEspecif_Internalname ;
   private String edtCCTLinDscL_Internalname ;
   private String sStyleString ;
   private String subFreestylelevel_level1_Internalname ;
   private String sMode1529 ;
   private String edtCCTNotId_Internalname ;
   private String edtCCTNotEml_Internalname ;
   private String edtCCTNotAsu_Internalname ;
   private String edtCCTNotTxt_Internalname ;
   private String subGridlevel_notificaciones_Internalname ;
   private String AV38AuxEmprCod ;
   private String Upload_Objectcall ;
   private String Upload_Class ;
   private String Upload_Acceptedfiletypes ;
   private String Upload_Customfiletypes ;
   private String Gxuitabspanel_tabs1_Objectcall ;
   private String Gxuitabspanel_tabs1_Activepagecontrolname ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String hsh ;
   private String sMode621 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String GXCCtl ;
   private String A4044CCTLinTpoD ;
   private String A4043CCTLinDsc ;
   private String A4047CCTLinVarW ;
   private String A4046CCTLinPict ;
   private String A4408CCTSta ;
   private String A13249CCVNorma ;
   private String A13250CCVEspecif ;
   private String A11526CCVPict ;
   private String A11528CCVTpoDat ;
   private String A11529CCVDsc ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String A11477CCTNotEvt ;
   private String A11478CCTNotDst ;
   private String A11479CCTNotUsr ;
   private String A11480CCTNotEml ;
   private String edtCCTValLin_Internalname ;
   private String edtCCTValDsc_Internalname ;
   private String A4050CCTValDsc ;
   private String edtCCTVal_Internalname ;
   private String A4051CCTVal ;
   private String AV12Station ;
   private String AV11EmprNom ;
   private String AV8UsurCod ;
   private String GXv_char2[] ;
   private String AV7Lit0 ;
   private String AV10Lit1 ;
   private String AV9LitFe ;
   private String AV15CCLPicInf ;
   private String AV16CCLPicSup ;
   private String AV18CCLArrInf ;
   private String AV17CCLArrSup ;
   private String AV13Mask ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String Z407EmprNom ;
   private String Z11526CCVPict ;
   private String Z11528CCVTpoDat ;
   private String Z11529CCVDsc ;
   private String sMode623 ;
   private String subGridlevel_level2_Internalname ;
   private String sGXsfl_79_fel_idx="0001" ;
   private String subFreestylelevel_level1_Class ;
   private String subFreestylelevel_level1_Linesclass ;
   private String divUnnamedtablefsfreestylelevel_level1_Internalname ;
   private String divTableintermediateinslevel_level1_Internalname ;
   private String divUnnamedtable4_Internalname ;
   private String ROClassString ;
   private String edtCCTLin_Jsonclick ;
   private String divUnnamedtable5_Internalname ;
   private String edtCCTLinDsc_Jsonclick ;
   private String edtCCTLinVarW_Jsonclick ;
   private String divTableab_Internalname ;
   private String edtCCTLinLgoD_Jsonclick ;
   private String edtCCTLinPict_Jsonclick ;
   private String edtCCTSta_Jsonclick ;
   private String divTablelast_Internalname ;
   private String edtCCVNorma_Jsonclick ;
   private String edtCCVEspecif_Jsonclick ;
   private String divTableempty_Internalname ;
   private String divTableleaflevel_level2_Internalname ;
   private String tblUnnamedtablecontentfsfreestylelevel_level1_Internalname ;
   private String edtCCVPict_Jsonclick ;
   private String edtCCVTpoDat_Jsonclick ;
   private String edtCCVDsc_Jsonclick ;
   private String sGXsfl_154_fel_idx="0001" ;
   private String subGridlevel_level2_Class ;
   private String subGridlevel_level2_Linesclass ;
   private String edtCCTValLin_Jsonclick ;
   private String edtCCTValDsc_Jsonclick ;
   private String edtCCTVal_Jsonclick ;
   private String sGXsfl_181_fel_idx="0001" ;
   private String subGridlevel_notificaciones_Class ;
   private String subGridlevel_notificaciones_Linesclass ;
   private String edtCCTNotId_Jsonclick ;
   private String edtCCTNotEml_Jsonclick ;
   private String edtCCTNotAsu_Jsonclick ;
   private String edtCCTNotTxt_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String i4048CCTLinTpoI ;
   private String subFreestylelevel_level1_Header ;
   private String subGridlevel_notificaciones_Header ;
   private String subGridlevel_level2_Header ;
   private String gxwrpcisep ;
   private boolean wcpOAV37isVariable ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV37isVariable ;
   private boolean wbErr ;
   private boolean bGXsfl_79_Refreshing=false ;
   private boolean Dvpanel_tableattributes_Autowidth ;
   private boolean Dvpanel_tableattributes_Autoheight ;
   private boolean Dvpanel_tableattributes_Collapsible ;
   private boolean Dvpanel_tableattributes_Collapsed ;
   private boolean Dvpanel_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_tableattributes_Autoscroll ;
   private boolean Upload_Autoupload ;
   private boolean Upload_Hideadditionalbuttons ;
   private boolean Upload_Autodisableaddingfiles ;
   private boolean Gxuitabspanel_tabs1_Historymanagement ;
   private boolean bGXsfl_181_Refreshing=false ;
   private boolean n11527CCVLgoDat ;
   private boolean Upload_Enabled ;
   private boolean Upload_Enableuploadedfilecanceling ;
   private boolean Upload_Disableimageresize ;
   private boolean Upload_Visible ;
   private boolean Gxuitabspanel_tabs1_Enabled ;
   private boolean Gxuitabspanel_tabs1_Visible ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean n407EmprNom ;
   private boolean n11526CCVPict ;
   private boolean n11528CCVTpoDat ;
   private boolean n11529CCVDsc ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private boolean bGXsfl_154_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private String Z11476CCTLinDscL ;
   private String Z11523CCTNotAsu ;
   private String Z11524CCTNotTxt ;
   private String A11476CCTLinDscL ;
   private String A11523CCTNotAsu ;
   private String A11524CCTNotTxt ;
   private String AV46Archivo_GXI ;
   private String AV42Archivo ;
   private com.genexus.webpanels.GXWebGrid Freestylelevel_level1Container ;
   private com.genexus.webpanels.GXWebGrid Gridlevel_notificacionesContainer ;
   private com.genexus.webpanels.GXWebGrid Gridlevel_level2Container ;
   private com.genexus.webpanels.GXWebRow Freestylelevel_level1Row ;
   private com.genexus.webpanels.GXWebRow Gridlevel_level2Row ;
   private com.genexus.webpanels.GXWebRow Gridlevel_notificacionesRow ;
   private com.genexus.webpanels.GXWebColumn Freestylelevel_level1Column ;
   private com.genexus.webpanels.GXWebColumn Gridlevel_notificacionesColumn ;
   private com.genexus.webpanels.GXWebColumn Gridlevel_level2Column ;
   private com.genexus.internet.StringCollection gxdynajaxctrlcodr ;
   private com.genexus.internet.StringCollection gxdynajaxctrldescr ;
   private com.genexus.webpanels.WebSession AV32WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.webpanels.GXUserControl ucUpload ;
   private com.genexus.webpanels.GXUserControl ucGxuitabspanel_tabs1 ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbCCTTpoCtr ;
   private ICheckbox chkCCTFinFas ;
   private ICheckbox chkCCTIniFas ;
   private ICheckbox chkCCTSto ;
   private ICheckbox chkCCTObs ;
   private HTMLChoice cmbCCTLinTpoI ;
   private HTMLChoice dynCCVCod ;
   private HTMLChoice cmbCCTLinTpoD ;
   private HTMLChoice cmbCCTNotEvt ;
   private HTMLChoice cmbCCTNotDst ;
   private HTMLChoice dynCCTNotUsr ;
   private HTMLChoice cmbCCTNotAdj ;
   private HTMLChoice cmbCCTNotStp ;
   private IDataStoreProvider pr_default ;
   private String[] T00IA11_A407EmprNom ;
   private boolean[] T00IA11_n407EmprNom ;
   private int[] T00IA12_A4031CCTCod ;
   private String[] T00IA12_A4041CCTArc ;
   private String[] T00IA12_A407EmprNom ;
   private boolean[] T00IA12_n407EmprNom ;
   private String[] T00IA12_A4036CCTDsc ;
   private String[] T00IA12_A4037CCTTpoCtr ;
   private String[] T00IA12_A4406CCTFinFas ;
   private String[] T00IA12_A4407CCTIniFas ;
   private String[] T00IA12_A4039CCTObl ;
   private String[] T00IA12_A4040CCTSto ;
   private String[] T00IA12_A4042CCTObs ;
   private short[] T00IA12_A11475CCTNotUlt ;
   private String[] T00IA12_A396EmprCod ;
   private String[] T00IA13_A407EmprNom ;
   private boolean[] T00IA13_n407EmprNom ;
   private String[] T00IA14_A396EmprCod ;
   private int[] T00IA14_A4031CCTCod ;
   private int[] T00IA10_A4031CCTCod ;
   private String[] T00IA10_A4041CCTArc ;
   private String[] T00IA10_A4036CCTDsc ;
   private String[] T00IA10_A4037CCTTpoCtr ;
   private String[] T00IA10_A4406CCTFinFas ;
   private String[] T00IA10_A4407CCTIniFas ;
   private String[] T00IA10_A4039CCTObl ;
   private String[] T00IA10_A4040CCTSto ;
   private String[] T00IA10_A4042CCTObs ;
   private short[] T00IA10_A11475CCTNotUlt ;
   private String[] T00IA10_A396EmprCod ;
   private String[] T00IA15_A396EmprCod ;
   private int[] T00IA15_A4031CCTCod ;
   private String[] T00IA16_A396EmprCod ;
   private int[] T00IA16_A4031CCTCod ;
   private int[] T00IA9_A4031CCTCod ;
   private String[] T00IA9_A4041CCTArc ;
   private String[] T00IA9_A4036CCTDsc ;
   private String[] T00IA9_A4037CCTTpoCtr ;
   private String[] T00IA9_A4406CCTFinFas ;
   private String[] T00IA9_A4407CCTIniFas ;
   private String[] T00IA9_A4039CCTObl ;
   private String[] T00IA9_A4040CCTSto ;
   private String[] T00IA9_A4042CCTObs ;
   private short[] T00IA9_A11475CCTNotUlt ;
   private String[] T00IA9_A396EmprCod ;
   private String[] T00IA20_A407EmprNom ;
   private boolean[] T00IA20_n407EmprNom ;
   private String[] T00IA21_A396EmprCod ;
   private byte[] T00IA21_A583IntCod ;
   private int[] T00IA21_A4031CCTCod ;
   private String[] T00IA22_A396EmprCod ;
   private int[] T00IA22_A252CliCod ;
   private short[] T00IA22_A9713Tb1_Cod ;
   private String[] T00IA22_A11736CCArtCod ;
   private short[] T00IA22_A11748TipArtiId ;
   private String[] T00IA22_A11737CCColNom ;
   private int[] T00IA22_A11738CCColNum ;
   private byte[] T00IA22_A11749CCCTc ;
   private short[] T00IA22_A11750IntId ;
   private int[] T00IA22_A4031CCTCod ;
   private String[] T00IA23_A396EmprCod ;
   private int[] T00IA23_A252CliCod ;
   private String[] T00IA23_A65ArtCod ;
   private String[] T00IA23_A4058CCFColNom ;
   private int[] T00IA23_A4059CCFColNum ;
   private int[] T00IA23_A4031CCTCod ;
   private String[] T00IA24_A396EmprCod ;
   private String[] T00IA24_A457FasCod ;
   private int[] T00IA24_A4031CCTCod ;
   private String[] T00IA25_A396EmprCod ;
   private int[] T00IA25_A4031CCTCod ;
   private short[] T00IA25_A4034CCTLin ;
   private String[] T00IA26_A396EmprCod ;
   private int[] T00IA26_A129BarCod ;
   private byte[] T00IA26_A132BarCodReo ;
   private String[] T00IA26_A130BarCodPar ;
   private String[] T00IA26_A758ProCod ;
   private short[] T00IA26_A194BarOrdLin ;
   private int[] T00IA26_A4031CCTCod ;
   private String[] T00IA28_A396EmprCod ;
   private int[] T00IA28_A4031CCTCod ;
   private String[] T00IA8_A11526CCVPict ;
   private boolean[] T00IA8_n11526CCVPict ;
   private short[] T00IA8_A11527CCVLgoDat ;
   private boolean[] T00IA8_n11527CCVLgoDat ;
   private String[] T00IA8_A11528CCVTpoDat ;
   private boolean[] T00IA8_n11528CCVTpoDat ;
   private String[] T00IA8_A11529CCVDsc ;
   private boolean[] T00IA8_n11529CCVDsc ;
   private int[] T00IA29_A4031CCTCod ;
   private short[] T00IA29_A4034CCTLin ;
   private short[] T00IA29_A4045CCTLinLgoD ;
   private String[] T00IA29_A4046CCTLinPict ;
   private String[] T00IA29_A4048CCTLinTpoI ;
   private String[] T00IA29_A4044CCTLinTpoD ;
   private String[] T00IA29_A4043CCTLinDsc ;
   private String[] T00IA29_A4047CCTLinVarW ;
   private String[] T00IA29_A4408CCTSta ;
   private String[] T00IA29_A11526CCVPict ;
   private boolean[] T00IA29_n11526CCVPict ;
   private short[] T00IA29_A11527CCVLgoDat ;
   private boolean[] T00IA29_n11527CCVLgoDat ;
   private String[] T00IA29_A11528CCVTpoDat ;
   private boolean[] T00IA29_n11528CCVTpoDat ;
   private String[] T00IA29_A11529CCVDsc ;
   private boolean[] T00IA29_n11529CCVDsc ;
   private String[] T00IA29_A13249CCVNorma ;
   private String[] T00IA29_A13250CCVEspecif ;
   private String[] T00IA29_A11476CCTLinDscL ;
   private String[] T00IA29_A396EmprCod ;
   private String[] T00IA29_A11522CCVCod ;
   private String[] T00IA30_A11526CCVPict ;
   private boolean[] T00IA30_n11526CCVPict ;
   private short[] T00IA30_A11527CCVLgoDat ;
   private boolean[] T00IA30_n11527CCVLgoDat ;
   private String[] T00IA30_A11528CCVTpoDat ;
   private boolean[] T00IA30_n11528CCVTpoDat ;
   private String[] T00IA30_A11529CCVDsc ;
   private boolean[] T00IA30_n11529CCVDsc ;
   private String[] T00IA31_A396EmprCod ;
   private int[] T00IA31_A4031CCTCod ;
   private short[] T00IA31_A4034CCTLin ;
   private int[] T00IA7_A4031CCTCod ;
   private short[] T00IA7_A4034CCTLin ;
   private short[] T00IA7_A4045CCTLinLgoD ;
   private String[] T00IA7_A4046CCTLinPict ;
   private String[] T00IA7_A4048CCTLinTpoI ;
   private String[] T00IA7_A4044CCTLinTpoD ;
   private String[] T00IA7_A4043CCTLinDsc ;
   private String[] T00IA7_A4047CCTLinVarW ;
   private String[] T00IA7_A4408CCTSta ;
   private String[] T00IA7_A13249CCVNorma ;
   private String[] T00IA7_A13250CCVEspecif ;
   private String[] T00IA7_A11476CCTLinDscL ;
   private String[] T00IA7_A396EmprCod ;
   private String[] T00IA7_A11522CCVCod ;
   private int[] T00IA6_A4031CCTCod ;
   private short[] T00IA6_A4034CCTLin ;
   private short[] T00IA6_A4045CCTLinLgoD ;
   private String[] T00IA6_A4046CCTLinPict ;
   private String[] T00IA6_A4048CCTLinTpoI ;
   private String[] T00IA6_A4044CCTLinTpoD ;
   private String[] T00IA6_A4043CCTLinDsc ;
   private String[] T00IA6_A4047CCTLinVarW ;
   private String[] T00IA6_A4408CCTSta ;
   private String[] T00IA6_A13249CCVNorma ;
   private String[] T00IA6_A13250CCVEspecif ;
   private String[] T00IA6_A11476CCTLinDscL ;
   private String[] T00IA6_A396EmprCod ;
   private String[] T00IA6_A11522CCVCod ;
   private String[] T00IA35_A11526CCVPict ;
   private boolean[] T00IA35_n11526CCVPict ;
   private short[] T00IA35_A11527CCVLgoDat ;
   private boolean[] T00IA35_n11527CCVLgoDat ;
   private String[] T00IA35_A11528CCVTpoDat ;
   private boolean[] T00IA35_n11528CCVTpoDat ;
   private String[] T00IA35_A11529CCVDsc ;
   private boolean[] T00IA35_n11529CCVDsc ;
   private String[] T00IA36_A396EmprCod ;
   private int[] T00IA36_A252CliCod ;
   private short[] T00IA36_A9713Tb1_Cod ;
   private String[] T00IA36_A11736CCArtCod ;
   private short[] T00IA36_A11748TipArtiId ;
   private String[] T00IA36_A11737CCColNom ;
   private int[] T00IA36_A11738CCColNum ;
   private byte[] T00IA36_A11749CCCTc ;
   private short[] T00IA36_A11750IntId ;
   private int[] T00IA36_A4031CCTCod ;
   private short[] T00IA36_A4034CCTLin ;
   private String[] T00IA37_A396EmprCod ;
   private int[] T00IA37_A252CliCod ;
   private String[] T00IA37_A65ArtCod ;
   private String[] T00IA37_A4058CCFColNom ;
   private int[] T00IA37_A4059CCFColNum ;
   private int[] T00IA37_A4031CCTCod ;
   private short[] T00IA37_A4034CCTLin ;
   private String[] T00IA38_A396EmprCod ;
   private int[] T00IA38_A129BarCod ;
   private byte[] T00IA38_A132BarCodReo ;
   private String[] T00IA38_A130BarCodPar ;
   private String[] T00IA38_A758ProCod ;
   private short[] T00IA38_A194BarOrdLin ;
   private int[] T00IA38_A4031CCTCod ;
   private short[] T00IA38_A4034CCTLin ;
   private String[] T00IA39_A396EmprCod ;
   private int[] T00IA39_A4031CCTCod ;
   private short[] T00IA39_A4034CCTLin ;
   private String[] T00IA40_A396EmprCod ;
   private int[] T00IA40_A4031CCTCod ;
   private short[] T00IA40_A4034CCTLin ;
   private byte[] T00IA40_A4049CCTValLin ;
   private String[] T00IA40_A4050CCTValDsc ;
   private String[] T00IA40_A4051CCTVal ;
   private String[] T00IA41_A396EmprCod ;
   private int[] T00IA41_A4031CCTCod ;
   private short[] T00IA41_A4034CCTLin ;
   private byte[] T00IA41_A4049CCTValLin ;
   private String[] T00IA5_A396EmprCod ;
   private int[] T00IA5_A4031CCTCod ;
   private short[] T00IA5_A4034CCTLin ;
   private byte[] T00IA5_A4049CCTValLin ;
   private String[] T00IA5_A4050CCTValDsc ;
   private String[] T00IA5_A4051CCTVal ;
   private String[] T00IA4_A396EmprCod ;
   private int[] T00IA4_A4031CCTCod ;
   private short[] T00IA4_A4034CCTLin ;
   private byte[] T00IA4_A4049CCTValLin ;
   private String[] T00IA4_A4050CCTValDsc ;
   private String[] T00IA4_A4051CCTVal ;
   private String[] T00IA45_A396EmprCod ;
   private int[] T00IA45_A4031CCTCod ;
   private short[] T00IA45_A4034CCTLin ;
   private byte[] T00IA45_A4049CCTValLin ;
   private String[] T00IA46_A396EmprCod ;
   private int[] T00IA46_A4031CCTCod ;
   private short[] T00IA46_A11481CCTNotId ;
   private byte[] T00IA46_A12733CCTNotStp ;
   private String[] T00IA46_A11477CCTNotEvt ;
   private String[] T00IA46_A11478CCTNotDst ;
   private String[] T00IA46_A11479CCTNotUsr ;
   private String[] T00IA46_A11480CCTNotEml ;
   private String[] T00IA46_A11523CCTNotAsu ;
   private String[] T00IA46_A11524CCTNotTxt ;
   private byte[] T00IA46_A11525CCTNotAdj ;
   private String[] T00IA47_A396EmprCod ;
   private int[] T00IA47_A4031CCTCod ;
   private short[] T00IA47_A11481CCTNotId ;
   private String[] T00IA3_A396EmprCod ;
   private int[] T00IA3_A4031CCTCod ;
   private short[] T00IA3_A11481CCTNotId ;
   private byte[] T00IA3_A12733CCTNotStp ;
   private String[] T00IA3_A11477CCTNotEvt ;
   private String[] T00IA3_A11478CCTNotDst ;
   private String[] T00IA3_A11479CCTNotUsr ;
   private String[] T00IA3_A11480CCTNotEml ;
   private String[] T00IA3_A11523CCTNotAsu ;
   private String[] T00IA3_A11524CCTNotTxt ;
   private byte[] T00IA3_A11525CCTNotAdj ;
   private String[] T00IA2_A396EmprCod ;
   private int[] T00IA2_A4031CCTCod ;
   private short[] T00IA2_A11481CCTNotId ;
   private byte[] T00IA2_A12733CCTNotStp ;
   private String[] T00IA2_A11477CCTNotEvt ;
   private String[] T00IA2_A11478CCTNotDst ;
   private String[] T00IA2_A11479CCTNotUsr ;
   private String[] T00IA2_A11480CCTNotEml ;
   private String[] T00IA2_A11523CCTNotAsu ;
   private String[] T00IA2_A11524CCTNotTxt ;
   private byte[] T00IA2_A11525CCTNotAdj ;
   private String[] T00IA51_A396EmprCod ;
   private int[] T00IA51_A4031CCTCod ;
   private short[] T00IA51_A11481CCTNotId ;
   private String[] T00IA52_A850UsurCod ;
   private String[] T00IA52_A854UsurNom ;
   private boolean[] T00IA52_n854UsurNom ;
   private String[] T00IA53_A396EmprCod ;
   private String[] T00IA53_A11522CCVCod ;
   private String[] T00IA53_A11529CCVDsc ;
   private boolean[] T00IA53_n11529CCVDsc ;
   private String[] T00IA54_A850UsurCod ;
   private String[] T00IA54_A854UsurNom ;
   private boolean[] T00IA54_n854UsurNom ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.SdtFileUploadData> AV33UploadedFiles ;
   private GXBaseCollection<app.SdtFileUploadData> AV34FailedFiles ;
   private app.wwpbaseobjects.SdtWWPContext AV30WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext5[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV31TrnContext ;
   private app.SdtFileUploadData AV40FileUploadfile ;
}

final  class tccdef__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tccdef__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tccdef__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tccdef__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tccdef__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00IA2", "SELECT EmprCod, CCTCod, CCTNotId, CCTNotStp, CCTNotEvt, CCTNotDst, CCTNotUsr, CCTNotEml, CCTNotAsu, CCTNotTxt, CCTNotAdj FROM TXPCCDefN WHERE EmprCod = ? AND CCTCod = ? AND CCTNotId = ?  FOR UPDATE OF CCTNotStp, CCTNotEvt, CCTNotDst, CCTNotUsr, CCTNotEml, CCTNotAsu, CCTNotTxt, CCTNotAdj NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00IA3", "SELECT EmprCod, CCTCod, CCTNotId, CCTNotStp, CCTNotEvt, CCTNotDst, CCTNotUsr, CCTNotEml, CCTNotAsu, CCTNotTxt, CCTNotAdj FROM TXPCCDefN WHERE EmprCod = ? AND CCTCod = ? AND CCTNotId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00IA4", "SELECT EmprCod, CCTCod, CCTLin, CCTValLin, CCTValDsc, CCTVal FROM TXPCCDef2 WHERE EmprCod = ? AND CCTCod = ? AND CCTLin = ? AND CCTValLin = ?  FOR UPDATE OF CCTValDsc, CCTVal NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00IA5", "SELECT EmprCod, CCTCod, CCTLin, CCTValLin, CCTValDsc, CCTVal FROM TXPCCDef2 WHERE EmprCod = ? AND CCTCod = ? AND CCTLin = ? AND CCTValLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00IA6", "SELECT CCTCod, CCTLin, CCTLinLgoD, CCTLinPict, CCTLinTpoI, CCTLinTpoD, CCTLinDsc, CCTLinVarW, CCTSta, CCVNorma, CCVEspecif, CCTLinDscL, EmprCod, CCVCod FROM TXPCCDef1 WHERE EmprCod = ? AND CCTCod = ? AND CCTLin = ?  FOR UPDATE OF CCTLinLgoD, CCTLinPict, CCTLinTpoI, CCTLinTpoD, CCTLinDsc, CCTLinVarW, CCTSta, CCVNorma, CCVEspecif, CCTLinDscL, CCVCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00IA7", "SELECT CCTCod, CCTLin, CCTLinLgoD, CCTLinPict, CCTLinTpoI, CCTLinTpoD, CCTLinDsc, CCTLinVarW, CCTSta, CCVNorma, CCVEspecif, CCTLinDscL, EmprCod, CCVCod FROM TXPCCDef1 WHERE EmprCod = ? AND CCTCod = ? AND CCTLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00IA8", "SELECT CCVPict, CCVLgoDat, CCVTpoDat, CCVDsc FROM TXPCCVar WHERE EmprCod = ? AND CCVCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00IA9", "SELECT CCTCod, CCTArc, CCTDsc, CCTTpoCtr, CCTFinFas, CCTIniFas, CCTObl, CCTSto, CCTObs, CCTNotUlt, EmprCod FROM TXPCCDef WHERE EmprCod = ? AND CCTCod = ?  FOR UPDATE OF CCTArc, CCTDsc, CCTTpoCtr, CCTFinFas, CCTIniFas, CCTObl, CCTSto, CCTObs, CCTNotUlt NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00IA10", "SELECT CCTCod, CCTArc, CCTDsc, CCTTpoCtr, CCTFinFas, CCTIniFas, CCTObl, CCTSto, CCTObs, CCTNotUlt, EmprCod FROM TXPCCDef WHERE EmprCod = ? AND CCTCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00IA11", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00IA12", "SELECT /*+ FIRST_ROWS(100) */ TM1.CCTCod, TM1.CCTArc, T2.EmprNom, TM1.CCTDsc, TM1.CCTTpoCtr, TM1.CCTFinFas, TM1.CCTIniFas, TM1.CCTObl, TM1.CCTSto, TM1.CCTObs, TM1.CCTNotUlt, TM1.EmprCod FROM (TXPCCDef TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.CCTCod = ? ORDER BY TM1.EmprCod, TM1.CCTCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00IA13", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00IA14", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, CCTCod FROM TXPCCDef WHERE EmprCod = ? AND CCTCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00IA15", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CCTCod FROM TXPCCDef WHERE ( EmprCod > ? or EmprCod = ? and CCTCod > ?) ORDER BY EmprCod, CCTCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00IA16", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CCTCod FROM TXPCCDef WHERE ( EmprCod < ? or EmprCod = ? and CCTCod < ?) ORDER BY EmprCod DESC, CCTCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T00IA17", "INSERT INTO TXPCCDef(CCTCod, CCTArc, CCTDsc, CCTTpoCtr, CCTFinFas, CCTIniFas, CCTObl, CCTSto, CCTObs, CCTNotUlt, EmprCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPCCDef")
         ,new UpdateCursor("T00IA18", "UPDATE TXPCCDef SET CCTArc=?, CCTDsc=?, CCTTpoCtr=?, CCTFinFas=?, CCTIniFas=?, CCTObl=?, CCTSto=?, CCTObs=?, CCTNotUlt=?  WHERE EmprCod = ? AND CCTCod = ?", GX_NOMASK, "TXPCCDef")
         ,new UpdateCursor("T00IA19", "DELETE FROM TXPCCDef  WHERE EmprCod = ? AND CCTCod = ?", GX_NOMASK, "TXPCCDef")
         ,new ForEachCursor("T00IA20", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00IA21", "SELECT * FROM (SELECT EmprCod, IntCod, CCTCod FROM TXPPddCtr WHERE EmprCod = ? AND CCTCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00IA22", "SELECT * FROM (SELECT EmprCod, CliCod, Tb1_Cod, CCArtCod, TipArtiId, CCColNom, CCColNum, CCCTc, IntId, CCTCod FROM TXPCCCno5 WHERE EmprCod = ? AND CCTCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00IA23", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, CCFColNom, CCFColNum, CCTCod FROM TXPCCSer1 WHERE EmprCod = ? AND CCTCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00IA24", "SELECT * FROM (SELECT EmprCod, FasCod, CCTCod FROM TXPCCFas WHERE EmprCod = ? AND CCTCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00IA25", "SELECT * FROM (SELECT EmprCod, CCTCod, CCTLin FROM TXPCCDef1 WHERE EmprCod = ? AND CCTCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00IA26", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, CCTCod FROM TXPCC WHERE EmprCod = ? AND CCTCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T00IA27", "UPDATE TXPCCDef SET CCTNotUlt=?  WHERE EmprCod = ? AND CCTCod = ?", GX_NOMASK, "TXPCCDef")
         ,new ForEachCursor("T00IA28", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, CCTCod FROM TXPCCDef ORDER BY EmprCod, CCTCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00IA29", "SELECT T1.CCTCod, T1.CCTLin, T1.CCTLinLgoD, T1.CCTLinPict, T1.CCTLinTpoI, T1.CCTLinTpoD, T1.CCTLinDsc, T1.CCTLinVarW, T1.CCTSta, T2.CCVPict, T2.CCVLgoDat, T2.CCVTpoDat, T2.CCVDsc, T1.CCVNorma, T1.CCVEspecif, T1.CCTLinDscL, T1.EmprCod, T1.CCVCod FROM (TXPCCDef1 T1 INNER JOIN TXPCCVar T2 ON T2.EmprCod = T1.EmprCod AND T2.CCVCod = T1.CCVCod) WHERE T1.EmprCod = ? and T1.CCTCod = ? and T1.CCTLin = ? ORDER BY T1.EmprCod, T1.CCTCod, T1.CCTLin ",true, GX_NOMASK, false, this,6, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00IA30", "SELECT CCVPict, CCVLgoDat, CCVTpoDat, CCVDsc FROM TXPCCVar WHERE EmprCod = ? AND CCVCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00IA31", "SELECT EmprCod, CCTCod, CCTLin FROM TXPCCDef1 WHERE EmprCod = ? AND CCTCod = ? AND CCTLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T00IA32", "INSERT INTO TXPCCDef1(CCTCod, CCTLin, CCTLinLgoD, CCTLinPict, CCTLinTpoI, CCTLinTpoD, CCTLinDsc, CCTLinVarW, CCTSta, CCVNorma, CCVEspecif, CCTLinDscL, EmprCod, CCVCod, CCTLinDc2, CCTLinVWor, CCTLinWNor, CCVEspe2) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', ' ', ' ', ' ')", GX_NOMASK, "TXPCCDef1")
         ,new UpdateCursor("T00IA33", "UPDATE TXPCCDef1 SET CCTLinLgoD=?, CCTLinPict=?, CCTLinTpoI=?, CCTLinTpoD=?, CCTLinDsc=?, CCTLinVarW=?, CCTSta=?, CCVNorma=?, CCVEspecif=?, CCTLinDscL=?, CCVCod=?  WHERE EmprCod = ? AND CCTCod = ? AND CCTLin = ?", GX_NOMASK, "TXPCCDef1")
         ,new UpdateCursor("T00IA34", "DELETE FROM TXPCCDef1  WHERE EmprCod = ? AND CCTCod = ? AND CCTLin = ?", GX_NOMASK, "TXPCCDef1")
         ,new ForEachCursor("T00IA35", "SELECT CCVPict, CCVLgoDat, CCVTpoDat, CCVDsc FROM TXPCCVar WHERE EmprCod = ? AND CCVCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00IA36", "SELECT * FROM (SELECT EmprCod, CliCod, Tb1_Cod, CCArtCod, TipArtiId, CCColNom, CCColNum, CCCTc, IntId, CCTCod, CCTLin FROM TXPCCCNOS WHERE EmprCod = ? AND CCTCod = ? AND CCTLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00IA37", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, CCFColNom, CCFColNum, CCTCod, CCTLin FROM TXPCCSta WHERE EmprCod = ? AND CCTCod = ? AND CCTLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00IA38", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, CCTCod, CCTLin FROM TXPCC1 WHERE EmprCod = ? AND CCTCod = ? AND CCTLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00IA39", "SELECT EmprCod, CCTCod, CCTLin FROM TXPCCDef1 WHERE EmprCod = ? and CCTCod = ? ORDER BY EmprCod, CCTCod, CCTLin ",true, GX_NOMASK, false, this,6, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00IA40", "SELECT EmprCod, CCTCod, CCTLin, CCTValLin, CCTValDsc, CCTVal FROM TXPCCDef2 WHERE EmprCod = ? and CCTCod = ? and CCTLin = ? and CCTValLin = ? ORDER BY EmprCod, CCTCod, CCTLin, CCTValLin ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00IA41", "SELECT EmprCod, CCTCod, CCTLin, CCTValLin FROM TXPCCDef2 WHERE EmprCod = ? AND CCTCod = ? AND CCTLin = ? AND CCTValLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T00IA42", "INSERT INTO TXPCCDef2(EmprCod, CCTCod, CCTLin, CCTValLin, CCTValDsc, CCTVal) VALUES(?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPCCDef2")
         ,new UpdateCursor("T00IA43", "UPDATE TXPCCDef2 SET CCTValDsc=?, CCTVal=?  WHERE EmprCod = ? AND CCTCod = ? AND CCTLin = ? AND CCTValLin = ?", GX_NOMASK, "TXPCCDef2")
         ,new UpdateCursor("T00IA44", "DELETE FROM TXPCCDef2  WHERE EmprCod = ? AND CCTCod = ? AND CCTLin = ? AND CCTValLin = ?", GX_NOMASK, "TXPCCDef2")
         ,new ForEachCursor("T00IA45", "SELECT EmprCod, CCTCod, CCTLin, CCTValLin FROM TXPCCDef2 WHERE EmprCod = ? and CCTCod = ? and CCTLin = ? ORDER BY EmprCod, CCTCod, CCTLin, CCTValLin ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00IA46", "SELECT EmprCod, CCTCod, CCTNotId, CCTNotStp, CCTNotEvt, CCTNotDst, CCTNotUsr, CCTNotEml, CCTNotAsu, CCTNotTxt, CCTNotAdj FROM TXPCCDefN WHERE EmprCod = ? and CCTCod = ? and CCTNotId = ? ORDER BY EmprCod, CCTCod, CCTNotId ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00IA47", "SELECT EmprCod, CCTCod, CCTNotId FROM TXPCCDefN WHERE EmprCod = ? AND CCTCod = ? AND CCTNotId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T00IA48", "INSERT INTO TXPCCDefN(EmprCod, CCTCod, CCTNotId, CCTNotStp, CCTNotEvt, CCTNotDst, CCTNotUsr, CCTNotEml, CCTNotAsu, CCTNotTxt, CCTNotAdj) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPCCDefN")
         ,new UpdateCursor("T00IA49", "UPDATE TXPCCDefN SET CCTNotStp=?, CCTNotEvt=?, CCTNotDst=?, CCTNotUsr=?, CCTNotEml=?, CCTNotAsu=?, CCTNotTxt=?, CCTNotAdj=?  WHERE EmprCod = ? AND CCTCod = ? AND CCTNotId = ?", GX_NOMASK, "TXPCCDefN")
         ,new UpdateCursor("T00IA50", "DELETE FROM TXPCCDefN  WHERE EmprCod = ? AND CCTCod = ? AND CCTNotId = ?", GX_NOMASK, "TXPCCDefN")
         ,new ForEachCursor("T00IA51", "SELECT EmprCod, CCTCod, CCTNotId FROM TXPCCDefN WHERE EmprCod = ? and CCTCod = ? ORDER BY EmprCod, CCTCod, CCTNotId ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00IA52", "SELECT UsurCod, UsurNom FROM TXPUSUARI ORDER BY UsurNom ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00IA53", "SELECT EmprCod, CCVCod, CCVDsc FROM TXPCCVar WHERE EmprCod = ? ORDER BY CCVDsc ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00IA54", "SELECT UsurCod, UsurNom FROM TXPUSUARI ORDER BY UsurNom ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((String[]) buf[7])[0] = rslt.getString(8, 120);
               ((String[]) buf[8])[0] = rslt.getVarchar(9);
               ((String[]) buf[9])[0] = rslt.getVarchar(10);
               ((byte[]) buf[10])[0] = rslt.getByte(11);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((String[]) buf[7])[0] = rslt.getString(8, 120);
               ((String[]) buf[8])[0] = rslt.getVarchar(9);
               ((String[]) buf[9])[0] = rslt.getVarchar(10);
               ((byte[]) buf[10])[0] = rslt.getByte(11);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((String[]) buf[5])[0] = rslt.getString(6, 40);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((String[]) buf[5])[0] = rslt.getString(6, 40);
               return;
            case 4 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 40);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((String[]) buf[7])[0] = rslt.getString(8, 32);
               ((String[]) buf[8])[0] = rslt.getString(9, 40);
               ((String[]) buf[9])[0] = rslt.getString(10, 30);
               ((String[]) buf[10])[0] = rslt.getString(11, 30);
               ((String[]) buf[11])[0] = rslt.getVarchar(12);
               ((String[]) buf[12])[0] = rslt.getString(13, 3);
               ((String[]) buf[13])[0] = rslt.getString(14, 10);
               return;
            case 5 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 40);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((String[]) buf[7])[0] = rslt.getString(8, 32);
               ((String[]) buf[8])[0] = rslt.getString(9, 40);
               ((String[]) buf[9])[0] = rslt.getString(10, 30);
               ((String[]) buf[10])[0] = rslt.getString(11, 30);
               ((String[]) buf[11])[0] = rslt.getVarchar(12);
               ((String[]) buf[12])[0] = rslt.getString(13, 3);
               ((String[]) buf[13])[0] = rslt.getString(14, 10);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((short[]) buf[2])[0] = rslt.getShort(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               return;
            case 7 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 128);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((String[]) buf[8])[0] = rslt.getString(9, 1);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 3);
               return;
            case 8 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 128);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((String[]) buf[8])[0] = rslt.getString(9, 1);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 3);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 10 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 128);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 30);
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((String[]) buf[6])[0] = rslt.getString(6, 1);
               ((String[]) buf[7])[0] = rslt.getString(7, 1);
               ((String[]) buf[8])[0] = rslt.getString(8, 1);
               ((String[]) buf[9])[0] = rslt.getString(9, 1);
               ((String[]) buf[10])[0] = rslt.getString(10, 1);
               ((short[]) buf[11])[0] = rslt.getShort(11);
               ((String[]) buf[12])[0] = rslt.getString(12, 3);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 13);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 27 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 40);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((String[]) buf[7])[0] = rslt.getString(8, 32);
               ((String[]) buf[8])[0] = rslt.getString(9, 40);
               ((String[]) buf[9])[0] = rslt.getString(10, 40);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(11);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(12, 1);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(13, 30);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(14, 30);
               ((String[]) buf[18])[0] = rslt.getString(15, 30);
               ((String[]) buf[19])[0] = rslt.getVarchar(16);
               ((String[]) buf[20])[0] = rslt.getString(17, 3);
               ((String[]) buf[21])[0] = rslt.getString(18, 10);
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((short[]) buf[2])[0] = rslt.getShort(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 33 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((short[]) buf[2])[0] = rslt.getShort(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               return;
            case 34 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 13);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((short[]) buf[10])[0] = rslt.getShort(11);
               return;
            case 35 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 36 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               return;
            case 37 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 38 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((String[]) buf[5])[0] = rslt.getString(6, 40);
               return;
            case 39 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 43 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 44 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((String[]) buf[7])[0] = rslt.getString(8, 120);
               ((String[]) buf[8])[0] = rslt.getVarchar(9);
               ((String[]) buf[9])[0] = rslt.getVarchar(10);
               ((byte[]) buf[10])[0] = rslt.getByte(11);
               return;
            case 45 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 49 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 50 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 35);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 51 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 52 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 35);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
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
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 15 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 128);
               stmt.setString(3, (String)parms[2], 30);
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 1);
               stmt.setString(7, (String)parms[6], 1);
               stmt.setString(8, (String)parms[7], 1);
               stmt.setString(9, (String)parms[8], 1);
               stmt.setShort(10, ((Number) parms[9]).shortValue());
               stmt.setString(11, (String)parms[10], 3);
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 128);
               stmt.setString(2, (String)parms[1], 30);
               stmt.setString(3, (String)parms[2], 1);
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 1);
               stmt.setString(7, (String)parms[6], 1);
               stmt.setString(8, (String)parms[7], 1);
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               stmt.setString(10, (String)parms[9], 3);
               stmt.setInt(11, ((Number) parms[10]).intValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 25 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 28 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               return;
            case 29 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
      }
      setparameters30( cursor, stmt, parms) ;
   }

   public void setparameters30( int cursor ,
                                IFieldSetter stmt ,
                                Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 30 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 40);
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 1);
               stmt.setString(7, (String)parms[6], 30);
               stmt.setString(8, (String)parms[7], 32);
               stmt.setString(9, (String)parms[8], 40);
               stmt.setString(10, (String)parms[9], 30);
               stmt.setString(11, (String)parms[10], 30);
               stmt.setVarchar(12, (String)parms[11], 2048, false);
               stmt.setString(13, (String)parms[12], 3);
               stmt.setString(14, (String)parms[13], 10);
               return;
            case 31 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 40);
               stmt.setString(3, (String)parms[2], 1);
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 30);
               stmt.setString(6, (String)parms[5], 32);
               stmt.setString(7, (String)parms[6], 40);
               stmt.setString(8, (String)parms[7], 30);
               stmt.setString(9, (String)parms[8], 30);
               stmt.setVarchar(10, (String)parms[9], 2048, false);
               stmt.setString(11, (String)parms[10], 10);
               stmt.setString(12, (String)parms[11], 3);
               stmt.setInt(13, ((Number) parms[12]).intValue());
               stmt.setShort(14, ((Number) parms[13]).shortValue());
               return;
            case 32 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 33 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               return;
            case 34 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 35 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 36 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 37 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 38 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 39 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 40 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 30);
               stmt.setString(6, (String)parms[5], 40);
               return;
            case 41 :
               stmt.setString(1, (String)parms[0], 30);
               stmt.setString(2, (String)parms[1], 40);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 42 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 43 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 44 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 45 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 46 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 1);
               stmt.setString(7, (String)parms[6], 8);
               stmt.setString(8, (String)parms[7], 120);
               stmt.setVarchar(9, (String)parms[8], 200, false);
               stmt.setVarchar(10, (String)parms[9], 2000, false);
               stmt.setByte(11, ((Number) parms[10]).byteValue());
               return;
            case 47 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 1);
               stmt.setString(3, (String)parms[2], 1);
               stmt.setString(4, (String)parms[3], 8);
               stmt.setString(5, (String)parms[4], 120);
               stmt.setVarchar(6, (String)parms[5], 200, false);
               stmt.setVarchar(7, (String)parms[6], 2000, false);
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               stmt.setString(9, (String)parms[8], 3);
               stmt.setInt(10, ((Number) parms[9]).intValue());
               stmt.setShort(11, ((Number) parms[10]).shortValue());
               return;
            case 48 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 49 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 51 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

