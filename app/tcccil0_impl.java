package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tcccil0_impl extends GXDataArea
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
      gxfirstwebparm = httpContext.GetFirstPar( "EmprCod") ;
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_5") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A10790EstCilCod = (byte)(GXutil.lval( httpContext.GetPar( "EstCilCod"))) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_5( A396EmprCod, A10790EstCilCod) ;
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
         gxfirstwebparm = httpContext.GetFirstPar( "EmprCod") ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
      {
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxfirstwebparm = httpContext.GetFirstPar( "EmprCod") ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Gridtcccil0_level1item") == 0 )
      {
         gxnrgridtcccil0_level1item_newrow_invoke( ) ;
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
         A396EmprCod = gxfirstwebparm ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
         {
            A1013DibCli = httpContext.GetPar( "DibCli") ;
            httpContext.ajax_rsp_assign_attri("", false, "A1013DibCli", A1013DibCli);
            A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A1014DibInt = (int)(GXutil.lval( httpContext.GetPar( "DibInt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1014DibInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1014DibInt), 8, 0));
            A1807DibLinCil = (short)(GXutil.lval( httpContext.GetPar( "DibLinCil"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1807DibLinCil", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1807DibLinCil), 4, 0));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "ESTADOS CILINDROS", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtDibCilUlt_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public void gxnrgridtcccil0_level1item_newrow_invoke( )
   {
      nRC_GXsfl_73 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_73"))) ;
      nGXsfl_73_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_73_idx"))) ;
      sGXsfl_73_idx = httpContext.GetPar( "sGXsfl_73_idx") ;
      Gx_mode = httpContext.GetPar( "Mode") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgridtcccil0_level1item_newrow( ) ;
      /* End function gxnrGridtcccil0_level1item_newrow_invoke */
   }

   public tcccil0_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tcccil0_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tcccil0_impl.class ));
   }

   public tcccil0_impl( int remoteHandle ,
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, httpContext.getMessage( "ESTADOS CILINDROS", ""), "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, 0, (short)(0), "HLP_TCCCIL0.htm");
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCCCIL0.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
      ClassString = "BtnPrevious" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCCCIL0.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      ClassString = "BtnNext" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCCCIL0.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
      ClassString = "BtnLast" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCCCIL0.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
      ClassString = "BtnSelect" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TCCCIL0.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCCCIL0.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCCCIL0.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDibCli_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtDibCli_Internalname, httpContext.getMessage( "Dibujo del Cliente", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDibCli_Internalname, GXutil.rtrim( A1013DibCli), GXutil.rtrim( localUtil.format( A1013DibCli, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDibCli_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtDibCli_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCCCIL0.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCCCIL0.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDibInt_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtDibInt_Internalname, httpContext.getMessage( "Dibujo Interno", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDibInt_Internalname, GXutil.ltrim( localUtil.ntoc( A1014DibInt, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDibInt_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1014DibInt), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1014DibInt), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDibInt_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtDibInt_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCCCIL0.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDibLinCil_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtDibLinCil_Internalname, httpContext.getMessage( "Numero de Clindro", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDibLinCil_Internalname, GXutil.ltrim( localUtil.ntoc( A1807DibLinCil, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDibLinCil_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1807DibLinCil), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1807DibLinCil), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDibLinCil_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtDibLinCil_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCCCIL0.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDibCilUlt_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtDibCilUlt_Internalname, httpContext.getMessage( "Ultima Linea", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDibCilUlt_Internalname, GXutil.ltrim( localUtil.ntoc( A10793DibCilUlt, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDibCilUlt_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10793DibCilUlt), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A10793DibCilUlt), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,64);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDibCilUlt_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtDibCilUlt_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCCCIL0.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 LevelTable", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divLevel1table_Internalname, 1, 0, "px", 0, "px", "LevelTable", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTitlelevel1_Internalname, httpContext.getMessage( "Level1", ""), "", "", lblTitlelevel1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, 0, (short)(0), "HLP_TCCCIL0.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      gxdraw_gridtcccil0_level1item( ) ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 87,'',false,'',0)\"" ;
      ClassString = "BtnEnter" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCCCIL0.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 89,'',false,'',0)\"" ;
      ClassString = "BtnCancel" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCCCIL0.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'',0)\"" ;
      ClassString = "BtnDelete" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCCCIL0.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
   }

   public void gxdraw_gridtcccil0_level1item( )
   {
      /*  Grid Control  */
      startgridcontrol73( ) ;
      nGXsfl_73_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1435 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1435 = (short)(1) ;
            scanStart1971435( ) ;
            while ( RcdFound1435 != 0 )
            {
               init_level_properties1435( ) ;
               getByPrimaryKey1971435( ) ;
               addRow1971435( ) ;
               scanNext1971435( ) ;
            }
            scanEnd1971435( ) ;
            nBlankRcdCount1435 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal1971435( ) ;
         standaloneModal1971435( ) ;
         sMode1435 = Gx_mode ;
         while ( nGXsfl_73_idx < nRC_GXsfl_73 )
         {
            bGXsfl_73_Refreshing = true ;
            readRow1971435( ) ;
            edtDibCilLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DIBCILLIN_"+sGXsfl_73_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDibCilLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDibCilLin_Enabled), 5, 0), !bGXsfl_73_Refreshing);
            edtEstCilCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ESTCILCOD_"+sGXsfl_73_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtEstCilCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstCilCod_Enabled), 5, 0), !bGXsfl_73_Refreshing);
            edtEstCilDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ESTCILDSC_"+sGXsfl_73_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtEstCilDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstCilDsc_Enabled), 5, 0), !bGXsfl_73_Refreshing);
            edtDibCilFch_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DIBCILFCH_"+sGXsfl_73_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDibCilFch_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDibCilFch_Enabled), 5, 0), !bGXsfl_73_Refreshing);
            edtDibCilMt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DIBCILMT_"+sGXsfl_73_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDibCilMt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDibCilMt_Enabled), 5, 0), !bGXsfl_73_Refreshing);
            edtDibCilUs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DIBCILUS_"+sGXsfl_73_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDibCilUs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDibCilUs_Enabled), 5, 0), !bGXsfl_73_Refreshing);
            edtDibCilTm_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DIBCILTM_"+sGXsfl_73_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDibCilTm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDibCilTm_Enabled), 5, 0), !bGXsfl_73_Refreshing);
            edtDibCilHh_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DIBCILHH_"+sGXsfl_73_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDibCilHh_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDibCilHh_Enabled), 5, 0), !bGXsfl_73_Refreshing);
            edtDibCilOb_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DIBCILOB_"+sGXsfl_73_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDibCilOb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDibCilOb_Enabled), 5, 0), !bGXsfl_73_Refreshing);
            if ( ( nRcdExists_1435 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1971435( ) ;
            }
            sendRow1971435( ) ;
            bGXsfl_73_Refreshing = false ;
         }
         Gx_mode = sMode1435 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1435 = (short)(5) ;
         nRcdExists_1435 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1971435( ) ;
            while ( RcdFound1435 != 0 )
            {
               sGXsfl_73_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_73_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_731435( ) ;
               init_level_properties1435( ) ;
               standaloneNotModal1971435( ) ;
               getByPrimaryKey1971435( ) ;
               standaloneModal1971435( ) ;
               addRow1971435( ) ;
               scanNext1971435( ) ;
            }
            scanEnd1971435( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1435 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_73_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_73_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_731435( ) ;
      initAll1971435( ) ;
      init_level_properties1435( ) ;
      nRcdExists_1435 = (short)(0) ;
      nIsMod_1435 = (short)(0) ;
      nRcdDeleted_1435 = (short)(0) ;
      nBlankRcdCount1435 = (short)(nBlankRcdUsr1435+nBlankRcdCount1435) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1435 > 0 )
      {
         standaloneNotModal1971435( ) ;
         standaloneModal1971435( ) ;
         addRow1971435( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtDibCilLin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1435 = (short)(nBlankRcdCount1435-1) ;
      }
      Gx_mode = sMode1435 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sStyleString = "" ;
      httpContext.writeText( "<div id=\""+"Gridtcccil0_level1itemContainer"+"Div\" "+sStyleString+">"+"</div>") ;
      httpContext.ajax_rsp_assign_grid("_"+"Gridtcccil0_level1item", Gridtcccil0_level1itemContainer, subGridtcccil0_level1item_Internalname);
      if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridtcccil0_level1itemContainerData", Gridtcccil0_level1itemContainer.ToJavascriptSource());
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridtcccil0_level1itemContainerData"+"V", Gridtcccil0_level1itemContainer.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Gridtcccil0_level1itemContainerData"+"V"+"\" value='"+Gridtcccil0_level1itemContainer.GridValuesHidden()+"'/>") ;
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
      e111972 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z1013DibCli = httpContext.cgiGet( "Z1013DibCli") ;
            Z252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z252CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z1014DibInt = (int)(localUtil.ctol( httpContext.cgiGet( "Z1014DibInt"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z1807DibLinCil = (short)(localUtil.ctol( httpContext.cgiGet( "Z1807DibLinCil"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z10793DibCilUlt = (int)(localUtil.ctol( httpContext.cgiGet( "Z10793DibCilUlt"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_73 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_73"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV32Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            A1013DibCli = httpContext.cgiGet( edtDibCli_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1013DibCli", A1013DibCli);
            A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A1014DibInt = (int)(localUtil.ctol( httpContext.cgiGet( edtDibInt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1014DibInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1014DibInt), 8, 0));
            A1807DibLinCil = (short)(localUtil.ctol( httpContext.cgiGet( edtDibLinCil_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1807DibLinCil", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1807DibLinCil), 4, 0));
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDibCilUlt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDibCilUlt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DIBCILULT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtDibCilUlt_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10793DibCilUlt = 0 ;
               n10793DibCilUlt = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10793DibCilUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10793DibCilUlt), 8, 0));
            }
            else
            {
               A10793DibCilUlt = (int)(localUtil.ctol( httpContext.cgiGet( edtDibCilUlt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n10793DibCilUlt = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10793DibCilUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10793DibCilUlt), 8, 0));
            }
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
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
               A1013DibCli = httpContext.GetPar( "DibCli") ;
               httpContext.ajax_rsp_assign_attri("", false, "A1013DibCli", A1013DibCli);
               A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
               A1014DibInt = (int)(GXutil.lval( httpContext.GetPar( "DibInt"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A1014DibInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1014DibInt), 8, 0));
               A1807DibLinCil = (short)(GXutil.lval( httpContext.GetPar( "DibLinCil"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A1807DibLinCil", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1807DibLinCil), 4, 0));
               getEqualNoModal( ) ;
               Gx_mode = "DSP" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               disable_std_buttons_dsp( ) ;
               standaloneModal( ) ;
            }
            else
            {
               getEqualNoModal( ) ;
               standaloneModal( ) ;
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
                        e111972 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
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
            initAll197549( ) ;
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
      disableAttributes197549( ) ;
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

   public void confirm_1971435( )
   {
      nGXsfl_73_idx = 0 ;
      while ( nGXsfl_73_idx < nRC_GXsfl_73 )
      {
         readRow1971435( ) ;
         if ( ( nRcdExists_1435 != 0 ) || ( nIsMod_1435 != 0 ) )
         {
            getKey1971435( ) ;
            if ( ( nRcdExists_1435 == 0 ) && ( nRcdDeleted_1435 == 0 ) )
            {
               if ( RcdFound1435 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1971435( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1971435( ) ;
                     closeExtendedTableCursors1971435( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "DIBCILLIN_" + sGXsfl_73_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtDibCilLin_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1435 != 0 )
               {
                  if ( nRcdDeleted_1435 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1971435( ) ;
                     load1971435( ) ;
                     beforeValidate1971435( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1971435( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1435 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1971435( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1971435( ) ;
                           closeExtendedTableCursors1971435( ) ;
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
                  if ( nRcdDeleted_1435 == 0 )
                  {
                     GXCCtl = "DIBCILLIN_" + sGXsfl_73_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtDibCilLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtDibCilLin_Internalname, GXutil.ltrim( localUtil.ntoc( A10794DibCilLin, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtEstCilCod_Internalname, GXutil.ltrim( localUtil.ntoc( A10790EstCilCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtEstCilDsc_Internalname, GXutil.rtrim( A10791EstCilDsc)) ;
         httpContext.changePostValue( edtDibCilFch_Internalname, localUtil.format(A10795DibCilFch, "99/99/99")) ;
         httpContext.changePostValue( edtDibCilMt_Internalname, GXutil.ltrim( localUtil.ntoc( A10796DibCilMt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDibCilUs_Internalname, GXutil.rtrim( A10797DibCilUs)) ;
         httpContext.changePostValue( edtDibCilTm_Internalname, GXutil.rtrim( A10798DibCilTm)) ;
         httpContext.changePostValue( edtDibCilHh_Internalname, localUtil.ttoc( A10799DibCilHh, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( edtDibCilOb_Internalname, A10800DibCilOb) ;
         httpContext.changePostValue( "ZT_"+"Z10794DibCilLin_"+sGXsfl_73_idx, GXutil.ltrim( localUtil.ntoc( Z10794DibCilLin, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10795DibCilFch_"+sGXsfl_73_idx, localUtil.dtoc( Z10795DibCilFch, 0, "/")) ;
         httpContext.changePostValue( "ZT_"+"Z10796DibCilMt_"+sGXsfl_73_idx, GXutil.ltrim( localUtil.ntoc( Z10796DibCilMt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10797DibCilUs_"+sGXsfl_73_idx, GXutil.rtrim( Z10797DibCilUs)) ;
         httpContext.changePostValue( "ZT_"+"Z10798DibCilTm_"+sGXsfl_73_idx, GXutil.rtrim( Z10798DibCilTm)) ;
         httpContext.changePostValue( "ZT_"+"Z10799DibCilHh_"+sGXsfl_73_idx, localUtil.ttoc( Z10799DibCilHh, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z10800DibCilOb_"+sGXsfl_73_idx, Z10800DibCilOb) ;
         httpContext.changePostValue( "ZT_"+"Z10790EstCilCod_"+sGXsfl_73_idx, GXutil.ltrim( localUtil.ntoc( Z10790EstCilCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1435_"+sGXsfl_73_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1435, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1435_"+sGXsfl_73_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1435, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1435_"+sGXsfl_73_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1435, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1435 != 0 )
         {
            httpContext.changePostValue( "DIBCILLIN_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDibCilLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ESTCILCOD_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEstCilCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ESTCILDSC_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEstCilDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DIBCILFCH_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDibCilFch_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DIBCILMT_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDibCilMt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DIBCILUS_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDibCilUs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DIBCILTM_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDibCilTm_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DIBCILHH_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDibCilHh_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DIBCILOB_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDibCilOb_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1970( )
   {
   }

   public void e111972( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      tcccil0_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV32Pgmname, (byte)(99), GXv_char2) ;
      tcccil0_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      tcccil0_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      tcccil0_impl.this.A396EmprCod = GXv_char2[0] ;
      tcccil0_impl.this.AV11EmprNom = GXv_char3[0] ;
      tcccil0_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
   }

   public void zm197549( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z10793DibCilUlt = T01976_A10793DibCilUlt[0] ;
         }
         else
         {
            Z10793DibCilUlt = A10793DibCilUlt ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z1807DibLinCil = A1807DibLinCil ;
         Z10793DibCilUlt = A10793DibCilUlt ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z1013DibCli = A1013DibCli ;
         Z1014DibInt = A1014DibInt ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
      AV32Pgmname = "TCCCIL0" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32Pgmname", AV32Pgmname);
      /* Using cursor T01977 */
      pr_default.execute(5, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01977_A407EmprNom[0] ;
      n407EmprNom = T01977_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(5);
      /* Using cursor T01978 */
      pr_default.execute(6, new Object[] {A396EmprCod, A1013DibCli, Integer.valueOf(A252CliCod), Integer.valueOf(A1014DibInt)});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CDIBUJ", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DIBINT");
         AnyError = (short)(1) ;
      }
      pr_default.close(6);
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

   public void load197549( )
   {
      /* Using cursor T01979 */
      pr_default.execute(7, new Object[] {A396EmprCod, A1013DibCli, Integer.valueOf(A252CliCod), Integer.valueOf(A1014DibInt), Short.valueOf(A1807DibLinCil)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound549 = (short)(1) ;
         A407EmprNom = T01979_A407EmprNom[0] ;
         n407EmprNom = T01979_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A10793DibCilUlt = T01979_A10793DibCilUlt[0] ;
         n10793DibCilUlt = T01979_n10793DibCilUlt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10793DibCilUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10793DibCilUlt), 8, 0));
         zm197549( -1) ;
      }
      pr_default.close(7);
      onLoadActions197549( ) ;
   }

   public void onLoadActions197549( )
   {
   }

   public void checkExtendedTable197549( )
   {
      nIsDirty_549 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors197549( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey197549( )
   {
      /* Using cursor T019710 */
      pr_default.execute(8, new Object[] {A396EmprCod, A1013DibCli, Integer.valueOf(A252CliCod), Integer.valueOf(A1014DibInt), Short.valueOf(A1807DibLinCil)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound549 = (short)(1) ;
      }
      else
      {
         RcdFound549 = (short)(0) ;
      }
      pr_default.close(8);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01976 */
      pr_default.execute(4, new Object[] {A396EmprCod, A1013DibCli, Integer.valueOf(A252CliCod), Integer.valueOf(A1014DibInt), Short.valueOf(A1807DibLinCil)});
      if ( (pr_default.getStatus(4) != 101) && ( T01976_A1807DibLinCil[0] == A1807DibLinCil ) && ( GXutil.strcmp(T01976_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01976_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01976_A1013DibCli[0], A1013DibCli) == 0 ) && ( T01976_A1014DibInt[0] == A1014DibInt ) )
      {
         zm197549( 1) ;
         RcdFound549 = (short)(1) ;
         A10793DibCilUlt = T01976_A10793DibCilUlt[0] ;
         n10793DibCilUlt = T01976_n10793DibCilUlt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10793DibCilUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10793DibCilUlt), 8, 0));
         Z396EmprCod = A396EmprCod ;
         Z1013DibCli = A1013DibCli ;
         Z252CliCod = A252CliCod ;
         Z1014DibInt = A1014DibInt ;
         Z1807DibLinCil = A1807DibLinCil ;
         sMode549 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load197549( ) ;
         if ( AnyError == 1 )
         {
            RcdFound549 = (short)(0) ;
            initializeNonKey197549( ) ;
         }
         Gx_mode = sMode549 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound549 = (short)(0) ;
         initializeNonKey197549( ) ;
         sMode549 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode549 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(4);
   }

   public void getEqualNoModal( )
   {
      getKey197549( ) ;
      if ( RcdFound549 == 0 )
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
      RcdFound549 = (short)(0) ;
      /* Using cursor T019711 */
      pr_default.execute(9, new Object[] {A396EmprCod, A1013DibCli, Integer.valueOf(A252CliCod), Integer.valueOf(A1014DibInt), Short.valueOf(A1807DibLinCil)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( GXutil.strcmp(T019711_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T019711_A1013DibCli[0], A1013DibCli) == 0 ) && ( T019711_A252CliCod[0] == A252CliCod ) && ( T019711_A1014DibInt[0] == A1014DibInt ) && ( T019711_A1807DibLinCil[0] == A1807DibLinCil ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( GXutil.strcmp(T019711_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T019711_A1013DibCli[0], A1013DibCli) == 0 ) && ( T019711_A252CliCod[0] == A252CliCod ) && ( T019711_A1014DibInt[0] == A1014DibInt ) && ( T019711_A1807DibLinCil[0] == A1807DibLinCil ) )
         {
            RcdFound549 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void move_previous( )
   {
      RcdFound549 = (short)(0) ;
      /* Using cursor T019712 */
      pr_default.execute(10, new Object[] {A396EmprCod, A1013DibCli, Integer.valueOf(A252CliCod), Integer.valueOf(A1014DibInt), Short.valueOf(A1807DibLinCil)});
      if ( (pr_default.getStatus(10) != 101) )
      {
         while ( (pr_default.getStatus(10) != 101) && ( GXutil.strcmp(T019712_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T019712_A1013DibCli[0], A1013DibCli) == 0 ) && ( T019712_A252CliCod[0] == A252CliCod ) && ( T019712_A1014DibInt[0] == A1014DibInt ) && ( T019712_A1807DibLinCil[0] == A1807DibLinCil ) )
         {
            pr_default.readNext(10);
         }
         if ( (pr_default.getStatus(10) != 101) && ( GXutil.strcmp(T019712_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T019712_A1013DibCli[0], A1013DibCli) == 0 ) && ( T019712_A252CliCod[0] == A252CliCod ) && ( T019712_A1014DibInt[0] == A1014DibInt ) && ( T019712_A1807DibLinCil[0] == A1807DibLinCil ) )
         {
            RcdFound549 = (short)(1) ;
         }
      }
      pr_default.close(10);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey197549( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtDibCilUlt_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert197549( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound549 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A1013DibCli, Z1013DibCli) != 0 ) || ( A252CliCod != Z252CliCod ) || ( A1014DibInt != Z1014DibInt ) || ( A1807DibLinCil != Z1807DibLinCil ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtDibCilUlt_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update197549( ) ;
               GX_FocusControl = edtDibCilUlt_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A1013DibCli, Z1013DibCli) != 0 ) || ( A252CliCod != Z252CliCod ) || ( A1014DibInt != Z1014DibInt ) || ( A1807DibLinCil != Z1807DibLinCil ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtDibCilUlt_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert197549( ) ;
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
                  GX_FocusControl = edtDibCilUlt_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert197549( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A1013DibCli, Z1013DibCli) != 0 ) || ( A252CliCod != Z252CliCod ) || ( A1014DibInt != Z1014DibInt ) || ( A1807DibLinCil != Z1807DibLinCil ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtDibCilUlt_Internalname ;
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
      if ( RcdFound549 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtDibCilUlt_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart197549( ) ;
      if ( RcdFound549 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtDibCilUlt_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd197549( ) ;
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
      if ( RcdFound549 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtDibCilUlt_Internalname ;
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
      if ( RcdFound549 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtDibCilUlt_Internalname ;
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
      scanStart197549( ) ;
      if ( RcdFound549 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound549 != 0 )
         {
            scanNext197549( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtDibCilUlt_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd197549( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency197549( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01975 */
         pr_default.execute(3, new Object[] {A396EmprCod, A1013DibCli, Integer.valueOf(A252CliCod), Integer.valueOf(A1014DibInt), Short.valueOf(A1807DibLinCil)});
         if ( (pr_default.getStatus(3) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLDIBUC"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(3) == 101) || ( Z10793DibCilUlt != T01975_A10793DibCilUlt[0] ) )
         {
            if ( Z10793DibCilUlt != T01975_A10793DibCilUlt[0] )
            {
               GXutil.writeLogln("tcccil0:[seudo value changed for attri]"+"DibCilUlt");
               GXutil.writeLogRaw("Old: ",Z10793DibCilUlt);
               GXutil.writeLogRaw("Current: ",T01975_A10793DibCilUlt[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPLDIBUC"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert197549( )
   {
      beforeValidate197549( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable197549( ) ;
      }
      if ( AnyError == 0 )
      {
         zm197549( 0) ;
         checkOptimisticConcurrency197549( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm197549( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert197549( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T019713 */
                  pr_default.execute(11, new Object[] {Short.valueOf(A1807DibLinCil), Boolean.valueOf(n10793DibCilUlt), Integer.valueOf(A10793DibCilUlt), A396EmprCod, Integer.valueOf(A252CliCod), A1013DibCli, Integer.valueOf(A1014DibInt)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLDIBUC");
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
                        processLevel197549( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1970( ) ;
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
            load197549( ) ;
         }
         endLevel197549( ) ;
      }
      closeExtendedTableCursors197549( ) ;
   }

   public void update197549( )
   {
      beforeValidate197549( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable197549( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency197549( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm197549( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate197549( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T019714 */
                  pr_default.execute(12, new Object[] {Boolean.valueOf(n10793DibCilUlt), Integer.valueOf(A10793DibCilUlt), A396EmprCod, A1013DibCli, Integer.valueOf(A252CliCod), Integer.valueOf(A1014DibInt), Short.valueOf(A1807DibLinCil)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLDIBUC");
                  if ( (pr_default.getStatus(12) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLDIBUC"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate197549( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel197549( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1970( ) ;
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
         endLevel197549( ) ;
      }
      closeExtendedTableCursors197549( ) ;
   }

   public void deferredUpdate197549( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate197549( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency197549( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls197549( ) ;
         afterConfirm197549( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete197549( ) ;
            if ( AnyError == 0 )
            {
               scanStart1971435( ) ;
               while ( RcdFound1435 != 0 )
               {
                  getByPrimaryKey1971435( ) ;
                  delete1971435( ) ;
                  scanNext1971435( ) ;
               }
               scanEnd1971435( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T019715 */
                  pr_default.execute(13, new Object[] {A396EmprCod, A1013DibCli, Integer.valueOf(A252CliCod), Integer.valueOf(A1014DibInt), Short.valueOf(A1807DibLinCil)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLDIBUC");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound549 == 0 )
                        {
                           initAll197549( ) ;
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
                        resetCaption1970( ) ;
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
      sMode549 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel197549( ) ;
      Gx_mode = sMode549 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls197549( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void processNestedLevel1971435( )
   {
      nGXsfl_73_idx = 0 ;
      while ( nGXsfl_73_idx < nRC_GXsfl_73 )
      {
         readRow1971435( ) ;
         if ( ( nRcdExists_1435 != 0 ) || ( nIsMod_1435 != 0 ) )
         {
            standaloneNotModal1971435( ) ;
            getKey1971435( ) ;
            if ( ( nRcdExists_1435 == 0 ) && ( nRcdDeleted_1435 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1971435( ) ;
            }
            else
            {
               if ( RcdFound1435 != 0 )
               {
                  if ( ( nRcdDeleted_1435 != 0 ) && ( nRcdExists_1435 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1971435( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1435 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1971435( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1435 == 0 )
                  {
                     GXCCtl = "DIBCILLIN_" + sGXsfl_73_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtDibCilLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtDibCilLin_Internalname, GXutil.ltrim( localUtil.ntoc( A10794DibCilLin, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtEstCilCod_Internalname, GXutil.ltrim( localUtil.ntoc( A10790EstCilCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtEstCilDsc_Internalname, GXutil.rtrim( A10791EstCilDsc)) ;
         httpContext.changePostValue( edtDibCilFch_Internalname, localUtil.format(A10795DibCilFch, "99/99/99")) ;
         httpContext.changePostValue( edtDibCilMt_Internalname, GXutil.ltrim( localUtil.ntoc( A10796DibCilMt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDibCilUs_Internalname, GXutil.rtrim( A10797DibCilUs)) ;
         httpContext.changePostValue( edtDibCilTm_Internalname, GXutil.rtrim( A10798DibCilTm)) ;
         httpContext.changePostValue( edtDibCilHh_Internalname, localUtil.ttoc( A10799DibCilHh, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( edtDibCilOb_Internalname, A10800DibCilOb) ;
         httpContext.changePostValue( "ZT_"+"Z10794DibCilLin_"+sGXsfl_73_idx, GXutil.ltrim( localUtil.ntoc( Z10794DibCilLin, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10795DibCilFch_"+sGXsfl_73_idx, localUtil.dtoc( Z10795DibCilFch, 0, "/")) ;
         httpContext.changePostValue( "ZT_"+"Z10796DibCilMt_"+sGXsfl_73_idx, GXutil.ltrim( localUtil.ntoc( Z10796DibCilMt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10797DibCilUs_"+sGXsfl_73_idx, GXutil.rtrim( Z10797DibCilUs)) ;
         httpContext.changePostValue( "ZT_"+"Z10798DibCilTm_"+sGXsfl_73_idx, GXutil.rtrim( Z10798DibCilTm)) ;
         httpContext.changePostValue( "ZT_"+"Z10799DibCilHh_"+sGXsfl_73_idx, localUtil.ttoc( Z10799DibCilHh, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z10800DibCilOb_"+sGXsfl_73_idx, Z10800DibCilOb) ;
         httpContext.changePostValue( "ZT_"+"Z10790EstCilCod_"+sGXsfl_73_idx, GXutil.ltrim( localUtil.ntoc( Z10790EstCilCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1435_"+sGXsfl_73_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1435, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1435_"+sGXsfl_73_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1435, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1435_"+sGXsfl_73_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1435, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1435 != 0 )
         {
            httpContext.changePostValue( "DIBCILLIN_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDibCilLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ESTCILCOD_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEstCilCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ESTCILDSC_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEstCilDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DIBCILFCH_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDibCilFch_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DIBCILMT_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDibCilMt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DIBCILUS_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDibCilUs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DIBCILTM_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDibCilTm_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DIBCILHH_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDibCilHh_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DIBCILOB_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDibCilOb_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1971435( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1435 = (short)(0) ;
      nIsMod_1435 = (short)(0) ;
      nRcdDeleted_1435 = (short)(0) ;
   }

   public void processLevel197549( )
   {
      /* Save parent mode. */
      sMode549 = Gx_mode ;
      processNestedLevel1971435( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode549 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel197549( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(3);
      }
      if ( AnyError == 0 )
      {
         beforeComplete197549( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tcccil0");
         if ( AnyError == 0 )
         {
            confirmValues1970( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tcccil0");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart197549( )
   {
      /* Scan By routine */
      /* Using cursor T019716 */
      pr_default.execute(14, new Object[] {A396EmprCod, A1013DibCli, Integer.valueOf(A252CliCod), Integer.valueOf(A1014DibInt), Short.valueOf(A1807DibLinCil)});
      RcdFound549 = (short)(0) ;
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound549 = (short)(1) ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext197549( )
   {
      /* Scan next routine */
      pr_default.readNext(14);
      RcdFound549 = (short)(0) ;
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound549 = (short)(1) ;
      }
   }

   public void scanEnd197549( )
   {
      pr_default.close(14);
   }

   public void afterConfirm197549( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert197549( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate197549( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete197549( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete197549( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate197549( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes197549( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtDibCli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDibCli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDibCli_Enabled), 5, 0), true);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtDibInt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDibInt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDibInt_Enabled), 5, 0), true);
      edtDibLinCil_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDibLinCil_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDibLinCil_Enabled), 5, 0), true);
      edtDibCilUlt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDibCilUlt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDibCilUlt_Enabled), 5, 0), true);
   }

   public void zm1971435( int GX_JID )
   {
      if ( ( GX_JID == 4 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z10795DibCilFch = T01973_A10795DibCilFch[0] ;
            Z10796DibCilMt = T01973_A10796DibCilMt[0] ;
            Z10797DibCilUs = T01973_A10797DibCilUs[0] ;
            Z10798DibCilTm = T01973_A10798DibCilTm[0] ;
            Z10799DibCilHh = T01973_A10799DibCilHh[0] ;
            Z10800DibCilOb = T01973_A10800DibCilOb[0] ;
            Z10790EstCilCod = T01973_A10790EstCilCod[0] ;
         }
         else
         {
            Z10795DibCilFch = A10795DibCilFch ;
            Z10796DibCilMt = A10796DibCilMt ;
            Z10797DibCilUs = A10797DibCilUs ;
            Z10798DibCilTm = A10798DibCilTm ;
            Z10799DibCilHh = A10799DibCilHh ;
            Z10800DibCilOb = A10800DibCilOb ;
            Z10790EstCilCod = A10790EstCilCod ;
         }
      }
      if ( GX_JID == -4 )
      {
         Z1013DibCli = A1013DibCli ;
         Z252CliCod = A252CliCod ;
         Z1014DibInt = A1014DibInt ;
         Z1807DibLinCil = A1807DibLinCil ;
         Z10794DibCilLin = A10794DibCilLin ;
         Z10795DibCilFch = A10795DibCilFch ;
         Z10796DibCilMt = A10796DibCilMt ;
         Z10797DibCilUs = A10797DibCilUs ;
         Z10798DibCilTm = A10798DibCilTm ;
         Z10799DibCilHh = A10799DibCilHh ;
         Z10800DibCilOb = A10800DibCilOb ;
         Z396EmprCod = A396EmprCod ;
         Z10790EstCilCod = A10790EstCilCod ;
         Z10791EstCilDsc = A10791EstCilDsc ;
      }
   }

   public void standaloneNotModal1971435( )
   {
   }

   public void standaloneModal1971435( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtDibCilLin_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtDibCilLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDibCilLin_Enabled), 5, 0), !bGXsfl_73_Refreshing);
      }
      else
      {
         edtDibCilLin_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtDibCilLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDibCilLin_Enabled), 5, 0), !bGXsfl_73_Refreshing);
      }
   }

   public void load1971435( )
   {
      /* Using cursor T019717 */
      pr_default.execute(15, new Object[] {A396EmprCod, A1013DibCli, Integer.valueOf(A252CliCod), Integer.valueOf(A1014DibInt), Short.valueOf(A1807DibLinCil), Integer.valueOf(A10794DibCilLin)});
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound1435 = (short)(1) ;
         A10791EstCilDsc = T019717_A10791EstCilDsc[0] ;
         n10791EstCilDsc = T019717_n10791EstCilDsc[0] ;
         A10795DibCilFch = T019717_A10795DibCilFch[0] ;
         n10795DibCilFch = T019717_n10795DibCilFch[0] ;
         A10796DibCilMt = T019717_A10796DibCilMt[0] ;
         n10796DibCilMt = T019717_n10796DibCilMt[0] ;
         A10797DibCilUs = T019717_A10797DibCilUs[0] ;
         n10797DibCilUs = T019717_n10797DibCilUs[0] ;
         A10798DibCilTm = T019717_A10798DibCilTm[0] ;
         n10798DibCilTm = T019717_n10798DibCilTm[0] ;
         A10799DibCilHh = T019717_A10799DibCilHh[0] ;
         n10799DibCilHh = T019717_n10799DibCilHh[0] ;
         A10800DibCilOb = T019717_A10800DibCilOb[0] ;
         n10800DibCilOb = T019717_n10800DibCilOb[0] ;
         A10790EstCilCod = T019717_A10790EstCilCod[0] ;
         zm1971435( -4) ;
      }
      pr_default.close(15);
      onLoadActions1971435( ) ;
   }

   public void onLoadActions1971435( )
   {
   }

   public void checkExtendedTable1971435( )
   {
      nIsDirty_1435 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1971435( ) ;
      /* Using cursor T01974 */
      pr_default.execute(2, new Object[] {A396EmprCod, Byte.valueOf(A10790EstCilCod)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "ESTCILCOD_" + sGXsfl_73_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ESTADOS CILINDROS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtEstCilCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A10791EstCilDsc = T01974_A10791EstCilDsc[0] ;
      n10791EstCilDsc = T01974_n10791EstCilDsc[0] ;
      pr_default.close(2);
   }

   public void closeExtendedTableCursors1971435( )
   {
      pr_default.close(2);
   }

   public void enableDisable1971435( )
   {
   }

   public void gxload_5( String A396EmprCod ,
                         byte A10790EstCilCod )
   {
      /* Using cursor T019718 */
      pr_default.execute(16, new Object[] {A396EmprCod, Byte.valueOf(A10790EstCilCod)});
      if ( (pr_default.getStatus(16) == 101) )
      {
         GXCCtl = "ESTCILCOD_" + sGXsfl_73_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ESTADOS CILINDROS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtEstCilCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A10791EstCilDsc = T019718_A10791EstCilDsc[0] ;
      n10791EstCilDsc = T019718_n10791EstCilDsc[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A10791EstCilDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(16) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(16);
   }

   public void getKey1971435( )
   {
      /* Using cursor T019719 */
      pr_default.execute(17, new Object[] {A396EmprCod, A1013DibCli, Integer.valueOf(A252CliCod), Integer.valueOf(A1014DibInt), Short.valueOf(A1807DibLinCil), Integer.valueOf(A10794DibCilLin)});
      if ( (pr_default.getStatus(17) != 101) )
      {
         RcdFound1435 = (short)(1) ;
      }
      else
      {
         RcdFound1435 = (short)(0) ;
      }
      pr_default.close(17);
   }

   public void getByPrimaryKey1971435( )
   {
      /* Using cursor T01973 */
      pr_default.execute(1, new Object[] {A396EmprCod, A1013DibCli, Integer.valueOf(A252CliCod), Integer.valueOf(A1014DibInt), Short.valueOf(A1807DibLinCil), Integer.valueOf(A10794DibCilLin)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T01973_A1013DibCli[0], A1013DibCli) == 0 ) && ( T01973_A252CliCod[0] == A252CliCod ) && ( T01973_A1014DibInt[0] == A1014DibInt ) && ( T01973_A1807DibLinCil[0] == A1807DibLinCil ) && ( GXutil.strcmp(T01973_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1971435( 4) ;
         RcdFound1435 = (short)(1) ;
         initializeNonKey1971435( ) ;
         A10794DibCilLin = T01973_A10794DibCilLin[0] ;
         A10795DibCilFch = T01973_A10795DibCilFch[0] ;
         n10795DibCilFch = T01973_n10795DibCilFch[0] ;
         A10796DibCilMt = T01973_A10796DibCilMt[0] ;
         n10796DibCilMt = T01973_n10796DibCilMt[0] ;
         A10797DibCilUs = T01973_A10797DibCilUs[0] ;
         n10797DibCilUs = T01973_n10797DibCilUs[0] ;
         A10798DibCilTm = T01973_A10798DibCilTm[0] ;
         n10798DibCilTm = T01973_n10798DibCilTm[0] ;
         A10799DibCilHh = T01973_A10799DibCilHh[0] ;
         n10799DibCilHh = T01973_n10799DibCilHh[0] ;
         A10800DibCilOb = T01973_A10800DibCilOb[0] ;
         n10800DibCilOb = T01973_n10800DibCilOb[0] ;
         A10790EstCilCod = T01973_A10790EstCilCod[0] ;
         Z396EmprCod = A396EmprCod ;
         Z1013DibCli = A1013DibCli ;
         Z252CliCod = A252CliCod ;
         Z1014DibInt = A1014DibInt ;
         Z1807DibLinCil = A1807DibLinCil ;
         Z10794DibCilLin = A10794DibCilLin ;
         sMode1435 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1971435( ) ;
         load1971435( ) ;
         Gx_mode = sMode1435 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1435 = (short)(0) ;
         initializeNonKey1971435( ) ;
         sMode1435 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1971435( ) ;
         Gx_mode = sMode1435 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1971435( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1971435( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01972 */
         pr_default.execute(0, new Object[] {A396EmprCod, A1013DibCli, Integer.valueOf(A252CliCod), Integer.valueOf(A1014DibInt), Short.valueOf(A1807DibLinCil), Integer.valueOf(A10794DibCilLin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCCCIL0"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || !( GXutil.dateCompare(GXutil.resetTime(Z10795DibCilFch), GXutil.resetTime(T01972_A10795DibCilFch[0])) ) || ( DecimalUtil.compareTo(Z10796DibCilMt, T01972_A10796DibCilMt[0]) != 0 ) || ( GXutil.strcmp(Z10797DibCilUs, T01972_A10797DibCilUs[0]) != 0 ) || ( GXutil.strcmp(Z10798DibCilTm, T01972_A10798DibCilTm[0]) != 0 ) || !( GXutil.dateCompare(Z10799DibCilHh, T01972_A10799DibCilHh[0]) ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z10800DibCilOb, T01972_A10800DibCilOb[0]) != 0 ) || ( Z10790EstCilCod != T01972_A10790EstCilCod[0] ) )
         {
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z10795DibCilFch), GXutil.resetTime(T01972_A10795DibCilFch[0])) ) )
            {
               GXutil.writeLogln("tcccil0:[seudo value changed for attri]"+"DibCilFch");
               GXutil.writeLogRaw("Old: ",Z10795DibCilFch);
               GXutil.writeLogRaw("Current: ",T01972_A10795DibCilFch[0]);
            }
            if ( DecimalUtil.compareTo(Z10796DibCilMt, T01972_A10796DibCilMt[0]) != 0 )
            {
               GXutil.writeLogln("tcccil0:[seudo value changed for attri]"+"DibCilMt");
               GXutil.writeLogRaw("Old: ",Z10796DibCilMt);
               GXutil.writeLogRaw("Current: ",T01972_A10796DibCilMt[0]);
            }
            if ( GXutil.strcmp(Z10797DibCilUs, T01972_A10797DibCilUs[0]) != 0 )
            {
               GXutil.writeLogln("tcccil0:[seudo value changed for attri]"+"DibCilUs");
               GXutil.writeLogRaw("Old: ",Z10797DibCilUs);
               GXutil.writeLogRaw("Current: ",T01972_A10797DibCilUs[0]);
            }
            if ( GXutil.strcmp(Z10798DibCilTm, T01972_A10798DibCilTm[0]) != 0 )
            {
               GXutil.writeLogln("tcccil0:[seudo value changed for attri]"+"DibCilTm");
               GXutil.writeLogRaw("Old: ",Z10798DibCilTm);
               GXutil.writeLogRaw("Current: ",T01972_A10798DibCilTm[0]);
            }
            if ( !( GXutil.dateCompare(Z10799DibCilHh, T01972_A10799DibCilHh[0]) ) )
            {
               GXutil.writeLogln("tcccil0:[seudo value changed for attri]"+"DibCilHh");
               GXutil.writeLogRaw("Old: ",Z10799DibCilHh);
               GXutil.writeLogRaw("Current: ",T01972_A10799DibCilHh[0]);
            }
            if ( GXutil.strcmp(Z10800DibCilOb, T01972_A10800DibCilOb[0]) != 0 )
            {
               GXutil.writeLogln("tcccil0:[seudo value changed for attri]"+"DibCilOb");
               GXutil.writeLogRaw("Old: ",Z10800DibCilOb);
               GXutil.writeLogRaw("Current: ",T01972_A10800DibCilOb[0]);
            }
            if ( Z10790EstCilCod != T01972_A10790EstCilCod[0] )
            {
               GXutil.writeLogln("tcccil0:[seudo value changed for attri]"+"EstCilCod");
               GXutil.writeLogRaw("Old: ",Z10790EstCilCod);
               GXutil.writeLogRaw("Current: ",T01972_A10790EstCilCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCCCIL0"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1971435( )
   {
      beforeValidate1971435( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1971435( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1971435( 0) ;
         checkOptimisticConcurrency1971435( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1971435( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1971435( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T019720 */
                  pr_default.execute(18, new Object[] {A1013DibCli, Integer.valueOf(A252CliCod), Integer.valueOf(A1014DibInt), Short.valueOf(A1807DibLinCil), Integer.valueOf(A10794DibCilLin), Boolean.valueOf(n10795DibCilFch), A10795DibCilFch, Boolean.valueOf(n10796DibCilMt), A10796DibCilMt, Boolean.valueOf(n10797DibCilUs), A10797DibCilUs, Boolean.valueOf(n10798DibCilTm), A10798DibCilTm, Boolean.valueOf(n10799DibCilHh), A10799DibCilHh, Boolean.valueOf(n10800DibCilOb), A10800DibCilOb, A396EmprCod, Byte.valueOf(A10790EstCilCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCCIL0");
                  if ( (pr_default.getStatus(18) == 1) )
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
            load1971435( ) ;
         }
         endLevel1971435( ) ;
      }
      closeExtendedTableCursors1971435( ) ;
   }

   public void update1971435( )
   {
      beforeValidate1971435( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1971435( ) ;
      }
      if ( ( nIsMod_1435 != 0 ) || ( nIsDirty_1435 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1971435( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1971435( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1971435( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T019721 */
                     pr_default.execute(19, new Object[] {Boolean.valueOf(n10795DibCilFch), A10795DibCilFch, Boolean.valueOf(n10796DibCilMt), A10796DibCilMt, Boolean.valueOf(n10797DibCilUs), A10797DibCilUs, Boolean.valueOf(n10798DibCilTm), A10798DibCilTm, Boolean.valueOf(n10799DibCilHh), A10799DibCilHh, Boolean.valueOf(n10800DibCilOb), A10800DibCilOb, Byte.valueOf(A10790EstCilCod), A396EmprCod, A1013DibCli, Integer.valueOf(A252CliCod), Integer.valueOf(A1014DibInt), Short.valueOf(A1807DibLinCil), Integer.valueOf(A10794DibCilLin)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCCIL0");
                     if ( (pr_default.getStatus(19) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCCCIL0"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1971435( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1971435( ) ;
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
            endLevel1971435( ) ;
         }
      }
      closeExtendedTableCursors1971435( ) ;
   }

   public void deferredUpdate1971435( )
   {
   }

   public void delete1971435( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1971435( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1971435( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1971435( ) ;
         afterConfirm1971435( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1971435( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T019722 */
               pr_default.execute(20, new Object[] {A396EmprCod, A1013DibCli, Integer.valueOf(A252CliCod), Integer.valueOf(A1014DibInt), Short.valueOf(A1807DibLinCil), Integer.valueOf(A10794DibCilLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCCIL0");
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
      sMode1435 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1971435( ) ;
      Gx_mode = sMode1435 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1971435( )
   {
      standaloneModal1971435( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T019723 */
         pr_default.execute(21, new Object[] {A396EmprCod, Byte.valueOf(A10790EstCilCod)});
         A10791EstCilDsc = T019723_A10791EstCilDsc[0] ;
         n10791EstCilDsc = T019723_n10791EstCilDsc[0] ;
         pr_default.close(21);
      }
   }

   public void endLevel1971435( )
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

   public void scanStart1971435( )
   {
      /* Scan By routine */
      /* Using cursor T019724 */
      pr_default.execute(22, new Object[] {A396EmprCod, A1013DibCli, Integer.valueOf(A252CliCod), Integer.valueOf(A1014DibInt), Short.valueOf(A1807DibLinCil)});
      RcdFound1435 = (short)(0) ;
      if ( (pr_default.getStatus(22) != 101) )
      {
         RcdFound1435 = (short)(1) ;
         A10794DibCilLin = T019724_A10794DibCilLin[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1971435( )
   {
      /* Scan next routine */
      pr_default.readNext(22);
      RcdFound1435 = (short)(0) ;
      if ( (pr_default.getStatus(22) != 101) )
      {
         RcdFound1435 = (short)(1) ;
         A10794DibCilLin = T019724_A10794DibCilLin[0] ;
      }
   }

   public void scanEnd1971435( )
   {
      pr_default.close(22);
   }

   public void afterConfirm1971435( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1971435( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1971435( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1971435( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1971435( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1971435( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1971435( )
   {
      edtDibCilLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDibCilLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDibCilLin_Enabled), 5, 0), !bGXsfl_73_Refreshing);
      edtEstCilCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstCilCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstCilCod_Enabled), 5, 0), !bGXsfl_73_Refreshing);
      edtEstCilDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstCilDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstCilDsc_Enabled), 5, 0), !bGXsfl_73_Refreshing);
      edtDibCilFch_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDibCilFch_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDibCilFch_Enabled), 5, 0), !bGXsfl_73_Refreshing);
      edtDibCilMt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDibCilMt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDibCilMt_Enabled), 5, 0), !bGXsfl_73_Refreshing);
      edtDibCilUs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDibCilUs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDibCilUs_Enabled), 5, 0), !bGXsfl_73_Refreshing);
      edtDibCilTm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDibCilTm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDibCilTm_Enabled), 5, 0), !bGXsfl_73_Refreshing);
      edtDibCilHh_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDibCilHh_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDibCilHh_Enabled), 5, 0), !bGXsfl_73_Refreshing);
      edtDibCilOb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDibCilOb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDibCilOb_Enabled), 5, 0), !bGXsfl_73_Refreshing);
   }

   public void send_integrity_lvl_hashes1971435( )
   {
   }

   public void send_integrity_lvl_hashes197549( )
   {
   }

   public void subsflControlProps_731435( )
   {
      edtDibCilLin_Internalname = "DIBCILLIN_"+sGXsfl_73_idx ;
      edtEstCilCod_Internalname = "ESTCILCOD_"+sGXsfl_73_idx ;
      edtEstCilDsc_Internalname = "ESTCILDSC_"+sGXsfl_73_idx ;
      edtDibCilFch_Internalname = "DIBCILFCH_"+sGXsfl_73_idx ;
      edtDibCilMt_Internalname = "DIBCILMT_"+sGXsfl_73_idx ;
      edtDibCilUs_Internalname = "DIBCILUS_"+sGXsfl_73_idx ;
      edtDibCilTm_Internalname = "DIBCILTM_"+sGXsfl_73_idx ;
      edtDibCilHh_Internalname = "DIBCILHH_"+sGXsfl_73_idx ;
      edtDibCilOb_Internalname = "DIBCILOB_"+sGXsfl_73_idx ;
   }

   public void subsflControlProps_fel_731435( )
   {
      edtDibCilLin_Internalname = "DIBCILLIN_"+sGXsfl_73_fel_idx ;
      edtEstCilCod_Internalname = "ESTCILCOD_"+sGXsfl_73_fel_idx ;
      edtEstCilDsc_Internalname = "ESTCILDSC_"+sGXsfl_73_fel_idx ;
      edtDibCilFch_Internalname = "DIBCILFCH_"+sGXsfl_73_fel_idx ;
      edtDibCilMt_Internalname = "DIBCILMT_"+sGXsfl_73_fel_idx ;
      edtDibCilUs_Internalname = "DIBCILUS_"+sGXsfl_73_fel_idx ;
      edtDibCilTm_Internalname = "DIBCILTM_"+sGXsfl_73_fel_idx ;
      edtDibCilHh_Internalname = "DIBCILHH_"+sGXsfl_73_fel_idx ;
      edtDibCilOb_Internalname = "DIBCILOB_"+sGXsfl_73_fel_idx ;
   }

   public void addRow1971435( )
   {
      nGXsfl_73_idx = (int)(nGXsfl_73_idx+1) ;
      sGXsfl_73_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_73_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_731435( ) ;
      sendRow1971435( ) ;
   }

   public void sendRow1971435( )
   {
      Gridtcccil0_level1itemRow = GXWebRow.GetNew(context) ;
      if ( subGridtcccil0_level1item_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGridtcccil0_level1item_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGridtcccil0_level1item_Class, "") != 0 )
         {
            subGridtcccil0_level1item_Linesclass = subGridtcccil0_level1item_Class+"Odd" ;
         }
      }
      else if ( subGridtcccil0_level1item_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGridtcccil0_level1item_Backstyle = (byte)(0) ;
         subGridtcccil0_level1item_Backcolor = subGridtcccil0_level1item_Allbackcolor ;
         if ( GXutil.strcmp(subGridtcccil0_level1item_Class, "") != 0 )
         {
            subGridtcccil0_level1item_Linesclass = subGridtcccil0_level1item_Class+"Uniform" ;
         }
      }
      else if ( subGridtcccil0_level1item_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGridtcccil0_level1item_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGridtcccil0_level1item_Class, "") != 0 )
         {
            subGridtcccil0_level1item_Linesclass = subGridtcccil0_level1item_Class+"Odd" ;
         }
         subGridtcccil0_level1item_Backcolor = (int)(0x0) ;
      }
      else if ( subGridtcccil0_level1item_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGridtcccil0_level1item_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_73_idx) % (2))) == 0 )
         {
            subGridtcccil0_level1item_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridtcccil0_level1item_Class, "") != 0 )
            {
               subGridtcccil0_level1item_Linesclass = subGridtcccil0_level1item_Class+"Even" ;
            }
         }
         else
         {
            subGridtcccil0_level1item_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridtcccil0_level1item_Class, "") != 0 )
            {
               subGridtcccil0_level1item_Linesclass = subGridtcccil0_level1item_Class+"Odd" ;
            }
         }
      }
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1435_" + sGXsfl_73_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 74,'',false,'" + sGXsfl_73_idx + "',73)\"" ;
      ROClassString = "Attribute" ;
      Gridtcccil0_level1itemRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDibCilLin_Internalname,GXutil.ltrim( localUtil.ntoc( A10794DibCilLin, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A10794DibCilLin), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,74);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDibCilLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDibCilLin_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(73),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1435_" + sGXsfl_73_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 75,'',false,'" + sGXsfl_73_idx + "',73)\"" ;
      ROClassString = "Attribute" ;
      Gridtcccil0_level1itemRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEstCilCod_Internalname,GXutil.ltrim( localUtil.ntoc( A10790EstCilCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtEstCilCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10790EstCilCod), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A10790EstCilCod), "Z9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,75);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEstCilCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtEstCilCod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(73),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridtcccil0_level1itemRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEstCilDsc_Internalname,GXutil.rtrim( A10791EstCilDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEstCilDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtEstCilDsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(73),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1435_" + sGXsfl_73_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 77,'',false,'" + sGXsfl_73_idx + "',73)\"" ;
      ROClassString = "Attribute" ;
      Gridtcccil0_level1itemRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDibCilFch_Internalname,localUtil.format(A10795DibCilFch, "99/99/99"),localUtil.format( A10795DibCilFch, "99/99/99"),TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,77);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDibCilFch_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDibCilFch_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(73),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1435_" + sGXsfl_73_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 78,'',false,'" + sGXsfl_73_idx + "',73)\"" ;
      ROClassString = "Attribute" ;
      Gridtcccil0_level1itemRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDibCilMt_Internalname,GXutil.ltrim( localUtil.ntoc( A10796DibCilMt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtDibCilMt_Enabled!=0) ? localUtil.format( A10796DibCilMt, "ZZZZZ9.99") : localUtil.format( A10796DibCilMt, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,78);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDibCilMt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDibCilMt_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(73),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1435_" + sGXsfl_73_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 79,'',false,'" + sGXsfl_73_idx + "',73)\"" ;
      ROClassString = "Attribute" ;
      Gridtcccil0_level1itemRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDibCilUs_Internalname,GXutil.rtrim( A10797DibCilUs),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,79);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDibCilUs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDibCilUs_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(73),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1435_" + sGXsfl_73_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 80,'',false,'" + sGXsfl_73_idx + "',73)\"" ;
      ROClassString = "Attribute" ;
      Gridtcccil0_level1itemRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDibCilTm_Internalname,GXutil.rtrim( A10798DibCilTm),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,80);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDibCilTm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDibCilTm_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(73),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1435_" + sGXsfl_73_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 81,'',false,'" + sGXsfl_73_idx + "',73)\"" ;
      ROClassString = "Attribute" ;
      Gridtcccil0_level1itemRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDibCilHh_Internalname,localUtil.ttoc( A10799DibCilHh, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A10799DibCilHh, "99/99/99 99:99"),TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,81);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDibCilHh_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDibCilHh_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(73),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1435_" + sGXsfl_73_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 82,'',false,'" + sGXsfl_73_idx + "',73)\"" ;
      ROClassString = "Attribute" ;
      Gridtcccil0_level1itemRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDibCilOb_Internalname,A10800DibCilOb,"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,82);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDibCilOb_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDibCilOb_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(200),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(73),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Gridtcccil0_level1itemRow);
      send_integrity_lvl_hashes1971435( ) ;
      GXCCtl = "Z10794DibCilLin_" + sGXsfl_73_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z10794DibCilLin, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z10795DibCilFch_" + sGXsfl_73_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.dtoc( Z10795DibCilFch, 0, "/"));
      GXCCtl = "Z10796DibCilMt_" + sGXsfl_73_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z10796DibCilMt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z10797DibCilUs_" + sGXsfl_73_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z10797DibCilUs));
      GXCCtl = "Z10798DibCilTm_" + sGXsfl_73_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z10798DibCilTm));
      GXCCtl = "Z10799DibCilHh_" + sGXsfl_73_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.ttoc( Z10799DibCilHh, 10, 8, 0, 0, "/", ":", " "));
      GXCCtl = "Z10800DibCilOb_" + sGXsfl_73_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, Z10800DibCilOb);
      GXCCtl = "Z10790EstCilCod_" + sGXsfl_73_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z10790EstCilCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1435_" + sGXsfl_73_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1435, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1435_" + sGXsfl_73_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1435, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1435_" + sGXsfl_73_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1435, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DIBCILLIN_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDibCilLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ESTCILCOD_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEstCilCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ESTCILDSC_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEstCilDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DIBCILFCH_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDibCilFch_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DIBCILMT_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDibCilMt_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DIBCILUS_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDibCilUs_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DIBCILTM_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDibCilTm_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DIBCILHH_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDibCilHh_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DIBCILOB_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDibCilOb_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Gridtcccil0_level1itemContainer.AddRow(Gridtcccil0_level1itemRow);
   }

   public void readRow1971435( )
   {
      nGXsfl_73_idx = (int)(nGXsfl_73_idx+1) ;
      sGXsfl_73_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_73_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_731435( ) ;
      edtDibCilLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DIBCILLIN_"+sGXsfl_73_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtEstCilCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ESTCILCOD_"+sGXsfl_73_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtEstCilDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ESTCILDSC_"+sGXsfl_73_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDibCilFch_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DIBCILFCH_"+sGXsfl_73_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDibCilMt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DIBCILMT_"+sGXsfl_73_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDibCilUs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DIBCILUS_"+sGXsfl_73_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDibCilTm_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DIBCILTM_"+sGXsfl_73_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDibCilHh_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DIBCILHH_"+sGXsfl_73_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDibCilOb_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DIBCILOB_"+sGXsfl_73_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDibCilLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDibCilLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
      {
         GXCCtl = "DIBCILLIN_" + sGXsfl_73_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtDibCilLin_Internalname ;
         wbErr = true ;
         A10794DibCilLin = 0 ;
      }
      else
      {
         A10794DibCilLin = (int)(localUtil.ctol( httpContext.cgiGet( edtDibCilLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtEstCilCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtEstCilCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
      {
         GXCCtl = "ESTCILCOD_" + sGXsfl_73_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtEstCilCod_Internalname ;
         wbErr = true ;
         A10790EstCilCod = (byte)(0) ;
      }
      else
      {
         A10790EstCilCod = (byte)(localUtil.ctol( httpContext.cgiGet( edtEstCilCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A10791EstCilDsc = httpContext.cgiGet( edtEstCilDsc_Internalname) ;
      n10791EstCilDsc = false ;
      if ( localUtil.vcdate( httpContext.cgiGet( edtDibCilFch_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
      {
         GXCCtl = "DIBCILFCH_" + sGXsfl_73_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtDibCilFch_Internalname ;
         wbErr = true ;
         A10795DibCilFch = GXutil.nullDate() ;
         n10795DibCilFch = false ;
      }
      else
      {
         A10795DibCilFch = localUtil.ctod( httpContext.cgiGet( edtDibCilFch_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         n10795DibCilFch = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtDibCilMt_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtDibCilMt_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "DIBCILMT_" + sGXsfl_73_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtDibCilMt_Internalname ;
         wbErr = true ;
         A10796DibCilMt = DecimalUtil.ZERO ;
         n10796DibCilMt = false ;
      }
      else
      {
         A10796DibCilMt = localUtil.ctond( httpContext.cgiGet( edtDibCilMt_Internalname)) ;
         n10796DibCilMt = false ;
      }
      A10797DibCilUs = httpContext.cgiGet( edtDibCilUs_Internalname) ;
      n10797DibCilUs = false ;
      A10798DibCilTm = httpContext.cgiGet( edtDibCilTm_Internalname) ;
      n10798DibCilTm = false ;
      if ( localUtil.vcdtime( httpContext.cgiGet( edtDibCilHh_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
      {
         GXCCtl = "DIBCILHH_" + sGXsfl_73_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtDibCilHh_Internalname ;
         wbErr = true ;
         A10799DibCilHh = GXutil.resetTime( GXutil.nullDate() );
         n10799DibCilHh = false ;
      }
      else
      {
         A10799DibCilHh = localUtil.ctot( httpContext.cgiGet( edtDibCilHh_Internalname)) ;
         n10799DibCilHh = false ;
      }
      A10800DibCilOb = httpContext.cgiGet( edtDibCilOb_Internalname) ;
      n10800DibCilOb = false ;
      GXCCtl = "Z10794DibCilLin_" + sGXsfl_73_idx ;
      Z10794DibCilLin = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z10795DibCilFch_" + sGXsfl_73_idx ;
      Z10795DibCilFch = localUtil.ctod( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "Z10796DibCilMt_" + sGXsfl_73_idx ;
      Z10796DibCilMt = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z10797DibCilUs_" + sGXsfl_73_idx ;
      Z10797DibCilUs = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z10798DibCilTm_" + sGXsfl_73_idx ;
      Z10798DibCilTm = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z10799DibCilHh_" + sGXsfl_73_idx ;
      Z10799DibCilHh = localUtil.ctot( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "Z10800DibCilOb_" + sGXsfl_73_idx ;
      Z10800DibCilOb = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z10790EstCilCod_" + sGXsfl_73_idx ;
      Z10790EstCilCod = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdDeleted_1435_" + sGXsfl_73_idx ;
      nRcdDeleted_1435 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1435_" + sGXsfl_73_idx ;
      nRcdExists_1435 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1435_" + sGXsfl_73_idx ;
      nIsMod_1435 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtDibCilLin_Enabled = edtDibCilLin_Enabled ;
   }

   public void confirmValues1970( )
   {
      nGXsfl_73_idx = 0 ;
      sGXsfl_73_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_73_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_731435( ) ;
      while ( nGXsfl_73_idx < nRC_GXsfl_73 )
      {
         nGXsfl_73_idx = (int)(nGXsfl_73_idx+1) ;
         sGXsfl_73_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_73_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_731435( ) ;
         httpContext.changePostValue( "Z10794DibCilLin_"+sGXsfl_73_idx, httpContext.cgiGet( "ZT_"+"Z10794DibCilLin_"+sGXsfl_73_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10794DibCilLin_"+sGXsfl_73_idx) ;
         httpContext.changePostValue( "Z10795DibCilFch_"+sGXsfl_73_idx, httpContext.cgiGet( "ZT_"+"Z10795DibCilFch_"+sGXsfl_73_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10795DibCilFch_"+sGXsfl_73_idx) ;
         httpContext.changePostValue( "Z10796DibCilMt_"+sGXsfl_73_idx, httpContext.cgiGet( "ZT_"+"Z10796DibCilMt_"+sGXsfl_73_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10796DibCilMt_"+sGXsfl_73_idx) ;
         httpContext.changePostValue( "Z10797DibCilUs_"+sGXsfl_73_idx, httpContext.cgiGet( "ZT_"+"Z10797DibCilUs_"+sGXsfl_73_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10797DibCilUs_"+sGXsfl_73_idx) ;
         httpContext.changePostValue( "Z10798DibCilTm_"+sGXsfl_73_idx, httpContext.cgiGet( "ZT_"+"Z10798DibCilTm_"+sGXsfl_73_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10798DibCilTm_"+sGXsfl_73_idx) ;
         httpContext.changePostValue( "Z10799DibCilHh_"+sGXsfl_73_idx, httpContext.cgiGet( "ZT_"+"Z10799DibCilHh_"+sGXsfl_73_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10799DibCilHh_"+sGXsfl_73_idx) ;
         httpContext.changePostValue( "Z10800DibCilOb_"+sGXsfl_73_idx, httpContext.cgiGet( "ZT_"+"Z10800DibCilOb_"+sGXsfl_73_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10800DibCilOb_"+sGXsfl_73_idx) ;
         httpContext.changePostValue( "Z10790EstCilCod_"+sGXsfl_73_idx, httpContext.cgiGet( "ZT_"+"Z10790EstCilCod_"+sGXsfl_73_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10790EstCilCod_"+sGXsfl_73_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.tcccil0", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A1013DibCli)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.ltrimstr(A1014DibInt,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A1807DibLinCil,4,0))}, new String[] {"EmprCod","DibCli","CliCod","DibInt","DibLinCil"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z1013DibCli", GXutil.rtrim( Z1013DibCli));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1014DibInt", GXutil.ltrim( localUtil.ntoc( Z1014DibInt, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1807DibLinCil", GXutil.ltrim( localUtil.ntoc( Z1807DibLinCil, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10793DibCilUlt", GXutil.ltrim( localUtil.ntoc( Z10793DibCilUlt, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_73", GXutil.ltrim( localUtil.ntoc( nGXsfl_73_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV32Pgmname));
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
      return formatLink("app.tcccil0", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A1013DibCli)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.ltrimstr(A1014DibInt,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A1807DibLinCil,4,0))}, new String[] {"EmprCod","DibCli","CliCod","DibInt","DibLinCil"})  ;
   }

   public String getPgmname( )
   {
      return "TCCCIL0" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "ESTADOS CILINDROS", "") ;
   }

   public void initializeNonKey197549( )
   {
      A10793DibCilUlt = 0 ;
      n10793DibCilUlt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10793DibCilUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10793DibCilUlt), 8, 0));
      Z10793DibCilUlt = 0 ;
   }

   public void initAll197549( )
   {
      initializeNonKey197549( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1971435( )
   {
      A10790EstCilCod = (byte)(0) ;
      A10791EstCilDsc = "" ;
      n10791EstCilDsc = false ;
      A10795DibCilFch = GXutil.nullDate() ;
      n10795DibCilFch = false ;
      A10796DibCilMt = DecimalUtil.ZERO ;
      n10796DibCilMt = false ;
      A10797DibCilUs = "" ;
      n10797DibCilUs = false ;
      A10798DibCilTm = "" ;
      n10798DibCilTm = false ;
      A10799DibCilHh = GXutil.resetTime( GXutil.nullDate() );
      n10799DibCilHh = false ;
      A10800DibCilOb = "" ;
      n10800DibCilOb = false ;
      Z10795DibCilFch = GXutil.nullDate() ;
      Z10796DibCilMt = DecimalUtil.ZERO ;
      Z10797DibCilUs = "" ;
      Z10798DibCilTm = "" ;
      Z10799DibCilHh = GXutil.resetTime( GXutil.nullDate() );
      Z10800DibCilOb = "" ;
      Z10790EstCilCod = (byte)(0) ;
   }

   public void initAll1971435( )
   {
      A10794DibCilLin = 0 ;
      initializeNonKey1971435( ) ;
   }

   public void standaloneModalInsert1971435( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?2026824156415", true, true);
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
      httpContext.AddJavascriptSource("tcccil0.js", "?2026824156415", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1435( )
   {
      edtDibCilLin_Enabled = defedtDibCilLin_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtDibCilLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDibCilLin_Enabled), 5, 0), !bGXsfl_73_Refreshing);
   }

   public void startgridcontrol73( )
   {
      Gridtcccil0_level1itemContainer.AddObjectProperty("GridName", "Gridtcccil0_level1item");
      Gridtcccil0_level1itemContainer.AddObjectProperty("Header", subGridtcccil0_level1item_Header);
      Gridtcccil0_level1itemContainer.AddObjectProperty("Class", "Grid");
      Gridtcccil0_level1itemContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Gridtcccil0_level1itemContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Gridtcccil0_level1itemContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridtcccil0_level1item_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Gridtcccil0_level1itemContainer.AddObjectProperty("CmpContext", "");
      Gridtcccil0_level1itemContainer.AddObjectProperty("InMasterPage", "false");
      Gridtcccil0_level1itemColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridtcccil0_level1itemColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10794DibCilLin, (byte)(8), (byte)(0), ".", "")));
      Gridtcccil0_level1itemColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDibCilLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridtcccil0_level1itemContainer.AddColumnProperties(Gridtcccil0_level1itemColumn);
      Gridtcccil0_level1itemColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridtcccil0_level1itemColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10790EstCilCod, (byte)(2), (byte)(0), ".", "")));
      Gridtcccil0_level1itemColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtEstCilCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridtcccil0_level1itemContainer.AddColumnProperties(Gridtcccil0_level1itemColumn);
      Gridtcccil0_level1itemColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridtcccil0_level1itemColumn.AddObjectProperty("Value", GXutil.rtrim( A10791EstCilDsc));
      Gridtcccil0_level1itemColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtEstCilDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridtcccil0_level1itemContainer.AddColumnProperties(Gridtcccil0_level1itemColumn);
      Gridtcccil0_level1itemColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridtcccil0_level1itemColumn.AddObjectProperty("Value", localUtil.format(A10795DibCilFch, "99/99/99"));
      Gridtcccil0_level1itemColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDibCilFch_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridtcccil0_level1itemContainer.AddColumnProperties(Gridtcccil0_level1itemColumn);
      Gridtcccil0_level1itemColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridtcccil0_level1itemColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10796DibCilMt, (byte)(9), (byte)(2), ".", "")));
      Gridtcccil0_level1itemColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDibCilMt_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridtcccil0_level1itemContainer.AddColumnProperties(Gridtcccil0_level1itemColumn);
      Gridtcccil0_level1itemColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridtcccil0_level1itemColumn.AddObjectProperty("Value", GXutil.rtrim( A10797DibCilUs));
      Gridtcccil0_level1itemColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDibCilUs_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridtcccil0_level1itemContainer.AddColumnProperties(Gridtcccil0_level1itemColumn);
      Gridtcccil0_level1itemColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridtcccil0_level1itemColumn.AddObjectProperty("Value", GXutil.rtrim( A10798DibCilTm));
      Gridtcccil0_level1itemColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDibCilTm_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridtcccil0_level1itemContainer.AddColumnProperties(Gridtcccil0_level1itemColumn);
      Gridtcccil0_level1itemColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridtcccil0_level1itemColumn.AddObjectProperty("Value", localUtil.ttoc( A10799DibCilHh, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      Gridtcccil0_level1itemColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDibCilHh_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridtcccil0_level1itemContainer.AddColumnProperties(Gridtcccil0_level1itemColumn);
      Gridtcccil0_level1itemColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridtcccil0_level1itemColumn.AddObjectProperty("Value", A10800DibCilOb);
      Gridtcccil0_level1itemColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDibCilOb_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridtcccil0_level1itemContainer.AddColumnProperties(Gridtcccil0_level1itemColumn);
      Gridtcccil0_level1itemContainer.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGridtcccil0_level1item_Selectedindex, (byte)(4), (byte)(0), ".", "")));
      Gridtcccil0_level1itemContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGridtcccil0_level1item_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Gridtcccil0_level1itemContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGridtcccil0_level1item_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Gridtcccil0_level1itemContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGridtcccil0_level1item_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Gridtcccil0_level1itemContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGridtcccil0_level1item_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Gridtcccil0_level1itemContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGridtcccil0_level1item_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Gridtcccil0_level1itemContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGridtcccil0_level1item_Collapsed, (byte)(1), (byte)(0), ".", "")));
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
      edtDibCli_Internalname = "DIBCLI" ;
      edtCliCod_Internalname = "CLICOD" ;
      edtDibInt_Internalname = "DIBINT" ;
      edtDibLinCil_Internalname = "DIBLINCIL" ;
      edtDibCilUlt_Internalname = "DIBCILULT" ;
      lblTitlelevel1_Internalname = "TITLELEVEL1" ;
      edtDibCilLin_Internalname = "DIBCILLIN" ;
      edtEstCilCod_Internalname = "ESTCILCOD" ;
      edtEstCilDsc_Internalname = "ESTCILDSC" ;
      edtDibCilFch_Internalname = "DIBCILFCH" ;
      edtDibCilMt_Internalname = "DIBCILMT" ;
      edtDibCilUs_Internalname = "DIBCILUS" ;
      edtDibCilTm_Internalname = "DIBCILTM" ;
      edtDibCilHh_Internalname = "DIBCILHH" ;
      edtDibCilOb_Internalname = "DIBCILOB" ;
      divLevel1table_Internalname = "LEVEL1TABLE" ;
      divFormcontainer_Internalname = "FORMCONTAINER" ;
      bttBtn_enter_Internalname = "BTN_ENTER" ;
      bttBtn_cancel_Internalname = "BTN_CANCEL" ;
      bttBtn_delete_Internalname = "BTN_DELETE" ;
      divMaintable_Internalname = "MAINTABLE" ;
      Form.setInternalname( "FORM" );
      subGridtcccil0_level1item_Internalname = "GRIDTCCCIL0_LEVEL1ITEM" ;
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
      subGridtcccil0_level1item_Allowcollapsing = (byte)(0) ;
      subGridtcccil0_level1item_Allowselection = (byte)(0) ;
      subGridtcccil0_level1item_Header = "" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "ESTADOS CILINDROS", "") );
      edtDibCilOb_Jsonclick = "" ;
      edtDibCilHh_Jsonclick = "" ;
      edtDibCilTm_Jsonclick = "" ;
      edtDibCilUs_Jsonclick = "" ;
      edtDibCilMt_Jsonclick = "" ;
      edtDibCilFch_Jsonclick = "" ;
      edtEstCilDsc_Jsonclick = "" ;
      edtEstCilCod_Jsonclick = "" ;
      edtDibCilLin_Jsonclick = "" ;
      subGridtcccil0_level1item_Class = "Grid" ;
      subGridtcccil0_level1item_Backcolorstyle = (byte)(0) ;
      edtDibCilOb_Enabled = 1 ;
      edtDibCilHh_Enabled = 1 ;
      edtDibCilTm_Enabled = 1 ;
      edtDibCilUs_Enabled = 1 ;
      edtDibCilMt_Enabled = 1 ;
      edtDibCilFch_Enabled = 1 ;
      edtEstCilDsc_Enabled = 0 ;
      edtEstCilCod_Enabled = 1 ;
      edtDibCilLin_Enabled = 1 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtDibCilUlt_Jsonclick = "" ;
      edtDibCilUlt_Enabled = 1 ;
      edtDibLinCil_Jsonclick = "" ;
      edtDibLinCil_Enabled = 0 ;
      edtDibInt_Jsonclick = "" ;
      edtDibInt_Enabled = 0 ;
      edtCliCod_Jsonclick = "" ;
      edtCliCod_Enabled = 0 ;
      edtDibCli_Jsonclick = "" ;
      edtDibCli_Enabled = 0 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Enabled = 0 ;
      edtEmprCod_Jsonclick = "" ;
      edtEmprCod_Enabled = 0 ;
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

   public void gxnrgridtcccil0_level1item_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_731435( ) ;
      while ( nGXsfl_73_idx <= nRC_GXsfl_73 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1971435( ) ;
         standaloneModal1971435( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1971435( ) ;
         nGXsfl_73_idx = (int)(nGXsfl_73_idx+1) ;
         sGXsfl_73_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_73_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_731435( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Gridtcccil0_level1itemContainer)) ;
      /* End function gxnrGridtcccil0_level1item_newrow */
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
      /* Using cursor T019725 */
      pr_default.execute(23, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(23) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T019725_A407EmprNom[0] ;
      n407EmprNom = T019725_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(23);
      /* Using cursor T019726 */
      pr_default.execute(24, new Object[] {A396EmprCod, A1013DibCli, Integer.valueOf(A252CliCod), Integer.valueOf(A1014DibInt)});
      if ( (pr_default.getStatus(24) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CDIBUJ", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DIBINT");
         AnyError = (short)(1) ;
      }
      pr_default.close(24);
      GX_FocusControl = edtDibCilUlt_Internalname ;
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

   public void valid_Diblincil( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A10793DibCilUlt", GXutil.ltrim( localUtil.ntoc( A10793DibCilUlt, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1013DibCli", GXutil.rtrim( Z1013DibCli));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1014DibInt", GXutil.ltrim( localUtil.ntoc( Z1014DibInt, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1807DibLinCil", GXutil.ltrim( localUtil.ntoc( Z1807DibLinCil, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10793DibCilUlt", GXutil.ltrim( localUtil.ntoc( Z10793DibCilUlt, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Estcilcod( )
   {
      n10791EstCilDsc = false ;
      /* Using cursor T019723 */
      pr_default.execute(21, new Object[] {A396EmprCod, Byte.valueOf(A10790EstCilCod)});
      if ( (pr_default.getStatus(21) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ESTADOS CILINDROS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ESTCILCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEstCilCod_Internalname ;
      }
      A10791EstCilDsc = T019723_A10791EstCilDsc[0] ;
      n10791EstCilDsc = T019723_n10791EstCilDsc[0] ;
      pr_default.close(21);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A10791EstCilDsc", GXutil.rtrim( A10791EstCilDsc));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A1013DibCli',fld:'DIBCLI',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A1014DibInt',fld:'DIBINT',pic:'ZZZZZZZ9'},{av:'A1807DibLinCil',fld:'DIBLINCIL',pic:'ZZZ9'}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_DIBCLI","{handler:'valid_Dibcli',iparms:[]");
      setEventMetadata("VALID_DIBCLI",",oparms:[]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[]");
      setEventMetadata("VALID_CLICOD",",oparms:[]}");
      setEventMetadata("VALID_DIBINT","{handler:'valid_Dibint',iparms:[]");
      setEventMetadata("VALID_DIBINT",",oparms:[]}");
      setEventMetadata("VALID_DIBLINCIL","{handler:'valid_Diblincil',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A1013DibCli',fld:'DIBCLI',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A1014DibInt',fld:'DIBINT',pic:'ZZZZZZZ9'},{av:'A1807DibLinCil',fld:'DIBLINCIL',pic:'ZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_DIBLINCIL",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A10793DibCilUlt',fld:'DIBCILULT',pic:'ZZZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z1013DibCli'},{av:'Z252CliCod'},{av:'Z1014DibInt'},{av:'Z1807DibLinCil'},{av:'Z407EmprNom'},{av:'Z10793DibCilUlt'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'}]}");
      setEventMetadata("VALID_DIBCILLIN","{handler:'valid_Dibcillin',iparms:[]");
      setEventMetadata("VALID_DIBCILLIN",",oparms:[]}");
      setEventMetadata("VALID_ESTCILCOD","{handler:'valid_Estcilcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A10790EstCilCod',fld:'ESTCILCOD',pic:'Z9'},{av:'A10791EstCilDsc',fld:'ESTCILDSC',pic:''}]");
      setEventMetadata("VALID_ESTCILCOD",",oparms:[{av:'A10791EstCilDsc',fld:'ESTCILDSC',pic:''}]}");
      setEventMetadata("NULL","{handler:'valid_Dibcilob',iparms:[]");
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
      pr_default.close(21);
      pr_default.close(23);
      pr_default.close(24);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOA396EmprCod = "" ;
      wcpOA1013DibCli = "" ;
      Z396EmprCod = "" ;
      Z1013DibCli = "" ;
      Z10795DibCilFch = GXutil.nullDate() ;
      Z10796DibCilMt = DecimalUtil.ZERO ;
      Z10797DibCilUs = "" ;
      Z10798DibCilTm = "" ;
      Z10799DibCilHh = GXutil.resetTime( GXutil.nullDate() );
      Z10800DibCilOb = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A1013DibCli = "" ;
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
      lblTitlelevel1_Jsonclick = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      Gridtcccil0_level1itemContainer = new com.genexus.webpanels.GXWebGrid(context);
      sMode1435 = "" ;
      sStyleString = "" ;
      AV32Pgmname = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      GXCCtl = "" ;
      A10791EstCilDsc = "" ;
      A10795DibCilFch = GXutil.nullDate() ;
      A10796DibCilMt = DecimalUtil.ZERO ;
      A10797DibCilUs = "" ;
      A10798DibCilTm = "" ;
      A10799DibCilHh = GXutil.resetTime( GXutil.nullDate() );
      A10800DibCilOb = "" ;
      AV7Lit0 = "" ;
      AV10Lit1 = "" ;
      AV9LitFe = "" ;
      GXt_char1 = "" ;
      AV12Station = "" ;
      GXv_char2 = new String[1] ;
      AV11EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV8UsurCod = "" ;
      GXv_char4 = new String[1] ;
      Z407EmprNom = "" ;
      T01977_A407EmprNom = new String[] {""} ;
      T01977_n407EmprNom = new boolean[] {false} ;
      T01978_A396EmprCod = new String[] {""} ;
      T01979_A1807DibLinCil = new short[1] ;
      T01979_A407EmprNom = new String[] {""} ;
      T01979_n407EmprNom = new boolean[] {false} ;
      T01979_A10793DibCilUlt = new int[1] ;
      T01979_n10793DibCilUlt = new boolean[] {false} ;
      T01979_A396EmprCod = new String[] {""} ;
      T01979_A252CliCod = new int[1] ;
      T01979_A1013DibCli = new String[] {""} ;
      T01979_A1014DibInt = new int[1] ;
      T019710_A396EmprCod = new String[] {""} ;
      T019710_A1013DibCli = new String[] {""} ;
      T019710_A252CliCod = new int[1] ;
      T019710_A1014DibInt = new int[1] ;
      T019710_A1807DibLinCil = new short[1] ;
      T01976_A1807DibLinCil = new short[1] ;
      T01976_A10793DibCilUlt = new int[1] ;
      T01976_n10793DibCilUlt = new boolean[] {false} ;
      T01976_A396EmprCod = new String[] {""} ;
      T01976_A252CliCod = new int[1] ;
      T01976_A1013DibCli = new String[] {""} ;
      T01976_A1014DibInt = new int[1] ;
      sMode549 = "" ;
      T019711_A396EmprCod = new String[] {""} ;
      T019711_A1013DibCli = new String[] {""} ;
      T019711_A252CliCod = new int[1] ;
      T019711_A1014DibInt = new int[1] ;
      T019711_A1807DibLinCil = new short[1] ;
      T019712_A396EmprCod = new String[] {""} ;
      T019712_A1013DibCli = new String[] {""} ;
      T019712_A252CliCod = new int[1] ;
      T019712_A1014DibInt = new int[1] ;
      T019712_A1807DibLinCil = new short[1] ;
      T01975_A1807DibLinCil = new short[1] ;
      T01975_A10793DibCilUlt = new int[1] ;
      T01975_n10793DibCilUlt = new boolean[] {false} ;
      T01975_A396EmprCod = new String[] {""} ;
      T01975_A252CliCod = new int[1] ;
      T01975_A1013DibCli = new String[] {""} ;
      T01975_A1014DibInt = new int[1] ;
      T019716_A396EmprCod = new String[] {""} ;
      T019716_A1013DibCli = new String[] {""} ;
      T019716_A252CliCod = new int[1] ;
      T019716_A1014DibInt = new int[1] ;
      T019716_A1807DibLinCil = new short[1] ;
      Z10791EstCilDsc = "" ;
      T019717_A1013DibCli = new String[] {""} ;
      T019717_A252CliCod = new int[1] ;
      T019717_A1014DibInt = new int[1] ;
      T019717_A1807DibLinCil = new short[1] ;
      T019717_A10794DibCilLin = new int[1] ;
      T019717_A10791EstCilDsc = new String[] {""} ;
      T019717_n10791EstCilDsc = new boolean[] {false} ;
      T019717_A10795DibCilFch = new java.util.Date[] {GXutil.nullDate()} ;
      T019717_n10795DibCilFch = new boolean[] {false} ;
      T019717_A10796DibCilMt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T019717_n10796DibCilMt = new boolean[] {false} ;
      T019717_A10797DibCilUs = new String[] {""} ;
      T019717_n10797DibCilUs = new boolean[] {false} ;
      T019717_A10798DibCilTm = new String[] {""} ;
      T019717_n10798DibCilTm = new boolean[] {false} ;
      T019717_A10799DibCilHh = new java.util.Date[] {GXutil.nullDate()} ;
      T019717_n10799DibCilHh = new boolean[] {false} ;
      T019717_A10800DibCilOb = new String[] {""} ;
      T019717_n10800DibCilOb = new boolean[] {false} ;
      T019717_A396EmprCod = new String[] {""} ;
      T019717_A10790EstCilCod = new byte[1] ;
      T01974_A10791EstCilDsc = new String[] {""} ;
      T01974_n10791EstCilDsc = new boolean[] {false} ;
      T019718_A10791EstCilDsc = new String[] {""} ;
      T019718_n10791EstCilDsc = new boolean[] {false} ;
      T019719_A396EmprCod = new String[] {""} ;
      T019719_A1013DibCli = new String[] {""} ;
      T019719_A252CliCod = new int[1] ;
      T019719_A1014DibInt = new int[1] ;
      T019719_A1807DibLinCil = new short[1] ;
      T019719_A10794DibCilLin = new int[1] ;
      T01973_A1013DibCli = new String[] {""} ;
      T01973_A252CliCod = new int[1] ;
      T01973_A1014DibInt = new int[1] ;
      T01973_A1807DibLinCil = new short[1] ;
      T01973_A10794DibCilLin = new int[1] ;
      T01973_A10795DibCilFch = new java.util.Date[] {GXutil.nullDate()} ;
      T01973_n10795DibCilFch = new boolean[] {false} ;
      T01973_A10796DibCilMt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01973_n10796DibCilMt = new boolean[] {false} ;
      T01973_A10797DibCilUs = new String[] {""} ;
      T01973_n10797DibCilUs = new boolean[] {false} ;
      T01973_A10798DibCilTm = new String[] {""} ;
      T01973_n10798DibCilTm = new boolean[] {false} ;
      T01973_A10799DibCilHh = new java.util.Date[] {GXutil.nullDate()} ;
      T01973_n10799DibCilHh = new boolean[] {false} ;
      T01973_A10800DibCilOb = new String[] {""} ;
      T01973_n10800DibCilOb = new boolean[] {false} ;
      T01973_A396EmprCod = new String[] {""} ;
      T01973_A10790EstCilCod = new byte[1] ;
      T01972_A1013DibCli = new String[] {""} ;
      T01972_A252CliCod = new int[1] ;
      T01972_A1014DibInt = new int[1] ;
      T01972_A1807DibLinCil = new short[1] ;
      T01972_A10794DibCilLin = new int[1] ;
      T01972_A10795DibCilFch = new java.util.Date[] {GXutil.nullDate()} ;
      T01972_n10795DibCilFch = new boolean[] {false} ;
      T01972_A10796DibCilMt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01972_n10796DibCilMt = new boolean[] {false} ;
      T01972_A10797DibCilUs = new String[] {""} ;
      T01972_n10797DibCilUs = new boolean[] {false} ;
      T01972_A10798DibCilTm = new String[] {""} ;
      T01972_n10798DibCilTm = new boolean[] {false} ;
      T01972_A10799DibCilHh = new java.util.Date[] {GXutil.nullDate()} ;
      T01972_n10799DibCilHh = new boolean[] {false} ;
      T01972_A10800DibCilOb = new String[] {""} ;
      T01972_n10800DibCilOb = new boolean[] {false} ;
      T01972_A396EmprCod = new String[] {""} ;
      T01972_A10790EstCilCod = new byte[1] ;
      T019723_A10791EstCilDsc = new String[] {""} ;
      T019723_n10791EstCilDsc = new boolean[] {false} ;
      T019724_A396EmprCod = new String[] {""} ;
      T019724_A1013DibCli = new String[] {""} ;
      T019724_A252CliCod = new int[1] ;
      T019724_A1014DibInt = new int[1] ;
      T019724_A1807DibLinCil = new short[1] ;
      T019724_A10794DibCilLin = new int[1] ;
      Gridtcccil0_level1itemRow = new com.genexus.webpanels.GXWebRow();
      subGridtcccil0_level1item_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Gridtcccil0_level1itemColumn = new com.genexus.webpanels.GXWebColumn();
      T019725_A407EmprNom = new String[] {""} ;
      T019725_n407EmprNom = new boolean[] {false} ;
      T019726_A396EmprCod = new String[] {""} ;
      ZZ396EmprCod = "" ;
      ZZ1013DibCli = "" ;
      ZZ407EmprNom = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tcccil0__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tcccil0__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tcccil0__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tcccil0__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tcccil0__default(),
         new Object[] {
             new Object[] {
            T01972_A1013DibCli, T01972_A252CliCod, T01972_A1014DibInt, T01972_A1807DibLinCil, T01972_A10794DibCilLin, T01972_A10795DibCilFch, T01972_n10795DibCilFch, T01972_A10796DibCilMt, T01972_n10796DibCilMt, T01972_A10797DibCilUs,
            T01972_n10797DibCilUs, T01972_A10798DibCilTm, T01972_n10798DibCilTm, T01972_A10799DibCilHh, T01972_n10799DibCilHh, T01972_A10800DibCilOb, T01972_n10800DibCilOb, T01972_A396EmprCod, T01972_A10790EstCilCod
            }
            , new Object[] {
            T01973_A1013DibCli, T01973_A252CliCod, T01973_A1014DibInt, T01973_A1807DibLinCil, T01973_A10794DibCilLin, T01973_A10795DibCilFch, T01973_n10795DibCilFch, T01973_A10796DibCilMt, T01973_n10796DibCilMt, T01973_A10797DibCilUs,
            T01973_n10797DibCilUs, T01973_A10798DibCilTm, T01973_n10798DibCilTm, T01973_A10799DibCilHh, T01973_n10799DibCilHh, T01973_A10800DibCilOb, T01973_n10800DibCilOb, T01973_A396EmprCod, T01973_A10790EstCilCod
            }
            , new Object[] {
            T01974_A10791EstCilDsc, T01974_n10791EstCilDsc
            }
            , new Object[] {
            T01975_A1807DibLinCil, T01975_A10793DibCilUlt, T01975_n10793DibCilUlt, T01975_A396EmprCod, T01975_A252CliCod, T01975_A1013DibCli, T01975_A1014DibInt
            }
            , new Object[] {
            T01976_A1807DibLinCil, T01976_A10793DibCilUlt, T01976_n10793DibCilUlt, T01976_A396EmprCod, T01976_A252CliCod, T01976_A1013DibCli, T01976_A1014DibInt
            }
            , new Object[] {
            T01977_A407EmprNom, T01977_n407EmprNom
            }
            , new Object[] {
            T01978_A396EmprCod
            }
            , new Object[] {
            T01979_A1807DibLinCil, T01979_A407EmprNom, T01979_n407EmprNom, T01979_A10793DibCilUlt, T01979_n10793DibCilUlt, T01979_A396EmprCod, T01979_A252CliCod, T01979_A1013DibCli, T01979_A1014DibInt
            }
            , new Object[] {
            T019710_A396EmprCod, T019710_A1013DibCli, T019710_A252CliCod, T019710_A1014DibInt, T019710_A1807DibLinCil
            }
            , new Object[] {
            T019711_A396EmprCod, T019711_A1013DibCli, T019711_A252CliCod, T019711_A1014DibInt, T019711_A1807DibLinCil
            }
            , new Object[] {
            T019712_A396EmprCod, T019712_A1013DibCli, T019712_A252CliCod, T019712_A1014DibInt, T019712_A1807DibLinCil
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T019716_A396EmprCod, T019716_A1013DibCli, T019716_A252CliCod, T019716_A1014DibInt, T019716_A1807DibLinCil
            }
            , new Object[] {
            T019717_A1013DibCli, T019717_A252CliCod, T019717_A1014DibInt, T019717_A1807DibLinCil, T019717_A10794DibCilLin, T019717_A10791EstCilDsc, T019717_n10791EstCilDsc, T019717_A10795DibCilFch, T019717_n10795DibCilFch, T019717_A10796DibCilMt,
            T019717_n10796DibCilMt, T019717_A10797DibCilUs, T019717_n10797DibCilUs, T019717_A10798DibCilTm, T019717_n10798DibCilTm, T019717_A10799DibCilHh, T019717_n10799DibCilHh, T019717_A10800DibCilOb, T019717_n10800DibCilOb, T019717_A396EmprCod,
            T019717_A10790EstCilCod
            }
            , new Object[] {
            T019718_A10791EstCilDsc, T019718_n10791EstCilDsc
            }
            , new Object[] {
            T019719_A396EmprCod, T019719_A1013DibCli, T019719_A252CliCod, T019719_A1014DibInt, T019719_A1807DibLinCil, T019719_A10794DibCilLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T019723_A10791EstCilDsc, T019723_n10791EstCilDsc
            }
            , new Object[] {
            T019724_A396EmprCod, T019724_A1013DibCli, T019724_A252CliCod, T019724_A1014DibInt, T019724_A1807DibLinCil, T019724_A10794DibCilLin
            }
            , new Object[] {
            T019725_A407EmprNom, T019725_n407EmprNom
            }
            , new Object[] {
            T019726_A396EmprCod
            }
         }
      );
      Z1807DibLinCil = (short)(0) ;
      A1807DibLinCil = (short)(0) ;
      Z1014DibInt = 0 ;
      A1014DibInt = 0 ;
      Z252CliCod = 0 ;
      A252CliCod = 0 ;
      Z1013DibCli = "" ;
      A1013DibCli = "" ;
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV32Pgmname = "TCCCIL0" ;
   }

   private byte Z10790EstCilCod ;
   private byte GxWebError ;
   private byte A10790EstCilCod ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte subGridtcccil0_level1item_Backcolorstyle ;
   private byte subGridtcccil0_level1item_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGridtcccil0_level1item_Allowselection ;
   private byte subGridtcccil0_level1item_Allowhovering ;
   private byte subGridtcccil0_level1item_Allowcollapsing ;
   private byte subGridtcccil0_level1item_Collapsed ;
   private short wcpOA1807DibLinCil ;
   private short Z1807DibLinCil ;
   private short nRcdDeleted_1435 ;
   private short nRcdExists_1435 ;
   private short nIsMod_1435 ;
   private short A1807DibLinCil ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount1435 ;
   private short RcdFound1435 ;
   private short nBlankRcdUsr1435 ;
   private short RcdFound549 ;
   private short nIsDirty_549 ;
   private short nIsDirty_1435 ;
   private short ZZ1807DibLinCil ;
   private int wcpOA252CliCod ;
   private int wcpOA1014DibInt ;
   private int Z252CliCod ;
   private int Z1014DibInt ;
   private int Z10793DibCilUlt ;
   private int nRC_GXsfl_73 ;
   private int nGXsfl_73_idx=1 ;
   private int Z10794DibCilLin ;
   private int A252CliCod ;
   private int A1014DibInt ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtDibCli_Enabled ;
   private int edtCliCod_Enabled ;
   private int edtDibInt_Enabled ;
   private int edtDibLinCil_Enabled ;
   private int A10793DibCilUlt ;
   private int edtDibCilUlt_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int edtDibCilLin_Enabled ;
   private int edtEstCilCod_Enabled ;
   private int edtEstCilDsc_Enabled ;
   private int edtDibCilFch_Enabled ;
   private int edtDibCilMt_Enabled ;
   private int edtDibCilUs_Enabled ;
   private int edtDibCilTm_Enabled ;
   private int edtDibCilHh_Enabled ;
   private int edtDibCilOb_Enabled ;
   private int fRowAdded ;
   private int A10794DibCilLin ;
   private int GX_JID ;
   private int subGridtcccil0_level1item_Backcolor ;
   private int subGridtcccil0_level1item_Allbackcolor ;
   private int defedtDibCilLin_Enabled ;
   private int idxLst ;
   private int subGridtcccil0_level1item_Selectedindex ;
   private int subGridtcccil0_level1item_Selectioncolor ;
   private int subGridtcccil0_level1item_Hoveringcolor ;
   private int ZZ252CliCod ;
   private int ZZ1014DibInt ;
   private int ZZ10793DibCilUlt ;
   private long GRIDTCCCIL0_LEVEL1ITEM_nFirstRecordOnPage ;
   private java.math.BigDecimal Z10796DibCilMt ;
   private java.math.BigDecimal A10796DibCilMt ;
   private String sPrefix ;
   private String wcpOA396EmprCod ;
   private String wcpOA1013DibCli ;
   private String Z396EmprCod ;
   private String Z1013DibCli ;
   private String Z10797DibCilUs ;
   private String Z10798DibCilTm ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A1013DibCli ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtDibCilUlt_Internalname ;
   private String sGXsfl_73_idx="0001" ;
   private String Gx_mode ;
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
   private String edtEmprCod_Internalname ;
   private String edtEmprCod_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String edtDibCli_Internalname ;
   private String edtDibCli_Jsonclick ;
   private String edtCliCod_Internalname ;
   private String edtCliCod_Jsonclick ;
   private String edtDibInt_Internalname ;
   private String edtDibInt_Jsonclick ;
   private String edtDibLinCil_Internalname ;
   private String edtDibLinCil_Jsonclick ;
   private String edtDibCilUlt_Jsonclick ;
   private String divLevel1table_Internalname ;
   private String lblTitlelevel1_Internalname ;
   private String lblTitlelevel1_Jsonclick ;
   private String bttBtn_enter_Internalname ;
   private String bttBtn_enter_Jsonclick ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String bttBtn_delete_Internalname ;
   private String bttBtn_delete_Jsonclick ;
   private String sMode1435 ;
   private String edtDibCilLin_Internalname ;
   private String edtEstCilCod_Internalname ;
   private String edtEstCilDsc_Internalname ;
   private String edtDibCilFch_Internalname ;
   private String edtDibCilMt_Internalname ;
   private String edtDibCilUs_Internalname ;
   private String edtDibCilTm_Internalname ;
   private String edtDibCilHh_Internalname ;
   private String edtDibCilOb_Internalname ;
   private String sStyleString ;
   private String subGridtcccil0_level1item_Internalname ;
   private String AV32Pgmname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String GXCCtl ;
   private String A10791EstCilDsc ;
   private String A10797DibCilUs ;
   private String A10798DibCilTm ;
   private String AV7Lit0 ;
   private String AV10Lit1 ;
   private String AV9LitFe ;
   private String GXt_char1 ;
   private String AV12Station ;
   private String GXv_char2[] ;
   private String AV11EmprNom ;
   private String GXv_char3[] ;
   private String AV8UsurCod ;
   private String GXv_char4[] ;
   private String Z407EmprNom ;
   private String sMode549 ;
   private String Z10791EstCilDsc ;
   private String sGXsfl_73_fel_idx="0001" ;
   private String subGridtcccil0_level1item_Class ;
   private String subGridtcccil0_level1item_Linesclass ;
   private String ROClassString ;
   private String edtDibCilLin_Jsonclick ;
   private String edtEstCilCod_Jsonclick ;
   private String edtEstCilDsc_Jsonclick ;
   private String edtDibCilFch_Jsonclick ;
   private String edtDibCilMt_Jsonclick ;
   private String edtDibCilUs_Jsonclick ;
   private String edtDibCilTm_Jsonclick ;
   private String edtDibCilHh_Jsonclick ;
   private String edtDibCilOb_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGridtcccil0_level1item_Header ;
   private String ZZ396EmprCod ;
   private String ZZ1013DibCli ;
   private String ZZ407EmprNom ;
   private java.util.Date Z10799DibCilHh ;
   private java.util.Date A10799DibCilHh ;
   private java.util.Date Z10795DibCilFch ;
   private java.util.Date A10795DibCilFch ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean bGXsfl_73_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean n10793DibCilUlt ;
   private boolean returnInSub ;
   private boolean n10791EstCilDsc ;
   private boolean n10795DibCilFch ;
   private boolean n10796DibCilMt ;
   private boolean n10797DibCilUs ;
   private boolean n10798DibCilTm ;
   private boolean n10799DibCilHh ;
   private boolean n10800DibCilOb ;
   private boolean Gx_longc ;
   private String Z10800DibCilOb ;
   private String A10800DibCilOb ;
   private com.genexus.webpanels.GXWebGrid Gridtcccil0_level1itemContainer ;
   private com.genexus.webpanels.GXWebRow Gridtcccil0_level1itemRow ;
   private com.genexus.webpanels.GXWebColumn Gridtcccil0_level1itemColumn ;
   private IDataStoreProvider pr_default ;
   private String[] T01977_A407EmprNom ;
   private boolean[] T01977_n407EmprNom ;
   private String[] T01978_A396EmprCod ;
   private short[] T01979_A1807DibLinCil ;
   private String[] T01979_A407EmprNom ;
   private boolean[] T01979_n407EmprNom ;
   private int[] T01979_A10793DibCilUlt ;
   private boolean[] T01979_n10793DibCilUlt ;
   private String[] T01979_A396EmprCod ;
   private int[] T01979_A252CliCod ;
   private String[] T01979_A1013DibCli ;
   private int[] T01979_A1014DibInt ;
   private String[] T019710_A396EmprCod ;
   private String[] T019710_A1013DibCli ;
   private int[] T019710_A252CliCod ;
   private int[] T019710_A1014DibInt ;
   private short[] T019710_A1807DibLinCil ;
   private short[] T01976_A1807DibLinCil ;
   private int[] T01976_A10793DibCilUlt ;
   private boolean[] T01976_n10793DibCilUlt ;
   private String[] T01976_A396EmprCod ;
   private int[] T01976_A252CliCod ;
   private String[] T01976_A1013DibCli ;
   private int[] T01976_A1014DibInt ;
   private String[] T019711_A396EmprCod ;
   private String[] T019711_A1013DibCli ;
   private int[] T019711_A252CliCod ;
   private int[] T019711_A1014DibInt ;
   private short[] T019711_A1807DibLinCil ;
   private String[] T019712_A396EmprCod ;
   private String[] T019712_A1013DibCli ;
   private int[] T019712_A252CliCod ;
   private int[] T019712_A1014DibInt ;
   private short[] T019712_A1807DibLinCil ;
   private short[] T01975_A1807DibLinCil ;
   private int[] T01975_A10793DibCilUlt ;
   private boolean[] T01975_n10793DibCilUlt ;
   private String[] T01975_A396EmprCod ;
   private int[] T01975_A252CliCod ;
   private String[] T01975_A1013DibCli ;
   private int[] T01975_A1014DibInt ;
   private String[] T019716_A396EmprCod ;
   private String[] T019716_A1013DibCli ;
   private int[] T019716_A252CliCod ;
   private int[] T019716_A1014DibInt ;
   private short[] T019716_A1807DibLinCil ;
   private String[] T019717_A1013DibCli ;
   private int[] T019717_A252CliCod ;
   private int[] T019717_A1014DibInt ;
   private short[] T019717_A1807DibLinCil ;
   private int[] T019717_A10794DibCilLin ;
   private String[] T019717_A10791EstCilDsc ;
   private boolean[] T019717_n10791EstCilDsc ;
   private java.util.Date[] T019717_A10795DibCilFch ;
   private boolean[] T019717_n10795DibCilFch ;
   private java.math.BigDecimal[] T019717_A10796DibCilMt ;
   private boolean[] T019717_n10796DibCilMt ;
   private String[] T019717_A10797DibCilUs ;
   private boolean[] T019717_n10797DibCilUs ;
   private String[] T019717_A10798DibCilTm ;
   private boolean[] T019717_n10798DibCilTm ;
   private java.util.Date[] T019717_A10799DibCilHh ;
   private boolean[] T019717_n10799DibCilHh ;
   private String[] T019717_A10800DibCilOb ;
   private boolean[] T019717_n10800DibCilOb ;
   private String[] T019717_A396EmprCod ;
   private byte[] T019717_A10790EstCilCod ;
   private String[] T01974_A10791EstCilDsc ;
   private boolean[] T01974_n10791EstCilDsc ;
   private String[] T019718_A10791EstCilDsc ;
   private boolean[] T019718_n10791EstCilDsc ;
   private String[] T019719_A396EmprCod ;
   private String[] T019719_A1013DibCli ;
   private int[] T019719_A252CliCod ;
   private int[] T019719_A1014DibInt ;
   private short[] T019719_A1807DibLinCil ;
   private int[] T019719_A10794DibCilLin ;
   private String[] T01973_A1013DibCli ;
   private int[] T01973_A252CliCod ;
   private int[] T01973_A1014DibInt ;
   private short[] T01973_A1807DibLinCil ;
   private int[] T01973_A10794DibCilLin ;
   private java.util.Date[] T01973_A10795DibCilFch ;
   private boolean[] T01973_n10795DibCilFch ;
   private java.math.BigDecimal[] T01973_A10796DibCilMt ;
   private boolean[] T01973_n10796DibCilMt ;
   private String[] T01973_A10797DibCilUs ;
   private boolean[] T01973_n10797DibCilUs ;
   private String[] T01973_A10798DibCilTm ;
   private boolean[] T01973_n10798DibCilTm ;
   private java.util.Date[] T01973_A10799DibCilHh ;
   private boolean[] T01973_n10799DibCilHh ;
   private String[] T01973_A10800DibCilOb ;
   private boolean[] T01973_n10800DibCilOb ;
   private String[] T01973_A396EmprCod ;
   private byte[] T01973_A10790EstCilCod ;
   private String[] T01972_A1013DibCli ;
   private int[] T01972_A252CliCod ;
   private int[] T01972_A1014DibInt ;
   private short[] T01972_A1807DibLinCil ;
   private int[] T01972_A10794DibCilLin ;
   private java.util.Date[] T01972_A10795DibCilFch ;
   private boolean[] T01972_n10795DibCilFch ;
   private java.math.BigDecimal[] T01972_A10796DibCilMt ;
   private boolean[] T01972_n10796DibCilMt ;
   private String[] T01972_A10797DibCilUs ;
   private boolean[] T01972_n10797DibCilUs ;
   private String[] T01972_A10798DibCilTm ;
   private boolean[] T01972_n10798DibCilTm ;
   private java.util.Date[] T01972_A10799DibCilHh ;
   private boolean[] T01972_n10799DibCilHh ;
   private String[] T01972_A10800DibCilOb ;
   private boolean[] T01972_n10800DibCilOb ;
   private String[] T01972_A396EmprCod ;
   private byte[] T01972_A10790EstCilCod ;
   private String[] T019723_A10791EstCilDsc ;
   private boolean[] T019723_n10791EstCilDsc ;
   private String[] T019724_A396EmprCod ;
   private String[] T019724_A1013DibCli ;
   private int[] T019724_A252CliCod ;
   private int[] T019724_A1014DibInt ;
   private short[] T019724_A1807DibLinCil ;
   private int[] T019724_A10794DibCilLin ;
   private String[] T019725_A407EmprNom ;
   private boolean[] T019725_n407EmprNom ;
   private String[] T019726_A396EmprCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tcccil0__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tcccil0__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tcccil0__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tcccil0__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tcccil0__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01972", "SELECT DibCli, CliCod, DibInt, DibLinCil, DibCilLin, DibCilFch, DibCilMt, DibCilUs, DibCilTm, DibCilHh, DibCilOb, EmprCod, EstCilCod FROM TXPCCCIL0 WHERE EmprCod = ? AND DibCli = ? AND CliCod = ? AND DibInt = ? AND DibLinCil = ? AND DibCilLin = ?  FOR UPDATE OF DibCilFch, DibCilMt, DibCilUs, DibCilTm, DibCilHh, DibCilOb, EstCilCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01973", "SELECT DibCli, CliCod, DibInt, DibLinCil, DibCilLin, DibCilFch, DibCilMt, DibCilUs, DibCilTm, DibCilHh, DibCilOb, EmprCod, EstCilCod FROM TXPCCCIL0 WHERE EmprCod = ? AND DibCli = ? AND CliCod = ? AND DibInt = ? AND DibLinCil = ? AND DibCilLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01974", "SELECT EstCilDsc FROM TXPESTCIL WHERE EmprCod = ? AND EstCilCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01975", "SELECT DibLinCil, DibCilUlt, EmprCod, CliCod, DibCli, DibInt FROM TXPLDIBUC WHERE EmprCod = ? AND DibCli = ? AND CliCod = ? AND DibInt = ? AND DibLinCil = ?  FOR UPDATE OF DibCilUlt NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01976", "SELECT DibLinCil, DibCilUlt, EmprCod, CliCod, DibCli, DibInt FROM TXPLDIBUC WHERE EmprCod = ? AND DibCli = ? AND CliCod = ? AND DibInt = ? AND DibLinCil = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01977", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01978", "SELECT EmprCod FROM TXPCDIBUJ WHERE EmprCod = ? AND DibCli = ? AND CliCod = ? AND DibInt = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01979", "SELECT /*+ FIRST_ROWS(1) */ TM1.DibLinCil, T2.EmprNom, TM1.DibCilUlt, TM1.EmprCod, TM1.CliCod, TM1.DibCli, TM1.DibInt FROM (TXPLDIBUC TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.DibCli = ? and TM1.CliCod = ? and TM1.DibInt = ? and TM1.DibLinCil = ? ORDER BY TM1.EmprCod, TM1.DibCli, TM1.CliCod, TM1.DibInt, TM1.DibLinCil ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T019710", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, DibCli, CliCod, DibInt, DibLinCil FROM TXPLDIBUC WHERE EmprCod = ? AND DibCli = ? AND CliCod = ? AND DibInt = ? AND DibLinCil = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T019711", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, DibCli, CliCod, DibInt, DibLinCil FROM TXPLDIBUC WHERE EmprCod = ? and DibCli = ? and CliCod = ? and DibInt = ? and DibLinCil = ? ORDER BY EmprCod, DibCli, CliCod, DibInt, DibLinCil) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T019712", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, DibCli, CliCod, DibInt, DibLinCil FROM TXPLDIBUC WHERE EmprCod = ? and DibCli = ? and CliCod = ? and DibInt = ? and DibLinCil = ? ORDER BY EmprCod DESC, DibCli DESC, CliCod DESC, DibInt DESC, DibLinCil DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T019713", "INSERT INTO TXPLDIBUC(DibLinCil, DibCilUlt, EmprCod, CliCod, DibCli, DibInt, DibLinMol, DibRelMC, DibOrdCil, TipCilCod, DibPosCil, DibPrcCob, DibCilCod, DibLinMalC, DibActivo, DibIntSp, DibOrgIn, DibOrgCl, DibOrgLi, DibOrgClid, DibDm, DibPres, DibCilMesh, DibCilSt, DibCilStF, DibCilMts) VALUES(?, ?, ?, ?, ?, ?, 0, ' ', 0, 0, 0, 0, ' ', ' ', ' ', 0, 0, ' ', 0, 0, 0, ' ', 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0)", GX_NOMASK, "TXPLDIBUC")
         ,new UpdateCursor("T019714", "UPDATE TXPLDIBUC SET DibCilUlt=?  WHERE EmprCod = ? AND DibCli = ? AND CliCod = ? AND DibInt = ? AND DibLinCil = ?", GX_NOMASK, "TXPLDIBUC")
         ,new UpdateCursor("T019715", "DELETE FROM TXPLDIBUC  WHERE EmprCod = ? AND DibCli = ? AND CliCod = ? AND DibInt = ? AND DibLinCil = ?", GX_NOMASK, "TXPLDIBUC")
         ,new ForEachCursor("T019716", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, DibCli, CliCod, DibInt, DibLinCil FROM TXPLDIBUC WHERE EmprCod = ? and DibCli = ? and CliCod = ? and DibInt = ? and DibLinCil = ? ORDER BY EmprCod, DibCli, CliCod, DibInt, DibLinCil ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T019717", "SELECT T1.DibCli, T1.CliCod, T1.DibInt, T1.DibLinCil, T1.DibCilLin, T2.EstCilDsc, T1.DibCilFch, T1.DibCilMt, T1.DibCilUs, T1.DibCilTm, T1.DibCilHh, T1.DibCilOb, T1.EmprCod, T1.EstCilCod FROM (TXPCCCIL0 T1 INNER JOIN TXPESTCIL T2 ON T2.EmprCod = T1.EmprCod AND T2.EstCilCod = T1.EstCilCod) WHERE T1.EmprCod = ? and T1.DibCli = ? and T1.CliCod = ? and T1.DibInt = ? and T1.DibLinCil = ? and T1.DibCilLin = ? ORDER BY T1.EmprCod, T1.DibCli, T1.CliCod, T1.DibInt, T1.DibLinCil, T1.DibCilLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T019718", "SELECT EstCilDsc FROM TXPESTCIL WHERE EmprCod = ? AND EstCilCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T019719", "SELECT EmprCod, DibCli, CliCod, DibInt, DibLinCil, DibCilLin FROM TXPCCCIL0 WHERE EmprCod = ? AND DibCli = ? AND CliCod = ? AND DibInt = ? AND DibLinCil = ? AND DibCilLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T019720", "INSERT INTO TXPCCCIL0(DibCli, CliCod, DibInt, DibLinCil, DibCilLin, DibCilFch, DibCilMt, DibCilUs, DibCilTm, DibCilHh, DibCilOb, EmprCod, EstCilCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPCCCIL0")
         ,new UpdateCursor("T019721", "UPDATE TXPCCCIL0 SET DibCilFch=?, DibCilMt=?, DibCilUs=?, DibCilTm=?, DibCilHh=?, DibCilOb=?, EstCilCod=?  WHERE EmprCod = ? AND DibCli = ? AND CliCod = ? AND DibInt = ? AND DibLinCil = ? AND DibCilLin = ?", GX_NOMASK, "TXPCCCIL0")
         ,new UpdateCursor("T019722", "DELETE FROM TXPCCCIL0  WHERE EmprCod = ? AND DibCli = ? AND CliCod = ? AND DibInt = ? AND DibLinCil = ? AND DibCilLin = ?", GX_NOMASK, "TXPCCCIL0")
         ,new ForEachCursor("T019723", "SELECT EstCilDsc FROM TXPESTCIL WHERE EmprCod = ? AND EstCilCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T019724", "SELECT EmprCod, DibCli, CliCod, DibInt, DibLinCil, DibCilLin FROM TXPCCCIL0 WHERE EmprCod = ? and DibCli = ? and CliCod = ? and DibInt = ? and DibLinCil = ? ORDER BY EmprCod, DibCli, CliCod, DibInt, DibLinCil, DibCilLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T019725", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T019726", "SELECT EmprCod FROM TXPCDIBUJ WHERE EmprCod = ? AND DibCli = ? AND CliCod = ? AND DibInt = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(8, 8);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(9, 10);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDateTime(10);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(11);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(12, 3);
               ((byte[]) buf[18])[0] = rslt.getByte(13);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(8, 8);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(9, 10);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDateTime(10);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(11);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(12, 3);
               ((byte[]) buf[18])[0] = rslt.getByte(13);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 16);
               ((int[]) buf[6])[0] = rslt.getInt(6);
               return;
            case 4 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 16);
               ((int[]) buf[6])[0] = rslt.getInt(6);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 7 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 3);
               ((int[]) buf[6])[0] = rslt.getInt(5);
               ((String[]) buf[7])[0] = rslt.getString(6, 16);
               ((int[]) buf[8])[0] = rslt.getInt(7);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 40);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(9, 8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(10, 10);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDateTime(11);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(12);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(13, 3);
               ((byte[]) buf[20])[0] = rslt.getByte(14);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 24 :
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
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 11 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setString(3, (String)parms[3], 3);
               stmt.setInt(4, ((Number) parms[4]).intValue());
               stmt.setString(5, (String)parms[5], 16);
               stmt.setInt(6, ((Number) parms[6]).intValue());
               return;
            case 12 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setString(3, (String)parms[3], 16);
               stmt.setInt(4, ((Number) parms[4]).intValue());
               stmt.setInt(5, ((Number) parms[5]).intValue());
               stmt.setShort(6, ((Number) parms[6]).shortValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 16);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DATE );
               }
               else
               {
                  stmt.setDate(6, (java.util.Date)parms[6]);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[8], 2);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[10], 8);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[12], 10);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(10, (java.util.Date)parms[14], false);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(11, (String)parms[16], 200);
               }
               stmt.setString(12, (String)parms[17], 3);
               stmt.setByte(13, ((Number) parms[18]).byteValue());
               return;
            case 19 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DATE );
               }
               else
               {
                  stmt.setDate(1, (java.util.Date)parms[1]);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(2, (java.math.BigDecimal)parms[3], 2);
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 10);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(5, (java.util.Date)parms[9], false);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(6, (String)parms[11], 200);
               }
               stmt.setByte(7, ((Number) parms[12]).byteValue());
               stmt.setString(8, (String)parms[13], 3);
               stmt.setString(9, (String)parms[14], 16);
               stmt.setInt(10, ((Number) parms[15]).intValue());
               stmt.setInt(11, ((Number) parms[16]).intValue());
               stmt.setShort(12, ((Number) parms[17]).shortValue());
               stmt.setInt(13, ((Number) parms[18]).intValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
      }
   }

}

