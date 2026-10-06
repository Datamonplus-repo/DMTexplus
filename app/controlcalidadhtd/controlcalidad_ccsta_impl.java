package app.controlcalidadhtd ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class controlcalidad_ccsta_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_2") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_2( A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_3") == 0 )
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
         gxload_3( A396EmprCod, A252CliCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_4") == 0 )
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
         gxload_4( A396EmprCod, A252CliCod, A65ArtCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_5") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A4031CCTCod = (int)(GXutil.lval( httpContext.GetPar( "CCTCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_5( A396EmprCod, A4031CCTCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_7") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A65ArtCod = httpContext.GetPar( "ArtCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
         A4058CCFColNom = httpContext.GetPar( "CCFColNom") ;
         httpContext.ajax_rsp_assign_attri("", false, "A4058CCFColNom", A4058CCFColNom);
         A4059CCFColNum = (int)(GXutil.lval( httpContext.GetPar( "CCFColNum"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4059CCFColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4059CCFColNum), 6, 0));
         A4031CCTCod = (int)(GXutil.lval( httpContext.GetPar( "CCTCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_7( A396EmprCod, A252CliCod, A65ArtCod, A4058CCFColNom, A4059CCFColNum, A4031CCTCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_6") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A4031CCTCod = (int)(GXutil.lval( httpContext.GetPar( "CCTCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
         A4034CCTLin = (short)(GXutil.lval( httpContext.GetPar( "CCTLin"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4034CCTLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4034CCTLin), 4, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_6( A396EmprCod, A4031CCTCod, A4034CCTLin) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Valores Estandars", ""), (short)(0)) ;
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

   public controlcalidad_ccsta_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public controlcalidad_ccsta_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( controlcalidad_ccsta_impl.class ));
   }

   public controlcalidad_ccsta_impl( int remoteHandle ,
                                     ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbCCTLinTpoD = new HTMLChoice();
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
      if ( cmbCCTLinTpoD.getItemCount() > 0 )
      {
         A4044CCTLinTpoD = cmbCCTLinTpoD.getValidValue(A4044CCTLinTpoD) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4044CCTLinTpoD", A4044CCTLinTpoD);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbCCTLinTpoD.setValue( GXutil.rtrim( A4044CCTLinTpoD) );
         httpContext.ajax_rsp_assign_prop("", false, cmbCCTLinTpoD.getInternalname(), "Values", cmbCCTLinTpoD.ToJavascriptSource(), true);
      }
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, httpContext.getMessage( "Valores Estandars", ""), "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, 0, (short)(0), "HLP_ControlCalidadHTD\\ControlCalidad_CCSTA.htm");
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ControlCalidadHTD\\ControlCalidad_CCSTA.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
      ClassString = "BtnPrevious" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ControlCalidadHTD\\ControlCalidad_CCSTA.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      ClassString = "BtnNext" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ControlCalidadHTD\\ControlCalidad_CCSTA.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
      ClassString = "BtnLast" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ControlCalidadHTD\\ControlCalidad_CCSTA.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
      ClassString = "BtnSelect" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_ControlCalidadHTD\\ControlCalidad_CCSTA.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,34);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\ControlCalidad_CCSTA.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\ControlCalidad_CCSTA.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,44);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\ControlCalidad_CCSTA.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliNom_Internalname, GXutil.rtrim( A279CliNom), GXutil.rtrim( localUtil.format( A279CliNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliNom_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtCliNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\ControlCalidad_CCSTA.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtArtCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtArtCod_Internalname, httpContext.getMessage( "Código Artículo", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtCod_Internalname, GXutil.rtrim( A65ArtCod), GXutil.rtrim( localUtil.format( A65ArtCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,54);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtArtCod_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\ControlCalidad_CCSTA.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtArtDsc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtArtDsc_Internalname, httpContext.getMessage( "Artículo", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtDsc_Internalname, GXutil.rtrim( A69ArtDsc), GXutil.rtrim( localUtil.format( A69ArtDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtDsc_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtArtDsc_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\ControlCalidad_CCSTA.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCCFColNom_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCCFColNom_Internalname, httpContext.getMessage( "Nombre del Color", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCCFColNom_Internalname, GXutil.rtrim( A4058CCFColNom), GXutil.rtrim( localUtil.format( A4058CCFColNom, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,64);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCCFColNom_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtCCFColNom_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\ControlCalidad_CCSTA.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCCFColNum_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCCFColNum_Internalname, httpContext.getMessage( "Número del Color", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCCFColNum_Internalname, GXutil.ltrim( localUtil.ntoc( A4059CCFColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCCFColNum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4059CCFColNum), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4059CCFColNum), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,69);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCCFColNum_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtCCFColNum_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\ControlCalidad_CCSTA.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCCTCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCCTCod_Internalname, httpContext.getMessage( "Código", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCCTCod_Internalname, GXutil.ltrim( localUtil.ntoc( A4031CCTCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCCTCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4031CCTCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4031CCTCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,74);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCCTCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtCCTCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\ControlCalidad_CCSTA.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCCTDsc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCCTDsc_Internalname, httpContext.getMessage( "Descripción del Test", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCCTDsc_Internalname, GXutil.rtrim( A4036CCTDsc), GXutil.rtrim( localUtil.format( A4036CCTDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCCTDsc_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtCCTDsc_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\ControlCalidad_CCSTA.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCCTLin_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCCTLin_Internalname, httpContext.getMessage( "# Lín", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 84,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCCTLin_Internalname, GXutil.ltrim( localUtil.ntoc( A4034CCTLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCCTLin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4034CCTLin), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4034CCTLin), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,84);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCCTLin_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtCCTLin_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\ControlCalidad_CCSTA.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCCTLinDsc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCCTLinDsc_Internalname, httpContext.getMessage( "Descripción", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCCTLinDsc_Internalname, GXutil.rtrim( A4043CCTLinDsc), GXutil.rtrim( localUtil.format( A4043CCTLinDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCCTLinDsc_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtCCTLinDsc_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\ControlCalidad_CCSTA.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbCCTLinTpoD.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, cmbCCTLinTpoD.getInternalname(), httpContext.getMessage( "Tipo de Datos", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbCCTLinTpoD, cmbCCTLinTpoD.getInternalname(), GXutil.rtrim( A4044CCTLinTpoD), 1, cmbCCTLinTpoD.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbCCTLinTpoD.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "Attribute", "", "", "", "", true, (byte)(0), "HLP_ControlCalidadHTD\\ControlCalidad_CCSTA.htm");
      cmbCCTLinTpoD.setValue( GXutil.rtrim( A4044CCTLinTpoD) );
      httpContext.ajax_rsp_assign_prop("", false, cmbCCTLinTpoD.getInternalname(), "Values", cmbCCTLinTpoD.ToJavascriptSource(), true);
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCCTLinLgoD_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCCTLinLgoD_Internalname, httpContext.getMessage( "Largo del Dato", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCCTLinLgoD_Internalname, GXutil.ltrim( localUtil.ntoc( A4045CCTLinLgoD, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCCTLinLgoD_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4045CCTLinLgoD), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4045CCTLinLgoD), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCCTLinLgoD_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtCCTLinLgoD_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\ControlCalidad_CCSTA.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCCTLinPict_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCCTLinPict_Internalname, httpContext.getMessage( "Picture", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCCTLinPict_Internalname, GXutil.rtrim( A4046CCTLinPict), GXutil.rtrim( localUtil.format( A4046CCTLinPict, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCCTLinPict_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtCCTLinPict_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\ControlCalidad_CCSTA.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCCSVal_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCCSVal_Internalname, httpContext.getMessage( "Valor Standar", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 109,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCCSVal_Internalname, GXutil.rtrim( A4060CCSVal), GXutil.rtrim( localUtil.format( A4060CCSVal, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,109);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCCSVal_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtCCSVal_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\ControlCalidad_CCSTA.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCCSMin_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCCSMin_Internalname, httpContext.getMessage( "Valor Mínimo", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 114,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCCSMin_Internalname, GXutil.rtrim( A11482CCSMin), GXutil.rtrim( localUtil.format( A11482CCSMin, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,114);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCCSMin_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtCCSMin_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\ControlCalidad_CCSTA.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCCSMax_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCCSMax_Internalname, httpContext.getMessage( "Valor Máximo", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 119,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCCSMax_Internalname, GXutil.rtrim( A11483CCSMax), GXutil.rtrim( localUtil.format( A11483CCSMax, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,119);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCCSMax_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtCCSMax_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\ControlCalidad_CCSTA.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCCSAuto_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCCSAuto_Internalname, httpContext.getMessage( "Auto", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 124,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCCSAuto_Internalname, GXutil.ltrim( localUtil.ntoc( A11530CCSAuto, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCCSAuto_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11530CCSAuto), "9") : localUtil.format( DecimalUtil.doubleToDec(A11530CCSAuto), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,124);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCCSAuto_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtCCSAuto_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\ControlCalidad_CCSTA.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCCSVCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCCSVCod_Internalname, httpContext.getMessage( "Variable", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 129,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCCSVCod_Internalname, GXutil.rtrim( A11531CCSVCod), GXutil.rtrim( localUtil.format( A11531CCSVCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,129);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCCSVCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtCCSVCod_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\ControlCalidad_CCSTA.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCCSVTol_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCCSVTol_Internalname, httpContext.getMessage( "Tolerancia", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 134,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCCSVTol_Internalname, GXutil.ltrim( localUtil.ntoc( A11532CCSVTol, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCCSVTol_Enabled!=0) ? localUtil.format( A11532CCSVTol, "Z9.99") : localUtil.format( A11532CCSVTol, "Z9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,134);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCCSVTol_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtCCSVTol_Enabled, 0, "text", "", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\ControlCalidad_CCSTA.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCCSMetodo_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCCSMetodo_Internalname, httpContext.getMessage( "Metodo", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 139,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCCSMetodo_Internalname, GXutil.rtrim( A13247CCSMetodo), GXutil.rtrim( localUtil.format( A13247CCSMetodo, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,139);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCCSMetodo_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtCCSMetodo_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\ControlCalidad_CCSTA.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCCSEspecif_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCCSEspecif_Internalname, httpContext.getMessage( "Especificacion", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 144,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCCSEspecif_Internalname, GXutil.rtrim( A13248CCSEspecif), GXutil.rtrim( localUtil.format( A13248CCSEspecif, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,144);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCCSEspecif_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtCCSEspecif_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\ControlCalidad_CCSTA.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 149,'',false,'',0)\"" ;
      ClassString = "BtnEnter" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ControlCalidadHTD\\ControlCalidad_CCSTA.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 151,'',false,'',0)\"" ;
      ClassString = "BtnCancel" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ControlCalidadHTD\\ControlCalidad_CCSTA.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 153,'',false,'',0)\"" ;
      ClassString = "BtnDelete" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ControlCalidadHTD\\ControlCalidad_CCSTA.htm");
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
         Z252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z252CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z65ArtCod = httpContext.cgiGet( "Z65ArtCod") ;
         Z4058CCFColNom = httpContext.cgiGet( "Z4058CCFColNom") ;
         Z4059CCFColNum = (int)(localUtil.ctol( httpContext.cgiGet( "Z4059CCFColNum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z4031CCTCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z4031CCTCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z4034CCTLin = (short)(localUtil.ctol( httpContext.cgiGet( "Z4034CCTLin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z4060CCSVal = httpContext.cgiGet( "Z4060CCSVal") ;
         Z11482CCSMin = httpContext.cgiGet( "Z11482CCSMin") ;
         Z11483CCSMax = httpContext.cgiGet( "Z11483CCSMax") ;
         Z11530CCSAuto = (byte)(localUtil.ctol( httpContext.cgiGet( "Z11530CCSAuto"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z11531CCSVCod = httpContext.cgiGet( "Z11531CCSVCod") ;
         Z11532CCSVTol = localUtil.ctond( httpContext.cgiGet( "Z11532CCSVTol")) ;
         Z13247CCSMetodo = httpContext.cgiGet( "Z13247CCSMetodo") ;
         Z13248CCSEspecif = httpContext.cgiGet( "Z13248CCSEspecif") ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
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
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         }
         else
         {
            A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         }
         A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A65ArtCod = httpContext.cgiGet( edtArtCod_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
         A69ArtDsc = httpContext.cgiGet( edtArtDsc_Internalname) ;
         n69ArtDsc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", A69ArtDsc);
         A4058CCFColNom = httpContext.cgiGet( edtCCFColNom_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4058CCFColNom", A4058CCFColNom);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCCFColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCCFColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CCFCOLNUM");
            AnyError = (short)(1) ;
            GX_FocusControl = edtCCFColNum_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A4059CCFColNum = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A4059CCFColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4059CCFColNum), 6, 0));
         }
         else
         {
            A4059CCFColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtCCFColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4059CCFColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4059CCFColNum), 6, 0));
         }
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
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCCTLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCCTLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CCTLIN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtCCTLin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A4034CCTLin = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4034CCTLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4034CCTLin), 4, 0));
         }
         else
         {
            A4034CCTLin = (short)(localUtil.ctol( httpContext.cgiGet( edtCCTLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4034CCTLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4034CCTLin), 4, 0));
         }
         A4043CCTLinDsc = httpContext.cgiGet( edtCCTLinDsc_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4043CCTLinDsc", A4043CCTLinDsc);
         cmbCCTLinTpoD.setValue( httpContext.cgiGet( cmbCCTLinTpoD.getInternalname()) );
         A4044CCTLinTpoD = httpContext.cgiGet( cmbCCTLinTpoD.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4044CCTLinTpoD", A4044CCTLinTpoD);
         A4045CCTLinLgoD = (short)(localUtil.ctol( httpContext.cgiGet( edtCCTLinLgoD_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4045CCTLinLgoD", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4045CCTLinLgoD), 3, 0));
         A4046CCTLinPict = httpContext.cgiGet( edtCCTLinPict_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4046CCTLinPict", A4046CCTLinPict);
         A4060CCSVal = httpContext.cgiGet( edtCCSVal_Internalname) ;
         n4060CCSVal = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4060CCSVal", A4060CCSVal);
         A11482CCSMin = httpContext.cgiGet( edtCCSMin_Internalname) ;
         n11482CCSMin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11482CCSMin", A11482CCSMin);
         A11483CCSMax = httpContext.cgiGet( edtCCSMax_Internalname) ;
         n11483CCSMax = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11483CCSMax", A11483CCSMax);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCCSAuto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCCSAuto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CCSAUTO");
            AnyError = (short)(1) ;
            GX_FocusControl = edtCCSAuto_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A11530CCSAuto = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11530CCSAuto", GXutil.str( A11530CCSAuto, 1, 0));
         }
         else
         {
            A11530CCSAuto = (byte)(localUtil.ctol( httpContext.cgiGet( edtCCSAuto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11530CCSAuto", GXutil.str( A11530CCSAuto, 1, 0));
         }
         A11531CCSVCod = httpContext.cgiGet( edtCCSVCod_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A11531CCSVCod", A11531CCSVCod);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtCCSVTol_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtCCSVTol_Internalname)), DecimalUtil.stringToDec("99.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CCSVTOL");
            AnyError = (short)(1) ;
            GX_FocusControl = edtCCSVTol_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A11532CCSVTol = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A11532CCSVTol", GXutil.ltrimstr( A11532CCSVTol, 5, 2));
         }
         else
         {
            A11532CCSVTol = localUtil.ctond( httpContext.cgiGet( edtCCSVTol_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11532CCSVTol", GXutil.ltrimstr( A11532CCSVTol, 5, 2));
         }
         A13247CCSMetodo = httpContext.cgiGet( edtCCSMetodo_Internalname) ;
         n13247CCSMetodo = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13247CCSMetodo", A13247CCSMetodo);
         A13248CCSEspecif = httpContext.cgiGet( edtCCSEspecif_Internalname) ;
         n13248CCSEspecif = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13248CCSEspecif", A13248CCSEspecif);
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
            A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A65ArtCod = httpContext.GetPar( "ArtCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
            A4058CCFColNom = httpContext.GetPar( "CCFColNom") ;
            httpContext.ajax_rsp_assign_attri("", false, "A4058CCFColNom", A4058CCFColNom);
            A4059CCFColNum = (int)(GXutil.lval( httpContext.GetPar( "CCFColNum"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4059CCFColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4059CCFColNum), 6, 0));
            A4031CCTCod = (int)(GXutil.lval( httpContext.GetPar( "CCTCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
            A4034CCTLin = (short)(GXutil.lval( httpContext.GetPar( "CCTLin"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4034CCTLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4034CCTLin), 4, 0));
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
            initAll1VO629( ) ;
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
      disableAttributes1VO629( ) ;
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

   public void resetCaption1VO0( )
   {
   }

   public void zm1VO629( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z4060CCSVal = T01VO3_A4060CCSVal[0] ;
            Z11482CCSMin = T01VO3_A11482CCSMin[0] ;
            Z11483CCSMax = T01VO3_A11483CCSMax[0] ;
            Z11530CCSAuto = T01VO3_A11530CCSAuto[0] ;
            Z11531CCSVCod = T01VO3_A11531CCSVCod[0] ;
            Z11532CCSVTol = T01VO3_A11532CCSVTol[0] ;
            Z13247CCSMetodo = T01VO3_A13247CCSMetodo[0] ;
            Z13248CCSEspecif = T01VO3_A13248CCSEspecif[0] ;
         }
         else
         {
            Z4060CCSVal = A4060CCSVal ;
            Z11482CCSMin = A11482CCSMin ;
            Z11483CCSMax = A11483CCSMax ;
            Z11530CCSAuto = A11530CCSAuto ;
            Z11531CCSVCod = A11531CCSVCod ;
            Z11532CCSVTol = A11532CCSVTol ;
            Z13247CCSMetodo = A13247CCSMetodo ;
            Z13248CCSEspecif = A13248CCSEspecif ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z4060CCSVal = A4060CCSVal ;
         Z11482CCSMin = A11482CCSMin ;
         Z11483CCSMax = A11483CCSMax ;
         Z11530CCSAuto = A11530CCSAuto ;
         Z11531CCSVCod = A11531CCSVCod ;
         Z11532CCSVTol = A11532CCSVTol ;
         Z13247CCSMetodo = A13247CCSMetodo ;
         Z13248CCSEspecif = A13248CCSEspecif ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z65ArtCod = A65ArtCod ;
         Z4031CCTCod = A4031CCTCod ;
         Z4034CCTLin = A4034CCTLin ;
         Z4058CCFColNom = A4058CCFColNom ;
         Z4059CCFColNum = A4059CCFColNum ;
         Z407EmprNom = A407EmprNom ;
         Z279CliNom = A279CliNom ;
         Z69ArtDsc = A69ArtDsc ;
         Z4036CCTDsc = A4036CCTDsc ;
         Z4043CCTLinDsc = A4043CCTLinDsc ;
         Z4044CCTLinTpoD = A4044CCTLinTpoD ;
         Z4045CCTLinLgoD = A4045CCTLinLgoD ;
         Z4046CCTLinPict = A4046CCTLinPict ;
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

   public void load1VO629( )
   {
      /* Using cursor T01VO10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin), A4058CCFColNom, Integer.valueOf(A4059CCFColNum)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound629 = (short)(1) ;
         A407EmprNom = T01VO10_A407EmprNom[0] ;
         n407EmprNom = T01VO10_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A279CliNom = T01VO10_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A69ArtDsc = T01VO10_A69ArtDsc[0] ;
         n69ArtDsc = T01VO10_n69ArtDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", A69ArtDsc);
         A4036CCTDsc = T01VO10_A4036CCTDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4036CCTDsc", A4036CCTDsc);
         A4043CCTLinDsc = T01VO10_A4043CCTLinDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4043CCTLinDsc", A4043CCTLinDsc);
         A4044CCTLinTpoD = T01VO10_A4044CCTLinTpoD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4044CCTLinTpoD", A4044CCTLinTpoD);
         A4045CCTLinLgoD = T01VO10_A4045CCTLinLgoD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4045CCTLinLgoD", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4045CCTLinLgoD), 3, 0));
         A4046CCTLinPict = T01VO10_A4046CCTLinPict[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4046CCTLinPict", A4046CCTLinPict);
         A4060CCSVal = T01VO10_A4060CCSVal[0] ;
         n4060CCSVal = T01VO10_n4060CCSVal[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4060CCSVal", A4060CCSVal);
         A11482CCSMin = T01VO10_A11482CCSMin[0] ;
         n11482CCSMin = T01VO10_n11482CCSMin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11482CCSMin", A11482CCSMin);
         A11483CCSMax = T01VO10_A11483CCSMax[0] ;
         n11483CCSMax = T01VO10_n11483CCSMax[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11483CCSMax", A11483CCSMax);
         A11530CCSAuto = T01VO10_A11530CCSAuto[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11530CCSAuto", GXutil.str( A11530CCSAuto, 1, 0));
         A11531CCSVCod = T01VO10_A11531CCSVCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11531CCSVCod", A11531CCSVCod);
         A11532CCSVTol = T01VO10_A11532CCSVTol[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11532CCSVTol", GXutil.ltrimstr( A11532CCSVTol, 5, 2));
         A13247CCSMetodo = T01VO10_A13247CCSMetodo[0] ;
         n13247CCSMetodo = T01VO10_n13247CCSMetodo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13247CCSMetodo", A13247CCSMetodo);
         A13248CCSEspecif = T01VO10_A13248CCSEspecif[0] ;
         n13248CCSEspecif = T01VO10_n13248CCSEspecif[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13248CCSEspecif", A13248CCSEspecif);
         zm1VO629( -1) ;
      }
      pr_default.close(8);
      onLoadActions1VO629( ) ;
   }

   public void onLoadActions1VO629( )
   {
   }

   public void checkExtendedTable1VO629( )
   {
      nIsDirty_629 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01VO4 */
      pr_default.execute(2, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01VO4_A407EmprNom[0] ;
      n407EmprNom = T01VO4_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(2);
      /* Using cursor T01VO5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T01VO5_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(3);
      /* Using cursor T01VO6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ARTICU", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ARTCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A69ArtDsc = T01VO6_A69ArtDsc[0] ;
      n69ArtDsc = T01VO6_n69ArtDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", A69ArtDsc);
      pr_default.close(4);
      /* Using cursor T01VO7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CCDef", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CCTCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A4036CCTDsc = T01VO7_A4036CCTDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A4036CCTDsc", A4036CCTDsc);
      pr_default.close(5);
      /* Using cursor T01VO9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A4058CCFColNom, Integer.valueOf(A4059CCFColNum), Integer.valueOf(A4031CCTCod)});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CCSer1", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CCTCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(7);
      /* Using cursor T01VO8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin)});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CCDef1", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CCTLIN");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A4043CCTLinDsc = T01VO8_A4043CCTLinDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A4043CCTLinDsc", A4043CCTLinDsc);
      A4044CCTLinTpoD = T01VO8_A4044CCTLinTpoD[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A4044CCTLinTpoD", A4044CCTLinTpoD);
      A4045CCTLinLgoD = T01VO8_A4045CCTLinLgoD[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A4045CCTLinLgoD", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4045CCTLinLgoD), 3, 0));
      A4046CCTLinPict = T01VO8_A4046CCTLinPict[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A4046CCTLinPict", A4046CCTLinPict);
      pr_default.close(6);
   }

   public void closeExtendedTableCursors1VO629( )
   {
      pr_default.close(2);
      pr_default.close(3);
      pr_default.close(4);
      pr_default.close(5);
      pr_default.close(7);
      pr_default.close(6);
   }

   public void enableDisable( )
   {
   }

   public void gxload_2( String A396EmprCod )
   {
      /* Using cursor T01VO11 */
      pr_default.execute(9, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(9) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01VO11_A407EmprNom[0] ;
      n407EmprNom = T01VO11_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A407EmprNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(9) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(9);
   }

   public void gxload_3( String A396EmprCod ,
                         int A252CliCod )
   {
      /* Using cursor T01VO12 */
      pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(10) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T01VO12_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A279CliNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(10) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(10);
   }

   public void gxload_4( String A396EmprCod ,
                         int A252CliCod ,
                         String A65ArtCod )
   {
      /* Using cursor T01VO13 */
      pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
      if ( (pr_default.getStatus(11) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ARTICU", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ARTCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A69ArtDsc = T01VO13_A69ArtDsc[0] ;
      n69ArtDsc = T01VO13_n69ArtDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", A69ArtDsc);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A69ArtDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(11) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(11);
   }

   public void gxload_5( String A396EmprCod ,
                         int A4031CCTCod )
   {
      /* Using cursor T01VO14 */
      pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod)});
      if ( (pr_default.getStatus(12) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CCDef", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CCTCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A4036CCTDsc = T01VO14_A4036CCTDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A4036CCTDsc", A4036CCTDsc);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A4036CCTDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(12) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(12);
   }

   public void gxload_7( String A396EmprCod ,
                         int A252CliCod ,
                         String A65ArtCod ,
                         String A4058CCFColNom ,
                         int A4059CCFColNum ,
                         int A4031CCTCod )
   {
      /* Using cursor T01VO15 */
      pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A4058CCFColNom, Integer.valueOf(A4059CCFColNum), Integer.valueOf(A4031CCTCod)});
      if ( (pr_default.getStatus(13) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CCSer1", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CCTCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_default.getStatus(13) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(13);
   }

   public void gxload_6( String A396EmprCod ,
                         int A4031CCTCod ,
                         short A4034CCTLin )
   {
      /* Using cursor T01VO16 */
      pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin)});
      if ( (pr_default.getStatus(14) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CCDef1", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CCTLIN");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A4043CCTLinDsc = T01VO16_A4043CCTLinDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A4043CCTLinDsc", A4043CCTLinDsc);
      A4044CCTLinTpoD = T01VO16_A4044CCTLinTpoD[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A4044CCTLinTpoD", A4044CCTLinTpoD);
      A4045CCTLinLgoD = T01VO16_A4045CCTLinLgoD[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A4045CCTLinLgoD", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4045CCTLinLgoD), 3, 0));
      A4046CCTLinPict = T01VO16_A4046CCTLinPict[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A4046CCTLinPict", A4046CCTLinPict);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A4043CCTLinDsc))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A4044CCTLinTpoD))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A4045CCTLinLgoD, (byte)(3), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A4046CCTLinPict))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(14) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(14);
   }

   public void getKey1VO629( )
   {
      /* Using cursor T01VO17 */
      pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A4058CCFColNom, Integer.valueOf(A4059CCFColNum), Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin)});
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound629 = (short)(1) ;
      }
      else
      {
         RcdFound629 = (short)(0) ;
      }
      pr_default.close(15);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01VO3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A4058CCFColNom, Integer.valueOf(A4059CCFColNum), Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1VO629( 1) ;
         RcdFound629 = (short)(1) ;
         A4060CCSVal = T01VO3_A4060CCSVal[0] ;
         n4060CCSVal = T01VO3_n4060CCSVal[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4060CCSVal", A4060CCSVal);
         A11482CCSMin = T01VO3_A11482CCSMin[0] ;
         n11482CCSMin = T01VO3_n11482CCSMin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11482CCSMin", A11482CCSMin);
         A11483CCSMax = T01VO3_A11483CCSMax[0] ;
         n11483CCSMax = T01VO3_n11483CCSMax[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11483CCSMax", A11483CCSMax);
         A11530CCSAuto = T01VO3_A11530CCSAuto[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11530CCSAuto", GXutil.str( A11530CCSAuto, 1, 0));
         A11531CCSVCod = T01VO3_A11531CCSVCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11531CCSVCod", A11531CCSVCod);
         A11532CCSVTol = T01VO3_A11532CCSVTol[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11532CCSVTol", GXutil.ltrimstr( A11532CCSVTol, 5, 2));
         A13247CCSMetodo = T01VO3_A13247CCSMetodo[0] ;
         n13247CCSMetodo = T01VO3_n13247CCSMetodo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13247CCSMetodo", A13247CCSMetodo);
         A13248CCSEspecif = T01VO3_A13248CCSEspecif[0] ;
         n13248CCSEspecif = T01VO3_n13248CCSEspecif[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13248CCSEspecif", A13248CCSEspecif);
         A396EmprCod = T01VO3_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = T01VO3_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A65ArtCod = T01VO3_A65ArtCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
         A4031CCTCod = T01VO3_A4031CCTCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
         A4034CCTLin = T01VO3_A4034CCTLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4034CCTLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4034CCTLin), 4, 0));
         A4058CCFColNom = T01VO3_A4058CCFColNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4058CCFColNom", A4058CCFColNom);
         A4059CCFColNum = T01VO3_A4059CCFColNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4059CCFColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4059CCFColNum), 6, 0));
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z65ArtCod = A65ArtCod ;
         Z4058CCFColNom = A4058CCFColNom ;
         Z4059CCFColNum = A4059CCFColNum ;
         Z4031CCTCod = A4031CCTCod ;
         Z4034CCTLin = A4034CCTLin ;
         sMode629 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1VO629( ) ;
         if ( AnyError == 1 )
         {
            RcdFound629 = (short)(0) ;
            initializeNonKey1VO629( ) ;
         }
         Gx_mode = sMode629 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound629 = (short)(0) ;
         initializeNonKey1VO629( ) ;
         sMode629 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode629 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1VO629( ) ;
      if ( RcdFound629 == 0 )
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
      RcdFound629 = (short)(0) ;
      /* Using cursor T01VO18 */
      pr_default.execute(16, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A252CliCod), Integer.valueOf(A252CliCod), A396EmprCod, A65ArtCod, A65ArtCod, Integer.valueOf(A252CliCod), A396EmprCod, Integer.valueOf(A4031CCTCod), Integer.valueOf(A4031CCTCod), A65ArtCod, Integer.valueOf(A252CliCod), A396EmprCod, Short.valueOf(A4034CCTLin), Short.valueOf(A4034CCTLin), Integer.valueOf(A4031CCTCod), A65ArtCod, Integer.valueOf(A252CliCod), A396EmprCod, A4058CCFColNom, A4058CCFColNom, Short.valueOf(A4034CCTLin), Integer.valueOf(A4031CCTCod), A65ArtCod, Integer.valueOf(A252CliCod), A396EmprCod, Integer.valueOf(A4059CCFColNum)});
      if ( (pr_default.getStatus(16) != 101) )
      {
         while ( (pr_default.getStatus(16) != 101) && ( ( GXutil.strcmp(T01VO18_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01VO18_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01VO18_A252CliCod[0] < A252CliCod ) || ( T01VO18_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01VO18_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01VO18_A65ArtCod[0], A65ArtCod) < 0 ) || ( GXutil.strcmp(T01VO18_A65ArtCod[0], A65ArtCod) == 0 ) && ( T01VO18_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01VO18_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01VO18_A4031CCTCod[0] < A4031CCTCod ) || ( T01VO18_A4031CCTCod[0] == A4031CCTCod ) && ( GXutil.strcmp(T01VO18_A65ArtCod[0], A65ArtCod) == 0 ) && ( T01VO18_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01VO18_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01VO18_A4034CCTLin[0] < A4034CCTLin ) || ( T01VO18_A4034CCTLin[0] == A4034CCTLin ) && ( T01VO18_A4031CCTCod[0] == A4031CCTCod ) && ( GXutil.strcmp(T01VO18_A65ArtCod[0], A65ArtCod) == 0 ) && ( T01VO18_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01VO18_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01VO18_A4058CCFColNom[0], A4058CCFColNom) < 0 ) || ( GXutil.strcmp(T01VO18_A4058CCFColNom[0], A4058CCFColNom) == 0 ) && ( T01VO18_A4034CCTLin[0] == A4034CCTLin ) && ( T01VO18_A4031CCTCod[0] == A4031CCTCod ) && ( GXutil.strcmp(T01VO18_A65ArtCod[0], A65ArtCod) == 0 ) && ( T01VO18_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01VO18_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01VO18_A4059CCFColNum[0] < A4059CCFColNum ) ) )
         {
            pr_default.readNext(16);
         }
         if ( (pr_default.getStatus(16) != 101) && ( ( GXutil.strcmp(T01VO18_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01VO18_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01VO18_A252CliCod[0] > A252CliCod ) || ( T01VO18_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01VO18_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01VO18_A65ArtCod[0], A65ArtCod) > 0 ) || ( GXutil.strcmp(T01VO18_A65ArtCod[0], A65ArtCod) == 0 ) && ( T01VO18_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01VO18_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01VO18_A4031CCTCod[0] > A4031CCTCod ) || ( T01VO18_A4031CCTCod[0] == A4031CCTCod ) && ( GXutil.strcmp(T01VO18_A65ArtCod[0], A65ArtCod) == 0 ) && ( T01VO18_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01VO18_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01VO18_A4034CCTLin[0] > A4034CCTLin ) || ( T01VO18_A4034CCTLin[0] == A4034CCTLin ) && ( T01VO18_A4031CCTCod[0] == A4031CCTCod ) && ( GXutil.strcmp(T01VO18_A65ArtCod[0], A65ArtCod) == 0 ) && ( T01VO18_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01VO18_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01VO18_A4058CCFColNom[0], A4058CCFColNom) > 0 ) || ( GXutil.strcmp(T01VO18_A4058CCFColNom[0], A4058CCFColNom) == 0 ) && ( T01VO18_A4034CCTLin[0] == A4034CCTLin ) && ( T01VO18_A4031CCTCod[0] == A4031CCTCod ) && ( GXutil.strcmp(T01VO18_A65ArtCod[0], A65ArtCod) == 0 ) && ( T01VO18_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01VO18_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01VO18_A4059CCFColNum[0] > A4059CCFColNum ) ) )
         {
            A396EmprCod = T01VO18_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A252CliCod = T01VO18_A252CliCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A65ArtCod = T01VO18_A65ArtCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
            A4031CCTCod = T01VO18_A4031CCTCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
            A4034CCTLin = T01VO18_A4034CCTLin[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4034CCTLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4034CCTLin), 4, 0));
            A4058CCFColNom = T01VO18_A4058CCFColNom[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4058CCFColNom", A4058CCFColNom);
            A4059CCFColNum = T01VO18_A4059CCFColNum[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4059CCFColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4059CCFColNum), 6, 0));
            RcdFound629 = (short)(1) ;
         }
      }
      pr_default.close(16);
   }

   public void move_previous( )
   {
      RcdFound629 = (short)(0) ;
      /* Using cursor T01VO19 */
      pr_default.execute(17, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A252CliCod), Integer.valueOf(A252CliCod), A396EmprCod, A65ArtCod, A65ArtCod, Integer.valueOf(A252CliCod), A396EmprCod, Integer.valueOf(A4031CCTCod), Integer.valueOf(A4031CCTCod), A65ArtCod, Integer.valueOf(A252CliCod), A396EmprCod, Short.valueOf(A4034CCTLin), Short.valueOf(A4034CCTLin), Integer.valueOf(A4031CCTCod), A65ArtCod, Integer.valueOf(A252CliCod), A396EmprCod, A4058CCFColNom, A4058CCFColNom, Short.valueOf(A4034CCTLin), Integer.valueOf(A4031CCTCod), A65ArtCod, Integer.valueOf(A252CliCod), A396EmprCod, Integer.valueOf(A4059CCFColNum)});
      if ( (pr_default.getStatus(17) != 101) )
      {
         while ( (pr_default.getStatus(17) != 101) && ( ( GXutil.strcmp(T01VO19_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01VO19_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01VO19_A252CliCod[0] > A252CliCod ) || ( T01VO19_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01VO19_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01VO19_A65ArtCod[0], A65ArtCod) > 0 ) || ( GXutil.strcmp(T01VO19_A65ArtCod[0], A65ArtCod) == 0 ) && ( T01VO19_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01VO19_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01VO19_A4031CCTCod[0] > A4031CCTCod ) || ( T01VO19_A4031CCTCod[0] == A4031CCTCod ) && ( GXutil.strcmp(T01VO19_A65ArtCod[0], A65ArtCod) == 0 ) && ( T01VO19_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01VO19_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01VO19_A4034CCTLin[0] > A4034CCTLin ) || ( T01VO19_A4034CCTLin[0] == A4034CCTLin ) && ( T01VO19_A4031CCTCod[0] == A4031CCTCod ) && ( GXutil.strcmp(T01VO19_A65ArtCod[0], A65ArtCod) == 0 ) && ( T01VO19_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01VO19_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01VO19_A4058CCFColNom[0], A4058CCFColNom) > 0 ) || ( GXutil.strcmp(T01VO19_A4058CCFColNom[0], A4058CCFColNom) == 0 ) && ( T01VO19_A4034CCTLin[0] == A4034CCTLin ) && ( T01VO19_A4031CCTCod[0] == A4031CCTCod ) && ( GXutil.strcmp(T01VO19_A65ArtCod[0], A65ArtCod) == 0 ) && ( T01VO19_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01VO19_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01VO19_A4059CCFColNum[0] > A4059CCFColNum ) ) )
         {
            pr_default.readNext(17);
         }
         if ( (pr_default.getStatus(17) != 101) && ( ( GXutil.strcmp(T01VO19_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01VO19_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01VO19_A252CliCod[0] < A252CliCod ) || ( T01VO19_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01VO19_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01VO19_A65ArtCod[0], A65ArtCod) < 0 ) || ( GXutil.strcmp(T01VO19_A65ArtCod[0], A65ArtCod) == 0 ) && ( T01VO19_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01VO19_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01VO19_A4031CCTCod[0] < A4031CCTCod ) || ( T01VO19_A4031CCTCod[0] == A4031CCTCod ) && ( GXutil.strcmp(T01VO19_A65ArtCod[0], A65ArtCod) == 0 ) && ( T01VO19_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01VO19_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01VO19_A4034CCTLin[0] < A4034CCTLin ) || ( T01VO19_A4034CCTLin[0] == A4034CCTLin ) && ( T01VO19_A4031CCTCod[0] == A4031CCTCod ) && ( GXutil.strcmp(T01VO19_A65ArtCod[0], A65ArtCod) == 0 ) && ( T01VO19_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01VO19_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01VO19_A4058CCFColNom[0], A4058CCFColNom) < 0 ) || ( GXutil.strcmp(T01VO19_A4058CCFColNom[0], A4058CCFColNom) == 0 ) && ( T01VO19_A4034CCTLin[0] == A4034CCTLin ) && ( T01VO19_A4031CCTCod[0] == A4031CCTCod ) && ( GXutil.strcmp(T01VO19_A65ArtCod[0], A65ArtCod) == 0 ) && ( T01VO19_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01VO19_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01VO19_A4059CCFColNum[0] < A4059CCFColNum ) ) )
         {
            A396EmprCod = T01VO19_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A252CliCod = T01VO19_A252CliCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A65ArtCod = T01VO19_A65ArtCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
            A4031CCTCod = T01VO19_A4031CCTCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
            A4034CCTLin = T01VO19_A4034CCTLin[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4034CCTLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4034CCTLin), 4, 0));
            A4058CCFColNom = T01VO19_A4058CCFColNom[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4058CCFColNom", A4058CCFColNom);
            A4059CCFColNum = T01VO19_A4059CCFColNum[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4059CCFColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4059CCFColNum), 6, 0));
            RcdFound629 = (short)(1) ;
         }
      }
      pr_default.close(17);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1VO629( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1VO629( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound629 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) || ( GXutil.strcmp(A4058CCFColNom, Z4058CCFColNom) != 0 ) || ( A4059CCFColNum != Z4059CCFColNum ) || ( A4031CCTCod != Z4031CCTCod ) || ( A4034CCTLin != Z4034CCTLin ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A252CliCod = Z252CliCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
               A65ArtCod = Z65ArtCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
               A4058CCFColNom = Z4058CCFColNom ;
               httpContext.ajax_rsp_assign_attri("", false, "A4058CCFColNom", A4058CCFColNom);
               A4059CCFColNum = Z4059CCFColNum ;
               httpContext.ajax_rsp_assign_attri("", false, "A4059CCFColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4059CCFColNum), 6, 0));
               A4031CCTCod = Z4031CCTCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
               A4034CCTLin = Z4034CCTLin ;
               httpContext.ajax_rsp_assign_attri("", false, "A4034CCTLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4034CCTLin), 4, 0));
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
               update1VO629( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) || ( GXutil.strcmp(A4058CCFColNom, Z4058CCFColNom) != 0 ) || ( A4059CCFColNum != Z4059CCFColNum ) || ( A4031CCTCod != Z4031CCTCod ) || ( A4034CCTLin != Z4034CCTLin ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1VO629( ) ;
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
                  insert1VO629( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) || ( GXutil.strcmp(A4058CCFColNom, Z4058CCFColNom) != 0 ) || ( A4059CCFColNum != Z4059CCFColNum ) || ( A4031CCTCod != Z4031CCTCod ) || ( A4034CCTLin != Z4034CCTLin ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = Z252CliCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A65ArtCod = Z65ArtCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
         A4058CCFColNom = Z4058CCFColNom ;
         httpContext.ajax_rsp_assign_attri("", false, "A4058CCFColNom", A4058CCFColNom);
         A4059CCFColNum = Z4059CCFColNum ;
         httpContext.ajax_rsp_assign_attri("", false, "A4059CCFColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4059CCFColNum), 6, 0));
         A4031CCTCod = Z4031CCTCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
         A4034CCTLin = Z4034CCTLin ;
         httpContext.ajax_rsp_assign_attri("", false, "A4034CCTLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4034CCTLin), 4, 0));
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
      if ( RcdFound629 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtCCSVal_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1VO629( ) ;
      if ( RcdFound629 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtCCSVal_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1VO629( ) ;
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
      if ( RcdFound629 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtCCSVal_Internalname ;
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
      if ( RcdFound629 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtCCSVal_Internalname ;
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
      scanStart1VO629( ) ;
      if ( RcdFound629 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound629 != 0 )
         {
            scanNext1VO629( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtCCSVal_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1VO629( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1VO629( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01VO2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A4058CCFColNom, Integer.valueOf(A4059CCFColNum), Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCCSta"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z4060CCSVal, T01VO2_A4060CCSVal[0]) != 0 ) || ( GXutil.strcmp(Z11482CCSMin, T01VO2_A11482CCSMin[0]) != 0 ) || ( GXutil.strcmp(Z11483CCSMax, T01VO2_A11483CCSMax[0]) != 0 ) || ( Z11530CCSAuto != T01VO2_A11530CCSAuto[0] ) || ( GXutil.strcmp(Z11531CCSVCod, T01VO2_A11531CCSVCod[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z11532CCSVTol, T01VO2_A11532CCSVTol[0]) != 0 ) || ( GXutil.strcmp(Z13247CCSMetodo, T01VO2_A13247CCSMetodo[0]) != 0 ) || ( GXutil.strcmp(Z13248CCSEspecif, T01VO2_A13248CCSEspecif[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z4060CCSVal, T01VO2_A4060CCSVal[0]) != 0 )
            {
               GXutil.writeLogln("controlcalidadhtd.controlcalidad_ccsta:[seudo value changed for attri]"+"CCSVal");
               GXutil.writeLogRaw("Old: ",Z4060CCSVal);
               GXutil.writeLogRaw("Current: ",T01VO2_A4060CCSVal[0]);
            }
            if ( GXutil.strcmp(Z11482CCSMin, T01VO2_A11482CCSMin[0]) != 0 )
            {
               GXutil.writeLogln("controlcalidadhtd.controlcalidad_ccsta:[seudo value changed for attri]"+"CCSMin");
               GXutil.writeLogRaw("Old: ",Z11482CCSMin);
               GXutil.writeLogRaw("Current: ",T01VO2_A11482CCSMin[0]);
            }
            if ( GXutil.strcmp(Z11483CCSMax, T01VO2_A11483CCSMax[0]) != 0 )
            {
               GXutil.writeLogln("controlcalidadhtd.controlcalidad_ccsta:[seudo value changed for attri]"+"CCSMax");
               GXutil.writeLogRaw("Old: ",Z11483CCSMax);
               GXutil.writeLogRaw("Current: ",T01VO2_A11483CCSMax[0]);
            }
            if ( Z11530CCSAuto != T01VO2_A11530CCSAuto[0] )
            {
               GXutil.writeLogln("controlcalidadhtd.controlcalidad_ccsta:[seudo value changed for attri]"+"CCSAuto");
               GXutil.writeLogRaw("Old: ",Z11530CCSAuto);
               GXutil.writeLogRaw("Current: ",T01VO2_A11530CCSAuto[0]);
            }
            if ( GXutil.strcmp(Z11531CCSVCod, T01VO2_A11531CCSVCod[0]) != 0 )
            {
               GXutil.writeLogln("controlcalidadhtd.controlcalidad_ccsta:[seudo value changed for attri]"+"CCSVCod");
               GXutil.writeLogRaw("Old: ",Z11531CCSVCod);
               GXutil.writeLogRaw("Current: ",T01VO2_A11531CCSVCod[0]);
            }
            if ( DecimalUtil.compareTo(Z11532CCSVTol, T01VO2_A11532CCSVTol[0]) != 0 )
            {
               GXutil.writeLogln("controlcalidadhtd.controlcalidad_ccsta:[seudo value changed for attri]"+"CCSVTol");
               GXutil.writeLogRaw("Old: ",Z11532CCSVTol);
               GXutil.writeLogRaw("Current: ",T01VO2_A11532CCSVTol[0]);
            }
            if ( GXutil.strcmp(Z13247CCSMetodo, T01VO2_A13247CCSMetodo[0]) != 0 )
            {
               GXutil.writeLogln("controlcalidadhtd.controlcalidad_ccsta:[seudo value changed for attri]"+"CCSMetodo");
               GXutil.writeLogRaw("Old: ",Z13247CCSMetodo);
               GXutil.writeLogRaw("Current: ",T01VO2_A13247CCSMetodo[0]);
            }
            if ( GXutil.strcmp(Z13248CCSEspecif, T01VO2_A13248CCSEspecif[0]) != 0 )
            {
               GXutil.writeLogln("controlcalidadhtd.controlcalidad_ccsta:[seudo value changed for attri]"+"CCSEspecif");
               GXutil.writeLogRaw("Old: ",Z13248CCSEspecif);
               GXutil.writeLogRaw("Current: ",T01VO2_A13248CCSEspecif[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCCSta"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1VO629( )
   {
      beforeValidate1VO629( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1VO629( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1VO629( 0) ;
         checkOptimisticConcurrency1VO629( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1VO629( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1VO629( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01VO20 */
                  pr_default.execute(18, new Object[] {Boolean.valueOf(n4060CCSVal), A4060CCSVal, Boolean.valueOf(n11482CCSMin), A11482CCSMin, Boolean.valueOf(n11483CCSMax), A11483CCSMax, Byte.valueOf(A11530CCSAuto), A11531CCSVCod, A11532CCSVTol, Boolean.valueOf(n13247CCSMetodo), A13247CCSMetodo, Boolean.valueOf(n13248CCSEspecif), A13248CCSEspecif, A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin), A4058CCFColNom, Integer.valueOf(A4059CCFColNum)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCSta");
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
                        resetCaption1VO0( ) ;
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
            load1VO629( ) ;
         }
         endLevel1VO629( ) ;
      }
      closeExtendedTableCursors1VO629( ) ;
   }

   public void update1VO629( )
   {
      beforeValidate1VO629( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1VO629( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1VO629( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1VO629( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1VO629( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01VO21 */
                  pr_default.execute(19, new Object[] {Boolean.valueOf(n4060CCSVal), A4060CCSVal, Boolean.valueOf(n11482CCSMin), A11482CCSMin, Boolean.valueOf(n11483CCSMax), A11483CCSMax, Byte.valueOf(A11530CCSAuto), A11531CCSVCod, A11532CCSVTol, Boolean.valueOf(n13247CCSMetodo), A13247CCSMetodo, Boolean.valueOf(n13248CCSEspecif), A13248CCSEspecif, A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A4058CCFColNom, Integer.valueOf(A4059CCFColNum), Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCSta");
                  if ( (pr_default.getStatus(19) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCCSta"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1VO629( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption1VO0( ) ;
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
         endLevel1VO629( ) ;
      }
      closeExtendedTableCursors1VO629( ) ;
   }

   public void deferredUpdate1VO629( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1VO629( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1VO629( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1VO629( ) ;
         afterConfirm1VO629( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1VO629( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01VO22 */
               pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A4058CCFColNom, Integer.valueOf(A4059CCFColNum), Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCSta");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound629 == 0 )
                     {
                        initAll1VO629( ) ;
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
                     resetCaption1VO0( ) ;
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
      sMode629 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1VO629( ) ;
      Gx_mode = sMode629 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1VO629( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01VO23 */
         pr_default.execute(21, new Object[] {A396EmprCod});
         A407EmprNom = T01VO23_A407EmprNom[0] ;
         n407EmprNom = T01VO23_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         pr_default.close(21);
         /* Using cursor T01VO24 */
         pr_default.execute(22, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
         A279CliNom = T01VO24_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         pr_default.close(22);
         /* Using cursor T01VO25 */
         pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
         A69ArtDsc = T01VO25_A69ArtDsc[0] ;
         n69ArtDsc = T01VO25_n69ArtDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", A69ArtDsc);
         pr_default.close(23);
         /* Using cursor T01VO26 */
         pr_default.execute(24, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod)});
         A4036CCTDsc = T01VO26_A4036CCTDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4036CCTDsc", A4036CCTDsc);
         pr_default.close(24);
         /* Using cursor T01VO27 */
         pr_default.execute(25, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin)});
         A4043CCTLinDsc = T01VO27_A4043CCTLinDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4043CCTLinDsc", A4043CCTLinDsc);
         A4044CCTLinTpoD = T01VO27_A4044CCTLinTpoD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4044CCTLinTpoD", A4044CCTLinTpoD);
         A4045CCTLinLgoD = T01VO27_A4045CCTLinLgoD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4045CCTLinLgoD", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4045CCTLinLgoD), 3, 0));
         A4046CCTLinPict = T01VO27_A4046CCTLinPict[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4046CCTLinPict", A4046CCTLinPict);
         pr_default.close(25);
      }
   }

   public void endLevel1VO629( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1VO629( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "controlcalidadhtd.controlcalidad_ccsta");
         if ( AnyError == 0 )
         {
            confirmValues1VO0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "controlcalidadhtd.controlcalidad_ccsta");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1VO629( )
   {
      /* Using cursor T01VO28 */
      pr_default.execute(26);
      RcdFound629 = (short)(0) ;
      if ( (pr_default.getStatus(26) != 101) )
      {
         RcdFound629 = (short)(1) ;
         A396EmprCod = T01VO28_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = T01VO28_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A65ArtCod = T01VO28_A65ArtCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
         A4058CCFColNom = T01VO28_A4058CCFColNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4058CCFColNom", A4058CCFColNom);
         A4059CCFColNum = T01VO28_A4059CCFColNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4059CCFColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4059CCFColNum), 6, 0));
         A4031CCTCod = T01VO28_A4031CCTCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
         A4034CCTLin = T01VO28_A4034CCTLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4034CCTLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4034CCTLin), 4, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1VO629( )
   {
      /* Scan next routine */
      pr_default.readNext(26);
      RcdFound629 = (short)(0) ;
      if ( (pr_default.getStatus(26) != 101) )
      {
         RcdFound629 = (short)(1) ;
         A396EmprCod = T01VO28_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = T01VO28_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A65ArtCod = T01VO28_A65ArtCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
         A4058CCFColNom = T01VO28_A4058CCFColNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4058CCFColNom", A4058CCFColNom);
         A4059CCFColNum = T01VO28_A4059CCFColNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4059CCFColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4059CCFColNum), 6, 0));
         A4031CCTCod = T01VO28_A4031CCTCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
         A4034CCTLin = T01VO28_A4034CCTLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4034CCTLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4034CCTLin), 4, 0));
      }
   }

   public void scanEnd1VO629( )
   {
      pr_default.close(26);
   }

   public void afterConfirm1VO629( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1VO629( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1VO629( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1VO629( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1VO629( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1VO629( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1VO629( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Enabled), 5, 0), true);
      edtArtCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtCod_Enabled), 5, 0), true);
      edtArtDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtDsc_Enabled), 5, 0), true);
      edtCCFColNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCFColNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCFColNom_Enabled), 5, 0), true);
      edtCCFColNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCFColNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCFColNum_Enabled), 5, 0), true);
      edtCCTCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCTCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTCod_Enabled), 5, 0), true);
      edtCCTDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCTDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTDsc_Enabled), 5, 0), true);
      edtCCTLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCTLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLin_Enabled), 5, 0), true);
      edtCCTLinDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCTLinDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLinDsc_Enabled), 5, 0), true);
      cmbCCTLinTpoD.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbCCTLinTpoD.getInternalname(), "Enabled", GXutil.ltrimstr( cmbCCTLinTpoD.getEnabled(), 5, 0), true);
      edtCCTLinLgoD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCTLinLgoD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLinLgoD_Enabled), 5, 0), true);
      edtCCTLinPict_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCTLinPict_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLinPict_Enabled), 5, 0), true);
      edtCCSVal_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCSVal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCSVal_Enabled), 5, 0), true);
      edtCCSMin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCSMin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCSMin_Enabled), 5, 0), true);
      edtCCSMax_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCSMax_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCSMax_Enabled), 5, 0), true);
      edtCCSAuto_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCSAuto_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCSAuto_Enabled), 5, 0), true);
      edtCCSVCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCSVCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCSVCod_Enabled), 5, 0), true);
      edtCCSVTol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCSVTol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCSVTol_Enabled), 5, 0), true);
      edtCCSMetodo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCSMetodo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCSMetodo_Enabled), 5, 0), true);
      edtCCSEspecif_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCSEspecif_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCSEspecif_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1VO629( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1VO0( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.controlcalidadhtd.controlcalidad_ccsta", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z65ArtCod", GXutil.rtrim( Z65ArtCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4058CCFColNom", GXutil.rtrim( Z4058CCFColNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4059CCFColNum", GXutil.ltrim( localUtil.ntoc( Z4059CCFColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4031CCTCod", GXutil.ltrim( localUtil.ntoc( Z4031CCTCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4034CCTLin", GXutil.ltrim( localUtil.ntoc( Z4034CCTLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4060CCSVal", GXutil.rtrim( Z4060CCSVal));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11482CCSMin", GXutil.rtrim( Z11482CCSMin));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11483CCSMax", GXutil.rtrim( Z11483CCSMax));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11530CCSAuto", GXutil.ltrim( localUtil.ntoc( Z11530CCSAuto, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11531CCSVCod", GXutil.rtrim( Z11531CCSVCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11532CCSVTol", GXutil.ltrim( localUtil.ntoc( Z11532CCSVTol, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13247CCSMetodo", GXutil.rtrim( Z13247CCSMetodo));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13248CCSEspecif", GXutil.rtrim( Z13248CCSEspecif));
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
      return formatLink("app.controlcalidadhtd.controlcalidad_ccsta", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "ControlCalidadHTD.ControlCalidad_CCSTA" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Valores Estandars", "") ;
   }

   public void initializeNonKey1VO629( )
   {
      A407EmprNom = "" ;
      n407EmprNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      A279CliNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      A69ArtDsc = "" ;
      n69ArtDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", A69ArtDsc);
      A4036CCTDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4036CCTDsc", A4036CCTDsc);
      A4043CCTLinDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4043CCTLinDsc", A4043CCTLinDsc);
      A4044CCTLinTpoD = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4044CCTLinTpoD", A4044CCTLinTpoD);
      A4045CCTLinLgoD = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A4045CCTLinLgoD", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4045CCTLinLgoD), 3, 0));
      A4046CCTLinPict = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4046CCTLinPict", A4046CCTLinPict);
      A4060CCSVal = "" ;
      n4060CCSVal = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4060CCSVal", A4060CCSVal);
      A11482CCSMin = "" ;
      n11482CCSMin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11482CCSMin", A11482CCSMin);
      A11483CCSMax = "" ;
      n11483CCSMax = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11483CCSMax", A11483CCSMax);
      A11530CCSAuto = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A11530CCSAuto", GXutil.str( A11530CCSAuto, 1, 0));
      A11531CCSVCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A11531CCSVCod", A11531CCSVCod);
      A11532CCSVTol = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A11532CCSVTol", GXutil.ltrimstr( A11532CCSVTol, 5, 2));
      A13247CCSMetodo = "" ;
      n13247CCSMetodo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13247CCSMetodo", A13247CCSMetodo);
      A13248CCSEspecif = "" ;
      n13248CCSEspecif = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13248CCSEspecif", A13248CCSEspecif);
      Z4060CCSVal = "" ;
      Z11482CCSMin = "" ;
      Z11483CCSMax = "" ;
      Z11530CCSAuto = (byte)(0) ;
      Z11531CCSVCod = "" ;
      Z11532CCSVTol = DecimalUtil.ZERO ;
      Z13247CCSMetodo = "" ;
      Z13248CCSEspecif = "" ;
   }

   public void initAll1VO629( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A252CliCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A65ArtCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
      A4058CCFColNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4058CCFColNom", A4058CCFColNom);
      A4059CCFColNum = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A4059CCFColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4059CCFColNum), 6, 0));
      A4031CCTCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
      A4034CCTLin = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A4034CCTLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4034CCTLin), 4, 0));
      initializeNonKey1VO629( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682415124651", true, true);
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
      httpContext.AddJavascriptSource("controlcalidadhtd/controlcalidad_ccsta.js", "?202682415124651", false, true);
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
      edtEmprNom_Internalname = "EMPRNOM" ;
      edtCliCod_Internalname = "CLICOD" ;
      edtCliNom_Internalname = "CLINOM" ;
      edtArtCod_Internalname = "ARTCOD" ;
      edtArtDsc_Internalname = "ARTDSC" ;
      edtCCFColNom_Internalname = "CCFCOLNOM" ;
      edtCCFColNum_Internalname = "CCFCOLNUM" ;
      edtCCTCod_Internalname = "CCTCOD" ;
      edtCCTDsc_Internalname = "CCTDSC" ;
      edtCCTLin_Internalname = "CCTLIN" ;
      edtCCTLinDsc_Internalname = "CCTLINDSC" ;
      cmbCCTLinTpoD.setInternalname( "CCTLINTPOD" );
      edtCCTLinLgoD_Internalname = "CCTLINLGOD" ;
      edtCCTLinPict_Internalname = "CCTLINPICT" ;
      edtCCSVal_Internalname = "CCSVAL" ;
      edtCCSMin_Internalname = "CCSMIN" ;
      edtCCSMax_Internalname = "CCSMAX" ;
      edtCCSAuto_Internalname = "CCSAUTO" ;
      edtCCSVCod_Internalname = "CCSVCOD" ;
      edtCCSVTol_Internalname = "CCSVTOL" ;
      edtCCSMetodo_Internalname = "CCSMETODO" ;
      edtCCSEspecif_Internalname = "CCSESPECIF" ;
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
      Form.setCaption( httpContext.getMessage( "Valores Estandars", "") );
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtCCSEspecif_Jsonclick = "" ;
      edtCCSEspecif_Enabled = 1 ;
      edtCCSMetodo_Jsonclick = "" ;
      edtCCSMetodo_Enabled = 1 ;
      edtCCSVTol_Jsonclick = "" ;
      edtCCSVTol_Enabled = 1 ;
      edtCCSVCod_Jsonclick = "" ;
      edtCCSVCod_Enabled = 1 ;
      edtCCSAuto_Jsonclick = "" ;
      edtCCSAuto_Enabled = 1 ;
      edtCCSMax_Jsonclick = "" ;
      edtCCSMax_Enabled = 1 ;
      edtCCSMin_Jsonclick = "" ;
      edtCCSMin_Enabled = 1 ;
      edtCCSVal_Jsonclick = "" ;
      edtCCSVal_Enabled = 1 ;
      edtCCTLinPict_Jsonclick = "" ;
      edtCCTLinPict_Enabled = 0 ;
      edtCCTLinLgoD_Jsonclick = "" ;
      edtCCTLinLgoD_Enabled = 0 ;
      cmbCCTLinTpoD.setJsonclick( "" );
      cmbCCTLinTpoD.setEnabled( 0 );
      edtCCTLinDsc_Jsonclick = "" ;
      edtCCTLinDsc_Enabled = 0 ;
      edtCCTLin_Jsonclick = "" ;
      edtCCTLin_Enabled = 1 ;
      edtCCTDsc_Jsonclick = "" ;
      edtCCTDsc_Enabled = 0 ;
      edtCCTCod_Jsonclick = "" ;
      edtCCTCod_Enabled = 1 ;
      edtCCFColNum_Jsonclick = "" ;
      edtCCFColNum_Enabled = 1 ;
      edtCCFColNom_Jsonclick = "" ;
      edtCCFColNom_Enabled = 1 ;
      edtArtDsc_Jsonclick = "" ;
      edtArtDsc_Enabled = 0 ;
      edtArtCod_Jsonclick = "" ;
      edtArtCod_Enabled = 1 ;
      edtCliNom_Jsonclick = "" ;
      edtCliNom_Enabled = 0 ;
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

   public void init_web_controls( )
   {
      cmbCCTLinTpoD.setName( "CCTLINTPOD" );
      cmbCCTLinTpoD.setWebtags( "" );
      cmbCCTLinTpoD.addItem("F", httpContext.getMessage( "Fecha", ""), (short)(0));
      cmbCCTLinTpoD.addItem("N", httpContext.getMessage( "Numérico", ""), (short)(0));
      cmbCCTLinTpoD.addItem("H", httpContext.getMessage( "Hora", ""), (short)(0));
      cmbCCTLinTpoD.addItem("C", httpContext.getMessage( "Caracteres", ""), (short)(0));
      cmbCCTLinTpoD.addItem("T", httpContext.getMessage( "Título", ""), (short)(0));
      if ( cmbCCTLinTpoD.getItemCount() > 0 )
      {
         A4044CCTLinTpoD = cmbCCTLinTpoD.getValidValue(A4044CCTLinTpoD) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4044CCTLinTpoD", A4044CCTLinTpoD);
      }
      /* End function init_web_controls */
   }

   public void afterkeyloadscreen( )
   {
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      getEqualNoModal( ) ;
      /* Using cursor T01VO23 */
      pr_default.execute(21, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(21) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01VO23_A407EmprNom[0] ;
      n407EmprNom = T01VO23_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(21);
      /* Using cursor T01VO24 */
      pr_default.execute(22, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(22) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T01VO24_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(22);
      /* Using cursor T01VO25 */
      pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
      if ( (pr_default.getStatus(23) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ARTICU", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ARTCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A69ArtDsc = T01VO25_A69ArtDsc[0] ;
      n69ArtDsc = T01VO25_n69ArtDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", A69ArtDsc);
      pr_default.close(23);
      /* Using cursor T01VO26 */
      pr_default.execute(24, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod)});
      if ( (pr_default.getStatus(24) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CCDef", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CCTCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A4036CCTDsc = T01VO26_A4036CCTDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A4036CCTDsc", A4036CCTDsc);
      pr_default.close(24);
      /* Using cursor T01VO29 */
      pr_default.execute(27, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A4058CCFColNom, Integer.valueOf(A4059CCFColNum), Integer.valueOf(A4031CCTCod)});
      if ( (pr_default.getStatus(27) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CCSer1", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CCTCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(27);
      /* Using cursor T01VO27 */
      pr_default.execute(25, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin)});
      if ( (pr_default.getStatus(25) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CCDef1", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CCTLIN");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A4043CCTLinDsc = T01VO27_A4043CCTLinDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A4043CCTLinDsc", A4043CCTLinDsc);
      A4044CCTLinTpoD = T01VO27_A4044CCTLinTpoD[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A4044CCTLinTpoD", A4044CCTLinTpoD);
      A4045CCTLinLgoD = T01VO27_A4045CCTLinLgoD[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A4045CCTLinLgoD", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4045CCTLinLgoD), 3, 0));
      A4046CCTLinPict = T01VO27_A4046CCTLinPict[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A4046CCTLinPict", A4046CCTLinPict);
      pr_default.close(25);
      GX_FocusControl = edtCCSVal_Internalname ;
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
      /* Using cursor T01VO23 */
      pr_default.execute(21, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(21) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A407EmprNom = T01VO23_A407EmprNom[0] ;
      n407EmprNom = T01VO23_n407EmprNom[0] ;
      pr_default.close(21);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
   }

   public void valid_Clicod( )
   {
      /* Using cursor T01VO24 */
      pr_default.execute(22, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(22) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A279CliNom = T01VO24_A279CliNom[0] ;
      pr_default.close(22);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
   }

   public void valid_Artcod( )
   {
      n69ArtDsc = false ;
      /* Using cursor T01VO25 */
      pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
      if ( (pr_default.getStatus(23) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ARTICU", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ARTCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A69ArtDsc = T01VO25_A69ArtDsc[0] ;
      n69ArtDsc = T01VO25_n69ArtDsc[0] ;
      pr_default.close(23);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", GXutil.rtrim( A69ArtDsc));
   }

   public void valid_Cctcod( )
   {
      /* Using cursor T01VO26 */
      pr_default.execute(24, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod)});
      if ( (pr_default.getStatus(24) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CCDef", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CCTCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A4036CCTDsc = T01VO26_A4036CCTDsc[0] ;
      pr_default.close(24);
      /* Using cursor T01VO29 */
      pr_default.execute(27, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A4058CCFColNom, Integer.valueOf(A4059CCFColNum), Integer.valueOf(A4031CCTCod)});
      if ( (pr_default.getStatus(27) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CCSer1", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CCTCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      pr_default.close(27);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A4036CCTDsc", GXutil.rtrim( A4036CCTDsc));
   }

   public void valid_Cctlin( )
   {
      A4044CCTLinTpoD = cmbCCTLinTpoD.getValue() ;
      cmbCCTLinTpoD.setValue( A4044CCTLinTpoD );
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      /* Using cursor T01VO27 */
      pr_default.execute(25, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin)});
      if ( (pr_default.getStatus(25) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CCDef1", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CCTLIN");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A4043CCTLinDsc = T01VO27_A4043CCTLinDsc[0] ;
      A4044CCTLinTpoD = T01VO27_A4044CCTLinTpoD[0] ;
      cmbCCTLinTpoD.setValue( A4044CCTLinTpoD );
      A4045CCTLinLgoD = T01VO27_A4045CCTLinLgoD[0] ;
      A4046CCTLinPict = T01VO27_A4046CCTLinPict[0] ;
      pr_default.close(25);
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
      httpContext.ajax_rsp_assign_attri("", false, "A4060CCSVal", GXutil.rtrim( A4060CCSVal));
      httpContext.ajax_rsp_assign_attri("", false, "A11482CCSMin", GXutil.rtrim( A11482CCSMin));
      httpContext.ajax_rsp_assign_attri("", false, "A11483CCSMax", GXutil.rtrim( A11483CCSMax));
      httpContext.ajax_rsp_assign_attri("", false, "A11530CCSAuto", GXutil.ltrim( localUtil.ntoc( A11530CCSAuto, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11531CCSVCod", GXutil.rtrim( A11531CCSVCod));
      httpContext.ajax_rsp_assign_attri("", false, "A11532CCSVTol", GXutil.ltrim( localUtil.ntoc( A11532CCSVTol, (byte)(5), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A13247CCSMetodo", GXutil.rtrim( A13247CCSMetodo));
      httpContext.ajax_rsp_assign_attri("", false, "A13248CCSEspecif", GXutil.rtrim( A13248CCSEspecif));
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
      httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", GXutil.rtrim( A69ArtDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A4036CCTDsc", GXutil.rtrim( A4036CCTDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A4043CCTLinDsc", GXutil.rtrim( A4043CCTLinDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A4044CCTLinTpoD", GXutil.rtrim( A4044CCTLinTpoD));
      cmbCCTLinTpoD.setValue( GXutil.rtrim( A4044CCTLinTpoD) );
      httpContext.ajax_rsp_assign_prop("", false, cmbCCTLinTpoD.getInternalname(), "Values", cmbCCTLinTpoD.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "A4045CCTLinLgoD", GXutil.ltrim( localUtil.ntoc( A4045CCTLinLgoD, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4046CCTLinPict", GXutil.rtrim( A4046CCTLinPict));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z65ArtCod", GXutil.rtrim( Z65ArtCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4058CCFColNom", GXutil.rtrim( Z4058CCFColNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4059CCFColNum", GXutil.ltrim( localUtil.ntoc( Z4059CCFColNum, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4031CCTCod", GXutil.ltrim( localUtil.ntoc( Z4031CCTCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4034CCTLin", GXutil.ltrim( localUtil.ntoc( Z4034CCTLin, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4060CCSVal", GXutil.rtrim( Z4060CCSVal));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11482CCSMin", GXutil.rtrim( Z11482CCSMin));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11483CCSMax", GXutil.rtrim( Z11483CCSMax));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11530CCSAuto", GXutil.ltrim( localUtil.ntoc( Z11530CCSAuto, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11531CCSVCod", GXutil.rtrim( Z11531CCSVCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11532CCSVTol", GXutil.ltrim( localUtil.ntoc( Z11532CCSVTol, (byte)(5), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13247CCSMetodo", GXutil.rtrim( Z13247CCSMetodo));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13248CCSEspecif", GXutil.rtrim( Z13248CCSEspecif));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z279CliNom", GXutil.rtrim( Z279CliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z69ArtDsc", GXutil.rtrim( Z69ArtDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4036CCTDsc", GXutil.rtrim( Z4036CCTDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4043CCTLinDsc", GXutil.rtrim( Z4043CCTLinDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4044CCTLinTpoD", GXutil.rtrim( Z4044CCTLinTpoD));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4045CCTLinLgoD", GXutil.ltrim( localUtil.ntoc( Z4045CCTLinLgoD, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4046CCTLinPict", GXutil.rtrim( Z4046CCTLinPict));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A407EmprNom',fld:'EMPRNOM',pic:''}]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''}]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A279CliNom',fld:'CLINOM',pic:''}]");
      setEventMetadata("VALID_CLICOD",",oparms:[{av:'A279CliNom',fld:'CLINOM',pic:''}]}");
      setEventMetadata("VALID_ARTCOD","{handler:'valid_Artcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A65ArtCod',fld:'ARTCOD',pic:''},{av:'A69ArtDsc',fld:'ARTDSC',pic:''}]");
      setEventMetadata("VALID_ARTCOD",",oparms:[{av:'A69ArtDsc',fld:'ARTDSC',pic:''}]}");
      setEventMetadata("VALID_CCFCOLNOM","{handler:'valid_Ccfcolnom',iparms:[]");
      setEventMetadata("VALID_CCFCOLNOM",",oparms:[]}");
      setEventMetadata("VALID_CCFCOLNUM","{handler:'valid_Ccfcolnum',iparms:[]");
      setEventMetadata("VALID_CCFCOLNUM",",oparms:[]}");
      setEventMetadata("VALID_CCTCOD","{handler:'valid_Cctcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A4031CCTCod',fld:'CCTCOD',pic:'ZZZZZ9'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A65ArtCod',fld:'ARTCOD',pic:''},{av:'A4058CCFColNom',fld:'CCFCOLNOM',pic:''},{av:'A4059CCFColNum',fld:'CCFCOLNUM',pic:'ZZZZZ9'},{av:'A4036CCTDsc',fld:'CCTDSC',pic:''}]");
      setEventMetadata("VALID_CCTCOD",",oparms:[{av:'A4036CCTDsc',fld:'CCTDSC',pic:''}]}");
      setEventMetadata("VALID_CCTLIN","{handler:'valid_Cctlin',iparms:[{av:'cmbCCTLinTpoD'},{av:'A4044CCTLinTpoD',fld:'CCTLINTPOD',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A65ArtCod',fld:'ARTCOD',pic:''},{av:'A4058CCFColNom',fld:'CCFCOLNOM',pic:''},{av:'A4059CCFColNum',fld:'CCFCOLNUM',pic:'ZZZZZ9'},{av:'A4031CCTCod',fld:'CCTCOD',pic:'ZZZZZ9'},{av:'A4034CCTLin',fld:'CCTLIN',pic:'ZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_CCTLIN",",oparms:[{av:'A4060CCSVal',fld:'CCSVAL',pic:''},{av:'A11482CCSMin',fld:'CCSMIN',pic:''},{av:'A11483CCSMax',fld:'CCSMAX',pic:''},{av:'A11530CCSAuto',fld:'CCSAUTO',pic:'9'},{av:'A11531CCSVCod',fld:'CCSVCOD',pic:''},{av:'A11532CCSVTol',fld:'CCSVTOL',pic:'Z9.99'},{av:'A13247CCSMetodo',fld:'CCSMETODO',pic:''},{av:'A13248CCSEspecif',fld:'CCSESPECIF',pic:''},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A69ArtDsc',fld:'ARTDSC',pic:''},{av:'A4036CCTDsc',fld:'CCTDSC',pic:''},{av:'A4043CCTLinDsc',fld:'CCTLINDSC',pic:''},{av:'cmbCCTLinTpoD'},{av:'A4044CCTLinTpoD',fld:'CCTLINTPOD',pic:''},{av:'A4045CCTLinLgoD',fld:'CCTLINLGOD',pic:'ZZ9'},{av:'A4046CCTLinPict',fld:'CCTLINPICT',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z252CliCod'},{av:'Z65ArtCod'},{av:'Z4058CCFColNom'},{av:'Z4059CCFColNum'},{av:'Z4031CCTCod'},{av:'Z4034CCTLin'},{av:'Z4060CCSVal'},{av:'Z11482CCSMin'},{av:'Z11483CCSMax'},{av:'Z11530CCSAuto'},{av:'Z11531CCSVCod'},{av:'Z11532CCSVTol'},{av:'Z13247CCSMetodo'},{av:'Z13248CCSEspecif'},{av:'Z407EmprNom'},{av:'Z279CliNom'},{av:'Z69ArtDsc'},{av:'Z4036CCTDsc'},{av:'Z4043CCTLinDsc'},{av:'Z4044CCTLinTpoD'},{av:'Z4045CCTLinLgoD'},{av:'Z4046CCTLinPict'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'}]}");
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
      pr_default.close(23);
      pr_default.close(22);
      pr_default.close(21);
      pr_default.close(24);
      pr_default.close(25);
      pr_default.close(27);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z65ArtCod = "" ;
      Z4058CCFColNom = "" ;
      Z4060CCSVal = "" ;
      Z11482CCSMin = "" ;
      Z11483CCSMax = "" ;
      Z11531CCSVCod = "" ;
      Z11532CCSVTol = DecimalUtil.ZERO ;
      Z13247CCSMetodo = "" ;
      Z13248CCSEspecif = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A65ArtCod = "" ;
      A4058CCFColNom = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      A4044CCTLinTpoD = "" ;
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
      A69ArtDsc = "" ;
      A4036CCTDsc = "" ;
      A4043CCTLinDsc = "" ;
      A4046CCTLinPict = "" ;
      A4060CCSVal = "" ;
      A11482CCSMin = "" ;
      A11483CCSMax = "" ;
      A11531CCSVCod = "" ;
      A11532CCSVTol = DecimalUtil.ZERO ;
      A13247CCSMetodo = "" ;
      A13248CCSEspecif = "" ;
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
      Z279CliNom = "" ;
      Z69ArtDsc = "" ;
      Z4036CCTDsc = "" ;
      Z4043CCTLinDsc = "" ;
      Z4044CCTLinTpoD = "" ;
      Z4046CCTLinPict = "" ;
      T01VO10_A407EmprNom = new String[] {""} ;
      T01VO10_n407EmprNom = new boolean[] {false} ;
      T01VO10_A279CliNom = new String[] {""} ;
      T01VO10_A69ArtDsc = new String[] {""} ;
      T01VO10_n69ArtDsc = new boolean[] {false} ;
      T01VO10_A4036CCTDsc = new String[] {""} ;
      T01VO10_A4043CCTLinDsc = new String[] {""} ;
      T01VO10_A4044CCTLinTpoD = new String[] {""} ;
      T01VO10_A4045CCTLinLgoD = new short[1] ;
      T01VO10_A4046CCTLinPict = new String[] {""} ;
      T01VO10_A4060CCSVal = new String[] {""} ;
      T01VO10_n4060CCSVal = new boolean[] {false} ;
      T01VO10_A11482CCSMin = new String[] {""} ;
      T01VO10_n11482CCSMin = new boolean[] {false} ;
      T01VO10_A11483CCSMax = new String[] {""} ;
      T01VO10_n11483CCSMax = new boolean[] {false} ;
      T01VO10_A11530CCSAuto = new byte[1] ;
      T01VO10_A11531CCSVCod = new String[] {""} ;
      T01VO10_A11532CCSVTol = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01VO10_A13247CCSMetodo = new String[] {""} ;
      T01VO10_n13247CCSMetodo = new boolean[] {false} ;
      T01VO10_A13248CCSEspecif = new String[] {""} ;
      T01VO10_n13248CCSEspecif = new boolean[] {false} ;
      T01VO10_A396EmprCod = new String[] {""} ;
      T01VO10_A252CliCod = new int[1] ;
      T01VO10_A65ArtCod = new String[] {""} ;
      T01VO10_A4031CCTCod = new int[1] ;
      T01VO10_A4034CCTLin = new short[1] ;
      T01VO10_A4058CCFColNom = new String[] {""} ;
      T01VO10_A4059CCFColNum = new int[1] ;
      T01VO4_A407EmprNom = new String[] {""} ;
      T01VO4_n407EmprNom = new boolean[] {false} ;
      T01VO5_A279CliNom = new String[] {""} ;
      T01VO6_A69ArtDsc = new String[] {""} ;
      T01VO6_n69ArtDsc = new boolean[] {false} ;
      T01VO7_A4036CCTDsc = new String[] {""} ;
      T01VO9_A396EmprCod = new String[] {""} ;
      T01VO8_A4043CCTLinDsc = new String[] {""} ;
      T01VO8_A4044CCTLinTpoD = new String[] {""} ;
      T01VO8_A4045CCTLinLgoD = new short[1] ;
      T01VO8_A4046CCTLinPict = new String[] {""} ;
      T01VO11_A407EmprNom = new String[] {""} ;
      T01VO11_n407EmprNom = new boolean[] {false} ;
      T01VO12_A279CliNom = new String[] {""} ;
      T01VO13_A69ArtDsc = new String[] {""} ;
      T01VO13_n69ArtDsc = new boolean[] {false} ;
      T01VO14_A4036CCTDsc = new String[] {""} ;
      T01VO15_A396EmprCod = new String[] {""} ;
      T01VO16_A4043CCTLinDsc = new String[] {""} ;
      T01VO16_A4044CCTLinTpoD = new String[] {""} ;
      T01VO16_A4045CCTLinLgoD = new short[1] ;
      T01VO16_A4046CCTLinPict = new String[] {""} ;
      T01VO17_A396EmprCod = new String[] {""} ;
      T01VO17_A252CliCod = new int[1] ;
      T01VO17_A65ArtCod = new String[] {""} ;
      T01VO17_A4058CCFColNom = new String[] {""} ;
      T01VO17_A4059CCFColNum = new int[1] ;
      T01VO17_A4031CCTCod = new int[1] ;
      T01VO17_A4034CCTLin = new short[1] ;
      T01VO3_A4060CCSVal = new String[] {""} ;
      T01VO3_n4060CCSVal = new boolean[] {false} ;
      T01VO3_A11482CCSMin = new String[] {""} ;
      T01VO3_n11482CCSMin = new boolean[] {false} ;
      T01VO3_A11483CCSMax = new String[] {""} ;
      T01VO3_n11483CCSMax = new boolean[] {false} ;
      T01VO3_A11530CCSAuto = new byte[1] ;
      T01VO3_A11531CCSVCod = new String[] {""} ;
      T01VO3_A11532CCSVTol = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01VO3_A13247CCSMetodo = new String[] {""} ;
      T01VO3_n13247CCSMetodo = new boolean[] {false} ;
      T01VO3_A13248CCSEspecif = new String[] {""} ;
      T01VO3_n13248CCSEspecif = new boolean[] {false} ;
      T01VO3_A396EmprCod = new String[] {""} ;
      T01VO3_A252CliCod = new int[1] ;
      T01VO3_A65ArtCod = new String[] {""} ;
      T01VO3_A4031CCTCod = new int[1] ;
      T01VO3_A4034CCTLin = new short[1] ;
      T01VO3_A4058CCFColNom = new String[] {""} ;
      T01VO3_A4059CCFColNum = new int[1] ;
      sMode629 = "" ;
      T01VO18_A396EmprCod = new String[] {""} ;
      T01VO18_A252CliCod = new int[1] ;
      T01VO18_A65ArtCod = new String[] {""} ;
      T01VO18_A4031CCTCod = new int[1] ;
      T01VO18_A4034CCTLin = new short[1] ;
      T01VO18_A4058CCFColNom = new String[] {""} ;
      T01VO18_A4059CCFColNum = new int[1] ;
      T01VO19_A396EmprCod = new String[] {""} ;
      T01VO19_A252CliCod = new int[1] ;
      T01VO19_A65ArtCod = new String[] {""} ;
      T01VO19_A4031CCTCod = new int[1] ;
      T01VO19_A4034CCTLin = new short[1] ;
      T01VO19_A4058CCFColNom = new String[] {""} ;
      T01VO19_A4059CCFColNum = new int[1] ;
      T01VO2_A4060CCSVal = new String[] {""} ;
      T01VO2_n4060CCSVal = new boolean[] {false} ;
      T01VO2_A11482CCSMin = new String[] {""} ;
      T01VO2_n11482CCSMin = new boolean[] {false} ;
      T01VO2_A11483CCSMax = new String[] {""} ;
      T01VO2_n11483CCSMax = new boolean[] {false} ;
      T01VO2_A11530CCSAuto = new byte[1] ;
      T01VO2_A11531CCSVCod = new String[] {""} ;
      T01VO2_A11532CCSVTol = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01VO2_A13247CCSMetodo = new String[] {""} ;
      T01VO2_n13247CCSMetodo = new boolean[] {false} ;
      T01VO2_A13248CCSEspecif = new String[] {""} ;
      T01VO2_n13248CCSEspecif = new boolean[] {false} ;
      T01VO2_A396EmprCod = new String[] {""} ;
      T01VO2_A252CliCod = new int[1] ;
      T01VO2_A65ArtCod = new String[] {""} ;
      T01VO2_A4031CCTCod = new int[1] ;
      T01VO2_A4034CCTLin = new short[1] ;
      T01VO2_A4058CCFColNom = new String[] {""} ;
      T01VO2_A4059CCFColNum = new int[1] ;
      T01VO23_A407EmprNom = new String[] {""} ;
      T01VO23_n407EmprNom = new boolean[] {false} ;
      T01VO24_A279CliNom = new String[] {""} ;
      T01VO25_A69ArtDsc = new String[] {""} ;
      T01VO25_n69ArtDsc = new boolean[] {false} ;
      T01VO26_A4036CCTDsc = new String[] {""} ;
      T01VO27_A4043CCTLinDsc = new String[] {""} ;
      T01VO27_A4044CCTLinTpoD = new String[] {""} ;
      T01VO27_A4045CCTLinLgoD = new short[1] ;
      T01VO27_A4046CCTLinPict = new String[] {""} ;
      T01VO28_A396EmprCod = new String[] {""} ;
      T01VO28_A252CliCod = new int[1] ;
      T01VO28_A65ArtCod = new String[] {""} ;
      T01VO28_A4058CCFColNom = new String[] {""} ;
      T01VO28_A4059CCFColNum = new int[1] ;
      T01VO28_A4031CCTCod = new int[1] ;
      T01VO28_A4034CCTLin = new short[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      T01VO29_A396EmprCod = new String[] {""} ;
      ZZ396EmprCod = "" ;
      ZZ65ArtCod = "" ;
      ZZ4058CCFColNom = "" ;
      ZZ4060CCSVal = "" ;
      ZZ11482CCSMin = "" ;
      ZZ11483CCSMax = "" ;
      ZZ11531CCSVCod = "" ;
      ZZ11532CCSVTol = DecimalUtil.ZERO ;
      ZZ13247CCSMetodo = "" ;
      ZZ13248CCSEspecif = "" ;
      ZZ407EmprNom = "" ;
      ZZ279CliNom = "" ;
      ZZ69ArtDsc = "" ;
      ZZ4036CCTDsc = "" ;
      ZZ4043CCTLinDsc = "" ;
      ZZ4044CCTLinTpoD = "" ;
      ZZ4046CCTLinPict = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.controlcalidad_ccsta__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.controlcalidad_ccsta__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.controlcalidad_ccsta__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.controlcalidad_ccsta__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.controlcalidad_ccsta__default(),
         new Object[] {
             new Object[] {
            T01VO2_A4060CCSVal, T01VO2_n4060CCSVal, T01VO2_A11482CCSMin, T01VO2_n11482CCSMin, T01VO2_A11483CCSMax, T01VO2_n11483CCSMax, T01VO2_A11530CCSAuto, T01VO2_A11531CCSVCod, T01VO2_A11532CCSVTol, T01VO2_A13247CCSMetodo,
            T01VO2_n13247CCSMetodo, T01VO2_A13248CCSEspecif, T01VO2_n13248CCSEspecif, T01VO2_A396EmprCod, T01VO2_A252CliCod, T01VO2_A65ArtCod, T01VO2_A4031CCTCod, T01VO2_A4034CCTLin, T01VO2_A4058CCFColNom, T01VO2_A4059CCFColNum
            }
            , new Object[] {
            T01VO3_A4060CCSVal, T01VO3_n4060CCSVal, T01VO3_A11482CCSMin, T01VO3_n11482CCSMin, T01VO3_A11483CCSMax, T01VO3_n11483CCSMax, T01VO3_A11530CCSAuto, T01VO3_A11531CCSVCod, T01VO3_A11532CCSVTol, T01VO3_A13247CCSMetodo,
            T01VO3_n13247CCSMetodo, T01VO3_A13248CCSEspecif, T01VO3_n13248CCSEspecif, T01VO3_A396EmprCod, T01VO3_A252CliCod, T01VO3_A65ArtCod, T01VO3_A4031CCTCod, T01VO3_A4034CCTLin, T01VO3_A4058CCFColNom, T01VO3_A4059CCFColNum
            }
            , new Object[] {
            T01VO4_A407EmprNom, T01VO4_n407EmprNom
            }
            , new Object[] {
            T01VO5_A279CliNom
            }
            , new Object[] {
            T01VO6_A69ArtDsc, T01VO6_n69ArtDsc
            }
            , new Object[] {
            T01VO7_A4036CCTDsc
            }
            , new Object[] {
            T01VO8_A4043CCTLinDsc, T01VO8_A4044CCTLinTpoD, T01VO8_A4045CCTLinLgoD, T01VO8_A4046CCTLinPict
            }
            , new Object[] {
            T01VO9_A396EmprCod
            }
            , new Object[] {
            T01VO10_A407EmprNom, T01VO10_n407EmprNom, T01VO10_A279CliNom, T01VO10_A69ArtDsc, T01VO10_n69ArtDsc, T01VO10_A4036CCTDsc, T01VO10_A4043CCTLinDsc, T01VO10_A4044CCTLinTpoD, T01VO10_A4045CCTLinLgoD, T01VO10_A4046CCTLinPict,
            T01VO10_A4060CCSVal, T01VO10_n4060CCSVal, T01VO10_A11482CCSMin, T01VO10_n11482CCSMin, T01VO10_A11483CCSMax, T01VO10_n11483CCSMax, T01VO10_A11530CCSAuto, T01VO10_A11531CCSVCod, T01VO10_A11532CCSVTol, T01VO10_A13247CCSMetodo,
            T01VO10_n13247CCSMetodo, T01VO10_A13248CCSEspecif, T01VO10_n13248CCSEspecif, T01VO10_A396EmprCod, T01VO10_A252CliCod, T01VO10_A65ArtCod, T01VO10_A4031CCTCod, T01VO10_A4034CCTLin, T01VO10_A4058CCFColNom, T01VO10_A4059CCFColNum
            }
            , new Object[] {
            T01VO11_A407EmprNom, T01VO11_n407EmprNom
            }
            , new Object[] {
            T01VO12_A279CliNom
            }
            , new Object[] {
            T01VO13_A69ArtDsc, T01VO13_n69ArtDsc
            }
            , new Object[] {
            T01VO14_A4036CCTDsc
            }
            , new Object[] {
            T01VO15_A396EmprCod
            }
            , new Object[] {
            T01VO16_A4043CCTLinDsc, T01VO16_A4044CCTLinTpoD, T01VO16_A4045CCTLinLgoD, T01VO16_A4046CCTLinPict
            }
            , new Object[] {
            T01VO17_A396EmprCod, T01VO17_A252CliCod, T01VO17_A65ArtCod, T01VO17_A4058CCFColNom, T01VO17_A4059CCFColNum, T01VO17_A4031CCTCod, T01VO17_A4034CCTLin
            }
            , new Object[] {
            T01VO18_A396EmprCod, T01VO18_A252CliCod, T01VO18_A65ArtCod, T01VO18_A4031CCTCod, T01VO18_A4034CCTLin, T01VO18_A4058CCFColNom, T01VO18_A4059CCFColNum
            }
            , new Object[] {
            T01VO19_A396EmprCod, T01VO19_A252CliCod, T01VO19_A65ArtCod, T01VO19_A4031CCTCod, T01VO19_A4034CCTLin, T01VO19_A4058CCFColNom, T01VO19_A4059CCFColNum
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01VO23_A407EmprNom, T01VO23_n407EmprNom
            }
            , new Object[] {
            T01VO24_A279CliNom
            }
            , new Object[] {
            T01VO25_A69ArtDsc, T01VO25_n69ArtDsc
            }
            , new Object[] {
            T01VO26_A4036CCTDsc
            }
            , new Object[] {
            T01VO27_A4043CCTLinDsc, T01VO27_A4044CCTLinTpoD, T01VO27_A4045CCTLinLgoD, T01VO27_A4046CCTLinPict
            }
            , new Object[] {
            T01VO28_A396EmprCod, T01VO28_A252CliCod, T01VO28_A65ArtCod, T01VO28_A4058CCFColNom, T01VO28_A4059CCFColNum, T01VO28_A4031CCTCod, T01VO28_A4034CCTLin
            }
            , new Object[] {
            T01VO29_A396EmprCod
            }
         }
      );
   }

   private byte Z11530CCSAuto ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A11530CCSAuto ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private byte ZZ11530CCSAuto ;
   private short Z4034CCTLin ;
   private short A4034CCTLin ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A4045CCTLinLgoD ;
   private short Z4045CCTLinLgoD ;
   private short RcdFound629 ;
   private short nIsDirty_629 ;
   private short ZZ4034CCTLin ;
   private short ZZ4045CCTLinLgoD ;
   private int Z252CliCod ;
   private int Z4059CCFColNum ;
   private int Z4031CCTCod ;
   private int A252CliCod ;
   private int A4031CCTCod ;
   private int A4059CCFColNum ;
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
   private int edtArtCod_Enabled ;
   private int edtArtDsc_Enabled ;
   private int edtCCFColNom_Enabled ;
   private int edtCCFColNum_Enabled ;
   private int edtCCTCod_Enabled ;
   private int edtCCTDsc_Enabled ;
   private int edtCCTLin_Enabled ;
   private int edtCCTLinDsc_Enabled ;
   private int edtCCTLinLgoD_Enabled ;
   private int edtCCTLinPict_Enabled ;
   private int edtCCSVal_Enabled ;
   private int edtCCSMin_Enabled ;
   private int edtCCSMax_Enabled ;
   private int edtCCSAuto_Enabled ;
   private int edtCCSVCod_Enabled ;
   private int edtCCSVTol_Enabled ;
   private int edtCCSMetodo_Enabled ;
   private int edtCCSEspecif_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int GX_JID ;
   private int idxLst ;
   private int ZZ252CliCod ;
   private int ZZ4059CCFColNum ;
   private int ZZ4031CCTCod ;
   private java.math.BigDecimal Z11532CCSVTol ;
   private java.math.BigDecimal A11532CCSVTol ;
   private java.math.BigDecimal ZZ11532CCSVTol ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z65ArtCod ;
   private String Z4058CCFColNom ;
   private String Z4060CCSVal ;
   private String Z11482CCSMin ;
   private String Z11483CCSMax ;
   private String Z11531CCSVCod ;
   private String Z13247CCSMetodo ;
   private String Z13248CCSEspecif ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A65ArtCod ;
   private String A4058CCFColNom ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtEmprCod_Internalname ;
   private String A4044CCTLinTpoD ;
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
   private String edtArtCod_Internalname ;
   private String edtArtCod_Jsonclick ;
   private String edtArtDsc_Internalname ;
   private String A69ArtDsc ;
   private String edtArtDsc_Jsonclick ;
   private String edtCCFColNom_Internalname ;
   private String edtCCFColNom_Jsonclick ;
   private String edtCCFColNum_Internalname ;
   private String edtCCFColNum_Jsonclick ;
   private String edtCCTCod_Internalname ;
   private String edtCCTCod_Jsonclick ;
   private String edtCCTDsc_Internalname ;
   private String A4036CCTDsc ;
   private String edtCCTDsc_Jsonclick ;
   private String edtCCTLin_Internalname ;
   private String edtCCTLin_Jsonclick ;
   private String edtCCTLinDsc_Internalname ;
   private String A4043CCTLinDsc ;
   private String edtCCTLinDsc_Jsonclick ;
   private String edtCCTLinLgoD_Internalname ;
   private String edtCCTLinLgoD_Jsonclick ;
   private String edtCCTLinPict_Internalname ;
   private String A4046CCTLinPict ;
   private String edtCCTLinPict_Jsonclick ;
   private String edtCCSVal_Internalname ;
   private String A4060CCSVal ;
   private String edtCCSVal_Jsonclick ;
   private String edtCCSMin_Internalname ;
   private String A11482CCSMin ;
   private String edtCCSMin_Jsonclick ;
   private String edtCCSMax_Internalname ;
   private String A11483CCSMax ;
   private String edtCCSMax_Jsonclick ;
   private String edtCCSAuto_Internalname ;
   private String edtCCSAuto_Jsonclick ;
   private String edtCCSVCod_Internalname ;
   private String A11531CCSVCod ;
   private String edtCCSVCod_Jsonclick ;
   private String edtCCSVTol_Internalname ;
   private String edtCCSVTol_Jsonclick ;
   private String edtCCSMetodo_Internalname ;
   private String A13247CCSMetodo ;
   private String edtCCSMetodo_Jsonclick ;
   private String edtCCSEspecif_Internalname ;
   private String A13248CCSEspecif ;
   private String edtCCSEspecif_Jsonclick ;
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
   private String Z279CliNom ;
   private String Z69ArtDsc ;
   private String Z4036CCTDsc ;
   private String Z4043CCTLinDsc ;
   private String Z4044CCTLinTpoD ;
   private String Z4046CCTLinPict ;
   private String sMode629 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String ZZ396EmprCod ;
   private String ZZ65ArtCod ;
   private String ZZ4058CCFColNom ;
   private String ZZ4060CCSVal ;
   private String ZZ11482CCSMin ;
   private String ZZ11483CCSMax ;
   private String ZZ11531CCSVCod ;
   private String ZZ13247CCSMetodo ;
   private String ZZ13248CCSEspecif ;
   private String ZZ407EmprNom ;
   private String ZZ279CliNom ;
   private String ZZ69ArtDsc ;
   private String ZZ4036CCTDsc ;
   private String ZZ4043CCTLinDsc ;
   private String ZZ4044CCTLinTpoD ;
   private String ZZ4046CCTLinPict ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n407EmprNom ;
   private boolean n69ArtDsc ;
   private boolean n4060CCSVal ;
   private boolean n11482CCSMin ;
   private boolean n11483CCSMax ;
   private boolean n13247CCSMetodo ;
   private boolean n13248CCSEspecif ;
   private boolean Gx_longc ;
   private HTMLChoice cmbCCTLinTpoD ;
   private IDataStoreProvider pr_default ;
   private String[] T01VO10_A407EmprNom ;
   private boolean[] T01VO10_n407EmprNom ;
   private String[] T01VO10_A279CliNom ;
   private String[] T01VO10_A69ArtDsc ;
   private boolean[] T01VO10_n69ArtDsc ;
   private String[] T01VO10_A4036CCTDsc ;
   private String[] T01VO10_A4043CCTLinDsc ;
   private String[] T01VO10_A4044CCTLinTpoD ;
   private short[] T01VO10_A4045CCTLinLgoD ;
   private String[] T01VO10_A4046CCTLinPict ;
   private String[] T01VO10_A4060CCSVal ;
   private boolean[] T01VO10_n4060CCSVal ;
   private String[] T01VO10_A11482CCSMin ;
   private boolean[] T01VO10_n11482CCSMin ;
   private String[] T01VO10_A11483CCSMax ;
   private boolean[] T01VO10_n11483CCSMax ;
   private byte[] T01VO10_A11530CCSAuto ;
   private String[] T01VO10_A11531CCSVCod ;
   private java.math.BigDecimal[] T01VO10_A11532CCSVTol ;
   private String[] T01VO10_A13247CCSMetodo ;
   private boolean[] T01VO10_n13247CCSMetodo ;
   private String[] T01VO10_A13248CCSEspecif ;
   private boolean[] T01VO10_n13248CCSEspecif ;
   private String[] T01VO10_A396EmprCod ;
   private int[] T01VO10_A252CliCod ;
   private String[] T01VO10_A65ArtCod ;
   private int[] T01VO10_A4031CCTCod ;
   private short[] T01VO10_A4034CCTLin ;
   private String[] T01VO10_A4058CCFColNom ;
   private int[] T01VO10_A4059CCFColNum ;
   private String[] T01VO4_A407EmprNom ;
   private boolean[] T01VO4_n407EmprNom ;
   private String[] T01VO5_A279CliNom ;
   private String[] T01VO6_A69ArtDsc ;
   private boolean[] T01VO6_n69ArtDsc ;
   private String[] T01VO7_A4036CCTDsc ;
   private String[] T01VO9_A396EmprCod ;
   private String[] T01VO8_A4043CCTLinDsc ;
   private String[] T01VO8_A4044CCTLinTpoD ;
   private short[] T01VO8_A4045CCTLinLgoD ;
   private String[] T01VO8_A4046CCTLinPict ;
   private String[] T01VO11_A407EmprNom ;
   private boolean[] T01VO11_n407EmprNom ;
   private String[] T01VO12_A279CliNom ;
   private String[] T01VO13_A69ArtDsc ;
   private boolean[] T01VO13_n69ArtDsc ;
   private String[] T01VO14_A4036CCTDsc ;
   private String[] T01VO15_A396EmprCod ;
   private String[] T01VO16_A4043CCTLinDsc ;
   private String[] T01VO16_A4044CCTLinTpoD ;
   private short[] T01VO16_A4045CCTLinLgoD ;
   private String[] T01VO16_A4046CCTLinPict ;
   private String[] T01VO17_A396EmprCod ;
   private int[] T01VO17_A252CliCod ;
   private String[] T01VO17_A65ArtCod ;
   private String[] T01VO17_A4058CCFColNom ;
   private int[] T01VO17_A4059CCFColNum ;
   private int[] T01VO17_A4031CCTCod ;
   private short[] T01VO17_A4034CCTLin ;
   private String[] T01VO3_A4060CCSVal ;
   private boolean[] T01VO3_n4060CCSVal ;
   private String[] T01VO3_A11482CCSMin ;
   private boolean[] T01VO3_n11482CCSMin ;
   private String[] T01VO3_A11483CCSMax ;
   private boolean[] T01VO3_n11483CCSMax ;
   private byte[] T01VO3_A11530CCSAuto ;
   private String[] T01VO3_A11531CCSVCod ;
   private java.math.BigDecimal[] T01VO3_A11532CCSVTol ;
   private String[] T01VO3_A13247CCSMetodo ;
   private boolean[] T01VO3_n13247CCSMetodo ;
   private String[] T01VO3_A13248CCSEspecif ;
   private boolean[] T01VO3_n13248CCSEspecif ;
   private String[] T01VO3_A396EmprCod ;
   private int[] T01VO3_A252CliCod ;
   private String[] T01VO3_A65ArtCod ;
   private int[] T01VO3_A4031CCTCod ;
   private short[] T01VO3_A4034CCTLin ;
   private String[] T01VO3_A4058CCFColNom ;
   private int[] T01VO3_A4059CCFColNum ;
   private String[] T01VO18_A396EmprCod ;
   private int[] T01VO18_A252CliCod ;
   private String[] T01VO18_A65ArtCod ;
   private int[] T01VO18_A4031CCTCod ;
   private short[] T01VO18_A4034CCTLin ;
   private String[] T01VO18_A4058CCFColNom ;
   private int[] T01VO18_A4059CCFColNum ;
   private String[] T01VO19_A396EmprCod ;
   private int[] T01VO19_A252CliCod ;
   private String[] T01VO19_A65ArtCod ;
   private int[] T01VO19_A4031CCTCod ;
   private short[] T01VO19_A4034CCTLin ;
   private String[] T01VO19_A4058CCFColNom ;
   private int[] T01VO19_A4059CCFColNum ;
   private String[] T01VO2_A4060CCSVal ;
   private boolean[] T01VO2_n4060CCSVal ;
   private String[] T01VO2_A11482CCSMin ;
   private boolean[] T01VO2_n11482CCSMin ;
   private String[] T01VO2_A11483CCSMax ;
   private boolean[] T01VO2_n11483CCSMax ;
   private byte[] T01VO2_A11530CCSAuto ;
   private String[] T01VO2_A11531CCSVCod ;
   private java.math.BigDecimal[] T01VO2_A11532CCSVTol ;
   private String[] T01VO2_A13247CCSMetodo ;
   private boolean[] T01VO2_n13247CCSMetodo ;
   private String[] T01VO2_A13248CCSEspecif ;
   private boolean[] T01VO2_n13248CCSEspecif ;
   private String[] T01VO2_A396EmprCod ;
   private int[] T01VO2_A252CliCod ;
   private String[] T01VO2_A65ArtCod ;
   private int[] T01VO2_A4031CCTCod ;
   private short[] T01VO2_A4034CCTLin ;
   private String[] T01VO2_A4058CCFColNom ;
   private int[] T01VO2_A4059CCFColNum ;
   private String[] T01VO23_A407EmprNom ;
   private boolean[] T01VO23_n407EmprNom ;
   private String[] T01VO24_A279CliNom ;
   private String[] T01VO25_A69ArtDsc ;
   private boolean[] T01VO25_n69ArtDsc ;
   private String[] T01VO26_A4036CCTDsc ;
   private String[] T01VO27_A4043CCTLinDsc ;
   private String[] T01VO27_A4044CCTLinTpoD ;
   private short[] T01VO27_A4045CCTLinLgoD ;
   private String[] T01VO27_A4046CCTLinPict ;
   private String[] T01VO28_A396EmprCod ;
   private int[] T01VO28_A252CliCod ;
   private String[] T01VO28_A65ArtCod ;
   private String[] T01VO28_A4058CCFColNom ;
   private int[] T01VO28_A4059CCFColNum ;
   private int[] T01VO28_A4031CCTCod ;
   private short[] T01VO28_A4034CCTLin ;
   private String[] T01VO29_A396EmprCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class controlcalidad_ccsta__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class controlcalidad_ccsta__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class controlcalidad_ccsta__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class controlcalidad_ccsta__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class controlcalidad_ccsta__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01VO2", "SELECT CCSVal, CCSMin, CCSMax, CCSAuto, CCSVCod, CCSVTol, CCSMetodo, CCSEspecif, EmprCod, CliCod, ArtCod, CCTCod, CCTLin, CCFColNom, CCFColNum FROM TXPCCSta WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND CCFColNom = ? AND CCFColNum = ? AND CCTCod = ? AND CCTLin = ?  FOR UPDATE OF CCSVal, CCSMin, CCSMax, CCSAuto, CCSVCod, CCSVTol, CCSMetodo, CCSEspecif NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01VO3", "SELECT CCSVal, CCSMin, CCSMax, CCSAuto, CCSVCod, CCSVTol, CCSMetodo, CCSEspecif, EmprCod, CliCod, ArtCod, CCTCod, CCTLin, CCFColNom, CCFColNum FROM TXPCCSta WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND CCFColNom = ? AND CCFColNum = ? AND CCTCod = ? AND CCTLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01VO4", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01VO5", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01VO6", "SELECT ArtDsc FROM TXPARTICU WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01VO7", "SELECT CCTDsc FROM TXPCCDef WHERE EmprCod = ? AND CCTCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01VO8", "SELECT CCTLinDsc, CCTLinTpoD, CCTLinLgoD, CCTLinPict FROM TXPCCDef1 WHERE EmprCod = ? AND CCTCod = ? AND CCTLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01VO9", "SELECT EmprCod FROM TXPCCSer1 WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND CCFColNom = ? AND CCFColNum = ? AND CCTCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01VO10", "SELECT /*+ FIRST_ROWS(100) */ T2.EmprNom, T3.CliNom, T4.ArtDsc, T5.CCTDsc, T6.CCTLinDsc, T6.CCTLinTpoD, T6.CCTLinLgoD, T6.CCTLinPict, TM1.CCSVal, TM1.CCSMin, TM1.CCSMax, TM1.CCSAuto, TM1.CCSVCod, TM1.CCSVTol, TM1.CCSMetodo, TM1.CCSEspecif, TM1.EmprCod, TM1.CliCod, TM1.ArtCod, TM1.CCTCod, TM1.CCTLin, TM1.CCFColNom, TM1.CCFColNum FROM (((((TXPCCSta TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = TM1.EmprCod AND T3.CliCod = TM1.CliCod) INNER JOIN TXPARTICU T4 ON T4.EmprCod = TM1.EmprCod AND T4.CliCod = TM1.CliCod AND T4.ArtCod = TM1.ArtCod) INNER JOIN TXPCCDef T5 ON T5.EmprCod = TM1.EmprCod AND T5.CCTCod = TM1.CCTCod) INNER JOIN TXPCCDef1 T6 ON T6.EmprCod = TM1.EmprCod AND T6.CCTCod = TM1.CCTCod AND T6.CCTLin = TM1.CCTLin) WHERE TM1.EmprCod = ? and TM1.CliCod = ? and TM1.ArtCod = ? and TM1.CCTCod = ? and TM1.CCTLin = ? and TM1.CCFColNom = ? and TM1.CCFColNum = ? ORDER BY TM1.EmprCod, TM1.CliCod, TM1.ArtCod, TM1.CCFColNom, TM1.CCFColNum, TM1.CCTCod, TM1.CCTLin ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01VO11", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01VO12", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01VO13", "SELECT ArtDsc FROM TXPARTICU WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01VO14", "SELECT CCTDsc FROM TXPCCDef WHERE EmprCod = ? AND CCTCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01VO15", "SELECT EmprCod FROM TXPCCSer1 WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND CCFColNom = ? AND CCFColNum = ? AND CCTCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01VO16", "SELECT CCTLinDsc, CCTLinTpoD, CCTLinLgoD, CCTLinPict FROM TXPCCDef1 WHERE EmprCod = ? AND CCTCod = ? AND CCTLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01VO17", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, ArtCod, CCFColNom, CCFColNum, CCTCod, CCTLin FROM TXPCCSta WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND CCFColNom = ? AND CCFColNum = ? AND CCTCod = ? AND CCTLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01VO18", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, ArtCod, CCTCod, CCTLin, CCFColNom, CCFColNum FROM TXPCCSta WHERE ( EmprCod > ? or EmprCod = ? and CliCod > ? or CliCod = ? and EmprCod = ? and ArtCod > ? or ArtCod = ? and CliCod = ? and EmprCod = ? and CCTCod > ? or CCTCod = ? and ArtCod = ? and CliCod = ? and EmprCod = ? and CCTLin > ? or CCTLin = ? and CCTCod = ? and ArtCod = ? and CliCod = ? and EmprCod = ? and CCFColNom > ? or CCFColNom = ? and CCTLin = ? and CCTCod = ? and ArtCod = ? and CliCod = ? and EmprCod = ? and CCFColNum > ?) ORDER BY EmprCod, CliCod, ArtCod, CCFColNom, CCFColNum, CCTCod, CCTLin) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01VO19", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, ArtCod, CCTCod, CCTLin, CCFColNom, CCFColNum FROM TXPCCSta WHERE ( EmprCod < ? or EmprCod = ? and CliCod < ? or CliCod = ? and EmprCod = ? and ArtCod < ? or ArtCod = ? and CliCod = ? and EmprCod = ? and CCTCod < ? or CCTCod = ? and ArtCod = ? and CliCod = ? and EmprCod = ? and CCTLin < ? or CCTLin = ? and CCTCod = ? and ArtCod = ? and CliCod = ? and EmprCod = ? and CCFColNom < ? or CCFColNom = ? and CCTLin = ? and CCTCod = ? and ArtCod = ? and CliCod = ? and EmprCod = ? and CCFColNum < ?) ORDER BY EmprCod DESC, CliCod DESC, ArtCod DESC, CCFColNom DESC, CCFColNum DESC, CCTCod DESC, CCTLin DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01VO20", "INSERT INTO TXPCCSta(CCSVal, CCSMin, CCSMax, CCSAuto, CCSVCod, CCSVTol, CCSMetodo, CCSEspecif, EmprCod, CliCod, ArtCod, CCTCod, CCTLin, CCFColNom, CCFColNum) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPCCSta")
         ,new UpdateCursor("T01VO21", "UPDATE TXPCCSta SET CCSVal=?, CCSMin=?, CCSMax=?, CCSAuto=?, CCSVCod=?, CCSVTol=?, CCSMetodo=?, CCSEspecif=?  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND CCFColNom = ? AND CCFColNum = ? AND CCTCod = ? AND CCTLin = ?", GX_NOMASK, "TXPCCSta")
         ,new UpdateCursor("T01VO22", "DELETE FROM TXPCCSta  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND CCFColNom = ? AND CCFColNum = ? AND CCTCod = ? AND CCTLin = ?", GX_NOMASK, "TXPCCSta")
         ,new ForEachCursor("T01VO23", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01VO24", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01VO25", "SELECT ArtDsc FROM TXPARTICU WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01VO26", "SELECT CCTDsc FROM TXPCCDef WHERE EmprCod = ? AND CCTCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01VO27", "SELECT CCTLinDsc, CCTLinTpoD, CCTLinLgoD, CCTLinPict FROM TXPCCDef1 WHERE EmprCod = ? AND CCTCod = ? AND CCTLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01VO28", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, CliCod, ArtCod, CCFColNom, CCFColNum, CCTCod, CCTLin FROM TXPCCSta ORDER BY EmprCod, CliCod, ArtCod, CCFColNom, CCFColNum, CCTCod, CCTLin ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01VO29", "SELECT EmprCod FROM TXPCCSer1 WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND CCFColNom = ? AND CCFColNum = ? AND CCTCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 40);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 40);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((byte[]) buf[6])[0] = rslt.getByte(4);
               ((String[]) buf[7])[0] = rslt.getString(5, 10);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(6,2);
               ((String[]) buf[9])[0] = rslt.getString(7, 30);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(8, 30);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(9, 3);
               ((int[]) buf[14])[0] = rslt.getInt(10);
               ((String[]) buf[15])[0] = rslt.getString(11, 16);
               ((int[]) buf[16])[0] = rslt.getInt(12);
               ((short[]) buf[17])[0] = rslt.getShort(13);
               ((String[]) buf[18])[0] = rslt.getString(14, 13);
               ((int[]) buf[19])[0] = rslt.getInt(15);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 40);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 40);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((byte[]) buf[6])[0] = rslt.getByte(4);
               ((String[]) buf[7])[0] = rslt.getString(5, 10);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(6,2);
               ((String[]) buf[9])[0] = rslt.getString(7, 30);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(8, 30);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(9, 3);
               ((int[]) buf[14])[0] = rslt.getInt(10);
               ((String[]) buf[15])[0] = rslt.getString(11, 16);
               ((int[]) buf[16])[0] = rslt.getInt(12);
               ((short[]) buf[17])[0] = rslt.getShort(13);
               ((String[]) buf[18])[0] = rslt.getString(14, 13);
               ((int[]) buf[19])[0] = rslt.getInt(15);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 40);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 30);
               ((String[]) buf[3])[0] = rslt.getString(3, 26);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 30);
               ((String[]) buf[6])[0] = rslt.getString(5, 30);
               ((String[]) buf[7])[0] = rslt.getString(6, 1);
               ((short[]) buf[8])[0] = rslt.getShort(7);
               ((String[]) buf[9])[0] = rslt.getString(8, 40);
               ((String[]) buf[10])[0] = rslt.getString(9, 40);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(10, 40);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(11, 40);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((byte[]) buf[16])[0] = rslt.getByte(12);
               ((String[]) buf[17])[0] = rslt.getString(13, 10);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(14,2);
               ((String[]) buf[19])[0] = rslt.getString(15, 30);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(16, 30);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(17, 3);
               ((int[]) buf[24])[0] = rslt.getInt(18);
               ((String[]) buf[25])[0] = rslt.getString(19, 16);
               ((int[]) buf[26])[0] = rslt.getInt(20);
               ((short[]) buf[27])[0] = rslt.getShort(21);
               ((String[]) buf[28])[0] = rslt.getString(22, 13);
               ((int[]) buf[29])[0] = rslt.getInt(23);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 40);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 13);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 13);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 40);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 27 :
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
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setString(6, (String)parms[5], 13);
               stmt.setInt(7, ((Number) parms[6]).intValue());
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
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 3);
               stmt.setString(6, (String)parms[5], 16);
               stmt.setString(7, (String)parms[6], 16);
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setString(9, (String)parms[8], 3);
               stmt.setInt(10, ((Number) parms[9]).intValue());
               stmt.setInt(11, ((Number) parms[10]).intValue());
               stmt.setString(12, (String)parms[11], 16);
               stmt.setInt(13, ((Number) parms[12]).intValue());
               stmt.setString(14, (String)parms[13], 3);
               stmt.setShort(15, ((Number) parms[14]).shortValue());
               stmt.setShort(16, ((Number) parms[15]).shortValue());
               stmt.setInt(17, ((Number) parms[16]).intValue());
               stmt.setString(18, (String)parms[17], 16);
               stmt.setInt(19, ((Number) parms[18]).intValue());
               stmt.setString(20, (String)parms[19], 3);
               stmt.setString(21, (String)parms[20], 13);
               stmt.setString(22, (String)parms[21], 13);
               stmt.setShort(23, ((Number) parms[22]).shortValue());
               stmt.setInt(24, ((Number) parms[23]).intValue());
               stmt.setString(25, (String)parms[24], 16);
               stmt.setInt(26, ((Number) parms[25]).intValue());
               stmt.setString(27, (String)parms[26], 3);
               stmt.setInt(28, ((Number) parms[27]).intValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 3);
               stmt.setString(6, (String)parms[5], 16);
               stmt.setString(7, (String)parms[6], 16);
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setString(9, (String)parms[8], 3);
               stmt.setInt(10, ((Number) parms[9]).intValue());
               stmt.setInt(11, ((Number) parms[10]).intValue());
               stmt.setString(12, (String)parms[11], 16);
               stmt.setInt(13, ((Number) parms[12]).intValue());
               stmt.setString(14, (String)parms[13], 3);
               stmt.setShort(15, ((Number) parms[14]).shortValue());
               stmt.setShort(16, ((Number) parms[15]).shortValue());
               stmt.setInt(17, ((Number) parms[16]).intValue());
               stmt.setString(18, (String)parms[17], 16);
               stmt.setInt(19, ((Number) parms[18]).intValue());
               stmt.setString(20, (String)parms[19], 3);
               stmt.setString(21, (String)parms[20], 13);
               stmt.setString(22, (String)parms[21], 13);
               stmt.setShort(23, ((Number) parms[22]).shortValue());
               stmt.setInt(24, ((Number) parms[23]).intValue());
               stmt.setString(25, (String)parms[24], 16);
               stmt.setInt(26, ((Number) parms[25]).intValue());
               stmt.setString(27, (String)parms[26], 3);
               stmt.setInt(28, ((Number) parms[27]).intValue());
               return;
            case 18 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 40);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 40);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 40);
               }
               stmt.setByte(4, ((Number) parms[6]).byteValue());
               stmt.setString(5, (String)parms[7], 10);
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[8], 2);
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[10], 30);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[12], 30);
               }
               stmt.setString(9, (String)parms[13], 3);
               stmt.setInt(10, ((Number) parms[14]).intValue());
               stmt.setString(11, (String)parms[15], 16);
               stmt.setInt(12, ((Number) parms[16]).intValue());
               stmt.setShort(13, ((Number) parms[17]).shortValue());
               stmt.setString(14, (String)parms[18], 13);
               stmt.setInt(15, ((Number) parms[19]).intValue());
               return;
            case 19 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 40);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 40);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 40);
               }
               stmt.setByte(4, ((Number) parms[6]).byteValue());
               stmt.setString(5, (String)parms[7], 10);
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[8], 2);
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[10], 30);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[12], 30);
               }
               stmt.setString(9, (String)parms[13], 3);
               stmt.setInt(10, ((Number) parms[14]).intValue());
               stmt.setString(11, (String)parms[15], 16);
               stmt.setString(12, (String)parms[16], 13);
               stmt.setInt(13, ((Number) parms[17]).intValue());
               stmt.setInt(14, ((Number) parms[18]).intValue());
               stmt.setShort(15, ((Number) parms[19]).shortValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               return;
      }
   }

}

