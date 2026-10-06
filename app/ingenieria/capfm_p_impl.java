package app.ingenieria ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class capfm_p_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel1"+"_"+"FASDSCM") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A9836FasCodM = httpContext.GetPar( "FasCodM") ;
         httpContext.ajax_rsp_assign_attri("", false, "A9836FasCodM", A9836FasCodM);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx1asafasdscm1TC1294( A396EmprCod, A9836FasCodM) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel2"+"_"+"MAQDSCD") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A9830MaqCodC = httpContext.GetPar( "MaqCodC") ;
         httpContext.ajax_rsp_assign_attri("", false, "A9830MaqCodC", A9830MaqCodC);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx2asamaqdscd1TC1294( A396EmprCod, A9830MaqCodC) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_27") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_27( A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_28") == 0 )
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
         gxload_28( A396EmprCod, A252CliCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_29") == 0 )
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
         gxload_29( A396EmprCod, A252CliCod, A65ArtCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_30") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A758ProCod = httpContext.GetPar( "ProCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_30( A396EmprCod, A758ProCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_31") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A65ArtCod = httpContext.GetPar( "ArtCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
         A758ProCod = httpContext.GetPar( "ProCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
         A9836FasCodM = httpContext.GetPar( "FasCodM") ;
         httpContext.ajax_rsp_assign_attri("", false, "A9836FasCodM", A9836FasCodM);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_31( A396EmprCod, A252CliCod, A65ArtCod, A758ProCod, A9836FasCodM) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_33") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A1664ParFasCod = (short)(GXutil.lval( httpContext.GetPar( "ParFasCod"))) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_33( A396EmprCod, A1664ParFasCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_35") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A13203ParUndID = (short)(GXutil.lval( httpContext.GetPar( "ParUndID"))) ;
         n13203ParUndID = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13203ParUndID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13203ParUndID), 4, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_35( A396EmprCod, A13203ParUndID) ;
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Gridlevel_parametros") == 0 )
      {
         gxnrgridlevel_parametros_newrow_invoke( ) ;
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
            AV7EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
            AV8CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8CliCod), 6, 0));
            AV9ArtCod = httpContext.GetPar( "ArtCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9ArtCod", AV9ArtCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vARTCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV9ArtCod, ""))));
            AV10ProCod = httpContext.GetPar( "ProCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10ProCod", AV10ProCod);
            AV11FasCodM = httpContext.GetPar( "FasCodM") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV11FasCodM", AV11FasCodM);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFASCODM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV11FasCodM, ""))));
            AV12MaqCodC = httpContext.GetPar( "MaqCodC") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12MaqCodC", AV12MaqCodC);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCODC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV12MaqCodC, ""))));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Parámetros Fases-Máquinas", ""), (short)(0)) ;
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

   public void gxnrgridlevel_parametros_newrow_invoke( )
   {
      nRC_GXsfl_80 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_80"))) ;
      nGXsfl_80_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_80_idx"))) ;
      sGXsfl_80_idx = httpContext.GetPar( "sGXsfl_80_idx") ;
      edtParFasCod_Horizontalalignment = httpContext.GetNextPar( ) ;
      httpContext.ajax_rsp_assign_prop("", false, edtParFasCod_Internalname, "Horizontalalignment", edtParFasCod_Horizontalalignment, !bGXsfl_80_Refreshing);
      A396EmprCod = httpContext.GetPar( "EmprCod") ;
      Gx_mode = httpContext.GetPar( "Mode") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgridlevel_parametros_newrow( ) ;
      /* End function gxnrGridlevel_parametros_newrow_invoke */
   }

   public capfm_p_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public capfm_p_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( capfm_p_impl.class ));
   }

   public capfm_p_impl( int remoteHandle ,
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCellFL RequiredDataContentCellFL ExtendedComboCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTablesplittedclicod_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockclicod_Internalname, httpContext.getMessage( "Nombre Cliente", ""), "", "", lblTextblockclicod_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_Ingenieria\\CAPFM_P.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* User Defined Control */
      ucCombo_clicod.setProperty("Caption", Combo_clicod_Caption);
      ucCombo_clicod.setProperty("Cls", Combo_clicod_Cls);
      ucCombo_clicod.setProperty("EmptyItemText", Combo_clicod_Emptyitemtext);
      ucCombo_clicod.setProperty("DropDownOptionsTitleSettingsIcons", AV17DDO_TitleSettingsIcons);
      ucCombo_clicod.setProperty("DropDownOptionsData", AV16CliCod_Data);
      ucCombo_clicod.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_clicod_Internalname, "COMBO_CLICODContainer");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 Invisible", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCliCod_Internalname, httpContext.getMessage( "Cliente", ""), "col-sm-3 AttributeLabel", 0, true, "");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 28,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,28);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "Attribute", "", "", "", "", edtCliCod_Visible, edtCliCod_Enabled, 1, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Ingenieria\\CAPFM_P.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCellFL RequiredDataContentCellFL ExtendedComboCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTablesplittedartcod_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockartcod_Internalname, httpContext.getMessage( "Artículo", ""), "", "", lblTextblockartcod_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_Ingenieria\\CAPFM_P.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* User Defined Control */
      ucCombo_artcod.setProperty("Caption", Combo_artcod_Caption);
      ucCombo_artcod.setProperty("Cls", Combo_artcod_Cls);
      ucCombo_artcod.setProperty("EmptyItemText", Combo_artcod_Emptyitemtext);
      ucCombo_artcod.setProperty("DropDownOptionsTitleSettingsIcons", AV17DDO_TitleSettingsIcons);
      ucCombo_artcod.setProperty("DropDownOptionsData", AV20ArtCod_Data);
      ucCombo_artcod.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_artcod_Internalname, "COMBO_ARTCODContainer");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 Invisible", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtArtCod_Internalname, httpContext.getMessage( "Código Artículo", ""), "col-sm-3 AttributeLabel", 0, true, "");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtCod_Internalname, GXutil.rtrim( A65ArtCod), GXutil.rtrim( localUtil.format( A65ArtCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,39);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtCod_Jsonclick, 0, "Attribute", "", "", "", "", edtArtCod_Visible, edtArtCod_Enabled, 1, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Ingenieria\\CAPFM_P.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCellFL RequiredDataContentCellFL ExtendedComboCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTablesplittedprocod_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockprocod_Internalname, httpContext.getMessage( "Proceso", ""), "", "", lblTextblockprocod_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_Ingenieria\\CAPFM_P.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* User Defined Control */
      ucCombo_procod.setProperty("Caption", Combo_procod_Caption);
      ucCombo_procod.setProperty("Cls", Combo_procod_Cls);
      ucCombo_procod.setProperty("EmptyItemText", Combo_procod_Emptyitemtext);
      ucCombo_procod.setProperty("DropDownOptionsTitleSettingsIcons", AV17DDO_TitleSettingsIcons);
      ucCombo_procod.setProperty("DropDownOptionsData", AV22ProCod_Data);
      ucCombo_procod.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_procod_Internalname, "COMBO_PROCODContainer");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 Invisible", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtProCod_Internalname, httpContext.getMessage( "Codigo Proceso", ""), "col-sm-3 AttributeLabel", 0, true, "");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 50,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtProCod_Internalname, GXutil.rtrim( A758ProCod), GXutil.rtrim( localUtil.format( A758ProCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,50);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProCod_Jsonclick, 0, "Attribute", "", "", "", "", edtProCod_Visible, edtProCod_Enabled, 1, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Ingenieria\\CAPFM_P.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCellFL RequiredDataContentCellFL ExtendedComboCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTablesplittedfascodm_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockfascodm_Internalname, httpContext.getMessage( "Fase", ""), "", "", lblTextblockfascodm_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_Ingenieria\\CAPFM_P.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* User Defined Control */
      ucCombo_fascodm.setProperty("Caption", Combo_fascodm_Caption);
      ucCombo_fascodm.setProperty("Cls", Combo_fascodm_Cls);
      ucCombo_fascodm.setProperty("EmptyItemText", Combo_fascodm_Emptyitemtext);
      ucCombo_fascodm.setProperty("DropDownOptionsTitleSettingsIcons", AV17DDO_TitleSettingsIcons);
      ucCombo_fascodm.setProperty("DropDownOptionsData", AV24FasCodM_Data);
      ucCombo_fascodm.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_fascodm_Internalname, "COMBO_FASCODMContainer");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 Invisible", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtFasCodM_Internalname, httpContext.getMessage( "Código Fase", ""), "col-sm-3 AttributeLabel", 0, true, "");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFasCodM_Internalname, GXutil.rtrim( A9836FasCodM), GXutil.rtrim( localUtil.format( A9836FasCodM, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFasCodM_Jsonclick, 0, "Attribute", "", "", "", "", edtFasCodM_Visible, edtFasCodM_Enabled, 1, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Ingenieria\\CAPFM_P.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCellFL RequiredDataContentCellFL ExtendedComboCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTablesplittedmaqcodc_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockmaqcodc_Internalname, httpContext.getMessage( "Máquina", ""), "", "", lblTextblockmaqcodc_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_Ingenieria\\CAPFM_P.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* User Defined Control */
      ucCombo_maqcodc.setProperty("Caption", Combo_maqcodc_Caption);
      ucCombo_maqcodc.setProperty("Cls", Combo_maqcodc_Cls);
      ucCombo_maqcodc.setProperty("EmptyItemText", Combo_maqcodc_Emptyitemtext);
      ucCombo_maqcodc.setProperty("DropDownOptionsTitleSettingsIcons", AV17DDO_TitleSettingsIcons);
      ucCombo_maqcodc.setProperty("DropDownOptionsData", AV26MaqCodC_Data);
      ucCombo_maqcodc.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_maqcodc_Internalname, "COMBO_MAQCODCContainer");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 Invisible", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMaqCodC_Internalname, httpContext.getMessage( "Maquina", ""), "col-sm-3 AttributeLabel", 0, true, "");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 72,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMaqCodC_Internalname, GXutil.rtrim( A9830MaqCodC), GXutil.rtrim( localUtil.format( A9830MaqCodC, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,72);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqCodC_Jsonclick, 0, "Attribute", "", "", "", "", edtMaqCodC_Visible, edtMaqCodC_Enabled, 1, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Ingenieria\\CAPFM_P.htm");
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
      ucDvpanel_tableleaflevel_parametros.setProperty("Width", Dvpanel_tableleaflevel_parametros_Width);
      ucDvpanel_tableleaflevel_parametros.setProperty("AutoWidth", Dvpanel_tableleaflevel_parametros_Autowidth);
      ucDvpanel_tableleaflevel_parametros.setProperty("AutoHeight", Dvpanel_tableleaflevel_parametros_Autoheight);
      ucDvpanel_tableleaflevel_parametros.setProperty("Cls", Dvpanel_tableleaflevel_parametros_Cls);
      ucDvpanel_tableleaflevel_parametros.setProperty("Title", Dvpanel_tableleaflevel_parametros_Title);
      ucDvpanel_tableleaflevel_parametros.setProperty("Collapsible", Dvpanel_tableleaflevel_parametros_Collapsible);
      ucDvpanel_tableleaflevel_parametros.setProperty("Collapsed", Dvpanel_tableleaflevel_parametros_Collapsed);
      ucDvpanel_tableleaflevel_parametros.setProperty("ShowCollapseIcon", Dvpanel_tableleaflevel_parametros_Showcollapseicon);
      ucDvpanel_tableleaflevel_parametros.setProperty("IconPosition", Dvpanel_tableleaflevel_parametros_Iconposition);
      ucDvpanel_tableleaflevel_parametros.setProperty("AutoScroll", Dvpanel_tableleaflevel_parametros_Autoscroll);
      ucDvpanel_tableleaflevel_parametros.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_tableleaflevel_parametros_Internalname, "DVPANEL_TABLELEAFLEVEL_PARAMETROSContainer");
      httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_TABLELEAFLEVEL_PARAMETROSContainer"+"TableLeafLevel_Parametros"+"\" style=\"display:none;\">") ;
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTableleaflevel_parametros_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 SectionGrid EditableGridCell_LinedAtts", "left", "top", "", "", "div");
      gxdraw_gridlevel_parametros( ) ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 92,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Ingenieria\\CAPFM_P.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 94,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Ingenieria\\CAPFM_P.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 96,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Ingenieria\\CAPFM_P.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV34Pgmname), GXutil.rtrim( localUtil.format( AV34Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Ingenieria\\CAPFM_P.htm");
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
      app.GxWebStd.gx_div_start( httpContext, divSectionattribute_clicod_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavComboclicod_Internalname, GXutil.ltrim( localUtil.ntoc( AV19ComboCliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavComboclicod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV19ComboCliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV19ComboCliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavComboclicod_Jsonclick, 0, "Attribute", "", "", "", "", edtavComboclicod_Visible, edtavComboclicod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Ingenieria\\CAPFM_P.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divSectionattribute_artcod_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavComboartcod_Internalname, GXutil.rtrim( AV21ComboArtCod), GXutil.rtrim( localUtil.format( AV21ComboArtCod, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavComboartcod_Jsonclick, 0, "Attribute", "", "", "", "", edtavComboartcod_Visible, edtavComboartcod_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Ingenieria\\CAPFM_P.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divSectionattribute_procod_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavComboprocod_Internalname, GXutil.rtrim( AV23ComboProCod), GXutil.rtrim( localUtil.format( AV23ComboProCod, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavComboprocod_Jsonclick, 0, "Attribute", "", "", "", "", edtavComboprocod_Visible, edtavComboprocod_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Ingenieria\\CAPFM_P.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divSectionattribute_fascodm_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavCombofascodm_Internalname, GXutil.rtrim( AV25ComboFasCodM), GXutil.rtrim( localUtil.format( AV25ComboFasCodM, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCombofascodm_Jsonclick, 0, "Attribute", "", "", "", "", edtavCombofascodm_Visible, edtavCombofascodm_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Ingenieria\\CAPFM_P.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divSectionattribute_maqcodc_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavCombomaqcodc_Internalname, GXutil.rtrim( AV27ComboMaqCodC), GXutil.rtrim( localUtil.format( AV27ComboMaqCodC, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCombomaqcodc_Jsonclick, 0, "Attribute", "", "", "", "", edtavCombomaqcodc_Visible, edtavCombomaqcodc_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Ingenieria\\CAPFM_P.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* User Defined Control */
      ucCombo_parfascod.setProperty("Caption", Combo_parfascod_Caption);
      ucCombo_parfascod.setProperty("Cls", Combo_parfascod_Cls);
      ucCombo_parfascod.setProperty("IsGridItem", Combo_parfascod_Isgriditem);
      ucCombo_parfascod.setProperty("EmptyItem", Combo_parfascod_Emptyitem);
      ucCombo_parfascod.setProperty("DropDownOptionsTitleSettingsIcons", AV17DDO_TitleSettingsIcons);
      ucCombo_parfascod.setProperty("DropDownOptionsData", AV28ParFasCod_Data);
      ucCombo_parfascod.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_parfascod_Internalname, "COMBO_PARFASCODContainer");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", edtEmprCod_Visible, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Ingenieria\\CAPFM_P.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
   }

   public void gxdraw_gridlevel_parametros( )
   {
      /*  Grid Control  */
      startgridcontrol80( ) ;
      nGXsfl_80_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1295 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1295 = (short)(1) ;
            scanStart1TC1295( ) ;
            while ( RcdFound1295 != 0 )
            {
               init_level_properties1295( ) ;
               getByPrimaryKey1TC1295( ) ;
               addRow1TC1295( ) ;
               scanNext1TC1295( ) ;
            }
            scanEnd1TC1295( ) ;
            nBlankRcdCount1295 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal1TC1295( ) ;
         standaloneModal1TC1295( ) ;
         sMode1295 = Gx_mode ;
         while ( nGXsfl_80_idx < nRC_GXsfl_80 )
         {
            bGXsfl_80_Refreshing = true ;
            readRow1TC1295( ) ;
            edtParFasCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PARFASCOD_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtParFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParFasCod_Enabled), 5, 0), !bGXsfl_80_Refreshing);
            edtParFasCod_Horizontalalignment = httpContext.cgiGet( "PARFASCOD_"+sGXsfl_80_idx+"Horizontalalignment") ;
            httpContext.ajax_rsp_assign_prop("", false, edtParFasCod_Internalname, "Horizontalalignment", edtParFasCod_Horizontalalignment, !bGXsfl_80_Refreshing);
            edtParFasPLC_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PARFASPLC_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtParFasPLC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParFasPLC_Enabled), 5, 0), !bGXsfl_80_Refreshing);
            edtParFasDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PARFASDSC_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtParFasDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParFasDsc_Enabled), 5, 0), !bGXsfl_80_Refreshing);
            edtParFMVal2_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PARFMVAL2_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtParFMVal2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParFMVal2_Enabled), 5, 0), !bGXsfl_80_Refreshing);
            edtParFMVMin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PARFMVMIN_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtParFMVMin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParFMVMin_Enabled), 5, 0), !bGXsfl_80_Refreshing);
            edtParFMVMax_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PARFMVMAX_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtParFMVMax_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParFMVMax_Enabled), 5, 0), !bGXsfl_80_Refreshing);
            edtParFMObs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PARFMOBS_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtParFMObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParFMObs_Enabled), 5, 0), !bGXsfl_80_Refreshing);
            imgprompt_1664_Link = httpContext.cgiGet( "PROMPT_1664_"+sGXsfl_80_idx+"Link") ;
            if ( ( nRcdExists_1295 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1TC1295( ) ;
            }
            sendRow1TC1295( ) ;
            bGXsfl_80_Refreshing = false ;
         }
         Gx_mode = sMode1295 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1295 = (short)(5) ;
         nRcdExists_1295 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1TC1295( ) ;
            while ( RcdFound1295 != 0 )
            {
               sGXsfl_80_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_80_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_801295( ) ;
               init_level_properties1295( ) ;
               standaloneNotModal1TC1295( ) ;
               getByPrimaryKey1TC1295( ) ;
               standaloneModal1TC1295( ) ;
               addRow1TC1295( ) ;
               scanNext1TC1295( ) ;
            }
            scanEnd1TC1295( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      if ( ! isDsp( ) && ! isDlt( ) )
      {
         sMode1295 = Gx_mode ;
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         sGXsfl_80_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_80_idx+1), 4, 0), (short)(4), "0") ;
         subsflControlProps_801295( ) ;
         initAll1TC1295( ) ;
         init_level_properties1295( ) ;
         nRcdExists_1295 = (short)(0) ;
         nIsMod_1295 = (short)(0) ;
         nRcdDeleted_1295 = (short)(0) ;
         nBlankRcdCount1295 = (short)(nBlankRcdUsr1295+nBlankRcdCount1295) ;
         fRowAdded = 0 ;
         while ( nBlankRcdCount1295 > 0 )
         {
            standaloneNotModal1TC1295( ) ;
            standaloneModal1TC1295( ) ;
            addRow1TC1295( ) ;
            if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
            {
               fRowAdded = 1 ;
               GX_FocusControl = edtParFasCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            nBlankRcdCount1295 = (short)(nBlankRcdCount1295-1) ;
         }
         Gx_mode = sMode1295 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      sStyleString = "" ;
      httpContext.writeText( "<div id=\""+"Gridlevel_parametrosContainer"+"Div\" "+sStyleString+">"+"</div>") ;
      httpContext.ajax_rsp_assign_grid("_"+"Gridlevel_parametros", Gridlevel_parametrosContainer, subGridlevel_parametros_Internalname);
      if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridlevel_parametrosContainerData", Gridlevel_parametrosContainer.ToJavascriptSource());
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridlevel_parametrosContainerData"+"V", Gridlevel_parametrosContainer.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Gridlevel_parametrosContainerData"+"V"+"\" value='"+Gridlevel_parametrosContainer.GridValuesHidden()+"'/>") ;
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
      e111TC2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV17DDO_TitleSettingsIcons);
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCLICOD_DATA"), AV16CliCod_Data);
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vARTCOD_DATA"), AV20ArtCod_Data);
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vPROCOD_DATA"), AV22ProCod_Data);
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vFASCODM_DATA"), AV24FasCodM_Data);
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vMAQCODC_DATA"), AV26MaqCodC_Data);
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vPARFASCOD_DATA"), AV28ParFasCod_Data);
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z252CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z65ArtCod = httpContext.cgiGet( "Z65ArtCod") ;
            Z758ProCod = httpContext.cgiGet( "Z758ProCod") ;
            Z9836FasCodM = httpContext.cgiGet( "Z9836FasCodM") ;
            Z9830MaqCodC = httpContext.cgiGet( "Z9830MaqCodC") ;
            Z9869MaqAncC = (short)(localUtil.ctol( httpContext.cgiGet( "Z9869MaqAncC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A9869MaqAncC = (short)(localUtil.ctol( httpContext.cgiGet( "Z9869MaqAncC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_80 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_80"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A9837FasDscM = httpContext.cgiGet( "FASDSCM") ;
            A9831MaqDscD = httpContext.cgiGet( "MAQDSCD") ;
            AV7EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            AV8CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "vCLICOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV9ArtCod = httpContext.cgiGet( "vARTCOD") ;
            AV10ProCod = httpContext.cgiGet( "vPROCOD") ;
            AV11FasCodM = httpContext.cgiGet( "vFASCODM") ;
            AV12MaqCodC = httpContext.cgiGet( "vMAQCODC") ;
            A9869MaqAncC = (short)(localUtil.ctol( httpContext.cgiGet( "MAQANCC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A407EmprNom = httpContext.cgiGet( "EMPRNOM") ;
            n407EmprNom = false ;
            A279CliNom = httpContext.cgiGet( "CLINOM") ;
            A69ArtDsc = httpContext.cgiGet( "ARTDSC") ;
            n69ArtDsc = false ;
            A759ProDsc = httpContext.cgiGet( "PRODSC") ;
            A9828ParFMVal = httpContext.cgiGet( "PARFMVAL") ;
            A10256Itm_ord2 = (short)(localUtil.ctol( httpContext.cgiGet( "ITM_ORD2"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A12448ParEspIdS = (short)(localUtil.ctol( httpContext.cgiGet( "PARESPIDS"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n12448ParEspIdS = false ;
            A13203ParUndID = (short)(localUtil.ctol( httpContext.cgiGet( "PARUNDID"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A12449ParEspDcS = httpContext.cgiGet( "PARESPDCS") ;
            n12449ParEspDcS = false ;
            A13204ParUndDsc = httpContext.cgiGet( "PARUNDDSC") ;
            n13204ParUndDsc = false ;
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
            Combo_procod_Objectcall = httpContext.cgiGet( "COMBO_PROCOD_Objectcall") ;
            Combo_procod_Class = httpContext.cgiGet( "COMBO_PROCOD_Class") ;
            Combo_procod_Icontype = httpContext.cgiGet( "COMBO_PROCOD_Icontype") ;
            Combo_procod_Icon = httpContext.cgiGet( "COMBO_PROCOD_Icon") ;
            Combo_procod_Caption = httpContext.cgiGet( "COMBO_PROCOD_Caption") ;
            Combo_procod_Tooltip = httpContext.cgiGet( "COMBO_PROCOD_Tooltip") ;
            Combo_procod_Cls = httpContext.cgiGet( "COMBO_PROCOD_Cls") ;
            Combo_procod_Selectedvalue_set = httpContext.cgiGet( "COMBO_PROCOD_Selectedvalue_set") ;
            Combo_procod_Selectedvalue_get = httpContext.cgiGet( "COMBO_PROCOD_Selectedvalue_get") ;
            Combo_procod_Selectedtext_set = httpContext.cgiGet( "COMBO_PROCOD_Selectedtext_set") ;
            Combo_procod_Selectedtext_get = httpContext.cgiGet( "COMBO_PROCOD_Selectedtext_get") ;
            Combo_procod_Gamoauthtoken = httpContext.cgiGet( "COMBO_PROCOD_Gamoauthtoken") ;
            Combo_procod_Ddointernalname = httpContext.cgiGet( "COMBO_PROCOD_Ddointernalname") ;
            Combo_procod_Titlecontrolalign = httpContext.cgiGet( "COMBO_PROCOD_Titlecontrolalign") ;
            Combo_procod_Dropdownoptionstype = httpContext.cgiGet( "COMBO_PROCOD_Dropdownoptionstype") ;
            Combo_procod_Enabled = GXutil.strtobool( httpContext.cgiGet( "COMBO_PROCOD_Enabled")) ;
            Combo_procod_Visible = GXutil.strtobool( httpContext.cgiGet( "COMBO_PROCOD_Visible")) ;
            Combo_procod_Titlecontrolidtoreplace = httpContext.cgiGet( "COMBO_PROCOD_Titlecontrolidtoreplace") ;
            Combo_procod_Datalisttype = httpContext.cgiGet( "COMBO_PROCOD_Datalisttype") ;
            Combo_procod_Allowmultipleselection = GXutil.strtobool( httpContext.cgiGet( "COMBO_PROCOD_Allowmultipleselection")) ;
            Combo_procod_Datalistfixedvalues = httpContext.cgiGet( "COMBO_PROCOD_Datalistfixedvalues") ;
            Combo_procod_Isgriditem = GXutil.strtobool( httpContext.cgiGet( "COMBO_PROCOD_Isgriditem")) ;
            Combo_procod_Hasdescription = GXutil.strtobool( httpContext.cgiGet( "COMBO_PROCOD_Hasdescription")) ;
            Combo_procod_Datalistproc = httpContext.cgiGet( "COMBO_PROCOD_Datalistproc") ;
            Combo_procod_Datalistprocparametersprefix = httpContext.cgiGet( "COMBO_PROCOD_Datalistprocparametersprefix") ;
            Combo_procod_Remoteservicesparameters = httpContext.cgiGet( "COMBO_PROCOD_Remoteservicesparameters") ;
            Combo_procod_Datalistupdateminimumcharacters = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_PROCOD_Datalistupdateminimumcharacters"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_procod_Includeonlyselectedoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_PROCOD_Includeonlyselectedoption")) ;
            Combo_procod_Includeselectalloption = GXutil.strtobool( httpContext.cgiGet( "COMBO_PROCOD_Includeselectalloption")) ;
            Combo_procod_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_PROCOD_Emptyitem")) ;
            Combo_procod_Includeaddnewoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_PROCOD_Includeaddnewoption")) ;
            Combo_procod_Htmltemplate = httpContext.cgiGet( "COMBO_PROCOD_Htmltemplate") ;
            Combo_procod_Multiplevaluestype = httpContext.cgiGet( "COMBO_PROCOD_Multiplevaluestype") ;
            Combo_procod_Loadingdata = httpContext.cgiGet( "COMBO_PROCOD_Loadingdata") ;
            Combo_procod_Noresultsfound = httpContext.cgiGet( "COMBO_PROCOD_Noresultsfound") ;
            Combo_procod_Emptyitemtext = httpContext.cgiGet( "COMBO_PROCOD_Emptyitemtext") ;
            Combo_procod_Onlyselectedvalues = httpContext.cgiGet( "COMBO_PROCOD_Onlyselectedvalues") ;
            Combo_procod_Selectalltext = httpContext.cgiGet( "COMBO_PROCOD_Selectalltext") ;
            Combo_procod_Multiplevaluesseparator = httpContext.cgiGet( "COMBO_PROCOD_Multiplevaluesseparator") ;
            Combo_procod_Addnewoptiontext = httpContext.cgiGet( "COMBO_PROCOD_Addnewoptiontext") ;
            Combo_fascodm_Objectcall = httpContext.cgiGet( "COMBO_FASCODM_Objectcall") ;
            Combo_fascodm_Class = httpContext.cgiGet( "COMBO_FASCODM_Class") ;
            Combo_fascodm_Icontype = httpContext.cgiGet( "COMBO_FASCODM_Icontype") ;
            Combo_fascodm_Icon = httpContext.cgiGet( "COMBO_FASCODM_Icon") ;
            Combo_fascodm_Caption = httpContext.cgiGet( "COMBO_FASCODM_Caption") ;
            Combo_fascodm_Tooltip = httpContext.cgiGet( "COMBO_FASCODM_Tooltip") ;
            Combo_fascodm_Cls = httpContext.cgiGet( "COMBO_FASCODM_Cls") ;
            Combo_fascodm_Selectedvalue_set = httpContext.cgiGet( "COMBO_FASCODM_Selectedvalue_set") ;
            Combo_fascodm_Selectedvalue_get = httpContext.cgiGet( "COMBO_FASCODM_Selectedvalue_get") ;
            Combo_fascodm_Selectedtext_set = httpContext.cgiGet( "COMBO_FASCODM_Selectedtext_set") ;
            Combo_fascodm_Selectedtext_get = httpContext.cgiGet( "COMBO_FASCODM_Selectedtext_get") ;
            Combo_fascodm_Gamoauthtoken = httpContext.cgiGet( "COMBO_FASCODM_Gamoauthtoken") ;
            Combo_fascodm_Ddointernalname = httpContext.cgiGet( "COMBO_FASCODM_Ddointernalname") ;
            Combo_fascodm_Titlecontrolalign = httpContext.cgiGet( "COMBO_FASCODM_Titlecontrolalign") ;
            Combo_fascodm_Dropdownoptionstype = httpContext.cgiGet( "COMBO_FASCODM_Dropdownoptionstype") ;
            Combo_fascodm_Enabled = GXutil.strtobool( httpContext.cgiGet( "COMBO_FASCODM_Enabled")) ;
            Combo_fascodm_Visible = GXutil.strtobool( httpContext.cgiGet( "COMBO_FASCODM_Visible")) ;
            Combo_fascodm_Titlecontrolidtoreplace = httpContext.cgiGet( "COMBO_FASCODM_Titlecontrolidtoreplace") ;
            Combo_fascodm_Datalisttype = httpContext.cgiGet( "COMBO_FASCODM_Datalisttype") ;
            Combo_fascodm_Allowmultipleselection = GXutil.strtobool( httpContext.cgiGet( "COMBO_FASCODM_Allowmultipleselection")) ;
            Combo_fascodm_Datalistfixedvalues = httpContext.cgiGet( "COMBO_FASCODM_Datalistfixedvalues") ;
            Combo_fascodm_Isgriditem = GXutil.strtobool( httpContext.cgiGet( "COMBO_FASCODM_Isgriditem")) ;
            Combo_fascodm_Hasdescription = GXutil.strtobool( httpContext.cgiGet( "COMBO_FASCODM_Hasdescription")) ;
            Combo_fascodm_Datalistproc = httpContext.cgiGet( "COMBO_FASCODM_Datalistproc") ;
            Combo_fascodm_Datalistprocparametersprefix = httpContext.cgiGet( "COMBO_FASCODM_Datalistprocparametersprefix") ;
            Combo_fascodm_Remoteservicesparameters = httpContext.cgiGet( "COMBO_FASCODM_Remoteservicesparameters") ;
            Combo_fascodm_Datalistupdateminimumcharacters = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_FASCODM_Datalistupdateminimumcharacters"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_fascodm_Includeonlyselectedoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_FASCODM_Includeonlyselectedoption")) ;
            Combo_fascodm_Includeselectalloption = GXutil.strtobool( httpContext.cgiGet( "COMBO_FASCODM_Includeselectalloption")) ;
            Combo_fascodm_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_FASCODM_Emptyitem")) ;
            Combo_fascodm_Includeaddnewoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_FASCODM_Includeaddnewoption")) ;
            Combo_fascodm_Htmltemplate = httpContext.cgiGet( "COMBO_FASCODM_Htmltemplate") ;
            Combo_fascodm_Multiplevaluestype = httpContext.cgiGet( "COMBO_FASCODM_Multiplevaluestype") ;
            Combo_fascodm_Loadingdata = httpContext.cgiGet( "COMBO_FASCODM_Loadingdata") ;
            Combo_fascodm_Noresultsfound = httpContext.cgiGet( "COMBO_FASCODM_Noresultsfound") ;
            Combo_fascodm_Emptyitemtext = httpContext.cgiGet( "COMBO_FASCODM_Emptyitemtext") ;
            Combo_fascodm_Onlyselectedvalues = httpContext.cgiGet( "COMBO_FASCODM_Onlyselectedvalues") ;
            Combo_fascodm_Selectalltext = httpContext.cgiGet( "COMBO_FASCODM_Selectalltext") ;
            Combo_fascodm_Multiplevaluesseparator = httpContext.cgiGet( "COMBO_FASCODM_Multiplevaluesseparator") ;
            Combo_fascodm_Addnewoptiontext = httpContext.cgiGet( "COMBO_FASCODM_Addnewoptiontext") ;
            Combo_maqcodc_Objectcall = httpContext.cgiGet( "COMBO_MAQCODC_Objectcall") ;
            Combo_maqcodc_Class = httpContext.cgiGet( "COMBO_MAQCODC_Class") ;
            Combo_maqcodc_Icontype = httpContext.cgiGet( "COMBO_MAQCODC_Icontype") ;
            Combo_maqcodc_Icon = httpContext.cgiGet( "COMBO_MAQCODC_Icon") ;
            Combo_maqcodc_Caption = httpContext.cgiGet( "COMBO_MAQCODC_Caption") ;
            Combo_maqcodc_Tooltip = httpContext.cgiGet( "COMBO_MAQCODC_Tooltip") ;
            Combo_maqcodc_Cls = httpContext.cgiGet( "COMBO_MAQCODC_Cls") ;
            Combo_maqcodc_Selectedvalue_set = httpContext.cgiGet( "COMBO_MAQCODC_Selectedvalue_set") ;
            Combo_maqcodc_Selectedvalue_get = httpContext.cgiGet( "COMBO_MAQCODC_Selectedvalue_get") ;
            Combo_maqcodc_Selectedtext_set = httpContext.cgiGet( "COMBO_MAQCODC_Selectedtext_set") ;
            Combo_maqcodc_Selectedtext_get = httpContext.cgiGet( "COMBO_MAQCODC_Selectedtext_get") ;
            Combo_maqcodc_Gamoauthtoken = httpContext.cgiGet( "COMBO_MAQCODC_Gamoauthtoken") ;
            Combo_maqcodc_Ddointernalname = httpContext.cgiGet( "COMBO_MAQCODC_Ddointernalname") ;
            Combo_maqcodc_Titlecontrolalign = httpContext.cgiGet( "COMBO_MAQCODC_Titlecontrolalign") ;
            Combo_maqcodc_Dropdownoptionstype = httpContext.cgiGet( "COMBO_MAQCODC_Dropdownoptionstype") ;
            Combo_maqcodc_Enabled = GXutil.strtobool( httpContext.cgiGet( "COMBO_MAQCODC_Enabled")) ;
            Combo_maqcodc_Visible = GXutil.strtobool( httpContext.cgiGet( "COMBO_MAQCODC_Visible")) ;
            Combo_maqcodc_Titlecontrolidtoreplace = httpContext.cgiGet( "COMBO_MAQCODC_Titlecontrolidtoreplace") ;
            Combo_maqcodc_Datalisttype = httpContext.cgiGet( "COMBO_MAQCODC_Datalisttype") ;
            Combo_maqcodc_Allowmultipleselection = GXutil.strtobool( httpContext.cgiGet( "COMBO_MAQCODC_Allowmultipleselection")) ;
            Combo_maqcodc_Datalistfixedvalues = httpContext.cgiGet( "COMBO_MAQCODC_Datalistfixedvalues") ;
            Combo_maqcodc_Isgriditem = GXutil.strtobool( httpContext.cgiGet( "COMBO_MAQCODC_Isgriditem")) ;
            Combo_maqcodc_Hasdescription = GXutil.strtobool( httpContext.cgiGet( "COMBO_MAQCODC_Hasdescription")) ;
            Combo_maqcodc_Datalistproc = httpContext.cgiGet( "COMBO_MAQCODC_Datalistproc") ;
            Combo_maqcodc_Datalistprocparametersprefix = httpContext.cgiGet( "COMBO_MAQCODC_Datalistprocparametersprefix") ;
            Combo_maqcodc_Remoteservicesparameters = httpContext.cgiGet( "COMBO_MAQCODC_Remoteservicesparameters") ;
            Combo_maqcodc_Datalistupdateminimumcharacters = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_MAQCODC_Datalistupdateminimumcharacters"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_maqcodc_Includeonlyselectedoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_MAQCODC_Includeonlyselectedoption")) ;
            Combo_maqcodc_Includeselectalloption = GXutil.strtobool( httpContext.cgiGet( "COMBO_MAQCODC_Includeselectalloption")) ;
            Combo_maqcodc_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_MAQCODC_Emptyitem")) ;
            Combo_maqcodc_Includeaddnewoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_MAQCODC_Includeaddnewoption")) ;
            Combo_maqcodc_Htmltemplate = httpContext.cgiGet( "COMBO_MAQCODC_Htmltemplate") ;
            Combo_maqcodc_Multiplevaluestype = httpContext.cgiGet( "COMBO_MAQCODC_Multiplevaluestype") ;
            Combo_maqcodc_Loadingdata = httpContext.cgiGet( "COMBO_MAQCODC_Loadingdata") ;
            Combo_maqcodc_Noresultsfound = httpContext.cgiGet( "COMBO_MAQCODC_Noresultsfound") ;
            Combo_maqcodc_Emptyitemtext = httpContext.cgiGet( "COMBO_MAQCODC_Emptyitemtext") ;
            Combo_maqcodc_Onlyselectedvalues = httpContext.cgiGet( "COMBO_MAQCODC_Onlyselectedvalues") ;
            Combo_maqcodc_Selectalltext = httpContext.cgiGet( "COMBO_MAQCODC_Selectalltext") ;
            Combo_maqcodc_Multiplevaluesseparator = httpContext.cgiGet( "COMBO_MAQCODC_Multiplevaluesseparator") ;
            Combo_maqcodc_Addnewoptiontext = httpContext.cgiGet( "COMBO_MAQCODC_Addnewoptiontext") ;
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
            Dvpanel_tableleaflevel_parametros_Objectcall = httpContext.cgiGet( "DVPANEL_TABLELEAFLEVEL_PARAMETROS_Objectcall") ;
            Dvpanel_tableleaflevel_parametros_Class = httpContext.cgiGet( "DVPANEL_TABLELEAFLEVEL_PARAMETROS_Class") ;
            Dvpanel_tableleaflevel_parametros_Enabled = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLELEAFLEVEL_PARAMETROS_Enabled")) ;
            Dvpanel_tableleaflevel_parametros_Width = httpContext.cgiGet( "DVPANEL_TABLELEAFLEVEL_PARAMETROS_Width") ;
            Dvpanel_tableleaflevel_parametros_Height = httpContext.cgiGet( "DVPANEL_TABLELEAFLEVEL_PARAMETROS_Height") ;
            Dvpanel_tableleaflevel_parametros_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLELEAFLEVEL_PARAMETROS_Autowidth")) ;
            Dvpanel_tableleaflevel_parametros_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLELEAFLEVEL_PARAMETROS_Autoheight")) ;
            Dvpanel_tableleaflevel_parametros_Cls = httpContext.cgiGet( "DVPANEL_TABLELEAFLEVEL_PARAMETROS_Cls") ;
            Dvpanel_tableleaflevel_parametros_Showheader = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLELEAFLEVEL_PARAMETROS_Showheader")) ;
            Dvpanel_tableleaflevel_parametros_Title = httpContext.cgiGet( "DVPANEL_TABLELEAFLEVEL_PARAMETROS_Title") ;
            Dvpanel_tableleaflevel_parametros_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLELEAFLEVEL_PARAMETROS_Collapsible")) ;
            Dvpanel_tableleaflevel_parametros_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLELEAFLEVEL_PARAMETROS_Collapsed")) ;
            Dvpanel_tableleaflevel_parametros_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLELEAFLEVEL_PARAMETROS_Showcollapseicon")) ;
            Dvpanel_tableleaflevel_parametros_Iconposition = httpContext.cgiGet( "DVPANEL_TABLELEAFLEVEL_PARAMETROS_Iconposition") ;
            Dvpanel_tableleaflevel_parametros_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLELEAFLEVEL_PARAMETROS_Autoscroll")) ;
            Dvpanel_tableleaflevel_parametros_Visible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLELEAFLEVEL_PARAMETROS_Visible")) ;
            Combo_parfascod_Objectcall = httpContext.cgiGet( "COMBO_PARFASCOD_Objectcall") ;
            Combo_parfascod_Class = httpContext.cgiGet( "COMBO_PARFASCOD_Class") ;
            Combo_parfascod_Icontype = httpContext.cgiGet( "COMBO_PARFASCOD_Icontype") ;
            Combo_parfascod_Icon = httpContext.cgiGet( "COMBO_PARFASCOD_Icon") ;
            Combo_parfascod_Caption = httpContext.cgiGet( "COMBO_PARFASCOD_Caption") ;
            Combo_parfascod_Tooltip = httpContext.cgiGet( "COMBO_PARFASCOD_Tooltip") ;
            Combo_parfascod_Cls = httpContext.cgiGet( "COMBO_PARFASCOD_Cls") ;
            Combo_parfascod_Selectedvalue_set = httpContext.cgiGet( "COMBO_PARFASCOD_Selectedvalue_set") ;
            Combo_parfascod_Selectedvalue_get = httpContext.cgiGet( "COMBO_PARFASCOD_Selectedvalue_get") ;
            Combo_parfascod_Selectedtext_set = httpContext.cgiGet( "COMBO_PARFASCOD_Selectedtext_set") ;
            Combo_parfascod_Selectedtext_get = httpContext.cgiGet( "COMBO_PARFASCOD_Selectedtext_get") ;
            Combo_parfascod_Gamoauthtoken = httpContext.cgiGet( "COMBO_PARFASCOD_Gamoauthtoken") ;
            Combo_parfascod_Ddointernalname = httpContext.cgiGet( "COMBO_PARFASCOD_Ddointernalname") ;
            Combo_parfascod_Titlecontrolalign = httpContext.cgiGet( "COMBO_PARFASCOD_Titlecontrolalign") ;
            Combo_parfascod_Dropdownoptionstype = httpContext.cgiGet( "COMBO_PARFASCOD_Dropdownoptionstype") ;
            Combo_parfascod_Enabled = GXutil.strtobool( httpContext.cgiGet( "COMBO_PARFASCOD_Enabled")) ;
            Combo_parfascod_Visible = GXutil.strtobool( httpContext.cgiGet( "COMBO_PARFASCOD_Visible")) ;
            Combo_parfascod_Titlecontrolidtoreplace = httpContext.cgiGet( "COMBO_PARFASCOD_Titlecontrolidtoreplace") ;
            Combo_parfascod_Datalisttype = httpContext.cgiGet( "COMBO_PARFASCOD_Datalisttype") ;
            Combo_parfascod_Allowmultipleselection = GXutil.strtobool( httpContext.cgiGet( "COMBO_PARFASCOD_Allowmultipleselection")) ;
            Combo_parfascod_Datalistfixedvalues = httpContext.cgiGet( "COMBO_PARFASCOD_Datalistfixedvalues") ;
            Combo_parfascod_Isgriditem = GXutil.strtobool( httpContext.cgiGet( "COMBO_PARFASCOD_Isgriditem")) ;
            Combo_parfascod_Hasdescription = GXutil.strtobool( httpContext.cgiGet( "COMBO_PARFASCOD_Hasdescription")) ;
            Combo_parfascod_Datalistproc = httpContext.cgiGet( "COMBO_PARFASCOD_Datalistproc") ;
            Combo_parfascod_Datalistprocparametersprefix = httpContext.cgiGet( "COMBO_PARFASCOD_Datalistprocparametersprefix") ;
            Combo_parfascod_Remoteservicesparameters = httpContext.cgiGet( "COMBO_PARFASCOD_Remoteservicesparameters") ;
            Combo_parfascod_Datalistupdateminimumcharacters = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_PARFASCOD_Datalistupdateminimumcharacters"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_parfascod_Includeonlyselectedoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_PARFASCOD_Includeonlyselectedoption")) ;
            Combo_parfascod_Includeselectalloption = GXutil.strtobool( httpContext.cgiGet( "COMBO_PARFASCOD_Includeselectalloption")) ;
            Combo_parfascod_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_PARFASCOD_Emptyitem")) ;
            Combo_parfascod_Includeaddnewoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_PARFASCOD_Includeaddnewoption")) ;
            Combo_parfascod_Htmltemplate = httpContext.cgiGet( "COMBO_PARFASCOD_Htmltemplate") ;
            Combo_parfascod_Multiplevaluestype = httpContext.cgiGet( "COMBO_PARFASCOD_Multiplevaluestype") ;
            Combo_parfascod_Loadingdata = httpContext.cgiGet( "COMBO_PARFASCOD_Loadingdata") ;
            Combo_parfascod_Noresultsfound = httpContext.cgiGet( "COMBO_PARFASCOD_Noresultsfound") ;
            Combo_parfascod_Emptyitemtext = httpContext.cgiGet( "COMBO_PARFASCOD_Emptyitemtext") ;
            Combo_parfascod_Onlyselectedvalues = httpContext.cgiGet( "COMBO_PARFASCOD_Onlyselectedvalues") ;
            Combo_parfascod_Selectalltext = httpContext.cgiGet( "COMBO_PARFASCOD_Selectalltext") ;
            Combo_parfascod_Multiplevaluesseparator = httpContext.cgiGet( "COMBO_PARFASCOD_Multiplevaluesseparator") ;
            Combo_parfascod_Addnewoptiontext = httpContext.cgiGet( "COMBO_PARFASCOD_Addnewoptiontext") ;
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
            A758ProCod = httpContext.cgiGet( edtProCod_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
            A9836FasCodM = httpContext.cgiGet( edtFasCodM_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9836FasCodM", A9836FasCodM);
            A9830MaqCodC = httpContext.cgiGet( edtMaqCodC_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9830MaqCodC", A9830MaqCodC);
            AV34Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34Pgmname", AV34Pgmname);
            AV19ComboCliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtavComboclicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV19ComboCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19ComboCliCod), 6, 0));
            AV21ComboArtCod = httpContext.cgiGet( edtavComboartcod_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV21ComboArtCod", AV21ComboArtCod);
            AV23ComboProCod = httpContext.cgiGet( edtavComboprocod_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV23ComboProCod", AV23ComboProCod);
            AV25ComboFasCodM = httpContext.cgiGet( edtavCombofascodm_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV25ComboFasCodM", AV25ComboFasCodM);
            AV27ComboMaqCodC = httpContext.cgiGet( edtavCombomaqcodc_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27ComboMaqCodC", AV27ComboMaqCodC);
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"CAPFM_P");
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            forbiddenHiddens.add("MaqAncC", localUtil.format( DecimalUtil.doubleToDec(A9869MaqAncC), "ZZ9"));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) || ( GXutil.strcmp(A9836FasCodM, Z9836FasCodM) != 0 ) || ( GXutil.strcmp(A9830MaqCodC, Z9830MaqCodC) != 0 ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("ingenieria\\capfm_p:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
               GxWebError = (byte)(1) ;
               httpContext.sendError( 403 );
               GXutil.writeLog("send_http_error_code 403");
               AnyError = (short)(1) ;
               return  ;
            }
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
               A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
               A65ArtCod = httpContext.GetPar( "ArtCod") ;
               httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
               A758ProCod = httpContext.GetPar( "ProCod") ;
               httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
               A9836FasCodM = httpContext.GetPar( "FasCodM") ;
               httpContext.ajax_rsp_assign_attri("", false, "A9836FasCodM", A9836FasCodM);
               A9830MaqCodC = httpContext.GetPar( "MaqCodC") ;
               httpContext.ajax_rsp_assign_attri("", false, "A9830MaqCodC", A9830MaqCodC);
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
                  sMode1294 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  Gx_mode = sMode1294 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound1294 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_1TC0( ) ;
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
                     if ( GXutil.strcmp(sEvt, "COMBO_CLICOD.ONOPTIONCLICKED") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        e121TC2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "COMBO_PROCOD.ONOPTIONCLICKED") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        e131TC2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "START") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: Start */
                        e111TC2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e141TC2 ();
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
         e141TC2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll1TC1294( ) ;
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
         disableAttributes1TC1294( ) ;
      }
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavComboclicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavComboclicod_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavComboartcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavComboartcod_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavComboprocod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavComboprocod_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavCombofascodm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombofascodm_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavCombomaqcodc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombomaqcodc_Enabled), 5, 0), true);
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

   public void confirm_1TC0( )
   {
      beforeValidate1TC1294( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1TC1294( ) ;
         }
         else
         {
            checkExtendedTable1TC1294( ) ;
            closeExtendedTableCursors1TC1294( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode1294 = Gx_mode ;
         confirm_1TC1295( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode1294 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode1294 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
   }

   public void confirm_1TC1295( )
   {
      nGXsfl_80_idx = 0 ;
      while ( nGXsfl_80_idx < nRC_GXsfl_80 )
      {
         readRow1TC1295( ) ;
         if ( ( nRcdExists_1295 != 0 ) || ( nIsMod_1295 != 0 ) )
         {
            getKey1TC1295( ) ;
            if ( ( nRcdExists_1295 == 0 ) && ( nRcdDeleted_1295 == 0 ) )
            {
               if ( RcdFound1295 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1TC1295( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1TC1295( ) ;
                     closeExtendedTableCursors1TC1295( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "PARFASCOD_" + sGXsfl_80_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtParFasCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1295 != 0 )
               {
                  if ( nRcdDeleted_1295 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1TC1295( ) ;
                     load1TC1295( ) ;
                     beforeValidate1TC1295( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1TC1295( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1295 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1TC1295( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1TC1295( ) ;
                           closeExtendedTableCursors1TC1295( ) ;
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
                  if ( nRcdDeleted_1295 == 0 )
                  {
                     GXCCtl = "PARFASCOD_" + sGXsfl_80_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtParFasCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtParFasCod_Internalname, GXutil.ltrim( localUtil.ntoc( A1664ParFasCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtParFasPLC_Internalname, A14080ParFasPLC) ;
         httpContext.changePostValue( edtParFasDsc_Internalname, GXutil.rtrim( A1665ParFasDsc)) ;
         httpContext.changePostValue( edtParFMVal2_Internalname, GXutil.rtrim( A14077ParFMVal2)) ;
         httpContext.changePostValue( edtParFMVMin_Internalname, GXutil.rtrim( A14075ParFMVMin)) ;
         httpContext.changePostValue( edtParFMVMax_Internalname, GXutil.rtrim( A14076ParFMVMax)) ;
         httpContext.changePostValue( edtParFMObs_Internalname, A9829ParFMObs) ;
         httpContext.changePostValue( "ZT_"+"Z1664ParFasCod_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( Z1664ParFasCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9828ParFMVal_"+sGXsfl_80_idx, GXutil.rtrim( Z9828ParFMVal)) ;
         httpContext.changePostValue( "ZT_"+"Z9829ParFMObs_"+sGXsfl_80_idx, Z9829ParFMObs) ;
         httpContext.changePostValue( "ZT_"+"Z10256Itm_ord2_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( Z10256Itm_ord2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z14075ParFMVMin_"+sGXsfl_80_idx, GXutil.rtrim( Z14075ParFMVMin)) ;
         httpContext.changePostValue( "ZT_"+"Z14076ParFMVMax_"+sGXsfl_80_idx, GXutil.rtrim( Z14076ParFMVMax)) ;
         httpContext.changePostValue( "ZT_"+"Z14077ParFMVal2_"+sGXsfl_80_idx, GXutil.rtrim( Z14077ParFMVal2)) ;
         httpContext.changePostValue( "ZT_"+"Z14080ParFasPLC_"+sGXsfl_80_idx, Z14080ParFasPLC) ;
         httpContext.changePostValue( "ZT_"+"Z12448ParEspIdS_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( Z12448ParEspIdS, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1295_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1295, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1295_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1295, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1295_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1295, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1295 != 0 )
         {
            httpContext.changePostValue( "PARFASCOD_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParFasCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PARFASCOD_"+sGXsfl_80_idx+"Horizontalalignment", GXutil.rtrim( edtParFasCod_Horizontalalignment)) ;
            httpContext.changePostValue( "PARFASPLC_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParFasPLC_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PARFASDSC_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParFasDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PARFMVAL2_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParFMVal2_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PARFMVMIN_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParFMVMin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PARFMVMAX_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParFMVMax_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PARFMOBS_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParFMObs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1TC0( )
   {
   }

   public void e111TC2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV31Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      capfm_p_impl.this.GXt_char1 = GXv_char2[0] ;
      AV31Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31Station", AV31Station);
      GXv_char2[0] = AV7EmprCod ;
      GXv_char3[0] = AV32EmprNom ;
      GXv_char4[0] = AV33UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV31Station, GXv_char2, GXv_char3, GXv_char4) ;
      capfm_p_impl.this.AV7EmprCod = GXv_char2[0] ;
      capfm_p_impl.this.AV32EmprNom = GXv_char3[0] ;
      capfm_p_impl.this.AV33UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV32EmprNom", AV32EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV33UsurCod", AV33UsurCod);
      GXv_SdtWWPContext5[0] = AV13WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext5) ;
      AV13WWPContext = GXv_SdtWWPContext5[0] ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = AV17DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7[0] ;
      AV17DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6;
      Combo_parfascod_Titlecontrolidtoreplace = edtParFasCod_Internalname ;
      ucCombo_parfascod.sendProperty(context, "", false, Combo_parfascod_Internalname, "TitleControlIdToReplace", Combo_parfascod_Titlecontrolidtoreplace);
      edtParFasCod_Horizontalalignment = "Left" ;
      httpContext.ajax_rsp_assign_prop("", false, edtParFasCod_Internalname, "Horizontalalignment", edtParFasCod_Horizontalalignment, !bGXsfl_80_Refreshing);
      edtMaqCodC_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqCodC_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqCodC_Visible), 5, 0), true);
      AV27ComboMaqCodC = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27ComboMaqCodC", AV27ComboMaqCodC);
      edtavCombomaqcodc_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCombomaqcodc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombomaqcodc_Visible), 5, 0), true);
      edtFasCodM_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasCodM_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCodM_Visible), 5, 0), true);
      AV25ComboFasCodM = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25ComboFasCodM", AV25ComboFasCodM);
      edtavCombofascodm_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCombofascodm_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombofascodm_Visible), 5, 0), true);
      edtProCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProCod_Visible), 5, 0), true);
      AV23ComboProCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23ComboProCod", AV23ComboProCod);
      edtavComboprocod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavComboprocod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavComboprocod_Visible), 5, 0), true);
      edtArtCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtCod_Visible), 5, 0), true);
      AV21ComboArtCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21ComboArtCod", AV21ComboArtCod);
      edtavComboartcod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavComboartcod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavComboartcod_Visible), 5, 0), true);
      edtCliCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Visible), 5, 0), true);
      AV19ComboCliCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19ComboCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19ComboCliCod), 6, 0));
      edtavComboclicod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavComboclicod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavComboclicod_Visible), 5, 0), true);
      /* Execute user subroutine: 'LOADCOMBOCLICOD' */
      S112 ();
      if ( returnInSub )
      {
         pr_default.close(11);
         pr_default.close(10);
         pr_default.close(9);
         pr_default.close(8);
         pr_default.close(7);
         pr_default.close(6);
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
         pr_default.close(11);
         pr_default.close(10);
         pr_default.close(9);
         pr_default.close(8);
         pr_default.close(7);
         pr_default.close(6);
         pr_default.close(4);
         pr_default.close(3);
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      /* Execute user subroutine: 'LOADCOMBOPROCOD' */
      S132 ();
      if ( returnInSub )
      {
         pr_default.close(11);
         pr_default.close(10);
         pr_default.close(9);
         pr_default.close(8);
         pr_default.close(7);
         pr_default.close(6);
         pr_default.close(4);
         pr_default.close(3);
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      /* Execute user subroutine: 'LOADCOMBOFASCODM' */
      S142 ();
      if ( returnInSub )
      {
         pr_default.close(11);
         pr_default.close(10);
         pr_default.close(9);
         pr_default.close(8);
         pr_default.close(7);
         pr_default.close(6);
         pr_default.close(4);
         pr_default.close(3);
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      /* Execute user subroutine: 'LOADCOMBOMAQCODC' */
      S152 ();
      if ( returnInSub )
      {
         pr_default.close(11);
         pr_default.close(10);
         pr_default.close(9);
         pr_default.close(8);
         pr_default.close(7);
         pr_default.close(6);
         pr_default.close(4);
         pr_default.close(3);
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      /* Execute user subroutine: 'LOADCOMBOPARFASCOD' */
      S162 ();
      if ( returnInSub )
      {
         pr_default.close(11);
         pr_default.close(10);
         pr_default.close(9);
         pr_default.close(8);
         pr_default.close(7);
         pr_default.close(6);
         pr_default.close(4);
         pr_default.close(3);
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      AV14TrnContext.fromxml(AV15WebSession.getValue("TrnContext"), null, null);
      edtEmprCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Visible), 5, 0), true);
      imgImgprompt_gximage = "prompt" ;
      httpContext.ajax_rsp_assign_prop("", false, imgImgprompt_Internalname, "gximage", imgImgprompt_gximage, true);
      AV30imgPrompt = context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30imgPrompt", AV30imgPrompt);
      AV35Imgprompt_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
   }

   public void e141TC2( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV14TrnContext.getgxTv_SdtWWPTransactionContext_Callerondelete() )
      {
         callWebObject(formatLink("app.ingenieria.capfm_pww", new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      pr_default.close(11);
      pr_default.close(10);
      pr_default.close(9);
      pr_default.close(8);
      pr_default.close(7);
      pr_default.close(6);
      pr_default.close(4);
      pr_default.close(3);
      pr_default.close(2);
      pr_default.close(1);
      returnInSub = true;
      if (true) return;
   }

   public void e131TC2( )
   {
      /* Combo_procod_Onoptionclicked Routine */
      returnInSub = false ;
      AV23ComboProCod = Combo_procod_Selectedvalue_get ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23ComboProCod", AV23ComboProCod);
      AV10ProCod = AV23ComboProCod ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10ProCod", AV10ProCod);
      /* Execute user subroutine: 'LOADCOMBOFASCODM' */
      S142 ();
      if ( returnInSub )
      {
         pr_default.close(11);
         pr_default.close(10);
         pr_default.close(9);
         pr_default.close(8);
         pr_default.close(7);
         pr_default.close(6);
         pr_default.close(4);
         pr_default.close(3);
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV24FasCodM_Data", AV24FasCodM_Data);
   }

   public void e121TC2( )
   {
      /* Combo_clicod_Onoptionclicked Routine */
      returnInSub = false ;
      AV19ComboCliCod = (int)(GXutil.lval( Combo_clicod_Selectedvalue_get)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19ComboCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19ComboCliCod), 6, 0));
      AV8CliCod = AV19ComboCliCod ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8CliCod), 6, 0));
      /* Execute user subroutine: 'LOADCOMBOARTCOD' */
      S122 ();
      if ( returnInSub )
      {
         pr_default.close(11);
         pr_default.close(10);
         pr_default.close(9);
         pr_default.close(8);
         pr_default.close(7);
         pr_default.close(6);
         pr_default.close(4);
         pr_default.close(3);
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV20ArtCod_Data", AV20ArtCod_Data);
   }

   public void S162( )
   {
      /* 'LOADCOMBOPARFASCOD' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTComboData_Item8 = AV28ParFasCod_Data ;
      GXv_char4[0] = AV18ComboSelectedValue ;
      GXv_objcol_SdtDVB_SDTComboData_Item9[0] = GXt_objcol_SdtDVB_SDTComboData_Item8 ;
      new app.ingenieria.capfm_ploaddvcombo(remoteHandle, context).execute( "ParFasCod", Gx_mode, AV7EmprCod, AV8CliCod, AV9ArtCod, AV10ProCod, AV11FasCodM, AV12MaqCodC, GXv_char4, GXv_objcol_SdtDVB_SDTComboData_Item9) ;
      capfm_p_impl.this.AV18ComboSelectedValue = GXv_char4[0] ;
      GXt_objcol_SdtDVB_SDTComboData_Item8 = GXv_objcol_SdtDVB_SDTComboData_Item9[0] ;
      AV28ParFasCod_Data = GXt_objcol_SdtDVB_SDTComboData_Item8 ;
   }

   public void S152( )
   {
      /* 'LOADCOMBOMAQCODC' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTComboData_Item8 = AV26MaqCodC_Data ;
      GXv_char4[0] = AV18ComboSelectedValue ;
      GXv_objcol_SdtDVB_SDTComboData_Item9[0] = GXt_objcol_SdtDVB_SDTComboData_Item8 ;
      new app.ingenieria.capfm_ploaddvcombo(remoteHandle, context).execute( "MaqCodC", Gx_mode, AV7EmprCod, AV8CliCod, AV9ArtCod, AV10ProCod, AV11FasCodM, AV12MaqCodC, GXv_char4, GXv_objcol_SdtDVB_SDTComboData_Item9) ;
      capfm_p_impl.this.AV18ComboSelectedValue = GXv_char4[0] ;
      GXt_objcol_SdtDVB_SDTComboData_Item8 = GXv_objcol_SdtDVB_SDTComboData_Item9[0] ;
      AV26MaqCodC_Data = GXt_objcol_SdtDVB_SDTComboData_Item8 ;
      Combo_maqcodc_Selectedvalue_set = AV18ComboSelectedValue ;
      ucCombo_maqcodc.sendProperty(context, "", false, Combo_maqcodc_Internalname, "SelectedValue_set", Combo_maqcodc_Selectedvalue_set);
      AV27ComboMaqCodC = AV18ComboSelectedValue ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27ComboMaqCodC", AV27ComboMaqCodC);
      if ( ( GXutil.strcmp(Gx_mode, "INS") != 0 ) || ! (GXutil.strcmp("", AV12MaqCodC)==0) )
      {
         Combo_maqcodc_Enabled = false ;
         ucCombo_maqcodc.sendProperty(context, "", false, Combo_maqcodc_Internalname, "Enabled", GXutil.booltostr( Combo_maqcodc_Enabled));
      }
   }

   public void S142( )
   {
      /* 'LOADCOMBOFASCODM' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTComboData_Item8 = AV24FasCodM_Data ;
      GXv_char4[0] = AV18ComboSelectedValue ;
      GXv_objcol_SdtDVB_SDTComboData_Item9[0] = GXt_objcol_SdtDVB_SDTComboData_Item8 ;
      new app.ingenieria.capfm_ploaddvcombo(remoteHandle, context).execute( "FasCodM", Gx_mode, AV7EmprCod, AV8CliCod, AV9ArtCod, AV10ProCod, AV11FasCodM, AV12MaqCodC, GXv_char4, GXv_objcol_SdtDVB_SDTComboData_Item9) ;
      capfm_p_impl.this.AV18ComboSelectedValue = GXv_char4[0] ;
      GXt_objcol_SdtDVB_SDTComboData_Item8 = GXv_objcol_SdtDVB_SDTComboData_Item9[0] ;
      AV24FasCodM_Data = GXt_objcol_SdtDVB_SDTComboData_Item8 ;
      Combo_fascodm_Selectedvalue_set = AV18ComboSelectedValue ;
      ucCombo_fascodm.sendProperty(context, "", false, Combo_fascodm_Internalname, "SelectedValue_set", Combo_fascodm_Selectedvalue_set);
      AV25ComboFasCodM = AV18ComboSelectedValue ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25ComboFasCodM", AV25ComboFasCodM);
      if ( ( GXutil.strcmp(Gx_mode, "INS") != 0 ) || ! (GXutil.strcmp("", AV11FasCodM)==0) )
      {
         Combo_fascodm_Enabled = false ;
         ucCombo_fascodm.sendProperty(context, "", false, Combo_fascodm_Internalname, "Enabled", GXutil.booltostr( Combo_fascodm_Enabled));
      }
   }

   public void S132( )
   {
      /* 'LOADCOMBOPROCOD' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTComboData_Item8 = AV22ProCod_Data ;
      GXv_char4[0] = AV18ComboSelectedValue ;
      GXv_objcol_SdtDVB_SDTComboData_Item9[0] = GXt_objcol_SdtDVB_SDTComboData_Item8 ;
      new app.ingenieria.capfm_ploaddvcombo(remoteHandle, context).execute( "ProCod", Gx_mode, AV7EmprCod, AV8CliCod, AV9ArtCod, AV10ProCod, AV11FasCodM, AV12MaqCodC, GXv_char4, GXv_objcol_SdtDVB_SDTComboData_Item9) ;
      capfm_p_impl.this.AV18ComboSelectedValue = GXv_char4[0] ;
      GXt_objcol_SdtDVB_SDTComboData_Item8 = GXv_objcol_SdtDVB_SDTComboData_Item9[0] ;
      AV22ProCod_Data = GXt_objcol_SdtDVB_SDTComboData_Item8 ;
      Combo_procod_Selectedvalue_set = AV18ComboSelectedValue ;
      ucCombo_procod.sendProperty(context, "", false, Combo_procod_Internalname, "SelectedValue_set", Combo_procod_Selectedvalue_set);
      AV23ComboProCod = AV18ComboSelectedValue ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23ComboProCod", AV23ComboProCod);
      if ( ( GXutil.strcmp(Gx_mode, "INS") != 0 ) || ! (GXutil.strcmp("", AV10ProCod)==0) )
      {
         Combo_procod_Enabled = false ;
         ucCombo_procod.sendProperty(context, "", false, Combo_procod_Internalname, "Enabled", GXutil.booltostr( Combo_procod_Enabled));
      }
   }

   public void S122( )
   {
      /* 'LOADCOMBOARTCOD' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTComboData_Item8 = AV20ArtCod_Data ;
      GXv_char4[0] = AV18ComboSelectedValue ;
      GXv_objcol_SdtDVB_SDTComboData_Item9[0] = GXt_objcol_SdtDVB_SDTComboData_Item8 ;
      new app.ingenieria.capfm_ploaddvcombo(remoteHandle, context).execute( "ArtCod", Gx_mode, AV7EmprCod, AV8CliCod, AV9ArtCod, AV10ProCod, AV11FasCodM, AV12MaqCodC, GXv_char4, GXv_objcol_SdtDVB_SDTComboData_Item9) ;
      capfm_p_impl.this.AV18ComboSelectedValue = GXv_char4[0] ;
      GXt_objcol_SdtDVB_SDTComboData_Item8 = GXv_objcol_SdtDVB_SDTComboData_Item9[0] ;
      AV20ArtCod_Data = GXt_objcol_SdtDVB_SDTComboData_Item8 ;
      Combo_artcod_Selectedvalue_set = AV18ComboSelectedValue ;
      ucCombo_artcod.sendProperty(context, "", false, Combo_artcod_Internalname, "SelectedValue_set", Combo_artcod_Selectedvalue_set);
      AV21ComboArtCod = AV18ComboSelectedValue ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21ComboArtCod", AV21ComboArtCod);
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
      GXt_objcol_SdtDVB_SDTComboData_Item8 = AV16CliCod_Data ;
      GXv_char4[0] = AV18ComboSelectedValue ;
      GXv_objcol_SdtDVB_SDTComboData_Item9[0] = GXt_objcol_SdtDVB_SDTComboData_Item8 ;
      new app.ingenieria.capfm_ploaddvcombo(remoteHandle, context).execute( "CliCod", Gx_mode, AV7EmprCod, AV8CliCod, AV9ArtCod, AV10ProCod, AV11FasCodM, AV12MaqCodC, GXv_char4, GXv_objcol_SdtDVB_SDTComboData_Item9) ;
      capfm_p_impl.this.AV18ComboSelectedValue = GXv_char4[0] ;
      GXt_objcol_SdtDVB_SDTComboData_Item8 = GXv_objcol_SdtDVB_SDTComboData_Item9[0] ;
      AV16CliCod_Data = GXt_objcol_SdtDVB_SDTComboData_Item8 ;
      Combo_clicod_Selectedvalue_set = AV18ComboSelectedValue ;
      ucCombo_clicod.sendProperty(context, "", false, Combo_clicod_Internalname, "SelectedValue_set", Combo_clicod_Selectedvalue_set);
      AV19ComboCliCod = (int)(GXutil.lval( AV18ComboSelectedValue)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19ComboCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19ComboCliCod), 6, 0));
      if ( ( GXutil.strcmp(Gx_mode, "INS") != 0 ) || ! (0==AV8CliCod) )
      {
         Combo_clicod_Enabled = false ;
         ucCombo_clicod.sendProperty(context, "", false, Combo_clicod_Internalname, "Enabled", GXutil.booltostr( Combo_clicod_Enabled));
      }
   }

   public void zm1TC1294( int GX_JID )
   {
      if ( ( GX_JID == 26 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z9869MaqAncC = T01TC8_A9869MaqAncC[0] ;
         }
         else
         {
            Z9869MaqAncC = A9869MaqAncC ;
         }
      }
      if ( GX_JID == -26 )
      {
         Z9830MaqCodC = A9830MaqCodC ;
         Z9869MaqAncC = A9869MaqAncC ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z65ArtCod = A65ArtCod ;
         Z758ProCod = A758ProCod ;
         Z9836FasCodM = A9836FasCodM ;
         Z407EmprNom = A407EmprNom ;
         Z279CliNom = A279CliNom ;
         Z69ArtDsc = A69ArtDsc ;
         Z759ProDsc = A759ProDsc ;
      }
   }

   public void standaloneNotModal( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      AV34Pgmname = "Ingenieria.CAPFM_P" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34Pgmname", AV34Pgmname);
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV7EmprCod)==0) )
      {
         A396EmprCod = AV7EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
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
      if ( ! (GXutil.strcmp("", AV10ProCod)==0) )
      {
         edtProCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProCod_Enabled), 5, 0), true);
      }
      else
      {
         edtProCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProCod_Enabled), 5, 0), true);
      }
      if ( ! (GXutil.strcmp("", AV10ProCod)==0) )
      {
         edtProCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProCod_Enabled), 5, 0), true);
      }
      if ( ! (GXutil.strcmp("", AV11FasCodM)==0) )
      {
         edtFasCodM_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtFasCodM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCodM_Enabled), 5, 0), true);
      }
      else
      {
         edtFasCodM_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtFasCodM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCodM_Enabled), 5, 0), true);
      }
      if ( ! (GXutil.strcmp("", AV11FasCodM)==0) )
      {
         edtFasCodM_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtFasCodM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCodM_Enabled), 5, 0), true);
      }
      if ( ! (GXutil.strcmp("", AV12MaqCodC)==0) )
      {
         edtMaqCodC_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMaqCodC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqCodC_Enabled), 5, 0), true);
      }
      else
      {
         edtMaqCodC_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMaqCodC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqCodC_Enabled), 5, 0), true);
      }
      if ( ! (GXutil.strcmp("", AV12MaqCodC)==0) )
      {
         edtMaqCodC_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMaqCodC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqCodC_Enabled), 5, 0), true);
      }
      if ( ! (GXutil.strcmp("", AV12MaqCodC)==0) )
      {
         A9830MaqCodC = AV12MaqCodC ;
         httpContext.ajax_rsp_assign_attri("", false, "A9830MaqCodC", A9830MaqCodC);
      }
      else
      {
         A9830MaqCodC = AV27ComboMaqCodC ;
         httpContext.ajax_rsp_assign_attri("", false, "A9830MaqCodC", A9830MaqCodC);
      }
      if ( ! (GXutil.strcmp("", AV11FasCodM)==0) )
      {
         A9836FasCodM = AV11FasCodM ;
         httpContext.ajax_rsp_assign_attri("", false, "A9836FasCodM", A9836FasCodM);
      }
      else
      {
         A9836FasCodM = AV25ComboFasCodM ;
         httpContext.ajax_rsp_assign_attri("", false, "A9836FasCodM", A9836FasCodM);
      }
      if ( ! (GXutil.strcmp("", AV10ProCod)==0) )
      {
         A758ProCod = AV10ProCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
      }
      else
      {
         A758ProCod = AV23ComboProCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
      }
      if ( ! (GXutil.strcmp("", AV9ArtCod)==0) )
      {
         A65ArtCod = AV9ArtCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
      }
      else
      {
         A65ArtCod = AV21ComboArtCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
      }
      if ( ! (0==AV8CliCod) )
      {
         A252CliCod = AV8CliCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      }
      else
      {
         A252CliCod = AV19ComboCliCod ;
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
         /* Using cursor T01TC9 */
         pr_default.execute(7, new Object[] {A396EmprCod});
         A407EmprNom = T01TC9_A407EmprNom[0] ;
         n407EmprNom = T01TC9_n407EmprNom[0] ;
         pr_default.close(7);
         GXt_char1 = A9831MaqDscD ;
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A9830MaqCodC ;
         GXv_char2[0] = GXt_char1 ;
         new app.pmaqdsc(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
         capfm_p_impl.this.A396EmprCod = GXv_char4[0] ;
         capfm_p_impl.this.A9830MaqCodC = GXv_char3[0] ;
         capfm_p_impl.this.GXt_char1 = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A9830MaqCodC", A9830MaqCodC);
         A9831MaqDscD = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "A9831MaqDscD", A9831MaqDscD);
         GXt_char1 = A9837FasDscM ;
         GXv_char4[0] = GXt_char1 ;
         new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A9836FasCodM, GXv_char4) ;
         capfm_p_impl.this.GXt_char1 = GXv_char4[0] ;
         A9837FasDscM = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "A9837FasDscM", A9837FasDscM);
         /* Using cursor T01TC12 */
         pr_default.execute(10, new Object[] {A396EmprCod, A758ProCod});
         A759ProDsc = T01TC12_A759ProDsc[0] ;
         pr_default.close(10);
         /* Using cursor T01TC10 */
         pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
         A279CliNom = T01TC10_A279CliNom[0] ;
         pr_default.close(8);
         /* Using cursor T01TC11 */
         pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
         A69ArtDsc = T01TC11_A69ArtDsc[0] ;
         n69ArtDsc = T01TC11_n69ArtDsc[0] ;
         pr_default.close(9);
      }
   }

   public void load1TC1294( )
   {
      /* Using cursor T01TC14 */
      pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A758ProCod, A9836FasCodM, A9830MaqCodC});
      if ( (pr_default.getStatus(12) != 101) )
      {
         RcdFound1294 = (short)(1) ;
         A407EmprNom = T01TC14_A407EmprNom[0] ;
         n407EmprNom = T01TC14_n407EmprNom[0] ;
         A279CliNom = T01TC14_A279CliNom[0] ;
         A69ArtDsc = T01TC14_A69ArtDsc[0] ;
         n69ArtDsc = T01TC14_n69ArtDsc[0] ;
         A759ProDsc = T01TC14_A759ProDsc[0] ;
         A9869MaqAncC = T01TC14_A9869MaqAncC[0] ;
         zm1TC1294( -26) ;
      }
      pr_default.close(12);
      onLoadActions1TC1294( ) ;
   }

   public void onLoadActions1TC1294( )
   {
      GXt_char1 = A9837FasDscM ;
      GXv_char4[0] = GXt_char1 ;
      new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A9836FasCodM, GXv_char4) ;
      capfm_p_impl.this.GXt_char1 = GXv_char4[0] ;
      A9837FasDscM = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A9837FasDscM", A9837FasDscM);
      GXt_char1 = A9831MaqDscD ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = A9830MaqCodC ;
      GXv_char2[0] = GXt_char1 ;
      new app.pmaqdsc(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
      capfm_p_impl.this.A396EmprCod = GXv_char4[0] ;
      capfm_p_impl.this.A9830MaqCodC = GXv_char3[0] ;
      capfm_p_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A9830MaqCodC", A9830MaqCodC);
      A9831MaqDscD = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A9831MaqDscD", A9831MaqDscD);
   }

   public void checkExtendedTable1TC1294( )
   {
      nIsDirty_1294 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01TC9 */
      pr_default.execute(7, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01TC9_A407EmprNom[0] ;
      n407EmprNom = T01TC9_n407EmprNom[0] ;
      pr_default.close(7);
      /* Using cursor T01TC10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T01TC10_A279CliNom[0] ;
      pr_default.close(8);
      if ( (0==A252CliCod) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Cliente es requerido.", ""), 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      /* Using cursor T01TC11 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
      if ( (pr_default.getStatus(9) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ARTICU", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ARTCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A69ArtDsc = T01TC11_A69ArtDsc[0] ;
      n69ArtDsc = T01TC11_n69ArtDsc[0] ;
      pr_default.close(9);
      if ( (GXutil.strcmp("", A65ArtCod)==0) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Código Artículo es requerido.", ""), 1, "ARTCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtArtCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      /* Using cursor T01TC12 */
      pr_default.execute(10, new Object[] {A396EmprCod, A758ProCod});
      if ( (pr_default.getStatus(10) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PROCES", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A759ProDsc = T01TC12_A759ProDsc[0] ;
      pr_default.close(10);
      if ( (GXutil.strcmp("", A758ProCod)==0) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Codigo Proceso es requerido.", ""), 1, "PROCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtProCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      /* Using cursor T01TC13 */
      pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A758ProCod, A9836FasCodM});
      if ( (pr_default.getStatus(11) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CAPFMP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FASCODM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(11);
      nIsDirty_1294 = (short)(1) ;
      GXt_char1 = A9837FasDscM ;
      GXv_char4[0] = GXt_char1 ;
      new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A9836FasCodM, GXv_char4) ;
      capfm_p_impl.this.GXt_char1 = GXv_char4[0] ;
      A9837FasDscM = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A9837FasDscM", A9837FasDscM);
      if ( (GXutil.strcmp("", A9836FasCodM)==0) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Código Fase es requerido.", ""), 1, "FASCODM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtFasCodM_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      nIsDirty_1294 = (short)(1) ;
      GXt_char1 = A9831MaqDscD ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = A9830MaqCodC ;
      GXv_char2[0] = GXt_char1 ;
      new app.pmaqdsc(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
      capfm_p_impl.this.A396EmprCod = GXv_char4[0] ;
      capfm_p_impl.this.A9830MaqCodC = GXv_char3[0] ;
      capfm_p_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A9830MaqCodC", A9830MaqCodC);
      A9831MaqDscD = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A9831MaqDscD", A9831MaqDscD);
      if ( (GXutil.strcmp("", A9830MaqCodC)==0) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Maquina es requerido.", ""), 1, "MAQCODC");
         AnyError = (short)(1) ;
         GX_FocusControl = edtMaqCodC_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors1TC1294( )
   {
      pr_default.close(7);
      pr_default.close(8);
      pr_default.close(9);
      pr_default.close(10);
      pr_default.close(11);
   }

   public void enableDisable( )
   {
   }

   public void gxload_27( String A396EmprCod )
   {
      /* Using cursor T01TC15 */
      pr_default.execute(13, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(13) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01TC15_A407EmprNom[0] ;
      n407EmprNom = T01TC15_n407EmprNom[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A407EmprNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(13) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(13);
   }

   public void gxload_28( String A396EmprCod ,
                          int A252CliCod )
   {
      /* Using cursor T01TC16 */
      pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(14) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T01TC16_A279CliNom[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A279CliNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(14) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(14);
   }

   public void gxload_29( String A396EmprCod ,
                          int A252CliCod ,
                          String A65ArtCod )
   {
      /* Using cursor T01TC17 */
      pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
      if ( (pr_default.getStatus(15) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ARTICU", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ARTCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A69ArtDsc = T01TC17_A69ArtDsc[0] ;
      n69ArtDsc = T01TC17_n69ArtDsc[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A69ArtDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(15) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(15);
   }

   public void gxload_30( String A396EmprCod ,
                          String A758ProCod )
   {
      /* Using cursor T01TC18 */
      pr_default.execute(16, new Object[] {A396EmprCod, A758ProCod});
      if ( (pr_default.getStatus(16) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PROCES", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A759ProDsc = T01TC18_A759ProDsc[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A759ProDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(16) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(16);
   }

   public void gxload_31( String A396EmprCod ,
                          int A252CliCod ,
                          String A65ArtCod ,
                          String A758ProCod ,
                          String A9836FasCodM )
   {
      /* Using cursor T01TC19 */
      pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A758ProCod, A9836FasCodM});
      if ( (pr_default.getStatus(17) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CAPFMP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FASCODM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_default.getStatus(17) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(17);
   }

   public void getKey1TC1294( )
   {
      /* Using cursor T01TC20 */
      pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A758ProCod, A9836FasCodM, A9830MaqCodC});
      if ( (pr_default.getStatus(18) != 101) )
      {
         RcdFound1294 = (short)(1) ;
      }
      else
      {
         RcdFound1294 = (short)(0) ;
      }
      pr_default.close(18);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01TC8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A758ProCod, A9836FasCodM, A9830MaqCodC});
      if ( (pr_default.getStatus(6) != 101) )
      {
         zm1TC1294( 26) ;
         RcdFound1294 = (short)(1) ;
         A9830MaqCodC = T01TC8_A9830MaqCodC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9830MaqCodC", A9830MaqCodC);
         A9869MaqAncC = T01TC8_A9869MaqAncC[0] ;
         A396EmprCod = T01TC8_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = T01TC8_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A65ArtCod = T01TC8_A65ArtCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
         A758ProCod = T01TC8_A758ProCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
         A9836FasCodM = T01TC8_A9836FasCodM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9836FasCodM", A9836FasCodM);
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z65ArtCod = A65ArtCod ;
         Z758ProCod = A758ProCod ;
         Z9836FasCodM = A9836FasCodM ;
         Z9830MaqCodC = A9830MaqCodC ;
         sMode1294 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1TC1294( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1294 = (short)(0) ;
            initializeNonKey1TC1294( ) ;
         }
         Gx_mode = sMode1294 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1294 = (short)(0) ;
         initializeNonKey1TC1294( ) ;
         sMode1294 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1294 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(6);
   }

   public void getEqualNoModal( )
   {
      getKey1TC1294( ) ;
      if ( RcdFound1294 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound1294 = (short)(0) ;
      /* Using cursor T01TC21 */
      pr_default.execute(19, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A252CliCod), Integer.valueOf(A252CliCod), A396EmprCod, A65ArtCod, A65ArtCod, Integer.valueOf(A252CliCod), A396EmprCod, A758ProCod, A758ProCod, A65ArtCod, Integer.valueOf(A252CliCod), A396EmprCod, A9836FasCodM, A9836FasCodM, A758ProCod, A65ArtCod, Integer.valueOf(A252CliCod), A396EmprCod, A9830MaqCodC});
      if ( (pr_default.getStatus(19) != 101) )
      {
         while ( (pr_default.getStatus(19) != 101) && ( ( GXutil.strcmp(T01TC21_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01TC21_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01TC21_A252CliCod[0] < A252CliCod ) || ( T01TC21_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01TC21_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01TC21_A65ArtCod[0], A65ArtCod) < 0 ) || ( GXutil.strcmp(T01TC21_A65ArtCod[0], A65ArtCod) == 0 ) && ( T01TC21_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01TC21_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01TC21_A758ProCod[0], A758ProCod) < 0 ) || ( GXutil.strcmp(T01TC21_A758ProCod[0], A758ProCod) == 0 ) && ( GXutil.strcmp(T01TC21_A65ArtCod[0], A65ArtCod) == 0 ) && ( T01TC21_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01TC21_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01TC21_A9836FasCodM[0], A9836FasCodM) < 0 ) || ( GXutil.strcmp(T01TC21_A9836FasCodM[0], A9836FasCodM) == 0 ) && ( GXutil.strcmp(T01TC21_A758ProCod[0], A758ProCod) == 0 ) && ( GXutil.strcmp(T01TC21_A65ArtCod[0], A65ArtCod) == 0 ) && ( T01TC21_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01TC21_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01TC21_A9830MaqCodC[0], A9830MaqCodC) < 0 ) ) )
         {
            pr_default.readNext(19);
         }
         if ( (pr_default.getStatus(19) != 101) && ( ( GXutil.strcmp(T01TC21_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01TC21_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01TC21_A252CliCod[0] > A252CliCod ) || ( T01TC21_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01TC21_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01TC21_A65ArtCod[0], A65ArtCod) > 0 ) || ( GXutil.strcmp(T01TC21_A65ArtCod[0], A65ArtCod) == 0 ) && ( T01TC21_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01TC21_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01TC21_A758ProCod[0], A758ProCod) > 0 ) || ( GXutil.strcmp(T01TC21_A758ProCod[0], A758ProCod) == 0 ) && ( GXutil.strcmp(T01TC21_A65ArtCod[0], A65ArtCod) == 0 ) && ( T01TC21_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01TC21_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01TC21_A9836FasCodM[0], A9836FasCodM) > 0 ) || ( GXutil.strcmp(T01TC21_A9836FasCodM[0], A9836FasCodM) == 0 ) && ( GXutil.strcmp(T01TC21_A758ProCod[0], A758ProCod) == 0 ) && ( GXutil.strcmp(T01TC21_A65ArtCod[0], A65ArtCod) == 0 ) && ( T01TC21_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01TC21_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01TC21_A9830MaqCodC[0], A9830MaqCodC) > 0 ) ) )
         {
            A396EmprCod = T01TC21_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A252CliCod = T01TC21_A252CliCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A65ArtCod = T01TC21_A65ArtCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
            A758ProCod = T01TC21_A758ProCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
            A9836FasCodM = T01TC21_A9836FasCodM[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A9836FasCodM", A9836FasCodM);
            A9830MaqCodC = T01TC21_A9830MaqCodC[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A9830MaqCodC", A9830MaqCodC);
            RcdFound1294 = (short)(1) ;
         }
      }
      pr_default.close(19);
   }

   public void move_previous( )
   {
      RcdFound1294 = (short)(0) ;
      /* Using cursor T01TC22 */
      pr_default.execute(20, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A252CliCod), Integer.valueOf(A252CliCod), A396EmprCod, A65ArtCod, A65ArtCod, Integer.valueOf(A252CliCod), A396EmprCod, A758ProCod, A758ProCod, A65ArtCod, Integer.valueOf(A252CliCod), A396EmprCod, A9836FasCodM, A9836FasCodM, A758ProCod, A65ArtCod, Integer.valueOf(A252CliCod), A396EmprCod, A9830MaqCodC});
      if ( (pr_default.getStatus(20) != 101) )
      {
         while ( (pr_default.getStatus(20) != 101) && ( ( GXutil.strcmp(T01TC22_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01TC22_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01TC22_A252CliCod[0] > A252CliCod ) || ( T01TC22_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01TC22_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01TC22_A65ArtCod[0], A65ArtCod) > 0 ) || ( GXutil.strcmp(T01TC22_A65ArtCod[0], A65ArtCod) == 0 ) && ( T01TC22_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01TC22_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01TC22_A758ProCod[0], A758ProCod) > 0 ) || ( GXutil.strcmp(T01TC22_A758ProCod[0], A758ProCod) == 0 ) && ( GXutil.strcmp(T01TC22_A65ArtCod[0], A65ArtCod) == 0 ) && ( T01TC22_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01TC22_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01TC22_A9836FasCodM[0], A9836FasCodM) > 0 ) || ( GXutil.strcmp(T01TC22_A9836FasCodM[0], A9836FasCodM) == 0 ) && ( GXutil.strcmp(T01TC22_A758ProCod[0], A758ProCod) == 0 ) && ( GXutil.strcmp(T01TC22_A65ArtCod[0], A65ArtCod) == 0 ) && ( T01TC22_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01TC22_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01TC22_A9830MaqCodC[0], A9830MaqCodC) > 0 ) ) )
         {
            pr_default.readNext(20);
         }
         if ( (pr_default.getStatus(20) != 101) && ( ( GXutil.strcmp(T01TC22_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01TC22_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01TC22_A252CliCod[0] < A252CliCod ) || ( T01TC22_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01TC22_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01TC22_A65ArtCod[0], A65ArtCod) < 0 ) || ( GXutil.strcmp(T01TC22_A65ArtCod[0], A65ArtCod) == 0 ) && ( T01TC22_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01TC22_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01TC22_A758ProCod[0], A758ProCod) < 0 ) || ( GXutil.strcmp(T01TC22_A758ProCod[0], A758ProCod) == 0 ) && ( GXutil.strcmp(T01TC22_A65ArtCod[0], A65ArtCod) == 0 ) && ( T01TC22_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01TC22_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01TC22_A9836FasCodM[0], A9836FasCodM) < 0 ) || ( GXutil.strcmp(T01TC22_A9836FasCodM[0], A9836FasCodM) == 0 ) && ( GXutil.strcmp(T01TC22_A758ProCod[0], A758ProCod) == 0 ) && ( GXutil.strcmp(T01TC22_A65ArtCod[0], A65ArtCod) == 0 ) && ( T01TC22_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01TC22_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01TC22_A9830MaqCodC[0], A9830MaqCodC) < 0 ) ) )
         {
            A396EmprCod = T01TC22_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A252CliCod = T01TC22_A252CliCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A65ArtCod = T01TC22_A65ArtCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
            A758ProCod = T01TC22_A758ProCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
            A9836FasCodM = T01TC22_A9836FasCodM[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A9836FasCodM", A9836FasCodM);
            A9830MaqCodC = T01TC22_A9830MaqCodC[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A9830MaqCodC", A9830MaqCodC);
            RcdFound1294 = (short)(1) ;
         }
      }
      pr_default.close(20);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1TC1294( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1TC1294( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1294 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) || ( GXutil.strcmp(A9836FasCodM, Z9836FasCodM) != 0 ) || ( GXutil.strcmp(A9830MaqCodC, Z9830MaqCodC) != 0 ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A252CliCod = Z252CliCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
               A65ArtCod = Z65ArtCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
               A758ProCod = Z758ProCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
               A9836FasCodM = Z9836FasCodM ;
               httpContext.ajax_rsp_assign_attri("", false, "A9836FasCodM", A9836FasCodM);
               A9830MaqCodC = Z9830MaqCodC ;
               httpContext.ajax_rsp_assign_attri("", false, "A9830MaqCodC", A9830MaqCodC);
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
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
               update1TC1294( ) ;
               GX_FocusControl = edtCliCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) || ( GXutil.strcmp(A9836FasCodM, Z9836FasCodM) != 0 ) || ( GXutil.strcmp(A9830MaqCodC, Z9830MaqCodC) != 0 ) )
            {
               /* Insert record */
               GX_FocusControl = edtCliCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1TC1294( ) ;
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
                  GX_FocusControl = edtCliCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1TC1294( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) || ( GXutil.strcmp(A9836FasCodM, Z9836FasCodM) != 0 ) || ( GXutil.strcmp(A9830MaqCodC, Z9830MaqCodC) != 0 ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = Z252CliCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A65ArtCod = Z65ArtCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
         A758ProCod = Z758ProCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
         A9836FasCodM = Z9836FasCodM ;
         httpContext.ajax_rsp_assign_attri("", false, "A9836FasCodM", A9836FasCodM);
         A9830MaqCodC = Z9830MaqCodC ;
         httpContext.ajax_rsp_assign_attri("", false, "A9830MaqCodC", A9830MaqCodC);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
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

   public void checkOptimisticConcurrency1TC1294( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01TC7 */
         pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A758ProCod, A9836FasCodM, A9830MaqCodC});
         if ( (pr_default.getStatus(5) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCAPFM1"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(5) == 101) || ( Z9869MaqAncC != T01TC7_A9869MaqAncC[0] ) )
         {
            if ( Z9869MaqAncC != T01TC7_A9869MaqAncC[0] )
            {
               GXutil.writeLogln("ingenieria.capfm_p:[seudo value changed for attri]"+"MaqAncC");
               GXutil.writeLogRaw("Old: ",Z9869MaqAncC);
               GXutil.writeLogRaw("Current: ",T01TC7_A9869MaqAncC[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCAPFM1"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1TC1294( )
   {
      beforeValidate1TC1294( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1TC1294( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1TC1294( 0) ;
         checkOptimisticConcurrency1TC1294( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1TC1294( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1TC1294( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01TC23 */
                  pr_default.execute(21, new Object[] {A9830MaqCodC, Short.valueOf(A9869MaqAncC), A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A758ProCod, A9836FasCodM});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCAPFM1");
                  if ( (pr_default.getStatus(21) == 1) )
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
                        processLevel1TC1294( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1TC0( ) ;
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
            load1TC1294( ) ;
         }
         endLevel1TC1294( ) ;
      }
      closeExtendedTableCursors1TC1294( ) ;
   }

   public void update1TC1294( )
   {
      beforeValidate1TC1294( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1TC1294( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1TC1294( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1TC1294( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1TC1294( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01TC24 */
                  pr_default.execute(22, new Object[] {Short.valueOf(A9869MaqAncC), A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A758ProCod, A9836FasCodM, A9830MaqCodC});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCAPFM1");
                  if ( (pr_default.getStatus(22) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCAPFM1"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1TC1294( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1TC1294( ) ;
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
         endLevel1TC1294( ) ;
      }
      closeExtendedTableCursors1TC1294( ) ;
   }

   public void deferredUpdate1TC1294( )
   {
   }

   public void delete( )
   {
      beforeValidate1TC1294( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1TC1294( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1TC1294( ) ;
         afterConfirm1TC1294( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1TC1294( ) ;
            if ( AnyError == 0 )
            {
               scanStart1TC1295( ) ;
               while ( RcdFound1295 != 0 )
               {
                  getByPrimaryKey1TC1295( ) ;
                  delete1TC1295( ) ;
                  scanNext1TC1295( ) ;
               }
               scanEnd1TC1295( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01TC25 */
                  pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A758ProCod, A9836FasCodM, A9830MaqCodC});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCAPFM1");
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
      sMode1294 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1TC1294( ) ;
      Gx_mode = sMode1294 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1TC1294( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01TC26 */
         pr_default.execute(24, new Object[] {A396EmprCod});
         A407EmprNom = T01TC26_A407EmprNom[0] ;
         n407EmprNom = T01TC26_n407EmprNom[0] ;
         pr_default.close(24);
         /* Using cursor T01TC27 */
         pr_default.execute(25, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
         A279CliNom = T01TC27_A279CliNom[0] ;
         pr_default.close(25);
         /* Using cursor T01TC28 */
         pr_default.execute(26, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
         A69ArtDsc = T01TC28_A69ArtDsc[0] ;
         n69ArtDsc = T01TC28_n69ArtDsc[0] ;
         pr_default.close(26);
         /* Using cursor T01TC29 */
         pr_default.execute(27, new Object[] {A396EmprCod, A758ProCod});
         A759ProDsc = T01TC29_A759ProDsc[0] ;
         pr_default.close(27);
         GXt_char1 = A9837FasDscM ;
         GXv_char4[0] = GXt_char1 ;
         new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A9836FasCodM, GXv_char4) ;
         capfm_p_impl.this.GXt_char1 = GXv_char4[0] ;
         A9837FasDscM = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "A9837FasDscM", A9837FasDscM);
         GXt_char1 = A9831MaqDscD ;
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A9830MaqCodC ;
         GXv_char2[0] = GXt_char1 ;
         new app.pmaqdsc(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
         capfm_p_impl.this.A396EmprCod = GXv_char4[0] ;
         capfm_p_impl.this.A9830MaqCodC = GXv_char3[0] ;
         capfm_p_impl.this.GXt_char1 = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A9830MaqCodC", A9830MaqCodC);
         A9831MaqDscD = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "A9831MaqDscD", A9831MaqDscD);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T01TC30 */
         pr_default.execute(28, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A758ProCod, A9836FasCodM, A9830MaqCodC});
         if ( (pr_default.getStatus(28) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PFSMQAN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(28);
      }
   }

   public void processNestedLevel1TC1295( )
   {
      nGXsfl_80_idx = 0 ;
      while ( nGXsfl_80_idx < nRC_GXsfl_80 )
      {
         readRow1TC1295( ) ;
         if ( ( nRcdExists_1295 != 0 ) || ( nIsMod_1295 != 0 ) )
         {
            standaloneNotModal1TC1295( ) ;
            getKey1TC1295( ) ;
            if ( ( nRcdExists_1295 == 0 ) && ( nRcdDeleted_1295 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1TC1295( ) ;
            }
            else
            {
               if ( RcdFound1295 != 0 )
               {
                  if ( ( nRcdDeleted_1295 != 0 ) && ( nRcdExists_1295 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1TC1295( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1295 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1TC1295( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1295 == 0 )
                  {
                     GXCCtl = "PARFASCOD_" + sGXsfl_80_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtParFasCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtParFasCod_Internalname, GXutil.ltrim( localUtil.ntoc( A1664ParFasCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtParFasPLC_Internalname, A14080ParFasPLC) ;
         httpContext.changePostValue( edtParFasDsc_Internalname, GXutil.rtrim( A1665ParFasDsc)) ;
         httpContext.changePostValue( edtParFMVal2_Internalname, GXutil.rtrim( A14077ParFMVal2)) ;
         httpContext.changePostValue( edtParFMVMin_Internalname, GXutil.rtrim( A14075ParFMVMin)) ;
         httpContext.changePostValue( edtParFMVMax_Internalname, GXutil.rtrim( A14076ParFMVMax)) ;
         httpContext.changePostValue( edtParFMObs_Internalname, A9829ParFMObs) ;
         httpContext.changePostValue( "ZT_"+"Z1664ParFasCod_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( Z1664ParFasCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9828ParFMVal_"+sGXsfl_80_idx, GXutil.rtrim( Z9828ParFMVal)) ;
         httpContext.changePostValue( "ZT_"+"Z9829ParFMObs_"+sGXsfl_80_idx, Z9829ParFMObs) ;
         httpContext.changePostValue( "ZT_"+"Z10256Itm_ord2_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( Z10256Itm_ord2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z14075ParFMVMin_"+sGXsfl_80_idx, GXutil.rtrim( Z14075ParFMVMin)) ;
         httpContext.changePostValue( "ZT_"+"Z14076ParFMVMax_"+sGXsfl_80_idx, GXutil.rtrim( Z14076ParFMVMax)) ;
         httpContext.changePostValue( "ZT_"+"Z14077ParFMVal2_"+sGXsfl_80_idx, GXutil.rtrim( Z14077ParFMVal2)) ;
         httpContext.changePostValue( "ZT_"+"Z14080ParFasPLC_"+sGXsfl_80_idx, Z14080ParFasPLC) ;
         httpContext.changePostValue( "ZT_"+"Z12448ParEspIdS_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( Z12448ParEspIdS, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1295_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1295, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1295_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1295, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1295_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1295, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1295 != 0 )
         {
            httpContext.changePostValue( "PARFASCOD_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParFasCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PARFASCOD_"+sGXsfl_80_idx+"Horizontalalignment", GXutil.rtrim( edtParFasCod_Horizontalalignment)) ;
            httpContext.changePostValue( "PARFASPLC_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParFasPLC_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PARFASDSC_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParFasDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PARFMVAL2_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParFMVal2_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PARFMVMIN_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParFMVMin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PARFMVMAX_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParFMVMax_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PARFMOBS_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParFMObs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1TC1295( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1295 = (short)(0) ;
      nIsMod_1295 = (short)(0) ;
      nRcdDeleted_1295 = (short)(0) ;
   }

   public void processLevel1TC1294( )
   {
      /* Save parent mode. */
      sMode1294 = Gx_mode ;
      processNestedLevel1TC1295( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode1294 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1TC1294( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(5);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1TC1294( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "ingenieria.capfm_p");
         if ( AnyError == 0 )
         {
            confirmValues1TC0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "ingenieria.capfm_p");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1TC1294( )
   {
      /* Scan By routine */
      /* Using cursor T01TC31 */
      pr_default.execute(29);
      RcdFound1294 = (short)(0) ;
      if ( (pr_default.getStatus(29) != 101) )
      {
         RcdFound1294 = (short)(1) ;
         A396EmprCod = T01TC31_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = T01TC31_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A65ArtCod = T01TC31_A65ArtCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
         A758ProCod = T01TC31_A758ProCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
         A9836FasCodM = T01TC31_A9836FasCodM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9836FasCodM", A9836FasCodM);
         A9830MaqCodC = T01TC31_A9830MaqCodC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9830MaqCodC", A9830MaqCodC);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1TC1294( )
   {
      /* Scan next routine */
      pr_default.readNext(29);
      RcdFound1294 = (short)(0) ;
      if ( (pr_default.getStatus(29) != 101) )
      {
         RcdFound1294 = (short)(1) ;
         A396EmprCod = T01TC31_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = T01TC31_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A65ArtCod = T01TC31_A65ArtCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
         A758ProCod = T01TC31_A758ProCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
         A9836FasCodM = T01TC31_A9836FasCodM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9836FasCodM", A9836FasCodM);
         A9830MaqCodC = T01TC31_A9830MaqCodC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9830MaqCodC", A9830MaqCodC);
      }
   }

   public void scanEnd1TC1294( )
   {
      pr_default.close(29);
   }

   public void afterConfirm1TC1294( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1TC1294( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1TC1294( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1TC1294( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1TC1294( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1TC1294( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1TC1294( )
   {
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtArtCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtCod_Enabled), 5, 0), true);
      edtProCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProCod_Enabled), 5, 0), true);
      edtFasCodM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasCodM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCodM_Enabled), 5, 0), true);
      edtMaqCodC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqCodC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqCodC_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      edtavComboclicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavComboclicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavComboclicod_Enabled), 5, 0), true);
      edtavComboartcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavComboartcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavComboartcod_Enabled), 5, 0), true);
      edtavComboprocod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavComboprocod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavComboprocod_Enabled), 5, 0), true);
      edtavCombofascodm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCombofascodm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombofascodm_Enabled), 5, 0), true);
      edtavCombomaqcodc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCombomaqcodc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombomaqcodc_Enabled), 5, 0), true);
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
   }

   public void zm1TC1295( int GX_JID )
   {
      if ( ( GX_JID == 32 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z9828ParFMVal = T01TC3_A9828ParFMVal[0] ;
            Z9829ParFMObs = T01TC3_A9829ParFMObs[0] ;
            Z10256Itm_ord2 = T01TC3_A10256Itm_ord2[0] ;
            Z14075ParFMVMin = T01TC3_A14075ParFMVMin[0] ;
            Z14076ParFMVMax = T01TC3_A14076ParFMVMax[0] ;
            Z14077ParFMVal2 = T01TC3_A14077ParFMVal2[0] ;
            Z14080ParFasPLC = T01TC3_A14080ParFasPLC[0] ;
            Z12448ParEspIdS = T01TC3_A12448ParEspIdS[0] ;
         }
         else
         {
            Z9828ParFMVal = A9828ParFMVal ;
            Z9829ParFMObs = A9829ParFMObs ;
            Z10256Itm_ord2 = A10256Itm_ord2 ;
            Z14075ParFMVMin = A14075ParFMVMin ;
            Z14076ParFMVMax = A14076ParFMVMax ;
            Z14077ParFMVal2 = A14077ParFMVal2 ;
            Z14080ParFasPLC = A14080ParFasPLC ;
            Z12448ParEspIdS = A12448ParEspIdS ;
         }
      }
      if ( GX_JID == -32 )
      {
         Z252CliCod = A252CliCod ;
         Z65ArtCod = A65ArtCod ;
         Z758ProCod = A758ProCod ;
         Z9836FasCodM = A9836FasCodM ;
         Z9830MaqCodC = A9830MaqCodC ;
         Z9828ParFMVal = A9828ParFMVal ;
         Z9829ParFMObs = A9829ParFMObs ;
         Z10256Itm_ord2 = A10256Itm_ord2 ;
         Z14075ParFMVMin = A14075ParFMVMin ;
         Z14076ParFMVMax = A14076ParFMVMax ;
         Z14077ParFMVal2 = A14077ParFMVal2 ;
         Z14080ParFasPLC = A14080ParFasPLC ;
         Z396EmprCod = A396EmprCod ;
         Z1664ParFasCod = A1664ParFasCod ;
         Z12448ParEspIdS = A12448ParEspIdS ;
         Z12449ParEspDcS = A12449ParEspDcS ;
         Z1665ParFasDsc = A1665ParFasDsc ;
         Z13203ParUndID = A13203ParUndID ;
         Z13204ParUndDsc = A13204ParUndDsc ;
      }
   }

   public void standaloneNotModal1TC1295( )
   {
      edtParFasDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtParFasDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParFasDsc_Enabled), 5, 0), !bGXsfl_80_Refreshing);
   }

   public void standaloneModal1TC1295( )
   {
      /* Using cursor T01TC5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n12448ParEspIdS), Short.valueOf(A12448ParEspIdS)});
      if ( (pr_default.getStatus(3) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A12448ParEspIdS) ) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Ingrese una especialidad válida, por favor.", ""), "ForeignKeyNotFound", 1, "PARESPIDS");
            AnyError = (short)(1) ;
         }
      }
      A12449ParEspDcS = T01TC5_A12449ParEspDcS[0] ;
      n12449ParEspDcS = T01TC5_n12449ParEspDcS[0] ;
      pr_default.close(3);
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtParFasCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtParFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParFasCod_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      }
      else
      {
         edtParFasCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtParFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParFasCod_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      }
   }

   public void load1TC1295( )
   {
      /* Using cursor T01TC32 */
      pr_default.execute(30, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A758ProCod, A9836FasCodM, A9830MaqCodC, Short.valueOf(A1664ParFasCod)});
      if ( (pr_default.getStatus(30) != 101) )
      {
         RcdFound1295 = (short)(1) ;
         A1665ParFasDsc = T01TC32_A1665ParFasDsc[0] ;
         n1665ParFasDsc = T01TC32_n1665ParFasDsc[0] ;
         A9828ParFMVal = T01TC32_A9828ParFMVal[0] ;
         A9829ParFMObs = T01TC32_A9829ParFMObs[0] ;
         A10256Itm_ord2 = T01TC32_A10256Itm_ord2[0] ;
         A12449ParEspDcS = T01TC32_A12449ParEspDcS[0] ;
         n12449ParEspDcS = T01TC32_n12449ParEspDcS[0] ;
         A13204ParUndDsc = T01TC32_A13204ParUndDsc[0] ;
         n13204ParUndDsc = T01TC32_n13204ParUndDsc[0] ;
         A14075ParFMVMin = T01TC32_A14075ParFMVMin[0] ;
         A14076ParFMVMax = T01TC32_A14076ParFMVMax[0] ;
         A14077ParFMVal2 = T01TC32_A14077ParFMVal2[0] ;
         A14080ParFasPLC = T01TC32_A14080ParFasPLC[0] ;
         A12448ParEspIdS = T01TC32_A12448ParEspIdS[0] ;
         n12448ParEspIdS = T01TC32_n12448ParEspIdS[0] ;
         A13203ParUndID = T01TC32_A13203ParUndID[0] ;
         n13203ParUndID = T01TC32_n13203ParUndID[0] ;
         zm1TC1295( -32) ;
      }
      pr_default.close(30);
      onLoadActions1TC1295( ) ;
   }

   public void onLoadActions1TC1295( )
   {
   }

   public void checkExtendedTable1TC1295( )
   {
      nIsDirty_1295 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1TC1295( ) ;
      /* Using cursor T01TC4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Short.valueOf(A1664ParFasCod)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "PARFASCOD_" + sGXsfl_80_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Ingrese un parámetro válido, por favor.", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtParFasCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A1665ParFasDsc = T01TC4_A1665ParFasDsc[0] ;
      n1665ParFasDsc = T01TC4_n1665ParFasDsc[0] ;
      A13203ParUndID = T01TC4_A13203ParUndID[0] ;
      n13203ParUndID = T01TC4_n13203ParUndID[0] ;
      pr_default.close(2);
      /* Using cursor T01TC6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Boolean.valueOf(n13203ParUndID), Short.valueOf(A13203ParUndID)});
      if ( (pr_default.getStatus(4) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A13203ParUndID) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "UNIDADES PARAMETROS FASES", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PARUNDID");
            AnyError = (short)(1) ;
         }
      }
      A13204ParUndDsc = T01TC6_A13204ParUndDsc[0] ;
      n13204ParUndDsc = T01TC6_n13204ParUndDsc[0] ;
      pr_default.close(4);
   }

   public void closeExtendedTableCursors1TC1295( )
   {
      pr_default.close(2);
      pr_default.close(4);
   }

   public void enableDisable1TC1295( )
   {
   }

   public void gxload_33( String A396EmprCod ,
                          short A1664ParFasCod )
   {
      /* Using cursor T01TC33 */
      pr_default.execute(31, new Object[] {A396EmprCod, Short.valueOf(A1664ParFasCod)});
      if ( (pr_default.getStatus(31) == 101) )
      {
         GXCCtl = "PARFASCOD_" + sGXsfl_80_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Ingrese un parámetro válido, por favor.", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtParFasCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A1665ParFasDsc = T01TC33_A1665ParFasDsc[0] ;
      n1665ParFasDsc = T01TC33_n1665ParFasDsc[0] ;
      A13203ParUndID = T01TC33_A13203ParUndID[0] ;
      n13203ParUndID = T01TC33_n13203ParUndID[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A1665ParFasDsc))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A13203ParUndID, (byte)(4), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(31) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(31);
   }

   public void gxload_35( String A396EmprCod ,
                          short A13203ParUndID )
   {
      /* Using cursor T01TC34 */
      pr_default.execute(32, new Object[] {A396EmprCod, Boolean.valueOf(n13203ParUndID), Short.valueOf(A13203ParUndID)});
      if ( (pr_default.getStatus(32) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A13203ParUndID) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "UNIDADES PARAMETROS FASES", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PARUNDID");
            AnyError = (short)(1) ;
         }
      }
      A13204ParUndDsc = T01TC34_A13204ParUndDsc[0] ;
      n13204ParUndDsc = T01TC34_n13204ParUndDsc[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A13204ParUndDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(32) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(32);
   }

   public void getKey1TC1295( )
   {
      /* Using cursor T01TC35 */
      pr_default.execute(33, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A758ProCod, A9836FasCodM, A9830MaqCodC, Short.valueOf(A1664ParFasCod)});
      if ( (pr_default.getStatus(33) != 101) )
      {
         RcdFound1295 = (short)(1) ;
      }
      else
      {
         RcdFound1295 = (short)(0) ;
      }
      pr_default.close(33);
   }

   public void getByPrimaryKey1TC1295( )
   {
      /* Using cursor T01TC3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A758ProCod, A9836FasCodM, A9830MaqCodC, Short.valueOf(A1664ParFasCod)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1TC1295( 32) ;
         RcdFound1295 = (short)(1) ;
         initializeNonKey1TC1295( ) ;
         A9828ParFMVal = T01TC3_A9828ParFMVal[0] ;
         A9829ParFMObs = T01TC3_A9829ParFMObs[0] ;
         A10256Itm_ord2 = T01TC3_A10256Itm_ord2[0] ;
         A14075ParFMVMin = T01TC3_A14075ParFMVMin[0] ;
         A14076ParFMVMax = T01TC3_A14076ParFMVMax[0] ;
         A14077ParFMVal2 = T01TC3_A14077ParFMVal2[0] ;
         A14080ParFasPLC = T01TC3_A14080ParFasPLC[0] ;
         A1664ParFasCod = T01TC3_A1664ParFasCod[0] ;
         A12448ParEspIdS = T01TC3_A12448ParEspIdS[0] ;
         n12448ParEspIdS = T01TC3_n12448ParEspIdS[0] ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z65ArtCod = A65ArtCod ;
         Z758ProCod = A758ProCod ;
         Z9836FasCodM = A9836FasCodM ;
         Z9830MaqCodC = A9830MaqCodC ;
         Z1664ParFasCod = A1664ParFasCod ;
         sMode1295 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1TC1295( ) ;
         Gx_mode = sMode1295 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1295 = (short)(0) ;
         initializeNonKey1TC1295( ) ;
         sMode1295 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1TC1295( ) ;
         Gx_mode = sMode1295 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1TC1295( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1TC1295( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01TC2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A758ProCod, A9836FasCodM, A9830MaqCodC, Short.valueOf(A1664ParFasCod)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCAPFM2"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z9828ParFMVal, T01TC2_A9828ParFMVal[0]) != 0 ) || ( GXutil.strcmp(Z9829ParFMObs, T01TC2_A9829ParFMObs[0]) != 0 ) || ( Z10256Itm_ord2 != T01TC2_A10256Itm_ord2[0] ) || ( GXutil.strcmp(Z14075ParFMVMin, T01TC2_A14075ParFMVMin[0]) != 0 ) || ( GXutil.strcmp(Z14076ParFMVMax, T01TC2_A14076ParFMVMax[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z14077ParFMVal2, T01TC2_A14077ParFMVal2[0]) != 0 ) || ( GXutil.strcmp(Z14080ParFasPLC, T01TC2_A14080ParFasPLC[0]) != 0 ) || ( Z12448ParEspIdS != T01TC2_A12448ParEspIdS[0] ) )
         {
            if ( GXutil.strcmp(Z9828ParFMVal, T01TC2_A9828ParFMVal[0]) != 0 )
            {
               GXutil.writeLogln("ingenieria.capfm_p:[seudo value changed for attri]"+"ParFMVal");
               GXutil.writeLogRaw("Old: ",Z9828ParFMVal);
               GXutil.writeLogRaw("Current: ",T01TC2_A9828ParFMVal[0]);
            }
            if ( GXutil.strcmp(Z9829ParFMObs, T01TC2_A9829ParFMObs[0]) != 0 )
            {
               GXutil.writeLogln("ingenieria.capfm_p:[seudo value changed for attri]"+"ParFMObs");
               GXutil.writeLogRaw("Old: ",Z9829ParFMObs);
               GXutil.writeLogRaw("Current: ",T01TC2_A9829ParFMObs[0]);
            }
            if ( Z10256Itm_ord2 != T01TC2_A10256Itm_ord2[0] )
            {
               GXutil.writeLogln("ingenieria.capfm_p:[seudo value changed for attri]"+"Itm_ord2");
               GXutil.writeLogRaw("Old: ",Z10256Itm_ord2);
               GXutil.writeLogRaw("Current: ",T01TC2_A10256Itm_ord2[0]);
            }
            if ( GXutil.strcmp(Z14075ParFMVMin, T01TC2_A14075ParFMVMin[0]) != 0 )
            {
               GXutil.writeLogln("ingenieria.capfm_p:[seudo value changed for attri]"+"ParFMVMin");
               GXutil.writeLogRaw("Old: ",Z14075ParFMVMin);
               GXutil.writeLogRaw("Current: ",T01TC2_A14075ParFMVMin[0]);
            }
            if ( GXutil.strcmp(Z14076ParFMVMax, T01TC2_A14076ParFMVMax[0]) != 0 )
            {
               GXutil.writeLogln("ingenieria.capfm_p:[seudo value changed for attri]"+"ParFMVMax");
               GXutil.writeLogRaw("Old: ",Z14076ParFMVMax);
               GXutil.writeLogRaw("Current: ",T01TC2_A14076ParFMVMax[0]);
            }
            if ( GXutil.strcmp(Z14077ParFMVal2, T01TC2_A14077ParFMVal2[0]) != 0 )
            {
               GXutil.writeLogln("ingenieria.capfm_p:[seudo value changed for attri]"+"ParFMVal2");
               GXutil.writeLogRaw("Old: ",Z14077ParFMVal2);
               GXutil.writeLogRaw("Current: ",T01TC2_A14077ParFMVal2[0]);
            }
            if ( GXutil.strcmp(Z14080ParFasPLC, T01TC2_A14080ParFasPLC[0]) != 0 )
            {
               GXutil.writeLogln("ingenieria.capfm_p:[seudo value changed for attri]"+"ParFasPLC");
               GXutil.writeLogRaw("Old: ",Z14080ParFasPLC);
               GXutil.writeLogRaw("Current: ",T01TC2_A14080ParFasPLC[0]);
            }
            if ( Z12448ParEspIdS != T01TC2_A12448ParEspIdS[0] )
            {
               GXutil.writeLogln("ingenieria.capfm_p:[seudo value changed for attri]"+"ParEspIdS");
               GXutil.writeLogRaw("Old: ",Z12448ParEspIdS);
               GXutil.writeLogRaw("Current: ",T01TC2_A12448ParEspIdS[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCAPFM2"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1TC1295( )
   {
      beforeValidate1TC1295( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1TC1295( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1TC1295( 0) ;
         checkOptimisticConcurrency1TC1295( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1TC1295( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1TC1295( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01TC36 */
                  pr_default.execute(34, new Object[] {Integer.valueOf(A252CliCod), A65ArtCod, A758ProCod, A9836FasCodM, A9830MaqCodC, A9828ParFMVal, A9829ParFMObs, Short.valueOf(A10256Itm_ord2), A14075ParFMVMin, A14076ParFMVMax, A14077ParFMVal2, A14080ParFasPLC, A396EmprCod, Short.valueOf(A1664ParFasCod), Boolean.valueOf(n12448ParEspIdS), Short.valueOf(A12448ParEspIdS)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCAPFM2");
                  if ( (pr_default.getStatus(34) == 1) )
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
            load1TC1295( ) ;
         }
         endLevel1TC1295( ) ;
      }
      closeExtendedTableCursors1TC1295( ) ;
   }

   public void update1TC1295( )
   {
      beforeValidate1TC1295( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1TC1295( ) ;
      }
      if ( ( nIsMod_1295 != 0 ) || ( nIsDirty_1295 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1TC1295( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1TC1295( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1TC1295( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01TC37 */
                     pr_default.execute(35, new Object[] {A9828ParFMVal, A9829ParFMObs, Short.valueOf(A10256Itm_ord2), A14075ParFMVMin, A14076ParFMVMax, A14077ParFMVal2, A14080ParFasPLC, Boolean.valueOf(n12448ParEspIdS), Short.valueOf(A12448ParEspIdS), A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A758ProCod, A9836FasCodM, A9830MaqCodC, Short.valueOf(A1664ParFasCod)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCAPFM2");
                     if ( (pr_default.getStatus(35) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCAPFM2"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1TC1295( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1TC1295( ) ;
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
            endLevel1TC1295( ) ;
         }
      }
      closeExtendedTableCursors1TC1295( ) ;
   }

   public void deferredUpdate1TC1295( )
   {
   }

   public void delete1TC1295( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1TC1295( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1TC1295( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1TC1295( ) ;
         afterConfirm1TC1295( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1TC1295( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01TC38 */
               pr_default.execute(36, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A758ProCod, A9836FasCodM, A9830MaqCodC, Short.valueOf(A1664ParFasCod)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCAPFM2");
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
      sMode1295 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1TC1295( ) ;
      Gx_mode = sMode1295 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1TC1295( )
   {
      standaloneModal1TC1295( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01TC39 */
         pr_default.execute(37, new Object[] {A396EmprCod, Short.valueOf(A1664ParFasCod)});
         A1665ParFasDsc = T01TC39_A1665ParFasDsc[0] ;
         n1665ParFasDsc = T01TC39_n1665ParFasDsc[0] ;
         A13203ParUndID = T01TC39_A13203ParUndID[0] ;
         n13203ParUndID = T01TC39_n13203ParUndID[0] ;
         pr_default.close(37);
         /* Using cursor T01TC40 */
         pr_default.execute(38, new Object[] {A396EmprCod, Boolean.valueOf(n13203ParUndID), Short.valueOf(A13203ParUndID)});
         A13204ParUndDsc = T01TC40_A13204ParUndDsc[0] ;
         n13204ParUndDsc = T01TC40_n13204ParUndDsc[0] ;
         pr_default.close(38);
      }
   }

   public void endLevel1TC1295( )
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

   public void scanStart1TC1295( )
   {
      /* Scan By routine */
      /* Using cursor T01TC41 */
      pr_default.execute(39, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A758ProCod, A9836FasCodM, A9830MaqCodC});
      RcdFound1295 = (short)(0) ;
      if ( (pr_default.getStatus(39) != 101) )
      {
         RcdFound1295 = (short)(1) ;
         A1664ParFasCod = T01TC41_A1664ParFasCod[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1TC1295( )
   {
      /* Scan next routine */
      pr_default.readNext(39);
      RcdFound1295 = (short)(0) ;
      if ( (pr_default.getStatus(39) != 101) )
      {
         RcdFound1295 = (short)(1) ;
         A1664ParFasCod = T01TC41_A1664ParFasCod[0] ;
      }
   }

   public void scanEnd1TC1295( )
   {
      pr_default.close(39);
   }

   public void afterConfirm1TC1295( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1TC1295( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1TC1295( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1TC1295( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1TC1295( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1TC1295( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1TC1295( )
   {
      edtParFasCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtParFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParFasCod_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtParFasPLC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtParFasPLC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParFasPLC_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtParFasDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtParFasDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParFasDsc_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtParFMVal2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtParFMVal2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParFMVal2_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtParFMVMin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtParFMVMin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParFMVMin_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtParFMVMax_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtParFMVMax_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParFMVMax_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtParFMObs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtParFMObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParFMObs_Enabled), 5, 0), !bGXsfl_80_Refreshing);
   }

   public void send_integrity_lvl_hashes1TC1295( )
   {
   }

   public void send_integrity_lvl_hashes1TC1294( )
   {
   }

   public void subsflControlProps_801295( )
   {
      edtParFasCod_Internalname = "PARFASCOD_"+sGXsfl_80_idx ;
      imgprompt_1664_Internalname = "PROMPT_1664_"+sGXsfl_80_idx ;
      edtParFasPLC_Internalname = "PARFASPLC_"+sGXsfl_80_idx ;
      edtParFasDsc_Internalname = "PARFASDSC_"+sGXsfl_80_idx ;
      edtParFMVal2_Internalname = "PARFMVAL2_"+sGXsfl_80_idx ;
      edtParFMVMin_Internalname = "PARFMVMIN_"+sGXsfl_80_idx ;
      edtParFMVMax_Internalname = "PARFMVMAX_"+sGXsfl_80_idx ;
      edtParFMObs_Internalname = "PARFMOBS_"+sGXsfl_80_idx ;
   }

   public void subsflControlProps_fel_801295( )
   {
      edtParFasCod_Internalname = "PARFASCOD_"+sGXsfl_80_fel_idx ;
      imgprompt_1664_Internalname = "PROMPT_1664_"+sGXsfl_80_fel_idx ;
      edtParFasPLC_Internalname = "PARFASPLC_"+sGXsfl_80_fel_idx ;
      edtParFasDsc_Internalname = "PARFASDSC_"+sGXsfl_80_fel_idx ;
      edtParFMVal2_Internalname = "PARFMVAL2_"+sGXsfl_80_fel_idx ;
      edtParFMVMin_Internalname = "PARFMVMIN_"+sGXsfl_80_fel_idx ;
      edtParFMVMax_Internalname = "PARFMVMAX_"+sGXsfl_80_fel_idx ;
      edtParFMObs_Internalname = "PARFMOBS_"+sGXsfl_80_fel_idx ;
   }

   public void addRow1TC1295( )
   {
      nGXsfl_80_idx = (int)(nGXsfl_80_idx+1) ;
      sGXsfl_80_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_80_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_801295( ) ;
      sendRow1TC1295( ) ;
   }

   public void sendRow1TC1295( )
   {
      Gridlevel_parametrosRow = GXWebRow.GetNew(context) ;
      if ( subGridlevel_parametros_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGridlevel_parametros_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGridlevel_parametros_Class, "") != 0 )
         {
            subGridlevel_parametros_Linesclass = subGridlevel_parametros_Class+"Odd" ;
         }
      }
      else if ( subGridlevel_parametros_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGridlevel_parametros_Backstyle = (byte)(0) ;
         subGridlevel_parametros_Backcolor = subGridlevel_parametros_Allbackcolor ;
         if ( GXutil.strcmp(subGridlevel_parametros_Class, "") != 0 )
         {
            subGridlevel_parametros_Linesclass = subGridlevel_parametros_Class+"Uniform" ;
         }
      }
      else if ( subGridlevel_parametros_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGridlevel_parametros_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGridlevel_parametros_Class, "") != 0 )
         {
            subGridlevel_parametros_Linesclass = subGridlevel_parametros_Class+"Odd" ;
         }
         subGridlevel_parametros_Backcolor = (int)(0x0) ;
      }
      else if ( subGridlevel_parametros_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGridlevel_parametros_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_80_idx) % (2))) == 0 )
         {
            subGridlevel_parametros_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridlevel_parametros_Class, "") != 0 )
            {
               subGridlevel_parametros_Linesclass = subGridlevel_parametros_Class+"Even" ;
            }
         }
         else
         {
            subGridlevel_parametros_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridlevel_parametros_Class, "") != 0 )
            {
               subGridlevel_parametros_Linesclass = subGridlevel_parametros_Class+"Odd" ;
            }
         }
      }
      imgprompt_1664_Link = ((GXutil.strcmp(Gx_mode, "DSP")==0) ? "" : "javascript:"+"gx.popup.openPrompt('"+"app.ficherosbasicos.tparfasprompt"+"',["+"{Ctrl:gx.dom.el('"+"EMPRCOD"+"'), id:'"+"EMPRCOD"+"'"+",IOType:'inout'}"+","+"{Ctrl:gx.dom.el('"+"PARFASCOD_"+sGXsfl_80_idx+"'), id:'"+"PARFASCOD_"+sGXsfl_80_idx+"'"+",IOType:'inout'}"+","+"{Ctrl:gx.dom.el('"+"PARFASDSC_"+sGXsfl_80_idx+"'), id:'"+"PARFASDSC_"+sGXsfl_80_idx+"'"+",IOType:'inout'}"+"],"+"gx.dom.form()."+"nIsMod_1295_"+sGXsfl_80_idx+","+"'', false"+","+"false"+");") ;
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1295_" + sGXsfl_80_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 81,'',false,'" + sGXsfl_80_idx + "',80)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_parametrosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtParFasCod_Internalname,GXutil.ltrim( localUtil.ntoc( A1664ParFasCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1664ParFasCod), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,81);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtParFasCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtParFasCod_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"",edtParFasCod_Horizontalalignment,Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Static images/pictures */
      ClassString = "gx-prompt Image" + " " + ((GXutil.strcmp(imgprompt_1664_gximage, "")==0) ? "" : "GX_Image_"+imgprompt_1664_gximage+"_Class") ;
      StyleString = "" ;
      sImgUrl = context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )) ;
      Gridlevel_parametrosRow.AddColumnProperties("bitmap", 1, isAjaxCallMode( ), new Object[] {imgprompt_1664_Internalname,sImgUrl,imgprompt_1664_Link,"","",context.getHttpContext().getTheme( ),Integer.valueOf(imgprompt_1664_Visible),Integer.valueOf(1),"","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"",Integer.valueOf(0),"",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"","",StyleString,ClassString,"","","","","","","",Integer.valueOf(1),Boolean.valueOf(false),Boolean.valueOf(false),context.getHttpContext().getImageSrcSet( sImgUrl)});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1295_" + sGXsfl_80_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 82,'',false,'" + sGXsfl_80_idx + "',80)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_parametrosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtParFasPLC_Internalname,A14080ParFasPLC,"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,82);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtParFasPLC_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtParFasPLC_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_parametrosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtParFasDsc_Internalname,GXutil.rtrim( A1665ParFasDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtParFasDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtParFasDsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1295_" + sGXsfl_80_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 84,'',false,'" + sGXsfl_80_idx + "',80)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_parametrosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtParFMVal2_Internalname,GXutil.rtrim( A14077ParFMVal2),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,84);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtParFMVal2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtParFMVal2_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1295_" + sGXsfl_80_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 85,'',false,'" + sGXsfl_80_idx + "',80)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_parametrosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtParFMVMin_Internalname,GXutil.rtrim( A14075ParFMVMin),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,85);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtParFMVMin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtParFMVMin_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1295_" + sGXsfl_80_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 86,'',false,'" + sGXsfl_80_idx + "',80)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_parametrosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtParFMVMax_Internalname,GXutil.rtrim( A14076ParFMVMax),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,86);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtParFMVMax_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtParFMVMax_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1295_" + sGXsfl_80_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 87,'',false,'" + sGXsfl_80_idx + "',80)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_parametrosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtParFMObs_Internalname,A9829ParFMObs,"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,87);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtParFMObs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtParFMObs_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(400),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Gridlevel_parametrosRow);
      send_integrity_lvl_hashes1TC1295( ) ;
      GXCCtl = "Z1664ParFasCod_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z1664ParFasCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z9828ParFMVal_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z9828ParFMVal));
      GXCCtl = "Z9829ParFMObs_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, Z9829ParFMObs);
      GXCCtl = "Z10256Itm_ord2_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z10256Itm_ord2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z14075ParFMVMin_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z14075ParFMVMin));
      GXCCtl = "Z14076ParFMVMax_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z14076ParFMVMax));
      GXCCtl = "Z14077ParFMVal2_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z14077ParFMVal2));
      GXCCtl = "Z14080ParFasPLC_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, Z14080ParFasPLC);
      GXCCtl = "Z12448ParEspIdS_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z12448ParEspIdS, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1295_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1295, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1295_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1295, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1295_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1295, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vMODE_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Gx_mode));
      GXCCtl = "vTRNCONTEXT_" + sGXsfl_80_idx ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, GXCCtl, AV14TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(GXCCtl, AV14TrnContext);
      }
      GXCCtl = "vEMPRCOD_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV7EmprCod));
      GXCCtl = "vCLICOD_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV8CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vARTCOD_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV9ArtCod));
      GXCCtl = "vPROCOD_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV10ProCod));
      GXCCtl = "vFASCODM_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV11FasCodM));
      GXCCtl = "vMAQCODC_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV12MaqCodC));
      GXCCtl = "PARESPDCS_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( A12449ParEspDcS));
      app.GxWebStd.gx_hidden_field( httpContext, "PARFASCOD_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParFasCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PARFASCOD_"+sGXsfl_80_idx+"Horizontalalignment", GXutil.rtrim( edtParFasCod_Horizontalalignment));
      app.GxWebStd.gx_hidden_field( httpContext, "PARFASPLC_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParFasPLC_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PARFASDSC_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParFasDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PARFMVAL2_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParFMVal2_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PARFMVMIN_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParFMVMin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PARFMVMAX_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParFMVMax_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PARFMOBS_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParFMObs_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PROMPT_1664_"+sGXsfl_80_idx+"Link", GXutil.rtrim( imgprompt_1664_Link));
      httpContext.ajax_sending_grid_row(null);
      Gridlevel_parametrosContainer.AddRow(Gridlevel_parametrosRow);
   }

   public void readRow1TC1295( )
   {
      nGXsfl_80_idx = (int)(nGXsfl_80_idx+1) ;
      sGXsfl_80_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_80_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_801295( ) ;
      edtParFasCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PARFASCOD_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtParFasCod_Horizontalalignment = httpContext.cgiGet( "PARFASCOD_"+sGXsfl_80_idx+"Horizontalalignment") ;
      edtParFasPLC_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PARFASPLC_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtParFasDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PARFASDSC_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtParFMVal2_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PARFMVAL2_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtParFMVMin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PARFMVMIN_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtParFMVMax_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PARFMVMAX_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtParFMObs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PARFMOBS_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      imgprompt_1664_Link = httpContext.cgiGet( "PROMPT_1664_"+sGXsfl_80_idx+"Link") ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtParFasCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtParFasCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "PARFASCOD_" + sGXsfl_80_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtParFasCod_Internalname ;
         wbErr = true ;
         A1664ParFasCod = (short)(0) ;
      }
      else
      {
         A1664ParFasCod = (short)(localUtil.ctol( httpContext.cgiGet( edtParFasCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A14080ParFasPLC = httpContext.cgiGet( edtParFasPLC_Internalname) ;
      A1665ParFasDsc = httpContext.cgiGet( edtParFasDsc_Internalname) ;
      n1665ParFasDsc = false ;
      A14077ParFMVal2 = httpContext.cgiGet( edtParFMVal2_Internalname) ;
      A14075ParFMVMin = httpContext.cgiGet( edtParFMVMin_Internalname) ;
      A14076ParFMVMax = httpContext.cgiGet( edtParFMVMax_Internalname) ;
      A9829ParFMObs = httpContext.cgiGet( edtParFMObs_Internalname) ;
      GXCCtl = "Z1664ParFasCod_" + sGXsfl_80_idx ;
      Z1664ParFasCod = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z9828ParFMVal_" + sGXsfl_80_idx ;
      Z9828ParFMVal = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z9829ParFMObs_" + sGXsfl_80_idx ;
      Z9829ParFMObs = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z10256Itm_ord2_" + sGXsfl_80_idx ;
      Z10256Itm_ord2 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z14075ParFMVMin_" + sGXsfl_80_idx ;
      Z14075ParFMVMin = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z14076ParFMVMax_" + sGXsfl_80_idx ;
      Z14076ParFMVMax = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z14077ParFMVal2_" + sGXsfl_80_idx ;
      Z14077ParFMVal2 = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z14080ParFasPLC_" + sGXsfl_80_idx ;
      Z14080ParFasPLC = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z12448ParEspIdS_" + sGXsfl_80_idx ;
      Z12448ParEspIdS = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z9828ParFMVal_" + sGXsfl_80_idx ;
      A9828ParFMVal = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z10256Itm_ord2_" + sGXsfl_80_idx ;
      A10256Itm_ord2 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z12448ParEspIdS_" + sGXsfl_80_idx ;
      A12448ParEspIdS = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      n12448ParEspIdS = false ;
      GXCCtl = "nRcdDeleted_1295_" + sGXsfl_80_idx ;
      nRcdDeleted_1295 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1295_" + sGXsfl_80_idx ;
      nRcdExists_1295 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1295_" + sGXsfl_80_idx ;
      nIsMod_1295 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "PARESPDCS_" + sGXsfl_80_idx ;
      A12449ParEspDcS = httpContext.cgiGet( GXCCtl) ;
   }

   public void assign_properties_default( )
   {
      defedtParFasDsc_Enabled = edtParFasDsc_Enabled ;
      defedtParFasCod_Enabled = edtParFasCod_Enabled ;
   }

   public void confirmValues1TC0( )
   {
      nGXsfl_80_idx = 0 ;
      sGXsfl_80_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_80_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_801295( ) ;
      while ( nGXsfl_80_idx < nRC_GXsfl_80 )
      {
         nGXsfl_80_idx = (int)(nGXsfl_80_idx+1) ;
         sGXsfl_80_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_80_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_801295( ) ;
         httpContext.changePostValue( "Z1664ParFasCod_"+sGXsfl_80_idx, httpContext.cgiGet( "ZT_"+"Z1664ParFasCod_"+sGXsfl_80_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1664ParFasCod_"+sGXsfl_80_idx) ;
         httpContext.changePostValue( "Z9828ParFMVal_"+sGXsfl_80_idx, httpContext.cgiGet( "ZT_"+"Z9828ParFMVal_"+sGXsfl_80_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9828ParFMVal_"+sGXsfl_80_idx) ;
         httpContext.changePostValue( "Z9829ParFMObs_"+sGXsfl_80_idx, httpContext.cgiGet( "ZT_"+"Z9829ParFMObs_"+sGXsfl_80_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9829ParFMObs_"+sGXsfl_80_idx) ;
         httpContext.changePostValue( "Z10256Itm_ord2_"+sGXsfl_80_idx, httpContext.cgiGet( "ZT_"+"Z10256Itm_ord2_"+sGXsfl_80_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10256Itm_ord2_"+sGXsfl_80_idx) ;
         httpContext.changePostValue( "Z14075ParFMVMin_"+sGXsfl_80_idx, httpContext.cgiGet( "ZT_"+"Z14075ParFMVMin_"+sGXsfl_80_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z14075ParFMVMin_"+sGXsfl_80_idx) ;
         httpContext.changePostValue( "Z14076ParFMVMax_"+sGXsfl_80_idx, httpContext.cgiGet( "ZT_"+"Z14076ParFMVMax_"+sGXsfl_80_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z14076ParFMVMax_"+sGXsfl_80_idx) ;
         httpContext.changePostValue( "Z14077ParFMVal2_"+sGXsfl_80_idx, httpContext.cgiGet( "ZT_"+"Z14077ParFMVal2_"+sGXsfl_80_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z14077ParFMVal2_"+sGXsfl_80_idx) ;
         httpContext.changePostValue( "Z14080ParFasPLC_"+sGXsfl_80_idx, httpContext.cgiGet( "ZT_"+"Z14080ParFasPLC_"+sGXsfl_80_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z14080ParFasPLC_"+sGXsfl_80_idx) ;
         httpContext.changePostValue( "Z12448ParEspIdS_"+sGXsfl_80_idx, httpContext.cgiGet( "ZT_"+"Z12448ParEspIdS_"+sGXsfl_80_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12448ParEspIdS_"+sGXsfl_80_idx) ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.ingenieria.capfm_p", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV7EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV8CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV9ArtCod)),GXutil.URLEncode(GXutil.rtrim(AV10ProCod)),GXutil.URLEncode(GXutil.rtrim(AV11FasCodM)),GXutil.URLEncode(GXutil.rtrim(AV12MaqCodC))}, new String[] {"Gx_mode","EmprCod","CliCod","ArtCod","ProCod","FasCodM","MaqCodC"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"CAPFM_P");
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      forbiddenHiddens.add("MaqAncC", localUtil.format( DecimalUtil.doubleToDec(A9869MaqAncC), "ZZ9"));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("ingenieria\\capfm_p:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z65ArtCod", GXutil.rtrim( Z65ArtCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z758ProCod", GXutil.rtrim( Z758ProCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9836FasCodM", GXutil.rtrim( Z9836FasCodM));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9830MaqCodC", GXutil.rtrim( Z9830MaqCodC));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9869MaqAncC", GXutil.ltrim( localUtil.ntoc( Z9869MaqAncC, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_80", GXutil.ltrim( localUtil.ntoc( nGXsfl_80_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV17DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV17DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCLICOD_DATA", AV16CliCod_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCLICOD_DATA", AV16CliCod_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vARTCOD_DATA", AV20ArtCod_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vARTCOD_DATA", AV20ArtCod_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vPROCOD_DATA", AV22ProCod_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vPROCOD_DATA", AV22ProCod_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vFASCODM_DATA", AV24FasCodM_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vFASCODM_DATA", AV24FasCodM_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vMAQCODC_DATA", AV26MaqCodC_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vMAQCODC_DATA", AV26MaqCodC_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vPARFASCOD_DATA", AV28ParFasCod_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vPARFASCOD_DATA", AV28ParFasCod_Data);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTRNCONTEXT", AV14TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTRNCONTEXT", AV14TrnContext);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTRNCONTEXT", getSecureSignedToken( "", AV14TrnContext));
      app.GxWebStd.gx_hidden_field( httpContext, "FASDSCM", GXutil.rtrim( A9837FasDscM));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQDSCD", GXutil.rtrim( A9831MaqDscD));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV7EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vCLICOD", GXutil.ltrim( localUtil.ntoc( AV8CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vARTCOD", GXutil.rtrim( AV9ArtCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vARTCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV9ArtCod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vPROCOD", GXutil.rtrim( AV10ProCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vFASCODM", GXutil.rtrim( AV11FasCodM));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFASCODM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV11FasCodM, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCODC", GXutil.rtrim( AV12MaqCodC));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCODC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV12MaqCodC, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQANCC", GXutil.ltrim( localUtil.ntoc( A9869MaqAncC, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRNOM", GXutil.rtrim( A407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "CLINOM", GXutil.rtrim( A279CliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "ARTDSC", GXutil.rtrim( A69ArtDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "PRODSC", GXutil.rtrim( A759ProDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "PARFMVAL", GXutil.rtrim( A9828ParFMVal));
      app.GxWebStd.gx_hidden_field( httpContext, "ITM_ORD2", GXutil.ltrim( localUtil.ntoc( A10256Itm_ord2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PARESPIDS", GXutil.ltrim( localUtil.ntoc( A12448ParEspIdS, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PARUNDID", GXutil.ltrim( localUtil.ntoc( A13203ParUndID, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PARESPDCS", GXutil.rtrim( A12449ParEspDcS));
      app.GxWebStd.gx_hidden_field( httpContext, "PARUNDDSC", GXutil.rtrim( A13204ParUndDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICOD_Objectcall", GXutil.rtrim( Combo_clicod_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICOD_Cls", GXutil.rtrim( Combo_clicod_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICOD_Selectedvalue_set", GXutil.rtrim( Combo_clicod_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICOD_Enabled", GXutil.booltostr( Combo_clicod_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICOD_Emptyitemtext", GXutil.rtrim( Combo_clicod_Emptyitemtext));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_ARTCOD_Objectcall", GXutil.rtrim( Combo_artcod_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_ARTCOD_Cls", GXutil.rtrim( Combo_artcod_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_ARTCOD_Selectedvalue_set", GXutil.rtrim( Combo_artcod_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_ARTCOD_Enabled", GXutil.booltostr( Combo_artcod_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_ARTCOD_Emptyitemtext", GXutil.rtrim( Combo_artcod_Emptyitemtext));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PROCOD_Objectcall", GXutil.rtrim( Combo_procod_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PROCOD_Cls", GXutil.rtrim( Combo_procod_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PROCOD_Selectedvalue_set", GXutil.rtrim( Combo_procod_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PROCOD_Enabled", GXutil.booltostr( Combo_procod_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PROCOD_Emptyitemtext", GXutil.rtrim( Combo_procod_Emptyitemtext));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_FASCODM_Objectcall", GXutil.rtrim( Combo_fascodm_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_FASCODM_Cls", GXutil.rtrim( Combo_fascodm_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_FASCODM_Selectedvalue_set", GXutil.rtrim( Combo_fascodm_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_FASCODM_Enabled", GXutil.booltostr( Combo_fascodm_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_FASCODM_Emptyitemtext", GXutil.rtrim( Combo_fascodm_Emptyitemtext));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MAQCODC_Objectcall", GXutil.rtrim( Combo_maqcodc_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MAQCODC_Cls", GXutil.rtrim( Combo_maqcodc_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MAQCODC_Selectedvalue_set", GXutil.rtrim( Combo_maqcodc_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MAQCODC_Enabled", GXutil.booltostr( Combo_maqcodc_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MAQCODC_Emptyitemtext", GXutil.rtrim( Combo_maqcodc_Emptyitemtext));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLELEAFLEVEL_PARAMETROS_Objectcall", GXutil.rtrim( Dvpanel_tableleaflevel_parametros_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLELEAFLEVEL_PARAMETROS_Enabled", GXutil.booltostr( Dvpanel_tableleaflevel_parametros_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLELEAFLEVEL_PARAMETROS_Width", GXutil.rtrim( Dvpanel_tableleaflevel_parametros_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLELEAFLEVEL_PARAMETROS_Autowidth", GXutil.booltostr( Dvpanel_tableleaflevel_parametros_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLELEAFLEVEL_PARAMETROS_Autoheight", GXutil.booltostr( Dvpanel_tableleaflevel_parametros_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLELEAFLEVEL_PARAMETROS_Cls", GXutil.rtrim( Dvpanel_tableleaflevel_parametros_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLELEAFLEVEL_PARAMETROS_Title", GXutil.rtrim( Dvpanel_tableleaflevel_parametros_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLELEAFLEVEL_PARAMETROS_Collapsible", GXutil.booltostr( Dvpanel_tableleaflevel_parametros_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLELEAFLEVEL_PARAMETROS_Collapsed", GXutil.booltostr( Dvpanel_tableleaflevel_parametros_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLELEAFLEVEL_PARAMETROS_Showcollapseicon", GXutil.booltostr( Dvpanel_tableleaflevel_parametros_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLELEAFLEVEL_PARAMETROS_Iconposition", GXutil.rtrim( Dvpanel_tableleaflevel_parametros_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLELEAFLEVEL_PARAMETROS_Autoscroll", GXutil.booltostr( Dvpanel_tableleaflevel_parametros_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PARFASCOD_Objectcall", GXutil.rtrim( Combo_parfascod_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PARFASCOD_Cls", GXutil.rtrim( Combo_parfascod_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PARFASCOD_Enabled", GXutil.booltostr( Combo_parfascod_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PARFASCOD_Titlecontrolidtoreplace", GXutil.rtrim( Combo_parfascod_Titlecontrolidtoreplace));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PARFASCOD_Isgriditem", GXutil.booltostr( Combo_parfascod_Isgriditem));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PARFASCOD_Emptyitem", GXutil.booltostr( Combo_parfascod_Emptyitem));
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
      return formatLink("app.ingenieria.capfm_p", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV7EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV8CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV9ArtCod)),GXutil.URLEncode(GXutil.rtrim(AV10ProCod)),GXutil.URLEncode(GXutil.rtrim(AV11FasCodM)),GXutil.URLEncode(GXutil.rtrim(AV12MaqCodC))}, new String[] {"Gx_mode","EmprCod","CliCod","ArtCod","ProCod","FasCodM","MaqCodC"})  ;
   }

   public String getPgmname( )
   {
      return "Ingenieria.CAPFM_P" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Parámetros Fases-Máquinas", "") ;
   }

   public void initializeNonKey1TC1294( )
   {
      A9831MaqDscD = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A9831MaqDscD", A9831MaqDscD);
      A9837FasDscM = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A9837FasDscM", A9837FasDscM);
      A407EmprNom = "" ;
      n407EmprNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      A279CliNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      A69ArtDsc = "" ;
      n69ArtDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", A69ArtDsc);
      A759ProDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", A759ProDsc);
      A9869MaqAncC = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A9869MaqAncC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9869MaqAncC), 3, 0));
      Z9869MaqAncC = (short)(0) ;
   }

   public void initAll1TC1294( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A252CliCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A65ArtCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
      A758ProCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
      A9836FasCodM = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A9836FasCodM", A9836FasCodM);
      A9830MaqCodC = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A9830MaqCodC", A9830MaqCodC);
      initializeNonKey1TC1294( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1TC1295( )
   {
      A1665ParFasDsc = "" ;
      n1665ParFasDsc = false ;
      A9828ParFMVal = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A9828ParFMVal", A9828ParFMVal);
      A9829ParFMObs = "" ;
      A10256Itm_ord2 = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A10256Itm_ord2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10256Itm_ord2), 4, 0));
      A12448ParEspIdS = (short)(0) ;
      n12448ParEspIdS = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12448ParEspIdS", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12448ParEspIdS), 4, 0));
      A12449ParEspDcS = "" ;
      n12449ParEspDcS = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12449ParEspDcS", A12449ParEspDcS);
      A13203ParUndID = (short)(0) ;
      n13203ParUndID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13203ParUndID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13203ParUndID), 4, 0));
      A13204ParUndDsc = "" ;
      n13204ParUndDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13204ParUndDsc", A13204ParUndDsc);
      A14075ParFMVMin = "" ;
      A14076ParFMVMax = "" ;
      A14077ParFMVal2 = "" ;
      A14080ParFasPLC = "" ;
      Z9828ParFMVal = "" ;
      Z9829ParFMObs = "" ;
      Z10256Itm_ord2 = (short)(0) ;
      Z14075ParFMVMin = "" ;
      Z14076ParFMVMax = "" ;
      Z14077ParFMVal2 = "" ;
      Z14080ParFasPLC = "" ;
      Z12448ParEspIdS = (short)(0) ;
   }

   public void initAll1TC1295( )
   {
      A1664ParFasCod = (short)(0) ;
      initializeNonKey1TC1295( ) ;
   }

   public void standaloneModalInsert1TC1295( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116101497", true, true);
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
      httpContext.AddJavascriptSource("ingenieria/capfm_p.js", "?202682116101497", false, true);
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1295( )
   {
      edtParFasDsc_Enabled = defedtParFasDsc_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtParFasDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParFasDsc_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtParFasCod_Enabled = defedtParFasCod_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtParFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParFasCod_Enabled), 5, 0), !bGXsfl_80_Refreshing);
   }

   public void startgridcontrol80( )
   {
      Gridlevel_parametrosContainer.AddObjectProperty("GridName", "Gridlevel_parametros");
      Gridlevel_parametrosContainer.AddObjectProperty("Header", subGridlevel_parametros_Header);
      Gridlevel_parametrosContainer.AddObjectProperty("Class", "GridNoBorder WorkWith");
      Gridlevel_parametrosContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_parametrosContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_parametrosContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridlevel_parametros_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_parametrosContainer.AddObjectProperty("CmpContext", "");
      Gridlevel_parametrosContainer.AddObjectProperty("InMasterPage", "false");
      Gridlevel_parametrosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_parametrosColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1664ParFasCod, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_parametrosColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtParFasCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_parametrosColumn.AddObjectProperty("Horizontalalignment", GXutil.rtrim( edtParFasCod_Horizontalalignment));
      Gridlevel_parametrosContainer.AddColumnProperties(Gridlevel_parametrosColumn);
      Gridlevel_parametrosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_parametrosContainer.AddColumnProperties(Gridlevel_parametrosColumn);
      Gridlevel_parametrosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_parametrosColumn.AddObjectProperty("Value", A14080ParFasPLC);
      Gridlevel_parametrosColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtParFasPLC_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_parametrosContainer.AddColumnProperties(Gridlevel_parametrosColumn);
      Gridlevel_parametrosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_parametrosColumn.AddObjectProperty("Value", GXutil.rtrim( A1665ParFasDsc));
      Gridlevel_parametrosColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtParFasDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_parametrosContainer.AddColumnProperties(Gridlevel_parametrosColumn);
      Gridlevel_parametrosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_parametrosColumn.AddObjectProperty("Value", GXutil.rtrim( A14077ParFMVal2));
      Gridlevel_parametrosColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtParFMVal2_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_parametrosContainer.AddColumnProperties(Gridlevel_parametrosColumn);
      Gridlevel_parametrosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_parametrosColumn.AddObjectProperty("Value", GXutil.rtrim( A14075ParFMVMin));
      Gridlevel_parametrosColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtParFMVMin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_parametrosContainer.AddColumnProperties(Gridlevel_parametrosColumn);
      Gridlevel_parametrosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_parametrosColumn.AddObjectProperty("Value", GXutil.rtrim( A14076ParFMVMax));
      Gridlevel_parametrosColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtParFMVMax_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_parametrosContainer.AddColumnProperties(Gridlevel_parametrosColumn);
      Gridlevel_parametrosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_parametrosColumn.AddObjectProperty("Value", A9829ParFMObs);
      Gridlevel_parametrosColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtParFMObs_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_parametrosContainer.AddColumnProperties(Gridlevel_parametrosColumn);
      Gridlevel_parametrosContainer.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGridlevel_parametros_Selectedindex, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_parametrosContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGridlevel_parametros_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_parametrosContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGridlevel_parametros_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Gridlevel_parametrosContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGridlevel_parametros_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_parametrosContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGridlevel_parametros_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Gridlevel_parametrosContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGridlevel_parametros_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_parametrosContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGridlevel_parametros_Collapsed, (byte)(1), (byte)(0), ".", "")));
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
      lblTextblockprocod_Internalname = "TEXTBLOCKPROCOD" ;
      Combo_procod_Internalname = "COMBO_PROCOD" ;
      edtProCod_Internalname = "PROCOD" ;
      divTablesplittedprocod_Internalname = "TABLESPLITTEDPROCOD" ;
      lblTextblockfascodm_Internalname = "TEXTBLOCKFASCODM" ;
      Combo_fascodm_Internalname = "COMBO_FASCODM" ;
      edtFasCodM_Internalname = "FASCODM" ;
      divTablesplittedfascodm_Internalname = "TABLESPLITTEDFASCODM" ;
      lblTextblockmaqcodc_Internalname = "TEXTBLOCKMAQCODC" ;
      Combo_maqcodc_Internalname = "COMBO_MAQCODC" ;
      edtMaqCodC_Internalname = "MAQCODC" ;
      divTablesplittedmaqcodc_Internalname = "TABLESPLITTEDMAQCODC" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      edtParFasCod_Internalname = "PARFASCOD" ;
      edtParFasPLC_Internalname = "PARFASPLC" ;
      edtParFasDsc_Internalname = "PARFASDSC" ;
      edtParFMVal2_Internalname = "PARFMVAL2" ;
      edtParFMVMin_Internalname = "PARFMVMIN" ;
      edtParFMVMax_Internalname = "PARFMVMAX" ;
      edtParFMObs_Internalname = "PARFMOBS" ;
      divTableleaflevel_parametros_Internalname = "TABLELEAFLEVEL_PARAMETROS" ;
      Dvpanel_tableleaflevel_parametros_Internalname = "DVPANEL_TABLELEAFLEVEL_PARAMETROS" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      bttBtntrn_delete_Internalname = "BTNTRN_DELETE" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtavComboclicod_Internalname = "vCOMBOCLICOD" ;
      divSectionattribute_clicod_Internalname = "SECTIONATTRIBUTE_CLICOD" ;
      edtavComboartcod_Internalname = "vCOMBOARTCOD" ;
      divSectionattribute_artcod_Internalname = "SECTIONATTRIBUTE_ARTCOD" ;
      edtavComboprocod_Internalname = "vCOMBOPROCOD" ;
      divSectionattribute_procod_Internalname = "SECTIONATTRIBUTE_PROCOD" ;
      edtavCombofascodm_Internalname = "vCOMBOFASCODM" ;
      divSectionattribute_fascodm_Internalname = "SECTIONATTRIBUTE_FASCODM" ;
      edtavCombomaqcodc_Internalname = "vCOMBOMAQCODC" ;
      divSectionattribute_maqcodc_Internalname = "SECTIONATTRIBUTE_MAQCODC" ;
      Combo_parfascod_Internalname = "COMBO_PARFASCOD" ;
      edtEmprCod_Internalname = "EMPRCOD" ;
      divHtml_bottomauxiliarcontrols_Internalname = "HTML_BOTTOMAUXILIARCONTROLS" ;
      divLayoutmaintable_Internalname = "LAYOUTMAINTABLE" ;
      Form.setInternalname( "FORM" );
      imgprompt_1664_Internalname = "PROMPT_1664" ;
      subGridlevel_parametros_Internalname = "GRIDLEVEL_PARAMETROS" ;
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
      subGridlevel_parametros_Allowcollapsing = (byte)(0) ;
      subGridlevel_parametros_Allowselection = (byte)(0) ;
      subGridlevel_parametros_Header = "" ;
      Combo_parfascod_Enabled = GXutil.toBoolean( -1) ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Parámetros Fases-Máquinas", "") );
      edtParFMObs_Jsonclick = "" ;
      edtParFMVMax_Jsonclick = "" ;
      edtParFMVMin_Jsonclick = "" ;
      edtParFMVal2_Jsonclick = "" ;
      edtParFasDsc_Jsonclick = "" ;
      edtParFasPLC_Jsonclick = "" ;
      imgprompt_1664_Visible = 1 ;
      imgprompt_1664_Link = "" ;
      imgprompt_1664_Visible = 1 ;
      edtParFasCod_Jsonclick = "" ;
      subGridlevel_parametros_Class = "GridNoBorder WorkWith" ;
      subGridlevel_parametros_Backcolorstyle = (byte)(0) ;
      Combo_parfascod_Titlecontrolidtoreplace = "" ;
      edtParFMObs_Enabled = 1 ;
      edtParFMVMax_Enabled = 1 ;
      edtParFMVMin_Enabled = 1 ;
      edtParFMVal2_Enabled = 1 ;
      edtParFasDsc_Enabled = 0 ;
      edtParFasPLC_Enabled = 1 ;
      edtParFasCod_Enabled = 1 ;
      edtEmprCod_Jsonclick = "" ;
      edtEmprCod_Enabled = 0 ;
      edtEmprCod_Visible = 1 ;
      Combo_parfascod_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_parfascod_Isgriditem = GXutil.toBoolean( -1) ;
      Combo_parfascod_Cls = "ExtendedCombo" ;
      Combo_parfascod_Caption = "" ;
      edtavCombomaqcodc_Jsonclick = "" ;
      edtavCombomaqcodc_Enabled = 0 ;
      edtavCombomaqcodc_Visible = 1 ;
      edtavCombofascodm_Jsonclick = "" ;
      edtavCombofascodm_Enabled = 0 ;
      edtavCombofascodm_Visible = 1 ;
      edtavComboprocod_Jsonclick = "" ;
      edtavComboprocod_Enabled = 0 ;
      edtavComboprocod_Visible = 1 ;
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
      Dvpanel_tableleaflevel_parametros_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_tableleaflevel_parametros_Iconposition = "Right" ;
      Dvpanel_tableleaflevel_parametros_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_tableleaflevel_parametros_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_tableleaflevel_parametros_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_tableleaflevel_parametros_Title = httpContext.getMessage( "Parámetros", "") ;
      Dvpanel_tableleaflevel_parametros_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_tableleaflevel_parametros_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_tableleaflevel_parametros_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_tableleaflevel_parametros_Width = "100%" ;
      edtMaqCodC_Jsonclick = "" ;
      edtMaqCodC_Enabled = 1 ;
      edtMaqCodC_Visible = 1 ;
      Combo_maqcodc_Emptyitemtext = "" ;
      Combo_maqcodc_Cls = "ExtendedCombo AttributeFL" ;
      Combo_maqcodc_Caption = "" ;
      Combo_maqcodc_Enabled = GXutil.toBoolean( -1) ;
      edtFasCodM_Jsonclick = "" ;
      edtFasCodM_Enabled = 1 ;
      edtFasCodM_Visible = 1 ;
      Combo_fascodm_Emptyitemtext = "" ;
      Combo_fascodm_Cls = "ExtendedCombo AttributeFL" ;
      Combo_fascodm_Caption = "" ;
      Combo_fascodm_Enabled = GXutil.toBoolean( -1) ;
      edtProCod_Jsonclick = "" ;
      edtProCod_Enabled = 1 ;
      edtProCod_Visible = 1 ;
      Combo_procod_Emptyitemtext = "" ;
      Combo_procod_Cls = "ExtendedCombo AttributeFL" ;
      Combo_procod_Caption = "" ;
      Combo_procod_Enabled = GXutil.toBoolean( -1) ;
      edtArtCod_Jsonclick = "" ;
      edtArtCod_Enabled = 1 ;
      edtArtCod_Visible = 1 ;
      Combo_artcod_Emptyitemtext = "" ;
      Combo_artcod_Cls = "ExtendedCombo AttributeFL" ;
      Combo_artcod_Caption = "" ;
      Combo_artcod_Enabled = GXutil.toBoolean( -1) ;
      edtCliCod_Jsonclick = "" ;
      edtCliCod_Enabled = 1 ;
      edtCliCod_Visible = 1 ;
      Combo_clicod_Emptyitemtext = "" ;
      Combo_clicod_Cls = "ExtendedCombo AttributeFL" ;
      Combo_clicod_Caption = "" ;
      Combo_clicod_Enabled = GXutil.toBoolean( -1) ;
      Dvpanel_tableattributes_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Iconposition = "Right" ;
      Dvpanel_tableattributes_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_tableattributes_Title = httpContext.getMessage( "Cliente-Artículo-Proceso-Fase-Máquina", "") ;
      Dvpanel_tableattributes_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_tableattributes_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_tableattributes_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Width = "100%" ;
      edtParFasCod_Horizontalalignment = "right" ;
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

   public void gx1asafasdscm1TC1294( String A396EmprCod ,
                                     String A9836FasCodM )
   {
      GXt_char1 = A9837FasDscM ;
      GXv_char4[0] = GXt_char1 ;
      new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A9836FasCodM, GXv_char4) ;
      capfm_p_impl.this.GXt_char1 = GXv_char4[0] ;
      A9837FasDscM = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A9837FasDscM", A9837FasDscM);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A9837FasDscM))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gx2asamaqdscd1TC1294( String A396EmprCod ,
                                     String A9830MaqCodC )
   {
      GXt_char1 = A9831MaqDscD ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = A9830MaqCodC ;
      GXv_char2[0] = GXt_char1 ;
      new app.pmaqdsc(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
      capfm_p_impl.this.A396EmprCod = GXv_char4[0] ;
      capfm_p_impl.this.A9830MaqCodC = GXv_char3[0] ;
      capfm_p_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A9830MaqCodC", A9830MaqCodC);
      A9831MaqDscD = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A9831MaqDscD", A9831MaqDscD);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A9831MaqDscD))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gxnrgridlevel_parametros_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_801295( ) ;
      while ( nGXsfl_80_idx <= nRC_GXsfl_80 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1TC1295( ) ;
         standaloneModal1TC1295( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1TC1295( ) ;
         nGXsfl_80_idx = (int)(nGXsfl_80_idx+1) ;
         sGXsfl_80_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_80_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_801295( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Gridlevel_parametrosContainer)) ;
      /* End function gxnrGridlevel_parametros_newrow */
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

   public void valid_Emprcod( )
   {
      n407EmprNom = false ;
      n69ArtDsc = false ;
      /* Using cursor T01TC26 */
      pr_default.execute(24, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(24) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A407EmprNom = T01TC26_A407EmprNom[0] ;
      n407EmprNom = T01TC26_n407EmprNom[0] ;
      pr_default.close(24);
      /* Using cursor T01TC27 */
      pr_default.execute(25, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(25) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A279CliNom = T01TC27_A279CliNom[0] ;
      pr_default.close(25);
      /* Using cursor T01TC28 */
      pr_default.execute(26, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
      if ( (pr_default.getStatus(26) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ARTICU", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ARTCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A69ArtDsc = T01TC28_A69ArtDsc[0] ;
      n69ArtDsc = T01TC28_n69ArtDsc[0] ;
      pr_default.close(26);
      /* Using cursor T01TC29 */
      pr_default.execute(27, new Object[] {A396EmprCod, A758ProCod});
      if ( (pr_default.getStatus(27) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PROCES", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A759ProDsc = T01TC29_A759ProDsc[0] ;
      pr_default.close(27);
      /* Using cursor T01TC42 */
      pr_default.execute(40, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A758ProCod, A9836FasCodM});
      if ( (pr_default.getStatus(40) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CAPFMP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FASCODM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      pr_default.close(40);
      GXt_char1 = A9837FasDscM ;
      GXv_char4[0] = GXt_char1 ;
      new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A9836FasCodM, GXv_char4) ;
      capfm_p_impl.this.GXt_char1 = GXv_char4[0] ;
      A9837FasDscM = GXt_char1 ;
      GXt_char1 = A9831MaqDscD ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = A9830MaqCodC ;
      GXv_char2[0] = GXt_char1 ;
      new app.pmaqdsc(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
      capfm_p_impl.this.A396EmprCod = GXv_char4[0] ;
      capfm_p_impl.this.A9830MaqCodC = GXv_char3[0] ;
      capfm_p_impl.this.GXt_char1 = GXv_char2[0] ;
      A9831MaqDscD = GXt_char1 ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
      httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", GXutil.rtrim( A69ArtDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", GXutil.rtrim( A759ProDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A9837FasDscM", GXutil.rtrim( A9837FasDscM));
      httpContext.ajax_rsp_assign_attri("", false, "A9831MaqDscD", GXutil.rtrim( A9831MaqDscD));
   }

   public void valid_Parfascod( )
   {
      n13203ParUndID = false ;
      n1665ParFasDsc = false ;
      n13204ParUndDsc = false ;
      /* Using cursor T01TC39 */
      pr_default.execute(37, new Object[] {A396EmprCod, Short.valueOf(A1664ParFasCod)});
      if ( (pr_default.getStatus(37) == 101) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Ingrese un parámetro válido, por favor.", ""), "ForeignKeyNotFound", 1, "PARFASCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtParFasCod_Internalname ;
      }
      A1665ParFasDsc = T01TC39_A1665ParFasDsc[0] ;
      n1665ParFasDsc = T01TC39_n1665ParFasDsc[0] ;
      A13203ParUndID = T01TC39_A13203ParUndID[0] ;
      n13203ParUndID = T01TC39_n13203ParUndID[0] ;
      pr_default.close(37);
      /* Using cursor T01TC40 */
      pr_default.execute(38, new Object[] {A396EmprCod, Boolean.valueOf(n13203ParUndID), Short.valueOf(A13203ParUndID)});
      if ( (pr_default.getStatus(38) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A13203ParUndID) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "UNIDADES PARAMETROS FASES", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PARUNDID");
            AnyError = (short)(1) ;
         }
      }
      A13204ParUndDsc = T01TC40_A13204ParUndDsc[0] ;
      n13204ParUndDsc = T01TC40_n13204ParUndDsc[0] ;
      pr_default.close(38);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A1665ParFasDsc", GXutil.rtrim( A1665ParFasDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A13203ParUndID", GXutil.ltrim( localUtil.ntoc( A13203ParUndID, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A13204ParUndDsc", GXutil.rtrim( A13204ParUndDsc));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV8CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV9ArtCod',fld:'vARTCOD',pic:'',hsh:true},{av:'AV10ProCod',fld:'vPROCOD',pic:''},{av:'AV11FasCodM',fld:'vFASCODM',pic:'',hsh:true},{av:'AV12MaqCodC',fld:'vMAQCODC',pic:'',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV14TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV9ArtCod',fld:'vARTCOD',pic:'',hsh:true},{av:'AV11FasCodM',fld:'vFASCODM',pic:'',hsh:true},{av:'AV12MaqCodC',fld:'vMAQCODC',pic:'',hsh:true},{av:'A9869MaqAncC',fld:'MAQANCC',pic:'ZZ9'}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e141TC2',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV14TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true}]");
      setEventMetadata("AFTER TRN",",oparms:[]}");
      setEventMetadata("COMBO_PROCOD.ONOPTIONCLICKED","{handler:'e131TC2',iparms:[{av:'Combo_procod_Selectedvalue_get',ctrl:'COMBO_PROCOD',prop:'SelectedValue_get'},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV8CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV9ArtCod',fld:'vARTCOD',pic:'',hsh:true},{av:'AV10ProCod',fld:'vPROCOD',pic:''},{av:'AV11FasCodM',fld:'vFASCODM',pic:'',hsh:true},{av:'AV12MaqCodC',fld:'vMAQCODC',pic:'',hsh:true}]");
      setEventMetadata("COMBO_PROCOD.ONOPTIONCLICKED",",oparms:[{av:'AV23ComboProCod',fld:'vCOMBOPROCOD',pic:''},{av:'AV10ProCod',fld:'vPROCOD',pic:''},{av:'AV24FasCodM_Data',fld:'vFASCODM_DATA',pic:''},{av:'Combo_fascodm_Selectedvalue_set',ctrl:'COMBO_FASCODM',prop:'SelectedValue_set'},{av:'AV25ComboFasCodM',fld:'vCOMBOFASCODM',pic:''},{av:'Combo_fascodm_Enabled',ctrl:'COMBO_FASCODM',prop:'Enabled'}]}");
      setEventMetadata("COMBO_CLICOD.ONOPTIONCLICKED","{handler:'e121TC2',iparms:[{av:'Combo_clicod_Selectedvalue_get',ctrl:'COMBO_CLICOD',prop:'SelectedValue_get'},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV8CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV9ArtCod',fld:'vARTCOD',pic:'',hsh:true},{av:'AV10ProCod',fld:'vPROCOD',pic:''},{av:'AV11FasCodM',fld:'vFASCODM',pic:'',hsh:true},{av:'AV12MaqCodC',fld:'vMAQCODC',pic:'',hsh:true}]");
      setEventMetadata("COMBO_CLICOD.ONOPTIONCLICKED",",oparms:[{av:'AV19ComboCliCod',fld:'vCOMBOCLICOD',pic:'ZZZZZ9'},{av:'AV8CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV20ArtCod_Data',fld:'vARTCOD_DATA',pic:''},{av:'Combo_artcod_Selectedvalue_set',ctrl:'COMBO_ARTCOD',prop:'SelectedValue_set'},{av:'AV21ComboArtCod',fld:'vCOMBOARTCOD',pic:''},{av:'Combo_artcod_Enabled',ctrl:'COMBO_ARTCOD',prop:'Enabled'}]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[]");
      setEventMetadata("VALID_CLICOD",",oparms:[]}");
      setEventMetadata("VALID_ARTCOD","{handler:'valid_Artcod',iparms:[]");
      setEventMetadata("VALID_ARTCOD",",oparms:[]}");
      setEventMetadata("VALID_PROCOD","{handler:'valid_Procod',iparms:[]");
      setEventMetadata("VALID_PROCOD",",oparms:[]}");
      setEventMetadata("VALID_FASCODM","{handler:'valid_Fascodm',iparms:[]");
      setEventMetadata("VALID_FASCODM",",oparms:[]}");
      setEventMetadata("VALID_MAQCODC","{handler:'valid_Maqcodc',iparms:[]");
      setEventMetadata("VALID_MAQCODC",",oparms:[]}");
      setEventMetadata("VALIDV_COMBOCLICOD","{handler:'validv_Comboclicod',iparms:[]");
      setEventMetadata("VALIDV_COMBOCLICOD",",oparms:[]}");
      setEventMetadata("VALIDV_COMBOARTCOD","{handler:'validv_Comboartcod',iparms:[]");
      setEventMetadata("VALIDV_COMBOARTCOD",",oparms:[]}");
      setEventMetadata("VALIDV_COMBOPROCOD","{handler:'validv_Comboprocod',iparms:[]");
      setEventMetadata("VALIDV_COMBOPROCOD",",oparms:[]}");
      setEventMetadata("VALIDV_COMBOFASCODM","{handler:'validv_Combofascodm',iparms:[]");
      setEventMetadata("VALIDV_COMBOFASCODM",",oparms:[]}");
      setEventMetadata("VALIDV_COMBOMAQCODC","{handler:'validv_Combomaqcodc',iparms:[]");
      setEventMetadata("VALIDV_COMBOMAQCODC",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A65ArtCod',fld:'ARTCOD',pic:''},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A9836FasCodM',fld:'FASCODM',pic:''},{av:'A9830MaqCodC',fld:'MAQCODC',pic:''},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A69ArtDsc',fld:'ARTDSC',pic:''},{av:'A759ProDsc',fld:'PRODSC',pic:''},{av:'A9837FasDscM',fld:'FASDSCM',pic:''},{av:'A9831MaqDscD',fld:'MAQDSCD',pic:''}]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A69ArtDsc',fld:'ARTDSC',pic:''},{av:'A759ProDsc',fld:'PRODSC',pic:''},{av:'A9837FasDscM',fld:'FASDSCM',pic:''},{av:'A9831MaqDscD',fld:'MAQDSCD',pic:''}]}");
      setEventMetadata("VALID_PARFASCOD","{handler:'valid_Parfascod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A1664ParFasCod',fld:'PARFASCOD',pic:'ZZZ9'},{av:'A13203ParUndID',fld:'PARUNDID',pic:'ZZZ9'},{av:'A1665ParFasDsc',fld:'PARFASDSC',pic:''},{av:'A13204ParUndDsc',fld:'PARUNDDSC',pic:''}]");
      setEventMetadata("VALID_PARFASCOD",",oparms:[{av:'A1665ParFasDsc',fld:'PARFASDSC',pic:''},{av:'A13203ParUndID',fld:'PARUNDID',pic:'ZZZ9'},{av:'A13204ParUndDsc',fld:'PARUNDDSC',pic:''}]}");
      setEventMetadata("NULL","{handler:'valid_Parfmobs',iparms:[]");
      setEventMetadata("NULL",",oparms:[]}");
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
      pr_default.close(37);
      pr_default.close(38);
      pr_default.close(26);
      pr_default.close(25);
      pr_default.close(24);
      pr_default.close(27);
      pr_default.close(40);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      wcpOAV7EmprCod = "" ;
      wcpOAV9ArtCod = "" ;
      wcpOAV10ProCod = "" ;
      wcpOAV11FasCodM = "" ;
      wcpOAV12MaqCodC = "" ;
      Z396EmprCod = "" ;
      Z65ArtCod = "" ;
      Z758ProCod = "" ;
      Z9836FasCodM = "" ;
      Z9830MaqCodC = "" ;
      Combo_maqcodc_Selectedvalue_get = "" ;
      Combo_fascodm_Selectedvalue_get = "" ;
      Combo_procod_Selectedvalue_get = "" ;
      Combo_artcod_Selectedvalue_get = "" ;
      Combo_clicod_Selectedvalue_get = "" ;
      Z9828ParFMVal = "" ;
      Z9829ParFMObs = "" ;
      Z14075ParFMVMin = "" ;
      Z14076ParFMVMax = "" ;
      Z14077ParFMVal2 = "" ;
      Z14080ParFasPLC = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A9836FasCodM = "" ;
      A9830MaqCodC = "" ;
      A65ArtCod = "" ;
      A758ProCod = "" ;
      Gx_mode = "" ;
      AV7EmprCod = "" ;
      AV9ArtCod = "" ;
      AV10ProCod = "" ;
      AV11FasCodM = "" ;
      AV12MaqCodC = "" ;
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
      AV17DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV16CliCod_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      TempTags = "" ;
      lblTextblockartcod_Jsonclick = "" ;
      ucCombo_artcod = new com.genexus.webpanels.GXUserControl();
      AV20ArtCod_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      lblTextblockprocod_Jsonclick = "" ;
      ucCombo_procod = new com.genexus.webpanels.GXUserControl();
      AV22ProCod_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      lblTextblockfascodm_Jsonclick = "" ;
      ucCombo_fascodm = new com.genexus.webpanels.GXUserControl();
      AV24FasCodM_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      lblTextblockmaqcodc_Jsonclick = "" ;
      ucCombo_maqcodc = new com.genexus.webpanels.GXUserControl();
      AV26MaqCodC_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      ucDvpanel_tableleaflevel_parametros = new com.genexus.webpanels.GXUserControl();
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      AV34Pgmname = "" ;
      AV21ComboArtCod = "" ;
      AV23ComboProCod = "" ;
      AV25ComboFasCodM = "" ;
      AV27ComboMaqCodC = "" ;
      ucCombo_parfascod = new com.genexus.webpanels.GXUserControl();
      AV28ParFasCod_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      Gridlevel_parametrosContainer = new com.genexus.webpanels.GXWebGrid(context);
      sMode1295 = "" ;
      sStyleString = "" ;
      A9837FasDscM = "" ;
      A9831MaqDscD = "" ;
      A407EmprNom = "" ;
      A279CliNom = "" ;
      A69ArtDsc = "" ;
      A759ProDsc = "" ;
      A9828ParFMVal = "" ;
      A12449ParEspDcS = "" ;
      A13204ParUndDsc = "" ;
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
      Combo_procod_Objectcall = "" ;
      Combo_procod_Class = "" ;
      Combo_procod_Icontype = "" ;
      Combo_procod_Icon = "" ;
      Combo_procod_Tooltip = "" ;
      Combo_procod_Selectedvalue_set = "" ;
      Combo_procod_Selectedtext_set = "" ;
      Combo_procod_Selectedtext_get = "" ;
      Combo_procod_Gamoauthtoken = "" ;
      Combo_procod_Ddointernalname = "" ;
      Combo_procod_Titlecontrolalign = "" ;
      Combo_procod_Dropdownoptionstype = "" ;
      Combo_procod_Titlecontrolidtoreplace = "" ;
      Combo_procod_Datalisttype = "" ;
      Combo_procod_Datalistfixedvalues = "" ;
      Combo_procod_Datalistproc = "" ;
      Combo_procod_Datalistprocparametersprefix = "" ;
      Combo_procod_Remoteservicesparameters = "" ;
      Combo_procod_Htmltemplate = "" ;
      Combo_procod_Multiplevaluestype = "" ;
      Combo_procod_Loadingdata = "" ;
      Combo_procod_Noresultsfound = "" ;
      Combo_procod_Onlyselectedvalues = "" ;
      Combo_procod_Selectalltext = "" ;
      Combo_procod_Multiplevaluesseparator = "" ;
      Combo_procod_Addnewoptiontext = "" ;
      Combo_fascodm_Objectcall = "" ;
      Combo_fascodm_Class = "" ;
      Combo_fascodm_Icontype = "" ;
      Combo_fascodm_Icon = "" ;
      Combo_fascodm_Tooltip = "" ;
      Combo_fascodm_Selectedvalue_set = "" ;
      Combo_fascodm_Selectedtext_set = "" ;
      Combo_fascodm_Selectedtext_get = "" ;
      Combo_fascodm_Gamoauthtoken = "" ;
      Combo_fascodm_Ddointernalname = "" ;
      Combo_fascodm_Titlecontrolalign = "" ;
      Combo_fascodm_Dropdownoptionstype = "" ;
      Combo_fascodm_Titlecontrolidtoreplace = "" ;
      Combo_fascodm_Datalisttype = "" ;
      Combo_fascodm_Datalistfixedvalues = "" ;
      Combo_fascodm_Datalistproc = "" ;
      Combo_fascodm_Datalistprocparametersprefix = "" ;
      Combo_fascodm_Remoteservicesparameters = "" ;
      Combo_fascodm_Htmltemplate = "" ;
      Combo_fascodm_Multiplevaluestype = "" ;
      Combo_fascodm_Loadingdata = "" ;
      Combo_fascodm_Noresultsfound = "" ;
      Combo_fascodm_Onlyselectedvalues = "" ;
      Combo_fascodm_Selectalltext = "" ;
      Combo_fascodm_Multiplevaluesseparator = "" ;
      Combo_fascodm_Addnewoptiontext = "" ;
      Combo_maqcodc_Objectcall = "" ;
      Combo_maqcodc_Class = "" ;
      Combo_maqcodc_Icontype = "" ;
      Combo_maqcodc_Icon = "" ;
      Combo_maqcodc_Tooltip = "" ;
      Combo_maqcodc_Selectedvalue_set = "" ;
      Combo_maqcodc_Selectedtext_set = "" ;
      Combo_maqcodc_Selectedtext_get = "" ;
      Combo_maqcodc_Gamoauthtoken = "" ;
      Combo_maqcodc_Ddointernalname = "" ;
      Combo_maqcodc_Titlecontrolalign = "" ;
      Combo_maqcodc_Dropdownoptionstype = "" ;
      Combo_maqcodc_Titlecontrolidtoreplace = "" ;
      Combo_maqcodc_Datalisttype = "" ;
      Combo_maqcodc_Datalistfixedvalues = "" ;
      Combo_maqcodc_Datalistproc = "" ;
      Combo_maqcodc_Datalistprocparametersprefix = "" ;
      Combo_maqcodc_Remoteservicesparameters = "" ;
      Combo_maqcodc_Htmltemplate = "" ;
      Combo_maqcodc_Multiplevaluestype = "" ;
      Combo_maqcodc_Loadingdata = "" ;
      Combo_maqcodc_Noresultsfound = "" ;
      Combo_maqcodc_Onlyselectedvalues = "" ;
      Combo_maqcodc_Selectalltext = "" ;
      Combo_maqcodc_Multiplevaluesseparator = "" ;
      Combo_maqcodc_Addnewoptiontext = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      Dvpanel_tableleaflevel_parametros_Objectcall = "" ;
      Dvpanel_tableleaflevel_parametros_Class = "" ;
      Dvpanel_tableleaflevel_parametros_Height = "" ;
      Combo_parfascod_Objectcall = "" ;
      Combo_parfascod_Class = "" ;
      Combo_parfascod_Icontype = "" ;
      Combo_parfascod_Icon = "" ;
      Combo_parfascod_Tooltip = "" ;
      Combo_parfascod_Selectedvalue_set = "" ;
      Combo_parfascod_Selectedvalue_get = "" ;
      Combo_parfascod_Selectedtext_set = "" ;
      Combo_parfascod_Selectedtext_get = "" ;
      Combo_parfascod_Gamoauthtoken = "" ;
      Combo_parfascod_Ddointernalname = "" ;
      Combo_parfascod_Titlecontrolalign = "" ;
      Combo_parfascod_Dropdownoptionstype = "" ;
      Combo_parfascod_Datalisttype = "" ;
      Combo_parfascod_Datalistfixedvalues = "" ;
      Combo_parfascod_Datalistproc = "" ;
      Combo_parfascod_Datalistprocparametersprefix = "" ;
      Combo_parfascod_Remoteservicesparameters = "" ;
      Combo_parfascod_Htmltemplate = "" ;
      Combo_parfascod_Multiplevaluestype = "" ;
      Combo_parfascod_Loadingdata = "" ;
      Combo_parfascod_Noresultsfound = "" ;
      Combo_parfascod_Emptyitemtext = "" ;
      Combo_parfascod_Onlyselectedvalues = "" ;
      Combo_parfascod_Selectalltext = "" ;
      Combo_parfascod_Multiplevaluesseparator = "" ;
      Combo_parfascod_Addnewoptiontext = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode1294 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      GXCCtl = "" ;
      A14080ParFasPLC = "" ;
      A1665ParFasDsc = "" ;
      A14077ParFMVal2 = "" ;
      A14075ParFMVMin = "" ;
      A14076ParFMVMax = "" ;
      A9829ParFMObs = "" ;
      AV31Station = "" ;
      AV32EmprNom = "" ;
      AV33UsurCod = "" ;
      AV13WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext5 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV14TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV15WebSession = httpContext.getWebSession();
      AV30imgPrompt = "" ;
      imgImgprompt_gximage = "" ;
      imgImgprompt_Internalname = "" ;
      AV35Imgprompt_GXI = "" ;
      AV18ComboSelectedValue = "" ;
      GXt_objcol_SdtDVB_SDTComboData_Item8 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTComboData_Item9 = new GXBaseCollection[1] ;
      Z407EmprNom = "" ;
      Z279CliNom = "" ;
      Z69ArtDsc = "" ;
      Z759ProDsc = "" ;
      T01TC9_A407EmprNom = new String[] {""} ;
      T01TC9_n407EmprNom = new boolean[] {false} ;
      T01TC12_A759ProDsc = new String[] {""} ;
      T01TC10_A279CliNom = new String[] {""} ;
      T01TC11_A69ArtDsc = new String[] {""} ;
      T01TC11_n69ArtDsc = new boolean[] {false} ;
      T01TC14_A9830MaqCodC = new String[] {""} ;
      T01TC14_A407EmprNom = new String[] {""} ;
      T01TC14_n407EmprNom = new boolean[] {false} ;
      T01TC14_A279CliNom = new String[] {""} ;
      T01TC14_A69ArtDsc = new String[] {""} ;
      T01TC14_n69ArtDsc = new boolean[] {false} ;
      T01TC14_A759ProDsc = new String[] {""} ;
      T01TC14_A9869MaqAncC = new short[1] ;
      T01TC14_A396EmprCod = new String[] {""} ;
      T01TC14_A252CliCod = new int[1] ;
      T01TC14_A65ArtCod = new String[] {""} ;
      T01TC14_A758ProCod = new String[] {""} ;
      T01TC14_A9836FasCodM = new String[] {""} ;
      T01TC13_A396EmprCod = new String[] {""} ;
      T01TC15_A407EmprNom = new String[] {""} ;
      T01TC15_n407EmprNom = new boolean[] {false} ;
      T01TC16_A279CliNom = new String[] {""} ;
      T01TC17_A69ArtDsc = new String[] {""} ;
      T01TC17_n69ArtDsc = new boolean[] {false} ;
      T01TC18_A759ProDsc = new String[] {""} ;
      T01TC19_A396EmprCod = new String[] {""} ;
      T01TC20_A396EmprCod = new String[] {""} ;
      T01TC20_A252CliCod = new int[1] ;
      T01TC20_A65ArtCod = new String[] {""} ;
      T01TC20_A758ProCod = new String[] {""} ;
      T01TC20_A9836FasCodM = new String[] {""} ;
      T01TC20_A9830MaqCodC = new String[] {""} ;
      T01TC8_A9830MaqCodC = new String[] {""} ;
      T01TC8_A9869MaqAncC = new short[1] ;
      T01TC8_A396EmprCod = new String[] {""} ;
      T01TC8_A252CliCod = new int[1] ;
      T01TC8_A65ArtCod = new String[] {""} ;
      T01TC8_A758ProCod = new String[] {""} ;
      T01TC8_A9836FasCodM = new String[] {""} ;
      T01TC21_A396EmprCod = new String[] {""} ;
      T01TC21_A252CliCod = new int[1] ;
      T01TC21_A65ArtCod = new String[] {""} ;
      T01TC21_A758ProCod = new String[] {""} ;
      T01TC21_A9836FasCodM = new String[] {""} ;
      T01TC21_A9830MaqCodC = new String[] {""} ;
      T01TC22_A396EmprCod = new String[] {""} ;
      T01TC22_A252CliCod = new int[1] ;
      T01TC22_A65ArtCod = new String[] {""} ;
      T01TC22_A758ProCod = new String[] {""} ;
      T01TC22_A9836FasCodM = new String[] {""} ;
      T01TC22_A9830MaqCodC = new String[] {""} ;
      T01TC7_A9830MaqCodC = new String[] {""} ;
      T01TC7_A9869MaqAncC = new short[1] ;
      T01TC7_A396EmprCod = new String[] {""} ;
      T01TC7_A252CliCod = new int[1] ;
      T01TC7_A65ArtCod = new String[] {""} ;
      T01TC7_A758ProCod = new String[] {""} ;
      T01TC7_A9836FasCodM = new String[] {""} ;
      T01TC26_A407EmprNom = new String[] {""} ;
      T01TC26_n407EmprNom = new boolean[] {false} ;
      T01TC27_A279CliNom = new String[] {""} ;
      T01TC28_A69ArtDsc = new String[] {""} ;
      T01TC28_n69ArtDsc = new boolean[] {false} ;
      T01TC29_A759ProDsc = new String[] {""} ;
      T01TC30_A396EmprCod = new String[] {""} ;
      T01TC30_A252CliCod = new int[1] ;
      T01TC30_A65ArtCod = new String[] {""} ;
      T01TC30_A758ProCod = new String[] {""} ;
      T01TC30_A9836FasCodM = new String[] {""} ;
      T01TC30_A9830MaqCodC = new String[] {""} ;
      T01TC30_A9864MaqAncA = new short[1] ;
      T01TC31_A396EmprCod = new String[] {""} ;
      T01TC31_A252CliCod = new int[1] ;
      T01TC31_A65ArtCod = new String[] {""} ;
      T01TC31_A758ProCod = new String[] {""} ;
      T01TC31_A9836FasCodM = new String[] {""} ;
      T01TC31_A9830MaqCodC = new String[] {""} ;
      Z12449ParEspDcS = "" ;
      Z1665ParFasDsc = "" ;
      Z13204ParUndDsc = "" ;
      T01TC5_A12449ParEspDcS = new String[] {""} ;
      T01TC5_n12449ParEspDcS = new boolean[] {false} ;
      T01TC32_A252CliCod = new int[1] ;
      T01TC32_A65ArtCod = new String[] {""} ;
      T01TC32_A758ProCod = new String[] {""} ;
      T01TC32_A9836FasCodM = new String[] {""} ;
      T01TC32_A9830MaqCodC = new String[] {""} ;
      T01TC32_A1665ParFasDsc = new String[] {""} ;
      T01TC32_n1665ParFasDsc = new boolean[] {false} ;
      T01TC32_A9828ParFMVal = new String[] {""} ;
      T01TC32_A9829ParFMObs = new String[] {""} ;
      T01TC32_A10256Itm_ord2 = new short[1] ;
      T01TC32_A12449ParEspDcS = new String[] {""} ;
      T01TC32_n12449ParEspDcS = new boolean[] {false} ;
      T01TC32_A13204ParUndDsc = new String[] {""} ;
      T01TC32_n13204ParUndDsc = new boolean[] {false} ;
      T01TC32_A14075ParFMVMin = new String[] {""} ;
      T01TC32_A14076ParFMVMax = new String[] {""} ;
      T01TC32_A14077ParFMVal2 = new String[] {""} ;
      T01TC32_A14080ParFasPLC = new String[] {""} ;
      T01TC32_A396EmprCod = new String[] {""} ;
      T01TC32_A1664ParFasCod = new short[1] ;
      T01TC32_A12448ParEspIdS = new short[1] ;
      T01TC32_n12448ParEspIdS = new boolean[] {false} ;
      T01TC32_A13203ParUndID = new short[1] ;
      T01TC32_n13203ParUndID = new boolean[] {false} ;
      T01TC4_A1665ParFasDsc = new String[] {""} ;
      T01TC4_n1665ParFasDsc = new boolean[] {false} ;
      T01TC4_A13203ParUndID = new short[1] ;
      T01TC4_n13203ParUndID = new boolean[] {false} ;
      T01TC6_A13204ParUndDsc = new String[] {""} ;
      T01TC6_n13204ParUndDsc = new boolean[] {false} ;
      T01TC33_A1665ParFasDsc = new String[] {""} ;
      T01TC33_n1665ParFasDsc = new boolean[] {false} ;
      T01TC33_A13203ParUndID = new short[1] ;
      T01TC33_n13203ParUndID = new boolean[] {false} ;
      T01TC34_A13204ParUndDsc = new String[] {""} ;
      T01TC34_n13204ParUndDsc = new boolean[] {false} ;
      T01TC35_A396EmprCod = new String[] {""} ;
      T01TC35_A252CliCod = new int[1] ;
      T01TC35_A65ArtCod = new String[] {""} ;
      T01TC35_A758ProCod = new String[] {""} ;
      T01TC35_A9836FasCodM = new String[] {""} ;
      T01TC35_A9830MaqCodC = new String[] {""} ;
      T01TC35_A1664ParFasCod = new short[1] ;
      T01TC3_A252CliCod = new int[1] ;
      T01TC3_A65ArtCod = new String[] {""} ;
      T01TC3_A758ProCod = new String[] {""} ;
      T01TC3_A9836FasCodM = new String[] {""} ;
      T01TC3_A9830MaqCodC = new String[] {""} ;
      T01TC3_A9828ParFMVal = new String[] {""} ;
      T01TC3_A9829ParFMObs = new String[] {""} ;
      T01TC3_A10256Itm_ord2 = new short[1] ;
      T01TC3_A14075ParFMVMin = new String[] {""} ;
      T01TC3_A14076ParFMVMax = new String[] {""} ;
      T01TC3_A14077ParFMVal2 = new String[] {""} ;
      T01TC3_A14080ParFasPLC = new String[] {""} ;
      T01TC3_A396EmprCod = new String[] {""} ;
      T01TC3_A1664ParFasCod = new short[1] ;
      T01TC3_A12448ParEspIdS = new short[1] ;
      T01TC3_n12448ParEspIdS = new boolean[] {false} ;
      T01TC2_A252CliCod = new int[1] ;
      T01TC2_A65ArtCod = new String[] {""} ;
      T01TC2_A758ProCod = new String[] {""} ;
      T01TC2_A9836FasCodM = new String[] {""} ;
      T01TC2_A9830MaqCodC = new String[] {""} ;
      T01TC2_A9828ParFMVal = new String[] {""} ;
      T01TC2_A9829ParFMObs = new String[] {""} ;
      T01TC2_A10256Itm_ord2 = new short[1] ;
      T01TC2_A14075ParFMVMin = new String[] {""} ;
      T01TC2_A14076ParFMVMax = new String[] {""} ;
      T01TC2_A14077ParFMVal2 = new String[] {""} ;
      T01TC2_A14080ParFasPLC = new String[] {""} ;
      T01TC2_A396EmprCod = new String[] {""} ;
      T01TC2_A1664ParFasCod = new short[1] ;
      T01TC2_A12448ParEspIdS = new short[1] ;
      T01TC2_n12448ParEspIdS = new boolean[] {false} ;
      T01TC39_A1665ParFasDsc = new String[] {""} ;
      T01TC39_n1665ParFasDsc = new boolean[] {false} ;
      T01TC39_A13203ParUndID = new short[1] ;
      T01TC39_n13203ParUndID = new boolean[] {false} ;
      T01TC40_A13204ParUndDsc = new String[] {""} ;
      T01TC40_n13204ParUndDsc = new boolean[] {false} ;
      T01TC41_A396EmprCod = new String[] {""} ;
      T01TC41_A252CliCod = new int[1] ;
      T01TC41_A65ArtCod = new String[] {""} ;
      T01TC41_A758ProCod = new String[] {""} ;
      T01TC41_A9836FasCodM = new String[] {""} ;
      T01TC41_A9830MaqCodC = new String[] {""} ;
      T01TC41_A1664ParFasCod = new short[1] ;
      Gridlevel_parametrosRow = new com.genexus.webpanels.GXWebRow();
      subGridlevel_parametros_Linesclass = "" ;
      ROClassString = "" ;
      imgprompt_1664_gximage = "" ;
      sImgUrl = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Gridlevel_parametrosColumn = new com.genexus.webpanels.GXWebColumn();
      T01TC42_A396EmprCod = new String[] {""} ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      Z9837FasDscM = "" ;
      Z9831MaqDscD = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.ingenieria.capfm_p__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.ingenieria.capfm_p__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.ingenieria.capfm_p__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.ingenieria.capfm_p__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ingenieria.capfm_p__default(),
         new Object[] {
             new Object[] {
            T01TC2_A252CliCod, T01TC2_A65ArtCod, T01TC2_A758ProCod, T01TC2_A9836FasCodM, T01TC2_A9830MaqCodC, T01TC2_A9828ParFMVal, T01TC2_A9829ParFMObs, T01TC2_A10256Itm_ord2, T01TC2_A14075ParFMVMin, T01TC2_A14076ParFMVMax,
            T01TC2_A14077ParFMVal2, T01TC2_A14080ParFasPLC, T01TC2_A396EmprCod, T01TC2_A1664ParFasCod, T01TC2_A12448ParEspIdS, T01TC2_n12448ParEspIdS
            }
            , new Object[] {
            T01TC3_A252CliCod, T01TC3_A65ArtCod, T01TC3_A758ProCod, T01TC3_A9836FasCodM, T01TC3_A9830MaqCodC, T01TC3_A9828ParFMVal, T01TC3_A9829ParFMObs, T01TC3_A10256Itm_ord2, T01TC3_A14075ParFMVMin, T01TC3_A14076ParFMVMax,
            T01TC3_A14077ParFMVal2, T01TC3_A14080ParFasPLC, T01TC3_A396EmprCod, T01TC3_A1664ParFasCod, T01TC3_A12448ParEspIdS, T01TC3_n12448ParEspIdS
            }
            , new Object[] {
            T01TC4_A1665ParFasDsc, T01TC4_n1665ParFasDsc, T01TC4_A13203ParUndID, T01TC4_n13203ParUndID
            }
            , new Object[] {
            T01TC5_A12449ParEspDcS, T01TC5_n12449ParEspDcS
            }
            , new Object[] {
            T01TC6_A13204ParUndDsc, T01TC6_n13204ParUndDsc
            }
            , new Object[] {
            T01TC7_A9830MaqCodC, T01TC7_A9869MaqAncC, T01TC7_A396EmprCod, T01TC7_A252CliCod, T01TC7_A65ArtCod, T01TC7_A758ProCod, T01TC7_A9836FasCodM
            }
            , new Object[] {
            T01TC8_A9830MaqCodC, T01TC8_A9869MaqAncC, T01TC8_A396EmprCod, T01TC8_A252CliCod, T01TC8_A65ArtCod, T01TC8_A758ProCod, T01TC8_A9836FasCodM
            }
            , new Object[] {
            T01TC9_A407EmprNom, T01TC9_n407EmprNom
            }
            , new Object[] {
            T01TC10_A279CliNom
            }
            , new Object[] {
            T01TC11_A69ArtDsc, T01TC11_n69ArtDsc
            }
            , new Object[] {
            T01TC12_A759ProDsc
            }
            , new Object[] {
            T01TC13_A396EmprCod
            }
            , new Object[] {
            T01TC14_A9830MaqCodC, T01TC14_A407EmprNom, T01TC14_n407EmprNom, T01TC14_A279CliNom, T01TC14_A69ArtDsc, T01TC14_n69ArtDsc, T01TC14_A759ProDsc, T01TC14_A9869MaqAncC, T01TC14_A396EmprCod, T01TC14_A252CliCod,
            T01TC14_A65ArtCod, T01TC14_A758ProCod, T01TC14_A9836FasCodM
            }
            , new Object[] {
            T01TC15_A407EmprNom, T01TC15_n407EmprNom
            }
            , new Object[] {
            T01TC16_A279CliNom
            }
            , new Object[] {
            T01TC17_A69ArtDsc, T01TC17_n69ArtDsc
            }
            , new Object[] {
            T01TC18_A759ProDsc
            }
            , new Object[] {
            T01TC19_A396EmprCod
            }
            , new Object[] {
            T01TC20_A396EmprCod, T01TC20_A252CliCod, T01TC20_A65ArtCod, T01TC20_A758ProCod, T01TC20_A9836FasCodM, T01TC20_A9830MaqCodC
            }
            , new Object[] {
            T01TC21_A396EmprCod, T01TC21_A252CliCod, T01TC21_A65ArtCod, T01TC21_A758ProCod, T01TC21_A9836FasCodM, T01TC21_A9830MaqCodC
            }
            , new Object[] {
            T01TC22_A396EmprCod, T01TC22_A252CliCod, T01TC22_A65ArtCod, T01TC22_A758ProCod, T01TC22_A9836FasCodM, T01TC22_A9830MaqCodC
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01TC26_A407EmprNom, T01TC26_n407EmprNom
            }
            , new Object[] {
            T01TC27_A279CliNom
            }
            , new Object[] {
            T01TC28_A69ArtDsc, T01TC28_n69ArtDsc
            }
            , new Object[] {
            T01TC29_A759ProDsc
            }
            , new Object[] {
            T01TC30_A396EmprCod, T01TC30_A252CliCod, T01TC30_A65ArtCod, T01TC30_A758ProCod, T01TC30_A9836FasCodM, T01TC30_A9830MaqCodC, T01TC30_A9864MaqAncA
            }
            , new Object[] {
            T01TC31_A396EmprCod, T01TC31_A252CliCod, T01TC31_A65ArtCod, T01TC31_A758ProCod, T01TC31_A9836FasCodM, T01TC31_A9830MaqCodC
            }
            , new Object[] {
            T01TC32_A252CliCod, T01TC32_A65ArtCod, T01TC32_A758ProCod, T01TC32_A9836FasCodM, T01TC32_A9830MaqCodC, T01TC32_A1665ParFasDsc, T01TC32_n1665ParFasDsc, T01TC32_A9828ParFMVal, T01TC32_A9829ParFMObs, T01TC32_A10256Itm_ord2,
            T01TC32_A12449ParEspDcS, T01TC32_n12449ParEspDcS, T01TC32_A13204ParUndDsc, T01TC32_n13204ParUndDsc, T01TC32_A14075ParFMVMin, T01TC32_A14076ParFMVMax, T01TC32_A14077ParFMVal2, T01TC32_A14080ParFasPLC, T01TC32_A396EmprCod, T01TC32_A1664ParFasCod,
            T01TC32_A12448ParEspIdS, T01TC32_n12448ParEspIdS, T01TC32_A13203ParUndID, T01TC32_n13203ParUndID
            }
            , new Object[] {
            T01TC33_A1665ParFasDsc, T01TC33_n1665ParFasDsc, T01TC33_A13203ParUndID, T01TC33_n13203ParUndID
            }
            , new Object[] {
            T01TC34_A13204ParUndDsc, T01TC34_n13204ParUndDsc
            }
            , new Object[] {
            T01TC35_A396EmprCod, T01TC35_A252CliCod, T01TC35_A65ArtCod, T01TC35_A758ProCod, T01TC35_A9836FasCodM, T01TC35_A9830MaqCodC, T01TC35_A1664ParFasCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01TC39_A1665ParFasDsc, T01TC39_n1665ParFasDsc, T01TC39_A13203ParUndID, T01TC39_n13203ParUndID
            }
            , new Object[] {
            T01TC40_A13204ParUndDsc, T01TC40_n13204ParUndDsc
            }
            , new Object[] {
            T01TC41_A396EmprCod, T01TC41_A252CliCod, T01TC41_A65ArtCod, T01TC41_A758ProCod, T01TC41_A9836FasCodM, T01TC41_A9830MaqCodC, T01TC41_A1664ParFasCod
            }
            , new Object[] {
            T01TC42_A396EmprCod
            }
         }
      );
      AV34Pgmname = "Ingenieria.CAPFM_P" ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte subGridlevel_parametros_Backcolorstyle ;
   private byte subGridlevel_parametros_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGridlevel_parametros_Allowselection ;
   private byte subGridlevel_parametros_Allowhovering ;
   private byte subGridlevel_parametros_Allowcollapsing ;
   private byte subGridlevel_parametros_Collapsed ;
   private short nIsMod_1295 ;
   private short Z9869MaqAncC ;
   private short Z1664ParFasCod ;
   private short Z10256Itm_ord2 ;
   private short Z12448ParEspIdS ;
   private short nRcdDeleted_1295 ;
   private short nRcdExists_1295 ;
   private short A1664ParFasCod ;
   private short A13203ParUndID ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount1295 ;
   private short RcdFound1295 ;
   private short nBlankRcdUsr1295 ;
   private short A9869MaqAncC ;
   private short A10256Itm_ord2 ;
   private short A12448ParEspIdS ;
   private short RcdFound1294 ;
   private short nIsDirty_1294 ;
   private short Z13203ParUndID ;
   private short nIsDirty_1295 ;
   private int wcpOAV8CliCod ;
   private int Z252CliCod ;
   private int nRC_GXsfl_80 ;
   private int nGXsfl_80_idx=1 ;
   private int A252CliCod ;
   private int AV8CliCod ;
   private int trnEnded ;
   private int edtCliCod_Visible ;
   private int edtCliCod_Enabled ;
   private int edtArtCod_Visible ;
   private int edtArtCod_Enabled ;
   private int edtProCod_Visible ;
   private int edtProCod_Enabled ;
   private int edtFasCodM_Visible ;
   private int edtFasCodM_Enabled ;
   private int edtMaqCodC_Visible ;
   private int edtMaqCodC_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int edtavPgmname_Enabled ;
   private int AV19ComboCliCod ;
   private int edtavComboclicod_Enabled ;
   private int edtavComboclicod_Visible ;
   private int edtavComboartcod_Visible ;
   private int edtavComboartcod_Enabled ;
   private int edtavComboprocod_Visible ;
   private int edtavComboprocod_Enabled ;
   private int edtavCombofascodm_Visible ;
   private int edtavCombofascodm_Enabled ;
   private int edtavCombomaqcodc_Visible ;
   private int edtavCombomaqcodc_Enabled ;
   private int edtEmprCod_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtParFasCod_Enabled ;
   private int edtParFasPLC_Enabled ;
   private int edtParFasDsc_Enabled ;
   private int edtParFMVal2_Enabled ;
   private int edtParFMVMin_Enabled ;
   private int edtParFMVMax_Enabled ;
   private int edtParFMObs_Enabled ;
   private int fRowAdded ;
   private int Combo_clicod_Datalistupdateminimumcharacters ;
   private int Combo_artcod_Datalistupdateminimumcharacters ;
   private int Combo_procod_Datalistupdateminimumcharacters ;
   private int Combo_fascodm_Datalistupdateminimumcharacters ;
   private int Combo_maqcodc_Datalistupdateminimumcharacters ;
   private int Combo_parfascod_Datalistupdateminimumcharacters ;
   private int GX_JID ;
   private int subGridlevel_parametros_Backcolor ;
   private int subGridlevel_parametros_Allbackcolor ;
   private int imgprompt_1664_Visible ;
   private int defedtParFasDsc_Enabled ;
   private int defedtParFasCod_Enabled ;
   private int idxLst ;
   private int subGridlevel_parametros_Selectedindex ;
   private int subGridlevel_parametros_Selectioncolor ;
   private int subGridlevel_parametros_Hoveringcolor ;
   private long GRIDLEVEL_PARAMETROS_nFirstRecordOnPage ;
   private String sPrefix ;
   private String sGXsfl_80_idx="0001" ;
   private String wcpOGx_mode ;
   private String wcpOAV7EmprCod ;
   private String wcpOAV9ArtCod ;
   private String wcpOAV10ProCod ;
   private String wcpOAV11FasCodM ;
   private String wcpOAV12MaqCodC ;
   private String Z396EmprCod ;
   private String Z65ArtCod ;
   private String Z758ProCod ;
   private String Z9836FasCodM ;
   private String Z9830MaqCodC ;
   private String Combo_maqcodc_Selectedvalue_get ;
   private String Combo_fascodm_Selectedvalue_get ;
   private String Combo_procod_Selectedvalue_get ;
   private String Combo_artcod_Selectedvalue_get ;
   private String Combo_clicod_Selectedvalue_get ;
   private String Z9828ParFMVal ;
   private String Z14075ParFMVMin ;
   private String Z14076ParFMVMax ;
   private String Z14077ParFMVal2 ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A9836FasCodM ;
   private String A9830MaqCodC ;
   private String A65ArtCod ;
   private String A758ProCod ;
   private String Gx_mode ;
   private String AV7EmprCod ;
   private String AV9ArtCod ;
   private String AV10ProCod ;
   private String AV11FasCodM ;
   private String AV12MaqCodC ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtCliCod_Internalname ;
   private String edtParFasCod_Horizontalalignment ;
   private String edtParFasCod_Internalname ;
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
   private String divTablesplittedclicod_Internalname ;
   private String lblTextblockclicod_Internalname ;
   private String lblTextblockclicod_Jsonclick ;
   private String Combo_clicod_Caption ;
   private String Combo_clicod_Cls ;
   private String Combo_clicod_Emptyitemtext ;
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
   private String divTablesplittedprocod_Internalname ;
   private String lblTextblockprocod_Internalname ;
   private String lblTextblockprocod_Jsonclick ;
   private String Combo_procod_Caption ;
   private String Combo_procod_Cls ;
   private String Combo_procod_Emptyitemtext ;
   private String Combo_procod_Internalname ;
   private String edtProCod_Internalname ;
   private String edtProCod_Jsonclick ;
   private String divTablesplittedfascodm_Internalname ;
   private String lblTextblockfascodm_Internalname ;
   private String lblTextblockfascodm_Jsonclick ;
   private String Combo_fascodm_Caption ;
   private String Combo_fascodm_Cls ;
   private String Combo_fascodm_Emptyitemtext ;
   private String Combo_fascodm_Internalname ;
   private String edtFasCodM_Internalname ;
   private String edtFasCodM_Jsonclick ;
   private String divTablesplittedmaqcodc_Internalname ;
   private String lblTextblockmaqcodc_Internalname ;
   private String lblTextblockmaqcodc_Jsonclick ;
   private String Combo_maqcodc_Caption ;
   private String Combo_maqcodc_Cls ;
   private String Combo_maqcodc_Emptyitemtext ;
   private String Combo_maqcodc_Internalname ;
   private String edtMaqCodC_Internalname ;
   private String edtMaqCodC_Jsonclick ;
   private String Dvpanel_tableleaflevel_parametros_Width ;
   private String Dvpanel_tableleaflevel_parametros_Cls ;
   private String Dvpanel_tableleaflevel_parametros_Title ;
   private String Dvpanel_tableleaflevel_parametros_Iconposition ;
   private String Dvpanel_tableleaflevel_parametros_Internalname ;
   private String divTableleaflevel_parametros_Internalname ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String edtavPgmname_Internalname ;
   private String AV34Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String divSectionattribute_clicod_Internalname ;
   private String edtavComboclicod_Internalname ;
   private String edtavComboclicod_Jsonclick ;
   private String divSectionattribute_artcod_Internalname ;
   private String edtavComboartcod_Internalname ;
   private String AV21ComboArtCod ;
   private String edtavComboartcod_Jsonclick ;
   private String divSectionattribute_procod_Internalname ;
   private String edtavComboprocod_Internalname ;
   private String AV23ComboProCod ;
   private String edtavComboprocod_Jsonclick ;
   private String divSectionattribute_fascodm_Internalname ;
   private String edtavCombofascodm_Internalname ;
   private String AV25ComboFasCodM ;
   private String edtavCombofascodm_Jsonclick ;
   private String divSectionattribute_maqcodc_Internalname ;
   private String edtavCombomaqcodc_Internalname ;
   private String AV27ComboMaqCodC ;
   private String edtavCombomaqcodc_Jsonclick ;
   private String Combo_parfascod_Caption ;
   private String Combo_parfascod_Cls ;
   private String Combo_parfascod_Internalname ;
   private String edtEmprCod_Internalname ;
   private String edtEmprCod_Jsonclick ;
   private String sMode1295 ;
   private String edtParFasPLC_Internalname ;
   private String edtParFasDsc_Internalname ;
   private String edtParFMVal2_Internalname ;
   private String edtParFMVMin_Internalname ;
   private String edtParFMVMax_Internalname ;
   private String edtParFMObs_Internalname ;
   private String imgprompt_1664_Link ;
   private String sStyleString ;
   private String subGridlevel_parametros_Internalname ;
   private String A9837FasDscM ;
   private String A9831MaqDscD ;
   private String A407EmprNom ;
   private String A279CliNom ;
   private String A69ArtDsc ;
   private String A759ProDsc ;
   private String A9828ParFMVal ;
   private String A12449ParEspDcS ;
   private String A13204ParUndDsc ;
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
   private String Combo_procod_Objectcall ;
   private String Combo_procod_Class ;
   private String Combo_procod_Icontype ;
   private String Combo_procod_Icon ;
   private String Combo_procod_Tooltip ;
   private String Combo_procod_Selectedvalue_set ;
   private String Combo_procod_Selectedtext_set ;
   private String Combo_procod_Selectedtext_get ;
   private String Combo_procod_Gamoauthtoken ;
   private String Combo_procod_Ddointernalname ;
   private String Combo_procod_Titlecontrolalign ;
   private String Combo_procod_Dropdownoptionstype ;
   private String Combo_procod_Titlecontrolidtoreplace ;
   private String Combo_procod_Datalisttype ;
   private String Combo_procod_Datalistfixedvalues ;
   private String Combo_procod_Datalistproc ;
   private String Combo_procod_Datalistprocparametersprefix ;
   private String Combo_procod_Remoteservicesparameters ;
   private String Combo_procod_Htmltemplate ;
   private String Combo_procod_Multiplevaluestype ;
   private String Combo_procod_Loadingdata ;
   private String Combo_procod_Noresultsfound ;
   private String Combo_procod_Onlyselectedvalues ;
   private String Combo_procod_Selectalltext ;
   private String Combo_procod_Multiplevaluesseparator ;
   private String Combo_procod_Addnewoptiontext ;
   private String Combo_fascodm_Objectcall ;
   private String Combo_fascodm_Class ;
   private String Combo_fascodm_Icontype ;
   private String Combo_fascodm_Icon ;
   private String Combo_fascodm_Tooltip ;
   private String Combo_fascodm_Selectedvalue_set ;
   private String Combo_fascodm_Selectedtext_set ;
   private String Combo_fascodm_Selectedtext_get ;
   private String Combo_fascodm_Gamoauthtoken ;
   private String Combo_fascodm_Ddointernalname ;
   private String Combo_fascodm_Titlecontrolalign ;
   private String Combo_fascodm_Dropdownoptionstype ;
   private String Combo_fascodm_Titlecontrolidtoreplace ;
   private String Combo_fascodm_Datalisttype ;
   private String Combo_fascodm_Datalistfixedvalues ;
   private String Combo_fascodm_Datalistproc ;
   private String Combo_fascodm_Datalistprocparametersprefix ;
   private String Combo_fascodm_Remoteservicesparameters ;
   private String Combo_fascodm_Htmltemplate ;
   private String Combo_fascodm_Multiplevaluestype ;
   private String Combo_fascodm_Loadingdata ;
   private String Combo_fascodm_Noresultsfound ;
   private String Combo_fascodm_Onlyselectedvalues ;
   private String Combo_fascodm_Selectalltext ;
   private String Combo_fascodm_Multiplevaluesseparator ;
   private String Combo_fascodm_Addnewoptiontext ;
   private String Combo_maqcodc_Objectcall ;
   private String Combo_maqcodc_Class ;
   private String Combo_maqcodc_Icontype ;
   private String Combo_maqcodc_Icon ;
   private String Combo_maqcodc_Tooltip ;
   private String Combo_maqcodc_Selectedvalue_set ;
   private String Combo_maqcodc_Selectedtext_set ;
   private String Combo_maqcodc_Selectedtext_get ;
   private String Combo_maqcodc_Gamoauthtoken ;
   private String Combo_maqcodc_Ddointernalname ;
   private String Combo_maqcodc_Titlecontrolalign ;
   private String Combo_maqcodc_Dropdownoptionstype ;
   private String Combo_maqcodc_Titlecontrolidtoreplace ;
   private String Combo_maqcodc_Datalisttype ;
   private String Combo_maqcodc_Datalistfixedvalues ;
   private String Combo_maqcodc_Datalistproc ;
   private String Combo_maqcodc_Datalistprocparametersprefix ;
   private String Combo_maqcodc_Remoteservicesparameters ;
   private String Combo_maqcodc_Htmltemplate ;
   private String Combo_maqcodc_Multiplevaluestype ;
   private String Combo_maqcodc_Loadingdata ;
   private String Combo_maqcodc_Noresultsfound ;
   private String Combo_maqcodc_Onlyselectedvalues ;
   private String Combo_maqcodc_Selectalltext ;
   private String Combo_maqcodc_Multiplevaluesseparator ;
   private String Combo_maqcodc_Addnewoptiontext ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String Dvpanel_tableleaflevel_parametros_Objectcall ;
   private String Dvpanel_tableleaflevel_parametros_Class ;
   private String Dvpanel_tableleaflevel_parametros_Height ;
   private String Combo_parfascod_Objectcall ;
   private String Combo_parfascod_Class ;
   private String Combo_parfascod_Icontype ;
   private String Combo_parfascod_Icon ;
   private String Combo_parfascod_Tooltip ;
   private String Combo_parfascod_Selectedvalue_set ;
   private String Combo_parfascod_Selectedvalue_get ;
   private String Combo_parfascod_Selectedtext_set ;
   private String Combo_parfascod_Selectedtext_get ;
   private String Combo_parfascod_Gamoauthtoken ;
   private String Combo_parfascod_Ddointernalname ;
   private String Combo_parfascod_Titlecontrolalign ;
   private String Combo_parfascod_Dropdownoptionstype ;
   private String Combo_parfascod_Titlecontrolidtoreplace ;
   private String Combo_parfascod_Datalisttype ;
   private String Combo_parfascod_Datalistfixedvalues ;
   private String Combo_parfascod_Datalistproc ;
   private String Combo_parfascod_Datalistprocparametersprefix ;
   private String Combo_parfascod_Remoteservicesparameters ;
   private String Combo_parfascod_Htmltemplate ;
   private String Combo_parfascod_Multiplevaluestype ;
   private String Combo_parfascod_Loadingdata ;
   private String Combo_parfascod_Noresultsfound ;
   private String Combo_parfascod_Emptyitemtext ;
   private String Combo_parfascod_Onlyselectedvalues ;
   private String Combo_parfascod_Selectalltext ;
   private String Combo_parfascod_Multiplevaluesseparator ;
   private String Combo_parfascod_Addnewoptiontext ;
   private String hsh ;
   private String sMode1294 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String GXCCtl ;
   private String A1665ParFasDsc ;
   private String A14077ParFMVal2 ;
   private String A14075ParFMVMin ;
   private String A14076ParFMVMax ;
   private String AV31Station ;
   private String AV32EmprNom ;
   private String AV33UsurCod ;
   private String imgImgprompt_gximage ;
   private String imgImgprompt_Internalname ;
   private String Z407EmprNom ;
   private String Z279CliNom ;
   private String Z69ArtDsc ;
   private String Z759ProDsc ;
   private String Z12449ParEspDcS ;
   private String Z1665ParFasDsc ;
   private String Z13204ParUndDsc ;
   private String imgprompt_1664_Internalname ;
   private String sGXsfl_80_fel_idx="0001" ;
   private String subGridlevel_parametros_Class ;
   private String subGridlevel_parametros_Linesclass ;
   private String ROClassString ;
   private String edtParFasCod_Jsonclick ;
   private String imgprompt_1664_gximage ;
   private String sImgUrl ;
   private String edtParFasPLC_Jsonclick ;
   private String edtParFasDsc_Jsonclick ;
   private String edtParFMVal2_Jsonclick ;
   private String edtParFMVMin_Jsonclick ;
   private String edtParFMVMax_Jsonclick ;
   private String edtParFMObs_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGridlevel_parametros_Header ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String Z9837FasDscM ;
   private String Z9831MaqDscD ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n13203ParUndID ;
   private boolean wbErr ;
   private boolean bGXsfl_80_Refreshing=false ;
   private boolean Dvpanel_tableattributes_Autowidth ;
   private boolean Dvpanel_tableattributes_Autoheight ;
   private boolean Dvpanel_tableattributes_Collapsible ;
   private boolean Dvpanel_tableattributes_Collapsed ;
   private boolean Dvpanel_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_tableattributes_Autoscroll ;
   private boolean Dvpanel_tableleaflevel_parametros_Autowidth ;
   private boolean Dvpanel_tableleaflevel_parametros_Autoheight ;
   private boolean Dvpanel_tableleaflevel_parametros_Collapsible ;
   private boolean Dvpanel_tableleaflevel_parametros_Collapsed ;
   private boolean Dvpanel_tableleaflevel_parametros_Showcollapseicon ;
   private boolean Dvpanel_tableleaflevel_parametros_Autoscroll ;
   private boolean Combo_parfascod_Isgriditem ;
   private boolean Combo_parfascod_Emptyitem ;
   private boolean n407EmprNom ;
   private boolean n69ArtDsc ;
   private boolean n12448ParEspIdS ;
   private boolean n12449ParEspDcS ;
   private boolean n13204ParUndDsc ;
   private boolean Combo_clicod_Enabled ;
   private boolean Combo_clicod_Visible ;
   private boolean Combo_clicod_Allowmultipleselection ;
   private boolean Combo_clicod_Isgriditem ;
   private boolean Combo_clicod_Hasdescription ;
   private boolean Combo_clicod_Includeonlyselectedoption ;
   private boolean Combo_clicod_Includeselectalloption ;
   private boolean Combo_clicod_Emptyitem ;
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
   private boolean Combo_procod_Enabled ;
   private boolean Combo_procod_Visible ;
   private boolean Combo_procod_Allowmultipleselection ;
   private boolean Combo_procod_Isgriditem ;
   private boolean Combo_procod_Hasdescription ;
   private boolean Combo_procod_Includeonlyselectedoption ;
   private boolean Combo_procod_Includeselectalloption ;
   private boolean Combo_procod_Emptyitem ;
   private boolean Combo_procod_Includeaddnewoption ;
   private boolean Combo_fascodm_Enabled ;
   private boolean Combo_fascodm_Visible ;
   private boolean Combo_fascodm_Allowmultipleselection ;
   private boolean Combo_fascodm_Isgriditem ;
   private boolean Combo_fascodm_Hasdescription ;
   private boolean Combo_fascodm_Includeonlyselectedoption ;
   private boolean Combo_fascodm_Includeselectalloption ;
   private boolean Combo_fascodm_Emptyitem ;
   private boolean Combo_fascodm_Includeaddnewoption ;
   private boolean Combo_maqcodc_Enabled ;
   private boolean Combo_maqcodc_Visible ;
   private boolean Combo_maqcodc_Allowmultipleselection ;
   private boolean Combo_maqcodc_Isgriditem ;
   private boolean Combo_maqcodc_Hasdescription ;
   private boolean Combo_maqcodc_Includeonlyselectedoption ;
   private boolean Combo_maqcodc_Includeselectalloption ;
   private boolean Combo_maqcodc_Emptyitem ;
   private boolean Combo_maqcodc_Includeaddnewoption ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean Dvpanel_tableleaflevel_parametros_Enabled ;
   private boolean Dvpanel_tableleaflevel_parametros_Showheader ;
   private boolean Dvpanel_tableleaflevel_parametros_Visible ;
   private boolean Combo_parfascod_Enabled ;
   private boolean Combo_parfascod_Visible ;
   private boolean Combo_parfascod_Allowmultipleselection ;
   private boolean Combo_parfascod_Hasdescription ;
   private boolean Combo_parfascod_Includeonlyselectedoption ;
   private boolean Combo_parfascod_Includeselectalloption ;
   private boolean Combo_parfascod_Includeaddnewoption ;
   private boolean returnInSub ;
   private boolean n1665ParFasDsc ;
   private boolean Gx_longc ;
   private String Z9829ParFMObs ;
   private String Z14080ParFasPLC ;
   private String A14080ParFasPLC ;
   private String A9829ParFMObs ;
   private String AV35Imgprompt_GXI ;
   private String AV18ComboSelectedValue ;
   private String AV30imgPrompt ;
   private com.genexus.webpanels.GXWebGrid Gridlevel_parametrosContainer ;
   private com.genexus.webpanels.GXWebRow Gridlevel_parametrosRow ;
   private com.genexus.webpanels.GXWebColumn Gridlevel_parametrosColumn ;
   private com.genexus.webpanels.WebSession AV15WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.webpanels.GXUserControl ucCombo_clicod ;
   private com.genexus.webpanels.GXUserControl ucCombo_artcod ;
   private com.genexus.webpanels.GXUserControl ucCombo_procod ;
   private com.genexus.webpanels.GXUserControl ucCombo_fascodm ;
   private com.genexus.webpanels.GXUserControl ucCombo_maqcodc ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableleaflevel_parametros ;
   private com.genexus.webpanels.GXUserControl ucCombo_parfascod ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private String[] T01TC9_A407EmprNom ;
   private boolean[] T01TC9_n407EmprNom ;
   private String[] T01TC12_A759ProDsc ;
   private String[] T01TC10_A279CliNom ;
   private String[] T01TC11_A69ArtDsc ;
   private boolean[] T01TC11_n69ArtDsc ;
   private String[] T01TC14_A9830MaqCodC ;
   private String[] T01TC14_A407EmprNom ;
   private boolean[] T01TC14_n407EmprNom ;
   private String[] T01TC14_A279CliNom ;
   private String[] T01TC14_A69ArtDsc ;
   private boolean[] T01TC14_n69ArtDsc ;
   private String[] T01TC14_A759ProDsc ;
   private short[] T01TC14_A9869MaqAncC ;
   private String[] T01TC14_A396EmprCod ;
   private int[] T01TC14_A252CliCod ;
   private String[] T01TC14_A65ArtCod ;
   private String[] T01TC14_A758ProCod ;
   private String[] T01TC14_A9836FasCodM ;
   private String[] T01TC13_A396EmprCod ;
   private String[] T01TC15_A407EmprNom ;
   private boolean[] T01TC15_n407EmprNom ;
   private String[] T01TC16_A279CliNom ;
   private String[] T01TC17_A69ArtDsc ;
   private boolean[] T01TC17_n69ArtDsc ;
   private String[] T01TC18_A759ProDsc ;
   private String[] T01TC19_A396EmprCod ;
   private String[] T01TC20_A396EmprCod ;
   private int[] T01TC20_A252CliCod ;
   private String[] T01TC20_A65ArtCod ;
   private String[] T01TC20_A758ProCod ;
   private String[] T01TC20_A9836FasCodM ;
   private String[] T01TC20_A9830MaqCodC ;
   private String[] T01TC8_A9830MaqCodC ;
   private short[] T01TC8_A9869MaqAncC ;
   private String[] T01TC8_A396EmprCod ;
   private int[] T01TC8_A252CliCod ;
   private String[] T01TC8_A65ArtCod ;
   private String[] T01TC8_A758ProCod ;
   private String[] T01TC8_A9836FasCodM ;
   private String[] T01TC21_A396EmprCod ;
   private int[] T01TC21_A252CliCod ;
   private String[] T01TC21_A65ArtCod ;
   private String[] T01TC21_A758ProCod ;
   private String[] T01TC21_A9836FasCodM ;
   private String[] T01TC21_A9830MaqCodC ;
   private String[] T01TC22_A396EmprCod ;
   private int[] T01TC22_A252CliCod ;
   private String[] T01TC22_A65ArtCod ;
   private String[] T01TC22_A758ProCod ;
   private String[] T01TC22_A9836FasCodM ;
   private String[] T01TC22_A9830MaqCodC ;
   private String[] T01TC7_A9830MaqCodC ;
   private short[] T01TC7_A9869MaqAncC ;
   private String[] T01TC7_A396EmprCod ;
   private int[] T01TC7_A252CliCod ;
   private String[] T01TC7_A65ArtCod ;
   private String[] T01TC7_A758ProCod ;
   private String[] T01TC7_A9836FasCodM ;
   private String[] T01TC26_A407EmprNom ;
   private boolean[] T01TC26_n407EmprNom ;
   private String[] T01TC27_A279CliNom ;
   private String[] T01TC28_A69ArtDsc ;
   private boolean[] T01TC28_n69ArtDsc ;
   private String[] T01TC29_A759ProDsc ;
   private String[] T01TC30_A396EmprCod ;
   private int[] T01TC30_A252CliCod ;
   private String[] T01TC30_A65ArtCod ;
   private String[] T01TC30_A758ProCod ;
   private String[] T01TC30_A9836FasCodM ;
   private String[] T01TC30_A9830MaqCodC ;
   private short[] T01TC30_A9864MaqAncA ;
   private String[] T01TC31_A396EmprCod ;
   private int[] T01TC31_A252CliCod ;
   private String[] T01TC31_A65ArtCod ;
   private String[] T01TC31_A758ProCod ;
   private String[] T01TC31_A9836FasCodM ;
   private String[] T01TC31_A9830MaqCodC ;
   private String[] T01TC5_A12449ParEspDcS ;
   private boolean[] T01TC5_n12449ParEspDcS ;
   private int[] T01TC32_A252CliCod ;
   private String[] T01TC32_A65ArtCod ;
   private String[] T01TC32_A758ProCod ;
   private String[] T01TC32_A9836FasCodM ;
   private String[] T01TC32_A9830MaqCodC ;
   private String[] T01TC32_A1665ParFasDsc ;
   private boolean[] T01TC32_n1665ParFasDsc ;
   private String[] T01TC32_A9828ParFMVal ;
   private String[] T01TC32_A9829ParFMObs ;
   private short[] T01TC32_A10256Itm_ord2 ;
   private String[] T01TC32_A12449ParEspDcS ;
   private boolean[] T01TC32_n12449ParEspDcS ;
   private String[] T01TC32_A13204ParUndDsc ;
   private boolean[] T01TC32_n13204ParUndDsc ;
   private String[] T01TC32_A14075ParFMVMin ;
   private String[] T01TC32_A14076ParFMVMax ;
   private String[] T01TC32_A14077ParFMVal2 ;
   private String[] T01TC32_A14080ParFasPLC ;
   private String[] T01TC32_A396EmprCod ;
   private short[] T01TC32_A1664ParFasCod ;
   private short[] T01TC32_A12448ParEspIdS ;
   private boolean[] T01TC32_n12448ParEspIdS ;
   private short[] T01TC32_A13203ParUndID ;
   private boolean[] T01TC32_n13203ParUndID ;
   private String[] T01TC4_A1665ParFasDsc ;
   private boolean[] T01TC4_n1665ParFasDsc ;
   private short[] T01TC4_A13203ParUndID ;
   private boolean[] T01TC4_n13203ParUndID ;
   private String[] T01TC6_A13204ParUndDsc ;
   private boolean[] T01TC6_n13204ParUndDsc ;
   private String[] T01TC33_A1665ParFasDsc ;
   private boolean[] T01TC33_n1665ParFasDsc ;
   private short[] T01TC33_A13203ParUndID ;
   private boolean[] T01TC33_n13203ParUndID ;
   private String[] T01TC34_A13204ParUndDsc ;
   private boolean[] T01TC34_n13204ParUndDsc ;
   private String[] T01TC35_A396EmprCod ;
   private int[] T01TC35_A252CliCod ;
   private String[] T01TC35_A65ArtCod ;
   private String[] T01TC35_A758ProCod ;
   private String[] T01TC35_A9836FasCodM ;
   private String[] T01TC35_A9830MaqCodC ;
   private short[] T01TC35_A1664ParFasCod ;
   private int[] T01TC3_A252CliCod ;
   private String[] T01TC3_A65ArtCod ;
   private String[] T01TC3_A758ProCod ;
   private String[] T01TC3_A9836FasCodM ;
   private String[] T01TC3_A9830MaqCodC ;
   private String[] T01TC3_A9828ParFMVal ;
   private String[] T01TC3_A9829ParFMObs ;
   private short[] T01TC3_A10256Itm_ord2 ;
   private String[] T01TC3_A14075ParFMVMin ;
   private String[] T01TC3_A14076ParFMVMax ;
   private String[] T01TC3_A14077ParFMVal2 ;
   private String[] T01TC3_A14080ParFasPLC ;
   private String[] T01TC3_A396EmprCod ;
   private short[] T01TC3_A1664ParFasCod ;
   private short[] T01TC3_A12448ParEspIdS ;
   private boolean[] T01TC3_n12448ParEspIdS ;
   private int[] T01TC2_A252CliCod ;
   private String[] T01TC2_A65ArtCod ;
   private String[] T01TC2_A758ProCod ;
   private String[] T01TC2_A9836FasCodM ;
   private String[] T01TC2_A9830MaqCodC ;
   private String[] T01TC2_A9828ParFMVal ;
   private String[] T01TC2_A9829ParFMObs ;
   private short[] T01TC2_A10256Itm_ord2 ;
   private String[] T01TC2_A14075ParFMVMin ;
   private String[] T01TC2_A14076ParFMVMax ;
   private String[] T01TC2_A14077ParFMVal2 ;
   private String[] T01TC2_A14080ParFasPLC ;
   private String[] T01TC2_A396EmprCod ;
   private short[] T01TC2_A1664ParFasCod ;
   private short[] T01TC2_A12448ParEspIdS ;
   private boolean[] T01TC2_n12448ParEspIdS ;
   private String[] T01TC39_A1665ParFasDsc ;
   private boolean[] T01TC39_n1665ParFasDsc ;
   private short[] T01TC39_A13203ParUndID ;
   private boolean[] T01TC39_n13203ParUndID ;
   private String[] T01TC40_A13204ParUndDsc ;
   private boolean[] T01TC40_n13204ParUndDsc ;
   private String[] T01TC41_A396EmprCod ;
   private int[] T01TC41_A252CliCod ;
   private String[] T01TC41_A65ArtCod ;
   private String[] T01TC41_A758ProCod ;
   private String[] T01TC41_A9836FasCodM ;
   private String[] T01TC41_A9830MaqCodC ;
   private short[] T01TC41_A1664ParFasCod ;
   private String[] T01TC42_A396EmprCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV16CliCod_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV20ArtCod_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV22ProCod_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV24FasCodM_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV26MaqCodC_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV28ParFasCod_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXt_objcol_SdtDVB_SDTComboData_Item8 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXv_objcol_SdtDVB_SDTComboData_Item9[] ;
   private app.wwpbaseobjects.SdtWWPContext AV13WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext5[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV14TrnContext ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV17DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7[] ;
}

final  class capfm_p__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class capfm_p__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class capfm_p__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class capfm_p__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class capfm_p__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01TC2", "SELECT CliCod, ArtCod, ProCod, FasCodM, MaqCodC, ParFMVal, ParFMObs, Itm_ord2, ParFMVMin, ParFMVMax, ParFMVal2, ParFasPLC, EmprCod, ParFasCod, ParEspIdS FROM TXPCAPFM2 WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND ProCod = ? AND FasCodM = ? AND MaqCodC = ? AND ParFasCod = ?  FOR UPDATE OF ParFMVal, ParFMObs, Itm_ord2, ParFMVMin, ParFMVMax, ParFMVal2, ParFasPLC, ParEspIdS NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TC3", "SELECT CliCod, ArtCod, ProCod, FasCodM, MaqCodC, ParFMVal, ParFMObs, Itm_ord2, ParFMVMin, ParFMVMax, ParFMVal2, ParFasPLC, EmprCod, ParFasCod, ParEspIdS FROM TXPCAPFM2 WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND ProCod = ? AND FasCodM = ? AND MaqCodC = ? AND ParFasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TC4", "SELECT ParFasDsc, ParUndID FROM TXPPARFAS WHERE EmprCod = ? AND ParFasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TC5", "SELECT ParEspDc AS ParEspDcS FROM TXPPARESP WHERE EmprCod = ? AND ParEspId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TC6", "SELECT ParUndDsc FROM TXPPARUND WHERE EmprCod = ? AND ParUndID = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TC7", "SELECT MaqCodC, MaqAncC, EmprCod, CliCod, ArtCod, ProCod, FasCodM FROM TXPCAPFM1 WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND ProCod = ? AND FasCodM = ? AND MaqCodC = ?  FOR UPDATE OF MaqAncC NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TC8", "SELECT MaqCodC, MaqAncC, EmprCod, CliCod, ArtCod, ProCod, FasCodM FROM TXPCAPFM1 WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND ProCod = ? AND FasCodM = ? AND MaqCodC = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TC9", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TC10", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TC11", "SELECT ArtDsc FROM TXPARTICU WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TC12", "SELECT ProDsc FROM TXPPROCES WHERE EmprCod = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TC13", "SELECT EmprCod FROM TXPCAPFMP WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND ProCod = ? AND FasCodM = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TC14", "SELECT /*+ FIRST_ROWS(100) */ TM1.MaqCodC, T2.EmprNom, T3.CliNom, T4.ArtDsc, T5.ProDsc, TM1.MaqAncC, TM1.EmprCod, TM1.CliCod, TM1.ArtCod, TM1.ProCod, TM1.FasCodM FROM ((((TXPCAPFM1 TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = TM1.EmprCod AND T3.CliCod = TM1.CliCod) INNER JOIN TXPARTICU T4 ON T4.EmprCod = TM1.EmprCod AND T4.CliCod = TM1.CliCod AND T4.ArtCod = TM1.ArtCod) INNER JOIN TXPPROCES T5 ON T5.EmprCod = TM1.EmprCod AND T5.ProCod = TM1.ProCod) WHERE TM1.EmprCod = ? and TM1.CliCod = ? and TM1.ArtCod = ? and TM1.ProCod = ? and TM1.FasCodM = ? and TM1.MaqCodC = ? ORDER BY TM1.EmprCod, TM1.CliCod, TM1.ArtCod, TM1.ProCod, TM1.FasCodM, TM1.MaqCodC ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TC15", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TC16", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TC17", "SELECT ArtDsc FROM TXPARTICU WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TC18", "SELECT ProDsc FROM TXPPROCES WHERE EmprCod = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TC19", "SELECT EmprCod FROM TXPCAPFMP WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND ProCod = ? AND FasCodM = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TC20", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, ArtCod, ProCod, FasCodM, MaqCodC FROM TXPCAPFM1 WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND ProCod = ? AND FasCodM = ? AND MaqCodC = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TC21", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, ArtCod, ProCod, FasCodM, MaqCodC FROM TXPCAPFM1 WHERE ( EmprCod > ? or EmprCod = ? and CliCod > ? or CliCod = ? and EmprCod = ? and ArtCod > ? or ArtCod = ? and CliCod = ? and EmprCod = ? and ProCod > ? or ProCod = ? and ArtCod = ? and CliCod = ? and EmprCod = ? and FasCodM > ? or FasCodM = ? and ProCod = ? and ArtCod = ? and CliCod = ? and EmprCod = ? and MaqCodC > ?) ORDER BY EmprCod, CliCod, ArtCod, ProCod, FasCodM, MaqCodC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01TC22", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, ArtCod, ProCod, FasCodM, MaqCodC FROM TXPCAPFM1 WHERE ( EmprCod < ? or EmprCod = ? and CliCod < ? or CliCod = ? and EmprCod = ? and ArtCod < ? or ArtCod = ? and CliCod = ? and EmprCod = ? and ProCod < ? or ProCod = ? and ArtCod = ? and CliCod = ? and EmprCod = ? and FasCodM < ? or FasCodM = ? and ProCod = ? and ArtCod = ? and CliCod = ? and EmprCod = ? and MaqCodC < ?) ORDER BY EmprCod DESC, CliCod DESC, ArtCod DESC, ProCod DESC, FasCodM DESC, MaqCodC DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01TC23", "INSERT INTO TXPCAPFM1(MaqCodC, MaqAncC, EmprCod, CliCod, ArtCod, ProCod, FasCodM, CPFMPres, CPFMPrep, CPFMVel, CPFMNp, CPFMDc, CPFMDc2) VALUES(?, ?, ?, ?, ?, ?, ?, 0, 0, 0, 0, 0, 0)", GX_NOMASK, "TXPCAPFM1")
         ,new UpdateCursor("T01TC24", "UPDATE TXPCAPFM1 SET MaqAncC=?  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND ProCod = ? AND FasCodM = ? AND MaqCodC = ?", GX_NOMASK, "TXPCAPFM1")
         ,new UpdateCursor("T01TC25", "DELETE FROM TXPCAPFM1  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND ProCod = ? AND FasCodM = ? AND MaqCodC = ?", GX_NOMASK, "TXPCAPFM1")
         ,new ForEachCursor("T01TC26", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TC27", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TC28", "SELECT ArtDsc FROM TXPARTICU WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TC29", "SELECT ProDsc FROM TXPPROCES WHERE EmprCod = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TC30", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, ProCod, FasCodM, MaqCodC, MaqAncA FROM TXPPFSMQA WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND ProCod = ? AND FasCodM = ? AND MaqCodC = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01TC31", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, CliCod, ArtCod, ProCod, FasCodM, MaqCodC FROM TXPCAPFM1 ORDER BY EmprCod, CliCod, ArtCod, ProCod, FasCodM, MaqCodC ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TC32", "SELECT T1.CliCod, T1.ArtCod, T1.ProCod, T1.FasCodM, T1.MaqCodC, T3.ParFasDsc, T1.ParFMVal, T1.ParFMObs, T1.Itm_ord2, T2.ParEspDc AS ParEspDcS, T4.ParUndDsc, T1.ParFMVMin, T1.ParFMVMax, T1.ParFMVal2, T1.ParFasPLC, T1.EmprCod, T1.ParFasCod, T1.ParEspIdS AS ParEspIdS, T3.ParUndID FROM (((TXPCAPFM2 T1 LEFT JOIN TXPPARESP T2 ON T2.EmprCod = T1.EmprCod AND T2.ParEspId = T1.ParEspIdS) INNER JOIN TXPPARFAS T3 ON T3.EmprCod = T1.EmprCod AND T3.ParFasCod = T1.ParFasCod) LEFT JOIN TXPPARUND T4 ON T4.EmprCod = T1.EmprCod AND T4.ParUndID = T3.ParUndID) WHERE T1.EmprCod = ? and T1.CliCod = ? and T1.ArtCod = ? and T1.ProCod = ? and T1.FasCodM = ? and T1.MaqCodC = ? and T1.ParFasCod = ? ORDER BY T1.EmprCod, T1.CliCod, T1.ArtCod, T1.ProCod, T1.FasCodM, T1.MaqCodC, T1.ParFasCod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TC33", "SELECT ParFasDsc, ParUndID FROM TXPPARFAS WHERE EmprCod = ? AND ParFasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TC34", "SELECT ParUndDsc FROM TXPPARUND WHERE EmprCod = ? AND ParUndID = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TC35", "SELECT EmprCod, CliCod, ArtCod, ProCod, FasCodM, MaqCodC, ParFasCod FROM TXPCAPFM2 WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND ProCod = ? AND FasCodM = ? AND MaqCodC = ? AND ParFasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01TC36", "INSERT INTO TXPCAPFM2(CliCod, ArtCod, ProCod, FasCodM, MaqCodC, ParFMVal, ParFMObs, Itm_ord2, ParFMVMin, ParFMVMax, ParFMVal2, ParFasPLC, EmprCod, ParFasCod, ParEspIdS) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPCAPFM2")
         ,new UpdateCursor("T01TC37", "UPDATE TXPCAPFM2 SET ParFMVal=?, ParFMObs=?, Itm_ord2=?, ParFMVMin=?, ParFMVMax=?, ParFMVal2=?, ParFasPLC=?, ParEspIdS=?  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND ProCod = ? AND FasCodM = ? AND MaqCodC = ? AND ParFasCod = ?", GX_NOMASK, "TXPCAPFM2")
         ,new UpdateCursor("T01TC38", "DELETE FROM TXPCAPFM2  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND ProCod = ? AND FasCodM = ? AND MaqCodC = ? AND ParFasCod = ?", GX_NOMASK, "TXPCAPFM2")
         ,new ForEachCursor("T01TC39", "SELECT ParFasDsc, ParUndID FROM TXPPARFAS WHERE EmprCod = ? AND ParFasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TC40", "SELECT ParUndDsc FROM TXPPARUND WHERE EmprCod = ? AND ParUndID = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TC41", "SELECT EmprCod, CliCod, ArtCod, ProCod, FasCodM, MaqCodC, ParFasCod FROM TXPCAPFM2 WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and ProCod = ? and FasCodM = ? and MaqCodC = ? ORDER BY EmprCod, CliCod, ArtCod, ProCod, FasCodM, MaqCodC, ParFasCod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TC42", "SELECT EmprCod FROM TXPCAPFMP WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND ProCod = ? AND FasCodM = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((String[]) buf[6])[0] = rslt.getVarchar(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 12);
               ((String[]) buf[9])[0] = rslt.getString(10, 12);
               ((String[]) buf[10])[0] = rslt.getString(11, 12);
               ((String[]) buf[11])[0] = rslt.getVarchar(12);
               ((String[]) buf[12])[0] = rslt.getString(13, 3);
               ((short[]) buf[13])[0] = rslt.getShort(14);
               ((short[]) buf[14])[0] = rslt.getShort(15);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((String[]) buf[6])[0] = rslt.getVarchar(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 12);
               ((String[]) buf[9])[0] = rslt.getString(10, 12);
               ((String[]) buf[10])[0] = rslt.getString(11, 12);
               ((String[]) buf[11])[0] = rslt.getVarchar(12);
               ((String[]) buf[12])[0] = rslt.getString(13, 3);
               ((short[]) buf[13])[0] = rslt.getShort(14);
               ((short[]) buf[14])[0] = rslt.getShort(15);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((short[]) buf[2])[0] = rslt.getShort(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 50);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 15);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((String[]) buf[4])[0] = rslt.getString(4, 26);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 40);
               ((short[]) buf[7])[0] = rslt.getShort(6);
               ((String[]) buf[8])[0] = rslt.getString(7, 3);
               ((int[]) buf[9])[0] = rslt.getInt(8);
               ((String[]) buf[10])[0] = rslt.getString(9, 16);
               ((String[]) buf[11])[0] = rslt.getString(10, 8);
               ((String[]) buf[12])[0] = rslt.getString(11, 8);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               return;
      }
      getresults30( cursor, rslt, buf) ;
   }

   public void getresults30( int cursor ,
                             IFieldGetter rslt ,
                             Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 30 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((String[]) buf[5])[0] = rslt.getString(6, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 8);
               ((String[]) buf[8])[0] = rslt.getVarchar(8);
               ((short[]) buf[9])[0] = rslt.getShort(9);
               ((String[]) buf[10])[0] = rslt.getString(10, 50);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(11, 15);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(12, 12);
               ((String[]) buf[15])[0] = rslt.getString(13, 12);
               ((String[]) buf[16])[0] = rslt.getString(14, 12);
               ((String[]) buf[17])[0] = rslt.getVarchar(15);
               ((String[]) buf[18])[0] = rslt.getString(16, 3);
               ((short[]) buf[19])[0] = rslt.getShort(17);
               ((short[]) buf[20])[0] = rslt.getShort(18);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((short[]) buf[22])[0] = rslt.getShort(19);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((short[]) buf[2])[0] = rslt.getShort(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 15);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 33 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 37 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((short[]) buf[2])[0] = rslt.getShort(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 38 :
               ((String[]) buf[0])[0] = rslt.getString(1, 15);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 39 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 40 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
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
               stmt.setString(4, (String)parms[3], 8);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setString(6, (String)parms[5], 6);
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 8);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setString(6, (String)parms[5], 6);
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
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
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 8);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setString(6, (String)parms[5], 6);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 8);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setString(6, (String)parms[5], 6);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 8);
               stmt.setString(5, (String)parms[4], 8);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 8);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setString(6, (String)parms[5], 6);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 8);
               stmt.setString(5, (String)parms[4], 8);
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 8);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setString(6, (String)parms[5], 6);
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 3);
               stmt.setString(6, (String)parms[5], 16);
               stmt.setString(7, (String)parms[6], 16);
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setString(9, (String)parms[8], 3);
               stmt.setString(10, (String)parms[9], 8);
               stmt.setString(11, (String)parms[10], 8);
               stmt.setString(12, (String)parms[11], 16);
               stmt.setInt(13, ((Number) parms[12]).intValue());
               stmt.setString(14, (String)parms[13], 3);
               stmt.setString(15, (String)parms[14], 8);
               stmt.setString(16, (String)parms[15], 8);
               stmt.setString(17, (String)parms[16], 8);
               stmt.setString(18, (String)parms[17], 16);
               stmt.setInt(19, ((Number) parms[18]).intValue());
               stmt.setString(20, (String)parms[19], 3);
               stmt.setString(21, (String)parms[20], 6);
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 3);
               stmt.setString(6, (String)parms[5], 16);
               stmt.setString(7, (String)parms[6], 16);
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setString(9, (String)parms[8], 3);
               stmt.setString(10, (String)parms[9], 8);
               stmt.setString(11, (String)parms[10], 8);
               stmt.setString(12, (String)parms[11], 16);
               stmt.setInt(13, ((Number) parms[12]).intValue());
               stmt.setString(14, (String)parms[13], 3);
               stmt.setString(15, (String)parms[14], 8);
               stmt.setString(16, (String)parms[15], 8);
               stmt.setString(17, (String)parms[16], 8);
               stmt.setString(18, (String)parms[17], 16);
               stmt.setInt(19, ((Number) parms[18]).intValue());
               stmt.setString(20, (String)parms[19], 3);
               stmt.setString(21, (String)parms[20], 6);
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 6);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 16);
               stmt.setString(6, (String)parms[5], 8);
               stmt.setString(7, (String)parms[6], 8);
               return;
            case 22 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 16);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setString(6, (String)parms[5], 8);
               stmt.setString(7, (String)parms[6], 6);
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 8);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setString(6, (String)parms[5], 6);
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 28 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 8);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setString(6, (String)parms[5], 6);
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 8);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setString(6, (String)parms[5], 6);
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 31 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 32 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               return;
            case 33 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 8);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setString(6, (String)parms[5], 6);
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 34 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 16);
               stmt.setString(3, (String)parms[2], 8);
               stmt.setString(4, (String)parms[3], 8);
               stmt.setString(5, (String)parms[4], 6);
               stmt.setString(6, (String)parms[5], 8);
               stmt.setVarchar(7, (String)parms[6], 400, false);
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               stmt.setString(9, (String)parms[8], 12);
               stmt.setString(10, (String)parms[9], 12);
               stmt.setString(11, (String)parms[10], 12);
               stmt.setVarchar(12, (String)parms[11], 100, false);
               stmt.setString(13, (String)parms[12], 3);
               stmt.setShort(14, ((Number) parms[13]).shortValue());
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(15, ((Number) parms[15]).shortValue());
               }
               return;
            case 35 :
               stmt.setString(1, (String)parms[0], 8);
               stmt.setVarchar(2, (String)parms[1], 400, false);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 12);
               stmt.setString(5, (String)parms[4], 12);
               stmt.setString(6, (String)parms[5], 12);
               stmt.setVarchar(7, (String)parms[6], 100, false);
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(8, ((Number) parms[8]).shortValue());
               }
               stmt.setString(9, (String)parms[9], 3);
               stmt.setInt(10, ((Number) parms[10]).intValue());
               stmt.setString(11, (String)parms[11], 16);
               stmt.setString(12, (String)parms[12], 8);
               stmt.setString(13, (String)parms[13], 8);
               stmt.setString(14, (String)parms[14], 6);
               stmt.setShort(15, ((Number) parms[15]).shortValue());
               return;
            case 36 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 8);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setString(6, (String)parms[5], 6);
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 37 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 38 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               return;
            case 39 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 8);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setString(6, (String)parms[5], 6);
               return;
            case 40 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 8);
               stmt.setString(5, (String)parms[4], 8);
               return;
      }
   }

}

