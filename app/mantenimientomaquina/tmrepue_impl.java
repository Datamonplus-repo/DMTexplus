package app.mantenimientomaquina ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tmrepue_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxCallCrl"+"_"+"MRMOVTPO") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxdlamrmovtpo13W1239( A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxCallCrl"+"_"+"MRRESTPO") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxdlamrrestpo13W1240( A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel4"+"_"+"MRCOD") == 0 )
      {
         AV13MRCod = (int)(GXutil.lval( httpContext.GetPar( "MRCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13MRCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13MRCod), 8, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMRCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV13MRCod), "ZZZZZZZ9")));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx4asamrcod13W1238( AV13MRCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel5"+"_"+"MRCOD") == 0 )
      {
         AV16Artextil = (byte)(GXutil.lval( httpContext.GetPar( "Artextil"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16Artextil", GXutil.str( AV16Artextil, 1, 0));
         AV17NumManual = (byte)(GXutil.lval( httpContext.GetPar( "NumManual"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17NumManual", GXutil.str( AV17NumManual, 1, 0));
         Gx_mode = httpContext.GetPar( "Mode") ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx5asamrcod13W1238( AV16Artextil, AV17NumManual, Gx_mode, A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_41") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_41( A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_43") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A795PrvNum = (int)(GXutil.lval( httpContext.GetPar( "PrvNum"))) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_43( A396EmprCod, A795PrvNum) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_45") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A9505MRMovTpo = (int)(GXutil.lval( httpContext.GetPar( "MRMovTpo"))) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_45( A396EmprCod, A9505MRMovTpo) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_47") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A9513MRResTpo = (int)(GXutil.lval( httpContext.GetPar( "MRResTpo"))) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_47( A396EmprCod, A9513MRResTpo) ;
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Gridlevel_prv") == 0 )
      {
         gxnrgridlevel_prv_newrow_invoke( ) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Gridlevel_level1") == 0 )
      {
         gxnrgridlevel_level1_newrow_invoke( ) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Gridlevel_level2") == 0 )
      {
         gxnrgridlevel_level2_newrow_invoke( ) ;
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
            AV20EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV20EmprCod", AV20EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV20EmprCod, "@!"))));
            AV13MRCod = (int)(GXutil.lval( httpContext.GetPar( "MRCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13MRCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13MRCod), 8, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMRCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV13MRCod), "ZZZZZZZ9")));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Respuestos", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtMRCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public void gxnrgridlevel_prv_newrow_invoke( )
   {
      nRC_GXsfl_92 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_92"))) ;
      nGXsfl_92_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_92_idx"))) ;
      sGXsfl_92_idx = httpContext.GetPar( "sGXsfl_92_idx") ;
      edtPrvNum_Horizontalalignment = httpContext.GetNextPar( ) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrvNum_Internalname, "Horizontalalignment", edtPrvNum_Horizontalalignment, !bGXsfl_92_Refreshing);
      Gx_mode = httpContext.GetPar( "Mode") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgridlevel_prv_newrow( ) ;
      /* End function gxnrGridlevel_prv_newrow_invoke */
   }

   public void gxnrgridlevel_level1_newrow_invoke( )
   {
      nRC_GXsfl_106 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_106"))) ;
      nGXsfl_106_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_106_idx"))) ;
      sGXsfl_106_idx = httpContext.GetPar( "sGXsfl_106_idx") ;
      A9500MRUltMov = (int)(GXutil.lval( httpContext.GetPar( "MRUltMov"))) ;
      n9500MRUltMov = false ;
      Gx_BScreen = (byte)(GXutil.lval( httpContext.GetPar( "Gx_BScreen"))) ;
      A9499MRStkPre = CommonUtil.decimalVal( httpContext.GetPar( "MRStkPre"), ".") ;
      n9499MRStkPre = false ;
      AV20EmprCod = httpContext.GetPar( "EmprCod") ;
      A396EmprCod = httpContext.GetPar( "EmprCod") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgridlevel_level1_newrow( ) ;
      /* End function gxnrGridlevel_level1_newrow_invoke */
   }

   public void gxnrgridlevel_level2_newrow_invoke( )
   {
      nRC_GXsfl_125 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_125"))) ;
      nGXsfl_125_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_125_idx"))) ;
      sGXsfl_125_idx = httpContext.GetPar( "sGXsfl_125_idx") ;
      A9501MRUltRes = GXutil.lval( httpContext.GetPar( "MRUltRes")) ;
      n9501MRUltRes = false ;
      Gx_BScreen = (byte)(GXutil.lval( httpContext.GetPar( "Gx_BScreen"))) ;
      AV20EmprCod = httpContext.GetPar( "EmprCod") ;
      A396EmprCod = httpContext.GetPar( "EmprCod") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgridlevel_level2_newrow( ) ;
      /* End function gxnrGridlevel_level2_newrow_invoke */
   }

   public tmrepue_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tmrepue_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tmrepue_impl.class ));
   }

   public tmrepue_impl( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      chkMRActivo = UIFactory.getCheckbox(this);
      chkMRPrvHab = UIFactory.getCheckbox(this);
      dynMRMovTpo = new HTMLChoice();
      dynMRResTpo = new HTMLChoice();
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
      A12850MRActivo = ((GXutil.strcmp(GXutil.rtrim( A12850MRActivo), "S")==0) ? "S" : "N") ;
      n12850MRActivo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12850MRActivo", A12850MRActivo);
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
      /* User Defined Control */
      ucDvpanel_opciones.setProperty("Width", Dvpanel_opciones_Width);
      ucDvpanel_opciones.setProperty("AutoWidth", Dvpanel_opciones_Autowidth);
      ucDvpanel_opciones.setProperty("AutoHeight", Dvpanel_opciones_Autoheight);
      ucDvpanel_opciones.setProperty("Cls", Dvpanel_opciones_Cls);
      ucDvpanel_opciones.setProperty("Title", Dvpanel_opciones_Title);
      ucDvpanel_opciones.setProperty("Collapsible", Dvpanel_opciones_Collapsible);
      ucDvpanel_opciones.setProperty("Collapsed", Dvpanel_opciones_Collapsed);
      ucDvpanel_opciones.setProperty("ShowCollapseIcon", Dvpanel_opciones_Showcollapseicon);
      ucDvpanel_opciones.setProperty("IconPosition", Dvpanel_opciones_Iconposition);
      ucDvpanel_opciones.setProperty("AutoScroll", Dvpanel_opciones_Autoscroll);
      ucDvpanel_opciones.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_opciones_Internalname, "DVPANEL_OPCIONESContainer");
      httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_OPCIONESContainer"+"Opciones"+"\" style=\"display:none;\">") ;
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divOpciones_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* User Defined Control */
      ucGxuitabspanel_tabs.setProperty("PageCount", Gxuitabspanel_tabs_Pagecount);
      ucGxuitabspanel_tabs.setProperty("Class", Gxuitabspanel_tabs_Class);
      ucGxuitabspanel_tabs.setProperty("HistoryManagement", Gxuitabspanel_tabs_Historymanagement);
      ucGxuitabspanel_tabs.render(context, "tab", Gxuitabspanel_tabs_Internalname, "GXUITABSPANEL_TABSContainer");
      httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"GXUITABSPANEL_TABSContainer"+"title1"+"\" style=\"display:none;\">") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTabgeneral_title_Internalname, httpContext.getMessage( "WWP_TemplateDataPanelTitle", ""), "", "", lblTabgeneral_title_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_MantenimientoMaquina\\TMRepue.htm");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", "", "display:none;", "div");
      httpContext.writeText( "tabGeneral") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      httpContext.writeText( "</div>") ;
      httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"GXUITABSPANEL_TABSContainer"+"panel1"+"\" style=\"display:none;\">") ;
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell DscTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMRCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMRCod_Internalname, httpContext.getMessage( "Repuesto", ""), " AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMRCod_Internalname, GXutil.ltrim( localUtil.ntoc( A9492MRCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A9492MRCod), "ZZZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMRCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMRCod_Enabled, 1, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MantenimientoMaquina\\TMRepue.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMRNom_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMRNom_Internalname, httpContext.getMessage( "Nombre del Repuesto", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 34,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMRNom_Internalname, GXutil.rtrim( A9493MRNom), GXutil.rtrim( localUtil.format( A9493MRNom, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,34);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMRNom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMRNom_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_MantenimientoMaquina\\TMRepue.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell DscTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkMRActivo.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, chkMRActivo.getInternalname(), " ", " AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Check box */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'',0)\"" ;
      ClassString = "AttributeFL" ;
      StyleString = "" ;
      app.GxWebStd.gx_checkbox_ctrl( httpContext, chkMRActivo.getInternalname(), A12850MRActivo, "", " ", 1, chkMRActivo.getEnabled(), "S", httpContext.getMessage( "Activo?", ""), StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(39, this, 'S', 'N',"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+""+";gx.evt.onblur(this,39);\"");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell DscTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMRCodExt_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMRCodExt_Internalname, httpContext.getMessage( "Cod Externo", ""), " AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 43,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMRCodExt_Internalname, GXutil.rtrim( A9494MRCodExt), GXutil.rtrim( localUtil.format( A9494MRCodExt, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,43);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMRCodExt_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMRCodExt_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_MantenimientoMaquina\\TMRepue.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell DscTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMRCodPrv_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMRCodPrv_Internalname, httpContext.getMessage( "Proveedor", ""), " AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 48,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMRCodPrv_Internalname, GXutil.rtrim( A11458MRCodPrv), GXutil.rtrim( localUtil.format( A11458MRCodPrv, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,48);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMRCodPrv_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMRCodPrv_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_MantenimientoMaquina\\TMRepue.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMRLote_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMRLote_Internalname, httpContext.getMessage( "Lote", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 52,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMRLote_Internalname, GXutil.rtrim( A14491MRLote), GXutil.rtrim( localUtil.format( A14491MRLote, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,52);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMRLote_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMRLote_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_MantenimientoMaquina\\TMRepue.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell DscTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMRStkPre_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMRStkPre_Internalname, httpContext.getMessage( "Precio", ""), " AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 60,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMRStkPre_Internalname, GXutil.ltrim( localUtil.ntoc( A9499MRStkPre, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMRStkPre_Enabled!=0) ? localUtil.format( A9499MRStkPre, "ZZZZZZ9.999") : localUtil.format( A9499MRStkPre, "ZZZZZZ9.999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onblur(this,60);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMRStkPre_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMRStkPre_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MantenimientoMaquina\\TMRepue.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-8", "left", "top", "", "", "div");
      /* Control Group */
      app.GxWebStd.gx_group_start( httpContext, grpUnnamedgroup3_Internalname, httpContext.getMessage( "Stocks", ""), 1, 0, "px", 0, "px", "Group", "", "HLP_MantenimientoMaquina\\TMRepue.htm");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divGrupostocks_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMRStkMin_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMRStkMin_Internalname, httpContext.getMessage( "Mínimo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 68,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMRStkMin_Internalname, GXutil.ltrim( localUtil.ntoc( A9497MRStkMin, (byte)(14), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMRStkMin_Enabled!=0) ? localUtil.format( A9497MRStkMin, "Z,ZZZ,ZZZ9.999") : localUtil.format( A9497MRStkMin, "Z,ZZZ,ZZZ9.999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onblur(this,68);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMRStkMin_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMRStkMin_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MantenimientoMaquina\\TMRepue.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMRStkCri_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMRStkCri_Internalname, httpContext.getMessage( "Crítico", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 72,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMRStkCri_Internalname, GXutil.ltrim( localUtil.ntoc( A9498MRStkCri, (byte)(14), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMRStkCri_Enabled!=0) ? localUtil.format( A9498MRStkCri, "Z,ZZZ,ZZZ9.999") : localUtil.format( A9498MRStkCri, "Z,ZZZ,ZZZ9.999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onblur(this,72);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMRStkCri_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMRStkCri_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MantenimientoMaquina\\TMRepue.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMRStkAct_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMRStkAct_Internalname, httpContext.getMessage( "Actual", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtMRStkAct_Internalname, GXutil.ltrim( localUtil.ntoc( A9495MRStkAct, (byte)(14), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMRStkAct_Enabled!=0) ? localUtil.format( A9495MRStkAct, "Z,ZZZ,ZZZ9.999") : localUtil.format( A9495MRStkAct, "Z,ZZZ,ZZZ9.999"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMRStkAct_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMRStkAct_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MantenimientoMaquina\\TMRepue.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMRStkRes_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMRStkRes_Internalname, httpContext.getMessage( "Reservado", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtMRStkRes_Internalname, GXutil.ltrim( localUtil.ntoc( A9496MRStkRes, (byte)(14), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMRStkRes_Enabled!=0) ? localUtil.format( A9496MRStkRes, "Z,ZZZ,ZZZ9.999") : localUtil.format( A9496MRStkRes, "Z,ZZZ,ZZZ9.999"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMRStkRes_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMRStkRes_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MantenimientoMaquina\\TMRepue.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      httpContext.writeText( "</fieldset>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      httpContext.writeText( "</div>") ;
      httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"GXUITABSPANEL_TABSContainer"+"title2"+"\" style=\"display:none;\">") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTablevel_prv_title_Internalname, httpContext.getMessage( "Proveedores", ""), "", "", lblTablevel_prv_title_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_MantenimientoMaquina\\TMRepue.htm");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", "", "display:none;", "div");
      httpContext.writeText( "TabLevel_Prv") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      httpContext.writeText( "</div>") ;
      httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"GXUITABSPANEL_TABSContainer"+"panel2"+"\" style=\"display:none;\">") ;
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTabtablelevel_prv_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTableleaflevel_prv_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 SectionGrid EditableGridCell_LinedAtts", "left", "top", "", "", "div");
      gxdraw_gridlevel_prv( ) ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      httpContext.writeText( "</div>") ;
      httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"GXUITABSPANEL_TABSContainer"+"title3"+"\" style=\"display:none;\">") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTablevel_level1_title_Internalname, httpContext.getMessage( "Movimientos", ""), "", "", lblTablevel_level1_title_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_MantenimientoMaquina\\TMRepue.htm");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", "", "display:none;", "div");
      httpContext.writeText( "TabLevel_Level1") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      httpContext.writeText( "</div>") ;
      httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"GXUITABSPANEL_TABSContainer"+"panel3"+"\" style=\"display:none;\">") ;
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTabtablelevel_level1_Internalname, divTabtablelevel_level1_Visible, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTableleaflevel_level1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 SectionGrid EditableGridCell_LinedAtts", "left", "top", "", "", "div");
      gxdraw_gridlevel_level1( ) ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      httpContext.writeText( "</div>") ;
      httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"GXUITABSPANEL_TABSContainer"+"title4"+"\" style=\"display:none;\">") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTablevel_level2_title_Internalname, httpContext.getMessage( "Reservas", ""), "", "", lblTablevel_level2_title_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_MantenimientoMaquina\\TMRepue.htm");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", "", "display:none;", "div");
      httpContext.writeText( "TabLevel_Level2") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      httpContext.writeText( "</div>") ;
      httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"GXUITABSPANEL_TABSContainer"+"panel4"+"\" style=\"display:none;\">") ;
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTabtablelevel_level2_Internalname, divTabtablelevel_level2_Visible, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTableleaflevel_level2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 SectionGrid EditableGridCell_LinedAtts", "left", "top", "", "", "div");
      gxdraw_gridlevel_level2( ) ;
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
      httpContext.writeText( "</div>") ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 137,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_MantenimientoMaquina\\TMRepue.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 139,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_MantenimientoMaquina\\TMRepue.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 141,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_MantenimientoMaquina\\TMRepue.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV34Pgmname), GXutil.rtrim( localUtil.format( AV34Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_MantenimientoMaquina\\TMRepue.htm");
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
      /* User Defined Control */
      ucCombo_prvnum.setProperty("Caption", Combo_prvnum_Caption);
      ucCombo_prvnum.setProperty("Cls", Combo_prvnum_Cls);
      ucCombo_prvnum.setProperty("IsGridItem", Combo_prvnum_Isgriditem);
      ucCombo_prvnum.setProperty("EmptyItem", Combo_prvnum_Emptyitem);
      ucCombo_prvnum.setProperty("DropDownOptionsTitleSettingsIcons", AV32DDO_TitleSettingsIcons);
      ucCombo_prvnum.setProperty("DropDownOptionsData", AV30PrvNum_Data);
      ucCombo_prvnum.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_prvnum_Internalname, "COMBO_PRVNUMContainer");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtMRUltMov_Internalname, GXutil.ltrim( localUtil.ntoc( A9500MRUltMov, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMRUltMov_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A9500MRUltMov), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A9500MRUltMov), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMRUltMov_Jsonclick, 0, "Attribute", "", "", "", "", edtMRUltMov_Visible, edtMRUltMov_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MantenimientoMaquina\\TMRepue.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtMRUltRes_Internalname, GXutil.ltrim( localUtil.ntoc( A9501MRUltRes, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMRUltRes_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A9501MRUltRes), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A9501MRUltRes), "ZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMRUltRes_Jsonclick, 0, "Attribute", "", "", "", "", edtMRUltRes_Visible, edtMRUltRes_Enabled, 0, "text", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MantenimientoMaquina\\TMRepue.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 152,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,152);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", edtEmprCod_Visible, edtEmprCod_Enabled, 1, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_MantenimientoMaquina\\TMRepue.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "Attribute", "", "", "", "", edtEmprNom_Visible, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_MantenimientoMaquina\\TMRepue.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
   }

   public void gxdraw_gridlevel_prv( )
   {
      /*  Grid Control  */
      startgridcontrol92( ) ;
      nGXsfl_92_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1473 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1473 = (short)(1) ;
            scanStart13W1473( ) ;
            while ( RcdFound1473 != 0 )
            {
               init_level_properties1473( ) ;
               getByPrimaryKey13W1473( ) ;
               addRow13W1473( ) ;
               scanNext13W1473( ) ;
            }
            scanEnd13W1473( ) ;
            nBlankRcdCount1473 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B9496MRStkRes = A9496MRStkRes ;
         n9496MRStkRes = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9496MRStkRes", GXutil.ltrimstr( A9496MRStkRes, 10, 3));
         B9501MRUltRes = A9501MRUltRes ;
         n9501MRUltRes = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9501MRUltRes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9501MRUltRes), 10, 0));
         B9495MRStkAct = A9495MRStkAct ;
         n9495MRStkAct = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9495MRStkAct", GXutil.ltrimstr( A9495MRStkAct, 10, 3));
         B9500MRUltMov = A9500MRUltMov ;
         n9500MRUltMov = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9500MRUltMov", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9500MRUltMov), 8, 0));
         standaloneNotModal13W1473( ) ;
         standaloneModal13W1473( ) ;
         sMode1473 = Gx_mode ;
         while ( nGXsfl_92_idx < nRC_GXsfl_92 )
         {
            bGXsfl_92_Refreshing = true ;
            readRow13W1473( ) ;
            edtPrvNum_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRVNUM_"+sGXsfl_92_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPrvNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvNum_Enabled), 5, 0), !bGXsfl_92_Refreshing);
            edtPrvNum_Horizontalalignment = httpContext.cgiGet( "PRVNUM_"+sGXsfl_92_idx+"Horizontalalignment") ;
            httpContext.ajax_rsp_assign_prop("", false, edtPrvNum_Internalname, "Horizontalalignment", edtPrvNum_Horizontalalignment, !bGXsfl_92_Refreshing);
            edtPrvNom_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRVNOM_"+sGXsfl_92_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPrvNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvNom_Enabled), 5, 0), !bGXsfl_92_Refreshing);
            chkMRPrvHab.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "MRPRVHAB_"+sGXsfl_92_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
            httpContext.ajax_rsp_assign_prop("", false, chkMRPrvHab.getInternalname(), "Enabled", GXutil.ltrimstr( chkMRPrvHab.getEnabled(), 5, 0), !bGXsfl_92_Refreshing);
            if ( ( nRcdExists_1473 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal13W1473( ) ;
            }
            sendRow13W1473( ) ;
            bGXsfl_92_Refreshing = false ;
         }
         Gx_mode = sMode1473 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A9496MRStkRes = B9496MRStkRes ;
         n9496MRStkRes = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9496MRStkRes", GXutil.ltrimstr( A9496MRStkRes, 10, 3));
         A9501MRUltRes = B9501MRUltRes ;
         n9501MRUltRes = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9501MRUltRes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9501MRUltRes), 10, 0));
         A9495MRStkAct = B9495MRStkAct ;
         n9495MRStkAct = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9495MRStkAct", GXutil.ltrimstr( A9495MRStkAct, 10, 3));
         A9500MRUltMov = B9500MRUltMov ;
         n9500MRUltMov = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9500MRUltMov", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9500MRUltMov), 8, 0));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1473 = (short)(5) ;
         nRcdExists_1473 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart13W1473( ) ;
            while ( RcdFound1473 != 0 )
            {
               sGXsfl_92_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_92_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_921473( ) ;
               init_level_properties1473( ) ;
               standaloneNotModal13W1473( ) ;
               getByPrimaryKey13W1473( ) ;
               standaloneModal13W1473( ) ;
               addRow13W1473( ) ;
               scanNext13W1473( ) ;
            }
            scanEnd13W1473( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      if ( ! isDsp( ) && ! isDlt( ) )
      {
         sMode1473 = Gx_mode ;
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         sGXsfl_92_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_92_idx+1), 4, 0), (short)(4), "0") ;
         subsflControlProps_921473( ) ;
         initAll13W1473( ) ;
         init_level_properties1473( ) ;
         B9496MRStkRes = A9496MRStkRes ;
         n9496MRStkRes = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9496MRStkRes", GXutil.ltrimstr( A9496MRStkRes, 10, 3));
         B9501MRUltRes = A9501MRUltRes ;
         n9501MRUltRes = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9501MRUltRes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9501MRUltRes), 10, 0));
         B9495MRStkAct = A9495MRStkAct ;
         n9495MRStkAct = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9495MRStkAct", GXutil.ltrimstr( A9495MRStkAct, 10, 3));
         B9500MRUltMov = A9500MRUltMov ;
         n9500MRUltMov = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9500MRUltMov", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9500MRUltMov), 8, 0));
         nRcdExists_1473 = (short)(0) ;
         nIsMod_1473 = (short)(0) ;
         nRcdDeleted_1473 = (short)(0) ;
         nBlankRcdCount1473 = (short)(nBlankRcdUsr1473+nBlankRcdCount1473) ;
         fRowAdded = 0 ;
         while ( nBlankRcdCount1473 > 0 )
         {
            standaloneNotModal13W1473( ) ;
            standaloneModal13W1473( ) ;
            addRow13W1473( ) ;
            if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
            {
               fRowAdded = 1 ;
               GX_FocusControl = edtPrvNum_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            nBlankRcdCount1473 = (short)(nBlankRcdCount1473-1) ;
         }
         Gx_mode = sMode1473 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A9496MRStkRes = B9496MRStkRes ;
         n9496MRStkRes = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9496MRStkRes", GXutil.ltrimstr( A9496MRStkRes, 10, 3));
         A9501MRUltRes = B9501MRUltRes ;
         n9501MRUltRes = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9501MRUltRes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9501MRUltRes), 10, 0));
         A9495MRStkAct = B9495MRStkAct ;
         n9495MRStkAct = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9495MRStkAct", GXutil.ltrimstr( A9495MRStkAct, 10, 3));
         A9500MRUltMov = B9500MRUltMov ;
         n9500MRUltMov = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9500MRUltMov", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9500MRUltMov), 8, 0));
      }
      sStyleString = "" ;
      httpContext.writeText( "<div id=\""+"Gridlevel_prvContainer"+"Div\" "+sStyleString+">"+"</div>") ;
      httpContext.ajax_rsp_assign_grid("_"+"Gridlevel_prv", Gridlevel_prvContainer, subGridlevel_prv_Internalname);
      if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridlevel_prvContainerData", Gridlevel_prvContainer.ToJavascriptSource());
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridlevel_prvContainerData"+"V", Gridlevel_prvContainer.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Gridlevel_prvContainerData"+"V"+"\" value='"+Gridlevel_prvContainer.GridValuesHidden()+"'/>") ;
      }
   }

   public void gxdraw_gridlevel_level1( )
   {
      /*  Grid Control  */
      startgridcontrol106( ) ;
      nGXsfl_106_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1239 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1239 = (short)(1) ;
            scanStart13W1239( ) ;
            while ( RcdFound1239 != 0 )
            {
               init_level_properties1239( ) ;
               getByPrimaryKey13W1239( ) ;
               addRow13W1239( ) ;
               scanNext13W1239( ) ;
            }
            scanEnd13W1239( ) ;
            nBlankRcdCount1239 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B9496MRStkRes = A9496MRStkRes ;
         n9496MRStkRes = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9496MRStkRes", GXutil.ltrimstr( A9496MRStkRes, 10, 3));
         B9501MRUltRes = A9501MRUltRes ;
         n9501MRUltRes = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9501MRUltRes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9501MRUltRes), 10, 0));
         B9495MRStkAct = A9495MRStkAct ;
         n9495MRStkAct = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9495MRStkAct", GXutil.ltrimstr( A9495MRStkAct, 10, 3));
         B9500MRUltMov = A9500MRUltMov ;
         n9500MRUltMov = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9500MRUltMov", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9500MRUltMov), 8, 0));
         standaloneNotModal13W1239( ) ;
         standaloneModal13W1239( ) ;
         sMode1239 = Gx_mode ;
         while ( nGXsfl_106_idx < nRC_GXsfl_106 )
         {
            bGXsfl_106_Refreshing = true ;
            readRow13W1239( ) ;
            edtMRMov_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MRMOV_"+sGXsfl_106_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMRMov_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRMov_Enabled), 5, 0), !bGXsfl_106_Refreshing);
            edtMRMovOrd_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MRMOVORD_"+sGXsfl_106_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMRMovOrd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRMovOrd_Enabled), 5, 0), !bGXsfl_106_Refreshing);
            edtMRMovFch_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MRMOVFCH_"+sGXsfl_106_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMRMovFch_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRMovFch_Enabled), 5, 0), !bGXsfl_106_Refreshing);
            dynMRMovTpo.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "MRMOVTPO_"+sGXsfl_106_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
            httpContext.ajax_rsp_assign_prop("", false, dynMRMovTpo.getInternalname(), "Enabled", GXutil.ltrimstr( dynMRMovTpo.getEnabled(), 5, 0), !bGXsfl_106_Refreshing);
            edtMRMovTpoD_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MRMOVTPOD_"+sGXsfl_106_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMRMovTpoD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRMovTpoD_Enabled), 5, 0), !bGXsfl_106_Refreshing);
            edtMRMovDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MRMOVDSC_"+sGXsfl_106_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMRMovDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRMovDsc_Enabled), 5, 0), !bGXsfl_106_Refreshing);
            edtMRMovCnt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MRMOVCNT_"+sGXsfl_106_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMRMovCnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRMovCnt_Enabled), 5, 0), !bGXsfl_106_Refreshing);
            edtMRMovPre_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MRMOVPRE_"+sGXsfl_106_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMRMovPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRMovPre_Enabled), 5, 0), !bGXsfl_106_Refreshing);
            if ( ( nRcdExists_1239 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal13W1239( ) ;
            }
            sendRow13W1239( ) ;
            bGXsfl_106_Refreshing = false ;
         }
         Gx_mode = sMode1239 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A9496MRStkRes = B9496MRStkRes ;
         n9496MRStkRes = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9496MRStkRes", GXutil.ltrimstr( A9496MRStkRes, 10, 3));
         A9501MRUltRes = B9501MRUltRes ;
         n9501MRUltRes = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9501MRUltRes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9501MRUltRes), 10, 0));
         A9495MRStkAct = B9495MRStkAct ;
         n9495MRStkAct = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9495MRStkAct", GXutil.ltrimstr( A9495MRStkAct, 10, 3));
         A9500MRUltMov = B9500MRUltMov ;
         n9500MRUltMov = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9500MRUltMov", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9500MRUltMov), 8, 0));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1239 = (short)(5) ;
         nRcdExists_1239 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart13W1239( ) ;
            while ( RcdFound1239 != 0 )
            {
               sGXsfl_106_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_106_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_1061239( ) ;
               init_level_properties1239( ) ;
               standaloneNotModal13W1239( ) ;
               getByPrimaryKey13W1239( ) ;
               standaloneModal13W1239( ) ;
               addRow13W1239( ) ;
               scanNext13W1239( ) ;
            }
            scanEnd13W1239( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      if ( ! isDsp( ) && ! isDlt( ) )
      {
         sMode1239 = Gx_mode ;
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         sGXsfl_106_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_106_idx+1), 4, 0), (short)(4), "0") ;
         subsflControlProps_1061239( ) ;
         initAll13W1239( ) ;
         init_level_properties1239( ) ;
         B9496MRStkRes = A9496MRStkRes ;
         n9496MRStkRes = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9496MRStkRes", GXutil.ltrimstr( A9496MRStkRes, 10, 3));
         B9501MRUltRes = A9501MRUltRes ;
         n9501MRUltRes = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9501MRUltRes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9501MRUltRes), 10, 0));
         B9495MRStkAct = A9495MRStkAct ;
         n9495MRStkAct = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9495MRStkAct", GXutil.ltrimstr( A9495MRStkAct, 10, 3));
         B9500MRUltMov = A9500MRUltMov ;
         n9500MRUltMov = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9500MRUltMov", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9500MRUltMov), 8, 0));
         nRcdExists_1239 = (short)(0) ;
         nIsMod_1239 = (short)(0) ;
         nRcdDeleted_1239 = (short)(0) ;
         nBlankRcdCount1239 = (short)(nBlankRcdUsr1239+nBlankRcdCount1239) ;
         fRowAdded = 0 ;
         while ( nBlankRcdCount1239 > 0 )
         {
            standaloneNotModal13W1239( ) ;
            standaloneModal13W1239( ) ;
            addRow13W1239( ) ;
            if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
            {
               fRowAdded = 1 ;
               GX_FocusControl = edtMRMovOrd_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            nBlankRcdCount1239 = (short)(nBlankRcdCount1239-1) ;
         }
         Gx_mode = sMode1239 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A9496MRStkRes = B9496MRStkRes ;
         n9496MRStkRes = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9496MRStkRes", GXutil.ltrimstr( A9496MRStkRes, 10, 3));
         A9501MRUltRes = B9501MRUltRes ;
         n9501MRUltRes = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9501MRUltRes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9501MRUltRes), 10, 0));
         A9495MRStkAct = B9495MRStkAct ;
         n9495MRStkAct = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9495MRStkAct", GXutil.ltrimstr( A9495MRStkAct, 10, 3));
         A9500MRUltMov = B9500MRUltMov ;
         n9500MRUltMov = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9500MRUltMov", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9500MRUltMov), 8, 0));
      }
      sStyleString = "" ;
      httpContext.writeText( "<div id=\""+"Gridlevel_level1Container"+"Div\" "+sStyleString+">"+"</div>") ;
      httpContext.ajax_rsp_assign_grid("_"+"Gridlevel_level1", Gridlevel_level1Container, subGridlevel_level1_Internalname);
      if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridlevel_level1ContainerData", Gridlevel_level1Container.ToJavascriptSource());
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridlevel_level1ContainerData"+"V", Gridlevel_level1Container.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Gridlevel_level1ContainerData"+"V"+"\" value='"+Gridlevel_level1Container.GridValuesHidden()+"'/>") ;
      }
   }

   public void gxdraw_gridlevel_level2( )
   {
      /*  Grid Control  */
      startgridcontrol125( ) ;
      nGXsfl_125_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1240 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1240 = (short)(1) ;
            scanStart13W1240( ) ;
            while ( RcdFound1240 != 0 )
            {
               init_level_properties1240( ) ;
               getByPrimaryKey13W1240( ) ;
               addRow13W1240( ) ;
               scanNext13W1240( ) ;
            }
            scanEnd13W1240( ) ;
            nBlankRcdCount1240 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B9496MRStkRes = A9496MRStkRes ;
         n9496MRStkRes = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9496MRStkRes", GXutil.ltrimstr( A9496MRStkRes, 10, 3));
         B9501MRUltRes = A9501MRUltRes ;
         n9501MRUltRes = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9501MRUltRes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9501MRUltRes), 10, 0));
         B9495MRStkAct = A9495MRStkAct ;
         n9495MRStkAct = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9495MRStkAct", GXutil.ltrimstr( A9495MRStkAct, 10, 3));
         B9500MRUltMov = A9500MRUltMov ;
         n9500MRUltMov = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9500MRUltMov", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9500MRUltMov), 8, 0));
         standaloneNotModal13W1240( ) ;
         standaloneModal13W1240( ) ;
         sMode1240 = Gx_mode ;
         while ( nGXsfl_125_idx < nRC_GXsfl_125 )
         {
            bGXsfl_125_Refreshing = true ;
            readRow13W1240( ) ;
            edtMRRes_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MRRES_"+sGXsfl_125_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMRRes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRRes_Enabled), 5, 0), !bGXsfl_125_Refreshing);
            edtMRResOrd_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MRRESORD_"+sGXsfl_125_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMRResOrd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRResOrd_Enabled), 5, 0), !bGXsfl_125_Refreshing);
            edtMRResFch_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MRRESFCH_"+sGXsfl_125_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMRResFch_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRResFch_Enabled), 5, 0), !bGXsfl_125_Refreshing);
            dynMRResTpo.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "MRRESTPO_"+sGXsfl_125_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
            httpContext.ajax_rsp_assign_prop("", false, dynMRResTpo.getInternalname(), "Enabled", GXutil.ltrimstr( dynMRResTpo.getEnabled(), 5, 0), !bGXsfl_125_Refreshing);
            edtMRResTpoD_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MRRESTPOD_"+sGXsfl_125_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMRResTpoD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRResTpoD_Enabled), 5, 0), !bGXsfl_125_Refreshing);
            edtMRResDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MRRESDSC_"+sGXsfl_125_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMRResDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRResDsc_Enabled), 5, 0), !bGXsfl_125_Refreshing);
            edtMRResCnt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MRRESCNT_"+sGXsfl_125_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMRResCnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRResCnt_Enabled), 5, 0), !bGXsfl_125_Refreshing);
            if ( ( nRcdExists_1240 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal13W1240( ) ;
            }
            sendRow13W1240( ) ;
            bGXsfl_125_Refreshing = false ;
         }
         Gx_mode = sMode1240 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A9496MRStkRes = B9496MRStkRes ;
         n9496MRStkRes = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9496MRStkRes", GXutil.ltrimstr( A9496MRStkRes, 10, 3));
         A9501MRUltRes = B9501MRUltRes ;
         n9501MRUltRes = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9501MRUltRes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9501MRUltRes), 10, 0));
         A9495MRStkAct = B9495MRStkAct ;
         n9495MRStkAct = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9495MRStkAct", GXutil.ltrimstr( A9495MRStkAct, 10, 3));
         A9500MRUltMov = B9500MRUltMov ;
         n9500MRUltMov = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9500MRUltMov", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9500MRUltMov), 8, 0));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1240 = (short)(5) ;
         nRcdExists_1240 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart13W1240( ) ;
            while ( RcdFound1240 != 0 )
            {
               sGXsfl_125_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_125_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_1251240( ) ;
               init_level_properties1240( ) ;
               standaloneNotModal13W1240( ) ;
               getByPrimaryKey13W1240( ) ;
               standaloneModal13W1240( ) ;
               addRow13W1240( ) ;
               scanNext13W1240( ) ;
            }
            scanEnd13W1240( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      if ( ! isDsp( ) && ! isDlt( ) )
      {
         sMode1240 = Gx_mode ;
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         sGXsfl_125_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_125_idx+1), 4, 0), (short)(4), "0") ;
         subsflControlProps_1251240( ) ;
         initAll13W1240( ) ;
         init_level_properties1240( ) ;
         B9496MRStkRes = A9496MRStkRes ;
         n9496MRStkRes = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9496MRStkRes", GXutil.ltrimstr( A9496MRStkRes, 10, 3));
         B9501MRUltRes = A9501MRUltRes ;
         n9501MRUltRes = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9501MRUltRes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9501MRUltRes), 10, 0));
         B9495MRStkAct = A9495MRStkAct ;
         n9495MRStkAct = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9495MRStkAct", GXutil.ltrimstr( A9495MRStkAct, 10, 3));
         B9500MRUltMov = A9500MRUltMov ;
         n9500MRUltMov = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9500MRUltMov", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9500MRUltMov), 8, 0));
         nRcdExists_1240 = (short)(0) ;
         nIsMod_1240 = (short)(0) ;
         nRcdDeleted_1240 = (short)(0) ;
         nBlankRcdCount1240 = (short)(nBlankRcdUsr1240+nBlankRcdCount1240) ;
         fRowAdded = 0 ;
         while ( nBlankRcdCount1240 > 0 )
         {
            standaloneNotModal13W1240( ) ;
            standaloneModal13W1240( ) ;
            addRow13W1240( ) ;
            if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
            {
               fRowAdded = 1 ;
               GX_FocusControl = edtMRResOrd_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            nBlankRcdCount1240 = (short)(nBlankRcdCount1240-1) ;
         }
         Gx_mode = sMode1240 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A9496MRStkRes = B9496MRStkRes ;
         n9496MRStkRes = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9496MRStkRes", GXutil.ltrimstr( A9496MRStkRes, 10, 3));
         A9501MRUltRes = B9501MRUltRes ;
         n9501MRUltRes = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9501MRUltRes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9501MRUltRes), 10, 0));
         A9495MRStkAct = B9495MRStkAct ;
         n9495MRStkAct = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9495MRStkAct", GXutil.ltrimstr( A9495MRStkAct, 10, 3));
         A9500MRUltMov = B9500MRUltMov ;
         n9500MRUltMov = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9500MRUltMov", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9500MRUltMov), 8, 0));
      }
      sStyleString = "" ;
      httpContext.writeText( "<div id=\""+"Gridlevel_level2Container"+"Div\" "+sStyleString+">"+"</div>") ;
      httpContext.ajax_rsp_assign_grid("_"+"Gridlevel_level2", Gridlevel_level2Container, subGridlevel_level2_Internalname);
      if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridlevel_level2ContainerData", Gridlevel_level2Container.ToJavascriptSource());
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridlevel_level2ContainerData"+"V", Gridlevel_level2Container.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Gridlevel_level2ContainerData"+"V"+"\" value='"+Gridlevel_level2Container.GridValuesHidden()+"'/>") ;
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
      e1113W2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV32DDO_TitleSettingsIcons);
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vPRVNUM_DATA"), AV30PrvNum_Data);
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z9492MRCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z9492MRCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z9493MRNom = httpContext.cgiGet( "Z9493MRNom") ;
            Z9494MRCodExt = httpContext.cgiGet( "Z9494MRCodExt") ;
            Z11458MRCodPrv = httpContext.cgiGet( "Z11458MRCodPrv") ;
            Z9495MRStkAct = localUtil.ctond( httpContext.cgiGet( "Z9495MRStkAct")) ;
            Z9496MRStkRes = localUtil.ctond( httpContext.cgiGet( "Z9496MRStkRes")) ;
            Z9497MRStkMin = localUtil.ctond( httpContext.cgiGet( "Z9497MRStkMin")) ;
            Z9498MRStkCri = localUtil.ctond( httpContext.cgiGet( "Z9498MRStkCri")) ;
            Z9499MRStkPre = localUtil.ctond( httpContext.cgiGet( "Z9499MRStkPre")) ;
            Z9500MRUltMov = (int)(localUtil.ctol( httpContext.cgiGet( "Z9500MRUltMov"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z9501MRUltRes = localUtil.ctol( httpContext.cgiGet( "Z9501MRUltRes"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            Z12850MRActivo = httpContext.cgiGet( "Z12850MRActivo") ;
            Z14491MRLote = httpContext.cgiGet( "Z14491MRLote") ;
            O9496MRStkRes = localUtil.ctond( httpContext.cgiGet( "O9496MRStkRes")) ;
            O9501MRUltRes = localUtil.ctol( httpContext.cgiGet( "O9501MRUltRes"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            O9495MRStkAct = localUtil.ctond( httpContext.cgiGet( "O9495MRStkAct")) ;
            O9500MRUltMov = (int)(localUtil.ctol( httpContext.cgiGet( "O9500MRUltMov"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_92 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_92"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            nRC_GXsfl_106 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_106"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            nRC_GXsfl_125 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_125"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            N9492MRCod = (int)(localUtil.ctol( httpContext.cgiGet( "N9492MRCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A13718MRCNom = httpContext.cgiGet( "MRCNOM") ;
            AV20EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            AV13MRCod = (int)(localUtil.ctol( httpContext.cgiGet( "vMRCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV16Artextil = (byte)(localUtil.ctol( httpContext.cgiGet( "vARTEXTIL"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV17NumManual = (byte)(localUtil.ctol( httpContext.cgiGet( "vNUMMANUAL"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gxuitabspanel_tabs_Objectcall = httpContext.cgiGet( "GXUITABSPANEL_TABS_Objectcall") ;
            Gxuitabspanel_tabs_Enabled = GXutil.strtobool( httpContext.cgiGet( "GXUITABSPANEL_TABS_Enabled")) ;
            Gxuitabspanel_tabs_Activepage = (int)(localUtil.ctol( httpContext.cgiGet( "GXUITABSPANEL_TABS_Activepage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gxuitabspanel_tabs_Activepagecontrolname = httpContext.cgiGet( "GXUITABSPANEL_TABS_Activepagecontrolname") ;
            Gxuitabspanel_tabs_Pagecount = (int)(localUtil.ctol( httpContext.cgiGet( "GXUITABSPANEL_TABS_Pagecount"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gxuitabspanel_tabs_Class = httpContext.cgiGet( "GXUITABSPANEL_TABS_Class") ;
            Gxuitabspanel_tabs_Historymanagement = GXutil.strtobool( httpContext.cgiGet( "GXUITABSPANEL_TABS_Historymanagement")) ;
            Gxuitabspanel_tabs_Visible = GXutil.strtobool( httpContext.cgiGet( "GXUITABSPANEL_TABS_Visible")) ;
            Dvpanel_opciones_Objectcall = httpContext.cgiGet( "DVPANEL_OPCIONES_Objectcall") ;
            Dvpanel_opciones_Class = httpContext.cgiGet( "DVPANEL_OPCIONES_Class") ;
            Dvpanel_opciones_Enabled = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_OPCIONES_Enabled")) ;
            Dvpanel_opciones_Width = httpContext.cgiGet( "DVPANEL_OPCIONES_Width") ;
            Dvpanel_opciones_Height = httpContext.cgiGet( "DVPANEL_OPCIONES_Height") ;
            Dvpanel_opciones_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_OPCIONES_Autowidth")) ;
            Dvpanel_opciones_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_OPCIONES_Autoheight")) ;
            Dvpanel_opciones_Cls = httpContext.cgiGet( "DVPANEL_OPCIONES_Cls") ;
            Dvpanel_opciones_Showheader = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_OPCIONES_Showheader")) ;
            Dvpanel_opciones_Title = httpContext.cgiGet( "DVPANEL_OPCIONES_Title") ;
            Dvpanel_opciones_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_OPCIONES_Collapsible")) ;
            Dvpanel_opciones_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_OPCIONES_Collapsed")) ;
            Dvpanel_opciones_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_OPCIONES_Showcollapseicon")) ;
            Dvpanel_opciones_Iconposition = httpContext.cgiGet( "DVPANEL_OPCIONES_Iconposition") ;
            Dvpanel_opciones_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_OPCIONES_Autoscroll")) ;
            Dvpanel_opciones_Visible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_OPCIONES_Visible")) ;
            Combo_prvnum_Objectcall = httpContext.cgiGet( "COMBO_PRVNUM_Objectcall") ;
            Combo_prvnum_Class = httpContext.cgiGet( "COMBO_PRVNUM_Class") ;
            Combo_prvnum_Icontype = httpContext.cgiGet( "COMBO_PRVNUM_Icontype") ;
            Combo_prvnum_Icon = httpContext.cgiGet( "COMBO_PRVNUM_Icon") ;
            Combo_prvnum_Caption = httpContext.cgiGet( "COMBO_PRVNUM_Caption") ;
            Combo_prvnum_Tooltip = httpContext.cgiGet( "COMBO_PRVNUM_Tooltip") ;
            Combo_prvnum_Cls = httpContext.cgiGet( "COMBO_PRVNUM_Cls") ;
            Combo_prvnum_Selectedvalue_set = httpContext.cgiGet( "COMBO_PRVNUM_Selectedvalue_set") ;
            Combo_prvnum_Selectedvalue_get = httpContext.cgiGet( "COMBO_PRVNUM_Selectedvalue_get") ;
            Combo_prvnum_Selectedtext_set = httpContext.cgiGet( "COMBO_PRVNUM_Selectedtext_set") ;
            Combo_prvnum_Selectedtext_get = httpContext.cgiGet( "COMBO_PRVNUM_Selectedtext_get") ;
            Combo_prvnum_Gamoauthtoken = httpContext.cgiGet( "COMBO_PRVNUM_Gamoauthtoken") ;
            Combo_prvnum_Ddointernalname = httpContext.cgiGet( "COMBO_PRVNUM_Ddointernalname") ;
            Combo_prvnum_Titlecontrolalign = httpContext.cgiGet( "COMBO_PRVNUM_Titlecontrolalign") ;
            Combo_prvnum_Dropdownoptionstype = httpContext.cgiGet( "COMBO_PRVNUM_Dropdownoptionstype") ;
            Combo_prvnum_Enabled = GXutil.strtobool( httpContext.cgiGet( "COMBO_PRVNUM_Enabled")) ;
            Combo_prvnum_Visible = GXutil.strtobool( httpContext.cgiGet( "COMBO_PRVNUM_Visible")) ;
            Combo_prvnum_Titlecontrolidtoreplace = httpContext.cgiGet( "COMBO_PRVNUM_Titlecontrolidtoreplace") ;
            Combo_prvnum_Datalisttype = httpContext.cgiGet( "COMBO_PRVNUM_Datalisttype") ;
            Combo_prvnum_Allowmultipleselection = GXutil.strtobool( httpContext.cgiGet( "COMBO_PRVNUM_Allowmultipleselection")) ;
            Combo_prvnum_Datalistfixedvalues = httpContext.cgiGet( "COMBO_PRVNUM_Datalistfixedvalues") ;
            Combo_prvnum_Isgriditem = GXutil.strtobool( httpContext.cgiGet( "COMBO_PRVNUM_Isgriditem")) ;
            Combo_prvnum_Hasdescription = GXutil.strtobool( httpContext.cgiGet( "COMBO_PRVNUM_Hasdescription")) ;
            Combo_prvnum_Datalistproc = httpContext.cgiGet( "COMBO_PRVNUM_Datalistproc") ;
            Combo_prvnum_Datalistprocparametersprefix = httpContext.cgiGet( "COMBO_PRVNUM_Datalistprocparametersprefix") ;
            Combo_prvnum_Remoteservicesparameters = httpContext.cgiGet( "COMBO_PRVNUM_Remoteservicesparameters") ;
            Combo_prvnum_Datalistupdateminimumcharacters = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_PRVNUM_Datalistupdateminimumcharacters"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_prvnum_Includeonlyselectedoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_PRVNUM_Includeonlyselectedoption")) ;
            Combo_prvnum_Includeselectalloption = GXutil.strtobool( httpContext.cgiGet( "COMBO_PRVNUM_Includeselectalloption")) ;
            Combo_prvnum_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_PRVNUM_Emptyitem")) ;
            Combo_prvnum_Includeaddnewoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_PRVNUM_Includeaddnewoption")) ;
            Combo_prvnum_Htmltemplate = httpContext.cgiGet( "COMBO_PRVNUM_Htmltemplate") ;
            Combo_prvnum_Multiplevaluestype = httpContext.cgiGet( "COMBO_PRVNUM_Multiplevaluestype") ;
            Combo_prvnum_Loadingdata = httpContext.cgiGet( "COMBO_PRVNUM_Loadingdata") ;
            Combo_prvnum_Noresultsfound = httpContext.cgiGet( "COMBO_PRVNUM_Noresultsfound") ;
            Combo_prvnum_Emptyitemtext = httpContext.cgiGet( "COMBO_PRVNUM_Emptyitemtext") ;
            Combo_prvnum_Onlyselectedvalues = httpContext.cgiGet( "COMBO_PRVNUM_Onlyselectedvalues") ;
            Combo_prvnum_Selectalltext = httpContext.cgiGet( "COMBO_PRVNUM_Selectalltext") ;
            Combo_prvnum_Multiplevaluesseparator = httpContext.cgiGet( "COMBO_PRVNUM_Multiplevaluesseparator") ;
            Combo_prvnum_Addnewoptiontext = httpContext.cgiGet( "COMBO_PRVNUM_Addnewoptiontext") ;
            /* Read variables values. */
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMRCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMRCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtMRCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A9492MRCod = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A9492MRCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9492MRCod), 8, 0));
            }
            else
            {
               A9492MRCod = (int)(localUtil.ctol( httpContext.cgiGet( edtMRCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A9492MRCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9492MRCod), 8, 0));
            }
            A9493MRNom = httpContext.cgiGet( edtMRNom_Internalname) ;
            n9493MRNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9493MRNom", A9493MRNom);
            A12850MRActivo = ((GXutil.strcmp(httpContext.cgiGet( chkMRActivo.getInternalname()), "S")==0) ? "S" : "N") ;
            n12850MRActivo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12850MRActivo", A12850MRActivo);
            A9494MRCodExt = httpContext.cgiGet( edtMRCodExt_Internalname) ;
            n9494MRCodExt = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9494MRCodExt", A9494MRCodExt);
            A11458MRCodPrv = httpContext.cgiGet( edtMRCodPrv_Internalname) ;
            n11458MRCodPrv = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11458MRCodPrv", A11458MRCodPrv);
            A14491MRLote = httpContext.cgiGet( edtMRLote_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14491MRLote", A14491MRLote);
            if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMRStkPre_Internalname)), DecimalUtil.stringToDec("-9999999.999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMRStkPre_Internalname)), DecimalUtil.stringToDec("99999999.999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MRSTKPRE");
               AnyError = (short)(1) ;
               GX_FocusControl = edtMRStkPre_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A9499MRStkPre = DecimalUtil.ZERO ;
               n9499MRStkPre = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9499MRStkPre", GXutil.ltrimstr( A9499MRStkPre, 12, 3));
            }
            else
            {
               A9499MRStkPre = localUtil.ctond( httpContext.cgiGet( edtMRStkPre_Internalname)) ;
               n9499MRStkPre = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9499MRStkPre", GXutil.ltrimstr( A9499MRStkPre, 12, 3));
            }
            if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMRStkMin_Internalname)), DecimalUtil.stringToDec("-9999999.999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMRStkMin_Internalname)), DecimalUtil.stringToDec("99999999.999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MRSTKMIN");
               AnyError = (short)(1) ;
               GX_FocusControl = edtMRStkMin_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A9497MRStkMin = DecimalUtil.ZERO ;
               n9497MRStkMin = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9497MRStkMin", GXutil.ltrimstr( A9497MRStkMin, 12, 3));
            }
            else
            {
               A9497MRStkMin = localUtil.ctond( httpContext.cgiGet( edtMRStkMin_Internalname)) ;
               n9497MRStkMin = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9497MRStkMin", GXutil.ltrimstr( A9497MRStkMin, 12, 3));
            }
            if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMRStkCri_Internalname)), DecimalUtil.stringToDec("-9999999.999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMRStkCri_Internalname)), DecimalUtil.stringToDec("99999999.999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MRSTKCRI");
               AnyError = (short)(1) ;
               GX_FocusControl = edtMRStkCri_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A9498MRStkCri = DecimalUtil.ZERO ;
               n9498MRStkCri = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9498MRStkCri", GXutil.ltrimstr( A9498MRStkCri, 12, 3));
            }
            else
            {
               A9498MRStkCri = localUtil.ctond( httpContext.cgiGet( edtMRStkCri_Internalname)) ;
               n9498MRStkCri = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9498MRStkCri", GXutil.ltrimstr( A9498MRStkCri, 12, 3));
            }
            A9495MRStkAct = localUtil.ctond( httpContext.cgiGet( edtMRStkAct_Internalname)) ;
            n9495MRStkAct = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9495MRStkAct", GXutil.ltrimstr( A9495MRStkAct, 10, 3));
            A9496MRStkRes = localUtil.ctond( httpContext.cgiGet( edtMRStkRes_Internalname)) ;
            n9496MRStkRes = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9496MRStkRes", GXutil.ltrimstr( A9496MRStkRes, 10, 3));
            AV34Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34Pgmname", AV34Pgmname);
            A9500MRUltMov = (int)(localUtil.ctol( httpContext.cgiGet( edtMRUltMov_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n9500MRUltMov = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9500MRUltMov", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9500MRUltMov), 8, 0));
            A9501MRUltRes = localUtil.ctol( httpContext.cgiGet( edtMRUltRes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            n9501MRUltRes = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9501MRUltRes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9501MRUltRes), 10, 0));
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"TMRepue");
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            AV34Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34Pgmname", AV34Pgmname);
            forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV34Pgmname, "")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A9492MRCod != Z9492MRCod ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("mantenimientomaquina\\tmrepue:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
               GxWebError = (byte)(1) ;
               httpContext.sendError( 403 );
               GXutil.writeLog("send_http_error_code 403");
               AnyError = (short)(1) ;
               return  ;
            }
            /* Check if conditions changed and reset current page numbers */
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
               A9492MRCod = (int)(GXutil.lval( httpContext.GetPar( "MRCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A9492MRCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9492MRCod), 8, 0));
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
                  sMode1238 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  Gx_mode = sMode1238 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound1238 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_13W0( ) ;
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
                     if ( GXutil.strcmp(sEvt, "START") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: Start */
                        e1113W2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e1213W2 ();
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
         e1213W2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll13W1238( ) ;
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
         disableAttributes13W1238( ) ;
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

   public void confirm_13W0( )
   {
      beforeValidate13W1238( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls13W1238( ) ;
         }
         else
         {
            checkExtendedTable13W1238( ) ;
            closeExtendedTableCursors13W1238( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode1238 = Gx_mode ;
         confirm_13W1473( ) ;
         if ( AnyError == 0 )
         {
            confirm_13W1239( ) ;
            if ( AnyError == 0 )
            {
               confirm_13W1240( ) ;
               if ( AnyError == 0 )
               {
                  /* Restore parent mode. */
                  Gx_mode = sMode1238 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  IsConfirmed = (short)(1) ;
                  httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
               }
            }
         }
         /* Restore parent mode. */
         Gx_mode = sMode1238 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
   }

   public void confirm_13W1240( )
   {
      s9496MRStkRes = O9496MRStkRes ;
      n9496MRStkRes = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9496MRStkRes", GXutil.ltrimstr( A9496MRStkRes, 10, 3));
      s9501MRUltRes = O9501MRUltRes ;
      n9501MRUltRes = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9501MRUltRes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9501MRUltRes), 10, 0));
      nGXsfl_125_idx = 0 ;
      while ( nGXsfl_125_idx < nRC_GXsfl_125 )
      {
         readRow13W1240( ) ;
         if ( ( nRcdExists_1240 != 0 ) || ( nIsMod_1240 != 0 ) )
         {
            getKey13W1240( ) ;
            if ( ( nRcdExists_1240 == 0 ) && ( nRcdDeleted_1240 == 0 ) )
            {
               if ( RcdFound1240 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate13W1240( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable13W1240( ) ;
                     closeExtendedTableCursors13W1240( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O9496MRStkRes = A9496MRStkRes ;
                     n9496MRStkRes = false ;
                     httpContext.ajax_rsp_assign_attri("", false, "A9496MRStkRes", GXutil.ltrimstr( A9496MRStkRes, 10, 3));
                     O9501MRUltRes = A9501MRUltRes ;
                     n9501MRUltRes = false ;
                     httpContext.ajax_rsp_assign_attri("", false, "A9501MRUltRes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9501MRUltRes), 10, 0));
                  }
               }
               else
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "MRCOD");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtMRCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1240 != 0 )
               {
                  if ( nRcdDeleted_1240 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey13W1240( ) ;
                     load13W1240( ) ;
                     beforeValidate13W1240( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls13W1240( ) ;
                        O9496MRStkRes = A9496MRStkRes ;
                        n9496MRStkRes = false ;
                        httpContext.ajax_rsp_assign_attri("", false, "A9496MRStkRes", GXutil.ltrimstr( A9496MRStkRes, 10, 3));
                        O9501MRUltRes = A9501MRUltRes ;
                        n9501MRUltRes = false ;
                        httpContext.ajax_rsp_assign_attri("", false, "A9501MRUltRes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9501MRUltRes), 10, 0));
                     }
                  }
                  else
                  {
                     if ( nIsMod_1240 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate13W1240( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable13W1240( ) ;
                           closeExtendedTableCursors13W1240( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O9496MRStkRes = A9496MRStkRes ;
                           n9496MRStkRes = false ;
                           httpContext.ajax_rsp_assign_attri("", false, "A9496MRStkRes", GXutil.ltrimstr( A9496MRStkRes, 10, 3));
                           O9501MRUltRes = A9501MRUltRes ;
                           n9501MRUltRes = false ;
                           httpContext.ajax_rsp_assign_attri("", false, "A9501MRUltRes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9501MRUltRes), 10, 0));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1240 == 0 )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "MRCOD");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtMRCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtMRRes_Internalname, GXutil.ltrim( localUtil.ntoc( A9510MRRes, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMRResOrd_Internalname, GXutil.ltrim( localUtil.ntoc( A9511MRResOrd, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMRResFch_Internalname, localUtil.ttoc( A9512MRResFch, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( dynMRResTpo.getInternalname(), GXutil.ltrim( localUtil.ntoc( A9513MRResTpo, (byte)(8), (byte)(0), ".", ""))) ;
         httpContext.changePostValue( edtMRResTpoD_Internalname, GXutil.rtrim( A9514MRResTpoD)) ;
         httpContext.changePostValue( edtMRResDsc_Internalname, GXutil.rtrim( A9515MRResDsc)) ;
         httpContext.changePostValue( edtMRResCnt_Internalname, GXutil.ltrim( localUtil.ntoc( A9516MRResCnt, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9510MRRes_"+sGXsfl_125_idx, GXutil.ltrim( localUtil.ntoc( Z9510MRRes, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9515MRResDsc_"+sGXsfl_125_idx, GXutil.rtrim( Z9515MRResDsc)) ;
         httpContext.changePostValue( "ZT_"+"Z9511MRResOrd_"+sGXsfl_125_idx, GXutil.ltrim( localUtil.ntoc( Z9511MRResOrd, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9512MRResFch_"+sGXsfl_125_idx, localUtil.ttoc( Z9512MRResFch, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z9516MRResCnt_"+sGXsfl_125_idx, GXutil.ltrim( localUtil.ntoc( Z9516MRResCnt, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9513MRResTpo_"+sGXsfl_125_idx, GXutil.ltrim( localUtil.ntoc( Z9513MRResTpo, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T9516MRResCnt_"+sGXsfl_125_idx, GXutil.ltrim( localUtil.ntoc( O9516MRResCnt, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1240_"+sGXsfl_125_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1240, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1240_"+sGXsfl_125_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1240, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1240_"+sGXsfl_125_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1240, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1240 != 0 )
         {
            httpContext.changePostValue( "MRRES_"+sGXsfl_125_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMRRes_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MRRESORD_"+sGXsfl_125_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMRResOrd_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MRRESFCH_"+sGXsfl_125_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMRResFch_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MRRESTPO_"+sGXsfl_125_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( dynMRResTpo.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MRRESTPOD_"+sGXsfl_125_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMRResTpoD_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MRRESDSC_"+sGXsfl_125_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMRResDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MRRESCNT_"+sGXsfl_125_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMRResCnt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O9496MRStkRes = s9496MRStkRes ;
      n9496MRStkRes = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9496MRStkRes", GXutil.ltrimstr( A9496MRStkRes, 10, 3));
      O9501MRUltRes = s9501MRUltRes ;
      n9501MRUltRes = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9501MRUltRes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9501MRUltRes), 10, 0));
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void confirm_13W1239( )
   {
      s9495MRStkAct = O9495MRStkAct ;
      n9495MRStkAct = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9495MRStkAct", GXutil.ltrimstr( A9495MRStkAct, 10, 3));
      s9500MRUltMov = O9500MRUltMov ;
      n9500MRUltMov = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9500MRUltMov", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9500MRUltMov), 8, 0));
      nGXsfl_106_idx = 0 ;
      while ( nGXsfl_106_idx < nRC_GXsfl_106 )
      {
         readRow13W1239( ) ;
         if ( ( nRcdExists_1239 != 0 ) || ( nIsMod_1239 != 0 ) )
         {
            getKey13W1239( ) ;
            if ( ( nRcdExists_1239 == 0 ) && ( nRcdDeleted_1239 == 0 ) )
            {
               if ( RcdFound1239 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate13W1239( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable13W1239( ) ;
                     closeExtendedTableCursors13W1239( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O9495MRStkAct = A9495MRStkAct ;
                     n9495MRStkAct = false ;
                     httpContext.ajax_rsp_assign_attri("", false, "A9495MRStkAct", GXutil.ltrimstr( A9495MRStkAct, 10, 3));
                     O9500MRUltMov = A9500MRUltMov ;
                     n9500MRUltMov = false ;
                     httpContext.ajax_rsp_assign_attri("", false, "A9500MRUltMov", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9500MRUltMov), 8, 0));
                  }
               }
               else
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "MRCOD");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtMRCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1239 != 0 )
               {
                  if ( nRcdDeleted_1239 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey13W1239( ) ;
                     load13W1239( ) ;
                     beforeValidate13W1239( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls13W1239( ) ;
                        O9495MRStkAct = A9495MRStkAct ;
                        n9495MRStkAct = false ;
                        httpContext.ajax_rsp_assign_attri("", false, "A9495MRStkAct", GXutil.ltrimstr( A9495MRStkAct, 10, 3));
                        O9500MRUltMov = A9500MRUltMov ;
                        n9500MRUltMov = false ;
                        httpContext.ajax_rsp_assign_attri("", false, "A9500MRUltMov", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9500MRUltMov), 8, 0));
                     }
                  }
                  else
                  {
                     if ( nIsMod_1239 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate13W1239( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable13W1239( ) ;
                           closeExtendedTableCursors13W1239( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O9495MRStkAct = A9495MRStkAct ;
                           n9495MRStkAct = false ;
                           httpContext.ajax_rsp_assign_attri("", false, "A9495MRStkAct", GXutil.ltrimstr( A9495MRStkAct, 10, 3));
                           O9500MRUltMov = A9500MRUltMov ;
                           n9500MRUltMov = false ;
                           httpContext.ajax_rsp_assign_attri("", false, "A9500MRUltMov", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9500MRUltMov), 8, 0));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1239 == 0 )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "MRCOD");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtMRCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtMRMov_Internalname, GXutil.ltrim( localUtil.ntoc( A9502MRMov, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMRMovOrd_Internalname, GXutil.ltrim( localUtil.ntoc( A9503MRMovOrd, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMRMovFch_Internalname, localUtil.ttoc( A9504MRMovFch, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( dynMRMovTpo.getInternalname(), GXutil.ltrim( localUtil.ntoc( A9505MRMovTpo, (byte)(8), (byte)(0), ".", ""))) ;
         httpContext.changePostValue( edtMRMovTpoD_Internalname, GXutil.rtrim( A9506MRMovTpoD)) ;
         httpContext.changePostValue( edtMRMovDsc_Internalname, GXutil.rtrim( A9507MRMovDsc)) ;
         httpContext.changePostValue( edtMRMovCnt_Internalname, GXutil.ltrim( localUtil.ntoc( A9508MRMovCnt, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMRMovPre_Internalname, GXutil.ltrim( localUtil.ntoc( A9509MRMovPre, (byte)(14), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9502MRMov_"+sGXsfl_106_idx, GXutil.ltrim( localUtil.ntoc( Z9502MRMov, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9509MRMovPre_"+sGXsfl_106_idx, GXutil.ltrim( localUtil.ntoc( Z9509MRMovPre, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9507MRMovDsc_"+sGXsfl_106_idx, GXutil.rtrim( Z9507MRMovDsc)) ;
         httpContext.changePostValue( "ZT_"+"Z9503MRMovOrd_"+sGXsfl_106_idx, GXutil.ltrim( localUtil.ntoc( Z9503MRMovOrd, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9504MRMovFch_"+sGXsfl_106_idx, localUtil.ttoc( Z9504MRMovFch, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z9508MRMovCnt_"+sGXsfl_106_idx, GXutil.ltrim( localUtil.ntoc( Z9508MRMovCnt, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9505MRMovTpo_"+sGXsfl_106_idx, GXutil.ltrim( localUtil.ntoc( Z9505MRMovTpo, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T9508MRMovCnt_"+sGXsfl_106_idx, GXutil.ltrim( localUtil.ntoc( O9508MRMovCnt, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1239_"+sGXsfl_106_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1239, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1239_"+sGXsfl_106_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1239, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1239_"+sGXsfl_106_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1239, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1239 != 0 )
         {
            httpContext.changePostValue( "MRMOV_"+sGXsfl_106_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMRMov_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MRMOVORD_"+sGXsfl_106_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMRMovOrd_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MRMOVFCH_"+sGXsfl_106_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMRMovFch_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MRMOVTPO_"+sGXsfl_106_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( dynMRMovTpo.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MRMOVTPOD_"+sGXsfl_106_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMRMovTpoD_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MRMOVDSC_"+sGXsfl_106_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMRMovDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MRMOVCNT_"+sGXsfl_106_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMRMovCnt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MRMOVPRE_"+sGXsfl_106_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMRMovPre_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O9495MRStkAct = s9495MRStkAct ;
      n9495MRStkAct = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9495MRStkAct", GXutil.ltrimstr( A9495MRStkAct, 10, 3));
      O9500MRUltMov = s9500MRUltMov ;
      n9500MRUltMov = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9500MRUltMov", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9500MRUltMov), 8, 0));
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void confirm_13W1473( )
   {
      nGXsfl_92_idx = 0 ;
      while ( nGXsfl_92_idx < nRC_GXsfl_92 )
      {
         readRow13W1473( ) ;
         if ( ( nRcdExists_1473 != 0 ) || ( nIsMod_1473 != 0 ) )
         {
            getKey13W1473( ) ;
            if ( ( nRcdExists_1473 == 0 ) && ( nRcdDeleted_1473 == 0 ) )
            {
               if ( RcdFound1473 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate13W1473( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable13W1473( ) ;
                     closeExtendedTableCursors13W1473( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "PRVNUM_" + sGXsfl_92_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtPrvNum_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1473 != 0 )
               {
                  if ( nRcdDeleted_1473 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey13W1473( ) ;
                     load13W1473( ) ;
                     beforeValidate13W1473( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls13W1473( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1473 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate13W1473( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable13W1473( ) ;
                           closeExtendedTableCursors13W1473( ) ;
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
                  if ( nRcdDeleted_1473 == 0 )
                  {
                     GXCCtl = "PRVNUM_" + sGXsfl_92_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtPrvNum_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtPrvNum_Internalname, GXutil.ltrim( localUtil.ntoc( A795PrvNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPrvNom_Internalname, GXutil.rtrim( A794PrvNom)) ;
         httpContext.changePostValue( chkMRPrvHab.getInternalname(), GXutil.ltrim( localUtil.ntoc( A11056MRPrvHab, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z795PrvNum_"+sGXsfl_92_idx, GXutil.ltrim( localUtil.ntoc( Z795PrvNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11056MRPrvHab_"+sGXsfl_92_idx, GXutil.ltrim( localUtil.ntoc( Z11056MRPrvHab, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1473_"+sGXsfl_92_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1473, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1473_"+sGXsfl_92_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1473, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1473_"+sGXsfl_92_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1473, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1473 != 0 )
         {
            httpContext.changePostValue( "PRVNUM_"+sGXsfl_92_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrvNum_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRVNUM_"+sGXsfl_92_idx+"Horizontalalignment", GXutil.rtrim( edtPrvNum_Horizontalalignment)) ;
            httpContext.changePostValue( "PRVNOM_"+sGXsfl_92_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrvNom_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MRPRVHAB_"+sGXsfl_92_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( chkMRPrvHab.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption13W0( )
   {
   }

   public void e1113W2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      tmrepue_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV34Pgmname, (byte)(99), GXv_char2) ;
      tmrepue_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      tmrepue_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      this.executeUsercontrolMethod("", false, "GXUITABSPANEL_TABSContainer", "HideTab", "", new Object[] {Integer.valueOf(3)});
      this.executeUsercontrolMethod("", false, "GXUITABSPANEL_TABSContainer", "HideTab", "", new Object[] {Integer.valueOf(4)});
      GXt_char1 = AV11Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      tmrepue_impl.this.GXt_char1 = GXv_char2[0] ;
      AV11Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11Station", AV11Station);
      GXv_char2[0] = AV27ObtenerEmprCod ;
      GXv_char3[0] = AV14EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV11Station, GXv_char2, GXv_char3, GXv_char4) ;
      tmrepue_impl.this.AV27ObtenerEmprCod = GXv_char2[0] ;
      tmrepue_impl.this.AV14EmprNom = GXv_char3[0] ;
      tmrepue_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27ObtenerEmprCod", AV27ObtenerEmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV14EmprNom", AV14EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
      GXt_int5 = AV17NumManual ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV20EmprCod, httpContext.getMessage( "REPMAN", ""), GXv_int6) ;
      tmrepue_impl.this.GXt_int5 = GXv_int6[0] ;
      AV17NumManual = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17NumManual", GXutil.str( AV17NumManual, 1, 0));
      GXt_int5 = AV18Tintatex ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV20EmprCod, httpContext.getMessage( "TINTAT", ""), GXv_int6) ;
      tmrepue_impl.this.GXt_int5 = GXv_int6[0] ;
      AV18Tintatex = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18Tintatex", GXutil.str( AV18Tintatex, 1, 0));
      if ( AV18Tintatex == 1 )
      {
      }
      GXt_int5 = AV16Artextil ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV20EmprCod, httpContext.getMessage( "ARTEXT", ""), GXv_int6) ;
      tmrepue_impl.this.GXt_int5 = GXv_int6[0] ;
      AV16Artextil = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16Artextil", GXutil.str( AV16Artextil, 1, 0));
      GXt_char1 = AV11Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      tmrepue_impl.this.GXt_char1 = GXv_char4[0] ;
      AV11Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11Station", AV11Station);
      GXv_char4[0] = AV20EmprCod ;
      GXv_char3[0] = AV14EmprNom ;
      GXv_char2[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV11Station, GXv_char4, GXv_char3, GXv_char2) ;
      tmrepue_impl.this.AV20EmprCod = GXv_char4[0] ;
      tmrepue_impl.this.AV14EmprNom = GXv_char3[0] ;
      tmrepue_impl.this.AV8UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20EmprCod", AV20EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV20EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV14EmprNom", AV14EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
      GXv_SdtWWPContext7[0] = AV24WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext7) ;
      AV24WWPContext = GXv_SdtWWPContext7[0] ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8 = AV32DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9[0] ;
      AV32DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8;
      Combo_prvnum_Titlecontrolidtoreplace = edtPrvNum_Internalname ;
      ucCombo_prvnum.sendProperty(context, "", false, Combo_prvnum_Internalname, "TitleControlIdToReplace", Combo_prvnum_Titlecontrolidtoreplace);
      edtPrvNum_Horizontalalignment = "Left" ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrvNum_Internalname, "Horizontalalignment", edtPrvNum_Horizontalalignment, !bGXsfl_92_Refreshing);
      /* Execute user subroutine: 'LOADCOMBOPRVNUM' */
      S112 ();
      if ( returnInSub )
      {
         pr_default.close(11);
         pr_default.close(10);
         pr_default.close(8);
         pr_default.close(7);
         pr_default.close(5);
         pr_default.close(4);
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      /* Execute user subroutine: 'ATTRIBUTESSECURITYCODE' */
      S122 ();
      if ( returnInSub )
      {
         pr_default.close(11);
         pr_default.close(10);
         pr_default.close(8);
         pr_default.close(7);
         pr_default.close(5);
         pr_default.close(4);
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      AV22TrnContext.fromxml(AV23WebSession.getValue("TrnContext"), null, null);
      edtMRUltMov_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMRUltMov_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRUltMov_Visible), 5, 0), true);
      edtMRUltRes_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMRUltRes_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRUltRes_Visible), 5, 0), true);
      edtEmprCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Visible), 5, 0), true);
      edtEmprNom_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Visible), 5, 0), true);
   }

   public void e1213W2( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         AV26mensaje = httpContext.getMessage( "¿Este Repuesto ", "") + GXutil.trim( A9493MRNom) + httpContext.getMessage( ", es Compatible con otro existente?", "") ;
         callWebObject(formatLink("app.mensajeconfirmarrepuestocompatible", new String[] {GXutil.URLEncode(GXutil.rtrim(AV20EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A9492MRCod,8,0)),GXutil.URLEncode(GXutil.rtrim(AV26mensaje)),GXutil.URLEncode(GXutil.booltostr(AV19Confirmado))}, new String[] {"EmprCod","MRCod","Mensaje","Confirmado"}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      else
      {
         httpContext.setWebReturnParms(new Object[] {});
         httpContext.setWebReturnParmsMetadata(new Object[] {});
         httpContext.wjLocDisableFrm = (byte)(1) ;
         httpContext.nUserReturn = (byte)(1) ;
         pr_default.close(11);
         pr_default.close(10);
         pr_default.close(8);
         pr_default.close(7);
         pr_default.close(5);
         pr_default.close(4);
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV22TrnContext.getgxTv_SdtWWPTransactionContext_Callerondelete() )
      {
         callWebObject(formatLink("app.mantenimientomaquina.tmrepueww", new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      if ( 0 > 1 )
      {
         if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV22TrnContext.getgxTv_SdtWWPTransactionContext_Callerondelete() )
         {
            callWebObject(formatLink("app.mantenimientomaquina.tmrepueww", new String[] {}, new String[] {}) );
            httpContext.wjLocDisableFrm = (byte)(1) ;
         }
         httpContext.setWebReturnParms(new Object[] {});
         httpContext.setWebReturnParmsMetadata(new Object[] {});
         httpContext.wjLocDisableFrm = (byte)(1) ;
         httpContext.nUserReturn = (byte)(1) ;
         pr_default.close(11);
         pr_default.close(10);
         pr_default.close(8);
         pr_default.close(7);
         pr_default.close(5);
         pr_default.close(4);
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
   }

   public void S122( )
   {
      /* 'ATTRIBUTESSECURITYCODE' Routine */
      returnInSub = false ;
      divTabtablelevel_level2_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, divTabtablelevel_level2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(divTabtablelevel_level2_Visible), 5, 0), true);
      divTabtablelevel_level1_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, divTabtablelevel_level1_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(divTabtablelevel_level1_Visible), 5, 0), true);
   }

   public void S112( )
   {
      /* 'LOADCOMBOPRVNUM' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTComboData_Item10 = AV30PrvNum_Data ;
      GXv_char4[0] = AV31ComboSelectedValue ;
      GXv_objcol_SdtDVB_SDTComboData_Item11[0] = GXt_objcol_SdtDVB_SDTComboData_Item10 ;
      new app.mantenimientomaquina.tmrepueloaddvcombo(remoteHandle, context).execute( "PrvNum", Gx_mode, AV20EmprCod, AV13MRCod, GXv_char4, GXv_objcol_SdtDVB_SDTComboData_Item11) ;
      tmrepue_impl.this.AV31ComboSelectedValue = GXv_char4[0] ;
      GXt_objcol_SdtDVB_SDTComboData_Item10 = GXv_objcol_SdtDVB_SDTComboData_Item11[0] ;
      AV30PrvNum_Data = GXt_objcol_SdtDVB_SDTComboData_Item10 ;
   }

   public void zm13W1238( int GX_JID )
   {
      if ( ( GX_JID == 40 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z9493MRNom = T013W12_A9493MRNom[0] ;
            Z9494MRCodExt = T013W12_A9494MRCodExt[0] ;
            Z11458MRCodPrv = T013W12_A11458MRCodPrv[0] ;
            Z9495MRStkAct = T013W12_A9495MRStkAct[0] ;
            Z9496MRStkRes = T013W12_A9496MRStkRes[0] ;
            Z9497MRStkMin = T013W12_A9497MRStkMin[0] ;
            Z9498MRStkCri = T013W12_A9498MRStkCri[0] ;
            Z9499MRStkPre = T013W12_A9499MRStkPre[0] ;
            Z9500MRUltMov = T013W12_A9500MRUltMov[0] ;
            Z9501MRUltRes = T013W12_A9501MRUltRes[0] ;
            Z12850MRActivo = T013W12_A12850MRActivo[0] ;
            Z14491MRLote = T013W12_A14491MRLote[0] ;
         }
         else
         {
            Z9493MRNom = A9493MRNom ;
            Z9494MRCodExt = A9494MRCodExt ;
            Z11458MRCodPrv = A11458MRCodPrv ;
            Z9495MRStkAct = A9495MRStkAct ;
            Z9496MRStkRes = A9496MRStkRes ;
            Z9497MRStkMin = A9497MRStkMin ;
            Z9498MRStkCri = A9498MRStkCri ;
            Z9499MRStkPre = A9499MRStkPre ;
            Z9500MRUltMov = A9500MRUltMov ;
            Z9501MRUltRes = A9501MRUltRes ;
            Z12850MRActivo = A12850MRActivo ;
            Z14491MRLote = A14491MRLote ;
         }
      }
      if ( GX_JID == -40 )
      {
         Z9492MRCod = A9492MRCod ;
         Z9493MRNom = A9493MRNom ;
         Z9494MRCodExt = A9494MRCodExt ;
         Z11458MRCodPrv = A11458MRCodPrv ;
         Z9495MRStkAct = A9495MRStkAct ;
         Z9496MRStkRes = A9496MRStkRes ;
         Z9497MRStkMin = A9497MRStkMin ;
         Z9498MRStkCri = A9498MRStkCri ;
         Z9499MRStkPre = A9499MRStkPre ;
         Z9500MRUltMov = A9500MRUltMov ;
         Z9501MRUltRes = A9501MRUltRes ;
         Z12850MRActivo = A12850MRActivo ;
         Z14491MRLote = A14491MRLote ;
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
      divTabtablelevel_level2_Visible = (((GXutil.strcmp(Gx_mode, httpContext.getMessage( httpContext.getMessage( "DSP", ""), ""))==0)) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, divTabtablelevel_level2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(divTabtablelevel_level2_Visible), 5, 0), true);
      divTabtablelevel_level1_Visible = (((GXutil.strcmp(Gx_mode, httpContext.getMessage( httpContext.getMessage( "DSP", ""), ""))==0)) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, divTabtablelevel_level1_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(divTabtablelevel_level1_Visible), 5, 0), true);
      edtMRUltMov_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMRUltMov_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRUltMov_Enabled), 5, 0), true);
      edtMRUltRes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMRUltRes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRUltRes_Enabled), 5, 0), true);
      edtMRStkAct_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMRStkAct_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRStkAct_Enabled), 5, 0), true);
      edtMRStkRes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMRStkRes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRStkRes_Enabled), 5, 0), true);
      AV34Pgmname = "MantenimientoMaquina.TMRepue" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34Pgmname", AV34Pgmname);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      edtMRUltMov_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMRUltMov_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRUltMov_Enabled), 5, 0), true);
      edtMRUltRes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMRUltRes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRUltRes_Enabled), 5, 0), true);
      edtMRStkAct_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMRStkAct_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRStkAct_Enabled), 5, 0), true);
      edtMRStkRes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMRStkRes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRStkRes_Enabled), 5, 0), true);
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV20EmprCod)==0) )
      {
         A396EmprCod = AV20EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      if ( ! (GXutil.strcmp("", AV20EmprCod)==0) )
      {
         edtEmprCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      }
      else
      {
         edtEmprCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      }
      if ( ! (GXutil.strcmp("", AV20EmprCod)==0) )
      {
         edtEmprCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      }
      if ( ! (0==AV13MRCod) )
      {
         A9492MRCod = AV13MRCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A9492MRCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9492MRCod), 8, 0));
      }
      if ( ! (0==AV13MRCod) )
      {
         edtMRCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMRCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRCod_Enabled), 5, 0), true);
      }
      if ( ! (0==AV13MRCod) )
      {
         edtMRCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMRCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRCod_Enabled), 5, 0), true);
      }
      else
      {
         if ( (0==AV13MRCod) && (0==AV16Artextil) && (0==AV17NumManual) )
         {
            edtMRCod_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtMRCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRCod_Enabled), 5, 0), true);
         }
         else
         {
            edtMRCod_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtMRCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRCod_Enabled), 5, 0), true);
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
      if ( isIns( )  && (GXutil.strcmp("", A12850MRActivo)==0) && ( Gx_BScreen == 0 ) )
      {
         A12850MRActivo = httpContext.getMessage( httpContext.getMessage( "S", ""), "") ;
         n12850MRActivo = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12850MRActivo", A12850MRActivo);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ( Gx_BScreen == 0 ) )
      {
         /* Using cursor T013W13 */
         pr_default.execute(11, new Object[] {A396EmprCod});
         A407EmprNom = T013W13_A407EmprNom[0] ;
         n407EmprNom = T013W13_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         pr_default.close(11);
      }
   }

   public void load13W1238( )
   {
      /* Using cursor T013W14 */
      pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A9492MRCod)});
      if ( (pr_default.getStatus(12) != 101) )
      {
         RcdFound1238 = (short)(1) ;
         A407EmprNom = T013W14_A407EmprNom[0] ;
         n407EmprNom = T013W14_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A9493MRNom = T013W14_A9493MRNom[0] ;
         n9493MRNom = T013W14_n9493MRNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9493MRNom", A9493MRNom);
         A9494MRCodExt = T013W14_A9494MRCodExt[0] ;
         n9494MRCodExt = T013W14_n9494MRCodExt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9494MRCodExt", A9494MRCodExt);
         A11458MRCodPrv = T013W14_A11458MRCodPrv[0] ;
         n11458MRCodPrv = T013W14_n11458MRCodPrv[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11458MRCodPrv", A11458MRCodPrv);
         A9495MRStkAct = T013W14_A9495MRStkAct[0] ;
         n9495MRStkAct = T013W14_n9495MRStkAct[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9495MRStkAct", GXutil.ltrimstr( A9495MRStkAct, 10, 3));
         A9496MRStkRes = T013W14_A9496MRStkRes[0] ;
         n9496MRStkRes = T013W14_n9496MRStkRes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9496MRStkRes", GXutil.ltrimstr( A9496MRStkRes, 10, 3));
         A9497MRStkMin = T013W14_A9497MRStkMin[0] ;
         n9497MRStkMin = T013W14_n9497MRStkMin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9497MRStkMin", GXutil.ltrimstr( A9497MRStkMin, 12, 3));
         A9498MRStkCri = T013W14_A9498MRStkCri[0] ;
         n9498MRStkCri = T013W14_n9498MRStkCri[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9498MRStkCri", GXutil.ltrimstr( A9498MRStkCri, 12, 3));
         A9499MRStkPre = T013W14_A9499MRStkPre[0] ;
         n9499MRStkPre = T013W14_n9499MRStkPre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9499MRStkPre", GXutil.ltrimstr( A9499MRStkPre, 12, 3));
         A9500MRUltMov = T013W14_A9500MRUltMov[0] ;
         n9500MRUltMov = T013W14_n9500MRUltMov[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9500MRUltMov", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9500MRUltMov), 8, 0));
         A9501MRUltRes = T013W14_A9501MRUltRes[0] ;
         n9501MRUltRes = T013W14_n9501MRUltRes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9501MRUltRes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9501MRUltRes), 10, 0));
         A12850MRActivo = T013W14_A12850MRActivo[0] ;
         n12850MRActivo = T013W14_n12850MRActivo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12850MRActivo", A12850MRActivo);
         A14491MRLote = T013W14_A14491MRLote[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14491MRLote", A14491MRLote);
         zm13W1238( -40) ;
      }
      pr_default.close(12);
      onLoadActions13W1238( ) ;
   }

   public void onLoadActions13W1238( )
   {
      A13718MRCNom = GXutil.trim( GXutil.str( A9492MRCod, 8, 0)) + " - " + GXutil.trim( A9493MRNom) ;
      httpContext.ajax_rsp_assign_attri("", false, "A13718MRCNom", A13718MRCNom);
   }

   public void checkExtendedTable13W1238( )
   {
      nIsDirty_1238 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      /* Using cursor T013W13 */
      pr_default.execute(11, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(11) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T013W13_A407EmprNom[0] ;
      n407EmprNom = T013W13_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(11);
      nIsDirty_1238 = (short)(1) ;
      A13718MRCNom = GXutil.trim( GXutil.str( A9492MRCod, 8, 0)) + " - " + GXutil.trim( A9493MRNom) ;
      httpContext.ajax_rsp_assign_attri("", false, "A13718MRCNom", A13718MRCNom);
      if ( isIns( )  && true /* After */ && (0==A9492MRCod) && ( ! (0==AV16Artextil) || ! (0==AV17NumManual) ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Se requiere Código", ""), 1, "MRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtMRCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( (GXutil.strcmp("", A9493MRNom)==0) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Nombre Respuesto vacio", ""), 1, "MRNOM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtMRNom_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors13W1238( )
   {
      pr_default.close(11);
   }

   public void enableDisable( )
   {
   }

   public void gxload_41( String A396EmprCod )
   {
      /* Using cursor T013W15 */
      pr_default.execute(13, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(13) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T013W15_A407EmprNom[0] ;
      n407EmprNom = T013W15_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
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

   public void getKey13W1238( )
   {
      /* Using cursor T013W16 */
      pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A9492MRCod)});
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound1238 = (short)(1) ;
      }
      else
      {
         RcdFound1238 = (short)(0) ;
      }
      pr_default.close(14);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T013W12 */
      pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A9492MRCod)});
      if ( (pr_default.getStatus(10) != 101) )
      {
         zm13W1238( 40) ;
         RcdFound1238 = (short)(1) ;
         A9492MRCod = T013W12_A9492MRCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9492MRCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9492MRCod), 8, 0));
         A9493MRNom = T013W12_A9493MRNom[0] ;
         n9493MRNom = T013W12_n9493MRNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9493MRNom", A9493MRNom);
         A9494MRCodExt = T013W12_A9494MRCodExt[0] ;
         n9494MRCodExt = T013W12_n9494MRCodExt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9494MRCodExt", A9494MRCodExt);
         A11458MRCodPrv = T013W12_A11458MRCodPrv[0] ;
         n11458MRCodPrv = T013W12_n11458MRCodPrv[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11458MRCodPrv", A11458MRCodPrv);
         A9495MRStkAct = T013W12_A9495MRStkAct[0] ;
         n9495MRStkAct = T013W12_n9495MRStkAct[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9495MRStkAct", GXutil.ltrimstr( A9495MRStkAct, 10, 3));
         A9496MRStkRes = T013W12_A9496MRStkRes[0] ;
         n9496MRStkRes = T013W12_n9496MRStkRes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9496MRStkRes", GXutil.ltrimstr( A9496MRStkRes, 10, 3));
         A9497MRStkMin = T013W12_A9497MRStkMin[0] ;
         n9497MRStkMin = T013W12_n9497MRStkMin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9497MRStkMin", GXutil.ltrimstr( A9497MRStkMin, 12, 3));
         A9498MRStkCri = T013W12_A9498MRStkCri[0] ;
         n9498MRStkCri = T013W12_n9498MRStkCri[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9498MRStkCri", GXutil.ltrimstr( A9498MRStkCri, 12, 3));
         A9499MRStkPre = T013W12_A9499MRStkPre[0] ;
         n9499MRStkPre = T013W12_n9499MRStkPre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9499MRStkPre", GXutil.ltrimstr( A9499MRStkPre, 12, 3));
         A9500MRUltMov = T013W12_A9500MRUltMov[0] ;
         n9500MRUltMov = T013W12_n9500MRUltMov[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9500MRUltMov", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9500MRUltMov), 8, 0));
         A9501MRUltRes = T013W12_A9501MRUltRes[0] ;
         n9501MRUltRes = T013W12_n9501MRUltRes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9501MRUltRes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9501MRUltRes), 10, 0));
         A12850MRActivo = T013W12_A12850MRActivo[0] ;
         n12850MRActivo = T013W12_n12850MRActivo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12850MRActivo", A12850MRActivo);
         A14491MRLote = T013W12_A14491MRLote[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14491MRLote", A14491MRLote);
         A396EmprCod = T013W12_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         O9496MRStkRes = A9496MRStkRes ;
         n9496MRStkRes = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9496MRStkRes", GXutil.ltrimstr( A9496MRStkRes, 10, 3));
         O9501MRUltRes = A9501MRUltRes ;
         n9501MRUltRes = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9501MRUltRes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9501MRUltRes), 10, 0));
         O9495MRStkAct = A9495MRStkAct ;
         n9495MRStkAct = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9495MRStkAct", GXutil.ltrimstr( A9495MRStkAct, 10, 3));
         O9500MRUltMov = A9500MRUltMov ;
         n9500MRUltMov = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9500MRUltMov", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9500MRUltMov), 8, 0));
         Z396EmprCod = A396EmprCod ;
         Z9492MRCod = A9492MRCod ;
         sMode1238 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load13W1238( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1238 = (short)(0) ;
            initializeNonKey13W1238( ) ;
         }
         Gx_mode = sMode1238 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1238 = (short)(0) ;
         initializeNonKey13W1238( ) ;
         sMode1238 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1238 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(10);
   }

   public void getEqualNoModal( )
   {
      getKey13W1238( ) ;
      if ( RcdFound1238 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound1238 = (short)(0) ;
      /* Using cursor T013W17 */
      pr_default.execute(15, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A9492MRCod)});
      if ( (pr_default.getStatus(15) != 101) )
      {
         while ( (pr_default.getStatus(15) != 101) && ( ( GXutil.strcmp(T013W17_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T013W17_A396EmprCod[0], A396EmprCod) == 0 ) && ( T013W17_A9492MRCod[0] < A9492MRCod ) ) )
         {
            pr_default.readNext(15);
         }
         if ( (pr_default.getStatus(15) != 101) && ( ( GXutil.strcmp(T013W17_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T013W17_A396EmprCod[0], A396EmprCod) == 0 ) && ( T013W17_A9492MRCod[0] > A9492MRCod ) ) )
         {
            A396EmprCod = T013W17_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A9492MRCod = T013W17_A9492MRCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A9492MRCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9492MRCod), 8, 0));
            RcdFound1238 = (short)(1) ;
         }
      }
      pr_default.close(15);
   }

   public void move_previous( )
   {
      RcdFound1238 = (short)(0) ;
      /* Using cursor T013W18 */
      pr_default.execute(16, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A9492MRCod)});
      if ( (pr_default.getStatus(16) != 101) )
      {
         while ( (pr_default.getStatus(16) != 101) && ( ( GXutil.strcmp(T013W18_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T013W18_A396EmprCod[0], A396EmprCod) == 0 ) && ( T013W18_A9492MRCod[0] > A9492MRCod ) ) )
         {
            pr_default.readNext(16);
         }
         if ( (pr_default.getStatus(16) != 101) && ( ( GXutil.strcmp(T013W18_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T013W18_A396EmprCod[0], A396EmprCod) == 0 ) && ( T013W18_A9492MRCod[0] < A9492MRCod ) ) )
         {
            A396EmprCod = T013W18_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A9492MRCod = T013W18_A9492MRCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A9492MRCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9492MRCod), 8, 0));
            RcdFound1238 = (short)(1) ;
         }
      }
      pr_default.close(16);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey13W1238( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A9495MRStkAct = O9495MRStkAct ;
         n9495MRStkAct = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9495MRStkAct", GXutil.ltrimstr( A9495MRStkAct, 10, 3));
         A9500MRUltMov = O9500MRUltMov ;
         n9500MRUltMov = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9500MRUltMov", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9500MRUltMov), 8, 0));
         A9496MRStkRes = O9496MRStkRes ;
         n9496MRStkRes = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9496MRStkRes", GXutil.ltrimstr( A9496MRStkRes, 10, 3));
         A9501MRUltRes = O9501MRUltRes ;
         n9501MRUltRes = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9501MRUltRes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9501MRUltRes), 10, 0));
         GX_FocusControl = edtMRCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert13W1238( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1238 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A9492MRCod != Z9492MRCod ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A9492MRCod = Z9492MRCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A9492MRCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9492MRCod), 8, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               A9495MRStkAct = O9495MRStkAct ;
               n9495MRStkAct = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9495MRStkAct", GXutil.ltrimstr( A9495MRStkAct, 10, 3));
               A9500MRUltMov = O9500MRUltMov ;
               n9500MRUltMov = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9500MRUltMov", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9500MRUltMov), 8, 0));
               A9496MRStkRes = O9496MRStkRes ;
               n9496MRStkRes = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9496MRStkRes", GXutil.ltrimstr( A9496MRStkRes, 10, 3));
               A9501MRUltRes = O9501MRUltRes ;
               n9501MRUltRes = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9501MRUltRes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9501MRUltRes), 10, 0));
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtMRCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               A9495MRStkAct = O9495MRStkAct ;
               n9495MRStkAct = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9495MRStkAct", GXutil.ltrimstr( A9495MRStkAct, 10, 3));
               A9500MRUltMov = O9500MRUltMov ;
               n9500MRUltMov = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9500MRUltMov", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9500MRUltMov), 8, 0));
               A9496MRStkRes = O9496MRStkRes ;
               n9496MRStkRes = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9496MRStkRes", GXutil.ltrimstr( A9496MRStkRes, 10, 3));
               A9501MRUltRes = O9501MRUltRes ;
               n9501MRUltRes = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9501MRUltRes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9501MRUltRes), 10, 0));
               update13W1238( ) ;
               GX_FocusControl = edtMRCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A9492MRCod != Z9492MRCod ) )
            {
               /* Insert record */
               A9495MRStkAct = O9495MRStkAct ;
               n9495MRStkAct = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9495MRStkAct", GXutil.ltrimstr( A9495MRStkAct, 10, 3));
               A9500MRUltMov = O9500MRUltMov ;
               n9500MRUltMov = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9500MRUltMov", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9500MRUltMov), 8, 0));
               A9496MRStkRes = O9496MRStkRes ;
               n9496MRStkRes = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9496MRStkRes", GXutil.ltrimstr( A9496MRStkRes, 10, 3));
               A9501MRUltRes = O9501MRUltRes ;
               n9501MRUltRes = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9501MRUltRes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9501MRUltRes), 10, 0));
               GX_FocusControl = edtMRCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert13W1238( ) ;
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
                  A9495MRStkAct = O9495MRStkAct ;
                  n9495MRStkAct = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A9495MRStkAct", GXutil.ltrimstr( A9495MRStkAct, 10, 3));
                  A9500MRUltMov = O9500MRUltMov ;
                  n9500MRUltMov = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A9500MRUltMov", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9500MRUltMov), 8, 0));
                  A9496MRStkRes = O9496MRStkRes ;
                  n9496MRStkRes = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A9496MRStkRes", GXutil.ltrimstr( A9496MRStkRes, 10, 3));
                  A9501MRUltRes = O9501MRUltRes ;
                  n9501MRUltRes = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A9501MRUltRes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9501MRUltRes), 10, 0));
                  GX_FocusControl = edtMRCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert13W1238( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A9492MRCod != Z9492MRCod ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A9492MRCod = Z9492MRCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A9492MRCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9492MRCod), 8, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         A9495MRStkAct = O9495MRStkAct ;
         n9495MRStkAct = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9495MRStkAct", GXutil.ltrimstr( A9495MRStkAct, 10, 3));
         A9500MRUltMov = O9500MRUltMov ;
         n9500MRUltMov = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9500MRUltMov", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9500MRUltMov), 8, 0));
         A9496MRStkRes = O9496MRStkRes ;
         n9496MRStkRes = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9496MRStkRes", GXutil.ltrimstr( A9496MRStkRes, 10, 3));
         A9501MRUltRes = O9501MRUltRes ;
         n9501MRUltRes = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9501MRUltRes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9501MRUltRes), 10, 0));
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtMRCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency13W1238( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T013W11 */
         pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A9492MRCod)});
         if ( (pr_default.getStatus(9) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMREPUE"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(9) == 101) || ( GXutil.strcmp(Z9493MRNom, T013W11_A9493MRNom[0]) != 0 ) || ( GXutil.strcmp(Z9494MRCodExt, T013W11_A9494MRCodExt[0]) != 0 ) || ( GXutil.strcmp(Z11458MRCodPrv, T013W11_A11458MRCodPrv[0]) != 0 ) || ( DecimalUtil.compareTo(Z9495MRStkAct, T013W11_A9495MRStkAct[0]) != 0 ) || ( DecimalUtil.compareTo(Z9496MRStkRes, T013W11_A9496MRStkRes[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z9497MRStkMin, T013W11_A9497MRStkMin[0]) != 0 ) || ( DecimalUtil.compareTo(Z9498MRStkCri, T013W11_A9498MRStkCri[0]) != 0 ) || ( DecimalUtil.compareTo(Z9499MRStkPre, T013W11_A9499MRStkPre[0]) != 0 ) || ( Z9500MRUltMov != T013W11_A9500MRUltMov[0] ) || ( Z9501MRUltRes != T013W11_A9501MRUltRes[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z12850MRActivo, T013W11_A12850MRActivo[0]) != 0 ) || ( GXutil.strcmp(Z14491MRLote, T013W11_A14491MRLote[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z9493MRNom, T013W11_A9493MRNom[0]) != 0 )
            {
               GXutil.writeLogln("mantenimientomaquina.tmrepue:[seudo value changed for attri]"+"MRNom");
               GXutil.writeLogRaw("Old: ",Z9493MRNom);
               GXutil.writeLogRaw("Current: ",T013W11_A9493MRNom[0]);
            }
            if ( GXutil.strcmp(Z9494MRCodExt, T013W11_A9494MRCodExt[0]) != 0 )
            {
               GXutil.writeLogln("mantenimientomaquina.tmrepue:[seudo value changed for attri]"+"MRCodExt");
               GXutil.writeLogRaw("Old: ",Z9494MRCodExt);
               GXutil.writeLogRaw("Current: ",T013W11_A9494MRCodExt[0]);
            }
            if ( GXutil.strcmp(Z11458MRCodPrv, T013W11_A11458MRCodPrv[0]) != 0 )
            {
               GXutil.writeLogln("mantenimientomaquina.tmrepue:[seudo value changed for attri]"+"MRCodPrv");
               GXutil.writeLogRaw("Old: ",Z11458MRCodPrv);
               GXutil.writeLogRaw("Current: ",T013W11_A11458MRCodPrv[0]);
            }
            if ( DecimalUtil.compareTo(Z9495MRStkAct, T013W11_A9495MRStkAct[0]) != 0 )
            {
               GXutil.writeLogln("mantenimientomaquina.tmrepue:[seudo value changed for attri]"+"MRStkAct");
               GXutil.writeLogRaw("Old: ",Z9495MRStkAct);
               GXutil.writeLogRaw("Current: ",T013W11_A9495MRStkAct[0]);
            }
            if ( DecimalUtil.compareTo(Z9496MRStkRes, T013W11_A9496MRStkRes[0]) != 0 )
            {
               GXutil.writeLogln("mantenimientomaquina.tmrepue:[seudo value changed for attri]"+"MRStkRes");
               GXutil.writeLogRaw("Old: ",Z9496MRStkRes);
               GXutil.writeLogRaw("Current: ",T013W11_A9496MRStkRes[0]);
            }
            if ( DecimalUtil.compareTo(Z9497MRStkMin, T013W11_A9497MRStkMin[0]) != 0 )
            {
               GXutil.writeLogln("mantenimientomaquina.tmrepue:[seudo value changed for attri]"+"MRStkMin");
               GXutil.writeLogRaw("Old: ",Z9497MRStkMin);
               GXutil.writeLogRaw("Current: ",T013W11_A9497MRStkMin[0]);
            }
            if ( DecimalUtil.compareTo(Z9498MRStkCri, T013W11_A9498MRStkCri[0]) != 0 )
            {
               GXutil.writeLogln("mantenimientomaquina.tmrepue:[seudo value changed for attri]"+"MRStkCri");
               GXutil.writeLogRaw("Old: ",Z9498MRStkCri);
               GXutil.writeLogRaw("Current: ",T013W11_A9498MRStkCri[0]);
            }
            if ( DecimalUtil.compareTo(Z9499MRStkPre, T013W11_A9499MRStkPre[0]) != 0 )
            {
               GXutil.writeLogln("mantenimientomaquina.tmrepue:[seudo value changed for attri]"+"MRStkPre");
               GXutil.writeLogRaw("Old: ",Z9499MRStkPre);
               GXutil.writeLogRaw("Current: ",T013W11_A9499MRStkPre[0]);
            }
            if ( Z9500MRUltMov != T013W11_A9500MRUltMov[0] )
            {
               GXutil.writeLogln("mantenimientomaquina.tmrepue:[seudo value changed for attri]"+"MRUltMov");
               GXutil.writeLogRaw("Old: ",Z9500MRUltMov);
               GXutil.writeLogRaw("Current: ",T013W11_A9500MRUltMov[0]);
            }
            if ( Z9501MRUltRes != T013W11_A9501MRUltRes[0] )
            {
               GXutil.writeLogln("mantenimientomaquina.tmrepue:[seudo value changed for attri]"+"MRUltRes");
               GXutil.writeLogRaw("Old: ",Z9501MRUltRes);
               GXutil.writeLogRaw("Current: ",T013W11_A9501MRUltRes[0]);
            }
            if ( GXutil.strcmp(Z12850MRActivo, T013W11_A12850MRActivo[0]) != 0 )
            {
               GXutil.writeLogln("mantenimientomaquina.tmrepue:[seudo value changed for attri]"+"MRActivo");
               GXutil.writeLogRaw("Old: ",Z12850MRActivo);
               GXutil.writeLogRaw("Current: ",T013W11_A12850MRActivo[0]);
            }
            if ( GXutil.strcmp(Z14491MRLote, T013W11_A14491MRLote[0]) != 0 )
            {
               GXutil.writeLogln("mantenimientomaquina.tmrepue:[seudo value changed for attri]"+"MRLote");
               GXutil.writeLogRaw("Old: ",Z14491MRLote);
               GXutil.writeLogRaw("Current: ",T013W11_A14491MRLote[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPMREPUE"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert13W1238( )
   {
      beforeValidate13W1238( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable13W1238( ) ;
      }
      if ( AnyError == 0 )
      {
         zm13W1238( 0) ;
         checkOptimisticConcurrency13W1238( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm13W1238( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert13W1238( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T013W19 */
                  pr_default.execute(17, new Object[] {Integer.valueOf(A9492MRCod), Boolean.valueOf(n9493MRNom), A9493MRNom, Boolean.valueOf(n9494MRCodExt), A9494MRCodExt, Boolean.valueOf(n11458MRCodPrv), A11458MRCodPrv, Boolean.valueOf(n9495MRStkAct), A9495MRStkAct, Boolean.valueOf(n9496MRStkRes), A9496MRStkRes, Boolean.valueOf(n9497MRStkMin), A9497MRStkMin, Boolean.valueOf(n9498MRStkCri), A9498MRStkCri, Boolean.valueOf(n9499MRStkPre), A9499MRStkPre, Boolean.valueOf(n9500MRUltMov), Integer.valueOf(A9500MRUltMov), Boolean.valueOf(n9501MRUltRes), Long.valueOf(A9501MRUltRes), Boolean.valueOf(n12850MRActivo), A12850MRActivo, A14491MRLote, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMREPUE");
                  if ( (pr_default.getStatus(17) == 1) )
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
                        processLevel13W1238( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption13W0( ) ;
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
            load13W1238( ) ;
         }
         endLevel13W1238( ) ;
      }
      closeExtendedTableCursors13W1238( ) ;
   }

   public void update13W1238( )
   {
      beforeValidate13W1238( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable13W1238( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency13W1238( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm13W1238( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate13W1238( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T013W20 */
                  pr_default.execute(18, new Object[] {Boolean.valueOf(n9493MRNom), A9493MRNom, Boolean.valueOf(n9494MRCodExt), A9494MRCodExt, Boolean.valueOf(n11458MRCodPrv), A11458MRCodPrv, Boolean.valueOf(n9495MRStkAct), A9495MRStkAct, Boolean.valueOf(n9496MRStkRes), A9496MRStkRes, Boolean.valueOf(n9497MRStkMin), A9497MRStkMin, Boolean.valueOf(n9498MRStkCri), A9498MRStkCri, Boolean.valueOf(n9499MRStkPre), A9499MRStkPre, Boolean.valueOf(n9500MRUltMov), Integer.valueOf(A9500MRUltMov), Boolean.valueOf(n9501MRUltRes), Long.valueOf(A9501MRUltRes), Boolean.valueOf(n12850MRActivo), A12850MRActivo, A14491MRLote, A396EmprCod, Integer.valueOf(A9492MRCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMREPUE");
                  if ( (pr_default.getStatus(18) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMREPUE"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate13W1238( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel13W1238( ) ;
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
         endLevel13W1238( ) ;
      }
      closeExtendedTableCursors13W1238( ) ;
   }

   public void deferredUpdate13W1238( )
   {
   }

   public void delete( )
   {
      beforeValidate13W1238( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency13W1238( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls13W1238( ) ;
         afterConfirm13W1238( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete13W1238( ) ;
            if ( AnyError == 0 )
            {
               scanStart13W1473( ) ;
               while ( RcdFound1473 != 0 )
               {
                  getByPrimaryKey13W1473( ) ;
                  delete13W1473( ) ;
                  scanNext13W1473( ) ;
               }
               scanEnd13W1473( ) ;
               A9496MRStkRes = O9496MRStkRes ;
               n9496MRStkRes = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9496MRStkRes", GXutil.ltrimstr( A9496MRStkRes, 10, 3));
               A9501MRUltRes = O9501MRUltRes ;
               n9501MRUltRes = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9501MRUltRes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9501MRUltRes), 10, 0));
               scanStart13W1240( ) ;
               while ( RcdFound1240 != 0 )
               {
                  getByPrimaryKey13W1240( ) ;
                  delete13W1240( ) ;
                  scanNext13W1240( ) ;
                  O9496MRStkRes = A9496MRStkRes ;
                  n9496MRStkRes = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A9496MRStkRes", GXutil.ltrimstr( A9496MRStkRes, 10, 3));
                  O9501MRUltRes = A9501MRUltRes ;
                  n9501MRUltRes = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A9501MRUltRes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9501MRUltRes), 10, 0));
               }
               scanEnd13W1240( ) ;
               A9495MRStkAct = O9495MRStkAct ;
               n9495MRStkAct = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9495MRStkAct", GXutil.ltrimstr( A9495MRStkAct, 10, 3));
               A9500MRUltMov = O9500MRUltMov ;
               n9500MRUltMov = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9500MRUltMov", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9500MRUltMov), 8, 0));
               scanStart13W1239( ) ;
               while ( RcdFound1239 != 0 )
               {
                  getByPrimaryKey13W1239( ) ;
                  delete13W1239( ) ;
                  scanNext13W1239( ) ;
                  O9495MRStkAct = A9495MRStkAct ;
                  n9495MRStkAct = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A9495MRStkAct", GXutil.ltrimstr( A9495MRStkAct, 10, 3));
                  O9500MRUltMov = A9500MRUltMov ;
                  n9500MRUltMov = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A9500MRUltMov", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9500MRUltMov), 8, 0));
               }
               scanEnd13W1239( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T013W21 */
                  pr_default.execute(19, new Object[] {A396EmprCod, Integer.valueOf(A9492MRCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMREPUE");
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
      sMode1238 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel13W1238( ) ;
      Gx_mode = sMode1238 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls13W1238( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         if ( isIns( )  && true /* After */ && (0==A9492MRCod) && ( ! (0==AV16Artextil) || ! (0==AV17NumManual) ) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Se requiere Código", ""), 1, "MRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMRCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         /* Using cursor T013W22 */
         pr_default.execute(20, new Object[] {A396EmprCod});
         A407EmprNom = T013W22_A407EmprNom[0] ;
         n407EmprNom = T013W22_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         pr_default.close(20);
         A13718MRCNom = GXutil.trim( GXutil.str( A9492MRCod, 8, 0)) + " - " + GXutil.trim( A9493MRNom) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13718MRCNom", A13718MRCNom);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T013W23 */
         pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A9492MRCod)});
         if ( (pr_default.getStatus(21) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Repuestos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(21);
         /* Using cursor T013W24 */
         pr_default.execute(22, new Object[] {A396EmprCod, Integer.valueOf(A9492MRCod)});
         if ( (pr_default.getStatus(22) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Repuestos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(22);
         /* Using cursor T013W25 */
         pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A9492MRCod)});
         if ( (pr_default.getStatus(23) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MRCom1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(23);
         /* Using cursor T013W26 */
         pr_default.execute(24, new Object[] {A396EmprCod, Integer.valueOf(A9492MRCod)});
         if ( (pr_default.getStatus(24) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MRCom", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(24);
         /* Using cursor T013W27 */
         pr_default.execute(25, new Object[] {A396EmprCod, Integer.valueOf(A9492MRCod)});
         if ( (pr_default.getStatus(25) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Repuestos de Tareas de Mant.", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(25);
         /* Using cursor T013W28 */
         pr_default.execute(26, new Object[] {A396EmprCod, Integer.valueOf(A9492MRCod)});
         if ( (pr_default.getStatus(26) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Repuestos Preventivo", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(26);
         /* Using cursor T013W29 */
         pr_default.execute(27, new Object[] {A396EmprCod, Integer.valueOf(A9492MRCod)});
         if ( (pr_default.getStatus(27) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Rep. de las Ordenes de Manten.", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(27);
         /* Using cursor T013W30 */
         pr_default.execute(28, new Object[] {A396EmprCod, Integer.valueOf(A9492MRCod)});
         if ( (pr_default.getStatus(28) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Repuestos en Mov de Stock", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(28);
         /* Using cursor T013W31 */
         pr_default.execute(29, new Object[] {A396EmprCod, Integer.valueOf(A9492MRCod)});
         if ( (pr_default.getStatus(29) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Rep. del Inventario de Stock", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(29);
      }
   }

   public void processNestedLevel13W1473( )
   {
      nGXsfl_92_idx = 0 ;
      while ( nGXsfl_92_idx < nRC_GXsfl_92 )
      {
         readRow13W1473( ) ;
         if ( ( nRcdExists_1473 != 0 ) || ( nIsMod_1473 != 0 ) )
         {
            standaloneNotModal13W1473( ) ;
            getKey13W1473( ) ;
            if ( ( nRcdExists_1473 == 0 ) && ( nRcdDeleted_1473 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert13W1473( ) ;
            }
            else
            {
               if ( RcdFound1473 != 0 )
               {
                  if ( ( nRcdDeleted_1473 != 0 ) && ( nRcdExists_1473 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete13W1473( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1473 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update13W1473( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1473 == 0 )
                  {
                     GXCCtl = "PRVNUM_" + sGXsfl_92_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtPrvNum_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtPrvNum_Internalname, GXutil.ltrim( localUtil.ntoc( A795PrvNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPrvNom_Internalname, GXutil.rtrim( A794PrvNom)) ;
         httpContext.changePostValue( chkMRPrvHab.getInternalname(), GXutil.ltrim( localUtil.ntoc( A11056MRPrvHab, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z795PrvNum_"+sGXsfl_92_idx, GXutil.ltrim( localUtil.ntoc( Z795PrvNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11056MRPrvHab_"+sGXsfl_92_idx, GXutil.ltrim( localUtil.ntoc( Z11056MRPrvHab, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1473_"+sGXsfl_92_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1473, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1473_"+sGXsfl_92_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1473, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1473_"+sGXsfl_92_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1473, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1473 != 0 )
         {
            httpContext.changePostValue( "PRVNUM_"+sGXsfl_92_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrvNum_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRVNUM_"+sGXsfl_92_idx+"Horizontalalignment", GXutil.rtrim( edtPrvNum_Horizontalalignment)) ;
            httpContext.changePostValue( "PRVNOM_"+sGXsfl_92_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrvNom_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MRPRVHAB_"+sGXsfl_92_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( chkMRPrvHab.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll13W1473( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1473 = (short)(0) ;
      nIsMod_1473 = (short)(0) ;
      nRcdDeleted_1473 = (short)(0) ;
   }

   public void processNestedLevel13W1239( )
   {
      s9495MRStkAct = O9495MRStkAct ;
      n9495MRStkAct = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9495MRStkAct", GXutil.ltrimstr( A9495MRStkAct, 10, 3));
      s9500MRUltMov = O9500MRUltMov ;
      n9500MRUltMov = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9500MRUltMov", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9500MRUltMov), 8, 0));
      nGXsfl_106_idx = 0 ;
      while ( nGXsfl_106_idx < nRC_GXsfl_106 )
      {
         readRow13W1239( ) ;
         if ( ( nRcdExists_1239 != 0 ) || ( nIsMod_1239 != 0 ) )
         {
            standaloneNotModal13W1239( ) ;
            getKey13W1239( ) ;
            if ( ( nRcdExists_1239 == 0 ) && ( nRcdDeleted_1239 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert13W1239( ) ;
            }
            else
            {
               if ( RcdFound1239 != 0 )
               {
                  if ( ( nRcdDeleted_1239 != 0 ) && ( nRcdExists_1239 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete13W1239( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1239 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update13W1239( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1239 == 0 )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "MRCOD");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtMRCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O9495MRStkAct = A9495MRStkAct ;
            n9495MRStkAct = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9495MRStkAct", GXutil.ltrimstr( A9495MRStkAct, 10, 3));
            O9500MRUltMov = A9500MRUltMov ;
            n9500MRUltMov = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9500MRUltMov", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9500MRUltMov), 8, 0));
         }
         httpContext.changePostValue( edtMRMov_Internalname, GXutil.ltrim( localUtil.ntoc( A9502MRMov, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMRMovOrd_Internalname, GXutil.ltrim( localUtil.ntoc( A9503MRMovOrd, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMRMovFch_Internalname, localUtil.ttoc( A9504MRMovFch, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( dynMRMovTpo.getInternalname(), GXutil.ltrim( localUtil.ntoc( A9505MRMovTpo, (byte)(8), (byte)(0), ".", ""))) ;
         httpContext.changePostValue( edtMRMovTpoD_Internalname, GXutil.rtrim( A9506MRMovTpoD)) ;
         httpContext.changePostValue( edtMRMovDsc_Internalname, GXutil.rtrim( A9507MRMovDsc)) ;
         httpContext.changePostValue( edtMRMovCnt_Internalname, GXutil.ltrim( localUtil.ntoc( A9508MRMovCnt, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMRMovPre_Internalname, GXutil.ltrim( localUtil.ntoc( A9509MRMovPre, (byte)(14), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9502MRMov_"+sGXsfl_106_idx, GXutil.ltrim( localUtil.ntoc( Z9502MRMov, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9509MRMovPre_"+sGXsfl_106_idx, GXutil.ltrim( localUtil.ntoc( Z9509MRMovPre, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9507MRMovDsc_"+sGXsfl_106_idx, GXutil.rtrim( Z9507MRMovDsc)) ;
         httpContext.changePostValue( "ZT_"+"Z9503MRMovOrd_"+sGXsfl_106_idx, GXutil.ltrim( localUtil.ntoc( Z9503MRMovOrd, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9504MRMovFch_"+sGXsfl_106_idx, localUtil.ttoc( Z9504MRMovFch, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z9508MRMovCnt_"+sGXsfl_106_idx, GXutil.ltrim( localUtil.ntoc( Z9508MRMovCnt, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9505MRMovTpo_"+sGXsfl_106_idx, GXutil.ltrim( localUtil.ntoc( Z9505MRMovTpo, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T9508MRMovCnt_"+sGXsfl_106_idx, GXutil.ltrim( localUtil.ntoc( O9508MRMovCnt, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1239_"+sGXsfl_106_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1239, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1239_"+sGXsfl_106_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1239, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1239_"+sGXsfl_106_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1239, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1239 != 0 )
         {
            httpContext.changePostValue( "MRMOV_"+sGXsfl_106_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMRMov_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MRMOVORD_"+sGXsfl_106_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMRMovOrd_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MRMOVFCH_"+sGXsfl_106_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMRMovFch_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MRMOVTPO_"+sGXsfl_106_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( dynMRMovTpo.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MRMOVTPOD_"+sGXsfl_106_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMRMovTpoD_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MRMOVDSC_"+sGXsfl_106_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMRMovDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MRMOVCNT_"+sGXsfl_106_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMRMovCnt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MRMOVPRE_"+sGXsfl_106_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMRMovPre_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll13W1239( ) ;
      if ( AnyError != 0 )
      {
         O9495MRStkAct = s9495MRStkAct ;
         n9495MRStkAct = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9495MRStkAct", GXutil.ltrimstr( A9495MRStkAct, 10, 3));
         O9500MRUltMov = s9500MRUltMov ;
         n9500MRUltMov = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9500MRUltMov", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9500MRUltMov), 8, 0));
      }
      nRcdExists_1239 = (short)(0) ;
      nIsMod_1239 = (short)(0) ;
      nRcdDeleted_1239 = (short)(0) ;
   }

   public void processNestedLevel13W1240( )
   {
      s9496MRStkRes = O9496MRStkRes ;
      n9496MRStkRes = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9496MRStkRes", GXutil.ltrimstr( A9496MRStkRes, 10, 3));
      s9501MRUltRes = O9501MRUltRes ;
      n9501MRUltRes = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9501MRUltRes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9501MRUltRes), 10, 0));
      nGXsfl_125_idx = 0 ;
      while ( nGXsfl_125_idx < nRC_GXsfl_125 )
      {
         readRow13W1240( ) ;
         if ( ( nRcdExists_1240 != 0 ) || ( nIsMod_1240 != 0 ) )
         {
            standaloneNotModal13W1240( ) ;
            getKey13W1240( ) ;
            if ( ( nRcdExists_1240 == 0 ) && ( nRcdDeleted_1240 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert13W1240( ) ;
            }
            else
            {
               if ( RcdFound1240 != 0 )
               {
                  if ( ( nRcdDeleted_1240 != 0 ) && ( nRcdExists_1240 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete13W1240( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1240 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update13W1240( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1240 == 0 )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "MRCOD");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtMRCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O9496MRStkRes = A9496MRStkRes ;
            n9496MRStkRes = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9496MRStkRes", GXutil.ltrimstr( A9496MRStkRes, 10, 3));
            O9501MRUltRes = A9501MRUltRes ;
            n9501MRUltRes = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9501MRUltRes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9501MRUltRes), 10, 0));
         }
         httpContext.changePostValue( edtMRRes_Internalname, GXutil.ltrim( localUtil.ntoc( A9510MRRes, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMRResOrd_Internalname, GXutil.ltrim( localUtil.ntoc( A9511MRResOrd, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMRResFch_Internalname, localUtil.ttoc( A9512MRResFch, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( dynMRResTpo.getInternalname(), GXutil.ltrim( localUtil.ntoc( A9513MRResTpo, (byte)(8), (byte)(0), ".", ""))) ;
         httpContext.changePostValue( edtMRResTpoD_Internalname, GXutil.rtrim( A9514MRResTpoD)) ;
         httpContext.changePostValue( edtMRResDsc_Internalname, GXutil.rtrim( A9515MRResDsc)) ;
         httpContext.changePostValue( edtMRResCnt_Internalname, GXutil.ltrim( localUtil.ntoc( A9516MRResCnt, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9510MRRes_"+sGXsfl_125_idx, GXutil.ltrim( localUtil.ntoc( Z9510MRRes, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9515MRResDsc_"+sGXsfl_125_idx, GXutil.rtrim( Z9515MRResDsc)) ;
         httpContext.changePostValue( "ZT_"+"Z9511MRResOrd_"+sGXsfl_125_idx, GXutil.ltrim( localUtil.ntoc( Z9511MRResOrd, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9512MRResFch_"+sGXsfl_125_idx, localUtil.ttoc( Z9512MRResFch, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z9516MRResCnt_"+sGXsfl_125_idx, GXutil.ltrim( localUtil.ntoc( Z9516MRResCnt, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9513MRResTpo_"+sGXsfl_125_idx, GXutil.ltrim( localUtil.ntoc( Z9513MRResTpo, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T9516MRResCnt_"+sGXsfl_125_idx, GXutil.ltrim( localUtil.ntoc( O9516MRResCnt, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1240_"+sGXsfl_125_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1240, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1240_"+sGXsfl_125_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1240, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1240_"+sGXsfl_125_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1240, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1240 != 0 )
         {
            httpContext.changePostValue( "MRRES_"+sGXsfl_125_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMRRes_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MRRESORD_"+sGXsfl_125_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMRResOrd_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MRRESFCH_"+sGXsfl_125_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMRResFch_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MRRESTPO_"+sGXsfl_125_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( dynMRResTpo.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MRRESTPOD_"+sGXsfl_125_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMRResTpoD_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MRRESDSC_"+sGXsfl_125_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMRResDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MRRESCNT_"+sGXsfl_125_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMRResCnt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll13W1240( ) ;
      if ( AnyError != 0 )
      {
         O9496MRStkRes = s9496MRStkRes ;
         n9496MRStkRes = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9496MRStkRes", GXutil.ltrimstr( A9496MRStkRes, 10, 3));
         O9501MRUltRes = s9501MRUltRes ;
         n9501MRUltRes = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9501MRUltRes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9501MRUltRes), 10, 0));
      }
      nRcdExists_1240 = (short)(0) ;
      nIsMod_1240 = (short)(0) ;
      nRcdDeleted_1240 = (short)(0) ;
   }

   public void processLevel13W1238( )
   {
      /* Save parent mode. */
      sMode1238 = Gx_mode ;
      processNestedLevel13W1473( ) ;
      processNestedLevel13W1239( ) ;
      processNestedLevel13W1240( ) ;
      if ( AnyError != 0 )
      {
         O9495MRStkAct = s9495MRStkAct ;
         n9495MRStkAct = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9495MRStkAct", GXutil.ltrimstr( A9495MRStkAct, 10, 3));
         O9500MRUltMov = s9500MRUltMov ;
         n9500MRUltMov = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9500MRUltMov", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9500MRUltMov), 8, 0));
         O9496MRStkRes = s9496MRStkRes ;
         n9496MRStkRes = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9496MRStkRes", GXutil.ltrimstr( A9496MRStkRes, 10, 3));
         O9501MRUltRes = s9501MRUltRes ;
         n9501MRUltRes = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9501MRUltRes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9501MRUltRes), 10, 0));
      }
      /* Restore parent mode. */
      Gx_mode = sMode1238 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
      /* Using cursor T013W32 */
      pr_default.execute(30, new Object[] {Boolean.valueOf(n9501MRUltRes), Long.valueOf(A9501MRUltRes), Boolean.valueOf(n9496MRStkRes), A9496MRStkRes, Boolean.valueOf(n9500MRUltMov), Integer.valueOf(A9500MRUltMov), Boolean.valueOf(n9495MRStkAct), A9495MRStkAct, A396EmprCod, Integer.valueOf(A9492MRCod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMREPUE");
   }

   public void endLevel13W1238( )
   {
      pr_default.close(9);
      if ( AnyError == 0 )
      {
         beforeComplete13W1238( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "mantenimientomaquina.tmrepue");
         if ( AnyError == 0 )
         {
            confirmValues13W0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "mantenimientomaquina.tmrepue");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart13W1238( )
   {
      /* Scan By routine */
      /* Using cursor T013W33 */
      pr_default.execute(31);
      RcdFound1238 = (short)(0) ;
      if ( (pr_default.getStatus(31) != 101) )
      {
         RcdFound1238 = (short)(1) ;
         A396EmprCod = T013W33_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A9492MRCod = T013W33_A9492MRCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9492MRCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9492MRCod), 8, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext13W1238( )
   {
      /* Scan next routine */
      pr_default.readNext(31);
      RcdFound1238 = (short)(0) ;
      if ( (pr_default.getStatus(31) != 101) )
      {
         RcdFound1238 = (short)(1) ;
         A396EmprCod = T013W33_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A9492MRCod = T013W33_A9492MRCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9492MRCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9492MRCod), 8, 0));
      }
   }

   public void scanEnd13W1238( )
   {
      pr_default.close(31);
   }

   public void afterConfirm13W1238( )
   {
      /* After Confirm Rules */
      if ( isIns( )  && true /* After */ && ! ( ! (0==AV16Artextil) || ! (0==AV17NumManual) ) )
      {
         GXt_int12 = A9492MRCod ;
         GXv_int13[0] = GXt_int12 ;
         new app.pnumdoc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "MNTREP", ""), ""), GXv_int13) ;
         tmrepue_impl.this.GXt_int12 = GXv_int13[0] ;
         A9492MRCod = GXt_int12 ;
         httpContext.ajax_rsp_assign_attri("", false, "A9492MRCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9492MRCod), 8, 0));
      }
   }

   public void beforeInsert13W1238( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate13W1238( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete13W1238( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete13W1238( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate13W1238( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes13W1238( )
   {
      edtMRCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMRCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRCod_Enabled), 5, 0), true);
      edtMRNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMRNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRNom_Enabled), 5, 0), true);
      chkMRActivo.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkMRActivo.getInternalname(), "Enabled", GXutil.ltrimstr( chkMRActivo.getEnabled(), 5, 0), true);
      edtMRCodExt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMRCodExt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRCodExt_Enabled), 5, 0), true);
      edtMRCodPrv_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMRCodPrv_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRCodPrv_Enabled), 5, 0), true);
      edtMRLote_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMRLote_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRLote_Enabled), 5, 0), true);
      edtMRStkPre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMRStkPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRStkPre_Enabled), 5, 0), true);
      edtMRStkMin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMRStkMin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRStkMin_Enabled), 5, 0), true);
      edtMRStkCri_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMRStkCri_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRStkCri_Enabled), 5, 0), true);
      edtMRStkAct_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMRStkAct_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRStkAct_Enabled), 5, 0), true);
      edtMRStkRes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMRStkRes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRStkRes_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      edtMRUltMov_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMRUltMov_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRUltMov_Enabled), 5, 0), true);
      edtMRUltRes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMRUltRes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRUltRes_Enabled), 5, 0), true);
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
   }

   public void zm13W1473( int GX_JID )
   {
      if ( ( GX_JID == 42 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z11056MRPrvHab = T013W9_A11056MRPrvHab[0] ;
         }
         else
         {
            Z11056MRPrvHab = A11056MRPrvHab ;
         }
      }
      if ( GX_JID == -42 )
      {
         Z9492MRCod = A9492MRCod ;
         Z11056MRPrvHab = A11056MRPrvHab ;
         Z396EmprCod = A396EmprCod ;
         Z795PrvNum = A795PrvNum ;
         Z794PrvNom = A794PrvNom ;
      }
   }

   public void standaloneNotModal13W1473( )
   {
      edtPrvNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrvNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvNom_Enabled), 5, 0), !bGXsfl_92_Refreshing);
   }

   public void standaloneModal13W1473( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtPrvNum_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtPrvNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvNum_Enabled), 5, 0), !bGXsfl_92_Refreshing);
      }
      else
      {
         edtPrvNum_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtPrvNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvNum_Enabled), 5, 0), !bGXsfl_92_Refreshing);
      }
   }

   public void load13W1473( )
   {
      /* Using cursor T013W34 */
      pr_default.execute(32, new Object[] {A396EmprCod, Integer.valueOf(A9492MRCod), Integer.valueOf(A795PrvNum)});
      if ( (pr_default.getStatus(32) != 101) )
      {
         RcdFound1473 = (short)(1) ;
         A794PrvNom = T013W34_A794PrvNom[0] ;
         n794PrvNom = T013W34_n794PrvNom[0] ;
         A11056MRPrvHab = T013W34_A11056MRPrvHab[0] ;
         zm13W1473( -42) ;
      }
      pr_default.close(32);
      onLoadActions13W1473( ) ;
   }

   public void onLoadActions13W1473( )
   {
   }

   public void checkExtendedTable13W1473( )
   {
      nIsDirty_1473 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal13W1473( ) ;
      /* Using cursor T013W10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A795PrvNum)});
      if ( (pr_default.getStatus(8) == 101) )
      {
         GXCCtl = "PRVNUM_" + sGXsfl_92_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRVGEN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrvNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A794PrvNom = T013W10_A794PrvNom[0] ;
      n794PrvNom = T013W10_n794PrvNom[0] ;
      pr_default.close(8);
   }

   public void closeExtendedTableCursors13W1473( )
   {
      pr_default.close(8);
   }

   public void enableDisable13W1473( )
   {
   }

   public void gxload_43( String A396EmprCod ,
                          int A795PrvNum )
   {
      /* Using cursor T013W35 */
      pr_default.execute(33, new Object[] {A396EmprCod, Integer.valueOf(A795PrvNum)});
      if ( (pr_default.getStatus(33) == 101) )
      {
         GXCCtl = "PRVNUM_" + sGXsfl_92_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRVGEN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrvNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A794PrvNom = T013W35_A794PrvNom[0] ;
      n794PrvNom = T013W35_n794PrvNom[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A794PrvNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(33) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(33);
   }

   public void getKey13W1473( )
   {
      /* Using cursor T013W36 */
      pr_default.execute(34, new Object[] {A396EmprCod, Integer.valueOf(A9492MRCod), Integer.valueOf(A795PrvNum)});
      if ( (pr_default.getStatus(34) != 101) )
      {
         RcdFound1473 = (short)(1) ;
      }
      else
      {
         RcdFound1473 = (short)(0) ;
      }
      pr_default.close(34);
   }

   public void getByPrimaryKey13W1473( )
   {
      /* Using cursor T013W9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A9492MRCod), Integer.valueOf(A795PrvNum)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         zm13W1473( 42) ;
         RcdFound1473 = (short)(1) ;
         initializeNonKey13W1473( ) ;
         A11056MRPrvHab = T013W9_A11056MRPrvHab[0] ;
         A795PrvNum = T013W9_A795PrvNum[0] ;
         Z396EmprCod = A396EmprCod ;
         Z9492MRCod = A9492MRCod ;
         Z795PrvNum = A795PrvNum ;
         sMode1473 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load13W1473( ) ;
         Gx_mode = sMode1473 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1473 = (short)(0) ;
         initializeNonKey13W1473( ) ;
         sMode1473 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal13W1473( ) ;
         Gx_mode = sMode1473 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes13W1473( ) ;
      }
      pr_default.close(7);
   }

   public void checkOptimisticConcurrency13W1473( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T013W8 */
         pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A9492MRCod), Integer.valueOf(A795PrvNum)});
         if ( (pr_default.getStatus(6) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMRepu1"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(6) == 101) || ( Z11056MRPrvHab != T013W8_A11056MRPrvHab[0] ) )
         {
            if ( Z11056MRPrvHab != T013W8_A11056MRPrvHab[0] )
            {
               GXutil.writeLogln("mantenimientomaquina.tmrepue:[seudo value changed for attri]"+"MRPrvHab");
               GXutil.writeLogRaw("Old: ",Z11056MRPrvHab);
               GXutil.writeLogRaw("Current: ",T013W8_A11056MRPrvHab[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPMRepu1"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert13W1473( )
   {
      beforeValidate13W1473( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable13W1473( ) ;
      }
      if ( AnyError == 0 )
      {
         zm13W1473( 0) ;
         checkOptimisticConcurrency13W1473( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm13W1473( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert13W1473( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T013W37 */
                  pr_default.execute(35, new Object[] {Integer.valueOf(A9492MRCod), Byte.valueOf(A11056MRPrvHab), A396EmprCod, Integer.valueOf(A795PrvNum)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMRepu1");
                  if ( (pr_default.getStatus(35) == 1) )
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
            load13W1473( ) ;
         }
         endLevel13W1473( ) ;
      }
      closeExtendedTableCursors13W1473( ) ;
   }

   public void update13W1473( )
   {
      beforeValidate13W1473( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable13W1473( ) ;
      }
      if ( ( nIsMod_1473 != 0 ) || ( nIsDirty_1473 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency13W1473( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm13W1473( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate13W1473( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T013W38 */
                     pr_default.execute(36, new Object[] {Byte.valueOf(A11056MRPrvHab), A396EmprCod, Integer.valueOf(A9492MRCod), Integer.valueOf(A795PrvNum)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMRepu1");
                     if ( (pr_default.getStatus(36) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMRepu1"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate13W1473( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey13W1473( ) ;
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
            endLevel13W1473( ) ;
         }
      }
      closeExtendedTableCursors13W1473( ) ;
   }

   public void deferredUpdate13W1473( )
   {
   }

   public void delete13W1473( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate13W1473( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency13W1473( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls13W1473( ) ;
         afterConfirm13W1473( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete13W1473( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T013W39 */
               pr_default.execute(37, new Object[] {A396EmprCod, Integer.valueOf(A9492MRCod), Integer.valueOf(A795PrvNum)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMRepu1");
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
      sMode1473 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel13W1473( ) ;
      Gx_mode = sMode1473 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls13W1473( )
   {
      standaloneModal13W1473( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T013W40 */
         pr_default.execute(38, new Object[] {A396EmprCod, Integer.valueOf(A795PrvNum)});
         A794PrvNom = T013W40_A794PrvNom[0] ;
         n794PrvNom = T013W40_n794PrvNom[0] ;
         pr_default.close(38);
      }
   }

   public void endLevel13W1473( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(6);
      }
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart13W1473( )
   {
      /* Scan By routine */
      /* Using cursor T013W41 */
      pr_default.execute(39, new Object[] {A396EmprCod, Integer.valueOf(A9492MRCod)});
      RcdFound1473 = (short)(0) ;
      if ( (pr_default.getStatus(39) != 101) )
      {
         RcdFound1473 = (short)(1) ;
         A795PrvNum = T013W41_A795PrvNum[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext13W1473( )
   {
      /* Scan next routine */
      pr_default.readNext(39);
      RcdFound1473 = (short)(0) ;
      if ( (pr_default.getStatus(39) != 101) )
      {
         RcdFound1473 = (short)(1) ;
         A795PrvNum = T013W41_A795PrvNum[0] ;
      }
   }

   public void scanEnd13W1473( )
   {
      pr_default.close(39);
   }

   public void afterConfirm13W1473( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert13W1473( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate13W1473( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete13W1473( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete13W1473( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate13W1473( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes13W1473( )
   {
      edtPrvNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrvNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvNum_Enabled), 5, 0), !bGXsfl_92_Refreshing);
      edtPrvNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrvNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvNom_Enabled), 5, 0), !bGXsfl_92_Refreshing);
      chkMRPrvHab.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkMRPrvHab.getInternalname(), "Enabled", GXutil.ltrimstr( chkMRPrvHab.getEnabled(), 5, 0), !bGXsfl_92_Refreshing);
   }

   public void send_integrity_lvl_hashes13W1473( )
   {
   }

   public void zm13W1239( int GX_JID )
   {
      if ( ( GX_JID == 44 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z9509MRMovPre = T013W6_A9509MRMovPre[0] ;
            Z9507MRMovDsc = T013W6_A9507MRMovDsc[0] ;
            Z9503MRMovOrd = T013W6_A9503MRMovOrd[0] ;
            Z9504MRMovFch = T013W6_A9504MRMovFch[0] ;
            Z9508MRMovCnt = T013W6_A9508MRMovCnt[0] ;
            Z9505MRMovTpo = T013W6_A9505MRMovTpo[0] ;
         }
         else
         {
            Z9509MRMovPre = A9509MRMovPre ;
            Z9507MRMovDsc = A9507MRMovDsc ;
            Z9503MRMovOrd = A9503MRMovOrd ;
            Z9504MRMovFch = A9504MRMovFch ;
            Z9508MRMovCnt = A9508MRMovCnt ;
            Z9505MRMovTpo = A9505MRMovTpo ;
         }
      }
      if ( GX_JID == -44 )
      {
         Z9492MRCod = A9492MRCod ;
         Z9502MRMov = A9502MRMov ;
         Z9509MRMovPre = A9509MRMovPre ;
         Z9507MRMovDsc = A9507MRMovDsc ;
         Z9503MRMovOrd = A9503MRMovOrd ;
         Z9504MRMovFch = A9504MRMovFch ;
         Z9508MRMovCnt = A9508MRMovCnt ;
         Z396EmprCod = A396EmprCod ;
         Z9505MRMovTpo = A9505MRMovTpo ;
         Z9506MRMovTpoD = A9506MRMovTpoD ;
      }
   }

   public void standaloneNotModal13W1239( )
   {
      edtMRMov_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMRMov_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRMov_Enabled), 5, 0), !bGXsfl_106_Refreshing);
      edtMRMovPre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMRMovPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRMovPre_Enabled), 5, 0), !bGXsfl_106_Refreshing);
      edtMRMovTpoD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMRMovTpoD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRMovTpoD_Enabled), 5, 0), !bGXsfl_106_Refreshing);
      edtMRUltMov_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMRUltMov_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRUltMov_Enabled), 5, 0), true);
      edtMRStkAct_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMRStkAct_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRStkAct_Enabled), 5, 0), true);
      edtMRUltMov_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMRUltMov_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRUltMov_Enabled), 5, 0), true);
      edtMRStkAct_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMRStkAct_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRStkAct_Enabled), 5, 0), true);
      gxamrmovtpo_html13W1239( A396EmprCod) ;
   }

   public void standaloneModal13W1239( )
   {
      if ( isIns( )  )
      {
         A9500MRUltMov = (int)(O9500MRUltMov+1) ;
         n9500MRUltMov = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9500MRUltMov", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9500MRUltMov), 8, 0));
      }
      if ( isIns( )  && ( Gx_BScreen == 1 ) )
      {
         A9502MRMov = A9500MRUltMov ;
      }
      if ( isIns( )  && (DecimalUtil.compareTo(DecimalUtil.ZERO, A9509MRMovPre)==0) && ( Gx_BScreen == 0 ) )
      {
         A9509MRMovPre = A9499MRStkPre ;
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ( Gx_BScreen == 0 ) )
      {
         /* Using cursor T013W7 */
         pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A9505MRMovTpo)});
         A9506MRMovTpoD = T013W7_A9506MRMovTpoD[0] ;
         n9506MRMovTpoD = T013W7_n9506MRMovTpoD[0] ;
         pr_default.close(5);
      }
   }

   public void load13W1239( )
   {
      /* Using cursor T013W42 */
      pr_default.execute(40, new Object[] {A396EmprCod, Integer.valueOf(A9492MRCod), Long.valueOf(A9502MRMov)});
      if ( (pr_default.getStatus(40) != 101) )
      {
         RcdFound1239 = (short)(1) ;
         A9509MRMovPre = T013W42_A9509MRMovPre[0] ;
         A9507MRMovDsc = T013W42_A9507MRMovDsc[0] ;
         A9503MRMovOrd = T013W42_A9503MRMovOrd[0] ;
         A9504MRMovFch = T013W42_A9504MRMovFch[0] ;
         A9506MRMovTpoD = T013W42_A9506MRMovTpoD[0] ;
         n9506MRMovTpoD = T013W42_n9506MRMovTpoD[0] ;
         A9508MRMovCnt = T013W42_A9508MRMovCnt[0] ;
         A9505MRMovTpo = T013W42_A9505MRMovTpo[0] ;
         zm13W1239( -44) ;
      }
      pr_default.close(40);
      onLoadActions13W1239( ) ;
   }

   public void onLoadActions13W1239( )
   {
      if ( isIns( )  && (GXutil.strcmp("", A9507MRMovDsc)==0) && ( Gx_BScreen == 0 ) )
      {
         A9507MRMovDsc = A9506MRMovTpoD ;
      }
      if ( isDlt( )  )
      {
         A9495MRStkAct = O9495MRStkAct.subtract(O9508MRMovCnt) ;
         n9495MRStkAct = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9495MRStkAct", GXutil.ltrimstr( A9495MRStkAct, 10, 3));
      }
      else
      {
         if ( isIns( )  || isUpd( )  || isDlt( )  )
         {
            A9495MRStkAct = O9495MRStkAct.add(A9508MRMovCnt).subtract(O9508MRMovCnt) ;
            n9495MRStkAct = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9495MRStkAct", GXutil.ltrimstr( A9495MRStkAct, 10, 3));
         }
      }
   }

   public void checkExtendedTable13W1239( )
   {
      nIsDirty_1239 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal13W1239( ) ;
      /* Using cursor T013W7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A9505MRMovTpo)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         GXCCtl = "MRMOVTPO_" + sGXsfl_106_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MOMovTpo", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = dynMRMovTpo.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A9506MRMovTpoD = T013W7_A9506MRMovTpoD[0] ;
      n9506MRMovTpoD = T013W7_n9506MRMovTpoD[0] ;
      pr_default.close(5);
      if ( isIns( )  && (GXutil.strcmp("", A9507MRMovDsc)==0) && ( Gx_BScreen == 0 ) )
      {
         nIsDirty_1239 = (short)(1) ;
         A9507MRMovDsc = A9506MRMovTpoD ;
      }
      if ( isDlt( )  )
      {
         nIsDirty_1239 = (short)(1) ;
         A9495MRStkAct = O9495MRStkAct.subtract(O9508MRMovCnt) ;
         n9495MRStkAct = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9495MRStkAct", GXutil.ltrimstr( A9495MRStkAct, 10, 3));
      }
      else
      {
         if ( isIns( )  || isUpd( )  || isDlt( )  )
         {
            nIsDirty_1239 = (short)(1) ;
            A9495MRStkAct = O9495MRStkAct.add(A9508MRMovCnt).subtract(O9508MRMovCnt) ;
            n9495MRStkAct = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9495MRStkAct", GXutil.ltrimstr( A9495MRStkAct, 10, 3));
         }
      }
   }

   public void closeExtendedTableCursors13W1239( )
   {
      pr_default.close(5);
   }

   public void enableDisable13W1239( )
   {
   }

   public void gxload_45( String A396EmprCod ,
                          int A9505MRMovTpo )
   {
      /* Using cursor T013W43 */
      pr_default.execute(41, new Object[] {A396EmprCod, Integer.valueOf(A9505MRMovTpo)});
      if ( (pr_default.getStatus(41) == 101) )
      {
         GXCCtl = "MRMOVTPO_" + sGXsfl_106_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MOMovTpo", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = dynMRMovTpo.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A9506MRMovTpoD = T013W43_A9506MRMovTpoD[0] ;
      n9506MRMovTpoD = T013W43_n9506MRMovTpoD[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A9506MRMovTpoD))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(41) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(41);
   }

   public void getKey13W1239( )
   {
      /* Using cursor T013W44 */
      pr_default.execute(42, new Object[] {A396EmprCod, Integer.valueOf(A9492MRCod), Long.valueOf(A9502MRMov)});
      if ( (pr_default.getStatus(42) != 101) )
      {
         RcdFound1239 = (short)(1) ;
      }
      else
      {
         RcdFound1239 = (short)(0) ;
      }
      pr_default.close(42);
   }

   public void getByPrimaryKey13W1239( )
   {
      /* Using cursor T013W6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A9492MRCod), Long.valueOf(A9502MRMov)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         zm13W1239( 44) ;
         RcdFound1239 = (short)(1) ;
         initializeNonKey13W1239( ) ;
         A9502MRMov = T013W6_A9502MRMov[0] ;
         A9509MRMovPre = T013W6_A9509MRMovPre[0] ;
         A9507MRMovDsc = T013W6_A9507MRMovDsc[0] ;
         A9503MRMovOrd = T013W6_A9503MRMovOrd[0] ;
         A9504MRMovFch = T013W6_A9504MRMovFch[0] ;
         A9508MRMovCnt = T013W6_A9508MRMovCnt[0] ;
         A9505MRMovTpo = T013W6_A9505MRMovTpo[0] ;
         O9508MRMovCnt = A9508MRMovCnt ;
         Z396EmprCod = A396EmprCod ;
         Z9492MRCod = A9492MRCod ;
         Z9502MRMov = A9502MRMov ;
         sMode1239 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load13W1239( ) ;
         Gx_mode = sMode1239 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1239 = (short)(0) ;
         initializeNonKey13W1239( ) ;
         sMode1239 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal13W1239( ) ;
         Gx_mode = sMode1239 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes13W1239( ) ;
      }
      pr_default.close(4);
   }

   public void checkOptimisticConcurrency13W1239( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T013W5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A9492MRCod), Long.valueOf(A9502MRMov)});
         if ( (pr_default.getStatus(3) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMReMov"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(3) == 101) || ( DecimalUtil.compareTo(Z9509MRMovPre, T013W5_A9509MRMovPre[0]) != 0 ) || ( GXutil.strcmp(Z9507MRMovDsc, T013W5_A9507MRMovDsc[0]) != 0 ) || ( Z9503MRMovOrd != T013W5_A9503MRMovOrd[0] ) || !( GXutil.dateCompare(Z9504MRMovFch, T013W5_A9504MRMovFch[0]) ) || ( DecimalUtil.compareTo(Z9508MRMovCnt, T013W5_A9508MRMovCnt[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z9505MRMovTpo != T013W5_A9505MRMovTpo[0] ) )
         {
            if ( DecimalUtil.compareTo(Z9509MRMovPre, T013W5_A9509MRMovPre[0]) != 0 )
            {
               GXutil.writeLogln("mantenimientomaquina.tmrepue:[seudo value changed for attri]"+"MRMovPre");
               GXutil.writeLogRaw("Old: ",Z9509MRMovPre);
               GXutil.writeLogRaw("Current: ",T013W5_A9509MRMovPre[0]);
            }
            if ( GXutil.strcmp(Z9507MRMovDsc, T013W5_A9507MRMovDsc[0]) != 0 )
            {
               GXutil.writeLogln("mantenimientomaquina.tmrepue:[seudo value changed for attri]"+"MRMovDsc");
               GXutil.writeLogRaw("Old: ",Z9507MRMovDsc);
               GXutil.writeLogRaw("Current: ",T013W5_A9507MRMovDsc[0]);
            }
            if ( Z9503MRMovOrd != T013W5_A9503MRMovOrd[0] )
            {
               GXutil.writeLogln("mantenimientomaquina.tmrepue:[seudo value changed for attri]"+"MRMovOrd");
               GXutil.writeLogRaw("Old: ",Z9503MRMovOrd);
               GXutil.writeLogRaw("Current: ",T013W5_A9503MRMovOrd[0]);
            }
            if ( !( GXutil.dateCompare(Z9504MRMovFch, T013W5_A9504MRMovFch[0]) ) )
            {
               GXutil.writeLogln("mantenimientomaquina.tmrepue:[seudo value changed for attri]"+"MRMovFch");
               GXutil.writeLogRaw("Old: ",Z9504MRMovFch);
               GXutil.writeLogRaw("Current: ",T013W5_A9504MRMovFch[0]);
            }
            if ( DecimalUtil.compareTo(Z9508MRMovCnt, T013W5_A9508MRMovCnt[0]) != 0 )
            {
               GXutil.writeLogln("mantenimientomaquina.tmrepue:[seudo value changed for attri]"+"MRMovCnt");
               GXutil.writeLogRaw("Old: ",Z9508MRMovCnt);
               GXutil.writeLogRaw("Current: ",T013W5_A9508MRMovCnt[0]);
            }
            if ( Z9505MRMovTpo != T013W5_A9505MRMovTpo[0] )
            {
               GXutil.writeLogln("mantenimientomaquina.tmrepue:[seudo value changed for attri]"+"MRMovTpo");
               GXutil.writeLogRaw("Old: ",Z9505MRMovTpo);
               GXutil.writeLogRaw("Current: ",T013W5_A9505MRMovTpo[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPMReMov"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert13W1239( )
   {
      beforeValidate13W1239( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable13W1239( ) ;
      }
      if ( AnyError == 0 )
      {
         zm13W1239( 0) ;
         checkOptimisticConcurrency13W1239( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm13W1239( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert13W1239( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T013W45 */
                  pr_default.execute(43, new Object[] {Integer.valueOf(A9492MRCod), Long.valueOf(A9502MRMov), A9509MRMovPre, A9507MRMovDsc, Integer.valueOf(A9503MRMovOrd), A9504MRMovFch, A9508MRMovCnt, A396EmprCod, Integer.valueOf(A9505MRMovTpo)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMReMov");
                  if ( (pr_default.getStatus(43) == 1) )
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
            load13W1239( ) ;
         }
         endLevel13W1239( ) ;
      }
      closeExtendedTableCursors13W1239( ) ;
   }

   public void update13W1239( )
   {
      beforeValidate13W1239( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable13W1239( ) ;
      }
      if ( ( nIsMod_1239 != 0 ) || ( nIsDirty_1239 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency13W1239( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm13W1239( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate13W1239( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T013W46 */
                     pr_default.execute(44, new Object[] {A9509MRMovPre, A9507MRMovDsc, Integer.valueOf(A9503MRMovOrd), A9504MRMovFch, A9508MRMovCnt, Integer.valueOf(A9505MRMovTpo), A396EmprCod, Integer.valueOf(A9492MRCod), Long.valueOf(A9502MRMov)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMReMov");
                     if ( (pr_default.getStatus(44) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMReMov"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate13W1239( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey13W1239( ) ;
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
            endLevel13W1239( ) ;
         }
      }
      closeExtendedTableCursors13W1239( ) ;
   }

   public void deferredUpdate13W1239( )
   {
   }

   public void delete13W1239( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate13W1239( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency13W1239( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls13W1239( ) ;
         afterConfirm13W1239( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete13W1239( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T013W47 */
               pr_default.execute(45, new Object[] {A396EmprCod, Integer.valueOf(A9492MRCod), Long.valueOf(A9502MRMov)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMReMov");
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
      sMode1239 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel13W1239( ) ;
      Gx_mode = sMode1239 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls13W1239( )
   {
      standaloneModal13W1239( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T013W48 */
         pr_default.execute(46, new Object[] {A396EmprCod, Integer.valueOf(A9505MRMovTpo)});
         A9506MRMovTpoD = T013W48_A9506MRMovTpoD[0] ;
         n9506MRMovTpoD = T013W48_n9506MRMovTpoD[0] ;
         pr_default.close(46);
         if ( isDlt( )  )
         {
            A9495MRStkAct = O9495MRStkAct.subtract(O9508MRMovCnt) ;
            n9495MRStkAct = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9495MRStkAct", GXutil.ltrimstr( A9495MRStkAct, 10, 3));
         }
         else
         {
            if ( isIns( )  || isUpd( )  || isDlt( )  )
            {
               A9495MRStkAct = O9495MRStkAct.add(A9508MRMovCnt).subtract(O9508MRMovCnt) ;
               n9495MRStkAct = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9495MRStkAct", GXutil.ltrimstr( A9495MRStkAct, 10, 3));
            }
         }
      }
   }

   public void endLevel13W1239( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(3);
      }
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart13W1239( )
   {
      /* Scan By routine */
      /* Using cursor T013W49 */
      pr_default.execute(47, new Object[] {A396EmprCod, Integer.valueOf(A9492MRCod)});
      RcdFound1239 = (short)(0) ;
      if ( (pr_default.getStatus(47) != 101) )
      {
         RcdFound1239 = (short)(1) ;
         A9502MRMov = T013W49_A9502MRMov[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext13W1239( )
   {
      /* Scan next routine */
      pr_default.readNext(47);
      RcdFound1239 = (short)(0) ;
      if ( (pr_default.getStatus(47) != 101) )
      {
         RcdFound1239 = (short)(1) ;
         A9502MRMov = T013W49_A9502MRMov[0] ;
      }
   }

   public void scanEnd13W1239( )
   {
      pr_default.close(47);
   }

   public void afterConfirm13W1239( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert13W1239( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate13W1239( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete13W1239( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete13W1239( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate13W1239( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes13W1239( )
   {
      edtMRMov_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMRMov_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRMov_Enabled), 5, 0), !bGXsfl_106_Refreshing);
      edtMRMovOrd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMRMovOrd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRMovOrd_Enabled), 5, 0), !bGXsfl_106_Refreshing);
      edtMRMovFch_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMRMovFch_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRMovFch_Enabled), 5, 0), !bGXsfl_106_Refreshing);
      dynMRMovTpo.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, dynMRMovTpo.getInternalname(), "Enabled", GXutil.ltrimstr( dynMRMovTpo.getEnabled(), 5, 0), !bGXsfl_106_Refreshing);
      edtMRMovTpoD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMRMovTpoD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRMovTpoD_Enabled), 5, 0), !bGXsfl_106_Refreshing);
      edtMRMovDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMRMovDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRMovDsc_Enabled), 5, 0), !bGXsfl_106_Refreshing);
      edtMRMovCnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMRMovCnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRMovCnt_Enabled), 5, 0), !bGXsfl_106_Refreshing);
      edtMRMovPre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMRMovPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRMovPre_Enabled), 5, 0), !bGXsfl_106_Refreshing);
   }

   public void send_integrity_lvl_hashes13W1239( )
   {
   }

   public void zm13W1240( int GX_JID )
   {
      if ( ( GX_JID == 46 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z9515MRResDsc = T013W3_A9515MRResDsc[0] ;
            Z9511MRResOrd = T013W3_A9511MRResOrd[0] ;
            Z9512MRResFch = T013W3_A9512MRResFch[0] ;
            Z9516MRResCnt = T013W3_A9516MRResCnt[0] ;
            Z9513MRResTpo = T013W3_A9513MRResTpo[0] ;
         }
         else
         {
            Z9515MRResDsc = A9515MRResDsc ;
            Z9511MRResOrd = A9511MRResOrd ;
            Z9512MRResFch = A9512MRResFch ;
            Z9516MRResCnt = A9516MRResCnt ;
            Z9513MRResTpo = A9513MRResTpo ;
         }
      }
      if ( GX_JID == -46 )
      {
         Z9492MRCod = A9492MRCod ;
         Z9510MRRes = A9510MRRes ;
         Z9515MRResDsc = A9515MRResDsc ;
         Z9511MRResOrd = A9511MRResOrd ;
         Z9512MRResFch = A9512MRResFch ;
         Z9516MRResCnt = A9516MRResCnt ;
         Z396EmprCod = A396EmprCod ;
         Z9513MRResTpo = A9513MRResTpo ;
         Z9514MRResTpoD = A9514MRResTpoD ;
      }
   }

   public void standaloneNotModal13W1240( )
   {
      edtMRRes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMRRes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRRes_Enabled), 5, 0), !bGXsfl_125_Refreshing);
      edtMRResTpoD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMRResTpoD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRResTpoD_Enabled), 5, 0), !bGXsfl_125_Refreshing);
      edtMRUltRes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMRUltRes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRUltRes_Enabled), 5, 0), true);
      edtMRStkRes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMRStkRes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRStkRes_Enabled), 5, 0), true);
      edtMRUltRes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMRUltRes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRUltRes_Enabled), 5, 0), true);
      edtMRStkRes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMRStkRes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRStkRes_Enabled), 5, 0), true);
      gxamrrestpo_html13W1240( A396EmprCod) ;
   }

   public void standaloneModal13W1240( )
   {
      if ( isIns( )  )
      {
         A9501MRUltRes = (long)(O9501MRUltRes+1) ;
         n9501MRUltRes = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9501MRUltRes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9501MRUltRes), 10, 0));
      }
      if ( isIns( )  && ( Gx_BScreen == 1 ) )
      {
         A9510MRRes = A9501MRUltRes ;
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ( Gx_BScreen == 0 ) )
      {
         /* Using cursor T013W4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A9513MRResTpo)});
         A9514MRResTpoD = T013W4_A9514MRResTpoD[0] ;
         n9514MRResTpoD = T013W4_n9514MRResTpoD[0] ;
         pr_default.close(2);
      }
   }

   public void load13W1240( )
   {
      /* Using cursor T013W50 */
      pr_default.execute(48, new Object[] {A396EmprCod, Integer.valueOf(A9492MRCod), Long.valueOf(A9510MRRes)});
      if ( (pr_default.getStatus(48) != 101) )
      {
         RcdFound1240 = (short)(1) ;
         A9515MRResDsc = T013W50_A9515MRResDsc[0] ;
         A9511MRResOrd = T013W50_A9511MRResOrd[0] ;
         A9512MRResFch = T013W50_A9512MRResFch[0] ;
         A9514MRResTpoD = T013W50_A9514MRResTpoD[0] ;
         n9514MRResTpoD = T013W50_n9514MRResTpoD[0] ;
         A9516MRResCnt = T013W50_A9516MRResCnt[0] ;
         A9513MRResTpo = T013W50_A9513MRResTpo[0] ;
         zm13W1240( -46) ;
      }
      pr_default.close(48);
      onLoadActions13W1240( ) ;
   }

   public void onLoadActions13W1240( )
   {
      if ( isIns( )  && (GXutil.strcmp("", A9515MRResDsc)==0) && ( Gx_BScreen == 0 ) )
      {
         A9515MRResDsc = A9514MRResTpoD ;
      }
      if ( isDlt( )  )
      {
         A9496MRStkRes = O9496MRStkRes.subtract(O9516MRResCnt) ;
         n9496MRStkRes = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9496MRStkRes", GXutil.ltrimstr( A9496MRStkRes, 10, 3));
      }
      else
      {
         if ( isIns( )  || isUpd( )  || isDlt( )  )
         {
            A9496MRStkRes = O9496MRStkRes.add(A9516MRResCnt).subtract(O9516MRResCnt) ;
            n9496MRStkRes = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9496MRStkRes", GXutil.ltrimstr( A9496MRStkRes, 10, 3));
         }
      }
   }

   public void checkExtendedTable13W1240( )
   {
      nIsDirty_1240 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal13W1240( ) ;
      /* Using cursor T013W4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A9513MRResTpo)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "MRRESTPO_" + sGXsfl_125_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MRResTpo", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = dynMRResTpo.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A9514MRResTpoD = T013W4_A9514MRResTpoD[0] ;
      n9514MRResTpoD = T013W4_n9514MRResTpoD[0] ;
      pr_default.close(2);
      if ( isIns( )  && (GXutil.strcmp("", A9515MRResDsc)==0) && ( Gx_BScreen == 0 ) )
      {
         nIsDirty_1240 = (short)(1) ;
         A9515MRResDsc = A9514MRResTpoD ;
      }
      if ( isDlt( )  )
      {
         nIsDirty_1240 = (short)(1) ;
         A9496MRStkRes = O9496MRStkRes.subtract(O9516MRResCnt) ;
         n9496MRStkRes = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9496MRStkRes", GXutil.ltrimstr( A9496MRStkRes, 10, 3));
      }
      else
      {
         if ( isIns( )  || isUpd( )  || isDlt( )  )
         {
            nIsDirty_1240 = (short)(1) ;
            A9496MRStkRes = O9496MRStkRes.add(A9516MRResCnt).subtract(O9516MRResCnt) ;
            n9496MRStkRes = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9496MRStkRes", GXutil.ltrimstr( A9496MRStkRes, 10, 3));
         }
      }
   }

   public void closeExtendedTableCursors13W1240( )
   {
      pr_default.close(2);
   }

   public void enableDisable13W1240( )
   {
   }

   public void gxload_47( String A396EmprCod ,
                          int A9513MRResTpo )
   {
      /* Using cursor T013W51 */
      pr_default.execute(49, new Object[] {A396EmprCod, Integer.valueOf(A9513MRResTpo)});
      if ( (pr_default.getStatus(49) == 101) )
      {
         GXCCtl = "MRRESTPO_" + sGXsfl_125_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MRResTpo", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = dynMRResTpo.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A9514MRResTpoD = T013W51_A9514MRResTpoD[0] ;
      n9514MRResTpoD = T013W51_n9514MRResTpoD[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A9514MRResTpoD))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(49) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(49);
   }

   public void getKey13W1240( )
   {
      /* Using cursor T013W52 */
      pr_default.execute(50, new Object[] {A396EmprCod, Integer.valueOf(A9492MRCod), Long.valueOf(A9510MRRes)});
      if ( (pr_default.getStatus(50) != 101) )
      {
         RcdFound1240 = (short)(1) ;
      }
      else
      {
         RcdFound1240 = (short)(0) ;
      }
      pr_default.close(50);
   }

   public void getByPrimaryKey13W1240( )
   {
      /* Using cursor T013W3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A9492MRCod), Long.valueOf(A9510MRRes)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm13W1240( 46) ;
         RcdFound1240 = (short)(1) ;
         initializeNonKey13W1240( ) ;
         A9510MRRes = T013W3_A9510MRRes[0] ;
         A9515MRResDsc = T013W3_A9515MRResDsc[0] ;
         A9511MRResOrd = T013W3_A9511MRResOrd[0] ;
         A9512MRResFch = T013W3_A9512MRResFch[0] ;
         A9516MRResCnt = T013W3_A9516MRResCnt[0] ;
         A9513MRResTpo = T013W3_A9513MRResTpo[0] ;
         O9516MRResCnt = A9516MRResCnt ;
         Z396EmprCod = A396EmprCod ;
         Z9492MRCod = A9492MRCod ;
         Z9510MRRes = A9510MRRes ;
         sMode1240 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load13W1240( ) ;
         Gx_mode = sMode1240 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1240 = (short)(0) ;
         initializeNonKey13W1240( ) ;
         sMode1240 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal13W1240( ) ;
         Gx_mode = sMode1240 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes13W1240( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency13W1240( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T013W2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A9492MRCod), Long.valueOf(A9510MRRes)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMReRes"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z9515MRResDsc, T013W2_A9515MRResDsc[0]) != 0 ) || ( Z9511MRResOrd != T013W2_A9511MRResOrd[0] ) || !( GXutil.dateCompare(Z9512MRResFch, T013W2_A9512MRResFch[0]) ) || ( DecimalUtil.compareTo(Z9516MRResCnt, T013W2_A9516MRResCnt[0]) != 0 ) || ( Z9513MRResTpo != T013W2_A9513MRResTpo[0] ) )
         {
            if ( GXutil.strcmp(Z9515MRResDsc, T013W2_A9515MRResDsc[0]) != 0 )
            {
               GXutil.writeLogln("mantenimientomaquina.tmrepue:[seudo value changed for attri]"+"MRResDsc");
               GXutil.writeLogRaw("Old: ",Z9515MRResDsc);
               GXutil.writeLogRaw("Current: ",T013W2_A9515MRResDsc[0]);
            }
            if ( Z9511MRResOrd != T013W2_A9511MRResOrd[0] )
            {
               GXutil.writeLogln("mantenimientomaquina.tmrepue:[seudo value changed for attri]"+"MRResOrd");
               GXutil.writeLogRaw("Old: ",Z9511MRResOrd);
               GXutil.writeLogRaw("Current: ",T013W2_A9511MRResOrd[0]);
            }
            if ( !( GXutil.dateCompare(Z9512MRResFch, T013W2_A9512MRResFch[0]) ) )
            {
               GXutil.writeLogln("mantenimientomaquina.tmrepue:[seudo value changed for attri]"+"MRResFch");
               GXutil.writeLogRaw("Old: ",Z9512MRResFch);
               GXutil.writeLogRaw("Current: ",T013W2_A9512MRResFch[0]);
            }
            if ( DecimalUtil.compareTo(Z9516MRResCnt, T013W2_A9516MRResCnt[0]) != 0 )
            {
               GXutil.writeLogln("mantenimientomaquina.tmrepue:[seudo value changed for attri]"+"MRResCnt");
               GXutil.writeLogRaw("Old: ",Z9516MRResCnt);
               GXutil.writeLogRaw("Current: ",T013W2_A9516MRResCnt[0]);
            }
            if ( Z9513MRResTpo != T013W2_A9513MRResTpo[0] )
            {
               GXutil.writeLogln("mantenimientomaquina.tmrepue:[seudo value changed for attri]"+"MRResTpo");
               GXutil.writeLogRaw("Old: ",Z9513MRResTpo);
               GXutil.writeLogRaw("Current: ",T013W2_A9513MRResTpo[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPMReRes"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert13W1240( )
   {
      beforeValidate13W1240( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable13W1240( ) ;
      }
      if ( AnyError == 0 )
      {
         zm13W1240( 0) ;
         checkOptimisticConcurrency13W1240( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm13W1240( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert13W1240( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T013W53 */
                  pr_default.execute(51, new Object[] {Integer.valueOf(A9492MRCod), Long.valueOf(A9510MRRes), A9515MRResDsc, Integer.valueOf(A9511MRResOrd), A9512MRResFch, A9516MRResCnt, A396EmprCod, Integer.valueOf(A9513MRResTpo)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMReRes");
                  if ( (pr_default.getStatus(51) == 1) )
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
            load13W1240( ) ;
         }
         endLevel13W1240( ) ;
      }
      closeExtendedTableCursors13W1240( ) ;
   }

   public void update13W1240( )
   {
      beforeValidate13W1240( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable13W1240( ) ;
      }
      if ( ( nIsMod_1240 != 0 ) || ( nIsDirty_1240 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency13W1240( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm13W1240( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate13W1240( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T013W54 */
                     pr_default.execute(52, new Object[] {A9515MRResDsc, Integer.valueOf(A9511MRResOrd), A9512MRResFch, A9516MRResCnt, Integer.valueOf(A9513MRResTpo), A396EmprCod, Integer.valueOf(A9492MRCod), Long.valueOf(A9510MRRes)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMReRes");
                     if ( (pr_default.getStatus(52) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMReRes"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate13W1240( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey13W1240( ) ;
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
            endLevel13W1240( ) ;
         }
      }
      closeExtendedTableCursors13W1240( ) ;
   }

   public void deferredUpdate13W1240( )
   {
   }

   public void delete13W1240( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate13W1240( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency13W1240( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls13W1240( ) ;
         afterConfirm13W1240( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete13W1240( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T013W55 */
               pr_default.execute(53, new Object[] {A396EmprCod, Integer.valueOf(A9492MRCod), Long.valueOf(A9510MRRes)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMReRes");
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
      sMode1240 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel13W1240( ) ;
      Gx_mode = sMode1240 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls13W1240( )
   {
      standaloneModal13W1240( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T013W56 */
         pr_default.execute(54, new Object[] {A396EmprCod, Integer.valueOf(A9513MRResTpo)});
         A9514MRResTpoD = T013W56_A9514MRResTpoD[0] ;
         n9514MRResTpoD = T013W56_n9514MRResTpoD[0] ;
         pr_default.close(54);
         if ( isDlt( )  )
         {
            A9496MRStkRes = O9496MRStkRes.subtract(O9516MRResCnt) ;
            n9496MRStkRes = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9496MRStkRes", GXutil.ltrimstr( A9496MRStkRes, 10, 3));
         }
         else
         {
            if ( isIns( )  || isUpd( )  || isDlt( )  )
            {
               A9496MRStkRes = O9496MRStkRes.add(A9516MRResCnt).subtract(O9516MRResCnt) ;
               n9496MRStkRes = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9496MRStkRes", GXutil.ltrimstr( A9496MRStkRes, 10, 3));
            }
         }
      }
   }

   public void endLevel13W1240( )
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

   public void scanStart13W1240( )
   {
      /* Scan By routine */
      /* Using cursor T013W57 */
      pr_default.execute(55, new Object[] {A396EmprCod, Integer.valueOf(A9492MRCod)});
      RcdFound1240 = (short)(0) ;
      if ( (pr_default.getStatus(55) != 101) )
      {
         RcdFound1240 = (short)(1) ;
         A9510MRRes = T013W57_A9510MRRes[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext13W1240( )
   {
      /* Scan next routine */
      pr_default.readNext(55);
      RcdFound1240 = (short)(0) ;
      if ( (pr_default.getStatus(55) != 101) )
      {
         RcdFound1240 = (short)(1) ;
         A9510MRRes = T013W57_A9510MRRes[0] ;
      }
   }

   public void scanEnd13W1240( )
   {
      pr_default.close(55);
   }

   public void afterConfirm13W1240( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert13W1240( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate13W1240( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete13W1240( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete13W1240( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate13W1240( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes13W1240( )
   {
      edtMRRes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMRRes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRRes_Enabled), 5, 0), !bGXsfl_125_Refreshing);
      edtMRResOrd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMRResOrd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRResOrd_Enabled), 5, 0), !bGXsfl_125_Refreshing);
      edtMRResFch_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMRResFch_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRResFch_Enabled), 5, 0), !bGXsfl_125_Refreshing);
      dynMRResTpo.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, dynMRResTpo.getInternalname(), "Enabled", GXutil.ltrimstr( dynMRResTpo.getEnabled(), 5, 0), !bGXsfl_125_Refreshing);
      edtMRResTpoD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMRResTpoD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRResTpoD_Enabled), 5, 0), !bGXsfl_125_Refreshing);
      edtMRResDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMRResDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRResDsc_Enabled), 5, 0), !bGXsfl_125_Refreshing);
      edtMRResCnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMRResCnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRResCnt_Enabled), 5, 0), !bGXsfl_125_Refreshing);
   }

   public void send_integrity_lvl_hashes13W1240( )
   {
   }

   public void send_integrity_lvl_hashes13W1238( )
   {
   }

   public void subsflControlProps_921473( )
   {
      edtPrvNum_Internalname = "PRVNUM_"+sGXsfl_92_idx ;
      edtPrvNom_Internalname = "PRVNOM_"+sGXsfl_92_idx ;
      chkMRPrvHab.setInternalname( "MRPRVHAB_"+sGXsfl_92_idx );
   }

   public void subsflControlProps_fel_921473( )
   {
      edtPrvNum_Internalname = "PRVNUM_"+sGXsfl_92_fel_idx ;
      edtPrvNom_Internalname = "PRVNOM_"+sGXsfl_92_fel_idx ;
      chkMRPrvHab.setInternalname( "MRPRVHAB_"+sGXsfl_92_fel_idx );
   }

   public void addRow13W1473( )
   {
      nGXsfl_92_idx = (int)(nGXsfl_92_idx+1) ;
      sGXsfl_92_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_92_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_921473( ) ;
      sendRow13W1473( ) ;
   }

   public void sendRow13W1473( )
   {
      Gridlevel_prvRow = GXWebRow.GetNew(context) ;
      if ( subGridlevel_prv_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGridlevel_prv_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGridlevel_prv_Class, "") != 0 )
         {
            subGridlevel_prv_Linesclass = subGridlevel_prv_Class+"Odd" ;
         }
      }
      else if ( subGridlevel_prv_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGridlevel_prv_Backstyle = (byte)(0) ;
         subGridlevel_prv_Backcolor = subGridlevel_prv_Allbackcolor ;
         if ( GXutil.strcmp(subGridlevel_prv_Class, "") != 0 )
         {
            subGridlevel_prv_Linesclass = subGridlevel_prv_Class+"Uniform" ;
         }
      }
      else if ( subGridlevel_prv_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGridlevel_prv_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGridlevel_prv_Class, "") != 0 )
         {
            subGridlevel_prv_Linesclass = subGridlevel_prv_Class+"Odd" ;
         }
         subGridlevel_prv_Backcolor = (int)(0x0) ;
      }
      else if ( subGridlevel_prv_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGridlevel_prv_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_92_idx) % (2))) == 0 )
         {
            subGridlevel_prv_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridlevel_prv_Class, "") != 0 )
            {
               subGridlevel_prv_Linesclass = subGridlevel_prv_Class+"Even" ;
            }
         }
         else
         {
            subGridlevel_prv_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridlevel_prv_Class, "") != 0 )
            {
               subGridlevel_prv_Linesclass = subGridlevel_prv_Class+"Odd" ;
            }
         }
      }
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1473_" + sGXsfl_92_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 93,'',false,'" + sGXsfl_92_idx + "',92)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_prvRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrvNum_Internalname,GXutil.ltrim( localUtil.ntoc( A795PrvNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A795PrvNum), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,93);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrvNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtPrvNum_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(92),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"",edtPrvNum_Horizontalalignment,Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_prvRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrvNom_Internalname,GXutil.rtrim( A794PrvNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrvNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtPrvNom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(92),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Check box */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1473_" + sGXsfl_92_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 95,'',false,'" + sGXsfl_92_idx + "',92)\"" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      GXCCtl = "MRPRVHAB_" + sGXsfl_92_idx ;
      chkMRPrvHab.setName( GXCCtl );
      chkMRPrvHab.setWebtags( "" );
      chkMRPrvHab.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkMRPrvHab.getInternalname(), "TitleCaption", chkMRPrvHab.getCaption(), !bGXsfl_92_Refreshing);
      chkMRPrvHab.setCheckedValue( "0" );
      A11056MRPrvHab = (byte)(((GXutil.strcmp(GXutil.ltrim( localUtil.ntoc( A11056MRPrvHab, (byte)(1), (byte)(0), ".", "")), "1")==0) ? 1 : 0)) ;
      Gridlevel_prvRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkMRPrvHab.getInternalname(),GXutil.str( A11056MRPrvHab, 1, 0),"","",Integer.valueOf(-1),Integer.valueOf(chkMRPrvHab.getEnabled()),"1","",StyleString,ClassString,"TrnColumn","",TempTags+" onclick="+"\"gx.fn.checkboxClick(95, this, 1, 0,"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,95);\""});
      httpContext.ajax_sending_grid_row(Gridlevel_prvRow);
      send_integrity_lvl_hashes13W1473( ) ;
      GXCCtl = "Z795PrvNum_" + sGXsfl_92_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z795PrvNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z11056MRPrvHab_" + sGXsfl_92_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z11056MRPrvHab, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1473_" + sGXsfl_92_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1473, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1473_" + sGXsfl_92_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1473, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1473_" + sGXsfl_92_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1473, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vMODE_" + sGXsfl_92_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Gx_mode));
      GXCCtl = "vEMPRCOD_" + sGXsfl_92_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV20EmprCod));
      GXCCtl = "vTRNCONTEXT_" + sGXsfl_92_idx ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, GXCCtl, AV22TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(GXCCtl, AV22TrnContext);
      }
      GXCCtl = "vMRCOD_" + sGXsfl_92_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV13MRCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRVNUM_"+sGXsfl_92_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrvNum_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRVNUM_"+sGXsfl_92_idx+"Horizontalalignment", GXutil.rtrim( edtPrvNum_Horizontalalignment));
      app.GxWebStd.gx_hidden_field( httpContext, "PRVNOM_"+sGXsfl_92_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrvNom_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MRPRVHAB_"+sGXsfl_92_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( chkMRPrvHab.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Gridlevel_prvContainer.AddRow(Gridlevel_prvRow);
   }

   public void readRow13W1473( )
   {
      nGXsfl_92_idx = (int)(nGXsfl_92_idx+1) ;
      sGXsfl_92_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_92_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_921473( ) ;
      edtPrvNum_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRVNUM_"+sGXsfl_92_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPrvNum_Horizontalalignment = httpContext.cgiGet( "PRVNUM_"+sGXsfl_92_idx+"Horizontalalignment") ;
      edtPrvNom_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRVNOM_"+sGXsfl_92_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      chkMRPrvHab.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "MRPRVHAB_"+sGXsfl_92_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPrvNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPrvNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
      {
         GXCCtl = "PRVNUM_" + sGXsfl_92_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrvNum_Internalname ;
         wbErr = true ;
         A795PrvNum = 0 ;
      }
      else
      {
         A795PrvNum = (int)(localUtil.ctol( httpContext.cgiGet( edtPrvNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A794PrvNom = httpContext.cgiGet( edtPrvNom_Internalname) ;
      n794PrvNom = false ;
      if ( ( ( ((GXutil.strcmp(httpContext.cgiGet( chkMRPrvHab.getInternalname()), "1")==0) ? 1 : 0) < 0 ) ) || ( ( ((GXutil.strcmp(httpContext.cgiGet( chkMRPrvHab.getInternalname()), "1")==0) ? 1 : 0) > 9 ) ) )
      {
         GXCCtl = "MRPRVHAB_" + sGXsfl_92_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = chkMRPrvHab.getInternalname() ;
         wbErr = true ;
         A11056MRPrvHab = (byte)(0) ;
      }
      else
      {
         A11056MRPrvHab = (byte)(((GXutil.strcmp(httpContext.cgiGet( chkMRPrvHab.getInternalname()), "1")==0) ? 1 : 0)) ;
      }
      GXCCtl = "Z795PrvNum_" + sGXsfl_92_idx ;
      Z795PrvNum = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z11056MRPrvHab_" + sGXsfl_92_idx ;
      Z11056MRPrvHab = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdDeleted_1473_" + sGXsfl_92_idx ;
      nRcdDeleted_1473 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1473_" + sGXsfl_92_idx ;
      nRcdExists_1473 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1473_" + sGXsfl_92_idx ;
      nIsMod_1473 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void subsflControlProps_1061239( )
   {
      edtMRMov_Internalname = "MRMOV_"+sGXsfl_106_idx ;
      edtMRMovOrd_Internalname = "MRMOVORD_"+sGXsfl_106_idx ;
      edtMRMovFch_Internalname = "MRMOVFCH_"+sGXsfl_106_idx ;
      dynMRMovTpo.setInternalname( "MRMOVTPO_"+sGXsfl_106_idx );
      edtMRMovTpoD_Internalname = "MRMOVTPOD_"+sGXsfl_106_idx ;
      edtMRMovDsc_Internalname = "MRMOVDSC_"+sGXsfl_106_idx ;
      edtMRMovCnt_Internalname = "MRMOVCNT_"+sGXsfl_106_idx ;
      edtMRMovPre_Internalname = "MRMOVPRE_"+sGXsfl_106_idx ;
   }

   public void subsflControlProps_fel_1061239( )
   {
      edtMRMov_Internalname = "MRMOV_"+sGXsfl_106_fel_idx ;
      edtMRMovOrd_Internalname = "MRMOVORD_"+sGXsfl_106_fel_idx ;
      edtMRMovFch_Internalname = "MRMOVFCH_"+sGXsfl_106_fel_idx ;
      dynMRMovTpo.setInternalname( "MRMOVTPO_"+sGXsfl_106_fel_idx );
      edtMRMovTpoD_Internalname = "MRMOVTPOD_"+sGXsfl_106_fel_idx ;
      edtMRMovDsc_Internalname = "MRMOVDSC_"+sGXsfl_106_fel_idx ;
      edtMRMovCnt_Internalname = "MRMOVCNT_"+sGXsfl_106_fel_idx ;
      edtMRMovPre_Internalname = "MRMOVPRE_"+sGXsfl_106_fel_idx ;
   }

   public void addRow13W1239( )
   {
      nGXsfl_106_idx = (int)(nGXsfl_106_idx+1) ;
      sGXsfl_106_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_106_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1061239( ) ;
      sendRow13W1239( ) ;
   }

   public void sendRow13W1239( )
   {
      Gridlevel_level1Row = GXWebRow.GetNew(context) ;
      if ( subGridlevel_level1_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGridlevel_level1_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGridlevel_level1_Class, "") != 0 )
         {
            subGridlevel_level1_Linesclass = subGridlevel_level1_Class+"Odd" ;
         }
      }
      else if ( subGridlevel_level1_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGridlevel_level1_Backstyle = (byte)(0) ;
         subGridlevel_level1_Backcolor = subGridlevel_level1_Allbackcolor ;
         if ( GXutil.strcmp(subGridlevel_level1_Class, "") != 0 )
         {
            subGridlevel_level1_Linesclass = subGridlevel_level1_Class+"Uniform" ;
         }
      }
      else if ( subGridlevel_level1_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGridlevel_level1_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGridlevel_level1_Class, "") != 0 )
         {
            subGridlevel_level1_Linesclass = subGridlevel_level1_Class+"Odd" ;
         }
         subGridlevel_level1_Backcolor = (int)(0x0) ;
      }
      else if ( subGridlevel_level1_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGridlevel_level1_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_106_idx) % (2))) == 0 )
         {
            subGridlevel_level1_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridlevel_level1_Class, "") != 0 )
            {
               subGridlevel_level1_Linesclass = subGridlevel_level1_Class+"Even" ;
            }
         }
         else
         {
            subGridlevel_level1_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridlevel_level1_Class, "") != 0 )
            {
               subGridlevel_level1_Linesclass = subGridlevel_level1_Class+"Odd" ;
            }
         }
      }
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMRMov_Internalname,GXutil.ltrim( localUtil.ntoc( A9502MRMov, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMRMov_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A9502MRMov), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A9502MRMov), "ZZZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMRMov_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtMRMov_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(106),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1239_" + sGXsfl_106_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 108,'',false,'" + sGXsfl_106_idx + "',106)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMRMovOrd_Internalname,GXutil.ltrim( localUtil.ntoc( A9503MRMovOrd, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMRMovOrd_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A9503MRMovOrd), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A9503MRMovOrd), "ZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,108);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMRMovOrd_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtMRMovOrd_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(106),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1239_" + sGXsfl_106_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 109,'',false,'" + sGXsfl_106_idx + "',106)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMRMovFch_Internalname,localUtil.ttoc( A9504MRMovFch, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A9504MRMovFch, "99/99/99 99:99"),TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,109);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMRMovFch_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtMRMovFch_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(106),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      gxamrmovtpo_html13W1239( A396EmprCod) ;
      /* Subfile cell */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1239_" + sGXsfl_106_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 110,'',false,'" + sGXsfl_106_idx + "',106)\"" ;
      if ( ( dynMRMovTpo.getItemCount() == 0 ) && isAjaxCallMode( ) )
      {
         GXCCtl = "MRMOVTPO_" + sGXsfl_106_idx ;
         dynMRMovTpo.setName( GXCCtl );
         dynMRMovTpo.setWebtags( "" );
      }
      /* ComboBox */
      Gridlevel_level1Row.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {dynMRMovTpo,dynMRMovTpo.getInternalname(),GXutil.trim( GXutil.str( A9505MRMovTpo, 8, 0)),Integer.valueOf(1),dynMRMovTpo.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","int","",Integer.valueOf(-1),Integer.valueOf(dynMRMovTpo.getEnabled()),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","TrnColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,110);\"","",Boolean.valueOf(true),Integer.valueOf(0)});
      dynMRMovTpo.setValue( GXutil.trim( GXutil.str( A9505MRMovTpo, 8, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, dynMRMovTpo.getInternalname(), "Values", dynMRMovTpo.ToJavascriptSource(), !bGXsfl_106_Refreshing);
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMRMovTpoD_Internalname,GXutil.rtrim( A9506MRMovTpoD),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMRMovTpoD_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtMRMovTpoD_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(106),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1239_" + sGXsfl_106_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 112,'',false,'" + sGXsfl_106_idx + "',106)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMRMovDsc_Internalname,GXutil.rtrim( A9507MRMovDsc),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,112);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMRMovDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtMRMovDsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(106),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1239_" + sGXsfl_106_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 113,'',false,'" + sGXsfl_106_idx + "',106)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMRMovCnt_Internalname,GXutil.ltrim( localUtil.ntoc( A9508MRMovCnt, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMRMovCnt_Enabled!=0) ? localUtil.format( A9508MRMovCnt, "ZZZ,ZZ9.999") : localUtil.format( A9508MRMovCnt, "ZZZ,ZZ9.999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onblur(this,113);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMRMovCnt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtMRMovCnt_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(106),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMRMovPre_Internalname,GXutil.ltrim( localUtil.ntoc( A9509MRMovPre, (byte)(14), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMRMovPre_Enabled!=0) ? localUtil.format( A9509MRMovPre, "ZZ,ZZZ,ZZ9.999") : localUtil.format( A9509MRMovPre, "ZZ,ZZZ,ZZ9.999"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMRMovPre_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtMRMovPre_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(106),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Gridlevel_level1Row);
      send_integrity_lvl_hashes13W1239( ) ;
      GXCCtl = "Z9502MRMov_" + sGXsfl_106_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z9502MRMov, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z9509MRMovPre_" + sGXsfl_106_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z9509MRMovPre, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z9507MRMovDsc_" + sGXsfl_106_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z9507MRMovDsc));
      GXCCtl = "Z9503MRMovOrd_" + sGXsfl_106_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z9503MRMovOrd, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z9504MRMovFch_" + sGXsfl_106_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.ttoc( Z9504MRMovFch, 10, 8, 0, 0, "/", ":", " "));
      GXCCtl = "Z9508MRMovCnt_" + sGXsfl_106_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z9508MRMovCnt, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z9505MRMovTpo_" + sGXsfl_106_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z9505MRMovTpo, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O9508MRMovCnt_" + sGXsfl_106_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O9508MRMovCnt, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1239_" + sGXsfl_106_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1239, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1239_" + sGXsfl_106_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1239, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1239_" + sGXsfl_106_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1239, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vMODE_" + sGXsfl_106_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Gx_mode));
      GXCCtl = "vEMPRCOD_" + sGXsfl_106_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV20EmprCod));
      GXCCtl = "vTRNCONTEXT_" + sGXsfl_106_idx ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, GXCCtl, AV22TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(GXCCtl, AV22TrnContext);
      }
      GXCCtl = "vMRCOD_" + sGXsfl_106_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV13MRCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MRMOV_"+sGXsfl_106_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMRMov_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MRMOVORD_"+sGXsfl_106_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMRMovOrd_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MRMOVFCH_"+sGXsfl_106_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMRMovFch_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MRMOVTPO_"+sGXsfl_106_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( dynMRMovTpo.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MRMOVTPOD_"+sGXsfl_106_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMRMovTpoD_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MRMOVDSC_"+sGXsfl_106_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMRMovDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MRMOVCNT_"+sGXsfl_106_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMRMovCnt_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MRMOVPRE_"+sGXsfl_106_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMRMovPre_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Gridlevel_level1Container.AddRow(Gridlevel_level1Row);
   }

   public void readRow13W1239( )
   {
      nGXsfl_106_idx = (int)(nGXsfl_106_idx+1) ;
      sGXsfl_106_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_106_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1061239( ) ;
      edtMRMov_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MRMOV_"+sGXsfl_106_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMRMovOrd_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MRMOVORD_"+sGXsfl_106_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMRMovFch_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MRMOVFCH_"+sGXsfl_106_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      dynMRMovTpo.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "MRMOVTPO_"+sGXsfl_106_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
      edtMRMovTpoD_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MRMOVTPOD_"+sGXsfl_106_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMRMovDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MRMOVDSC_"+sGXsfl_106_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMRMovCnt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MRMOVCNT_"+sGXsfl_106_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMRMovPre_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MRMOVPRE_"+sGXsfl_106_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A9502MRMov = localUtil.ctol( httpContext.cgiGet( edtMRMov_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMRMovOrd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMRMovOrd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
      {
         GXCCtl = "MRMOVORD_" + sGXsfl_106_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMRMovOrd_Internalname ;
         wbErr = true ;
         A9503MRMovOrd = 0 ;
      }
      else
      {
         A9503MRMovOrd = (int)(localUtil.ctol( httpContext.cgiGet( edtMRMovOrd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( localUtil.vcdtime( httpContext.cgiGet( edtMRMovFch_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
      {
         GXCCtl = "MRMOVFCH_" + sGXsfl_106_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMRMovFch_Internalname ;
         wbErr = true ;
         A9504MRMovFch = GXutil.resetTime( GXutil.nullDate() );
      }
      else
      {
         A9504MRMovFch = localUtil.ctot( httpContext.cgiGet( edtMRMovFch_Internalname)) ;
      }
      dynMRMovTpo.setName( dynMRMovTpo.getInternalname() );
      dynMRMovTpo.setValue( httpContext.cgiGet( dynMRMovTpo.getInternalname()) );
      A9505MRMovTpo = (int)(GXutil.lval( httpContext.cgiGet( dynMRMovTpo.getInternalname()))) ;
      A9506MRMovTpoD = httpContext.cgiGet( edtMRMovTpoD_Internalname) ;
      n9506MRMovTpoD = false ;
      A9507MRMovDsc = httpContext.cgiGet( edtMRMovDsc_Internalname) ;
      if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMRMovCnt_Internalname)), DecimalUtil.stringToDec("-99999.999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMRMovCnt_Internalname)), DecimalUtil.stringToDec("999999.999")) > 0 ) ) )
      {
         GXCCtl = "MRMOVCNT_" + sGXsfl_106_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMRMovCnt_Internalname ;
         wbErr = true ;
         A9508MRMovCnt = DecimalUtil.ZERO ;
      }
      else
      {
         A9508MRMovCnt = localUtil.ctond( httpContext.cgiGet( edtMRMovCnt_Internalname)) ;
      }
      A9509MRMovPre = localUtil.ctond( httpContext.cgiGet( edtMRMovPre_Internalname)) ;
      GXCCtl = "Z9502MRMov_" + sGXsfl_106_idx ;
      Z9502MRMov = localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
      GXCCtl = "Z9509MRMovPre_" + sGXsfl_106_idx ;
      Z9509MRMovPre = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z9507MRMovDsc_" + sGXsfl_106_idx ;
      Z9507MRMovDsc = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z9503MRMovOrd_" + sGXsfl_106_idx ;
      Z9503MRMovOrd = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z9504MRMovFch_" + sGXsfl_106_idx ;
      Z9504MRMovFch = localUtil.ctot( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "Z9508MRMovCnt_" + sGXsfl_106_idx ;
      Z9508MRMovCnt = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z9505MRMovTpo_" + sGXsfl_106_idx ;
      Z9505MRMovTpo = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "O9508MRMovCnt_" + sGXsfl_106_idx ;
      O9508MRMovCnt = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "nRcdDeleted_1239_" + sGXsfl_106_idx ;
      nRcdDeleted_1239 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1239_" + sGXsfl_106_idx ;
      nRcdExists_1239 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1239_" + sGXsfl_106_idx ;
      nIsMod_1239 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void subsflControlProps_1251240( )
   {
      edtMRRes_Internalname = "MRRES_"+sGXsfl_125_idx ;
      edtMRResOrd_Internalname = "MRRESORD_"+sGXsfl_125_idx ;
      edtMRResFch_Internalname = "MRRESFCH_"+sGXsfl_125_idx ;
      dynMRResTpo.setInternalname( "MRRESTPO_"+sGXsfl_125_idx );
      edtMRResTpoD_Internalname = "MRRESTPOD_"+sGXsfl_125_idx ;
      edtMRResDsc_Internalname = "MRRESDSC_"+sGXsfl_125_idx ;
      edtMRResCnt_Internalname = "MRRESCNT_"+sGXsfl_125_idx ;
   }

   public void subsflControlProps_fel_1251240( )
   {
      edtMRRes_Internalname = "MRRES_"+sGXsfl_125_fel_idx ;
      edtMRResOrd_Internalname = "MRRESORD_"+sGXsfl_125_fel_idx ;
      edtMRResFch_Internalname = "MRRESFCH_"+sGXsfl_125_fel_idx ;
      dynMRResTpo.setInternalname( "MRRESTPO_"+sGXsfl_125_fel_idx );
      edtMRResTpoD_Internalname = "MRRESTPOD_"+sGXsfl_125_fel_idx ;
      edtMRResDsc_Internalname = "MRRESDSC_"+sGXsfl_125_fel_idx ;
      edtMRResCnt_Internalname = "MRRESCNT_"+sGXsfl_125_fel_idx ;
   }

   public void addRow13W1240( )
   {
      nGXsfl_125_idx = (int)(nGXsfl_125_idx+1) ;
      sGXsfl_125_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_125_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1251240( ) ;
      sendRow13W1240( ) ;
   }

   public void sendRow13W1240( )
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
         if ( ((int)((nGXsfl_125_idx) % (2))) == 0 )
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
      ROClassString = "Attribute" ;
      Gridlevel_level2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMRRes_Internalname,GXutil.ltrim( localUtil.ntoc( A9510MRRes, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMRRes_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A9510MRRes), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A9510MRRes), "ZZZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMRRes_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtMRRes_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(125),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1240_" + sGXsfl_125_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 127,'',false,'" + sGXsfl_125_idx + "',125)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMRResOrd_Internalname,GXutil.ltrim( localUtil.ntoc( A9511MRResOrd, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMRResOrd_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A9511MRResOrd), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A9511MRResOrd), "ZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,127);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMRResOrd_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtMRResOrd_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(125),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1240_" + sGXsfl_125_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 128,'',false,'" + sGXsfl_125_idx + "',125)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMRResFch_Internalname,localUtil.ttoc( A9512MRResFch, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A9512MRResFch, "99/99/99 99:99"),TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,128);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMRResFch_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtMRResFch_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(125),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      gxamrrestpo_html13W1240( A396EmprCod) ;
      /* Subfile cell */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1240_" + sGXsfl_125_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 129,'',false,'" + sGXsfl_125_idx + "',125)\"" ;
      if ( ( dynMRResTpo.getItemCount() == 0 ) && isAjaxCallMode( ) )
      {
         GXCCtl = "MRRESTPO_" + sGXsfl_125_idx ;
         dynMRResTpo.setName( GXCCtl );
         dynMRResTpo.setWebtags( "" );
      }
      /* ComboBox */
      Gridlevel_level2Row.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {dynMRResTpo,dynMRResTpo.getInternalname(),GXutil.trim( GXutil.str( A9513MRResTpo, 8, 0)),Integer.valueOf(1),dynMRResTpo.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","int","",Integer.valueOf(-1),Integer.valueOf(dynMRResTpo.getEnabled()),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","TrnColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,129);\"","",Boolean.valueOf(true),Integer.valueOf(0)});
      dynMRResTpo.setValue( GXutil.trim( GXutil.str( A9513MRResTpo, 8, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, dynMRResTpo.getInternalname(), "Values", dynMRResTpo.ToJavascriptSource(), !bGXsfl_125_Refreshing);
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMRResTpoD_Internalname,GXutil.rtrim( A9514MRResTpoD),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMRResTpoD_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtMRResTpoD_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(125),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1240_" + sGXsfl_125_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 131,'',false,'" + sGXsfl_125_idx + "',125)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMRResDsc_Internalname,GXutil.rtrim( A9515MRResDsc),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,131);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMRResDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtMRResDsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(125),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1240_" + sGXsfl_125_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 132,'',false,'" + sGXsfl_125_idx + "',125)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMRResCnt_Internalname,GXutil.ltrim( localUtil.ntoc( A9516MRResCnt, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMRResCnt_Enabled!=0) ? localUtil.format( A9516MRResCnt, "ZZZ,ZZ9.999") : localUtil.format( A9516MRResCnt, "ZZZ,ZZ9.999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onblur(this,132);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMRResCnt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtMRResCnt_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(125),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Gridlevel_level2Row);
      send_integrity_lvl_hashes13W1240( ) ;
      GXCCtl = "Z9510MRRes_" + sGXsfl_125_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z9510MRRes, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z9515MRResDsc_" + sGXsfl_125_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z9515MRResDsc));
      GXCCtl = "Z9511MRResOrd_" + sGXsfl_125_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z9511MRResOrd, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z9512MRResFch_" + sGXsfl_125_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.ttoc( Z9512MRResFch, 10, 8, 0, 0, "/", ":", " "));
      GXCCtl = "Z9516MRResCnt_" + sGXsfl_125_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z9516MRResCnt, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z9513MRResTpo_" + sGXsfl_125_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z9513MRResTpo, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O9516MRResCnt_" + sGXsfl_125_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O9516MRResCnt, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1240_" + sGXsfl_125_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1240, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1240_" + sGXsfl_125_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1240, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1240_" + sGXsfl_125_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1240, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vMODE_" + sGXsfl_125_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Gx_mode));
      GXCCtl = "vEMPRCOD_" + sGXsfl_125_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV20EmprCod));
      GXCCtl = "vTRNCONTEXT_" + sGXsfl_125_idx ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, GXCCtl, AV22TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(GXCCtl, AV22TrnContext);
      }
      GXCCtl = "vMRCOD_" + sGXsfl_125_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV13MRCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MRRES_"+sGXsfl_125_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMRRes_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MRRESORD_"+sGXsfl_125_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMRResOrd_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MRRESFCH_"+sGXsfl_125_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMRResFch_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MRRESTPO_"+sGXsfl_125_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( dynMRResTpo.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MRRESTPOD_"+sGXsfl_125_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMRResTpoD_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MRRESDSC_"+sGXsfl_125_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMRResDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MRRESCNT_"+sGXsfl_125_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMRResCnt_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Gridlevel_level2Container.AddRow(Gridlevel_level2Row);
   }

   public void readRow13W1240( )
   {
      nGXsfl_125_idx = (int)(nGXsfl_125_idx+1) ;
      sGXsfl_125_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_125_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1251240( ) ;
      edtMRRes_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MRRES_"+sGXsfl_125_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMRResOrd_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MRRESORD_"+sGXsfl_125_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMRResFch_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MRRESFCH_"+sGXsfl_125_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      dynMRResTpo.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "MRRESTPO_"+sGXsfl_125_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
      edtMRResTpoD_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MRRESTPOD_"+sGXsfl_125_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMRResDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MRRESDSC_"+sGXsfl_125_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMRResCnt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MRRESCNT_"+sGXsfl_125_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A9510MRRes = localUtil.ctol( httpContext.cgiGet( edtMRRes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMRResOrd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMRResOrd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
      {
         GXCCtl = "MRRESORD_" + sGXsfl_125_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMRResOrd_Internalname ;
         wbErr = true ;
         A9511MRResOrd = 0 ;
      }
      else
      {
         A9511MRResOrd = (int)(localUtil.ctol( httpContext.cgiGet( edtMRResOrd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( localUtil.vcdtime( httpContext.cgiGet( edtMRResFch_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
      {
         GXCCtl = "MRRESFCH_" + sGXsfl_125_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMRResFch_Internalname ;
         wbErr = true ;
         A9512MRResFch = GXutil.resetTime( GXutil.nullDate() );
      }
      else
      {
         A9512MRResFch = localUtil.ctot( httpContext.cgiGet( edtMRResFch_Internalname)) ;
      }
      dynMRResTpo.setName( dynMRResTpo.getInternalname() );
      dynMRResTpo.setValue( httpContext.cgiGet( dynMRResTpo.getInternalname()) );
      A9513MRResTpo = (int)(GXutil.lval( httpContext.cgiGet( dynMRResTpo.getInternalname()))) ;
      A9514MRResTpoD = httpContext.cgiGet( edtMRResTpoD_Internalname) ;
      n9514MRResTpoD = false ;
      A9515MRResDsc = httpContext.cgiGet( edtMRResDsc_Internalname) ;
      if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMRResCnt_Internalname)), DecimalUtil.stringToDec("-99999.999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMRResCnt_Internalname)), DecimalUtil.stringToDec("999999.999")) > 0 ) ) )
      {
         GXCCtl = "MRRESCNT_" + sGXsfl_125_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMRResCnt_Internalname ;
         wbErr = true ;
         A9516MRResCnt = DecimalUtil.ZERO ;
      }
      else
      {
         A9516MRResCnt = localUtil.ctond( httpContext.cgiGet( edtMRResCnt_Internalname)) ;
      }
      GXCCtl = "Z9510MRRes_" + sGXsfl_125_idx ;
      Z9510MRRes = localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
      GXCCtl = "Z9515MRResDsc_" + sGXsfl_125_idx ;
      Z9515MRResDsc = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z9511MRResOrd_" + sGXsfl_125_idx ;
      Z9511MRResOrd = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z9512MRResFch_" + sGXsfl_125_idx ;
      Z9512MRResFch = localUtil.ctot( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "Z9516MRResCnt_" + sGXsfl_125_idx ;
      Z9516MRResCnt = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z9513MRResTpo_" + sGXsfl_125_idx ;
      Z9513MRResTpo = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "O9516MRResCnt_" + sGXsfl_125_idx ;
      O9516MRResCnt = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "nRcdDeleted_1240_" + sGXsfl_125_idx ;
      nRcdDeleted_1240 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1240_" + sGXsfl_125_idx ;
      nRcdExists_1240 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1240_" + sGXsfl_125_idx ;
      nIsMod_1240 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtMRResTpoD_Enabled = edtMRResTpoD_Enabled ;
      defedtMRRes_Enabled = edtMRRes_Enabled ;
      defedtMRMovPre_Enabled = edtMRMovPre_Enabled ;
      defedtMRMovTpoD_Enabled = edtMRMovTpoD_Enabled ;
      defedtMRMov_Enabled = edtMRMov_Enabled ;
      defedtPrvNom_Enabled = edtPrvNom_Enabled ;
      defedtPrvNum_Enabled = edtPrvNum_Enabled ;
   }

   public void confirmValues13W0( )
   {
      nGXsfl_92_idx = 0 ;
      sGXsfl_92_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_92_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_921473( ) ;
      while ( nGXsfl_92_idx < nRC_GXsfl_92 )
      {
         nGXsfl_92_idx = (int)(nGXsfl_92_idx+1) ;
         sGXsfl_92_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_92_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_921473( ) ;
         httpContext.changePostValue( "Z795PrvNum_"+sGXsfl_92_idx, httpContext.cgiGet( "ZT_"+"Z795PrvNum_"+sGXsfl_92_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z795PrvNum_"+sGXsfl_92_idx) ;
         httpContext.changePostValue( "Z11056MRPrvHab_"+sGXsfl_92_idx, httpContext.cgiGet( "ZT_"+"Z11056MRPrvHab_"+sGXsfl_92_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11056MRPrvHab_"+sGXsfl_92_idx) ;
      }
      nGXsfl_106_idx = 0 ;
      sGXsfl_106_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_106_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1061239( ) ;
      while ( nGXsfl_106_idx < nRC_GXsfl_106 )
      {
         nGXsfl_106_idx = (int)(nGXsfl_106_idx+1) ;
         sGXsfl_106_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_106_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1061239( ) ;
         httpContext.changePostValue( "Z9502MRMov_"+sGXsfl_106_idx, httpContext.cgiGet( "ZT_"+"Z9502MRMov_"+sGXsfl_106_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9502MRMov_"+sGXsfl_106_idx) ;
         httpContext.changePostValue( "Z9509MRMovPre_"+sGXsfl_106_idx, httpContext.cgiGet( "ZT_"+"Z9509MRMovPre_"+sGXsfl_106_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9509MRMovPre_"+sGXsfl_106_idx) ;
         httpContext.changePostValue( "Z9507MRMovDsc_"+sGXsfl_106_idx, httpContext.cgiGet( "ZT_"+"Z9507MRMovDsc_"+sGXsfl_106_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9507MRMovDsc_"+sGXsfl_106_idx) ;
         httpContext.changePostValue( "Z9503MRMovOrd_"+sGXsfl_106_idx, httpContext.cgiGet( "ZT_"+"Z9503MRMovOrd_"+sGXsfl_106_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9503MRMovOrd_"+sGXsfl_106_idx) ;
         httpContext.changePostValue( "Z9504MRMovFch_"+sGXsfl_106_idx, httpContext.cgiGet( "ZT_"+"Z9504MRMovFch_"+sGXsfl_106_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9504MRMovFch_"+sGXsfl_106_idx) ;
         httpContext.changePostValue( "Z9508MRMovCnt_"+sGXsfl_106_idx, httpContext.cgiGet( "ZT_"+"Z9508MRMovCnt_"+sGXsfl_106_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9508MRMovCnt_"+sGXsfl_106_idx) ;
         httpContext.changePostValue( "Z9505MRMovTpo_"+sGXsfl_106_idx, httpContext.cgiGet( "ZT_"+"Z9505MRMovTpo_"+sGXsfl_106_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9505MRMovTpo_"+sGXsfl_106_idx) ;
      }
      nGXsfl_125_idx = 0 ;
      sGXsfl_125_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_125_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1251240( ) ;
      while ( nGXsfl_125_idx < nRC_GXsfl_125 )
      {
         nGXsfl_125_idx = (int)(nGXsfl_125_idx+1) ;
         sGXsfl_125_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_125_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1251240( ) ;
         httpContext.changePostValue( "Z9510MRRes_"+sGXsfl_125_idx, httpContext.cgiGet( "ZT_"+"Z9510MRRes_"+sGXsfl_125_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9510MRRes_"+sGXsfl_125_idx) ;
         httpContext.changePostValue( "Z9515MRResDsc_"+sGXsfl_125_idx, httpContext.cgiGet( "ZT_"+"Z9515MRResDsc_"+sGXsfl_125_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9515MRResDsc_"+sGXsfl_125_idx) ;
         httpContext.changePostValue( "Z9511MRResOrd_"+sGXsfl_125_idx, httpContext.cgiGet( "ZT_"+"Z9511MRResOrd_"+sGXsfl_125_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9511MRResOrd_"+sGXsfl_125_idx) ;
         httpContext.changePostValue( "Z9512MRResFch_"+sGXsfl_125_idx, httpContext.cgiGet( "ZT_"+"Z9512MRResFch_"+sGXsfl_125_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9512MRResFch_"+sGXsfl_125_idx) ;
         httpContext.changePostValue( "Z9516MRResCnt_"+sGXsfl_125_idx, httpContext.cgiGet( "ZT_"+"Z9516MRResCnt_"+sGXsfl_125_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9516MRResCnt_"+sGXsfl_125_idx) ;
         httpContext.changePostValue( "Z9513MRResTpo_"+sGXsfl_125_idx, httpContext.cgiGet( "ZT_"+"Z9513MRResTpo_"+sGXsfl_125_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9513MRResTpo_"+sGXsfl_125_idx) ;
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
      httpContext.AddJavascriptSource("calendar.js", "?"+httpContext.getBuildNumber( 214800), false, true);
      httpContext.AddJavascriptSource("calendar-setup.js", "?"+httpContext.getBuildNumber( 214800), false, true);
      httpContext.AddJavascriptSource("calendar-"+GXutil.substring( httpContext.getLanguageProperty( "culture"), 1, 2)+".js", "?"+httpContext.getBuildNumber( 214800), false, true);
      httpContext.AddJavascriptSource("Shared/HistoryManager/HistoryManager.js", "", false, true);
      httpContext.AddJavascriptSource("Shared/HistoryManager/rsh/json2005.js", "", false, true);
      httpContext.AddJavascriptSource("Shared/HistoryManager/rsh/rsh.js", "", false, true);
      httpContext.AddJavascriptSource("Shared/HistoryManager/HistoryManagerCreate.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("Tab/TabRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.mantenimientomaquina.tmrepue", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV20EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV13MRCod,8,0))}, new String[] {"Gx_mode","EmprCod","MRCod"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"TMRepue");
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV34Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("mantenimientomaquina\\tmrepue:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9492MRCod", GXutil.ltrim( localUtil.ntoc( Z9492MRCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9493MRNom", GXutil.rtrim( Z9493MRNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9494MRCodExt", GXutil.rtrim( Z9494MRCodExt));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11458MRCodPrv", GXutil.rtrim( Z11458MRCodPrv));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9495MRStkAct", GXutil.ltrim( localUtil.ntoc( Z9495MRStkAct, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9496MRStkRes", GXutil.ltrim( localUtil.ntoc( Z9496MRStkRes, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9497MRStkMin", GXutil.ltrim( localUtil.ntoc( Z9497MRStkMin, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9498MRStkCri", GXutil.ltrim( localUtil.ntoc( Z9498MRStkCri, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9499MRStkPre", GXutil.ltrim( localUtil.ntoc( Z9499MRStkPre, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9500MRUltMov", GXutil.ltrim( localUtil.ntoc( Z9500MRUltMov, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9501MRUltRes", GXutil.ltrim( localUtil.ntoc( Z9501MRUltRes, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12850MRActivo", GXutil.rtrim( Z12850MRActivo));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14491MRLote", GXutil.rtrim( Z14491MRLote));
      app.GxWebStd.gx_hidden_field( httpContext, "O9496MRStkRes", GXutil.ltrim( localUtil.ntoc( O9496MRStkRes, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O9501MRUltRes", GXutil.ltrim( localUtil.ntoc( O9501MRUltRes, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O9495MRStkAct", GXutil.ltrim( localUtil.ntoc( O9495MRStkAct, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O9500MRUltMov", GXutil.ltrim( localUtil.ntoc( O9500MRUltMov, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_92", GXutil.ltrim( localUtil.ntoc( nGXsfl_92_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_106", GXutil.ltrim( localUtil.ntoc( nGXsfl_106_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_125", GXutil.ltrim( localUtil.ntoc( nGXsfl_125_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "N9492MRCod", GXutil.ltrim( localUtil.ntoc( A9492MRCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV32DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV32DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vPRVNUM_DATA", AV30PrvNum_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vPRVNUM_DATA", AV30PrvNum_Data);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTRNCONTEXT", AV22TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTRNCONTEXT", AV22TrnContext);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTRNCONTEXT", getSecureSignedToken( "", AV22TrnContext));
      app.GxWebStd.gx_hidden_field( httpContext, "MRCNOM", A13718MRCNom);
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV20EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV20EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMRCOD", GXutil.ltrim( localUtil.ntoc( AV13MRCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMRCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV13MRCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vARTEXTIL", GXutil.ltrim( localUtil.ntoc( AV16Artextil, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNUMMANUAL", GXutil.ltrim( localUtil.ntoc( AV17NumManual, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXUITABSPANEL_TABS_Objectcall", GXutil.rtrim( Gxuitabspanel_tabs_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "GXUITABSPANEL_TABS_Enabled", GXutil.booltostr( Gxuitabspanel_tabs_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "GXUITABSPANEL_TABS_Pagecount", GXutil.ltrim( localUtil.ntoc( Gxuitabspanel_tabs_Pagecount, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXUITABSPANEL_TABS_Class", GXutil.rtrim( Gxuitabspanel_tabs_Class));
      app.GxWebStd.gx_hidden_field( httpContext, "GXUITABSPANEL_TABS_Historymanagement", GXutil.booltostr( Gxuitabspanel_tabs_Historymanagement));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_OPCIONES_Objectcall", GXutil.rtrim( Dvpanel_opciones_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_OPCIONES_Enabled", GXutil.booltostr( Dvpanel_opciones_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_OPCIONES_Width", GXutil.rtrim( Dvpanel_opciones_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_OPCIONES_Autowidth", GXutil.booltostr( Dvpanel_opciones_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_OPCIONES_Autoheight", GXutil.booltostr( Dvpanel_opciones_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_OPCIONES_Cls", GXutil.rtrim( Dvpanel_opciones_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_OPCIONES_Title", GXutil.rtrim( Dvpanel_opciones_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_OPCIONES_Collapsible", GXutil.booltostr( Dvpanel_opciones_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_OPCIONES_Collapsed", GXutil.booltostr( Dvpanel_opciones_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_OPCIONES_Showcollapseicon", GXutil.booltostr( Dvpanel_opciones_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_OPCIONES_Iconposition", GXutil.rtrim( Dvpanel_opciones_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_OPCIONES_Autoscroll", GXutil.booltostr( Dvpanel_opciones_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PRVNUM_Objectcall", GXutil.rtrim( Combo_prvnum_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PRVNUM_Cls", GXutil.rtrim( Combo_prvnum_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PRVNUM_Enabled", GXutil.booltostr( Combo_prvnum_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PRVNUM_Titlecontrolidtoreplace", GXutil.rtrim( Combo_prvnum_Titlecontrolidtoreplace));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PRVNUM_Isgriditem", GXutil.booltostr( Combo_prvnum_Isgriditem));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PRVNUM_Emptyitem", GXutil.booltostr( Combo_prvnum_Emptyitem));
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
      return formatLink("app.mantenimientomaquina.tmrepue", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV20EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV13MRCod,8,0))}, new String[] {"Gx_mode","EmprCod","MRCod"})  ;
   }

   public String getPgmname( )
   {
      return "MantenimientoMaquina.TMRepue" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Respuestos", "") ;
   }

   public void initializeNonKey13W1238( )
   {
      A13718MRCNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13718MRCNom", A13718MRCNom);
      A407EmprNom = "" ;
      n407EmprNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      A9493MRNom = "" ;
      n9493MRNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9493MRNom", A9493MRNom);
      A9494MRCodExt = "" ;
      n9494MRCodExt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9494MRCodExt", A9494MRCodExt);
      A11458MRCodPrv = "" ;
      n11458MRCodPrv = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11458MRCodPrv", A11458MRCodPrv);
      A9495MRStkAct = DecimalUtil.ZERO ;
      n9495MRStkAct = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9495MRStkAct", GXutil.ltrimstr( A9495MRStkAct, 10, 3));
      A9496MRStkRes = DecimalUtil.ZERO ;
      n9496MRStkRes = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9496MRStkRes", GXutil.ltrimstr( A9496MRStkRes, 10, 3));
      A9497MRStkMin = DecimalUtil.ZERO ;
      n9497MRStkMin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9497MRStkMin", GXutil.ltrimstr( A9497MRStkMin, 12, 3));
      A9498MRStkCri = DecimalUtil.ZERO ;
      n9498MRStkCri = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9498MRStkCri", GXutil.ltrimstr( A9498MRStkCri, 12, 3));
      A9499MRStkPre = DecimalUtil.ZERO ;
      n9499MRStkPre = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9499MRStkPre", GXutil.ltrimstr( A9499MRStkPre, 12, 3));
      A9500MRUltMov = 0 ;
      n9500MRUltMov = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9500MRUltMov", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9500MRUltMov), 8, 0));
      A9501MRUltRes = 0 ;
      n9501MRUltRes = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9501MRUltRes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9501MRUltRes), 10, 0));
      A14491MRLote = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14491MRLote", A14491MRLote);
      A12850MRActivo = httpContext.getMessage( "S", "") ;
      n12850MRActivo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12850MRActivo", A12850MRActivo);
      O9496MRStkRes = A9496MRStkRes ;
      n9496MRStkRes = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9496MRStkRes", GXutil.ltrimstr( A9496MRStkRes, 10, 3));
      O9501MRUltRes = A9501MRUltRes ;
      n9501MRUltRes = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9501MRUltRes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9501MRUltRes), 10, 0));
      O9495MRStkAct = A9495MRStkAct ;
      n9495MRStkAct = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9495MRStkAct", GXutil.ltrimstr( A9495MRStkAct, 10, 3));
      O9500MRUltMov = A9500MRUltMov ;
      n9500MRUltMov = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9500MRUltMov", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9500MRUltMov), 8, 0));
      Z9493MRNom = "" ;
      Z9494MRCodExt = "" ;
      Z11458MRCodPrv = "" ;
      Z9495MRStkAct = DecimalUtil.ZERO ;
      Z9496MRStkRes = DecimalUtil.ZERO ;
      Z9497MRStkMin = DecimalUtil.ZERO ;
      Z9498MRStkCri = DecimalUtil.ZERO ;
      Z9499MRStkPre = DecimalUtil.ZERO ;
      Z9500MRUltMov = 0 ;
      Z9501MRUltRes = 0 ;
      Z12850MRActivo = "" ;
      Z14491MRLote = "" ;
   }

   public void initAll13W1238( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A9492MRCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A9492MRCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9492MRCod), 8, 0));
      initializeNonKey13W1238( ) ;
   }

   public void standaloneModalInsert( )
   {
      A12850MRActivo = i12850MRActivo ;
      n12850MRActivo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12850MRActivo", A12850MRActivo);
   }

   public void initializeNonKey13W1473( )
   {
      A794PrvNom = "" ;
      n794PrvNom = false ;
      A11056MRPrvHab = (byte)(0) ;
      Z11056MRPrvHab = (byte)(0) ;
   }

   public void initAll13W1473( )
   {
      A795PrvNum = 0 ;
      initializeNonKey13W1473( ) ;
   }

   public void standaloneModalInsert13W1473( )
   {
   }

   public void initializeNonKey13W1239( )
   {
      A9503MRMovOrd = 0 ;
      A9504MRMovFch = GXutil.resetTime( GXutil.nullDate() );
      A9505MRMovTpo = 0 ;
      A9506MRMovTpoD = "" ;
      n9506MRMovTpoD = false ;
      A9508MRMovCnt = DecimalUtil.ZERO ;
      A9509MRMovPre = A9499MRStkPre ;
      A9507MRMovDsc = "" ;
      O9508MRMovCnt = A9508MRMovCnt ;
      Z9509MRMovPre = DecimalUtil.ZERO ;
      Z9507MRMovDsc = "" ;
      Z9503MRMovOrd = 0 ;
      Z9504MRMovFch = GXutil.resetTime( GXutil.nullDate() );
      Z9508MRMovCnt = DecimalUtil.ZERO ;
      Z9505MRMovTpo = 0 ;
   }

   public void initAll13W1239( )
   {
      A9502MRMov = 0 ;
      initializeNonKey13W1239( ) ;
   }

   public void standaloneModalInsert13W1239( )
   {
      A9500MRUltMov = i9500MRUltMov ;
      n9500MRUltMov = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9500MRUltMov", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9500MRUltMov), 8, 0));
      A9509MRMovPre = i9509MRMovPre ;
   }

   public void initializeNonKey13W1240( )
   {
      A9511MRResOrd = 0 ;
      A9512MRResFch = GXutil.resetTime( GXutil.nullDate() );
      A9513MRResTpo = 0 ;
      A9514MRResTpoD = "" ;
      n9514MRResTpoD = false ;
      A9516MRResCnt = DecimalUtil.ZERO ;
      A9515MRResDsc = "" ;
      O9516MRResCnt = A9516MRResCnt ;
      Z9515MRResDsc = "" ;
      Z9511MRResOrd = 0 ;
      Z9512MRResFch = GXutil.resetTime( GXutil.nullDate() );
      Z9516MRResCnt = DecimalUtil.ZERO ;
      Z9513MRResTpo = 0 ;
   }

   public void initAll13W1240( )
   {
      A9510MRRes = 0 ;
      initializeNonKey13W1240( ) ;
   }

   public void standaloneModalInsert13W1240( )
   {
      A9501MRUltRes = i9501MRUltRes ;
      n9501MRUltRes = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9501MRUltRes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9501MRUltRes), 10, 0));
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211661564", true, true);
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
      httpContext.AddJavascriptSource("mantenimientomaquina/tmrepue.js", "?20268211661564", false, true);
      httpContext.AddJavascriptSource("Shared/HistoryManager/HistoryManager.js", "", false, true);
      httpContext.AddJavascriptSource("Shared/HistoryManager/rsh/json2005.js", "", false, true);
      httpContext.AddJavascriptSource("Shared/HistoryManager/rsh/rsh.js", "", false, true);
      httpContext.AddJavascriptSource("Shared/HistoryManager/HistoryManagerCreate.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("Tab/TabRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1473( )
   {
      edtPrvNom_Enabled = defedtPrvNom_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrvNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvNom_Enabled), 5, 0), !bGXsfl_92_Refreshing);
      edtPrvNum_Enabled = defedtPrvNum_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrvNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvNum_Enabled), 5, 0), !bGXsfl_92_Refreshing);
   }

   public void init_level_properties1239( )
   {
      edtMRMovPre_Enabled = defedtMRMovPre_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtMRMovPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRMovPre_Enabled), 5, 0), !bGXsfl_106_Refreshing);
      edtMRMovTpoD_Enabled = defedtMRMovTpoD_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtMRMovTpoD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRMovTpoD_Enabled), 5, 0), !bGXsfl_106_Refreshing);
      edtMRMov_Enabled = defedtMRMov_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtMRMov_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRMov_Enabled), 5, 0), !bGXsfl_106_Refreshing);
   }

   public void init_level_properties1240( )
   {
      edtMRResTpoD_Enabled = defedtMRResTpoD_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtMRResTpoD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRResTpoD_Enabled), 5, 0), !bGXsfl_125_Refreshing);
      edtMRRes_Enabled = defedtMRRes_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtMRRes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRRes_Enabled), 5, 0), !bGXsfl_125_Refreshing);
   }

   public void startgridcontrol92( )
   {
      Gridlevel_prvContainer.AddObjectProperty("GridName", "Gridlevel_prv");
      Gridlevel_prvContainer.AddObjectProperty("Header", subGridlevel_prv_Header);
      Gridlevel_prvContainer.AddObjectProperty("Class", "GridNoBorder WorkWith");
      Gridlevel_prvContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_prvContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_prvContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridlevel_prv_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_prvContainer.AddObjectProperty("CmpContext", "");
      Gridlevel_prvContainer.AddObjectProperty("InMasterPage", "false");
      Gridlevel_prvColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_prvColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A795PrvNum, (byte)(6), (byte)(0), ".", "")));
      Gridlevel_prvColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPrvNum_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_prvColumn.AddObjectProperty("Horizontalalignment", GXutil.rtrim( edtPrvNum_Horizontalalignment));
      Gridlevel_prvContainer.AddColumnProperties(Gridlevel_prvColumn);
      Gridlevel_prvColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_prvColumn.AddObjectProperty("Value", GXutil.rtrim( A794PrvNom));
      Gridlevel_prvColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPrvNom_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_prvContainer.AddColumnProperties(Gridlevel_prvColumn);
      Gridlevel_prvColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_prvColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A11056MRPrvHab, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_prvColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( chkMRPrvHab.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      Gridlevel_prvContainer.AddColumnProperties(Gridlevel_prvColumn);
      Gridlevel_prvContainer.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGridlevel_prv_Selectedindex, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_prvContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGridlevel_prv_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_prvContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGridlevel_prv_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Gridlevel_prvContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGridlevel_prv_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_prvContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGridlevel_prv_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Gridlevel_prvContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGridlevel_prv_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_prvContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGridlevel_prv_Collapsed, (byte)(1), (byte)(0), ".", "")));
   }

   public void startgridcontrol106( )
   {
      Gridlevel_level1Container.AddObjectProperty("GridName", "Gridlevel_level1");
      Gridlevel_level1Container.AddObjectProperty("Header", subGridlevel_level1_Header);
      Gridlevel_level1Container.AddObjectProperty("Class", "GridNoBorder WorkWith");
      Gridlevel_level1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridlevel_level1_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddObjectProperty("CmpContext", "");
      Gridlevel_level1Container.AddObjectProperty("InMasterPage", "false");
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9502MRMov, (byte)(10), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMRMov_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9503MRMovOrd, (byte)(8), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMRMovOrd_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", localUtil.ttoc( A9504MRMovFch, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMRMovFch_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9505MRMovTpo, (byte)(8), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( dynMRMovTpo.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A9506MRMovTpoD));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMRMovTpoD_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A9507MRMovDsc));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMRMovDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9508MRMovCnt, (byte)(11), (byte)(3), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMRMovCnt_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9509MRMovPre, (byte)(14), (byte)(3), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMRMovPre_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Container.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGridlevel_level1_Selectedindex, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGridlevel_level1_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGridlevel_level1_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGridlevel_level1_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGridlevel_level1_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGridlevel_level1_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGridlevel_level1_Collapsed, (byte)(1), (byte)(0), ".", "")));
   }

   public void startgridcontrol125( )
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
      Gridlevel_level2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9510MRRes, (byte)(10), (byte)(0), ".", "")));
      Gridlevel_level2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMRRes_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level2Container.AddColumnProperties(Gridlevel_level2Column);
      Gridlevel_level2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9511MRResOrd, (byte)(8), (byte)(0), ".", "")));
      Gridlevel_level2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMRResOrd_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level2Container.AddColumnProperties(Gridlevel_level2Column);
      Gridlevel_level2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level2Column.AddObjectProperty("Value", localUtil.ttoc( A9512MRResFch, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      Gridlevel_level2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMRResFch_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level2Container.AddColumnProperties(Gridlevel_level2Column);
      Gridlevel_level2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9513MRResTpo, (byte)(8), (byte)(0), ".", "")));
      Gridlevel_level2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( dynMRResTpo.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level2Container.AddColumnProperties(Gridlevel_level2Column);
      Gridlevel_level2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level2Column.AddObjectProperty("Value", GXutil.rtrim( A9514MRResTpoD));
      Gridlevel_level2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMRResTpoD_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level2Container.AddColumnProperties(Gridlevel_level2Column);
      Gridlevel_level2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level2Column.AddObjectProperty("Value", GXutil.rtrim( A9515MRResDsc));
      Gridlevel_level2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMRResDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level2Container.AddColumnProperties(Gridlevel_level2Column);
      Gridlevel_level2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9516MRResCnt, (byte)(11), (byte)(3), ".", "")));
      Gridlevel_level2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMRResCnt_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      lblTabgeneral_title_Internalname = "TABGENERAL_TITLE" ;
      edtMRCod_Internalname = "MRCOD" ;
      edtMRNom_Internalname = "MRNOM" ;
      chkMRActivo.setInternalname( "MRACTIVO" );
      edtMRCodExt_Internalname = "MRCODEXT" ;
      edtMRCodPrv_Internalname = "MRCODPRV" ;
      edtMRLote_Internalname = "MRLOTE" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      edtMRStkPre_Internalname = "MRSTKPRE" ;
      edtMRStkMin_Internalname = "MRSTKMIN" ;
      edtMRStkCri_Internalname = "MRSTKCRI" ;
      edtMRStkAct_Internalname = "MRSTKACT" ;
      edtMRStkRes_Internalname = "MRSTKRES" ;
      divGrupostocks_Internalname = "GRUPOSTOCKS" ;
      grpUnnamedgroup3_Internalname = "UNNAMEDGROUP3" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      lblTablevel_prv_title_Internalname = "TABLEVEL_PRV_TITLE" ;
      edtPrvNum_Internalname = "PRVNUM" ;
      edtPrvNom_Internalname = "PRVNOM" ;
      chkMRPrvHab.setInternalname( "MRPRVHAB" );
      divTableleaflevel_prv_Internalname = "TABLELEAFLEVEL_PRV" ;
      divTabtablelevel_prv_Internalname = "TABTABLELEVEL_PRV" ;
      lblTablevel_level1_title_Internalname = "TABLEVEL_LEVEL1_TITLE" ;
      edtMRMov_Internalname = "MRMOV" ;
      edtMRMovOrd_Internalname = "MRMOVORD" ;
      edtMRMovFch_Internalname = "MRMOVFCH" ;
      dynMRMovTpo.setInternalname( "MRMOVTPO" );
      edtMRMovTpoD_Internalname = "MRMOVTPOD" ;
      edtMRMovDsc_Internalname = "MRMOVDSC" ;
      edtMRMovCnt_Internalname = "MRMOVCNT" ;
      edtMRMovPre_Internalname = "MRMOVPRE" ;
      divTableleaflevel_level1_Internalname = "TABLELEAFLEVEL_LEVEL1" ;
      divTabtablelevel_level1_Internalname = "TABTABLELEVEL_LEVEL1" ;
      lblTablevel_level2_title_Internalname = "TABLEVEL_LEVEL2_TITLE" ;
      edtMRRes_Internalname = "MRRES" ;
      edtMRResOrd_Internalname = "MRRESORD" ;
      edtMRResFch_Internalname = "MRRESFCH" ;
      dynMRResTpo.setInternalname( "MRRESTPO" );
      edtMRResTpoD_Internalname = "MRRESTPOD" ;
      edtMRResDsc_Internalname = "MRRESDSC" ;
      edtMRResCnt_Internalname = "MRRESCNT" ;
      divTableleaflevel_level2_Internalname = "TABLELEAFLEVEL_LEVEL2" ;
      divTabtablelevel_level2_Internalname = "TABTABLELEVEL_LEVEL2" ;
      Gxuitabspanel_tabs_Internalname = "GXUITABSPANEL_TABS" ;
      divOpciones_Internalname = "OPCIONES" ;
      Dvpanel_opciones_Internalname = "DVPANEL_OPCIONES" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      bttBtntrn_delete_Internalname = "BTNTRN_DELETE" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Combo_prvnum_Internalname = "COMBO_PRVNUM" ;
      edtMRUltMov_Internalname = "MRULTMOV" ;
      edtMRUltRes_Internalname = "MRULTRES" ;
      edtEmprCod_Internalname = "EMPRCOD" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      divHtml_bottomauxiliarcontrols_Internalname = "HTML_BOTTOMAUXILIARCONTROLS" ;
      divLayoutmaintable_Internalname = "LAYOUTMAINTABLE" ;
      Form.setInternalname( "FORM" );
      subGridlevel_prv_Internalname = "GRIDLEVEL_PRV" ;
      subGridlevel_level1_Internalname = "GRIDLEVEL_LEVEL1" ;
      subGridlevel_level2_Internalname = "GRIDLEVEL_LEVEL2" ;
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
      subGridlevel_level1_Allowcollapsing = (byte)(0) ;
      subGridlevel_level1_Allowselection = (byte)(0) ;
      subGridlevel_level1_Header = "" ;
      subGridlevel_prv_Allowcollapsing = (byte)(0) ;
      subGridlevel_prv_Allowselection = (byte)(0) ;
      subGridlevel_prv_Header = "" ;
      Combo_prvnum_Enabled = GXutil.toBoolean( -1) ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Respuestos", "") );
      edtMRResCnt_Jsonclick = "" ;
      edtMRResDsc_Jsonclick = "" ;
      edtMRResTpoD_Jsonclick = "" ;
      dynMRResTpo.setJsonclick( "" );
      edtMRResFch_Jsonclick = "" ;
      edtMRResOrd_Jsonclick = "" ;
      edtMRRes_Jsonclick = "" ;
      subGridlevel_level2_Class = "GridNoBorder WorkWith" ;
      subGridlevel_level2_Backcolorstyle = (byte)(0) ;
      edtMRMovPre_Jsonclick = "" ;
      edtMRMovCnt_Jsonclick = "" ;
      edtMRMovDsc_Jsonclick = "" ;
      edtMRMovTpoD_Jsonclick = "" ;
      dynMRMovTpo.setJsonclick( "" );
      edtMRMovFch_Jsonclick = "" ;
      edtMRMovOrd_Jsonclick = "" ;
      edtMRMov_Jsonclick = "" ;
      subGridlevel_level1_Class = "GridNoBorder WorkWith" ;
      subGridlevel_level1_Backcolorstyle = (byte)(0) ;
      chkMRPrvHab.setCaption( "" );
      edtPrvNom_Jsonclick = "" ;
      edtPrvNum_Jsonclick = "" ;
      subGridlevel_prv_Class = "GridNoBorder WorkWith" ;
      subGridlevel_prv_Backcolorstyle = (byte)(0) ;
      Combo_prvnum_Titlecontrolidtoreplace = "" ;
      edtMRResCnt_Enabled = 1 ;
      edtMRResDsc_Enabled = 1 ;
      edtMRResTpoD_Enabled = 0 ;
      dynMRResTpo.setEnabled( 1 );
      edtMRResFch_Enabled = 1 ;
      edtMRResOrd_Enabled = 1 ;
      edtMRRes_Enabled = 0 ;
      edtMRMovPre_Enabled = 0 ;
      edtMRMovCnt_Enabled = 1 ;
      edtMRMovDsc_Enabled = 1 ;
      edtMRMovTpoD_Enabled = 0 ;
      dynMRMovTpo.setEnabled( 1 );
      edtMRMovFch_Enabled = 1 ;
      edtMRMovOrd_Enabled = 1 ;
      edtMRMov_Enabled = 0 ;
      chkMRPrvHab.setEnabled( 1 );
      edtPrvNom_Enabled = 0 ;
      edtPrvNum_Enabled = 1 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Enabled = 0 ;
      edtEmprNom_Visible = 1 ;
      edtEmprCod_Jsonclick = "" ;
      edtEmprCod_Enabled = 1 ;
      edtEmprCod_Visible = 1 ;
      edtMRUltRes_Jsonclick = "" ;
      edtMRUltRes_Enabled = 0 ;
      edtMRUltRes_Visible = 1 ;
      edtMRUltMov_Jsonclick = "" ;
      edtMRUltMov_Enabled = 0 ;
      edtMRUltMov_Visible = 1 ;
      Combo_prvnum_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_prvnum_Isgriditem = GXutil.toBoolean( -1) ;
      Combo_prvnum_Cls = "ExtendedCombo" ;
      Combo_prvnum_Caption = "" ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      bttBtntrn_delete_Enabled = 0 ;
      bttBtntrn_delete_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      divTabtablelevel_level2_Visible = 1 ;
      divTabtablelevel_level1_Visible = 1 ;
      edtMRStkRes_Jsonclick = "" ;
      edtMRStkRes_Enabled = 0 ;
      edtMRStkAct_Jsonclick = "" ;
      edtMRStkAct_Enabled = 0 ;
      edtMRStkCri_Jsonclick = "" ;
      edtMRStkCri_Enabled = 1 ;
      edtMRStkMin_Jsonclick = "" ;
      edtMRStkMin_Enabled = 1 ;
      edtMRStkPre_Jsonclick = "" ;
      edtMRStkPre_Enabled = 1 ;
      edtMRLote_Jsonclick = "" ;
      edtMRLote_Enabled = 1 ;
      edtMRCodPrv_Jsonclick = "" ;
      edtMRCodPrv_Enabled = 1 ;
      edtMRCodExt_Jsonclick = "" ;
      edtMRCodExt_Enabled = 1 ;
      chkMRActivo.setEnabled( 1 );
      edtMRNom_Jsonclick = "" ;
      edtMRNom_Enabled = 1 ;
      edtMRCod_Jsonclick = "" ;
      edtMRCod_Enabled = 1 ;
      Gxuitabspanel_tabs_Historymanagement = GXutil.toBoolean( 0) ;
      Gxuitabspanel_tabs_Class = "" ;
      Gxuitabspanel_tabs_Pagecount = 4 ;
      Dvpanel_opciones_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_opciones_Iconposition = "Right" ;
      Dvpanel_opciones_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_opciones_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_opciones_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_opciones_Title = "" ;
      Dvpanel_opciones_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_opciones_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_opciones_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_opciones_Width = "100%" ;
      edtPrvNum_Horizontalalignment = "right" ;
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

   public void gxdlamrmovtpo13W1239( String A396EmprCod )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxdlamrmovtpo_data13W1239( A396EmprCod) ;
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

   public void gxamrmovtpo_html13W1239( String A396EmprCod )
   {
      int gxdynajaxvalue;
      gxdlamrmovtpo_data13W1239( A396EmprCod) ;
      gxdynajaxindex = 1 ;
      if ( ! ( gxdyncontrolsrefreshing && httpContext.isAjaxRequest( ) ) )
      {
         dynMRMovTpo.removeAllItems();
      }
      while ( gxdynajaxindex <= gxdynajaxctrlcodr.getCount() )
      {
         gxdynajaxvalue = (int)(GXutil.lval( gxdynajaxctrlcodr.item(gxdynajaxindex))) ;
         dynMRMovTpo.addItem(GXutil.trim( GXutil.str( gxdynajaxvalue, 8, 0)), gxdynajaxctrldescr.item(gxdynajaxindex), (short)(0));
         gxdynajaxindex = (int)(gxdynajaxindex+1) ;
      }
   }

   protected void gxdlamrmovtpo_data13W1239( String A396EmprCod )
   {
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      /* Using cursor T013W58 */
      pr_default.execute(56, new Object[] {A396EmprCod});
      while ( (pr_default.getStatus(56) != 101) )
      {
         gxdynajaxctrlcodr.add(GXutil.ltrim( localUtil.ntoc( T013W58_A9505MRMovTpo[0], (byte)(8), (byte)(0), ".", "")));
         gxdynajaxctrldescr.add(GXutil.rtrim( T013W58_A9506MRMovTpoD[0]));
         pr_default.readNext(56);
      }
      pr_default.close(56);
   }

   public void gxdlamrrestpo13W1240( String A396EmprCod )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxdlamrrestpo_data13W1240( A396EmprCod) ;
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

   public void gxamrrestpo_html13W1240( String A396EmprCod )
   {
      int gxdynajaxvalue;
      gxdlamrrestpo_data13W1240( A396EmprCod) ;
      gxdynajaxindex = 1 ;
      if ( ! ( gxdyncontrolsrefreshing && httpContext.isAjaxRequest( ) ) )
      {
         dynMRResTpo.removeAllItems();
      }
      while ( gxdynajaxindex <= gxdynajaxctrlcodr.getCount() )
      {
         gxdynajaxvalue = (int)(GXutil.lval( gxdynajaxctrlcodr.item(gxdynajaxindex))) ;
         dynMRResTpo.addItem(GXutil.trim( GXutil.str( gxdynajaxvalue, 8, 0)), gxdynajaxctrldescr.item(gxdynajaxindex), (short)(0));
         gxdynajaxindex = (int)(gxdynajaxindex+1) ;
      }
   }

   protected void gxdlamrrestpo_data13W1240( String A396EmprCod )
   {
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      /* Using cursor T013W59 */
      pr_default.execute(57, new Object[] {A396EmprCod});
      while ( (pr_default.getStatus(57) != 101) )
      {
         gxdynajaxctrlcodr.add(GXutil.ltrim( localUtil.ntoc( T013W59_A9513MRResTpo[0], (byte)(8), (byte)(0), ".", "")));
         gxdynajaxctrldescr.add(GXutil.rtrim( T013W59_A9514MRResTpoD[0]));
         pr_default.readNext(57);
      }
      pr_default.close(57);
   }

   public void gx4asamrcod13W1238( int AV13MRCod )
   {
      if ( ! (0==AV13MRCod) )
      {
         A9492MRCod = AV13MRCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A9492MRCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9492MRCod), 8, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A9492MRCod, (byte)(8), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gx5asamrcod13W1238( byte AV16Artextil ,
                                   byte AV17NumManual ,
                                   String Gx_mode ,
                                   String A396EmprCod )
   {
      if ( isIns( )  && true /* After */ && ! ( ! (0==AV16Artextil) || ! (0==AV17NumManual) ) )
      {
         GXt_int12 = A9492MRCod ;
         GXv_int13[0] = GXt_int12 ;
         new app.pnumdoc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "MNTREP", ""), ""), GXv_int13) ;
         tmrepue_impl.this.GXt_int12 = GXv_int13[0] ;
         A9492MRCod = GXt_int12 ;
         httpContext.ajax_rsp_assign_attri("", false, "A9492MRCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9492MRCod), 8, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A9492MRCod, (byte)(8), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gxnrgridlevel_prv_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_921473( ) ;
      while ( nGXsfl_92_idx <= nRC_GXsfl_92 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal13W1473( ) ;
         standaloneModal13W1473( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow13W1473( ) ;
         nGXsfl_92_idx = (int)(nGXsfl_92_idx+1) ;
         sGXsfl_92_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_92_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_921473( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Gridlevel_prvContainer)) ;
      /* End function gxnrGridlevel_prv_newrow */
   }

   public void gxnrgridlevel_level1_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_1061239( ) ;
      while ( nGXsfl_106_idx <= nRC_GXsfl_106 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal13W1239( ) ;
         standaloneModal13W1239( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow13W1239( ) ;
         nGXsfl_106_idx = (int)(nGXsfl_106_idx+1) ;
         sGXsfl_106_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_106_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1061239( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Gridlevel_level1Container)) ;
      /* End function gxnrGridlevel_level1_newrow */
   }

   public void gxnrgridlevel_level2_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_1251240( ) ;
      while ( nGXsfl_125_idx <= nRC_GXsfl_125 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal13W1240( ) ;
         standaloneModal13W1240( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow13W1240( ) ;
         nGXsfl_125_idx = (int)(nGXsfl_125_idx+1) ;
         sGXsfl_125_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_125_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1251240( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Gridlevel_level2Container)) ;
      /* End function gxnrGridlevel_level2_newrow */
   }

   public void init_web_controls( )
   {
      chkMRActivo.setName( "MRACTIVO" );
      chkMRActivo.setWebtags( "" );
      chkMRActivo.setCaption( httpContext.getMessage( "Activo?", "") );
      httpContext.ajax_rsp_assign_prop("", false, chkMRActivo.getInternalname(), "TitleCaption", chkMRActivo.getCaption(), true);
      chkMRActivo.setCheckedValue( "N" );
      if ( isIns( ) && (GXutil.strcmp("", A12850MRActivo)==0) )
      {
         A12850MRActivo = httpContext.getMessage( "S", "") ;
         n12850MRActivo = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12850MRActivo", A12850MRActivo);
      }
      GXCCtl = "MRPRVHAB_" + sGXsfl_92_idx ;
      chkMRPrvHab.setName( GXCCtl );
      chkMRPrvHab.setWebtags( "" );
      chkMRPrvHab.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkMRPrvHab.getInternalname(), "TitleCaption", chkMRPrvHab.getCaption(), !bGXsfl_92_Refreshing);
      chkMRPrvHab.setCheckedValue( "0" );
      A11056MRPrvHab = (byte)(((GXutil.strcmp(GXutil.ltrim( localUtil.ntoc( A11056MRPrvHab, (byte)(1), (byte)(0), ".", "")), "1")==0) ? 1 : 0)) ;
      GXCCtl = "MRMOVTPO_" + sGXsfl_106_idx ;
      dynMRMovTpo.setName( GXCCtl );
      dynMRMovTpo.setWebtags( "" );
      GXCCtl = "MRRESTPO_" + sGXsfl_125_idx ;
      dynMRResTpo.setName( GXCCtl );
      dynMRResTpo.setWebtags( "" );
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
      A9505MRMovTpo = (int)(GXutil.lval( dynMRMovTpo.getValue())) ;
      A9513MRResTpo = (int)(GXutil.lval( dynMRResTpo.getValue())) ;
      n407EmprNom = false ;
      /* Using cursor T013W22 */
      pr_default.execute(20, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(20) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A407EmprNom = T013W22_A407EmprNom[0] ;
      n407EmprNom = T013W22_n407EmprNom[0] ;
      pr_default.close(20);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
   }

   public void valid_Prvnum( )
   {
      A9505MRMovTpo = (int)(GXutil.lval( dynMRMovTpo.getValue())) ;
      A9513MRResTpo = (int)(GXutil.lval( dynMRResTpo.getValue())) ;
      n794PrvNom = false ;
      /* Using cursor T013W40 */
      pr_default.execute(38, new Object[] {A396EmprCod, Integer.valueOf(A795PrvNum)});
      if ( (pr_default.getStatus(38) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRVGEN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRVNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrvNum_Internalname ;
      }
      A794PrvNom = T013W40_A794PrvNom[0] ;
      n794PrvNom = T013W40_n794PrvNom[0] ;
      pr_default.close(38);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A794PrvNom", GXutil.rtrim( A794PrvNom));
   }

   public void valid_Mrmovtpo( )
   {
      n9506MRMovTpoD = false ;
      A9505MRMovTpo = (int)(GXutil.lval( dynMRMovTpo.getValue())) ;
      A9513MRResTpo = (int)(GXutil.lval( dynMRResTpo.getValue())) ;
      /* Using cursor T013W48 */
      pr_default.execute(46, new Object[] {A396EmprCod, Integer.valueOf(A9505MRMovTpo)});
      if ( (pr_default.getStatus(46) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MOMovTpo", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MRMOVTPO");
         AnyError = (short)(1) ;
         GX_FocusControl = dynMRMovTpo.getInternalname() ;
      }
      A9506MRMovTpoD = T013W48_A9506MRMovTpoD[0] ;
      n9506MRMovTpoD = T013W48_n9506MRMovTpoD[0] ;
      pr_default.close(46);
      if ( isIns( )  && (GXutil.strcmp("", A9507MRMovDsc)==0) && ( Gx_BScreen == 0 ) )
      {
         A9507MRMovDsc = A9506MRMovTpoD ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A9506MRMovTpoD", GXutil.rtrim( A9506MRMovTpoD));
      httpContext.ajax_rsp_assign_attri("", false, "A9507MRMovDsc", GXutil.rtrim( A9507MRMovDsc));
   }

   public void valid_Mrrestpo( )
   {
      n9514MRResTpoD = false ;
      A9505MRMovTpo = (int)(GXutil.lval( dynMRMovTpo.getValue())) ;
      A9513MRResTpo = (int)(GXutil.lval( dynMRResTpo.getValue())) ;
      /* Using cursor T013W60 */
      pr_default.execute(58, new Object[] {A396EmprCod, Integer.valueOf(A9513MRResTpo)});
      if ( (pr_default.getStatus(58) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MRResTpo", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MRRESTPO");
         AnyError = (short)(1) ;
         GX_FocusControl = dynMRResTpo.getInternalname() ;
      }
      A9514MRResTpoD = T013W60_A9514MRResTpoD[0] ;
      n9514MRResTpoD = T013W60_n9514MRResTpoD[0] ;
      pr_default.close(58);
      if ( isIns( )  && (GXutil.strcmp("", A9515MRResDsc)==0) && ( Gx_BScreen == 0 ) )
      {
         A9515MRResDsc = A9514MRResTpoD ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A9514MRResTpoD", GXutil.rtrim( A9514MRResTpoD));
      httpContext.ajax_rsp_assign_attri("", false, "A9515MRResDsc", GXutil.rtrim( A9515MRResDsc));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV20EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV13MRCod',fld:'vMRCOD',pic:'ZZZZZZZ9',hsh:true},{av:'A12850MRActivo',fld:'MRACTIVO',pic:''}]");
      setEventMetadata("ENTER",",oparms:[{av:'A12850MRActivo',fld:'MRACTIVO',pic:''}]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV22TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true},{av:'AV20EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV13MRCod',fld:'vMRCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV34Pgmname',fld:'vPGMNAME',pic:''},{av:'A12850MRActivo',fld:'MRACTIVO',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[{av:'A12850MRActivo',fld:'MRACTIVO',pic:''}]}");
      setEventMetadata("AFTER TRN","{handler:'e1213W2',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'A9493MRNom',fld:'MRNOM',pic:''},{av:'AV20EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'A9492MRCod',fld:'MRCOD',pic:'ZZZZZZZ9'},{av:'AV22TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true},{av:'A12850MRActivo',fld:'MRACTIVO',pic:''}]");
      setEventMetadata("AFTER TRN",",oparms:[{av:'A12850MRActivo',fld:'MRACTIVO',pic:''}]}");
      setEventMetadata("VALID_MRCOD","{handler:'valid_Mrcod',iparms:[{av:'A12850MRActivo',fld:'MRACTIVO',pic:''}]");
      setEventMetadata("VALID_MRCOD",",oparms:[{av:'A12850MRActivo',fld:'MRACTIVO',pic:''}]}");
      setEventMetadata("VALID_MRNOM","{handler:'valid_Mrnom',iparms:[{av:'A12850MRActivo',fld:'MRACTIVO',pic:''}]");
      setEventMetadata("VALID_MRNOM",",oparms:[{av:'A12850MRActivo',fld:'MRACTIVO',pic:''}]}");
      setEventMetadata("VALID_MRSTKPRE","{handler:'valid_Mrstkpre',iparms:[{av:'A12850MRActivo',fld:'MRACTIVO',pic:''}]");
      setEventMetadata("VALID_MRSTKPRE",",oparms:[{av:'A12850MRActivo',fld:'MRACTIVO',pic:''}]}");
      setEventMetadata("VALID_MRULTMOV","{handler:'valid_Mrultmov',iparms:[{av:'A12850MRActivo',fld:'MRACTIVO',pic:''}]");
      setEventMetadata("VALID_MRULTMOV",",oparms:[{av:'A12850MRActivo',fld:'MRACTIVO',pic:''}]}");
      setEventMetadata("VALID_MRULTRES","{handler:'valid_Mrultres',iparms:[{av:'A12850MRActivo',fld:'MRACTIVO',pic:''}]");
      setEventMetadata("VALID_MRULTRES",",oparms:[{av:'A12850MRActivo',fld:'MRACTIVO',pic:''}]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynMRMovTpo'},{av:'A9505MRMovTpo',fld:'MRMOVTPO',pic:'ZZZZZZZ9'},{av:'dynMRResTpo'},{av:'A9513MRResTpo',fld:'MRRESTPO',pic:'ZZZZZZZ9'},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A12850MRActivo',fld:'MRACTIVO',pic:''}]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A12850MRActivo',fld:'MRACTIVO',pic:''}]}");
      setEventMetadata("VALID_PRVNUM","{handler:'valid_Prvnum',iparms:[{av:'A795PrvNum',fld:'PRVNUM',pic:'ZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynMRMovTpo'},{av:'A9505MRMovTpo',fld:'MRMOVTPO',pic:'ZZZZZZZ9'},{av:'dynMRResTpo'},{av:'A9513MRResTpo',fld:'MRRESTPO',pic:'ZZZZZZZ9'},{av:'A794PrvNom',fld:'PRVNOM',pic:''},{av:'A12850MRActivo',fld:'MRACTIVO',pic:''}]");
      setEventMetadata("VALID_PRVNUM",",oparms:[{av:'A794PrvNom',fld:'PRVNOM',pic:''},{av:'A12850MRActivo',fld:'MRACTIVO',pic:''}]}");
      setEventMetadata("NULL","{handler:'valid_Mrprvhab',iparms:[{av:'A12850MRActivo',fld:'MRACTIVO',pic:''}]");
      setEventMetadata("NULL",",oparms:[{av:'A12850MRActivo',fld:'MRACTIVO',pic:''}]}");
      setEventMetadata("VALID_MRMOV","{handler:'valid_Mrmov',iparms:[{av:'A12850MRActivo',fld:'MRACTIVO',pic:''}]");
      setEventMetadata("VALID_MRMOV",",oparms:[{av:'A12850MRActivo',fld:'MRACTIVO',pic:''}]}");
      setEventMetadata("VALID_MRMOVTPO","{handler:'valid_Mrmovtpo',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'A9506MRMovTpoD',fld:'MRMOVTPOD',pic:''},{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynMRMovTpo'},{av:'A9505MRMovTpo',fld:'MRMOVTPO',pic:'ZZZZZZZ9'},{av:'dynMRResTpo'},{av:'A9513MRResTpo',fld:'MRRESTPO',pic:'ZZZZZZZ9'},{av:'A9507MRMovDsc',fld:'MRMOVDSC',pic:''},{av:'A12850MRActivo',fld:'MRACTIVO',pic:''}]");
      setEventMetadata("VALID_MRMOVTPO",",oparms:[{av:'A9506MRMovTpoD',fld:'MRMOVTPOD',pic:''},{av:'A9507MRMovDsc',fld:'MRMOVDSC',pic:''},{av:'A12850MRActivo',fld:'MRACTIVO',pic:''}]}");
      setEventMetadata("VALID_MRMOVTPOD","{handler:'valid_Mrmovtpod',iparms:[{av:'A12850MRActivo',fld:'MRACTIVO',pic:''}]");
      setEventMetadata("VALID_MRMOVTPOD",",oparms:[{av:'A12850MRActivo',fld:'MRACTIVO',pic:''}]}");
      setEventMetadata("VALID_MRMOVCNT","{handler:'valid_Mrmovcnt',iparms:[{av:'A12850MRActivo',fld:'MRACTIVO',pic:''}]");
      setEventMetadata("VALID_MRMOVCNT",",oparms:[{av:'A12850MRActivo',fld:'MRACTIVO',pic:''}]}");
      setEventMetadata("NULL","{handler:'valid_Mrmovpre',iparms:[{av:'A12850MRActivo',fld:'MRACTIVO',pic:''}]");
      setEventMetadata("NULL",",oparms:[{av:'A12850MRActivo',fld:'MRACTIVO',pic:''}]}");
      setEventMetadata("VALID_MRRES","{handler:'valid_Mrres',iparms:[{av:'A12850MRActivo',fld:'MRACTIVO',pic:''}]");
      setEventMetadata("VALID_MRRES",",oparms:[{av:'A12850MRActivo',fld:'MRACTIVO',pic:''}]}");
      setEventMetadata("VALID_MRRESTPO","{handler:'valid_Mrrestpo',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'A9514MRResTpoD',fld:'MRRESTPOD',pic:''},{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynMRMovTpo'},{av:'A9505MRMovTpo',fld:'MRMOVTPO',pic:'ZZZZZZZ9'},{av:'dynMRResTpo'},{av:'A9513MRResTpo',fld:'MRRESTPO',pic:'ZZZZZZZ9'},{av:'A9515MRResDsc',fld:'MRRESDSC',pic:''},{av:'A12850MRActivo',fld:'MRACTIVO',pic:''}]");
      setEventMetadata("VALID_MRRESTPO",",oparms:[{av:'A9514MRResTpoD',fld:'MRRESTPOD',pic:''},{av:'A9515MRResDsc',fld:'MRRESDSC',pic:''},{av:'A12850MRActivo',fld:'MRACTIVO',pic:''}]}");
      setEventMetadata("VALID_MRRESTPOD","{handler:'valid_Mrrestpod',iparms:[{av:'A12850MRActivo',fld:'MRACTIVO',pic:''}]");
      setEventMetadata("VALID_MRRESTPOD",",oparms:[{av:'A12850MRActivo',fld:'MRACTIVO',pic:''}]}");
      setEventMetadata("VALID_MRRESCNT","{handler:'valid_Mrrescnt',iparms:[{av:'A12850MRActivo',fld:'MRACTIVO',pic:''}]");
      setEventMetadata("VALID_MRRESCNT",",oparms:[{av:'A12850MRActivo',fld:'MRACTIVO',pic:''}]}");
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
      pr_default.close(58);
      pr_default.close(54);
      pr_default.close(46);
      pr_default.close(38);
      pr_default.close(20);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      wcpOAV20EmprCod = "" ;
      Z396EmprCod = "" ;
      Z9493MRNom = "" ;
      Z9494MRCodExt = "" ;
      Z11458MRCodPrv = "" ;
      Z9495MRStkAct = DecimalUtil.ZERO ;
      Z9496MRStkRes = DecimalUtil.ZERO ;
      Z9497MRStkMin = DecimalUtil.ZERO ;
      Z9498MRStkCri = DecimalUtil.ZERO ;
      Z9499MRStkPre = DecimalUtil.ZERO ;
      Z12850MRActivo = "" ;
      Z14491MRLote = "" ;
      O9496MRStkRes = DecimalUtil.ZERO ;
      O9495MRStkAct = DecimalUtil.ZERO ;
      Z9509MRMovPre = DecimalUtil.ZERO ;
      Z9507MRMovDsc = "" ;
      Z9504MRMovFch = GXutil.resetTime( GXutil.nullDate() );
      Z9508MRMovCnt = DecimalUtil.ZERO ;
      O9508MRMovCnt = DecimalUtil.ZERO ;
      Z9515MRResDsc = "" ;
      Z9512MRResFch = GXutil.resetTime( GXutil.nullDate() );
      Z9516MRResCnt = DecimalUtil.ZERO ;
      O9516MRResCnt = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      Gx_mode = "" ;
      AV20EmprCod = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      A9499MRStkPre = DecimalUtil.ZERO ;
      A12850MRActivo = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_opciones = new com.genexus.webpanels.GXUserControl();
      ucGxuitabspanel_tabs = new com.genexus.webpanels.GXUserControl();
      lblTabgeneral_title_Jsonclick = "" ;
      TempTags = "" ;
      A9493MRNom = "" ;
      A9494MRCodExt = "" ;
      A11458MRCodPrv = "" ;
      A14491MRLote = "" ;
      A9497MRStkMin = DecimalUtil.ZERO ;
      A9498MRStkCri = DecimalUtil.ZERO ;
      A9495MRStkAct = DecimalUtil.ZERO ;
      A9496MRStkRes = DecimalUtil.ZERO ;
      lblTablevel_prv_title_Jsonclick = "" ;
      lblTablevel_level1_title_Jsonclick = "" ;
      lblTablevel_level2_title_Jsonclick = "" ;
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      AV34Pgmname = "" ;
      ucCombo_prvnum = new com.genexus.webpanels.GXUserControl();
      AV32DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV30PrvNum_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      A407EmprNom = "" ;
      Gridlevel_prvContainer = new com.genexus.webpanels.GXWebGrid(context);
      B9496MRStkRes = DecimalUtil.ZERO ;
      B9495MRStkAct = DecimalUtil.ZERO ;
      sMode1473 = "" ;
      sStyleString = "" ;
      Gridlevel_level1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1239 = "" ;
      Gridlevel_level2Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1240 = "" ;
      A13718MRCNom = "" ;
      Gxuitabspanel_tabs_Objectcall = "" ;
      Gxuitabspanel_tabs_Activepagecontrolname = "" ;
      Dvpanel_opciones_Objectcall = "" ;
      Dvpanel_opciones_Class = "" ;
      Dvpanel_opciones_Height = "" ;
      Combo_prvnum_Objectcall = "" ;
      Combo_prvnum_Class = "" ;
      Combo_prvnum_Icontype = "" ;
      Combo_prvnum_Icon = "" ;
      Combo_prvnum_Tooltip = "" ;
      Combo_prvnum_Selectedvalue_set = "" ;
      Combo_prvnum_Selectedvalue_get = "" ;
      Combo_prvnum_Selectedtext_set = "" ;
      Combo_prvnum_Selectedtext_get = "" ;
      Combo_prvnum_Gamoauthtoken = "" ;
      Combo_prvnum_Ddointernalname = "" ;
      Combo_prvnum_Titlecontrolalign = "" ;
      Combo_prvnum_Dropdownoptionstype = "" ;
      Combo_prvnum_Datalisttype = "" ;
      Combo_prvnum_Datalistfixedvalues = "" ;
      Combo_prvnum_Datalistproc = "" ;
      Combo_prvnum_Datalistprocparametersprefix = "" ;
      Combo_prvnum_Remoteservicesparameters = "" ;
      Combo_prvnum_Htmltemplate = "" ;
      Combo_prvnum_Multiplevaluestype = "" ;
      Combo_prvnum_Loadingdata = "" ;
      Combo_prvnum_Noresultsfound = "" ;
      Combo_prvnum_Emptyitemtext = "" ;
      Combo_prvnum_Onlyselectedvalues = "" ;
      Combo_prvnum_Selectalltext = "" ;
      Combo_prvnum_Multiplevaluesseparator = "" ;
      Combo_prvnum_Addnewoptiontext = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode1238 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      s9496MRStkRes = DecimalUtil.ZERO ;
      A9512MRResFch = GXutil.resetTime( GXutil.nullDate() );
      A9514MRResTpoD = "" ;
      A9515MRResDsc = "" ;
      A9516MRResCnt = DecimalUtil.ZERO ;
      T9516MRResCnt = DecimalUtil.ZERO ;
      s9495MRStkAct = DecimalUtil.ZERO ;
      A9504MRMovFch = GXutil.resetTime( GXutil.nullDate() );
      A9506MRMovTpoD = "" ;
      A9507MRMovDsc = "" ;
      A9508MRMovCnt = DecimalUtil.ZERO ;
      A9509MRMovPre = DecimalUtil.ZERO ;
      T9508MRMovCnt = DecimalUtil.ZERO ;
      GXCCtl = "" ;
      A794PrvNom = "" ;
      AV7Lit0 = "" ;
      AV10Lit1 = "" ;
      AV9LitFe = "" ;
      AV11Station = "" ;
      AV27ObtenerEmprCod = "" ;
      AV14EmprNom = "" ;
      AV8UsurCod = "" ;
      GXv_int6 = new byte[1] ;
      GXt_char1 = "" ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      AV24WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV22TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV23WebSession = httpContext.getWebSession();
      AV26mensaje = "" ;
      GXt_objcol_SdtDVB_SDTComboData_Item10 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV31ComboSelectedValue = "" ;
      GXv_char4 = new String[1] ;
      GXv_objcol_SdtDVB_SDTComboData_Item11 = new GXBaseCollection[1] ;
      Z407EmprNom = "" ;
      T013W13_A407EmprNom = new String[] {""} ;
      T013W13_n407EmprNom = new boolean[] {false} ;
      T013W14_A9492MRCod = new int[1] ;
      T013W14_A407EmprNom = new String[] {""} ;
      T013W14_n407EmprNom = new boolean[] {false} ;
      T013W14_A9493MRNom = new String[] {""} ;
      T013W14_n9493MRNom = new boolean[] {false} ;
      T013W14_A9494MRCodExt = new String[] {""} ;
      T013W14_n9494MRCodExt = new boolean[] {false} ;
      T013W14_A11458MRCodPrv = new String[] {""} ;
      T013W14_n11458MRCodPrv = new boolean[] {false} ;
      T013W14_A9495MRStkAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013W14_n9495MRStkAct = new boolean[] {false} ;
      T013W14_A9496MRStkRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013W14_n9496MRStkRes = new boolean[] {false} ;
      T013W14_A9497MRStkMin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013W14_n9497MRStkMin = new boolean[] {false} ;
      T013W14_A9498MRStkCri = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013W14_n9498MRStkCri = new boolean[] {false} ;
      T013W14_A9499MRStkPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013W14_n9499MRStkPre = new boolean[] {false} ;
      T013W14_A9500MRUltMov = new int[1] ;
      T013W14_n9500MRUltMov = new boolean[] {false} ;
      T013W14_A9501MRUltRes = new long[1] ;
      T013W14_n9501MRUltRes = new boolean[] {false} ;
      T013W14_A12850MRActivo = new String[] {""} ;
      T013W14_n12850MRActivo = new boolean[] {false} ;
      T013W14_A14491MRLote = new String[] {""} ;
      T013W14_A396EmprCod = new String[] {""} ;
      T013W15_A407EmprNom = new String[] {""} ;
      T013W15_n407EmprNom = new boolean[] {false} ;
      T013W16_A396EmprCod = new String[] {""} ;
      T013W16_A9492MRCod = new int[1] ;
      T013W12_A9492MRCod = new int[1] ;
      T013W12_A9493MRNom = new String[] {""} ;
      T013W12_n9493MRNom = new boolean[] {false} ;
      T013W12_A9494MRCodExt = new String[] {""} ;
      T013W12_n9494MRCodExt = new boolean[] {false} ;
      T013W12_A11458MRCodPrv = new String[] {""} ;
      T013W12_n11458MRCodPrv = new boolean[] {false} ;
      T013W12_A9495MRStkAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013W12_n9495MRStkAct = new boolean[] {false} ;
      T013W12_A9496MRStkRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013W12_n9496MRStkRes = new boolean[] {false} ;
      T013W12_A9497MRStkMin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013W12_n9497MRStkMin = new boolean[] {false} ;
      T013W12_A9498MRStkCri = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013W12_n9498MRStkCri = new boolean[] {false} ;
      T013W12_A9499MRStkPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013W12_n9499MRStkPre = new boolean[] {false} ;
      T013W12_A9500MRUltMov = new int[1] ;
      T013W12_n9500MRUltMov = new boolean[] {false} ;
      T013W12_A9501MRUltRes = new long[1] ;
      T013W12_n9501MRUltRes = new boolean[] {false} ;
      T013W12_A12850MRActivo = new String[] {""} ;
      T013W12_n12850MRActivo = new boolean[] {false} ;
      T013W12_A14491MRLote = new String[] {""} ;
      T013W12_A396EmprCod = new String[] {""} ;
      T013W17_A396EmprCod = new String[] {""} ;
      T013W17_A9492MRCod = new int[1] ;
      T013W18_A396EmprCod = new String[] {""} ;
      T013W18_A9492MRCod = new int[1] ;
      T013W11_A9492MRCod = new int[1] ;
      T013W11_A9493MRNom = new String[] {""} ;
      T013W11_n9493MRNom = new boolean[] {false} ;
      T013W11_A9494MRCodExt = new String[] {""} ;
      T013W11_n9494MRCodExt = new boolean[] {false} ;
      T013W11_A11458MRCodPrv = new String[] {""} ;
      T013W11_n11458MRCodPrv = new boolean[] {false} ;
      T013W11_A9495MRStkAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013W11_n9495MRStkAct = new boolean[] {false} ;
      T013W11_A9496MRStkRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013W11_n9496MRStkRes = new boolean[] {false} ;
      T013W11_A9497MRStkMin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013W11_n9497MRStkMin = new boolean[] {false} ;
      T013W11_A9498MRStkCri = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013W11_n9498MRStkCri = new boolean[] {false} ;
      T013W11_A9499MRStkPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013W11_n9499MRStkPre = new boolean[] {false} ;
      T013W11_A9500MRUltMov = new int[1] ;
      T013W11_n9500MRUltMov = new boolean[] {false} ;
      T013W11_A9501MRUltRes = new long[1] ;
      T013W11_n9501MRUltRes = new boolean[] {false} ;
      T013W11_A12850MRActivo = new String[] {""} ;
      T013W11_n12850MRActivo = new boolean[] {false} ;
      T013W11_A14491MRLote = new String[] {""} ;
      T013W11_A396EmprCod = new String[] {""} ;
      T013W22_A407EmprNom = new String[] {""} ;
      T013W22_n407EmprNom = new boolean[] {false} ;
      T013W23_A396EmprCod = new String[] {""} ;
      T013W23_A602MaqCod = new String[] {""} ;
      T013W23_A11438MaqEquCod = new String[] {""} ;
      T013W23_A11439MaqSEqCod = new String[] {""} ;
      T013W23_A11440MaqPieCod = new String[] {""} ;
      T013W23_A9492MRCod = new int[1] ;
      T013W24_A396EmprCod = new String[] {""} ;
      T013W24_A11055MComCod = new long[1] ;
      T013W24_A9492MRCod = new int[1] ;
      T013W25_A396EmprCod = new String[] {""} ;
      T013W25_A1061MRPriCod = new int[1] ;
      T013W25_A1063MRComCod = new int[1] ;
      T013W26_A396EmprCod = new String[] {""} ;
      T013W26_A1061MRPriCod = new int[1] ;
      T013W27_A396EmprCod = new String[] {""} ;
      T013W27_A9430TMCod = new int[1] ;
      T013W27_A9525TMRepCod = new int[1] ;
      T013W28_A396EmprCod = new String[] {""} ;
      T013W28_A9429PMCod = new int[1] ;
      T013W28_A9489PMRepCod = new int[1] ;
      T013W29_A396EmprCod = new String[] {""} ;
      T013W29_A9425OMCod = new int[1] ;
      T013W29_A9446OMRepCod = new int[1] ;
      T013W29_A9449OMRTpo = new String[] {""} ;
      T013W30_A396EmprCod = new String[] {""} ;
      T013W30_A9412MMSCod = new int[1] ;
      T013W30_A9421MMSRCod = new int[1] ;
      T013W31_A396EmprCod = new String[] {""} ;
      T013W31_A9398MISCod = new int[1] ;
      T013W31_A9403MISRCod = new int[1] ;
      T013W33_A396EmprCod = new String[] {""} ;
      T013W33_A9492MRCod = new int[1] ;
      Z794PrvNom = "" ;
      T013W34_A9492MRCod = new int[1] ;
      T013W34_A794PrvNom = new String[] {""} ;
      T013W34_n794PrvNom = new boolean[] {false} ;
      T013W34_A11056MRPrvHab = new byte[1] ;
      T013W34_A396EmprCod = new String[] {""} ;
      T013W34_A795PrvNum = new int[1] ;
      T013W10_A794PrvNom = new String[] {""} ;
      T013W10_n794PrvNom = new boolean[] {false} ;
      T013W35_A794PrvNom = new String[] {""} ;
      T013W35_n794PrvNom = new boolean[] {false} ;
      T013W36_A396EmprCod = new String[] {""} ;
      T013W36_A9492MRCod = new int[1] ;
      T013W36_A795PrvNum = new int[1] ;
      T013W9_A9492MRCod = new int[1] ;
      T013W9_A11056MRPrvHab = new byte[1] ;
      T013W9_A396EmprCod = new String[] {""} ;
      T013W9_A795PrvNum = new int[1] ;
      T013W8_A9492MRCod = new int[1] ;
      T013W8_A11056MRPrvHab = new byte[1] ;
      T013W8_A396EmprCod = new String[] {""} ;
      T013W8_A795PrvNum = new int[1] ;
      T013W40_A794PrvNom = new String[] {""} ;
      T013W40_n794PrvNom = new boolean[] {false} ;
      T013W41_A396EmprCod = new String[] {""} ;
      T013W41_A9492MRCod = new int[1] ;
      T013W41_A795PrvNum = new int[1] ;
      Z9506MRMovTpoD = "" ;
      T013W7_A9506MRMovTpoD = new String[] {""} ;
      T013W7_n9506MRMovTpoD = new boolean[] {false} ;
      T013W42_A9492MRCod = new int[1] ;
      T013W42_A9502MRMov = new long[1] ;
      T013W42_A9509MRMovPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013W42_A9507MRMovDsc = new String[] {""} ;
      T013W42_A9503MRMovOrd = new int[1] ;
      T013W42_A9504MRMovFch = new java.util.Date[] {GXutil.nullDate()} ;
      T013W42_A9506MRMovTpoD = new String[] {""} ;
      T013W42_n9506MRMovTpoD = new boolean[] {false} ;
      T013W42_A9508MRMovCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013W42_A396EmprCod = new String[] {""} ;
      T013W42_A9505MRMovTpo = new int[1] ;
      T013W43_A9506MRMovTpoD = new String[] {""} ;
      T013W43_n9506MRMovTpoD = new boolean[] {false} ;
      T013W44_A396EmprCod = new String[] {""} ;
      T013W44_A9492MRCod = new int[1] ;
      T013W44_A9502MRMov = new long[1] ;
      T013W6_A9492MRCod = new int[1] ;
      T013W6_A9502MRMov = new long[1] ;
      T013W6_A9509MRMovPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013W6_A9507MRMovDsc = new String[] {""} ;
      T013W6_A9503MRMovOrd = new int[1] ;
      T013W6_A9504MRMovFch = new java.util.Date[] {GXutil.nullDate()} ;
      T013W6_A9508MRMovCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013W6_A396EmprCod = new String[] {""} ;
      T013W6_A9505MRMovTpo = new int[1] ;
      T013W5_A9492MRCod = new int[1] ;
      T013W5_A9502MRMov = new long[1] ;
      T013W5_A9509MRMovPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013W5_A9507MRMovDsc = new String[] {""} ;
      T013W5_A9503MRMovOrd = new int[1] ;
      T013W5_A9504MRMovFch = new java.util.Date[] {GXutil.nullDate()} ;
      T013W5_A9508MRMovCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013W5_A396EmprCod = new String[] {""} ;
      T013W5_A9505MRMovTpo = new int[1] ;
      T013W48_A9506MRMovTpoD = new String[] {""} ;
      T013W48_n9506MRMovTpoD = new boolean[] {false} ;
      T013W49_A396EmprCod = new String[] {""} ;
      T013W49_A9492MRCod = new int[1] ;
      T013W49_A9502MRMov = new long[1] ;
      Z9514MRResTpoD = "" ;
      T013W4_A9514MRResTpoD = new String[] {""} ;
      T013W4_n9514MRResTpoD = new boolean[] {false} ;
      T013W50_A9492MRCod = new int[1] ;
      T013W50_A9510MRRes = new long[1] ;
      T013W50_A9515MRResDsc = new String[] {""} ;
      T013W50_A9511MRResOrd = new int[1] ;
      T013W50_A9512MRResFch = new java.util.Date[] {GXutil.nullDate()} ;
      T013W50_A9514MRResTpoD = new String[] {""} ;
      T013W50_n9514MRResTpoD = new boolean[] {false} ;
      T013W50_A9516MRResCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013W50_A396EmprCod = new String[] {""} ;
      T013W50_A9513MRResTpo = new int[1] ;
      T013W51_A9514MRResTpoD = new String[] {""} ;
      T013W51_n9514MRResTpoD = new boolean[] {false} ;
      T013W52_A396EmprCod = new String[] {""} ;
      T013W52_A9492MRCod = new int[1] ;
      T013W52_A9510MRRes = new long[1] ;
      T013W3_A9492MRCod = new int[1] ;
      T013W3_A9510MRRes = new long[1] ;
      T013W3_A9515MRResDsc = new String[] {""} ;
      T013W3_A9511MRResOrd = new int[1] ;
      T013W3_A9512MRResFch = new java.util.Date[] {GXutil.nullDate()} ;
      T013W3_A9516MRResCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013W3_A396EmprCod = new String[] {""} ;
      T013W3_A9513MRResTpo = new int[1] ;
      T013W2_A9492MRCod = new int[1] ;
      T013W2_A9510MRRes = new long[1] ;
      T013W2_A9515MRResDsc = new String[] {""} ;
      T013W2_A9511MRResOrd = new int[1] ;
      T013W2_A9512MRResFch = new java.util.Date[] {GXutil.nullDate()} ;
      T013W2_A9516MRResCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013W2_A396EmprCod = new String[] {""} ;
      T013W2_A9513MRResTpo = new int[1] ;
      T013W56_A9514MRResTpoD = new String[] {""} ;
      T013W56_n9514MRResTpoD = new boolean[] {false} ;
      T013W57_A396EmprCod = new String[] {""} ;
      T013W57_A9492MRCod = new int[1] ;
      T013W57_A9510MRRes = new long[1] ;
      Gridlevel_prvRow = new com.genexus.webpanels.GXWebRow();
      subGridlevel_prv_Linesclass = "" ;
      ROClassString = "" ;
      Gridlevel_level1Row = new com.genexus.webpanels.GXWebRow();
      subGridlevel_level1_Linesclass = "" ;
      Gridlevel_level2Row = new com.genexus.webpanels.GXWebRow();
      subGridlevel_level2_Linesclass = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      i12850MRActivo = "" ;
      i9509MRMovPre = DecimalUtil.ZERO ;
      Gridlevel_prvColumn = new com.genexus.webpanels.GXWebColumn();
      Gridlevel_level1Column = new com.genexus.webpanels.GXWebColumn();
      Gridlevel_level2Column = new com.genexus.webpanels.GXWebColumn();
      gxdynajaxctrlcodr = new com.genexus.internet.StringCollection();
      gxdynajaxctrldescr = new com.genexus.internet.StringCollection();
      gxwrpcisep = "" ;
      T013W58_A396EmprCod = new String[] {""} ;
      T013W58_A9505MRMovTpo = new int[1] ;
      T013W58_A9506MRMovTpoD = new String[] {""} ;
      T013W58_n9506MRMovTpoD = new boolean[] {false} ;
      T013W59_A396EmprCod = new String[] {""} ;
      T013W59_A9513MRResTpo = new int[1] ;
      T013W59_A9514MRResTpoD = new String[] {""} ;
      T013W59_n9514MRResTpoD = new boolean[] {false} ;
      GXv_int13 = new int[1] ;
      T013W60_A9514MRResTpoD = new String[] {""} ;
      T013W60_n9514MRResTpoD = new boolean[] {false} ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.mantenimientomaquina.tmrepue__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.mantenimientomaquina.tmrepue__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.mantenimientomaquina.tmrepue__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.mantenimientomaquina.tmrepue__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.mantenimientomaquina.tmrepue__default(),
         new Object[] {
             new Object[] {
            T013W2_A9492MRCod, T013W2_A9510MRRes, T013W2_A9515MRResDsc, T013W2_A9511MRResOrd, T013W2_A9512MRResFch, T013W2_A9516MRResCnt, T013W2_A396EmprCod, T013W2_A9513MRResTpo
            }
            , new Object[] {
            T013W3_A9492MRCod, T013W3_A9510MRRes, T013W3_A9515MRResDsc, T013W3_A9511MRResOrd, T013W3_A9512MRResFch, T013W3_A9516MRResCnt, T013W3_A396EmprCod, T013W3_A9513MRResTpo
            }
            , new Object[] {
            T013W4_A9514MRResTpoD, T013W4_n9514MRResTpoD
            }
            , new Object[] {
            T013W5_A9492MRCod, T013W5_A9502MRMov, T013W5_A9509MRMovPre, T013W5_A9507MRMovDsc, T013W5_A9503MRMovOrd, T013W5_A9504MRMovFch, T013W5_A9508MRMovCnt, T013W5_A396EmprCod, T013W5_A9505MRMovTpo
            }
            , new Object[] {
            T013W6_A9492MRCod, T013W6_A9502MRMov, T013W6_A9509MRMovPre, T013W6_A9507MRMovDsc, T013W6_A9503MRMovOrd, T013W6_A9504MRMovFch, T013W6_A9508MRMovCnt, T013W6_A396EmprCod, T013W6_A9505MRMovTpo
            }
            , new Object[] {
            T013W7_A9506MRMovTpoD, T013W7_n9506MRMovTpoD
            }
            , new Object[] {
            T013W8_A9492MRCod, T013W8_A11056MRPrvHab, T013W8_A396EmprCod, T013W8_A795PrvNum
            }
            , new Object[] {
            T013W9_A9492MRCod, T013W9_A11056MRPrvHab, T013W9_A396EmprCod, T013W9_A795PrvNum
            }
            , new Object[] {
            T013W10_A794PrvNom, T013W10_n794PrvNom
            }
            , new Object[] {
            T013W11_A9492MRCod, T013W11_A9493MRNom, T013W11_n9493MRNom, T013W11_A9494MRCodExt, T013W11_n9494MRCodExt, T013W11_A11458MRCodPrv, T013W11_n11458MRCodPrv, T013W11_A9495MRStkAct, T013W11_n9495MRStkAct, T013W11_A9496MRStkRes,
            T013W11_n9496MRStkRes, T013W11_A9497MRStkMin, T013W11_n9497MRStkMin, T013W11_A9498MRStkCri, T013W11_n9498MRStkCri, T013W11_A9499MRStkPre, T013W11_n9499MRStkPre, T013W11_A9500MRUltMov, T013W11_n9500MRUltMov, T013W11_A9501MRUltRes,
            T013W11_n9501MRUltRes, T013W11_A12850MRActivo, T013W11_n12850MRActivo, T013W11_A14491MRLote, T013W11_A396EmprCod
            }
            , new Object[] {
            T013W12_A9492MRCod, T013W12_A9493MRNom, T013W12_n9493MRNom, T013W12_A9494MRCodExt, T013W12_n9494MRCodExt, T013W12_A11458MRCodPrv, T013W12_n11458MRCodPrv, T013W12_A9495MRStkAct, T013W12_n9495MRStkAct, T013W12_A9496MRStkRes,
            T013W12_n9496MRStkRes, T013W12_A9497MRStkMin, T013W12_n9497MRStkMin, T013W12_A9498MRStkCri, T013W12_n9498MRStkCri, T013W12_A9499MRStkPre, T013W12_n9499MRStkPre, T013W12_A9500MRUltMov, T013W12_n9500MRUltMov, T013W12_A9501MRUltRes,
            T013W12_n9501MRUltRes, T013W12_A12850MRActivo, T013W12_n12850MRActivo, T013W12_A14491MRLote, T013W12_A396EmprCod
            }
            , new Object[] {
            T013W13_A407EmprNom, T013W13_n407EmprNom
            }
            , new Object[] {
            T013W14_A9492MRCod, T013W14_A407EmprNom, T013W14_n407EmprNom, T013W14_A9493MRNom, T013W14_n9493MRNom, T013W14_A9494MRCodExt, T013W14_n9494MRCodExt, T013W14_A11458MRCodPrv, T013W14_n11458MRCodPrv, T013W14_A9495MRStkAct,
            T013W14_n9495MRStkAct, T013W14_A9496MRStkRes, T013W14_n9496MRStkRes, T013W14_A9497MRStkMin, T013W14_n9497MRStkMin, T013W14_A9498MRStkCri, T013W14_n9498MRStkCri, T013W14_A9499MRStkPre, T013W14_n9499MRStkPre, T013W14_A9500MRUltMov,
            T013W14_n9500MRUltMov, T013W14_A9501MRUltRes, T013W14_n9501MRUltRes, T013W14_A12850MRActivo, T013W14_n12850MRActivo, T013W14_A14491MRLote, T013W14_A396EmprCod
            }
            , new Object[] {
            T013W15_A407EmprNom, T013W15_n407EmprNom
            }
            , new Object[] {
            T013W16_A396EmprCod, T013W16_A9492MRCod
            }
            , new Object[] {
            T013W17_A396EmprCod, T013W17_A9492MRCod
            }
            , new Object[] {
            T013W18_A396EmprCod, T013W18_A9492MRCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T013W22_A407EmprNom, T013W22_n407EmprNom
            }
            , new Object[] {
            T013W23_A396EmprCod, T013W23_A602MaqCod, T013W23_A11438MaqEquCod, T013W23_A11439MaqSEqCod, T013W23_A11440MaqPieCod, T013W23_A9492MRCod
            }
            , new Object[] {
            T013W24_A396EmprCod, T013W24_A11055MComCod, T013W24_A9492MRCod
            }
            , new Object[] {
            T013W25_A396EmprCod, T013W25_A1061MRPriCod, T013W25_A1063MRComCod
            }
            , new Object[] {
            T013W26_A396EmprCod, T013W26_A1061MRPriCod
            }
            , new Object[] {
            T013W27_A396EmprCod, T013W27_A9430TMCod, T013W27_A9525TMRepCod
            }
            , new Object[] {
            T013W28_A396EmprCod, T013W28_A9429PMCod, T013W28_A9489PMRepCod
            }
            , new Object[] {
            T013W29_A396EmprCod, T013W29_A9425OMCod, T013W29_A9446OMRepCod, T013W29_A9449OMRTpo
            }
            , new Object[] {
            T013W30_A396EmprCod, T013W30_A9412MMSCod, T013W30_A9421MMSRCod
            }
            , new Object[] {
            T013W31_A396EmprCod, T013W31_A9398MISCod, T013W31_A9403MISRCod
            }
            , new Object[] {
            }
            , new Object[] {
            T013W33_A396EmprCod, T013W33_A9492MRCod
            }
            , new Object[] {
            T013W34_A9492MRCod, T013W34_A794PrvNom, T013W34_n794PrvNom, T013W34_A11056MRPrvHab, T013W34_A396EmprCod, T013W34_A795PrvNum
            }
            , new Object[] {
            T013W35_A794PrvNom, T013W35_n794PrvNom
            }
            , new Object[] {
            T013W36_A396EmprCod, T013W36_A9492MRCod, T013W36_A795PrvNum
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T013W40_A794PrvNom, T013W40_n794PrvNom
            }
            , new Object[] {
            T013W41_A396EmprCod, T013W41_A9492MRCod, T013W41_A795PrvNum
            }
            , new Object[] {
            T013W42_A9492MRCod, T013W42_A9502MRMov, T013W42_A9509MRMovPre, T013W42_A9507MRMovDsc, T013W42_A9503MRMovOrd, T013W42_A9504MRMovFch, T013W42_A9506MRMovTpoD, T013W42_n9506MRMovTpoD, T013W42_A9508MRMovCnt, T013W42_A396EmprCod,
            T013W42_A9505MRMovTpo
            }
            , new Object[] {
            T013W43_A9506MRMovTpoD, T013W43_n9506MRMovTpoD
            }
            , new Object[] {
            T013W44_A396EmprCod, T013W44_A9492MRCod, T013W44_A9502MRMov
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T013W48_A9506MRMovTpoD, T013W48_n9506MRMovTpoD
            }
            , new Object[] {
            T013W49_A396EmprCod, T013W49_A9492MRCod, T013W49_A9502MRMov
            }
            , new Object[] {
            T013W50_A9492MRCod, T013W50_A9510MRRes, T013W50_A9515MRResDsc, T013W50_A9511MRResOrd, T013W50_A9512MRResFch, T013W50_A9514MRResTpoD, T013W50_n9514MRResTpoD, T013W50_A9516MRResCnt, T013W50_A396EmprCod, T013W50_A9513MRResTpo
            }
            , new Object[] {
            T013W51_A9514MRResTpoD, T013W51_n9514MRResTpoD
            }
            , new Object[] {
            T013W52_A396EmprCod, T013W52_A9492MRCod, T013W52_A9510MRRes
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T013W56_A9514MRResTpoD, T013W56_n9514MRResTpoD
            }
            , new Object[] {
            T013W57_A396EmprCod, T013W57_A9492MRCod, T013W57_A9510MRRes
            }
            , new Object[] {
            T013W58_A396EmprCod, T013W58_A9505MRMovTpo, T013W58_A9506MRMovTpoD, T013W58_n9506MRMovTpoD
            }
            , new Object[] {
            T013W59_A396EmprCod, T013W59_A9513MRResTpo, T013W59_A9514MRResTpoD, T013W59_n9514MRResTpoD
            }
            , new Object[] {
            T013W60_A9514MRResTpoD, T013W60_n9514MRResTpoD
            }
         }
      );
      AV34Pgmname = "MantenimientoMaquina.TMRepue" ;
      Z12850MRActivo = httpContext.getMessage( "S", "") ;
      n12850MRActivo = false ;
      A12850MRActivo = httpContext.getMessage( "S", "") ;
      n12850MRActivo = false ;
      i12850MRActivo = httpContext.getMessage( "S", "") ;
      n12850MRActivo = false ;
      Z9515MRResDsc = "" ;
      A9515MRResDsc = "" ;
      Z9507MRMovDsc = "" ;
      A9507MRMovDsc = "" ;
      Z9509MRMovPre = DecimalUtil.ZERO ;
      A9509MRMovPre = DecimalUtil.ZERO ;
      i9509MRMovPre = DecimalUtil.ZERO ;
   }

   private byte Z11056MRPrvHab ;
   private byte GxWebError ;
   private byte AV16Artextil ;
   private byte AV17NumManual ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte A11056MRPrvHab ;
   private byte AV18Tintatex ;
   private byte GXt_int5 ;
   private byte GXv_int6[] ;
   private byte subGridlevel_prv_Backcolorstyle ;
   private byte subGridlevel_prv_Backstyle ;
   private byte subGridlevel_level1_Backcolorstyle ;
   private byte subGridlevel_level1_Backstyle ;
   private byte subGridlevel_level2_Backcolorstyle ;
   private byte subGridlevel_level2_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGridlevel_prv_Allowselection ;
   private byte subGridlevel_prv_Allowhovering ;
   private byte subGridlevel_prv_Allowcollapsing ;
   private byte subGridlevel_prv_Collapsed ;
   private byte subGridlevel_level1_Allowselection ;
   private byte subGridlevel_level1_Allowhovering ;
   private byte subGridlevel_level1_Allowcollapsing ;
   private byte subGridlevel_level1_Collapsed ;
   private byte subGridlevel_level2_Allowselection ;
   private byte subGridlevel_level2_Allowhovering ;
   private byte subGridlevel_level2_Allowcollapsing ;
   private byte subGridlevel_level2_Collapsed ;
   private short nRcdDeleted_1473 ;
   private short nRcdExists_1473 ;
   private short nIsMod_1473 ;
   private short nRcdDeleted_1239 ;
   private short nRcdExists_1239 ;
   private short nIsMod_1239 ;
   private short nRcdDeleted_1240 ;
   private short nRcdExists_1240 ;
   private short nIsMod_1240 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount1473 ;
   private short RcdFound1473 ;
   private short nBlankRcdUsr1473 ;
   private short nBlankRcdCount1239 ;
   private short RcdFound1239 ;
   private short nBlankRcdUsr1239 ;
   private short nBlankRcdCount1240 ;
   private short RcdFound1240 ;
   private short nBlankRcdUsr1240 ;
   private short RcdFound1238 ;
   private short nIsDirty_1238 ;
   private short nIsDirty_1473 ;
   private short nIsDirty_1239 ;
   private short nIsDirty_1240 ;
   private int wcpOAV13MRCod ;
   private int Z9492MRCod ;
   private int Z9500MRUltMov ;
   private int O9500MRUltMov ;
   private int nRC_GXsfl_92 ;
   private int nGXsfl_92_idx=1 ;
   private int nRC_GXsfl_106 ;
   private int nGXsfl_106_idx=1 ;
   private int nRC_GXsfl_125 ;
   private int nGXsfl_125_idx=1 ;
   private int N9492MRCod ;
   private int Z795PrvNum ;
   private int Z9503MRMovOrd ;
   private int Z9505MRMovTpo ;
   private int Z9511MRResOrd ;
   private int Z9513MRResTpo ;
   private int AV13MRCod ;
   private int A795PrvNum ;
   private int A9505MRMovTpo ;
   private int A9513MRResTpo ;
   private int trnEnded ;
   private int A9500MRUltMov ;
   private int Gxuitabspanel_tabs_Pagecount ;
   private int A9492MRCod ;
   private int edtMRCod_Enabled ;
   private int edtMRNom_Enabled ;
   private int edtMRCodExt_Enabled ;
   private int edtMRCodPrv_Enabled ;
   private int edtMRLote_Enabled ;
   private int edtMRStkPre_Enabled ;
   private int edtMRStkMin_Enabled ;
   private int edtMRStkCri_Enabled ;
   private int edtMRStkAct_Enabled ;
   private int edtMRStkRes_Enabled ;
   private int divTabtablelevel_level1_Visible ;
   private int divTabtablelevel_level2_Visible ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int edtavPgmname_Enabled ;
   private int edtMRUltMov_Enabled ;
   private int edtMRUltMov_Visible ;
   private int edtMRUltRes_Enabled ;
   private int edtMRUltRes_Visible ;
   private int edtEmprCod_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Visible ;
   private int edtEmprNom_Enabled ;
   private int B9500MRUltMov ;
   private int edtPrvNum_Enabled ;
   private int edtPrvNom_Enabled ;
   private int fRowAdded ;
   private int edtMRMov_Enabled ;
   private int edtMRMovOrd_Enabled ;
   private int edtMRMovFch_Enabled ;
   private int edtMRMovTpoD_Enabled ;
   private int edtMRMovDsc_Enabled ;
   private int edtMRMovCnt_Enabled ;
   private int edtMRMovPre_Enabled ;
   private int edtMRRes_Enabled ;
   private int edtMRResOrd_Enabled ;
   private int edtMRResFch_Enabled ;
   private int edtMRResTpoD_Enabled ;
   private int edtMRResDsc_Enabled ;
   private int edtMRResCnt_Enabled ;
   private int Gxuitabspanel_tabs_Activepage ;
   private int Combo_prvnum_Datalistupdateminimumcharacters ;
   private int A9511MRResOrd ;
   private int s9500MRUltMov ;
   private int A9503MRMovOrd ;
   private int GX_JID ;
   private int subGridlevel_prv_Backcolor ;
   private int subGridlevel_prv_Allbackcolor ;
   private int subGridlevel_level1_Backcolor ;
   private int subGridlevel_level1_Allbackcolor ;
   private int subGridlevel_level2_Backcolor ;
   private int subGridlevel_level2_Allbackcolor ;
   private int defedtMRResTpoD_Enabled ;
   private int defedtMRRes_Enabled ;
   private int defedtMRMovPre_Enabled ;
   private int defedtMRMovTpoD_Enabled ;
   private int defedtMRMov_Enabled ;
   private int defedtPrvNom_Enabled ;
   private int defedtPrvNum_Enabled ;
   private int i9500MRUltMov ;
   private int idxLst ;
   private int subGridlevel_prv_Selectedindex ;
   private int subGridlevel_prv_Selectioncolor ;
   private int subGridlevel_prv_Hoveringcolor ;
   private int subGridlevel_level1_Selectedindex ;
   private int subGridlevel_level1_Selectioncolor ;
   private int subGridlevel_level1_Hoveringcolor ;
   private int subGridlevel_level2_Selectedindex ;
   private int subGridlevel_level2_Selectioncolor ;
   private int subGridlevel_level2_Hoveringcolor ;
   private int gxdynajaxindex ;
   private int GXt_int12 ;
   private int GXv_int13[] ;
   private long Z9501MRUltRes ;
   private long O9501MRUltRes ;
   private long Z9502MRMov ;
   private long Z9510MRRes ;
   private long A9501MRUltRes ;
   private long B9501MRUltRes ;
   private long GRIDLEVEL_PRV_nFirstRecordOnPage ;
   private long GRIDLEVEL_LEVEL1_nFirstRecordOnPage ;
   private long GRIDLEVEL_LEVEL2_nFirstRecordOnPage ;
   private long s9501MRUltRes ;
   private long A9510MRRes ;
   private long A9502MRMov ;
   private long i9501MRUltRes ;
   private java.math.BigDecimal Z9495MRStkAct ;
   private java.math.BigDecimal Z9496MRStkRes ;
   private java.math.BigDecimal Z9497MRStkMin ;
   private java.math.BigDecimal Z9498MRStkCri ;
   private java.math.BigDecimal Z9499MRStkPre ;
   private java.math.BigDecimal O9496MRStkRes ;
   private java.math.BigDecimal O9495MRStkAct ;
   private java.math.BigDecimal Z9509MRMovPre ;
   private java.math.BigDecimal Z9508MRMovCnt ;
   private java.math.BigDecimal O9508MRMovCnt ;
   private java.math.BigDecimal Z9516MRResCnt ;
   private java.math.BigDecimal O9516MRResCnt ;
   private java.math.BigDecimal A9499MRStkPre ;
   private java.math.BigDecimal A9497MRStkMin ;
   private java.math.BigDecimal A9498MRStkCri ;
   private java.math.BigDecimal A9495MRStkAct ;
   private java.math.BigDecimal A9496MRStkRes ;
   private java.math.BigDecimal B9496MRStkRes ;
   private java.math.BigDecimal B9495MRStkAct ;
   private java.math.BigDecimal s9496MRStkRes ;
   private java.math.BigDecimal A9516MRResCnt ;
   private java.math.BigDecimal T9516MRResCnt ;
   private java.math.BigDecimal s9495MRStkAct ;
   private java.math.BigDecimal A9508MRMovCnt ;
   private java.math.BigDecimal A9509MRMovPre ;
   private java.math.BigDecimal T9508MRMovCnt ;
   private java.math.BigDecimal i9509MRMovPre ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV20EmprCod ;
   private String Z396EmprCod ;
   private String Z9493MRNom ;
   private String Z9494MRCodExt ;
   private String Z11458MRCodPrv ;
   private String Z12850MRActivo ;
   private String Z14491MRLote ;
   private String Z9507MRMovDsc ;
   private String Z9515MRResDsc ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String Gx_mode ;
   private String AV20EmprCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtMRCod_Internalname ;
   private String sGXsfl_92_idx="0001" ;
   private String edtPrvNum_Horizontalalignment ;
   private String edtPrvNum_Internalname ;
   private String sGXsfl_106_idx="0001" ;
   private String sGXsfl_125_idx="0001" ;
   private String A12850MRActivo ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String Dvpanel_opciones_Width ;
   private String Dvpanel_opciones_Cls ;
   private String Dvpanel_opciones_Title ;
   private String Dvpanel_opciones_Iconposition ;
   private String Dvpanel_opciones_Internalname ;
   private String divOpciones_Internalname ;
   private String Gxuitabspanel_tabs_Class ;
   private String Gxuitabspanel_tabs_Internalname ;
   private String lblTabgeneral_title_Internalname ;
   private String lblTabgeneral_title_Jsonclick ;
   private String divTableattributes_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String TempTags ;
   private String edtMRCod_Jsonclick ;
   private String edtMRNom_Internalname ;
   private String A9493MRNom ;
   private String edtMRNom_Jsonclick ;
   private String edtMRCodExt_Internalname ;
   private String A9494MRCodExt ;
   private String edtMRCodExt_Jsonclick ;
   private String edtMRCodPrv_Internalname ;
   private String A11458MRCodPrv ;
   private String edtMRCodPrv_Jsonclick ;
   private String edtMRLote_Internalname ;
   private String A14491MRLote ;
   private String edtMRLote_Jsonclick ;
   private String divUnnamedtable2_Internalname ;
   private String edtMRStkPre_Internalname ;
   private String edtMRStkPre_Jsonclick ;
   private String grpUnnamedgroup3_Internalname ;
   private String divGrupostocks_Internalname ;
   private String edtMRStkMin_Internalname ;
   private String edtMRStkMin_Jsonclick ;
   private String edtMRStkCri_Internalname ;
   private String edtMRStkCri_Jsonclick ;
   private String edtMRStkAct_Internalname ;
   private String edtMRStkAct_Jsonclick ;
   private String edtMRStkRes_Internalname ;
   private String edtMRStkRes_Jsonclick ;
   private String lblTablevel_prv_title_Internalname ;
   private String lblTablevel_prv_title_Jsonclick ;
   private String divTabtablelevel_prv_Internalname ;
   private String divTableleaflevel_prv_Internalname ;
   private String lblTablevel_level1_title_Internalname ;
   private String lblTablevel_level1_title_Jsonclick ;
   private String divTabtablelevel_level1_Internalname ;
   private String divTableleaflevel_level1_Internalname ;
   private String lblTablevel_level2_title_Internalname ;
   private String lblTablevel_level2_title_Jsonclick ;
   private String divTabtablelevel_level2_Internalname ;
   private String divTableleaflevel_level2_Internalname ;
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
   private String Combo_prvnum_Caption ;
   private String Combo_prvnum_Cls ;
   private String Combo_prvnum_Internalname ;
   private String edtMRUltMov_Internalname ;
   private String edtMRUltMov_Jsonclick ;
   private String edtMRUltRes_Internalname ;
   private String edtMRUltRes_Jsonclick ;
   private String edtEmprCod_Internalname ;
   private String edtEmprCod_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String sMode1473 ;
   private String edtPrvNom_Internalname ;
   private String sStyleString ;
   private String subGridlevel_prv_Internalname ;
   private String sMode1239 ;
   private String edtMRMov_Internalname ;
   private String edtMRMovOrd_Internalname ;
   private String edtMRMovFch_Internalname ;
   private String edtMRMovTpoD_Internalname ;
   private String edtMRMovDsc_Internalname ;
   private String edtMRMovCnt_Internalname ;
   private String edtMRMovPre_Internalname ;
   private String subGridlevel_level1_Internalname ;
   private String sMode1240 ;
   private String edtMRRes_Internalname ;
   private String edtMRResOrd_Internalname ;
   private String edtMRResFch_Internalname ;
   private String edtMRResTpoD_Internalname ;
   private String edtMRResDsc_Internalname ;
   private String edtMRResCnt_Internalname ;
   private String subGridlevel_level2_Internalname ;
   private String Gxuitabspanel_tabs_Objectcall ;
   private String Gxuitabspanel_tabs_Activepagecontrolname ;
   private String Dvpanel_opciones_Objectcall ;
   private String Dvpanel_opciones_Class ;
   private String Dvpanel_opciones_Height ;
   private String Combo_prvnum_Objectcall ;
   private String Combo_prvnum_Class ;
   private String Combo_prvnum_Icontype ;
   private String Combo_prvnum_Icon ;
   private String Combo_prvnum_Tooltip ;
   private String Combo_prvnum_Selectedvalue_set ;
   private String Combo_prvnum_Selectedvalue_get ;
   private String Combo_prvnum_Selectedtext_set ;
   private String Combo_prvnum_Selectedtext_get ;
   private String Combo_prvnum_Gamoauthtoken ;
   private String Combo_prvnum_Ddointernalname ;
   private String Combo_prvnum_Titlecontrolalign ;
   private String Combo_prvnum_Dropdownoptionstype ;
   private String Combo_prvnum_Titlecontrolidtoreplace ;
   private String Combo_prvnum_Datalisttype ;
   private String Combo_prvnum_Datalistfixedvalues ;
   private String Combo_prvnum_Datalistproc ;
   private String Combo_prvnum_Datalistprocparametersprefix ;
   private String Combo_prvnum_Remoteservicesparameters ;
   private String Combo_prvnum_Htmltemplate ;
   private String Combo_prvnum_Multiplevaluestype ;
   private String Combo_prvnum_Loadingdata ;
   private String Combo_prvnum_Noresultsfound ;
   private String Combo_prvnum_Emptyitemtext ;
   private String Combo_prvnum_Onlyselectedvalues ;
   private String Combo_prvnum_Selectalltext ;
   private String Combo_prvnum_Multiplevaluesseparator ;
   private String Combo_prvnum_Addnewoptiontext ;
   private String hsh ;
   private String sMode1238 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String A9514MRResTpoD ;
   private String A9515MRResDsc ;
   private String A9506MRMovTpoD ;
   private String A9507MRMovDsc ;
   private String GXCCtl ;
   private String A794PrvNom ;
   private String AV7Lit0 ;
   private String AV10Lit1 ;
   private String AV9LitFe ;
   private String AV11Station ;
   private String AV27ObtenerEmprCod ;
   private String AV14EmprNom ;
   private String AV8UsurCod ;
   private String GXt_char1 ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String AV26mensaje ;
   private String GXv_char4[] ;
   private String Z407EmprNom ;
   private String Z794PrvNom ;
   private String Z9506MRMovTpoD ;
   private String Z9514MRResTpoD ;
   private String sGXsfl_92_fel_idx="0001" ;
   private String subGridlevel_prv_Class ;
   private String subGridlevel_prv_Linesclass ;
   private String ROClassString ;
   private String edtPrvNum_Jsonclick ;
   private String edtPrvNom_Jsonclick ;
   private String sGXsfl_106_fel_idx="0001" ;
   private String subGridlevel_level1_Class ;
   private String subGridlevel_level1_Linesclass ;
   private String edtMRMov_Jsonclick ;
   private String edtMRMovOrd_Jsonclick ;
   private String edtMRMovFch_Jsonclick ;
   private String edtMRMovTpoD_Jsonclick ;
   private String edtMRMovDsc_Jsonclick ;
   private String edtMRMovCnt_Jsonclick ;
   private String edtMRMovPre_Jsonclick ;
   private String sGXsfl_125_fel_idx="0001" ;
   private String subGridlevel_level2_Class ;
   private String subGridlevel_level2_Linesclass ;
   private String edtMRRes_Jsonclick ;
   private String edtMRResOrd_Jsonclick ;
   private String edtMRResFch_Jsonclick ;
   private String edtMRResTpoD_Jsonclick ;
   private String edtMRResDsc_Jsonclick ;
   private String edtMRResCnt_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String i12850MRActivo ;
   private String subGridlevel_prv_Header ;
   private String subGridlevel_level1_Header ;
   private String subGridlevel_level2_Header ;
   private String gxwrpcisep ;
   private java.util.Date Z9504MRMovFch ;
   private java.util.Date Z9512MRResFch ;
   private java.util.Date A9512MRResFch ;
   private java.util.Date A9504MRMovFch ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean bGXsfl_92_Refreshing=false ;
   private boolean n9500MRUltMov ;
   private boolean n9499MRStkPre ;
   private boolean n9501MRUltRes ;
   private boolean n12850MRActivo ;
   private boolean Dvpanel_opciones_Autowidth ;
   private boolean Dvpanel_opciones_Autoheight ;
   private boolean Dvpanel_opciones_Collapsible ;
   private boolean Dvpanel_opciones_Collapsed ;
   private boolean Dvpanel_opciones_Showcollapseicon ;
   private boolean Dvpanel_opciones_Autoscroll ;
   private boolean Gxuitabspanel_tabs_Historymanagement ;
   private boolean Combo_prvnum_Isgriditem ;
   private boolean Combo_prvnum_Emptyitem ;
   private boolean n9496MRStkRes ;
   private boolean n9495MRStkAct ;
   private boolean bGXsfl_106_Refreshing=false ;
   private boolean bGXsfl_125_Refreshing=false ;
   private boolean Gxuitabspanel_tabs_Enabled ;
   private boolean Gxuitabspanel_tabs_Visible ;
   private boolean Dvpanel_opciones_Enabled ;
   private boolean Dvpanel_opciones_Showheader ;
   private boolean Dvpanel_opciones_Visible ;
   private boolean Combo_prvnum_Enabled ;
   private boolean Combo_prvnum_Visible ;
   private boolean Combo_prvnum_Allowmultipleselection ;
   private boolean Combo_prvnum_Hasdescription ;
   private boolean Combo_prvnum_Includeonlyselectedoption ;
   private boolean Combo_prvnum_Includeselectalloption ;
   private boolean Combo_prvnum_Includeaddnewoption ;
   private boolean n9493MRNom ;
   private boolean n9494MRCodExt ;
   private boolean n11458MRCodPrv ;
   private boolean n9497MRStkMin ;
   private boolean n9498MRStkCri ;
   private boolean n407EmprNom ;
   private boolean returnInSub ;
   private boolean AV19Confirmado ;
   private boolean Gx_longc ;
   private boolean n794PrvNom ;
   private boolean n9506MRMovTpoD ;
   private boolean n9514MRResTpoD ;
   private boolean gxdyncontrolsrefreshing ;
   private String A13718MRCNom ;
   private String AV31ComboSelectedValue ;
   private com.genexus.webpanels.GXWebGrid Gridlevel_prvContainer ;
   private com.genexus.webpanels.GXWebGrid Gridlevel_level1Container ;
   private com.genexus.webpanels.GXWebGrid Gridlevel_level2Container ;
   private com.genexus.webpanels.GXWebRow Gridlevel_prvRow ;
   private com.genexus.webpanels.GXWebRow Gridlevel_level1Row ;
   private com.genexus.webpanels.GXWebRow Gridlevel_level2Row ;
   private com.genexus.webpanels.GXWebColumn Gridlevel_prvColumn ;
   private com.genexus.webpanels.GXWebColumn Gridlevel_level1Column ;
   private com.genexus.webpanels.GXWebColumn Gridlevel_level2Column ;
   private com.genexus.internet.StringCollection gxdynajaxctrlcodr ;
   private com.genexus.internet.StringCollection gxdynajaxctrldescr ;
   private com.genexus.webpanels.WebSession AV23WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_opciones ;
   private com.genexus.webpanels.GXUserControl ucGxuitabspanel_tabs ;
   private com.genexus.webpanels.GXUserControl ucCombo_prvnum ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private ICheckbox chkMRActivo ;
   private ICheckbox chkMRPrvHab ;
   private HTMLChoice dynMRMovTpo ;
   private HTMLChoice dynMRResTpo ;
   private IDataStoreProvider pr_default ;
   private String[] T013W13_A407EmprNom ;
   private boolean[] T013W13_n407EmprNom ;
   private int[] T013W14_A9492MRCod ;
   private String[] T013W14_A407EmprNom ;
   private boolean[] T013W14_n407EmprNom ;
   private String[] T013W14_A9493MRNom ;
   private boolean[] T013W14_n9493MRNom ;
   private String[] T013W14_A9494MRCodExt ;
   private boolean[] T013W14_n9494MRCodExt ;
   private String[] T013W14_A11458MRCodPrv ;
   private boolean[] T013W14_n11458MRCodPrv ;
   private java.math.BigDecimal[] T013W14_A9495MRStkAct ;
   private boolean[] T013W14_n9495MRStkAct ;
   private java.math.BigDecimal[] T013W14_A9496MRStkRes ;
   private boolean[] T013W14_n9496MRStkRes ;
   private java.math.BigDecimal[] T013W14_A9497MRStkMin ;
   private boolean[] T013W14_n9497MRStkMin ;
   private java.math.BigDecimal[] T013W14_A9498MRStkCri ;
   private boolean[] T013W14_n9498MRStkCri ;
   private java.math.BigDecimal[] T013W14_A9499MRStkPre ;
   private boolean[] T013W14_n9499MRStkPre ;
   private int[] T013W14_A9500MRUltMov ;
   private boolean[] T013W14_n9500MRUltMov ;
   private long[] T013W14_A9501MRUltRes ;
   private boolean[] T013W14_n9501MRUltRes ;
   private String[] T013W14_A12850MRActivo ;
   private boolean[] T013W14_n12850MRActivo ;
   private String[] T013W14_A14491MRLote ;
   private String[] T013W14_A396EmprCod ;
   private String[] T013W15_A407EmprNom ;
   private boolean[] T013W15_n407EmprNom ;
   private String[] T013W16_A396EmprCod ;
   private int[] T013W16_A9492MRCod ;
   private int[] T013W12_A9492MRCod ;
   private String[] T013W12_A9493MRNom ;
   private boolean[] T013W12_n9493MRNom ;
   private String[] T013W12_A9494MRCodExt ;
   private boolean[] T013W12_n9494MRCodExt ;
   private String[] T013W12_A11458MRCodPrv ;
   private boolean[] T013W12_n11458MRCodPrv ;
   private java.math.BigDecimal[] T013W12_A9495MRStkAct ;
   private boolean[] T013W12_n9495MRStkAct ;
   private java.math.BigDecimal[] T013W12_A9496MRStkRes ;
   private boolean[] T013W12_n9496MRStkRes ;
   private java.math.BigDecimal[] T013W12_A9497MRStkMin ;
   private boolean[] T013W12_n9497MRStkMin ;
   private java.math.BigDecimal[] T013W12_A9498MRStkCri ;
   private boolean[] T013W12_n9498MRStkCri ;
   private java.math.BigDecimal[] T013W12_A9499MRStkPre ;
   private boolean[] T013W12_n9499MRStkPre ;
   private int[] T013W12_A9500MRUltMov ;
   private boolean[] T013W12_n9500MRUltMov ;
   private long[] T013W12_A9501MRUltRes ;
   private boolean[] T013W12_n9501MRUltRes ;
   private String[] T013W12_A12850MRActivo ;
   private boolean[] T013W12_n12850MRActivo ;
   private String[] T013W12_A14491MRLote ;
   private String[] T013W12_A396EmprCod ;
   private String[] T013W17_A396EmprCod ;
   private int[] T013W17_A9492MRCod ;
   private String[] T013W18_A396EmprCod ;
   private int[] T013W18_A9492MRCod ;
   private int[] T013W11_A9492MRCod ;
   private String[] T013W11_A9493MRNom ;
   private boolean[] T013W11_n9493MRNom ;
   private String[] T013W11_A9494MRCodExt ;
   private boolean[] T013W11_n9494MRCodExt ;
   private String[] T013W11_A11458MRCodPrv ;
   private boolean[] T013W11_n11458MRCodPrv ;
   private java.math.BigDecimal[] T013W11_A9495MRStkAct ;
   private boolean[] T013W11_n9495MRStkAct ;
   private java.math.BigDecimal[] T013W11_A9496MRStkRes ;
   private boolean[] T013W11_n9496MRStkRes ;
   private java.math.BigDecimal[] T013W11_A9497MRStkMin ;
   private boolean[] T013W11_n9497MRStkMin ;
   private java.math.BigDecimal[] T013W11_A9498MRStkCri ;
   private boolean[] T013W11_n9498MRStkCri ;
   private java.math.BigDecimal[] T013W11_A9499MRStkPre ;
   private boolean[] T013W11_n9499MRStkPre ;
   private int[] T013W11_A9500MRUltMov ;
   private boolean[] T013W11_n9500MRUltMov ;
   private long[] T013W11_A9501MRUltRes ;
   private boolean[] T013W11_n9501MRUltRes ;
   private String[] T013W11_A12850MRActivo ;
   private boolean[] T013W11_n12850MRActivo ;
   private String[] T013W11_A14491MRLote ;
   private String[] T013W11_A396EmprCod ;
   private String[] T013W22_A407EmprNom ;
   private boolean[] T013W22_n407EmprNom ;
   private String[] T013W23_A396EmprCod ;
   private String[] T013W23_A602MaqCod ;
   private String[] T013W23_A11438MaqEquCod ;
   private String[] T013W23_A11439MaqSEqCod ;
   private String[] T013W23_A11440MaqPieCod ;
   private int[] T013W23_A9492MRCod ;
   private String[] T013W24_A396EmprCod ;
   private long[] T013W24_A11055MComCod ;
   private int[] T013W24_A9492MRCod ;
   private String[] T013W25_A396EmprCod ;
   private int[] T013W25_A1061MRPriCod ;
   private int[] T013W25_A1063MRComCod ;
   private String[] T013W26_A396EmprCod ;
   private int[] T013W26_A1061MRPriCod ;
   private String[] T013W27_A396EmprCod ;
   private int[] T013W27_A9430TMCod ;
   private int[] T013W27_A9525TMRepCod ;
   private String[] T013W28_A396EmprCod ;
   private int[] T013W28_A9429PMCod ;
   private int[] T013W28_A9489PMRepCod ;
   private String[] T013W29_A396EmprCod ;
   private int[] T013W29_A9425OMCod ;
   private int[] T013W29_A9446OMRepCod ;
   private String[] T013W29_A9449OMRTpo ;
   private String[] T013W30_A396EmprCod ;
   private int[] T013W30_A9412MMSCod ;
   private int[] T013W30_A9421MMSRCod ;
   private String[] T013W31_A396EmprCod ;
   private int[] T013W31_A9398MISCod ;
   private int[] T013W31_A9403MISRCod ;
   private String[] T013W33_A396EmprCod ;
   private int[] T013W33_A9492MRCod ;
   private int[] T013W34_A9492MRCod ;
   private String[] T013W34_A794PrvNom ;
   private boolean[] T013W34_n794PrvNom ;
   private byte[] T013W34_A11056MRPrvHab ;
   private String[] T013W34_A396EmprCod ;
   private int[] T013W34_A795PrvNum ;
   private String[] T013W10_A794PrvNom ;
   private boolean[] T013W10_n794PrvNom ;
   private String[] T013W35_A794PrvNom ;
   private boolean[] T013W35_n794PrvNom ;
   private String[] T013W36_A396EmprCod ;
   private int[] T013W36_A9492MRCod ;
   private int[] T013W36_A795PrvNum ;
   private int[] T013W9_A9492MRCod ;
   private byte[] T013W9_A11056MRPrvHab ;
   private String[] T013W9_A396EmprCod ;
   private int[] T013W9_A795PrvNum ;
   private int[] T013W8_A9492MRCod ;
   private byte[] T013W8_A11056MRPrvHab ;
   private String[] T013W8_A396EmprCod ;
   private int[] T013W8_A795PrvNum ;
   private String[] T013W40_A794PrvNom ;
   private boolean[] T013W40_n794PrvNom ;
   private String[] T013W41_A396EmprCod ;
   private int[] T013W41_A9492MRCod ;
   private int[] T013W41_A795PrvNum ;
   private String[] T013W7_A9506MRMovTpoD ;
   private boolean[] T013W7_n9506MRMovTpoD ;
   private int[] T013W42_A9492MRCod ;
   private long[] T013W42_A9502MRMov ;
   private java.math.BigDecimal[] T013W42_A9509MRMovPre ;
   private String[] T013W42_A9507MRMovDsc ;
   private int[] T013W42_A9503MRMovOrd ;
   private java.util.Date[] T013W42_A9504MRMovFch ;
   private String[] T013W42_A9506MRMovTpoD ;
   private boolean[] T013W42_n9506MRMovTpoD ;
   private java.math.BigDecimal[] T013W42_A9508MRMovCnt ;
   private String[] T013W42_A396EmprCod ;
   private int[] T013W42_A9505MRMovTpo ;
   private String[] T013W43_A9506MRMovTpoD ;
   private boolean[] T013W43_n9506MRMovTpoD ;
   private String[] T013W44_A396EmprCod ;
   private int[] T013W44_A9492MRCod ;
   private long[] T013W44_A9502MRMov ;
   private int[] T013W6_A9492MRCod ;
   private long[] T013W6_A9502MRMov ;
   private java.math.BigDecimal[] T013W6_A9509MRMovPre ;
   private String[] T013W6_A9507MRMovDsc ;
   private int[] T013W6_A9503MRMovOrd ;
   private java.util.Date[] T013W6_A9504MRMovFch ;
   private java.math.BigDecimal[] T013W6_A9508MRMovCnt ;
   private String[] T013W6_A396EmprCod ;
   private int[] T013W6_A9505MRMovTpo ;
   private int[] T013W5_A9492MRCod ;
   private long[] T013W5_A9502MRMov ;
   private java.math.BigDecimal[] T013W5_A9509MRMovPre ;
   private String[] T013W5_A9507MRMovDsc ;
   private int[] T013W5_A9503MRMovOrd ;
   private java.util.Date[] T013W5_A9504MRMovFch ;
   private java.math.BigDecimal[] T013W5_A9508MRMovCnt ;
   private String[] T013W5_A396EmprCod ;
   private int[] T013W5_A9505MRMovTpo ;
   private String[] T013W48_A9506MRMovTpoD ;
   private boolean[] T013W48_n9506MRMovTpoD ;
   private String[] T013W49_A396EmprCod ;
   private int[] T013W49_A9492MRCod ;
   private long[] T013W49_A9502MRMov ;
   private String[] T013W4_A9514MRResTpoD ;
   private boolean[] T013W4_n9514MRResTpoD ;
   private int[] T013W50_A9492MRCod ;
   private long[] T013W50_A9510MRRes ;
   private String[] T013W50_A9515MRResDsc ;
   private int[] T013W50_A9511MRResOrd ;
   private java.util.Date[] T013W50_A9512MRResFch ;
   private String[] T013W50_A9514MRResTpoD ;
   private boolean[] T013W50_n9514MRResTpoD ;
   private java.math.BigDecimal[] T013W50_A9516MRResCnt ;
   private String[] T013W50_A396EmprCod ;
   private int[] T013W50_A9513MRResTpo ;
   private String[] T013W51_A9514MRResTpoD ;
   private boolean[] T013W51_n9514MRResTpoD ;
   private String[] T013W52_A396EmprCod ;
   private int[] T013W52_A9492MRCod ;
   private long[] T013W52_A9510MRRes ;
   private int[] T013W3_A9492MRCod ;
   private long[] T013W3_A9510MRRes ;
   private String[] T013W3_A9515MRResDsc ;
   private int[] T013W3_A9511MRResOrd ;
   private java.util.Date[] T013W3_A9512MRResFch ;
   private java.math.BigDecimal[] T013W3_A9516MRResCnt ;
   private String[] T013W3_A396EmprCod ;
   private int[] T013W3_A9513MRResTpo ;
   private int[] T013W2_A9492MRCod ;
   private long[] T013W2_A9510MRRes ;
   private String[] T013W2_A9515MRResDsc ;
   private int[] T013W2_A9511MRResOrd ;
   private java.util.Date[] T013W2_A9512MRResFch ;
   private java.math.BigDecimal[] T013W2_A9516MRResCnt ;
   private String[] T013W2_A396EmprCod ;
   private int[] T013W2_A9513MRResTpo ;
   private String[] T013W56_A9514MRResTpoD ;
   private boolean[] T013W56_n9514MRResTpoD ;
   private String[] T013W57_A396EmprCod ;
   private int[] T013W57_A9492MRCod ;
   private long[] T013W57_A9510MRRes ;
   private String[] T013W58_A396EmprCod ;
   private int[] T013W58_A9505MRMovTpo ;
   private String[] T013W58_A9506MRMovTpoD ;
   private boolean[] T013W58_n9506MRMovTpoD ;
   private String[] T013W59_A396EmprCod ;
   private int[] T013W59_A9513MRResTpo ;
   private String[] T013W59_A9514MRResTpoD ;
   private boolean[] T013W59_n9514MRResTpoD ;
   private String[] T013W60_A9514MRResTpoD ;
   private boolean[] T013W60_n9514MRResTpoD ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV30PrvNum_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXt_objcol_SdtDVB_SDTComboData_Item10 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXv_objcol_SdtDVB_SDTComboData_Item11[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV22TrnContext ;
   private app.wwpbaseobjects.SdtWWPContext AV24WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV32DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9[] ;
}

final  class tmrepue__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmrepue__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmrepue__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmrepue__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmrepue__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T013W2", "SELECT MRCod, MRRes, MRResDsc, MRResOrd, MRResFch, MRResCnt, EmprCod, MRResTpo FROM TXPMReRes WHERE EmprCod = ? AND MRCod = ? AND MRRes = ?  FOR UPDATE OF MRResDsc, MRResOrd, MRResFch, MRResCnt, MRResTpo NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013W3", "SELECT MRCod, MRRes, MRResDsc, MRResOrd, MRResFch, MRResCnt, EmprCod, MRResTpo FROM TXPMReRes WHERE EmprCod = ? AND MRCod = ? AND MRRes = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013W4", "SELECT MTMovNom AS MRResTpoD FROM TXPMTPOMO WHERE EmprCod = ? AND MTMovCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013W5", "SELECT MRCod, MRMov, MRMovPre, MRMovDsc, MRMovOrd, MRMovFch, MRMovCnt, EmprCod, MRMovTpo FROM TXPMReMov WHERE EmprCod = ? AND MRCod = ? AND MRMov = ?  FOR UPDATE OF MRMovPre, MRMovDsc, MRMovOrd, MRMovFch, MRMovCnt, MRMovTpo NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013W6", "SELECT MRCod, MRMov, MRMovPre, MRMovDsc, MRMovOrd, MRMovFch, MRMovCnt, EmprCod, MRMovTpo FROM TXPMReMov WHERE EmprCod = ? AND MRCod = ? AND MRMov = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013W7", "SELECT MTMovNom AS MRMovTpoD FROM TXPMTPOMO WHERE EmprCod = ? AND MTMovCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013W8", "SELECT MRCod, MRPrvHab, EmprCod, PrvNum FROM TXPMRepu1 WHERE EmprCod = ? AND MRCod = ? AND PrvNum = ?  FOR UPDATE OF MRPrvHab NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013W9", "SELECT MRCod, MRPrvHab, EmprCod, PrvNum FROM TXPMRepu1 WHERE EmprCod = ? AND MRCod = ? AND PrvNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013W10", "SELECT PrvNom FROM TXPPRVGEN WHERE EmprCod = ? AND PrvNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013W11", "SELECT MRCod, MRNom, MRCodExt, MRCodPrv, MRStkAct, MRStkRes, MRStkMin, MRStkCri, MRStkPre, MRUltMov, MRUltRes, MRActivo, MRLote, EmprCod FROM TXPMREPUE WHERE EmprCod = ? AND MRCod = ?  FOR UPDATE OF MRNom, MRCodExt, MRCodPrv, MRStkAct, MRStkRes, MRStkMin, MRStkCri, MRStkPre, MRUltMov, MRUltRes, MRActivo, MRLote NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013W12", "SELECT MRCod, MRNom, MRCodExt, MRCodPrv, MRStkAct, MRStkRes, MRStkMin, MRStkCri, MRStkPre, MRUltMov, MRUltRes, MRActivo, MRLote, EmprCod FROM TXPMREPUE WHERE EmprCod = ? AND MRCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013W13", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013W14", "SELECT /*+ FIRST_ROWS(100) */ TM1.MRCod, T2.EmprNom, TM1.MRNom, TM1.MRCodExt, TM1.MRCodPrv, TM1.MRStkAct, TM1.MRStkRes, TM1.MRStkMin, TM1.MRStkCri, TM1.MRStkPre, TM1.MRUltMov, TM1.MRUltRes, TM1.MRActivo, TM1.MRLote, TM1.EmprCod FROM (TXPMREPUE TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.MRCod = ? ORDER BY TM1.EmprCod, TM1.MRCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013W15", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013W16", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, MRCod FROM TXPMREPUE WHERE EmprCod = ? AND MRCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013W17", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, MRCod FROM TXPMREPUE WHERE ( EmprCod > ? or EmprCod = ? and MRCod > ?) ORDER BY EmprCod, MRCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013W18", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, MRCod FROM TXPMREPUE WHERE ( EmprCod < ? or EmprCod = ? and MRCod < ?) ORDER BY EmprCod DESC, MRCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T013W19", "INSERT INTO TXPMREPUE(MRCod, MRNom, MRCodExt, MRCodPrv, MRStkAct, MRStkRes, MRStkMin, MRStkCri, MRStkPre, MRUltMov, MRUltRes, MRActivo, MRLote, EmprCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPMREPUE")
         ,new UpdateCursor("T013W20", "UPDATE TXPMREPUE SET MRNom=?, MRCodExt=?, MRCodPrv=?, MRStkAct=?, MRStkRes=?, MRStkMin=?, MRStkCri=?, MRStkPre=?, MRUltMov=?, MRUltRes=?, MRActivo=?, MRLote=?  WHERE EmprCod = ? AND MRCod = ?", GX_NOMASK, "TXPMREPUE")
         ,new UpdateCursor("T013W21", "DELETE FROM TXPMREPUE  WHERE EmprCod = ? AND MRCod = ?", GX_NOMASK, "TXPMREPUE")
         ,new ForEachCursor("T013W22", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013W23", "SELECT * FROM (SELECT EmprCod, MaqCod, MaqEquCod, MaqSEqCod, MaqPieCod, MRCod FROM TXPMaqRep WHERE EmprCod = ? AND MRCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013W24", "SELECT * FROM (SELECT EmprCod, MComCod, MRCod FROM TXPMRepC1 WHERE EmprCod = ? AND MRCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013W25", "SELECT * FROM (SELECT EmprCod, MRPriCod, MRComCod FROM TXPMRCom1 WHERE EmprCod = ? AND MRComCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013W26", "SELECT * FROM (SELECT EmprCod, MRPriCod FROM TXPMRCom WHERE EmprCod = ? AND MRPriCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013W27", "SELECT * FROM (SELECT EmprCod, TMCod, TMRepCod FROM TXPMTaRep WHERE EmprCod = ? AND TMRepCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013W28", "SELECT * FROM (SELECT EmprCod, PMCod, PMRepCod FROM TXPMPreRe WHERE EmprCod = ? AND PMRepCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013W29", "SELECT * FROM (SELECT EmprCod, OMCod, OMRepCod, OMRTpo FROM TXPMOrRep WHERE EmprCod = ? AND OMRepCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013W30", "SELECT * FROM (SELECT EmprCod, MMSCod, MMSRCod FROM TXPMMoStR WHERE EmprCod = ? AND MMSRCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013W31", "SELECT * FROM (SELECT EmprCod, MISCod, MISRCod FROM TXPMInSRe WHERE EmprCod = ? AND MISRCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T013W32", "UPDATE TXPMREPUE SET MRUltRes=?, MRStkRes=?, MRUltMov=?, MRStkAct=?  WHERE EmprCod = ? AND MRCod = ?", GX_NOMASK, "TXPMREPUE")
         ,new ForEachCursor("T013W33", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, MRCod FROM TXPMREPUE ORDER BY EmprCod, MRCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013W34", "SELECT T1.MRCod, T2.PrvNom, T1.MRPrvHab, T1.EmprCod, T1.PrvNum FROM (TXPMRepu1 T1 INNER JOIN TXPPRVGEN T2 ON T2.EmprCod = T1.EmprCod AND T2.PrvNum = T1.PrvNum) WHERE T1.EmprCod = ? and T1.MRCod = ? and T1.PrvNum = ? ORDER BY T1.EmprCod, T1.MRCod, T1.PrvNum ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013W35", "SELECT PrvNom FROM TXPPRVGEN WHERE EmprCod = ? AND PrvNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013W36", "SELECT EmprCod, MRCod, PrvNum FROM TXPMRepu1 WHERE EmprCod = ? AND MRCod = ? AND PrvNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T013W37", "INSERT INTO TXPMRepu1(MRCod, MRPrvHab, EmprCod, PrvNum) VALUES(?, ?, ?, ?)", GX_NOMASK, "TXPMRepu1")
         ,new UpdateCursor("T013W38", "UPDATE TXPMRepu1 SET MRPrvHab=?  WHERE EmprCod = ? AND MRCod = ? AND PrvNum = ?", GX_NOMASK, "TXPMRepu1")
         ,new UpdateCursor("T013W39", "DELETE FROM TXPMRepu1  WHERE EmprCod = ? AND MRCod = ? AND PrvNum = ?", GX_NOMASK, "TXPMRepu1")
         ,new ForEachCursor("T013W40", "SELECT PrvNom FROM TXPPRVGEN WHERE EmprCod = ? AND PrvNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013W41", "SELECT EmprCod, MRCod, PrvNum FROM TXPMRepu1 WHERE EmprCod = ? and MRCod = ? ORDER BY EmprCod, MRCod, PrvNum ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013W42", "SELECT T1.MRCod, T1.MRMov, T1.MRMovPre, T1.MRMovDsc, T1.MRMovOrd, T1.MRMovFch, T2.MTMovNom AS MRMovTpoD, T1.MRMovCnt, T1.EmprCod, T1.MRMovTpo AS MRMovTpo FROM (TXPMReMov T1 INNER JOIN TXPMTPOMO T2 ON T2.EmprCod = T1.EmprCod AND T2.MTMovCod = T1.MRMovTpo) WHERE T1.EmprCod = ? and T1.MRCod = ? and T1.MRMov = ? ORDER BY T1.EmprCod, T1.MRCod, T1.MRMov ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013W43", "SELECT MTMovNom AS MRMovTpoD FROM TXPMTPOMO WHERE EmprCod = ? AND MTMovCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013W44", "SELECT EmprCod, MRCod, MRMov FROM TXPMReMov WHERE EmprCod = ? AND MRCod = ? AND MRMov = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T013W45", "INSERT INTO TXPMReMov(MRCod, MRMov, MRMovPre, MRMovDsc, MRMovOrd, MRMovFch, MRMovCnt, EmprCod, MRMovTpo) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPMReMov")
         ,new UpdateCursor("T013W46", "UPDATE TXPMReMov SET MRMovPre=?, MRMovDsc=?, MRMovOrd=?, MRMovFch=?, MRMovCnt=?, MRMovTpo=?  WHERE EmprCod = ? AND MRCod = ? AND MRMov = ?", GX_NOMASK, "TXPMReMov")
         ,new UpdateCursor("T013W47", "DELETE FROM TXPMReMov  WHERE EmprCod = ? AND MRCod = ? AND MRMov = ?", GX_NOMASK, "TXPMReMov")
         ,new ForEachCursor("T013W48", "SELECT MTMovNom AS MRMovTpoD FROM TXPMTPOMO WHERE EmprCod = ? AND MTMovCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013W49", "SELECT EmprCod, MRCod, MRMov FROM TXPMReMov WHERE EmprCod = ? and MRCod = ? ORDER BY EmprCod, MRCod, MRMov ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013W50", "SELECT T1.MRCod, T1.MRRes, T1.MRResDsc, T1.MRResOrd, T1.MRResFch, T2.MTMovNom AS MRResTpoD, T1.MRResCnt, T1.EmprCod, T1.MRResTpo AS MRResTpo FROM (TXPMReRes T1 INNER JOIN TXPMTPOMO T2 ON T2.EmprCod = T1.EmprCod AND T2.MTMovCod = T1.MRResTpo) WHERE T1.EmprCod = ? and T1.MRCod = ? and T1.MRRes = ? ORDER BY T1.EmprCod, T1.MRCod, T1.MRRes ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013W51", "SELECT MTMovNom AS MRResTpoD FROM TXPMTPOMO WHERE EmprCod = ? AND MTMovCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013W52", "SELECT EmprCod, MRCod, MRRes FROM TXPMReRes WHERE EmprCod = ? AND MRCod = ? AND MRRes = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T013W53", "INSERT INTO TXPMReRes(MRCod, MRRes, MRResDsc, MRResOrd, MRResFch, MRResCnt, EmprCod, MRResTpo) VALUES(?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPMReRes")
         ,new UpdateCursor("T013W54", "UPDATE TXPMReRes SET MRResDsc=?, MRResOrd=?, MRResFch=?, MRResCnt=?, MRResTpo=?  WHERE EmprCod = ? AND MRCod = ? AND MRRes = ?", GX_NOMASK, "TXPMReRes")
         ,new UpdateCursor("T013W55", "DELETE FROM TXPMReRes  WHERE EmprCod = ? AND MRCod = ? AND MRRes = ?", GX_NOMASK, "TXPMReRes")
         ,new ForEachCursor("T013W56", "SELECT MTMovNom AS MRResTpoD FROM TXPMTPOMO WHERE EmprCod = ? AND MTMovCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013W57", "SELECT EmprCod, MRCod, MRRes FROM TXPMReRes WHERE EmprCod = ? and MRCod = ? ORDER BY EmprCod, MRCod, MRRes ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013W58", "SELECT EmprCod, MTMovCod AS MRMovTpo, MTMovNom AS MRMovTpoD FROM TXPMTPOMO WHERE EmprCod = ? ORDER BY MTMovNom ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013W59", "SELECT EmprCod, MTMovCod AS MRResTpo, MTMovNom AS MRResTpoD FROM TXPMTPOMO WHERE EmprCod = ? ORDER BY MTMovNom ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013W60", "SELECT MTMovNom AS MRResTpoD FROM TXPMTPOMO WHERE EmprCod = ? AND MTMovCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 50);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,3);
               ((String[]) buf[6])[0] = rslt.getString(7, 3);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 50);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,3);
               ((String[]) buf[6])[0] = rslt.getString(7, 3);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,3);
               ((String[]) buf[7])[0] = rslt.getString(8, 3);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               return;
            case 4 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,3);
               ((String[]) buf[7])[0] = rslt.getString(8, 3);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 7 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 9 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 100);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 20);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 20);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(5,3);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(6,3);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(7,3);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(8,3);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(9,3);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((int[]) buf[17])[0] = rslt.getInt(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((long[]) buf[19])[0] = rslt.getLong(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 1);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 20);
               ((String[]) buf[24])[0] = rslt.getString(14, 3);
               return;
            case 10 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 100);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 20);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 20);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(5,3);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(6,3);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(7,3);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(8,3);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(9,3);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((int[]) buf[17])[0] = rslt.getInt(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((long[]) buf[19])[0] = rslt.getLong(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 1);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 20);
               ((String[]) buf[24])[0] = rslt.getString(14, 3);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 12 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 100);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 20);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 20);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(6,3);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(7,3);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(8,3);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(9,3);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(10,3);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((int[]) buf[19])[0] = rslt.getInt(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((long[]) buf[21])[0] = rslt.getLong(12);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 1);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(14, 20);
               ((String[]) buf[26])[0] = rslt.getString(15, 3);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 10);
               ((String[]) buf[3])[0] = rslt.getString(4, 10);
               ((String[]) buf[4])[0] = rslt.getString(5, 10);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 32 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               ((int[]) buf[5])[0] = rslt.getInt(5);
               return;
            case 33 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 34 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 38 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 39 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 40 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,3);
               ((String[]) buf[9])[0] = rslt.getString(9, 3);
               ((int[]) buf[10])[0] = rslt.getInt(10);
               return;
            case 41 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 42 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               return;
            case 46 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 47 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               return;
            case 48 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 50);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,3);
               ((String[]) buf[8])[0] = rslt.getString(8, 3);
               ((int[]) buf[9])[0] = rslt.getInt(9);
               return;
            case 49 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 50 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               return;
            case 54 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 55 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               return;
            case 56 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 57 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 58 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
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
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
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
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 17 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 100);
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 20);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 20);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[8], 3);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[10], 3);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[12], 3);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[14], 3);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(9, (java.math.BigDecimal)parms[16], 3);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(10, ((Number) parms[18]).intValue());
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(11, ((Number) parms[20]).longValue());
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[22], 1);
               }
               stmt.setString(13, (String)parms[23], 20);
               stmt.setString(14, (String)parms[24], 3);
               return;
            case 18 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 100);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 20);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 20);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[7], 3);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[9], 3);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[11], 3);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[13], 3);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[15], 3);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(9, ((Number) parms[17]).intValue());
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(10, ((Number) parms[19]).longValue());
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[21], 1);
               }
               stmt.setString(12, (String)parms[22], 20);
               stmt.setString(13, (String)parms[23], 3);
               stmt.setInt(14, ((Number) parms[24]).intValue());
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 28 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 29 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
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
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(1, ((Number) parms[1]).longValue());
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(2, (java.math.BigDecimal)parms[3], 3);
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
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[7], 3);
               }
               stmt.setString(5, (String)parms[8], 3);
               stmt.setInt(6, ((Number) parms[9]).intValue());
               return;
            case 32 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 33 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 34 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 35 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 36 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 37 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 38 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 39 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 40 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
            case 41 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 42 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
            case 43 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 3);
               stmt.setString(4, (String)parms[3], 30);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setDateTime(6, (java.util.Date)parms[5], false);
               stmt.setBigDecimal(7, (java.math.BigDecimal)parms[6], 3);
               stmt.setString(8, (String)parms[7], 3);
               stmt.setInt(9, ((Number) parms[8]).intValue());
               return;
            case 44 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 3);
               stmt.setString(2, (String)parms[1], 30);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setDateTime(4, (java.util.Date)parms[3], false);
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 3);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setString(7, (String)parms[6], 3);
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setLong(9, ((Number) parms[8]).longValue());
               return;
            case 45 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
            case 46 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 47 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 48 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
            case 49 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 50 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
            case 51 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setString(3, (String)parms[2], 50);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setDateTime(5, (java.util.Date)parms[4], false);
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[5], 3);
               stmt.setString(7, (String)parms[6], 3);
               stmt.setInt(8, ((Number) parms[7]).intValue());
               return;
            case 52 :
               stmt.setString(1, (String)parms[0], 50);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setDateTime(3, (java.util.Date)parms[2], false);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 3);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 3);
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setLong(8, ((Number) parms[7]).longValue());
               return;
            case 53 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
            case 54 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 55 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 56 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 57 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 58 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

