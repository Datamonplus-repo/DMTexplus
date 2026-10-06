package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tdforma_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_9") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_9( A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_10") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A6310Lb_TaAuxC = httpContext.GetPar( "Lb_TaAuxC") ;
         n6310Lb_TaAuxC = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6310Lb_TaAuxC", A6310Lb_TaAuxC);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_10( A396EmprCod, A6310Lb_TaAuxC) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_11") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_11( A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_12") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A486ForNumCol = (int)(GXutil.lval( httpContext.GetPar( "ForNumCol"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A486ForNumCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A486ForNumCol), 8, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_12( A396EmprCod, A486ForNumCol) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_13") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A486ForNumCol = (int)(GXutil.lval( httpContext.GetPar( "ForNumCol"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A486ForNumCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A486ForNumCol), 8, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_13( A396EmprCod, A486ForNumCol) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_16") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A719PrdNum = httpContext.GetPar( "PrdNum") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_16( A396EmprCod, A719PrdNum) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_17") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A490ForPrdUMe = (byte)(GXutil.lval( httpContext.GetPar( "ForPrdUMe"))) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_17( A396EmprCod, A490ForPrdUMe) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_15") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A486ForNumCol = (int)(GXutil.lval( httpContext.GetPar( "ForNumCol"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A486ForNumCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A486ForNumCol), 8, 0));
         A309ColLin = (short)(GXutil.lval( httpContext.GetPar( "ColLin"))) ;
         A6222ColLinV = (short)(GXutil.lval( httpContext.GetPar( "ColLinV"))) ;
         A6220EmprCodV3 = httpContext.GetPar( "EmprCodV3") ;
         httpContext.ajax_rsp_assign_attri("", false, "A6220EmprCodV3", A6220EmprCodV3);
         A6221ForNumColV = (int)(GXutil.lval( httpContext.GetPar( "ForNumColV"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A6221ForNumColV", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6221ForNumColV), 8, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_15( A396EmprCod, A486ForNumCol, A309ColLin, A6222ColLinV, A6220EmprCodV3, A6221ForNumColV) ;
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Gridtdforma_level1item") == 0 )
      {
         gxnrgridtdforma_level1item_newrow_invoke( ) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "COLORANTE Y PASO TABLA ALCALIS", ""), (short)(0)) ;
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

   public void gxnrgridtdforma_level1item_newrow_invoke( )
   {
      nRC_GXsfl_123 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_123"))) ;
      nGXsfl_123_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_123_idx"))) ;
      sGXsfl_123_idx = httpContext.GetPar( "sGXsfl_123_idx") ;
      Gx_mode = httpContext.GetPar( "Mode") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgridtdforma_level1item_newrow( ) ;
      /* End function gxnrGridtdforma_level1item_newrow_invoke */
   }

   public tdforma_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tdforma_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tdforma_impl.class ));
   }

   public tdforma_impl( int remoteHandle ,
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, httpContext.getMessage( "COLORANTE Y PASO TABLA ALCALIS", ""), "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, 0, (short)(0), "HLP_TDFORMa.htm");
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDFORMa.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
      ClassString = "BtnPrevious" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDFORMa.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      ClassString = "BtnNext" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDFORMa.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
      ClassString = "BtnLast" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDFORMa.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
      ClassString = "BtnSelect" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TDFORMa.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,34);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDFORMa.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtForNumCol_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtForNumCol_Internalname, httpContext.getMessage( "Nº Interno F.", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtForNumCol_Internalname, GXutil.ltrim( localUtil.ntoc( A486ForNumCol, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtForNumCol_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A486ForNumCol), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A486ForNumCol), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,39);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForNumCol_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtForNumCol_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDFORMa.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtColUltLin_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtColUltLin_Internalname, httpContext.getMessage( "Ultima Linea Colorante", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtColUltLin_Internalname, GXutil.ltrim( localUtil.ntoc( A310ColUltLin, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtColUltLin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A310ColUltLin), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A310ColUltLin), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,44);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtColUltLin_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtColUltLin_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDFORMa.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtContNum_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtContNum_Internalname, httpContext.getMessage( "Valor Contador", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtContNum_Internalname, GXutil.ltrim( localUtil.ntoc( A315ContNum, (byte)(9), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtContNum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A315ContNum), "ZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A315ContNum), "ZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtContNum_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtContNum_Enabled, 0, "text", "1", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDFORMa.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCosKgm_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCosKgm_Internalname, httpContext.getMessage( "Coste / Kgm.", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCosKgm_Internalname, GXutil.ltrim( localUtil.ntoc( A318CosKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCosKgm_Enabled!=0) ? localUtil.format( A318CosKgm, "ZZZZZ9.99") : localUtil.format( A318CosKgm, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,54);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCosKgm_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtCosKgm_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDFORMa.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDFORMa.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtEmpNumDec_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtEmpNumDec_Internalname, httpContext.getMessage( "EmpNumDec", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmpNumDec_Internalname, GXutil.ltrim( localUtil.ntoc( A3915EmpNumDec, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEmpNumDec_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3915EmpNumDec), "9") : localUtil.format( DecimalUtil.doubleToDec(A3915EmpNumDec), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmpNumDec_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEmpNumDec_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDFORMa.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCosKgmF_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCosKgmF_Internalname, httpContext.getMessage( "Formula del Coste Kgs Formula", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCosKgmF_Internalname, GXutil.ltrim( localUtil.ntoc( A5166CosKgmF, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCosKgmF_Enabled!=0) ? localUtil.format( A5166CosKgmF, "ZZZZZZ9.99999") : localUtil.format( A5166CosKgmF, "ZZZZZZ9.99999"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCosKgmF_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtCosKgmF_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDFORMa.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtForCanSum_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtForCanSum_Internalname, httpContext.getMessage( "Suma Cantidad de Colorante", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtForCanSum_Internalname, GXutil.ltrim( localUtil.ntoc( A5361ForCanSum, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtForCanSum_Enabled!=0) ? localUtil.format( A5361ForCanSum, "ZZZZ9.99999") : localUtil.format( A5361ForCanSum, "ZZZZ9.99999"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForCanSum_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtForCanSum_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDFORMa.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtEmprCodV3_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtEmprCodV3_Internalname, httpContext.getMessage( "EmprCodV3", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCodV3_Internalname, GXutil.rtrim( A6220EmprCodV3), GXutil.rtrim( localUtil.format( A6220EmprCodV3, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCodV3_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEmprCodV3_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDFORMa.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtForNumColV_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtForNumColV_Internalname, httpContext.getMessage( "Num.Color Interno form.Virtual", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtForNumColV_Internalname, GXutil.ltrim( localUtil.ntoc( A6221ForNumColV, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtForNumColV_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6221ForNumColV), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6221ForNumColV), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForNumColV_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtForNumColV_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDFORMa.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtLb_TaAuxC_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtLb_TaAuxC_Internalname, httpContext.getMessage( "Codigo Tabla Auxiliares", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 89,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLb_TaAuxC_Internalname, GXutil.rtrim( A6310Lb_TaAuxC), GXutil.rtrim( localUtil.format( A6310Lb_TaAuxC, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,89);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLb_TaAuxC_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtLb_TaAuxC_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDFORMa.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtLb_TaAuxD_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtLb_TaAuxD_Internalname, httpContext.getMessage( "Descripcion Tabla Auxiliares", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtLb_TaAuxD_Internalname, GXutil.rtrim( A6311Lb_TaAuxD), GXutil.rtrim( localUtil.format( A6311Lb_TaAuxD, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLb_TaAuxD_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtLb_TaAuxD_Enabled, 0, "text", "", 60, "chr", 1, "row", 60, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDFORMa.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtLb_fam1_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtLb_fam1_Internalname, httpContext.getMessage( "Familia C 1", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 99,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLb_fam1_Internalname, GXutil.ltrim( localUtil.ntoc( A6369Lb_fam1, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtLb_fam1_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6369Lb_fam1), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A6369Lb_fam1), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,99);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLb_fam1_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtLb_fam1_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDFORMa.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtLb_fam2_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtLb_fam2_Internalname, httpContext.getMessage( "Familia C 2", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 104,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLb_fam2_Internalname, GXutil.ltrim( localUtil.ntoc( A6370Lb_fam2, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtLb_fam2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6370Lb_fam2), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A6370Lb_fam2), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,104);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLb_fam2_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtLb_fam2_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDFORMa.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtLb_fam3_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtLb_fam3_Internalname, httpContext.getMessage( "Familia C 3", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 109,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLb_fam3_Internalname, GXutil.ltrim( localUtil.ntoc( A6371Lb_fam3, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtLb_fam3_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6371Lb_fam3), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A6371Lb_fam3), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,109);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLb_fam3_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtLb_fam3_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDFORMa.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdHorMax_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdHorMax_Internalname, httpContext.getMessage( "Hora Maxima Maduracion", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdHorMax_Internalname, GXutil.ltrim( localUtil.ntoc( A7259PrdHorMax, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdHorMax_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A7259PrdHorMax), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A7259PrdHorMax), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdHorMax_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdHorMax_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDFORMa.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTitlelevel1_Internalname, httpContext.getMessage( "Level1", ""), "", "", lblTitlelevel1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, 0, (short)(0), "HLP_TDFORMa.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      gxdraw_gridtdforma_level1item( ) ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 143,'',false,'',0)\"" ;
      ClassString = "BtnEnter" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDFORMa.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 145,'',false,'',0)\"" ;
      ClassString = "BtnCancel" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDFORMa.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 147,'',false,'',0)\"" ;
      ClassString = "BtnDelete" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDFORMa.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
   }

   public void gxdraw_gridtdforma_level1item( )
   {
      /*  Grid Control  */
      startgridcontrol123( ) ;
      nGXsfl_123_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount33 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_33 = (short)(1) ;
            scanStart11P33( ) ;
            while ( RcdFound33 != 0 )
            {
               init_level_properties33( ) ;
               getByPrimaryKey11P33( ) ;
               addRow11P33( ) ;
               scanNext11P33( ) ;
            }
            scanEnd11P33( ) ;
            nBlankRcdCount33 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B5166CosKgmF = A5166CosKgmF ;
         n5166CosKgmF = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5166CosKgmF", GXutil.ltrimstr( A5166CosKgmF, 13, 5));
         B5361ForCanSum = A5361ForCanSum ;
         n5361ForCanSum = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5361ForCanSum", GXutil.ltrimstr( A5361ForCanSum, 11, 5));
         standaloneNotModal11P33( ) ;
         standaloneModal11P33( ) ;
         sMode33 = Gx_mode ;
         while ( nGXsfl_123_idx < nRC_GXsfl_123 )
         {
            bGXsfl_123_Refreshing = true ;
            readRow11P33( ) ;
            edtColLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "COLLIN_"+sGXsfl_123_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtColLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtColLin_Enabled), 5, 0), !bGXsfl_123_Refreshing);
            edtPrdNum_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDNUM_"+sGXsfl_123_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Enabled), 5, 0), !bGXsfl_123_Refreshing);
            edtPrdNom_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDNOM_"+sGXsfl_123_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPrdNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNom_Enabled), 5, 0), !bGXsfl_123_Refreshing);
            edtValCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "VALCOD_"+sGXsfl_123_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtValCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtValCod_Enabled), 5, 0), !bGXsfl_123_Refreshing);
            edtPrdPreAct_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDPREACT_"+sGXsfl_123_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPrdPreAct_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdPreAct_Enabled), 5, 0), !bGXsfl_123_Refreshing);
            edtForPrdUMe_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FORPRDUME_"+sGXsfl_123_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtForPrdUMe_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForPrdUMe_Enabled), 5, 0), !bGXsfl_123_Refreshing);
            edtForPrdDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FORPRDDSC_"+sGXsfl_123_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtForPrdDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForPrdDsc_Enabled), 5, 0), !bGXsfl_123_Refreshing);
            edtForCan_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FORCAN_"+sGXsfl_123_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtForCan_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForCan_Enabled), 5, 0), !bGXsfl_123_Refreshing);
            edtTotLinCol_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TOTLINCOL_"+sGXsfl_123_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtTotLinCol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTotLinCol_Enabled), 5, 0), !bGXsfl_123_Refreshing);
            edtPrdUMeFo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDUMEFO_"+sGXsfl_123_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPrdUMeFo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdUMeFo_Enabled), 5, 0), !bGXsfl_123_Refreshing);
            edtTotLinCoF_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TOTLINCOF_"+sGXsfl_123_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtTotLinCoF_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTotLinCoF_Enabled), 5, 0), !bGXsfl_123_Refreshing);
            edtForClaCol_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FORCLACOL_"+sGXsfl_123_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtForClaCol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForClaCol_Enabled), 5, 0), !bGXsfl_123_Refreshing);
            edtColLinV_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "COLLINV_"+sGXsfl_123_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtColLinV_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtColLinV_Enabled), 5, 0), !bGXsfl_123_Refreshing);
            edtPrdNumMax_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDNUMMAX_"+sGXsfl_123_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPrdNumMax_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNumMax_Enabled), 5, 0), !bGXsfl_123_Refreshing);
            edtPrdHorMad_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDHORMAD_"+sGXsfl_123_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPrdHorMad_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdHorMad_Enabled), 5, 0), !bGXsfl_123_Refreshing);
            if ( ( nRcdExists_33 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal11P33( ) ;
            }
            sendRow11P33( ) ;
            bGXsfl_123_Refreshing = false ;
         }
         Gx_mode = sMode33 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A5166CosKgmF = B5166CosKgmF ;
         n5166CosKgmF = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5166CosKgmF", GXutil.ltrimstr( A5166CosKgmF, 13, 5));
         A5361ForCanSum = B5361ForCanSum ;
         n5361ForCanSum = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5361ForCanSum", GXutil.ltrimstr( A5361ForCanSum, 11, 5));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount33 = (short)(5) ;
         nRcdExists_33 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart11P33( ) ;
            while ( RcdFound33 != 0 )
            {
               sGXsfl_123_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_123_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_12333( ) ;
               init_level_properties33( ) ;
               standaloneNotModal11P33( ) ;
               getByPrimaryKey11P33( ) ;
               standaloneModal11P33( ) ;
               addRow11P33( ) ;
               scanNext11P33( ) ;
            }
            scanEnd11P33( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode33 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_123_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_123_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_12333( ) ;
      initAll11P33( ) ;
      init_level_properties33( ) ;
      B5166CosKgmF = A5166CosKgmF ;
      n5166CosKgmF = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5166CosKgmF", GXutil.ltrimstr( A5166CosKgmF, 13, 5));
      B5361ForCanSum = A5361ForCanSum ;
      n5361ForCanSum = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5361ForCanSum", GXutil.ltrimstr( A5361ForCanSum, 11, 5));
      nRcdExists_33 = (short)(0) ;
      nIsMod_33 = (short)(0) ;
      nRcdDeleted_33 = (short)(0) ;
      nBlankRcdCount33 = (short)(nBlankRcdUsr33+nBlankRcdCount33) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount33 > 0 )
      {
         standaloneNotModal11P33( ) ;
         standaloneModal11P33( ) ;
         addRow11P33( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtColLin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount33 = (short)(nBlankRcdCount33-1) ;
      }
      Gx_mode = sMode33 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      A5166CosKgmF = B5166CosKgmF ;
      n5166CosKgmF = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5166CosKgmF", GXutil.ltrimstr( A5166CosKgmF, 13, 5));
      A5361ForCanSum = B5361ForCanSum ;
      n5361ForCanSum = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5361ForCanSum", GXutil.ltrimstr( A5361ForCanSum, 11, 5));
      sStyleString = "" ;
      httpContext.writeText( "<div id=\""+"Gridtdforma_level1itemContainer"+"Div\" "+sStyleString+">"+"</div>") ;
      httpContext.ajax_rsp_assign_grid("_"+"Gridtdforma_level1item", Gridtdforma_level1itemContainer, subGridtdforma_level1item_Internalname);
      if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridtdforma_level1itemContainerData", Gridtdforma_level1itemContainer.ToJavascriptSource());
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridtdforma_level1itemContainerData"+"V", Gridtdforma_level1itemContainer.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Gridtdforma_level1itemContainerData"+"V"+"\" value='"+Gridtdforma_level1itemContainer.GridValuesHidden()+"'/>") ;
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
         Z486ForNumCol = (int)(localUtil.ctol( httpContext.cgiGet( "Z486ForNumCol"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z310ColUltLin = (short)(localUtil.ctol( httpContext.cgiGet( "Z310ColUltLin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z315ContNum = (int)(localUtil.ctol( httpContext.cgiGet( "Z315ContNum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z318CosKgm = localUtil.ctond( httpContext.cgiGet( "Z318CosKgm")) ;
         Z6369Lb_fam1 = (byte)(localUtil.ctol( httpContext.cgiGet( "Z6369Lb_fam1"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z6370Lb_fam2 = (byte)(localUtil.ctol( httpContext.cgiGet( "Z6370Lb_fam2"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z6371Lb_fam3 = (byte)(localUtil.ctol( httpContext.cgiGet( "Z6371Lb_fam3"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z6310Lb_TaAuxC = httpContext.cgiGet( "Z6310Lb_TaAuxC") ;
         O5166CosKgmF = localUtil.ctond( httpContext.cgiGet( "O5166CosKgmF")) ;
         O5361ForCanSum = localUtil.ctond( httpContext.cgiGet( "O5361ForCanSum")) ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         nRC_GXsfl_123 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_123"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A707PrdFacCon = localUtil.ctond( httpContext.cgiGet( "PRDFACCON")) ;
         /* Read variables values. */
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtForNumCol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtForNumCol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "FORNUMCOL");
            AnyError = (short)(1) ;
            GX_FocusControl = edtForNumCol_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A486ForNumCol = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A486ForNumCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A486ForNumCol), 8, 0));
         }
         else
         {
            A486ForNumCol = (int)(localUtil.ctol( httpContext.cgiGet( edtForNumCol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A486ForNumCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A486ForNumCol), 8, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtColUltLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtColUltLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "COLULTLIN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtColUltLin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A310ColUltLin = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A310ColUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A310ColUltLin), 3, 0));
         }
         else
         {
            A310ColUltLin = (short)(localUtil.ctol( httpContext.cgiGet( edtColUltLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A310ColUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A310ColUltLin), 3, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtContNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtContNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CONTNUM");
            AnyError = (short)(1) ;
            GX_FocusControl = edtContNum_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A315ContNum = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A315ContNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A315ContNum), 9, 0));
         }
         else
         {
            A315ContNum = (int)(localUtil.ctol( httpContext.cgiGet( edtContNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A315ContNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A315ContNum), 9, 0));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtCosKgm_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtCosKgm_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "COSKGM");
            AnyError = (short)(1) ;
            GX_FocusControl = edtCosKgm_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A318CosKgm = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A318CosKgm", GXutil.ltrimstr( A318CosKgm, 9, 2));
         }
         else
         {
            A318CosKgm = localUtil.ctond( httpContext.cgiGet( edtCosKgm_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A318CosKgm", GXutil.ltrimstr( A318CosKgm, 9, 2));
         }
         A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
         n407EmprNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A3915EmpNumDec = (byte)(localUtil.ctol( httpContext.cgiGet( edtEmpNumDec_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n3915EmpNumDec = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3915EmpNumDec", GXutil.str( A3915EmpNumDec, 1, 0));
         A5166CosKgmF = localUtil.ctond( httpContext.cgiGet( edtCosKgmF_Internalname)) ;
         n5166CosKgmF = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5166CosKgmF", GXutil.ltrimstr( A5166CosKgmF, 13, 5));
         A5361ForCanSum = localUtil.ctond( httpContext.cgiGet( edtForCanSum_Internalname)) ;
         n5361ForCanSum = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5361ForCanSum", GXutil.ltrimstr( A5361ForCanSum, 11, 5));
         A6220EmprCodV3 = GXutil.upper( httpContext.cgiGet( edtEmprCodV3_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A6220EmprCodV3", A6220EmprCodV3);
         A6221ForNumColV = (int)(localUtil.ctol( httpContext.cgiGet( edtForNumColV_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A6221ForNumColV", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6221ForNumColV), 8, 0));
         A6310Lb_TaAuxC = httpContext.cgiGet( edtLb_TaAuxC_Internalname) ;
         n6310Lb_TaAuxC = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6310Lb_TaAuxC", A6310Lb_TaAuxC);
         A6311Lb_TaAuxD = httpContext.cgiGet( edtLb_TaAuxD_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A6311Lb_TaAuxD", A6311Lb_TaAuxD);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtLb_fam1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtLb_fam1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "LB_FAM1");
            AnyError = (short)(1) ;
            GX_FocusControl = edtLb_fam1_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A6369Lb_fam1 = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6369Lb_fam1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6369Lb_fam1), 2, 0));
         }
         else
         {
            A6369Lb_fam1 = (byte)(localUtil.ctol( httpContext.cgiGet( edtLb_fam1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6369Lb_fam1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6369Lb_fam1), 2, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtLb_fam2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtLb_fam2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "LB_FAM2");
            AnyError = (short)(1) ;
            GX_FocusControl = edtLb_fam2_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A6370Lb_fam2 = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6370Lb_fam2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6370Lb_fam2), 2, 0));
         }
         else
         {
            A6370Lb_fam2 = (byte)(localUtil.ctol( httpContext.cgiGet( edtLb_fam2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6370Lb_fam2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6370Lb_fam2), 2, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtLb_fam3_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtLb_fam3_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "LB_FAM3");
            AnyError = (short)(1) ;
            GX_FocusControl = edtLb_fam3_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A6371Lb_fam3 = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6371Lb_fam3", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6371Lb_fam3), 2, 0));
         }
         else
         {
            A6371Lb_fam3 = (byte)(localUtil.ctol( httpContext.cgiGet( edtLb_fam3_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6371Lb_fam3", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6371Lb_fam3), 2, 0));
         }
         A7259PrdHorMax = (byte)(localUtil.ctol( httpContext.cgiGet( edtPrdHorMax_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n7259PrdHorMax = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A7259PrdHorMax", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7259PrdHorMax), 2, 0));
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
            A486ForNumCol = (int)(GXutil.lval( httpContext.GetPar( "ForNumCol"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A486ForNumCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A486ForNumCol), 8, 0));
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
            initAll11P32( ) ;
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
      disableAttributes11P32( ) ;
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

   public void confirm_11P33( )
   {
      s5166CosKgmF = O5166CosKgmF ;
      n5166CosKgmF = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5166CosKgmF", GXutil.ltrimstr( A5166CosKgmF, 13, 5));
      s5361ForCanSum = O5361ForCanSum ;
      n5361ForCanSum = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5361ForCanSum", GXutil.ltrimstr( A5361ForCanSum, 11, 5));
      nGXsfl_123_idx = 0 ;
      while ( nGXsfl_123_idx < nRC_GXsfl_123 )
      {
         readRow11P33( ) ;
         if ( ( nRcdExists_33 != 0 ) || ( nIsMod_33 != 0 ) )
         {
            getKey11P33( ) ;
            if ( ( nRcdExists_33 == 0 ) && ( nRcdDeleted_33 == 0 ) )
            {
               if ( RcdFound33 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate11P33( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable11P33( ) ;
                     closeExtendedTableCursors11P33( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O5166CosKgmF = A5166CosKgmF ;
                     n5166CosKgmF = false ;
                     httpContext.ajax_rsp_assign_attri("", false, "A5166CosKgmF", GXutil.ltrimstr( A5166CosKgmF, 13, 5));
                     O5361ForCanSum = A5361ForCanSum ;
                     n5361ForCanSum = false ;
                     httpContext.ajax_rsp_assign_attri("", false, "A5361ForCanSum", GXutil.ltrimstr( A5361ForCanSum, 11, 5));
                  }
               }
               else
               {
                  GXCCtl = "COLLIN_" + sGXsfl_123_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtColLin_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound33 != 0 )
               {
                  if ( nRcdDeleted_33 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey11P33( ) ;
                     load11P33( ) ;
                     beforeValidate11P33( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls11P33( ) ;
                        O5166CosKgmF = A5166CosKgmF ;
                        n5166CosKgmF = false ;
                        httpContext.ajax_rsp_assign_attri("", false, "A5166CosKgmF", GXutil.ltrimstr( A5166CosKgmF, 13, 5));
                        O5361ForCanSum = A5361ForCanSum ;
                        n5361ForCanSum = false ;
                        httpContext.ajax_rsp_assign_attri("", false, "A5361ForCanSum", GXutil.ltrimstr( A5361ForCanSum, 11, 5));
                     }
                  }
                  else
                  {
                     if ( nIsMod_33 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate11P33( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable11P33( ) ;
                           closeExtendedTableCursors11P33( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O5166CosKgmF = A5166CosKgmF ;
                           n5166CosKgmF = false ;
                           httpContext.ajax_rsp_assign_attri("", false, "A5166CosKgmF", GXutil.ltrimstr( A5166CosKgmF, 13, 5));
                           O5361ForCanSum = A5361ForCanSum ;
                           n5361ForCanSum = false ;
                           httpContext.ajax_rsp_assign_attri("", false, "A5361ForCanSum", GXutil.ltrimstr( A5361ForCanSum, 11, 5));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_33 == 0 )
                  {
                     GXCCtl = "COLLIN_" + sGXsfl_123_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtColLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtColLin_Internalname, GXutil.ltrim( localUtil.ntoc( A309ColLin, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPrdNum_Internalname, GXutil.rtrim( A719PrdNum)) ;
         httpContext.changePostValue( edtPrdNom_Internalname, GXutil.rtrim( A718PrdNom)) ;
         httpContext.changePostValue( edtValCod_Internalname, GXutil.ltrim( localUtil.ntoc( A856ValCod, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPrdPreAct_Internalname, GXutil.ltrim( localUtil.ntoc( A724PrdPreAct, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtForPrdUMe_Internalname, GXutil.ltrim( localUtil.ntoc( A490ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtForPrdDsc_Internalname, GXutil.rtrim( A488ForPrdDsc)) ;
         httpContext.changePostValue( edtForCan_Internalname, GXutil.ltrim( localUtil.ntoc( A481ForCan, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtTotLinCol_Internalname, GXutil.ltrim( localUtil.ntoc( A838TotLinCol, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPrdUMeFo_Internalname, GXutil.ltrim( localUtil.ntoc( A4338PrdUMeFo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtTotLinCoF_Internalname, GXutil.ltrim( localUtil.ntoc( A5167TotLinCoF, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtForClaCol_Internalname, GXutil.rtrim( A6193ForClaCol)) ;
         httpContext.changePostValue( edtColLinV_Internalname, GXutil.ltrim( localUtil.ntoc( A6222ColLinV, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPrdNumMax_Internalname, GXutil.rtrim( A6223PrdNumMax)) ;
         httpContext.changePostValue( edtPrdHorMad_Internalname, GXutil.ltrim( localUtil.ntoc( A7260PrdHorMad, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z309ColLin_"+sGXsfl_123_idx, GXutil.ltrim( localUtil.ntoc( Z309ColLin, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z481ForCan_"+sGXsfl_123_idx, GXutil.ltrim( localUtil.ntoc( Z481ForCan, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z838TotLinCol_"+sGXsfl_123_idx, GXutil.ltrim( localUtil.ntoc( Z838TotLinCol, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6193ForClaCol_"+sGXsfl_123_idx, GXutil.rtrim( Z6193ForClaCol)) ;
         httpContext.changePostValue( "ZT_"+"Z719PrdNum_"+sGXsfl_123_idx, GXutil.rtrim( Z719PrdNum)) ;
         httpContext.changePostValue( "ZT_"+"Z490ForPrdUMe_"+sGXsfl_123_idx, GXutil.ltrim( localUtil.ntoc( Z490ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T5167TotLinCoF_"+sGXsfl_123_idx, GXutil.ltrim( localUtil.ntoc( O5167TotLinCoF, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T481ForCan_"+sGXsfl_123_idx, GXutil.ltrim( localUtil.ntoc( O481ForCan, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_33_"+sGXsfl_123_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_33, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_33_"+sGXsfl_123_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_33, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_33_"+sGXsfl_123_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_33, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_33 != 0 )
         {
            httpContext.changePostValue( "COLLIN_"+sGXsfl_123_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtColLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDNUM_"+sGXsfl_123_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNum_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDNOM_"+sGXsfl_123_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNom_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "VALCOD_"+sGXsfl_123_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtValCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDPREACT_"+sGXsfl_123_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdPreAct_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FORPRDUME_"+sGXsfl_123_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForPrdUMe_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FORPRDDSC_"+sGXsfl_123_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForPrdDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FORCAN_"+sGXsfl_123_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForCan_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TOTLINCOL_"+sGXsfl_123_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTotLinCol_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDUMEFO_"+sGXsfl_123_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdUMeFo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TOTLINCOF_"+sGXsfl_123_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTotLinCoF_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FORCLACOL_"+sGXsfl_123_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForClaCol_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "COLLINV_"+sGXsfl_123_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtColLinV_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDNUMMAX_"+sGXsfl_123_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNumMax_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDHORMAD_"+sGXsfl_123_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdHorMad_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O5166CosKgmF = s5166CosKgmF ;
      n5166CosKgmF = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5166CosKgmF", GXutil.ltrimstr( A5166CosKgmF, 13, 5));
      O5361ForCanSum = s5361ForCanSum ;
      n5361ForCanSum = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5361ForCanSum", GXutil.ltrimstr( A5361ForCanSum, 11, 5));
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption11P0( )
   {
   }

   public void zm11P32( int GX_JID )
   {
      if ( ( GX_JID == 8 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z310ColUltLin = T011P13_A310ColUltLin[0] ;
            Z315ContNum = T011P13_A315ContNum[0] ;
            Z318CosKgm = T011P13_A318CosKgm[0] ;
            Z6369Lb_fam1 = T011P13_A6369Lb_fam1[0] ;
            Z6370Lb_fam2 = T011P13_A6370Lb_fam2[0] ;
            Z6371Lb_fam3 = T011P13_A6371Lb_fam3[0] ;
            Z6310Lb_TaAuxC = T011P13_A6310Lb_TaAuxC[0] ;
         }
         else
         {
            Z310ColUltLin = A310ColUltLin ;
            Z315ContNum = A315ContNum ;
            Z318CosKgm = A318CosKgm ;
            Z6369Lb_fam1 = A6369Lb_fam1 ;
            Z6370Lb_fam2 = A6370Lb_fam2 ;
            Z6371Lb_fam3 = A6371Lb_fam3 ;
            Z6310Lb_TaAuxC = A6310Lb_TaAuxC ;
         }
      }
      if ( GX_JID == -8 )
      {
         Z486ForNumCol = A486ForNumCol ;
         Z310ColUltLin = A310ColUltLin ;
         Z315ContNum = A315ContNum ;
         Z318CosKgm = A318CosKgm ;
         Z6369Lb_fam1 = A6369Lb_fam1 ;
         Z6370Lb_fam2 = A6370Lb_fam2 ;
         Z6371Lb_fam3 = A6371Lb_fam3 ;
         Z396EmprCod = A396EmprCod ;
         Z6310Lb_TaAuxC = A6310Lb_TaAuxC ;
         Z407EmprNom = A407EmprNom ;
         Z3915EmpNumDec = A3915EmpNumDec ;
         Z7259PrdHorMax = A7259PrdHorMax ;
         Z5166CosKgmF = A5166CosKgmF ;
         Z5361ForCanSum = A5361ForCanSum ;
         Z6311Lb_TaAuxD = A6311Lb_TaAuxD ;
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

   public void load11P32( )
   {
      /* Using cursor T011P25 */
      pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A486ForNumCol)});
      if ( (pr_default.getStatus(12) != 101) )
      {
         RcdFound32 = (short)(1) ;
         A310ColUltLin = T011P25_A310ColUltLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A310ColUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A310ColUltLin), 3, 0));
         A315ContNum = T011P25_A315ContNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A315ContNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A315ContNum), 9, 0));
         A318CosKgm = T011P25_A318CosKgm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A318CosKgm", GXutil.ltrimstr( A318CosKgm, 9, 2));
         A407EmprNom = T011P25_A407EmprNom[0] ;
         n407EmprNom = T011P25_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A3915EmpNumDec = T011P25_A3915EmpNumDec[0] ;
         n3915EmpNumDec = T011P25_n3915EmpNumDec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3915EmpNumDec", GXutil.str( A3915EmpNumDec, 1, 0));
         A6311Lb_TaAuxD = T011P25_A6311Lb_TaAuxD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6311Lb_TaAuxD", A6311Lb_TaAuxD);
         A6369Lb_fam1 = T011P25_A6369Lb_fam1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6369Lb_fam1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6369Lb_fam1), 2, 0));
         A6370Lb_fam2 = T011P25_A6370Lb_fam2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6370Lb_fam2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6370Lb_fam2), 2, 0));
         A6371Lb_fam3 = T011P25_A6371Lb_fam3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6371Lb_fam3", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6371Lb_fam3), 2, 0));
         A6310Lb_TaAuxC = T011P25_A6310Lb_TaAuxC[0] ;
         n6310Lb_TaAuxC = T011P25_n6310Lb_TaAuxC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6310Lb_TaAuxC", A6310Lb_TaAuxC);
         A5166CosKgmF = T011P25_A5166CosKgmF[0] ;
         n5166CosKgmF = T011P25_n5166CosKgmF[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5166CosKgmF", GXutil.ltrimstr( A5166CosKgmF, 13, 5));
         A5361ForCanSum = T011P25_A5361ForCanSum[0] ;
         n5361ForCanSum = T011P25_n5361ForCanSum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5361ForCanSum", GXutil.ltrimstr( A5361ForCanSum, 11, 5));
         A7259PrdHorMax = T011P25_A7259PrdHorMax[0] ;
         n7259PrdHorMax = T011P25_n7259PrdHorMax[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7259PrdHorMax", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7259PrdHorMax), 2, 0));
         zm11P32( -8) ;
      }
      pr_default.close(12);
      onLoadActions11P32( ) ;
   }

   public void onLoadActions11P32( )
   {
      O5166CosKgmF = A5166CosKgmF ;
      n5166CosKgmF = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5166CosKgmF", GXutil.ltrimstr( A5166CosKgmF, 13, 5));
      O5361ForCanSum = A5361ForCanSum ;
      n5361ForCanSum = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5361ForCanSum", GXutil.ltrimstr( A5361ForCanSum, 11, 5));
      A6220EmprCodV3 = A396EmprCod ;
      httpContext.ajax_rsp_assign_attri("", false, "A6220EmprCodV3", A6220EmprCodV3);
      A6221ForNumColV = A486ForNumCol ;
      httpContext.ajax_rsp_assign_attri("", false, "A6221ForNumColV", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6221ForNumColV), 8, 0));
   }

   public void checkExtendedTable11P32( )
   {
      nIsDirty_32 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T011P14 */
      pr_default.execute(7, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T011P14_A407EmprNom[0] ;
      n407EmprNom = T011P14_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      A3915EmpNumDec = T011P14_A3915EmpNumDec[0] ;
      n3915EmpNumDec = T011P14_n3915EmpNumDec[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A3915EmpNumDec", GXutil.str( A3915EmpNumDec, 1, 0));
      pr_default.close(7);
      /* Using cursor T011P15 */
      pr_default.execute(8, new Object[] {A396EmprCod, Boolean.valueOf(n6310Lb_TaAuxC), A6310Lb_TaAuxC});
      if ( (pr_default.getStatus(8) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (GXutil.strcmp("", A6310Lb_TaAuxC)==0) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ENS005", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "LB_TAAUXC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A6311Lb_TaAuxD = T011P15_A6311Lb_TaAuxD[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A6311Lb_TaAuxD", A6311Lb_TaAuxD);
      pr_default.close(8);
      /* Using cursor T011P17 */
      pr_default.execute(9, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(9) != 101) )
      {
         A7259PrdHorMax = T011P17_A7259PrdHorMax[0] ;
         n7259PrdHorMax = T011P17_n7259PrdHorMax[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7259PrdHorMax", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7259PrdHorMax), 2, 0));
      }
      else
      {
         nIsDirty_32 = (short)(1) ;
         A7259PrdHorMax = (byte)(0) ;
         n7259PrdHorMax = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A7259PrdHorMax", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7259PrdHorMax), 2, 0));
      }
      pr_default.close(9);
      nIsDirty_32 = (short)(1) ;
      A6220EmprCodV3 = A396EmprCod ;
      httpContext.ajax_rsp_assign_attri("", false, "A6220EmprCodV3", A6220EmprCodV3);
      /* Using cursor T011P19 */
      pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A486ForNumCol)});
      if ( (pr_default.getStatus(10) != 101) )
      {
         A5166CosKgmF = T011P19_A5166CosKgmF[0] ;
         n5166CosKgmF = T011P19_n5166CosKgmF[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5166CosKgmF", GXutil.ltrimstr( A5166CosKgmF, 13, 5));
      }
      else
      {
         nIsDirty_32 = (short)(1) ;
         A5166CosKgmF = DecimalUtil.doubleToDec(0) ;
         n5166CosKgmF = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5166CosKgmF", GXutil.ltrimstr( A5166CosKgmF, 13, 5));
      }
      pr_default.close(10);
      /* Using cursor T011P21 */
      pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A486ForNumCol)});
      if ( (pr_default.getStatus(11) != 101) )
      {
         A5361ForCanSum = T011P21_A5361ForCanSum[0] ;
         n5361ForCanSum = T011P21_n5361ForCanSum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5361ForCanSum", GXutil.ltrimstr( A5361ForCanSum, 11, 5));
      }
      else
      {
         nIsDirty_32 = (short)(1) ;
         A5361ForCanSum = DecimalUtil.doubleToDec(0) ;
         n5361ForCanSum = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5361ForCanSum", GXutil.ltrimstr( A5361ForCanSum, 11, 5));
      }
      pr_default.close(11);
      nIsDirty_32 = (short)(1) ;
      A6221ForNumColV = A486ForNumCol ;
      httpContext.ajax_rsp_assign_attri("", false, "A6221ForNumColV", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6221ForNumColV), 8, 0));
   }

   public void closeExtendedTableCursors11P32( )
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

   public void gxload_9( String A396EmprCod )
   {
      /* Using cursor T011P26 */
      pr_default.execute(13, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(13) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T011P26_A407EmprNom[0] ;
      n407EmprNom = T011P26_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      A3915EmpNumDec = T011P26_A3915EmpNumDec[0] ;
      n3915EmpNumDec = T011P26_n3915EmpNumDec[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A3915EmpNumDec", GXutil.str( A3915EmpNumDec, 1, 0));
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A407EmprNom))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A3915EmpNumDec, (byte)(1), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(13) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(13);
   }

   public void gxload_10( String A396EmprCod ,
                          String A6310Lb_TaAuxC )
   {
      /* Using cursor T011P27 */
      pr_default.execute(14, new Object[] {A396EmprCod, Boolean.valueOf(n6310Lb_TaAuxC), A6310Lb_TaAuxC});
      if ( (pr_default.getStatus(14) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (GXutil.strcmp("", A6310Lb_TaAuxC)==0) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ENS005", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "LB_TAAUXC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A6311Lb_TaAuxD = T011P27_A6311Lb_TaAuxD[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A6311Lb_TaAuxD", A6311Lb_TaAuxD);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A6311Lb_TaAuxD))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(14) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(14);
   }

   public void gxload_11( String A396EmprCod )
   {
      /* Using cursor T011P29 */
      pr_default.execute(15, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(15) != 101) )
      {
         A7259PrdHorMax = T011P29_A7259PrdHorMax[0] ;
         n7259PrdHorMax = T011P29_n7259PrdHorMax[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7259PrdHorMax", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7259PrdHorMax), 2, 0));
      }
      else
      {
         A7259PrdHorMax = (byte)(0) ;
         n7259PrdHorMax = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A7259PrdHorMax", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7259PrdHorMax), 2, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A7259PrdHorMax, (byte)(2), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(15) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(15);
   }

   public void gxload_12( String A396EmprCod ,
                          int A486ForNumCol )
   {
      /* Using cursor T011P31 */
      pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A486ForNumCol)});
      if ( (pr_default.getStatus(16) != 101) )
      {
         A5166CosKgmF = T011P31_A5166CosKgmF[0] ;
         n5166CosKgmF = T011P31_n5166CosKgmF[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5166CosKgmF", GXutil.ltrimstr( A5166CosKgmF, 13, 5));
      }
      else
      {
         A5166CosKgmF = DecimalUtil.doubleToDec(0) ;
         n5166CosKgmF = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5166CosKgmF", GXutil.ltrimstr( A5166CosKgmF, 13, 5));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A5166CosKgmF, (byte)(13), (byte)(5), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(16) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(16);
   }

   public void gxload_13( String A396EmprCod ,
                          int A486ForNumCol )
   {
      /* Using cursor T011P33 */
      pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A486ForNumCol)});
      if ( (pr_default.getStatus(17) != 101) )
      {
         A5361ForCanSum = T011P33_A5361ForCanSum[0] ;
         n5361ForCanSum = T011P33_n5361ForCanSum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5361ForCanSum", GXutil.ltrimstr( A5361ForCanSum, 11, 5));
      }
      else
      {
         A5361ForCanSum = DecimalUtil.doubleToDec(0) ;
         n5361ForCanSum = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5361ForCanSum", GXutil.ltrimstr( A5361ForCanSum, 11, 5));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A5361ForCanSum, (byte)(11), (byte)(5), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(17) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(17);
   }

   public void getKey11P32( )
   {
      /* Using cursor T011P34 */
      pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A486ForNumCol)});
      if ( (pr_default.getStatus(18) != 101) )
      {
         RcdFound32 = (short)(1) ;
      }
      else
      {
         RcdFound32 = (short)(0) ;
      }
      pr_default.close(18);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T011P13 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A486ForNumCol)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         zm11P32( 8) ;
         RcdFound32 = (short)(1) ;
         A486ForNumCol = T011P13_A486ForNumCol[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A486ForNumCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A486ForNumCol), 8, 0));
         A310ColUltLin = T011P13_A310ColUltLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A310ColUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A310ColUltLin), 3, 0));
         A315ContNum = T011P13_A315ContNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A315ContNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A315ContNum), 9, 0));
         A318CosKgm = T011P13_A318CosKgm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A318CosKgm", GXutil.ltrimstr( A318CosKgm, 9, 2));
         A6369Lb_fam1 = T011P13_A6369Lb_fam1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6369Lb_fam1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6369Lb_fam1), 2, 0));
         A6370Lb_fam2 = T011P13_A6370Lb_fam2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6370Lb_fam2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6370Lb_fam2), 2, 0));
         A6371Lb_fam3 = T011P13_A6371Lb_fam3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6371Lb_fam3", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6371Lb_fam3), 2, 0));
         A396EmprCod = T011P13_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A6310Lb_TaAuxC = T011P13_A6310Lb_TaAuxC[0] ;
         n6310Lb_TaAuxC = T011P13_n6310Lb_TaAuxC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6310Lb_TaAuxC", A6310Lb_TaAuxC);
         Z396EmprCod = A396EmprCod ;
         Z486ForNumCol = A486ForNumCol ;
         sMode32 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load11P32( ) ;
         if ( AnyError == 1 )
         {
            RcdFound32 = (short)(0) ;
            initializeNonKey11P32( ) ;
         }
         Gx_mode = sMode32 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound32 = (short)(0) ;
         initializeNonKey11P32( ) ;
         sMode32 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode32 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(6);
   }

   public void getEqualNoModal( )
   {
      getKey11P32( ) ;
      if ( RcdFound32 == 0 )
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
      RcdFound32 = (short)(0) ;
      /* Using cursor T011P35 */
      pr_default.execute(19, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A486ForNumCol)});
      if ( (pr_default.getStatus(19) != 101) )
      {
         while ( (pr_default.getStatus(19) != 101) && ( ( GXutil.strcmp(T011P35_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T011P35_A396EmprCod[0], A396EmprCod) == 0 ) && ( T011P35_A486ForNumCol[0] < A486ForNumCol ) ) )
         {
            pr_default.readNext(19);
         }
         if ( (pr_default.getStatus(19) != 101) && ( ( GXutil.strcmp(T011P35_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T011P35_A396EmprCod[0], A396EmprCod) == 0 ) && ( T011P35_A486ForNumCol[0] > A486ForNumCol ) ) )
         {
            A396EmprCod = T011P35_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A486ForNumCol = T011P35_A486ForNumCol[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A486ForNumCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A486ForNumCol), 8, 0));
            RcdFound32 = (short)(1) ;
         }
      }
      pr_default.close(19);
   }

   public void move_previous( )
   {
      RcdFound32 = (short)(0) ;
      /* Using cursor T011P36 */
      pr_default.execute(20, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A486ForNumCol)});
      if ( (pr_default.getStatus(20) != 101) )
      {
         while ( (pr_default.getStatus(20) != 101) && ( ( GXutil.strcmp(T011P36_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T011P36_A396EmprCod[0], A396EmprCod) == 0 ) && ( T011P36_A486ForNumCol[0] > A486ForNumCol ) ) )
         {
            pr_default.readNext(20);
         }
         if ( (pr_default.getStatus(20) != 101) && ( ( GXutil.strcmp(T011P36_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T011P36_A396EmprCod[0], A396EmprCod) == 0 ) && ( T011P36_A486ForNumCol[0] < A486ForNumCol ) ) )
         {
            A396EmprCod = T011P36_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A486ForNumCol = T011P36_A486ForNumCol[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A486ForNumCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A486ForNumCol), 8, 0));
            RcdFound32 = (short)(1) ;
         }
      }
      pr_default.close(20);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey11P32( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A5166CosKgmF = O5166CosKgmF ;
         n5166CosKgmF = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5166CosKgmF", GXutil.ltrimstr( A5166CosKgmF, 13, 5));
         A5361ForCanSum = O5361ForCanSum ;
         n5361ForCanSum = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5361ForCanSum", GXutil.ltrimstr( A5361ForCanSum, 11, 5));
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert11P32( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound32 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A486ForNumCol != Z486ForNumCol ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A486ForNumCol = Z486ForNumCol ;
               httpContext.ajax_rsp_assign_attri("", false, "A486ForNumCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A486ForNumCol), 8, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               A5166CosKgmF = O5166CosKgmF ;
               n5166CosKgmF = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A5166CosKgmF", GXutil.ltrimstr( A5166CosKgmF, 13, 5));
               A5361ForCanSum = O5361ForCanSum ;
               n5361ForCanSum = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A5361ForCanSum", GXutil.ltrimstr( A5361ForCanSum, 11, 5));
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
               A5166CosKgmF = O5166CosKgmF ;
               n5166CosKgmF = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A5166CosKgmF", GXutil.ltrimstr( A5166CosKgmF, 13, 5));
               A5361ForCanSum = O5361ForCanSum ;
               n5361ForCanSum = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A5361ForCanSum", GXutil.ltrimstr( A5361ForCanSum, 11, 5));
               update11P32( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A486ForNumCol != Z486ForNumCol ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               A5166CosKgmF = O5166CosKgmF ;
               n5166CosKgmF = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A5166CosKgmF", GXutil.ltrimstr( A5166CosKgmF, 13, 5));
               A5361ForCanSum = O5361ForCanSum ;
               n5361ForCanSum = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A5361ForCanSum", GXutil.ltrimstr( A5361ForCanSum, 11, 5));
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert11P32( ) ;
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
                  A5166CosKgmF = O5166CosKgmF ;
                  n5166CosKgmF = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A5166CosKgmF", GXutil.ltrimstr( A5166CosKgmF, 13, 5));
                  A5361ForCanSum = O5361ForCanSum ;
                  n5361ForCanSum = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A5361ForCanSum", GXutil.ltrimstr( A5361ForCanSum, 11, 5));
                  GX_FocusControl = edtEmprCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert11P32( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A486ForNumCol != Z486ForNumCol ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A486ForNumCol = Z486ForNumCol ;
         httpContext.ajax_rsp_assign_attri("", false, "A486ForNumCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A486ForNumCol), 8, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         A5166CosKgmF = O5166CosKgmF ;
         n5166CosKgmF = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5166CosKgmF", GXutil.ltrimstr( A5166CosKgmF, 13, 5));
         A5361ForCanSum = O5361ForCanSum ;
         n5361ForCanSum = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5361ForCanSum", GXutil.ltrimstr( A5361ForCanSum, 11, 5));
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
      if ( RcdFound32 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtColUltLin_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart11P32( ) ;
      if ( RcdFound32 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtColUltLin_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd11P32( ) ;
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
      if ( RcdFound32 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtColUltLin_Internalname ;
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
      if ( RcdFound32 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtColUltLin_Internalname ;
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
      scanStart11P32( ) ;
      if ( RcdFound32 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound32 != 0 )
         {
            scanNext11P32( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtColUltLin_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd11P32( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency11P32( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T011P12 */
         pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A486ForNumCol)});
         if ( (pr_default.getStatus(5) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCDFORM"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(5) == 101) || ( Z310ColUltLin != T011P12_A310ColUltLin[0] ) || ( Z315ContNum != T011P12_A315ContNum[0] ) || ( DecimalUtil.compareTo(Z318CosKgm, T011P12_A318CosKgm[0]) != 0 ) || ( Z6369Lb_fam1 != T011P12_A6369Lb_fam1[0] ) || ( Z6370Lb_fam2 != T011P12_A6370Lb_fam2[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z6371Lb_fam3 != T011P12_A6371Lb_fam3[0] ) || ( GXutil.strcmp(Z6310Lb_TaAuxC, T011P12_A6310Lb_TaAuxC[0]) != 0 ) )
         {
            if ( Z310ColUltLin != T011P12_A310ColUltLin[0] )
            {
               GXutil.writeLogln("tdforma:[seudo value changed for attri]"+"ColUltLin");
               GXutil.writeLogRaw("Old: ",Z310ColUltLin);
               GXutil.writeLogRaw("Current: ",T011P12_A310ColUltLin[0]);
            }
            if ( Z315ContNum != T011P12_A315ContNum[0] )
            {
               GXutil.writeLogln("tdforma:[seudo value changed for attri]"+"ContNum");
               GXutil.writeLogRaw("Old: ",Z315ContNum);
               GXutil.writeLogRaw("Current: ",T011P12_A315ContNum[0]);
            }
            if ( DecimalUtil.compareTo(Z318CosKgm, T011P12_A318CosKgm[0]) != 0 )
            {
               GXutil.writeLogln("tdforma:[seudo value changed for attri]"+"CosKgm");
               GXutil.writeLogRaw("Old: ",Z318CosKgm);
               GXutil.writeLogRaw("Current: ",T011P12_A318CosKgm[0]);
            }
            if ( Z6369Lb_fam1 != T011P12_A6369Lb_fam1[0] )
            {
               GXutil.writeLogln("tdforma:[seudo value changed for attri]"+"Lb_fam1");
               GXutil.writeLogRaw("Old: ",Z6369Lb_fam1);
               GXutil.writeLogRaw("Current: ",T011P12_A6369Lb_fam1[0]);
            }
            if ( Z6370Lb_fam2 != T011P12_A6370Lb_fam2[0] )
            {
               GXutil.writeLogln("tdforma:[seudo value changed for attri]"+"Lb_fam2");
               GXutil.writeLogRaw("Old: ",Z6370Lb_fam2);
               GXutil.writeLogRaw("Current: ",T011P12_A6370Lb_fam2[0]);
            }
            if ( Z6371Lb_fam3 != T011P12_A6371Lb_fam3[0] )
            {
               GXutil.writeLogln("tdforma:[seudo value changed for attri]"+"Lb_fam3");
               GXutil.writeLogRaw("Old: ",Z6371Lb_fam3);
               GXutil.writeLogRaw("Current: ",T011P12_A6371Lb_fam3[0]);
            }
            if ( GXutil.strcmp(Z6310Lb_TaAuxC, T011P12_A6310Lb_TaAuxC[0]) != 0 )
            {
               GXutil.writeLogln("tdforma:[seudo value changed for attri]"+"Lb_TaAuxC");
               GXutil.writeLogRaw("Old: ",Z6310Lb_TaAuxC);
               GXutil.writeLogRaw("Current: ",T011P12_A6310Lb_TaAuxC[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCDFORM"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert11P32( )
   {
      beforeValidate11P32( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable11P32( ) ;
      }
      if ( AnyError == 0 )
      {
         zm11P32( 0) ;
         checkOptimisticConcurrency11P32( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm11P32( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert11P32( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T011P37 */
                  pr_default.execute(21, new Object[] {Integer.valueOf(A486ForNumCol), Short.valueOf(A310ColUltLin), Integer.valueOf(A315ContNum), A318CosKgm, Byte.valueOf(A6369Lb_fam1), Byte.valueOf(A6370Lb_fam2), Byte.valueOf(A6371Lb_fam3), A396EmprCod, Boolean.valueOf(n6310Lb_TaAuxC), A6310Lb_TaAuxC});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCDFORM");
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
                        processLevel11P32( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption11P0( ) ;
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
            load11P32( ) ;
         }
         endLevel11P32( ) ;
      }
      closeExtendedTableCursors11P32( ) ;
   }

   public void update11P32( )
   {
      beforeValidate11P32( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable11P32( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency11P32( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm11P32( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate11P32( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T011P38 */
                  pr_default.execute(22, new Object[] {Short.valueOf(A310ColUltLin), Integer.valueOf(A315ContNum), A318CosKgm, Byte.valueOf(A6369Lb_fam1), Byte.valueOf(A6370Lb_fam2), Byte.valueOf(A6371Lb_fam3), Boolean.valueOf(n6310Lb_TaAuxC), A6310Lb_TaAuxC, A396EmprCod, Integer.valueOf(A486ForNumCol)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCDFORM");
                  if ( (pr_default.getStatus(22) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCDFORM"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate11P32( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel11P32( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption11P0( ) ;
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
         endLevel11P32( ) ;
      }
      closeExtendedTableCursors11P32( ) ;
   }

   public void deferredUpdate11P32( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate11P32( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency11P32( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls11P32( ) ;
         afterConfirm11P32( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete11P32( ) ;
            if ( AnyError == 0 )
            {
               A5166CosKgmF = O5166CosKgmF ;
               n5166CosKgmF = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A5166CosKgmF", GXutil.ltrimstr( A5166CosKgmF, 13, 5));
               A5361ForCanSum = O5361ForCanSum ;
               n5361ForCanSum = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A5361ForCanSum", GXutil.ltrimstr( A5361ForCanSum, 11, 5));
               scanStart11P33( ) ;
               while ( RcdFound33 != 0 )
               {
                  getByPrimaryKey11P33( ) ;
                  delete11P33( ) ;
                  scanNext11P33( ) ;
                  O5166CosKgmF = A5166CosKgmF ;
                  n5166CosKgmF = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A5166CosKgmF", GXutil.ltrimstr( A5166CosKgmF, 13, 5));
                  O5361ForCanSum = A5361ForCanSum ;
                  n5361ForCanSum = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A5361ForCanSum", GXutil.ltrimstr( A5361ForCanSum, 11, 5));
               }
               scanEnd11P33( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T011P39 */
                  pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A486ForNumCol)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCDFORM");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound32 == 0 )
                        {
                           initAll11P32( ) ;
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
                        resetCaption11P0( ) ;
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
      sMode32 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel11P32( ) ;
      Gx_mode = sMode32 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls11P32( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T011P40 */
         pr_default.execute(24, new Object[] {A396EmprCod});
         A407EmprNom = T011P40_A407EmprNom[0] ;
         n407EmprNom = T011P40_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A3915EmpNumDec = T011P40_A3915EmpNumDec[0] ;
         n3915EmpNumDec = T011P40_n3915EmpNumDec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3915EmpNumDec", GXutil.str( A3915EmpNumDec, 1, 0));
         pr_default.close(24);
         /* Using cursor T011P42 */
         pr_default.execute(25, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(25) != 101) )
         {
            A7259PrdHorMax = T011P42_A7259PrdHorMax[0] ;
            n7259PrdHorMax = T011P42_n7259PrdHorMax[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A7259PrdHorMax", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7259PrdHorMax), 2, 0));
         }
         else
         {
            A7259PrdHorMax = (byte)(0) ;
            n7259PrdHorMax = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A7259PrdHorMax", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7259PrdHorMax), 2, 0));
         }
         pr_default.close(25);
         A6220EmprCodV3 = A396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A6220EmprCodV3", A6220EmprCodV3);
         /* Using cursor T011P44 */
         pr_default.execute(26, new Object[] {A396EmprCod, Integer.valueOf(A486ForNumCol)});
         if ( (pr_default.getStatus(26) != 101) )
         {
            A5166CosKgmF = T011P44_A5166CosKgmF[0] ;
            n5166CosKgmF = T011P44_n5166CosKgmF[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A5166CosKgmF", GXutil.ltrimstr( A5166CosKgmF, 13, 5));
         }
         else
         {
            A5166CosKgmF = DecimalUtil.doubleToDec(0) ;
            n5166CosKgmF = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5166CosKgmF", GXutil.ltrimstr( A5166CosKgmF, 13, 5));
         }
         pr_default.close(26);
         /* Using cursor T011P46 */
         pr_default.execute(27, new Object[] {A396EmprCod, Integer.valueOf(A486ForNumCol)});
         if ( (pr_default.getStatus(27) != 101) )
         {
            A5361ForCanSum = T011P46_A5361ForCanSum[0] ;
            n5361ForCanSum = T011P46_n5361ForCanSum[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A5361ForCanSum", GXutil.ltrimstr( A5361ForCanSum, 11, 5));
         }
         else
         {
            A5361ForCanSum = DecimalUtil.doubleToDec(0) ;
            n5361ForCanSum = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5361ForCanSum", GXutil.ltrimstr( A5361ForCanSum, 11, 5));
         }
         pr_default.close(27);
         A6221ForNumColV = A486ForNumCol ;
         httpContext.ajax_rsp_assign_attri("", false, "A6221ForNumColV", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6221ForNumColV), 8, 0));
         /* Using cursor T011P47 */
         pr_default.execute(28, new Object[] {A396EmprCod, Boolean.valueOf(n6310Lb_TaAuxC), A6310Lb_TaAuxC});
         A6311Lb_TaAuxD = T011P47_A6311Lb_TaAuxD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6311Lb_TaAuxD", A6311Lb_TaAuxD);
         pr_default.close(28);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T011P48 */
         pr_default.execute(29, new Object[] {A396EmprCod, Integer.valueOf(A486ForNumCol)});
         if ( (pr_default.getStatus(29) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LPRFOR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(29);
         /* Using cursor T011P49 */
         pr_default.execute(30, new Object[] {A396EmprCod, Integer.valueOf(A486ForNumCol)});
         if ( (pr_default.getStatus(30) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CFORMU", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(30);
      }
   }

   public void processNestedLevel11P33( )
   {
      s5166CosKgmF = O5166CosKgmF ;
      n5166CosKgmF = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5166CosKgmF", GXutil.ltrimstr( A5166CosKgmF, 13, 5));
      s5361ForCanSum = O5361ForCanSum ;
      n5361ForCanSum = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5361ForCanSum", GXutil.ltrimstr( A5361ForCanSum, 11, 5));
      nGXsfl_123_idx = 0 ;
      while ( nGXsfl_123_idx < nRC_GXsfl_123 )
      {
         readRow11P33( ) ;
         if ( ( nRcdExists_33 != 0 ) || ( nIsMod_33 != 0 ) )
         {
            standaloneNotModal11P33( ) ;
            getKey11P33( ) ;
            if ( ( nRcdExists_33 == 0 ) && ( nRcdDeleted_33 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert11P33( ) ;
            }
            else
            {
               if ( RcdFound33 != 0 )
               {
                  if ( ( nRcdDeleted_33 != 0 ) && ( nRcdExists_33 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete11P33( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_33 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update11P33( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_33 == 0 )
                  {
                     GXCCtl = "COLLIN_" + sGXsfl_123_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtColLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O5166CosKgmF = A5166CosKgmF ;
            n5166CosKgmF = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5166CosKgmF", GXutil.ltrimstr( A5166CosKgmF, 13, 5));
            O5361ForCanSum = A5361ForCanSum ;
            n5361ForCanSum = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5361ForCanSum", GXutil.ltrimstr( A5361ForCanSum, 11, 5));
         }
         httpContext.changePostValue( edtColLin_Internalname, GXutil.ltrim( localUtil.ntoc( A309ColLin, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPrdNum_Internalname, GXutil.rtrim( A719PrdNum)) ;
         httpContext.changePostValue( edtPrdNom_Internalname, GXutil.rtrim( A718PrdNom)) ;
         httpContext.changePostValue( edtValCod_Internalname, GXutil.ltrim( localUtil.ntoc( A856ValCod, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPrdPreAct_Internalname, GXutil.ltrim( localUtil.ntoc( A724PrdPreAct, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtForPrdUMe_Internalname, GXutil.ltrim( localUtil.ntoc( A490ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtForPrdDsc_Internalname, GXutil.rtrim( A488ForPrdDsc)) ;
         httpContext.changePostValue( edtForCan_Internalname, GXutil.ltrim( localUtil.ntoc( A481ForCan, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtTotLinCol_Internalname, GXutil.ltrim( localUtil.ntoc( A838TotLinCol, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPrdUMeFo_Internalname, GXutil.ltrim( localUtil.ntoc( A4338PrdUMeFo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtTotLinCoF_Internalname, GXutil.ltrim( localUtil.ntoc( A5167TotLinCoF, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtForClaCol_Internalname, GXutil.rtrim( A6193ForClaCol)) ;
         httpContext.changePostValue( edtColLinV_Internalname, GXutil.ltrim( localUtil.ntoc( A6222ColLinV, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPrdNumMax_Internalname, GXutil.rtrim( A6223PrdNumMax)) ;
         httpContext.changePostValue( edtPrdHorMad_Internalname, GXutil.ltrim( localUtil.ntoc( A7260PrdHorMad, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z309ColLin_"+sGXsfl_123_idx, GXutil.ltrim( localUtil.ntoc( Z309ColLin, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z481ForCan_"+sGXsfl_123_idx, GXutil.ltrim( localUtil.ntoc( Z481ForCan, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z838TotLinCol_"+sGXsfl_123_idx, GXutil.ltrim( localUtil.ntoc( Z838TotLinCol, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6193ForClaCol_"+sGXsfl_123_idx, GXutil.rtrim( Z6193ForClaCol)) ;
         httpContext.changePostValue( "ZT_"+"Z719PrdNum_"+sGXsfl_123_idx, GXutil.rtrim( Z719PrdNum)) ;
         httpContext.changePostValue( "ZT_"+"Z490ForPrdUMe_"+sGXsfl_123_idx, GXutil.ltrim( localUtil.ntoc( Z490ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T5167TotLinCoF_"+sGXsfl_123_idx, GXutil.ltrim( localUtil.ntoc( O5167TotLinCoF, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T481ForCan_"+sGXsfl_123_idx, GXutil.ltrim( localUtil.ntoc( O481ForCan, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_33_"+sGXsfl_123_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_33, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_33_"+sGXsfl_123_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_33, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_33_"+sGXsfl_123_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_33, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_33 != 0 )
         {
            httpContext.changePostValue( "COLLIN_"+sGXsfl_123_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtColLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDNUM_"+sGXsfl_123_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNum_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDNOM_"+sGXsfl_123_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNom_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "VALCOD_"+sGXsfl_123_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtValCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDPREACT_"+sGXsfl_123_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdPreAct_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FORPRDUME_"+sGXsfl_123_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForPrdUMe_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FORPRDDSC_"+sGXsfl_123_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForPrdDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FORCAN_"+sGXsfl_123_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForCan_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TOTLINCOL_"+sGXsfl_123_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTotLinCol_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDUMEFO_"+sGXsfl_123_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdUMeFo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TOTLINCOF_"+sGXsfl_123_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTotLinCoF_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FORCLACOL_"+sGXsfl_123_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForClaCol_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "COLLINV_"+sGXsfl_123_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtColLinV_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDNUMMAX_"+sGXsfl_123_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNumMax_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDHORMAD_"+sGXsfl_123_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdHorMad_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll11P33( ) ;
      if ( AnyError != 0 )
      {
         O5166CosKgmF = s5166CosKgmF ;
         n5166CosKgmF = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5166CosKgmF", GXutil.ltrimstr( A5166CosKgmF, 13, 5));
         O5361ForCanSum = s5361ForCanSum ;
         n5361ForCanSum = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5361ForCanSum", GXutil.ltrimstr( A5361ForCanSum, 11, 5));
      }
      nRcdExists_33 = (short)(0) ;
      nIsMod_33 = (short)(0) ;
      nRcdDeleted_33 = (short)(0) ;
   }

   public void processLevel11P32( )
   {
      /* Save parent mode. */
      sMode32 = Gx_mode ;
      processNestedLevel11P33( ) ;
      if ( AnyError != 0 )
      {
         O5166CosKgmF = s5166CosKgmF ;
         n5166CosKgmF = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5166CosKgmF", GXutil.ltrimstr( A5166CosKgmF, 13, 5));
         O5361ForCanSum = s5361ForCanSum ;
         n5361ForCanSum = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5361ForCanSum", GXutil.ltrimstr( A5361ForCanSum, 11, 5));
      }
      /* Restore parent mode. */
      Gx_mode = sMode32 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel11P32( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(5);
      }
      if ( AnyError == 0 )
      {
         beforeComplete11P32( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tdforma");
         if ( AnyError == 0 )
         {
            confirmValues11P0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tdforma");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart11P32( )
   {
      /* Using cursor T011P50 */
      pr_default.execute(31);
      RcdFound32 = (short)(0) ;
      if ( (pr_default.getStatus(31) != 101) )
      {
         RcdFound32 = (short)(1) ;
         A396EmprCod = T011P50_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A486ForNumCol = T011P50_A486ForNumCol[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A486ForNumCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A486ForNumCol), 8, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext11P32( )
   {
      /* Scan next routine */
      pr_default.readNext(31);
      RcdFound32 = (short)(0) ;
      if ( (pr_default.getStatus(31) != 101) )
      {
         RcdFound32 = (short)(1) ;
         A396EmprCod = T011P50_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A486ForNumCol = T011P50_A486ForNumCol[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A486ForNumCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A486ForNumCol), 8, 0));
      }
   }

   public void scanEnd11P32( )
   {
      pr_default.close(31);
   }

   public void afterConfirm11P32( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert11P32( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate11P32( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete11P32( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete11P32( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate11P32( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes11P32( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtForNumCol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForNumCol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForNumCol_Enabled), 5, 0), true);
      edtColUltLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtColUltLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtColUltLin_Enabled), 5, 0), true);
      edtContNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtContNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtContNum_Enabled), 5, 0), true);
      edtCosKgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCosKgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCosKgm_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtEmpNumDec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmpNumDec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmpNumDec_Enabled), 5, 0), true);
      edtCosKgmF_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCosKgmF_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCosKgmF_Enabled), 5, 0), true);
      edtForCanSum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForCanSum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForCanSum_Enabled), 5, 0), true);
      edtEmprCodV3_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCodV3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCodV3_Enabled), 5, 0), true);
      edtForNumColV_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForNumColV_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForNumColV_Enabled), 5, 0), true);
      edtLb_TaAuxC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_TaAuxC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_TaAuxC_Enabled), 5, 0), true);
      edtLb_TaAuxD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_TaAuxD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_TaAuxD_Enabled), 5, 0), true);
      edtLb_fam1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_fam1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_fam1_Enabled), 5, 0), true);
      edtLb_fam2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_fam2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_fam2_Enabled), 5, 0), true);
      edtLb_fam3_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_fam3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_fam3_Enabled), 5, 0), true);
      edtPrdHorMax_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdHorMax_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdHorMax_Enabled), 5, 0), true);
   }

   public void zm11P33( int GX_JID )
   {
      if ( ( GX_JID == 14 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z481ForCan = T011P3_A481ForCan[0] ;
            Z838TotLinCol = T011P3_A838TotLinCol[0] ;
            Z6193ForClaCol = T011P3_A6193ForClaCol[0] ;
            Z719PrdNum = T011P3_A719PrdNum[0] ;
            Z490ForPrdUMe = T011P3_A490ForPrdUMe[0] ;
         }
         else
         {
            Z481ForCan = A481ForCan ;
            Z838TotLinCol = A838TotLinCol ;
            Z6193ForClaCol = A6193ForClaCol ;
            Z719PrdNum = A719PrdNum ;
            Z490ForPrdUMe = A490ForPrdUMe ;
         }
      }
      if ( GX_JID == -14 )
      {
         Z486ForNumCol = A486ForNumCol ;
         Z309ColLin = A309ColLin ;
         Z481ForCan = A481ForCan ;
         Z838TotLinCol = A838TotLinCol ;
         Z6193ForClaCol = A6193ForClaCol ;
         Z396EmprCod = A396EmprCod ;
         Z719PrdNum = A719PrdNum ;
         Z490ForPrdUMe = A490ForPrdUMe ;
         Z718PrdNom = A718PrdNom ;
         Z724PrdPreAct = A724PrdPreAct ;
         Z4338PrdUMeFo = A4338PrdUMeFo ;
         Z7260PrdHorMad = A7260PrdHorMad ;
         Z707PrdFacCon = A707PrdFacCon ;
         Z856ValCod = A856ValCod ;
         Z488ForPrdDsc = A488ForPrdDsc ;
      }
   }

   public void standaloneNotModal11P33( )
   {
   }

   public void standaloneModal11P33( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtColLin_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtColLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtColLin_Enabled), 5, 0), !bGXsfl_123_Refreshing);
      }
      else
      {
         edtColLin_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtColLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtColLin_Enabled), 5, 0), !bGXsfl_123_Refreshing);
      }
   }

   public void load11P33( )
   {
      /* Using cursor T011P51 */
      pr_default.execute(32, new Object[] {A396EmprCod, Integer.valueOf(A486ForNumCol), Short.valueOf(A309ColLin)});
      if ( (pr_default.getStatus(32) != 101) )
      {
         RcdFound33 = (short)(1) ;
         A718PrdNom = T011P51_A718PrdNom[0] ;
         A724PrdPreAct = T011P51_A724PrdPreAct[0] ;
         A488ForPrdDsc = T011P51_A488ForPrdDsc[0] ;
         n488ForPrdDsc = T011P51_n488ForPrdDsc[0] ;
         A481ForCan = T011P51_A481ForCan[0] ;
         A838TotLinCol = T011P51_A838TotLinCol[0] ;
         A4338PrdUMeFo = T011P51_A4338PrdUMeFo[0] ;
         A6193ForClaCol = T011P51_A6193ForClaCol[0] ;
         A7260PrdHorMad = T011P51_A7260PrdHorMad[0] ;
         A707PrdFacCon = T011P51_A707PrdFacCon[0] ;
         A719PrdNum = T011P51_A719PrdNum[0] ;
         A490ForPrdUMe = T011P51_A490ForPrdUMe[0] ;
         A856ValCod = T011P51_A856ValCod[0] ;
         zm11P33( -14) ;
      }
      pr_default.close(32);
      onLoadActions11P33( ) ;
   }

   public void onLoadActions11P33( )
   {
      A5167TotLinCoF = (DecimalUtil.doubleToDec(A315ContNum).multiply(A481ForCan).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN)).multiply(A724PrdPreAct).multiply(A707PrdFacCon) ;
      O5167TotLinCoF = A5167TotLinCoF ;
      if ( isIns( )  )
      {
         A5166CosKgmF = O5166CosKgmF.add(A5167TotLinCoF) ;
         n5166CosKgmF = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5166CosKgmF", GXutil.ltrimstr( A5166CosKgmF, 13, 5));
      }
      else
      {
         if ( isUpd( )  )
         {
            A5166CosKgmF = O5166CosKgmF.add(A5167TotLinCoF).subtract(O5167TotLinCoF) ;
            n5166CosKgmF = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5166CosKgmF", GXutil.ltrimstr( A5166CosKgmF, 13, 5));
         }
         else
         {
            if ( isDlt( )  )
            {
               A5166CosKgmF = O5166CosKgmF.subtract(O5167TotLinCoF) ;
               n5166CosKgmF = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A5166CosKgmF", GXutil.ltrimstr( A5166CosKgmF, 13, 5));
            }
         }
      }
      A6222ColLinV = A309ColLin ;
      /* Using cursor T011P9 */
      pr_default.execute(2, new Object[] {Short.valueOf(A6222ColLinV), A6220EmprCodV3, Integer.valueOf(A6221ForNumColV), A6220EmprCodV3, Integer.valueOf(A6221ForNumColV), Short.valueOf(A6222ColLinV), A6220EmprCodV3, Integer.valueOf(A6221ForNumColV), Short.valueOf(A6222ColLinV), A6220EmprCodV3, Integer.valueOf(A6221ForNumColV)});
      if ( (pr_default.getStatus(2) != 101) )
      {
         A6223PrdNumMax = T011P9_A6223PrdNumMax[0] ;
         n6223PrdNumMax = T011P9_n6223PrdNumMax[0] ;
      }
      else
      {
         A6223PrdNumMax = "" ;
         n6223PrdNumMax = false ;
      }
      pr_default.close(2);
      if ( isIns( )  )
      {
         A5361ForCanSum = O5361ForCanSum.add(A481ForCan) ;
         n5361ForCanSum = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5361ForCanSum", GXutil.ltrimstr( A5361ForCanSum, 11, 5));
      }
      else
      {
         if ( isUpd( )  )
         {
            A5361ForCanSum = O5361ForCanSum.add(A481ForCan).subtract(O481ForCan) ;
            n5361ForCanSum = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5361ForCanSum", GXutil.ltrimstr( A5361ForCanSum, 11, 5));
         }
         else
         {
            if ( isDlt( )  )
            {
               A5361ForCanSum = O5361ForCanSum.subtract(O481ForCan) ;
               n5361ForCanSum = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A5361ForCanSum", GXutil.ltrimstr( A5361ForCanSum, 11, 5));
            }
         }
      }
   }

   public void checkExtendedTable11P33( )
   {
      nIsDirty_33 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal11P33( ) ;
      /* Using cursor T011P10 */
      pr_default.execute(3, new Object[] {A396EmprCod, A719PrdNum});
      if ( (pr_default.getStatus(3) == 101) )
      {
         GXCCtl = "PRDNUM_" + sGXsfl_123_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A718PrdNom = T011P10_A718PrdNom[0] ;
      A724PrdPreAct = T011P10_A724PrdPreAct[0] ;
      A4338PrdUMeFo = T011P10_A4338PrdUMeFo[0] ;
      A7260PrdHorMad = T011P10_A7260PrdHorMad[0] ;
      A707PrdFacCon = T011P10_A707PrdFacCon[0] ;
      A856ValCod = T011P10_A856ValCod[0] ;
      pr_default.close(3);
      /* Using cursor T011P11 */
      pr_default.execute(4, new Object[] {A396EmprCod, Byte.valueOf(A490ForPrdUMe)});
      if ( (pr_default.getStatus(4) == 101) )
      {
         GXCCtl = "FORPRDUME_" + sGXsfl_123_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "UNMEPR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtForPrdUMe_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A488ForPrdDsc = T011P11_A488ForPrdDsc[0] ;
      n488ForPrdDsc = T011P11_n488ForPrdDsc[0] ;
      pr_default.close(4);
      nIsDirty_33 = (short)(1) ;
      A5167TotLinCoF = (DecimalUtil.doubleToDec(A315ContNum).multiply(A481ForCan).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN)).multiply(A724PrdPreAct).multiply(A707PrdFacCon) ;
      if ( isIns( )  )
      {
         nIsDirty_33 = (short)(1) ;
         A5166CosKgmF = O5166CosKgmF.add(A5167TotLinCoF) ;
         n5166CosKgmF = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5166CosKgmF", GXutil.ltrimstr( A5166CosKgmF, 13, 5));
      }
      else
      {
         if ( isUpd( )  )
         {
            nIsDirty_33 = (short)(1) ;
            A5166CosKgmF = O5166CosKgmF.add(A5167TotLinCoF).subtract(O5167TotLinCoF) ;
            n5166CosKgmF = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5166CosKgmF", GXutil.ltrimstr( A5166CosKgmF, 13, 5));
         }
         else
         {
            if ( isDlt( )  )
            {
               nIsDirty_33 = (short)(1) ;
               A5166CosKgmF = O5166CosKgmF.subtract(O5167TotLinCoF) ;
               n5166CosKgmF = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A5166CosKgmF", GXutil.ltrimstr( A5166CosKgmF, 13, 5));
            }
         }
      }
      nIsDirty_33 = (short)(1) ;
      A6222ColLinV = A309ColLin ;
      /* Using cursor T011P9 */
      pr_default.execute(2, new Object[] {Short.valueOf(A6222ColLinV), A6220EmprCodV3, Integer.valueOf(A6221ForNumColV), A6220EmprCodV3, Integer.valueOf(A6221ForNumColV), Short.valueOf(A6222ColLinV), A6220EmprCodV3, Integer.valueOf(A6221ForNumColV), Short.valueOf(A6222ColLinV), A6220EmprCodV3, Integer.valueOf(A6221ForNumColV)});
      if ( (pr_default.getStatus(2) != 101) )
      {
         A6223PrdNumMax = T011P9_A6223PrdNumMax[0] ;
         n6223PrdNumMax = T011P9_n6223PrdNumMax[0] ;
      }
      else
      {
         nIsDirty_33 = (short)(1) ;
         A6223PrdNumMax = "" ;
         n6223PrdNumMax = false ;
      }
      pr_default.close(2);
      if ( ! ( ( A490ForPrdUMe == 0 ) || ( A490ForPrdUMe == 1 ) || ( A490ForPrdUMe == 2 ) || ( A490ForPrdUMe == 3 ) ) )
      {
         GXCCtl = "FORPRDUME_" + sGXsfl_123_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Unidad Medida", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtForPrdUMe_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( isIns( )  )
      {
         nIsDirty_33 = (short)(1) ;
         A5361ForCanSum = O5361ForCanSum.add(A481ForCan) ;
         n5361ForCanSum = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5361ForCanSum", GXutil.ltrimstr( A5361ForCanSum, 11, 5));
      }
      else
      {
         if ( isUpd( )  )
         {
            nIsDirty_33 = (short)(1) ;
            A5361ForCanSum = O5361ForCanSum.add(A481ForCan).subtract(O481ForCan) ;
            n5361ForCanSum = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5361ForCanSum", GXutil.ltrimstr( A5361ForCanSum, 11, 5));
         }
         else
         {
            if ( isDlt( )  )
            {
               nIsDirty_33 = (short)(1) ;
               A5361ForCanSum = O5361ForCanSum.subtract(O481ForCan) ;
               n5361ForCanSum = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A5361ForCanSum", GXutil.ltrimstr( A5361ForCanSum, 11, 5));
            }
         }
      }
   }

   public void closeExtendedTableCursors11P33( )
   {
      pr_default.close(3);
      pr_default.close(4);
      pr_default.close(2);
   }

   public void enableDisable11P33( )
   {
   }

   public void gxload_16( String A396EmprCod ,
                          String A719PrdNum )
   {
      /* Using cursor T011P52 */
      pr_default.execute(33, new Object[] {A396EmprCod, A719PrdNum});
      if ( (pr_default.getStatus(33) == 101) )
      {
         GXCCtl = "PRDNUM_" + sGXsfl_123_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A718PrdNom = T011P52_A718PrdNom[0] ;
      A724PrdPreAct = T011P52_A724PrdPreAct[0] ;
      A4338PrdUMeFo = T011P52_A4338PrdUMeFo[0] ;
      A7260PrdHorMad = T011P52_A7260PrdHorMad[0] ;
      A707PrdFacCon = T011P52_A707PrdFacCon[0] ;
      A856ValCod = T011P52_A856ValCod[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A718PrdNom))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A724PrdPreAct, (byte)(14), (byte)(5), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A4338PrdUMeFo, (byte)(1), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A7260PrdHorMad, (byte)(2), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A707PrdFacCon, (byte)(7), (byte)(4), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A856ValCod, (byte)(1), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(33) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(33);
   }

   public void gxload_17( String A396EmprCod ,
                          byte A490ForPrdUMe )
   {
      /* Using cursor T011P53 */
      pr_default.execute(34, new Object[] {A396EmprCod, Byte.valueOf(A490ForPrdUMe)});
      if ( (pr_default.getStatus(34) == 101) )
      {
         GXCCtl = "FORPRDUME_" + sGXsfl_123_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "UNMEPR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtForPrdUMe_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A488ForPrdDsc = T011P53_A488ForPrdDsc[0] ;
      n488ForPrdDsc = T011P53_n488ForPrdDsc[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A488ForPrdDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(34) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(34);
   }

   public void gxload_15( String A396EmprCod ,
                          int A486ForNumCol ,
                          short A309ColLin ,
                          short A6222ColLinV ,
                          String A6220EmprCodV3 ,
                          int A6221ForNumColV )
   {
      /* Using cursor T011P59 */
      pr_default.execute(35, new Object[] {Short.valueOf(A6222ColLinV), A6220EmprCodV3, Integer.valueOf(A6221ForNumColV), A6220EmprCodV3, Integer.valueOf(A6221ForNumColV), Short.valueOf(A6222ColLinV), A6220EmprCodV3, Integer.valueOf(A6221ForNumColV), Short.valueOf(A6222ColLinV), A6220EmprCodV3, Integer.valueOf(A6221ForNumColV)});
      if ( (pr_default.getStatus(35) != 101) )
      {
         A6223PrdNumMax = T011P59_A6223PrdNumMax[0] ;
         n6223PrdNumMax = T011P59_n6223PrdNumMax[0] ;
      }
      else
      {
         A6223PrdNumMax = "" ;
         n6223PrdNumMax = false ;
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A6223PrdNumMax))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(35) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(35);
   }

   public void getKey11P33( )
   {
      /* Using cursor T011P60 */
      pr_default.execute(36, new Object[] {A396EmprCod, Integer.valueOf(A486ForNumCol), Short.valueOf(A309ColLin)});
      if ( (pr_default.getStatus(36) != 101) )
      {
         RcdFound33 = (short)(1) ;
      }
      else
      {
         RcdFound33 = (short)(0) ;
      }
      pr_default.close(36);
   }

   public void getByPrimaryKey11P33( )
   {
      /* Using cursor T011P3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A486ForNumCol), Short.valueOf(A309ColLin)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm11P33( 14) ;
         RcdFound33 = (short)(1) ;
         initializeNonKey11P33( ) ;
         A309ColLin = T011P3_A309ColLin[0] ;
         A481ForCan = T011P3_A481ForCan[0] ;
         A838TotLinCol = T011P3_A838TotLinCol[0] ;
         A6193ForClaCol = T011P3_A6193ForClaCol[0] ;
         A719PrdNum = T011P3_A719PrdNum[0] ;
         A490ForPrdUMe = T011P3_A490ForPrdUMe[0] ;
         O481ForCan = A481ForCan ;
         Z396EmprCod = A396EmprCod ;
         Z486ForNumCol = A486ForNumCol ;
         Z309ColLin = A309ColLin ;
         sMode33 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal11P33( ) ;
         load11P33( ) ;
         Gx_mode = sMode33 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound33 = (short)(0) ;
         initializeNonKey11P33( ) ;
         sMode33 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal11P33( ) ;
         Gx_mode = sMode33 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes11P33( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency11P33( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T011P2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A486ForNumCol), Short.valueOf(A309ColLin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLDFORM"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z481ForCan, T011P2_A481ForCan[0]) != 0 ) || ( DecimalUtil.compareTo(Z838TotLinCol, T011P2_A838TotLinCol[0]) != 0 ) || ( GXutil.strcmp(Z6193ForClaCol, T011P2_A6193ForClaCol[0]) != 0 ) || ( GXutil.strcmp(Z719PrdNum, T011P2_A719PrdNum[0]) != 0 ) || ( Z490ForPrdUMe != T011P2_A490ForPrdUMe[0] ) )
         {
            if ( DecimalUtil.compareTo(Z481ForCan, T011P2_A481ForCan[0]) != 0 )
            {
               GXutil.writeLogln("tdforma:[seudo value changed for attri]"+"ForCan");
               GXutil.writeLogRaw("Old: ",Z481ForCan);
               GXutil.writeLogRaw("Current: ",T011P2_A481ForCan[0]);
            }
            if ( DecimalUtil.compareTo(Z838TotLinCol, T011P2_A838TotLinCol[0]) != 0 )
            {
               GXutil.writeLogln("tdforma:[seudo value changed for attri]"+"TotLinCol");
               GXutil.writeLogRaw("Old: ",Z838TotLinCol);
               GXutil.writeLogRaw("Current: ",T011P2_A838TotLinCol[0]);
            }
            if ( GXutil.strcmp(Z6193ForClaCol, T011P2_A6193ForClaCol[0]) != 0 )
            {
               GXutil.writeLogln("tdforma:[seudo value changed for attri]"+"ForClaCol");
               GXutil.writeLogRaw("Old: ",Z6193ForClaCol);
               GXutil.writeLogRaw("Current: ",T011P2_A6193ForClaCol[0]);
            }
            if ( GXutil.strcmp(Z719PrdNum, T011P2_A719PrdNum[0]) != 0 )
            {
               GXutil.writeLogln("tdforma:[seudo value changed for attri]"+"PrdNum");
               GXutil.writeLogRaw("Old: ",Z719PrdNum);
               GXutil.writeLogRaw("Current: ",T011P2_A719PrdNum[0]);
            }
            if ( Z490ForPrdUMe != T011P2_A490ForPrdUMe[0] )
            {
               GXutil.writeLogln("tdforma:[seudo value changed for attri]"+"ForPrdUMe");
               GXutil.writeLogRaw("Old: ",Z490ForPrdUMe);
               GXutil.writeLogRaw("Current: ",T011P2_A490ForPrdUMe[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPLDFORM"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert11P33( )
   {
      beforeValidate11P33( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable11P33( ) ;
      }
      if ( AnyError == 0 )
      {
         zm11P33( 0) ;
         checkOptimisticConcurrency11P33( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm11P33( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert11P33( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T011P61 */
                  pr_default.execute(37, new Object[] {Integer.valueOf(A486ForNumCol), Short.valueOf(A309ColLin), A481ForCan, A838TotLinCol, A6193ForClaCol, A396EmprCod, A719PrdNum, Byte.valueOf(A490ForPrdUMe)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLDFORM");
                  if ( (pr_default.getStatus(37) == 1) )
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
            load11P33( ) ;
         }
         endLevel11P33( ) ;
      }
      closeExtendedTableCursors11P33( ) ;
   }

   public void update11P33( )
   {
      beforeValidate11P33( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable11P33( ) ;
      }
      if ( ( nIsMod_33 != 0 ) || ( nIsDirty_33 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency11P33( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm11P33( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate11P33( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T011P62 */
                     pr_default.execute(38, new Object[] {A481ForCan, A838TotLinCol, A6193ForClaCol, A719PrdNum, Byte.valueOf(A490ForPrdUMe), A396EmprCod, Integer.valueOf(A486ForNumCol), Short.valueOf(A309ColLin)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLDFORM");
                     if ( (pr_default.getStatus(38) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLDFORM"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate11P33( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey11P33( ) ;
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
            endLevel11P33( ) ;
         }
      }
      closeExtendedTableCursors11P33( ) ;
   }

   public void deferredUpdate11P33( )
   {
   }

   public void delete11P33( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate11P33( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency11P33( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls11P33( ) ;
         afterConfirm11P33( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete11P33( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T011P63 */
               pr_default.execute(39, new Object[] {A396EmprCod, Integer.valueOf(A486ForNumCol), Short.valueOf(A309ColLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLDFORM");
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
      sMode33 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel11P33( ) ;
      Gx_mode = sMode33 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls11P33( )
   {
      standaloneModal11P33( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         A6222ColLinV = A309ColLin ;
         /* Using cursor T011P69 */
         pr_default.execute(40, new Object[] {Short.valueOf(A6222ColLinV), A6220EmprCodV3, Integer.valueOf(A6221ForNumColV), A6220EmprCodV3, Integer.valueOf(A6221ForNumColV), Short.valueOf(A6222ColLinV), A6220EmprCodV3, Integer.valueOf(A6221ForNumColV), Short.valueOf(A6222ColLinV), A6220EmprCodV3, Integer.valueOf(A6221ForNumColV)});
         if ( (pr_default.getStatus(40) != 101) )
         {
            A6223PrdNumMax = T011P69_A6223PrdNumMax[0] ;
            n6223PrdNumMax = T011P69_n6223PrdNumMax[0] ;
         }
         else
         {
            A6223PrdNumMax = "" ;
            n6223PrdNumMax = false ;
         }
         pr_default.close(40);
         /* Using cursor T011P70 */
         pr_default.execute(41, new Object[] {A396EmprCod, A719PrdNum});
         A718PrdNom = T011P70_A718PrdNom[0] ;
         A724PrdPreAct = T011P70_A724PrdPreAct[0] ;
         A4338PrdUMeFo = T011P70_A4338PrdUMeFo[0] ;
         A7260PrdHorMad = T011P70_A7260PrdHorMad[0] ;
         A707PrdFacCon = T011P70_A707PrdFacCon[0] ;
         A856ValCod = T011P70_A856ValCod[0] ;
         pr_default.close(41);
         /* Using cursor T011P71 */
         pr_default.execute(42, new Object[] {A396EmprCod, Byte.valueOf(A490ForPrdUMe)});
         A488ForPrdDsc = T011P71_A488ForPrdDsc[0] ;
         n488ForPrdDsc = T011P71_n488ForPrdDsc[0] ;
         pr_default.close(42);
         A5167TotLinCoF = (DecimalUtil.doubleToDec(A315ContNum).multiply(A481ForCan).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN)).multiply(A724PrdPreAct).multiply(A707PrdFacCon) ;
         if ( isIns( )  )
         {
            A5166CosKgmF = O5166CosKgmF.add(A5167TotLinCoF) ;
            n5166CosKgmF = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5166CosKgmF", GXutil.ltrimstr( A5166CosKgmF, 13, 5));
         }
         else
         {
            if ( isUpd( )  )
            {
               A5166CosKgmF = O5166CosKgmF.add(A5167TotLinCoF).subtract(O5167TotLinCoF) ;
               n5166CosKgmF = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A5166CosKgmF", GXutil.ltrimstr( A5166CosKgmF, 13, 5));
            }
            else
            {
               if ( isDlt( )  )
               {
                  A5166CosKgmF = O5166CosKgmF.subtract(O5167TotLinCoF) ;
                  n5166CosKgmF = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A5166CosKgmF", GXutil.ltrimstr( A5166CosKgmF, 13, 5));
               }
            }
         }
         if ( isIns( )  )
         {
            A5361ForCanSum = O5361ForCanSum.add(A481ForCan) ;
            n5361ForCanSum = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5361ForCanSum", GXutil.ltrimstr( A5361ForCanSum, 11, 5));
         }
         else
         {
            if ( isUpd( )  )
            {
               A5361ForCanSum = O5361ForCanSum.add(A481ForCan).subtract(O481ForCan) ;
               n5361ForCanSum = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A5361ForCanSum", GXutil.ltrimstr( A5361ForCanSum, 11, 5));
            }
            else
            {
               if ( isDlt( )  )
               {
                  A5361ForCanSum = O5361ForCanSum.subtract(O481ForCan) ;
                  n5361ForCanSum = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A5361ForCanSum", GXutil.ltrimstr( A5361ForCanSum, 11, 5));
               }
            }
         }
      }
   }

   public void endLevel11P33( )
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

   public void scanStart11P33( )
   {
      /* Scan By routine */
      /* Using cursor T011P72 */
      pr_default.execute(43, new Object[] {A396EmprCod, Integer.valueOf(A486ForNumCol)});
      RcdFound33 = (short)(0) ;
      if ( (pr_default.getStatus(43) != 101) )
      {
         RcdFound33 = (short)(1) ;
         A309ColLin = T011P72_A309ColLin[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext11P33( )
   {
      /* Scan next routine */
      pr_default.readNext(43);
      RcdFound33 = (short)(0) ;
      if ( (pr_default.getStatus(43) != 101) )
      {
         RcdFound33 = (short)(1) ;
         A309ColLin = T011P72_A309ColLin[0] ;
      }
   }

   public void scanEnd11P33( )
   {
      pr_default.close(43);
   }

   public void afterConfirm11P33( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert11P33( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate11P33( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete11P33( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete11P33( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate11P33( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes11P33( )
   {
      edtColLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtColLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtColLin_Enabled), 5, 0), !bGXsfl_123_Refreshing);
      edtPrdNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Enabled), 5, 0), !bGXsfl_123_Refreshing);
      edtPrdNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNom_Enabled), 5, 0), !bGXsfl_123_Refreshing);
      edtValCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtValCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtValCod_Enabled), 5, 0), !bGXsfl_123_Refreshing);
      edtPrdPreAct_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdPreAct_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdPreAct_Enabled), 5, 0), !bGXsfl_123_Refreshing);
      edtForPrdUMe_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForPrdUMe_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForPrdUMe_Enabled), 5, 0), !bGXsfl_123_Refreshing);
      edtForPrdDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForPrdDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForPrdDsc_Enabled), 5, 0), !bGXsfl_123_Refreshing);
      edtForCan_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForCan_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForCan_Enabled), 5, 0), !bGXsfl_123_Refreshing);
      edtTotLinCol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTotLinCol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTotLinCol_Enabled), 5, 0), !bGXsfl_123_Refreshing);
      edtPrdUMeFo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdUMeFo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdUMeFo_Enabled), 5, 0), !bGXsfl_123_Refreshing);
      edtTotLinCoF_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTotLinCoF_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTotLinCoF_Enabled), 5, 0), !bGXsfl_123_Refreshing);
      edtForClaCol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForClaCol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForClaCol_Enabled), 5, 0), !bGXsfl_123_Refreshing);
      edtColLinV_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtColLinV_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtColLinV_Enabled), 5, 0), !bGXsfl_123_Refreshing);
      edtPrdNumMax_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNumMax_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNumMax_Enabled), 5, 0), !bGXsfl_123_Refreshing);
      edtPrdHorMad_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdHorMad_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdHorMad_Enabled), 5, 0), !bGXsfl_123_Refreshing);
   }

   public void send_integrity_lvl_hashes11P33( )
   {
   }

   public void send_integrity_lvl_hashes11P32( )
   {
   }

   public void subsflControlProps_12333( )
   {
      edtColLin_Internalname = "COLLIN_"+sGXsfl_123_idx ;
      edtPrdNum_Internalname = "PRDNUM_"+sGXsfl_123_idx ;
      edtPrdNom_Internalname = "PRDNOM_"+sGXsfl_123_idx ;
      edtValCod_Internalname = "VALCOD_"+sGXsfl_123_idx ;
      edtPrdPreAct_Internalname = "PRDPREACT_"+sGXsfl_123_idx ;
      edtForPrdUMe_Internalname = "FORPRDUME_"+sGXsfl_123_idx ;
      edtForPrdDsc_Internalname = "FORPRDDSC_"+sGXsfl_123_idx ;
      edtForCan_Internalname = "FORCAN_"+sGXsfl_123_idx ;
      edtTotLinCol_Internalname = "TOTLINCOL_"+sGXsfl_123_idx ;
      edtPrdUMeFo_Internalname = "PRDUMEFO_"+sGXsfl_123_idx ;
      edtTotLinCoF_Internalname = "TOTLINCOF_"+sGXsfl_123_idx ;
      edtForClaCol_Internalname = "FORCLACOL_"+sGXsfl_123_idx ;
      edtColLinV_Internalname = "COLLINV_"+sGXsfl_123_idx ;
      edtPrdNumMax_Internalname = "PRDNUMMAX_"+sGXsfl_123_idx ;
      edtPrdHorMad_Internalname = "PRDHORMAD_"+sGXsfl_123_idx ;
   }

   public void subsflControlProps_fel_12333( )
   {
      edtColLin_Internalname = "COLLIN_"+sGXsfl_123_fel_idx ;
      edtPrdNum_Internalname = "PRDNUM_"+sGXsfl_123_fel_idx ;
      edtPrdNom_Internalname = "PRDNOM_"+sGXsfl_123_fel_idx ;
      edtValCod_Internalname = "VALCOD_"+sGXsfl_123_fel_idx ;
      edtPrdPreAct_Internalname = "PRDPREACT_"+sGXsfl_123_fel_idx ;
      edtForPrdUMe_Internalname = "FORPRDUME_"+sGXsfl_123_fel_idx ;
      edtForPrdDsc_Internalname = "FORPRDDSC_"+sGXsfl_123_fel_idx ;
      edtForCan_Internalname = "FORCAN_"+sGXsfl_123_fel_idx ;
      edtTotLinCol_Internalname = "TOTLINCOL_"+sGXsfl_123_fel_idx ;
      edtPrdUMeFo_Internalname = "PRDUMEFO_"+sGXsfl_123_fel_idx ;
      edtTotLinCoF_Internalname = "TOTLINCOF_"+sGXsfl_123_fel_idx ;
      edtForClaCol_Internalname = "FORCLACOL_"+sGXsfl_123_fel_idx ;
      edtColLinV_Internalname = "COLLINV_"+sGXsfl_123_fel_idx ;
      edtPrdNumMax_Internalname = "PRDNUMMAX_"+sGXsfl_123_fel_idx ;
      edtPrdHorMad_Internalname = "PRDHORMAD_"+sGXsfl_123_fel_idx ;
   }

   public void addRow11P33( )
   {
      nGXsfl_123_idx = (int)(nGXsfl_123_idx+1) ;
      sGXsfl_123_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_123_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_12333( ) ;
      sendRow11P33( ) ;
   }

   public void sendRow11P33( )
   {
      Gridtdforma_level1itemRow = GXWebRow.GetNew(context) ;
      if ( subGridtdforma_level1item_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGridtdforma_level1item_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGridtdforma_level1item_Class, "") != 0 )
         {
            subGridtdforma_level1item_Linesclass = subGridtdforma_level1item_Class+"Odd" ;
         }
      }
      else if ( subGridtdforma_level1item_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGridtdforma_level1item_Backstyle = (byte)(0) ;
         subGridtdforma_level1item_Backcolor = subGridtdforma_level1item_Allbackcolor ;
         if ( GXutil.strcmp(subGridtdforma_level1item_Class, "") != 0 )
         {
            subGridtdforma_level1item_Linesclass = subGridtdforma_level1item_Class+"Uniform" ;
         }
      }
      else if ( subGridtdforma_level1item_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGridtdforma_level1item_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGridtdforma_level1item_Class, "") != 0 )
         {
            subGridtdforma_level1item_Linesclass = subGridtdforma_level1item_Class+"Odd" ;
         }
         subGridtdforma_level1item_Backcolor = (int)(0x0) ;
      }
      else if ( subGridtdforma_level1item_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGridtdforma_level1item_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_123_idx) % (2))) == 0 )
         {
            subGridtdforma_level1item_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridtdforma_level1item_Class, "") != 0 )
            {
               subGridtdforma_level1item_Linesclass = subGridtdforma_level1item_Class+"Even" ;
            }
         }
         else
         {
            subGridtdforma_level1item_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridtdforma_level1item_Class, "") != 0 )
            {
               subGridtdforma_level1item_Linesclass = subGridtdforma_level1item_Class+"Odd" ;
            }
         }
      }
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_33_" + sGXsfl_123_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 124,'',false,'" + sGXsfl_123_idx + "',123)\"" ;
      ROClassString = "Attribute" ;
      Gridtdforma_level1itemRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtColLin_Internalname,GXutil.ltrim( localUtil.ntoc( A309ColLin, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A309ColLin), "ZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,124);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtColLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtColLin_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(123),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_33_" + sGXsfl_123_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 125,'',false,'" + sGXsfl_123_idx + "',123)\"" ;
      ROClassString = "Attribute" ;
      Gridtdforma_level1itemRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdNum_Internalname,GXutil.rtrim( A719PrdNum),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,125);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPrdNum_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(123),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridtdforma_level1itemRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdNom_Internalname,GXutil.rtrim( A718PrdNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPrdNom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(123),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridtdforma_level1itemRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtValCod_Internalname,GXutil.ltrim( localUtil.ntoc( A856ValCod, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtValCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A856ValCod), "9") : localUtil.format( DecimalUtil.doubleToDec(A856ValCod), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtValCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtValCod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(123),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridtdforma_level1itemRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdPreAct_Internalname,GXutil.ltrim( localUtil.ntoc( A724PrdPreAct, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtPrdPreAct_Enabled!=0) ? localUtil.format( A724PrdPreAct, "ZZZZZZZ9.999") : localUtil.format( A724PrdPreAct, "ZZZZZZZ9.999"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdPreAct_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPrdPreAct_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(123),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_33_" + sGXsfl_123_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 129,'',false,'" + sGXsfl_123_idx + "',123)\"" ;
      ROClassString = "Attribute" ;
      Gridtdforma_level1itemRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForPrdUMe_Internalname,GXutil.ltrim( localUtil.ntoc( A490ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtForPrdUMe_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A490ForPrdUMe), "9") : localUtil.format( DecimalUtil.doubleToDec(A490ForPrdUMe), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,129);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtForPrdUMe_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtForPrdUMe_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(123),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridtdforma_level1itemRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForPrdDsc_Internalname,GXutil.rtrim( A488ForPrdDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtForPrdDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtForPrdDsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(123),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_33_" + sGXsfl_123_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 131,'',false,'" + sGXsfl_123_idx + "',123)\"" ;
      ROClassString = "Attribute" ;
      Gridtdforma_level1itemRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForCan_Internalname,GXutil.ltrim( localUtil.ntoc( A481ForCan, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtForCan_Enabled!=0) ? localUtil.format( A481ForCan, "ZZZZ9.99999") : localUtil.format( A481ForCan, "ZZZZ9.99999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,131);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtForCan_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtForCan_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(123),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_33_" + sGXsfl_123_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 132,'',false,'" + sGXsfl_123_idx + "',123)\"" ;
      ROClassString = "Attribute" ;
      Gridtdforma_level1itemRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTotLinCol_Internalname,GXutil.ltrim( localUtil.ntoc( A838TotLinCol, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtTotLinCol_Enabled!=0) ? localUtil.format( A838TotLinCol, "ZZZZZ9.99") : localUtil.format( A838TotLinCol, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,132);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTotLinCol_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtTotLinCol_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(123),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridtdforma_level1itemRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdUMeFo_Internalname,GXutil.ltrim( localUtil.ntoc( A4338PrdUMeFo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtPrdUMeFo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4338PrdUMeFo), "9") : localUtil.format( DecimalUtil.doubleToDec(A4338PrdUMeFo), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdUMeFo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPrdUMeFo_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(123),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridtdforma_level1itemRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTotLinCoF_Internalname,GXutil.ltrim( localUtil.ntoc( A5167TotLinCoF, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtTotLinCoF_Enabled!=0) ? localUtil.format( A5167TotLinCoF, "ZZZZZZ9.99999") : localUtil.format( A5167TotLinCoF, "ZZZZZZ9.99999"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTotLinCoF_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtTotLinCoF_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(123),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_33_" + sGXsfl_123_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 135,'',false,'" + sGXsfl_123_idx + "',123)\"" ;
      ROClassString = "Attribute" ;
      Gridtdforma_level1itemRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForClaCol_Internalname,GXutil.rtrim( A6193ForClaCol),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,135);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtForClaCol_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtForClaCol_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(123),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridtdforma_level1itemRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtColLinV_Internalname,GXutil.ltrim( localUtil.ntoc( A6222ColLinV, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtColLinV_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6222ColLinV), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6222ColLinV), "ZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtColLinV_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtColLinV_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(123),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridtdforma_level1itemRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdNumMax_Internalname,GXutil.rtrim( A6223PrdNumMax),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdNumMax_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPrdNumMax_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(123),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridtdforma_level1itemRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdHorMad_Internalname,GXutil.ltrim( localUtil.ntoc( A7260PrdHorMad, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtPrdHorMad_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A7260PrdHorMad), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A7260PrdHorMad), "Z9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdHorMad_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPrdHorMad_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(123),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Gridtdforma_level1itemRow);
      send_integrity_lvl_hashes11P33( ) ;
      GXCCtl = "Z309ColLin_" + sGXsfl_123_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z309ColLin, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z481ForCan_" + sGXsfl_123_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z481ForCan, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z838TotLinCol_" + sGXsfl_123_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z838TotLinCol, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z6193ForClaCol_" + sGXsfl_123_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z6193ForClaCol));
      GXCCtl = "Z719PrdNum_" + sGXsfl_123_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z719PrdNum));
      GXCCtl = "Z490ForPrdUMe_" + sGXsfl_123_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z490ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O5167TotLinCoF_" + sGXsfl_123_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O5167TotLinCoF, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O481ForCan_" + sGXsfl_123_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O481ForCan, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_33_" + sGXsfl_123_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_33, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_33_" + sGXsfl_123_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_33, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_33_" + sGXsfl_123_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_33, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "COLLIN_"+sGXsfl_123_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtColLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDNUM_"+sGXsfl_123_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNum_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDNOM_"+sGXsfl_123_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNom_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "VALCOD_"+sGXsfl_123_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtValCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDPREACT_"+sGXsfl_123_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdPreAct_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FORPRDUME_"+sGXsfl_123_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForPrdUMe_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FORPRDDSC_"+sGXsfl_123_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForPrdDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FORCAN_"+sGXsfl_123_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForCan_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "TOTLINCOL_"+sGXsfl_123_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTotLinCol_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDUMEFO_"+sGXsfl_123_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdUMeFo_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "TOTLINCOF_"+sGXsfl_123_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTotLinCoF_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FORCLACOL_"+sGXsfl_123_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForClaCol_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "COLLINV_"+sGXsfl_123_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtColLinV_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDNUMMAX_"+sGXsfl_123_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNumMax_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDHORMAD_"+sGXsfl_123_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdHorMad_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Gridtdforma_level1itemContainer.AddRow(Gridtdforma_level1itemRow);
   }

   public void readRow11P33( )
   {
      nGXsfl_123_idx = (int)(nGXsfl_123_idx+1) ;
      sGXsfl_123_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_123_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_12333( ) ;
      edtColLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "COLLIN_"+sGXsfl_123_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPrdNum_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDNUM_"+sGXsfl_123_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPrdNom_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDNOM_"+sGXsfl_123_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtValCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "VALCOD_"+sGXsfl_123_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPrdPreAct_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDPREACT_"+sGXsfl_123_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtForPrdUMe_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FORPRDUME_"+sGXsfl_123_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtForPrdDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FORPRDDSC_"+sGXsfl_123_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtForCan_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FORCAN_"+sGXsfl_123_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtTotLinCol_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TOTLINCOL_"+sGXsfl_123_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPrdUMeFo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDUMEFO_"+sGXsfl_123_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtTotLinCoF_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TOTLINCOF_"+sGXsfl_123_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtForClaCol_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FORCLACOL_"+sGXsfl_123_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtColLinV_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "COLLINV_"+sGXsfl_123_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPrdNumMax_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDNUMMAX_"+sGXsfl_123_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPrdHorMad_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDHORMAD_"+sGXsfl_123_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtColLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtColLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
      {
         GXCCtl = "COLLIN_" + sGXsfl_123_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtColLin_Internalname ;
         wbErr = true ;
         A309ColLin = (short)(0) ;
      }
      else
      {
         A309ColLin = (short)(localUtil.ctol( httpContext.cgiGet( edtColLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A719PrdNum = httpContext.cgiGet( edtPrdNum_Internalname) ;
      A718PrdNom = httpContext.cgiGet( edtPrdNom_Internalname) ;
      A856ValCod = (byte)(localUtil.ctol( httpContext.cgiGet( edtValCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A724PrdPreAct = localUtil.ctond( httpContext.cgiGet( edtPrdPreAct_Internalname)) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtForPrdUMe_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtForPrdUMe_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
      {
         GXCCtl = "FORPRDUME_" + sGXsfl_123_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtForPrdUMe_Internalname ;
         wbErr = true ;
         A490ForPrdUMe = (byte)(0) ;
      }
      else
      {
         A490ForPrdUMe = (byte)(localUtil.ctol( httpContext.cgiGet( edtForPrdUMe_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A488ForPrdDsc = httpContext.cgiGet( edtForPrdDsc_Internalname) ;
      n488ForPrdDsc = false ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtForCan_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtForCan_Internalname)), DecimalUtil.stringToDec("99999.99999")) > 0 ) ) )
      {
         GXCCtl = "FORCAN_" + sGXsfl_123_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtForCan_Internalname ;
         wbErr = true ;
         A481ForCan = DecimalUtil.ZERO ;
      }
      else
      {
         A481ForCan = localUtil.ctond( httpContext.cgiGet( edtForCan_Internalname)) ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtTotLinCol_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtTotLinCol_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "TOTLINCOL_" + sGXsfl_123_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtTotLinCol_Internalname ;
         wbErr = true ;
         A838TotLinCol = DecimalUtil.ZERO ;
      }
      else
      {
         A838TotLinCol = localUtil.ctond( httpContext.cgiGet( edtTotLinCol_Internalname)) ;
      }
      A4338PrdUMeFo = (byte)(localUtil.ctol( httpContext.cgiGet( edtPrdUMeFo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A5167TotLinCoF = localUtil.ctond( httpContext.cgiGet( edtTotLinCoF_Internalname)) ;
      A6193ForClaCol = httpContext.cgiGet( edtForClaCol_Internalname) ;
      A6222ColLinV = (short)(localUtil.ctol( httpContext.cgiGet( edtColLinV_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A6223PrdNumMax = httpContext.cgiGet( edtPrdNumMax_Internalname) ;
      n6223PrdNumMax = false ;
      A7260PrdHorMad = (byte)(localUtil.ctol( httpContext.cgiGet( edtPrdHorMad_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z309ColLin_" + sGXsfl_123_idx ;
      Z309ColLin = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z481ForCan_" + sGXsfl_123_idx ;
      Z481ForCan = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z838TotLinCol_" + sGXsfl_123_idx ;
      Z838TotLinCol = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z6193ForClaCol_" + sGXsfl_123_idx ;
      Z6193ForClaCol = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z719PrdNum_" + sGXsfl_123_idx ;
      Z719PrdNum = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z490ForPrdUMe_" + sGXsfl_123_idx ;
      Z490ForPrdUMe = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "O5167TotLinCoF_" + sGXsfl_123_idx ;
      O5167TotLinCoF = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "O481ForCan_" + sGXsfl_123_idx ;
      O481ForCan = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "nRcdDeleted_33_" + sGXsfl_123_idx ;
      nRcdDeleted_33 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_33_" + sGXsfl_123_idx ;
      nRcdExists_33 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_33_" + sGXsfl_123_idx ;
      nIsMod_33 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtColLin_Enabled = edtColLin_Enabled ;
   }

   public void confirmValues11P0( )
   {
      nGXsfl_123_idx = 0 ;
      sGXsfl_123_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_123_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_12333( ) ;
      while ( nGXsfl_123_idx < nRC_GXsfl_123 )
      {
         nGXsfl_123_idx = (int)(nGXsfl_123_idx+1) ;
         sGXsfl_123_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_123_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_12333( ) ;
         httpContext.changePostValue( "Z309ColLin_"+sGXsfl_123_idx, httpContext.cgiGet( "ZT_"+"Z309ColLin_"+sGXsfl_123_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z309ColLin_"+sGXsfl_123_idx) ;
         httpContext.changePostValue( "Z481ForCan_"+sGXsfl_123_idx, httpContext.cgiGet( "ZT_"+"Z481ForCan_"+sGXsfl_123_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z481ForCan_"+sGXsfl_123_idx) ;
         httpContext.changePostValue( "Z838TotLinCol_"+sGXsfl_123_idx, httpContext.cgiGet( "ZT_"+"Z838TotLinCol_"+sGXsfl_123_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z838TotLinCol_"+sGXsfl_123_idx) ;
         httpContext.changePostValue( "Z6193ForClaCol_"+sGXsfl_123_idx, httpContext.cgiGet( "ZT_"+"Z6193ForClaCol_"+sGXsfl_123_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6193ForClaCol_"+sGXsfl_123_idx) ;
         httpContext.changePostValue( "Z719PrdNum_"+sGXsfl_123_idx, httpContext.cgiGet( "ZT_"+"Z719PrdNum_"+sGXsfl_123_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z719PrdNum_"+sGXsfl_123_idx) ;
         httpContext.changePostValue( "Z490ForPrdUMe_"+sGXsfl_123_idx, httpContext.cgiGet( "ZT_"+"Z490ForPrdUMe_"+sGXsfl_123_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z490ForPrdUMe_"+sGXsfl_123_idx) ;
      }
      httpContext.changePostValue( "O5167TotLinCoF", httpContext.cgiGet( "T5167TotLinCoF")) ;
      httpContext.deletePostValue( "T5167TotLinCoF") ;
      httpContext.changePostValue( "O481ForCan", httpContext.cgiGet( "T481ForCan")) ;
      httpContext.deletePostValue( "T481ForCan") ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.tdforma", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z486ForNumCol", GXutil.ltrim( localUtil.ntoc( Z486ForNumCol, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z310ColUltLin", GXutil.ltrim( localUtil.ntoc( Z310ColUltLin, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z315ContNum", GXutil.ltrim( localUtil.ntoc( Z315ContNum, (byte)(9), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z318CosKgm", GXutil.ltrim( localUtil.ntoc( Z318CosKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6369Lb_fam1", GXutil.ltrim( localUtil.ntoc( Z6369Lb_fam1, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6370Lb_fam2", GXutil.ltrim( localUtil.ntoc( Z6370Lb_fam2, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6371Lb_fam3", GXutil.ltrim( localUtil.ntoc( Z6371Lb_fam3, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6310Lb_TaAuxC", GXutil.rtrim( Z6310Lb_TaAuxC));
      app.GxWebStd.gx_hidden_field( httpContext, "O5166CosKgmF", GXutil.ltrim( localUtil.ntoc( O5166CosKgmF, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O5361ForCanSum", GXutil.ltrim( localUtil.ntoc( O5361ForCanSum, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_123", GXutil.ltrim( localUtil.ntoc( nGXsfl_123_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDFACCON", GXutil.ltrim( localUtil.ntoc( A707PrdFacCon, (byte)(7), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.tdforma", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TDFORMa" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "COLORANTE Y PASO TABLA ALCALIS", "") ;
   }

   public void initializeNonKey11P32( )
   {
      A5166CosKgmF = DecimalUtil.ZERO ;
      n5166CosKgmF = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5166CosKgmF", GXutil.ltrimstr( A5166CosKgmF, 13, 5));
      A6221ForNumColV = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A6221ForNumColV", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6221ForNumColV), 8, 0));
      A6220EmprCodV3 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A6220EmprCodV3", A6220EmprCodV3);
      A310ColUltLin = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A310ColUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A310ColUltLin), 3, 0));
      A315ContNum = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A315ContNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A315ContNum), 9, 0));
      A318CosKgm = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A318CosKgm", GXutil.ltrimstr( A318CosKgm, 9, 2));
      A407EmprNom = "" ;
      n407EmprNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      A3915EmpNumDec = (byte)(0) ;
      n3915EmpNumDec = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3915EmpNumDec", GXutil.str( A3915EmpNumDec, 1, 0));
      A5361ForCanSum = DecimalUtil.ZERO ;
      n5361ForCanSum = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5361ForCanSum", GXutil.ltrimstr( A5361ForCanSum, 11, 5));
      A6310Lb_TaAuxC = "" ;
      n6310Lb_TaAuxC = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6310Lb_TaAuxC", A6310Lb_TaAuxC);
      A6311Lb_TaAuxD = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A6311Lb_TaAuxD", A6311Lb_TaAuxD);
      A6369Lb_fam1 = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A6369Lb_fam1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6369Lb_fam1), 2, 0));
      A6370Lb_fam2 = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A6370Lb_fam2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6370Lb_fam2), 2, 0));
      A6371Lb_fam3 = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A6371Lb_fam3", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6371Lb_fam3), 2, 0));
      A7259PrdHorMax = (byte)(0) ;
      n7259PrdHorMax = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7259PrdHorMax", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7259PrdHorMax), 2, 0));
      O5166CosKgmF = A5166CosKgmF ;
      n5166CosKgmF = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5166CosKgmF", GXutil.ltrimstr( A5166CosKgmF, 13, 5));
      O5361ForCanSum = A5361ForCanSum ;
      n5361ForCanSum = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5361ForCanSum", GXutil.ltrimstr( A5361ForCanSum, 11, 5));
      Z310ColUltLin = (short)(0) ;
      Z315ContNum = 0 ;
      Z318CosKgm = DecimalUtil.ZERO ;
      Z6369Lb_fam1 = (byte)(0) ;
      Z6370Lb_fam2 = (byte)(0) ;
      Z6371Lb_fam3 = (byte)(0) ;
      Z6310Lb_TaAuxC = "" ;
   }

   public void initAll11P32( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A486ForNumCol = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A486ForNumCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A486ForNumCol), 8, 0));
      initializeNonKey11P32( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey11P33( )
   {
      A5167TotLinCoF = DecimalUtil.ZERO ;
      A6222ColLinV = (short)(0) ;
      A6223PrdNumMax = "" ;
      n6223PrdNumMax = false ;
      A719PrdNum = "" ;
      A718PrdNom = "" ;
      A856ValCod = (byte)(0) ;
      A724PrdPreAct = DecimalUtil.ZERO ;
      A490ForPrdUMe = (byte)(0) ;
      A488ForPrdDsc = "" ;
      n488ForPrdDsc = false ;
      A481ForCan = DecimalUtil.ZERO ;
      A838TotLinCol = DecimalUtil.ZERO ;
      A4338PrdUMeFo = (byte)(0) ;
      A6193ForClaCol = "" ;
      A7260PrdHorMad = (byte)(0) ;
      A707PrdFacCon = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A707PrdFacCon", GXutil.ltrimstr( A707PrdFacCon, 7, 4));
      O5167TotLinCoF = A5167TotLinCoF ;
      O481ForCan = A481ForCan ;
      Z481ForCan = DecimalUtil.ZERO ;
      Z838TotLinCol = DecimalUtil.ZERO ;
      Z6193ForClaCol = "" ;
      Z719PrdNum = "" ;
      Z490ForPrdUMe = (byte)(0) ;
   }

   public void initAll11P33( )
   {
      A309ColLin = (short)(0) ;
      initializeNonKey11P33( ) ;
   }

   public void standaloneModalInsert11P33( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?2026824154034", true, true);
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
      httpContext.AddJavascriptSource("tdforma.js", "?2026824154035", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties33( )
   {
      edtColLin_Enabled = defedtColLin_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtColLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtColLin_Enabled), 5, 0), !bGXsfl_123_Refreshing);
   }

   public void startgridcontrol123( )
   {
      Gridtdforma_level1itemContainer.AddObjectProperty("GridName", "Gridtdforma_level1item");
      Gridtdforma_level1itemContainer.AddObjectProperty("Header", subGridtdforma_level1item_Header);
      Gridtdforma_level1itemContainer.AddObjectProperty("Class", "Grid");
      Gridtdforma_level1itemContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Gridtdforma_level1itemContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Gridtdforma_level1itemContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridtdforma_level1item_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Gridtdforma_level1itemContainer.AddObjectProperty("CmpContext", "");
      Gridtdforma_level1itemContainer.AddObjectProperty("InMasterPage", "false");
      Gridtdforma_level1itemColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridtdforma_level1itemColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A309ColLin, (byte)(3), (byte)(0), ".", "")));
      Gridtdforma_level1itemColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtColLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridtdforma_level1itemContainer.AddColumnProperties(Gridtdforma_level1itemColumn);
      Gridtdforma_level1itemColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridtdforma_level1itemColumn.AddObjectProperty("Value", GXutil.rtrim( A719PrdNum));
      Gridtdforma_level1itemColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNum_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridtdforma_level1itemContainer.AddColumnProperties(Gridtdforma_level1itemColumn);
      Gridtdforma_level1itemColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridtdforma_level1itemColumn.AddObjectProperty("Value", GXutil.rtrim( A718PrdNom));
      Gridtdforma_level1itemColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNom_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridtdforma_level1itemContainer.AddColumnProperties(Gridtdforma_level1itemColumn);
      Gridtdforma_level1itemColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridtdforma_level1itemColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A856ValCod, (byte)(1), (byte)(0), ".", "")));
      Gridtdforma_level1itemColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtValCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridtdforma_level1itemContainer.AddColumnProperties(Gridtdforma_level1itemColumn);
      Gridtdforma_level1itemColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridtdforma_level1itemColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A724PrdPreAct, (byte)(14), (byte)(5), ".", "")));
      Gridtdforma_level1itemColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdPreAct_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridtdforma_level1itemContainer.AddColumnProperties(Gridtdforma_level1itemColumn);
      Gridtdforma_level1itemColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridtdforma_level1itemColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A490ForPrdUMe, (byte)(1), (byte)(0), ".", "")));
      Gridtdforma_level1itemColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtForPrdUMe_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridtdforma_level1itemContainer.AddColumnProperties(Gridtdforma_level1itemColumn);
      Gridtdforma_level1itemColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridtdforma_level1itemColumn.AddObjectProperty("Value", GXutil.rtrim( A488ForPrdDsc));
      Gridtdforma_level1itemColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtForPrdDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridtdforma_level1itemContainer.AddColumnProperties(Gridtdforma_level1itemColumn);
      Gridtdforma_level1itemColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridtdforma_level1itemColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A481ForCan, (byte)(11), (byte)(5), ".", "")));
      Gridtdforma_level1itemColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtForCan_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridtdforma_level1itemContainer.AddColumnProperties(Gridtdforma_level1itemColumn);
      Gridtdforma_level1itemColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridtdforma_level1itemColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A838TotLinCol, (byte)(9), (byte)(2), ".", "")));
      Gridtdforma_level1itemColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtTotLinCol_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridtdforma_level1itemContainer.AddColumnProperties(Gridtdforma_level1itemColumn);
      Gridtdforma_level1itemColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridtdforma_level1itemColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4338PrdUMeFo, (byte)(1), (byte)(0), ".", "")));
      Gridtdforma_level1itemColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdUMeFo_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridtdforma_level1itemContainer.AddColumnProperties(Gridtdforma_level1itemColumn);
      Gridtdforma_level1itemColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridtdforma_level1itemColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5167TotLinCoF, (byte)(13), (byte)(5), ".", "")));
      Gridtdforma_level1itemColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtTotLinCoF_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridtdforma_level1itemContainer.AddColumnProperties(Gridtdforma_level1itemColumn);
      Gridtdforma_level1itemColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridtdforma_level1itemColumn.AddObjectProperty("Value", GXutil.rtrim( A6193ForClaCol));
      Gridtdforma_level1itemColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtForClaCol_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridtdforma_level1itemContainer.AddColumnProperties(Gridtdforma_level1itemColumn);
      Gridtdforma_level1itemColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridtdforma_level1itemColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6222ColLinV, (byte)(3), (byte)(0), ".", "")));
      Gridtdforma_level1itemColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtColLinV_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridtdforma_level1itemContainer.AddColumnProperties(Gridtdforma_level1itemColumn);
      Gridtdforma_level1itemColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridtdforma_level1itemColumn.AddObjectProperty("Value", GXutil.rtrim( A6223PrdNumMax));
      Gridtdforma_level1itemColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNumMax_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridtdforma_level1itemContainer.AddColumnProperties(Gridtdforma_level1itemColumn);
      Gridtdforma_level1itemColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridtdforma_level1itemColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A7260PrdHorMad, (byte)(2), (byte)(0), ".", "")));
      Gridtdforma_level1itemColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdHorMad_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridtdforma_level1itemContainer.AddColumnProperties(Gridtdforma_level1itemColumn);
      Gridtdforma_level1itemContainer.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGridtdforma_level1item_Selectedindex, (byte)(4), (byte)(0), ".", "")));
      Gridtdforma_level1itemContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGridtdforma_level1item_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Gridtdforma_level1itemContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGridtdforma_level1item_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Gridtdforma_level1itemContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGridtdforma_level1item_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Gridtdforma_level1itemContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGridtdforma_level1item_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Gridtdforma_level1itemContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGridtdforma_level1item_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Gridtdforma_level1itemContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGridtdforma_level1item_Collapsed, (byte)(1), (byte)(0), ".", "")));
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
      edtForNumCol_Internalname = "FORNUMCOL" ;
      edtColUltLin_Internalname = "COLULTLIN" ;
      edtContNum_Internalname = "CONTNUM" ;
      edtCosKgm_Internalname = "COSKGM" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      edtEmpNumDec_Internalname = "EMPNUMDEC" ;
      edtCosKgmF_Internalname = "COSKGMF" ;
      edtForCanSum_Internalname = "FORCANSUM" ;
      edtEmprCodV3_Internalname = "EMPRCODV3" ;
      edtForNumColV_Internalname = "FORNUMCOLV" ;
      edtLb_TaAuxC_Internalname = "LB_TAAUXC" ;
      edtLb_TaAuxD_Internalname = "LB_TAAUXD" ;
      edtLb_fam1_Internalname = "LB_FAM1" ;
      edtLb_fam2_Internalname = "LB_FAM2" ;
      edtLb_fam3_Internalname = "LB_FAM3" ;
      edtPrdHorMax_Internalname = "PRDHORMAX" ;
      lblTitlelevel1_Internalname = "TITLELEVEL1" ;
      edtColLin_Internalname = "COLLIN" ;
      edtPrdNum_Internalname = "PRDNUM" ;
      edtPrdNom_Internalname = "PRDNOM" ;
      edtValCod_Internalname = "VALCOD" ;
      edtPrdPreAct_Internalname = "PRDPREACT" ;
      edtForPrdUMe_Internalname = "FORPRDUME" ;
      edtForPrdDsc_Internalname = "FORPRDDSC" ;
      edtForCan_Internalname = "FORCAN" ;
      edtTotLinCol_Internalname = "TOTLINCOL" ;
      edtPrdUMeFo_Internalname = "PRDUMEFO" ;
      edtTotLinCoF_Internalname = "TOTLINCOF" ;
      edtForClaCol_Internalname = "FORCLACOL" ;
      edtColLinV_Internalname = "COLLINV" ;
      edtPrdNumMax_Internalname = "PRDNUMMAX" ;
      edtPrdHorMad_Internalname = "PRDHORMAD" ;
      divLevel1table_Internalname = "LEVEL1TABLE" ;
      divFormcontainer_Internalname = "FORMCONTAINER" ;
      bttBtn_enter_Internalname = "BTN_ENTER" ;
      bttBtn_cancel_Internalname = "BTN_CANCEL" ;
      bttBtn_delete_Internalname = "BTN_DELETE" ;
      divMaintable_Internalname = "MAINTABLE" ;
      Form.setInternalname( "FORM" );
      subGridtdforma_level1item_Internalname = "GRIDTDFORMA_LEVEL1ITEM" ;
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
      subGridtdforma_level1item_Allowcollapsing = (byte)(0) ;
      subGridtdforma_level1item_Allowselection = (byte)(0) ;
      subGridtdforma_level1item_Header = "" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "COLORANTE Y PASO TABLA ALCALIS", "") );
      edtPrdHorMad_Jsonclick = "" ;
      edtPrdNumMax_Jsonclick = "" ;
      edtColLinV_Jsonclick = "" ;
      edtForClaCol_Jsonclick = "" ;
      edtTotLinCoF_Jsonclick = "" ;
      edtPrdUMeFo_Jsonclick = "" ;
      edtTotLinCol_Jsonclick = "" ;
      edtForCan_Jsonclick = "" ;
      edtForPrdDsc_Jsonclick = "" ;
      edtForPrdUMe_Jsonclick = "" ;
      edtPrdPreAct_Jsonclick = "" ;
      edtValCod_Jsonclick = "" ;
      edtPrdNom_Jsonclick = "" ;
      edtPrdNum_Jsonclick = "" ;
      edtColLin_Jsonclick = "" ;
      subGridtdforma_level1item_Class = "Grid" ;
      subGridtdforma_level1item_Backcolorstyle = (byte)(0) ;
      edtPrdHorMad_Enabled = 0 ;
      edtPrdNumMax_Enabled = 0 ;
      edtColLinV_Enabled = 0 ;
      edtForClaCol_Enabled = 1 ;
      edtTotLinCoF_Enabled = 0 ;
      edtPrdUMeFo_Enabled = 0 ;
      edtTotLinCol_Enabled = 1 ;
      edtForCan_Enabled = 1 ;
      edtForPrdDsc_Enabled = 0 ;
      edtForPrdUMe_Enabled = 1 ;
      edtPrdPreAct_Enabled = 0 ;
      edtValCod_Enabled = 0 ;
      edtPrdNom_Enabled = 0 ;
      edtPrdNum_Enabled = 1 ;
      edtColLin_Enabled = 1 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtPrdHorMax_Jsonclick = "" ;
      edtPrdHorMax_Enabled = 0 ;
      edtLb_fam3_Jsonclick = "" ;
      edtLb_fam3_Enabled = 1 ;
      edtLb_fam2_Jsonclick = "" ;
      edtLb_fam2_Enabled = 1 ;
      edtLb_fam1_Jsonclick = "" ;
      edtLb_fam1_Enabled = 1 ;
      edtLb_TaAuxD_Jsonclick = "" ;
      edtLb_TaAuxD_Enabled = 0 ;
      edtLb_TaAuxC_Jsonclick = "" ;
      edtLb_TaAuxC_Enabled = 1 ;
      edtForNumColV_Jsonclick = "" ;
      edtForNumColV_Enabled = 0 ;
      edtEmprCodV3_Jsonclick = "" ;
      edtEmprCodV3_Enabled = 0 ;
      edtForCanSum_Jsonclick = "" ;
      edtForCanSum_Enabled = 0 ;
      edtCosKgmF_Jsonclick = "" ;
      edtCosKgmF_Enabled = 0 ;
      edtEmpNumDec_Jsonclick = "" ;
      edtEmpNumDec_Enabled = 0 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Enabled = 0 ;
      edtCosKgm_Jsonclick = "" ;
      edtCosKgm_Enabled = 1 ;
      edtContNum_Jsonclick = "" ;
      edtContNum_Enabled = 1 ;
      edtColUltLin_Jsonclick = "" ;
      edtColUltLin_Enabled = 1 ;
      edtForNumCol_Jsonclick = "" ;
      edtForNumCol_Enabled = 1 ;
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

   public void gxnrgridtdforma_level1item_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_12333( ) ;
      while ( nGXsfl_123_idx <= nRC_GXsfl_123 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal11P33( ) ;
         standaloneModal11P33( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow11P33( ) ;
         nGXsfl_123_idx = (int)(nGXsfl_123_idx+1) ;
         sGXsfl_123_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_123_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_12333( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Gridtdforma_level1itemContainer)) ;
      /* End function gxnrGridtdforma_level1item_newrow */
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
      /* Using cursor T011P40 */
      pr_default.execute(24, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(24) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T011P40_A407EmprNom[0] ;
      n407EmprNom = T011P40_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      A3915EmpNumDec = T011P40_A3915EmpNumDec[0] ;
      n3915EmpNumDec = T011P40_n3915EmpNumDec[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A3915EmpNumDec", GXutil.str( A3915EmpNumDec, 1, 0));
      pr_default.close(24);
      /* Using cursor T011P42 */
      pr_default.execute(25, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(25) != 101) )
      {
         A7259PrdHorMax = T011P42_A7259PrdHorMax[0] ;
         n7259PrdHorMax = T011P42_n7259PrdHorMax[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7259PrdHorMax", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7259PrdHorMax), 2, 0));
      }
      else
      {
         A7259PrdHorMax = (byte)(0) ;
         n7259PrdHorMax = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A7259PrdHorMax", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7259PrdHorMax), 2, 0));
      }
      pr_default.close(25);
      /* Using cursor T011P44 */
      pr_default.execute(26, new Object[] {A396EmprCod, Integer.valueOf(A486ForNumCol)});
      if ( (pr_default.getStatus(26) != 101) )
      {
         A5166CosKgmF = T011P44_A5166CosKgmF[0] ;
         n5166CosKgmF = T011P44_n5166CosKgmF[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5166CosKgmF", GXutil.ltrimstr( A5166CosKgmF, 13, 5));
      }
      else
      {
         A5166CosKgmF = DecimalUtil.doubleToDec(0) ;
         n5166CosKgmF = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5166CosKgmF", GXutil.ltrimstr( A5166CosKgmF, 13, 5));
      }
      pr_default.close(26);
      /* Using cursor T011P46 */
      pr_default.execute(27, new Object[] {A396EmprCod, Integer.valueOf(A486ForNumCol)});
      if ( (pr_default.getStatus(27) != 101) )
      {
         A5361ForCanSum = T011P46_A5361ForCanSum[0] ;
         n5361ForCanSum = T011P46_n5361ForCanSum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5361ForCanSum", GXutil.ltrimstr( A5361ForCanSum, 11, 5));
      }
      else
      {
         A5361ForCanSum = DecimalUtil.doubleToDec(0) ;
         n5361ForCanSum = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5361ForCanSum", GXutil.ltrimstr( A5361ForCanSum, 11, 5));
      }
      pr_default.close(27);
      GX_FocusControl = edtColUltLin_Internalname ;
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
      n3915EmpNumDec = false ;
      n7259PrdHorMax = false ;
      /* Using cursor T011P40 */
      pr_default.execute(24, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(24) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A407EmprNom = T011P40_A407EmprNom[0] ;
      n407EmprNom = T011P40_n407EmprNom[0] ;
      A3915EmpNumDec = T011P40_A3915EmpNumDec[0] ;
      n3915EmpNumDec = T011P40_n3915EmpNumDec[0] ;
      pr_default.close(24);
      /* Using cursor T011P42 */
      pr_default.execute(25, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(25) != 101) )
      {
         A7259PrdHorMax = T011P42_A7259PrdHorMax[0] ;
         n7259PrdHorMax = T011P42_n7259PrdHorMax[0] ;
      }
      else
      {
         A7259PrdHorMax = (byte)(0) ;
         n7259PrdHorMax = false ;
      }
      pr_default.close(25);
      A6220EmprCodV3 = A396EmprCod ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A3915EmpNumDec", GXutil.ltrim( localUtil.ntoc( A3915EmpNumDec, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A7259PrdHorMax", GXutil.ltrim( localUtil.ntoc( A7259PrdHorMax, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6220EmprCodV3", GXutil.rtrim( A6220EmprCodV3));
   }

   public void valid_Fornumcol( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      /* Using cursor T011P44 */
      pr_default.execute(26, new Object[] {A396EmprCod, Integer.valueOf(A486ForNumCol)});
      if ( (pr_default.getStatus(26) != 101) )
      {
         A5166CosKgmF = T011P44_A5166CosKgmF[0] ;
         n5166CosKgmF = T011P44_n5166CosKgmF[0] ;
      }
      else
      {
         A5166CosKgmF = DecimalUtil.doubleToDec(0) ;
         n5166CosKgmF = false ;
      }
      pr_default.close(26);
      /* Using cursor T011P46 */
      pr_default.execute(27, new Object[] {A396EmprCod, Integer.valueOf(A486ForNumCol)});
      if ( (pr_default.getStatus(27) != 101) )
      {
         A5361ForCanSum = T011P46_A5361ForCanSum[0] ;
         n5361ForCanSum = T011P46_n5361ForCanSum[0] ;
      }
      else
      {
         A5361ForCanSum = DecimalUtil.doubleToDec(0) ;
         n5361ForCanSum = false ;
      }
      pr_default.close(27);
      A6221ForNumColV = A486ForNumCol ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A310ColUltLin", GXutil.ltrim( localUtil.ntoc( A310ColUltLin, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A315ContNum", GXutil.ltrim( localUtil.ntoc( A315ContNum, (byte)(9), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A318CosKgm", GXutil.ltrim( localUtil.ntoc( A318CosKgm, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6310Lb_TaAuxC", GXutil.rtrim( A6310Lb_TaAuxC));
      httpContext.ajax_rsp_assign_attri("", false, "A6369Lb_fam1", GXutil.ltrim( localUtil.ntoc( A6369Lb_fam1, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6370Lb_fam2", GXutil.ltrim( localUtil.ntoc( A6370Lb_fam2, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6371Lb_fam3", GXutil.ltrim( localUtil.ntoc( A6371Lb_fam3, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A3915EmpNumDec", GXutil.ltrim( localUtil.ntoc( A3915EmpNumDec, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6311Lb_TaAuxD", GXutil.rtrim( A6311Lb_TaAuxD));
      httpContext.ajax_rsp_assign_attri("", false, "A7259PrdHorMax", GXutil.ltrim( localUtil.ntoc( A7259PrdHorMax, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6220EmprCodV3", GXutil.rtrim( A6220EmprCodV3));
      httpContext.ajax_rsp_assign_attri("", false, "A5166CosKgmF", GXutil.ltrim( localUtil.ntoc( A5166CosKgmF, (byte)(13), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A5361ForCanSum", GXutil.ltrim( localUtil.ntoc( A5361ForCanSum, (byte)(11), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6221ForNumColV", GXutil.ltrim( localUtil.ntoc( A6221ForNumColV, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z486ForNumCol", GXutil.ltrim( localUtil.ntoc( Z486ForNumCol, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z310ColUltLin", GXutil.ltrim( localUtil.ntoc( Z310ColUltLin, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z315ContNum", GXutil.ltrim( localUtil.ntoc( Z315ContNum, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z318CosKgm", GXutil.ltrim( localUtil.ntoc( Z318CosKgm, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6310Lb_TaAuxC", GXutil.rtrim( Z6310Lb_TaAuxC));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6369Lb_fam1", GXutil.ltrim( localUtil.ntoc( Z6369Lb_fam1, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6370Lb_fam2", GXutil.ltrim( localUtil.ntoc( Z6370Lb_fam2, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6371Lb_fam3", GXutil.ltrim( localUtil.ntoc( Z6371Lb_fam3, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3915EmpNumDec", GXutil.ltrim( localUtil.ntoc( Z3915EmpNumDec, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6311Lb_TaAuxD", GXutil.rtrim( Z6311Lb_TaAuxD));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7259PrdHorMax", GXutil.ltrim( localUtil.ntoc( Z7259PrdHorMax, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6220EmprCodV3", GXutil.rtrim( Z6220EmprCodV3));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5166CosKgmF", GXutil.ltrim( localUtil.ntoc( Z5166CosKgmF, (byte)(13), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5361ForCanSum", GXutil.ltrim( localUtil.ntoc( Z5361ForCanSum, (byte)(11), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6221ForNumColV", GXutil.ltrim( localUtil.ntoc( Z6221ForNumColV, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "O5166CosKgmF", GXutil.ltrim( localUtil.ntoc( O5166CosKgmF, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_attri("", false, "O5361ForCanSum", GXutil.ltrim( localUtil.ntoc( O5361ForCanSum, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Lb_taauxc( )
   {
      n6310Lb_TaAuxC = false ;
      /* Using cursor T011P47 */
      pr_default.execute(28, new Object[] {A396EmprCod, Boolean.valueOf(n6310Lb_TaAuxC), A6310Lb_TaAuxC});
      if ( (pr_default.getStatus(28) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (GXutil.strcmp("", A6310Lb_TaAuxC)==0) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ENS005", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "LB_TAAUXC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
         }
      }
      A6311Lb_TaAuxD = T011P47_A6311Lb_TaAuxD[0] ;
      pr_default.close(28);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A6311Lb_TaAuxD", GXutil.rtrim( A6311Lb_TaAuxD));
   }

   public void valid_Collin( )
   {
      n6223PrdNumMax = false ;
      A6222ColLinV = A309ColLin ;
      /* Using cursor T011P69 */
      pr_default.execute(40, new Object[] {Short.valueOf(A6222ColLinV), A6220EmprCodV3, Integer.valueOf(A6221ForNumColV), A6220EmprCodV3, Integer.valueOf(A6221ForNumColV), Short.valueOf(A6222ColLinV), A6220EmprCodV3, Integer.valueOf(A6221ForNumColV), Short.valueOf(A6222ColLinV), A6220EmprCodV3, Integer.valueOf(A6221ForNumColV)});
      if ( (pr_default.getStatus(40) != 101) )
      {
         A6223PrdNumMax = T011P69_A6223PrdNumMax[0] ;
         n6223PrdNumMax = T011P69_n6223PrdNumMax[0] ;
      }
      else
      {
         A6223PrdNumMax = "" ;
         n6223PrdNumMax = false ;
      }
      pr_default.close(40);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A6222ColLinV", GXutil.ltrim( localUtil.ntoc( A6222ColLinV, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6223PrdNumMax", GXutil.rtrim( A6223PrdNumMax));
   }

   public void valid_Prdnum( )
   {
      /* Using cursor T011P70 */
      pr_default.execute(41, new Object[] {A396EmprCod, A719PrdNum});
      if ( (pr_default.getStatus(41) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
      }
      A718PrdNom = T011P70_A718PrdNom[0] ;
      A724PrdPreAct = T011P70_A724PrdPreAct[0] ;
      A4338PrdUMeFo = T011P70_A4338PrdUMeFo[0] ;
      A7260PrdHorMad = T011P70_A7260PrdHorMad[0] ;
      A707PrdFacCon = T011P70_A707PrdFacCon[0] ;
      A856ValCod = T011P70_A856ValCod[0] ;
      pr_default.close(41);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", GXutil.rtrim( A718PrdNom));
      httpContext.ajax_rsp_assign_attri("", false, "A724PrdPreAct", GXutil.ltrim( localUtil.ntoc( A724PrdPreAct, (byte)(14), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4338PrdUMeFo", GXutil.ltrim( localUtil.ntoc( A4338PrdUMeFo, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A7260PrdHorMad", GXutil.ltrim( localUtil.ntoc( A7260PrdHorMad, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A707PrdFacCon", GXutil.ltrim( localUtil.ntoc( A707PrdFacCon, (byte)(7), (byte)(4), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A856ValCod", GXutil.ltrim( localUtil.ntoc( A856ValCod, (byte)(1), (byte)(0), ".", "")));
   }

   public void valid_Forprdume( )
   {
      n488ForPrdDsc = false ;
      /* Using cursor T011P71 */
      pr_default.execute(42, new Object[] {A396EmprCod, Byte.valueOf(A490ForPrdUMe)});
      if ( (pr_default.getStatus(42) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "UNMEPR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FORPRDUME");
         AnyError = (short)(1) ;
         GX_FocusControl = edtForPrdUMe_Internalname ;
      }
      A488ForPrdDsc = T011P71_A488ForPrdDsc[0] ;
      n488ForPrdDsc = T011P71_n488ForPrdDsc[0] ;
      pr_default.close(42);
      if ( ! ( ( A490ForPrdUMe == 0 ) || ( A490ForPrdUMe == 1 ) || ( A490ForPrdUMe == 2 ) || ( A490ForPrdUMe == 3 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Unidad Medida", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "FORPRDUME");
         AnyError = (short)(1) ;
         GX_FocusControl = edtForPrdUMe_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A488ForPrdDsc", GXutil.rtrim( A488ForPrdDsc));
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
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A3915EmpNumDec',fld:'EMPNUMDEC',pic:'9'},{av:'A7259PrdHorMax',fld:'PRDHORMAX',pic:'Z9'},{av:'A6220EmprCodV3',fld:'EMPRCODV3',pic:'@!'}]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A3915EmpNumDec',fld:'EMPNUMDEC',pic:'9'},{av:'A7259PrdHorMax',fld:'PRDHORMAX',pic:'Z9'},{av:'A6220EmprCodV3',fld:'EMPRCODV3',pic:'@!'}]}");
      setEventMetadata("VALID_FORNUMCOL","{handler:'valid_Fornumcol',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A486ForNumCol',fld:'FORNUMCOL',pic:'ZZZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_FORNUMCOL",",oparms:[{av:'A310ColUltLin',fld:'COLULTLIN',pic:'ZZ9'},{av:'A315ContNum',fld:'CONTNUM',pic:'ZZZZZZZZ9'},{av:'A318CosKgm',fld:'COSKGM',pic:'ZZZZZ9.99'},{av:'A6310Lb_TaAuxC',fld:'LB_TAAUXC',pic:''},{av:'A6369Lb_fam1',fld:'LB_FAM1',pic:'Z9'},{av:'A6370Lb_fam2',fld:'LB_FAM2',pic:'Z9'},{av:'A6371Lb_fam3',fld:'LB_FAM3',pic:'Z9'},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A3915EmpNumDec',fld:'EMPNUMDEC',pic:'9'},{av:'A6311Lb_TaAuxD',fld:'LB_TAAUXD',pic:''},{av:'A7259PrdHorMax',fld:'PRDHORMAX',pic:'Z9'},{av:'A6220EmprCodV3',fld:'EMPRCODV3',pic:'@!'},{av:'A5166CosKgmF',fld:'COSKGMF',pic:'ZZZZZZ9.99999'},{av:'A5361ForCanSum',fld:'FORCANSUM',pic:'ZZZZ9.99999'},{av:'A6221ForNumColV',fld:'FORNUMCOLV',pic:'ZZZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z486ForNumCol'},{av:'Z310ColUltLin'},{av:'Z315ContNum'},{av:'Z318CosKgm'},{av:'Z6310Lb_TaAuxC'},{av:'Z6369Lb_fam1'},{av:'Z6370Lb_fam2'},{av:'Z6371Lb_fam3'},{av:'Z407EmprNom'},{av:'Z3915EmpNumDec'},{av:'Z6311Lb_TaAuxD'},{av:'Z7259PrdHorMax'},{av:'Z6220EmprCodV3'},{av:'Z5166CosKgmF'},{av:'Z5361ForCanSum'},{av:'Z6221ForNumColV'},{av:'O5166CosKgmF'},{av:'O5361ForCanSum'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'}]}");
      setEventMetadata("VALID_CONTNUM","{handler:'valid_Contnum',iparms:[]");
      setEventMetadata("VALID_CONTNUM",",oparms:[]}");
      setEventMetadata("VALID_EMPRCODV3","{handler:'valid_Emprcodv3',iparms:[]");
      setEventMetadata("VALID_EMPRCODV3",",oparms:[]}");
      setEventMetadata("VALID_FORNUMCOLV","{handler:'valid_Fornumcolv',iparms:[]");
      setEventMetadata("VALID_FORNUMCOLV",",oparms:[]}");
      setEventMetadata("VALID_LB_TAAUXC","{handler:'valid_Lb_taauxc',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A6310Lb_TaAuxC',fld:'LB_TAAUXC',pic:''},{av:'A6311Lb_TaAuxD',fld:'LB_TAAUXD',pic:''}]");
      setEventMetadata("VALID_LB_TAAUXC",",oparms:[{av:'A6311Lb_TaAuxD',fld:'LB_TAAUXD',pic:''}]}");
      setEventMetadata("VALID_COLLIN","{handler:'valid_Collin',iparms:[{av:'A309ColLin',fld:'COLLIN',pic:'ZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A486ForNumCol',fld:'FORNUMCOL',pic:'ZZZZZZZ9'},{av:'A6222ColLinV',fld:'COLLINV',pic:'ZZ9'},{av:'A6220EmprCodV3',fld:'EMPRCODV3',pic:'@!'},{av:'A6221ForNumColV',fld:'FORNUMCOLV',pic:'ZZZZZZZ9'},{av:'A6223PrdNumMax',fld:'PRDNUMMAX',pic:''}]");
      setEventMetadata("VALID_COLLIN",",oparms:[{av:'A6222ColLinV',fld:'COLLINV',pic:'ZZ9'},{av:'A6223PrdNumMax',fld:'PRDNUMMAX',pic:''}]}");
      setEventMetadata("VALID_PRDNUM","{handler:'valid_Prdnum',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A718PrdNom',fld:'PRDNOM',pic:''},{av:'A724PrdPreAct',fld:'PRDPREACT',pic:'ZZZZZZZ9.999'},{av:'A4338PrdUMeFo',fld:'PRDUMEFO',pic:'9'},{av:'A7260PrdHorMad',fld:'PRDHORMAD',pic:'Z9'},{av:'A707PrdFacCon',fld:'PRDFACCON',pic:'Z9.9999'},{av:'A856ValCod',fld:'VALCOD',pic:'9'}]");
      setEventMetadata("VALID_PRDNUM",",oparms:[{av:'A718PrdNom',fld:'PRDNOM',pic:''},{av:'A724PrdPreAct',fld:'PRDPREACT',pic:'ZZZZZZZ9.999'},{av:'A4338PrdUMeFo',fld:'PRDUMEFO',pic:'9'},{av:'A7260PrdHorMad',fld:'PRDHORMAD',pic:'Z9'},{av:'A707PrdFacCon',fld:'PRDFACCON',pic:'Z9.9999'},{av:'A856ValCod',fld:'VALCOD',pic:'9'}]}");
      setEventMetadata("VALID_PRDPREACT","{handler:'valid_Prdpreact',iparms:[]");
      setEventMetadata("VALID_PRDPREACT",",oparms:[]}");
      setEventMetadata("VALID_FORPRDUME","{handler:'valid_Forprdume',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A490ForPrdUMe',fld:'FORPRDUME',pic:'9'},{av:'A488ForPrdDsc',fld:'FORPRDDSC',pic:''}]");
      setEventMetadata("VALID_FORPRDUME",",oparms:[{av:'A488ForPrdDsc',fld:'FORPRDDSC',pic:''}]}");
      setEventMetadata("VALID_FORCAN","{handler:'valid_Forcan',iparms:[]");
      setEventMetadata("VALID_FORCAN",",oparms:[]}");
      setEventMetadata("VALID_TOTLINCOF","{handler:'valid_Totlincof',iparms:[]");
      setEventMetadata("VALID_TOTLINCOF",",oparms:[]}");
      setEventMetadata("VALID_COLLINV","{handler:'valid_Collinv',iparms:[]");
      setEventMetadata("VALID_COLLINV",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Prdhormad',iparms:[]");
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
      pr_default.close(41);
      pr_default.close(42);
      pr_default.close(40);
      pr_default.close(24);
      pr_default.close(28);
      pr_default.close(26);
      pr_default.close(27);
      pr_default.close(25);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z318CosKgm = DecimalUtil.ZERO ;
      Z6310Lb_TaAuxC = "" ;
      O5166CosKgmF = DecimalUtil.ZERO ;
      O5361ForCanSum = DecimalUtil.ZERO ;
      Z481ForCan = DecimalUtil.ZERO ;
      Z838TotLinCol = DecimalUtil.ZERO ;
      Z6193ForClaCol = "" ;
      Z719PrdNum = "" ;
      O5167TotLinCoF = DecimalUtil.ZERO ;
      O481ForCan = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A6310Lb_TaAuxC = "" ;
      A719PrdNum = "" ;
      A6220EmprCodV3 = "" ;
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
      A318CosKgm = DecimalUtil.ZERO ;
      A407EmprNom = "" ;
      A5166CosKgmF = DecimalUtil.ZERO ;
      A5361ForCanSum = DecimalUtil.ZERO ;
      A6311Lb_TaAuxD = "" ;
      lblTitlelevel1_Jsonclick = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      Gridtdforma_level1itemContainer = new com.genexus.webpanels.GXWebGrid(context);
      B5166CosKgmF = DecimalUtil.ZERO ;
      B5361ForCanSum = DecimalUtil.ZERO ;
      sMode33 = "" ;
      sStyleString = "" ;
      A707PrdFacCon = DecimalUtil.ZERO ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      s5166CosKgmF = DecimalUtil.ZERO ;
      s5361ForCanSum = DecimalUtil.ZERO ;
      GXCCtl = "" ;
      A718PrdNom = "" ;
      A724PrdPreAct = DecimalUtil.ZERO ;
      A488ForPrdDsc = "" ;
      A481ForCan = DecimalUtil.ZERO ;
      A838TotLinCol = DecimalUtil.ZERO ;
      A5167TotLinCoF = DecimalUtil.ZERO ;
      A6193ForClaCol = "" ;
      A6223PrdNumMax = "" ;
      T5167TotLinCoF = DecimalUtil.ZERO ;
      T481ForCan = DecimalUtil.ZERO ;
      Z407EmprNom = "" ;
      Z5166CosKgmF = DecimalUtil.ZERO ;
      Z5361ForCanSum = DecimalUtil.ZERO ;
      Z6311Lb_TaAuxD = "" ;
      T011P25_A486ForNumCol = new int[1] ;
      T011P25_A310ColUltLin = new short[1] ;
      T011P25_A315ContNum = new int[1] ;
      T011P25_A318CosKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T011P25_A407EmprNom = new String[] {""} ;
      T011P25_n407EmprNom = new boolean[] {false} ;
      T011P25_A3915EmpNumDec = new byte[1] ;
      T011P25_n3915EmpNumDec = new boolean[] {false} ;
      T011P25_A6311Lb_TaAuxD = new String[] {""} ;
      T011P25_A6369Lb_fam1 = new byte[1] ;
      T011P25_A6370Lb_fam2 = new byte[1] ;
      T011P25_A6371Lb_fam3 = new byte[1] ;
      T011P25_A396EmprCod = new String[] {""} ;
      T011P25_A6310Lb_TaAuxC = new String[] {""} ;
      T011P25_n6310Lb_TaAuxC = new boolean[] {false} ;
      T011P25_A5166CosKgmF = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T011P25_n5166CosKgmF = new boolean[] {false} ;
      T011P25_A5361ForCanSum = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T011P25_n5361ForCanSum = new boolean[] {false} ;
      T011P25_A7259PrdHorMax = new byte[1] ;
      T011P25_n7259PrdHorMax = new boolean[] {false} ;
      T011P14_A407EmprNom = new String[] {""} ;
      T011P14_n407EmprNom = new boolean[] {false} ;
      T011P14_A3915EmpNumDec = new byte[1] ;
      T011P14_n3915EmpNumDec = new boolean[] {false} ;
      T011P15_A6311Lb_TaAuxD = new String[] {""} ;
      T011P17_A7259PrdHorMax = new byte[1] ;
      T011P17_n7259PrdHorMax = new boolean[] {false} ;
      T011P19_A5166CosKgmF = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T011P19_n5166CosKgmF = new boolean[] {false} ;
      T011P21_A5361ForCanSum = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T011P21_n5361ForCanSum = new boolean[] {false} ;
      T011P26_A407EmprNom = new String[] {""} ;
      T011P26_n407EmprNom = new boolean[] {false} ;
      T011P26_A3915EmpNumDec = new byte[1] ;
      T011P26_n3915EmpNumDec = new boolean[] {false} ;
      T011P27_A6311Lb_TaAuxD = new String[] {""} ;
      T011P29_A7259PrdHorMax = new byte[1] ;
      T011P29_n7259PrdHorMax = new boolean[] {false} ;
      T011P31_A5166CosKgmF = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T011P31_n5166CosKgmF = new boolean[] {false} ;
      T011P33_A5361ForCanSum = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T011P33_n5361ForCanSum = new boolean[] {false} ;
      T011P34_A396EmprCod = new String[] {""} ;
      T011P34_A486ForNumCol = new int[1] ;
      T011P13_A486ForNumCol = new int[1] ;
      T011P13_A310ColUltLin = new short[1] ;
      T011P13_A315ContNum = new int[1] ;
      T011P13_A318CosKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T011P13_A6369Lb_fam1 = new byte[1] ;
      T011P13_A6370Lb_fam2 = new byte[1] ;
      T011P13_A6371Lb_fam3 = new byte[1] ;
      T011P13_A396EmprCod = new String[] {""} ;
      T011P13_A6310Lb_TaAuxC = new String[] {""} ;
      T011P13_n6310Lb_TaAuxC = new boolean[] {false} ;
      sMode32 = "" ;
      T011P35_A396EmprCod = new String[] {""} ;
      T011P35_A486ForNumCol = new int[1] ;
      T011P36_A396EmprCod = new String[] {""} ;
      T011P36_A486ForNumCol = new int[1] ;
      T011P12_A486ForNumCol = new int[1] ;
      T011P12_A310ColUltLin = new short[1] ;
      T011P12_A315ContNum = new int[1] ;
      T011P12_A318CosKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T011P12_A6369Lb_fam1 = new byte[1] ;
      T011P12_A6370Lb_fam2 = new byte[1] ;
      T011P12_A6371Lb_fam3 = new byte[1] ;
      T011P12_A396EmprCod = new String[] {""} ;
      T011P12_A6310Lb_TaAuxC = new String[] {""} ;
      T011P12_n6310Lb_TaAuxC = new boolean[] {false} ;
      T011P40_A407EmprNom = new String[] {""} ;
      T011P40_n407EmprNom = new boolean[] {false} ;
      T011P40_A3915EmpNumDec = new byte[1] ;
      T011P40_n3915EmpNumDec = new boolean[] {false} ;
      T011P42_A7259PrdHorMax = new byte[1] ;
      T011P42_n7259PrdHorMax = new boolean[] {false} ;
      T011P44_A5166CosKgmF = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T011P44_n5166CosKgmF = new boolean[] {false} ;
      T011P46_A5361ForCanSum = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T011P46_n5361ForCanSum = new boolean[] {false} ;
      T011P47_A6311Lb_TaAuxD = new String[] {""} ;
      T011P48_A396EmprCod = new String[] {""} ;
      T011P48_A486ForNumCol = new int[1] ;
      T011P48_A715PrdLin = new short[1] ;
      T011P49_A396EmprCod = new String[] {""} ;
      T011P49_A252CliCod = new int[1] ;
      T011P49_A494ForSer = new String[] {""} ;
      T011P49_A482ForColNom = new String[] {""} ;
      T011P49_A483ForColNum = new int[1] ;
      T011P49_A831TipColCod = new byte[1] ;
      T011P50_A396EmprCod = new String[] {""} ;
      T011P50_A486ForNumCol = new int[1] ;
      Z718PrdNom = "" ;
      Z724PrdPreAct = DecimalUtil.ZERO ;
      Z707PrdFacCon = DecimalUtil.ZERO ;
      Z488ForPrdDsc = "" ;
      T011P51_A486ForNumCol = new int[1] ;
      T011P51_A309ColLin = new short[1] ;
      T011P51_A718PrdNom = new String[] {""} ;
      T011P51_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T011P51_A488ForPrdDsc = new String[] {""} ;
      T011P51_n488ForPrdDsc = new boolean[] {false} ;
      T011P51_A481ForCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T011P51_A838TotLinCol = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T011P51_A4338PrdUMeFo = new byte[1] ;
      T011P51_A6193ForClaCol = new String[] {""} ;
      T011P51_A7260PrdHorMad = new byte[1] ;
      T011P51_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T011P51_A396EmprCod = new String[] {""} ;
      T011P51_A719PrdNum = new String[] {""} ;
      T011P51_A490ForPrdUMe = new byte[1] ;
      T011P51_A856ValCod = new byte[1] ;
      T011P9_A6223PrdNumMax = new String[] {""} ;
      T011P9_n6223PrdNumMax = new boolean[] {false} ;
      T011P10_A718PrdNom = new String[] {""} ;
      T011P10_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T011P10_A4338PrdUMeFo = new byte[1] ;
      T011P10_A7260PrdHorMad = new byte[1] ;
      T011P10_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T011P10_A856ValCod = new byte[1] ;
      T011P11_A488ForPrdDsc = new String[] {""} ;
      T011P11_n488ForPrdDsc = new boolean[] {false} ;
      T011P52_A718PrdNom = new String[] {""} ;
      T011P52_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T011P52_A4338PrdUMeFo = new byte[1] ;
      T011P52_A7260PrdHorMad = new byte[1] ;
      T011P52_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T011P52_A856ValCod = new byte[1] ;
      T011P53_A488ForPrdDsc = new String[] {""} ;
      T011P53_n488ForPrdDsc = new boolean[] {false} ;
      T011P59_A6223PrdNumMax = new String[] {""} ;
      T011P59_n6223PrdNumMax = new boolean[] {false} ;
      T011P60_A396EmprCod = new String[] {""} ;
      T011P60_A486ForNumCol = new int[1] ;
      T011P60_A309ColLin = new short[1] ;
      T011P3_A486ForNumCol = new int[1] ;
      T011P3_A309ColLin = new short[1] ;
      T011P3_A481ForCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T011P3_A838TotLinCol = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T011P3_A6193ForClaCol = new String[] {""} ;
      T011P3_A396EmprCod = new String[] {""} ;
      T011P3_A719PrdNum = new String[] {""} ;
      T011P3_A490ForPrdUMe = new byte[1] ;
      T011P2_A486ForNumCol = new int[1] ;
      T011P2_A309ColLin = new short[1] ;
      T011P2_A481ForCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T011P2_A838TotLinCol = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T011P2_A6193ForClaCol = new String[] {""} ;
      T011P2_A396EmprCod = new String[] {""} ;
      T011P2_A719PrdNum = new String[] {""} ;
      T011P2_A490ForPrdUMe = new byte[1] ;
      T011P69_A6223PrdNumMax = new String[] {""} ;
      T011P69_n6223PrdNumMax = new boolean[] {false} ;
      T011P70_A718PrdNom = new String[] {""} ;
      T011P70_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T011P70_A4338PrdUMeFo = new byte[1] ;
      T011P70_A7260PrdHorMad = new byte[1] ;
      T011P70_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T011P70_A856ValCod = new byte[1] ;
      T011P71_A488ForPrdDsc = new String[] {""} ;
      T011P71_n488ForPrdDsc = new boolean[] {false} ;
      T011P72_A396EmprCod = new String[] {""} ;
      T011P72_A486ForNumCol = new int[1] ;
      T011P72_A309ColLin = new short[1] ;
      Gridtdforma_level1itemRow = new com.genexus.webpanels.GXWebRow();
      subGridtdforma_level1item_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Gridtdforma_level1itemColumn = new com.genexus.webpanels.GXWebColumn();
      Z6220EmprCodV3 = "" ;
      ZZ396EmprCod = "" ;
      ZZ318CosKgm = DecimalUtil.ZERO ;
      ZZ6310Lb_TaAuxC = "" ;
      ZZ407EmprNom = "" ;
      ZZ6311Lb_TaAuxD = "" ;
      ZZ6220EmprCodV3 = "" ;
      ZZ5166CosKgmF = DecimalUtil.ZERO ;
      ZZ5361ForCanSum = DecimalUtil.ZERO ;
      ZO5166CosKgmF = DecimalUtil.ZERO ;
      ZO5361ForCanSum = DecimalUtil.ZERO ;
      Z6223PrdNumMax = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tdforma__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tdforma__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tdforma__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tdforma__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tdforma__default(),
         new Object[] {
             new Object[] {
            T011P2_A486ForNumCol, T011P2_A309ColLin, T011P2_A481ForCan, T011P2_A838TotLinCol, T011P2_A6193ForClaCol, T011P2_A396EmprCod, T011P2_A719PrdNum, T011P2_A490ForPrdUMe
            }
            , new Object[] {
            T011P3_A486ForNumCol, T011P3_A309ColLin, T011P3_A481ForCan, T011P3_A838TotLinCol, T011P3_A6193ForClaCol, T011P3_A396EmprCod, T011P3_A719PrdNum, T011P3_A490ForPrdUMe
            }
            , new Object[] {
            T011P9_A6223PrdNumMax, T011P9_n6223PrdNumMax
            }
            , new Object[] {
            T011P10_A718PrdNom, T011P10_A724PrdPreAct, T011P10_A4338PrdUMeFo, T011P10_A7260PrdHorMad, T011P10_A707PrdFacCon, T011P10_A856ValCod
            }
            , new Object[] {
            T011P11_A488ForPrdDsc, T011P11_n488ForPrdDsc
            }
            , new Object[] {
            T011P12_A486ForNumCol, T011P12_A310ColUltLin, T011P12_A315ContNum, T011P12_A318CosKgm, T011P12_A6369Lb_fam1, T011P12_A6370Lb_fam2, T011P12_A6371Lb_fam3, T011P12_A396EmprCod, T011P12_A6310Lb_TaAuxC, T011P12_n6310Lb_TaAuxC
            }
            , new Object[] {
            T011P13_A486ForNumCol, T011P13_A310ColUltLin, T011P13_A315ContNum, T011P13_A318CosKgm, T011P13_A6369Lb_fam1, T011P13_A6370Lb_fam2, T011P13_A6371Lb_fam3, T011P13_A396EmprCod, T011P13_A6310Lb_TaAuxC, T011P13_n6310Lb_TaAuxC
            }
            , new Object[] {
            T011P14_A407EmprNom, T011P14_n407EmprNom, T011P14_A3915EmpNumDec, T011P14_n3915EmpNumDec
            }
            , new Object[] {
            T011P15_A6311Lb_TaAuxD
            }
            , new Object[] {
            T011P17_A7259PrdHorMax, T011P17_n7259PrdHorMax
            }
            , new Object[] {
            T011P19_A5166CosKgmF, T011P19_n5166CosKgmF
            }
            , new Object[] {
            T011P21_A5361ForCanSum, T011P21_n5361ForCanSum
            }
            , new Object[] {
            T011P25_A486ForNumCol, T011P25_A310ColUltLin, T011P25_A315ContNum, T011P25_A318CosKgm, T011P25_A407EmprNom, T011P25_n407EmprNom, T011P25_A3915EmpNumDec, T011P25_n3915EmpNumDec, T011P25_A6311Lb_TaAuxD, T011P25_A6369Lb_fam1,
            T011P25_A6370Lb_fam2, T011P25_A6371Lb_fam3, T011P25_A396EmprCod, T011P25_A6310Lb_TaAuxC, T011P25_n6310Lb_TaAuxC, T011P25_A5166CosKgmF, T011P25_n5166CosKgmF, T011P25_A5361ForCanSum, T011P25_n5361ForCanSum, T011P25_A7259PrdHorMax,
            T011P25_n7259PrdHorMax
            }
            , new Object[] {
            T011P26_A407EmprNom, T011P26_n407EmprNom, T011P26_A3915EmpNumDec, T011P26_n3915EmpNumDec
            }
            , new Object[] {
            T011P27_A6311Lb_TaAuxD
            }
            , new Object[] {
            T011P29_A7259PrdHorMax, T011P29_n7259PrdHorMax
            }
            , new Object[] {
            T011P31_A5166CosKgmF, T011P31_n5166CosKgmF
            }
            , new Object[] {
            T011P33_A5361ForCanSum, T011P33_n5361ForCanSum
            }
            , new Object[] {
            T011P34_A396EmprCod, T011P34_A486ForNumCol
            }
            , new Object[] {
            T011P35_A396EmprCod, T011P35_A486ForNumCol
            }
            , new Object[] {
            T011P36_A396EmprCod, T011P36_A486ForNumCol
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T011P40_A407EmprNom, T011P40_n407EmprNom, T011P40_A3915EmpNumDec, T011P40_n3915EmpNumDec
            }
            , new Object[] {
            T011P42_A7259PrdHorMax, T011P42_n7259PrdHorMax
            }
            , new Object[] {
            T011P44_A5166CosKgmF, T011P44_n5166CosKgmF
            }
            , new Object[] {
            T011P46_A5361ForCanSum, T011P46_n5361ForCanSum
            }
            , new Object[] {
            T011P47_A6311Lb_TaAuxD
            }
            , new Object[] {
            T011P48_A396EmprCod, T011P48_A486ForNumCol, T011P48_A715PrdLin
            }
            , new Object[] {
            T011P49_A396EmprCod, T011P49_A252CliCod, T011P49_A494ForSer, T011P49_A482ForColNom, T011P49_A483ForColNum, T011P49_A831TipColCod
            }
            , new Object[] {
            T011P50_A396EmprCod, T011P50_A486ForNumCol
            }
            , new Object[] {
            T011P51_A486ForNumCol, T011P51_A309ColLin, T011P51_A718PrdNom, T011P51_A724PrdPreAct, T011P51_A488ForPrdDsc, T011P51_n488ForPrdDsc, T011P51_A481ForCan, T011P51_A838TotLinCol, T011P51_A4338PrdUMeFo, T011P51_A6193ForClaCol,
            T011P51_A7260PrdHorMad, T011P51_A707PrdFacCon, T011P51_A396EmprCod, T011P51_A719PrdNum, T011P51_A490ForPrdUMe, T011P51_A856ValCod
            }
            , new Object[] {
            T011P52_A718PrdNom, T011P52_A724PrdPreAct, T011P52_A4338PrdUMeFo, T011P52_A7260PrdHorMad, T011P52_A707PrdFacCon, T011P52_A856ValCod
            }
            , new Object[] {
            T011P53_A488ForPrdDsc, T011P53_n488ForPrdDsc
            }
            , new Object[] {
            T011P59_A6223PrdNumMax, T011P59_n6223PrdNumMax
            }
            , new Object[] {
            T011P60_A396EmprCod, T011P60_A486ForNumCol, T011P60_A309ColLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T011P69_A6223PrdNumMax, T011P69_n6223PrdNumMax
            }
            , new Object[] {
            T011P70_A718PrdNom, T011P70_A724PrdPreAct, T011P70_A4338PrdUMeFo, T011P70_A7260PrdHorMad, T011P70_A707PrdFacCon, T011P70_A856ValCod
            }
            , new Object[] {
            T011P71_A488ForPrdDsc, T011P71_n488ForPrdDsc
            }
            , new Object[] {
            T011P72_A396EmprCod, T011P72_A486ForNumCol, T011P72_A309ColLin
            }
         }
      );
   }

   private byte Z6369Lb_fam1 ;
   private byte Z6370Lb_fam2 ;
   private byte Z6371Lb_fam3 ;
   private byte Z490ForPrdUMe ;
   private byte GxWebError ;
   private byte A490ForPrdUMe ;
   private byte nKeyPressed ;
   private byte A3915EmpNumDec ;
   private byte A6369Lb_fam1 ;
   private byte A6370Lb_fam2 ;
   private byte A6371Lb_fam3 ;
   private byte A7259PrdHorMax ;
   private byte A856ValCod ;
   private byte A4338PrdUMeFo ;
   private byte A7260PrdHorMad ;
   private byte Z3915EmpNumDec ;
   private byte Z7259PrdHorMax ;
   private byte Gx_BScreen ;
   private byte Z4338PrdUMeFo ;
   private byte Z7260PrdHorMad ;
   private byte Z856ValCod ;
   private byte subGridtdforma_level1item_Backcolorstyle ;
   private byte subGridtdforma_level1item_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGridtdforma_level1item_Allowselection ;
   private byte subGridtdforma_level1item_Allowhovering ;
   private byte subGridtdforma_level1item_Allowcollapsing ;
   private byte subGridtdforma_level1item_Collapsed ;
   private byte ZZ6369Lb_fam1 ;
   private byte ZZ6370Lb_fam2 ;
   private byte ZZ6371Lb_fam3 ;
   private byte ZZ3915EmpNumDec ;
   private byte ZZ7259PrdHorMax ;
   private short Z310ColUltLin ;
   private short Z309ColLin ;
   private short nRcdDeleted_33 ;
   private short nRcdExists_33 ;
   private short nIsMod_33 ;
   private short A309ColLin ;
   private short A6222ColLinV ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A310ColUltLin ;
   private short nBlankRcdCount33 ;
   private short RcdFound33 ;
   private short nBlankRcdUsr33 ;
   private short RcdFound32 ;
   private short nIsDirty_32 ;
   private short nIsDirty_33 ;
   private short ZZ310ColUltLin ;
   private short Z6222ColLinV ;
   private int Z486ForNumCol ;
   private int Z315ContNum ;
   private int nRC_GXsfl_123 ;
   private int nGXsfl_123_idx=1 ;
   private int A486ForNumCol ;
   private int A6221ForNumColV ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtForNumCol_Enabled ;
   private int edtColUltLin_Enabled ;
   private int A315ContNum ;
   private int edtContNum_Enabled ;
   private int edtCosKgm_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtEmpNumDec_Enabled ;
   private int edtCosKgmF_Enabled ;
   private int edtForCanSum_Enabled ;
   private int edtEmprCodV3_Enabled ;
   private int edtForNumColV_Enabled ;
   private int edtLb_TaAuxC_Enabled ;
   private int edtLb_TaAuxD_Enabled ;
   private int edtLb_fam1_Enabled ;
   private int edtLb_fam2_Enabled ;
   private int edtLb_fam3_Enabled ;
   private int edtPrdHorMax_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int edtColLin_Enabled ;
   private int edtPrdNum_Enabled ;
   private int edtPrdNom_Enabled ;
   private int edtValCod_Enabled ;
   private int edtPrdPreAct_Enabled ;
   private int edtForPrdUMe_Enabled ;
   private int edtForPrdDsc_Enabled ;
   private int edtForCan_Enabled ;
   private int edtTotLinCol_Enabled ;
   private int edtPrdUMeFo_Enabled ;
   private int edtTotLinCoF_Enabled ;
   private int edtForClaCol_Enabled ;
   private int edtColLinV_Enabled ;
   private int edtPrdNumMax_Enabled ;
   private int edtPrdHorMad_Enabled ;
   private int fRowAdded ;
   private int GX_JID ;
   private int subGridtdforma_level1item_Backcolor ;
   private int subGridtdforma_level1item_Allbackcolor ;
   private int defedtColLin_Enabled ;
   private int idxLst ;
   private int subGridtdforma_level1item_Selectedindex ;
   private int subGridtdforma_level1item_Selectioncolor ;
   private int subGridtdforma_level1item_Hoveringcolor ;
   private int Z6221ForNumColV ;
   private int ZZ486ForNumCol ;
   private int ZZ315ContNum ;
   private int ZZ6221ForNumColV ;
   private long GRIDTDFORMA_LEVEL1ITEM_nFirstRecordOnPage ;
   private java.math.BigDecimal Z318CosKgm ;
   private java.math.BigDecimal O5166CosKgmF ;
   private java.math.BigDecimal O5361ForCanSum ;
   private java.math.BigDecimal Z481ForCan ;
   private java.math.BigDecimal Z838TotLinCol ;
   private java.math.BigDecimal O5167TotLinCoF ;
   private java.math.BigDecimal O481ForCan ;
   private java.math.BigDecimal A318CosKgm ;
   private java.math.BigDecimal A5166CosKgmF ;
   private java.math.BigDecimal A5361ForCanSum ;
   private java.math.BigDecimal B5166CosKgmF ;
   private java.math.BigDecimal B5361ForCanSum ;
   private java.math.BigDecimal A707PrdFacCon ;
   private java.math.BigDecimal s5166CosKgmF ;
   private java.math.BigDecimal s5361ForCanSum ;
   private java.math.BigDecimal A724PrdPreAct ;
   private java.math.BigDecimal A481ForCan ;
   private java.math.BigDecimal A838TotLinCol ;
   private java.math.BigDecimal A5167TotLinCoF ;
   private java.math.BigDecimal T5167TotLinCoF ;
   private java.math.BigDecimal T481ForCan ;
   private java.math.BigDecimal Z5166CosKgmF ;
   private java.math.BigDecimal Z5361ForCanSum ;
   private java.math.BigDecimal Z724PrdPreAct ;
   private java.math.BigDecimal Z707PrdFacCon ;
   private java.math.BigDecimal ZZ318CosKgm ;
   private java.math.BigDecimal ZZ5166CosKgmF ;
   private java.math.BigDecimal ZZ5361ForCanSum ;
   private java.math.BigDecimal ZO5166CosKgmF ;
   private java.math.BigDecimal ZO5361ForCanSum ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z6310Lb_TaAuxC ;
   private String Z6193ForClaCol ;
   private String Z719PrdNum ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A6310Lb_TaAuxC ;
   private String A719PrdNum ;
   private String A6220EmprCodV3 ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtEmprCod_Internalname ;
   private String sGXsfl_123_idx="0001" ;
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
   private String edtEmprCod_Jsonclick ;
   private String edtForNumCol_Internalname ;
   private String edtForNumCol_Jsonclick ;
   private String edtColUltLin_Internalname ;
   private String edtColUltLin_Jsonclick ;
   private String edtContNum_Internalname ;
   private String edtContNum_Jsonclick ;
   private String edtCosKgm_Internalname ;
   private String edtCosKgm_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String edtEmpNumDec_Internalname ;
   private String edtEmpNumDec_Jsonclick ;
   private String edtCosKgmF_Internalname ;
   private String edtCosKgmF_Jsonclick ;
   private String edtForCanSum_Internalname ;
   private String edtForCanSum_Jsonclick ;
   private String edtEmprCodV3_Internalname ;
   private String edtEmprCodV3_Jsonclick ;
   private String edtForNumColV_Internalname ;
   private String edtForNumColV_Jsonclick ;
   private String edtLb_TaAuxC_Internalname ;
   private String edtLb_TaAuxC_Jsonclick ;
   private String edtLb_TaAuxD_Internalname ;
   private String A6311Lb_TaAuxD ;
   private String edtLb_TaAuxD_Jsonclick ;
   private String edtLb_fam1_Internalname ;
   private String edtLb_fam1_Jsonclick ;
   private String edtLb_fam2_Internalname ;
   private String edtLb_fam2_Jsonclick ;
   private String edtLb_fam3_Internalname ;
   private String edtLb_fam3_Jsonclick ;
   private String edtPrdHorMax_Internalname ;
   private String edtPrdHorMax_Jsonclick ;
   private String divLevel1table_Internalname ;
   private String lblTitlelevel1_Internalname ;
   private String lblTitlelevel1_Jsonclick ;
   private String bttBtn_enter_Internalname ;
   private String bttBtn_enter_Jsonclick ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String bttBtn_delete_Internalname ;
   private String bttBtn_delete_Jsonclick ;
   private String sMode33 ;
   private String edtColLin_Internalname ;
   private String edtPrdNum_Internalname ;
   private String edtPrdNom_Internalname ;
   private String edtValCod_Internalname ;
   private String edtPrdPreAct_Internalname ;
   private String edtForPrdUMe_Internalname ;
   private String edtForPrdDsc_Internalname ;
   private String edtForCan_Internalname ;
   private String edtTotLinCol_Internalname ;
   private String edtPrdUMeFo_Internalname ;
   private String edtTotLinCoF_Internalname ;
   private String edtForClaCol_Internalname ;
   private String edtColLinV_Internalname ;
   private String edtPrdNumMax_Internalname ;
   private String edtPrdHorMad_Internalname ;
   private String sStyleString ;
   private String subGridtdforma_level1item_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String GXCCtl ;
   private String A718PrdNom ;
   private String A488ForPrdDsc ;
   private String A6193ForClaCol ;
   private String A6223PrdNumMax ;
   private String Z407EmprNom ;
   private String Z6311Lb_TaAuxD ;
   private String sMode32 ;
   private String Z718PrdNom ;
   private String Z488ForPrdDsc ;
   private String sGXsfl_123_fel_idx="0001" ;
   private String subGridtdforma_level1item_Class ;
   private String subGridtdforma_level1item_Linesclass ;
   private String ROClassString ;
   private String edtColLin_Jsonclick ;
   private String edtPrdNum_Jsonclick ;
   private String edtPrdNom_Jsonclick ;
   private String edtValCod_Jsonclick ;
   private String edtPrdPreAct_Jsonclick ;
   private String edtForPrdUMe_Jsonclick ;
   private String edtForPrdDsc_Jsonclick ;
   private String edtForCan_Jsonclick ;
   private String edtTotLinCol_Jsonclick ;
   private String edtPrdUMeFo_Jsonclick ;
   private String edtTotLinCoF_Jsonclick ;
   private String edtForClaCol_Jsonclick ;
   private String edtColLinV_Jsonclick ;
   private String edtPrdNumMax_Jsonclick ;
   private String edtPrdHorMad_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGridtdforma_level1item_Header ;
   private String Z6220EmprCodV3 ;
   private String ZZ396EmprCod ;
   private String ZZ6310Lb_TaAuxC ;
   private String ZZ407EmprNom ;
   private String ZZ6311Lb_TaAuxD ;
   private String ZZ6220EmprCodV3 ;
   private String Z6223PrdNumMax ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n6310Lb_TaAuxC ;
   private boolean wbErr ;
   private boolean n5166CosKgmF ;
   private boolean n5361ForCanSum ;
   private boolean bGXsfl_123_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean n3915EmpNumDec ;
   private boolean n7259PrdHorMax ;
   private boolean Gx_longc ;
   private boolean n488ForPrdDsc ;
   private boolean n6223PrdNumMax ;
   private com.genexus.webpanels.GXWebGrid Gridtdforma_level1itemContainer ;
   private com.genexus.webpanels.GXWebRow Gridtdforma_level1itemRow ;
   private com.genexus.webpanels.GXWebColumn Gridtdforma_level1itemColumn ;
   private IDataStoreProvider pr_default ;
   private int[] T011P25_A486ForNumCol ;
   private short[] T011P25_A310ColUltLin ;
   private int[] T011P25_A315ContNum ;
   private java.math.BigDecimal[] T011P25_A318CosKgm ;
   private String[] T011P25_A407EmprNom ;
   private boolean[] T011P25_n407EmprNom ;
   private byte[] T011P25_A3915EmpNumDec ;
   private boolean[] T011P25_n3915EmpNumDec ;
   private String[] T011P25_A6311Lb_TaAuxD ;
   private byte[] T011P25_A6369Lb_fam1 ;
   private byte[] T011P25_A6370Lb_fam2 ;
   private byte[] T011P25_A6371Lb_fam3 ;
   private String[] T011P25_A396EmprCod ;
   private String[] T011P25_A6310Lb_TaAuxC ;
   private boolean[] T011P25_n6310Lb_TaAuxC ;
   private java.math.BigDecimal[] T011P25_A5166CosKgmF ;
   private boolean[] T011P25_n5166CosKgmF ;
   private java.math.BigDecimal[] T011P25_A5361ForCanSum ;
   private boolean[] T011P25_n5361ForCanSum ;
   private byte[] T011P25_A7259PrdHorMax ;
   private boolean[] T011P25_n7259PrdHorMax ;
   private String[] T011P14_A407EmprNom ;
   private boolean[] T011P14_n407EmprNom ;
   private byte[] T011P14_A3915EmpNumDec ;
   private boolean[] T011P14_n3915EmpNumDec ;
   private String[] T011P15_A6311Lb_TaAuxD ;
   private byte[] T011P17_A7259PrdHorMax ;
   private boolean[] T011P17_n7259PrdHorMax ;
   private java.math.BigDecimal[] T011P19_A5166CosKgmF ;
   private boolean[] T011P19_n5166CosKgmF ;
   private java.math.BigDecimal[] T011P21_A5361ForCanSum ;
   private boolean[] T011P21_n5361ForCanSum ;
   private String[] T011P26_A407EmprNom ;
   private boolean[] T011P26_n407EmprNom ;
   private byte[] T011P26_A3915EmpNumDec ;
   private boolean[] T011P26_n3915EmpNumDec ;
   private String[] T011P27_A6311Lb_TaAuxD ;
   private byte[] T011P29_A7259PrdHorMax ;
   private boolean[] T011P29_n7259PrdHorMax ;
   private java.math.BigDecimal[] T011P31_A5166CosKgmF ;
   private boolean[] T011P31_n5166CosKgmF ;
   private java.math.BigDecimal[] T011P33_A5361ForCanSum ;
   private boolean[] T011P33_n5361ForCanSum ;
   private String[] T011P34_A396EmprCod ;
   private int[] T011P34_A486ForNumCol ;
   private int[] T011P13_A486ForNumCol ;
   private short[] T011P13_A310ColUltLin ;
   private int[] T011P13_A315ContNum ;
   private java.math.BigDecimal[] T011P13_A318CosKgm ;
   private byte[] T011P13_A6369Lb_fam1 ;
   private byte[] T011P13_A6370Lb_fam2 ;
   private byte[] T011P13_A6371Lb_fam3 ;
   private String[] T011P13_A396EmprCod ;
   private String[] T011P13_A6310Lb_TaAuxC ;
   private boolean[] T011P13_n6310Lb_TaAuxC ;
   private String[] T011P35_A396EmprCod ;
   private int[] T011P35_A486ForNumCol ;
   private String[] T011P36_A396EmprCod ;
   private int[] T011P36_A486ForNumCol ;
   private int[] T011P12_A486ForNumCol ;
   private short[] T011P12_A310ColUltLin ;
   private int[] T011P12_A315ContNum ;
   private java.math.BigDecimal[] T011P12_A318CosKgm ;
   private byte[] T011P12_A6369Lb_fam1 ;
   private byte[] T011P12_A6370Lb_fam2 ;
   private byte[] T011P12_A6371Lb_fam3 ;
   private String[] T011P12_A396EmprCod ;
   private String[] T011P12_A6310Lb_TaAuxC ;
   private boolean[] T011P12_n6310Lb_TaAuxC ;
   private String[] T011P40_A407EmprNom ;
   private boolean[] T011P40_n407EmprNom ;
   private byte[] T011P40_A3915EmpNumDec ;
   private boolean[] T011P40_n3915EmpNumDec ;
   private byte[] T011P42_A7259PrdHorMax ;
   private boolean[] T011P42_n7259PrdHorMax ;
   private java.math.BigDecimal[] T011P44_A5166CosKgmF ;
   private boolean[] T011P44_n5166CosKgmF ;
   private java.math.BigDecimal[] T011P46_A5361ForCanSum ;
   private boolean[] T011P46_n5361ForCanSum ;
   private String[] T011P47_A6311Lb_TaAuxD ;
   private String[] T011P48_A396EmprCod ;
   private int[] T011P48_A486ForNumCol ;
   private short[] T011P48_A715PrdLin ;
   private String[] T011P49_A396EmprCod ;
   private int[] T011P49_A252CliCod ;
   private String[] T011P49_A494ForSer ;
   private String[] T011P49_A482ForColNom ;
   private int[] T011P49_A483ForColNum ;
   private byte[] T011P49_A831TipColCod ;
   private String[] T011P50_A396EmprCod ;
   private int[] T011P50_A486ForNumCol ;
   private int[] T011P51_A486ForNumCol ;
   private short[] T011P51_A309ColLin ;
   private String[] T011P51_A718PrdNom ;
   private java.math.BigDecimal[] T011P51_A724PrdPreAct ;
   private String[] T011P51_A488ForPrdDsc ;
   private boolean[] T011P51_n488ForPrdDsc ;
   private java.math.BigDecimal[] T011P51_A481ForCan ;
   private java.math.BigDecimal[] T011P51_A838TotLinCol ;
   private byte[] T011P51_A4338PrdUMeFo ;
   private String[] T011P51_A6193ForClaCol ;
   private byte[] T011P51_A7260PrdHorMad ;
   private java.math.BigDecimal[] T011P51_A707PrdFacCon ;
   private String[] T011P51_A396EmprCod ;
   private String[] T011P51_A719PrdNum ;
   private byte[] T011P51_A490ForPrdUMe ;
   private byte[] T011P51_A856ValCod ;
   private String[] T011P9_A6223PrdNumMax ;
   private boolean[] T011P9_n6223PrdNumMax ;
   private String[] T011P10_A718PrdNom ;
   private java.math.BigDecimal[] T011P10_A724PrdPreAct ;
   private byte[] T011P10_A4338PrdUMeFo ;
   private byte[] T011P10_A7260PrdHorMad ;
   private java.math.BigDecimal[] T011P10_A707PrdFacCon ;
   private byte[] T011P10_A856ValCod ;
   private String[] T011P11_A488ForPrdDsc ;
   private boolean[] T011P11_n488ForPrdDsc ;
   private String[] T011P52_A718PrdNom ;
   private java.math.BigDecimal[] T011P52_A724PrdPreAct ;
   private byte[] T011P52_A4338PrdUMeFo ;
   private byte[] T011P52_A7260PrdHorMad ;
   private java.math.BigDecimal[] T011P52_A707PrdFacCon ;
   private byte[] T011P52_A856ValCod ;
   private String[] T011P53_A488ForPrdDsc ;
   private boolean[] T011P53_n488ForPrdDsc ;
   private String[] T011P59_A6223PrdNumMax ;
   private boolean[] T011P59_n6223PrdNumMax ;
   private String[] T011P60_A396EmprCod ;
   private int[] T011P60_A486ForNumCol ;
   private short[] T011P60_A309ColLin ;
   private int[] T011P3_A486ForNumCol ;
   private short[] T011P3_A309ColLin ;
   private java.math.BigDecimal[] T011P3_A481ForCan ;
   private java.math.BigDecimal[] T011P3_A838TotLinCol ;
   private String[] T011P3_A6193ForClaCol ;
   private String[] T011P3_A396EmprCod ;
   private String[] T011P3_A719PrdNum ;
   private byte[] T011P3_A490ForPrdUMe ;
   private int[] T011P2_A486ForNumCol ;
   private short[] T011P2_A309ColLin ;
   private java.math.BigDecimal[] T011P2_A481ForCan ;
   private java.math.BigDecimal[] T011P2_A838TotLinCol ;
   private String[] T011P2_A6193ForClaCol ;
   private String[] T011P2_A396EmprCod ;
   private String[] T011P2_A719PrdNum ;
   private byte[] T011P2_A490ForPrdUMe ;
   private String[] T011P69_A6223PrdNumMax ;
   private boolean[] T011P69_n6223PrdNumMax ;
   private String[] T011P70_A718PrdNom ;
   private java.math.BigDecimal[] T011P70_A724PrdPreAct ;
   private byte[] T011P70_A4338PrdUMeFo ;
   private byte[] T011P70_A7260PrdHorMad ;
   private java.math.BigDecimal[] T011P70_A707PrdFacCon ;
   private byte[] T011P70_A856ValCod ;
   private String[] T011P71_A488ForPrdDsc ;
   private boolean[] T011P71_n488ForPrdDsc ;
   private String[] T011P72_A396EmprCod ;
   private int[] T011P72_A486ForNumCol ;
   private short[] T011P72_A309ColLin ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tdforma__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdforma__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdforma__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdforma__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdforma__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T011P2", "SELECT ForNumCol, ColLin, ForCan, TotLinCol, ForClaCol, EmprCod, PrdNum, ForPrdUMe FROM TXPLDFORM WHERE EmprCod = ? AND ForNumCol = ? AND ColLin = ?  FOR UPDATE OF ForCan, TotLinCol, ForClaCol, PrdNum, ForPrdUMe NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T011P3", "SELECT ForNumCol, ColLin, ForCan, TotLinCol, ForClaCol, EmprCod, PrdNum, ForPrdUMe FROM TXPLDFORM WHERE EmprCod = ? AND ForNumCol = ? AND ColLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T011P9", "SELECT COALESCE( T1.PrdNumMax, '') AS PrdNumMax FROM (SELECT CASE  WHEN Not (? = 0) THEN COALESCE( T3.GXC1, '      ') ELSE COALESCE( T2.GXC2, '      ') END AS PrdNumMax FROM (SELECT T4.PrdNum AS GXC2, T4.ColLin, T5.GXC5 AS GXC5, T4.EmprCod, T4.ForNumCol FROM TXPLDFORM T4 FULL OUTER JOIN  (SELECT MAX(ColLin) AS GXC5 FROM TXPLDFORM WHERE (EmprCod = ?) AND (ForNumCol = ?) ) T5 ON 1=1 WHERE (T4.ColLin = T5.GXC5) AND (T4.EmprCod = ?) AND (T4.ForNumCol = ?) ) T2 FULL OUTER JOIN  (SELECT T4.PrdNum AS GXC1, T4.ColLin, T5.GXC4 AS GXC4, T4.EmprCod, T4.ForNumCol FROM TXPLDFORM T4 FULL OUTER JOIN  (SELECT MAX(ColLin) AS GXC4 FROM TXPLDFORM WHERE (ColLin < ?) AND (EmprCod = ?) AND (ForNumCol = ?) ) T5 ON 1=1 WHERE (T4.ColLin = T5.GXC4) AND (T4.ColLin < ?) AND (T4.EmprCod = ?) AND (T4.ForNumCol = ?) ) T3 ON 1=1 ) T1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T011P10", "SELECT PrdNom, PrdPreAct, PrdUMeFo, PrdHorMad, PrdFacCon, ValCod FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T011P11", "SELECT ForPrdDsc FROM TXPUNMEPR WHERE EmprCod = ? AND ForPrdUMe = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T011P12", "SELECT ForNumCol, ColUltLin, ContNum, CosKgm, Lb_fam1, Lb_fam2, Lb_fam3, EmprCod, Lb_TaAuxC FROM TXPCDFORM WHERE EmprCod = ? AND ForNumCol = ?  FOR UPDATE OF ColUltLin, ContNum, CosKgm, Lb_fam1, Lb_fam2, Lb_fam3, Lb_TaAuxC NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T011P13", "SELECT ForNumCol, ColUltLin, ContNum, CosKgm, Lb_fam1, Lb_fam2, Lb_fam3, EmprCod, Lb_TaAuxC FROM TXPCDFORM WHERE EmprCod = ? AND ForNumCol = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T011P14", "SELECT EmprNom, EmpNumDec FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T011P15", "SELECT Lb_TaAuxD FROM TXPENS005 WHERE EmprCod = ? AND Lb_TaAuxC = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T011P17", "SELECT COALESCE( T1.PrdHorMax, 0) AS PrdHorMax FROM (SELECT MAX(PrdHorMad) AS PrdHorMax, EmprCod FROM TXPPRODUC WHERE PrdHorMad > 0 GROUP BY EmprCod ) T1 WHERE T1.EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T011P19", "SELECT COALESCE( T1.CosKgmF, 0) AS CosKgmF FROM (SELECT SUM(( CAST(T4.ContNum * CAST(T2.ForCan AS NUMERIC(21,10)) / 1000 AS NUMERIC(25,10))) * CAST(T3.PrdPreAct * CAST(T3.PrdFacCon AS NUMERIC(24,10)) AS NUMERIC(27,10))) AS CosKgmF, T2.EmprCod, T2.ForNumCol FROM ((TXPLDFORM T2 INNER JOIN TXPPRODUC T3 ON T3.EmprCod = T2.EmprCod AND T3.PrdNum = T2.PrdNum) INNER JOIN TXPCDFORM T4 ON T4.EmprCod = T2.EmprCod AND T4.ForNumCol = T2.ForNumCol) GROUP BY T2.EmprCod, T2.ForNumCol ) T1 WHERE T1.EmprCod = ? AND T1.ForNumCol = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T011P21", "SELECT COALESCE( T1.ForCanSum, 0) AS ForCanSum FROM (SELECT SUM(ForCan) AS ForCanSum, EmprCod, ForNumCol FROM TXPLDFORM GROUP BY EmprCod, ForNumCol ) T1 WHERE T1.EmprCod = ? AND T1.ForNumCol = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T011P25", "SELECT /*+ FIRST_ROWS(100) */ TM1.ForNumCol, TM1.ColUltLin, TM1.ContNum, TM1.CosKgm, T2.EmprNom, T2.EmpNumDec, T6.Lb_TaAuxD, TM1.Lb_fam1, TM1.Lb_fam2, TM1.Lb_fam3, TM1.EmprCod, TM1.Lb_TaAuxC, COALESCE( T4.CosKgmF, 0) AS CosKgmF, COALESCE( T5.ForCanSum, 0) AS ForCanSum, COALESCE( T3.PrdHorMax, 0) AS PrdHorMax FROM (((((TXPCDFORM TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) LEFT JOIN (SELECT MAX(PrdHorMad) AS PrdHorMax, EmprCod FROM TXPPRODUC WHERE PrdHorMad > 0 GROUP BY EmprCod ) T3 ON T3.EmprCod = TM1.EmprCod) LEFT JOIN (SELECT SUM(( CAST(TM1.ContNum * CAST(T7.ForCan AS NUMERIC(21,10)) / 1000 AS NUMERIC(25,10))) * CAST(T8.PrdPreAct * CAST(T8.PrdFacCon AS NUMERIC(24,10)) AS NUMERIC(27,10))) AS CosKgmF, T7.EmprCod, T7.ForNumCol FROM ((TXPLDFORM T7 INNER JOIN TXPPRODUC T8 ON T8.EmprCod = T7.EmprCod AND T8.PrdNum = T7.PrdNum) INNER JOIN TXPCDFORM TM1 ON TM1.EmprCod = T7.EmprCod AND TM1.ForNumCol = T7.ForNumCol) GROUP BY T7.EmprCod, T7.ForNumCol ) T4 ON T4.EmprCod = TM1.EmprCod AND T4.ForNumCol = TM1.ForNumCol) LEFT JOIN (SELECT SUM(ForCan) AS ForCanSum, EmprCod, ForNumCol FROM TXPLDFORM GROUP BY EmprCod, ForNumCol ) T5 ON T5.EmprCod = TM1.EmprCod AND T5.ForNumCol = TM1.ForNumCol) LEFT JOIN TXPENS005 T6 ON T6.EmprCod = TM1.EmprCod AND T6.Lb_TaAuxC = TM1.Lb_TaAuxC) WHERE TM1.EmprCod = ? and TM1.ForNumCol = ? ORDER BY TM1.EmprCod, TM1.ForNumCol ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T011P26", "SELECT EmprNom, EmpNumDec FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T011P27", "SELECT Lb_TaAuxD FROM TXPENS005 WHERE EmprCod = ? AND Lb_TaAuxC = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T011P29", "SELECT COALESCE( T1.PrdHorMax, 0) AS PrdHorMax FROM (SELECT MAX(PrdHorMad) AS PrdHorMax, EmprCod FROM TXPPRODUC WHERE PrdHorMad > 0 GROUP BY EmprCod ) T1 WHERE T1.EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T011P31", "SELECT COALESCE( T1.CosKgmF, 0) AS CosKgmF FROM (SELECT SUM(( CAST(T4.ContNum * CAST(T2.ForCan AS NUMERIC(21,10)) / 1000 AS NUMERIC(25,10))) * CAST(T3.PrdPreAct * CAST(T3.PrdFacCon AS NUMERIC(24,10)) AS NUMERIC(27,10))) AS CosKgmF, T2.EmprCod, T2.ForNumCol FROM ((TXPLDFORM T2 INNER JOIN TXPPRODUC T3 ON T3.EmprCod = T2.EmprCod AND T3.PrdNum = T2.PrdNum) INNER JOIN TXPCDFORM T4 ON T4.EmprCod = T2.EmprCod AND T4.ForNumCol = T2.ForNumCol) GROUP BY T2.EmprCod, T2.ForNumCol ) T1 WHERE T1.EmprCod = ? AND T1.ForNumCol = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T011P33", "SELECT COALESCE( T1.ForCanSum, 0) AS ForCanSum FROM (SELECT SUM(ForCan) AS ForCanSum, EmprCod, ForNumCol FROM TXPLDFORM GROUP BY EmprCod, ForNumCol ) T1 WHERE T1.EmprCod = ? AND T1.ForNumCol = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T011P34", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, ForNumCol FROM TXPCDFORM WHERE EmprCod = ? AND ForNumCol = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T011P35", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, ForNumCol FROM TXPCDFORM WHERE ( EmprCod > ? or EmprCod = ? and ForNumCol > ?) ORDER BY EmprCod, ForNumCol) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T011P36", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, ForNumCol FROM TXPCDFORM WHERE ( EmprCod < ? or EmprCod = ? and ForNumCol < ?) ORDER BY EmprCod DESC, ForNumCol DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T011P37", "INSERT INTO TXPCDFORM(ForNumCol, ColUltLin, ContNum, CosKgm, Lb_fam1, Lb_fam2, Lb_fam3, EmprCod, Lb_TaAuxC, PrdUltLin) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, 0)", GX_NOMASK, "TXPCDFORM")
         ,new UpdateCursor("T011P38", "UPDATE TXPCDFORM SET ColUltLin=?, ContNum=?, CosKgm=?, Lb_fam1=?, Lb_fam2=?, Lb_fam3=?, Lb_TaAuxC=?  WHERE EmprCod = ? AND ForNumCol = ?", GX_NOMASK, "TXPCDFORM")
         ,new UpdateCursor("T011P39", "DELETE FROM TXPCDFORM  WHERE EmprCod = ? AND ForNumCol = ?", GX_NOMASK, "TXPCDFORM")
         ,new ForEachCursor("T011P40", "SELECT EmprNom, EmpNumDec FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T011P42", "SELECT COALESCE( T1.PrdHorMax, 0) AS PrdHorMax FROM (SELECT MAX(PrdHorMad) AS PrdHorMax, EmprCod FROM TXPPRODUC WHERE PrdHorMad > 0 GROUP BY EmprCod ) T1 WHERE T1.EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T011P44", "SELECT COALESCE( T1.CosKgmF, 0) AS CosKgmF FROM (SELECT SUM(( CAST(T4.ContNum * CAST(T2.ForCan AS NUMERIC(21,10)) / 1000 AS NUMERIC(25,10))) * CAST(T3.PrdPreAct * CAST(T3.PrdFacCon AS NUMERIC(24,10)) AS NUMERIC(27,10))) AS CosKgmF, T2.EmprCod, T2.ForNumCol FROM ((TXPLDFORM T2 INNER JOIN TXPPRODUC T3 ON T3.EmprCod = T2.EmprCod AND T3.PrdNum = T2.PrdNum) INNER JOIN TXPCDFORM T4 ON T4.EmprCod = T2.EmprCod AND T4.ForNumCol = T2.ForNumCol) GROUP BY T2.EmprCod, T2.ForNumCol ) T1 WHERE T1.EmprCod = ? AND T1.ForNumCol = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T011P46", "SELECT COALESCE( T1.ForCanSum, 0) AS ForCanSum FROM (SELECT SUM(ForCan) AS ForCanSum, EmprCod, ForNumCol FROM TXPLDFORM GROUP BY EmprCod, ForNumCol ) T1 WHERE T1.EmprCod = ? AND T1.ForNumCol = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T011P47", "SELECT Lb_TaAuxD FROM TXPENS005 WHERE EmprCod = ? AND Lb_TaAuxC = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T011P48", "SELECT * FROM (SELECT EmprCod, ForNumCol, PrdLin FROM TXPLPRFOR WHERE EmprCod = ? AND ForNumCol = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T011P49", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod FROM TXPCFORMU WHERE EmprCod = ? AND ForNumCol = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T011P50", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, ForNumCol FROM TXPCDFORM ORDER BY EmprCod, ForNumCol ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T011P51", "SELECT T1.ForNumCol, T1.ColLin, T2.PrdNom, T2.PrdPreAct, T3.ForPrdDsc, T1.ForCan, T1.TotLinCol, T2.PrdUMeFo, T1.ForClaCol, T2.PrdHorMad, T2.PrdFacCon, T1.EmprCod, T1.PrdNum, T1.ForPrdUMe, T2.ValCod FROM ((TXPLDFORM T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) INNER JOIN TXPUNMEPR T3 ON T3.EmprCod = T1.EmprCod AND T3.ForPrdUMe = T1.ForPrdUMe) WHERE T1.EmprCod = ? and T1.ForNumCol = ? and T1.ColLin = ? ORDER BY T1.EmprCod, T1.ForNumCol, T1.ColLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T011P52", "SELECT PrdNom, PrdPreAct, PrdUMeFo, PrdHorMad, PrdFacCon, ValCod FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T011P53", "SELECT ForPrdDsc FROM TXPUNMEPR WHERE EmprCod = ? AND ForPrdUMe = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T011P59", "SELECT COALESCE( T1.PrdNumMax, '') AS PrdNumMax FROM (SELECT CASE  WHEN Not (? = 0) THEN COALESCE( T3.GXC1, '      ') ELSE COALESCE( T2.GXC2, '      ') END AS PrdNumMax FROM (SELECT T4.PrdNum AS GXC2, T4.ColLin, T5.GXC5 AS GXC5, T4.EmprCod, T4.ForNumCol FROM TXPLDFORM T4 FULL OUTER JOIN  (SELECT MAX(ColLin) AS GXC5 FROM TXPLDFORM WHERE (EmprCod = ?) AND (ForNumCol = ?) ) T5 ON 1=1 WHERE (T4.ColLin = T5.GXC5) AND (T4.EmprCod = ?) AND (T4.ForNumCol = ?) ) T2 FULL OUTER JOIN  (SELECT T4.PrdNum AS GXC1, T4.ColLin, T5.GXC4 AS GXC4, T4.EmprCod, T4.ForNumCol FROM TXPLDFORM T4 FULL OUTER JOIN  (SELECT MAX(ColLin) AS GXC4 FROM TXPLDFORM WHERE (ColLin < ?) AND (EmprCod = ?) AND (ForNumCol = ?) ) T5 ON 1=1 WHERE (T4.ColLin = T5.GXC4) AND (T4.ColLin < ?) AND (T4.EmprCod = ?) AND (T4.ForNumCol = ?) ) T3 ON 1=1 ) T1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T011P60", "SELECT EmprCod, ForNumCol, ColLin FROM TXPLDFORM WHERE EmprCod = ? AND ForNumCol = ? AND ColLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T011P61", "INSERT INTO TXPLDFORM(ForNumCol, ColLin, ForCan, TotLinCol, ForClaCol, EmprCod, PrdNum, ForPrdUMe, ColFibra) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ' ')", GX_NOMASK, "TXPLDFORM")
         ,new UpdateCursor("T011P62", "UPDATE TXPLDFORM SET ForCan=?, TotLinCol=?, ForClaCol=?, PrdNum=?, ForPrdUMe=?  WHERE EmprCod = ? AND ForNumCol = ? AND ColLin = ?", GX_NOMASK, "TXPLDFORM")
         ,new UpdateCursor("T011P63", "DELETE FROM TXPLDFORM  WHERE EmprCod = ? AND ForNumCol = ? AND ColLin = ?", GX_NOMASK, "TXPLDFORM")
         ,new ForEachCursor("T011P69", "SELECT COALESCE( T1.PrdNumMax, '') AS PrdNumMax FROM (SELECT CASE  WHEN Not (? = 0) THEN COALESCE( T3.GXC1, '      ') ELSE COALESCE( T2.GXC2, '      ') END AS PrdNumMax FROM (SELECT T4.PrdNum AS GXC2, T4.ColLin, T5.GXC5 AS GXC5, T4.EmprCod, T4.ForNumCol FROM TXPLDFORM T4 FULL OUTER JOIN  (SELECT MAX(ColLin) AS GXC5 FROM TXPLDFORM WHERE (EmprCod = ?) AND (ForNumCol = ?) ) T5 ON 1=1 WHERE (T4.ColLin = T5.GXC5) AND (T4.EmprCod = ?) AND (T4.ForNumCol = ?) ) T2 FULL OUTER JOIN  (SELECT T4.PrdNum AS GXC1, T4.ColLin, T5.GXC4 AS GXC4, T4.EmprCod, T4.ForNumCol FROM TXPLDFORM T4 FULL OUTER JOIN  (SELECT MAX(ColLin) AS GXC4 FROM TXPLDFORM WHERE (ColLin < ?) AND (EmprCod = ?) AND (ForNumCol = ?) ) T5 ON 1=1 WHERE (T4.ColLin = T5.GXC4) AND (T4.ColLin < ?) AND (T4.EmprCod = ?) AND (T4.ForNumCol = ?) ) T3 ON 1=1 ) T1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T011P70", "SELECT PrdNom, PrdPreAct, PrdUMeFo, PrdHorMad, PrdFacCon, ValCod FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T011P71", "SELECT ForPrdDsc FROM TXPUNMEPR WHERE EmprCod = ? AND ForPrdUMe = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T011P72", "SELECT EmprCod, ForNumCol, ColLin FROM TXPLDFORM WHERE EmprCod = ? and ForNumCol = ? ORDER BY EmprCod, ForNumCol, ColLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
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
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,5);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,4);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 5);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 3);
               ((String[]) buf[8])[0] = rslt.getString(9, 4);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               return;
            case 6 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 3);
               ((String[]) buf[8])[0] = rslt.getString(9, 4);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((byte[]) buf[2])[0] = rslt.getByte(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 60);
               return;
            case 9 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 10 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,5);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 11 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,5);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 12 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((byte[]) buf[6])[0] = rslt.getByte(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(7, 60);
               ((byte[]) buf[9])[0] = rslt.getByte(8);
               ((byte[]) buf[10])[0] = rslt.getByte(9);
               ((byte[]) buf[11])[0] = rslt.getByte(10);
               ((String[]) buf[12])[0] = rslt.getString(11, 3);
               ((String[]) buf[13])[0] = rslt.getString(12, 4);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(13,5);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(14,5);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((byte[]) buf[19])[0] = rslt.getByte(15);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((byte[]) buf[2])[0] = rslt.getByte(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 60);
               return;
            case 15 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 16 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,5);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 17 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,5);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((byte[]) buf[2])[0] = rslt.getByte(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 25 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 26 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,5);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 27 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,5);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 60);
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
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
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 32 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((String[]) buf[4])[0] = rslt.getString(5, 5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,5);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((byte[]) buf[8])[0] = rslt.getByte(8);
               ((String[]) buf[9])[0] = rslt.getString(9, 16);
               ((byte[]) buf[10])[0] = rslt.getByte(10);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(11,4);
               ((String[]) buf[12])[0] = rslt.getString(12, 3);
               ((String[]) buf[13])[0] = rslt.getString(13, 6);
               ((byte[]) buf[14])[0] = rslt.getByte(14);
               ((byte[]) buf[15])[0] = rslt.getByte(15);
               return;
            case 33 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,5);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,4);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
            case 34 :
               ((String[]) buf[0])[0] = rslt.getString(1, 5);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 35 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 36 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 40 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 41 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,5);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,4);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
            case 42 :
               ((String[]) buf[0])[0] = rslt.getString(1, 5);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 43 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
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
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 3);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setString(7, (String)parms[6], 3);
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               stmt.setString(10, (String)parms[9], 3);
               stmt.setInt(11, ((Number) parms[10]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 8 :
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
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 4);
               }
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 21 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 2);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setString(8, (String)parms[7], 3);
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[9], 4);
               }
               return;
            case 22 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 2);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[7], 4);
               }
               stmt.setString(8, (String)parms[8], 3);
               stmt.setInt(9, ((Number) parms[9]).intValue());
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 4);
               }
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 32 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 33 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 34 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 35 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 3);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setString(7, (String)parms[6], 3);
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               stmt.setString(10, (String)parms[9], 3);
               stmt.setInt(11, ((Number) parms[10]).intValue());
               return;
            case 36 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 37 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 5);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 2);
               stmt.setString(5, (String)parms[4], 16);
               stmt.setString(6, (String)parms[5], 3);
               stmt.setString(7, (String)parms[6], 6);
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               return;
            case 38 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 5);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 6);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 3);
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               return;
            case 39 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 40 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 3);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setString(7, (String)parms[6], 3);
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               stmt.setString(10, (String)parms[9], 3);
               stmt.setInt(11, ((Number) parms[10]).intValue());
               return;
            case 41 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 42 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 43 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

