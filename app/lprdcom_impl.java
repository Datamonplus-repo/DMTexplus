package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class lprdcom_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"PRDCOMCOD") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A13747PrdCDsc = httpContext.GetPar( "PrdCDsc") ;
         httpContext.ajax_rsp_assign_attri("", false, "A13747PrdCDsc", A13747PrdCDsc);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxsgaprdcomcod1R40( A396EmprCod, A13747PrdCDsc) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"PRDCOMCOD") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A13747PrdCDsc = httpContext.GetPar( "PrdCDsc") ;
         httpContext.ajax_rsp_assign_attri("", false, "A13747PrdCDsc", A13747PrdCDsc);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxsgaprdcomcod1R40( A396EmprCod, A13747PrdCDsc) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxHideCode"+"_"+"PRDCOMCOD") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         h688PrdComCod = httpContext.GetPar( "h688PrdComCod") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxhcaprdcomcod1R479( A396EmprCod, h688PrdComCod) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "LPRDCOM", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtPrdComCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public lprdcom_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public lprdcom_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( lprdcom_impl.class ));
   }

   public lprdcom_impl( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      chkPrdEsCompu = UIFactory.getCheckbox(this);
      chkPrdComEsCo = UIFactory.getCheckbox(this);
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
      A13881PrdEsCompu = GXutil.strtobool( GXutil.booltostr( A13881PrdEsCompu)) ;
      httpContext.ajax_rsp_assign_attri("", false, "A13881PrdEsCompu", A13881PrdEsCompu);
      A13883PrdComEsCo = GXutil.strtobool( GXutil.booltostr( A13883PrdComEsCo)) ;
      httpContext.ajax_rsp_assign_attri("", false, "A13883PrdComEsCo", A13883PrdComEsCo);
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, httpContext.getMessage( "LPRDCOM", ""), "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, 0, (short)(0), "HLP_LPRDCOM.htm");
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_LPRDCOM.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
      ClassString = "BtnPrevious" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_LPRDCOM.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      ClassString = "BtnNext" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_LPRDCOM.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
      ClassString = "BtnLast" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_LPRDCOM.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
      ClassString = "BtnSelect" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_LPRDCOM.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdComCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdComCod_Internalname, httpContext.getMessage( "Codigo-Producto", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 34,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdComCod_Internalname, h688PrdComCod, GXutil.rtrim( localUtil.format( h688PrdComCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,34);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdComCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdComCod_Enabled, 0, "text", "", 60, "chr", 1, "row", 60, (byte)(0), (short)(0), 0, (byte)(0), (byte)(0), (byte)(0), true, "", "left", true, "", "HLP_LPRDCOM.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdNum_Internalname, GXutil.rtrim( A719PrdNum), GXutil.rtrim( localUtil.format( A719PrdNum, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,39);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdNum_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdNum_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_LPRDCOM.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkPrdEsCompu.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, chkPrdEsCompu.getInternalname(), httpContext.getMessage( "Es Compuesto", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Check box */
      ClassString = "Attribute" ;
      StyleString = "" ;
      app.GxWebStd.gx_checkbox_ctrl( httpContext, chkPrdEsCompu.getInternalname(), GXutil.booltostr( A13881PrdEsCompu), "", httpContext.getMessage( "Es Compuesto", ""), 1, chkPrdEsCompu.getEnabled(), "true", "", StyleString, ClassString, "", "", "");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdNom_Internalname, GXutil.rtrim( A718PrdNom), GXutil.rtrim( localUtil.format( A718PrdNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdNom_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdNom_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_LPRDCOM.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdPreAct_Internalname, GXutil.ltrim( localUtil.ntoc( A724PrdPreAct, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdPreAct_Enabled!=0) ? localUtil.format( A724PrdPreAct, "ZZZZZZZ9.999") : localUtil.format( A724PrdPreAct, "ZZZZZZZ9.999"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdPreAct_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdPreAct_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LPRDCOM.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdPrec_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdPrec_Internalname, httpContext.getMessage( "Precio", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdPrec_Internalname, GXutil.ltrim( localUtil.ntoc( A1186PrdPrec, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdPrec_Enabled!=0) ? localUtil.format( A1186PrdPrec, "ZZZZ9.999") : localUtil.format( A1186PrdPrec, "ZZZZ9.999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,59);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdPrec_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdPrec_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LPRDCOM.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdComFN_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdComFN_Internalname, httpContext.getMessage( "% Comp", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdComFN_Internalname, GXutil.ltrim( localUtil.ntoc( A690PrdComFN, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdComFN_Enabled!=0) ? localUtil.format( A690PrdComFN, "ZZZ9.99") : localUtil.format( A690PrdComFN, "ZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,64);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdComFN_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdComFN_Enabled, 0, "text", "", 7, "chr", 1, "row", 7, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LPRDCOM.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdComVal_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdComVal_Internalname, httpContext.getMessage( "Precio Comp", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdComVal_Internalname, GXutil.ltrim( localUtil.ntoc( A692PrdComVal, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdComVal_Enabled!=0) ? localUtil.format( A692PrdComVal, "ZZZZ9.999") : localUtil.format( A692PrdComVal, "ZZZZ9.999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,69);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdComVal_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdComVal_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LPRDCOM.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtValDsc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtValDsc_Internalname, httpContext.getMessage( "Validez", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtValDsc_Internalname, GXutil.rtrim( A857ValDsc), GXutil.rtrim( localUtil.format( A857ValDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtValDsc_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtValDsc_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_LPRDCOM.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkPrdComEsCo.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, chkPrdComEsCo.getInternalname(), httpContext.getMessage( "Prd Compuesto?", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Check box */
      ClassString = "Attribute" ;
      StyleString = "" ;
      app.GxWebStd.gx_checkbox_ctrl( httpContext, chkPrdComEsCo.getInternalname(), GXutil.booltostr( A13883PrdComEsCo), "", httpContext.getMessage( "Prd Compuesto?", ""), 1, chkPrdComEsCo.getEnabled(), "true", "", StyleString, ClassString, "", "", "");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdComCan_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdComCan_Internalname, httpContext.getMessage( "# Comp", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdComCan_Internalname, GXutil.ltrim( localUtil.ntoc( A13882PrdComCan, (byte)(7), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdComCan_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13882PrdComCan), "ZZZ,ZZZ") : localUtil.format( DecimalUtil.doubleToDec(A13882PrdComCan), "ZZZ,ZZZ"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdComCan_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdComCan_Enabled, 0, "text", "", 7, "chr", 1, "row", 7, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "Can60E", "right", false, "", "HLP_LPRDCOM.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdComPr_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdComPr_Internalname, httpContext.getMessage( "Precio", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdComPr_Internalname, GXutil.ltrim( localUtil.ntoc( A1185PrdComPr, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdComPr_Enabled!=0) ? localUtil.format( A1185PrdComPr, "ZZZZ9.999") : localUtil.format( A1185PrdComPr, "ZZZZ9.999"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdComPr_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdComPr_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LPRDCOM.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdComPor_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdComPor_Internalname, httpContext.getMessage( "% Total", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdComPor_Internalname, GXutil.ltrim( localUtil.ntoc( A1184PrdComPor, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdComPor_Enabled!=0) ? localUtil.format( A1184PrdComPor, "ZZZ9.99") : localUtil.format( A1184PrdComPor, "ZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdComPor_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdComPor_Enabled, 0, "text", "", 7, "chr", 1, "row", 7, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LPRDCOM.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 99,'',false,'',0)\"" ;
      ClassString = "BtnEnter" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_LPRDCOM.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 101,'',false,'',0)\"" ;
      ClassString = "BtnCancel" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_LPRDCOM.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 103,'',false,'',0)\"" ;
      ClassString = "BtnDelete" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_LPRDCOM.htm");
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
         Z719PrdNum = httpContext.cgiGet( "Z719PrdNum") ;
         Z688PrdComCod = httpContext.cgiGet( "Z688PrdComCod") ;
         Z1186PrdPrec = localUtil.ctond( httpContext.cgiGet( "Z1186PrdPrec")) ;
         Z690PrdComFN = localUtil.ctond( httpContext.cgiGet( "Z690PrdComFN")) ;
         Z692PrdComVal = localUtil.ctond( httpContext.cgiGet( "Z692PrdComVal")) ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         A688PrdComCod = httpContext.cgiGet( "GXHCPRDCOMCOD") ;
         A719PrdNum = httpContext.cgiGet( "PRDNUM") ;
         A396EmprCod = httpContext.cgiGet( "EMPRCOD") ;
         A856ValCod = (byte)(localUtil.ctol( httpContext.cgiGet( "VALCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         /* Read variables values. */
         h688PrdComCod = httpContext.cgiGet( edtPrdComCod_Internalname) ;
         A719PrdNum = httpContext.cgiGet( edtPrdNum_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         A13881PrdEsCompu = GXutil.strtobool( httpContext.cgiGet( chkPrdEsCompu.getInternalname())) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13881PrdEsCompu", A13881PrdEsCompu);
         A718PrdNom = httpContext.cgiGet( edtPrdNom_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
         A724PrdPreAct = localUtil.ctond( httpContext.cgiGet( edtPrdPreAct_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A724PrdPreAct", GXutil.ltrimstr( A724PrdPreAct, 14, 5));
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPrdPrec_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPrdPrec_Internalname)), DecimalUtil.stringToDec("99999.99999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PRDPREC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPrdPrec_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A1186PrdPrec = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A1186PrdPrec", GXutil.ltrimstr( A1186PrdPrec, 11, 5));
         }
         else
         {
            A1186PrdPrec = localUtil.ctond( httpContext.cgiGet( edtPrdPrec_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1186PrdPrec", GXutil.ltrimstr( A1186PrdPrec, 11, 5));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPrdComFN_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPrdComFN_Internalname)), DecimalUtil.stringToDec("9999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PRDCOMFN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPrdComFN_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A690PrdComFN = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A690PrdComFN", GXutil.ltrimstr( A690PrdComFN, 7, 2));
         }
         else
         {
            A690PrdComFN = localUtil.ctond( httpContext.cgiGet( edtPrdComFN_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A690PrdComFN", GXutil.ltrimstr( A690PrdComFN, 7, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPrdComVal_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPrdComVal_Internalname)), DecimalUtil.stringToDec("99999.99999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PRDCOMVAL");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPrdComVal_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A692PrdComVal = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A692PrdComVal", GXutil.ltrimstr( A692PrdComVal, 11, 5));
         }
         else
         {
            A692PrdComVal = localUtil.ctond( httpContext.cgiGet( edtPrdComVal_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A692PrdComVal", GXutil.ltrimstr( A692PrdComVal, 11, 5));
         }
         A857ValDsc = httpContext.cgiGet( edtValDsc_Internalname) ;
         n857ValDsc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A857ValDsc", A857ValDsc);
         A13883PrdComEsCo = GXutil.strtobool( httpContext.cgiGet( chkPrdComEsCo.getInternalname())) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13883PrdComEsCo", A13883PrdComEsCo);
         A13882PrdComCan = (int)(localUtil.ctol( httpContext.cgiGet( edtPrdComCan_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13882PrdComCan", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13882PrdComCan), 6, 0));
         A1185PrdComPr = localUtil.ctond( httpContext.cgiGet( edtPrdComPr_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1185PrdComPr", GXutil.ltrimstr( A1185PrdComPr, 11, 5));
         A1184PrdComPor = localUtil.ctond( httpContext.cgiGet( edtPrdComPor_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1184PrdComPor", GXutil.ltrimstr( A1184PrdComPor, 7, 2));
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"LPRDCOM");
         forbiddenHiddens.add("EmprCod", GXutil.rtrim( localUtil.format( A396EmprCod, "@!")));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ( ! ( ( GXutil.strcmp(A719PrdNum, Z719PrdNum) != 0 ) || ( GXutil.strcmp(A688PrdComCod, Z688PrdComCod) != 0 ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("lprdcom:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
            A719PrdNum = httpContext.GetPar( "PrdNum") ;
            httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
            A688PrdComCod = httpContext.GetPar( "PrdComCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "A688PrdComCod", A688PrdComCod);
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
            initAll1R479( ) ;
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
      disableAttributes1R479( ) ;
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

   public void resetCaption1R40( )
   {
   }

   public void zm1R479( int GX_JID )
   {
      if ( ( GX_JID == 5 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z1186PrdPrec = T01R43_A1186PrdPrec[0] ;
            Z690PrdComFN = T01R43_A690PrdComFN[0] ;
            Z692PrdComVal = T01R43_A692PrdComVal[0] ;
         }
         else
         {
            Z1186PrdPrec = A1186PrdPrec ;
            Z690PrdComFN = A690PrdComFN ;
            Z692PrdComVal = A692PrdComVal ;
         }
      }
      if ( GX_JID == -5 )
      {
         Z1186PrdPrec = A1186PrdPrec ;
         Z690PrdComFN = A690PrdComFN ;
         Z692PrdComVal = A692PrdComVal ;
         Z396EmprCod = A396EmprCod ;
         Z719PrdNum = A719PrdNum ;
         Z688PrdComCod = A688PrdComCod ;
         Z1185PrdComPr = A1185PrdComPr ;
         Z1184PrdComPor = A1184PrdComPor ;
         Z13882PrdComCan = A13882PrdComCan ;
         Z718PrdNom = A718PrdNom ;
         Z724PrdPreAct = A724PrdPreAct ;
         Z856ValCod = A856ValCod ;
         Z857ValDsc = A857ValDsc ;
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

   public void load1R479( )
   {
      /* Using cursor T01R410 */
      pr_default.execute(6, new Object[] {A396EmprCod, A719PrdNum, A688PrdComCod});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound79 = (short)(1) ;
         A718PrdNom = T01R410_A718PrdNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
         A724PrdPreAct = T01R410_A724PrdPreAct[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A724PrdPreAct", GXutil.ltrimstr( A724PrdPreAct, 14, 5));
         A1186PrdPrec = T01R410_A1186PrdPrec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1186PrdPrec", GXutil.ltrimstr( A1186PrdPrec, 11, 5));
         A690PrdComFN = T01R410_A690PrdComFN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A690PrdComFN", GXutil.ltrimstr( A690PrdComFN, 7, 2));
         A692PrdComVal = T01R410_A692PrdComVal[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A692PrdComVal", GXutil.ltrimstr( A692PrdComVal, 11, 5));
         A857ValDsc = T01R410_A857ValDsc[0] ;
         n857ValDsc = T01R410_n857ValDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A857ValDsc", A857ValDsc);
         A856ValCod = T01R410_A856ValCod[0] ;
         A1185PrdComPr = T01R410_A1185PrdComPr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1185PrdComPr", GXutil.ltrimstr( A1185PrdComPr, 11, 5));
         A1184PrdComPor = T01R410_A1184PrdComPor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1184PrdComPor", GXutil.ltrimstr( A1184PrdComPor, 7, 2));
         A13882PrdComCan = T01R410_A13882PrdComCan[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13882PrdComCan", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13882PrdComCan), 6, 0));
         zm1R479( -5) ;
      }
      pr_default.close(6);
      onLoadActions1R479( ) ;
   }

   public void onLoadActions1R479( )
   {
      if ( GXutil.strSearch( A688PrdComCod, "0", 1) == 1 )
      {
         A13883PrdComEsCo = true ;
         httpContext.ajax_rsp_assign_attri("", false, "A13883PrdComEsCo", A13883PrdComEsCo);
      }
      else
      {
         A13883PrdComEsCo = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13883PrdComEsCo", A13883PrdComEsCo);
      }
      if ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 1), "0") == 0 )
      {
         A13881PrdEsCompu = true ;
         httpContext.ajax_rsp_assign_attri("", false, "A13881PrdEsCompu", A13881PrdEsCompu);
      }
      else
      {
         A13881PrdEsCompu = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13881PrdEsCompu", A13881PrdEsCompu);
      }
      /* Using cursor T01R411 */
      pr_default.execute(7, new Object[] {A396EmprCod, A688PrdComCod});
      h688PrdComCod = "" ;
      while ( (pr_default.getStatus(7) != 101) )
      {
         h688PrdComCod = T01R411_A13747PrdCDsc[0] ;
         if (true) break;
      }
      pr_default.close(7);
      httpContext.ajax_rsp_assign_attri("", false, "h688PrdComCod", h688PrdComCod);
   }

   public void checkExtendedTable1R479( )
   {
      nIsDirty_79 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      if ( GXutil.strSearch( A688PrdComCod, "0", 1) == 1 )
      {
         nIsDirty_79 = (short)(1) ;
         A13883PrdComEsCo = true ;
         httpContext.ajax_rsp_assign_attri("", false, "A13883PrdComEsCo", A13883PrdComEsCo);
      }
      else
      {
         nIsDirty_79 = (short)(1) ;
         A13883PrdComEsCo = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13883PrdComEsCo", A13883PrdComEsCo);
      }
      if ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 1), "0") == 0 )
      {
         nIsDirty_79 = (short)(1) ;
         A13881PrdEsCompu = true ;
         httpContext.ajax_rsp_assign_attri("", false, "A13881PrdEsCompu", A13881PrdEsCompu);
      }
      else
      {
         nIsDirty_79 = (short)(1) ;
         A13881PrdEsCompu = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13881PrdEsCompu", A13881PrdEsCompu);
      }
   }

   public void closeExtendedTableCursors1R479( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1R479( )
   {
      /* Using cursor T01R412 */
      pr_default.execute(8, new Object[] {A396EmprCod, A719PrdNum, A688PrdComCod});
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound79 = (short)(1) ;
      }
      else
      {
         RcdFound79 = (short)(0) ;
      }
      pr_default.close(8);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01R43 */
      pr_default.execute(1, new Object[] {A396EmprCod, A719PrdNum, A688PrdComCod});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1R479( 5) ;
         RcdFound79 = (short)(1) ;
         A1186PrdPrec = T01R43_A1186PrdPrec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1186PrdPrec", GXutil.ltrimstr( A1186PrdPrec, 11, 5));
         A690PrdComFN = T01R43_A690PrdComFN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A690PrdComFN", GXutil.ltrimstr( A690PrdComFN, 7, 2));
         A692PrdComVal = T01R43_A692PrdComVal[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A692PrdComVal", GXutil.ltrimstr( A692PrdComVal, 11, 5));
         A396EmprCod = T01R43_A396EmprCod[0] ;
         A719PrdNum = T01R43_A719PrdNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         A688PrdComCod = T01R43_A688PrdComCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A688PrdComCod", A688PrdComCod);
         Z396EmprCod = A396EmprCod ;
         Z719PrdNum = A719PrdNum ;
         Z688PrdComCod = A688PrdComCod ;
         sMode79 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1R479( ) ;
         if ( AnyError == 1 )
         {
            RcdFound79 = (short)(0) ;
            initializeNonKey1R479( ) ;
         }
         Gx_mode = sMode79 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound79 = (short)(0) ;
         initializeNonKey1R479( ) ;
         sMode79 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode79 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1R479( ) ;
      if ( RcdFound79 == 0 )
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
      RcdFound79 = (short)(0) ;
      /* Using cursor T01R413 */
      pr_default.execute(9, new Object[] {A396EmprCod, A396EmprCod, A719PrdNum, A719PrdNum, A396EmprCod, A688PrdComCod});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T01R413_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01R413_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01R413_A719PrdNum[0], A719PrdNum) < 0 ) || ( GXutil.strcmp(T01R413_A719PrdNum[0], A719PrdNum) == 0 ) && ( GXutil.strcmp(T01R413_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01R413_A688PrdComCod[0], A688PrdComCod) < 0 ) ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T01R413_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01R413_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01R413_A719PrdNum[0], A719PrdNum) > 0 ) || ( GXutil.strcmp(T01R413_A719PrdNum[0], A719PrdNum) == 0 ) && ( GXutil.strcmp(T01R413_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01R413_A688PrdComCod[0], A688PrdComCod) > 0 ) ) )
         {
            A396EmprCod = T01R413_A396EmprCod[0] ;
            A719PrdNum = T01R413_A719PrdNum[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
            A688PrdComCod = T01R413_A688PrdComCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A688PrdComCod", A688PrdComCod);
            RcdFound79 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void move_previous( )
   {
      RcdFound79 = (short)(0) ;
      /* Using cursor T01R414 */
      pr_default.execute(10, new Object[] {A396EmprCod, A396EmprCod, A719PrdNum, A719PrdNum, A396EmprCod, A688PrdComCod});
      if ( (pr_default.getStatus(10) != 101) )
      {
         while ( (pr_default.getStatus(10) != 101) && ( ( GXutil.strcmp(T01R414_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01R414_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01R414_A719PrdNum[0], A719PrdNum) > 0 ) || ( GXutil.strcmp(T01R414_A719PrdNum[0], A719PrdNum) == 0 ) && ( GXutil.strcmp(T01R414_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01R414_A688PrdComCod[0], A688PrdComCod) > 0 ) ) )
         {
            pr_default.readNext(10);
         }
         if ( (pr_default.getStatus(10) != 101) && ( ( GXutil.strcmp(T01R414_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01R414_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01R414_A719PrdNum[0], A719PrdNum) < 0 ) || ( GXutil.strcmp(T01R414_A719PrdNum[0], A719PrdNum) == 0 ) && ( GXutil.strcmp(T01R414_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01R414_A688PrdComCod[0], A688PrdComCod) < 0 ) ) )
         {
            A396EmprCod = T01R414_A396EmprCod[0] ;
            A719PrdNum = T01R414_A719PrdNum[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
            A688PrdComCod = T01R414_A688PrdComCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A688PrdComCod", A688PrdComCod);
            RcdFound79 = (short)(1) ;
         }
      }
      pr_default.close(10);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1R479( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtPrdComCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1R479( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound79 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A719PrdNum, Z719PrdNum) != 0 ) || ( GXutil.strcmp(A688PrdComCod, Z688PrdComCod) != 0 ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A719PrdNum = Z719PrdNum ;
               httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
               A688PrdComCod = Z688PrdComCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A688PrdComCod", A688PrdComCod);
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "PRDNUM");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPrdNum_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtPrdComCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update1R479( ) ;
               GX_FocusControl = edtPrdComCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A719PrdNum, Z719PrdNum) != 0 ) || ( GXutil.strcmp(A688PrdComCod, Z688PrdComCod) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtPrdComCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1R479( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "PRDNUM");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtPrdNum_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  /* Insert record */
                  GX_FocusControl = edtPrdComCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1R479( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A719PrdNum, Z719PrdNum) != 0 ) || ( GXutil.strcmp(A688PrdComCod, Z688PrdComCod) != 0 ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A719PrdNum = Z719PrdNum ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         A688PrdComCod = Z688PrdComCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A688PrdComCod", A688PrdComCod);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "PRDNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtPrdComCod_Internalname ;
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
      if ( RcdFound79 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "PRDNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtPrdPrec_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1R479( ) ;
      if ( RcdFound79 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtPrdPrec_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1R479( ) ;
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
      if ( RcdFound79 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtPrdPrec_Internalname ;
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
      if ( RcdFound79 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtPrdPrec_Internalname ;
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
      scanStart1R479( ) ;
      if ( RcdFound79 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound79 != 0 )
         {
            scanNext1R479( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtPrdPrec_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1R479( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1R479( )
   {
      if ( isDlt( ) )
      {
      }
      if ( ! isIns( ) )
      {
         /* Using cursor T01R42 */
         pr_default.execute(0, new Object[] {A396EmprCod, A719PrdNum, A688PrdComCod});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLPRDCO"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z1186PrdPrec, T01R42_A1186PrdPrec[0]) != 0 ) || ( DecimalUtil.compareTo(Z690PrdComFN, T01R42_A690PrdComFN[0]) != 0 ) || ( DecimalUtil.compareTo(Z692PrdComVal, T01R42_A692PrdComVal[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z1186PrdPrec, T01R42_A1186PrdPrec[0]) != 0 )
            {
               GXutil.writeLogln("lprdcom:[seudo value changed for attri]"+"PrdPrec");
               GXutil.writeLogRaw("Old: ",Z1186PrdPrec);
               GXutil.writeLogRaw("Current: ",T01R42_A1186PrdPrec[0]);
            }
            if ( DecimalUtil.compareTo(Z690PrdComFN, T01R42_A690PrdComFN[0]) != 0 )
            {
               GXutil.writeLogln("lprdcom:[seudo value changed for attri]"+"PrdComFN");
               GXutil.writeLogRaw("Old: ",Z690PrdComFN);
               GXutil.writeLogRaw("Current: ",T01R42_A690PrdComFN[0]);
            }
            if ( DecimalUtil.compareTo(Z692PrdComVal, T01R42_A692PrdComVal[0]) != 0 )
            {
               GXutil.writeLogln("lprdcom:[seudo value changed for attri]"+"PrdComVal");
               GXutil.writeLogRaw("Old: ",Z692PrdComVal);
               GXutil.writeLogRaw("Current: ",T01R42_A692PrdComVal[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPLPRDCO"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1R479( )
   {
      beforeValidate1R479( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1R479( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1R479( 0) ;
         checkOptimisticConcurrency1R479( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1R479( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1R479( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01R415 */
                  pr_default.execute(11, new Object[] {A1186PrdPrec, A690PrdComFN, A692PrdComVal, A396EmprCod, A719PrdNum, A688PrdComCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPRDCO");
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
                        /* Save values for previous() function. */
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                        endTrnMsgCod = "SuccessfullyAdded" ;
                        resetCaption1R40( ) ;
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
            load1R479( ) ;
         }
         endLevel1R479( ) ;
      }
      closeExtendedTableCursors1R479( ) ;
   }

   public void update1R479( )
   {
      beforeValidate1R479( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1R479( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1R479( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1R479( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1R479( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01R416 */
                  pr_default.execute(12, new Object[] {A1186PrdPrec, A690PrdComFN, A692PrdComVal, A396EmprCod, A719PrdNum, A688PrdComCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPRDCO");
                  if ( (pr_default.getStatus(12) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLPRDCO"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1R479( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption1R40( ) ;
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
         endLevel1R479( ) ;
      }
      closeExtendedTableCursors1R479( ) ;
   }

   public void deferredUpdate1R479( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1R479( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1R479( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1R479( ) ;
         afterConfirm1R479( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1R479( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01R417 */
               pr_default.execute(13, new Object[] {A396EmprCod, A719PrdNum, A688PrdComCod});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPRDCO");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound79 == 0 )
                     {
                        initAll1R479( ) ;
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
                     resetCaption1R40( ) ;
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
      sMode79 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1R479( ) ;
      Gx_mode = sMode79 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1R479( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         if ( GXutil.strSearch( A688PrdComCod, "0", 1) == 1 )
         {
            A13883PrdComEsCo = true ;
            httpContext.ajax_rsp_assign_attri("", false, "A13883PrdComEsCo", A13883PrdComEsCo);
         }
         else
         {
            A13883PrdComEsCo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13883PrdComEsCo", A13883PrdComEsCo);
         }
         if ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 1), "0") == 0 )
         {
            A13881PrdEsCompu = true ;
            httpContext.ajax_rsp_assign_attri("", false, "A13881PrdEsCompu", A13881PrdEsCompu);
         }
         else
         {
            A13881PrdEsCompu = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13881PrdEsCompu", A13881PrdEsCompu);
         }
      }
   }

   public void endLevel1R479( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1R479( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "lprdcom");
         if ( AnyError == 0 )
         {
            confirmValues1R40( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "lprdcom");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1R479( )
   {
      /* Scan By routine */
      /* Using cursor T01R418 */
      pr_default.execute(14);
      RcdFound79 = (short)(0) ;
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound79 = (short)(1) ;
         A396EmprCod = T01R418_A396EmprCod[0] ;
         A719PrdNum = T01R418_A719PrdNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         A688PrdComCod = T01R418_A688PrdComCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A688PrdComCod", A688PrdComCod);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1R479( )
   {
      /* Scan next routine */
      pr_default.readNext(14);
      RcdFound79 = (short)(0) ;
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound79 = (short)(1) ;
         A396EmprCod = T01R418_A396EmprCod[0] ;
         A719PrdNum = T01R418_A719PrdNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         A688PrdComCod = T01R418_A688PrdComCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A688PrdComCod", A688PrdComCod);
      }
   }

   public void scanEnd1R479( )
   {
      pr_default.close(14);
   }

   public void afterConfirm1R479( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1R479( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1R479( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1R479( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1R479( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1R479( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1R479( )
   {
      edtPrdComCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdComCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdComCod_Enabled), 5, 0), true);
      edtPrdNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Enabled), 5, 0), true);
      chkPrdEsCompu.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkPrdEsCompu.getInternalname(), "Enabled", GXutil.ltrimstr( chkPrdEsCompu.getEnabled(), 5, 0), true);
      edtPrdNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNom_Enabled), 5, 0), true);
      edtPrdPreAct_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdPreAct_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdPreAct_Enabled), 5, 0), true);
      edtPrdPrec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdPrec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdPrec_Enabled), 5, 0), true);
      edtPrdComFN_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdComFN_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdComFN_Enabled), 5, 0), true);
      edtPrdComVal_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdComVal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdComVal_Enabled), 5, 0), true);
      edtValDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtValDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtValDsc_Enabled), 5, 0), true);
      chkPrdComEsCo.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkPrdComEsCo.getInternalname(), "Enabled", GXutil.ltrimstr( chkPrdComEsCo.getEnabled(), 5, 0), true);
      edtPrdComCan_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdComCan_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdComCan_Enabled), 5, 0), true);
      edtPrdComPr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdComPr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdComPr_Enabled), 5, 0), true);
      edtPrdComPor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdComPor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdComPor_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1R479( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1R40( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.lprdcom", new String[] {}, new String[] {}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"LPRDCOM");
      forbiddenHiddens.add("EmprCod", GXutil.rtrim( localUtil.format( A396EmprCod, "@!")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("lprdcom:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z719PrdNum", GXutil.rtrim( Z719PrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, "Z688PrdComCod", GXutil.rtrim( Z688PrdComCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1186PrdPrec", GXutil.ltrim( localUtil.ntoc( Z1186PrdPrec, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z690PrdComFN", GXutil.ltrim( localUtil.ntoc( Z690PrdComFN, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z692PrdComVal", GXutil.ltrim( localUtil.ntoc( Z692PrdComVal, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "GXHCPRDCOMCOD", GXutil.rtrim( A688PrdComCod));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDNUM", GXutil.rtrim( A719PrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDCDSC", A13747PrdCDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "VALCOD", GXutil.ltrim( localUtil.ntoc( A856ValCod, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.lprdcom", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "LPRDCOM" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "LPRDCOM", "") ;
   }

   public void initializeNonKey1R479( )
   {
      A1185PrdComPr = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A1185PrdComPr", GXutil.ltrimstr( A1185PrdComPr, 11, 5));
      A1184PrdComPor = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A1184PrdComPor", GXutil.ltrimstr( A1184PrdComPor, 7, 2));
      A13881PrdEsCompu = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13881PrdEsCompu", A13881PrdEsCompu);
      A13882PrdComCan = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A13882PrdComCan", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13882PrdComCan), 6, 0));
      A13883PrdComEsCo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13883PrdComEsCo", A13883PrdComEsCo);
      A718PrdNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
      A724PrdPreAct = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A724PrdPreAct", GXutil.ltrimstr( A724PrdPreAct, 14, 5));
      A1186PrdPrec = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A1186PrdPrec", GXutil.ltrimstr( A1186PrdPrec, 11, 5));
      A690PrdComFN = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A690PrdComFN", GXutil.ltrimstr( A690PrdComFN, 7, 2));
      A692PrdComVal = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A692PrdComVal", GXutil.ltrimstr( A692PrdComVal, 11, 5));
      A856ValCod = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A856ValCod", GXutil.str( A856ValCod, 1, 0));
      A857ValDsc = "" ;
      n857ValDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A857ValDsc", A857ValDsc);
      Z1186PrdPrec = DecimalUtil.ZERO ;
      Z690PrdComFN = DecimalUtil.ZERO ;
      Z692PrdComVal = DecimalUtil.ZERO ;
   }

   public void initAll1R479( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A719PrdNum = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
      A13747PrdCDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13747PrdCDsc", A13747PrdCDsc);
      h688PrdComCod = A13747PrdCDsc ;
      httpContext.ajax_rsp_assign_attri("", false, "h688PrdComCod", h688PrdComCod);
      h688PrdComCod = "" ;
      initializeNonKey1R479( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211691355", true, true);
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
      httpContext.AddJavascriptSource("lprdcom.js", "?20268211691355", false, true);
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
      edtPrdComCod_Internalname = "PRDCOMCOD" ;
      edtPrdNum_Internalname = "PRDNUM" ;
      chkPrdEsCompu.setInternalname( "PRDESCOMPU" );
      edtPrdNom_Internalname = "PRDNOM" ;
      edtPrdPreAct_Internalname = "PRDPREACT" ;
      edtPrdPrec_Internalname = "PRDPREC" ;
      edtPrdComFN_Internalname = "PRDCOMFN" ;
      edtPrdComVal_Internalname = "PRDCOMVAL" ;
      edtValDsc_Internalname = "VALDSC" ;
      chkPrdComEsCo.setInternalname( "PRDCOMESCO" );
      edtPrdComCan_Internalname = "PRDCOMCAN" ;
      edtPrdComPr_Internalname = "PRDCOMPR" ;
      edtPrdComPor_Internalname = "PRDCOMPOR" ;
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
      Form.setCaption( httpContext.getMessage( "LPRDCOM", "") );
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtPrdComPor_Jsonclick = "" ;
      edtPrdComPor_Enabled = 0 ;
      edtPrdComPr_Jsonclick = "" ;
      edtPrdComPr_Enabled = 0 ;
      edtPrdComCan_Jsonclick = "" ;
      edtPrdComCan_Enabled = 0 ;
      chkPrdComEsCo.setEnabled( 0 );
      edtValDsc_Jsonclick = "" ;
      edtValDsc_Enabled = 0 ;
      edtPrdComVal_Jsonclick = "" ;
      edtPrdComVal_Enabled = 1 ;
      edtPrdComFN_Jsonclick = "" ;
      edtPrdComFN_Enabled = 1 ;
      edtPrdPrec_Jsonclick = "" ;
      edtPrdPrec_Enabled = 1 ;
      edtPrdPreAct_Jsonclick = "" ;
      edtPrdPreAct_Enabled = 0 ;
      edtPrdNom_Jsonclick = "" ;
      edtPrdNom_Enabled = 0 ;
      chkPrdEsCompu.setEnabled( 0 );
      edtPrdNum_Jsonclick = "" ;
      edtPrdNum_Enabled = 1 ;
      edtPrdComCod_Jsonclick = "" ;
      edtPrdComCod_Enabled = 1 ;
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

   public void gxsgaprdcomcod1R40( String A396EmprCod ,
                                   String A13747PrdCDsc )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgaprdcomcod_data1R40( A396EmprCod, A13747PrdCDsc) ;
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

   protected void gxsgaprdcomcod_data1R40( String A396EmprCod ,
                                           String A13747PrdCDsc )
   {
      l13747PrdCDsc = GXutil.concat( GXutil.rtrim( A13747PrdCDsc), "%", "") ;
      /* Using cursor T01R419 */
      pr_default.execute(15, new Object[] {A396EmprCod, l13747PrdCDsc});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(15) != 101) )
      {
         gxdynajaxctrlcodr.add(T01R419_A13747PrdCDsc[0]);
         gxdynajaxctrldescr.add(T01R419_A13747PrdCDsc[0]);
         pr_default.readNext(15);
      }
      pr_default.close(15);
   }

   public void gxhcaprdcomcod1R479( String A396EmprCod ,
                                    String A13747PrdCDsc )
   {
      /* Using cursor T01R420 */
      pr_default.execute(16, new Object[] {A13747PrdCDsc, A396EmprCod});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(16) != 101) )
      {
         gxhchits = (short)(gxhchits+1) ;
         if ( gxhchits > 1 )
         {
            if (true) break;
         }
         A13747PrdCDsc = T01R420_A13747PrdCDsc[0] ;
         A396EmprCod = T01R420_A396EmprCod[0] ;
         A719PrdNum = T01R420_A719PrdNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         pr_default.readNext(16);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A719PrdNum))+"\"") ;
      addString( "]") ;
      if ( gxhchits > 1 )
      {
         addString( ",") ;
         addString( "\"ambiguousck\"") ;
      }
      if ( gxhchits == 0 )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(16);
   }

   public void init_web_controls( )
   {
      chkPrdEsCompu.setName( "PRDESCOMPU" );
      chkPrdEsCompu.setWebtags( "" );
      chkPrdEsCompu.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkPrdEsCompu.getInternalname(), "TitleCaption", chkPrdEsCompu.getCaption(), true);
      chkPrdEsCompu.setCheckedValue( "false" );
      A13881PrdEsCompu = GXutil.strtobool( GXutil.booltostr( A13881PrdEsCompu)) ;
      httpContext.ajax_rsp_assign_attri("", false, "A13881PrdEsCompu", A13881PrdEsCompu);
      chkPrdComEsCo.setName( "PRDCOMESCO" );
      chkPrdComEsCo.setWebtags( "" );
      chkPrdComEsCo.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkPrdComEsCo.getInternalname(), "TitleCaption", chkPrdComEsCo.getCaption(), true);
      chkPrdComEsCo.setCheckedValue( "false" );
      A13883PrdComEsCo = GXutil.strtobool( GXutil.booltostr( A13883PrdComEsCo)) ;
      httpContext.ajax_rsp_assign_attri("", false, "A13883PrdComEsCo", A13883PrdComEsCo);
      /* End function init_web_controls */
   }

   public void afterkeyloadscreen( )
   {
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      getEqualNoModal( ) ;
      /* Using cursor T01R421 */
      pr_default.execute(17, new Object[] {A396EmprCod, A719PrdNum});
      if ( (pr_default.getStatus(17) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A718PrdNom = T01R421_A718PrdNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
      A724PrdPreAct = T01R421_A724PrdPreAct[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A724PrdPreAct", GXutil.ltrimstr( A724PrdPreAct, 14, 5));
      A856ValCod = T01R421_A856ValCod[0] ;
      pr_default.close(17);
      /* Using cursor T01R422 */
      pr_default.execute(18, new Object[] {A396EmprCod, Byte.valueOf(A856ValCod)});
      if ( (pr_default.getStatus(18) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TIPVAL", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "VALCOD");
         AnyError = (short)(1) ;
      }
      A857ValDsc = T01R422_A857ValDsc[0] ;
      n857ValDsc = T01R422_n857ValDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A857ValDsc", A857ValDsc);
      pr_default.close(18);
      /* Using cursor T01R423 */
      pr_default.execute(19, new Object[] {A396EmprCod, A688PrdComCod});
      if ( (pr_default.getStatus(19) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CPRDCO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDCOMCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdComCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(19);
      /* Using cursor T01R425 */
      pr_default.execute(20, new Object[] {A396EmprCod, A688PrdComCod});
      if ( (pr_default.getStatus(20) != 101) )
      {
         A1185PrdComPr = T01R425_A1185PrdComPr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1185PrdComPr", GXutil.ltrimstr( A1185PrdComPr, 11, 5));
         A1184PrdComPor = T01R425_A1184PrdComPor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1184PrdComPor", GXutil.ltrimstr( A1184PrdComPor, 7, 2));
         A13882PrdComCan = T01R425_A13882PrdComCan[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13882PrdComCan", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13882PrdComCan), 6, 0));
      }
      else
      {
         A1185PrdComPr = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1185PrdComPr", GXutil.ltrimstr( A1185PrdComPr, 11, 5));
         A1184PrdComPor = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1184PrdComPor", GXutil.ltrimstr( A1184PrdComPor, 7, 2));
         A13882PrdComCan = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "A13882PrdComCan", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13882PrdComCan), 6, 0));
      }
      pr_default.close(20);
      GX_FocusControl = edtPrdPrec_Internalname ;
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

   public void valid_Prdcomcod( )
   {
      if ( (GXutil.strcmp("", h688PrdComCod)==0) )
      {
         A688PrdComCod = "" ;
      }
      else
      {
         A13747PrdCDsc = h688PrdComCod ;
         /* Using cursor T01R426 */
         pr_default.execute(21, new Object[] {A13747PrdCDsc, A396EmprCod});
         A396EmprCod = T01R426_A396EmprCod[0] ;
         A719PrdNum = T01R426_A719PrdNum[0] ;
         A688PrdComCod = T01R426_A719PrdNum[0] ;
         if ( ! ( (pr_default.getStatus(21) == 101) ) )
         {
            pr_default.readNext(21);
            if ( ! ( (pr_default.getStatus(21) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo-Producto", "")}), 1, "PRDCOMCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPrdComCod_Internalname ;
            }
         }
         else
         {
         }
         pr_default.close(21);
      }
      httpContext.ajax_rsp_assign_attri("", false, "h688PrdComCod", h688PrdComCod);
      /* Using cursor T01R427 */
      pr_default.execute(22, new Object[] {A396EmprCod, A688PrdComCod});
      if ( (pr_default.getStatus(22) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CPRDCO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDCOMCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdComCod_Internalname ;
      }
      pr_default.close(22);
      /* Using cursor T01R429 */
      pr_default.execute(23, new Object[] {A396EmprCod, A688PrdComCod});
      if ( (pr_default.getStatus(23) != 101) )
      {
         A1185PrdComPr = T01R429_A1185PrdComPr[0] ;
         A1184PrdComPor = T01R429_A1184PrdComPor[0] ;
         A13882PrdComCan = T01R429_A13882PrdComCan[0] ;
      }
      else
      {
         A1185PrdComPr = DecimalUtil.doubleToDec(0) ;
         A1184PrdComPor = DecimalUtil.doubleToDec(0) ;
         A13882PrdComCan = 0 ;
      }
      pr_default.close(23);
      if ( GXutil.strSearch( A688PrdComCod, "0", 1) == 1 )
      {
         A13883PrdComEsCo = true ;
      }
      else
      {
         A13883PrdComEsCo = false ;
      }
      dynload_actions( ) ;
      A13883PrdComEsCo = GXutil.strtobool( GXutil.booltostr( A13883PrdComEsCo)) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", GXutil.rtrim( A396EmprCod));
      httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", GXutil.rtrim( A719PrdNum));
      httpContext.ajax_rsp_assign_attri("", false, "A688PrdComCod", GXutil.rtrim( A688PrdComCod));
      httpContext.ajax_rsp_assign_attri("", false, "A1185PrdComPr", GXutil.ltrim( localUtil.ntoc( A1185PrdComPr, (byte)(11), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1184PrdComPor", GXutil.ltrim( localUtil.ntoc( A1184PrdComPor, (byte)(7), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A13882PrdComCan", GXutil.ltrim( localUtil.ntoc( A13882PrdComCan, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A13883PrdComEsCo", A13883PrdComEsCo);
      httpContext.ajax_rsp_assign_attri("", false, "h688PrdComCod", h688PrdComCod);
   }

   public void valid_Prdnum( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      /* Using cursor T01R430 */
      pr_default.execute(24, new Object[] {A396EmprCod, A719PrdNum});
      if ( (pr_default.getStatus(24) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
      }
      A718PrdNom = T01R430_A718PrdNom[0] ;
      A724PrdPreAct = T01R430_A724PrdPreAct[0] ;
      A856ValCod = T01R430_A856ValCod[0] ;
      pr_default.close(24);
      /* Using cursor T01R431 */
      pr_default.execute(25, new Object[] {A396EmprCod, Byte.valueOf(A856ValCod)});
      if ( (pr_default.getStatus(25) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TIPVAL", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "VALCOD");
         AnyError = (short)(1) ;
      }
      A857ValDsc = T01R431_A857ValDsc[0] ;
      n857ValDsc = T01R431_n857ValDsc[0] ;
      pr_default.close(25);
      if ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 1), "0") == 0 )
      {
         A13881PrdEsCompu = true ;
      }
      else
      {
         A13881PrdEsCompu = false ;
      }
      A13747PrdCDsc = GXutil.trim( A719PrdNum) + " - " + GXutil.trim( A718PrdNom) ;
      dynload_actions( ) ;
      A13883PrdComEsCo = GXutil.strtobool( GXutil.booltostr( A13883PrdComEsCo)) ;
      A13881PrdEsCompu = GXutil.strtobool( GXutil.booltostr( A13881PrdEsCompu)) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A1185PrdComPr", GXutil.ltrim( localUtil.ntoc( A1185PrdComPr, (byte)(11), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1184PrdComPor", GXutil.ltrim( localUtil.ntoc( A1184PrdComPor, (byte)(7), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A13882PrdComCan", GXutil.ltrim( localUtil.ntoc( A13882PrdComCan, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", GXutil.rtrim( A718PrdNom));
      httpContext.ajax_rsp_assign_attri("", false, "A724PrdPreAct", GXutil.ltrim( localUtil.ntoc( A724PrdPreAct, (byte)(14), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1186PrdPrec", GXutil.ltrim( localUtil.ntoc( A1186PrdPrec, (byte)(11), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A690PrdComFN", GXutil.ltrim( localUtil.ntoc( A690PrdComFN, (byte)(7), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A692PrdComVal", GXutil.ltrim( localUtil.ntoc( A692PrdComVal, (byte)(11), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A856ValCod", GXutil.ltrim( localUtil.ntoc( A856ValCod, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A857ValDsc", GXutil.rtrim( A857ValDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A13883PrdComEsCo", A13883PrdComEsCo);
      httpContext.ajax_rsp_assign_attri("", false, "A13881PrdEsCompu", A13881PrdEsCompu);
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z719PrdNum", GXutil.rtrim( Z719PrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, "Z688PrdComCod", GXutil.rtrim( Z688PrdComCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1185PrdComPr", GXutil.ltrim( localUtil.ntoc( Z1185PrdComPr, (byte)(11), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1184PrdComPor", GXutil.ltrim( localUtil.ntoc( Z1184PrdComPor, (byte)(7), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13882PrdComCan", GXutil.ltrim( localUtil.ntoc( Z13882PrdComCan, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z718PrdNom", GXutil.rtrim( Z718PrdNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z724PrdPreAct", GXutil.ltrim( localUtil.ntoc( Z724PrdPreAct, (byte)(14), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1186PrdPrec", GXutil.ltrim( localUtil.ntoc( Z1186PrdPrec, (byte)(11), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z690PrdComFN", GXutil.ltrim( localUtil.ntoc( Z690PrdComFN, (byte)(7), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z692PrdComVal", GXutil.ltrim( localUtil.ntoc( Z692PrdComVal, (byte)(11), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z856ValCod", GXutil.ltrim( localUtil.ntoc( Z856ValCod, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z857ValDsc", GXutil.rtrim( Z857ValDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13883PrdComEsCo", GXutil.booltostr( Z13883PrdComEsCo));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13881PrdEsCompu", GXutil.booltostr( Z13881PrdEsCompu));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A13881PrdEsCompu',fld:'PRDESCOMPU',pic:''},{av:'A13883PrdComEsCo',fld:'PRDCOMESCO',pic:''}]");
      setEventMetadata("ENTER",",oparms:[{av:'A13881PrdEsCompu',fld:'PRDESCOMPU',pic:''},{av:'A13883PrdComEsCo',fld:'PRDCOMESCO',pic:''}]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A13881PrdEsCompu',fld:'PRDESCOMPU',pic:''},{av:'A13883PrdComEsCo',fld:'PRDCOMESCO',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[{av:'A13881PrdEsCompu',fld:'PRDESCOMPU',pic:''},{av:'A13883PrdComEsCo',fld:'PRDCOMESCO',pic:''}]}");
      setEventMetadata("VALID_PRDCOMCOD","{handler:'valid_Prdcomcod',iparms:[{av:'h688PrdComCod'},{av:'A688PrdComCod',fld:'PRDCOMCOD',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A1185PrdComPr',fld:'PRDCOMPR',pic:'ZZZZ9.999'},{av:'A1184PrdComPor',fld:'PRDCOMPOR',pic:'ZZZ9.99'},{av:'A13882PrdComCan',fld:'PRDCOMCAN',pic:'ZZZ,ZZZ'},{av:'A13881PrdEsCompu',fld:'PRDESCOMPU',pic:''},{av:'A13883PrdComEsCo',fld:'PRDCOMESCO',pic:''}]");
      setEventMetadata("VALID_PRDCOMCOD",",oparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A688PrdComCod',fld:'PRDCOMCOD',pic:''},{av:'A1185PrdComPr',fld:'PRDCOMPR',pic:'ZZZZ9.999'},{av:'A1184PrdComPor',fld:'PRDCOMPOR',pic:'ZZZ9.99'},{av:'A13882PrdComCan',fld:'PRDCOMCAN',pic:'ZZZ,ZZZ'},{av:'h688PrdComCod'},{av:'A13881PrdEsCompu',fld:'PRDESCOMPU',pic:''},{av:'A13883PrdComEsCo',fld:'PRDCOMESCO',pic:''}]}");
      setEventMetadata("VALID_PRDNUM","{handler:'valid_Prdnum',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A688PrdComCod',fld:'PRDCOMCOD',pic:''},{av:'A856ValCod',fld:'VALCOD',pic:'9'},{av:'A718PrdNom',fld:'PRDNOM',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'A13881PrdEsCompu',fld:'PRDESCOMPU',pic:''},{av:'A13883PrdComEsCo',fld:'PRDCOMESCO',pic:''}]");
      setEventMetadata("VALID_PRDNUM",",oparms:[{av:'A1185PrdComPr',fld:'PRDCOMPR',pic:'ZZZZ9.999'},{av:'A1184PrdComPor',fld:'PRDCOMPOR',pic:'ZZZ9.99'},{av:'A13882PrdComCan',fld:'PRDCOMCAN',pic:'ZZZ,ZZZ'},{av:'A718PrdNom',fld:'PRDNOM',pic:''},{av:'A724PrdPreAct',fld:'PRDPREACT',pic:'ZZZZZZZ9.999'},{av:'A1186PrdPrec',fld:'PRDPREC',pic:'ZZZZ9.999'},{av:'A690PrdComFN',fld:'PRDCOMFN',pic:'ZZZ9.99'},{av:'A692PrdComVal',fld:'PRDCOMVAL',pic:'ZZZZ9.999'},{av:'A856ValCod',fld:'VALCOD',pic:'9'},{av:'A857ValDsc',fld:'VALDSC',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z719PrdNum'},{av:'Z688PrdComCod'},{av:'Z1185PrdComPr'},{av:'Z1184PrdComPor'},{av:'Z13882PrdComCan'},{av:'Z718PrdNom'},{av:'Z724PrdPreAct'},{av:'Z1186PrdPrec'},{av:'Z690PrdComFN'},{av:'Z692PrdComVal'},{av:'Z856ValCod'},{av:'Z857ValDsc'},{av:'Z13883PrdComEsCo'},{av:'Z13881PrdEsCompu'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{av:'A13881PrdEsCompu',fld:'PRDESCOMPU',pic:''},{av:'A13883PrdComEsCo',fld:'PRDCOMESCO',pic:''}]}");
      setEventMetadata("VALID_PRDNOM","{handler:'valid_Prdnom',iparms:[{av:'A13881PrdEsCompu',fld:'PRDESCOMPU',pic:''},{av:'A13883PrdComEsCo',fld:'PRDCOMESCO',pic:''}]");
      setEventMetadata("VALID_PRDNOM",",oparms:[{av:'A13881PrdEsCompu',fld:'PRDESCOMPU',pic:''},{av:'A13883PrdComEsCo',fld:'PRDCOMESCO',pic:''}]}");
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
      pr_default.close(24);
      pr_default.close(17);
      pr_default.close(2);
      pr_default.close(22);
      pr_default.close(19);
      pr_default.close(3);
      pr_default.close(25);
      pr_default.close(18);
      pr_default.close(4);
      pr_default.close(23);
      pr_default.close(20);
      pr_default.close(5);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z719PrdNum = "" ;
      Z688PrdComCod = "" ;
      Z1186PrdPrec = DecimalUtil.ZERO ;
      Z690PrdComFN = DecimalUtil.ZERO ;
      Z692PrdComVal = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A13747PrdCDsc = "" ;
      h688PrdComCod = "" ;
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
      A719PrdNum = "" ;
      A718PrdNom = "" ;
      A724PrdPreAct = DecimalUtil.ZERO ;
      A1186PrdPrec = DecimalUtil.ZERO ;
      A690PrdComFN = DecimalUtil.ZERO ;
      A692PrdComVal = DecimalUtil.ZERO ;
      A857ValDsc = "" ;
      A1185PrdComPr = DecimalUtil.ZERO ;
      A1184PrdComPor = DecimalUtil.ZERO ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      Gx_mode = "" ;
      A688PrdComCod = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      Z1185PrdComPr = DecimalUtil.ZERO ;
      Z1184PrdComPor = DecimalUtil.ZERO ;
      Z718PrdNom = "" ;
      Z724PrdPreAct = DecimalUtil.ZERO ;
      Z857ValDsc = "" ;
      T01R410_A718PrdNom = new String[] {""} ;
      T01R410_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01R410_A1186PrdPrec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01R410_A690PrdComFN = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01R410_A692PrdComVal = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01R410_A857ValDsc = new String[] {""} ;
      T01R410_n857ValDsc = new boolean[] {false} ;
      T01R410_A396EmprCod = new String[] {""} ;
      T01R410_A719PrdNum = new String[] {""} ;
      T01R410_A688PrdComCod = new String[] {""} ;
      T01R410_A856ValCod = new byte[1] ;
      T01R410_A1185PrdComPr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01R410_A1184PrdComPor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01R410_A13882PrdComCan = new int[1] ;
      T01R411_A13747PrdCDsc = new String[] {""} ;
      T01R411_A396EmprCod = new String[] {""} ;
      T01R411_A719PrdNum = new String[] {""} ;
      T01R412_A396EmprCod = new String[] {""} ;
      T01R412_A719PrdNum = new String[] {""} ;
      T01R412_A688PrdComCod = new String[] {""} ;
      T01R43_A1186PrdPrec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01R43_A690PrdComFN = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01R43_A692PrdComVal = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01R43_A396EmprCod = new String[] {""} ;
      T01R43_A719PrdNum = new String[] {""} ;
      T01R43_A688PrdComCod = new String[] {""} ;
      sMode79 = "" ;
      T01R413_A396EmprCod = new String[] {""} ;
      T01R413_A719PrdNum = new String[] {""} ;
      T01R413_A688PrdComCod = new String[] {""} ;
      T01R414_A396EmprCod = new String[] {""} ;
      T01R414_A719PrdNum = new String[] {""} ;
      T01R414_A688PrdComCod = new String[] {""} ;
      T01R42_A1186PrdPrec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01R42_A690PrdComFN = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01R42_A692PrdComVal = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01R42_A396EmprCod = new String[] {""} ;
      T01R42_A719PrdNum = new String[] {""} ;
      T01R42_A688PrdComCod = new String[] {""} ;
      T01R418_A396EmprCod = new String[] {""} ;
      T01R418_A719PrdNum = new String[] {""} ;
      T01R418_A688PrdComCod = new String[] {""} ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      gxdynajaxctrlcodr = new com.genexus.internet.StringCollection();
      gxdynajaxctrldescr = new com.genexus.internet.StringCollection();
      gxwrpcisep = "" ;
      l13747PrdCDsc = "" ;
      T01R419_A13747PrdCDsc = new String[] {""} ;
      T01R420_A13747PrdCDsc = new String[] {""} ;
      T01R420_A396EmprCod = new String[] {""} ;
      T01R420_A719PrdNum = new String[] {""} ;
      T01R421_A718PrdNom = new String[] {""} ;
      T01R421_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01R421_A856ValCod = new byte[1] ;
      T01R422_A857ValDsc = new String[] {""} ;
      T01R422_n857ValDsc = new boolean[] {false} ;
      T01R423_A396EmprCod = new String[] {""} ;
      T01R425_A1185PrdComPr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01R425_A1184PrdComPor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01R425_A13882PrdComCan = new int[1] ;
      T01R426_A13747PrdCDsc = new String[] {""} ;
      T01R426_A396EmprCod = new String[] {""} ;
      T01R426_A719PrdNum = new String[] {""} ;
      T01R427_A396EmprCod = new String[] {""} ;
      T01R429_A1185PrdComPr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01R429_A1184PrdComPor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01R429_A13882PrdComCan = new int[1] ;
      Zh688PrdComCod = "" ;
      T01R430_A718PrdNom = new String[] {""} ;
      T01R430_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01R430_A856ValCod = new byte[1] ;
      T01R431_A857ValDsc = new String[] {""} ;
      T01R431_n857ValDsc = new boolean[] {false} ;
      ZZ396EmprCod = "" ;
      ZZ719PrdNum = "" ;
      ZZ688PrdComCod = "" ;
      ZZ1185PrdComPr = DecimalUtil.ZERO ;
      ZZ1184PrdComPor = DecimalUtil.ZERO ;
      ZZ718PrdNom = "" ;
      ZZ724PrdPreAct = DecimalUtil.ZERO ;
      ZZ1186PrdPrec = DecimalUtil.ZERO ;
      ZZ690PrdComFN = DecimalUtil.ZERO ;
      ZZ692PrdComVal = DecimalUtil.ZERO ;
      ZZ857ValDsc = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.lprdcom__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.lprdcom__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.lprdcom__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.lprdcom__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.lprdcom__default(),
         new Object[] {
             new Object[] {
            T01R42_A1186PrdPrec, T01R42_A690PrdComFN, T01R42_A692PrdComVal, T01R42_A396EmprCod, T01R42_A719PrdNum, T01R42_A688PrdComCod
            }
            , new Object[] {
            T01R43_A1186PrdPrec, T01R43_A690PrdComFN, T01R43_A692PrdComVal, T01R43_A396EmprCod, T01R43_A719PrdNum, T01R43_A688PrdComCod
            }
            , new Object[] {
            T01R44_A718PrdNom, T01R44_A724PrdPreAct, T01R44_A856ValCod
            }
            , new Object[] {
            T01R45_A396EmprCod
            }
            , new Object[] {
            T01R46_A857ValDsc, T01R46_n857ValDsc
            }
            , new Object[] {
            T01R48_A1185PrdComPr, T01R48_A1184PrdComPor, T01R48_A13882PrdComCan
            }
            , new Object[] {
            T01R410_A718PrdNom, T01R410_A724PrdPreAct, T01R410_A1186PrdPrec, T01R410_A690PrdComFN, T01R410_A692PrdComVal, T01R410_A857ValDsc, T01R410_n857ValDsc, T01R410_A396EmprCod, T01R410_A719PrdNum, T01R410_A688PrdComCod,
            T01R410_A856ValCod, T01R410_A1185PrdComPr, T01R410_A1184PrdComPor, T01R410_A13882PrdComCan
            }
            , new Object[] {
            T01R411_A13747PrdCDsc, T01R411_A396EmprCod, T01R411_A719PrdNum
            }
            , new Object[] {
            T01R412_A396EmprCod, T01R412_A719PrdNum, T01R412_A688PrdComCod
            }
            , new Object[] {
            T01R413_A396EmprCod, T01R413_A719PrdNum, T01R413_A688PrdComCod
            }
            , new Object[] {
            T01R414_A396EmprCod, T01R414_A719PrdNum, T01R414_A688PrdComCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01R418_A396EmprCod, T01R418_A719PrdNum, T01R418_A688PrdComCod
            }
            , new Object[] {
            T01R419_A13747PrdCDsc
            }
            , new Object[] {
            T01R420_A13747PrdCDsc, T01R420_A396EmprCod, T01R420_A719PrdNum
            }
            , new Object[] {
            T01R421_A718PrdNom, T01R421_A724PrdPreAct, T01R421_A856ValCod
            }
            , new Object[] {
            T01R422_A857ValDsc, T01R422_n857ValDsc
            }
            , new Object[] {
            T01R423_A396EmprCod
            }
            , new Object[] {
            T01R425_A1185PrdComPr, T01R425_A1184PrdComPor, T01R425_A13882PrdComCan
            }
            , new Object[] {
            T01R426_A13747PrdCDsc, T01R426_A396EmprCod, T01R426_A719PrdNum
            }
            , new Object[] {
            T01R427_A396EmprCod
            }
            , new Object[] {
            T01R429_A1185PrdComPr, T01R429_A1184PrdComPor, T01R429_A13882PrdComCan
            }
            , new Object[] {
            T01R430_A718PrdNom, T01R430_A724PrdPreAct, T01R430_A856ValCod
            }
            , new Object[] {
            T01R431_A857ValDsc, T01R431_n857ValDsc
            }
         }
      );
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A856ValCod ;
   private byte Z856ValCod ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private byte ZZ856ValCod ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound79 ;
   private short nIsDirty_79 ;
   private short gxhchits ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtPrdComCod_Enabled ;
   private int edtPrdNum_Enabled ;
   private int edtPrdNom_Enabled ;
   private int edtPrdPreAct_Enabled ;
   private int edtPrdPrec_Enabled ;
   private int edtPrdComFN_Enabled ;
   private int edtPrdComVal_Enabled ;
   private int edtValDsc_Enabled ;
   private int A13882PrdComCan ;
   private int edtPrdComCan_Enabled ;
   private int edtPrdComPr_Enabled ;
   private int edtPrdComPor_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int GX_JID ;
   private int Z13882PrdComCan ;
   private int idxLst ;
   private int gxdynajaxindex ;
   private int ZZ13882PrdComCan ;
   private java.math.BigDecimal Z1186PrdPrec ;
   private java.math.BigDecimal Z690PrdComFN ;
   private java.math.BigDecimal Z692PrdComVal ;
   private java.math.BigDecimal A724PrdPreAct ;
   private java.math.BigDecimal A1186PrdPrec ;
   private java.math.BigDecimal A690PrdComFN ;
   private java.math.BigDecimal A692PrdComVal ;
   private java.math.BigDecimal A1185PrdComPr ;
   private java.math.BigDecimal A1184PrdComPor ;
   private java.math.BigDecimal Z1185PrdComPr ;
   private java.math.BigDecimal Z1184PrdComPor ;
   private java.math.BigDecimal Z724PrdPreAct ;
   private java.math.BigDecimal ZZ1185PrdComPr ;
   private java.math.BigDecimal ZZ1184PrdComPor ;
   private java.math.BigDecimal ZZ724PrdPreAct ;
   private java.math.BigDecimal ZZ1186PrdPrec ;
   private java.math.BigDecimal ZZ690PrdComFN ;
   private java.math.BigDecimal ZZ692PrdComVal ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z719PrdNum ;
   private String Z688PrdComCod ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtPrdComCod_Internalname ;
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
   private String edtPrdComCod_Jsonclick ;
   private String edtPrdNum_Internalname ;
   private String A719PrdNum ;
   private String edtPrdNum_Jsonclick ;
   private String edtPrdNom_Internalname ;
   private String A718PrdNom ;
   private String edtPrdNom_Jsonclick ;
   private String edtPrdPreAct_Internalname ;
   private String edtPrdPreAct_Jsonclick ;
   private String edtPrdPrec_Internalname ;
   private String edtPrdPrec_Jsonclick ;
   private String edtPrdComFN_Internalname ;
   private String edtPrdComFN_Jsonclick ;
   private String edtPrdComVal_Internalname ;
   private String edtPrdComVal_Jsonclick ;
   private String edtValDsc_Internalname ;
   private String A857ValDsc ;
   private String edtValDsc_Jsonclick ;
   private String edtPrdComCan_Internalname ;
   private String edtPrdComCan_Jsonclick ;
   private String edtPrdComPr_Internalname ;
   private String edtPrdComPr_Jsonclick ;
   private String edtPrdComPor_Internalname ;
   private String edtPrdComPor_Jsonclick ;
   private String bttBtn_enter_Internalname ;
   private String bttBtn_enter_Jsonclick ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String bttBtn_delete_Internalname ;
   private String bttBtn_delete_Jsonclick ;
   private String Gx_mode ;
   private String A688PrdComCod ;
   private String hsh ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String Z718PrdNom ;
   private String Z857ValDsc ;
   private String sMode79 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String gxwrpcisep ;
   private String ZZ396EmprCod ;
   private String ZZ719PrdNum ;
   private String ZZ688PrdComCod ;
   private String ZZ718PrdNom ;
   private String ZZ857ValDsc ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean A13881PrdEsCompu ;
   private boolean A13883PrdComEsCo ;
   private boolean n857ValDsc ;
   private boolean Z13883PrdComEsCo ;
   private boolean Z13881PrdEsCompu ;
   private boolean ZZ13883PrdComEsCo ;
   private boolean ZZ13881PrdEsCompu ;
   private String A13747PrdCDsc ;
   private String h688PrdComCod ;
   private String l13747PrdCDsc ;
   private String Zh688PrdComCod ;
   private com.genexus.internet.StringCollection gxdynajaxctrlcodr ;
   private com.genexus.internet.StringCollection gxdynajaxctrldescr ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private ICheckbox chkPrdEsCompu ;
   private ICheckbox chkPrdComEsCo ;
   private IDataStoreProvider pr_default ;
   private String[] T01R410_A718PrdNom ;
   private java.math.BigDecimal[] T01R410_A724PrdPreAct ;
   private java.math.BigDecimal[] T01R410_A1186PrdPrec ;
   private java.math.BigDecimal[] T01R410_A690PrdComFN ;
   private java.math.BigDecimal[] T01R410_A692PrdComVal ;
   private String[] T01R410_A857ValDsc ;
   private boolean[] T01R410_n857ValDsc ;
   private String[] T01R410_A396EmprCod ;
   private String[] T01R410_A719PrdNum ;
   private String[] T01R410_A688PrdComCod ;
   private byte[] T01R410_A856ValCod ;
   private java.math.BigDecimal[] T01R410_A1185PrdComPr ;
   private java.math.BigDecimal[] T01R410_A1184PrdComPor ;
   private int[] T01R410_A13882PrdComCan ;
   private String[] T01R411_A13747PrdCDsc ;
   private String[] T01R411_A396EmprCod ;
   private String[] T01R411_A719PrdNum ;
   private String[] T01R412_A396EmprCod ;
   private String[] T01R412_A719PrdNum ;
   private String[] T01R412_A688PrdComCod ;
   private java.math.BigDecimal[] T01R43_A1186PrdPrec ;
   private java.math.BigDecimal[] T01R43_A690PrdComFN ;
   private java.math.BigDecimal[] T01R43_A692PrdComVal ;
   private String[] T01R43_A396EmprCod ;
   private String[] T01R43_A719PrdNum ;
   private String[] T01R43_A688PrdComCod ;
   private String[] T01R413_A396EmprCod ;
   private String[] T01R413_A719PrdNum ;
   private String[] T01R413_A688PrdComCod ;
   private String[] T01R414_A396EmprCod ;
   private String[] T01R414_A719PrdNum ;
   private String[] T01R414_A688PrdComCod ;
   private java.math.BigDecimal[] T01R42_A1186PrdPrec ;
   private java.math.BigDecimal[] T01R42_A690PrdComFN ;
   private java.math.BigDecimal[] T01R42_A692PrdComVal ;
   private String[] T01R42_A396EmprCod ;
   private String[] T01R42_A719PrdNum ;
   private String[] T01R42_A688PrdComCod ;
   private String[] T01R418_A396EmprCod ;
   private String[] T01R418_A719PrdNum ;
   private String[] T01R418_A688PrdComCod ;
   private String[] T01R419_A13747PrdCDsc ;
   private String[] T01R420_A13747PrdCDsc ;
   private String[] T01R420_A396EmprCod ;
   private String[] T01R420_A719PrdNum ;
   private String[] T01R421_A718PrdNom ;
   private java.math.BigDecimal[] T01R421_A724PrdPreAct ;
   private byte[] T01R421_A856ValCod ;
   private String[] T01R422_A857ValDsc ;
   private boolean[] T01R422_n857ValDsc ;
   private String[] T01R423_A396EmprCod ;
   private java.math.BigDecimal[] T01R425_A1185PrdComPr ;
   private java.math.BigDecimal[] T01R425_A1184PrdComPor ;
   private int[] T01R425_A13882PrdComCan ;
   private String[] T01R426_A13747PrdCDsc ;
   private String[] T01R426_A396EmprCod ;
   private String[] T01R426_A719PrdNum ;
   private String[] T01R427_A396EmprCod ;
   private java.math.BigDecimal[] T01R429_A1185PrdComPr ;
   private java.math.BigDecimal[] T01R429_A1184PrdComPor ;
   private int[] T01R429_A13882PrdComCan ;
   private String[] T01R430_A718PrdNom ;
   private java.math.BigDecimal[] T01R430_A724PrdPreAct ;
   private byte[] T01R430_A856ValCod ;
   private String[] T01R431_A857ValDsc ;
   private boolean[] T01R431_n857ValDsc ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private String[] T01R44_A718PrdNom ;
   private java.math.BigDecimal[] T01R44_A724PrdPreAct ;
   private byte[] T01R44_A856ValCod ;
   private String[] T01R45_A396EmprCod ;
   private String[] T01R46_A857ValDsc ;
   private java.math.BigDecimal[] T01R48_A1185PrdComPr ;
   private java.math.BigDecimal[] T01R48_A1184PrdComPor ;
   private int[] T01R48_A13882PrdComCan ;
   private boolean[] T01R46_n857ValDsc ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class lprdcom__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class lprdcom__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class lprdcom__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class lprdcom__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class lprdcom__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01R42", "SELECT PrdPrec, PrdComFN, PrdComVal, EmprCod, PrdNum, PrdComCod FROM TXPLPRDCO WHERE EmprCod = ? AND PrdNum = ? AND PrdComCod = ?  FOR UPDATE OF PrdPrec, PrdComFN, PrdComVal NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01R43", "SELECT PrdPrec, PrdComFN, PrdComVal, EmprCod, PrdNum, PrdComCod FROM TXPLPRDCO WHERE EmprCod = ? AND PrdNum = ? AND PrdComCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01R44", "SELECT PrdNom, PrdPreAct, ValCod FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01R45", "SELECT EmprCod FROM TXPCPRDCO WHERE EmprCod = ? AND PrdComCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01R46", "SELECT ValDsc FROM TXPTIPVAL WHERE EmprCod = ? AND ValCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01R48", "SELECT COALESCE( T1.PrdComPr, 0) AS PrdComPr, COALESCE( T1.PrdComPor, 0) AS PrdComPor, COALESCE( T1.PrdComCan, 0) AS PrdComCan FROM (SELECT SUM(PrdComVal) AS PrdComPr, EmprCod, PrdComCod, SUM(PrdComFN) AS PrdComPor, COUNT(*) AS PrdComCan FROM TXPLPRDCO GROUP BY EmprCod, PrdComCod ) T1 WHERE T1.EmprCod = ? AND T1.PrdComCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01R410", "SELECT /*+ FIRST_ROWS(100) */ T3.PrdNom, T3.PrdPreAct, TM1.PrdPrec, TM1.PrdComFN, TM1.PrdComVal, T4.ValDsc, TM1.EmprCod, TM1.PrdNum, TM1.PrdComCod, T3.ValCod, COALESCE( T2.PrdComPr, 0) AS PrdComPr, COALESCE( T2.PrdComPor, 0) AS PrdComPor, COALESCE( T2.PrdComCan, 0) AS PrdComCan FROM (((TXPLPRDCO TM1 LEFT JOIN (SELECT SUM(TM1.PrdComVal) AS PrdComPr, TM1.EmprCod, TM1.PrdComCod, SUM(TM1.PrdComFN) AS PrdComPor, COUNT(*) AS PrdComCan FROM TXPLPRDCO TM1 GROUP BY TM1.EmprCod, TM1.PrdComCod ) T2 ON T2.EmprCod = TM1.EmprCod AND T2.PrdComCod = TM1.PrdComCod) INNER JOIN TXPPRODUC T3 ON T3.EmprCod = TM1.EmprCod AND T3.PrdNum = TM1.PrdNum) LEFT JOIN TXPTIPVAL T4 ON T4.EmprCod = TM1.EmprCod AND T4.ValCod = T3.ValCod) WHERE TM1.EmprCod = ? and TM1.PrdNum = ? and TM1.PrdComCod = ? ORDER BY TM1.EmprCod, TM1.PrdNum, TM1.PrdComCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01R411", "SELECT RTRIM(LTRIM(PrdNum)) || ' - ' || RTRIM(LTRIM(PrdNom)) AS PrdCDsc, EmprCod, PrdNum FROM TXPPRODUC WHERE (EmprCod = ?) AND (SUBSTR(PrdNum, 1, 1) = '0') AND (PrdNum = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01R412", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, PrdNum, PrdComCod FROM TXPLPRDCO WHERE EmprCod = ? AND PrdNum = ? AND PrdComCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01R413", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, PrdNum, PrdComCod FROM TXPLPRDCO WHERE ( EmprCod > ? or EmprCod = ? and PrdNum > ? or PrdNum = ? and EmprCod = ? and PrdComCod > ?) ORDER BY EmprCod, PrdNum, PrdComCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01R414", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, PrdNum, PrdComCod FROM TXPLPRDCO WHERE ( EmprCod < ? or EmprCod = ? and PrdNum < ? or PrdNum = ? and EmprCod = ? and PrdComCod < ?) ORDER BY EmprCod DESC, PrdNum DESC, PrdComCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01R415", "INSERT INTO TXPLPRDCO(PrdPrec, PrdComFN, PrdComVal, EmprCod, PrdNum, PrdComCod) VALUES(?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPLPRDCO")
         ,new UpdateCursor("T01R416", "UPDATE TXPLPRDCO SET PrdPrec=?, PrdComFN=?, PrdComVal=?  WHERE EmprCod = ? AND PrdNum = ? AND PrdComCod = ?", GX_NOMASK, "TXPLPRDCO")
         ,new UpdateCursor("T01R417", "DELETE FROM TXPLPRDCO  WHERE EmprCod = ? AND PrdNum = ? AND PrdComCod = ?", GX_NOMASK, "TXPLPRDCO")
         ,new ForEachCursor("T01R418", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, PrdNum, PrdComCod FROM TXPLPRDCO ORDER BY EmprCod, PrdNum, PrdComCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01R419", "SELECT * FROM (SELECT DISTINCT RTRIM(LTRIM(PrdNum)) || ' - ' || RTRIM(LTRIM(PrdNom)) AS PrdCDsc FROM TXPPRODUC WHERE (EmprCod = ?) AND (UPPER(RTRIM(LTRIM(PrdNum)) || ' - ' || RTRIM(LTRIM(PrdNom))) like '%' || UPPER(?)) AND (SUBSTR(PrdNum, 1, 1) = '0')) WHERE rownum <= 5 ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01R420", "SELECT RTRIM(LTRIM(PrdNum)) || ' - ' || RTRIM(LTRIM(PrdNom)) AS PrdCDsc, EmprCod, PrdNum FROM TXPPRODUC WHERE (RTRIM(LTRIM(PrdNum)) || ' - ' || RTRIM(LTRIM(PrdNom)) = ?) AND (EmprCod = ?) AND (SUBSTR(PrdNum, 1, 1) = '0') ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01R421", "SELECT PrdNom, PrdPreAct, ValCod FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01R422", "SELECT ValDsc FROM TXPTIPVAL WHERE EmprCod = ? AND ValCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01R423", "SELECT EmprCod FROM TXPCPRDCO WHERE EmprCod = ? AND PrdComCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01R425", "SELECT COALESCE( T1.PrdComPr, 0) AS PrdComPr, COALESCE( T1.PrdComPor, 0) AS PrdComPor, COALESCE( T1.PrdComCan, 0) AS PrdComCan FROM (SELECT SUM(PrdComVal) AS PrdComPr, EmprCod, PrdComCod, SUM(PrdComFN) AS PrdComPor, COUNT(*) AS PrdComCan FROM TXPLPRDCO GROUP BY EmprCod, PrdComCod ) T1 WHERE T1.EmprCod = ? AND T1.PrdComCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01R426", "SELECT /*+ FIRST_ROWS */ RTRIM(LTRIM(PrdNum)) || ' - ' || RTRIM(LTRIM(PrdNom)) AS PrdCDsc, EmprCod, PrdNum FROM TXPPRODUC WHERE (RTRIM(LTRIM(PrdNum)) || ' - ' || RTRIM(LTRIM(PrdNom)) = ?) AND (EmprCod = ?) AND (SUBSTR(PrdNum, 1, 1) = '0') ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01R427", "SELECT EmprCod FROM TXPCPRDCO WHERE EmprCod = ? AND PrdComCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01R429", "SELECT COALESCE( T1.PrdComPr, 0) AS PrdComPr, COALESCE( T1.PrdComPor, 0) AS PrdComPor, COALESCE( T1.PrdComCan, 0) AS PrdComCan FROM (SELECT SUM(PrdComVal) AS PrdComPr, EmprCod, PrdComCod, SUM(PrdComFN) AS PrdComPor, COUNT(*) AS PrdComCan FROM TXPLPRDCO GROUP BY EmprCod, PrdComCod ) T1 WHERE T1.EmprCod = ? AND T1.PrdComCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01R430", "SELECT PrdNom, PrdPreAct, ValCod FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01R431", "SELECT ValDsc FROM TXPTIPVAL WHERE EmprCod = ? AND ValCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,5);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               return;
            case 1 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,5);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,5);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,5);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,5);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,5);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 3);
               ((String[]) buf[8])[0] = rslt.getString(8, 6);
               ((String[]) buf[9])[0] = rslt.getString(9, 6);
               ((byte[]) buf[10])[0] = rslt.getByte(10);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(11,5);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(12,2);
               ((int[]) buf[13])[0] = rslt.getInt(13);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,5);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 20 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,5);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 23 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,5);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,5);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
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
               stmt.setString(2, (String)parms[1], 6);
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
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
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setString(4, (String)parms[3], 6);
               stmt.setString(5, (String)parms[4], 3);
               stmt.setString(6, (String)parms[5], 6);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setString(4, (String)parms[3], 6);
               stmt.setString(5, (String)parms[4], 3);
               stmt.setString(6, (String)parms[5], 6);
               return;
            case 11 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 5);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 5);
               stmt.setString(4, (String)parms[3], 3);
               stmt.setString(5, (String)parms[4], 6);
               stmt.setString(6, (String)parms[5], 6);
               return;
            case 12 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 5);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 5);
               stmt.setString(4, (String)parms[3], 3);
               stmt.setString(5, (String)parms[4], 6);
               stmt.setString(6, (String)parms[5], 6);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setVarchar(2, (String)parms[1], 60);
               return;
            case 16 :
               stmt.setVarchar(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 21 :
               stmt.setVarchar(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
      }
   }

}

