package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tcccc_impl extends GXDataArea
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
      gxfirstwebparm = httpContext.GetNextPar( ) ;
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel1"+"_"+"CCARTDSC") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
         n252CliCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A11736CCArtCod = httpContext.GetPar( "CCArtCod") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx1asaccartdsc1HM1642( A396EmprCod, A252CliCod, A11736CCArtCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel2"+"_"+"TIPARTIDS") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A11748TipArtiId = (short)(GXutil.lval( httpContext.GetPar( "TipArtiId"))) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx2asatipartids1HM1648( A396EmprCod, A11748TipArtiId) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel3"+"_"+"INTDS") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A11750IntId = (short)(GXutil.lval( httpContext.GetPar( "IntId"))) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx3asaintds1HM1650( A396EmprCod, A11750IntId) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_5") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_5( A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_7") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A9713Tb1_Cod = (short)(GXutil.lval( httpContext.GetPar( "Tb1_Cod"))) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_7( A396EmprCod, A9713Tb1_Cod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_13") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A4031CCTCod = (int)(GXutil.lval( httpContext.GetPar( "CCTCod"))) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_13( A396EmprCod, A4031CCTCod) ;
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
         gxfirstwebparm = httpContext.GetNextPar( ) ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
      {
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxfirstwebparm = httpContext.GetNextPar( ) ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Gridtcccc_qualityrequeriments_articulos_tiposarticulo_colores_intensidades_controles") == 0 )
      {
         gxnrgridtcccc_qualityrequeriments_articulos_tiposarticulo_colores_intensidades_controles_newrow_invoke( ) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Grid5") == 0 )
      {
         gxnrgrid5_newrow_invoke( ) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Grid4") == 0 )
      {
         gxnrgrid4_newrow_invoke( ) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Grid3") == 0 )
      {
         gxnrgrid3_newrow_invoke( ) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Grid2") == 0 )
      {
         gxnrgrid2_newrow_invoke( ) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Grid1") == 0 )
      {
         gxnrgrid1_newrow_invoke( ) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Codigos Control Calidad Cuardeno Encargos CC", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public void gxnrgridtcccc_qualityrequeriments_articulos_tiposarticulo_colores_intensidades_controles_newrow_invoke( )
   {
      nRC_GXsfl_178 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_178"))) ;
      nGXsfl_178_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_178_idx"))) ;
      sGXsfl_178_idx = httpContext.GetPar( "sGXsfl_178_idx") ;
      Gx_mode = httpContext.GetPar( "Mode") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgridtcccc_qualityrequeriments_articulos_tiposarticulo_colores_intensidades_controles_newrow( ) ;
      /* End function gxnrGridtcccc_qualityrequeriments_articulos_tiposarticulo_colores_intensidades_controles_newrow_invoke */
   }

   public void gxnrgrid5_newrow_invoke( )
   {
      nRC_GXsfl_155 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_155"))) ;
      nGXsfl_155_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_155_idx"))) ;
      sGXsfl_155_idx = httpContext.GetPar( "sGXsfl_155_idx") ;
      Gx_mode = httpContext.GetPar( "Mode") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgrid5_newrow( ) ;
      /* End function gxnrGrid5_newrow_invoke */
   }

   public void gxnrgrid4_newrow_invoke( )
   {
      nRC_GXsfl_127 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_127"))) ;
      nGXsfl_127_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_127_idx"))) ;
      sGXsfl_127_idx = httpContext.GetPar( "sGXsfl_127_idx") ;
      Gx_mode = httpContext.GetPar( "Mode") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgrid4_newrow( ) ;
      /* End function gxnrGrid4_newrow_invoke */
   }

   public void gxnrgrid3_newrow_invoke( )
   {
      nRC_GXsfl_104 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_104"))) ;
      nGXsfl_104_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_104_idx"))) ;
      sGXsfl_104_idx = httpContext.GetPar( "sGXsfl_104_idx") ;
      Gx_mode = httpContext.GetPar( "Mode") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgrid3_newrow( ) ;
      /* End function gxnrGrid3_newrow_invoke */
   }

   public void gxnrgrid2_newrow_invoke( )
   {
      nRC_GXsfl_81 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_81"))) ;
      nGXsfl_81_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_81_idx"))) ;
      sGXsfl_81_idx = httpContext.GetPar( "sGXsfl_81_idx") ;
      Gx_mode = httpContext.GetPar( "Mode") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgrid2_newrow( ) ;
      /* End function gxnrGrid2_newrow_invoke */
   }

   public void gxnrgrid1_newrow_invoke( )
   {
      nRC_GXsfl_58 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_58"))) ;
      nGXsfl_58_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_58_idx"))) ;
      sGXsfl_58_idx = httpContext.GetPar( "sGXsfl_58_idx") ;
      Gx_mode = httpContext.GetPar( "Mode") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgrid1_newrow( ) ;
      /* End function gxnrGrid1_newrow_invoke */
   }

   public tcccc_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tcccc_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tcccc_impl.class ));
   }

   public tcccc_impl( int remoteHandle ,
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
      app.GxWebStd.gx_div_start( httpContext, divMaintable_Internalname, 1, 0, "px", 0, "px", "WWAdvancedContainer", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-8 col-sm-offset-2", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTitlecontainer_Internalname, 1, 0, "px", 0, "px", "TableTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, httpContext.getMessage( "Codigos Control Calidad Cuardeno Encargos CC", ""), "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, 0, (short)(0), "HLP_TCCCC.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      ClassString = "ErrorViewer" ;
      StyleString = "" ;
      app.GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), StyleString, ClassString, "", "false");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-8 col-sm-offset-2", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divFormcontainer_Internalname, 1, 0, "px", 0, "px", "FormContainer", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divToolbarcell_Internalname, 1, 0, "px", 0, "px", "col-xs-12 col-sm-9 col-sm-offset-3 ToolbarCellClass", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "btn-group", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
      ClassString = "BtnFirst" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCCCC.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
      ClassString = "BtnPrevious" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCCCC.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      ClassString = "BtnNext" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCCCC.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
      ClassString = "BtnLast" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCCCC.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
      ClassString = "BtnSelect" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TCCCC.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCellAdvanced", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtEmprCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtEmprCod_Internalname, httpContext.getMessage( "Empresa", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 34,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,34);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCCCC.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtEmprNom_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtEmprNom_Internalname, httpContext.getMessage( "Nombre", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCCCC.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCliCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCliCod_Internalname, httpContext.getMessage( "Cliente", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,44);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCCCC.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCliNom_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCliNom_Internalname, httpContext.getMessage( "Nombre Cliente", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliNom_Internalname, GXutil.rtrim( A279CliNom), GXutil.rtrim( localUtil.format( A279CliNom, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliNom_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtCliNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCCCC.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 LevelTable", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divQualityrequerimentstable_Internalname, 1, 0, "px", 0, "px", "LevelTable", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTitlequalityrequeriments_Internalname, httpContext.getMessage( "Quality Requeriments", ""), "", "", lblTitlequalityrequeriments_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, 0, (short)(0), "HLP_TCCCC.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      gxdraw_grid1( ) ;
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "Center", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group Confirm", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 185,'',false,'',0)\"" ;
      ClassString = "BtnEnter" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCCCC.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 187,'',false,'',0)\"" ;
      ClassString = "BtnCancel" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCCCC.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 189,'',false,'',0)\"" ;
      ClassString = "BtnDelete" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCCCC.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
   }

   public void gxdraw_grid1( )
   {
      /*  Grid Control  */
      startgridcontrol58( ) ;
      /* Save parent mode. */
      sMode1534 = Gx_mode ;
      nGXsfl_58_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1534 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1534 = (short)(1) ;
            scanStart1HM1534( ) ;
            while ( RcdFound1534 != 0 )
            {
               init_level_properties1534( ) ;
               getByPrimaryKey1HM1534( ) ;
               addRow1HM1534( ) ;
               scanNext1HM1534( ) ;
            }
            scanEnd1HM1534( ) ;
            nBlankRcdCount1534 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal1HM1534( ) ;
         standaloneModal1HM1534( ) ;
         sMode1534 = Gx_mode ;
         while ( nGXsfl_58_idx < nRC_GXsfl_58 )
         {
            bGXsfl_58_Refreshing = true ;
            readRow1HM1534( ) ;
            edtTb1_Cod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TB1_COD_"+sGXsfl_58_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtTb1_Cod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTb1_Cod_Enabled), 5, 0), !bGXsfl_58_Refreshing);
            edtTb1_Dsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TB1_DSC_"+sGXsfl_58_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtTb1_Dsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTb1_Dsc_Enabled), 5, 0), !bGXsfl_58_Refreshing);
            if ( ( nRcdExists_1534 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1HM1534( ) ;
            }
            sendRow1HM1534( ) ;
            bGXsfl_58_Refreshing = false ;
         }
         Gx_mode = sMode1534 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1534 = (short)(5) ;
         nRcdExists_1534 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1HM1534( ) ;
            while ( RcdFound1534 != 0 )
            {
               sGXsfl_58_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_58_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_581534( ) ;
               init_level_properties1534( ) ;
               standaloneNotModal1HM1534( ) ;
               getByPrimaryKey1HM1534( ) ;
               standaloneModal1HM1534( ) ;
               addRow1HM1534( ) ;
               scanNext1HM1534( ) ;
            }
            scanEnd1HM1534( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1534 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_58_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_58_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_581534( ) ;
      initAll1HM1534( ) ;
      init_level_properties1534( ) ;
      nRcdExists_1534 = (short)(0) ;
      nIsMod_1534 = (short)(0) ;
      nRcdDeleted_1534 = (short)(0) ;
      nBlankRcdCount1534 = (short)(nBlankRcdUsr1534+nBlankRcdCount1534) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1534 > 0 )
      {
         standaloneNotModal1HM1534( ) ;
         standaloneModal1HM1534( ) ;
         addRow1HM1534( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtTb1_Cod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1534 = (short)(nBlankRcdCount1534-1) ;
      }
      Gx_mode = sMode1534 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* Restore parent mode. */
      Gx_mode = sMode1534 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sStyleString = "" ;
      httpContext.writeText( "<div id=\""+"Grid1Container"+"Div\" "+sStyleString+">"+"</div>") ;
      httpContext.ajax_rsp_assign_grid("_"+"Grid1", Grid1Container, subGrid1_Internalname);
      if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Grid1ContainerData", Grid1Container.ToJavascriptSource());
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Grid1ContainerData"+"V", Grid1Container.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Grid1ContainerData"+"V"+"\" value='"+Grid1Container.GridValuesHidden()+"'/>") ;
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
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
         Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
         Z252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z252CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z279CliNom = httpContext.cgiGet( "Z279CliNom") ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         nRC_GXsfl_58 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_58"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         /* Read variables values. */
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
         n407EmprNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CLICOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtCliCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A252CliCod = 0 ;
            n252CliCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         }
         else
         {
            A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n252CliCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         }
         A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         /* Check if conditions changed and reset current page numbers */
         /* Check if conditions changed and reset current page numbers */
         /* Check if conditions changed and reset current page numbers */
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
            A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
            n252CliCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            getEqualNoModal( ) ;
            Gx_mode = "DSP" ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            disable_std_buttons_dsp( ) ;
            standaloneModal( ) ;
         }
         else
         {
            Gx_mode = "INS" ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            standaloneModal( ) ;
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
                     if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        btn_enter( ) ;
                        /* No code required for Cancel button. It is implemented as the Reset button. */
                     }
                     else if ( GXutil.strcmp(sEvt, "FIRST") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        btn_first( ) ;
                     }
                     else if ( GXutil.strcmp(sEvt, "PREVIOUS") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        btn_previous( ) ;
                     }
                     else if ( GXutil.strcmp(sEvt, "NEXT") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        btn_next( ) ;
                     }
                     else if ( GXutil.strcmp(sEvt, "LAST") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        btn_last( ) ;
                     }
                     else if ( GXutil.strcmp(sEvt, "SELECT") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        btn_select( ) ;
                     }
                     else if ( GXutil.strcmp(sEvt, "DELETE") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        btn_delete( ) ;
                     }
                     else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        afterkeyloadscreen( ) ;
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
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll1HM21( ) ;
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
      if ( isIns( ) )
      {
         bttBtn_delete_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      }
   }

   public void disable_std_buttons_dsp( )
   {
      bttBtn_delete_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Visible), 5, 0), true);
      bttBtn_first_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_first_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_first_Visible), 5, 0), true);
      bttBtn_previous_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_previous_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_previous_Visible), 5, 0), true);
      bttBtn_next_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_next_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_next_Visible), 5, 0), true);
      bttBtn_last_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_last_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_last_Visible), 5, 0), true);
      bttBtn_select_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_select_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_select_Visible), 5, 0), true);
      bttBtn_delete_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Visible), 5, 0), true);
      if ( isDsp( ) )
      {
         bttBtn_enter_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Visible), 5, 0), true);
      }
      disableAttributes1HM21( ) ;
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

   public void confirm_1HM1651( )
   {
      nGXsfl_178_idx = 0 ;
      while ( nGXsfl_178_idx < nRC_GXsfl_178 )
      {
         readRow1HM1651( ) ;
         if ( ( nRcdExists_1651 != 0 ) || ( nIsMod_1651 != 0 ) )
         {
            getKey1HM1651( ) ;
            if ( ( nRcdExists_1651 == 0 ) && ( nRcdDeleted_1651 == 0 ) )
            {
               if ( RcdFound1651 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1HM1651( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1HM1651( ) ;
                     closeExtendedTableCursors1HM1651( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "TB1_COD_" + sGXsfl_58_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtTb1_Cod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1651 != 0 )
               {
                  if ( nRcdDeleted_1651 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1HM1651( ) ;
                     load1HM1651( ) ;
                     beforeValidate1HM1651( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1HM1651( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1651 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1HM1651( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1HM1651( ) ;
                           closeExtendedTableCursors1HM1651( ) ;
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
                  if ( nRcdDeleted_1651 == 0 )
                  {
                     GXCCtl = "TB1_COD_" + sGXsfl_58_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtTb1_Cod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtCCTCod_Internalname, GXutil.ltrim( localUtil.ntoc( A4031CCTCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCCTDsc_Internalname, GXutil.rtrim( A4036CCTDsc)) ;
         httpContext.changePostValue( "ZT_"+"Z4031CCTCod_"+sGXsfl_178_idx, GXutil.ltrim( localUtil.ntoc( Z4031CCTCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1651_"+sGXsfl_178_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1651, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1651_"+sGXsfl_178_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1651, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1651_"+sGXsfl_178_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1651, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1651 != 0 )
         {
            httpContext.changePostValue( "CCTCOD_"+sGXsfl_178_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCTCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CCTDSC_"+sGXsfl_178_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCTDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void confirm_1HM1650( )
   {
      nGXsfl_155_idx = 0 ;
      while ( nGXsfl_155_idx < nRC_GXsfl_155 )
      {
         readRow1HM1650( ) ;
         if ( ( nRcdExists_1650 != 0 ) || ( nIsMod_1650 != 0 ) )
         {
            getKey1HM1650( ) ;
            if ( ( nRcdExists_1650 == 0 ) && ( nRcdDeleted_1650 == 0 ) )
            {
               if ( RcdFound1650 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1HM1650( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1HM1650( ) ;
                     closeExtendedTableCursors1HM1650( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Save parent mode. */
                        sMode1650 = Gx_mode ;
                        confirm_1HM1651( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Restore parent mode. */
                           Gx_mode = sMode1650 ;
                           httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                           IsConfirmed = (short)(1) ;
                           httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                        }
                        /* Restore parent mode. */
                        Gx_mode = sMode1650 ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     }
                  }
               }
               else
               {
                  GXCCtl = "TB1_COD_" + sGXsfl_58_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtTb1_Cod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1650 != 0 )
               {
                  if ( nRcdDeleted_1650 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1HM1650( ) ;
                     load1HM1650( ) ;
                     beforeValidate1HM1650( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1HM1650( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1650 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1HM1650( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1HM1650( ) ;
                           closeExtendedTableCursors1HM1650( ) ;
                           if ( AnyError == 0 )
                           {
                              /* Save parent mode. */
                              sMode1650 = Gx_mode ;
                              confirm_1HM1651( ) ;
                              if ( AnyError == 0 )
                              {
                                 /* Restore parent mode. */
                                 Gx_mode = sMode1650 ;
                                 httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                                 IsConfirmed = (short)(1) ;
                                 httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                              }
                              /* Restore parent mode. */
                              Gx_mode = sMode1650 ;
                              httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                           }
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1650 == 0 )
                  {
                     GXCCtl = "TB1_COD_" + sGXsfl_58_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtTb1_Cod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtIntId_Internalname, GXutil.ltrim( localUtil.ntoc( A11750IntId, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtIntDs_Internalname, GXutil.rtrim( A11747IntDs)) ;
         httpContext.changePostValue( "ZT_"+"Z11750IntId_"+sGXsfl_155_idx, GXutil.ltrim( localUtil.ntoc( Z11750IntId, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRC_GXsfl_178_"+sGXsfl_155_idx, GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_178, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1650_"+sGXsfl_155_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1650, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1650_"+sGXsfl_155_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1650, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1650_"+sGXsfl_155_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1650, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1650 != 0 )
         {
            httpContext.changePostValue( "INTID_"+sGXsfl_155_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtIntId_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "INTDS_"+sGXsfl_155_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtIntDs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void confirm_1HM1649( )
   {
      nGXsfl_127_idx = 0 ;
      while ( nGXsfl_127_idx < nRC_GXsfl_127 )
      {
         readRow1HM1649( ) ;
         if ( ( nRcdExists_1649 != 0 ) || ( nIsMod_1649 != 0 ) )
         {
            getKey1HM1649( ) ;
            if ( ( nRcdExists_1649 == 0 ) && ( nRcdDeleted_1649 == 0 ) )
            {
               if ( RcdFound1649 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1HM1649( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1HM1649( ) ;
                     closeExtendedTableCursors1HM1649( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Save parent mode. */
                        sMode1649 = Gx_mode ;
                        confirm_1HM1650( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Restore parent mode. */
                           Gx_mode = sMode1649 ;
                           httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                           IsConfirmed = (short)(1) ;
                           httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                        }
                        /* Restore parent mode. */
                        Gx_mode = sMode1649 ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     }
                  }
               }
               else
               {
                  GXCCtl = "TB1_COD_" + sGXsfl_58_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtTb1_Cod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1649 != 0 )
               {
                  if ( nRcdDeleted_1649 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1HM1649( ) ;
                     load1HM1649( ) ;
                     beforeValidate1HM1649( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1HM1649( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1649 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1HM1649( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1HM1649( ) ;
                           closeExtendedTableCursors1HM1649( ) ;
                           if ( AnyError == 0 )
                           {
                              /* Save parent mode. */
                              sMode1649 = Gx_mode ;
                              confirm_1HM1650( ) ;
                              if ( AnyError == 0 )
                              {
                                 /* Restore parent mode. */
                                 Gx_mode = sMode1649 ;
                                 httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                                 IsConfirmed = (short)(1) ;
                                 httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                              }
                              /* Restore parent mode. */
                              Gx_mode = sMode1649 ;
                              httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                           }
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1649 == 0 )
                  {
                     GXCCtl = "TB1_COD_" + sGXsfl_58_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtTb1_Cod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtCCColNom_Internalname, GXutil.rtrim( A11737CCColNom)) ;
         httpContext.changePostValue( edtCCColNum_Internalname, GXutil.ltrim( localUtil.ntoc( A11738CCColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCCCTc_Internalname, GXutil.ltrim( localUtil.ntoc( A11749CCCTc, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11737CCColNom_"+sGXsfl_127_idx, GXutil.rtrim( Z11737CCColNom)) ;
         httpContext.changePostValue( "ZT_"+"Z11738CCColNum_"+sGXsfl_127_idx, GXutil.ltrim( localUtil.ntoc( Z11738CCColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11749CCCTc_"+sGXsfl_127_idx, GXutil.ltrim( localUtil.ntoc( Z11749CCCTc, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRC_GXsfl_155_"+sGXsfl_127_idx, GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_155, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1649_"+sGXsfl_127_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1649, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1649_"+sGXsfl_127_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1649, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1649_"+sGXsfl_127_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1649, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1649 != 0 )
         {
            httpContext.changePostValue( "CCCOLNOM_"+sGXsfl_127_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCColNom_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CCCOLNUM_"+sGXsfl_127_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCColNum_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CCCTC_"+sGXsfl_127_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCCTc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void confirm_1HM1648( )
   {
      nGXsfl_104_idx = 0 ;
      while ( nGXsfl_104_idx < nRC_GXsfl_104 )
      {
         readRow1HM1648( ) ;
         if ( ( nRcdExists_1648 != 0 ) || ( nIsMod_1648 != 0 ) )
         {
            getKey1HM1648( ) ;
            if ( ( nRcdExists_1648 == 0 ) && ( nRcdDeleted_1648 == 0 ) )
            {
               if ( RcdFound1648 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1HM1648( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1HM1648( ) ;
                     closeExtendedTableCursors1HM1648( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Save parent mode. */
                        sMode1648 = Gx_mode ;
                        confirm_1HM1649( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Restore parent mode. */
                           Gx_mode = sMode1648 ;
                           httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                           IsConfirmed = (short)(1) ;
                           httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                        }
                        /* Restore parent mode. */
                        Gx_mode = sMode1648 ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     }
                  }
               }
               else
               {
                  GXCCtl = "TB1_COD_" + sGXsfl_58_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtTb1_Cod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1648 != 0 )
               {
                  if ( nRcdDeleted_1648 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1HM1648( ) ;
                     load1HM1648( ) ;
                     beforeValidate1HM1648( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1HM1648( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1648 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1HM1648( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1HM1648( ) ;
                           closeExtendedTableCursors1HM1648( ) ;
                           if ( AnyError == 0 )
                           {
                              /* Save parent mode. */
                              sMode1648 = Gx_mode ;
                              confirm_1HM1649( ) ;
                              if ( AnyError == 0 )
                              {
                                 /* Restore parent mode. */
                                 Gx_mode = sMode1648 ;
                                 httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                                 IsConfirmed = (short)(1) ;
                                 httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                              }
                              /* Restore parent mode. */
                              Gx_mode = sMode1648 ;
                              httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                           }
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1648 == 0 )
                  {
                     GXCCtl = "TB1_COD_" + sGXsfl_58_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtTb1_Cod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtTipArtiId_Internalname, GXutil.ltrim( localUtil.ntoc( A11748TipArtiId, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtTipArtiDs_Internalname, GXutil.rtrim( A11746TipArtiDs)) ;
         httpContext.changePostValue( "ZT_"+"Z11748TipArtiId_"+sGXsfl_104_idx, GXutil.ltrim( localUtil.ntoc( Z11748TipArtiId, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRC_GXsfl_127_"+sGXsfl_104_idx, GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_127, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1648_"+sGXsfl_104_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1648, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1648_"+sGXsfl_104_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1648, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1648_"+sGXsfl_104_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1648, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1648 != 0 )
         {
            httpContext.changePostValue( "TIPARTIID_"+sGXsfl_104_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTipArtiId_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TIPARTIDS_"+sGXsfl_104_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTipArtiDs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void confirm_1HM1642( )
   {
      nGXsfl_81_idx = 0 ;
      while ( nGXsfl_81_idx < nRC_GXsfl_81 )
      {
         readRow1HM1642( ) ;
         if ( ( nRcdExists_1642 != 0 ) || ( nIsMod_1642 != 0 ) )
         {
            getKey1HM1642( ) ;
            if ( ( nRcdExists_1642 == 0 ) && ( nRcdDeleted_1642 == 0 ) )
            {
               if ( RcdFound1642 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1HM1642( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1HM1642( ) ;
                     closeExtendedTableCursors1HM1642( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Save parent mode. */
                        sMode1642 = Gx_mode ;
                        confirm_1HM1648( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Restore parent mode. */
                           Gx_mode = sMode1642 ;
                           httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                           IsConfirmed = (short)(1) ;
                           httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                        }
                        /* Restore parent mode. */
                        Gx_mode = sMode1642 ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     }
                  }
               }
               else
               {
                  GXCCtl = "TB1_COD_" + sGXsfl_58_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtTb1_Cod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1642 != 0 )
               {
                  if ( nRcdDeleted_1642 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1HM1642( ) ;
                     load1HM1642( ) ;
                     beforeValidate1HM1642( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1HM1642( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1642 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1HM1642( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1HM1642( ) ;
                           closeExtendedTableCursors1HM1642( ) ;
                           if ( AnyError == 0 )
                           {
                              /* Save parent mode. */
                              sMode1642 = Gx_mode ;
                              confirm_1HM1648( ) ;
                              if ( AnyError == 0 )
                              {
                                 /* Restore parent mode. */
                                 Gx_mode = sMode1642 ;
                                 httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                                 IsConfirmed = (short)(1) ;
                                 httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                              }
                              /* Restore parent mode. */
                              Gx_mode = sMode1642 ;
                              httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                           }
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1642 == 0 )
                  {
                     GXCCtl = "TB1_COD_" + sGXsfl_58_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtTb1_Cod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtCCArtCod_Internalname, GXutil.rtrim( A11736CCArtCod)) ;
         httpContext.changePostValue( edtCCArtdsc_Internalname, GXutil.rtrim( A11745CCArtdsc)) ;
         httpContext.changePostValue( "ZT_"+"Z11736CCArtCod_"+sGXsfl_81_idx, GXutil.rtrim( Z11736CCArtCod)) ;
         httpContext.changePostValue( "nRC_GXsfl_104_"+sGXsfl_81_idx, GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_104, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1642_"+sGXsfl_81_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1642, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1642_"+sGXsfl_81_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1642, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1642_"+sGXsfl_81_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1642, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1642 != 0 )
         {
            httpContext.changePostValue( "CCARTCOD_"+sGXsfl_81_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCArtCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CCARTDSC_"+sGXsfl_81_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCArtdsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void confirm_1HM1534( )
   {
      nGXsfl_58_idx = 0 ;
      while ( nGXsfl_58_idx < nRC_GXsfl_58 )
      {
         readRow1HM1534( ) ;
         if ( ( nRcdExists_1534 != 0 ) || ( nIsMod_1534 != 0 ) )
         {
            getKey1HM1534( ) ;
            if ( ( nRcdExists_1534 == 0 ) && ( nRcdDeleted_1534 == 0 ) )
            {
               if ( RcdFound1534 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1HM1534( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1HM1534( ) ;
                     closeExtendedTableCursors1HM1534( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Save parent mode. */
                        sMode1534 = Gx_mode ;
                        confirm_1HM1642( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Restore parent mode. */
                           Gx_mode = sMode1534 ;
                           httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                           IsConfirmed = (short)(1) ;
                           httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                        }
                        /* Restore parent mode. */
                        Gx_mode = sMode1534 ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     }
                  }
               }
               else
               {
                  GXCCtl = "TB1_COD_" + sGXsfl_58_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtTb1_Cod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1534 != 0 )
               {
                  if ( nRcdDeleted_1534 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1HM1534( ) ;
                     load1HM1534( ) ;
                     beforeValidate1HM1534( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1HM1534( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1534 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1HM1534( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1HM1534( ) ;
                           closeExtendedTableCursors1HM1534( ) ;
                           if ( AnyError == 0 )
                           {
                              /* Save parent mode. */
                              sMode1534 = Gx_mode ;
                              confirm_1HM1642( ) ;
                              if ( AnyError == 0 )
                              {
                                 /* Restore parent mode. */
                                 Gx_mode = sMode1534 ;
                                 httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                                 IsConfirmed = (short)(1) ;
                                 httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                              }
                              /* Restore parent mode. */
                              Gx_mode = sMode1534 ;
                              httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                           }
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1534 == 0 )
                  {
                     GXCCtl = "TB1_COD_" + sGXsfl_58_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtTb1_Cod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtTb1_Cod_Internalname, GXutil.ltrim( localUtil.ntoc( A9713Tb1_Cod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtTb1_Dsc_Internalname, GXutil.rtrim( A9715Tb1_Dsc)) ;
         httpContext.changePostValue( "ZT_"+"Z9713Tb1_Cod_"+sGXsfl_58_idx, GXutil.ltrim( localUtil.ntoc( Z9713Tb1_Cod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRC_GXsfl_81_"+sGXsfl_58_idx, GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_81, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1534_"+sGXsfl_58_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1534, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1534_"+sGXsfl_58_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1534, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1534_"+sGXsfl_58_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1534, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1534 != 0 )
         {
            httpContext.changePostValue( "TB1_COD_"+sGXsfl_58_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTb1_Cod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TB1_DSC_"+sGXsfl_58_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTb1_Dsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1HM0( )
   {
   }

   public void zm1HM21( int GX_JID )
   {
      if ( ( GX_JID == 4 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z279CliNom = T01HM17_A279CliNom[0] ;
         }
         else
         {
            Z279CliNom = A279CliNom ;
         }
      }
      if ( GX_JID == -4 )
      {
         Z252CliCod = A252CliCod ;
         Z279CliNom = A279CliNom ;
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
   }

   public void standaloneModal( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         bttBtn_delete_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      }
      else
      {
         bttBtn_delete_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      }
      if ( GXutil.strcmp(Gx_mode, "DSP") == 0 )
      {
         bttBtn_enter_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      }
      else
      {
         bttBtn_enter_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      }
   }

   public void load1HM21( )
   {
      /* Using cursor T01HM19 */
      pr_default.execute(17, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(17) != 101) )
      {
         RcdFound21 = (short)(1) ;
         A407EmprNom = T01HM19_A407EmprNom[0] ;
         n407EmprNom = T01HM19_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A279CliNom = T01HM19_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         zm1HM21( -4) ;
      }
      pr_default.close(17);
      onLoadActions1HM21( ) ;
   }

   public void onLoadActions1HM21( )
   {
   }

   public void checkExtendedTable1HM21( )
   {
      nIsDirty_21 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01HM18 */
      pr_default.execute(16, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(16) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01HM18_A407EmprNom[0] ;
      n407EmprNom = T01HM18_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(16);
   }

   public void closeExtendedTableCursors1HM21( )
   {
      pr_default.close(16);
   }

   public void enableDisable( )
   {
   }

   public void gxload_5( String A396EmprCod )
   {
      /* Using cursor T01HM20 */
      pr_default.execute(18, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(18) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01HM20_A407EmprNom[0] ;
      n407EmprNom = T01HM20_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A407EmprNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(18) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(18);
   }

   public void getKey1HM21( )
   {
      /* Using cursor T01HM21 */
      pr_default.execute(19, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(19) != 101) )
      {
         RcdFound21 = (short)(1) ;
      }
      else
      {
         RcdFound21 = (short)(0) ;
      }
      pr_default.close(19);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01HM17 */
      pr_default.execute(15, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(15) != 101) )
      {
         zm1HM21( 4) ;
         RcdFound21 = (short)(1) ;
         A252CliCod = T01HM17_A252CliCod[0] ;
         n252CliCod = T01HM17_n252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A279CliNom = T01HM17_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A396EmprCod = T01HM17_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         sMode21 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1HM21( ) ;
         if ( AnyError == 1 )
         {
            RcdFound21 = (short)(0) ;
            initializeNonKey1HM21( ) ;
         }
         Gx_mode = sMode21 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound21 = (short)(0) ;
         initializeNonKey1HM21( ) ;
         sMode21 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode21 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(15);
   }

   public void getEqualNoModal( )
   {
      getKey1HM21( ) ;
      if ( RcdFound21 == 0 )
      {
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound21 = (short)(0) ;
      /* Using cursor T01HM22 */
      pr_default.execute(20, new Object[] {A396EmprCod, A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(20) != 101) )
      {
         while ( (pr_default.getStatus(20) != 101) && ( ( GXutil.strcmp(T01HM22_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01HM22_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01HM22_A252CliCod[0] < A252CliCod ) ) )
         {
            pr_default.readNext(20);
         }
         if ( (pr_default.getStatus(20) != 101) && ( ( GXutil.strcmp(T01HM22_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01HM22_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01HM22_A252CliCod[0] > A252CliCod ) ) )
         {
            A396EmprCod = T01HM22_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A252CliCod = T01HM22_A252CliCod[0] ;
            n252CliCod = T01HM22_n252CliCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            RcdFound21 = (short)(1) ;
         }
      }
      pr_default.close(20);
   }

   public void move_previous( )
   {
      RcdFound21 = (short)(0) ;
      /* Using cursor T01HM23 */
      pr_default.execute(21, new Object[] {A396EmprCod, A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(21) != 101) )
      {
         while ( (pr_default.getStatus(21) != 101) && ( ( GXutil.strcmp(T01HM23_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01HM23_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01HM23_A252CliCod[0] > A252CliCod ) ) )
         {
            pr_default.readNext(21);
         }
         if ( (pr_default.getStatus(21) != 101) && ( ( GXutil.strcmp(T01HM23_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01HM23_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01HM23_A252CliCod[0] < A252CliCod ) ) )
         {
            A396EmprCod = T01HM23_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A252CliCod = T01HM23_A252CliCod[0] ;
            n252CliCod = T01HM23_n252CliCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            RcdFound21 = (short)(1) ;
         }
      }
      pr_default.close(21);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1HM21( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1HM21( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound21 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A252CliCod = Z252CliCod ;
               n252CliCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update1HM21( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1HM21( ) ;
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
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  /* Insert record */
                  GX_FocusControl = edtEmprCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1HM21( ) ;
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
   }

   public void btn_delete( )
   {
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = Z252CliCod ;
         n252CliCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         getByPrimaryKey( ) ;
      }
      CloseOpenCursors();
   }

   public void btn_get( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      getEqualNoModal( ) ;
      if ( RcdFound21 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtCliNom_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1HM21( ) ;
      if ( RcdFound21 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtCliNom_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1HM21( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_previous( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      move_previous( ) ;
      if ( RcdFound21 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtCliNom_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_next( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      move_next( ) ;
      if ( RcdFound21 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtCliNom_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_last( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1HM21( ) ;
      if ( RcdFound21 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound21 != 0 )
         {
            scanNext1HM21( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtCliNom_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1HM21( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1HM21( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01HM16 */
         pr_default.execute(14, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(14) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCLIENT"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(14) == 101) || ( GXutil.strcmp(Z279CliNom, T01HM16_A279CliNom[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z279CliNom, T01HM16_A279CliNom[0]) != 0 )
            {
               GXutil.writeLogln("tcccc:[seudo value changed for attri]"+"CliNom");
               GXutil.writeLogRaw("Old: ",Z279CliNom);
               GXutil.writeLogRaw("Current: ",T01HM16_A279CliNom[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCLIENT"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1HM21( )
   {
      beforeValidate1HM21( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1HM21( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1HM21( 0) ;
         checkOptimisticConcurrency1HM21( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1HM21( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1HM21( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01HM24 */
                  pr_default.execute(22, new Object[] {Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A279CliNom, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCLIENT");
                  if ( (pr_default.getStatus(22) == 1) )
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
                        processLevel1HM21( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1HM0( ) ;
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
            load1HM21( ) ;
         }
         endLevel1HM21( ) ;
      }
      closeExtendedTableCursors1HM21( ) ;
   }

   public void update1HM21( )
   {
      beforeValidate1HM21( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1HM21( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1HM21( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1HM21( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1HM21( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01HM25 */
                  pr_default.execute(23, new Object[] {A279CliNom, A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCLIENT");
                  if ( (pr_default.getStatus(23) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCLIENT"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1HM21( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1HM21( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1HM0( ) ;
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
         endLevel1HM21( ) ;
      }
      closeExtendedTableCursors1HM21( ) ;
   }

   public void deferredUpdate1HM21( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1HM21( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1HM21( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1HM21( ) ;
         afterConfirm1HM21( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1HM21( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01HM26 */
               pr_default.execute(24, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCLIENT");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound21 == 0 )
                     {
                        initAll1HM21( ) ;
                        Gx_mode = "INS" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     }
                     else
                     {
                        getByPrimaryKey( ) ;
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     }
                     endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucdeleted") ;
                     endTrnMsgCod = "SuccessfullyDeleted" ;
                     resetCaption1HM0( ) ;
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
      sMode21 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1HM21( ) ;
      Gx_mode = sMode21 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1HM21( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01HM27 */
         pr_default.execute(25, new Object[] {A396EmprCod});
         A407EmprNom = T01HM27_A407EmprNom[0] ;
         n407EmprNom = T01HM27_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         pr_default.close(25);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T01HM28 */
         pr_default.execute(26, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(26) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "REGCOR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(26);
         /* Using cursor T01HM29 */
         pr_default.execute(27, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(27) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TEX000", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(27);
         /* Using cursor T01HM30 */
         pr_default.execute(28, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(28) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CLTATCIN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(28);
         /* Using cursor T01HM31 */
         pr_default.execute(29, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(29) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "RECMA1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(29);
         /* Using cursor T01HM32 */
         pr_default.execute(30, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(30) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DEVEMP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(30);
         /* Using cursor T01HM33 */
         pr_default.execute(31, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(31) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ConPes", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(31);
         /* Using cursor T01HM34 */
         pr_default.execute(32, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(32) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ENS001", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(32);
         /* Using cursor T01HM35 */
         pr_default.execute(33, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(33) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CLIINF", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(33);
         /* Using cursor T01HM36 */
         pr_default.execute(34, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(34) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CLIINE", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(34);
         /* Using cursor T01HM37 */
         pr_default.execute(35, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(35) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CLIDTF", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(35);
         /* Using cursor T01HM38 */
         pr_default.execute(36, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(36) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CLIDTE", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(36);
         /* Using cursor T01HM39 */
         pr_default.execute(37, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(37) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PREQL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(37);
         /* Using cursor T01HM40 */
         pr_default.execute(38, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(38) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CLIMOD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(38);
         /* Using cursor T01HM41 */
         pr_default.execute(39, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(39) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CLIIN2", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(39);
         /* Using cursor T01HM42 */
         pr_default.execute(40, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(40) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CLIINTF", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(40);
         /* Using cursor T01HM43 */
         pr_default.execute(41, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(41) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PREFSP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(41);
         /* Using cursor T01HM44 */
         pr_default.execute(42, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(42) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CLIPRLL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(42);
         /* Using cursor T01HM45 */
         pr_default.execute(43, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(43) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Pagos de Clientes", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(43);
         /* Using cursor T01HM46 */
         pr_default.execute(44, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(44) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HLREOP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(44);
         /* Using cursor T01HM47 */
         pr_default.execute(45, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(45) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ESTPRE", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(45);
         /* Using cursor T01HM48 */
         pr_default.execute(46, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(46) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ENSLAV", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(46);
         /* Using cursor T01HM49 */
         pr_default.execute(47, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(47) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISTORICO RECETAS (Hdr)", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(47);
         /* Using cursor T01HM50 */
         pr_default.execute(48, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(48) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Colores p/Estampación", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(48);
         /* Using cursor T01HM51 */
         pr_default.execute(49, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(49) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "WEBU", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(49);
         /* Using cursor T01HM52 */
         pr_default.execute(50, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(50) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Empesas de la Disposición", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(50);
         /* Using cursor T01HM53 */
         pr_default.execute(51, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(51) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CHISES", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(51);
         /* Using cursor T01HM54 */
         pr_default.execute(52, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(52) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CGRPEQ", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(52);
         /* Using cursor T01HM55 */
         pr_default.execute(53, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(53) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CGRMOL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(53);
         /* Using cursor T01HM56 */
         pr_default.execute(54, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(54) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CGRCIL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(54);
         /* Using cursor T01HM57 */
         pr_default.execute(55, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(55) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CEMPES", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(55);
         /* Using cursor T01HM58 */
         pr_default.execute(56, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(56) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CDIBUJ", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(56);
         /* Using cursor T01HM59 */
         pr_default.execute(57, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(57) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALEXT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(57);
         /* Using cursor T01HM60 */
         pr_default.execute(58, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(58) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "FACPRO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(58);
         /* Using cursor T01HM61 */
         pr_default.execute(59, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(59) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LCONTI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(59);
         /* Using cursor T01HM62 */
         pr_default.execute(60, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(60) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBTRA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(60);
         /* Using cursor T01HM63 */
         pr_default.execute(61, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(61) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PREKIL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(61);
         /* Using cursor T01HM64 */
         pr_default.execute(62, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(62) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "COMREP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(62);
         /* Using cursor T01HM65 */
         pr_default.execute(63, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(63) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LCOSTI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(63);
         /* Using cursor T01HM66 */
         pr_default.execute(64, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(64) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CFACSA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(64);
         /* Using cursor T01HM67 */
         pr_default.execute(65, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(65) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LKGSTI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(65);
         /* Using cursor T01HM68 */
         pr_default.execute(66, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(66) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CRECON", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(66);
         /* Using cursor T01HM69 */
         pr_default.execute(67, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(67) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CCLIPR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(67);
         /* Using cursor T01HM70 */
         pr_default.execute(68, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(68) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISMAC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(68);
         /* Using cursor T01HM71 */
         pr_default.execute(69, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(69) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CESCLI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(69);
         /* Using cursor T01HM72 */
         pr_default.execute(70, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(70) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CRECLT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(70);
         /* Using cursor T01HM73 */
         pr_default.execute(71, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(71) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CTARCO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(71);
         /* Using cursor T01HM74 */
         pr_default.execute(72, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(72) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ABCEXP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(72);
         /* Using cursor T01HM75 */
         pr_default.execute(73, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(73) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CLIDES", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(73);
         /* Using cursor T01HM76 */
         pr_default.execute(74, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(74) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CMOVPD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(74);
         /* Using cursor T01HM77 */
         pr_default.execute(75, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(75) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CPARTI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(75);
         /* Using cursor T01HM78 */
         pr_default.execute(76, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(76) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALBPV", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(76);
         /* Using cursor T01HM79 */
         pr_default.execute(77, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(77) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CENTMA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(77);
         /* Using cursor T01HM80 */
         pr_default.execute(78, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(78) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PREFAS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(78);
         /* Using cursor T01HM81 */
         pr_default.execute(79, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(79) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISREO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(79);
         /* Using cursor T01HM82 */
         pr_default.execute(80, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(80) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISBAR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(80);
         /* Using cursor T01HM83 */
         pr_default.execute(81, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(81) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CFORMU", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(81);
         /* Using cursor T01HM84 */
         pr_default.execute(82, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(82) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CLIPAG", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(82);
         /* Using cursor T01HM85 */
         pr_default.execute(83, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(83) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CLIENV", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(83);
         /* Using cursor T01HM86 */
         pr_default.execute(84, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(84) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ARTICU", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(84);
         /* Using cursor T01HM87 */
         pr_default.execute(85, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(85) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBREC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(85);
         /* Using cursor T01HM88 */
         pr_default.execute(86, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(86) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(86);
         /* Using cursor T01HM89 */
         pr_default.execute(87, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(87) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALCOM", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(87);
      }
   }

   public void processNestedLevel1HM1534( )
   {
      nGXsfl_58_idx = 0 ;
      while ( nGXsfl_58_idx < nRC_GXsfl_58 )
      {
         readRow1HM1534( ) ;
         if ( ( nRcdExists_1534 != 0 ) || ( nIsMod_1534 != 0 ) )
         {
            standaloneNotModal1HM1534( ) ;
            getKey1HM1534( ) ;
            if ( ( nRcdExists_1534 == 0 ) && ( nRcdDeleted_1534 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1HM1534( ) ;
            }
            else
            {
               if ( RcdFound1534 != 0 )
               {
                  if ( ( nRcdDeleted_1534 != 0 ) && ( nRcdExists_1534 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1HM1534( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1534 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1HM1534( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1534 == 0 )
                  {
                     GXCCtl = "TB1_COD_" + sGXsfl_58_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtTb1_Cod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtTb1_Cod_Internalname, GXutil.ltrim( localUtil.ntoc( A9713Tb1_Cod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtTb1_Dsc_Internalname, GXutil.rtrim( A9715Tb1_Dsc)) ;
         httpContext.changePostValue( "ZT_"+"Z9713Tb1_Cod_"+sGXsfl_58_idx, GXutil.ltrim( localUtil.ntoc( Z9713Tb1_Cod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRC_GXsfl_81_"+sGXsfl_58_idx, GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_81, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1534_"+sGXsfl_58_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1534, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1534_"+sGXsfl_58_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1534, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1534_"+sGXsfl_58_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1534, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1534 != 0 )
         {
            httpContext.changePostValue( "TB1_COD_"+sGXsfl_58_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTb1_Cod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TB1_DSC_"+sGXsfl_58_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTb1_Dsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1HM1534( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1534 = (short)(0) ;
      nIsMod_1534 = (short)(0) ;
      nRcdDeleted_1534 = (short)(0) ;
   }

   public void processLevel1HM21( )
   {
      /* Save parent mode. */
      sMode21 = Gx_mode ;
      processNestedLevel1HM1534( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode21 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1HM21( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(14);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1HM21( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tcccc");
         if ( AnyError == 0 )
         {
            confirmValues1HM0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tcccc");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1HM21( )
   {
      /* Using cursor T01HM90 */
      pr_default.execute(88);
      RcdFound21 = (short)(0) ;
      if ( (pr_default.getStatus(88) != 101) )
      {
         RcdFound21 = (short)(1) ;
         A396EmprCod = T01HM90_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = T01HM90_A252CliCod[0] ;
         n252CliCod = T01HM90_n252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1HM21( )
   {
      /* Scan next routine */
      pr_default.readNext(88);
      RcdFound21 = (short)(0) ;
      if ( (pr_default.getStatus(88) != 101) )
      {
         RcdFound21 = (short)(1) ;
         A396EmprCod = T01HM90_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = T01HM90_A252CliCod[0] ;
         n252CliCod = T01HM90_n252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      }
   }

   public void scanEnd1HM21( )
   {
      pr_default.close(88);
   }

   public void afterConfirm1HM21( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1HM21( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1HM21( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1HM21( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1HM21( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1HM21( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1HM21( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Enabled), 5, 0), true);
   }

   public void zm1HM1534( int GX_JID )
   {
      if ( ( GX_JID == 6 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
         }
         else
         {
         }
      }
      if ( GX_JID == -6 )
      {
         Z252CliCod = A252CliCod ;
         Z396EmprCod = A396EmprCod ;
         Z9713Tb1_Cod = A9713Tb1_Cod ;
         Z9715Tb1_Dsc = A9715Tb1_Dsc ;
      }
   }

   public void standaloneNotModal1HM1534( )
   {
   }

   public void standaloneModal1HM1534( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtTb1_Cod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTb1_Cod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTb1_Cod_Enabled), 5, 0), !bGXsfl_58_Refreshing);
      }
      else
      {
         edtTb1_Cod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTb1_Cod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTb1_Cod_Enabled), 5, 0), !bGXsfl_58_Refreshing);
      }
   }

   public void load1HM1534( )
   {
      /* Using cursor T01HM91 */
      pr_default.execute(89, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Short.valueOf(A9713Tb1_Cod)});
      if ( (pr_default.getStatus(89) != 101) )
      {
         RcdFound1534 = (short)(1) ;
         A9715Tb1_Dsc = T01HM91_A9715Tb1_Dsc[0] ;
         n9715Tb1_Dsc = T01HM91_n9715Tb1_Dsc[0] ;
         zm1HM1534( -6) ;
      }
      pr_default.close(89);
      onLoadActions1HM1534( ) ;
   }

   public void onLoadActions1HM1534( )
   {
   }

   public void checkExtendedTable1HM1534( )
   {
      nIsDirty_1534 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1HM1534( ) ;
      /* Using cursor T01HM15 */
      pr_default.execute(13, new Object[] {A396EmprCod, Short.valueOf(A9713Tb1_Cod)});
      if ( (pr_default.getStatus(13) == 101) )
      {
         GXCCtl = "TB1_COD_" + sGXsfl_58_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TABLE1", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtTb1_Cod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A9715Tb1_Dsc = T01HM15_A9715Tb1_Dsc[0] ;
      n9715Tb1_Dsc = T01HM15_n9715Tb1_Dsc[0] ;
      pr_default.close(13);
   }

   public void closeExtendedTableCursors1HM1534( )
   {
      pr_default.close(13);
   }

   public void enableDisable1HM1534( )
   {
   }

   public void gxload_7( String A396EmprCod ,
                         short A9713Tb1_Cod )
   {
      /* Using cursor T01HM92 */
      pr_default.execute(90, new Object[] {A396EmprCod, Short.valueOf(A9713Tb1_Cod)});
      if ( (pr_default.getStatus(90) == 101) )
      {
         GXCCtl = "TB1_COD_" + sGXsfl_58_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TABLE1", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtTb1_Cod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A9715Tb1_Dsc = T01HM92_A9715Tb1_Dsc[0] ;
      n9715Tb1_Dsc = T01HM92_n9715Tb1_Dsc[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A9715Tb1_Dsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(90) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(90);
   }

   public void getKey1HM1534( )
   {
      /* Using cursor T01HM93 */
      pr_default.execute(91, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Short.valueOf(A9713Tb1_Cod)});
      if ( (pr_default.getStatus(91) != 101) )
      {
         RcdFound1534 = (short)(1) ;
      }
      else
      {
         RcdFound1534 = (short)(0) ;
      }
      pr_default.close(91);
   }

   public void getByPrimaryKey1HM1534( )
   {
      /* Using cursor T01HM14 */
      pr_default.execute(12, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Short.valueOf(A9713Tb1_Cod)});
      if ( (pr_default.getStatus(12) != 101) )
      {
         zm1HM1534( 6) ;
         RcdFound1534 = (short)(1) ;
         initializeNonKey1HM1534( ) ;
         A9713Tb1_Cod = T01HM14_A9713Tb1_Cod[0] ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z9713Tb1_Cod = A9713Tb1_Cod ;
         sMode1534 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1HM1534( ) ;
         load1HM1534( ) ;
         Gx_mode = sMode1534 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1534 = (short)(0) ;
         initializeNonKey1HM1534( ) ;
         sMode1534 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1HM1534( ) ;
         Gx_mode = sMode1534 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1HM1534( ) ;
      }
      pr_default.close(12);
   }

   public void checkOptimisticConcurrency1HM1534( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01HM13 */
         pr_default.execute(11, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Short.valueOf(A9713Tb1_Cod)});
         if ( (pr_default.getStatus(11) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPTABLA4"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(11) == 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPTABLA4"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1HM1534( )
   {
      beforeValidate1HM1534( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1HM1534( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1HM1534( 0) ;
         checkOptimisticConcurrency1HM1534( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1HM1534( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1HM1534( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01HM94 */
                  pr_default.execute(92, new Object[] {Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A396EmprCod, Short.valueOf(A9713Tb1_Cod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTABLA4");
                  if ( (pr_default.getStatus(92) == 1) )
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
                        processLevel1HM1534( ) ;
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
            load1HM1534( ) ;
         }
         endLevel1HM1534( ) ;
      }
      closeExtendedTableCursors1HM1534( ) ;
   }

   public void update1HM1534( )
   {
      beforeValidate1HM1534( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1HM1534( ) ;
      }
      if ( ( nIsMod_1534 != 0 ) || ( nIsDirty_1534 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1HM1534( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1HM1534( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1HM1534( ) ;
                  if ( AnyError == 0 )
                  {
                     /* No attributes to update on table TXPTABLA4 */
                     deferredUpdate1HM1534( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           processLevel1HM1534( ) ;
                           if ( AnyError == 0 )
                           {
                              getByPrimaryKey1HM1534( ) ;
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
            endLevel1HM1534( ) ;
         }
      }
      closeExtendedTableCursors1HM1534( ) ;
   }

   public void deferredUpdate1HM1534( )
   {
   }

   public void delete1HM1534( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1HM1534( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1HM1534( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1HM1534( ) ;
         afterConfirm1HM1534( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1HM1534( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01HM95 */
               pr_default.execute(93, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Short.valueOf(A9713Tb1_Cod)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTABLA4");
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
      sMode1534 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1HM1534( ) ;
      Gx_mode = sMode1534 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1HM1534( )
   {
      standaloneModal1HM1534( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01HM96 */
         pr_default.execute(94, new Object[] {A396EmprCod, Short.valueOf(A9713Tb1_Cod)});
         A9715Tb1_Dsc = T01HM96_A9715Tb1_Dsc[0] ;
         n9715Tb1_Dsc = T01HM96_n9715Tb1_Dsc[0] ;
         pr_default.close(94);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T01HM97 */
         pr_default.execute(95, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Short.valueOf(A9713Tb1_Cod)});
         if ( (pr_default.getStatus(95) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Tabla Cliente y Quality Requerimets", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(95);
      }
   }

   public void processNestedLevel1HM1642( )
   {
      nGXsfl_81_idx = 0 ;
      while ( nGXsfl_81_idx < nRC_GXsfl_81 )
      {
         readRow1HM1642( ) ;
         if ( ( nRcdExists_1642 != 0 ) || ( nIsMod_1642 != 0 ) )
         {
            standaloneNotModal1HM1642( ) ;
            getKey1HM1642( ) ;
            if ( ( nRcdExists_1642 == 0 ) && ( nRcdDeleted_1642 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1HM1642( ) ;
            }
            else
            {
               if ( RcdFound1642 != 0 )
               {
                  if ( ( nRcdDeleted_1642 != 0 ) && ( nRcdExists_1642 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1HM1642( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1642 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1HM1642( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1642 == 0 )
                  {
                     GXCCtl = "TB1_COD_" + sGXsfl_58_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtTb1_Cod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtCCArtCod_Internalname, GXutil.rtrim( A11736CCArtCod)) ;
         httpContext.changePostValue( edtCCArtdsc_Internalname, GXutil.rtrim( A11745CCArtdsc)) ;
         httpContext.changePostValue( "ZT_"+"Z11736CCArtCod_"+sGXsfl_81_idx, GXutil.rtrim( Z11736CCArtCod)) ;
         httpContext.changePostValue( "nRC_GXsfl_104_"+sGXsfl_81_idx, GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_104, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1642_"+sGXsfl_81_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1642, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1642_"+sGXsfl_81_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1642, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1642_"+sGXsfl_81_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1642, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1642 != 0 )
         {
            httpContext.changePostValue( "CCARTCOD_"+sGXsfl_81_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCArtCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CCARTDSC_"+sGXsfl_81_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCArtdsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1HM1642( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1642 = (short)(0) ;
      nIsMod_1642 = (short)(0) ;
      nRcdDeleted_1642 = (short)(0) ;
   }

   public void processLevel1HM1534( )
   {
      /* Save parent mode. */
      sMode1534 = Gx_mode ;
      processNestedLevel1HM1642( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode1534 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1HM1534( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(11);
      }
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1HM1534( )
   {
      /* Scan By routine */
      /* Using cursor T01HM98 */
      pr_default.execute(96, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      RcdFound1534 = (short)(0) ;
      if ( (pr_default.getStatus(96) != 101) )
      {
         RcdFound1534 = (short)(1) ;
         A9713Tb1_Cod = T01HM98_A9713Tb1_Cod[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1HM1534( )
   {
      /* Scan next routine */
      pr_default.readNext(96);
      RcdFound1534 = (short)(0) ;
      if ( (pr_default.getStatus(96) != 101) )
      {
         RcdFound1534 = (short)(1) ;
         A9713Tb1_Cod = T01HM98_A9713Tb1_Cod[0] ;
      }
   }

   public void scanEnd1HM1534( )
   {
      pr_default.close(96);
   }

   public void afterConfirm1HM1534( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1HM1534( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1HM1534( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1HM1534( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1HM1534( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1HM1534( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1HM1534( )
   {
      edtTb1_Cod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTb1_Cod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTb1_Cod_Enabled), 5, 0), !bGXsfl_58_Refreshing);
      edtTb1_Dsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTb1_Dsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTb1_Dsc_Enabled), 5, 0), !bGXsfl_58_Refreshing);
   }

   public void zm1HM1642( int GX_JID )
   {
      if ( ( GX_JID == 8 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
         }
         else
         {
         }
      }
      if ( GX_JID == -8 )
      {
         Z252CliCod = A252CliCod ;
         Z9713Tb1_Cod = A9713Tb1_Cod ;
         Z11736CCArtCod = A11736CCArtCod ;
         Z396EmprCod = A396EmprCod ;
      }
   }

   public void standaloneNotModal1HM1642( )
   {
   }

   public void standaloneModal1HM1642( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtCCArtCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCCArtCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCArtCod_Enabled), 5, 0), !bGXsfl_81_Refreshing);
      }
      else
      {
         edtCCArtCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCCArtCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCArtCod_Enabled), 5, 0), !bGXsfl_81_Refreshing);
      }
   }

   public void load1HM1642( )
   {
      /* Using cursor T01HM99 */
      pr_default.execute(97, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Short.valueOf(A9713Tb1_Cod), A11736CCArtCod});
      if ( (pr_default.getStatus(97) != 101) )
      {
         RcdFound1642 = (short)(1) ;
         zm1HM1642( -8) ;
      }
      pr_default.close(97);
      onLoadActions1HM1642( ) ;
   }

   public void onLoadActions1HM1642( )
   {
      GXt_char1 = A11745CCArtdsc ;
      GXv_char2[0] = GXt_char1 ;
      new app.ppartdsc(remoteHandle, context).execute( A396EmprCod, A252CliCod, A11736CCArtCod, GXv_char2) ;
      tcccc_impl.this.GXt_char1 = GXv_char2[0] ;
      A11745CCArtdsc = GXt_char1 ;
   }

   public void checkExtendedTable1HM1642( )
   {
      nIsDirty_1642 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1HM1642( ) ;
      nIsDirty_1642 = (short)(1) ;
      GXt_char1 = A11745CCArtdsc ;
      GXv_char2[0] = GXt_char1 ;
      new app.ppartdsc(remoteHandle, context).execute( A396EmprCod, A252CliCod, A11736CCArtCod, GXv_char2) ;
      tcccc_impl.this.GXt_char1 = GXv_char2[0] ;
      A11745CCArtdsc = GXt_char1 ;
   }

   public void closeExtendedTableCursors1HM1642( )
   {
   }

   public void enableDisable1HM1642( )
   {
   }

   public void getKey1HM1642( )
   {
      /* Using cursor T01HM100 */
      pr_default.execute(98, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Short.valueOf(A9713Tb1_Cod), A11736CCArtCod});
      if ( (pr_default.getStatus(98) != 101) )
      {
         RcdFound1642 = (short)(1) ;
      }
      else
      {
         RcdFound1642 = (short)(0) ;
      }
      pr_default.close(98);
   }

   public void getByPrimaryKey1HM1642( )
   {
      /* Using cursor T01HM12 */
      pr_default.execute(10, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Short.valueOf(A9713Tb1_Cod), A11736CCArtCod});
      if ( (pr_default.getStatus(10) != 101) )
      {
         zm1HM1642( 8) ;
         RcdFound1642 = (short)(1) ;
         initializeNonKey1HM1642( ) ;
         A11736CCArtCod = T01HM12_A11736CCArtCod[0] ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z9713Tb1_Cod = A9713Tb1_Cod ;
         Z11736CCArtCod = A11736CCArtCod ;
         sMode1642 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1HM1642( ) ;
         load1HM1642( ) ;
         Gx_mode = sMode1642 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1642 = (short)(0) ;
         initializeNonKey1HM1642( ) ;
         sMode1642 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1HM1642( ) ;
         Gx_mode = sMode1642 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1HM1642( ) ;
      }
      pr_default.close(10);
   }

   public void checkOptimisticConcurrency1HM1642( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01HM11 */
         pr_default.execute(9, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Short.valueOf(A9713Tb1_Cod), A11736CCArtCod});
         if ( (pr_default.getStatus(9) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCCCnoE"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(9) == 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCCCnoE"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1HM1642( )
   {
      beforeValidate1HM1642( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1HM1642( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1HM1642( 0) ;
         checkOptimisticConcurrency1HM1642( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1HM1642( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1HM1642( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01HM101 */
                  pr_default.execute(99, new Object[] {Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Short.valueOf(A9713Tb1_Cod), A11736CCArtCod, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCCnoE");
                  if ( (pr_default.getStatus(99) == 1) )
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
                        processLevel1HM1642( ) ;
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
            load1HM1642( ) ;
         }
         endLevel1HM1642( ) ;
      }
      closeExtendedTableCursors1HM1642( ) ;
   }

   public void update1HM1642( )
   {
      beforeValidate1HM1642( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1HM1642( ) ;
      }
      if ( ( nIsMod_1642 != 0 ) || ( nIsDirty_1642 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1HM1642( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1HM1642( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1HM1642( ) ;
                  if ( AnyError == 0 )
                  {
                     /* No attributes to update on table TXPCCCnoE */
                     deferredUpdate1HM1642( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           processLevel1HM1642( ) ;
                           if ( AnyError == 0 )
                           {
                              getByPrimaryKey1HM1642( ) ;
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
            endLevel1HM1642( ) ;
         }
      }
      closeExtendedTableCursors1HM1642( ) ;
   }

   public void deferredUpdate1HM1642( )
   {
   }

   public void delete1HM1642( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1HM1642( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1HM1642( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1HM1642( ) ;
         afterConfirm1HM1642( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1HM1642( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01HM102 */
               pr_default.execute(100, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Short.valueOf(A9713Tb1_Cod), A11736CCArtCod});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCCnoE");
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
      sMode1642 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1HM1642( ) ;
      Gx_mode = sMode1642 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1HM1642( )
   {
      standaloneModal1HM1642( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         GXt_char1 = A11745CCArtdsc ;
         GXv_char2[0] = GXt_char1 ;
         new app.ppartdsc(remoteHandle, context).execute( A396EmprCod, A252CliCod, A11736CCArtCod, GXv_char2) ;
         tcccc_impl.this.GXt_char1 = GXv_char2[0] ;
         A11745CCArtdsc = GXt_char1 ;
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T01HM103 */
         pr_default.execute(101, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Short.valueOf(A9713Tb1_Cod), A11736CCArtCod});
         if ( (pr_default.getStatus(101) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Tipo Articulo", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(101);
      }
   }

   public void processNestedLevel1HM1648( )
   {
      nGXsfl_104_idx = 0 ;
      while ( nGXsfl_104_idx < nRC_GXsfl_104 )
      {
         readRow1HM1648( ) ;
         if ( ( nRcdExists_1648 != 0 ) || ( nIsMod_1648 != 0 ) )
         {
            standaloneNotModal1HM1648( ) ;
            getKey1HM1648( ) ;
            if ( ( nRcdExists_1648 == 0 ) && ( nRcdDeleted_1648 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1HM1648( ) ;
            }
            else
            {
               if ( RcdFound1648 != 0 )
               {
                  if ( ( nRcdDeleted_1648 != 0 ) && ( nRcdExists_1648 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1HM1648( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1648 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1HM1648( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1648 == 0 )
                  {
                     GXCCtl = "TB1_COD_" + sGXsfl_58_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtTb1_Cod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtTipArtiId_Internalname, GXutil.ltrim( localUtil.ntoc( A11748TipArtiId, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtTipArtiDs_Internalname, GXutil.rtrim( A11746TipArtiDs)) ;
         httpContext.changePostValue( "ZT_"+"Z11748TipArtiId_"+sGXsfl_104_idx, GXutil.ltrim( localUtil.ntoc( Z11748TipArtiId, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRC_GXsfl_127_"+sGXsfl_104_idx, GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_127, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1648_"+sGXsfl_104_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1648, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1648_"+sGXsfl_104_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1648, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1648_"+sGXsfl_104_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1648, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1648 != 0 )
         {
            httpContext.changePostValue( "TIPARTIID_"+sGXsfl_104_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTipArtiId_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TIPARTIDS_"+sGXsfl_104_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTipArtiDs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1HM1648( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1648 = (short)(0) ;
      nIsMod_1648 = (short)(0) ;
      nRcdDeleted_1648 = (short)(0) ;
   }

   public void processLevel1HM1642( )
   {
      /* Save parent mode. */
      sMode1642 = Gx_mode ;
      processNestedLevel1HM1648( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode1642 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1HM1642( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(9);
      }
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1HM1642( )
   {
      /* Scan By routine */
      /* Using cursor T01HM104 */
      pr_default.execute(102, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Short.valueOf(A9713Tb1_Cod)});
      RcdFound1642 = (short)(0) ;
      if ( (pr_default.getStatus(102) != 101) )
      {
         RcdFound1642 = (short)(1) ;
         A11736CCArtCod = T01HM104_A11736CCArtCod[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1HM1642( )
   {
      /* Scan next routine */
      pr_default.readNext(102);
      RcdFound1642 = (short)(0) ;
      if ( (pr_default.getStatus(102) != 101) )
      {
         RcdFound1642 = (short)(1) ;
         A11736CCArtCod = T01HM104_A11736CCArtCod[0] ;
      }
   }

   public void scanEnd1HM1642( )
   {
      pr_default.close(102);
   }

   public void afterConfirm1HM1642( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1HM1642( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1HM1642( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1HM1642( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1HM1642( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1HM1642( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1HM1642( )
   {
      edtCCArtCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCArtCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCArtCod_Enabled), 5, 0), !bGXsfl_81_Refreshing);
      edtCCArtdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCArtdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCArtdsc_Enabled), 5, 0), !bGXsfl_81_Refreshing);
   }

   public void zm1HM1648( int GX_JID )
   {
      if ( ( GX_JID == 9 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
         }
         else
         {
         }
      }
      if ( GX_JID == -9 )
      {
         Z252CliCod = A252CliCod ;
         Z9713Tb1_Cod = A9713Tb1_Cod ;
         Z11736CCArtCod = A11736CCArtCod ;
         Z11748TipArtiId = A11748TipArtiId ;
         Z396EmprCod = A396EmprCod ;
      }
   }

   public void standaloneNotModal1HM1648( )
   {
   }

   public void standaloneModal1HM1648( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtTipArtiId_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTipArtiId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipArtiId_Enabled), 5, 0), !bGXsfl_104_Refreshing);
      }
      else
      {
         edtTipArtiId_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTipArtiId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipArtiId_Enabled), 5, 0), !bGXsfl_104_Refreshing);
      }
   }

   public void load1HM1648( )
   {
      /* Using cursor T01HM105 */
      pr_default.execute(103, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Short.valueOf(A9713Tb1_Cod), A11736CCArtCod, Short.valueOf(A11748TipArtiId)});
      if ( (pr_default.getStatus(103) != 101) )
      {
         RcdFound1648 = (short)(1) ;
         zm1HM1648( -9) ;
      }
      pr_default.close(103);
      onLoadActions1HM1648( ) ;
   }

   public void onLoadActions1HM1648( )
   {
      GXt_char1 = A11746TipArtiDs ;
      GXv_char2[0] = GXt_char1 ;
      new app.ptipartdsc(remoteHandle, context).execute( A396EmprCod, A11748TipArtiId, GXv_char2) ;
      tcccc_impl.this.GXt_char1 = GXv_char2[0] ;
      A11746TipArtiDs = GXt_char1 ;
   }

   public void checkExtendedTable1HM1648( )
   {
      nIsDirty_1648 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1HM1648( ) ;
      nIsDirty_1648 = (short)(1) ;
      GXt_char1 = A11746TipArtiDs ;
      GXv_char2[0] = GXt_char1 ;
      new app.ptipartdsc(remoteHandle, context).execute( A396EmprCod, A11748TipArtiId, GXv_char2) ;
      tcccc_impl.this.GXt_char1 = GXv_char2[0] ;
      A11746TipArtiDs = GXt_char1 ;
   }

   public void closeExtendedTableCursors1HM1648( )
   {
   }

   public void enableDisable1HM1648( )
   {
   }

   public void getKey1HM1648( )
   {
      /* Using cursor T01HM106 */
      pr_default.execute(104, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Short.valueOf(A9713Tb1_Cod), A11736CCArtCod, Short.valueOf(A11748TipArtiId)});
      if ( (pr_default.getStatus(104) != 101) )
      {
         RcdFound1648 = (short)(1) ;
      }
      else
      {
         RcdFound1648 = (short)(0) ;
      }
      pr_default.close(104);
   }

   public void getByPrimaryKey1HM1648( )
   {
      /* Using cursor T01HM10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Short.valueOf(A9713Tb1_Cod), A11736CCArtCod, Short.valueOf(A11748TipArtiId)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         zm1HM1648( 9) ;
         RcdFound1648 = (short)(1) ;
         initializeNonKey1HM1648( ) ;
         A11748TipArtiId = T01HM10_A11748TipArtiId[0] ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z9713Tb1_Cod = A9713Tb1_Cod ;
         Z11736CCArtCod = A11736CCArtCod ;
         Z11748TipArtiId = A11748TipArtiId ;
         sMode1648 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1HM1648( ) ;
         load1HM1648( ) ;
         Gx_mode = sMode1648 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1648 = (short)(0) ;
         initializeNonKey1HM1648( ) ;
         sMode1648 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1HM1648( ) ;
         Gx_mode = sMode1648 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1HM1648( ) ;
      }
      pr_default.close(8);
   }

   public void checkOptimisticConcurrency1HM1648( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01HM9 */
         pr_default.execute(7, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Short.valueOf(A9713Tb1_Cod), A11736CCArtCod, Short.valueOf(A11748TipArtiId)});
         if ( (pr_default.getStatus(7) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCCCno1"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(7) == 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCCCno1"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1HM1648( )
   {
      beforeValidate1HM1648( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1HM1648( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1HM1648( 0) ;
         checkOptimisticConcurrency1HM1648( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1HM1648( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1HM1648( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01HM107 */
                  pr_default.execute(105, new Object[] {Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Short.valueOf(A9713Tb1_Cod), A11736CCArtCod, Short.valueOf(A11748TipArtiId), A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCCno1");
                  if ( (pr_default.getStatus(105) == 1) )
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
                        processLevel1HM1648( ) ;
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
            load1HM1648( ) ;
         }
         endLevel1HM1648( ) ;
      }
      closeExtendedTableCursors1HM1648( ) ;
   }

   public void update1HM1648( )
   {
      beforeValidate1HM1648( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1HM1648( ) ;
      }
      if ( ( nIsMod_1648 != 0 ) || ( nIsDirty_1648 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1HM1648( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1HM1648( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1HM1648( ) ;
                  if ( AnyError == 0 )
                  {
                     /* No attributes to update on table TXPCCCno1 */
                     deferredUpdate1HM1648( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           processLevel1HM1648( ) ;
                           if ( AnyError == 0 )
                           {
                              getByPrimaryKey1HM1648( ) ;
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
            endLevel1HM1648( ) ;
         }
      }
      closeExtendedTableCursors1HM1648( ) ;
   }

   public void deferredUpdate1HM1648( )
   {
   }

   public void delete1HM1648( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1HM1648( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1HM1648( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1HM1648( ) ;
         afterConfirm1HM1648( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1HM1648( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01HM108 */
               pr_default.execute(106, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Short.valueOf(A9713Tb1_Cod), A11736CCArtCod, Short.valueOf(A11748TipArtiId)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCCno1");
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
      sMode1648 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1HM1648( ) ;
      Gx_mode = sMode1648 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1HM1648( )
   {
      standaloneModal1HM1648( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         GXt_char1 = A11746TipArtiDs ;
         GXv_char2[0] = GXt_char1 ;
         new app.ptipartdsc(remoteHandle, context).execute( A396EmprCod, A11748TipArtiId, GXv_char2) ;
         tcccc_impl.this.GXt_char1 = GXv_char2[0] ;
         A11746TipArtiDs = GXt_char1 ;
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T01HM109 */
         pr_default.execute(107, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Short.valueOf(A9713Tb1_Cod), A11736CCArtCod, Short.valueOf(A11748TipArtiId)});
         if ( (pr_default.getStatus(107) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Colores", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(107);
      }
   }

   public void processNestedLevel1HM1649( )
   {
      nGXsfl_127_idx = 0 ;
      while ( nGXsfl_127_idx < nRC_GXsfl_127 )
      {
         readRow1HM1649( ) ;
         if ( ( nRcdExists_1649 != 0 ) || ( nIsMod_1649 != 0 ) )
         {
            standaloneNotModal1HM1649( ) ;
            getKey1HM1649( ) ;
            if ( ( nRcdExists_1649 == 0 ) && ( nRcdDeleted_1649 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1HM1649( ) ;
            }
            else
            {
               if ( RcdFound1649 != 0 )
               {
                  if ( ( nRcdDeleted_1649 != 0 ) && ( nRcdExists_1649 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1HM1649( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1649 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1HM1649( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1649 == 0 )
                  {
                     GXCCtl = "TB1_COD_" + sGXsfl_58_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtTb1_Cod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtCCColNom_Internalname, GXutil.rtrim( A11737CCColNom)) ;
         httpContext.changePostValue( edtCCColNum_Internalname, GXutil.ltrim( localUtil.ntoc( A11738CCColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCCCTc_Internalname, GXutil.ltrim( localUtil.ntoc( A11749CCCTc, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11737CCColNom_"+sGXsfl_127_idx, GXutil.rtrim( Z11737CCColNom)) ;
         httpContext.changePostValue( "ZT_"+"Z11738CCColNum_"+sGXsfl_127_idx, GXutil.ltrim( localUtil.ntoc( Z11738CCColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11749CCCTc_"+sGXsfl_127_idx, GXutil.ltrim( localUtil.ntoc( Z11749CCCTc, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRC_GXsfl_155_"+sGXsfl_127_idx, GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_155, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1649_"+sGXsfl_127_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1649, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1649_"+sGXsfl_127_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1649, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1649_"+sGXsfl_127_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1649, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1649 != 0 )
         {
            httpContext.changePostValue( "CCCOLNOM_"+sGXsfl_127_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCColNom_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CCCOLNUM_"+sGXsfl_127_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCColNum_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CCCTC_"+sGXsfl_127_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCCTc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1HM1649( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1649 = (short)(0) ;
      nIsMod_1649 = (short)(0) ;
      nRcdDeleted_1649 = (short)(0) ;
   }

   public void processLevel1HM1648( )
   {
      /* Save parent mode. */
      sMode1648 = Gx_mode ;
      processNestedLevel1HM1649( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode1648 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1HM1648( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(7);
      }
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1HM1648( )
   {
      /* Scan By routine */
      /* Using cursor T01HM110 */
      pr_default.execute(108, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Short.valueOf(A9713Tb1_Cod), A11736CCArtCod});
      RcdFound1648 = (short)(0) ;
      if ( (pr_default.getStatus(108) != 101) )
      {
         RcdFound1648 = (short)(1) ;
         A11748TipArtiId = T01HM110_A11748TipArtiId[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1HM1648( )
   {
      /* Scan next routine */
      pr_default.readNext(108);
      RcdFound1648 = (short)(0) ;
      if ( (pr_default.getStatus(108) != 101) )
      {
         RcdFound1648 = (short)(1) ;
         A11748TipArtiId = T01HM110_A11748TipArtiId[0] ;
      }
   }

   public void scanEnd1HM1648( )
   {
      pr_default.close(108);
   }

   public void afterConfirm1HM1648( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1HM1648( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1HM1648( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1HM1648( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1HM1648( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1HM1648( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1HM1648( )
   {
      edtTipArtiId_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipArtiId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipArtiId_Enabled), 5, 0), !bGXsfl_104_Refreshing);
      edtTipArtiDs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipArtiDs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipArtiDs_Enabled), 5, 0), !bGXsfl_104_Refreshing);
   }

   public void zm1HM1649( int GX_JID )
   {
      if ( ( GX_JID == 10 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
         }
         else
         {
         }
      }
      if ( GX_JID == -10 )
      {
         Z252CliCod = A252CliCod ;
         Z9713Tb1_Cod = A9713Tb1_Cod ;
         Z11736CCArtCod = A11736CCArtCod ;
         Z11748TipArtiId = A11748TipArtiId ;
         Z11737CCColNom = A11737CCColNom ;
         Z11738CCColNum = A11738CCColNum ;
         Z11749CCCTc = A11749CCCTc ;
         Z396EmprCod = A396EmprCod ;
      }
   }

   public void standaloneNotModal1HM1649( )
   {
   }

   public void standaloneModal1HM1649( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtCCColNom_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCCColNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCColNom_Enabled), 5, 0), !bGXsfl_127_Refreshing);
      }
      else
      {
         edtCCColNom_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCCColNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCColNom_Enabled), 5, 0), !bGXsfl_127_Refreshing);
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtCCColNum_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCCColNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCColNum_Enabled), 5, 0), !bGXsfl_127_Refreshing);
      }
      else
      {
         edtCCColNum_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCCColNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCColNum_Enabled), 5, 0), !bGXsfl_127_Refreshing);
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtCCCTc_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCCCTc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCCTc_Enabled), 5, 0), !bGXsfl_127_Refreshing);
      }
      else
      {
         edtCCCTc_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCCCTc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCCTc_Enabled), 5, 0), !bGXsfl_127_Refreshing);
      }
   }

   public void load1HM1649( )
   {
      /* Using cursor T01HM111 */
      pr_default.execute(109, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Short.valueOf(A9713Tb1_Cod), A11736CCArtCod, Short.valueOf(A11748TipArtiId), A11737CCColNom, Integer.valueOf(A11738CCColNum), Byte.valueOf(A11749CCCTc)});
      if ( (pr_default.getStatus(109) != 101) )
      {
         RcdFound1649 = (short)(1) ;
         zm1HM1649( -10) ;
      }
      pr_default.close(109);
      onLoadActions1HM1649( ) ;
   }

   public void onLoadActions1HM1649( )
   {
   }

   public void checkExtendedTable1HM1649( )
   {
      nIsDirty_1649 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1HM1649( ) ;
   }

   public void closeExtendedTableCursors1HM1649( )
   {
   }

   public void enableDisable1HM1649( )
   {
   }

   public void getKey1HM1649( )
   {
      /* Using cursor T01HM112 */
      pr_default.execute(110, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Short.valueOf(A9713Tb1_Cod), A11736CCArtCod, Short.valueOf(A11748TipArtiId), A11737CCColNom, Integer.valueOf(A11738CCColNum), Byte.valueOf(A11749CCCTc)});
      if ( (pr_default.getStatus(110) != 101) )
      {
         RcdFound1649 = (short)(1) ;
      }
      else
      {
         RcdFound1649 = (short)(0) ;
      }
      pr_default.close(110);
   }

   public void getByPrimaryKey1HM1649( )
   {
      /* Using cursor T01HM8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Short.valueOf(A9713Tb1_Cod), A11736CCArtCod, Short.valueOf(A11748TipArtiId), A11737CCColNom, Integer.valueOf(A11738CCColNum), Byte.valueOf(A11749CCCTc)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         zm1HM1649( 10) ;
         RcdFound1649 = (short)(1) ;
         initializeNonKey1HM1649( ) ;
         A11737CCColNom = T01HM8_A11737CCColNom[0] ;
         A11738CCColNum = T01HM8_A11738CCColNum[0] ;
         A11749CCCTc = T01HM8_A11749CCCTc[0] ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z9713Tb1_Cod = A9713Tb1_Cod ;
         Z11736CCArtCod = A11736CCArtCod ;
         Z11748TipArtiId = A11748TipArtiId ;
         Z11737CCColNom = A11737CCColNom ;
         Z11738CCColNum = A11738CCColNum ;
         Z11749CCCTc = A11749CCCTc ;
         sMode1649 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1HM1649( ) ;
         load1HM1649( ) ;
         Gx_mode = sMode1649 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1649 = (short)(0) ;
         initializeNonKey1HM1649( ) ;
         sMode1649 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1HM1649( ) ;
         Gx_mode = sMode1649 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1HM1649( ) ;
      }
      pr_default.close(6);
   }

   public void checkOptimisticConcurrency1HM1649( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01HM7 */
         pr_default.execute(5, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Short.valueOf(A9713Tb1_Cod), A11736CCArtCod, Short.valueOf(A11748TipArtiId), A11737CCColNom, Integer.valueOf(A11738CCColNum), Byte.valueOf(A11749CCCTc)});
         if ( (pr_default.getStatus(5) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCCCno3"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(5) == 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCCCno3"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1HM1649( )
   {
      beforeValidate1HM1649( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1HM1649( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1HM1649( 0) ;
         checkOptimisticConcurrency1HM1649( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1HM1649( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1HM1649( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01HM113 */
                  pr_default.execute(111, new Object[] {Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Short.valueOf(A9713Tb1_Cod), A11736CCArtCod, Short.valueOf(A11748TipArtiId), A11737CCColNom, Integer.valueOf(A11738CCColNum), Byte.valueOf(A11749CCCTc), A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCCno3");
                  if ( (pr_default.getStatus(111) == 1) )
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
                        processLevel1HM1649( ) ;
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
            load1HM1649( ) ;
         }
         endLevel1HM1649( ) ;
      }
      closeExtendedTableCursors1HM1649( ) ;
   }

   public void update1HM1649( )
   {
      beforeValidate1HM1649( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1HM1649( ) ;
      }
      if ( ( nIsMod_1649 != 0 ) || ( nIsDirty_1649 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1HM1649( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1HM1649( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1HM1649( ) ;
                  if ( AnyError == 0 )
                  {
                     /* No attributes to update on table TXPCCCno3 */
                     deferredUpdate1HM1649( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           processLevel1HM1649( ) ;
                           if ( AnyError == 0 )
                           {
                              getByPrimaryKey1HM1649( ) ;
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
            endLevel1HM1649( ) ;
         }
      }
      closeExtendedTableCursors1HM1649( ) ;
   }

   public void deferredUpdate1HM1649( )
   {
   }

   public void delete1HM1649( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1HM1649( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1HM1649( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1HM1649( ) ;
         afterConfirm1HM1649( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1HM1649( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01HM114 */
               pr_default.execute(112, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Short.valueOf(A9713Tb1_Cod), A11736CCArtCod, Short.valueOf(A11748TipArtiId), A11737CCColNom, Integer.valueOf(A11738CCColNum), Byte.valueOf(A11749CCCTc)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCCno3");
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
      sMode1649 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1HM1649( ) ;
      Gx_mode = sMode1649 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1HM1649( )
   {
      standaloneModal1HM1649( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T01HM115 */
         pr_default.execute(113, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Short.valueOf(A9713Tb1_Cod), A11736CCArtCod, Short.valueOf(A11748TipArtiId), A11737CCColNom, Integer.valueOf(A11738CCColNum), Byte.valueOf(A11749CCCTc)});
         if ( (pr_default.getStatus(113) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Intensidades", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(113);
      }
   }

   public void processNestedLevel1HM1650( )
   {
      nGXsfl_155_idx = 0 ;
      while ( nGXsfl_155_idx < nRC_GXsfl_155 )
      {
         readRow1HM1650( ) ;
         if ( ( nRcdExists_1650 != 0 ) || ( nIsMod_1650 != 0 ) )
         {
            standaloneNotModal1HM1650( ) ;
            getKey1HM1650( ) ;
            if ( ( nRcdExists_1650 == 0 ) && ( nRcdDeleted_1650 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1HM1650( ) ;
            }
            else
            {
               if ( RcdFound1650 != 0 )
               {
                  if ( ( nRcdDeleted_1650 != 0 ) && ( nRcdExists_1650 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1HM1650( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1650 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1HM1650( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1650 == 0 )
                  {
                     GXCCtl = "TB1_COD_" + sGXsfl_58_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtTb1_Cod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtIntId_Internalname, GXutil.ltrim( localUtil.ntoc( A11750IntId, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtIntDs_Internalname, GXutil.rtrim( A11747IntDs)) ;
         httpContext.changePostValue( "ZT_"+"Z11750IntId_"+sGXsfl_155_idx, GXutil.ltrim( localUtil.ntoc( Z11750IntId, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRC_GXsfl_178_"+sGXsfl_155_idx, GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_178, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1650_"+sGXsfl_155_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1650, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1650_"+sGXsfl_155_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1650, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1650_"+sGXsfl_155_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1650, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1650 != 0 )
         {
            httpContext.changePostValue( "INTID_"+sGXsfl_155_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtIntId_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "INTDS_"+sGXsfl_155_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtIntDs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1HM1650( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1650 = (short)(0) ;
      nIsMod_1650 = (short)(0) ;
      nRcdDeleted_1650 = (short)(0) ;
   }

   public void processLevel1HM1649( )
   {
      /* Save parent mode. */
      sMode1649 = Gx_mode ;
      processNestedLevel1HM1650( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode1649 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1HM1649( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(5);
      }
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1HM1649( )
   {
      /* Scan By routine */
      /* Using cursor T01HM116 */
      pr_default.execute(114, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Short.valueOf(A9713Tb1_Cod), A11736CCArtCod, Short.valueOf(A11748TipArtiId)});
      RcdFound1649 = (short)(0) ;
      if ( (pr_default.getStatus(114) != 101) )
      {
         RcdFound1649 = (short)(1) ;
         A11737CCColNom = T01HM116_A11737CCColNom[0] ;
         A11738CCColNum = T01HM116_A11738CCColNum[0] ;
         A11749CCCTc = T01HM116_A11749CCCTc[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1HM1649( )
   {
      /* Scan next routine */
      pr_default.readNext(114);
      RcdFound1649 = (short)(0) ;
      if ( (pr_default.getStatus(114) != 101) )
      {
         RcdFound1649 = (short)(1) ;
         A11737CCColNom = T01HM116_A11737CCColNom[0] ;
         A11738CCColNum = T01HM116_A11738CCColNum[0] ;
         A11749CCCTc = T01HM116_A11749CCCTc[0] ;
      }
   }

   public void scanEnd1HM1649( )
   {
      pr_default.close(114);
   }

   public void afterConfirm1HM1649( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1HM1649( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1HM1649( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1HM1649( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1HM1649( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1HM1649( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1HM1649( )
   {
      edtCCColNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCColNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCColNom_Enabled), 5, 0), !bGXsfl_127_Refreshing);
      edtCCColNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCColNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCColNum_Enabled), 5, 0), !bGXsfl_127_Refreshing);
      edtCCCTc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCCTc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCCTc_Enabled), 5, 0), !bGXsfl_127_Refreshing);
   }

   public void zm1HM1650( int GX_JID )
   {
      if ( ( GX_JID == 11 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
         }
         else
         {
         }
      }
      if ( GX_JID == -11 )
      {
         Z252CliCod = A252CliCod ;
         Z9713Tb1_Cod = A9713Tb1_Cod ;
         Z11736CCArtCod = A11736CCArtCod ;
         Z11748TipArtiId = A11748TipArtiId ;
         Z11737CCColNom = A11737CCColNom ;
         Z11738CCColNum = A11738CCColNum ;
         Z11749CCCTc = A11749CCCTc ;
         Z11750IntId = A11750IntId ;
         Z396EmprCod = A396EmprCod ;
      }
   }

   public void standaloneNotModal1HM1650( )
   {
   }

   public void standaloneModal1HM1650( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtIntId_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtIntId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtIntId_Enabled), 5, 0), !bGXsfl_155_Refreshing);
      }
      else
      {
         edtIntId_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtIntId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtIntId_Enabled), 5, 0), !bGXsfl_155_Refreshing);
      }
   }

   public void load1HM1650( )
   {
      /* Using cursor T01HM117 */
      pr_default.execute(115, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Short.valueOf(A9713Tb1_Cod), A11736CCArtCod, Short.valueOf(A11748TipArtiId), A11737CCColNom, Integer.valueOf(A11738CCColNum), Byte.valueOf(A11749CCCTc), Short.valueOf(A11750IntId)});
      if ( (pr_default.getStatus(115) != 101) )
      {
         RcdFound1650 = (short)(1) ;
         zm1HM1650( -11) ;
      }
      pr_default.close(115);
      onLoadActions1HM1650( ) ;
   }

   public void onLoadActions1HM1650( )
   {
      GXt_char1 = A11747IntDs ;
      GXv_char2[0] = A396EmprCod ;
      GXv_int3[0] = (byte)(A11750IntId) ;
      GXv_char4[0] = GXt_char1 ;
      new app.pdscint(remoteHandle, context).execute( GXv_char2, GXv_int3, GXv_char4) ;
      tcccc_impl.this.A396EmprCod = GXv_char2[0] ;
      tcccc_impl.this.A11750IntId = GXv_int3[0] ;
      tcccc_impl.this.GXt_char1 = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A11747IntDs = GXt_char1 ;
   }

   public void checkExtendedTable1HM1650( )
   {
      nIsDirty_1650 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1HM1650( ) ;
      nIsDirty_1650 = (short)(1) ;
      GXt_char1 = A11747IntDs ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int3[0] = (byte)(A11750IntId) ;
      GXv_char2[0] = GXt_char1 ;
      new app.pdscint(remoteHandle, context).execute( GXv_char4, GXv_int3, GXv_char2) ;
      tcccc_impl.this.A396EmprCod = GXv_char4[0] ;
      tcccc_impl.this.A11750IntId = GXv_int3[0] ;
      tcccc_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A11747IntDs = GXt_char1 ;
   }

   public void closeExtendedTableCursors1HM1650( )
   {
   }

   public void enableDisable1HM1650( )
   {
   }

   public void getKey1HM1650( )
   {
      /* Using cursor T01HM118 */
      pr_default.execute(116, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Short.valueOf(A9713Tb1_Cod), A11736CCArtCod, Short.valueOf(A11748TipArtiId), A11737CCColNom, Integer.valueOf(A11738CCColNum), Byte.valueOf(A11749CCCTc), Short.valueOf(A11750IntId)});
      if ( (pr_default.getStatus(116) != 101) )
      {
         RcdFound1650 = (short)(1) ;
      }
      else
      {
         RcdFound1650 = (short)(0) ;
      }
      pr_default.close(116);
   }

   public void getByPrimaryKey1HM1650( )
   {
      /* Using cursor T01HM6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Short.valueOf(A9713Tb1_Cod), A11736CCArtCod, Short.valueOf(A11748TipArtiId), A11737CCColNom, Integer.valueOf(A11738CCColNum), Byte.valueOf(A11749CCCTc), Short.valueOf(A11750IntId)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         zm1HM1650( 11) ;
         RcdFound1650 = (short)(1) ;
         initializeNonKey1HM1650( ) ;
         A11750IntId = T01HM6_A11750IntId[0] ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z9713Tb1_Cod = A9713Tb1_Cod ;
         Z11736CCArtCod = A11736CCArtCod ;
         Z11748TipArtiId = A11748TipArtiId ;
         Z11737CCColNom = A11737CCColNom ;
         Z11738CCColNum = A11738CCColNum ;
         Z11749CCCTc = A11749CCCTc ;
         Z11750IntId = A11750IntId ;
         sMode1650 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1HM1650( ) ;
         load1HM1650( ) ;
         Gx_mode = sMode1650 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1650 = (short)(0) ;
         initializeNonKey1HM1650( ) ;
         sMode1650 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1HM1650( ) ;
         Gx_mode = sMode1650 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1HM1650( ) ;
      }
      pr_default.close(4);
   }

   public void checkOptimisticConcurrency1HM1650( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01HM5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Short.valueOf(A9713Tb1_Cod), A11736CCArtCod, Short.valueOf(A11748TipArtiId), A11737CCColNom, Integer.valueOf(A11738CCColNum), Byte.valueOf(A11749CCCTc), Short.valueOf(A11750IntId)});
         if ( (pr_default.getStatus(3) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCCCno4"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(3) == 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCCCno4"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1HM1650( )
   {
      beforeValidate1HM1650( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1HM1650( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1HM1650( 0) ;
         checkOptimisticConcurrency1HM1650( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1HM1650( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1HM1650( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01HM119 */
                  pr_default.execute(117, new Object[] {Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Short.valueOf(A9713Tb1_Cod), A11736CCArtCod, Short.valueOf(A11748TipArtiId), A11737CCColNom, Integer.valueOf(A11738CCColNum), Byte.valueOf(A11749CCCTc), Short.valueOf(A11750IntId), A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCCno4");
                  if ( (pr_default.getStatus(117) == 1) )
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
                        processLevel1HM1650( ) ;
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
            load1HM1650( ) ;
         }
         endLevel1HM1650( ) ;
      }
      closeExtendedTableCursors1HM1650( ) ;
   }

   public void update1HM1650( )
   {
      beforeValidate1HM1650( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1HM1650( ) ;
      }
      if ( ( nIsMod_1650 != 0 ) || ( nIsDirty_1650 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1HM1650( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1HM1650( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1HM1650( ) ;
                  if ( AnyError == 0 )
                  {
                     /* No attributes to update on table TXPCCCno4 */
                     deferredUpdate1HM1650( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           processLevel1HM1650( ) ;
                           if ( AnyError == 0 )
                           {
                              getByPrimaryKey1HM1650( ) ;
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
            endLevel1HM1650( ) ;
         }
      }
      closeExtendedTableCursors1HM1650( ) ;
   }

   public void deferredUpdate1HM1650( )
   {
   }

   public void delete1HM1650( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1HM1650( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1HM1650( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1HM1650( ) ;
         afterConfirm1HM1650( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1HM1650( ) ;
            if ( AnyError == 0 )
            {
               scanStart1HM1651( ) ;
               while ( RcdFound1651 != 0 )
               {
                  getByPrimaryKey1HM1651( ) ;
                  delete1HM1651( ) ;
                  scanNext1HM1651( ) ;
               }
               scanEnd1HM1651( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01HM120 */
                  pr_default.execute(118, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Short.valueOf(A9713Tb1_Cod), A11736CCArtCod, Short.valueOf(A11748TipArtiId), A11737CCColNom, Integer.valueOf(A11738CCColNum), Byte.valueOf(A11749CCCTc), Short.valueOf(A11750IntId)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCCno4");
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
      sMode1650 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1HM1650( ) ;
      Gx_mode = sMode1650 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1HM1650( )
   {
      standaloneModal1HM1650( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         GXt_char1 = A11747IntDs ;
         GXv_char4[0] = A396EmprCod ;
         GXv_int3[0] = (byte)(A11750IntId) ;
         GXv_char2[0] = GXt_char1 ;
         new app.pdscint(remoteHandle, context).execute( GXv_char4, GXv_int3, GXv_char2) ;
         tcccc_impl.this.A396EmprCod = GXv_char4[0] ;
         tcccc_impl.this.A11750IntId = GXv_int3[0] ;
         tcccc_impl.this.GXt_char1 = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A11747IntDs = GXt_char1 ;
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T01HM121 */
         pr_default.execute(119, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Short.valueOf(A9713Tb1_Cod), A11736CCArtCod, Short.valueOf(A11748TipArtiId), A11737CCColNom, Integer.valueOf(A11738CCColNum), Byte.valueOf(A11749CCCTc), Short.valueOf(A11750IntId)});
         if ( (pr_default.getStatus(119) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Valores Estandars", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(119);
      }
   }

   public void processNestedLevel1HM1651( )
   {
      nGXsfl_178_idx = 0 ;
      while ( nGXsfl_178_idx < nRC_GXsfl_178 )
      {
         readRow1HM1651( ) ;
         if ( ( nRcdExists_1651 != 0 ) || ( nIsMod_1651 != 0 ) )
         {
            standaloneNotModal1HM1651( ) ;
            getKey1HM1651( ) ;
            if ( ( nRcdExists_1651 == 0 ) && ( nRcdDeleted_1651 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1HM1651( ) ;
            }
            else
            {
               if ( RcdFound1651 != 0 )
               {
                  if ( ( nRcdDeleted_1651 != 0 ) && ( nRcdExists_1651 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1HM1651( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1651 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1HM1651( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1651 == 0 )
                  {
                     GXCCtl = "TB1_COD_" + sGXsfl_58_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtTb1_Cod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtCCTCod_Internalname, GXutil.ltrim( localUtil.ntoc( A4031CCTCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCCTDsc_Internalname, GXutil.rtrim( A4036CCTDsc)) ;
         httpContext.changePostValue( "ZT_"+"Z4031CCTCod_"+sGXsfl_178_idx, GXutil.ltrim( localUtil.ntoc( Z4031CCTCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1651_"+sGXsfl_178_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1651, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1651_"+sGXsfl_178_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1651, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1651_"+sGXsfl_178_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1651, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1651 != 0 )
         {
            httpContext.changePostValue( "CCTCOD_"+sGXsfl_178_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCTCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CCTDSC_"+sGXsfl_178_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCTDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1HM1651( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1651 = (short)(0) ;
      nIsMod_1651 = (short)(0) ;
      nRcdDeleted_1651 = (short)(0) ;
   }

   public void processLevel1HM1650( )
   {
      /* Save parent mode. */
      sMode1650 = Gx_mode ;
      processNestedLevel1HM1651( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode1650 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1HM1650( )
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

   public void scanStart1HM1650( )
   {
      /* Scan By routine */
      /* Using cursor T01HM122 */
      pr_default.execute(120, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Short.valueOf(A9713Tb1_Cod), A11736CCArtCod, Short.valueOf(A11748TipArtiId), A11737CCColNom, Integer.valueOf(A11738CCColNum), Byte.valueOf(A11749CCCTc)});
      RcdFound1650 = (short)(0) ;
      if ( (pr_default.getStatus(120) != 101) )
      {
         RcdFound1650 = (short)(1) ;
         A11750IntId = T01HM122_A11750IntId[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1HM1650( )
   {
      /* Scan next routine */
      pr_default.readNext(120);
      RcdFound1650 = (short)(0) ;
      if ( (pr_default.getStatus(120) != 101) )
      {
         RcdFound1650 = (short)(1) ;
         A11750IntId = T01HM122_A11750IntId[0] ;
      }
   }

   public void scanEnd1HM1650( )
   {
      pr_default.close(120);
   }

   public void afterConfirm1HM1650( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1HM1650( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1HM1650( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1HM1650( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1HM1650( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1HM1650( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1HM1650( )
   {
      edtIntId_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtIntId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtIntId_Enabled), 5, 0), !bGXsfl_155_Refreshing);
      edtIntDs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtIntDs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtIntDs_Enabled), 5, 0), !bGXsfl_155_Refreshing);
   }

   public void zm1HM1651( int GX_JID )
   {
      if ( ( GX_JID == 12 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
         }
         else
         {
         }
      }
      if ( GX_JID == -12 )
      {
         Z252CliCod = A252CliCod ;
         Z9713Tb1_Cod = A9713Tb1_Cod ;
         Z11736CCArtCod = A11736CCArtCod ;
         Z11748TipArtiId = A11748TipArtiId ;
         Z11737CCColNom = A11737CCColNom ;
         Z11738CCColNum = A11738CCColNum ;
         Z11749CCCTc = A11749CCCTc ;
         Z11750IntId = A11750IntId ;
         Z396EmprCod = A396EmprCod ;
         Z4031CCTCod = A4031CCTCod ;
         Z4036CCTDsc = A4036CCTDsc ;
      }
   }

   public void standaloneNotModal1HM1651( )
   {
   }

   public void standaloneModal1HM1651( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtCCTCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCCTCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTCod_Enabled), 5, 0), !bGXsfl_178_Refreshing);
      }
      else
      {
         edtCCTCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCCTCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTCod_Enabled), 5, 0), !bGXsfl_178_Refreshing);
      }
   }

   public void load1HM1651( )
   {
      /* Using cursor T01HM123 */
      pr_default.execute(121, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Short.valueOf(A9713Tb1_Cod), A11736CCArtCod, Short.valueOf(A11748TipArtiId), A11737CCColNom, Integer.valueOf(A11738CCColNum), Byte.valueOf(A11749CCCTc), Short.valueOf(A11750IntId), Integer.valueOf(A4031CCTCod)});
      if ( (pr_default.getStatus(121) != 101) )
      {
         RcdFound1651 = (short)(1) ;
         A4036CCTDsc = T01HM123_A4036CCTDsc[0] ;
         zm1HM1651( -12) ;
      }
      pr_default.close(121);
      onLoadActions1HM1651( ) ;
   }

   public void onLoadActions1HM1651( )
   {
   }

   public void checkExtendedTable1HM1651( )
   {
      nIsDirty_1651 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1HM1651( ) ;
      /* Using cursor T01HM4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "CCTCOD_" + sGXsfl_178_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CCDef", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtCCTCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A4036CCTDsc = T01HM4_A4036CCTDsc[0] ;
      pr_default.close(2);
   }

   public void closeExtendedTableCursors1HM1651( )
   {
      pr_default.close(2);
   }

   public void enableDisable1HM1651( )
   {
   }

   public void gxload_13( String A396EmprCod ,
                          int A4031CCTCod )
   {
      /* Using cursor T01HM124 */
      pr_default.execute(122, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod)});
      if ( (pr_default.getStatus(122) == 101) )
      {
         GXCCtl = "CCTCOD_" + sGXsfl_178_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CCDef", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtCCTCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A4036CCTDsc = T01HM124_A4036CCTDsc[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A4036CCTDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(122) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(122);
   }

   public void getKey1HM1651( )
   {
      /* Using cursor T01HM125 */
      pr_default.execute(123, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Short.valueOf(A9713Tb1_Cod), A11736CCArtCod, Short.valueOf(A11748TipArtiId), A11737CCColNom, Integer.valueOf(A11738CCColNum), Byte.valueOf(A11749CCCTc), Short.valueOf(A11750IntId), Integer.valueOf(A4031CCTCod)});
      if ( (pr_default.getStatus(123) != 101) )
      {
         RcdFound1651 = (short)(1) ;
      }
      else
      {
         RcdFound1651 = (short)(0) ;
      }
      pr_default.close(123);
   }

   public void getByPrimaryKey1HM1651( )
   {
      /* Using cursor T01HM3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Short.valueOf(A9713Tb1_Cod), A11736CCArtCod, Short.valueOf(A11748TipArtiId), A11737CCColNom, Integer.valueOf(A11738CCColNum), Byte.valueOf(A11749CCCTc), Short.valueOf(A11750IntId), Integer.valueOf(A4031CCTCod)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1HM1651( 12) ;
         RcdFound1651 = (short)(1) ;
         initializeNonKey1HM1651( ) ;
         A4031CCTCod = T01HM3_A4031CCTCod[0] ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z9713Tb1_Cod = A9713Tb1_Cod ;
         Z11736CCArtCod = A11736CCArtCod ;
         Z11748TipArtiId = A11748TipArtiId ;
         Z11737CCColNom = A11737CCColNom ;
         Z11738CCColNum = A11738CCColNum ;
         Z11749CCCTc = A11749CCCTc ;
         Z11750IntId = A11750IntId ;
         Z4031CCTCod = A4031CCTCod ;
         sMode1651 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1HM1651( ) ;
         load1HM1651( ) ;
         Gx_mode = sMode1651 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1651 = (short)(0) ;
         initializeNonKey1HM1651( ) ;
         sMode1651 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1HM1651( ) ;
         Gx_mode = sMode1651 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1HM1651( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1HM1651( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01HM2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Short.valueOf(A9713Tb1_Cod), A11736CCArtCod, Short.valueOf(A11748TipArtiId), A11737CCColNom, Integer.valueOf(A11738CCColNum), Byte.valueOf(A11749CCCTc), Short.valueOf(A11750IntId), Integer.valueOf(A4031CCTCod)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCCCno5"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCCCno5"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1HM1651( )
   {
      beforeValidate1HM1651( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1HM1651( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1HM1651( 0) ;
         checkOptimisticConcurrency1HM1651( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1HM1651( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1HM1651( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01HM126 */
                  pr_default.execute(124, new Object[] {Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Short.valueOf(A9713Tb1_Cod), A11736CCArtCod, Short.valueOf(A11748TipArtiId), A11737CCColNom, Integer.valueOf(A11738CCColNum), Byte.valueOf(A11749CCCTc), Short.valueOf(A11750IntId), A396EmprCod, Integer.valueOf(A4031CCTCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCCno5");
                  if ( (pr_default.getStatus(124) == 1) )
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
            load1HM1651( ) ;
         }
         endLevel1HM1651( ) ;
      }
      closeExtendedTableCursors1HM1651( ) ;
   }

   public void update1HM1651( )
   {
      beforeValidate1HM1651( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1HM1651( ) ;
      }
      if ( ( nIsMod_1651 != 0 ) || ( nIsDirty_1651 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1HM1651( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1HM1651( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1HM1651( ) ;
                  if ( AnyError == 0 )
                  {
                     /* No attributes to update on table TXPCCCno5 */
                     deferredUpdate1HM1651( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1HM1651( ) ;
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
            endLevel1HM1651( ) ;
         }
      }
      closeExtendedTableCursors1HM1651( ) ;
   }

   public void deferredUpdate1HM1651( )
   {
   }

   public void delete1HM1651( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1HM1651( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1HM1651( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1HM1651( ) ;
         afterConfirm1HM1651( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1HM1651( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01HM127 */
               pr_default.execute(125, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Short.valueOf(A9713Tb1_Cod), A11736CCArtCod, Short.valueOf(A11748TipArtiId), A11737CCColNom, Integer.valueOf(A11738CCColNum), Byte.valueOf(A11749CCCTc), Short.valueOf(A11750IntId), Integer.valueOf(A4031CCTCod)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCCno5");
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
      sMode1651 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1HM1651( ) ;
      Gx_mode = sMode1651 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1HM1651( )
   {
      standaloneModal1HM1651( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01HM128 */
         pr_default.execute(126, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod)});
         A4036CCTDsc = T01HM128_A4036CCTDsc[0] ;
         pr_default.close(126);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T01HM129 */
         pr_default.execute(127, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Short.valueOf(A9713Tb1_Cod), A11736CCArtCod, Short.valueOf(A11748TipArtiId), A11737CCColNom, Integer.valueOf(A11738CCColNum), Byte.valueOf(A11749CCCTc), Short.valueOf(A11750IntId), Integer.valueOf(A4031CCTCod)});
         if ( (pr_default.getStatus(127) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Valores Estandars", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(127);
      }
   }

   public void endLevel1HM1651( )
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

   public void scanStart1HM1651( )
   {
      /* Scan By routine */
      /* Using cursor T01HM130 */
      pr_default.execute(128, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Short.valueOf(A9713Tb1_Cod), A11736CCArtCod, Short.valueOf(A11748TipArtiId), A11737CCColNom, Integer.valueOf(A11738CCColNum), Byte.valueOf(A11749CCCTc), Short.valueOf(A11750IntId)});
      RcdFound1651 = (short)(0) ;
      if ( (pr_default.getStatus(128) != 101) )
      {
         RcdFound1651 = (short)(1) ;
         A4031CCTCod = T01HM130_A4031CCTCod[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1HM1651( )
   {
      /* Scan next routine */
      pr_default.readNext(128);
      RcdFound1651 = (short)(0) ;
      if ( (pr_default.getStatus(128) != 101) )
      {
         RcdFound1651 = (short)(1) ;
         A4031CCTCod = T01HM130_A4031CCTCod[0] ;
      }
   }

   public void scanEnd1HM1651( )
   {
      pr_default.close(128);
   }

   public void afterConfirm1HM1651( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1HM1651( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1HM1651( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1HM1651( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1HM1651( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1HM1651( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1HM1651( )
   {
      edtCCTCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCTCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTCod_Enabled), 5, 0), !bGXsfl_178_Refreshing);
      edtCCTDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCTDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTDsc_Enabled), 5, 0), !bGXsfl_178_Refreshing);
   }

   public void send_integrity_lvl_hashes1HM1651( )
   {
   }

   public void send_integrity_lvl_hashes1HM1650( )
   {
   }

   public void send_integrity_lvl_hashes1HM1649( )
   {
   }

   public void send_integrity_lvl_hashes1HM1648( )
   {
   }

   public void send_integrity_lvl_hashes1HM1642( )
   {
   }

   public void send_integrity_lvl_hashes1HM1534( )
   {
   }

   public void send_integrity_lvl_hashes1HM21( )
   {
   }

   public void subsflControlProps_581534( )
   {
      edtTb1_Cod_Internalname = "TB1_COD_"+sGXsfl_58_idx ;
      edtTb1_Dsc_Internalname = "TB1_DSC_"+sGXsfl_58_idx ;
      lblTitlearticulos_Internalname = "TITLEARTICULOS_"+sGXsfl_58_idx ;
      subGrid2_Internalname = "GRID2_"+sGXsfl_58_idx ;
   }

   public void subsflControlProps_fel_581534( )
   {
      edtTb1_Cod_Internalname = "TB1_COD_"+sGXsfl_58_fel_idx ;
      edtTb1_Dsc_Internalname = "TB1_DSC_"+sGXsfl_58_fel_idx ;
      lblTitlearticulos_Internalname = "TITLEARTICULOS_"+sGXsfl_58_fel_idx ;
      subGrid2_Internalname = "GRID2_"+sGXsfl_58_fel_idx ;
   }

   public void addRow1HM1534( )
   {
      nRC_GXsfl_81 = 0 ;
      nGXsfl_58_idx = (int)(nGXsfl_58_idx+1) ;
      sGXsfl_58_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_58_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_581534( ) ;
      sendRow1HM1534( ) ;
   }

   public void sendRow1HM1534( )
   {
      Grid1Row = GXWebRow.GetNew(context) ;
      if ( subGrid1_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGrid1_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGrid1_Class, "") != 0 )
         {
            subGrid1_Linesclass = subGrid1_Class+"Odd" ;
         }
      }
      else if ( subGrid1_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGrid1_Backstyle = (byte)(0) ;
         subGrid1_Backcolor = subGrid1_Allbackcolor ;
         if ( GXutil.strcmp(subGrid1_Class, "") != 0 )
         {
            subGrid1_Linesclass = subGrid1_Class+"Uniform" ;
         }
      }
      else if ( subGrid1_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGrid1_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGrid1_Class, "") != 0 )
         {
            subGrid1_Linesclass = subGrid1_Class+"Odd" ;
         }
         subGrid1_Backcolor = (int)(0xFFFFFF) ;
      }
      else if ( subGrid1_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGrid1_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_58_idx) % (2))) == 0 )
         {
            subGrid1_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGrid1_Class, "") != 0 )
            {
               subGrid1_Linesclass = subGrid1_Class+"Even" ;
            }
         }
         else
         {
            subGrid1_Backcolor = (int)(0xFFFFFF) ;
            if ( GXutil.strcmp(subGrid1_Class, "") != 0 )
            {
               subGrid1_Linesclass = subGrid1_Class+"Odd" ;
            }
         }
      }
      /* Start of Columns property logic. */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<tr"+" class=\""+subGrid1_Linesclass+"\" style=\""+""+"\""+" data-gxrow=\""+sGXsfl_58_idx+"\">") ;
      }
      if ( GRID1_IsPaging == 0 )
      {
         GXCCtl = "GRID2_nFirstRecordOnPage_" + sGXsfl_58_idx ;
         GRID2_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
      }
      else
      {
         GRID2_nFirstRecordOnPage = 0 ;
      }
      /* Div Control */
      Grid1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {divGridtable1_Internalname+"_"+sGXsfl_58_idx,Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","Table","left","top","","","div"});
      /* Div Control */
      Grid1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","row","left","top","","","div"});
      /* Div Control */
      Grid1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-xs-12","left","top","","","div"});
      /* Div Control */
      Grid1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {divTable2_Internalname+"_"+sGXsfl_58_idx,Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","LevelTable","left","top","","","div"});
      /* Div Control */
      Grid1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","row","left","top","","","div"});
      /* Div Control */
      Grid1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-xs-12 FormCellAdvanced","left","top","","","div"});
      /* Div Control */
      Grid1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","form-group gx-form-group","left","top",""+" data-gx-for=\""+edtTb1_Cod_Internalname+"\"","","div"});
      /* Attribute/Variable Label */
      Grid1Row.AddColumnProperties("html_label", -1, isAjaxCallMode( ), new Object[] {edtTb1_Cod_Internalname,httpContext.getMessage( "Codigo", ""),"col-sm-3 AttributeLabel",Integer.valueOf(1),Boolean.valueOf(true),""});
      /* Div Control */
      Grid1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-sm-9 gx-attribute","left","top","","","div"});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1534_" + sGXsfl_58_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 67,'',false,'" + sGXsfl_58_idx + "',58)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTb1_Cod_Internalname,GXutil.ltrim( localUtil.ntoc( A9713Tb1_Cod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A9713Tb1_Cod), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,67);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTb1_Cod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtTb1_Cod_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(4),"chr",Integer.valueOf(1),"row",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(58),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Grid1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Grid1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Grid1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      /* Div Control */
      Grid1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","row","left","top","","","div"});
      /* Div Control */
      Grid1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-xs-12 FormCell","left","top","","","div"});
      /* Div Control */
      Grid1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","form-group gx-form-group","left","top",""+" data-gx-for=\""+edtTb1_Dsc_Internalname+"\"","","div"});
      /* Attribute/Variable Label */
      Grid1Row.AddColumnProperties("html_label", -1, isAjaxCallMode( ), new Object[] {edtTb1_Dsc_Internalname,httpContext.getMessage( "Descripcion", ""),"col-sm-3 AttributeLabel",Integer.valueOf(1),Boolean.valueOf(true),""});
      /* Div Control */
      Grid1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-sm-9 gx-attribute","left","top","","","div"});
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTb1_Dsc_Internalname,GXutil.rtrim( A9715Tb1_Dsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTb1_Dsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtTb1_Dsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(80),"chr",Integer.valueOf(1),"row",Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(58),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      Grid1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Grid1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Grid1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Grid1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      /* Div Control */
      Grid1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","row","left","top","","","div"});
      /* Div Control */
      Grid1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-xs-12 col-sm-9 col-sm-offset-3 LevelTable","left","top","","","div"});
      /* Div Control */
      Grid1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {divArticulostable_Internalname+"_"+sGXsfl_58_idx,Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","LevelTable","left","top","","","div"});
      /* Div Control */
      Grid1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","row","left","top","","","div"});
      /* Div Control */
      Grid1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-xs-12 FormCell","left","top","","","div"});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTitlearticulos_Internalname,httpContext.getMessage( "Articulos", ""),"","",lblTitlearticulos_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","Title",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Grid1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      /* Div Control */
      Grid1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","row","left","top","","","div"});
      /* Div Control */
      Grid1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-xs-12","left","top","","","div"});
      /*  Child Grid Control  */
      Grid1Row.AddColumnProperties("subfile", -1, isAjaxCallMode( ), new Object[] {"Grid2Container"});
      if ( isAjaxCallMode( ) )
      {
         Grid2Container = new com.genexus.webpanels.GXWebGrid(context);
      }
      else
      {
         Grid2Container.Clear();
      }
      startgridcontrol81( ) ;
      /* Save parent mode. */
      sMode1642 = Gx_mode ;
      nGXsfl_81_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1642 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1642 = (short)(1) ;
            scanStart1HM1642( ) ;
            while ( RcdFound1642 != 0 )
            {
               init_level_properties1642( ) ;
               getByPrimaryKey1HM1642( ) ;
               addRow1HM1642( ) ;
               scanNext1HM1642( ) ;
            }
            scanEnd1HM1642( ) ;
            nBlankRcdCount1642 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal1HM1642( ) ;
         standaloneModal1HM1642( ) ;
         sMode1642 = Gx_mode ;
         while ( nGXsfl_81_idx < nRC_GXsfl_81 )
         {
            bGXsfl_81_Refreshing = true ;
            readRow1HM1642( ) ;
            edtCCArtCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CCARTCOD_"+sGXsfl_81_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCArtCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCArtCod_Enabled), 5, 0), !bGXsfl_81_Refreshing);
            edtCCArtdsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CCARTDSC_"+sGXsfl_81_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCArtdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCArtdsc_Enabled), 5, 0), !bGXsfl_81_Refreshing);
            if ( ( nRcdExists_1642 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1HM1642( ) ;
            }
            sendRow1HM1642( ) ;
            bGXsfl_81_Refreshing = false ;
         }
         Gx_mode = sMode1642 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1642 = (short)(5) ;
         nRcdExists_1642 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1HM1642( ) ;
            while ( RcdFound1642 != 0 )
            {
               sGXsfl_81_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_81_idx+1), 4, 0), (short)(4), "0") + sGXsfl_58_idx ;
               subsflControlProps_811642( ) ;
               init_level_properties1642( ) ;
               standaloneNotModal1HM1642( ) ;
               getByPrimaryKey1HM1642( ) ;
               standaloneModal1HM1642( ) ;
               addRow1HM1642( ) ;
               scanNext1HM1642( ) ;
            }
            scanEnd1HM1642( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1642 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_81_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_81_idx+1), 4, 0), (short)(4), "0") + sGXsfl_58_idx ;
      subsflControlProps_811642( ) ;
      initAll1HM1642( ) ;
      init_level_properties1642( ) ;
      nRcdExists_1642 = (short)(0) ;
      nIsMod_1642 = (short)(0) ;
      nRcdDeleted_1642 = (short)(0) ;
      if ( ( CommonUtil.decimalVal( EvtGridId, ".").add(CommonUtil.decimalVal( EvtRowId, ".")).doubleValue() == 0 ) || ( 58 == CommonUtil.decimalVal( EvtGridId, ".").doubleValue() ) && ( DecimalUtil.compareTo(CommonUtil.decimalVal( EvtRowId, "."), CommonUtil.decimalVal( sGXsfl_58_idx, ".")) == 0 ) )
      {
         nBlankRcdCount1642 = (short)(nBlankRcdUsr1642+nBlankRcdCount1642) ;
      }
      fRowAdded = 0 ;
      while ( nBlankRcdCount1642 > 0 )
      {
         standaloneNotModal1HM1642( ) ;
         standaloneModal1HM1642( ) ;
         addRow1HM1642( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtCCArtCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1642 = (short)(nBlankRcdCount1642-1) ;
      }
      Gx_mode = sMode1642 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* Restore parent mode. */
      Gx_mode = sMode1642 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      if ( ! isAjaxCallMode( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Grid2ContainerData"+"_"+sGXsfl_58_idx, Grid2Container.ToJavascriptSource());
      }
      if ( isAjaxCallMode( ) )
      {
         Grid1Row.AddGrid("Grid2", Grid2Container);
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Grid2ContainerData"+"V_"+sGXsfl_58_idx, Grid2Container.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Grid2ContainerData"+"V_"+sGXsfl_58_idx+"\" value='"+Grid2Container.GridValuesHidden()+"'/>") ;
      }
      Grid1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Grid1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Grid1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Grid1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Grid1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Grid1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Grid1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Grid1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Grid1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes1HM1534( ) ;
      GXCCtl = "Z9713Tb1_Cod_" + sGXsfl_58_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z9713Tb1_Cod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRC_GXsfl_81_" + sGXsfl_58_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nGXsfl_81_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1534_" + sGXsfl_58_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1534, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1534_" + sGXsfl_58_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1534, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1534_" + sGXsfl_58_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1534, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "TB1_COD_"+sGXsfl_58_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTb1_Cod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "TB1_DSC_"+sGXsfl_58_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTb1_Dsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      GRID2_nFirstRecordOnPage = 0 ;
      GRID2_nCurrentRecord = 0 ;
      /* End of Columns property logic. */
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow1HM1534( )
   {
      nGXsfl_58_idx = (int)(nGXsfl_58_idx+1) ;
      sGXsfl_58_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_58_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_581534( ) ;
      edtTb1_Cod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TB1_COD_"+sGXsfl_58_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtTb1_Dsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TB1_DSC_"+sGXsfl_58_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTb1_Cod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTb1_Cod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "TB1_COD_" + sGXsfl_58_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtTb1_Cod_Internalname ;
         wbErr = true ;
         A9713Tb1_Cod = (short)(0) ;
      }
      else
      {
         A9713Tb1_Cod = (short)(localUtil.ctol( httpContext.cgiGet( edtTb1_Cod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A9715Tb1_Dsc = httpContext.cgiGet( edtTb1_Dsc_Internalname) ;
      n9715Tb1_Dsc = false ;
      GXCCtl = "Z9713Tb1_Cod_" + sGXsfl_58_idx ;
      Z9713Tb1_Cod = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRC_GXsfl_81_" + sGXsfl_58_idx ;
      nRC_GXsfl_81 = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdDeleted_1534_" + sGXsfl_58_idx ;
      nRcdDeleted_1534 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1534_" + sGXsfl_58_idx ;
      nRcdExists_1534 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1534_" + sGXsfl_58_idx ;
      nIsMod_1534 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRC_GXsfl_81_" + sGXsfl_58_idx ;
      nRC_GXsfl_81 = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void subsflControlProps_811642( )
   {
      edtCCArtCod_Internalname = "CCARTCOD_"+sGXsfl_81_idx ;
      edtCCArtdsc_Internalname = "CCARTDSC_"+sGXsfl_81_idx ;
      lblTitletipoarticulo_Internalname = "TITLETIPOARTICULO_"+sGXsfl_81_idx ;
      subGrid3_Internalname = "GRID3_"+sGXsfl_81_idx ;
   }

   public void subsflControlProps_fel_811642( )
   {
      edtCCArtCod_Internalname = "CCARTCOD_"+sGXsfl_81_fel_idx ;
      edtCCArtdsc_Internalname = "CCARTDSC_"+sGXsfl_81_fel_idx ;
      lblTitletipoarticulo_Internalname = "TITLETIPOARTICULO_"+sGXsfl_81_fel_idx ;
      subGrid3_Internalname = "GRID3_"+sGXsfl_81_fel_idx ;
   }

   public void addRow1HM1642( )
   {
      nRC_GXsfl_104 = 0 ;
      nGXsfl_81_idx = (int)(nGXsfl_81_idx+1) ;
      sGXsfl_81_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_81_idx), 4, 0), (short)(4), "0") + sGXsfl_58_idx ;
      subsflControlProps_811642( ) ;
      sendRow1HM1642( ) ;
   }

   public void sendRow1HM1642( )
   {
      Grid2Row = GXWebRow.GetNew(context) ;
      if ( subGrid2_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGrid2_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGrid2_Class, "") != 0 )
         {
            subGrid2_Linesclass = subGrid2_Class+"Odd" ;
         }
      }
      else if ( subGrid2_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGrid2_Backstyle = (byte)(0) ;
         subGrid2_Backcolor = subGrid2_Allbackcolor ;
         if ( GXutil.strcmp(subGrid2_Class, "") != 0 )
         {
            subGrid2_Linesclass = subGrid2_Class+"Uniform" ;
         }
      }
      else if ( subGrid2_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGrid2_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGrid2_Class, "") != 0 )
         {
            subGrid2_Linesclass = subGrid2_Class+"Odd" ;
         }
         subGrid2_Backcolor = (int)(0xFFFFFF) ;
      }
      else if ( subGrid2_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGrid2_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_81_idx) % (2))) == 0 )
         {
            subGrid2_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGrid2_Class, "") != 0 )
            {
               subGrid2_Linesclass = subGrid2_Class+"Even" ;
            }
         }
         else
         {
            subGrid2_Backcolor = (int)(0xFFFFFF) ;
            if ( GXutil.strcmp(subGrid2_Class, "") != 0 )
            {
               subGrid2_Linesclass = subGrid2_Class+"Odd" ;
            }
         }
      }
      /* Start of Columns property logic. */
      if ( Grid2Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<tr"+" class=\""+subGrid2_Linesclass+"\" style=\""+""+"\""+" data-gxrow=\""+sGXsfl_81_idx+"\">") ;
      }
      if ( GRID2_IsPaging == 0 )
      {
         GXCCtl = "GRID3_nFirstRecordOnPage_" + sGXsfl_81_idx ;
         GRID3_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
      }
      else
      {
         GRID3_nFirstRecordOnPage = 0 ;
      }
      /* Div Control */
      Grid2Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {divGridtable2_Internalname+"_"+sGXsfl_81_idx,Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","Table","left","top","","","div"});
      /* Div Control */
      Grid2Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","row","left","top","","","div"});
      /* Div Control */
      Grid2Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-xs-12","left","top","","","div"});
      /* Div Control */
      Grid2Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {divTable3_Internalname+"_"+sGXsfl_81_idx,Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","LevelTable","left","top","","","div"});
      /* Div Control */
      Grid2Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","row","left","top","","","div"});
      /* Div Control */
      Grid2Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-xs-12 FormCellAdvanced","left","top","","","div"});
      /* Div Control */
      Grid2Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","form-group gx-form-group","left","top",""+" data-gx-for=\""+edtCCArtCod_Internalname+"\"","","div"});
      /* Attribute/Variable Label */
      Grid2Row.AddColumnProperties("html_label", -1, isAjaxCallMode( ), new Object[] {edtCCArtCod_Internalname,httpContext.getMessage( "Articulo", ""),"col-sm-3 AttributeLabel",Integer.valueOf(1),Boolean.valueOf(true),""});
      /* Div Control */
      Grid2Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-sm-9 gx-attribute","left","top","","","div"});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1642_" + sGXsfl_81_idx + "',1);gx.fn.setControlValue('nIsMod_1534_" + sGXsfl_58_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 90,'',false,'" + sGXsfl_81_idx + "',81)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCCArtCod_Internalname,GXutil.rtrim( A11736CCArtCod),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,90);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCCArtCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtCCArtCod_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(16),"chr",Integer.valueOf(1),"row",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(81),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      Grid2Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Grid2Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Grid2Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Grid2Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      /* Div Control */
      Grid2Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","row","left","top","","","div"});
      /* Div Control */
      Grid2Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-xs-12 FormCell","left","top","","","div"});
      /* Div Control */
      Grid2Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","form-group gx-form-group","left","top",""+" data-gx-for=\""+edtCCArtdsc_Internalname+"\"","","div"});
      /* Attribute/Variable Label */
      Grid2Row.AddColumnProperties("html_label", -1, isAjaxCallMode( ), new Object[] {edtCCArtdsc_Internalname,httpContext.getMessage( "Descripcion", ""),"col-sm-3 AttributeLabel",Integer.valueOf(1),Boolean.valueOf(true),""});
      /* Div Control */
      Grid2Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-sm-9 gx-attribute","left","top","","","div"});
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCCArtdsc_Internalname,GXutil.rtrim( A11745CCArtdsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCCArtdsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtCCArtdsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(26),"chr",Integer.valueOf(1),"row",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(81),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      Grid2Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Grid2Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Grid2Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Grid2Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      /* Div Control */
      Grid2Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","row","left","top","","","div"});
      /* Div Control */
      Grid2Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-xs-12 col-sm-9 col-sm-offset-3 LevelTable","left","top","","","div"});
      /* Div Control */
      Grid2Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {divTipoarticulotable_Internalname+"_"+sGXsfl_81_idx,Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","LevelTable","left","top","","","div"});
      /* Div Control */
      Grid2Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","row","left","top","","","div"});
      /* Div Control */
      Grid2Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-xs-12 FormCell","left","top","","","div"});
      /* Text block */
      Grid2Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTitletipoarticulo_Internalname,httpContext.getMessage( "Tipo Articulo", ""),"","",lblTitletipoarticulo_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","Title",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid2Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Grid2Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      /* Div Control */
      Grid2Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","row","left","top","","","div"});
      /* Div Control */
      Grid2Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-xs-12","left","top","","","div"});
      /*  Child Grid Control  */
      Grid2Row.AddColumnProperties("subfile", -1, isAjaxCallMode( ), new Object[] {"Grid3Container"});
      if ( isAjaxCallMode( ) )
      {
         Grid3Container = new com.genexus.webpanels.GXWebGrid(context);
      }
      else
      {
         Grid3Container.Clear();
      }
      startgridcontrol104( ) ;
      /* Save parent mode. */
      sMode1648 = Gx_mode ;
      nGXsfl_104_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1648 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1648 = (short)(1) ;
            scanStart1HM1648( ) ;
            while ( RcdFound1648 != 0 )
            {
               init_level_properties1648( ) ;
               getByPrimaryKey1HM1648( ) ;
               addRow1HM1648( ) ;
               scanNext1HM1648( ) ;
            }
            scanEnd1HM1648( ) ;
            nBlankRcdCount1648 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal1HM1648( ) ;
         standaloneModal1HM1648( ) ;
         sMode1648 = Gx_mode ;
         while ( nGXsfl_104_idx < nRC_GXsfl_104 )
         {
            bGXsfl_104_Refreshing = true ;
            readRow1HM1648( ) ;
            edtTipArtiId_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TIPARTIID_"+sGXsfl_104_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtTipArtiId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipArtiId_Enabled), 5, 0), !bGXsfl_104_Refreshing);
            edtTipArtiDs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TIPARTIDS_"+sGXsfl_104_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtTipArtiDs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipArtiDs_Enabled), 5, 0), !bGXsfl_104_Refreshing);
            if ( ( nRcdExists_1648 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1HM1648( ) ;
            }
            sendRow1HM1648( ) ;
            bGXsfl_104_Refreshing = false ;
         }
         Gx_mode = sMode1648 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1648 = (short)(5) ;
         nRcdExists_1648 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1HM1648( ) ;
            while ( RcdFound1648 != 0 )
            {
               sGXsfl_104_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_104_idx+1), 4, 0), (short)(4), "0") + sGXsfl_81_idx ;
               subsflControlProps_1041648( ) ;
               init_level_properties1648( ) ;
               standaloneNotModal1HM1648( ) ;
               getByPrimaryKey1HM1648( ) ;
               standaloneModal1HM1648( ) ;
               addRow1HM1648( ) ;
               scanNext1HM1648( ) ;
            }
            scanEnd1HM1648( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1648 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_104_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_104_idx+1), 4, 0), (short)(4), "0") + sGXsfl_81_idx ;
      subsflControlProps_1041648( ) ;
      initAll1HM1648( ) ;
      init_level_properties1648( ) ;
      nRcdExists_1648 = (short)(0) ;
      nIsMod_1648 = (short)(0) ;
      nRcdDeleted_1648 = (short)(0) ;
      if ( ( CommonUtil.decimalVal( EvtGridId, ".").add(CommonUtil.decimalVal( EvtRowId, ".")).doubleValue() == 0 ) || ( 81 == CommonUtil.decimalVal( EvtGridId, ".").doubleValue() ) && ( DecimalUtil.compareTo(CommonUtil.decimalVal( EvtRowId, "."), CommonUtil.decimalVal( sGXsfl_81_idx, ".")) == 0 ) )
      {
         nBlankRcdCount1648 = (short)(nBlankRcdUsr1648+nBlankRcdCount1648) ;
      }
      fRowAdded = 0 ;
      while ( nBlankRcdCount1648 > 0 )
      {
         standaloneNotModal1HM1648( ) ;
         standaloneModal1HM1648( ) ;
         addRow1HM1648( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtTipArtiId_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1648 = (short)(nBlankRcdCount1648-1) ;
      }
      Gx_mode = sMode1648 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* Restore parent mode. */
      Gx_mode = sMode1648 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      if ( ! isAjaxCallMode( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Grid3ContainerData"+"_"+sGXsfl_81_idx, Grid3Container.ToJavascriptSource());
      }
      if ( isAjaxCallMode( ) )
      {
         Grid2Row.AddGrid("Grid3", Grid3Container);
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Grid3ContainerData"+"V_"+sGXsfl_81_idx, Grid3Container.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Grid3ContainerData"+"V_"+sGXsfl_81_idx+"\" value='"+Grid3Container.GridValuesHidden()+"'/>") ;
      }
      Grid2Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Grid2Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Grid2Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Grid2Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Grid2Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Grid2Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Grid2Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Grid2Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Grid2Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      httpContext.ajax_sending_grid_row(Grid2Row);
      send_integrity_lvl_hashes1HM1642( ) ;
      GXCCtl = "Z11736CCArtCod_" + sGXsfl_81_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z11736CCArtCod));
      GXCCtl = "nRC_GXsfl_104_" + sGXsfl_81_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nGXsfl_104_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1642_" + sGXsfl_81_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1642, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1642_" + sGXsfl_81_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1642, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1642_" + sGXsfl_81_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1642, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CCARTCOD_"+sGXsfl_81_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCArtCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CCARTDSC_"+sGXsfl_81_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCArtdsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      GRID3_nFirstRecordOnPage = 0 ;
      GRID3_nCurrentRecord = 0 ;
      /* End of Columns property logic. */
      Grid2Container.AddRow(Grid2Row);
   }

   public void readRow1HM1642( )
   {
      nGXsfl_81_idx = (int)(nGXsfl_81_idx+1) ;
      sGXsfl_81_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_81_idx), 4, 0), (short)(4), "0") + sGXsfl_58_idx ;
      subsflControlProps_811642( ) ;
      edtCCArtCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CCARTCOD_"+sGXsfl_81_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCCArtdsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CCARTDSC_"+sGXsfl_81_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A11736CCArtCod = httpContext.cgiGet( edtCCArtCod_Internalname) ;
      A11745CCArtdsc = httpContext.cgiGet( edtCCArtdsc_Internalname) ;
      GXCCtl = "Z11736CCArtCod_" + sGXsfl_81_idx ;
      Z11736CCArtCod = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "nRC_GXsfl_104_" + sGXsfl_81_idx ;
      nRC_GXsfl_104 = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdDeleted_1642_" + sGXsfl_81_idx ;
      nRcdDeleted_1642 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1642_" + sGXsfl_81_idx ;
      nRcdExists_1642 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1642_" + sGXsfl_81_idx ;
      nIsMod_1642 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRC_GXsfl_104_" + sGXsfl_81_idx ;
      nRC_GXsfl_104 = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void subsflControlProps_1041648( )
   {
      edtTipArtiId_Internalname = "TIPARTIID_"+sGXsfl_104_idx ;
      edtTipArtiDs_Internalname = "TIPARTIDS_"+sGXsfl_104_idx ;
      lblTitlecolores_Internalname = "TITLECOLORES_"+sGXsfl_104_idx ;
      subGrid4_Internalname = "GRID4_"+sGXsfl_104_idx ;
   }

   public void subsflControlProps_fel_1041648( )
   {
      edtTipArtiId_Internalname = "TIPARTIID_"+sGXsfl_104_fel_idx ;
      edtTipArtiDs_Internalname = "TIPARTIDS_"+sGXsfl_104_fel_idx ;
      lblTitlecolores_Internalname = "TITLECOLORES_"+sGXsfl_104_fel_idx ;
      subGrid4_Internalname = "GRID4_"+sGXsfl_104_fel_idx ;
   }

   public void addRow1HM1648( )
   {
      nRC_GXsfl_127 = 0 ;
      nGXsfl_104_idx = (int)(nGXsfl_104_idx+1) ;
      sGXsfl_104_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_104_idx), 4, 0), (short)(4), "0") + sGXsfl_81_idx ;
      subsflControlProps_1041648( ) ;
      sendRow1HM1648( ) ;
   }

   public void sendRow1HM1648( )
   {
      Grid3Row = GXWebRow.GetNew(context) ;
      if ( subGrid3_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGrid3_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGrid3_Class, "") != 0 )
         {
            subGrid3_Linesclass = subGrid3_Class+"Odd" ;
         }
      }
      else if ( subGrid3_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGrid3_Backstyle = (byte)(0) ;
         subGrid3_Backcolor = subGrid3_Allbackcolor ;
         if ( GXutil.strcmp(subGrid3_Class, "") != 0 )
         {
            subGrid3_Linesclass = subGrid3_Class+"Uniform" ;
         }
      }
      else if ( subGrid3_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGrid3_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGrid3_Class, "") != 0 )
         {
            subGrid3_Linesclass = subGrid3_Class+"Odd" ;
         }
         subGrid3_Backcolor = (int)(0xFFFFFF) ;
      }
      else if ( subGrid3_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGrid3_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_104_idx) % (2))) == 0 )
         {
            subGrid3_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGrid3_Class, "") != 0 )
            {
               subGrid3_Linesclass = subGrid3_Class+"Even" ;
            }
         }
         else
         {
            subGrid3_Backcolor = (int)(0xFFFFFF) ;
            if ( GXutil.strcmp(subGrid3_Class, "") != 0 )
            {
               subGrid3_Linesclass = subGrid3_Class+"Odd" ;
            }
         }
      }
      /* Start of Columns property logic. */
      if ( Grid3Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<tr"+" class=\""+subGrid3_Linesclass+"\" style=\""+""+"\""+" data-gxrow=\""+sGXsfl_104_idx+"\">") ;
      }
      if ( GRID3_IsPaging == 0 )
      {
         GXCCtl = "GRID4_nFirstRecordOnPage_" + sGXsfl_104_idx ;
         GRID4_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
      }
      else
      {
         GRID4_nFirstRecordOnPage = 0 ;
      }
      /* Div Control */
      Grid3Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {divGridtable3_Internalname+"_"+sGXsfl_104_idx,Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","Table","left","top","","","div"});
      /* Div Control */
      Grid3Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","row","left","top","","","div"});
      /* Div Control */
      Grid3Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-xs-12","left","top","","","div"});
      /* Div Control */
      Grid3Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {divTable4_Internalname+"_"+sGXsfl_104_idx,Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","LevelTable","left","top","","","div"});
      /* Div Control */
      Grid3Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","row","left","top","","","div"});
      /* Div Control */
      Grid3Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-xs-12 FormCellAdvanced","left","top","","","div"});
      /* Div Control */
      Grid3Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","form-group gx-form-group","left","top",""+" data-gx-for=\""+edtTipArtiId_Internalname+"\"","","div"});
      /* Attribute/Variable Label */
      Grid3Row.AddColumnProperties("html_label", -1, isAjaxCallMode( ), new Object[] {edtTipArtiId_Internalname,httpContext.getMessage( "Tipo Articulo", ""),"col-sm-3 AttributeLabel",Integer.valueOf(1),Boolean.valueOf(true),""});
      /* Div Control */
      Grid3Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-sm-9 gx-attribute","left","top","","","div"});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1648_" + sGXsfl_104_idx + "',1);gx.fn.setControlValue('nIsMod_1642_" + sGXsfl_81_idx + "',1);gx.fn.setControlValue('nIsMod_1534_" + sGXsfl_58_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 113,'',false,'" + sGXsfl_104_idx + "',104)\"" ;
      ROClassString = "Attribute" ;
      Grid3Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTipArtiId_Internalname,GXutil.ltrim( localUtil.ntoc( A11748TipArtiId, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A11748TipArtiId), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,113);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTipArtiId_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtTipArtiId_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(4),"chr",Integer.valueOf(1),"row",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(104),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid3Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Grid3Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Grid3Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Grid3Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      /* Div Control */
      Grid3Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","row","left","top","","","div"});
      /* Div Control */
      Grid3Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-xs-12 FormCell","left","top","","","div"});
      /* Div Control */
      Grid3Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","form-group gx-form-group","left","top",""+" data-gx-for=\""+edtTipArtiDs_Internalname+"\"","","div"});
      /* Attribute/Variable Label */
      Grid3Row.AddColumnProperties("html_label", -1, isAjaxCallMode( ), new Object[] {edtTipArtiDs_Internalname,httpContext.getMessage( "Descripcion", ""),"col-sm-3 AttributeLabel",Integer.valueOf(1),Boolean.valueOf(true),""});
      /* Div Control */
      Grid3Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-sm-9 gx-attribute","left","top","","","div"});
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid3Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTipArtiDs_Internalname,GXutil.rtrim( A11746TipArtiDs),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTipArtiDs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtTipArtiDs_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(30),"chr",Integer.valueOf(1),"row",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(104),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      Grid3Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Grid3Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Grid3Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Grid3Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      /* Div Control */
      Grid3Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","row","left","top","","","div"});
      /* Div Control */
      Grid3Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-xs-12 col-sm-9 col-sm-offset-3 LevelTable","left","top","","","div"});
      /* Div Control */
      Grid3Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {divColorestable_Internalname+"_"+sGXsfl_104_idx,Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","LevelTable","left","top","","","div"});
      /* Div Control */
      Grid3Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","row","left","top","","","div"});
      /* Div Control */
      Grid3Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-xs-12 FormCell","left","top","","","div"});
      /* Text block */
      Grid3Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTitlecolores_Internalname,httpContext.getMessage( "Colores", ""),"","",lblTitlecolores_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","Title",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid3Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Grid3Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      /* Div Control */
      Grid3Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","row","left","top","","","div"});
      /* Div Control */
      Grid3Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-xs-12","left","top","","","div"});
      /*  Child Grid Control  */
      Grid3Row.AddColumnProperties("subfile", -1, isAjaxCallMode( ), new Object[] {"Grid4Container"});
      if ( isAjaxCallMode( ) )
      {
         Grid4Container = new com.genexus.webpanels.GXWebGrid(context);
      }
      else
      {
         Grid4Container.Clear();
      }
      startgridcontrol127( ) ;
      /* Save parent mode. */
      sMode1649 = Gx_mode ;
      nGXsfl_127_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1649 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1649 = (short)(1) ;
            scanStart1HM1649( ) ;
            while ( RcdFound1649 != 0 )
            {
               init_level_properties1649( ) ;
               getByPrimaryKey1HM1649( ) ;
               addRow1HM1649( ) ;
               scanNext1HM1649( ) ;
            }
            scanEnd1HM1649( ) ;
            nBlankRcdCount1649 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal1HM1649( ) ;
         standaloneModal1HM1649( ) ;
         sMode1649 = Gx_mode ;
         while ( nGXsfl_127_idx < nRC_GXsfl_127 )
         {
            bGXsfl_127_Refreshing = true ;
            readRow1HM1649( ) ;
            edtCCColNom_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CCCOLNOM_"+sGXsfl_127_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCColNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCColNom_Enabled), 5, 0), !bGXsfl_127_Refreshing);
            edtCCColNum_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CCCOLNUM_"+sGXsfl_127_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCColNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCColNum_Enabled), 5, 0), !bGXsfl_127_Refreshing);
            edtCCCTc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CCCTC_"+sGXsfl_127_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCCTc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCCTc_Enabled), 5, 0), !bGXsfl_127_Refreshing);
            if ( ( nRcdExists_1649 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1HM1649( ) ;
            }
            sendRow1HM1649( ) ;
            bGXsfl_127_Refreshing = false ;
         }
         Gx_mode = sMode1649 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1649 = (short)(5) ;
         nRcdExists_1649 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1HM1649( ) ;
            while ( RcdFound1649 != 0 )
            {
               sGXsfl_127_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_127_idx+1), 4, 0), (short)(4), "0") + sGXsfl_104_idx ;
               subsflControlProps_1271649( ) ;
               init_level_properties1649( ) ;
               standaloneNotModal1HM1649( ) ;
               getByPrimaryKey1HM1649( ) ;
               standaloneModal1HM1649( ) ;
               addRow1HM1649( ) ;
               scanNext1HM1649( ) ;
            }
            scanEnd1HM1649( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1649 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_127_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_127_idx+1), 4, 0), (short)(4), "0") + sGXsfl_104_idx ;
      subsflControlProps_1271649( ) ;
      initAll1HM1649( ) ;
      init_level_properties1649( ) ;
      nRcdExists_1649 = (short)(0) ;
      nIsMod_1649 = (short)(0) ;
      nRcdDeleted_1649 = (short)(0) ;
      if ( ( CommonUtil.decimalVal( EvtGridId, ".").add(CommonUtil.decimalVal( EvtRowId, ".")).doubleValue() == 0 ) || ( 104 == CommonUtil.decimalVal( EvtGridId, ".").doubleValue() ) && ( DecimalUtil.compareTo(CommonUtil.decimalVal( EvtRowId, "."), CommonUtil.decimalVal( sGXsfl_104_idx, ".")) == 0 ) )
      {
         nBlankRcdCount1649 = (short)(nBlankRcdUsr1649+nBlankRcdCount1649) ;
      }
      fRowAdded = 0 ;
      while ( nBlankRcdCount1649 > 0 )
      {
         standaloneNotModal1HM1649( ) ;
         standaloneModal1HM1649( ) ;
         addRow1HM1649( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtCCColNom_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1649 = (short)(nBlankRcdCount1649-1) ;
      }
      Gx_mode = sMode1649 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* Restore parent mode. */
      Gx_mode = sMode1649 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      if ( ! isAjaxCallMode( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Grid4ContainerData"+"_"+sGXsfl_104_idx, Grid4Container.ToJavascriptSource());
      }
      if ( isAjaxCallMode( ) )
      {
         Grid3Row.AddGrid("Grid4", Grid4Container);
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Grid4ContainerData"+"V_"+sGXsfl_104_idx, Grid4Container.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Grid4ContainerData"+"V_"+sGXsfl_104_idx+"\" value='"+Grid4Container.GridValuesHidden()+"'/>") ;
      }
      Grid3Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Grid3Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Grid3Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Grid3Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Grid3Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Grid3Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Grid3Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Grid3Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Grid3Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      httpContext.ajax_sending_grid_row(Grid3Row);
      send_integrity_lvl_hashes1HM1648( ) ;
      GXCCtl = "Z11748TipArtiId_" + sGXsfl_104_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z11748TipArtiId, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRC_GXsfl_127_" + sGXsfl_104_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nGXsfl_127_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1648_" + sGXsfl_104_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1648, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1648_" + sGXsfl_104_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1648, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1648_" + sGXsfl_104_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1648, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "TIPARTIID_"+sGXsfl_104_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTipArtiId_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "TIPARTIDS_"+sGXsfl_104_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTipArtiDs_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      GRID4_nFirstRecordOnPage = 0 ;
      GRID4_nCurrentRecord = 0 ;
      /* End of Columns property logic. */
      Grid3Container.AddRow(Grid3Row);
   }

   public void readRow1HM1648( )
   {
      nGXsfl_104_idx = (int)(nGXsfl_104_idx+1) ;
      sGXsfl_104_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_104_idx), 4, 0), (short)(4), "0") + sGXsfl_81_idx ;
      subsflControlProps_1041648( ) ;
      edtTipArtiId_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TIPARTIID_"+sGXsfl_104_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtTipArtiDs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TIPARTIDS_"+sGXsfl_104_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTipArtiId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTipArtiId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "TIPARTIID_" + sGXsfl_104_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtTipArtiId_Internalname ;
         wbErr = true ;
         A11748TipArtiId = (short)(0) ;
      }
      else
      {
         A11748TipArtiId = (short)(localUtil.ctol( httpContext.cgiGet( edtTipArtiId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A11746TipArtiDs = httpContext.cgiGet( edtTipArtiDs_Internalname) ;
      GXCCtl = "Z11748TipArtiId_" + sGXsfl_104_idx ;
      Z11748TipArtiId = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRC_GXsfl_127_" + sGXsfl_104_idx ;
      nRC_GXsfl_127 = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdDeleted_1648_" + sGXsfl_104_idx ;
      nRcdDeleted_1648 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1648_" + sGXsfl_104_idx ;
      nRcdExists_1648 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1648_" + sGXsfl_104_idx ;
      nIsMod_1648 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRC_GXsfl_127_" + sGXsfl_104_idx ;
      nRC_GXsfl_127 = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void subsflControlProps_1271649( )
   {
      edtCCColNom_Internalname = "CCCOLNOM_"+sGXsfl_127_idx ;
      edtCCColNum_Internalname = "CCCOLNUM_"+sGXsfl_127_idx ;
      edtCCCTc_Internalname = "CCCTC_"+sGXsfl_127_idx ;
      lblTitleintensidades_Internalname = "TITLEINTENSIDADES_"+sGXsfl_127_idx ;
      subGrid5_Internalname = "GRID5_"+sGXsfl_127_idx ;
   }

   public void subsflControlProps_fel_1271649( )
   {
      edtCCColNom_Internalname = "CCCOLNOM_"+sGXsfl_127_fel_idx ;
      edtCCColNum_Internalname = "CCCOLNUM_"+sGXsfl_127_fel_idx ;
      edtCCCTc_Internalname = "CCCTC_"+sGXsfl_127_fel_idx ;
      lblTitleintensidades_Internalname = "TITLEINTENSIDADES_"+sGXsfl_127_fel_idx ;
      subGrid5_Internalname = "GRID5_"+sGXsfl_127_fel_idx ;
   }

   public void addRow1HM1649( )
   {
      nRC_GXsfl_155 = 0 ;
      nGXsfl_127_idx = (int)(nGXsfl_127_idx+1) ;
      sGXsfl_127_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_127_idx), 4, 0), (short)(4), "0") + sGXsfl_104_idx ;
      subsflControlProps_1271649( ) ;
      sendRow1HM1649( ) ;
   }

   public void sendRow1HM1649( )
   {
      Grid4Row = GXWebRow.GetNew(context) ;
      if ( subGrid4_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGrid4_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGrid4_Class, "") != 0 )
         {
            subGrid4_Linesclass = subGrid4_Class+"Odd" ;
         }
      }
      else if ( subGrid4_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGrid4_Backstyle = (byte)(0) ;
         subGrid4_Backcolor = subGrid4_Allbackcolor ;
         if ( GXutil.strcmp(subGrid4_Class, "") != 0 )
         {
            subGrid4_Linesclass = subGrid4_Class+"Uniform" ;
         }
      }
      else if ( subGrid4_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGrid4_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGrid4_Class, "") != 0 )
         {
            subGrid4_Linesclass = subGrid4_Class+"Odd" ;
         }
         subGrid4_Backcolor = (int)(0xFFFFFF) ;
      }
      else if ( subGrid4_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGrid4_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_127_idx) % (2))) == 0 )
         {
            subGrid4_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGrid4_Class, "") != 0 )
            {
               subGrid4_Linesclass = subGrid4_Class+"Even" ;
            }
         }
         else
         {
            subGrid4_Backcolor = (int)(0xFFFFFF) ;
            if ( GXutil.strcmp(subGrid4_Class, "") != 0 )
            {
               subGrid4_Linesclass = subGrid4_Class+"Odd" ;
            }
         }
      }
      /* Start of Columns property logic. */
      if ( Grid4Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<tr"+" class=\""+subGrid4_Linesclass+"\" style=\""+""+"\""+" data-gxrow=\""+sGXsfl_127_idx+"\">") ;
      }
      if ( GRID4_IsPaging == 0 )
      {
         GXCCtl = "GRID5_nFirstRecordOnPage_" + sGXsfl_127_idx ;
         GRID5_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
      }
      else
      {
         GRID5_nFirstRecordOnPage = 0 ;
      }
      /* Div Control */
      Grid4Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {divGridtable4_Internalname+"_"+sGXsfl_127_idx,Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","Table","left","top","","","div"});
      /* Div Control */
      Grid4Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","row","left","top","","","div"});
      /* Div Control */
      Grid4Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-xs-12","left","top","","","div"});
      /* Div Control */
      Grid4Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {divTable5_Internalname+"_"+sGXsfl_127_idx,Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","LevelTable","left","top","","","div"});
      /* Div Control */
      Grid4Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","row","left","top","","","div"});
      /* Div Control */
      Grid4Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-xs-12 FormCellAdvanced","left","top","","","div"});
      /* Div Control */
      Grid4Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","form-group gx-form-group","left","top",""+" data-gx-for=\""+edtCCColNom_Internalname+"\"","","div"});
      /* Attribute/Variable Label */
      Grid4Row.AddColumnProperties("html_label", -1, isAjaxCallMode( ), new Object[] {edtCCColNom_Internalname,httpContext.getMessage( "Color", ""),"col-sm-3 AttributeLabel",Integer.valueOf(1),Boolean.valueOf(true),""});
      /* Div Control */
      Grid4Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-sm-9 gx-attribute","left","top","","","div"});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1649_" + sGXsfl_127_idx + "',1);gx.fn.setControlValue('nIsMod_1648_" + sGXsfl_104_idx + "',1);gx.fn.setControlValue('nIsMod_1642_" + sGXsfl_81_idx + "',1);gx.fn.setControlValue('nIsMod_1534_" + sGXsfl_58_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 136,'',false,'" + sGXsfl_127_idx + "',127)\"" ;
      ROClassString = "Attribute" ;
      Grid4Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCCColNom_Internalname,GXutil.rtrim( A11737CCColNom),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,136);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCCColNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtCCColNom_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(13),"chr",Integer.valueOf(1),"row",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(127),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      Grid4Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Grid4Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Grid4Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Grid4Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      /* Div Control */
      Grid4Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","row","left","top","","","div"});
      /* Div Control */
      Grid4Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-xs-12 FormCell","left","top","","","div"});
      /* Div Control */
      Grid4Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","form-group gx-form-group","left","top",""+" data-gx-for=\""+edtCCColNum_Internalname+"\"","","div"});
      /* Attribute/Variable Label */
      Grid4Row.AddColumnProperties("html_label", -1, isAjaxCallMode( ), new Object[] {edtCCColNum_Internalname,httpContext.getMessage( "Numero Color", ""),"col-sm-3 AttributeLabel",Integer.valueOf(1),Boolean.valueOf(true),""});
      /* Div Control */
      Grid4Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-sm-9 gx-attribute","left","top","","","div"});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1649_" + sGXsfl_127_idx + "',1);gx.fn.setControlValue('nIsMod_1648_" + sGXsfl_104_idx + "',1);gx.fn.setControlValue('nIsMod_1642_" + sGXsfl_81_idx + "',1);gx.fn.setControlValue('nIsMod_1534_" + sGXsfl_58_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 141,'',false,'" + sGXsfl_127_idx + "',127)\"" ;
      ROClassString = "Attribute" ;
      Grid4Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCCColNum_Internalname,GXutil.ltrim( localUtil.ntoc( A11738CCColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A11738CCColNum), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,141);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCCColNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtCCColNum_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(6),"chr",Integer.valueOf(1),"row",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(127),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid4Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Grid4Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Grid4Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Grid4Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      /* Div Control */
      Grid4Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","row","left","top","","","div"});
      /* Div Control */
      Grid4Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-xs-12 FormCell","left","top","","","div"});
      /* Div Control */
      Grid4Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","form-group gx-form-group","left","top",""+" data-gx-for=\""+edtCCCTc_Internalname+"\"","","div"});
      /* Attribute/Variable Label */
      Grid4Row.AddColumnProperties("html_label", -1, isAjaxCallMode( ), new Object[] {edtCCCTc_Internalname,httpContext.getMessage( "Tc", ""),"col-sm-3 AttributeLabel",Integer.valueOf(1),Boolean.valueOf(true),""});
      /* Div Control */
      Grid4Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-sm-9 gx-attribute","left","top","","","div"});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1649_" + sGXsfl_127_idx + "',1);gx.fn.setControlValue('nIsMod_1648_" + sGXsfl_104_idx + "',1);gx.fn.setControlValue('nIsMod_1642_" + sGXsfl_81_idx + "',1);gx.fn.setControlValue('nIsMod_1534_" + sGXsfl_58_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 146,'',false,'" + sGXsfl_127_idx + "',127)\"" ;
      ROClassString = "Attribute" ;
      Grid4Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCCCTc_Internalname,GXutil.ltrim( localUtil.ntoc( A11749CCCTc, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A11749CCCTc), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,146);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCCCTc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtCCCTc_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(2),"chr",Integer.valueOf(1),"row",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(127),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid4Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Grid4Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Grid4Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Grid4Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      /* Div Control */
      Grid4Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","row","left","top","","","div"});
      /* Div Control */
      Grid4Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-xs-12 col-sm-9 col-sm-offset-3 LevelTable","left","top","","","div"});
      /* Div Control */
      Grid4Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {divIntensidadestable_Internalname+"_"+sGXsfl_127_idx,Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","LevelTable","left","top","","","div"});
      /* Div Control */
      Grid4Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","row","left","top","","","div"});
      /* Div Control */
      Grid4Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-xs-12 FormCell","left","top","","","div"});
      /* Text block */
      Grid4Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTitleintensidades_Internalname,httpContext.getMessage( "Intensidades", ""),"","",lblTitleintensidades_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","Title",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid4Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Grid4Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      /* Div Control */
      Grid4Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","row","left","top","","","div"});
      /* Div Control */
      Grid4Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-xs-12","left","top","","","div"});
      /*  Child Grid Control  */
      Grid4Row.AddColumnProperties("subfile", -1, isAjaxCallMode( ), new Object[] {"Grid5Container"});
      if ( isAjaxCallMode( ) )
      {
         Grid5Container = new com.genexus.webpanels.GXWebGrid(context);
      }
      else
      {
         Grid5Container.Clear();
      }
      startgridcontrol155( ) ;
      /* Save parent mode. */
      sMode1650 = Gx_mode ;
      nGXsfl_155_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1650 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1650 = (short)(1) ;
            scanStart1HM1650( ) ;
            while ( RcdFound1650 != 0 )
            {
               init_level_properties1650( ) ;
               getByPrimaryKey1HM1650( ) ;
               addRow1HM1650( ) ;
               scanNext1HM1650( ) ;
            }
            scanEnd1HM1650( ) ;
            nBlankRcdCount1650 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal1HM1650( ) ;
         standaloneModal1HM1650( ) ;
         sMode1650 = Gx_mode ;
         while ( nGXsfl_155_idx < nRC_GXsfl_155 )
         {
            bGXsfl_155_Refreshing = true ;
            readRow1HM1650( ) ;
            edtIntId_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "INTID_"+sGXsfl_155_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtIntId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtIntId_Enabled), 5, 0), !bGXsfl_155_Refreshing);
            edtIntDs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "INTDS_"+sGXsfl_155_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtIntDs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtIntDs_Enabled), 5, 0), !bGXsfl_155_Refreshing);
            if ( ( nRcdExists_1650 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1HM1650( ) ;
            }
            sendRow1HM1650( ) ;
            bGXsfl_155_Refreshing = false ;
         }
         Gx_mode = sMode1650 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1650 = (short)(5) ;
         nRcdExists_1650 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1HM1650( ) ;
            while ( RcdFound1650 != 0 )
            {
               sGXsfl_155_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_155_idx+1), 4, 0), (short)(4), "0") + sGXsfl_127_idx ;
               subsflControlProps_1551650( ) ;
               init_level_properties1650( ) ;
               standaloneNotModal1HM1650( ) ;
               getByPrimaryKey1HM1650( ) ;
               standaloneModal1HM1650( ) ;
               addRow1HM1650( ) ;
               scanNext1HM1650( ) ;
            }
            scanEnd1HM1650( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1650 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_155_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_155_idx+1), 4, 0), (short)(4), "0") + sGXsfl_127_idx ;
      subsflControlProps_1551650( ) ;
      initAll1HM1650( ) ;
      init_level_properties1650( ) ;
      nRcdExists_1650 = (short)(0) ;
      nIsMod_1650 = (short)(0) ;
      nRcdDeleted_1650 = (short)(0) ;
      if ( ( CommonUtil.decimalVal( EvtGridId, ".").add(CommonUtil.decimalVal( EvtRowId, ".")).doubleValue() == 0 ) || ( 127 == CommonUtil.decimalVal( EvtGridId, ".").doubleValue() ) && ( DecimalUtil.compareTo(CommonUtil.decimalVal( EvtRowId, "."), CommonUtil.decimalVal( sGXsfl_127_idx, ".")) == 0 ) )
      {
         nBlankRcdCount1650 = (short)(nBlankRcdUsr1650+nBlankRcdCount1650) ;
      }
      fRowAdded = 0 ;
      while ( nBlankRcdCount1650 > 0 )
      {
         standaloneNotModal1HM1650( ) ;
         standaloneModal1HM1650( ) ;
         addRow1HM1650( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtIntId_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1650 = (short)(nBlankRcdCount1650-1) ;
      }
      Gx_mode = sMode1650 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* Restore parent mode. */
      Gx_mode = sMode1650 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      if ( ! isAjaxCallMode( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Grid5ContainerData"+"_"+sGXsfl_127_idx, Grid5Container.ToJavascriptSource());
      }
      if ( isAjaxCallMode( ) )
      {
         Grid4Row.AddGrid("Grid5", Grid5Container);
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Grid5ContainerData"+"V_"+sGXsfl_127_idx, Grid5Container.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Grid5ContainerData"+"V_"+sGXsfl_127_idx+"\" value='"+Grid5Container.GridValuesHidden()+"'/>") ;
      }
      Grid4Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Grid4Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Grid4Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Grid4Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Grid4Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Grid4Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Grid4Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Grid4Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Grid4Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      httpContext.ajax_sending_grid_row(Grid4Row);
      send_integrity_lvl_hashes1HM1649( ) ;
      GXCCtl = "Z11737CCColNom_" + sGXsfl_127_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z11737CCColNom));
      GXCCtl = "Z11738CCColNum_" + sGXsfl_127_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z11738CCColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z11749CCCTc_" + sGXsfl_127_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z11749CCCTc, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRC_GXsfl_155_" + sGXsfl_127_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nGXsfl_155_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1649_" + sGXsfl_127_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1649, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1649_" + sGXsfl_127_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1649, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1649_" + sGXsfl_127_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1649, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CCCOLNOM_"+sGXsfl_127_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCColNom_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CCCOLNUM_"+sGXsfl_127_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCColNum_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CCCTC_"+sGXsfl_127_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCCTc_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      GRID5_nFirstRecordOnPage = 0 ;
      GRID5_nCurrentRecord = 0 ;
      /* End of Columns property logic. */
      Grid4Container.AddRow(Grid4Row);
   }

   public void readRow1HM1649( )
   {
      nGXsfl_127_idx = (int)(nGXsfl_127_idx+1) ;
      sGXsfl_127_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_127_idx), 4, 0), (short)(4), "0") + sGXsfl_104_idx ;
      subsflControlProps_1271649( ) ;
      edtCCColNom_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CCCOLNOM_"+sGXsfl_127_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCCColNum_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CCCOLNUM_"+sGXsfl_127_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCCCTc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CCCTC_"+sGXsfl_127_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A11737CCColNom = httpContext.cgiGet( edtCCColNom_Internalname) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCCColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCCColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
      {
         GXCCtl = "CCCOLNUM_" + sGXsfl_127_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtCCColNum_Internalname ;
         wbErr = true ;
         A11738CCColNum = 0 ;
      }
      else
      {
         A11738CCColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtCCColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCCCTc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCCCTc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
      {
         GXCCtl = "CCCTC_" + sGXsfl_127_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtCCCTc_Internalname ;
         wbErr = true ;
         A11749CCCTc = (byte)(0) ;
      }
      else
      {
         A11749CCCTc = (byte)(localUtil.ctol( httpContext.cgiGet( edtCCCTc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      GXCCtl = "Z11737CCColNom_" + sGXsfl_127_idx ;
      Z11737CCColNom = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z11738CCColNum_" + sGXsfl_127_idx ;
      Z11738CCColNum = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z11749CCCTc_" + sGXsfl_127_idx ;
      Z11749CCCTc = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRC_GXsfl_155_" + sGXsfl_127_idx ;
      nRC_GXsfl_155 = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdDeleted_1649_" + sGXsfl_127_idx ;
      nRcdDeleted_1649 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1649_" + sGXsfl_127_idx ;
      nRcdExists_1649 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1649_" + sGXsfl_127_idx ;
      nIsMod_1649 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRC_GXsfl_155_" + sGXsfl_127_idx ;
      nRC_GXsfl_155 = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void subsflControlProps_1551650( )
   {
      edtIntId_Internalname = "INTID_"+sGXsfl_155_idx ;
      edtIntDs_Internalname = "INTDS_"+sGXsfl_155_idx ;
      lblTitlecontroles_Internalname = "TITLECONTROLES_"+sGXsfl_155_idx ;
      subGridtcccc_qualityrequeriments_articulos_tiposarticulo_colores_intensidades_controles_Internalname = "GRIDTCCCC_QUALITYREQUERIMENTS_ARTICULOS_TIPOSARTICULO_COLORES_INTENSIDADES_CONTROLES_"+sGXsfl_155_idx ;
   }

   public void subsflControlProps_fel_1551650( )
   {
      edtIntId_Internalname = "INTID_"+sGXsfl_155_fel_idx ;
      edtIntDs_Internalname = "INTDS_"+sGXsfl_155_fel_idx ;
      lblTitlecontroles_Internalname = "TITLECONTROLES_"+sGXsfl_155_fel_idx ;
      subGridtcccc_qualityrequeriments_articulos_tiposarticulo_colores_intensidades_controles_Internalname = "GRIDTCCCC_QUALITYREQUERIMENTS_ARTICULOS_TIPOSARTICULO_COLORES_INTENSIDADES_CONTROLES_"+sGXsfl_155_fel_idx ;
   }

   public void addRow1HM1650( )
   {
      nRC_GXsfl_178 = 0 ;
      nGXsfl_155_idx = (int)(nGXsfl_155_idx+1) ;
      sGXsfl_155_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_155_idx), 4, 0), (short)(4), "0") + sGXsfl_127_idx ;
      subsflControlProps_1551650( ) ;
      sendRow1HM1650( ) ;
   }

   public void sendRow1HM1650( )
   {
      Grid5Row = GXWebRow.GetNew(context) ;
      if ( subGrid5_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGrid5_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGrid5_Class, "") != 0 )
         {
            subGrid5_Linesclass = subGrid5_Class+"Odd" ;
         }
      }
      else if ( subGrid5_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGrid5_Backstyle = (byte)(0) ;
         subGrid5_Backcolor = subGrid5_Allbackcolor ;
         if ( GXutil.strcmp(subGrid5_Class, "") != 0 )
         {
            subGrid5_Linesclass = subGrid5_Class+"Uniform" ;
         }
      }
      else if ( subGrid5_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGrid5_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGrid5_Class, "") != 0 )
         {
            subGrid5_Linesclass = subGrid5_Class+"Odd" ;
         }
         subGrid5_Backcolor = (int)(0xFFFFFF) ;
      }
      else if ( subGrid5_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGrid5_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_155_idx) % (2))) == 0 )
         {
            subGrid5_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGrid5_Class, "") != 0 )
            {
               subGrid5_Linesclass = subGrid5_Class+"Even" ;
            }
         }
         else
         {
            subGrid5_Backcolor = (int)(0xFFFFFF) ;
            if ( GXutil.strcmp(subGrid5_Class, "") != 0 )
            {
               subGrid5_Linesclass = subGrid5_Class+"Odd" ;
            }
         }
      }
      /* Start of Columns property logic. */
      if ( Grid5Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<tr"+" class=\""+subGrid5_Linesclass+"\" style=\""+""+"\""+" data-gxrow=\""+sGXsfl_155_idx+"\">") ;
      }
      if ( GRID5_IsPaging == 0 )
      {
         GXCCtl = "GRIDTCCCC_QUALITYREQUERIMENTS_ARTICULOS_TIPOSARTICULO_COLORES_INTENSIDADES_CONTROLES_nFirstRecordOnPage_" + sGXsfl_155_idx ;
         GRIDTCCCC_QUALITYREQUERIMENTS_ARTICULOS_TIPOSARTICULO_COLORES_INTENSIDADES_CONTROLES_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
      }
      else
      {
         GRIDTCCCC_QUALITYREQUERIMENTS_ARTICULOS_TIPOSARTICULO_COLORES_INTENSIDADES_CONTROLES_nFirstRecordOnPage = 0 ;
      }
      /* Div Control */
      Grid5Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {divGridtable5_Internalname+"_"+sGXsfl_155_idx,Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","Table","left","top","","","div"});
      /* Div Control */
      Grid5Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","row","left","top","","","div"});
      /* Div Control */
      Grid5Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-xs-12","left","top","","","div"});
      /* Div Control */
      Grid5Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {divTable6_Internalname+"_"+sGXsfl_155_idx,Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","LevelTable","left","top","","","div"});
      /* Div Control */
      Grid5Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","row","left","top","","","div"});
      /* Div Control */
      Grid5Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-xs-12 FormCellAdvanced","left","top","","","div"});
      /* Div Control */
      Grid5Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","form-group gx-form-group","left","top",""+" data-gx-for=\""+edtIntId_Internalname+"\"","","div"});
      /* Attribute/Variable Label */
      Grid5Row.AddColumnProperties("html_label", -1, isAjaxCallMode( ), new Object[] {edtIntId_Internalname,httpContext.getMessage( "Codigo Intensidad", ""),"col-sm-3 AttributeLabel",Integer.valueOf(1),Boolean.valueOf(true),""});
      /* Div Control */
      Grid5Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-sm-9 gx-attribute","left","top","","","div"});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1650_" + sGXsfl_155_idx + "',1);gx.fn.setControlValue('nIsMod_1649_" + sGXsfl_127_idx + "',1);gx.fn.setControlValue('nIsMod_1648_" + sGXsfl_104_idx + "',1);gx.fn.setControlValue('nIsMod_1642_" + sGXsfl_81_idx + "',1);gx.fn.setControlValue('nIsMod_1534_" + sGXsfl_58_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 164,'',false,'" + sGXsfl_155_idx + "',155)\"" ;
      ROClassString = "Attribute" ;
      Grid5Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtIntId_Internalname,GXutil.ltrim( localUtil.ntoc( A11750IntId, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A11750IntId), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,164);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtIntId_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtIntId_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(4),"chr",Integer.valueOf(1),"row",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(155),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid5Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Grid5Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Grid5Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Grid5Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      /* Div Control */
      Grid5Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","row","left","top","","","div"});
      /* Div Control */
      Grid5Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-xs-12 FormCell","left","top","","","div"});
      /* Div Control */
      Grid5Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","form-group gx-form-group","left","top",""+" data-gx-for=\""+edtIntDs_Internalname+"\"","","div"});
      /* Attribute/Variable Label */
      Grid5Row.AddColumnProperties("html_label", -1, isAjaxCallMode( ), new Object[] {edtIntDs_Internalname,httpContext.getMessage( "Descripcion", ""),"col-sm-3 AttributeLabel",Integer.valueOf(1),Boolean.valueOf(true),""});
      /* Div Control */
      Grid5Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-sm-9 gx-attribute","left","top","","","div"});
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid5Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtIntDs_Internalname,GXutil.rtrim( A11747IntDs),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtIntDs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtIntDs_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(30),"chr",Integer.valueOf(1),"row",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(155),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      Grid5Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Grid5Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Grid5Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Grid5Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      /* Div Control */
      Grid5Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","row","left","top","","","div"});
      /* Div Control */
      Grid5Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-xs-12 col-sm-9 col-sm-offset-3 LevelTable","left","top","","","div"});
      /* Div Control */
      Grid5Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {divControlestable_Internalname+"_"+sGXsfl_155_idx,Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","LevelTable","left","top","","","div"});
      /* Div Control */
      Grid5Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","row","left","top","","","div"});
      /* Div Control */
      Grid5Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-xs-12 FormCell","left","top","","","div"});
      /* Text block */
      Grid5Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTitlecontroles_Internalname,httpContext.getMessage( "Controles", ""),"","",lblTitlecontroles_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","Title",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid5Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Grid5Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      /* Div Control */
      Grid5Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","row","left","top","","","div"});
      /* Div Control */
      Grid5Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-xs-12","left","top","","","div"});
      /*  Child Grid Control  */
      Grid5Row.AddColumnProperties("subfile", -1, isAjaxCallMode( ), new Object[] {"Gridtcccc_qualityrequeriments_articulos_tiposarticulo_colores_intensidades_controlesContainer"});
      if ( isAjaxCallMode( ) )
      {
         Gridtcccc_qualityrequeriments_articulos_tiposarticulo_colores_intensidades_controlesContainer = new com.genexus.webpanels.GXWebGrid(context);
      }
      else
      {
         Gridtcccc_qualityrequeriments_articulos_tiposarticulo_colores_intensidades_controlesContainer.Clear();
      }
      startgridcontrol178( ) ;
      nGXsfl_178_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1651 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1651 = (short)(1) ;
            scanStart1HM1651( ) ;
            while ( RcdFound1651 != 0 )
            {
               init_level_properties1651( ) ;
               getByPrimaryKey1HM1651( ) ;
               addRow1HM1651( ) ;
               scanNext1HM1651( ) ;
            }
            scanEnd1HM1651( ) ;
            nBlankRcdCount1651 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal1HM1651( ) ;
         standaloneModal1HM1651( ) ;
         sMode1651 = Gx_mode ;
         while ( nGXsfl_178_idx < nRC_GXsfl_178 )
         {
            bGXsfl_178_Refreshing = true ;
            readRow1HM1651( ) ;
            edtCCTCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CCTCOD_"+sGXsfl_178_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCTCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTCod_Enabled), 5, 0), !bGXsfl_178_Refreshing);
            edtCCTDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CCTDSC_"+sGXsfl_178_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCTDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTDsc_Enabled), 5, 0), !bGXsfl_178_Refreshing);
            if ( ( nRcdExists_1651 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1HM1651( ) ;
            }
            sendRow1HM1651( ) ;
            bGXsfl_178_Refreshing = false ;
         }
         Gx_mode = sMode1651 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1651 = (short)(5) ;
         nRcdExists_1651 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1HM1651( ) ;
            while ( RcdFound1651 != 0 )
            {
               sGXsfl_178_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_178_idx+1), 4, 0), (short)(4), "0") + sGXsfl_155_idx ;
               subsflControlProps_1781651( ) ;
               init_level_properties1651( ) ;
               standaloneNotModal1HM1651( ) ;
               getByPrimaryKey1HM1651( ) ;
               standaloneModal1HM1651( ) ;
               addRow1HM1651( ) ;
               scanNext1HM1651( ) ;
            }
            scanEnd1HM1651( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1651 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_178_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_178_idx+1), 4, 0), (short)(4), "0") + sGXsfl_155_idx ;
      subsflControlProps_1781651( ) ;
      initAll1HM1651( ) ;
      init_level_properties1651( ) ;
      nRcdExists_1651 = (short)(0) ;
      nIsMod_1651 = (short)(0) ;
      nRcdDeleted_1651 = (short)(0) ;
      if ( ( CommonUtil.decimalVal( EvtGridId, ".").add(CommonUtil.decimalVal( EvtRowId, ".")).doubleValue() == 0 ) || ( 155 == CommonUtil.decimalVal( EvtGridId, ".").doubleValue() ) && ( DecimalUtil.compareTo(CommonUtil.decimalVal( EvtRowId, "."), CommonUtil.decimalVal( sGXsfl_155_idx, ".")) == 0 ) )
      {
         nBlankRcdCount1651 = (short)(nBlankRcdUsr1651+nBlankRcdCount1651) ;
      }
      fRowAdded = 0 ;
      while ( nBlankRcdCount1651 > 0 )
      {
         standaloneNotModal1HM1651( ) ;
         standaloneModal1HM1651( ) ;
         addRow1HM1651( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtCCTCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1651 = (short)(nBlankRcdCount1651-1) ;
      }
      Gx_mode = sMode1651 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      if ( ! isAjaxCallMode( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridtcccc_qualityrequeriments_articulos_tiposarticulo_colores_intensidades_controlesContainerData"+"_"+sGXsfl_155_idx, Gridtcccc_qualityrequeriments_articulos_tiposarticulo_colores_intensidades_controlesContainer.ToJavascriptSource());
      }
      if ( isAjaxCallMode( ) )
      {
         Grid5Row.AddGrid("Gridtcccc_qualityrequeriments_articulos_tiposarticulo_colores_intensidades_controles", Gridtcccc_qualityrequeriments_articulos_tiposarticulo_colores_intensidades_controlesContainer);
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridtcccc_qualityrequeriments_articulos_tiposarticulo_colores_intensidades_controlesContainerData"+"V_"+sGXsfl_155_idx, Gridtcccc_qualityrequeriments_articulos_tiposarticulo_colores_intensidades_controlesContainer.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Gridtcccc_qualityrequeriments_articulos_tiposarticulo_colores_intensidades_controlesContainerData"+"V_"+sGXsfl_155_idx+"\" value='"+Gridtcccc_qualityrequeriments_articulos_tiposarticulo_colores_intensidades_controlesContainer.GridValuesHidden()+"'/>") ;
      }
      Grid5Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Grid5Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Grid5Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Grid5Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Grid5Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Grid5Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Grid5Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Grid5Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Grid5Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      httpContext.ajax_sending_grid_row(Grid5Row);
      send_integrity_lvl_hashes1HM1650( ) ;
      GXCCtl = "Z11750IntId_" + sGXsfl_155_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z11750IntId, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRC_GXsfl_178_" + sGXsfl_155_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nGXsfl_178_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1650_" + sGXsfl_155_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1650, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1650_" + sGXsfl_155_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1650, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1650_" + sGXsfl_155_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1650, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "INTID_"+sGXsfl_155_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtIntId_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "INTDS_"+sGXsfl_155_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtIntDs_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      GRIDTCCCC_QUALITYREQUERIMENTS_ARTICULOS_TIPOSARTICULO_COLORES_INTENSIDADES_CONTROLES_nFirstRecordOnPage = 0 ;
      GRIDTCCCC_QUALITYREQUERIMENTS_ARTICULOS_TIPOSARTICULO_COLORES_INTENSIDADES_CONTROLES_nCurrentRecord = 0 ;
      /* End of Columns property logic. */
      Grid5Container.AddRow(Grid5Row);
   }

   public void readRow1HM1650( )
   {
      nGXsfl_155_idx = (int)(nGXsfl_155_idx+1) ;
      sGXsfl_155_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_155_idx), 4, 0), (short)(4), "0") + sGXsfl_127_idx ;
      subsflControlProps_1551650( ) ;
      edtIntId_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "INTID_"+sGXsfl_155_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtIntDs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "INTDS_"+sGXsfl_155_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtIntId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtIntId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "INTID_" + sGXsfl_155_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtIntId_Internalname ;
         wbErr = true ;
         A11750IntId = (short)(0) ;
      }
      else
      {
         A11750IntId = (short)(localUtil.ctol( httpContext.cgiGet( edtIntId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A11747IntDs = httpContext.cgiGet( edtIntDs_Internalname) ;
      GXCCtl = "Z11750IntId_" + sGXsfl_155_idx ;
      Z11750IntId = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRC_GXsfl_178_" + sGXsfl_155_idx ;
      nRC_GXsfl_178 = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdDeleted_1650_" + sGXsfl_155_idx ;
      nRcdDeleted_1650 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1650_" + sGXsfl_155_idx ;
      nRcdExists_1650 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1650_" + sGXsfl_155_idx ;
      nIsMod_1650 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRC_GXsfl_178_" + sGXsfl_155_idx ;
      nRC_GXsfl_178 = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void subsflControlProps_1781651( )
   {
      edtCCTCod_Internalname = "CCTCOD_"+sGXsfl_178_idx ;
      edtCCTDsc_Internalname = "CCTDSC_"+sGXsfl_178_idx ;
   }

   public void subsflControlProps_fel_1781651( )
   {
      edtCCTCod_Internalname = "CCTCOD_"+sGXsfl_178_fel_idx ;
      edtCCTDsc_Internalname = "CCTDSC_"+sGXsfl_178_fel_idx ;
   }

   public void addRow1HM1651( )
   {
      nGXsfl_178_idx = (int)(nGXsfl_178_idx+1) ;
      sGXsfl_178_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_178_idx), 4, 0), (short)(4), "0") + sGXsfl_155_idx ;
      subsflControlProps_1781651( ) ;
      sendRow1HM1651( ) ;
   }

   public void sendRow1HM1651( )
   {
      Gridtcccc_qualityrequeriments_articulos_tiposarticulo_colores_intensidades_controlesRow = GXWebRow.GetNew(context) ;
      if ( subGridtcccc_qualityrequeriments_articulos_tiposarticulo_colores_intensidades_controles_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGridtcccc_qualityrequeriments_articulos_tiposarticulo_colores_intensidades_controles_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGridtcccc_qualityrequeriments_articulos_tiposarticulo_colores_intensidades_controles_Class, "") != 0 )
         {
            subGridtcccc_qualityrequeriments_articulos_tiposarticulo_colores_intensidades_controles_Linesclass = subGridtcccc_qualityrequeriments_articulos_tiposarticulo_colores_intensidades_controles_Class+"Odd" ;
         }
      }
      else if ( subGridtcccc_qualityrequeriments_articulos_tiposarticulo_colores_intensidades_controles_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGridtcccc_qualityrequeriments_articulos_tiposarticulo_colores_intensidades_controles_Backstyle = (byte)(0) ;
         subGridtcccc_qualityrequeriments_articulos_tiposarticulo_colores_intensidades_controles_Backcolor = subGridtcccc_qualityrequeriments_articulos_tiposarticulo_colores_intensidades_controles_Allbackcolor ;
         if ( GXutil.strcmp(subGridtcccc_qualityrequeriments_articulos_tiposarticulo_colores_intensidades_controles_Class, "") != 0 )
         {
            subGridtcccc_qualityrequeriments_articulos_tiposarticulo_colores_intensidades_controles_Linesclass = subGridtcccc_qualityrequeriments_articulos_tiposarticulo_colores_intensidades_controles_Class+"Uniform" ;
         }
      }
      else if ( subGridtcccc_qualityrequeriments_articulos_tiposarticulo_colores_intensidades_controles_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGridtcccc_qualityrequeriments_articulos_tiposarticulo_colores_intensidades_controles_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGridtcccc_qualityrequeriments_articulos_tiposarticulo_colores_intensidades_controles_Class, "") != 0 )
         {
            subGridtcccc_qualityrequeriments_articulos_tiposarticulo_colores_intensidades_controles_Linesclass = subGridtcccc_qualityrequeriments_articulos_tiposarticulo_colores_intensidades_controles_Class+"Odd" ;
         }
         subGridtcccc_qualityrequeriments_articulos_tiposarticulo_colores_intensidades_controles_Backcolor = (int)(0x0) ;
      }
      else if ( subGridtcccc_qualityrequeriments_articulos_tiposarticulo_colores_intensidades_controles_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGridtcccc_qualityrequeriments_articulos_tiposarticulo_colores_intensidades_controles_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_178_idx) % (2))) == 0 )
         {
            subGridtcccc_qualityrequeriments_articulos_tiposarticulo_colores_intensidades_controles_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridtcccc_qualityrequeriments_articulos_tiposarticulo_colores_intensidades_controles_Class, "") != 0 )
            {
               subGridtcccc_qualityrequeriments_articulos_tiposarticulo_colores_intensidades_controles_Linesclass = subGridtcccc_qualityrequeriments_articulos_tiposarticulo_colores_intensidades_controles_Class+"Even" ;
            }
         }
         else
         {
            subGridtcccc_qualityrequeriments_articulos_tiposarticulo_colores_intensidades_controles_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridtcccc_qualityrequeriments_articulos_tiposarticulo_colores_intensidades_controles_Class, "") != 0 )
            {
               subGridtcccc_qualityrequeriments_articulos_tiposarticulo_colores_intensidades_controles_Linesclass = subGridtcccc_qualityrequeriments_articulos_tiposarticulo_colores_intensidades_controles_Class+"Odd" ;
            }
         }
      }
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1651_" + sGXsfl_178_idx + "',1);gx.fn.setControlValue('nIsMod_1650_" + sGXsfl_155_idx + "',1);gx.fn.setControlValue('nIsMod_1649_" + sGXsfl_127_idx + "',1);gx.fn.setControlValue('nIsMod_1648_" + sGXsfl_104_idx + "',1);gx.fn.setControlValue('nIsMod_1642_" + sGXsfl_81_idx + "',1);gx.fn.setControlValue('nIsMod_1534_" + sGXsfl_58_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 179,'',false,'" + sGXsfl_178_idx + "',178)\"" ;
      ROClassString = "Attribute" ;
      Gridtcccc_qualityrequeriments_articulos_tiposarticulo_colores_intensidades_controlesRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCCTCod_Internalname,GXutil.ltrim( localUtil.ntoc( A4031CCTCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4031CCTCod), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,179);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCCTCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtCCTCod_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(178),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridtcccc_qualityrequeriments_articulos_tiposarticulo_colores_intensidades_controlesRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCCTDsc_Internalname,GXutil.rtrim( A4036CCTDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCCTDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtCCTDsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(178),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Gridtcccc_qualityrequeriments_articulos_tiposarticulo_colores_intensidades_controlesRow);
      send_integrity_lvl_hashes1HM1651( ) ;
      GXCCtl = "Z4031CCTCod_" + sGXsfl_178_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z4031CCTCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1651_" + sGXsfl_178_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1651, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1651_" + sGXsfl_178_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1651, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1651_" + sGXsfl_178_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1651, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CCTCOD_"+sGXsfl_178_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCTCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CCTDSC_"+sGXsfl_178_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCTDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Gridtcccc_qualityrequeriments_articulos_tiposarticulo_colores_intensidades_controlesContainer.AddRow(Gridtcccc_qualityrequeriments_articulos_tiposarticulo_colores_intensidades_controlesRow);
   }

   public void readRow1HM1651( )
   {
      nGXsfl_178_idx = (int)(nGXsfl_178_idx+1) ;
      sGXsfl_178_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_178_idx), 4, 0), (short)(4), "0") + sGXsfl_155_idx ;
      subsflControlProps_1781651( ) ;
      edtCCTCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CCTCOD_"+sGXsfl_178_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCCTDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CCTDSC_"+sGXsfl_178_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCCTCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCCTCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
      {
         GXCCtl = "CCTCOD_" + sGXsfl_178_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtCCTCod_Internalname ;
         wbErr = true ;
         A4031CCTCod = 0 ;
      }
      else
      {
         A4031CCTCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCCTCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A4036CCTDsc = httpContext.cgiGet( edtCCTDsc_Internalname) ;
      GXCCtl = "Z4031CCTCod_" + sGXsfl_178_idx ;
      Z4031CCTCod = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdDeleted_1651_" + sGXsfl_178_idx ;
      nRcdDeleted_1651 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1651_" + sGXsfl_178_idx ;
      nRcdExists_1651 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1651_" + sGXsfl_178_idx ;
      nIsMod_1651 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtCCArtCod_Enabled = edtCCArtCod_Enabled ;
      defedtTipArtiId_Enabled = edtTipArtiId_Enabled ;
      defedtCCCTc_Enabled = edtCCCTc_Enabled ;
      defedtCCColNum_Enabled = edtCCColNum_Enabled ;
      defedtCCColNom_Enabled = edtCCColNom_Enabled ;
      defedtIntId_Enabled = edtIntId_Enabled ;
      defedtCCTCod_Enabled = edtCCTCod_Enabled ;
      defedtTb1_Cod_Enabled = edtTb1_Cod_Enabled ;
   }

   public void confirmValues1HM0( )
   {
      nGXsfl_178_idx = 0 ;
      sGXsfl_178_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_178_idx), 4, 0), (short)(4), "0") + sGXsfl_155_idx ;
      subsflControlProps_1781651( ) ;
      while ( nGXsfl_178_idx < nRC_GXsfl_178 )
      {
         nGXsfl_178_idx = (int)(nGXsfl_178_idx+1) ;
         sGXsfl_178_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_178_idx), 4, 0), (short)(4), "0") + sGXsfl_155_idx ;
         subsflControlProps_1781651( ) ;
         httpContext.changePostValue( "Z4031CCTCod_"+sGXsfl_178_idx, httpContext.cgiGet( "ZT_"+"Z4031CCTCod_"+sGXsfl_178_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4031CCTCod_"+sGXsfl_178_idx) ;
      }
      nGXsfl_155_idx = 0 ;
      sGXsfl_155_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_155_idx), 4, 0), (short)(4), "0") + sGXsfl_127_idx ;
      subsflControlProps_1551650( ) ;
      while ( nGXsfl_155_idx < nRC_GXsfl_155 )
      {
         nGXsfl_155_idx = (int)(nGXsfl_155_idx+1) ;
         sGXsfl_155_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_155_idx), 4, 0), (short)(4), "0") + sGXsfl_127_idx ;
         subsflControlProps_1551650( ) ;
         httpContext.changePostValue( "Z11750IntId_"+sGXsfl_155_idx, httpContext.cgiGet( "ZT_"+"Z11750IntId_"+sGXsfl_155_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11750IntId_"+sGXsfl_155_idx) ;
      }
      nGXsfl_127_idx = 0 ;
      sGXsfl_127_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_127_idx), 4, 0), (short)(4), "0") + sGXsfl_104_idx ;
      subsflControlProps_1271649( ) ;
      while ( nGXsfl_127_idx < nRC_GXsfl_127 )
      {
         nGXsfl_127_idx = (int)(nGXsfl_127_idx+1) ;
         sGXsfl_127_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_127_idx), 4, 0), (short)(4), "0") + sGXsfl_104_idx ;
         subsflControlProps_1271649( ) ;
         httpContext.changePostValue( "Z11737CCColNom_"+sGXsfl_127_idx, httpContext.cgiGet( "ZT_"+"Z11737CCColNom_"+sGXsfl_127_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11737CCColNom_"+sGXsfl_127_idx) ;
         httpContext.changePostValue( "Z11738CCColNum_"+sGXsfl_127_idx, httpContext.cgiGet( "ZT_"+"Z11738CCColNum_"+sGXsfl_127_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11738CCColNum_"+sGXsfl_127_idx) ;
         httpContext.changePostValue( "Z11749CCCTc_"+sGXsfl_127_idx, httpContext.cgiGet( "ZT_"+"Z11749CCCTc_"+sGXsfl_127_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11749CCCTc_"+sGXsfl_127_idx) ;
      }
      nGXsfl_104_idx = 0 ;
      sGXsfl_104_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_104_idx), 4, 0), (short)(4), "0") + sGXsfl_81_idx ;
      subsflControlProps_1041648( ) ;
      while ( nGXsfl_104_idx < nRC_GXsfl_104 )
      {
         nGXsfl_104_idx = (int)(nGXsfl_104_idx+1) ;
         sGXsfl_104_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_104_idx), 4, 0), (short)(4), "0") + sGXsfl_81_idx ;
         subsflControlProps_1041648( ) ;
         httpContext.changePostValue( "Z11748TipArtiId_"+sGXsfl_104_idx, httpContext.cgiGet( "ZT_"+"Z11748TipArtiId_"+sGXsfl_104_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11748TipArtiId_"+sGXsfl_104_idx) ;
      }
      nGXsfl_81_idx = 0 ;
      sGXsfl_81_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_81_idx), 4, 0), (short)(4), "0") + sGXsfl_58_idx ;
      subsflControlProps_811642( ) ;
      while ( nGXsfl_81_idx < nRC_GXsfl_81 )
      {
         nGXsfl_81_idx = (int)(nGXsfl_81_idx+1) ;
         sGXsfl_81_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_81_idx), 4, 0), (short)(4), "0") + sGXsfl_58_idx ;
         subsflControlProps_811642( ) ;
         httpContext.changePostValue( "Z11736CCArtCod_"+sGXsfl_81_idx, httpContext.cgiGet( "ZT_"+"Z11736CCArtCod_"+sGXsfl_81_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11736CCArtCod_"+sGXsfl_81_idx) ;
      }
      nGXsfl_58_idx = 0 ;
      sGXsfl_58_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_58_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_581534( ) ;
      while ( nGXsfl_58_idx < nRC_GXsfl_58 )
      {
         nGXsfl_58_idx = (int)(nGXsfl_58_idx+1) ;
         sGXsfl_58_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_58_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_581534( ) ;
         httpContext.changePostValue( "Z9713Tb1_Cod_"+sGXsfl_58_idx, httpContext.cgiGet( "ZT_"+"Z9713Tb1_Cod_"+sGXsfl_58_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9713Tb1_Cod_"+sGXsfl_58_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.tcccc", new String[] {}, new String[] {}) +"\">") ;
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
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z279CliNom", GXutil.rtrim( Z279CliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_58", GXutil.ltrim( localUtil.ntoc( nGXsfl_58_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.tcccc", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TCCCC" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Codigos Control Calidad Cuardeno Encargos CC", "") ;
   }

   public void initializeNonKey1HM21( )
   {
      A407EmprNom = "" ;
      n407EmprNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      A279CliNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      Z279CliNom = "" ;
   }

   public void initAll1HM21( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A252CliCod = 0 ;
      n252CliCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      initializeNonKey1HM21( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1HM1534( )
   {
      A9715Tb1_Dsc = "" ;
      n9715Tb1_Dsc = false ;
   }

   public void initAll1HM1534( )
   {
      A9713Tb1_Cod = (short)(0) ;
      initializeNonKey1HM1534( ) ;
   }

   public void standaloneModalInsert1HM1534( )
   {
   }

   public void initializeNonKey1HM1642( )
   {
      A11745CCArtdsc = "" ;
   }

   public void initAll1HM1642( )
   {
      A11736CCArtCod = "" ;
      initializeNonKey1HM1642( ) ;
   }

   public void standaloneModalInsert1HM1642( )
   {
   }

   public void initializeNonKey1HM1648( )
   {
      A11746TipArtiDs = "" ;
   }

   public void initAll1HM1648( )
   {
      A11748TipArtiId = (short)(0) ;
      initializeNonKey1HM1648( ) ;
   }

   public void standaloneModalInsert1HM1648( )
   {
   }

   public void initializeNonKey1HM1649( )
   {
   }

   public void initAll1HM1649( )
   {
      A11737CCColNom = "" ;
      A11738CCColNum = 0 ;
      A11749CCCTc = (byte)(0) ;
      initializeNonKey1HM1649( ) ;
   }

   public void standaloneModalInsert1HM1649( )
   {
   }

   public void initializeNonKey1HM1650( )
   {
      A11747IntDs = "" ;
   }

   public void initAll1HM1650( )
   {
      A11750IntId = (short)(0) ;
      initializeNonKey1HM1650( ) ;
   }

   public void standaloneModalInsert1HM1650( )
   {
   }

   public void initializeNonKey1HM1651( )
   {
      A4036CCTDsc = "" ;
   }

   public void initAll1HM1651( )
   {
      A4031CCTCod = 0 ;
      initializeNonKey1HM1651( ) ;
   }

   public void standaloneModalInsert1HM1651( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241583954", true, true);
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
      httpContext.AddJavascriptSource("tcccc.js", "?20268241583955", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1534( )
   {
      edtTb1_Cod_Enabled = defedtTb1_Cod_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtTb1_Cod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTb1_Cod_Enabled), 5, 0), !bGXsfl_58_Refreshing);
   }

   public void init_level_properties1642( )
   {
      edtCCArtCod_Enabled = defedtCCArtCod_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCArtCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCArtCod_Enabled), 5, 0), !bGXsfl_81_Refreshing);
   }

   public void init_level_properties1648( )
   {
      edtTipArtiId_Enabled = defedtTipArtiId_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipArtiId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipArtiId_Enabled), 5, 0), !bGXsfl_104_Refreshing);
   }

   public void init_level_properties1649( )
   {
      edtCCCTc_Enabled = defedtCCCTc_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCCTc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCCTc_Enabled), 5, 0), !bGXsfl_127_Refreshing);
      edtCCColNum_Enabled = defedtCCColNum_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCColNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCColNum_Enabled), 5, 0), !bGXsfl_127_Refreshing);
      edtCCColNom_Enabled = defedtCCColNom_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCColNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCColNom_Enabled), 5, 0), !bGXsfl_127_Refreshing);
   }

   public void init_level_properties1650( )
   {
      edtIntId_Enabled = defedtIntId_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtIntId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtIntId_Enabled), 5, 0), !bGXsfl_155_Refreshing);
   }

   public void init_level_properties1651( )
   {
      edtCCTCod_Enabled = defedtCCTCod_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCTCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTCod_Enabled), 5, 0), !bGXsfl_178_Refreshing);
   }

   public void startgridcontrol58( )
   {
      Grid1Container.AddObjectProperty("GridName", "Grid1");
      Grid1Container.AddObjectProperty("Header", subGrid1_Header);
      Grid1Container.AddObjectProperty("Class", GXutil.rtrim( "TrnSublevelGrid"));
      Grid1Container.AddObjectProperty("Class", "TrnSublevelGrid");
      Grid1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid1_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("CmpContext", "");
      Grid1Container.AddObjectProperty("InMasterPage", "false");
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9713Tb1_Cod, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtTb1_Cod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A9715Tb1_Dsc));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtTb1_Dsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", lblTitlearticulos_Caption);
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Container.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGrid1_Selectedindex, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid1_Collapsed, (byte)(1), (byte)(0), ".", "")));
   }

   public void startgridcontrol81( )
   {
      Grid2Container.AddObjectProperty("GridName", "Grid2");
      Grid2Container.AddObjectProperty("Header", subGrid2_Header);
      Grid2Container.AddObjectProperty("Class", GXutil.rtrim( "TrnSublevelGrid"));
      Grid2Container.AddObjectProperty("Class", "TrnSublevelGrid");
      Grid2Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid2_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("CmpContext", "");
      Grid2Container.AddObjectProperty("InMasterPage", "false");
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.rtrim( A11736CCArtCod));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCCArtCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.rtrim( A11745CCArtdsc));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCCArtdsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", lblTitletipoarticulo_Caption);
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Container.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGrid2_Selectedindex, (byte)(4), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid2_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid2_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid2_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid2_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid2_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid2_Collapsed, (byte)(1), (byte)(0), ".", "")));
   }

   public void startgridcontrol104( )
   {
      Grid3Container.AddObjectProperty("GridName", "Grid3");
      Grid3Container.AddObjectProperty("Header", subGrid3_Header);
      Grid3Container.AddObjectProperty("Class", GXutil.rtrim( "TrnSublevelGrid"));
      Grid3Container.AddObjectProperty("Class", "TrnSublevelGrid");
      Grid3Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Grid3Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Grid3Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid3_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Grid3Container.AddObjectProperty("CmpContext", "");
      Grid3Container.AddObjectProperty("InMasterPage", "false");
      Grid3Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid3Container.AddColumnProperties(Grid3Column);
      Grid3Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid3Container.AddColumnProperties(Grid3Column);
      Grid3Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid3Container.AddColumnProperties(Grid3Column);
      Grid3Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid3Container.AddColumnProperties(Grid3Column);
      Grid3Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid3Container.AddColumnProperties(Grid3Column);
      Grid3Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid3Container.AddColumnProperties(Grid3Column);
      Grid3Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid3Container.AddColumnProperties(Grid3Column);
      Grid3Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid3Container.AddColumnProperties(Grid3Column);
      Grid3Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid3Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A11748TipArtiId, (byte)(4), (byte)(0), ".", "")));
      Grid3Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtTipArtiId_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid3Container.AddColumnProperties(Grid3Column);
      Grid3Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid3Container.AddColumnProperties(Grid3Column);
      Grid3Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid3Container.AddColumnProperties(Grid3Column);
      Grid3Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid3Container.AddColumnProperties(Grid3Column);
      Grid3Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid3Container.AddColumnProperties(Grid3Column);
      Grid3Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid3Column.AddObjectProperty("Value", GXutil.rtrim( A11746TipArtiDs));
      Grid3Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtTipArtiDs_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid3Container.AddColumnProperties(Grid3Column);
      Grid3Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid3Container.AddColumnProperties(Grid3Column);
      Grid3Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid3Container.AddColumnProperties(Grid3Column);
      Grid3Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid3Container.AddColumnProperties(Grid3Column);
      Grid3Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid3Container.AddColumnProperties(Grid3Column);
      Grid3Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid3Container.AddColumnProperties(Grid3Column);
      Grid3Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid3Column.AddObjectProperty("Value", lblTitlecolores_Caption);
      Grid3Container.AddColumnProperties(Grid3Column);
      Grid3Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid3Container.AddColumnProperties(Grid3Column);
      Grid3Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid3Container.AddColumnProperties(Grid3Column);
      Grid3Container.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGrid3_Selectedindex, (byte)(4), (byte)(0), ".", "")));
      Grid3Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid3_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Grid3Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid3_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Grid3Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid3_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Grid3Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid3_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Grid3Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid3_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Grid3Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid3_Collapsed, (byte)(1), (byte)(0), ".", "")));
   }

   public void startgridcontrol127( )
   {
      Grid4Container.AddObjectProperty("GridName", "Grid4");
      Grid4Container.AddObjectProperty("Header", subGrid4_Header);
      Grid4Container.AddObjectProperty("Class", GXutil.rtrim( "TrnSublevelGrid"));
      Grid4Container.AddObjectProperty("Class", "TrnSublevelGrid");
      Grid4Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Grid4Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Grid4Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid4_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Grid4Container.AddObjectProperty("CmpContext", "");
      Grid4Container.AddObjectProperty("InMasterPage", "false");
      Grid4Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid4Container.AddColumnProperties(Grid4Column);
      Grid4Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid4Container.AddColumnProperties(Grid4Column);
      Grid4Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid4Container.AddColumnProperties(Grid4Column);
      Grid4Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid4Container.AddColumnProperties(Grid4Column);
      Grid4Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid4Container.AddColumnProperties(Grid4Column);
      Grid4Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid4Container.AddColumnProperties(Grid4Column);
      Grid4Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid4Container.AddColumnProperties(Grid4Column);
      Grid4Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid4Container.AddColumnProperties(Grid4Column);
      Grid4Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid4Column.AddObjectProperty("Value", GXutil.rtrim( A11737CCColNom));
      Grid4Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCCColNom_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid4Container.AddColumnProperties(Grid4Column);
      Grid4Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid4Container.AddColumnProperties(Grid4Column);
      Grid4Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid4Container.AddColumnProperties(Grid4Column);
      Grid4Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid4Container.AddColumnProperties(Grid4Column);
      Grid4Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid4Container.AddColumnProperties(Grid4Column);
      Grid4Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid4Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A11738CCColNum, (byte)(6), (byte)(0), ".", "")));
      Grid4Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCCColNum_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid4Container.AddColumnProperties(Grid4Column);
      Grid4Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid4Container.AddColumnProperties(Grid4Column);
      Grid4Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid4Container.AddColumnProperties(Grid4Column);
      Grid4Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid4Container.AddColumnProperties(Grid4Column);
      Grid4Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid4Container.AddColumnProperties(Grid4Column);
      Grid4Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid4Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A11749CCCTc, (byte)(2), (byte)(0), ".", "")));
      Grid4Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCCCTc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid4Container.AddColumnProperties(Grid4Column);
      Grid4Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid4Container.AddColumnProperties(Grid4Column);
      Grid4Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid4Container.AddColumnProperties(Grid4Column);
      Grid4Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid4Container.AddColumnProperties(Grid4Column);
      Grid4Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid4Container.AddColumnProperties(Grid4Column);
      Grid4Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid4Container.AddColumnProperties(Grid4Column);
      Grid4Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid4Column.AddObjectProperty("Value", lblTitleintensidades_Caption);
      Grid4Container.AddColumnProperties(Grid4Column);
      Grid4Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid4Container.AddColumnProperties(Grid4Column);
      Grid4Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid4Container.AddColumnProperties(Grid4Column);
      Grid4Container.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGrid4_Selectedindex, (byte)(4), (byte)(0), ".", "")));
      Grid4Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid4_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Grid4Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid4_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Grid4Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid4_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Grid4Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid4_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Grid4Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid4_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Grid4Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid4_Collapsed, (byte)(1), (byte)(0), ".", "")));
   }

   public void startgridcontrol155( )
   {
      Grid5Container.AddObjectProperty("GridName", "Grid5");
      Grid5Container.AddObjectProperty("Header", subGrid5_Header);
      Grid5Container.AddObjectProperty("Class", GXutil.rtrim( "TrnSublevelGrid"));
      Grid5Container.AddObjectProperty("Class", "TrnSublevelGrid");
      Grid5Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Grid5Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Grid5Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid5_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Grid5Container.AddObjectProperty("CmpContext", "");
      Grid5Container.AddObjectProperty("InMasterPage", "false");
      Grid5Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid5Container.AddColumnProperties(Grid5Column);
      Grid5Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid5Container.AddColumnProperties(Grid5Column);
      Grid5Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid5Container.AddColumnProperties(Grid5Column);
      Grid5Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid5Container.AddColumnProperties(Grid5Column);
      Grid5Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid5Container.AddColumnProperties(Grid5Column);
      Grid5Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid5Container.AddColumnProperties(Grid5Column);
      Grid5Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid5Container.AddColumnProperties(Grid5Column);
      Grid5Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid5Container.AddColumnProperties(Grid5Column);
      Grid5Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid5Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A11750IntId, (byte)(4), (byte)(0), ".", "")));
      Grid5Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtIntId_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid5Container.AddColumnProperties(Grid5Column);
      Grid5Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid5Container.AddColumnProperties(Grid5Column);
      Grid5Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid5Container.AddColumnProperties(Grid5Column);
      Grid5Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid5Container.AddColumnProperties(Grid5Column);
      Grid5Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid5Container.AddColumnProperties(Grid5Column);
      Grid5Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid5Column.AddObjectProperty("Value", GXutil.rtrim( A11747IntDs));
      Grid5Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtIntDs_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid5Container.AddColumnProperties(Grid5Column);
      Grid5Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid5Container.AddColumnProperties(Grid5Column);
      Grid5Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid5Container.AddColumnProperties(Grid5Column);
      Grid5Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid5Container.AddColumnProperties(Grid5Column);
      Grid5Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid5Container.AddColumnProperties(Grid5Column);
      Grid5Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid5Container.AddColumnProperties(Grid5Column);
      Grid5Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid5Column.AddObjectProperty("Value", lblTitlecontroles_Caption);
      Grid5Container.AddColumnProperties(Grid5Column);
      Grid5Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid5Container.AddColumnProperties(Grid5Column);
      Grid5Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid5Container.AddColumnProperties(Grid5Column);
      Grid5Container.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGrid5_Selectedindex, (byte)(4), (byte)(0), ".", "")));
      Grid5Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid5_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Grid5Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid5_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Grid5Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid5_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Grid5Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid5_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Grid5Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid5_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Grid5Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid5_Collapsed, (byte)(1), (byte)(0), ".", "")));
   }

   public void startgridcontrol178( )
   {
      Gridtcccc_qualityrequeriments_articulos_tiposarticulo_colores_intensidades_controlesContainer.AddObjectProperty("GridName", "Gridtcccc_qualityrequeriments_articulos_tiposarticulo_colores_intensidades_controles");
      Gridtcccc_qualityrequeriments_articulos_tiposarticulo_colores_intensidades_controlesContainer.AddObjectProperty("Header", subGridtcccc_qualityrequeriments_articulos_tiposarticulo_colores_intensidades_controles_Header);
      Gridtcccc_qualityrequeriments_articulos_tiposarticulo_colores_intensidades_controlesContainer.AddObjectProperty("Class", "Grid");
      Gridtcccc_qualityrequeriments_articulos_tiposarticulo_colores_intensidades_controlesContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Gridtcccc_qualityrequeriments_articulos_tiposarticulo_colores_intensidades_controlesContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Gridtcccc_qualityrequeriments_articulos_tiposarticulo_colores_intensidades_controlesContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridtcccc_qualityrequeriments_articulos_tiposarticulo_colores_intensidades_controles_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Gridtcccc_qualityrequeriments_articulos_tiposarticulo_colores_intensidades_controlesContainer.AddObjectProperty("CmpContext", "");
      Gridtcccc_qualityrequeriments_articulos_tiposarticulo_colores_intensidades_controlesContainer.AddObjectProperty("InMasterPage", "false");
      Gridtcccc_qualityrequeriments_articulos_tiposarticulo_colores_intensidades_controlesColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridtcccc_qualityrequeriments_articulos_tiposarticulo_colores_intensidades_controlesColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4031CCTCod, (byte)(6), (byte)(0), ".", "")));
      Gridtcccc_qualityrequeriments_articulos_tiposarticulo_colores_intensidades_controlesColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCCTCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridtcccc_qualityrequeriments_articulos_tiposarticulo_colores_intensidades_controlesContainer.AddColumnProperties(Gridtcccc_qualityrequeriments_articulos_tiposarticulo_colores_intensidades_controlesColumn);
      Gridtcccc_qualityrequeriments_articulos_tiposarticulo_colores_intensidades_controlesColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridtcccc_qualityrequeriments_articulos_tiposarticulo_colores_intensidades_controlesColumn.AddObjectProperty("Value", GXutil.rtrim( A4036CCTDsc));
      Gridtcccc_qualityrequeriments_articulos_tiposarticulo_colores_intensidades_controlesColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCCTDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridtcccc_qualityrequeriments_articulos_tiposarticulo_colores_intensidades_controlesContainer.AddColumnProperties(Gridtcccc_qualityrequeriments_articulos_tiposarticulo_colores_intensidades_controlesColumn);
      Gridtcccc_qualityrequeriments_articulos_tiposarticulo_colores_intensidades_controlesContainer.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGridtcccc_qualityrequeriments_articulos_tiposarticulo_colores_intensidades_controles_Selectedindex, (byte)(4), (byte)(0), ".", "")));
      Gridtcccc_qualityrequeriments_articulos_tiposarticulo_colores_intensidades_controlesContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGridtcccc_qualityrequeriments_articulos_tiposarticulo_colores_intensidades_controles_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Gridtcccc_qualityrequeriments_articulos_tiposarticulo_colores_intensidades_controlesContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGridtcccc_qualityrequeriments_articulos_tiposarticulo_colores_intensidades_controles_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Gridtcccc_qualityrequeriments_articulos_tiposarticulo_colores_intensidades_controlesContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGridtcccc_qualityrequeriments_articulos_tiposarticulo_colores_intensidades_controles_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Gridtcccc_qualityrequeriments_articulos_tiposarticulo_colores_intensidades_controlesContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGridtcccc_qualityrequeriments_articulos_tiposarticulo_colores_intensidades_controles_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Gridtcccc_qualityrequeriments_articulos_tiposarticulo_colores_intensidades_controlesContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGridtcccc_qualityrequeriments_articulos_tiposarticulo_colores_intensidades_controles_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Gridtcccc_qualityrequeriments_articulos_tiposarticulo_colores_intensidades_controlesContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGridtcccc_qualityrequeriments_articulos_tiposarticulo_colores_intensidades_controles_Collapsed, (byte)(1), (byte)(0), ".", "")));
   }

   public void init_default_properties( )
   {
      lblTitle_Internalname = "TITLE" ;
      divTitlecontainer_Internalname = "TITLECONTAINER" ;
      bttBtn_first_Internalname = "BTN_FIRST" ;
      bttBtn_previous_Internalname = "BTN_PREVIOUS" ;
      bttBtn_next_Internalname = "BTN_NEXT" ;
      bttBtn_last_Internalname = "BTN_LAST" ;
      bttBtn_select_Internalname = "BTN_SELECT" ;
      divToolbarcell_Internalname = "TOOLBARCELL" ;
      edtEmprCod_Internalname = "EMPRCOD" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      edtCliCod_Internalname = "CLICOD" ;
      edtCliNom_Internalname = "CLINOM" ;
      lblTitlequalityrequeriments_Internalname = "TITLEQUALITYREQUERIMENTS" ;
      edtTb1_Cod_Internalname = "TB1_COD" ;
      edtTb1_Dsc_Internalname = "TB1_DSC" ;
      lblTitlearticulos_Internalname = "TITLEARTICULOS" ;
      edtCCArtCod_Internalname = "CCARTCOD" ;
      edtCCArtdsc_Internalname = "CCARTDSC" ;
      lblTitletipoarticulo_Internalname = "TITLETIPOARTICULO" ;
      edtTipArtiId_Internalname = "TIPARTIID" ;
      edtTipArtiDs_Internalname = "TIPARTIDS" ;
      lblTitlecolores_Internalname = "TITLECOLORES" ;
      edtCCColNom_Internalname = "CCCOLNOM" ;
      edtCCColNum_Internalname = "CCCOLNUM" ;
      edtCCCTc_Internalname = "CCCTC" ;
      lblTitleintensidades_Internalname = "TITLEINTENSIDADES" ;
      edtIntId_Internalname = "INTID" ;
      edtIntDs_Internalname = "INTDS" ;
      lblTitlecontroles_Internalname = "TITLECONTROLES" ;
      edtCCTCod_Internalname = "CCTCOD" ;
      edtCCTDsc_Internalname = "CCTDSC" ;
      divControlestable_Internalname = "CONTROLESTABLE" ;
      divTable6_Internalname = "TABLE6" ;
      divGridtable5_Internalname = "GRIDTABLE5" ;
      divIntensidadestable_Internalname = "INTENSIDADESTABLE" ;
      divTable5_Internalname = "TABLE5" ;
      divGridtable4_Internalname = "GRIDTABLE4" ;
      divColorestable_Internalname = "COLORESTABLE" ;
      divTable4_Internalname = "TABLE4" ;
      divGridtable3_Internalname = "GRIDTABLE3" ;
      divTipoarticulotable_Internalname = "TIPOARTICULOTABLE" ;
      divTable3_Internalname = "TABLE3" ;
      divGridtable2_Internalname = "GRIDTABLE2" ;
      divArticulostable_Internalname = "ARTICULOSTABLE" ;
      divTable2_Internalname = "TABLE2" ;
      divGridtable1_Internalname = "GRIDTABLE1" ;
      divQualityrequerimentstable_Internalname = "QUALITYREQUERIMENTSTABLE" ;
      divFormcontainer_Internalname = "FORMCONTAINER" ;
      bttBtn_enter_Internalname = "BTN_ENTER" ;
      bttBtn_cancel_Internalname = "BTN_CANCEL" ;
      bttBtn_delete_Internalname = "BTN_DELETE" ;
      divMaintable_Internalname = "MAINTABLE" ;
      Form.setInternalname( "FORM" );
      subGridtcccc_qualityrequeriments_articulos_tiposarticulo_colores_intensidades_controles_Internalname = "GRIDTCCCC_QUALITYREQUERIMENTS_ARTICULOS_TIPOSARTICULO_COLORES_INTENSIDADES_CONTROLES" ;
      subGrid5_Internalname = "GRID5" ;
      subGrid4_Internalname = "GRID4" ;
      subGrid3_Internalname = "GRID3" ;
      subGrid2_Internalname = "GRID2" ;
      subGrid1_Internalname = "GRID1" ;
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
      subGridtcccc_qualityrequeriments_articulos_tiposarticulo_colores_intensidades_controles_Allowcollapsing = (byte)(0) ;
      subGridtcccc_qualityrequeriments_articulos_tiposarticulo_colores_intensidades_controles_Allowselection = (byte)(0) ;
      subGridtcccc_qualityrequeriments_articulos_tiposarticulo_colores_intensidades_controles_Header = "" ;
      subGrid5_Allowcollapsing = (byte)(0) ;
      lblTitlecontroles_Caption = httpContext.getMessage( "Controles", "") ;
      subGrid4_Allowcollapsing = (byte)(0) ;
      lblTitleintensidades_Caption = httpContext.getMessage( "Intensidades", "") ;
      subGrid3_Allowcollapsing = (byte)(0) ;
      lblTitlecolores_Caption = httpContext.getMessage( "Colores", "") ;
      subGrid2_Allowcollapsing = (byte)(0) ;
      lblTitletipoarticulo_Caption = httpContext.getMessage( "Tipo Articulo", "") ;
      subGrid1_Allowcollapsing = (byte)(0) ;
      lblTitlearticulos_Caption = httpContext.getMessage( "Articulos", "") ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Codigos Control Calidad Cuardeno Encargos CC", "") );
      edtCCTDsc_Jsonclick = "" ;
      edtCCTCod_Jsonclick = "" ;
      subGridtcccc_qualityrequeriments_articulos_tiposarticulo_colores_intensidades_controles_Class = "Grid" ;
      subGridtcccc_qualityrequeriments_articulos_tiposarticulo_colores_intensidades_controles_Backcolorstyle = (byte)(0) ;
      edtIntDs_Jsonclick = "" ;
      edtIntId_Jsonclick = "" ;
      subGrid5_Class = "TrnSublevelGrid" ;
      subGrid5_Backcolorstyle = (byte)(0) ;
      edtCCCTc_Jsonclick = "" ;
      edtCCColNum_Jsonclick = "" ;
      edtCCColNom_Jsonclick = "" ;
      subGrid4_Class = "TrnSublevelGrid" ;
      subGrid4_Backcolorstyle = (byte)(0) ;
      edtTipArtiDs_Jsonclick = "" ;
      edtTipArtiId_Jsonclick = "" ;
      subGrid3_Class = "TrnSublevelGrid" ;
      subGrid3_Backcolorstyle = (byte)(0) ;
      edtCCArtdsc_Jsonclick = "" ;
      edtCCArtCod_Jsonclick = "" ;
      subGrid2_Class = "TrnSublevelGrid" ;
      subGrid2_Backcolorstyle = (byte)(0) ;
      edtTb1_Dsc_Jsonclick = "" ;
      edtTb1_Cod_Jsonclick = "" ;
      subGrid1_Class = "TrnSublevelGrid" ;
      subGrid1_Backcolorstyle = (byte)(0) ;
      edtCCArtdsc_Enabled = 0 ;
      edtCCArtCod_Enabled = 1 ;
      edtTipArtiDs_Enabled = 0 ;
      edtTipArtiId_Enabled = 1 ;
      edtCCCTc_Enabled = 1 ;
      edtCCColNum_Enabled = 1 ;
      edtCCColNom_Enabled = 1 ;
      edtIntDs_Enabled = 0 ;
      edtIntId_Enabled = 1 ;
      edtCCTDsc_Enabled = 0 ;
      edtCCTCod_Enabled = 1 ;
      edtTb1_Dsc_Enabled = 0 ;
      edtTb1_Cod_Enabled = 1 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtCliNom_Jsonclick = "" ;
      edtCliNom_Enabled = 1 ;
      edtCliCod_Jsonclick = "" ;
      edtCliCod_Enabled = 1 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Enabled = 0 ;
      edtEmprCod_Jsonclick = "" ;
      edtEmprCod_Enabled = 1 ;
      bttBtn_select_Visible = 1 ;
      bttBtn_last_Visible = 1 ;
      bttBtn_next_Visible = 1 ;
      bttBtn_previous_Visible = 1 ;
      bttBtn_first_Visible = 1 ;
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

   public void gx1asaccartdsc1HM1642( String A396EmprCod ,
                                      int A252CliCod ,
                                      String A11736CCArtCod )
   {
      GXt_char1 = A11745CCArtdsc ;
      GXv_char4[0] = GXt_char1 ;
      new app.ppartdsc(remoteHandle, context).execute( A396EmprCod, A252CliCod, A11736CCArtCod, GXv_char4) ;
      tcccc_impl.this.GXt_char1 = GXv_char4[0] ;
      A11745CCArtdsc = GXt_char1 ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A11745CCArtdsc))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gx2asatipartids1HM1648( String A396EmprCod ,
                                       short A11748TipArtiId )
   {
      GXt_char1 = A11746TipArtiDs ;
      GXv_char4[0] = GXt_char1 ;
      new app.ptipartdsc(remoteHandle, context).execute( A396EmprCod, A11748TipArtiId, GXv_char4) ;
      tcccc_impl.this.GXt_char1 = GXv_char4[0] ;
      A11746TipArtiDs = GXt_char1 ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A11746TipArtiDs))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gx3asaintds1HM1650( String A396EmprCod ,
                                   short A11750IntId )
   {
      GXt_char1 = A11747IntDs ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int3[0] = (byte)(A11750IntId) ;
      GXv_char2[0] = GXt_char1 ;
      new app.pdscint(remoteHandle, context).execute( GXv_char4, GXv_int3, GXv_char2) ;
      tcccc_impl.this.A396EmprCod = GXv_char4[0] ;
      tcccc_impl.this.A11750IntId = GXv_int3[0] ;
      tcccc_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A11747IntDs = GXt_char1 ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A11747IntDs))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gxnrgrid1_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_581534( ) ;
      while ( nGXsfl_58_idx <= nRC_GXsfl_58 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1HM1534( ) ;
         standaloneModal1HM1534( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1HM1534( ) ;
         Grid1Row.AddGrid("Grid2", Grid2Container);
         nGXsfl_58_idx = (int)(nGXsfl_58_idx+1) ;
         sGXsfl_58_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_58_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_581534( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Grid1Container)) ;
      /* End function gxnrGrid1_newrow */
   }

   public void gxnrgrid2_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_811642( ) ;
      while ( nGXsfl_81_idx <= nRC_GXsfl_81 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1HM1534( ) ;
         standaloneModal1HM1534( ) ;
         standaloneNotModal1HM1642( ) ;
         standaloneModal1HM1642( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1HM1642( ) ;
         Grid2Row.AddGrid("Grid3", Grid3Container);
         nGXsfl_81_idx = (int)(nGXsfl_81_idx+1) ;
         sGXsfl_81_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_81_idx), 4, 0), (short)(4), "0") + sGXsfl_58_idx ;
         subsflControlProps_811642( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Grid2Container)) ;
      /* End function gxnrGrid2_newrow */
   }

   public void gxnrgrid3_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_1041648( ) ;
      while ( nGXsfl_104_idx <= nRC_GXsfl_104 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1HM1534( ) ;
         standaloneModal1HM1534( ) ;
         standaloneNotModal1HM1642( ) ;
         standaloneModal1HM1642( ) ;
         standaloneNotModal1HM1648( ) ;
         standaloneModal1HM1648( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1HM1648( ) ;
         Grid3Row.AddGrid("Grid4", Grid4Container);
         nGXsfl_104_idx = (int)(nGXsfl_104_idx+1) ;
         sGXsfl_104_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_104_idx), 4, 0), (short)(4), "0") + sGXsfl_81_idx ;
         subsflControlProps_1041648( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Grid3Container)) ;
      /* End function gxnrGrid3_newrow */
   }

   public void gxnrgrid4_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_1271649( ) ;
      while ( nGXsfl_127_idx <= nRC_GXsfl_127 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1HM1534( ) ;
         standaloneModal1HM1534( ) ;
         standaloneNotModal1HM1642( ) ;
         standaloneModal1HM1642( ) ;
         standaloneNotModal1HM1648( ) ;
         standaloneModal1HM1648( ) ;
         standaloneNotModal1HM1649( ) ;
         standaloneModal1HM1649( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1HM1649( ) ;
         Grid4Row.AddGrid("Grid5", Grid5Container);
         nGXsfl_127_idx = (int)(nGXsfl_127_idx+1) ;
         sGXsfl_127_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_127_idx), 4, 0), (short)(4), "0") + sGXsfl_104_idx ;
         subsflControlProps_1271649( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Grid4Container)) ;
      /* End function gxnrGrid4_newrow */
   }

   public void gxnrgrid5_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_1551650( ) ;
      while ( nGXsfl_155_idx <= nRC_GXsfl_155 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1HM1534( ) ;
         standaloneModal1HM1534( ) ;
         standaloneNotModal1HM1642( ) ;
         standaloneModal1HM1642( ) ;
         standaloneNotModal1HM1648( ) ;
         standaloneModal1HM1648( ) ;
         standaloneNotModal1HM1649( ) ;
         standaloneModal1HM1649( ) ;
         standaloneNotModal1HM1650( ) ;
         standaloneModal1HM1650( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1HM1650( ) ;
         Grid5Row.AddGrid("Gridtcccc_qualityrequeriments_articulos_tiposarticulo_colores_intensidades_controles", Gridtcccc_qualityrequeriments_articulos_tiposarticulo_colores_intensidades_controlesContainer);
         nGXsfl_155_idx = (int)(nGXsfl_155_idx+1) ;
         sGXsfl_155_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_155_idx), 4, 0), (short)(4), "0") + sGXsfl_127_idx ;
         subsflControlProps_1551650( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Grid5Container)) ;
      /* End function gxnrGrid5_newrow */
   }

   public void gxnrgridtcccc_qualityrequeriments_articulos_tiposarticulo_colores_intensidades_controles_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_1781651( ) ;
      while ( nGXsfl_178_idx <= nRC_GXsfl_178 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1HM1534( ) ;
         standaloneModal1HM1534( ) ;
         standaloneNotModal1HM1642( ) ;
         standaloneModal1HM1642( ) ;
         standaloneNotModal1HM1648( ) ;
         standaloneModal1HM1648( ) ;
         standaloneNotModal1HM1649( ) ;
         standaloneModal1HM1649( ) ;
         standaloneNotModal1HM1650( ) ;
         standaloneModal1HM1650( ) ;
         standaloneNotModal1HM1651( ) ;
         standaloneModal1HM1651( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1HM1651( ) ;
         nGXsfl_178_idx = (int)(nGXsfl_178_idx+1) ;
         sGXsfl_178_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_178_idx), 4, 0), (short)(4), "0") + sGXsfl_155_idx ;
         subsflControlProps_1781651( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Gridtcccc_qualityrequeriments_articulos_tiposarticulo_colores_intensidades_controlesContainer)) ;
      /* End function gxnrGridtcccc_qualityrequeriments_articulos_tiposarticulo_colores_intensidades_controles_newrow */
   }

   public void init_web_controls( )
   {
      /* End function init_web_controls */
   }

   public void afterkeyloadscreen( )
   {
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      getEqualNoModal( ) ;
      /* Using cursor T01HM27 */
      pr_default.execute(25, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(25) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01HM27_A407EmprNom[0] ;
      n407EmprNom = T01HM27_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(25);
      GX_FocusControl = edtCliNom_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
      /* End function AfterKeyLoadScreen */
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
      /* Using cursor T01HM27 */
      pr_default.execute(25, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(25) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A407EmprNom = T01HM27_A407EmprNom[0] ;
      n407EmprNom = T01HM27_n407EmprNom[0] ;
      pr_default.close(25);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
   }

   public void valid_Clicod( )
   {
      n252CliCod = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z279CliNom", GXutil.rtrim( Z279CliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Tb1_cod( )
   {
      n9715Tb1_Dsc = false ;
      /* Using cursor T01HM96 */
      pr_default.execute(94, new Object[] {A396EmprCod, Short.valueOf(A9713Tb1_Cod)});
      if ( (pr_default.getStatus(94) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TABLE1", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TB1_COD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTb1_Cod_Internalname ;
      }
      A9715Tb1_Dsc = T01HM96_A9715Tb1_Dsc[0] ;
      n9715Tb1_Dsc = T01HM96_n9715Tb1_Dsc[0] ;
      pr_default.close(94);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A9715Tb1_Dsc", GXutil.rtrim( A9715Tb1_Dsc));
   }

   public void valid_Ccartcod( )
   {
      n252CliCod = false ;
      GXt_char1 = A11745CCArtdsc ;
      GXv_char4[0] = GXt_char1 ;
      new app.ppartdsc(remoteHandle, context).execute( A396EmprCod, A252CliCod, A11736CCArtCod, GXv_char4) ;
      tcccc_impl.this.GXt_char1 = GXv_char4[0] ;
      A11745CCArtdsc = GXt_char1 ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A11745CCArtdsc", GXutil.rtrim( A11745CCArtdsc));
   }

   public void valid_Tipartiid( )
   {
      GXt_char1 = A11746TipArtiDs ;
      GXv_char4[0] = GXt_char1 ;
      new app.ptipartdsc(remoteHandle, context).execute( A396EmprCod, A11748TipArtiId, GXv_char4) ;
      tcccc_impl.this.GXt_char1 = GXv_char4[0] ;
      A11746TipArtiDs = GXt_char1 ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A11746TipArtiDs", GXutil.rtrim( A11746TipArtiDs));
   }

   public void valid_Intid( )
   {
      GXt_char1 = A11747IntDs ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int3[0] = (byte)(A11750IntId) ;
      GXv_char2[0] = GXt_char1 ;
      new app.pdscint(remoteHandle, context).execute( GXv_char4, GXv_int3, GXv_char2) ;
      tcccc_impl.this.A396EmprCod = GXv_char4[0] ;
      tcccc_impl.this.A11750IntId = GXv_int3[0] ;
      tcccc_impl.this.GXt_char1 = GXv_char2[0] ;
      A11747IntDs = GXt_char1 ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A11747IntDs", GXutil.rtrim( A11747IntDs));
   }

   public void valid_Cctcod( )
   {
      /* Using cursor T01HM128 */
      pr_default.execute(126, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod)});
      if ( (pr_default.getStatus(126) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CCDef", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CCTCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCCTCod_Internalname ;
      }
      A4036CCTDsc = T01HM128_A4036CCTDsc[0] ;
      pr_default.close(126);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A4036CCTDsc", GXutil.rtrim( A4036CCTDsc));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A407EmprNom',fld:'EMPRNOM',pic:''}]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''}]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_CLICOD",",oparms:[{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z252CliCod'},{av:'Z279CliNom'},{av:'Z407EmprNom'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'}]}");
      setEventMetadata("VALID_TB1_COD","{handler:'valid_Tb1_cod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9713Tb1_Cod',fld:'TB1_COD',pic:'ZZZ9'},{av:'A9715Tb1_Dsc',fld:'TB1_DSC',pic:''}]");
      setEventMetadata("VALID_TB1_COD",",oparms:[{av:'A9715Tb1_Dsc',fld:'TB1_DSC',pic:''}]}");
      setEventMetadata("NULL","{handler:'valid_Tb1_dsc',iparms:[]");
      setEventMetadata("NULL",",oparms:[]}");
      setEventMetadata("VALID_CCARTCOD","{handler:'valid_Ccartcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A11736CCArtCod',fld:'CCARTCOD',pic:''},{av:'A11745CCArtdsc',fld:'CCARTDSC',pic:''}]");
      setEventMetadata("VALID_CCARTCOD",",oparms:[{av:'A11745CCArtdsc',fld:'CCARTDSC',pic:''}]}");
      setEventMetadata("NULL","{handler:'valid_Ccartdsc',iparms:[]");
      setEventMetadata("NULL",",oparms:[]}");
      setEventMetadata("VALID_TIPARTIID","{handler:'valid_Tipartiid',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A11748TipArtiId',fld:'TIPARTIID',pic:'ZZZ9'},{av:'A11746TipArtiDs',fld:'TIPARTIDS',pic:''}]");
      setEventMetadata("VALID_TIPARTIID",",oparms:[{av:'A11746TipArtiDs',fld:'TIPARTIDS',pic:''}]}");
      setEventMetadata("NULL","{handler:'valid_Tipartids',iparms:[]");
      setEventMetadata("NULL",",oparms:[]}");
      setEventMetadata("VALID_CCCOLNOM","{handler:'valid_Cccolnom',iparms:[]");
      setEventMetadata("VALID_CCCOLNOM",",oparms:[]}");
      setEventMetadata("VALID_CCCOLNUM","{handler:'valid_Cccolnum',iparms:[]");
      setEventMetadata("VALID_CCCOLNUM",",oparms:[]}");
      setEventMetadata("VALID_CCCTC","{handler:'valid_Ccctc',iparms:[]");
      setEventMetadata("VALID_CCCTC",",oparms:[]}");
      setEventMetadata("VALID_INTID","{handler:'valid_Intid',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A11750IntId',fld:'INTID',pic:'ZZZ9'},{av:'A11747IntDs',fld:'INTDS',pic:''}]");
      setEventMetadata("VALID_INTID",",oparms:[{av:'A11747IntDs',fld:'INTDS',pic:''}]}");
      setEventMetadata("NULL","{handler:'valid_Intds',iparms:[]");
      setEventMetadata("NULL",",oparms:[]}");
      setEventMetadata("VALID_CCTCOD","{handler:'valid_Cctcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A4031CCTCod',fld:'CCTCOD',pic:'ZZZZZ9'},{av:'A4036CCTDsc',fld:'CCTDSC',pic:''}]");
      setEventMetadata("VALID_CCTCOD",",oparms:[{av:'A4036CCTDsc',fld:'CCTDSC',pic:''}]}");
      setEventMetadata("NULL","{handler:'valid_Cctdsc',iparms:[]");
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
      pr_default.close(126);
      pr_default.close(94);
      pr_default.close(25);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z279CliNom = "" ;
      Z11736CCArtCod = "" ;
      Z11737CCColNom = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A11736CCArtCod = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      Gx_mode = "" ;
      lblTitle_Jsonclick = "" ;
      ClassString = "" ;
      StyleString = "" ;
      TempTags = "" ;
      bttBtn_first_Jsonclick = "" ;
      bttBtn_previous_Jsonclick = "" ;
      bttBtn_next_Jsonclick = "" ;
      bttBtn_last_Jsonclick = "" ;
      bttBtn_select_Jsonclick = "" ;
      A407EmprNom = "" ;
      A279CliNom = "" ;
      lblTitlequalityrequeriments_Jsonclick = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1534 = "" ;
      sStyleString = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      GXCCtl = "" ;
      A4036CCTDsc = "" ;
      sMode1650 = "" ;
      A11747IntDs = "" ;
      sMode1649 = "" ;
      A11737CCColNom = "" ;
      sMode1648 = "" ;
      A11746TipArtiDs = "" ;
      sMode1642 = "" ;
      A11745CCArtdsc = "" ;
      A9715Tb1_Dsc = "" ;
      Z407EmprNom = "" ;
      T01HM19_A252CliCod = new int[1] ;
      T01HM19_n252CliCod = new boolean[] {false} ;
      T01HM19_A407EmprNom = new String[] {""} ;
      T01HM19_n407EmprNom = new boolean[] {false} ;
      T01HM19_A279CliNom = new String[] {""} ;
      T01HM19_A396EmprCod = new String[] {""} ;
      T01HM18_A407EmprNom = new String[] {""} ;
      T01HM18_n407EmprNom = new boolean[] {false} ;
      T01HM20_A407EmprNom = new String[] {""} ;
      T01HM20_n407EmprNom = new boolean[] {false} ;
      T01HM21_A396EmprCod = new String[] {""} ;
      T01HM21_A252CliCod = new int[1] ;
      T01HM21_n252CliCod = new boolean[] {false} ;
      T01HM17_A252CliCod = new int[1] ;
      T01HM17_n252CliCod = new boolean[] {false} ;
      T01HM17_A279CliNom = new String[] {""} ;
      T01HM17_A396EmprCod = new String[] {""} ;
      sMode21 = "" ;
      T01HM22_A396EmprCod = new String[] {""} ;
      T01HM22_A252CliCod = new int[1] ;
      T01HM22_n252CliCod = new boolean[] {false} ;
      T01HM23_A396EmprCod = new String[] {""} ;
      T01HM23_A252CliCod = new int[1] ;
      T01HM23_n252CliCod = new boolean[] {false} ;
      T01HM16_A252CliCod = new int[1] ;
      T01HM16_n252CliCod = new boolean[] {false} ;
      T01HM16_A279CliNom = new String[] {""} ;
      T01HM16_A396EmprCod = new String[] {""} ;
      T01HM27_A407EmprNom = new String[] {""} ;
      T01HM27_n407EmprNom = new boolean[] {false} ;
      T01HM28_A396EmprCod = new String[] {""} ;
      T01HM28_A252CliCod = new int[1] ;
      T01HM28_n252CliCod = new boolean[] {false} ;
      T01HM28_A6930Lb_rclin = new int[1] ;
      T01HM29_A396EmprCod = new String[] {""} ;
      T01HM29_A6850Tex_NPed = new int[1] ;
      T01HM30_A396EmprCod = new String[] {""} ;
      T01HM30_A252CliCod = new int[1] ;
      T01HM30_n252CliCod = new boolean[] {false} ;
      T01HM30_A829TipArtCod = new short[1] ;
      T01HM30_A831TipColCod = new byte[1] ;
      T01HM30_A583IntCod = new byte[1] ;
      T01HM30_A5098TipDisCod = new String[] {""} ;
      T01HM30_A6603Est1_anyo = new short[1] ;
      T01HM30_A6604Est1_mes = new byte[1] ;
      T01HM30_A6605Est1_dia = new byte[1] ;
      T01HM31_A396EmprCod = new String[] {""} ;
      T01HM31_A6319C_Barcod = new int[1] ;
      T01HM31_A6320C_Barcodre = new byte[1] ;
      T01HM31_A6321C_Barcodpa = new String[] {""} ;
      T01HM31_A6322C_Reclinma = new short[1] ;
      T01HM32_A396EmprCod = new String[] {""} ;
      T01HM32_A6235DevEmpCod = new int[1] ;
      T01HM33_A396EmprCod = new String[] {""} ;
      T01HM33_A602MaqCod = new String[] {""} ;
      T01HM33_A6078MaqCliCod = new int[1] ;
      T01HM33_A6079MaqArtCod = new String[] {""} ;
      T01HM34_A396EmprCod = new String[] {""} ;
      T01HM34_A5532Lb_numero = new int[1] ;
      T01HM35_A396EmprCod = new String[] {""} ;
      T01HM35_A252CliCod = new int[1] ;
      T01HM35_n252CliCod = new boolean[] {false} ;
      T01HM35_A5503CliifLin = new short[1] ;
      T01HM36_A396EmprCod = new String[] {""} ;
      T01HM36_A252CliCod = new int[1] ;
      T01HM36_n252CliCod = new boolean[] {false} ;
      T01HM36_A5499ClieiLin = new short[1] ;
      T01HM37_A396EmprCod = new String[] {""} ;
      T01HM37_A252CliCod = new int[1] ;
      T01HM37_n252CliCod = new boolean[] {false} ;
      T01HM37_A5495ClidtLin = new short[1] ;
      T01HM38_A396EmprCod = new String[] {""} ;
      T01HM38_A252CliCod = new int[1] ;
      T01HM38_n252CliCod = new boolean[] {false} ;
      T01HM38_A5491CliedLin = new short[1] ;
      T01HM39_A396EmprCod = new String[] {""} ;
      T01HM39_A252CliCod = new int[1] ;
      T01HM39_n252CliCod = new boolean[] {false} ;
      T01HM39_A5452P_ForCod = new String[] {""} ;
      T01HM40_A396EmprCod = new String[] {""} ;
      T01HM40_A252CliCod = new int[1] ;
      T01HM40_n252CliCod = new boolean[] {false} ;
      T01HM40_A5443Mdl_Cod = new String[] {""} ;
      T01HM41_A396EmprCod = new String[] {""} ;
      T01HM41_A252CliCod = new int[1] ;
      T01HM41_n252CliCod = new boolean[] {false} ;
      T01HM41_A5436IntCodF2 = new short[1] ;
      T01HM42_A396EmprCod = new String[] {""} ;
      T01HM42_A252CliCod = new int[1] ;
      T01HM42_n252CliCod = new boolean[] {false} ;
      T01HM42_A5396IntCodFC = new byte[1] ;
      T01HM42_A5434Tip_ColC = new byte[1] ;
      T01HM43_A396EmprCod = new String[] {""} ;
      T01HM43_A252CliCod = new int[1] ;
      T01HM43_n252CliCod = new boolean[] {false} ;
      T01HM43_A5428FasPreCod = new String[] {""} ;
      T01HM44_A396EmprCod = new String[] {""} ;
      T01HM44_A252CliCod = new int[1] ;
      T01HM44_n252CliCod = new boolean[] {false} ;
      T01HM44_A5398Cli_Proc = new String[] {""} ;
      T01HM45_A396EmprCod = new String[] {""} ;
      T01HM45_A5130PagIden = new int[1] ;
      T01HM46_A396EmprCod = new String[] {""} ;
      T01HM46_A5059Hl_hdr = new int[1] ;
      T01HM46_A5060Hl_hdrr = new byte[1] ;
      T01HM46_A5061Hl_hdrp = new String[] {""} ;
      T01HM47_A396EmprCod = new String[] {""} ;
      T01HM47_A252CliCod = new int[1] ;
      T01HM47_n252CliCod = new boolean[] {false} ;
      T01HM47_A4718DishCod = new String[] {""} ;
      T01HM47_A5020TipEstCod = new byte[1] ;
      T01HM47_A5022GraCod = new byte[1] ;
      T01HM48_A396EmprCod = new String[] {""} ;
      T01HM48_A4618EnsLCod = new int[1] ;
      T01HM49_A396EmprCod = new String[] {""} ;
      T01HM49_A4492HreBarCod = new int[1] ;
      T01HM49_A4493HreBarReo = new byte[1] ;
      T01HM49_A4494HreBarPar = new String[] {""} ;
      T01HM49_A4495HreNumCie = new byte[1] ;
      T01HM50_A396EmprCod = new String[] {""} ;
      T01HM50_A252CliCod = new int[1] ;
      T01HM50_n252CliCod = new boolean[] {false} ;
      T01HM50_A4415EstCol = new String[] {""} ;
      T01HM51_A396EmprCod = new String[] {""} ;
      T01HM51_A4185WEBUSU = new String[] {""} ;
      T01HM52_A396EmprCod = new String[] {""} ;
      T01HM52_A252CliCod = new int[1] ;
      T01HM52_n252CliCod = new boolean[] {false} ;
      T01HM52_A4079WEBDISCOD = new String[] {""} ;
      T01HM52_A4078EMPCOD = new String[] {""} ;
      T01HM53_A396EmprCod = new String[] {""} ;
      T01HM53_A2637HisEstHRu = new int[1] ;
      T01HM53_A2636HisEstHRe = new byte[1] ;
      T01HM53_A2635HisEstHPa = new String[] {""} ;
      T01HM53_A2638HisEstLCo = new byte[1] ;
      T01HM53_A2630HisEstCom = new String[] {""} ;
      T01HM53_A2634HisEstFon = new String[] {""} ;
      T01HM54_A396EmprCod = new String[] {""} ;
      T01HM54_A2574GrpDibCod = new int[1] ;
      T01HM55_A396EmprCod = new String[] {""} ;
      T01HM55_A2558GrmDibCod = new int[1] ;
      T01HM56_A396EmprCod = new String[] {""} ;
      T01HM56_A2542GrcDibCod = new int[1] ;
      T01HM57_A396EmprCod = new String[] {""} ;
      T01HM57_A1031EmpesCod = new String[] {""} ;
      T01HM57_A252CliCod = new int[1] ;
      T01HM57_n252CliCod = new boolean[] {false} ;
      T01HM57_A1032FonCod = new String[] {""} ;
      T01HM58_A396EmprCod = new String[] {""} ;
      T01HM58_A1013DibCli = new String[] {""} ;
      T01HM58_A252CliCod = new int[1] ;
      T01HM58_n252CliCod = new boolean[] {false} ;
      T01HM58_A1014DibInt = new int[1] ;
      T01HM59_A396EmprCod = new String[] {""} ;
      T01HM59_A1736AlbExtCod = new long[1] ;
      T01HM60_A396EmprCod = new String[] {""} ;
      T01HM60_A252CliCod = new int[1] ;
      T01HM60_n252CliCod = new boolean[] {false} ;
      T01HM60_A3661FacProAny = new short[1] ;
      T01HM60_A3662FacProSer = new String[] {""} ;
      T01HM60_A3663FacProInt = new byte[1] ;
      T01HM60_A3664FacProTip = new byte[1] ;
      T01HM60_A3665FacProTar = new short[1] ;
      T01HM61_A396EmprCod = new String[] {""} ;
      T01HM61_A3646EstTinAny = new short[1] ;
      T01HM61_A3647EstTinMes = new byte[1] ;
      T01HM61_A3648EstTinDia = new byte[1] ;
      T01HM61_A1929EstTinNr = new short[1] ;
      T01HM62_A396EmprCod = new String[] {""} ;
      T01HM62_A3617AlbTrnCod = new long[1] ;
      T01HM63_A396EmprCod = new String[] {""} ;
      T01HM63_A252CliCod = new int[1] ;
      T01HM63_n252CliCod = new boolean[] {false} ;
      T01HM63_A3320CliLimKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01HM64_A396EmprCod = new String[] {""} ;
      T01HM64_A3073RepCod = new String[] {""} ;
      T01HM64_A252CliCod = new int[1] ;
      T01HM64_n252CliCod = new boolean[] {false} ;
      T01HM65_A396EmprCod = new String[] {""} ;
      T01HM65_A3061Codia = new byte[1] ;
      T01HM65_A3062CoMes = new byte[1] ;
      T01HM65_A3063CoAny = new short[1] ;
      T01HM65_A3065CoLin = new byte[1] ;
      T01HM65_A3010CoBarCod = new int[1] ;
      T01HM65_A3011CoBarReo = new byte[1] ;
      T01HM65_A3012CoBarPar = new String[] {""} ;
      T01HM66_A396EmprCod = new String[] {""} ;
      T01HM66_A2971SabFacCod = new int[1] ;
      T01HM67_A396EmprCod = new String[] {""} ;
      T01HM67_A2954TiDia = new byte[1] ;
      T01HM67_A2955TiMes = new byte[1] ;
      T01HM67_A2956TiAny = new short[1] ;
      T01HM67_A2958TiLin = new byte[1] ;
      T01HM67_A2959TiBarCod = new int[1] ;
      T01HM67_A2960TiBarReo = new byte[1] ;
      T01HM67_A2961TiBarPar = new String[] {""} ;
      T01HM68_A396EmprCod = new String[] {""} ;
      T01HM68_A252CliCod = new int[1] ;
      T01HM68_n252CliCod = new boolean[] {false} ;
      T01HM68_A2933RecTipCon = new short[1] ;
      T01HM69_A396EmprCod = new String[] {""} ;
      T01HM69_A252CliCod = new int[1] ;
      T01HM69_n252CliCod = new boolean[] {false} ;
      T01HM69_A2927RecProCod = new String[] {""} ;
      T01HM70_A396EmprCod = new String[] {""} ;
      T01HM70_A252CliCod = new int[1] ;
      T01HM70_n252CliCod = new boolean[] {false} ;
      T01HM70_A2891HMaForSer = new String[] {""} ;
      T01HM70_A2892HMaForCNom = new String[] {""} ;
      T01HM70_A2893HMaForCNum = new int[1] ;
      T01HM70_A2894HMaTipCCod = new byte[1] ;
      T01HM70_A2895HMaForNumC = new int[1] ;
      T01HM70_A2897HMaColLin = new short[1] ;
      T01HM70_A2896HMaFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01HM70_A2907HmaLin = new short[1] ;
      T01HM71_A396EmprCod = new String[] {""} ;
      T01HM71_A252CliCod = new int[1] ;
      T01HM71_n252CliCod = new boolean[] {false} ;
      T01HM71_A425EstAny = new short[1] ;
      T01HM71_A2755EstSerFac = new String[] {""} ;
      T01HM72_A396EmprCod = new String[] {""} ;
      T01HM72_A2730RecTipCo = new short[1] ;
      T01HM72_A252CliCod = new int[1] ;
      T01HM72_n252CliCod = new boolean[] {false} ;
      T01HM73_A396EmprCod = new String[] {""} ;
      T01HM73_A2720TarSec = new String[] {""} ;
      T01HM73_A252CliCod = new int[1] ;
      T01HM73_n252CliCod = new boolean[] {false} ;
      T01HM73_A829TipArtCod = new short[1] ;
      T01HM73_A831TipColCod = new byte[1] ;
      T01HM74_A396EmprCod = new String[] {""} ;
      T01HM74_A2382AbcTerCod = new String[] {""} ;
      T01HM74_A2381AbcSec = new String[] {""} ;
      T01HM74_A252CliCod = new int[1] ;
      T01HM74_n252CliCod = new boolean[] {false} ;
      T01HM75_A396EmprCod = new String[] {""} ;
      T01HM75_A252CliCod = new int[1] ;
      T01HM75_n252CliCod = new boolean[] {false} ;
      T01HM75_A2308CliDesCod = new int[1] ;
      T01HM76_A396EmprCod = new String[] {""} ;
      T01HM76_A2268MovParCod = new String[] {""} ;
      T01HM76_A252CliCod = new int[1] ;
      T01HM76_n252CliCod = new boolean[] {false} ;
      T01HM77_A396EmprCod = new String[] {""} ;
      T01HM77_A966PartCod = new String[] {""} ;
      T01HM77_A252CliCod = new int[1] ;
      T01HM77_n252CliCod = new boolean[] {false} ;
      T01HM78_A396EmprCod = new String[] {""} ;
      T01HM78_A1387AlbPrvCod = new int[1] ;
      T01HM79_A396EmprCod = new String[] {""} ;
      T01HM79_A252CliCod = new int[1] ;
      T01HM79_n252CliCod = new boolean[] {false} ;
      T01HM79_A1213TalCod = new String[] {""} ;
      T01HM80_A396EmprCod = new String[] {""} ;
      T01HM80_A252CliCod = new int[1] ;
      T01HM80_n252CliCod = new boolean[] {false} ;
      T01HM80_A457FasCod = new String[] {""} ;
      T01HM81_A396EmprCod = new String[] {""} ;
      T01HM81_A539HisBarCod = new int[1] ;
      T01HM81_A545HisCodReo = new byte[1] ;
      T01HM81_A544HisCodPar = new String[] {""} ;
      T01HM81_A833TipDefCod = new short[1] ;
      T01HM82_A396EmprCod = new String[] {""} ;
      T01HM82_A506HbaBarCod = new int[1] ;
      T01HM82_A508HbaBarReo = new byte[1] ;
      T01HM82_A507HbaBarPar = new String[] {""} ;
      T01HM83_A396EmprCod = new String[] {""} ;
      T01HM83_A252CliCod = new int[1] ;
      T01HM83_n252CliCod = new boolean[] {false} ;
      T01HM83_A494ForSer = new String[] {""} ;
      T01HM83_A482ForColNom = new String[] {""} ;
      T01HM83_A483ForColNum = new int[1] ;
      T01HM83_A831TipColCod = new byte[1] ;
      T01HM84_A396EmprCod = new String[] {""} ;
      T01HM84_A252CliCod = new int[1] ;
      T01HM84_n252CliCod = new boolean[] {false} ;
      T01HM84_A287CliPagLin = new byte[1] ;
      T01HM85_A396EmprCod = new String[] {""} ;
      T01HM85_A252CliCod = new int[1] ;
      T01HM85_n252CliCod = new boolean[] {false} ;
      T01HM85_A266CliEnvLin = new byte[1] ;
      T01HM86_A396EmprCod = new String[] {""} ;
      T01HM86_A252CliCod = new int[1] ;
      T01HM86_n252CliCod = new boolean[] {false} ;
      T01HM86_A65ArtCod = new String[] {""} ;
      T01HM87_A396EmprCod = new String[] {""} ;
      T01HM87_A44AlbRecCod = new int[1] ;
      T01HM88_A396EmprCod = new String[] {""} ;
      T01HM88_A30AlbProCod = new long[1] ;
      T01HM89_A396EmprCod = new String[] {""} ;
      T01HM89_A14AlbComCod = new int[1] ;
      T01HM90_A396EmprCod = new String[] {""} ;
      T01HM90_A252CliCod = new int[1] ;
      T01HM90_n252CliCod = new boolean[] {false} ;
      Z9715Tb1_Dsc = "" ;
      T01HM91_A252CliCod = new int[1] ;
      T01HM91_n252CliCod = new boolean[] {false} ;
      T01HM91_A9715Tb1_Dsc = new String[] {""} ;
      T01HM91_n9715Tb1_Dsc = new boolean[] {false} ;
      T01HM91_A396EmprCod = new String[] {""} ;
      T01HM91_A9713Tb1_Cod = new short[1] ;
      T01HM15_A9715Tb1_Dsc = new String[] {""} ;
      T01HM15_n9715Tb1_Dsc = new boolean[] {false} ;
      T01HM92_A9715Tb1_Dsc = new String[] {""} ;
      T01HM92_n9715Tb1_Dsc = new boolean[] {false} ;
      T01HM93_A396EmprCod = new String[] {""} ;
      T01HM93_A252CliCod = new int[1] ;
      T01HM93_n252CliCod = new boolean[] {false} ;
      T01HM93_A9713Tb1_Cod = new short[1] ;
      T01HM14_A252CliCod = new int[1] ;
      T01HM14_n252CliCod = new boolean[] {false} ;
      T01HM14_A396EmprCod = new String[] {""} ;
      T01HM14_A9713Tb1_Cod = new short[1] ;
      T01HM13_A252CliCod = new int[1] ;
      T01HM13_n252CliCod = new boolean[] {false} ;
      T01HM13_A396EmprCod = new String[] {""} ;
      T01HM13_A9713Tb1_Cod = new short[1] ;
      T01HM96_A9715Tb1_Dsc = new String[] {""} ;
      T01HM96_n9715Tb1_Dsc = new boolean[] {false} ;
      T01HM97_A396EmprCod = new String[] {""} ;
      T01HM97_A252CliCod = new int[1] ;
      T01HM97_n252CliCod = new boolean[] {false} ;
      T01HM97_A9713Tb1_Cod = new short[1] ;
      T01HM97_A11736CCArtCod = new String[] {""} ;
      T01HM98_A396EmprCod = new String[] {""} ;
      T01HM98_A252CliCod = new int[1] ;
      T01HM98_n252CliCod = new boolean[] {false} ;
      T01HM98_A9713Tb1_Cod = new short[1] ;
      T01HM99_A252CliCod = new int[1] ;
      T01HM99_n252CliCod = new boolean[] {false} ;
      T01HM99_A9713Tb1_Cod = new short[1] ;
      T01HM99_A11736CCArtCod = new String[] {""} ;
      T01HM99_A396EmprCod = new String[] {""} ;
      T01HM100_A396EmprCod = new String[] {""} ;
      T01HM100_A252CliCod = new int[1] ;
      T01HM100_n252CliCod = new boolean[] {false} ;
      T01HM100_A9713Tb1_Cod = new short[1] ;
      T01HM100_A11736CCArtCod = new String[] {""} ;
      T01HM12_A252CliCod = new int[1] ;
      T01HM12_n252CliCod = new boolean[] {false} ;
      T01HM12_A9713Tb1_Cod = new short[1] ;
      T01HM12_A11736CCArtCod = new String[] {""} ;
      T01HM12_A396EmprCod = new String[] {""} ;
      T01HM11_A252CliCod = new int[1] ;
      T01HM11_n252CliCod = new boolean[] {false} ;
      T01HM11_A9713Tb1_Cod = new short[1] ;
      T01HM11_A11736CCArtCod = new String[] {""} ;
      T01HM11_A396EmprCod = new String[] {""} ;
      T01HM103_A396EmprCod = new String[] {""} ;
      T01HM103_A252CliCod = new int[1] ;
      T01HM103_n252CliCod = new boolean[] {false} ;
      T01HM103_A9713Tb1_Cod = new short[1] ;
      T01HM103_A11736CCArtCod = new String[] {""} ;
      T01HM103_A11748TipArtiId = new short[1] ;
      T01HM104_A396EmprCod = new String[] {""} ;
      T01HM104_A252CliCod = new int[1] ;
      T01HM104_n252CliCod = new boolean[] {false} ;
      T01HM104_A9713Tb1_Cod = new short[1] ;
      T01HM104_A11736CCArtCod = new String[] {""} ;
      T01HM105_A252CliCod = new int[1] ;
      T01HM105_n252CliCod = new boolean[] {false} ;
      T01HM105_A9713Tb1_Cod = new short[1] ;
      T01HM105_A11736CCArtCod = new String[] {""} ;
      T01HM105_A11748TipArtiId = new short[1] ;
      T01HM105_A396EmprCod = new String[] {""} ;
      T01HM106_A396EmprCod = new String[] {""} ;
      T01HM106_A252CliCod = new int[1] ;
      T01HM106_n252CliCod = new boolean[] {false} ;
      T01HM106_A9713Tb1_Cod = new short[1] ;
      T01HM106_A11736CCArtCod = new String[] {""} ;
      T01HM106_A11748TipArtiId = new short[1] ;
      T01HM10_A252CliCod = new int[1] ;
      T01HM10_n252CliCod = new boolean[] {false} ;
      T01HM10_A9713Tb1_Cod = new short[1] ;
      T01HM10_A11736CCArtCod = new String[] {""} ;
      T01HM10_A11748TipArtiId = new short[1] ;
      T01HM10_A396EmprCod = new String[] {""} ;
      T01HM9_A252CliCod = new int[1] ;
      T01HM9_n252CliCod = new boolean[] {false} ;
      T01HM9_A9713Tb1_Cod = new short[1] ;
      T01HM9_A11736CCArtCod = new String[] {""} ;
      T01HM9_A11748TipArtiId = new short[1] ;
      T01HM9_A396EmprCod = new String[] {""} ;
      T01HM109_A396EmprCod = new String[] {""} ;
      T01HM109_A252CliCod = new int[1] ;
      T01HM109_n252CliCod = new boolean[] {false} ;
      T01HM109_A9713Tb1_Cod = new short[1] ;
      T01HM109_A11736CCArtCod = new String[] {""} ;
      T01HM109_A11748TipArtiId = new short[1] ;
      T01HM109_A11737CCColNom = new String[] {""} ;
      T01HM109_A11738CCColNum = new int[1] ;
      T01HM109_A11749CCCTc = new byte[1] ;
      T01HM110_A396EmprCod = new String[] {""} ;
      T01HM110_A252CliCod = new int[1] ;
      T01HM110_n252CliCod = new boolean[] {false} ;
      T01HM110_A9713Tb1_Cod = new short[1] ;
      T01HM110_A11736CCArtCod = new String[] {""} ;
      T01HM110_A11748TipArtiId = new short[1] ;
      T01HM111_A252CliCod = new int[1] ;
      T01HM111_n252CliCod = new boolean[] {false} ;
      T01HM111_A9713Tb1_Cod = new short[1] ;
      T01HM111_A11736CCArtCod = new String[] {""} ;
      T01HM111_A11748TipArtiId = new short[1] ;
      T01HM111_A11737CCColNom = new String[] {""} ;
      T01HM111_A11738CCColNum = new int[1] ;
      T01HM111_A11749CCCTc = new byte[1] ;
      T01HM111_A396EmprCod = new String[] {""} ;
      T01HM112_A396EmprCod = new String[] {""} ;
      T01HM112_A252CliCod = new int[1] ;
      T01HM112_n252CliCod = new boolean[] {false} ;
      T01HM112_A9713Tb1_Cod = new short[1] ;
      T01HM112_A11736CCArtCod = new String[] {""} ;
      T01HM112_A11748TipArtiId = new short[1] ;
      T01HM112_A11737CCColNom = new String[] {""} ;
      T01HM112_A11738CCColNum = new int[1] ;
      T01HM112_A11749CCCTc = new byte[1] ;
      T01HM8_A252CliCod = new int[1] ;
      T01HM8_n252CliCod = new boolean[] {false} ;
      T01HM8_A9713Tb1_Cod = new short[1] ;
      T01HM8_A11736CCArtCod = new String[] {""} ;
      T01HM8_A11748TipArtiId = new short[1] ;
      T01HM8_A11737CCColNom = new String[] {""} ;
      T01HM8_A11738CCColNum = new int[1] ;
      T01HM8_A11749CCCTc = new byte[1] ;
      T01HM8_A396EmprCod = new String[] {""} ;
      T01HM7_A252CliCod = new int[1] ;
      T01HM7_n252CliCod = new boolean[] {false} ;
      T01HM7_A9713Tb1_Cod = new short[1] ;
      T01HM7_A11736CCArtCod = new String[] {""} ;
      T01HM7_A11748TipArtiId = new short[1] ;
      T01HM7_A11737CCColNom = new String[] {""} ;
      T01HM7_A11738CCColNum = new int[1] ;
      T01HM7_A11749CCCTc = new byte[1] ;
      T01HM7_A396EmprCod = new String[] {""} ;
      T01HM115_A396EmprCod = new String[] {""} ;
      T01HM115_A252CliCod = new int[1] ;
      T01HM115_n252CliCod = new boolean[] {false} ;
      T01HM115_A9713Tb1_Cod = new short[1] ;
      T01HM115_A11736CCArtCod = new String[] {""} ;
      T01HM115_A11748TipArtiId = new short[1] ;
      T01HM115_A11737CCColNom = new String[] {""} ;
      T01HM115_A11738CCColNum = new int[1] ;
      T01HM115_A11749CCCTc = new byte[1] ;
      T01HM115_A11750IntId = new short[1] ;
      T01HM116_A396EmprCod = new String[] {""} ;
      T01HM116_A252CliCod = new int[1] ;
      T01HM116_n252CliCod = new boolean[] {false} ;
      T01HM116_A9713Tb1_Cod = new short[1] ;
      T01HM116_A11736CCArtCod = new String[] {""} ;
      T01HM116_A11748TipArtiId = new short[1] ;
      T01HM116_A11737CCColNom = new String[] {""} ;
      T01HM116_A11738CCColNum = new int[1] ;
      T01HM116_A11749CCCTc = new byte[1] ;
      T01HM117_A252CliCod = new int[1] ;
      T01HM117_n252CliCod = new boolean[] {false} ;
      T01HM117_A9713Tb1_Cod = new short[1] ;
      T01HM117_A11736CCArtCod = new String[] {""} ;
      T01HM117_A11748TipArtiId = new short[1] ;
      T01HM117_A11737CCColNom = new String[] {""} ;
      T01HM117_A11738CCColNum = new int[1] ;
      T01HM117_A11749CCCTc = new byte[1] ;
      T01HM117_A11750IntId = new short[1] ;
      T01HM117_A396EmprCod = new String[] {""} ;
      T01HM118_A396EmprCod = new String[] {""} ;
      T01HM118_A252CliCod = new int[1] ;
      T01HM118_n252CliCod = new boolean[] {false} ;
      T01HM118_A9713Tb1_Cod = new short[1] ;
      T01HM118_A11736CCArtCod = new String[] {""} ;
      T01HM118_A11748TipArtiId = new short[1] ;
      T01HM118_A11737CCColNom = new String[] {""} ;
      T01HM118_A11738CCColNum = new int[1] ;
      T01HM118_A11749CCCTc = new byte[1] ;
      T01HM118_A11750IntId = new short[1] ;
      T01HM6_A252CliCod = new int[1] ;
      T01HM6_n252CliCod = new boolean[] {false} ;
      T01HM6_A9713Tb1_Cod = new short[1] ;
      T01HM6_A11736CCArtCod = new String[] {""} ;
      T01HM6_A11748TipArtiId = new short[1] ;
      T01HM6_A11737CCColNom = new String[] {""} ;
      T01HM6_A11738CCColNum = new int[1] ;
      T01HM6_A11749CCCTc = new byte[1] ;
      T01HM6_A11750IntId = new short[1] ;
      T01HM6_A396EmprCod = new String[] {""} ;
      T01HM5_A252CliCod = new int[1] ;
      T01HM5_n252CliCod = new boolean[] {false} ;
      T01HM5_A9713Tb1_Cod = new short[1] ;
      T01HM5_A11736CCArtCod = new String[] {""} ;
      T01HM5_A11748TipArtiId = new short[1] ;
      T01HM5_A11737CCColNom = new String[] {""} ;
      T01HM5_A11738CCColNum = new int[1] ;
      T01HM5_A11749CCCTc = new byte[1] ;
      T01HM5_A11750IntId = new short[1] ;
      T01HM5_A396EmprCod = new String[] {""} ;
      T01HM121_A396EmprCod = new String[] {""} ;
      T01HM121_A252CliCod = new int[1] ;
      T01HM121_n252CliCod = new boolean[] {false} ;
      T01HM121_A9713Tb1_Cod = new short[1] ;
      T01HM121_A11736CCArtCod = new String[] {""} ;
      T01HM121_A11748TipArtiId = new short[1] ;
      T01HM121_A11737CCColNom = new String[] {""} ;
      T01HM121_A11738CCColNum = new int[1] ;
      T01HM121_A11749CCCTc = new byte[1] ;
      T01HM121_A11750IntId = new short[1] ;
      T01HM121_A4031CCTCod = new int[1] ;
      T01HM121_A4034CCTLin = new short[1] ;
      T01HM122_A396EmprCod = new String[] {""} ;
      T01HM122_A252CliCod = new int[1] ;
      T01HM122_n252CliCod = new boolean[] {false} ;
      T01HM122_A9713Tb1_Cod = new short[1] ;
      T01HM122_A11736CCArtCod = new String[] {""} ;
      T01HM122_A11748TipArtiId = new short[1] ;
      T01HM122_A11737CCColNom = new String[] {""} ;
      T01HM122_A11738CCColNum = new int[1] ;
      T01HM122_A11749CCCTc = new byte[1] ;
      T01HM122_A11750IntId = new short[1] ;
      Z4036CCTDsc = "" ;
      T01HM123_A252CliCod = new int[1] ;
      T01HM123_n252CliCod = new boolean[] {false} ;
      T01HM123_A9713Tb1_Cod = new short[1] ;
      T01HM123_A11736CCArtCod = new String[] {""} ;
      T01HM123_A11748TipArtiId = new short[1] ;
      T01HM123_A11737CCColNom = new String[] {""} ;
      T01HM123_A11738CCColNum = new int[1] ;
      T01HM123_A11749CCCTc = new byte[1] ;
      T01HM123_A11750IntId = new short[1] ;
      T01HM123_A4036CCTDsc = new String[] {""} ;
      T01HM123_A396EmprCod = new String[] {""} ;
      T01HM123_A4031CCTCod = new int[1] ;
      T01HM4_A4036CCTDsc = new String[] {""} ;
      T01HM124_A4036CCTDsc = new String[] {""} ;
      T01HM125_A396EmprCod = new String[] {""} ;
      T01HM125_A252CliCod = new int[1] ;
      T01HM125_n252CliCod = new boolean[] {false} ;
      T01HM125_A9713Tb1_Cod = new short[1] ;
      T01HM125_A11736CCArtCod = new String[] {""} ;
      T01HM125_A11748TipArtiId = new short[1] ;
      T01HM125_A11737CCColNom = new String[] {""} ;
      T01HM125_A11738CCColNum = new int[1] ;
      T01HM125_A11749CCCTc = new byte[1] ;
      T01HM125_A11750IntId = new short[1] ;
      T01HM125_A4031CCTCod = new int[1] ;
      T01HM3_A252CliCod = new int[1] ;
      T01HM3_n252CliCod = new boolean[] {false} ;
      T01HM3_A9713Tb1_Cod = new short[1] ;
      T01HM3_A11736CCArtCod = new String[] {""} ;
      T01HM3_A11748TipArtiId = new short[1] ;
      T01HM3_A11737CCColNom = new String[] {""} ;
      T01HM3_A11738CCColNum = new int[1] ;
      T01HM3_A11749CCCTc = new byte[1] ;
      T01HM3_A11750IntId = new short[1] ;
      T01HM3_A396EmprCod = new String[] {""} ;
      T01HM3_A4031CCTCod = new int[1] ;
      sMode1651 = "" ;
      T01HM2_A252CliCod = new int[1] ;
      T01HM2_n252CliCod = new boolean[] {false} ;
      T01HM2_A9713Tb1_Cod = new short[1] ;
      T01HM2_A11736CCArtCod = new String[] {""} ;
      T01HM2_A11748TipArtiId = new short[1] ;
      T01HM2_A11737CCColNom = new String[] {""} ;
      T01HM2_A11738CCColNum = new int[1] ;
      T01HM2_A11749CCCTc = new byte[1] ;
      T01HM2_A11750IntId = new short[1] ;
      T01HM2_A396EmprCod = new String[] {""} ;
      T01HM2_A4031CCTCod = new int[1] ;
      T01HM128_A4036CCTDsc = new String[] {""} ;
      T01HM129_A396EmprCod = new String[] {""} ;
      T01HM129_A252CliCod = new int[1] ;
      T01HM129_n252CliCod = new boolean[] {false} ;
      T01HM129_A9713Tb1_Cod = new short[1] ;
      T01HM129_A11736CCArtCod = new String[] {""} ;
      T01HM129_A11748TipArtiId = new short[1] ;
      T01HM129_A11737CCColNom = new String[] {""} ;
      T01HM129_A11738CCColNum = new int[1] ;
      T01HM129_A11749CCCTc = new byte[1] ;
      T01HM129_A11750IntId = new short[1] ;
      T01HM129_A4031CCTCod = new int[1] ;
      T01HM129_A4034CCTLin = new short[1] ;
      T01HM130_A396EmprCod = new String[] {""} ;
      T01HM130_A252CliCod = new int[1] ;
      T01HM130_n252CliCod = new boolean[] {false} ;
      T01HM130_A9713Tb1_Cod = new short[1] ;
      T01HM130_A11736CCArtCod = new String[] {""} ;
      T01HM130_A11748TipArtiId = new short[1] ;
      T01HM130_A11737CCColNom = new String[] {""} ;
      T01HM130_A11738CCColNum = new int[1] ;
      T01HM130_A11749CCCTc = new byte[1] ;
      T01HM130_A11750IntId = new short[1] ;
      T01HM130_A4031CCTCod = new int[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      lblTitlearticulos_Jsonclick = "" ;
      Grid2Container = new com.genexus.webpanels.GXWebGrid(context);
      Grid2Row = new com.genexus.webpanels.GXWebRow();
      subGrid2_Linesclass = "" ;
      lblTitletipoarticulo_Jsonclick = "" ;
      Grid3Container = new com.genexus.webpanels.GXWebGrid(context);
      Grid3Row = new com.genexus.webpanels.GXWebRow();
      subGrid3_Linesclass = "" ;
      lblTitlecolores_Jsonclick = "" ;
      Grid4Container = new com.genexus.webpanels.GXWebGrid(context);
      Grid4Row = new com.genexus.webpanels.GXWebRow();
      subGrid4_Linesclass = "" ;
      lblTitleintensidades_Jsonclick = "" ;
      Grid5Container = new com.genexus.webpanels.GXWebGrid(context);
      Grid5Row = new com.genexus.webpanels.GXWebRow();
      subGrid5_Linesclass = "" ;
      lblTitlecontroles_Jsonclick = "" ;
      Gridtcccc_qualityrequeriments_articulos_tiposarticulo_colores_intensidades_controlesContainer = new com.genexus.webpanels.GXWebGrid(context);
      Gridtcccc_qualityrequeriments_articulos_tiposarticulo_colores_intensidades_controlesRow = new com.genexus.webpanels.GXWebRow();
      subGridtcccc_qualityrequeriments_articulos_tiposarticulo_colores_intensidades_controles_Linesclass = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      subGrid1_Header = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      subGrid2_Header = "" ;
      Grid2Column = new com.genexus.webpanels.GXWebColumn();
      subGrid3_Header = "" ;
      Grid3Column = new com.genexus.webpanels.GXWebColumn();
      subGrid4_Header = "" ;
      Grid4Column = new com.genexus.webpanels.GXWebColumn();
      subGrid5_Header = "" ;
      Grid5Column = new com.genexus.webpanels.GXWebColumn();
      Gridtcccc_qualityrequeriments_articulos_tiposarticulo_colores_intensidades_controlesColumn = new com.genexus.webpanels.GXWebColumn();
      ZZ396EmprCod = "" ;
      ZZ279CliNom = "" ;
      ZZ407EmprNom = "" ;
      Z11745CCArtdsc = "" ;
      Z11746TipArtiDs = "" ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      GXv_int3 = new byte[1] ;
      GXv_char2 = new String[1] ;
      Z11747IntDs = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tcccc__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tcccc__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tcccc__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tcccc__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tcccc__default(),
         new Object[] {
             new Object[] {
            T01HM2_A252CliCod, T01HM2_A9713Tb1_Cod, T01HM2_A11736CCArtCod, T01HM2_A11748TipArtiId, T01HM2_A11737CCColNom, T01HM2_A11738CCColNum, T01HM2_A11749CCCTc, T01HM2_A11750IntId, T01HM2_A396EmprCod, T01HM2_A4031CCTCod
            }
            , new Object[] {
            T01HM3_A252CliCod, T01HM3_A9713Tb1_Cod, T01HM3_A11736CCArtCod, T01HM3_A11748TipArtiId, T01HM3_A11737CCColNom, T01HM3_A11738CCColNum, T01HM3_A11749CCCTc, T01HM3_A11750IntId, T01HM3_A396EmprCod, T01HM3_A4031CCTCod
            }
            , new Object[] {
            T01HM4_A4036CCTDsc
            }
            , new Object[] {
            T01HM5_A252CliCod, T01HM5_A9713Tb1_Cod, T01HM5_A11736CCArtCod, T01HM5_A11748TipArtiId, T01HM5_A11737CCColNom, T01HM5_A11738CCColNum, T01HM5_A11749CCCTc, T01HM5_A11750IntId, T01HM5_A396EmprCod
            }
            , new Object[] {
            T01HM6_A252CliCod, T01HM6_A9713Tb1_Cod, T01HM6_A11736CCArtCod, T01HM6_A11748TipArtiId, T01HM6_A11737CCColNom, T01HM6_A11738CCColNum, T01HM6_A11749CCCTc, T01HM6_A11750IntId, T01HM6_A396EmprCod
            }
            , new Object[] {
            T01HM7_A252CliCod, T01HM7_A9713Tb1_Cod, T01HM7_A11736CCArtCod, T01HM7_A11748TipArtiId, T01HM7_A11737CCColNom, T01HM7_A11738CCColNum, T01HM7_A11749CCCTc, T01HM7_A396EmprCod
            }
            , new Object[] {
            T01HM8_A252CliCod, T01HM8_A9713Tb1_Cod, T01HM8_A11736CCArtCod, T01HM8_A11748TipArtiId, T01HM8_A11737CCColNom, T01HM8_A11738CCColNum, T01HM8_A11749CCCTc, T01HM8_A396EmprCod
            }
            , new Object[] {
            T01HM9_A252CliCod, T01HM9_A9713Tb1_Cod, T01HM9_A11736CCArtCod, T01HM9_A11748TipArtiId, T01HM9_A396EmprCod
            }
            , new Object[] {
            T01HM10_A252CliCod, T01HM10_A9713Tb1_Cod, T01HM10_A11736CCArtCod, T01HM10_A11748TipArtiId, T01HM10_A396EmprCod
            }
            , new Object[] {
            T01HM11_A252CliCod, T01HM11_A9713Tb1_Cod, T01HM11_A11736CCArtCod, T01HM11_A396EmprCod
            }
            , new Object[] {
            T01HM12_A252CliCod, T01HM12_A9713Tb1_Cod, T01HM12_A11736CCArtCod, T01HM12_A396EmprCod
            }
            , new Object[] {
            T01HM13_A252CliCod, T01HM13_A396EmprCod, T01HM13_A9713Tb1_Cod
            }
            , new Object[] {
            T01HM14_A252CliCod, T01HM14_A396EmprCod, T01HM14_A9713Tb1_Cod
            }
            , new Object[] {
            T01HM15_A9715Tb1_Dsc, T01HM15_n9715Tb1_Dsc
            }
            , new Object[] {
            T01HM16_A252CliCod, T01HM16_A279CliNom, T01HM16_A396EmprCod
            }
            , new Object[] {
            T01HM17_A252CliCod, T01HM17_A279CliNom, T01HM17_A396EmprCod
            }
            , new Object[] {
            T01HM18_A407EmprNom, T01HM18_n407EmprNom
            }
            , new Object[] {
            T01HM19_A252CliCod, T01HM19_A407EmprNom, T01HM19_n407EmprNom, T01HM19_A279CliNom, T01HM19_A396EmprCod
            }
            , new Object[] {
            T01HM20_A407EmprNom, T01HM20_n407EmprNom
            }
            , new Object[] {
            T01HM21_A396EmprCod, T01HM21_A252CliCod
            }
            , new Object[] {
            T01HM22_A396EmprCod, T01HM22_A252CliCod
            }
            , new Object[] {
            T01HM23_A396EmprCod, T01HM23_A252CliCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01HM27_A407EmprNom, T01HM27_n407EmprNom
            }
            , new Object[] {
            T01HM28_A396EmprCod, T01HM28_A252CliCod, T01HM28_A6930Lb_rclin
            }
            , new Object[] {
            T01HM29_A396EmprCod, T01HM29_A6850Tex_NPed
            }
            , new Object[] {
            T01HM30_A396EmprCod, T01HM30_A252CliCod, T01HM30_A829TipArtCod, T01HM30_A831TipColCod, T01HM30_A583IntCod, T01HM30_A5098TipDisCod, T01HM30_A6603Est1_anyo, T01HM30_A6604Est1_mes, T01HM30_A6605Est1_dia
            }
            , new Object[] {
            T01HM31_A396EmprCod, T01HM31_A6319C_Barcod, T01HM31_A6320C_Barcodre, T01HM31_A6321C_Barcodpa, T01HM31_A6322C_Reclinma
            }
            , new Object[] {
            T01HM32_A396EmprCod, T01HM32_A6235DevEmpCod
            }
            , new Object[] {
            T01HM33_A396EmprCod, T01HM33_A602MaqCod, T01HM33_A6078MaqCliCod, T01HM33_A6079MaqArtCod
            }
            , new Object[] {
            T01HM34_A396EmprCod, T01HM34_A5532Lb_numero
            }
            , new Object[] {
            T01HM35_A396EmprCod, T01HM35_A252CliCod, T01HM35_A5503CliifLin
            }
            , new Object[] {
            T01HM36_A396EmprCod, T01HM36_A252CliCod, T01HM36_A5499ClieiLin
            }
            , new Object[] {
            T01HM37_A396EmprCod, T01HM37_A252CliCod, T01HM37_A5495ClidtLin
            }
            , new Object[] {
            T01HM38_A396EmprCod, T01HM38_A252CliCod, T01HM38_A5491CliedLin
            }
            , new Object[] {
            T01HM39_A396EmprCod, T01HM39_A252CliCod, T01HM39_A5452P_ForCod
            }
            , new Object[] {
            T01HM40_A396EmprCod, T01HM40_A252CliCod, T01HM40_A5443Mdl_Cod
            }
            , new Object[] {
            T01HM41_A396EmprCod, T01HM41_A252CliCod, T01HM41_A5436IntCodF2
            }
            , new Object[] {
            T01HM42_A396EmprCod, T01HM42_A252CliCod, T01HM42_A5396IntCodFC, T01HM42_A5434Tip_ColC
            }
            , new Object[] {
            T01HM43_A396EmprCod, T01HM43_A252CliCod, T01HM43_A5428FasPreCod
            }
            , new Object[] {
            T01HM44_A396EmprCod, T01HM44_A252CliCod, T01HM44_A5398Cli_Proc
            }
            , new Object[] {
            T01HM45_A396EmprCod, T01HM45_A5130PagIden
            }
            , new Object[] {
            T01HM46_A396EmprCod, T01HM46_A5059Hl_hdr, T01HM46_A5060Hl_hdrr, T01HM46_A5061Hl_hdrp
            }
            , new Object[] {
            T01HM47_A396EmprCod, T01HM47_A252CliCod, T01HM47_A4718DishCod, T01HM47_A5020TipEstCod, T01HM47_A5022GraCod
            }
            , new Object[] {
            T01HM48_A396EmprCod, T01HM48_A4618EnsLCod
            }
            , new Object[] {
            T01HM49_A396EmprCod, T01HM49_A4492HreBarCod, T01HM49_A4493HreBarReo, T01HM49_A4494HreBarPar, T01HM49_A4495HreNumCie
            }
            , new Object[] {
            T01HM50_A396EmprCod, T01HM50_A252CliCod, T01HM50_A4415EstCol
            }
            , new Object[] {
            T01HM51_A396EmprCod, T01HM51_A4185WEBUSU
            }
            , new Object[] {
            T01HM52_A396EmprCod, T01HM52_A252CliCod, T01HM52_A4079WEBDISCOD, T01HM52_A4078EMPCOD
            }
            , new Object[] {
            T01HM53_A396EmprCod, T01HM53_A2637HisEstHRu, T01HM53_A2636HisEstHRe, T01HM53_A2635HisEstHPa, T01HM53_A2638HisEstLCo, T01HM53_A2630HisEstCom, T01HM53_A2634HisEstFon
            }
            , new Object[] {
            T01HM54_A396EmprCod, T01HM54_A2574GrpDibCod
            }
            , new Object[] {
            T01HM55_A396EmprCod, T01HM55_A2558GrmDibCod
            }
            , new Object[] {
            T01HM56_A396EmprCod, T01HM56_A2542GrcDibCod
            }
            , new Object[] {
            T01HM57_A396EmprCod, T01HM57_A1031EmpesCod, T01HM57_A252CliCod, T01HM57_A1032FonCod
            }
            , new Object[] {
            T01HM58_A396EmprCod, T01HM58_A1013DibCli, T01HM58_A252CliCod, T01HM58_A1014DibInt
            }
            , new Object[] {
            T01HM59_A396EmprCod, T01HM59_A1736AlbExtCod
            }
            , new Object[] {
            T01HM60_A396EmprCod, T01HM60_A252CliCod, T01HM60_A3661FacProAny, T01HM60_A3662FacProSer, T01HM60_A3663FacProInt, T01HM60_A3664FacProTip, T01HM60_A3665FacProTar
            }
            , new Object[] {
            T01HM61_A396EmprCod, T01HM61_A3646EstTinAny, T01HM61_A3647EstTinMes, T01HM61_A3648EstTinDia, T01HM61_A1929EstTinNr
            }
            , new Object[] {
            T01HM62_A396EmprCod, T01HM62_A3617AlbTrnCod
            }
            , new Object[] {
            T01HM63_A396EmprCod, T01HM63_A252CliCod, T01HM63_A3320CliLimKgs
            }
            , new Object[] {
            T01HM64_A396EmprCod, T01HM64_A3073RepCod, T01HM64_A252CliCod
            }
            , new Object[] {
            T01HM65_A396EmprCod, T01HM65_A3061Codia, T01HM65_A3062CoMes, T01HM65_A3063CoAny, T01HM65_A3065CoLin, T01HM65_A3010CoBarCod, T01HM65_A3011CoBarReo, T01HM65_A3012CoBarPar
            }
            , new Object[] {
            T01HM66_A396EmprCod, T01HM66_A2971SabFacCod
            }
            , new Object[] {
            T01HM67_A396EmprCod, T01HM67_A2954TiDia, T01HM67_A2955TiMes, T01HM67_A2956TiAny, T01HM67_A2958TiLin, T01HM67_A2959TiBarCod, T01HM67_A2960TiBarReo, T01HM67_A2961TiBarPar
            }
            , new Object[] {
            T01HM68_A396EmprCod, T01HM68_A252CliCod, T01HM68_A2933RecTipCon
            }
            , new Object[] {
            T01HM69_A396EmprCod, T01HM69_A252CliCod, T01HM69_A2927RecProCod
            }
            , new Object[] {
            T01HM70_A396EmprCod, T01HM70_A252CliCod, T01HM70_A2891HMaForSer, T01HM70_A2892HMaForCNom, T01HM70_A2893HMaForCNum, T01HM70_A2894HMaTipCCod, T01HM70_A2895HMaForNumC, T01HM70_A2897HMaColLin, T01HM70_A2896HMaFec, T01HM70_A2907HmaLin
            }
            , new Object[] {
            T01HM71_A396EmprCod, T01HM71_A252CliCod, T01HM71_A425EstAny, T01HM71_A2755EstSerFac
            }
            , new Object[] {
            T01HM72_A396EmprCod, T01HM72_A2730RecTipCo, T01HM72_A252CliCod
            }
            , new Object[] {
            T01HM73_A396EmprCod, T01HM73_A2720TarSec, T01HM73_A252CliCod, T01HM73_A829TipArtCod, T01HM73_A831TipColCod
            }
            , new Object[] {
            T01HM74_A396EmprCod, T01HM74_A2382AbcTerCod, T01HM74_A2381AbcSec, T01HM74_A252CliCod
            }
            , new Object[] {
            T01HM75_A396EmprCod, T01HM75_A252CliCod, T01HM75_A2308CliDesCod
            }
            , new Object[] {
            T01HM76_A396EmprCod, T01HM76_A2268MovParCod, T01HM76_A252CliCod
            }
            , new Object[] {
            T01HM77_A396EmprCod, T01HM77_A966PartCod, T01HM77_A252CliCod
            }
            , new Object[] {
            T01HM78_A396EmprCod, T01HM78_A1387AlbPrvCod
            }
            , new Object[] {
            T01HM79_A396EmprCod, T01HM79_A252CliCod, T01HM79_A1213TalCod
            }
            , new Object[] {
            T01HM80_A396EmprCod, T01HM80_A252CliCod, T01HM80_A457FasCod
            }
            , new Object[] {
            T01HM81_A396EmprCod, T01HM81_A539HisBarCod, T01HM81_A545HisCodReo, T01HM81_A544HisCodPar, T01HM81_A833TipDefCod
            }
            , new Object[] {
            T01HM82_A396EmprCod, T01HM82_A506HbaBarCod, T01HM82_A508HbaBarReo, T01HM82_A507HbaBarPar
            }
            , new Object[] {
            T01HM83_A396EmprCod, T01HM83_A252CliCod, T01HM83_A494ForSer, T01HM83_A482ForColNom, T01HM83_A483ForColNum, T01HM83_A831TipColCod
            }
            , new Object[] {
            T01HM84_A396EmprCod, T01HM84_A252CliCod, T01HM84_A287CliPagLin
            }
            , new Object[] {
            T01HM85_A396EmprCod, T01HM85_A252CliCod, T01HM85_A266CliEnvLin
            }
            , new Object[] {
            T01HM86_A396EmprCod, T01HM86_A252CliCod, T01HM86_A65ArtCod
            }
            , new Object[] {
            T01HM87_A396EmprCod, T01HM87_A44AlbRecCod
            }
            , new Object[] {
            T01HM88_A396EmprCod, T01HM88_A30AlbProCod
            }
            , new Object[] {
            T01HM89_A396EmprCod, T01HM89_A14AlbComCod
            }
            , new Object[] {
            T01HM90_A396EmprCod, T01HM90_A252CliCod
            }
            , new Object[] {
            T01HM91_A252CliCod, T01HM91_A9715Tb1_Dsc, T01HM91_n9715Tb1_Dsc, T01HM91_A396EmprCod, T01HM91_A9713Tb1_Cod
            }
            , new Object[] {
            T01HM92_A9715Tb1_Dsc, T01HM92_n9715Tb1_Dsc
            }
            , new Object[] {
            T01HM93_A396EmprCod, T01HM93_A252CliCod, T01HM93_A9713Tb1_Cod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01HM96_A9715Tb1_Dsc, T01HM96_n9715Tb1_Dsc
            }
            , new Object[] {
            T01HM97_A396EmprCod, T01HM97_A252CliCod, T01HM97_A9713Tb1_Cod, T01HM97_A11736CCArtCod
            }
            , new Object[] {
            T01HM98_A396EmprCod, T01HM98_A252CliCod, T01HM98_A9713Tb1_Cod
            }
            , new Object[] {
            T01HM99_A252CliCod, T01HM99_A9713Tb1_Cod, T01HM99_A11736CCArtCod, T01HM99_A396EmprCod
            }
            , new Object[] {
            T01HM100_A396EmprCod, T01HM100_A252CliCod, T01HM100_A9713Tb1_Cod, T01HM100_A11736CCArtCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01HM103_A396EmprCod, T01HM103_A252CliCod, T01HM103_A9713Tb1_Cod, T01HM103_A11736CCArtCod, T01HM103_A11748TipArtiId
            }
            , new Object[] {
            T01HM104_A396EmprCod, T01HM104_A252CliCod, T01HM104_A9713Tb1_Cod, T01HM104_A11736CCArtCod
            }
            , new Object[] {
            T01HM105_A252CliCod, T01HM105_A9713Tb1_Cod, T01HM105_A11736CCArtCod, T01HM105_A11748TipArtiId, T01HM105_A396EmprCod
            }
            , new Object[] {
            T01HM106_A396EmprCod, T01HM106_A252CliCod, T01HM106_A9713Tb1_Cod, T01HM106_A11736CCArtCod, T01HM106_A11748TipArtiId
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01HM109_A396EmprCod, T01HM109_A252CliCod, T01HM109_A9713Tb1_Cod, T01HM109_A11736CCArtCod, T01HM109_A11748TipArtiId, T01HM109_A11737CCColNom, T01HM109_A11738CCColNum, T01HM109_A11749CCCTc
            }
            , new Object[] {
            T01HM110_A396EmprCod, T01HM110_A252CliCod, T01HM110_A9713Tb1_Cod, T01HM110_A11736CCArtCod, T01HM110_A11748TipArtiId
            }
            , new Object[] {
            T01HM111_A252CliCod, T01HM111_A9713Tb1_Cod, T01HM111_A11736CCArtCod, T01HM111_A11748TipArtiId, T01HM111_A11737CCColNom, T01HM111_A11738CCColNum, T01HM111_A11749CCCTc, T01HM111_A396EmprCod
            }
            , new Object[] {
            T01HM112_A396EmprCod, T01HM112_A252CliCod, T01HM112_A9713Tb1_Cod, T01HM112_A11736CCArtCod, T01HM112_A11748TipArtiId, T01HM112_A11737CCColNom, T01HM112_A11738CCColNum, T01HM112_A11749CCCTc
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01HM115_A396EmprCod, T01HM115_A252CliCod, T01HM115_A9713Tb1_Cod, T01HM115_A11736CCArtCod, T01HM115_A11748TipArtiId, T01HM115_A11737CCColNom, T01HM115_A11738CCColNum, T01HM115_A11749CCCTc, T01HM115_A11750IntId
            }
            , new Object[] {
            T01HM116_A396EmprCod, T01HM116_A252CliCod, T01HM116_A9713Tb1_Cod, T01HM116_A11736CCArtCod, T01HM116_A11748TipArtiId, T01HM116_A11737CCColNom, T01HM116_A11738CCColNum, T01HM116_A11749CCCTc
            }
            , new Object[] {
            T01HM117_A252CliCod, T01HM117_A9713Tb1_Cod, T01HM117_A11736CCArtCod, T01HM117_A11748TipArtiId, T01HM117_A11737CCColNom, T01HM117_A11738CCColNum, T01HM117_A11749CCCTc, T01HM117_A11750IntId, T01HM117_A396EmprCod
            }
            , new Object[] {
            T01HM118_A396EmprCod, T01HM118_A252CliCod, T01HM118_A9713Tb1_Cod, T01HM118_A11736CCArtCod, T01HM118_A11748TipArtiId, T01HM118_A11737CCColNom, T01HM118_A11738CCColNum, T01HM118_A11749CCCTc, T01HM118_A11750IntId
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01HM121_A396EmprCod, T01HM121_A252CliCod, T01HM121_A9713Tb1_Cod, T01HM121_A11736CCArtCod, T01HM121_A11748TipArtiId, T01HM121_A11737CCColNom, T01HM121_A11738CCColNum, T01HM121_A11749CCCTc, T01HM121_A11750IntId, T01HM121_A4031CCTCod,
            T01HM121_A4034CCTLin
            }
            , new Object[] {
            T01HM122_A396EmprCod, T01HM122_A252CliCod, T01HM122_A9713Tb1_Cod, T01HM122_A11736CCArtCod, T01HM122_A11748TipArtiId, T01HM122_A11737CCColNom, T01HM122_A11738CCColNum, T01HM122_A11749CCCTc, T01HM122_A11750IntId
            }
            , new Object[] {
            T01HM123_A252CliCod, T01HM123_A9713Tb1_Cod, T01HM123_A11736CCArtCod, T01HM123_A11748TipArtiId, T01HM123_A11737CCColNom, T01HM123_A11738CCColNum, T01HM123_A11749CCCTc, T01HM123_A11750IntId, T01HM123_A4036CCTDsc, T01HM123_A396EmprCod,
            T01HM123_A4031CCTCod
            }
            , new Object[] {
            T01HM124_A4036CCTDsc
            }
            , new Object[] {
            T01HM125_A396EmprCod, T01HM125_A252CliCod, T01HM125_A9713Tb1_Cod, T01HM125_A11736CCArtCod, T01HM125_A11748TipArtiId, T01HM125_A11737CCColNom, T01HM125_A11738CCColNum, T01HM125_A11749CCCTc, T01HM125_A11750IntId, T01HM125_A4031CCTCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01HM128_A4036CCTDsc
            }
            , new Object[] {
            T01HM129_A396EmprCod, T01HM129_A252CliCod, T01HM129_A9713Tb1_Cod, T01HM129_A11736CCArtCod, T01HM129_A11748TipArtiId, T01HM129_A11737CCColNom, T01HM129_A11738CCColNum, T01HM129_A11749CCCTc, T01HM129_A11750IntId, T01HM129_A4031CCTCod,
            T01HM129_A4034CCTLin
            }
            , new Object[] {
            T01HM130_A396EmprCod, T01HM130_A252CliCod, T01HM130_A9713Tb1_Cod, T01HM130_A11736CCArtCod, T01HM130_A11748TipArtiId, T01HM130_A11737CCColNom, T01HM130_A11738CCColNum, T01HM130_A11749CCCTc, T01HM130_A11750IntId, T01HM130_A4031CCTCod
            }
         }
      );
   }

   private byte Z11749CCCTc ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A11749CCCTc ;
   private byte Gx_BScreen ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte subGrid2_Backcolorstyle ;
   private byte subGrid2_Backstyle ;
   private byte subGrid3_Backcolorstyle ;
   private byte subGrid3_Backstyle ;
   private byte subGrid4_Backcolorstyle ;
   private byte subGrid4_Backstyle ;
   private byte subGrid5_Backcolorstyle ;
   private byte subGrid5_Backstyle ;
   private byte subGridtcccc_qualityrequeriments_articulos_tiposarticulo_colores_intensidades_controles_Backcolorstyle ;
   private byte subGridtcccc_qualityrequeriments_articulos_tiposarticulo_colores_intensidades_controles_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte subGrid2_Allowselection ;
   private byte subGrid2_Allowhovering ;
   private byte subGrid2_Allowcollapsing ;
   private byte subGrid2_Collapsed ;
   private byte subGrid3_Allowselection ;
   private byte subGrid3_Allowhovering ;
   private byte subGrid3_Allowcollapsing ;
   private byte subGrid3_Collapsed ;
   private byte subGrid4_Allowselection ;
   private byte subGrid4_Allowhovering ;
   private byte subGrid4_Allowcollapsing ;
   private byte subGrid4_Collapsed ;
   private byte subGrid5_Allowselection ;
   private byte subGrid5_Allowhovering ;
   private byte subGrid5_Allowcollapsing ;
   private byte subGrid5_Collapsed ;
   private byte subGridtcccc_qualityrequeriments_articulos_tiposarticulo_colores_intensidades_controles_Allowselection ;
   private byte subGridtcccc_qualityrequeriments_articulos_tiposarticulo_colores_intensidades_controles_Allowhovering ;
   private byte subGridtcccc_qualityrequeriments_articulos_tiposarticulo_colores_intensidades_controles_Allowcollapsing ;
   private byte subGridtcccc_qualityrequeriments_articulos_tiposarticulo_colores_intensidades_controles_Collapsed ;
   private byte GXv_int3[] ;
   private short Z9713Tb1_Cod ;
   private short nRcdDeleted_1534 ;
   private short nRcdExists_1534 ;
   private short nIsMod_1534 ;
   private short nRcdDeleted_1642 ;
   private short nRcdExists_1642 ;
   private short nIsMod_1642 ;
   private short Z11748TipArtiId ;
   private short nRcdDeleted_1648 ;
   private short nRcdExists_1648 ;
   private short nIsMod_1648 ;
   private short nRcdDeleted_1649 ;
   private short nRcdExists_1649 ;
   private short nIsMod_1649 ;
   private short Z11750IntId ;
   private short nRcdDeleted_1650 ;
   private short nRcdExists_1650 ;
   private short nIsMod_1650 ;
   private short nRcdDeleted_1651 ;
   private short nRcdExists_1651 ;
   private short nIsMod_1651 ;
   private short A11748TipArtiId ;
   private short A11750IntId ;
   private short A9713Tb1_Cod ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount1534 ;
   private short RcdFound1534 ;
   private short nBlankRcdUsr1534 ;
   private short RcdFound1651 ;
   private short RcdFound1650 ;
   private short RcdFound1649 ;
   private short RcdFound1648 ;
   private short RcdFound1642 ;
   private short RcdFound21 ;
   private short nIsDirty_21 ;
   private short nIsDirty_1534 ;
   private short nIsDirty_1642 ;
   private short nIsDirty_1648 ;
   private short nIsDirty_1649 ;
   private short nIsDirty_1650 ;
   private short nIsDirty_1651 ;
   private short nBlankRcdCount1642 ;
   private short nBlankRcdUsr1642 ;
   private short nBlankRcdCount1648 ;
   private short nBlankRcdUsr1648 ;
   private short nBlankRcdCount1649 ;
   private short nBlankRcdUsr1649 ;
   private short nBlankRcdCount1650 ;
   private short nBlankRcdUsr1650 ;
   private short nBlankRcdCount1651 ;
   private short nBlankRcdUsr1651 ;
   private int Z252CliCod ;
   private int nRC_GXsfl_58 ;
   private int nGXsfl_58_idx=1 ;
   private int nRC_GXsfl_81 ;
   private int nGXsfl_81_idx=1 ;
   private int nRC_GXsfl_104 ;
   private int nGXsfl_104_idx=1 ;
   private int nRC_GXsfl_127 ;
   private int nGXsfl_127_idx=1 ;
   private int Z11738CCColNum ;
   private int nRC_GXsfl_155 ;
   private int nGXsfl_155_idx=1 ;
   private int nRC_GXsfl_178 ;
   private int nGXsfl_178_idx=1 ;
   private int Z4031CCTCod ;
   private int A252CliCod ;
   private int A4031CCTCod ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtCliCod_Enabled ;
   private int edtCliNom_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int edtTb1_Cod_Enabled ;
   private int edtTb1_Dsc_Enabled ;
   private int fRowAdded ;
   private int edtCCTCod_Enabled ;
   private int edtCCTDsc_Enabled ;
   private int edtIntId_Enabled ;
   private int edtIntDs_Enabled ;
   private int A11738CCColNum ;
   private int edtCCColNom_Enabled ;
   private int edtCCColNum_Enabled ;
   private int edtCCCTc_Enabled ;
   private int edtTipArtiId_Enabled ;
   private int edtTipArtiDs_Enabled ;
   private int edtCCArtCod_Enabled ;
   private int edtCCArtdsc_Enabled ;
   private int GX_JID ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int GRID1_IsPaging ;
   private int subGrid2_Backcolor ;
   private int subGrid2_Allbackcolor ;
   private int GRID2_IsPaging ;
   private int subGrid3_Backcolor ;
   private int subGrid3_Allbackcolor ;
   private int GRID3_IsPaging ;
   private int subGrid4_Backcolor ;
   private int subGrid4_Allbackcolor ;
   private int GRID4_IsPaging ;
   private int subGrid5_Backcolor ;
   private int subGrid5_Allbackcolor ;
   private int GRID5_IsPaging ;
   private int subGridtcccc_qualityrequeriments_articulos_tiposarticulo_colores_intensidades_controles_Backcolor ;
   private int subGridtcccc_qualityrequeriments_articulos_tiposarticulo_colores_intensidades_controles_Allbackcolor ;
   private int defedtCCArtCod_Enabled ;
   private int defedtTipArtiId_Enabled ;
   private int defedtCCCTc_Enabled ;
   private int defedtCCColNum_Enabled ;
   private int defedtCCColNom_Enabled ;
   private int defedtIntId_Enabled ;
   private int defedtCCTCod_Enabled ;
   private int defedtTb1_Cod_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int subGrid2_Selectedindex ;
   private int subGrid2_Selectioncolor ;
   private int subGrid2_Hoveringcolor ;
   private int subGrid3_Selectedindex ;
   private int subGrid3_Selectioncolor ;
   private int subGrid3_Hoveringcolor ;
   private int subGrid4_Selectedindex ;
   private int subGrid4_Selectioncolor ;
   private int subGrid4_Hoveringcolor ;
   private int subGrid5_Selectedindex ;
   private int subGrid5_Selectioncolor ;
   private int subGrid5_Hoveringcolor ;
   private int subGridtcccc_qualityrequeriments_articulos_tiposarticulo_colores_intensidades_controles_Selectedindex ;
   private int subGridtcccc_qualityrequeriments_articulos_tiposarticulo_colores_intensidades_controles_Selectioncolor ;
   private int subGridtcccc_qualityrequeriments_articulos_tiposarticulo_colores_intensidades_controles_Hoveringcolor ;
   private int ZZ252CliCod ;
   private long GRID1_nFirstRecordOnPage ;
   private long GRID2_nFirstRecordOnPage ;
   private long GRID3_nFirstRecordOnPage ;
   private long GRID4_nFirstRecordOnPage ;
   private long GRID5_nFirstRecordOnPage ;
   private long GRIDTCCCC_QUALITYREQUERIMENTS_ARTICULOS_TIPOSARTICULO_COLORES_INTENSIDADES_CONTROLES_nFirstRecordOnPage ;
   private long GRID2_nCurrentRecord ;
   private long GRID3_nCurrentRecord ;
   private long GRID4_nCurrentRecord ;
   private long GRID5_nCurrentRecord ;
   private long GRIDTCCCC_QUALITYREQUERIMENTS_ARTICULOS_TIPOSARTICULO_COLORES_INTENSIDADES_CONTROLES_nCurrentRecord ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z279CliNom ;
   private String Z11736CCArtCod ;
   private String Z11737CCColNom ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A11736CCArtCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtEmprCod_Internalname ;
   private String sGXsfl_178_idx="0001" ;
   private String Gx_mode ;
   private String sGXsfl_155_idx="0001" ;
   private String sGXsfl_127_idx="0001" ;
   private String sGXsfl_104_idx="0001" ;
   private String sGXsfl_81_idx="0001" ;
   private String sGXsfl_58_idx="0001" ;
   private String divMaintable_Internalname ;
   private String divTitlecontainer_Internalname ;
   private String lblTitle_Internalname ;
   private String lblTitle_Jsonclick ;
   private String ClassString ;
   private String StyleString ;
   private String divFormcontainer_Internalname ;
   private String divToolbarcell_Internalname ;
   private String TempTags ;
   private String bttBtn_first_Internalname ;
   private String bttBtn_first_Jsonclick ;
   private String bttBtn_previous_Internalname ;
   private String bttBtn_previous_Jsonclick ;
   private String bttBtn_next_Internalname ;
   private String bttBtn_next_Jsonclick ;
   private String bttBtn_last_Internalname ;
   private String bttBtn_last_Jsonclick ;
   private String bttBtn_select_Internalname ;
   private String bttBtn_select_Jsonclick ;
   private String edtEmprCod_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String edtCliCod_Internalname ;
   private String edtCliCod_Jsonclick ;
   private String edtCliNom_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Jsonclick ;
   private String divQualityrequerimentstable_Internalname ;
   private String lblTitlequalityrequeriments_Internalname ;
   private String lblTitlequalityrequeriments_Jsonclick ;
   private String bttBtn_enter_Internalname ;
   private String bttBtn_enter_Jsonclick ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String bttBtn_delete_Internalname ;
   private String bttBtn_delete_Jsonclick ;
   private String sMode1534 ;
   private String edtTb1_Cod_Internalname ;
   private String edtTb1_Dsc_Internalname ;
   private String sStyleString ;
   private String subGrid1_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String GXCCtl ;
   private String edtCCTCod_Internalname ;
   private String edtCCTDsc_Internalname ;
   private String A4036CCTDsc ;
   private String sMode1650 ;
   private String edtIntId_Internalname ;
   private String edtIntDs_Internalname ;
   private String A11747IntDs ;
   private String sMode1649 ;
   private String edtCCColNom_Internalname ;
   private String A11737CCColNom ;
   private String edtCCColNum_Internalname ;
   private String edtCCCTc_Internalname ;
   private String sMode1648 ;
   private String edtTipArtiId_Internalname ;
   private String edtTipArtiDs_Internalname ;
   private String A11746TipArtiDs ;
   private String sMode1642 ;
   private String edtCCArtCod_Internalname ;
   private String edtCCArtdsc_Internalname ;
   private String A11745CCArtdsc ;
   private String A9715Tb1_Dsc ;
   private String Z407EmprNom ;
   private String sMode21 ;
   private String Z9715Tb1_Dsc ;
   private String Z4036CCTDsc ;
   private String sMode1651 ;
   private String lblTitlearticulos_Internalname ;
   private String subGrid2_Internalname ;
   private String sGXsfl_58_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String divGridtable1_Internalname ;
   private String divTable2_Internalname ;
   private String ROClassString ;
   private String edtTb1_Cod_Jsonclick ;
   private String edtTb1_Dsc_Jsonclick ;
   private String divArticulostable_Internalname ;
   private String lblTitlearticulos_Jsonclick ;
   private String lblTitletipoarticulo_Internalname ;
   private String subGrid3_Internalname ;
   private String sGXsfl_81_fel_idx="0001" ;
   private String subGrid2_Class ;
   private String subGrid2_Linesclass ;
   private String divGridtable2_Internalname ;
   private String divTable3_Internalname ;
   private String edtCCArtCod_Jsonclick ;
   private String edtCCArtdsc_Jsonclick ;
   private String divTipoarticulotable_Internalname ;
   private String lblTitletipoarticulo_Jsonclick ;
   private String lblTitlecolores_Internalname ;
   private String subGrid4_Internalname ;
   private String sGXsfl_104_fel_idx="0001" ;
   private String subGrid3_Class ;
   private String subGrid3_Linesclass ;
   private String divGridtable3_Internalname ;
   private String divTable4_Internalname ;
   private String edtTipArtiId_Jsonclick ;
   private String edtTipArtiDs_Jsonclick ;
   private String divColorestable_Internalname ;
   private String lblTitlecolores_Jsonclick ;
   private String lblTitleintensidades_Internalname ;
   private String subGrid5_Internalname ;
   private String sGXsfl_127_fel_idx="0001" ;
   private String subGrid4_Class ;
   private String subGrid4_Linesclass ;
   private String divGridtable4_Internalname ;
   private String divTable5_Internalname ;
   private String edtCCColNom_Jsonclick ;
   private String edtCCColNum_Jsonclick ;
   private String edtCCCTc_Jsonclick ;
   private String divIntensidadestable_Internalname ;
   private String lblTitleintensidades_Jsonclick ;
   private String lblTitlecontroles_Internalname ;
   private String subGridtcccc_qualityrequeriments_articulos_tiposarticulo_colores_intensidades_controles_Internalname ;
   private String sGXsfl_155_fel_idx="0001" ;
   private String subGrid5_Class ;
   private String subGrid5_Linesclass ;
   private String divGridtable5_Internalname ;
   private String divTable6_Internalname ;
   private String edtIntId_Jsonclick ;
   private String edtIntDs_Jsonclick ;
   private String divControlestable_Internalname ;
   private String lblTitlecontroles_Jsonclick ;
   private String sGXsfl_178_fel_idx="0001" ;
   private String subGridtcccc_qualityrequeriments_articulos_tiposarticulo_colores_intensidades_controles_Class ;
   private String subGridtcccc_qualityrequeriments_articulos_tiposarticulo_colores_intensidades_controles_Linesclass ;
   private String edtCCTCod_Jsonclick ;
   private String edtCCTDsc_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String lblTitlearticulos_Caption ;
   private String subGrid2_Header ;
   private String lblTitletipoarticulo_Caption ;
   private String subGrid3_Header ;
   private String lblTitlecolores_Caption ;
   private String subGrid4_Header ;
   private String lblTitleintensidades_Caption ;
   private String subGrid5_Header ;
   private String lblTitlecontroles_Caption ;
   private String subGridtcccc_qualityrequeriments_articulos_tiposarticulo_colores_intensidades_controles_Header ;
   private String ZZ396EmprCod ;
   private String ZZ279CliNom ;
   private String ZZ407EmprNom ;
   private String Z11745CCArtdsc ;
   private String Z11746TipArtiDs ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String GXv_char2[] ;
   private String Z11747IntDs ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n252CliCod ;
   private boolean wbErr ;
   private boolean bGXsfl_58_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean n9715Tb1_Dsc ;
   private boolean bGXsfl_81_Refreshing=false ;
   private boolean bGXsfl_104_Refreshing=false ;
   private boolean bGXsfl_127_Refreshing=false ;
   private boolean bGXsfl_155_Refreshing=false ;
   private boolean bGXsfl_178_Refreshing=false ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebGrid Grid2Container ;
   private com.genexus.webpanels.GXWebGrid Grid3Container ;
   private com.genexus.webpanels.GXWebGrid Grid4Container ;
   private com.genexus.webpanels.GXWebGrid Grid5Container ;
   private com.genexus.webpanels.GXWebGrid Gridtcccc_qualityrequeriments_articulos_tiposarticulo_colores_intensidades_controlesContainer ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebRow Grid2Row ;
   private com.genexus.webpanels.GXWebRow Grid3Row ;
   private com.genexus.webpanels.GXWebRow Grid4Row ;
   private com.genexus.webpanels.GXWebRow Grid5Row ;
   private com.genexus.webpanels.GXWebRow Gridtcccc_qualityrequeriments_articulos_tiposarticulo_colores_intensidades_controlesRow ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.webpanels.GXWebColumn Grid2Column ;
   private com.genexus.webpanels.GXWebColumn Grid3Column ;
   private com.genexus.webpanels.GXWebColumn Grid4Column ;
   private com.genexus.webpanels.GXWebColumn Grid5Column ;
   private com.genexus.webpanels.GXWebColumn Gridtcccc_qualityrequeriments_articulos_tiposarticulo_colores_intensidades_controlesColumn ;
   private IDataStoreProvider pr_default ;
   private int[] T01HM19_A252CliCod ;
   private boolean[] T01HM19_n252CliCod ;
   private String[] T01HM19_A407EmprNom ;
   private boolean[] T01HM19_n407EmprNom ;
   private String[] T01HM19_A279CliNom ;
   private String[] T01HM19_A396EmprCod ;
   private String[] T01HM18_A407EmprNom ;
   private boolean[] T01HM18_n407EmprNom ;
   private String[] T01HM20_A407EmprNom ;
   private boolean[] T01HM20_n407EmprNom ;
   private String[] T01HM21_A396EmprCod ;
   private int[] T01HM21_A252CliCod ;
   private boolean[] T01HM21_n252CliCod ;
   private int[] T01HM17_A252CliCod ;
   private boolean[] T01HM17_n252CliCod ;
   private String[] T01HM17_A279CliNom ;
   private String[] T01HM17_A396EmprCod ;
   private String[] T01HM22_A396EmprCod ;
   private int[] T01HM22_A252CliCod ;
   private boolean[] T01HM22_n252CliCod ;
   private String[] T01HM23_A396EmprCod ;
   private int[] T01HM23_A252CliCod ;
   private boolean[] T01HM23_n252CliCod ;
   private int[] T01HM16_A252CliCod ;
   private boolean[] T01HM16_n252CliCod ;
   private String[] T01HM16_A279CliNom ;
   private String[] T01HM16_A396EmprCod ;
   private String[] T01HM27_A407EmprNom ;
   private boolean[] T01HM27_n407EmprNom ;
   private String[] T01HM28_A396EmprCod ;
   private int[] T01HM28_A252CliCod ;
   private boolean[] T01HM28_n252CliCod ;
   private int[] T01HM28_A6930Lb_rclin ;
   private String[] T01HM29_A396EmprCod ;
   private int[] T01HM29_A6850Tex_NPed ;
   private String[] T01HM30_A396EmprCod ;
   private int[] T01HM30_A252CliCod ;
   private boolean[] T01HM30_n252CliCod ;
   private short[] T01HM30_A829TipArtCod ;
   private byte[] T01HM30_A831TipColCod ;
   private byte[] T01HM30_A583IntCod ;
   private String[] T01HM30_A5098TipDisCod ;
   private short[] T01HM30_A6603Est1_anyo ;
   private byte[] T01HM30_A6604Est1_mes ;
   private byte[] T01HM30_A6605Est1_dia ;
   private String[] T01HM31_A396EmprCod ;
   private int[] T01HM31_A6319C_Barcod ;
   private byte[] T01HM31_A6320C_Barcodre ;
   private String[] T01HM31_A6321C_Barcodpa ;
   private short[] T01HM31_A6322C_Reclinma ;
   private String[] T01HM32_A396EmprCod ;
   private int[] T01HM32_A6235DevEmpCod ;
   private String[] T01HM33_A396EmprCod ;
   private String[] T01HM33_A602MaqCod ;
   private int[] T01HM33_A6078MaqCliCod ;
   private String[] T01HM33_A6079MaqArtCod ;
   private String[] T01HM34_A396EmprCod ;
   private int[] T01HM34_A5532Lb_numero ;
   private String[] T01HM35_A396EmprCod ;
   private int[] T01HM35_A252CliCod ;
   private boolean[] T01HM35_n252CliCod ;
   private short[] T01HM35_A5503CliifLin ;
   private String[] T01HM36_A396EmprCod ;
   private int[] T01HM36_A252CliCod ;
   private boolean[] T01HM36_n252CliCod ;
   private short[] T01HM36_A5499ClieiLin ;
   private String[] T01HM37_A396EmprCod ;
   private int[] T01HM37_A252CliCod ;
   private boolean[] T01HM37_n252CliCod ;
   private short[] T01HM37_A5495ClidtLin ;
   private String[] T01HM38_A396EmprCod ;
   private int[] T01HM38_A252CliCod ;
   private boolean[] T01HM38_n252CliCod ;
   private short[] T01HM38_A5491CliedLin ;
   private String[] T01HM39_A396EmprCod ;
   private int[] T01HM39_A252CliCod ;
   private boolean[] T01HM39_n252CliCod ;
   private String[] T01HM39_A5452P_ForCod ;
   private String[] T01HM40_A396EmprCod ;
   private int[] T01HM40_A252CliCod ;
   private boolean[] T01HM40_n252CliCod ;
   private String[] T01HM40_A5443Mdl_Cod ;
   private String[] T01HM41_A396EmprCod ;
   private int[] T01HM41_A252CliCod ;
   private boolean[] T01HM41_n252CliCod ;
   private short[] T01HM41_A5436IntCodF2 ;
   private String[] T01HM42_A396EmprCod ;
   private int[] T01HM42_A252CliCod ;
   private boolean[] T01HM42_n252CliCod ;
   private byte[] T01HM42_A5396IntCodFC ;
   private byte[] T01HM42_A5434Tip_ColC ;
   private String[] T01HM43_A396EmprCod ;
   private int[] T01HM43_A252CliCod ;
   private boolean[] T01HM43_n252CliCod ;
   private String[] T01HM43_A5428FasPreCod ;
   private String[] T01HM44_A396EmprCod ;
   private int[] T01HM44_A252CliCod ;
   private boolean[] T01HM44_n252CliCod ;
   private String[] T01HM44_A5398Cli_Proc ;
   private String[] T01HM45_A396EmprCod ;
   private int[] T01HM45_A5130PagIden ;
   private String[] T01HM46_A396EmprCod ;
   private int[] T01HM46_A5059Hl_hdr ;
   private byte[] T01HM46_A5060Hl_hdrr ;
   private String[] T01HM46_A5061Hl_hdrp ;
   private String[] T01HM47_A396EmprCod ;
   private int[] T01HM47_A252CliCod ;
   private boolean[] T01HM47_n252CliCod ;
   private String[] T01HM47_A4718DishCod ;
   private byte[] T01HM47_A5020TipEstCod ;
   private byte[] T01HM47_A5022GraCod ;
   private String[] T01HM48_A396EmprCod ;
   private int[] T01HM48_A4618EnsLCod ;
   private String[] T01HM49_A396EmprCod ;
   private int[] T01HM49_A4492HreBarCod ;
   private byte[] T01HM49_A4493HreBarReo ;
   private String[] T01HM49_A4494HreBarPar ;
   private byte[] T01HM49_A4495HreNumCie ;
   private String[] T01HM50_A396EmprCod ;
   private int[] T01HM50_A252CliCod ;
   private boolean[] T01HM50_n252CliCod ;
   private String[] T01HM50_A4415EstCol ;
   private String[] T01HM51_A396EmprCod ;
   private String[] T01HM51_A4185WEBUSU ;
   private String[] T01HM52_A396EmprCod ;
   private int[] T01HM52_A252CliCod ;
   private boolean[] T01HM52_n252CliCod ;
   private String[] T01HM52_A4079WEBDISCOD ;
   private String[] T01HM52_A4078EMPCOD ;
   private String[] T01HM53_A396EmprCod ;
   private int[] T01HM53_A2637HisEstHRu ;
   private byte[] T01HM53_A2636HisEstHRe ;
   private String[] T01HM53_A2635HisEstHPa ;
   private byte[] T01HM53_A2638HisEstLCo ;
   private String[] T01HM53_A2630HisEstCom ;
   private String[] T01HM53_A2634HisEstFon ;
   private String[] T01HM54_A396EmprCod ;
   private int[] T01HM54_A2574GrpDibCod ;
   private String[] T01HM55_A396EmprCod ;
   private int[] T01HM55_A2558GrmDibCod ;
   private String[] T01HM56_A396EmprCod ;
   private int[] T01HM56_A2542GrcDibCod ;
   private String[] T01HM57_A396EmprCod ;
   private String[] T01HM57_A1031EmpesCod ;
   private int[] T01HM57_A252CliCod ;
   private boolean[] T01HM57_n252CliCod ;
   private String[] T01HM57_A1032FonCod ;
   private String[] T01HM58_A396EmprCod ;
   private String[] T01HM58_A1013DibCli ;
   private int[] T01HM58_A252CliCod ;
   private boolean[] T01HM58_n252CliCod ;
   private int[] T01HM58_A1014DibInt ;
   private String[] T01HM59_A396EmprCod ;
   private long[] T01HM59_A1736AlbExtCod ;
   private String[] T01HM60_A396EmprCod ;
   private int[] T01HM60_A252CliCod ;
   private boolean[] T01HM60_n252CliCod ;
   private short[] T01HM60_A3661FacProAny ;
   private String[] T01HM60_A3662FacProSer ;
   private byte[] T01HM60_A3663FacProInt ;
   private byte[] T01HM60_A3664FacProTip ;
   private short[] T01HM60_A3665FacProTar ;
   private String[] T01HM61_A396EmprCod ;
   private short[] T01HM61_A3646EstTinAny ;
   private byte[] T01HM61_A3647EstTinMes ;
   private byte[] T01HM61_A3648EstTinDia ;
   private short[] T01HM61_A1929EstTinNr ;
   private String[] T01HM62_A396EmprCod ;
   private long[] T01HM62_A3617AlbTrnCod ;
   private String[] T01HM63_A396EmprCod ;
   private int[] T01HM63_A252CliCod ;
   private boolean[] T01HM63_n252CliCod ;
   private java.math.BigDecimal[] T01HM63_A3320CliLimKgs ;
   private String[] T01HM64_A396EmprCod ;
   private String[] T01HM64_A3073RepCod ;
   private int[] T01HM64_A252CliCod ;
   private boolean[] T01HM64_n252CliCod ;
   private String[] T01HM65_A396EmprCod ;
   private byte[] T01HM65_A3061Codia ;
   private byte[] T01HM65_A3062CoMes ;
   private short[] T01HM65_A3063CoAny ;
   private byte[] T01HM65_A3065CoLin ;
   private int[] T01HM65_A3010CoBarCod ;
   private byte[] T01HM65_A3011CoBarReo ;
   private String[] T01HM65_A3012CoBarPar ;
   private String[] T01HM66_A396EmprCod ;
   private int[] T01HM66_A2971SabFacCod ;
   private String[] T01HM67_A396EmprCod ;
   private byte[] T01HM67_A2954TiDia ;
   private byte[] T01HM67_A2955TiMes ;
   private short[] T01HM67_A2956TiAny ;
   private byte[] T01HM67_A2958TiLin ;
   private int[] T01HM67_A2959TiBarCod ;
   private byte[] T01HM67_A2960TiBarReo ;
   private String[] T01HM67_A2961TiBarPar ;
   private String[] T01HM68_A396EmprCod ;
   private int[] T01HM68_A252CliCod ;
   private boolean[] T01HM68_n252CliCod ;
   private short[] T01HM68_A2933RecTipCon ;
   private String[] T01HM69_A396EmprCod ;
   private int[] T01HM69_A252CliCod ;
   private boolean[] T01HM69_n252CliCod ;
   private String[] T01HM69_A2927RecProCod ;
   private String[] T01HM70_A396EmprCod ;
   private int[] T01HM70_A252CliCod ;
   private boolean[] T01HM70_n252CliCod ;
   private String[] T01HM70_A2891HMaForSer ;
   private String[] T01HM70_A2892HMaForCNom ;
   private int[] T01HM70_A2893HMaForCNum ;
   private byte[] T01HM70_A2894HMaTipCCod ;
   private int[] T01HM70_A2895HMaForNumC ;
   private short[] T01HM70_A2897HMaColLin ;
   private java.util.Date[] T01HM70_A2896HMaFec ;
   private short[] T01HM70_A2907HmaLin ;
   private String[] T01HM71_A396EmprCod ;
   private int[] T01HM71_A252CliCod ;
   private boolean[] T01HM71_n252CliCod ;
   private short[] T01HM71_A425EstAny ;
   private String[] T01HM71_A2755EstSerFac ;
   private String[] T01HM72_A396EmprCod ;
   private short[] T01HM72_A2730RecTipCo ;
   private int[] T01HM72_A252CliCod ;
   private boolean[] T01HM72_n252CliCod ;
   private String[] T01HM73_A396EmprCod ;
   private String[] T01HM73_A2720TarSec ;
   private int[] T01HM73_A252CliCod ;
   private boolean[] T01HM73_n252CliCod ;
   private short[] T01HM73_A829TipArtCod ;
   private byte[] T01HM73_A831TipColCod ;
   private String[] T01HM74_A396EmprCod ;
   private String[] T01HM74_A2382AbcTerCod ;
   private String[] T01HM74_A2381AbcSec ;
   private int[] T01HM74_A252CliCod ;
   private boolean[] T01HM74_n252CliCod ;
   private String[] T01HM75_A396EmprCod ;
   private int[] T01HM75_A252CliCod ;
   private boolean[] T01HM75_n252CliCod ;
   private int[] T01HM75_A2308CliDesCod ;
   private String[] T01HM76_A396EmprCod ;
   private String[] T01HM76_A2268MovParCod ;
   private int[] T01HM76_A252CliCod ;
   private boolean[] T01HM76_n252CliCod ;
   private String[] T01HM77_A396EmprCod ;
   private String[] T01HM77_A966PartCod ;
   private int[] T01HM77_A252CliCod ;
   private boolean[] T01HM77_n252CliCod ;
   private String[] T01HM78_A396EmprCod ;
   private int[] T01HM78_A1387AlbPrvCod ;
   private String[] T01HM79_A396EmprCod ;
   private int[] T01HM79_A252CliCod ;
   private boolean[] T01HM79_n252CliCod ;
   private String[] T01HM79_A1213TalCod ;
   private String[] T01HM80_A396EmprCod ;
   private int[] T01HM80_A252CliCod ;
   private boolean[] T01HM80_n252CliCod ;
   private String[] T01HM80_A457FasCod ;
   private String[] T01HM81_A396EmprCod ;
   private int[] T01HM81_A539HisBarCod ;
   private byte[] T01HM81_A545HisCodReo ;
   private String[] T01HM81_A544HisCodPar ;
   private short[] T01HM81_A833TipDefCod ;
   private String[] T01HM82_A396EmprCod ;
   private int[] T01HM82_A506HbaBarCod ;
   private byte[] T01HM82_A508HbaBarReo ;
   private String[] T01HM82_A507HbaBarPar ;
   private String[] T01HM83_A396EmprCod ;
   private int[] T01HM83_A252CliCod ;
   private boolean[] T01HM83_n252CliCod ;
   private String[] T01HM83_A494ForSer ;
   private String[] T01HM83_A482ForColNom ;
   private int[] T01HM83_A483ForColNum ;
   private byte[] T01HM83_A831TipColCod ;
   private String[] T01HM84_A396EmprCod ;
   private int[] T01HM84_A252CliCod ;
   private boolean[] T01HM84_n252CliCod ;
   private byte[] T01HM84_A287CliPagLin ;
   private String[] T01HM85_A396EmprCod ;
   private int[] T01HM85_A252CliCod ;
   private boolean[] T01HM85_n252CliCod ;
   private byte[] T01HM85_A266CliEnvLin ;
   private String[] T01HM86_A396EmprCod ;
   private int[] T01HM86_A252CliCod ;
   private boolean[] T01HM86_n252CliCod ;
   private String[] T01HM86_A65ArtCod ;
   private String[] T01HM87_A396EmprCod ;
   private int[] T01HM87_A44AlbRecCod ;
   private String[] T01HM88_A396EmprCod ;
   private long[] T01HM88_A30AlbProCod ;
   private String[] T01HM89_A396EmprCod ;
   private int[] T01HM89_A14AlbComCod ;
   private String[] T01HM90_A396EmprCod ;
   private int[] T01HM90_A252CliCod ;
   private boolean[] T01HM90_n252CliCod ;
   private int[] T01HM91_A252CliCod ;
   private boolean[] T01HM91_n252CliCod ;
   private String[] T01HM91_A9715Tb1_Dsc ;
   private boolean[] T01HM91_n9715Tb1_Dsc ;
   private String[] T01HM91_A396EmprCod ;
   private short[] T01HM91_A9713Tb1_Cod ;
   private String[] T01HM15_A9715Tb1_Dsc ;
   private boolean[] T01HM15_n9715Tb1_Dsc ;
   private String[] T01HM92_A9715Tb1_Dsc ;
   private boolean[] T01HM92_n9715Tb1_Dsc ;
   private String[] T01HM93_A396EmprCod ;
   private int[] T01HM93_A252CliCod ;
   private boolean[] T01HM93_n252CliCod ;
   private short[] T01HM93_A9713Tb1_Cod ;
   private int[] T01HM14_A252CliCod ;
   private boolean[] T01HM14_n252CliCod ;
   private String[] T01HM14_A396EmprCod ;
   private short[] T01HM14_A9713Tb1_Cod ;
   private int[] T01HM13_A252CliCod ;
   private boolean[] T01HM13_n252CliCod ;
   private String[] T01HM13_A396EmprCod ;
   private short[] T01HM13_A9713Tb1_Cod ;
   private String[] T01HM96_A9715Tb1_Dsc ;
   private boolean[] T01HM96_n9715Tb1_Dsc ;
   private String[] T01HM97_A396EmprCod ;
   private int[] T01HM97_A252CliCod ;
   private boolean[] T01HM97_n252CliCod ;
   private short[] T01HM97_A9713Tb1_Cod ;
   private String[] T01HM97_A11736CCArtCod ;
   private String[] T01HM98_A396EmprCod ;
   private int[] T01HM98_A252CliCod ;
   private boolean[] T01HM98_n252CliCod ;
   private short[] T01HM98_A9713Tb1_Cod ;
   private int[] T01HM99_A252CliCod ;
   private boolean[] T01HM99_n252CliCod ;
   private short[] T01HM99_A9713Tb1_Cod ;
   private String[] T01HM99_A11736CCArtCod ;
   private String[] T01HM99_A396EmprCod ;
   private String[] T01HM100_A396EmprCod ;
   private int[] T01HM100_A252CliCod ;
   private boolean[] T01HM100_n252CliCod ;
   private short[] T01HM100_A9713Tb1_Cod ;
   private String[] T01HM100_A11736CCArtCod ;
   private int[] T01HM12_A252CliCod ;
   private boolean[] T01HM12_n252CliCod ;
   private short[] T01HM12_A9713Tb1_Cod ;
   private String[] T01HM12_A11736CCArtCod ;
   private String[] T01HM12_A396EmprCod ;
   private int[] T01HM11_A252CliCod ;
   private boolean[] T01HM11_n252CliCod ;
   private short[] T01HM11_A9713Tb1_Cod ;
   private String[] T01HM11_A11736CCArtCod ;
   private String[] T01HM11_A396EmprCod ;
   private String[] T01HM103_A396EmprCod ;
   private int[] T01HM103_A252CliCod ;
   private boolean[] T01HM103_n252CliCod ;
   private short[] T01HM103_A9713Tb1_Cod ;
   private String[] T01HM103_A11736CCArtCod ;
   private short[] T01HM103_A11748TipArtiId ;
   private String[] T01HM104_A396EmprCod ;
   private int[] T01HM104_A252CliCod ;
   private boolean[] T01HM104_n252CliCod ;
   private short[] T01HM104_A9713Tb1_Cod ;
   private String[] T01HM104_A11736CCArtCod ;
   private int[] T01HM105_A252CliCod ;
   private boolean[] T01HM105_n252CliCod ;
   private short[] T01HM105_A9713Tb1_Cod ;
   private String[] T01HM105_A11736CCArtCod ;
   private short[] T01HM105_A11748TipArtiId ;
   private String[] T01HM105_A396EmprCod ;
   private String[] T01HM106_A396EmprCod ;
   private int[] T01HM106_A252CliCod ;
   private boolean[] T01HM106_n252CliCod ;
   private short[] T01HM106_A9713Tb1_Cod ;
   private String[] T01HM106_A11736CCArtCod ;
   private short[] T01HM106_A11748TipArtiId ;
   private int[] T01HM10_A252CliCod ;
   private boolean[] T01HM10_n252CliCod ;
   private short[] T01HM10_A9713Tb1_Cod ;
   private String[] T01HM10_A11736CCArtCod ;
   private short[] T01HM10_A11748TipArtiId ;
   private String[] T01HM10_A396EmprCod ;
   private int[] T01HM9_A252CliCod ;
   private boolean[] T01HM9_n252CliCod ;
   private short[] T01HM9_A9713Tb1_Cod ;
   private String[] T01HM9_A11736CCArtCod ;
   private short[] T01HM9_A11748TipArtiId ;
   private String[] T01HM9_A396EmprCod ;
   private String[] T01HM109_A396EmprCod ;
   private int[] T01HM109_A252CliCod ;
   private boolean[] T01HM109_n252CliCod ;
   private short[] T01HM109_A9713Tb1_Cod ;
   private String[] T01HM109_A11736CCArtCod ;
   private short[] T01HM109_A11748TipArtiId ;
   private String[] T01HM109_A11737CCColNom ;
   private int[] T01HM109_A11738CCColNum ;
   private byte[] T01HM109_A11749CCCTc ;
   private String[] T01HM110_A396EmprCod ;
   private int[] T01HM110_A252CliCod ;
   private boolean[] T01HM110_n252CliCod ;
   private short[] T01HM110_A9713Tb1_Cod ;
   private String[] T01HM110_A11736CCArtCod ;
   private short[] T01HM110_A11748TipArtiId ;
   private int[] T01HM111_A252CliCod ;
   private boolean[] T01HM111_n252CliCod ;
   private short[] T01HM111_A9713Tb1_Cod ;
   private String[] T01HM111_A11736CCArtCod ;
   private short[] T01HM111_A11748TipArtiId ;
   private String[] T01HM111_A11737CCColNom ;
   private int[] T01HM111_A11738CCColNum ;
   private byte[] T01HM111_A11749CCCTc ;
   private String[] T01HM111_A396EmprCod ;
   private String[] T01HM112_A396EmprCod ;
   private int[] T01HM112_A252CliCod ;
   private boolean[] T01HM112_n252CliCod ;
   private short[] T01HM112_A9713Tb1_Cod ;
   private String[] T01HM112_A11736CCArtCod ;
   private short[] T01HM112_A11748TipArtiId ;
   private String[] T01HM112_A11737CCColNom ;
   private int[] T01HM112_A11738CCColNum ;
   private byte[] T01HM112_A11749CCCTc ;
   private int[] T01HM8_A252CliCod ;
   private boolean[] T01HM8_n252CliCod ;
   private short[] T01HM8_A9713Tb1_Cod ;
   private String[] T01HM8_A11736CCArtCod ;
   private short[] T01HM8_A11748TipArtiId ;
   private String[] T01HM8_A11737CCColNom ;
   private int[] T01HM8_A11738CCColNum ;
   private byte[] T01HM8_A11749CCCTc ;
   private String[] T01HM8_A396EmprCod ;
   private int[] T01HM7_A252CliCod ;
   private boolean[] T01HM7_n252CliCod ;
   private short[] T01HM7_A9713Tb1_Cod ;
   private String[] T01HM7_A11736CCArtCod ;
   private short[] T01HM7_A11748TipArtiId ;
   private String[] T01HM7_A11737CCColNom ;
   private int[] T01HM7_A11738CCColNum ;
   private byte[] T01HM7_A11749CCCTc ;
   private String[] T01HM7_A396EmprCod ;
   private String[] T01HM115_A396EmprCod ;
   private int[] T01HM115_A252CliCod ;
   private boolean[] T01HM115_n252CliCod ;
   private short[] T01HM115_A9713Tb1_Cod ;
   private String[] T01HM115_A11736CCArtCod ;
   private short[] T01HM115_A11748TipArtiId ;
   private String[] T01HM115_A11737CCColNom ;
   private int[] T01HM115_A11738CCColNum ;
   private byte[] T01HM115_A11749CCCTc ;
   private short[] T01HM115_A11750IntId ;
   private String[] T01HM116_A396EmprCod ;
   private int[] T01HM116_A252CliCod ;
   private boolean[] T01HM116_n252CliCod ;
   private short[] T01HM116_A9713Tb1_Cod ;
   private String[] T01HM116_A11736CCArtCod ;
   private short[] T01HM116_A11748TipArtiId ;
   private String[] T01HM116_A11737CCColNom ;
   private int[] T01HM116_A11738CCColNum ;
   private byte[] T01HM116_A11749CCCTc ;
   private int[] T01HM117_A252CliCod ;
   private boolean[] T01HM117_n252CliCod ;
   private short[] T01HM117_A9713Tb1_Cod ;
   private String[] T01HM117_A11736CCArtCod ;
   private short[] T01HM117_A11748TipArtiId ;
   private String[] T01HM117_A11737CCColNom ;
   private int[] T01HM117_A11738CCColNum ;
   private byte[] T01HM117_A11749CCCTc ;
   private short[] T01HM117_A11750IntId ;
   private String[] T01HM117_A396EmprCod ;
   private String[] T01HM118_A396EmprCod ;
   private int[] T01HM118_A252CliCod ;
   private boolean[] T01HM118_n252CliCod ;
   private short[] T01HM118_A9713Tb1_Cod ;
   private String[] T01HM118_A11736CCArtCod ;
   private short[] T01HM118_A11748TipArtiId ;
   private String[] T01HM118_A11737CCColNom ;
   private int[] T01HM118_A11738CCColNum ;
   private byte[] T01HM118_A11749CCCTc ;
   private short[] T01HM118_A11750IntId ;
   private int[] T01HM6_A252CliCod ;
   private boolean[] T01HM6_n252CliCod ;
   private short[] T01HM6_A9713Tb1_Cod ;
   private String[] T01HM6_A11736CCArtCod ;
   private short[] T01HM6_A11748TipArtiId ;
   private String[] T01HM6_A11737CCColNom ;
   private int[] T01HM6_A11738CCColNum ;
   private byte[] T01HM6_A11749CCCTc ;
   private short[] T01HM6_A11750IntId ;
   private String[] T01HM6_A396EmprCod ;
   private int[] T01HM5_A252CliCod ;
   private boolean[] T01HM5_n252CliCod ;
   private short[] T01HM5_A9713Tb1_Cod ;
   private String[] T01HM5_A11736CCArtCod ;
   private short[] T01HM5_A11748TipArtiId ;
   private String[] T01HM5_A11737CCColNom ;
   private int[] T01HM5_A11738CCColNum ;
   private byte[] T01HM5_A11749CCCTc ;
   private short[] T01HM5_A11750IntId ;
   private String[] T01HM5_A396EmprCod ;
   private String[] T01HM121_A396EmprCod ;
   private int[] T01HM121_A252CliCod ;
   private boolean[] T01HM121_n252CliCod ;
   private short[] T01HM121_A9713Tb1_Cod ;
   private String[] T01HM121_A11736CCArtCod ;
   private short[] T01HM121_A11748TipArtiId ;
   private String[] T01HM121_A11737CCColNom ;
   private int[] T01HM121_A11738CCColNum ;
   private byte[] T01HM121_A11749CCCTc ;
   private short[] T01HM121_A11750IntId ;
   private int[] T01HM121_A4031CCTCod ;
   private short[] T01HM121_A4034CCTLin ;
   private String[] T01HM122_A396EmprCod ;
   private int[] T01HM122_A252CliCod ;
   private boolean[] T01HM122_n252CliCod ;
   private short[] T01HM122_A9713Tb1_Cod ;
   private String[] T01HM122_A11736CCArtCod ;
   private short[] T01HM122_A11748TipArtiId ;
   private String[] T01HM122_A11737CCColNom ;
   private int[] T01HM122_A11738CCColNum ;
   private byte[] T01HM122_A11749CCCTc ;
   private short[] T01HM122_A11750IntId ;
   private int[] T01HM123_A252CliCod ;
   private boolean[] T01HM123_n252CliCod ;
   private short[] T01HM123_A9713Tb1_Cod ;
   private String[] T01HM123_A11736CCArtCod ;
   private short[] T01HM123_A11748TipArtiId ;
   private String[] T01HM123_A11737CCColNom ;
   private int[] T01HM123_A11738CCColNum ;
   private byte[] T01HM123_A11749CCCTc ;
   private short[] T01HM123_A11750IntId ;
   private String[] T01HM123_A4036CCTDsc ;
   private String[] T01HM123_A396EmprCod ;
   private int[] T01HM123_A4031CCTCod ;
   private String[] T01HM4_A4036CCTDsc ;
   private String[] T01HM124_A4036CCTDsc ;
   private String[] T01HM125_A396EmprCod ;
   private int[] T01HM125_A252CliCod ;
   private boolean[] T01HM125_n252CliCod ;
   private short[] T01HM125_A9713Tb1_Cod ;
   private String[] T01HM125_A11736CCArtCod ;
   private short[] T01HM125_A11748TipArtiId ;
   private String[] T01HM125_A11737CCColNom ;
   private int[] T01HM125_A11738CCColNum ;
   private byte[] T01HM125_A11749CCCTc ;
   private short[] T01HM125_A11750IntId ;
   private int[] T01HM125_A4031CCTCod ;
   private int[] T01HM3_A252CliCod ;
   private boolean[] T01HM3_n252CliCod ;
   private short[] T01HM3_A9713Tb1_Cod ;
   private String[] T01HM3_A11736CCArtCod ;
   private short[] T01HM3_A11748TipArtiId ;
   private String[] T01HM3_A11737CCColNom ;
   private int[] T01HM3_A11738CCColNum ;
   private byte[] T01HM3_A11749CCCTc ;
   private short[] T01HM3_A11750IntId ;
   private String[] T01HM3_A396EmprCod ;
   private int[] T01HM3_A4031CCTCod ;
   private int[] T01HM2_A252CliCod ;
   private boolean[] T01HM2_n252CliCod ;
   private short[] T01HM2_A9713Tb1_Cod ;
   private String[] T01HM2_A11736CCArtCod ;
   private short[] T01HM2_A11748TipArtiId ;
   private String[] T01HM2_A11737CCColNom ;
   private int[] T01HM2_A11738CCColNum ;
   private byte[] T01HM2_A11749CCCTc ;
   private short[] T01HM2_A11750IntId ;
   private String[] T01HM2_A396EmprCod ;
   private int[] T01HM2_A4031CCTCod ;
   private String[] T01HM128_A4036CCTDsc ;
   private String[] T01HM129_A396EmprCod ;
   private int[] T01HM129_A252CliCod ;
   private boolean[] T01HM129_n252CliCod ;
   private short[] T01HM129_A9713Tb1_Cod ;
   private String[] T01HM129_A11736CCArtCod ;
   private short[] T01HM129_A11748TipArtiId ;
   private String[] T01HM129_A11737CCColNom ;
   private int[] T01HM129_A11738CCColNum ;
   private byte[] T01HM129_A11749CCCTc ;
   private short[] T01HM129_A11750IntId ;
   private int[] T01HM129_A4031CCTCod ;
   private short[] T01HM129_A4034CCTLin ;
   private String[] T01HM130_A396EmprCod ;
   private int[] T01HM130_A252CliCod ;
   private boolean[] T01HM130_n252CliCod ;
   private short[] T01HM130_A9713Tb1_Cod ;
   private String[] T01HM130_A11736CCArtCod ;
   private short[] T01HM130_A11748TipArtiId ;
   private String[] T01HM130_A11737CCColNom ;
   private int[] T01HM130_A11738CCColNum ;
   private byte[] T01HM130_A11749CCCTc ;
   private short[] T01HM130_A11750IntId ;
   private int[] T01HM130_A4031CCTCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tcccc__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tcccc__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tcccc__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tcccc__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tcccc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01HM2", "SELECT CliCod, Tb1_Cod, CCArtCod, TipArtiId, CCColNom, CCColNum, CCCTc, IntId, EmprCod, CCTCod FROM TXPCCCno5 WHERE EmprCod = ? AND CliCod = ? AND Tb1_Cod = ? AND CCArtCod = ? AND TipArtiId = ? AND CCColNom = ? AND CCColNum = ? AND CCCTc = ? AND IntId = ? AND CCTCod = ?  FOR UPDATE OF CliCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01HM3", "SELECT CliCod, Tb1_Cod, CCArtCod, TipArtiId, CCColNom, CCColNum, CCCTc, IntId, EmprCod, CCTCod FROM TXPCCCno5 WHERE EmprCod = ? AND CliCod = ? AND Tb1_Cod = ? AND CCArtCod = ? AND TipArtiId = ? AND CCColNom = ? AND CCColNum = ? AND CCCTc = ? AND IntId = ? AND CCTCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01HM4", "SELECT CCTDsc FROM TXPCCDef WHERE EmprCod = ? AND CCTCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01HM5", "SELECT CliCod, Tb1_Cod, CCArtCod, TipArtiId, CCColNom, CCColNum, CCCTc, IntId, EmprCod FROM TXPCCCno4 WHERE EmprCod = ? AND CliCod = ? AND Tb1_Cod = ? AND CCArtCod = ? AND TipArtiId = ? AND CCColNom = ? AND CCColNum = ? AND CCCTc = ? AND IntId = ?  FOR UPDATE OF CliCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01HM6", "SELECT CliCod, Tb1_Cod, CCArtCod, TipArtiId, CCColNom, CCColNum, CCCTc, IntId, EmprCod FROM TXPCCCno4 WHERE EmprCod = ? AND CliCod = ? AND Tb1_Cod = ? AND CCArtCod = ? AND TipArtiId = ? AND CCColNom = ? AND CCColNum = ? AND CCCTc = ? AND IntId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01HM7", "SELECT CliCod, Tb1_Cod, CCArtCod, TipArtiId, CCColNom, CCColNum, CCCTc, EmprCod FROM TXPCCCno3 WHERE EmprCod = ? AND CliCod = ? AND Tb1_Cod = ? AND CCArtCod = ? AND TipArtiId = ? AND CCColNom = ? AND CCColNum = ? AND CCCTc = ?  FOR UPDATE OF CliCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01HM8", "SELECT CliCod, Tb1_Cod, CCArtCod, TipArtiId, CCColNom, CCColNum, CCCTc, EmprCod FROM TXPCCCno3 WHERE EmprCod = ? AND CliCod = ? AND Tb1_Cod = ? AND CCArtCod = ? AND TipArtiId = ? AND CCColNom = ? AND CCColNum = ? AND CCCTc = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01HM9", "SELECT CliCod, Tb1_Cod, CCArtCod, TipArtiId, EmprCod FROM TXPCCCno1 WHERE EmprCod = ? AND CliCod = ? AND Tb1_Cod = ? AND CCArtCod = ? AND TipArtiId = ?  FOR UPDATE OF CliCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01HM10", "SELECT CliCod, Tb1_Cod, CCArtCod, TipArtiId, EmprCod FROM TXPCCCno1 WHERE EmprCod = ? AND CliCod = ? AND Tb1_Cod = ? AND CCArtCod = ? AND TipArtiId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01HM11", "SELECT CliCod, Tb1_Cod, CCArtCod, EmprCod FROM TXPCCCnoE WHERE EmprCod = ? AND CliCod = ? AND Tb1_Cod = ? AND CCArtCod = ?  FOR UPDATE OF CliCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01HM12", "SELECT CliCod, Tb1_Cod, CCArtCod, EmprCod FROM TXPCCCnoE WHERE EmprCod = ? AND CliCod = ? AND Tb1_Cod = ? AND CCArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01HM13", "SELECT CliCod, EmprCod, Tb1_Cod FROM TXPTABLA4 WHERE EmprCod = ? AND CliCod = ? AND Tb1_Cod = ?  FOR UPDATE OF CliCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01HM14", "SELECT CliCod, EmprCod, Tb1_Cod FROM TXPTABLA4 WHERE EmprCod = ? AND CliCod = ? AND Tb1_Cod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01HM15", "SELECT Tb1_Dsc FROM TXPTABLE1 WHERE EmprCod = ? AND Tb1_Cod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01HM16", "SELECT CliCod, CliNom, EmprCod FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ?  FOR UPDATE OF CliNom NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01HM17", "SELECT CliCod, CliNom, EmprCod FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01HM18", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01HM19", "SELECT /*+ FIRST_ROWS(100) */ TM1.CliCod, T2.EmprNom, TM1.CliNom, TM1.EmprCod FROM (TXPCLIENT TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.CliCod = ? ORDER BY TM1.EmprCod, TM1.CliCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01HM20", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01HM21", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01HM22", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod FROM TXPCLIENT WHERE ( EmprCod > ? or EmprCod = ? and CliCod > ?) ORDER BY EmprCod, CliCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HM23", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod FROM TXPCLIENT WHERE ( EmprCod < ? or EmprCod = ? and CliCod < ?) ORDER BY EmprCod DESC, CliCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01HM24", "INSERT INTO TXPCLIENT(CliCod, CliNom, EmprCod, CliNif, CliDom, CliPob, CliCp, PrvCod, CliTel1, CliTel2, CliTelex, CliFax, CliIniVac, CliFinVac, CliDes, CliEti, CliUrg, CliPer, CliRef, CliCue, CliRieCon, CliRieCir, CliRieMh, CliFecMh, CliCanRie, CliPerFac, CliAlbAgr, CliFacCop, ZonGeoCod, CliPagUli, CliTub, CliCtrl, CliValA, CliImpMin, CliAlias, CliEtiCC, CliEtiCN, CliEtiEN, CliNEti, CliObs1, CliObs2, CliDivTra, CliDivCod, CliNumEtSa, CliNumEtTi, CliObs, CliPort, CliTrnCod, CliCopAlb, CliEmail, CliNom1, CliCp2, CliTBon, CliedUl, ClidtUl, ClieiUl, CliifUl, CliTipo, CliDom2, FasExpUtl, CliIe, CliPreAlq, Lb_Linurc, CliUltMq, PMDProUlt, PMDPreLim, PMDPreMin, PMDLinUlt, CliEst, CliP1, CliP0, CliEFx, CliEEm, CliNumC, Com_ult, CliAct, CliEt1, CliEt2, CliEt3, CliEt4, Cliemf, CliKgsMn, CliUltlk, CliObsF, CliEvLast, CliEnvUli, Cod_pais, CliCEE, TpOpC, TxtObs, CodWebId, CliMailGr, CliMailPk, CliMailGrE, CliMailPkE, CliPlanUL, Lb_Linu, CliUltl, ClimailPr, CliPerPr, CliUltNPz, SEGId, CliImpMerm, CliImpReop, CliFacMtsP, CliColAb, CliValFijo, CliFactor, CliFacFm, CliFacFmt, ClimailAlb, ClimailFac, stMeivaId, CliEnergia, CliTop25, CliForfra, CliImpMnEs, CliNac) VALUES(?, ?, ?, ' ', ' ', ' ', ' ', 0, ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 0, ' ', ' ', ' ', 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', 0, 0, 0, ' ', ' ', ' ', 0, ' ', ' ', ' ', ' ', 0, ' ', ' ', ' ', 0, 0, 0, ' ', ' ', 0, 0, ' ', ' ', ' ', ' ', 0, 0, 0, 0, ' ', ' ', 0, ' ', 0, 0, 0, 0, 0, 0, 0, ' ', 0, 0, ' ', ' ', 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', 0, 0, ' ', 0, 0, 0, ' ', 0, ' ', ' ', ' ', ' ', ' ', ' ', 0, 0, 0, ' ', ' ', 0, ' ', ' ', ' ', ' ', ' ', 0, 0, ' ', 0, ' ', ' ', ' ', 0, 0, ' ', 0, ' ')", GX_NOMASK, "TXPCLIENT")
         ,new UpdateCursor("T01HM25", "UPDATE TXPCLIENT SET CliNom=?  WHERE EmprCod = ? AND CliCod = ?", GX_NOMASK, "TXPCLIENT")
         ,new UpdateCursor("T01HM26", "DELETE FROM TXPCLIENT  WHERE EmprCod = ? AND CliCod = ?", GX_NOMASK, "TXPCLIENT")
         ,new ForEachCursor("T01HM27", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01HM28", "SELECT * FROM (SELECT EmprCod, CliCod, Lb_rclin FROM TXPREGCOR WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HM29", "SELECT * FROM (SELECT EmprCod, Tex_NPed FROM TXPTEX000 WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HM30", "SELECT * FROM (SELECT EmprCod, CliCod, TipArtCod, TipColCod, IntCod, TipDisCod, Est1_anyo, Est1_mes, Est1_dia FROM TXPCLTATC WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HM31", "SELECT * FROM (SELECT EmprCod, C_Barcod, C_Barcodre, C_Barcodpa, C_Reclinma FROM TXPRECMA1 WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HM32", "SELECT * FROM (SELECT EmprCod, DevEmpCod FROM TXPDEVEMP WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HM33", "SELECT * FROM (SELECT EmprCod, MaqCod, MaqCliCod, MaqArtCod FROM TXPConPes WHERE EmprCod = ? AND MaqCliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HM34", "SELECT * FROM (SELECT EmprCod, Lb_numero FROM TXPENS001 WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HM35", "SELECT * FROM (SELECT EmprCod, CliCod, CliifLin FROM TXPCLIINF WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HM36", "SELECT * FROM (SELECT EmprCod, CliCod, ClieiLin FROM TXPCLIINE WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HM37", "SELECT * FROM (SELECT EmprCod, CliCod, ClidtLin FROM TXPCLIDTF WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HM38", "SELECT * FROM (SELECT EmprCod, CliCod, CliedLin FROM TXPCLIDTE WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HM39", "SELECT * FROM (SELECT EmprCod, CliCod, P_ForCod FROM TXPPREQL WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HM40", "SELECT * FROM (SELECT EmprCod, CliCod, Mdl_Cod FROM TXPCLIMOD WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HM41", "SELECT * FROM (SELECT EmprCod, CliCod, IntCodF2 FROM TXPCLIIN2 WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HM42", "SELECT * FROM (SELECT EmprCod, CliCod, IntCodFC, Tip_ColC FROM TXPCLIINT WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HM43", "SELECT * FROM (SELECT EmprCod, CliCod, FasPreCod FROM TXPPREFSP WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HM44", "SELECT * FROM (SELECT EmprCod, CliCod, Cli_Proc FROM TXPCLIPRL WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HM45", "SELECT * FROM (SELECT EmprCod, PagIden FROM TXPPAGCLI WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HM46", "SELECT * FROM (SELECT EmprCod, Hl_hdr, Hl_hdrr, Hl_hdrp FROM TXPHLREOP WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HM47", "SELECT * FROM (SELECT EmprCod, CliCod, DishCod, TipEstCod, GraCod FROM TXPESTPRE WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HM48", "SELECT * FROM (SELECT EmprCod, EnsLCod FROM TXPENSLAV WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HM49", "SELECT * FROM (SELECT EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie FROM TXPHISREH WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HM50", "SELECT * FROM (SELECT EmprCod, CliCod, EstCol FROM TXPCEstCo WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HM51", "SELECT * FROM (SELECT EMPRCOD, WEBUSU FROM TXPWEBUSU WHERE EMPRCOD = ? AND CLICOD = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HM52", "SELECT * FROM (SELECT EmprCod, CliCod, WEBDISCOD, EMPCOD FROM TXPWeDiEm WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HM53", "SELECT * FROM (SELECT EmprCod, HisEstHRu, HisEstHRe, HisEstHPa, HisEstLCo, HisEstCom, HisEstFon FROM TXPCHISES WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HM54", "SELECT * FROM (SELECT EmprCod, GrpDibCod FROM TXPCGRPEQ WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HM55", "SELECT * FROM (SELECT EmprCod, GrmDibCod FROM TXPCGRMOL WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HM56", "SELECT * FROM (SELECT EmprCod, GrcDibCod FROM TXPCGRCIL WHERE EmprCod = ? AND CliCodC = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HM57", "SELECT * FROM (SELECT EmprCod, EmpesCod, CliCod, FonCod FROM TXPCEMPES WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HM58", "SELECT * FROM (SELECT EmprCod, DibCli, CliCod, DibInt FROM TXPCDIBUJ WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HM59", "SELECT * FROM (SELECT EmprCod, AlbExtCod FROM TXPCALEXT WHERE EmprAlbExt = ? AND AlbExtCli = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HM60", "SELECT * FROM (SELECT EmprCod, CliCod, FacProAny, FacProSer, FacProInt, FacProTip, FacProTar FROM TXPFACPRO WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HM61", "SELECT * FROM (SELECT EmprCod, EstTinAny, EstTinMes, EstTinDia, EstTinNr FROM TXPLCONTI WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HM62", "SELECT * FROM (SELECT EmprCod, AlbTrnCod FROM TXPALBTRA WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HM63", "SELECT * FROM (SELECT EmprCod, CliCod, CliLimKgs FROM TXPPREKIL WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HM64", "SELECT * FROM (SELECT EmprCod, RepCod, CliCod FROM TXPCOMREP WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HM65", "SELECT * FROM (SELECT EmprCod, Codia, CoMes, CoAny, CoLin, CoBarCod, CoBarReo, CoBarPar FROM TXPLCOSTI WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HM66", "SELECT * FROM (SELECT EmprCod, SabFacCod FROM TXPCFACSA WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HM67", "SELECT * FROM (SELECT EmprCod, TiDia, TiMes, TiAny, TiLin, TiBarCod, TiBarReo, TiBarPar FROM TXPLKGSTI WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HM68", "SELECT * FROM (SELECT EmprCod, CliCod, RecTipCon FROM TXPCRECON WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HM69", "SELECT * FROM (SELECT EmprCod, CliCod, RecProCod FROM TXPCCLIPR WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HM70", "SELECT * FROM (SELECT EmprCod, CliCod, HMaForSer, HMaForCNom, HMaForCNum, HMaTipCCod, HMaForNumC, HMaColLin, HMaFec, HmaLin FROM TXPHISMAC WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HM71", "SELECT * FROM (SELECT EmprCod, CliCod, EstAny, EstSerFac FROM TXPCESCLI WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HM72", "SELECT * FROM (SELECT EmprCod, RecTipCo, CliCod FROM TXPCRECLT WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HM73", "SELECT * FROM (SELECT EmprCod, TarSec, CliCod, TipArtCod, TipColCod FROM TXPCTARCO WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HM74", "SELECT * FROM (SELECT EmprCod, AbcTerCod, AbcSec, CliCod FROM TXPABCEXP WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HM75", "SELECT * FROM (SELECT EmprCod, CliCod, CliDesCod FROM TXPCLIDES WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HM76", "SELECT * FROM (SELECT EmprCod, MovParCod, CliCod FROM TXPCMOVPD WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HM77", "SELECT * FROM (SELECT EmprCod, PartCod, CliCod FROM TXPCPARTI WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HM78", "SELECT * FROM (SELECT EmprCod, AlbPrvCod FROM TXPCALBPV WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HM79", "SELECT * FROM (SELECT EmprCod, CliCod, TalCod FROM TXPCENTMA WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HM80", "SELECT * FROM (SELECT EmprCod, CliCod, FasCod FROM TXPPREFAS WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HM81", "SELECT * FROM (SELECT EmprCod, HisBarCod, HisCodReo, HisCodPar, TipDefCod FROM TXPHISREO WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HM82", "SELECT * FROM (SELECT EmprCod, HbaBarCod, HbaBarReo, HbaBarPar FROM TXPHISBAR WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HM83", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod FROM TXPCFORMU WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HM84", "SELECT * FROM (SELECT EmprCod, CliCod, CliPagLin FROM TXPCLIPAG WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HM85", "SELECT * FROM (SELECT EmprCod, CliCod, CliEnvLin FROM TXPCLIENV WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HM86", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod FROM TXPARTICU WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HM87", "SELECT * FROM (SELECT EmprCod, AlbRecCod FROM TXPALBREC WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HM88", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprGuiRem = ? AND GuiRemCli = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HM89", "SELECT * FROM (SELECT EmprCod, AlbComCod FROM TXPCALCOM WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HM90", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, CliCod FROM TXPCLIENT ORDER BY EmprCod, CliCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01HM91", "SELECT T1.CliCod, T2.Tb1_Dsc, T1.EmprCod, T1.Tb1_Cod FROM (TXPTABLA4 T1 INNER JOIN TXPTABLE1 T2 ON T2.EmprCod = T1.EmprCod AND T2.Tb1_Cod = T1.Tb1_Cod) WHERE T1.EmprCod = ? and T1.CliCod = ? and T1.Tb1_Cod = ? ORDER BY T1.EmprCod, T1.CliCod, T1.Tb1_Cod ",true, GX_NOMASK, false, this,6, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01HM92", "SELECT Tb1_Dsc FROM TXPTABLE1 WHERE EmprCod = ? AND Tb1_Cod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01HM93", "SELECT EmprCod, CliCod, Tb1_Cod FROM TXPTABLA4 WHERE EmprCod = ? AND CliCod = ? AND Tb1_Cod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01HM94", "INSERT INTO TXPTABLA4(CliCod, EmprCod, Tb1_Cod) VALUES(?, ?, ?)", GX_NOMASK, "TXPTABLA4")
         ,new UpdateCursor("T01HM95", "DELETE FROM TXPTABLA4  WHERE EmprCod = ? AND CliCod = ? AND Tb1_Cod = ?", GX_NOMASK, "TXPTABLA4")
         ,new ForEachCursor("T01HM96", "SELECT Tb1_Dsc FROM TXPTABLE1 WHERE EmprCod = ? AND Tb1_Cod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01HM97", "SELECT * FROM (SELECT EmprCod, CliCod, Tb1_Cod, CCArtCod FROM TXPCCCnoE WHERE EmprCod = ? AND CliCod = ? AND Tb1_Cod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HM98", "SELECT EmprCod, CliCod, Tb1_Cod FROM TXPTABLA4 WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod, CliCod, Tb1_Cod ",true, GX_NOMASK, false, this,6, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01HM99", "SELECT CliCod, Tb1_Cod, CCArtCod, EmprCod FROM TXPCCCnoE WHERE EmprCod = ? and CliCod = ? and Tb1_Cod = ? and CCArtCod = ? ORDER BY EmprCod, CliCod, Tb1_Cod, CCArtCod ",true, GX_NOMASK, false, this,6, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01HM100", "SELECT EmprCod, CliCod, Tb1_Cod, CCArtCod FROM TXPCCCnoE WHERE EmprCod = ? AND CliCod = ? AND Tb1_Cod = ? AND CCArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01HM101", "INSERT INTO TXPCCCnoE(CliCod, Tb1_Cod, CCArtCod, EmprCod) VALUES(?, ?, ?, ?)", GX_NOMASK, "TXPCCCnoE")
         ,new UpdateCursor("T01HM102", "DELETE FROM TXPCCCnoE  WHERE EmprCod = ? AND CliCod = ? AND Tb1_Cod = ? AND CCArtCod = ?", GX_NOMASK, "TXPCCCnoE")
         ,new ForEachCursor("T01HM103", "SELECT * FROM (SELECT EmprCod, CliCod, Tb1_Cod, CCArtCod, TipArtiId FROM TXPCCCno1 WHERE EmprCod = ? AND CliCod = ? AND Tb1_Cod = ? AND CCArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HM104", "SELECT EmprCod, CliCod, Tb1_Cod, CCArtCod FROM TXPCCCnoE WHERE EmprCod = ? and CliCod = ? and Tb1_Cod = ? ORDER BY EmprCod, CliCod, Tb1_Cod, CCArtCod ",true, GX_NOMASK, false, this,6, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01HM105", "SELECT CliCod, Tb1_Cod, CCArtCod, TipArtiId, EmprCod FROM TXPCCCno1 WHERE EmprCod = ? and CliCod = ? and Tb1_Cod = ? and CCArtCod = ? and TipArtiId = ? ORDER BY EmprCod, CliCod, Tb1_Cod, CCArtCod, TipArtiId ",true, GX_NOMASK, false, this,6, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01HM106", "SELECT EmprCod, CliCod, Tb1_Cod, CCArtCod, TipArtiId FROM TXPCCCno1 WHERE EmprCod = ? AND CliCod = ? AND Tb1_Cod = ? AND CCArtCod = ? AND TipArtiId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01HM107", "INSERT INTO TXPCCCno1(CliCod, Tb1_Cod, CCArtCod, TipArtiId, EmprCod) VALUES(?, ?, ?, ?, ?)", GX_NOMASK, "TXPCCCno1")
         ,new UpdateCursor("T01HM108", "DELETE FROM TXPCCCno1  WHERE EmprCod = ? AND CliCod = ? AND Tb1_Cod = ? AND CCArtCod = ? AND TipArtiId = ?", GX_NOMASK, "TXPCCCno1")
         ,new ForEachCursor("T01HM109", "SELECT * FROM (SELECT EmprCod, CliCod, Tb1_Cod, CCArtCod, TipArtiId, CCColNom, CCColNum, CCCTc FROM TXPCCCno3 WHERE EmprCod = ? AND CliCod = ? AND Tb1_Cod = ? AND CCArtCod = ? AND TipArtiId = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HM110", "SELECT EmprCod, CliCod, Tb1_Cod, CCArtCod, TipArtiId FROM TXPCCCno1 WHERE EmprCod = ? and CliCod = ? and Tb1_Cod = ? and CCArtCod = ? ORDER BY EmprCod, CliCod, Tb1_Cod, CCArtCod, TipArtiId ",true, GX_NOMASK, false, this,6, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01HM111", "SELECT CliCod, Tb1_Cod, CCArtCod, TipArtiId, CCColNom, CCColNum, CCCTc, EmprCod FROM TXPCCCno3 WHERE EmprCod = ? and CliCod = ? and Tb1_Cod = ? and CCArtCod = ? and TipArtiId = ? and CCColNom = ? and CCColNum = ? and CCCTc = ? ORDER BY EmprCod, CliCod, Tb1_Cod, CCArtCod, TipArtiId, CCColNom, CCColNum, CCCTc ",true, GX_NOMASK, false, this,6, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01HM112", "SELECT EmprCod, CliCod, Tb1_Cod, CCArtCod, TipArtiId, CCColNom, CCColNum, CCCTc FROM TXPCCCno3 WHERE EmprCod = ? AND CliCod = ? AND Tb1_Cod = ? AND CCArtCod = ? AND TipArtiId = ? AND CCColNom = ? AND CCColNum = ? AND CCCTc = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01HM113", "INSERT INTO TXPCCCno3(CliCod, Tb1_Cod, CCArtCod, TipArtiId, CCColNom, CCColNum, CCCTc, EmprCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPCCCno3")
         ,new UpdateCursor("T01HM114", "DELETE FROM TXPCCCno3  WHERE EmprCod = ? AND CliCod = ? AND Tb1_Cod = ? AND CCArtCod = ? AND TipArtiId = ? AND CCColNom = ? AND CCColNum = ? AND CCCTc = ?", GX_NOMASK, "TXPCCCno3")
         ,new ForEachCursor("T01HM115", "SELECT * FROM (SELECT EmprCod, CliCod, Tb1_Cod, CCArtCod, TipArtiId, CCColNom, CCColNum, CCCTc, IntId FROM TXPCCCno4 WHERE EmprCod = ? AND CliCod = ? AND Tb1_Cod = ? AND CCArtCod = ? AND TipArtiId = ? AND CCColNom = ? AND CCColNum = ? AND CCCTc = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HM116", "SELECT EmprCod, CliCod, Tb1_Cod, CCArtCod, TipArtiId, CCColNom, CCColNum, CCCTc FROM TXPCCCno3 WHERE EmprCod = ? and CliCod = ? and Tb1_Cod = ? and CCArtCod = ? and TipArtiId = ? ORDER BY EmprCod, CliCod, Tb1_Cod, CCArtCod, TipArtiId, CCColNom, CCColNum, CCCTc ",true, GX_NOMASK, false, this,6, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01HM117", "SELECT CliCod, Tb1_Cod, CCArtCod, TipArtiId, CCColNom, CCColNum, CCCTc, IntId, EmprCod FROM TXPCCCno4 WHERE EmprCod = ? and CliCod = ? and Tb1_Cod = ? and CCArtCod = ? and TipArtiId = ? and CCColNom = ? and CCColNum = ? and CCCTc = ? and IntId = ? ORDER BY EmprCod, CliCod, Tb1_Cod, CCArtCod, TipArtiId, CCColNom, CCColNum, CCCTc, IntId ",true, GX_NOMASK, false, this,6, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01HM118", "SELECT EmprCod, CliCod, Tb1_Cod, CCArtCod, TipArtiId, CCColNom, CCColNum, CCCTc, IntId FROM TXPCCCno4 WHERE EmprCod = ? AND CliCod = ? AND Tb1_Cod = ? AND CCArtCod = ? AND TipArtiId = ? AND CCColNom = ? AND CCColNum = ? AND CCCTc = ? AND IntId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01HM119", "INSERT INTO TXPCCCno4(CliCod, Tb1_Cod, CCArtCod, TipArtiId, CCColNom, CCColNum, CCCTc, IntId, EmprCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPCCCno4")
         ,new UpdateCursor("T01HM120", "DELETE FROM TXPCCCno4  WHERE EmprCod = ? AND CliCod = ? AND Tb1_Cod = ? AND CCArtCod = ? AND TipArtiId = ? AND CCColNom = ? AND CCColNum = ? AND CCCTc = ? AND IntId = ?", GX_NOMASK, "TXPCCCno4")
         ,new ForEachCursor("T01HM121", "SELECT * FROM (SELECT EmprCod, CliCod, Tb1_Cod, CCArtCod, TipArtiId, CCColNom, CCColNum, CCCTc, IntId, CCTCod, CCTLin FROM TXPCCCNOS WHERE EmprCod = ? AND CliCod = ? AND Tb1_Cod = ? AND CCArtCod = ? AND TipArtiId = ? AND CCColNom = ? AND CCColNum = ? AND CCCTc = ? AND IntId = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HM122", "SELECT EmprCod, CliCod, Tb1_Cod, CCArtCod, TipArtiId, CCColNom, CCColNum, CCCTc, IntId FROM TXPCCCno4 WHERE EmprCod = ? and CliCod = ? and Tb1_Cod = ? and CCArtCod = ? and TipArtiId = ? and CCColNom = ? and CCColNum = ? and CCCTc = ? ORDER BY EmprCod, CliCod, Tb1_Cod, CCArtCod, TipArtiId, CCColNom, CCColNum, CCCTc, IntId ",true, GX_NOMASK, false, this,6, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01HM123", "SELECT T1.CliCod, T1.Tb1_Cod, T1.CCArtCod, T1.TipArtiId, T1.CCColNom, T1.CCColNum, T1.CCCTc, T1.IntId, T2.CCTDsc, T1.EmprCod, T1.CCTCod FROM (TXPCCCno5 T1 INNER JOIN TXPCCDef T2 ON T2.EmprCod = T1.EmprCod AND T2.CCTCod = T1.CCTCod) WHERE T1.EmprCod = ? and T1.CliCod = ? and T1.Tb1_Cod = ? and T1.CCArtCod = ? and T1.TipArtiId = ? and T1.CCColNom = ? and T1.CCColNum = ? and T1.CCCTc = ? and T1.IntId = ? and T1.CCTCod = ? ORDER BY T1.EmprCod, T1.CliCod, T1.Tb1_Cod, T1.CCArtCod, T1.TipArtiId, T1.CCColNom, T1.CCColNum, T1.CCCTc, T1.IntId, T1.CCTCod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01HM124", "SELECT CCTDsc FROM TXPCCDef WHERE EmprCod = ? AND CCTCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01HM125", "SELECT EmprCod, CliCod, Tb1_Cod, CCArtCod, TipArtiId, CCColNom, CCColNum, CCCTc, IntId, CCTCod FROM TXPCCCno5 WHERE EmprCod = ? AND CliCod = ? AND Tb1_Cod = ? AND CCArtCod = ? AND TipArtiId = ? AND CCColNom = ? AND CCColNum = ? AND CCCTc = ? AND IntId = ? AND CCTCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01HM126", "INSERT INTO TXPCCCno5(CliCod, Tb1_Cod, CCArtCod, TipArtiId, CCColNom, CCColNum, CCCTc, IntId, EmprCod, CCTCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPCCCno5")
         ,new UpdateCursor("T01HM127", "DELETE FROM TXPCCCno5  WHERE EmprCod = ? AND CliCod = ? AND Tb1_Cod = ? AND CCArtCod = ? AND TipArtiId = ? AND CCColNom = ? AND CCColNum = ? AND CCCTc = ? AND IntId = ? AND CCTCod = ?", GX_NOMASK, "TXPCCCno5")
         ,new ForEachCursor("T01HM128", "SELECT CCTDsc FROM TXPCCDef WHERE EmprCod = ? AND CCTCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01HM129", "SELECT * FROM (SELECT EmprCod, CliCod, Tb1_Cod, CCArtCod, TipArtiId, CCColNom, CCColNum, CCCTc, IntId, CCTCod, CCTLin FROM TXPCCCNOS WHERE EmprCod = ? AND CliCod = ? AND Tb1_Cod = ? AND CCArtCod = ? AND TipArtiId = ? AND CCColNom = ? AND CCColNum = ? AND CCCTc = ? AND IntId = ? AND CCTCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HM130", "SELECT EmprCod, CliCod, Tb1_Cod, CCArtCod, TipArtiId, CCColNom, CCColNum, CCCTc, IntId, CCTCod FROM TXPCCCno5 WHERE EmprCod = ? and CliCod = ? and Tb1_Cod = ? and CCArtCod = ? and TipArtiId = ? and CCColNom = ? and CCColNum = ? and CCCTc = ? and IntId = ? ORDER BY EmprCod, CliCod, Tb1_Cod, CCArtCod, TipArtiId, CCColNom, CCColNum, CCCTc, IntId, CCTCod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 13);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 3);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 13);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 3);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 13);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 3);
               return;
            case 4 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 13);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 3);
               return;
            case 5 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 13);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 3);
               return;
            case 6 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 13);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 3);
               return;
            case 7 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               return;
            case 8 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               return;
            case 9 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               return;
            case 10 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               return;
            case 11 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 12 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 80);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 14 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               return;
            case 15 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 17 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 28 :
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
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
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
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 33 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 34 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 35 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 36 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 37 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 38 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               return;
            case 39 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 40 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 41 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 42 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 43 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 44 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 45 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 12);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               return;
            case 46 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 47 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               return;
            case 48 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               return;
            case 49 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               return;
            case 50 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               return;
            case 51 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               return;
            case 52 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 53 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 54 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 55 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 12);
               return;
            case 56 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 57 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 58 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 59 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
      }
      getresults60( cursor, rslt, buf) ;
   }

   public void getresults60( int cursor ,
                             IFieldGetter rslt ,
                             Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 60 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 61 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               return;
            case 62 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 63 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               return;
            case 64 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 65 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               return;
            case 66 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 67 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               return;
            case 68 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(9);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               return;
            case 69 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               return;
            case 70 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 71 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               return;
            case 72 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 73 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 74 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 75 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 76 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 77 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 78 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 79 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 80 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 81 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
            case 82 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 83 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 84 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               return;
            case 85 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 86 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 87 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 88 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 89 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 80);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((short[]) buf[4])[0] = rslt.getShort(4);
               return;
      }
      getresults90( cursor, rslt, buf) ;
   }

   public void getresults90( int cursor ,
                             IFieldGetter rslt ,
                             Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 90 :
               ((String[]) buf[0])[0] = rslt.getString(1, 80);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 91 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 94 :
               ((String[]) buf[0])[0] = rslt.getString(1, 80);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 95 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               return;
            case 96 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 97 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               return;
            case 98 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               return;
            case 101 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 102 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               return;
            case 103 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               return;
            case 104 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 107 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 13);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               return;
            case 108 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 109 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 13);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 3);
               return;
            case 110 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 13);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               return;
            case 113 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 13);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               return;
            case 114 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 13);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               return;
            case 115 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 13);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 3);
               return;
            case 116 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 13);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               return;
            case 119 :
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
      }
      getresults120( cursor, rslt, buf) ;
   }

   public void getresults120( int cursor ,
                              IFieldGetter rslt ,
                              Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 120 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 13);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               return;
            case 121 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 13);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 30);
               ((String[]) buf[9])[0] = rslt.getString(10, 3);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               return;
            case 122 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 123 :
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
            case 126 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 127 :
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
            case 128 :
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
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               stmt.setString(4, (String)parms[4], 16);
               stmt.setShort(5, ((Number) parms[5]).shortValue());
               stmt.setString(6, (String)parms[6], 13);
               stmt.setInt(7, ((Number) parms[7]).intValue());
               stmt.setByte(8, ((Number) parms[8]).byteValue());
               stmt.setShort(9, ((Number) parms[9]).shortValue());
               stmt.setInt(10, ((Number) parms[10]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               stmt.setString(4, (String)parms[4], 16);
               stmt.setShort(5, ((Number) parms[5]).shortValue());
               stmt.setString(6, (String)parms[6], 13);
               stmt.setInt(7, ((Number) parms[7]).intValue());
               stmt.setByte(8, ((Number) parms[8]).byteValue());
               stmt.setShort(9, ((Number) parms[9]).shortValue());
               stmt.setInt(10, ((Number) parms[10]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               stmt.setString(4, (String)parms[4], 16);
               stmt.setShort(5, ((Number) parms[5]).shortValue());
               stmt.setString(6, (String)parms[6], 13);
               stmt.setInt(7, ((Number) parms[7]).intValue());
               stmt.setByte(8, ((Number) parms[8]).byteValue());
               stmt.setShort(9, ((Number) parms[9]).shortValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               stmt.setString(4, (String)parms[4], 16);
               stmt.setShort(5, ((Number) parms[5]).shortValue());
               stmt.setString(6, (String)parms[6], 13);
               stmt.setInt(7, ((Number) parms[7]).intValue());
               stmt.setByte(8, ((Number) parms[8]).byteValue());
               stmt.setShort(9, ((Number) parms[9]).shortValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               stmt.setString(4, (String)parms[4], 16);
               stmt.setShort(5, ((Number) parms[5]).shortValue());
               stmt.setString(6, (String)parms[6], 13);
               stmt.setInt(7, ((Number) parms[7]).intValue());
               stmt.setByte(8, ((Number) parms[8]).byteValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               stmt.setString(4, (String)parms[4], 16);
               stmt.setShort(5, ((Number) parms[5]).shortValue());
               stmt.setString(6, (String)parms[6], 13);
               stmt.setInt(7, ((Number) parms[7]).intValue());
               stmt.setByte(8, ((Number) parms[8]).byteValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               stmt.setString(4, (String)parms[4], 16);
               stmt.setShort(5, ((Number) parms[5]).shortValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               stmt.setString(4, (String)parms[4], 16);
               stmt.setShort(5, ((Number) parms[5]).shortValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               stmt.setString(4, (String)parms[4], 16);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               stmt.setString(4, (String)parms[4], 16);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
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
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[3]).intValue());
               }
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[3]).intValue());
               }
               return;
            case 22 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               stmt.setString(2, (String)parms[2], 30);
               stmt.setString(3, (String)parms[3], 3);
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 30);
               stmt.setString(2, (String)parms[1], 3);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[3]).intValue());
               }
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 28 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 29 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 31 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 32 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 33 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 34 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 35 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 36 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 37 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 38 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 39 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 40 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 41 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 42 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 43 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 44 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 45 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 46 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 47 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 48 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 49 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 50 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 51 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 52 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 53 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 54 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 55 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 56 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 57 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 58 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 59 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
      }
      setparameters60( cursor, stmt, parms) ;
   }

   public void setparameters60( int cursor ,
                                IFieldSetter stmt ,
                                Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 60 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 61 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 62 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 63 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 64 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 65 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 66 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 67 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 68 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 69 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 70 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 71 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 72 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 73 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 74 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 75 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 76 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 77 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 78 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 79 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 80 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 81 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 82 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 83 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 84 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 85 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 86 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 87 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 89 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               return;
      }
      setparameters90( cursor, stmt, parms) ;
   }

   public void setparameters90( int cursor ,
                                IFieldSetter stmt ,
                                Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 90 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 91 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               return;
            case 92 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               return;
            case 93 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               return;
            case 94 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 95 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               return;
            case 96 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 97 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               stmt.setString(4, (String)parms[4], 16);
               return;
            case 98 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               stmt.setString(4, (String)parms[4], 16);
               return;
            case 99 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               stmt.setShort(2, ((Number) parms[2]).shortValue());
               stmt.setString(3, (String)parms[3], 16);
               stmt.setString(4, (String)parms[4], 3);
               return;
            case 100 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               stmt.setString(4, (String)parms[4], 16);
               return;
            case 101 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               stmt.setString(4, (String)parms[4], 16);
               return;
            case 102 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               return;
            case 103 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               stmt.setString(4, (String)parms[4], 16);
               stmt.setShort(5, ((Number) parms[5]).shortValue());
               return;
            case 104 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               stmt.setString(4, (String)parms[4], 16);
               stmt.setShort(5, ((Number) parms[5]).shortValue());
               return;
            case 105 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               stmt.setShort(2, ((Number) parms[2]).shortValue());
               stmt.setString(3, (String)parms[3], 16);
               stmt.setShort(4, ((Number) parms[4]).shortValue());
               stmt.setString(5, (String)parms[5], 3);
               return;
            case 106 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               stmt.setString(4, (String)parms[4], 16);
               stmt.setShort(5, ((Number) parms[5]).shortValue());
               return;
            case 107 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               stmt.setString(4, (String)parms[4], 16);
               stmt.setShort(5, ((Number) parms[5]).shortValue());
               return;
            case 108 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               stmt.setString(4, (String)parms[4], 16);
               return;
            case 109 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               stmt.setString(4, (String)parms[4], 16);
               stmt.setShort(5, ((Number) parms[5]).shortValue());
               stmt.setString(6, (String)parms[6], 13);
               stmt.setInt(7, ((Number) parms[7]).intValue());
               stmt.setByte(8, ((Number) parms[8]).byteValue());
               return;
            case 110 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               stmt.setString(4, (String)parms[4], 16);
               stmt.setShort(5, ((Number) parms[5]).shortValue());
               stmt.setString(6, (String)parms[6], 13);
               stmt.setInt(7, ((Number) parms[7]).intValue());
               stmt.setByte(8, ((Number) parms[8]).byteValue());
               return;
            case 111 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               stmt.setShort(2, ((Number) parms[2]).shortValue());
               stmt.setString(3, (String)parms[3], 16);
               stmt.setShort(4, ((Number) parms[4]).shortValue());
               stmt.setString(5, (String)parms[5], 13);
               stmt.setInt(6, ((Number) parms[6]).intValue());
               stmt.setByte(7, ((Number) parms[7]).byteValue());
               stmt.setString(8, (String)parms[8], 3);
               return;
            case 112 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               stmt.setString(4, (String)parms[4], 16);
               stmt.setShort(5, ((Number) parms[5]).shortValue());
               stmt.setString(6, (String)parms[6], 13);
               stmt.setInt(7, ((Number) parms[7]).intValue());
               stmt.setByte(8, ((Number) parms[8]).byteValue());
               return;
            case 113 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               stmt.setString(4, (String)parms[4], 16);
               stmt.setShort(5, ((Number) parms[5]).shortValue());
               stmt.setString(6, (String)parms[6], 13);
               stmt.setInt(7, ((Number) parms[7]).intValue());
               stmt.setByte(8, ((Number) parms[8]).byteValue());
               return;
            case 114 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               stmt.setString(4, (String)parms[4], 16);
               stmt.setShort(5, ((Number) parms[5]).shortValue());
               return;
            case 115 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               stmt.setString(4, (String)parms[4], 16);
               stmt.setShort(5, ((Number) parms[5]).shortValue());
               stmt.setString(6, (String)parms[6], 13);
               stmt.setInt(7, ((Number) parms[7]).intValue());
               stmt.setByte(8, ((Number) parms[8]).byteValue());
               stmt.setShort(9, ((Number) parms[9]).shortValue());
               return;
            case 116 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               stmt.setString(4, (String)parms[4], 16);
               stmt.setShort(5, ((Number) parms[5]).shortValue());
               stmt.setString(6, (String)parms[6], 13);
               stmt.setInt(7, ((Number) parms[7]).intValue());
               stmt.setByte(8, ((Number) parms[8]).byteValue());
               stmt.setShort(9, ((Number) parms[9]).shortValue());
               return;
            case 117 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               stmt.setShort(2, ((Number) parms[2]).shortValue());
               stmt.setString(3, (String)parms[3], 16);
               stmt.setShort(4, ((Number) parms[4]).shortValue());
               stmt.setString(5, (String)parms[5], 13);
               stmt.setInt(6, ((Number) parms[6]).intValue());
               stmt.setByte(7, ((Number) parms[7]).byteValue());
               stmt.setShort(8, ((Number) parms[8]).shortValue());
               stmt.setString(9, (String)parms[9], 3);
               return;
            case 118 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               stmt.setString(4, (String)parms[4], 16);
               stmt.setShort(5, ((Number) parms[5]).shortValue());
               stmt.setString(6, (String)parms[6], 13);
               stmt.setInt(7, ((Number) parms[7]).intValue());
               stmt.setByte(8, ((Number) parms[8]).byteValue());
               stmt.setShort(9, ((Number) parms[9]).shortValue());
               return;
            case 119 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               stmt.setString(4, (String)parms[4], 16);
               stmt.setShort(5, ((Number) parms[5]).shortValue());
               stmt.setString(6, (String)parms[6], 13);
               stmt.setInt(7, ((Number) parms[7]).intValue());
               stmt.setByte(8, ((Number) parms[8]).byteValue());
               stmt.setShort(9, ((Number) parms[9]).shortValue());
               return;
      }
      setparameters120( cursor, stmt, parms) ;
   }

   public void setparameters120( int cursor ,
                                 IFieldSetter stmt ,
                                 Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 120 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               stmt.setString(4, (String)parms[4], 16);
               stmt.setShort(5, ((Number) parms[5]).shortValue());
               stmt.setString(6, (String)parms[6], 13);
               stmt.setInt(7, ((Number) parms[7]).intValue());
               stmt.setByte(8, ((Number) parms[8]).byteValue());
               return;
            case 121 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               stmt.setString(4, (String)parms[4], 16);
               stmt.setShort(5, ((Number) parms[5]).shortValue());
               stmt.setString(6, (String)parms[6], 13);
               stmt.setInt(7, ((Number) parms[7]).intValue());
               stmt.setByte(8, ((Number) parms[8]).byteValue());
               stmt.setShort(9, ((Number) parms[9]).shortValue());
               stmt.setInt(10, ((Number) parms[10]).intValue());
               return;
            case 122 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 123 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               stmt.setString(4, (String)parms[4], 16);
               stmt.setShort(5, ((Number) parms[5]).shortValue());
               stmt.setString(6, (String)parms[6], 13);
               stmt.setInt(7, ((Number) parms[7]).intValue());
               stmt.setByte(8, ((Number) parms[8]).byteValue());
               stmt.setShort(9, ((Number) parms[9]).shortValue());
               stmt.setInt(10, ((Number) parms[10]).intValue());
               return;
            case 124 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               stmt.setShort(2, ((Number) parms[2]).shortValue());
               stmt.setString(3, (String)parms[3], 16);
               stmt.setShort(4, ((Number) parms[4]).shortValue());
               stmt.setString(5, (String)parms[5], 13);
               stmt.setInt(6, ((Number) parms[6]).intValue());
               stmt.setByte(7, ((Number) parms[7]).byteValue());
               stmt.setShort(8, ((Number) parms[8]).shortValue());
               stmt.setString(9, (String)parms[9], 3);
               stmt.setInt(10, ((Number) parms[10]).intValue());
               return;
            case 125 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               stmt.setString(4, (String)parms[4], 16);
               stmt.setShort(5, ((Number) parms[5]).shortValue());
               stmt.setString(6, (String)parms[6], 13);
               stmt.setInt(7, ((Number) parms[7]).intValue());
               stmt.setByte(8, ((Number) parms[8]).byteValue());
               stmt.setShort(9, ((Number) parms[9]).shortValue());
               stmt.setInt(10, ((Number) parms[10]).intValue());
               return;
            case 126 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 127 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               stmt.setString(4, (String)parms[4], 16);
               stmt.setShort(5, ((Number) parms[5]).shortValue());
               stmt.setString(6, (String)parms[6], 13);
               stmt.setInt(7, ((Number) parms[7]).intValue());
               stmt.setByte(8, ((Number) parms[8]).byteValue());
               stmt.setShort(9, ((Number) parms[9]).shortValue());
               stmt.setInt(10, ((Number) parms[10]).intValue());
               return;
            case 128 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               stmt.setString(4, (String)parms[4], 16);
               stmt.setShort(5, ((Number) parms[5]).shortValue());
               stmt.setString(6, (String)parms[6], 13);
               stmt.setInt(7, ((Number) parms[7]).intValue());
               stmt.setByte(8, ((Number) parms[8]).byteValue());
               stmt.setShort(9, ((Number) parms[9]).shortValue());
               return;
      }
   }

}

