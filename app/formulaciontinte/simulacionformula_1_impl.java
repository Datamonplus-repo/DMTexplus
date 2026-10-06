package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class simulacionformula_1_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_4") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_4( A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_5") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A719PrdNum = httpContext.GetPar( "PrdNum") ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_5( A396EmprCod, A719PrdNum) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_6") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A764ProForCod = httpContext.GetPar( "ProForCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A764ProForCod", A764ProForCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_6( A396EmprCod, A764ProForCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_7") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A490ForPrdUMe = (byte)(GXutil.lval( httpContext.GetPar( "ForPrdUMe"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A490ForPrdUMe", GXutil.str( A490ForPrdUMe, 1, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_7( A396EmprCod, A490ForPrdUMe) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_8") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A910Workstat = httpContext.GetPar( "Workstat") ;
         httpContext.ajax_rsp_assign_attri("", false, "A910Workstat", A910Workstat);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_8( A396EmprCod, A910Workstat) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_9") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A910Workstat = httpContext.GetPar( "Workstat") ;
         httpContext.ajax_rsp_assign_attri("", false, "A910Workstat", A910Workstat);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_9( A396EmprCod, A910Workstat) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Simulacion Formula", ""), (short)(0)) ;
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

   public simulacionformula_1_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public simulacionformula_1_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( simulacionformula_1_impl.class ));
   }

   public simulacionformula_1_impl( int remoteHandle ,
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, httpContext.getMessage( "Simulacion Formula", ""), "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, 0, (short)(0), "HLP_FormulacionTinte\\SimulacionFormula_1.htm");
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\SimulacionFormula_1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
      ClassString = "BtnPrevious" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\SimulacionFormula_1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      ClassString = "BtnNext" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\SimulacionFormula_1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
      ClassString = "BtnLast" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\SimulacionFormula_1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
      ClassString = "BtnSelect" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_FormulacionTinte\\SimulacionFormula_1.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,34);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\SimulacionFormula_1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtWorkstat_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtWorkstat_Internalname, httpContext.getMessage( "Work station", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtWorkstat_Internalname, GXutil.rtrim( A910Workstat), GXutil.rtrim( localUtil.format( A910Workstat, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,39);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtWorkstat_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtWorkstat_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\SimulacionFormula_1.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\SimulacionFormula_1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtEscMTxt1_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtEscMTxt1_Internalname, httpContext.getMessage( "Linea texto 1", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEscMTxt1_Internalname, GXutil.rtrim( A881EscMTxt1), GXutil.rtrim( localUtil.format( A881EscMTxt1, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEscMTxt1_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEscMTxt1_Enabled, 0, "text", "", 60, "chr", 1, "row", 60, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\SimulacionFormula_1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtEscMTxt2_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtEscMTxt2_Internalname, httpContext.getMessage( "Linea Texto 2", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEscMTxt2_Internalname, GXutil.rtrim( A882EscMTxt2), GXutil.rtrim( localUtil.format( A882EscMTxt2, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEscMTxt2_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEscMTxt2_Enabled, 0, "text", "", 60, "chr", 1, "row", 60, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\SimulacionFormula_1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtEscMInc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtEscMInc_Internalname, httpContext.getMessage( "Incremento precio", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEscMInc_Internalname, GXutil.ltrim( localUtil.ntoc( A883EscMInc, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEscMInc_Enabled!=0) ? localUtil.format( A883EscMInc, "Z9.99") : localUtil.format( A883EscMInc, "Z9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEscMInc_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEscMInc_Enabled, 0, "text", "", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\SimulacionFormula_1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtEscMKgm_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtEscMKgm_Internalname, httpContext.getMessage( "Kgm formula", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEscMKgm_Internalname, GXutil.ltrim( localUtil.ntoc( A884EscMKgm, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEscMKgm_Enabled!=0) ? localUtil.format( A884EscMKgm, "ZZZZZZ9.99") : localUtil.format( A884EscMKgm, "ZZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEscMKgm_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEscMKgm_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\SimulacionFormula_1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtEscMVol_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtEscMVol_Internalname, httpContext.getMessage( "Volumen formula", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEscMVol_Internalname, GXutil.ltrim( localUtil.ntoc( A885EscMVol, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEscMVol_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A885EscMVol), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A885EscMVol), "ZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEscMVol_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEscMVol_Enabled, 0, "text", "1", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\SimulacionFormula_1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtEscMUltLin_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtEscMUltLin_Internalname, httpContext.getMessage( "Ultima linea", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEscMUltLin_Internalname, GXutil.ltrim( localUtil.ntoc( A886EscMUltLin, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEscMUltLin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A886EscMUltLin), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A886EscMUltLin), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEscMUltLin_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEscMUltLin_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\SimulacionFormula_1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtEscMValCos_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtEscMValCos_Internalname, httpContext.getMessage( "EscMValCos", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEscMValCos_Internalname, GXutil.ltrim( localUtil.ntoc( A896EscMValCos, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEscMValCos_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A896EscMValCos), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A896EscMValCos), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEscMValCos_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEscMValCos_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\SimulacionFormula_1.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmpNumDec_Internalname, GXutil.ltrim( localUtil.ntoc( A3915EmpNumDec, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEmpNumDec_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3915EmpNumDec), "9") : localUtil.format( DecimalUtil.doubleToDec(A3915EmpNumDec), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmpNumDec_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEmpNumDec_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\SimulacionFormula_1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtEscMCosT_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtEscMCosT_Internalname, httpContext.getMessage( "Coste total", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEscMCosT_Internalname, GXutil.ltrim( localUtil.ntoc( A893EscMCosT, (byte)(15), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEscMCosT_Enabled!=0) ? localUtil.format( A893EscMCosT, "ZZZZZZZZ9.99999") : localUtil.format( A893EscMCosT, "ZZZZZZZZ9.99999"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEscMCosT_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEscMCosT_Enabled, 0, "text", "", 15, "chr", 1, "row", 15, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\SimulacionFormula_1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtEscMLin_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtEscMLin_Internalname, httpContext.getMessage( "Linea", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 94,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEscMLin_Internalname, GXutil.ltrim( localUtil.ntoc( A887EscMLin, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEscMLin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A887EscMLin), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A887EscMLin), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,94);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEscMLin_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEscMLin_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\SimulacionFormula_1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdNum_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdNum_Internalname, httpContext.getMessage( "Producto", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 99,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdNum_Internalname, GXutil.rtrim( A719PrdNum), GXutil.rtrim( localUtil.format( A719PrdNum, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,99);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdNum_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdNum_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\SimulacionFormula_1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdNom_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdNom_Internalname, httpContext.getMessage( "Descripcion", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdNom_Internalname, GXutil.rtrim( A718PrdNom), GXutil.rtrim( localUtil.format( A718PrdNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdNom_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdNom_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\SimulacionFormula_1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdPreAct_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdPreAct_Internalname, httpContext.getMessage( "Precio Actual", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdPreAct_Internalname, GXutil.ltrim( localUtil.ntoc( A724PrdPreAct, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdPreAct_Enabled!=0) ? localUtil.format( A724PrdPreAct, "ZZZZZZZ9.999") : localUtil.format( A724PrdPreAct, "ZZZZZZZ9.999"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdPreAct_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdPreAct_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\SimulacionFormula_1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtProForCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtProForCod_Internalname, httpContext.getMessage( "Codigo", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 114,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtProForCod_Internalname, GXutil.rtrim( A764ProForCod), GXutil.rtrim( localUtil.format( A764ProForCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,114);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProForCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtProForCod_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\SimulacionFormula_1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtProForDsc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtProForDsc_Internalname, httpContext.getMessage( "Proceso Quimico", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtProForDsc_Internalname, GXutil.rtrim( A766ProForDsc), GXutil.rtrim( localUtil.format( A766ProForDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProForDsc_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtProForDsc_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\SimulacionFormula_1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtEscMDsc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtEscMDsc_Internalname, httpContext.getMessage( "Nombre", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 124,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEscMDsc_Internalname, GXutil.rtrim( A897EscMDsc), GXutil.rtrim( localUtil.format( A897EscMDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,124);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEscMDsc_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEscMDsc_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\SimulacionFormula_1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtEscMPrdPre_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtEscMPrdPre_Internalname, httpContext.getMessage( "Precio", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 129,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEscMPrdPre_Internalname, GXutil.ltrim( localUtil.ntoc( A889EscMPrdPre, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEscMPrdPre_Enabled!=0) ? localUtil.format( A889EscMPrdPre, "ZZZZZZZ9.999") : localUtil.format( A889EscMPrdPre, "ZZZZZZZ9.999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,129);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEscMPrdPre_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEscMPrdPre_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\SimulacionFormula_1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtEscMCan_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtEscMCan_Internalname, httpContext.getMessage( "Cantidad", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 134,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEscMCan_Internalname, GXutil.ltrim( localUtil.ntoc( A890EscMCan, (byte)(11), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEscMCan_Enabled!=0) ? localUtil.format( A890EscMCan, "ZZZZZ9.9999") : localUtil.format( A890EscMCan, "ZZZZZ9.9999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,134);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEscMCan_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEscMCan_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\SimulacionFormula_1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtForPrdUMe_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtForPrdUMe_Internalname, httpContext.getMessage( "Unidad Medida", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 139,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtForPrdUMe_Internalname, GXutil.ltrim( localUtil.ntoc( A490ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtForPrdUMe_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A490ForPrdUMe), "9") : localUtil.format( DecimalUtil.doubleToDec(A490ForPrdUMe), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,139);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForPrdUMe_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtForPrdUMe_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\SimulacionFormula_1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtForPrdDsc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtForPrdDsc_Internalname, httpContext.getMessage( "Descripcion Unidades Medida", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtForPrdDsc_Internalname, GXutil.rtrim( A488ForPrdDsc), GXutil.rtrim( localUtil.format( A488ForPrdDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForPrdDsc_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtForPrdDsc_Enabled, 0, "text", "", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\SimulacionFormula_1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtEscMCos_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtEscMCos_Internalname, httpContext.getMessage( "Coste linea", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 149,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEscMCos_Internalname, GXutil.ltrim( localUtil.ntoc( A891EscMCos, (byte)(15), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEscMCos_Enabled!=0) ? localUtil.format( A891EscMCos, "ZZZZZZZZ9.99999") : localUtil.format( A891EscMCos, "ZZZZZZZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,149);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEscMCos_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEscMCos_Enabled, 0, "text", "", 15, "chr", 1, "row", 15, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\SimulacionFormula_1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtEscMCosL_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtEscMCosL_Internalname, httpContext.getMessage( "Coste Linea (formula)", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEscMCosL_Internalname, GXutil.ltrim( localUtil.ntoc( A892EscMCosL, (byte)(15), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEscMCosL_Enabled!=0) ? localUtil.format( A892EscMCosL, "ZZZZZZZZ9.99999") : localUtil.format( A892EscMCosL, "ZZZZZZZZ9.99999"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEscMCosL_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEscMCosL_Enabled, 0, "text", "", 15, "chr", 1, "row", 15, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\SimulacionFormula_1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtEscMCliCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtEscMCliCod_Internalname, httpContext.getMessage( "Codigo Cliente", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 159,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEscMCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A4707EscMCliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEscMCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4707EscMCliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4707EscMCliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,159);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEscMCliCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEscMCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\SimulacionFormula_1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtEscMArtCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtEscMArtCod_Internalname, httpContext.getMessage( "Serie Cliente", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 164,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEscMArtCod_Internalname, GXutil.rtrim( A4708EscMArtCod), GXutil.rtrim( localUtil.format( A4708EscMArtCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,164);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEscMArtCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEscMArtCod_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\SimulacionFormula_1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtEscMMdlCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtEscMMdlCod_Internalname, httpContext.getMessage( "Codigo Modelo", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 169,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEscMMdlCod_Internalname, GXutil.rtrim( A4709EscMMdlCod), GXutil.rtrim( localUtil.format( A4709EscMMdlCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,169);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEscMMdlCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEscMMdlCod_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\SimulacionFormula_1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtEscMProCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtEscMProCod_Internalname, httpContext.getMessage( "Proceso Produccion", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 174,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEscMProCod_Internalname, GXutil.rtrim( A4710EscMProCod), GXutil.rtrim( localUtil.format( A4710EscMProCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,174);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEscMProCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEscMProCod_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\SimulacionFormula_1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtEscMFasCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtEscMFasCod_Internalname, httpContext.getMessage( "Fase Proceso Produccion", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 179,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEscMFasCod_Internalname, GXutil.rtrim( A4711EscMFasCod), GXutil.rtrim( localUtil.format( A4711EscMFasCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,179);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEscMFasCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEscMFasCod_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\SimulacionFormula_1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtEscMFacCon_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtEscMFacCon_Internalname, httpContext.getMessage( "Factor Conversion", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 184,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEscMFacCon_Internalname, GXutil.ltrim( localUtil.ntoc( A4712EscMFacCon, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEscMFacCon_Enabled!=0) ? localUtil.format( A4712EscMFacCon, "ZZZZZ9.99999") : localUtil.format( A4712EscMFacCon, "ZZZZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,184);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEscMFacCon_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEscMFacCon_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\SimulacionFormula_1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtEscMRb_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtEscMRb_Internalname, httpContext.getMessage( "Relacion de Baño", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 189,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEscMRb_Internalname, GXutil.ltrim( localUtil.ntoc( A4713EscMRb, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEscMRb_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4713EscMRb), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4713EscMRb), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,189);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEscMRb_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEscMRb_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\SimulacionFormula_1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtEscSol_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtEscSol_Internalname, httpContext.getMessage( "Solucion a preparar (ml)", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 194,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEscSol_Internalname, GXutil.ltrim( localUtil.ntoc( A6060EscSol, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEscSol_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6060EscSol), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6060EscSol), "ZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,194);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEscSol_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEscSol_Enabled, 0, "text", "1", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\SimulacionFormula_1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtEscVolm_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtEscVolm_Internalname, httpContext.getMessage( "volumen", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 199,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEscVolm_Internalname, GXutil.ltrim( localUtil.ntoc( A7584EscVolm, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEscVolm_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A7584EscVolm), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A7584EscVolm), "ZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,199);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEscVolm_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEscVolm_Enabled, 0, "text", "1", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\SimulacionFormula_1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      drawcontrols1( ) ;
   }

   public void drawcontrols1( )
   {
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtEscOrdn_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtEscOrdn_Internalname, httpContext.getMessage( "Orden fase", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 204,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEscOrdn_Internalname, GXutil.ltrim( localUtil.ntoc( A7583EscOrdn, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEscOrdn_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A7583EscOrdn), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A7583EscOrdn), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,204);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEscOrdn_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEscOrdn_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\SimulacionFormula_1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtEscMCant_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtEscMCant_Internalname, httpContext.getMessage( "Cant II", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 209,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEscMCant_Internalname, GXutil.ltrim( localUtil.ntoc( A10363EscMCant, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEscMCant_Enabled!=0) ? localUtil.format( A10363EscMCant, "ZZZZZZ9.999") : localUtil.format( A10363EscMCant, "ZZZZZZ9.999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onblur(this,209);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEscMCant_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEscMCant_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\SimulacionFormula_1.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 214,'',false,'',0)\"" ;
      ClassString = "BtnEnter" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\SimulacionFormula_1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 216,'',false,'',0)\"" ;
      ClassString = "BtnCancel" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\SimulacionFormula_1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 218,'',false,'',0)\"" ;
      ClassString = "BtnDelete" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\SimulacionFormula_1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
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
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
         Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
         Z910Workstat = httpContext.cgiGet( "Z910Workstat") ;
         Z887EscMLin = (int)(localUtil.ctol( httpContext.cgiGet( "Z887EscMLin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z897EscMDsc = httpContext.cgiGet( "Z897EscMDsc") ;
         Z889EscMPrdPre = localUtil.ctond( httpContext.cgiGet( "Z889EscMPrdPre")) ;
         Z890EscMCan = localUtil.ctond( httpContext.cgiGet( "Z890EscMCan")) ;
         Z891EscMCos = localUtil.ctond( httpContext.cgiGet( "Z891EscMCos")) ;
         Z4707EscMCliCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z4707EscMCliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z4708EscMArtCod = httpContext.cgiGet( "Z4708EscMArtCod") ;
         Z4709EscMMdlCod = httpContext.cgiGet( "Z4709EscMMdlCod") ;
         Z4710EscMProCod = httpContext.cgiGet( "Z4710EscMProCod") ;
         Z4711EscMFasCod = httpContext.cgiGet( "Z4711EscMFasCod") ;
         Z4712EscMFacCon = localUtil.ctond( httpContext.cgiGet( "Z4712EscMFacCon")) ;
         Z4713EscMRb = (short)(localUtil.ctol( httpContext.cgiGet( "Z4713EscMRb"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z6060EscSol = (int)(localUtil.ctol( httpContext.cgiGet( "Z6060EscSol"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z7584EscVolm = (int)(localUtil.ctol( httpContext.cgiGet( "Z7584EscVolm"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z7583EscOrdn = (short)(localUtil.ctol( httpContext.cgiGet( "Z7583EscOrdn"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z10363EscMCant = localUtil.ctond( httpContext.cgiGet( "Z10363EscMCant")) ;
         Z719PrdNum = httpContext.cgiGet( "Z719PrdNum") ;
         Z764ProForCod = httpContext.cgiGet( "Z764ProForCod") ;
         Z490ForPrdUMe = (byte)(localUtil.ctol( httpContext.cgiGet( "Z490ForPrdUMe"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         /* Read variables values. */
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A910Workstat = httpContext.cgiGet( edtWorkstat_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A910Workstat", A910Workstat);
         A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
         n407EmprNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A881EscMTxt1 = httpContext.cgiGet( edtEscMTxt1_Internalname) ;
         n881EscMTxt1 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A881EscMTxt1", A881EscMTxt1);
         A882EscMTxt2 = httpContext.cgiGet( edtEscMTxt2_Internalname) ;
         n882EscMTxt2 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A882EscMTxt2", A882EscMTxt2);
         A883EscMInc = localUtil.ctond( httpContext.cgiGet( edtEscMInc_Internalname)) ;
         n883EscMInc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A883EscMInc", GXutil.ltrimstr( A883EscMInc, 5, 2));
         A884EscMKgm = localUtil.ctond( httpContext.cgiGet( edtEscMKgm_Internalname)) ;
         n884EscMKgm = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A884EscMKgm", GXutil.ltrimstr( A884EscMKgm, 10, 2));
         A885EscMVol = (int)(localUtil.ctol( httpContext.cgiGet( edtEscMVol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n885EscMVol = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A885EscMVol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A885EscMVol), 5, 0));
         A886EscMUltLin = (int)(localUtil.ctol( httpContext.cgiGet( edtEscMUltLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n886EscMUltLin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A886EscMUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A886EscMUltLin), 8, 0));
         A896EscMValCos = (int)(localUtil.ctol( httpContext.cgiGet( edtEscMValCos_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n896EscMValCos = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A896EscMValCos", GXutil.ltrimstr( DecimalUtil.doubleToDec(A896EscMValCos), 8, 0));
         A3915EmpNumDec = (byte)(localUtil.ctol( httpContext.cgiGet( edtEmpNumDec_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n3915EmpNumDec = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3915EmpNumDec", GXutil.str( A3915EmpNumDec, 1, 0));
         A893EscMCosT = localUtil.ctond( httpContext.cgiGet( edtEscMCosT_Internalname)) ;
         n893EscMCosT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A893EscMCosT", GXutil.ltrimstr( A893EscMCosT, 15, 5));
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtEscMLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtEscMLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ESCMLIN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEscMLin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A887EscMLin = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A887EscMLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A887EscMLin), 8, 0));
         }
         else
         {
            A887EscMLin = (int)(localUtil.ctol( httpContext.cgiGet( edtEscMLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A887EscMLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A887EscMLin), 8, 0));
         }
         A719PrdNum = httpContext.cgiGet( edtPrdNum_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         A718PrdNom = httpContext.cgiGet( edtPrdNom_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
         A724PrdPreAct = localUtil.ctond( httpContext.cgiGet( edtPrdPreAct_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A724PrdPreAct", GXutil.ltrimstr( A724PrdPreAct, 14, 5));
         A764ProForCod = httpContext.cgiGet( edtProForCod_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A764ProForCod", A764ProForCod);
         A766ProForDsc = httpContext.cgiGet( edtProForDsc_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A766ProForDsc", A766ProForDsc);
         A897EscMDsc = httpContext.cgiGet( edtEscMDsc_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A897EscMDsc", A897EscMDsc);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtEscMPrdPre_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtEscMPrdPre_Internalname)), DecimalUtil.stringToDec("99999999.99999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ESCMPRDPRE");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEscMPrdPre_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A889EscMPrdPre = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A889EscMPrdPre", GXutil.ltrimstr( A889EscMPrdPre, 14, 5));
         }
         else
         {
            A889EscMPrdPre = localUtil.ctond( httpContext.cgiGet( edtEscMPrdPre_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A889EscMPrdPre", GXutil.ltrimstr( A889EscMPrdPre, 14, 5));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtEscMCan_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtEscMCan_Internalname)), DecimalUtil.stringToDec("999999.9999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ESCMCAN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEscMCan_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A890EscMCan = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A890EscMCan", GXutil.ltrimstr( A890EscMCan, 11, 4));
         }
         else
         {
            A890EscMCan = localUtil.ctond( httpContext.cgiGet( edtEscMCan_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A890EscMCan", GXutil.ltrimstr( A890EscMCan, 11, 4));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtForPrdUMe_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtForPrdUMe_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "FORPRDUME");
            AnyError = (short)(1) ;
            GX_FocusControl = edtForPrdUMe_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A490ForPrdUMe = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A490ForPrdUMe", GXutil.str( A490ForPrdUMe, 1, 0));
         }
         else
         {
            A490ForPrdUMe = (byte)(localUtil.ctol( httpContext.cgiGet( edtForPrdUMe_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A490ForPrdUMe", GXutil.str( A490ForPrdUMe, 1, 0));
         }
         A488ForPrdDsc = httpContext.cgiGet( edtForPrdDsc_Internalname) ;
         n488ForPrdDsc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A488ForPrdDsc", A488ForPrdDsc);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtEscMCos_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtEscMCos_Internalname)), DecimalUtil.stringToDec("999999999.99999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ESCMCOS");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEscMCos_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A891EscMCos = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A891EscMCos", GXutil.ltrimstr( A891EscMCos, 15, 5));
         }
         else
         {
            A891EscMCos = localUtil.ctond( httpContext.cgiGet( edtEscMCos_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A891EscMCos", GXutil.ltrimstr( A891EscMCos, 15, 5));
         }
         A892EscMCosL = localUtil.ctond( httpContext.cgiGet( edtEscMCosL_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A892EscMCosL", GXutil.ltrimstr( A892EscMCosL, 15, 5));
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtEscMCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtEscMCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ESCMCLICOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEscMCliCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A4707EscMCliCod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A4707EscMCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4707EscMCliCod), 6, 0));
         }
         else
         {
            A4707EscMCliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtEscMCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4707EscMCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4707EscMCliCod), 6, 0));
         }
         A4708EscMArtCod = httpContext.cgiGet( edtEscMArtCod_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4708EscMArtCod", A4708EscMArtCod);
         A4709EscMMdlCod = httpContext.cgiGet( edtEscMMdlCod_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4709EscMMdlCod", A4709EscMMdlCod);
         A4710EscMProCod = httpContext.cgiGet( edtEscMProCod_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4710EscMProCod", A4710EscMProCod);
         A4711EscMFasCod = httpContext.cgiGet( edtEscMFasCod_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4711EscMFasCod", A4711EscMFasCod);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtEscMFacCon_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtEscMFacCon_Internalname)), DecimalUtil.stringToDec("999999.99999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ESCMFACCON");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEscMFacCon_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A4712EscMFacCon = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A4712EscMFacCon", GXutil.ltrimstr( A4712EscMFacCon, 12, 5));
         }
         else
         {
            A4712EscMFacCon = localUtil.ctond( httpContext.cgiGet( edtEscMFacCon_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4712EscMFacCon", GXutil.ltrimstr( A4712EscMFacCon, 12, 5));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtEscMRb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtEscMRb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ESCMRB");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEscMRb_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A4713EscMRb = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4713EscMRb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4713EscMRb), 4, 0));
         }
         else
         {
            A4713EscMRb = (short)(localUtil.ctol( httpContext.cgiGet( edtEscMRb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4713EscMRb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4713EscMRb), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtEscSol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtEscSol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ESCSOL");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEscSol_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A6060EscSol = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A6060EscSol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6060EscSol), 5, 0));
         }
         else
         {
            A6060EscSol = (int)(localUtil.ctol( httpContext.cgiGet( edtEscSol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6060EscSol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6060EscSol), 5, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtEscVolm_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtEscVolm_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ESCVOLM");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEscVolm_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A7584EscVolm = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A7584EscVolm", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7584EscVolm), 5, 0));
         }
         else
         {
            A7584EscVolm = (int)(localUtil.ctol( httpContext.cgiGet( edtEscVolm_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A7584EscVolm", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7584EscVolm), 5, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtEscOrdn_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtEscOrdn_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ESCORDN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEscOrdn_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A7583EscOrdn = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A7583EscOrdn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7583EscOrdn), 4, 0));
         }
         else
         {
            A7583EscOrdn = (short)(localUtil.ctol( httpContext.cgiGet( edtEscOrdn_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A7583EscOrdn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7583EscOrdn), 4, 0));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtEscMCant_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtEscMCant_Internalname)), DecimalUtil.stringToDec("9999999.999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ESCMCANT");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEscMCant_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A10363EscMCant = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A10363EscMCant", GXutil.ltrimstr( A10363EscMCant, 11, 3));
         }
         else
         {
            A10363EscMCant = localUtil.ctond( httpContext.cgiGet( edtEscMCant_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10363EscMCant", GXutil.ltrimstr( A10363EscMCant, 11, 3));
         }
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
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
            A910Workstat = httpContext.GetPar( "Workstat") ;
            httpContext.ajax_rsp_assign_attri("", false, "A910Workstat", A910Workstat);
            A887EscMLin = (int)(GXutil.lval( httpContext.GetPar( "EscMLin"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A887EscMLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A887EscMLin), 8, 0));
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
            initAll1TJ120( ) ;
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
      disableAttributes1TJ120( ) ;
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

   public void resetCaption1TJ0( )
   {
   }

   public void zm1TJ120( int GX_JID )
   {
      if ( ( GX_JID == 3 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z897EscMDsc = T01TJ3_A897EscMDsc[0] ;
            Z889EscMPrdPre = T01TJ3_A889EscMPrdPre[0] ;
            Z890EscMCan = T01TJ3_A890EscMCan[0] ;
            Z891EscMCos = T01TJ3_A891EscMCos[0] ;
            Z4707EscMCliCod = T01TJ3_A4707EscMCliCod[0] ;
            Z4708EscMArtCod = T01TJ3_A4708EscMArtCod[0] ;
            Z4709EscMMdlCod = T01TJ3_A4709EscMMdlCod[0] ;
            Z4710EscMProCod = T01TJ3_A4710EscMProCod[0] ;
            Z4711EscMFasCod = T01TJ3_A4711EscMFasCod[0] ;
            Z4712EscMFacCon = T01TJ3_A4712EscMFacCon[0] ;
            Z4713EscMRb = T01TJ3_A4713EscMRb[0] ;
            Z6060EscSol = T01TJ3_A6060EscSol[0] ;
            Z7584EscVolm = T01TJ3_A7584EscVolm[0] ;
            Z7583EscOrdn = T01TJ3_A7583EscOrdn[0] ;
            Z10363EscMCant = T01TJ3_A10363EscMCant[0] ;
            Z719PrdNum = T01TJ3_A719PrdNum[0] ;
            Z764ProForCod = T01TJ3_A764ProForCod[0] ;
            Z490ForPrdUMe = T01TJ3_A490ForPrdUMe[0] ;
         }
         else
         {
            Z897EscMDsc = A897EscMDsc ;
            Z889EscMPrdPre = A889EscMPrdPre ;
            Z890EscMCan = A890EscMCan ;
            Z891EscMCos = A891EscMCos ;
            Z4707EscMCliCod = A4707EscMCliCod ;
            Z4708EscMArtCod = A4708EscMArtCod ;
            Z4709EscMMdlCod = A4709EscMMdlCod ;
            Z4710EscMProCod = A4710EscMProCod ;
            Z4711EscMFasCod = A4711EscMFasCod ;
            Z4712EscMFacCon = A4712EscMFacCon ;
            Z4713EscMRb = A4713EscMRb ;
            Z6060EscSol = A6060EscSol ;
            Z7584EscVolm = A7584EscVolm ;
            Z7583EscOrdn = A7583EscOrdn ;
            Z10363EscMCant = A10363EscMCant ;
            Z719PrdNum = A719PrdNum ;
            Z764ProForCod = A764ProForCod ;
            Z490ForPrdUMe = A490ForPrdUMe ;
         }
      }
      if ( GX_JID == -3 )
      {
         Z887EscMLin = A887EscMLin ;
         Z897EscMDsc = A897EscMDsc ;
         Z889EscMPrdPre = A889EscMPrdPre ;
         Z890EscMCan = A890EscMCan ;
         Z891EscMCos = A891EscMCos ;
         Z4707EscMCliCod = A4707EscMCliCod ;
         Z4708EscMArtCod = A4708EscMArtCod ;
         Z4709EscMMdlCod = A4709EscMMdlCod ;
         Z4710EscMProCod = A4710EscMProCod ;
         Z4711EscMFasCod = A4711EscMFasCod ;
         Z4712EscMFacCon = A4712EscMFacCon ;
         Z4713EscMRb = A4713EscMRb ;
         Z6060EscSol = A6060EscSol ;
         Z7584EscVolm = A7584EscVolm ;
         Z7583EscOrdn = A7583EscOrdn ;
         Z10363EscMCant = A10363EscMCant ;
         Z396EmprCod = A396EmprCod ;
         Z719PrdNum = A719PrdNum ;
         Z764ProForCod = A764ProForCod ;
         Z490ForPrdUMe = A490ForPrdUMe ;
         Z910Workstat = A910Workstat ;
         Z407EmprNom = A407EmprNom ;
         Z3915EmpNumDec = A3915EmpNumDec ;
         Z881EscMTxt1 = A881EscMTxt1 ;
         Z882EscMTxt2 = A882EscMTxt2 ;
         Z883EscMInc = A883EscMInc ;
         Z884EscMKgm = A884EscMKgm ;
         Z885EscMVol = A885EscMVol ;
         Z886EscMUltLin = A886EscMUltLin ;
         Z896EscMValCos = A896EscMValCos ;
         Z893EscMCosT = A893EscMCosT ;
         Z718PrdNom = A718PrdNom ;
         Z724PrdPreAct = A724PrdPreAct ;
         Z766ProForDsc = A766ProForDsc ;
         Z488ForPrdDsc = A488ForPrdDsc ;
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

   public void load1TJ120( )
   {
      /* Using cursor T01TJ12 */
      pr_default.execute(8, new Object[] {A396EmprCod, A910Workstat, Integer.valueOf(A887EscMLin)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound120 = (short)(1) ;
         A407EmprNom = T01TJ12_A407EmprNom[0] ;
         n407EmprNom = T01TJ12_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A881EscMTxt1 = T01TJ12_A881EscMTxt1[0] ;
         n881EscMTxt1 = T01TJ12_n881EscMTxt1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A881EscMTxt1", A881EscMTxt1);
         A882EscMTxt2 = T01TJ12_A882EscMTxt2[0] ;
         n882EscMTxt2 = T01TJ12_n882EscMTxt2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A882EscMTxt2", A882EscMTxt2);
         A883EscMInc = T01TJ12_A883EscMInc[0] ;
         n883EscMInc = T01TJ12_n883EscMInc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A883EscMInc", GXutil.ltrimstr( A883EscMInc, 5, 2));
         A884EscMKgm = T01TJ12_A884EscMKgm[0] ;
         n884EscMKgm = T01TJ12_n884EscMKgm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A884EscMKgm", GXutil.ltrimstr( A884EscMKgm, 10, 2));
         A885EscMVol = T01TJ12_A885EscMVol[0] ;
         n885EscMVol = T01TJ12_n885EscMVol[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A885EscMVol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A885EscMVol), 5, 0));
         A886EscMUltLin = T01TJ12_A886EscMUltLin[0] ;
         n886EscMUltLin = T01TJ12_n886EscMUltLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A886EscMUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A886EscMUltLin), 8, 0));
         A896EscMValCos = T01TJ12_A896EscMValCos[0] ;
         n896EscMValCos = T01TJ12_n896EscMValCos[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A896EscMValCos", GXutil.ltrimstr( DecimalUtil.doubleToDec(A896EscMValCos), 8, 0));
         A3915EmpNumDec = T01TJ12_A3915EmpNumDec[0] ;
         n3915EmpNumDec = T01TJ12_n3915EmpNumDec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3915EmpNumDec", GXutil.str( A3915EmpNumDec, 1, 0));
         A718PrdNom = T01TJ12_A718PrdNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
         A724PrdPreAct = T01TJ12_A724PrdPreAct[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A724PrdPreAct", GXutil.ltrimstr( A724PrdPreAct, 14, 5));
         A766ProForDsc = T01TJ12_A766ProForDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A766ProForDsc", A766ProForDsc);
         A897EscMDsc = T01TJ12_A897EscMDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A897EscMDsc", A897EscMDsc);
         A889EscMPrdPre = T01TJ12_A889EscMPrdPre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A889EscMPrdPre", GXutil.ltrimstr( A889EscMPrdPre, 14, 5));
         A890EscMCan = T01TJ12_A890EscMCan[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A890EscMCan", GXutil.ltrimstr( A890EscMCan, 11, 4));
         A488ForPrdDsc = T01TJ12_A488ForPrdDsc[0] ;
         n488ForPrdDsc = T01TJ12_n488ForPrdDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A488ForPrdDsc", A488ForPrdDsc);
         A891EscMCos = T01TJ12_A891EscMCos[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A891EscMCos", GXutil.ltrimstr( A891EscMCos, 15, 5));
         A4707EscMCliCod = T01TJ12_A4707EscMCliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4707EscMCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4707EscMCliCod), 6, 0));
         A4708EscMArtCod = T01TJ12_A4708EscMArtCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4708EscMArtCod", A4708EscMArtCod);
         A4709EscMMdlCod = T01TJ12_A4709EscMMdlCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4709EscMMdlCod", A4709EscMMdlCod);
         A4710EscMProCod = T01TJ12_A4710EscMProCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4710EscMProCod", A4710EscMProCod);
         A4711EscMFasCod = T01TJ12_A4711EscMFasCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4711EscMFasCod", A4711EscMFasCod);
         A4712EscMFacCon = T01TJ12_A4712EscMFacCon[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4712EscMFacCon", GXutil.ltrimstr( A4712EscMFacCon, 12, 5));
         A4713EscMRb = T01TJ12_A4713EscMRb[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4713EscMRb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4713EscMRb), 4, 0));
         A6060EscSol = T01TJ12_A6060EscSol[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6060EscSol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6060EscSol), 5, 0));
         A7584EscVolm = T01TJ12_A7584EscVolm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7584EscVolm", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7584EscVolm), 5, 0));
         A7583EscOrdn = T01TJ12_A7583EscOrdn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7583EscOrdn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7583EscOrdn), 4, 0));
         A10363EscMCant = T01TJ12_A10363EscMCant[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10363EscMCant", GXutil.ltrimstr( A10363EscMCant, 11, 3));
         A719PrdNum = T01TJ12_A719PrdNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         A764ProForCod = T01TJ12_A764ProForCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A764ProForCod", A764ProForCod);
         A490ForPrdUMe = T01TJ12_A490ForPrdUMe[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A490ForPrdUMe", GXutil.str( A490ForPrdUMe, 1, 0));
         A893EscMCosT = T01TJ12_A893EscMCosT[0] ;
         n893EscMCosT = T01TJ12_n893EscMCosT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A893EscMCosT", GXutil.ltrimstr( A893EscMCosT, 15, 5));
         zm1TJ120( -3) ;
      }
      pr_default.close(8);
      onLoadActions1TJ120( ) ;
   }

   public void onLoadActions1TJ120( )
   {
      if ( ( A490ForPrdUMe == 3 ) && ( A3915EmpNumDec == 0 ) )
      {
         A892EscMCosL = GXutil.roundDecimal( A889EscMPrdPre.multiply(A890EscMCan).multiply(A884EscMKgm).multiply(DecimalUtil.doubleToDec(A896EscMValCos)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN), 0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A892EscMCosL", GXutil.ltrimstr( A892EscMCosL, 15, 5));
      }
      else
      {
         if ( ( A490ForPrdUMe == 3 ) && ( A3915EmpNumDec == 2 ) )
         {
            A892EscMCosL = GXutil.roundDecimal( A889EscMPrdPre.multiply(A890EscMCan).multiply(A884EscMKgm).multiply(DecimalUtil.doubleToDec(A896EscMValCos)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN), 2) ;
            httpContext.ajax_rsp_assign_attri("", false, "A892EscMCosL", GXutil.ltrimstr( A892EscMCosL, 15, 5));
         }
         else
         {
            if ( ( A490ForPrdUMe != 3 ) && ( A3915EmpNumDec == 0 ) )
            {
               A892EscMCosL = GXutil.roundDecimal( A889EscMPrdPre.multiply(A890EscMCan).multiply(DecimalUtil.doubleToDec(A885EscMVol)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN), 0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A892EscMCosL", GXutil.ltrimstr( A892EscMCosL, 15, 5));
            }
            else
            {
               if ( ( A490ForPrdUMe != 3 ) && ( A3915EmpNumDec == 2 ) )
               {
                  A892EscMCosL = GXutil.roundDecimal( A889EscMPrdPre.multiply(A890EscMCan).multiply(DecimalUtil.doubleToDec(A885EscMVol)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN), 2) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A892EscMCosL", GXutil.ltrimstr( A892EscMCosL, 15, 5));
               }
               else
               {
                  A892EscMCosL = DecimalUtil.doubleToDec(0) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A892EscMCosL", GXutil.ltrimstr( A892EscMCosL, 15, 5));
               }
            }
         }
      }
   }

   public void checkExtendedTable1TJ120( )
   {
      nIsDirty_120 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01TJ4 */
      pr_default.execute(2, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01TJ4_A407EmprNom[0] ;
      n407EmprNom = T01TJ4_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      A3915EmpNumDec = T01TJ4_A3915EmpNumDec[0] ;
      n3915EmpNumDec = T01TJ4_n3915EmpNumDec[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A3915EmpNumDec", GXutil.str( A3915EmpNumDec, 1, 0));
      pr_default.close(2);
      /* Using cursor T01TJ5 */
      pr_default.execute(3, new Object[] {A396EmprCod, A719PrdNum});
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A718PrdNom = T01TJ5_A718PrdNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
      A724PrdPreAct = T01TJ5_A724PrdPreAct[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A724PrdPreAct", GXutil.ltrimstr( A724PrdPreAct, 14, 5));
      pr_default.close(3);
      /* Using cursor T01TJ6 */
      pr_default.execute(4, new Object[] {A396EmprCod, A764ProForCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CPROFO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROFORCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A766ProForDsc = T01TJ6_A766ProForDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A766ProForDsc", A766ProForDsc);
      pr_default.close(4);
      /* Using cursor T01TJ7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Byte.valueOf(A490ForPrdUMe)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "UNMEPR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FORPRDUME");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A488ForPrdDsc = T01TJ7_A488ForPrdDsc[0] ;
      n488ForPrdDsc = T01TJ7_n488ForPrdDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A488ForPrdDsc", A488ForPrdDsc);
      pr_default.close(5);
      /* Using cursor T01TJ8 */
      pr_default.execute(6, new Object[] {A396EmprCod, A910Workstat});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CESCAN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "WORKSTAT");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A881EscMTxt1 = T01TJ8_A881EscMTxt1[0] ;
      n881EscMTxt1 = T01TJ8_n881EscMTxt1[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A881EscMTxt1", A881EscMTxt1);
      A882EscMTxt2 = T01TJ8_A882EscMTxt2[0] ;
      n882EscMTxt2 = T01TJ8_n882EscMTxt2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A882EscMTxt2", A882EscMTxt2);
      A883EscMInc = T01TJ8_A883EscMInc[0] ;
      n883EscMInc = T01TJ8_n883EscMInc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A883EscMInc", GXutil.ltrimstr( A883EscMInc, 5, 2));
      A884EscMKgm = T01TJ8_A884EscMKgm[0] ;
      n884EscMKgm = T01TJ8_n884EscMKgm[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A884EscMKgm", GXutil.ltrimstr( A884EscMKgm, 10, 2));
      A885EscMVol = T01TJ8_A885EscMVol[0] ;
      n885EscMVol = T01TJ8_n885EscMVol[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A885EscMVol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A885EscMVol), 5, 0));
      A886EscMUltLin = T01TJ8_A886EscMUltLin[0] ;
      n886EscMUltLin = T01TJ8_n886EscMUltLin[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A886EscMUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A886EscMUltLin), 8, 0));
      A896EscMValCos = T01TJ8_A896EscMValCos[0] ;
      n896EscMValCos = T01TJ8_n896EscMValCos[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A896EscMValCos", GXutil.ltrimstr( DecimalUtil.doubleToDec(A896EscMValCos), 8, 0));
      pr_default.close(6);
      if ( ( A490ForPrdUMe == 3 ) && ( A3915EmpNumDec == 0 ) )
      {
         nIsDirty_120 = (short)(1) ;
         A892EscMCosL = GXutil.roundDecimal( A889EscMPrdPre.multiply(A890EscMCan).multiply(A884EscMKgm).multiply(DecimalUtil.doubleToDec(A896EscMValCos)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN), 0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A892EscMCosL", GXutil.ltrimstr( A892EscMCosL, 15, 5));
      }
      else
      {
         if ( ( A490ForPrdUMe == 3 ) && ( A3915EmpNumDec == 2 ) )
         {
            nIsDirty_120 = (short)(1) ;
            A892EscMCosL = GXutil.roundDecimal( A889EscMPrdPre.multiply(A890EscMCan).multiply(A884EscMKgm).multiply(DecimalUtil.doubleToDec(A896EscMValCos)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN), 2) ;
            httpContext.ajax_rsp_assign_attri("", false, "A892EscMCosL", GXutil.ltrimstr( A892EscMCosL, 15, 5));
         }
         else
         {
            if ( ( A490ForPrdUMe != 3 ) && ( A3915EmpNumDec == 0 ) )
            {
               nIsDirty_120 = (short)(1) ;
               A892EscMCosL = GXutil.roundDecimal( A889EscMPrdPre.multiply(A890EscMCan).multiply(DecimalUtil.doubleToDec(A885EscMVol)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN), 0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A892EscMCosL", GXutil.ltrimstr( A892EscMCosL, 15, 5));
            }
            else
            {
               if ( ( A490ForPrdUMe != 3 ) && ( A3915EmpNumDec == 2 ) )
               {
                  nIsDirty_120 = (short)(1) ;
                  A892EscMCosL = GXutil.roundDecimal( A889EscMPrdPre.multiply(A890EscMCan).multiply(DecimalUtil.doubleToDec(A885EscMVol)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN), 2) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A892EscMCosL", GXutil.ltrimstr( A892EscMCosL, 15, 5));
               }
               else
               {
                  nIsDirty_120 = (short)(1) ;
                  A892EscMCosL = DecimalUtil.doubleToDec(0) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A892EscMCosL", GXutil.ltrimstr( A892EscMCosL, 15, 5));
               }
            }
         }
      }
      /* Using cursor T01TJ10 */
      pr_default.execute(7, new Object[] {A396EmprCod, A910Workstat});
      if ( (pr_default.getStatus(7) != 101) )
      {
         A893EscMCosT = T01TJ10_A893EscMCosT[0] ;
         n893EscMCosT = T01TJ10_n893EscMCosT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A893EscMCosT", GXutil.ltrimstr( A893EscMCosT, 15, 5));
      }
      else
      {
         nIsDirty_120 = (short)(1) ;
         A893EscMCosT = DecimalUtil.doubleToDec(0) ;
         n893EscMCosT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A893EscMCosT", GXutil.ltrimstr( A893EscMCosT, 15, 5));
      }
      pr_default.close(7);
      if ( ! ( ( A490ForPrdUMe == 0 ) || ( A490ForPrdUMe == 1 ) || ( A490ForPrdUMe == 2 ) || ( A490ForPrdUMe == 3 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Unidad Medida", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "FORPRDUME");
         AnyError = (short)(1) ;
         GX_FocusControl = edtForPrdUMe_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors1TJ120( )
   {
      pr_default.close(2);
      pr_default.close(3);
      pr_default.close(4);
      pr_default.close(5);
      pr_default.close(6);
      pr_default.close(7);
   }

   public void enableDisable( )
   {
   }

   public void gxload_4( String A396EmprCod )
   {
      /* Using cursor T01TJ13 */
      pr_default.execute(9, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(9) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01TJ13_A407EmprNom[0] ;
      n407EmprNom = T01TJ13_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      A3915EmpNumDec = T01TJ13_A3915EmpNumDec[0] ;
      n3915EmpNumDec = T01TJ13_n3915EmpNumDec[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A3915EmpNumDec", GXutil.str( A3915EmpNumDec, 1, 0));
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A407EmprNom))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A3915EmpNumDec, (byte)(1), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(9) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(9);
   }

   public void gxload_5( String A396EmprCod ,
                         String A719PrdNum )
   {
      /* Using cursor T01TJ14 */
      pr_default.execute(10, new Object[] {A396EmprCod, A719PrdNum});
      if ( (pr_default.getStatus(10) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A718PrdNom = T01TJ14_A718PrdNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
      A724PrdPreAct = T01TJ14_A724PrdPreAct[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A724PrdPreAct", GXutil.ltrimstr( A724PrdPreAct, 14, 5));
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A718PrdNom))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A724PrdPreAct, (byte)(14), (byte)(5), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(10) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(10);
   }

   public void gxload_6( String A396EmprCod ,
                         String A764ProForCod )
   {
      /* Using cursor T01TJ15 */
      pr_default.execute(11, new Object[] {A396EmprCod, A764ProForCod});
      if ( (pr_default.getStatus(11) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CPROFO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROFORCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A766ProForDsc = T01TJ15_A766ProForDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A766ProForDsc", A766ProForDsc);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A766ProForDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(11) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(11);
   }

   public void gxload_7( String A396EmprCod ,
                         byte A490ForPrdUMe )
   {
      /* Using cursor T01TJ16 */
      pr_default.execute(12, new Object[] {A396EmprCod, Byte.valueOf(A490ForPrdUMe)});
      if ( (pr_default.getStatus(12) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "UNMEPR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FORPRDUME");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A488ForPrdDsc = T01TJ16_A488ForPrdDsc[0] ;
      n488ForPrdDsc = T01TJ16_n488ForPrdDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A488ForPrdDsc", A488ForPrdDsc);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A488ForPrdDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(12) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(12);
   }

   public void gxload_8( String A396EmprCod ,
                         String A910Workstat )
   {
      /* Using cursor T01TJ17 */
      pr_default.execute(13, new Object[] {A396EmprCod, A910Workstat});
      if ( (pr_default.getStatus(13) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CESCAN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "WORKSTAT");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A881EscMTxt1 = T01TJ17_A881EscMTxt1[0] ;
      n881EscMTxt1 = T01TJ17_n881EscMTxt1[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A881EscMTxt1", A881EscMTxt1);
      A882EscMTxt2 = T01TJ17_A882EscMTxt2[0] ;
      n882EscMTxt2 = T01TJ17_n882EscMTxt2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A882EscMTxt2", A882EscMTxt2);
      A883EscMInc = T01TJ17_A883EscMInc[0] ;
      n883EscMInc = T01TJ17_n883EscMInc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A883EscMInc", GXutil.ltrimstr( A883EscMInc, 5, 2));
      A884EscMKgm = T01TJ17_A884EscMKgm[0] ;
      n884EscMKgm = T01TJ17_n884EscMKgm[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A884EscMKgm", GXutil.ltrimstr( A884EscMKgm, 10, 2));
      A885EscMVol = T01TJ17_A885EscMVol[0] ;
      n885EscMVol = T01TJ17_n885EscMVol[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A885EscMVol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A885EscMVol), 5, 0));
      A886EscMUltLin = T01TJ17_A886EscMUltLin[0] ;
      n886EscMUltLin = T01TJ17_n886EscMUltLin[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A886EscMUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A886EscMUltLin), 8, 0));
      A896EscMValCos = T01TJ17_A896EscMValCos[0] ;
      n896EscMValCos = T01TJ17_n896EscMValCos[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A896EscMValCos", GXutil.ltrimstr( DecimalUtil.doubleToDec(A896EscMValCos), 8, 0));
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A881EscMTxt1))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A882EscMTxt2))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A883EscMInc, (byte)(5), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A884EscMKgm, (byte)(10), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A885EscMVol, (byte)(5), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A886EscMUltLin, (byte)(8), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A896EscMValCos, (byte)(8), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(13) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(13);
   }

   public void gxload_9( String A396EmprCod ,
                         String A910Workstat )
   {
      /* Using cursor T01TJ19 */
      pr_default.execute(14, new Object[] {A396EmprCod, A910Workstat});
      if ( (pr_default.getStatus(14) != 101) )
      {
         A893EscMCosT = T01TJ19_A893EscMCosT[0] ;
         n893EscMCosT = T01TJ19_n893EscMCosT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A893EscMCosT", GXutil.ltrimstr( A893EscMCosT, 15, 5));
      }
      else
      {
         A893EscMCosT = DecimalUtil.doubleToDec(0) ;
         n893EscMCosT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A893EscMCosT", GXutil.ltrimstr( A893EscMCosT, 15, 5));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A893EscMCosT, (byte)(15), (byte)(5), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(14) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(14);
   }

   public void getKey1TJ120( )
   {
      /* Using cursor T01TJ20 */
      pr_default.execute(15, new Object[] {A396EmprCod, A910Workstat, Integer.valueOf(A887EscMLin)});
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound120 = (short)(1) ;
      }
      else
      {
         RcdFound120 = (short)(0) ;
      }
      pr_default.close(15);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01TJ3 */
      pr_default.execute(1, new Object[] {A396EmprCod, A910Workstat, Integer.valueOf(A887EscMLin)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1TJ120( 3) ;
         RcdFound120 = (short)(1) ;
         A887EscMLin = T01TJ3_A887EscMLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A887EscMLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A887EscMLin), 8, 0));
         A897EscMDsc = T01TJ3_A897EscMDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A897EscMDsc", A897EscMDsc);
         A889EscMPrdPre = T01TJ3_A889EscMPrdPre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A889EscMPrdPre", GXutil.ltrimstr( A889EscMPrdPre, 14, 5));
         A890EscMCan = T01TJ3_A890EscMCan[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A890EscMCan", GXutil.ltrimstr( A890EscMCan, 11, 4));
         A891EscMCos = T01TJ3_A891EscMCos[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A891EscMCos", GXutil.ltrimstr( A891EscMCos, 15, 5));
         A4707EscMCliCod = T01TJ3_A4707EscMCliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4707EscMCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4707EscMCliCod), 6, 0));
         A4708EscMArtCod = T01TJ3_A4708EscMArtCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4708EscMArtCod", A4708EscMArtCod);
         A4709EscMMdlCod = T01TJ3_A4709EscMMdlCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4709EscMMdlCod", A4709EscMMdlCod);
         A4710EscMProCod = T01TJ3_A4710EscMProCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4710EscMProCod", A4710EscMProCod);
         A4711EscMFasCod = T01TJ3_A4711EscMFasCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4711EscMFasCod", A4711EscMFasCod);
         A4712EscMFacCon = T01TJ3_A4712EscMFacCon[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4712EscMFacCon", GXutil.ltrimstr( A4712EscMFacCon, 12, 5));
         A4713EscMRb = T01TJ3_A4713EscMRb[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4713EscMRb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4713EscMRb), 4, 0));
         A6060EscSol = T01TJ3_A6060EscSol[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6060EscSol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6060EscSol), 5, 0));
         A7584EscVolm = T01TJ3_A7584EscVolm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7584EscVolm", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7584EscVolm), 5, 0));
         A7583EscOrdn = T01TJ3_A7583EscOrdn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7583EscOrdn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7583EscOrdn), 4, 0));
         A10363EscMCant = T01TJ3_A10363EscMCant[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10363EscMCant", GXutil.ltrimstr( A10363EscMCant, 11, 3));
         A396EmprCod = T01TJ3_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A719PrdNum = T01TJ3_A719PrdNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         A764ProForCod = T01TJ3_A764ProForCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A764ProForCod", A764ProForCod);
         A490ForPrdUMe = T01TJ3_A490ForPrdUMe[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A490ForPrdUMe", GXutil.str( A490ForPrdUMe, 1, 0));
         A910Workstat = T01TJ3_A910Workstat[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A910Workstat", A910Workstat);
         Z396EmprCod = A396EmprCod ;
         Z910Workstat = A910Workstat ;
         Z887EscMLin = A887EscMLin ;
         sMode120 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1TJ120( ) ;
         if ( AnyError == 1 )
         {
            RcdFound120 = (short)(0) ;
            initializeNonKey1TJ120( ) ;
         }
         Gx_mode = sMode120 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound120 = (short)(0) ;
         initializeNonKey1TJ120( ) ;
         sMode120 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode120 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1TJ120( ) ;
      if ( RcdFound120 == 0 )
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
      RcdFound120 = (short)(0) ;
      /* Using cursor T01TJ21 */
      pr_default.execute(16, new Object[] {A396EmprCod, A396EmprCod, A910Workstat, A910Workstat, A396EmprCod, Integer.valueOf(A887EscMLin)});
      if ( (pr_default.getStatus(16) != 101) )
      {
         while ( (pr_default.getStatus(16) != 101) && ( ( GXutil.strcmp(T01TJ21_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01TJ21_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01TJ21_A910Workstat[0], A910Workstat) < 0 ) || ( GXutil.strcmp(T01TJ21_A910Workstat[0], A910Workstat) == 0 ) && ( GXutil.strcmp(T01TJ21_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01TJ21_A887EscMLin[0] < A887EscMLin ) ) )
         {
            pr_default.readNext(16);
         }
         if ( (pr_default.getStatus(16) != 101) && ( ( GXutil.strcmp(T01TJ21_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01TJ21_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01TJ21_A910Workstat[0], A910Workstat) > 0 ) || ( GXutil.strcmp(T01TJ21_A910Workstat[0], A910Workstat) == 0 ) && ( GXutil.strcmp(T01TJ21_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01TJ21_A887EscMLin[0] > A887EscMLin ) ) )
         {
            A396EmprCod = T01TJ21_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A910Workstat = T01TJ21_A910Workstat[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A910Workstat", A910Workstat);
            A887EscMLin = T01TJ21_A887EscMLin[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A887EscMLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A887EscMLin), 8, 0));
            RcdFound120 = (short)(1) ;
         }
      }
      pr_default.close(16);
   }

   public void move_previous( )
   {
      RcdFound120 = (short)(0) ;
      /* Using cursor T01TJ22 */
      pr_default.execute(17, new Object[] {A396EmprCod, A396EmprCod, A910Workstat, A910Workstat, A396EmprCod, Integer.valueOf(A887EscMLin)});
      if ( (pr_default.getStatus(17) != 101) )
      {
         while ( (pr_default.getStatus(17) != 101) && ( ( GXutil.strcmp(T01TJ22_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01TJ22_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01TJ22_A910Workstat[0], A910Workstat) > 0 ) || ( GXutil.strcmp(T01TJ22_A910Workstat[0], A910Workstat) == 0 ) && ( GXutil.strcmp(T01TJ22_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01TJ22_A887EscMLin[0] > A887EscMLin ) ) )
         {
            pr_default.readNext(17);
         }
         if ( (pr_default.getStatus(17) != 101) && ( ( GXutil.strcmp(T01TJ22_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01TJ22_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01TJ22_A910Workstat[0], A910Workstat) < 0 ) || ( GXutil.strcmp(T01TJ22_A910Workstat[0], A910Workstat) == 0 ) && ( GXutil.strcmp(T01TJ22_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01TJ22_A887EscMLin[0] < A887EscMLin ) ) )
         {
            A396EmprCod = T01TJ22_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A910Workstat = T01TJ22_A910Workstat[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A910Workstat", A910Workstat);
            A887EscMLin = T01TJ22_A887EscMLin[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A887EscMLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A887EscMLin), 8, 0));
            RcdFound120 = (short)(1) ;
         }
      }
      pr_default.close(17);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1TJ120( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1TJ120( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound120 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A910Workstat, Z910Workstat) != 0 ) || ( A887EscMLin != Z887EscMLin ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A910Workstat = Z910Workstat ;
               httpContext.ajax_rsp_assign_attri("", false, "A910Workstat", A910Workstat);
               A887EscMLin = Z887EscMLin ;
               httpContext.ajax_rsp_assign_attri("", false, "A887EscMLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A887EscMLin), 8, 0));
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
               update1TJ120( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A910Workstat, Z910Workstat) != 0 ) || ( A887EscMLin != Z887EscMLin ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1TJ120( ) ;
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
                  insert1TJ120( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A910Workstat, Z910Workstat) != 0 ) || ( A887EscMLin != Z887EscMLin ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A910Workstat = Z910Workstat ;
         httpContext.ajax_rsp_assign_attri("", false, "A910Workstat", A910Workstat);
         A887EscMLin = Z887EscMLin ;
         httpContext.ajax_rsp_assign_attri("", false, "A887EscMLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A887EscMLin), 8, 0));
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
      if ( RcdFound120 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtPrdNum_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1TJ120( ) ;
      if ( RcdFound120 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtPrdNum_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1TJ120( ) ;
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
      if ( RcdFound120 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtPrdNum_Internalname ;
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
      if ( RcdFound120 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtPrdNum_Internalname ;
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
      scanStart1TJ120( ) ;
      if ( RcdFound120 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound120 != 0 )
         {
            scanNext1TJ120( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtPrdNum_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1TJ120( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1TJ120( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01TJ2 */
         pr_default.execute(0, new Object[] {A396EmprCod, A910Workstat, Integer.valueOf(A887EscMLin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPESCMAN"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z897EscMDsc, T01TJ2_A897EscMDsc[0]) != 0 ) || ( DecimalUtil.compareTo(Z889EscMPrdPre, T01TJ2_A889EscMPrdPre[0]) != 0 ) || ( DecimalUtil.compareTo(Z890EscMCan, T01TJ2_A890EscMCan[0]) != 0 ) || ( DecimalUtil.compareTo(Z891EscMCos, T01TJ2_A891EscMCos[0]) != 0 ) || ( Z4707EscMCliCod != T01TJ2_A4707EscMCliCod[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z4708EscMArtCod, T01TJ2_A4708EscMArtCod[0]) != 0 ) || ( GXutil.strcmp(Z4709EscMMdlCod, T01TJ2_A4709EscMMdlCod[0]) != 0 ) || ( GXutil.strcmp(Z4710EscMProCod, T01TJ2_A4710EscMProCod[0]) != 0 ) || ( GXutil.strcmp(Z4711EscMFasCod, T01TJ2_A4711EscMFasCod[0]) != 0 ) || ( DecimalUtil.compareTo(Z4712EscMFacCon, T01TJ2_A4712EscMFacCon[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z4713EscMRb != T01TJ2_A4713EscMRb[0] ) || ( Z6060EscSol != T01TJ2_A6060EscSol[0] ) || ( Z7584EscVolm != T01TJ2_A7584EscVolm[0] ) || ( Z7583EscOrdn != T01TJ2_A7583EscOrdn[0] ) || ( DecimalUtil.compareTo(Z10363EscMCant, T01TJ2_A10363EscMCant[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z719PrdNum, T01TJ2_A719PrdNum[0]) != 0 ) || ( GXutil.strcmp(Z764ProForCod, T01TJ2_A764ProForCod[0]) != 0 ) || ( Z490ForPrdUMe != T01TJ2_A490ForPrdUMe[0] ) )
         {
            if ( GXutil.strcmp(Z897EscMDsc, T01TJ2_A897EscMDsc[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.simulacionformula_1:[seudo value changed for attri]"+"EscMDsc");
               GXutil.writeLogRaw("Old: ",Z897EscMDsc);
               GXutil.writeLogRaw("Current: ",T01TJ2_A897EscMDsc[0]);
            }
            if ( DecimalUtil.compareTo(Z889EscMPrdPre, T01TJ2_A889EscMPrdPre[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.simulacionformula_1:[seudo value changed for attri]"+"EscMPrdPre");
               GXutil.writeLogRaw("Old: ",Z889EscMPrdPre);
               GXutil.writeLogRaw("Current: ",T01TJ2_A889EscMPrdPre[0]);
            }
            if ( DecimalUtil.compareTo(Z890EscMCan, T01TJ2_A890EscMCan[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.simulacionformula_1:[seudo value changed for attri]"+"EscMCan");
               GXutil.writeLogRaw("Old: ",Z890EscMCan);
               GXutil.writeLogRaw("Current: ",T01TJ2_A890EscMCan[0]);
            }
            if ( DecimalUtil.compareTo(Z891EscMCos, T01TJ2_A891EscMCos[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.simulacionformula_1:[seudo value changed for attri]"+"EscMCos");
               GXutil.writeLogRaw("Old: ",Z891EscMCos);
               GXutil.writeLogRaw("Current: ",T01TJ2_A891EscMCos[0]);
            }
            if ( Z4707EscMCliCod != T01TJ2_A4707EscMCliCod[0] )
            {
               GXutil.writeLogln("formulaciontinte.simulacionformula_1:[seudo value changed for attri]"+"EscMCliCod");
               GXutil.writeLogRaw("Old: ",Z4707EscMCliCod);
               GXutil.writeLogRaw("Current: ",T01TJ2_A4707EscMCliCod[0]);
            }
            if ( GXutil.strcmp(Z4708EscMArtCod, T01TJ2_A4708EscMArtCod[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.simulacionformula_1:[seudo value changed for attri]"+"EscMArtCod");
               GXutil.writeLogRaw("Old: ",Z4708EscMArtCod);
               GXutil.writeLogRaw("Current: ",T01TJ2_A4708EscMArtCod[0]);
            }
            if ( GXutil.strcmp(Z4709EscMMdlCod, T01TJ2_A4709EscMMdlCod[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.simulacionformula_1:[seudo value changed for attri]"+"EscMMdlCod");
               GXutil.writeLogRaw("Old: ",Z4709EscMMdlCod);
               GXutil.writeLogRaw("Current: ",T01TJ2_A4709EscMMdlCod[0]);
            }
            if ( GXutil.strcmp(Z4710EscMProCod, T01TJ2_A4710EscMProCod[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.simulacionformula_1:[seudo value changed for attri]"+"EscMProCod");
               GXutil.writeLogRaw("Old: ",Z4710EscMProCod);
               GXutil.writeLogRaw("Current: ",T01TJ2_A4710EscMProCod[0]);
            }
            if ( GXutil.strcmp(Z4711EscMFasCod, T01TJ2_A4711EscMFasCod[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.simulacionformula_1:[seudo value changed for attri]"+"EscMFasCod");
               GXutil.writeLogRaw("Old: ",Z4711EscMFasCod);
               GXutil.writeLogRaw("Current: ",T01TJ2_A4711EscMFasCod[0]);
            }
            if ( DecimalUtil.compareTo(Z4712EscMFacCon, T01TJ2_A4712EscMFacCon[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.simulacionformula_1:[seudo value changed for attri]"+"EscMFacCon");
               GXutil.writeLogRaw("Old: ",Z4712EscMFacCon);
               GXutil.writeLogRaw("Current: ",T01TJ2_A4712EscMFacCon[0]);
            }
            if ( Z4713EscMRb != T01TJ2_A4713EscMRb[0] )
            {
               GXutil.writeLogln("formulaciontinte.simulacionformula_1:[seudo value changed for attri]"+"EscMRb");
               GXutil.writeLogRaw("Old: ",Z4713EscMRb);
               GXutil.writeLogRaw("Current: ",T01TJ2_A4713EscMRb[0]);
            }
            if ( Z6060EscSol != T01TJ2_A6060EscSol[0] )
            {
               GXutil.writeLogln("formulaciontinte.simulacionformula_1:[seudo value changed for attri]"+"EscSol");
               GXutil.writeLogRaw("Old: ",Z6060EscSol);
               GXutil.writeLogRaw("Current: ",T01TJ2_A6060EscSol[0]);
            }
            if ( Z7584EscVolm != T01TJ2_A7584EscVolm[0] )
            {
               GXutil.writeLogln("formulaciontinte.simulacionformula_1:[seudo value changed for attri]"+"EscVolm");
               GXutil.writeLogRaw("Old: ",Z7584EscVolm);
               GXutil.writeLogRaw("Current: ",T01TJ2_A7584EscVolm[0]);
            }
            if ( Z7583EscOrdn != T01TJ2_A7583EscOrdn[0] )
            {
               GXutil.writeLogln("formulaciontinte.simulacionformula_1:[seudo value changed for attri]"+"EscOrdn");
               GXutil.writeLogRaw("Old: ",Z7583EscOrdn);
               GXutil.writeLogRaw("Current: ",T01TJ2_A7583EscOrdn[0]);
            }
            if ( DecimalUtil.compareTo(Z10363EscMCant, T01TJ2_A10363EscMCant[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.simulacionformula_1:[seudo value changed for attri]"+"EscMCant");
               GXutil.writeLogRaw("Old: ",Z10363EscMCant);
               GXutil.writeLogRaw("Current: ",T01TJ2_A10363EscMCant[0]);
            }
            if ( GXutil.strcmp(Z719PrdNum, T01TJ2_A719PrdNum[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.simulacionformula_1:[seudo value changed for attri]"+"PrdNum");
               GXutil.writeLogRaw("Old: ",Z719PrdNum);
               GXutil.writeLogRaw("Current: ",T01TJ2_A719PrdNum[0]);
            }
            if ( GXutil.strcmp(Z764ProForCod, T01TJ2_A764ProForCod[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.simulacionformula_1:[seudo value changed for attri]"+"ProForCod");
               GXutil.writeLogRaw("Old: ",Z764ProForCod);
               GXutil.writeLogRaw("Current: ",T01TJ2_A764ProForCod[0]);
            }
            if ( Z490ForPrdUMe != T01TJ2_A490ForPrdUMe[0] )
            {
               GXutil.writeLogln("formulaciontinte.simulacionformula_1:[seudo value changed for attri]"+"ForPrdUMe");
               GXutil.writeLogRaw("Old: ",Z490ForPrdUMe);
               GXutil.writeLogRaw("Current: ",T01TJ2_A490ForPrdUMe[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPESCMAN"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1TJ120( )
   {
      beforeValidate1TJ120( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1TJ120( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1TJ120( 0) ;
         checkOptimisticConcurrency1TJ120( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1TJ120( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1TJ120( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01TJ23 */
                  pr_default.execute(18, new Object[] {Integer.valueOf(A887EscMLin), A897EscMDsc, A889EscMPrdPre, A890EscMCan, A891EscMCos, Integer.valueOf(A4707EscMCliCod), A4708EscMArtCod, A4709EscMMdlCod, A4710EscMProCod, A4711EscMFasCod, A4712EscMFacCon, Short.valueOf(A4713EscMRb), Integer.valueOf(A6060EscSol), Integer.valueOf(A7584EscVolm), Short.valueOf(A7583EscOrdn), A10363EscMCant, A396EmprCod, A719PrdNum, A764ProForCod, Byte.valueOf(A490ForPrdUMe), A910Workstat});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPESCMAN");
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
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                        endTrnMsgCod = "SuccessfullyAdded" ;
                        resetCaption1TJ0( ) ;
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
            load1TJ120( ) ;
         }
         endLevel1TJ120( ) ;
      }
      closeExtendedTableCursors1TJ120( ) ;
   }

   public void update1TJ120( )
   {
      beforeValidate1TJ120( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1TJ120( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1TJ120( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1TJ120( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1TJ120( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01TJ24 */
                  pr_default.execute(19, new Object[] {A897EscMDsc, A889EscMPrdPre, A890EscMCan, A891EscMCos, Integer.valueOf(A4707EscMCliCod), A4708EscMArtCod, A4709EscMMdlCod, A4710EscMProCod, A4711EscMFasCod, A4712EscMFacCon, Short.valueOf(A4713EscMRb), Integer.valueOf(A6060EscSol), Integer.valueOf(A7584EscVolm), Short.valueOf(A7583EscOrdn), A10363EscMCant, A719PrdNum, A764ProForCod, Byte.valueOf(A490ForPrdUMe), A396EmprCod, A910Workstat, Integer.valueOf(A887EscMLin)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPESCMAN");
                  if ( (pr_default.getStatus(19) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPESCMAN"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1TJ120( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption1TJ0( ) ;
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
         endLevel1TJ120( ) ;
      }
      closeExtendedTableCursors1TJ120( ) ;
   }

   public void deferredUpdate1TJ120( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1TJ120( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1TJ120( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1TJ120( ) ;
         afterConfirm1TJ120( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1TJ120( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01TJ25 */
               pr_default.execute(20, new Object[] {A396EmprCod, A910Workstat, Integer.valueOf(A887EscMLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPESCMAN");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound120 == 0 )
                     {
                        initAll1TJ120( ) ;
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
                     resetCaption1TJ0( ) ;
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
      sMode120 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1TJ120( ) ;
      Gx_mode = sMode120 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1TJ120( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01TJ26 */
         pr_default.execute(21, new Object[] {A396EmprCod});
         A407EmprNom = T01TJ26_A407EmprNom[0] ;
         n407EmprNom = T01TJ26_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A3915EmpNumDec = T01TJ26_A3915EmpNumDec[0] ;
         n3915EmpNumDec = T01TJ26_n3915EmpNumDec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3915EmpNumDec", GXutil.str( A3915EmpNumDec, 1, 0));
         pr_default.close(21);
         /* Using cursor T01TJ27 */
         pr_default.execute(22, new Object[] {A396EmprCod, A910Workstat});
         A881EscMTxt1 = T01TJ27_A881EscMTxt1[0] ;
         n881EscMTxt1 = T01TJ27_n881EscMTxt1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A881EscMTxt1", A881EscMTxt1);
         A882EscMTxt2 = T01TJ27_A882EscMTxt2[0] ;
         n882EscMTxt2 = T01TJ27_n882EscMTxt2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A882EscMTxt2", A882EscMTxt2);
         A883EscMInc = T01TJ27_A883EscMInc[0] ;
         n883EscMInc = T01TJ27_n883EscMInc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A883EscMInc", GXutil.ltrimstr( A883EscMInc, 5, 2));
         A884EscMKgm = T01TJ27_A884EscMKgm[0] ;
         n884EscMKgm = T01TJ27_n884EscMKgm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A884EscMKgm", GXutil.ltrimstr( A884EscMKgm, 10, 2));
         A885EscMVol = T01TJ27_A885EscMVol[0] ;
         n885EscMVol = T01TJ27_n885EscMVol[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A885EscMVol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A885EscMVol), 5, 0));
         A886EscMUltLin = T01TJ27_A886EscMUltLin[0] ;
         n886EscMUltLin = T01TJ27_n886EscMUltLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A886EscMUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A886EscMUltLin), 8, 0));
         A896EscMValCos = T01TJ27_A896EscMValCos[0] ;
         n896EscMValCos = T01TJ27_n896EscMValCos[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A896EscMValCos", GXutil.ltrimstr( DecimalUtil.doubleToDec(A896EscMValCos), 8, 0));
         pr_default.close(22);
         /* Using cursor T01TJ29 */
         pr_default.execute(23, new Object[] {A396EmprCod, A910Workstat});
         if ( (pr_default.getStatus(23) != 101) )
         {
            A893EscMCosT = T01TJ29_A893EscMCosT[0] ;
            n893EscMCosT = T01TJ29_n893EscMCosT[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A893EscMCosT", GXutil.ltrimstr( A893EscMCosT, 15, 5));
         }
         else
         {
            A893EscMCosT = DecimalUtil.doubleToDec(0) ;
            n893EscMCosT = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A893EscMCosT", GXutil.ltrimstr( A893EscMCosT, 15, 5));
         }
         pr_default.close(23);
         /* Using cursor T01TJ30 */
         pr_default.execute(24, new Object[] {A396EmprCod, A719PrdNum});
         A718PrdNom = T01TJ30_A718PrdNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
         A724PrdPreAct = T01TJ30_A724PrdPreAct[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A724PrdPreAct", GXutil.ltrimstr( A724PrdPreAct, 14, 5));
         pr_default.close(24);
         /* Using cursor T01TJ31 */
         pr_default.execute(25, new Object[] {A396EmprCod, A764ProForCod});
         A766ProForDsc = T01TJ31_A766ProForDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A766ProForDsc", A766ProForDsc);
         pr_default.close(25);
         /* Using cursor T01TJ32 */
         pr_default.execute(26, new Object[] {A396EmprCod, Byte.valueOf(A490ForPrdUMe)});
         A488ForPrdDsc = T01TJ32_A488ForPrdDsc[0] ;
         n488ForPrdDsc = T01TJ32_n488ForPrdDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A488ForPrdDsc", A488ForPrdDsc);
         pr_default.close(26);
         if ( ( A490ForPrdUMe == 3 ) && ( A3915EmpNumDec == 0 ) )
         {
            A892EscMCosL = GXutil.roundDecimal( A889EscMPrdPre.multiply(A890EscMCan).multiply(A884EscMKgm).multiply(DecimalUtil.doubleToDec(A896EscMValCos)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN), 0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A892EscMCosL", GXutil.ltrimstr( A892EscMCosL, 15, 5));
         }
         else
         {
            if ( ( A490ForPrdUMe == 3 ) && ( A3915EmpNumDec == 2 ) )
            {
               A892EscMCosL = GXutil.roundDecimal( A889EscMPrdPre.multiply(A890EscMCan).multiply(A884EscMKgm).multiply(DecimalUtil.doubleToDec(A896EscMValCos)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN), 2) ;
               httpContext.ajax_rsp_assign_attri("", false, "A892EscMCosL", GXutil.ltrimstr( A892EscMCosL, 15, 5));
            }
            else
            {
               if ( ( A490ForPrdUMe != 3 ) && ( A3915EmpNumDec == 0 ) )
               {
                  A892EscMCosL = GXutil.roundDecimal( A889EscMPrdPre.multiply(A890EscMCan).multiply(DecimalUtil.doubleToDec(A885EscMVol)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN), 0) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A892EscMCosL", GXutil.ltrimstr( A892EscMCosL, 15, 5));
               }
               else
               {
                  if ( ( A490ForPrdUMe != 3 ) && ( A3915EmpNumDec == 2 ) )
                  {
                     A892EscMCosL = GXutil.roundDecimal( A889EscMPrdPre.multiply(A890EscMCan).multiply(DecimalUtil.doubleToDec(A885EscMVol)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN), 2) ;
                     httpContext.ajax_rsp_assign_attri("", false, "A892EscMCosL", GXutil.ltrimstr( A892EscMCosL, 15, 5));
                  }
                  else
                  {
                     A892EscMCosL = DecimalUtil.doubleToDec(0) ;
                     httpContext.ajax_rsp_assign_attri("", false, "A892EscMCosL", GXutil.ltrimstr( A892EscMCosL, 15, 5));
                  }
               }
            }
         }
      }
   }

   public void endLevel1TJ120( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1TJ120( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "formulaciontinte.simulacionformula_1");
         if ( AnyError == 0 )
         {
            confirmValues1TJ0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "formulaciontinte.simulacionformula_1");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1TJ120( )
   {
      /* Using cursor T01TJ33 */
      pr_default.execute(27);
      RcdFound120 = (short)(0) ;
      if ( (pr_default.getStatus(27) != 101) )
      {
         RcdFound120 = (short)(1) ;
         A396EmprCod = T01TJ33_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A910Workstat = T01TJ33_A910Workstat[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A910Workstat", A910Workstat);
         A887EscMLin = T01TJ33_A887EscMLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A887EscMLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A887EscMLin), 8, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1TJ120( )
   {
      /* Scan next routine */
      pr_default.readNext(27);
      RcdFound120 = (short)(0) ;
      if ( (pr_default.getStatus(27) != 101) )
      {
         RcdFound120 = (short)(1) ;
         A396EmprCod = T01TJ33_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A910Workstat = T01TJ33_A910Workstat[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A910Workstat", A910Workstat);
         A887EscMLin = T01TJ33_A887EscMLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A887EscMLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A887EscMLin), 8, 0));
      }
   }

   public void scanEnd1TJ120( )
   {
      pr_default.close(27);
   }

   public void afterConfirm1TJ120( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1TJ120( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1TJ120( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1TJ120( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1TJ120( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1TJ120( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1TJ120( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtWorkstat_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtWorkstat_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtWorkstat_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtEscMTxt1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEscMTxt1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEscMTxt1_Enabled), 5, 0), true);
      edtEscMTxt2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEscMTxt2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEscMTxt2_Enabled), 5, 0), true);
      edtEscMInc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEscMInc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEscMInc_Enabled), 5, 0), true);
      edtEscMKgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEscMKgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEscMKgm_Enabled), 5, 0), true);
      edtEscMVol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEscMVol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEscMVol_Enabled), 5, 0), true);
      edtEscMUltLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEscMUltLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEscMUltLin_Enabled), 5, 0), true);
      edtEscMValCos_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEscMValCos_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEscMValCos_Enabled), 5, 0), true);
      edtEmpNumDec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmpNumDec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmpNumDec_Enabled), 5, 0), true);
      edtEscMCosT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEscMCosT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEscMCosT_Enabled), 5, 0), true);
      edtEscMLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEscMLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEscMLin_Enabled), 5, 0), true);
      edtPrdNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Enabled), 5, 0), true);
      edtPrdNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNom_Enabled), 5, 0), true);
      edtPrdPreAct_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdPreAct_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdPreAct_Enabled), 5, 0), true);
      edtProForCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForCod_Enabled), 5, 0), true);
      edtProForDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForDsc_Enabled), 5, 0), true);
      edtEscMDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEscMDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEscMDsc_Enabled), 5, 0), true);
      edtEscMPrdPre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEscMPrdPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEscMPrdPre_Enabled), 5, 0), true);
      edtEscMCan_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEscMCan_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEscMCan_Enabled), 5, 0), true);
      edtForPrdUMe_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForPrdUMe_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForPrdUMe_Enabled), 5, 0), true);
      edtForPrdDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForPrdDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForPrdDsc_Enabled), 5, 0), true);
      edtEscMCos_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEscMCos_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEscMCos_Enabled), 5, 0), true);
      edtEscMCosL_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEscMCosL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEscMCosL_Enabled), 5, 0), true);
      edtEscMCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEscMCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEscMCliCod_Enabled), 5, 0), true);
      edtEscMArtCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEscMArtCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEscMArtCod_Enabled), 5, 0), true);
      edtEscMMdlCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEscMMdlCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEscMMdlCod_Enabled), 5, 0), true);
      edtEscMProCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEscMProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEscMProCod_Enabled), 5, 0), true);
      edtEscMFasCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEscMFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEscMFasCod_Enabled), 5, 0), true);
      edtEscMFacCon_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEscMFacCon_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEscMFacCon_Enabled), 5, 0), true);
      edtEscMRb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEscMRb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEscMRb_Enabled), 5, 0), true);
      edtEscSol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEscSol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEscSol_Enabled), 5, 0), true);
      edtEscVolm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEscVolm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEscVolm_Enabled), 5, 0), true);
      edtEscOrdn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEscOrdn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEscOrdn_Enabled), 5, 0), true);
      edtEscMCant_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEscMCant_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEscMCant_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1TJ120( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1TJ0( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.formulaciontinte.simulacionformula_1", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z910Workstat", GXutil.rtrim( Z910Workstat));
      app.GxWebStd.gx_hidden_field( httpContext, "Z887EscMLin", GXutil.ltrim( localUtil.ntoc( Z887EscMLin, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z897EscMDsc", GXutil.rtrim( Z897EscMDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z889EscMPrdPre", GXutil.ltrim( localUtil.ntoc( Z889EscMPrdPre, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z890EscMCan", GXutil.ltrim( localUtil.ntoc( Z890EscMCan, (byte)(11), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z891EscMCos", GXutil.ltrim( localUtil.ntoc( Z891EscMCos, (byte)(15), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4707EscMCliCod", GXutil.ltrim( localUtil.ntoc( Z4707EscMCliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4708EscMArtCod", GXutil.rtrim( Z4708EscMArtCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4709EscMMdlCod", GXutil.rtrim( Z4709EscMMdlCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4710EscMProCod", GXutil.rtrim( Z4710EscMProCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4711EscMFasCod", GXutil.rtrim( Z4711EscMFasCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4712EscMFacCon", GXutil.ltrim( localUtil.ntoc( Z4712EscMFacCon, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4713EscMRb", GXutil.ltrim( localUtil.ntoc( Z4713EscMRb, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6060EscSol", GXutil.ltrim( localUtil.ntoc( Z6060EscSol, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7584EscVolm", GXutil.ltrim( localUtil.ntoc( Z7584EscVolm, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7583EscOrdn", GXutil.ltrim( localUtil.ntoc( Z7583EscOrdn, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10363EscMCant", GXutil.ltrim( localUtil.ntoc( Z10363EscMCant, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z719PrdNum", GXutil.rtrim( Z719PrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, "Z764ProForCod", GXutil.rtrim( Z764ProForCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z490ForPrdUMe", GXutil.ltrim( localUtil.ntoc( Z490ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
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
      return formatLink("app.formulaciontinte.simulacionformula_1", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "FormulacionTinte.SimulacionFormula_1" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Simulacion Formula", "") ;
   }

   public void initializeNonKey1TJ120( )
   {
      A893EscMCosT = DecimalUtil.ZERO ;
      n893EscMCosT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A893EscMCosT", GXutil.ltrimstr( A893EscMCosT, 15, 5));
      A892EscMCosL = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A892EscMCosL", GXutil.ltrimstr( A892EscMCosL, 15, 5));
      A407EmprNom = "" ;
      n407EmprNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      A881EscMTxt1 = "" ;
      n881EscMTxt1 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A881EscMTxt1", A881EscMTxt1);
      A882EscMTxt2 = "" ;
      n882EscMTxt2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A882EscMTxt2", A882EscMTxt2);
      A883EscMInc = DecimalUtil.ZERO ;
      n883EscMInc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A883EscMInc", GXutil.ltrimstr( A883EscMInc, 5, 2));
      A884EscMKgm = DecimalUtil.ZERO ;
      n884EscMKgm = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A884EscMKgm", GXutil.ltrimstr( A884EscMKgm, 10, 2));
      A885EscMVol = 0 ;
      n885EscMVol = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A885EscMVol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A885EscMVol), 5, 0));
      A886EscMUltLin = 0 ;
      n886EscMUltLin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A886EscMUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A886EscMUltLin), 8, 0));
      A896EscMValCos = 0 ;
      n896EscMValCos = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A896EscMValCos", GXutil.ltrimstr( DecimalUtil.doubleToDec(A896EscMValCos), 8, 0));
      A3915EmpNumDec = (byte)(0) ;
      n3915EmpNumDec = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3915EmpNumDec", GXutil.str( A3915EmpNumDec, 1, 0));
      A719PrdNum = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
      A718PrdNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
      A724PrdPreAct = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A724PrdPreAct", GXutil.ltrimstr( A724PrdPreAct, 14, 5));
      A764ProForCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A764ProForCod", A764ProForCod);
      A766ProForDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A766ProForDsc", A766ProForDsc);
      A897EscMDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A897EscMDsc", A897EscMDsc);
      A889EscMPrdPre = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A889EscMPrdPre", GXutil.ltrimstr( A889EscMPrdPre, 14, 5));
      A890EscMCan = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A890EscMCan", GXutil.ltrimstr( A890EscMCan, 11, 4));
      A490ForPrdUMe = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A490ForPrdUMe", GXutil.str( A490ForPrdUMe, 1, 0));
      A488ForPrdDsc = "" ;
      n488ForPrdDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A488ForPrdDsc", A488ForPrdDsc);
      A891EscMCos = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A891EscMCos", GXutil.ltrimstr( A891EscMCos, 15, 5));
      A4707EscMCliCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A4707EscMCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4707EscMCliCod), 6, 0));
      A4708EscMArtCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4708EscMArtCod", A4708EscMArtCod);
      A4709EscMMdlCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4709EscMMdlCod", A4709EscMMdlCod);
      A4710EscMProCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4710EscMProCod", A4710EscMProCod);
      A4711EscMFasCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4711EscMFasCod", A4711EscMFasCod);
      A4712EscMFacCon = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A4712EscMFacCon", GXutil.ltrimstr( A4712EscMFacCon, 12, 5));
      A4713EscMRb = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A4713EscMRb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4713EscMRb), 4, 0));
      A6060EscSol = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A6060EscSol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6060EscSol), 5, 0));
      A7584EscVolm = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A7584EscVolm", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7584EscVolm), 5, 0));
      A7583EscOrdn = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A7583EscOrdn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7583EscOrdn), 4, 0));
      A10363EscMCant = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A10363EscMCant", GXutil.ltrimstr( A10363EscMCant, 11, 3));
      Z897EscMDsc = "" ;
      Z889EscMPrdPre = DecimalUtil.ZERO ;
      Z890EscMCan = DecimalUtil.ZERO ;
      Z891EscMCos = DecimalUtil.ZERO ;
      Z4707EscMCliCod = 0 ;
      Z4708EscMArtCod = "" ;
      Z4709EscMMdlCod = "" ;
      Z4710EscMProCod = "" ;
      Z4711EscMFasCod = "" ;
      Z4712EscMFacCon = DecimalUtil.ZERO ;
      Z4713EscMRb = (short)(0) ;
      Z6060EscSol = 0 ;
      Z7584EscVolm = 0 ;
      Z7583EscOrdn = (short)(0) ;
      Z10363EscMCant = DecimalUtil.ZERO ;
      Z719PrdNum = "" ;
      Z764ProForCod = "" ;
      Z490ForPrdUMe = (byte)(0) ;
   }

   public void initAll1TJ120( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A910Workstat = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A910Workstat", A910Workstat);
      A887EscMLin = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A887EscMLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A887EscMLin), 8, 0));
      initializeNonKey1TJ120( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241512727", true, true);
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
      httpContext.AddJavascriptSource("formulaciontinte/simulacionformula_1.js", "?20268241512727", false, true);
      /* End function include_jscripts */
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
      edtWorkstat_Internalname = "WORKSTAT" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      edtEscMTxt1_Internalname = "ESCMTXT1" ;
      edtEscMTxt2_Internalname = "ESCMTXT2" ;
      edtEscMInc_Internalname = "ESCMINC" ;
      edtEscMKgm_Internalname = "ESCMKGM" ;
      edtEscMVol_Internalname = "ESCMVOL" ;
      edtEscMUltLin_Internalname = "ESCMULTLIN" ;
      edtEscMValCos_Internalname = "ESCMVALCOS" ;
      edtEmpNumDec_Internalname = "EMPNUMDEC" ;
      edtEscMCosT_Internalname = "ESCMCOST" ;
      edtEscMLin_Internalname = "ESCMLIN" ;
      edtPrdNum_Internalname = "PRDNUM" ;
      edtPrdNom_Internalname = "PRDNOM" ;
      edtPrdPreAct_Internalname = "PRDPREACT" ;
      edtProForCod_Internalname = "PROFORCOD" ;
      edtProForDsc_Internalname = "PROFORDSC" ;
      edtEscMDsc_Internalname = "ESCMDSC" ;
      edtEscMPrdPre_Internalname = "ESCMPRDPRE" ;
      edtEscMCan_Internalname = "ESCMCAN" ;
      edtForPrdUMe_Internalname = "FORPRDUME" ;
      edtForPrdDsc_Internalname = "FORPRDDSC" ;
      edtEscMCos_Internalname = "ESCMCOS" ;
      edtEscMCosL_Internalname = "ESCMCOSL" ;
      edtEscMCliCod_Internalname = "ESCMCLICOD" ;
      edtEscMArtCod_Internalname = "ESCMARTCOD" ;
      edtEscMMdlCod_Internalname = "ESCMMDLCOD" ;
      edtEscMProCod_Internalname = "ESCMPROCOD" ;
      edtEscMFasCod_Internalname = "ESCMFASCOD" ;
      edtEscMFacCon_Internalname = "ESCMFACCON" ;
      edtEscMRb_Internalname = "ESCMRB" ;
      edtEscSol_Internalname = "ESCSOL" ;
      edtEscVolm_Internalname = "ESCVOLM" ;
      edtEscOrdn_Internalname = "ESCORDN" ;
      edtEscMCant_Internalname = "ESCMCANT" ;
      divFormcontainer_Internalname = "FORMCONTAINER" ;
      bttBtn_enter_Internalname = "BTN_ENTER" ;
      bttBtn_cancel_Internalname = "BTN_CANCEL" ;
      bttBtn_delete_Internalname = "BTN_DELETE" ;
      divMaintable_Internalname = "MAINTABLE" ;
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
      Form.setCaption( httpContext.getMessage( "Simulacion Formula", "") );
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtEscMCant_Jsonclick = "" ;
      edtEscMCant_Enabled = 1 ;
      edtEscOrdn_Jsonclick = "" ;
      edtEscOrdn_Enabled = 1 ;
      edtEscVolm_Jsonclick = "" ;
      edtEscVolm_Enabled = 1 ;
      edtEscSol_Jsonclick = "" ;
      edtEscSol_Enabled = 1 ;
      edtEscMRb_Jsonclick = "" ;
      edtEscMRb_Enabled = 1 ;
      edtEscMFacCon_Jsonclick = "" ;
      edtEscMFacCon_Enabled = 1 ;
      edtEscMFasCod_Jsonclick = "" ;
      edtEscMFasCod_Enabled = 1 ;
      edtEscMProCod_Jsonclick = "" ;
      edtEscMProCod_Enabled = 1 ;
      edtEscMMdlCod_Jsonclick = "" ;
      edtEscMMdlCod_Enabled = 1 ;
      edtEscMArtCod_Jsonclick = "" ;
      edtEscMArtCod_Enabled = 1 ;
      edtEscMCliCod_Jsonclick = "" ;
      edtEscMCliCod_Enabled = 1 ;
      edtEscMCosL_Jsonclick = "" ;
      edtEscMCosL_Enabled = 0 ;
      edtEscMCos_Jsonclick = "" ;
      edtEscMCos_Enabled = 1 ;
      edtForPrdDsc_Jsonclick = "" ;
      edtForPrdDsc_Enabled = 0 ;
      edtForPrdUMe_Jsonclick = "" ;
      edtForPrdUMe_Enabled = 1 ;
      edtEscMCan_Jsonclick = "" ;
      edtEscMCan_Enabled = 1 ;
      edtEscMPrdPre_Jsonclick = "" ;
      edtEscMPrdPre_Enabled = 1 ;
      edtEscMDsc_Jsonclick = "" ;
      edtEscMDsc_Enabled = 1 ;
      edtProForDsc_Jsonclick = "" ;
      edtProForDsc_Enabled = 0 ;
      edtProForCod_Jsonclick = "" ;
      edtProForCod_Enabled = 1 ;
      edtPrdPreAct_Jsonclick = "" ;
      edtPrdPreAct_Enabled = 0 ;
      edtPrdNom_Jsonclick = "" ;
      edtPrdNom_Enabled = 0 ;
      edtPrdNum_Jsonclick = "" ;
      edtPrdNum_Enabled = 1 ;
      edtEscMLin_Jsonclick = "" ;
      edtEscMLin_Enabled = 1 ;
      edtEscMCosT_Jsonclick = "" ;
      edtEscMCosT_Enabled = 0 ;
      edtEmpNumDec_Jsonclick = "" ;
      edtEmpNumDec_Enabled = 0 ;
      edtEscMValCos_Jsonclick = "" ;
      edtEscMValCos_Enabled = 0 ;
      edtEscMUltLin_Jsonclick = "" ;
      edtEscMUltLin_Enabled = 0 ;
      edtEscMVol_Jsonclick = "" ;
      edtEscMVol_Enabled = 0 ;
      edtEscMKgm_Jsonclick = "" ;
      edtEscMKgm_Enabled = 0 ;
      edtEscMInc_Jsonclick = "" ;
      edtEscMInc_Enabled = 0 ;
      edtEscMTxt2_Jsonclick = "" ;
      edtEscMTxt2_Enabled = 0 ;
      edtEscMTxt1_Jsonclick = "" ;
      edtEscMTxt1_Enabled = 0 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Enabled = 0 ;
      edtWorkstat_Jsonclick = "" ;
      edtWorkstat_Enabled = 1 ;
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

   public void init_web_controls( )
   {
      /* End function init_web_controls */
   }

   public void afterkeyloadscreen( )
   {
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      getEqualNoModal( ) ;
      /* Using cursor T01TJ26 */
      pr_default.execute(21, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(21) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01TJ26_A407EmprNom[0] ;
      n407EmprNom = T01TJ26_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      A3915EmpNumDec = T01TJ26_A3915EmpNumDec[0] ;
      n3915EmpNumDec = T01TJ26_n3915EmpNumDec[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A3915EmpNumDec", GXutil.str( A3915EmpNumDec, 1, 0));
      pr_default.close(21);
      /* Using cursor T01TJ27 */
      pr_default.execute(22, new Object[] {A396EmprCod, A910Workstat});
      if ( (pr_default.getStatus(22) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CESCAN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "WORKSTAT");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A881EscMTxt1 = T01TJ27_A881EscMTxt1[0] ;
      n881EscMTxt1 = T01TJ27_n881EscMTxt1[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A881EscMTxt1", A881EscMTxt1);
      A882EscMTxt2 = T01TJ27_A882EscMTxt2[0] ;
      n882EscMTxt2 = T01TJ27_n882EscMTxt2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A882EscMTxt2", A882EscMTxt2);
      A883EscMInc = T01TJ27_A883EscMInc[0] ;
      n883EscMInc = T01TJ27_n883EscMInc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A883EscMInc", GXutil.ltrimstr( A883EscMInc, 5, 2));
      A884EscMKgm = T01TJ27_A884EscMKgm[0] ;
      n884EscMKgm = T01TJ27_n884EscMKgm[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A884EscMKgm", GXutil.ltrimstr( A884EscMKgm, 10, 2));
      A885EscMVol = T01TJ27_A885EscMVol[0] ;
      n885EscMVol = T01TJ27_n885EscMVol[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A885EscMVol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A885EscMVol), 5, 0));
      A886EscMUltLin = T01TJ27_A886EscMUltLin[0] ;
      n886EscMUltLin = T01TJ27_n886EscMUltLin[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A886EscMUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A886EscMUltLin), 8, 0));
      A896EscMValCos = T01TJ27_A896EscMValCos[0] ;
      n896EscMValCos = T01TJ27_n896EscMValCos[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A896EscMValCos", GXutil.ltrimstr( DecimalUtil.doubleToDec(A896EscMValCos), 8, 0));
      pr_default.close(22);
      /* Using cursor T01TJ29 */
      pr_default.execute(23, new Object[] {A396EmprCod, A910Workstat});
      if ( (pr_default.getStatus(23) != 101) )
      {
         A893EscMCosT = T01TJ29_A893EscMCosT[0] ;
         n893EscMCosT = T01TJ29_n893EscMCosT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A893EscMCosT", GXutil.ltrimstr( A893EscMCosT, 15, 5));
      }
      else
      {
         A893EscMCosT = DecimalUtil.doubleToDec(0) ;
         n893EscMCosT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A893EscMCosT", GXutil.ltrimstr( A893EscMCosT, 15, 5));
      }
      pr_default.close(23);
      GX_FocusControl = edtPrdNum_Internalname ;
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
      /* Using cursor T01TJ26 */
      pr_default.execute(21, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(21) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A407EmprNom = T01TJ26_A407EmprNom[0] ;
      n407EmprNom = T01TJ26_n407EmprNom[0] ;
      A3915EmpNumDec = T01TJ26_A3915EmpNumDec[0] ;
      n3915EmpNumDec = T01TJ26_n3915EmpNumDec[0] ;
      pr_default.close(21);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A3915EmpNumDec", GXutil.ltrim( localUtil.ntoc( A3915EmpNumDec, (byte)(1), (byte)(0), ".", "")));
   }

   public void valid_Workstat( )
   {
      n881EscMTxt1 = false ;
      n882EscMTxt2 = false ;
      n883EscMInc = false ;
      n884EscMKgm = false ;
      n885EscMVol = false ;
      n886EscMUltLin = false ;
      n896EscMValCos = false ;
      n893EscMCosT = false ;
      /* Using cursor T01TJ27 */
      pr_default.execute(22, new Object[] {A396EmprCod, A910Workstat});
      if ( (pr_default.getStatus(22) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CESCAN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "WORKSTAT");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A881EscMTxt1 = T01TJ27_A881EscMTxt1[0] ;
      n881EscMTxt1 = T01TJ27_n881EscMTxt1[0] ;
      A882EscMTxt2 = T01TJ27_A882EscMTxt2[0] ;
      n882EscMTxt2 = T01TJ27_n882EscMTxt2[0] ;
      A883EscMInc = T01TJ27_A883EscMInc[0] ;
      n883EscMInc = T01TJ27_n883EscMInc[0] ;
      A884EscMKgm = T01TJ27_A884EscMKgm[0] ;
      n884EscMKgm = T01TJ27_n884EscMKgm[0] ;
      A885EscMVol = T01TJ27_A885EscMVol[0] ;
      n885EscMVol = T01TJ27_n885EscMVol[0] ;
      A886EscMUltLin = T01TJ27_A886EscMUltLin[0] ;
      n886EscMUltLin = T01TJ27_n886EscMUltLin[0] ;
      A896EscMValCos = T01TJ27_A896EscMValCos[0] ;
      n896EscMValCos = T01TJ27_n896EscMValCos[0] ;
      pr_default.close(22);
      /* Using cursor T01TJ29 */
      pr_default.execute(23, new Object[] {A396EmprCod, A910Workstat});
      if ( (pr_default.getStatus(23) != 101) )
      {
         A893EscMCosT = T01TJ29_A893EscMCosT[0] ;
         n893EscMCosT = T01TJ29_n893EscMCosT[0] ;
      }
      else
      {
         A893EscMCosT = DecimalUtil.doubleToDec(0) ;
         n893EscMCosT = false ;
      }
      pr_default.close(23);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A881EscMTxt1", GXutil.rtrim( A881EscMTxt1));
      httpContext.ajax_rsp_assign_attri("", false, "A882EscMTxt2", GXutil.rtrim( A882EscMTxt2));
      httpContext.ajax_rsp_assign_attri("", false, "A883EscMInc", GXutil.ltrim( localUtil.ntoc( A883EscMInc, (byte)(5), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A884EscMKgm", GXutil.ltrim( localUtil.ntoc( A884EscMKgm, (byte)(10), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A885EscMVol", GXutil.ltrim( localUtil.ntoc( A885EscMVol, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A886EscMUltLin", GXutil.ltrim( localUtil.ntoc( A886EscMUltLin, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A896EscMValCos", GXutil.ltrim( localUtil.ntoc( A896EscMValCos, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A893EscMCosT", GXutil.ltrim( localUtil.ntoc( A893EscMCosT, (byte)(15), (byte)(5), ".", "")));
   }

   public void valid_Escmlin( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", GXutil.rtrim( A719PrdNum));
      httpContext.ajax_rsp_assign_attri("", false, "A764ProForCod", GXutil.rtrim( A764ProForCod));
      httpContext.ajax_rsp_assign_attri("", false, "A897EscMDsc", GXutil.rtrim( A897EscMDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A889EscMPrdPre", GXutil.ltrim( localUtil.ntoc( A889EscMPrdPre, (byte)(14), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A890EscMCan", GXutil.ltrim( localUtil.ntoc( A890EscMCan, (byte)(11), (byte)(4), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A490ForPrdUMe", GXutil.ltrim( localUtil.ntoc( A490ForPrdUMe, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A891EscMCos", GXutil.ltrim( localUtil.ntoc( A891EscMCos, (byte)(15), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4707EscMCliCod", GXutil.ltrim( localUtil.ntoc( A4707EscMCliCod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4708EscMArtCod", GXutil.rtrim( A4708EscMArtCod));
      httpContext.ajax_rsp_assign_attri("", false, "A4709EscMMdlCod", GXutil.rtrim( A4709EscMMdlCod));
      httpContext.ajax_rsp_assign_attri("", false, "A4710EscMProCod", GXutil.rtrim( A4710EscMProCod));
      httpContext.ajax_rsp_assign_attri("", false, "A4711EscMFasCod", GXutil.rtrim( A4711EscMFasCod));
      httpContext.ajax_rsp_assign_attri("", false, "A4712EscMFacCon", GXutil.ltrim( localUtil.ntoc( A4712EscMFacCon, (byte)(12), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4713EscMRb", GXutil.ltrim( localUtil.ntoc( A4713EscMRb, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6060EscSol", GXutil.ltrim( localUtil.ntoc( A6060EscSol, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A7584EscVolm", GXutil.ltrim( localUtil.ntoc( A7584EscVolm, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A7583EscOrdn", GXutil.ltrim( localUtil.ntoc( A7583EscOrdn, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10363EscMCant", GXutil.ltrim( localUtil.ntoc( A10363EscMCant, (byte)(11), (byte)(3), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A3915EmpNumDec", GXutil.ltrim( localUtil.ntoc( A3915EmpNumDec, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", GXutil.rtrim( A718PrdNom));
      httpContext.ajax_rsp_assign_attri("", false, "A724PrdPreAct", GXutil.ltrim( localUtil.ntoc( A724PrdPreAct, (byte)(14), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A766ProForDsc", GXutil.rtrim( A766ProForDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A488ForPrdDsc", GXutil.rtrim( A488ForPrdDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A881EscMTxt1", GXutil.rtrim( A881EscMTxt1));
      httpContext.ajax_rsp_assign_attri("", false, "A882EscMTxt2", GXutil.rtrim( A882EscMTxt2));
      httpContext.ajax_rsp_assign_attri("", false, "A883EscMInc", GXutil.ltrim( localUtil.ntoc( A883EscMInc, (byte)(5), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A884EscMKgm", GXutil.ltrim( localUtil.ntoc( A884EscMKgm, (byte)(10), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A885EscMVol", GXutil.ltrim( localUtil.ntoc( A885EscMVol, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A886EscMUltLin", GXutil.ltrim( localUtil.ntoc( A886EscMUltLin, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A896EscMValCos", GXutil.ltrim( localUtil.ntoc( A896EscMValCos, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A892EscMCosL", GXutil.ltrim( localUtil.ntoc( A892EscMCosL, (byte)(15), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A893EscMCosT", GXutil.ltrim( localUtil.ntoc( A893EscMCosT, (byte)(15), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z910Workstat", GXutil.rtrim( Z910Workstat));
      app.GxWebStd.gx_hidden_field( httpContext, "Z887EscMLin", GXutil.ltrim( localUtil.ntoc( Z887EscMLin, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z719PrdNum", GXutil.rtrim( Z719PrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, "Z764ProForCod", GXutil.rtrim( Z764ProForCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z897EscMDsc", GXutil.rtrim( Z897EscMDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z889EscMPrdPre", GXutil.ltrim( localUtil.ntoc( Z889EscMPrdPre, (byte)(14), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z890EscMCan", GXutil.ltrim( localUtil.ntoc( Z890EscMCan, (byte)(11), (byte)(4), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z490ForPrdUMe", GXutil.ltrim( localUtil.ntoc( Z490ForPrdUMe, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z891EscMCos", GXutil.ltrim( localUtil.ntoc( Z891EscMCos, (byte)(15), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4707EscMCliCod", GXutil.ltrim( localUtil.ntoc( Z4707EscMCliCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4708EscMArtCod", GXutil.rtrim( Z4708EscMArtCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4709EscMMdlCod", GXutil.rtrim( Z4709EscMMdlCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4710EscMProCod", GXutil.rtrim( Z4710EscMProCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4711EscMFasCod", GXutil.rtrim( Z4711EscMFasCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4712EscMFacCon", GXutil.ltrim( localUtil.ntoc( Z4712EscMFacCon, (byte)(12), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4713EscMRb", GXutil.ltrim( localUtil.ntoc( Z4713EscMRb, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6060EscSol", GXutil.ltrim( localUtil.ntoc( Z6060EscSol, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7584EscVolm", GXutil.ltrim( localUtil.ntoc( Z7584EscVolm, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7583EscOrdn", GXutil.ltrim( localUtil.ntoc( Z7583EscOrdn, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10363EscMCant", GXutil.ltrim( localUtil.ntoc( Z10363EscMCant, (byte)(11), (byte)(3), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3915EmpNumDec", GXutil.ltrim( localUtil.ntoc( Z3915EmpNumDec, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z718PrdNom", GXutil.rtrim( Z718PrdNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z724PrdPreAct", GXutil.ltrim( localUtil.ntoc( Z724PrdPreAct, (byte)(14), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z766ProForDsc", GXutil.rtrim( Z766ProForDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z488ForPrdDsc", GXutil.rtrim( Z488ForPrdDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z881EscMTxt1", GXutil.rtrim( Z881EscMTxt1));
      app.GxWebStd.gx_hidden_field( httpContext, "Z882EscMTxt2", GXutil.rtrim( Z882EscMTxt2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z883EscMInc", GXutil.ltrim( localUtil.ntoc( Z883EscMInc, (byte)(5), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z884EscMKgm", GXutil.ltrim( localUtil.ntoc( Z884EscMKgm, (byte)(10), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z885EscMVol", GXutil.ltrim( localUtil.ntoc( Z885EscMVol, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z886EscMUltLin", GXutil.ltrim( localUtil.ntoc( Z886EscMUltLin, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z896EscMValCos", GXutil.ltrim( localUtil.ntoc( Z896EscMValCos, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z892EscMCosL", GXutil.ltrim( localUtil.ntoc( Z892EscMCosL, (byte)(15), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z893EscMCosT", GXutil.ltrim( localUtil.ntoc( Z893EscMCosT, (byte)(15), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Prdnum( )
   {
      /* Using cursor T01TJ30 */
      pr_default.execute(24, new Object[] {A396EmprCod, A719PrdNum});
      if ( (pr_default.getStatus(24) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A718PrdNom = T01TJ30_A718PrdNom[0] ;
      A724PrdPreAct = T01TJ30_A724PrdPreAct[0] ;
      pr_default.close(24);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", GXutil.rtrim( A718PrdNom));
      httpContext.ajax_rsp_assign_attri("", false, "A724PrdPreAct", GXutil.ltrim( localUtil.ntoc( A724PrdPreAct, (byte)(14), (byte)(5), ".", "")));
   }

   public void valid_Proforcod( )
   {
      /* Using cursor T01TJ31 */
      pr_default.execute(25, new Object[] {A396EmprCod, A764ProForCod});
      if ( (pr_default.getStatus(25) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CPROFO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROFORCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A766ProForDsc = T01TJ31_A766ProForDsc[0] ;
      pr_default.close(25);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A766ProForDsc", GXutil.rtrim( A766ProForDsc));
   }

   public void valid_Forprdume( )
   {
      n884EscMKgm = false ;
      n896EscMValCos = false ;
      n3915EmpNumDec = false ;
      n885EscMVol = false ;
      n488ForPrdDsc = false ;
      /* Using cursor T01TJ32 */
      pr_default.execute(26, new Object[] {A396EmprCod, Byte.valueOf(A490ForPrdUMe)});
      if ( (pr_default.getStatus(26) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "UNMEPR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FORPRDUME");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A488ForPrdDsc = T01TJ32_A488ForPrdDsc[0] ;
      n488ForPrdDsc = T01TJ32_n488ForPrdDsc[0] ;
      pr_default.close(26);
      if ( ! ( ( A490ForPrdUMe == 0 ) || ( A490ForPrdUMe == 1 ) || ( A490ForPrdUMe == 2 ) || ( A490ForPrdUMe == 3 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Unidad Medida", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "FORPRDUME");
         AnyError = (short)(1) ;
         GX_FocusControl = edtForPrdUMe_Internalname ;
      }
      if ( ( A490ForPrdUMe == 3 ) && ( A3915EmpNumDec == 0 ) )
      {
         A892EscMCosL = GXutil.roundDecimal( A889EscMPrdPre.multiply(A890EscMCan).multiply(A884EscMKgm).multiply(DecimalUtil.doubleToDec(A896EscMValCos)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN), 0) ;
      }
      else
      {
         if ( ( A490ForPrdUMe == 3 ) && ( A3915EmpNumDec == 2 ) )
         {
            A892EscMCosL = GXutil.roundDecimal( A889EscMPrdPre.multiply(A890EscMCan).multiply(A884EscMKgm).multiply(DecimalUtil.doubleToDec(A896EscMValCos)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN), 2) ;
         }
         else
         {
            if ( ( A490ForPrdUMe != 3 ) && ( A3915EmpNumDec == 0 ) )
            {
               A892EscMCosL = GXutil.roundDecimal( A889EscMPrdPre.multiply(A890EscMCan).multiply(DecimalUtil.doubleToDec(A885EscMVol)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN), 0) ;
            }
            else
            {
               if ( ( A490ForPrdUMe != 3 ) && ( A3915EmpNumDec == 2 ) )
               {
                  A892EscMCosL = GXutil.roundDecimal( A889EscMPrdPre.multiply(A890EscMCan).multiply(DecimalUtil.doubleToDec(A885EscMVol)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN), 2) ;
               }
               else
               {
                  A892EscMCosL = DecimalUtil.doubleToDec(0) ;
               }
            }
         }
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A488ForPrdDsc", GXutil.rtrim( A488ForPrdDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A892EscMCosL", GXutil.ltrim( localUtil.ntoc( A892EscMCosL, (byte)(15), (byte)(5), ".", "")));
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
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A3915EmpNumDec',fld:'EMPNUMDEC',pic:'9'}]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A3915EmpNumDec',fld:'EMPNUMDEC',pic:'9'}]}");
      setEventMetadata("VALID_WORKSTAT","{handler:'valid_Workstat',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A910Workstat',fld:'WORKSTAT',pic:''},{av:'A881EscMTxt1',fld:'ESCMTXT1',pic:''},{av:'A882EscMTxt2',fld:'ESCMTXT2',pic:''},{av:'A883EscMInc',fld:'ESCMINC',pic:'Z9.99'},{av:'A884EscMKgm',fld:'ESCMKGM',pic:'ZZZZZZ9.99'},{av:'A885EscMVol',fld:'ESCMVOL',pic:'ZZZZ9'},{av:'A886EscMUltLin',fld:'ESCMULTLIN',pic:'ZZ9'},{av:'A896EscMValCos',fld:'ESCMVALCOS',pic:'ZZZZZZZ9'},{av:'A893EscMCosT',fld:'ESCMCOST',pic:'ZZZZZZZZ9.99999'}]");
      setEventMetadata("VALID_WORKSTAT",",oparms:[{av:'A881EscMTxt1',fld:'ESCMTXT1',pic:''},{av:'A882EscMTxt2',fld:'ESCMTXT2',pic:''},{av:'A883EscMInc',fld:'ESCMINC',pic:'Z9.99'},{av:'A884EscMKgm',fld:'ESCMKGM',pic:'ZZZZZZ9.99'},{av:'A885EscMVol',fld:'ESCMVOL',pic:'ZZZZ9'},{av:'A886EscMUltLin',fld:'ESCMULTLIN',pic:'ZZ9'},{av:'A896EscMValCos',fld:'ESCMVALCOS',pic:'ZZZZZZZ9'},{av:'A893EscMCosT',fld:'ESCMCOST',pic:'ZZZZZZZZ9.99999'}]}");
      setEventMetadata("VALID_ESCMKGM","{handler:'valid_Escmkgm',iparms:[]");
      setEventMetadata("VALID_ESCMKGM",",oparms:[]}");
      setEventMetadata("VALID_ESCMVOL","{handler:'valid_Escmvol',iparms:[]");
      setEventMetadata("VALID_ESCMVOL",",oparms:[]}");
      setEventMetadata("VALID_ESCMVALCOS","{handler:'valid_Escmvalcos',iparms:[]");
      setEventMetadata("VALID_ESCMVALCOS",",oparms:[]}");
      setEventMetadata("VALID_EMPNUMDEC","{handler:'valid_Empnumdec',iparms:[]");
      setEventMetadata("VALID_EMPNUMDEC",",oparms:[]}");
      setEventMetadata("VALID_ESCMLIN","{handler:'valid_Escmlin',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A910Workstat',fld:'WORKSTAT',pic:''},{av:'A887EscMLin',fld:'ESCMLIN',pic:'ZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_ESCMLIN",",oparms:[{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A764ProForCod',fld:'PROFORCOD',pic:''},{av:'A897EscMDsc',fld:'ESCMDSC',pic:''},{av:'A889EscMPrdPre',fld:'ESCMPRDPRE',pic:'ZZZZZZZ9.999'},{av:'A890EscMCan',fld:'ESCMCAN',pic:'ZZZZZ9.9999'},{av:'A490ForPrdUMe',fld:'FORPRDUME',pic:'9'},{av:'A891EscMCos',fld:'ESCMCOS',pic:'ZZZZZZZZ9.99999'},{av:'A4707EscMCliCod',fld:'ESCMCLICOD',pic:'ZZZZZ9'},{av:'A4708EscMArtCod',fld:'ESCMARTCOD',pic:''},{av:'A4709EscMMdlCod',fld:'ESCMMDLCOD',pic:''},{av:'A4710EscMProCod',fld:'ESCMPROCOD',pic:''},{av:'A4711EscMFasCod',fld:'ESCMFASCOD',pic:''},{av:'A4712EscMFacCon',fld:'ESCMFACCON',pic:'ZZZZZ9.99999'},{av:'A4713EscMRb',fld:'ESCMRB',pic:'ZZZ9'},{av:'A6060EscSol',fld:'ESCSOL',pic:'ZZZZ9'},{av:'A7584EscVolm',fld:'ESCVOLM',pic:'ZZZZ9'},{av:'A7583EscOrdn',fld:'ESCORDN',pic:'ZZZ9'},{av:'A10363EscMCant',fld:'ESCMCANT',pic:'ZZZZZZ9.999'},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A3915EmpNumDec',fld:'EMPNUMDEC',pic:'9'},{av:'A718PrdNom',fld:'PRDNOM',pic:''},{av:'A724PrdPreAct',fld:'PRDPREACT',pic:'ZZZZZZZ9.999'},{av:'A766ProForDsc',fld:'PROFORDSC',pic:''},{av:'A488ForPrdDsc',fld:'FORPRDDSC',pic:''},{av:'A881EscMTxt1',fld:'ESCMTXT1',pic:''},{av:'A882EscMTxt2',fld:'ESCMTXT2',pic:''},{av:'A883EscMInc',fld:'ESCMINC',pic:'Z9.99'},{av:'A884EscMKgm',fld:'ESCMKGM',pic:'ZZZZZZ9.99'},{av:'A885EscMVol',fld:'ESCMVOL',pic:'ZZZZ9'},{av:'A886EscMUltLin',fld:'ESCMULTLIN',pic:'ZZ9'},{av:'A896EscMValCos',fld:'ESCMVALCOS',pic:'ZZZZZZZ9'},{av:'A892EscMCosL',fld:'ESCMCOSL',pic:'ZZZZZZZZ9.99999'},{av:'A893EscMCosT',fld:'ESCMCOST',pic:'ZZZZZZZZ9.99999'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z910Workstat'},{av:'Z887EscMLin'},{av:'Z719PrdNum'},{av:'Z764ProForCod'},{av:'Z897EscMDsc'},{av:'Z889EscMPrdPre'},{av:'Z890EscMCan'},{av:'Z490ForPrdUMe'},{av:'Z891EscMCos'},{av:'Z4707EscMCliCod'},{av:'Z4708EscMArtCod'},{av:'Z4709EscMMdlCod'},{av:'Z4710EscMProCod'},{av:'Z4711EscMFasCod'},{av:'Z4712EscMFacCon'},{av:'Z4713EscMRb'},{av:'Z6060EscSol'},{av:'Z7584EscVolm'},{av:'Z7583EscOrdn'},{av:'Z10363EscMCant'},{av:'Z407EmprNom'},{av:'Z3915EmpNumDec'},{av:'Z718PrdNom'},{av:'Z724PrdPreAct'},{av:'Z766ProForDsc'},{av:'Z488ForPrdDsc'},{av:'Z881EscMTxt1'},{av:'Z882EscMTxt2'},{av:'Z883EscMInc'},{av:'Z884EscMKgm'},{av:'Z885EscMVol'},{av:'Z886EscMUltLin'},{av:'Z896EscMValCos'},{av:'Z892EscMCosL'},{av:'Z893EscMCosT'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'}]}");
      setEventMetadata("VALID_PRDNUM","{handler:'valid_Prdnum',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A718PrdNom',fld:'PRDNOM',pic:''},{av:'A724PrdPreAct',fld:'PRDPREACT',pic:'ZZZZZZZ9.999'}]");
      setEventMetadata("VALID_PRDNUM",",oparms:[{av:'A718PrdNom',fld:'PRDNOM',pic:''},{av:'A724PrdPreAct',fld:'PRDPREACT',pic:'ZZZZZZZ9.999'}]}");
      setEventMetadata("VALID_PROFORCOD","{handler:'valid_Proforcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A764ProForCod',fld:'PROFORCOD',pic:''},{av:'A766ProForDsc',fld:'PROFORDSC',pic:''}]");
      setEventMetadata("VALID_PROFORCOD",",oparms:[{av:'A766ProForDsc',fld:'PROFORDSC',pic:''}]}");
      setEventMetadata("VALID_ESCMPRDPRE","{handler:'valid_Escmprdpre',iparms:[]");
      setEventMetadata("VALID_ESCMPRDPRE",",oparms:[]}");
      setEventMetadata("VALID_ESCMCAN","{handler:'valid_Escmcan',iparms:[]");
      setEventMetadata("VALID_ESCMCAN",",oparms:[]}");
      setEventMetadata("VALID_FORPRDUME","{handler:'valid_Forprdume',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A490ForPrdUMe',fld:'FORPRDUME',pic:'9'},{av:'A889EscMPrdPre',fld:'ESCMPRDPRE',pic:'ZZZZZZZ9.999'},{av:'A890EscMCan',fld:'ESCMCAN',pic:'ZZZZZ9.9999'},{av:'A884EscMKgm',fld:'ESCMKGM',pic:'ZZZZZZ9.99'},{av:'A896EscMValCos',fld:'ESCMVALCOS',pic:'ZZZZZZZ9'},{av:'A3915EmpNumDec',fld:'EMPNUMDEC',pic:'9'},{av:'A885EscMVol',fld:'ESCMVOL',pic:'ZZZZ9'},{av:'A488ForPrdDsc',fld:'FORPRDDSC',pic:''},{av:'A892EscMCosL',fld:'ESCMCOSL',pic:'ZZZZZZZZ9.99999'}]");
      setEventMetadata("VALID_FORPRDUME",",oparms:[{av:'A488ForPrdDsc',fld:'FORPRDDSC',pic:''},{av:'A892EscMCosL',fld:'ESCMCOSL',pic:'ZZZZZZZZ9.99999'}]}");
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
      pr_default.close(24);
      pr_default.close(25);
      pr_default.close(26);
      pr_default.close(22);
      pr_default.close(23);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z910Workstat = "" ;
      Z897EscMDsc = "" ;
      Z889EscMPrdPre = DecimalUtil.ZERO ;
      Z890EscMCan = DecimalUtil.ZERO ;
      Z891EscMCos = DecimalUtil.ZERO ;
      Z4708EscMArtCod = "" ;
      Z4709EscMMdlCod = "" ;
      Z4710EscMProCod = "" ;
      Z4711EscMFasCod = "" ;
      Z4712EscMFacCon = DecimalUtil.ZERO ;
      Z10363EscMCant = DecimalUtil.ZERO ;
      Z719PrdNum = "" ;
      Z764ProForCod = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A719PrdNum = "" ;
      A764ProForCod = "" ;
      A910Workstat = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
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
      A881EscMTxt1 = "" ;
      A882EscMTxt2 = "" ;
      A883EscMInc = DecimalUtil.ZERO ;
      A884EscMKgm = DecimalUtil.ZERO ;
      A893EscMCosT = DecimalUtil.ZERO ;
      A718PrdNom = "" ;
      A724PrdPreAct = DecimalUtil.ZERO ;
      A766ProForDsc = "" ;
      A897EscMDsc = "" ;
      A889EscMPrdPre = DecimalUtil.ZERO ;
      A890EscMCan = DecimalUtil.ZERO ;
      A488ForPrdDsc = "" ;
      A891EscMCos = DecimalUtil.ZERO ;
      A892EscMCosL = DecimalUtil.ZERO ;
      A4708EscMArtCod = "" ;
      A4709EscMMdlCod = "" ;
      A4710EscMProCod = "" ;
      A4711EscMFasCod = "" ;
      A4712EscMFacCon = DecimalUtil.ZERO ;
      A10363EscMCant = DecimalUtil.ZERO ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      Gx_mode = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      Z407EmprNom = "" ;
      Z881EscMTxt1 = "" ;
      Z882EscMTxt2 = "" ;
      Z883EscMInc = DecimalUtil.ZERO ;
      Z884EscMKgm = DecimalUtil.ZERO ;
      Z893EscMCosT = DecimalUtil.ZERO ;
      Z718PrdNom = "" ;
      Z724PrdPreAct = DecimalUtil.ZERO ;
      Z766ProForDsc = "" ;
      Z488ForPrdDsc = "" ;
      T01TJ12_A887EscMLin = new int[1] ;
      T01TJ12_A407EmprNom = new String[] {""} ;
      T01TJ12_n407EmprNom = new boolean[] {false} ;
      T01TJ12_A881EscMTxt1 = new String[] {""} ;
      T01TJ12_n881EscMTxt1 = new boolean[] {false} ;
      T01TJ12_A882EscMTxt2 = new String[] {""} ;
      T01TJ12_n882EscMTxt2 = new boolean[] {false} ;
      T01TJ12_A883EscMInc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TJ12_n883EscMInc = new boolean[] {false} ;
      T01TJ12_A884EscMKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TJ12_n884EscMKgm = new boolean[] {false} ;
      T01TJ12_A885EscMVol = new int[1] ;
      T01TJ12_n885EscMVol = new boolean[] {false} ;
      T01TJ12_A886EscMUltLin = new int[1] ;
      T01TJ12_n886EscMUltLin = new boolean[] {false} ;
      T01TJ12_A896EscMValCos = new int[1] ;
      T01TJ12_n896EscMValCos = new boolean[] {false} ;
      T01TJ12_A3915EmpNumDec = new byte[1] ;
      T01TJ12_n3915EmpNumDec = new boolean[] {false} ;
      T01TJ12_A718PrdNom = new String[] {""} ;
      T01TJ12_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TJ12_A766ProForDsc = new String[] {""} ;
      T01TJ12_A897EscMDsc = new String[] {""} ;
      T01TJ12_A889EscMPrdPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TJ12_A890EscMCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TJ12_A488ForPrdDsc = new String[] {""} ;
      T01TJ12_n488ForPrdDsc = new boolean[] {false} ;
      T01TJ12_A891EscMCos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TJ12_A4707EscMCliCod = new int[1] ;
      T01TJ12_A4708EscMArtCod = new String[] {""} ;
      T01TJ12_A4709EscMMdlCod = new String[] {""} ;
      T01TJ12_A4710EscMProCod = new String[] {""} ;
      T01TJ12_A4711EscMFasCod = new String[] {""} ;
      T01TJ12_A4712EscMFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TJ12_A4713EscMRb = new short[1] ;
      T01TJ12_A6060EscSol = new int[1] ;
      T01TJ12_A7584EscVolm = new int[1] ;
      T01TJ12_A7583EscOrdn = new short[1] ;
      T01TJ12_A10363EscMCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TJ12_A396EmprCod = new String[] {""} ;
      T01TJ12_A719PrdNum = new String[] {""} ;
      T01TJ12_A764ProForCod = new String[] {""} ;
      T01TJ12_A490ForPrdUMe = new byte[1] ;
      T01TJ12_A910Workstat = new String[] {""} ;
      T01TJ12_A893EscMCosT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TJ12_n893EscMCosT = new boolean[] {false} ;
      T01TJ4_A407EmprNom = new String[] {""} ;
      T01TJ4_n407EmprNom = new boolean[] {false} ;
      T01TJ4_A3915EmpNumDec = new byte[1] ;
      T01TJ4_n3915EmpNumDec = new boolean[] {false} ;
      T01TJ5_A718PrdNom = new String[] {""} ;
      T01TJ5_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TJ6_A766ProForDsc = new String[] {""} ;
      T01TJ7_A488ForPrdDsc = new String[] {""} ;
      T01TJ7_n488ForPrdDsc = new boolean[] {false} ;
      T01TJ8_A881EscMTxt1 = new String[] {""} ;
      T01TJ8_n881EscMTxt1 = new boolean[] {false} ;
      T01TJ8_A882EscMTxt2 = new String[] {""} ;
      T01TJ8_n882EscMTxt2 = new boolean[] {false} ;
      T01TJ8_A883EscMInc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TJ8_n883EscMInc = new boolean[] {false} ;
      T01TJ8_A884EscMKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TJ8_n884EscMKgm = new boolean[] {false} ;
      T01TJ8_A885EscMVol = new int[1] ;
      T01TJ8_n885EscMVol = new boolean[] {false} ;
      T01TJ8_A886EscMUltLin = new int[1] ;
      T01TJ8_n886EscMUltLin = new boolean[] {false} ;
      T01TJ8_A896EscMValCos = new int[1] ;
      T01TJ8_n896EscMValCos = new boolean[] {false} ;
      T01TJ10_A893EscMCosT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TJ10_n893EscMCosT = new boolean[] {false} ;
      T01TJ13_A407EmprNom = new String[] {""} ;
      T01TJ13_n407EmprNom = new boolean[] {false} ;
      T01TJ13_A3915EmpNumDec = new byte[1] ;
      T01TJ13_n3915EmpNumDec = new boolean[] {false} ;
      T01TJ14_A718PrdNom = new String[] {""} ;
      T01TJ14_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TJ15_A766ProForDsc = new String[] {""} ;
      T01TJ16_A488ForPrdDsc = new String[] {""} ;
      T01TJ16_n488ForPrdDsc = new boolean[] {false} ;
      T01TJ17_A881EscMTxt1 = new String[] {""} ;
      T01TJ17_n881EscMTxt1 = new boolean[] {false} ;
      T01TJ17_A882EscMTxt2 = new String[] {""} ;
      T01TJ17_n882EscMTxt2 = new boolean[] {false} ;
      T01TJ17_A883EscMInc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TJ17_n883EscMInc = new boolean[] {false} ;
      T01TJ17_A884EscMKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TJ17_n884EscMKgm = new boolean[] {false} ;
      T01TJ17_A885EscMVol = new int[1] ;
      T01TJ17_n885EscMVol = new boolean[] {false} ;
      T01TJ17_A886EscMUltLin = new int[1] ;
      T01TJ17_n886EscMUltLin = new boolean[] {false} ;
      T01TJ17_A896EscMValCos = new int[1] ;
      T01TJ17_n896EscMValCos = new boolean[] {false} ;
      T01TJ19_A893EscMCosT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TJ19_n893EscMCosT = new boolean[] {false} ;
      T01TJ20_A396EmprCod = new String[] {""} ;
      T01TJ20_A910Workstat = new String[] {""} ;
      T01TJ20_A887EscMLin = new int[1] ;
      T01TJ3_A887EscMLin = new int[1] ;
      T01TJ3_A897EscMDsc = new String[] {""} ;
      T01TJ3_A889EscMPrdPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TJ3_A890EscMCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TJ3_A891EscMCos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TJ3_A4707EscMCliCod = new int[1] ;
      T01TJ3_A4708EscMArtCod = new String[] {""} ;
      T01TJ3_A4709EscMMdlCod = new String[] {""} ;
      T01TJ3_A4710EscMProCod = new String[] {""} ;
      T01TJ3_A4711EscMFasCod = new String[] {""} ;
      T01TJ3_A4712EscMFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TJ3_A4713EscMRb = new short[1] ;
      T01TJ3_A6060EscSol = new int[1] ;
      T01TJ3_A7584EscVolm = new int[1] ;
      T01TJ3_A7583EscOrdn = new short[1] ;
      T01TJ3_A10363EscMCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TJ3_A396EmprCod = new String[] {""} ;
      T01TJ3_A719PrdNum = new String[] {""} ;
      T01TJ3_A764ProForCod = new String[] {""} ;
      T01TJ3_A490ForPrdUMe = new byte[1] ;
      T01TJ3_A910Workstat = new String[] {""} ;
      sMode120 = "" ;
      T01TJ21_A396EmprCod = new String[] {""} ;
      T01TJ21_A910Workstat = new String[] {""} ;
      T01TJ21_A887EscMLin = new int[1] ;
      T01TJ22_A396EmprCod = new String[] {""} ;
      T01TJ22_A910Workstat = new String[] {""} ;
      T01TJ22_A887EscMLin = new int[1] ;
      T01TJ2_A887EscMLin = new int[1] ;
      T01TJ2_A897EscMDsc = new String[] {""} ;
      T01TJ2_A889EscMPrdPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TJ2_A890EscMCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TJ2_A891EscMCos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TJ2_A4707EscMCliCod = new int[1] ;
      T01TJ2_A4708EscMArtCod = new String[] {""} ;
      T01TJ2_A4709EscMMdlCod = new String[] {""} ;
      T01TJ2_A4710EscMProCod = new String[] {""} ;
      T01TJ2_A4711EscMFasCod = new String[] {""} ;
      T01TJ2_A4712EscMFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TJ2_A4713EscMRb = new short[1] ;
      T01TJ2_A6060EscSol = new int[1] ;
      T01TJ2_A7584EscVolm = new int[1] ;
      T01TJ2_A7583EscOrdn = new short[1] ;
      T01TJ2_A10363EscMCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TJ2_A396EmprCod = new String[] {""} ;
      T01TJ2_A719PrdNum = new String[] {""} ;
      T01TJ2_A764ProForCod = new String[] {""} ;
      T01TJ2_A490ForPrdUMe = new byte[1] ;
      T01TJ2_A910Workstat = new String[] {""} ;
      T01TJ26_A407EmprNom = new String[] {""} ;
      T01TJ26_n407EmprNom = new boolean[] {false} ;
      T01TJ26_A3915EmpNumDec = new byte[1] ;
      T01TJ26_n3915EmpNumDec = new boolean[] {false} ;
      T01TJ27_A881EscMTxt1 = new String[] {""} ;
      T01TJ27_n881EscMTxt1 = new boolean[] {false} ;
      T01TJ27_A882EscMTxt2 = new String[] {""} ;
      T01TJ27_n882EscMTxt2 = new boolean[] {false} ;
      T01TJ27_A883EscMInc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TJ27_n883EscMInc = new boolean[] {false} ;
      T01TJ27_A884EscMKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TJ27_n884EscMKgm = new boolean[] {false} ;
      T01TJ27_A885EscMVol = new int[1] ;
      T01TJ27_n885EscMVol = new boolean[] {false} ;
      T01TJ27_A886EscMUltLin = new int[1] ;
      T01TJ27_n886EscMUltLin = new boolean[] {false} ;
      T01TJ27_A896EscMValCos = new int[1] ;
      T01TJ27_n896EscMValCos = new boolean[] {false} ;
      T01TJ29_A893EscMCosT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TJ29_n893EscMCosT = new boolean[] {false} ;
      T01TJ30_A718PrdNom = new String[] {""} ;
      T01TJ30_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TJ31_A766ProForDsc = new String[] {""} ;
      T01TJ32_A488ForPrdDsc = new String[] {""} ;
      T01TJ32_n488ForPrdDsc = new boolean[] {false} ;
      T01TJ33_A396EmprCod = new String[] {""} ;
      T01TJ33_A910Workstat = new String[] {""} ;
      T01TJ33_A887EscMLin = new int[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Z892EscMCosL = DecimalUtil.ZERO ;
      ZZ396EmprCod = "" ;
      ZZ910Workstat = "" ;
      ZZ719PrdNum = "" ;
      ZZ764ProForCod = "" ;
      ZZ897EscMDsc = "" ;
      ZZ889EscMPrdPre = DecimalUtil.ZERO ;
      ZZ890EscMCan = DecimalUtil.ZERO ;
      ZZ891EscMCos = DecimalUtil.ZERO ;
      ZZ4708EscMArtCod = "" ;
      ZZ4709EscMMdlCod = "" ;
      ZZ4710EscMProCod = "" ;
      ZZ4711EscMFasCod = "" ;
      ZZ4712EscMFacCon = DecimalUtil.ZERO ;
      ZZ10363EscMCant = DecimalUtil.ZERO ;
      ZZ407EmprNom = "" ;
      ZZ718PrdNom = "" ;
      ZZ724PrdPreAct = DecimalUtil.ZERO ;
      ZZ766ProForDsc = "" ;
      ZZ488ForPrdDsc = "" ;
      ZZ881EscMTxt1 = "" ;
      ZZ882EscMTxt2 = "" ;
      ZZ883EscMInc = DecimalUtil.ZERO ;
      ZZ884EscMKgm = DecimalUtil.ZERO ;
      ZZ892EscMCosL = DecimalUtil.ZERO ;
      ZZ893EscMCosT = DecimalUtil.ZERO ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.simulacionformula_1__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.simulacionformula_1__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.simulacionformula_1__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.simulacionformula_1__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.simulacionformula_1__default(),
         new Object[] {
             new Object[] {
            T01TJ2_A887EscMLin, T01TJ2_A897EscMDsc, T01TJ2_A889EscMPrdPre, T01TJ2_A890EscMCan, T01TJ2_A891EscMCos, T01TJ2_A4707EscMCliCod, T01TJ2_A4708EscMArtCod, T01TJ2_A4709EscMMdlCod, T01TJ2_A4710EscMProCod, T01TJ2_A4711EscMFasCod,
            T01TJ2_A4712EscMFacCon, T01TJ2_A4713EscMRb, T01TJ2_A6060EscSol, T01TJ2_A7584EscVolm, T01TJ2_A7583EscOrdn, T01TJ2_A10363EscMCant, T01TJ2_A396EmprCod, T01TJ2_A719PrdNum, T01TJ2_A764ProForCod, T01TJ2_A490ForPrdUMe,
            T01TJ2_A910Workstat
            }
            , new Object[] {
            T01TJ3_A887EscMLin, T01TJ3_A897EscMDsc, T01TJ3_A889EscMPrdPre, T01TJ3_A890EscMCan, T01TJ3_A891EscMCos, T01TJ3_A4707EscMCliCod, T01TJ3_A4708EscMArtCod, T01TJ3_A4709EscMMdlCod, T01TJ3_A4710EscMProCod, T01TJ3_A4711EscMFasCod,
            T01TJ3_A4712EscMFacCon, T01TJ3_A4713EscMRb, T01TJ3_A6060EscSol, T01TJ3_A7584EscVolm, T01TJ3_A7583EscOrdn, T01TJ3_A10363EscMCant, T01TJ3_A396EmprCod, T01TJ3_A719PrdNum, T01TJ3_A764ProForCod, T01TJ3_A490ForPrdUMe,
            T01TJ3_A910Workstat
            }
            , new Object[] {
            T01TJ4_A407EmprNom, T01TJ4_n407EmprNom, T01TJ4_A3915EmpNumDec, T01TJ4_n3915EmpNumDec
            }
            , new Object[] {
            T01TJ5_A718PrdNom, T01TJ5_A724PrdPreAct
            }
            , new Object[] {
            T01TJ6_A766ProForDsc
            }
            , new Object[] {
            T01TJ7_A488ForPrdDsc, T01TJ7_n488ForPrdDsc
            }
            , new Object[] {
            T01TJ8_A881EscMTxt1, T01TJ8_n881EscMTxt1, T01TJ8_A882EscMTxt2, T01TJ8_n882EscMTxt2, T01TJ8_A883EscMInc, T01TJ8_n883EscMInc, T01TJ8_A884EscMKgm, T01TJ8_n884EscMKgm, T01TJ8_A885EscMVol, T01TJ8_n885EscMVol,
            T01TJ8_A886EscMUltLin, T01TJ8_n886EscMUltLin, T01TJ8_A896EscMValCos, T01TJ8_n896EscMValCos
            }
            , new Object[] {
            T01TJ10_A893EscMCosT, T01TJ10_n893EscMCosT
            }
            , new Object[] {
            T01TJ12_A887EscMLin, T01TJ12_A407EmprNom, T01TJ12_n407EmprNom, T01TJ12_A881EscMTxt1, T01TJ12_n881EscMTxt1, T01TJ12_A882EscMTxt2, T01TJ12_n882EscMTxt2, T01TJ12_A883EscMInc, T01TJ12_n883EscMInc, T01TJ12_A884EscMKgm,
            T01TJ12_n884EscMKgm, T01TJ12_A885EscMVol, T01TJ12_n885EscMVol, T01TJ12_A886EscMUltLin, T01TJ12_n886EscMUltLin, T01TJ12_A896EscMValCos, T01TJ12_n896EscMValCos, T01TJ12_A3915EmpNumDec, T01TJ12_n3915EmpNumDec, T01TJ12_A718PrdNom,
            T01TJ12_A724PrdPreAct, T01TJ12_A766ProForDsc, T01TJ12_A897EscMDsc, T01TJ12_A889EscMPrdPre, T01TJ12_A890EscMCan, T01TJ12_A488ForPrdDsc, T01TJ12_n488ForPrdDsc, T01TJ12_A891EscMCos, T01TJ12_A4707EscMCliCod, T01TJ12_A4708EscMArtCod,
            T01TJ12_A4709EscMMdlCod, T01TJ12_A4710EscMProCod, T01TJ12_A4711EscMFasCod, T01TJ12_A4712EscMFacCon, T01TJ12_A4713EscMRb, T01TJ12_A6060EscSol, T01TJ12_A7584EscVolm, T01TJ12_A7583EscOrdn, T01TJ12_A10363EscMCant, T01TJ12_A396EmprCod,
            T01TJ12_A719PrdNum, T01TJ12_A764ProForCod, T01TJ12_A490ForPrdUMe, T01TJ12_A910Workstat, T01TJ12_A893EscMCosT, T01TJ12_n893EscMCosT
            }
            , new Object[] {
            T01TJ13_A407EmprNom, T01TJ13_n407EmprNom, T01TJ13_A3915EmpNumDec, T01TJ13_n3915EmpNumDec
            }
            , new Object[] {
            T01TJ14_A718PrdNom, T01TJ14_A724PrdPreAct
            }
            , new Object[] {
            T01TJ15_A766ProForDsc
            }
            , new Object[] {
            T01TJ16_A488ForPrdDsc, T01TJ16_n488ForPrdDsc
            }
            , new Object[] {
            T01TJ17_A881EscMTxt1, T01TJ17_n881EscMTxt1, T01TJ17_A882EscMTxt2, T01TJ17_n882EscMTxt2, T01TJ17_A883EscMInc, T01TJ17_n883EscMInc, T01TJ17_A884EscMKgm, T01TJ17_n884EscMKgm, T01TJ17_A885EscMVol, T01TJ17_n885EscMVol,
            T01TJ17_A886EscMUltLin, T01TJ17_n886EscMUltLin, T01TJ17_A896EscMValCos, T01TJ17_n896EscMValCos
            }
            , new Object[] {
            T01TJ19_A893EscMCosT, T01TJ19_n893EscMCosT
            }
            , new Object[] {
            T01TJ20_A396EmprCod, T01TJ20_A910Workstat, T01TJ20_A887EscMLin
            }
            , new Object[] {
            T01TJ21_A396EmprCod, T01TJ21_A910Workstat, T01TJ21_A887EscMLin
            }
            , new Object[] {
            T01TJ22_A396EmprCod, T01TJ22_A910Workstat, T01TJ22_A887EscMLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01TJ26_A407EmprNom, T01TJ26_n407EmprNom, T01TJ26_A3915EmpNumDec, T01TJ26_n3915EmpNumDec
            }
            , new Object[] {
            T01TJ27_A881EscMTxt1, T01TJ27_n881EscMTxt1, T01TJ27_A882EscMTxt2, T01TJ27_n882EscMTxt2, T01TJ27_A883EscMInc, T01TJ27_n883EscMInc, T01TJ27_A884EscMKgm, T01TJ27_n884EscMKgm, T01TJ27_A885EscMVol, T01TJ27_n885EscMVol,
            T01TJ27_A886EscMUltLin, T01TJ27_n886EscMUltLin, T01TJ27_A896EscMValCos, T01TJ27_n896EscMValCos
            }
            , new Object[] {
            T01TJ29_A893EscMCosT, T01TJ29_n893EscMCosT
            }
            , new Object[] {
            T01TJ30_A718PrdNom, T01TJ30_A724PrdPreAct
            }
            , new Object[] {
            T01TJ31_A766ProForDsc
            }
            , new Object[] {
            T01TJ32_A488ForPrdDsc, T01TJ32_n488ForPrdDsc
            }
            , new Object[] {
            T01TJ33_A396EmprCod, T01TJ33_A910Workstat, T01TJ33_A887EscMLin
            }
         }
      );
   }

   private byte Z490ForPrdUMe ;
   private byte GxWebError ;
   private byte A490ForPrdUMe ;
   private byte nKeyPressed ;
   private byte A3915EmpNumDec ;
   private byte Z3915EmpNumDec ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private byte ZZ490ForPrdUMe ;
   private byte ZZ3915EmpNumDec ;
   private short Z4713EscMRb ;
   private short Z7583EscOrdn ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A4713EscMRb ;
   private short A7583EscOrdn ;
   private short RcdFound120 ;
   private short nIsDirty_120 ;
   private short ZZ4713EscMRb ;
   private short ZZ7583EscOrdn ;
   private int Z887EscMLin ;
   private int Z4707EscMCliCod ;
   private int Z6060EscSol ;
   private int Z7584EscVolm ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtWorkstat_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtEscMTxt1_Enabled ;
   private int edtEscMTxt2_Enabled ;
   private int edtEscMInc_Enabled ;
   private int edtEscMKgm_Enabled ;
   private int A885EscMVol ;
   private int edtEscMVol_Enabled ;
   private int A886EscMUltLin ;
   private int edtEscMUltLin_Enabled ;
   private int A896EscMValCos ;
   private int edtEscMValCos_Enabled ;
   private int edtEmpNumDec_Enabled ;
   private int edtEscMCosT_Enabled ;
   private int A887EscMLin ;
   private int edtEscMLin_Enabled ;
   private int edtPrdNum_Enabled ;
   private int edtPrdNom_Enabled ;
   private int edtPrdPreAct_Enabled ;
   private int edtProForCod_Enabled ;
   private int edtProForDsc_Enabled ;
   private int edtEscMDsc_Enabled ;
   private int edtEscMPrdPre_Enabled ;
   private int edtEscMCan_Enabled ;
   private int edtForPrdUMe_Enabled ;
   private int edtForPrdDsc_Enabled ;
   private int edtEscMCos_Enabled ;
   private int edtEscMCosL_Enabled ;
   private int A4707EscMCliCod ;
   private int edtEscMCliCod_Enabled ;
   private int edtEscMArtCod_Enabled ;
   private int edtEscMMdlCod_Enabled ;
   private int edtEscMProCod_Enabled ;
   private int edtEscMFasCod_Enabled ;
   private int edtEscMFacCon_Enabled ;
   private int edtEscMRb_Enabled ;
   private int A6060EscSol ;
   private int edtEscSol_Enabled ;
   private int A7584EscVolm ;
   private int edtEscVolm_Enabled ;
   private int edtEscOrdn_Enabled ;
   private int edtEscMCant_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int GX_JID ;
   private int Z885EscMVol ;
   private int Z886EscMUltLin ;
   private int Z896EscMValCos ;
   private int idxLst ;
   private int ZZ887EscMLin ;
   private int ZZ4707EscMCliCod ;
   private int ZZ6060EscSol ;
   private int ZZ7584EscVolm ;
   private int ZZ885EscMVol ;
   private int ZZ886EscMUltLin ;
   private int ZZ896EscMValCos ;
   private java.math.BigDecimal Z889EscMPrdPre ;
   private java.math.BigDecimal Z890EscMCan ;
   private java.math.BigDecimal Z891EscMCos ;
   private java.math.BigDecimal Z4712EscMFacCon ;
   private java.math.BigDecimal Z10363EscMCant ;
   private java.math.BigDecimal A883EscMInc ;
   private java.math.BigDecimal A884EscMKgm ;
   private java.math.BigDecimal A893EscMCosT ;
   private java.math.BigDecimal A724PrdPreAct ;
   private java.math.BigDecimal A889EscMPrdPre ;
   private java.math.BigDecimal A890EscMCan ;
   private java.math.BigDecimal A891EscMCos ;
   private java.math.BigDecimal A892EscMCosL ;
   private java.math.BigDecimal A4712EscMFacCon ;
   private java.math.BigDecimal A10363EscMCant ;
   private java.math.BigDecimal Z883EscMInc ;
   private java.math.BigDecimal Z884EscMKgm ;
   private java.math.BigDecimal Z893EscMCosT ;
   private java.math.BigDecimal Z724PrdPreAct ;
   private java.math.BigDecimal Z892EscMCosL ;
   private java.math.BigDecimal ZZ889EscMPrdPre ;
   private java.math.BigDecimal ZZ890EscMCan ;
   private java.math.BigDecimal ZZ891EscMCos ;
   private java.math.BigDecimal ZZ4712EscMFacCon ;
   private java.math.BigDecimal ZZ10363EscMCant ;
   private java.math.BigDecimal ZZ724PrdPreAct ;
   private java.math.BigDecimal ZZ883EscMInc ;
   private java.math.BigDecimal ZZ884EscMKgm ;
   private java.math.BigDecimal ZZ892EscMCosL ;
   private java.math.BigDecimal ZZ893EscMCosT ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z910Workstat ;
   private String Z897EscMDsc ;
   private String Z4708EscMArtCod ;
   private String Z4709EscMMdlCod ;
   private String Z4710EscMProCod ;
   private String Z4711EscMFasCod ;
   private String Z719PrdNum ;
   private String Z764ProForCod ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private String A764ProForCod ;
   private String A910Workstat ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtEmprCod_Internalname ;
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
   private String edtWorkstat_Internalname ;
   private String edtWorkstat_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String edtEscMTxt1_Internalname ;
   private String A881EscMTxt1 ;
   private String edtEscMTxt1_Jsonclick ;
   private String edtEscMTxt2_Internalname ;
   private String A882EscMTxt2 ;
   private String edtEscMTxt2_Jsonclick ;
   private String edtEscMInc_Internalname ;
   private String edtEscMInc_Jsonclick ;
   private String edtEscMKgm_Internalname ;
   private String edtEscMKgm_Jsonclick ;
   private String edtEscMVol_Internalname ;
   private String edtEscMVol_Jsonclick ;
   private String edtEscMUltLin_Internalname ;
   private String edtEscMUltLin_Jsonclick ;
   private String edtEscMValCos_Internalname ;
   private String edtEscMValCos_Jsonclick ;
   private String edtEmpNumDec_Internalname ;
   private String edtEmpNumDec_Jsonclick ;
   private String edtEscMCosT_Internalname ;
   private String edtEscMCosT_Jsonclick ;
   private String edtEscMLin_Internalname ;
   private String edtEscMLin_Jsonclick ;
   private String edtPrdNum_Internalname ;
   private String edtPrdNum_Jsonclick ;
   private String edtPrdNom_Internalname ;
   private String A718PrdNom ;
   private String edtPrdNom_Jsonclick ;
   private String edtPrdPreAct_Internalname ;
   private String edtPrdPreAct_Jsonclick ;
   private String edtProForCod_Internalname ;
   private String edtProForCod_Jsonclick ;
   private String edtProForDsc_Internalname ;
   private String A766ProForDsc ;
   private String edtProForDsc_Jsonclick ;
   private String edtEscMDsc_Internalname ;
   private String A897EscMDsc ;
   private String edtEscMDsc_Jsonclick ;
   private String edtEscMPrdPre_Internalname ;
   private String edtEscMPrdPre_Jsonclick ;
   private String edtEscMCan_Internalname ;
   private String edtEscMCan_Jsonclick ;
   private String edtForPrdUMe_Internalname ;
   private String edtForPrdUMe_Jsonclick ;
   private String edtForPrdDsc_Internalname ;
   private String A488ForPrdDsc ;
   private String edtForPrdDsc_Jsonclick ;
   private String edtEscMCos_Internalname ;
   private String edtEscMCos_Jsonclick ;
   private String edtEscMCosL_Internalname ;
   private String edtEscMCosL_Jsonclick ;
   private String edtEscMCliCod_Internalname ;
   private String edtEscMCliCod_Jsonclick ;
   private String edtEscMArtCod_Internalname ;
   private String A4708EscMArtCod ;
   private String edtEscMArtCod_Jsonclick ;
   private String edtEscMMdlCod_Internalname ;
   private String A4709EscMMdlCod ;
   private String edtEscMMdlCod_Jsonclick ;
   private String edtEscMProCod_Internalname ;
   private String A4710EscMProCod ;
   private String edtEscMProCod_Jsonclick ;
   private String edtEscMFasCod_Internalname ;
   private String A4711EscMFasCod ;
   private String edtEscMFasCod_Jsonclick ;
   private String edtEscMFacCon_Internalname ;
   private String edtEscMFacCon_Jsonclick ;
   private String edtEscMRb_Internalname ;
   private String edtEscMRb_Jsonclick ;
   private String edtEscSol_Internalname ;
   private String edtEscSol_Jsonclick ;
   private String edtEscVolm_Internalname ;
   private String edtEscVolm_Jsonclick ;
   private String edtEscOrdn_Internalname ;
   private String edtEscOrdn_Jsonclick ;
   private String edtEscMCant_Internalname ;
   private String edtEscMCant_Jsonclick ;
   private String bttBtn_enter_Internalname ;
   private String bttBtn_enter_Jsonclick ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String bttBtn_delete_Internalname ;
   private String bttBtn_delete_Jsonclick ;
   private String Gx_mode ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String Z407EmprNom ;
   private String Z881EscMTxt1 ;
   private String Z882EscMTxt2 ;
   private String Z718PrdNom ;
   private String Z766ProForDsc ;
   private String Z488ForPrdDsc ;
   private String sMode120 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String ZZ396EmprCod ;
   private String ZZ910Workstat ;
   private String ZZ719PrdNum ;
   private String ZZ764ProForCod ;
   private String ZZ897EscMDsc ;
   private String ZZ4708EscMArtCod ;
   private String ZZ4709EscMMdlCod ;
   private String ZZ4710EscMProCod ;
   private String ZZ4711EscMFasCod ;
   private String ZZ407EmprNom ;
   private String ZZ718PrdNom ;
   private String ZZ766ProForDsc ;
   private String ZZ488ForPrdDsc ;
   private String ZZ881EscMTxt1 ;
   private String ZZ882EscMTxt2 ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n407EmprNom ;
   private boolean n881EscMTxt1 ;
   private boolean n882EscMTxt2 ;
   private boolean n883EscMInc ;
   private boolean n884EscMKgm ;
   private boolean n885EscMVol ;
   private boolean n886EscMUltLin ;
   private boolean n896EscMValCos ;
   private boolean n3915EmpNumDec ;
   private boolean n893EscMCosT ;
   private boolean n488ForPrdDsc ;
   private boolean Gx_longc ;
   private IDataStoreProvider pr_default ;
   private int[] T01TJ12_A887EscMLin ;
   private String[] T01TJ12_A407EmprNom ;
   private boolean[] T01TJ12_n407EmprNom ;
   private String[] T01TJ12_A881EscMTxt1 ;
   private boolean[] T01TJ12_n881EscMTxt1 ;
   private String[] T01TJ12_A882EscMTxt2 ;
   private boolean[] T01TJ12_n882EscMTxt2 ;
   private java.math.BigDecimal[] T01TJ12_A883EscMInc ;
   private boolean[] T01TJ12_n883EscMInc ;
   private java.math.BigDecimal[] T01TJ12_A884EscMKgm ;
   private boolean[] T01TJ12_n884EscMKgm ;
   private int[] T01TJ12_A885EscMVol ;
   private boolean[] T01TJ12_n885EscMVol ;
   private int[] T01TJ12_A886EscMUltLin ;
   private boolean[] T01TJ12_n886EscMUltLin ;
   private int[] T01TJ12_A896EscMValCos ;
   private boolean[] T01TJ12_n896EscMValCos ;
   private byte[] T01TJ12_A3915EmpNumDec ;
   private boolean[] T01TJ12_n3915EmpNumDec ;
   private String[] T01TJ12_A718PrdNom ;
   private java.math.BigDecimal[] T01TJ12_A724PrdPreAct ;
   private String[] T01TJ12_A766ProForDsc ;
   private String[] T01TJ12_A897EscMDsc ;
   private java.math.BigDecimal[] T01TJ12_A889EscMPrdPre ;
   private java.math.BigDecimal[] T01TJ12_A890EscMCan ;
   private String[] T01TJ12_A488ForPrdDsc ;
   private boolean[] T01TJ12_n488ForPrdDsc ;
   private java.math.BigDecimal[] T01TJ12_A891EscMCos ;
   private int[] T01TJ12_A4707EscMCliCod ;
   private String[] T01TJ12_A4708EscMArtCod ;
   private String[] T01TJ12_A4709EscMMdlCod ;
   private String[] T01TJ12_A4710EscMProCod ;
   private String[] T01TJ12_A4711EscMFasCod ;
   private java.math.BigDecimal[] T01TJ12_A4712EscMFacCon ;
   private short[] T01TJ12_A4713EscMRb ;
   private int[] T01TJ12_A6060EscSol ;
   private int[] T01TJ12_A7584EscVolm ;
   private short[] T01TJ12_A7583EscOrdn ;
   private java.math.BigDecimal[] T01TJ12_A10363EscMCant ;
   private String[] T01TJ12_A396EmprCod ;
   private String[] T01TJ12_A719PrdNum ;
   private String[] T01TJ12_A764ProForCod ;
   private byte[] T01TJ12_A490ForPrdUMe ;
   private String[] T01TJ12_A910Workstat ;
   private java.math.BigDecimal[] T01TJ12_A893EscMCosT ;
   private boolean[] T01TJ12_n893EscMCosT ;
   private String[] T01TJ4_A407EmprNom ;
   private boolean[] T01TJ4_n407EmprNom ;
   private byte[] T01TJ4_A3915EmpNumDec ;
   private boolean[] T01TJ4_n3915EmpNumDec ;
   private String[] T01TJ5_A718PrdNom ;
   private java.math.BigDecimal[] T01TJ5_A724PrdPreAct ;
   private String[] T01TJ6_A766ProForDsc ;
   private String[] T01TJ7_A488ForPrdDsc ;
   private boolean[] T01TJ7_n488ForPrdDsc ;
   private String[] T01TJ8_A881EscMTxt1 ;
   private boolean[] T01TJ8_n881EscMTxt1 ;
   private String[] T01TJ8_A882EscMTxt2 ;
   private boolean[] T01TJ8_n882EscMTxt2 ;
   private java.math.BigDecimal[] T01TJ8_A883EscMInc ;
   private boolean[] T01TJ8_n883EscMInc ;
   private java.math.BigDecimal[] T01TJ8_A884EscMKgm ;
   private boolean[] T01TJ8_n884EscMKgm ;
   private int[] T01TJ8_A885EscMVol ;
   private boolean[] T01TJ8_n885EscMVol ;
   private int[] T01TJ8_A886EscMUltLin ;
   private boolean[] T01TJ8_n886EscMUltLin ;
   private int[] T01TJ8_A896EscMValCos ;
   private boolean[] T01TJ8_n896EscMValCos ;
   private java.math.BigDecimal[] T01TJ10_A893EscMCosT ;
   private boolean[] T01TJ10_n893EscMCosT ;
   private String[] T01TJ13_A407EmprNom ;
   private boolean[] T01TJ13_n407EmprNom ;
   private byte[] T01TJ13_A3915EmpNumDec ;
   private boolean[] T01TJ13_n3915EmpNumDec ;
   private String[] T01TJ14_A718PrdNom ;
   private java.math.BigDecimal[] T01TJ14_A724PrdPreAct ;
   private String[] T01TJ15_A766ProForDsc ;
   private String[] T01TJ16_A488ForPrdDsc ;
   private boolean[] T01TJ16_n488ForPrdDsc ;
   private String[] T01TJ17_A881EscMTxt1 ;
   private boolean[] T01TJ17_n881EscMTxt1 ;
   private String[] T01TJ17_A882EscMTxt2 ;
   private boolean[] T01TJ17_n882EscMTxt2 ;
   private java.math.BigDecimal[] T01TJ17_A883EscMInc ;
   private boolean[] T01TJ17_n883EscMInc ;
   private java.math.BigDecimal[] T01TJ17_A884EscMKgm ;
   private boolean[] T01TJ17_n884EscMKgm ;
   private int[] T01TJ17_A885EscMVol ;
   private boolean[] T01TJ17_n885EscMVol ;
   private int[] T01TJ17_A886EscMUltLin ;
   private boolean[] T01TJ17_n886EscMUltLin ;
   private int[] T01TJ17_A896EscMValCos ;
   private boolean[] T01TJ17_n896EscMValCos ;
   private java.math.BigDecimal[] T01TJ19_A893EscMCosT ;
   private boolean[] T01TJ19_n893EscMCosT ;
   private String[] T01TJ20_A396EmprCod ;
   private String[] T01TJ20_A910Workstat ;
   private int[] T01TJ20_A887EscMLin ;
   private int[] T01TJ3_A887EscMLin ;
   private String[] T01TJ3_A897EscMDsc ;
   private java.math.BigDecimal[] T01TJ3_A889EscMPrdPre ;
   private java.math.BigDecimal[] T01TJ3_A890EscMCan ;
   private java.math.BigDecimal[] T01TJ3_A891EscMCos ;
   private int[] T01TJ3_A4707EscMCliCod ;
   private String[] T01TJ3_A4708EscMArtCod ;
   private String[] T01TJ3_A4709EscMMdlCod ;
   private String[] T01TJ3_A4710EscMProCod ;
   private String[] T01TJ3_A4711EscMFasCod ;
   private java.math.BigDecimal[] T01TJ3_A4712EscMFacCon ;
   private short[] T01TJ3_A4713EscMRb ;
   private int[] T01TJ3_A6060EscSol ;
   private int[] T01TJ3_A7584EscVolm ;
   private short[] T01TJ3_A7583EscOrdn ;
   private java.math.BigDecimal[] T01TJ3_A10363EscMCant ;
   private String[] T01TJ3_A396EmprCod ;
   private String[] T01TJ3_A719PrdNum ;
   private String[] T01TJ3_A764ProForCod ;
   private byte[] T01TJ3_A490ForPrdUMe ;
   private String[] T01TJ3_A910Workstat ;
   private String[] T01TJ21_A396EmprCod ;
   private String[] T01TJ21_A910Workstat ;
   private int[] T01TJ21_A887EscMLin ;
   private String[] T01TJ22_A396EmprCod ;
   private String[] T01TJ22_A910Workstat ;
   private int[] T01TJ22_A887EscMLin ;
   private int[] T01TJ2_A887EscMLin ;
   private String[] T01TJ2_A897EscMDsc ;
   private java.math.BigDecimal[] T01TJ2_A889EscMPrdPre ;
   private java.math.BigDecimal[] T01TJ2_A890EscMCan ;
   private java.math.BigDecimal[] T01TJ2_A891EscMCos ;
   private int[] T01TJ2_A4707EscMCliCod ;
   private String[] T01TJ2_A4708EscMArtCod ;
   private String[] T01TJ2_A4709EscMMdlCod ;
   private String[] T01TJ2_A4710EscMProCod ;
   private String[] T01TJ2_A4711EscMFasCod ;
   private java.math.BigDecimal[] T01TJ2_A4712EscMFacCon ;
   private short[] T01TJ2_A4713EscMRb ;
   private int[] T01TJ2_A6060EscSol ;
   private int[] T01TJ2_A7584EscVolm ;
   private short[] T01TJ2_A7583EscOrdn ;
   private java.math.BigDecimal[] T01TJ2_A10363EscMCant ;
   private String[] T01TJ2_A396EmprCod ;
   private String[] T01TJ2_A719PrdNum ;
   private String[] T01TJ2_A764ProForCod ;
   private byte[] T01TJ2_A490ForPrdUMe ;
   private String[] T01TJ2_A910Workstat ;
   private String[] T01TJ26_A407EmprNom ;
   private boolean[] T01TJ26_n407EmprNom ;
   private byte[] T01TJ26_A3915EmpNumDec ;
   private boolean[] T01TJ26_n3915EmpNumDec ;
   private String[] T01TJ27_A881EscMTxt1 ;
   private boolean[] T01TJ27_n881EscMTxt1 ;
   private String[] T01TJ27_A882EscMTxt2 ;
   private boolean[] T01TJ27_n882EscMTxt2 ;
   private java.math.BigDecimal[] T01TJ27_A883EscMInc ;
   private boolean[] T01TJ27_n883EscMInc ;
   private java.math.BigDecimal[] T01TJ27_A884EscMKgm ;
   private boolean[] T01TJ27_n884EscMKgm ;
   private int[] T01TJ27_A885EscMVol ;
   private boolean[] T01TJ27_n885EscMVol ;
   private int[] T01TJ27_A886EscMUltLin ;
   private boolean[] T01TJ27_n886EscMUltLin ;
   private int[] T01TJ27_A896EscMValCos ;
   private boolean[] T01TJ27_n896EscMValCos ;
   private java.math.BigDecimal[] T01TJ29_A893EscMCosT ;
   private boolean[] T01TJ29_n893EscMCosT ;
   private String[] T01TJ30_A718PrdNom ;
   private java.math.BigDecimal[] T01TJ30_A724PrdPreAct ;
   private String[] T01TJ31_A766ProForDsc ;
   private String[] T01TJ32_A488ForPrdDsc ;
   private boolean[] T01TJ32_n488ForPrdDsc ;
   private String[] T01TJ33_A396EmprCod ;
   private String[] T01TJ33_A910Workstat ;
   private int[] T01TJ33_A887EscMLin ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class simulacionformula_1__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class simulacionformula_1__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class simulacionformula_1__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class simulacionformula_1__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class simulacionformula_1__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01TJ2", "SELECT EscMLin, EscMDsc, EscMPrdPre, EscMCan, EscMCos, EscMCliCod, EscMArtCod, EscMMdlCod, EscMProCod, EscMFasCod, EscMFacCon, EscMRb, EscSol, EscVolm, EscOrdn, EscMCant, EmprCod, PrdNum, ProForCod, ForPrdUMe, Workstat FROM TXPESCMAN WHERE EmprCod = ? AND Workstat = ? AND EscMLin = ?  FOR UPDATE OF EscMDsc, EscMPrdPre, EscMCan, EscMCos, EscMCliCod, EscMArtCod, EscMMdlCod, EscMProCod, EscMFasCod, EscMFacCon, EscMRb, EscSol, EscVolm, EscOrdn, EscMCant, PrdNum, ProForCod, ForPrdUMe NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TJ3", "SELECT EscMLin, EscMDsc, EscMPrdPre, EscMCan, EscMCos, EscMCliCod, EscMArtCod, EscMMdlCod, EscMProCod, EscMFasCod, EscMFacCon, EscMRb, EscSol, EscVolm, EscOrdn, EscMCant, EmprCod, PrdNum, ProForCod, ForPrdUMe, Workstat FROM TXPESCMAN WHERE EmprCod = ? AND Workstat = ? AND EscMLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TJ4", "SELECT EmprNom, EmpNumDec FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TJ5", "SELECT PrdNom, PrdPreAct FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TJ6", "SELECT ProForDsc FROM TXPCPROFO WHERE EmprCod = ? AND ProForCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TJ7", "SELECT ForPrdDsc FROM TXPUNMEPR WHERE EmprCod = ? AND ForPrdUMe = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TJ8", "SELECT EscMTxt1, EscMTxt2, EscMInc, EscMKgm, EscMVol, EscMUltLin, EscMValCos FROM TXPCESCAN WHERE EmprCod = ? AND Workstat = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TJ10", "SELECT COALESCE( T1.EscMCosT, 0) AS EscMCosT FROM (SELECT SUM(EscMCos) AS EscMCosT, EmprCod, Workstat FROM TXPESCMAN GROUP BY EmprCod, Workstat ) T1 WHERE T1.EmprCod = ? AND T1.Workstat = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TJ12", "SELECT /*+ FIRST_ROWS(100) */ TM1.EscMLin, T2.EmprNom, T3.EscMTxt1, T3.EscMTxt2, T3.EscMInc, T3.EscMKgm, T3.EscMVol, T3.EscMUltLin, T3.EscMValCos, T2.EmpNumDec, T5.PrdNom, T5.PrdPreAct, T6.ProForDsc, TM1.EscMDsc, TM1.EscMPrdPre, TM1.EscMCan, T7.ForPrdDsc, TM1.EscMCos, TM1.EscMCliCod, TM1.EscMArtCod, TM1.EscMMdlCod, TM1.EscMProCod, TM1.EscMFasCod, TM1.EscMFacCon, TM1.EscMRb, TM1.EscSol, TM1.EscVolm, TM1.EscOrdn, TM1.EscMCant, TM1.EmprCod, TM1.PrdNum, TM1.ProForCod, TM1.ForPrdUMe, TM1.Workstat, COALESCE( T4.EscMCosT, 0) AS EscMCosT FROM ((((((TXPESCMAN TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPCESCAN T3 ON T3.EmprCod = TM1.EmprCod AND T3.Workstat = TM1.Workstat) LEFT JOIN (SELECT SUM(TM1.EscMCos) AS EscMCosT, TM1.EmprCod, TM1.Workstat FROM TXPESCMAN TM1 GROUP BY TM1.EmprCod, TM1.Workstat ) T4 ON T4.EmprCod = TM1.EmprCod AND T4.Workstat = TM1.Workstat) INNER JOIN TXPPRODUC T5 ON T5.EmprCod = TM1.EmprCod AND T5.PrdNum = TM1.PrdNum) INNER JOIN TXPCPROFO T6 ON T6.EmprCod = TM1.EmprCod AND T6.ProForCod = TM1.ProForCod) INNER JOIN TXPUNMEPR T7 ON T7.EmprCod = TM1.EmprCod AND T7.ForPrdUMe = TM1.ForPrdUMe) WHERE TM1.EmprCod = ? and TM1.Workstat = ? and TM1.EscMLin = ? ORDER BY TM1.EmprCod, TM1.Workstat, TM1.EscMLin ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TJ13", "SELECT EmprNom, EmpNumDec FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TJ14", "SELECT PrdNom, PrdPreAct FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TJ15", "SELECT ProForDsc FROM TXPCPROFO WHERE EmprCod = ? AND ProForCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TJ16", "SELECT ForPrdDsc FROM TXPUNMEPR WHERE EmprCod = ? AND ForPrdUMe = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TJ17", "SELECT EscMTxt1, EscMTxt2, EscMInc, EscMKgm, EscMVol, EscMUltLin, EscMValCos FROM TXPCESCAN WHERE EmprCod = ? AND Workstat = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TJ19", "SELECT COALESCE( T1.EscMCosT, 0) AS EscMCosT FROM (SELECT SUM(EscMCos) AS EscMCosT, EmprCod, Workstat FROM TXPESCMAN GROUP BY EmprCod, Workstat ) T1 WHERE T1.EmprCod = ? AND T1.Workstat = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TJ20", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, Workstat, EscMLin FROM TXPESCMAN WHERE EmprCod = ? AND Workstat = ? AND EscMLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TJ21", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, Workstat, EscMLin FROM TXPESCMAN WHERE ( EmprCod > ? or EmprCod = ? and Workstat > ? or Workstat = ? and EmprCod = ? and EscMLin > ?) ORDER BY EmprCod, Workstat, EscMLin) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01TJ22", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, Workstat, EscMLin FROM TXPESCMAN WHERE ( EmprCod < ? or EmprCod = ? and Workstat < ? or Workstat = ? and EmprCod = ? and EscMLin < ?) ORDER BY EmprCod DESC, Workstat DESC, EscMLin DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01TJ23", "INSERT INTO TXPESCMAN(EscMLin, EscMDsc, EscMPrdPre, EscMCan, EscMCos, EscMCliCod, EscMArtCod, EscMMdlCod, EscMProCod, EscMFasCod, EscMFacCon, EscMRb, EscSol, EscVolm, EscOrdn, EscMCant, EmprCod, PrdNum, ProForCod, ForPrdUMe, Workstat) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPESCMAN")
         ,new UpdateCursor("T01TJ24", "UPDATE TXPESCMAN SET EscMDsc=?, EscMPrdPre=?, EscMCan=?, EscMCos=?, EscMCliCod=?, EscMArtCod=?, EscMMdlCod=?, EscMProCod=?, EscMFasCod=?, EscMFacCon=?, EscMRb=?, EscSol=?, EscVolm=?, EscOrdn=?, EscMCant=?, PrdNum=?, ProForCod=?, ForPrdUMe=?  WHERE EmprCod = ? AND Workstat = ? AND EscMLin = ?", GX_NOMASK, "TXPESCMAN")
         ,new UpdateCursor("T01TJ25", "DELETE FROM TXPESCMAN  WHERE EmprCod = ? AND Workstat = ? AND EscMLin = ?", GX_NOMASK, "TXPESCMAN")
         ,new ForEachCursor("T01TJ26", "SELECT EmprNom, EmpNumDec FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TJ27", "SELECT EscMTxt1, EscMTxt2, EscMInc, EscMKgm, EscMVol, EscMUltLin, EscMValCos FROM TXPCESCAN WHERE EmprCod = ? AND Workstat = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TJ29", "SELECT COALESCE( T1.EscMCosT, 0) AS EscMCosT FROM (SELECT SUM(EscMCos) AS EscMCosT, EmprCod, Workstat FROM TXPESCMAN GROUP BY EmprCod, Workstat ) T1 WHERE T1.EmprCod = ? AND T1.Workstat = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TJ30", "SELECT PrdNom, PrdPreAct FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TJ31", "SELECT ProForDsc FROM TXPCPROFO WHERE EmprCod = ? AND ProForCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TJ32", "SELECT ForPrdDsc FROM TXPUNMEPR WHERE EmprCod = ? AND ForPrdUMe = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TJ33", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, Workstat, EscMLin FROM TXPESCMAN ORDER BY EmprCod, Workstat, EscMLin ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 26);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 16);
               ((String[]) buf[7])[0] = rslt.getString(8, 13);
               ((String[]) buf[8])[0] = rslt.getString(9, 8);
               ((String[]) buf[9])[0] = rslt.getString(10, 8);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,5);
               ((short[]) buf[11])[0] = rslt.getShort(12);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((int[]) buf[13])[0] = rslt.getInt(14);
               ((short[]) buf[14])[0] = rslt.getShort(15);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(16,3);
               ((String[]) buf[16])[0] = rslt.getString(17, 3);
               ((String[]) buf[17])[0] = rslt.getString(18, 6);
               ((String[]) buf[18])[0] = rslt.getString(19, 6);
               ((byte[]) buf[19])[0] = rslt.getByte(20);
               ((String[]) buf[20])[0] = rslt.getString(21, 10);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 26);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 16);
               ((String[]) buf[7])[0] = rslt.getString(8, 13);
               ((String[]) buf[8])[0] = rslt.getString(9, 8);
               ((String[]) buf[9])[0] = rslt.getString(10, 8);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,5);
               ((short[]) buf[11])[0] = rslt.getShort(12);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((int[]) buf[13])[0] = rslt.getInt(14);
               ((short[]) buf[14])[0] = rslt.getShort(15);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(16,3);
               ((String[]) buf[16])[0] = rslt.getString(17, 3);
               ((String[]) buf[17])[0] = rslt.getString(18, 6);
               ((String[]) buf[18])[0] = rslt.getString(19, 6);
               ((byte[]) buf[19])[0] = rslt.getByte(20);
               ((String[]) buf[20])[0] = rslt.getString(21, 10);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((byte[]) buf[2])[0] = rslt.getByte(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,5);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 5);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 60);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 60);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(5);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(6);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((int[]) buf[12])[0] = rslt.getInt(7);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               return;
            case 7 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,5);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 8 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 60);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 60);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((int[]) buf[13])[0] = rslt.getInt(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((int[]) buf[15])[0] = rslt.getInt(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((byte[]) buf[17])[0] = rslt.getByte(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 26);
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(12,5);
               ((String[]) buf[21])[0] = rslt.getString(13, 30);
               ((String[]) buf[22])[0] = rslt.getString(14, 26);
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(15,5);
               ((java.math.BigDecimal[]) buf[24])[0] = rslt.getBigDecimal(16,4);
               ((String[]) buf[25])[0] = rslt.getString(17, 5);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[27])[0] = rslt.getBigDecimal(18,5);
               ((int[]) buf[28])[0] = rslt.getInt(19);
               ((String[]) buf[29])[0] = rslt.getString(20, 16);
               ((String[]) buf[30])[0] = rslt.getString(21, 13);
               ((String[]) buf[31])[0] = rslt.getString(22, 8);
               ((String[]) buf[32])[0] = rslt.getString(23, 8);
               ((java.math.BigDecimal[]) buf[33])[0] = rslt.getBigDecimal(24,5);
               ((short[]) buf[34])[0] = rslt.getShort(25);
               ((int[]) buf[35])[0] = rslt.getInt(26);
               ((int[]) buf[36])[0] = rslt.getInt(27);
               ((short[]) buf[37])[0] = rslt.getShort(28);
               ((java.math.BigDecimal[]) buf[38])[0] = rslt.getBigDecimal(29,3);
               ((String[]) buf[39])[0] = rslt.getString(30, 3);
               ((String[]) buf[40])[0] = rslt.getString(31, 6);
               ((String[]) buf[41])[0] = rslt.getString(32, 6);
               ((byte[]) buf[42])[0] = rslt.getByte(33);
               ((String[]) buf[43])[0] = rslt.getString(34, 10);
               ((java.math.BigDecimal[]) buf[44])[0] = rslt.getBigDecimal(35,5);
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((byte[]) buf[2])[0] = rslt.getByte(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,5);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 5);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 60);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 60);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(5);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(6);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((int[]) buf[12])[0] = rslt.getInt(7);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               return;
            case 14 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,5);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((byte[]) buf[2])[0] = rslt.getByte(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 60);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 60);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(5);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(6);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((int[]) buf[12])[0] = rslt.getInt(7);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               return;
            case 23 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,5);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,5);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 5);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
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
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
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
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 10);
               stmt.setString(4, (String)parms[3], 10);
               stmt.setString(5, (String)parms[4], 3);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 10);
               stmt.setString(4, (String)parms[3], 10);
               stmt.setString(5, (String)parms[4], 3);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               return;
            case 18 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 26);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 5);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 4);
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 5);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setString(7, (String)parms[6], 16);
               stmt.setString(8, (String)parms[7], 13);
               stmt.setString(9, (String)parms[8], 8);
               stmt.setString(10, (String)parms[9], 8);
               stmt.setBigDecimal(11, (java.math.BigDecimal)parms[10], 5);
               stmt.setShort(12, ((Number) parms[11]).shortValue());
               stmt.setInt(13, ((Number) parms[12]).intValue());
               stmt.setInt(14, ((Number) parms[13]).intValue());
               stmt.setShort(15, ((Number) parms[14]).shortValue());
               stmt.setBigDecimal(16, (java.math.BigDecimal)parms[15], 3);
               stmt.setString(17, (String)parms[16], 3);
               stmt.setString(18, (String)parms[17], 6);
               stmt.setString(19, (String)parms[18], 6);
               stmt.setByte(20, ((Number) parms[19]).byteValue());
               stmt.setString(21, (String)parms[20], 10);
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 26);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 5);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 4);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 5);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 16);
               stmt.setString(7, (String)parms[6], 13);
               stmt.setString(8, (String)parms[7], 8);
               stmt.setString(9, (String)parms[8], 8);
               stmt.setBigDecimal(10, (java.math.BigDecimal)parms[9], 5);
               stmt.setShort(11, ((Number) parms[10]).shortValue());
               stmt.setInt(12, ((Number) parms[11]).intValue());
               stmt.setInt(13, ((Number) parms[12]).intValue());
               stmt.setShort(14, ((Number) parms[13]).shortValue());
               stmt.setBigDecimal(15, (java.math.BigDecimal)parms[14], 3);
               stmt.setString(16, (String)parms[15], 6);
               stmt.setString(17, (String)parms[16], 6);
               stmt.setByte(18, ((Number) parms[17]).byteValue());
               stmt.setString(19, (String)parms[18], 3);
               stmt.setString(20, (String)parms[19], 10);
               stmt.setInt(21, ((Number) parms[20]).intValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
      }
   }

}

